package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKaganaias;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKaganaias extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm1_r1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm2_r1;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftHand_r1;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm_r1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3_r1;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightHand_r1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail1_r1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg1_r1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg2_r1;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftFoot_r1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg_r1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3_r1;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightFoot_r1;

    private ModelAnimator animator;

    public ModelKaganaias() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 21.7F, 9.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1047F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 43, -1.5F, -1.6598F, -0.5664F, 3, 3, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.5F, 1.3F, -0.6F);
        this.root.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 13, -2.0F, -3.0F, -7.8F, 3, 3, 7, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -0.7F);
        this.body3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 34, -2.0F, -2.0F, -7.0F, 3, 2, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -1.0F, -7.8F);
        this.body3.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, -2.0F, -7.5F, 3, 4, 8, 0.02F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.5F, 0.3F, -6.9F);
        this.body2.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 34, -2.0F, -2.3F, -5.8F, 3, 3, 6, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -4.3F);
        this.body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 34, -2.0F, -1.0F, -1.0F, 3, 2, 5, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.3F, -5.5F);
        this.body1.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 38, 42, -2.0F, -2.0F, -2.3F, 3, 3, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, -0.6F, -2.2F);
        this.chest.addChild(neck);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -3.7F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3316F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 50, -1.0F, -0.9084F, 1.0313F, 2, 1, 3, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.7F, -1.8F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 50, -1.0F, -0.1F, -0.3F, 2, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.6F, -0.5F, -3.7F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 54, 46, -2.1F, -1.3F, 0.9F, 3, 2, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 43, 49, -1.1F, -0.9F, -3.1F, 1, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.1F, 0.1F, -2.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2269F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 0, 0.0F, -1.0F, 0.0F, 1, 1, 4, -0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.2F, 0.0F, 0.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3316F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 31, -0.6F, -1.0F, -0.5F, 1, 1, 1, 0.01F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.3F, 0.1F, -1.7F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1006F, -0.235F, 0.0777F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 50, 0.0F, -1.05F, 0.0F, 1, 1, 3, -0.02F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3316F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 45, 31, -0.4F, -1.0F, -0.5F, 1, 1, 1, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1F, 0.1F, -1.7F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1006F, 0.235F, -0.0777F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 50, -1.0F, -1.05F, 0.0F, 1, 1, 3, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.1F, 0.1F, -2.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2269F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 0, -1.0F, -1.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.1F, 0.1F, -2.6F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 49, 0.0F, -1.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-1.1F, 0.4F, 1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0175F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 42, 10, 0.0F, -0.7F, -4.0F, 1, 1, 5, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 31, 0.3F, -1.3F, -1.0F, 1, 1, 1, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 43, -0.3F, -1.3F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.3F, -3.6F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2094F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 44, 0.05F, -1.0F, 0.0F, 1, 1, 4, -0.02F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.3F, -3.6F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2094F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 44, -1.05F, -1.0F, 0.0F, 1, 1, 4, -0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.4F, 0.3F, -1.7F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1571F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 50, -0.4F, -1.0F, -0.1F, 1, 1, 2, -0.02F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(0.8F, 0.3F, -0.2F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0111F, 0.2091F, 0.0535F);


        this.leftArm1_r1 = new AdvancedModelRenderer(this);
        this.leftArm1_r1.setRotationPoint(-0.5F, -0.1F, 0.0F);
        this.leftArm1.addChild(leftArm1_r1);
        this.setRotateAngle(leftArm1_r1, 0.01F, -0.2791F, 0.2604F);
        this.leftArm1_r1.cubeList.add(new ModelBox(leftArm1_r1, 23, 10, 0.0F, -0.6F, -1.0F, 3, 1, 1, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.1314F, 0.6382F, 0.2541F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0101F, -0.7196F, 0.0919F);


        this.leftArm2_r1 = new AdvancedModelRenderer(this);
        this.leftArm2_r1.setRotationPoint(-0.1866F, 0.5353F, 0.4962F);
        this.leftArm2.addChild(leftArm2_r1);
        this.setRotateAngle(leftArm2_r1, 0.192F, 0.0F, 0.0F);
        this.leftArm2_r1.cubeList.add(new ModelBox(leftArm2_r1, 11, 44, -0.3F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(-0.0636F, 0.597F, -1.9008F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, -0.3171F, 0.0175F, 0.0495F);


        this.leftHand_r1 = new AdvancedModelRenderer(this);
        this.leftHand_r1.setRotationPoint(0.077F, 0.0383F, 0.3971F);
        this.leftHand.addChild(leftHand_r1);
        this.setRotateAngle(leftHand_r1, 0.2264F, 0.006F, -0.1309F);
        this.leftHand_r1.cubeList.add(new ModelBox(leftHand_r1, 32, 10, -1.0F, 0.0F, -1.7F, 2, 0, 2, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.8F, 0.3F, -0.2F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0111F, -0.2091F, -0.0535F);


        this.rightArm_r1 = new AdvancedModelRenderer(this);
        this.rightArm_r1.setRotationPoint(0.5F, -0.1F, 0.0F);
        this.rightArm1.addChild(rightArm_r1);
        this.setRotateAngle(rightArm_r1, 0.01F, 0.2791F, -0.2604F);
        this.rightArm_r1.cubeList.add(new ModelBox(rightArm_r1, 23, 10, -3.0F, -0.6F, -1.0F, 3, 1, 1, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.1314F, 0.6382F, 0.2541F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0101F, 0.7196F, -0.0919F);


        this.rightArm3_r1 = new AdvancedModelRenderer(this);
        this.rightArm3_r1.setRotationPoint(0.1866F, 0.5353F, 0.4962F);
        this.rightArm2.addChild(rightArm3_r1);
        this.setRotateAngle(rightArm3_r1, 0.192F, 0.0F, 0.0F);
        this.rightArm3_r1.cubeList.add(new ModelBox(rightArm3_r1, 11, 44, -0.7F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0636F, 0.597F, -1.9008F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, -0.3171F, -0.0175F, -0.0495F);


        this.rightHand_r1 = new AdvancedModelRenderer(this);
        this.rightHand_r1.setRotationPoint(-0.077F, 0.0383F, 0.3971F);
        this.rightHand.addChild(rightHand_r1);
        this.setRotateAngle(rightHand_r1, 0.2264F, -0.006F, 0.1309F);
        this.rightHand_r1.cubeList.add(new ModelBox(rightHand_r1, 32, 10, -1.0F, 0.0F, -1.7F, 2, 0, 2, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.2F, 0.5F);
        this.root.addChild(tail1);


        this.tail1_r1 = new AdvancedModelRenderer(this);
        this.tail1_r1.setRotationPoint(0.0F, 0.5F, 0.9F);
        this.tail1.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, -0.1222F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 21, 23, -1.0F, -2.0F, -1.0F, 2, 3, 7, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9F, 6.4F);
        this.tail1.addChild(tail2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 24, -1.0F, -1.243F, -0.1592F, 2, 2, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3F, 6.7F);
        this.tail2.addChild(tail3);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tail3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0349F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 0, -1.0F, -1.243F, -0.1592F, 2, 1, 8, -0.02F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0349F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 13, -1.0F, -1.243F, -0.1592F, 2, 1, 8, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.5F, 0.5F, 7.1F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 40, 23, 0.0F, -0.8F, 0.0F, 1, 1, 6, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.2F, 0.5F, -0.7F);
        this.root.addChild(leftLeg1);


        this.leftLeg1_r1 = new AdvancedModelRenderer(this);
        this.leftLeg1_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.leftLeg1.addChild(leftLeg1_r1);
        this.setRotateAngle(leftLeg1_r1, 0.1054F, 0.7241F, 0.2258F);
        this.leftLeg1_r1.cubeList.add(new ModelBox(leftLeg1_r1, 44, 6, -0.4F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.6F, 0.6F, -1.2F);
        this.leftLeg1.addChild(leftLeg2);


        this.leftLeg2_r1 = new AdvancedModelRenderer(this);
        this.leftLeg2_r1.setRotationPoint(-0.2F, 0.5F, -0.3F);
        this.leftLeg2.addChild(leftLeg2_r1);
        this.setRotateAngle(leftLeg2_r1, -0.1618F, -0.5735F, 0.2921F);
        this.leftLeg2_r1.cubeList.add(new ModelBox(leftLeg2_r1, 51, 42, -0.1F, -1.0F, -0.9F, 3, 1, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(1.8F, 0.9F, 1.1F);
        this.leftLeg2.addChild(leftFoot);


        this.leftFoot_r1 = new AdvancedModelRenderer(this);
        this.leftFoot_r1.setRotationPoint(0.1F, 0.0F, 0.2F);
        this.leftFoot.addChild(leftFoot_r1);
        this.setRotateAngle(leftFoot_r1, 0.0F, -2.0944F, 0.0F);
        this.leftFoot_r1.cubeList.add(new ModelBox(leftFoot_r1, 42, 17, -1.6F, 0.0F, -3.7268F, 3, 0, 4, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.2F, 0.5F, -0.7F);
        this.root.addChild(rightLeg1);


        this.rightLeg_r1 = new AdvancedModelRenderer(this);
        this.rightLeg_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.rightLeg1.addChild(rightLeg_r1);
        this.setRotateAngle(rightLeg_r1, 0.1054F, -0.7241F, -0.2258F);
        this.rightLeg_r1.cubeList.add(new ModelBox(rightLeg_r1, 44, 6, -2.6F, -1.0F, -1.0F, 3, 1, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.6F, 0.6F, -1.2F);
        this.rightLeg1.addChild(rightLeg2);


        this.rightLeg3_r1 = new AdvancedModelRenderer(this);
        this.rightLeg3_r1.setRotationPoint(0.2F, 0.5F, -0.3F);
        this.rightLeg2.addChild(rightLeg3_r1);
        this.setRotateAngle(rightLeg3_r1, -0.1618F, 0.5735F, -0.2921F);
        this.rightLeg3_r1.cubeList.add(new ModelBox(rightLeg3_r1, 51, 42, -2.9F, -1.0F, -0.9F, 3, 1, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-1.8F, 0.9F, 1.1F);
        this.rightLeg2.addChild(rightFoot);


        this.rightFoot_r1 = new AdvancedModelRenderer(this);
        this.rightFoot_r1.setRotationPoint(-0.1F, 0.0F, 0.2F);
        this.rightFoot.addChild(rightFoot_r1);
        this.setRotateAngle(rightFoot_r1, 0.0F, 2.0944F, 0.0F);
        this.rightFoot_r1.cubeList.add(new ModelBox(rightFoot_r1, 42, 17, -1.4F, 0.0F, -3.7268F, 3, 0, 4, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.0F;
        this.root.offsetX = 0F;
        this.root.rotateAngleY = (float)Math.toRadians(230);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 2.23F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

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
        this.root.offsetY = 0.0F;

        EntityPrehistoricFloraKaganaias proteros = (EntityPrehistoricFloraKaganaias) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraKaganaias ee = (EntityPrehistoricFloraKaganaias) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
//            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKaganaias entity = (EntityPrehistoricFloraKaganaias) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-3.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = -3.5 + (((tickAnim - 13) / 12) * (0-(-3.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-3.5-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = -3.5 + (((tickAnim - 38) / 12) * (0-(-3.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0.5 + (((tickAnim - 13) / 12) * (0-(0.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0.5-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0.5 + (((tickAnim - 38) / 12) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (15.1717-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-61.68931-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-19.5517-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 15.1717 + (((tickAnim - 13) / 6) * (10.89679-(15.1717)));
            yy = -61.68931 + (((tickAnim - 13) / 6) * (-26.4771-(-61.68931)));
            zz = -19.5517 + (((tickAnim - 13) / 6) * (-23.20406-(-19.5517)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 10.89679 + (((tickAnim - 19) / 6) * (0-(10.89679)));
            yy = -26.4771 + (((tickAnim - 19) / 6) * (0-(-26.4771)));
            zz = -23.20406 + (((tickAnim - 19) / 6) * (0-(-23.20406)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (15.1717-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (-61.68931-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-19.5517-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 15.1717 + (((tickAnim - 38) / 6) * (10.89679-(15.1717)));
            yy = -61.68931 + (((tickAnim - 38) / 6) * (-26.4771-(-61.68931)));
            zz = -19.5517 + (((tickAnim - 38) / 6) * (-23.20406-(-19.5517)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 10.89679 + (((tickAnim - 44) / 6) * (0-(10.89679)));
            yy = -26.4771 + (((tickAnim - 44) / 6) * (0-(-26.4771)));
            zz = -23.20406 + (((tickAnim - 44) / 6) * (0-(-23.20406)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (52.36033-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (8.04272-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-52.55429-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 52.36033 + (((tickAnim - 13) / 6) * (6.68025-(52.36033)));
            yy = 8.04272 + (((tickAnim - 13) / 6) * (-11.65349-(8.04272)));
            zz = -52.55429 + (((tickAnim - 13) / 6) * (-26.96366-(-52.55429)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 6.68025 + (((tickAnim - 19) / 6) * (0-(6.68025)));
            yy = -11.65349 + (((tickAnim - 19) / 6) * (0-(-11.65349)));
            zz = -26.96366 + (((tickAnim - 19) / 6) * (0-(-26.96366)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (52.36033-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (8.04272-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-52.55429-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 52.36033 + (((tickAnim - 38) / 6) * (6.68025-(52.36033)));
            yy = 8.04272 + (((tickAnim - 38) / 6) * (-11.65349-(8.04272)));
            zz = -52.55429 + (((tickAnim - 38) / 6) * (-26.96366-(-52.55429)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 6.68025 + (((tickAnim - 44) / 6) * (0-(6.68025)));
            yy = -11.65349 + (((tickAnim - 44) / 6) * (0-(-11.65349)));
            zz = -26.96366 + (((tickAnim - 44) / 6) * (0-(-26.96366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (42.42464-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (50.24816-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (29.37721-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 42.42464 + (((tickAnim - 13) / 2) * (104.37721-(42.42464)));
            yy = 50.24816 + (((tickAnim - 13) / 2) * (40.19853-(50.24816)));
            zz = 29.37721 + (((tickAnim - 13) / 2) * (23.50177-(29.37721)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 104.37721 + (((tickAnim - 15) / 4) * (60.29817-(104.37721)));
            yy = 40.19853 + (((tickAnim - 15) / 4) * (23.44914-(40.19853)));
            zz = 23.50177 + (((tickAnim - 15) / 4) * (13.70937-(23.50177)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 60.29817 + (((tickAnim - 19) / 6) * (0-(60.29817)));
            yy = 23.44914 + (((tickAnim - 19) / 6) * (0-(23.44914)));
            zz = 13.70937 + (((tickAnim - 19) / 6) * (0-(13.70937)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (42.42464-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (50.24816-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (29.37721-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 42.42464 + (((tickAnim - 38) / 2) * (104.37721-(42.42464)));
            yy = 50.24816 + (((tickAnim - 38) / 2) * (40.19853-(50.24816)));
            zz = 29.37721 + (((tickAnim - 38) / 2) * (23.50177-(29.37721)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 104.37721 + (((tickAnim - 40) / 4) * (60.29817-(104.37721)));
            yy = 40.19853 + (((tickAnim - 40) / 4) * (23.44914-(40.19853)));
            zz = 23.50177 + (((tickAnim - 40) / 4) * (13.70937-(23.50177)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 60.29817 + (((tickAnim - 44) / 6) * (0-(60.29817)));
            yy = 23.44914 + (((tickAnim - 44) / 6) * (0-(23.44914)));
            zz = 13.70937 + (((tickAnim - 44) / 6) * (0-(13.70937)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 13) / 2) * (-0.055-(0.525)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.055 + (((tickAnim - 15) / 10) * (0-(-0.055)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0.525-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 38) / 2) * (-0.055-(0.525)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.055 + (((tickAnim - 40) / 10) * (0-(-0.055)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (6.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 6.5 + (((tickAnim - 13) / 12) * (0-(6.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (6.5-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 6.5 + (((tickAnim - 38) / 12) * (0-(6.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKaganaias entity = (EntityPrehistoricFloraKaganaias) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.25 + (((tickAnim - 10) / 10) * (0-(11.25)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18.5 + (((tickAnim - 5) / 5) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 18.5 + (((tickAnim - 10) / 4) * (15.04-(18.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 15.04 + (((tickAnim - 14) / 6) * (0-(15.04)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.175-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 5) / 5) * (-0.275-(-0.275)));
            zz = 0.175 + (((tickAnim - 5) / 5) * (0.175-(0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 4) * (-0.335-(-0.275)));
            zz = 0.175 + (((tickAnim - 10) / 4) * (0.1-(0.175)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.335 + (((tickAnim - 14) / 6) * (0-(-0.335)));
            zz = 0.1 + (((tickAnim - 14) / 6) * (0-(0.1)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18 + (((tickAnim - 5) / 5) * (0-(18)));
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
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKaganaias entity = (EntityPrehistoricFloraKaganaias) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.06-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 13.06 + (((tickAnim - 3) / 2) * (-7.75-(13.06)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -7.75 + (((tickAnim - 5) / 6) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-18.03-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -18.03 + (((tickAnim - 3) / 1) * (-14.75818-(-18.03)));
            yy = 0 + (((tickAnim - 3) / 1) * (0.98916-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.27743-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -14.75818 + (((tickAnim - 4) / 1) * (-4-(-14.75818)));
            yy = 0.98916 + (((tickAnim - 4) / 1) * (0-(0.98916)));
            zz = 0.27743 + (((tickAnim - 4) / 1) * (0-(0.27743)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -4 + (((tickAnim - 5) / 3) * (0-(-4)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.545-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.545 + (((tickAnim - 3) / 1) * (0.485-(0.545)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.485 + (((tickAnim - 4) / 1) * (0.15-(0.485)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 5) / 3) * (0-(0.15)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (37-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 37 + (((tickAnim - 5) / 3) * (0-(37)));
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
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKaganaias entity = (EntityPrehistoricFloraKaganaias) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*1), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.2);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*4), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*4));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+130))*4), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+180))*4), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+200))*4), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*4), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.57886-(0)));
            yy = 49.25 + (((tickAnim - 0) / 5) * (-2.46843-(49.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.08426-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 10.57886 + (((tickAnim - 5) / 6) * (45.71358-(10.57886)));
            yy = -2.46843 + (((tickAnim - 5) / 6) * (-57.40205-(-2.46843)));
            zz = 1.08426 + (((tickAnim - 5) / 6) * (-29.15891-(1.08426)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 45.71358 + (((tickAnim - 11) / 5) * (34.42965-(45.71358)));
            yy = -57.40205 + (((tickAnim - 11) / 5) * (6.24709-(-57.40205)));
            zz = -29.15891 + (((tickAnim - 11) / 5) * (-29.41744-(-29.15891)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 34.42965 + (((tickAnim - 16) / 4) * (0-(34.42965)));
            yy = 6.24709 + (((tickAnim - 16) / 4) * (49.25-(6.24709)));
            zz = -29.41744 + (((tickAnim - 16) / 4) * (0-(-29.41744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -18.1211 + (((tickAnim - 0) / 5) * (6.77731-(-18.1211)));
            yy = -26.15867 + (((tickAnim - 0) / 5) * (0.33222-(-26.15867)));
            zz = 17.12217 + (((tickAnim - 0) / 5) * (1.32874-(17.12217)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 6.77731 + (((tickAnim - 5) / 6) * (20.93729-(6.77731)));
            yy = 0.33222 + (((tickAnim - 5) / 6) * (29.66285-(0.33222)));
            zz = 1.32874 + (((tickAnim - 5) / 6) * (-3.5642-(1.32874)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 20.93729 + (((tickAnim - 11) / 5) * (-0.17712-(20.93729)));
            yy = 29.66285 + (((tickAnim - 11) / 5) * (-25.78494-(29.66285)));
            zz = -3.5642 + (((tickAnim - 11) / 5) * (7.49126-(-3.5642)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.17712 + (((tickAnim - 16) / 4) * (-18.1211-(-0.17712)));
            yy = -25.78494 + (((tickAnim - 16) / 4) * (-26.15867-(-25.78494)));
            zz = 7.49126 + (((tickAnim - 16) / 4) * (17.12217-(7.49126)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-39.12147-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (32.68202-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (3.62657-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -39.12147 + (((tickAnim - 11) / 2) * (82.42302-(-39.12147)));
            yy = 32.68202 + (((tickAnim - 11) / 2) * (23.76874-(32.68202)));
            zz = 3.62657 + (((tickAnim - 11) / 2) * (2.63751-(3.62657)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 82.42302 + (((tickAnim - 13) / 3) * (48.96752-(82.42302)));
            yy = 23.76874 + (((tickAnim - 13) / 3) * (14.85546-(23.76874)));
            zz = 2.63751 + (((tickAnim - 13) / 3) * (1.64844-(2.63751)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 48.96752 + (((tickAnim - 16) / 2) * (-11.99482-(48.96752)));
            yy = 14.85546 + (((tickAnim - 16) / 2) * (8.89307-(14.85546)));
            zz = 1.64844 + (((tickAnim - 16) / 2) * (10.31955-(1.64844)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -11.99482 + (((tickAnim - 18) / 2) * (0-(-11.99482)));
            yy = 8.89307 + (((tickAnim - 18) / 2) * (0-(8.89307)));
            zz = 10.31955 + (((tickAnim - 18) / 2) * (0-(10.31955)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.41-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.14-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.41 + (((tickAnim - 4) / 2) * (0.45-(0.41)));
            zz = 0.14 + (((tickAnim - 4) / 2) * (0.2-(0.14)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.45 + (((tickAnim - 6) / 5) * (0.15-(0.45)));
            zz = 0.2 + (((tickAnim - 6) / 5) * (0.375-(0.2)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 11) / 2) * (0.045-(0.15)));
            zz = 0.375 + (((tickAnim - 11) / 2) * (0.27-(0.375)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.045 + (((tickAnim - 13) / 3) * (0.295-(0.045)));
            zz = 0.27 + (((tickAnim - 13) / 3) * (0.17-(0.27)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.295 + (((tickAnim - 16) / 4) * (0-(0.295)));
            zz = 0.17 + (((tickAnim - 16) / 4) * (0-(0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 45.71358 + (((tickAnim - 0) / 5) * (34.42965-(45.71358)));
            yy = 57.40205 + (((tickAnim - 0) / 5) * (-6.24709-(57.40205)));
            zz = 29.15891 + (((tickAnim - 0) / 5) * (29.41744-(29.15891)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 34.42965 + (((tickAnim - 5) / 5) * (0-(34.42965)));
            yy = -6.24709 + (((tickAnim - 5) / 5) * (-49.25-(-6.24709)));
            zz = 29.41744 + (((tickAnim - 5) / 5) * (0-(29.41744)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (17.79852-(0)));
            yy = -49.25 + (((tickAnim - 10) / 5) * (9.92397-(-49.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.45445-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 17.79852 + (((tickAnim - 15) / 5) * (45.71358-(17.79852)));
            yy = 9.92397 + (((tickAnim - 15) / 5) * (57.40205-(9.92397)));
            zz = 0.45445 + (((tickAnim - 15) / 5) * (29.15891-(0.45445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20.93729 + (((tickAnim - 0) / 5) * (-0.17712-(20.93729)));
            yy = -29.66285 + (((tickAnim - 0) / 5) * (25.78494-(-29.66285)));
            zz = 3.5642 + (((tickAnim - 0) / 5) * (-7.49126-(3.5642)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.17712 + (((tickAnim - 5) / 5) * (-18.1211-(-0.17712)));
            yy = 25.78494 + (((tickAnim - 5) / 5) * (26.15867-(25.78494)));
            zz = -7.49126 + (((tickAnim - 5) / 5) * (-17.12217-(-7.49126)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.1211 + (((tickAnim - 10) / 10) * (20.93729-(-18.1211)));
            yy = 26.15867 + (((tickAnim - 10) / 10) * (-29.66285-(26.15867)));
            zz = -17.12217 + (((tickAnim - 10) / 10) * (3.5642-(-17.12217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -39.12147 + (((tickAnim - 0) / 3) * (82.42302-(-39.12147)));
            yy = -32.68202 + (((tickAnim - 0) / 3) * (23.76874-(-32.68202)));
            zz = -3.62657 + (((tickAnim - 0) / 3) * (2.63751-(-3.62657)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 82.42302 + (((tickAnim - 3) / 2) * (48.96752-(82.42302)));
            yy = 23.76874 + (((tickAnim - 3) / 2) * (14.85546-(23.76874)));
            zz = 2.63751 + (((tickAnim - 3) / 2) * (1.64844-(2.63751)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 48.96752 + (((tickAnim - 5) / 3) * (-11.99482-(48.96752)));
            yy = 14.85546 + (((tickAnim - 5) / 3) * (8.89307-(14.85546)));
            zz = 1.64844 + (((tickAnim - 5) / 3) * (10.31955-(1.64844)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.99482 + (((tickAnim - 8) / 2) * (0-(-11.99482)));
            yy = 8.89307 + (((tickAnim - 8) / 2) * (0-(8.89307)));
            zz = 10.31955 + (((tickAnim - 8) / 2) * (0-(10.31955)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-39.12147-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-32.68202-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-3.62657-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 3) * (0.045-(0.15)));
            zz = 0.375 + (((tickAnim - 0) / 3) * (0.27-(0.375)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.045 + (((tickAnim - 3) / 2) * (0.295-(0.045)));
            zz = 0.27 + (((tickAnim - 3) / 2) * (0.17-(0.27)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.295 + (((tickAnim - 5) / 5) * (0-(0.295)));
            zz = 0.17 + (((tickAnim - 5) / 5) * (0-(0.17)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.485-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0.16-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.485 + (((tickAnim - 14) / 6) * (0.15-(0.485)));
            zz = 0.16 + (((tickAnim - 14) / 6) * (0.375-(0.16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*-5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 38.81912 + (((tickAnim - 0) / 5) * (-22.56414-(38.81912)));
            yy = -71.17404 + (((tickAnim - 0) / 5) * (-35.38104-(-71.17404)));
            zz = -19.10617 + (((tickAnim - 0) / 5) * (-10.72356-(-19.10617)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -22.56414 + (((tickAnim - 5) / 6) * (-7.25-(-22.56414)));
            yy = -35.38104 + (((tickAnim - 5) / 6) * (25.25-(-35.38104)));
            zz = -10.72356 + (((tickAnim - 5) / 6) * (0-(-10.72356)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -7.25 + (((tickAnim - 11) / 9) * (38.81912-(-7.25)));
            yy = 25.25 + (((tickAnim - 11) / 9) * (-71.17404-(25.25)));
            zz = 0 + (((tickAnim - 11) / 9) * (-19.10617-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.86773-(0)));
            yy = 25.25 + (((tickAnim - 0) / 5) * (44.95251-(25.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (6.61714-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 7.86773 + (((tickAnim - 5) / 6) * (13.63079-(7.86773)));
            yy = 44.95251 + (((tickAnim - 5) / 6) * (45.3133-(44.95251)));
            zz = 6.61714 + (((tickAnim - 5) / 6) * (9.97971-(6.61714)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 13.63079 + (((tickAnim - 11) / 9) * (0-(13.63079)));
            yy = 45.3133 + (((tickAnim - 11) / 9) * (25.25-(45.3133)));
            zz = 9.97971 + (((tickAnim - 11) / 9) * (0-(9.97971)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -14.22917 + (((tickAnim - 0) / 2) * (0.22012-(-14.22917)));
            yy = 32.02316 + (((tickAnim - 0) / 2) * (4.48469-(32.02316)));
            zz = -6.3224 + (((tickAnim - 0) / 2) * (12.17348-(-6.3224)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0.22012 + (((tickAnim - 2) / 3) * (42.73652-(0.22012)));
            yy = 4.48469 + (((tickAnim - 2) / 3) * (-23.25818-(4.48469)));
            zz = 12.17348 + (((tickAnim - 2) / 3) * (49.83217-(12.17348)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 42.73652 + (((tickAnim - 5) / 6) * (0-(42.73652)));
            yy = -23.25818 + (((tickAnim - 5) / 6) * (44-(-23.25818)));
            zz = 49.83217 + (((tickAnim - 5) / 6) * (0-(49.83217)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-54.63758-(0)));
            yy = 44 + (((tickAnim - 11) / 4) * (74.35297-(44)));
            zz = 0 + (((tickAnim - 11) / 4) * (-53.68355-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -54.63758 + (((tickAnim - 15) / 5) * (-14.22917-(-54.63758)));
            yy = 74.35297 + (((tickAnim - 15) / 5) * (32.02316-(74.35297)));
            zz = -53.68355 + (((tickAnim - 15) / 5) * (-6.3224-(-53.68355)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 5) / 6) * (0-(0.375)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
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
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -7.25 + (((tickAnim - 0) / 10) * (38.81912-(-7.25)));
            yy = -25.25 + (((tickAnim - 0) / 10) * (71.17404-(-25.25)));
            zz = 0 + (((tickAnim - 0) / 10) * (19.10617-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 38.81912 + (((tickAnim - 10) / 5) * (-22.56414-(38.81912)));
            yy = 71.17404 + (((tickAnim - 10) / 5) * (35.38104-(71.17404)));
            zz = 19.10617 + (((tickAnim - 10) / 5) * (10.72356-(19.10617)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.56414 + (((tickAnim - 15) / 5) * (-7.25-(-22.56414)));
            yy = 35.38104 + (((tickAnim - 15) / 5) * (-25.25-(35.38104)));
            zz = 10.72356 + (((tickAnim - 15) / 5) * (0-(10.72356)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 13.63079 + (((tickAnim - 0) / 10) * (0-(13.63079)));
            yy = -45.3133 + (((tickAnim - 0) / 10) * (-25.25-(-45.3133)));
            zz = -9.97971 + (((tickAnim - 0) / 10) * (0-(-9.97971)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (7.86773-(0)));
            yy = -25.25 + (((tickAnim - 10) / 5) * (-44.95251-(-25.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (-6.61714-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.86773 + (((tickAnim - 15) / 5) * (13.63079-(7.86773)));
            yy = -44.95251 + (((tickAnim - 15) / 5) * (-45.3133-(-44.95251)));
            zz = -6.61714 + (((tickAnim - 15) / 5) * (-9.97971-(-6.61714)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-62.60011-(0)));
            yy = -44 + (((tickAnim - 0) / 5) * (-71.04866-(-44)));
            zz = 0 + (((tickAnim - 0) / 5) * (62.99624-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -62.60011 + (((tickAnim - 5) / 5) * (-21.01744-(-62.60011)));
            yy = -71.04866 + (((tickAnim - 5) / 5) * (-41.98094-(-71.04866)));
            zz = 62.99624 + (((tickAnim - 5) / 5) * (6.56034-(62.99624)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -21.01744 + (((tickAnim - 10) / 2) * (0.22012-(-21.01744)));
            yy = -41.98094 + (((tickAnim - 10) / 2) * (-4.48469-(-41.98094)));
            zz = 6.56034 + (((tickAnim - 10) / 2) * (-12.17348-(6.56034)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0.22012 + (((tickAnim - 12) / 3) * (42.73652-(0.22012)));
            yy = -4.48469 + (((tickAnim - 12) / 3) * (23.25818-(-4.48469)));
            zz = -12.17348 + (((tickAnim - 12) / 3) * (-49.83217-(-12.17348)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 42.73652 + (((tickAnim - 15) / 5) * (0-(42.73652)));
            yy = 23.25818 + (((tickAnim - 15) / 5) * (-44-(23.25818)));
            zz = -49.83217 + (((tickAnim - 15) / 5) * (0-(-49.83217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 15) / 5) * (0-(0.375)));
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


    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKaganaias entity = (EntityPrehistoricFloraKaganaias) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*9), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.2);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*4), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*4));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+130))*4), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+180))*4), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+200))*4), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*4), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(51.63505), leftArm1.rotateAngleY + (float) Math.toRadians(-60.96508), leftArm1.rotateAngleZ + (float) Math.toRadians(28.25455));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(-57), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(39), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(51.63505), rightArm1.rotateAngleY + (float) Math.toRadians(60.96508), rightArm1.rotateAngleZ + (float) Math.toRadians(-28.25455));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(57), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(39), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*10), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*20), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*25), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3));


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(94.23436), leftLeg1.rotateAngleY + (float) Math.toRadians(-49.70559), leftLeg1.rotateAngleZ + (float) Math.toRadians(-13.90153));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-2.57281), leftLeg2.rotateAngleY + (float) Math.toRadians(55.60673), leftLeg2.rotateAngleZ + (float) Math.toRadians(20.94719));
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0.375);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0);


        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(0.21557), leftFoot.rotateAngleY + (float) Math.toRadians(-0.78271), leftFoot.rotateAngleZ + (float) Math.toRadians(14.34697));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(94.23436), rightLeg1.rotateAngleY + (float) Math.toRadians(49.70559), rightLeg1.rotateAngleZ + (float) Math.toRadians(13.90153));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(16.17719), rightLeg2.rotateAngleY + (float) Math.toRadians(-55.60673), rightLeg2.rotateAngleZ + (float) Math.toRadians(-20.94719));


        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(0.21557), rightFoot.rotateAngleY + (float) Math.toRadians(0.78271), rightFoot.rotateAngleZ + (float) Math.toRadians(-14.34697));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKaganaias entity = (EntityPrehistoricFloraKaganaias) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*2), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*6), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-0.8);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*6), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*4));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*6), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*4));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+130))*6), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+180))*6), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+200))*9), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+250))*9), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10.57886-(0)));
            yy = 49.25 + (((tickAnim - 0) / 3) * (-2.46843-(49.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.08426-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 10.57886 + (((tickAnim - 3) / 3) * (45.71358-(10.57886)));
            yy = -2.46843 + (((tickAnim - 3) / 3) * (-57.40205-(-2.46843)));
            zz = 1.08426 + (((tickAnim - 3) / 3) * (-29.15891-(1.08426)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 45.71358 + (((tickAnim - 6) / 2) * (30.15043-(45.71358)));
            yy = -57.40205 + (((tickAnim - 6) / 2) * (13.20272-(-57.40205)));
            zz = -29.15891 + (((tickAnim - 6) / 2) * (-40.93181-(-29.15891)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 30.15043 + (((tickAnim - 8) / 2) * (0-(30.15043)));
            yy = 13.20272 + (((tickAnim - 8) / 2) * (49.25-(13.20272)));
            zz = -40.93181 + (((tickAnim - 8) / 2) * (0-(-40.93181)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -18.1211 + (((tickAnim - 0) / 3) * (6.77731-(-18.1211)));
            yy = -26.15867 + (((tickAnim - 0) / 3) * (0.33222-(-26.15867)));
            zz = 17.12217 + (((tickAnim - 0) / 3) * (1.32874-(17.12217)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 6.77731 + (((tickAnim - 3) / 3) * (86.38644-(6.77731)));
            yy = 0.33222 + (((tickAnim - 3) / 3) * (22.41914-(0.33222)));
            zz = 1.32874 + (((tickAnim - 3) / 3) * (-47.86332-(1.32874)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 86.38644 + (((tickAnim - 6) / 2) * (-0.17712-(86.38644)));
            yy = 22.41914 + (((tickAnim - 6) / 2) * (-25.78494-(22.41914)));
            zz = -47.86332 + (((tickAnim - 6) / 2) * (7.49126-(-47.86332)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.17712 + (((tickAnim - 8) / 2) * (-18.1211-(-0.17712)));
            yy = -25.78494 + (((tickAnim - 8) / 2) * (-26.15867-(-25.78494)));
            zz = 7.49126 + (((tickAnim - 8) / 2) * (17.12217-(7.49126)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-33.32135-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (23.74377-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (8.76193-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -33.32135 + (((tickAnim - 3) / 3) * (-39.12147-(-33.32135)));
            yy = 23.74377 + (((tickAnim - 3) / 3) * (32.68202-(23.74377)));
            zz = 8.76193 + (((tickAnim - 3) / 3) * (3.62657-(8.76193)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -39.12147 + (((tickAnim - 6) / 1) * (82.42302-(-39.12147)));
            yy = 32.68202 + (((tickAnim - 6) / 1) * (23.76874-(32.68202)));
            zz = 3.62657 + (((tickAnim - 6) / 1) * (2.63751-(3.62657)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 82.42302 + (((tickAnim - 7) / 1) * (48.96752-(82.42302)));
            yy = 23.76874 + (((tickAnim - 7) / 1) * (14.85546-(23.76874)));
            zz = 2.63751 + (((tickAnim - 7) / 1) * (1.64844-(2.63751)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 48.96752 + (((tickAnim - 8) / 1) * (-11.99482-(48.96752)));
            yy = 14.85546 + (((tickAnim - 8) / 1) * (8.89307-(14.85546)));
            zz = 1.64844 + (((tickAnim - 8) / 1) * (10.31955-(1.64844)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -11.99482 + (((tickAnim - 9) / 1) * (0-(-11.99482)));
            yy = 8.89307 + (((tickAnim - 9) / 1) * (0-(8.89307)));
            zz = 10.31955 + (((tickAnim - 9) / 1) * (0-(10.31955)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.785-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.14-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.785 + (((tickAnim - 3) / 0) * (0.55-(0.785)));
            zz = 0.14 + (((tickAnim - 3) / 0) * (0.4-(0.14)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 3) / 3) * (0.15-(0.55)));
            zz = 0.4 + (((tickAnim - 3) / 3) * (0.375-(0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.15 + (((tickAnim - 6) / 1) * (0.045-(0.15)));
            zz = 0.375 + (((tickAnim - 6) / 1) * (0.27-(0.375)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.045 + (((tickAnim - 7) / 1) * (0.295-(0.045)));
            zz = 0.27 + (((tickAnim - 7) / 1) * (0.17-(0.27)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.295 + (((tickAnim - 8) / 2) * (0-(0.295)));
            zz = 0.17 + (((tickAnim - 8) / 2) * (0-(0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45.71358 + (((tickAnim - 0) / 3) * (29.10568-(45.71358)));
            yy = 57.40205 + (((tickAnim - 0) / 3) * (-14.46294-(57.40205)));
            zz = 29.15891 + (((tickAnim - 0) / 3) * (43.33044-(29.15891)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 29.10568 + (((tickAnim - 3) / 2) * (0-(29.10568)));
            yy = -14.46294 + (((tickAnim - 3) / 2) * (-49.25-(-14.46294)));
            zz = 43.33044 + (((tickAnim - 3) / 2) * (0-(43.33044)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (17.79852-(0)));
            yy = -49.25 + (((tickAnim - 5) / 3) * (9.92397-(-49.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.45445-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.79852 + (((tickAnim - 8) / 2) * (45.71358-(17.79852)));
            yy = 9.92397 + (((tickAnim - 8) / 2) * (57.40205-(9.92397)));
            zz = 0.45445 + (((tickAnim - 8) / 2) * (29.15891-(0.45445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 86.38644 + (((tickAnim - 0) / 3) * (-0.17712-(86.38644)));
            yy = -22.41914 + (((tickAnim - 0) / 3) * (25.78494-(-22.41914)));
            zz = 47.86332 + (((tickAnim - 0) / 3) * (-7.49126-(47.86332)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.17712 + (((tickAnim - 3) / 2) * (-18.1211-(-0.17712)));
            yy = 25.78494 + (((tickAnim - 3) / 2) * (26.15867-(25.78494)));
            zz = -7.49126 + (((tickAnim - 3) / 2) * (-17.12217-(-7.49126)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.1211 + (((tickAnim - 5) / 5) * (20.93729-(-18.1211)));
            yy = 26.15867 + (((tickAnim - 5) / 5) * (-29.66285-(26.15867)));
            zz = -17.12217 + (((tickAnim - 5) / 5) * (3.5642-(-17.12217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -39.12147 + (((tickAnim - 0) / 2) * (82.42302-(-39.12147)));
            yy = -32.68202 + (((tickAnim - 0) / 2) * (23.76874-(-32.68202)));
            zz = -3.62657 + (((tickAnim - 0) / 2) * (2.63751-(-3.62657)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 82.42302 + (((tickAnim - 2) / 1) * (48.96752-(82.42302)));
            yy = 23.76874 + (((tickAnim - 2) / 1) * (14.85546-(23.76874)));
            zz = 2.63751 + (((tickAnim - 2) / 1) * (1.64844-(2.63751)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 48.96752 + (((tickAnim - 3) / 1) * (-11.99482-(48.96752)));
            yy = 14.85546 + (((tickAnim - 3) / 1) * (8.89307-(14.85546)));
            zz = 1.64844 + (((tickAnim - 3) / 1) * (10.31955-(1.64844)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -11.99482 + (((tickAnim - 4) / 1) * (0-(-11.99482)));
            yy = 8.89307 + (((tickAnim - 4) / 1) * (0-(8.89307)));
            zz = 10.31955 + (((tickAnim - 4) / 1) * (0-(10.31955)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-39.12147-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-32.68202-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-3.62657-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 2) * (0.045-(0.15)));
            zz = 0.375 + (((tickAnim - 0) / 2) * (0.27-(0.375)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.045 + (((tickAnim - 2) / 1) * (0.295-(0.045)));
            zz = 0.27 + (((tickAnim - 2) / 1) * (0.17-(0.27)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.295 + (((tickAnim - 3) / 2) * (0-(0.295)));
            zz = 0.17 + (((tickAnim - 3) / 2) * (0-(0.17)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.485-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.16-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.485 + (((tickAnim - 8) / 2) * (0.15-(0.485)));
            zz = 0.16 + (((tickAnim - 8) / 2) * (0.375-(0.16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*9), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*25), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 38.81912 + (((tickAnim - 0) / 3) * (-22.56414-(38.81912)));
            yy = -71.17404 + (((tickAnim - 0) / 3) * (-35.38104-(-71.17404)));
            zz = -19.10617 + (((tickAnim - 0) / 3) * (-10.72356-(-19.10617)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -22.56414 + (((tickAnim - 3) / 3) * (-7.25-(-22.56414)));
            yy = -35.38104 + (((tickAnim - 3) / 3) * (25.25-(-35.38104)));
            zz = -10.72356 + (((tickAnim - 3) / 3) * (0-(-10.72356)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -7.25 + (((tickAnim - 6) / 4) * (38.81912-(-7.25)));
            yy = 25.25 + (((tickAnim - 6) / 4) * (-71.17404-(25.25)));
            zz = 0 + (((tickAnim - 6) / 4) * (-19.10617-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (7.86773-(0)));
            yy = 25.25 + (((tickAnim - 0) / 3) * (44.95251-(25.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (6.61714-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 7.86773 + (((tickAnim - 3) / 3) * (13.63079-(7.86773)));
            yy = 44.95251 + (((tickAnim - 3) / 3) * (45.3133-(44.95251)));
            zz = 6.61714 + (((tickAnim - 3) / 3) * (9.97971-(6.61714)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 13.63079 + (((tickAnim - 6) / 4) * (0-(13.63079)));
            yy = 45.3133 + (((tickAnim - 6) / 4) * (25.25-(45.3133)));
            zz = 9.97971 + (((tickAnim - 6) / 4) * (0-(9.97971)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -14.22917 + (((tickAnim - 0) / 1) * (0.22012-(-14.22917)));
            yy = 32.02316 + (((tickAnim - 0) / 1) * (4.48469-(32.02316)));
            zz = -6.3224 + (((tickAnim - 0) / 1) * (12.17348-(-6.3224)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0.22012 + (((tickAnim - 1) / 2) * (42.73652-(0.22012)));
            yy = 4.48469 + (((tickAnim - 1) / 2) * (-23.25818-(4.48469)));
            zz = 12.17348 + (((tickAnim - 1) / 2) * (49.83217-(12.17348)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 42.73652 + (((tickAnim - 3) / 3) * (0-(42.73652)));
            yy = -23.25818 + (((tickAnim - 3) / 3) * (44-(-23.25818)));
            zz = 49.83217 + (((tickAnim - 3) / 3) * (0-(49.83217)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-54.63758-(0)));
            yy = 44 + (((tickAnim - 6) / 2) * (74.35297-(44)));
            zz = 0 + (((tickAnim - 6) / 2) * (-53.68355-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -54.63758 + (((tickAnim - 8) / 2) * (-14.22917-(-54.63758)));
            yy = 74.35297 + (((tickAnim - 8) / 2) * (32.02316-(74.35297)));
            zz = -53.68355 + (((tickAnim - 8) / 2) * (-6.3224-(-53.68355)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 3) / 3) * (0-(0.375)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
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
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.25 + (((tickAnim - 0) / 5) * (38.81912-(-7.25)));
            yy = -25.25 + (((tickAnim - 0) / 5) * (71.17404-(-25.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (19.10617-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 38.81912 + (((tickAnim - 5) / 3) * (-22.56414-(38.81912)));
            yy = 71.17404 + (((tickAnim - 5) / 3) * (35.38104-(71.17404)));
            zz = 19.10617 + (((tickAnim - 5) / 3) * (10.72356-(19.10617)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.56414 + (((tickAnim - 8) / 2) * (-7.25-(-22.56414)));
            yy = 35.38104 + (((tickAnim - 8) / 2) * (-25.25-(35.38104)));
            zz = 10.72356 + (((tickAnim - 8) / 2) * (0-(10.72356)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13.63079 + (((tickAnim - 0) / 5) * (0-(13.63079)));
            yy = -45.3133 + (((tickAnim - 0) / 5) * (-25.25-(-45.3133)));
            zz = -9.97971 + (((tickAnim - 0) / 5) * (0-(-9.97971)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (7.86773-(0)));
            yy = -25.25 + (((tickAnim - 5) / 3) * (-44.95251-(-25.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (-6.61714-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.86773 + (((tickAnim - 8) / 2) * (13.63079-(7.86773)));
            yy = -44.95251 + (((tickAnim - 8) / 2) * (-45.3133-(-44.95251)));
            zz = -6.61714 + (((tickAnim - 8) / 2) * (-9.97971-(-6.61714)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-62.60011-(0)));
            yy = -44 + (((tickAnim - 0) / 3) * (-71.04866-(-44)));
            zz = 0 + (((tickAnim - 0) / 3) * (62.99624-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -62.60011 + (((tickAnim - 3) / 2) * (-21.01744-(-62.60011)));
            yy = -71.04866 + (((tickAnim - 3) / 2) * (-41.98094-(-71.04866)));
            zz = 62.99624 + (((tickAnim - 3) / 2) * (6.56034-(62.99624)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -21.01744 + (((tickAnim - 5) / 1) * (0.22012-(-21.01744)));
            yy = -41.98094 + (((tickAnim - 5) / 1) * (-4.48469-(-41.98094)));
            zz = 6.56034 + (((tickAnim - 5) / 1) * (-12.17348-(6.56034)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.22012 + (((tickAnim - 6) / 2) * (42.73652-(0.22012)));
            yy = -4.48469 + (((tickAnim - 6) / 2) * (23.25818-(-4.48469)));
            zz = -12.17348 + (((tickAnim - 6) / 2) * (-49.83217-(-12.17348)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 42.73652 + (((tickAnim - 8) / 2) * (0-(42.73652)));
            yy = 23.25818 + (((tickAnim - 8) / 2) * (-44-(23.25818)));
            zz = -49.83217 + (((tickAnim - 8) / 2) * (0-(-49.83217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.375 + (((tickAnim - 8) / 2) * (0-(0.375)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKaganaias e = (EntityPrehistoricFloraKaganaias) entity;
        animator.update(entity);

            animator.setAnimation(e.ROAR_ANIMATION);
            animator.startKeyframe(10);
            animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(10);
            animator.resetKeyframe(10);

    }
}
