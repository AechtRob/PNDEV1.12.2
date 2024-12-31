package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraJinyunpelta;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelJinyunpelta extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
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
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer LEFTCLUB;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer RIGHTCLUB;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer cube_r96;
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer cube_r99;
    private final AdvancedModelRenderer cube_r100;
    private final AdvancedModelRenderer cube_r101;
    private final AdvancedModelRenderer cube_r102;
    private final AdvancedModelRenderer cube_r103;
    private final AdvancedModelRenderer cube_r104;
    private final AdvancedModelRenderer cube_r105;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r106;
    private final AdvancedModelRenderer cube_r107;
    private final AdvancedModelRenderer cube_r108;
    private final AdvancedModelRenderer cube_r109;
    private final AdvancedModelRenderer cube_r110;
    private final AdvancedModelRenderer cube_r111;
    private final AdvancedModelRenderer cube_r112;
    private final AdvancedModelRenderer cube_r113;

    private ModelAnimator animator;

    public ModelJinyunpelta() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 8.5F, 6.5F);
        this.setRotateAngle(hips, -0.1309F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 20, -6.0489F, -0.3595F, -4.1016F, 12, 10, 5, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 50, 0, -4.5489F, -0.1095F, 0.8984F, 9, 8, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-7.8489F, 1.1405F, -1.7016F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.2654F, 0.0F, -1.4399F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 49, -0.5F, 0.676F, -3.2207F, 1, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-7.8489F, 1.1405F, -1.7016F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6981F, 0.0F, -1.4399F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 71, -0.5F, 0.5321F, -2.2856F, 1, 1, 3, 0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-6.9168F, 0.8905F, 4.0673F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2752F, 0.1283F, -1.4408F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 36, -0.5F, 0.75F, -3.75F, 1, 1, 2, -0.01F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 25, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-6.9168F, 0.8905F, 4.0673F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7814F, 0.1283F, -1.4408F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 69, 66, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5489F, 0.2405F, 1.4484F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3054F, 0.0873F, -0.2182F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 76, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-5.2989F, 0.0405F, -1.1016F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5236F, 0.1745F, -0.3054F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 73, 4, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0489F, 0.1905F, -1.3516F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3927F, 0.0873F, -0.2182F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(6.819F, 0.8905F, 4.0673F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2752F, -0.1283F, 1.4408F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 36, -0.5F, 0.75F, -3.75F, 1, 1, 2, -0.01F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 25, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(6.819F, 0.8905F, 4.0673F);
        this.hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7814F, -0.1283F, 1.4408F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 69, 66, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(7.7511F, 1.1405F, -1.7016F);
        this.hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.2654F, 0.0F, 1.4399F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 49, -0.5F, 0.676F, -3.2207F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(7.7511F, 1.1405F, -1.7016F);
        this.hips.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6981F, 0.0F, 1.4399F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 71, -0.5F, 0.5321F, -2.2856F, 1, 1, 3, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(5.2011F, 0.0405F, -1.1016F);
        this.hips.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, -0.1745F, 0.3054F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 73, 4, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.4511F, 0.2405F, 1.4484F);
        this.hips.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, -0.0873F, 0.2182F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 42, 76, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.9511F, 0.1905F, -1.3516F);
        this.hips.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3927F, -0.0873F, 0.2182F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.9511F, 3.1405F, -0.6016F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1309F, -0.3927F, -0.0873F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 55, -2.25F, -1.5F, -2.0F, 4, 8, 5, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.05F, -0.5F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6981F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 51, 60, -1.75F, -0.3678F, -1.649F, 3, 7, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.3F, 5.7322F, 0.451F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 37, 0, -1.45F, -0.1768F, -1.904F, 3, 3, 3, -0.1F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(-0.15F, 1.8482F, 0.646F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3695F, 0.3272F, 0.1238F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 35, 23, -1.5948F, -0.1418F, -3.4844F, 4, 1, 4, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-5.0489F, 3.1405F, -0.6016F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1309F, 0.3927F, 0.0873F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 55, -1.75F, -1.5F, -2.0F, 4, 8, 5, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.05F, -0.5F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6981F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 51, 60, -1.25F, -0.3678F, -1.649F, 3, 7, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.3F, 5.7322F, 0.451F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 37, 0, -1.55F, -0.1768F, -1.904F, 3, 3, 3, -0.1F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.15F, 1.8482F, 0.646F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3695F, -0.3272F, -0.1238F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 35, 23, -2.4052F, -0.1418F, -3.4844F, 4, 1, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(-0.0483F, 1.6167F, 2.7476F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 43, 47, -2.5F, -1.5119F, -0.8496F, 5, 5, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.0F, -0.0119F, 4.6504F);
        this.tail1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4363F, 0.0873F, -1.3526F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 53, 71, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.25F, -1.0619F, 4.6504F);
        this.tail1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.48F, 0.1745F, -0.3054F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, -1.0619F, 1.4004F);
        this.tail1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3927F, 0.0F, -0.1309F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 65, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.25F, 0.2381F, 1.4004F);
        this.tail1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.48F, 0.0436F, -1.2217F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 58, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.0F, -0.0119F, 4.6504F);
        this.tail1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4363F, -0.0873F, 1.3526F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 53, 71, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.25F, 0.2381F, 1.4004F);
        this.tail1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.48F, -0.0436F, 1.2217F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 58, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.25F, -1.0619F, 4.6504F);
        this.tail1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.48F, -0.1745F, 0.3054F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.5F, -1.0619F, 1.4004F);
        this.tail1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3927F, 0.0F, 0.1309F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 65, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.8095F, 6.2249F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 47, -1.5F, -0.4668F, -1.1453F, 3, 3, 9, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.4F, 1.0332F, 5.8547F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6109F, 0.0F, -1.2654F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 60, 11, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.6F, -0.2168F, 5.8547F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.5236F, 0.0F, -0.5236F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 61, 60, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.45F, -0.0168F, 2.1047F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4363F, 0.0F, -0.5236F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, 1.0332F, 2.3547F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6109F, 0.0F, -1.2654F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 21, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, 1.0332F, 2.3547F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.6109F, 0.0F, 1.2654F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 21, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.4F, 1.0332F, 5.8547F);
        this.tail2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.6109F, 0.0F, 1.2654F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 60, 11, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.6F, -0.2168F, 5.8547F);
        this.tail2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.5236F, 0.0F, 0.5236F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 61, 60, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.45F, -0.0168F, 2.1047F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4363F, 0.0F, 0.5236F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.11F, 7.4423F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 32, 7, -1.0F, -0.2654F, -0.9608F, 2, 2, 13, -0.1F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.65F, 0.6346F, 5.2892F);
        this.tail3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4363F, 0.0F, -1.3963F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 20, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.8F, 0.7346F, 1.7892F);
        this.tail3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.6109F, 0.0F, -1.2654F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 55, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.65F, 0.6346F, 5.2892F);
        this.tail3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.4363F, 0.0F, 1.3963F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 20, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.8F, 0.7346F, 1.7892F);
        this.tail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.6109F, 0.0F, 1.2654F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 55, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.LEFTCLUB = new AdvancedModelRenderer(this);
        this.LEFTCLUB.setRotationPoint(0.0F, 0.7346F, 12.0392F);
        this.tail3.addChild(LEFTCLUB);
        this.LEFTCLUB.cubeList.add(new ModelBox(LEFTCLUB, 7, 80, 0.15F, -0.5F, -2.25F, 2, 1, 1, 0.02F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LEFTCLUB.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.1309F, -0.0873F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 69, -0.15F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LEFTCLUB.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.1309F, 0.0873F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 11, 69, -0.15F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.7673F, 0.5F, -0.3261F);
        this.LEFTCLUB.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.8727F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 5, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(2.15F, 0.5F, -1.25F);
        this.LEFTCLUB.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.3927F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 80, 4, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(2.15F, 0.5F, -2.25F);
        this.LEFTCLUB.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.3491F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 73, 0, -2.0F, -1.0F, -2.0F, 2, 1, 2, 0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.466F, 0.5F, -4.1294F);
        this.LEFTCLUB.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.6109F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 19, 60, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.RIGHTCLUB = new AdvancedModelRenderer(this);
        this.RIGHTCLUB.setRotationPoint(0.0F, 0.7346F, 12.0392F);
        this.tail3.addChild(RIGHTCLUB);
        this.RIGHTCLUB.cubeList.add(new ModelBox(RIGHTCLUB, 7, 80, -2.15F, -0.5F, -2.25F, 2, 1, 1, 0.02F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RIGHTCLUB.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.1309F, 0.0873F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 69, -0.85F, 0.0F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RIGHTCLUB.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.1309F, -0.0873F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 11, 69, -0.85F, -1.0F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.7673F, 0.5F, -0.3261F);
        this.RIGHTCLUB.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.8727F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 5, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-2.15F, 0.5F, -1.25F);
        this.RIGHTCLUB.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.3927F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 80, 4, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.01F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-2.15F, 0.5F, -2.25F);
        this.RIGHTCLUB.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.3491F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 73, 0, 0.0F, -1.0F, -2.0F, 2, 1, 2, 0.01F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.466F, 0.5F, -4.1294F);
        this.RIGHTCLUB.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.6109F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 19, 60, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.0489F, 1.8905F, -3.6016F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.9619F, -2.4287F, -7.4742F, 14, 11, 8, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-8.2279F, 1.0713F, -5.5742F);
        this.body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 1.0472F, 0.0F, -1.309F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 77, 78, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-8.2279F, 1.0713F, -5.5742F);
        this.body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 1.6581F, 0.0F, -1.309F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 78, 58, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-7.7279F, 0.8213F, -2.5742F);
        this.body.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.829F, 0.0F, -1.309F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 78, 52, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-7.7279F, 0.8213F, -2.5742F);
        this.body.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 1.4399F, 0.0F, -1.309F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 77, 25, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-7.5279F, 0.3213F, 0.3258F);
        this.body.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.7418F, 0.0F, -1.309F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 43, 47, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-7.5279F, 0.3213F, 0.3258F);
        this.body.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 1.3526F, 0.0F, -1.309F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 72, 76, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-6.1119F, -1.8787F, -0.0242F);
        this.body.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.5668F, -0.0234F, -0.3995F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 7, 69, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-2.4619F, -2.0787F, -0.4742F);
        this.body.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.48F, 0.0873F, -0.1745F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 73, 9, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-2.7119F, -2.0787F, -3.2242F);
        this.body.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.5236F, 0.0F, -0.2618F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 35, 76, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-6.4119F, -1.7787F, -3.0242F);
        this.body.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.5672F, 0.0F, -0.3927F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 78, 7, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-6.4119F, -1.7787F, -6.0242F);
        this.body.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.5767F, -0.0883F, -0.4842F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 78, 12, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-2.5119F, -2.0787F, -5.9742F);
        this.body.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.5236F, -0.0873F, -0.2618F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 14, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(7.6041F, 0.3213F, 0.3258F);
        this.body.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.7418F, 0.0F, 1.309F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 43, 47, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(7.6041F, 0.3213F, 0.3258F);
        this.body.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 1.3526F, 0.0F, 1.309F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 72, 76, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(7.8041F, 0.8213F, -2.5742F);
        this.body.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.829F, 0.0F, 1.309F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 78, 52, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(7.8041F, 0.8213F, -2.5742F);
        this.body.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 1.4399F, 0.0F, 1.309F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 77, 25, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(8.3041F, 1.0713F, -5.5742F);
        this.body.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 1.6581F, 0.0F, 1.309F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 78, 58, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(8.3041F, 1.0713F, -5.5742F);
        this.body.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 1.0472F, 0.0F, 1.309F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 77, 78, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(6.4881F, -1.7787F, -6.0242F);
        this.body.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.5767F, 0.0883F, 0.4842F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 78, 12, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(6.1881F, -1.8787F, -0.0242F);
        this.body.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.5668F, 0.0234F, 0.3995F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 7, 69, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(6.4881F, -1.7787F, -3.0242F);
        this.body.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.5672F, 0.0F, 0.3927F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 78, 7, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(2.5381F, -2.0787F, -0.4742F);
        this.body.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.48F, -0.0873F, 0.1745F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 73, 9, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(2.7881F, -2.0787F, -3.2242F);
        this.body.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.5236F, 0.0F, 0.2618F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 35, 76, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(2.5881F, -2.0787F, -5.9742F);
        this.body.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.5236F, 0.0873F, 0.2618F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 14, 75, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0381F, -0.6787F, -6.4742F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.3054F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 36, -4.5F, -1.5507F, -6.9537F, 9, 8, 4, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 30, 31, -6.0F, -1.8007F, -4.9537F, 12, 10, 5, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-2.25F, -1.4507F, -2.2037F);
        this.chest.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.5236F, -0.1309F, -0.1745F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 76, 65, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-5.5F, -1.3007F, -2.2037F);
        this.chest.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.9474F, -0.1468F, -0.5792F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 76, 37, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-6.9071F, 1.6993F, -2.2966F);
        this.chest.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 1.5272F, -0.2618F, -1.3526F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 78, 47, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(-6.9071F, 1.6993F, -2.2966F);
        this.chest.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.8727F, -0.2618F, -1.3526F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 77, 21, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, true));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(-6.1571F, 0.4493F, -5.1966F);
        this.chest.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 1.9635F, -0.2618F, -1.2654F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 78, 42, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(-6.1571F, 0.4493F, -5.1966F);
        this.chest.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 1.309F, -0.2618F, -1.2654F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 79, 70, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(-1.75F, -1.2507F, -4.9537F);
        this.chest.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.5672F, -0.2618F, -0.2182F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 49, 76, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(6.1571F, 0.4493F, -5.1966F);
        this.chest.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 1.309F, 0.2618F, 1.2654F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 79, 70, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(6.1571F, 0.4493F, -5.1966F);
        this.chest.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 1.9635F, 0.2618F, 1.2654F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 78, 42, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(6.9071F, 1.6993F, -2.2966F);
        this.chest.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 1.5272F, 0.2618F, 1.3526F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 78, 47, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(6.9071F, 1.6993F, -2.2966F);
        this.chest.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.8727F, 0.2618F, 1.3526F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 77, 21, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(5.5F, -1.3007F, -2.2037F);
        this.chest.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.9474F, 0.1468F, 0.5792F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 76, 37, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(2.25F, -1.4507F, -2.2037F);
        this.chest.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.5236F, 0.1309F, 0.1745F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 76, 65, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(1.75F, -1.2507F, -4.9537F);
        this.chest.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.5672F, 0.2618F, 0.2182F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 49, 76, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(4.5F, 3.6993F, -5.2037F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0948F, 0.456F, -0.1553F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 36, 60, -1.5F, -0.5F, -2.05F, 3, 6, 4, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 4.75F, 0.9F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6981F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 62, 44, -0.75F, -0.2184F, -1.8243F, 2, 6, 3, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 64, 60, -1.25F, -0.2184F, -1.8243F, 1, 6, 3, -0.01F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 5.0816F, 0.1757F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2875F, -0.4205F, -0.1201F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 0, 49, -2.25F, -0.05F, -3.0F, 4, 1, 4, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-4.5F, 3.6993F, -5.2037F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0948F, -0.456F, 0.1553F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 36, 60, -1.5F, -0.5F, -2.05F, 3, 6, 4, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 4.75F, 0.9F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.6981F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 62, 44, -1.25F, -0.2184F, -1.8243F, 2, 6, 3, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 64, 60, 0.25F, -0.2184F, -1.8243F, 1, 6, 3, -0.01F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 5.0816F, 0.1757F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2875F, 0.4205F, 0.1201F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 0, 49, -1.75F, -0.05F, -3.0F, 4, 1, 4, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.0507F, -5.9537F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1309F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 58, 18, -2.0F, -1.0F, -4.0F, 4, 5, 5, 0.0F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(-1.75F, 0.75F, -1.75F);
        this.neck1.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.7854F, 0.0F, -1.2654F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 73, 49, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(-1.25F, -0.75F, -1.75F);
        this.neck1.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.7854F, 0.0F, -0.5236F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 73, 60, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(1.75F, 0.75F, -1.75F);
        this.neck1.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.7854F, 0.0F, 1.2654F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 73, 49, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(1.25F, -0.75F, -1.75F);
        this.neck1.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -0.7854F, 0.0F, 0.5236F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 73, 60, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.5F, 0.25F, -4.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.48F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 19, 60, -2.0F, -1.2F, -3.0F, 3, 4, 5, -0.1F, false));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(0.0F, 3.3261F, -4.4395F);
        this.neck2.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.0785F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 34, 47, -1.5F, -0.55F, 2.2F, 2, 1, 4, -0.02F, false));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(-1.25F, -0.75F, -1.0F);
        this.neck2.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.7854F, 0.0F, -0.6109F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 73, 44, -0.5F, -0.95F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(-1.75F, 0.5F, -0.5F);
        this.neck2.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.829F, 0.0F, -1.2217F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 73, 29, -0.5F, -0.95F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(0.75F, 0.5F, -0.5F);
        this.neck2.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -0.829F, 0.0F, 1.2217F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 73, 29, -0.5F, -0.95F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(0.25F, -0.75F, -1.0F);
        this.neck2.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.7854F, 0.0F, 0.6109F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 73, 44, -0.5F, -0.95F, -1.0F, 1, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.6109F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 50, 11, -2.0F, -1.0F, -2.0F, 3, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 50, 17, -2.0F, -0.5F, -1.5F, 3, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 53, -1.5F, -1.0F, -3.0F, 2, 1, 1, -0.01F, false));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(0.5F, 1.6578F, -3.6608F);
        this.head.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.6981F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 72, 72, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.02F, false));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(0.5F, 0.0078F, -4.6608F);
        this.head.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.0F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 47, 60, -2.0F, 0.65F, 0.0F, 2, 1, 1, 0.03F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 33, 71, -2.0F, 0.0F, 0.0F, 2, 1, 3, 0.01F, false));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(0.5F, -0.6993F, -3.9537F);
        this.head.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.7854F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 78, 16, -2.0F, 0.0F, -1.0F, 2, 1, 1, -0.01F, false));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(0.5F, -1.0F, -3.0F);
        this.head.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.3054F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 80, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(-2.0F, -1.1F, -2.0F);
        this.head.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.1959F, -0.3798F, 0.032F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 61, 70, 0.0F, 0.0F, 0.0F, 2, 1, 3, -0.1F, true));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(-1.85F, 1.25F, -2.25F);
        this.head.addChild(cube_r99);
        this.setRotateAngle(cube_r99, -0.1315F, -0.4994F, -0.2071F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 65, 39, 0.0F, -1.15F, 0.0F, 2, 1, 3, -0.1F, true));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(-2.0F, -1.0F, -2.0F);
        this.head.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.1828F, -0.3006F, -0.0547F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 0, 75, 0.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, true));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(1.0F, -1.0F, -2.0F);
        this.head.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.1828F, 0.3006F, 0.0547F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 0, 75, -1.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(0.0F, 0.75F, 1.0F);
        this.head.addChild(cube_r102);
        this.setRotateAngle(cube_r102, -0.2269F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 65, 34, -2.0F, 0.0F, -3.0F, 3, 1, 3, -0.01F, false));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(0.85F, 1.25F, -2.25F);
        this.head.addChild(cube_r103);
        this.setRotateAngle(cube_r103, -0.1315F, 0.4994F, 0.2071F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 65, 39, -2.0F, -1.15F, 0.0F, 2, 1, 3, -0.1F, false));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(1.0F, -1.1F, -2.0F);
        this.head.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.1959F, 0.3798F, -0.032F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 61, 70, -2.0F, 0.0F, 0.0F, 2, 1, 3, -0.1F, false));

        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(0.5F, -1.0F, -2.0F);
        this.head.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.1309F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 68, 54, -2.0F, 0.0F, -0.25F, 2, 2, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.5F, 0.5F);
        this.head.addChild(jaw);


        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(0.0F, 0.6256F, -3.4761F);
        this.jaw.addChild(cube_r106);
        this.setRotateAngle(cube_r106, -0.6196F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 72, 16, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.02F, false));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(0.0F, 0.7048F, -4.1213F);
        this.jaw.addChild(cube_r107);
        this.setRotateAngle(cube_r107, -0.0087F, 0.0F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 13, 49, -1.5F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(-1.0F, 0.6377F, -3.5754F);
        this.jaw.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.128F, -0.3031F, -0.0384F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 78, 32, -0.5F, -1.0F, -0.7F, 1, 1, 2, -0.03F, true));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, 0.6377F, -3.5754F);
        this.jaw.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.128F, 0.3031F, 0.0384F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 78, 32, -0.5F, -1.0F, -0.7F, 1, 1, 2, -0.03F, false));

        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(0.0F, -0.4392F, -2.5993F);
        this.jaw.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.1222F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 31, 60, -1.5F, -0.05F, -2.0F, 2, 1, 2, -0.02F, false));

        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(0.0F, -0.4485F, -2.6572F);
        this.jaw.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.5323F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 22, 70, -2.0F, -2.0F, 0.0F, 3, 2, 2, -0.03F, false));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(0.0F, 0.5501F, -2.9817F);
        this.jaw.addChild(cube_r112);
        this.setRotateAngle(cube_r112, -0.3142F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 60, 29, -2.0F, -1.05F, 0.0F, 3, 1, 3, -0.03F, false));

        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(0.0F, -0.4505F, -2.6481F);
        this.jaw.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.0524F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 63, 11, -2.0F, -0.05F, 0.0F, 3, 1, 3, -0.02F, false));
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
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.05F;
        this.hips.offsetX = 0.35F;
        this.hips.rotateAngleY = (float)Math.toRadians(150);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.8F;
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

        EntityPrehistoricFloraJinyunpelta entityYuxi = (EntityPrehistoricFloraJinyunpelta) e;

        if (entityYuxi.getAnimation() == entityYuxi.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head};
        entityYuxi.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityYuxi.getAnimation() == entityYuxi.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityYuxi.isReallyInWater()) {

                if (f3 == 0.0F || !entityYuxi.getIsMoving()) {
                    if (entityYuxi.getAnimation() != entityYuxi.EAT_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.DRINK_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityYuxi.getIsFast()) { //Running


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

        EntityPrehistoricFloraJinyunpelta ee = (EntityPrehistoricFloraJinyunpelta) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
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
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinyunpelta entity = (EntityPrehistoricFloraJinyunpelta) entitylivingbaseIn;
        int animCycle = 43;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-9.01465-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.97488-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.24979-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = -9.01465 + (((tickAnim - 13) / 19) * (-3.21478-(-9.01465)));
            yy = 3.97488 + (((tickAnim - 13) / 19) * (-1.63782-(3.97488)));
            zz = -0.24979 + (((tickAnim - 13) / 19) * (0.37871-(-0.24979)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = -3.21478 + (((tickAnim - 32) / 11) * (0-(-3.21478)));
            yy = -1.63782 + (((tickAnim - 32) / 11) * (0-(-1.63782)));
            zz = 0.37871 + (((tickAnim - 32) / 11) * (0-(0.37871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 3.25 + (((tickAnim - 13) / 10) * (-7.02-(3.25)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = -7.02 + (((tickAnim - 23) / 9) * (-7.02-(-7.02)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            yy = -7.02 + (((tickAnim - 32) / 11) * (0-(-7.02)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -8 + (((tickAnim - 13) / 10) * (4.10236-(-8)));
            yy = 0 + (((tickAnim - 13) / 10) * (-4.40144-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (1.00618-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 4.10236 + (((tickAnim - 23) / 9) * (-7.08273-(4.10236)));
            yy = -4.40144 + (((tickAnim - 23) / 9) * (-7.703-(-4.40144)));
            zz = 1.00618 + (((tickAnim - 23) / 9) * (-5.00408-(1.00618)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = -7.08273 + (((tickAnim - 32) / 7) * (-2.9151-(-7.08273)));
            yy = -7.703 + (((tickAnim - 32) / 7) * (0.9453+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-15-(-7.703)));
            zz = -5.00408 + (((tickAnim - 32) / 7) * (2.60337-(-5.00408)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -2.9151 + (((tickAnim - 39) / 4) * (0-(-2.9151)));
            yy = 0.9453+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-15 + (((tickAnim - 39) / 4) * (0-(0.9453+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-15)));
            zz = 2.60337 + (((tickAnim - 39) / 4) * (0-(2.60337)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 18.75 + (((tickAnim - 13) / 4) * (0-(18.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (15.5-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 15.5 + (((tickAnim - 33) / 5) * (0-(15.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinyunpelta entity = (EntityPrehistoricFloraJinyunpelta) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 15) / 15) * (-15.5-(13.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 30) / 20) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 23.75 + (((tickAnim - 15) / 5) * (4.58-(23.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.58 + (((tickAnim - 20) / 10) * (-9-(4.58)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 30) / 20) * (0-(-9)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.62-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.13-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.62 + (((tickAnim - 20) / 10) * (-0.2-(0.62)));
            zz = 0.13 + (((tickAnim - 20) / 10) * (0.2-(0.13)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.2 + (((tickAnim - 30) / 20) * (0-(-0.2)));
            zz = 0.2 + (((tickAnim - 30) / 20) * (0-(0.2)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-28.92-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -28.92 + (((tickAnim - 20) / 10) * (11.75-(-28.92)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 30) / 20) * (0-(11.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-23-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 26 + (((tickAnim - 15) / 5) * (54.8644-(26)));
            yy = -23 + (((tickAnim - 15) / 5) * (-19.27267-(-23)));
            zz = 0 + (((tickAnim - 15) / 5) * (-1.25236-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 54.8644 + (((tickAnim - 20) / 10) * (9.8432-(54.8644)));
            yy = -19.27267 + (((tickAnim - 20) / 10) * (-11.818-(-19.27267)));
            zz = -1.25236 + (((tickAnim - 20) / 10) * (-3.75707-(-1.25236)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.8432 + (((tickAnim - 30) / 20) * (0-(9.8432)));
            yy = -11.818 + (((tickAnim - 30) / 20) * (0-(-11.818)));
            zz = -3.75707 + (((tickAnim - 30) / 20) * (0-(-3.75707)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.925-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 15) / 5) * (-0.33-(-0.5)));
            yy = -0.325 + (((tickAnim - 15) / 5) * (1.275-(-0.325)));
            zz = -0.925 + (((tickAnim - 15) / 5) * (-0.75-(-0.925)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.33 + (((tickAnim - 20) / 10) * (0-(-0.33)));
            yy = 1.275 + (((tickAnim - 20) / 10) * (0-(1.275)));
            zz = -0.75 + (((tickAnim - 20) / 10) * (0-(-0.75)));
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
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinyunpelta entity = (EntityPrehistoricFloraJinyunpelta) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -5.75 + (((tickAnim - 18) / 17) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 35) / 15) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.825-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = -2.825 + (((tickAnim - 18) / 17) * (-2.825-(-2.825)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.825 + (((tickAnim - 35) / 15) * (0-(-2.825)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -8.5 + (((tickAnim - 18) / 17) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 35) / 15) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (42-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 42 + (((tickAnim - 18) / 17) * (42-(42)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 42 + (((tickAnim - 35) / 15) * (0-(42)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -19.25 + (((tickAnim - 18) / 17) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -19.25 + (((tickAnim - 35) / 15) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -10.25 + (((tickAnim - 18) / 17) * (-10.25-(-10.25)));
            yy = -5 + (((tickAnim - 18) / 17) * (-5-(-5)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 35) / 15) * (0-(-10.25)));
            yy = -5 + (((tickAnim - 35) / 15) * (0-(-5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -8.5 + (((tickAnim - 18) / 17) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 35) / 15) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (42-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 42 + (((tickAnim - 18) / 17) * (42-(42)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 42 + (((tickAnim - 35) / 15) * (0-(42)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -19.25 + (((tickAnim - 18) / 17) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -19.25 + (((tickAnim - 35) / 15) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -10.25 + (((tickAnim - 18) / 17) * (-10.25-(-10.25)));
            yy = 5 + (((tickAnim - 18) / 17) * (5-(5)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 35) / 15) * (0-(-10.25)));
            yy = 5 + (((tickAnim - 35) / 15) * (0-(5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-13.12-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -13.12 + (((tickAnim - 8) / 10) * (-14-(-13.12)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -14 + (((tickAnim - 18) / 17) * (-14-(-14)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 35) / 15) * (0-(-14)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8.29-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -8.29 + (((tickAnim - 8) / 10) * (-5.5-(-8.29)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -5.5 + (((tickAnim - 18) / 17) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.5 + (((tickAnim - 35) / 5) * (-11.92-(-5.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -11.92 + (((tickAnim - 40) / 3) * (-9.95-(-11.92)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -9.95 + (((tickAnim - 43) / 7) * (0-(-9.95)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 8) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 18) / 17) * (10-(10)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 35) / 5) * (2.92-(10)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 2.92 + (((tickAnim - 40) / 3) * (-11.55-(2.92)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -11.55 + (((tickAnim - 43) / 7) * (0-(-11.55)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 23 + (((tickAnim - 18) / 17) * (23-(23)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23 + (((tickAnim - 35) / 15) * (0-(23)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -28.75 + (((tickAnim - 18) / 17) * (-28.75-(-28.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -28.75 + (((tickAnim - 35) / 15) * (0-(-28.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.77678-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.1393-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.4604-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 12.77678 + (((tickAnim - 18) / 17) * (12.77678-(12.77678)));
            yy = -0.1393 + (((tickAnim - 18) / 17) * (-0.1393-(-0.1393)));
            zz = -2.4604 + (((tickAnim - 18) / 17) * (-2.4604-(-2.4604)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.77678 + (((tickAnim - 35) / 15) * (0-(12.77678)));
            yy = -0.1393 + (((tickAnim - 35) / 15) * (0-(-0.1393)));
            zz = -2.4604 + (((tickAnim - 35) / 15) * (0-(-2.4604)));
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
            zz = 0 + (((tickAnim - 0) / 18) * (-0.375-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = -0.375 + (((tickAnim - 18) / 17) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.375 + (((tickAnim - 35) / 15) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 23 + (((tickAnim - 18) / 17) * (23-(23)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23 + (((tickAnim - 35) / 15) * (0-(23)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -28.75 + (((tickAnim - 18) / 17) * (-28.75-(-28.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -28.75 + (((tickAnim - 35) / 15) * (0-(-28.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.77678-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.13934-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.46043-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 12.77678 + (((tickAnim - 18) / 17) * (12.77678-(12.77678)));
            yy = 0.13934 + (((tickAnim - 18) / 17) * (0.13934-(0.13934)));
            zz = 2.46043 + (((tickAnim - 18) / 17) * (2.46043-(2.46043)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.77678 + (((tickAnim - 35) / 15) * (0-(12.77678)));
            yy = 0.13934 + (((tickAnim - 35) / 15) * (0-(0.13934)));
            zz = 2.46043 + (((tickAnim - 35) / 15) * (0-(2.46043)));
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
            zz = 0 + (((tickAnim - 0) / 18) * (-0.375-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = -0.375 + (((tickAnim - 18) / 17) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.375 + (((tickAnim - 35) / 15) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinyunpelta entity = (EntityPrehistoricFloraJinyunpelta) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 9 + (((tickAnim - 12) / 13) * (0-(9)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 3.75 + (((tickAnim - 12) / 13) * (0-(3.75)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -32.75 + (((tickAnim - 12) / 13) * (0-(-32.75)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (23.68942-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (2.1317-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-13.42811-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 23.68942 + (((tickAnim - 12) / 13) * (0-(23.68942)));
            yy = 2.1317 + (((tickAnim - 12) / 13) * (0-(2.1317)));
            zz = -13.42811 + (((tickAnim - 12) / 13) * (0-(-13.42811)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 3.75 + (((tickAnim - 12) / 13) * (0-(3.75)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -32.75 + (((tickAnim - 12) / 13) * (0-(-32.75)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (23.68942-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-2.1317-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (13.4281-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 23.68942 + (((tickAnim - 12) / 13) * (0-(23.68942)));
            yy = -2.1317 + (((tickAnim - 12) / 13) * (0-(-2.1317)));
            zz = 13.4281 + (((tickAnim - 12) / 13) * (0-(13.4281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5.25 + (((tickAnim - 12) / 3) * (9.25-(5.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 9.25 + (((tickAnim - 15) / 10) * (0-(9.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 30 + (((tickAnim - 12) / 3) * (33-(30)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 33 + (((tickAnim - 15) / 10) * (0-(33)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 9.75 + (((tickAnim - 12) / 7) * (19.79-(9.75)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 19.79 + (((tickAnim - 19) / 6) * (0-(19.79)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
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
            xx = 0 + (((tickAnim - 7) / 5) * (15.25-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 15.25 + (((tickAnim - 12) / 3) * (0-(15.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinyunpelta entity = (EntityPrehistoricFloraJinyunpelta) entitylivingbaseIn;
        int animCycle = 375;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -1 + (((tickAnim - 68) / 52) * (-1.25-(-1)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 170) {
            xx = -1.25 + (((tickAnim - 120) / 50) * (-2.75-(-1.25)));
            yy = 0 + (((tickAnim - 120) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 50) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 255) {
            xx = -2.75 + (((tickAnim - 170) / 85) * (4.25-(-2.75)));
            yy = 0 + (((tickAnim - 170) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 85) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 296) {
            xx = 4.25 + (((tickAnim - 255) / 41) * (6.5-(4.25)));
            yy = 0 + (((tickAnim - 255) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 41) * (0-(0)));
        }
        else if (tickAnim >= 296 && tickAnim < 313) {
            xx = 6.5 + (((tickAnim - 296) / 17) * (3.5-(6.5)));
            yy = 0 + (((tickAnim - 296) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 296) / 17) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 330) {
            xx = 3.5 + (((tickAnim - 313) / 17) * (2.5-(3.5)));
            yy = 0 + (((tickAnim - 313) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 313) / 17) * (0-(0)));
        }
        else if (tickAnim >= 330 && tickAnim < 350) {
            xx = 2.5 + (((tickAnim - 330) / 20) * (0.25-(2.5)));
            yy = 0 + (((tickAnim - 330) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 330) / 20) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 375) {
            xx = 0.25 + (((tickAnim - 350) / 25) * (0-(0.25)));
            yy = 0 + (((tickAnim - 350) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -1 + (((tickAnim - 68) / 52) * (-2-(-1)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 170) {
            xx = -2 + (((tickAnim - 120) / 50) * (-6.5-(-2)));
            yy = 0 + (((tickAnim - 120) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 50) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 186) {
            xx = -6.5 + (((tickAnim - 170) / 16) * (-9.44-(-6.5)));
            yy = 0 + (((tickAnim - 170) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 16) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 255) {
            xx = -9.44 + (((tickAnim - 186) / 69) * (-2.5-(-9.44)));
            yy = 0 + (((tickAnim - 186) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 69) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 296) {
            xx = -2.5 + (((tickAnim - 255) / 41) * (-5.25-(-2.5)));
            yy = 0 + (((tickAnim - 255) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 41) * (0-(0)));
        }
        else if (tickAnim >= 296 && tickAnim < 313) {
            xx = -5.25 + (((tickAnim - 296) / 17) * (0.75-(-5.25)));
            yy = 0 + (((tickAnim - 296) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 296) / 17) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 330) {
            xx = 0.75 + (((tickAnim - 313) / 17) * (2.5-(0.75)));
            yy = 0 + (((tickAnim - 313) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 313) / 17) * (0-(0)));
        }
        else if (tickAnim >= 330 && tickAnim < 350) {
            xx = 2.5 + (((tickAnim - 330) / 20) * (4.75-(2.5)));
            yy = 0 + (((tickAnim - 330) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 330) / 20) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 375) {
            xx = 4.75 + (((tickAnim - 350) / 25) * (0-(4.75)));
            yy = 0 + (((tickAnim - 350) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -2 + (((tickAnim - 68) / 52) * (-4.5-(-2)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 170) {
            xx = -4.5 + (((tickAnim - 120) / 50) * (-12.75-(-4.5)));
            yy = 0 + (((tickAnim - 120) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 50) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 186) {
            xx = -12.75 + (((tickAnim - 170) / 16) * (-14.72-(-12.75)));
            yy = 0 + (((tickAnim - 170) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 16) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 203) {
            xx = -14.72 + (((tickAnim - 186) / 17) * (-16.59-(-14.72)));
            yy = 0 + (((tickAnim - 186) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 17) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 255) {
            xx = -16.59 + (((tickAnim - 203) / 52) * (-6-(-16.59)));
            yy = 0 + (((tickAnim - 203) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 52) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 296) {
            xx = -6 + (((tickAnim - 255) / 41) * (-12-(-6)));
            yy = 0 + (((tickAnim - 255) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 41) * (0-(0)));
        }
        else if (tickAnim >= 296 && tickAnim < 313) {
            xx = -12 + (((tickAnim - 296) / 17) * (-13-(-12)));
            yy = 0 + (((tickAnim - 296) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 296) / 17) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 330) {
            xx = -13 + (((tickAnim - 313) / 17) * (-7.604-(-13)));
            yy = 0 + (((tickAnim - 313) / 17) * (-0.95233-(0)));
            zz = 0 + (((tickAnim - 313) / 17) * (0.43372-(0)));
        }
        else if (tickAnim >= 330 && tickAnim < 350) {
            xx = -7.604 + (((tickAnim - 330) / 20) * (-1.104-(-7.604)));
            yy = -0.95233 + (((tickAnim - 330) / 20) * (-0.95233-(-0.95233)));
            zz = 0.43372 + (((tickAnim - 330) / 20) * (0.43372-(0.43372)));
        }
        else if (tickAnim >= 350 && tickAnim < 375) {
            xx = -1.104 + (((tickAnim - 350) / 25) * (0-(-1.104)));
            yy = -0.95233 + (((tickAnim - 350) / 25) * (0-(-0.95233)));
            zz = 0.43372 + (((tickAnim - 350) / 25) * (0-(0.43372)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 68) {
            xx = 0.5 + (((tickAnim - 25) / 43) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 25) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 43) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 350) {
            xx = 0.5 + (((tickAnim - 68) / 282) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 68) / 282) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 282) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 375) {
            xx = 0.5 + (((tickAnim - 350) / 25) * (0-(0.5)));
            yy = 0 + (((tickAnim - 350) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 68) {
            xx = 0.5 + (((tickAnim - 25) / 43) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 25) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 43) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 350) {
            xx = 0.5 + (((tickAnim - 68) / 282) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 68) / 282) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 282) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 375) {
            xx = 0.5 + (((tickAnim - 350) / 25) * (0-(0.5)));
            yy = 0 + (((tickAnim - 350) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 68) {
            xx = -28.25 + (((tickAnim - 25) / 43) * (-28.25-(-28.25)));
            yy = 0 + (((tickAnim - 25) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 43) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 200) {
            xx = -28.25 + (((tickAnim - 68) / 132) * (-28.25-(-28.25)));
            yy = 0 + (((tickAnim - 68) / 132) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 132) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 214) {
            xx = -28.25 + (((tickAnim - 200) / 14) * (-17-(-28.25)));
            yy = 0 + (((tickAnim - 200) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 14) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 350) {
            xx = -17 + (((tickAnim - 214) / 136) * (-17-(-17)));
            yy = 0 + (((tickAnim - 214) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 214) / 136) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 363) {
            xx = -17 + (((tickAnim - 350) / 13) * (10.25-(-17)));
            yy = 0 + (((tickAnim - 350) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 13) * (0-(0)));
        }
        else if (tickAnim >= 363 && tickAnim < 375) {
            xx = 10.25 + (((tickAnim - 363) / 12) * (0-(10.25)));
            yy = 0 + (((tickAnim - 363) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 363) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-33.15-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -33.15 + (((tickAnim - 12) / 13) * (8.25-(-33.15)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 68) {
            xx = 8.25 + (((tickAnim - 25) / 43) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 25) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 43) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 200) {
            xx = 8.25 + (((tickAnim - 68) / 132) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 68) / 132) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 132) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 207) {
            xx = 8.25 + (((tickAnim - 200) / 7) * (-11.62-(8.25)));
            yy = 0 + (((tickAnim - 200) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 7) * (0-(0)));
        }
        else if (tickAnim >= 207 && tickAnim < 214) {
            xx = -11.62 + (((tickAnim - 207) / 7) * (-0.5-(-11.62)));
            yy = 0 + (((tickAnim - 207) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 207) / 7) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 350) {
            xx = -0.5 + (((tickAnim - 214) / 136) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 214) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 214) / 136) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 363) {
            xx = -0.5 + (((tickAnim - 350) / 13) * (-40.25-(-0.5)));
            yy = 0 + (((tickAnim - 350) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 13) * (0-(0)));
        }
        else if (tickAnim >= 363 && tickAnim < 375) {
            xx = -40.25 + (((tickAnim - 363) / 12) * (0-(-40.25)));
            yy = 0 + (((tickAnim - 363) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 363) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (75.18371-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (12.58227-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (2.85826-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 75.18371 + (((tickAnim - 12) / 13) * (14.32223-(75.18371)));
            yy = 12.58227 + (((tickAnim - 12) / 13) * (26.962-(12.58227)));
            zz = 2.85826 + (((tickAnim - 12) / 13) * (6.12485-(2.85826)));
        }
        else if (tickAnim >= 25 && tickAnim < 68) {
            xx = 14.32223 + (((tickAnim - 25) / 43) * (14.32223-(14.32223)));
            yy = 26.962 + (((tickAnim - 25) / 43) * (26.962-(26.962)));
            zz = 6.12485 + (((tickAnim - 25) / 43) * (6.12485-(6.12485)));
        }
        else if (tickAnim >= 68 && tickAnim < 200) {
            xx = 14.32223 + (((tickAnim - 68) / 132) * (14.32223-(14.32223)));
            yy = 26.962 + (((tickAnim - 68) / 132) * (26.962-(26.962)));
            zz = 6.12485 + (((tickAnim - 68) / 132) * (6.12485-(6.12485)));
        }
        else if (tickAnim >= 200 && tickAnim < 207) {
            xx = 14.32223 + (((tickAnim - 200) / 7) * (56.57223-(14.32223)));
            yy = 26.962 + (((tickAnim - 200) / 7) * (26.962-(26.962)));
            zz = 6.12485 + (((tickAnim - 200) / 7) * (6.12485-(6.12485)));
        }
        else if (tickAnim >= 207 && tickAnim < 214) {
            xx = 56.57223 + (((tickAnim - 207) / 7) * (14.32223-(56.57223)));
            yy = 26.962 + (((tickAnim - 207) / 7) * (26.962-(26.962)));
            zz = 6.12485 + (((tickAnim - 207) / 7) * (6.12485-(6.12485)));
        }
        else if (tickAnim >= 214 && tickAnim < 350) {
            xx = 14.32223 + (((tickAnim - 214) / 136) * (14.32223-(14.32223)));
            yy = 26.962 + (((tickAnim - 214) / 136) * (26.962-(26.962)));
            zz = 6.12485 + (((tickAnim - 214) / 136) * (6.12485-(6.12485)));
        }
        else if (tickAnim >= 350 && tickAnim < 363) {
            xx = 14.32223 + (((tickAnim - 350) / 13) * (72.41112-(14.32223)));
            yy = 26.962 + (((tickAnim - 350) / 13) * (13.481-(26.962)));
            zz = 6.12485 + (((tickAnim - 350) / 13) * (3.06242-(6.12485)));
        }
        else if (tickAnim >= 363 && tickAnim < 375) {
            xx = 72.41112 + (((tickAnim - 363) / 12) * (0-(72.41112)));
            yy = 13.481 + (((tickAnim - 363) / 12) * (0-(13.481)));
            zz = 3.06242 + (((tickAnim - 363) / 12) * (0-(3.06242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.28-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-1.015-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0.28 + (((tickAnim - 12) / 13) * (0.275-(0.28)));
            zz = -1.015 + (((tickAnim - 12) / 13) * (0.025-(-1.015)));
        }
        else if (tickAnim >= 25 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 25) / 43) * (0-(0)));
            yy = 0.275 + (((tickAnim - 25) / 43) * (0.275-(0.275)));
            zz = 0.025 + (((tickAnim - 25) / 43) * (0.025-(0.025)));
        }
        else if (tickAnim >= 68 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 68) / 132) * (0-(0)));
            yy = 0.275 + (((tickAnim - 68) / 132) * (0.275-(0.275)));
            zz = 0.025 + (((tickAnim - 68) / 132) * (0.025-(0.025)));
        }
        else if (tickAnim >= 200 && tickAnim < 207) {
            xx = 0 + (((tickAnim - 200) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 200) / 7) * (0.905-(0.275)));
            zz = 0.025 + (((tickAnim - 200) / 7) * (-0.33-(0.025)));
        }
        else if (tickAnim >= 207 && tickAnim < 214) {
            xx = 0 + (((tickAnim - 207) / 7) * (0-(0)));
            yy = 0.905 + (((tickAnim - 207) / 7) * (0.275-(0.905)));
            zz = -0.33 + (((tickAnim - 207) / 7) * (0.025-(-0.33)));
        }
        else if (tickAnim >= 214 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 214) / 136) * (0-(0)));
            yy = 0.275 + (((tickAnim - 214) / 136) * (0.275-(0.275)));
            zz = 0.025 + (((tickAnim - 214) / 136) * (0.025-(0.025)));
        }
        else if (tickAnim >= 350 && tickAnim < 363) {
            xx = 0 + (((tickAnim - 350) / 13) * (0-(0)));
            yy = 0.275 + (((tickAnim - 350) / 13) * (0.14-(0.275)));
            zz = 0.025 + (((tickAnim - 350) / 13) * (-0.715-(0.025)));
        }
        else if (tickAnim >= 363 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 363) / 12) * (0-(0)));
            yy = 0.14 + (((tickAnim - 363) / 12) * (0-(0.14)));
            zz = -0.715 + (((tickAnim - 363) / 12) * (0-(-0.715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 12.75 + (((tickAnim - 25) / 10) * (17-(12.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 68) {
            xx = 17 + (((tickAnim - 35) / 33) * (12.75-(17)));
            yy = 0 + (((tickAnim - 35) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 33) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 12.75 + (((tickAnim - 68) / 10) * (17-(12.75)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 112) {
            xx = 17 + (((tickAnim - 78) / 34) * (3.75-(17)));
            yy = 0 + (((tickAnim - 78) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 34) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 135) {
            xx = 3.75 + (((tickAnim - 112) / 23) * (-5.80568-(3.75)));
            yy = 0 + (((tickAnim - 112) / 23) * (3.92493-(0)));
            zz = 0 + (((tickAnim - 112) / 23) * (1.37373-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 156) {
            xx = -5.80568 + (((tickAnim - 135) / 21) * (-9.55568-(-5.80568)));
            yy = 3.92493 + (((tickAnim - 135) / 21) * (3.92493-(3.92493)));
            zz = 1.37373 + (((tickAnim - 135) / 21) * (1.37373-(1.37373)));
        }
        else if (tickAnim >= 156 && tickAnim < 162) {
            xx = -9.55568 + (((tickAnim - 156) / 6) * (-9.55568-(-9.55568)));
            yy = 3.92493 + (((tickAnim - 156) / 6) * (3.92493-(3.92493)));
            zz = 1.37373 + (((tickAnim - 156) / 6) * (1.37373-(1.37373)));
        }
        else if (tickAnim >= 162 && tickAnim < 182) {
            xx = -9.55568 + (((tickAnim - 162) / 20) * (-9.55568-(-9.55568)));
            yy = 3.92493 + (((tickAnim - 162) / 20) * (3.92493-(3.92493)));
            zz = 1.37373 + (((tickAnim - 162) / 20) * (1.37373-(1.37373)));
        }
        else if (tickAnim >= 182 && tickAnim < 200) {
            xx = -9.55568 + (((tickAnim - 182) / 18) * (-9.55568-(-9.55568)));
            yy = 3.92493 + (((tickAnim - 182) / 18) * (3.92493-(3.92493)));
            zz = 1.37373 + (((tickAnim - 182) / 18) * (1.37373-(1.37373)));
        }
        else if (tickAnim >= 200 && tickAnim < 209) {
            xx = -9.55568 + (((tickAnim - 200) / 9) * (-10.06636-(-9.55568)));
            yy = 3.92493 + (((tickAnim - 200) / 9) * (4.40293-(3.92493)));
            zz = 1.37373 + (((tickAnim - 200) / 9) * (1.22665-(1.37373)));
        }
        else if (tickAnim >= 209 && tickAnim < 230) {
            xx = -10.06636 + (((tickAnim - 209) / 21) * (-10.06636-(-10.06636)));
            yy = 4.40293 + (((tickAnim - 209) / 21) * (4.40293-(4.40293)));
            zz = 1.22665 + (((tickAnim - 209) / 21) * (1.22665-(1.22665)));
        }
        else if (tickAnim >= 230 && tickAnim < 255) {
            xx = -10.06636 + (((tickAnim - 230) / 25) * (-10.06636-(-10.06636)));
            yy = 4.40293 + (((tickAnim - 230) / 25) * (4.40293-(4.40293)));
            zz = 1.22665 + (((tickAnim - 230) / 25) * (1.22665-(1.22665)));
        }
        else if (tickAnim >= 255 && tickAnim < 280) {
            xx = -10.06636 + (((tickAnim - 255) / 25) * (-0.06636-(-10.06636)));
            yy = 4.40293 + (((tickAnim - 255) / 25) * (0-(4.40293)));
            zz = 1.22665 + (((tickAnim - 255) / 25) * (1.22665-(1.22665)));
        }
        else if (tickAnim >= 280 && tickAnim < 310) {
            xx = -0.06636 + (((tickAnim - 280) / 30) * (18.75116-(-0.06636)));
            yy = 0 + (((tickAnim - 280) / 30) * (0-(0)));
            zz = 1.22665 + (((tickAnim - 280) / 30) * (1.22665-(1.22665)));
        }
        else if (tickAnim >= 310 && tickAnim < 324) {
            xx = 18.75116 + (((tickAnim - 310) / 14) * (17.00116-(18.75116)));
            yy = 0 + (((tickAnim - 310) / 14) * (0-(0)));
            zz = 1.22665 + (((tickAnim - 310) / 14) * (1.22665-(1.22665)));
        }
        else if (tickAnim >= 324 && tickAnim < 340) {
            xx = 17.00116 + (((tickAnim - 324) / 16) * (18.75116-(17.00116)));
            yy = 0 + (((tickAnim - 324) / 16) * (0-(0)));
            zz = 1.22665 + (((tickAnim - 324) / 16) * (1.22665-(1.22665)));
        }
        else if (tickAnim >= 340 && tickAnim < 350) {
            xx = 18.75116 + (((tickAnim - 340) / 10) * (18.75116-(18.75116)));
            yy = 0 + (((tickAnim - 340) / 10) * (0-(0)));
            zz = 1.22665 + (((tickAnim - 340) / 10) * (1.22665-(1.22665)));
        }
        else if (tickAnim >= 350 && tickAnim < 375) {
            xx = 18.75116 + (((tickAnim - 350) / 25) * (0-(18.75116)));
            yy = 0 + (((tickAnim - 350) / 25) * (0-(0)));
            zz = 1.22665 + (((tickAnim - 350) / 25) * (0-(1.22665)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 23.5 + (((tickAnim - 25) / 10) * (36.5-(23.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 68) {
            xx = 36.5 + (((tickAnim - 35) / 33) * (23.5-(36.5)));
            yy = 0 + (((tickAnim - 35) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 33) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 23.5 + (((tickAnim - 68) / 10) * (36.5-(23.5)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 112) {
            xx = 36.5 + (((tickAnim - 78) / 34) * (30-(36.5)));
            yy = 0 + (((tickAnim - 78) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 34) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 148) {
            xx = 30 + (((tickAnim - 112) / 36) * (13.8819+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*-3-(30)));
            yy = 0 + (((tickAnim - 112) / 36) * (4.24595-(0)));
            zz = 0 + (((tickAnim - 112) / 36) * (0.18572-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 156) {
            xx = 13.8819+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*-3 + (((tickAnim - 148) / 8) * (10.25688-(13.8819+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*-3)));
            yy = 4.24595 + (((tickAnim - 148) / 8) * (4.24595-(4.24595)));
            zz = 0.18572 + (((tickAnim - 148) / 8) * (0.18572-(0.18572)));
        }
        else if (tickAnim >= 156 && tickAnim < 162) {
            xx = 10.25688 + (((tickAnim - 156) / 6) * (10.45688-(10.25688)));
            yy = 4.24595 + (((tickAnim - 156) / 6) * (4.24595-(4.24595)));
            zz = 0.18572 + (((tickAnim - 156) / 6) * (0.18572-(0.18572)));
        }
        else if (tickAnim >= 162 && tickAnim < 167) {
            xx = 10.45688 + (((tickAnim - 162) / 5) * (10.75688-(10.45688)));
            yy = 4.24595 + (((tickAnim - 162) / 5) * (4.24595-(4.24595)));
            zz = 0.18572 + (((tickAnim - 162) / 5) * (0.18572-(0.18572)));
        }
        else if (tickAnim >= 167 && tickAnim < 172) {
            xx = 10.75688 + (((tickAnim - 167) / 5) * (10.25688-(10.75688)));
            yy = 4.24595 + (((tickAnim - 167) / 5) * (4.24595-(4.24595)));
            zz = 0.18572 + (((tickAnim - 167) / 5) * (0.18572-(0.18572)));
        }
        else if (tickAnim >= 172 && tickAnim < 177) {
            xx = 10.25688 + (((tickAnim - 172) / 5) * (10.75688-(10.25688)));
            yy = 4.24595 + (((tickAnim - 172) / 5) * (4.24595-(4.24595)));
            zz = 0.18572 + (((tickAnim - 172) / 5) * (0.18572-(0.18572)));
        }
        else if (tickAnim >= 177 && tickAnim < 182) {
            xx = 10.75688 + (((tickAnim - 177) / 5) * (10.25688-(10.75688)));
            yy = 4.24595 + (((tickAnim - 177) / 5) * (4.24595-(4.24595)));
            zz = 0.18572 + (((tickAnim - 177) / 5) * (0.18572-(0.18572)));
        }
        else if (tickAnim >= 182 && tickAnim < 200) {
            xx = 10.25688 + (((tickAnim - 182) / 18) * (10.25688-(10.25688)));
            yy = 4.24595 + (((tickAnim - 182) / 18) * (4.24595-(4.24595)));
            zz = 0.18572 + (((tickAnim - 182) / 18) * (0.18572-(0.18572)));
        }
        else if (tickAnim >= 200 && tickAnim < 209) {
            xx = 10.25688 + (((tickAnim - 200) / 9) * (8.95283-(10.25688)));
            yy = 4.24595 + (((tickAnim - 200) / 9) * (6.1558-(4.24595)));
            zz = 0.18572 + (((tickAnim - 200) / 9) * (-0.41046-(0.18572)));
        }
        else if (tickAnim >= 209 && tickAnim < 213) {
            xx = 8.95283 + (((tickAnim - 209) / 4) * (9.45283-(8.95283)));
            yy = 6.1558 + (((tickAnim - 209) / 4) * (6.1558-(6.1558)));
            zz = -0.41046 + (((tickAnim - 209) / 4) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 213 && tickAnim < 218) {
            xx = 9.45283 + (((tickAnim - 213) / 5) * (8.95283-(9.45283)));
            yy = 6.1558 + (((tickAnim - 213) / 5) * (6.1558-(6.1558)));
            zz = -0.41046 + (((tickAnim - 213) / 5) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 218 && tickAnim < 222) {
            xx = 8.95283 + (((tickAnim - 218) / 4) * (9.45283-(8.95283)));
            yy = 6.1558 + (((tickAnim - 218) / 4) * (6.1558-(6.1558)));
            zz = -0.41046 + (((tickAnim - 218) / 4) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 222 && tickAnim < 226) {
            xx = 9.45283 + (((tickAnim - 222) / 4) * (8.95283-(9.45283)));
            yy = 6.1558 + (((tickAnim - 222) / 4) * (6.1558-(6.1558)));
            zz = -0.41046 + (((tickAnim - 222) / 4) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 226 && tickAnim < 230) {
            xx = 8.95283 + (((tickAnim - 226) / 4) * (8.95283-(8.95283)));
            yy = 6.1558 + (((tickAnim - 226) / 4) * (6.1558-(6.1558)));
            zz = -0.41046 + (((tickAnim - 226) / 4) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 230 && tickAnim < 255) {
            xx = 8.95283 + (((tickAnim - 230) / 25) * (8.95283-(8.95283)));
            yy = 6.1558 + (((tickAnim - 230) / 25) * (6.1558-(6.1558)));
            zz = -0.41046 + (((tickAnim - 230) / 25) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 255 && tickAnim < 280) {
            xx = 8.95283 + (((tickAnim - 255) / 25) * (6.95283-(8.95283)));
            yy = 6.1558 + (((tickAnim - 255) / 25) * (0-(6.1558)));
            zz = -0.41046 + (((tickAnim - 255) / 25) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 280 && tickAnim < 310) {
            xx = 6.95283 + (((tickAnim - 280) / 30) * (26.45283-(6.95283)));
            yy = 0 + (((tickAnim - 280) / 30) * (0-(0)));
            zz = -0.41046 + (((tickAnim - 280) / 30) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 310 && tickAnim < 324) {
            xx = 26.45283 + (((tickAnim - 310) / 14) * (17.95283-(26.45283)));
            yy = 0 + (((tickAnim - 310) / 14) * (0-(0)));
            zz = -0.41046 + (((tickAnim - 310) / 14) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 324 && tickAnim < 340) {
            xx = 17.95283 + (((tickAnim - 324) / 16) * (32.70283-(17.95283)));
            yy = 0 + (((tickAnim - 324) / 16) * (0-(0)));
            zz = -0.41046 + (((tickAnim - 324) / 16) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 340 && tickAnim < 345) {
            xx = 32.70283 + (((tickAnim - 340) / 5) * (29.95283-(32.70283)));
            yy = 0 + (((tickAnim - 340) / 5) * (0-(0)));
            zz = -0.41046 + (((tickAnim - 340) / 5) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 345 && tickAnim < 350) {
            xx = 29.95283 + (((tickAnim - 345) / 5) * (32.70283-(29.95283)));
            yy = 0 + (((tickAnim - 345) / 5) * (0-(0)));
            zz = -0.41046 + (((tickAnim - 345) / 5) * (-0.41046-(-0.41046)));
        }
        else if (tickAnim >= 350 && tickAnim < 375) {
            xx = 32.70283 + (((tickAnim - 350) / 25) * (0-(32.70283)));
            yy = 0 + (((tickAnim - 350) / 25) * (0-(0)));
            zz = -0.41046 + (((tickAnim - 350) / 25) * (0-(-0.41046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 10.5 + (((tickAnim - 25) / 10) * (-7.5-(10.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 35) / 5) * (3.3-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.3 + (((tickAnim - 40) / 10) * (10.5-(3.3)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 10.5 + (((tickAnim - 50) / 6) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 10.5 + (((tickAnim - 56) / 4) * (10.09-(10.5)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 10.09 + (((tickAnim - 60) / 4) * (10.5-(10.09)));
            yy = 0 + (((tickAnim - 60) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 4) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = 10.5 + (((tickAnim - 64) / 4) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 64) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 4) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 10.5 + (((tickAnim - 68) / 10) * (-7.5-(10.5)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = -7.5 + (((tickAnim - 78) / 5) * (3.3-(-7.5)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 93) {
            xx = 3.3 + (((tickAnim - 83) / 10) * (10.5-(3.3)));
            yy = 0 + (((tickAnim - 83) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 10) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = 10.5 + (((tickAnim - 93) / 6) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 93) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 6) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 103) {
            xx = 10.5 + (((tickAnim - 99) / 4) * (10.09-(10.5)));
            yy = 0 + (((tickAnim - 99) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 4) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 108) {
            xx = 10.09 + (((tickAnim - 103) / 5) * (10.5-(10.09)));
            yy = 0 + (((tickAnim - 103) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 5) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 112) {
            xx = 10.5 + (((tickAnim - 108) / 4) * (12.5-(10.5)));
            yy = 0 + (((tickAnim - 108) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 4) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 148) {
            xx = 12.5 + (((tickAnim - 112) / 36) * (-8.25-(12.5)));
            yy = 0 + (((tickAnim - 112) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 36) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 156) {
            xx = -8.25 + (((tickAnim - 148) / 8) * (-7.125-(-8.25)));
            yy = 0 + (((tickAnim - 148) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 8) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 162) {
            xx = -7.125 + (((tickAnim - 156) / 6) * (-6.75-(-7.125)));
            yy = 0 + (((tickAnim - 156) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 6) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 167) {
            xx = -6.75 + (((tickAnim - 162) / 5) * (-8-(-6.75)));
            yy = 0 + (((tickAnim - 162) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 5) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 172) {
            xx = -8 + (((tickAnim - 167) / 5) * (-6.75-(-8)));
            yy = 0 + (((tickAnim - 167) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 5) * (0-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 177) {
            xx = -6.75 + (((tickAnim - 172) / 5) * (-8-(-6.75)));
            yy = 0 + (((tickAnim - 172) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 172) / 5) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 182) {
            xx = -8 + (((tickAnim - 177) / 5) * (-6.75-(-8)));
            yy = 0 + (((tickAnim - 177) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 177) / 5) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 190) {
            xx = -6.75 + (((tickAnim - 182) / 8) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 182) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 8) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = -6.75 + (((tickAnim - 190) / 10) * (-6.74636-(-6.75)));
            yy = 0 + (((tickAnim - 190) / 10) * (0.88088-(0)));
            zz = 0 + (((tickAnim - 190) / 10) * (0.47336-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 209) {
            xx = -6.74636 + (((tickAnim - 200) / 9) * (-6.70538-(-6.74636)));
            yy = 0.88088 + (((tickAnim - 200) / 9) * (3.08269-(0.88088)));
            zz = 0.47336 + (((tickAnim - 200) / 9) * (1.65822-(0.47336)));
        }
        else if (tickAnim >= 209 && tickAnim < 213) {
            xx = -6.70538 + (((tickAnim - 209) / 4) * (-8.20538-(-6.70538)));
            yy = 3.08269 + (((tickAnim - 209) / 4) * (3.08269-(3.08269)));
            zz = 1.65822 + (((tickAnim - 209) / 4) * (1.65822-(1.65822)));
        }
        else if (tickAnim >= 213 && tickAnim < 218) {
            xx = -8.20538 + (((tickAnim - 213) / 5) * (-6.70538-(-8.20538)));
            yy = 3.08269 + (((tickAnim - 213) / 5) * (3.08269-(3.08269)));
            zz = 1.65822 + (((tickAnim - 213) / 5) * (1.65822-(1.65822)));
        }
        else if (tickAnim >= 218 && tickAnim < 222) {
            xx = -6.70538 + (((tickAnim - 218) / 4) * (-8.20538-(-6.70538)));
            yy = 3.08269 + (((tickAnim - 218) / 4) * (3.08269-(3.08269)));
            zz = 1.65822 + (((tickAnim - 218) / 4) * (1.65822-(1.65822)));
        }
        else if (tickAnim >= 222 && tickAnim < 226) {
            xx = -8.20538 + (((tickAnim - 222) / 4) * (-6.70538-(-8.20538)));
            yy = 3.08269 + (((tickAnim - 222) / 4) * (3.08269-(3.08269)));
            zz = 1.65822 + (((tickAnim - 222) / 4) * (1.65822-(1.65822)));
        }
        else if (tickAnim >= 226 && tickAnim < 230) {
            xx = -6.70538 + (((tickAnim - 226) / 4) * (-6.70538-(-6.70538)));
            yy = 3.08269 + (((tickAnim - 226) / 4) * (3.08269-(3.08269)));
            zz = 1.65822 + (((tickAnim - 226) / 4) * (1.65822-(1.65822)));
        }
        else if (tickAnim >= 230 && tickAnim < 240) {
            xx = -6.70538 + (((tickAnim - 230) / 10) * (-6.70538-(-6.70538)));
            yy = 3.08269 + (((tickAnim - 230) / 10) * (3.08269-(3.08269)));
            zz = 1.65822 + (((tickAnim - 230) / 10) * (1.65822-(1.65822)));
        }
        else if (tickAnim >= 240 && tickAnim < 247) {
            xx = -6.70538 + (((tickAnim - 240) / 7) * (-6.65883-(-6.70538)));
            yy = 3.08269 + (((tickAnim - 240) / 7) * (4.4032-(3.08269)));
            zz = 1.65822 + (((tickAnim - 240) / 7) * (2.37127-(1.65822)));
        }
        else if (tickAnim >= 247 && tickAnim < 255) {
            xx = -6.65883 + (((tickAnim - 247) / 8) * (-6.65883-(-6.65883)));
            yy = 4.4032 + (((tickAnim - 247) / 8) * (4.4032-(4.4032)));
            zz = 2.37127 + (((tickAnim - 247) / 8) * (2.37127-(2.37127)));
        }
        else if (tickAnim >= 255 && tickAnim < 280) {
            xx = -6.65883 + (((tickAnim - 255) / 25) * (9.29462-(-6.65883)));
            yy = 4.4032 + (((tickAnim - 255) / 25) * (0-(4.4032)));
            zz = 2.37127 + (((tickAnim - 255) / 25) * (1.65822-(2.37127)));
        }
        else if (tickAnim >= 280 && tickAnim < 296) {
            xx = 9.29462 + (((tickAnim - 280) / 16) * (7.77107-(9.29462)));
            yy = 0 + (((tickAnim - 280) / 16) * (0-(0)));
            zz = 1.65822 + (((tickAnim - 280) / 16) * (0.78305-(1.65822)));
        }
        else if (tickAnim >= 296 && tickAnim < 303) {
            xx = 7.77107 + (((tickAnim - 296) / 7) * (-7.19721-(7.77107)));
            yy = 0 + (((tickAnim - 296) / 7) * (0-(0)));
            zz = 0.78305 + (((tickAnim - 296) / 7) * (0.32243-(0.78305)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = -7.19721 + (((tickAnim - 303) / 7) * (-6.75-(-7.19721)));
            yy = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            zz = 0.32243 + (((tickAnim - 303) / 7) * (0-(0.32243)));
        }
        else if (tickAnim >= 310 && tickAnim < 324) {
            xx = -6.75 + (((tickAnim - 310) / 14) * (5.75-(-6.75)));
            yy = 0 + (((tickAnim - 310) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 14) * (0-(0)));
        }
        else if (tickAnim >= 324 && tickAnim < 340) {
            xx = 5.75 + (((tickAnim - 324) / 16) * (-6.75-(5.75)));
            yy = 0 + (((tickAnim - 324) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 324) / 16) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 345) {
            xx = -6.75 + (((tickAnim - 340) / 5) * (-11.25-(-6.75)));
            yy = 0 + (((tickAnim - 340) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 5) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 350) {
            xx = -11.25 + (((tickAnim - 345) / 5) * (-3.75-(-11.25)));
            yy = 0 + (((tickAnim - 345) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 5) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 363) {
            xx = -3.75 + (((tickAnim - 350) / 13) * (5.13-(-3.75)));
            yy = 0 + (((tickAnim - 350) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 13) * (0-(0)));
        }
        else if (tickAnim >= 363 && tickAnim < 375) {
            xx = 5.13 + (((tickAnim - 363) / 12) * (0-(5.13)));
            yy = 0 + (((tickAnim - 363) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 363) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 120) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 28) * (0.1-(0)));
            zz = 0 + (((tickAnim - 120) / 28) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 363) {
            xx = 0 + (((tickAnim - 148) / 215) * (0-(0)));
            yy = 0.1 + (((tickAnim - 148) / 215) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 148) / 215) * (0-(0)));
        }
        else if (tickAnim >= 363 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 363) / 12) * (0-(0)));
            yy = 0.1 + (((tickAnim - 363) / 12) * (0-(0.1)));
            zz = 0 + (((tickAnim - 363) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (18.75-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 18.75 + (((tickAnim - 35) / 5) * (0-(18.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 40) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 16) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 5 + (((tickAnim - 60) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 60) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 4) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 64) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 4) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 68) / 10) * (18.75-(0)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 18.75 + (((tickAnim - 78) / 5) * (0-(18.75)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 83) / 172) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 172) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 172) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 255) / 13) * (6.25-(0)));
            yy = 0 + (((tickAnim - 255) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 13) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 280) {
            xx = 6.25 + (((tickAnim - 268) / 12) * (0-(6.25)));
            yy = 0 + (((tickAnim - 268) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 12) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 296) {
            xx = 0 + (((tickAnim - 280) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 16) * (0-(0)));
        }
        else if (tickAnim >= 296 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 296) / 7) * (15.75-(0)));
            yy = 0 + (((tickAnim - 296) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 296) / 7) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = 15.75 + (((tickAnim - 303) / 7) * (0-(15.75)));
            yy = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 324) {
            xx = 0 + (((tickAnim - 310) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 310) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 14) * (0-(0)));
        }
        else if (tickAnim >= 324 && tickAnim < 332) {
            xx = 0 + (((tickAnim - 324) / 8) * (15.75-(0)));
            yy = 0 + (((tickAnim - 324) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 324) / 8) * (0-(0)));
        }
        else if (tickAnim >= 332 && tickAnim < 340) {
            xx = 15.75 + (((tickAnim - 332) / 8) * (0-(15.75)));
            yy = 0 + (((tickAnim - 332) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 332) / 8) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 345) {
            xx = 0 + (((tickAnim - 340) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 340) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 5) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 350) {
            xx = 8.5 + (((tickAnim - 345) / 5) * (0-(8.5)));
            yy = 0 + (((tickAnim - 345) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 5) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 363) {
            xx = 0 + (((tickAnim - 350) / 13) * (9-(0)));
            yy = 0 + (((tickAnim - 350) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 13) * (0-(0)));
        }
        else if (tickAnim >= 363 && tickAnim < 375) {
            xx = 9 + (((tickAnim - 363) / 12) * (0-(9)));
            yy = 0 + (((tickAnim - 363) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 363) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraJinyunpelta entity = (EntityPrehistoricFloraJinyunpelta) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 31) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2 + (((tickAnim - 0) / 31) * (-6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 31) / 86) * (-6-(-6)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -6 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2-(-6)));
            yy = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (-1.6-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            yy = -1.6 + (((tickAnim - 13) / 18) * (-3.5-(-1.6)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = -3.5 + (((tickAnim - 31) / 86) * (-3.5-(-3.5)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -3.5 + (((tickAnim - 117) / 43) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37.4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 37.4 + (((tickAnim - 10) / 13) * (7.1908-(37.4)));
            yy = 0 + (((tickAnim - 10) / 13) * (-9.67477-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (-1.21465-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 7.1908 + (((tickAnim - 23) / 8) * (-25.75-(7.1908)));
            yy = -9.67477 + (((tickAnim - 23) / 8) * (0-(-9.67477)));
            zz = -1.21465 + (((tickAnim - 23) / 8) * (0-(-1.21465)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -25.75 + (((tickAnim - 31) / 86) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -25.75 + (((tickAnim - 117) / 22) * (-16.88-(-25.75)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = -16.88 + (((tickAnim - 139) / 11) * (-0.6-(-16.88)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -0.6 + (((tickAnim - 150) / 10) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (1-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 1 + (((tickAnim - 23) / 8) * (0-(1)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 31) / 108) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 108) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.82-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.82 + (((tickAnim - 10) / 5) * (24.51-(4.82)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 24.51 + (((tickAnim - 15) / 8) * (0.69-(24.51)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0.69 + (((tickAnim - 23) / 8) * (47.2433-(0.69)));
            yy = 0 + (((tickAnim - 23) / 8) * (3.99539-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (-0.19222-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 47.2433 + (((tickAnim - 31) / 86) * (47.2433-(47.2433)));
            yy = 3.99539 + (((tickAnim - 31) / 86) * (3.99539-(3.99539)));
            zz = -0.19222 + (((tickAnim - 31) / 86) * (-0.19222-(-0.19222)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 47.2433 + (((tickAnim - 117) / 22) * (17.22-(47.2433)));
            yy = 3.99539 + (((tickAnim - 117) / 22) * (0-(3.99539)));
            zz = -0.19222 + (((tickAnim - 117) / 22) * (0-(-0.19222)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 17.22 + (((tickAnim - 139) / 11) * (23.27-(17.22)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 23.27 + (((tickAnim - 150) / 10) * (0-(23.27)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0.975-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 8) * (0-(0.975)));
            zz = 0 + (((tickAnim - 23) / 8) * (-0.825-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = -0.825 + (((tickAnim - 31) / 86) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = -0.825 + (((tickAnim - 117) / 22) * (0-(-0.825)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 11) * (0.6-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 150) / 7) * (0-(0)));
            yy = 0.6 + (((tickAnim - 150) / 7) * (0-(0.6)));
            zz = 0 + (((tickAnim - 150) / 7) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 157) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 157) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 139 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 139) / 11) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -29.25 + (((tickAnim - 150) / 10) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.06433-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.83912-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-6.40972-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 8.06433 + (((tickAnim - 10) / 5) * (30.17-(8.06433)));
            yy = -10.83912 + (((tickAnim - 10) / 5) * (0-(-10.83912)));
            zz = -6.40972 + (((tickAnim - 10) / 5) * (0-(-6.40972)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 30.17 + (((tickAnim - 15) / 8) * (-10.52021-(30.17)));
            yy = 0 + (((tickAnim - 15) / 8) * (-7.95323-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-2.27003-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -10.52021 + (((tickAnim - 23) / 8) * (-14.5-(-10.52021)));
            yy = -7.95323 + (((tickAnim - 23) / 8) * (0-(-7.95323)));
            zz = -2.27003 + (((tickAnim - 23) / 8) * (0-(-2.27003)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -14.5 + (((tickAnim - 31) / 86) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -14.5 + (((tickAnim - 117) / 22) * (1.53-(-14.5)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 1.53 + (((tickAnim - 139) / 11) * (46.9975-(1.53)));
            yy = 0 + (((tickAnim - 139) / 11) * (-24.20053-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (-9.949-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 157) {
            xx = 46.9975 + (((tickAnim - 150) / 7) * (22.74-(46.9975)));
            yy = -24.20053 + (((tickAnim - 150) / 7) * (0-(-24.20053)));
            zz = -9.949 + (((tickAnim - 150) / 7) * (0-(-9.949)));
        }
        else if (tickAnim >= 157 && tickAnim < 160) {
            xx = 22.74 + (((tickAnim - 157) / 3) * (0-(22.74)));
            yy = 0 + (((tickAnim - 157) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.075-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0.1 + (((tickAnim - 10) / 13) * (0.55-(0.1)));
            zz = 0.075 + (((tickAnim - 10) / 13) * (0.08-(0.075)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0.55 + (((tickAnim - 23) / 8) * (0-(0.55)));
            zz = 0.08 + (((tickAnim - 23) / 8) * (0-(0.08)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 22) * (0.175-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            yy = 0.175 + (((tickAnim - 139) / 11) * (0.805-(0.175)));
            zz = 0 + (((tickAnim - 139) / 11) * (-1.075-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            yy = 0.805 + (((tickAnim - 150) / 10) * (0-(0.805)));
            zz = -1.075 + (((tickAnim - 150) / 10) * (0-(-1.075)));
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
            xx = 39.75 + (((tickAnim - 0) / 8) * (4.92455-(39.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.74943-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.71872-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 4.92455 + (((tickAnim - 8) / 6) * (-20-(4.92455)));
            yy = 5.74943 + (((tickAnim - 8) / 6) * (0-(5.74943)));
            zz = 1.71872 + (((tickAnim - 8) / 6) * (0-(1.71872)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = -20 + (((tickAnim - 14) / 17) * (-25.75-(-20)));
            yy = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -25.75 + (((tickAnim - 31) / 86) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -25.75 + (((tickAnim - 117) / 11) * (-13.34-(-25.75)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = -13.34 + (((tickAnim - 128) / 11) * (0-(-13.34)));
            yy = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.625 + (((tickAnim - 8) / 6) * (-0.75-(0.625)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            yy = -0.75 + (((tickAnim - 14) / 17) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 11) * (0.6-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            yy = 0.6 + (((tickAnim - 128) / 11) * (1.15-(0.6)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 1.15 + (((tickAnim - 139) / 21) * (0-(1.15)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.25 + (((tickAnim - 0) / 8) * (-6.75-(2.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -6.75 + (((tickAnim - 8) / 6) * (35-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 35 + (((tickAnim - 14) / 17) * (47.25-(35)));
            yy = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 47.25 + (((tickAnim - 31) / 86) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 47.25 + (((tickAnim - 117) / 11) * (60.89-(47.25)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = 60.89 + (((tickAnim - 128) / 11) * (0-(60.89)));
            yy = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.975 + (((tickAnim - 8) / 6) * (0-(0.975)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 17) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 31) / 108) * (0-(0)));
            yy = -0.075 + (((tickAnim - 31) / 108) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 31) / 108) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 25.48348 + (((tickAnim - 0) / 8) * (-11.59-(25.48348)));
            yy = 10.23274 + (((tickAnim - 0) / 8) * (0-(10.23274)));
            zz = 11.65433 + (((tickAnim - 0) / 8) * (0-(11.65433)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -11.59 + (((tickAnim - 8) / 4) * (-26.23-(-11.59)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -26.23 + (((tickAnim - 12) / 2) * (-9.39-(-26.23)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = -9.39 + (((tickAnim - 14) / 17) * (-16.12706-(-9.39)));
            yy = 0 + (((tickAnim - 14) / 17) * (-0.48523-(0)));
            zz = 0 + (((tickAnim - 14) / 17) * (4.9973-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -16.12706 + (((tickAnim - 31) / 86) * (-14.5-(-16.12706)));
            yy = -0.48523 + (((tickAnim - 31) / 86) * (0-(-0.48523)));
            zz = 4.9973 + (((tickAnim - 31) / 86) * (0-(4.9973)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -14.5 + (((tickAnim - 117) / 11) * (30.52-(-14.5)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = 30.52 + (((tickAnim - 128) / 11) * (1.75-(30.52)));
            yy = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 1.75 + (((tickAnim - 139) / 21) * (0-(1.75)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.5 + (((tickAnim - 0) / 8) * (0-(0.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-0.365-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.365 + (((tickAnim - 12) / 2) * (0.55-(-0.365)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 14) / 114) * (0-(0)));
            yy = 0.55 + (((tickAnim - 14) / 114) * (0-(0.55)));
            zz = 0 + (((tickAnim - 14) / 114) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 11) * (0.45-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0.45 + (((tickAnim - 139) / 21) * (0-(0.45)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (0.10353-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.82071-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-4.75113-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0.10353 + (((tickAnim - 8) / 12) * (-5.89647-(0.10353)));
            yy = -1.82071 + (((tickAnim - 8) / 12) * (-1.24571-(-1.82071)));
            zz = -4.75113 + (((tickAnim - 8) / 12) * (4.7511-(-4.75113)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -5.89647 + (((tickAnim - 20) / 11) * (-18-(-5.89647)));
            yy = -1.24571 + (((tickAnim - 20) / 11) * (0-(-1.24571)));
            zz = 4.7511 + (((tickAnim - 20) / 11) * (0-(4.7511)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -18 + (((tickAnim - 31) / 86) * (-18-(-18)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -18 + (((tickAnim - 117) / 43) * (0-(-18)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.10139-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.3494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.99496-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -0.10139 + (((tickAnim - 8) / 12) * (0.88179-(-0.10139)));
            yy = -1.3494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3 + (((tickAnim - 8) / 12) * (4.0581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5-(-1.3494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3)));
            zz = -1.99496 + (((tickAnim - 8) / 12) * (2.19416-(-1.99496)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0.88179 + (((tickAnim - 20) / 11) * (1.74805-(0.88179)));
            yy = 4.0581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5 + (((tickAnim - 20) / 11) * (1.9969-(4.0581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5)));
            zz = 2.19416 + (((tickAnim - 20) / 11) * (0.11171-(2.19416)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 1.74805 + (((tickAnim - 31) / 86) * (1.74805-(1.74805)));
            yy = 1.9969 + (((tickAnim - 31) / 86) * (1.9969-(1.9969)));
            zz = 0.11171 + (((tickAnim - 31) / 86) * (0.11171-(0.11171)));
        }
        else if (tickAnim >= 117 && tickAnim < 131) {
            xx = 1.74805 + (((tickAnim - 117) / 14) * (-6.57343-(1.74805)));
            yy = 1.9969 + (((tickAnim - 117) / 14) * (1.34407-(1.9969)));
            zz = 0.11171 + (((tickAnim - 117) / 14) * (0.07519-(0.11171)));
        }
        else if (tickAnim >= 131 && tickAnim < 160) {
            xx = -6.57343 + (((tickAnim - 131) / 29) * (0-(-6.57343)));
            yy = 1.34407 + (((tickAnim - 131) / 29) * (0-(1.34407)));
            zz = 0.07519 + (((tickAnim - 131) / 29) * (0-(0.07519)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.75271-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-3.98762-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5.96425-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.75271 + (((tickAnim - 3) / 5) * (-0.45536-(-0.75271)));
            yy = -3.98762 + (((tickAnim - 3) / 5) * (-0.2659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3-(-3.98762)));
            zz = 5.96425 + (((tickAnim - 3) / 5) * (-4.02579-(5.96425)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -0.45536 + (((tickAnim - 8) / 12) * (4.29464-(-0.45536)));
            yy = -0.2659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3 + (((tickAnim - 8) / 12) * (0.3091+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-0.2659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3)));
            zz = -4.02579 + (((tickAnim - 8) / 12) * (4.0258-(-4.02579)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 4.29464 + (((tickAnim - 20) / 11) * (9.02516-(4.29464)));
            yy = 0.3091+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 20) / 11) * (5.728-(0.3091+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = 4.0258 + (((tickAnim - 20) / 11) * (-0.50282-(4.0258)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 9.02516 + (((tickAnim - 31) / 86) * (9.02516-(9.02516)));
            yy = 5.728 + (((tickAnim - 31) / 86) * (5.728-(5.728)));
            zz = -0.50282 + (((tickAnim - 31) / 86) * (-0.50282-(-0.50282)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 9.02516 + (((tickAnim - 117) / 6) * (5.1685-(9.02516)));
            yy = 5.728 + (((tickAnim - 117) / 6) * (4.72037-(5.728)));
            zz = -0.50282 + (((tickAnim - 117) / 6) * (-0.41437-(-0.50282)));
        }
        else if (tickAnim >= 123 && tickAnim < 131) {
            xx = 5.1685 + (((tickAnim - 123) / 8) * (0.13232-(5.1685)));
            yy = 4.72037 + (((tickAnim - 123) / 8) * (3.85538-(4.72037)));
            zz = -0.41437 + (((tickAnim - 123) / 8) * (-0.33844-(-0.41437)));
        }
        else if (tickAnim >= 131 && tickAnim < 138) {
            xx = 0.13232 + (((tickAnim - 131) / 7) * (7.43064-(0.13232)));
            yy = 3.85538 + (((tickAnim - 131) / 7) * (2.97415-(3.85538)));
            zz = -0.33844 + (((tickAnim - 131) / 7) * (-0.26108-(-0.33844)));
        }
        else if (tickAnim >= 138 && tickAnim < 148) {
            xx = 7.43064 + (((tickAnim - 138) / 10) * (-2.01193-(7.43064)));
            yy = 2.97415 + (((tickAnim - 138) / 10) * (1.98651-(2.97415)));
            zz = -0.26108 + (((tickAnim - 138) / 10) * (-0.17438-(-0.26108)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -2.01193 + (((tickAnim - 148) / 12) * (0-(-2.01193)));
            yy = 1.98651 + (((tickAnim - 148) / 12) * (0-(1.98651)));
            zz = -0.17438 + (((tickAnim - 148) / 12) * (0-(-0.17438)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9 + (((tickAnim - 0) / 14) * (0.81612-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9)));
        }
        else if (tickAnim >= 14 && tickAnim < 31) {
            xx = 3 + (((tickAnim - 14) / 17) * (0-(3)));
            yy = 0 + (((tickAnim - 14) / 17) * (0-(0)));
            zz = 0.81612 + (((tickAnim - 14) / 17) * (0-(0.81612)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 0) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (8-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = -2 + (((tickAnim - 8) / 12) * (0-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 8 + (((tickAnim - 20) / 11) * (6.6604-(8)));
            yy = 0 + (((tickAnim - 20) / 11) * (0.08058-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 6.6604 + (((tickAnim - 31) / 86) * (6.6604-(6.6604)));
            yy = 0.08058 + (((tickAnim - 31) / 86) * (0.08058-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 31) / 86) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 6.6604 + (((tickAnim - 117) / 43) * (0-(6.6604)));
            yy = 0.08058 + (((tickAnim - 117) / 43) * (0-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 117) / 43) * (-2-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (-0.475-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = -0.475 + (((tickAnim - 31) / 86) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = -0.475 + (((tickAnim - 117) / 43) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (31.97-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 31.97 + (((tickAnim - 12) / 5) * (11.73635-(31.97)));
            yy = 0 + (((tickAnim - 12) / 5) * (4.34025-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (-16.38793-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 11.73635 + (((tickAnim - 17) / 4) * (9.63107-(11.73635)));
            yy = 4.34025 + (((tickAnim - 17) / 4) * (1.99202-(4.34025)));
            zz = -16.38793 + (((tickAnim - 17) / 4) * (-19.83992-(-16.38793)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 9.63107 + (((tickAnim - 21) / 10) * (6.63747-(9.63107)));
            yy = 1.99202 + (((tickAnim - 21) / 10) * (4.51637-(1.99202)));
            zz = -19.83992 + (((tickAnim - 21) / 10) * (-17.47104-(-19.83992)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 6.63747 + (((tickAnim - 31) / 86) * (6.63747-(6.63747)));
            yy = 4.51637 + (((tickAnim - 31) / 86) * (4.51637-(4.51637)));
            zz = -17.47104 + (((tickAnim - 31) / 86) * (-17.47104-(-17.47104)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 6.63747 + (((tickAnim - 117) / 12) * (17.56-(6.63747)));
            yy = 4.51637 + (((tickAnim - 117) / 12) * (0-(4.51637)));
            zz = -17.47104 + (((tickAnim - 117) / 12) * (0-(-17.47104)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 17.56 + (((tickAnim - 129) / 12) * (0-(17.56)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.57-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0.57 + (((tickAnim - 17) / 4) * (-0.1-(0.57)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 21) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 21) / 10) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 21) / 10) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 12) * (0.6-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            yy = 0.6 + (((tickAnim - 129) / 12) * (0-(0.6)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.93-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = -23.93 + (((tickAnim - 12) / 9) * (-40.75-(-23.93)));
            yy = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -40.75 + (((tickAnim - 21) / 10) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 21) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 10) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -40.75 + (((tickAnim - 31) / 86) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = -40.75 + (((tickAnim - 117) / 12) * (-22.39-(-40.75)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = -22.39 + (((tickAnim - 129) / 12) * (0-(-22.39)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (2.75-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 2.75 + (((tickAnim - 141) / 19) * (0-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 129 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 129) / 12) * (0.45-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0.45 + (((tickAnim - 141) / 19) * (0-(0.45)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (66.89-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 66.89 + (((tickAnim - 12) / 5) * (12.4-(66.89)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 12.4 + (((tickAnim - 17) / 4) * (18.28843-(12.4)));
            yy = 0 + (((tickAnim - 17) / 4) * (-3.67596-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (5.62263-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 18.28843 + (((tickAnim - 21) / 10) * (26.25-(18.28843)));
            yy = -3.67596 + (((tickAnim - 21) / 10) * (0-(-3.67596)));
            zz = 5.62263 + (((tickAnim - 21) / 10) * (0-(5.62263)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 26.25 + (((tickAnim - 31) / 86) * (26.25-(26.25)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 26.25 + (((tickAnim - 117) / 12) * (33.41-(26.25)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 33.41 + (((tickAnim - 129) / 12) * (0-(33.41)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (1.65-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-1.175-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 1.65 + (((tickAnim - 12) / 5) * (0-(1.65)));
            zz = -1.175 + (((tickAnim - 12) / 5) * (0-(-1.175)));
        }
        else if (tickAnim >= 17 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 17) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 14) * (0.54-(0)));
            zz = 0 + (((tickAnim - 17) / 14) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0.54 + (((tickAnim - 31) / 86) * (0.54-(0.54)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 117) / 12) * (-0.025-(0)));
            yy = 0.54 + (((tickAnim - 117) / 12) * (1.175-(0.54)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = -0.025 + (((tickAnim - 129) / 12) * (0-(-0.025)));
            yy = 1.175 + (((tickAnim - 129) / 12) * (0-(1.175)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -24.5 + (((tickAnim - 10) / 7) * (1.04-(-24.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1.04 + (((tickAnim - 17) / 6) * (15-(1.04)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 15 + (((tickAnim - 23) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 15 + (((tickAnim - 33) / 84) * (15-(15)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 15 + (((tickAnim - 117) / 22) * (15-(15)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 15 + (((tickAnim - 139) / 11) * (19.62-(15)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 19.62 + (((tickAnim - 150) / 10) * (0-(19.62)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (1.325-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 1.325 + (((tickAnim - 17) / 6) * (0.08-(1.325)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.08 + (((tickAnim - 23) / 10) * (0.08-(0.08)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.08 + (((tickAnim - 33) / 84) * (0.08-(0.08)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            yy = 0.08 + (((tickAnim - 117) / 22) * (0.08-(0.08)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0.08 + (((tickAnim - 139) / 21) * (0-(0.08)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.39-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.39 + (((tickAnim - 5) / 5) * (-6.22-(4.39)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -6.22 + (((tickAnim - 10) / 7) * (-44.22-(-6.22)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -44.22 + (((tickAnim - 17) / 6) * (-33.6066-(-44.22)));
            yy = 0 + (((tickAnim - 17) / 6) * (8.81604-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (6.3246-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -33.6066 + (((tickAnim - 23) / 10) * (-33.6066-(-33.6066)));
            yy = 8.81604 + (((tickAnim - 23) / 10) * (8.81604-(8.81604)));
            zz = 6.3246 + (((tickAnim - 23) / 10) * (6.3246-(6.3246)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -33.6066 + (((tickAnim - 33) / 84) * (-33.6066-(-33.6066)));
            yy = 8.81604 + (((tickAnim - 33) / 84) * (8.81604-(8.81604)));
            zz = 6.3246 + (((tickAnim - 33) / 84) * (6.3246-(6.3246)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -33.6066 + (((tickAnim - 117) / 22) * (-24.1066-(-33.6066)));
            yy = 8.81604 + (((tickAnim - 117) / 22) * (8.81604-(8.81604)));
            zz = 6.3246 + (((tickAnim - 117) / 22) * (6.3246-(6.3246)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = -24.1066 + (((tickAnim - 139) / 11) * (-54.06-(-24.1066)));
            yy = 8.81604 + (((tickAnim - 139) / 11) * (0-(8.81604)));
            zz = 6.3246 + (((tickAnim - 139) / 11) * (0-(6.3246)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -54.06 + (((tickAnim - 150) / 10) * (0-(-54.06)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 5) / 12) * (0-(0)));
            yy = -0.325 + (((tickAnim - 5) / 12) * (0.255-(-0.325)));
            zz = 0 + (((tickAnim - 5) / 12) * (0.425-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 17) / 122) * (0-(0)));
            yy = 0.255 + (((tickAnim - 17) / 122) * (0.255-(0.255)));
            zz = 0.425 + (((tickAnim - 17) / 122) * (0.425-(0.425)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0.255 + (((tickAnim - 139) / 21) * (0-(0.255)));
            zz = 0.425 + (((tickAnim - 139) / 21) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16.07-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 16.07 + (((tickAnim - 5) / 5) * (25.88-(16.07)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 25.88 + (((tickAnim - 10) / 7) * (95.39-(25.88)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 95.39 + (((tickAnim - 17) / 6) * (19.75-(95.39)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 19.75 + (((tickAnim - 23) / 10) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 19.75 + (((tickAnim - 33) / 84) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 19.75 + (((tickAnim - 117) / 22) * (12.70634-(19.75)));
            yy = 0 + (((tickAnim - 117) / 22) * (2.58826-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (-5.3616-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 12.70634 + (((tickAnim - 139) / 11) * (67.72901-(12.70634)));
            yy = 2.58826 + (((tickAnim - 139) / 11) * (-17.15536-(2.58826)));
            zz = -5.3616 + (((tickAnim - 139) / 11) * (1.88143-(-5.3616)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 67.72901 + (((tickAnim - 150) / 10) * (0-(67.72901)));
            yy = -17.15536 + (((tickAnim - 150) / 10) * (0-(-17.15536)));
            zz = 1.88143 + (((tickAnim - 150) / 10) * (0-(1.88143)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.125-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0.05 + (((tickAnim - 10) / 7) * (-0.35-(0.05)));
            yy = 0.7 + (((tickAnim - 10) / 7) * (0-(0.7)));
            zz = -1.125 + (((tickAnim - 10) / 7) * (-0.95-(-1.125)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -0.35 + (((tickAnim - 17) / 6) * (0.08-(-0.35)));
            yy = 0 + (((tickAnim - 17) / 6) * (0.2-(0)));
            zz = -0.95 + (((tickAnim - 17) / 6) * (0-(-0.95)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0.08 + (((tickAnim - 23) / 10) * (0.08-(0.08)));
            yy = 0.2 + (((tickAnim - 23) / 10) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0.08 + (((tickAnim - 33) / 84) * (0.08-(0.08)));
            yy = 0.2 + (((tickAnim - 33) / 84) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 0.08 + (((tickAnim - 117) / 22) * (0-(0.08)));
            yy = 0.2 + (((tickAnim - 117) / 22) * (-0.225-(0.2)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            yy = -0.225 + (((tickAnim - 139) / 11) * (-0.11-(-0.225)));
            zz = 0 + (((tickAnim - 139) / 11) * (-0.925-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            yy = -0.11 + (((tickAnim - 150) / 10) * (0-(-0.11)));
            zz = -0.925 + (((tickAnim - 150) / 10) * (0-(-0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.81671-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (10.83085-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.06678-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 5.81671 + (((tickAnim - 13) / 16) * (18.25-(5.81671)));
            yy = 10.83085 + (((tickAnim - 13) / 16) * (0-(10.83085)));
            zz = 9.06678 + (((tickAnim - 13) / 16) * (0-(9.06678)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 18.25 + (((tickAnim - 29) / 88) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 18.25 + (((tickAnim - 117) / 43) * (0-(18.25)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 13) / 7) * (13-(0.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 13 + (((tickAnim - 20) / 9) * (23-(13)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 23 + (((tickAnim - 29) / 88) * (23-(23)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 23 + (((tickAnim - 117) / 43) * (0-(23)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -12.5 + (((tickAnim - 8) / 12) * (12-(-12.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 12 + (((tickAnim - 20) / 9) * (12-(12)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.42902-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-0.33008-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 12 + (((tickAnim - 29) / 88) * (12-(12)));
            yy = 0.42902 + (((tickAnim - 29) / 88) * (0.42902-(0.42902)));
            zz = -0.33008 + (((tickAnim - 29) / 88) * (-0.33008-(-0.33008)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 12 + (((tickAnim - 117) / 43) * (0-(12)));
            yy = 0.42902 + (((tickAnim - 117) / 43) * (0-(0.42902)));
            zz = -0.33008 + (((tickAnim - 117) / 43) * (0-(-0.33008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 24 + (((tickAnim - 8) / 12) * (0-(24)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraJinyunpelta entity = (EntityPrehistoricFloraJinyunpelta) entitylivingbaseIn;
        int animCycle = 28;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -16.25 + (((tickAnim - 0) / 14) * (18.25-(-16.25)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 18.25 + (((tickAnim - 14) / 13) * (-17.75-(18.25)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -17.75 + (((tickAnim - 27) / 1) * (-16.25-(-17.75)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -8.75 + (((tickAnim - 0) / 14) * (15.75-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 15.75 + (((tickAnim - 14) / 3) * (22.22-(15.75)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 22.22 + (((tickAnim - 17) / 7) * (-15.28-(22.22)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -15.28 + (((tickAnim - 24) / 3) * (-12.5-(-15.28)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -12.5 + (((tickAnim - 27) / 1) * (-8.75-(-12.5)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 14) * (-0.075-(-0.6)));
            zz = 0.125 + (((tickAnim - 0) / 14) * (0-(0.125)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -0.075 + (((tickAnim - 14) / 8) * (-0.015-(-0.075)));
            zz = 0 + (((tickAnim - 14) / 8) * (-0.02-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = -0.015 + (((tickAnim - 22) / 2) * (-0.31-(-0.015)));
            zz = -0.02 + (((tickAnim - 22) / 2) * (0.175-(-0.02)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.31 + (((tickAnim - 24) / 3) * (-0.6-(-0.31)));
            zz = 0.175 + (((tickAnim - 24) / 3) * (0.125-(0.175)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = -0.6 + (((tickAnim - 27) / 1) * (-0.6-(-0.6)));
            zz = 0.125 + (((tickAnim - 27) / 1) * (0.125-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 22 + (((tickAnim - 0) / 6) * (16.24-(22)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 16.24 + (((tickAnim - 6) / 8) * (19.75-(16.24)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 19.75 + (((tickAnim - 14) / 3) * (20.32-(19.75)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 20.32 + (((tickAnim - 17) / 5) * (-17.1-(20.32)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -17.1 + (((tickAnim - 22) / 5) * (27.5-(-17.1)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 27.5 + (((tickAnim - 27) / 1) * (22-(27.5)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 6) / 21) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 21) * (0-(0.175)));
            zz = 0 + (((tickAnim - 6) / 21) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.16687 + (((tickAnim - 0) / 6) * (-6.3627-(5.16687)));
            yy = 0.68856 + (((tickAnim - 0) / 6) * (-13.23408-(0.68856)));
            zz = 4.83478 + (((tickAnim - 0) / 6) * (-4.29606-(4.83478)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -6.3627 + (((tickAnim - 6) / 5) * (-26.10197-(-6.3627)));
            yy = -13.23408 + (((tickAnim - 6) / 5) * (-31.70988-(-13.23408)));
            zz = -4.29606 + (((tickAnim - 6) / 5) * (-1.6583-(-4.29606)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -26.10197 + (((tickAnim - 11) / 3) * (25.48451-(-26.10197)));
            yy = -31.70988 + (((tickAnim - 11) / 3) * (-21.1665-(-31.70988)));
            zz = -1.6583 + (((tickAnim - 11) / 3) * (7.23042-(-1.6583)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 25.48451 + (((tickAnim - 14) / 3) * (39.21944-(25.48451)));
            yy = -21.1665 + (((tickAnim - 14) / 3) * (-16.4451-(-21.1665)));
            zz = 7.23042 + (((tickAnim - 14) / 3) * (-4.914-(7.23042)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 39.21944 + (((tickAnim - 17) / 5) * (35.35968-(39.21944)));
            yy = -16.4451 + (((tickAnim - 17) / 5) * (-10.5433-(-16.4451)));
            zz = -4.914 + (((tickAnim - 17) / 5) * (-2.0184-(-4.914)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 35.35968 + (((tickAnim - 22) / 2) * (5.64383-(35.35968)));
            yy = -10.5433 + (((tickAnim - 22) / 2) * (-7.0022-(-10.5433)));
            zz = -2.0184 + (((tickAnim - 22) / 2) * (-0.281-(-2.0184)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 5.64383 + (((tickAnim - 24) / 3) * (5.16687-(5.64383)));
            yy = -7.0022 + (((tickAnim - 24) / 3) * (0.68856-(-7.0022)));
            zz = -0.281 + (((tickAnim - 24) / 3) * (4.83478-(-0.281)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 5.16687 + (((tickAnim - 27) / 1) * (5.16687-(5.16687)));
            yy = 0.68856 + (((tickAnim - 27) / 1) * (0.68856-(0.68856)));
            zz = 4.83478 + (((tickAnim - 27) / 1) * (4.83478-(4.83478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.25 + (((tickAnim - 0) / 6) * (0-(0.25)));
            yy = 0.55 + (((tickAnim - 0) / 6) * (0.375-(0.55)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 6) / 5) * (-0.335-(0.375)));
            zz = 0 + (((tickAnim - 6) / 5) * (-0.41-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = -0.335 + (((tickAnim - 11) / 3) * (0-(-0.335)));
            zz = -0.41 + (((tickAnim - 11) / 3) * (-0.65-(-0.41)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0.895-(0)));
            zz = -0.65 + (((tickAnim - 14) / 3) * (-0.955-(-0.65)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (-0.075-(0)));
            yy = 0.895 + (((tickAnim - 17) / 2) * (1.77-(0.895)));
            zz = -0.955 + (((tickAnim - 17) / 2) * (-0.8-(-0.955)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -0.075 + (((tickAnim - 19) / 3) * (0-(-0.075)));
            yy = 1.77 + (((tickAnim - 19) / 3) * (0.91-(1.77)));
            zz = -0.8 + (((tickAnim - 19) / 3) * (-0.635-(-0.8)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0.91 + (((tickAnim - 22) / 2) * (0.255-(0.91)));
            zz = -0.635 + (((tickAnim - 22) / 2) * (-0.32-(-0.635)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0.25-(0)));
            yy = 0.255 + (((tickAnim - 24) / 3) * (0.55-(0.255)));
            zz = -0.32 + (((tickAnim - 24) / 3) * (0-(-0.32)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0.25 + (((tickAnim - 27) / 1) * (0.25-(0.25)));
            yy = 0.55 + (((tickAnim - 27) / 1) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 16.75 + (((tickAnim - 0) / 4) * (-8.63921-(16.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (-6.0765-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.18133-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -8.63921 + (((tickAnim - 4) / 5) * (-32.08854-(-8.63921)));
            yy = -6.0765 + (((tickAnim - 4) / 5) * (-11.1403-(-6.0765)));
            zz = -2.18133 + (((tickAnim - 4) / 5) * (3.9991-(-2.18133)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = -32.08854 + (((tickAnim - 9) / 17) * (19.5-(-32.08854)));
            yy = -11.1403 + (((tickAnim - 9) / 17) * (0-(-11.1403)));
            zz = 3.9991 + (((tickAnim - 9) / 17) * (0-(3.9991)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 19.5 + (((tickAnim - 26) / 2) * (16.75-(19.5)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -10.5 + (((tickAnim - 0) / 4) * (-30.02-(-10.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -30.02 + (((tickAnim - 4) / 5) * (18-(-30.02)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 18 + (((tickAnim - 9) / 16) * (18-(18)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 18 + (((tickAnim - 25) / 3) * (-10.5-(18)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 4) * (0.25-(-0.2)));
            zz = -0.125 + (((tickAnim - 0) / 4) * (0.375-(-0.125)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 4) / 5) * (-0.2-(0.25)));
            zz = 0.375 + (((tickAnim - 4) / 5) * (-0.125-(0.375)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            yy = -0.2 + (((tickAnim - 9) / 16) * (-0.2-(-0.2)));
            zz = -0.125 + (((tickAnim - 9) / 16) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 25) / 3) * (-0.2-(-0.2)));
            zz = -0.125 + (((tickAnim - 25) / 3) * (-0.125-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 91.92052 + (((tickAnim - 0) / 4) * (89.49544-(91.92052)));
            yy = 17.79543 + (((tickAnim - 0) / 4) * (18.9766-(17.79543)));
            zz = 7.88998 + (((tickAnim - 0) / 4) * (10.3249-(7.88998)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 89.49544 + (((tickAnim - 4) / 5) * (13.79607-(89.49544)));
            yy = 18.9766 + (((tickAnim - 4) / 5) * (24.10548-(18.9766)));
            zz = 10.3249 + (((tickAnim - 4) / 5) * (8.51659-(10.3249)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 13.79607 + (((tickAnim - 9) / 7) * (-7.29341-(13.79607)));
            yy = 24.10548 + (((tickAnim - 9) / 7) * (18.6688-(24.10548)));
            zz = 8.51659 + (((tickAnim - 9) / 7) * (6.39188-(8.51659)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -7.29341 + (((tickAnim - 16) / 5) * (-23.93991-(-7.29341)));
            yy = 18.6688 + (((tickAnim - 16) / 5) * (14.43621-(18.6688)));
            zz = 6.39188 + (((tickAnim - 16) / 5) * (9.1721-(6.39188)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -23.93991 + (((tickAnim - 21) / 4) * (27.75386-(-23.93991)));
            yy = 14.43621 + (((tickAnim - 21) / 4) * (9.9221-(14.43621)));
            zz = 9.1721 + (((tickAnim - 21) / 4) * (13.6869-(9.1721)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 27.75386 + (((tickAnim - 25) / 3) * (91.92052-(27.75386)));
            yy = 9.9221 + (((tickAnim - 25) / 3) * (17.79543-(9.9221)));
            zz = 13.6869 + (((tickAnim - 25) / 3) * (7.88998-(13.6869)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.275 + (((tickAnim - 0) / 4) * (0.11-(0.275)));
            yy = 1.275 + (((tickAnim - 0) / 4) * (0.71-(1.275)));
            zz = -1.45 + (((tickAnim - 0) / 4) * (-1.165-(-1.45)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0.11 + (((tickAnim - 4) / 5) * (0.35-(0.11)));
            yy = 0.71 + (((tickAnim - 4) / 5) * (0.65-(0.71)));
            zz = -1.165 + (((tickAnim - 4) / 5) * (0-(-1.165)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0.35 + (((tickAnim - 9) / 7) * (0.2-(0.35)));
            yy = 0.65 + (((tickAnim - 9) / 7) * (0.885-(0.65)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0.2 + (((tickAnim - 16) / 5) * (0.1-(0.2)));
            yy = 0.885 + (((tickAnim - 16) / 5) * (0.15-(0.885)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0.1 + (((tickAnim - 21) / 4) * (0-(0.1)));
            yy = 0.15 + (((tickAnim - 21) / 4) * (0.65-(0.15)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0.275-(0)));
            yy = 0.65 + (((tickAnim - 25) / 3) * (1.275-(0.65)));
            zz = 0 + (((tickAnim - 25) / 3) * (-1.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -13.29423 + (((tickAnim - 0) / 12) * (19.5-(-13.29423)));
            yy = 2.04839 + (((tickAnim - 0) / 12) * (0-(2.04839)));
            zz = -1.72101 + (((tickAnim - 0) / 12) * (0-(-1.72101)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 19.5 + (((tickAnim - 12) / 6) * (-8.63921-(19.5)));
            yy = 0 + (((tickAnim - 12) / 6) * (6.07653-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-2.18133-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -8.63921 + (((tickAnim - 18) / 5) * (-32.08854-(-8.63921)));
            yy = 6.07653 + (((tickAnim - 18) / 5) * (11.1403-(6.07653)));
            zz = -2.18133 + (((tickAnim - 18) / 5) * (-3.9991-(-2.18133)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -32.08854 + (((tickAnim - 23) / 5) * (-13.29423-(-32.08854)));
            yy = 11.1403 + (((tickAnim - 23) / 5) * (2.04839-(11.1403)));
            zz = -3.9991 + (((tickAnim - 23) / 5) * (-1.72101-(-3.9991)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 18.25 + (((tickAnim - 0) / 13) * (-17.75-(18.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -17.75 + (((tickAnim - 13) / 15) * (18.25-(-17.75)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.75 + (((tickAnim - 0) / 3) * (22.22-(15.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 22.22 + (((tickAnim - 3) / 7) * (-15.28-(22.22)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -15.28 + (((tickAnim - 10) / 3) * (-12.5-(-15.28)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -12.5 + (((tickAnim - 13) / 15) * (15.75-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 8) * (-0.015-(-0.075)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.02-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.015 + (((tickAnim - 8) / 2) * (-0.31-(-0.015)));
            zz = -0.02 + (((tickAnim - 8) / 2) * (0.175-(-0.02)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.31 + (((tickAnim - 10) / 3) * (-0.6-(-0.31)));
            zz = 0.175 + (((tickAnim - 10) / 3) * (0.125-(0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = -0.6 + (((tickAnim - 13) / 15) * (-0.075-(-0.6)));
            zz = 0.125 + (((tickAnim - 13) / 15) * (0-(0.125)));
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
            xx = 19.75 + (((tickAnim - 0) / 3) * (20.32-(19.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.32 + (((tickAnim - 3) / 5) * (-17.1-(20.32)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -17.1 + (((tickAnim - 8) / 5) * (27.5-(-17.1)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 27.5 + (((tickAnim - 13) / 5) * (-3.33-(27.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -3.33 + (((tickAnim - 18) / 10) * (19.75-(-3.33)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.48451 + (((tickAnim - 0) / 3) * (39.21944-(25.48451)));
            yy = 21.16653 + (((tickAnim - 0) / 3) * (16.4451-(21.16653)));
            zz = 7.23042 + (((tickAnim - 0) / 3) * (4.91397-(7.23042)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 39.21944 + (((tickAnim - 3) / 5) * (35.35968-(39.21944)));
            yy = 16.4451 + (((tickAnim - 3) / 5) * (10.54332-(16.4451)));
            zz = 4.91397 + (((tickAnim - 3) / 5) * (2.01839-(4.91397)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35.35968 + (((tickAnim - 8) / 2) * (5.64383-(35.35968)));
            yy = 10.54332 + (((tickAnim - 8) / 2) * (7.00224-(10.54332)));
            zz = 2.01839 + (((tickAnim - 8) / 2) * (0.28105-(2.01839)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5.64383 + (((tickAnim - 10) / 3) * (2.92798-(5.64383)));
            yy = 7.00224 + (((tickAnim - 10) / 3) * (3.46117-(7.00224)));
            zz = 0.28105 + (((tickAnim - 10) / 3) * (-1.45629-(0.28105)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2.92798 + (((tickAnim - 13) / 5) * (13.9613-(2.92798)));
            yy = 3.46117 + (((tickAnim - 13) / 5) * (12.33802-(3.46117)));
            zz = -1.45629 + (((tickAnim - 13) / 5) * (-1.14565-(-1.45629)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 13.9613 + (((tickAnim - 18) / 5) * (-19.1257-(13.9613)));
            yy = 12.33802 + (((tickAnim - 18) / 5) * (16.63452-(12.33802)));
            zz = -1.14565 + (((tickAnim - 18) / 5) * (5.78189-(-1.14565)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -19.1257 + (((tickAnim - 23) / 5) * (25.48451-(-19.1257)));
            yy = 16.63452 + (((tickAnim - 23) / 5) * (21.16653-(16.63452)));
            zz = 5.78189 + (((tickAnim - 23) / 5) * (7.23042-(5.78189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.895-(0)));
            zz = -0.65 + (((tickAnim - 0) / 3) * (-0.955-(-0.65)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-0.075-(0)));
            yy = 0.895 + (((tickAnim - 3) / 2) * (1.77-(0.895)));
            zz = -0.955 + (((tickAnim - 3) / 2) * (-0.8-(-0.955)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.075 + (((tickAnim - 5) / 3) * (0-(-0.075)));
            yy = 1.77 + (((tickAnim - 5) / 3) * (0.91-(1.77)));
            zz = -0.8 + (((tickAnim - 5) / 3) * (-0.635-(-0.8)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.91 + (((tickAnim - 8) / 2) * (0.255-(0.91)));
            zz = -0.635 + (((tickAnim - 8) / 2) * (-0.32-(-0.635)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.255 + (((tickAnim - 10) / 3) * (0.25-(0.255)));
            zz = -0.32 + (((tickAnim - 10) / 3) * (0-(-0.32)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 13) / 5) * (0.55-(0.25)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.21-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 18) / 5) * (-0.445-(0.55)));
            zz = -0.21 + (((tickAnim - 18) / 5) * (-0.43-(-0.21)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.445 + (((tickAnim - 23) / 5) * (0-(-0.445)));
            zz = -0.43 + (((tickAnim - 23) / 5) * (-0.65-(-0.43)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 18 + (((tickAnim - 12) / 6) * (-30.02-(18)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -30.02 + (((tickAnim - 18) / 5) * (6.5-(-30.02)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 6.5 + (((tickAnim - 23) / 5) * (0-(6.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.125-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 12) / 6) * (0.25-(-0.2)));
            zz = -0.125 + (((tickAnim - 12) / 6) * (0.375-(-0.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 18) / 5) * (-0.375-(0.25)));
            zz = 0.375 + (((tickAnim - 18) / 5) * (-0.175-(0.375)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.375 + (((tickAnim - 23) / 5) * (0-(-0.375)));
            zz = -0.175 + (((tickAnim - 23) / 5) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 9.93181 + (((tickAnim - 0) / 12) * (27.75386-(9.93181)));
            yy = -16.78801 + (((tickAnim - 0) / 12) * (-9.92213-(-16.78801)));
            zz = -3.3605 + (((tickAnim - 0) / 12) * (-13.68688-(-3.3605)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 27.75386 + (((tickAnim - 12) / 1) * (61.14431-(27.75386)));
            yy = -9.92213 + (((tickAnim - 12) / 1) * (-12.50911-(-9.92213)));
            zz = -13.68688 + (((tickAnim - 12) / 1) * (-12.7263-(-13.68688)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 61.14431 + (((tickAnim - 13) / 5) * (89.49544-(61.14431)));
            yy = -12.50911 + (((tickAnim - 13) / 5) * (-18.97655-(-12.50911)));
            zz = -12.7263 + (((tickAnim - 13) / 5) * (-10.32487-(-12.7263)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 89.49544 + (((tickAnim - 18) / 5) * (26.96719-(89.49544)));
            yy = -18.97655 + (((tickAnim - 18) / 5) * (-19.24321-(-18.97655)));
            zz = -10.32487 + (((tickAnim - 18) / 5) * (-0.65988-(-10.32487)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 26.96719 + (((tickAnim - 23) / 5) * (9.93181-(26.96719)));
            yy = -19.24321 + (((tickAnim - 23) / 5) * (-16.78801-(-19.24321)));
            zz = -0.65988 + (((tickAnim - 23) / 5) * (-3.3605-(-0.65988)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0.03-(0)));
            yy = 0.65 + (((tickAnim - 12) / 1) * (1.84-(0.65)));
            zz = 0 + (((tickAnim - 12) / 1) * (-0.29-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.03 + (((tickAnim - 13) / 2) * (0.06-(0.03)));
            yy = 1.84 + (((tickAnim - 13) / 2) * (1.63-(1.84)));
            zz = -0.29 + (((tickAnim - 13) / 2) * (-0.58-(-0.29)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.06 + (((tickAnim - 15) / 3) * (0.11-(0.06)));
            yy = 1.63 + (((tickAnim - 15) / 3) * (0.71-(1.63)));
            zz = -0.58 + (((tickAnim - 15) / 3) * (-1.165-(-0.58)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.11 + (((tickAnim - 18) / 5) * (-0.1-(0.11)));
            yy = 0.71 + (((tickAnim - 18) / 5) * (0.025-(0.71)));
            zz = -1.165 + (((tickAnim - 18) / 5) * (-0.25-(-1.165)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0.1 + (((tickAnim - 23) / 5) * (0-(-0.1)));
            yy = 0.025 + (((tickAnim - 23) / 5) * (0-(0.025)));
            zz = -0.25 + (((tickAnim - 23) / 5) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-70))*-1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+60))*2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254))*0.3);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-40))*0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-20))*0.3);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+50))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*3), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*3.5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+150))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+50))*-1.2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-2));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*0.1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-240))*-1.4), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-1.2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*1.8));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-250))*1), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-80))*-1.2), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-250))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-130))*1.2), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-200))*-2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-300))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraJinyunpelta entity = (EntityPrehistoricFloraJinyunpelta) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -16.25 + (((tickAnim - 0) / 8) * (18.25-(-16.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 18.25 + (((tickAnim - 8) / 8) * (-17.75-(18.25)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -17.75 + (((tickAnim - 16) / 2) * (-16.25-(-17.75)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -8.75 + (((tickAnim - 0) / 8) * (15.75-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15.75 + (((tickAnim - 8) / 2) * (22.22-(15.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 22.22 + (((tickAnim - 10) / 4) * (-15.28-(22.22)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -15.28 + (((tickAnim - 14) / 2) * (-12.5-(-15.28)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 16) / 2) * (-8.75-(-12.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 8) * (-0.075-(-0.6)));
            zz = 0.125 + (((tickAnim - 0) / 8) * (0-(0.125)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.075 + (((tickAnim - 8) / 5) * (-0.015-(-0.075)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.02-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.015 + (((tickAnim - 13) / 1) * (-0.31-(-0.015)));
            zz = -0.02 + (((tickAnim - 13) / 1) * (0.175-(-0.02)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.31 + (((tickAnim - 14) / 2) * (-0.6-(-0.31)));
            zz = 0.175 + (((tickAnim - 14) / 2) * (0.125-(0.175)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.6 + (((tickAnim - 16) / 2) * (-0.6-(-0.6)));
            zz = 0.125 + (((tickAnim - 16) / 2) * (0.125-(0.125)));
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
            xx = 22 + (((tickAnim - 0) / 3) * (16.24-(22)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 16.24 + (((tickAnim - 3) / 5) * (19.75-(16.24)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.75 + (((tickAnim - 8) / 2) * (20.32-(19.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20.32 + (((tickAnim - 10) / 3) * (-17.1-(20.32)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -17.1 + (((tickAnim - 13) / 3) * (27.5-(-17.1)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 27.5 + (((tickAnim - 16) / 2) * (22-(27.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            yy = 0.175 + (((tickAnim - 3) / 13) * (0-(0.175)));
            zz = 0 + (((tickAnim - 3) / 13) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
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
            xx = 5.16687 + (((tickAnim - 0) / 3) * (-6.3627-(5.16687)));
            yy = 0.68856 + (((tickAnim - 0) / 3) * (-13.23408-(0.68856)));
            zz = 4.83478 + (((tickAnim - 0) / 3) * (-4.29606-(4.83478)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -6.3627 + (((tickAnim - 3) / 4) * (-7.23504-(-6.3627)));
            yy = -13.23408 + (((tickAnim - 3) / 4) * (-22.24403-(-13.23408)));
            zz = -4.29606 + (((tickAnim - 3) / 4) * (-2.47238-(-4.29606)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -7.23504 + (((tickAnim - 7) / 1) * (25.48451-(-7.23504)));
            yy = -22.24403 + (((tickAnim - 7) / 1) * (-21.1665-(-22.24403)));
            zz = -2.47238 + (((tickAnim - 7) / 1) * (7.23042-(-2.47238)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25.48451 + (((tickAnim - 8) / 2) * (39.21944-(25.48451)));
            yy = -21.1665 + (((tickAnim - 8) / 2) * (-16.4451-(-21.1665)));
            zz = 7.23042 + (((tickAnim - 8) / 2) * (-4.914-(7.23042)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 39.21944 + (((tickAnim - 10) / 3) * (35.35968-(39.21944)));
            yy = -16.4451 + (((tickAnim - 10) / 3) * (-10.5433-(-16.4451)));
            zz = -4.914 + (((tickAnim - 10) / 3) * (-2.0184-(-4.914)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 35.35968 + (((tickAnim - 13) / 1) * (5.64383-(35.35968)));
            yy = -10.5433 + (((tickAnim - 13) / 1) * (-7.0022-(-10.5433)));
            zz = -2.0184 + (((tickAnim - 13) / 1) * (-0.281-(-2.0184)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 5.64383 + (((tickAnim - 14) / 2) * (5.16687-(5.64383)));
            yy = -7.0022 + (((tickAnim - 14) / 2) * (0.68856-(-7.0022)));
            zz = -0.281 + (((tickAnim - 14) / 2) * (4.83478-(-0.281)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 5.16687 + (((tickAnim - 16) / 2) * (5.16687-(5.16687)));
            yy = 0.68856 + (((tickAnim - 16) / 2) * (0.68856-(0.68856)));
            zz = 4.83478 + (((tickAnim - 16) / 2) * (4.83478-(4.83478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.25 + (((tickAnim - 0) / 2) * (0.13-(0.25)));
            yy = 0.925 + (((tickAnim - 0) / 2) * (1.13-(0.925)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.13 + (((tickAnim - 2) / 1) * (0-(0.13)));
            yy = 1.13 + (((tickAnim - 2) / 1) * (0.625-(1.13)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.625 + (((tickAnim - 3) / 4) * (-0.685-(0.625)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.41-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.685 + (((tickAnim - 7) / 1) * (0-(-0.685)));
            zz = -0.41 + (((tickAnim - 7) / 1) * (-0.65-(-0.41)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.895-(0)));
            zz = -0.65 + (((tickAnim - 8) / 2) * (-0.955-(-0.65)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-0.075-(0)));
            yy = 0.895 + (((tickAnim - 10) / 2) * (1.77-(0.895)));
            zz = -0.955 + (((tickAnim - 10) / 2) * (-0.8-(-0.955)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -0.075 + (((tickAnim - 12) / 1) * (0-(-0.075)));
            yy = 1.77 + (((tickAnim - 12) / 1) * (0.91-(1.77)));
            zz = -0.8 + (((tickAnim - 12) / 1) * (-0.635-(-0.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.91 + (((tickAnim - 13) / 1) * (0.255-(0.91)));
            zz = -0.635 + (((tickAnim - 13) / 1) * (-0.32-(-0.635)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0.25-(0)));
            yy = 0.255 + (((tickAnim - 14) / 2) * (0.55-(0.255)));
            zz = -0.32 + (((tickAnim - 14) / 2) * (0-(-0.32)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.25 + (((tickAnim - 16) / 2) * (0.25-(0.25)));
            yy = 0.55 + (((tickAnim - 16) / 2) * (0.925-(0.55)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
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
            xx = 16.75 + (((tickAnim - 0) / 3) * (-8.63921-(16.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-6.0765-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.18133-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -8.63921 + (((tickAnim - 3) / 3) * (-32.08854-(-8.63921)));
            yy = -6.0765 + (((tickAnim - 3) / 3) * (-11.1403-(-6.0765)));
            zz = -2.18133 + (((tickAnim - 3) / 3) * (3.9991-(-2.18133)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -32.08854 + (((tickAnim - 6) / 10) * (19.5-(-32.08854)));
            yy = -11.1403 + (((tickAnim - 6) / 10) * (0-(-11.1403)));
            zz = 3.9991 + (((tickAnim - 6) / 10) * (0-(3.9991)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 19.5 + (((tickAnim - 16) / 2) * (16.75-(19.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.5 + (((tickAnim - 0) / 3) * (-30.02-(-10.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -30.02 + (((tickAnim - 3) / 3) * (18-(-30.02)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 18 + (((tickAnim - 6) / 9) * (18-(18)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 18 + (((tickAnim - 15) / 3) * (-10.5-(18)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.025 + (((tickAnim - 0) / 3) * (0.25-(0.025)));
            zz = 0.175 + (((tickAnim - 0) / 3) * (0.375-(0.175)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 3) * (-0.2-(0.25)));
            zz = 0.375 + (((tickAnim - 3) / 3) * (-0.125-(0.375)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = -0.2 + (((tickAnim - 6) / 9) * (-0.2-(-0.2)));
            zz = -0.125 + (((tickAnim - 6) / 9) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 3) * (0.025-(-0.2)));
            zz = -0.125 + (((tickAnim - 15) / 3) * (0.175-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 91.92052 + (((tickAnim - 0) / 3) * (89.49544-(91.92052)));
            yy = 17.79543 + (((tickAnim - 0) / 3) * (18.9766-(17.79543)));
            zz = 7.88998 + (((tickAnim - 0) / 3) * (10.3249-(7.88998)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 89.49544 + (((tickAnim - 3) / 3) * (13.79607-(89.49544)));
            yy = 18.9766 + (((tickAnim - 3) / 3) * (24.10548-(18.9766)));
            zz = 10.3249 + (((tickAnim - 3) / 3) * (8.51659-(10.3249)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 13.79607 + (((tickAnim - 6) / 3) * (-7.29341-(13.79607)));
            yy = 24.10548 + (((tickAnim - 6) / 3) * (18.6688-(24.10548)));
            zz = 8.51659 + (((tickAnim - 6) / 3) * (6.39188-(8.51659)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -7.29341 + (((tickAnim - 9) / 4) * (-23.93991-(-7.29341)));
            yy = 18.6688 + (((tickAnim - 9) / 4) * (14.43621-(18.6688)));
            zz = 6.39188 + (((tickAnim - 9) / 4) * (9.1721-(6.39188)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -23.93991 + (((tickAnim - 13) / 2) * (27.75386-(-23.93991)));
            yy = 14.43621 + (((tickAnim - 13) / 2) * (9.9221-(14.43621)));
            zz = 9.1721 + (((tickAnim - 13) / 2) * (13.6869-(9.1721)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 27.75386 + (((tickAnim - 15) / 3) * (91.92052-(27.75386)));
            yy = 9.9221 + (((tickAnim - 15) / 3) * (17.79543-(9.9221)));
            zz = 13.6869 + (((tickAnim - 15) / 3) * (7.88998-(13.6869)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.275 + (((tickAnim - 0) / 3) * (0.11-(0.275)));
            yy = 1.275 + (((tickAnim - 0) / 3) * (0.71-(1.275)));
            zz = -1.45 + (((tickAnim - 0) / 3) * (-1.165-(-1.45)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.11 + (((tickAnim - 3) / 3) * (0.35-(0.11)));
            yy = 0.71 + (((tickAnim - 3) / 3) * (0.65-(0.71)));
            zz = -1.165 + (((tickAnim - 3) / 3) * (0-(-1.165)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.35 + (((tickAnim - 6) / 3) * (0.2-(0.35)));
            yy = 0.65 + (((tickAnim - 6) / 3) * (0.885-(0.65)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.2 + (((tickAnim - 9) / 4) * (0.1-(0.2)));
            yy = 0.885 + (((tickAnim - 9) / 4) * (0.15-(0.885)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.1 + (((tickAnim - 13) / 2) * (0-(0.1)));
            yy = 0.15 + (((tickAnim - 13) / 2) * (0.65-(0.15)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0.275-(0)));
            yy = 0.65 + (((tickAnim - 15) / 3) * (1.275-(0.65)));
            zz = 0 + (((tickAnim - 15) / 3) * (-1.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -13.29423 + (((tickAnim - 0) / 8) * (19.5-(-13.29423)));
            yy = 2.04839 + (((tickAnim - 0) / 8) * (0-(2.04839)));
            zz = -1.72101 + (((tickAnim - 0) / 8) * (0-(-1.72101)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 19.5 + (((tickAnim - 8) / 3) * (-8.63921-(19.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (6.07653-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-2.18133-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -8.63921 + (((tickAnim - 11) / 3) * (-32.08854-(-8.63921)));
            yy = 6.07653 + (((tickAnim - 11) / 3) * (11.1403-(6.07653)));
            zz = -2.18133 + (((tickAnim - 11) / 3) * (-3.9991-(-2.18133)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -32.08854 + (((tickAnim - 14) / 4) * (-13.29423-(-32.08854)));
            yy = 11.1403 + (((tickAnim - 14) / 4) * (2.04839-(11.1403)));
            zz = -3.9991 + (((tickAnim - 14) / 4) * (-1.72101-(-3.9991)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18.25 + (((tickAnim - 0) / 8) * (-17.75-(18.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -17.75 + (((tickAnim - 8) / 10) * (18.25-(-17.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15.75 + (((tickAnim - 0) / 2) * (22.22-(15.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 22.22 + (((tickAnim - 2) / 4) * (-15.28-(22.22)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -15.28 + (((tickAnim - 6) / 2) * (-12.5-(-15.28)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 8) / 10) * (15.75-(-12.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 4) * (-0.015-(-0.075)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.02-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.015 + (((tickAnim - 4) / 2) * (-0.31-(-0.015)));
            zz = -0.02 + (((tickAnim - 4) / 2) * (0.175-(-0.02)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.31 + (((tickAnim - 6) / 2) * (-0.6-(-0.31)));
            zz = 0.175 + (((tickAnim - 6) / 2) * (0.125-(0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.6 + (((tickAnim - 8) / 10) * (-0.075-(-0.6)));
            zz = 0.125 + (((tickAnim - 8) / 10) * (0-(0.125)));
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
            xx = 19.75 + (((tickAnim - 0) / 2) * (20.32-(19.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 20.32 + (((tickAnim - 2) / 2) * (-17.1-(20.32)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -17.1 + (((tickAnim - 4) / 4) * (27.5-(-17.1)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.5 + (((tickAnim - 8) / 3) * (-3.33-(27.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -3.33 + (((tickAnim - 11) / 7) * (19.75-(-3.33)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 25.48451 + (((tickAnim - 0) / 2) * (39.21944-(25.48451)));
            yy = 21.16653 + (((tickAnim - 0) / 2) * (16.4451-(21.16653)));
            zz = 7.23042 + (((tickAnim - 0) / 2) * (4.91397-(7.23042)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 39.21944 + (((tickAnim - 2) / 2) * (35.35968-(39.21944)));
            yy = 16.4451 + (((tickAnim - 2) / 2) * (10.54332-(16.4451)));
            zz = 4.91397 + (((tickAnim - 2) / 2) * (2.01839-(4.91397)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 35.35968 + (((tickAnim - 4) / 2) * (5.64383-(35.35968)));
            yy = 10.54332 + (((tickAnim - 4) / 2) * (7.00224-(10.54332)));
            zz = 2.01839 + (((tickAnim - 4) / 2) * (0.28105-(2.01839)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 5.64383 + (((tickAnim - 6) / 2) * (2.92798-(5.64383)));
            yy = 7.00224 + (((tickAnim - 6) / 2) * (3.46117-(7.00224)));
            zz = 0.28105 + (((tickAnim - 6) / 2) * (-1.45629-(0.28105)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 2.92798 + (((tickAnim - 8) / 3) * (13.9613-(2.92798)));
            yy = 3.46117 + (((tickAnim - 8) / 3) * (12.33802-(3.46117)));
            zz = -1.45629 + (((tickAnim - 8) / 3) * (-1.14565-(-1.45629)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 13.9613 + (((tickAnim - 11) / 2) * (-10.3757-(13.9613)));
            yy = 12.33802 + (((tickAnim - 11) / 2) * (16.63452-(12.33802)));
            zz = -1.14565 + (((tickAnim - 11) / 2) * (5.78189-(-1.14565)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10.3757 + (((tickAnim - 13) / 5) * (25.48451-(-10.3757)));
            yy = 16.63452 + (((tickAnim - 13) / 5) * (21.16653-(16.63452)));
            zz = 5.78189 + (((tickAnim - 13) / 5) * (7.23042-(5.78189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.895-(0)));
            zz = -0.65 + (((tickAnim - 0) / 2) * (-0.955-(-0.65)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-0.075-(0)));
            yy = 0.895 + (((tickAnim - 2) / 1) * (1.77-(0.895)));
            zz = -0.955 + (((tickAnim - 2) / 1) * (-0.8-(-0.955)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.075 + (((tickAnim - 3) / 1) * (0-(-0.075)));
            yy = 1.77 + (((tickAnim - 3) / 1) * (0.91-(1.77)));
            zz = -0.8 + (((tickAnim - 3) / 1) * (-0.635-(-0.8)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.91 + (((tickAnim - 4) / 2) * (0.255-(0.91)));
            zz = -0.635 + (((tickAnim - 4) / 2) * (-0.32-(-0.635)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.255 + (((tickAnim - 6) / 2) * (0.5-(0.255)));
            zz = -0.32 + (((tickAnim - 6) / 2) * (0-(-0.32)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 3) * (1.125-(0.5)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.21-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.125 + (((tickAnim - 11) / 2) * (-0.445-(1.125)));
            zz = -0.21 + (((tickAnim - 11) / 2) * (-0.43-(-0.21)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.445 + (((tickAnim - 13) / 5) * (0-(-0.445)));
            zz = -0.43 + (((tickAnim - 13) / 5) * (-0.65-(-0.43)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 18 + (((tickAnim - 8) / 3) * (-30.02-(18)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -30.02 + (((tickAnim - 11) / 3) * (13.75-(-30.02)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 13.75 + (((tickAnim - 14) / 4) * (0-(13.75)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 3) * (0.25-(-0.2)));
            zz = -0.125 + (((tickAnim - 8) / 3) * (0.375-(-0.125)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 11) / 3) * (-0.375-(0.25)));
            zz = 0.375 + (((tickAnim - 11) / 3) * (-0.175-(0.375)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -0.375 + (((tickAnim - 14) / 4) * (0-(-0.375)));
            zz = -0.175 + (((tickAnim - 14) / 4) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 9.93181 + (((tickAnim - 0) / 8) * (27.75386-(9.93181)));
            yy = -16.78801 + (((tickAnim - 0) / 8) * (-9.92213-(-16.78801)));
            zz = -3.3605 + (((tickAnim - 0) / 8) * (-13.68688-(-3.3605)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.75386 + (((tickAnim - 8) / 3) * (89.49544-(27.75386)));
            yy = -9.92213 + (((tickAnim - 8) / 3) * (-18.97655-(-9.92213)));
            zz = -13.68688 + (((tickAnim - 8) / 3) * (-10.32487-(-13.68688)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 89.49544 + (((tickAnim - 11) / 3) * (19.37422-(89.49544)));
            yy = -18.97655 + (((tickAnim - 11) / 3) * (-15.55469-(-18.97655)));
            zz = -10.32487 + (((tickAnim - 11) / 3) * (-5.74097-(-10.32487)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 19.37422 + (((tickAnim - 14) / 4) * (9.93181-(19.37422)));
            yy = -15.55469 + (((tickAnim - 14) / 4) * (-16.78801-(-15.55469)));
            zz = -5.74097 + (((tickAnim - 14) / 4) * (-3.3605-(-5.74097)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 8) * (1.325-(0.275)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0.06-(0)));
            yy = 1.325 + (((tickAnim - 8) / 1) * (2.105-(1.325)));
            zz = -0.225 + (((tickAnim - 8) / 1) * (-0.58-(-0.225)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0.06 + (((tickAnim - 9) / 2) * (0.11-(0.06)));
            yy = 2.105 + (((tickAnim - 9) / 2) * (1.01-(2.105)));
            zz = -0.58 + (((tickAnim - 9) / 2) * (-1.39-(-0.58)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0.11 + (((tickAnim - 11) / 3) * (-0.1-(0.11)));
            yy = 1.01 + (((tickAnim - 11) / 3) * (0.025-(1.01)));
            zz = -1.39 + (((tickAnim - 11) / 3) * (-0.25-(-1.39)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.1 + (((tickAnim - 14) / 4) * (0-(-0.1)));
            yy = 0.025 + (((tickAnim - 14) / 4) * (0.275-(0.025)));
            zz = -0.25 + (((tickAnim - 14) / 4) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-60))*-3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411))*-2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*-4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411))*-0.3);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5))*-0.7);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-80))*-0.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-100))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*4), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-180))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-180))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-80))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-250))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-250))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-140))*-3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-280))*-3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*-3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-100))*-1.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*3));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-100))*4), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*-1), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-150))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-300))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraJinyunpelta e = (EntityPrehistoricFloraJinyunpelta) entity;
        animator.update(entity);


    }
}
