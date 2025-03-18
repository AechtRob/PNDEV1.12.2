package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnkylosphenodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAnkylosphenodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Ankylosphenodon;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer leftUpperArm;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLowerArm;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightUpperArm;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLowerArm;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightUpperLeg;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer rightLowerLeg;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftUpperLeg;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer leftLowerLeg;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    private ModelAnimator animator;

    public ModelAnkylosphenodon() {
        this.textureWidth = 82;
        this.textureHeight = 77;

        this.Ankylosphenodon = new AdvancedModelRenderer(this);
        this.Ankylosphenodon.setRotationPoint(0.0F, 22.7F, -6.1F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -3.2F, 16.2F);
        this.Ankylosphenodon.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.0F, -4.6F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1047F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 58, -1.0F, -2.0F, 2.0F, 4, 5, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, -4.6F, -4.1F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 69, 3.0F, 2.0F, 2.0F, 0, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.2F, 0.7F, -2.3F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.3F, -2.5F, -9.9F, 5, 5, 10, 0.02F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(-0.3F, 0.0F, -9.8F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 50, 56, -1.5F, -2.5F, -4.7F, 4, 5, 5, 0.01F, false));

        this.leftUpperArm = new AdvancedModelRenderer(this);
        this.leftUpperArm.setRotationPoint(2.2F, 1.3F, -3.3F);
        this.chest.addChild(leftUpperArm);
        this.setRotateAngle(leftUpperArm, 0.0F, -0.0175F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.leftUpperArm.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.3316F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 72, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.leftLowerArm = new AdvancedModelRenderer(this);
        this.leftLowerArm.setRotationPoint(2.8F, 0.8F, 0.0948F);
        this.leftUpperArm.addChild(leftLowerArm);
        this.setRotateAngle(leftLowerArm, -1.0317F, -0.6816F, 0.2655F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0611F, 0.9088F, -0.423F);
        this.leftLowerArm.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1571F, 0.0F, 1.5533F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 75, 34, -1.3474F, -1.8782F, -0.3384F, 3, 2, 1, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0789F, 2.4735F, 0.1165F);
        this.leftLowerArm.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.8871F, 0.428F, 0.1951F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.0703F, -0.3846F, 0.014F);
        this.leftHand.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1571F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 67, -1.3535F, 0.1399F, -3.6469F, 3, 0, 4, 0.0F, false));

        this.rightUpperArm = new AdvancedModelRenderer(this);
        this.rightUpperArm.setRotationPoint(-1.2F, 1.3F, -3.3F);
        this.chest.addChild(rightUpperArm);
        this.setRotateAngle(rightUpperArm, 0.0F, 0.0175F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.rightUpperArm.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3316F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 72, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.rightLowerArm = new AdvancedModelRenderer(this);
        this.rightLowerArm.setRotationPoint(-2.8F, 0.8F, 0.0948F);
        this.rightUpperArm.addChild(rightLowerArm);
        this.setRotateAngle(rightLowerArm, -1.0317F, 0.6816F, -0.2655F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0611F, 0.9088F, -0.423F);
        this.rightLowerArm.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1571F, 0.0F, -1.5533F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 75, 34, -1.6526F, -1.8782F, -0.3384F, 3, 2, 1, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.1604F, 2.7284F, 0.6138F);
        this.rightLowerArm.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.8871F, -0.428F, -0.1951F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.1518F, -0.8395F, -0.4833F);
        this.rightHand.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1571F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 67, -1.6465F, 0.1399F, -3.6469F, 3, 0, 4, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.9F, -0.3F, -4.5F);
        this.chest.addChild(neck1);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.1F, 2.7F, 0.0F);
        this.neck1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 72, 68, -2.0F, -1.0F, -2.0F, 3, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.9F, -1.2F, -1.8F);
        this.neck1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 69, 56, -1.0F, -1.0F, 0.0F, 3, 4, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.1F, -0.4F, -1.7F);
        this.neck1.addChild(neck2);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.4F, 0.0F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.576F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 72, 63, -1.5F, -1.0068F, -2.8806F, 2, 1, 3, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.1F, -0.9F, 0.1F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1222F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 70, 72, -1.4F, -0.8344F, -1.8928F, 2, 3, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.7F, -1.6F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.0698F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 40, 13, -1.5F, -0.4F, -1.1F, 3, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 31, 13, -1.5F, -1.2F, -1.1F, 3, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 73, 41, -0.5F, -0.4F, -3.95F, 1, 1, 3, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.1F, -0.2F, -2.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3316F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 52, 41, -1.0F, -0.4F, -0.6F, 1, 1, 1, 0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.1F, -0.2F, -2.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3316F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 41, 0.0F, -0.4F, -0.6F, 1, 1, 1, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.6F, -3.8F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3316F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 75, 29, -0.0341F, -1.0F, -0.1188F, 1, 1, 3, 0.01F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.6F, -3.8F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3316F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 75, 29, -0.9659F, -1.0F, -0.1188F, 1, 1, 3, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4F, -0.4F, -3.7F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2603F, -0.3054F, -0.0111F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 73, 46, -0.0483F, -0.0251F, -0.0811F, 1, 1, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.4F, -0.4F, -3.7F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2603F, 0.3054F, 0.0111F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 73, 46, -0.9517F, -0.0251F, -0.0811F, 1, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.1F, -0.7F, -0.9F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2793F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 73, 24, -0.4F, -0.55F, -3.0F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7F, -0.3F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0611F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 49, 13, -1.5F, -0.4F, -0.8F, 3, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.9F, 0.0F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1409F, -0.0013F, -0.0094F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 57, -0.4933F, -0.937F, -2.0745F, 1, 1, 2, -0.02F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.3895F, -3.6187F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0607F, -0.297F, -0.0194F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 73, 19, 0.0F, -0.5895F, 0.0187F, 1, 1, 3, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.3895F, -3.6187F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0607F, 0.297F, 0.0194F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 73, 19, -1.0F, -0.5895F, 0.0187F, 1, 1, 3, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.3895F, -3.6187F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0524F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 73, 51, -1.0F, -0.6F, -0.0113F, 1, 1, 3, 0.0F, false));

        this.rightUpperLeg = new AdvancedModelRenderer(this);
        this.rightUpperLeg.setRotationPoint(-1.1F, 1.6F, 0.0F);
        this.hips.addChild(rightUpperLeg);
        this.setRotateAngle(rightUpperLeg, -0.2541F, -0.6336F, 0.5034F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.rightUpperLeg.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2211F, 0.5386F, 0.8896F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 19, 68, -1.0F, -0.2F, -2.0F, 2, 4, 3, 0.0F, true));

        this.rightLowerLeg = new AdvancedModelRenderer(this);
        this.rightLowerLeg.setRotationPoint(-2.9076F, 1.8686F, -0.5202F);
        this.rightUpperLeg.addChild(rightLowerLeg);
        this.setRotateAngle(rightLowerLeg, 0.38F, 0.6358F, -0.0174F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.9724F, -0.1787F, 0.8441F);
        this.rightLowerLeg.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.9712F, 0.5931F, 1.1049F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 68, -0.2103F, -0.6737F, -2.6577F, 1, 5, 3, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-0.7218F, 2.7991F, 2.4474F);
        this.rightLowerLeg.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.254F, 0.8016F, -0.2401F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.665F, -0.4466F, -1.9997F);
        this.rightFoot.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.3912F, 0.6999F, -0.4711F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 58, 12, -3.2791F, -0.2836F, -4.5737F, 4, 0, 6, 0.0F, true));

        this.leftUpperLeg = new AdvancedModelRenderer(this);
        this.leftUpperLeg.setRotationPoint(1.1F, 1.6F, 0.0F);
        this.hips.addChild(leftUpperLeg);
        this.setRotateAngle(leftUpperLeg, -0.2541F, 0.6336F, -0.5034F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.leftUpperLeg.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2211F, -0.5386F, -0.8896F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 19, 68, -1.0F, -0.2F, -2.0F, 2, 4, 3, 0.0F, false));

        this.leftLowerLeg = new AdvancedModelRenderer(this);
        this.leftLowerLeg.setRotationPoint(2.9076F, 1.8686F, -0.5202F);
        this.leftUpperLeg.addChild(leftLowerLeg);
        this.setRotateAngle(leftLowerLeg, 0.38F, -0.6358F, 0.0174F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.9724F, -0.1787F, 0.8441F);
        this.leftLowerLeg.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.9712F, -0.5931F, -1.1049F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 68, -0.7897F, -0.6737F, -2.6577F, 1, 5, 3, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.7218F, 2.7991F, 2.4474F);
        this.leftLowerLeg.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.254F, -0.8016F, 0.2401F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.665F, -0.4466F, -1.9997F);
        this.leftFoot.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3912F, -0.6999F, 0.4711F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 58, 12, -0.7209F, -0.2836F, -4.5737F, 4, 0, 6, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.4F, 2.4F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.192F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 27, 44, -1.5F, -2.3F, -0.6F, 3, 4, 8, 0.01F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 58, 19, 0.0F, -3.0F, 0.3F, 0, 2, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 6.9F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1396F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 46, -1.5F, -1.6F, 0.0F, 3, 3, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 52, 31, -1.5F, 0.9F, 0.0F, 3, 1, 8, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 42, 67, 0.0F, -2.2F, 0.7F, 0, 1, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.2F, -0.1F, 7.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0175F, 0.0175F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 31, -0.8F, -0.2F, -0.1F, 2, 2, 10, -0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 0, -0.8F, -1.1F, -0.1F, 2, 2, 10, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 57, 0.207F, -1.7F, 0.5001F, 0, 1, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.3052F, 0.2F, 9.6F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0175F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 16, -0.6052F, -0.6F, -0.4F, 1, 1, 13, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 29, 16, -0.6052F, 0.0F, -0.4F, 1, 1, 13, -0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 31, -0.1052F, -1.1F, -0.4F, 0, 1, 13, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(-0.1F, 0.2F, 12.2F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0349F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 50, 44, -0.5017F, -0.5F, 0.1F, 1, 1, 10, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 56, 0, -0.0017F, -1.0F, 0.1F, 0, 1, 10, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Ankylosphenodon.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Ankylosphenodon.offsetY = -1.5F;
        this.Ankylosphenodon.offsetX = 1.5F;
        this.Ankylosphenodon.offsetZ = 2.5F;
        this.Ankylosphenodon.rotateAngleY = (float)Math.toRadians(235);
        this.Ankylosphenodon.rotateAngleX = (float)Math.toRadians(18);
        this.Ankylosphenodon.rotateAngleZ = (float)Math.toRadians(-8);
        this.Ankylosphenodon.scaleChildren = true;
        float scaler = 1.7F;
        this.Ankylosphenodon.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Ankylosphenodon, 0.3F, 3.8F, 0.0F);
        //End of pose, now render the model:
        this.Ankylosphenodon.render(f);
        //Reset rotations, positions and sizing:
        this.Ankylosphenodon.setScale(1.0F, 1.0F, 1.0F);
        this.Ankylosphenodon.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Ankylosphenodon.rotateAngleX = (float) Math.toRadians(90);
        this.Ankylosphenodon.offsetY = -0.2F;
        this.Ankylosphenodon.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.Ankylosphenodon.offsetY = -0.105F;
        this.Ankylosphenodon.render(0.01F);
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

        EntityPrehistoricFloraAnkylosphenodon entityAnkylosphenodon = (EntityPrehistoricFloraAnkylosphenodon) e;


        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head};
        entityAnkylosphenodon.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityAnkylosphenodon.getAnimation() == entityAnkylosphenodon.LAY_ANIMATION) {

        }
        else {
            if (!entityAnkylosphenodon.isReallyInWater()) {

                if (f3 == 0.0F || !entityAnkylosphenodon.getIsMoving()) {
                    if (entityAnkylosphenodon.getAnimation() != entityAnkylosphenodon.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityAnkylosphenodon.getIsFast()) { //Running


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

        EntityPrehistoricFloraAnkylosphenodon ee = (EntityPrehistoricFloraAnkylosphenodon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()){
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            //moving in water
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animCroak(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        if (ee.getAnimation() == ee.NOISE2_ANIMATION) {
            animChirp(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DIG_ANIMATION) {
            animDig(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animSneeze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animChirp(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnkylosphenodon entity = (EntityPrehistoricFloraAnkylosphenodon) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 5) / 9) * (-0.52381-(1)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -0.52381 + (((tickAnim - 14) / 9) * (0-(-0.52381)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 2 + (((tickAnim - 9) / 5) * (0.25-(2)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0.25 + (((tickAnim - 14) / 9) * (0-(0.25)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 2 + (((tickAnim - 5) / 8) * (-1.85714-(2)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -1.85714 + (((tickAnim - 13) / 10) * (0-(-1.85714)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9 + (((tickAnim - 8) / 1) * (6-(9)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 6 + (((tickAnim - 9) / 2) * (9-(6)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 9 + (((tickAnim - 11) / 2) * (6-(9)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 6 + (((tickAnim - 13) / 1) * (9-(6)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 9 + (((tickAnim - 14) / 2) * (6-(9)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 16) / 2) * (9-(6)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 9 + (((tickAnim - 18) / 5) * (0-(9)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animCroak(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnkylosphenodon entity = (EntityPrehistoricFloraAnkylosphenodon) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2 + (((tickAnim - 5) / 5) * (-1-(-2)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1 + (((tickAnim - 10) / 10) * (-3-(-1)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -3 + (((tickAnim - 20) / 6) * (0-(-3)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = -2 + (((tickAnim - 4) / 7) * (-3-(-2)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -3 + (((tickAnim - 11) / 4) * (0-(-3)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (-2-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -2 + (((tickAnim - 22) / 4) * (0-(-2)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -2 + (((tickAnim - 7) / 4) * (1-(-2)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 11) / 6) * (-1-(1)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -1 + (((tickAnim - 17) / 6) * (-6-(-1)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -6 + (((tickAnim - 23) / 3) * (0-(-6)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 11 + (((tickAnim - 5) / 5) * (0-(11)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (8-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 8 + (((tickAnim - 20) / 2) * (7-(8)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 7 + (((tickAnim - 22) / 1) * (8-(7)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 8 + (((tickAnim - 23) / 3) * (0-(8)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnkylosphenodon entity = (EntityPrehistoricFloraAnkylosphenodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 2 + (((tickAnim - 15) / 13) * (0-(2)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 28) / 14) * (2-(0)));
            yy = 0 + (((tickAnim - 28) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 14) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 42) / 8) * (0-(2)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 2 + (((tickAnim - 13) / 10) * (8.5102-(2)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 8.5102 + (((tickAnim - 23) / 5) * (9.34611-(8.5102)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 9.34611 + (((tickAnim - 28) / 6) * (4.18202-(9.34611)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 4.18202 + (((tickAnim - 34) / 16) * (0-(4.18202)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.23648-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.93702-(0)));
            zz = 3 + (((tickAnim - 0) / 15) * (-16.91366-(3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.23648 + (((tickAnim - 15) / 10) * (0.45798-(0.23648)));
            yy = -1.93702 + (((tickAnim - 15) / 10) * (-2.48518-(-1.93702)));
            zz = -16.91366 + (((tickAnim - 15) / 10) * (-18.1457-(-16.91366)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0.45798 + (((tickAnim - 25) / 8) * (0.25696-(0.45798)));
            yy = -2.48518 + (((tickAnim - 25) / 8) * (-1.89141-(-2.48518)));
            zz = -18.1457 + (((tickAnim - 25) / 8) * (-14.33632-(-18.1457)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0.25696 + (((tickAnim - 33) / 5) * (0.17271-(0.25696)));
            yy = -1.89141 + (((tickAnim - 33) / 5) * (-1.70604-(-1.89141)));
            zz = -14.33632 + (((tickAnim - 33) / 5) * (-13.92011-(-14.33632)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0.17271 + (((tickAnim - 38) / 7) * (0.11136-(0.17271)));
            yy = -1.70604 + (((tickAnim - 38) / 7) * (-0.91753-(-1.70604)));
            zz = -13.92011 + (((tickAnim - 38) / 7) * (-7.53282-(-13.92011)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.11136 + (((tickAnim - 45) / 5) * (0-(0.11136)));
            yy = -0.91753 + (((tickAnim - 45) / 5) * (0-(-0.91753)));
            zz = -7.53282 + (((tickAnim - 45) / 5) * (3-(-7.53282)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0.87203 + (((tickAnim - 0) / 15) * (2.88849-(-0.87203)));
            yy = -8.2197 + (((tickAnim - 0) / 15) * (-5.6638-(-8.2197)));
            zz = 0.43068 + (((tickAnim - 0) / 15) * (34.55015-(0.43068)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 2.88849 + (((tickAnim - 15) / 10) * (3.87331-(2.88849)));
            yy = -5.6638 + (((tickAnim - 15) / 10) * (-5.10152-(-5.6638)));
            zz = 34.55015 + (((tickAnim - 15) / 10) * (35.19151-(34.55015)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 3.87331 + (((tickAnim - 25) / 8) * (5.08965-(3.87331)));
            yy = -5.10152 + (((tickAnim - 25) / 8) * (-6.79596-(-5.10152)));
            zz = 35.19151 + (((tickAnim - 25) / 8) * (29.50809-(35.19151)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 5.08965 + (((tickAnim - 33) / 5) * (2.88849-(5.08965)));
            yy = -6.79596 + (((tickAnim - 33) / 5) * (-5.6638-(-6.79596)));
            zz = 29.50809 + (((tickAnim - 33) / 5) * (34.55015-(29.50809)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 2.88849 + (((tickAnim - 38) / 12) * (-0.87203-(2.88849)));
            yy = -5.6638 + (((tickAnim - 38) / 12) * (-8.2197-(-5.6638)));
            zz = 34.55015 + (((tickAnim - 38) / 12) * (0.43068-(34.55015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(xx), leftLowerArm.rotateAngleY + (float) Math.toRadians(yy), leftLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0.77583 + (((tickAnim - 0) / 15) * (-18.10444-(-0.77583)));
            yy = -0.32033 + (((tickAnim - 0) / 15) * (8.23899-(-0.32033)));
            zz = 0.31078 + (((tickAnim - 0) / 15) * (-13.7663-(0.31078)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -18.10444 + (((tickAnim - 15) / 4) * (-21.38087-(-18.10444)));
            yy = 8.23899 + (((tickAnim - 15) / 4) * (7.00763-(8.23899)));
            zz = -13.7663 + (((tickAnim - 15) / 4) * (-11.57314-(-13.7663)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -21.38087 + (((tickAnim - 19) / 6) * (-19.66355-(-21.38087)));
            yy = 7.00763 + (((tickAnim - 19) / 6) * (7.49346-(7.00763)));
            zz = -11.57314 + (((tickAnim - 19) / 6) * (-12.82392-(-11.57314)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -19.66355 + (((tickAnim - 25) / 3) * (-20.88289-(-19.66355)));
            yy = 7.49346 + (((tickAnim - 25) / 3) * (7.09934-(7.49346)));
            zz = -12.82392 + (((tickAnim - 25) / 3) * (-11.96817-(-12.82392)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -20.88289 + (((tickAnim - 28) / 5) * (-19.44449-(-20.88289)));
            yy = 7.09934 + (((tickAnim - 28) / 5) * (7.66192-(7.09934)));
            zz = -11.96817 + (((tickAnim - 28) / 5) * (-12.9133-(-11.96817)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -19.44449 + (((tickAnim - 33) / 5) * (-20.95229-(-19.44449)));
            yy = 7.66192 + (((tickAnim - 33) / 5) * (9.65367-(7.66192)));
            zz = -12.9133 + (((tickAnim - 33) / 5) * (-16.50155-(-12.9133)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -20.95229 + (((tickAnim - 38) / 12) * (-0.77583-(-20.95229)));
            yy = 9.65367 + (((tickAnim - 38) / 12) * (-0.32033-(9.65367)));
            zz = -16.50155 + (((tickAnim - 38) / 12) * (0.31078-(-16.50155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.23648-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.93702-(0)));
            zz = -3 + (((tickAnim - 0) / 15) * (16.91366-(-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.23648 + (((tickAnim - 15) / 10) * (0.45798-(0.23648)));
            yy = 1.93702 + (((tickAnim - 15) / 10) * (2.48518-(1.93702)));
            zz = 16.91366 + (((tickAnim - 15) / 10) * (18.1457-(16.91366)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0.45798 + (((tickAnim - 25) / 8) * (0.25696-(0.45798)));
            yy = 2.48518 + (((tickAnim - 25) / 8) * (1.89141-(2.48518)));
            zz = 18.1457 + (((tickAnim - 25) / 8) * (14.33632-(18.1457)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0.25696 + (((tickAnim - 33) / 5) * (0.17271-(0.25696)));
            yy = 1.89141 + (((tickAnim - 33) / 5) * (1.70604-(1.89141)));
            zz = 14.33632 + (((tickAnim - 33) / 5) * (13.92011-(14.33632)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0.17271 + (((tickAnim - 38) / 7) * (0.11136-(0.17271)));
            yy = 1.70604 + (((tickAnim - 38) / 7) * (0.91753-(1.70604)));
            zz = 13.92011 + (((tickAnim - 38) / 7) * (7.53282-(13.92011)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.11136 + (((tickAnim - 45) / 5) * (0-(0.11136)));
            yy = 0.91753 + (((tickAnim - 45) / 5) * (0-(0.91753)));
            zz = 7.53282 + (((tickAnim - 45) / 5) * (-3-(7.53282)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0.87203 + (((tickAnim - 0) / 15) * (2.88849-(-0.87203)));
            yy = 8.2197 + (((tickAnim - 0) / 15) * (5.6638-(8.2197)));
            zz = -0.43068 + (((tickAnim - 0) / 15) * (-34.55015-(-0.43068)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 2.88849 + (((tickAnim - 15) / 10) * (3.87331-(2.88849)));
            yy = 5.6638 + (((tickAnim - 15) / 10) * (5.10152-(5.6638)));
            zz = -34.55015 + (((tickAnim - 15) / 10) * (-35.19151-(-34.55015)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 3.87331 + (((tickAnim - 25) / 8) * (5.08965-(3.87331)));
            yy = 5.10152 + (((tickAnim - 25) / 8) * (6.79596-(5.10152)));
            zz = -35.19151 + (((tickAnim - 25) / 8) * (-29.50809-(-35.19151)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 5.08965 + (((tickAnim - 33) / 5) * (2.88849-(5.08965)));
            yy = 6.79596 + (((tickAnim - 33) / 5) * (5.6638-(6.79596)));
            zz = -29.50809 + (((tickAnim - 33) / 5) * (-34.55015-(-29.50809)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 2.88849 + (((tickAnim - 38) / 12) * (-0.87203-(2.88849)));
            yy = 5.6638 + (((tickAnim - 38) / 12) * (8.2197-(5.6638)));
            zz = -34.55015 + (((tickAnim - 38) / 12) * (-0.43068-(-34.55015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(xx), rightLowerArm.rotateAngleY + (float) Math.toRadians(yy), rightLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0.77583 + (((tickAnim - 0) / 15) * (-18.10444-(-0.77583)));
            yy = 0.32033 + (((tickAnim - 0) / 15) * (-8.23899-(0.32033)));
            zz = -0.31078 + (((tickAnim - 0) / 15) * (13.7663-(-0.31078)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -18.10444 + (((tickAnim - 15) / 4) * (-21.38087-(-18.10444)));
            yy = -8.23899 + (((tickAnim - 15) / 4) * (-7.00763-(-8.23899)));
            zz = 13.7663 + (((tickAnim - 15) / 4) * (11.57314-(13.7663)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -21.38087 + (((tickAnim - 19) / 6) * (-19.66355-(-21.38087)));
            yy = -7.00763 + (((tickAnim - 19) / 6) * (-7.49346-(-7.00763)));
            zz = 11.57314 + (((tickAnim - 19) / 6) * (12.82392-(11.57314)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -19.66355 + (((tickAnim - 25) / 3) * (-20.88289-(-19.66355)));
            yy = -7.49346 + (((tickAnim - 25) / 3) * (-7.09934-(-7.49346)));
            zz = 12.82392 + (((tickAnim - 25) / 3) * (11.96817-(12.82392)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -20.88289 + (((tickAnim - 28) / 5) * (-19.44449-(-20.88289)));
            yy = -7.09934 + (((tickAnim - 28) / 5) * (-7.66192-(-7.09934)));
            zz = 11.96817 + (((tickAnim - 28) / 5) * (12.9133-(11.96817)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -19.44449 + (((tickAnim - 33) / 5) * (-20.95229-(-19.44449)));
            yy = -7.66192 + (((tickAnim - 33) / 5) * (-9.65367-(-7.66192)));
            zz = 12.9133 + (((tickAnim - 33) / 5) * (16.50155-(12.9133)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -20.95229 + (((tickAnim - 38) / 12) * (-0.77583-(-20.95229)));
            yy = -9.65367 + (((tickAnim - 38) / 12) * (0.32033-(-9.65367)));
            zz = 16.50155 + (((tickAnim - 38) / 12) * (-0.31078-(16.50155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = -3 + (((tickAnim - 0) / 50) * (-3-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(xx), rightUpperLeg.rotateAngleY + (float) Math.toRadians(yy), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(xx), rightLowerLeg.rotateAngleY + (float) Math.toRadians(yy), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.03887 + (((tickAnim - 0) / 50) * (-0.03887-(-0.03887)));
            yy = 0.18412 + (((tickAnim - 0) / 50) * (0.18412-(0.18412)));
            zz = 0.95456 + (((tickAnim - 0) / 50) * (0.95456-(0.95456)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 3 + (((tickAnim - 0) / 50) * (3-(3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(xx), leftUpperLeg.rotateAngleY + (float) Math.toRadians(yy), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(xx), leftLowerLeg.rotateAngleY + (float) Math.toRadians(yy), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.03887 + (((tickAnim - 0) / 50) * (-0.03887-(-0.03887)));
            yy = -0.18412 + (((tickAnim - 0) / 50) * (-0.18412-(-0.18412)));
            zz = -0.95456 + (((tickAnim - 0) / 50) * (-0.95456-(-0.95456)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 31) {
            xx = 8 + (((tickAnim - 16) / 15) * (9.8-(8)));
            yy = 0 + (((tickAnim - 16) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 15) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 41) {
            xx = 9.8 + (((tickAnim - 31) / 10) * (2.44444-(9.8)));
            yy = 0 + (((tickAnim - 31) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 10) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 2.44444 + (((tickAnim - 41) / 9) * (0-(2.44444)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 12.2 + (((tickAnim - 8) / 8) * (13-(12.2)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 16) / 4) * (15.55556-(13)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 15.55556 + (((tickAnim - 20) / 4) * (10.11111-(15.55556)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 10.11111 + (((tickAnim - 24) / 7) * (8.65714-(10.11111)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 8.65714 + (((tickAnim - 31) / 3) * (15.04127-(8.65714)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 15.04127 + (((tickAnim - 34) / 7) * (15.80952-(15.04127)));
            yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 15.80952 + (((tickAnim - 41) / 4) * (-0.37662-(15.80952)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -0.37662 + (((tickAnim - 45) / 5) * (0-(-0.37662)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 8 + (((tickAnim - 16) / 4) * (1.25397-(8)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 1.25397 + (((tickAnim - 20) / 4) * (12.58486-(1.25397)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 12.58486 + (((tickAnim - 24) / 7) * (12.51429-(12.58486)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 12.51429 + (((tickAnim - 31) / 3) * (3.40106-(12.51429)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 3.40106 + (((tickAnim - 34) / 7) * (6.1746-(3.40106)));
            yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 6.1746 + (((tickAnim - 41) / 4) * (9.36797-(6.1746)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 9.36797 + (((tickAnim - 45) / 5) * (0-(9.36797)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (13-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 13 + (((tickAnim - 19) / 4) * (0-(13)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (13-(0)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 13 + (((tickAnim - 33) / 5) * (0-(13)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 41) / 5) * (13-(0)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 46) / 4) * (0-(13)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnkylosphenodon entity = (EntityPrehistoricFloraAnkylosphenodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 3 + (((tickAnim - 13) / 3) * (4-(3)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 4 + (((tickAnim - 16) / 7) * (3-(4)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 23) / 7) * (3-(3)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 3 + (((tickAnim - 30) / 4) * (4-(3)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 4 + (((tickAnim - 34) / 6) * (3-(4)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 40) / 10) * (0-(3)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 13) / 3) * (1-(0.6)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 1 + (((tickAnim - 16) / 7) * (0.6-(1)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.6 + (((tickAnim - 23) / 7) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 30) / 4) * (1-(0.6)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 1 + (((tickAnim - 34) / 6) * (0.6-(1)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 40) / 10) * (0-(0.6)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.38889-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 1.38889 + (((tickAnim - 5) / 8) * (1-(1.38889)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 1 + (((tickAnim - 13) / 3) * (3-(1)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 3 + (((tickAnim - 16) / 7) * (1-(3)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 23) / 7) * (1-(1)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 30) / 4) * (3-(1)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 34) / 6) * (1-(3)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 40) / 10) * (0-(1)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.16667-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -3.16667 + (((tickAnim - 5) / 8) * (-3-(-3.16667)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -3 + (((tickAnim - 13) / 3) * (-6-(-3)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -6 + (((tickAnim - 16) / 7) * (-3-(-6)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -3 + (((tickAnim - 23) / 7) * (-3-(-3)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -3 + (((tickAnim - 30) / 4) * (-6-(-3)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -6 + (((tickAnim - 34) / 6) * (-3-(-6)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 40) / 10) * (0-(-3)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.00107-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.01257-(0)));
            zz = 3 + (((tickAnim - 0) / 5) * (-2.11072-(3)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.00107 + (((tickAnim - 5) / 8) * (0.00381-(0.00107)));
            yy = -0.01257 + (((tickAnim - 5) / 8) * (-0.08715-(-0.01257)));
            zz = -2.11072 + (((tickAnim - 5) / 8) * (-4.99931-(-2.11072)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.00381 + (((tickAnim - 13) / 3) * (-0.39569-(0.00381)));
            yy = -0.08715 + (((tickAnim - 13) / 3) * (1.74704-(-0.08715)));
            zz = -4.99931 + (((tickAnim - 13) / 3) * (-12.03207-(-4.99931)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -0.39569 + (((tickAnim - 16) / 7) * (0-(-0.39569)));
            yy = 1.74704 + (((tickAnim - 16) / 7) * (-0.09-(1.74704)));
            zz = -12.03207 + (((tickAnim - 16) / 7) * (-5-(-12.03207)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.09 + (((tickAnim - 23) / 7) * (-0.09-(-0.09)));
            zz = -5 + (((tickAnim - 23) / 7) * (-5-(-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0.02058-(0)));
            yy = -0.09 + (((tickAnim - 30) / 4) * (-0.20885-(-0.09)));
            zz = -5 + (((tickAnim - 30) / 4) * (-11.99884-(-5)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.02058 + (((tickAnim - 34) / 6) * (0-(0.02058)));
            yy = -0.20885 + (((tickAnim - 34) / 6) * (-0.09-(-0.20885)));
            zz = -11.99884 + (((tickAnim - 34) / 6) * (-5-(-11.99884)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.09 + (((tickAnim - 40) / 10) * (0-(-0.09)));
            zz = -5 + (((tickAnim - 40) / 10) * (3-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.87203 + (((tickAnim - 0) / 5) * (8.93526-(-0.87203)));
            yy = -8.2197 + (((tickAnim - 0) / 5) * (-6.3286-(-8.2197)));
            zz = 0.43068 + (((tickAnim - 0) / 5) * (-3.25184-(0.43068)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 8.93526 + (((tickAnim - 5) / 8) * (4.57179-(8.93526)));
            yy = -6.3286 + (((tickAnim - 5) / 8) * (-6.41455-(-6.3286)));
            zz = -3.25184 + (((tickAnim - 5) / 8) * (5.17994-(-3.25184)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 4.57179 + (((tickAnim - 13) / 3) * (17.76617-(4.57179)));
            yy = -6.41455 + (((tickAnim - 13) / 3) * (-7.18568-(-6.41455)));
            zz = 5.17994 + (((tickAnim - 13) / 3) * (5.49643-(5.17994)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 17.76617 + (((tickAnim - 16) / 7) * (4.57-(17.76617)));
            yy = -7.18568 + (((tickAnim - 16) / 7) * (-6.41-(-7.18568)));
            zz = 5.49643 + (((tickAnim - 16) / 7) * (5.18-(5.49643)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 4.57 + (((tickAnim - 23) / 7) * (4.57-(4.57)));
            yy = -6.41 + (((tickAnim - 23) / 7) * (-6.41-(-6.41)));
            zz = 5.18 + (((tickAnim - 23) / 7) * (5.18-(5.18)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 4.57 + (((tickAnim - 30) / 4) * (17.76617-(4.57)));
            yy = -6.41 + (((tickAnim - 30) / 4) * (-7.18568-(-6.41)));
            zz = 5.18 + (((tickAnim - 30) / 4) * (5.49643-(5.18)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 17.76617 + (((tickAnim - 34) / 6) * (4.57-(17.76617)));
            yy = -7.18568 + (((tickAnim - 34) / 6) * (-6.41-(-7.18568)));
            zz = 5.49643 + (((tickAnim - 34) / 6) * (5.18-(5.49643)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 4.57 + (((tickAnim - 40) / 10) * (-0.87203-(4.57)));
            yy = -6.41 + (((tickAnim - 40) / 10) * (-8.2197-(-6.41)));
            zz = 5.18 + (((tickAnim - 40) / 10) * (0.43068-(5.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(xx), leftLowerArm.rotateAngleY + (float) Math.toRadians(yy), leftLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.77583 + (((tickAnim - 0) / 5) * (-4.81429-(-0.77583)));
            yy = -0.32033 + (((tickAnim - 0) / 5) * (-2.36944-(-0.32033)));
            zz = 0.31078 + (((tickAnim - 0) / 5) * (2.38155-(0.31078)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -4.81429 + (((tickAnim - 5) / 8) * (-4.28419-(-4.81429)));
            yy = -2.36944 + (((tickAnim - 5) / 8) * (-0.90251-(-2.36944)));
            zz = 2.38155 + (((tickAnim - 5) / 8) * (1.22863-(2.38155)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -4.28419 + (((tickAnim - 13) / 3) * (-13.51013-(-4.28419)));
            yy = -0.90251 + (((tickAnim - 13) / 3) * (-0.61103-(-0.90251)));
            zz = 1.22863 + (((tickAnim - 13) / 3) * (0.43123-(1.22863)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -13.51013 + (((tickAnim - 16) / 7) * (-4.28-(-13.51013)));
            yy = -0.61103 + (((tickAnim - 16) / 7) * (-0.9-(-0.61103)));
            zz = 0.43123 + (((tickAnim - 16) / 7) * (1.23-(0.43123)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4.28 + (((tickAnim - 23) / 7) * (-4.28-(-4.28)));
            yy = -0.9 + (((tickAnim - 23) / 7) * (-0.9-(-0.9)));
            zz = 1.23 + (((tickAnim - 23) / 7) * (1.23-(1.23)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -4.28 + (((tickAnim - 30) / 4) * (-13.51013-(-4.28)));
            yy = -0.9 + (((tickAnim - 30) / 4) * (-0.61103-(-0.9)));
            zz = 1.23 + (((tickAnim - 30) / 4) * (0.43123-(1.23)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -13.51013 + (((tickAnim - 34) / 6) * (-4.28-(-13.51013)));
            yy = -0.61103 + (((tickAnim - 34) / 6) * (-0.9-(-0.61103)));
            zz = 0.43123 + (((tickAnim - 34) / 6) * (1.23-(0.43123)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -4.28 + (((tickAnim - 40) / 10) * (-0.77583-(-4.28)));
            yy = -0.9 + (((tickAnim - 40) / 10) * (-0.32033-(-0.9)));
            zz = 1.23 + (((tickAnim - 40) / 10) * (0.31078-(1.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.00107-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.01257-(0)));
            zz = -3 + (((tickAnim - 0) / 5) * (2.11072-(-3)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.00107 + (((tickAnim - 5) / 8) * (0.00381-(0.00107)));
            yy = 0.01257 + (((tickAnim - 5) / 8) * (0.08715-(0.01257)));
            zz = 2.11072 + (((tickAnim - 5) / 8) * (4.99931-(2.11072)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.00381 + (((tickAnim - 13) / 3) * (-0.39569-(0.00381)));
            yy = 0.08715 + (((tickAnim - 13) / 3) * (-1.74704-(0.08715)));
            zz = 4.99931 + (((tickAnim - 13) / 3) * (12.03207-(4.99931)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -0.39569 + (((tickAnim - 16) / 7) * (0-(-0.39569)));
            yy = -1.74704 + (((tickAnim - 16) / 7) * (0.09-(-1.74704)));
            zz = 12.03207 + (((tickAnim - 16) / 7) * (5-(12.03207)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.09 + (((tickAnim - 23) / 7) * (0.09-(0.09)));
            zz = 5 + (((tickAnim - 23) / 7) * (5-(5)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0.02058-(0)));
            yy = 0.09 + (((tickAnim - 30) / 4) * (0.20885-(0.09)));
            zz = 5 + (((tickAnim - 30) / 4) * (11.99884-(5)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.02058 + (((tickAnim - 34) / 6) * (0-(0.02058)));
            yy = 0.20885 + (((tickAnim - 34) / 6) * (0.09-(0.20885)));
            zz = 11.99884 + (((tickAnim - 34) / 6) * (5-(11.99884)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.09 + (((tickAnim - 40) / 10) * (0-(0.09)));
            zz = 5 + (((tickAnim - 40) / 10) * (-3-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.87203 + (((tickAnim - 0) / 5) * (8.93526-(-0.87203)));
            yy = 8.2197 + (((tickAnim - 0) / 5) * (6.3286-(8.2197)));
            zz = -0.43068 + (((tickAnim - 0) / 5) * (3.25184-(-0.43068)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 8.93526 + (((tickAnim - 5) / 8) * (4.57179-(8.93526)));
            yy = 6.3286 + (((tickAnim - 5) / 8) * (6.41455-(6.3286)));
            zz = 3.25184 + (((tickAnim - 5) / 8) * (-5.17994-(3.25184)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 4.57179 + (((tickAnim - 13) / 3) * (17.76617-(4.57179)));
            yy = 6.41455 + (((tickAnim - 13) / 3) * (7.18568-(6.41455)));
            zz = -5.17994 + (((tickAnim - 13) / 3) * (-5.49643-(-5.17994)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 17.76617 + (((tickAnim - 16) / 7) * (4.57-(17.76617)));
            yy = 7.18568 + (((tickAnim - 16) / 7) * (6.41-(7.18568)));
            zz = -5.49643 + (((tickAnim - 16) / 7) * (-5.18-(-5.49643)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 4.57 + (((tickAnim - 23) / 7) * (4.57-(4.57)));
            yy = 6.41 + (((tickAnim - 23) / 7) * (6.41-(6.41)));
            zz = -5.18 + (((tickAnim - 23) / 7) * (-5.18-(-5.18)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 4.57 + (((tickAnim - 30) / 4) * (17.76617-(4.57)));
            yy = 6.41 + (((tickAnim - 30) / 4) * (7.18568-(6.41)));
            zz = -5.18 + (((tickAnim - 30) / 4) * (-5.49643-(-5.18)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 17.76617 + (((tickAnim - 34) / 6) * (4.57-(17.76617)));
            yy = 7.18568 + (((tickAnim - 34) / 6) * (6.41-(7.18568)));
            zz = -5.49643 + (((tickAnim - 34) / 6) * (-5.18-(-5.49643)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 4.57 + (((tickAnim - 40) / 10) * (-0.87203-(4.57)));
            yy = 6.41 + (((tickAnim - 40) / 10) * (8.2197-(6.41)));
            zz = -5.18 + (((tickAnim - 40) / 10) * (-0.43068-(-5.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(xx), rightLowerArm.rotateAngleY + (float) Math.toRadians(yy), rightLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.77583 + (((tickAnim - 0) / 5) * (-4.81429-(-0.77583)));
            yy = 0.32033 + (((tickAnim - 0) / 5) * (2.36944-(0.32033)));
            zz = -0.31078 + (((tickAnim - 0) / 5) * (-2.38155-(-0.31078)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -4.81429 + (((tickAnim - 5) / 8) * (-4.28419-(-4.81429)));
            yy = 2.36944 + (((tickAnim - 5) / 8) * (0.90251-(2.36944)));
            zz = -2.38155 + (((tickAnim - 5) / 8) * (-1.22863-(-2.38155)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -4.28419 + (((tickAnim - 13) / 3) * (-13.51013-(-4.28419)));
            yy = 0.90251 + (((tickAnim - 13) / 3) * (0.61103-(0.90251)));
            zz = -1.22863 + (((tickAnim - 13) / 3) * (-0.43123-(-1.22863)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -13.51013 + (((tickAnim - 16) / 7) * (-4.28-(-13.51013)));
            yy = 0.61103 + (((tickAnim - 16) / 7) * (0.9-(0.61103)));
            zz = -0.43123 + (((tickAnim - 16) / 7) * (-1.23-(-0.43123)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4.28 + (((tickAnim - 23) / 7) * (-4.28-(-4.28)));
            yy = 0.9 + (((tickAnim - 23) / 7) * (0.9-(0.9)));
            zz = -1.23 + (((tickAnim - 23) / 7) * (-1.23-(-1.23)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -4.28 + (((tickAnim - 30) / 4) * (-13.51013-(-4.28)));
            yy = 0.9 + (((tickAnim - 30) / 4) * (0.61103-(0.9)));
            zz = -1.23 + (((tickAnim - 30) / 4) * (-0.43123-(-1.23)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -13.51013 + (((tickAnim - 34) / 6) * (-4.28-(-13.51013)));
            yy = 0.61103 + (((tickAnim - 34) / 6) * (0.9-(0.61103)));
            zz = -0.43123 + (((tickAnim - 34) / 6) * (-1.23-(-0.43123)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -4.28 + (((tickAnim - 40) / 10) * (-0.77583-(-4.28)));
            yy = 0.9 + (((tickAnim - 40) / 10) * (0.32033-(0.9)));
            zz = -1.23 + (((tickAnim - 40) / 10) * (-0.31078-(-1.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1.08278-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.25221-(0)));
            zz = -3 + (((tickAnim - 0) / 13) * (-12.80711-(-3)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 1.08278 + (((tickAnim - 13) / 3) * (-1.21904-(1.08278)));
            yy = 3.25221 + (((tickAnim - 13) / 3) * (10.4152-(3.25221)));
            zz = -12.80711 + (((tickAnim - 13) / 3) * (-17.357-(-12.80711)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -1.21904 + (((tickAnim - 16) / 7) * (1.08278-(-1.21904)));
            yy = 10.4152 + (((tickAnim - 16) / 7) * (3.25221-(10.4152)));
            zz = -17.357 + (((tickAnim - 16) / 7) * (-12.80711-(-17.357)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1.08278 + (((tickAnim - 23) / 7) * (1.08278-(1.08278)));
            yy = 3.25221 + (((tickAnim - 23) / 7) * (3.25221-(3.25221)));
            zz = -12.80711 + (((tickAnim - 23) / 7) * (-12.80711-(-12.80711)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 1.08278 + (((tickAnim - 30) / 4) * (-1.21904-(1.08278)));
            yy = 3.25221 + (((tickAnim - 30) / 4) * (10.4152-(3.25221)));
            zz = -12.80711 + (((tickAnim - 30) / 4) * (-17.357-(-12.80711)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -1.21904 + (((tickAnim - 34) / 6) * (1.08278-(-1.21904)));
            yy = 10.4152 + (((tickAnim - 34) / 6) * (3.25221-(10.4152)));
            zz = -17.357 + (((tickAnim - 34) / 6) * (-12.80711-(-17.357)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.08278 + (((tickAnim - 40) / 10) * (0-(1.08278)));
            yy = 3.25221 + (((tickAnim - 40) / 10) * (0-(3.25221)));
            zz = -12.80711 + (((tickAnim - 40) / 10) * (-3-(-12.80711)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(xx), rightUpperLeg.rotateAngleY + (float) Math.toRadians(yy), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.36749-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-11.62926-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-3.82693-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -3.36749 + (((tickAnim - 13) / 3) * (-6.11983-(-3.36749)));
            yy = -11.62926 + (((tickAnim - 13) / 3) * (-25.59315-(-11.62926)));
            zz = -3.82693 + (((tickAnim - 13) / 3) * (-7.13342-(-3.82693)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -6.11983 + (((tickAnim - 16) / 7) * (-3.36749-(-6.11983)));
            yy = -25.59315 + (((tickAnim - 16) / 7) * (-11.62926-(-25.59315)));
            zz = -7.13342 + (((tickAnim - 16) / 7) * (-3.82693-(-7.13342)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -3.36749 + (((tickAnim - 23) / 7) * (-3.36749-(-3.36749)));
            yy = -11.62926 + (((tickAnim - 23) / 7) * (-11.62926-(-11.62926)));
            zz = -3.82693 + (((tickAnim - 23) / 7) * (-3.82693-(-3.82693)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -3.36749 + (((tickAnim - 30) / 4) * (-6.11983-(-3.36749)));
            yy = -11.62926 + (((tickAnim - 30) / 4) * (-25.59315-(-11.62926)));
            zz = -3.82693 + (((tickAnim - 30) / 4) * (-7.13342-(-3.82693)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -6.11983 + (((tickAnim - 34) / 6) * (-3.36749-(-6.11983)));
            yy = -25.59315 + (((tickAnim - 34) / 6) * (-11.62926-(-25.59315)));
            zz = -7.13342 + (((tickAnim - 34) / 6) * (-3.82693-(-7.13342)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.36749 + (((tickAnim - 40) / 10) * (0-(-3.36749)));
            yy = -11.62926 + (((tickAnim - 40) / 10) * (0-(-11.62926)));
            zz = -3.82693 + (((tickAnim - 40) / 10) * (0-(-3.82693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(xx), rightLowerLeg.rotateAngleY + (float) Math.toRadians(yy), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.03887 + (((tickAnim - 0) / 13) * (-6.232-(-0.03887)));
            yy = 0.18412 + (((tickAnim - 0) / 13) * (6.94123-(0.18412)));
            zz = 0.95456 + (((tickAnim - 0) / 13) * (6.02846-(0.95456)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -6.232 + (((tickAnim - 13) / 3) * (6.11884-(-6.232)));
            yy = 6.94123 + (((tickAnim - 13) / 3) * (16.40455-(6.94123)));
            zz = 6.02846 + (((tickAnim - 13) / 3) * (21.83914-(6.02846)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 6.11884 + (((tickAnim - 16) / 7) * (-6.232-(6.11884)));
            yy = 16.40455 + (((tickAnim - 16) / 7) * (6.94123-(16.40455)));
            zz = 21.83914 + (((tickAnim - 16) / 7) * (6.02846-(21.83914)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -6.232 + (((tickAnim - 23) / 7) * (-6.232-(-6.232)));
            yy = 6.94123 + (((tickAnim - 23) / 7) * (6.94123-(6.94123)));
            zz = 6.02846 + (((tickAnim - 23) / 7) * (6.02846-(6.02846)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -6.232 + (((tickAnim - 30) / 4) * (6.11884-(-6.232)));
            yy = 6.94123 + (((tickAnim - 30) / 4) * (16.40455-(6.94123)));
            zz = 6.02846 + (((tickAnim - 30) / 4) * (21.83914-(6.02846)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 6.11884 + (((tickAnim - 34) / 6) * (-6.232-(6.11884)));
            yy = 16.40455 + (((tickAnim - 34) / 6) * (6.94123-(16.40455)));
            zz = 21.83914 + (((tickAnim - 34) / 6) * (6.02846-(21.83914)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -6.232 + (((tickAnim - 40) / 10) * (-0.03887-(-6.232)));
            yy = 6.94123 + (((tickAnim - 40) / 10) * (0.18412-(6.94123)));
            zz = 6.02846 + (((tickAnim - 40) / 10) * (0.95456-(6.02846)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1.08278-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-3.25221-(0)));
            zz = 3 + (((tickAnim - 0) / 13) * (12.80711-(3)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 1.08278 + (((tickAnim - 13) / 3) * (-1.21904-(1.08278)));
            yy = -3.25221 + (((tickAnim - 13) / 3) * (-10.4152-(-3.25221)));
            zz = 12.80711 + (((tickAnim - 13) / 3) * (17.357-(12.80711)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -1.21904 + (((tickAnim - 16) / 7) * (1.08278-(-1.21904)));
            yy = -10.4152 + (((tickAnim - 16) / 7) * (-3.25221-(-10.4152)));
            zz = 17.357 + (((tickAnim - 16) / 7) * (12.80711-(17.357)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1.08278 + (((tickAnim - 23) / 7) * (1.08278-(1.08278)));
            yy = -3.25221 + (((tickAnim - 23) / 7) * (-3.25221-(-3.25221)));
            zz = 12.80711 + (((tickAnim - 23) / 7) * (12.80711-(12.80711)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 1.08278 + (((tickAnim - 30) / 4) * (-1.21904-(1.08278)));
            yy = -3.25221 + (((tickAnim - 30) / 4) * (-10.4152-(-3.25221)));
            zz = 12.80711 + (((tickAnim - 30) / 4) * (17.357-(12.80711)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -1.21904 + (((tickAnim - 34) / 6) * (1.08278-(-1.21904)));
            yy = -10.4152 + (((tickAnim - 34) / 6) * (-3.25221-(-10.4152)));
            zz = 17.357 + (((tickAnim - 34) / 6) * (12.80711-(17.357)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.08278 + (((tickAnim - 40) / 10) * (0-(1.08278)));
            yy = -3.25221 + (((tickAnim - 40) / 10) * (0-(-3.25221)));
            zz = 12.80711 + (((tickAnim - 40) / 10) * (3-(12.80711)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(xx), leftUpperLeg.rotateAngleY + (float) Math.toRadians(yy), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.36749-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (11.62926-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (3.82693-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -3.36749 + (((tickAnim - 13) / 3) * (-6.11983-(-3.36749)));
            yy = 11.62926 + (((tickAnim - 13) / 3) * (25.59315-(11.62926)));
            zz = 3.82693 + (((tickAnim - 13) / 3) * (7.13342-(3.82693)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -6.11983 + (((tickAnim - 16) / 7) * (-3.36749-(-6.11983)));
            yy = 25.59315 + (((tickAnim - 16) / 7) * (11.62926-(25.59315)));
            zz = 7.13342 + (((tickAnim - 16) / 7) * (3.82693-(7.13342)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -3.36749 + (((tickAnim - 23) / 7) * (-3.36749-(-3.36749)));
            yy = 11.62926 + (((tickAnim - 23) / 7) * (11.62926-(11.62926)));
            zz = 3.82693 + (((tickAnim - 23) / 7) * (3.82693-(3.82693)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -3.36749 + (((tickAnim - 30) / 4) * (-6.11983-(-3.36749)));
            yy = 11.62926 + (((tickAnim - 30) / 4) * (25.59315-(11.62926)));
            zz = 3.82693 + (((tickAnim - 30) / 4) * (7.13342-(3.82693)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -6.11983 + (((tickAnim - 34) / 6) * (-3.36749-(-6.11983)));
            yy = 25.59315 + (((tickAnim - 34) / 6) * (11.62926-(25.59315)));
            zz = 7.13342 + (((tickAnim - 34) / 6) * (3.82693-(7.13342)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.36749 + (((tickAnim - 40) / 10) * (0-(-3.36749)));
            yy = 11.62926 + (((tickAnim - 40) / 10) * (0-(11.62926)));
            zz = 3.82693 + (((tickAnim - 40) / 10) * (0-(3.82693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(xx), leftLowerLeg.rotateAngleY + (float) Math.toRadians(yy), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.03887 + (((tickAnim - 0) / 13) * (-6.232-(-0.03887)));
            yy = -0.18412 + (((tickAnim - 0) / 13) * (-6.94123-(-0.18412)));
            zz = -0.95456 + (((tickAnim - 0) / 13) * (-6.02846-(-0.95456)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -6.232 + (((tickAnim - 13) / 3) * (6.11884-(-6.232)));
            yy = -6.94123 + (((tickAnim - 13) / 3) * (-16.40455-(-6.94123)));
            zz = -6.02846 + (((tickAnim - 13) / 3) * (-21.83914-(-6.02846)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 6.11884 + (((tickAnim - 16) / 7) * (-6.232-(6.11884)));
            yy = -16.40455 + (((tickAnim - 16) / 7) * (-6.94123-(-16.40455)));
            zz = -21.83914 + (((tickAnim - 16) / 7) * (-6.02846-(-21.83914)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -6.232 + (((tickAnim - 23) / 7) * (-6.232-(-6.232)));
            yy = -6.94123 + (((tickAnim - 23) / 7) * (-6.94123-(-6.94123)));
            zz = -6.02846 + (((tickAnim - 23) / 7) * (-6.02846-(-6.02846)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -6.232 + (((tickAnim - 30) / 4) * (6.11884-(-6.232)));
            yy = -6.94123 + (((tickAnim - 30) / 4) * (-16.40455-(-6.94123)));
            zz = -6.02846 + (((tickAnim - 30) / 4) * (-21.83914-(-6.02846)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 6.11884 + (((tickAnim - 34) / 6) * (-6.232-(6.11884)));
            yy = -16.40455 + (((tickAnim - 34) / 6) * (-6.94123-(-16.40455)));
            zz = -21.83914 + (((tickAnim - 34) / 6) * (-6.02846-(-21.83914)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -6.232 + (((tickAnim - 40) / 10) * (-0.03887-(-6.232)));
            yy = -6.94123 + (((tickAnim - 40) / 10) * (-0.18412-(-6.94123)));
            zz = -6.02846 + (((tickAnim - 40) / 10) * (-0.95456-(-6.02846)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 5) / 3) * (4.89-(1)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 4.89 + (((tickAnim - 8) / 5) * (13-(4.89)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 13 + (((tickAnim - 13) / 4) * (16-(13)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 16 + (((tickAnim - 17) / 6) * (16-(16)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 16 + (((tickAnim - 23) / 14) * (-1.27-(16)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -1.27 + (((tickAnim - 37) / 6) * (-4.71-(-1.27)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.71 + (((tickAnim - 43) / 7) * (0-(-4.71)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (0.33333-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.33333 + (((tickAnim - 8) / 5) * (-4-(0.33333)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -4 + (((tickAnim - 13) / 4) * (3-(-4)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 3 + (((tickAnim - 17) / 6) * (3-(3)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 3 + (((tickAnim - 23) / 14) * (-6.36-(3)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -6.36 + (((tickAnim - 37) / 6) * (0.42-(-6.36)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0.42 + (((tickAnim - 43) / 7) * (0-(0.42)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.60128-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.01417-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.14908-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.60128 + (((tickAnim - 5) / 3) * (-12.33501-(-1.60128)));
            yy = -0.01417 + (((tickAnim - 5) / 3) * (-0.02112-(-0.01417)));
            zz = -0.14908 + (((tickAnim - 5) / 3) * (-0.19619-(-0.14908)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -12.33501 + (((tickAnim - 8) / 5) * (-9.0012-(-12.33501)));
            yy = -0.02112 + (((tickAnim - 8) / 5) * (-0.00973-(-0.02112)));
            zz = -0.19619 + (((tickAnim - 8) / 5) * (-0.13919-(-0.19619)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -9.0012 + (((tickAnim - 13) / 4) * (-3.0012-(-9.0012)));
            yy = -0.00973 + (((tickAnim - 13) / 4) * (-0.00973-(-0.00973)));
            zz = -0.13919 + (((tickAnim - 13) / 4) * (-0.13919-(-0.13919)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -3.0012 + (((tickAnim - 17) / 6) * (-3.0012-(-3.0012)));
            yy = -0.00973 + (((tickAnim - 17) / 6) * (-0.00973-(-0.00973)));
            zz = -0.13919 + (((tickAnim - 17) / 6) * (-0.13919-(-0.13919)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -3.0012 + (((tickAnim - 23) / 13) * (10.36298-(-3.0012)));
            yy = -0.00973 + (((tickAnim - 23) / 13) * (-0.00531-(-0.00973)));
            zz = -0.13919 + (((tickAnim - 23) / 13) * (-0.07592-(-0.13919)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 10.36298 + (((tickAnim - 36) / 7) * (2.48628-(10.36298)));
            yy = -0.00531 + (((tickAnim - 36) / 7) * (-0.00281-(-0.00531)));
            zz = -0.07592 + (((tickAnim - 36) / 7) * (-0.04019-(-0.07592)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 2.48628 + (((tickAnim - 43) / 7) * (0-(2.48628)));
            yy = -0.00281 + (((tickAnim - 43) / 7) * (0-(-0.00281)));
            zz = -0.04019 + (((tickAnim - 43) / 7) * (0-(-0.04019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.00047-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.00501-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.05225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.00047 + (((tickAnim - 5) / 3) * (-0.99876-(2.00047)));
            yy = -0.00501 + (((tickAnim - 5) / 3) * (-0.01476-(-0.00501)));
            zz = -0.05225 + (((tickAnim - 5) / 3) * (-0.13862-(-0.05225)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.99876 + (((tickAnim - 8) / 5) * (-8.99815-(-0.99876)));
            yy = -0.01476 + (((tickAnim - 8) / 5) * (-0.02185-(-0.01476)));
            zz = -0.13862 + (((tickAnim - 8) / 5) * (-0.2079-(-0.13862)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -8.99815 + (((tickAnim - 13) / 4) * (-6.99939-(-8.99815)));
            yy = -0.02185 + (((tickAnim - 13) / 4) * (-0.00244-(-0.02185)));
            zz = -0.2079 + (((tickAnim - 13) / 4) * (-0.06975-(-0.2079)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -6.99939 + (((tickAnim - 17) / 6) * (-6.99939-(-6.99939)));
            yy = -0.00244 + (((tickAnim - 17) / 6) * (-0.00244-(-0.00244)));
            zz = -0.06975 + (((tickAnim - 17) / 6) * (-0.06975-(-0.06975)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -6.99939 + (((tickAnim - 23) / 13) * (4.18215-(-6.99939)));
            yy = -0.00244 + (((tickAnim - 23) / 13) * (-0.00133-(-0.00244)));
            zz = -0.06975 + (((tickAnim - 23) / 13) * (-0.03805-(-0.06975)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 4.18215 + (((tickAnim - 36) / 7) * (5.21408-(4.18215)));
            yy = -0.00133 + (((tickAnim - 36) / 7) * (-0.0007-(-0.00133)));
            zz = -0.03805 + (((tickAnim - 36) / 7) * (-0.02014-(-0.03805)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 5.21408 + (((tickAnim - 43) / 7) * (0-(5.21408)));
            yy = -0.0007 + (((tickAnim - 43) / 7) * (0-(-0.0007)));
            zz = -0.02014 + (((tickAnim - 43) / 7) * (0-(-0.02014)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.19835-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.03606-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.18933-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.19835 + (((tickAnim - 5) / 3) * (4.77576-(0.19835)));
            yy = -0.03606 + (((tickAnim - 5) / 3) * (-0.07001-(-0.03606)));
            zz = 0.18933 + (((tickAnim - 5) / 3) * (0.22362-(0.18933)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 4.77576 + (((tickAnim - 8) / 5) * (-13.997-(4.77576)));
            yy = -0.07001 + (((tickAnim - 8) / 5) * (-0.05447-(-0.07001)));
            zz = 0.22362 + (((tickAnim - 8) / 5) * (-0.32555-(0.22362)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -13.997 + (((tickAnim - 13) / 4) * (-14.99846-(-13.997)));
            yy = -0.05447 + (((tickAnim - 13) / 4) * (-0.01519-(-0.05447)));
            zz = -0.32555 + (((tickAnim - 13) / 4) * (-0.17364-(-0.32555)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -14.99846 + (((tickAnim - 17) / 6) * (-14.99846-(-14.99846)));
            yy = -0.01519 + (((tickAnim - 17) / 6) * (-0.01519-(-0.01519)));
            zz = -0.17364 + (((tickAnim - 17) / 6) * (-0.17364-(-0.17364)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -14.99846 + (((tickAnim - 23) / 14) * (3.81902-(-14.99846)));
            yy = -0.01519 + (((tickAnim - 23) / 14) * (-0.00828-(-0.01519)));
            zz = -0.17364 + (((tickAnim - 23) / 14) * (-0.09471-(-0.17364)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 3.81902 + (((tickAnim - 37) / 6) * (7.1482-(3.81902)));
            yy = -0.00828 + (((tickAnim - 37) / 6) * (-0.00466-(-0.00828)));
            zz = -0.09471 + (((tickAnim - 37) / 6) * (-0.05328-(-0.09471)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 7.1482 + (((tickAnim - 43) / 7) * (0-(7.1482)));
            yy = -0.00466 + (((tickAnim - 43) / 7) * (0-(-0.00466)));
            zz = -0.05328 + (((tickAnim - 43) / 7) * (0-(-0.05328)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDig(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnkylosphenodon entity = (EntityPrehistoricFloraAnkylosphenodon) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (-1.28033-(1)));
            yy = 0 + (((tickAnim - 0) / 5) * (5.99022-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-4.01954-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -1.28033 + (((tickAnim - 5) / 4) * (-1.14089-(-1.28033)));
            yy = 5.99022 + (((tickAnim - 5) / 4) * (2.95958-(5.99022)));
            zz = -4.01954 + (((tickAnim - 5) / 4) * (-2.06175-(-4.01954)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -1.14089 + (((tickAnim - 9) / 8) * (1-(-1.14089)));
            yy = 2.95958 + (((tickAnim - 9) / 8) * (0-(2.95958)));
            zz = -2.06175 + (((tickAnim - 9) / 8) * (0-(-2.06175)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 17) / 7) * (-1.28033-(1)));
            yy = 0 + (((tickAnim - 17) / 7) * (5.99022-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (-4.01954-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -1.28033 + (((tickAnim - 24) / 4) * (-1.14089-(-1.28033)));
            yy = 5.99022 + (((tickAnim - 24) / 4) * (2.95958-(5.99022)));
            zz = -4.01954 + (((tickAnim - 24) / 4) * (-2.06175-(-4.01954)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -1.14089 + (((tickAnim - 28) / 8) * (1-(-1.14089)));
            yy = 2.95958 + (((tickAnim - 28) / 8) * (0-(2.95958)));
            zz = -2.06175 + (((tickAnim - 28) / 8) * (0-(-2.06175)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 36) / 9) * (1-(1)));
            yy = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 0) / 5) * (3.35343-(3)));
            yy = 0 + (((tickAnim - 0) / 5) * (-18.12047-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5.96274-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 3.35343 + (((tickAnim - 5) / 4) * (5.19907-(3.35343)));
            yy = -18.12047 + (((tickAnim - 5) / 4) * (-9.09053-(-18.12047)));
            zz = 5.96274 + (((tickAnim - 5) / 4) * (2.76696-(5.96274)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 5.19907 + (((tickAnim - 9) / 8) * (3-(5.19907)));
            yy = -9.09053 + (((tickAnim - 9) / 8) * (0-(-9.09053)));
            zz = 2.76696 + (((tickAnim - 9) / 8) * (0-(2.76696)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 3 + (((tickAnim - 17) / 7) * (3.35343-(3)));
            yy = 0 + (((tickAnim - 17) / 7) * (-18.12047-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (5.96274-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 3.35343 + (((tickAnim - 24) / 4) * (5.19907-(3.35343)));
            yy = -18.12047 + (((tickAnim - 24) / 4) * (-9.09053-(-18.12047)));
            zz = 5.96274 + (((tickAnim - 24) / 4) * (2.76696-(5.96274)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 5.19907 + (((tickAnim - 28) / 8) * (3-(5.19907)));
            yy = -9.09053 + (((tickAnim - 28) / 8) * (0-(-9.09053)));
            zz = 2.76696 + (((tickAnim - 28) / 8) * (0-(2.76696)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 3 + (((tickAnim - 36) / 9) * (3-(3)));
            yy = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.3031-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.26627-(0)));
            zz = -16 + (((tickAnim - 0) / 3) * (-23.96812-(-16)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.3031 + (((tickAnim - 3) / 2) * (26.0099-(6.3031)));
            yy = 0.26627 + (((tickAnim - 3) / 2) * (-15.71235-(0.26627)));
            zz = -23.96812 + (((tickAnim - 3) / 2) * (-39.24592-(-23.96812)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 26.0099 + (((tickAnim - 5) / 3) * (15.34448-(26.0099)));
            yy = -15.71235 + (((tickAnim - 5) / 3) * (-10.17184-(-15.71235)));
            zz = -39.24592 + (((tickAnim - 5) / 3) * (-38.86411-(-39.24592)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15.34448 + (((tickAnim - 8) / 2) * (11.80628-(15.34448)));
            yy = -10.17184 + (((tickAnim - 8) / 2) * (-8.61855-(-10.17184)));
            zz = -38.86411 + (((tickAnim - 8) / 2) * (-39.79587-(-38.86411)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 11.80628 + (((tickAnim - 10) / 3) * (-1.35278-(11.80628)));
            yy = -8.61855 + (((tickAnim - 10) / 3) * (5.72104-(-8.61855)));
            zz = -39.79587 + (((tickAnim - 10) / 3) * (-33.90378-(-39.79587)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1.35278 + (((tickAnim - 13) / 2) * (-5.42519-(-1.35278)));
            yy = 5.72104 + (((tickAnim - 13) / 2) * (12.77148-(5.72104)));
            zz = -33.90378 + (((tickAnim - 13) / 2) * (-26.29208-(-33.90378)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -5.42519 + (((tickAnim - 15) / 3) * (0-(-5.42519)));
            yy = 12.77148 + (((tickAnim - 15) / 3) * (0-(12.77148)));
            zz = -26.29208 + (((tickAnim - 15) / 3) * (-16-(-26.29208)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (6.3031-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.26627-(0)));
            zz = -16 + (((tickAnim - 18) / 5) * (-23.96812-(-16)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 6.3031 + (((tickAnim - 23) / 1) * (26.0099-(6.3031)));
            yy = 0.26627 + (((tickAnim - 23) / 1) * (-15.71235-(0.26627)));
            zz = -23.96812 + (((tickAnim - 23) / 1) * (-39.24592-(-23.96812)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 26.0099 + (((tickAnim - 24) / 4) * (15.34448-(26.0099)));
            yy = -15.71235 + (((tickAnim - 24) / 4) * (-10.17184-(-15.71235)));
            zz = -39.24592 + (((tickAnim - 24) / 4) * (-38.86411-(-39.24592)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 15.34448 + (((tickAnim - 28) / 1) * (11.80628-(15.34448)));
            yy = -10.17184 + (((tickAnim - 28) / 1) * (-8.61855-(-10.17184)));
            zz = -38.86411 + (((tickAnim - 28) / 1) * (-39.79587-(-38.86411)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 11.80628 + (((tickAnim - 29) / 4) * (-1.35278-(11.80628)));
            yy = -8.61855 + (((tickAnim - 29) / 4) * (5.72104-(-8.61855)));
            zz = -39.79587 + (((tickAnim - 29) / 4) * (-33.90378-(-39.79587)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -1.35278 + (((tickAnim - 33) / 1) * (-5.42519-(-1.35278)));
            yy = 5.72104 + (((tickAnim - 33) / 1) * (12.77148-(5.72104)));
            zz = -33.90378 + (((tickAnim - 33) / 1) * (-26.29208-(-33.90378)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -5.42519 + (((tickAnim - 34) / 4) * (0-(-5.42519)));
            yy = 12.77148 + (((tickAnim - 34) / 4) * (0-(12.77148)));
            zz = -26.29208 + (((tickAnim - 34) / 4) * (-16-(-26.29208)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = -16 + (((tickAnim - 38) / 7) * (-16-(-16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14 + (((tickAnim - 0) / 3) * (0.58783-(14)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.95437-(0)));
            zz = 17 + (((tickAnim - 0) / 3) * (22.7345-(17)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.58783 + (((tickAnim - 3) / 2) * (61.82562-(0.58783)));
            yy = -1.95437 + (((tickAnim - 3) / 2) * (-10.70684-(-1.95437)));
            zz = 22.7345 + (((tickAnim - 3) / 2) * (-33.52706-(22.7345)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 61.82562 + (((tickAnim - 5) / 3) * (34.22308-(61.82562)));
            yy = -10.70684 + (((tickAnim - 5) / 3) * (-20.56208-(-10.70684)));
            zz = -33.52706 + (((tickAnim - 5) / 3) * (-41.54182-(-33.52706)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 34.22308 + (((tickAnim - 8) / 2) * (31.46112-(34.22308)));
            yy = -20.56208 + (((tickAnim - 8) / 2) * (-15.62481-(-20.56208)));
            zz = -41.54182 + (((tickAnim - 8) / 2) * (-28.89224-(-41.54182)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 31.46112 + (((tickAnim - 10) / 3) * (-3.99147-(31.46112)));
            yy = -15.62481 + (((tickAnim - 10) / 3) * (13.35818-(-15.62481)));
            zz = -28.89224 + (((tickAnim - 10) / 3) * (15.49776-(-28.89224)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -3.99147 + (((tickAnim - 13) / 2) * (-11.98955-(-3.99147)));
            yy = 13.35818 + (((tickAnim - 13) / 2) * (8.95955-(13.35818)));
            zz = 15.49776 + (((tickAnim - 13) / 2) * (22.07984-(15.49776)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -11.98955 + (((tickAnim - 15) / 3) * (14-(-11.98955)));
            yy = 8.95955 + (((tickAnim - 15) / 3) * (0-(8.95955)));
            zz = 22.07984 + (((tickAnim - 15) / 3) * (17-(22.07984)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 14 + (((tickAnim - 18) / 5) * (0.58783-(14)));
            yy = 0 + (((tickAnim - 18) / 5) * (-1.95437-(0)));
            zz = 17 + (((tickAnim - 18) / 5) * (22.7345-(17)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0.58783 + (((tickAnim - 23) / 1) * (61.82562-(0.58783)));
            yy = -1.95437 + (((tickAnim - 23) / 1) * (-10.70684-(-1.95437)));
            zz = 22.7345 + (((tickAnim - 23) / 1) * (-33.52706-(22.7345)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 61.82562 + (((tickAnim - 24) / 4) * (34.22308-(61.82562)));
            yy = -10.70684 + (((tickAnim - 24) / 4) * (-20.56208-(-10.70684)));
            zz = -33.52706 + (((tickAnim - 24) / 4) * (-41.54182-(-33.52706)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 34.22308 + (((tickAnim - 28) / 1) * (31.46112-(34.22308)));
            yy = -20.56208 + (((tickAnim - 28) / 1) * (-15.62481-(-20.56208)));
            zz = -41.54182 + (((tickAnim - 28) / 1) * (-28.89224-(-41.54182)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 31.46112 + (((tickAnim - 29) / 4) * (-3.99147-(31.46112)));
            yy = -15.62481 + (((tickAnim - 29) / 4) * (13.35818-(-15.62481)));
            zz = -28.89224 + (((tickAnim - 29) / 4) * (15.49776-(-28.89224)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -3.99147 + (((tickAnim - 33) / 1) * (-11.98955-(-3.99147)));
            yy = 13.35818 + (((tickAnim - 33) / 1) * (8.95955-(13.35818)));
            zz = 15.49776 + (((tickAnim - 33) / 1) * (22.07984-(15.49776)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -11.98955 + (((tickAnim - 34) / 4) * (14-(-11.98955)));
            yy = 8.95955 + (((tickAnim - 34) / 4) * (0-(8.95955)));
            zz = 22.07984 + (((tickAnim - 34) / 4) * (17-(22.07984)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 14 + (((tickAnim - 38) / 7) * (14-(14)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 17 + (((tickAnim - 38) / 7) * (17-(17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(xx), leftLowerArm.rotateAngleY + (float) Math.toRadians(yy), leftLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.69251 + (((tickAnim - 0) / 3) * (11.60616-(-11.69251)));
            yy = 4.54877 + (((tickAnim - 0) / 3) * (1.67052-(4.54877)));
            zz = -5.96389 + (((tickAnim - 0) / 3) * (0.47268-(-5.96389)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 11.60616 + (((tickAnim - 3) / 2) * (28.81868-(11.60616)));
            yy = 1.67052 + (((tickAnim - 3) / 2) * (9.18958-(1.67052)));
            zz = 0.47268 + (((tickAnim - 3) / 2) * (-16.64456-(0.47268)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 28.81868 + (((tickAnim - 5) / 3) * (28.1363-(28.81868)));
            yy = 9.18958 + (((tickAnim - 5) / 3) * (-35.45216-(9.18958)));
            zz = -16.64456 + (((tickAnim - 5) / 3) * (3.63594-(-16.64456)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 28.1363 + (((tickAnim - 8) / 5) * (4.0662-(28.1363)));
            yy = -35.45216 + (((tickAnim - 8) / 5) * (-8.68091-(-35.45216)));
            zz = 3.63594 + (((tickAnim - 8) / 5) * (-1.45388-(3.63594)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 4.0662 + (((tickAnim - 13) / 5) * (-11.69251-(4.0662)));
            yy = -8.68091 + (((tickAnim - 13) / 5) * (4.54877-(-8.68091)));
            zz = -1.45388 + (((tickAnim - 13) / 5) * (-5.96389-(-1.45388)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -11.69251 + (((tickAnim - 18) / 5) * (11.60616-(-11.69251)));
            yy = 4.54877 + (((tickAnim - 18) / 5) * (1.67052-(4.54877)));
            zz = -5.96389 + (((tickAnim - 18) / 5) * (0.47268-(-5.96389)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 11.60616 + (((tickAnim - 23) / 1) * (28.81868-(11.60616)));
            yy = 1.67052 + (((tickAnim - 23) / 1) * (9.18958-(1.67052)));
            zz = 0.47268 + (((tickAnim - 23) / 1) * (-16.64456-(0.47268)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 28.81868 + (((tickAnim - 24) / 4) * (28.1363-(28.81868)));
            yy = 9.18958 + (((tickAnim - 24) / 4) * (-35.45216-(9.18958)));
            zz = -16.64456 + (((tickAnim - 24) / 4) * (3.63594-(-16.64456)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 28.1363 + (((tickAnim - 28) / 5) * (4.0662-(28.1363)));
            yy = -35.45216 + (((tickAnim - 28) / 5) * (-8.68091-(-35.45216)));
            zz = 3.63594 + (((tickAnim - 28) / 5) * (-1.45388-(3.63594)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 4.0662 + (((tickAnim - 33) / 5) * (-11.69251-(4.0662)));
            yy = -8.68091 + (((tickAnim - 33) / 5) * (4.54877-(-8.68091)));
            zz = -1.45388 + (((tickAnim - 33) / 5) * (-5.96389-(-1.45388)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -11.69251 + (((tickAnim - 38) / 7) * (-11.69251-(-11.69251)));
            yy = 4.54877 + (((tickAnim - 38) / 7) * (4.54877-(4.54877)));
            zz = -5.96389 + (((tickAnim - 38) / 7) * (-5.96389-(-5.96389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.14998 + (((tickAnim - 0) / 5) * (0.8916-(-0.14998)));
            yy = -0.39055 + (((tickAnim - 0) / 5) * (15.22834-(-0.39055)));
            zz = 18.01248 + (((tickAnim - 0) / 5) * (5.49057-(18.01248)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = 0.8916 + (((tickAnim - 5) / 12) * (-0.14998-(0.8916)));
            yy = 15.22834 + (((tickAnim - 5) / 12) * (-0.39055-(15.22834)));
            zz = 5.49057 + (((tickAnim - 5) / 12) * (18.01248-(5.49057)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -0.14998 + (((tickAnim - 17) / 6) * (0.8916-(-0.14998)));
            yy = -0.39055 + (((tickAnim - 17) / 6) * (15.22834-(-0.39055)));
            zz = 18.01248 + (((tickAnim - 17) / 6) * (5.49057-(18.01248)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0.8916 + (((tickAnim - 23) / 11) * (-0.14998-(0.8916)));
            yy = 15.22834 + (((tickAnim - 23) / 11) * (-0.39055-(15.22834)));
            zz = 5.49057 + (((tickAnim - 23) / 11) * (18.01248-(5.49057)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = -0.14998 + (((tickAnim - 34) / 11) * (-0.14998-(-0.14998)));
            yy = -0.39055 + (((tickAnim - 34) / 11) * (-0.39055-(-0.39055)));
            zz = 18.01248 + (((tickAnim - 34) / 11) * (18.01248-(18.01248)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 23.18366 + (((tickAnim - 0) / 5) * (24.89396-(23.18366)));
            yy = -0.72839 + (((tickAnim - 0) / 5) * (-0.59165-(-0.72839)));
            zz = -11.36129 + (((tickAnim - 0) / 5) * (-13.28589-(-11.36129)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = 24.89396 + (((tickAnim - 5) / 12) * (23.18366-(24.89396)));
            yy = -0.59165 + (((tickAnim - 5) / 12) * (-0.72839-(-0.59165)));
            zz = -13.28589 + (((tickAnim - 5) / 12) * (-11.36129-(-13.28589)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 23.18366 + (((tickAnim - 17) / 6) * (24.89396-(23.18366)));
            yy = -0.72839 + (((tickAnim - 17) / 6) * (-0.59165-(-0.72839)));
            zz = -11.36129 + (((tickAnim - 17) / 6) * (-13.28589-(-11.36129)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 24.89396 + (((tickAnim - 23) / 11) * (23.18366-(24.89396)));
            yy = -0.59165 + (((tickAnim - 23) / 11) * (-0.72839-(-0.59165)));
            zz = -13.28589 + (((tickAnim - 23) / 11) * (-11.36129-(-13.28589)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 23.18366 + (((tickAnim - 34) / 11) * (23.18366-(23.18366)));
            yy = -0.72839 + (((tickAnim - 34) / 11) * (-0.72839-(-0.72839)));
            zz = -11.36129 + (((tickAnim - 34) / 11) * (-11.36129-(-11.36129)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(xx), rightLowerArm.rotateAngleY + (float) Math.toRadians(yy), rightLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -17.41909 + (((tickAnim - 0) / 5) * (-27.80989-(-17.41909)));
            yy = -2.47686 + (((tickAnim - 0) / 5) * (-14.13703-(-2.47686)));
            zz = 2.96893 + (((tickAnim - 0) / 5) * (14.12866-(2.96893)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = -27.80989 + (((tickAnim - 5) / 12) * (-17.41909-(-27.80989)));
            yy = -14.13703 + (((tickAnim - 5) / 12) * (-2.47686-(-14.13703)));
            zz = 14.12866 + (((tickAnim - 5) / 12) * (2.96893-(14.12866)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -17.41909 + (((tickAnim - 17) / 6) * (-27.80989-(-17.41909)));
            yy = -2.47686 + (((tickAnim - 17) / 6) * (-14.13703-(-2.47686)));
            zz = 2.96893 + (((tickAnim - 17) / 6) * (14.12866-(2.96893)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -27.80989 + (((tickAnim - 23) / 11) * (-17.41909-(-27.80989)));
            yy = -14.13703 + (((tickAnim - 23) / 11) * (-2.47686-(-14.13703)));
            zz = 14.12866 + (((tickAnim - 23) / 11) * (2.96893-(14.12866)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = -17.41909 + (((tickAnim - 34) / 11) * (-17.41909-(-17.41909)));
            yy = -2.47686 + (((tickAnim - 34) / 11) * (-2.47686-(-2.47686)));
            zz = 2.96893 + (((tickAnim - 34) / 11) * (2.96893-(2.96893)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 0) / 5) * (9.80558-(5)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5.1839-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.50215-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 9.80558 + (((tickAnim - 5) / 5) * (9.2646-(9.80558)));
            yy = -5.1839 + (((tickAnim - 5) / 5) * (-5.65062-(-5.1839)));
            zz = -0.50215 + (((tickAnim - 5) / 5) * (-6.40864-(-0.50215)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 9.2646 + (((tickAnim - 10) / 3) * (9.5111-(9.2646)));
            yy = -5.65062 + (((tickAnim - 10) / 3) * (-5.05617-(-5.65062)));
            zz = -6.40864 + (((tickAnim - 10) / 3) * (-4.61621-(-6.40864)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 9.5111 + (((tickAnim - 13) / 5) * (11.85434-(9.5111)));
            yy = -5.05617 + (((tickAnim - 13) / 5) * (-4.93776-(-5.05617)));
            zz = -4.61621 + (((tickAnim - 13) / 5) * (-1.65819-(-4.61621)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 11.85434 + (((tickAnim - 18) / 5) * (9.80558-(11.85434)));
            yy = -4.93776 + (((tickAnim - 18) / 5) * (-5.1839-(-4.93776)));
            zz = -1.65819 + (((tickAnim - 18) / 5) * (-0.50215-(-1.65819)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 9.80558 + (((tickAnim - 23) / 5) * (9.2646-(9.80558)));
            yy = -5.1839 + (((tickAnim - 23) / 5) * (-5.65062-(-5.1839)));
            zz = -0.50215 + (((tickAnim - 23) / 5) * (-6.40864-(-0.50215)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 9.2646 + (((tickAnim - 28) / 3) * (6.5111-(9.2646)));
            yy = -5.65062 + (((tickAnim - 28) / 3) * (-5.05617-(-5.65062)));
            zz = -6.40864 + (((tickAnim - 28) / 3) * (-4.61621-(-6.40864)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 6.5111 + (((tickAnim - 31) / 4) * (4.85434-(6.5111)));
            yy = -5.05617 + (((tickAnim - 31) / 4) * (-4.93776-(-5.05617)));
            zz = -4.61621 + (((tickAnim - 31) / 4) * (-1.65819-(-4.61621)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 4.85434 + (((tickAnim - 35) / 10) * (5-(4.85434)));
            yy = -4.93776 + (((tickAnim - 35) / 10) * (0-(-4.93776)));
            zz = -1.65819 + (((tickAnim - 35) / 10) * (0-(-1.65819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 0) / 5) * (4.91409-(5)));
            yy = 0 + (((tickAnim - 0) / 5) * (14.60818-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.42526-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 4.91409 + (((tickAnim - 5) / 4) * (6.77212-(4.91409)));
            yy = 14.60818 + (((tickAnim - 5) / 4) * (16.7346-(14.60818)));
            zz = -3.42526 + (((tickAnim - 5) / 4) * (5.63788-(-3.42526)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 6.77212 + (((tickAnim - 9) / 4) * (5.29011-(6.77212)));
            yy = 16.7346 + (((tickAnim - 9) / 4) * (14.72029-(16.7346)));
            zz = 5.63788 + (((tickAnim - 9) / 4) * (-2.88716-(5.63788)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 5.29011 + (((tickAnim - 13) / 5) * (4.91409-(5.29011)));
            yy = 14.72029 + (((tickAnim - 13) / 5) * (14.60818-(14.72029)));
            zz = -2.88716 + (((tickAnim - 13) / 5) * (-3.42526-(-2.88716)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 4.91409 + (((tickAnim - 18) / 5) * (4.91409-(4.91409)));
            yy = 14.60818 + (((tickAnim - 18) / 5) * (14.60818-(14.60818)));
            zz = -3.42526 + (((tickAnim - 18) / 5) * (-3.42526-(-3.42526)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 4.91409 + (((tickAnim - 23) / 4) * (6.77212-(4.91409)));
            yy = 14.60818 + (((tickAnim - 23) / 4) * (16.7346-(14.60818)));
            zz = -3.42526 + (((tickAnim - 23) / 4) * (5.63788-(-3.42526)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 6.77212 + (((tickAnim - 27) / 4) * (5.29011-(6.77212)));
            yy = 16.7346 + (((tickAnim - 27) / 4) * (14.72029-(16.7346)));
            zz = 5.63788 + (((tickAnim - 27) / 4) * (-2.88716-(5.63788)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 5.29011 + (((tickAnim - 31) / 4) * (4.91409-(5.29011)));
            yy = 14.72029 + (((tickAnim - 31) / 4) * (14.60818-(14.72029)));
            zz = -2.88716 + (((tickAnim - 31) / 4) * (-3.42526-(-2.88716)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 4.91409 + (((tickAnim - 35) / 6) * (9.96421-(4.91409)));
            yy = 14.60818 + (((tickAnim - 35) / 6) * (6.08674-(14.60818)));
            zz = -3.42526 + (((tickAnim - 35) / 6) * (-1.42719-(-3.42526)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 9.96421 + (((tickAnim - 41) / 4) * (5-(9.96421)));
            yy = 6.08674 + (((tickAnim - 41) / 4) * (0-(6.08674)));
            zz = -1.42719 + (((tickAnim - 41) / 4) * (0-(-1.42719)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 8 + (((tickAnim - 0) / 5) * (-0.99034-(8)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.326-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.236-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.99034 + (((tickAnim - 5) / 5) * (-1.65306-(-0.99034)));
            yy = 0.326 + (((tickAnim - 5) / 5) * (-10.02353-(0.326)));
            zz = 0.236 + (((tickAnim - 5) / 5) * (3.96502-(0.236)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -1.65306 + (((tickAnim - 10) / 7) * (-5.02498-(-1.65306)));
            yy = -10.02353 + (((tickAnim - 10) / 7) * (-8.81149-(-10.02353)));
            zz = 3.96502 + (((tickAnim - 10) / 7) * (2.93844-(3.96502)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -5.02498 + (((tickAnim - 17) / 5) * (-0.99034-(-5.02498)));
            yy = -8.81149 + (((tickAnim - 17) / 5) * (0.326-(-8.81149)));
            zz = 2.93844 + (((tickAnim - 17) / 5) * (0.236-(2.93844)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -0.99034 + (((tickAnim - 22) / 5) * (-1.65306-(-0.99034)));
            yy = 0.326 + (((tickAnim - 22) / 5) * (-10.02353-(0.326)));
            zz = 0.236 + (((tickAnim - 22) / 5) * (3.96502-(0.236)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -1.65306 + (((tickAnim - 27) / 6) * (-5.02498-(-1.65306)));
            yy = -10.02353 + (((tickAnim - 27) / 6) * (-8.81149-(-10.02353)));
            zz = 3.96502 + (((tickAnim - 27) / 6) * (2.93844-(3.96502)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -5.02498 + (((tickAnim - 33) / 5) * (8.40458-(-5.02498)));
            yy = -8.81149 + (((tickAnim - 33) / 5) * (-5.66453-(-8.81149)));
            zz = 2.93844 + (((tickAnim - 33) / 5) * (1.889-(2.93844)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 8.40458 + (((tickAnim - 38) / 3) * (8.34822-(8.40458)));
            yy = -5.66453 + (((tickAnim - 38) / 3) * (-3.14696-(-5.66453)));
            zz = 1.889 + (((tickAnim - 38) / 3) * (1.04944-(1.889)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 8.34822 + (((tickAnim - 41) / 4) * (8-(8.34822)));
            yy = -3.14696 + (((tickAnim - 41) / 4) * (0-(-3.14696)));
            zz = 1.04944 + (((tickAnim - 41) / 4) * (0-(1.04944)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSneeze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnkylosphenodon entity = (EntityPrehistoricFloraAnkylosphenodon) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.2-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 3) * (0-(0.2)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 11) / 2) * (-2-(-2)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -2 + (((tickAnim - 13) / 4) * (-3-(-2)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -3 + (((tickAnim - 17) / 2) * (-2.5-(-3)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (1-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -2.5 + (((tickAnim - 19) / 3) * (-2-(-2.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 1 + (((tickAnim - 19) / 3) * (0-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -2 + (((tickAnim - 22) / 4) * (0-(-2)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 2 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 2) / 11) * (-3-(0)));
            yy = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 11) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -3 + (((tickAnim - 13) / 0) * (-3-(-3)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -3 + (((tickAnim - 13) / 4) * (0-(-3)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (1.99962-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0.04362-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (-0.99905-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 1.99962 + (((tickAnim - 19) / 3) * (-2-(1.99962)));
            yy = 0.04362 + (((tickAnim - 19) / 3) * (0-(0.04362)));
            zz = -0.99905 + (((tickAnim - 19) / 3) * (0-(-0.99905)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -2 + (((tickAnim - 22) / 2) * (2.59978-(-2)));
            yy = 0 + (((tickAnim - 22) / 2) * (0.04485-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (-0.59833-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 2.59978 + (((tickAnim - 24) / 6) * (0-(2.59978)));
            yy = 0.04485 + (((tickAnim - 24) / 6) * (0-(0.04485)));
            zz = -0.59833 + (((tickAnim - 24) / 6) * (0-(-0.59833)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 4.5257 + (((tickAnim - 0) / 12) * (4.54134-(4.5257)));
            yy = -11.0968 + (((tickAnim - 0) / 12) * (-12.58719-(-11.0968)));
            zz = -9.5538 + (((tickAnim - 0) / 12) * (8.38142-(-9.5538)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 4.54134 + (((tickAnim - 12) / 6) * (4.5164-(4.54134)));
            yy = -12.58719 + (((tickAnim - 12) / 6) * (-12.37103-(-12.58719)));
            zz = 8.38142 + (((tickAnim - 12) / 6) * (5.62296-(8.38142)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 4.5164 + (((tickAnim - 18) / 4) * (3.86419-(4.5164)));
            yy = -12.37103 + (((tickAnim - 18) / 4) * (-15.40472-(-12.37103)));
            zz = 5.62296 + (((tickAnim - 18) / 4) * (11.17381-(5.62296)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 3.86419 + (((tickAnim - 22) / 1) * (4.5049-(3.86419)));
            yy = -15.40472 + (((tickAnim - 22) / 1) * (-12.13138-(-15.40472)));
            zz = 11.17381 + (((tickAnim - 22) / 1) * (0.03254-(11.17381)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 4.5049 + (((tickAnim - 23) / 2) * (4.54474-(4.5049)));
            yy = -12.13138 + (((tickAnim - 23) / 2) * (-11.79842-(-12.13138)));
            zz = 0.03254 + (((tickAnim - 23) / 2) * (-9.1631-(0.03254)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.54474 + (((tickAnim - 25) / 5) * (4.5257-(4.54474)));
            yy = -11.79842 + (((tickAnim - 25) / 5) * (-11.0968-(-11.79842)));
            zz = -9.1631 + (((tickAnim - 25) / 5) * (-9.5538-(-9.1631)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 2.71103 + (((tickAnim - 0) / 12) * (-2.73473-(2.71103)));
            yy = -11.02309 + (((tickAnim - 0) / 12) * (-7.14739-(-11.02309)));
            zz = 44.45599 + (((tickAnim - 0) / 12) * (25.11591-(44.45599)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -2.73473 + (((tickAnim - 12) / 6) * (-5.58063-(-2.73473)));
            yy = -7.14739 + (((tickAnim - 12) / 6) * (-10.01812-(-7.14739)));
            zz = 25.11591 + (((tickAnim - 12) / 6) * (33.04238-(25.11591)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -5.58063 + (((tickAnim - 18) / 4) * (-10.512-(-5.58063)));
            yy = -10.01812 + (((tickAnim - 18) / 4) * (-10.66673-(-10.01812)));
            zz = 33.04238 + (((tickAnim - 18) / 4) * (30.87205-(33.04238)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -10.512 + (((tickAnim - 22) / 3) * (4.91961-(-10.512)));
            yy = -10.66673 + (((tickAnim - 22) / 3) * (-11.22593-(-10.66673)));
            zz = 30.87205 + (((tickAnim - 22) / 3) * (46.90276-(30.87205)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.91961 + (((tickAnim - 25) / 5) * (2.71103-(4.91961)));
            yy = -11.22593 + (((tickAnim - 25) / 5) * (-11.02309-(-11.22593)));
            zz = 46.90276 + (((tickAnim - 25) / 5) * (44.45599-(46.90276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(xx), leftLowerArm.rotateAngleY + (float) Math.toRadians(yy), leftLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -18.49582 + (((tickAnim - 0) / 12) * (-16.55689-(-18.49582)));
            yy = 39.22812 + (((tickAnim - 0) / 12) * (38.46212-(39.22812)));
            zz = -13.34819 + (((tickAnim - 0) / 12) * (-12.54351-(-13.34819)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -16.55689 + (((tickAnim - 12) / 6) * (-16.56-(-16.55689)));
            yy = 38.46212 + (((tickAnim - 12) / 6) * (38.46-(38.46212)));
            zz = -12.54351 + (((tickAnim - 12) / 6) * (-12.54-(-12.54351)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -16.56 + (((tickAnim - 18) / 4) * (-17.6414-(-16.56)));
            yy = 38.46 + (((tickAnim - 18) / 4) * (37.8492-(38.46)));
            zz = -12.54 + (((tickAnim - 18) / 4) * (-10.60581-(-12.54)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -17.6414 + (((tickAnim - 22) / 1) * (-27.40347-(-17.6414)));
            yy = 37.8492 + (((tickAnim - 22) / 1) * (39.29244-(37.8492)));
            zz = -10.60581 + (((tickAnim - 22) / 1) * (-19.61644-(-10.60581)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -27.40347 + (((tickAnim - 23) / 2) * (-37.16554-(-27.40347)));
            yy = 39.29244 + (((tickAnim - 23) / 2) * (40.73567-(39.29244)));
            zz = -19.61644 + (((tickAnim - 23) / 2) * (-28.62706-(-19.61644)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -37.16554 + (((tickAnim - 25) / 5) * (-18.49582-(-37.16554)));
            yy = 40.73567 + (((tickAnim - 25) / 5) * (39.22812-(40.73567)));
            zz = -28.62706 + (((tickAnim - 25) / 5) * (-13.34819-(-28.62706)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 4.5257 + (((tickAnim - 0) / 12) * (4.54134-(4.5257)));
            yy = 11.0968 + (((tickAnim - 0) / 12) * (12.58719-(11.0968)));
            zz = 9.5538 + (((tickAnim - 0) / 12) * (-8.38142-(9.5538)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 4.54134 + (((tickAnim - 12) / 6) * (4.5164-(4.54134)));
            yy = 12.58719 + (((tickAnim - 12) / 6) * (12.37103-(12.58719)));
            zz = -8.38142 + (((tickAnim - 12) / 6) * (-5.62296-(-8.38142)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 4.5164 + (((tickAnim - 18) / 4) * (3.86419-(4.5164)));
            yy = 12.37103 + (((tickAnim - 18) / 4) * (15.40472-(12.37103)));
            zz = -5.62296 + (((tickAnim - 18) / 4) * (-11.17381-(-5.62296)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 3.86419 + (((tickAnim - 22) / 1) * (4.5049-(3.86419)));
            yy = 15.40472 + (((tickAnim - 22) / 1) * (12.13138-(15.40472)));
            zz = -11.17381 + (((tickAnim - 22) / 1) * (-0.03254-(-11.17381)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 4.5049 + (((tickAnim - 23) / 2) * (4.54474-(4.5049)));
            yy = 12.13138 + (((tickAnim - 23) / 2) * (11.79842-(12.13138)));
            zz = -0.03254 + (((tickAnim - 23) / 2) * (9.1631-(-0.03254)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.54474 + (((tickAnim - 25) / 5) * (4.5257-(4.54474)));
            yy = 11.79842 + (((tickAnim - 25) / 5) * (11.0968-(11.79842)));
            zz = 9.1631 + (((tickAnim - 25) / 5) * (9.5538-(9.1631)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 2.71103 + (((tickAnim - 0) / 12) * (-2.73473-(2.71103)));
            yy = 11.02309 + (((tickAnim - 0) / 12) * (7.14739-(11.02309)));
            zz = -44.45599 + (((tickAnim - 0) / 12) * (-25.11591-(-44.45599)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -2.73473 + (((tickAnim - 12) / 6) * (-5.58063-(-2.73473)));
            yy = 7.14739 + (((tickAnim - 12) / 6) * (10.01812-(7.14739)));
            zz = -25.11591 + (((tickAnim - 12) / 6) * (-33.04238-(-25.11591)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -5.58063 + (((tickAnim - 18) / 4) * (-10.512-(-5.58063)));
            yy = 10.01812 + (((tickAnim - 18) / 4) * (10.66673-(10.01812)));
            zz = -33.04238 + (((tickAnim - 18) / 4) * (-30.87205-(-33.04238)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -10.512 + (((tickAnim - 22) / 3) * (4.91961-(-10.512)));
            yy = 10.66673 + (((tickAnim - 22) / 3) * (11.22593-(10.66673)));
            zz = -30.87205 + (((tickAnim - 22) / 3) * (-46.90276-(-30.87205)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.91961 + (((tickAnim - 25) / 5) * (2.71103-(4.91961)));
            yy = 11.22593 + (((tickAnim - 25) / 5) * (11.02309-(11.22593)));
            zz = -46.90276 + (((tickAnim - 25) / 5) * (-44.45599-(-46.90276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(xx), rightLowerArm.rotateAngleY + (float) Math.toRadians(yy), rightLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -18.49582 + (((tickAnim - 0) / 12) * (-16.55689-(-18.49582)));
            yy = -39.22812 + (((tickAnim - 0) / 12) * (-38.46212-(-39.22812)));
            zz = 13.34819 + (((tickAnim - 0) / 12) * (12.54351-(13.34819)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -16.55689 + (((tickAnim - 12) / 6) * (-16.56-(-16.55689)));
            yy = -38.46212 + (((tickAnim - 12) / 6) * (-38.46-(-38.46212)));
            zz = 12.54351 + (((tickAnim - 12) / 6) * (12.54-(12.54351)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -16.56 + (((tickAnim - 18) / 4) * (-17.6414-(-16.56)));
            yy = -38.46 + (((tickAnim - 18) / 4) * (-37.8492-(-38.46)));
            zz = 12.54 + (((tickAnim - 18) / 4) * (10.60581-(12.54)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -17.6414 + (((tickAnim - 22) / 1) * (-27.40347-(-17.6414)));
            yy = -37.8492 + (((tickAnim - 22) / 1) * (-39.29244-(-37.8492)));
            zz = 10.60581 + (((tickAnim - 22) / 1) * (19.61644-(10.60581)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -27.40347 + (((tickAnim - 23) / 2) * (-37.16554-(-27.40347)));
            yy = -39.29244 + (((tickAnim - 23) / 2) * (-40.73567-(-39.29244)));
            zz = 19.61644 + (((tickAnim - 23) / 2) * (28.62706-(19.61644)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -37.16554 + (((tickAnim - 25) / 5) * (-18.49582-(-37.16554)));
            yy = -40.73567 + (((tickAnim - 25) / 5) * (-39.22812-(-40.73567)));
            zz = 28.62706 + (((tickAnim - 25) / 5) * (13.34819-(28.62706)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (-4-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -4 + (((tickAnim - 10) / 5) * (-4-(-4)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 15) / 3) * (1-(-4)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 18) / 1) * (3-(1)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 3 + (((tickAnim - 19) / 4) * (-1-(3)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -1 + (((tickAnim - 23) / 7) * (0-(-1)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 12) / 3) * (-5-(-5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 15) / 3) * (0-(-5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (-5-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 19) / 4) * (-9-(-5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -9 + (((tickAnim - 23) / 1) * (-6-(-9)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 24) / 6) * (0-(-6)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (17-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 17 + (((tickAnim - 11) / 4) * (17-(17)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 17 + (((tickAnim - 15) / 3) * (20-(17)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 20 + (((tickAnim - 18) / 1) * (9-(20)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 9 + (((tickAnim - 19) / 2) * (-3-(9)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -3 + (((tickAnim - 21) / 4) * (17-(-3)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 17 + (((tickAnim - 25) / 5) * (0-(17)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -4 + (((tickAnim - 18) / 2) * (-10-(-4)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 20) / 3) * (-4-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(xx), rightUpperLeg.rotateAngleY + (float) Math.toRadians(yy), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (3.60653-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-1.11644-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (6.01465-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 3.60653 + (((tickAnim - 20) / 3) * (0-(3.60653)));
            yy = -1.11644 + (((tickAnim - 20) / 3) * (0-(-1.11644)));
            zz = 6.01465 + (((tickAnim - 20) / 3) * (0-(6.01465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(xx), rightLowerLeg.rotateAngleY + (float) Math.toRadians(yy), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.1 + (((tickAnim - 18) / 2) * (-0.1471-(-0.1)));
            yy = 0.55 + (((tickAnim - 18) / 2) * (0.92076-(0.55)));
            zz = 2.87 + (((tickAnim - 18) / 2) * (4.80082-(2.87)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -0.1471 + (((tickAnim - 20) / 3) * (-0.1-(-0.1471)));
            yy = 0.92076 + (((tickAnim - 20) / 3) * (0.55-(0.92076)));
            zz = 4.80082 + (((tickAnim - 20) / 3) * (2.87-(4.80082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 4 + (((tickAnim - 18) / 2) * (10-(4)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 20) / 3) * (4-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(xx), leftUpperLeg.rotateAngleY + (float) Math.toRadians(yy), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (3.60653-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (1.11644-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-6.01465-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 3.60653 + (((tickAnim - 20) / 3) * (0-(3.60653)));
            yy = 1.11644 + (((tickAnim - 20) / 3) * (0-(1.11644)));
            zz = -6.01465 + (((tickAnim - 20) / 3) * (0-(-6.01465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(xx), leftLowerLeg.rotateAngleY + (float) Math.toRadians(yy), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -0.10362 + (((tickAnim - 0) / 18) * (-0.1-(-0.10362)));
            yy = -0.55359 + (((tickAnim - 0) / 18) * (-0.55-(-0.55359)));
            zz = -2.87282 + (((tickAnim - 0) / 18) * (-2.87-(-2.87282)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.1 + (((tickAnim - 18) / 2) * (-0.1471-(-0.1)));
            yy = -0.55 + (((tickAnim - 18) / 2) * (-0.92076-(-0.55)));
            zz = -2.87 + (((tickAnim - 18) / 2) * (-4.80082-(-2.87)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -0.1471 + (((tickAnim - 20) / 3) * (-0.1-(-0.1471)));
            yy = -0.92076 + (((tickAnim - 20) / 3) * (-0.55-(-0.92076)));
            zz = -4.80082 + (((tickAnim - 20) / 3) * (-2.87-(-4.80082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-3-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -3 + (((tickAnim - 20) / 3) * (0-(-3)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (4-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 4 + (((tickAnim - 20) / 3) * (0-(4)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-0.00015-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.00015-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-0.01745-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -0.00015 + (((tickAnim - 20) / 3) * (0-(-0.00015)));
            yy = -0.00015 + (((tickAnim - 20) / 3) * (0-(-0.00015)));
            zz = -0.01745 + (((tickAnim - 20) / 3) * (0-(-0.01745)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-1-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -1 + (((tickAnim - 20) / 3) * (0-(-1)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0.02736-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.0259-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0.24875-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.02736 + (((tickAnim - 20) / 3) * (0-(0.02736)));
            yy = 0.0259 + (((tickAnim - 20) / 3) * (0-(0.0259)));
            zz = 0.24875 + (((tickAnim - 20) / 3) * (0-(0.24875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnkylosphenodon entity = (EntityPrehistoricFloraAnkylosphenodon) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.Ankylosphenodon.rotationPointX = this.Ankylosphenodon.rotationPointX + (float)(0);
        this.Ankylosphenodon.rotationPointY = this.Ankylosphenodon.rotationPointY - (float)(0.7);
        this.Ankylosphenodon.rotationPointZ = this.Ankylosphenodon.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1-(0)));
            yy = 13 + (((tickAnim - 0) / 8) * (0-(13)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (0-(1)));
            yy = 0 + (((tickAnim - 8) / 7) * (-13-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (1-(0)));
            yy = -13 + (((tickAnim - 15) / 8) * (0-(-13)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 23) / 7) * (0-(1)));
            yy = 0 + (((tickAnim - 23) / 7) * (13-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 8) * (0.5-(0.3)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 7) * (0.3-(0.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 8) * (0.7-(0.3)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 23) / 7) * (0.3-(0.7)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
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
            xx = 1.02147 + (((tickAnim - 0) / 3) * (-0.0582-(1.02147)));
            yy = -3.95621 + (((tickAnim - 0) / 3) * (0.57269-(-3.95621)));
            zz = -3.94894 + (((tickAnim - 0) / 3) * (0.88762-(-3.94894)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.0582 + (((tickAnim - 3) / 5) * (0-(-0.0582)));
            yy = 0.57269 + (((tickAnim - 3) / 5) * (0-(0.57269)));
            zz = 0.88762 + (((tickAnim - 3) / 5) * (0-(0.88762)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0.2909-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-0.54851-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (3.09364-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0.2909 + (((tickAnim - 12) / 3) * (1.02147-(0.2909)));
            yy = -0.54851 + (((tickAnim - 12) / 3) * (3.95621-(-0.54851)));
            zz = 3.09364 + (((tickAnim - 12) / 3) * (3.94894-(3.09364)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1.02147 + (((tickAnim - 15) / 3) * (-0.0582-(1.02147)));
            yy = 3.95621 + (((tickAnim - 15) / 3) * (-0.57269-(3.95621)));
            zz = 3.94894 + (((tickAnim - 15) / 3) * (-0.88762-(3.94894)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.0582 + (((tickAnim - 18) / 5) * (0-(-0.0582)));
            yy = -0.57269 + (((tickAnim - 18) / 5) * (0-(-0.57269)));
            zz = -0.88762 + (((tickAnim - 18) / 5) * (0-(-0.88762)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0.2909-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0.54851-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (-3.09364-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0.2909 + (((tickAnim - 26) / 4) * (1.02147-(0.2909)));
            yy = 0.54851 + (((tickAnim - 26) / 4) * (-3.95621-(0.54851)));
            zz = -3.09364 + (((tickAnim - 26) / 4) * (-3.94894-(-3.09364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.51262 + (((tickAnim - 0) / 4) * (0.79194-(2.51262)));
            yy = -13.91753 + (((tickAnim - 0) / 4) * (-6.16533-(-13.91753)));
            zz = 2.83452 + (((tickAnim - 0) / 4) * (-1.3515-(2.83452)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.79194 + (((tickAnim - 4) / 4) * (-0.99451-(0.79194)));
            yy = -6.16533 + (((tickAnim - 4) / 4) * (-0.00022-(-6.16533)));
            zz = -1.3515 + (((tickAnim - 4) / 4) * (-4.00547-(-1.3515)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.99451 + (((tickAnim - 8) / 4) * (0.57492-(-0.99451)));
            yy = -0.00022 + (((tickAnim - 8) / 4) * (10.84469-(-0.00022)));
            zz = -4.00547 + (((tickAnim - 8) / 4) * (1.32249-(-4.00547)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0.57492 + (((tickAnim - 12) / 3) * (2.51262-(0.57492)));
            yy = 10.84469 + (((tickAnim - 12) / 3) * (13.91753-(10.84469)));
            zz = 1.32249 + (((tickAnim - 12) / 3) * (-2.83452-(1.32249)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 2.51262 + (((tickAnim - 15) / 4) * (0.87027-(2.51262)));
            yy = 13.91753 + (((tickAnim - 15) / 4) * (6.17254-(13.91753)));
            zz = -2.83452 + (((tickAnim - 15) / 4) * (2.35685-(-2.83452)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0.87027 + (((tickAnim - 19) / 4) * (-0.99451-(0.87027)));
            yy = 6.17254 + (((tickAnim - 19) / 4) * (0.00022-(6.17254)));
            zz = 2.35685 + (((tickAnim - 19) / 4) * (4.00547-(2.35685)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -0.99451 + (((tickAnim - 23) / 4) * (0.57492-(-0.99451)));
            yy = 0.00022 + (((tickAnim - 23) / 4) * (-10.84469-(0.00022)));
            zz = 4.00547 + (((tickAnim - 23) / 4) * (-1.32249-(4.00547)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0.57492 + (((tickAnim - 27) / 3) * (2.51262-(0.57492)));
            yy = -10.84469 + (((tickAnim - 27) / 3) * (-13.91753-(-10.84469)));
            zz = -1.32249 + (((tickAnim - 27) / 3) * (2.83452-(-1.32249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.34907 + (((tickAnim - 0) / 3) * (17.90806-(17.34907)));
            yy = -25.73562 + (((tickAnim - 0) / 3) * (-22.26882-(-25.73562)));
            zz = 6.82203 + (((tickAnim - 0) / 3) * (-8.11121-(6.82203)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.90806 + (((tickAnim - 3) / 2) * (19.70045-(17.90806)));
            yy = -22.26882 + (((tickAnim - 3) / 2) * (3.60901-(-22.26882)));
            zz = -8.11121 + (((tickAnim - 3) / 2) * (-16.9228-(-8.11121)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.70045 + (((tickAnim - 5) / 3) * (13.96061-(19.70045)));
            yy = 3.60901 + (((tickAnim - 5) / 3) * (25.26368-(3.60901)));
            zz = -16.9228 + (((tickAnim - 5) / 3) * (-15.93721-(-16.9228)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 13.96061 + (((tickAnim - 8) / 3) * (-14.12136-(13.96061)));
            yy = 25.26368 + (((tickAnim - 8) / 3) * (41.96417-(25.26368)));
            zz = -15.93721 + (((tickAnim - 8) / 3) * (-4.53128-(-15.93721)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -14.12136 + (((tickAnim - 11) / 4) * (8.25151-(-14.12136)));
            yy = 41.96417 + (((tickAnim - 11) / 4) * (49.36497-(41.96417)));
            zz = -4.53128 + (((tickAnim - 11) / 4) * (18.32492-(-4.53128)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 8.25151 + (((tickAnim - 15) / 4) * (8.35475-(8.25151)));
            yy = 49.36497 + (((tickAnim - 15) / 4) * (33.08866-(49.36497)));
            zz = 18.32492 + (((tickAnim - 15) / 4) * (17.21367-(18.32492)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 8.35475 + (((tickAnim - 19) / 4) * (12.79906-(8.35475)));
            yy = 33.08866 + (((tickAnim - 19) / 4) * (11.81477-(33.08866)));
            zz = 17.21367 + (((tickAnim - 19) / 4) * (6.57324-(17.21367)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 12.79906 + (((tickAnim - 23) / 3) * (12.80832-(12.79906)));
            yy = 11.81477 + (((tickAnim - 23) / 3) * (-19.71659-(11.81477)));
            zz = 6.57324 + (((tickAnim - 23) / 3) * (10.85257-(6.57324)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 12.80832 + (((tickAnim - 26) / 4) * (17.34907-(12.80832)));
            yy = -19.71659 + (((tickAnim - 26) / 4) * (-25.73562-(-19.71659)));
            zz = 10.85257 + (((tickAnim - 26) / 4) * (6.82203-(10.85257)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 84.48502 + (((tickAnim - 0) / 3) * (146.01507-(84.48502)));
            yy = -48.53333 + (((tickAnim - 0) / 3) * (-40.67806-(-48.53333)));
            zz = -88.9934 + (((tickAnim - 0) / 3) * (-141.84411-(-88.9934)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 146.01507 + (((tickAnim - 3) / 2) * (83.79-(146.01507)));
            yy = -40.67806 + (((tickAnim - 3) / 2) * (-2.05-(-40.67806)));
            zz = -141.84411 + (((tickAnim - 3) / 2) * (-77.03-(-141.84411)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 83.79 + (((tickAnim - 5) / 3) * (14.4591-(83.79)));
            yy = -2.05 + (((tickAnim - 5) / 3) * (-36.08771-(-2.05)));
            zz = -77.03 + (((tickAnim - 5) / 3) * (-22.05621-(-77.03)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 14.4591 + (((tickAnim - 8) / 3) * (-43.43641-(14.4591)));
            yy = -36.08771 + (((tickAnim - 8) / 3) * (-25.72659-(-36.08771)));
            zz = -22.05621 + (((tickAnim - 8) / 3) * (31.04549-(-22.05621)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -43.43641 + (((tickAnim - 11) / 4) * (-44.07223-(-43.43641)));
            yy = -25.72659 + (((tickAnim - 11) / 4) * (-26.2103-(-25.72659)));
            zz = 31.04549 + (((tickAnim - 11) / 4) * (30.5018-(31.04549)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -44.07223 + (((tickAnim - 15) / 4) * (-14.94843-(-44.07223)));
            yy = -26.2103 + (((tickAnim - 15) / 4) * (-18.96178-(-26.2103)));
            zz = 30.5018 + (((tickAnim - 15) / 4) * (10.12547-(30.5018)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -14.94843 + (((tickAnim - 19) / 4) * (10.60561-(-14.94843)));
            yy = -18.96178 + (((tickAnim - 19) / 4) * (-28.44433-(-18.96178)));
            zz = 10.12547 + (((tickAnim - 19) / 4) * (-0.8356-(10.12547)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 10.60561 + (((tickAnim - 23) / 3) * (-7.7221-(10.60561)));
            yy = -28.44433 + (((tickAnim - 23) / 3) * (-23.49201-(-28.44433)));
            zz = -0.8356 + (((tickAnim - 23) / 3) * (13.65062-(-0.8356)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -7.7221 + (((tickAnim - 26) / 4) * (84.48502-(-7.7221)));
            yy = -23.49201 + (((tickAnim - 26) / 4) * (-48.53333-(-23.49201)));
            zz = 13.65062 + (((tickAnim - 26) / 4) * (-88.9934-(13.65062)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(xx), leftLowerArm.rotateAngleY + (float) Math.toRadians(yy), leftLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.62207 + (((tickAnim - 0) / 3) * (26.68-(18.62207)));
            yy = 24.60603 + (((tickAnim - 0) / 3) * (26.59-(24.60603)));
            zz = 72.5768 + (((tickAnim - 0) / 3) * (63.73-(72.5768)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 26.68 + (((tickAnim - 3) / 2) * (0.54688-(26.68)));
            yy = 26.59 + (((tickAnim - 3) / 2) * (21.49112-(26.59)));
            zz = 63.73 + (((tickAnim - 3) / 2) * (-0.98522-(63.73)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.54688 + (((tickAnim - 5) / 3) * (17.34717-(0.54688)));
            yy = 21.49112 + (((tickAnim - 5) / 3) * (26.07605-(21.49112)));
            zz = -0.98522 + (((tickAnim - 5) / 3) * (38.56517-(-0.98522)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 17.34717 + (((tickAnim - 8) / 3) * (34.57351-(17.34717)));
            yy = 26.07605 + (((tickAnim - 8) / 3) * (13.89116-(26.07605)));
            zz = 38.56517 + (((tickAnim - 8) / 3) * (21.61586-(38.56517)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 34.57351 + (((tickAnim - 11) / 4) * (-3.98495-(34.57351)));
            yy = 13.89116 + (((tickAnim - 11) / 4) * (4.97029-(13.89116)));
            zz = 21.61586 + (((tickAnim - 11) / 4) * (-15.73078-(21.61586)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -3.98495 + (((tickAnim - 15) / 4) * (-2.36995-(-3.98495)));
            yy = 4.97029 + (((tickAnim - 15) / 4) * (16.03338-(4.97029)));
            zz = -15.73078 + (((tickAnim - 15) / 4) * (1.7838-(-15.73078)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -2.36995 + (((tickAnim - 19) / 2) * (-10.00253-(-2.36995)));
            yy = 16.03338 + (((tickAnim - 19) / 2) * (17.61622-(16.03338)));
            zz = 1.7838 + (((tickAnim - 19) / 2) * (12.33134-(1.7838)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -10.00253 + (((tickAnim - 21) / 2) * (-18.0154-(-10.00253)));
            yy = 17.61622 + (((tickAnim - 21) / 2) * (22.03765-(17.61622)));
            zz = 12.33134 + (((tickAnim - 21) / 2) * (18.59423-(12.33134)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -18.0154 + (((tickAnim - 23) / 3) * (-1.55838-(-18.0154)));
            yy = 22.03765 + (((tickAnim - 23) / 3) * (29.92806-(22.03765)));
            zz = 18.59423 + (((tickAnim - 23) / 3) * (34.98072-(18.59423)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -1.55838 + (((tickAnim - 26) / 2) * (4.63573-(-1.55838)));
            yy = 29.92806 + (((tickAnim - 26) / 2) * (23.00256-(29.92806)));
            zz = 34.98072 + (((tickAnim - 26) / 2) * (62.70635-(34.98072)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 4.63573 + (((tickAnim - 28) / 2) * (18.62207-(4.63573)));
            yy = 23.00256 + (((tickAnim - 28) / 2) * (24.60603-(23.00256)));
            zz = 62.70635 + (((tickAnim - 28) / 2) * (72.5768-(62.70635)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 8.25151 + (((tickAnim - 0) / 4) * (8.35475-(8.25151)));
            yy = -49.36497 + (((tickAnim - 0) / 4) * (-33.08866-(-49.36497)));
            zz = -18.32492 + (((tickAnim - 0) / 4) * (-17.21367-(-18.32492)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 8.35475 + (((tickAnim - 4) / 4) * (12.80029-(8.35475)));
            yy = -33.08866 + (((tickAnim - 4) / 4) * (-11.81467-(-33.08866)));
            zz = -17.21367 + (((tickAnim - 4) / 4) * (-7.57347-(-17.21367)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 12.80029 + (((tickAnim - 8) / 3) * (12.80832-(12.80029)));
            yy = -11.81467 + (((tickAnim - 8) / 3) * (19.71659-(-11.81467)));
            zz = -7.57347 + (((tickAnim - 8) / 3) * (-10.85257-(-7.57347)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 12.80832 + (((tickAnim - 11) / 4) * (17.34907-(12.80832)));
            yy = 19.71659 + (((tickAnim - 11) / 4) * (25.73562-(19.71659)));
            zz = -10.85257 + (((tickAnim - 11) / 4) * (-6.82203-(-10.85257)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 17.34907 + (((tickAnim - 15) / 3) * (17.90806-(17.34907)));
            yy = 25.73562 + (((tickAnim - 15) / 3) * (22.26882-(25.73562)));
            zz = -6.82203 + (((tickAnim - 15) / 3) * (8.11121-(-6.82203)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 17.90806 + (((tickAnim - 18) / 2) * (19.70045-(17.90806)));
            yy = 22.26882 + (((tickAnim - 18) / 2) * (-3.60901-(22.26882)));
            zz = 8.11121 + (((tickAnim - 18) / 2) * (16.9228-(8.11121)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 19.70045 + (((tickAnim - 20) / 3) * (13.96061-(19.70045)));
            yy = -3.60901 + (((tickAnim - 20) / 3) * (-25.26368-(-3.60901)));
            zz = 16.9228 + (((tickAnim - 20) / 3) * (15.93721-(16.9228)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 13.96061 + (((tickAnim - 23) / 3) * (-14.12136-(13.96061)));
            yy = -25.26368 + (((tickAnim - 23) / 3) * (-41.96417-(-25.26368)));
            zz = 15.93721 + (((tickAnim - 23) / 3) * (4.53128-(15.93721)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -14.12136 + (((tickAnim - 26) / 4) * (8.25151-(-14.12136)));
            yy = -41.96417 + (((tickAnim - 26) / 4) * (-49.36497-(-41.96417)));
            zz = 4.53128 + (((tickAnim - 26) / 4) * (-18.32492-(4.53128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -44.07223 + (((tickAnim - 0) / 4) * (-14.94843-(-44.07223)));
            yy = 26.2103 + (((tickAnim - 0) / 4) * (18.96178-(26.2103)));
            zz = -30.5018 + (((tickAnim - 0) / 4) * (-10.12547-(-30.5018)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -14.94843 + (((tickAnim - 4) / 4) * (-20.7243-(-14.94843)));
            yy = 18.96178 + (((tickAnim - 4) / 4) * (19.65612-(18.96178)));
            zz = -10.12547 + (((tickAnim - 4) / 4) * (-22.75446-(-10.12547)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -20.7243 + (((tickAnim - 8) / 3) * (-7.7221-(-20.7243)));
            yy = 19.65612 + (((tickAnim - 8) / 3) * (23.49201-(19.65612)));
            zz = -22.75446 + (((tickAnim - 8) / 3) * (-13.65062-(-22.75446)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -7.7221 + (((tickAnim - 11) / 4) * (84.48502-(-7.7221)));
            yy = 23.49201 + (((tickAnim - 11) / 4) * (48.53333-(23.49201)));
            zz = -13.65062 + (((tickAnim - 11) / 4) * (88.9934-(-13.65062)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 84.48502 + (((tickAnim - 15) / 3) * (146.01507-(84.48502)));
            yy = 48.53333 + (((tickAnim - 15) / 3) * (40.67806-(48.53333)));
            zz = 88.9934 + (((tickAnim - 15) / 3) * (141.84411-(88.9934)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 146.01507 + (((tickAnim - 18) / 2) * (83.79-(146.01507)));
            yy = 40.67806 + (((tickAnim - 18) / 2) * (2.05-(40.67806)));
            zz = 141.84411 + (((tickAnim - 18) / 2) * (77.03-(141.84411)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 83.79 + (((tickAnim - 20) / 3) * (14.4591-(83.79)));
            yy = 2.05 + (((tickAnim - 20) / 3) * (36.08771-(2.05)));
            zz = 77.03 + (((tickAnim - 20) / 3) * (22.05621-(77.03)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 14.4591 + (((tickAnim - 23) / 3) * (-43.43641-(14.4591)));
            yy = 36.08771 + (((tickAnim - 23) / 3) * (25.72659-(36.08771)));
            zz = 22.05621 + (((tickAnim - 23) / 3) * (-31.04549-(22.05621)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -43.43641 + (((tickAnim - 26) / 4) * (-44.07223-(-43.43641)));
            yy = 25.72659 + (((tickAnim - 26) / 4) * (26.2103-(25.72659)));
            zz = -31.04549 + (((tickAnim - 26) / 4) * (-30.5018-(-31.04549)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(xx), rightLowerArm.rotateAngleY + (float) Math.toRadians(yy), rightLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -4.02598 + (((tickAnim - 0) / 4) * (-2.36995-(-4.02598)));
            yy = -6.54992 + (((tickAnim - 0) / 4) * (-16.03338-(-6.54992)));
            zz = 17.33373 + (((tickAnim - 0) / 4) * (-1.7838-(17.33373)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -2.36995 + (((tickAnim - 4) / 4) * (-0.76513-(-2.36995)));
            yy = -16.03338 + (((tickAnim - 4) / 4) * (-20.26895-(-16.03338)));
            zz = -1.7838 + (((tickAnim - 4) / 4) * (-22.82924-(-1.7838)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.76513 + (((tickAnim - 8) / 3) * (-1.55838-(-0.76513)));
            yy = -20.26895 + (((tickAnim - 8) / 3) * (-29.92806-(-20.26895)));
            zz = -22.82924 + (((tickAnim - 8) / 3) * (-34.98072-(-22.82924)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -1.55838 + (((tickAnim - 11) / 2) * (4.63573-(-1.55838)));
            yy = -29.92806 + (((tickAnim - 11) / 2) * (-23.00256-(-29.92806)));
            zz = -34.98072 + (((tickAnim - 11) / 2) * (-62.70635-(-34.98072)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 4.63573 + (((tickAnim - 13) / 2) * (18.62207-(4.63573)));
            yy = -23.00256 + (((tickAnim - 13) / 2) * (-24.60603-(-23.00256)));
            zz = -62.70635 + (((tickAnim - 13) / 2) * (-72.5768-(-62.70635)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 18.62207 + (((tickAnim - 15) / 3) * (26.68-(18.62207)));
            yy = -24.60603 + (((tickAnim - 15) / 3) * (-26.59-(-24.60603)));
            zz = -72.5768 + (((tickAnim - 15) / 3) * (-63.73-(-72.5768)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 26.68 + (((tickAnim - 18) / 2) * (0.54688-(26.68)));
            yy = -26.59 + (((tickAnim - 18) / 2) * (-21.49112-(-26.59)));
            zz = -63.73 + (((tickAnim - 18) / 2) * (0.98522-(-63.73)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.54688 + (((tickAnim - 20) / 3) * (17.34717-(0.54688)));
            yy = -21.49112 + (((tickAnim - 20) / 3) * (-26.07605-(-21.49112)));
            zz = 0.98522 + (((tickAnim - 20) / 3) * (-38.56517-(0.98522)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 17.34717 + (((tickAnim - 23) / 3) * (34.57351-(17.34717)));
            yy = -26.07605 + (((tickAnim - 23) / 3) * (-13.89116-(-26.07605)));
            zz = -38.56517 + (((tickAnim - 23) / 3) * (-21.61586-(-38.56517)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 34.57351 + (((tickAnim - 26) / 4) * (-4.02598-(34.57351)));
            yy = -13.89116 + (((tickAnim - 26) / 4) * (-6.54992-(-13.89116)));
            zz = -21.61586 + (((tickAnim - 26) / 4) * (17.33373-(-21.61586)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.08141 + (((tickAnim - 0) / 8) * (-0.04955-(0.08141)));
            yy = -8.01068 + (((tickAnim - 0) / 8) * (4.98776-(-8.01068)));
            zz = -0.20774 + (((tickAnim - 0) / 8) * (-0.01594-(-0.20774)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.04955 + (((tickAnim - 8) / 7) * (0.08141-(-0.04955)));
            yy = 4.98776 + (((tickAnim - 8) / 7) * (8.01068-(4.98776)));
            zz = -0.01594 + (((tickAnim - 8) / 7) * (0.20774-(-0.01594)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0.08141 + (((tickAnim - 15) / 8) * (-0.04955-(0.08141)));
            yy = 8.01068 + (((tickAnim - 15) / 8) * (4.98776-(8.01068)));
            zz = 0.20774 + (((tickAnim - 15) / 8) * (-0.01594-(0.20774)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.04955 + (((tickAnim - 23) / 7) * (0.08141-(-0.04955)));
            yy = 4.98776 + (((tickAnim - 23) / 7) * (-8.01068-(4.98776)));
            zz = -0.01594 + (((tickAnim - 23) / 7) * (-0.20774-(-0.01594)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.30107 + (((tickAnim - 0) / 8) * (0.93439-(0.30107)));
            yy = -10.9836 + (((tickAnim - 0) / 8) * (-12.96808-(-10.9836)));
            zz = 0.48052 + (((tickAnim - 0) / 8) * (-0.03395-(0.48052)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.93439 + (((tickAnim - 8) / 7) * (0.30107-(0.93439)));
            yy = -12.96808 + (((tickAnim - 8) / 7) * (10.9836-(-12.96808)));
            zz = -0.03395 + (((tickAnim - 8) / 7) * (-0.48052-(-0.03395)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0.30107 + (((tickAnim - 15) / 8) * (0.93439-(0.30107)));
            yy = 10.9836 + (((tickAnim - 15) / 8) * (-12.96808-(10.9836)));
            zz = -0.48052 + (((tickAnim - 15) / 8) * (-0.03395-(-0.48052)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.93439 + (((tickAnim - 23) / 7) * (0.30107-(0.93439)));
            yy = -12.96808 + (((tickAnim - 23) / 7) * (-10.9836-(-12.96808)));
            zz = -0.03395 + (((tickAnim - 23) / 7) * (0.48052-(-0.03395)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.57484 + (((tickAnim - 0) / 8) * (-1.04974-(-0.57484)));
            yy = 22.9874 + (((tickAnim - 0) / 8) * (7.97998-(22.9874)));
            zz = -0.58431 + (((tickAnim - 0) / 8) * (-0.0851-(-0.58431)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -1.04974 + (((tickAnim - 8) / 7) * (-0.57484-(-1.04974)));
            yy = 7.97998 + (((tickAnim - 8) / 7) * (-22.9874-(7.97998)));
            zz = -0.0851 + (((tickAnim - 8) / 7) * (0.58431-(-0.0851)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -0.57484 + (((tickAnim - 15) / 8) * (-1.04974-(-0.57484)));
            yy = -22.9874 + (((tickAnim - 15) / 8) * (7.97998-(-22.9874)));
            zz = 0.58431 + (((tickAnim - 15) / 8) * (-0.0851-(0.58431)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -1.04974 + (((tickAnim - 23) / 7) * (-0.57484-(-1.04974)));
            yy = 7.97998 + (((tickAnim - 23) / 7) * (22.9874-(7.97998)));
            zz = -0.0851 + (((tickAnim - 23) / 7) * (-0.58431-(-0.0851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 61.66896 + (((tickAnim - 0) / 4) * (68.80535-(61.66896)));
            yy = 54.43744 + (((tickAnim - 0) / 4) * (60.28713-(54.43744)));
            zz = -23.96582 + (((tickAnim - 0) / 4) * (-7.18071-(-23.96582)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 68.80535 + (((tickAnim - 4) / 2) * (79.46666-(68.80535)));
            yy = 60.28713 + (((tickAnim - 4) / 2) * (60.37525-(60.28713)));
            zz = -7.18071 + (((tickAnim - 4) / 2) * (-2.80973-(-7.18071)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 79.46666 + (((tickAnim - 6) / 2) * (83.67916-(79.46666)));
            yy = 60.37525 + (((tickAnim - 6) / 2) * (47.82499-(60.37525)));
            zz = -2.80973 + (((tickAnim - 6) / 2) * (-0.5542-(-2.80973)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 83.67916 + (((tickAnim - 8) / 1) * (67.7425-(83.67916)));
            yy = 47.82499 + (((tickAnim - 8) / 1) * (47.62342-(47.82499)));
            zz = -0.5542 + (((tickAnim - 8) / 1) * (4.51889-(-0.5542)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 67.7425 + (((tickAnim - 9) / 2) * (29.94684-(67.7425)));
            yy = 47.62342 + (((tickAnim - 9) / 2) * (13.85731-(47.62342)));
            zz = 4.51889 + (((tickAnim - 9) / 2) * (9.00861-(4.51889)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 29.94684 + (((tickAnim - 11) / 2) * (13.31937-(29.94684)));
            yy = 13.85731 + (((tickAnim - 11) / 2) * (-2.73617-(13.85731)));
            zz = 9.00861 + (((tickAnim - 11) / 2) * (9.64987-(9.00861)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 13.31937 + (((tickAnim - 13) / 2) * (9.37128-(13.31937)));
            yy = -2.73617 + (((tickAnim - 13) / 2) * (-1.60286-(-2.73617)));
            zz = 9.64987 + (((tickAnim - 13) / 2) * (11.7578-(9.64987)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 9.37128 + (((tickAnim - 15) / 3) * (14.54035-(9.37128)));
            yy = -1.60286 + (((tickAnim - 15) / 3) * (4.66216-(-1.60286)));
            zz = 11.7578 + (((tickAnim - 15) / 3) * (2.54205-(11.7578)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 14.54035 + (((tickAnim - 18) / 5) * (31.51572-(14.54035)));
            yy = 4.66216 + (((tickAnim - 18) / 5) * (9.95656-(4.66216)));
            zz = 2.54205 + (((tickAnim - 18) / 5) * (-20.29024-(2.54205)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 31.51572 + (((tickAnim - 23) / 4) * (49.02678-(31.51572)));
            yy = 9.95656 + (((tickAnim - 23) / 4) * (39.61022-(9.95656)));
            zz = -20.29024 + (((tickAnim - 23) / 4) * (-20.09894-(-20.29024)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 49.02678 + (((tickAnim - 27) / 3) * (61.66896-(49.02678)));
            yy = 39.61022 + (((tickAnim - 27) / 3) * (54.43744-(39.61022)));
            zz = -20.09894 + (((tickAnim - 27) / 3) * (-23.96582-(-20.09894)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(xx), rightUpperLeg.rotateAngleY + (float) Math.toRadians(yy), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -53.71179 + (((tickAnim - 0) / 4) * (-44.89155-(-53.71179)));
            yy = -52.42782 + (((tickAnim - 0) / 4) * (-64.22319-(-52.42782)));
            zz = 10.67622 + (((tickAnim - 0) / 4) * (11.73026-(10.67622)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -44.89155 + (((tickAnim - 4) / 4) * (-64.77122-(-44.89155)));
            yy = -64.22319 + (((tickAnim - 4) / 4) * (-92.74591-(-64.22319)));
            zz = 11.73026 + (((tickAnim - 4) / 4) * (25.26551-(11.73026)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -64.77122 + (((tickAnim - 8) / 3) * (-22.12018-(-64.77122)));
            yy = -92.74591 + (((tickAnim - 8) / 3) * (-49.05866-(-92.74591)));
            zz = 25.26551 + (((tickAnim - 8) / 3) * (-15.75541-(25.26551)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -22.12018 + (((tickAnim - 11) / 2) * (-42.43762-(-22.12018)));
            yy = -49.05866 + (((tickAnim - 11) / 2) * (-35.27823-(-49.05866)));
            zz = -15.75541 + (((tickAnim - 11) / 2) * (-1.7801-(-15.75541)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -42.43762 + (((tickAnim - 13) / 2) * (-69.22476-(-42.43762)));
            yy = -35.27823 + (((tickAnim - 13) / 2) * (-51.65068-(-35.27823)));
            zz = -1.7801 + (((tickAnim - 13) / 2) * (-14.90223-(-1.7801)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -69.22476 + (((tickAnim - 15) / 3) * (-70.7431-(-69.22476)));
            yy = -51.65068 + (((tickAnim - 15) / 3) * (-57.44594-(-51.65068)));
            zz = -14.90223 + (((tickAnim - 15) / 3) * (-3.23344-(-14.90223)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -70.7431 + (((tickAnim - 18) / 5) * (-33.77571-(-70.7431)));
            yy = -57.44594 + (((tickAnim - 18) / 5) * (-45.01358-(-57.44594)));
            zz = -3.23344 + (((tickAnim - 18) / 5) * (-18.79023-(-3.23344)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -33.77571 + (((tickAnim - 23) / 4) * (-51.10947-(-33.77571)));
            yy = -45.01358 + (((tickAnim - 23) / 4) * (-54.14084-(-45.01358)));
            zz = -18.79023 + (((tickAnim - 23) / 4) * (1.42772-(-18.79023)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -51.10947 + (((tickAnim - 27) / 3) * (-53.71179-(-51.10947)));
            yy = -54.14084 + (((tickAnim - 27) / 3) * (-52.42782-(-54.14084)));
            zz = 1.42772 + (((tickAnim - 27) / 3) * (10.67622-(1.42772)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(xx), rightLowerLeg.rotateAngleY + (float) Math.toRadians(yy), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.0112 + (((tickAnim - 0) / 8) * (0.3397-(1.0112)));
            yy = -0.2812 + (((tickAnim - 0) / 8) * (-0.0868-(-0.2812)));
            zz = -0.0229 + (((tickAnim - 0) / 8) * (-0.0065-(-0.0229)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.3397 + (((tickAnim - 8) / 7) * (2.3053-(0.3397)));
            yy = -0.0868 + (((tickAnim - 8) / 7) * (6.5017-(-0.0868)));
            zz = -0.0065 + (((tickAnim - 8) / 7) * (0.6035-(-0.0065)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 2.3053 + (((tickAnim - 15) / 8) * (0.3217-(2.3053)));
            yy = 6.5017 + (((tickAnim - 15) / 8) * (-0.0828-(6.5017)));
            zz = 0.6035 + (((tickAnim - 15) / 8) * (-0.0062-(0.6035)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.3217 + (((tickAnim - 23) / 7) * (1.0112-(0.3217)));
            yy = -0.0828 + (((tickAnim - 23) / 7) * (-0.2812-(-0.0828)));
            zz = -0.0062 + (((tickAnim - 23) / 7) * (-0.0229-(-0.0062)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -2.0027 + (((tickAnim - 0) / 8) * (-0.6997-(-2.0027)));
            yy = 0.7249 + (((tickAnim - 0) / 8) * (0.4726-(0.7249)));
            zz = -0.0547 + (((tickAnim - 0) / 8) * (-0.0148-(-0.0547)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.6997 + (((tickAnim - 8) / 7) * (-4.4009-(-0.6997)));
            yy = 0.4726 + (((tickAnim - 8) / 7) * (4.9049-(0.4726)));
            zz = -0.0148 + (((tickAnim - 8) / 7) * (-0.2382-(-0.0148)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -4.4009 + (((tickAnim - 15) / 8) * (-0.6621-(-4.4009)));
            yy = 4.9049 + (((tickAnim - 15) / 8) * (0.4557-(4.9049)));
            zz = -0.2382 + (((tickAnim - 15) / 8) * (-0.0138-(-0.2382)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.6621 + (((tickAnim - 23) / 7) * (-2.0027-(-0.6621)));
            yy = 0.4557 + (((tickAnim - 23) / 7) * (0.7249-(0.4557)));
            zz = -0.0138 + (((tickAnim - 23) / 7) * (-0.0547-(-0.0138)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.7345 + (((tickAnim - 0) / 8) * (0.1433-(0.7345)));
            yy = -4.5262 + (((tickAnim - 0) / 8) * (-0.2501-(-4.5262)));
            zz = 0.0419 + (((tickAnim - 0) / 8) * (0.0003-(0.0419)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.1433 + (((tickAnim - 8) / 7) * (0.8723-(0.1433)));
            yy = -0.2501 + (((tickAnim - 8) / 7) * (2.6091-(-0.2501)));
            zz = 0.0003 + (((tickAnim - 8) / 7) * (-0.0623-(0.0003)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0.8723 + (((tickAnim - 15) / 8) * (0.142-(0.8723)));
            yy = 2.6091 + (((tickAnim - 15) / 8) * (-0.1159-(2.6091)));
            zz = -0.0623 + (((tickAnim - 15) / 8) * (-0.0022-(-0.0623)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.142 + (((tickAnim - 23) / 7) * (0.7345-(0.142)));
            yy = -0.1159 + (((tickAnim - 23) / 7) * (-4.5262-(-0.1159)));
            zz = -0.0022 + (((tickAnim - 23) / 7) * (0.0419-(-0.0022)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.6271 + (((tickAnim - 0) / 8) * (-3.5931-(-0.6271)));
            yy = -13.3487 + (((tickAnim - 0) / 8) * (8.5139-(-13.3487)));
            zz = 0.2884 + (((tickAnim - 0) / 8) * (-0.4368-(0.2884)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.5931 + (((tickAnim - 8) / 7) * (0.4246-(-3.5931)));
            yy = 8.5139 + (((tickAnim - 8) / 7) * (11.3873-(8.5139)));
            zz = -0.4368 + (((tickAnim - 8) / 7) * (-0.1414-(-0.4368)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0.4246 + (((tickAnim - 15) / 8) * (-3.51-(0.4246)));
            yy = 11.3873 + (((tickAnim - 15) / 8) * (10.8704-(11.3873)));
            zz = -0.1414 + (((tickAnim - 15) / 8) * (-0.5414-(-0.1414)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -3.51 + (((tickAnim - 23) / 7) * (-0.6271-(-3.51)));
            yy = 10.8704 + (((tickAnim - 23) / 7) * (-13.3487-(10.8704)));
            zz = -0.5414 + (((tickAnim - 23) / 7) * (0.2884-(-0.5414)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.37128 + (((tickAnim - 0) / 3) * (14.54035-(9.37128)));
            yy = 1.60286 + (((tickAnim - 0) / 3) * (-4.66216-(1.60286)));
            zz = -11.7578 + (((tickAnim - 0) / 3) * (-2.54205-(-11.7578)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 14.54035 + (((tickAnim - 3) / 5) * (31.51572-(14.54035)));
            yy = -4.66216 + (((tickAnim - 3) / 5) * (-9.95656-(-4.66216)));
            zz = -2.54205 + (((tickAnim - 3) / 5) * (20.29024-(-2.54205)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 31.51572 + (((tickAnim - 8) / 4) * (49.02678-(31.51572)));
            yy = -9.95656 + (((tickAnim - 8) / 4) * (-39.61022-(-9.95656)));
            zz = 20.29024 + (((tickAnim - 8) / 4) * (20.09894-(20.29024)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 49.02678 + (((tickAnim - 12) / 3) * (61.66896-(49.02678)));
            yy = -39.61022 + (((tickAnim - 12) / 3) * (-54.43744-(-39.61022)));
            zz = 20.09894 + (((tickAnim - 12) / 3) * (23.96582-(20.09894)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 61.66896 + (((tickAnim - 15) / 4) * (68.80535-(61.66896)));
            yy = -54.43744 + (((tickAnim - 15) / 4) * (-60.28713-(-54.43744)));
            zz = 23.96582 + (((tickAnim - 15) / 4) * (7.18071-(23.96582)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 68.80535 + (((tickAnim - 19) / 2) * (79.46666-(68.80535)));
            yy = -60.28713 + (((tickAnim - 19) / 2) * (-60.37525-(-60.28713)));
            zz = 7.18071 + (((tickAnim - 19) / 2) * (2.80973-(7.18071)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 79.46666 + (((tickAnim - 21) / 2) * (83.67916-(79.46666)));
            yy = -60.37525 + (((tickAnim - 21) / 2) * (-47.82499-(-60.37525)));
            zz = 2.80973 + (((tickAnim - 21) / 2) * (0.5542-(2.80973)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 83.67916 + (((tickAnim - 23) / 1) * (67.7425-(83.67916)));
            yy = -47.82499 + (((tickAnim - 23) / 1) * (-47.62342-(-47.82499)));
            zz = 0.5542 + (((tickAnim - 23) / 1) * (-4.51889-(0.5542)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 67.7425 + (((tickAnim - 24) / 2) * (29.94684-(67.7425)));
            yy = -47.62342 + (((tickAnim - 24) / 2) * (-13.85731-(-47.62342)));
            zz = -4.51889 + (((tickAnim - 24) / 2) * (-9.00861-(-4.51889)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 29.94684 + (((tickAnim - 26) / 2) * (13.31937-(29.94684)));
            yy = -13.85731 + (((tickAnim - 26) / 2) * (2.73617-(-13.85731)));
            zz = -9.00861 + (((tickAnim - 26) / 2) * (-9.64987-(-9.00861)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 13.31937 + (((tickAnim - 28) / 2) * (9.37128-(13.31937)));
            yy = 2.73617 + (((tickAnim - 28) / 2) * (1.60286-(2.73617)));
            zz = -9.64987 + (((tickAnim - 28) / 2) * (-11.7578-(-9.64987)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(xx), leftUpperLeg.rotateAngleY + (float) Math.toRadians(yy), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -69.22476 + (((tickAnim - 0) / 3) * (-70.7431-(-69.22476)));
            yy = 51.65068 + (((tickAnim - 0) / 3) * (57.44594-(51.65068)));
            zz = 14.90223 + (((tickAnim - 0) / 3) * (3.23344-(14.90223)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -70.7431 + (((tickAnim - 3) / 5) * (-33.77571-(-70.7431)));
            yy = 57.44594 + (((tickAnim - 3) / 5) * (45.01358-(57.44594)));
            zz = 3.23344 + (((tickAnim - 3) / 5) * (18.79023-(3.23344)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -33.77571 + (((tickAnim - 8) / 4) * (-51.10947-(-33.77571)));
            yy = 45.01358 + (((tickAnim - 8) / 4) * (54.14084-(45.01358)));
            zz = 18.79023 + (((tickAnim - 8) / 4) * (-1.42772-(18.79023)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -51.10947 + (((tickAnim - 12) / 3) * (-53.71179-(-51.10947)));
            yy = 54.14084 + (((tickAnim - 12) / 3) * (52.42782-(54.14084)));
            zz = -1.42772 + (((tickAnim - 12) / 3) * (-10.67622-(-1.42772)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -53.71179 + (((tickAnim - 15) / 4) * (-44.89155-(-53.71179)));
            yy = 52.42782 + (((tickAnim - 15) / 4) * (64.22319-(52.42782)));
            zz = -10.67622 + (((tickAnim - 15) / 4) * (-11.73026-(-10.67622)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -44.89155 + (((tickAnim - 19) / 4) * (-64.77122-(-44.89155)));
            yy = 64.22319 + (((tickAnim - 19) / 4) * (92.74591-(64.22319)));
            zz = -11.73026 + (((tickAnim - 19) / 4) * (-25.26551-(-11.73026)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -64.77122 + (((tickAnim - 23) / 3) * (-22.12018-(-64.77122)));
            yy = 92.74591 + (((tickAnim - 23) / 3) * (49.05866-(92.74591)));
            zz = -25.26551 + (((tickAnim - 23) / 3) * (15.75541-(-25.26551)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -22.12018 + (((tickAnim - 26) / 2) * (-42.43762-(-22.12018)));
            yy = 49.05866 + (((tickAnim - 26) / 2) * (35.27823-(49.05866)));
            zz = 15.75541 + (((tickAnim - 26) / 2) * (1.7801-(15.75541)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -42.43762 + (((tickAnim - 28) / 2) * (-69.22476-(-42.43762)));
            yy = 35.27823 + (((tickAnim - 28) / 2) * (51.65068-(35.27823)));
            zz = 1.7801 + (((tickAnim - 28) / 2) * (14.90223-(1.7801)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(xx), leftLowerLeg.rotateAngleY + (float) Math.toRadians(yy), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 47.91937 + (((tickAnim - 0) / 3) * (43.66155-(47.91937)));
            yy = 5.98832 + (((tickAnim - 0) / 3) * (9.79404-(5.98832)));
            zz = -40.65001 + (((tickAnim - 0) / 3) * (-32.16881-(-40.65001)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 43.66155 + (((tickAnim - 3) / 5) * (-3.12289-(43.66155)));
            yy = 9.79404 + (((tickAnim - 3) / 5) * (40.48978-(9.79404)));
            zz = -32.16881 + (((tickAnim - 3) / 5) * (-37.44017-(-32.16881)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -3.12289 + (((tickAnim - 8) / 4) * (-2.99939-(-3.12289)));
            yy = 40.48978 + (((tickAnim - 8) / 4) * (39.54844-(40.48978)));
            zz = -37.44017 + (((tickAnim - 8) / 4) * (-26.75299-(-37.44017)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -2.99939 + (((tickAnim - 12) / 3) * (-6.52687-(-2.99939)));
            yy = 39.54844 + (((tickAnim - 12) / 3) * (26.57963-(39.54844)));
            zz = -26.75299 + (((tickAnim - 12) / 3) * (-20.72538-(-26.75299)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -6.52687 + (((tickAnim - 15) / 4) * (-0.53556-(-6.52687)));
            yy = 26.57963 + (((tickAnim - 15) / 4) * (5.44978-(26.57963)));
            zz = -20.72538 + (((tickAnim - 15) / 4) * (-3.0281-(-20.72538)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -0.53556 + (((tickAnim - 19) / 4) * (5.74282-(-0.53556)));
            yy = 5.44978 + (((tickAnim - 19) / 4) * (-9.82942-(5.44978)));
            zz = -3.0281 + (((tickAnim - 19) / 4) * (-11.73861-(-3.0281)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 5.74282 + (((tickAnim - 23) / 3) * (2.20872-(5.74282)));
            yy = -9.82942 + (((tickAnim - 23) / 3) * (-3.283-(-9.82942)));
            zz = -11.73861 + (((tickAnim - 23) / 3) * (7.20314-(-11.73861)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 2.20872 + (((tickAnim - 26) / 2) * (7.77886-(2.20872)));
            yy = -3.283 + (((tickAnim - 26) / 2) * (-15.63158-(-3.283)));
            zz = 7.20314 + (((tickAnim - 26) / 2) * (3.9088-(7.20314)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 7.77886 + (((tickAnim - 28) / 2) * (47.91937-(7.77886)));
            yy = -15.63158 + (((tickAnim - 28) / 2) * (5.98832-(-15.63158)));
            zz = 3.9088 + (((tickAnim - 28) / 2) * (-40.65001-(3.9088)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnkylosphenodon entity = (EntityPrehistoricFloraAnkylosphenodon) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(1.01528), hips.rotateAngleY + (float) Math.toRadians(6.9985+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+80))*3), hips.rotateAngleZ + (float) Math.toRadians(0.1755));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+80)));
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-8), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+90))*-6), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(74.91776), leftUpperArm.rotateAngleY + (float) Math.toRadians(-29.65522), leftUpperArm.rotateAngleZ + (float) Math.toRadians(1.64331));
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(47.11541), leftLowerArm.rotateAngleY + (float) Math.toRadians(-17.6924), leftLowerArm.rotateAngleZ + (float) Math.toRadians(-39.14927));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(25.95836), leftHand.rotateAngleY + (float) Math.toRadians(-23.60051), leftHand.rotateAngleZ + (float) Math.toRadians(22.21358));
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(74.91776), rightUpperArm.rotateAngleY + (float) Math.toRadians(29.65522), rightUpperArm.rotateAngleZ + (float) Math.toRadians(-1.64331));
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(47.11541), rightLowerArm.rotateAngleY + (float) Math.toRadians(17.6924), rightLowerArm.rotateAngleZ + (float) Math.toRadians(39.14927));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(25.95836), rightHand.rotateAngleY + (float) Math.toRadians(23.60051), rightHand.rotateAngleZ + (float) Math.toRadians(-22.21358));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+110))*-6), neck1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+120))*-15), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-120))*-15), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(95.9413), rightUpperLeg.rotateAngleY + (float) Math.toRadians(57.20506), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(-44.34809));
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(-54.91232), rightLowerLeg.rotateAngleY + (float) Math.toRadians(-64.09243), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(-4.50118));
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(110.66661), rightFoot.rotateAngleY + (float) Math.toRadians(35.02244), rightFoot.rotateAngleZ + (float) Math.toRadians(90.2944));
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(95.9413), leftUpperLeg.rotateAngleY + (float) Math.toRadians(-57.20506), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(44.34809));
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(-54.91232), leftLowerLeg.rotateAngleY + (float) Math.toRadians(64.09243), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(4.50118));
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(110.66661), leftFoot.rotateAngleY + (float) Math.toRadians(-35.02244), leftFoot.rotateAngleZ + (float) Math.toRadians(-90.2944));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(1.97344), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-4.508), tail1.rotateAngleZ + (float) Math.toRadians(0.46436));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(1.04627), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+110))*-22.9987), tail2.rotateAngleZ + (float) Math.toRadians(-0.15335));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+40))*-32), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+120))*30), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-30), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnkylosphenodon entity = (EntityPrehistoricFloraAnkylosphenodon) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.Ankylosphenodon.rotationPointX = this.Ankylosphenodon.rotationPointX + (float)(0);
        this.Ankylosphenodon.rotationPointY = this.Ankylosphenodon.rotationPointY - (float)(-0.2);
        this.Ankylosphenodon.rotationPointZ = this.Ankylosphenodon.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -14 + (((tickAnim - 0) / 8) * (14-(-14)));
            zz = -16 + (((tickAnim - 0) / 8) * (16-(-16)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 14 + (((tickAnim - 8) / 7) * (-14-(14)));
            zz = 16 + (((tickAnim - 8) / 7) * (-16-(16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.8 + (((tickAnim - 0) / 3) * (3.2-(1.8)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 3.2 + (((tickAnim - 3) / 5) * (1.8-(3.2)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.8 + (((tickAnim - 8) / 2) * (3.2-(1.8)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 3.2 + (((tickAnim - 10) / 5) * (1.8-(3.2)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
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
            xx = 2.88558 + (((tickAnim - 0) / 3) * (2.64166-(2.88558)));
            yy = 6.74189 + (((tickAnim - 0) / 3) * (0.74007-(6.74189)));
            zz = 21.41047 + (((tickAnim - 0) / 3) * (-6.62093-(21.41047)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.64166 + (((tickAnim - 3) / 5) * (2.88558-(2.64166)));
            yy = 0.74007 + (((tickAnim - 3) / 5) * (-6.74189-(0.74007)));
            zz = -6.62093 + (((tickAnim - 3) / 5) * (-21.41047-(-6.62093)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.88558 + (((tickAnim - 8) / 4) * (2.64166-(2.88558)));
            yy = -6.74189 + (((tickAnim - 8) / 4) * (-0.74007-(-6.74189)));
            zz = -21.41047 + (((tickAnim - 8) / 4) * (6.62093-(-21.41047)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 2.64166 + (((tickAnim - 12) / 3) * (2.88558-(2.64166)));
            yy = -0.74007 + (((tickAnim - 12) / 3) * (6.74189-(-0.74007)));
            zz = 6.62093 + (((tickAnim - 12) / 3) * (21.41047-(6.62093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.07684 + (((tickAnim - 0) / 2) * (1.9895-(2.07684)));
            yy = 10.84664 + (((tickAnim - 0) / 2) * (6.13169-(10.84664)));
            zz = 0.49028 + (((tickAnim - 0) / 2) * (1.25997-(0.49028)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.9895 + (((tickAnim - 2) / 1) * (2.17673-(1.9895)));
            yy = 6.13169 + (((tickAnim - 2) / 1) * (1.49541-(6.13169)));
            zz = 1.25997 + (((tickAnim - 2) / 1) * (6.04898-(1.25997)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.17673 + (((tickAnim - 3) / 5) * (2.07684-(2.17673)));
            yy = 1.49541 + (((tickAnim - 3) / 5) * (-10.84664-(1.49541)));
            zz = 6.04898 + (((tickAnim - 3) / 5) * (-0.49028-(6.04898)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.07684 + (((tickAnim - 8) / 1) * (1.9895-(2.07684)));
            yy = -10.84664 + (((tickAnim - 8) / 1) * (-6.13169-(-10.84664)));
            zz = -0.49028 + (((tickAnim - 8) / 1) * (-1.25997-(-0.49028)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 1.9895 + (((tickAnim - 9) / 2) * (2.17673-(1.9895)));
            yy = -6.13169 + (((tickAnim - 9) / 2) * (-1.49541-(-6.13169)));
            zz = -1.25997 + (((tickAnim - 9) / 2) * (-6.04898-(-1.25997)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 2.17673 + (((tickAnim - 11) / 4) * (2.07684-(2.17673)));
            yy = -1.49541 + (((tickAnim - 11) / 4) * (10.84664-(-1.49541)));
            zz = -6.04898 + (((tickAnim - 11) / 4) * (0.49028-(-6.04898)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.94734-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-11.37748-(0)));
            zz = 24 + (((tickAnim - 0) / 3) * (25.83833-(24)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 20.94734 + (((tickAnim - 3) / 1) * (21.4307-(20.94734)));
            yy = -11.37748 + (((tickAnim - 3) / 1) * (-13.45021-(-11.37748)));
            zz = 25.83833 + (((tickAnim - 3) / 1) * (25.07341-(25.83833)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 21.4307 + (((tickAnim - 4) / 2) * (27.70826-(21.4307)));
            yy = -13.45021 + (((tickAnim - 4) / 2) * (-19.28646-(-13.45021)));
            zz = 25.07341 + (((tickAnim - 4) / 2) * (25.30047-(25.07341)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 27.70826 + (((tickAnim - 6) / 2) * (62.84201-(27.70826)));
            yy = -19.28646 + (((tickAnim - 6) / 2) * (-34.13243-(-19.28646)));
            zz = 25.30047 + (((tickAnim - 6) / 2) * (11.51499-(25.30047)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 62.84201 + (((tickAnim - 8) / 1) * (47.98499-(62.84201)));
            yy = -34.13243 + (((tickAnim - 8) / 1) * (-7.56616-(-34.13243)));
            zz = 11.51499 + (((tickAnim - 8) / 1) * (-9.4302-(11.51499)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 47.98499 + (((tickAnim - 9) / 1) * (40.75706-(47.98499)));
            yy = -7.56616 + (((tickAnim - 9) / 1) * (0.82352-(-7.56616)));
            zz = -9.4302 + (((tickAnim - 9) / 1) * (-13.63415-(-9.4302)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 40.75706 + (((tickAnim - 10) / 2) * (27.76127-(40.75706)));
            yy = 0.82352 + (((tickAnim - 10) / 2) * (-0.33805-(0.82352)));
            zz = -13.63415 + (((tickAnim - 10) / 2) * (4.87719-(-13.63415)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 27.76127 + (((tickAnim - 12) / 1) * (-21.28608-(27.76127)));
            yy = -0.33805 + (((tickAnim - 12) / 1) * (27.80694-(-0.33805)));
            zz = 4.87719 + (((tickAnim - 12) / 1) * (10.82058-(4.87719)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -21.28608 + (((tickAnim - 13) / 2) * (0-(-21.28608)));
            yy = 27.80694 + (((tickAnim - 13) / 2) * (0-(27.80694)));
            zz = 10.82058 + (((tickAnim - 13) / 2) * (24-(10.82058)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 21.12244 + (((tickAnim - 0) / 3) * (20.89103-(21.12244)));
            yy = -9.58063 + (((tickAnim - 0) / 3) * (-13.58198-(-9.58063)));
            zz = -21.04937 + (((tickAnim - 0) / 3) * (-18.03582-(-21.04937)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 20.89103 + (((tickAnim - 3) / 1) * (39.83588-(20.89103)));
            yy = -13.58198 + (((tickAnim - 3) / 1) * (-23.3059-(-13.58198)));
            zz = -18.03582 + (((tickAnim - 3) / 1) * (-40.3998-(-18.03582)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 39.83588 + (((tickAnim - 4) / 2) * (58.67466-(39.83588)));
            yy = -23.3059 + (((tickAnim - 4) / 2) * (-32.51495-(-23.3059)));
            zz = -40.3998 + (((tickAnim - 4) / 2) * (-62.86572-(-40.3998)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 58.67466 + (((tickAnim - 6) / 2) * (64.90546-(58.67466)));
            yy = -32.51495 + (((tickAnim - 6) / 2) * (-42.2-(-32.51495)));
            zz = -62.86572 + (((tickAnim - 6) / 2) * (-73.44597-(-62.86572)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 64.90546 + (((tickAnim - 8) / 1) * (40.70956-(64.90546)));
            yy = -42.2 + (((tickAnim - 8) / 1) * (-20.2225-(-42.2)));
            zz = -73.44597 + (((tickAnim - 8) / 1) * (-34.41437-(-73.44597)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 40.70956 + (((tickAnim - 9) / 1) * (17.47332-(40.70956)));
            yy = -20.2225 + (((tickAnim - 9) / 1) * (-2.39942-(-20.2225)));
            zz = -34.41437 + (((tickAnim - 9) / 1) * (-17.11255-(-34.41437)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 17.47332 + (((tickAnim - 10) / 2) * (-22.25645-(17.47332)));
            yy = -2.39942 + (((tickAnim - 10) / 2) * (2.30895-(-2.39942)));
            zz = -17.11255 + (((tickAnim - 10) / 2) * (-23.88869-(-17.11255)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -22.25645 + (((tickAnim - 12) / 1) * (-49.28448-(-22.25645)));
            yy = 2.30895 + (((tickAnim - 12) / 1) * (0.55945-(2.30895)));
            zz = -23.88869 + (((tickAnim - 12) / 1) * (51.1038-(-23.88869)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -49.28448 + (((tickAnim - 13) / 2) * (21.12244-(-49.28448)));
            yy = 0.55945 + (((tickAnim - 13) / 2) * (-9.58063-(0.55945)));
            zz = 51.1038 + (((tickAnim - 13) / 2) * (-21.04937-(51.1038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(xx), leftLowerArm.rotateAngleY + (float) Math.toRadians(yy), leftLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.16117 + (((tickAnim - 0) / 3) * (-43.29184-(-4.16117)));
            yy = 29.61508 + (((tickAnim - 0) / 3) * (33.38258-(29.61508)));
            zz = 13.27959 + (((tickAnim - 0) / 3) * (-0.11988-(13.27959)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -43.29184 + (((tickAnim - 3) / 1) * (-44.6943-(-43.29184)));
            yy = 33.38258 + (((tickAnim - 3) / 1) * (35.42367-(33.38258)));
            zz = -0.11988 + (((tickAnim - 3) / 1) * (17.40929-(-0.11988)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -44.6943 + (((tickAnim - 4) / 2) * (-30.78115-(-44.6943)));
            yy = 35.42367 + (((tickAnim - 4) / 2) * (31.15656-(35.42367)));
            zz = 17.40929 + (((tickAnim - 4) / 2) * (38.0622-(17.40929)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -30.78115 + (((tickAnim - 6) / 2) * (3.87213-(-30.78115)));
            yy = 31.15656 + (((tickAnim - 6) / 2) * (41.58223-(31.15656)));
            zz = 38.0622 + (((tickAnim - 6) / 2) * (-24.04674-(38.0622)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 3.87213 + (((tickAnim - 8) / 1) * (-6.43166-(3.87213)));
            yy = 41.58223 + (((tickAnim - 8) / 1) * (31.60264-(41.58223)));
            zz = -24.04674 + (((tickAnim - 8) / 1) * (-30.15973-(-24.04674)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -6.43166 + (((tickAnim - 9) / 1) * (62.89271-(-6.43166)));
            yy = 31.60264 + (((tickAnim - 9) / 1) * (21.87926-(31.60264)));
            zz = -30.15973 + (((tickAnim - 9) / 1) * (-8.6792-(-30.15973)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 62.89271 + (((tickAnim - 10) / 2) * (40.10218-(62.89271)));
            yy = 21.87926 + (((tickAnim - 10) / 2) * (3.34446-(21.87926)));
            zz = -8.6792 + (((tickAnim - 10) / 2) * (-1.60791-(-8.6792)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 40.10218 + (((tickAnim - 12) / 1) * (63.65273-(40.10218)));
            yy = 3.34446 + (((tickAnim - 12) / 1) * (50.59879-(3.34446)));
            zz = -1.60791 + (((tickAnim - 12) / 1) * (29.38327-(-1.60791)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 63.65273 + (((tickAnim - 13) / 2) * (-4.16117-(63.65273)));
            yy = 50.59879 + (((tickAnim - 13) / 2) * (29.61508-(50.59879)));
            zz = 29.38327 + (((tickAnim - 13) / 2) * (13.27959-(29.38327)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 62.84201 + (((tickAnim - 0) / 2) * (47.98499-(62.84201)));
            yy = 34.13243 + (((tickAnim - 0) / 2) * (7.56616-(34.13243)));
            zz = -11.51499 + (((tickAnim - 0) / 2) * (9.4302-(-11.51499)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 47.98499 + (((tickAnim - 2) / 1) * (40.75706-(47.98499)));
            yy = 7.56616 + (((tickAnim - 2) / 1) * (-0.82352-(7.56616)));
            zz = 9.4302 + (((tickAnim - 2) / 1) * (13.63415-(9.4302)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 40.75706 + (((tickAnim - 3) / 1) * (27.76127-(40.75706)));
            yy = -0.82352 + (((tickAnim - 3) / 1) * (0.33805-(-0.82352)));
            zz = 13.63415 + (((tickAnim - 3) / 1) * (-4.87719-(13.63415)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 27.76127 + (((tickAnim - 4) / 2) * (-21.28608-(27.76127)));
            yy = 0.33805 + (((tickAnim - 4) / 2) * (-27.80694-(0.33805)));
            zz = -4.87719 + (((tickAnim - 4) / 2) * (-10.82058-(-4.87719)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -21.28608 + (((tickAnim - 6) / 2) * (0-(-21.28608)));
            yy = -27.80694 + (((tickAnim - 6) / 2) * (0-(-27.80694)));
            zz = -10.82058 + (((tickAnim - 6) / 2) * (-24-(-10.82058)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (20.94734-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (11.37748-(0)));
            zz = -24 + (((tickAnim - 8) / 2) * (-25.83833-(-24)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 20.94734 + (((tickAnim - 10) / 2) * (21.4307-(20.94734)));
            yy = 11.37748 + (((tickAnim - 10) / 2) * (13.45021-(11.37748)));
            zz = -25.83833 + (((tickAnim - 10) / 2) * (-25.07341-(-25.83833)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 21.4307 + (((tickAnim - 12) / 1) * (27.70826-(21.4307)));
            yy = 13.45021 + (((tickAnim - 12) / 1) * (19.28646-(13.45021)));
            zz = -25.07341 + (((tickAnim - 12) / 1) * (-25.30047-(-25.07341)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 27.70826 + (((tickAnim - 13) / 2) * (62.84201-(27.70826)));
            yy = 19.28646 + (((tickAnim - 13) / 2) * (34.13243-(19.28646)));
            zz = -25.30047 + (((tickAnim - 13) / 2) * (-11.51499-(-25.30047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 64.90546 + (((tickAnim - 0) / 2) * (40.70956-(64.90546)));
            yy = 42.2 + (((tickAnim - 0) / 2) * (20.2225-(42.2)));
            zz = 73.44597 + (((tickAnim - 0) / 2) * (34.41437-(73.44597)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 40.70956 + (((tickAnim - 2) / 1) * (17.47332-(40.70956)));
            yy = 20.2225 + (((tickAnim - 2) / 1) * (2.39942-(20.2225)));
            zz = 34.41437 + (((tickAnim - 2) / 1) * (17.11255-(34.41437)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 17.47332 + (((tickAnim - 3) / 1) * (-22.25645-(17.47332)));
            yy = 2.39942 + (((tickAnim - 3) / 1) * (-2.30895-(2.39942)));
            zz = 17.11255 + (((tickAnim - 3) / 1) * (23.88869-(17.11255)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -22.25645 + (((tickAnim - 4) / 2) * (-49.28448-(-22.25645)));
            yy = -2.30895 + (((tickAnim - 4) / 2) * (-0.55945-(-2.30895)));
            zz = 23.88869 + (((tickAnim - 4) / 2) * (-51.1038-(23.88869)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -49.28448 + (((tickAnim - 6) / 2) * (21.12244-(-49.28448)));
            yy = -0.55945 + (((tickAnim - 6) / 2) * (9.58063-(-0.55945)));
            zz = -51.1038 + (((tickAnim - 6) / 2) * (21.04937-(-51.1038)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 21.12244 + (((tickAnim - 8) / 2) * (20.89103-(21.12244)));
            yy = 9.58063 + (((tickAnim - 8) / 2) * (13.58198-(9.58063)));
            zz = 21.04937 + (((tickAnim - 8) / 2) * (18.03582-(21.04937)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 20.89103 + (((tickAnim - 10) / 2) * (39.83588-(20.89103)));
            yy = 13.58198 + (((tickAnim - 10) / 2) * (23.3059-(13.58198)));
            zz = 18.03582 + (((tickAnim - 10) / 2) * (40.3998-(18.03582)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 39.83588 + (((tickAnim - 12) / 1) * (58.67466-(39.83588)));
            yy = 23.3059 + (((tickAnim - 12) / 1) * (32.51495-(23.3059)));
            zz = 40.3998 + (((tickAnim - 12) / 1) * (62.86572-(40.3998)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 58.67466 + (((tickAnim - 13) / 2) * (64.90546-(58.67466)));
            yy = 32.51495 + (((tickAnim - 13) / 2) * (42.2-(32.51495)));
            zz = 62.86572 + (((tickAnim - 13) / 2) * (73.44597-(62.86572)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(xx), rightLowerArm.rotateAngleY + (float) Math.toRadians(yy), rightLowerArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.87213 + (((tickAnim - 0) / 2) * (-6.43166-(3.87213)));
            yy = -41.58223 + (((tickAnim - 0) / 2) * (-31.60264-(-41.58223)));
            zz = 24.04674 + (((tickAnim - 0) / 2) * (30.15973-(24.04674)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -6.43166 + (((tickAnim - 2) / 1) * (62.89271-(-6.43166)));
            yy = -31.60264 + (((tickAnim - 2) / 1) * (-21.87926-(-31.60264)));
            zz = 30.15973 + (((tickAnim - 2) / 1) * (8.6792-(30.15973)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 62.89271 + (((tickAnim - 3) / 1) * (40.10218-(62.89271)));
            yy = -21.87926 + (((tickAnim - 3) / 1) * (-3.34446-(-21.87926)));
            zz = 8.6792 + (((tickAnim - 3) / 1) * (1.60791-(8.6792)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 40.10218 + (((tickAnim - 4) / 2) * (63.65273-(40.10218)));
            yy = -3.34446 + (((tickAnim - 4) / 2) * (-50.59879-(-3.34446)));
            zz = 1.60791 + (((tickAnim - 4) / 2) * (-29.38327-(1.60791)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 63.65273 + (((tickAnim - 6) / 2) * (-4.16117-(63.65273)));
            yy = -50.59879 + (((tickAnim - 6) / 2) * (-29.61508-(-50.59879)));
            zz = -29.38327 + (((tickAnim - 6) / 2) * (-13.27959-(-29.38327)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.16117 + (((tickAnim - 8) / 2) * (-43.29184-(-4.16117)));
            yy = -29.61508 + (((tickAnim - 8) / 2) * (-33.38258-(-29.61508)));
            zz = -13.27959 + (((tickAnim - 8) / 2) * (0.11988-(-13.27959)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -43.29184 + (((tickAnim - 10) / 2) * (-52.14846-(-43.29184)));
            yy = -33.38258 + (((tickAnim - 10) / 2) * (-34.59332-(-33.38258)));
            zz = 0.11988 + (((tickAnim - 10) / 2) * (-3.30835-(0.11988)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -52.14846 + (((tickAnim - 12) / 1) * (-30.78115-(-52.14846)));
            yy = -34.59332 + (((tickAnim - 12) / 1) * (-31.15656-(-34.59332)));
            zz = -3.30835 + (((tickAnim - 12) / 1) * (-38.0622-(-3.30835)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -30.78115 + (((tickAnim - 13) / 2) * (3.87213-(-30.78115)));
            yy = -31.15656 + (((tickAnim - 13) / 2) * (-41.58223-(-31.15656)));
            zz = -38.0622 + (((tickAnim - 13) / 2) * (24.04674-(-38.0622)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.28923 + (((tickAnim - 0) / 3) * (-3.70216-(0.28923)));
            yy = 4.09008 + (((tickAnim - 0) / 3) * (0.19144-(4.09008)));
            zz = -12.95852 + (((tickAnim - 0) / 3) * (-1.47625-(-12.95852)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.70216 + (((tickAnim - 3) / 5) * (0.28923-(-3.70216)));
            yy = 0.19144 + (((tickAnim - 3) / 5) * (-4.09008-(0.19144)));
            zz = -1.47625 + (((tickAnim - 3) / 5) * (12.95852-(-1.47625)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0.28923 + (((tickAnim - 8) / 4) * (-3.70216-(0.28923)));
            yy = -4.09008 + (((tickAnim - 8) / 4) * (-0.19144-(-4.09008)));
            zz = 12.95852 + (((tickAnim - 8) / 4) * (1.47625-(12.95852)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -3.70216 + (((tickAnim - 12) / 3) * (0.28923-(-3.70216)));
            yy = -0.19144 + (((tickAnim - 12) / 3) * (4.09008-(-0.19144)));
            zz = 1.47625 + (((tickAnim - 12) / 3) * (-12.95852-(1.47625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.78943 + (((tickAnim - 0) / 8) * (0.78943-(0.78943)));
            yy = -5.94799 + (((tickAnim - 0) / 8) * (5.94799-(-5.94799)));
            zz = -0.01915 + (((tickAnim - 0) / 8) * (0.01915-(-0.01915)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.78943 + (((tickAnim - 8) / 7) * (0.78943-(0.78943)));
            yy = 5.94799 + (((tickAnim - 8) / 7) * (-5.94799-(5.94799)));
            zz = 0.01915 + (((tickAnim - 8) / 7) * (-0.01915-(0.01915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.26669 + (((tickAnim - 0) / 8) * (0.26669-(0.26669)));
            yy = -6.9759 + (((tickAnim - 0) / 8) * (6.9759-(-6.9759)));
            zz = 6.50418 + (((tickAnim - 0) / 8) * (-6.50418-(6.50418)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.26669 + (((tickAnim - 8) / 7) * (0.26669-(0.26669)));
            yy = 6.9759 + (((tickAnim - 8) / 7) * (-6.9759-(6.9759)));
            zz = -6.50418 + (((tickAnim - 8) / 7) * (6.50418-(-6.50418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -37.60476 + (((tickAnim - 0) / 3) * (-14.9474-(-37.60476)));
            yy = 33.91509 + (((tickAnim - 0) / 3) * (27.1347-(33.91509)));
            zz = 1.56456 + (((tickAnim - 0) / 3) * (-28.1153-(1.56456)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -14.9474 + (((tickAnim - 3) / 1) * (11.35354-(-14.9474)));
            yy = 27.1347 + (((tickAnim - 3) / 1) * (58.90522-(27.1347)));
            zz = -28.1153 + (((tickAnim - 3) / 1) * (-28.21865-(-28.1153)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 11.35354 + (((tickAnim - 4) / 2) * (36.642-(11.35354)));
            yy = 58.90522 + (((tickAnim - 4) / 2) * (66.69527-(58.90522)));
            zz = -28.21865 + (((tickAnim - 4) / 2) * (-28.63323-(-28.21865)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 36.642 + (((tickAnim - 6) / 2) * (51.56366-(36.642)));
            yy = 66.69527 + (((tickAnim - 6) / 2) * (38.23328-(66.69527)));
            zz = -28.63323 + (((tickAnim - 6) / 2) * (-14.66445-(-28.63323)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 51.56366 + (((tickAnim - 8) / 2) * (19.37402-(51.56366)));
            yy = 38.23328 + (((tickAnim - 8) / 2) * (35.77851-(38.23328)));
            zz = -14.66445 + (((tickAnim - 8) / 2) * (-9.64345-(-14.66445)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 19.37402 + (((tickAnim - 10) / 2) * (5.05877-(19.37402)));
            yy = 35.77851 + (((tickAnim - 10) / 2) * (2.14834-(35.77851)));
            zz = -9.64345 + (((tickAnim - 10) / 2) * (-3.45134-(-9.64345)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 5.05877 + (((tickAnim - 12) / 1) * (-0.67108-(5.05877)));
            yy = 2.14834 + (((tickAnim - 12) / 1) * (3.80102-(2.14834)));
            zz = -3.45134 + (((tickAnim - 12) / 1) * (5.21609-(-3.45134)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.67108 + (((tickAnim - 13) / 2) * (-37.60476-(-0.67108)));
            yy = 3.80102 + (((tickAnim - 13) / 2) * (33.91509-(3.80102)));
            zz = 5.21609 + (((tickAnim - 13) / 2) * (1.56456-(5.21609)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(xx), rightUpperLeg.rotateAngleY + (float) Math.toRadians(yy), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.70908 + (((tickAnim - 0) / 3) * (-10.16539-(-12.70908)));
            yy = -3.52238 + (((tickAnim - 0) / 3) * (-10.53669-(-3.52238)));
            zz = -4.39196 + (((tickAnim - 0) / 3) * (2.542-(-4.39196)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -10.16539 + (((tickAnim - 3) / 1) * (-20.04691-(-10.16539)));
            yy = -10.53669 + (((tickAnim - 3) / 1) * (-37.76221-(-10.53669)));
            zz = 2.542 + (((tickAnim - 3) / 1) * (-3.39967-(2.542)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -20.04691 + (((tickAnim - 4) / 2) * (-30.71672-(-20.04691)));
            yy = -37.76221 + (((tickAnim - 4) / 2) * (-39.06875-(-37.76221)));
            zz = -3.39967 + (((tickAnim - 4) / 2) * (-7.51304-(-3.39967)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -30.71672 + (((tickAnim - 6) / 2) * (-25.33169-(-30.71672)));
            yy = -39.06875 + (((tickAnim - 6) / 2) * (-37.80571-(-39.06875)));
            zz = -7.51304 + (((tickAnim - 6) / 2) * (18.33275-(-7.51304)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25.33169 + (((tickAnim - 8) / 2) * (12.79084-(-25.33169)));
            yy = -37.80571 + (((tickAnim - 8) / 2) * (-27.69141-(-37.80571)));
            zz = 18.33275 + (((tickAnim - 8) / 2) * (12.3066-(18.33275)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 12.79084 + (((tickAnim - 10) / 2) * (15.353-(12.79084)));
            yy = -27.69141 + (((tickAnim - 10) / 2) * (0.00004-(-27.69141)));
            zz = 12.3066 + (((tickAnim - 10) / 2) * (10.22554-(12.3066)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 15.353 + (((tickAnim - 12) / 1) * (-6.14623-(15.353)));
            yy = 0.00004 + (((tickAnim - 12) / 1) * (0.78294-(0.00004)));
            zz = 10.22554 + (((tickAnim - 12) / 1) * (4.69621-(10.22554)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -6.14623 + (((tickAnim - 13) / 2) * (-12.70908-(-6.14623)));
            yy = 0.78294 + (((tickAnim - 13) / 2) * (-3.52238-(0.78294)));
            zz = 4.69621 + (((tickAnim - 13) / 2) * (-4.39196-(4.69621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(xx), rightLowerLeg.rotateAngleY + (float) Math.toRadians(yy), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 51.56366 + (((tickAnim - 0) / 3) * (19.37402-(51.56366)));
            yy = -38.23328 + (((tickAnim - 0) / 3) * (-35.77851-(-38.23328)));
            zz = 14.66445 + (((tickAnim - 0) / 3) * (9.64345-(14.66445)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 19.37402 + (((tickAnim - 3) / 1) * (5.05877-(19.37402)));
            yy = -35.77851 + (((tickAnim - 3) / 1) * (-2.14834-(-35.77851)));
            zz = 9.64345 + (((tickAnim - 3) / 1) * (3.45134-(9.64345)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 5.05877 + (((tickAnim - 4) / 2) * (-0.67108-(5.05877)));
            yy = -2.14834 + (((tickAnim - 4) / 2) * (-3.80102-(-2.14834)));
            zz = 3.45134 + (((tickAnim - 4) / 2) * (-5.21609-(3.45134)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.67108 + (((tickAnim - 6) / 2) * (-37.60476-(-0.67108)));
            yy = -3.80102 + (((tickAnim - 6) / 2) * (-33.91509-(-3.80102)));
            zz = -5.21609 + (((tickAnim - 6) / 2) * (-1.56456-(-5.21609)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.60476 + (((tickAnim - 8) / 2) * (-14.9474-(-37.60476)));
            yy = -33.91509 + (((tickAnim - 8) / 2) * (-27.1347-(-33.91509)));
            zz = -1.56456 + (((tickAnim - 8) / 2) * (28.1153-(-1.56456)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -14.9474 + (((tickAnim - 10) / 2) * (11.35354-(-14.9474)));
            yy = -27.1347 + (((tickAnim - 10) / 2) * (-58.90522-(-27.1347)));
            zz = 28.1153 + (((tickAnim - 10) / 2) * (28.21865-(28.1153)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 11.35354 + (((tickAnim - 12) / 1) * (36.642-(11.35354)));
            yy = -58.90522 + (((tickAnim - 12) / 1) * (-66.69527-(-58.90522)));
            zz = 28.21865 + (((tickAnim - 12) / 1) * (28.63323-(28.21865)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 36.642 + (((tickAnim - 13) / 2) * (51.56366-(36.642)));
            yy = -66.69527 + (((tickAnim - 13) / 2) * (-38.23328-(-66.69527)));
            zz = 28.63323 + (((tickAnim - 13) / 2) * (14.66445-(28.63323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(xx), leftUpperLeg.rotateAngleY + (float) Math.toRadians(yy), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -25.33169 + (((tickAnim - 0) / 3) * (12.79084-(-25.33169)));
            yy = 37.80571 + (((tickAnim - 0) / 3) * (27.69141-(37.80571)));
            zz = -18.33275 + (((tickAnim - 0) / 3) * (-12.3066-(-18.33275)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 12.79084 + (((tickAnim - 3) / 1) * (15.353-(12.79084)));
            yy = 27.69141 + (((tickAnim - 3) / 1) * (-0.00004-(27.69141)));
            zz = -12.3066 + (((tickAnim - 3) / 1) * (-10.22554-(-12.3066)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 15.353 + (((tickAnim - 4) / 2) * (-6.14623-(15.353)));
            yy = -0.00004 + (((tickAnim - 4) / 2) * (-0.78294-(-0.00004)));
            zz = -10.22554 + (((tickAnim - 4) / 2) * (-4.69621-(-10.22554)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.14623 + (((tickAnim - 6) / 2) * (-12.70908-(-6.14623)));
            yy = -0.78294 + (((tickAnim - 6) / 2) * (3.52238-(-0.78294)));
            zz = -4.69621 + (((tickAnim - 6) / 2) * (4.39196-(-4.69621)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.70908 + (((tickAnim - 8) / 2) * (-10.16539-(-12.70908)));
            yy = 3.52238 + (((tickAnim - 8) / 2) * (10.53669-(3.52238)));
            zz = 4.39196 + (((tickAnim - 8) / 2) * (-2.542-(4.39196)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -10.16539 + (((tickAnim - 10) / 2) * (-20.04691-(-10.16539)));
            yy = 10.53669 + (((tickAnim - 10) / 2) * (37.76221-(10.53669)));
            zz = -2.542 + (((tickAnim - 10) / 2) * (3.39967-(-2.542)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -20.04691 + (((tickAnim - 12) / 1) * (-30.71672-(-20.04691)));
            yy = 37.76221 + (((tickAnim - 12) / 1) * (39.06875-(37.76221)));
            zz = 3.39967 + (((tickAnim - 12) / 1) * (7.51304-(3.39967)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -30.71672 + (((tickAnim - 13) / 2) * (-25.33169-(-30.71672)));
            yy = 39.06875 + (((tickAnim - 13) / 2) * (37.80571-(39.06875)));
            zz = 7.51304 + (((tickAnim - 13) / 2) * (-18.33275-(7.51304)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(xx), leftLowerLeg.rotateAngleY + (float) Math.toRadians(yy), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 361.28145 + (((tickAnim - 0) / 3) * (291.95418-(361.28145)));
            yy = -28.61353 + (((tickAnim - 0) / 3) * (-19.59154-(-28.61353)));
            zz = -311.69181 + (((tickAnim - 0) / 3) * (-282.82986-(-311.69181)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 291.95418 + (((tickAnim - 3) / 1) * (341.34926-(291.95418)));
            yy = -19.59154 + (((tickAnim - 3) / 1) * (0.42157-(-19.59154)));
            zz = -282.82986 + (((tickAnim - 3) / 1) * (-349.2445-(-282.82986)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 341.34926 + (((tickAnim - 4) / 2) * (358.10746-(341.34926)));
            yy = 0.42157 + (((tickAnim - 4) / 2) * (98.96998-(0.42157)));
            zz = -349.2445 + (((tickAnim - 4) / 2) * (-182.52358-(-349.2445)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 358.10746 + (((tickAnim - 6) / 2) * (296.43107-(358.10746)));
            yy = 98.96998 + (((tickAnim - 6) / 2) * (70.02007-(98.96998)));
            zz = -182.52358 + (((tickAnim - 6) / 2) * (-266.00558-(-182.52358)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 296.43107 + (((tickAnim - 8) / 2) * (339.56485-(296.43107)));
            yy = 70.02007 + (((tickAnim - 8) / 2) * (64.22594-(70.02007)));
            zz = -266.00558 + (((tickAnim - 8) / 2) * (-234.2542-(-266.00558)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 339.56485 + (((tickAnim - 10) / 2) * (342.37429-(339.56485)));
            yy = 64.22594 + (((tickAnim - 10) / 2) * (76.77836-(64.22594)));
            zz = -234.2542 + (((tickAnim - 10) / 2) * (-222.94561-(-234.2542)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 342.37429 + (((tickAnim - 12) / 1) * (349.02491-(342.37429)));
            yy = 76.77836 + (((tickAnim - 12) / 1) * (91.02218-(76.77836)));
            zz = -222.94561 + (((tickAnim - 12) / 1) * (-208.10611-(-222.94561)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 349.02491 + (((tickAnim - 13) / 2) * (361.28145-(349.02491)));
            yy = 91.02218 + (((tickAnim - 13) / 2) * (-28.61353-(91.02218)));
            zz = -208.10611 + (((tickAnim - 13) / 2) * (-311.69181-(-208.10611)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 296.43107 + (((tickAnim - 0) / 3) * (339.56485-(296.43107)));
            yy = -70.02007 + (((tickAnim - 0) / 3) * (-64.22594-(-70.02007)));
            zz = 266.00558 + (((tickAnim - 0) / 3) * (234.2542-(266.00558)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 339.56485 + (((tickAnim - 3) / 1) * (342.37429-(339.56485)));
            yy = -64.22594 + (((tickAnim - 3) / 1) * (-76.77836-(-64.22594)));
            zz = 234.2542 + (((tickAnim - 3) / 1) * (222.94561-(234.2542)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 342.37429 + (((tickAnim - 4) / 2) * (349.02491-(342.37429)));
            yy = -76.77836 + (((tickAnim - 4) / 2) * (-91.02218-(-76.77836)));
            zz = 222.94561 + (((tickAnim - 4) / 2) * (208.10611-(222.94561)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 349.02491 + (((tickAnim - 6) / 2) * (361.28145-(349.02491)));
            yy = -91.02218 + (((tickAnim - 6) / 2) * (28.61353-(-91.02218)));
            zz = 208.10611 + (((tickAnim - 6) / 2) * (311.69181-(208.10611)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 361.28145 + (((tickAnim - 8) / 2) * (291.95418-(361.28145)));
            yy = 28.61353 + (((tickAnim - 8) / 2) * (19.59154-(28.61353)));
            zz = 311.69181 + (((tickAnim - 8) / 2) * (282.82986-(311.69181)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 291.95418 + (((tickAnim - 10) / 2) * (341.34926-(291.95418)));
            yy = 19.59154 + (((tickAnim - 10) / 2) * (-0.42157-(19.59154)));
            zz = 282.82986 + (((tickAnim - 10) / 2) * (349.2445-(282.82986)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 341.34926 + (((tickAnim - 12) / 1) * (358.10746-(341.34926)));
            yy = -0.42157 + (((tickAnim - 12) / 1) * (-98.96998-(-0.42157)));
            zz = 349.2445 + (((tickAnim - 12) / 1) * (182.52358-(349.2445)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 358.10746 + (((tickAnim - 13) / 2) * (296.43107-(358.10746)));
            yy = -98.96998 + (((tickAnim - 13) / 2) * (-70.02007-(-98.96998)));
            zz = 182.52358 + (((tickAnim - 13) / 2) * (266.00558-(182.52358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.6198 + (((tickAnim - 0) / 3) * (-3.9141-(1.6198)));
            yy = 6.7622 + (((tickAnim - 0) / 3) * (-0.0262-(6.7622)));
            zz = 0.5869 + (((tickAnim - 0) / 3) * (-0.0019-(0.5869)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.9141 + (((tickAnim - 3) / 5) * (1.7759-(-3.9141)));
            yy = -0.0262 + (((tickAnim - 3) / 5) * (-6.8619-(-0.0262)));
            zz = -0.0019 + (((tickAnim - 3) / 5) * (-0.605-(-0.0019)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.7759 + (((tickAnim - 8) / 2) * (-3.9141-(1.7759)));
            yy = -6.8619 + (((tickAnim - 8) / 2) * (0.0262-(-6.8619)));
            zz = -0.605 + (((tickAnim - 8) / 2) * (0.0019-(-0.605)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.9141 + (((tickAnim - 10) / 5) * (1.6198-(-3.9141)));
            yy = 0.0262 + (((tickAnim - 10) / 5) * (6.7622-(0.0262)));
            zz = 0.0019 + (((tickAnim - 10) / 5) * (0.5869-(0.0019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.6925 + (((tickAnim - 0) / 3) * (-1.1773-(-4.6925)));
            yy = 3.3172 + (((tickAnim - 0) / 3) * (0.1218-(3.3172)));
            zz = -0.2135 + (((tickAnim - 0) / 3) * (-0.0032-(-0.2135)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -1.1773 + (((tickAnim - 3) / 5) * (-4.6342-(-1.1773)));
            yy = 0.1218 + (((tickAnim - 3) / 5) * (-0.3783-(0.1218)));
            zz = -0.0032 + (((tickAnim - 3) / 5) * (-0.1084-(-0.0032)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.6342 + (((tickAnim - 8) / 2) * (-1.1773-(-4.6342)));
            yy = -0.3783 + (((tickAnim - 8) / 2) * (-0.1218-(-0.3783)));
            zz = -0.1084 + (((tickAnim - 8) / 2) * (0.0032-(-0.1084)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -1.1773 + (((tickAnim - 10) / 5) * (-4.6925-(-1.1773)));
            yy = -0.1218 + (((tickAnim - 10) / 5) * (3.3172-(-0.1218)));
            zz = 0.0032 + (((tickAnim - 10) / 5) * (-0.2135-(0.0032)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.5346 + (((tickAnim - 0) / 3) * (1.0153-(0.5346)));
            yy = -0.9874 + (((tickAnim - 0) / 3) * (-0.0825-(-0.9874)));
            zz = -0.001 + (((tickAnim - 0) / 3) * (0.0012-(-0.001)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.0153 + (((tickAnim - 3) / 5) * (2.39767-(1.0153)));
            yy = -0.0825 + (((tickAnim - 3) / 5) * (-6.84882-(-0.0825)));
            zz = 0.0012 + (((tickAnim - 3) / 5) * (-15.98515-(0.0012)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.39767 + (((tickAnim - 8) / 2) * (1.0153-(2.39767)));
            yy = -6.84882 + (((tickAnim - 8) / 2) * (0.0825-(-6.84882)));
            zz = -15.98515 + (((tickAnim - 8) / 2) * (-0.0012-(-15.98515)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.0153 + (((tickAnim - 10) / 5) * (0.5346-(1.0153)));
            yy = 0.0825 + (((tickAnim - 10) / 5) * (-0.9874-(0.0825)));
            zz = -0.0012 + (((tickAnim - 10) / 5) * (-0.001-(-0.0012)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.2163 + (((tickAnim - 0) / 3) * (-1.556-(0.2163)));
            yy = 6.1916 + (((tickAnim - 0) / 3) * (7.2578-(6.1916)));
            zz = -0.0881 + (((tickAnim - 0) / 3) * (-0.5175-(-0.0881)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.556 + (((tickAnim - 3) / 2) * (-3.0979-(-1.556)));
            yy = 7.2578 + (((tickAnim - 3) / 2) * (2.78065-(7.2578)));
            zz = -0.5175 + (((tickAnim - 3) / 2) * (-0.24605-(-0.5175)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3.0979 + (((tickAnim - 5) / 3) * (-0.6398-(-3.0979)));
            yy = 2.78065 + (((tickAnim - 5) / 3) * (-1.6965-(2.78065)));
            zz = -0.24605 + (((tickAnim - 5) / 3) * (0.0254-(-0.24605)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.6398 + (((tickAnim - 8) / 2) * (-1.556-(-0.6398)));
            yy = -1.6965 + (((tickAnim - 8) / 2) * (-7.2578-(-1.6965)));
            zz = 0.0254 + (((tickAnim - 8) / 2) * (0.5175-(0.0254)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -1.556 + (((tickAnim - 10) / 5) * (0.2163-(-1.556)));
            yy = -7.2578 + (((tickAnim - 10) / 5) * (6.1916-(-7.2578)));
            zz = 0.5175 + (((tickAnim - 10) / 5) * (-0.0881-(0.5175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4 + (((tickAnim - 3) / 2) * (5-(4)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 5) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (4-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4 + (((tickAnim - 10) / 5) * (0-(4)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnkylosphenodon e = (EntityPrehistoricFloraAnkylosphenodon) entity;
        animator.update(entity);

    }
}
