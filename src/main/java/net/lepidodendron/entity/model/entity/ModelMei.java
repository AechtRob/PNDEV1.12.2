package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMei;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMei extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftSickleClaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightSickleClaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftFinger;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer rightFinger;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer Crest;
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
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private ModelAnimator animator;

    public ModelMei() {
        this.textureWidth = 91;
        this.textureHeight = 91;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 6.548F, 2.9488F);
        this.setRotateAngle(hips, -0.0436F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.1F, -3.3F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1484F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 76, 56, -2.0F, -1.2F, 0.0F, 3, 2, 2, 0.009F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.1F, -3.3F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 44, -2.5F, -1.2F, 0.0F, 4, 2, 4, 0.009F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.1F, -3.3F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 36, -2.5F, -1.2F, 0.0F, 4, 7, 5, 0.003F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.3F, 0.5208F, -1.1168F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.4102F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.2052F, -0.5638F);
        this.leftLeg1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1571F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 21, -2.0F, -3.0F, -1.0F, 3, 7, 4, 0.003F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.1759F, -0.641F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8988F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 69, 21, -1.4F, -0.0708F, -0.221F, 2, 9, 2, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.1208F, 1.529F);
        this.leftLeg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3316F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 73, 74, -1.4F, 1.1081F, -2.5804F, 1, 7, 3, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.1208F, 1.529F);
        this.leftLeg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 74, -1.4F, 0.1081F, -1.3803F, 1, 8, 2, 0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.4F, 8.8493F, 1.3633F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7418F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 52, 79, -1.0F, -0.2067F, -0.6088F, 2, 4, 1, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(-0.3F, 3.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3054F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 79, 67, -0.5F, -0.5F, -1.5F, 2, 1, 2, 0.0F, false));

        this.leftSickleClaw = new AdvancedModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-0.7661F, -0.2224F, -0.1926F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -0.2755F, 0.1626F, 0.0245F);
        this.leftSickleClaw.cubeList.add(new ModelBox(leftSickleClaw, 23, 85, -0.5244F, -0.5637F, -1.4269F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.0244F, -0.0637F, -2.4269F);
        this.leftSickleClaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7418F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 76, 0.0F, -1.5F, -1.2F, 0, 2, 2, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 0, 81, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.3F, 0.5208F, -1.1168F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.4102F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.2052F, -0.5638F);
        this.rightLeg1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1571F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 21, -1.0F, -3.0F, -1.0F, 3, 7, 4, 0.003F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.1759F, -0.641F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8988F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 69, 21, -0.6F, -0.0708F, -0.221F, 2, 9, 2, 0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.1208F, 1.529F);
        this.rightLeg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3316F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 73, 74, 0.4F, 1.1081F, -2.5804F, 1, 7, 3, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.1208F, 1.529F);
        this.rightLeg2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 64, 74, 0.4F, 0.1081F, -1.3803F, 1, 8, 2, 0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.4F, 8.8493F, 1.3633F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7418F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 52, 79, -1.0F, -0.2067F, -0.6088F, 2, 4, 1, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.3F, 3.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3054F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 79, 67, -1.5F, -0.5F, -1.5F, 2, 1, 2, 0.0F, true));

        this.rightSickleClaw = new AdvancedModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(0.7661F, -0.2224F, -0.1926F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.2755F, -0.1626F, -0.0245F);
        this.rightSickleClaw.cubeList.add(new ModelBox(rightSickleClaw, 23, 85, -0.4756F, -0.5637F, -1.4269F, 1, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0244F, -0.0637F, -2.4269F);
        this.rightSickleClaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7418F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 76, 0.0F, -1.5F, -1.2F, 0, 2, 2, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 0, 81, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.01F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, -3.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0524F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -1.1F, -3.9F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 76, 51, -2.5F, -0.0019F, 0.0122F, 4, 2, 2, 0.009F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -1.1F, -3.9F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 60, -3.0F, -0.0019F, 0.0122F, 5, 2, 4, 0.009F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 5.6F, -4.6F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4014F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 61, -3.0F, -1.7384F, 0.008F, 5, 2, 4, 0.009F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -1.1F, -3.9F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 49, -3.0F, -0.0019F, 0.0122F, 5, 7, 4, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.1F, -3.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.1047F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 4.1F, -5.6F);
        this.chest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.5585F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 58, -3.0F, -2.0758F, -0.1766F, 4, 2, 5, 0.009F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 4.1F, -5.6F);
        this.chest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.9774F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 73, 0, -2.5F, -3.0758F, -0.1766F, 3, 3, 3, -0.009F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 4.1F, -5.1F);
        this.chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 39, -3.0F, -3.9048F, -0.6465F, 4, 4, 6, -0.009F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 0.3F, -6.0F);
        this.chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5934F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 75, -2.5F, 0.0003F, -0.0244F, 3, 2, 3, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 0.3F, -6.0F);
        this.chest.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3665F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 49, -3.0F, 0.0003F, -0.0244F, 4, 2, 6, 0.009F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, -0.9F, -0.2F);
        this.chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2269F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 35, 0, -3.0F, -0.1352F, -5.9456F, 4, 4, 6, 0.003F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(2.242F, 3.5676F, -4.182F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 1.3349F, 0.3187F, -0.1359F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.1802F, 2.2542F, -0.5728F);
        this.leftArm1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3314F, 0.0296F, 0.0466F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 49, 85, -0.5427F, -1.3022F, -0.1607F, 1, 2, 1, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5059F, -0.7647F, -0.6475F);
        this.leftArm1.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1047F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 21, 39, 0.8F, 0.2F, 0.3F, 0, 5, 3, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 82, 77, 0.0F, 0.2F, 0.3F, 1, 4, 1, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 59, 79, 0.0F, 0.2F, 0.0F, 1, 4, 1, -0.004F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.2318F, 3.1848F, 0.4138F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.1821F, 0.0387F, -0.0202F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0875F, 1.275F, -0.7506F);
        this.leftArm2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4102F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 37, 85, -0.5F, -0.6202F, 0.019F, 1, 2, 1, -0.016F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0875F, 3.175F, -0.9506F);
        this.leftArm2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1309F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 53, 68, 0.4F, -4.5F, 0.5F, 0, 5, 5, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 82, 71, -0.5F, -3.5F, 0.5F, 1, 4, 1, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.4609F, 3.8506F, -0.1999F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.7941F, -0.0576F, 0.0111F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 42, 82, -1.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 73, 7, 0.0F, -0.25F, -0.1F, 0, 6, 4, 0.0F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 78, 40, -1.0F, 1.7F, -0.5F, 1, 3, 2, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 5.7F, 0.0F);
        this.leftHand.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.5236F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 68, -0.0212F, 0.05F, -0.1F, 0, 3, 3, 0.0F, false));

        this.leftFinger = new AdvancedModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.3568F, -0.2795F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.3927F, 0.0F, 0.0F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 85, 37, -1.0F, 0.0F, -0.5F, 1, 2, 1, -0.02F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.242F, 3.5676F, -4.182F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 1.3349F, -0.3187F, 0.1359F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.1802F, 2.2542F, -0.5728F);
        this.rightArm1.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3314F, -0.0296F, -0.0466F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 49, 85, -0.4573F, -1.3022F, -0.1607F, 1, 2, 1, -0.01F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5059F, -0.7647F, -0.6475F);
        this.rightArm1.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1047F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 21, 39, -0.8F, 0.2F, 0.3F, 0, 5, 3, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 82, 77, -1.0F, 0.2F, 0.3F, 1, 4, 1, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 59, 79, -1.0F, 0.2F, 0.0F, 1, 4, 1, -0.004F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.2318F, 3.1848F, 0.4138F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -2.1821F, -0.0387F, 0.0202F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.0875F, 1.275F, -0.7506F);
        this.rightArm2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4102F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 37, 85, -0.5F, -0.6202F, 0.019F, 1, 2, 1, -0.016F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.0875F, 3.175F, -0.9506F);
        this.rightArm2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1309F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 53, 68, -0.4F, -4.5F, 0.5F, 0, 5, 5, 0.0F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 82, 71, -0.5F, -3.5F, 0.5F, 1, 4, 1, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.4609F, 3.8506F, -0.1999F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.7941F, 0.0576F, -0.0111F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 42, 82, 0.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 73, 7, 0.0F, -0.25F, -0.1F, 0, 6, 4, 0.0F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 78, 40, 0.0F, 1.7F, -0.5F, 1, 3, 2, -0.01F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 5.7F, 0.0F);
        this.rightHand.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.5236F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 30, 68, 0.0212F, 0.05F, -0.1F, 0, 3, 3, 0.0F, true));

        this.rightFinger = new AdvancedModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.3568F, -0.2795F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.3927F, 0.0F, 0.0F);
        this.rightFinger.cubeList.add(new ModelBox(rightFinger, 85, 37, 0.0F, 0.0F, -0.5F, 1, 2, 1, -0.02F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.7F, -5.5F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0349F, 0.0F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.8101F, -2.4789F);
        this.neck3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.096F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 75, -1.5F, -0.043F, -0.0253F, 3, 2, 3, 0.007F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.1899F, -2.4789F);
        this.neck3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.7156F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 61, 51, -1.5F, -2.1061F, -0.1191F, 3, 2, 4, 0.016F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -1.2101F, -2.4789F);
        this.neck3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2094F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 67, -2.0F, -0.6264F, -0.3518F, 3, 3, 4, 0.003F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6962F, -1.9799F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.1396F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -4.5928F, -2.6324F);
        this.neck2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.7418F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 71, 33, -1.5F, -0.0375F, -0.0188F, 2, 2, 4, 0.003F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -4.5928F, -2.6324F);
        this.neck2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.5847F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 78, 23, -1.5F, -0.0375F, -0.0188F, 2, 2, 2, -0.009F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, -0.7929F, -3.7324F);
        this.neck2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.7767F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 15, 68, -1.0F, -0.9034F, -2.2513F, 1, 1, 6, 0.006F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 0.6072F, -2.2324F);
        this.neck2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.8639F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 50, 44, -1.5F, -0.9389F, 0.2438F, 2, 1, 3, 0.005F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, -4.5928F, -2.6324F);
        this.neck2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.8814F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 56, 0, -1.5F, -0.0375F, -0.0188F, 2, 3, 6, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.2169F, -2.8131F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.2182F, 0.0F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.9858F, -2.343F);
        this.neck.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.5149F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 30, 85, -0.5F, -0.9064F, -0.5317F, 1, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -1.4299F, -2.1858F);
        this.neck.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.4014F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 43, 75, -1.0F, -0.9676F, 0.5085F, 2, 4, 2, 0.007F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3299F, -1.2858F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.4538F, 0.0F, 0.0F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, -0.6728F, -2.5102F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.8896F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 85, 41, 0.0F, 0.0242F, -1.0746F, 1, 2, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, -0.5728F, -2.5102F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.6196F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 85, 64, 0.0F, -0.0571F, 0.3637F, 1, 1, 1, 0.0145F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, -0.5728F, -2.5102F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.5847F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 78, 46, -0.5F, -0.0571F, -0.0363F, 2, 1, 2, 0.0145F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-1.0F, 2.382F, -1.8426F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.4851F, -0.2357F, -0.115F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 71, 40, 0.0F, -0.9653F, -1.9572F, 1, 1, 2, -0.003F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.1167F, 0.4768F, -2.7753F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 1.2345F, -0.0273F, -0.3354F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 16, 83, 0.005F, -0.2702F, -1.914F, 1, 1, 2, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.1167F, 0.4768F, -2.7753F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.7403F, 0.0922F, -0.1238F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 59, 85, 0.0381F, -0.2831F, 0.0022F, 1, 1, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 2.182F, -0.9426F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.4712F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 28, 39, -1.03F, -1.4116F, 0.7609F, 0, 1, 1, 0.0F, true));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 28, 39, 1.03F, -1.4116F, 0.7609F, 0, 1, 1, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 76, 61, -1.0F, -3.0047F, 0.0573F, 2, 3, 2, 0.012F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(1.1167F, 0.4768F, -2.7753F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.7403F, -0.0922F, 0.1238F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 59, 85, -1.0381F, -0.2831F, 0.0022F, 1, 1, 1, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(1.1167F, 0.4768F, -2.7753F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 1.2345F, 0.0273F, 0.3354F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 16, 83, -1.005F, -0.2702F, -1.914F, 1, 1, 2, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 2.482F, -4.0426F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 1.1385F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 64, 85, -1.0F, 0.0328F, -0.0504F, 1, 1, 1, 0.004F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, 0.182F, -3.1426F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 1.2782F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 9, 83, -1.0F, -0.0433F, -2.0153F, 1, 1, 2, -0.004F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 2.2125F, -2.7232F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.4363F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 82, 83, -0.5F, -0.4F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.3F, 3.382F, -3.4426F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.384F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 54, 85, -0.2F, -1.1149F, -0.895F, 1, 1, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(1.0F, 2.382F, -1.8426F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.4851F, 0.2357F, 0.115F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 71, 40, -1.0F, -0.9653F, -1.9572F, 1, 1, 2, -0.003F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 2.182F, -0.9426F);
        this.head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.2618F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 84, 33, -1.0F, -2.0047F, -1.0427F, 2, 2, 1, 0.0F, false));

        this.Crest = new AdvancedModelRenderer(this);
        this.Crest.setRotationPoint(0.0F, -1.7F, -0.9F);
        this.head.addChild(Crest);
        this.setRotateAngle(Crest, 0.2618F, 0.0F, 0.0F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Crest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.1047F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 13, 76, -1.0F, -0.0107F, 0.0456F, 2, 3, 3, 0.005F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Crest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.192F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 78, 18, -1.0F, -0.0107F, 0.0456F, 2, 2, 2, 0.015F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Crest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.2793F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 61, 33, -1.0F, -0.0107F, 0.0456F, 2, 1, 1, 0.02F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.Crest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.2393F, -0.3037F, -0.0329F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 82, 11, 0.0F, -0.0107F, 0.0456F, 1, 2, 2, 0.005F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.Crest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.2393F, 0.3037F, 0.0329F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 82, 11, -1.0F, -0.0107F, 0.0456F, 1, 2, 2, 0.005F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.1F, 1.2733F, 0.7333F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2443F, 0.0F, 0.0F);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5F, 1.1482F, -4.4422F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1396F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 85, 61, -0.1F, -1.0874F, -0.8979F, 1, 1, 1, -0.006F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-1.1F, 0.9482F, -2.7422F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0328F, -0.2789F, 0.015F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 85, 0.0F, -0.9565F, -1.877F, 1, 1, 2, 0.0F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.9F, 0.9482F, -2.7422F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0328F, 0.2789F, -0.015F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 85, -1.0F, -0.9565F, -1.877F, 1, 1, 2, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.9F, 1.0482F, -1.7422F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.0524F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 54, 33, -2.0F, -1.0041F, -0.9809F, 2, 1, 1, -0.004F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.1F, -0.2518F, -0.4422F);
        this.jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.1396F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 78, 28, -1.0F, -1.8F, -1.5F, 2, 2, 2, -0.01F, false));
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 82, 7, -1.0F, 0.1F, -1.5F, 2, 1, 2, -0.007F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.1F, 1.0482F, -1.7422F);
        this.jaw.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.0785F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 69, 85, -0.5F, -1.0064F, -0.0317F, 1, 1, 1, -0.007F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 1.2574F, -2.2135F);
        this.head.addChild(eye);


        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.73F, -0.3137F, 0.1118F);
        this.eye.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.7153F, 0.1996F, 0.1706F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 73, 18, -0.6F, -0.3316F, -0.8241F, 1, 1, 1, 0.0F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.73F, -0.3137F, 0.1118F);
        this.eye.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.7153F, -0.1996F, -0.1706F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 73, 18, -0.4F, -0.3316F, -0.8241F, 1, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 1.5965F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0175F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 54, 11, -1.5F, -0.9807F, -0.8914F, 3, 3, 6, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-1.5F, 0.5193F, 2.1086F);
        this.tail.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, 0.0F, -0.5236F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 64, 68, -2.0F, 0.0F, -2.0F, 2, 0, 5, 0.0F, true));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(1.5F, 0.5193F, 2.1086F);
        this.tail.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, 0.0F, 0.5236F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 64, 68, 0.0F, 0.0F, -2.0F, 2, 0, 5, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 4.0193F, -0.0915F);
        this.tail.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.2443F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 38, 66, -0.5F, -2.4F, -0.5F, 1, 2, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4807F, 5.0085F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1222F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 50, -1.0F, -0.5F, -0.9F, 2, 2, 7, 0.003F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-1.0F, 0.5F, 2.6F);
        this.tail2.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0873F, 0.0F, -0.4363F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 50, 36, -2.8187F, 0.0842F, -3.5074F, 3, 0, 7, 0.0F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(1.0F, 0.5F, 2.6F);
        this.tail2.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0873F, 0.0F, 0.4363F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 50, 36, -0.1813F, 0.0842F, -3.5074F, 3, 0, 7, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0F, 2.5F, -0.9F);
        this.tail2.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.1047F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 59, 58, -0.5F, -1.9F, 0.0F, 1, 2, 7, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2094F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 24, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(-0.5F, 0.2F, 5.0F);
        this.tail3.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, 0.0F, -0.4363F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 0, 11, -3.7281F, -0.0732F, -5.0F, 4, 0, 12, 0.0F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.5F, 0.2F, 5.0F);
        this.tail3.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, 0.0F, 0.4363F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 11, -0.2719F, -0.0732F, -5.0F, 4, 0, 12, 0.0F, false));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.tail3.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0664F, 0.0106F, 0.0191F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 33, 11, 0.0F, -1.0F, -5.0F, 0, 1, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0532F, 9.9869F);
        this.tail3.addChild(tail4);


        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, -0.0532F, 0.0131F);
        this.tail4.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.4606F, 0.3152F, -0.1526F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 0, 24, -0.0301F, -0.0073F, 0.171F, 1, 0, 14, 0.0F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, -0.0532F, 0.0131F);
        this.tail4.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.4606F, -0.3152F, 0.1526F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 0, 24, -0.9698F, -0.0073F, 0.171F, 1, 0, 14, 0.0F, true));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(0.0F, -0.0532F, 0.0131F);
        this.tail4.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.4363F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 0, 0, -3.5F, 0.0F, 0.0F, 7, 0, 10, 0.0F, false));

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

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.650F;
        this.hips.offsetX = 0.1F;
        this.hips.rotateAngleY = (float)Math.toRadians(225);
        this.hips.rotateAngleX = (float)Math.toRadians(-10);
        this.hips.rotateAngleZ = (float)Math.toRadians(3);
        this.hips.scaleChildren = true;
        float scaler = 1.15F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraMei EntityMegalosaurus = (EntityPrehistoricFloraMei) e;
        //this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightHand};

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

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.jaw, 0.1F, 0.05F, true, 3F, -0.05F, f2, 1F);

                    this.walk(this.leftArm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

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
    



    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraMei ee = (EntityPrehistoricFloraMei) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMei entity = (EntityPrehistoricFloraMei) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 14.25 + (((tickAnim - 6) / 3) * (7.75-(14.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 7.75 + (((tickAnim - 9) / 4) * (0-(7.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-0.525-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = -0.525 + (((tickAnim - 9) / 2) * (0-(-0.525)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-20.81823-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (4.31858-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.20537-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -20.81823 + (((tickAnim - 6) / 3) * (20.5-(-20.81823)));
            yy = 4.31858 + (((tickAnim - 6) / 3) * (0-(4.31858)));
            zz = -0.20537 + (((tickAnim - 6) / 3) * (0-(-0.20537)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 20.5 + (((tickAnim - 9) / 2) * (14.5-(20.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 14.5 + (((tickAnim - 11) / 2) * (0-(14.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0.475-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-0.825-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 9) / 2) * (0-(0.475)));
            zz = -0.825 + (((tickAnim - 9) / 2) * (0-(-0.825)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 13 + (((tickAnim - 6) / 3) * (-30.75-(13)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -30.75 + (((tickAnim - 9) / 2) * (-19.5-(-30.75)));
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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.175-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.325 + (((tickAnim - 9) / 4) * (0-(0.325)));
            zz = 0.175 + (((tickAnim - 9) / 4) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (9.25-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 9.25 + (((tickAnim - 11) / 2) * (0-(9.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 14 + (((tickAnim - 7) / 2) * (38-(14)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 38 + (((tickAnim - 9) / 2) * (0-(38)));
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
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMei entity = (EntityPrehistoricFloraMei) entitylivingbaseIn;int animCycle = 20;
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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 10) / 10) * (0-(13.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 30.25 + (((tickAnim - 10) / 10) * (0-(30.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 10) / 10) * (0-(35)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.75 + (((tickAnim - 10) / 10) * (0-(1.75)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (11.88-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 11.88 + (((tickAnim - 5) / 5) * (-15.75-(11.88)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.75 + (((tickAnim - 10) / 5) * (9.88-(-15.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 9.88 + (((tickAnim - 15) / 5) * (0-(9.88)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (36.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 36.5 + (((tickAnim - 8) / 2) * (0-(36.5)));
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
        EntityPrehistoricFloraMei entity = (EntityPrehistoricFloraMei) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -16 + (((tickAnim - 15) / 15) * (37.75-(-16)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 37.75 + (((tickAnim - 30) / 10) * (-16-(37.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 40) / 10) * (0-(-16)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -3.25 + (((tickAnim - 15) / 15) * (30.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 30.25 + (((tickAnim - 30) / 10) * (-3.25-(30.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 40) / 10) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-48-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -48 + (((tickAnim - 8) / 7) * (18.5-(-48)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 18.5 + (((tickAnim - 15) / 15) * (-7.25-(18.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -7.25 + (((tickAnim - 30) / 5) * (-44.12-(-7.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -44.12 + (((tickAnim - 35) / 3) * (-44.12-(-44.12)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -44.12 + (((tickAnim - 38) / 2) * (18.5-(-44.12)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 18.5 + (((tickAnim - 40) / 10) * (0-(18.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.15 + (((tickAnim - 15) / 20) * (0.25-(-0.15)));
            zz = -0.25 + (((tickAnim - 15) / 20) * (0.05-(-0.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 35) / 3) * (0.25-(0.25)));
            zz = 0.05 + (((tickAnim - 35) / 3) * (0.05-(0.05)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 38) / 2) * (-0.15-(0.25)));
            zz = 0.05 + (((tickAnim - 38) / 2) * (-0.25-(0.05)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.15 + (((tickAnim - 40) / 10) * (0-(-0.15)));
            zz = -0.25 + (((tickAnim - 40) / 10) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (74.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 74.75 + (((tickAnim - 8) / 7) * (0-(74.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (47.88-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 47.88 + (((tickAnim - 21) / 9) * (47.25-(47.88)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 47.25 + (((tickAnim - 30) / 5) * (80.88-(47.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 80.88 + (((tickAnim - 35) / 5) * (0-(80.88)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
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
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0.3 + (((tickAnim - 8) / 7) * (0-(0.3)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.7-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 18) / 3) * (0-(0.7)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0.3-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0.3 + (((tickAnim - 35) / 5) * (0-(0.3)));
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
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 25.25 + (((tickAnim - 8) / 7) * (0-(25.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (-40.36-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -40.36 + (((tickAnim - 21) / 9) * (-39.5-(-40.36)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -39.5 + (((tickAnim - 30) / 10) * (0-(-39.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 24.5 + (((tickAnim - 8) / 7) * (0-(24.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (-70.69-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -70.69 + (((tickAnim - 21) / 4) * (0-(-70.69)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (40-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 40 + (((tickAnim - 30) / 10) * (0-(40)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0.2 + (((tickAnim - 8) / 7) * (0-(0.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0.495-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -0.425 + (((tickAnim - 21) / 4) * (0-(-0.425)));
            zz = 0.495 + (((tickAnim - 21) / 4) * (0-(0.495)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0.3-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0.3 + (((tickAnim - 30) / 10) * (0-(0.3)));
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
        EntityPrehistoricFloraMei entity = (EntityPrehistoricFloraMei) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -22.25 + (((tickAnim - 15) / 20) * (-22.25-(-22.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -22.25 + (((tickAnim - 35) / 15) * (0-(-22.25)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-8.875-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -8.875 + (((tickAnim - 15) / 20) * (-8.875-(-8.875)));
            zz = 3.125 + (((tickAnim - 15) / 20) * (3.125-(3.125)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -8.875 + (((tickAnim - 35) / 15) * (0-(-8.875)));
            zz = 3.125 + (((tickAnim - 35) / 15) * (0-(3.125)));
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
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 47.25 + (((tickAnim - 15) / 20) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 47.25 + (((tickAnim - 35) / 15) * (0-(47.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-60-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -60 + (((tickAnim - 15) / 20) * (-60-(-60)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -60 + (((tickAnim - 35) / 15) * (0-(-60)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (71.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 71.5 + (((tickAnim - 15) / 20) * (71.5-(71.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 71.5 + (((tickAnim - 35) / 15) * (0-(71.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.225 + (((tickAnim - 15) / 20) * (0.225-(0.225)));
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
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 47.25 + (((tickAnim - 15) / 20) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 47.25 + (((tickAnim - 35) / 15) * (0-(47.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-60-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -60 + (((tickAnim - 15) / 20) * (-60-(-60)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -60 + (((tickAnim - 35) / 15) * (0-(-60)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (71.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 71.5 + (((tickAnim - 15) / 20) * (71.5-(71.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 71.5 + (((tickAnim - 35) / 15) * (0-(71.5)));
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
            zz = 0 + (((tickAnim - 0) / 15) * (0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.225 + (((tickAnim - 15) / 20) * (0.225-(0.225)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.225 + (((tickAnim - 35) / 15) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24.5 + (((tickAnim - 15) / 20) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24.5 + (((tickAnim - 35) / 15) * (0-(24.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 15) / 20) * (5-(5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 35) / 15) * (0-(5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 34.25 + (((tickAnim - 15) / 20) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 34.25 + (((tickAnim - 35) / 15) * (0-(34.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.475-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.475 + (((tickAnim - 15) / 20) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.475 + (((tickAnim - 35) / 15) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMei entity = (EntityPrehistoricFloraMei) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 7.25 + (((tickAnim - 23) / 17) * (0-(7.25)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 23) / 17) * (0-(7)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -7.25 + (((tickAnim - 23) / 17) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -21.75 + (((tickAnim - 23) / 17) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 13.5 + (((tickAnim - 23) / 17) * (0-(13.5)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -15.25 + (((tickAnim - 23) / 17) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 39.25 + (((tickAnim - 23) / 17) * (0-(39.25)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Crest, Crest.rotateAngleX + (float) Math.toRadians(xx), Crest.rotateAngleY + (float) Math.toRadians(yy), Crest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.3-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = -0.475 + (((tickAnim - 23) / 17) * (0-(-0.475)));
            zz = -0.3 + (((tickAnim - 23) / 17) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Crest.rotationPointX = this.Crest.rotationPointX + (float)(xx);
        this.Crest.rotationPointY = this.Crest.rotationPointY - (float)(yy);
        this.Crest.rotationPointZ = this.Crest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 34 + (((tickAnim - 23) / 9) * (0-(34)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMei entity = (EntityPrehistoricFloraMei) entitylivingbaseIn;
        int animCycle = 390;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -22.25 + (((tickAnim - 30) / 40) * (1-(-22.25)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 1 + (((tickAnim - 70) / 223) * (1-(1)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 1 + (((tickAnim - 293) / 17) * (1-(1)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 1 + (((tickAnim - 310) / 40) * (1-(1)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 1 + (((tickAnim - 350) / 17) * (-12.75-(1)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 17) * (0-(0)));
        }
        else if (tickAnim >= 367 && tickAnim < 379) {
            xx = -12.75 + (((tickAnim - 367) / 12) * (-7.145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-12.75)));
            yy = 0 + (((tickAnim - 367) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 12) * (0-(0)));
        }
        else if (tickAnim >= 379 && tickAnim < 390) {
            xx = -7.145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 379) / 11) * (0-(-7.145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 379) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 379) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-7.125-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (4.325-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            yy = -7.125 + (((tickAnim - 30) / 40) * (-10.345-(-7.125)));
            zz = 4.325 + (((tickAnim - 30) / 40) * (4.33-(4.325)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            yy = -10.345 + (((tickAnim - 70) / 223) * (-10.345-(-10.345)));
            zz = 4.33 + (((tickAnim - 70) / 223) * (4.33-(4.33)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            yy = -10.345 + (((tickAnim - 293) / 17) * (-10.345-(-10.345)));
            zz = 4.33 + (((tickAnim - 293) / 17) * (4.33-(4.33)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            yy = -10.345 + (((tickAnim - 310) / 40) * (-10.345-(-10.345)));
            zz = 4.33 + (((tickAnim - 310) / 40) * (4.33-(4.33)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            yy = -10.345 + (((tickAnim - 350) / 17) * (-8.665-(-10.345)));
            zz = 4.33 + (((tickAnim - 350) / 17) * (4.33-(4.33)));
        }
        else if (tickAnim >= 367 && tickAnim < 379) {
            xx = 0 + (((tickAnim - 367) / 12) * (0-(0)));
            yy = -8.665 + (((tickAnim - 367) / 12) * (-4.02-(-8.665)));
            zz = 4.33 + (((tickAnim - 367) / 12) * (0.835-(4.33)));
        }
        else if (tickAnim >= 379 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 379) / 11) * (0-(0)));
            yy = -4.02 + (((tickAnim - 379) / 11) * (0-(-4.02)));
            zz = 0.835 + (((tickAnim - 379) / 11) * (0-(0.835)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -26.75 + (((tickAnim - 30) / 40) * (-59.5-(-26.75)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -59.5 + (((tickAnim - 70) / 223) * (-59.5-(-59.5)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -59.5 + (((tickAnim - 293) / 17) * (-59.5-(-59.5)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = -59.5 + (((tickAnim - 310) / 40) * (-59.5-(-59.5)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = -59.5 + (((tickAnim - 350) / 17) * (-29-(-59.5)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 17) * (0-(0)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = -29 + (((tickAnim - 367) / 23) * (0-(-29)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (47-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 47 + (((tickAnim - 30) / 40) * (75-(47)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 75 + (((tickAnim - 70) / 223) * (75-(75)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 75 + (((tickAnim - 293) / 17) * (75-(75)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 75 + (((tickAnim - 310) / 40) * (75-(75)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 75 + (((tickAnim - 350) / 17) * (55.5-(75)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 17) * (0-(0)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 55.5 + (((tickAnim - 367) / 23) * (0-(55.5)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0.525-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0.525 + (((tickAnim - 70) / 223) * (0.525-(0.525)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0.525 + (((tickAnim - 293) / 17) * (0.525-(0.525)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0.525 + (((tickAnim - 310) / 40) * (0.525-(0.525)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0.525 + (((tickAnim - 350) / 17) * (0-(0.525)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-46.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -46.25 + (((tickAnim - 30) / 40) * (-87.75-(-46.25)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -87.75 + (((tickAnim - 70) / 223) * (-87.75-(-87.75)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -87.75 + (((tickAnim - 293) / 17) * (-87.75-(-87.75)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = -87.75 + (((tickAnim - 310) / 40) * (-87.75-(-87.75)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = -87.75 + (((tickAnim - 350) / 17) * (-87.75-(-87.75)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 17) * (0-(0)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = -87.75 + (((tickAnim - 367) / 23) * (0-(-87.75)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            yy = -0.075 + (((tickAnim - 70) / 223) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            yy = -0.075 + (((tickAnim - 293) / 17) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            yy = -0.075 + (((tickAnim - 310) / 40) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            yy = -0.075 + (((tickAnim - 350) / 17) * (-0.5-(-0.075)));
            zz = 0 + (((tickAnim - 350) / 17) * (-0.225-(0)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            yy = -0.5 + (((tickAnim - 367) / 23) * (0-(-0.5)));
            zz = -0.225 + (((tickAnim - 367) / 23) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 46.5 + (((tickAnim - 30) / 40) * (67.75-(46.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 67.75 + (((tickAnim - 70) / 223) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 67.75 + (((tickAnim - 293) / 17) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 67.75 + (((tickAnim - 310) / 40) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 67.75 + (((tickAnim - 350) / 17) * (76.75-(67.75)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 17) * (0-(0)));
        }
        else if (tickAnim >= 367 && tickAnim < 379) {
            xx = 76.75 + (((tickAnim - 367) / 12) * (24.38-(76.75)));
            yy = 0 + (((tickAnim - 367) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 12) * (0-(0)));
        }
        else if (tickAnim >= 379 && tickAnim < 390) {
            xx = 24.38 + (((tickAnim - 379) / 11) * (0-(24.38)));
            yy = 0 + (((tickAnim - 379) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 379) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.025-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0.025 + (((tickAnim - 30) / 40) * (0.4-(0.025)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0.4 + (((tickAnim - 70) / 223) * (0.4-(0.4)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0.4 + (((tickAnim - 293) / 17) * (0.4-(0.4)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0.4 + (((tickAnim - 310) / 40) * (0.4-(0.4)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0.4 + (((tickAnim - 350) / 17) * (0-(0.4)));
        }
        else if (tickAnim >= 367 && tickAnim < 379) {
            xx = 0 + (((tickAnim - 367) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 367) / 12) * (0.675-(0)));
            zz = 0 + (((tickAnim - 367) / 12) * (-0.215-(0)));
        }
        else if (tickAnim >= 379 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 379) / 11) * (0-(0)));
            yy = 0.675 + (((tickAnim - 379) / 11) * (0-(0.675)));
            zz = -0.215 + (((tickAnim - 379) / 11) * (0-(-0.215)));
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



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -26.75 + (((tickAnim - 30) / 40) * (-62-(-26.75)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -62 + (((tickAnim - 70) / 223) * (-62-(-62)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -62 + (((tickAnim - 293) / 17) * (-62-(-62)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = -62 + (((tickAnim - 310) / 40) * (-62-(-62)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = -62 + (((tickAnim - 350) / 17) * (-29-(-62)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 17) * (0-(0)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = -29 + (((tickAnim - 367) / 23) * (0-(-29)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (47-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 47 + (((tickAnim - 30) / 40) * (77.75-(47)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 77.75 + (((tickAnim - 70) / 223) * (77.75-(77.75)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 77.75 + (((tickAnim - 293) / 17) * (77.75-(77.75)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 77.75 + (((tickAnim - 310) / 40) * (77.75-(77.75)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 77.75 + (((tickAnim - 350) / 17) * (55.5-(77.75)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 17) * (0-(0)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 55.5 + (((tickAnim - 367) / 23) * (0-(55.5)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0.45-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0.45 + (((tickAnim - 70) / 223) * (0.45-(0.45)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0.45 + (((tickAnim - 293) / 17) * (0.45-(0.45)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0.45 + (((tickAnim - 310) / 40) * (0.45-(0.45)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0.45 + (((tickAnim - 350) / 17) * (0-(0.45)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-46.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -46.25 + (((tickAnim - 30) / 40) * (-91.75-(-46.25)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -91.75 + (((tickAnim - 70) / 223) * (-91.75-(-91.75)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -91.75 + (((tickAnim - 293) / 17) * (-91.75-(-91.75)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = -91.75 + (((tickAnim - 310) / 40) * (-91.75-(-91.75)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = -91.75 + (((tickAnim - 350) / 17) * (-86-(-91.75)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 17) * (0-(0)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = -86 + (((tickAnim - 367) / 23) * (0-(-86)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (-0.5-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            yy = -0.4 + (((tickAnim - 70) / 223) * (-0.4-(-0.4)));
            zz = -0.5 + (((tickAnim - 70) / 223) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            yy = -0.4 + (((tickAnim - 293) / 17) * (-0.4-(-0.4)));
            zz = -0.5 + (((tickAnim - 293) / 17) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            yy = -0.4 + (((tickAnim - 310) / 40) * (-0.4-(-0.4)));
            zz = -0.5 + (((tickAnim - 310) / 40) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            yy = -0.4 + (((tickAnim - 350) / 17) * (-0.5-(-0.4)));
            zz = -0.5 + (((tickAnim - 350) / 17) * (-0.225-(-0.5)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            yy = -0.5 + (((tickAnim - 367) / 23) * (0-(-0.5)));
            zz = -0.225 + (((tickAnim - 367) / 23) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 46.5 + (((tickAnim - 30) / 40) * (75.25-(46.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 75.25 + (((tickAnim - 70) / 223) * (75.25-(75.25)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 75.25 + (((tickAnim - 293) / 17) * (75.25-(75.25)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 75.25 + (((tickAnim - 310) / 40) * (75.25-(75.25)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 390) {
            xx = 75.25 + (((tickAnim - 350) / 40) * (0-(75.25)));
            yy = 0 + (((tickAnim - 350) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0.025 + (((tickAnim - 30) / 40) * (0.13-(0.025)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0.13 + (((tickAnim - 70) / 223) * (0.13-(0.13)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0.13 + (((tickAnim - 293) / 17) * (0.13-(0.13)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0.13 + (((tickAnim - 310) / 40) * (0.13-(0.13)));
        }
        else if (tickAnim >= 350 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 350) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 350) / 40) * (0-(0)));
            zz = 0.13 + (((tickAnim - 350) / 40) * (0-(0.13)));
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



        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 4 + (((tickAnim - 70) / 223) * (4-(4)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 4 + (((tickAnim - 293) / 17) * (4-(4)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 4 + (((tickAnim - 310) / 40) * (4-(4)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 390) {
            xx = 4 + (((tickAnim - 350) / 40) * (0-(4)));
            yy = 0 + (((tickAnim - 350) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 15.5 + (((tickAnim - 70) / 223) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 15.5 + (((tickAnim - 293) / 17) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 15.5 + (((tickAnim - 310) / 40) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 390) {
            xx = 15.5 + (((tickAnim - 350) / 40) * (0-(15.5)));
            yy = 0 + (((tickAnim - 350) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 350 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 350) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 350) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 24.75 + (((tickAnim - 30) / 40) * (13.01792-(24.75)));
            yy = 0 + (((tickAnim - 30) / 40) * (11.16429-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (-24.0674-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 13.01792 + (((tickAnim - 70) / 223) * (13.01792-(13.01792)));
            yy = 11.16429 + (((tickAnim - 70) / 223) * (11.16429-(11.16429)));
            zz = -24.0674 + (((tickAnim - 70) / 223) * (-24.0674-(-24.0674)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 13.01792 + (((tickAnim - 293) / 17) * (13.01792-(13.01792)));
            yy = 11.16429 + (((tickAnim - 293) / 17) * (11.16429-(11.16429)));
            zz = -24.0674 + (((tickAnim - 293) / 17) * (-24.0674-(-24.0674)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 13.01792 + (((tickAnim - 310) / 40) * (13.01792-(13.01792)));
            yy = 11.16429 + (((tickAnim - 310) / 40) * (11.16429-(11.16429)));
            zz = -24.0674 + (((tickAnim - 310) / 40) * (-24.0674-(-24.0674)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 13.01792 + (((tickAnim - 350) / 17) * (14.75-(13.01792)));
            yy = 11.16429 + (((tickAnim - 350) / 17) * (0-(11.16429)));
            zz = -24.0674 + (((tickAnim - 350) / 17) * (0-(-24.0674)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 14.75 + (((tickAnim - 367) / 23) * (0-(14.75)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -15.75 + (((tickAnim - 30) / 40) * (-19.06443-(-15.75)));
            yy = 0 + (((tickAnim - 30) / 40) * (-24.74058-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (2.8892-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -19.06443 + (((tickAnim - 70) / 223) * (-19.06443-(-19.06443)));
            yy = -24.74058 + (((tickAnim - 70) / 223) * (-24.74058-(-24.74058)));
            zz = 2.8892 + (((tickAnim - 70) / 223) * (2.8892-(2.8892)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -19.06443 + (((tickAnim - 293) / 17) * (-19.06443-(-19.06443)));
            yy = -24.74058 + (((tickAnim - 293) / 17) * (-24.74058-(-24.74058)));
            zz = 2.8892 + (((tickAnim - 293) / 17) * (2.8892-(2.8892)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = -19.06443 + (((tickAnim - 310) / 40) * (-19.06443-(-19.06443)));
            yy = -24.74058 + (((tickAnim - 310) / 40) * (-24.74058-(-24.74058)));
            zz = 2.8892 + (((tickAnim - 310) / 40) * (2.8892-(2.8892)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = -19.06443 + (((tickAnim - 350) / 17) * (-32.56443-(-19.06443)));
            yy = -24.74058 + (((tickAnim - 350) / 17) * (-24.74058-(-24.74058)));
            zz = 2.8892 + (((tickAnim - 350) / 17) * (2.8892-(2.8892)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = -32.56443 + (((tickAnim - 367) / 23) * (0-(-32.56443)));
            yy = -24.74058 + (((tickAnim - 367) / 23) * (0-(-24.74058)));
            zz = 2.8892 + (((tickAnim - 367) / 23) * (0-(2.8892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 28.75 + (((tickAnim - 70) / 223) * (28.75-(28.75)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 28.75 + (((tickAnim - 293) / 17) * (28.75-(28.75)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 28.75 + (((tickAnim - 310) / 40) * (28.75-(28.75)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 40) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 390) {
            xx = 28.75 + (((tickAnim - 350) / 40) * (0-(28.75)));
            yy = 0 + (((tickAnim - 350) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 24.75 + (((tickAnim - 30) / 40) * (-0.49993-(24.75)));
            yy = 0 + (((tickAnim - 30) / 40) * (-6.47455-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (-19.68807-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -0.49993 + (((tickAnim - 70) / 223) * (-0.49993-(-0.49993)));
            yy = -6.47455 + (((tickAnim - 70) / 223) * (-6.47455-(-6.47455)));
            zz = -19.68807 + (((tickAnim - 70) / 223) * (-19.68807-(-19.68807)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -0.49993 + (((tickAnim - 293) / 17) * (-0.49993-(-0.49993)));
            yy = -6.47455 + (((tickAnim - 293) / 17) * (-6.47455-(-6.47455)));
            zz = -19.68807 + (((tickAnim - 293) / 17) * (-19.68807-(-19.68807)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = -0.49993 + (((tickAnim - 310) / 40) * (-0.49993-(-0.49993)));
            yy = -6.47455 + (((tickAnim - 310) / 40) * (-6.47455-(-6.47455)));
            zz = -19.68807 + (((tickAnim - 310) / 40) * (-19.68807-(-19.68807)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = -0.49993 + (((tickAnim - 350) / 17) * (20-(-0.49993)));
            yy = -6.47455 + (((tickAnim - 350) / 17) * (0-(-6.47455)));
            zz = -19.68807 + (((tickAnim - 350) / 17) * (0-(-19.68807)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 20 + (((tickAnim - 367) / 23) * (0-(20)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -15.75 + (((tickAnim - 30) / 40) * (-0.52764-(-15.75)));
            yy = 0 + (((tickAnim - 30) / 40) * (-36.82321-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (-39.58437-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -0.52764 + (((tickAnim - 70) / 223) * (-0.52764-(-0.52764)));
            yy = -36.82321 + (((tickAnim - 70) / 223) * (-36.82321-(-36.82321)));
            zz = -39.58437 + (((tickAnim - 70) / 223) * (-39.58437-(-39.58437)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -0.52764 + (((tickAnim - 293) / 17) * (-0.52764-(-0.52764)));
            yy = -36.82321 + (((tickAnim - 293) / 17) * (-36.82321-(-36.82321)));
            zz = -39.58437 + (((tickAnim - 293) / 17) * (-39.58437-(-39.58437)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = -0.52764 + (((tickAnim - 310) / 40) * (-0.52764-(-0.52764)));
            yy = -36.82321 + (((tickAnim - 310) / 40) * (-36.82321-(-36.82321)));
            zz = -39.58437 + (((tickAnim - 310) / 40) * (-39.58437-(-39.58437)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = -0.52764 + (((tickAnim - 350) / 17) * (-23.25-(-0.52764)));
            yy = -36.82321 + (((tickAnim - 350) / 17) * (0-(-36.82321)));
            zz = -39.58437 + (((tickAnim - 350) / 17) * (0-(-39.58437)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = -23.25 + (((tickAnim - 367) / 23) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 367) {
            xx = 0 + (((tickAnim - 0) / 367) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 367) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 367) * (0-(0)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 36.75 + (((tickAnim - 367) / 23) * (0-(36.75)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (9.959+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (-14.02321-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (-5.49191-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 9.959+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15 + (((tickAnim - 48) / 22) * (19.92685-(9.959+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15)));
            yy = -14.02321 + (((tickAnim - 48) / 22) * (-20.30948-(-14.02321)));
            zz = -5.49191 + (((tickAnim - 48) / 22) * (-7.9538-(-5.49191)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 19.92685 + (((tickAnim - 70) / 223) * (19.92685-(19.92685)));
            yy = -20.30948 + (((tickAnim - 70) / 223) * (-20.30948-(-20.30948)));
            zz = -7.9538 + (((tickAnim - 70) / 223) * (-7.9538-(-7.9538)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 19.92685 + (((tickAnim - 293) / 17) * (13.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(19.92685)));
            yy = -20.30948 + (((tickAnim - 293) / 17) * (0-(-20.30948)));
            zz = -7.9538 + (((tickAnim - 293) / 17) * (0-(-7.9538)));
        }
        else if (tickAnim >= 310 && tickAnim < 320) {
            xx = 13.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 310) / 10) * (13.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(13.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 310) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 10) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 339) {
            xx = 13.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 320) / 19) * (-10.9439846926+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(13.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 320) / 19) * (8.66683-(0)));
            zz = 0 + (((tickAnim - 320) / 19) * (-6.31862-(0)));
        }
        else if (tickAnim >= 339 && tickAnim < 350) {
            xx = -10.9439846926+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 339) / 11) * (-17.19398-(-10.9439846926+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 8.66683 + (((tickAnim - 339) / 11) * (8.66683-(8.66683)));
            zz = -6.31862 + (((tickAnim - 339) / 11) * (-6.31862-(-6.31862)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = -17.19398 + (((tickAnim - 350) / 17) * (0-(-17.19398)));
            yy = 8.66683 + (((tickAnim - 350) / 17) * (0-(8.66683)));
            zz = -6.31862 + (((tickAnim - 350) / 17) * (0-(-6.31862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 48) {
            xx = 26.25 + (((tickAnim - 30) / 18) * (50.96808-(26.25)));
            yy = 0 + (((tickAnim - 30) / 18) * (-11.96028-(0)));
            zz = 0 + (((tickAnim - 30) / 18) * (8.3355-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 50.96808 + (((tickAnim - 48) / 22) * (35.45308-(50.96808)));
            yy = -11.96028 + (((tickAnim - 48) / 22) * (-26.09515-(-11.96028)));
            zz = 8.3355 + (((tickAnim - 48) / 22) * (18.18655-(8.3355)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 35.45308 + (((tickAnim - 70) / 223) * (35.45308-(35.45308)));
            yy = -26.09515 + (((tickAnim - 70) / 223) * (-26.09515-(-26.09515)));
            zz = 18.18655 + (((tickAnim - 70) / 223) * (18.18655-(18.18655)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 35.45308 + (((tickAnim - 293) / 17) * (0-(35.45308)));
            yy = -26.09515 + (((tickAnim - 293) / 17) * (0-(-26.09515)));
            zz = 18.18655 + (((tickAnim - 293) / 17) * (0-(18.18655)));
        }
        else if (tickAnim >= 310 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 310) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 310) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 10) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 339) {
            xx = 0 + (((tickAnim - 320) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 19) * (13.25-(0)));
            zz = 0 + (((tickAnim - 320) / 19) * (0-(0)));
        }
        else if (tickAnim >= 339 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 339) / 11) * (0-(0)));
            yy = 13.25 + (((tickAnim - 339) / 11) * (13.25-(13.25)));
            zz = 0 + (((tickAnim - 339) / 11) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            yy = 13.25 + (((tickAnim - 350) / 17) * (0-(13.25)));
            zz = 0 + (((tickAnim - 350) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-19.715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-80))*28-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = -19.715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-80))*28 + (((tickAnim - 48) / 22) * (-48.5-(-19.715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-80))*28)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -48.5 + (((tickAnim - 70) / 223) * (-48.5-(-48.5)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 223) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -48.5 + (((tickAnim - 293) / 17) * (-10.25-(-48.5)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 320) {
            xx = -10.25 + (((tickAnim - 310) / 10) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 310) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 10) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 339) {
            xx = -10.25 + (((tickAnim - 320) / 19) * (0.5-(-10.25)));
            yy = 0 + (((tickAnim - 320) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 19) * (0-(0)));
        }
        else if (tickAnim >= 339 && tickAnim < 350) {
            xx = 0.5 + (((tickAnim - 339) / 11) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 339) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 339) / 11) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = 0.5 + (((tickAnim - 350) / 17) * (0-(0.5)));
            yy = 0 + (((tickAnim - 350) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0.4-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = 0.4 + (((tickAnim - 70) / 223) * (0.4-(0.4)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = 0.4 + (((tickAnim - 293) / 17) * (0.4-(0.4)));
        }
        else if (tickAnim >= 310 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 310) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 310) / 10) * (0-(0)));
            zz = 0.4 + (((tickAnim - 310) / 10) * (0.4-(0.4)));
        }
        else if (tickAnim >= 320 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 320) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 70) * (0-(0)));
            zz = 0.4 + (((tickAnim - 320) / 70) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 0) / 310) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 310) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 310) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 310) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 310) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 10) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 339) {
            xx = 0 + (((tickAnim - 320) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 19) * (0-(0)));
        }
        else if (tickAnim >= 339 && tickAnim < 342) {
            xx = 0 + (((tickAnim - 339) / 3) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 339) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 339) / 3) * (0-(0)));
        }
        else if (tickAnim >= 342 && tickAnim < 343) {
            xx = -1.25 + (((tickAnim - 342) / 1) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 342) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 342) / 1) * (0-(0)));
        }
        else if (tickAnim >= 343 && tickAnim < 346) {
            xx = 0 + (((tickAnim - 343) / 3) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 343) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 343) / 3) * (0-(0)));
        }
        else if (tickAnim >= 346 && tickAnim < 348) {
            xx = -1.25 + (((tickAnim - 346) / 2) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 346) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 346) / 2) * (0-(0)));
        }
        else if (tickAnim >= 348 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 348) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 348) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 348) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (6.62-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 6.62 + (((tickAnim - 14) / 16) * (0.25-(6.62)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0.25 + (((tickAnim - 30) / 40) * (-22.07289-(0.25)));
            yy = 0 + (((tickAnim - 30) / 40) * (33.53806-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (-9.871-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -22.07289 + (((tickAnim - 70) / 223) * (-22.07289-(-22.07289)));
            yy = 33.53806 + (((tickAnim - 70) / 223) * (33.53806-(33.53806)));
            zz = -9.871 + (((tickAnim - 70) / 223) * (-9.871-(-9.871)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -22.07289 + (((tickAnim - 293) / 17) * (-22.07289-(-22.07289)));
            yy = 33.53806 + (((tickAnim - 293) / 17) * (33.53806-(33.53806)));
            zz = -9.871 + (((tickAnim - 293) / 17) * (-9.871-(-9.871)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = -22.07289 + (((tickAnim - 310) / 40) * (-22.07289-(-22.07289)));
            yy = 33.53806 + (((tickAnim - 310) / 40) * (33.53806-(33.53806)));
            zz = -9.871 + (((tickAnim - 310) / 40) * (-9.871-(-9.871)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = -22.07289 + (((tickAnim - 350) / 17) * (0-(-22.07289)));
            yy = 33.53806 + (((tickAnim - 350) / 17) * (0-(33.53806)));
            zz = -9.871 + (((tickAnim - 350) / 17) * (0-(-9.871)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (-0.925-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            yy = -0.3 + (((tickAnim - 70) / 223) * (-0.3-(-0.3)));
            zz = -0.925 + (((tickAnim - 70) / 223) * (-0.925-(-0.925)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            yy = -0.3 + (((tickAnim - 293) / 17) * (-0.3-(-0.3)));
            zz = -0.925 + (((tickAnim - 293) / 17) * (-0.925-(-0.925)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            yy = -0.3 + (((tickAnim - 310) / 40) * (-0.3-(-0.3)));
            zz = -0.925 + (((tickAnim - 310) / 40) * (-0.925-(-0.925)));
        }
        else if (tickAnim >= 350 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 350) / 40) * (0-(0)));
            yy = -0.3 + (((tickAnim - 350) / 40) * (0-(-0.3)));
            zz = -0.925 + (((tickAnim - 350) / 40) * (0-(-0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 15.5 + (((tickAnim - 30) / 40) * (-21.85545-(15.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (38.50505-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (-1.56301-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -21.85545 + (((tickAnim - 70) / 223) * (-21.85545-(-21.85545)));
            yy = 38.50505 + (((tickAnim - 70) / 223) * (38.50505-(38.50505)));
            zz = -1.56301 + (((tickAnim - 70) / 223) * (-1.56301-(-1.56301)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -21.85545 + (((tickAnim - 293) / 17) * (-21.85545-(-21.85545)));
            yy = 38.50505 + (((tickAnim - 293) / 17) * (38.50505-(38.50505)));
            zz = -1.56301 + (((tickAnim - 293) / 17) * (-1.56301-(-1.56301)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = -21.85545 + (((tickAnim - 310) / 40) * (-21.85545-(-21.85545)));
            yy = 38.50505 + (((tickAnim - 310) / 40) * (38.50505-(38.50505)));
            zz = -1.56301 + (((tickAnim - 310) / 40) * (-1.56301-(-1.56301)));
        }
        else if (tickAnim >= 350 && tickAnim < 367) {
            xx = -21.85545 + (((tickAnim - 350) / 17) * (0-(-21.85545)));
            yy = 38.50505 + (((tickAnim - 350) / 17) * (24.75-(38.50505)));
            zz = -1.56301 + (((tickAnim - 350) / 17) * (0-(-1.56301)));
        }
        else if (tickAnim >= 367 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 367) / 23) * (0-(0)));
            yy = 24.75 + (((tickAnim - 367) / 23) * (0-(24.75)));
            zz = 0 + (((tickAnim - 367) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (-0.75-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 0.1 + (((tickAnim - 70) / 223) * (0.1-(0.1)));
            yy = -0.225 + (((tickAnim - 70) / 223) * (-0.225-(-0.225)));
            zz = -0.75 + (((tickAnim - 70) / 223) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0.1 + (((tickAnim - 293) / 17) * (0.1-(0.1)));
            yy = -0.225 + (((tickAnim - 293) / 17) * (-0.225-(-0.225)));
            zz = -0.75 + (((tickAnim - 293) / 17) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 0.1 + (((tickAnim - 310) / 40) * (0.1-(0.1)));
            yy = -0.225 + (((tickAnim - 310) / 40) * (-0.225-(-0.225)));
            zz = -0.75 + (((tickAnim - 310) / 40) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 350 && tickAnim < 390) {
            xx = 0.1 + (((tickAnim - 350) / 40) * (0-(0.1)));
            yy = -0.225 + (((tickAnim - 350) / 40) * (0-(-0.225)));
            zz = -0.75 + (((tickAnim - 350) / 40) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 12.75 + (((tickAnim - 30) / 40) * (22.13292-(12.75)));
            yy = 0 + (((tickAnim - 30) / 40) * (37.16727-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (15.34385-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 22.13292 + (((tickAnim - 70) / 223) * (22.13292-(22.13292)));
            yy = 37.16727 + (((tickAnim - 70) / 223) * (37.16727-(37.16727)));
            zz = 15.34385 + (((tickAnim - 70) / 223) * (15.34385-(15.34385)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 22.13292 + (((tickAnim - 293) / 17) * (22.13292-(22.13292)));
            yy = 37.16727 + (((tickAnim - 293) / 17) * (37.16727-(37.16727)));
            zz = 15.34385 + (((tickAnim - 293) / 17) * (15.34385-(15.34385)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 22.13292 + (((tickAnim - 310) / 40) * (22.13292-(22.13292)));
            yy = 37.16727 + (((tickAnim - 310) / 40) * (37.16727-(37.16727)));
            zz = 15.34385 + (((tickAnim - 310) / 40) * (15.34385-(15.34385)));
        }
        else if (tickAnim >= 350 && tickAnim < 390) {
            xx = 22.13292 + (((tickAnim - 350) / 40) * (0-(22.13292)));
            yy = 37.16727 + (((tickAnim - 350) / 40) * (0-(37.16727)));
            zz = 15.34385 + (((tickAnim - 350) / 40) * (0-(15.34385)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (-2.375-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = -0.275 + (((tickAnim - 70) / 223) * (-0.275-(-0.275)));
            yy = 0 + (((tickAnim - 70) / 223) * (0-(0)));
            zz = -2.375 + (((tickAnim - 70) / 223) * (-2.375-(-2.375)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = -0.275 + (((tickAnim - 293) / 17) * (-0.275-(-0.275)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = -2.375 + (((tickAnim - 293) / 17) * (-2.375-(-2.375)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = -0.275 + (((tickAnim - 310) / 40) * (-0.275-(-0.275)));
            yy = 0 + (((tickAnim - 310) / 40) * (0-(0)));
            zz = -2.375 + (((tickAnim - 310) / 40) * (-2.375-(-2.375)));
        }
        else if (tickAnim >= 350 && tickAnim < 390) {
            xx = -0.275 + (((tickAnim - 350) / 40) * (0-(-0.275)));
            yy = 0 + (((tickAnim - 350) / 40) * (0-(0)));
            zz = -2.375 + (((tickAnim - 350) / 40) * (0-(-2.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 17.75 + (((tickAnim - 30) / 40) * (12.63374-(17.75)));
            yy = 0 + (((tickAnim - 30) / 40) * (26.22185-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (17.04183-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 293) {
            xx = 12.63374 + (((tickAnim - 70) / 223) * (12.63374-(12.63374)));
            yy = 26.22185 + (((tickAnim - 70) / 223) * (26.22185-(26.22185)));
            zz = 17.04183 + (((tickAnim - 70) / 223) * (17.04183-(17.04183)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 12.63374 + (((tickAnim - 293) / 17) * (12.63374-(12.63374)));
            yy = 26.22185 + (((tickAnim - 293) / 17) * (26.22185-(26.22185)));
            zz = 17.04183 + (((tickAnim - 293) / 17) * (17.04183-(17.04183)));
        }
        else if (tickAnim >= 310 && tickAnim < 350) {
            xx = 12.63374 + (((tickAnim - 310) / 40) * (12.63374-(12.63374)));
            yy = 26.22185 + (((tickAnim - 310) / 40) * (26.22185-(26.22185)));
            zz = 17.04183 + (((tickAnim - 310) / 40) * (17.04183-(17.04183)));
        }
        else if (tickAnim >= 350 && tickAnim < 390) {
            xx = 12.63374 + (((tickAnim - 350) / 40) * (0-(12.63374)));
            yy = 26.22185 + (((tickAnim - 350) / 40) * (0-(26.22185)));
            zz = 17.04183 + (((tickAnim - 350) / 40) * (0-(17.04183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 70 && tickAnim < 93) {
            xx = 1 + (((tickAnim - 70) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 23) * (0-(1)));
            zz = 1 + (((tickAnim - 70) / 23) * (1-(1)));
        }
        else if (tickAnim >= 93 && tickAnim < 293) {
            xx = 1 + (((tickAnim - 93) / 200) * (1-(1)));
            yy = 0 + (((tickAnim - 93) / 200) * (0-(0)));
            zz = 1 + (((tickAnim - 93) / 200) * (1-(1)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 1 + (((tickAnim - 293) / 17) * (1-(1)));
            yy = 0 + (((tickAnim - 293) / 17) * (1-(0)));
            zz = 1 + (((tickAnim - 293) / 17) * (1-(1)));
        }
        else if (tickAnim >= 310 && tickAnim < 315) {
            xx = 1 + (((tickAnim - 310) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 310) / 5) * (-0.0275-(1)));
            zz = 1 + (((tickAnim - 310) / 5) * (1-(1)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = 1 + (((tickAnim - 315) / 5) * (1-(1)));
            yy = -0.0275 + (((tickAnim - 315) / 5) * (1-(-0.0275)));
            zz = 1 + (((tickAnim - 315) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMei entity = (EntityPrehistoricFloraMei) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660/0.5))*-10), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-50))*5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-50))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660/0.5-50))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660/0.5-150))*1.2);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 32 + (((tickAnim - 0) / 4) * (-36.25-(32)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -36.25 + (((tickAnim - 4) / 1) * (-27.22-(-36.25)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -27.22 + (((tickAnim - 5) / 6) * (32-(-27.22)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 17.5 + (((tickAnim - 0) / 1) * (30.55-(17.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 30.55 + (((tickAnim - 1) / 3) * (-11-(30.55)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -11 + (((tickAnim - 4) / 1) * (5.06-(-11)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 5.06 + (((tickAnim - 5) / 6) * (17.5-(5.06)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (-0.475-(0)));
            zz = 0.275 + (((tickAnim - 4) / 1) * (0.28-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -47.25 + (((tickAnim - 2) / 1) * (-47.25-(-47.25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -47.25 + (((tickAnim - 3) / 1) * (15-(-47.25)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 15 + (((tickAnim - 4) / 1) * (17.38-(15)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 17.38 + (((tickAnim - 5) / 6) * (0-(17.38)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.145-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.06-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.145 + (((tickAnim - 2) / 1) * (0.145-(0.145)));
            zz = -0.06 + (((tickAnim - 2) / 1) * (-0.06-(-0.06)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.145 + (((tickAnim - 3) / 1) * (-0.2-(0.145)));
            zz = -0.06 + (((tickAnim - 3) / 1) * (-0.15-(-0.06)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 4) / 1) * (-0.17-(-0.2)));
            zz = -0.15 + (((tickAnim - 4) / 1) * (-0.305-(-0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -0.17 + (((tickAnim - 5) / 6) * (0-(-0.17)));
            zz = -0.305 + (((tickAnim - 5) / 6) * (0-(-0.305)));
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
            xx = 44.25 + (((tickAnim - 0) / 2) * (88.31-(44.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 88.31 + (((tickAnim - 2) / 1) * (88.31-(88.31)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 88.31 + (((tickAnim - 3) / 1) * (62.5-(88.31)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 62.5 + (((tickAnim - 4) / 1) * (2.72-(62.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.72 + (((tickAnim - 5) / 2) * (-9.68-(2.72)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -9.68 + (((tickAnim - 7) / 1) * (57.64-(-9.68)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 57.64 + (((tickAnim - 8) / 3) * (44.25-(57.64)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.33-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 2) / 1) * (0.5-(0.5)));
            zz = 0.33 + (((tickAnim - 2) / 1) * (0.33-(0.33)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (0-(0.5)));
            zz = 0.33 + (((tickAnim - 3) / 1) * (0.325-(0.33)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (-0.45-(0)));
            zz = 0.325 + (((tickAnim - 4) / 1) * (0.28-(0.325)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.45 + (((tickAnim - 5) / 2) * (0.175-(-0.45)));
            zz = 0.28 + (((tickAnim - 5) / 2) * (0.28-(0.28)));
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
            xx = 49.25 + (((tickAnim - 0) / 4) * (-42.75-(49.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -42.75 + (((tickAnim - 4) / 3) * (0-(-42.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (-58.25-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -58.25 + (((tickAnim - 8) / 3) * (49.25-(-58.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 30.5 + (((tickAnim - 0) / 4) * (0-(30.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (-81.55-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -81.55 + (((tickAnim - 8) / 3) * (30.5-(-81.55)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0.325 + (((tickAnim - 0) / 4) * (0-(0.325)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.255-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.475 + (((tickAnim - 8) / 3) * (0-(-0.475)));
            zz = 0.255 + (((tickAnim - 8) / 3) * (0.325-(0.255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -36.25 + (((tickAnim - 0) / 1) * (-27.22-(-36.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = -27.22 + (((tickAnim - 1) / 5) * (32-(-27.22)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 32 + (((tickAnim - 6) / 5) * (-36.25-(32)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -11 + (((tickAnim - 0) / 1) * (5.06-(-11)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 5.06 + (((tickAnim - 1) / 5) * (17.5-(5.06)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 17.5 + (((tickAnim - 6) / 5) * (-11-(17.5)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.475-(0)));
            zz = 0.275 + (((tickAnim - 0) / 1) * (0.28-(0.275)));
        }
        else if (tickAnim >= 1 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 1) / 10) * (0-(0)));
            yy = -0.475 + (((tickAnim - 1) / 10) * (0-(-0.475)));
            zz = 0.28 + (((tickAnim - 1) / 10) * (0.275-(0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 15 + (((tickAnim - 0) / 1) * (17.38-(15)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 17.38 + (((tickAnim - 1) / 5) * (0-(17.38)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -47.25 + (((tickAnim - 8) / 1) * (-47.25-(-47.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -47.25 + (((tickAnim - 9) / 2) * (15-(-47.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 1) * (-0.17-(-0.2)));
            zz = -0.15 + (((tickAnim - 0) / 1) * (-0.305-(-0.15)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            yy = -0.17 + (((tickAnim - 1) / 5) * (0-(-0.17)));
            zz = -0.305 + (((tickAnim - 1) / 5) * (0-(-0.305)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.145-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.06-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.145 + (((tickAnim - 8) / 1) * (0.145-(0.145)));
            zz = -0.06 + (((tickAnim - 8) / 1) * (-0.06-(-0.06)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.145 + (((tickAnim - 9) / 2) * (-0.2-(0.145)));
            zz = -0.06 + (((tickAnim - 9) / 2) * (-0.15-(-0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 62.5 + (((tickAnim - 0) / 1) * (2.72-(62.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 2.72 + (((tickAnim - 1) / 2) * (-9.68-(2.72)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -9.68 + (((tickAnim - 3) / 1) * (57.64-(-9.68)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 57.64 + (((tickAnim - 4) / 2) * (44.25-(57.64)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 44.25 + (((tickAnim - 6) / 2) * (88.31-(44.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 88.31 + (((tickAnim - 8) / 2) * (88.31-(88.31)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 88.31 + (((tickAnim - 10) / 1) * (62.5-(88.31)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.45-(0)));
            zz = 0.325 + (((tickAnim - 0) / 1) * (0.28-(0.325)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -0.45 + (((tickAnim - 1) / 2) * (0.175-(-0.45)));
            zz = 0.28 + (((tickAnim - 1) / 2) * (0.28-(0.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 3) / 5) * (0.5-(0.175)));
            zz = 0.28 + (((tickAnim - 3) / 5) * (0.33-(0.28)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 2) * (0.5-(0.5)));
            zz = 0.33 + (((tickAnim - 8) / 2) * (0.33-(0.33)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 1) * (0-(0.5)));
            zz = 0.33 + (((tickAnim - 10) / 1) * (0.325-(0.33)));
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
            xx = -42.75 + (((tickAnim - 0) / 3) * (0-(-42.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-58.25-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -58.25 + (((tickAnim - 4) / 2) * (49.25-(-58.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 49.25 + (((tickAnim - 6) / 5) * (-42.75-(49.25)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw, rightSickleClaw.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-81.55-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -81.55 + (((tickAnim - 4) / 2) * (30.5-(-81.55)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 30.5 + (((tickAnim - 6) / 5) * (0-(30.5)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.255-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.475 + (((tickAnim - 4) / 2) * (0-(-0.475)));
            zz = 0.255 + (((tickAnim - 4) / 2) * (0.325-(0.255)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0.325 + (((tickAnim - 6) / 5) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660/0.5-50))*5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-50))*-5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-150))*5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0.475);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660/0.5-100))*-5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-250))*5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*670/0.5-150))*-5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(21+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*670/0.5-250))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-21.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660/0.5+50))*5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-100))*10), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-50))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660/0.5+100))*5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-150))*15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-100))*10));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660/0.5+150))*5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-200))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-150))*15));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660/0.5+200))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-250))*20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*660-200))*15));
        
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMei entity = (EntityPrehistoricFloraMei) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -16.65282 + (((tickAnim - 0) / 11) * (21.25-(-16.65282)));
            yy = 3.06704 + (((tickAnim - 0) / 11) * (0-(3.06704)));
            zz = 3.62882 + (((tickAnim - 0) / 11) * (0-(3.62882)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 21.25 + (((tickAnim - 11) / 4) * (4.07235-(21.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (-4.90858-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-0.3847-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 4.07235 + (((tickAnim - 15) / 5) * (-16.65282-(4.07235)));
            yy = -4.90858 + (((tickAnim - 15) / 5) * (3.06704-(-4.90858)));
            zz = -0.3847 + (((tickAnim - 15) / 5) * (3.62882-(-0.3847)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -6.75 + (((tickAnim - 0) / 11) * (24.5-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 24.5 + (((tickAnim - 11) / 2) * (30.82-(24.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 30.82 + (((tickAnim - 13) / 7) * (-6.75-(30.82)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 11) * (0-(-0.225)));
            zz = -0.075 + (((tickAnim - 0) / 11) * (0-(-0.075)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (-0.075-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 6.75 + (((tickAnim - 0) / 11) * (0-(6.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (-49.55-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -49.55 + (((tickAnim - 14) / 3) * (-57.55-(-49.55)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -57.55 + (((tickAnim - 17) / 3) * (6.75-(-57.55)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 11) * (0-(-0.075)));
            zz = -0.275 + (((tickAnim - 0) / 11) * (0-(-0.275)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (-0.275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 16.64805 + (((tickAnim - 0) / 4) * (-7.15-(16.64805)));
            yy = 0.94235 + (((tickAnim - 0) / 4) * (0-(0.94235)));
            zz = -4.49813 + (((tickAnim - 0) / 4) * (0-(-4.49813)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7.15 + (((tickAnim - 4) / 3) * (40.5-(-7.15)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 40.5 + (((tickAnim - 7) / 4) * (36.5-(40.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 36.5 + (((tickAnim - 11) / 3) * (77.57-(36.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 77.57 + (((tickAnim - 14) / 3) * (85.75-(77.57)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 85.75 + (((tickAnim - 17) / 3) * (16.64805-(85.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0.94235-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-4.49813-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 2) * (0.62-(-0.325)));
            zz = 0.475 + (((tickAnim - 0) / 2) * (0.28-(0.475)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.62 + (((tickAnim - 2) / 2) * (0.225-(0.62)));
            zz = 0.28 + (((tickAnim - 2) / 2) * (0.2-(0.28)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 4) / 3) * (-0.17-(0.225)));
            zz = 0.2 + (((tickAnim - 4) / 3) * (0.13-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -0.17 + (((tickAnim - 7) / 4) * (0-(-0.17)));
            zz = 0.13 + (((tickAnim - 7) / 4) * (0-(0.13)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (-0.325-(0)));
            zz = 0.275 + (((tickAnim - 14) / 6) * (0.475-(0.275)));
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
            xx = 21.25 + (((tickAnim - 0) / 4) * (4.07235-(21.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (4.90858-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.3847-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 4.07235 + (((tickAnim - 4) / 5) * (-16.65282-(4.07235)));
            yy = 4.90858 + (((tickAnim - 4) / 5) * (-3.06704-(4.90858)));
            zz = 0.3847 + (((tickAnim - 4) / 5) * (-3.62882-(0.3847)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -16.65282 + (((tickAnim - 9) / 11) * (21.25-(-16.65282)));
            yy = -3.06704 + (((tickAnim - 9) / 11) * (0-(-3.06704)));
            zz = -3.62882 + (((tickAnim - 9) / 11) * (0-(-3.62882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 24.5 + (((tickAnim - 0) / 2) * (30.82-(24.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 30.82 + (((tickAnim - 2) / 7) * (-6.75-(30.82)));
            yy = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 9) / 11) * (24.5-(-6.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.075-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -0.225 + (((tickAnim - 9) / 11) * (0-(-0.225)));
            zz = -0.075 + (((tickAnim - 9) / 11) * (0-(-0.075)));
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
            xx = 36.5 + (((tickAnim - 0) / 3) * (77.57-(36.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 77.57 + (((tickAnim - 3) / 3) * (85.75-(77.57)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 85.75 + (((tickAnim - 6) / 3) * (16.64805-(85.75)));
            yy = 0 + (((tickAnim - 6) / 3) * (-0.94235-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (4.49813-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 16.64805 + (((tickAnim - 9) / 4) * (-7.15-(16.64805)));
            yy = -0.94235 + (((tickAnim - 9) / 4) * (0-(-0.94235)));
            zz = 4.49813 + (((tickAnim - 9) / 4) * (0-(4.49813)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -7.15 + (((tickAnim - 13) / 3) * (40.5-(-7.15)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 40.5 + (((tickAnim - 16) / 4) * (36.5-(40.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (-0.325-(0)));
            zz = 0.275 + (((tickAnim - 3) / 6) * (0.475-(0.275)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 9) / 2) * (0.245-(-0.325)));
            zz = 0.475 + (((tickAnim - 9) / 2) * (0.28-(0.475)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.245 + (((tickAnim - 11) / 2) * (0.25-(0.245)));
            zz = 0.28 + (((tickAnim - 11) / 2) * (0.2-(0.28)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 13) / 3) * (-0.17-(0.25)));
            zz = 0.2 + (((tickAnim - 13) / 3) * (0.13-(0.2)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.17 + (((tickAnim - 16) / 4) * (0-(-0.17)));
            zz = 0.13 + (((tickAnim - 16) / 4) * (0-(0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 43.75 + (((tickAnim - 0) / 9) * (-28-(43.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -28 + (((tickAnim - 9) / 4) * (-22.46-(-28)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -22.46 + (((tickAnim - 13) / 3) * (-46.26-(-22.46)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -46.26 + (((tickAnim - 16) / 4) * (26.75-(-46.26)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw, rightSickleClaw.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 35.5 + (((tickAnim - 0) / 9) * (0-(35.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-64.94-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -64.94 + (((tickAnim - 16) / 4) * (35.5-(-64.94)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 0) / 9) * (0-(0.225)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0.08-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.45 + (((tickAnim - 16) / 4) * (0-(-0.45)));
            zz = 0.08 + (((tickAnim - 16) / 4) * (0.225-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*-0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*0.5);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -28 + (((tickAnim - 0) / 4) * (-22.46-(-28)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -22.46 + (((tickAnim - 4) / 3) * (-46.26-(-22.46)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -46.26 + (((tickAnim - 7) / 4) * (26.75-(-46.26)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 26.75 + (((tickAnim - 11) / 9) * (-28-(26.75)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-64.94-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -64.94 + (((tickAnim - 7) / 4) * (35.5-(-64.94)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 35.5 + (((tickAnim - 11) / 9) * (0-(35.5)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0.08-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -0.45 + (((tickAnim - 7) / 4) * (0-(-0.45)));
            zz = 0.08 + (((tickAnim - 7) / 4) * (0.225-(0.08)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 11) / 9) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-49.55-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -49.55 + (((tickAnim - 3) / 3) * (-57.55-(-49.55)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -57.55 + (((tickAnim - 6) / 3) * (6.75-(-57.55)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 6.75 + (((tickAnim - 9) / 11) * (0-(6.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.275-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -0.075 + (((tickAnim - 9) / 11) * (0-(-0.075)));
            zz = -0.275 + (((tickAnim - 9) / 11) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*4));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*3), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*-3), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-230))*3), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*3), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*-3), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-230))*3), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Crest, Crest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-320))*-3), Crest.rotateAngleY + (float) Math.toRadians(0), Crest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+120))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*6));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+200))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*8));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMei e = (EntityPrehistoricFloraMei) entity;
        animator.update(entity);


    }
}
