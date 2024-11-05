package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraNigerpeton;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelNigerpeton extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer bone9;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer bone10;
    private final AdvancedModelRenderer bone12;
    private final AdvancedModelRenderer bone14;
    private final AdvancedModelRenderer bone17;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer bone8;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer bone13;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer bone11;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;

    private ModelAnimator animator;

    public ModelNigerpeton() {
        this.textureWidth = 81;
        this.textureHeight = 74;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 22.0F, 3.0F);
        this.hips.cubeList.add(new ModelBox(hips, 25, 20, -4.0F, -4.25F, -4.0F, 8, 6, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.25F, -14.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0262F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 33, -3.5F, 0.25F, 10.05F, 7, 1, 6, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.0F, 0.0F, -0.25F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2618F, 0.7854F, 0.1745F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 61, -1.5F, -1.0F, -1.5F, 4, 2, 3, 0.01F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -1.2654F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 68, 42, -0.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(3.25F, 0.0F, 0.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.0F, 0.5236F, -0.4363F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 64, 50, -0.25F, -0.5F, -1.5F, 3, 1, 3, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.0F, 0.0F, -0.25F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2618F, -0.7854F, -0.1745F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 61, -2.5F, -1.0F, -1.5F, 4, 2, 3, 0.01F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 1.2654F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 68, 42, -3.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-3.25F, 0.0F, 0.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.0F, -0.5236F, 0.4363F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 64, 50, -2.75F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.5F, 2.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1745F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 31, 8, -3.0F, -1.75F, -1.0F, 6, 5, 6, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 29, 52, 0.0F, -2.75F, 0.0F, 0, 7, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 41, -2.0F, -1.5F, -1.0F, 4, 4, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 52, 0.0F, -3.5F, 0.0F, 0, 8, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 54, 50, -1.0F, -1.25F, -1.0F, 2, 3, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 63, 0.0F, -3.25F, 0.0F, 0, 7, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 67, -0.5F, -1.0F, -1.0F, 1, 2, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 56, 9, 0.0F, -2.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, -3.5F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -1.25F, -6.5F, 9, 6, 7, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.25F, -10.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0262F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -4.0F, 0.15F, 4.05F, 8, 1, 7, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 14, -5.0F, -1.25F, -4.5F, 10, 6, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.25F, -4.5F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0262F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 0, -4.5F, 0.0F, 0.05F, 9, 1, 5, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(5.0F, 3.0F, -2.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.1745F, -0.7418F, 0.2182F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 37, 62, -1.5F, -1.0F, -1.5F, 4, 2, 3, 0.01F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0F, 1.309F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 69, 4, -0.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(3.25F, 0.0F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0873F, 0.3491F, -0.3054F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 35, 68, -0.25F, -0.5F, -1.5F, 3, 1, 3, 0.0F, true));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-5.0F, 3.0F, -2.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.1745F, 0.7418F, -0.2182F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 37, 62, -2.5F, -1.0F, -1.5F, 4, 2, 3, 0.01F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0F, -1.309F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 69, 4, -3.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-3.25F, 0.0F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0873F, -0.3491F, 0.3054F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 35, 68, -2.75F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 40, 41, -4.5F, -1.0F, -1.75F, 9, 4, 2, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 43, -4.0F, -2.0F, -1.75F, 8, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.5F, 3.25F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 20, -4.0F, -1.7F, -5.15F, 8, 2, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.neck.addChild(head);


        this.bone9 = new AdvancedModelRenderer(this);
        this.bone9.setRotationPoint(0.0F, 1.5F, -8.0F);
        this.head.addChild(bone9);
        this.setRotateAngle(bone9, -0.0873F, 0.0F, 0.0F);
        this.bone9.cubeList.add(new ModelBox(bone9, 25, 65, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.01F, false));
        this.bone9.cubeList.add(new ModelBox(bone9, 0, 5, 0.1F, -1.035F, -3.6F, 1, 0, 1, 0.0F, false));
        this.bone9.cubeList.add(new ModelBox(bone9, 0, 5, -1.1F, -1.035F, -3.6F, 1, 0, 1, 0.0F, true));
        this.bone9.cubeList.add(new ModelBox(bone9, 0, 17, -1.0F, -0.25F, -3.7F, 2, 1, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.bone9.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 4, 0, 0.65F, -0.05F, 3.7F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.bone9.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2618F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 28, 0.1F, -0.5F, 2.65F, 0, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.1F, -0.5F, 0.4F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.bone9.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 0, 0.65F, -0.25F, 1.5F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.bone9.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2967F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 61, 64, 0.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.bone9.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3491F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 0, -0.65F, -0.25F, 1.5F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.bone9.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 0, -0.65F, -0.05F, 3.7F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.bone9.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2618F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 4, 28, -0.1F, -0.5F, 2.65F, 0, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.1F, -0.5F, 0.4F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.bone9.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2967F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 61, 64, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.bone10 = new AdvancedModelRenderer(this);
        this.bone10.setRotationPoint(2.4F, -0.05F, -0.45F);
        this.bone9.addChild(bone10);
        this.setRotateAngle(bone10, 0.0436F, -0.0436F, 0.0F);
        this.bone10.cubeList.add(new ModelBox(bone10, 26, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.bone12 = new AdvancedModelRenderer(this);
        this.bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone10.addChild(bone12);
        this.setRotateAngle(bone12, 0.0F, 0.6545F, 0.0F);
        this.bone12.cubeList.add(new ModelBox(bone12, 0, 26, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.bone14 = new AdvancedModelRenderer(this);
        this.bone14.setRotationPoint(-2.4F, -0.05F, -0.45F);
        this.bone9.addChild(bone14);
        this.setRotateAngle(bone14, 0.0436F, 0.0436F, 0.0F);
        this.bone14.cubeList.add(new ModelBox(bone14, 26, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.bone17 = new AdvancedModelRenderer(this);
        this.bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone14.addChild(bone17);
        this.setRotateAngle(bone17, 0.0F, -0.6545F, 0.0F);
        this.bone17.cubeList.add(new ModelBox(bone17, 0, 26, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.01F, true));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, 1.5F, -8.0F);
        this.head.addChild(bone7);
        this.setRotateAngle(bone7, 0.0873F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.bone7.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3229F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.5431F, -0.5F, 0.4916F, 0, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.bone7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3229F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.5431F, -0.5F, 0.4916F, 0, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.bone7.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3054F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 43, -0.15F, -1.0F, -0.25F, 2, 1, 5, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.bone7.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3054F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 58, 43, -1.85F, -1.0F, -0.25F, 2, 1, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone7.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 50, 2, -2.0F, -1.0F, -0.3F, 4, 1, 5, 0.01F, false));

        this.bone8 = new AdvancedModelRenderer(this);
        this.bone8.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bone7.addChild(bone8);
        this.setRotateAngle(bone8, -0.3054F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.bone8.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.3054F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 0.2884F, -0.75F, -0.0752F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 63, 35, 0.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(3.5F, 0.0F, 0.0F);
        this.bone8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.3054F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -0.2884F, -0.75F, -0.0752F, 0, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 63, 35, -2.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 48, -3.5F, -2.0F, 0.0F, 7, 2, 4, 0.01F, false));

        this.bone13 = new AdvancedModelRenderer(this);
        this.bone13.setRotationPoint(0.0F, 0.5F, -9.4F);
        this.head.addChild(bone13);
        this.setRotateAngle(bone13, 0.1745F, 0.0F, 0.0F);
        this.bone13.cubeList.add(new ModelBox(bone13, 69, 20, -1.5F, 0.0F, 0.45F, 3, 1, 3, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.bone13.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.6981F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 14, -1.75F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 14, 0.75F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, 3.35F);
        this.bone13.addChild(bone5);
        this.setRotateAngle(bone5, 0.2182F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 64, 0, -2.5F, 0.0F, 0.0F, 5, 1, 2, 0.01F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, -0.2618F, 0.0F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 35, -3.5F, 0.0F, 0.0F, 7, 2, 5, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(0.15F, -0.5F, -4.55F);
        this.head.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.2618F, 0.0F, -0.4363F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.6F, 0.75F, -1.5F);
        this.leftEye.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 35, -2.6F, -0.75F, 0.5F, 2, 1, 2, 0.01F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-0.15F, -0.5F, -4.55F);
        this.head.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.2618F, 0.0F, 0.4363F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.6F, 0.75F, -1.5F);
        this.rightEye.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 35, 0.6F, -0.75F, 0.5F, 2, 1, 2, 0.01F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.1F, 2.25F, -0.9F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 67, 28, -0.9F, -0.25F, -11.05F, 2, 1, 4, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.65F, -0.25F, -10.1F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0873F, -0.2618F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 26, 14, 0.0F, -1.5F, -0.7F, 0, 2, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.8F, 0.0F, -11.0F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.3491F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.15F, -0.75F, 1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, 0.0F, -11.0F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.3491F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -0.15F, -0.75F, 1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.8F, 0.0F, -11.0F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.2967F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 67, 14, -0.1F, -0.25F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.0F, 0.0F, -11.0F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.2967F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 67, 14, -1.9F, -0.25F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.85F, -0.25F, -10.1F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0873F, 0.2618F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 14, 0.0F, -1.5F, -0.7F, 0, 2, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, 0.75F, -6.05F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1309F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 48, -4.4F, -1.7F, 4.0F, 7, 2, 4, 0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, 0.75F, -6.05F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1745F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 55, 59, -3.9F, -1.9F, 2.1F, 6, 2, 2, 0.01F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 62, 9, -2.9F, -0.95F, -0.8F, 4, 1, 3, 0.01F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.1F, 0.75F, -7.0F);
        this.jaw.addChild(bone2);
        this.setRotateAngle(bone2, 0.1745F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 55, -2.0F, -1.0F, -0.05F, 4, 1, 4, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-2.4F, 0.0F, -0.05F);
        this.bone2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.2356F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, 0.3F, -1.4F, 1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.4F, 0.0F, -0.05F);
        this.bone2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.2618F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 48, 64, 0.25F, -1.0F, -0.25F, 2, 1, 4, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.4F, 0.0F, -0.05F);
        this.bone2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.2356F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 0, -0.3F, -1.4F, 1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(2.4F, 0.0F, -0.05F);
        this.bone2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.2618F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 48, 64, -2.25F, -1.0F, -0.25F, 2, 1, 4, 0.0F, false));

        this.bone11 = new AdvancedModelRenderer(this);
        this.bone11.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.bone2.addChild(bone11);
        this.setRotateAngle(bone11, -0.2182F, 0.0F, 0.0F);
        this.bone11.cubeList.add(new ModelBox(bone11, 46, 33, -3.0F, 0.0F, -0.05F, 6, 1, 4, 0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-3.2F, 1.0F, -0.35F);
        this.bone11.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.3054F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 40, 55, 0.0F, -0.95F, -0.1F, 2, 1, 5, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(3.2F, 1.0F, -0.35F);
        this.bone11.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.3054F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 40, 55, -2.0F, -0.95F, -0.1F, 2, 1, 5, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.9F, 0.25F, 1.0F);
        this.bone11.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.8727F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 54, 25, -3.9F, -3.25F, -0.05F, 6, 4, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.0F, 1.2654F, 0.0F);
        this.setRotateAngle(rightLeg1, -0.2618F, -0.7854F, -0.1745F);
        this.setRotateAngle(rightHand, 0.0873F, -0.3491F, 0.3054F);
        this.setRotateAngle(rightFoot, 0.0F, -0.5236F, 0.4363F);
        this.setRotateAngle(rightEye, 0.2618F, 0.0F, 0.4363F);
        this.setRotateAngle(rightArm2, 0.0F, -1.309F, 0.0F);
        this.setRotateAngle(rightArm1, 0.1745F, 0.7418F, -0.2182F);
        this.setRotateAngle(neck, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.0F, -1.2654F, 0.0F);
        this.setRotateAngle(leftLeg1, -0.2618F, 0.7854F, 0.1745F);
        this.setRotateAngle(leftHand, 0.0873F, 0.3491F, -0.3054F);
        this.setRotateAngle(leftFoot, 0.0F, 0.5236F, -0.4363F);
        this.setRotateAngle(leftEye, 0.2618F, 0.0F, -0.4363F);
        this.setRotateAngle(leftArm2, 0.0F, 1.309F, 0.0F);
        this.setRotateAngle(leftArm1, 0.1745F, -0.7418F, 0.2182F);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.2967F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0436F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r36, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r35, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r34, 0.0F, 0.2356F, 0.0F);
        this.setRotateAngle(cube_r33, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r32, 0.0F, -0.2356F, 0.0F);
        this.setRotateAngle(cube_r31, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.0873F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r28, 0.0F, 0.2967F, 0.0F);
        this.setRotateAngle(cube_r27, 0.0F, -0.2967F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r25, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r24, -0.0873F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.3229F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, -0.3229F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, 0.2967F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0436F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(bone9, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(bone8, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(bone7, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(bone6, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(bone5, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(bone2, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(bone17, 0.0F, -0.6545F, 0.0F);
        this.setRotateAngle(bone14, 0.0436F, 0.0436F, 0.0F);
        this.setRotateAngle(bone13, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(bone12, 0.0F, 0.6545F, 0.0F);
        this.setRotateAngle(bone11, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(bone10, 0.0436F, -0.0436F, 0.0F);
        this.neck.offsetY = -0.02F;
        this.neck.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail4, 0.0492F, 0.4795F, 0.0227F);
        this.setRotateAngle(tail3, 0.0464F, 0.3487F, 0.0159F);
        this.setRotateAngle(tail2, 0.0915F, 0.3042F, 0.0275F);
        this.setRotateAngle(tail1, -0.1787F, 0.2148F, -0.0385F);
        this.setRotateAngle(rightLeg2, 0.0F, 1.2654F, 0.0F);
        this.setRotateAngle(rightLeg1, -0.3927F, -0.4097F, -0.1347F);
        this.setRotateAngle(rightHand, 0.0873F, -0.3491F, 0.3054F);
        this.setRotateAngle(rightFoot, 0.0F, -0.5236F, 0.4363F);
        this.setRotateAngle(rightEye, 0.2618F, 0.0F, 0.4363F);
        this.setRotateAngle(rightArm2, 0.0F, -1.309F, 0.0F);
        this.setRotateAngle(rightArm1, 0.2435F, 0.2546F, -0.212F);
        this.setRotateAngle(neck, -0.132F, -0.1298F, 0.0172F);
        this.setRotateAngle(leftLeg2, 0.0F, -1.2654F, 0.0F);
        this.setRotateAngle(leftLeg1, -0.409F, 0.2262F, 0.1363F);
        this.setRotateAngle(leftHand, 0.0873F, 0.3491F, -0.3054F);
        this.setRotateAngle(leftFoot, 0.0F, 0.5236F, -0.4363F);
        this.setRotateAngle(leftEye, 0.2618F, 0.0F, -0.4363F);
        this.setRotateAngle(leftArm2, 0.0F, 1.309F, 0.0F);
        this.setRotateAngle(leftArm1, 0.1745F, -0.7418F, 0.2182F);
        this.setRotateAngle(jaw, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.2967F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0436F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r36, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r35, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r34, 0.0F, 0.2356F, 0.0F);
        this.setRotateAngle(cube_r33, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r32, 0.0F, -0.2356F, 0.0F);
        this.setRotateAngle(cube_r31, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.0873F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r28, 0.0F, 0.2967F, 0.0F);
        this.setRotateAngle(cube_r27, 0.0F, -0.2967F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r25, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r24, -0.0873F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.3229F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, -0.3229F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, 0.2967F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0436F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(bone9, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(bone8, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(bone7, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(bone6, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(bone5, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(bone2, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(bone17, 0.0F, -0.6545F, 0.0F);
        this.setRotateAngle(bone14, 0.0436F, 0.0436F, 0.0F);
        this.setRotateAngle(bone13, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(bone12, 0.0F, 0.6545F, 0.0F);
        this.setRotateAngle(bone11, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(bone10, 0.0436F, -0.0436F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1745F, 0.0F);
        this.hips.offsetY = -0.14F;
        this.hips.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraNigerpeton entitySilesaurus = (EntityPrehistoricFloraNigerpeton) e;

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraNigerpeton ee = (EntityPrehistoricFloraNigerpeton) entitylivingbaseIn;

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

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNigerpeton entity = (EntityPrehistoricFloraNigerpeton) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+15))*-2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-20))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.325+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5))*-0.05);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.45113 + (((tickAnim - 0) / 8) * (1.49856-(12.45113)));
            yy = -62.76208 + (((tickAnim - 0) / 8) * (-30.5177-(-62.76208)));
            zz = -10.55473 + (((tickAnim - 0) / 8) * (-26.06096-(-10.55473)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 1.49856 + (((tickAnim - 8) / 6) * (-3.0545-(1.49856)));
            yy = -30.5177 + (((tickAnim - 8) / 6) * (-4.38297-(-30.5177)));
            zz = -26.06096 + (((tickAnim - 8) / 6) * (-15.47866-(-26.06096)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -3.0545 + (((tickAnim - 14) / 4) * (2.71745-(-3.0545)));
            yy = -4.38297 + (((tickAnim - 14) / 4) * (13.1629-(-4.38297)));
            zz = -15.47866 + (((tickAnim - 14) / 4) * (3.2056-(-15.47866)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 2.71745 + (((tickAnim - 18) / 17) * (12.45113-(2.71745)));
            yy = 13.1629 + (((tickAnim - 18) / 17) * (-62.76208-(13.1629)));
            zz = 3.2056 + (((tickAnim - 18) / 17) * (-10.55473-(3.2056)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.14275 + (((tickAnim - 0) / 8) * (25.10348-(15.14275)));
            yy = 13.545 + (((tickAnim - 0) / 8) * (35.94119-(13.545)));
            zz = 22.48614 + (((tickAnim - 0) / 8) * (10.77223-(22.48614)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 25.10348 + (((tickAnim - 8) / 6) * (12.04992-(25.10348)));
            yy = 35.94119 + (((tickAnim - 8) / 6) * (47.91439-(35.94119)));
            zz = 10.77223 + (((tickAnim - 8) / 6) * (11.04039-(10.77223)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 12.04992 + (((tickAnim - 14) / 4) * (5.85524-(12.04992)));
            yy = 47.91439 + (((tickAnim - 14) / 4) * (30.0501-(47.91439)));
            zz = 11.04039 + (((tickAnim - 14) / 4) * (9.945-(11.04039)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 5.85524 + (((tickAnim - 18) / 17) * (15.14275-(5.85524)));
            yy = 30.0501 + (((tickAnim - 18) / 17) * (13.545-(30.0501)));
            zz = 9.945 + (((tickAnim - 18) / 17) * (22.48614-(9.945)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.72235 + (((tickAnim - 0) / 3) * (28.68565-(37.72235)));
            yy = -28.02954 + (((tickAnim - 0) / 3) * (-47.90994-(-28.02954)));
            zz = 34.20739 + (((tickAnim - 0) / 3) * (48.39306-(34.20739)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 28.68565 + (((tickAnim - 3) / 5) * (37.05854-(28.68565)));
            yy = -47.90994 + (((tickAnim - 3) / 5) * (-8.54139-(-47.90994)));
            zz = 48.39306 + (((tickAnim - 3) / 5) * (42.38819-(48.39306)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 37.05854 + (((tickAnim - 8) / 6) * (16.77658-(37.05854)));
            yy = -8.54139 + (((tickAnim - 8) / 6) * (13.44107-(-8.54139)));
            zz = 42.38819 + (((tickAnim - 8) / 6) * (30.28457-(42.38819)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 16.77658 + (((tickAnim - 14) / 4) * (0-(16.77658)));
            yy = 13.44107 + (((tickAnim - 14) / 4) * (28.75-(13.44107)));
            zz = 30.28457 + (((tickAnim - 14) / 4) * (0-(30.28457)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (-32.4493-(0)));
            yy = 28.75 + (((tickAnim - 18) / 6) * (31.91155-(28.75)));
            zz = 0 + (((tickAnim - 18) / 6) * (-26.67047-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -32.4493 + (((tickAnim - 24) / 11) * (37.72235-(-32.4493)));
            yy = 31.91155 + (((tickAnim - 24) / 11) * (-28.02954-(31.91155)));
            zz = -26.67047 + (((tickAnim - 24) / 11) * (34.20739-(-26.67047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = -0.525 + (((tickAnim - 24) / 11) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 2.71745 + (((tickAnim - 0) / 18) * (12.45113-(2.71745)));
            yy = -13.16287 + (((tickAnim - 0) / 18) * (62.7621-(-13.16287)));
            zz = -3.20563 + (((tickAnim - 0) / 18) * (10.5547-(-3.20563)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 12.45113 + (((tickAnim - 18) / 9) * (0.58228-(12.45113)));
            yy = 62.7621 + (((tickAnim - 18) / 9) * (28.92571-(62.7621)));
            zz = 10.5547 + (((tickAnim - 18) / 9) * (25.89819-(10.5547)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0.58228 + (((tickAnim - 27) / 4) * (-6.03175-(0.58228)));
            yy = 28.92571 + (((tickAnim - 27) / 4) * (11.22372-(28.92571)));
            zz = 25.89819 + (((tickAnim - 27) / 4) * (24.54698-(25.89819)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -6.03175 + (((tickAnim - 31) / 4) * (2.71745-(-6.03175)));
            yy = 11.22372 + (((tickAnim - 31) / 4) * (-13.16287-(11.22372)));
            zz = 24.54698 + (((tickAnim - 31) / 4) * (-3.20563-(24.54698)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 5.85524 + (((tickAnim - 0) / 18) * (15.14275-(5.85524)));
            yy = -30.0501 + (((tickAnim - 0) / 18) * (-13.545-(-30.0501)));
            zz = -9.94503 + (((tickAnim - 0) / 18) * (-22.4861-(-9.94503)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 15.14275 + (((tickAnim - 18) / 13) * (22.15025-(15.14275)));
            yy = -13.545 + (((tickAnim - 18) / 13) * (-54.75562-(-13.545)));
            zz = -22.4861 + (((tickAnim - 18) / 13) * (-6.60503-(-22.4861)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 22.15025 + (((tickAnim - 31) / 4) * (5.85524-(22.15025)));
            yy = -54.75562 + (((tickAnim - 31) / 4) * (-30.0501-(-54.75562)));
            zz = -6.60503 + (((tickAnim - 31) / 4) * (-9.94503-(-6.60503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-39.9314-(0)));
            yy = -28.75 + (((tickAnim - 0) / 5) * (-41.6334-(-28.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (38.38371-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -39.9314 + (((tickAnim - 5) / 3) * (-89.42503-(-39.9314)));
            yy = -41.6334 + (((tickAnim - 5) / 3) * (-40.73295-(-41.6334)));
            zz = 38.38371 + (((tickAnim - 5) / 3) * (88.46055-(38.38371)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -89.42503 + (((tickAnim - 8) / 3) * (-46.03992-(-89.42503)));
            yy = -40.73295 + (((tickAnim - 8) / 3) * (-42.49614-(-40.73295)));
            zz = 88.46055 + (((tickAnim - 8) / 3) * (44.92208-(88.46055)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -46.03992 + (((tickAnim - 11) / 7) * (24.73334-(-46.03992)));
            yy = -42.49614 + (((tickAnim - 11) / 7) * (16.1594-(-42.49614)));
            zz = 44.92208 + (((tickAnim - 11) / 7) * (-22.0937-(44.92208)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 24.73334 + (((tickAnim - 18) / 9) * (37.21436-(24.73334)));
            yy = 16.1594 + (((tickAnim - 18) / 9) * (13.34232-(16.1594)));
            zz = -22.0937 + (((tickAnim - 18) / 9) * (-62.50975-(-22.0937)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 37.21436 + (((tickAnim - 27) / 4) * (5.54982-(37.21436)));
            yy = 13.34232 + (((tickAnim - 27) / 4) * (-11.33118-(13.34232)));
            zz = -62.50975 + (((tickAnim - 27) / 4) * (-53.90605-(-62.50975)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 5.54982 + (((tickAnim - 31) / 4) * (0-(5.54982)));
            yy = -11.33118 + (((tickAnim - 31) / 4) * (-28.75-(-11.33118)));
            zz = -53.90605 + (((tickAnim - 31) / 4) * (0-(-53.90605)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.85 + (((tickAnim - 8) / 10) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-2.25), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+10))*2), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-6.75), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+40))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-4.75), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+80))*4), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(2.25), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+20))*4), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+30))*4), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+60))*-3), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0.45897 + (((tickAnim - 0) / 20) * (12.17086-(0.45897)));
            yy = 47.35475 + (((tickAnim - 0) / 20) * (-14.0175-(47.35475)));
            zz = 1.45541 + (((tickAnim - 0) / 20) * (-14.3851-(1.45541)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 12.17086 + (((tickAnim - 20) / 6) * (12.66428-(12.17086)));
            yy = -14.0175 + (((tickAnim - 20) / 6) * (27.52462-(-14.0175)));
            zz = -14.3851 + (((tickAnim - 20) / 6) * (-25.27795-(-14.3851)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 12.66428 + (((tickAnim - 26) / 7) * (0.7076-(12.66428)));
            yy = 27.52462 + (((tickAnim - 26) / 7) * (55.71069-(27.52462)));
            zz = -25.27795 + (((tickAnim - 26) / 7) * (3.03477-(-25.27795)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0.7076 + (((tickAnim - 33) / 2) * (0.45897-(0.7076)));
            yy = 55.71069 + (((tickAnim - 33) / 2) * (47.35475-(55.71069)));
            zz = 3.03477 + (((tickAnim - 33) / 2) * (1.45541-(3.03477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 25.51973 + (((tickAnim - 0) / 20) * (10.25-(25.51973)));
            yy = -12.02014 + (((tickAnim - 0) / 20) * (-41.4283-(-12.02014)));
            zz = 21.31548 + (((tickAnim - 0) / 20) * (-9.7829-(21.31548)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 10.25 + (((tickAnim - 20) / 6) * (32.80465-(10.25)));
            yy = -41.4283 + (((tickAnim - 20) / 6) * (-38.36243-(-41.4283)));
            zz = -9.7829 + (((tickAnim - 20) / 6) * (-4.72602-(-9.7829)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 32.80465 + (((tickAnim - 26) / 4) * (-11.25291-(32.80465)));
            yy = -38.36243 + (((tickAnim - 26) / 4) * (-17.18101-(-38.36243)));
            zz = -4.72602 + (((tickAnim - 26) / 4) * (-38.05563-(-4.72602)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -11.25291 + (((tickAnim - 30) / 3) * (28.34636-(-11.25291)));
            yy = -17.18101 + (((tickAnim - 30) / 3) * (-9.3446-(-17.18101)));
            zz = -38.05563 + (((tickAnim - 30) / 3) * (24.45096-(-38.05563)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 28.34636 + (((tickAnim - 33) / 2) * (25.51973-(28.34636)));
            yy = -9.3446 + (((tickAnim - 33) / 2) * (-12.02014-(-9.3446)));
            zz = 24.45096 + (((tickAnim - 33) / 2) * (21.31548-(24.45096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-20.21042-(0)));
            yy = -2.25 + (((tickAnim - 0) / 9) * (26.21623-(-2.25)));
            zz = 0 + (((tickAnim - 0) / 9) * (-5.87359-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -20.21042 + (((tickAnim - 9) / 11) * (33.29417-(-20.21042)));
            yy = 26.21623 + (((tickAnim - 9) / 11) * (-2.0068-(26.21623)));
            zz = -5.87359 + (((tickAnim - 9) / 11) * (45.9423-(-5.87359)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 33.29417 + (((tickAnim - 20) / 6) * (-14.9632-(33.29417)));
            yy = -2.0068 + (((tickAnim - 20) / 6) * (-21.93557-(-2.0068)));
            zz = 45.9423 + (((tickAnim - 20) / 6) * (71.97769-(45.9423)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -14.9632 + (((tickAnim - 26) / 4) * (-5.64226-(-14.9632)));
            yy = -21.93557 + (((tickAnim - 26) / 4) * (-16.36119-(-21.93557)));
            zz = 71.97769 + (((tickAnim - 26) / 4) * (48.51732-(71.97769)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -5.64226 + (((tickAnim - 30) / 3) * (0-(-5.64226)));
            yy = -16.36119 + (((tickAnim - 30) / 3) * (-12.5-(-16.36119)));
            zz = 48.51732 + (((tickAnim - 30) / 3) * (0-(48.51732)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = -12.5 + (((tickAnim - 33) / 2) * (-2.25-(-12.5)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.17086 + (((tickAnim - 0) / 8) * (12.4139-(12.17086)));
            yy = 14.01753 + (((tickAnim - 0) / 8) * (-27.14129-(14.01753)));
            zz = 14.3851 + (((tickAnim - 0) / 8) * (24.32099-(14.3851)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12.4139 + (((tickAnim - 8) / 5) * (-2.23529-(12.4139)));
            yy = -27.14129 + (((tickAnim - 8) / 5) * (-45.53061-(-27.14129)));
            zz = 24.32099 + (((tickAnim - 8) / 5) * (16.82867-(24.32099)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -2.23529 + (((tickAnim - 13) / 4) * (0.7076-(-2.23529)));
            yy = -45.53061 + (((tickAnim - 13) / 4) * (-55.7107-(-45.53061)));
            zz = 16.82867 + (((tickAnim - 13) / 4) * (-3.0348-(16.82867)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0.7076 + (((tickAnim - 17) / 18) * (12.17086-(0.7076)));
            yy = -55.7107 + (((tickAnim - 17) / 18) * (14.01753-(-55.7107)));
            zz = -3.0348 + (((tickAnim - 17) / 18) * (14.3851-(-3.0348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.05768-(0)));
            yy = 41.42832 + (((tickAnim - 0) / 8) * (33.66289-(41.42832)));
            zz = 9.78287 + (((tickAnim - 0) / 8) * (6.46435-(9.78287)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12.05768 + (((tickAnim - 8) / 5) * (-12.98992-(12.05768)));
            yy = 33.66289 + (((tickAnim - 8) / 5) * (19.86963-(33.66289)));
            zz = 6.46435 + (((tickAnim - 8) / 5) * (10.94781-(6.46435)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -12.98992 + (((tickAnim - 13) / 4) * (28.34636-(-12.98992)));
            yy = 19.86963 + (((tickAnim - 13) / 4) * (9.3446-(19.86963)));
            zz = 10.94781 + (((tickAnim - 13) / 4) * (-24.451-(10.94781)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 28.34636 + (((tickAnim - 17) / 18) * (0-(28.34636)));
            yy = 9.3446 + (((tickAnim - 17) / 18) * (41.42832-(9.3446)));
            zz = -24.451 + (((tickAnim - 17) / 18) * (9.78287-(-24.451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 33.29417 + (((tickAnim - 0) / 8) * (19.92915-(33.29417)));
            yy = 2.00679 + (((tickAnim - 0) / 8) * (18.62132-(2.00679)));
            zz = -45.94226 + (((tickAnim - 0) / 8) * (-49.0792-(-45.94226)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 19.92915 + (((tickAnim - 8) / 5) * (8.8761-(19.92915)));
            yy = 18.62132 + (((tickAnim - 8) / 5) * (20.90197-(18.62132)));
            zz = -49.0792 + (((tickAnim - 8) / 5) * (-44.19727-(-49.0792)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 8.8761 + (((tickAnim - 13) / 4) * (0-(8.8761)));
            yy = 20.90197 + (((tickAnim - 13) / 4) * (12.5-(20.90197)));
            zz = -44.19727 + (((tickAnim - 13) / 4) * (0-(-44.19727)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (-14.5155-(0)));
            yy = 12.5 + (((tickAnim - 17) / 6) * (-0.1029-(12.5)));
            zz = 0 + (((tickAnim - 17) / 6) * (10.63299-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -14.5155 + (((tickAnim - 23) / 12) * (33.29417-(-14.5155)));
            yy = -0.1029 + (((tickAnim - 23) / 12) * (2.00679-(-0.1029)));
            zz = 10.63299 + (((tickAnim - 23) / 12) * (-45.94226-(10.63299)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+130))*3), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+170))*-3), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNigerpeton entity = (EntityPrehistoricFloraNigerpeton) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+15))*-4), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*2));
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(22.6067), leftLeg1.rotateAngleY + (float) Math.toRadians(-95.28759), leftLeg1.rotateAngleZ + (float) Math.toRadians(52.75798));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-12.62472), leftLeg2.rotateAngleY + (float) Math.toRadians(41.10098), leftLeg2.rotateAngleZ + (float) Math.toRadians(21.4617+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-6));
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(-2.99507), leftFoot.rotateAngleY + (float) Math.toRadians(-18.37447), leftFoot.rotateAngleZ + (float) Math.toRadians(49.445+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-30))*-7));
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(22.6067), rightLeg1.rotateAngleY + (float) Math.toRadians(95.2876), rightLeg1.rotateAngleZ + (float) Math.toRadians(-52.758));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-12.62472), rightLeg2.rotateAngleY + (float) Math.toRadians(-41.101), rightLeg2.rotateAngleZ + (float) Math.toRadians(-21.4617+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-6));
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(-2.99507), rightFoot.rotateAngleY + (float) Math.toRadians(18.3745), rightFoot.rotateAngleZ + (float) Math.toRadians(-49.445+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-30))*7));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(6.25), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+15))*-10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-5.75), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+65))*13), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-3.25), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+95))*17), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-2.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+175))*-20), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*2));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*7), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+100))*4), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(18.22736), leftArm1.rotateAngleY + (float) Math.toRadians(-24.7944), leftArm1.rotateAngleZ + (float) Math.toRadians(31.30891));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(4.07017), leftArm2.rotateAngleY + (float) Math.toRadians(-69.43957), leftArm2.rotateAngleZ + (float) Math.toRadians(12.6406+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-4));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0.39889), leftHand.rotateAngleY + (float) Math.toRadians(-22.53965), leftHand.rotateAngleZ + (float) Math.toRadians(48.2653+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-7));
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(18.22736), rightArm1.rotateAngleY + (float) Math.toRadians(24.7944), rightArm1.rotateAngleZ + (float) Math.toRadians(-31.3089));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(4.07017), rightArm2.rotateAngleY + (float) Math.toRadians(69.4396), rightArm2.rotateAngleZ + (float) Math.toRadians(-12.6406+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-4));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0.39889), rightHand.rotateAngleY + (float) Math.toRadians(22.5397), rightHand.rotateAngleZ + (float) Math.toRadians(-48.2653+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-7));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*4), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+220))*4), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNigerpeton entity = (EntityPrehistoricFloraNigerpeton) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+15))*-6), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*2));
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(22.6067), leftLeg1.rotateAngleY + (float) Math.toRadians(-95.28759), leftLeg1.rotateAngleZ + (float) Math.toRadians(52.75798));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-12.62472), leftLeg2.rotateAngleY + (float) Math.toRadians(41.10098), leftLeg2.rotateAngleZ + (float) Math.toRadians(21.4617+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-6));
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(-2.99507), leftFoot.rotateAngleY + (float) Math.toRadians(-18.37447), leftFoot.rotateAngleZ + (float) Math.toRadians(49.445+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-7));
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(22.6067), rightLeg1.rotateAngleY + (float) Math.toRadians(95.2876), rightLeg1.rotateAngleZ + (float) Math.toRadians(-52.758));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-12.62472), rightLeg2.rotateAngleY + (float) Math.toRadians(-41.101), rightLeg2.rotateAngleZ + (float) Math.toRadians(-21.4617+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-6));
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(-2.99507), rightFoot.rotateAngleY + (float) Math.toRadians(18.3745), rightFoot.rotateAngleZ + (float) Math.toRadians(-49.445+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*7));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(6.25), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+15))*-13), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-5.75), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+65))*17), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-3.25), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+95))*20), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-2.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+175))*-25), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*2));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*9), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*7), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(18.22736), leftArm1.rotateAngleY + (float) Math.toRadians(-24.7944), leftArm1.rotateAngleZ + (float) Math.toRadians(31.30891));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(4.07017), leftArm2.rotateAngleY + (float) Math.toRadians(-69.43957), leftArm2.rotateAngleZ + (float) Math.toRadians(12.6406+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0.39889), leftHand.rotateAngleY + (float) Math.toRadians(-22.53965), leftHand.rotateAngleZ + (float) Math.toRadians(48.2653+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-7));
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(18.22736), rightArm1.rotateAngleY + (float) Math.toRadians(24.7944), rightArm1.rotateAngleZ + (float) Math.toRadians(-31.3089));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(4.07017), rightArm2.rotateAngleY + (float) Math.toRadians(69.4396), rightArm2.rotateAngleZ + (float) Math.toRadians(-12.6406+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0.39889), rightHand.rotateAngleY + (float) Math.toRadians(22.5397), rightHand.rotateAngleZ + (float) Math.toRadians(-48.2653+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-7));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*4), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+220))*4), head.rotateAngleZ + (float) Math.toRadians(0));



    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNigerpeton entity = (EntityPrehistoricFloraNigerpeton) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (3.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -13 + (((tickAnim - 5) / 4) * (13.25-(-13)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 3.25 + (((tickAnim - 5) / 4) * (0-(3.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 13.25 + (((tickAnim - 9) / 5) * (0-(13.25)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -9.25 + (((tickAnim - 5) / 4) * (-14.75-(-9.25)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -14.75 + (((tickAnim - 9) / 5) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (45-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 45 + (((tickAnim - 5) / 3) * (0-(45)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraNigerpeton e = (EntityPrehistoricFloraNigerpeton) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
