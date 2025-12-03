package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHakusanobaatar;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHakusanobaatar extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLowerLeg_r1;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLowerLeg_r1;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r30;


    private ModelAnimator animator;

    public ModelHakusanobaatar() {
        this.textureWidth = 34;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 20.9F, 2.6F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2094F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 16, -1.6F, -1.3F, -0.2F, 3, 3, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.0F, -3.9F, 4, 4, 4, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2F, -2.9F);
        this.body.addChild(chest);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1571F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, -1.5F, -1.5853F, -2.5956F, 3, 3, 4, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.8F, -2.9F);
        this.chest.addChild(Neck);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, -1.5F);
        this.Neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1571F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 5, -1.0F, 1.4822F, -0.0347F, 2, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, -1.0F, -2.0F, 0.7F, 2, 2, 2, 0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.1F, -0.9F, -1.35F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.1745F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.8F, 0.0F, 0.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.7156F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 31, -0.2976F, -0.6189F, -0.2906F, 1, 1, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.7156F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 3, 31, -0.7024F, -0.6189F, -0.2906F, 1, 1, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.675F, -1.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2443F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 27, -1.0F, -1.2F, -0.8F, 1, 1, 1, 0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 24, 0.2F, -1.2F, -0.8F, 1, 1, 1, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.6F, -0.1F, -1.0F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 5, -1.5F, 0.5F, -0.8F, 2, 1, 2, -0.01F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 0, -1.5F, -0.9F, -0.9F, 2, 2, 2, 0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.1F, -0.7033F, -1.9539F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7592F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 21, -0.5F, -0.2007F, -1.0092F, 1, 1, 1, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.6F, -0.2494F, -2.8397F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.9948F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 30, -1.0F, 0.0791F, -1.0465F, 1, 1, 1, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.3F, -1.1F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6231F, -0.3196F, -0.248F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 30, -0.4F, -1.0F, -1.2177F, 1, 1, 1, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.7F, 0.3F, -1.1F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6231F, 0.3196F, 0.248F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 27, -0.6F, -1.0F, -1.2177F, 1, 1, 1, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.6F, 1.0F, -2.1F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5411F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 31, -1.0F, -0.9F, -0.8F, 1, 1, 0, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 13, -1.0F, -1.0F, -1.0F, 1, 1, 2, 0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.1F, 0.828F, -1.5067F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1658F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.3F, 0.2211F, -0.966F);
        this.Jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.3614F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 30, 0.8F, -0.4F, -0.1F, 1, 1, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.5F, 0.5F);
        this.Jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6078F, 0.3053F, 0.2061F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 27, -0.7F, -1.1F, -1.0F, 1, 1, 1, -0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.Jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6078F, -0.3053F, -0.2061F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 27, -0.3F, -1.1F, -1.0F, 1, 1, 1, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.Jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.576F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 30, 0.1F, -1.3F, -1.1F, 0, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 30, 0.9F, -1.3F, -1.1F, 0, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 17, 0.0F, -1.1F, -1.7F, 1, 1, 2, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(2.0F, 0.9F, -2.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0524F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftArm1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1396F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 17, -2.1F, -1.2F, -0.9F, 2, 2, 2, -0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.9F, 0.6001F, 0.4052F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.2967F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.5819F, -0.3026F);
        this.leftArm2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3853F, -0.0809F, 0.0328F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 17, -0.4F, -1.3136F, -0.5121F, 1, 2, 1, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(-0.1F, 0.8819F, -0.3026F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, -0.3142F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.leftHand.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.1396F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 27, -0.3F, -1.1F, -1.8F, 1, 1, 2, -0.01F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.0F, 0.9F, -2.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0524F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightArm1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1396F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 17, 0.1F, -1.2F, -0.9F, 2, 2, 2, -0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.9F, 0.6001F, 0.4052F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.2967F, 0.0F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.5819F, -0.3026F);
        this.rightArm2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3853F, 0.0809F, -0.0328F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 17, -0.6F, -1.3136F, -0.5121F, 1, 2, 1, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.1F, 0.8819F, -0.3026F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, -0.3142F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.rightHand.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.1396F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 27, -0.7F, -1.1F, -1.8F, 1, 1, 2, -0.01F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.0F, 0.2F, 1.0F);
        this.root.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1222F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.5F, 1.2F, 1.0F);
        this.leftLeg1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1047F, -0.2967F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 9, 0.1322F, -2.1F, -4.2301F, 2, 3, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.8F, 1.5F, -1.9F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.4316F, -0.3033F, 0.052F);


        this.leftLowerLeg_r1 = new AdvancedModelRenderer(this);
        this.leftLowerLeg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(leftLowerLeg_r1);
        this.setRotateAngle(leftLowerLeg_r1, -0.6225F, 0.0588F, -0.1429F);
        this.leftLowerLeg_r1.cubeList.add(new ModelBox(leftLowerLeg_r1, 7, 27, -0.4443F, -0.7294F, -0.4002F, 1, 1, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.2F, 0.9F, 1.1F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.4509F, -0.1046F, -0.1113F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFoot.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1126F, 0.2426F, -0.0352F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 26, 9, -0.4F, -0.7F, -1.5F, 1, 1, 2, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.0F, 0.2F, 1.0F);
        this.root.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1222F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.5F, 1.2F, 1.0F);
        this.rightLeg1.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1047F, 0.2967F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 15, 9, -2.1322F, -2.1F, -4.2301F, 2, 3, 3, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.8F, 1.5F, -1.9F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.4316F, 0.3033F, -0.052F);


        this.rightLowerLeg_r1 = new AdvancedModelRenderer(this);
        this.rightLowerLeg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(rightLowerLeg_r1);
        this.setRotateAngle(rightLowerLeg_r1, -0.6225F, -0.0588F, 0.1429F);
        this.rightLowerLeg_r1.cubeList.add(new ModelBox(rightLowerLeg_r1, 7, 27, -0.5557F, -0.7294F, -0.4002F, 1, 1, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-0.2F, 0.9F, 1.1F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.4509F, 0.1046F, 0.1113F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFoot.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1126F, -0.2426F, 0.0352F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 9, -0.6F, -0.7F, -1.5F, 1, 1, 2, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.6F, 1.2F);
        this.root.addChild(Tail1);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.0F, 0.5F);
        this.Tail1.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3665F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 9, 22, -0.5F, 0.3F, -0.3F, 1, 1, 3, 0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.7503F, 2.8273F);
        this.Tail1.addChild(Tail2);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.025F, 0.0F);
        this.Tail2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2269F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 0, -0.5F, -0.5F, -0.3F, 1, 1, 3, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.4949F, 2.1436F);
        this.Tail2.addChild(Tail3);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.Tail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0698F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 22, -0.5F, -0.4F, 0.3F, 1, 1, 3, -0.01F, false));



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
        this.root.offsetY = -1.80F;
        this.root.offsetX = 0F;
        this.root.rotateAngleY = (float)Math.toRadians(250);
        this.root.rotateAngleX = (float)Math.toRadians(-8);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 3.6F;
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
        this.root.offsetY = 0.172F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

