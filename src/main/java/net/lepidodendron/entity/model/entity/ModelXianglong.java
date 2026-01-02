package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraXianglong;
import net.lepidodendron.entity.EntityPrehistoricFloraXianglong;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelXianglong extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neckpouch;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightWing1;
    private final AdvancedModelRenderer rightWing2;
    private final AdvancedModelRenderer rightWing3;
    private final AdvancedModelRenderer rightWing4;
    private final AdvancedModelRenderer leftWing1;
    private final AdvancedModelRenderer leftWing2;
    private final AdvancedModelRenderer leftWing3;
    private final AdvancedModelRenderer leftWing4;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;

    private ModelAnimator animator;

    public ModelXianglong() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 23.5F, 3.3F);
        this.setRotateAngle(root, -0.0873F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 39, 27, -1.5F, -2.5F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 39, -1.5F, -0.4F, 3.0F, 3, 1, 3, -0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.1F, -0.6803F, -0.147F);
        this.root.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.0931F, -0.34F, 0.1171F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 27, 16, -0.75F, -1.0F, -1.0F, 6, 1, 2, 0.01F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(4.8455F, -0.0127F, -0.8606F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.005F, -1.1376F, 0.0464F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.125F, 0.0F, 0.375F);
        this.leftLeg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0349F, -0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 0, -0.2457F, -0.9755F, -0.7528F, 4, 1, 1, 0.0F, true));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(3.5133F, 0.0625F, 0.7052F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.1087F, 0.6622F, -0.2857F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.475F, 0.0F, 0.475F);
        this.leftFoot.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0218F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 23, -0.7962F, -0.097F, -1.8835F, 5, 0, 4, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.1F, -0.6803F, -0.147F);
        this.root.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.0931F, 0.34F, -0.1171F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 27, 16, -5.25F, -1.0F, -1.0F, 6, 1, 2, 0.01F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-4.8455F, -0.0127F, -0.8606F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.005F, 1.1376F, -0.0464F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.125F, 0.0F, 0.375F);
        this.rightLeg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 0, -3.7543F, -0.9755F, -0.7528F, 4, 1, 1, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-3.5133F, 0.0625F, 0.7052F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.1087F, -0.6622F, 0.2857F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.475F, 0.0F, 0.475F);
        this.rightFoot.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0218F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 23, -4.2038F, -0.097F, -1.8835F, 5, 0, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.4F, 3.0F);
        this.root.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 28, -1.0F, -1.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1054F, 2.9766F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0524F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 29, 0, -0.25F, -0.25F, -0.5F, 1, 1, 5, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 30, -0.75F, -0.2491F, -0.525F, 1, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 30, -0.775F, -0.75F, -0.5F, 1, 1, 5, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 20, -0.25F, -0.75F, -0.5F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0214F, 0.0374F, 4.2913F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0305F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 37, -0.4786F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 35, -0.4786F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 26, 37, -0.4786F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, 0.5F);
        this.root.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 7, -2.0F, -1.5F, -6.0F, 4, 3, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 21, 7, -2.0F, -1.5F, -5.0F, 4, 3, 5, 0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.3721F, -4.2236F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(11.5F, 1.7866F, -2.2751F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1222F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 23, -13.0F, -2.0737F, -1.351F, 3, 2, 4, 0.0F, false));

        this.neckpouch = new AdvancedModelRenderer(this);
        this.neckpouch.setRotationPoint(11.0F, 1.7866F, -3.6751F);
        this.neck.addChild(neckpouch);
        this.setRotateAngle(neckpouch, -0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-11.0F, -0.1749F, 0.5221F);
        this.neckpouch.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 33, -1.0F, -0.8251F, -0.5221F, 2, 1, 4, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.7866F, -2.9251F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 40, 11, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.9163F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 20, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.025F, -2.1F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0393F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 3, -1.5F, -1.1996F, -0.1009F, 2, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.525F, 0.5F, -3.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0018F, -0.7677F, -0.0118F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 47, 0.0F, -1.0F, 0.175F, 1, 1, 1, -0.02F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 47, 0.0F, -1.0F, -0.025F, 1, 1, 1, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.525F, 0.5F, -3.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0018F, 0.7677F, 0.0118F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 48, -1.0F, -1.0F, 0.175F, 1, 1, 1, -0.02F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 47, 22, -1.0F, -1.0F, -0.025F, 1, 1, 1, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.025F, 0.5F, -2.15F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0004F, -0.0874F, 0.0057F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 44, -0.2989F, -0.9983F, 0.0262F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.025F, 0.5F, -2.15F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0004F, 0.0874F, -0.0057F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 44, -0.7011F, -0.9983F, 0.0262F, 1, 1, 2, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.2F, -0.225F, -1.5F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.1745F, -0.0873F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.25F, 0.5F);
        this.eyeleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.016F, 0.1737F, 0.0035F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 27, -0.5904F, -0.9579F, -1.1322F, 1, 1, 1, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.2F, -0.225F, -1.5F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, -0.1745F, 0.0873F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.25F, 0.5F);
        this.eyeright.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.016F, -0.1737F, -0.0035F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 47, -0.4096F, -0.9579F, -1.1322F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 42, -0.5F, -0.5F, -2.9F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.5F, -2.9F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0057F, 0.7553F, 0.0061F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 47, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.5F, -2.9F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0057F, -0.7553F, -0.0061F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 47, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.2991F, 0.5F, -0.5801F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0013F, -0.0577F, -0.0165F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 47, 0.0175F, -0.9834F, -1.6252F, 1, 1, 2, -0.02F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.2991F, 0.5F, -0.5801F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0013F, 0.0577F, 0.0165F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 47, -1.0175F, -0.9834F, -1.6252F, 1, 1, 2, -0.02F, false));

        this.rightWing1 = new AdvancedModelRenderer(this);
        this.rightWing1.setRotationPoint(-1.8F, -1.0F, -3.0F);
        this.chest.addChild(rightWing1);
        this.setRotateAngle(rightWing1, 0.0F, 1.2654F, 0.0F);
        this.rightWing1.cubeList.add(new ModelBox(rightWing1, 0, 0, -11.0F, 0.0F, 0.0F, 11, 0, 3, 0.0F, false));

        this.rightWing2 = new AdvancedModelRenderer(this);
        this.rightWing2.setRotationPoint(1.0F, 0.025F, 2.975F);
        this.rightWing1.addChild(rightWing2);
        this.setRotateAngle(rightWing2, -3.1241F, 0.0873F, 0.0F);
        this.rightWing2.cubeList.add(new ModelBox(rightWing2, 0, 17, -12.0F, 0.0F, 0.0F, 11, 0, 2, 0.0F, false));

        this.rightWing3 = new AdvancedModelRenderer(this);
        this.rightWing3.setRotationPoint(-6.5F, 0.025F, 1.975F);
        this.rightWing2.addChild(rightWing3);
        this.setRotateAngle(rightWing3, -3.1416F, 0.0F, 0.0F);
        this.rightWing3.cubeList.add(new ModelBox(rightWing3, 0, 20, -5.5F, 0.0F, 0.0F, 11, 0, 2, 0.0F, false));

        this.rightWing4 = new AdvancedModelRenderer(this);
        this.rightWing4.setRotationPoint(0.5F, 0.025F, 1.975F);
        this.rightWing3.addChild(rightWing4);
        this.setRotateAngle(rightWing4, 3.1241F, 0.0F, 0.0F);
        this.rightWing4.cubeList.add(new ModelBox(rightWing4, 0, 4, -6.0F, 0.0F, 0.0F, 12, 0, 2, 0.0F, false));

        this.leftWing1 = new AdvancedModelRenderer(this);
        this.leftWing1.setRotationPoint(1.8F, -1.0F, -3.0F);
        this.chest.addChild(leftWing1);
        this.setRotateAngle(leftWing1, 0.0F, -1.2654F, 0.0F);
        this.leftWing1.cubeList.add(new ModelBox(leftWing1, 0, 0, 0.0F, 0.0F, 0.0F, 11, 0, 3, 0.0F, true));

        this.leftWing2 = new AdvancedModelRenderer(this);
        this.leftWing2.setRotationPoint(-1.0F, 0.025F, 2.975F);
        this.leftWing1.addChild(leftWing2);
        this.setRotateAngle(leftWing2, -3.1241F, -0.0873F, 0.0F);
        this.leftWing2.cubeList.add(new ModelBox(leftWing2, 0, 17, 1.0F, 0.0F, 0.0F, 11, 0, 2, 0.0F, true));

        this.leftWing3 = new AdvancedModelRenderer(this);
        this.leftWing3.setRotationPoint(6.5F, 0.025F, 1.975F);
        this.leftWing2.addChild(leftWing3);
        this.setRotateAngle(leftWing3, -3.1416F, 0.0F, 0.0F);
        this.leftWing3.cubeList.add(new ModelBox(leftWing3, 0, 20, -5.5F, 0.0F, 0.0F, 11, 0, 2, 0.0F, true));

        this.leftWing4 = new AdvancedModelRenderer(this);
        this.leftWing4.setRotationPoint(-0.5F, 0.025F, 1.975F);
        this.leftWing3.addChild(leftWing4);
        this.setRotateAngle(leftWing4, 3.1241F, 0.0F, 0.0F);
        this.leftWing4.cubeList.add(new ModelBox(leftWing4, 0, 4, -6.0F, 0.0F, 0.0F, 12, 0, 2, 0.0F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.6795F, 0.1974F, -4.0188F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.056F, -0.2331F, 0.256F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 44, 16, -0.2444F, -0.606F, -0.7888F, 3, 1, 1, 0.01F, true));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 18, 44, -0.2444F, -0.606F, -0.2888F, 3, 1, 1, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.3731F, -0.0506F, 0.2144F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.7874F, 1.3541F, 0.7996F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 9, 44, -0.25F, -0.5F, -0.5F, 3, 1, 1, -0.01F, true));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(2.738F, 0.1784F, -0.0186F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2484F, 0.1275F, -0.1696F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 40, 7, -1.0483F, 0.0496F, -1.4917F, 3, 0, 3, 0.0F, true));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.6795F, 0.1974F, -4.0188F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.056F, 0.2331F, -0.256F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 44, 16, -2.7556F, -0.606F, -0.7888F, 3, 1, 1, 0.01F, false));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 18, 44, -2.7556F, -0.606F, -0.2888F, 3, 1, 1, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.3731F, -0.0506F, 0.2144F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.7874F, -1.3541F, -0.7996F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 9, 44, -2.75F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-2.738F, 0.1784F, -0.0186F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2484F, -0.1275F, 0.1696F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 40, 7, -1.9517F, 0.0496F, -1.4917F, 3, 0, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void renderStaticWall(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.30F;
        this.root.offsetX = -0.05F;
        this.root.rotateAngleY = (float)Math.toRadians(210);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.9F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraXianglong ee = (EntityPrehistoricFloraXianglong) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.25F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
            this.chainSwing(Tail, 0.2F, -0.1F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraXianglong ee = (EntityPrehistoricFloraXianglong) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (ee.getHeadCollided()) {
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
                else {
                    //Just pose with no animation running:
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else if (ee.getIsMoving()) {
                if (!ee.getIsFlying()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
                else {
                    //Is gliding:
                    animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                }
            }
        }
        else {
            animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXianglong entity = (EntityPrehistoricFloraXianglong) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19.75 + (((tickAnim - 10) / 10) * (0-(19.75)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 22.25 + (((tickAnim - 5) / 5) * (0-(22.25)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 5) / 5) * (0-(0.275)));
            zz = 0.425 + (((tickAnim - 5) / 5) * (0-(0.425)));
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
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (23-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23 + (((tickAnim - 8) / 2) * (0-(23)));
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
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraXianglong entity = (EntityPrehistoricFloraXianglong) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(leftWing1, leftWing1.rotateAngleX + (float) Math.toRadians(0), leftWing1.rotateAngleY + (float) Math.toRadians(72), leftWing1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(179.46177), leftWing2.rotateAngleY + (float) Math.toRadians(6.43383), leftWing2.rotateAngleZ + (float) Math.toRadians(-0.01843));
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(179.99987), leftWing3.rotateAngleY + (float) Math.toRadians(-0.36735), leftWing3.rotateAngleZ + (float) Math.toRadians(0.03981));
        this.setRotateAngle(leftWing4, leftWing4.rotateAngleX + (float) Math.toRadians(180.00004), leftWing4.rotateAngleY + (float) Math.toRadians(-0.13263), leftWing4.rotateAngleZ + (float) Math.toRadians(-0.03578));
        this.setRotateAngle(rightWing1, rightWing1.rotateAngleX + (float) Math.toRadians(0), rightWing1.rotateAngleY + (float) Math.toRadians(-72), rightWing1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(179.46177), rightWing2.rotateAngleY + (float) Math.toRadians(-6.43383), rightWing2.rotateAngleZ + (float) Math.toRadians(0.01843));
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(179.99987), rightWing3.rotateAngleY + (float) Math.toRadians(0.36735), rightWing3.rotateAngleZ + (float) Math.toRadians(-0.03981));
        this.setRotateAngle(rightWing4, rightWing4.rotateAngleX + (float) Math.toRadians(180.00004), rightWing4.rotateAngleY + (float) Math.toRadians(0.13263), rightWing4.rotateAngleZ + (float) Math.toRadians(0.03578));
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*236))*5), root.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(-0.38407), leftLeg1.rotateAngleY + (float) Math.toRadians(2.43742), leftLeg1.rotateAngleZ + (float) Math.toRadians(-2.39724));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(33.25), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(-0.38407), rightLeg1.rotateAngleY + (float) Math.toRadians(-2.43742), rightLeg1.rotateAngleZ + (float) Math.toRadians(2.39724));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(-33.25), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*236-50))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*236-100))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*236-150))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*236-200))*5), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*236-250))*5), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*236-200))*5), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*236-300))*-5), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(10.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*236-350))*5), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0), leftArm1.rotateAngleY + (float) Math.toRadians(13.75), leftArm1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-33.97664), leftArm2.rotateAngleY + (float) Math.toRadians(-25.95757), leftArm2.rotateAngleZ + (float) Math.toRadians(-49.19902));
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0), rightArm1.rotateAngleY + (float) Math.toRadians(-13.75), rightArm1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-33.97664), rightArm2.rotateAngleY + (float) Math.toRadians(25.95757), rightArm2.rotateAngleZ + (float) Math.toRadians(49.19902));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraXianglong entity = (EntityPrehistoricFloraXianglong) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*10), root.rotateAngleZ + (float) Math.toRadians(0));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*0.7);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.48674 + (((tickAnim - 0) / 3) * (9.6581-(1.48674)));
            yy = -30.60006 + (((tickAnim - 0) / 3) * (8.35894-(-30.60006)));
            zz = -1.93979 + (((tickAnim - 0) / 3) * (-16.52386-(-1.93979)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 9.6581 + (((tickAnim - 3) / 2) * (-16.18839-(9.6581)));
            yy = 8.35894 + (((tickAnim - 3) / 2) * (53.29752-(8.35894)));
            zz = -16.52386 + (((tickAnim - 3) / 2) * (-1.28374-(-16.52386)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -16.18839 + (((tickAnim - 5) / 5) * (1.48674-(-16.18839)));
            yy = 53.29752 + (((tickAnim - 5) / 5) * (-30.60006-(53.29752)));
            zz = -1.28374 + (((tickAnim - 5) / 5) * (-1.93979-(-1.28374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.34103-(0)));
            yy = 35.5 + (((tickAnim - 0) / 3) * (24.24198-(35.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (11.24414-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.34103 + (((tickAnim - 3) / 2) * (17.75151-(-0.34103)));
            yy = 24.24198 + (((tickAnim - 3) / 2) * (14.48508-(24.24198)));
            zz = 11.24414 + (((tickAnim - 3) / 2) * (-5.77488-(11.24414)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.75151 + (((tickAnim - 5) / 5) * (0-(17.75151)));
            yy = 14.48508 + (((tickAnim - 5) / 5) * (35.5-(14.48508)));
            zz = -5.77488 + (((tickAnim - 5) / 5) * (0-(-5.77488)));
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
            zz = 0.15 + (((tickAnim - 0) / 5) * (0-(0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.15-(0)));
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
            xx = 4.27226 + (((tickAnim - 0) / 3) * (74.72862-(4.27226)));
            yy = 0.03616 + (((tickAnim - 0) / 3) * (-43.85609-(0.03616)));
            zz = 5.313 + (((tickAnim - 0) / 3) * (24.78923-(5.313)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 74.72862 + (((tickAnim - 3) / 2) * (9.5-(74.72862)));
            yy = -43.85609 + (((tickAnim - 3) / 2) * (51.75-(-43.85609)));
            zz = 24.78923 + (((tickAnim - 3) / 2) * (0-(24.78923)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 9.5 + (((tickAnim - 5) / 3) * (0-(9.5)));
            yy = 51.75 + (((tickAnim - 5) / 3) * (73.5-(51.75)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (4.27226-(0)));
            yy = 73.5 + (((tickAnim - 8) / 2) * (-0.03616-(73.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (5.313-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.5 + (((tickAnim - 3) / 2) * (0-(-1.5)));
            yy = 0.1 + (((tickAnim - 3) / 2) * (0-(0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 8) / 2) * (0-(0.175)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
            xx = -16.18839 + (((tickAnim - 0) / 5) * (1.48674-(-16.18839)));
            yy = -53.29752 + (((tickAnim - 0) / 5) * (30.60006-(-53.29752)));
            zz = 1.28374 + (((tickAnim - 0) / 5) * (1.93979-(1.28374)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.48674 + (((tickAnim - 5) / 3) * (9.6581-(1.48674)));
            yy = 30.60006 + (((tickAnim - 5) / 3) * (-8.35894-(30.60006)));
            zz = 1.93979 + (((tickAnim - 5) / 3) * (16.52386-(1.93979)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 9.6581 + (((tickAnim - 8) / 2) * (-16.18839-(9.6581)));
            yy = -8.35894 + (((tickAnim - 8) / 2) * (-53.29752-(-8.35894)));
            zz = 16.52386 + (((tickAnim - 8) / 2) * (1.28374-(16.52386)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.75151 + (((tickAnim - 0) / 5) * (0-(17.75151)));
            yy = -14.48508 + (((tickAnim - 0) / 5) * (-35.5-(-14.48508)));
            zz = 5.77488 + (((tickAnim - 0) / 5) * (0-(5.77488)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-0.34103-(0)));
            yy = -35.5 + (((tickAnim - 5) / 3) * (-24.24198-(-35.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (-11.24414-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.34103 + (((tickAnim - 8) / 2) * (17.75151-(-0.34103)));
            yy = -24.24198 + (((tickAnim - 8) / 2) * (-14.48508-(-24.24198)));
            zz = -11.24414 + (((tickAnim - 8) / 2) * (5.77488-(-11.24414)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.15-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.15 + (((tickAnim - 5) / 5) * (0-(0.15)));
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
            xx = 9.5 + (((tickAnim - 0) / 3) * (0-(9.5)));
            yy = -51.75 + (((tickAnim - 0) / 3) * (-73.5-(-51.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (4.27226-(0)));
            yy = -73.5 + (((tickAnim - 3) / 2) * (-0.03616-(-73.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (5.313-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.27226 + (((tickAnim - 5) / 3) * (74.72862-(4.27226)));
            yy = -0.03616 + (((tickAnim - 5) / 3) * (43.85609-(-0.03616)));
            zz = 5.313 + (((tickAnim - 5) / 3) * (-24.78923-(5.313)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 74.72862 + (((tickAnim - 8) / 2) * (9.5-(74.72862)));
            yy = 43.85609 + (((tickAnim - 8) / 2) * (-51.75-(43.85609)));
            zz = -24.78923 + (((tickAnim - 8) / 2) * (0-(-24.78923)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 3) / 2) * (0-(0.175)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.1-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 8) / 2) * (0-(1.5)));
            yy = 0.1 + (((tickAnim - 8) / 2) * (0-(0.1)));
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



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*10), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*10), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*10), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*10), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-10), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*10), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*10), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-10), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (76.525-(0)));
            yy = 39.75 + (((tickAnim - 0) / 5) * (-53.13862-(39.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (-43.62514-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 76.525 + (((tickAnim - 5) / 3) * (-5.65654-(76.525)));
            yy = -53.13862 + (((tickAnim - 5) / 3) * (16.48024-(-53.13862)));
            zz = -43.62514 + (((tickAnim - 5) / 3) * (-32.45396-(-43.62514)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5.65654 + (((tickAnim - 8) / 2) * (0-(-5.65654)));
            yy = 16.48024 + (((tickAnim - 8) / 2) * (39.75-(16.48024)));
            zz = -32.45396 + (((tickAnim - 8) / 2) * (0-(-32.45396)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -26.05693 + (((tickAnim - 0) / 5) * (0-(-26.05693)));
            yy = -26.07537 + (((tickAnim - 0) / 5) * (0-(-26.07537)));
            zz = -25.0488 + (((tickAnim - 0) / 5) * (0-(-25.0488)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-18.28849-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (-40.12039-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-18.09104-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -18.28849 + (((tickAnim - 6) / 2) * (-18.47517-(-18.28849)));
            yy = -40.12039 + (((tickAnim - 6) / 2) * (-45.68945-(-40.12039)));
            zz = -18.09104 + (((tickAnim - 6) / 2) * (-14.38421-(-18.09104)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.47517 + (((tickAnim - 8) / 2) * (-26.05693-(-18.47517)));
            yy = -45.68945 + (((tickAnim - 8) / 2) * (-26.07537-(-45.68945)));
            zz = -14.38421 + (((tickAnim - 8) / 2) * (-25.0488-(-14.38421)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-38.42864-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (33.16211-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-45.77593-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -38.42864 + (((tickAnim - 3) / 2) * (-30.75-(-38.42864)));
            yy = 33.16211 + (((tickAnim - 3) / 2) * (0-(33.16211)));
            zz = -45.77593 + (((tickAnim - 3) / 2) * (-44.5-(-45.77593)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -30.75 + (((tickAnim - 5) / 1) * (-15.50012-(-30.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (-26.89346-(0)));
            zz = -44.5 + (((tickAnim - 5) / 1) * (27.73302-(-44.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -15.50012 + (((tickAnim - 6) / 2) * (-9.09164-(-15.50012)));
            yy = -26.89346 + (((tickAnim - 6) / 2) * (-1.98416-(-26.89346)));
            zz = 27.73302 + (((tickAnim - 6) / 2) * (30.81187-(27.73302)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -9.09164 + (((tickAnim - 8) / 0) * (-12.18587-(-9.09164)));
            yy = -1.98416 + (((tickAnim - 8) / 0) * (1.4588-(-1.98416)));
            zz = 30.81187 + (((tickAnim - 8) / 0) * (-0.80039-(30.81187)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.18587 + (((tickAnim - 8) / 2) * (0-(-12.18587)));
            yy = 1.4588 + (((tickAnim - 8) / 2) * (0-(1.4588)));
            zz = -0.80039 + (((tickAnim - 8) / 2) * (0-(-0.80039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.02-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.44-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.17-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -0.02 + (((tickAnim - 1) / 2) * (-0.05-(-0.02)));
            yy = 0.44 + (((tickAnim - 1) / 2) * (0.485-(0.44)));
            zz = -0.17 + (((tickAnim - 1) / 2) * (-0.35-(-0.17)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.05 + (((tickAnim - 3) / 2) * (0-(-0.05)));
            yy = 0.485 + (((tickAnim - 3) / 2) * (0.625-(0.485)));
            zz = -0.35 + (((tickAnim - 3) / 2) * (0-(-0.35)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.625 + (((tickAnim - 5) / 1) * (0.31-(0.625)));
            zz = 0 + (((tickAnim - 5) / 1) * (0.275-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.31 + (((tickAnim - 6) / 2) * (0-(0.31)));
            zz = 0.275 + (((tickAnim - 6) / 2) * (0-(0.275)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0.15-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 8) / 2) * (0-(0.15)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
            xx = 76.525 + (((tickAnim - 0) / 3) * (-5.65654-(76.525)));
            yy = 53.13862 + (((tickAnim - 0) / 3) * (-16.48024-(53.13862)));
            zz = 43.62514 + (((tickAnim - 0) / 3) * (32.45396-(43.62514)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5.65654 + (((tickAnim - 3) / 2) * (0-(-5.65654)));
            yy = -16.48024 + (((tickAnim - 3) / 2) * (-39.75-(-16.48024)));
            zz = 32.45396 + (((tickAnim - 3) / 2) * (0-(32.45396)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (76.525-(0)));
            yy = -39.75 + (((tickAnim - 5) / 5) * (53.13862-(-39.75)));
            zz = 0 + (((tickAnim - 5) / 5) * (43.62514-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-18.28849-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (40.12039-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (18.09104-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -18.28849 + (((tickAnim - 1) / 2) * (-18.47517-(-18.28849)));
            yy = 40.12039 + (((tickAnim - 1) / 2) * (45.68945-(40.12039)));
            zz = 18.09104 + (((tickAnim - 1) / 2) * (14.38421-(18.09104)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.47517 + (((tickAnim - 3) / 2) * (-26.05693-(-18.47517)));
            yy = 45.68945 + (((tickAnim - 3) / 2) * (26.07537-(45.68945)));
            zz = 14.38421 + (((tickAnim - 3) / 2) * (25.0488-(14.38421)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -26.05693 + (((tickAnim - 5) / 5) * (0-(-26.05693)));
            yy = 26.07537 + (((tickAnim - 5) / 5) * (0-(26.07537)));
            zz = 25.0488 + (((tickAnim - 5) / 5) * (0-(25.0488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -30.75 + (((tickAnim - 0) / 1) * (-15.50012-(-30.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (26.89346-(0)));
            zz = 44.5 + (((tickAnim - 0) / 1) * (-27.73302-(44.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -15.50012 + (((tickAnim - 1) / 2) * (-9.09164-(-15.50012)));
            yy = 26.89346 + (((tickAnim - 1) / 2) * (1.98416-(26.89346)));
            zz = -27.73302 + (((tickAnim - 1) / 2) * (-30.81187-(-27.73302)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -9.09164 + (((tickAnim - 3) / 0) * (-12.18587-(-9.09164)));
            yy = 1.98416 + (((tickAnim - 3) / 0) * (1.4588-(1.98416)));
            zz = -30.81187 + (((tickAnim - 3) / 0) * (-0.80039-(-30.81187)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -12.18587 + (((tickAnim - 3) / 2) * (0-(-12.18587)));
            yy = 1.4588 + (((tickAnim - 3) / 2) * (0-(1.4588)));
            zz = -0.80039 + (((tickAnim - 3) / 2) * (0-(-0.80039)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-38.60197-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-32.16862-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (48.76956-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -38.60197 + (((tickAnim - 8) / 2) * (-30.75-(-38.60197)));
            yy = -32.16862 + (((tickAnim - 8) / 2) * (0-(-32.16862)));
            zz = 48.76956 + (((tickAnim - 8) / 2) * (44.5-(48.76956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 1) * (0.31-(0.625)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.275-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.31 + (((tickAnim - 1) / 2) * (0-(0.31)));
            zz = 0.275 + (((tickAnim - 1) / 2) * (0-(0.275)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0.15-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 3) / 2) * (0-(0.15)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-0.02-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.515-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.17-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.02 + (((tickAnim - 6) / 2) * (-0.05-(-0.02)));
            yy = 0.515 + (((tickAnim - 6) / 2) * (0.485-(0.515)));
            zz = -0.17 + (((tickAnim - 6) / 2) * (-0.35-(-0.17)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.05 + (((tickAnim - 8) / 2) * (0-(-0.05)));
            yy = 0.485 + (((tickAnim - 8) / 2) * (0.625-(0.485)));
            zz = -0.35 + (((tickAnim - 8) / 2) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraXianglong entity = (EntityPrehistoricFloraXianglong) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), root.rotateAngleZ + (float) Math.toRadians(0));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*0.3);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.48674 + (((tickAnim - 0) / 5) * (9.6581-(1.48674)));
            yy = -30.60006 + (((tickAnim - 0) / 5) * (8.35894-(-30.60006)));
            zz = -1.93979 + (((tickAnim - 0) / 5) * (-16.52386-(-1.93979)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 9.6581 + (((tickAnim - 5) / 5) * (-16.18839-(9.6581)));
            yy = 8.35894 + (((tickAnim - 5) / 5) * (53.29752-(8.35894)));
            zz = -16.52386 + (((tickAnim - 5) / 5) * (-1.28374-(-16.52386)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.18839 + (((tickAnim - 10) / 10) * (1.48674-(-16.18839)));
            yy = 53.29752 + (((tickAnim - 10) / 10) * (-30.60006-(53.29752)));
            zz = -1.28374 + (((tickAnim - 10) / 10) * (-1.93979-(-1.28374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.34103-(0)));
            yy = 35.5 + (((tickAnim - 0) / 5) * (24.24198-(35.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (11.24414-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.34103 + (((tickAnim - 5) / 5) * (17.75151-(-0.34103)));
            yy = 24.24198 + (((tickAnim - 5) / 5) * (14.48508-(24.24198)));
            zz = 11.24414 + (((tickAnim - 5) / 5) * (-5.77488-(11.24414)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.75151 + (((tickAnim - 10) / 10) * (0-(17.75151)));
            yy = 14.48508 + (((tickAnim - 10) / 10) * (35.5-(14.48508)));
            zz = -5.77488 + (((tickAnim - 10) / 10) * (0-(-5.77488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0.15 + (((tickAnim - 0) / 10) * (0-(0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.15-(0)));
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
            xx = 4.27226 + (((tickAnim - 0) / 5) * (74.72862-(4.27226)));
            yy = 0.03616 + (((tickAnim - 0) / 5) * (-43.85609-(0.03616)));
            zz = 5.313 + (((tickAnim - 0) / 5) * (24.78923-(5.313)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 74.72862 + (((tickAnim - 5) / 5) * (9.5-(74.72862)));
            yy = -43.85609 + (((tickAnim - 5) / 5) * (51.75-(-43.85609)));
            zz = 24.78923 + (((tickAnim - 5) / 5) * (0-(24.78923)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 9.5 + (((tickAnim - 10) / 5) * (0-(9.5)));
            yy = 51.75 + (((tickAnim - 10) / 5) * (73.5-(51.75)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (4.27226-(0)));
            yy = 73.5 + (((tickAnim - 15) / 5) * (-0.03616-(73.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (5.313-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.5 + (((tickAnim - 5) / 5) * (0-(-1.5)));
            yy = 0.1 + (((tickAnim - 5) / 5) * (0-(0.1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.175-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 15) / 5) * (0-(0.175)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
            xx = -16.18839 + (((tickAnim - 0) / 10) * (1.48674-(-16.18839)));
            yy = -53.29752 + (((tickAnim - 0) / 10) * (30.60006-(-53.29752)));
            zz = 1.28374 + (((tickAnim - 0) / 10) * (1.93979-(1.28374)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.48674 + (((tickAnim - 10) / 5) * (9.6581-(1.48674)));
            yy = 30.60006 + (((tickAnim - 10) / 5) * (-8.35894-(30.60006)));
            zz = 1.93979 + (((tickAnim - 10) / 5) * (16.52386-(1.93979)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 9.6581 + (((tickAnim - 15) / 5) * (-16.18839-(9.6581)));
            yy = -8.35894 + (((tickAnim - 15) / 5) * (-53.29752-(-8.35894)));
            zz = 16.52386 + (((tickAnim - 15) / 5) * (1.28374-(16.52386)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 17.75151 + (((tickAnim - 0) / 10) * (0-(17.75151)));
            yy = -14.48508 + (((tickAnim - 0) / 10) * (-35.5-(-14.48508)));
            zz = 5.77488 + (((tickAnim - 0) / 10) * (0-(5.77488)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-0.34103-(0)));
            yy = -35.5 + (((tickAnim - 10) / 5) * (-24.24198-(-35.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (-11.24414-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.34103 + (((tickAnim - 15) / 5) * (17.75151-(-0.34103)));
            yy = -24.24198 + (((tickAnim - 15) / 5) * (-14.48508-(-24.24198)));
            zz = -11.24414 + (((tickAnim - 15) / 5) * (5.77488-(-11.24414)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.15 + (((tickAnim - 10) / 10) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.5 + (((tickAnim - 0) / 5) * (0-(9.5)));
            yy = -51.75 + (((tickAnim - 0) / 5) * (-73.5-(-51.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (4.27226-(0)));
            yy = -73.5 + (((tickAnim - 5) / 5) * (-0.03616-(-73.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (5.313-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.27226 + (((tickAnim - 10) / 5) * (74.72862-(4.27226)));
            yy = -0.03616 + (((tickAnim - 10) / 5) * (43.85609-(-0.03616)));
            zz = 5.313 + (((tickAnim - 10) / 5) * (-24.78923-(5.313)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 74.72862 + (((tickAnim - 15) / 5) * (9.5-(74.72862)));
            yy = 43.85609 + (((tickAnim - 15) / 5) * (-51.75-(43.85609)));
            zz = -24.78923 + (((tickAnim - 15) / 5) * (0-(-24.78923)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 5) / 5) * (0-(0.175)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (1.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 15) / 5) * (0-(1.5)));
            yy = 0.1 + (((tickAnim - 15) / 5) * (0-(0.1)));
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



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*5), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*5), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-5), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (76.525-(0)));
            yy = 39.75 + (((tickAnim - 0) / 10) * (-53.13862-(39.75)));
            zz = 0 + (((tickAnim - 0) / 10) * (-43.62514-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 76.525 + (((tickAnim - 10) / 5) * (-5.65654-(76.525)));
            yy = -53.13862 + (((tickAnim - 10) / 5) * (16.48024-(-53.13862)));
            zz = -43.62514 + (((tickAnim - 10) / 5) * (-32.45396-(-43.62514)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5.65654 + (((tickAnim - 15) / 5) * (0-(-5.65654)));
            yy = 16.48024 + (((tickAnim - 15) / 5) * (39.75-(16.48024)));
            zz = -32.45396 + (((tickAnim - 15) / 5) * (0-(-32.45396)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -26.05693 + (((tickAnim - 0) / 10) * (0-(-26.05693)));
            yy = -26.07537 + (((tickAnim - 0) / 10) * (0-(-26.07537)));
            zz = -25.0488 + (((tickAnim - 0) / 10) * (0-(-25.0488)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-18.28849-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-40.12039-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-18.09104-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -18.28849 + (((tickAnim - 13) / 2) * (-18.47517-(-18.28849)));
            yy = -40.12039 + (((tickAnim - 13) / 2) * (-45.68945-(-40.12039)));
            zz = -18.09104 + (((tickAnim - 13) / 2) * (-14.38421-(-18.09104)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -18.47517 + (((tickAnim - 15) / 5) * (-26.05693-(-18.47517)));
            yy = -45.68945 + (((tickAnim - 15) / 5) * (-26.07537-(-45.68945)));
            zz = -14.38421 + (((tickAnim - 15) / 5) * (-25.0488-(-14.38421)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-38.42864-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (33.16211-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-45.77593-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -38.42864 + (((tickAnim - 5) / 5) * (-30.75-(-38.42864)));
            yy = 33.16211 + (((tickAnim - 5) / 5) * (0-(33.16211)));
            zz = -45.77593 + (((tickAnim - 5) / 5) * (-44.5-(-45.77593)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -30.75 + (((tickAnim - 10) / 3) * (-15.50012-(-30.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (-26.89346-(0)));
            zz = -44.5 + (((tickAnim - 10) / 3) * (27.73302-(-44.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -15.50012 + (((tickAnim - 13) / 2) * (-9.09164-(-15.50012)));
            yy = -26.89346 + (((tickAnim - 13) / 2) * (-1.98416-(-26.89346)));
            zz = 27.73302 + (((tickAnim - 13) / 2) * (30.81187-(27.73302)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -9.09164 + (((tickAnim - 15) / 3) * (-12.18587-(-9.09164)));
            yy = -1.98416 + (((tickAnim - 15) / 3) * (1.4588-(-1.98416)));
            zz = 30.81187 + (((tickAnim - 15) / 3) * (-0.80039-(30.81187)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -12.18587 + (((tickAnim - 18) / 2) * (0-(-12.18587)));
            yy = 1.4588 + (((tickAnim - 18) / 2) * (0-(1.4588)));
            zz = -0.80039 + (((tickAnim - 18) / 2) * (0-(-0.80039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.02-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.44-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.17-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.02 + (((tickAnim - 3) / 2) * (-0.05-(-0.02)));
            yy = 0.44 + (((tickAnim - 3) / 2) * (0.485-(0.44)));
            zz = -0.17 + (((tickAnim - 3) / 2) * (-0.35-(-0.17)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.05 + (((tickAnim - 5) / 5) * (0-(-0.05)));
            yy = 0.485 + (((tickAnim - 5) / 5) * (0.625-(0.485)));
            zz = -0.35 + (((tickAnim - 5) / 5) * (0-(-0.35)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 10) / 3) * (0.31-(0.625)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.31 + (((tickAnim - 13) / 2) * (0-(0.31)));
            zz = 0.275 + (((tickAnim - 13) / 2) * (0-(0.275)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 18) / 2) * (0-(0.15)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            xx = 76.525 + (((tickAnim - 0) / 5) * (-5.65654-(76.525)));
            yy = 53.13862 + (((tickAnim - 0) / 5) * (-16.48024-(53.13862)));
            zz = 43.62514 + (((tickAnim - 0) / 5) * (32.45396-(43.62514)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.65654 + (((tickAnim - 5) / 5) * (0-(-5.65654)));
            yy = -16.48024 + (((tickAnim - 5) / 5) * (-39.75-(-16.48024)));
            zz = 32.45396 + (((tickAnim - 5) / 5) * (0-(32.45396)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (76.525-(0)));
            yy = -39.75 + (((tickAnim - 10) / 10) * (53.13862-(-39.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (43.62514-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-18.28849-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (40.12039-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (18.09104-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.28849 + (((tickAnim - 3) / 2) * (-18.47517-(-18.28849)));
            yy = 40.12039 + (((tickAnim - 3) / 2) * (45.68945-(40.12039)));
            zz = 18.09104 + (((tickAnim - 3) / 2) * (14.38421-(18.09104)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.47517 + (((tickAnim - 5) / 5) * (-26.05693-(-18.47517)));
            yy = 45.68945 + (((tickAnim - 5) / 5) * (26.07537-(45.68945)));
            zz = 14.38421 + (((tickAnim - 5) / 5) * (25.0488-(14.38421)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -26.05693 + (((tickAnim - 10) / 10) * (0-(-26.05693)));
            yy = 26.07537 + (((tickAnim - 10) / 10) * (0-(26.07537)));
            zz = 25.0488 + (((tickAnim - 10) / 10) * (0-(25.0488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30.75 + (((tickAnim - 0) / 3) * (-15.50012-(-30.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (26.89346-(0)));
            zz = 44.5 + (((tickAnim - 0) / 3) * (-27.73302-(44.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.50012 + (((tickAnim - 3) / 2) * (-9.09164-(-15.50012)));
            yy = 26.89346 + (((tickAnim - 3) / 2) * (1.98416-(26.89346)));
            zz = -27.73302 + (((tickAnim - 3) / 2) * (-30.81187-(-27.73302)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -9.09164 + (((tickAnim - 5) / 3) * (-12.18587-(-9.09164)));
            yy = 1.98416 + (((tickAnim - 5) / 3) * (1.4588-(1.98416)));
            zz = -30.81187 + (((tickAnim - 5) / 3) * (-0.80039-(-30.81187)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.18587 + (((tickAnim - 8) / 2) * (0-(-12.18587)));
            yy = 1.4588 + (((tickAnim - 8) / 2) * (0-(1.4588)));
            zz = -0.80039 + (((tickAnim - 8) / 2) * (0-(-0.80039)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-38.60197-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-32.16862-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (48.76956-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -38.60197 + (((tickAnim - 15) / 5) * (-30.75-(-38.60197)));
            yy = -32.16862 + (((tickAnim - 15) / 5) * (0-(-32.16862)));
            zz = 48.76956 + (((tickAnim - 15) / 5) * (44.5-(48.76956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 3) * (0.31-(0.625)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.31 + (((tickAnim - 3) / 2) * (0-(0.31)));
            zz = 0.275 + (((tickAnim - 3) / 2) * (0-(0.275)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 8) / 2) * (0-(0.15)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-0.02-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.515-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.17-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.02 + (((tickAnim - 13) / 2) * (-0.05-(-0.02)));
            yy = 0.515 + (((tickAnim - 13) / 2) * (0.485-(0.515)));
            zz = -0.17 + (((tickAnim - 13) / 2) * (-0.35-(-0.17)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.05 + (((tickAnim - 15) / 5) * (0-(-0.05)));
            yy = 0.485 + (((tickAnim - 15) / 5) * (0.625-(0.485)));
            zz = -0.35 + (((tickAnim - 15) / 5) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);

    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraXianglong entity = (EntityPrehistoricFloraXianglong) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), root.rotateAngleZ + (float) Math.toRadians(0));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*0.3);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.48674 + (((tickAnim - 0) / 5) * (9.6581-(1.48674)));
            yy = -30.60006 + (((tickAnim - 0) / 5) * (8.35894-(-30.60006)));
            zz = -1.93979 + (((tickAnim - 0) / 5) * (-16.52386-(-1.93979)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 9.6581 + (((tickAnim - 5) / 5) * (-16.18839-(9.6581)));
            yy = 8.35894 + (((tickAnim - 5) / 5) * (53.29752-(8.35894)));
            zz = -16.52386 + (((tickAnim - 5) / 5) * (-1.28374-(-16.52386)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.18839 + (((tickAnim - 10) / 10) * (1.48674-(-16.18839)));
            yy = 53.29752 + (((tickAnim - 10) / 10) * (-30.60006-(53.29752)));
            zz = -1.28374 + (((tickAnim - 10) / 10) * (-1.93979-(-1.28374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.34103-(0)));
            yy = 35.5 + (((tickAnim - 0) / 5) * (24.24198-(35.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (11.24414-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.34103 + (((tickAnim - 5) / 5) * (17.75151-(-0.34103)));
            yy = 24.24198 + (((tickAnim - 5) / 5) * (14.48508-(24.24198)));
            zz = 11.24414 + (((tickAnim - 5) / 5) * (-5.77488-(11.24414)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.75151 + (((tickAnim - 10) / 10) * (0-(17.75151)));
            yy = 14.48508 + (((tickAnim - 10) / 10) * (35.5-(14.48508)));
            zz = -5.77488 + (((tickAnim - 10) / 10) * (0-(-5.77488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0.15 + (((tickAnim - 0) / 10) * (0-(0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.15-(0)));
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
            xx = 4.27226 + (((tickAnim - 0) / 5) * (74.72862-(4.27226)));
            yy = 0.03616 + (((tickAnim - 0) / 5) * (-43.85609-(0.03616)));
            zz = 5.313 + (((tickAnim - 0) / 5) * (24.78923-(5.313)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 74.72862 + (((tickAnim - 5) / 5) * (9.5-(74.72862)));
            yy = -43.85609 + (((tickAnim - 5) / 5) * (51.75-(-43.85609)));
            zz = 24.78923 + (((tickAnim - 5) / 5) * (0-(24.78923)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 9.5 + (((tickAnim - 10) / 5) * (0-(9.5)));
            yy = 51.75 + (((tickAnim - 10) / 5) * (73.5-(51.75)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (4.27226-(0)));
            yy = 73.5 + (((tickAnim - 15) / 5) * (-0.03616-(73.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (5.313-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.5 + (((tickAnim - 5) / 5) * (0-(-1.5)));
            yy = 0.1 + (((tickAnim - 5) / 5) * (0-(0.1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.175-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 15) / 5) * (0-(0.175)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
            xx = -16.18839 + (((tickAnim - 0) / 10) * (1.48674-(-16.18839)));
            yy = -53.29752 + (((tickAnim - 0) / 10) * (30.60006-(-53.29752)));
            zz = 1.28374 + (((tickAnim - 0) / 10) * (1.93979-(1.28374)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.48674 + (((tickAnim - 10) / 5) * (9.6581-(1.48674)));
            yy = 30.60006 + (((tickAnim - 10) / 5) * (-8.35894-(30.60006)));
            zz = 1.93979 + (((tickAnim - 10) / 5) * (16.52386-(1.93979)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 9.6581 + (((tickAnim - 15) / 5) * (-16.18839-(9.6581)));
            yy = -8.35894 + (((tickAnim - 15) / 5) * (-53.29752-(-8.35894)));
            zz = 16.52386 + (((tickAnim - 15) / 5) * (1.28374-(16.52386)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 17.75151 + (((tickAnim - 0) / 10) * (0-(17.75151)));
            yy = -14.48508 + (((tickAnim - 0) / 10) * (-35.5-(-14.48508)));
            zz = 5.77488 + (((tickAnim - 0) / 10) * (0-(5.77488)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-0.34103-(0)));
            yy = -35.5 + (((tickAnim - 10) / 5) * (-24.24198-(-35.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (-11.24414-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.34103 + (((tickAnim - 15) / 5) * (17.75151-(-0.34103)));
            yy = -24.24198 + (((tickAnim - 15) / 5) * (-14.48508-(-24.24198)));
            zz = -11.24414 + (((tickAnim - 15) / 5) * (5.77488-(-11.24414)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.15 + (((tickAnim - 10) / 10) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.5 + (((tickAnim - 0) / 5) * (0-(9.5)));
            yy = -51.75 + (((tickAnim - 0) / 5) * (-73.5-(-51.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (4.27226-(0)));
            yy = -73.5 + (((tickAnim - 5) / 5) * (-0.03616-(-73.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (5.313-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.27226 + (((tickAnim - 10) / 5) * (74.72862-(4.27226)));
            yy = -0.03616 + (((tickAnim - 10) / 5) * (43.85609-(-0.03616)));
            zz = 5.313 + (((tickAnim - 10) / 5) * (-24.78923-(5.313)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 74.72862 + (((tickAnim - 15) / 5) * (9.5-(74.72862)));
            yy = 43.85609 + (((tickAnim - 15) / 5) * (-51.75-(43.85609)));
            zz = -24.78923 + (((tickAnim - 15) / 5) * (0-(-24.78923)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 5) / 5) * (0-(0.175)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (1.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 15) / 5) * (0-(1.5)));
            yy = 0.1 + (((tickAnim - 15) / 5) * (0-(0.1)));
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



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*5), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*5), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-5), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (76.525-(0)));
            yy = 39.75 + (((tickAnim - 0) / 10) * (-53.13862-(39.75)));
            zz = 0 + (((tickAnim - 0) / 10) * (-43.62514-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 76.525 + (((tickAnim - 10) / 5) * (-5.65654-(76.525)));
            yy = -53.13862 + (((tickAnim - 10) / 5) * (16.48024-(-53.13862)));
            zz = -43.62514 + (((tickAnim - 10) / 5) * (-32.45396-(-43.62514)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5.65654 + (((tickAnim - 15) / 5) * (0-(-5.65654)));
            yy = 16.48024 + (((tickAnim - 15) / 5) * (39.75-(16.48024)));
            zz = -32.45396 + (((tickAnim - 15) / 5) * (0-(-32.45396)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -26.05693 + (((tickAnim - 0) / 10) * (0-(-26.05693)));
            yy = -26.07537 + (((tickAnim - 0) / 10) * (0-(-26.07537)));
            zz = -25.0488 + (((tickAnim - 0) / 10) * (0-(-25.0488)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-18.28849-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-40.12039-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-18.09104-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -18.28849 + (((tickAnim - 13) / 2) * (-18.47517-(-18.28849)));
            yy = -40.12039 + (((tickAnim - 13) / 2) * (-45.68945-(-40.12039)));
            zz = -18.09104 + (((tickAnim - 13) / 2) * (-14.38421-(-18.09104)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -18.47517 + (((tickAnim - 15) / 5) * (-26.05693-(-18.47517)));
            yy = -45.68945 + (((tickAnim - 15) / 5) * (-26.07537-(-45.68945)));
            zz = -14.38421 + (((tickAnim - 15) / 5) * (-25.0488-(-14.38421)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-38.42864-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (33.16211-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-45.77593-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -38.42864 + (((tickAnim - 5) / 5) * (-30.75-(-38.42864)));
            yy = 33.16211 + (((tickAnim - 5) / 5) * (0-(33.16211)));
            zz = -45.77593 + (((tickAnim - 5) / 5) * (-44.5-(-45.77593)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -30.75 + (((tickAnim - 10) / 3) * (-15.50012-(-30.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (-26.89346-(0)));
            zz = -44.5 + (((tickAnim - 10) / 3) * (27.73302-(-44.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -15.50012 + (((tickAnim - 13) / 2) * (-9.09164-(-15.50012)));
            yy = -26.89346 + (((tickAnim - 13) / 2) * (-1.98416-(-26.89346)));
            zz = 27.73302 + (((tickAnim - 13) / 2) * (30.81187-(27.73302)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -9.09164 + (((tickAnim - 15) / 3) * (-12.18587-(-9.09164)));
            yy = -1.98416 + (((tickAnim - 15) / 3) * (1.4588-(-1.98416)));
            zz = 30.81187 + (((tickAnim - 15) / 3) * (-0.80039-(30.81187)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -12.18587 + (((tickAnim - 18) / 2) * (0-(-12.18587)));
            yy = 1.4588 + (((tickAnim - 18) / 2) * (0-(1.4588)));
            zz = -0.80039 + (((tickAnim - 18) / 2) * (0-(-0.80039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.02-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.44-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.17-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.02 + (((tickAnim - 3) / 2) * (-0.05-(-0.02)));
            yy = 0.44 + (((tickAnim - 3) / 2) * (0.485-(0.44)));
            zz = -0.17 + (((tickAnim - 3) / 2) * (-0.35-(-0.17)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.05 + (((tickAnim - 5) / 5) * (0-(-0.05)));
            yy = 0.485 + (((tickAnim - 5) / 5) * (0.625-(0.485)));
            zz = -0.35 + (((tickAnim - 5) / 5) * (0-(-0.35)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 10) / 3) * (0.31-(0.625)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.31 + (((tickAnim - 13) / 2) * (0-(0.31)));
            zz = 0.275 + (((tickAnim - 13) / 2) * (0-(0.275)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 18) / 2) * (0-(0.15)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            xx = 76.525 + (((tickAnim - 0) / 5) * (-5.65654-(76.525)));
            yy = 53.13862 + (((tickAnim - 0) / 5) * (-16.48024-(53.13862)));
            zz = 43.62514 + (((tickAnim - 0) / 5) * (32.45396-(43.62514)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.65654 + (((tickAnim - 5) / 5) * (0-(-5.65654)));
            yy = -16.48024 + (((tickAnim - 5) / 5) * (-39.75-(-16.48024)));
            zz = 32.45396 + (((tickAnim - 5) / 5) * (0-(32.45396)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (76.525-(0)));
            yy = -39.75 + (((tickAnim - 10) / 10) * (53.13862-(-39.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (43.62514-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-18.28849-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (40.12039-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (18.09104-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.28849 + (((tickAnim - 3) / 2) * (-18.47517-(-18.28849)));
            yy = 40.12039 + (((tickAnim - 3) / 2) * (45.68945-(40.12039)));
            zz = 18.09104 + (((tickAnim - 3) / 2) * (14.38421-(18.09104)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.47517 + (((tickAnim - 5) / 5) * (-26.05693-(-18.47517)));
            yy = 45.68945 + (((tickAnim - 5) / 5) * (26.07537-(45.68945)));
            zz = 14.38421 + (((tickAnim - 5) / 5) * (25.0488-(14.38421)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -26.05693 + (((tickAnim - 10) / 10) * (0-(-26.05693)));
            yy = 26.07537 + (((tickAnim - 10) / 10) * (0-(26.07537)));
            zz = 25.0488 + (((tickAnim - 10) / 10) * (0-(25.0488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30.75 + (((tickAnim - 0) / 3) * (-15.50012-(-30.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (26.89346-(0)));
            zz = 44.5 + (((tickAnim - 0) / 3) * (-27.73302-(44.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.50012 + (((tickAnim - 3) / 2) * (-9.09164-(-15.50012)));
            yy = 26.89346 + (((tickAnim - 3) / 2) * (1.98416-(26.89346)));
            zz = -27.73302 + (((tickAnim - 3) / 2) * (-30.81187-(-27.73302)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -9.09164 + (((tickAnim - 5) / 3) * (-12.18587-(-9.09164)));
            yy = 1.98416 + (((tickAnim - 5) / 3) * (1.4588-(1.98416)));
            zz = -30.81187 + (((tickAnim - 5) / 3) * (-0.80039-(-30.81187)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.18587 + (((tickAnim - 8) / 2) * (0-(-12.18587)));
            yy = 1.4588 + (((tickAnim - 8) / 2) * (0-(1.4588)));
            zz = -0.80039 + (((tickAnim - 8) / 2) * (0-(-0.80039)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-38.60197-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-32.16862-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (48.76956-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -38.60197 + (((tickAnim - 15) / 5) * (-30.75-(-38.60197)));
            yy = -32.16862 + (((tickAnim - 15) / 5) * (0-(-32.16862)));
            zz = 48.76956 + (((tickAnim - 15) / 5) * (44.5-(48.76956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 3) * (0.31-(0.625)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.31 + (((tickAnim - 3) / 2) * (0-(0.31)));
            zz = 0.275 + (((tickAnim - 3) / 2) * (0-(0.275)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 8) / 2) * (0-(0.15)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-0.02-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.515-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.17-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.02 + (((tickAnim - 13) / 2) * (-0.05-(-0.02)));
            yy = 0.515 + (((tickAnim - 13) / 2) * (0.485-(0.515)));
            zz = -0.17 + (((tickAnim - 13) / 2) * (-0.35-(-0.17)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.05 + (((tickAnim - 15) / 5) * (0-(-0.05)));
            yy = 0.485 + (((tickAnim - 15) / 5) * (0.625-(0.485)));
            zz = -0.35 + (((tickAnim - 15) / 5) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
