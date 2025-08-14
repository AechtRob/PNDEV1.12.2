package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraUtahraptor;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelUtahraptor extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightSickleClaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftSickleClaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightUpperPropatagium;
    private final AdvancedModelRenderer rightPropatagiumExtention;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightLowerPropatagium;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightArm4;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftUpperPropatagium;
    private final AdvancedModelRenderer leftPropatagiumExtention;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftLowerPropatagium;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftArm4;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
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
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer cube_r96;

    private ModelAnimator animator;

    public ModelUtahraptor() {
        this.textureWidth = 165;
        this.textureHeight = 165;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -2.0F, 2.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.6F, -3.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2356F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 76, 0, -4.0F, -0.0449F, -0.0185F, 8, 3, 11, 0.006F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 10.3F, -8.9F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4974F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 97, -4.5F, -8.0032F, -0.2084F, 9, 8, 7, -0.004F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.6F, -3.0F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3665F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -4.0F, -0.0449F, -0.0185F, 8, 17, 11, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.0F, 1.3F, 0.05F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.6109F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 3.241F, 7.4546F);
        this.rightLeg1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2705F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 70, 144, -1.0F, -2.5F, -2.7F, 2, 9, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2052F, -0.5638F);
        this.rightLeg1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1396F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 76, 94, -2.5F, -3.3778F, -1.4821F, 5, 15, 8, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.5F, 11.1029F, 0.3892F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.2741F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 7.5027F, 2.0234F);
        this.rightLeg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 144, -1.0F, -3.5F, -1.8F, 2, 11, 4, 0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 2.0842F, 0.8553F);
        this.rightLeg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 130, -2.0F, -2.15F, -1.85F, 4, 15, 4, 0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, 14.7601F, 1.8163F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1606F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 76, 15, -2.0F, -0.2237F, -2.5529F, 4, 6, 3, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.4F, 6.0962F, -1.2494F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.5236F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 49, 41, -2.5F, -1.5F, -2.5F, 4, 2, 4, 0.0F, true));

        this.rightSickleClaw = new AdvancedModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(1.5F, -1.0F, -0.8F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.4363F, -0.3054F, 0.0F);
        this.rightSickleClaw.cubeList.add(new ModelBox(rightSickleClaw, 117, 11, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.9F, -1.6F);
        this.rightSickleClaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.8116F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 150, 144, 0.0F, -0.4284F, -3.8555F, 0, 4, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0F, 0.0F, -1.3F);
        this.rightSickleClaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.8727F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 93, 118, 1.5F, -0.5F, -1.7F, 1, 1, 2, 0.004F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 92, 33, -2.0F, -1.5F, -4.0F, 4, 2, 4, 0.01F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.0F, 1.3F, 0.05F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6109F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.241F, 7.4546F);
        this.leftLeg1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2705F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 144, -1.0F, -2.5F, -2.7F, 2, 9, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.2052F, -0.5638F);
        this.leftLeg1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1396F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 76, 94, -2.5F, -3.3778F, -1.4821F, 5, 15, 8, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.5F, 11.1029F, 0.3892F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.2741F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 7.5027F, 2.0234F);
        this.leftLeg2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 144, -1.0F, -3.5F, -1.8F, 2, 11, 4, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 2.0842F, 0.8553F);
        this.leftLeg2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0524F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 130, -2.0F, -2.15F, -1.85F, 4, 15, 4, 0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, 14.7601F, 1.8163F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.1606F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 76, 15, -2.0F, -0.2237F, -2.5529F, 4, 6, 3, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(-0.4F, 6.0962F, -1.2494F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.5236F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 49, 41, -1.5F, -1.5F, -2.5F, 4, 2, 4, 0.0F, false));

        this.leftSickleClaw = new AdvancedModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-1.5F, -1.0F, -0.8F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -0.4363F, 0.3054F, 0.0F);
        this.leftSickleClaw.cubeList.add(new ModelBox(leftSickleClaw, 117, 11, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.9F, -1.6F);
        this.leftSickleClaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.8116F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 150, 144, 0.0F, -0.4284F, -3.8555F, 0, 4, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.0F, 0.0F, -1.3F);
        this.leftSickleClaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.8727F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 93, 118, -2.5F, -0.5F, -1.7F, 1, 1, 2, 0.004F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 92, 33, -2.0F, -1.5F, -4.0F, 4, 2, 4, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -3.7F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 84, -5.0F, -5.8652F, -7.2383F, 10, 4, 8, 0.005F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 9.8F, -9.4F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4363F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 76, 80, -5.5F, -4.8196F, -0.0309F, 11, 5, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -5.8F, -7.2F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1396F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 0, -5.0F, -0.0652F, -0.0383F, 10, 16, 8, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.7F, -8.2F);
        this.body.addChild(chest);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 5.2756F, -8.7303F);
        this.chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.7592F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 25, -5.0F, -3.9885F, -0.5086F, 10, 4, 11, 0.02F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 5.2756F, -8.7303F);
        this.chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6458F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 48, -4.5F, -8.9885F, -0.5086F, 9, 9, 11, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -3.7244F, -8.9303F);
        this.chest.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 79, 123, -3.5F, 0.0116F, -0.1014F, 7, 4, 6, 0.006F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -3.7244F, -8.9303F);
        this.chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1484F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 69, -4.5F, 0.0116F, -0.1014F, 9, 4, 10, 0.05F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 3.0756F, -3.9303F);
        this.chest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 41, 48, -4.5F, -7.0F, -4.8F, 9, 9, 10, 0.01F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.9221F, 4.3885F, -6.243F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.7992F, -0.3757F, 0.4087F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 148, 60, -0.9759F, -1.001F, -1.046F, 2, 8, 2, 0.01F, true));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 64, 100, -0.6259F, 0.399F, -1.046F, 0, 9, 4, 0.0F, true));

        this.rightUpperPropatagium = new AdvancedModelRenderer(this);
        this.rightUpperPropatagium.setRotationPoint(0.0241F, 0.399F, -1.046F);
        this.rightArm.addChild(rightUpperPropatagium);
        this.setRotateAngle(rightUpperPropatagium, -0.4625F, 0.0F, 0.0F);
        this.rightUpperPropatagium.cubeList.add(new ModelBox(rightUpperPropatagium, 79, 153, -0.5F, 0.0F, 0.0F, 1, 4, 2, -0.01F, true));

        this.rightPropatagiumExtention = new AdvancedModelRenderer(this);
        this.rightPropatagiumExtention.setRotationPoint(0.0F, 3.7709F, 0.9998F);
        this.rightUpperPropatagium.addChild(rightPropatagiumExtention);
        this.setRotateAngle(rightPropatagiumExtention, 1.2654F, 0.0F, 0.0F);
        this.rightPropatagiumExtention.cubeList.add(new ModelBox(rightPropatagiumExtention, 79, 118, -0.5F, -0.3F, -1.0F, 1, 2, 2, -0.03F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0241F, 6.3759F, -0.1963F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -2.0944F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 32, 145, -0.75F, -0.25F, -1.0F, 1, 8, 2, 0.01F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 40, 134, -0.6F, -2.25F, -1.0F, 0, 10, 8, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 9, 150, -0.25F, -0.25F, -1.0F, 1, 8, 2, 0.0F, true));

        this.rightLowerPropatagium = new AdvancedModelRenderer(this);
        this.rightLowerPropatagium.setRotationPoint(-1.0F, 4.75F, -1.0F);
        this.rightArm2.addChild(rightLowerPropatagium);
        this.setRotateAngle(rightLowerPropatagium, 0.6894F, 0.0F, 0.0F);
        this.rightLowerPropatagium.cubeList.add(new ModelBox(rightLowerPropatagium, 153, 84, 0.5F, -4.0F, 0.0F, 1, 4, 2, -0.02F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.8548F, 8.21F, -0.5931F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.9085F, 0.2903F, -0.0561F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 86, 118, 0.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, true));
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 39, 153, 0.0F, 1.7F, -0.5F, 1, 8, 1, -0.01F, true));
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 80, 60, 0.0F, 1.7F, 0.5F, 1, 6, 1, -0.01F, true));
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 137, 144, -0.05F, -0.3F, -0.5F, 0, 7, 6, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.rightArm3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 150, 0.0F, 1.0F, -0.5F, 0, 6, 4, 0.0F, true));

        this.rightArm4 = new AdvancedModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.2618F, 0.0F, 0.0F);
        this.rightArm4.cubeList.add(new ModelBox(rightArm4, 25, 152, 0.0F, 0.0F, -0.5F, 2, 6, 1, -0.02F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.9221F, 4.3885F, -6.243F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.7992F, 0.3757F, -0.4087F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 148, 60, -1.0241F, -1.001F, -1.046F, 2, 8, 2, 0.01F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 64, 100, 0.6259F, 0.399F, -1.046F, 0, 9, 4, 0.0F, false));

        this.leftUpperPropatagium = new AdvancedModelRenderer(this);
        this.leftUpperPropatagium.setRotationPoint(-0.0241F, 0.399F, -1.046F);
        this.leftArm.addChild(leftUpperPropatagium);
        this.setRotateAngle(leftUpperPropatagium, -0.4625F, 0.0F, 0.0F);
        this.leftUpperPropatagium.cubeList.add(new ModelBox(leftUpperPropatagium, 79, 153, -0.5F, 0.0F, 0.0F, 1, 4, 2, -0.01F, false));

        this.leftPropatagiumExtention = new AdvancedModelRenderer(this);
        this.leftPropatagiumExtention.setRotationPoint(0.0F, 3.7709F, 0.9998F);
        this.leftUpperPropatagium.addChild(leftPropatagiumExtention);
        this.setRotateAngle(leftPropatagiumExtention, 1.2654F, 0.0F, 0.0F);
        this.leftPropatagiumExtention.cubeList.add(new ModelBox(leftPropatagiumExtention, 79, 118, -0.5F, -0.3F, -1.0F, 1, 2, 2, -0.03F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.0241F, 6.3759F, -0.1963F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.0944F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 32, 145, -0.25F, -0.25F, -1.0F, 1, 8, 2, 0.01F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 40, 134, 0.6F, -2.25F, -1.0F, 0, 10, 8, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 9, 150, -0.75F, -0.25F, -1.0F, 1, 8, 2, 0.0F, false));

        this.leftLowerPropatagium = new AdvancedModelRenderer(this);
        this.leftLowerPropatagium.setRotationPoint(1.0F, 4.75F, -1.0F);
        this.leftArm2.addChild(leftLowerPropatagium);
        this.setRotateAngle(leftLowerPropatagium, 0.6894F, 0.0F, 0.0F);
        this.leftLowerPropatagium.cubeList.add(new ModelBox(leftLowerPropatagium, 153, 84, -1.5F, -4.0F, 0.0F, 1, 4, 2, -0.02F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.8548F, 8.21F, -0.5931F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.9085F, -0.2903F, 0.0561F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 86, 118, -1.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, false));
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 39, 153, -1.0F, 1.7F, -0.5F, 1, 8, 1, -0.01F, false));
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 80, 60, -1.0F, 1.7F, 0.5F, 1, 6, 1, -0.01F, false));
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 137, 144, 0.05F, -0.3F, -0.5F, 0, 7, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.leftArm3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 150, 0.0F, 1.0F, -0.5F, 0, 6, 4, 0.0F, false));

        this.leftArm4 = new AdvancedModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.2618F, 0.0F, 0.0F);
        this.leftArm4.cubeList.add(new ModelBox(leftArm4, 25, 152, -2.0F, 0.0F, -0.5F, 2, 6, 1, -0.02F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.4F, -6.9F);
        this.chest.addChild(neck3);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -4.3F, -1.8F);
        this.neck3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1658F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 144, 35, -3.0F, -0.2699F, -1.0134F, 6, 6, 3, 0.009F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.3F, -6.2F);
        this.neck3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.8727F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 27, 116, -3.0F, -8.002F, -0.0563F, 6, 8, 7, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -1.0F, -3.9F);
        this.neck3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.5934F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 54, 118, -2.5F, -3.98F, -0.1177F, 5, 8, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0F, -3.1F);
        this.neck3.addChild(neck2);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.1665F, -5.4918F);
        this.neck2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5585F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 80, 134, -1.5F, -1.9F, -2.0F, 3, 3, 7, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -6.8F, -2.7F);
        this.neck2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.733F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 57, 134, -2.0F, -0.1122F, -0.0567F, 4, 3, 6, 0.005F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -6.8F, -2.8F);
        this.neck2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.5323F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 17, 145, -1.5F, -0.0982F, -0.0095F, 3, 2, 4, -0.009F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -5.4F, -4.3F);
        this.neck2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.8203F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 113, -2.0F, -2.1501F, -0.0104F, 4, 7, 9, -0.05F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -5.9F, -3.1F);
        this.neck2.addChild(neck);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -2.7F, -4.4F);
        this.neck.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0436F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 92, 147, -1.5F, 0.0185F, 0.0364F, 3, 4, 3, 0.005F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -1.9F, -2.5F);
        this.neck.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1745F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 131, 134, -2.0F, -0.2834F, -2.0226F, 4, 3, 6, -0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.9F, 0.3F);
        this.neck.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3491F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 134, 89, -2.0F, -0.0655F, -4.9958F, 4, 6, 5, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.8366F, -4.2074F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.1F, -0.0844F, -13.036F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -1.4224F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 109, 33, -0.2F, -3.8767F, 1.9066F, 1, 4, 1, -0.01F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 109, 33, -0.6F, -3.8767F, 1.9066F, 1, 4, 1, -0.01F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 44, 153, -0.4F, -3.9767F, 0.0066F, 1, 4, 2, -0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.01F, 3.3866F, -10.6143F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0943F, -0.0266F, 0.0194F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 108, 75, 0.3999F, -0.3043F, 0.2951F, 0, 1, 3, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.938F, 3.2299F, -12.9584F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1812F, -0.0291F, -0.0214F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 152, 134, 0.4F, -0.5F, -1.5F, 0, 1, 4, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.1013F, 3.3102F, -6.4881F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.2443F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 150, 7, -0.5987F, -0.6787F, -8.2608F, 1, 2, 4, 0.015F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 150, 7, -0.1987F, -0.6787F, -8.2608F, 1, 2, 4, 0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.1013F, 3.3102F, -6.4881F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.053F, -0.1569F, 0.0083F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 79, 145, -1.3414F, -1.5874F, -4.8038F, 1, 2, 5, -0.005F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.1013F, 3.3102F, -6.4881F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.053F, 0.1569F, -0.0083F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 79, 145, 0.3414F, -1.5874F, -4.8038F, 1, 2, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.0908F, -0.648F, -8.3414F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -1.4709F, -0.3146F, 0.0314F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 122, 89, -0.0446F, -2.2272F, 0.0479F, 1, 3, 1, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.0908F, -0.648F, -8.3414F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -1.7276F, -0.7139F, 0.4867F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 46, 25, -0.0446F, -2.2272F, 0.0479F, 1, 3, 0, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.7908F, -0.648F, -6.2414F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 2.0859F, -1.2282F, -3.1221F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 73, 100, -0.0866F, -0.2211F, 0.1354F, 1, 1, 0, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.7003F, -0.0083F, -4.598F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 2.2815F, -1.3143F, 2.9566F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 54, 116, -2.0F, -0.6F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.7003F, -0.0083F, -4.598F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 2.2815F, 1.3143F, -2.9566F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 54, 116, -1.0F, -0.6F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(1.7908F, -0.648F, -6.2414F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 2.0859F, 1.2282F, 3.1221F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 73, 100, -0.9134F, -0.2211F, 0.1354F, 1, 1, 0, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.0908F, -0.648F, -6.2414F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -1.6157F, -1.1089F, 0.1107F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 33, 97, -0.3967F, -0.6467F, -0.1154F, 2, 1, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(1.0908F, -0.648F, -6.2414F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -1.6157F, 1.1089F, -0.1107F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 33, 97, -1.6033F, -0.6467F, -0.1154F, 2, 1, 1, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(1.0908F, -0.648F, -8.3414F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -1.7276F, 0.7139F, -0.4867F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 46, 25, -0.9554F, -2.2272F, 0.0479F, 1, 3, 0, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(1.0908F, -0.648F, -8.3414F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -1.4709F, 0.3146F, -0.0314F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 122, 89, -0.9554F, -2.2272F, 0.0479F, 1, 3, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -0.5971F, -9.1717F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -1.5533F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 120, 136, -1.0F, -3.0258F, -0.0547F, 2, 3, 3, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -0.0844F, -13.036F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -1.0559F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 132, 120, -0.5F, 0.5233F, 0.0066F, 1, 1, 1, -0.01F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 27, 113, -0.5F, 0.0233F, 0.0066F, 1, 1, 1, -0.014F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(1.01F, 3.3866F, -10.6143F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0943F, 0.0266F, -0.0194F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 108, 75, -0.3999F, -0.3043F, 0.2951F, 0, 1, 3, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.938F, 3.2299F, -12.9584F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.1812F, 0.0291F, 0.0214F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 152, 134, -0.4F, -0.5F, -1.5F, 0, 1, 4, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-1.0F, -0.5304F, -3.1594F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.3752F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 146, 53, 0.0F, 0.0238F, -0.7519F, 2, 2, 4, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.0F, -0.7304F, -0.0594F);
        this.head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.096F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 134, 101, -0.5F, -0.0742F, -3.8568F, 3, 2, 4, -0.003F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 1.9482F, -5.054F);
        this.head.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.2269F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 149, 101, -1.5F, 0.1F, -1.5F, 3, 2, 3, 0.01F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5F, -0.6304F, -3.3594F);
        this.head.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.0698F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 146, 45, -1.0F, -0.0095F, -3.0106F, 3, 4, 3, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-1.0F, -0.6304F, -3.3594F);
        this.head.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.2967F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 101, 136, -1.0F, -0.0095F, -0.0106F, 4, 5, 5, 0.015F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-1.1573F, 0.7793F, -4.836F);
        this.head.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.1628F, -0.0198F, -0.0112F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 39, 25, -0.4F, -0.5F, -0.6F, 1, 1, 2, 0.0F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(1.1573F, 0.7793F, -4.836F);
        this.head.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.1628F, 0.0198F, 0.0112F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 39, 25, -0.6F, -0.5F, -0.6F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.4F, 4.9663F, -0.2697F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.8542F, 0.0F, 0.0F);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 1.3904F, -2.1352F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.8988F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 120, 144, -1.9F, -3.0373F, -2.0064F, 3, 4, 5, -0.004F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 1.3904F, -2.1352F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.5498F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 125, 24, -2.4F, -0.0373F, -2.0064F, 4, 3, 5, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-1.0078F, 10.3556F, -9.9125F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.4712F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 115, 89, -0.0922F, -1.9401F, -0.078F, 1, 2, 2, -0.013F, true));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 115, 89, 0.3078F, -1.9401F, -0.078F, 1, 2, 2, -0.01F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-1.0078F, 6.8556F, -5.6125F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.8029F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 150, 14, -0.0922F, -1.9901F, -3.7122F, 1, 2, 4, -0.017F, true));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 150, 14, 0.3078F, -1.9901F, -3.7122F, 1, 2, 4, -0.013F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-2.1166F, 4.459F, -4.7175F);
        this.jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.61F, -0.1394F, -0.0641F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 105, 147, 0.3001F, -0.555F, -5.0664F, 1, 2, 5, -0.02F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-2.1166F, 4.459F, -4.7175F);
        this.jaw.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.706F, -0.1394F, -0.0641F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 148, 0, 0.3483F, -0.9927F, -4.8974F, 1, 1, 5, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-1.0078F, 9.0556F, -11.2125F);
        this.jaw.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.7156F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 144, 24, -0.0922F, -0.1257F, 0.0483F, 1, 2, 8, 0.005F, true));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 144, 24, 0.3078F, -0.1257F, 0.0483F, 1, 2, 8, 0.0F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(1.3166F, 4.459F, -4.7175F);
        this.jaw.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.706F, 0.1394F, 0.0641F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 148, 0, -1.3483F, -0.9927F, -4.8974F, 1, 1, 5, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(1.3166F, 4.459F, -4.7175F);
        this.jaw.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.61F, 0.1394F, 0.0641F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 105, 147, -1.3001F, -0.555F, -5.0664F, 1, 2, 5, -0.02F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-0.4102F, 2.726F, -4.3922F);
        this.jaw.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 1.7586F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 64, 114, -1.4898F, 0.0667F, -0.1627F, 3, 1, 2, -0.009F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.4166F, 2.459F, -3.8175F);
        this.jaw.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.7027F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 97, 75, -2.3166F, -0.0478F, -1.8763F, 3, 1, 2, 0.0F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.4166F, 4.459F, -4.7175F);
        this.jaw.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.6067F, 0.0352F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 90, 75, -1.3001F, -0.555F, -2.0664F, 1, 2, 2, -0.02F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.4166F, 4.459F, -4.7175F);
        this.jaw.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.6067F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 86, 75, -2.3166F, -0.555F, -0.0664F, 3, 2, 2, 0.006F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(-1.1097F, 7.8091F, -10.0847F);
        this.jaw.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 1.2843F, -0.0478F, -0.0624F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 127, 89, 0.3476F, -0.7877F, -1.456F, 0, 2, 2, 0.0F, true));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(-1.0008F, 7.0027F, -8.2131F);
        this.jaw.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.7074F, -0.008F, -0.0283F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 16, 152, 0.1999F, -0.9967F, -1.0049F, 0, 2, 4, 0.0F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.3097F, 7.8091F, -10.0847F);
        this.jaw.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 1.2843F, 0.0478F, 0.0624F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 127, 89, -0.3476F, -0.7877F, -1.456F, 0, 2, 2, 0.0F, false));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.2008F, 7.0027F, -8.2131F);
        this.jaw.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.7074F, 0.008F, 0.0283F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 16, 152, -0.1999F, -0.9967F, -1.0049F, 0, 2, 4, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.4166F, 5.659F, -3.8175F);
        this.jaw.addChild(throat);


        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.2402F, 0.0352F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 66, 41, -1.7685F, -1.9912F, -0.025F, 2, 2, 4, -0.02F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(-0.8166F, -5.2402F, 6.138F);
        this.throat.addChild(throat2);
        this.setRotateAngle(throat2, 0.5149F, 0.0F, 0.0F);


        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, 1.3F, -2.6F);
        this.throat2.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.2793F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 144, 74, -1.5F, -2.3F, -2.5F, 3, 4, 5, -0.008F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.6F, 6.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 41, 80, -3.0F, -3.4264F, -2.9848F, 6, 8, 11, 0.0F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(0.0F, -3.4264F, -2.8848F);
        this.tail.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0436F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 86, 60, -3.0F, -0.5F, -0.1F, 6, 3, 11, 0.006F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(0.0F, 4.7736F, -3.0848F);
        this.tail.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.1309F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 106, 123, -0.5F, 1.8F, 0.1F, 1, 1, 11, 0.0F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 115, 75, -1.5F, -0.2F, 0.1F, 3, 2, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.8264F, 7.8152F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1833F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 100, -1.0F, 3.337F, -1.798F, 2, 2, 13, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 103, 108, -0.5F, 5.337F, -1.798F, 1, 1, 13, 0.0F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(-2.0F, 0.9034F, 4.9418F);
        this.tail2.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, 0.0F, -0.6981F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 103, 94, -2.0F, 0.0F, -6.5F, 2, 0, 13, 0.0F, true));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(2.0F, 0.9034F, 4.9418F);
        this.tail2.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0F, 0.0F, 0.6981F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 103, 94, 0.0F, 0.0F, -6.5F, 2, 0, 13, 0.0F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(0.0F, -1.5335F, 0.0355F);
        this.tail2.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.0873F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 80, 41, -2.0F, 0.0F, -1.4F, 4, 5, 13, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.9665F, 11.5355F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0524F, 0.0F, 0.0F);


        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(-1.5F, 0.1548F, 4.5007F);
        this.tail3.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.0087F, 0.0F, -0.5236F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 115, 48, -3.7F, -0.3F, -5.5F, 4, 0, 11, 0.0F, true));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(1.5F, 0.1548F, 4.5007F);
        this.tail3.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.0087F, 0.0F, 0.5236F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 115, 48, -0.3F, -0.3F, -5.5F, 4, 0, 11, 0.0F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(0.0F, 1.4986F, -0.9477F);
        this.tail3.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0175F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 17, 132, 0.0F, 0.9669F, -0.1018F, 0, 1, 11, 0.0F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 125, 11, -0.5F, -0.0331F, -0.1018F, 1, 1, 11, 0.0F, false));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(0.0F, -1.4014F, 0.0523F);
        this.tail3.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.0349F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 115, 33, -1.5F, -0.1F, -1.0F, 3, 3, 11, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3014F, 10.0523F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0524F, 0.0F, 0.0F);


        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(-1.0F, 1.1432F, 4.6726F);
        this.tail4.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.0524F, 0.0F, -0.4363F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 117, 0, -4.5F, -0.8F, -5.0F, 5, 0, 10, 0.0F, true));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(1.0F, 1.1432F, 4.6726F);
        this.tail4.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.0524F, 0.0F, 0.4363F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 117, 0, -0.5F, -0.8F, -5.0F, 5, 0, 10, 0.0F, false));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(0.0F, 1.9989F, 0.0419F);
        this.tail4.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.0175F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 132, 108, 0.0F, 0.2032F, -0.4204F, 0, 1, 10, 0.0F, false));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(0.0F, -0.3011F, 0.0419F);
        this.tail4.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.0524F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 123, 60, -1.0F, -0.5F, -0.3F, 2, 3, 10, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.6989F, 9.3419F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1396F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 92, 15, -0.5F, -0.9453F, -0.3822F, 1, 2, 15, 0.0F, false));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(-0.5F, 0.1547F, 7.1178F);
        this.tail5.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0F, 0.0F, -0.4363F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 0, 29, -5.7F, -0.4F, -7.5F, 6, 0, 18, 0.0F, true));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(0.5F, 0.1547F, 7.1178F);
        this.tail5.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.0F, 0.0F, 0.4363F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 0, 29, -0.3F, -0.4F, -7.5F, 6, 0, 18, 0.0F, false));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(0.0F, -0.2453F, 14.6178F);
        this.tail5.addChild(cube_r96);
        this.setRotateAngle(cube_r96, -0.4363F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 41, 68, -5.5F, 0.0F, 0.0F, 11, 0, 11, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck3.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(neck3, 0.2826F, -0.1509F, -0.0436F);
        this.setRotateAngle(neck2, 0.245F, -0.072F, -0.018F);
        this.setRotateAngle(neck, -0.F, -0.0545F, 0.0159F);
        this.setRotateAngle(jaw, -0.3786F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(throat2, 0.2138F, 0.0F, 0.0F);
        this.neck3.offsetY = -0F;
        this.neck3.offsetX = -0F;
        this.neck3.offsetZ = 0.03F;
        this.neck3.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(throat2, 0.5323F, 0.0F, 0.0F);
        this.setRotateAngle(throat, 0.0829F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, -0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.0526F, 0.0959F, -0.005F);
        this.setRotateAngle(tail2, 0.3451F, 0.0452F, 0.0162F);
        this.setRotateAngle(tail, 0.0175F, 0.0698F, 0.0012F);
        this.setRotateAngle(rightUpperPropatagium, -0.4625F, 0.0F, 0.0F);
        this.setRotateAngle(rightSickleClaw, -0.4363F, -0.3054F, 0.0F);
        this.setRotateAngle(rightPropatagiumExtention, 1.2654F, 0.0F, 0.0F);
        this.setRotateAngle(rightLowerPropatagium, 0.6894F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, -1.1606F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 1.0428F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg1, -0.4145F, 0.0F, 0.0F);
        this.setRotateAngle(rightFoot, 0.5454F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm4, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm3, 0.9085F, 0.2903F, -0.0561F);
        this.setRotateAngle(rightArm2, -2.5482F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 0.9999F, -0.3757F, 0.4087F);
        this.setRotateAngle(neck3, 0.2826F, -0.1509F, -0.0436F);
        this.setRotateAngle(neck2, 0.245F, -0.072F, -0.018F);
        this.setRotateAngle(neck, -0.284F, -0.0545F, 0.0159F);
        this.setRotateAngle(leftUpperPropatagium, -0.4625F, 0.0F, 0.0F);
        this.setRotateAngle(leftSickleClaw, -0.4363F, 0.3054F, 0.0F);
        this.setRotateAngle(leftPropatagiumExtention, 1.2654F, 0.0F, 0.0F);
        this.setRotateAngle(leftLowerPropatagium, 0.6894F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, -0.8378F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 1.1388F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg1, -0.8334F, 0.0F, 0.0F);
        this.setRotateAngle(leftFoot, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm4, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm3, 0.9085F, -0.2903F, 0.0561F);
        this.setRotateAngle(leftArm2, -2.5482F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 0.9999F, 0.3757F, -0.4087F);
        this.setRotateAngle(jaw, -0.3743F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r96, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r95, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(cube_r94, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(cube_r93, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r92, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r91, -0.0524F, 0.0F, 0.4363F);
        this.setRotateAngle(cube_r90, -0.0524F, 0.0F, -0.4363F);
        this.setRotateAngle(cube_r9, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r89, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r88, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r87, -0.0087F, 0.0F, 0.5236F);
        this.setRotateAngle(cube_r86, -0.0087F, 0.0F, -0.5236F);
        this.setRotateAngle(cube_r85, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r84, 0.0F, 0.0F, 0.6981F);
        this.setRotateAngle(cube_r83, 0.0F, 0.0F, -0.6981F);
        this.setRotateAngle(cube_r82, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r81, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r80, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.8116F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r79, 0.2402F, 0.0352F, 0.0F);
        this.setRotateAngle(cube_r78, 0.7074F, 0.008F, 0.0283F);
        this.setRotateAngle(cube_r77, 1.2843F, 0.0478F, 0.0624F);
        this.setRotateAngle(cube_r76, 0.7074F, -0.008F, -0.0283F);
        this.setRotateAngle(cube_r75, 1.2843F, -0.0478F, -0.0624F);
        this.setRotateAngle(cube_r74, 0.6067F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r73, 0.6067F, 0.0352F, 0.0F);
        this.setRotateAngle(cube_r72, 0.7027F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r71, 1.7586F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r70, 0.61F, 0.1394F, 0.0641F);
        this.setRotateAngle(cube_r7, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r69, 0.706F, 0.1394F, 0.0641F);
        this.setRotateAngle(cube_r68, 0.7156F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r67, 0.706F, -0.1394F, -0.0641F);
        this.setRotateAngle(cube_r66, 0.61F, -0.1394F, -0.0641F);
        this.setRotateAngle(cube_r65, 0.8029F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r64, 0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r63, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r62, 0.8988F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r61, -0.1628F, 0.0198F, 0.0112F);
        this.setRotateAngle(cube_r60, -0.1628F, -0.0198F, -0.0112F);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r59, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r58, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r57, -0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r56, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r55, 0.3752F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r54, -0.1812F, 0.0291F, 0.0214F);
        this.setRotateAngle(cube_r53, 0.0943F, 0.0266F, -0.0194F);
        this.setRotateAngle(cube_r52, -1.0559F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r51, -1.5533F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r50, -1.4709F, 0.3146F, -0.0314F);
        this.setRotateAngle(cube_r5, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r49, -1.7276F, 0.7139F, -0.4867F);
        this.setRotateAngle(cube_r48, -1.6157F, 1.1089F, -0.1107F);
        this.setRotateAngle(cube_r47, -1.6157F, -1.1089F, 0.1107F);
        this.setRotateAngle(cube_r46, 2.0859F, 1.2282F, 3.1221F);
        this.setRotateAngle(cube_r45, 2.2815F, 1.3143F, -2.9566F);
        this.setRotateAngle(cube_r44, 2.2815F, -1.3143F, 2.9566F);
        this.setRotateAngle(cube_r43, 2.0859F, -1.2282F, -3.1221F);
        this.setRotateAngle(cube_r42, -1.7276F, -0.7139F, 0.4867F);
        this.setRotateAngle(cube_r41, -1.4709F, -0.3146F, 0.0314F);
        this.setRotateAngle(cube_r40, -0.053F, 0.1569F, -0.0083F);
        this.setRotateAngle(cube_r4, 0.2705F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, -0.053F, -0.1569F, 0.0083F);
        this.setRotateAngle(cube_r38, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, -0.1812F, -0.0291F, -0.0214F);
        this.setRotateAngle(cube_r36, 0.0943F, -0.0266F, 0.0194F);
        this.setRotateAngle(cube_r35, -1.4224F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r33, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, -0.8203F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, -0.5323F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.733F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, -0.5934F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.4974F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.7592F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.8116F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.2705F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.0F, -0.0698F, 0.0F);
        this.setRotateAngle(body, -0.0043F, -0.0263F, 0.0035F);
        this.hips.offsetY = -0.17F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.08F;
        this.hips.offsetX = 0.1F;
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

        EntityPrehistoricFloraUtahraptor EntityUtahraptor = (EntityPrehistoricFloraUtahraptor) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm3, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityUtahraptor.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityUtahraptor.getAnimation() == EntityUtahraptor.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityUtahraptor.isReallyInWater()) {

                if (f3 == 0.0F || !EntityUtahraptor.getIsMoving()) {
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

                if (EntityUtahraptor.getIsFast()) { //Running


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
        EntityPrehistoricFloraUtahraptor entity = (EntityPrehistoricFloraUtahraptor) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-6.97941-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (7.06361-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-23.53705-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -6.97941 + (((tickAnim - 6) / 3) * (20.08082-(-6.97941)));
            yy = 7.06361 + (((tickAnim - 6) / 3) * (1.67551-(7.06361)));
            zz = -23.53705 + (((tickAnim - 6) / 3) * (-15.38634-(-23.53705)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.08082 + (((tickAnim - 9) / 4) * (39.33709-(20.08082)));
            yy = 1.67551 + (((tickAnim - 9) / 4) * (-11.75148-(1.67551)));
            zz = -15.38634 + (((tickAnim - 9) / 4) * (4.21142-(-15.38634)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 39.33709 + (((tickAnim - 13) / 4) * (12.48315-(39.33709)));
            yy = -11.75148 + (((tickAnim - 13) / 4) * (-5.22288-(-11.75148)));
            zz = 4.21142 + (((tickAnim - 13) / 4) * (1.87174-(4.21142)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 12.48315 + (((tickAnim - 17) / 3) * (0-(12.48315)));
            yy = -5.22288 + (((tickAnim - 17) / 3) * (0-(-5.22288)));
            zz = 1.87174 + (((tickAnim - 17) / 3) * (0-(1.87174)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-10-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (17.25002-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (2.99318-(0)));
            zz = -10 + (((tickAnim - 6) / 3) * (-24.54589-(-10)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 17.25002 + (((tickAnim - 9) / 4) * (0-(17.25002)));
            yy = 2.99318 + (((tickAnim - 9) / 4) * (0-(2.99318)));
            zz = -24.54589 + (((tickAnim - 9) / 4) * (0-(-24.54589)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 17) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-13.08619-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-17.07228-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (3.90399-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -13.08619 + (((tickAnim - 6) / 3) * (-11.32897-(-13.08619)));
            yy = -17.07228 + (((tickAnim - 6) / 3) * (-16.59699-(-17.07228)));
            zz = 3.90399 + (((tickAnim - 6) / 3) * (6.46832-(3.90399)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -11.32897 + (((tickAnim - 9) / 4) * (-5.08916-(-11.32897)));
            yy = -16.59699 + (((tickAnim - 9) / 4) * (-1.98379-(-16.59699)));
            zz = 6.46832 + (((tickAnim - 9) / 4) * (18.8945-(6.46832)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -5.08916 + (((tickAnim - 13) / 4) * (12.73815-(-5.08916)));
            yy = -1.98379 + (((tickAnim - 13) / 4) * (-0.88168-(-1.98379)));
            zz = 18.8945 + (((tickAnim - 13) / 4) * (8.39756-(18.8945)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 12.73815 + (((tickAnim - 17) / 3) * (0-(12.73815)));
            yy = -0.88168 + (((tickAnim - 17) / 3) * (0-(-0.88168)));
            zz = 8.39756 + (((tickAnim - 17) / 3) * (0-(8.39756)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-2.22182-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (17.78674-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-8.22081-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -2.22182 + (((tickAnim - 6) / 3) * (21-(-2.22182)));
            yy = 17.78674 + (((tickAnim - 6) / 3) * (0-(17.78674)));
            zz = -8.22081 + (((tickAnim - 6) / 3) * (0-(-8.22081)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 21 + (((tickAnim - 9) / 4) * (3.18532-(21)));
            yy = 0 + (((tickAnim - 9) / 4) * (15.34045-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-6.06054-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 3.18532 + (((tickAnim - 13) / 4) * (22.1657-(3.18532)));
            yy = 15.34045 + (((tickAnim - 13) / 4) * (6.81798-(15.34045)));
            zz = -6.06054 + (((tickAnim - 13) / 4) * (-2.69357-(-6.06054)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 22.1657 + (((tickAnim - 17) / 3) * (0-(22.1657)));
            yy = 6.81798 + (((tickAnim - 17) / 3) * (0-(6.81798)));
            zz = -2.69357 + (((tickAnim - 17) / 3) * (0-(-2.69357)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.825-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.825 + (((tickAnim - 6) / 3) * (0-(0.825)));
            yy = 0 + (((tickAnim - 6) / 3) * (4.55-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (1.85-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0.95-(0)));
            yy = 4.55 + (((tickAnim - 9) / 4) * (1.075-(4.55)));
            zz = 1.85 + (((tickAnim - 9) / 4) * (0.325-(1.85)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.95 + (((tickAnim - 13) / 4) * (0.42-(0.95)));
            yy = 1.075 + (((tickAnim - 13) / 4) * (1.48-(1.075)));
            zz = 0.325 + (((tickAnim - 13) / 4) * (-0.81-(0.325)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0.42 + (((tickAnim - 17) / 3) * (0-(0.42)));
            yy = 1.48 + (((tickAnim - 17) / 3) * (0-(1.48)));
            zz = -0.81 + (((tickAnim - 17) / 3) * (0-(-0.81)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 0) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 6) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 6) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 6) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 6) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 6) / 3) * (1.7-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 9) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 4) * (1-(1)));
            zz = 1.7 + (((tickAnim - 9) / 4) * (1-(1.7)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 13) / 4) * (0.53-(1)));
            yy = 1 + (((tickAnim - 13) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 13) / 4) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0.53 + (((tickAnim - 17) / 3) * (1-(0.53)));
            yy = 1 + (((tickAnim - 17) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 17) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-2.7873-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-2.68507-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (12.2127-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -2.7873 + (((tickAnim - 6) / 3) * (-34.21674-(-2.7873)));
            yy = -2.68507 + (((tickAnim - 6) / 3) * (15.52828-(-2.68507)));
            zz = 12.2127 + (((tickAnim - 6) / 3) * (3.50205-(12.2127)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -34.21674 + (((tickAnim - 9) / 4) * (-3.40123-(-34.21674)));
            yy = 15.52828 + (((tickAnim - 9) / 4) * (30.63783-(15.52828)));
            zz = 3.50205 + (((tickAnim - 9) / 4) * (7.97047-(3.50205)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -3.40123 + (((tickAnim - 13) / 4) * (-21.51166-(-3.40123)));
            yy = 30.63783 + (((tickAnim - 13) / 4) * (13.61681-(30.63783)));
            zz = 7.97047 + (((tickAnim - 13) / 4) * (3.54243-(7.97047)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -21.51166 + (((tickAnim - 17) / 3) * (0-(-21.51166)));
            yy = 13.61681 + (((tickAnim - 17) / 3) * (0-(13.61681)));
            zz = 3.54243 + (((tickAnim - 17) / 3) * (0-(3.54243)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 25.75 + (((tickAnim - 6) / 3) * (0-(25.75)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.49294-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.32621-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.47864-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -7.49294 + (((tickAnim - 5) / 6) * (2.90891-(-7.49294)));
            yy = 0.32621 + (((tickAnim - 5) / 6) * (0.25439-(0.32621)));
            zz = 2.47864 + (((tickAnim - 5) / 6) * (-4.99354-(2.47864)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 2.90891 + (((tickAnim - 11) / 9) * (0-(2.90891)));
            yy = 0.25439 + (((tickAnim - 11) / 9) * (0-(0.25439)));
            zz = -4.99354 + (((tickAnim - 11) / 9) * (0-(-4.99354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 9) / 11) * (0-(22.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (8.62169-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (6.56761-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.81271-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 8.62169 + (((tickAnim - 8) / 12) * (0-(8.62169)));
            yy = 6.56761 + (((tickAnim - 8) / 12) * (0-(6.56761)));
            zz = -3.81271 + (((tickAnim - 8) / 12) * (0-(-3.81271)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 9) / 11) * (0-(22.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 8) / 12) * (0-(7.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (6-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-8-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 6 + (((tickAnim - 13) / 7) * (0-(6)));
            zz = -8 + (((tickAnim - 13) / 7) * (0-(-8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraUtahraptor entity = (EntityPrehistoricFloraUtahraptor) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2.12754-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.60609-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-3.44742-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 2.12754 + (((tickAnim - 6) / 7) * (9.91615-(2.12754)));
            yy = 0.60609 + (((tickAnim - 6) / 7) * (1.29876-(0.60609)));
            zz = -3.44742 + (((tickAnim - 6) / 7) * (-7.38733-(-3.44742)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 9.91615 + (((tickAnim - 13) / 13) * (10.99454-(9.91615)));
            yy = 1.29876 + (((tickAnim - 13) / 13) * (-0.26381-(1.29876)));
            zz = -7.38733 + (((tickAnim - 13) / 13) * (5.51329-(-7.38733)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 10.99454 + (((tickAnim - 26) / 8) * (3.7826-(10.99454)));
            yy = -0.26381 + (((tickAnim - 26) / 8) * (-0.15075-(-0.26381)));
            zz = 5.51329 + (((tickAnim - 26) / 8) * (3.15045-(5.51329)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 3.7826 + (((tickAnim - 34) / 10) * (2.3106-(3.7826)));
            yy = -0.15075 + (((tickAnim - 34) / 10) * (0.21092-(-0.15075)));
            zz = 3.15045 + (((tickAnim - 34) / 10) * (-5.56295-(3.15045)));
        }
        else if (tickAnim >= 44 && tickAnim < 62) {
            xx = 2.3106 + (((tickAnim - 44) / 18) * (1.18339-(2.3106)));
            yy = 0.21092 + (((tickAnim - 44) / 18) * (2.60738-(0.21092)));
            zz = -5.56295 + (((tickAnim - 44) / 18) * (-2.79455-(-5.56295)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 1.18339 + (((tickAnim - 62) / 6) * (0.7538-(1.18339)));
            yy = 2.60738 + (((tickAnim - 62) / 6) * (2.49243-(2.60738)));
            zz = -2.79455 + (((tickAnim - 62) / 6) * (-1.76111-(-2.79455)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0.7538 + (((tickAnim - 68) / 12) * (0-(0.7538)));
            yy = 2.49243 + (((tickAnim - 68) / 12) * (0-(2.49243)));
            zz = -1.76111 + (((tickAnim - 68) / 12) * (0-(-1.76111)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.3-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-3.4-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -1.3 + (((tickAnim - 13) / 13) * (1-(-1.3)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = -3.4 + (((tickAnim - 13) / 13) * (-0.5-(-3.4)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 26) / 8) * (0.2-(1)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = -0.5 + (((tickAnim - 26) / 8) * (0.5-(-0.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 0.2 + (((tickAnim - 34) / 10) * (1.32-(0.2)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0.5 + (((tickAnim - 34) / 10) * (1.01-(0.5)));
        }
        else if (tickAnim >= 44 && tickAnim < 62) {
            xx = 1.32 + (((tickAnim - 44) / 18) * (0.68-(1.32)));
            yy = 0 + (((tickAnim - 44) / 18) * (0.6-(0)));
            zz = 1.01 + (((tickAnim - 44) / 18) * (0.52-(1.01)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 0.68 + (((tickAnim - 62) / 18) * (0-(0.68)));
            yy = 0.6 + (((tickAnim - 62) / 18) * (0-(0.6)));
            zz = 0.52 + (((tickAnim - 62) / 18) * (0-(0.52)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 22.5 + (((tickAnim - 13) / 8) * (21.58335-(22.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (-1.79075-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (-10.01823-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 21.58335 + (((tickAnim - 21) / 7) * (30.79285-(21.58335)));
            yy = -1.79075 + (((tickAnim - 21) / 7) * (-0.27819-(-1.79075)));
            zz = -10.01823 + (((tickAnim - 21) / 7) * (-12.42797-(-10.01823)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 30.79285 + (((tickAnim - 28) / 7) * (14.59103-(30.79285)));
            yy = -0.27819 + (((tickAnim - 28) / 7) * (1.42343-(-0.27819)));
            zz = -12.42797 + (((tickAnim - 28) / 7) * (-15.13894-(-12.42797)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 14.59103 + (((tickAnim - 35) / 6) * (-4.65473-(14.59103)));
            yy = 1.42343 + (((tickAnim - 35) / 6) * (-14.76689-(1.42343)));
            zz = -15.13894 + (((tickAnim - 35) / 6) * (-2.66399-(-15.13894)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = -4.65473 + (((tickAnim - 41) / 6) * (7.31197-(-4.65473)));
            yy = -14.76689 + (((tickAnim - 41) / 6) * (-3.1622-(-14.76689)));
            zz = -2.66399 + (((tickAnim - 41) / 6) * (6.80423-(-2.66399)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 7.31197 + (((tickAnim - 47) / 6) * (12.98397-(7.31197)));
            yy = -3.1622 + (((tickAnim - 47) / 6) * (-2.37165-(-3.1622)));
            zz = 6.80423 + (((tickAnim - 47) / 6) * (5.10317-(6.80423)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = 12.98397 + (((tickAnim - 53) / 10) * (-6.73747-(12.98397)));
            yy = -2.37165 + (((tickAnim - 53) / 10) * (-1.50923-(-2.37165)));
            zz = 5.10317 + (((tickAnim - 53) / 10) * (3.24747-(5.10317)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = -6.73747 + (((tickAnim - 63) / 3) * (3.36295-(-6.73747)));
            yy = -1.50923 + (((tickAnim - 63) / 3) * (-0.02494-(-1.50923)));
            zz = 3.24747 + (((tickAnim - 63) / 3) * (-7.96105-(3.24747)));
        }
        else if (tickAnim >= 66 && tickAnim < 69) {
            xx = 3.36295 + (((tickAnim - 66) / 3) * (9.81663-(3.36295)));
            yy = -0.02494 + (((tickAnim - 66) / 3) * (1.79753-(-0.02494)));
            zz = -7.96105 + (((tickAnim - 66) / 3) * (-7.50383-(-7.96105)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = 9.81663 + (((tickAnim - 69) / 5) * (5.34985-(9.81663)));
            yy = 1.79753 + (((tickAnim - 69) / 5) * (0.5042-(1.79753)));
            zz = -7.50383 + (((tickAnim - 69) / 5) * (0.93838-(-7.50383)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = 5.34985 + (((tickAnim - 74) / 6) * (0-(5.34985)));
            yy = 0.5042 + (((tickAnim - 74) / 6) * (0-(0.5042)));
            zz = 0.93838 + (((tickAnim - 74) / 6) * (0-(0.93838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20.4-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 20.4 + (((tickAnim - 13) / 6) * (17.78-(20.4)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 17.78 + (((tickAnim - 19) / 9) * (5.11-(17.78)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 5.11 + (((tickAnim - 28) / 6) * (5-(5.11)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 34) / 6) * (-1.15-(5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -1.15 + (((tickAnim - 40) / 6) * (-23.36849-(-1.15)));
            yy = 0 + (((tickAnim - 40) / 6) * (-0.72951-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (-4.94663-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = -23.36849 + (((tickAnim - 46) / 17) * (-0.90529-(-23.36849)));
            yy = -0.72951 + (((tickAnim - 46) / 17) * (-0.34044-(-0.72951)));
            zz = -4.94663 + (((tickAnim - 46) / 17) * (-2.30843-(-4.94663)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = -0.90529 + (((tickAnim - 63) / 3) * (-18.06042-(-0.90529)));
            yy = -0.34044 + (((tickAnim - 63) / 3) * (-0.21075-(-0.34044)));
            zz = -2.30843 + (((tickAnim - 63) / 3) * (-1.42903-(-2.30843)));
        }
        else if (tickAnim >= 66 && tickAnim < 69) {
            xx = -18.06042 + (((tickAnim - 66) / 3) * (-8.81091-(-18.06042)));
            yy = -0.21075 + (((tickAnim - 66) / 3) * (-0.16116-(-0.21075)));
            zz = -1.42903 + (((tickAnim - 66) / 3) * (-1.09278-(-1.42903)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = -8.81091 + (((tickAnim - 69) / 11) * (0-(-8.81091)));
            yy = -0.16116 + (((tickAnim - 69) / 11) * (0-(-0.16116)));
            zz = -1.09278 + (((tickAnim - 69) / 11) * (0-(-1.09278)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 25.5 + (((tickAnim - 11) / 12) * (0-(25.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 41) / 6) * (25.5-(0)));
            yy = 0 + (((tickAnim - 41) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 63) {
            xx = 25.5 + (((tickAnim - 47) / 16) * (0-(25.5)));
            yy = 0 + (((tickAnim - 47) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 16) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 63) / 3) * (23.75-(0)));
            yy = 0 + (((tickAnim - 63) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 3) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 69) {
            xx = 23.75 + (((tickAnim - 66) / 3) * (0-(23.75)));
            yy = 0 + (((tickAnim - 66) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (2.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 6) / 7) * (5.71004-(2.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (1.48827-(0)));
            zz = 2.5 + (((tickAnim - 6) / 7) * (4.9792-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 5.71004 + (((tickAnim - 13) / 8) * (-12.25-(5.71004)));
            yy = 1.48827 + (((tickAnim - 13) / 8) * (0-(1.48827)));
            zz = 4.9792 + (((tickAnim - 13) / 8) * (0-(4.9792)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -12.25 + (((tickAnim - 21) / 5) * (-16.65412-(-12.25)));
            yy = 0 + (((tickAnim - 21) / 5) * (-3.72862-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (-2.94486-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -16.65412 + (((tickAnim - 26) / 8) * (-1.5-(-16.65412)));
            yy = -3.72862 + (((tickAnim - 26) / 8) * (0-(-3.72862)));
            zz = -2.94486 + (((tickAnim - 26) / 8) * (-2.5-(-2.94486)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -1.5 + (((tickAnim - 34) / 10) * (-1.16014-(-1.5)));
            yy = 0 + (((tickAnim - 34) / 10) * (0.3583-(0)));
            zz = -2.5 + (((tickAnim - 34) / 10) * (8.93473-(-2.5)));
        }
        else if (tickAnim >= 44 && tickAnim < 62) {
            xx = -1.16014 + (((tickAnim - 44) / 18) * (0-(-1.16014)));
            yy = 0.3583 + (((tickAnim - 44) / 18) * (0-(0.3583)));
            zz = 8.93473 + (((tickAnim - 44) / 18) * (3-(8.93473)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 3 + (((tickAnim - 62) / 6) * (2.25-(3)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 2.25 + (((tickAnim - 68) / 12) * (0-(2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -10.5 + (((tickAnim - 13) / 8) * (5.25-(-10.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 5.25 + (((tickAnim - 21) / 5) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 5.25 + (((tickAnim - 26) / 8) * (-5.5-(5.25)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -5.5 + (((tickAnim - 34) / 10) * (-4-(-5.5)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 62) {
            xx = -4 + (((tickAnim - 44) / 18) * (-4.79828-(-4)));
            yy = 0 + (((tickAnim - 44) / 18) * (-2.33339-(0)));
            zz = 0 + (((tickAnim - 44) / 18) * (0.89764-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = -4.79828 + (((tickAnim - 62) / 6) * (-2.91707-(-4.79828)));
            yy = -2.33339 + (((tickAnim - 62) / 6) * (-1.48488-(-2.33339)));
            zz = 0.89764 + (((tickAnim - 62) / 6) * (0.57122-(0.89764)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -2.91707 + (((tickAnim - 68) / 12) * (0-(-2.91707)));
            yy = -1.48488 + (((tickAnim - 68) / 12) * (0-(-1.48488)));
            zz = 0.57122 + (((tickAnim - 68) / 12) * (0-(0.57122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -15 + (((tickAnim - 13) / 8) * (17.59-(-15)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 17.59 + (((tickAnim - 21) / 5) * (17.59-(17.59)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 17.59 + (((tickAnim - 26) / 8) * (-5.59-(17.59)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -5.59 + (((tickAnim - 34) / 10) * (-6.54-(-5.59)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 62) {
            xx = -6.54 + (((tickAnim - 44) / 18) * (-1.36-(-6.54)));
            yy = 0 + (((tickAnim - 44) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 18) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = -1.36 + (((tickAnim - 62) / 18) * (0-(-1.36)));
            yy = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 7.5 + (((tickAnim - 13) / 8) * (-22.1-(7.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -22.1 + (((tickAnim - 21) / 5) * (-17.85-(-22.1)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -17.85 + (((tickAnim - 26) / 8) * (7.36-(-17.85)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 80) {
            xx = 7.36 + (((tickAnim - 34) / 46) * (0-(7.36)));
            yy = 0 + (((tickAnim - 34) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 8) * (0.45-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (-0.825-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0.45 + (((tickAnim - 21) / 5) * (0-(0.45)));
            zz = -0.825 + (((tickAnim - 21) / 5) * (0-(-0.825)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (2.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 6) / 7) * (5.71004-(2.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (1.48827-(0)));
            zz = 2.5 + (((tickAnim - 6) / 7) * (4.9792-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 5.71004 + (((tickAnim - 13) / 8) * (-12.25-(5.71004)));
            yy = 1.48827 + (((tickAnim - 13) / 8) * (0-(1.48827)));
            zz = 4.9792 + (((tickAnim - 13) / 8) * (0-(4.9792)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -12.25 + (((tickAnim - 21) / 5) * (-16.65412-(-12.25)));
            yy = 0 + (((tickAnim - 21) / 5) * (-3.72862-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (-2.94486-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -16.65412 + (((tickAnim - 26) / 8) * (-1.5-(-16.65412)));
            yy = -3.72862 + (((tickAnim - 26) / 8) * (0-(-3.72862)));
            zz = -2.94486 + (((tickAnim - 26) / 8) * (-2.5-(-2.94486)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -1.5 + (((tickAnim - 34) / 10) * (-1.16014-(-1.5)));
            yy = 0 + (((tickAnim - 34) / 10) * (0.3583-(0)));
            zz = -2.5 + (((tickAnim - 34) / 10) * (8.93473-(-2.5)));
        }
        else if (tickAnim >= 44 && tickAnim < 62) {
            xx = -1.16014 + (((tickAnim - 44) / 18) * (0-(-1.16014)));
            yy = 0.3583 + (((tickAnim - 44) / 18) * (0-(0.3583)));
            zz = 8.93473 + (((tickAnim - 44) / 18) * (2.5-(8.93473)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 2.5 + (((tickAnim - 62) / 6) * (2-(2.5)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 2 + (((tickAnim - 68) / 12) * (0-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -10.5 + (((tickAnim - 13) / 8) * (5.25-(-10.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 5.25 + (((tickAnim - 21) / 5) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 5.25 + (((tickAnim - 26) / 8) * (-5.5-(5.25)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -5.5 + (((tickAnim - 34) / 10) * (-4-(-5.5)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 62) {
            xx = -4 + (((tickAnim - 44) / 18) * (-6.00316-(-4)));
            yy = 0 + (((tickAnim - 44) / 18) * (-2.99206-(0)));
            zz = 0 + (((tickAnim - 44) / 18) * (1.26946-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = -6.00316 + (((tickAnim - 62) / 6) * (-3.81295-(-6.00316)));
            yy = -2.99206 + (((tickAnim - 62) / 6) * (-1.20299-(-2.99206)));
            zz = 1.26946 + (((tickAnim - 62) / 6) * (0.54121-(1.26946)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -3.81295 + (((tickAnim - 68) / 12) * (0-(-3.81295)));
            yy = -1.20299 + (((tickAnim - 68) / 12) * (0-(-1.20299)));
            zz = 0.54121 + (((tickAnim - 68) / 12) * (0-(0.54121)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -15 + (((tickAnim - 13) / 8) * (17.59-(-15)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 17.59 + (((tickAnim - 21) / 5) * (17.59-(17.59)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 17.59 + (((tickAnim - 26) / 8) * (-5.59-(17.59)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -5.59 + (((tickAnim - 34) / 10) * (-6.54-(-5.59)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -6.54 + (((tickAnim - 44) / 36) * (0-(-6.54)));
            yy = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 7.5 + (((tickAnim - 13) / 8) * (-22.1-(7.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -22.1 + (((tickAnim - 21) / 5) * (-17.85-(-22.1)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -17.85 + (((tickAnim - 26) / 8) * (7.36-(-17.85)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 80) {
            xx = 7.36 + (((tickAnim - 34) / 46) * (0-(7.36)));
            yy = 0 + (((tickAnim - 34) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = -1.4 + (((tickAnim - 13) / 8) * (0.45-(-1.4)));
            zz = 0 + (((tickAnim - 13) / 8) * (-0.825-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0.45 + (((tickAnim - 21) / 5) * (1.15-(0.45)));
            zz = -0.825 + (((tickAnim - 21) / 5) * (0-(-0.825)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 1.15 + (((tickAnim - 26) / 8) * (0.85-(1.15)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            yy = 0.85 + (((tickAnim - 34) / 10) * (0-(0.85)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = -5 + (((tickAnim - 12) / 14) * (5-(-5)));
            yy = 0 + (((tickAnim - 12) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 14) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 26) / 14) * (-1.31-(5)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = -1.31 + (((tickAnim - 40) / 9) * (3.99-(-1.31)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 80) {
            xx = 3.99 + (((tickAnim - 49) / 31) * (0-(3.99)));
            yy = 0 + (((tickAnim - 49) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = 12.5 + (((tickAnim - 28) / 15) * (2.5-(12.5)));
            yy = 0 + (((tickAnim - 28) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 15) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 43) / 37) * (0-(2.5)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.6358-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (6.14687-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (4.08052-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = 11.6358 + (((tickAnim - 13) / 19) * (20.10967-(11.6358)));
            yy = 6.14687 + (((tickAnim - 13) / 19) * (0.84826-(6.14687)));
            zz = 4.08052 + (((tickAnim - 13) / 19) * (-22.8148-(4.08052)));
        }
        else if (tickAnim >= 32 && tickAnim < 80) {
            xx = 20.10967 + (((tickAnim - 32) / 48) * (0-(20.10967)));
            yy = 0.84826 + (((tickAnim - 32) / 48) * (0-(0.84826)));
            zz = -22.8148 + (((tickAnim - 32) / 48) * (0-(-22.8148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 44) {
            xx = 27.5 + (((tickAnim - 18) / 26) * (27.78527-(27.5)));
            yy = 0 + (((tickAnim - 18) / 26) * (7.89936-(0)));
            zz = 0 + (((tickAnim - 18) / 26) * (0.28153-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 54) {
            xx = 27.78527 + (((tickAnim - 44) / 10) * (8.74145-(27.78527)));
            yy = 7.89936 + (((tickAnim - 44) / 10) * (-3.22673-(7.89936)));
            zz = 0.28153 + (((tickAnim - 44) / 10) * (-11.10294-(0.28153)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 8.74145 + (((tickAnim - 54) / 26) * (0-(8.74145)));
            yy = -3.22673 + (((tickAnim - 54) / 26) * (0-(-3.22673)));
            zz = -11.10294 + (((tickAnim - 54) / 26) * (0-(-11.10294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -22.5 + (((tickAnim - 20) / 60) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 12.5 + (((tickAnim - 20) / 60) * (0-(12.5)));
            yy = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (41.83-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 41.83 + (((tickAnim - 28) / 5) * (42.65-(41.83)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 42.65 + (((tickAnim - 33) / 10) * (-12.5-(42.65)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -12.5 + (((tickAnim - 43) / 5) * (-1.54-(-12.5)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 64) {
            xx = -1.54 + (((tickAnim - 48) / 16) * (-30-(-1.54)));
            yy = 0 + (((tickAnim - 48) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 16) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 73) {
            xx = -30 + (((tickAnim - 64) / 9) * (-1.69538-(-30)));
            yy = 0 + (((tickAnim - 64) / 9) * (-0.22317-(0)));
            zz = 0 + (((tickAnim - 64) / 9) * (-7.4967-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -1.69538 + (((tickAnim - 73) / 7) * (0-(-1.69538)));
            yy = -0.22317 + (((tickAnim - 73) / 7) * (0-(-0.22317)));
            zz = -7.4967 + (((tickAnim - 73) / 7) * (0-(-7.4967)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 48) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 16) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 48) / 16) * (0.95-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 64) / 16) * (0-(0)));
            yy = -1.1 + (((tickAnim - 64) / 16) * (0-(-1.1)));
            zz = 0.95 + (((tickAnim - 64) / 16) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (-7.99-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = -7.99 + (((tickAnim - 31) / 12) * (20-(-7.99)));
            yy = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 20 + (((tickAnim - 43) / 5) * (10.38-(20)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 64) {
            xx = 10.38 + (((tickAnim - 48) / 16) * (32.5-(10.38)));
            yy = 0 + (((tickAnim - 48) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 16) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 73) {
            xx = 32.5 + (((tickAnim - 64) / 9) * (2.88725-(32.5)));
            yy = 0 + (((tickAnim - 64) / 9) * (0.12601-(0)));
            zz = 0 + (((tickAnim - 64) / 9) * (-2.49682-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 2.88725 + (((tickAnim - 73) / 7) * (0-(2.88725)));
            yy = 0.12601 + (((tickAnim - 73) / 7) * (0-(0.12601)));
            zz = -2.49682 + (((tickAnim - 73) / 7) * (0-(-2.49682)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 41 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 41) / 6) * (10-(0)));
            yy = 0 + (((tickAnim - 41) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 63) {
            xx = 10 + (((tickAnim - 47) / 16) * (0-(10)));
            yy = 0 + (((tickAnim - 47) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 41 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 41) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 6) * (0.7-(0)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 47) / 16) * (0-(0)));
            yy = 0.7 + (((tickAnim - 47) / 16) * (0-(0.7)));
            zz = 0 + (((tickAnim - 47) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 18) / 12) * (3.28255-(10)));
            yy = -7.5 + (((tickAnim - 18) / 12) * (2.98929-(-7.5)));
            zz = 0 + (((tickAnim - 18) / 12) * (6.23899-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 3.28255 + (((tickAnim - 30) / 10) * (-2.68664-(3.28255)));
            yy = 2.98929 + (((tickAnim - 30) / 10) * (9.76061-(2.98929)));
            zz = 6.23899 + (((tickAnim - 30) / 10) * (-2.18558-(6.23899)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.68664 + (((tickAnim - 40) / 40) * (0-(-2.68664)));
            yy = 9.76061 + (((tickAnim - 40) / 40) * (0-(9.76061)));
            zz = -2.18558 + (((tickAnim - 40) / 40) * (0-(-2.18558)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraUtahraptor entity = (EntityPrehistoricFloraUtahraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (10.32609-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-3.26087-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 10.32609 + (((tickAnim - 11) / 11) * (2.5-(10.32609)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = -3.26087 + (((tickAnim - 11) / 11) * (-7.5-(-3.26087)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 2.5 + (((tickAnim - 22) / 11) * (9.41667-(2.5)));
            yy = 0 + (((tickAnim - 22) / 11) * (-11.45946-(0)));
            zz = -7.5 + (((tickAnim - 22) / 11) * (-10.86207-(-7.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 9.41667 + (((tickAnim - 33) / 10) * (4.30093-(9.41667)));
            yy = -11.45946 + (((tickAnim - 33) / 10) * (-5.29162-(-11.45946)));
            zz = -10.86207 + (((tickAnim - 33) / 10) * (-7.66056-(-10.86207)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 4.30093 + (((tickAnim - 43) / 7) * (0-(4.30093)));
            yy = -5.29162 + (((tickAnim - 43) / 7) * (0-(-5.29162)));
            zz = -7.66056 + (((tickAnim - 43) / 7) * (0-(-7.66056)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.14-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.43-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (-1.1-(0)));
            yy = -0.14 + (((tickAnim - 8) / 10) * (2-(-0.14)));
            zz = 1.43 + (((tickAnim - 8) / 10) * (3-(1.43)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -1.1 + (((tickAnim - 18) / 11) * (-2.6-(-1.1)));
            yy = 2 + (((tickAnim - 18) / 11) * (0.81-(2)));
            zz = 3 + (((tickAnim - 18) / 11) * (6-(3)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = -2.6 + (((tickAnim - 29) / 10) * (-1.36-(-2.6)));
            yy = 0.81 + (((tickAnim - 29) / 10) * (-0.18-(0.81)));
            zz = 6 + (((tickAnim - 29) / 10) * (3.13-(6)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -1.36 + (((tickAnim - 39) / 11) * (0-(-1.36)));
            yy = -0.18 + (((tickAnim - 39) / 11) * (0-(-0.18)));
            zz = 3.13 + (((tickAnim - 39) / 11) * (0-(3.13)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (-45.74287-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-24.72738-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (6.63782-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -45.74287 + (((tickAnim - 8) / 7) * (54.56288-(-45.74287)));
            yy = -24.72738 + (((tickAnim - 8) / 7) * (-30.53975-(-24.72738)));
            zz = 6.63782 + (((tickAnim - 8) / 7) * (-11.54944-(6.63782)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 54.56288 + (((tickAnim - 15) / 8) * (-33.82099-(54.56288)));
            yy = -30.53975 + (((tickAnim - 15) / 8) * (-20.47729-(-30.53975)));
            zz = -11.54944 + (((tickAnim - 15) / 8) * (21.17901-(-11.54944)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -33.82099 + (((tickAnim - 23) / 7) * (32.27293-(-33.82099)));
            yy = -20.47729 + (((tickAnim - 23) / 7) * (-19.03727-(-20.47729)));
            zz = 21.17901 + (((tickAnim - 23) / 7) * (-1.37987-(21.17901)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 32.27293 + (((tickAnim - 30) / 8) * (-28.0118-(32.27293)));
            yy = -19.03727 + (((tickAnim - 30) / 8) * (-20.41029-(-19.03727)));
            zz = -1.37987 + (((tickAnim - 30) / 8) * (5.17801-(-1.37987)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -28.0118 + (((tickAnim - 38) / 12) * (0-(-28.0118)));
            yy = -20.41029 + (((tickAnim - 38) / 12) * (0-(-20.41029)));
            zz = 5.17801 + (((tickAnim - 38) / 12) * (0-(5.17801)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (46.95045-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-19.17613-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.43512-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 46.95045 + (((tickAnim - 8) / 10) * (56.0564-(46.95045)));
            yy = -19.17613 + (((tickAnim - 8) / 10) * (-31.33814-(-19.17613)));
            zz = -0.43512 + (((tickAnim - 8) / 10) * (-7.60186-(-0.43512)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 56.0564 + (((tickAnim - 18) / 6) * (20.19037-(56.0564)));
            yy = -31.33814 + (((tickAnim - 18) / 6) * (-19.6016-(-31.33814)));
            zz = -7.60186 + (((tickAnim - 18) / 6) * (-1.443-(-7.60186)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 20.19037 + (((tickAnim - 24) / 7) * (36.93396-(20.19037)));
            yy = -19.6016 + (((tickAnim - 24) / 7) * (-4.51162-(-19.6016)));
            zz = -1.443 + (((tickAnim - 24) / 7) * (6.4756-(-1.443)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 36.93396 + (((tickAnim - 31) / 19) * (0-(36.93396)));
            yy = -4.51162 + (((tickAnim - 31) / 19) * (0-(-4.51162)));
            zz = 6.4756 + (((tickAnim - 31) / 19) * (0-(6.4756)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.36201-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-8.77911-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.22653-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -12.36201 + (((tickAnim - 10) / 8) * (2.94313-(-12.36201)));
            yy = -8.77911 + (((tickAnim - 10) / 8) * (-15.27106-(-8.77911)));
            zz = 4.22653 + (((tickAnim - 10) / 8) * (0.4526-(4.22653)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 2.94313 + (((tickAnim - 18) / 6) * (-15.55244-(2.94313)));
            yy = -15.27106 + (((tickAnim - 18) / 6) * (-9.05394-(-15.27106)));
            zz = 0.4526 + (((tickAnim - 18) / 6) * (0.55844-(0.4526)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = -15.55244 + (((tickAnim - 24) / 7) * (-21.61624-(-15.55244)));
            yy = -9.05394 + (((tickAnim - 24) / 7) * (5.752-(-9.05394)));
            zz = 0.55844 + (((tickAnim - 24) / 7) * (-3.78355-(0.55844)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = -21.61624 + (((tickAnim - 31) / 5) * (-22.51261-(-21.61624)));
            yy = 5.752 + (((tickAnim - 31) / 5) * (6.76114-(5.752)));
            zz = -3.78355 + (((tickAnim - 31) / 5) * (-4.397-(-3.78355)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = -22.51261 + (((tickAnim - 36) / 6) * (-23.6035-(-22.51261)));
            yy = 6.76114 + (((tickAnim - 36) / 6) * (-9.37375-(6.76114)));
            zz = -4.397 + (((tickAnim - 36) / 6) * (-2.51116-(-4.397)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -23.6035 + (((tickAnim - 42) / 8) * (0-(-23.6035)));
            yy = -9.37375 + (((tickAnim - 42) / 8) * (0-(-9.37375)));
            zz = -2.51116 + (((tickAnim - 42) / 8) * (0-(-2.51116)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 35 + (((tickAnim - 8) / 7) * (-16.18-(35)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -16.18 + (((tickAnim - 15) / 3) * (26.02-(-16.18)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 26.02 + (((tickAnim - 18) / 5) * (33.06-(26.02)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 33.06 + (((tickAnim - 23) / 15) * (23-(33.06)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 23 + (((tickAnim - 38) / 12) * (0-(23)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (17.02-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 17.02 + (((tickAnim - 23) / 7) * (21.02-(17.02)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 21.02 + (((tickAnim - 30) / 8) * (-32.92-(21.02)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -32.92 + (((tickAnim - 38) / 5) * (-4.75-(-32.92)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 43) / 7) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (112.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 112.5 + (((tickAnim - 8) / 3) * (25-(112.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 25 + (((tickAnim - 11) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (67.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 67.5 + (((tickAnim - 18) / 10) * (15-(67.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 15 + (((tickAnim - 28) / 7) * (37.5-(15)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 35) / 15) * (0-(37.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (17.25-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 17.25 + (((tickAnim - 28) / 7) * (21-(17.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 21 + (((tickAnim - 35) / 6) * (24.83-(21)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 24.83 + (((tickAnim - 41) / 9) * (0-(24.83)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (2.37-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (1.67-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 2.37 + (((tickAnim - 24) / 4) * (3.725-(2.37)));
            zz = 1.67 + (((tickAnim - 24) / 4) * (2.15-(1.67)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            yy = 3.725 + (((tickAnim - 28) / 0) * (4.08-(3.725)));
            zz = 2.15 + (((tickAnim - 28) / 0) * (2.425-(2.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 4.08 + (((tickAnim - 28) / 7) * (3.295-(4.08)));
            zz = 2.425 + (((tickAnim - 28) / 7) * (1.28-(2.425)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = 3.295 + (((tickAnim - 35) / 6) * (2.86-(3.295)));
            zz = 1.28 + (((tickAnim - 35) / 6) * (0.005-(1.28)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 2.86 + (((tickAnim - 41) / 9) * (0-(2.86)));
            zz = 0.005 + (((tickAnim - 41) / 9) * (0-(0.005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 18 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 18) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 18) / 10) * (1.6-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 28) / 0) * (1-(1)));
            yy = 1 + (((tickAnim - 28) / 0) * (1-(1)));
            zz = 1.6 + (((tickAnim - 28) / 0) * (1.7-(1.6)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 28) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 28) / 22) * (1-(1)));
            zz = 1.7 + (((tickAnim - 28) / 22) * (1-(1.7)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0.65426-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-4.95712-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-7.52832-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 0.65426 + (((tickAnim - 11) / 17) * (-0.43564-(0.65426)));
            yy = -4.95712 + (((tickAnim - 11) / 17) * (-2.481-(-4.95712)));
            zz = -7.52832 + (((tickAnim - 11) / 17) * (4.99993-(-7.52832)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -0.43564 + (((tickAnim - 28) / 12) * (-0.20148-(-0.43564)));
            yy = -2.481 + (((tickAnim - 28) / 12) * (3.85489-(-2.481)));
            zz = 4.99993 + (((tickAnim - 28) / 12) * (2.2901-(4.99993)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -0.20148 + (((tickAnim - 40) / 10) * (0-(-0.20148)));
            yy = 3.85489 + (((tickAnim - 40) / 10) * (0-(3.85489)));
            zz = 2.2901 + (((tickAnim - 40) / 10) * (0-(2.2901)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 17) / 23) * (3.76282-(12.5)));
            yy = -7.5 + (((tickAnim - 17) / 23) * (5.23393-(-7.5)));
            zz = 0 + (((tickAnim - 17) / 23) * (0.49118-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.76282 + (((tickAnim - 40) / 10) * (0-(3.76282)));
            yy = 5.23393 + (((tickAnim - 40) / 10) * (0-(5.23393)));
            zz = 0.49118 + (((tickAnim - 40) / 10) * (0-(0.49118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 12.5 + (((tickAnim - 9) / 12) * (13.97-(12.5)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 13.97 + (((tickAnim - 21) / 12) * (0-(13.97)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-11.69-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -11.69 + (((tickAnim - 21) / 7) * (-29.5-(-11.69)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -29.5 + (((tickAnim - 28) / 5) * (-20.15874-(-29.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (7.04533-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (-2.57816-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -20.15874 + (((tickAnim - 33) / 17) * (0-(-20.15874)));
            yy = 7.04533 + (((tickAnim - 33) / 17) * (0-(7.04533)));
            zz = -2.57816 + (((tickAnim - 33) / 17) * (0-(-2.57816)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-11.32682-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.68821-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.0942-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -11.32682 + (((tickAnim - 8) / 3) * (-14.63883-(-11.32682)));
            yy = -1.68821 + (((tickAnim - 8) / 3) * (-2.43854-(-1.68821)));
            zz = 3.0942 + (((tickAnim - 8) / 3) * (4.46943-(3.0942)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -14.63883 + (((tickAnim - 11) / 7) * (-10.07753-(-14.63883)));
            yy = -2.43854 + (((tickAnim - 11) / 7) * (-1.99847-(-2.43854)));
            zz = 4.46943 + (((tickAnim - 11) / 7) * (4.89987-(4.46943)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -10.07753 + (((tickAnim - 18) / 4) * (-10.66423-(-10.07753)));
            yy = -1.99847 + (((tickAnim - 18) / 4) * (-1.72343-(-1.99847)));
            zz = 4.89987 + (((tickAnim - 18) / 4) * (5.1689-(4.89987)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -10.66423 + (((tickAnim - 22) / 7) * (-16.72989-(-10.66423)));
            yy = -1.72343 + (((tickAnim - 22) / 7) * (7.65134-(-1.72343)));
            zz = 5.1689 + (((tickAnim - 22) / 7) * (3.8451-(5.1689)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -16.72989 + (((tickAnim - 29) / 4) * (-18.28438-(-16.72989)));
            yy = 7.65134 + (((tickAnim - 29) / 4) * (13.88765-(7.65134)));
            zz = 3.8451 + (((tickAnim - 29) / 4) * (4.94711-(3.8451)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -18.28438 + (((tickAnim - 33) / 6) * (-18.36136-(-18.28438)));
            yy = 13.88765 + (((tickAnim - 33) / 6) * (8.5947-(13.88765)));
            zz = 4.94711 + (((tickAnim - 33) / 6) * (5.24082-(4.94711)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -18.36136 + (((tickAnim - 39) / 4) * (-17.63784-(-18.36136)));
            yy = 8.5947 + (((tickAnim - 39) / 4) * (7.90002-(8.5947)));
            zz = 5.24082 + (((tickAnim - 39) / 4) * (5.61307-(5.24082)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -17.63784 + (((tickAnim - 43) / 7) * (0-(-17.63784)));
            yy = 7.90002 + (((tickAnim - 43) / 7) * (0-(7.90002)));
            zz = 5.61307 + (((tickAnim - 43) / 7) * (0-(5.61307)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.77-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0.77 + (((tickAnim - 8) / 10) * (-9.05-(0.77)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -9.05 + (((tickAnim - 18) / 4) * (-5-(-9.05)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -5 + (((tickAnim - 22) / 7) * (-4.79-(-5)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -4.79 + (((tickAnim - 29) / 4) * (0-(-4.79)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (8.33-(0)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 8.33 + (((tickAnim - 39) / 4) * (10-(8.33)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 43) / 7) * (0-(10)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.63-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -1.63 + (((tickAnim - 8) / 3) * (1.25-(-1.63)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 1.25 + (((tickAnim - 11) / 7) * (12.6-(1.25)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 12.6 + (((tickAnim - 18) / 4) * (7.5-(12.6)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 7.5 + (((tickAnim - 22) / 7) * (2.68-(7.5)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 2.68 + (((tickAnim - 29) / 4) * (-1-(2.68)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -1 + (((tickAnim - 33) / 6) * (4.79-(-1)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 4.79 + (((tickAnim - 39) / 4) * (12.5-(4.79)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 43) / 7) * (0-(12.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 11) / 7) * (-2.85-(5)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -2.85 + (((tickAnim - 18) / 4) * (8.49-(-2.85)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 8.49 + (((tickAnim - 22) / 7) * (11.36-(8.49)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 11.36 + (((tickAnim - 29) / 4) * (10.08-(11.36)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 10.08 + (((tickAnim - 33) / 10) * (-10-(10.08)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 43) / 7) * (0-(-10)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-77.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -77.5 + (((tickAnim - 7) / 6) * (-25-(-77.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -25 + (((tickAnim - 13) / 4) * (30.23-(-25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 30.23 + (((tickAnim - 17) / 7) * (-33.88-(30.23)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -33.88 + (((tickAnim - 24) / 6) * (41.27-(-33.88)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 41.27 + (((tickAnim - 30) / 20) * (0-(41.27)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.70535-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.6426-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-29.53476-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 21.70535 + (((tickAnim - 20) / 14) * (31.4556-(21.70535)));
            yy = -8.6426 + (((tickAnim - 20) / 14) * (-4.56137-(-8.6426)));
            zz = -29.53476 + (((tickAnim - 20) / 14) * (-15.58779-(-29.53476)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 31.4556 + (((tickAnim - 34) / 16) * (0-(31.4556)));
            yy = -4.56137 + (((tickAnim - 34) / 16) * (0-(-4.56137)));
            zz = -15.58779 + (((tickAnim - 34) / 16) * (0-(-15.58779)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 20) / 30) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-15.40581-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (3.7431-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-43.07896-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -15.40581 + (((tickAnim - 8) / 8) * (-11.72767-(-15.40581)));
            yy = 3.7431 + (((tickAnim - 8) / 8) * (-0.43452-(3.7431)));
            zz = -43.07896 + (((tickAnim - 8) / 8) * (-43.38864-(-43.07896)));
        }
        else if (tickAnim >= 16 && tickAnim < 29) {
            xx = -11.72767 + (((tickAnim - 16) / 13) * (-8.03848-(-11.72767)));
            yy = -0.43452 + (((tickAnim - 16) / 13) * (2.59853-(-0.43452)));
            zz = -43.38864 + (((tickAnim - 16) / 13) * (-40.04646-(-43.38864)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = -8.03848 + (((tickAnim - 29) / 10) * (-4.4221-(-8.03848)));
            yy = 2.59853 + (((tickAnim - 29) / 10) * (-17.34739-(2.59853)));
            zz = -40.04646 + (((tickAnim - 29) / 10) * (19.23187-(-40.04646)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -4.4221 + (((tickAnim - 39) / 11) * (0-(-4.4221)));
            yy = -17.34739 + (((tickAnim - 39) / 11) * (0-(-17.34739)));
            zz = 19.23187 + (((tickAnim - 39) / 11) * (0-(19.23187)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperPropatagium, leftUpperPropatagium.rotateAngleX + (float) Math.toRadians(xx), leftUpperPropatagium.rotateAngleY + (float) Math.toRadians(yy), leftUpperPropatagium.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 25 + (((tickAnim - 16) / 9) * (35.79-(25)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 35.79 + (((tickAnim - 25) / 10) * (-8.53-(35.79)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.53 + (((tickAnim - 35) / 15) * (0-(-8.53)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 25) / 25) * (0-(-10)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerPropatagium, leftLowerPropatagium.rotateAngleX + (float) Math.toRadians(xx), leftLowerPropatagium.rotateAngleY + (float) Math.toRadians(yy), leftLowerPropatagium.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-28.59-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = -28.59 + (((tickAnim - 17) / 16) * (12.5-(-28.59)));
            yy = 0 + (((tickAnim - 17) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 16) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 33) / 17) * (0-(12.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraUtahraptor entity = (EntityPrehistoricFloraUtahraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.49168-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-8.65222-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.27788-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -0.49168 + (((tickAnim - 6) / 10) * (-1.75378-(-0.49168)));
            yy = -8.65222 + (((tickAnim - 6) / 10) * (-9.84655-(-8.65222)));
            zz = 1.27788 + (((tickAnim - 6) / 10) * (10.15108-(1.27788)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -1.75378 + (((tickAnim - 16) / 9) * (-8.44105-(-1.75378)));
            yy = -9.84655 + (((tickAnim - 16) / 9) * (-5.28352-(-9.84655)));
            zz = 10.15108 + (((tickAnim - 16) / 9) * (5.44692-(10.15108)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = -8.44105 + (((tickAnim - 25) / 16) * (-3.60895-(-8.44105)));
            yy = -5.28352 + (((tickAnim - 25) / 16) * (-3.85659-(-5.28352)));
            zz = 5.44692 + (((tickAnim - 25) / 16) * (12.13739-(5.44692)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -3.60895 + (((tickAnim - 41) / 9) * (0-(-3.60895)));
            yy = -3.85659 + (((tickAnim - 41) / 9) * (0-(-3.85659)));
            zz = 12.13739 + (((tickAnim - 41) / 9) * (0-(12.13739)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-3.09-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (6.65-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            yy = -3.09 + (((tickAnim - 6) / 10) * (-13-(-3.09)));
            zz = 6.65 + (((tickAnim - 6) / 10) * (13-(6.65)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            yy = -13 + (((tickAnim - 16) / 19) * (-13.98-(-13)));
            zz = 13 + (((tickAnim - 16) / 19) * (15-(13)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -13.98 + (((tickAnim - 35) / 15) * (0-(-13.98)));
            zz = 15 + (((tickAnim - 35) / 15) * (0-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-71.7111-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (26.65617-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-10.65133-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -71.7111 + (((tickAnim - 16) / 9) * (-72.88922-(-71.7111)));
            yy = 26.65617 + (((tickAnim - 16) / 9) * (32.18529-(26.65617)));
            zz = -10.65133 + (((tickAnim - 16) / 9) * (-12.86067-(-10.65133)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -72.88922 + (((tickAnim - 25) / 10) * (-64.05684-(-72.88922)));
            yy = 32.18529 + (((tickAnim - 25) / 10) * (24.58628-(32.18529)));
            zz = -12.86067 + (((tickAnim - 25) / 10) * (-8.02372-(-12.86067)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -64.05684 + (((tickAnim - 35) / 6) * (-44.86185-(-64.05684)));
            yy = 24.58628 + (((tickAnim - 35) / 6) * (24.62329-(24.58628)));
            zz = -8.02372 + (((tickAnim - 35) / 6) * (-11.98987-(-8.02372)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -44.86185 + (((tickAnim - 41) / 9) * (0-(-44.86185)));
            yy = 24.62329 + (((tickAnim - 41) / 9) * (0-(24.62329)));
            zz = -11.98987 + (((tickAnim - 41) / 9) * (0-(-11.98987)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (44.23-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 44.23 + (((tickAnim - 16) / 9) * (45.85-(44.23)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 45.85 + (((tickAnim - 25) / 10) * (33.82-(45.85)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 33.82 + (((tickAnim - 35) / 6) * (30.17-(33.82)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 30.17 + (((tickAnim - 41) / 9) * (0-(30.17)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (40.95425-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-5.22576-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (1.65672-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 40.95425 + (((tickAnim - 16) / 9) * (42.35832-(40.95425)));
            yy = -5.22576 + (((tickAnim - 16) / 9) * (-7.15102-(-5.22576)));
            zz = 1.65672 + (((tickAnim - 16) / 9) * (2.26708-(1.65672)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 42.35832 + (((tickAnim - 25) / 10) * (59.92494-(42.35832)));
            yy = -7.15102 + (((tickAnim - 25) / 10) * (-3.78582-(-7.15102)));
            zz = 2.26708 + (((tickAnim - 25) / 10) * (1.20022-(2.26708)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 59.92494 + (((tickAnim - 35) / 6) * (31.6208-(59.92494)));
            yy = -3.78582 + (((tickAnim - 35) / 6) * (-2.31356-(-3.78582)));
            zz = 1.20022 + (((tickAnim - 35) / 6) * (0.73347-(1.20022)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 31.6208 + (((tickAnim - 41) / 9) * (0-(31.6208)));
            yy = -2.31356 + (((tickAnim - 41) / 9) * (0-(-2.31356)));
            zz = 0.73347 + (((tickAnim - 41) / 9) * (0-(0.73347)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-32.78-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-5.9-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.33-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -32.78 + (((tickAnim - 6) / 10) * (-86.2519-(-32.78)));
            yy = -5.9 + (((tickAnim - 6) / 10) * (-16.02617-(-5.9)));
            zz = -0.33 + (((tickAnim - 6) / 10) * (-0.89539-(-0.33)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -86.2519 + (((tickAnim - 16) / 9) * (-82.12773-(-86.2519)));
            yy = -16.02617 + (((tickAnim - 16) / 9) * (-19.3505-(-16.02617)));
            zz = -0.89539 + (((tickAnim - 16) / 9) * (-1.08113-(-0.89539)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -82.12773 + (((tickAnim - 25) / 10) * (-87.61388-(-82.12773)));
            yy = -19.3505 + (((tickAnim - 25) / 10) * (-15.74056-(-19.3505)));
            zz = -1.08113 + (((tickAnim - 25) / 10) * (-7.09455-(-1.08113)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -87.61388 + (((tickAnim - 35) / 6) * (-54.70457-(-87.61388)));
            yy = -15.74056 + (((tickAnim - 35) / 6) * (-24.7635-(-15.74056)));
            zz = -7.09455 + (((tickAnim - 35) / 6) * (-7.69672-(-7.09455)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = -54.70457 + (((tickAnim - 41) / 5) * (-29.8659-(-54.70457)));
            yy = -24.7635 + (((tickAnim - 41) / 5) * (-11.25622-(-24.7635)));
            zz = -7.69672 + (((tickAnim - 41) / 5) * (-3.49853-(-7.69672)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -29.8659 + (((tickAnim - 46) / 4) * (0-(-29.8659)));
            yy = -11.25622 + (((tickAnim - 46) / 4) * (0-(-11.25622)));
            zz = -3.49853 + (((tickAnim - 46) / 4) * (0-(-3.49853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (18.43-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 18.43 + (((tickAnim - 6) / 10) * (41.48-(18.43)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 41.48 + (((tickAnim - 16) / 9) * (42.76-(41.48)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 42.76 + (((tickAnim - 25) / 10) * (47.42-(42.76)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 47.42 + (((tickAnim - 35) / 6) * (40.6-(47.42)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 40.6 + (((tickAnim - 41) / 5) * (30.95-(40.6)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 30.95 + (((tickAnim - 46) / 4) * (0-(30.95)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 1.75 + (((tickAnim - 6) / 10) * (4.75-(1.75)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 4.75 + (((tickAnim - 16) / 9) * (7.5-(4.75)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 25) / 10) * (1.79-(7.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 1.79 + (((tickAnim - 35) / 6) * (-15.92-(1.79)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -15.92 + (((tickAnim - 41) / 9) * (0-(-15.92)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (11.4-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.93-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.61-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 11.4 + (((tickAnim - 6) / 10) * (30.95-(11.4)));
            yy = 1.93 + (((tickAnim - 6) / 10) * (5.23-(1.93)));
            zz = -0.61 + (((tickAnim - 6) / 10) * (-1.66-(-0.61)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 30.95 + (((tickAnim - 16) / 9) * (37.37-(30.95)));
            yy = 5.23 + (((tickAnim - 16) / 9) * (6.31-(5.23)));
            zz = -1.66 + (((tickAnim - 16) / 9) * (-2-(-1.66)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 37.37 + (((tickAnim - 25) / 10) * (42.42-(37.37)));
            yy = 6.31 + (((tickAnim - 25) / 10) * (3.78-(6.31)));
            zz = -2 + (((tickAnim - 25) / 10) * (-1.2-(-2)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 42.42 + (((tickAnim - 35) / 6) * (26.2-(42.42)));
            yy = 3.78 + (((tickAnim - 35) / 6) * (2.31-(3.78)));
            zz = -1.2 + (((tickAnim - 35) / 6) * (-0.73-(-1.2)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 26.2 + (((tickAnim - 41) / 9) * (0-(26.2)));
            yy = 2.31 + (((tickAnim - 41) / 9) * (0-(2.31)));
            zz = -0.73 + (((tickAnim - 41) / 9) * (0-(-0.73)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (27.14233-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (4.59902-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-8.88927-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 27.14233 + (((tickAnim - 18) / 7) * (22.60212-(27.14233)));
            yy = 4.59902 + (((tickAnim - 18) / 7) * (-1.13203-(4.59902)));
            zz = -8.88927 + (((tickAnim - 18) / 7) * (-3.60244-(-8.88927)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 22.60212 + (((tickAnim - 25) / 11) * (15.62394-(22.60212)));
            yy = -1.13203 + (((tickAnim - 25) / 11) * (0.91467-(-1.13203)));
            zz = -3.60244 + (((tickAnim - 25) / 11) * (-4.9152-(-3.60244)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 15.62394 + (((tickAnim - 36) / 5) * (20.45755-(15.62394)));
            yy = 0.91467 + (((tickAnim - 36) / 5) * (-0.84589-(0.91467)));
            zz = -4.9152 + (((tickAnim - 36) / 5) * (-10.93496-(-4.9152)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 20.45755 + (((tickAnim - 41) / 9) * (0-(20.45755)));
            yy = -0.84589 + (((tickAnim - 41) / 9) * (0-(-0.84589)));
            zz = -10.93496 + (((tickAnim - 41) / 9) * (0-(-10.93496)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 10 + (((tickAnim - 21) / 4) * (0.04687-(10)));
            yy = 0 + (((tickAnim - 21) / 4) * (-2.03376-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0.04687 + (((tickAnim - 25) / 10) * (20.62031-(0.04687)));
            yy = -2.03376 + (((tickAnim - 25) / 10) * (-3.74141-(-2.03376)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 20.62031 + (((tickAnim - 35) / 6) * (-18.42023-(20.62031)));
            yy = -3.74141 + (((tickAnim - 35) / 6) * (-4.73755-(-3.74141)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -18.42023 + (((tickAnim - 41) / 9) * (0-(-18.42023)));
            yy = -4.73755 + (((tickAnim - 41) / 9) * (0-(-4.73755)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-8.44637-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (2.3717-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.79082-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = -8.44637 + (((tickAnim - 9) / 14) * (10-(-8.44637)));
            yy = 2.3717 + (((tickAnim - 9) / 14) * (2.5-(2.3717)));
            zz = -0.79082 + (((tickAnim - 9) / 14) * (0-(-0.79082)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 23) / 7) * (17.27273-(10)));
            yy = 2.5 + (((tickAnim - 23) / 7) * (1.81818-(2.5)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 17.27273 + (((tickAnim - 30) / 12) * (-0.7197-(17.27273)));
            yy = 1.81818 + (((tickAnim - 30) / 12) * (0.75758-(1.81818)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -0.7197 + (((tickAnim - 42) / 8) * (0-(-0.7197)));
            yy = 0.75758 + (((tickAnim - 42) / 8) * (0-(0.75758)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -32.5 + (((tickAnim - 21) / 4) * (-14.03-(-32.5)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -14.03 + (((tickAnim - 25) / 11) * (-20-(-14.03)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = -20 + (((tickAnim - 36) / 5) * (4.56-(-20)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 4.56 + (((tickAnim - 41) / 9) * (0-(4.56)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 36) {
            xx = 20 + (((tickAnim - 21) / 15) * (-1.39-(20)));
            yy = 0 + (((tickAnim - 21) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 15) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = -1.39 + (((tickAnim - 36) / 5) * (-14.36-(-1.39)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -14.36 + (((tickAnim - 41) / 9) * (0-(-14.36)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -15 + (((tickAnim - 16) / 9) * (-13.27-(-15)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -13.27 + (((tickAnim - 25) / 10) * (-25-(-13.27)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -25 + (((tickAnim - 35) / 6) * (-15-(-25)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 41) / 9) * (0-(-15)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.50246-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.25401-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.75901-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -8.50246 + (((tickAnim - 10) / 13) * (-5-(-8.50246)));
            yy = 0.25401 + (((tickAnim - 10) / 13) * (2.5-(0.25401)));
            zz = 1.75901 + (((tickAnim - 10) / 13) * (0-(1.75901)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -5 + (((tickAnim - 23) / 8) * (2.27273-(-5)));
            yy = 2.5 + (((tickAnim - 23) / 8) * (1.81818-(2.5)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 2.27273 + (((tickAnim - 31) / 12) * (-0.7197-(2.27273)));
            yy = 1.81818 + (((tickAnim - 31) / 12) * (0.75758-(1.81818)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.7197 + (((tickAnim - 43) / 7) * (0-(-0.7197)));
            yy = 0.75758 + (((tickAnim - 43) / 7) * (0-(0.75758)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (6.53498-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-2.29295-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (1.08587-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 6.53498 + (((tickAnim - 11) / 13) * (10-(6.53498)));
            yy = -2.29295 + (((tickAnim - 11) / 13) * (2.5-(-2.29295)));
            zz = 1.08587 + (((tickAnim - 11) / 13) * (0-(1.08587)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 10 + (((tickAnim - 24) / 8) * (17.27273-(10)));
            yy = 2.5 + (((tickAnim - 24) / 8) * (1.81818-(2.5)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 17.27273 + (((tickAnim - 32) / 11) * (-0.7197-(17.27273)));
            yy = 1.81818 + (((tickAnim - 32) / 11) * (0.75758-(1.81818)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.7197 + (((tickAnim - 43) / 7) * (0-(-0.7197)));
            yy = 0.75758 + (((tickAnim - 43) / 7) * (0-(0.75758)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (16.50438-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-4.74295-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (1.58435-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 16.50438 + (((tickAnim - 12) / 13) * (0-(16.50438)));
            yy = -4.74295 + (((tickAnim - 12) / 13) * (2.5-(-4.74295)));
            zz = 1.58435 + (((tickAnim - 12) / 13) * (0-(1.58435)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (17.27273-(0)));
            yy = 2.5 + (((tickAnim - 25) / 8) * (1.81818-(2.5)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 17.27273 + (((tickAnim - 33) / 11) * (-0.7197-(17.27273)));
            yy = 1.81818 + (((tickAnim - 33) / 11) * (0.75758-(1.81818)));
            zz = 0 + (((tickAnim - 33) / 11) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -0.7197 + (((tickAnim - 44) / 6) * (0-(-0.7197)));
            yy = 0.75758 + (((tickAnim - 44) / 6) * (0-(0.75758)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (9.00438-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.74295-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.58435-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 9.00438 + (((tickAnim - 13) / 13) * (-2.5-(9.00438)));
            yy = -4.74295 + (((tickAnim - 13) / 13) * (2.5-(-4.74295)));
            zz = 1.58435 + (((tickAnim - 13) / 13) * (0-(1.58435)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -2.5 + (((tickAnim - 26) / 7) * (17.27273-(-2.5)));
            yy = 2.5 + (((tickAnim - 26) / 7) * (1.81818-(2.5)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 17.27273 + (((tickAnim - 33) / 12) * (-8.2197-(17.27273)));
            yy = 1.81818 + (((tickAnim - 33) / 12) * (0.75758-(1.81818)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -8.2197 + (((tickAnim - 45) / 5) * (0-(-8.2197)));
            yy = 0.75758 + (((tickAnim - 45) / 5) * (0-(0.75758)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 36 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 36) / 5) * (21.75-(0)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 41) / 9) * (0-(21.75)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 5) * (2.15-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0.15-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 2.15 + (((tickAnim - 41) / 9) * (0-(2.15)));
            zz = 0.15 + (((tickAnim - 41) / 9) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 0) / 36) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 36) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 36) * (1-(1)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 1 + (((tickAnim - 36) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 36) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 36) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 41) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 41) / 9) * (1-(1)));
            zz = 1.2 + (((tickAnim - 41) / 9) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -7.5 + (((tickAnim - 18) / 15) * (0.49062-(-7.5)));
            yy = 7.5 + (((tickAnim - 18) / 15) * (3.50461-(7.5)));
            zz = 0 + (((tickAnim - 18) / 15) * (-5.15706-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.49062 + (((tickAnim - 33) / 17) * (0-(0.49062)));
            yy = 3.50461 + (((tickAnim - 33) / 17) * (0-(3.50461)));
            zz = -5.15706 + (((tickAnim - 33) / 17) * (0-(-5.15706)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = -7.5 + (((tickAnim - 29) / 8) * (-6.29996-(-7.5)));
            yy = 5 + (((tickAnim - 29) / 8) * (4.39999-(5)));
            zz = 0 + (((tickAnim - 29) / 8) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -6.29996 + (((tickAnim - 37) / 5) * (7.00001-(-6.29996)));
            yy = 4.39999 + (((tickAnim - 37) / 5) * (3.19999-(4.39999)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 7.00001 + (((tickAnim - 42) / 4) * (-4-(7.00001)));
            yy = 3.19999 + (((tickAnim - 42) / 4) * (1.6-(3.19999)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 46) / 4) * (0-(-4)));
            yy = 1.6 + (((tickAnim - 46) / 4) * (0-(1.6)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (32.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 15) / 11) * (-1.27445-(0)));
            yy = 0 + (((tickAnim - 15) / 11) * (3.52753-(0)));
            zz = 32.5 + (((tickAnim - 15) / 11) * (38.70619-(32.5)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -1.27445 + (((tickAnim - 26) / 7) * (-5.9078-(-1.27445)));
            yy = 3.52753 + (((tickAnim - 26) / 7) * (-12.82259-(3.52753)));
            zz = 38.70619 + (((tickAnim - 26) / 7) * (13.45174-(38.70619)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -5.9078 + (((tickAnim - 33) / 7) * (5.93522-(-5.9078)));
            yy = -12.82259 + (((tickAnim - 33) / 7) * (-1.23549-(-12.82259)));
            zz = 13.45174 + (((tickAnim - 33) / 7) * (0.65334-(13.45174)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 5.93522 + (((tickAnim - 40) / 10) * (0-(5.93522)));
            yy = -1.23549 + (((tickAnim - 40) / 10) * (0-(-1.23549)));
            zz = 0.65334 + (((tickAnim - 40) / 10) * (0-(0.65334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.89081-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-13.17873-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-37.6157-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -6.89081 + (((tickAnim - 10) / 4) * (-1.27445-(-6.89081)));
            yy = -13.17873 + (((tickAnim - 10) / 4) * (-3.52753-(-13.17873)));
            zz = -37.6157 + (((tickAnim - 10) / 4) * (-33.76619-(-37.6157)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -1.27445 + (((tickAnim - 14) / 9) * (-6.3062-(-1.27445)));
            yy = -3.52753 + (((tickAnim - 14) / 9) * (1.38605-(-3.52753)));
            zz = -33.76619 + (((tickAnim - 14) / 9) * (-34.78728-(-33.76619)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -6.3062 + (((tickAnim - 23) / 11) * (4.02829-(-6.3062)));
            yy = 1.38605 + (((tickAnim - 23) / 11) * (14.735-(1.38605)));
            zz = -34.78728 + (((tickAnim - 23) / 11) * (-36.58337-(-34.78728)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 4.02829 + (((tickAnim - 34) / 9) * (19.40813-(4.02829)));
            yy = 14.735 + (((tickAnim - 34) / 9) * (6.97971-(14.735)));
            zz = -36.58337 + (((tickAnim - 34) / 9) * (-17.32889-(-36.58337)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 19.40813 + (((tickAnim - 43) / 7) * (0-(19.40813)));
            yy = 6.97971 + (((tickAnim - 43) / 7) * (0-(6.97971)));
            zz = -17.32889 + (((tickAnim - 43) / 7) * (0-(-17.32889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 23) / 17) * (-24.55-(15)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -24.55 + (((tickAnim - 40) / 10) * (0-(-24.55)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraUtahraptor entity = (EntityPrehistoricFloraUtahraptor) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (7.74793-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-6.77413-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-4.521-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 34) {
            xx = 7.74793 + (((tickAnim - 12) / 22) * (-7.14999-(7.74793)));
            yy = -6.77413 + (((tickAnim - 12) / 22) * (5.97835-(-6.77413)));
            zz = -4.521 + (((tickAnim - 12) / 22) * (4.43612-(-4.521)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -7.14999 + (((tickAnim - 34) / 3) * (-3.805-(-7.14999)));
            yy = 5.97835 + (((tickAnim - 34) / 3) * (6.58417-(5.97835)));
            zz = 4.43612 + (((tickAnim - 34) / 3) * (4.20306-(4.43612)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = -3.805 + (((tickAnim - 37) / 2) * (-6.46-(-3.805)));
            yy = 6.58417 + (((tickAnim - 37) / 2) * (8.19-(6.58417)));
            zz = 4.20306 + (((tickAnim - 37) / 2) * (4.47-(4.20306)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = -6.46 + (((tickAnim - 39) / 2) * (-3.228-(-6.46)));
            yy = 8.19 + (((tickAnim - 39) / 2) * (9.594-(8.19)));
            zz = 4.47 + (((tickAnim - 39) / 2) * (4.014-(4.47)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -3.228 + (((tickAnim - 41) / 2) * (-5.88-(-3.228)));
            yy = 9.594 + (((tickAnim - 41) / 2) * (11.6-(9.594)));
            zz = 4.014 + (((tickAnim - 41) / 2) * (3.28-(4.014)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -5.88 + (((tickAnim - 43) / 3) * (-2.53286-(-5.88)));
            yy = 11.6 + (((tickAnim - 43) / 3) * (13.10429-(11.6)));
            zz = 3.28 + (((tickAnim - 43) / 3) * (2.24429-(3.28)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = -2.53286 + (((tickAnim - 46) / 3) * (-5.07-(-2.53286)));
            yy = 13.10429 + (((tickAnim - 46) / 3) * (14.91-(13.10429)));
            zz = 2.24429 + (((tickAnim - 46) / 3) * (0.23-(2.24429)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = -5.07 + (((tickAnim - 49) / 3) * (-1.725-(-5.07)));
            yy = 14.91 + (((tickAnim - 49) / 3) * (15.815-(14.91)));
            zz = 0.23 + (((tickAnim - 49) / 3) * (-2.005-(0.23)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = -1.725 + (((tickAnim - 52) / 2) * (-4.38-(-1.725)));
            yy = 15.815 + (((tickAnim - 52) / 2) * (16.92-(15.815)));
            zz = -2.005 + (((tickAnim - 52) / 2) * (-4.64-(-2.005)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = -4.38 + (((tickAnim - 54) / 3) * (-1.03286-(-4.38)));
            yy = 16.92 + (((tickAnim - 54) / 3) * (17.92429-(16.92)));
            zz = -4.64 + (((tickAnim - 54) / 3) * (-6.67571-(-4.64)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -1.03286 + (((tickAnim - 57) / 3) * (-3.57-(-1.03286)));
            yy = 17.92429 + (((tickAnim - 57) / 3) * (18.13-(17.92429)));
            zz = -6.67571 + (((tickAnim - 57) / 3) * (-11.09-(-6.67571)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -3.57 + (((tickAnim - 60) / 3) * (-0.22511-(-3.57)));
            yy = 18.13 + (((tickAnim - 60) / 3) * (18.2303-(18.13)));
            zz = -11.09 + (((tickAnim - 60) / 3) * (-13.12298-(-11.09)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = -0.22511 + (((tickAnim - 63) / 2) * (-2.88022-(-0.22511)));
            yy = 18.2303 + (((tickAnim - 63) / 2) * (17.5306-(18.2303)));
            zz = -13.12298 + (((tickAnim - 63) / 2) * (-14.15596-(-13.12298)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -2.88022 + (((tickAnim - 65) / 15) * (0-(-2.88022)));
            yy = 17.5306 + (((tickAnim - 65) / 15) * (0-(17.5306)));
            zz = -14.15596 + (((tickAnim - 65) / 15) * (0-(-14.15596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 24.5 + (((tickAnim - 15) / 4) * (35.46-(24.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 35.46 + (((tickAnim - 19) / 8) * (16-(35.46)));
            yy = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.51-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.025-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 1.51 + (((tickAnim - 15) / 4) * (2.565-(1.51)));
            zz = -1.025 + (((tickAnim - 15) / 4) * (-1.585-(-1.025)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            yy = 2.565 + (((tickAnim - 19) / 8) * (1.175-(2.565)));
            zz = -1.585 + (((tickAnim - 19) / 8) * (0-(-1.585)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 15) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 15) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 15) / 4) * (1.2-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 19) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 19) / 8) * (1-(1)));
            zz = 1.2 + (((tickAnim - 19) / 8) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 12.5 + (((tickAnim - 8) / 10) * (-30-(12.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -30 + (((tickAnim - 18) / 14) * (10.77-(-30)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 10.77 + (((tickAnim - 32) / 2) * (4.63-(10.77)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 4.63 + (((tickAnim - 34) / 3) * (8.49-(4.63)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 8.49 + (((tickAnim - 37) / 1) * (2.73-(8.49)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 2.73 + (((tickAnim - 38) / 3) * (6.59-(2.73)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 6.59 + (((tickAnim - 41) / 2) * (0.45-(6.59)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 0.45 + (((tickAnim - 43) / 4) * (3.94-(0.45)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 49) {
            xx = 3.94 + (((tickAnim - 47) / 2) * (-2.19-(3.94)));
            yy = 0 + (((tickAnim - 47) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 2) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = -2.19 + (((tickAnim - 49) / 3) * (1.67-(-2.19)));
            yy = 0 + (((tickAnim - 49) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 3) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = 1.67 + (((tickAnim - 52) / 2) * (-4.47-(1.67)));
            yy = 0 + (((tickAnim - 52) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 2) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = -4.47 + (((tickAnim - 54) / 4) * (-0.98-(-4.47)));
            yy = 0 + (((tickAnim - 54) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -0.98 + (((tickAnim - 58) / 2) * (-7.12-(-0.98)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -7.12 + (((tickAnim - 60) / 3) * (-3.26-(-7.12)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -3.26 + (((tickAnim - 63) / 17) * (0-(-3.26)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 27) / 10) * (26.5-(0)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 26.5 + (((tickAnim - 37) / 2) * (0-(26.5)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (26.5-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 26.5 + (((tickAnim - 42) / 1) * (0-(26.5)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (26.5-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 26.5 + (((tickAnim - 46) / 2) * (0-(26.5)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 48) / 4) * (26.5-(0)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = 26.5 + (((tickAnim - 52) / 2) * (0-(26.5)));
            yy = 0 + (((tickAnim - 52) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 2) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 54) / 3) * (26.5-(0)));
            yy = 0 + (((tickAnim - 54) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 3) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 26.5 + (((tickAnim - 57) / 2) * (0-(26.5)));
            yy = 0 + (((tickAnim - 57) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 2) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 59) / 4) * (26.5-(0)));
            yy = 0 + (((tickAnim - 59) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 4) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 26.5 + (((tickAnim - 63) / 2) * (0-(26.5)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.74793-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (6.62587-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (2.479-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 7.74793 + (((tickAnim - 13) / 22) * (0.25001-(7.74793)));
            yy = 6.62587 + (((tickAnim - 13) / 22) * (0.17835-(6.62587)));
            zz = 2.479 + (((tickAnim - 13) / 22) * (3.03612-(2.479)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0.25001 + (((tickAnim - 35) / 3) * (6.595-(0.25001)));
            yy = 0.17835 + (((tickAnim - 35) / 3) * (2.18417-(0.17835)));
            zz = 3.03612 + (((tickAnim - 35) / 3) * (2.80306-(3.03612)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 6.595 + (((tickAnim - 38) / 2) * (0.94-(6.595)));
            yy = 2.18417 + (((tickAnim - 38) / 2) * (4.69-(2.18417)));
            zz = 2.80306 + (((tickAnim - 38) / 2) * (2.27-(2.80306)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0.94 + (((tickAnim - 40) / 2) * (7.172-(0.94)));
            yy = 4.69 + (((tickAnim - 40) / 2) * (6.694-(4.69)));
            zz = 2.27 + (((tickAnim - 40) / 2) * (1.514-(2.27)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 7.172 + (((tickAnim - 42) / 2) * (1.52-(7.172)));
            yy = 6.694 + (((tickAnim - 42) / 2) * (7.9-(6.694)));
            zz = 1.514 + (((tickAnim - 42) / 2) * (0.38-(1.514)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 1.52 + (((tickAnim - 44) / 3) * (7.86714-(1.52)));
            yy = 7.9 + (((tickAnim - 44) / 3) * (8.90429-(7.9)));
            zz = 0.38 + (((tickAnim - 44) / 3) * (-0.35571-(0.38)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 7.86714 + (((tickAnim - 47) / 3) * (2.33-(7.86714)));
            yy = 8.90429 + (((tickAnim - 47) / 3) * (9.01-(8.90429)));
            zz = -0.35571 + (((tickAnim - 47) / 3) * (-1.47-(-0.35571)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 2.33 + (((tickAnim - 50) / 3) * (8.675-(2.33)));
            yy = 9.01 + (((tickAnim - 50) / 3) * (8.315-(9.01)));
            zz = -1.47 + (((tickAnim - 50) / 3) * (-2.605-(-1.47)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 8.675 + (((tickAnim - 53) / 2) * (3.02-(8.675)));
            yy = 8.315 + (((tickAnim - 53) / 2) * (7.62-(8.315)));
            zz = -2.605 + (((tickAnim - 53) / 2) * (-3.54-(-2.605)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 3.02 + (((tickAnim - 55) / 3) * (9.36714-(3.02)));
            yy = 7.62 + (((tickAnim - 55) / 3) * (6.92429-(7.62)));
            zz = -3.54 + (((tickAnim - 55) / 3) * (-3.87571-(-3.54)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 9.36714 + (((tickAnim - 58) / 3) * (3.83-(9.36714)));
            yy = 6.92429 + (((tickAnim - 58) / 3) * (6.13-(6.92429)));
            zz = -3.87571 + (((tickAnim - 58) / 3) * (-4.29-(-3.87571)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = 3.83 + (((tickAnim - 61) / 2) * (10.17489-(3.83)));
            yy = 6.13 + (((tickAnim - 61) / 2) * (5.4303-(6.13)));
            zz = -4.29 + (((tickAnim - 61) / 2) * (-4.42298-(-4.29)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 10.17489 + (((tickAnim - 63) / 4) * (4.51978-(10.17489)));
            yy = 5.4303 + (((tickAnim - 63) / 4) * (4.0306-(5.4303)));
            zz = -4.42298 + (((tickAnim - 63) / 4) * (-4.35596-(-4.42298)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = 4.51978 + (((tickAnim - 67) / 13) * (0-(4.51978)));
            yy = 4.0306 + (((tickAnim - 67) / 13) * (0-(4.0306)));
            zz = -4.35596 + (((tickAnim - 67) / 13) * (0-(-4.35596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.74793-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (6.62587-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (2.479-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 36) {
            xx = 7.74793 + (((tickAnim - 13) / 23) * (-8.54999-(7.74793)));
            yy = 6.62587 + (((tickAnim - 13) / 23) * (9.07835-(6.62587)));
            zz = 2.479 + (((tickAnim - 13) / 23) * (1.53612-(2.479)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -8.54999 + (((tickAnim - 36) / 2) * (-3.205-(-8.54999)));
            yy = 9.07835 + (((tickAnim - 36) / 2) * (8.98417-(9.07835)));
            zz = 1.53612 + (((tickAnim - 36) / 2) * (1.20306-(1.53612)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -3.205 + (((tickAnim - 38) / 3) * (-7.86-(-3.205)));
            yy = 8.98417 + (((tickAnim - 38) / 3) * (7.69-(8.98417)));
            zz = 1.20306 + (((tickAnim - 38) / 3) * (1.17-(1.20306)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -7.86 + (((tickAnim - 41) / 2) * (-2.628-(-7.86)));
            yy = 7.69 + (((tickAnim - 41) / 2) * (5.594-(7.69)));
            zz = 1.17 + (((tickAnim - 41) / 2) * (1.714-(1.17)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -2.628 + (((tickAnim - 43) / 2) * (-7.28-(-2.628)));
            yy = 5.594 + (((tickAnim - 43) / 2) * (1.5-(5.594)));
            zz = 1.714 + (((tickAnim - 43) / 2) * (2.28-(1.714)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -7.28 + (((tickAnim - 45) / 3) * (-1.93286-(-7.28)));
            yy = 1.5 + (((tickAnim - 45) / 3) * (0.70429-(1.5)));
            zz = 2.28 + (((tickAnim - 45) / 3) * (2.94429-(2.28)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = -1.93286 + (((tickAnim - 48) / 3) * (-6.47-(-1.93286)));
            yy = 0.70429 + (((tickAnim - 48) / 3) * (-0.79-(0.70429)));
            zz = 2.94429 + (((tickAnim - 48) / 3) * (4.23-(2.94429)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = -6.47 + (((tickAnim - 51) / 2) * (-1.125-(-6.47)));
            yy = -0.79 + (((tickAnim - 51) / 2) * (-1.685-(-0.79)));
            zz = 4.23 + (((tickAnim - 51) / 2) * (5.095-(4.23)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = -1.125 + (((tickAnim - 53) / 3) * (-5.78-(-1.125)));
            yy = -1.685 + (((tickAnim - 53) / 3) * (-2.78-(-1.685)));
            zz = 5.095 + (((tickAnim - 53) / 3) * (5.86-(5.095)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = -5.78 + (((tickAnim - 56) / 2) * (-0.43286-(-5.78)));
            yy = -2.78 + (((tickAnim - 56) / 2) * (-4.37571-(-2.78)));
            zz = 5.86 + (((tickAnim - 56) / 2) * (7.02429-(5.86)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = -0.43286 + (((tickAnim - 58) / 4) * (-4.97-(-0.43286)));
            yy = -4.37571 + (((tickAnim - 58) / 4) * (-5.97-(-4.37571)));
            zz = 7.02429 + (((tickAnim - 58) / 4) * (7.51-(7.02429)));
        }
        else if (tickAnim >= 62 && tickAnim < 64) {
            xx = -4.97 + (((tickAnim - 62) / 2) * (0.37489-(-4.97)));
            yy = -5.97 + (((tickAnim - 62) / 2) * (-6.9697-(-5.97)));
            zz = 7.51 + (((tickAnim - 62) / 2) * (7.67702-(7.51)));
        }
        else if (tickAnim >= 64 && tickAnim < 67) {
            xx = 0.37489 + (((tickAnim - 64) / 3) * (-4.28022-(0.37489)));
            yy = -6.9697 + (((tickAnim - 64) / 3) * (-6.9694-(-6.9697)));
            zz = 7.67702 + (((tickAnim - 64) / 3) * (7.44404-(7.67702)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = -4.28022 + (((tickAnim - 67) / 13) * (0-(-4.28022)));
            yy = -6.9694 + (((tickAnim - 67) / 13) * (0-(-6.9694)));
            zz = 7.44404 + (((tickAnim - 67) / 13) * (0-(7.44404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraUtahraptor entity = (EntityPrehistoricFloraUtahraptor) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -27.5 + (((tickAnim - 17) / 7) * (-21.30208-(-27.5)));
            yy = 32.5 + (((tickAnim - 17) / 7) * (18.10337-(32.5)));
            zz = 0 + (((tickAnim - 17) / 7) * (-2.02018-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -21.30208 + (((tickAnim - 24) / 14) * (-13.76571-(-21.30208)));
            yy = 18.10337 + (((tickAnim - 24) / 14) * (11.19984-(18.10337)));
            zz = -2.02018 + (((tickAnim - 24) / 14) * (5.13651-(-2.02018)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -13.76571 + (((tickAnim - 38) / 6) * (12.21639-(-13.76571)));
            yy = 11.19984 + (((tickAnim - 38) / 6) * (-14.64518-(11.19984)));
            zz = 5.13651 + (((tickAnim - 38) / 6) * (-0.97564-(5.13651)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 12.21639 + (((tickAnim - 44) / 9) * (0.642-(12.21639)));
            yy = -14.64518 + (((tickAnim - 44) / 9) * (-37.81998-(-14.64518)));
            zz = -0.97564 + (((tickAnim - 44) / 9) * (1.28209-(-0.97564)));
        }
        else if (tickAnim >= 53 && tickAnim < 61) {
            xx = 0.642 + (((tickAnim - 53) / 8) * (9.10932-(0.642)));
            yy = -37.81998 + (((tickAnim - 53) / 8) * (-46.64956-(-37.81998)));
            zz = 1.28209 + (((tickAnim - 53) / 8) * (-0.07384-(1.28209)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 9.10932 + (((tickAnim - 61) / 17) * (5.25338-(9.10932)));
            yy = -46.64956 + (((tickAnim - 61) / 17) * (-40.35039-(-46.64956)));
            zz = -0.07384 + (((tickAnim - 61) / 17) * (-1.28825-(-0.07384)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 5.25338 + (((tickAnim - 78) / 22) * (0-(5.25338)));
            yy = -40.35039 + (((tickAnim - 78) / 22) * (0-(-40.35039)));
            zz = -1.28825 + (((tickAnim - 78) / 22) * (0-(-1.28825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = 10 + (((tickAnim - 23) / 17) * (25.25-(10)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 40) / 12) * (0-(0)));
            yy = 25.25 + (((tickAnim - 40) / 12) * (-15.07-(25.25)));
            zz = 0 + (((tickAnim - 40) / 12) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 52) / 26) * (0-(0)));
            yy = -15.07 + (((tickAnim - 52) / 26) * (4.24-(-15.07)));
            zz = 0 + (((tickAnim - 52) / 26) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 78) / 22) * (0-(0)));
            yy = 4.24 + (((tickAnim - 78) / 22) * (0-(4.24)));
            zz = 0 + (((tickAnim - 78) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (25.28-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 7) / 16) * (4.27395-(0)));
            yy = 25.28 + (((tickAnim - 7) / 16) * (7.33607-(25.28)));
            zz = 0 + (((tickAnim - 7) / 16) * (9.61216-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 4.27395 + (((tickAnim - 23) / 17) * (2.80653-(4.27395)));
            yy = 7.33607 + (((tickAnim - 23) / 17) * (10.27311-(7.33607)));
            zz = 9.61216 + (((tickAnim - 23) / 17) * (2.58472-(9.61216)));
        }
        else if (tickAnim >= 40 && tickAnim < 52) {
            xx = 2.80653 + (((tickAnim - 40) / 12) * (1.7063-(2.80653)));
            yy = 10.27311 + (((tickAnim - 40) / 12) * (-8.89605-(10.27311)));
            zz = 2.58472 + (((tickAnim - 40) / 12) * (-3.36753-(2.58472)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = 1.7063 + (((tickAnim - 52) / 9) * (0-(1.7063)));
            yy = -8.89605 + (((tickAnim - 52) / 9) * (-10-(-8.89605)));
            zz = -3.36753 + (((tickAnim - 52) / 9) * (0-(-3.36753)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            yy = -10 + (((tickAnim - 61) / 17) * (-18.15-(-10)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 78) / 11) * (0-(0)));
            yy = -18.15 + (((tickAnim - 78) / 11) * (5.92-(-18.15)));
            zz = 0 + (((tickAnim - 78) / 11) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 89) / 11) * (0-(0)));
            yy = 5.92 + (((tickAnim - 89) / 11) * (0-(5.92)));
            zz = 0 + (((tickAnim - 89) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 38) {
            xx = 22.5 + (((tickAnim - 17) / 21) * (7.52-(22.5)));
            yy = 0 + (((tickAnim - 17) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 21) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 7.52 + (((tickAnim - 38) / 6) * (-12.38-(7.52)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 61) {
            xx = -12.38 + (((tickAnim - 44) / 17) * (-9.43-(-12.38)));
            yy = 0 + (((tickAnim - 44) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 17) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = -9.43 + (((tickAnim - 61) / 17) * (-4.91391-(-9.43)));
            yy = 0 + (((tickAnim - 61) / 17) * (-9.84966-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (-1.75601-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 89) {
            xx = -4.91391 + (((tickAnim - 78) / 11) * (-2.08037-(-4.91391)));
            yy = -9.84966 + (((tickAnim - 78) / 11) * (14.59311-(-9.84966)));
            zz = -1.75601 + (((tickAnim - 78) / 11) * (3.52398-(-1.75601)));
        }
        else if (tickAnim >= 89 && tickAnim < 100) {
            xx = -2.08037 + (((tickAnim - 89) / 11) * (0-(-2.08037)));
            yy = 14.59311 + (((tickAnim - 89) / 11) * (0-(14.59311)));
            zz = 3.52398 + (((tickAnim - 89) / 11) * (0-(3.52398)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-7.52832-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (4.95712-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.65426-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 52) {
            xx = -7.52832 + (((tickAnim - 16) / 36) * (-7.26596-(-7.52832)));
            yy = 4.95712 + (((tickAnim - 16) / 36) * (-5.36354-(4.95712)));
            zz = -0.65426 + (((tickAnim - 16) / 36) * (0.67244-(-0.65426)));
        }
        else if (tickAnim >= 52 && tickAnim < 78) {
            xx = -7.26596 + (((tickAnim - 52) / 26) * (-7.03-(-7.26596)));
            yy = -5.36354 + (((tickAnim - 52) / 26) * (0-(-5.36354)));
            zz = 0.67244 + (((tickAnim - 52) / 26) * (0-(0.67244)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -7.03 + (((tickAnim - 78) / 22) * (0-(-7.03)));
            yy = 0 + (((tickAnim - 78) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (5.00474-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (2.49048-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0.21803-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 52) {
            xx = 5.00474 + (((tickAnim - 16) / 36) * (4.34914-(5.00474)));
            yy = 2.49048 + (((tickAnim - 16) / 36) * (-3.94234-(2.49048)));
            zz = 0.21803 + (((tickAnim - 16) / 36) * (-0.28742-(0.21803)));
        }
        else if (tickAnim >= 52 && tickAnim < 78) {
            xx = 4.34914 + (((tickAnim - 52) / 26) * (3.86-(4.34914)));
            yy = -3.94234 + (((tickAnim - 52) / 26) * (0-(-3.94234)));
            zz = -0.28742 + (((tickAnim - 52) / 26) * (0-(-0.28742)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 3.86 + (((tickAnim - 78) / 22) * (0-(3.86)));
            yy = 0 + (((tickAnim - 78) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (25.06818-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-6.87762-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-17.78089-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 48) {
            xx = 25.06818 + (((tickAnim - 11) / 37) * (32.56818-(25.06818)));
            yy = -6.87762 + (((tickAnim - 11) / 37) * (-6.87762-(-6.87762)));
            zz = -17.78089 + (((tickAnim - 11) / 37) * (-17.78089-(-17.78089)));
        }
        else if (tickAnim >= 48 && tickAnim < 78) {
            xx = 32.56818 + (((tickAnim - 48) / 30) * (25.06818-(32.56818)));
            yy = -6.87762 + (((tickAnim - 48) / 30) * (-6.87762-(-6.87762)));
            zz = -17.78089 + (((tickAnim - 48) / 30) * (-17.78089-(-17.78089)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 25.06818 + (((tickAnim - 78) / 22) * (0-(25.06818)));
            yy = -6.87762 + (((tickAnim - 78) / 22) * (0-(-6.87762)));
            zz = -17.78089 + (((tickAnim - 78) / 22) * (0-(-17.78089)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 78) {
            xx = -30 + (((tickAnim - 11) / 67) * (-30-(-30)));
            yy = 0 + (((tickAnim - 11) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 67) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -30 + (((tickAnim - 78) / 22) * (0-(-30)));
            yy = 0 + (((tickAnim - 78) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (24.49787-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.23779-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (5.25755-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 78) {
            xx = 24.49787 + (((tickAnim - 11) / 67) * (24.49787-(24.49787)));
            yy = 1.23779 + (((tickAnim - 11) / 67) * (1.23779-(1.23779)));
            zz = 5.25755 + (((tickAnim - 11) / 67) * (5.25755-(5.25755)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 24.49787 + (((tickAnim - 78) / 22) * (0-(24.49787)));
            yy = 1.23779 + (((tickAnim - 78) / 22) * (0-(1.23779)));
            zz = 5.25755 + (((tickAnim - 78) / 22) * (0-(5.25755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (25.06818-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (6.87762-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (17.78089-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 48) {
            xx = 25.06818 + (((tickAnim - 11) / 37) * (32.56818-(25.06818)));
            yy = 6.87762 + (((tickAnim - 11) / 37) * (6.87762-(6.87762)));
            zz = 17.78089 + (((tickAnim - 11) / 37) * (17.78089-(17.78089)));
        }
        else if (tickAnim >= 48 && tickAnim < 78) {
            xx = 32.56818 + (((tickAnim - 48) / 30) * (25.06818-(32.56818)));
            yy = 6.87762 + (((tickAnim - 48) / 30) * (6.87762-(6.87762)));
            zz = 17.78089 + (((tickAnim - 48) / 30) * (17.78089-(17.78089)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 25.06818 + (((tickAnim - 78) / 22) * (0-(25.06818)));
            yy = 6.87762 + (((tickAnim - 78) / 22) * (0-(6.87762)));
            zz = 17.78089 + (((tickAnim - 78) / 22) * (0-(17.78089)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 78) {
            xx = -30 + (((tickAnim - 11) / 67) * (-30-(-30)));
            yy = 0 + (((tickAnim - 11) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 67) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -30 + (((tickAnim - 78) / 22) * (0-(-30)));
            yy = 0 + (((tickAnim - 78) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (24.49787-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-1.23779-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-5.25755-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 78) {
            xx = 24.49787 + (((tickAnim - 11) / 67) * (24.49787-(24.49787)));
            yy = -1.23779 + (((tickAnim - 11) / 67) * (-1.23779-(-1.23779)));
            zz = -5.25755 + (((tickAnim - 11) / 67) * (-5.25755-(-5.25755)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 24.49787 + (((tickAnim - 78) / 22) * (0-(24.49787)));
            yy = -1.23779 + (((tickAnim - 78) / 22) * (0-(-1.23779)));
            zz = -5.25755 + (((tickAnim - 78) / 22) * (0-(-5.25755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (15.5-(0)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 52) {
            xx = 15.5 + (((tickAnim - 46) / 6) * (15.25-(15.5)));
            yy = 0 + (((tickAnim - 46) / 6) * (-15-(0)));
            zz = 0 + (((tickAnim - 46) / 6) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 78) {
            xx = 15.25 + (((tickAnim - 52) / 26) * (13.79844-(15.25)));
            yy = -15 + (((tickAnim - 52) / 26) * (-7.4392-(-15)));
            zz = 0 + (((tickAnim - 52) / 26) * (7.43409-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 13.79844 + (((tickAnim - 78) / 22) * (0-(13.79844)));
            yy = -7.4392 + (((tickAnim - 78) / 22) * (0-(-7.4392)));
            zz = 7.43409 + (((tickAnim - 78) / 22) * (0-(7.43409)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 6) * (1.175-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 46) / 6) * (-0.85-(0)));
            yy = 1.175 + (((tickAnim - 46) / 6) * (1.3-(1.175)));
            zz = 0 + (((tickAnim - 46) / 6) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 78) {
            xx = -0.85 + (((tickAnim - 52) / 26) * (0-(-0.85)));
            yy = 1.3 + (((tickAnim - 52) / 26) * (1.225-(1.3)));
            zz = 0 + (((tickAnim - 52) / 26) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 78) / 22) * (0-(0)));
            yy = 1.225 + (((tickAnim - 78) / 22) * (0-(1.225)));
            zz = 0 + (((tickAnim - 78) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);



    }
    public void animPreen(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraUtahraptor entity = (EntityPrehistoricFloraUtahraptor) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-30.8574-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-45.96425-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-33.36248-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -30.8574 + (((tickAnim - 14) / 7) * (-46.9637-(-30.8574)));
            yy = -45.96425 + (((tickAnim - 14) / 7) * (-35.66433-(-45.96425)));
            zz = -33.36248 + (((tickAnim - 14) / 7) * (-44.29898-(-33.36248)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -46.9637 + (((tickAnim - 21) / 9) * (-73.7103-(-46.9637)));
            yy = -35.66433 + (((tickAnim - 21) / 9) * (-31.10859-(-35.66433)));
            zz = -44.29898 + (((tickAnim - 21) / 9) * (-29.23656-(-44.29898)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -73.7103 + (((tickAnim - 30) / 6) * (-73.7598-(-73.7103)));
            yy = -31.10859 + (((tickAnim - 30) / 6) * (-20.61633-(-31.10859)));
            zz = -29.23656 + (((tickAnim - 30) / 6) * (-46.98665-(-29.23656)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = -73.7598 + (((tickAnim - 36) / 5) * (-68.71147-(-73.7598)));
            yy = -20.61633 + (((tickAnim - 36) / 5) * (-20.748-(-20.61633)));
            zz = -46.98665 + (((tickAnim - 36) / 5) * (-49.4499-(-46.98665)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = -68.71147 + (((tickAnim - 41) / 4) * (-73.67119-(-68.71147)));
            yy = -20.748 + (((tickAnim - 41) / 4) * (-20.85773-(-20.748)));
            zz = -49.4499 + (((tickAnim - 41) / 4) * (-51.50263-(-49.4499)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -73.67119 + (((tickAnim - 45) / 5) * (-75.87255-(-73.67119)));
            yy = -20.85773 + (((tickAnim - 45) / 5) * (-3.26781-(-20.85773)));
            zz = -51.50263 + (((tickAnim - 45) / 5) * (-64.34292-(-51.50263)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -75.87255 + (((tickAnim - 50) / 5) * (-67.1567-(-75.87255)));
            yy = -3.26781 + (((tickAnim - 50) / 5) * (-2.76272-(-3.26781)));
            zz = -64.34292 + (((tickAnim - 50) / 5) * (-63.43269-(-64.34292)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = -67.1567 + (((tickAnim - 55) / 7) * (-73.03558-(-67.1567)));
            yy = -2.76272 + (((tickAnim - 55) / 7) * (-2.08928-(-2.76272)));
            zz = -63.43269 + (((tickAnim - 55) / 7) * (-62.21905-(-63.43269)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = -73.03558 + (((tickAnim - 62) / 8) * (-62.14266-(-73.03558)));
            yy = -2.08928 + (((tickAnim - 62) / 8) * (-3.59344-(-2.08928)));
            zz = -62.21905 + (((tickAnim - 62) / 8) * (-56.34713-(-62.21905)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = -62.14266 + (((tickAnim - 70) / 3) * (-49.4641-(-62.14266)));
            yy = -3.59344 + (((tickAnim - 70) / 3) * (-3.29399-(-3.59344)));
            zz = -56.34713 + (((tickAnim - 70) / 3) * (-51.65153-(-56.34713)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = -49.4641 + (((tickAnim - 73) / 3) * (-34.15962-(-49.4641)));
            yy = -3.29399 + (((tickAnim - 73) / 3) * (-14.60878-(-3.29399)));
            zz = -51.65153 + (((tickAnim - 73) / 3) * (-37.26597-(-51.65153)));
        }
        else if (tickAnim >= 76 && tickAnim < 86) {
            xx = -34.15962 + (((tickAnim - 76) / 10) * (-14.95201-(-34.15962)));
            yy = -14.60878 + (((tickAnim - 76) / 10) * (-11.57764-(-14.60878)));
            zz = -37.26597 + (((tickAnim - 76) / 10) * (5.43472-(-37.26597)));
        }
        else if (tickAnim >= 86 && tickAnim < 100) {
            xx = -14.95201 + (((tickAnim - 86) / 14) * (0-(-14.95201)));
            yy = -11.57764 + (((tickAnim - 86) / 14) * (0-(-11.57764)));
            zz = 5.43472 + (((tickAnim - 86) / 14) * (0-(5.43472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 62) {
            xx = 75 + (((tickAnim - 30) / 32) * (60.27-(75)));
            yy = 0 + (((tickAnim - 30) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 32) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = 60.27 + (((tickAnim - 62) / 8) * (47.17-(60.27)));
            yy = 0 + (((tickAnim - 62) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 8) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 81) {
            xx = 47.17 + (((tickAnim - 70) / 11) * (10.14-(47.17)));
            yy = 0 + (((tickAnim - 70) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 11) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 88) {
            xx = 10.14 + (((tickAnim - 81) / 7) * (-0.89-(10.14)));
            yy = 0 + (((tickAnim - 81) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 7) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 100) {
            xx = -0.89 + (((tickAnim - 88) / 12) * (0-(-0.89)));
            yy = 0 + (((tickAnim - 88) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16.77388-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-11.30199-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.19935-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 16.77388 + (((tickAnim - 8) / 12) * (21.82767-(16.77388)));
            yy = -11.30199 + (((tickAnim - 8) / 12) * (-11.83127-(-11.30199)));
            zz = 1.19935 + (((tickAnim - 8) / 12) * (-11.70446-(1.19935)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21.82767 + (((tickAnim - 20) / 10) * (30.41097-(21.82767)));
            yy = -11.83127 + (((tickAnim - 20) / 10) * (-12.18007-(-11.83127)));
            zz = -11.70446 + (((tickAnim - 20) / 10) * (-16.31824-(-11.70446)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 30.41097 + (((tickAnim - 30) / 3) * (31.58286-(30.41097)));
            yy = -12.18007 + (((tickAnim - 30) / 3) * (-12.86082-(-12.18007)));
            zz = -16.31824 + (((tickAnim - 30) / 3) * (-16.25866-(-16.31824)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 31.58286 + (((tickAnim - 33) / 3) * (27.19337-(31.58286)));
            yy = -12.86082 + (((tickAnim - 33) / 3) * (-18.18459-(-12.86082)));
            zz = -16.25866 + (((tickAnim - 33) / 3) * (-8.30807-(-16.25866)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 27.19337 + (((tickAnim - 36) / 4) * (36.94415-(27.19337)));
            yy = -18.18459 + (((tickAnim - 36) / 4) * (-22.83928-(-18.18459)));
            zz = -8.30807 + (((tickAnim - 36) / 4) * (-13.73625-(-8.30807)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 36.94415 + (((tickAnim - 40) / 5) * (37.19447-(36.94415)));
            yy = -22.83928 + (((tickAnim - 40) / 5) * (-20.16741-(-22.83928)));
            zz = -13.73625 + (((tickAnim - 40) / 5) * (-14.67683-(-13.73625)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 37.19447 + (((tickAnim - 45) / 3) * (40.5503-(37.19447)));
            yy = -20.16741 + (((tickAnim - 45) / 3) * (-14.35191-(-20.16741)));
            zz = -14.67683 + (((tickAnim - 45) / 3) * (-20.76179-(-14.67683)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 40.5503 + (((tickAnim - 48) / 4) * (44.52822-(40.5503)));
            yy = -14.35191 + (((tickAnim - 48) / 4) * (-16.60492-(-14.35191)));
            zz = -20.76179 + (((tickAnim - 48) / 4) * (-15.93094-(-20.76179)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 44.52822 + (((tickAnim - 52) / 4) * (42.39609-(44.52822)));
            yy = -16.60492 + (((tickAnim - 52) / 4) * (-14.87472-(-16.60492)));
            zz = -15.93094 + (((tickAnim - 52) / 4) * (-9.12445-(-15.93094)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = 42.39609 + (((tickAnim - 56) / 7) * (41.42084-(42.39609)));
            yy = -14.87472 + (((tickAnim - 56) / 7) * (-22.01814-(-14.87472)));
            zz = -9.12445 + (((tickAnim - 56) / 7) * (-6.82269-(-9.12445)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 41.42084 + (((tickAnim - 63) / 7) * (47.84852-(41.42084)));
            yy = -22.01814 + (((tickAnim - 63) / 7) * (-20.27845-(-22.01814)));
            zz = -6.82269 + (((tickAnim - 63) / 7) * (-14.73948-(-6.82269)));
        }
        else if (tickAnim >= 70 && tickAnim < 100) {
            xx = 47.84852 + (((tickAnim - 70) / 30) * (0-(47.84852)));
            yy = -20.27845 + (((tickAnim - 70) / 30) * (0-(-20.27845)));
            zz = -14.73948 + (((tickAnim - 70) / 30) * (0-(-14.73948)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-18.31-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            yy = -18.31 + (((tickAnim - 20) / 17) * (-9.07-(-18.31)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 37) / 15) * (0-(0)));
            yy = -9.07 + (((tickAnim - 37) / 15) * (-15-(-9.07)));
            zz = 0 + (((tickAnim - 37) / 15) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 52) / 48) * (0-(0)));
            yy = -15 + (((tickAnim - 52) / 48) * (0-(-15)));
            zz = 0 + (((tickAnim - 52) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15.19517-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-34.78296-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (14.61801-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 15.19517 + (((tickAnim - 18) / 12) * (3.9871-(15.19517)));
            yy = -34.78296 + (((tickAnim - 18) / 12) * (-37.15855-(-34.78296)));
            zz = 14.61801 + (((tickAnim - 18) / 12) * (25.41377-(14.61801)));
        }
        else if (tickAnim >= 30 && tickAnim < 52) {
            xx = 3.9871 + (((tickAnim - 30) / 22) * (2.56384-(3.9871)));
            yy = -37.15855 + (((tickAnim - 30) / 22) * (-11.12764-(-37.15855)));
            zz = 25.41377 + (((tickAnim - 30) / 22) * (18.59709-(25.41377)));
        }
        else if (tickAnim >= 52 && tickAnim < 73) {
            xx = 2.56384 + (((tickAnim - 52) / 21) * (1.3891-(2.56384)));
            yy = -11.12764 + (((tickAnim - 52) / 21) * (-7.34424-(-11.12764)));
            zz = 18.59709 + (((tickAnim - 52) / 21) * (12.27408-(18.59709)));
        }
        else if (tickAnim >= 73 && tickAnim < 79) {
            xx = 1.3891 + (((tickAnim - 73) / 6) * (-22.11266-(1.3891)));
            yy = -7.34424 + (((tickAnim - 73) / 6) * (13.13181-(-7.34424)));
            zz = 12.27408 + (((tickAnim - 73) / 6) * (2.15043-(12.27408)));
        }
        else if (tickAnim >= 79 && tickAnim < 86) {
            xx = -22.11266 + (((tickAnim - 79) / 7) * (-19.41546-(-22.11266)));
            yy = 13.13181 + (((tickAnim - 79) / 7) * (10.38488-(13.13181)));
            zz = 2.15043 + (((tickAnim - 79) / 7) * (1.37663-(2.15043)));
        }
        else if (tickAnim >= 86 && tickAnim < 100) {
            xx = -19.41546 + (((tickAnim - 86) / 14) * (0-(-19.41546)));
            yy = 10.38488 + (((tickAnim - 86) / 14) * (0-(10.38488)));
            zz = 1.37663 + (((tickAnim - 86) / 14) * (0-(1.37663)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (7.2-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 7.2 + (((tickAnim - 28) / 9) * (3.11-(7.2)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 3.11 + (((tickAnim - 37) / 5) * (1.87172-(3.11)));
            yy = 0 + (((tickAnim - 37) / 5) * (2.35863-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0.829-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 1.87172 + (((tickAnim - 42) / 7) * (9.34265-(1.87172)));
            yy = 2.35863 + (((tickAnim - 42) / 7) * (1.78491-(2.35863)));
            zz = 0.829 + (((tickAnim - 42) / 7) * (0.62735-(0.829)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 9.34265 + (((tickAnim - 49) / 7) * (2.61046-(9.34265)));
            yy = 1.78491 + (((tickAnim - 49) / 7) * (1.27494-(1.78491)));
            zz = 0.62735 + (((tickAnim - 49) / 7) * (0.44811-(0.62735)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 2.61046 + (((tickAnim - 56) / 17) * (12.03-(2.61046)));
            yy = 1.27494 + (((tickAnim - 56) / 17) * (0-(1.27494)));
            zz = 0.44811 + (((tickAnim - 56) / 17) * (0-(0.44811)));
        }
        else if (tickAnim >= 73 && tickAnim < 79) {
            xx = 12.03 + (((tickAnim - 73) / 6) * (-6.44658-(12.03)));
            yy = 0 + (((tickAnim - 73) / 6) * (4.98075-(0)));
            zz = 0 + (((tickAnim - 73) / 6) * (0.44022-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 86) {
            xx = -6.44658 + (((tickAnim - 79) / 7) * (-9.92327-(-6.44658)));
            yy = 4.98075 + (((tickAnim - 79) / 7) * (9.96156-(4.98075)));
            zz = 0.44022 + (((tickAnim - 79) / 7) * (0.88045-(0.44022)));
        }
        else if (tickAnim >= 86 && tickAnim < 100) {
            xx = -9.92327 + (((tickAnim - 86) / 14) * (0-(-9.92327)));
            yy = 9.96156 + (((tickAnim - 86) / 14) * (0-(9.96156)));
            zz = 0.88045 + (((tickAnim - 86) / 14) * (0-(0.88045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (10.25-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 10.25 + (((tickAnim - 28) / 5) * (9.75-(10.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 9.75 + (((tickAnim - 33) / 2) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 9.75 + (((tickAnim - 35) / 3) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 9.75 + (((tickAnim - 38) / 2) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 9.75 + (((tickAnim - 40) / 3) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 9.75 + (((tickAnim - 43) / 5) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = 9.75 + (((tickAnim - 48) / 1) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 48) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 1) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 9.75 + (((tickAnim - 49) / 10) * (0-(9.75)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 59) / 9) * (9.75-(0)));
            yy = 0 + (((tickAnim - 59) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 9) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 9.75 + (((tickAnim - 68) / 2) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 9.75 + (((tickAnim - 70) / 3) * (0-(9.75)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-0.21865-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-4.99523-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (2.50954-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 53) {
            xx = -0.21865 + (((tickAnim - 16) / 37) * (5.10273-(-0.21865)));
            yy = -4.99523 + (((tickAnim - 16) / 37) * (-2.35626-(-4.99523)));
            zz = 2.50954 + (((tickAnim - 16) / 37) * (-3.82049-(2.50954)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 5.10273 + (((tickAnim - 53) / 47) * (0-(5.10273)));
            yy = -2.35626 + (((tickAnim - 53) / 47) * (0-(-2.35626)));
            zz = -3.82049 + (((tickAnim - 53) / 47) * (0-(-3.82049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 100) {
            xx = 6.5 + (((tickAnim - 30) / 70) * (0-(6.5)));
            yy = 0 + (((tickAnim - 30) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperPropatagium, leftUpperPropatagium.rotateAngleX + (float) Math.toRadians(xx), leftUpperPropatagium.rotateAngleY + (float) Math.toRadians(yy), leftUpperPropatagium.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1.4-(1)));
            zz = 1 + (((tickAnim - 0) / 30) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 100) {
            xx = 1 + (((tickAnim - 30) / 70) * (1-(1)));
            yy = 1.4 + (((tickAnim - 30) / 70) * (1-(1.4)));
            zz = 1 + (((tickAnim - 30) / 70) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftUpperPropatagium.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerPropatagium, leftLowerPropatagium.rotateAngleX + (float) Math.toRadians(xx), leftLowerPropatagium.rotateAngleY + (float) Math.toRadians(yy), leftLowerPropatagium.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (22.62996-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (2.6625-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-6.97598-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 72) {
            xx = 22.62996 + (((tickAnim - 23) / 49) * (11.80478-(22.62996)));
            yy = 2.6625 + (((tickAnim - 23) / 49) * (1.91591-(2.6625)));
            zz = -6.97598 + (((tickAnim - 23) / 49) * (-11.12883-(-6.97598)));
        }
        else if (tickAnim >= 72 && tickAnim < 100) {
            xx = 11.80478 + (((tickAnim - 72) / 28) * (0-(11.80478)));
            yy = 1.91591 + (((tickAnim - 72) / 28) * (0-(1.91591)));
            zz = -11.12883 + (((tickAnim - 72) / 28) * (0-(-11.12883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 100) {
            xx = -17.5 + (((tickAnim - 23) / 77) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 23) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.89246-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (29.04018-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.01333-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -15.89246 + (((tickAnim - 20) / 11) * (-14.24802-(-15.89246)));
            yy = 29.04018 + (((tickAnim - 20) / 11) * (38.61682-(29.04018)));
            zz = 2.01333 + (((tickAnim - 20) / 11) * (-6.27212-(2.01333)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = -14.24802 + (((tickAnim - 31) / 12) * (-1.64246-(-14.24802)));
            yy = 38.61682 + (((tickAnim - 31) / 12) * (29.04018-(38.61682)));
            zz = -6.27212 + (((tickAnim - 31) / 12) * (2.01333-(-6.27212)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = -1.64246 + (((tickAnim - 43) / 27) * (-1.64246-(-1.64246)));
            yy = 29.04018 + (((tickAnim - 43) / 27) * (29.04018-(29.04018)));
            zz = 2.01333 + (((tickAnim - 43) / 27) * (2.01333-(2.01333)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -1.64246 + (((tickAnim - 70) / 15) * (12.5-(-1.64246)));
            yy = 29.04018 + (((tickAnim - 70) / 15) * (0-(29.04018)));
            zz = 2.01333 + (((tickAnim - 70) / 15) * (0-(2.01333)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 12.5 + (((tickAnim - 85) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (1.675-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (-1.225-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (-0.975-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 1.675 + (((tickAnim - 20) / 11) * (2.005-(1.675)));
            yy = -1.225 + (((tickAnim - 20) / 11) * (-0.77-(-1.225)));
            zz = -0.975 + (((tickAnim - 20) / 11) * (-1.52-(-0.975)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 2.005 + (((tickAnim - 31) / 12) * (1.68-(2.005)));
            yy = -0.77 + (((tickAnim - 31) / 12) * (-0.28-(-0.77)));
            zz = -1.52 + (((tickAnim - 31) / 12) * (-0.97-(-1.52)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 1.68 + (((tickAnim - 43) / 27) * (1.68-(1.68)));
            yy = -0.28 + (((tickAnim - 43) / 27) * (-0.28-(-0.28)));
            zz = -0.97 + (((tickAnim - 43) / 27) * (-0.97-(-0.97)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = 1.68 + (((tickAnim - 70) / 8) * (0.96-(1.68)));
            yy = -0.28 + (((tickAnim - 70) / 8) * (1.08-(-0.28)));
            zz = -0.97 + (((tickAnim - 70) / 8) * (1.135-(-0.97)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = 0.96 + (((tickAnim - 78) / 7) * (0.375-(0.96)));
            yy = 1.08 + (((tickAnim - 78) / 7) * (2.175-(1.08)));
            zz = 1.135 + (((tickAnim - 78) / 7) * (1.6-(1.135)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0.375 + (((tickAnim - 85) / 15) * (0-(0.375)));
            yy = 2.175 + (((tickAnim - 85) / 15) * (0-(2.175)));
            zz = 1.6 + (((tickAnim - 85) / 15) * (0-(1.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (0.9-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 0.9 + (((tickAnim - 20) / 50) * (0.9-(0.9)));
            yy = 1 + (((tickAnim - 20) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 20) / 50) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0.9 + (((tickAnim - 70) / 15) * (1-(0.9)));
            yy = 1 + (((tickAnim - 70) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 15) * (1.3-(1)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 1 + (((tickAnim - 85) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 85) / 15) * (1-(1)));
            zz = 1.3 + (((tickAnim - 85) / 15) * (1-(1.3)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraUtahraptor entity = (EntityPrehistoricFloraUtahraptor) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1 + (((tickAnim - 3) / 17) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1 + (((tickAnim - 3) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1 + (((tickAnim - 20) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1 + (((tickAnim - 20) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1 + (((tickAnim - 23) / 17) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1 + (((tickAnim - 23) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*1)));
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
            xx = 15.70168 + (((tickAnim - 0) / 7) * (-29.2221-(15.70168)));
            yy = 9.68771 + (((tickAnim - 0) / 7) * (13.75715-(9.68771)));
            zz = -0.72972 + (((tickAnim - 0) / 7) * (-6.35268-(-0.72972)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -29.2221 + (((tickAnim - 7) / 3) * (-44.61961-(-29.2221)));
            yy = 13.75715 + (((tickAnim - 7) / 3) * (5.853-(13.75715)));
            zz = -6.35268 + (((tickAnim - 7) / 3) * (-8.98347-(-6.35268)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -44.61961 + (((tickAnim - 10) / 3) * (-25.31998-(-44.61961)));
            yy = 5.853 + (((tickAnim - 10) / 3) * (3.44712-(5.853)));
            zz = -8.98347 + (((tickAnim - 10) / 3) * (-6.71647-(-8.98347)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -25.31998 + (((tickAnim - 13) / 2) * (-23.43633-(-25.31998)));
            yy = 3.44712 + (((tickAnim - 13) / 2) * (6.24764-(3.44712)));
            zz = -6.71647 + (((tickAnim - 13) / 2) * (-7.90345-(-6.71647)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -23.43633 + (((tickAnim - 15) / 2) * (-22.0377-(-23.43633)));
            yy = 6.24764 + (((tickAnim - 15) / 2) * (4.72478-(6.24764)));
            zz = -7.90345 + (((tickAnim - 15) / 2) * (-3.92945-(-7.90345)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -22.0377 + (((tickAnim - 17) / 11) * (-2.28103-(-22.0377)));
            yy = 4.72478 + (((tickAnim - 17) / 11) * (3.56199-(4.72478)));
            zz = -3.92945 + (((tickAnim - 17) / 11) * (6.22068-(-3.92945)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -2.28103 + (((tickAnim - 28) / 12) * (15.70168-(-2.28103)));
            yy = 3.56199 + (((tickAnim - 28) / 12) * (9.68771-(3.56199)));
            zz = 6.22068 + (((tickAnim - 28) / 12) * (-0.72972-(6.22068)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.17 + (((tickAnim - 0) / 3) * (29.22-(3.17)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 29.22 + (((tickAnim - 3) / 4) * (24.48555-(29.22)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.412-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.28338-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 24.48555 + (((tickAnim - 7) / 3) * (26.07666-(24.48555)));
            yy = 0.412 + (((tickAnim - 7) / 3) * (1.23601-(0.412)));
            zz = -0.28338 + (((tickAnim - 7) / 3) * (-0.85014-(-0.28338)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 26.07666 + (((tickAnim - 10) / 3) * (-16.53669-(26.07666)));
            yy = 1.23601 + (((tickAnim - 10) / 3) * (2.47202-(1.23601)));
            zz = -0.85014 + (((tickAnim - 10) / 3) * (-1.70027-(-0.85014)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -16.53669 + (((tickAnim - 13) / 27) * (3.17-(-16.53669)));
            yy = 2.47202 + (((tickAnim - 13) / 27) * (0-(2.47202)));
            zz = -1.70027 + (((tickAnim - 13) / 27) * (0-(-1.70027)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 0) / 3) * (-25.45-(20)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -25.45 + (((tickAnim - 3) / 4) * (-22.77-(-25.45)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -22.77 + (((tickAnim - 7) / 3) * (-2.63-(-22.77)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2.63 + (((tickAnim - 10) / 3) * (27.5-(-2.63)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 27.5 + (((tickAnim - 13) / 27) * (20-(27.5)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 48.33 + (((tickAnim - 0) / 3) * (64.07-(48.33)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 64.07 + (((tickAnim - 3) / 4) * (66.88-(64.07)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 66.88 + (((tickAnim - 7) / 3) * (69.69-(66.88)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 69.69 + (((tickAnim - 10) / 3) * (12.5-(69.69)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 12.5 + (((tickAnim - 13) / 15) * (-14.40147-(12.5)));
            yy = 0 + (((tickAnim - 13) / 15) * (-8.51108-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (-2.21117-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -14.40147 + (((tickAnim - 28) / 5) * (-26.25-(-14.40147)));
            yy = -8.51108 + (((tickAnim - 28) / 5) * (0-(-8.51108)));
            zz = -2.21117 + (((tickAnim - 28) / 5) * (0-(-2.21117)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -26.25 + (((tickAnim - 33) / 7) * (48.33-(-26.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 1.25 + (((tickAnim - 0) / 13) * (-1.525-(1.25)));
            zz = 0.925 + (((tickAnim - 0) / 13) * (0-(0.925)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = -1.525 + (((tickAnim - 13) / 9) * (2.32-(-1.525)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 2.32 + (((tickAnim - 22) / 6) * (1.655-(2.32)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 1.655 + (((tickAnim - 28) / 5) * (1.325-(1.655)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 1.325 + (((tickAnim - 33) / 4) * (1.785-(1.325)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 1.785 + (((tickAnim - 37) / 3) * (1.25-(1.785)));
            zz = 0 + (((tickAnim - 37) / 3) * (0.925-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -25.31998 + (((tickAnim - 0) / 2) * (-23.43633-(-25.31998)));
            yy = -3.44712 + (((tickAnim - 0) / 2) * (-6.24764-(-3.44712)));
            zz = 6.71647 + (((tickAnim - 0) / 2) * (7.90345-(6.71647)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -23.43633 + (((tickAnim - 2) / 1) * (-22.0377-(-23.43633)));
            yy = -6.24764 + (((tickAnim - 2) / 1) * (-4.72478-(-6.24764)));
            zz = 7.90345 + (((tickAnim - 2) / 1) * (3.92945-(7.90345)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = -22.0377 + (((tickAnim - 3) / 11) * (-2.19703-(-22.0377)));
            yy = -4.72478 + (((tickAnim - 3) / 11) * (0.17792-(-4.72478)));
            zz = 3.92945 + (((tickAnim - 3) / 11) * (-3.64783-(3.92945)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = -2.19703 + (((tickAnim - 14) / 13) * (14.57-(-2.19703)));
            yy = 0.17792 + (((tickAnim - 14) / 13) * (-6.88-(0.17792)));
            zz = -3.64783 + (((tickAnim - 14) / 13) * (8.57-(-3.64783)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 14.57 + (((tickAnim - 27) / 6) * (-29.2221-(14.57)));
            yy = -6.88 + (((tickAnim - 27) / 6) * (-13.75715-(-6.88)));
            zz = 8.57 + (((tickAnim - 27) / 6) * (6.35268-(8.57)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -29.2221 + (((tickAnim - 33) / 4) * (-44.61961-(-29.2221)));
            yy = -13.75715 + (((tickAnim - 33) / 4) * (-5.853-(-13.75715)));
            zz = 6.35268 + (((tickAnim - 33) / 4) * (8.98347-(6.35268)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -44.61961 + (((tickAnim - 37) / 3) * (-25.31998-(-44.61961)));
            yy = -5.853 + (((tickAnim - 37) / 3) * (-3.44712-(-5.853)));
            zz = 8.98347 + (((tickAnim - 37) / 3) * (6.71647-(8.98347)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = -16.53669 + (((tickAnim - 0) / 27) * (3.17-(-16.53669)));
            yy = 2.47202 + (((tickAnim - 0) / 27) * (0-(2.47202)));
            zz = -1.70027 + (((tickAnim - 0) / 27) * (0-(-1.70027)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 3.17 + (((tickAnim - 27) / 3) * (29.22-(3.17)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 29.22 + (((tickAnim - 30) / 3) * (27.98555-(29.22)));
            yy = 0 + (((tickAnim - 30) / 3) * (0.412-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-0.28338-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 27.98555 + (((tickAnim - 33) / 4) * (26.07666-(27.98555)));
            yy = 0.412 + (((tickAnim - 33) / 4) * (1.23601-(0.412)));
            zz = -0.28338 + (((tickAnim - 33) / 4) * (-0.85014-(-0.28338)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 26.07666 + (((tickAnim - 37) / 3) * (-16.53669-(26.07666)));
            yy = 1.23601 + (((tickAnim - 37) / 3) * (2.47202-(1.23601)));
            zz = -0.85014 + (((tickAnim - 37) / 3) * (-1.70027-(-0.85014)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 27.5 + (((tickAnim - 0) / 27) * (20-(27.5)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 27) / 3) * (-25.45-(20)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -25.45 + (((tickAnim - 30) / 3) * (-22.77-(-25.45)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -22.77 + (((tickAnim - 33) / 4) * (-2.63-(-22.77)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -2.63 + (((tickAnim - 37) / 3) * (27.5-(-2.63)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 12.5 + (((tickAnim - 0) / 9) * (-3.01-(12.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -3.01 + (((tickAnim - 9) / 5) * (-20.75-(-3.01)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -20.75 + (((tickAnim - 14) / 6) * (-26.25-(-20.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -26.25 + (((tickAnim - 20) / 7) * (48.33-(-26.25)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 48.33 + (((tickAnim - 27) / 3) * (64.07-(48.33)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 64.07 + (((tickAnim - 30) / 3) * (66.88-(64.07)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 66.88 + (((tickAnim - 33) / 4) * (69.69-(66.88)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 69.69 + (((tickAnim - 37) / 3) * (12.5-(69.69)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.725-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 1.725 + (((tickAnim - 14) / 6) * (1.325-(1.725)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.325 + (((tickAnim - 20) / 3) * (1.785-(1.325)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 1.785 + (((tickAnim - 23) / 4) * (0-(1.785)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (-50-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -50 + (((tickAnim - 27) / 6) * (7.5-(-50)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 33) / 7) * (0-(7.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (-90-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -90 + (((tickAnim - 27) / 3) * (33.44-(-90)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 33.44 + (((tickAnim - 30) / 3) * (53.13-(33.44)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 53.13 + (((tickAnim - 33) / 4) * (31.57-(53.13)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 31.57 + (((tickAnim - 37) / 3) * (0-(31.57)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0.95-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 30) / 3) * (0.5-(0.25)));
            zz = 0.95 + (((tickAnim - 30) / 3) * (1.2-(0.95)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 33) / 4) * (0.25-(0.5)));
            zz = 1.2 + (((tickAnim - 33) / 4) * (0.95-(1.2)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 37) / 3) * (0-(0.25)));
            zz = 0.95 + (((tickAnim - 37) / 3) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1.25), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -63.25 + (((tickAnim - 0) / 7) * (76.75-(-63.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 76.75 + (((tickAnim - 7) / 6) * (0-(76.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (-63.25-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw, rightSickleClaw.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -90 + (((tickAnim - 0) / 3) * (33.44-(-90)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 33.44 + (((tickAnim - 3) / 4) * (53.13-(33.44)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 53.13 + (((tickAnim - 7) / 3) * (31.57-(53.13)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 31.57 + (((tickAnim - 10) / 3) * (0-(31.57)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (-90-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.95-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 4) * (0.5-(0.25)));
            zz = 0.95 + (((tickAnim - 3) / 4) * (1.2-(0.95)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 3) * (0.25-(0.5)));
            zz = 1.2 + (((tickAnim - 7) / 3) * (0.95-(1.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 10) / 3) * (0-(0.25)));
            zz = 0.95 + (((tickAnim - 10) / 3) * (0-(0.95)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*2))*5), body.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), body.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*4))*3), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), chest.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*4))*5), rightArm.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*10), rightArm.rotateAngleZ + (float) Math.toRadians(-15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*2))*5));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), leftArm.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*10), leftArm.rotateAngleZ + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*6))*5));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30*1))*10), neck3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*3))*10), neck3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*7), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*2))*10), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*2))*10), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30*3))*5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240))*1), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*10), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240-60))*2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*6), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240-60*2))*1), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*7), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240-60*3))*1), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*8), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240-60*4))*1), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*9), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+110))*12), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.25 + (((tickAnim - 10) / 10) * (0-(12.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (12.25-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.25 + (((tickAnim - 30) / 10) * (0-(12.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.85 + (((tickAnim - 10) / 10) * (0-(0.85)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.85-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.85 + (((tickAnim - 30) / 10) * (0-(0.85)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraUtahraptor entity = (EntityPrehistoricFloraUtahraptor) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 26.25 + (((tickAnim - 0) / 3) * (-45-(26.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -45 + (((tickAnim - 3) / 4) * (-61.25006-(-45)));
            yy = 22.5 + (((tickAnim - 3) / 4) * (11.25011-(22.5)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -61.25006 + (((tickAnim - 7) / 3) * (-32.5-(-61.25006)));
            yy = 11.25011 + (((tickAnim - 7) / 3) * (0-(11.25011)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -32.5 + (((tickAnim - 10) / 10) * (26.25-(-32.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -32.5 + (((tickAnim - 0) / 10) * (26.25-(-32.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 26.25 + (((tickAnim - 10) / 3) * (-45-(26.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (-22.5-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -45 + (((tickAnim - 13) / 4) * (-61.25006-(-45)));
            yy = -22.5 + (((tickAnim - 13) / 4) * (-11.25011-(-22.5)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -61.25006 + (((tickAnim - 17) / 3) * (-32.5-(-61.25006)));
            yy = -11.25011 + (((tickAnim - 17) / 3) * (0-(-11.25011)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 45 + (((tickAnim - 0) / 5) * (27.5-(45)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 5) / 15) * (45-(27.5)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*3), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*5), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*6));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.25 + (((tickAnim - 0) / 3) * (28.75-(25.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 28.75 + (((tickAnim - 3) / 5) * (-18.05237-(28.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (12.97977-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-7.67402-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.05237 + (((tickAnim - 8) / 2) * (-45.09045-(-18.05237)));
            yy = 12.97977 + (((tickAnim - 8) / 2) * (2.34503-(12.97977)));
            zz = -7.67402 + (((tickAnim - 8) / 2) * (-4.41721-(-7.67402)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -45.09045 + (((tickAnim - 10) / 10) * (25.25-(-45.09045)));
            yy = 2.34503 + (((tickAnim - 10) / 10) * (0-(2.34503)));
            zz = -4.41721 + (((tickAnim - 10) / 10) * (0-(-4.41721)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 45 + (((tickAnim - 0) / 20) * (45-(45)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 0) / 10) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 10) / 3) * (-12.95972-(22.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (3.54588-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (9.71607-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -12.95972 + (((tickAnim - 13) / 2) * (-37.70284-(-12.95972)));
            yy = 3.54588 + (((tickAnim - 13) / 2) * (-1.12453-(3.54588)));
            zz = 9.71607 + (((tickAnim - 13) / 2) * (8.42583-(9.71607)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -37.70284 + (((tickAnim - 15) / 5) * (22.5-(-37.70284)));
            yy = -1.12453 + (((tickAnim - 15) / 5) * (0-(-1.12453)));
            zz = 8.42583 + (((tickAnim - 15) / 5) * (0-(8.42583)));
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
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (1.16-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 1.16 + (((tickAnim - 11) / 1) * (1.565-(1.16)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.565 + (((tickAnim - 12) / 1) * (0.925-(1.565)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.925 + (((tickAnim - 13) / 2) * (-0.55-(0.925)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.55 + (((tickAnim - 15) / 5) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (-27.69-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -27.69 + (((tickAnim - 17) / 3) * (28.17-(-27.69)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
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
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0.8-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -45.09045 + (((tickAnim - 0) / 10) * (25.25-(-45.09045)));
            yy = -2.34503 + (((tickAnim - 0) / 10) * (0-(-2.34503)));
            zz = 4.41721 + (((tickAnim - 0) / 10) * (0-(4.41721)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25.25 + (((tickAnim - 10) / 3) * (28.75-(25.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 28.75 + (((tickAnim - 13) / 5) * (-18.05237-(28.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (-12.97977-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (7.67402-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -18.05237 + (((tickAnim - 18) / 2) * (-45.09045-(-18.05237)));
            yy = -12.97977 + (((tickAnim - 18) / 2) * (-2.34503-(-12.97977)));
            zz = 7.67402 + (((tickAnim - 18) / 2) * (4.41721-(7.67402)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (-6.56-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -6.56 + (((tickAnim - 3) / 2) * (-22.45284-(-6.56)));
            yy = 0 + (((tickAnim - 3) / 2) * (1.12453-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-8.42583-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.45284 + (((tickAnim - 5) / 5) * (42.75-(-22.45284)));
            yy = 1.12453 + (((tickAnim - 5) / 5) * (0-(1.12453)));
            zz = -8.42583 + (((tickAnim - 5) / 5) * (0-(-8.42583)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 42.75 + (((tickAnim - 10) / 10) * (22.5-(42.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.16-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.16 + (((tickAnim - 1) / 1) * (1.565-(1.16)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.565 + (((tickAnim - 2) / 1) * (0.925-(1.565)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.925 + (((tickAnim - 3) / 2) * (-0.8-(0.925)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.8 + (((tickAnim - 5) / 5) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 5) / 5) * (1.05-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 1.05 + (((tickAnim - 10) / 10) * (0-(1.05)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-39.69-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -39.69 + (((tickAnim - 7) / 3) * (28.17-(-39.69)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28.17 + (((tickAnim - 10) / 10) * (0-(28.17)));
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
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.8-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.8 + (((tickAnim - 10) / 10) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60*2))*3), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30*7))*5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*2))*5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60*3))*3), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*6))*5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*2))*5));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60*3))*3), rightArm.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*6))*5), rightArm.rotateAngleZ + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*2))*15));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(77.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*15), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(-14.26383), rightArm3.rotateAngleY + (float) Math.toRadians(0.65039), rightArm3.rotateAngleZ + (float) Math.toRadians(2.52367));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-13-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60*3))*3), leftArm.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*6))*5), leftArm.rotateAngleZ + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*2))*15));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(77.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*15), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-14.26383), leftArm3.rotateAngleY + (float) Math.toRadians(-0.65039), leftArm3.rotateAngleZ + (float) Math.toRadians(-2.52367));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60*5))*10), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*3))*5), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60*5))*3), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60*9))*10), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60*5))*12), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*10), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150-50))*2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270-50*2))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150-50*2))*5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270-50*3))*10), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150-50*3))*5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270-50*4))*10), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150-50*4))*10), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270-50*5))*20), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftUpperPropatagium, leftUpperPropatagium.rotateAngleX + (float) Math.toRadians(10), leftUpperPropatagium.rotateAngleY + (float) Math.toRadians(0), leftUpperPropatagium.rotateAngleZ + (float) Math.toRadians(0));
        this.leftUpperPropatagium.setScale((float)1,(float)1.3,(float)1);


        this.setRotateAngle(leftLowerPropatagium, leftLowerPropatagium.rotateAngleX + (float) Math.toRadians(-20), leftLowerPropatagium.rotateAngleY + (float) Math.toRadians(0), leftLowerPropatagium.rotateAngleZ + (float) Math.toRadians(0));
        this.leftLowerPropatagium.setScale((float)1,(float)1.2,(float)1);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60*2))*9), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*6))*10), neck.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 9.75 + (((tickAnim - 6) / 6) * (0-(9.75)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (9.75-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 16) / 4) * (0-(9.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.775 + (((tickAnim - 6) / 6) * (0-(0.775)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0.775-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.775 + (((tickAnim - 16) / 4) * (0-(0.775)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightUpperPropatagium, rightUpperPropatagium.rotateAngleX + (float) Math.toRadians(10), rightUpperPropatagium.rotateAngleY + (float) Math.toRadians(0), rightUpperPropatagium.rotateAngleZ + (float) Math.toRadians(0));
        this.rightUpperPropatagium.setScale((float)1,(float)1.3,(float)1);


        this.setRotateAngle(rightLowerPropatagium, rightLowerPropatagium.rotateAngleX + (float) Math.toRadians(-20), rightLowerPropatagium.rotateAngleY + (float) Math.toRadians(0), rightLowerPropatagium.rotateAngleZ + (float) Math.toRadians(0));
        this.rightLowerPropatagium.setScale((float)1,(float)1.2,(float)1);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        this.throat.setScale(1,1,1);
        EntityPrehistoricFloraUtahraptor ee = (EntityPrehistoricFloraUtahraptor) entitylivingbaseIn;

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
        if (ee.getAnimation() == ee.EAT_ANIMATION) { //
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) { //
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim (bellow)
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.PREEN_ANIMATION) {
            animPreen(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraUtahraptor e = (EntityPrehistoricFloraUtahraptor) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Neck4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
