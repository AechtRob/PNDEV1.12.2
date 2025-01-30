package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAcrocanthosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAcrocanthosaurus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
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
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
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
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r62;

    private ModelAnimator animator;

    public ModelAcrocanthosaurus() {
        this.textureWidth = 192;
        this.textureHeight = 192;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -17.0F, 4.5F);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -7.0F, -7.25F, -13.0F, 14, 24, 26, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.25F, -2.25F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 94, -4.0F, -7.0F, -10.0F, 8, 7, 23, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2182F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 101, 111, -4.5F, -6.0F, -6.0F, 9, 25, 13, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 17.5F, 0.5F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7854F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 150, -3.5F, -4.0F, -4.75F, 7, 20, 8, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 15.25F, -2.5F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 50, -2.5F, -4.75F, -1.0F, 5, 13, 4, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 6.9F, 0.25F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3054F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 113, 0, -3.0F, -0.025F, -3.25F, 6, 3, 6, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 82, 111, -4.0F, -1.5F, -5.75F, 8, 3, 6, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2182F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 101, 111, -4.5F, -6.0F, -6.0F, 9, 25, 13, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 17.5F, 0.5F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7854F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 150, -3.5F, -4.0F, -4.75F, 7, 20, 8, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 15.25F, -2.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 50, -2.5F, -4.75F, -1.0F, 5, 13, 4, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 6.9F, 0.25F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3054F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 113, 0, -3.0F, -0.025F, -3.25F, 6, 3, 6, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 82, 111, -4.0F, -1.5F, -5.75F, 8, 3, 6, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.5F, 12.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 60, 30, -5.5F, -6.0F, -5.0F, 11, 16, 20, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -5.0F, 0.0F);
        this.tail1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 130, 77, -2.5F, -6.0F, -5.0F, 6, 6, 19, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.25F, 15.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 103, 47, -4.5F, -3.5F, -3.0F, 9, 11, 19, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 127, 131, -2.0F, -6.0F, -5.0F, 4, 4, 18, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 16.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 124, -3.5F, -2.75F, -3.0F, 7, 8, 18, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 1.0F, 2.0F);
        this.tail3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 75, 137, -1.0F, -6.0F, -5.0F, 3, 3, 17, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 15.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 132, 102, -2.5F, -2.0F, -2.0F, 5, 6, 16, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 2.5F, -0.5F);
        this.tail4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 114, 77, -1.5F, -6.0F, -2.25F, 2, 2, 15, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.25F, 14.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2182F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 30, 150, -1.5F, -2.0F, -1.0F, 3, 5, 13, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.25F, 12.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1309F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 159, 155, -1.0F, -1.5F, -1.0F, 2, 3, 12, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.25F, 11.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.3054F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 158, 102, -0.5F, -1.0F, -1.0F, 1, 2, 13, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.5F, -7.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 50, -9.5F, -6.25F, -22.0F, 19, 22, 22, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -5.25F, -8.25F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 111, -5.0F, -6.25F, -12.0F, 10, 6, 19, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 17.75F, -22.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 0, -10.0F, -5.0F, 0.0F, 19, 5, 21, -0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.25F, -22.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 66, 78, -8.0F, -6.0F, -11.0F, 16, 17, 16, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.5F, -2.0F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 136, -4.0F, -5.5F, -5.75F, 8, 5, 13, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 11.0F, -11.0F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4276F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 102, 26, -8.0F, -6.0F, 0.0F, 16, 6, 13, -0.01F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(8.0F, 9.25F, -6.75F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.829F, 0.1745F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 132, 102, -1.5F, -2.25F, -1.5F, 3, 8, 4, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 4.75F, 0.15F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.9599F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 32, 124, -1.0F, -1.0F, -1.5F, 2, 5, 3, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(1.0F, 4.0F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.4363F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 102, 26, -2.0F, 0.0F, -2.0F, 2, 6, 4, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-8.0F, 9.25F, -6.75F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.829F, -0.1745F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 132, 102, -1.5F, -2.25F, -1.5F, 3, 8, 4, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 4.75F, 0.15F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.9599F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 32, 124, -1.0F, -1.0F, -1.5F, 2, 5, 3, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-1.0F, 4.0F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.4363F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 102, 26, 0.0F, 0.0F, -2.0F, 2, 6, 4, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.4363F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 134, 0, -5.0F, -5.0F, -4.0F, 10, 12, 11, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.5F, -8.25F);
        this.neck1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 153, 124, -3.5F, -7.25F, 3.0F, 7, 5, 9, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3054F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 140, 45, -4.0F, -5.5F, -8.0F, 8, 11, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -11.0F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 147, 23, -3.0F, -7.75F, 3.0F, 6, 5, 10, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -7.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3927F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 105, 153, -3.5F, -5.2F, -8.25F, 7, 9, 10, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -9.05F, -3.0F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 94, -2.5F, -0.0412F, 0.0211F, 5, 4, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.7F, -9.25F);
        this.neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 94, -2.0F, -5.75F, 1.75F, 4, 4, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.0F, -7.25F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, 2.5F, -18.2867F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.1545F, -0.0381F, -0.1201F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 124, 0.0F, -12.0F, 0.0F, 1, 12, 4, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.9445F, -2.9041F, -5.5685F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3564F, -0.464F, -0.7785F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 50, -1.0F, 0.55F, -0.3F, 2, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 2.5F, -18.2867F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.98F, -0.0381F, -0.1201F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 67, 0, 0.0F, -12.3481F, 1.7365F, 1, 3, 3, 0.01F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, 2.5F, -18.2867F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.9836F, -0.0381F, -0.1201F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -11.0992F, -9.4813F, 1, 3, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.0F, 5.65F, -4.0F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2182F, -0.4102F, 0.0436F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 82, 120, 0.0F, -7.8104F, -5.2685F, 1, 2, 7, -0.01F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.0F, 5.65F, -4.0F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.4102F, 0.0436F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 114, 77, 0.0F, -6.0F, -6.0F, 1, 6, 6, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.9522F, 6.7404F, -8.8146F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1745F, -0.4102F, 0.0436F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 18, 0.3F, -1.0F, 0.85F, 0, 1, 5, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.9445F, -2.9041F, -5.5685F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3564F, 0.464F, 0.7785F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 50, -1.0F, 0.55F, -0.3F, 2, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.5F, 2.5F, -18.2867F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.9836F, 0.0381F, 0.1201F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -1.0F, -11.0992F, -9.4813F, 1, 3, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, 2.5F, -18.2867F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.98F, 0.0381F, 0.1201F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 67, 0, -1.0F, -12.3481F, 1.7365F, 1, 3, 3, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, 2.5F, -18.2867F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.1545F, 0.0381F, 0.1201F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 124, -1.0F, -12.0F, 0.0F, 1, 12, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -2.2541F, -6.5393F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.3963F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 53, 105, -2.5F, -5.0F, 0.0F, 5, 5, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.5F, -18.2867F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.1868F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 10, 124, -1.5F, -13.0F, 0.0F, 3, 13, 1, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 2.5F, -18.1867F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2967F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 88, 27, -1.5F, 1.55F, 0.0F, 3, 1, 2, -0.01F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 65, 9, -1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 4.9575F, -19.8574F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5672F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 54, 0, -1.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 6.8247F, -16.773F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 15, 94, -1.0F, -0.1F, -3.0F, 2, 1, 1, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 71, 66, -1.0F, -2.0F, -3.0F, 2, 2, 1, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 6.6148F, -15.2351F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2618F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 54, 0, -1.5F, -0.75F, 0.0F, 3, 2, 7, 0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 6.5009F, -17.368F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3054F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 13, -0.5F, -0.75F, -2.0F, 1, 2, 1, 0.01F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 54, 4, -1.0F, 0.25F, 0.0F, 2, 2, 1, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 6.8247F, -16.823F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0436F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 96, 26, -1.5F, -0.1F, -2.0F, 3, 1, 2, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 12, 67, -1.5F, -2.0F, -2.0F, 3, 2, 2, 0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 5.65F, -8.0F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 82, 68, -2.0F, -0.05F, -9.0F, 4, 1, 9, -0.02F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 161, 65, -2.0F, -4.0F, -9.0F, 4, 4, 10, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -4.0647F, -3.5637F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.6545F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 76, 66, -1.0F, 0.0F, -4.0F, 3, 2, 4, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -5.1F, 0.3F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2618F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 32, 132, -1.0F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(4.0F, 5.65F, -4.0F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2182F, 0.4102F, -0.0436F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 82, 120, -1.0F, -7.8104F, -5.2685F, 1, 2, 7, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.9522F, 6.7404F, -8.8146F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1745F, 0.4102F, -0.0436F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 18, -0.3F, -1.0F, 0.85F, 0, 1, 5, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(4.0F, 5.65F, -4.0F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.4102F, -0.0436F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 114, 77, -1.0F, -6.0F, -6.0F, 1, 6, 6, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.0F, -2.35F, -4.0F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.3054F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 153, 138, -4.5F, 0.0F, -0.3F, 7, 2, 5, 0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.0F, 1.4F, 1.0F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 0, -5.0F, -3.75F, -5.0F, 8, 8, 5, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -0.35F, -5.65F);
        this.head.addChild(eyes);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-4.0F, 6.0F, 1.65F);
        this.eyes.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, -0.4102F, 0.0436F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 82, 72, 0.0F, -6.5F, -2.75F, 1, 1, 2, 0.01F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(4.0F, 6.0F, 1.65F);
        this.eyes.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.4102F, -0.0436F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 82, 72, -1.0F, -6.5F, -2.75F, 1, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.9F, 1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 3.3445F, -19.9097F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 1.4661F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 24, -1.5F, 1.25F, 0.0F, 3, 1, 1, -0.02F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 18, 23, -1.5F, 0.0F, 0.0F, 3, 2, 1, -0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 2.837F, -20.7213F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 1.0385F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 82, 75, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 1.3396F, -15.1304F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0873F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 86, 66, -1.0F, -0.75F, -5.7F, 2, 1, 1, -0.01F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 92, 66, -1.0F, -1.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 16, -0.5F, -1.0F, -5.0F, 1, 1, 1, 0.0F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 8, 23, -1.5F, -0.75F, -4.75F, 3, 1, 2, -0.01F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 80, 26, -1.5F, 0.0F, -4.75F, 3, 1, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 1.4268F, -16.1266F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1309F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 60, 66, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 1.3396F, -15.0804F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0873F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 94, -1.0F, 0.0F, -5.75F, 2, 1, 1, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 1.3396F, -15.2804F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0873F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 113, 9, -2.0F, -0.75F, -2.65F, 4, 1, 6, -0.03F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 39, 105, -2.0F, 0.0F, -2.65F, 4, 2, 6, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.1426F, -11.9914F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.3491F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 67, -2.0F, 0.0F, -4.0F, 4, 1, 4, -0.01F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0436F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 133, 77, -2.0F, 0.0F, -9.05F, 4, 3, 4, 0.01F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -0.25F, -5.0F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.3491F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 56, 94, -3.75F, -3.0F, 0.4F, 1, 3, 4, -0.02F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-4.0F, -0.25F, -5.0F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.3285F, -0.4156F, -0.1027F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 133, 84, 0.0F, 2.5677F, -3.3663F, 2, 2, 5, -0.01F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-4.0F, -0.25F, -5.0F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.1078F, -0.4156F, -0.1027F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 50, 136, 0.0F, 0.0F, -5.0F, 1, 3, 5, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.9486F, 0.0796F, -9.5479F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.3383F, -0.3704F, 0.1589F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 54, 9, 0.2F, -7.0F, 0.25F, 3, 7, 5, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(4.0F, -0.25F, -5.0F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.3285F, 0.4156F, 0.1027F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 133, 84, -2.0F, 2.5677F, -3.3663F, 2, 2, 5, -0.01F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, -0.25F, -5.0F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.3491F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 91, 120, 2.75F, -3.0F, 0.4F, 1, 3, 4, -0.02F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(1.9486F, 0.0796F, -9.5479F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.3383F, 0.3704F, -0.1589F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 54, 9, -3.2F, -7.0F, 0.25F, 3, 7, 5, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(4.0F, -0.25F, -5.0F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1078F, 0.4156F, 0.1027F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 50, 136, -1.0F, 0.0F, -5.0F, 1, 3, 5, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 4.75F, -5.0F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.2269F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 105, -2.0F, -1.0F, -7.0F, 4, 1, 7, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, -3.5F, 0.0F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 13, -4.0F, 3.25F, -5.0F, 8, 5, 5, -0.01F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 4.7654F, -5.0093F);
        this.jaw.addChild(throat1);
        this.setRotateAngle(throat1, 0.0436F, 0.0F, 0.0F);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat1.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.3491F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 62, 157, -3.0F, -6.0F, 0.0F, 6, 6, 9, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -1.9623F, 9.2276F);
        this.throat1.addChild(throat2);
        this.setRotateAngle(throat2, -0.3927F, 0.0F, 0.0F);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.3491F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 139, 153, -3.5F, 0.0F, -1.0F, 7, 5, 9, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(neck1, -0.2F, 0.1F, 0.05F);
        this.setRotateAngle(neck2, -0.4F, 0.1F, 0.05F);
        this.setRotateAngle(neck3, 0.2F, 0.1F, 0.05F);
        this.setRotateAngle(head, 0.4F, 0.1F, 0.05F);
        this.setRotateAngle(jaw, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(throat1, 0.0F, -0.08F, 0.0F);
        this.setRotateAngle(throat2, 0.0F, -0.08F, 0.0F);
        this.leftArm1.setScale(0,0,0);
        this.rightArm1.setScale(0,0,0);
        this.leftArm1.scaleChildren = true;
        this.rightArm1.scaleChildren = true;
        this.chest.offsetX = -0.0F;
        this.chest.offsetY = -0.05F;
        this.chest.offsetZ = 0.2F;
        this.chest.render(0.01F);
        this.leftArm1.setScale(1,1,1);
        this.rightArm1.setScale(1,1,1);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hips, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.08F, 0.05F, 0.0F);
        this.setRotateAngle(chest, 0.08F, 0.05F, 0.0F);
        this.setRotateAngle(neck1, -0.5F, 0.1F, 0.05F);
        this.setRotateAngle(neck2, -0.3F, 0.1F, 0.05F);
        this.setRotateAngle(neck3, 0.45F, 0.1F, 0.05F);
        this.setRotateAngle(head, 0.5F, 0.1F, 0.05F);
        this.setRotateAngle(jaw, 0.08F, 0.0F, 0.0F);
        this.setRotateAngle(throat1, 0.0F, -0.08F, 0.0F);
        this.setRotateAngle(throat2, 0.0F, -0.08F, 0.0F);
        this.setRotateAngle(tail1, -0.1F, 0.05F, 0.0F);
        this.setRotateAngle(tail2, 0.15F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, -0.05F, -0.12F, 0.0F);
        this.setRotateAngle(tail4, -0.1F, -0.14F, 0.0F);
        this.setRotateAngle(tail5, -0.15F, -0.16F, 0.0F);
        this.setRotateAngle(tail6, -0.2F, -0.18F, 0.0F);
        this.setRotateAngle(tail7, -0.25F, -0.2F, 0.0F);
        this.setRotateAngle(leftLeg1, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftFoot, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftToes, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.55F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(rightFoot, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightToes, 0.0F, 0.0F, 0.0F);
        this.rightFoot.offsetZ = 0.001F;
        this.hips.offsetY = -0.16F;
        this.hips.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.20F;
        this.hips.offsetX = 0.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(220);
        this.hips.rotateAngleX = (float)Math.toRadians(12);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 0.6F;
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

        EntityPrehistoricFloraAcrocanthosaurus EntityAcrocanthosaurus = (EntityPrehistoricFloraAcrocanthosaurus) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightHand};

        EntityAcrocanthosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityAcrocanthosaurus.getAnimation() == EntityAcrocanthosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityAcrocanthosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityAcrocanthosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityAcrocanthosaurus.getIsFast()) { //Running


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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAcrocanthosaurus entity = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 5) / 8) * (0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1-(2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1 + (((tickAnim - 13) / 7) * (0-(0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 5) / 8) * (3.25-(-3.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.25 + (((tickAnim - 13) / 7) * (0-(3.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -4.75 + (((tickAnim - 5) / 8) * (18.26334-(-4.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0.40991-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (3.72756-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.26334 + (((tickAnim - 13) / 7) * (0-(18.26334)));
            yy = 0.40991 + (((tickAnim - 13) / 7) * (0-(0.40991)));
            zz = 3.72756 + (((tickAnim - 13) / 7) * (0-(3.72756)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -1.5 + (((tickAnim - 5) / 8) * (10.5013-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0.08547-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (1.74791-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.5013 + (((tickAnim - 13) / 7) * (0-(10.5013)));
            yy = 0.08547 + (((tickAnim - 13) / 7) * (0-(0.08547)));
            zz = 1.74791 + (((tickAnim - 13) / 7) * (0-(1.74791)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.75 + (((tickAnim - 5) / 8) * (-17.00077-(0.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (-0.11991-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0.74035-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -17.00077 + (((tickAnim - 13) / 7) * (0-(-17.00077)));
            yy = -0.11991 + (((tickAnim - 13) / 7) * (0-(-0.11991)));
            zz = 0.74035 + (((tickAnim - 13) / 7) * (0-(0.74035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2.75 + (((tickAnim - 5) / 4) * (0.84-(2.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.84 + (((tickAnim - 9) / 4) * (-13.5-(0.84)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -13.5 + (((tickAnim - 13) / 7) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 3.5 + (((tickAnim - 5) / 4) * (29.89-(3.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 29.89 + (((tickAnim - 9) / 4) * (0-(29.89)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -6.75 + (((tickAnim - 5) / 4) * (-31-(-6.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -31 + (((tickAnim - 9) / 4) * (19.25-(-31)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 19.25 + (((tickAnim - 13) / 7) * (0-(19.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAcrocanthosaurus entity = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 8 + (((tickAnim - 10) / 2) * (7.5-(8)));
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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 6.25 + (((tickAnim - 10) / 2) * (5.25-(6.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 12) / 8) * (0-(5.25)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 25.5 + (((tickAnim - 10) / 2) * (21-(25.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 12) / 8) * (0-(21)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23.5 + (((tickAnim - 10) / 10) * (0-(23.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 6.25 + (((tickAnim - 12) / 3) * (14.75-(6.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 14.75 + (((tickAnim - 15) / 5) * (0-(14.75)));
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
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 5) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 5) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 13.75 + (((tickAnim - 8) / 2) * (0-(13.75)));
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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAcrocanthosaurus entity = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = -11.75 + (((tickAnim - 0) / 23) * (11.5-(-11.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 11.5 + (((tickAnim - 23) / 27) * (-11.75-(11.5)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -8.75 + (((tickAnim - 0) / 23) * (23.5-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 23.5 + (((tickAnim - 23) / 27) * (-8.75-(23.5)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -1.375 + (((tickAnim - 0) / 23) * (0-(-1.375)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (-1.375-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -9 + (((tickAnim - 0) / 23) * (8.5-(-9)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 8.5 + (((tickAnim - 23) / 10) * (-55.24-(8.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -55.24 + (((tickAnim - 33) / 10) * (-55.24-(-55.24)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -55.24 + (((tickAnim - 43) / 7) * (-9-(-55.24)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -1.325 + (((tickAnim - 0) / 23) * (0-(-1.325)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (-1.325-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 29.5 + (((tickAnim - 0) / 23) * (54-(29.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 54 + (((tickAnim - 23) / 10) * (78.77-(54)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 78.77 + (((tickAnim - 33) / 10) * (78.77-(78.77)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 78.77 + (((tickAnim - 43) / 7) * (29.5-(78.77)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.475-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 2.475 + (((tickAnim - 10) / 13) * (1.55-(2.475)));
            zz = 0 + (((tickAnim - 10) / 13) * (-1.15-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 1.55 + (((tickAnim - 23) / 10) * (2.05-(1.55)));
            zz = -1.15 + (((tickAnim - 23) / 10) * (-1.125-(-1.15)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 2.05 + (((tickAnim - 33) / 10) * (2.05-(2.05)));
            zz = -1.125 + (((tickAnim - 33) / 10) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 2.05 + (((tickAnim - 43) / 7) * (0-(2.05)));
            zz = -1.125 + (((tickAnim - 43) / 7) * (0-(-1.125)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-40.43-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -40.43 + (((tickAnim - 10) / 13) * (41-(-40.43)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 41 + (((tickAnim - 23) / 27) * (0-(41)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.625-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0.05 + (((tickAnim - 23) / 27) * (0-(0.05)));
            zz = 0.625 + (((tickAnim - 23) / 27) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+90))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+120))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+150))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+170))*2));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+170))*2));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+190))*-4));
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0), tail7.rotateAngleY + (float) Math.toRadians(0), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+220))*-6));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0.25249), body.rotateAngleY + (float) Math.toRadians(-3.48645), body.rotateAngleZ + (float) Math.toRadians(3.9993+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+50))*2));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(-9), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(12.70541), neck1.rotateAngleY + (float) Math.toRadians(-8.22683), neck1.rotateAngleZ + (float) Math.toRadians(0.62+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-30))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8.25568), neck2.rotateAngleY + (float) Math.toRadians(-6.24914), neck2.rotateAngleZ + (float) Math.toRadians(-0.104+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-60))*2));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(4.64448), neck3.rotateAngleY + (float) Math.toRadians(-7.70912), neck3.rotateAngleZ + (float) Math.toRadians(-2.1441+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-90))*2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-8), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0), throat1.rotateAngleY + (float) Math.toRadians(11.5), throat1.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAcrocanthosaurus entity = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -8 + (((tickAnim - 18) / 12) * (-8-(-8)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 30) / 20) * (0-(-8)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-11.475-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (6.4-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -11.475 + (((tickAnim - 18) / 12) * (-11.475-(-11.475)));
            zz = 6.4 + (((tickAnim - 18) / 12) * (6.4-(6.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -11.475 + (((tickAnim - 30) / 20) * (0-(-11.475)));
            zz = 6.4 + (((tickAnim - 30) / 20) * (0-(6.4)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -17.75 + (((tickAnim - 18) / 12) * (-17.75-(-17.75)));
            yy = -9.5 + (((tickAnim - 18) / 12) * (-9.5-(-9.5)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 30) / 20) * (0-(-17.75)));
            yy = -9.5 + (((tickAnim - 30) / 20) * (0-(-9.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 46.5 + (((tickAnim - 18) / 12) * (46.5-(46.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 46.5 + (((tickAnim - 30) / 20) * (0-(46.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2.3-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 2.3 + (((tickAnim - 18) / 12) * (2.3-(2.3)));
            zz = -2.425 + (((tickAnim - 18) / 12) * (-2.425-(-2.425)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.3 + (((tickAnim - 30) / 20) * (0-(2.3)));
            zz = -2.425 + (((tickAnim - 30) / 20) * (0-(-2.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -30.75 + (((tickAnim - 18) / 12) * (-30.75-(-30.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -30.75 + (((tickAnim - 30) / 20) * (0-(-30.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0.55 + (((tickAnim - 18) / 12) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.55 + (((tickAnim - 30) / 20) * (0-(0.55)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 18) / 12) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 30) / 20) * (0-(10.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -17.75 + (((tickAnim - 18) / 12) * (-17.75-(-17.75)));
            yy = 9.5 + (((tickAnim - 18) / 12) * (9.5-(9.5)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 30) / 20) * (0-(-17.75)));
            yy = 9.5 + (((tickAnim - 30) / 20) * (0-(9.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 46.5 + (((tickAnim - 18) / 12) * (46.5-(46.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 46.5 + (((tickAnim - 30) / 20) * (0-(46.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2.3-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 2.3 + (((tickAnim - 18) / 12) * (2.3-(2.3)));
            zz = -2.425 + (((tickAnim - 18) / 12) * (-2.425-(-2.425)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.3 + (((tickAnim - 30) / 20) * (0-(2.3)));
            zz = -2.425 + (((tickAnim - 30) / 20) * (0-(-2.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -30.75 + (((tickAnim - 18) / 12) * (-30.75-(-30.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -30.75 + (((tickAnim - 30) / 20) * (0-(-30.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0.55 + (((tickAnim - 18) / 12) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.55 + (((tickAnim - 30) / 20) * (0-(0.55)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 18) / 12) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 30) / 20) * (0-(10.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(0), rightToes.rotateAngleY + (float) Math.toRadians(0), rightToes.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -6.25 + (((tickAnim - 18) / 12) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.25 + (((tickAnim - 30) / 20) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -11 + (((tickAnim - 10) / 8) * (-12.25-(-11)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -12.25 + (((tickAnim - 18) / 12) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -12.25 + (((tickAnim - 30) / 6) * (-10.93-(-12.25)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -10.93 + (((tickAnim - 36) / 14) * (0-(-10.93)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -1.75 + (((tickAnim - 18) / 12) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 30) / 20) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.57-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 6.57 + (((tickAnim - 10) / 8) * (13.25-(6.57)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 18) / 12) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 13.25 + (((tickAnim - 30) / 6) * (-2.86-(13.25)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -2.86 + (((tickAnim - 36) / 14) * (0-(-2.86)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.89-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 11.89 + (((tickAnim - 10) / 8) * (27-(11.89)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 27 + (((tickAnim - 18) / 12) * (27-(27)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 27 + (((tickAnim - 30) / 6) * (15.79-(27)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 15.79 + (((tickAnim - 36) / 5) * (0.17-(15.79)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0.17 + (((tickAnim - 41) / 9) * (0-(0.17)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 12.75 + (((tickAnim - 18) / 12) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 12.75 + (((tickAnim - 30) / 6) * (22.56-(12.75)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 22.56 + (((tickAnim - 36) / 5) * (7.35-(22.56)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 7.35 + (((tickAnim - 41) / 4) * (0.35-(7.35)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.35 + (((tickAnim - 45) / 5) * (0-(0.35)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 15.25 + (((tickAnim - 18) / 12) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 15.25 + (((tickAnim - 30) / 6) * (28.37-(15.25)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 28.37 + (((tickAnim - 36) / 5) * (22.9-(28.37)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 22.9 + (((tickAnim - 41) / 4) * (2.99-(22.9)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 2.99 + (((tickAnim - 45) / 5) * (0-(2.99)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 6.5 + (((tickAnim - 18) / 12) * (7-(6.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 30) / 20) * (0-(7)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 5.75 + (((tickAnim - 18) / 12) * (5-(5.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 30) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 10.75 + (((tickAnim - 18) / 12) * (9.25-(10.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 18) / 12) * (-6.75-(-6)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 30) / 20) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 18) / 12) * (-3-(-9.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 30) / 20) * (0-(-3)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animNoiseHiss(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAcrocanthosaurus entity = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;
        int animCycle = 49;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7 + (((tickAnim - 15) / 20) * (3.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*0.5-(10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 3.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*0.5 + (((tickAnim - 35) / 14) * (0-(3.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*0.5)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 15) / 20) * (-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*0.5-(-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*0.5 + (((tickAnim - 35) / 14) * (0-(-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*0.5)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5 + (((tickAnim - 15) / 20) * (16.9575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*-1-(-6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5)));
            yy = 0 + (((tickAnim - 15) / 20) * (-0.19517-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-2.8278-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 16.9575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*-1 + (((tickAnim - 35) / 14) * (0-(16.9575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*-1)));
            yy = -0.19517 + (((tickAnim - 35) / 14) * (0-(-0.19517)));
            zz = -2.8278 + (((tickAnim - 35) / 14) * (0-(-2.8278)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 15) / 20) * (3.0186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0.21049-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-3.49367-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 3.0186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 35) / 14) * (0-(3.0186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            yy = 0.21049 + (((tickAnim - 35) / 14) * (0-(0.21049)));
            zz = -3.49367 + (((tickAnim - 35) / 14) * (0-(-3.49367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7 + (((tickAnim - 15) / 20) * (-14.91744-(7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (-0.29001-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-2.98596-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -14.91744 + (((tickAnim - 35) / 14) * (0-(-14.91744)));
            yy = -0.29001 + (((tickAnim - 35) / 14) * (0-(-0.29001)));
            zz = -2.98596 + (((tickAnim - 35) / 14) * (0-(-2.98596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 15) / 20) * (-12.675-(-10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -12.675 + (((tickAnim - 35) / 14) * (0-(-12.675)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1 + (((tickAnim - 15) / 8) * (-0.175-(3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -0.175 + (((tickAnim - 23) / 12) * (-0.175-(-0.175)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -0.175 + (((tickAnim - 35) / 14) * (0-(-0.175)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (9.25-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 23) / 12) * (19.25-(9.25)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 19.25 + (((tickAnim - 35) / 14) * (0-(19.25)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 5) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 5) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAcrocanthosaurus entity = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950+50))*0.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950+50))*0.5 + (((tickAnim - 50) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950+50))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 1.25 + (((tickAnim - 30) / 8) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 38) / 12) * (0.65-(1.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950))*0.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0.65 + (((tickAnim - 50) / 10) * (0-(0.65)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950))*0.5 + (((tickAnim - 50) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 6.25 + (((tickAnim - 30) / 8) * (6.75-(6.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 38) / 12) * (6.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(6.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 6.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 50) / 10) * (0-(6.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3 + (((tickAnim - 50) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -2.25 + (((tickAnim - 30) / 8) * (-2.75-(-2.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 38) / 12) * (3.98-(-2.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*2-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 3.98 + (((tickAnim - 50) / 10) * (0-(3.98)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*2 + (((tickAnim - 50) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -8.25 + (((tickAnim - 30) / 8) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 38) / 12) * (-8.81-(-8.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -8.81 + (((tickAnim - 50) / 10) * (0-(-8.81)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 50) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -10.25 + (((tickAnim - 30) / 8) * (-11.5-(-10.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 38) / 12) * (-8.81-(-11.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*0.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -8.81 + (((tickAnim - 50) / 10) * (0-(-8.81)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*0.5 + (((tickAnim - 50) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (0.155-(1)));
            zz = 1 + (((tickAnim - 0) / 30) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 30) / 8) * (1-(1)));
            yy = 0.155 + (((tickAnim - 30) / 8) * (0.0475-(0.155)));
            zz = 1 + (((tickAnim - 30) / 8) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 1 + (((tickAnim - 38) / 6) * (1-(1)));
            yy = 0.0475 + (((tickAnim - 38) / 6) * (1-(0.0475)));
            zz = 1 + (((tickAnim - 38) / 6) * (1-(1)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = 1 + (((tickAnim - 44) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 44) / 7) * (0.005-(1)));
            zz = 1 + (((tickAnim - 44) / 7) * (1-(1)));
        }
        else if (tickAnim >= 51 && tickAnim < 58) {
            xx = 1 + (((tickAnim - 51) / 7) * (1-(1)));
            yy = 0.005 + (((tickAnim - 51) / 7) * (1-(0.005)));
            zz = 1 + (((tickAnim - 51) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 25.75 + (((tickAnim - 30) / 8) * (27.25-(25.75)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 27.25 + (((tickAnim - 38) / 10) * (0-(27.25)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 38) / 12) * (17-(-7)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 17 + (((tickAnim - 50) / 10) * (0-(17)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 50) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAcrocanthosaurus entity = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;
        int animCycle = 210;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 0) / 210) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 210) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 210) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 20) / 164) * (0-(0)));
            yy = -0.8 + (((tickAnim - 20) / 164) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 20) / 164) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            yy = -0.8 + (((tickAnim - 184) / 26) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = -9 + (((tickAnim - 20) / 42) * (-9-(-9)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = -9 + (((tickAnim - 62) / 122) * (-9-(-9)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -9 + (((tickAnim - 184) / 26) * (0-(-9)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.75 + (((tickAnim - 10) / 10) * (-11-(3.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = -11 + (((tickAnim - 20) / 42) * (-11-(-11)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = -11 + (((tickAnim - 62) / 122) * (-11-(-11)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 198) {
            xx = -11 + (((tickAnim - 184) / 14) * (26.93-(-11)));
            yy = 0 + (((tickAnim - 184) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 14) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 210) {
            xx = 26.93 + (((tickAnim - 198) / 12) * (0-(26.93)));
            yy = 0 + (((tickAnim - 198) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-39.87-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -39.87 + (((tickAnim - 10) / 10) * (13.25-(-39.87)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = 13.25 + (((tickAnim - 20) / 42) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = 13.25 + (((tickAnim - 62) / 122) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 198) {
            xx = 13.25 + (((tickAnim - 184) / 14) * (-30.52-(13.25)));
            yy = 0 + (((tickAnim - 184) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 14) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 210) {
            xx = -30.52 + (((tickAnim - 198) / 12) * (0-(-30.52)));
            yy = 0 + (((tickAnim - 198) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            yy = -0.725 + (((tickAnim - 20) / 42) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            yy = -0.725 + (((tickAnim - 62) / 122) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            yy = -0.725 + (((tickAnim - 184) / 26) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (74-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 74 + (((tickAnim - 10) / 10) * (8-(74)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = 8 + (((tickAnim - 20) / 42) * (8-(8)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = 8 + (((tickAnim - 62) / 122) * (8-(8)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 198) {
            xx = 8 + (((tickAnim - 184) / 14) * (48.56-(8)));
            yy = 0 + (((tickAnim - 184) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 14) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 204) {
            xx = 48.56 + (((tickAnim - 198) / 6) * (74.91-(48.56)));
            yy = 0 + (((tickAnim - 198) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 6) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 210) {
            xx = 74.91 + (((tickAnim - 204) / 6) * (0-(74.91)));
            yy = 0 + (((tickAnim - 204) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.575-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -0.575 + (((tickAnim - 10) / 10) * (0-(-0.575)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 184) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 184) / 14) * (1.625-(0)));
            zz = 0 + (((tickAnim - 184) / 14) * (-0.775-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 198) / 12) * (0-(0)));
            yy = 1.625 + (((tickAnim - 198) / 12) * (0-(1.625)));
            zz = -0.775 + (((tickAnim - 198) / 12) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 62 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 184) / 6) * (-7.47-(0)));
            yy = 0 + (((tickAnim - 184) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 6) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 198) {
            xx = -7.47 + (((tickAnim - 190) / 8) * (10.25-(-7.47)));
            yy = 0 + (((tickAnim - 190) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 8) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 204) {
            xx = 10.25 + (((tickAnim - 198) / 6) * (-50.25-(10.25)));
            yy = 0 + (((tickAnim - 198) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 6) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 210) {
            xx = -50.25 + (((tickAnim - 204) / 6) * (0-(-50.25)));
            yy = 0 + (((tickAnim - 204) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = 1.5 + (((tickAnim - 20) / 42) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = 1.5 + (((tickAnim - 62) / 122) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 1.5 + (((tickAnim - 184) / 26) * (0-(1.5)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = -2.5 + (((tickAnim - 20) / 42) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = -2.5 + (((tickAnim - 62) / 122) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -2.5 + (((tickAnim - 184) / 26) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 95) {
            xx = 6 + (((tickAnim - 55) / 40) * (5.25-(6)));
            yy = 0 + (((tickAnim - 55) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 40) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 136) {
            xx = 5.25 + (((tickAnim - 95) / 41) * (0-(5.25)));
            yy = 0 + (((tickAnim - 95) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 41) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 136) / 48) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -0.75 + (((tickAnim - 184) / 26) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 95) {
            xx = -6.5 + (((tickAnim - 55) / 40) * (-6.25-(-6.5)));
            yy = 0 + (((tickAnim - 55) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 40) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 136) {
            xx = -6.25 + (((tickAnim - 95) / 41) * (-8.25-(-6.25)));
            yy = 0 + (((tickAnim - 95) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 41) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = -8.25 + (((tickAnim - 136) / 48) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -8.25 + (((tickAnim - 184) / 26) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 55) / 40) * (5.25-(0)));
            yy = 0 + (((tickAnim - 55) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 40) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 136) {
            xx = 5.25 + (((tickAnim - 95) / 41) * (12.25-(5.25)));
            yy = 0 + (((tickAnim - 95) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 41) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 12.25 + (((tickAnim - 136) / 48) * (7-(12.25)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 7 + (((tickAnim - 184) / 26) * (0-(7)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 0) / 136) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 136) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 6.5 + (((tickAnim - 136) / 48) * (4.25-(6.5)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 4.25 + (((tickAnim - 184) / 26) * (0-(4.25)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 0) / 136) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 136) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 7.5 + (((tickAnim - 136) / 48) * (4.75-(7.5)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 4.75 + (((tickAnim - 184) / 26) * (0-(4.75)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 0) / 136) * (5.2-(0)));
            yy = 0 + (((tickAnim - 0) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 136) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 5.2 + (((tickAnim - 136) / 48) * (-8.75-(5.2)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -8.75 + (((tickAnim - 184) / 26) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 0) / 136) * (7.82-(0)));
            yy = 0 + (((tickAnim - 0) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 136) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 7.82 + (((tickAnim - 136) / 48) * (-4.25-(7.82)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -4.25 + (((tickAnim - 184) / 26) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 98) {
            xx = 9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2 + (((tickAnim - 55) / 43) * (12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-2-(9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2)));
            yy = 0 + (((tickAnim - 55) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 43) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 121) {
            xx = 12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-2 + (((tickAnim - 98) / 23) * (5.3739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-2)));
            yy = 0 + (((tickAnim - 98) / 23) * (1.99899-(0)));
            zz = 0 + (((tickAnim - 98) / 23) * (-0.06353-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 138) {
            xx = 5.3739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 121) / 17) * (4.7739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(5.3739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 1.99899 + (((tickAnim - 121) / 17) * (1.99899-(1.99899)));
            zz = -0.06353 + (((tickAnim - 121) / 17) * (-0.06353-(-0.06353)));
        }
        else if (tickAnim >= 138 && tickAnim < 167) {
            xx = 4.7739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 138) / 29) * (2.5489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-2-(4.7739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 1.99899 + (((tickAnim - 138) / 29) * (1.99899-(1.99899)));
            zz = -0.06353 + (((tickAnim - 138) / 29) * (-0.06353-(-0.06353)));
        }
        else if (tickAnim >= 167 && tickAnim < 184) {
            xx = 2.5489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-2 + (((tickAnim - 167) / 17) * (1.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-130))*-2-(2.5489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-2)));
            yy = 1.99899 + (((tickAnim - 167) / 17) * (1.99899-(1.99899)));
            zz = -0.06353 + (((tickAnim - 167) / 17) * (-0.06353-(-0.06353)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 1.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-130))*-2 + (((tickAnim - 184) / 26) * (0-(1.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-130))*-2)));
            yy = 1.99899 + (((tickAnim - 184) / 26) * (0-(1.99899)));
            zz = -0.06353 + (((tickAnim - 184) / 26) * (0-(-0.06353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 121) {
            xx = 5 + (((tickAnim - 55) / 66) * (-0.24649-(5)));
            yy = 0 + (((tickAnim - 55) / 66) * (3.24765-(0)));
            zz = 0 + (((tickAnim - 55) / 66) * (0.12376-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 160) {
            xx = -0.24649 + (((tickAnim - 121) / 39) * (-1.99649-(-0.24649)));
            yy = 3.24765 + (((tickAnim - 121) / 39) * (3.24765-(3.24765)));
            zz = 0.12376 + (((tickAnim - 121) / 39) * (0.12376-(0.12376)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -1.99649 + (((tickAnim - 160) / 10) * (-2.74649-(-1.99649)));
            yy = 3.24765 + (((tickAnim - 160) / 10) * (3.24765-(3.24765)));
            zz = 0.12376 + (((tickAnim - 160) / 10) * (0.12376-(0.12376)));
        }
        else if (tickAnim >= 170 && tickAnim < 184) {
            xx = -2.74649 + (((tickAnim - 170) / 14) * (-3.24649-(-2.74649)));
            yy = 3.24765 + (((tickAnim - 170) / 14) * (3.24765-(3.24765)));
            zz = 0.12376 + (((tickAnim - 170) / 14) * (0.12376-(0.12376)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -3.24649 + (((tickAnim - 184) / 26) * (0-(-3.24649)));
            yy = 3.24765 + (((tickAnim - 184) / 26) * (0-(3.24765)));
            zz = 0.12376 + (((tickAnim - 184) / 26) * (0-(0.12376)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 98) {
            xx = 20 + (((tickAnim - 55) / 43) * (14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+20))*5-(20)));
            yy = 0 + (((tickAnim - 55) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 43) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 138) {
            xx = 14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+20))*5 + (((tickAnim - 98) / 40) * (0-(14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+20))*5)));
            yy = 0 + (((tickAnim - 98) / 40) * (4.75-(0)));
            zz = 0 + (((tickAnim - 98) / 40) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 138) / 46) * (0-(0)));
            yy = 4.75 + (((tickAnim - 138) / 46) * (4.75-(4.75)));
            zz = 0 + (((tickAnim - 138) / 46) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            yy = 4.75 + (((tickAnim - 184) / 26) * (0-(4.75)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 98) {
            xx = 22.25 + (((tickAnim - 55) / 43) * (22.25-(22.25)));
            yy = 0 + (((tickAnim - 55) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 43) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 138) {
            xx = 22.25 + (((tickAnim - 98) / 40) * (0-(22.25)));
            yy = 0 + (((tickAnim - 98) / 40) * (7-(0)));
            zz = 0 + (((tickAnim - 98) / 40) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 138) / 46) * (0-(0)));
            yy = 7 + (((tickAnim - 138) / 46) * (7-(7)));
            zz = 0 + (((tickAnim - 138) / 46) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            yy = 7 + (((tickAnim - 184) / 26) * (0-(7)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 98) {
            xx = -8.5 + (((tickAnim - 55) / 43) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 55) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 43) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 138) {
            xx = -8.5 + (((tickAnim - 98) / 40) * (0.19969-(-8.5)));
            yy = 0 + (((tickAnim - 98) / 40) * (5.61664-(0)));
            zz = 0 + (((tickAnim - 98) / 40) * (1.97305-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 184) {
            xx = 0.19969 + (((tickAnim - 138) / 46) * (0.19969-(0.19969)));
            yy = 5.61664 + (((tickAnim - 138) / 46) * (5.61664-(5.61664)));
            zz = 1.97305 + (((tickAnim - 138) / 46) * (1.97305-(1.97305)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0.19969 + (((tickAnim - 184) / 26) * (0-(0.19969)));
            yy = 5.61664 + (((tickAnim - 184) / 26) * (0-(5.61664)));
            zz = 1.97305 + (((tickAnim - 184) / 26) * (0-(1.97305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.88-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 7.88 + (((tickAnim - 15) / 40) * (-5.675-(7.88)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -5.675 + (((tickAnim - 55) / 5) * (-5-(-5.675)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -5 + (((tickAnim - 60) / 5) * (-6.025-(-5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 69) {
            xx = -6.025 + (((tickAnim - 65) / 4) * (-5-(-6.025)));
            yy = 0 + (((tickAnim - 65) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 4) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = -5 + (((tickAnim - 69) / 4) * (-5.625-(-5)));
            yy = 0 + (((tickAnim - 69) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 4) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 98) {
            xx = -5.625 + (((tickAnim - 73) / 25) * (0-(-5.625)));
            yy = 0 + (((tickAnim - 73) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 25) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 98) / 5) * (4.35-(0)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 138) {
            xx = 4.35 + (((tickAnim - 103) / 35) * (0-(4.35)));
            yy = 0 + (((tickAnim - 103) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 35) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 138) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 13) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 151) / 3) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 151) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 3) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 158) {
            xx = -0.75 + (((tickAnim - 154) / 4) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 154) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 4) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 158) / 3) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 158) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 3) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 164) {
            xx = -0.75 + (((tickAnim - 161) / 3) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 161) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 3) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 164) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 164) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 20) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAcrocanthosaurus entity = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.8937+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.24982-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.06365-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0.8937+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4 + (((tickAnim - 20) / 15) * (-2.0045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-3-(0.8937+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4)));
            yy = -11.24982 + (((tickAnim - 20) / 15) * (-6.77353-(-11.24982)));
            zz = 0.06365 + (((tickAnim - 20) / 15) * (0.53086-(0.06365)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.0045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-3 + (((tickAnim - 35) / 15) * (-1.34876-(-2.0045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-3)));
            yy = -6.77353 + (((tickAnim - 35) / 15) * (-6.28397-(-6.77353)));
            zz = 0.53086 + (((tickAnim - 35) / 15) * (0.73331-(0.53086)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -1.34876 + (((tickAnim - 50) / 15) * (8.15124-(-1.34876)));
            yy = -6.28397 + (((tickAnim - 50) / 15) * (-6.28397-(-6.28397)));
            zz = 0.73331 + (((tickAnim - 50) / 15) * (0.73331-(0.73331)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 8.15124 + (((tickAnim - 65) / 36) * (0-(8.15124)));
            yy = -6.28397 + (((tickAnim - 65) / 36) * (0-(-6.28397)));
            zz = 0.73331 + (((tickAnim - 65) / 36) * (0-(0.73331)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-9.025-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0.55-(0)));
            zz = -9.025 + (((tickAnim - 20) / 8) * (-11.925-(-9.025)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.55 + (((tickAnim - 28) / 7) * (0.125-(0.55)));
            zz = -11.925 + (((tickAnim - 28) / 7) * (-14.83-(-11.925)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.125 + (((tickAnim - 35) / 15) * (0.125-(0.125)));
            zz = -14.83 + (((tickAnim - 35) / 15) * (-14.83-(-14.83)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0.125 + (((tickAnim - 50) / 10) * (0.13-(0.125)));
            zz = -14.83 + (((tickAnim - 50) / 10) * (-21.905-(-14.83)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0.13 + (((tickAnim - 60) / 5) * (0.13-(0.13)));
            zz = -21.905 + (((tickAnim - 60) / 5) * (-21.905-(-21.905)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 65) / 36) * (0-(0)));
            yy = 0.13 + (((tickAnim - 65) / 36) * (0-(0.13)));
            zz = -21.905 + (((tickAnim - 65) / 36) * (0-(-21.905)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 13 + (((tickAnim - 20) / 8) * (-15.08-(13)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -15.08 + (((tickAnim - 28) / 7) * (-25-(-15.08)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25 + (((tickAnim - 35) / 15) * (-23.25-(-25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -23.25 + (((tickAnim - 50) / 10) * (-9.25-(-23.25)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -9.25 + (((tickAnim - 60) / 20) * (-11.46-(-9.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = -11.46 + (((tickAnim - 80) / 11) * (0-(-11.46)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 20) / 8) * (20.41-(6)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 20.41 + (((tickAnim - 28) / 7) * (-0.75-(20.41)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 35) / 15) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -0.75 + (((tickAnim - 50) / 10) * (21-(-0.75)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 21 + (((tickAnim - 60) / 5) * (20.5-(21)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 20.5 + (((tickAnim - 65) / 15) * (0-(20.5)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 80) / 11) * (32.97-(0)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 32.97 + (((tickAnim - 91) / 10) * (0-(32.97)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.1 + (((tickAnim - 35) / 15) * (-1.1-(-1.1)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 50) / 51) * (0-(0)));
            yy = -1.1 + (((tickAnim - 50) / 51) * (0-(-1.1)));
            zz = 0 + (((tickAnim - 50) / 51) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 19.5 + (((tickAnim - 20) / 8) * (-40.75-(19.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -40.75 + (((tickAnim - 28) / 7) * (11.25-(-40.75)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 35) / 15) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 11.25 + (((tickAnim - 50) / 15) * (4.25-(11.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 4.25 + (((tickAnim - 65) / 15) * (0-(4.25)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 80) / 11) * (-25.06-(0)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = -25.06 + (((tickAnim - 91) / 10) * (0-(-25.06)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.95 + (((tickAnim - 35) / 15) * (-0.95-(-0.95)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = -0.95 + (((tickAnim - 50) / 15) * (-1.725-(-0.95)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = -1.725 + (((tickAnim - 65) / 15) * (0-(-1.725)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 28.75 + (((tickAnim - 20) / 8) * (73.18-(28.75)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 73.18 + (((tickAnim - 28) / 7) * (11.75-(73.18)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 35) / 15) * (18-(11.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 18 + (((tickAnim - 50) / 5) * (-7.25-(18)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -7.25 + (((tickAnim - 55) / 5) * (-9.5-(-7.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -9.5 + (((tickAnim - 60) / 5) * (-24.25-(-9.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -24.25 + (((tickAnim - 65) / 15) * (6.5-(-24.25)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 6.5 + (((tickAnim - 80) / 11) * (59.94-(6.5)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 95) {
            xx = 59.94 + (((tickAnim - 91) / 4) * (79.62-(59.94)));
            yy = 0 + (((tickAnim - 91) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 4) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = 79.62 + (((tickAnim - 95) / 6) * (0-(79.62)));
            yy = 0 + (((tickAnim - 95) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0.34-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (-1.625-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.34 + (((tickAnim - 28) / 7) * (-1.28-(0.34)));
            zz = -1.625 + (((tickAnim - 28) / 7) * (0.645-(-1.625)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.28 + (((tickAnim - 35) / 15) * (-1.55-(-1.28)));
            zz = 0.645 + (((tickAnim - 35) / 15) * (0-(0.645)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = -1.55 + (((tickAnim - 50) / 5) * (0-(-1.55)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 10) * (-1.075-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = -1.075 + (((tickAnim - 65) / 15) * (0-(-1.075)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 11) * (1.925-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (-1.475-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 91) / 4) * (0-(0)));
            yy = 1.925 + (((tickAnim - 91) / 4) * (-1.425-(1.925)));
            zz = -1.475 + (((tickAnim - 91) / 4) * (-0.95-(-1.475)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 95) / 6) * (0-(0)));
            yy = -1.425 + (((tickAnim - 95) / 6) * (0-(-1.425)));
            zz = -0.95 + (((tickAnim - 95) / 6) * (0-(-0.95)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-60-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -60 + (((tickAnim - 20) / 8) * (3-(-60)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 3 + (((tickAnim - 28) / 7) * (0-(3)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -10.5 + (((tickAnim - 60) / 5) * (2-(-10.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 2 + (((tickAnim - 65) / 15) * (0-(2)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (-22.43-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = -22.43 + (((tickAnim - 85) / 6) * (16.81-(-22.43)));
            yy = 0 + (((tickAnim - 85) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 6) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 95) {
            xx = 16.81 + (((tickAnim - 91) / 4) * (-84.47-(16.81)));
            yy = 0 + (((tickAnim - 91) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 4) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = -84.47 + (((tickAnim - 95) / 6) * (0-(-84.47)));
            yy = 0 + (((tickAnim - 95) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (8.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -17.75 + (((tickAnim - 20) / 15) * (-4-(-17.75)));
            yy = 8.75 + (((tickAnim - 20) / 15) * (8.75-(8.75)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 35) / 15) * (-2.75-(-4)));
            yy = 8.75 + (((tickAnim - 35) / 15) * (8.75-(8.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -2.75 + (((tickAnim - 50) / 10) * (-13.75-(-2.75)));
            yy = 8.75 + (((tickAnim - 50) / 10) * (8.75-(8.75)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -13.75 + (((tickAnim - 60) / 5) * (-16.75-(-13.75)));
            yy = 8.75 + (((tickAnim - 60) / 5) * (8.75-(8.75)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -16.75 + (((tickAnim - 65) / 15) * (14.26163-(-16.75)));
            yy = 8.75 + (((tickAnim - 65) / 15) * (5.08721-(8.75)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 14.26163 + (((tickAnim - 80) / 21) * (0-(14.26163)));
            yy = 5.08721 + (((tickAnim - 80) / 21) * (0-(5.08721)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.71-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 7.71 + (((tickAnim - 8) / 12) * (-2.5-(7.71)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 20) / 15) * (2-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 35) / 15) * (2-(2)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 2 + (((tickAnim - 50) / 10) * (-6.25-(2)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -6.25 + (((tickAnim - 60) / 5) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = -6.25 + (((tickAnim - 65) / 8) * (36.41-(-6.25)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 36.41 + (((tickAnim - 73) / 7) * (11.56-(36.41)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 11.56 + (((tickAnim - 80) / 21) * (0-(11.56)));
            yy = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -1.525 + (((tickAnim - 20) / 15) * (0-(-1.525)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 30) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            yy = -0.9 + (((tickAnim - 80) / 21) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (-55.33-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -55.33 + (((tickAnim - 8) / 12) * (19-(-55.33)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 19 + (((tickAnim - 20) / 30) * (19-(19)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 19 + (((tickAnim - 50) / 6) * (-44.98-(19)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -44.98 + (((tickAnim - 56) / 4) * (8.75-(-44.98)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 8.75 + (((tickAnim - 60) / 5) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 8.75 + (((tickAnim - 65) / 8) * (-25.83-(8.75)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 101) {
            xx = -25.83 + (((tickAnim - 73) / 28) * (0-(-25.83)));
            yy = 0 + (((tickAnim - 73) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -1.4 + (((tickAnim - 20) / 15) * (0-(-1.4)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = -0.85 + (((tickAnim - 60) / 5) * (-0.85-(-0.85)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 65) / 36) * (0-(0)));
            yy = -0.85 + (((tickAnim - 65) / 36) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 65) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (72.72816-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.09638-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.47462-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 72.72816 + (((tickAnim - 8) / 12) * (1.25-(72.72816)));
            yy = -1.09638 + (((tickAnim - 8) / 12) * (0-(-1.09638)));
            zz = 3.47462 + (((tickAnim - 8) / 12) * (0-(3.47462)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1.25 + (((tickAnim - 20) / 15) * (-17.25-(1.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -17.25 + (((tickAnim - 35) / 15) * (-15.5-(-17.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -15.5 + (((tickAnim - 50) / 6) * (81.67-(-15.5)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 81.67 + (((tickAnim - 56) / 4) * (7.5-(81.67)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 7.5 + (((tickAnim - 60) / 5) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 7.5 + (((tickAnim - 65) / 8) * (72.54-(7.5)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 72.54 + (((tickAnim - 73) / 7) * (77.83-(72.54)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 77.83 + (((tickAnim - 80) / 21) * (0-(77.83)));
            yy = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 8) * (-0.865-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 8) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 48) * (0-(0)));
            zz = -0.865 + (((tickAnim - 8) / 48) * (-1.275-(-0.865)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 17) * (2.1-(0)));
            zz = -1.275 + (((tickAnim - 56) / 17) * (-0.8-(-1.275)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = 2.1 + (((tickAnim - 73) / 7) * (-2.05-(2.1)));
            zz = -0.8 + (((tickAnim - 73) / 7) * (-0.85-(-0.8)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            yy = -2.05 + (((tickAnim - 80) / 21) * (0-(-2.05)));
            zz = -0.85 + (((tickAnim - 80) / 21) * (0-(-0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 65) / 2) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 65) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 2) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -14.5 + (((tickAnim - 67) / 6) * (23.63-(-14.5)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 23.63 + (((tickAnim - 73) / 7) * (-91-(23.63)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = -91 + (((tickAnim - 80) / 21) * (0-(-91)));
            yy = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.28939-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.91527-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.91772-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.28939 + (((tickAnim - 20) / 10) * (-3.25039-(-3.28939)));
            yy = -4.91527 + (((tickAnim - 20) / 10) * (0.49155-(-4.91527)));
            zz = 0.91772 + (((tickAnim - 20) / 10) * (-0.09155-(0.91772)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3.25039 + (((tickAnim - 30) / 20) * (-3.31165-(-3.25039)));
            yy = 0.49155 + (((tickAnim - 30) / 20) * (6.14394-(0.49155)));
            zz = -0.09155 + (((tickAnim - 30) / 20) * (-1.14874-(-0.09155)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -3.31165 + (((tickAnim - 50) / 15) * (2.40064-(-3.31165)));
            yy = 6.14394 + (((tickAnim - 50) / 15) * (9.38216-(6.14394)));
            zz = -1.14874 + (((tickAnim - 50) / 15) * (-1.42776-(-1.14874)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 2.40064 + (((tickAnim - 65) / 36) * (0-(2.40064)));
            yy = 9.38216 + (((tickAnim - 65) / 36) * (0-(9.38216)));
            zz = -1.42776 + (((tickAnim - 65) / 36) * (0-(-1.42776)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.98229-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.73918-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.35321-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.98229 + (((tickAnim - 20) / 10) * (-4.87223-(-4.98229)));
            yy = -5.73918 + (((tickAnim - 20) / 10) * (-15.2207-(-5.73918)));
            zz = -0.35321 + (((tickAnim - 20) / 10) * (-0.95625-(-0.35321)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.87223 + (((tickAnim - 30) / 20) * (-4.99787-(-4.87223)));
            yy = -15.2207 + (((tickAnim - 30) / 20) * (-1.99625-(-15.2207)));
            zz = -0.95625 + (((tickAnim - 30) / 20) * (-0.1225-(-0.95625)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -4.99787 + (((tickAnim - 50) / 15) * (-7.99817-(-4.99787)));
            yy = -1.99625 + (((tickAnim - 50) / 15) * (0.25366-(-1.99625)));
            zz = -0.1225 + (((tickAnim - 50) / 15) * (-0.10239-(-0.1225)));
        }
        else if (tickAnim >= 65 && tickAnim < 100) {
            xx = -7.99817 + (((tickAnim - 65) / 35) * (0-(-7.99817)));
            yy = 0.25366 + (((tickAnim - 65) / 35) * (0-(0.25366)));
            zz = -0.10239 + (((tickAnim - 65) / 35) * (0-(-0.10239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6 + (((tickAnim - 20) / 10) * (-14-(-6)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -14 + (((tickAnim - 30) / 5) * (-7-(-14)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7 + (((tickAnim - 35) / 15) * (3.5-(-7)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (-2.13854-(0)));
            yy = 3.5 + (((tickAnim - 50) / 15) * (9.37345-(3.5)));
            zz = 0 + (((tickAnim - 50) / 15) * (-1.23414-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -2.13854 + (((tickAnim - 65) / 13) * (-1.37624-(-2.13854)));
            yy = 9.37345 + (((tickAnim - 65) / 13) * (8.01068-(9.37345)));
            zz = -1.23414 + (((tickAnim - 65) / 13) * (-1.19953-(-1.23414)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -1.37624 + (((tickAnim - 78) / 22) * (0-(-1.37624)));
            yy = 8.01068 + (((tickAnim - 78) / 22) * (0-(8.01068)));
            zz = -1.19953 + (((tickAnim - 78) / 22) * (0-(-1.19953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (8.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 8.75 + (((tickAnim - 10) / 10) * (1-(8.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 20) / 10) * (-16-(1)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -16 + (((tickAnim - 30) / 5) * (-9-(-16)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -9 + (((tickAnim - 35) / 15) * (-2-(-9)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (-3.005-(0)));
            yy = -2 + (((tickAnim - 50) / 15) * (2.6735-(-2)));
            zz = 0 + (((tickAnim - 50) / 15) * (-0.84929-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -3.005 + (((tickAnim - 65) / 13) * (-2.12877-(-3.005)));
            yy = 2.6735 + (((tickAnim - 65) / 13) * (13.74543-(2.6735)));
            zz = -0.84929 + (((tickAnim - 65) / 13) * (-2.51854-(-0.84929)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -2.12877 + (((tickAnim - 78) / 22) * (0-(-2.12877)));
            yy = 13.74543 + (((tickAnim - 78) / 22) * (0-(13.74543)));
            zz = -2.51854 + (((tickAnim - 78) / 22) * (0-(-2.51854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (9.38-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 9.38 + (((tickAnim - 10) / 10) * (6.25-(9.38)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 6.25 + (((tickAnim - 20) / 10) * (-12.5-(6.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -12.5 + (((tickAnim - 30) / 5) * (-9.5-(-12.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -9.5 + (((tickAnim - 35) / 15) * (-4-(-9.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (-6.59919-(0)));
            yy = -4 + (((tickAnim - 50) / 15) * (-7.6213-(-4)));
            zz = 0 + (((tickAnim - 50) / 15) * (0.97921-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -6.59919 + (((tickAnim - 65) / 13) * (-4.27615-(-6.59919)));
            yy = -7.6213 + (((tickAnim - 65) / 13) * (10.89608-(-7.6213)));
            zz = 0.97921 + (((tickAnim - 65) / 13) * (-2.90306-(0.97921)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -4.27615 + (((tickAnim - 78) / 22) * (0-(-4.27615)));
            yy = 10.89608 + (((tickAnim - 78) / 22) * (0-(10.89608)));
            zz = -2.90306 + (((tickAnim - 78) / 22) * (0-(-2.90306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.43769-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (12.93593-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.28681-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.43769 + (((tickAnim - 10) / 10) * (-0.63734-(-0.43769)));
            yy = 12.93593 + (((tickAnim - 10) / 10) * (8.94258-(12.93593)));
            zz = 0.28681 + (((tickAnim - 10) / 10) * (2.14231-(0.28681)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.63734 + (((tickAnim - 20) / 10) * (-0.65386-(-0.63734)));
            yy = 8.94258 + (((tickAnim - 20) / 10) * (-9.97136-(8.94258)));
            zz = 2.14231 + (((tickAnim - 20) / 10) * (3.95704-(2.14231)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.65386 + (((tickAnim - 30) / 5) * (-0.75463-(-0.65386)));
            yy = -9.97136 + (((tickAnim - 30) / 5) * (-14.699-(-9.97136)));
            zz = 3.95704 + (((tickAnim - 30) / 5) * (4.42835-(3.95704)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.75463 + (((tickAnim - 35) / 15) * (-0.59543-(-0.75463)));
            yy = -14.699 + (((tickAnim - 35) / 15) * (-5.49194-(-14.699)));
            zz = 4.42835 + (((tickAnim - 35) / 15) * (3.5231-(4.42835)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -0.59543 + (((tickAnim - 50) / 15) * (-0.50316-(-0.59543)));
            yy = -5.49194 + (((tickAnim - 50) / 15) * (-4.70548-(-5.49194)));
            zz = 3.5231 + (((tickAnim - 50) / 15) * (2.57001-(3.5231)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -0.50316 + (((tickAnim - 65) / 13) * (-0.42956-(-0.50316)));
            yy = -4.70548 + (((tickAnim - 65) / 13) * (14.80015-(-4.70548)));
            zz = 2.57001 + (((tickAnim - 65) / 13) * (-0.04122-(2.57001)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -0.42956 + (((tickAnim - 78) / 22) * (0-(-0.42956)));
            yy = 14.80015 + (((tickAnim - 78) / 22) * (0-(14.80015)));
            zz = -0.04122 + (((tickAnim - 78) / 22) * (0-(-0.04122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (19.63-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 19.63 + (((tickAnim - 10) / 10) * (11.25-(19.63)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 11.25 + (((tickAnim - 20) / 10) * (-19-(11.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -19 + (((tickAnim - 30) / 5) * (-23.25-(-19)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -23.25 + (((tickAnim - 35) / 15) * (-11.5-(-23.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = -11.5 + (((tickAnim - 50) / 15) * (-13.84-(-11.5)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 65) / 13) * (0-(0)));
            yy = -13.84 + (((tickAnim - 65) / 13) * (14.77-(-13.84)));
            zz = 0 + (((tickAnim - 65) / 13) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 78) / 22) * (0-(0)));
            yy = 14.77 + (((tickAnim - 78) / 22) * (0-(14.77)));
            zz = 0 + (((tickAnim - 78) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 4.5 + (((tickAnim - 20) / 8) * (5.5-(4.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (3.75-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 5.5 + (((tickAnim - 28) / 7) * (0-(5.5)));
            yy = 3.75 + (((tickAnim - 28) / 7) * (6.75-(3.75)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 6.75 + (((tickAnim - 35) / 8) * (9.5-(6.75)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 9.5 + (((tickAnim - 43) / 7) * (10.75-(9.5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 50) / 6) * (2-(0)));
            yy = 10.75 + (((tickAnim - 50) / 6) * (10.75-(10.75)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 2 + (((tickAnim - 56) / 9) * (-0.5-(2)));
            yy = 10.75 + (((tickAnim - 56) / 9) * (10.75-(10.75)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = -0.5 + (((tickAnim - 65) / 36) * (0-(-0.5)));
            yy = 10.75 + (((tickAnim - 65) / 36) * (0-(10.75)));
            zz = 0 + (((tickAnim - 65) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 7.25 + (((tickAnim - 20) / 8) * (6.33333-(7.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (5.41667-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 6.33333 + (((tickAnim - 28) / 7) * (2.25-(6.33333)));
            yy = 5.41667 + (((tickAnim - 28) / 7) * (9.75-(5.41667)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 2.25 + (((tickAnim - 35) / 8) * (3.95476-(2.25)));
            yy = 9.75 + (((tickAnim - 35) / 8) * (8.81717-(9.75)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.31018-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.95476 + (((tickAnim - 43) / 7) * (3.96121-(3.95476)));
            yy = 8.81717 + (((tickAnim - 43) / 7) * (8.46562-(8.81717)));
            zz = -0.31018 + (((tickAnim - 43) / 7) * (-0.28175-(-0.31018)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 3.96121 + (((tickAnim - 50) / 6) * (7.21121-(3.96121)));
            yy = 8.46562 + (((tickAnim - 50) / 6) * (8.46562-(8.46562)));
            zz = -0.28175 + (((tickAnim - 50) / 6) * (-0.28175-(-0.28175)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 7.21121 + (((tickAnim - 56) / 9) * (3.96121-(7.21121)));
            yy = 8.46562 + (((tickAnim - 56) / 9) * (8.46562-(8.46562)));
            zz = -0.28175 + (((tickAnim - 56) / 9) * (-0.28175-(-0.28175)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 3.96121 + (((tickAnim - 65) / 36) * (0-(3.96121)));
            yy = 8.46562 + (((tickAnim - 65) / 36) * (0-(8.46562)));
            zz = -0.28175 + (((tickAnim - 65) / 36) * (0-(-0.28175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.8713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.99857-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.10698-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 21.8713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 20) / 8) * (11.7321+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4-(21.8713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            yy = -3.99857 + (((tickAnim - 20) / 8) * (0.41078-(-3.99857)));
            zz = 0.10698 + (((tickAnim - 20) / 8) * (0.6648-(0.10698)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 11.7321+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4 + (((tickAnim - 28) / 7) * (4.37074-(11.7321+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4)));
            yy = 0.41078 + (((tickAnim - 28) / 7) * (3.93827-(0.41078)));
            zz = 0.6648 + (((tickAnim - 28) / 7) * (1.11105-(0.6648)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 4.37074 + (((tickAnim - 35) / 8) * (-0.13167-(4.37074)));
            yy = 3.93827 + (((tickAnim - 35) / 8) * (5.16686-(3.93827)));
            zz = 1.11105 + (((tickAnim - 35) / 8) * (-0.6242-(1.11105)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.13167 + (((tickAnim - 43) / 7) * (-1.31673-(-0.13167)));
            yy = 5.16686 + (((tickAnim - 43) / 7) * (2.08256-(5.16686)));
            zz = -0.6242 + (((tickAnim - 43) / 7) * (0.40247-(-0.6242)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -1.31673 + (((tickAnim - 50) / 6) * (5.68327-(-1.31673)));
            yy = 2.08256 + (((tickAnim - 50) / 6) * (2.08256-(2.08256)));
            zz = 0.40247 + (((tickAnim - 50) / 6) * (0.40247-(0.40247)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 5.68327 + (((tickAnim - 56) / 9) * (0.93327-(5.68327)));
            yy = 2.08256 + (((tickAnim - 56) / 9) * (2.08256-(2.08256)));
            zz = 0.40247 + (((tickAnim - 56) / 9) * (0.40247-(0.40247)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 0.93327 + (((tickAnim - 65) / 36) * (0-(0.93327)));
            yy = 2.08256 + (((tickAnim - 65) / 36) * (0-(2.08256)));
            zz = 0.40247 + (((tickAnim - 65) / 36) * (0-(0.40247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.7338-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.24696-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.22471-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 5.7338 + (((tickAnim - 20) / 8) * (2.41884-(5.7338)));
            yy = -8.24696 + (((tickAnim - 20) / 8) * (6.47903-(-8.24696)));
            zz = 0.22471 + (((tickAnim - 20) / 8) * (0.40887-(0.22471)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 2.41884 + (((tickAnim - 28) / 3) * (-0.62964-(2.41884)));
            yy = 6.47903 + (((tickAnim - 28) / 3) * (4.39154-(6.47903)));
            zz = 0.40887 + (((tickAnim - 28) / 3) * (0.45197-(0.40887)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -0.62964 + (((tickAnim - 31) / 4) * (-5.13604-(-0.62964)));
            yy = 4.39154 + (((tickAnim - 31) / 4) * (0.74799-(4.39154)));
            zz = 0.45197 + (((tickAnim - 31) / 4) * (0.52719-(0.45197)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -5.13604 + (((tickAnim - 35) / 8) * (-7.80151-(-5.13604)));
            yy = 0.74799 + (((tickAnim - 35) / 8) * (-2.66773-(0.74799)));
            zz = 0.52719 + (((tickAnim - 35) / 8) * (-0.08396-(0.52719)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -7.80151 + (((tickAnim - 43) / 7) * (-9.80151-(-7.80151)));
            yy = -2.66773 + (((tickAnim - 43) / 7) * (-2.66773-(-2.66773)));
            zz = -0.08396 + (((tickAnim - 43) / 7) * (-0.08396-(-0.08396)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -9.80151 + (((tickAnim - 50) / 6) * (-1.55151-(-9.80151)));
            yy = -2.66773 + (((tickAnim - 50) / 6) * (-2.66773-(-2.66773)));
            zz = -0.08396 + (((tickAnim - 50) / 6) * (-0.08396-(-0.08396)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = -1.55151 + (((tickAnim - 56) / 9) * (-6.55151-(-1.55151)));
            yy = -2.66773 + (((tickAnim - 56) / 9) * (-2.66773-(-2.66773)));
            zz = -0.08396 + (((tickAnim - 56) / 9) * (-0.08396-(-0.08396)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = -6.55151 + (((tickAnim - 65) / 36) * (0-(-6.55151)));
            yy = -2.66773 + (((tickAnim - 65) / 36) * (0-(-2.66773)));
            zz = -0.08396 + (((tickAnim - 65) / 36) * (0-(-0.08396)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.42942-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.58719-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (5.90197-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0.42942 + (((tickAnim - 20) / 8) * (-12.31121-(0.42942)));
            yy = 3.58719 + (((tickAnim - 20) / 8) * (4.34815-(3.58719)));
            zz = 5.90197 + (((tickAnim - 20) / 8) * (3.54158-(5.90197)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -12.31121 + (((tickAnim - 28) / 3) * (-13.55881-(-12.31121)));
            yy = 4.34815 + (((tickAnim - 28) / 3) * (1.76205-(4.34815)));
            zz = 3.54158 + (((tickAnim - 28) / 3) * (2.24179-(3.54158)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -13.55881 + (((tickAnim - 31) / 4) * (-5.49341-(-13.55881)));
            yy = 1.76205 + (((tickAnim - 31) / 4) * (-3.13675-(1.76205)));
            zz = 2.24179 + (((tickAnim - 31) / 4) * (-0.22036-(2.24179)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -5.49341 + (((tickAnim - 35) / 8) * (0.1067-(-5.49341)));
            yy = -3.13675 + (((tickAnim - 35) / 8) * (-7.9491-(-3.13675)));
            zz = -0.22036 + (((tickAnim - 35) / 8) * (-1.35465-(-0.22036)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0.1067 + (((tickAnim - 43) / 7) * (3.1067-(0.1067)));
            yy = -7.9491 + (((tickAnim - 43) / 7) * (-7.9491-(-7.9491)));
            zz = -1.35465 + (((tickAnim - 43) / 7) * (-1.35465-(-1.35465)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 3.1067 + (((tickAnim - 50) / 6) * (1.1067-(3.1067)));
            yy = -7.9491 + (((tickAnim - 50) / 6) * (-7.9491-(-7.9491)));
            zz = -1.35465 + (((tickAnim - 50) / 6) * (-1.35465-(-1.35465)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 1.1067 + (((tickAnim - 56) / 9) * (-4.1433-(1.1067)));
            yy = -7.9491 + (((tickAnim - 56) / 9) * (-7.9491-(-7.9491)));
            zz = -1.35465 + (((tickAnim - 56) / 9) * (-1.35465-(-1.35465)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = -4.1433 + (((tickAnim - 65) / 36) * (0-(-4.1433)));
            yy = -7.9491 + (((tickAnim - 65) / 36) * (0-(-7.9491)));
            zz = -1.35465 + (((tickAnim - 65) / 36) * (0-(-1.35465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.52684-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (4.16926-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.20609-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -7.52684 + (((tickAnim - 20) / 8) * (-11.9351-(-7.52684)));
            yy = 4.16926 + (((tickAnim - 20) / 8) * (-3.99129-(4.16926)));
            zz = -0.20609 + (((tickAnim - 20) / 8) * (-3.05191-(-0.20609)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -11.9351 + (((tickAnim - 28) / 3) * (-3.24474-(-11.9351)));
            yy = -3.99129 + (((tickAnim - 28) / 3) * (-3.70514-(-3.99129)));
            zz = -3.05191 + (((tickAnim - 28) / 3) * (-1.75791-(-3.05191)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -3.24474 + (((tickAnim - 31) / 4) * (1.37662-(-3.24474)));
            yy = -3.70514 + (((tickAnim - 31) / 4) * (-3.16311-(-3.70514)));
            zz = -1.75791 + (((tickAnim - 31) / 4) * (0.69326-(-1.75791)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 1.37662 + (((tickAnim - 35) / 8) * (3.91693-(1.37662)));
            yy = -3.16311 + (((tickAnim - 35) / 8) * (0.62242-(-3.16311)));
            zz = 0.69326 + (((tickAnim - 35) / 8) * (0.87674-(0.69326)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.91693 + (((tickAnim - 43) / 7) * (3.91693-(3.91693)));
            yy = 0.62242 + (((tickAnim - 43) / 7) * (0.62242-(0.62242)));
            zz = 0.87674 + (((tickAnim - 43) / 7) * (0.87674-(0.87674)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 3.91693 + (((tickAnim - 50) / 6) * (-10.58307-(3.91693)));
            yy = 0.62242 + (((tickAnim - 50) / 6) * (0.62242-(0.62242)));
            zz = 0.87674 + (((tickAnim - 50) / 6) * (0.87674-(0.87674)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = -10.58307 + (((tickAnim - 56) / 9) * (-7.08307-(-10.58307)));
            yy = 0.62242 + (((tickAnim - 56) / 9) * (0.62242-(0.62242)));
            zz = 0.87674 + (((tickAnim - 56) / 9) * (0.87674-(0.87674)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = -7.08307 + (((tickAnim - 65) / 36) * (0-(-7.08307)));
            yy = 0.62242 + (((tickAnim - 65) / 36) * (0-(0.62242)));
            zz = 0.87674 + (((tickAnim - 65) / 36) * (0-(0.87674)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 15.75 + (((tickAnim - 20) / 4) * (0-(15.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (8.5-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 35) / 15) * (17.75-(8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 17.75 + (((tickAnim - 50) / 6) * (0-(17.75)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 56) / 9) * (15.75-(0)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 15.75 + (((tickAnim - 65) / 36) * (0-(15.75)));
            yy = 0 + (((tickAnim - 65) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (18-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 18 + (((tickAnim - 28) / 7) * (-0.96322-(18)));
            yy = 0 + (((tickAnim - 28) / 7) * (5.96326-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-6.82774-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.96322 + (((tickAnim - 35) / 15) * (-24.81693-(-0.96322)));
            yy = 5.96326 + (((tickAnim - 35) / 15) * (3.57209-(5.96326)));
            zz = -6.82774 + (((tickAnim - 35) / 15) * (-10.72658-(-6.82774)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -24.81693 + (((tickAnim - 50) / 6) * (6.94472-(-24.81693)));
            yy = 3.57209 + (((tickAnim - 50) / 6) * (4.55855-(3.57209)));
            zz = -10.72658 + (((tickAnim - 50) / 6) * (-10.56217-(-10.72658)));
        }
        else if (tickAnim >= 56 && tickAnim < 101) {
            xx = 6.94472 + (((tickAnim - 56) / 45) * (0-(6.94472)));
            yy = 4.55855 + (((tickAnim - 56) / 45) * (0-(4.55855)));
            zz = -10.56217 + (((tickAnim - 56) / 45) * (0-(-10.56217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAcrocanthosaurus entity = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-1.3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2));

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 0) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 12) * (-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5 + (((tickAnim - 0) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 12) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = -0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 12) / 7) * (0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5-(-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5 + (((tickAnim - 12) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 19) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = 0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5 + (((tickAnim - 19) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5 + (((tickAnim - 19) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 6.9342 + (((tickAnim - 0) / 8) * (-6.65077-(6.9342)));
            yy = -1.34797 + (((tickAnim - 0) / 8) * (-7.81869-(-1.34797)));
            zz = 6.88836 + (((tickAnim - 0) / 8) * (0.36625-(6.88836)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -6.65077 + (((tickAnim - 8) / 5) * (-17.49102-(-6.65077)));
            yy = -7.81869 + (((tickAnim - 8) / 5) * (-0.5629+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-8-(-7.81869)));
            zz = 0.36625 + (((tickAnim - 8) / 5) * (7.2351+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-7-(0.36625)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -17.49102 + (((tickAnim - 13) / 5) * (-21.21796-(-17.49102)));
            yy = -0.5629+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-8 + (((tickAnim - 13) / 5) * (-1.3768-(-0.5629+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-8)));
            zz = 7.2351+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-7 + (((tickAnim - 13) / 5) * (2.6656-(7.2351+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-7)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -21.21796 + (((tickAnim - 18) / 22) * (6.9342-(-21.21796)));
            yy = -1.3768 + (((tickAnim - 18) / 22) * (-1.34797-(-1.3768)));
            zz = 2.6656 + (((tickAnim - 18) / 22) * (6.88836-(2.6656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12 + (((tickAnim - 23) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.44397 + (((tickAnim - 0) / 6) * (13.2251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*25-(12.44397)));
            yy = -0.25355 + (((tickAnim - 0) / 6) * (0.30741-(-0.25355)));
            zz = -1.09407 + (((tickAnim - 0) / 6) * (0.99995-(-1.09407)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 13.2251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*25 + (((tickAnim - 6) / 7) * (11.1202+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+60))*3-(13.2251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*25)));
            yy = 0.30741 + (((tickAnim - 6) / 7) * (5.4583-(0.30741)));
            zz = 0.99995 + (((tickAnim - 6) / 7) * (-1.5171-(0.99995)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.1202+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+60))*3 + (((tickAnim - 13) / 5) * (-12.8553+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9-(11.1202+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+60))*3)));
            yy = 5.4583 + (((tickAnim - 13) / 5) * (1.58962-(5.4583)));
            zz = -1.5171 + (((tickAnim - 13) / 5) * (5.7863-(-1.5171)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -12.8553+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9 + (((tickAnim - 18) / 22) * (12.44397-(-12.8553+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9)));
            yy = 1.58962 + (((tickAnim - 18) / 22) * (-0.25355-(1.58962)));
            zz = 5.7863 + (((tickAnim - 18) / 22) * (-1.09407-(5.7863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.8 + (((tickAnim - 0) / 6) * (2.34-(-0.8)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            yy = 2.34 + (((tickAnim - 6) / 12) * (-1.45-(2.34)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -1.45 + (((tickAnim - 18) / 22) * (-0.8-(-1.45)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
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
            xx = 17.75 + (((tickAnim - 0) / 3) * (19.7691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30-(17.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.29716-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.03833-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 19.7691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30 + (((tickAnim - 3) / 5) * (38.6025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-90-(19.7691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30)));
            yy = 0.29716 + (((tickAnim - 3) / 5) * (1.56993-(0.29716)));
            zz = -0.03833 + (((tickAnim - 3) / 5) * (3.34425-(-0.03833)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 38.6025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-90 + (((tickAnim - 8) / 5) * (-8.1562+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50-(38.6025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-90)));
            yy = 1.56993 + (((tickAnim - 8) / 5) * (-0.05099-(1.56993)));
            zz = 3.34425 + (((tickAnim - 8) / 5) * (2.68452-(3.34425)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.1562+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50 + (((tickAnim - 13) / 5) * (20.99656-(-8.1562+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50)));
            yy = -0.05099 + (((tickAnim - 13) / 5) * (2.27825-(-0.05099)));
            zz = 2.68452 + (((tickAnim - 13) / 5) * (-0.2939-(2.68452)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 20.99656 + (((tickAnim - 18) / 22) * (17.75-(20.99656)));
            yy = 2.27825 + (((tickAnim - 18) / 22) * (0-(2.27825)));
            zz = -0.2939 + (((tickAnim - 18) / 22) * (0-(-0.2939)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 8) * (1.05-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 1.05 + (((tickAnim - 8) / 10) * (-1.4-(1.05)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -1.4 + (((tickAnim - 18) / 22) * (-0.325-(-1.4)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
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
            xx = 36.82442 + (((tickAnim - 0) / 3) * (44.10064-(36.82442)));
            yy = -7.54906 + (((tickAnim - 0) / 3) * (-6.78643-(-7.54906)));
            zz = -4.91443 + (((tickAnim - 0) / 3) * (-5.49961-(-4.91443)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 44.10064 + (((tickAnim - 3) / 5) * (71-(44.10064)));
            yy = -6.78643 + (((tickAnim - 3) / 5) * (0-(-6.78643)));
            zz = -5.49961 + (((tickAnim - 3) / 5) * (0-(-5.49961)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 71 + (((tickAnim - 8) / 5) * (74.5-(71)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 74.5 + (((tickAnim - 13) / 5) * (8.19212-(74.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (-1.70221-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-9.4008-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 8.19212 + (((tickAnim - 18) / 10) * (-3.33967-(8.19212)));
            yy = -1.70221 + (((tickAnim - 18) / 10) * (-4.27483-(-1.70221)));
            zz = -9.4008 + (((tickAnim - 18) / 10) * (-7.4268-(-9.4008)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -3.33967 + (((tickAnim - 28) / 6) * (-2.50762-(-3.33967)));
            yy = -4.27483 + (((tickAnim - 28) / 6) * (-5.91194-(-4.27483)));
            zz = -7.4268 + (((tickAnim - 28) / 6) * (-6.17061-(-7.4268)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -2.50762 + (((tickAnim - 34) / 6) * (36.82442-(-2.50762)));
            yy = -5.91194 + (((tickAnim - 34) / 6) * (-7.54906-(-5.91194)));
            zz = -6.17061 + (((tickAnim - 34) / 6) * (-4.91443-(-6.17061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.875-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-1.375-(0)));
            zz = -0.875 + (((tickAnim - 8) / 5) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -1.375 + (((tickAnim - 13) / 5) * (-0.425-(-1.375)));
            zz = -0.875 + (((tickAnim - 13) / 5) * (0-(-0.875)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -0.425 + (((tickAnim - 18) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1-(-0.425)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1 + (((tickAnim - 22) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0.9-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 28) / 6) * (1.235-(0.9)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 1.235 + (((tickAnim - 34) / 6) * (0-(1.235)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
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
            xx = -74 + (((tickAnim - 0) / 3) * (-44.08-(-74)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -44.08 + (((tickAnim - 3) / 5) * (30-(-44.08)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 8) / 5) * (20.2-(30)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.2 + (((tickAnim - 13) / 5) * (0-(20.2)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (-17-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -17 + (((tickAnim - 34) / 6) * (-74-(-17)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -21.23888 + (((tickAnim - 0) / 19) * (6.74273-(-21.23888)));
            yy = -0.54393 + (((tickAnim - 0) / 19) * (4.3603-(-0.54393)));
            zz = -1.41796 + (((tickAnim - 0) / 19) * (-9.4502-(-1.41796)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 6.74273 + (((tickAnim - 19) / 8) * (-7.14076-(6.74273)));
            yy = 4.3603 + (((tickAnim - 19) / 8) * (10.05113-(4.3603)));
            zz = -9.4502 + (((tickAnim - 19) / 8) * (0.04455-(-9.4502)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -7.14076 + (((tickAnim - 27) / 8) * (-17.49102-(-7.14076)));
            yy = 10.05113 + (((tickAnim - 27) / 8) * (15.7129+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10-(10.05113)));
            zz = 0.04455 + (((tickAnim - 27) / 8) * (1.0649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7-(0.04455)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -17.49102 + (((tickAnim - 35) / 5) * (-21.23888-(-17.49102)));
            yy = 15.7129+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10 + (((tickAnim - 35) / 5) * (-0.54393-(15.7129+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10)));
            zz = 1.0649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7 + (((tickAnim - 35) / 5) * (-1.41796-(1.0649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12 + (((tickAnim - 4) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 8) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 32) * (0-(0)));
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
            xx = -12.08034 + (((tickAnim - 0) / 8) * (1.70627-(-12.08034)));
            yy = 1.58962 + (((tickAnim - 0) / 8) * (0.50852-(1.58962)));
            zz = -5.78634 + (((tickAnim - 0) / 8) * (-1.64919-(-5.78634)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 1.70627 + (((tickAnim - 8) / 10) * (8.59397-(1.70627)));
            yy = 0.50852 + (((tickAnim - 8) / 10) * (0.2536-(0.50852)));
            zz = -1.64919 + (((tickAnim - 8) / 10) * (1.0941-(-1.64919)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 8.59397 + (((tickAnim - 18) / 7) * (21.7251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35-(8.59397)));
            yy = 0.2536 + (((tickAnim - 18) / 7) * (0.30741-(0.2536)));
            zz = 1.0941 + (((tickAnim - 18) / 7) * (0.99995-(1.0941)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 21.7251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35 + (((tickAnim - 25) / 10) * (21.3947+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9-(21.7251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35)));
            yy = 0.30741 + (((tickAnim - 25) / 10) * (1.58962-(0.30741)));
            zz = 0.99995 + (((tickAnim - 25) / 10) * (-5.7863-(0.99995)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 21.3947+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9 + (((tickAnim - 35) / 5) * (-12.08034-(21.3947+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9)));
            yy = 1.58962 + (((tickAnim - 35) / 5) * (1.58962-(1.58962)));
            zz = -5.7863 + (((tickAnim - 35) / 5) * (-5.78634-(-5.7863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -2.3 + (((tickAnim - 0) / 19) * (-0.8-(-2.3)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.8 + (((tickAnim - 19) / 6) * (2.21-(-0.8)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 2.21 + (((tickAnim - 25) / 10) * (0.375-(2.21)));
            zz = 0 + (((tickAnim - 25) / 10) * (-0.275-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 35) / 5) * (-2.3-(0.375)));
            zz = -0.275 + (((tickAnim - 35) / 5) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 16.74656 + (((tickAnim - 0) / 19) * (17.75-(16.74656)));
            yy = 2.27825 + (((tickAnim - 0) / 19) * (0-(2.27825)));
            zz = 0.29394 + (((tickAnim - 0) / 19) * (0-(0.29394)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 17.75 + (((tickAnim - 19) / 6) * (2.7941+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*30-(17.75)));
            yy = 0 + (((tickAnim - 19) / 6) * (0.29716-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (-0.03833-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 2.7941+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*30 + (((tickAnim - 25) / 4) * (3.0209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*90-(2.7941+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*30)));
            yy = 0.29716 + (((tickAnim - 25) / 4) * (-2.73565-(0.29716)));
            zz = -0.03833 + (((tickAnim - 25) / 4) * (1.59115-(-0.03833)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 3.0209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*90 + (((tickAnim - 29) / 6) * (-1.9062+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50-(3.0209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*90)));
            yy = -2.73565 + (((tickAnim - 29) / 6) * (0.051-(-2.73565)));
            zz = 1.59115 + (((tickAnim - 29) / 6) * (-2.6845-(1.59115)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -1.9062+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50 + (((tickAnim - 35) / 5) * (16.74656-(-1.9062+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50)));
            yy = 0.051 + (((tickAnim - 35) / 5) * (2.27825-(0.051)));
            zz = -2.6845 + (((tickAnim - 35) / 5) * (0.29394-(-2.6845)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -1.4 + (((tickAnim - 0) / 19) * (-0.325-(-1.4)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 19) / 10) * (1.05-(-0.325)));
            zz = 0 + (((tickAnim - 19) / 10) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            yy = 1.05 + (((tickAnim - 29) / 11) * (-1.4-(1.05)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18.08157 + (((tickAnim - 0) / 8) * (-11.50088-(18.08157)));
            yy = -2.8995 + (((tickAnim - 0) / 8) * (-0.0574-(-2.8995)));
            zz = 6.6478 + (((tickAnim - 0) / 8) * (5.99906-(6.6478)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -11.50088 + (((tickAnim - 8) / 11) * (36.82442-(-11.50088)));
            yy = -0.0574 + (((tickAnim - 8) / 11) * (7.5491-(-0.0574)));
            zz = 5.99906 + (((tickAnim - 8) / 11) * (4.9144-(5.99906)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 36.82442 + (((tickAnim - 19) / 6) * (58.10064-(36.82442)));
            yy = 7.5491 + (((tickAnim - 19) / 6) * (6.7864-(7.5491)));
            zz = 4.9144 + (((tickAnim - 19) / 6) * (5.4996-(4.9144)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 58.10064 + (((tickAnim - 25) / 3) * (71-(58.10064)));
            yy = 6.7864 + (((tickAnim - 25) / 3) * (0-(6.7864)));
            zz = 5.4996 + (((tickAnim - 25) / 3) * (0-(5.4996)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 71 + (((tickAnim - 28) / 7) * (73-(71)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 73 + (((tickAnim - 35) / 5) * (18.08157-(73)));
            yy = 0 + (((tickAnim - 35) / 5) * (-2.8995-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (6.6478-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.95 + (((tickAnim - 0) / 3) * (0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1-(-0.95)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1 + (((tickAnim - 3) / 3) * (1-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 6) / 2) * (1.075-(1)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.075 + (((tickAnim - 8) / 7) * (1.59-(1.075)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 1.59 + (((tickAnim - 15) / 4) * (0-(1.59)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (1.55-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (-0.875-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 1.55 + (((tickAnim - 28) / 7) * (-1.125-(1.55)));
            zz = -0.875 + (((tickAnim - 28) / 7) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -1.125 + (((tickAnim - 35) / 5) * (-0.95-(-1.125)));
            zz = -0.875 + (((tickAnim - 35) / 5) * (0-(-0.875)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (5.08-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 5.08 + (((tickAnim - 8) / 11) * (-74-(5.08)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -74 + (((tickAnim - 19) / 6) * (-14.08-(-74)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -14.08 + (((tickAnim - 25) / 3) * (30-(-14.08)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 30 + (((tickAnim - 28) / 5) * (20.2-(30)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 20.2 + (((tickAnim - 33) / 5) * (0-(20.2)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-2));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 4) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 23) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-1), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*-5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*-2));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-1), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*-5), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+70))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-2));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 4) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 23) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*-2));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+40))*-2), leftArm1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*-2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2), leftArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*-2));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+40))*-2), rightArm1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*-2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2), rightArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*-2));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+220))*1), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+190))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+190))*-2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+230))*-0.2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+300))*1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAcrocanthosaurus entity = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+30))*-2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*-2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 0) / 5) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0.25-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 5) * (-0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0.25 + (((tickAnim - 5) / 9) * (0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0.25)));
            yy = -0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 5) / 9) * (-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5-(-0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5 + (((tickAnim - 5) / 9) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 14) / 5) * (0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = -0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5 + (((tickAnim - 14) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5)));
            zz = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5 + (((tickAnim - 14) / 5) * (0.125-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 19) / 6) * (0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.35-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 19) / 6) * (-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 0.125 + (((tickAnim - 19) / 6) * (0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5-(0.125)));
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
            xx = 13.74273 + (((tickAnim - 0) / 3) * (2.88424-(13.74273)));
            yy = -4.3603 + (((tickAnim - 0) / 3) * (-8.3761-(-4.3603)));
            zz = 9.4502 + (((tickAnim - 0) / 3) * (4.1055-(9.4502)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 2.88424 + (((tickAnim - 3) / 6) * (-16.64363-(2.88424)));
            yy = -8.3761 + (((tickAnim - 3) / 6) * (4.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+60))*-10-(-8.3761)));
            zz = 4.1055 + (((tickAnim - 3) / 6) * (4.2155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-7-(4.1055)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -16.64363 + (((tickAnim - 9) / 4) * (-23.46796-(-16.64363)));
            yy = 4.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+60))*-10 + (((tickAnim - 9) / 4) * (-0.7982-(4.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+60))*-10)));
            zz = 4.2155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-7 + (((tickAnim - 9) / 4) * (0.8656-(4.2155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-7)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -23.46796 + (((tickAnim - 13) / 12) * (13.74273-(-23.46796)));
            yy = -0.7982 + (((tickAnim - 13) / 12) * (-4.3603-(-0.7982)));
            zz = 0.8656 + (((tickAnim - 13) / 12) * (9.4502-(0.8656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3 + (((tickAnim - 18) / 6) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.41072 + (((tickAnim - 0) / 3) * (13.4926+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*35-(30.41072)));
            yy = -0.2671 + (((tickAnim - 0) / 3) * (0.15938-(-0.2671)));
            zz = -1.0706 + (((tickAnim - 0) / 3) * (-0.89893-(-1.0706)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 13.4926+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*35 + (((tickAnim - 3) / 6) * (-4.6396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9-(13.4926+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*35)));
            yy = 0.15938 + (((tickAnim - 3) / 6) * (4.05658-(0.15938)));
            zz = -0.89893 + (((tickAnim - 3) / 6) * (5.36701-(-0.89893)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -4.6396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9 + (((tickAnim - 9) / 4) * (-14.58034-(-4.6396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9)));
            yy = 4.05658 + (((tickAnim - 9) / 4) * (-1.5896-(4.05658)));
            zz = 5.36701 + (((tickAnim - 9) / 4) * (5.7863-(5.36701)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -14.58034 + (((tickAnim - 13) / 12) * (30.41072-(-14.58034)));
            yy = -1.5896 + (((tickAnim - 13) / 12) * (-0.2671-(-1.5896)));
            zz = 5.7863 + (((tickAnim - 13) / 12) * (-1.0706-(5.7863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 0) / 3) * (2.46-(0.975)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 2.46 + (((tickAnim - 3) / 6) * (0.125-(2.46)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 9) / 4) * (-1.45-(0.125)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -1.45 + (((tickAnim - 13) / 12) * (0.975-(-1.45)));
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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.6223 + (((tickAnim - 0) / 3) * (19.7751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35-(12.6223)));
            yy = 0.07685 + (((tickAnim - 0) / 3) * (0.30741-(0.07685)));
            zz = 0.24999 + (((tickAnim - 0) / 3) * (0.99995-(0.24999)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 19.7751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35 + (((tickAnim - 3) / 6) * (0.8363+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50-(19.7751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35)));
            yy = 0.30741 + (((tickAnim - 3) / 6) * (5.0482-(0.30741)));
            zz = 0.99995 + (((tickAnim - 3) / 6) * (-2.51711-(0.99995)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.8363+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50 + (((tickAnim - 9) / 4) * (19.99656-(0.8363+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50)));
            yy = 5.0482 + (((tickAnim - 9) / 4) * (-2.2782-(5.0482)));
            zz = -2.51711 + (((tickAnim - 9) / 4) * (0.29394-(-2.51711)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 19.99656 + (((tickAnim - 13) / 12) * (12.6223-(19.99656)));
            yy = -2.2782 + (((tickAnim - 13) / 12) * (0.07685-(-2.2782)));
            zz = 0.29394 + (((tickAnim - 13) / 12) * (0.24999-(0.29394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 9) * (0.125-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 9) / 4) * (-3.125-(0.125)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -3.125 + (((tickAnim - 13) / 12) * (-0.325-(-3.125)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
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
            xx = 43.86832 + (((tickAnim - 0) / 3) * (65-(43.86832)));
            yy = -5.6618 + (((tickAnim - 0) / 3) * (0-(-5.6618)));
            zz = -3.6858 + (((tickAnim - 0) / 3) * (0-(-3.6858)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 65 + (((tickAnim - 3) / 6) * (71.75-(65)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 71.75 + (((tickAnim - 9) / 4) * (20.1174-(71.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (2.31061-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-5.838-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.1174 + (((tickAnim - 13) / 5) * (-3.32431-(20.1174)));
            yy = 2.31061 + (((tickAnim - 13) / 5) * (2.1132-(2.31061)));
            zz = -5.838 + (((tickAnim - 13) / 5) * (-9.97106-(-5.838)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3.32431 + (((tickAnim - 18) / 7) * (43.86832-(-3.32431)));
            yy = 2.1132 + (((tickAnim - 18) / 7) * (-5.6618-(2.1132)));
            zz = -9.97106 + (((tickAnim - 18) / 7) * (-3.6858-(-9.97106)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.55-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.875-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.55 + (((tickAnim - 3) / 3) * (2.875-(1.55)));
            zz = -0.875 + (((tickAnim - 3) / 3) * (-0.88-(-0.875)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 2.875 + (((tickAnim - 6) / 3) * (1.55-(2.875)));
            zz = -0.88 + (((tickAnim - 6) / 3) * (-0.875-(-0.88)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.55 + (((tickAnim - 9) / 4) * (0.125-(1.55)));
            zz = -0.875 + (((tickAnim - 9) / 4) * (0.45-(-0.875)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 13) / 5) * (2.055-(0.125)));
            zz = 0.45 + (((tickAnim - 13) / 5) * (0-(0.45)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 2.055 + (((tickAnim - 18) / 7) * (0-(2.055)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
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
            xx = 15.24 + (((tickAnim - 0) / 3) * (15.98-(15.24)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 15.98 + (((tickAnim - 3) / 6) * (25.51-(15.98)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 25.51 + (((tickAnim - 9) / 4) * (0-(25.51)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-4.49727-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.15689-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (1.99384-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -4.49727 + (((tickAnim - 18) / 3) * (-34.84579-(-4.49727)));
            yy = 0.15689 + (((tickAnim - 18) / 3) * (0.09805-(0.15689)));
            zz = 1.99384 + (((tickAnim - 18) / 3) * (1.24615-(1.99384)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -34.84579 + (((tickAnim - 21) / 4) * (15.24-(-34.84579)));
            yy = 0.09805 + (((tickAnim - 21) / 4) * (0-(0.09805)));
            zz = 1.24615 + (((tickAnim - 21) / 4) * (0-(1.24615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.275-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.025 + (((tickAnim - 6) / 7) * (0-(0.025)));
            zz = 1.275 + (((tickAnim - 6) / 7) * (0-(1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -25.23513 + (((tickAnim - 0) / 11) * (13.99273-(-25.23513)));
            yy = -0.61196 + (((tickAnim - 0) / 11) * (4.3603-(-0.61196)));
            zz = -1.67683 + (((tickAnim - 0) / 11) * (-9.4502-(-1.67683)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 13.99273 + (((tickAnim - 11) / 4) * (-1.00383-(13.99273)));
            yy = 4.3603 + (((tickAnim - 11) / 4) * (9.06872-(4.3603)));
            zz = -9.4502 + (((tickAnim - 11) / 4) * (-3.91949-(-9.4502)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -1.00383 + (((tickAnim - 15) / 6) * (-18.96664-(-1.00383)));
            yy = 9.06872 + (((tickAnim - 15) / 6) * (3.8753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10-(9.06872)));
            zz = -3.91949 + (((tickAnim - 15) / 6) * (-7.5663+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7-(-3.91949)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -18.96664 + (((tickAnim - 21) / 4) * (-25.23513-(-18.96664)));
            yy = 3.8753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10 + (((tickAnim - 21) / 4) * (-0.61196-(3.8753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10)));
            zz = -7.5663+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7 + (((tickAnim - 21) / 4) * (-1.67683-(-7.5663+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3 + (((tickAnim - 5) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -5.33034 + (((tickAnim - 0) / 11) * (20.91897-(-5.33034)));
            yy = 1.58962 + (((tickAnim - 0) / 11) * (0.2536-(1.58962)));
            zz = -5.78634 + (((tickAnim - 0) / 11) * (1.0941-(-5.78634)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 20.91897 + (((tickAnim - 11) / 5) * (23.1588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*35-(20.91897)));
            yy = 0.2536 + (((tickAnim - 11) / 5) * (1.13964-(0.2536)));
            zz = 1.0941 + (((tickAnim - 11) / 5) * (0.21149-(1.0941)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 23.1588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*35 + (((tickAnim - 16) / 5) * (3.9724+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9-(23.1588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*35)));
            yy = 1.13964 + (((tickAnim - 16) / 5) * (-5.56823-(1.13964)));
            zz = 0.21149 + (((tickAnim - 16) / 5) * (-6.52273-(0.21149)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 3.9724+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9 + (((tickAnim - 21) / 4) * (-9.08034-(3.9724+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9)));
            yy = -5.56823 + (((tickAnim - 21) / 4) * (1.58962-(-5.56823)));
            zz = -6.52273 + (((tickAnim - 21) / 4) * (-5.78634-(-6.52273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -1.45 + (((tickAnim - 0) / 11) * (0.925-(-1.45)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0.925 + (((tickAnim - 11) / 5) * (2.975-(0.925)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 2.975 + (((tickAnim - 16) / 5) * (0.225-(2.975)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 21) / 4) * (-1.45-(0.225)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 17.74656 + (((tickAnim - 0) / 11) * (17.75-(17.74656)));
            yy = 2.27825 + (((tickAnim - 0) / 11) * (0-(2.27825)));
            zz = 0.29394 + (((tickAnim - 0) / 11) * (0-(0.29394)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 17.75 + (((tickAnim - 11) / 4) * (-52.8499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*55-(17.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0.30741-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.99995-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -52.8499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*55 + (((tickAnim - 15) / 6) * (-16.0331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50-(-52.8499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*55)));
            yy = 0.30741 + (((tickAnim - 15) / 6) * (2.66334-(0.30741)));
            zz = 0.99995 + (((tickAnim - 15) / 6) * (-0.38616-(0.99995)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -16.0331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50 + (((tickAnim - 21) / 4) * (22.99656-(-16.0331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50)));
            yy = 2.66334 + (((tickAnim - 21) / 4) * (2.27825-(2.66334)));
            zz = -0.38616 + (((tickAnim - 21) / 4) * (0.29394-(-0.38616)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -3.125 + (((tickAnim - 0) / 11) * (-0.325-(-3.125)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 11) / 10) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (-3.125-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
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
            xx = 13.08157 + (((tickAnim - 0) / 6) * (-10.83839-(13.08157)));
            yy = -2.8995 + (((tickAnim - 0) / 6) * (1.84607-(-2.8995)));
            zz = 6.6478 + (((tickAnim - 0) / 6) * (8.83771-(6.6478)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -10.83839 + (((tickAnim - 6) / 5) * (36.82442-(-10.83839)));
            yy = 1.84607 + (((tickAnim - 6) / 5) * (7.5491-(1.84607)));
            zz = 8.83771 + (((tickAnim - 6) / 5) * (4.9144-(8.83771)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 36.82442 + (((tickAnim - 11) / 4) * (79.25-(36.82442)));
            yy = 7.5491 + (((tickAnim - 11) / 4) * (0-(7.5491)));
            zz = 4.9144 + (((tickAnim - 11) / 4) * (0-(4.9144)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 79.25 + (((tickAnim - 15) / 5) * (74.725-(79.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 74.725 + (((tickAnim - 20) / 5) * (12.08157-(74.725)));
            yy = 0 + (((tickAnim - 20) / 5) * (-2.8995-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (6.6478-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 6) * (0.475-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 6) / 5) * (0-(0.475)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (1.85-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-0.875-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.85 + (((tickAnim - 15) / 3) * (1.805-(1.85)));
            zz = -0.875 + (((tickAnim - 15) / 3) * (-0.96-(-0.875)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.805 + (((tickAnim - 18) / 2) * (0-(1.805)));
            zz = -0.96 + (((tickAnim - 18) / 2) * (-1.05-(-0.96)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-0.25-(0)));
            zz = -1.05 + (((tickAnim - 20) / 5) * (0-(-1.05)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (-6.28-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.28 + (((tickAnim - 6) / 2) * (-27.02-(-6.28)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -27.02 + (((tickAnim - 8) / 3) * (13-(-27.02)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 13 + (((tickAnim - 11) / 4) * (25.98-(13)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 25.98 + (((tickAnim - 15) / 6) * (18.16-(25.98)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 18.16 + (((tickAnim - 21) / 4) * (0-(18.16)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (1.525-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 1.525 + (((tickAnim - 18) / 7) * (0-(1.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-30))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+30))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+30))*-3));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2 + (((tickAnim - 3) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2 + (((tickAnim - 17) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578-60))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-90))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578-120))*1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-7), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578-140))*1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-4));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-170))*-1), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*-9), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*-5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-170))*-1), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*-9), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+70))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+30))*-1));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15 + (((tickAnim - 3) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15 + (((tickAnim - 17) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+20))*2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*-2));
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+40))*4), leftArm1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*-2));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+90))*-5), leftArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*-2));
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+40))*4), rightArm1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*-2));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+90))*-5), rightArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*-2));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+220))*2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+180))*-2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+190))*-3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+190))*-2));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-250))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+230))*-0.5));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+300))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(10), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAcrocanthosaurus ee = (EntityPrehistoricFloraAcrocanthosaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoiseHiss(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAcrocanthosaurus e = (EntityPrehistoricFloraAcrocanthosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
