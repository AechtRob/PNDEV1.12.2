package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMantellisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMantellisaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer opposablePinkie2;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer opposablePinkie;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r37;
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
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;

    private ModelAnimator animator;

    public ModelMantellisaurus() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.5F, 6.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.4F, -1.2F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 65, 0.0F, -1.9533F, -0.0121F, 0, 2, 11, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 50, -2.0F, 0.0467F, -0.0121F, 4, 3, 11, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.1F, 1.4F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -4.0F, -1.0074F, -3.2693F, 8, 13, 12, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, 0.5F, 4.3F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0436F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 7.8294F, -10.6933F);
        this.leftLeg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.192F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 0, -2.0F, -11.0497F, 6.0046F, 4, 13, 7, 0.003F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 10.5475F, -4.2101F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7243F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.9F, 6.0292F, 1.3409F);
        this.leftLeg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0561F, 0.0026F, 0.025F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 83, -0.5037F, -6.1938F, -1.7369F, 3, 11, 4, -0.003F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.7754F, 2.6028F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 51, 93, -1.5F, -0.9953F, -2.085F, 3, 7, 3, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.0174F, 0.0716F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1047F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 86, 38, -2.0F, -0.855F, -3.3341F, 4, 2, 4, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.045F, -3.4341F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 32, 80, -2.0F, -0.9F, -2.9F, 4, 2, 4, -0.003F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.5F, 0.5F, 4.3F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0436F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 7.8294F, -10.6933F);
        this.rightLeg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.192F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 0, -2.0F, -11.0497F, 6.0046F, 4, 13, 7, 0.003F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 10.5475F, -4.2101F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7243F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.9F, 6.0292F, 1.3409F);
        this.rightLeg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0561F, -0.0026F, -0.025F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 83, -2.4963F, -6.1938F, -1.7369F, 3, 11, 4, -0.003F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.7754F, 2.6028F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 51, 93, -1.5F, -0.9953F, -2.085F, 3, 7, 3, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.0174F, 0.0716F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1047F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 86, 38, -2.0F, -0.855F, -3.3341F, 4, 2, 4, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.045F, -3.4341F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 32, 80, -2.0F, -0.9F, -2.9F, 4, 2, 4, -0.003F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.2F, 9.8F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1571F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -6.0368F, 7.061F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 71, 0.5F, -1.9865F, 0.0851F, 0, 2, 9, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -6.0368F, 7.061F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 12, -1.0F, 0.0135F, 0.0851F, 3, 4, 9, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -4.9368F, -0.839F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1396F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 27, 0.5F, -1.9763F, 0.0613F, 0, 2, 8, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 71, -1.0F, 0.0237F, 0.0613F, 3, 4, 8, 0.008F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.9368F, 0.261F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0175F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 63, -3.0F, -0.195F, -0.5862F, 6, 9, 7, 0.003F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 47, -3.0F, -0.195F, 6.4138F, 6, 6, 9, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.3368F, 15.661F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0175F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -4.1779F, -0.1937F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1396F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 35, 0.0F, -0.9147F, 0.6545F, 0, 1, 12, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 51, -1.0F, 0.0853F, 0.6545F, 2, 4, 12, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0221F, -6.9937F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 14, -2.0F, -1.1742F, 6.8319F, 4, 4, 12, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.9779F, 11.9063F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0087F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 29, 0, -1.5F, 0.1547F, -0.2076F, 3, 3, 8, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.3899F, -0.1116F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 84, 86, 0.0F, -0.9553F, -0.096F, 0, 1, 8, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 65, 85, -0.5F, 0.0447F, -0.096F, 1, 2, 8, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4899F, 7.4884F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0175F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.0648F, 0.0905F);
        this.tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0524F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 82, 75, 0.0F, -1.0709F, -0.0322F, 0, 1, 9, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 79, -0.5F, -0.0709F, -0.0322F, 1, 2, 9, 0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.6352F, 8.9905F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1047F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 73, 35, -0.5F, -0.189F, -0.7306F, 1, 1, 10, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.1934F, 0.31F);
        this.tail5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 82, 0.0F, 0.0044F, -0.2405F, 0, 1, 9, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.hips.addChild(body);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.6F, -3.1F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 54, 47, 0.0F, -2.2552F, -0.0024F, 0, 2, 4, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 84, 47, -2.5F, -0.2552F, -0.0024F, 5, 3, 4, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.3F, -9.7F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3229F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 92, 0.0F, -1.9628F, -0.1406F, 0, 2, 7, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 68, -2.5F, 0.0372F, -0.1406F, 5, 3, 7, 0.007F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2007F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 26, -5.0F, -0.2166F, -9.7439F, 10, 13, 10, 0.003F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.0F, -9.0F);
        this.body.addChild(chest);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -3.643F, -1.4557F);
        this.chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5934F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 95, 83, -0.5F, 0.0991F, -6.4241F, 0, 2, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 11.357F, -4.4557F);
        this.chest.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4712F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 83, 63, -2.5F, -9.904F, 3.2587F, 4, 3, 6, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 12.2F, -1.6F);
        this.chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1222F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 66, 26, -4.5F, -4.2516F, 0.097F, 9, 4, 4, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.3F, -0.2F);
        this.chest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4712F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 41, 31, -4.5F, -0.1842F, -6.0529F, 9, 9, 6, 0.003F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-4.3F, 9.5F, -4.4F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.48F, 0.0F, 0.1745F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.1324F, 0.0032F, -4.3577F);
        this.rightArm.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3316F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -1.0F, 0.9776F, 2.8185F, 2, 8, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.537F, 6.357F, 2.8663F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.778F, -0.4728F, 0.1272F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 26, -0.7296F, -0.0654F, -1.3756F, 2, 6, 2, -0.01F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.4224F, 5.7998F, -0.3304F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2294F, -0.3165F, -0.1985F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 29, 0, -0.0809F, 0.0235F, -1.2679F, 1, 4, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-4.7148F, -0.2575F, -5.9182F);
        this.rightArm3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1396F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 69, 68, 4.6338F, 0.9394F, 2.5649F, 1, 1, 2, -0.004F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.7148F, 3.2425F, -5.0182F);
        this.rightArm3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.3054F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 54, 83, 4.3807F, -1.4758F, 3.7502F, 1, 1, 2, 0.004F, true));

        this.opposablePinkie2 = new AdvancedModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.1558F, 0.0425F, 0.3309F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 1.1781F, 0.0F, 0.0F);
        this.opposablePinkie2.cubeList.add(new ModelBox(opposablePinkie2, 36, 50, -0.1867F, -0.0005F, -0.8332F, 1, 2, 1, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(4.3F, 9.5F, -4.4F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.48F, 0.0F, -0.1745F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.1324F, 0.0032F, -4.3577F);
        this.leftArm.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3316F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -1.0F, 0.9776F, 2.8185F, 2, 8, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.537F, 6.357F, 2.8663F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.778F, 0.4728F, -0.1272F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 26, -1.2704F, -0.0654F, -1.3756F, 2, 6, 2, -0.01F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.4224F, 5.7998F, -0.3304F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2294F, 0.3165F, 0.1985F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 29, 0, -0.9191F, 0.0235F, -1.2679F, 1, 4, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(4.7148F, -0.2575F, -5.9182F);
        this.leftArm3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1396F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 69, 68, -5.6338F, 0.9394F, 2.5649F, 1, 1, 2, -0.004F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(4.7148F, 3.2425F, -5.0182F);
        this.leftArm3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.3054F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 54, 83, -5.3807F, -1.4758F, 3.7502F, 1, 1, 2, 0.004F, false));

        this.opposablePinkie = new AdvancedModelRenderer(this);
        this.opposablePinkie.setRotationPoint(-0.1558F, 0.0425F, 0.3309F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 1.1781F, 0.0F, 0.0F);
        this.opposablePinkie.cubeList.add(new ModelBox(opposablePinkie, 36, 50, -0.8133F, -0.0005F, -0.8332F, 1, 2, 1, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.5F, 4.257F, -4.9557F);
        this.chest.addChild(neck4);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.neck4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4887F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 23, 65, -0.5F, -1.1671F, -2.9342F, 0, 1, 3, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 44, 0, -2.0F, -0.1671F, -2.9342F, 3, 3, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 7.1F, 0.5F);
        this.neck4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4887F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 75, 0, -4.0F, -7.9887F, -0.0712F, 7, 8, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 7.1F, 0.5F);
        this.neck4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1745F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 82, 12, -4.0F, -2.9887F, 0.0288F, 7, 3, 3, -0.003F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(-0.5F, 0.343F, -1.9443F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.2793F, 0.0F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -2.1932F, -0.9576F);
        this.neck3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0524F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 68, 49, 0.0F, -1.4002F, -2.5054F, 0, 1, 3, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 36, 91, -1.5F, -0.4002F, -3.5054F, 3, 6, 4, 0.003F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -3.0932F, -11.1576F);
        this.neck3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.2443F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 68, 49, -2.0F, -0.7971F, 6.6966F, 4, 6, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.3068F, -4.4576F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2967F, 0.0F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -4.351F, -4.3173F);
        this.neck2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2618F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 50, 0.0F, -1.0124F, 0.0084F, 0, 1, 5, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -4.351F, -4.3173F);
        this.neck2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2269F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 91, 19, -1.0F, -0.0124F, 0.0084F, 2, 2, 5, 0.003F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -4.351F, -4.3173F);
        this.neck2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.4189F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 79, -1.5F, -0.0124F, 0.0084F, 3, 5, 7, 0.003F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.6068F, -4.7149F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -3.0211F, -10.5161F);
        this.neck.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1571F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 54, 47, 0.0F, 1.1273F, 6.487F, 0, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -1.7211F, 0.5839F);
        this.neck.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1396F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 31, 50, 0.0F, -0.0504F, -3.8408F, 0, 1, 4, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -1.7211F, -3.3161F);
        this.neck.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.2793F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 92, 73, -1.5F, -0.1254F, -0.0919F, 3, 5, 4, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.7211F, -3.1161F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.288F, 0.0F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.7F, -2.284F, -10.2141F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0611F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 6, 50, 0.1F, 2.0769F, 4.3265F, 0, 1, 2, 0.0F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 6, 50, 1.3F, 2.0769F, 4.3265F, 0, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.7F, -2.384F, -12.2141F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1658F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 8, 0, 0.1F, 3.3987F, 4.489F, 0, 1, 1, 0.0F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 8, 0, 1.3F, 3.3987F, 4.489F, 0, 1, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.9F, 1.2578F, -4.7636F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.096F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 102, 0.19F, -0.6F, -1.5F, 0, 1, 4, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 44, 64, 0.2F, -0.6F, -1.5F, 0, 1, 4, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 102, 1.61F, -0.6F, -1.5F, 0, 1, 4, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 44, 64, 1.6F, -0.6F, -1.5F, 0, 1, 4, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -1.8629F, -14.2698F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.2618F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 54, 0, -0.8F, 3.7916F, 6.918F, 1, 1, 1, 0.01F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 54, 0, -0.2F, 3.7916F, 6.918F, 1, 1, 1, 0.008F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 57, -1.0F, 3.7916F, 4.9179F, 2, 1, 2, 0.008F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 1.8371F, -8.1698F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3142F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 12, 71, -1.0F, -1.0611F, -0.0166F, 2, 1, 2, 0.004F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -2.1629F, -14.4698F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.4887F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 69, 72, -1.0F, -0.4778F, 6.4989F, 2, 1, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.72F, -4.1199F, -9.0988F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0873F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 64, 26, -0.5F, 2.2433F, 6.0405F, 1, 1, 1, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 64, 26, 0.94F, 2.2433F, 6.0405F, 1, 1, 1, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.7F, -3.4799F, -8.7923F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -1.6144F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 73, 35, -0.5F, -8.3645F, 1.8234F, 1, 3, 3, 0.003F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 73, 35, 0.9F, -8.3645F, 1.8234F, 1, 3, 3, 0.003F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -2.784F, -12.9141F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.9948F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 72, 0, -0.5F, 5.6078F, -0.5596F, 1, 1, 1, -0.003F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.4F, 0.8448F, -5.8343F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.2967F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 65, -1.4F, -2.0251F, -0.2391F, 2, 2, 3, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.4F, -0.3552F, -4.4343F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0524F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 12, 65, -1.4F, -0.9F, -1.5F, 2, 2, 3, 0.005F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -3.484F, -14.1141F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.6283F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 76, 68, -0.5F, 6.3617F, 2.9812F, 1, 1, 1, 0.003F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -4.084F, -13.3141F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.4363F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 51, 68, -0.5F, 5.6784F, 4.1373F, 1, 1, 2, -0.003F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, -1.6533F, -3.5033F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0873F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 54, 79, -0.5F, -0.0317F, -1.9169F, 1, 1, 2, 0.003F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, -4.684F, -7.6141F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.2443F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 20, 50, -1.5F, 1.5438F, 6.3566F, 3, 4, 2, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, -5.084F, -9.6141F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0698F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 71, -1.0F, 2.9511F, 6.358F, 2, 1, 2, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.916F, -0.9141F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0347F, 0.0F, 0.0F);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.5514F, -4.7533F, -12.0298F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.3578F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 51, 72, -0.4519F, 1.2471F, 5.42F, 2, 1, 1, -0.002F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.1486F, -6.1186F, -7.9629F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.48F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 31, 50, 0.5519F, 1.7338F, 6.7663F, 0, 1, 1, 0.0F, true));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 31, 50, 1.7453F, 1.7338F, 6.7663F, 0, 1, 1, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5486F, -6.3186F, -9.9629F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0785F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 0, -0.0481F, 5.0125F, 3.8454F, 0, 1, 1, 0.0F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 0, 1.1453F, 5.0125F, 3.8454F, 0, 1, 1, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.5486F, -5.6186F, -9.0629F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.1309F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 50, -0.0581F, 3.3151F, 4.8025F, 0, 1, 2, 0.0F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 50, 1.1553F, 3.3151F, 4.8025F, 0, 1, 2, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.2514F, -5.4868F, -11.6603F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0349F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 52, 21, -0.7519F, 4.2191F, 4.5768F, 2, 1, 3, 0.007F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.5967F, -0.7928F, -3.1071F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.2007F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 110, -0.1133F, -1.4F, 0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 105, -0.1233F, -1.4F, -2.0F, 0, 2, 3, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 44, 0, -0.1033F, -1.4F, 0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 68, 0, -0.0933F, -1.4F, -2.0F, 0, 2, 3, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 110, 1.3067F, -1.4F, 0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 105, 1.3167F, -1.4F, -2.0F, 0, 2, 3, 0.0F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 44, 0, 1.2967F, -1.4F, 0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 73, 42, -0.6033F, -0.4F, 0.5F, 2, 1, 1, 0.006F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 73, 42, -0.2033F, -0.4F, 0.5F, 2, 1, 1, 0.003F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 68, 0, 1.2867F, -1.4F, -2.0F, 0, 2, 3, 0.0F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 20, 57, -0.4033F, -0.4F, -1.5F, 2, 1, 2, 0.003F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.0514F, -5.9533F, -9.2298F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.3491F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 31, 31, -1.4519F, 1.2356F, 8.7095F, 3, 2, 2, -0.003F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.hips.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.hips.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.5F;
        this.hips.offsetX = 0.2F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(135);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.4F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.2F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraMantellisaurus walker = (EntityPrehistoricFloraMantellisaurus) e;
        this.hips.offsetZ = -0.5F;
        AdvancedModelRenderer[] tailFull = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck3, this.neck2, this.neck, this.head};

        walker.tailBuffer.applyChainSwingBuffer(tailFull);

        float speed = 0.2F;

        //Animations:

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 4, head);

        if (walker.getAnimation() == walker.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!walker.isReallyInWater()) {

                if (f3 == 0.0F || !walker.getIsMoving()) {
                    if (walker.getAnimation() != walker.EAT_ANIMATION
                            && (!walker.isAnimationDirectionLocked(walker.getAnimation()))) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(tailFull, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(tailFull, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    return;
                }

                if (walker.getIsFast()) { //Running


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
        EntityPrehistoricFloraMantellisaurus ee = (EntityPrehistoricFloraMantellisaurus) entitylivingbaseIn;

        if ((!ee.isQuad() && ee.getAnimation() != ee.TOBI_ANIMATION) || ee.getAnimation() == ee.TOQUAD_ANIMATION) {
            //Bipedal Pose

            //And now the pose:
            this.setRotateAngle(body, -0.0698F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, -0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, 0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, -0.0524F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, 0.3229F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r18, 0.2007F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r19, 0.5934F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r20, 0.4712F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r21, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r22, 0.4712F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r23, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r24, 0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.3054F);
            this.setRotateAngle(cube_r26, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r27, 0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.3054F);
            this.setRotateAngle(cube_r29, 0.4887F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.192F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r30, 0.4887F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r31, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r32, -0.0524F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r33, -0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r34, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r35, -0.2269F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r36, -0.4189F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r37, -0.1571F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r38, -0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r39, -0.2793F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.0561F, 0.0026F, 0.025F);
            this.setRotateAngle(cube_r40, -0.0611F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r41, 0.1658F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r42, 0.096F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r43, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r44, 0.3142F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r45, -0.4887F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r46, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r47, -1.6144F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r48, 0.9948F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r49, -0.2967F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -0.192F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r50, 0.0524F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r51, 0.6283F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r52, 0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r53, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r54, -0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r55, -0.0698F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r56, -0.3578F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r57, -0.48F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r58, 0.0785F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r59, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.0561F, -0.0026F, -0.025F);
            this.setRotateAngle(cube_r60, 0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r61, -0.2007F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r62, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.288F, 0.0F, 0.0F);
            this.setRotateAngle(hips, -0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, -0.0347F, 0.0F, 0.0F);
            this.setRotateAngle(leftArm, 0.7549F, 0.0F, -0.1745F);
            this.setRotateAngle(leftArm2, -1.2449F, 0.4728F, -0.1272F);
            this.setRotateAngle(leftArm3, 0.6236F, 0.2241F, 0.3982F);
            this.setRotateAngle(leftLeg, 0.1091F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg2, 0.7243F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg4, 0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.2967F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, 0.3796F, 0.0F, 0.0F);
            this.setRotateAngle(opposablePinkie, 0.7069F, 0.0F, 0.0F);
            this.setRotateAngle(opposablePinkie2, 0.7069F, 0.0F, 0.0F);
            this.setRotateAngle(rightArm, 0.7549F, 0.0F, 0.1745F);
            this.setRotateAngle(rightArm2, -1.2449F, -0.4728F, 0.1272F);
            this.setRotateAngle(rightArm3, 0.6236F, -0.2241F, -0.3982F);
            this.setRotateAngle(rightLeg, 0.1091F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg2, 0.7243F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg4, 0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.096F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, -0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, 0.0087F, 0.0F, 0.0F);
            this.setRotateAngle(tail4, -0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(tail5, -0.1047F, 0.0F, 0.0F);



        }

                //Is Walking:
        if (ee.getIsMoving() && !ee.isQuad()) {
            if(ee.getIsFast()) {
                animRunBi(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalkBi(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else if(ee.getIsMoving() && ee.isQuad()){
            animWalkQuad(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }




        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMantellisaurus entity = (EntityPrehistoricFloraMantellisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 10) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 32.5 + (((tickAnim - 10) / 10) * (0-(32.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.375-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 10) * (0-(-0.25)));
            zz = 1.375 + (((tickAnim - 10) / 10) * (0-(1.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9 + (((tickAnim - 10) / 10) * (0-(9)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.38-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.38 + (((tickAnim - 5) / 5) * (0-(21.38)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 13) / 7) * (0-(17.5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.33-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.05 + (((tickAnim - 5) / 5) * (0-(0.05)));
            zz = 0.33 + (((tickAnim - 5) / 5) * (0.25-(0.33)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0.25 + (((tickAnim - 10) / 3) * (0.295-(0.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0.295 + (((tickAnim - 13) / 7) * (0-(0.295)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 5) / 5) * (0-(17.5)));
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
        EntityPrehistoricFloraMantellisaurus entity = (EntityPrehistoricFloraMantellisaurus) entitylivingbaseIn;
        int animCycle = 410;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*52.7-50))*2), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*52.7-100))*3), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*52.7-150))*4), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*52.7-200))*5), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 171) {
            xx = 2.25 + (((tickAnim - 60) / 111) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 60) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 111) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 215) {
            xx = 2.25 + (((tickAnim - 171) / 44) * (0-(2.25)));
            yy = 0 + (((tickAnim - 171) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 44) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 215) / 66) * (2.25-(0)));
            yy = 0 + (((tickAnim - 215) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 66) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 392) {
            xx = 2.25 + (((tickAnim - 281) / 111) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 281) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 111) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = 2.25 + (((tickAnim - 392) / 18) * (0-(2.25)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 171) {
            xx = 4.5 + (((tickAnim - 60) / 111) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 60) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 111) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 215) {
            xx = 4.5 + (((tickAnim - 171) / 44) * (0-(4.5)));
            yy = 0 + (((tickAnim - 171) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 44) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 215) / 66) * (4.5-(0)));
            yy = 0 + (((tickAnim - 215) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 66) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 392) {
            xx = 4.5 + (((tickAnim - 281) / 111) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 281) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 111) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = 4.5 + (((tickAnim - 392) / 18) * (0-(4.5)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 171) {
            xx = -6.5 + (((tickAnim - 60) / 111) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 60) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 111) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 215) {
            xx = -6.5 + (((tickAnim - 171) / 44) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 171) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 44) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 215) / 66) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 215) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 66) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 392) {
            xx = -6.5 + (((tickAnim - 281) / 111) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 281) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 111) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = -6.5 + (((tickAnim - 392) / 18) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 171) {
            xx = -15.5 + (((tickAnim - 60) / 111) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 60) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 111) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 215) {
            xx = -15.5 + (((tickAnim - 171) / 44) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 171) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 44) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 215) / 66) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 215) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 66) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 392) {
            xx = -15.5 + (((tickAnim - 281) / 111) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 281) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 111) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = -15.5 + (((tickAnim - 392) / 18) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 171) {
            xx = 20.75 + (((tickAnim - 60) / 111) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 60) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 111) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 215) {
            xx = 20.75 + (((tickAnim - 171) / 44) * (0-(20.75)));
            yy = 0 + (((tickAnim - 171) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 44) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 215) / 66) * (20.75-(0)));
            yy = 0 + (((tickAnim - 215) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 66) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 392) {
            xx = 20.75 + (((tickAnim - 281) / 111) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 281) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 111) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = 20.75 + (((tickAnim - 392) / 18) * (0-(20.75)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 171) {
            xx = -6.5 + (((tickAnim - 60) / 111) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 60) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 111) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 215) {
            xx = -6.5 + (((tickAnim - 171) / 44) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 171) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 44) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 215) / 66) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 215) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 66) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 392) {
            xx = -6.5 + (((tickAnim - 281) / 111) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 281) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 111) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = -6.5 + (((tickAnim - 392) / 18) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 171) {
            xx = -15.5 + (((tickAnim - 60) / 111) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 60) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 111) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 215) {
            xx = -15.5 + (((tickAnim - 171) / 44) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 171) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 44) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 215) / 66) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 215) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 66) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 392) {
            xx = -15.5 + (((tickAnim - 281) / 111) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 281) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 111) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = -15.5 + (((tickAnim - 392) / 18) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 171) {
            xx = 20.75 + (((tickAnim - 60) / 111) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 60) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 111) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 215) {
            xx = 20.75 + (((tickAnim - 171) / 44) * (0-(20.75)));
            yy = 0 + (((tickAnim - 171) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 44) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 215) / 66) * (20.75-(0)));
            yy = 0 + (((tickAnim - 215) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 66) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 392) {
            xx = 20.75 + (((tickAnim - 281) / 111) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 281) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 111) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = 20.75 + (((tickAnim - 392) / 18) * (0-(20.75)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 8.75 + (((tickAnim - 60) / 20) * (16.5-(8.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 104) {
            xx = 16.5 + (((tickAnim - 80) / 24) * (8.75-(16.5)));
            yy = 0 + (((tickAnim - 80) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 24) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 124) {
            xx = 8.75 + (((tickAnim - 104) / 20) * (16.5-(8.75)));
            yy = 0 + (((tickAnim - 104) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 20) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 148) {
            xx = 16.5 + (((tickAnim - 124) / 24) * (8.75-(16.5)));
            yy = 0 + (((tickAnim - 124) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 24) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 171) {
            xx = 8.75 + (((tickAnim - 148) / 23) * (0-(8.75)));
            yy = 0 + (((tickAnim - 148) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 23) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 171) / 24) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 171) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 24) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 223) {
            xx = -4.25 + (((tickAnim - 195) / 28) * (-7.25-(-4.25)));
            yy = 0 + (((tickAnim - 195) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 28) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 281) {
            xx = -7.25 + (((tickAnim - 223) / 58) * (8.75-(-7.25)));
            yy = 0 + (((tickAnim - 223) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 58) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 301) {
            xx = 8.75 + (((tickAnim - 281) / 20) * (16.5-(8.75)));
            yy = 0 + (((tickAnim - 281) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 20) * (0-(0)));
        }
        else if (tickAnim >= 301 && tickAnim < 325) {
            xx = 16.5 + (((tickAnim - 301) / 24) * (8.75-(16.5)));
            yy = 0 + (((tickAnim - 301) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 301) / 24) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 345) {
            xx = 8.75 + (((tickAnim - 325) / 20) * (16.5-(8.75)));
            yy = 0 + (((tickAnim - 325) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 20) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 369) {
            xx = 16.5 + (((tickAnim - 345) / 24) * (8.75-(16.5)));
            yy = 0 + (((tickAnim - 345) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 24) * (0-(0)));
        }
        else if (tickAnim >= 369 && tickAnim < 392) {
            xx = 8.75 + (((tickAnim - 369) / 23) * (0-(8.75)));
            yy = 0 + (((tickAnim - 369) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 369) / 23) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.225-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 80) / 44) * (0-(0)));
            yy = 0.25 + (((tickAnim - 80) / 44) * (0.25-(0.25)));
            zz = 0.225 + (((tickAnim - 80) / 44) * (0.225-(0.225)));
        }
        else if (tickAnim >= 124 && tickAnim < 301) {
            xx = 0 + (((tickAnim - 124) / 177) * (0-(0)));
            yy = 0.25 + (((tickAnim - 124) / 177) * (0.25-(0.25)));
            zz = 0.225 + (((tickAnim - 124) / 177) * (0.225-(0.225)));
        }
        else if (tickAnim >= 301 && tickAnim < 345) {
            xx = 0 + (((tickAnim - 301) / 44) * (0-(0)));
            yy = 0.25 + (((tickAnim - 301) / 44) * (0.25-(0.25)));
            zz = 0.225 + (((tickAnim - 301) / 44) * (0.225-(0.225)));
        }
        else if (tickAnim >= 345 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 345) / 65) * (0-(0)));
            yy = 0.25 + (((tickAnim - 345) / 65) * (0-(0.25)));
            zz = 0.225 + (((tickAnim - 345) / 65) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (5.01137-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (1.89811-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.18019-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 5.01137 + (((tickAnim - 60) / 20) * (30.25-(5.01137)));
            yy = 1.89811 + (((tickAnim - 60) / 20) * (0-(1.89811)));
            zz = -0.18019 + (((tickAnim - 60) / 20) * (0-(-0.18019)));
        }
        else if (tickAnim >= 80 && tickAnim < 104) {
            xx = 30.25 + (((tickAnim - 80) / 24) * (5.01137-(30.25)));
            yy = 0 + (((tickAnim - 80) / 24) * (1.89811-(0)));
            zz = 0 + (((tickAnim - 80) / 24) * (-0.18019-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 124) {
            xx = 5.01137 + (((tickAnim - 104) / 20) * (30.25-(5.01137)));
            yy = 1.89811 + (((tickAnim - 104) / 20) * (0-(1.89811)));
            zz = -0.18019 + (((tickAnim - 104) / 20) * (0-(-0.18019)));
        }
        else if (tickAnim >= 124 && tickAnim < 148) {
            xx = 30.25 + (((tickAnim - 124) / 24) * (5.01137-(30.25)));
            yy = 0 + (((tickAnim - 124) / 24) * (1.89811-(0)));
            zz = 0 + (((tickAnim - 124) / 24) * (-0.18019-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 171) {
            xx = 5.01137 + (((tickAnim - 148) / 23) * (0-(5.01137)));
            yy = 1.89811 + (((tickAnim - 148) / 23) * (0-(1.89811)));
            zz = -0.18019 + (((tickAnim - 148) / 23) * (0-(-0.18019)));
        }
        else if (tickAnim >= 171 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 171) / 24) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 171) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 24) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 223) {
            xx = -4.5 + (((tickAnim - 195) / 28) * (-6.25-(-4.5)));
            yy = 0 + (((tickAnim - 195) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 28) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 281) {
            xx = -6.25 + (((tickAnim - 223) / 58) * (5.01137-(-6.25)));
            yy = 0 + (((tickAnim - 223) / 58) * (1.89811-(0)));
            zz = 0 + (((tickAnim - 223) / 58) * (-0.18019-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 301) {
            xx = 5.01137 + (((tickAnim - 281) / 20) * (30.25-(5.01137)));
            yy = 1.89811 + (((tickAnim - 281) / 20) * (0-(1.89811)));
            zz = -0.18019 + (((tickAnim - 281) / 20) * (0-(-0.18019)));
        }
        else if (tickAnim >= 301 && tickAnim < 325) {
            xx = 30.25 + (((tickAnim - 301) / 24) * (5.01137-(30.25)));
            yy = 0 + (((tickAnim - 301) / 24) * (1.89811-(0)));
            zz = 0 + (((tickAnim - 301) / 24) * (-0.18019-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 345) {
            xx = 5.01137 + (((tickAnim - 325) / 20) * (30.25-(5.01137)));
            yy = 1.89811 + (((tickAnim - 325) / 20) * (0-(1.89811)));
            zz = -0.18019 + (((tickAnim - 325) / 20) * (0-(-0.18019)));
        }
        else if (tickAnim >= 345 && tickAnim < 369) {
            xx = 30.25 + (((tickAnim - 345) / 24) * (5.01137-(30.25)));
            yy = 0 + (((tickAnim - 345) / 24) * (1.89811-(0)));
            zz = 0 + (((tickAnim - 345) / 24) * (-0.18019-(0)));
        }
        else if (tickAnim >= 369 && tickAnim < 392) {
            xx = 5.01137 + (((tickAnim - 369) / 23) * (0-(5.01137)));
            yy = 1.89811 + (((tickAnim - 369) / 23) * (0-(1.89811)));
            zz = -0.18019 + (((tickAnim - 369) / 23) * (0-(-0.18019)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.35-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 80) / 44) * (0-(0)));
            yy = -0.225 + (((tickAnim - 80) / 44) * (-0.225-(-0.225)));
            zz = 0.35 + (((tickAnim - 80) / 44) * (0.35-(0.35)));
        }
        else if (tickAnim >= 124 && tickAnim < 301) {
            xx = 0 + (((tickAnim - 124) / 177) * (0-(0)));
            yy = -0.225 + (((tickAnim - 124) / 177) * (-0.225-(-0.225)));
            zz = 0.35 + (((tickAnim - 124) / 177) * (0.35-(0.35)));
        }
        else if (tickAnim >= 301 && tickAnim < 345) {
            xx = 0 + (((tickAnim - 301) / 44) * (0-(0)));
            yy = -0.225 + (((tickAnim - 301) / 44) * (-0.225-(-0.225)));
            zz = 0.35 + (((tickAnim - 301) / 44) * (0.35-(0.35)));
        }
        else if (tickAnim >= 345 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 345) / 65) * (0-(0)));
            yy = -0.225 + (((tickAnim - 345) / 65) * (0-(-0.225)));
            zz = 0.35 + (((tickAnim - 345) / 65) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 0) / 73) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 73) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 14 + (((tickAnim - 73) / 7) * (4.5-(14)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 118) {
            xx = 4.5 + (((tickAnim - 80) / 38) * (14-(4.5)));
            yy = 0 + (((tickAnim - 80) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 38) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 14 + (((tickAnim - 118) / 6) * (4.5-(14)));
            yy = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 6) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 171) {
            xx = 4.5 + (((tickAnim - 124) / 47) * (0-(4.5)));
            yy = 0 + (((tickAnim - 124) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 47) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 171) / 24) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 171) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 24) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 223) {
            xx = -8.75 + (((tickAnim - 195) / 28) * (-3.5-(-8.75)));
            yy = 0 + (((tickAnim - 195) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 28) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 294) {
            xx = -3.5 + (((tickAnim - 223) / 71) * (14-(-3.5)));
            yy = 0 + (((tickAnim - 223) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 71) * (0-(0)));
        }
        else if (tickAnim >= 294 && tickAnim < 301) {
            xx = 14 + (((tickAnim - 294) / 7) * (4.5-(14)));
            yy = 0 + (((tickAnim - 294) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 294) / 7) * (0-(0)));
        }
        else if (tickAnim >= 301 && tickAnim < 338) {
            xx = 4.5 + (((tickAnim - 301) / 37) * (14-(4.5)));
            yy = 0 + (((tickAnim - 301) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 301) / 37) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 345) {
            xx = 14 + (((tickAnim - 338) / 7) * (4.5-(14)));
            yy = 0 + (((tickAnim - 338) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 338) / 7) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 392) {
            xx = 4.5 + (((tickAnim - 345) / 47) * (0-(4.5)));
            yy = 0 + (((tickAnim - 345) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 47) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 392) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 73) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 73) * (0.225-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = -0.075 + (((tickAnim - 73) / 7) * (-0.075-(-0.075)));
            zz = 0.225 + (((tickAnim - 73) / 7) * (0.225-(0.225)));
        }
        else if (tickAnim >= 80 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 80) / 38) * (0-(0)));
            yy = -0.075 + (((tickAnim - 80) / 38) * (-0.075-(-0.075)));
            zz = 0.225 + (((tickAnim - 80) / 38) * (0.225-(0.225)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            yy = -0.075 + (((tickAnim - 118) / 6) * (-0.075-(-0.075)));
            zz = 0.225 + (((tickAnim - 118) / 6) * (0.225-(0.225)));
        }
        else if (tickAnim >= 124 && tickAnim < 294) {
            xx = 0 + (((tickAnim - 124) / 170) * (0-(0)));
            yy = -0.075 + (((tickAnim - 124) / 170) * (-0.075-(-0.075)));
            zz = 0.225 + (((tickAnim - 124) / 170) * (0.225-(0.225)));
        }
        else if (tickAnim >= 294 && tickAnim < 301) {
            xx = 0 + (((tickAnim - 294) / 7) * (0-(0)));
            yy = -0.075 + (((tickAnim - 294) / 7) * (-0.075-(-0.075)));
            zz = 0.225 + (((tickAnim - 294) / 7) * (0.225-(0.225)));
        }
        else if (tickAnim >= 301 && tickAnim < 338) {
            xx = 0 + (((tickAnim - 301) / 37) * (0-(0)));
            yy = -0.075 + (((tickAnim - 301) / 37) * (-0.075-(-0.075)));
            zz = 0.225 + (((tickAnim - 301) / 37) * (0.225-(0.225)));
        }
        else if (tickAnim >= 338 && tickAnim < 345) {
            xx = 0 + (((tickAnim - 338) / 7) * (0-(0)));
            yy = -0.075 + (((tickAnim - 338) / 7) * (-0.075-(-0.075)));
            zz = 0.225 + (((tickAnim - 338) / 7) * (0.225-(0.225)));
        }
        else if (tickAnim >= 345 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 345) / 65) * (0-(0)));
            yy = -0.075 + (((tickAnim - 345) / 65) * (0-(-0.075)));
            zz = 0.225 + (((tickAnim - 345) / 65) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 20 + (((tickAnim - 60) / 13) * (-7.42-(20)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -7.42 + (((tickAnim - 73) / 7) * (-5.75-(-7.42)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -5.75 + (((tickAnim - 80) / 5) * (10.83-(-5.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 90) {
            xx = 10.83 + (((tickAnim - 85) / 5) * (15.47-(10.83)));
            yy = 0 + (((tickAnim - 85) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 5) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 98) {
            xx = 15.47 + (((tickAnim - 90) / 8) * (13.87-(15.47)));
            yy = 0 + (((tickAnim - 90) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 8) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 13.87 + (((tickAnim - 98) / 3) * (20.69-(13.87)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 104) {
            xx = 20.69 + (((tickAnim - 101) / 3) * (20-(20.69)));
            yy = 0 + (((tickAnim - 101) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 3) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 118) {
            xx = 20 + (((tickAnim - 104) / 14) * (-7.42-(20)));
            yy = 0 + (((tickAnim - 104) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 14) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = -7.42 + (((tickAnim - 118) / 6) * (-5.75-(-7.42)));
            yy = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 6) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 129) {
            xx = -5.75 + (((tickAnim - 124) / 5) * (10.83-(-5.75)));
            yy = 0 + (((tickAnim - 124) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 5) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 134) {
            xx = 10.83 + (((tickAnim - 129) / 5) * (15.47-(10.83)));
            yy = 0 + (((tickAnim - 129) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 5) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 142) {
            xx = 15.47 + (((tickAnim - 134) / 8) * (13.87-(15.47)));
            yy = 0 + (((tickAnim - 134) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 8) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = 13.87 + (((tickAnim - 142) / 3) * (20.69-(13.87)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 148) {
            xx = 20.69 + (((tickAnim - 145) / 3) * (20-(20.69)));
            yy = 0 + (((tickAnim - 145) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 3) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 195) {
            xx = 20 + (((tickAnim - 148) / 47) * (15.75-(20)));
            yy = 0 + (((tickAnim - 148) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 47) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 199) {
            xx = 15.75 + (((tickAnim - 195) / 4) * (14.5-(15.75)));
            yy = 0 + (((tickAnim - 195) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 4) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 203) {
            xx = 14.5 + (((tickAnim - 199) / 4) * (15.75-(14.5)));
            yy = 0 + (((tickAnim - 199) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 4) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 208) {
            xx = 15.75 + (((tickAnim - 203) / 5) * (14.5-(15.75)));
            yy = 0 + (((tickAnim - 203) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 5) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 212) {
            xx = 14.5 + (((tickAnim - 208) / 4) * (15.75-(14.5)));
            yy = 0 + (((tickAnim - 208) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 4) * (0-(0)));
        }
        else if (tickAnim >= 212 && tickAnim < 281) {
            xx = 15.75 + (((tickAnim - 212) / 69) * (20-(15.75)));
            yy = 0 + (((tickAnim - 212) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 212) / 69) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 294) {
            xx = 20 + (((tickAnim - 281) / 13) * (-7.42-(20)));
            yy = 0 + (((tickAnim - 281) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 13) * (0-(0)));
        }
        else if (tickAnim >= 294 && tickAnim < 301) {
            xx = -7.42 + (((tickAnim - 294) / 7) * (-5.75-(-7.42)));
            yy = 0 + (((tickAnim - 294) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 294) / 7) * (0-(0)));
        }
        else if (tickAnim >= 301 && tickAnim < 306) {
            xx = -5.75 + (((tickAnim - 301) / 5) * (10.83-(-5.75)));
            yy = 0 + (((tickAnim - 301) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 301) / 5) * (0-(0)));
        }
        else if (tickAnim >= 306 && tickAnim < 311) {
            xx = 10.83 + (((tickAnim - 306) / 5) * (15.47-(10.83)));
            yy = 0 + (((tickAnim - 306) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 306) / 5) * (0-(0)));
        }
        else if (tickAnim >= 311 && tickAnim < 318) {
            xx = 15.47 + (((tickAnim - 311) / 7) * (13.87-(15.47)));
            yy = 0 + (((tickAnim - 311) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 311) / 7) * (0-(0)));
        }
        else if (tickAnim >= 318 && tickAnim < 322) {
            xx = 13.87 + (((tickAnim - 318) / 4) * (20.69-(13.87)));
            yy = 0 + (((tickAnim - 318) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 318) / 4) * (0-(0)));
        }
        else if (tickAnim >= 322 && tickAnim < 325) {
            xx = 20.69 + (((tickAnim - 322) / 3) * (20-(20.69)));
            yy = 0 + (((tickAnim - 322) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 322) / 3) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 338) {
            xx = 20 + (((tickAnim - 325) / 13) * (-7.42-(20)));
            yy = 0 + (((tickAnim - 325) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 13) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 345) {
            xx = -7.42 + (((tickAnim - 338) / 7) * (-5.75-(-7.42)));
            yy = 0 + (((tickAnim - 338) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 338) / 7) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 350) {
            xx = -5.75 + (((tickAnim - 345) / 5) * (10.83-(-5.75)));
            yy = 0 + (((tickAnim - 345) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 5) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 355) {
            xx = 10.83 + (((tickAnim - 350) / 5) * (15.47-(10.83)));
            yy = 0 + (((tickAnim - 350) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 5) * (0-(0)));
        }
        else if (tickAnim >= 355 && tickAnim < 363) {
            xx = 15.47 + (((tickAnim - 355) / 8) * (13.87-(15.47)));
            yy = 0 + (((tickAnim - 355) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 355) / 8) * (0-(0)));
        }
        else if (tickAnim >= 363 && tickAnim < 366) {
            xx = 13.87 + (((tickAnim - 363) / 3) * (20.69-(13.87)));
            yy = 0 + (((tickAnim - 363) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 363) / 3) * (0-(0)));
        }
        else if (tickAnim >= 366 && tickAnim < 369) {
            xx = 20.69 + (((tickAnim - 366) / 3) * (20-(20.69)));
            yy = 0 + (((tickAnim - 366) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 366) / 3) * (0-(0)));
        }
        else if (tickAnim >= 369 && tickAnim < 410) {
            xx = 20 + (((tickAnim - 369) / 41) * (0-(20)));
            yy = 0 + (((tickAnim - 369) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 369) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.35-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0.1 + (((tickAnim - 60) / 20) * (0-(0.1)));
            zz = 0.35 + (((tickAnim - 60) / 20) * (0-(0.35)));
        }
        else if (tickAnim >= 80 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 80) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 24) * (0.1-(0)));
            zz = 0 + (((tickAnim - 80) / 24) * (0.35-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 104) / 20) * (0-(0)));
            yy = 0.1 + (((tickAnim - 104) / 20) * (0-(0.1)));
            zz = 0.35 + (((tickAnim - 104) / 20) * (0-(0.35)));
        }
        else if (tickAnim >= 124 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 124) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 24) * (0.1-(0)));
            zz = 0 + (((tickAnim - 124) / 24) * (0.35-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 148) / 133) * (0-(0)));
            yy = 0.1 + (((tickAnim - 148) / 133) * (0.1-(0.1)));
            zz = 0.35 + (((tickAnim - 148) / 133) * (0.35-(0.35)));
        }
        else if (tickAnim >= 281 && tickAnim < 301) {
            xx = 0 + (((tickAnim - 281) / 20) * (0-(0)));
            yy = 0.1 + (((tickAnim - 281) / 20) * (0-(0.1)));
            zz = 0.35 + (((tickAnim - 281) / 20) * (0-(0.35)));
        }
        else if (tickAnim >= 301 && tickAnim < 325) {
            xx = 0 + (((tickAnim - 301) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 301) / 24) * (0.1-(0)));
            zz = 0 + (((tickAnim - 301) / 24) * (0.35-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 345) {
            xx = 0 + (((tickAnim - 325) / 20) * (0-(0)));
            yy = 0.1 + (((tickAnim - 325) / 20) * (0-(0.1)));
            zz = 0.35 + (((tickAnim - 325) / 20) * (0-(0.35)));
        }
        else if (tickAnim >= 345 && tickAnim < 369) {
            xx = 0 + (((tickAnim - 345) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 345) / 24) * (0.1-(0)));
            zz = 0 + (((tickAnim - 345) / 24) * (0.35-(0)));
        }
        else if (tickAnim >= 369 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 369) / 41) * (0-(0)));
            yy = 0.1 + (((tickAnim - 369) / 41) * (0-(0.1)));
            zz = 0.35 + (((tickAnim - 369) / 41) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (16.5-(0)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 16.5 + (((tickAnim - 73) / 7) * (0-(16.5)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 87) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 87) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 3) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 5.5 + (((tickAnim - 90) / 3) * (0-(5.5)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 98) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 104) {
            xx = 5.5 + (((tickAnim - 101) / 3) * (0-(5.5)));
            yy = 0 + (((tickAnim - 101) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 3) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 104) / 14) * (16.5-(0)));
            yy = 0 + (((tickAnim - 104) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 14) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 16.5 + (((tickAnim - 118) / 6) * (0-(16.5)));
            yy = 0 + (((tickAnim - 118) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 6) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 124) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 7) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 131) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 131) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 3) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 138) {
            xx = 5.5 + (((tickAnim - 134) / 4) * (0-(5.5)));
            yy = 0 + (((tickAnim - 134) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 4) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 4) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 142) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 148) {
            xx = 5.5 + (((tickAnim - 145) / 3) * (0-(5.5)));
            yy = 0 + (((tickAnim - 145) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 3) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 148) / 133) * (0-(0)));
            yy = 0 + (((tickAnim - 148) / 133) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 133) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 294) {
            xx = 0 + (((tickAnim - 281) / 13) * (16.5-(0)));
            yy = 0 + (((tickAnim - 281) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 13) * (0-(0)));
        }
        else if (tickAnim >= 294 && tickAnim < 301) {
            xx = 16.5 + (((tickAnim - 294) / 7) * (0-(16.5)));
            yy = 0 + (((tickAnim - 294) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 294) / 7) * (0-(0)));
        }
        else if (tickAnim >= 301 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 301) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 301) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 301) / 7) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 311) {
            xx = 0 + (((tickAnim - 308) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 308) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 3) * (0-(0)));
        }
        else if (tickAnim >= 311 && tickAnim < 314) {
            xx = 5.5 + (((tickAnim - 311) / 3) * (0-(5.5)));
            yy = 0 + (((tickAnim - 311) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 311) / 3) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 318) {
            xx = 0 + (((tickAnim - 314) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 314) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 4) * (0-(0)));
        }
        else if (tickAnim >= 318 && tickAnim < 322) {
            xx = 0 + (((tickAnim - 318) / 4) * (5.5-(0)));
            yy = 0 + (((tickAnim - 318) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 318) / 4) * (0-(0)));
        }
        else if (tickAnim >= 322 && tickAnim < 325) {
            xx = 5.5 + (((tickAnim - 322) / 3) * (0-(5.5)));
            yy = 0 + (((tickAnim - 322) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 322) / 3) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 338) {
            xx = 0 + (((tickAnim - 325) / 13) * (16.5-(0)));
            yy = 0 + (((tickAnim - 325) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 13) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 345) {
            xx = 16.5 + (((tickAnim - 338) / 7) * (0-(16.5)));
            yy = 0 + (((tickAnim - 338) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 338) / 7) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 352) {
            xx = 0 + (((tickAnim - 345) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 345) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 7) * (0-(0)));
        }
        else if (tickAnim >= 352 && tickAnim < 355) {
            xx = 0 + (((tickAnim - 352) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 352) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 352) / 3) * (0-(0)));
        }
        else if (tickAnim >= 355 && tickAnim < 358) {
            xx = 5.5 + (((tickAnim - 355) / 3) * (0-(5.5)));
            yy = 0 + (((tickAnim - 355) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 355) / 3) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 363) {
            xx = 0 + (((tickAnim - 358) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 358) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 5) * (0-(0)));
        }
        else if (tickAnim >= 363 && tickAnim < 366) {
            xx = 0 + (((tickAnim - 363) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 363) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 363) / 3) * (0-(0)));
        }
        else if (tickAnim >= 366 && tickAnim < 369) {
            xx = 5.5 + (((tickAnim - 366) / 3) * (0-(5.5)));
            yy = 0 + (((tickAnim - 366) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 366) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMantellisaurus entity = (EntityPrehistoricFloraMantellisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -5.75 + (((tickAnim - 20) / 10) * (-5.75-(-5.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -5.75 + (((tickAnim - 30) / 20) * (0-(-5.75)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.5 + (((tickAnim - 20) / 10) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 30) / 20) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 39.25 + (((tickAnim - 20) / 10) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 39.25 + (((tickAnim - 30) / 20) * (0-(39.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24 + (((tickAnim - 20) / 10) * (-24-(-24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24 + (((tickAnim - 30) / 20) * (0-(-24)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.5 + (((tickAnim - 20) / 10) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 30) / 20) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 39.25 + (((tickAnim - 20) / 10) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 39.25 + (((tickAnim - 30) / 20) * (0-(39.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24 + (((tickAnim - 20) / 10) * (-24-(-24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24 + (((tickAnim - 30) / 20) * (0-(-24)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.5 + (((tickAnim - 20) / 10) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 30) / 20) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.75 + (((tickAnim - 20) / 10) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 30) / 20) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.75 + (((tickAnim - 20) / 10) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 30) / 20) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 20) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 30) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 23 + (((tickAnim - 20) / 10) * (23-(23)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 23 + (((tickAnim - 30) / 20) * (0-(23)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-40.60671-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (11.07628-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-4.64264-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -40.60671 + (((tickAnim - 20) / 10) * (-40.60671-(-40.60671)));
            yy = 11.07628 + (((tickAnim - 20) / 10) * (11.07628-(11.07628)));
            zz = -4.64264 + (((tickAnim - 20) / 10) * (-4.64264-(-4.64264)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -40.60671 + (((tickAnim - 30) / 20) * (0-(-40.60671)));
            yy = 11.07628 + (((tickAnim - 30) / 20) * (0-(11.07628)));
            zz = -4.64264 + (((tickAnim - 30) / 20) * (0-(-4.64264)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 20) / 10) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 30) / 20) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24 + (((tickAnim - 20) / 10) * (24-(24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 30) / 20) * (0-(24)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 10) * (0.825-(0.825)));
            zz = -0.225 + (((tickAnim - 20) / 10) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
            zz = -0.225 + (((tickAnim - 30) / 20) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 23 + (((tickAnim - 20) / 10) * (23-(23)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 23 + (((tickAnim - 30) / 20) * (0-(23)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-40.60671-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.07628-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (4.64264-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -40.60671 + (((tickAnim - 20) / 10) * (-40.60671-(-40.60671)));
            yy = -11.07628 + (((tickAnim - 20) / 10) * (-11.07628-(-11.07628)));
            zz = 4.64264 + (((tickAnim - 20) / 10) * (4.64264-(4.64264)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -40.60671 + (((tickAnim - 30) / 20) * (0-(-40.60671)));
            yy = -11.07628 + (((tickAnim - 30) / 20) * (0-(-11.07628)));
            zz = 4.64264 + (((tickAnim - 30) / 20) * (0-(4.64264)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 20) / 10) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 30) / 20) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24 + (((tickAnim - 20) / 10) * (24-(24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 30) / 20) * (0-(24)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 10) * (0.825-(0.825)));
            zz = -0.225 + (((tickAnim - 20) / 10) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
            zz = -0.225 + (((tickAnim - 30) / 20) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 20) / 10) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 30) / 20) * (0-(2.5)));
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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMantellisaurus entity = (EntityPrehistoricFloraMantellisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 21.5 + (((tickAnim - 28) / 22) * (0-(21.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 23.75 + (((tickAnim - 28) / 22) * (0-(23.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 14.5 + (((tickAnim - 28) / 12) * (-40.31-(14.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -40.31 + (((tickAnim - 40) / 10) * (0-(-40.31)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (65.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 65.75 + (((tickAnim - 10) / 18) * (44-(65.75)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 44 + (((tickAnim - 28) / 12) * (73.56-(44)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 73.56 + (((tickAnim - 40) / 10) * (0-(73.56)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.285-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.835-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            yy = 0.285 + (((tickAnim - 10) / 18) * (0.85-(0.285)));
            zz = -0.835 + (((tickAnim - 10) / 18) * (-0.725-(-0.835)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0.85 + (((tickAnim - 28) / 12) * (2.105-(0.85)));
            zz = -0.725 + (((tickAnim - 28) / 12) * (-1.22-(-0.725)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 2.105 + (((tickAnim - 40) / 10) * (0-(2.105)));
            zz = -1.22 + (((tickAnim - 40) / 10) * (0-(-1.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-88-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = -88 + (((tickAnim - 10) / 18) * (29.57078-(-88)));
            yy = 0 + (((tickAnim - 10) / 18) * (3.71765-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (4.62831-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 29.57078 + (((tickAnim - 28) / 12) * (14-(29.57078)));
            yy = 3.71765 + (((tickAnim - 28) / 12) * (0-(3.71765)));
            zz = 4.62831 + (((tickAnim - 28) / 12) * (0-(4.62831)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 40) / 10) * (0-(14)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.6-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 18) * (0-(0.15)));
            zz = -0.6 + (((tickAnim - 10) / 18) * (0.45-(-0.6)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0.45 + (((tickAnim - 28) / 12) * (0-(0.45)));
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
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);
        

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMantellisaurus entity = (EntityPrehistoricFloraMantellisaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -3.75 + (((tickAnim - 15) / 15) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -4.75 + (((tickAnim - 15) / 15) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.55-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.35 + (((tickAnim - 15) / 15) * (0-(0.35)));
            zz = 0.55 + (((tickAnim - 15) / 15) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -4.25 + (((tickAnim - 15) / 15) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 4.5 + (((tickAnim - 15) / 15) * (0-(4.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -3.25 + (((tickAnim - 15) / 15) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -6.75 + (((tickAnim - 10) / 5) * (2.5-(-6.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 2.5 + (((tickAnim - 15) / 8) * (10-(2.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 23) / 7) * (0-(10)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14.33-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 14.33 + (((tickAnim - 10) / 5) * (17-(14.33)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 17 + (((tickAnim - 15) / 8) * (0-(17)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMantellisaurus entity = (EntityPrehistoricFloraMantellisaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.5 + (((tickAnim - 8) / 7) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.75 + (((tickAnim - 8) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.75 + (((tickAnim - 8) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -2 + (((tickAnim - 8) / 7) * (0-(-2)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.5 + (((tickAnim - 8) / 7) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.25 + (((tickAnim - 8) / 7) * (0-(2.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 22.75 + (((tickAnim - 8) / 7) * (0-(22.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.4-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 8) / 7) * (0-(-0.6)));
            zz = -0.4 + (((tickAnim - 8) / 7) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-25.7359-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.79152-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-21.60769-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -25.7359 + (((tickAnim - 3) / 5) * (-69.61336-(-25.7359)));
            yy = 2.79152 + (((tickAnim - 3) / 5) * (-2.57832-(2.79152)));
            zz = -21.60769 + (((tickAnim - 3) / 5) * (-22.40286-(-21.60769)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -69.61336 + (((tickAnim - 8) / 7) * (0-(-69.61336)));
            yy = -2.57832 + (((tickAnim - 8) / 7) * (0-(-2.57832)));
            zz = -22.40286 + (((tickAnim - 8) / 7) * (0-(-22.40286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (11.53-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 11.53 + (((tickAnim - 3) / 5) * (-25.25-(11.53)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -25.25 + (((tickAnim - 8) / 7) * (0-(-25.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.32-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.69-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.8-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.32 + (((tickAnim - 3) / 5) * (-0.725-(-0.32)));
            yy = 0.69 + (((tickAnim - 3) / 5) * (1.55-(0.69)));
            zz = 0.8 + (((tickAnim - 3) / 5) * (0-(0.8)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.725 + (((tickAnim - 8) / 7) * (0-(-0.725)));
            yy = 1.55 + (((tickAnim - 8) / 7) * (0-(1.55)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.25 + (((tickAnim - 3) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 5) * (0-(0.75)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 10.75 + (((tickAnim - 4) / 4) * (-46-(10.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -46 + (((tickAnim - 8) / 7) * (0-(-46)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(opposablePinkie, opposablePinkie.rotateAngleX + (float) Math.toRadians(xx), opposablePinkie.rotateAngleY + (float) Math.toRadians(yy), opposablePinkie.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.25 + (((tickAnim - 8) / 7) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.875-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0.875 + (((tickAnim - 8) / 7) * (0-(0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.75 + (((tickAnim - 8) / 7) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 8) / 7) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 31.75 + (((tickAnim - 8) / 7) * (0-(31.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.625-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.05 + (((tickAnim - 8) / 7) * (0-(-0.05)));
            zz = 0.625 + (((tickAnim - 8) / 7) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);
        

    }
    public void animRunBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMantellisaurus entity = (EntityPrehistoricFloraMantellisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 8.25 + (((tickAnim - 0) / 7) * (35.5-(8.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 35.5 + (((tickAnim - 7) / 5) * (-5.5-(35.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -5.5 + (((tickAnim - 12) / 1) * (-23.5-(-5.5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -23.5 + (((tickAnim - 13) / 7) * (8.25-(-23.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -7.5 + (((tickAnim - 0) / 7) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -33.25 + (((tickAnim - 12) / 1) * (-27.75-(-33.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -27.75 + (((tickAnim - 13) / 7) * (-7.5-(-27.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (2.1-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.45-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 2.1 + (((tickAnim - 12) / 1) * (0.625-(2.1)));
            zz = 0.45 + (((tickAnim - 12) / 1) * (0-(0.45)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 13) / 7) * (0-(0.625)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-11.17-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -11.17 + (((tickAnim - 7) / 2) * (-48.74-(-11.17)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -48.74 + (((tickAnim - 9) / 3) * (-36.5-(-48.74)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -36.5 + (((tickAnim - 12) / 1) * (18.25-(-36.5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.25 + (((tickAnim - 13) / 7) * (0-(18.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.885-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.085-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.885 + (((tickAnim - 9) / 3) * (0.85-(0.885)));
            zz = -0.085 + (((tickAnim - 9) / 3) * (0.075-(-0.085)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 12) / 1) * (0-(0.85)));
            zz = 0.075 + (((tickAnim - 12) / 1) * (0-(0.075)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (75.11-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 75.11 + (((tickAnim - 3) / 4) * (76.75-(75.11)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 76.75 + (((tickAnim - 7) / 2) * (67.27-(76.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 67.27 + (((tickAnim - 9) / 3) * (96.5-(67.27)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 96.5 + (((tickAnim - 12) / 1) * (30.75-(96.5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 30.75 + (((tickAnim - 13) / 7) * (0-(30.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 0) / 2) * (2-(1.15)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.34-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2 + (((tickAnim - 2) / 1) * (0.49-(2)));
            zz = -0.34 + (((tickAnim - 2) / 1) * (-0.54-(-0.34)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.49 + (((tickAnim - 3) / 4) * (1.55-(0.49)));
            zz = -0.54 + (((tickAnim - 3) / 4) * (-0.325-(-0.54)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.55 + (((tickAnim - 7) / 1) * (3.34-(1.55)));
            zz = -0.325 + (((tickAnim - 7) / 1) * (-0.52-(-0.325)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 3.34 + (((tickAnim - 8) / 1) * (1.825-(3.34)));
            zz = -0.52 + (((tickAnim - 8) / 1) * (-0.72-(-0.52)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.825 + (((tickAnim - 9) / 3) * (1.1-(1.825)));
            zz = -0.72 + (((tickAnim - 9) / 3) * (-1.05-(-0.72)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.1 + (((tickAnim - 12) / 1) * (0.725-(1.1)));
            zz = -1.05 + (((tickAnim - 12) / 1) * (0-(-1.05)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.725 + (((tickAnim - 13) / 4) * (0.28-(0.725)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.28 + (((tickAnim - 17) / 3) * (0.575-(0.28)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-88.57-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -88.57 + (((tickAnim - 3) / 4) * (44.5-(-88.57)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 44.5 + (((tickAnim - 7) / 5) * (0-(44.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.065-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.065 + (((tickAnim - 3) / 4) * (-0.55-(0.065)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -0.55 + (((tickAnim - 7) / 5) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-140))*1.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-1.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-2), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-190))*6), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*6));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-220))*12), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*9));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*1.5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*0.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*1.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*1.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-430))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5.5 + (((tickAnim - 0) / 3) * (-21.75-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -21.75 + (((tickAnim - 3) / 12) * (35.5-(-21.75)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 35.5 + (((tickAnim - 15) / 5) * (-5.5-(35.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -33.25 + (((tickAnim - 0) / 3) * (-27.75-(-33.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -27.75 + (((tickAnim - 3) / 12) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 2.1 + (((tickAnim - 0) / 3) * (0.625-(2.1)));
            zz = 0.45 + (((tickAnim - 0) / 3) * (0-(0.45)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0.625 + (((tickAnim - 3) / 12) * (0-(0.625)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (2.1-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0.45-(0)));
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
            xx = -36.5 + (((tickAnim - 0) / 3) * (8-(-36.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 8 + (((tickAnim - 3) / 12) * (-11.17-(8)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -11.17 + (((tickAnim - 15) / 3) * (-43.05-(-11.17)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -43.05 + (((tickAnim - 18) / 2) * (-36.5-(-43.05)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 3) * (0-(0.85)));
            zz = 0.075 + (((tickAnim - 0) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (1.01-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.07-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.01 + (((tickAnim - 18) / 2) * (0.85-(1.01)));
            zz = 0.07 + (((tickAnim - 18) / 2) * (0.075-(0.07)));
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
            xx = 96.5 + (((tickAnim - 0) / 3) * (41.5-(96.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 41.5 + (((tickAnim - 3) / 2) * (24.47-(41.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 24.47 + (((tickAnim - 5) / 4) * (8.75-(24.47)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 8.75 + (((tickAnim - 9) / 1) * (40.8-(8.75)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 40.8 + (((tickAnim - 10) / 2) * (62.71-(40.8)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 62.71 + (((tickAnim - 12) / 3) * (76.75-(62.71)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 76.75 + (((tickAnim - 15) / 3) * (72.82-(76.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 72.82 + (((tickAnim - 18) / 2) * (96.5-(72.82)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 0) / 3) * (2.175-(1.1)));
            zz = -1.05 + (((tickAnim - 0) / 3) * (0-(-1.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2.175 + (((tickAnim - 3) / 2) * (0.495-(2.175)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.495 + (((tickAnim - 5) / 2) * (0.2-(0.495)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 7) / 2) * (1.375-(0.2)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.375 + (((tickAnim - 9) / 1) * (3.05-(1.375)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 3.05 + (((tickAnim - 10) / 2) * (2.475-(3.05)));
            zz = 0 + (((tickAnim - 10) / 2) * (-0.675-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 2.475 + (((tickAnim - 12) / 3) * (1.55-(2.475)));
            zz = -0.675 + (((tickAnim - 12) / 3) * (-0.325-(-0.675)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.55 + (((tickAnim - 15) / 5) * (1.1-(1.55)));
            zz = -0.325 + (((tickAnim - 15) / 5) * (-1.05-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




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
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (-72.25-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -72.25 + (((tickAnim - 12) / 3) * (44.5-(-72.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 44.5 + (((tickAnim - 15) / 5) * (0-(44.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
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
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);

    }
    public void animWalkQuad(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMantellisaurus entity = (EntityPrehistoricFloraMantellisaurus) entitylivingbaseIn;
        int animCycle = 36;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 8.25 + (((tickAnim - 0) / 12) * (35.5-(8.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 35.5 + (((tickAnim - 12) / 10) * (-5.5-(35.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -5.5 + (((tickAnim - 22) / 3) * (-12.75-(-5.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -12.75 + (((tickAnim - 25) / 12) * (8.25-(-12.75)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -7.5 + (((tickAnim - 0) / 12) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -33.25 + (((tickAnim - 22) / 3) * (-27.75-(-33.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -27.75 + (((tickAnim - 25) / 12) * (-7.5-(-27.75)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 10) * (2.1-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0.45-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 2.1 + (((tickAnim - 22) / 3) * (0.625-(2.1)));
            zz = 0.45 + (((tickAnim - 22) / 3) * (0-(0.45)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0.625 + (((tickAnim - 25) / 12) * (0-(0.625)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-11.17-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -11.17 + (((tickAnim - 12) / 6) * (-41.49-(-11.17)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -41.49 + (((tickAnim - 18) / 4) * (-36.5-(-41.49)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -36.5 + (((tickAnim - 22) / 3) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0.885-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0.14-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.885 + (((tickAnim - 18) / 4) * (0.85-(0.885)));
            zz = 0.14 + (((tickAnim - 18) / 4) * (0.075-(0.14)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 22) / 3) * (0-(0.85)));
            zz = 0.075 + (((tickAnim - 22) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (75.11-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 75.11 + (((tickAnim - 6) / 6) * (76.75-(75.11)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 76.75 + (((tickAnim - 12) / 6) * (67.27-(76.75)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 67.27 + (((tickAnim - 18) / 4) * (96.5-(67.27)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 96.5 + (((tickAnim - 22) / 3) * (41.5-(96.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 41.5 + (((tickAnim - 25) / 12) * (0-(41.5)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 3) * (1.4-(0.575)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.34-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.4 + (((tickAnim - 3) / 3) * (1.04-(1.4)));
            zz = -0.34 + (((tickAnim - 3) / 3) * (-0.54-(-0.34)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 1.04 + (((tickAnim - 6) / 6) * (1.55-(1.04)));
            zz = -0.54 + (((tickAnim - 6) / 6) * (-0.325-(-0.54)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.55 + (((tickAnim - 12) / 3) * (3.015-(1.55)));
            zz = -0.325 + (((tickAnim - 12) / 3) * (-0.52-(-0.325)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 3.015 + (((tickAnim - 15) / 3) * (1.825-(3.015)));
            zz = -0.52 + (((tickAnim - 15) / 3) * (-0.72-(-0.52)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.825 + (((tickAnim - 18) / 4) * (1.1-(1.825)));
            zz = -0.72 + (((tickAnim - 18) / 4) * (-1.05-(-0.72)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 22) / 3) * (1.225-(1.1)));
            zz = -1.05 + (((tickAnim - 22) / 3) * (0-(-1.05)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = 1.225 + (((tickAnim - 25) / 6) * (1.88-(1.225)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            yy = 1.88 + (((tickAnim - 31) / 6) * (0.575-(1.88)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-88.57-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -88.57 + (((tickAnim - 6) / 6) * (44.5-(-88.57)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 44.5 + (((tickAnim - 12) / 10) * (0-(44.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.065-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.065 + (((tickAnim - 6) / 6) * (-0.55-(0.065)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 12) / 10) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5.5 + (((tickAnim - 0) / 4) * (-12.75-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = -12.75 + (((tickAnim - 4) / 23) * (35.5-(-12.75)));
            yy = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 35.5 + (((tickAnim - 27) / 10) * (-5.5-(35.5)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -33.25 + (((tickAnim - 0) / 4) * (-27.75-(-33.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = -27.75 + (((tickAnim - 4) / 23) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (-1.8-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -1.8 + (((tickAnim - 28) / 9) * (-33.25-(-1.8)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 2.1 + (((tickAnim - 0) / 4) * (0.625-(2.1)));
            zz = 0.45 + (((tickAnim - 0) / 4) * (0-(0.45)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            yy = 0.625 + (((tickAnim - 4) / 23) * (0-(0.625)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 10) * (2.1-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -36.5 + (((tickAnim - 0) / 4) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 4) / 23) * (-11.17-(0)));
            yy = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -11.17 + (((tickAnim - 27) / 6) * (-43.05-(-11.17)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -43.05 + (((tickAnim - 33) / 4) * (-36.5-(-43.05)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 4) * (0-(0.85)));
            zz = 0.075 + (((tickAnim - 0) / 4) * (0-(0.075)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (1.01-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0.07-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 1.01 + (((tickAnim - 33) / 4) * (0.85-(1.01)));
            zz = 0.07 + (((tickAnim - 33) / 4) * (0.075-(0.07)));
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
            xx = 96.5 + (((tickAnim - 0) / 4) * (41.5-(96.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = 41.5 + (((tickAnim - 4) / 12) * (8.75-(41.5)));
            yy = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 12) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 8.75 + (((tickAnim - 16) / 3) * (40.8-(8.75)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 40.8 + (((tickAnim - 19) / 3) * (62.71-(40.8)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 62.71 + (((tickAnim - 22) / 5) * (76.75-(62.71)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 76.75 + (((tickAnim - 27) / 2) * (34.07-(76.75)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 34.07 + (((tickAnim - 29) / 4) * (72.82-(34.07)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 72.82 + (((tickAnim - 33) / 4) * (96.5-(72.82)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.1 + (((tickAnim - 0) / 4) * (1.225-(1.1)));
            zz = -1.05 + (((tickAnim - 0) / 4) * (0-(-1.05)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 1.225 + (((tickAnim - 4) / 6) * (1.97-(1.225)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 1.97 + (((tickAnim - 10) / 6) * (0.875-(1.97)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.875 + (((tickAnim - 16) / 3) * (1.65-(0.875)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.65 + (((tickAnim - 19) / 3) * (1.25-(1.65)));
            zz = 0 + (((tickAnim - 19) / 3) * (-0.675-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 1.25 + (((tickAnim - 22) / 5) * (1.55-(1.25)));
            zz = -0.675 + (((tickAnim - 22) / 5) * (-0.325-(-0.675)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            yy = 1.55 + (((tickAnim - 27) / 10) * (1.1-(1.55)));
            zz = -0.325 + (((tickAnim - 27) / 10) * (-1.05-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 12) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (-72.25-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -72.25 + (((tickAnim - 22) / 5) * (44.5-(-72.25)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 44.5 + (((tickAnim - 27) / 10) * (0-(44.5)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 12) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 27) / 10) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 1.5 + (((tickAnim - 0) / 16) * (-59.09872-(1.5)));
            yy = 0 + (((tickAnim - 0) / 16) * (-1.58552-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-9.12543-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 37) {
            xx = -59.09872 + (((tickAnim - 16) / 21) * (1.5-(-59.09872)));
            yy = -1.58552 + (((tickAnim - 16) / 21) * (0-(-1.58552)));
            zz = -9.12543 + (((tickAnim - 16) / 21) * (0-(-9.12543)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 0) / 8) * (-36.87-(13.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -36.87 + (((tickAnim - 8) / 8) * (30.5-(-36.87)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 37) {
            xx = 30.5 + (((tickAnim - 16) / 21) * (13.5-(30.5)));
            yy = 0 + (((tickAnim - 16) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.565-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = -0.565 + (((tickAnim - 8) / 8) * (0-(-0.565)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0.615-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.615 + (((tickAnim - 23) / 5) * (0.375-(0.615)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = 0.375 + (((tickAnim - 28) / 9) * (0-(0.375)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -51.09872 + (((tickAnim - 0) / 21) * (1.5-(-51.09872)));
            yy = 1.58552 + (((tickAnim - 0) / 21) * (0-(1.58552)));
            zz = 9.12543 + (((tickAnim - 0) / 21) * (0-(9.12543)));
        }
        else if (tickAnim >= 21 && tickAnim < 37) {
            xx = 1.5 + (((tickAnim - 21) / 16) * (-51.09872-(1.5)));
            yy = 0 + (((tickAnim - 21) / 16) * (1.58552-(0)));
            zz = 0 + (((tickAnim - 21) / 16) * (9.12543-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 26.5 + (((tickAnim - 0) / 21) * (13.5-(26.5)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = 13.5 + (((tickAnim - 21) / 8) * (-36.87-(13.5)));
            yy = 0 + (((tickAnim - 21) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 8) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = -36.87 + (((tickAnim - 29) / 8) * (26.5-(-36.87)));
            yy = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 21) * (0-(0.5)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 21) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 8) * (-0.565-(0)));
            zz = 0 + (((tickAnim - 21) / 8) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            yy = -0.565 + (((tickAnim - 29) / 8) * (0.5-(-0.565)));
            zz = 0 + (((tickAnim - 29) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.4063 + (((tickAnim - 0) / 8) * (4.09117-(17.4063)));
            yy = -24.10271 + (((tickAnim - 0) / 8) * (-14.05992-(-24.10271)));
            zz = 13.45921 + (((tickAnim - 0) / 8) * (7.8512-(13.45921)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 4.09117 + (((tickAnim - 8) / 13) * (11.25-(4.09117)));
            yy = -14.05992 + (((tickAnim - 8) / 13) * (0-(-14.05992)));
            zz = 7.8512 + (((tickAnim - 8) / 13) * (0-(7.8512)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = 11.25 + (((tickAnim - 21) / 8) * (57.08867-(11.25)));
            yy = 0 + (((tickAnim - 21) / 8) * (-28.68359-(0)));
            zz = 0 + (((tickAnim - 21) / 8) * (21.50128-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 57.08867 + (((tickAnim - 29) / 8) * (17.4063-(57.08867)));
            yy = -28.68359 + (((tickAnim - 29) / 8) * (-24.10271-(-28.68359)));
            zz = 21.50128 + (((tickAnim - 29) / 8) * (13.45921-(21.50128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 8) * (1.24-(0.675)));
            zz = -0.225 + (((tickAnim - 0) / 8) * (-0.13-(-0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            yy = 1.24 + (((tickAnim - 8) / 13) * (0-(1.24)));
            zz = -0.13 + (((tickAnim - 8) / 13) * (0-(-0.13)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 21) / 8) * (-0.325-(0)));
            yy = 0 + (((tickAnim - 21) / 8) * (0.885-(0)));
            zz = 0 + (((tickAnim - 21) / 8) * (-0.58-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = -0.325 + (((tickAnim - 29) / 8) * (0-(-0.325)));
            yy = 0.885 + (((tickAnim - 29) / 8) * (0.675-(0.885)));
            zz = -0.58 + (((tickAnim - 29) / 8) * (-0.225-(-0.58)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-50))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-70))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-70))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-120))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-80))*-0.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-50))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-80))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-50))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-100))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-120))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-100))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-160))*3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-200))*6));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-200))*4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-200))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-250))*9));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-150))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-70))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-120))*-3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-200))*1.5));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 11.25 + (((tickAnim - 0) / 8) * (57.08867-(11.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (28.68359-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-21.50128-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 57.08867 + (((tickAnim - 8) / 8) * (17.4063-(57.08867)));
            yy = 28.68359 + (((tickAnim - 8) / 8) * (24.10271-(28.68359)));
            zz = -21.50128 + (((tickAnim - 8) / 8) * (-13.45921-(-21.50128)));
        }
        else if (tickAnim >= 16 && tickAnim < 37) {
            xx = 17.4063 + (((tickAnim - 16) / 21) * (11.25-(17.4063)));
            yy = 24.10271 + (((tickAnim - 16) / 21) * (0-(24.10271)));
            zz = -13.45921 + (((tickAnim - 16) / 21) * (0-(-13.45921)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.885-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.58-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -0.325 + (((tickAnim - 8) / 8) * (0-(-0.325)));
            yy = 0.885 + (((tickAnim - 8) / 8) * (0.675-(0.885)));
            zz = -0.58 + (((tickAnim - 8) / 8) * (-0.225-(-0.58)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            yy = 0.675 + (((tickAnim - 16) / 12) * (1.06-(0.675)));
            zz = -0.225 + (((tickAnim - 16) / 12) * (-0.1-(-0.225)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = 1.06 + (((tickAnim - 28) / 9) * (0-(1.06)));
            zz = -0.1 + (((tickAnim - 28) / 9) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-150))*0.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-250))*1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-200))*0.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-300))*1.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-250))*1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-350))*1.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-350))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-430))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalkBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMantellisaurus entity = (EntityPrehistoricFloraMantellisaurus) entitylivingbaseIn;
        int animCycle = 36;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 8.25 + (((tickAnim - 0) / 12) * (35.5-(8.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 35.5 + (((tickAnim - 12) / 10) * (-5.5-(35.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -5.5 + (((tickAnim - 22) / 3) * (-12.75-(-5.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -12.75 + (((tickAnim - 25) / 12) * (8.25-(-12.75)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -7.5 + (((tickAnim - 0) / 12) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -33.25 + (((tickAnim - 22) / 3) * (-27.75-(-33.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -27.75 + (((tickAnim - 25) / 12) * (-7.5-(-27.75)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 10) * (2.1-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0.45-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 2.1 + (((tickAnim - 22) / 3) * (0.625-(2.1)));
            zz = 0.45 + (((tickAnim - 22) / 3) * (0-(0.45)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0.625 + (((tickAnim - 25) / 12) * (0-(0.625)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-11.17-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -11.17 + (((tickAnim - 12) / 6) * (-41.49-(-11.17)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -41.49 + (((tickAnim - 18) / 4) * (-36.5-(-41.49)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -36.5 + (((tickAnim - 22) / 3) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0.885-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0.14-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.885 + (((tickAnim - 18) / 4) * (0.85-(0.885)));
            zz = 0.14 + (((tickAnim - 18) / 4) * (0.075-(0.14)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 22) / 3) * (0-(0.85)));
            zz = 0.075 + (((tickAnim - 22) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (75.11-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 75.11 + (((tickAnim - 6) / 6) * (76.75-(75.11)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 76.75 + (((tickAnim - 12) / 6) * (67.27-(76.75)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 67.27 + (((tickAnim - 18) / 4) * (96.5-(67.27)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 96.5 + (((tickAnim - 22) / 3) * (41.5-(96.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 41.5 + (((tickAnim - 25) / 12) * (0-(41.5)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 3) * (1.4-(0.575)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.34-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.4 + (((tickAnim - 3) / 3) * (1.04-(1.4)));
            zz = -0.34 + (((tickAnim - 3) / 3) * (-0.54-(-0.34)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 1.04 + (((tickAnim - 6) / 6) * (1.55-(1.04)));
            zz = -0.54 + (((tickAnim - 6) / 6) * (-0.325-(-0.54)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.55 + (((tickAnim - 12) / 3) * (3.015-(1.55)));
            zz = -0.325 + (((tickAnim - 12) / 3) * (-0.52-(-0.325)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 3.015 + (((tickAnim - 15) / 3) * (1.825-(3.015)));
            zz = -0.52 + (((tickAnim - 15) / 3) * (-0.72-(-0.52)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.825 + (((tickAnim - 18) / 4) * (1.1-(1.825)));
            zz = -0.72 + (((tickAnim - 18) / 4) * (-1.05-(-0.72)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 22) / 3) * (1.225-(1.1)));
            zz = -1.05 + (((tickAnim - 22) / 3) * (0-(-1.05)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = 1.225 + (((tickAnim - 25) / 6) * (1.305-(1.225)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            yy = 1.305 + (((tickAnim - 31) / 6) * (0.575-(1.305)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-88.57-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -88.57 + (((tickAnim - 6) / 6) * (44.5-(-88.57)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 44.5 + (((tickAnim - 12) / 10) * (0-(44.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.065-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.065 + (((tickAnim - 6) / 6) * (-0.55-(0.065)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 12) / 10) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-50))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-70))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-70))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-120))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-80))*-1);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-50))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-80))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-50))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-100))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-120))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-100))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-160))*3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-200))*6));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-200))*4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-200))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-250))*9));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-150))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-70))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-120))*-3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-200))*1.5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-150))*0.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-250))*1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-200))*0.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-300))*1.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-250))*1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-350))*1.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-350))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-430))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5.5 + (((tickAnim - 0) / 4) * (-12.75-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = -12.75 + (((tickAnim - 4) / 23) * (35.5-(-12.75)));
            yy = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 35.5 + (((tickAnim - 27) / 10) * (-5.5-(35.5)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -33.25 + (((tickAnim - 0) / 4) * (-27.75-(-33.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = -27.75 + (((tickAnim - 4) / 23) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (-1.8-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -1.8 + (((tickAnim - 28) / 9) * (-33.25-(-1.8)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 2.1 + (((tickAnim - 0) / 4) * (0.625-(2.1)));
            zz = 0.45 + (((tickAnim - 0) / 4) * (0-(0.45)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            yy = 0.625 + (((tickAnim - 4) / 23) * (0-(0.625)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 10) * (2.1-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -36.5 + (((tickAnim - 0) / 4) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 4) / 23) * (-11.17-(0)));
            yy = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -11.17 + (((tickAnim - 27) / 6) * (-43.05-(-11.17)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -43.05 + (((tickAnim - 33) / 4) * (-36.5-(-43.05)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 4) * (0-(0.85)));
            zz = 0.075 + (((tickAnim - 0) / 4) * (0-(0.075)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (1.01-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0.07-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 1.01 + (((tickAnim - 33) / 4) * (0.85-(1.01)));
            zz = 0.07 + (((tickAnim - 33) / 4) * (0.075-(0.07)));
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
            xx = 96.5 + (((tickAnim - 0) / 4) * (41.5-(96.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = 41.5 + (((tickAnim - 4) / 12) * (8.75-(41.5)));
            yy = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 12) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 8.75 + (((tickAnim - 16) / 3) * (40.8-(8.75)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 40.8 + (((tickAnim - 19) / 3) * (62.71-(40.8)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 62.71 + (((tickAnim - 22) / 5) * (76.75-(62.71)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 76.75 + (((tickAnim - 27) / 2) * (34.07-(76.75)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 34.07 + (((tickAnim - 29) / 4) * (72.82-(34.07)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 72.82 + (((tickAnim - 33) / 4) * (96.5-(72.82)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.1 + (((tickAnim - 0) / 4) * (1.225-(1.1)));
            zz = -1.05 + (((tickAnim - 0) / 4) * (0-(-1.05)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 1.225 + (((tickAnim - 4) / 6) * (1.295-(1.225)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 1.295 + (((tickAnim - 10) / 6) * (0.875-(1.295)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.875 + (((tickAnim - 16) / 3) * (1.65-(0.875)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.65 + (((tickAnim - 19) / 3) * (1.25-(1.65)));
            zz = 0 + (((tickAnim - 19) / 3) * (-0.675-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 1.25 + (((tickAnim - 22) / 5) * (1.55-(1.25)));
            zz = -0.675 + (((tickAnim - 22) / 5) * (-0.325-(-0.675)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            yy = 1.55 + (((tickAnim - 27) / 10) * (1.1-(1.55)));
            zz = -0.325 + (((tickAnim - 27) / 10) * (-1.05-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 12) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (-72.25-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -72.25 + (((tickAnim - 22) / 5) * (44.5-(-72.25)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 44.5 + (((tickAnim - 27) / 10) * (0-(44.5)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 12) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 27) / 10) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMantellisaurus e = (EntityPrehistoricFloraMantellisaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.TOBI_ANIMATION);
        animator.startKeyframe(e.getToBiTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, ((-0.0698F)-(-0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.0349F)-(0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.0175F)-(0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((-0.1396F)-(-0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((0.0349F)-(0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((-0.0524F)-(-0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((0.3229F)-(0.3229F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r18, ((0.2007F)-(0.2007F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((0.5934F)-(0.5934F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.0175F)-(-0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((0.4712F)-(0.4712F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r21, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r22, ((0.4712F)-(0.4712F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r23, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r24, ((0.1396F)-(0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r25, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.3054F)-(0.3054F)));
        animator.rotate(cube_r26, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r27, ((0.1396F)-(0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r28, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r29, ((0.4887F)-(0.4887F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.192F)-(-0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r30, ((0.4887F)-(0.4887F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r31, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r32, ((-0.0524F)-(-0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r33, ((-0.2443F)-(-0.2443F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r34, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r35, ((-0.2269F)-(-0.2269F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r36, ((-0.4189F)-(-0.4189F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r37, ((-0.1571F)-(-0.1571F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r38, ((-0.1396F)-(-0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r39, ((-0.2793F)-(-0.2793F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((0.0561F)-(0.0561F)), ((0.0026F)-(0.0026F)),((0.025F)-(0.025F)));
        animator.rotate(cube_r40, ((-0.0611F)-(-0.0611F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r41, ((0.1658F)-(0.1658F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r42, ((0.096F)-(0.096F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r43, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r44, ((0.3142F)-(0.3142F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r45, ((-0.4887F)-(-0.4887F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r46, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r47, ((-1.6144F)-(-1.6144F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r48, ((0.9948F)-(0.9948F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r49, ((-0.2967F)-(-0.2967F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((-0.192F)-(-0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r50, ((0.0524F)-(0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r51, ((0.6283F)-(0.6283F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r52, ((0.4363F)-(0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r53, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r54, ((-0.2443F)-(-0.2443F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r55, ((-0.0698F)-(-0.0698F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r56, ((-0.3578F)-(-0.3578F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r57, ((-0.48F)-(-0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r58, ((0.0785F)-(0.0785F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r59, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.0561F)-(0.0561F)), ((-0.0026F)-(-0.0026F)),((-0.025F)-(-0.025F)));
        animator.rotate(cube_r60, ((0.0349F)-(0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r61, ((-0.2007F)-(-0.2007F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r62, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((-0.0698F)-(-0.0698F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.1396F)-(0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((0.288F)-(0.288F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hips, ((-0.1396F)-(-0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((-0.0347F)-(-0.0347F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftArm, ((0.7549F)-(0.48F)), ((0.0F)-(0.0F)),((-0.1745F)-(-0.1745F)));
        animator.rotate(leftArm2, ((-1.2449F)-(-0.778F)), ((0.4728F)-(0.4728F)),((-0.1272F)-(-0.1272F)));
        animator.rotate(leftArm3, ((0.6236F)-(0.2294F)), ((0.2241F)-(0.3165F)),((0.3982F)-(0.1985F)));
        animator.rotate(leftLeg, ((0.1091F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg2, ((0.7243F)-(0.7243F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg3, ((-0.7854F)-(-0.7854F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg4, ((0.1047F)-(0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.2967F)-(-0.2967F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((0.3796F)-(0.2793F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie, ((0.7069F)-(1.1781F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie2, ((0.7069F)-(1.1781F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightArm, ((0.7549F)-(0.48F)), ((0.0F)-(0.0F)),((0.1745F)-(0.1745F)));
        animator.rotate(rightArm2, ((-1.2449F)-(-0.778F)), ((-0.4728F)-(-0.4728F)),((0.1272F)-(0.1272F)));
        animator.rotate(rightArm3, ((0.6236F)-(0.2294F)), ((-0.2241F)-(-0.3165F)),((-0.3982F)-(-0.1985F)));
        animator.rotate(rightLeg, ((0.1091F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg2, ((0.7243F)-(0.7243F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg3, ((-0.7854F)-(-0.7854F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg4, ((0.1047F)-(0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.096F)-(-0.1571F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail2, ((-0.0175F)-(-0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail3, ((0.0087F)-(0.0087F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail4, ((-0.0175F)-(-0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail5, ((-0.1047F)-(-0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));

       


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.TOQUAD_ANIMATION);
        animator.startKeyframe(e.getToQuadTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, -((-0.0698F)-(-0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((0.0349F)-(0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.0175F)-(0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((-0.1396F)-(-0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((0.0349F)-(0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((-0.0524F)-(-0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((0.3229F)-(0.3229F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r18, -((0.2007F)-(0.2007F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((0.5934F)-(0.5934F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.0175F)-(-0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((0.4712F)-(0.4712F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r21, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r22, -((0.4712F)-(0.4712F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r23, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r24, -((0.1396F)-(0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r25, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.3054F)-(0.3054F)));
        animator.rotate(cube_r26, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r27, -((0.1396F)-(0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r28, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.3054F)-(-0.3054F)));
        animator.rotate(cube_r29, -((0.4887F)-(0.4887F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.192F)-(-0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r30, -((0.4887F)-(0.4887F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r31, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r32, -((-0.0524F)-(-0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r33, -((-0.2443F)-(-0.2443F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r34, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r35, -((-0.2269F)-(-0.2269F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r36, -((-0.4189F)-(-0.4189F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r37, -((-0.1571F)-(-0.1571F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r38, -((-0.1396F)-(-0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r39, -((-0.2793F)-(-0.2793F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((0.0561F)-(0.0561F)), -((0.0026F)-(0.0026F)),-((0.025F)-(0.025F)));
        animator.rotate(cube_r40, -((-0.0611F)-(-0.0611F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r41, -((0.1658F)-(0.1658F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r42, -((0.096F)-(0.096F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r43, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r44, -((0.3142F)-(0.3142F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r45, -((-0.4887F)-(-0.4887F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r46, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r47, -((-1.6144F)-(-1.6144F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r48, -((0.9948F)-(0.9948F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r49, -((-0.2967F)-(-0.2967F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((-0.192F)-(-0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r50, -((0.0524F)-(0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r51, -((0.6283F)-(0.6283F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r52, -((0.4363F)-(0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r53, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r54, -((-0.2443F)-(-0.2443F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r55, -((-0.0698F)-(-0.0698F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r56, -((-0.3578F)-(-0.3578F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r57, -((-0.48F)-(-0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r58, -((0.0785F)-(0.0785F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r59, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.0561F)-(0.0561F)), -((-0.0026F)-(-0.0026F)),-((-0.025F)-(-0.025F)));
        animator.rotate(cube_r60, -((0.0349F)-(0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r61, -((-0.2007F)-(-0.2007F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r62, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((-0.0698F)-(-0.0698F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.1396F)-(0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((0.288F)-(0.288F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hips, -((-0.1396F)-(-0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((-0.0347F)-(-0.0347F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftArm, -((0.7549F)-(0.48F)), -((0.0F)-(0.0F)),-((-0.1745F)-(-0.1745F)));
        animator.rotate(leftArm2, -((-1.2449F)-(-0.778F)), -((0.4728F)-(0.4728F)),-((-0.1272F)-(-0.1272F)));
        animator.rotate(leftArm3, -((0.6236F)-(0.2294F)), -((0.2241F)-(0.3165F)),-((0.3982F)-(0.1985F)));
        animator.rotate(leftLeg, -((0.1091F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg2, -((0.7243F)-(0.7243F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg3, -((-0.7854F)-(-0.7854F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg4, -((0.1047F)-(0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.2967F)-(-0.2967F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((0.3796F)-(0.2793F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie, -((0.7069F)-(1.1781F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie2, -((0.7069F)-(1.1781F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightArm, -((0.7549F)-(0.48F)), -((0.0F)-(0.0F)),-((0.1745F)-(0.1745F)));
        animator.rotate(rightArm2, -((-1.2449F)-(-0.778F)), -((-0.4728F)-(-0.4728F)),-((0.1272F)-(0.1272F)));
        animator.rotate(rightArm3, -((0.6236F)-(0.2294F)), -((-0.2241F)-(-0.3165F)),-((-0.3982F)-(-0.1985F)));
        animator.rotate(rightLeg, -((0.1091F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg2, -((0.7243F)-(0.7243F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg3, -((-0.7854F)-(-0.7854F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg4, -((0.1047F)-(0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.096F)-(-0.1571F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail2, -((-0.0175F)-(-0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail3, -((0.0087F)-(0.0087F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail4, -((-0.0175F)-(-0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail5, -((-0.1047F)-(-0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));

      


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
