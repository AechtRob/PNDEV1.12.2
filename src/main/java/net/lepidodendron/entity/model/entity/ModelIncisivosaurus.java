package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIncisivosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelIncisivosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer chestFluff1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer chestFluff2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer upperpatagium2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer lowerpatagium2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer rightFinger;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer upperpatagium;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer lowerpatagium;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftFinger;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer leftHeadDisplay1;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer leftHeadDisplay2;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer rightHeadDisplay2;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer rightHeadDisplay1;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;


    private ModelAnimator animator;

    public ModelIncisivosaurus() {
        this.textureWidth = 98;
        this.textureHeight = 99;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 5.1992F, 1.9651F);
        this.setRotateAngle(hips, -0.0436F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.1F, -1.3F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 19, -2.0F, -1.1956F, -3.1051F, 6, 1, 8, 0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 30, -2.0F, -0.9956F, -3.1051F, 6, 10, 7, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.3F, 0.7F, -0.65F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.3665F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.2052F, -0.5638F);
        this.rightLeg1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1571F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 90, -0.7F, -3.0F, 3.0F, 0, 8, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 66, -1.0F, -3.0F, -2.0F, 3, 8, 5, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.2345F, -1.0699F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8901F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 71, -0.6F, -0.0054F, -0.422F, 2, 9, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.6337F, 1.2697F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 2.7934F, 0.6412F);
        this.rightLeg3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 84, 0.4F, -3.25F, -1.35F, 2, 5, 2, -0.01F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.35F, 4.4939F, 0.8694F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.4363F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 81, 73, -1.5F, -0.5F, -2.5F, 3, 1, 3, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 87, 0, -1.5F, -0.5F, -2.0F, 3, 1, 2, 0.01F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.3F, 0.7F, -0.65F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.3665F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.2052F, -0.5638F);
        this.leftLeg1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1571F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 90, 0.7F, -3.0F, 3.0F, 0, 8, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 66, -2.0F, -3.0F, -2.0F, 3, 8, 5, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.2345F, -1.0699F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8901F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 71, -1.4F, -0.0054F, -0.422F, 2, 9, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.6337F, 1.2697F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 2.7934F, 0.6412F);
        this.leftLeg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 84, -2.4F, -3.25F, -1.35F, 2, 5, 2, -0.01F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(-0.35F, 4.4939F, 0.8694F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.4363F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 81, 73, -1.5F, -0.5F, -2.5F, 3, 1, 3, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 87, 0, -1.5F, -0.5F, -2.0F, 3, 1, 2, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.6F, -4.4F);
        this.hips.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 47, -3.5F, 6.7347F, -6.6276F, 7, 2, 7, 0.01F, false));
        this.chest.cubeList.add(new ModelBox(chest, 77, 43, -3.5F, 7.7347F, 0.3724F, 7, 1, 1, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -0.1F, -6.5F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 69, 60, -4.0F, -1.3964F, -1.044F, 6, 1, 4, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -0.1F, -6.5F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4189F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 72, -4.0F, -1.7964F, -2.944F, 6, 1, 3, 0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -0.1F, -6.5F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2443F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 60, -4.0F, -1.1964F, -3.044F, 6, 8, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.3F, -3.4F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 9, -3.0F, -1.4F, -3.4F, 7, 1, 8, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.1F, -3.6F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 30, -3.0F, -1.3F, -3.2F, 7, 9, 7, 0.0F, false));

        this.chestFluff1 = new AdvancedModelRenderer(this);
        this.chestFluff1.setRotationPoint(0.5F, 3.4095F, -9.823F);
        this.chest.addChild(chestFluff1);
        this.setRotateAngle(chestFluff1, -0.0873F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chestFluff1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.0821F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 69, 66, -3.0F, -1.2964F, -0.2441F, 5, 2, 4, 0.02F, false));

        this.chestFluff2 = new AdvancedModelRenderer(this);
        this.chestFluff2.setRotationPoint(1.0F, 6.3095F, -7.723F);
        this.chest.addChild(chestFluff2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.0F, -1.9F);
        this.chestFluff2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.8465F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 40, -4.0F, -0.5964F, 2.3559F, 6, 2, 4, 0.01F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.0291F, 3.4076F, -8.0042F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.8985F, -0.3187F, 0.1359F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.6059F, -0.3647F, 3.3525F);
        this.rightArm1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0174F, -0.0006F, 0.0349F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 66, -1.0F, -0.4F, -3.8F, 0, 9, 5, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5059F, -0.3647F, 0.3525F);
        this.rightArm1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0174F, -0.0009F, 0.0524F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 75, 80, -1.0F, -0.4F, -1.8F, 2, 6, 3, 0.0F, true));

        this.upperpatagium2 = new AdvancedModelRenderer(this);
        this.upperpatagium2.setRotationPoint(0.2283F, 1.8518F, -1.3653F);
        this.rightArm1.addChild(upperpatagium2);
        this.setRotateAngle(upperpatagium2, 0.0873F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.upperpatagium2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3752F, -0.0073F, 0.0361F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 66, -0.7F, -1.5F, -0.5F, 1, 4, 1, -0.04F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.39F, 4.8949F, 0.8484F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.7894F, -0.0387F, 0.0202F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.7F, -0.85F, 2.6F);
        this.rightArm2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1047F, -0.0018F, 0.0174F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 81, 0.85F, -0.8F, -2.9F, 0, 6, 4, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.8F, -0.85F, 0.6F);
        this.rightArm2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1047F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 86, 78, 0.75F, 0.2F, -1.9F, 1, 5, 2, -0.01F, true));

        this.lowerpatagium2 = new AdvancedModelRenderer(this);
        this.lowerpatagium2.setRotationPoint(-0.45F, 3.2894F, -0.866F);
        this.rightArm2.addChild(lowerpatagium2);
        this.setRotateAngle(lowerpatagium2, -0.1745F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.7528F, -0.1936F);
        this.lowerpatagium2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.7156F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 82, 90, -0.6F, -0.4F, -1.0F, 1, 2, 2, -0.03F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.9772F, 4.2922F, -0.2681F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 1.4317F, 0.1599F, 0.0879F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 89, 90, 0.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 11, 71, 0.0F, 1.7F, -0.5F, 1, 7, 1, -0.01F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.rightHand.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.0009F, -0.0174F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 47, 91, 0.0F, 1.75F, 0.5F, 1, 5, 1, -0.01F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.rightHand.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0349F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 77, 29, 0.0F, -0.55F, -0.9F, 0, 9, 4, 0.0F, true));

        this.rightFinger = new AdvancedModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.3927F, 0.0F, 0.0F);
        this.rightFinger.cubeList.add(new ModelBox(rightFinger, 86, 34, 0.0F, 0.0F, -0.5F, 2, 6, 1, -0.02F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(3.0291F, 3.4076F, -8.0042F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.8985F, 0.3187F, -0.1359F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.6059F, -0.3647F, 3.3525F);
        this.leftArm1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0174F, 0.0006F, -0.0349F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 66, 1.0F, -0.4F, -3.8F, 0, 9, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5059F, -0.3647F, 0.3525F);
        this.leftArm1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0174F, 0.0009F, -0.0524F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 75, 80, -1.0F, -0.4F, -1.8F, 2, 6, 3, 0.0F, false));

        this.upperpatagium = new AdvancedModelRenderer(this);
        this.upperpatagium.setRotationPoint(-0.2283F, 1.8518F, -1.3653F);
        this.leftArm1.addChild(upperpatagium);
        this.setRotateAngle(upperpatagium, 0.0873F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.upperpatagium.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3752F, 0.0073F, -0.0361F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 45, 66, -0.3F, -1.5F, -0.5F, 1, 4, 1, -0.04F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.39F, 4.8949F, 0.8484F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.7894F, 0.0387F, -0.0202F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.7F, -0.85F, 2.6F);
        this.leftArm2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1047F, 0.0018F, -0.0174F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 26, 81, -0.85F, -0.8F, -2.9F, 0, 6, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.8F, -0.85F, 0.6F);
        this.leftArm2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1047F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 86, 78, -1.75F, 0.2F, -1.9F, 1, 5, 2, -0.01F, false));

        this.lowerpatagium = new AdvancedModelRenderer(this);
        this.lowerpatagium.setRotationPoint(0.45F, 3.2894F, -0.866F);
        this.leftArm2.addChild(lowerpatagium);
        this.setRotateAngle(lowerpatagium, -0.1745F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.7528F, -0.1936F);
        this.lowerpatagium.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.7156F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 82, 90, -0.4F, -0.4F, -1.0F, 1, 2, 2, -0.03F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.9772F, 4.2922F, -0.2681F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 1.4317F, -0.1599F, -0.0879F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 89, 90, -1.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 11, 71, -1.0F, 1.7F, -0.5F, 1, 7, 1, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.leftHand.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0009F, 0.0174F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 47, 91, -1.0F, 1.75F, 0.5F, 1, 5, 1, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.leftHand.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0349F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 77, 29, 0.0F, -0.55F, -0.9F, 0, 9, 4, 0.0F, false));

        this.leftFinger = new AdvancedModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.3927F, 0.0F, 0.0F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 86, 34, -2.0F, 0.0F, -0.5F, 2, 6, 1, -0.02F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2504F, -9.0367F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0873F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 3.8001F, -0.1951F);
        this.neck.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.7418F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 72, 54, -2.5F, -1.3F, -1.7F, 4, 2, 4, 0.001F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, 0.9F, -0.6F);
        this.neck.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1134F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 45, 77, -3.0F, -1.6643F, -0.7694F, 4, 4, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.4426F, -1.0765F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0785F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.0092F, -0.4336F);
        this.neck2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.576F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 59, 87, -1.0F, -0.9F, -2.3F, 2, 1, 2, 0.001F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 2.2333F, -1.8411F);
        this.neck2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -1.0472F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 86, 29, -1.0F, -0.9F, -0.8F, 2, 1, 3, 0.02F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -3.1F, -3.2F);
        this.neck2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.7505F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 72, 0, -1.0F, -0.1262F, 1.6312F, 2, 3, 5, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.9F, -2.0F);
        this.neck2.addChild(neck3);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.3F, -1.5F);
        this.neck3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1309F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 90, 46, -1.0F, -0.018F, -0.2454F, 2, 1, 2, 0.02F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -1.2F, -1.2F);
        this.neck3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0611F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 35, 81, -1.0F, 0.3738F, -1.6688F, 2, 1, 2, 0.03F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -1.2F, -1.2F);
        this.neck3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.096F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 17, 57, -1.0F, 0.8738F, -1.5688F, 2, 3, 3, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0144F, -2.6485F);
        this.neck3.addChild(head);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, 3.6136F, -6.0129F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 1.8413F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 90, 63, -1.0F, 0.0F, -0.9F, 1, 1, 1, -0.001F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 3.8416F, -5.0869F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 1.1432F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 88, 70, -1.0F, -1.0F, -0.1F, 1, 1, 1, 0.001F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 2.1426F, -2.6353F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.6196F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 93, 40, -0.4F, 0.0F, -3.3F, 0, 1, 1, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 60, 77, 0.4F, 0.0F, -3.3F, 0, 1, 1, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 30, 92, -0.5F, -0.5F, -1.9F, 1, 1, 1, -0.001F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 90, 50, -0.5F, -0.5F, -3.9F, 1, 1, 2, 0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.1F, 4.6982F, -5.3572F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3665F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 17, 64, -0.6F, -0.3F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.6F, 2.1426F, -2.6353F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.7069F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 9, 88, -1.6F, -1.6F, -1.5F, 2, 1, 2, 0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, -0.6616F, -2.1123F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.8029F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 87, 19, -1.0F, -0.1871F, -4.5996F, 1, 1, 3, -0.005F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, -0.078F, -2.6614F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.733F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 7, 92, -1.0F, 0.0129F, -3.9996F, 1, 1, 1, -0.002F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.4939F, -0.3855F, -1.793F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.4474F, 0.284F, 0.0256F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 92, -0.9901F, -0.0077F, -2.0488F, 1, 1, 2, 0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-1.4939F, -0.3855F, -1.793F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.4474F, -0.284F, -0.0256F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 59, 91, -0.0099F, -0.0077F, -2.0488F, 1, 1, 2, 0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, 2.1567F, -2.333F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.4116F, 0.2166F, 0.0935F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 93, 37, -0.4F, -1.05F, 0.15F, 1, 1, 1, 0.001F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 2.1567F, -2.333F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.4116F, -0.2166F, -0.0935F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 93, 34, -0.6F, -1.05F, 0.15F, 1, 1, 1, 0.001F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.3F, 2.4067F, -2.583F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.4014F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 88, 66, -0.7F, -1.35F, -1.85F, 2, 1, 2, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 88, 54, -0.7F, -0.35F, -1.85F, 2, 1, 2, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, 2.4067F, -2.583F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.4094F, 0.1926F, 0.0829F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 75, 90, -0.5F, -1.35F, -0.15F, 1, 2, 2, 0.01F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 2.4067F, -2.583F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.4094F, -0.1926F, -0.0829F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 90, 58, -0.5F, -1.35F, -0.15F, 1, 2, 2, 0.01F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -0.3793F, -1.8784F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.4451F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 25, 92, -0.5F, -0.0032F, -1.6566F, 1, 1, 1, -0.01F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 12, 92, -0.5F, -0.0032F, -0.9566F, 1, 1, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.5F, -0.3874F, -1.8356F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.3578F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 87, 4, 0.0F, 0.0F, 0.1F, 3, 1, 2, 0.01F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-1.5F, -0.3874F, -1.8356F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.288F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 48, 85, 0.0F, 0.0F, 0.0F, 3, 3, 2, 0.003F, false));

        this.leftHeadDisplay1 = new AdvancedModelRenderer(this);
        this.leftHeadDisplay1.setRotationPoint(1.0427F, 0.924F, -3.3967F);
        this.head.addChild(leftHeadDisplay1);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.4573F, -1.3114F, 1.561F);
        this.leftHeadDisplay1.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0766F, -0.5324F, 0.1638F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 68, 87, -1.0F, -0.3F, -4.0F, 0, 2, 3, 0.0F, true));

        this.leftHeadDisplay2 = new AdvancedModelRenderer(this);
        this.leftHeadDisplay2.setRotationPoint(1.5F, -0.3874F, -1.8356F);
        this.head.addChild(leftHeadDisplay2);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHeadDisplay2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.438F, -0.4871F, 0.0417F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 18, 88, 0.0F, -1.9F, -2.8F, 0, 2, 3, 0.0F, true));

        this.rightHeadDisplay2 = new AdvancedModelRenderer(this);
        this.rightHeadDisplay2.setRotationPoint(-1.5F, -0.3874F, -1.8356F);
        this.head.addChild(rightHeadDisplay2);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHeadDisplay2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.438F, 0.4871F, -0.0417F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 18, 88, 0.0F, -1.9F, -2.8F, 0, 2, 3, 0.0F, false));

        this.rightHeadDisplay1 = new AdvancedModelRenderer(this);
        this.rightHeadDisplay1.setRotationPoint(-1.0427F, 0.924F, -3.3967F);
        this.head.addChild(rightHeadDisplay1);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.4573F, -1.3114F, 1.561F);
        this.rightHeadDisplay1.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.0766F, 0.5324F, -0.1638F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 68, 87, 1.0F, -0.3F, -4.0F, 0, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.1F, 2.5598F, -0.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2356F, 0.0F, 0.0F);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.1F, 0.1313F, -0.1441F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.2094F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 35, 90, -1.0F, -0.7F, 0.4F, 2, 1, 2, -0.01F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.1F, 0.1313F, -0.1441F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.3403F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 87, 14, -1.0F, -1.6F, -1.8F, 2, 2, 2, -0.01F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.1F, 0.3818F, -1.9266F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.2705F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 87, 24, -1.0F, -0.7F, -1.5F, 2, 1, 2, -0.02F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.6F, 0.1313F, -0.1441F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1396F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 52, 91, 0.0F, -0.5F, -5.3F, 1, 1, 2, -0.002F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 60, 80, -0.5F, -0.5F, -3.6F, 2, 1, 5, -0.001F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.4F, 0.1313F, -0.1441F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.2618F, 0.0F, 0.0F);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.6021F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 87, 8, -1.0F, -1.5F, 0.1F, 1, 2, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.3923F, 1.5568F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1571F, 0.0F, 0.0F);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-1.0F, 0.9F, 1.3F);
        this.tail.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.1047F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 70, 9, -0.5F, 2.5F, -0.3F, 3, 2, 5, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-1.5F, 0.9F, 1.3F);
        this.tail.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0698F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 50, 48, -0.5F, -1.2F, -2.3F, 4, 4, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 5.9349F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1222F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 68, 19, -1.0F, -0.1F, -1.2F, 2, 2, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 11, 80, -0.5F, 1.9F, -0.2F, 1, 1, 6, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.8513F, 0.4382F, 2.8F);
        this.tail2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.0F, -0.3054F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 64, 73, -1.9816F, -0.1399F, -3.0F, 2, 0, 6, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.8513F, 0.4382F, 2.8F);
        this.tail2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.0F, 0.3054F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 73, 47, -0.0184F, -0.1399F, -3.0F, 2, 0, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1053F, 5.7105F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0087F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 56, 29, -0.5F, -0.1F, -1.0F, 1, 1, 9, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.1F, 1.3F, -0.6F);
        this.tail3.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, 0.0F, 0.3229F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, -13, 15, -0.33F, -1.3F, 0.6F, 5, 0, 14, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.1F, 1.3F, -0.6F);
        this.tail3.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.0F, -0.3229F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, -13, 0, -4.67F, -1.3F, 0.6F, 5, 0, 14, 0.0F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-1.5F, 1.2F, 6.1F);
        this.tail3.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.2182F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 39, 0, -2.5F, -1.4F, 0.6F, 8, 0, 8, 0.0F, false));

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
        this.hips.offsetY = -0.01F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.4F;
        this.hips.offsetX = 0.1F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(130);
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

        EntityPrehistoricFloraIncisivosaurus entityIncisivosaurus = (EntityPrehistoricFloraIncisivosaurus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityIncisivosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityIncisivosaurus.getAnimation() == entityIncisivosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityIncisivosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityIncisivosaurus.getIsMoving()) {
                    if (entityIncisivosaurus.getAnimation() != entityIncisivosaurus.EAT_ANIMATION
                            && entityIncisivosaurus.getAnimation() != entityIncisivosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityIncisivosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraIncisivosaurus ee = (EntityPrehistoricFloraIncisivosaurus) entitylivingbaseIn;

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
        EntityPrehistoricFloraIncisivosaurus entity = (EntityPrehistoricFloraIncisivosaurus) entitylivingbaseIn;
        int animCycle = 65;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 40) / 10) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 25.25 + (((tickAnim - 50) / 15) * (0-(25.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-6.575-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.975-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -6.575 + (((tickAnim - 40) / 10) * (-6.575-(-6.575)));
            zz = -0.975 + (((tickAnim - 40) / 10) * (-0.975-(-0.975)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = -6.575 + (((tickAnim - 50) / 15) * (0-(-6.575)));
            zz = -0.975 + (((tickAnim - 50) / 15) * (0-(-0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -40 + (((tickAnim - 40) / 10) * (-40-(-40)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -40 + (((tickAnim - 50) / 15) * (0-(-40)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (55.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 55.25 + (((tickAnim - 40) / 10) * (55.25-(55.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 55.25 + (((tickAnim - 50) / 15) * (0-(55.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-50.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -50.25 + (((tickAnim - 40) / 10) * (-50.25-(-50.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -50.25 + (((tickAnim - 50) / 15) * (0-(-50.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.375-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0.375 + (((tickAnim - 40) / 10) * (0.375-(0.375)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0.375 + (((tickAnim - 50) / 15) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 40) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 9.25 + (((tickAnim - 50) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -40 + (((tickAnim - 40) / 10) * (-40-(-40)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -40 + (((tickAnim - 50) / 15) * (0-(-40)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (55.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 55.25 + (((tickAnim - 40) / 10) * (55.25-(55.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 55.25 + (((tickAnim - 50) / 15) * (0-(55.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-50.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -50.25 + (((tickAnim - 40) / 10) * (-50.25-(-50.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -50.25 + (((tickAnim - 50) / 15) * (0-(-50.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.375-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0.375 + (((tickAnim - 40) / 10) * (0.375-(0.375)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0.375 + (((tickAnim - 50) / 15) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 40) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 9.25 + (((tickAnim - 50) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*1 + (((tickAnim - 40) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*1-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*1)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*1 + (((tickAnim - 50) / 15) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*1)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-74.22986-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-32.16406-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -74.22986 + (((tickAnim - 40) / 10) * (-74.22986-(-74.22986)));
            yy = -32.16406 + (((tickAnim - 40) / 10) * (-32.16406-(-32.16406)));
            zz = 95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*5 + (((tickAnim - 40) / 10) * (95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*5-(95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*5)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -74.22986 + (((tickAnim - 50) / 15) * (0-(-74.22986)));
            yy = -32.16406 + (((tickAnim - 50) / 15) * (0-(-32.16406)));
            zz = 95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*5 + (((tickAnim - 50) / 15) * (0-(95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 30.75 + (((tickAnim - 40) / 10) * (30.75-(30.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 30.75 + (((tickAnim - 50) / 15) * (0-(30.75)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-74.22986-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (32.16406-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -74.22986 + (((tickAnim - 40) / 10) * (-74.22986-(-74.22986)));
            yy = 32.16406 + (((tickAnim - 40) / 10) * (32.16406-(32.16406)));
            zz = -95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-5 + (((tickAnim - 40) / 10) * (-95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-5-(-95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-5)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -74.22986 + (((tickAnim - 50) / 15) * (0-(-74.22986)));
            yy = 32.16406 + (((tickAnim - 50) / 15) * (0-(32.16406)));
            zz = -95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-5 + (((tickAnim - 50) / 15) * (0-(-95.94581338+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 30.75 + (((tickAnim - 40) / 10) * (30.75-(30.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 30.75 + (((tickAnim - 50) / 15) * (0-(30.75)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 40) / 10) * (20-(20)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 20 + (((tickAnim - 50) / 15) * (0-(20)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 40) / 10) * (17-(17)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 17 + (((tickAnim - 50) / 15) * (0-(17)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-42-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -42 + (((tickAnim - 40) / 10) * (-42-(-42)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -42 + (((tickAnim - 50) / 15) * (0-(-42)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.225-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0.225 + (((tickAnim - 40) / 10) * (0.225-(0.225)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0.225 + (((tickAnim - 50) / 15) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -25.25 + (((tickAnim - 40) / 5) * (-12.5-(-25.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 45) / 5) * (-25.25-(-12.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -25.25 + (((tickAnim - 50) / 15) * (0-(-25.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 40) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8 + (((tickAnim - 40) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 50) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8 + (((tickAnim - 50) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHeadDisplay1, leftHeadDisplay1.rotateAngleX + (float) Math.toRadians(xx), leftHeadDisplay1.rotateAngleY + (float) Math.toRadians(yy), leftHeadDisplay1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 40) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8 + (((tickAnim - 40) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 50) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8 + (((tickAnim - 50) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*-8)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHeadDisplay2, leftHeadDisplay2.rotateAngleX + (float) Math.toRadians(xx), leftHeadDisplay2.rotateAngleY + (float) Math.toRadians(yy), leftHeadDisplay2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 40) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 40) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 50) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 50) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHeadDisplay2, rightHeadDisplay2.rotateAngleX + (float) Math.toRadians(xx), rightHeadDisplay2.rotateAngleY + (float) Math.toRadians(yy), rightHeadDisplay2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 40) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 40) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 50) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 50) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHeadDisplay1, rightHeadDisplay1.rotateAngleX + (float) Math.toRadians(xx), rightHeadDisplay1.rotateAngleY + (float) Math.toRadians(yy), rightHeadDisplay1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (26.25-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 26.25 + (((tickAnim - 40) / 5) * (0-(26.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (26.25-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 26.25 + (((tickAnim - 50) / 15) * (0-(26.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 30.75 + (((tickAnim - 40) / 5) * (41.75-(30.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 41.75 + (((tickAnim - 45) / 5) * (30.75-(41.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 30.75 + (((tickAnim - 50) / 15) * (0-(30.75)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (21.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 21.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*2 + (((tickAnim - 40) / 10) * (21.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*2-(21.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*2)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 21.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*2 + (((tickAnim - 50) / 15) * (0-(21.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1))*2)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*5 + (((tickAnim - 40) / 10) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*5-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*5 + (((tickAnim - 50) / 15) * (0-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-100))*5)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 40) / 10) * (19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8-(19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8 + (((tickAnim - 50) / 15) * (0-(19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.1-200))*8)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

       
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIncisivosaurus entity = (EntityPrehistoricFloraIncisivosaurus) entitylivingbaseIn;
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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-82.77-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -82.77 + (((tickAnim - 3) / 2) * (0-(-82.77)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (25.75-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 25.75 + (((tickAnim - 8) / 8) * (0-(25.75)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (-82.77-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -82.77 + (((tickAnim - 19) / 2) * (0-(-82.77)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (25.75-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 25.75 + (((tickAnim - 23) / 9) * (0-(25.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (-82.77-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -82.77 + (((tickAnim - 35) / 2) * (0-(-82.77)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (25.75-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 25.75 + (((tickAnim - 39) / 11) * (0-(25.75)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
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
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0.225 + (((tickAnim - 8) / 8) * (0-(0.225)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 23) / 9) * (0-(0.225)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0.225-(0)));
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
        EntityPrehistoricFloraIncisivosaurus entity = (EntityPrehistoricFloraIncisivosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8.5 + (((tickAnim - 15) / 20) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-8.775-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.325-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -8.775 + (((tickAnim - 15) / 20) * (-8.775-(-8.775)));
            zz = 2.325 + (((tickAnim - 15) / 20) * (2.325-(2.325)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -8.775 + (((tickAnim - 35) / 15) * (0-(-8.775)));
            zz = 2.325 + (((tickAnim - 35) / 15) * (0-(2.325)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25 + (((tickAnim - 15) / 20) * (-25-(-25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25 + (((tickAnim - 35) / 15) * (0-(-25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49 + (((tickAnim - 35) / 15) * (0-(49)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-87.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -87.25 + (((tickAnim - 15) / 20) * (-87.25-(-87.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -87.25 + (((tickAnim - 35) / 15) * (0-(-87.25)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.575 + (((tickAnim - 15) / 20) * (-0.575-(-0.575)));
            zz = 0.4 + (((tickAnim - 15) / 20) * (0.4-(0.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.575 + (((tickAnim - 35) / 15) * (0-(-0.575)));
            zz = 0.4 + (((tickAnim - 35) / 15) * (0-(0.4)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (73.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 73.25 + (((tickAnim - 15) / 20) * (73.25-(73.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 73.25 + (((tickAnim - 35) / 15) * (0-(73.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.625-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 7) / 8) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 7) / 8) * (0-(-0.625)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.625-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 43) / 7) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 43) / 7) * (0-(-0.625)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25 + (((tickAnim - 15) / 20) * (-25-(-25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25 + (((tickAnim - 35) / 15) * (0-(-25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49 + (((tickAnim - 35) / 15) * (0-(49)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-87.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -87.25 + (((tickAnim - 15) / 20) * (-87.25-(-87.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -87.25 + (((tickAnim - 35) / 15) * (0-(-87.25)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.575 + (((tickAnim - 15) / 20) * (-0.575-(-0.575)));
            zz = 0.4 + (((tickAnim - 15) / 20) * (0.4-(0.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.575 + (((tickAnim - 35) / 15) * (0-(-0.575)));
            zz = 0.4 + (((tickAnim - 35) / 15) * (0-(0.4)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (73.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 73.25 + (((tickAnim - 15) / 20) * (73.25-(73.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 73.25 + (((tickAnim - 35) / 15) * (0-(73.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.625-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 7) / 8) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 7) / 8) * (0-(-0.625)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.625-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 43) / 7) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 43) / 7) * (0-(-0.625)));
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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.04579-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (7.41155-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (19.49232-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 20.04579 + (((tickAnim - 15) / 20) * (20.04579-(20.04579)));
            yy = 7.41155 + (((tickAnim - 15) / 20) * (7.41155-(7.41155)));
            zz = 19.49232 + (((tickAnim - 15) / 20) * (19.49232-(19.49232)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 20.04579 + (((tickAnim - 35) / 15) * (0-(20.04579)));
            yy = 7.41155 + (((tickAnim - 35) / 15) * (0-(7.41155)));
            zz = 19.49232 + (((tickAnim - 35) / 15) * (0-(19.49232)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -37.25 + (((tickAnim - 15) / 20) * (-37.25-(-37.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -37.25 + (((tickAnim - 35) / 15) * (0-(-37.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.27264-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (4.61821-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-11.67039-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 18.27264 + (((tickAnim - 15) / 20) * (18.27264-(18.27264)));
            yy = 4.61821 + (((tickAnim - 15) / 20) * (4.61821-(4.61821)));
            zz = -11.67039 + (((tickAnim - 15) / 20) * (-11.67039-(-11.67039)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 18.27264 + (((tickAnim - 35) / 15) * (0-(18.27264)));
            yy = 4.61821 + (((tickAnim - 35) / 15) * (0-(4.61821)));
            zz = -11.67039 + (((tickAnim - 35) / 15) * (0-(-11.67039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-41-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -41 + (((tickAnim - 15) / 20) * (-41-(-41)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -41 + (((tickAnim - 35) / 15) * (0-(-41)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 16.75 + (((tickAnim - 15) / 20) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 16.75 + (((tickAnim - 35) / 15) * (0-(16.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.75 + (((tickAnim - 15) / 20) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 35) / 15) * (0-(3.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 15) / 20) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 35) / 15) * (0-(7)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.5 + (((tickAnim - 15) / 20) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 35) / 15) * (0-(8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIncisivosaurus entity = (EntityPrehistoricFloraIncisivosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -10.5 + (((tickAnim - 11) / 7) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (4.25-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 4.25 + (((tickAnim - 23) / 8) * (0-(4.25)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -16.25 + (((tickAnim - 11) / 7) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -15 + (((tickAnim - 23) / 8) * (0-(-15)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 9.5 + (((tickAnim - 11) / 7) * (0-(9.5)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -22.5 + (((tickAnim - 23) / 8) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -7 + (((tickAnim - 11) / 7) * (0-(-7)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (3-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 3 + (((tickAnim - 23) / 8) * (0-(3)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 38.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-50))*50 + (((tickAnim - 0) / 31) * (0-(38.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-50))*50)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHeadDisplay1, leftHeadDisplay1.rotateAngleX + (float) Math.toRadians(xx), leftHeadDisplay1.rotateAngleY + (float) Math.toRadians(yy), leftHeadDisplay1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 43.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-120))*50 + (((tickAnim - 0) / 31) * (0-(43.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-120))*50)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHeadDisplay2, leftHeadDisplay2.rotateAngleX + (float) Math.toRadians(xx), leftHeadDisplay2.rotateAngleY + (float) Math.toRadians(yy), leftHeadDisplay2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 43.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-120))*50 + (((tickAnim - 0) / 31) * (0-(43.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-120))*50)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHeadDisplay2, rightHeadDisplay2.rotateAngleX + (float) Math.toRadians(xx), rightHeadDisplay2.rotateAngleY + (float) Math.toRadians(yy), rightHeadDisplay2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 38.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-50))*50 + (((tickAnim - 0) / 31) * (0-(38.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-50))*50)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHeadDisplay1, rightHeadDisplay1.rotateAngleX + (float) Math.toRadians(xx), rightHeadDisplay1.rotateAngleY + (float) Math.toRadians(yy), rightHeadDisplay1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 38.75 + (((tickAnim - 11) / 4) * (0-(38.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (31.5-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 31.5 + (((tickAnim - 23) / 8) * (0-(31.5)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-41-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -41 + (((tickAnim - 11) / 4) * (0-(-41)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -20.25 + (((tickAnim - 23) / 8) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIncisivosaurus entity = (EntityPrehistoricFloraIncisivosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.5 + (((tickAnim - 10) / 10) * (0-(9.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 10) / 10) * (0-(-10)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 10) / 10) * (0-(-10)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16 + (((tickAnim - 10) / 10) * (0-(16)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17 + (((tickAnim - 10) / 10) * (0-(17)));
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
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -0.275 + (((tickAnim - 10) / 10) * (0-(-0.275)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 31.25 + (((tickAnim - 10) / 10) * (0-(31.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (0-(5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (15.13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15.13 + (((tickAnim - 5) / 5) * (-11.75-(15.13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.75 + (((tickAnim - 10) / 10) * (0-(-11.75)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25.5 + (((tickAnim - 5) / 5) * (0-(25.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.5 + (((tickAnim - 10) / 10) * (0-(10.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.25 + (((tickAnim - 10) / 10) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.5 + (((tickAnim - 10) / 10) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7 + (((tickAnim - 10) / 10) * (0-(-7)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIncisivosaurus entity = (EntityPrehistoricFloraIncisivosaurus) entitylivingbaseIn;
        int animCycle = 180;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 85) {
            xx = -3.5 + (((tickAnim - 30) / 55) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 55) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 125) {
            xx = -3.5 + (((tickAnim - 85) / 40) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 85) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 40) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = -3.5 + (((tickAnim - 125) / 25) * (-18.25-(-3.5)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 180) {
            xx = -18.25 + (((tickAnim - 150) / 30) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 150) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 85) {
            xx = 3.5 + (((tickAnim - 30) / 55) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 30) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 55) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 125) {
            xx = 3.5 + (((tickAnim - 85) / 40) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 85) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 40) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 3.5 + (((tickAnim - 125) / 25) * (21.5-(3.5)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 180) {
            xx = 21.5 + (((tickAnim - 150) / 30) * (0-(21.5)));
            yy = 0 + (((tickAnim - 150) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 0) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 125) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 180) {
            xx = -4.25 + (((tickAnim - 150) / 30) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 150) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 85) {
            xx = 3.5 + (((tickAnim - 30) / 55) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 30) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 55) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 125) {
            xx = 3.5 + (((tickAnim - 85) / 40) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 85) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 40) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 3.5 + (((tickAnim - 125) / 25) * (21.5-(3.5)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 180) {
            xx = 21.5 + (((tickAnim - 150) / 30) * (0-(21.5)));
            yy = 0 + (((tickAnim - 150) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 180) {
            xx = -4.25 + (((tickAnim - 150) / 30) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 150) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 70) {
            xx = 3.75 + (((tickAnim - 45) / 25) * (0-(3.75)));
            yy = 0 + (((tickAnim - 45) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 25) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 70) / 30) * (3.75-(0)));
            yy = 0 + (((tickAnim - 70) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 30) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 3.75 + (((tickAnim - 100) / 50) * (4-(3.75)));
            yy = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 180) {
            xx = 4 + (((tickAnim - 150) / 30) * (0-(4)));
            yy = 0 + (((tickAnim - 150) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -9.25 + (((tickAnim - 15) / 15) * (6-(-9.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 6 + (((tickAnim - 30) / 15) * (-1.22766-(6)));
            yy = 0 + (((tickAnim - 30) / 15) * (11.99815-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0.21254-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 70) {
            xx = -1.22766 + (((tickAnim - 45) / 25) * (-9.25-(-1.22766)));
            yy = 11.99815 + (((tickAnim - 45) / 25) * (0-(11.99815)));
            zz = 0.21254 + (((tickAnim - 45) / 25) * (0-(0.21254)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -9.25 + (((tickAnim - 70) / 15) * (6-(-9.25)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 6 + (((tickAnim - 85) / 15) * (-1.22766-(6)));
            yy = 0 + (((tickAnim - 85) / 15) * (11.99815-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0.21254-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = -1.22766 + (((tickAnim - 100) / 25) * (0-(-1.22766)));
            yy = 11.99815 + (((tickAnim - 100) / 25) * (0-(11.99815)));
            zz = 0.21254 + (((tickAnim - 100) / 25) * (0-(0.21254)));
        }
        else if (tickAnim >= 125 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 125) / 13) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 125) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 13) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 150) {
            xx = -6.75 + (((tickAnim - 138) / 12) * (14.5-(-6.75)));
            yy = 0 + (((tickAnim - 138) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 12) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 165) {
            xx = 14.5 + (((tickAnim - 150) / 15) * (12.5-(14.5)));
            yy = 0 + (((tickAnim - 150) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 15) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 12.5 + (((tickAnim - 165) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (-0.325-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 30) / 15) * (0.15-(0.15)));
            zz = -0.325 + (((tickAnim - 30) / 15) * (0.305-(-0.325)));
        }
        else if (tickAnim >= 45 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 45) / 25) * (0-(0)));
            yy = 0.15 + (((tickAnim - 45) / 25) * (0-(0.15)));
            zz = 0.305 + (((tickAnim - 45) / 25) * (0-(0.305)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (-0.325-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 85) / 15) * (0.15-(0.15)));
            zz = -0.325 + (((tickAnim - 85) / 15) * (0.305-(-0.325)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            yy = 0.15 + (((tickAnim - 100) / 25) * (0-(0.15)));
            zz = 0.305 + (((tickAnim - 100) / 25) * (0-(0.305)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (-0.275-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 150) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 15) * (0-(0)));
            zz = -0.275 + (((tickAnim - 150) / 15) * (0-(-0.275)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -12.5 + (((tickAnim - 15) / 8) * (0.62465-(-12.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0.80476-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (1.09521-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.62465 + (((tickAnim - 23) / 7) * (0-(0.62465)));
            yy = 0.80476 + (((tickAnim - 23) / 7) * (0-(0.80476)));
            zz = 1.09521 + (((tickAnim - 23) / 7) * (0-(1.09521)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (21.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (6.5-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 70) {
            xx = 21.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 45) / 25) * (-12.5-(21.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = 6.5 + (((tickAnim - 45) / 25) * (0-(6.5)));
            zz = 0 + (((tickAnim - 45) / 25) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = -12.5 + (((tickAnim - 70) / 8) * (0.62465-(-12.5)));
            yy = 0 + (((tickAnim - 70) / 8) * (0.80476-(0)));
            zz = 0 + (((tickAnim - 70) / 8) * (1.09521-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = 0.62465 + (((tickAnim - 78) / 7) * (0-(0.62465)));
            yy = 0.80476 + (((tickAnim - 78) / 7) * (0-(0.80476)));
            zz = 1.09521 + (((tickAnim - 78) / 7) * (0-(1.09521)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (20.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(0)));
            yy = 0 + (((tickAnim - 85) / 15) * (6.5-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 20.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 100) / 25) * (0-(20.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = 6.5 + (((tickAnim - 100) / 25) * (0-(6.5)));
            zz = 0 + (((tickAnim - 100) / 25) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 125) / 13) * (-1.62-(0)));
            yy = 0 + (((tickAnim - 125) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 13) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 150) {
            xx = -1.62 + (((tickAnim - 138) / 12) * (11.25-(-1.62)));
            yy = 0 + (((tickAnim - 138) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 12) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 165) {
            xx = 11.25 + (((tickAnim - 150) / 15) * (15.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(11.25)));
            yy = 0 + (((tickAnim - 150) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 15) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 15.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 165) / 15) * (0-(15.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 0) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 150) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 150) * (-0.45-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 150) / 15) * (0-(0)));
            yy = 0.325 + (((tickAnim - 150) / 15) * (0-(0.325)));
            zz = -0.45 + (((tickAnim - 150) / 15) * (0.5-(-0.45)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0.5 + (((tickAnim - 165) / 15) * (0-(0.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-4.40797-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.31234-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.32658-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -4.40797 + (((tickAnim - 15) / 8) * (-32.48695-(-4.40797)));
            yy = -0.31234 + (((tickAnim - 15) / 8) * (-0.46852-(-0.31234)));
            zz = -0.32658 + (((tickAnim - 15) / 8) * (-0.48987-(-0.32658)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -32.48695 + (((tickAnim - 23) / 7) * (-36.14927-(-32.48695)));
            yy = -0.46852 + (((tickAnim - 23) / 7) * (-0.62469-(-0.46852)));
            zz = -0.48987 + (((tickAnim - 23) / 7) * (-0.65316-(-0.48987)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -36.14927 + (((tickAnim - 30) / 15) * (-11.7952-(-36.14927)));
            yy = -0.62469 + (((tickAnim - 30) / 15) * (-16.83974-(-0.62469)));
            zz = -0.65316 + (((tickAnim - 30) / 15) * (11.66374-(-0.65316)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -11.7952 + (((tickAnim - 45) / 10) * (-25.82712-(-11.7952)));
            yy = -16.83974 + (((tickAnim - 45) / 10) * (-10.10385-(-16.83974)));
            zz = 11.66374 + (((tickAnim - 45) / 10) * (6.99825-(11.66374)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = -25.82712 + (((tickAnim - 55) / 15) * (-4.40797-(-25.82712)));
            yy = -10.10385 + (((tickAnim - 55) / 15) * (-0.31234-(-10.10385)));
            zz = 6.99825 + (((tickAnim - 55) / 15) * (-0.32658-(6.99825)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = -4.40797 + (((tickAnim - 70) / 8) * (-32.48695-(-4.40797)));
            yy = -0.31234 + (((tickAnim - 70) / 8) * (-0.46852-(-0.31234)));
            zz = -0.32658 + (((tickAnim - 70) / 8) * (-0.48987-(-0.32658)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = -32.48695 + (((tickAnim - 78) / 7) * (-36.14927-(-32.48695)));
            yy = -0.46852 + (((tickAnim - 78) / 7) * (-0.62469-(-0.46852)));
            zz = -0.48987 + (((tickAnim - 78) / 7) * (-0.65316-(-0.48987)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -36.14927 + (((tickAnim - 85) / 15) * (-11.7952-(-36.14927)));
            yy = -0.62469 + (((tickAnim - 85) / 15) * (-16.83974-(-0.62469)));
            zz = -0.65316 + (((tickAnim - 85) / 15) * (11.66374-(-0.65316)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -11.7952 + (((tickAnim - 100) / 10) * (-25.82712-(-11.7952)));
            yy = -16.83974 + (((tickAnim - 100) / 10) * (-10.10385-(-16.83974)));
            zz = 11.66374 + (((tickAnim - 100) / 10) * (6.99825-(11.66374)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = -25.82712 + (((tickAnim - 110) / 15) * (0-(-25.82712)));
            yy = -10.10385 + (((tickAnim - 110) / 15) * (0-(-10.10385)));
            zz = 6.99825 + (((tickAnim - 110) / 15) * (0-(6.99825)));
        }
        else if (tickAnim >= 125 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 125) / 13) * (-0.37-(0)));
            yy = 0 + (((tickAnim - 125) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 13) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 150) {
            xx = -0.37 + (((tickAnim - 138) / 12) * (-22.25-(-0.37)));
            yy = 0 + (((tickAnim - 138) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 12) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 165) {
            xx = -22.25 + (((tickAnim - 150) / 15) * (-15.25-(-22.25)));
            yy = 0 + (((tickAnim - 150) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 15) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = -15.25 + (((tickAnim - 165) / 15) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 15) / 15) * (2.75-(-6)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 2.75 + (((tickAnim - 30) / 15) * (18.74588-(2.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0.49943-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0.02432-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 18.74588 + (((tickAnim - 45) / 10) * (1.74753-(18.74588)));
            yy = 0.49943 + (((tickAnim - 45) / 10) * (0.29966-(0.49943)));
            zz = 0.02432 + (((tickAnim - 45) / 10) * (0.01459-(0.02432)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 1.74753 + (((tickAnim - 55) / 15) * (-6-(1.74753)));
            yy = 0.29966 + (((tickAnim - 55) / 15) * (0-(0.29966)));
            zz = 0.01459 + (((tickAnim - 55) / 15) * (0-(0.01459)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -6 + (((tickAnim - 70) / 15) * (2.75-(-6)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 2.75 + (((tickAnim - 85) / 15) * (18.74588-(2.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (0.49943-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0.02432-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 18.74588 + (((tickAnim - 100) / 10) * (1.74753-(18.74588)));
            yy = 0.49943 + (((tickAnim - 100) / 10) * (0.29966-(0.49943)));
            zz = 0.02432 + (((tickAnim - 100) / 10) * (0.01459-(0.02432)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 1.74753 + (((tickAnim - 110) / 15) * (0-(1.74753)));
            yy = 0.29966 + (((tickAnim - 110) / 15) * (0-(0.29966)));
            zz = 0.01459 + (((tickAnim - 110) / 15) * (0-(0.01459)));
        }
        else if (tickAnim >= 125 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 125) / 13) * (11.38-(0)));
            yy = 0 + (((tickAnim - 125) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 13) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 150) {
            xx = 11.38 + (((tickAnim - 138) / 12) * (4.75-(11.38)));
            yy = 0 + (((tickAnim - 138) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 12) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 165) {
            xx = 4.75 + (((tickAnim - 150) / 15) * (14.25-(4.75)));
            yy = 0 + (((tickAnim - 150) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 15) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 14.25 + (((tickAnim - 165) / 15) * (0-(14.25)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -32.75 + (((tickAnim - 30) / 15) * (0-(-32.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 45) / 18) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 45) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 18) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -32.75 + (((tickAnim - 63) / 7) * (-26.25-(-32.75)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -26.25 + (((tickAnim - 70) / 15) * (-46.75-(-26.25)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -46.75 + (((tickAnim - 85) / 15) * (0-(-46.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 100) / 18) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 100) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 18) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = -32.75 + (((tickAnim - 118) / 7) * (-26.25-(-32.75)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -26.25 + (((tickAnim - 125) / 15) * (-46.75-(-26.25)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -46.75 + (((tickAnim - 140) / 40) * (0-(-46.75)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHeadDisplay1, leftHeadDisplay1.rotateAngleX + (float) Math.toRadians(xx), leftHeadDisplay1.rotateAngleY + (float) Math.toRadians(yy), leftHeadDisplay1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -33 + (((tickAnim - 30) / 15) * (0-(-33)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 45) / 18) * (-33-(0)));
            yy = 0 + (((tickAnim - 45) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 18) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -33 + (((tickAnim - 63) / 7) * (-24.25-(-33)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -24.25 + (((tickAnim - 70) / 15) * (-45-(-24.25)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -45 + (((tickAnim - 85) / 15) * (0-(-45)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 100) / 18) * (-33-(0)));
            yy = 0 + (((tickAnim - 100) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 18) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = -33 + (((tickAnim - 118) / 7) * (-24.25-(-33)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -24.25 + (((tickAnim - 125) / 15) * (-45-(-24.25)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -45 + (((tickAnim - 140) / 40) * (0-(-45)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHeadDisplay2, leftHeadDisplay2.rotateAngleX + (float) Math.toRadians(xx), leftHeadDisplay2.rotateAngleY + (float) Math.toRadians(yy), leftHeadDisplay2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -27.25 + (((tickAnim - 30) / 15) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 45) / 18) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 45) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 18) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -27.25 + (((tickAnim - 63) / 7) * (-19.75-(-27.25)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -19.75 + (((tickAnim - 70) / 15) * (-37.75-(-19.75)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -37.75 + (((tickAnim - 85) / 15) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 100) / 18) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 100) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 18) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = -27.25 + (((tickAnim - 118) / 7) * (-19.75-(-27.25)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -19.75 + (((tickAnim - 125) / 15) * (-37.75-(-19.75)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -37.75 + (((tickAnim - 140) / 40) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHeadDisplay2, rightHeadDisplay2.rotateAngleX + (float) Math.toRadians(xx), rightHeadDisplay2.rotateAngleY + (float) Math.toRadians(yy), rightHeadDisplay2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -40.75 + (((tickAnim - 30) / 15) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 45) / 18) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 45) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 18) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -40.75 + (((tickAnim - 63) / 7) * (-35.5-(-40.75)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -35.5 + (((tickAnim - 70) / 15) * (-57-(-35.5)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -57 + (((tickAnim - 85) / 15) * (0-(-57)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 100) / 18) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 100) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 18) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = -40.75 + (((tickAnim - 118) / 7) * (-35.5-(-40.75)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -35.5 + (((tickAnim - 125) / 15) * (-57-(-35.5)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -57 + (((tickAnim - 140) / 40) * (0-(-57)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHeadDisplay1, rightHeadDisplay1.rotateAngleX + (float) Math.toRadians(xx), rightHeadDisplay1.rotateAngleY + (float) Math.toRadians(yy), rightHeadDisplay1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 15) / 8) * (30.25-(6)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 30.25 + (((tickAnim - 23) / 7) * (0-(30.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 45) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = 17.5 + (((tickAnim - 55) / 7) * (0-(17.5)));
            yy = 0 + (((tickAnim - 55) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 7) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 62) / 8) * (6-(0)));
            yy = 0 + (((tickAnim - 62) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 8) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = 6 + (((tickAnim - 70) / 8) * (30.25-(6)));
            yy = 0 + (((tickAnim - 70) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 8) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = 30.25 + (((tickAnim - 78) / 7) * (0-(30.25)));
            yy = 0 + (((tickAnim - 78) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 7) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 117) {
            xx = 17.5 + (((tickAnim - 110) / 7) * (0-(17.5)));
            yy = 0 + (((tickAnim - 110) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 7) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 125) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 13) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 138) / 5) * (21.25-(0)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = 21.25 + (((tickAnim - 143) / 7) * (0-(21.25)));
            yy = 0 + (((tickAnim - 143) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 180) {
            xx = 15.25 + (((tickAnim - 30) / 150) * (0-(15.25)));
            yy = 0 + (((tickAnim - 30) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 150) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 70) {
            xx = -2.5 + (((tickAnim - 15) / 55) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 15) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 55) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 125) {
            xx = -2.5 + (((tickAnim - 70) / 55) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 70) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 55) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = -2.5 + (((tickAnim - 125) / 25) * (-9.25-(-2.5)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 180) {
            xx = -9.25 + (((tickAnim - 150) / 30) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 150) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 70) {
            xx = 2 + (((tickAnim - 15) / 55) * (2-(2)));
            yy = 0 + (((tickAnim - 15) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 55) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 125) {
            xx = 2 + (((tickAnim - 70) / 55) * (2-(2)));
            yy = 0 + (((tickAnim - 70) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 55) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 2 + (((tickAnim - 125) / 25) * (11.75-(2)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 180) {
            xx = 11.75 + (((tickAnim - 150) / 30) * (0-(11.75)));
            yy = 0 + (((tickAnim - 150) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 0) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 125) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (13-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 180) {
            xx = 13 + (((tickAnim - 150) / 30) * (0-(13)));
            yy = 0 + (((tickAnim - 150) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIncisivosaurus entity = (EntityPrehistoricFloraIncisivosaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*8), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-80))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-20))*-1.5);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 32.09257 + (((tickAnim - 0) / 6) * (-23.49318-(32.09257)));
            yy = 7.36143 + (((tickAnim - 0) / 6) * (-0.8761-(7.36143)));
            zz = 1.43899 + (((tickAnim - 0) / 6) * (-0.89163-(1.43899)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -23.49318 + (((tickAnim - 6) / 4) * (32.09257-(-23.49318)));
            yy = -0.8761 + (((tickAnim - 6) / 4) * (7.36143-(-0.8761)));
            zz = -0.89163 + (((tickAnim - 6) / 4) * (1.43899-(-0.89163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 23.5 + (((tickAnim - 0) / 1) * (27.31-(23.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 27.31 + (((tickAnim - 1) / 3) * (-11.08-(27.31)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -11.08 + (((tickAnim - 4) / 2) * (-8.75-(-11.08)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -8.75 + (((tickAnim - 6) / 4) * (23.5-(-8.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*25 + (((tickAnim - 0) / 3) * (-37.83-(-9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -37.83 + (((tickAnim - 3) / 1) * (-44.08-(-37.83)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -44.08 + (((tickAnim - 4) / 2) * (25-(-44.08)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 6) / 4) * (-13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*25-(25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.345-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.725-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.345 + (((tickAnim - 3) / 1) * (0.345-(0.345)));
            zz = 0.725 + (((tickAnim - 3) / 1) * (0.725-(0.725)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.345 + (((tickAnim - 4) / 2) * (0-(0.345)));
            zz = 0.725 + (((tickAnim - 4) / 2) * (0-(0.725)));
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
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 60.25 + (((tickAnim - 0) / 3) * (76.67-(60.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 76.67 + (((tickAnim - 3) / 1) * (76.67-(76.67)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 76.67 + (((tickAnim - 4) / 2) * (6.60934-(76.67)));
            yy = 0 + (((tickAnim - 4) / 2) * (-3.15311-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (5.10728-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 6.60934 + (((tickAnim - 6) / 1) * (-5.8567-(6.60934)));
            yy = -3.15311 + (((tickAnim - 6) / 1) * (-1.29228-(-3.15311)));
            zz = 5.10728 + (((tickAnim - 6) / 1) * (3.25297-(5.10728)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -5.8567 + (((tickAnim - 7) / 1) * (54.12-(-5.8567)));
            yy = -1.29228 + (((tickAnim - 7) / 1) * (0-(-1.29228)));
            zz = 3.25297 + (((tickAnim - 7) / 1) * (0-(3.25297)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 54.12 + (((tickAnim - 8) / 2) * (60.25-(54.12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.875 + (((tickAnim - 0) / 3) * (1.57-(0.875)));
            zz = -0.5 + (((tickAnim - 0) / 3) * (-0.685-(-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.57 + (((tickAnim - 3) / 1) * (1.57-(1.57)));
            zz = -0.685 + (((tickAnim - 3) / 1) * (-0.685-(-0.685)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.57 + (((tickAnim - 4) / 2) * (0.375-(1.57)));
            zz = -0.685 + (((tickAnim - 4) / 2) * (0-(-0.685)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.375 + (((tickAnim - 6) / 1) * (0-(0.375)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.675-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.675 + (((tickAnim - 8) / 2) * (0.875-(0.675)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.5-(0)));
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
            xx = 32.25 + (((tickAnim - 0) / 3) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 32.25 + (((tickAnim - 3) / 1) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 32.25 + (((tickAnim - 4) / 2) * (0-(32.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (-72.75-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -72.75 + (((tickAnim - 8) / 1) * (0-(-72.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (32.25-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
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
            zz = 0.25 + (((tickAnim - 0) / 3) * (0.25-(0.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0.25 + (((tickAnim - 3) / 1) * (0.25-(0.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0.25 + (((tickAnim - 4) / 2) * (0-(0.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0.25-(0)));
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
            xx = -23.49318 + (((tickAnim - 0) / 5) * (32.09257-(-23.49318)));
            yy = 0.8761 + (((tickAnim - 0) / 5) * (-7.36143-(0.8761)));
            zz = 0.89163 + (((tickAnim - 0) / 5) * (-1.43899-(0.89163)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 32.09257 + (((tickAnim - 5) / 5) * (-23.49318-(32.09257)));
            yy = -7.36143 + (((tickAnim - 5) / 5) * (0.8761-(-7.36143)));
            zz = -1.43899 + (((tickAnim - 5) / 5) * (0.89163-(-1.43899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8.75 + (((tickAnim - 0) / 5) * (23.5-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 23.5 + (((tickAnim - 5) / 1) * (27.31-(23.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 27.31 + (((tickAnim - 6) / 2) * (-11.08-(27.31)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.08 + (((tickAnim - 8) / 2) * (-8.75-(-11.08)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25 + (((tickAnim - 0) / 5) * (-23.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*25-(25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -23.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*25 + (((tickAnim - 5) / 2) * (-37.83-(-23.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -37.83 + (((tickAnim - 7) / 1) * (-44.08-(-37.83)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -44.08 + (((tickAnim - 8) / 2) * (25-(-44.08)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 5) * (0-(0.675)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.345-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.725-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.345 + (((tickAnim - 7) / 1) * (0.345-(0.345)));
            zz = 0.725 + (((tickAnim - 7) / 1) * (0.725-(0.725)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.345 + (((tickAnim - 8) / 2) * (0.675-(0.345)));
            zz = 0.725 + (((tickAnim - 8) / 2) * (0-(0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.71485 + (((tickAnim - 0) / 1) * (-3.437-(6.71485)));
            yy = 1.57812 + (((tickAnim - 0) / 1) * (2.30494-(1.57812)));
            zz = -2.5517 + (((tickAnim - 0) / 1) * (-5.81102-(-2.5517)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -3.437 + (((tickAnim - 1) / 2) * (54.12-(-3.437)));
            yy = 2.30494 + (((tickAnim - 1) / 2) * (0-(2.30494)));
            zz = -5.81102 + (((tickAnim - 1) / 2) * (0-(-5.81102)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 54.12 + (((tickAnim - 3) / 2) * (60.25-(54.12)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 60.25 + (((tickAnim - 5) / 2) * (76.67-(60.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 76.67 + (((tickAnim - 7) / 1) * (76.67-(76.67)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 76.67 + (((tickAnim - 8) / 2) * (6.71485-(76.67)));
            yy = 0 + (((tickAnim - 8) / 2) * (1.57812-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-2.5517-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 1) * (0.2-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 1) / 1) * (0.7-(0.2)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.7 + (((tickAnim - 2) / 1) * (0.675-(0.7)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.675 + (((tickAnim - 3) / 2) * (0.875-(0.675)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 5) / 2) * (1.57-(0.875)));
            zz = -0.5 + (((tickAnim - 5) / 2) * (-0.685-(-0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.57 + (((tickAnim - 7) / 1) * (1.57-(1.57)));
            zz = -0.685 + (((tickAnim - 7) / 1) * (-0.685-(-0.685)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.57 + (((tickAnim - 8) / 2) * (-0.175-(1.57)));
            zz = -0.685 + (((tickAnim - 8) / 2) * (0-(-0.685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*-8), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(14.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*8), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+200))*4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(6.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-170))*8), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-19.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*-8), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*8), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*8), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*12), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*-8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*12), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*16), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+200))*-12));
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(0);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(0);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(-0.45);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (-72.75-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -72.75 + (((tickAnim - 3) / 0) * (0-(-72.75)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (32.25-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 32.25 + (((tickAnim - 5) / 2) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 32.25 + (((tickAnim - 7) / 1) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32.25 + (((tickAnim - 8) / 2) * (0-(32.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0.25 + (((tickAnim - 5) / 2) * (0.25-(0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0.25 + (((tickAnim - 7) / 1) * (0.25-(0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0.25 + (((tickAnim - 8) / 2) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-5), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*-4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*8), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+100))*-8), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightFinger, rightFinger.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+150))*-3), rightFinger.rotateAngleY + (float) Math.toRadians(0), rightFinger.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-5), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*-4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*8), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+100))*-8), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftFinger, leftFinger.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+150))*-3), leftFinger.rotateAngleY + (float) Math.toRadians(0), leftFinger.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(21), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

       
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIncisivosaurus entity = (EntityPrehistoricFloraIncisivosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*-0.8);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 32.09257 + (((tickAnim - 0) / 11) * (-23.49318-(32.09257)));
            yy = 7.36143 + (((tickAnim - 0) / 11) * (-0.8761-(7.36143)));
            zz = 1.43899 + (((tickAnim - 0) / 11) * (-0.89163-(1.43899)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -23.49318 + (((tickAnim - 11) / 9) * (32.09257-(-23.49318)));
            yy = -0.8761 + (((tickAnim - 11) / 9) * (7.36143-(-0.8761)));
            zz = -0.89163 + (((tickAnim - 11) / 9) * (1.43899-(-0.89163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.5 + (((tickAnim - 0) / 2) * (27.31-(23.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 27.31 + (((tickAnim - 2) / 6) * (-11.08-(27.31)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -11.08 + (((tickAnim - 8) / 3) * (-8.75-(-11.08)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -8.75 + (((tickAnim - 11) / 9) * (23.5-(-8.75)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*25 + (((tickAnim - 0) / 4) * (-37.83-(-9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -37.83 + (((tickAnim - 4) / 4) * (-44.08-(-37.83)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -44.08 + (((tickAnim - 8) / 3) * (25-(-44.08)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 11) / 9) * (-13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*25-(25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.345-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.725-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.345 + (((tickAnim - 4) / 4) * (0.345-(0.345)));
            zz = 0.725 + (((tickAnim - 4) / 4) * (0.725-(0.725)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.345 + (((tickAnim - 8) / 3) * (0-(0.345)));
            zz = 0.725 + (((tickAnim - 8) / 3) * (0-(0.725)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 60.25 + (((tickAnim - 0) / 4) * (76.67-(60.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 76.67 + (((tickAnim - 4) / 4) * (76.67-(76.67)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 76.67 + (((tickAnim - 8) / 3) * (6.60934-(76.67)));
            yy = 0 + (((tickAnim - 8) / 3) * (-3.15311-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (5.10728-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.60934 + (((tickAnim - 11) / 2) * (-5.8567-(6.60934)));
            yy = -3.15311 + (((tickAnim - 11) / 2) * (-1.29228-(-3.15311)));
            zz = 5.10728 + (((tickAnim - 11) / 2) * (3.25297-(5.10728)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5.8567 + (((tickAnim - 13) / 2) * (54.12-(-5.8567)));
            yy = -1.29228 + (((tickAnim - 13) / 2) * (0-(-1.29228)));
            zz = 3.25297 + (((tickAnim - 13) / 2) * (0-(3.25297)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 54.12 + (((tickAnim - 15) / 5) * (60.25-(54.12)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.875 + (((tickAnim - 0) / 4) * (1.57-(0.875)));
            zz = -0.5 + (((tickAnim - 0) / 4) * (-0.685-(-0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.57 + (((tickAnim - 4) / 4) * (1.57-(1.57)));
            zz = -0.685 + (((tickAnim - 4) / 4) * (-0.685-(-0.685)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 1.57 + (((tickAnim - 8) / 3) * (0.375-(1.57)));
            zz = -0.685 + (((tickAnim - 8) / 3) * (0-(-0.685)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.375 + (((tickAnim - 11) / 2) * (0-(0.375)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0.475-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 13) / 2) * (0.675-(0.475)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 15) / 5) * (0.875-(0.675)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 32.25 + (((tickAnim - 0) / 4) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 32.25 + (((tickAnim - 4) / 4) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 32.25 + (((tickAnim - 8) / 3) * (0-(32.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-72.75-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -72.75 + (((tickAnim - 15) / 3) * (0-(-72.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (32.25-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0.25 + (((tickAnim - 0) / 4) * (0.25-(0.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0.25 + (((tickAnim - 4) / 4) * (0.25-(0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0.25 + (((tickAnim - 8) / 3) * (0-(0.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -23.49318 + (((tickAnim - 0) / 9) * (32.09257-(-23.49318)));
            yy = 0.8761 + (((tickAnim - 0) / 9) * (-7.36143-(0.8761)));
            zz = 0.89163 + (((tickAnim - 0) / 9) * (-1.43899-(0.89163)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 32.09257 + (((tickAnim - 9) / 11) * (-23.49318-(32.09257)));
            yy = -7.36143 + (((tickAnim - 9) / 11) * (0.8761-(-7.36143)));
            zz = -1.43899 + (((tickAnim - 9) / 11) * (0.89163-(-1.43899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -8.75 + (((tickAnim - 0) / 9) * (23.5-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 23.5 + (((tickAnim - 9) / 2) * (27.31-(23.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 27.31 + (((tickAnim - 11) / 6) * (-11.08-(27.31)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -11.08 + (((tickAnim - 17) / 3) * (-8.75-(-11.08)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 25 + (((tickAnim - 0) / 9) * (-23.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*25-(25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -23.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*25 + (((tickAnim - 9) / 4) * (-37.83-(-23.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -37.83 + (((tickAnim - 13) / 4) * (-44.08-(-37.83)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -44.08 + (((tickAnim - 17) / 3) * (25-(-44.08)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 9) * (0-(0.675)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.345-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0.725-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.345 + (((tickAnim - 13) / 4) * (0.345-(0.345)));
            zz = 0.725 + (((tickAnim - 13) / 4) * (0.725-(0.725)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.345 + (((tickAnim - 17) / 3) * (0.675-(0.345)));
            zz = 0.725 + (((tickAnim - 17) / 3) * (0-(0.725)));
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
            xx = 6.71485 + (((tickAnim - 0) / 2) * (-3.437-(6.71485)));
            yy = 1.57812 + (((tickAnim - 0) / 2) * (2.30494-(1.57812)));
            zz = -2.5517 + (((tickAnim - 0) / 2) * (-5.81102-(-2.5517)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -3.437 + (((tickAnim - 2) / 2) * (54.12-(-3.437)));
            yy = 2.30494 + (((tickAnim - 2) / 2) * (0-(2.30494)));
            zz = -5.81102 + (((tickAnim - 2) / 2) * (0-(-5.81102)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 54.12 + (((tickAnim - 4) / 5) * (60.25-(54.12)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 60.25 + (((tickAnim - 9) / 4) * (76.67-(60.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 76.67 + (((tickAnim - 13) / 4) * (76.67-(76.67)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 76.67 + (((tickAnim - 17) / 3) * (6.71485-(76.67)));
            yy = 0 + (((tickAnim - 17) / 3) * (1.57812-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-2.5517-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 2) * (0.2-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 2) / 1) * (0.7-(0.2)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.7 + (((tickAnim - 3) / 1) * (0.675-(0.7)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 4) / 5) * (0.875-(0.675)));
            zz = 0 + (((tickAnim - 4) / 5) * (-0.5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.875 + (((tickAnim - 9) / 4) * (1.57-(0.875)));
            zz = -0.5 + (((tickAnim - 9) / 4) * (-0.685-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.57 + (((tickAnim - 13) / 4) * (1.57-(1.57)));
            zz = -0.685 + (((tickAnim - 13) / 4) * (-0.685-(-0.685)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.57 + (((tickAnim - 17) / 3) * (-0.175-(1.57)));
            zz = -0.685 + (((tickAnim - 17) / 3) * (0-(-0.685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-3), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+200))*4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-170))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*3), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*6), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*8), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+200))*-12));
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(0);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(0);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(-0.45);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (-72.75-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -72.75 + (((tickAnim - 4) / 3) * (0-(-72.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (32.25-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 32.25 + (((tickAnim - 9) / 4) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 32.25 + (((tickAnim - 13) / 4) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 32.25 + (((tickAnim - 17) / 3) * (0-(32.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
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
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0.25-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0.25 + (((tickAnim - 9) / 4) * (0.25-(0.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0.25 + (((tickAnim - 13) / 4) * (0.25-(0.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0.25 + (((tickAnim - 17) / 3) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-5), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*8), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+100))*-8), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightFinger, rightFinger.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-3), rightFinger.rotateAngleY + (float) Math.toRadians(0), rightFinger.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-5), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*8), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+100))*-8), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftFinger, leftFinger.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-3), leftFinger.rotateAngleY + (float) Math.toRadians(0), leftFinger.rotateAngleZ + (float) Math.toRadians(0));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraIncisivosaurus e = (EntityPrehistoricFloraIncisivosaurus) entity;
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
