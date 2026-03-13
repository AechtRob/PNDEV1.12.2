package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStruthiomimus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelStruthiomimus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftUpperPropatagium;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftLowerPropatagium;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftHand2;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightUpperPropatagium;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightLowerPropatagium;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightHand2;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r44;


    private ModelAnimator animator;

    public ModelStruthiomimus() {
        this.textureWidth = 135;
        this.textureHeight = 135;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -3.5F, -4.25F, -7.0F, 7, 11, 12, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 0, 46, -2.5F, 6.75F, -7.0F, 5, 1, 12, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-19.5F, -0.5F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 78, 19, 16.0F, -4.0F, -1.0F, 7, 4, 7, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-32.0F, -0.25F, -6.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 60, 28.0F, -4.0F, -1.0F, 8, 5, 8, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.6F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.3054F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 80, 0, -1.95F, -3.0F, -3.5F, 4, 11, 7, 0.0F, false));
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 50, 94, 1.6F, -3.0F, 3.5F, 0, 11, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 8.0F, -3.25F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9599F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 107, 11, -2.0F, -0.1569F, -0.2095F, 3, 13, 4, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 67, 109, -2.5F, -0.1569F, -0.2095F, 4, 7, 4, 0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.5F, 11.8431F, 1.7906F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 36, 118, -1.0F, 0.0F, -0.75F, 2, 8, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 6.975F, 0.25F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.2182F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 108, 74, -1.5F, 0.0F, -2.0F, 3, 1, 3, 0.01F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.5F, -1.75F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 122, 25, -1.5F, -0.5F, -2.75F, 3, 1, 3, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.6F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.3054F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 80, 0, -2.05F, -3.0F, -3.5F, 4, 11, 7, 0.0F, true));
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 50, 94, -1.6F, -3.0F, 3.5F, 0, 11, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 8.0F, -3.25F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9599F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 107, 11, -1.0F, -0.1569F, -0.2095F, 3, 13, 4, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 67, 109, -1.5F, -0.1569F, -0.2095F, 4, 7, 4, 0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.5F, 11.8431F, 1.7906F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 36, 118, -1.0F, 0.0F, -0.75F, 2, 8, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 6.975F, 0.25F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.2182F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 108, 74, -1.5F, 0.0F, -2.0F, 3, 1, 3, 0.01F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.5F, -1.75F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 122, 25, -1.5F, -0.5F, -2.75F, 3, 1, 3, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.75F, 4.5F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0873F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 66, 51, -2.0F, -2.25F, -0.5F, 4, 6, 10, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 19, 118, -1.0F, 3.75F, 0.5F, 2, 2, 6, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 79, 99, -2.0F, 3.75F, 0.5F, 4, 1, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-18.0F, -0.25F, 5.5F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 117, 16.0F, -2.0F, 0.0F, 4, 2, 5, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-18.5F, -0.25F, 0.5F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 105, 31, 16.0F, -2.0F, -1.0F, 5, 4, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 35, 51, -1.5F, -2.0F, -0.5F, 3, 4, 12, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 95, 63, -1.5F, 2.0F, -0.5F, 3, 1, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -1.0F, 7.5F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.3054F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 108, -2.0F, 0.0F, -4.0F, 2, 0, 8, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -1.0F, 7.5F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.3054F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 108, 0.0F, 0.0F, -4.0F, 2, 0, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.75F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 74, -1.0F, -1.0F, -0.5F, 2, 2, 12, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 104, 99, -1.0F, 1.0F, -0.5F, 2, 1, 9, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -0.25F, 4.5F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.3054F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 80, -3.0F, 0.0F, -4.0F, 3, 0, 11, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.8611F, 0.6521F, 4.5F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.6981F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 91, 87, -1.0F, 0.0F, -4.0F, 1, 0, 11, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.8611F, 0.6521F, 4.5F);
        this.tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.6981F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 91, 87, 0.0F, 0.0F, -4.0F, 1, 0, 11, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -0.25F, 4.5F);
        this.tail3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.3054F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 80, 0.0F, 0.0F, -4.0F, 3, 0, 11, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 11.25F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 76, 35, -0.5F, -0.5F, 0.0F, 1, 1, 13, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.4289F, 0.6493F, 4.25F);
        this.tail4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.7418F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 18, -3.0F, 0.0F, -4.0F, 3, 0, 16, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.0F, 4.25F);
        this.tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 35, -3.0F, 0.0F, -4.0F, 3, 0, 15, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.4289F, 0.6493F, 4.25F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.7418F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 18, 0.0F, 0.0F, -4.0F, 3, 0, 16, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.8993F, 15.9289F);
        this.tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 91, 80, -4.5F, 0.0F, 0.0F, 9, 0, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.25F, 13.0F);
        this.tail4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 78, 31, -3.5F, 0.0F, 0.0F, 7, 0, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.0F, 4.25F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.2182F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 39, 35, 0.0F, 0.0F, -4.0F, 3, 0, 15, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.75F, -6.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 24, -4.5F, -2.75F, -9.5F, 9, 11, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 62, 68, -3.0F, 8.25F, -9.5F, 6, 1, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 103, 0, -1.5F, 8.25F, -8.5F, 3, 2, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-32.5F, 1.25F, -9.5F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0349F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 0, 28.0F, -4.0F, 0.0F, 9, 6, 11, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.0F, -9.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 33, 68, -3.5F, -1.5F, -6.5F, 7, 8, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 6.5F, -6.5F);
        this.chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3927F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 110, -3.0F, 0.0F, 2.0F, 5, 1, 5, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 29, 84, -4.0F, -3.0F, 0.0F, 7, 3, 7, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-22.0F, 1.5F, -2.5F);
        this.chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 89, 18.0F, -3.0F, 0.0F, 8, 4, 5, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-5.5F, 1.5F, -6.5F);
        this.chest.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 100, 2.0F, -3.0F, 0.0F, 7, 4, 5, 0.01F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(3.0F, 5.0F, -4.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.6109F, 0.4363F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 25, 107, -1.0F, -1.25F, -0.5F, 2, 2, 8, 0.0F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 65, 121, -0.75F, -1.75F, -0.75F, 2, 3, 4, 0.0F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 84, 109, 1.0F, -4.25F, -0.5F, 0, 3, 8, 0.0F, false));

        this.leftUpperPropatagium = new AdvancedModelRenderer(this);
        this.leftUpperPropatagium.setRotationPoint(0.0F, 0.75F, 2.5F);
        this.leftArm1.addChild(leftUpperPropatagium);
        this.setRotateAngle(leftUpperPropatagium, -0.2618F, 0.0F, 0.0F);
        this.leftUpperPropatagium.cubeList.add(new ModelBox(leftUpperPropatagium, 79, 92, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, -0.25F, 7.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.2654F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 120, 58, -0.25F, -1.0F, -0.5F, 1, 2, 5, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 60, 93, 0.7F, -4.0F, -2.5F, 0, 5, 9, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 120, 66, -0.75F, -1.0F, -0.5F, 1, 2, 5, -0.01F, false));

        this.leftLowerPropatagium = new AdvancedModelRenderer(this);
        this.leftLowerPropatagium.setRotationPoint(0.0F, 1.0F, 3.5F);
        this.leftArm2.addChild(leftLowerPropatagium);
        this.setRotateAngle(leftLowerPropatagium, 0.3927F, 0.0F, 0.0F);
        this.leftLowerPropatagium.cubeList.add(new ModelBox(leftLowerPropatagium, 91, 121, -0.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2618F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 126, 4, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 120, 110, -0.5F, -1.0F, 2.0F, 1, 2, 5, 0.0F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 118, 119, 0.55F, -3.0F, 0.0F, 0, 4, 6, 0.0F, false));

        this.leftHand2 = new AdvancedModelRenderer(this);
        this.leftHand2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.leftHand.addChild(leftHand2);
        this.setRotateAngle(leftHand2, -0.2618F, 0.0F, 0.0F);
        this.leftHand2.cubeList.add(new ModelBox(leftHand2, 122, 11, -0.5F, -1.0F, 0.0F, 1, 1, 5, -0.01F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.0F, 5.0F, -4.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.6109F, -0.4363F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 25, 107, -1.0F, -1.25F, -0.5F, 2, 2, 8, 0.0F, true));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 65, 121, -1.25F, -1.75F, -0.75F, 2, 3, 4, 0.0F, true));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 84, 109, -1.0F, -4.25F, -0.5F, 0, 3, 8, 0.0F, true));

        this.rightUpperPropatagium = new AdvancedModelRenderer(this);
        this.rightUpperPropatagium.setRotationPoint(0.0F, 0.75F, 2.5F);
        this.rightArm1.addChild(rightUpperPropatagium);
        this.setRotateAngle(rightUpperPropatagium, -0.2618F, 0.0F, 0.0F);
        this.rightUpperPropatagium.cubeList.add(new ModelBox(rightUpperPropatagium, 79, 92, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, -0.25F, 7.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.2654F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 120, 58, -0.75F, -1.0F, -0.5F, 1, 2, 5, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 60, 93, -0.7F, -4.0F, -2.5F, 0, 5, 9, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 120, 66, -0.25F, -1.0F, -0.5F, 1, 2, 5, -0.01F, true));

        this.rightLowerPropatagium = new AdvancedModelRenderer(this);
        this.rightLowerPropatagium.setRotationPoint(0.0F, 1.0F, 3.5F);
        this.rightArm2.addChild(rightLowerPropatagium);
        this.setRotateAngle(rightLowerPropatagium, 0.3927F, 0.0F, 0.0F);
        this.rightLowerPropatagium.cubeList.add(new ModelBox(rightLowerPropatagium, 91, 121, -0.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2618F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 126, 4, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 120, 110, -0.5F, -1.0F, 2.0F, 1, 2, 5, 0.0F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 118, 119, -0.55F, -3.0F, 0.0F, 0, 4, 6, 0.0F, true));

        this.rightHand2 = new AdvancedModelRenderer(this);
        this.rightHand2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.rightHand.addChild(rightHand2);
        this.setRotateAngle(rightHand2, -0.2618F, 0.0F, 0.0F);
        this.rightHand2.cubeList.add(new ModelBox(rightHand2, 122, 11, -0.5F, -1.0F, 0.0F, 1, 1, 5, -0.01F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1745F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 27, 94, -2.0F, -1.5F, -6.5F, 4, 5, 7, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 105, 42, -2.0F, 3.5F, -5.5F, 4, 1, 6, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 122, 18, -1.0F, 3.5F, -3.5F, 2, 2, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-6.0F, 0.5F, -3.5F);
        this.neck1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 101, 110, 3.5F, -2.0F, 0.0F, 5, 3, 4, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.5F, -6.5F);
        this.neck1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 101, 119, -2.5F, -2.0F, 0.0F, 4, 3, 4, 0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.5672F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 95, 50, -1.5F, -1.5F, -6.5F, 3, 4, 8, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 117, -1.5F, 2.25F, -4.5F, 3, 1, 6, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-7.0F, 0.5F, -6.5F);
        this.neck2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 118, 50, 5.5F, -2.0F, 0.0F, 3, 2, 5, 0.01F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.3927F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 116, 87, -1.0F, -1.5F, -5.5F, 2, 3, 6, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 95, 74, -1.0F, 1.0F, -3.5F, 2, 1, 4, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-7.5F, 0.5F, -5.25F);
        this.neck3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 122, 74, 6.5F, -2.0F, 0.0F, 2, 2, 4, 0.01F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.5F, -5.15F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.7854F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 78, 121, -1.0F, -1.0F, -3.5F, 2, 2, 4, -0.04F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 122, 81, -1.0F, -1.15F, -1.5F, 2, 2, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 2.0675F, -3.0867F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4363F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 98, 127, -1.0F, -1.0F, -1.5F, 1, 1, 1, -0.02F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 99, 31, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 1.2742F, -3.6955F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6588F, -0.0915F, -0.0815F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 9, 125, 0.0F, 0.0F, -0.1F, 1, 1, 3, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 1.2742F, -3.6955F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.6588F, 0.0915F, 0.0815F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 125, -1.0F, 0.0F, -0.1F, 1, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.15F, -1.5F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.8552F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 125, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.15F, -1.5F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4363F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 18, 127, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.15F, -0.5F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1745F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 126, 46, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, -1.15F, 0.5F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2618F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 126, 0, -1.5F, 0.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.9F, -0.75F, -0.4F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 1.4555F, -0.0005F, 1.265F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 29, 74, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.85F, -0.4F, -0.1F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.5374F, 0.7254F, 0.7318F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 107, 29, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.8F, 0.2F, -0.35F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.6604F, 0.6782F, -0.3912F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 35, 46, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.75F, 0.5F, -0.75F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -1.509F, 0.0617F, -0.7835F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 35, 48, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.75F, 0.5F, -0.75F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -1.509F, -0.0617F, 0.7835F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 35, 48, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.8F, 0.2F, -0.35F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.6604F, -0.6782F, 0.3912F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 35, 46, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.9F, -0.75F, -0.4F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 1.4555F, 0.0005F, -1.265F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 29, 74, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.85F, -0.4F, -0.1F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.5374F, -0.7254F, -0.7318F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 107, 29, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 25, 127, -0.9F, -0.7F, -1.35F, 2, 1, 1, 0.01F, false));
        this.eyes.cubeList.add(new ModelBox(eyes, 25, 127, -1.1F, -0.7F, -1.35F, 2, 1, 1, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 0.6F, 0.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3491F, 0.0F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.8081F, -1.5523F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1745F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 127, 97, -1.5F, -0.9F, 0.25F, 2, 1, 1, -0.03F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 91, 127, -1.5F, -0.95F, 0.0F, 2, 1, 1, -0.02F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.48F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 54, 125, -1.5F, 0.0F, -1.75F, 2, 1, 2, -0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 0.8081F, -1.5523F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.6981F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 126, 42, -1.5F, 0.0F, -1.95F, 1, 1, 2, -0.02F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 2.0936F, -3.0844F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.9599F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 103, 127, -1.5F, 0.0F, -1.5F, 1, 1, 1, -0.04F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 127, 100, -1.5F, 0.0F, -0.9F, 1, 1, 1, -0.03F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(-0.5F, 1.2333F, -0.2035F);
        this.jaw.addChild(throat);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1745F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 45, 125, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck1.rotateAngleX = (float) Math.toRadians(90);
        setRotateAngle(neck4, 0F, -0F, 0F);
        setRotateAngle(neck3, 0F, 0F, 0F);
        setRotateAngle(neck2, -0F, -0F, 0F);
        setRotateAngle(neck1, 0F, -0F, 0.0F);
        setRotateAngle(jaw, 0F, 0F, 0.0F);
        setRotateAngle(head, -0F, 0.0F, 0.0F);
        this.neck1.offsetY = -0F;
        this.neck1.offsetX = -0.F;
        this.neck1.offsetZ = -0.045F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.hips.offsetY = 0.165F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.4F;
        this.hips.offsetX = 0.1F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(2);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 1F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        setRotateAngle(hips, 0.0F, 4.0F, 0F);
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

        EntityPrehistoricFloraStruthiomimus entityStruthiomimus = (EntityPrehistoricFloraStruthiomimus) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityStruthiomimus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityStruthiomimus.getAnimation() == entityStruthiomimus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityStruthiomimus.isReallyInWater()) {

                if (f3 == 0.0F || !entityStruthiomimus.getIsMoving()) {
                    if (entityStruthiomimus.getAnimation() != entityStruthiomimus.EAT_ANIMATION
                            && entityStruthiomimus.getAnimation() != entityStruthiomimus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityStruthiomimus.getIsFast()) { //Running


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
        EntityPrehistoricFloraStruthiomimus ee = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisp(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiomimus entity = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (35.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 35.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 3) / 5) * (-29-(35.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -29 + (((tickAnim - 8) / 4) * (7.75-(-29)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 7.75 + (((tickAnim - 12) / 1) * (0-(7.75)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 3) / 5) * (4.575-(-1)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 4.575 + (((tickAnim - 8) / 4) * (-1-(4.575)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 12) / 1) * (0-(-1)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -19.25 + (((tickAnim - 3) / 2) * (-36.75-(-19.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -36.75 + (((tickAnim - 5) / 1) * (-22.37-(-36.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -22.37 + (((tickAnim - 6) / 2) * (46.5-(-22.37)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 46.5 + (((tickAnim - 8) / 3) * (1.63-(46.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 1.63 + (((tickAnim - 11) / 2) * (0-(1.63)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 6.75 + (((tickAnim - 3) / 1) * (35.67-(6.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 35.67 + (((tickAnim - 4) / 1) * (27.25-(35.67)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 27.25 + (((tickAnim - 5) / 1) * (-14.56-(27.25)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -14.56 + (((tickAnim - 6) / 2) * (-31-(-14.56)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -31 + (((tickAnim - 8) / 3) * (0.75-(-31)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.75 + (((tickAnim - 11) / 2) * (0-(0.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 8) / 5) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-48-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -48 + (((tickAnim - 5) / 1) * (-11.19-(-48)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -11.19 + (((tickAnim - 6) / 2) * (19.25-(-11.19)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 19.25 + (((tickAnim - 8) / 3) * (-3.12-(19.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -3.12 + (((tickAnim - 11) / 1) * (-27.08-(-3.12)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -27.08 + (((tickAnim - 12) / 1) * (0-(-27.08)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.425 + (((tickAnim - 8) / 5) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -6.5 + (((tickAnim - 3) / 0) * (68.17-(-6.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 68.17 + (((tickAnim - 3) / 2) * (42-(68.17)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 42 + (((tickAnim - 5) / 1) * (96.12-(42)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 96.12 + (((tickAnim - 6) / 2) * (-6-(96.12)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -6 + (((tickAnim - 8) / 3) * (2.17775-(-6)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.07355-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.77432-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 2.17775 + (((tickAnim - 11) / 1) * (16.45184-(2.17775)));
            yy = -0.07355 + (((tickAnim - 11) / 1) * (-0.04903-(-0.07355)));
            zz = 0.77432 + (((tickAnim - 11) / 1) * (0.51621-(0.77432)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 16.45184 + (((tickAnim - 12) / 1) * (0-(16.45184)));
            yy = -0.04903 + (((tickAnim - 12) / 1) * (0-(-0.04903)));
            zz = 0.51621 + (((tickAnim - 12) / 1) * (0-(0.51621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.95 + (((tickAnim - 8) / 5) * (0-(-0.95)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(0), leftToes.rotateAngleY + (float) Math.toRadians(0), leftToes.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-32.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -32.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 3) / 1) * (10.06-(-32.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 10.06 + (((tickAnim - 4) / 2) * (26.75-(10.06)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 26.75 + (((tickAnim - 6) / 2) * (-36.75-(26.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -36.75 + (((tickAnim - 8) / 1) * (-22.37-(-36.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -22.37 + (((tickAnim - 9) / 3) * (8-(-22.37)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 8 + (((tickAnim - 12) / 1) * (0-(8)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 6 + (((tickAnim - 3) / 1) * (-4.65-(6)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -4.65 + (((tickAnim - 4) / 2) * (-16.75-(-4.65)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -16.75 + (((tickAnim - 6) / 2) * (27.25-(-16.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 27.25 + (((tickAnim - 8) / 1) * (-14.56-(27.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -14.56 + (((tickAnim - 9) / 3) * (27.75-(-14.56)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 27.75 + (((tickAnim - 12) / 1) * (0-(27.75)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-17.47178-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.16217-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.31578-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -17.47178 + (((tickAnim - 3) / 3) * (19.31586-(-17.47178)));
            yy = 1.16217 + (((tickAnim - 3) / 3) * (2.71172-(1.16217)));
            zz = 0.31578 + (((tickAnim - 3) / 3) * (0.73683-(0.31578)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 19.31586 + (((tickAnim - 6) / 2) * (-48-(19.31586)));
            yy = 2.71172 + (((tickAnim - 6) / 2) * (0-(2.71172)));
            zz = 0.73683 + (((tickAnim - 6) / 2) * (0-(0.73683)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -48 + (((tickAnim - 8) / 1) * (-11.19-(-48)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -11.19 + (((tickAnim - 9) / 3) * (-42-(-11.19)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -42 + (((tickAnim - 12) / 1) * (0-(-42)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 9.25 + (((tickAnim - 3) / 3) * (-9.5-(9.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.5 + (((tickAnim - 6) / 2) * (42-(-9.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 42 + (((tickAnim - 8) / 1) * (96.12-(42)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 96.12 + (((tickAnim - 9) / 3) * (64.25-(96.12)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 64.25 + (((tickAnim - 12) / 1) * (0-(64.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.385-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.385 + (((tickAnim - 3) / 3) * (-0.25-(-0.385)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 6) / 2) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.875-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 12) / 1) * (0-(0.875)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(0), rightToes.rotateAngleY + (float) Math.toRadians(0), rightToes.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550-50))*-10 + (((tickAnim - 0) / 13) * (2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550-50))*-10-(2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550-50))*-10)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -7.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550-150))*-20 + (((tickAnim - 0) / 13) * (-7.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550-150))*-20-(-7.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550-150))*-20)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550-200))*-30 + (((tickAnim - 0) / 8) * (7.12-(10.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550-200))*-30)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 7.12 + (((tickAnim - 8) / 5) * (0-(7.12)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 37.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550-250))*-40 + (((tickAnim - 0) / 4) * (21.25-(37.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550-250))*-40)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 21.25 + (((tickAnim - 4) / 4) * (58.83-(21.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 58.83 + (((tickAnim - 8) / 0) * (52.58-(58.83)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 52.58 + (((tickAnim - 8) / 2) * (0-(52.58)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -12.75 + (((tickAnim - 3) / 5) * (16.5-(-12.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16.5 + (((tickAnim - 8) / 4) * (0.75-(16.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0.75 + (((tickAnim - 12) / 1) * (0-(0.75)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 10.5 + (((tickAnim - 3) / 5) * (-2-(10.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -2 + (((tickAnim - 8) / 4) * (-6.25-(-2)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -6.25 + (((tickAnim - 12) / 1) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-28.02266-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-8.50582-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-56.72931-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -28.02266 + (((tickAnim - 3) / 2) * (-25.34552-(-28.02266)));
            yy = -8.50582 + (((tickAnim - 3) / 2) * (-17.07262-(-8.50582)));
            zz = -56.72931 + (((tickAnim - 3) / 2) * (-0.72896-(-56.72931)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -25.34552 + (((tickAnim - 5) / 3) * (-28.02266-(-25.34552)));
            yy = -17.07262 + (((tickAnim - 5) / 3) * (-8.50582-(-17.07262)));
            zz = -0.72896 + (((tickAnim - 5) / 3) * (-56.72931-(-0.72896)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -28.02266 + (((tickAnim - 8) / 5) * (0-(-28.02266)));
            yy = -8.50582 + (((tickAnim - 8) / 5) * (0-(-8.50582)));
            zz = -56.72931 + (((tickAnim - 8) / 5) * (0-(-56.72931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-28.02266-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (8.50582-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (56.72931-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -28.02266 + (((tickAnim - 3) / 2) * (-25.34552-(-28.02266)));
            yy = 8.50582 + (((tickAnim - 3) / 2) * (17.07262-(8.50582)));
            zz = 56.72931 + (((tickAnim - 3) / 2) * (0.72896-(56.72931)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -25.34552 + (((tickAnim - 5) / 3) * (-28.02266-(-25.34552)));
            yy = 17.07262 + (((tickAnim - 5) / 3) * (8.50582-(17.07262)));
            zz = 0.72896 + (((tickAnim - 5) / 3) * (56.72931-(0.72896)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -28.02266 + (((tickAnim - 8) / 5) * (0-(-28.02266)));
            yy = 8.50582 + (((tickAnim - 8) / 5) * (0-(8.50582)));
            zz = 56.72931 + (((tickAnim - 8) / 5) * (0-(56.72931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 5.5 + (((tickAnim - 3) / 3) * (-3.5-(5.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -3.5 + (((tickAnim - 6) / 6) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.18507-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.63137-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (6.01452-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 13.18507 + (((tickAnim - 3) / 3) * (-6.31493-(13.18507)));
            yy = 1.63137 + (((tickAnim - 3) / 3) * (1.63137-(1.63137)));
            zz = 6.01452 + (((tickAnim - 3) / 3) * (6.01452-(6.01452)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.31493 + (((tickAnim - 6) / 2) * (0-(-6.31493)));
            yy = 1.63137 + (((tickAnim - 6) / 2) * (0-(1.63137)));
            zz = 6.01452 + (((tickAnim - 6) / 2) * (0-(6.01452)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (14.25-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 14.25 + (((tickAnim - 12) / 1) * (0-(14.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -10.25 + (((tickAnim - 6) / 2) * (20.25-(-10.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 20.25 + (((tickAnim - 8) / 4) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 20.25 + (((tickAnim - 12) / 1) * (0-(20.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -26.5 + (((tickAnim - 3) / 3) * (16.25-(-26.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 16.25 + (((tickAnim - 6) / 2) * (0-(16.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -29.25 + (((tickAnim - 12) / 1) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 14.5 + (((tickAnim - 6) / 7) * (0-(14.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiomimus entity = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;
        int animCycle = 125;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25 + (((tickAnim - 0) / 20) * (-17.75-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -17.75 + (((tickAnim - 20) / 40) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -17.75 + (((tickAnim - 60) / 20) * (-17.77455-(-17.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (7.16858-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (-1.65603-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -17.77455 + (((tickAnim - 80) / 25) * (-17.77455-(-17.77455)));
            yy = 7.16858 + (((tickAnim - 80) / 25) * (7.16858-(7.16858)));
            zz = -1.65603 + (((tickAnim - 80) / 25) * (-1.65603-(-1.65603)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = -17.77455 + (((tickAnim - 105) / 20) * (0-(-17.77455)));
            yy = 7.16858 + (((tickAnim - 105) / 20) * (0-(7.16858)));
            zz = -1.65603 + (((tickAnim - 105) / 20) * (0-(-1.65603)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.375-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 40) * (0.825-(0.825)));
            zz = 0.375 + (((tickAnim - 20) / 40) * (0.375-(0.375)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0.825 + (((tickAnim - 60) / 45) * (0.825-(0.825)));
            zz = 0.375 + (((tickAnim - 60) / 45) * (0.375-(0.375)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            yy = 0.825 + (((tickAnim - 105) / 20) * (0-(0.825)));
            zz = 0.375 + (((tickAnim - 105) / 20) * (0-(0.375)));
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
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 0) / 20) * (22.75-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 22.75 + (((tickAnim - 20) / 40) * (22.75-(22.75)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 22.75 + (((tickAnim - 60) / 20) * (22.77415-(22.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (-5.47686-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (-0.5048-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 22.77415 + (((tickAnim - 80) / 25) * (22.77415-(22.77415)));
            yy = -5.47686 + (((tickAnim - 80) / 25) * (-5.47686-(-5.47686)));
            zz = -0.5048 + (((tickAnim - 80) / 25) * (-0.5048-(-0.5048)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 22.77415 + (((tickAnim - 105) / 20) * (0-(22.77415)));
            yy = -5.47686 + (((tickAnim - 105) / 20) * (0-(-5.47686)));
            zz = -0.5048 + (((tickAnim - 105) / 20) * (0-(-0.5048)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -8 + (((tickAnim - 20) / 40) * (-8-(-8)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = -8 + (((tickAnim - 60) / 45) * (-8-(-8)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = -8 + (((tickAnim - 105) / 20) * (0-(-8)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 4 + (((tickAnim - 20) / 40) * (4-(4)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 4 + (((tickAnim - 60) / 45) * (4-(4)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 4 + (((tickAnim - 105) / 20) * (0-(4)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 0) / 20) * (22.75-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 22.75 + (((tickAnim - 20) / 40) * (22.75-(22.75)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 22.75 + (((tickAnim - 60) / 11) * (-11.22583-(22.75)));
            yy = 0 + (((tickAnim - 60) / 11) * (7.90281-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (4.96698-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -11.22583 + (((tickAnim - 71) / 9) * (2.94846-(-11.22583)));
            yy = 7.90281 + (((tickAnim - 71) / 9) * (14.58981-(7.90281)));
            zz = 4.96698 + (((tickAnim - 71) / 9) * (9.1698-(4.96698)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 2.94846 + (((tickAnim - 80) / 25) * (2.94846-(2.94846)));
            yy = 14.58981 + (((tickAnim - 80) / 25) * (14.58981-(14.58981)));
            zz = 9.1698 + (((tickAnim - 80) / 25) * (9.1698-(9.1698)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 2.94846 + (((tickAnim - 105) / 11) * (-16.14862-(2.94846)));
            yy = 14.58981 + (((tickAnim - 105) / 11) * (6.687-(14.58981)));
            zz = 9.1698 + (((tickAnim - 105) / 11) * (4.20283-(9.1698)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = -16.14862 + (((tickAnim - 116) / 9) * (0-(-16.14862)));
            yy = 6.687 + (((tickAnim - 116) / 9) * (0-(6.687)));
            zz = 4.20283 + (((tickAnim - 116) / 9) * (0-(4.20283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -8 + (((tickAnim - 20) / 40) * (-8-(-8)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = -8 + (((tickAnim - 60) / 11) * (30.39-(-8)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 30.39 + (((tickAnim - 71) / 9) * (-13.75-(30.39)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -13.75 + (((tickAnim - 80) / 25) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = -13.75 + (((tickAnim - 105) / 11) * (32.2-(-13.75)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = 32.2 + (((tickAnim - 116) / 9) * (0-(32.2)));
            yy = 0 + (((tickAnim - 116) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 60) / 11) * (-43.79-(0)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -43.79 + (((tickAnim - 71) / 9) * (11-(-43.79)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 11 + (((tickAnim - 80) / 25) * (11-(11)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 11 + (((tickAnim - 105) / 11) * (-34.21-(11)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = -34.21 + (((tickAnim - 116) / 9) * (0-(-34.21)));
            yy = 0 + (((tickAnim - 116) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            yy = -0.225 + (((tickAnim - 80) / 25) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            yy = -0.225 + (((tickAnim - 105) / 20) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 4 + (((tickAnim - 20) / 40) * (4-(4)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 4 + (((tickAnim - 60) / 11) * (87.49-(4)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 87.49 + (((tickAnim - 71) / 9) * (18.75-(87.49)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 18.75 + (((tickAnim - 80) / 25) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 18.75 + (((tickAnim - 105) / 11) * (94.34-(18.75)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = 94.34 + (((tickAnim - 116) / 9) * (0-(94.34)));
            yy = 0 + (((tickAnim - 116) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            yy = -0.575 + (((tickAnim - 80) / 25) * (-0.575-(-0.575)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            yy = -0.575 + (((tickAnim - 105) / 20) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 0) / 20) * (10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 20) / 40) * (10-(10)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 10 + (((tickAnim - 60) / 45) * (10-(10)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 10 + (((tickAnim - 105) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 0) / 20) * (5.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 5.25 + (((tickAnim - 20) / 40) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 5.25 + (((tickAnim - 60) / 45) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 5.25 + (((tickAnim - 105) / 20) * (0-(5.25)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 0) / 20) * (6.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 6.5 + (((tickAnim - 20) / 40) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 6.5 + (((tickAnim - 60) / 45) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 6.5 + (((tickAnim - 105) / 20) * (0-(6.5)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 0) / 20) * (5.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 5.5 + (((tickAnim - 20) / 40) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 5.5 + (((tickAnim - 60) / 45) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 5.5 + (((tickAnim - 105) / 20) * (0-(5.5)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 0) / 20) * (-6.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -6.5 + (((tickAnim - 20) / 40) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -6.5 + (((tickAnim - 60) / 10) * (-27.5541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*25-(-6.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (4.57017-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (2.36007-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -27.5541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*25 + (((tickAnim - 70) / 10) * (-5.75826-(-27.5541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*25)));
            yy = 4.57017 + (((tickAnim - 70) / 10) * (9.14035-(4.57017)));
            zz = 2.36007 + (((tickAnim - 70) / 10) * (4.72013-(2.36007)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -5.75826 + (((tickAnim - 80) / 25) * (-5.75826-(-5.75826)));
            yy = 9.14035 + (((tickAnim - 80) / 25) * (9.14035-(9.14035)));
            zz = 4.72013 + (((tickAnim - 80) / 25) * (4.72013-(4.72013)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = -5.75826 + (((tickAnim - 105) / 20) * (0-(-5.75826)));
            yy = 9.14035 + (((tickAnim - 105) / 20) * (0-(9.14035)));
            zz = 4.72013 + (((tickAnim - 105) / 20) * (0-(4.72013)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (-22.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*25-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (7.21875-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -22.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*25 + (((tickAnim - 70) / 10) * (0-(-22.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*25)));
            yy = 7.21875 + (((tickAnim - 70) / 10) * (8.25-(7.21875)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            yy = 8.25 + (((tickAnim - 80) / 25) * (8.25-(8.25)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            yy = 8.25 + (((tickAnim - 105) / 20) * (0-(8.25)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 25.25 + (((tickAnim - 20) / 40) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 25.25 + (((tickAnim - 60) / 10) * (0-(25.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (25.25-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 25.25 + (((tickAnim - 80) / 25) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 25.25 + (((tickAnim - 105) / 20) * (0-(25.25)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 25.25 + (((tickAnim - 20) / 40) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 25.25 + (((tickAnim - 60) / 10) * (0-(25.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (25.25-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 25.25 + (((tickAnim - 80) / 25) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 25.25 + (((tickAnim - 105) / 20) * (0-(25.25)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 0) / 20) * (-6.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -6.25 + (((tickAnim - 20) / 40) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -6.25 + (((tickAnim - 60) / 10) * (-55.4785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*55-(-6.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (3.46116-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (2.51484-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -55.4785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*55 + (((tickAnim - 70) / 10) * (-5.95708-(-55.4785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*55)));
            yy = 3.46116 + (((tickAnim - 70) / 10) * (6.92233-(3.46116)));
            zz = 2.51484 + (((tickAnim - 70) / 10) * (5.02968-(2.51484)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -5.95708 + (((tickAnim - 80) / 25) * (-5.95708-(-5.95708)));
            yy = 6.92233 + (((tickAnim - 80) / 25) * (6.92233-(6.92233)));
            zz = 5.02968 + (((tickAnim - 80) / 25) * (5.02968-(5.02968)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = -5.95708 + (((tickAnim - 105) / 11) * (-8.23033-(-5.95708)));
            yy = 6.92233 + (((tickAnim - 105) / 11) * (3.17273-(6.92233)));
            zz = 5.02968 + (((tickAnim - 105) / 11) * (2.30527-(5.02968)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = -8.23033 + (((tickAnim - 116) / 9) * (0-(-8.23033)));
            yy = 3.17273 + (((tickAnim - 116) / 9) * (0-(3.17273)));
            zz = 2.30527 + (((tickAnim - 116) / 9) * (0-(2.30527)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 0) / 20) * (-9-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -9 + (((tickAnim - 20) / 40) * (-9-(-9)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -9 + (((tickAnim - 60) / 10) * (-55.3092+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*55-(-9)));
            yy = 0 + (((tickAnim - 60) / 10) * (3.64458-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (2.62433-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -55.3092+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*55 + (((tickAnim - 70) / 10) * (-8.81848-(-55.3092+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*55)));
            yy = 3.64458 + (((tickAnim - 70) / 10) * (7.28915-(3.64458)));
            zz = 2.62433 + (((tickAnim - 70) / 10) * (5.24867-(2.62433)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -8.81848 + (((tickAnim - 80) / 25) * (-8.81848-(-8.81848)));
            yy = 7.28915 + (((tickAnim - 80) / 25) * (7.28915-(7.28915)));
            zz = 5.24867 + (((tickAnim - 80) / 25) * (5.24867-(5.24867)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = -8.81848 + (((tickAnim - 105) / 11) * (-8.5418-(-8.81848)));
            yy = 7.28915 + (((tickAnim - 105) / 11) * (3.34086-(7.28915)));
            zz = 5.24867 + (((tickAnim - 105) / 11) * (2.40564-(5.24867)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = -8.5418 + (((tickAnim - 116) / 9) * (0-(-8.5418)));
            yy = 3.34086 + (((tickAnim - 116) / 9) * (0-(3.34086)));
            zz = 2.40564 + (((tickAnim - 116) / 9) * (0-(2.40564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8 + (((tickAnim - 0) / 20) * (5.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 5.25 + (((tickAnim - 20) / 3) * (6.25-(5.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 6.25 + (((tickAnim - 23) / 4) * (5.25-(6.25)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 5.25 + (((tickAnim - 27) / 3) * (6.25-(5.25)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6.25 + (((tickAnim - 30) / 3) * (5.25-(6.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 5.25 + (((tickAnim - 33) / 27) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5.25 + (((tickAnim - 60) / 10) * (-52.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*45-(5.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -52.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*45 + (((tickAnim - 70) / 10) * (0-(-52.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*45)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 80) / 3) * (1.25-(0)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = 1.25 + (((tickAnim - 83) / 4) * (0-(1.25)));
            yy = 0 + (((tickAnim - 83) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 4) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 87) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 18) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 105) / 11) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = -10.5 + (((tickAnim - 116) / 9) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 116) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 0) / 20) * (-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 20) / 3) * (-1.75-(-5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -1.75 + (((tickAnim - 23) / 4) * (-5-(-1.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 27) / 3) * (-1.75-(-5)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -1.75 + (((tickAnim - 30) / 3) * (-5-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 33) / 27) * (-5-(-5)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 60) / 10) * (6.75-(-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 6.75 + (((tickAnim - 70) / 10) * (0-(6.75)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 33.75 + (((tickAnim - 20) / 3) * (26-(33.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 26 + (((tickAnim - 23) / 4) * (33.75-(26)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 33.75 + (((tickAnim - 27) / 3) * (26-(33.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 26 + (((tickAnim - 30) / 3) * (33.75-(26)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 33.75 + (((tickAnim - 33) / 27) * (33.75-(33.75)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 33.75 + (((tickAnim - 60) / 10) * (25.75-(33.75)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 25.75 + (((tickAnim - 70) / 10) * (36.5-(25.75)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 36.5 + (((tickAnim - 80) / 3) * (33.75-(36.5)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = 33.75 + (((tickAnim - 83) / 4) * (36.5-(33.75)));
            yy = 0 + (((tickAnim - 83) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 4) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 105) {
            xx = 36.5 + (((tickAnim - 87) / 18) * (36.5-(36.5)));
            yy = 0 + (((tickAnim - 87) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 18) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 36.5 + (((tickAnim - 105) / 11) * (38.73-(36.5)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = 38.73 + (((tickAnim - 116) / 9) * (0-(38.73)));
            yy = 0 + (((tickAnim - 116) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 33 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 33) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 33) / 5) * (-0.0025-(1)));
            zz = 1 + (((tickAnim - 33) / 5) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 38) / 4) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 38) / 4) * (1-(-0.0025)));
            zz = 1 + (((tickAnim - 38) / 4) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 42) / 36) * (1-(1)));
            yy = 1 + (((tickAnim - 42) / 36) * (1-(1)));
            zz = 1 + (((tickAnim - 42) / 36) * (1-(1)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 78) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 78) / 5) * (-0.0025-(1)));
            zz = 1 + (((tickAnim - 78) / 5) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = 1 + (((tickAnim - 83) / 4) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 83) / 4) * (1-(-0.0025)));
            zz = 1 + (((tickAnim - 83) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (4-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 4 + (((tickAnim - 55) / 5) * (0-(4)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 60) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 19) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 79) / 4) * (6.5-(0)));
            yy = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 6.5 + (((tickAnim - 83) / 2) * (0-(6.5)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -50.5 + (((tickAnim - 20) / 40) * (-50.5-(-50.5)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = -50.5 + (((tickAnim - 60) / 45) * (-50.5-(-50.5)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = -50.5 + (((tickAnim - 105) / 20) * (0-(-50.5)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));
       
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiomimus entity = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 33.75 + (((tickAnim - 20) / 15) * (-16-(33.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 35) / 15) * (0-(-16)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 1.25 + (((tickAnim - 20) / 5) * (21.67-(1.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 21.67 + (((tickAnim - 25) / 10) * (-11-(21.67)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11 + (((tickAnim - 35) / 15) * (0-(-11)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-44.75-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -44.75 + (((tickAnim - 28) / 4) * (-44.75-(-44.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -44.75 + (((tickAnim - 32) / 3) * (5.75-(-44.75)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 35) / 15) * (0-(5.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (63.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 63.5 + (((tickAnim - 20) / 12) * (87.61-(63.5)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 87.61 + (((tickAnim - 32) / 3) * (20.5-(87.61)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 20.5 + (((tickAnim - 35) / 15) * (0-(20.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 5) / 5) * (0-(0.35)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 35) / 7) * (-9.395+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(-0.4)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = -9.395+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 42) / 1) * (0.3-(-9.395+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 43) / 3) * (0.2-(0.3)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 46) / 4) * (0-(0.2)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-49.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -49.5 + (((tickAnim - 10) / 10) * (0-(-49.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
            zz = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
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
        EntityPrehistoricFloraStruthiomimus entity = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30 + (((tickAnim - 10) / 10) * (-9-(-30)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9 + (((tickAnim - 20) / 10) * (-9-(-9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9 + (((tickAnim - 30) / 10) * (9-(-9)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 40) / 10) * (0-(9)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-11.36-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.005-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -11.36 + (((tickAnim - 10) / 10) * (-12.125-(-11.36)));
            zz = 7.005 + (((tickAnim - 10) / 10) * (6.425-(7.005)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -12.125 + (((tickAnim - 20) / 10) * (-12.125-(-12.125)));
            zz = 6.425 + (((tickAnim - 20) / 10) * (6.425-(6.425)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -12.125 + (((tickAnim - 30) / 10) * (-4.01-(-12.125)));
            zz = 6.425 + (((tickAnim - 30) / 10) * (1.43-(6.425)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -4.01 + (((tickAnim - 40) / 10) * (0-(-4.01)));
            zz = 1.43 + (((tickAnim - 40) / 10) * (0-(1.43)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-55-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -55 + (((tickAnim - 20) / 10) * (-55-(-55)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -55 + (((tickAnim - 30) / 10) * (-41.25-(-55)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -41.25 + (((tickAnim - 40) / 10) * (0-(-41.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (40.13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 40.13 + (((tickAnim - 10) / 10) * (46.75-(40.13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 46.75 + (((tickAnim - 20) / 10) * (46.75-(46.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 46.75 + (((tickAnim - 30) / 10) * (40.63-(46.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 40.63 + (((tickAnim - 40) / 10) * (0-(40.63)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.125-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.075 + (((tickAnim - 20) / 10) * (-1.075-(-1.075)));
            zz = 1.125 + (((tickAnim - 20) / 10) * (1.125-(1.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -1.075 + (((tickAnim - 30) / 20) * (0-(-1.075)));
            zz = 1.125 + (((tickAnim - 30) / 20) * (0-(1.125)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-54.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -54.5 + (((tickAnim - 10) / 10) * (-61.5-(-54.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -61.5 + (((tickAnim - 20) / 10) * (-61.5-(-61.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -61.5 + (((tickAnim - 30) / 10) * (-15.25-(-61.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -15.25 + (((tickAnim - 40) / 10) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 20) / 10) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 30) / 5) * (0.155-(-0.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (1.735-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.155 + (((tickAnim - 35) / 5) * (-0.25-(0.155)));
            zz = 1.735 + (((tickAnim - 35) / 5) * (0.025-(1.735)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 40) / 10) * (0-(-0.25)));
            zz = 0.025 + (((tickAnim - 40) / 10) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (68.38-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 68.38 + (((tickAnim - 10) / 10) * (78.25-(68.38)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 78.25 + (((tickAnim - 20) / 10) * (78.25-(78.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 78.25 + (((tickAnim - 30) / 10) * (7.38-(78.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.38 + (((tickAnim - 40) / 10) * (0-(7.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.05-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 2.05 + (((tickAnim - 5) / 5) * (0-(2.05)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (-0.44-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0.35-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.44 + (((tickAnim - 35) / 5) * (-0.875-(-0.44)));
            zz = 0.35 + (((tickAnim - 35) / 5) * (0-(0.35)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 40) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-55-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -55 + (((tickAnim - 20) / 10) * (-55-(-55)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -55 + (((tickAnim - 30) / 10) * (-41.25-(-55)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -41.25 + (((tickAnim - 40) / 10) * (0-(-41.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (40.13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 40.13 + (((tickAnim - 10) / 10) * (46.75-(40.13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 46.75 + (((tickAnim - 20) / 10) * (46.75-(46.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 46.75 + (((tickAnim - 30) / 10) * (40.63-(46.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 40.63 + (((tickAnim - 40) / 10) * (0-(40.63)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.125-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.075 + (((tickAnim - 20) / 10) * (-1.075-(-1.075)));
            zz = 1.125 + (((tickAnim - 20) / 10) * (1.125-(1.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -1.075 + (((tickAnim - 30) / 20) * (0-(-1.075)));
            zz = 1.125 + (((tickAnim - 30) / 20) * (0-(1.125)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-54.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -54.5 + (((tickAnim - 10) / 10) * (-61.5-(-54.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -61.5 + (((tickAnim - 20) / 10) * (-61.5-(-61.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -61.5 + (((tickAnim - 30) / 10) * (-15.25-(-61.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -15.25 + (((tickAnim - 40) / 10) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 20) / 10) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 30) / 5) * (0.155-(-0.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (1.735-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.155 + (((tickAnim - 35) / 5) * (-0.25-(0.155)));
            zz = 1.735 + (((tickAnim - 35) / 5) * (0.025-(1.735)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 40) / 10) * (0-(-0.25)));
            zz = 0.025 + (((tickAnim - 40) / 10) * (0-(0.025)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (68.38-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 68.38 + (((tickAnim - 10) / 10) * (78.25-(68.38)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 78.25 + (((tickAnim - 20) / 10) * (78.25-(78.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 78.25 + (((tickAnim - 30) / 10) * (7.38-(78.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.38 + (((tickAnim - 40) / 10) * (0-(7.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.05-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 2.05 + (((tickAnim - 5) / 5) * (0-(2.05)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (-0.44-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0.35-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.44 + (((tickAnim - 35) / 5) * (-0.875-(-0.44)));
            zz = 0.35 + (((tickAnim - 35) / 5) * (0-(0.35)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 40) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 10) / 10) * (-13.5-(2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13.5 + (((tickAnim - 20) / 10) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -13.5 + (((tickAnim - 30) / 10) * (6.5-(-13.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 40) / 10) * (0-(6.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 10) / 10) * (12.75-(13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.75 + (((tickAnim - 20) / 10) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.75 + (((tickAnim - 30) / 10) * (-12.75-(12.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -12.75 + (((tickAnim - 40) / 10) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.75 + (((tickAnim - 10) / 10) * (0-(8.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-14-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 40) / 10) * (0-(-14)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.88-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.88 + (((tickAnim - 10) / 10) * (15.25-(16.88)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.25 + (((tickAnim - 20) / 10) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15.25 + (((tickAnim - 30) / 10) * (0-(15.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 10) / 10) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.75 + (((tickAnim - 20) / 10) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 30) / 20) * (0-(10.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18 + (((tickAnim - 10) / 10) * (18-(18)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 18 + (((tickAnim - 20) / 10) * (18-(18)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 18 + (((tickAnim - 30) / 20) * (0-(18)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-32.33573-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-21.64212-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-64.36836-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -32.33573 + (((tickAnim - 20) / 10) * (-32.33573-(-32.33573)));
            yy = -21.64212 + (((tickAnim - 20) / 10) * (-21.64212-(-21.64212)));
            zz = -64.36836 + (((tickAnim - 20) / 10) * (-64.36836-(-64.36836)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -32.33573 + (((tickAnim - 30) / 20) * (0-(-32.33573)));
            yy = -21.64212 + (((tickAnim - 30) / 20) * (0-(-21.64212)));
            zz = -64.36836 + (((tickAnim - 30) / 20) * (0-(-64.36836)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-32.33573-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (21.64212-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (64.36836-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -32.33573 + (((tickAnim - 20) / 10) * (-32.33573-(-32.33573)));
            yy = 21.64212 + (((tickAnim - 20) / 10) * (21.64212-(21.64212)));
            zz = 64.36836 + (((tickAnim - 20) / 10) * (64.36836-(64.36836)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -32.33573 + (((tickAnim - 30) / 20) * (0-(-32.33573)));
            yy = 21.64212 + (((tickAnim - 30) / 20) * (0-(21.64212)));
            zz = 64.36836 + (((tickAnim - 30) / 20) * (0-(64.36836)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16 + (((tickAnim - 10) / 10) * (16-(16)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16 + (((tickAnim - 20) / 10) * (16-(16)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.75 + (((tickAnim - 10) / 10) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.75 + (((tickAnim - 20) / 10) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.75 + (((tickAnim - 30) / 20) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 10) / 10) * (-14-(-14)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -14 + (((tickAnim - 20) / 10) * (-14-(-14)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 30) / 20) * (0-(-14)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21.75 + (((tickAnim - 20) / 10) * (-21.75-(-21.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -21.75 + (((tickAnim - 30) / 20) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiomimus entity = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-6.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-5 + (((tickAnim - 30) / 20) * (0-(-6.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-24.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-30-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-30 + (((tickAnim - 30) / 20) * (0-(-24.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-30)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (2.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*30-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*30 + (((tickAnim - 30) / 20) * (0-(2.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*30)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.5 + (((tickAnim - 30) / 20) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -20.25 + (((tickAnim - 30) / 20) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (47.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 47.75 + (((tickAnim - 30) / 20) * (0-(47.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 14 + (((tickAnim - 8) / 7) * (0-(14)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-91.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -91.75 + (((tickAnim - 30) / 20) * (0-(-91.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -1.1 + (((tickAnim - 30) / 20) * (0-(-1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (2.3675-(1)));
            zz = 1 + (((tickAnim - 0) / 30) * (1.3-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 30) / 20) * (1-(1)));
            yy = 2.3675 + (((tickAnim - 30) / 20) * (1-(2.3675)));
            zz = 1.3 + (((tickAnim - 30) / 20) * (1-(1.3)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);
    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiomimus entity = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12 + (((tickAnim - 10) / 10) * (0-(12)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19.25 + (((tickAnim - 10) / 10) * (0-(19.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.75 + (((tickAnim - 10) / 10) * (0-(17.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (39-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 39 + (((tickAnim - 10) / 10) * (0-(39)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 10) / 10) * (0-(15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 4 + (((tickAnim - 5) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (23.38-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 23.38 + (((tickAnim - 5) / 3) * (-22.96-(23.38)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.96 + (((tickAnim - 8) / 2) * (-14.25-(-22.96)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14.25 + (((tickAnim - 10) / 10) * (0-(-14.25)));
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
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (27.25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 27.25 + (((tickAnim - 8) / 2) * (0-(27.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStruthiomimus entity = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -19.5 + (((tickAnim - 0) / 10) * (54-(-19.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 54 + (((tickAnim - 10) / 10) * (-19.5-(54)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -12.75 + (((tickAnim - 0) / 10) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (77.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 77.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130 + (((tickAnim - 13) / 7) * (-12.75-(77.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = -0.15 + (((tickAnim - 5) / 15) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
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
            xx = -14 + (((tickAnim - 0) / 5) * (0.5-(-14)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 5) / 5) * (3.75-(0.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 3.75 + (((tickAnim - 10) / 6) * (-48.5-(3.75)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -48.5 + (((tickAnim - 16) / 2) * (-54.5-(-48.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -54.5 + (((tickAnim - 18) / 2) * (-14-(-54.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 5) * (-0.285-(-0.125)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.45-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.285 + (((tickAnim - 5) / 5) * (0-(-0.285)));
            zz = -0.45 + (((tickAnim - 5) / 5) * (0-(-0.45)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 69.75 + (((tickAnim - 0) / 3) * (12.5-(69.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 3) / 2) * (-11.25-(12.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -11.25 + (((tickAnim - 5) / 5) * (69.25-(-11.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 69.25 + (((tickAnim - 10) / 6) * (88.17-(69.25)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 88.17 + (((tickAnim - 16) / 2) * (88.17-(88.17)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 88.17 + (((tickAnim - 18) / 2) * (69.75-(88.17)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.57-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.57 + (((tickAnim - 2) / 1) * (0.85-(1.57)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 3) / 2) * (-0.925-(0.85)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -0.925 + (((tickAnim - 5) / 1) * (-1.045-(-0.925)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = -1.045 + (((tickAnim - 6) / 1) * (-1.115-(-1.045)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -1.115 + (((tickAnim - 7) / 3) * (0-(-1.115)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (1.33-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (-0.625-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 1.33 + (((tickAnim - 16) / 4) * (0-(1.33)));
            zz = -0.625 + (((tickAnim - 16) / 4) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-36.25-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -36.25 + (((tickAnim - 7) / 1) * (0-(-36.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 7) / 3) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
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
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 54 + (((tickAnim - 0) / 10) * (-19.5-(54)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -19.5 + (((tickAnim - 10) / 10) * (54-(-19.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130 + (((tickAnim - 3) / 7) * (-12.75-(29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.75 + (((tickAnim - 10) / 10) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3.75 + (((tickAnim - 0) / 6) * (-48.5-(3.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -48.5 + (((tickAnim - 6) / 2) * (-54.5-(-48.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -54.5 + (((tickAnim - 8) / 2) * (-14-(-54.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -14 + (((tickAnim - 10) / 5) * (0.5-(-14)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 15) / 5) * (3.75-(0.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 10) / 5) * (-0.285-(-0.125)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.45-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.285 + (((tickAnim - 15) / 5) * (0-(-0.285)));
            zz = -0.45 + (((tickAnim - 15) / 5) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 69.25 + (((tickAnim - 0) / 6) * (88.17-(69.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 88.17 + (((tickAnim - 6) / 2) * (88.17-(88.17)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 88.17 + (((tickAnim - 8) / 2) * (69.75-(88.17)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 69.75 + (((tickAnim - 10) / 3) * (12.5-(69.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12.5 + (((tickAnim - 13) / 2) * (-11.25-(12.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -11.25 + (((tickAnim - 15) / 5) * (69.25-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.33-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.625-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 1.33 + (((tickAnim - 6) / 4) * (0-(1.33)));
            zz = -0.625 + (((tickAnim - 6) / 4) * (0-(-0.625)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (1.57-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.57 + (((tickAnim - 12) / 1) * (0.85-(1.57)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 13) / 2) * (-0.925-(0.85)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = -0.925 + (((tickAnim - 15) / 1) * (-1.045-(-0.925)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = -1.045 + (((tickAnim - 16) / 1) * (-1.115-(-1.045)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -1.115 + (((tickAnim - 17) / 3) * (0-(-1.115)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
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
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (-36.25-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -36.25 + (((tickAnim - 17) / 1) * (0-(-36.25)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 17) / 3) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.525+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-2));
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(-0.475);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*6), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-290))*6), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-290))*-6), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-36+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-390))*-10), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(36+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-490))*-10), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-290))*-6), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-36+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-390))*-10), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(36+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-490))*-10), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-6), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*-6), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-600))*-6), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-700))*-6), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStruthiomimus entity = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -17 + (((tickAnim - 0) / 20) * (-61.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*100-(-17)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -61.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*100 + (((tickAnim - 20) / 20) * (-17-(-61.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*100)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -12.75 + (((tickAnim - 0) / 20) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (81.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-100-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 81.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-100 + (((tickAnim - 27) / 13) * (-12.75-(81.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-100)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 4.25 + (((tickAnim - 0) / 10) * (-7.12-(4.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.12 + (((tickAnim - 10) / 10) * (0-(-7.12)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-42.87-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -42.87 + (((tickAnim - 28) / 6) * (-40.62-(-42.87)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -40.62 + (((tickAnim - 34) / 6) * (4.25-(-40.62)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 40) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 25.75 + (((tickAnim - 0) / 10) * (6.13-(25.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 6.13 + (((tickAnim - 10) / 4) * (22.58-(6.13)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 22.58 + (((tickAnim - 14) / 6) * (52-(22.58)));
            yy = -0.1 + (((tickAnim - 14) / 6) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 52 + (((tickAnim - 20) / 8) * (80.88-(52)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 80.88 + (((tickAnim - 28) / 6) * (80.88-(80.88)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 80.88 + (((tickAnim - 34) / 6) * (25.75-(80.88)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 10) * (0.14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1 + (((tickAnim - 10) / 1) * (-0.735+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3-(0.14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -0.735+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 11) / 9) * (0-(-0.735+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0.94-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (-0.5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0.94 + (((tickAnim - 28) / 6) * (0.94-(0.94)));
            zz = -0.5 + (((tickAnim - 28) / 6) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0.94 + (((tickAnim - 34) / 6) * (-0.1-(0.94)));
            zz = -0.5 + (((tickAnim - 34) / 6) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 35.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 19) * (-17-(35.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -17 + (((tickAnim - 19) / 21) * (-59.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*100-(-17)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 52 + (((tickAnim - 0) / 8) * (80.88-(52)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 80.88 + (((tickAnim - 8) / 5) * (80.88-(80.88)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 80.88 + (((tickAnim - 13) / 6) * (21.75-(80.88)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 21.75 + (((tickAnim - 19) / 11) * (2.88-(21.75)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 2.88 + (((tickAnim - 30) / 4) * (22.58-(2.88)));
            yy = 0 + (((tickAnim - 30) / 4) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 22.58 + (((tickAnim - 34) / 6) * (52-(22.58)));
            yy = -0.1 + (((tickAnim - 34) / 6) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.94-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.94 + (((tickAnim - 8) / 5) * (0.94-(0.94)));
            zz = -0.5 + (((tickAnim - 8) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.94 + (((tickAnim - 13) / 6) * (0.125-(0.94)));
            zz = -0.5 + (((tickAnim - 13) / 6) * (0-(-0.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            yy = 0.125 + (((tickAnim - 19) / 11) * (-0.61+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1-(0.125)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            yy = -0.61+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1 + (((tickAnim - 30) / 1) * (-2.56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3-(-0.61+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = -2.56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 31) / 9) * (0-(-2.56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+80))*3), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.59);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+9))*-1);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-34-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -34 + (((tickAnim - 14) / 6) * (0-(-34)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (22.67101-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (1.41392-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (-3.36432-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 22.67101 + (((tickAnim - 28) / 6) * (22.67101-(22.67101)));
            yy = 1.41392 + (((tickAnim - 28) / 6) * (1.41392-(1.41392)));
            zz = -3.36432 + (((tickAnim - 28) / 6) * (-3.36432-(-3.36432)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 22.67101 + (((tickAnim - 34) / 6) * (0-(22.67101)));
            yy = 1.41392 + (((tickAnim - 34) / 6) * (0-(1.41392)));
            zz = -3.36432 + (((tickAnim - 34) / 6) * (0-(-3.36432)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.035-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 13) / 1) * (0-(0.2)));
            zz = -0.035 + (((tickAnim - 13) / 1) * (-0.1-(-0.035)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = -0.1 + (((tickAnim - 14) / 6) * (0-(-0.1)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-32.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 19) {
            xx = -32.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100 + (((tickAnim - 7) / 12) * (-12.75-(-32.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100)));
            yy = 0 + (((tickAnim - 7) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 12) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -12.75 + (((tickAnim - 19) / 21) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-53.37-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -53.37 + (((tickAnim - 8) / 5) * (-40.62-(-53.37)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -40.62 + (((tickAnim - 13) / 6) * (4.25-(-40.62)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 4.25 + (((tickAnim - 19) / 11) * (-7.12-(4.25)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -7.12 + (((tickAnim - 30) / 10) * (0-(-7.12)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(-0.125);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (22.67101-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.41392-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.36432-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 22.67101 + (((tickAnim - 8) / 5) * (22.67101-(22.67101)));
            yy = 1.41392 + (((tickAnim - 8) / 5) * (1.41392-(1.41392)));
            zz = -3.36432 + (((tickAnim - 8) / 5) * (-3.36432-(-3.36432)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 22.67101 + (((tickAnim - 13) / 6) * (0-(22.67101)));
            yy = 1.41392 + (((tickAnim - 13) / 6) * (0-(1.41392)));
            zz = -3.36432 + (((tickAnim - 13) / 6) * (0-(-3.36432)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-34-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -34 + (((tickAnim - 34) / 6) * (0-(-34)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-0.035-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 33) / 1) * (0-(0.2)));
            zz = -0.035 + (((tickAnim - 33) / 1) * (-0.1-(-0.035)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = -0.1 + (((tickAnim - 34) / 6) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*2), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*3), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-160))*5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*1.8), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-3), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-300))*5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-400))*4), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-3), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-300))*5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-400))*4), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-190))*-2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-240))*-3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-290))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-330))*-5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animDisp(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiomimus entity = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = 5.5 + (((tickAnim - 14) / 134) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 14) / 134) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 5.5 + (((tickAnim - 148) / 12) * (0-(5.5)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.35-100))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-2.125-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-0.5 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-0.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.35-100))*0.1 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.35-100))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.35-100))*0.1)));
            zz = -2.125 + (((tickAnim - 14) / 134) * (-2.125-(-2.125)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-0.5 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-0.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.35-100))*0.1 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.35-100))*0.1)));
            zz = -2.125 + (((tickAnim - 148) / 12) * (0-(-2.125)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -17 + (((tickAnim - 7) / 7) * (0-(-17)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (-17-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -17 + (((tickAnim - 33) / 8) * (0-(-17)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 12) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -17 + (((tickAnim - 60) / 8) * (0-(-17)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 80) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 94) {
            xx = -17 + (((tickAnim - 87) / 7) * (0-(-17)));
            yy = 0 + (((tickAnim - 87) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 7) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 13) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (-17-(0)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 121) {
            xx = -17 + (((tickAnim - 113) / 8) * (0-(-17)));
            yy = 0 + (((tickAnim - 113) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 8) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 12) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 133) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 133) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 7) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = -17 + (((tickAnim - 140) / 8) * (0-(-17)));
            yy = 0 + (((tickAnim - 140) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 8) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 34.5 + (((tickAnim - 7) / 7) * (0-(34.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (34.5-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 34.5 + (((tickAnim - 33) / 8) * (0-(34.5)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 12) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (34.5-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 34.5 + (((tickAnim - 60) / 8) * (0-(34.5)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 80) / 7) * (34.5-(0)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 94) {
            xx = 34.5 + (((tickAnim - 87) / 7) * (0-(34.5)));
            yy = 0 + (((tickAnim - 87) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 7) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 13) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (34.5-(0)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 121) {
            xx = 34.5 + (((tickAnim - 113) / 8) * (0-(34.5)));
            yy = 0 + (((tickAnim - 113) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 8) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 12) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 133) / 7) * (34.5-(0)));
            yy = 0 + (((tickAnim - 133) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 7) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = 34.5 + (((tickAnim - 140) / 8) * (0-(34.5)));
            yy = 0 + (((tickAnim - 140) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 8) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -38.75 + (((tickAnim - 7) / 7) * (0-(-38.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (-38.75-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -38.75 + (((tickAnim - 33) / 8) * (0-(-38.75)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 12) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (-38.75-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -38.75 + (((tickAnim - 60) / 8) * (0-(-38.75)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 80) / 7) * (-38.75-(0)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 94) {
            xx = -38.75 + (((tickAnim - 87) / 7) * (0-(-38.75)));
            yy = 0 + (((tickAnim - 87) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 7) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 13) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (-38.75-(0)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 121) {
            xx = -38.75 + (((tickAnim - 113) / 8) * (0-(-38.75)));
            yy = 0 + (((tickAnim - 113) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 8) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 12) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 133) / 7) * (-38.75-(0)));
            yy = 0 + (((tickAnim - 133) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 7) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = -38.75 + (((tickAnim - 140) / 8) * (0-(-38.75)));
            yy = 0 + (((tickAnim - 140) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 8) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (80.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 80.75 + (((tickAnim - 7) / 7) * (-5.25-(80.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = -5.25 + (((tickAnim - 14) / 13) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -5.25 + (((tickAnim - 27) / 6) * (80.75-(-5.25)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 80.75 + (((tickAnim - 33) / 8) * (-5.25-(80.75)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = -5.25 + (((tickAnim - 41) / 12) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 12) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -5.25 + (((tickAnim - 53) / 7) * (80.75-(-5.25)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 80.75 + (((tickAnim - 60) / 8) * (-5.25-(80.75)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -5.25 + (((tickAnim - 68) / 12) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = -5.25 + (((tickAnim - 80) / 7) * (80.75-(-5.25)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 94) {
            xx = 80.75 + (((tickAnim - 87) / 7) * (-5.25-(80.75)));
            yy = 0 + (((tickAnim - 87) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 7) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 107) {
            xx = -5.25 + (((tickAnim - 94) / 13) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 13) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = -5.25 + (((tickAnim - 107) / 6) * (80.75-(-5.25)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 121) {
            xx = 80.75 + (((tickAnim - 113) / 8) * (-5.25-(80.75)));
            yy = 0 + (((tickAnim - 113) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 8) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 133) {
            xx = -5.25 + (((tickAnim - 121) / 12) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 12) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = -5.25 + (((tickAnim - 133) / 7) * (80.75-(-5.25)));
            yy = 0 + (((tickAnim - 133) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 7) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = 80.75 + (((tickAnim - 140) / 8) * (-5.25-(80.75)));
            yy = 0 + (((tickAnim - 140) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 8) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -5.25 + (((tickAnim - 148) / 12) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            yy = -0.225 + (((tickAnim - 14) / 13) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 27) / 14) * (0-(0)));
            yy = -0.225 + (((tickAnim - 27) / 14) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 27) / 14) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            yy = -0.225 + (((tickAnim - 41) / 12) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 41) / 12) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 53) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 53) / 15) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 53) / 15) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = -0.225 + (((tickAnim - 68) / 12) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            yy = -0.225 + (((tickAnim - 80) / 14) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 80) / 14) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            yy = -0.225 + (((tickAnim - 94) / 13) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 94) / 13) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            yy = -0.225 + (((tickAnim - 107) / 14) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 107) / 14) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            yy = -0.225 + (((tickAnim - 121) / 12) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 121) / 12) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 133) / 15) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 133) / 15) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            yy = -0.225 + (((tickAnim - 148) / 12) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 31 + (((tickAnim - 7) / 7) * (0-(31)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (31-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 31 + (((tickAnim - 33) / 8) * (0-(31)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 12) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (31-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 31 + (((tickAnim - 60) / 8) * (0-(31)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 80) / 7) * (31-(0)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 94) {
            xx = 31 + (((tickAnim - 87) / 7) * (0-(31)));
            yy = 0 + (((tickAnim - 87) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 7) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 13) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (31-(0)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 121) {
            xx = 31 + (((tickAnim - 113) / 8) * (0-(31)));
            yy = 0 + (((tickAnim - 113) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 8) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 12) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 133) / 7) * (31-(0)));
            yy = 0 + (((tickAnim - 133) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 7) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = 31 + (((tickAnim - 140) / 8) * (0-(31)));
            yy = 0 + (((tickAnim - 140) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 8) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (-17-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -17 + (((tickAnim - 20) / 5) * (0-(-17)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (-17-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -17 + (((tickAnim - 45) / 5) * (0-(-17)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 50) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 18) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 68) / 5) * (-17-(0)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -17 + (((tickAnim - 73) / 7) * (0-(-17)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 14) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 94) / 6) * (-17-(0)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 6) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = -17 + (((tickAnim - 100) / 7) * (0-(-17)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 14) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 121) / 6) * (-17-(0)));
            yy = 0 + (((tickAnim - 121) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 6) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = -17 + (((tickAnim - 127) / 6) * (0-(-17)));
            yy = 0 + (((tickAnim - 127) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 6) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 15) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 148) / 5) * (-17-(0)));
            yy = 0 + (((tickAnim - 148) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 5) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = -17 + (((tickAnim - 153) / 7) * (0-(-17)));
            yy = 0 + (((tickAnim - 153) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (35.5-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 35.5 + (((tickAnim - 20) / 5) * (0-(35.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (35.5-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 45) / 5) * (0-(35.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 50) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 18) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 68) / 5) * (35.5-(0)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 35.5 + (((tickAnim - 73) / 7) * (0-(35.5)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 14) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 94) / 6) * (35.5-(0)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 6) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 35.5 + (((tickAnim - 100) / 7) * (0-(35.5)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 14) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 121) / 6) * (35.5-(0)));
            yy = 0 + (((tickAnim - 121) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 6) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = 35.5 + (((tickAnim - 127) / 6) * (0-(35.5)));
            yy = 0 + (((tickAnim - 127) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 6) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 15) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 148) / 5) * (35.5-(0)));
            yy = 0 + (((tickAnim - 148) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 5) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = 35.5 + (((tickAnim - 153) / 7) * (0-(35.5)));
            yy = 0 + (((tickAnim - 153) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (-40-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -40 + (((tickAnim - 20) / 5) * (0-(-40)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (-40-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -40 + (((tickAnim - 45) / 5) * (0-(-40)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 50) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 18) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 68) / 5) * (-40-(0)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -40 + (((tickAnim - 73) / 7) * (0-(-40)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 14) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 94) / 6) * (-40-(0)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 6) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = -40 + (((tickAnim - 100) / 7) * (0-(-40)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 14) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 121) / 6) * (-40-(0)));
            yy = 0 + (((tickAnim - 121) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 6) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = -40 + (((tickAnim - 127) / 6) * (0-(-40)));
            yy = 0 + (((tickAnim - 127) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 6) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 15) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 148) / 5) * (-40-(0)));
            yy = 0 + (((tickAnim - 148) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 5) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = -40 + (((tickAnim - 153) / 7) * (0-(-40)));
            yy = 0 + (((tickAnim - 153) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 14) / 6) * (70.5-(-5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 70.5 + (((tickAnim - 20) / 5) * (-5-(70.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 25) / 15) * (-5-(-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5 + (((tickAnim - 40) / 5) * (70.5-(-5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 70.5 + (((tickAnim - 45) / 5) * (-5-(70.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 68) {
            xx = -5 + (((tickAnim - 50) / 18) * (-5-(-5)));
            yy = 0 + (((tickAnim - 50) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 18) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = -5 + (((tickAnim - 68) / 5) * (70.5-(-5)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 70.5 + (((tickAnim - 73) / 7) * (-5-(70.5)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 94) {
            xx = -5 + (((tickAnim - 80) / 14) * (-5-(-5)));
            yy = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 14) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = -5 + (((tickAnim - 94) / 6) * (70.5-(-5)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 6) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 70.5 + (((tickAnim - 100) / 7) * (-5-(70.5)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 121) {
            xx = -5 + (((tickAnim - 107) / 14) * (-5-(-5)));
            yy = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 14) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 127) {
            xx = -5 + (((tickAnim - 121) / 6) * (70.5-(-5)));
            yy = 0 + (((tickAnim - 121) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 6) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = 70.5 + (((tickAnim - 127) / 6) * (-5-(70.5)));
            yy = 0 + (((tickAnim - 127) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 6) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 148) {
            xx = -5 + (((tickAnim - 133) / 15) * (-5-(-5)));
            yy = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 15) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = -5 + (((tickAnim - 148) / 5) * (70.5-(-5)));
            yy = 0 + (((tickAnim - 148) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 5) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = 70.5 + (((tickAnim - 153) / 7) * (0-(70.5)));
            yy = 0 + (((tickAnim - 153) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            yy = -0.175 + (((tickAnim - 14) / 11) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = -0.175 + (((tickAnim - 25) / 15) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 40) / 10) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 50) / 18) * (0-(0)));
            yy = -0.175 + (((tickAnim - 50) / 18) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 50) / 18) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 68) / 12) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            yy = -0.175 + (((tickAnim - 80) / 14) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 80) / 14) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 94) / 13) * (0-(0)));
            yy = -0.175 + (((tickAnim - 94) / 13) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 94) / 13) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            yy = -0.175 + (((tickAnim - 107) / 14) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 107) / 14) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 121) / 12) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 121) / 12) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            yy = -0.175 + (((tickAnim - 133) / 15) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 133) / 15) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 148) / 12) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (21.5-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 21.5 + (((tickAnim - 20) / 7) * (0-(21.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 27) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 14) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 41) / 6) * (21.5-(0)));
            yy = 0 + (((tickAnim - 41) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 21.5 + (((tickAnim - 47) / 6) * (0-(21.5)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 53) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 15) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 68) / 5) * (21.5-(0)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 21.5 + (((tickAnim - 73) / 7) * (0-(21.5)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 14) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 94) / 6) * (21.5-(0)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 6) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 21.5 + (((tickAnim - 100) / 7) * (0-(21.5)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 14) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 121) / 6) * (21.5-(0)));
            yy = 0 + (((tickAnim - 121) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 6) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = 21.5 + (((tickAnim - 127) / 6) * (0-(21.5)));
            yy = 0 + (((tickAnim - 127) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 6) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 15) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 148) / 5) * (21.5-(0)));
            yy = 0 + (((tickAnim - 148) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 5) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = 21.5 + (((tickAnim - 153) / 7) * (0-(21.5)));
            yy = 0 + (((tickAnim - 153) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = 12.25 + (((tickAnim - 14) / 134) * (12.25-(12.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 12.25 + (((tickAnim - 148) / 12) * (0-(12.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = 16.25 + (((tickAnim - 14) / 134) * (16.25-(16.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 16.25 + (((tickAnim - 148) / 12) * (0-(16.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*-3-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = 20.25 + (((tickAnim - 14) / 134) * (20.25-(20.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*-3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*-3)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 20.25 + (((tickAnim - 148) / 12) * (0-(20.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*-3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-350))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 14) / 134) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = 5.5 + (((tickAnim - 14) / 134) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 14) / 134) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 5.5 + (((tickAnim - 148) / 12) * (0-(5.5)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = 11.75 + (((tickAnim - 14) / 134) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 14) / 134) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 11.75 + (((tickAnim - 148) / 12) * (0-(11.75)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-250))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (15.53692-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-71.25075-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = -38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*3 + (((tickAnim - 14) / 134) * (-38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*3-(-38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*3)));
            yy = 15.53692 + (((tickAnim - 14) / 134) * (15.53692-(15.53692)));
            zz = -71.25075 + (((tickAnim - 14) / 134) * (-71.25075-(-71.25075)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*3 + (((tickAnim - 148) / 12) * (0-(-38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*3)));
            yy = 15.53692 + (((tickAnim - 148) / 12) * (0-(15.53692)));
            zz = -71.25075 + (((tickAnim - 148) / 12) * (0-(-71.25075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-15.53692-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (71.25075-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = -38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-3 + (((tickAnim - 14) / 134) * (-38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-3-(-38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-3)));
            yy = -15.53692 + (((tickAnim - 14) / 134) * (-15.53692-(-15.53692)));
            zz = 71.25075 + (((tickAnim - 14) / 134) * (71.25075-(71.25075)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-3 + (((tickAnim - 148) / 12) * (0-(-38.1272942536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-3)));
            yy = -15.53692 + (((tickAnim - 148) / 12) * (0-(-15.53692)));
            zz = 71.25075 + (((tickAnim - 148) / 12) * (0-(71.25075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-300))*-3-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = -7.75 + (((tickAnim - 14) / 134) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 14) / 134) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-300))*-3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-300))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-300))*-3)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -7.75 + (((tickAnim - 148) / 12) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-300))*-3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-300))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*-3-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = -10.25 + (((tickAnim - 14) / 134) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 14) / 134) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*-3 + (((tickAnim - 14) / 134) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*-3)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -10.25 + (((tickAnim - 148) / 12) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*-3 + (((tickAnim - 148) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-450))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = -13 + (((tickAnim - 14) / 134) * (-13-(-13)));
            yy = 0 + (((tickAnim - 14) / 134) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 134) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -13 + (((tickAnim - 148) / 12) * (0-(-13)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (64.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = 64.75 + (((tickAnim - 14) / 134) * (64.75-(64.75)));
            yy = 0 + (((tickAnim - 14) / 134) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 134) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 64.75 + (((tickAnim - 148) / 12) * (0-(64.75)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-125.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 148) {
            xx = -125.5 + (((tickAnim - 14) / 134) * (-125.5-(-125.5)));
            yy = 0 + (((tickAnim - 14) / 134) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 134) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -125.5 + (((tickAnim - 148) / 12) * (0-(-125.5)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiomimus entity = (EntityPrehistoricFloraStruthiomimus) entitylivingbaseIn;
        int animCycle = 170;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 14.5 + (((tickAnim - 40) / 105) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = 14.5 + (((tickAnim - 145) / 25) * (0-(14.5)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-3.825-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            yy = -0.575 + (((tickAnim - 40) / 105) * (-0.575-(-0.575)));
            zz = -3.825 + (((tickAnim - 40) / 105) * (-3.825-(-3.825)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            yy = -0.575 + (((tickAnim - 145) / 25) * (0-(-0.575)));
            zz = -3.825 + (((tickAnim - 145) / 25) * (0-(-3.825)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-35.62-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -35.62 + (((tickAnim - 20) / 20) * (-27.75-(-35.62)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -27.75 + (((tickAnim - 40) / 105) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = -27.75 + (((tickAnim - 145) / 25) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (31.88-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 31.88 + (((tickAnim - 20) / 20) * (-10.25-(31.88)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -10.25 + (((tickAnim - 40) / 105) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 158) {
            xx = -10.25 + (((tickAnim - 145) / 13) * (33.47-(-10.25)));
            yy = 0 + (((tickAnim - 145) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 13) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 170) {
            xx = 33.47 + (((tickAnim - 158) / 12) * (0-(33.47)));
            yy = 0 + (((tickAnim - 158) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-45.37-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -45.37 + (((tickAnim - 20) / 20) * (-4.25-(-45.37)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -4.25 + (((tickAnim - 40) / 105) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 158) {
            xx = -4.25 + (((tickAnim - 145) / 13) * (-47.98-(-4.25)));
            yy = 0 + (((tickAnim - 145) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 13) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 170) {
            xx = -47.98 + (((tickAnim - 158) / 12) * (0-(-47.98)));
            yy = 0 + (((tickAnim - 158) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (100.13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 100.13 + (((tickAnim - 20) / 20) * (27.25-(100.13)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 27.25 + (((tickAnim - 40) / 105) * (27.25-(27.25)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 158) {
            xx = 27.25 + (((tickAnim - 145) / 13) * (103.97-(27.25)));
            yy = 0 + (((tickAnim - 145) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 13) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 170) {
            xx = 103.97 + (((tickAnim - 158) / 12) * (0-(103.97)));
            yy = 0 + (((tickAnim - 158) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -3 + (((tickAnim - 40) / 105) * (-3-(-3)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = -3 + (((tickAnim - 145) / 25) * (0-(-3)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -11.75 + (((tickAnim - 40) / 105) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = -11.75 + (((tickAnim - 145) / 25) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -5 + (((tickAnim - 40) / 105) * (-5-(-5)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = -5 + (((tickAnim - 145) / 25) * (0-(-5)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -7.75 + (((tickAnim - 40) / 105) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = -7.75 + (((tickAnim - 145) / 25) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = -14.25 + (((tickAnim - 40) / 105) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = -14.25 + (((tickAnim - 145) / 25) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 4 + (((tickAnim - 40) / 105) * (4-(4)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = 4 + (((tickAnim - 145) / 25) * (0-(4)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 145) {
            xx = 12 + (((tickAnim - 40) / 105) * (12-(12)));
            yy = 0 + (((tickAnim - 40) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 105) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = 12 + (((tickAnim - 145) / 25) * (0-(12)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 18.5 + (((tickAnim - 40) / 15) * (26.5-(18.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = 26.5 + (((tickAnim - 55) / 2) * (26.25-(26.5)));
            yy = 0 + (((tickAnim - 55) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 2) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 75) {
            xx = 26.25 + (((tickAnim - 57) / 18) * (5.75-(26.25)));
            yy = 0 + (((tickAnim - 57) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 18) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 5.75 + (((tickAnim - 75) / 3) * (-1.67-(5.75)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = -1.67 + (((tickAnim - 78) / 4) * (-5.21-(-1.67)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 85) {
            xx = -5.21 + (((tickAnim - 82) / 3) * (-7.5-(-5.21)));
            yy = 0 + (((tickAnim - 82) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 3) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -7.5 + (((tickAnim - 85) / 15) * (18.5-(-7.5)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 18.5 + (((tickAnim - 100) / 15) * (26.5-(18.5)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 117) {
            xx = 26.5 + (((tickAnim - 115) / 2) * (26.25-(26.5)));
            yy = 0 + (((tickAnim - 115) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 2) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 26.25 + (((tickAnim - 117) / 18) * (5.75-(26.25)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 5.75 + (((tickAnim - 135) / 3) * (-1.67-(5.75)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 142) {
            xx = -1.67 + (((tickAnim - 138) / 4) * (-5.21-(-1.67)));
            yy = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 4) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = -5.21 + (((tickAnim - 142) / 3) * (-7.5-(-5.21)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = -7.5 + (((tickAnim - 145) / 25) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -4.75 + (((tickAnim - 40) / 15) * (25.5-(-4.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = 25.5 + (((tickAnim - 55) / 2) * (24.25-(25.5)));
            yy = 0 + (((tickAnim - 55) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 2) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 75) {
            xx = 24.25 + (((tickAnim - 57) / 18) * (4-(24.25)));
            yy = 0 + (((tickAnim - 57) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 18) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 4 + (((tickAnim - 75) / 3) * (2.17-(4)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 2.17 + (((tickAnim - 78) / 4) * (8.09-(2.17)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 85) {
            xx = 8.09 + (((tickAnim - 82) / 3) * (5.75-(8.09)));
            yy = 0 + (((tickAnim - 82) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 3) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 5.75 + (((tickAnim - 85) / 15) * (-4.75-(5.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -4.75 + (((tickAnim - 100) / 15) * (25.5-(-4.75)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 117) {
            xx = 25.5 + (((tickAnim - 115) / 2) * (24.25-(25.5)));
            yy = 0 + (((tickAnim - 115) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 2) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 24.25 + (((tickAnim - 117) / 18) * (4-(24.25)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 4 + (((tickAnim - 135) / 3) * (2.17-(4)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 142) {
            xx = 2.17 + (((tickAnim - 138) / 4) * (8.09-(2.17)));
            yy = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 4) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = 8.09 + (((tickAnim - 142) / 3) * (5.75-(8.09)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = 5.75 + (((tickAnim - 145) / 25) * (0-(5.75)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -11.5 + (((tickAnim - 40) / 15) * (-1-(-11.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = -1 + (((tickAnim - 55) / 2) * (1.5-(-1)));
            yy = 0 + (((tickAnim - 55) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 2) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 75) {
            xx = 1.5 + (((tickAnim - 57) / 18) * (-11-(1.5)));
            yy = 0 + (((tickAnim - 57) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 18) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -11 + (((tickAnim - 75) / 3) * (-21.33-(-11)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = -21.33 + (((tickAnim - 78) / 4) * (-9.29-(-21.33)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 85) {
            xx = -9.29 + (((tickAnim - 82) / 3) * (-12.75-(-9.29)));
            yy = 0 + (((tickAnim - 82) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 3) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -12.75 + (((tickAnim - 85) / 15) * (-11.5-(-12.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -11.5 + (((tickAnim - 100) / 15) * (-1-(-11.5)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 117) {
            xx = -1 + (((tickAnim - 115) / 2) * (1.5-(-1)));
            yy = 0 + (((tickAnim - 115) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 2) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 1.5 + (((tickAnim - 117) / 18) * (-11-(1.5)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 18) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = -11 + (((tickAnim - 135) / 3) * (-21.33-(-11)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 142) {
            xx = -21.33 + (((tickAnim - 138) / 4) * (-9.29-(-21.33)));
            yy = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 4) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = -9.29 + (((tickAnim - 142) / 3) * (-12.75-(-9.29)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = -12.75 + (((tickAnim - 145) / 25) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 55) / 20) * (-40-(0)));
            yy = 0 + (((tickAnim - 55) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 20) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -40 + (((tickAnim - 75) / 3) * (-17.71-(-40)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = -17.71 + (((tickAnim - 78) / 4) * (-36.23-(-17.71)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 85) {
            xx = -36.23 + (((tickAnim - 82) / 3) * (-25.5-(-36.23)));
            yy = 0 + (((tickAnim - 82) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 3) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 115) {
            xx = -25.5 + (((tickAnim - 85) / 30) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 85) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 30) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 115) / 20) * (-40-(0)));
            yy = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 20) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = -40 + (((tickAnim - 135) / 3) * (-17.71-(-40)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 142) {
            xx = -17.71 + (((tickAnim - 138) / 4) * (-36.23-(-17.71)));
            yy = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 4) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = -36.23 + (((tickAnim - 142) / 3) * (-25.5-(-36.23)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = -25.5 + (((tickAnim - 145) / 25) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 26.75 + (((tickAnim - 40) / 15) * (-27.5-(26.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = -27.5 + (((tickAnim - 55) / 13) * (10.25-(-27.5)));
            yy = 0 + (((tickAnim - 55) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 13) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 10.25 + (((tickAnim - 68) / 7) * (-17.5-(10.25)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -17.5 + (((tickAnim - 75) / 3) * (4.25-(-17.5)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 4.25 + (((tickAnim - 78) / 4) * (-14.75-(4.25)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 85) {
            xx = -14.75 + (((tickAnim - 82) / 3) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 82) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 3) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (26.75-(0)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 26.75 + (((tickAnim - 100) / 15) * (-27.5-(26.75)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 128) {
            xx = -27.5 + (((tickAnim - 115) / 13) * (10.25-(-27.5)));
            yy = 0 + (((tickAnim - 115) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 13) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 135) {
            xx = 10.25 + (((tickAnim - 128) / 7) * (-17.5-(10.25)));
            yy = 0 + (((tickAnim - 128) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 7) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = -17.5 + (((tickAnim - 135) / 3) * (4.25-(-17.5)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 142) {
            xx = 4.25 + (((tickAnim - 138) / 4) * (-14.75-(4.25)));
            yy = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 4) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = -14.75 + (((tickAnim - 142) / 3) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (23.5-(0)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = 23.5 + (((tickAnim - 54) / 3) * (0-(23.5)));
            yy = 0 + (((tickAnim - 54) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 3) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 57) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 11) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 68) / 7) * (19.25-(0)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 19.25 + (((tickAnim - 75) / 3) * (0-(19.25)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 78) / 4) * (17-(0)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 85) {
            xx = 17 + (((tickAnim - 82) / 3) * (0-(17)));
            yy = 0 + (((tickAnim - 82) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 3) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 100) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 6) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 106) / 8) * (23.5-(0)));
            yy = 0 + (((tickAnim - 106) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 8) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 117) {
            xx = 23.5 + (((tickAnim - 114) / 3) * (0-(23.5)));
            yy = 0 + (((tickAnim - 114) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 3) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 128) / 7) * (19.25-(0)));
            yy = 0 + (((tickAnim - 128) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 7) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 19.25 + (((tickAnim - 135) / 3) * (0-(19.25)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 138) / 4) * (17-(0)));
            yy = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 4) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = 17 + (((tickAnim - 142) / 3) * (0-(17)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (22-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 22 + (((tickAnim - 60) / 8) * (0-(22)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 68) / 7) * (-9-(0)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -9 + (((tickAnim - 75) / 3) * (0-(-9)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 82) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 33) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 115) / 5) * (22-(0)));
            yy = 0 + (((tickAnim - 115) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 5) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 128) {
            xx = 22 + (((tickAnim - 120) / 8) * (0-(22)));
            yy = 0 + (((tickAnim - 120) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 8) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 128) / 7) * (-9-(0)));
            yy = 0 + (((tickAnim - 128) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 7) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = -9 + (((tickAnim - 135) / 3) * (0-(-9)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 4) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 142) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraStruthiomimus e = (EntityPrehistoricFloraStruthiomimus) entity;
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