//    public void renderStaticWall(float f) {
//
//        resetToDefaultPose();
//    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraHakusanobaatar entityHakusanobaatar = (EntityPrehistoricFloraHakusanobaatar) e;

        this.faceTarget(f3, f4, 12, Neck);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Neck = {};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (entityHakusanobaatar.getAnimation() == entityHakusanobaatar.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityHakusanobaatar.isReallyInWater()) {

                if (f3 == 0.0F || !entityHakusanobaatar.getIsMoving()) {
                    if (entityHakusanobaatar.getAnimation() != entityHakusanobaatar.EAT_ANIMATION
                        && entityHakusanobaatar.getAnimation() != entityHakusanobaatar.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityHakusanobaatar.getIsFast()) { //Running


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
        EntityPrehistoricFloraHakusanobaatar ee = (EntityPrehistoricFloraHakusanobaatar) entitylivingbaseIn;

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
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The graze anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHakusanobaatar entity = (EntityPrehistoricFloraHakusanobaatar) entitylivingbaseIn;
        int animCycle = 9;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.8-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 3.8 + (((tickAnim - 3) / 1) * (-2-(3.8)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -2 + (((tickAnim - 4) / 3) * (2-(-2)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 2 + (((tickAnim - 7) / 2) * (0-(2)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.67086-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.99511-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.09881-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 2.67086 + (((tickAnim - 2) / 2) * (-8-(2.67086)));
            yy = 0.99511 + (((tickAnim - 2) / 2) * (0-(0.99511)));
            zz = 0.09881 + (((tickAnim - 2) / 2) * (0-(0.09881)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -8 + (((tickAnim - 4) / 3) * (-14-(-8)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -14 + (((tickAnim - 7) / 2) * (0-(-14)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 20 + (((tickAnim - 4) / 5) * (0-(20)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHakusanobaatar entity = (EntityPrehistoricFloraHakusanobaatar) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.57-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.57 + (((tickAnim - 3) / 3) * (2-(2.57)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 2 + (((tickAnim - 6) / 6) * (-5.73-(2)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -5.73 + (((tickAnim - 12) / 8) * (0-(-5.73)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (15.71-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 15.71 + (((tickAnim - 3) / 3) * (18-(15.71)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 18 + (((tickAnim - 6) / 3) * (13.61-(18)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 13.61 + (((tickAnim - 9) / 3) * (20.82-(13.61)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 20.82 + (((tickAnim - 12) / 4) * (17.41-(20.82)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 17.41 + (((tickAnim - 16) / 4) * (0-(17.41)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (29-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 29 + (((tickAnim - 7) / 2) * (0-(29)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (29-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 29 + (((tickAnim - 16) / 2) * (0-(29)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.01743-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.19924-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.01743 + (((tickAnim - 6) / 1) * (-0.03338-(0.01743)));
            zz = 0.19924 + (((tickAnim - 6) / 1) * (-0.09426-(0.19924)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -0.03338 + (((tickAnim - 7) / 2) * (0-(-0.03338)));
            zz = -0.09426 + (((tickAnim - 7) / 2) * (0-(-0.09426)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.01743-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0.19924-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0.01743 + (((tickAnim - 15) / 1) * (-0.03338-(0.01743)));
            zz = 0.19924 + (((tickAnim - 15) / 1) * (-0.09426-(0.19924)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.03338 + (((tickAnim - 16) / 2) * (0-(-0.03338)));
            zz = -0.09426 + (((tickAnim - 16) / 2) * (0-(-0.09426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Jaw.rotationPointX = this.Jaw.rotationPointX + (float)(xx);
        this.Jaw.rotationPointY = this.Jaw.rotationPointY - (float)(yy);
        this.Jaw.rotationPointZ = this.Jaw.rotationPointZ + (float)(zz);


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHakusanobaatar entity = (EntityPrehistoricFloraHakusanobaatar) entitylivingbaseIn;
        int animCycle = 34;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 15) / 13) * (-5-(-5)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -5 + (((tickAnim - 28) / 6) * (0-(-5)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 12 + (((tickAnim - 15) / 13) * (12-(12)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 12 + (((tickAnim - 28) / 6) * (0-(12)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.78-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -3.78 + (((tickAnim - 8) / 10) * (-5-(-3.78)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 18) / 7) * (0-(-5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.08-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 3.08 + (((tickAnim - 4) / 6) * (-7-(3.08)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -7 + (((tickAnim - 10) / 8) * (-17-(-7)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -17 + (((tickAnim - 18) / 4) * (-18.33-(-17)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -18.33 + (((tickAnim - 22) / 3) * (-14-(-18.33)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -14 + (((tickAnim - 25) / 5) * (3.64-(-14)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 3.64 + (((tickAnim - 30) / 4) * (0-(3.64)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (46-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 46 + (((tickAnim - 18) / 5) * (46-(46)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 46 + (((tickAnim - 23) / 5) * (0-(46)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -10 + (((tickAnim - 15) / 13) * (-10-(-10)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -10 + (((tickAnim - 28) / 6) * (0-(-10)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -4 + (((tickAnim - 15) / 13) * (-4-(-4)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -4 + (((tickAnim - 28) / 6) * (0-(-4)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 15) / 13) * (6-(6)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 6 + (((tickAnim - 28) / 6) * (0-(6)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -10 + (((tickAnim - 15) / 13) * (-10-(-10)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -10 + (((tickAnim - 28) / 6) * (0-(-10)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -4 + (((tickAnim - 15) / 13) * (-4-(-4)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -4 + (((tickAnim - 28) / 6) * (0-(-4)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 15) / 13) * (6-(6)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 6 + (((tickAnim - 28) / 6) * (0-(6)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHakusanobaatar entity = (EntityPrehistoricFloraHakusanobaatar) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3 + (((tickAnim - 5) / 5) * (0-(3)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10.49878-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.03488-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (3.99985-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10.49878 + (((tickAnim - 3) / 2) * (-9.00137-(-10.49878)));
            yy = 0.03488 + (((tickAnim - 3) / 2) * (-0.05233-(0.03488)));
            zz = 3.99985 + (((tickAnim - 3) / 2) * (2.99954-(3.99985)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -9.00137 + (((tickAnim - 5) / 3) * (-4.51921-(-9.00137)));
            yy = -0.05233 + (((tickAnim - 5) / 3) * (0.4525-(-0.05233)));
            zz = 2.99954 + (((tickAnim - 5) / 3) * (-3.47731-(2.99954)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.51921 + (((tickAnim - 8) / 2) * (0-(-4.51921)));
            yy = 0.4525 + (((tickAnim - 8) / 2) * (0-(0.4525)));
            zz = -3.47731 + (((tickAnim - 8) / 2) * (0-(-3.47731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (36-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 36 + (((tickAnim - 5) / 5) * (0-(36)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.01912-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.30561-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.01912 + (((tickAnim - 3) / 2) * (-0.02502-(0.01912)));
            zz = 0.30561 + (((tickAnim - 3) / 2) * (0.00633-(0.30561)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.02502 + (((tickAnim - 5) / 3) * (-0.04566-(-0.02502)));
            zz = 0.00633 + (((tickAnim - 5) / 3) * (0.1167-(0.00633)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.04566 + (((tickAnim - 8) / 2) * (0-(-0.04566)));
            zz = 0.1167 + (((tickAnim - 8) / 2) * (0-(0.1167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Jaw.rotationPointX = this.Jaw.rotationPointX + (float)(xx);
        this.Jaw.rotationPointY = this.Jaw.rotationPointY - (float)(yy);
        this.Jaw.rotationPointZ = this.Jaw.rotationPointZ + (float)(zz);


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHakusanobaatar entity = (EntityPrehistoricFloraHakusanobaatar) entitylivingbaseIn;
        int animCycle = 5;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -4 + (((tickAnim - 0) / 1) * (-7-(-4)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -7 + (((tickAnim - 1) / 2) * (-1-(-7)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1 + (((tickAnim - 3) / 1) * (3-(-1)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 4) / 1) * (-4-(3)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 3) * (0.5-(0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (0.67-(0.5)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.67 + (((tickAnim - 4) / 1) * (0.2-(0.67)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1 + (((tickAnim - 0) / 1) * (-1.33-(1)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -1.33 + (((tickAnim - 1) / 2) * (0-(-1.33)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (2.67-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 2.67 + (((tickAnim - 4) / 1) * (1-(2.67)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6 + (((tickAnim - 0) / 1) * (6-(6)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 6 + (((tickAnim - 1) / 2) * (0-(6)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (5-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 4) / 1) * (6-(5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2 + (((tickAnim - 0) / 2) * (25-(2)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 2) / 1) * (18.75-(25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 18.75 + (((tickAnim - 3) / 0) * (0.5-(18.75)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.5 + (((tickAnim - 3) / 1) * (-3.75-(0.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -3.75 + (((tickAnim - 4) / 1) * (2-(-3.75)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 5 + (((tickAnim - 0) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (14.5-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 14.5 + (((tickAnim - 3) / 1) * (3.75-(14.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 3.75 + (((tickAnim - 4) / 1) * (5-(3.75)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -11 + (((tickAnim - 0) / 2) * (-28-(-11)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -28 + (((tickAnim - 2) / 1) * (-35-(-28)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -35 + (((tickAnim - 3) / 1) * (-29-(-35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -29 + (((tickAnim - 4) / 1) * (-11-(-29)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -75 + (((tickAnim - 0) / 2) * (-32.67-(-75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -32.67 + (((tickAnim - 2) / 1) * (-31-(-32.67)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -31 + (((tickAnim - 3) / 1) * (21.67-(-31)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 21.67 + (((tickAnim - 4) / 1) * (-75-(21.67)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 217 + (((tickAnim - 0) / 2) * (83-(217)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 83 + (((tickAnim - 2) / 1) * (61-(83)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 61 + (((tickAnim - 3) / 1) * (-5-(61)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 4) / 1) * (217-(-5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -11 + (((tickAnim - 0) / 2) * (-28-(-11)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -28 + (((tickAnim - 2) / 1) * (-35-(-28)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -35 + (((tickAnim - 3) / 1) * (-33-(-35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -33 + (((tickAnim - 4) / 1) * (-11-(-33)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -75 + (((tickAnim - 0) / 2) * (-32.67-(-75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -32.67 + (((tickAnim - 2) / 1) * (-31-(-32.67)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -31 + (((tickAnim - 3) / 1) * (25.67-(-31)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 25.67 + (((tickAnim - 4) / 1) * (-75-(25.67)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 217 + (((tickAnim - 0) / 2) * (83-(217)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 83 + (((tickAnim - 2) / 1) * (61-(83)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 61 + (((tickAnim - 3) / 1) * (-6-(61)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -6 + (((tickAnim - 4) / 1) * (217-(-6)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9 + (((tickAnim - 0) / 2) * (29.33-(9)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 29.33 + (((tickAnim - 2) / 1) * (80-(29.33)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 80 + (((tickAnim - 3) / 1) * (5.67-(80)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 5.67 + (((tickAnim - 4) / 1) * (9-(5.67)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -11 + (((tickAnim - 0) / 2) * (32.32047-(-11)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.50645-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.23133-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 32.32047 + (((tickAnim - 2) / 1) * (8.9807-(32.32047)));
            yy = -1.50645 + (((tickAnim - 2) / 1) * (-2.25968-(-1.50645)));
            zz = -0.23133 + (((tickAnim - 2) / 1) * (-0.347-(-0.23133)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 8.9807 + (((tickAnim - 3) / 1) * (20.66023-(8.9807)));
            yy = -2.25968 + (((tickAnim - 3) / 1) * (-0.75323-(-2.25968)));
            zz = -0.347 + (((tickAnim - 3) / 1) * (-0.11567-(-0.347)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 20.66023 + (((tickAnim - 4) / 1) * (-11-(20.66023)));
            yy = -0.75323 + (((tickAnim - 4) / 1) * (0-(-0.75323)));
            zz = -0.11567 + (((tickAnim - 4) / 1) * (0-(-0.11567)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3 + (((tickAnim - 0) / 2) * (-34.83034-(3)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.34579-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (8.93759-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -34.83034 + (((tickAnim - 2) / 1) * (45-(-34.83034)));
            yy = 1.34579 + (((tickAnim - 2) / 1) * (0-(1.34579)));
            zz = 8.93759 + (((tickAnim - 2) / 1) * (0-(8.93759)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 45 + (((tickAnim - 3) / 0) * (-27.5-(45)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 3) / 1) * (-28-(-27.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -28 + (((tickAnim - 4) / 1) * (3-(-28)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9 + (((tickAnim - 0) / 2) * (29.33-(9)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 29.33 + (((tickAnim - 2) / 1) * (80-(29.33)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 80 + (((tickAnim - 3) / 1) * (5.67-(80)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 5.67 + (((tickAnim - 4) / 1) * (9-(5.67)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -11 + (((tickAnim - 0) / 2) * (32.32047-(-11)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.50645-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.23133-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 32.32047 + (((tickAnim - 2) / 1) * (8.9807-(32.32047)));
            yy = 1.50645 + (((tickAnim - 2) / 1) * (2.25968-(1.50645)));
            zz = 0.23133 + (((tickAnim - 2) / 1) * (0.347-(0.23133)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 8.9807 + (((tickAnim - 3) / 1) * (20.66023-(8.9807)));
            yy = 2.25968 + (((tickAnim - 3) / 1) * (0.75323-(2.25968)));
            zz = 0.347 + (((tickAnim - 3) / 1) * (0.11567-(0.347)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 20.66023 + (((tickAnim - 4) / 1) * (-11-(20.66023)));
            yy = 0.75323 + (((tickAnim - 4) / 1) * (0-(0.75323)));
            zz = 0.11567 + (((tickAnim - 4) / 1) * (0-(0.11567)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3 + (((tickAnim - 0) / 2) * (-34.83034-(3)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.34579-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-8.93759-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -34.83034 + (((tickAnim - 2) / 1) * (45-(-34.83034)));
            yy = -1.34579 + (((tickAnim - 2) / 1) * (0-(-1.34579)));
            zz = -8.93759 + (((tickAnim - 2) / 1) * (0-(-8.93759)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 45 + (((tickAnim - 3) / 0) * (-27.5-(45)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 3) / 1) * (-28-(-27.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -28 + (((tickAnim - 4) / 1) * (3-(-28)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (15.67-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 15.67 + (((tickAnim - 1) / 2) * (20-(15.67)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 20 + (((tickAnim - 3) / 1) * (-3.33-(20)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -3.33 + (((tickAnim - 4) / 1) * (0-(-3.33)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-12.33-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -12.33 + (((tickAnim - 1) / 2) * (8-(-12.33)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 8 + (((tickAnim - 3) / 1) * (12.67-(8)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 12.67 + (((tickAnim - 4) / 1) * (0-(12.67)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-16.67-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -16.67 + (((tickAnim - 1) / 2) * (4-(-16.67)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 4 + (((tickAnim - 3) / 1) * (7.33-(4)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 7.33 + (((tickAnim - 4) / 1) * (0-(7.33)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHakusanobaatar entity = (EntityPrehistoricFloraHakusanobaatar) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (-11-(-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -11 + (((tickAnim - 3) / 5) * (-5-(-11)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -5 + (((tickAnim - 8) / 3) * (-11-(-5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11 + (((tickAnim - 11) / 4) * (-5-(-11)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 3) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 3) / 5) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 3) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 11) / 4) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3 + (((tickAnim - 0) / 3) * (6-(3)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 6 + (((tickAnim - 3) / 5) * (3-(6)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3 + (((tickAnim - 8) / 3) * (6-(3)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 6 + (((tickAnim - 11) / 4) * (3-(6)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3 + (((tickAnim - 0) / 3) * (7-(3)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 7 + (((tickAnim - 3) / 5) * (3-(7)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3 + (((tickAnim - 8) / 3) * (7-(3)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 7 + (((tickAnim - 11) / 4) * (3-(7)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9 + (((tickAnim - 0) / 3) * (7-(9)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 7 + (((tickAnim - 3) / 5) * (9-(7)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 9 + (((tickAnim - 8) / 3) * (7-(9)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 7 + (((tickAnim - 11) / 4) * (9-(7)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 3) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 11) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1 + (((tickAnim - 0) / 3) * (-19.66-(-1)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -19.66 + (((tickAnim - 3) / 2) * (-68.33-(-19.66)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -68.33 + (((tickAnim - 5) / 3) * (-42-(-68.33)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -42 + (((tickAnim - 8) / 3) * (-18.78-(-42)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -18.78 + (((tickAnim - 11) / 4) * (-1-(-18.78)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 26.5 + (((tickAnim - 0) / 3) * (-52-(26.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -52 + (((tickAnim - 3) / 2) * (4.5-(-52)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.5 + (((tickAnim - 5) / 3) * (13-(4.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 13 + (((tickAnim - 8) / 3) * (15-(13)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 11) / 4) * (26.5-(15)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 0) / 3) * (84.66-(-25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 84.66 + (((tickAnim - 3) / 2) * (44.33-(84.66)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 44.33 + (((tickAnim - 5) / 3) * (28-(44.33)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 28 + (((tickAnim - 8) / 3) * (2.44-(28)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 2.44 + (((tickAnim - 11) / 4) * (-25-(2.44)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -42 + (((tickAnim - 0) / 3) * (-18.78-(-42)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -18.78 + (((tickAnim - 3) / 5) * (-1-(-18.78)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1 + (((tickAnim - 8) / 2) * (-19.66-(-1)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -19.66 + (((tickAnim - 10) / 3) * (-68.33-(-19.66)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -68.33 + (((tickAnim - 13) / 2) * (-42-(-68.33)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13 + (((tickAnim - 0) / 3) * (15-(13)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 3) / 5) * (26.5-(15)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 26.5 + (((tickAnim - 8) / 2) * (-52-(26.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -52 + (((tickAnim - 10) / 3) * (4.5-(-52)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 4.5 + (((tickAnim - 13) / 2) * (13-(4.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28 + (((tickAnim - 0) / 3) * (2.44-(28)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.44 + (((tickAnim - 3) / 5) * (-25-(2.44)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25 + (((tickAnim - 8) / 2) * (84.66-(-25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 84.66 + (((tickAnim - 10) / 3) * (44.33-(84.66)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 44.33 + (((tickAnim - 13) / 2) * (28-(44.33)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5.45881 + (((tickAnim - 0) / 3) * (5.87452-(-5.45881)));
            yy = -11.03355 + (((tickAnim - 0) / 3) * (-11.03355-(-11.03355)));
            zz = 4.74766 + (((tickAnim - 0) / 3) * (4.74766-(4.74766)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5.87452 + (((tickAnim - 3) / 5) * (22.54119-(5.87452)));
            yy = -11.03355 + (((tickAnim - 3) / 5) * (-11.03355-(-11.03355)));
            zz = 4.74766 + (((tickAnim - 3) / 5) * (4.74766-(4.74766)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.54119 + (((tickAnim - 8) / 2) * (-4.22292-(22.54119)));
            yy = -11.03355 + (((tickAnim - 8) / 2) * (-9.07202-(-11.03355)));
            zz = 4.74766 + (((tickAnim - 8) / 2) * (4.35115-(4.74766)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -4.22292 + (((tickAnim - 10) / 3) * (-7.12548-(-4.22292)));
            yy = -9.07202 + (((tickAnim - 10) / 3) * (-11.03355-(-9.07202)));
            zz = 4.35115 + (((tickAnim - 10) / 3) * (4.74766-(4.35115)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.12548 + (((tickAnim - 13) / 2) * (-5.45881-(-7.12548)));
            yy = -11.03355 + (((tickAnim - 13) / 2) * (-11.03355-(-11.03355)));
            zz = 4.74766 + (((tickAnim - 13) / 2) * (4.74766-(4.74766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3 + (((tickAnim - 0) / 3) * (18.67-(-3)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 18.67 + (((tickAnim - 3) / 5) * (47-(18.67)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 47 + (((tickAnim - 8) / 2) * (47.84-(47)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 47.84 + (((tickAnim - 10) / 3) * (-23.33-(47.84)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -23.33 + (((tickAnim - 13) / 2) * (-3-(-23.33)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11.76594 + (((tickAnim - 0) / 3) * (-18.9179-(11.76594)));
            yy = 3.05395 + (((tickAnim - 0) / 3) * (-2.42946-(3.05395)));
            zz = -11.53322 + (((tickAnim - 0) / 3) * (-2.04874-(-11.53322)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -18.9179 + (((tickAnim - 3) / 5) * (-49.76825-(-18.9179)));
            yy = -2.42946 + (((tickAnim - 3) / 5) * (-5.22555-(-2.42946)));
            zz = -2.04874 + (((tickAnim - 3) / 5) * (6.16467-(-2.04874)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -49.76825 + (((tickAnim - 8) / 2) * (-28.86247-(-49.76825)));
            yy = -5.22555 + (((tickAnim - 8) / 2) * (-2.76922-(-5.22555)));
            zz = 6.16467 + (((tickAnim - 8) / 2) * (2.28842-(6.16467)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -28.86247 + (((tickAnim - 10) / 3) * (11.71879-(-28.86247)));
            yy = -2.76922 + (((tickAnim - 10) / 3) * (9.25631-(-2.76922)));
            zz = 2.28842 + (((tickAnim - 10) / 3) * (1.33462-(2.28842)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 11.71879 + (((tickAnim - 13) / 2) * (11.76594-(11.71879)));
            yy = 9.25631 + (((tickAnim - 13) / 2) * (3.05395-(9.25631)));
            zz = 1.33462 + (((tickAnim - 13) / 2) * (-11.53322-(1.33462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.54119 + (((tickAnim - 0) / 3) * (-4.22292-(22.54119)));
            yy = 11.03355 + (((tickAnim - 0) / 3) * (9.07202-(11.03355)));
            zz = -4.74766 + (((tickAnim - 0) / 3) * (-4.35115-(-4.74766)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.22292 + (((tickAnim - 3) / 2) * (-7.12548-(-4.22292)));
            yy = 9.07202 + (((tickAnim - 3) / 2) * (11.03355-(9.07202)));
            zz = -4.35115 + (((tickAnim - 3) / 2) * (-4.74766-(-4.35115)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.12548 + (((tickAnim - 5) / 3) * (-5.45881-(-7.12548)));
            yy = 11.03355 + (((tickAnim - 5) / 3) * (11.03355-(11.03355)));
            zz = -4.74766 + (((tickAnim - 5) / 3) * (-4.74766-(-4.74766)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5.45881 + (((tickAnim - 8) / 2) * (5.87452-(-5.45881)));
            yy = 11.03355 + (((tickAnim - 8) / 2) * (11.03355-(11.03355)));
            zz = -4.74766 + (((tickAnim - 8) / 2) * (-4.74766-(-4.74766)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 5.87452 + (((tickAnim - 10) / 5) * (22.54119-(5.87452)));
            yy = 11.03355 + (((tickAnim - 10) / 5) * (11.03355-(11.03355)));
            zz = -4.74766 + (((tickAnim - 10) / 5) * (-4.74766-(-4.74766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 47 + (((tickAnim - 0) / 3) * (47.84-(47)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 47.84 + (((tickAnim - 3) / 2) * (-23.33-(47.84)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -23.33 + (((tickAnim - 5) / 3) * (-3-(-23.33)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3 + (((tickAnim - 8) / 2) * (18.67-(-3)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 18.67 + (((tickAnim - 10) / 5) * (47-(18.67)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -49.76825 + (((tickAnim - 0) / 3) * (-28.86247-(-49.76825)));
            yy = 5.22555 + (((tickAnim - 0) / 3) * (2.76922-(5.22555)));
            zz = -6.16467 + (((tickAnim - 0) / 3) * (-2.28842-(-6.16467)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -28.86247 + (((tickAnim - 3) / 2) * (11.71879-(-28.86247)));
            yy = 2.76922 + (((tickAnim - 3) / 2) * (-9.25631-(2.76922)));
            zz = -2.28842 + (((tickAnim - 3) / 2) * (-1.33462-(-2.28842)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.71879 + (((tickAnim - 5) / 3) * (11.76594-(11.71879)));
            yy = -9.25631 + (((tickAnim - 5) / 3) * (-3.05395-(-9.25631)));
            zz = -1.33462 + (((tickAnim - 5) / 3) * (11.53322-(-1.33462)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11.76594 + (((tickAnim - 8) / 2) * (-18.9179-(11.76594)));
            yy = -3.05395 + (((tickAnim - 8) / 2) * (2.42946-(-3.05395)));
            zz = 11.53322 + (((tickAnim - 8) / 2) * (2.04874-(11.53322)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -18.9179 + (((tickAnim - 10) / 5) * (-49.76825-(-18.9179)));
            yy = 2.42946 + (((tickAnim - 10) / 5) * (5.22555-(2.42946)));
            zz = 2.04874 + (((tickAnim - 10) / 5) * (-6.16467-(2.04874)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3 + (((tickAnim - 0) / 2) * (10-(3)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (13-(10)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 13 + (((tickAnim - 3) / 2) * (7.6-(13)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7.6 + (((tickAnim - 5) / 3) * (3-(7.6)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 3 + (((tickAnim - 8) / 1) * (10-(3)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 10 + (((tickAnim - 9) / 2) * (13-(10)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 13 + (((tickAnim - 11) / 2) * (7.6-(13)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 7.6 + (((tickAnim - 13) / 2) * (3-(7.6)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7 + (((tickAnim - 0) / 2) * (-1.5-(-7)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -1.5 + (((tickAnim - 2) / 1) * (3-(-1.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 3) / 2) * (5.8-(3)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5.8 + (((tickAnim - 5) / 3) * (-7-(5.8)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -7 + (((tickAnim - 8) / 1) * (-1.5-(-7)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -1.5 + (((tickAnim - 9) / 2) * (3-(-1.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 3 + (((tickAnim - 11) / 2) * (5.8-(3)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5.8 + (((tickAnim - 13) / 2) * (-7-(5.8)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 12 + (((tickAnim - 0) / 2) * (-7-(12)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7 + (((tickAnim - 2) / 1) * (-1-(-7)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1 + (((tickAnim - 3) / 2) * (2.4-(-1)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.4 + (((tickAnim - 5) / 3) * (12-(2.4)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 12 + (((tickAnim - 8) / 1) * (-7-(12)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -7 + (((tickAnim - 9) / 2) * (-1-(-7)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -1 + (((tickAnim - 11) / 2) * (2.4-(-1)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.4 + (((tickAnim - 13) / 2) * (12-(2.4)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHakusanobaatar e = (EntityPrehistoricFloraHakusanobaatar) entity;
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
