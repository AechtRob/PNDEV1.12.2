package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBannykus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBannykus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer torso;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer rightClaw;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer leftClaw;
    private final AdvancedModelRenderer cube_r64;
    private ModelAnimator animator;

    public ModelBannykus() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(1.5F, 10.4F, 0.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.2F, 0.7F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 14, -4.0F, -2.0F, -3.0F, 5, 3, 6, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 24, -4.0F, -2.0F, -2.0F, 5, 5, 5, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(-1.0F, -0.2F, 2.6F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 27, -2.0F, -1.4F, -1.1F, 3, 3, 7, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 32, 62, 0.5F, 1.6F, -1.1F, 0, 1, 7, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 63, 42, -1.5F, 1.6F, -1.1F, 0, 1, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.5F, -0.5F, 5.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 43, -1.0F, -0.7F, -0.1F, 2, 2, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 60, 0.0F, 0.4F, -0.1F, 0, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -0.7F, 15.8F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.2654F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 8, -2.4399F, 0.6907F, -15.5F, 2, 0, 7, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -0.7F, 15.8F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 1.2654F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 0, 0.4399F, 0.6907F, -15.5F, 2, 0, 7, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2F, 6.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 51, -1.0F, -0.8F, -0.1F, 2, 2, 6, -0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 57, 58, -1.5F, -0.9F, -0.4F, 3, 0, 6, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.4775F, -0.9165F, 9.1F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -1.2654F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 51, -3.0F, 0.0F, -9.5F, 3, 0, 6, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.4775F, -0.9165F, 9.1F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.2654F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 53, 0.0F, 0.0F, -9.5F, 3, 0, 6, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4F, 5.6F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 46, 24, -1.5F, -0.4F, 0.0F, 3, 2, 6, -0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 43, -1.5F, -0.5F, 0.0F, 3, 0, 7, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.4775F, -0.5165F, 3.5F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.2654F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 43, -4.0F, 0.0F, -3.5F, 4, 0, 7, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.4775F, -0.5165F, 3.5F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 1.2654F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 35, 0.0F, 0.0F, -3.5F, 4, 0, 7, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.5F, 7.0F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.9163F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 0, -1.0F, 0.0F, 0.0F, 3, 3, 3, 0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.5F, -0.4F, 0.2F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.6109F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.3536F, 0.316F);
        this.rightLeg1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 51, -1.4F, -2.0876F, -1.5071F, 3, 6, 4, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 21, 27, -0.6F, -2.0876F, 2.4929F, 0, 6, 1, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(2.1F, 5.4193F, -0.0684F);
        this.rightLeg1.addChild(rightLeg2);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, -0.4681F, -0.0588F);
        this.rightLeg2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.2217F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 65, -1.0F, -0.0392F, -0.4F, 2, 8, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 1.0617F, 7.5034F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2618F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, -2.2131F, -0.517F);
        this.rightLeg3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 53, -0.5F, 1.8724F, -1.4104F, 1, 5, 1, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-2.0F, 3.6462F, 1.783F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.9599F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.0F, 1.3351F, 2.108F);
        this.rightFoot.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.8326F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 10, -3.0F, -1.9F, 0.1F, 2, 1, 2, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 1.7303F, 0.2468F);
        this.rightFoot.addChild(rightToes);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, 1.5367F, 2.3788F);
        this.rightToes.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.8326F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 76, 51, -3.0F, -1.9F, 1.1F, 2, 1, 1, -0.001F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.5F, -0.4F, 0.2F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6109F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.3536F, 0.316F);
        this.leftLeg1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 51, -1.6F, -2.0876F, -1.5071F, 3, 6, 4, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 27, 0.6F, -2.0876F, 2.4929F, 0, 6, 1, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-2.1F, 5.4193F, -0.0684F);
        this.leftLeg1.addChild(leftLeg2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.0F, -0.4681F, -0.0588F);
        this.leftLeg2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.2217F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 65, -1.0F, -0.0392F, -0.4F, 2, 8, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 1.0617F, 7.5034F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.2618F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.0F, -2.2131F, -0.517F);
        this.leftLeg3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5236F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 53, -0.5F, 1.8724F, -1.4104F, 1, 5, 1, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(2.0F, 3.6462F, 1.783F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.9599F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.0F, 1.3351F, 2.108F);
        this.leftFoot.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.8326F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 27, 10, 1.0F, -1.9F, 0.1F, 2, 1, 2, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 1.7303F, 0.2468F);
        this.leftFoot.addChild(leftToes);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, 1.5367F, 2.3788F);
        this.leftToes.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.8326F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 76, 51, 1.0F, -1.9F, 1.1F, 2, 1, 1, -0.001F, false));

        this.torso = new AdvancedModelRenderer(this);
        this.torso.setRotationPoint(0.5F, -2.2F, 0.5F);
        this.hips.addChild(torso);
        this.torso.cubeList.add(new ModelBox(torso, 0, 14, -5.0F, 0.0F, -8.0F, 6, 6, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.9082F, -7.3067F);
        this.torso.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0698F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, -1, 77, -5.0F, -2.0F, 6.2F, 6, 0, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 2.0F, -7.2F);
        this.torso.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0698F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -5.0F, -2.0F, -1.0F, 6, 6, 7, 0.1F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(-2.0F, 0.063F, -8.1521F);
        this.torso.addChild(chest);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 6.0298F, -3.6633F);
        this.chest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.2043F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 33, -1.5F, -1.5428F, -0.3F, 3, 0, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, 4.9493F, -3.2852F);
        this.chest.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.384F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 75, 49, -3.0F, -0.1F, 4.0F, 3, 0, 1, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 48, 16, -4.0F, -2.1F, 0.0F, 5, 2, 4, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, 2.537F, -1.6479F);
        this.chest.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2443F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 44, 35, -4.0F, -2.3F, -2.0F, 5, 1, 5, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.5F, 2.537F, -1.6479F);
        this.chest.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1833F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 27, 0, -4.0F, -2.0F, -2.0F, 5, 4, 5, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.5F, 1.637F, -3.0479F);
        this.chest.addChild(neck1);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 2.8928F, -2.9154F);
        this.neck1.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.2043F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 46, 33, -1.5F, -1.5428F, -0.3F, 3, 0, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 1.5928F, -4.4154F);
        this.neck1.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.2043F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 32, 60, -1.5F, -1.5428F, -0.3F, 3, 0, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.2537F, -3.1823F);
        this.neck1.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.7243F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 60, -2.0F, -0.3F, -0.2F, 3, 1, 5, 0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -1.6829F, -1.7515F);
        this.neck1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2618F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 47, 62, -1.5F, -0.3F, 0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.1F, -2.2F);
        this.neck1.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.637F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 65, 23, -2.0F, -2.2F, -1.1F, 3, 3, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.5923F, -1.9175F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.1309F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -2.8148F, -0.5519F);
        this.neck2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.2392F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 69, 70, -1.0F, -0.5F, -0.3F, 2, 1, 3, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -1.6788F, -2.0484F);
        this.neck2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -1.3614F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 47, 65, -1.0F, -2.1F, -1.0F, 2, 2, 4, -0.001F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -1.6788F, -2.0484F);
        this.neck2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -1.405F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 67, 7, -1.0F, -0.8F, -1.0F, 2, 1, 4, 0.01F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -3.094F, -0.3086F);
        this.neck2.addChild(neck3);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 0.0251F, -2.7219F);
        this.neck3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.7767F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 69, 65, -1.0F, -0.5F, -1.6F, 2, 1, 3, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 65, 31, -1.0F, -2.0F, -2.0F, 2, 2, 4, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -2.5204F, -2.7441F);
        this.neck3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.6545F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 9, 73, -1.0F, -0.1F, 1.8F, 2, 1, 2, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 67, 19, -1.0F, -0.3F, -0.2F, 2, 1, 2, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(-0.5F, -2.73F, -2.7956F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.0436F, 0.0F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0797F, -1.8895F);
        this.neck4.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0175F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 65, 38, -1.0F, -0.3F, 0.0F, 2, 1, 2, 0.03F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 1.7756F, -2.0081F);
        this.neck4.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0698F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 44, 72, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.2343F, -2.0229F);
        this.neck4.addChild(throat);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -0.1793F, 0.4966F);
        this.throat.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.2531F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 38, -1.0F, -0.7347F, -0.6596F, 2, 1, 3, -0.03F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -0.0112F, -0.1855F);
        this.throat.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0436F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 36, 10, -1.0F, -0.9462F, 0.0F, 2, 1, 2, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.07F, -1.8044F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 15, 67, -1.0F, 1.0838F, -4.7755F, 1, 1, 4, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.0F, 0.5F, -1.3F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -1.2217F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 45, 10, -0.9F, -1.1F, 0.1F, 1, 1, 0, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.5F, -1.3F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 1.2217F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 45, 10, -0.1F, -1.1F, 0.1F, 1, 1, 0, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.0F, 0.5F, -1.3F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.6981F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 76, 62, -2.241F, 0.5992F, -0.4205F, 2, 2, 0, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.5F, -1.3F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.6981F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 76, 62, 0.241F, 0.5992F, -0.4205F, 2, 2, 0, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.5F, 2.0662F, -1.1304F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.1745F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 11, 38, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, 2.0662F, -1.1304F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.1745F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 26, 71, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.5F, 1.4662F, -1.1304F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.4363F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 9, 70, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, 1.4662F, -1.1304F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.4363F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 9, 70, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-1.0F, 0.0865F, -1.2796F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.3665F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 74, 75, 0.0F, 0.0006F, -1.9354F, 1, 1, 2, -0.001F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.0F, 0.2995F, -3.0776F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1745F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 74, 38, 0.0F, 0.4705F, -1.9936F, 1, 1, 2, -0.001F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 2.0662F, -1.1304F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0436F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 30, 76, -1.0F, -2.0F, 1.1F, 2, 2, 1, -0.04F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 23, 76, -1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.5F, 2.0662F, -0.5304F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.2356F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 76, 19, -1.0F, -2.0F, 0.1F, 2, 2, 1, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.4F, -0.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0524F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 67, 13, -1.0F, -0.0045F, -4.194F, 1, 1, 4, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 58, 76, -0.5F, 0.8952F, -2.2079F, 0, 2, 2, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.5016F, 2.1639F, -0.5395F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.1745F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 35, 71, -0.0109F, -2.1984F, -3.0618F, 1, 1, 3, -0.01F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5016F, 2.1639F, -0.5395F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.1745F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 35, 71, -0.9891F, -2.1984F, -3.0618F, 1, 1, 3, -0.01F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.5F, 2.1643F, -0.5571F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0436F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 37, 76, -1.0F, -2.2F, -0.0105F, 2, 1, 1, -0.01F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.9922F, 3.037F, -2.658F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0F, -0.2182F, 0.0F);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.7F, 1.4F);
        this.rightArm1.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.8814F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 53, 72, -0.819F, -2.1969F, 1.0158F, 0, 4, 2, 0.0F, true));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 70, -1.219F, -2.1969F, -0.9842F, 2, 4, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 1.7F, 2.1F);
        this.rightArm1.addChild(rightArm2);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.2F, -1.4F);
        this.rightArm2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.2531F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 18, 73, -0.8F, -3.0742F, 2.0417F, 0, 4, 2, 0.0F, true));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 26, 67, -1.0F, -1.0742F, 1.0417F, 1, 2, 1, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.3F, 1.0F, -0.4F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1745F, 0.0F, 0.0F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.5F, 1.6F, 0.2F);
        this.rightHand.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.4102F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 76, 57, -0.9072F, -1.4105F, -0.0354F, 0, 2, 2, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5F, 0.4317F, 0.2718F);
        this.rightHand.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.2356F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 63, 76, -0.9F, -0.2105F, -0.4354F, 0, 3, 1, 0.0F, true));

        this.rightClaw = new AdvancedModelRenderer(this);
        this.rightClaw.setRotationPoint(0.5F, -0.8F, -0.9F);
        this.rightHand.addChild(rightClaw);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 2.4F, 1.1F);
        this.rightClaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.6021F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 69, 75, -1.0F, -1.2989F, -1.2366F, 1, 4, 1, 0.0F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.9922F, 3.037F, -2.658F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0F, 0.2182F, 0.0F);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 0.7F, 1.4F);
        this.leftArm1.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.8814F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 53, 72, 0.819F, -2.1969F, 1.0158F, 0, 4, 2, 0.0F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 70, -0.781F, -2.1969F, -0.9842F, 2, 4, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 1.7F, 2.1F);
        this.leftArm1.addChild(leftArm2);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.2F, -1.4F);
        this.leftArm2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.2531F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 18, 73, 0.8F, -3.0742F, 2.0417F, 0, 4, 2, 0.0F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 26, 67, 0.0F, -1.0742F, 1.0417F, 1, 2, 1, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.3F, 1.0F, -0.4F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1745F, 0.0F, 0.0F);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5F, 1.6F, 0.2F);
        this.leftHand.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.4102F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 76, 57, 0.9072F, -1.4105F, -0.0354F, 0, 2, 2, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.5F, 0.4317F, 0.2718F);
        this.leftHand.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.2356F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 63, 76, 0.9F, -0.2105F, -0.4354F, 0, 3, 1, 0.0F, false));

        this.leftClaw = new AdvancedModelRenderer(this);
        this.leftClaw.setRotationPoint(-0.5F, -0.8F, -0.9F);
        this.leftHand.addChild(leftClaw);


        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 2.4F, 1.1F);
        this.leftClaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.6021F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 69, 75, 0.0F, -1.2989F, -1.2366F, 1, 4, 1, 0.0F, false));

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
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.0F;
        this.hips.offsetX = -0.1F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(145);
        this.hips.rotateAngleX = (float)Math.toRadians(4);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.8F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.4F, 3.8F, -0.2F);

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

        EntityPrehistoricFloraBannykus entityBannykus = (EntityPrehistoricFloraBannykus) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityBannykus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityBannykus.getAnimation() == entityBannykus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityBannykus.isReallyInWater()) {

                if (f3 == 0.0F || !entityBannykus.getIsMoving()) {
                    if (entityBannykus.getAnimation() != entityBannykus.EAT_ANIMATION
                            && entityBannykus.getAnimation() != entityBannykus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityBannykus.getIsFast()) { //Running


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
        EntityPrehistoricFloraBannykus ee = (EntityPrehistoricFloraBannykus) entitylivingbaseIn;

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
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBannykus entity = (EntityPrehistoricFloraBannykus) entitylivingbaseIn;
        int animCycle = 92;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -3.75 + (((tickAnim - 14) / 9) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -3.75 + (((tickAnim - 23) / 9) * (-6-(-3.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -6 + (((tickAnim - 32) / 6) * (-6-(-6)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -6 + (((tickAnim - 38) / 6) * (-6-(-6)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -6 + (((tickAnim - 44) / 9) * (-7.5-(-6)));
            yy = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = -7.5 + (((tickAnim - 53) / 27) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -7.5 + (((tickAnim - 80) / 13) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-1.6-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = -1.6 + (((tickAnim - 14) / 9) * (-1.6-(-1.6)));
        }
        else if (tickAnim >= 23 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 23) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 57) * (0-(0)));
            zz = -1.6 + (((tickAnim - 23) / 57) * (-1.6-(-1.6)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = -1.6 + (((tickAnim - 80) / 13) * (0-(-1.6)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.5 + (((tickAnim - 13) / 5) * (-9.25-(-8.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -9.25 + (((tickAnim - 18) / 7) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -9.25 + (((tickAnim - 25) / 7) * (-7.75-(-9.25)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -7.75 + (((tickAnim - 32) / 13) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -7.75 + (((tickAnim - 45) / 8) * (-9-(-7.75)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -9 + (((tickAnim - 53) / 6) * (-9-(-9)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -9 + (((tickAnim - 59) / 10) * (6-(-9)));
            yy = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = 6 + (((tickAnim - 69) / 11) * (9-(6)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 9 + (((tickAnim - 80) / 13) * (0-(9)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 3.25 + (((tickAnim - 13) / 5) * (1.5-(3.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 1.5 + (((tickAnim - 18) / 7) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 1.5 + (((tickAnim - 25) / 7) * (1-(1.5)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 32) / 13) * (1-(1)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 45) / 8) * (-0.5-(1)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -0.5 + (((tickAnim - 53) / 6) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -0.5 + (((tickAnim - 59) / 10) * (8-(-0.5)));
            yy = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = 8 + (((tickAnim - 69) / 11) * (6.75-(8)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 6.75 + (((tickAnim - 80) / 13) * (0-(6.75)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -7 + (((tickAnim - 13) / 5) * (-8-(-7)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -8 + (((tickAnim - 18) / 7) * (-8-(-8)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -8 + (((tickAnim - 25) / 7) * (-10.25-(-8)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -10.25 + (((tickAnim - 32) / 13) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -10.25 + (((tickAnim - 45) / 8) * (-7.75-(-10.25)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -7.75 + (((tickAnim - 53) / 6) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -7.75 + (((tickAnim - 59) / 10) * (-13.5-(-7.75)));
            yy = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = -13.5 + (((tickAnim - 69) / 11) * (-8.5-(-13.5)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -8.5 + (((tickAnim - 80) / 13) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = -7 + (((tickAnim - 14) / 11) * (-7-(-7)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -7 + (((tickAnim - 25) / 7) * (-8.25-(-7)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -8.25 + (((tickAnim - 32) / 13) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -8.25 + (((tickAnim - 45) / 8) * (-5-(-8.25)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -5 + (((tickAnim - 53) / 6) * (-5-(-5)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -5 + (((tickAnim - 59) / 10) * (-16.25-(-5)));
            yy = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = -16.25 + (((tickAnim - 69) / 11) * (-21-(-16.25)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -21 + (((tickAnim - 80) / 13) * (0-(-21)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 22.75 + (((tickAnim - 14) / 9) * (22.75-(22.75)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 22.75 + (((tickAnim - 23) / 9) * (25.25-(22.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = 25.25 + (((tickAnim - 32) / 12) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 32) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 12) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 25.25 + (((tickAnim - 44) / 9) * (27.5-(25.25)));
            yy = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 27.5 + (((tickAnim - 53) / 27) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 27.5 + (((tickAnim - 80) / 13) * (0-(27.5)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 44) {
            xx = -4.25 + (((tickAnim - 14) / 30) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 14) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 30) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -4.25 + (((tickAnim - 44) / 9) * (-6.25-(-4.25)));
            yy = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = -6.25 + (((tickAnim - 53) / 27) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -6.25 + (((tickAnim - 80) / 13) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 7.75 + (((tickAnim - 14) / 9) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 7.75 + (((tickAnim - 23) / 9) * (6.75-(7.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = 6.75 + (((tickAnim - 32) / 12) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 32) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 12) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 6.75 + (((tickAnim - 44) / 9) * (8.25-(6.75)));
            yy = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 8.25 + (((tickAnim - 53) / 27) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 8.25 + (((tickAnim - 80) / 13) * (0-(8.25)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -23.25 + (((tickAnim - 14) / 9) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -23.25 + (((tickAnim - 23) / 9) * (-22.25-(-23.25)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = -22.25 + (((tickAnim - 32) / 12) * (-22.25-(-22.25)));
            yy = 0 + (((tickAnim - 32) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 12) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -22.25 + (((tickAnim - 44) / 36) * (-22.25-(-22.25)));
            yy = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -22.25 + (((tickAnim - 80) / 13) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.25-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = -0.35 + (((tickAnim - 14) / 9) * (-0.35-(-0.35)));
            zz = 0.25 + (((tickAnim - 14) / 9) * (0.25-(0.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 23) / 21) * (0-(0)));
            yy = -0.35 + (((tickAnim - 23) / 21) * (-0.35-(-0.35)));
            zz = 0.25 + (((tickAnim - 23) / 21) * (0.25-(0.25)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = -0.35 + (((tickAnim - 44) / 9) * (-0.2-(-0.35)));
            zz = 0.25 + (((tickAnim - 44) / 9) * (0.15-(0.25)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = -0.2 + (((tickAnim - 53) / 27) * (-0.2-(-0.2)));
            zz = 0.15 + (((tickAnim - 53) / 27) * (0.15-(0.15)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            yy = -0.2 + (((tickAnim - 80) / 13) * (0-(-0.2)));
            zz = 0.15 + (((tickAnim - 80) / 13) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-18.24022-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-1.10586-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-1.01351-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -18.24022 + (((tickAnim - 14) / 9) * (-18.24022-(-18.24022)));
            yy = -1.10586 + (((tickAnim - 14) / 9) * (-1.10586-(-1.10586)));
            zz = -1.01351 + (((tickAnim - 14) / 9) * (-1.01351-(-1.01351)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -18.24022 + (((tickAnim - 23) / 9) * (-15.49022-(-18.24022)));
            yy = -1.10586 + (((tickAnim - 23) / 9) * (-1.10586-(-1.10586)));
            zz = -1.01351 + (((tickAnim - 23) / 9) * (-1.01351-(-1.01351)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = -15.49022 + (((tickAnim - 32) / 12) * (-15.49022-(-15.49022)));
            yy = -1.10586 + (((tickAnim - 32) / 12) * (-1.10586-(-1.10586)));
            zz = -1.01351 + (((tickAnim - 32) / 12) * (-1.01351-(-1.01351)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -15.49022 + (((tickAnim - 44) / 9) * (-13.74022-(-15.49022)));
            yy = -1.10586 + (((tickAnim - 44) / 9) * (-1.10586-(-1.10586)));
            zz = -1.01351 + (((tickAnim - 44) / 9) * (-1.01351-(-1.01351)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = -13.74022 + (((tickAnim - 53) / 27) * (-13.74022-(-13.74022)));
            yy = -1.10586 + (((tickAnim - 53) / 27) * (-1.10586-(-1.10586)));
            zz = -1.01351 + (((tickAnim - 53) / 27) * (-1.01351-(-1.01351)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -13.74022 + (((tickAnim - 80) / 13) * (0-(-13.74022)));
            yy = -1.10586 + (((tickAnim - 80) / 13) * (0-(-1.10586)));
            zz = -1.01351 + (((tickAnim - 80) / 13) * (0-(-1.01351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.42-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 4.42 + (((tickAnim - 3) / 6) * (-14.64-(4.42)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -14.64 + (((tickAnim - 9) / 5) * (-12.75-(-14.64)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 80) {
            xx = -12.75 + (((tickAnim - 14) / 66) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 14) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 66) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = -12.75 + (((tickAnim - 80) / 7) * (13.55-(-12.75)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 93) {
            xx = 13.55 + (((tickAnim - 87) / 6) * (0-(13.55)));
            yy = 0 + (((tickAnim - 87) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-24.86-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -24.86 + (((tickAnim - 3) / 6) * (-19.8-(-24.86)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -19.8 + (((tickAnim - 9) / 5) * (11.75-(-19.8)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 80) {
            xx = 11.75 + (((tickAnim - 14) / 66) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 14) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 66) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 11.75 + (((tickAnim - 80) / 7) * (-26.77-(11.75)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 93) {
            xx = -26.77 + (((tickAnim - 87) / 6) * (0-(-26.77)));
            yy = 0 + (((tickAnim - 87) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (56.03-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 56.03 + (((tickAnim - 3) / 6) * (69.08-(56.03)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 69.08 + (((tickAnim - 9) / 5) * (23.75-(69.08)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 80) {
            xx = 23.75 + (((tickAnim - 14) / 66) * (23.75-(23.75)));
            yy = 0 + (((tickAnim - 14) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 66) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 23.75 + (((tickAnim - 80) / 7) * (62.08-(23.75)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 93) {
            xx = 62.08 + (((tickAnim - 87) / 6) * (0-(62.08)));
            yy = 0 + (((tickAnim - 87) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            yy = 0.225 + (((tickAnim - 3) / 11) * (0-(0.225)));
            zz = -0.2 + (((tickAnim - 3) / 11) * (0.15-(-0.2)));
        }
        else if (tickAnim >= 14 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 14) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 66) * (0-(0)));
            zz = 0.15 + (((tickAnim - 14) / 66) * (0.15-(0.15)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0.15 + (((tickAnim - 80) / 13) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -6.5 + (((tickAnim - 14) / 4) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -6.5 + (((tickAnim - 18) / 5) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -6.5 + (((tickAnim - 23) / 9) * (-5-(-6.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -5 + (((tickAnim - 32) / 9) * (-5-(-5)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 41) / 9) * (-5.75-(-5)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = -5.75 + (((tickAnim - 50) / 9) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 50) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 9) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -5.75 + (((tickAnim - 59) / 10) * (-1.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(-5.75)));
            yy = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = -1.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 69) / 11) * (0.625-(-1.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0.625 + (((tickAnim - 80) / 13) * (0-(0.625)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(torso, torso.rotateAngleX + (float) Math.toRadians(xx), torso.rotateAngleY + (float) Math.toRadians(yy), torso.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 5.5 + (((tickAnim - 7) / 7) * (-0.75-(5.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.75 + (((tickAnim - 14) / 4) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.75 + (((tickAnim - 18) / 5) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -0.75 + (((tickAnim - 23) / 9) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -0.75 + (((tickAnim - 32) / 9) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 41) / 9) * (-1.25-(-0.75)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = -1.25 + (((tickAnim - 50) / 9) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 50) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 9) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -1.25 + (((tickAnim - 59) / 10) * (7.5-(-1.25)));
            yy = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = 7.5 + (((tickAnim - 69) / 11) * (8.25-(7.5)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 8.25 + (((tickAnim - 80) / 13) * (0-(8.25)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 6.5 + (((tickAnim - 7) / 7) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 6.5 + (((tickAnim - 14) / 6) * (4.75-(6.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 4.75 + (((tickAnim - 20) / 5) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 4.75 + (((tickAnim - 25) / 7) * (6.5-(4.75)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 6.5 + (((tickAnim - 32) / 6) * (6.25-(6.5)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 6.25 + (((tickAnim - 38) / 6) * (1.10327-(6.25)));
            yy = 0 + (((tickAnim - 38) / 6) * (6.68461-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (1.12902-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 1.10327 + (((tickAnim - 44) / 9) * (5.85327-(1.10327)));
            yy = 6.68461 + (((tickAnim - 44) / 9) * (6.68461-(6.68461)));
            zz = 1.12902 + (((tickAnim - 44) / 9) * (1.12902-(1.12902)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 5.85327 + (((tickAnim - 53) / 6) * (5.85327-(5.85327)));
            yy = 6.68461 + (((tickAnim - 53) / 6) * (6.68461-(6.68461)));
            zz = 1.12902 + (((tickAnim - 53) / 6) * (1.12902-(1.12902)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 5.85327 + (((tickAnim - 59) / 10) * (-4.14673-(5.85327)));
            yy = 6.68461 + (((tickAnim - 59) / 10) * (6.68461-(6.68461)));
            zz = 1.12902 + (((tickAnim - 59) / 10) * (1.12902-(1.12902)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = -4.14673 + (((tickAnim - 69) / 11) * (-4.89673-(-4.14673)));
            yy = 6.68461 + (((tickAnim - 69) / 11) * (6.68461-(6.68461)));
            zz = 1.12902 + (((tickAnim - 69) / 11) * (1.12902-(1.12902)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -4.89673 + (((tickAnim - 80) / 13) * (0-(-4.89673)));
            yy = 6.68461 + (((tickAnim - 80) / 13) * (0-(6.68461)));
            zz = 1.12902 + (((tickAnim - 80) / 13) * (0-(1.12902)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.075-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.05-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0.075 + (((tickAnim - 25) / 7) * (0.055-(0.075)));
            zz = -0.05 + (((tickAnim - 25) / 7) * (0-(-0.05)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.055 + (((tickAnim - 32) / 6) * (0.055-(0.055)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0.055 + (((tickAnim - 38) / 6) * (0.21-(0.055)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = 0.21 + (((tickAnim - 44) / 9) * (-0.015-(0.21)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = -0.015 + (((tickAnim - 53) / 27) * (-0.015-(-0.015)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            yy = -0.015 + (((tickAnim - 80) / 13) * (0-(-0.015)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -20 + (((tickAnim - 7) / 7) * (-5.5-(-20)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 14) / 6) * (-4.25-(-5.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -4.25 + (((tickAnim - 20) / 5) * (-4.24208-(-4.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (-3.99356-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.22714-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -4.24208 + (((tickAnim - 25) / 7) * (-6.24208-(-4.24208)));
            yy = -3.99356 + (((tickAnim - 25) / 7) * (-3.99356-(-3.99356)));
            zz = -0.22714 + (((tickAnim - 25) / 7) * (-0.22714-(-0.22714)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -6.24208 + (((tickAnim - 32) / 6) * (-5.74208-(-6.24208)));
            yy = -3.99356 + (((tickAnim - 32) / 6) * (-3.99356-(-3.99356)));
            zz = -0.22714 + (((tickAnim - 32) / 6) * (-0.22714-(-0.22714)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -5.74208 + (((tickAnim - 38) / 6) * (4.34924-(-5.74208)));
            yy = -3.99356 + (((tickAnim - 38) / 6) * (7.11758-(-3.99356)));
            zz = -0.22714 + (((tickAnim - 38) / 6) * (-0.87089-(-0.22714)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 4.34924 + (((tickAnim - 44) / 9) * (-0.15076-(4.34924)));
            yy = 7.11758 + (((tickAnim - 44) / 9) * (7.11758-(7.11758)));
            zz = -0.87089 + (((tickAnim - 44) / 9) * (-0.87089-(-0.87089)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -0.15076 + (((tickAnim - 53) / 6) * (-0.15076-(-0.15076)));
            yy = 7.11758 + (((tickAnim - 53) / 6) * (7.11758-(7.11758)));
            zz = -0.87089 + (((tickAnim - 53) / 6) * (-0.87089-(-0.87089)));
        }
        else if (tickAnim >= 59 && tickAnim < 64) {
            xx = -0.15076 + (((tickAnim - 59) / 5) * (-4.40076-(-0.15076)));
            yy = 7.11758 + (((tickAnim - 59) / 5) * (7.11758-(7.11758)));
            zz = -0.87089 + (((tickAnim - 59) / 5) * (-0.87089-(-0.87089)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = -4.40076 + (((tickAnim - 64) / 5) * (-12.65076-(-4.40076)));
            yy = 7.11758 + (((tickAnim - 64) / 5) * (7.11758-(7.11758)));
            zz = -0.87089 + (((tickAnim - 64) / 5) * (-0.87089-(-0.87089)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = -12.65076 + (((tickAnim - 69) / 11) * (-12.65076-(-12.65076)));
            yy = 7.11758 + (((tickAnim - 69) / 11) * (7.11758-(7.11758)));
            zz = -0.87089 + (((tickAnim - 69) / 11) * (-0.87089-(-0.87089)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -12.65076 + (((tickAnim - 80) / 13) * (0-(-12.65076)));
            yy = 7.11758 + (((tickAnim - 80) / 13) * (0-(7.11758)));
            zz = -0.87089 + (((tickAnim - 80) / 13) * (0-(-0.87089)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = -0.575 + (((tickAnim - 7) / 7) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 25) / 7) * (0.08-(0.1)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.08 + (((tickAnim - 32) / 6) * (0.08-(0.08)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0.08 + (((tickAnim - 38) / 6) * (0.405-(0.08)));
            zz = 0 + (((tickAnim - 38) / 6) * (-0.25-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = 0.405 + (((tickAnim - 44) / 9) * (0.36-(0.405)));
            zz = -0.25 + (((tickAnim - 44) / 9) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            yy = 0.36 + (((tickAnim - 53) / 6) * (0.36-(0.36)));
            zz = -0.25 + (((tickAnim - 53) / 6) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            yy = 0.36 + (((tickAnim - 59) / 10) * (-0.115-(0.36)));
            zz = -0.25 + (((tickAnim - 59) / 10) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            yy = -0.115 + (((tickAnim - 69) / 11) * (-0.115-(-0.115)));
            zz = -0.25 + (((tickAnim - 69) / 11) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            yy = -0.115 + (((tickAnim - 80) / 13) * (0-(-0.115)));
            zz = -0.25 + (((tickAnim - 80) / 13) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 7.75 + (((tickAnim - 7) / 7) * (-6.5-(7.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -6.5 + (((tickAnim - 14) / 6) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -6.5 + (((tickAnim - 20) / 5) * (-6.51038-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (-3.22909-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.3683-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -6.51038 + (((tickAnim - 25) / 7) * (-2.76038-(-6.51038)));
            yy = -3.22909 + (((tickAnim - 25) / 7) * (-3.22909-(-3.22909)));
            zz = 0.3683 + (((tickAnim - 25) / 7) * (0.3683-(0.3683)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -2.76038 + (((tickAnim - 32) / 6) * (-2.76038-(-2.76038)));
            yy = -3.22909 + (((tickAnim - 32) / 6) * (-3.22909-(-3.22909)));
            zz = 0.3683 + (((tickAnim - 32) / 6) * (0.3683-(0.3683)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -2.76038 + (((tickAnim - 38) / 6) * (-2.75809-(-2.76038)));
            yy = -3.22909 + (((tickAnim - 38) / 6) * (-2.23025-(-3.22909)));
            zz = 0.3683 + (((tickAnim - 38) / 6) * (0.32011-(0.3683)));
        }
        else if (tickAnim >= 44 && tickAnim < 59) {
            xx = -2.75809 + (((tickAnim - 44) / 15) * (-2.75809-(-2.75809)));
            yy = -2.23025 + (((tickAnim - 44) / 15) * (-2.23025-(-2.23025)));
            zz = 0.32011 + (((tickAnim - 44) / 15) * (0.32011-(0.32011)));
        }
        else if (tickAnim >= 59 && tickAnim < 64) {
            xx = -2.75809 + (((tickAnim - 59) / 5) * (-3.50809-(-2.75809)));
            yy = -2.23025 + (((tickAnim - 59) / 5) * (-2.23025-(-2.23025)));
            zz = 0.32011 + (((tickAnim - 59) / 5) * (0.32011-(0.32011)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = -3.50809 + (((tickAnim - 64) / 5) * (-7.00809-(-3.50809)));
            yy = -2.23025 + (((tickAnim - 64) / 5) * (-2.23025-(-2.23025)));
            zz = 0.32011 + (((tickAnim - 64) / 5) * (0.32011-(0.32011)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = -7.00809 + (((tickAnim - 69) / 11) * (-7.00809-(-7.00809)));
            yy = -2.23025 + (((tickAnim - 69) / 11) * (-2.23025-(-2.23025)));
            zz = 0.32011 + (((tickAnim - 69) / 11) * (0.32011-(0.32011)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -7.00809 + (((tickAnim - 80) / 13) * (0-(-7.00809)));
            yy = -2.23025 + (((tickAnim - 80) / 13) * (0-(-2.23025)));
            zz = 0.32011 + (((tickAnim - 80) / 13) * (0-(0.32011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 25) / 7) * (0.08-(0.1)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.08 + (((tickAnim - 32) / 6) * (0.08-(0.08)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0.08 + (((tickAnim - 38) / 6) * (0.33-(0.08)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = 0.33 + (((tickAnim - 44) / 9) * (0.255-(0.33)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0.255 + (((tickAnim - 53) / 27) * (0.255-(0.255)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            yy = 0.255 + (((tickAnim - 80) / 13) * (0-(0.255)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -3.75 + (((tickAnim - 7) / 7) * (12.5-(-3.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 14) / 6) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 12.5 + (((tickAnim - 20) / 5) * (6.76831-(12.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (-3.44676-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.6085-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 6.76831 + (((tickAnim - 25) / 7) * (0.51831-(6.76831)));
            yy = -3.44676 + (((tickAnim - 25) / 7) * (-3.44676-(-3.44676)));
            zz = -0.6085 + (((tickAnim - 25) / 7) * (-0.6085-(-0.6085)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0.51831 + (((tickAnim - 32) / 6) * (0.51831-(0.51831)));
            yy = -3.44676 + (((tickAnim - 32) / 6) * (-3.44676-(-3.44676)));
            zz = -0.6085 + (((tickAnim - 32) / 6) * (-0.6085-(-0.6085)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0.51831 + (((tickAnim - 38) / 3) * (0.52138-(0.51831)));
            yy = -3.44676 + (((tickAnim - 38) / 3) * (1.3004-(-3.44676)));
            zz = -0.6085 + (((tickAnim - 38) / 3) * (-0.77261-(-0.6085)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 0.52138 + (((tickAnim - 41) / 3) * (0-(0.52138)));
            yy = 1.3004 + (((tickAnim - 41) / 3) * (0-(1.3004)));
            zz = -0.77261 + (((tickAnim - 41) / 3) * (0-(-0.77261)));
        }
        else if (tickAnim >= 44 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 44) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 15) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 59) / 5) * (6.25-(0)));
            yy = 0 + (((tickAnim - 59) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 5) * (3.75-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = 6.25 + (((tickAnim - 64) / 5) * (12.75-(6.25)));
            yy = 0 + (((tickAnim - 64) / 5) * (0-(0)));
            zz = 3.75 + (((tickAnim - 64) / 5) * (3.75-(3.75)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = 12.75 + (((tickAnim - 69) / 11) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 3.75 + (((tickAnim - 69) / 11) * (3.75-(3.75)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 12.75 + (((tickAnim - 80) / 13) * (0-(12.75)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 3.75 + (((tickAnim - 80) / 13) * (0-(3.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.075-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0.075 + (((tickAnim - 25) / 7) * (0.055-(0.075)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.055 + (((tickAnim - 32) / 6) * (0.055-(0.055)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0.055 + (((tickAnim - 38) / 6) * (0.16-(0.055)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = 0.16 + (((tickAnim - 44) / 9) * (0.11-(0.16)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0.11 + (((tickAnim - 53) / 27) * (0.11-(0.11)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            yy = 0.11 + (((tickAnim - 80) / 13) * (0-(0.11)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 18) / 2) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -6.5 + (((tickAnim - 40) / 3) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 10 + (((tickAnim - 7) / 7) * (0-(10)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (11.5-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 11.5 + (((tickAnim - 25) / 7) * (15.75-(11.5)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 15.75 + (((tickAnim - 32) / 6) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 15.75 + (((tickAnim - 38) / 3) * (15.94639-(15.75)));
            yy = 0 + (((tickAnim - 38) / 3) * (10.80461-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (2.07644-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 15.94639 + (((tickAnim - 41) / 3) * (15.75-(15.94639)));
            yy = 10.80461 + (((tickAnim - 41) / 3) * (0-(10.80461)));
            zz = 2.07644 + (((tickAnim - 41) / 3) * (0-(2.07644)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 15.75 + (((tickAnim - 44) / 9) * (17.5-(15.75)));
            yy = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = 17.5 + (((tickAnim - 53) / 1) * (16.75-(17.5)));
            yy = 0 + (((tickAnim - 53) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 1) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = 16.75 + (((tickAnim - 54) / 2) * (17.5-(16.75)));
            yy = 0 + (((tickAnim - 54) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 2) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = 17.5 + (((tickAnim - 56) / 2) * (16.75-(17.5)));
            yy = 0 + (((tickAnim - 56) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 2) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 59) {
            xx = 16.75 + (((tickAnim - 58) / 1) * (17.5-(16.75)));
            yy = 0 + (((tickAnim - 58) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 1) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 17.5 + (((tickAnim - 59) / 4) * (12.15169-(17.5)));
            yy = 0 + (((tickAnim - 59) / 4) * (-0.54047-(0)));
            zz = 0 + (((tickAnim - 59) / 4) * (0.71331-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 12.15169 + (((tickAnim - 63) / 17) * (12.15169-(12.15169)));
            yy = -0.54047 + (((tickAnim - 63) / 17) * (-0.54047-(-0.54047)));
            zz = 0.71331 + (((tickAnim - 63) / 17) * (0.71331-(0.71331)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 12.15169 + (((tickAnim - 80) / 13) * (0-(12.15169)));
            yy = -0.54047 + (((tickAnim - 80) / 13) * (0-(-0.54047)));
            zz = 0.71331 + (((tickAnim - 80) / 13) * (0-(0.71331)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.075-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0.075 + (((tickAnim - 25) / 7) * (0.06-(0.075)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.06 + (((tickAnim - 32) / 6) * (0.06-(0.06)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0.06 + (((tickAnim - 38) / 6) * (0.06-(0.06)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            yy = 0.06 + (((tickAnim - 44) / 36) * (0.06-(0.06)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            yy = 0.06 + (((tickAnim - 80) / 13) * (0-(0.06)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-1.1-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -1.1 + (((tickAnim - 14) / 9) * (-1.1-(-1.1)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -1.1 + (((tickAnim - 23) / 15) * (6.26-(-1.1)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 6.26 + (((tickAnim - 38) / 6) * (6.26-(6.26)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 6.26 + (((tickAnim - 44) / 9) * (16.25-(6.26)));
            yy = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 16.25 + (((tickAnim - 53) / 6) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 16.25 + (((tickAnim - 59) / 21) * (10.75-(16.25)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 10.75 + (((tickAnim - 80) / 13) * (0-(10.75)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-1.1-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -1.1 + (((tickAnim - 14) / 9) * (-1.1-(-1.1)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -1.1 + (((tickAnim - 23) / 15) * (7.85-(-1.1)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 7.85 + (((tickAnim - 38) / 6) * (7.85-(7.85)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 7.85 + (((tickAnim - 44) / 9) * (16.25-(7.85)));
            yy = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 16.25 + (((tickAnim - 53) / 6) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 16.25 + (((tickAnim - 59) / 21) * (10.75-(16.25)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 10.75 + (((tickAnim - 80) / 13) * (0-(10.75)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBannykus entity = (EntityPrehistoricFloraBannykus) entitylivingbaseIn;
        int animCycle = 18;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 9.25 + (((tickAnim - 10) / 8) * (0-(9.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -8.75 + (((tickAnim - 10) / 3) * (-6.25-(-8.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -6.25 + (((tickAnim - 13) / 5) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -8 + (((tickAnim - 10) / 3) * (-2.5-(-8)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.5 + (((tickAnim - 13) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 9.75 + (((tickAnim - 10) / 3) * (-7-(9.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -7 + (((tickAnim - 13) / 5) * (0-(-7)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20 + (((tickAnim - 10) / 3) * (7.25-(-20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 7.25 + (((tickAnim - 13) / 5) * (0-(7.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 13.75 + (((tickAnim - 10) / 8) * (0-(13.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 35.75 + (((tickAnim - 10) / 3) * (0-(35.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -9.75 + (((tickAnim - 10) / 8) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -15.5 + (((tickAnim - 10) / 8) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBannykus entity = (EntityPrehistoricFloraBannykus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18.5 + (((tickAnim - 15) / 20) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18.5 + (((tickAnim - 35) / 15) * (0-(-18.5)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-6.725-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -6.725 + (((tickAnim - 15) / 20) * (-6.725-(-6.725)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -6.725 + (((tickAnim - 35) / 15) * (0-(-6.725)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.45479-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (5.44616-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8.69119-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8.45479 + (((tickAnim - 15) / 20) * (-8.45479-(-8.45479)));
            yy = 5.44616 + (((tickAnim - 15) / 20) * (5.44616-(5.44616)));
            zz = -8.69119 + (((tickAnim - 15) / 20) * (-8.69119-(-8.69119)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.45479 + (((tickAnim - 35) / 15) * (0-(-8.45479)));
            yy = 5.44616 + (((tickAnim - 35) / 15) * (0-(5.44616)));
            zz = -8.69119 + (((tickAnim - 35) / 15) * (0-(-8.69119)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.46158-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.8652-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.2235-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.46158 + (((tickAnim - 15) / 20) * (7.46158-(7.46158)));
            yy = 21.8652 + (((tickAnim - 15) / 20) * (21.8652-(21.8652)));
            zz = -6.2235 + (((tickAnim - 15) / 20) * (-6.2235-(-6.2235)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.46158 + (((tickAnim - 35) / 15) * (0-(7.46158)));
            yy = 21.8652 + (((tickAnim - 35) / 15) * (0-(21.8652)));
            zz = -6.2235 + (((tickAnim - 35) / 15) * (0-(-6.2235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.73964-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (8.48061-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-19.85453-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.73964 + (((tickAnim - 15) / 20) * (3.73964-(3.73964)));
            yy = 8.48061 + (((tickAnim - 15) / 20) * (8.48061-(8.48061)));
            zz = -19.85453 + (((tickAnim - 15) / 20) * (-19.85453-(-19.85453)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.73964 + (((tickAnim - 35) / 15) * (0-(3.73964)));
            yy = 8.48061 + (((tickAnim - 35) / 15) * (0-(8.48061)));
            zz = -19.85453 + (((tickAnim - 35) / 15) * (0-(-19.85453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.92701-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.19156-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-23.02205-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -22.92701 + (((tickAnim - 15) / 20) * (-22.92701-(-22.92701)));
            yy = 6.19156 + (((tickAnim - 15) / 20) * (6.19156-(6.19156)));
            zz = -23.02205 + (((tickAnim - 15) / 20) * (-23.02205-(-23.02205)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -22.92701 + (((tickAnim - 35) / 15) * (0-(-22.92701)));
            yy = 6.19156 + (((tickAnim - 35) / 15) * (0-(6.19156)));
            zz = -23.02205 + (((tickAnim - 35) / 15) * (0-(-23.02205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.94206-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (11.0424-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.9766-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.94206 + (((tickAnim - 15) / 20) * (5.94206-(5.94206)));
            yy = 11.0424 + (((tickAnim - 15) / 20) * (11.0424-(11.0424)));
            zz = 6.9766 + (((tickAnim - 15) / 20) * (6.9766-(6.9766)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.94206 + (((tickAnim - 35) / 15) * (0-(5.94206)));
            yy = 11.0424 + (((tickAnim - 35) / 15) * (0-(11.0424)));
            zz = 6.9766 + (((tickAnim - 35) / 15) * (0-(6.9766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 39 + (((tickAnim - 15) / 20) * (39-(39)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 39 + (((tickAnim - 35) / 15) * (0-(39)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.575 + (((tickAnim - 15) / 20) * (0.575-(0.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.575 + (((tickAnim - 35) / 15) * (0-(0.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-94.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -94.25 + (((tickAnim - 15) / 20) * (-94.25-(-94.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -94.25 + (((tickAnim - 35) / 15) * (0-(-94.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -1.55 + (((tickAnim - 15) / 20) * (-1.55-(-1.55)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.55 + (((tickAnim - 35) / 15) * (0-(-1.55)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (70.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 70.75 + (((tickAnim - 15) / 20) * (70.75-(70.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 70.75 + (((tickAnim - 35) / 15) * (0-(70.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.075-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.075 + (((tickAnim - 15) / 20) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.075 + (((tickAnim - 35) / 15) * (0-(-0.075)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (5.94206-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.0424-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.9766-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.94206 + (((tickAnim - 15) / 20) * (5.94206-(5.94206)));
            yy = -11.0424 + (((tickAnim - 15) / 20) * (-11.0424-(-11.0424)));
            zz = -6.9766 + (((tickAnim - 15) / 20) * (-6.9766-(-6.9766)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.94206 + (((tickAnim - 35) / 15) * (0-(5.94206)));
            yy = -11.0424 + (((tickAnim - 35) / 15) * (0-(-11.0424)));
            zz = -6.9766 + (((tickAnim - 35) / 15) * (0-(-6.9766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 39 + (((tickAnim - 15) / 20) * (39-(39)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 39 + (((tickAnim - 35) / 15) * (0-(39)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.575 + (((tickAnim - 15) / 20) * (0.575-(0.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.575 + (((tickAnim - 35) / 15) * (0-(0.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-94.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -94.25 + (((tickAnim - 15) / 20) * (-94.25-(-94.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -94.25 + (((tickAnim - 35) / 15) * (0-(-94.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -1.55 + (((tickAnim - 15) / 20) * (-1.55-(-1.55)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.55 + (((tickAnim - 35) / 15) * (0-(-1.55)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (70.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 70.75 + (((tickAnim - 15) / 20) * (70.75-(70.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 70.75 + (((tickAnim - 35) / 15) * (0-(70.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.075-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.075 + (((tickAnim - 15) / 20) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.075 + (((tickAnim - 35) / 15) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.5 + (((tickAnim - 15) / 20) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 35) / 15) * (0-(13.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(torso, torso.rotateAngleX + (float) Math.toRadians(xx), torso.rotateAngleY + (float) Math.toRadians(yy), torso.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.75 + (((tickAnim - 15) / 20) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 35) / 15) * (0-(10.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.75 + (((tickAnim - 15) / 20) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 35) / 15) * (0-(13.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 20) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 35) / 15) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -9 + (((tickAnim - 15) / 20) * (-9-(-9)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 35) / 15) * (0-(-9)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 15) / 20) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 35) / 15) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-24.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -24.25 + (((tickAnim - 15) / 20) * (-24.25-(-24.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -24.25 + (((tickAnim - 35) / 15) * (0-(-24.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (24.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 24.25 + (((tickAnim - 15) / 20) * (24.25-(24.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 24.25 + (((tickAnim - 35) / 15) * (0-(24.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBannykus entity = (EntityPrehistoricFloraBannykus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 19.25 + (((tickAnim - 9) / 11) * (0-(19.25)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (47.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 47.5 + (((tickAnim - 9) / 2) * (46.5-(47.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 46.5 + (((tickAnim - 11) / 9) * (0-(46.5)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 20.75 + (((tickAnim - 9) / 11) * (0-(20.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -24.25 + (((tickAnim - 9) / 11) * (0-(-24.25)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 24.25 + (((tickAnim - 5) / 4) * (8.25-(24.25)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 8.25 + (((tickAnim - 9) / 2) * (12.25-(8.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 12.25 + (((tickAnim - 11) / 9) * (0-(12.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (25.25-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 25.25 + (((tickAnim - 9) / 2) * (0-(25.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBannykus entity = (EntityPrehistoricFloraBannykus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -1 + (((tickAnim - 2) / 3) * (31.25-(-1)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.25 + (((tickAnim - 5) / 5) * (0-(31.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -0.75 + (((tickAnim - 2) / 3) * (21-(-0.75)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 5) / 5) * (0-(21)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 5.25 + (((tickAnim - 2) / 3) * (-25.75-(5.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25.75 + (((tickAnim - 5) / 5) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 6.25 + (((tickAnim - 2) / 3) * (-16.75-(6.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -16.75 + (((tickAnim - 5) / 5) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 2) / 3) * (-14.25-(3)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -14.25 + (((tickAnim - 5) / 5) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 12 + (((tickAnim - 2) / 3) * (42.5-(12)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 42.5 + (((tickAnim - 5) / 2) * (0-(42.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBannykus entity = (EntityPrehistoricFloraBannykus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 7.25 + (((tickAnim - 0) / 20) * (-8-(7.25)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -8 + (((tickAnim - 20) / 15) * (7.25-(-8)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = 7.25 + (((tickAnim - 35) / 9) * (-14-(7.25)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = -14 + (((tickAnim - 44) / 4) * (0.64-(-14)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.64 + (((tickAnim - 48) / 2) * (7.25-(0.64)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 13.25 + (((tickAnim - 0) / 20) * (-4.25-(13.25)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -4.25 + (((tickAnim - 20) / 15) * (13.25-(-4.25)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = 13.25 + (((tickAnim - 35) / 4) * (0.02-(13.25)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 0.02 + (((tickAnim - 39) / 5) * (-1-(0.02)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = -1 + (((tickAnim - 44) / 4) * (6.32-(-1)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 6.32 + (((tickAnim - 48) / 2) * (13.25-(6.32)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -11 + (((tickAnim - 0) / 5) * (13.35-(-11)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 13.35 + (((tickAnim - 5) / 15) * (-1.25-(13.35)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -1.25 + (((tickAnim - 20) / 5) * (-12-(-1.25)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -12 + (((tickAnim - 25) / 10) * (-11-(-12)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = -11 + (((tickAnim - 35) / 4) * (10.32-(-11)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 10.32 + (((tickAnim - 39) / 5) * (5-(10.32)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 5 + (((tickAnim - 44) / 4) * (-13-(5)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = -13 + (((tickAnim - 48) / 2) * (-11-(-13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -13.25 + (((tickAnim - 0) / 5) * (11.62-(-13.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 11.62 + (((tickAnim - 5) / 15) * (-3.5-(11.62)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -3.5 + (((tickAnim - 20) / 5) * (-12.33-(-3.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -12.33 + (((tickAnim - 25) / 10) * (-13.25-(-12.33)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = -13.25 + (((tickAnim - 35) / 4) * (16.41-(-13.25)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 16.41 + (((tickAnim - 39) / 5) * (3-(16.41)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 3 + (((tickAnim - 44) / 4) * (-20.21-(3)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = -20.21 + (((tickAnim - 48) / 2) * (-13.25-(-20.21)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -28 + (((tickAnim - 0) / 20) * (15.75-(-28)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 15.75 + (((tickAnim - 20) / 15) * (-28-(15.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = -28 + (((tickAnim - 35) / 9) * (15.75-(-28)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 15.75 + (((tickAnim - 44) / 6) * (-28-(15.75)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -24.5 + (((tickAnim - 0) / 20) * (24.5-(-24.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 24.5 + (((tickAnim - 20) / 15) * (-24.5-(24.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = -24.5 + (((tickAnim - 35) / 9) * (24.5-(-24.5)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 24.5 + (((tickAnim - 44) / 6) * (-24.5-(24.5)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 20) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = -0.4 + (((tickAnim - 35) / 9) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
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
            xx = 33.31146 + (((tickAnim - 0) / 20) * (20.34172-(33.31146)));
            yy = -2.88987 + (((tickAnim - 0) / 20) * (-0.22576-(-2.88987)));
            zz = -2.1306 + (((tickAnim - 0) / 20) * (1.71885-(-2.1306)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 20.34172 + (((tickAnim - 20) / 9) * (-58.39396-(20.34172)));
            yy = -0.22576 + (((tickAnim - 20) / 9) * (-1.40981-(-0.22576)));
            zz = 1.71885 + (((tickAnim - 20) / 9) * (0.00798-(1.71885)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -58.39396 + (((tickAnim - 29) / 2) * (-33.54125-(-58.39396)));
            yy = -1.40981 + (((tickAnim - 29) / 2) * (-2.14984-(-1.40981)));
            zz = 0.00798 + (((tickAnim - 29) / 2) * (-1.06131-(0.00798)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -33.54125 + (((tickAnim - 31) / 4) * (33.31146-(-33.54125)));
            yy = -2.14984 + (((tickAnim - 31) / 4) * (-2.88987-(-2.14984)));
            zz = -1.06131 + (((tickAnim - 31) / 4) * (-2.1306-(-1.06131)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 33.31146 + (((tickAnim - 35) / 9) * (20.34172-(33.31146)));
            yy = -2.88987 + (((tickAnim - 35) / 9) * (-0.22576-(-2.88987)));
            zz = -2.1306 + (((tickAnim - 35) / 9) * (1.71885-(-2.1306)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 20.34172 + (((tickAnim - 44) / 3) * (-32.44982-(20.34172)));
            yy = -0.22576 + (((tickAnim - 44) / 3) * (-1.36752-(-0.22576)));
            zz = 1.71885 + (((tickAnim - 44) / 3) * (0.06909-(1.71885)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = -32.44982 + (((tickAnim - 47) / 1) * (-45.89418-(-32.44982)));
            yy = -1.36752 + (((tickAnim - 47) / 1) * (-2.1287-(-1.36752)));
            zz = 0.06909 + (((tickAnim - 47) / 1) * (-1.03076-(0.06909)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -45.89418 + (((tickAnim - 48) / 2) * (33.31146-(-45.89418)));
            yy = -2.1287 + (((tickAnim - 48) / 2) * (-2.88987-(-2.1287)));
            zz = -1.03076 + (((tickAnim - 48) / 2) * (-2.1306-(-1.03076)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 20) * (0-(-0.525)));
            zz = -0.2 + (((tickAnim - 0) / 20) * (-0.4-(-0.2)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (-0.525-(0)));
            zz = -0.4 + (((tickAnim - 20) / 15) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = -0.525 + (((tickAnim - 35) / 9) * (0-(-0.525)));
            zz = -0.2 + (((tickAnim - 35) / 9) * (-0.4-(-0.2)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (-0.525-(0)));
            zz = -0.4 + (((tickAnim - 44) / 6) * (-0.2-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19.25 + (((tickAnim - 0) / 5) * (-3.37-(19.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.37 + (((tickAnim - 5) / 5) * (-20-(-3.37)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -20 + (((tickAnim - 10) / 4) * (-14.81-(-20)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -14.81 + (((tickAnim - 14) / 6) * (105.25-(-14.81)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 105.25 + (((tickAnim - 20) / 3) * (77.02-(105.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 77.02 + (((tickAnim - 23) / 4) * (93.28-(77.02)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 93.28 + (((tickAnim - 27) / 4) * (81.76-(93.28)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 81.76 + (((tickAnim - 31) / 4) * (19.25-(81.76)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 19.25 + (((tickAnim - 35) / 3) * (-3.88-(19.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -3.88 + (((tickAnim - 38) / 2) * (-13.34-(-3.88)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -13.34 + (((tickAnim - 40) / 4) * (105.25-(-13.34)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 105.25 + (((tickAnim - 44) / 3) * (69.79-(105.25)));
            yy = 0 + (((tickAnim - 44) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 3) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 69.79 + (((tickAnim - 47) / 1) * (80.32-(69.79)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 80.32 + (((tickAnim - 48) / 2) * (19.25-(80.32)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 5) * (0.905-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.905 + (((tickAnim - 5) / 5) * (0.9-(0.905)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.9 + (((tickAnim - 10) / 4) * (0-(0.9)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0.7-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 20) / 3) * (1.3-(-0.05)));
            zz = 0.7 + (((tickAnim - 20) / 3) * (0.365-(0.7)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 1.3 + (((tickAnim - 23) / 8) * (0.43-(1.3)));
            zz = 0.365 + (((tickAnim - 23) / 8) * (0.455-(0.365)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 0.43 + (((tickAnim - 31) / 4) * (-0.05-(0.43)));
            zz = 0.455 + (((tickAnim - 31) / 4) * (0-(0.455)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 35) / 3) * (1.16-(-0.05)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 1.16 + (((tickAnim - 38) / 2) * (0.525-(1.16)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            yy = 0.525 + (((tickAnim - 40) / 4) * (-0.05-(0.525)));
            zz = 0 + (((tickAnim - 40) / 4) * (0.7-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 44) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 44) / 3) * (0.625-(-0.05)));
            zz = 0.7 + (((tickAnim - 44) / 3) * (0.3-(0.7)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 47) / 3) * (-0.05-(0.625)));
            zz = 0.3 + (((tickAnim - 47) / 3) * (0-(0.3)));
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
            xx = 6.61037 + (((tickAnim - 0) / 20) * (6.80692-(6.61037)));
            yy = -2.52361 + (((tickAnim - 0) / 20) * (-1.30493-(-2.52361)));
            zz = 3.5633 + (((tickAnim - 0) / 20) * (-2.31502-(3.5633)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 6.80692 + (((tickAnim - 20) / 15) * (6.61037-(6.80692)));
            yy = -1.30493 + (((tickAnim - 20) / 15) * (-2.52361-(-1.30493)));
            zz = -2.31502 + (((tickAnim - 20) / 15) * (3.5633-(-2.31502)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 6.61037 + (((tickAnim - 35) / 9) * (6.80692-(6.61037)));
            yy = -2.52361 + (((tickAnim - 35) / 9) * (-1.30493-(-2.52361)));
            zz = 3.5633 + (((tickAnim - 35) / 9) * (-2.31502-(3.5633)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 6.80692 + (((tickAnim - 44) / 6) * (6.61037-(6.80692)));
            yy = -1.30493 + (((tickAnim - 44) / 6) * (-2.52361-(-1.30493)));
            zz = -2.31502 + (((tickAnim - 44) / 6) * (3.5633-(-2.31502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(torso, torso.rotateAngleX + (float) Math.toRadians(xx), torso.rotateAngleY + (float) Math.toRadians(yy), torso.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -0.12548 + (((tickAnim - 0) / 20) * (0.24823-(-0.12548)));
            yy = -9.56455 + (((tickAnim - 0) / 20) * (-9.36602-(-9.56455)));
            zz = 0.75768 + (((tickAnim - 0) / 20) * (-1.51449-(0.75768)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0.24823 + (((tickAnim - 20) / 15) * (-0.12548-(0.24823)));
            yy = -9.36602 + (((tickAnim - 20) / 15) * (-9.56455-(-9.36602)));
            zz = -1.51449 + (((tickAnim - 20) / 15) * (0.75768-(-1.51449)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = -0.12548 + (((tickAnim - 35) / 9) * (0.24823-(-0.12548)));
            yy = -9.56455 + (((tickAnim - 35) / 9) * (-9.36602-(-9.56455)));
            zz = 0.75768 + (((tickAnim - 35) / 9) * (-1.51449-(0.75768)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0.24823 + (((tickAnim - 44) / 6) * (-0.12548-(0.24823)));
            yy = -9.36602 + (((tickAnim - 44) / 6) * (-9.56455-(-9.36602)));
            zz = -1.51449 + (((tickAnim - 44) / 6) * (0.75768-(-1.51449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 11.07561 + (((tickAnim - 0) / 20) * (7.91575-(11.07561)));
            yy = -15.9553 + (((tickAnim - 0) / 20) * (-15.36355-(-15.9553)));
            zz = 2.55503 + (((tickAnim - 0) / 20) * (14.22406-(2.55503)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 7.91575 + (((tickAnim - 20) / 15) * (11.07561-(7.91575)));
            yy = -15.36355 + (((tickAnim - 20) / 15) * (-15.9553-(-15.36355)));
            zz = 14.22406 + (((tickAnim - 20) / 15) * (2.55503-(14.22406)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 11.07561 + (((tickAnim - 35) / 9) * (7.91575-(11.07561)));
            yy = -15.9553 + (((tickAnim - 35) / 9) * (-15.36355-(-15.9553)));
            zz = 2.55503 + (((tickAnim - 35) / 9) * (14.22406-(2.55503)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 7.91575 + (((tickAnim - 44) / 6) * (11.07561-(7.91575)));
            yy = -15.36355 + (((tickAnim - 44) / 6) * (-15.9553-(-15.36355)));
            zz = 14.22406 + (((tickAnim - 44) / 6) * (2.55503-(14.22406)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 35) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.175 + (((tickAnim - 35) / 15) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -2.83166 + (((tickAnim - 0) / 20) * (-5.02312-(-2.83166)));
            yy = -24.24503 + (((tickAnim - 0) / 20) * (-22.7591-(-24.24503)));
            zz = 6.69406 + (((tickAnim - 0) / 20) * (12.18545-(6.69406)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -5.02312 + (((tickAnim - 20) / 15) * (-2.83166-(-5.02312)));
            yy = -22.7591 + (((tickAnim - 20) / 15) * (-24.24503-(-22.7591)));
            zz = 12.18545 + (((tickAnim - 20) / 15) * (6.69406-(12.18545)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = -2.83166 + (((tickAnim - 35) / 9) * (-5.02312-(-2.83166)));
            yy = -24.24503 + (((tickAnim - 35) / 9) * (-22.7591-(-24.24503)));
            zz = 6.69406 + (((tickAnim - 35) / 9) * (12.18545-(6.69406)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -5.02312 + (((tickAnim - 44) / 6) * (-2.83166-(-5.02312)));
            yy = -22.7591 + (((tickAnim - 44) / 6) * (-24.24503-(-22.7591)));
            zz = 12.18545 + (((tickAnim - 44) / 6) * (6.69406-(12.18545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(1.80189), neck3.rotateAngleY + (float) Math.toRadians(-16.01808), neck3.rotateAngleZ + (float) Math.toRadians(-6.10978));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-9.5), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBannykus entity = (EntityPrehistoricFloraBannykus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 25.25 + (((tickAnim - 0) / 6) * (-5.18877-(25.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.68744-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.9403-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -5.18877 + (((tickAnim - 6) / 3) * (-20.49363-(-5.18877)));
            yy = 0.68744 + (((tickAnim - 6) / 3) * (-1.03013-(0.68744)));
            zz = -0.9403 + (((tickAnim - 6) / 3) * (-0.70808-(-0.9403)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -20.49363 + (((tickAnim - 9) / 12) * (25.25-(-20.49363)));
            yy = -1.03013 + (((tickAnim - 9) / 12) * (0-(-1.03013)));
            zz = -0.70808 + (((tickAnim - 9) / 12) * (0-(-0.70808)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.75 + (((tickAnim - 0) / 3) * (20.5-(1.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 20.5 + (((tickAnim - 3) / 6) * (-14.75-(20.5)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -14.75 + (((tickAnim - 9) / 12) * (1.75-(-14.75)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.375-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.525 + (((tickAnim - 8) / 1) * (0-(0.525)));
            zz = -0.375 + (((tickAnim - 8) / 1) * (0-(-0.375)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
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
            xx = 12.75 + (((tickAnim - 0) / 3) * (25.07-(12.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 25.07 + (((tickAnim - 3) / 2) * (-21.42-(25.07)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -21.42 + (((tickAnim - 5) / 3) * (-27.37-(-21.42)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -27.37 + (((tickAnim - 8) / 1) * (15.75-(-27.37)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 15.75 + (((tickAnim - 9) / 12) * (12.75-(15.75)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5 + (((tickAnim - 0) / 3) * (48.91-(27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 48.91 + (((tickAnim - 3) / 2) * (73.2-(48.91)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 73.2 + (((tickAnim - 5) / 3) * (72.48-(73.2)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 72.48 + (((tickAnim - 8) / 1) * (18-(72.48)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 18 + (((tickAnim - 9) / 5) * (-4.43-(18)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -4.43 + (((tickAnim - 14) / 7) * (27.5-(-4.43)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -0.225 + (((tickAnim - 5) / 3) * (-0.25-(-0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0.125-(0)));
            zz = -0.25 + (((tickAnim - 8) / 1) * (-0.225-(-0.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 9) / 5) * (0.675-(0.125)));
            zz = -0.225 + (((tickAnim - 9) / 5) * (-0.425-(-0.225)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0.675 + (((tickAnim - 14) / 7) * (0-(0.675)));
            zz = -0.425 + (((tickAnim - 14) / 7) * (0-(-0.425)));
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
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-43-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -43 + (((tickAnim - 18) / 3) * (0-(-43)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 18) / 3) * (0-(0.45)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
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
            xx = -20.49363 + (((tickAnim - 0) / 10) * (25.25-(-20.49363)));
            yy = -1.03013 + (((tickAnim - 0) / 10) * (0-(-1.03013)));
            zz = -0.70808 + (((tickAnim - 0) / 10) * (0-(-0.70808)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 25.25 + (((tickAnim - 10) / 7) * (-5.18877-(25.25)));
            yy = 0 + (((tickAnim - 10) / 7) * (-2.1624-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0.5153-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -5.18877 + (((tickAnim - 17) / 4) * (-20.49363-(-5.18877)));
            yy = -2.1624 + (((tickAnim - 17) / 4) * (-1.03013-(-2.1624)));
            zz = 0.5153 + (((tickAnim - 17) / 4) * (-0.70808-(0.5153)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -14.75 + (((tickAnim - 0) / 10) * (1.75-(-14.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1.75 + (((tickAnim - 10) / 3) * (20.5-(1.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 20.5 + (((tickAnim - 13) / 8) * (-14.75-(20.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0.525-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (-0.375-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 18) / 3) * (0-(0.525)));
            zz = -0.375 + (((tickAnim - 18) / 3) * (0-(-0.375)));
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
            xx = 15.75 + (((tickAnim - 0) / 10) * (12.75-(15.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.75 + (((tickAnim - 10) / 3) * (25.07-(12.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 25.07 + (((tickAnim - 13) / 3) * (-21.42-(25.07)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -21.42 + (((tickAnim - 16) / 2) * (-27.37-(-21.42)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -27.37 + (((tickAnim - 18) / 3) * (15.75-(-27.37)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18 + (((tickAnim - 0) / 5) * (-9.68-(18)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -9.68 + (((tickAnim - 5) / 5) * (27.5-(-9.68)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 27.5 + (((tickAnim - 10) / 3) * (48.91-(27.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 48.91 + (((tickAnim - 13) / 3) * (73.2-(48.91)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 73.2 + (((tickAnim - 16) / 2) * (72.48-(73.2)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 72.48 + (((tickAnim - 18) / 3) * (18-(72.48)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 5) / 5) * (0-(0.4)));
            zz = -0.425 + (((tickAnim - 5) / 5) * (0-(-0.425)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = -0.225 + (((tickAnim - 16) / 2) * (-0.25-(-0.225)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = -0.25 + (((tickAnim - 18) / 3) * (0-(-0.25)));
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
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-36.25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -36.25 + (((tickAnim - 8) / 2) * (0-(-36.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.45-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 8) / 2) * (0-(0.45)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+140))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+50))*-1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521-50))*0.35);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+50))*0.25);
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+200))*-1.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+100))*5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725-50))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+250))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+150))*8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725-100))*3));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-12.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+300))*-5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+100))*8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725-150))*3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+350))*10), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+150))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725-200))*5));
        this.setRotateAngle(torso, torso.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+50))*-1.2), torso.rotateAngleY + (float) Math.toRadians(0), torso.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+50))*2));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+180))*-2.2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+50))*-2));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+200))*-2.2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725))*-2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+250))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725-50))*-2));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+300))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725-100))*2));
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+150))*-3.2), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+50))*-2));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+250))*-3.2), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+300))*3.2), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+100))*3));
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+150))*-3.2), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+50))*-2));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+250))*-3.2), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.521+300))*3.2), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.725+100))*3));
       
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBannykus entity = (EntityPrehistoricFloraBannykus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626+20))*3.5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626-50))*-0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626-50)));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626))*4.5), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626+200))*4.5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626+250))*8.5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626+450))*-2.5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*2.5));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 44.49483 + (((tickAnim - 0) / 7) * (-24.59829-(44.49483)));
            yy = 4.74837 + (((tickAnim - 0) / 7) * (-0.96632-(4.74837)));
            zz = -0.12463 + (((tickAnim - 0) / 7) * (-3.26963-(-0.12463)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -24.59829 + (((tickAnim - 7) / 6) * (44.49483-(-24.59829)));
            yy = -0.96632 + (((tickAnim - 7) / 6) * (4.74837-(-0.96632)));
            zz = -3.26963 + (((tickAnim - 7) / 6) * (-0.12463-(-3.26963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 6.75 + (((tickAnim - 0) / 2) * (15.88-(6.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 15.88 + (((tickAnim - 2) / 3) * (-26.12-(15.88)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -26.12 + (((tickAnim - 5) / 2) * (-27.5-(-26.12)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -27.5 + (((tickAnim - 7) / 6) * (6.75-(-27.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.855-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.63-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.855 + (((tickAnim - 3) / 2) * (0.575-(0.855)));
            zz = -1.63 + (((tickAnim - 3) / 2) * (-0.35-(-1.63)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 5) / 2) * (-1.025-(0.575)));
            zz = -0.35 + (((tickAnim - 5) / 2) * (0.325-(-0.35)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -1.025 + (((tickAnim - 7) / 2) * (0-(-1.025)));
            zz = 0.325 + (((tickAnim - 7) / 2) * (0-(0.325)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
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
            xx = 12 + (((tickAnim - 0) / 2) * (-20.06-(12)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -20.06 + (((tickAnim - 2) / 3) * (-16.02-(-20.06)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -16.02 + (((tickAnim - 5) / 2) * (23.75-(-16.02)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 23.75 + (((tickAnim - 7) / 6) * (12-(23.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.275-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -0.275 + (((tickAnim - 5) / 2) * (0-(-0.275)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.4-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = -0.4 + (((tickAnim - 9) / 4) * (0-(-0.4)));
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
            xx = 51 + (((tickAnim - 0) / 2) * (62.06-(51)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 62.06 + (((tickAnim - 2) / 3) * (71.16-(62.06)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 71.16 + (((tickAnim - 5) / 2) * (28.75-(71.16)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 28.75 + (((tickAnim - 7) / 2) * (-10.13-(28.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -10.13 + (((tickAnim - 9) / 4) * (51-(-10.13)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.755-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.3-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.755 + (((tickAnim - 2) / 1) * (0.76-(0.755)));
            zz = -0.3 + (((tickAnim - 2) / 1) * (-0.655-(-0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.76 + (((tickAnim - 3) / 2) * (0-(0.76)));
            zz = -0.655 + (((tickAnim - 3) / 2) * (-0.25-(-0.655)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -0.25 + (((tickAnim - 5) / 2) * (0-(-0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (1.335-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.79-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.335 + (((tickAnim - 8) / 1) * (1.3-(1.335)));
            zz = -0.79 + (((tickAnim - 8) / 1) * (-0.725-(-0.79)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 9) / 4) * (0-(1.3)));
            zz = -0.725 + (((tickAnim - 9) / 4) * (0-(-0.725)));
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
            xx = 0 + (((tickAnim - 0) / 2) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 14 + (((tickAnim - 2) / 3) * (14-(14)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 14 + (((tickAnim - 5) / 2) * (0-(14)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -19.5 + (((tickAnim - 11) / 2) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
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
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0.3-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 11) / 2) * (0-(0.3)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
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
            xx = -24.59592 + (((tickAnim - 0) / 6) * (46.49483-(-24.59592)));
            yy = 1.18189 + (((tickAnim - 0) / 6) * (4.74837-(1.18189)));
            zz = 2.42931 + (((tickAnim - 0) / 6) * (-0.12463-(2.42931)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 46.49483 + (((tickAnim - 6) / 7) * (-24.59592-(46.49483)));
            yy = 4.74837 + (((tickAnim - 6) / 7) * (1.18189-(4.74837)));
            zz = -0.12463 + (((tickAnim - 6) / 7) * (2.42931-(-0.12463)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -27.5 + (((tickAnim - 0) / 6) * (6.75-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 6.75 + (((tickAnim - 6) / 2) * (15.88-(6.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 15.88 + (((tickAnim - 8) / 3) * (-26.12-(15.88)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -26.12 + (((tickAnim - 11) / 2) * (-27.5-(-26.12)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.025 + (((tickAnim - 0) / 3) * (0-(-1.025)));
            zz = 0.325 + (((tickAnim - 0) / 3) * (0-(0.325)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (1.29-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-2.13-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.29 + (((tickAnim - 9) / 2) * (0.575-(1.29)));
            zz = -2.13 + (((tickAnim - 9) / 2) * (-0.35-(-2.13)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 11) / 2) * (-1.025-(0.575)));
            zz = -0.35 + (((tickAnim - 11) / 2) * (0.325-(-0.35)));
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
            xx = 23.75 + (((tickAnim - 0) / 6) * (12-(23.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 12 + (((tickAnim - 6) / 2) * (-20.06-(12)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -20.06 + (((tickAnim - 8) / 3) * (-21.77-(-20.06)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -21.77 + (((tickAnim - 11) / 2) * (23.75-(-21.77)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.4-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -0.4 + (((tickAnim - 3) / 3) * (0-(-0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.075-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.075 + (((tickAnim - 8) / 3) * (0-(0.075)));
            zz = -0.125 + (((tickAnim - 8) / 3) * (-0.275-(-0.125)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = -0.275 + (((tickAnim - 11) / 2) * (0-(-0.275)));
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
            xx = 28.75 + (((tickAnim - 0) / 3) * (-14.63-(28.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -14.63 + (((tickAnim - 3) / 3) * (51-(-14.63)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 51 + (((tickAnim - 6) / 2) * (62.06-(51)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 62.06 + (((tickAnim - 8) / 3) * (71.16-(62.06)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 71.16 + (((tickAnim - 11) / 2) * (28.75-(71.16)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.285-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.815-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 1.285 + (((tickAnim - 1) / 2) * (1.275-(1.285)));
            zz = -0.815 + (((tickAnim - 1) / 2) * (-0.4-(-0.815)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.275 + (((tickAnim - 3) / 5) * (0.755-(1.275)));
            zz = -0.4 + (((tickAnim - 3) / 5) * (-0.3-(-0.4)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.755 + (((tickAnim - 8) / 1) * (0.76-(0.755)));
            zz = -0.3 + (((tickAnim - 8) / 1) * (-0.655-(-0.3)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.76 + (((tickAnim - 9) / 2) * (0-(0.76)));
            zz = -0.655 + (((tickAnim - 9) / 2) * (-0.25-(-0.655)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = -0.25 + (((tickAnim - 11) / 2) * (0-(-0.25)));
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
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -19.5 + (((tickAnim - 4) / 2) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (14-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 14 + (((tickAnim - 8) / 3) * (14-(14)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 11) / 2) * (0-(14)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0.3-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 4) / 2) * (0-(0.3)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(torso, torso.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626+100))*-5.5), torso.rotateAngleY + (float) Math.toRadians(0), torso.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-80))*2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626+180))*5.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*2.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(36.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626+250))*-5.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-200))*2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(20.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626+250))*-6.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-250))*2.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-19.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.626+250))*7.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-300))*2.5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-32.25), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(7.5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(13.25), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(8.32962), rightArm2.rotateAngleY + (float) Math.toRadians(0.8995), rightArm2.rotateAngleZ + (float) Math.toRadians(14.59026));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(-39.25));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(13.25), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(8.32962), leftArm2.rotateAngleY + (float) Math.toRadians(0.8995), leftArm2.rotateAngleZ + (float) Math.toRadians(-14.5903));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(34.5));

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBannykus e = (EntityPrehistoricFloraBannykus) entity;
        animator.update(entity);


    }
}
