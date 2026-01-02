package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKuehneosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelKuehneosaurus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leftWing;
    private final AdvancedModelRenderer rightWing;
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
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;

    private ModelAnimator animator;

    public ModelKuehneosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 21.1393F, 1.8683F);
        this.setRotateAngle(root, -0.0873F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 19, 0, -1.5F, -0.1244F, -0.3527F, 3, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.5756F, -3.3527F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 7, -1.5F, -0.4F, 3.0F, 3, 1, 4, -0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.6F, 1.8953F, 1.5003F);
        this.root.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0761F, -0.4703F, 0.1307F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 34, 7, -0.75F, -1.0F, -1.0F, 5, 1, 2, 0.01F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.8455F, -0.0127F, -0.3606F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.0029F, -0.7449F, 0.0438F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.125F, 0.0F, 0.375F);
        this.leftLeg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0349F, -0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 40, -0.2457F, -0.9755F, -0.7528F, 4, 1, 1, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(3.5133F, 0.0125F, 0.7052F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2503F, 0.7134F, -0.2353F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.475F, 0.0F, 0.475F);
        this.leftFoot.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0218F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 17, -0.7962F, -0.097F, -1.8835F, 5, 0, 4, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.6F, 1.8953F, 1.5003F);
        this.root.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0761F, 0.4703F, -0.1307F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 34, 7, -4.25F, -1.0F, -1.0F, 5, 1, 2, 0.01F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.8455F, -0.0127F, -0.3606F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.0029F, 0.7449F, -0.0438F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.125F, 0.0F, 0.375F);
        this.rightLeg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 40, -3.7543F, -0.9755F, -0.7528F, 4, 1, 1, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-3.5133F, 0.0125F, 0.7052F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.2503F, -0.7134F, 0.2353F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.475F, 0.0F, 0.475F);
        this.rightFoot.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0218F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 17, -4.2038F, -0.097F, -1.8835F, 5, 0, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.9756F, 3.6473F);
        this.root.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 34, 0, -1.0F, -1.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0946F, 2.9766F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0087F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 20, -0.25F, -0.25F, -0.5F, 1, 1, 5, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 13, -0.75F, -0.2491F, -0.525F, 1, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 22, -0.775F, -0.75F, -0.5F, 1, 1, 5, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 27, -0.25F, -0.75F, -0.5F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0214F, -0.1626F, 4.2913F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0131F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 34, -0.4786F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0349F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 27, -0.4786F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 29, -0.4786F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0087F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 32, 20, -0.4786F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.4756F, 0.1473F);
        this.root.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.4544F, -1.6494F, -5.9573F, 3, 3, 6, 0.01F, false));

        this.leftWing = new AdvancedModelRenderer(this);
        this.leftWing.setRotationPoint(1.5348F, -0.6463F, -6.3224F);
        this.body.addChild(leftWing);
        this.setRotateAngle(leftWing, -0.0001F, -0.1719F, 0.1772F);
        this.leftWing.cubeList.add(new ModelBox(leftWing, 0, 10, 0.0F, 0.0F, 0.0F, 3, 0, 6, 0.0F, false));

        this.rightWing = new AdvancedModelRenderer(this);
        this.rightWing.setRotationPoint(-1.4435F, -0.6463F, -6.3224F);
        this.body.addChild(rightWing);
        this.setRotateAngle(rightWing, -0.0001F, 0.1719F, -0.1772F);
        this.rightWing.cubeList.add(new ModelBox(rightWing, 0, 10, -3.0F, 0.0F, 0.0F, 3, 0, 6, 0.0F, true));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0456F, -0.1494F, -5.4573F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 32, 13, -1.5F, -1.5F, -3.0F, 3, 3, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.3721F, -2.7236F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1365F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(11.0F, 1.7866F, -2.2751F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1222F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 34, -12.0F, -2.0737F, -0.351F, 2, 2, 3, -0.003F, false));

        this.neckpouch = new AdvancedModelRenderer(this);
        this.neckpouch.setRotationPoint(11.0F, 1.7866F, -3.6751F);
        this.neck.addChild(neckpouch);
        this.setRotateAngle(neckpouch, -0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-11.5F, -0.0183F, 0.9998F);
        this.neckpouch.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1527F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 40, 0.0F, -1.0751F, -0.0221F, 1, 1, 3, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.9764F, -2.0261F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 26, 34, -0.5F, -0.4F, -3.6F, 1, 1, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.7406F, -0.6172F, -2.5744F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3052F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 40, 0.0F, 0.2304F, -0.9996F, 1, 1, 3, 0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.7289F, 0.2706F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3488F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 22, 0.0F, 0.3304F, -0.9996F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.7406F, -0.6172F, -2.5744F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3052F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 40, -1.0F, 0.2304F, -0.9996F, 1, 1, 3, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -0.7289F, 0.2706F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3488F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 22, -1.0F, 0.3304F, -0.9996F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.75F, -0.7813F, -1.3069F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0412F, -0.3052F, -0.0124F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 45, 20, -0.45F, -0.25F, -0.8F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.75F, -0.7813F, -1.3069F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0412F, 0.3052F, 0.0124F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 20, -0.55F, -0.25F, -0.8F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.7093F, -1.229F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0393F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 11, -1.0F, -0.575F, 0.175F, 2, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.2038F, -1.7733F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 17, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.8618F, -2.713F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3491F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 45, 14, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.4F, -3.6F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.48F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 44, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.2F, -0.225F, -1.5F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.1745F, -0.0873F);


        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.2F, -0.225F, -1.5F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, -0.1745F, 0.0873F);


        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.6336F, 0.1944F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 27, -0.5F, -0.5F, -3.775F, 1, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 25, 48, -1.0F, -1.45F, -1.275F, 2, 1, 1, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.3416F, 0.4928F, -0.8882F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0048F, 0.3488F, 0.0139F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 41, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.003F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.3417F, 0.5046F, -0.8858F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0096F, -0.305F, 0.032F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 41, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.3417F, 0.5046F, -0.8858F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0096F, 0.305F, -0.032F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 41, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.3416F, 0.4928F, -0.8882F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0048F, -0.3488F, -0.0139F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 41, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.1795F, 0.1974F, -1.6188F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.056F, -0.2331F, 0.256F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 0, 43, -0.2444F, -0.606F, -0.7888F, 3, 1, 1, 0.01F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 44, 43, -0.2444F, -0.606F, -0.3888F, 3, 1, 1, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.3731F, -0.0506F, 0.2144F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.9498F, 1.3824F, 0.9653F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 44, 40, -0.25F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(2.738F, 0.1784F, -0.0186F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2763F, 0.4223F, -0.0866F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 0, 36, -1.0483F, 0.0496F, -1.4917F, 3, 0, 3, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.1795F, 0.1974F, -1.6188F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.056F, 0.2331F, -0.256F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 0, 43, -2.7556F, -0.606F, -0.7888F, 3, 1, 1, 0.01F, true));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 44, 43, -2.7556F, -0.606F, -0.3888F, 3, 1, 1, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.3731F, -0.0506F, 0.2144F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.9498F, -1.3824F, -0.9653F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 44, 40, -2.75F, -0.5F, -0.5F, 3, 1, 1, -0.01F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-2.738F, 0.1784F, -0.0186F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2763F, -0.4223F, 0.0866F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 0, 36, -1.9517F, 0.0496F, -1.4917F, 3, 0, 3, 0.0F, true));

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

        EntityPrehistoricFloraKuehneosaurus ee = (EntityPrehistoricFloraKuehneosaurus) e;

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
        EntityPrehistoricFloraKuehneosaurus ee = (EntityPrehistoricFloraKuehneosaurus) entitylivingbaseIn;

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
        EntityPrehistoricFloraKuehneosaurus entity = (EntityPrehistoricFloraKuehneosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -13.5 + (((tickAnim - 2) / 1) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -13.5 + (((tickAnim - 3) / 3) * (-20.75-(-13.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.75 + (((tickAnim - 6) / 2) * (4.38328-(-20.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (-7.98578-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.47827-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.38328 + (((tickAnim - 8) / 2) * (-3-(4.38328)));
            yy = -7.98578 + (((tickAnim - 8) / 2) * (0-(-7.98578)));
            zz = 0.47827 + (((tickAnim - 8) / 2) * (0-(0.47827)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -3 + (((tickAnim - 10) / 3) * (-19.5-(-3)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -19.5 + (((tickAnim - 13) / 1) * (-12.5-(-19.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 14) / 4) * (-18.75-(-12.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -18.75 + (((tickAnim - 18) / 2) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.4-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.4 + (((tickAnim - 2) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0.4 + (((tickAnim - 3) / 7) * (0-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0.75 + (((tickAnim - 13) / 7) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -17.25 + (((tickAnim - 6) / 4) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (4.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 4.5 + (((tickAnim - 13) / 5) * (10.5-(4.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.5 + (((tickAnim - 18) / 2) * (0-(10.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckpouch, neckpouch.rotateAngleX + (float) Math.toRadians(xx), neckpouch.rotateAngleY + (float) Math.toRadians(yy), neckpouch.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.42-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.35-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.42 + (((tickAnim - 6) / 7) * (0.15-(0.42)));
            zz = 1.35 + (((tickAnim - 6) / 7) * (0-(1.35)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 5) * (0.05-(0.15)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.525-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 18) / 2) * (0-(0.05)));
            zz = 0.525 + (((tickAnim - 18) / 2) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neckpouch.rotationPointX = this.neckpouch.rotationPointX + (float)(xx);
        this.neckpouch.rotationPointY = this.neckpouch.rotationPointY - (float)(yy);
        this.neckpouch.rotationPointZ = this.neckpouch.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 32.75 + (((tickAnim - 2) / 1) * (32.75-(32.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 32.75 + (((tickAnim - 3) / 3) * (57-(32.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 57 + (((tickAnim - 6) / 2) * (5.02508-(57)));
            yy = 0 + (((tickAnim - 6) / 2) * (12.71646-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.46713-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.02508 + (((tickAnim - 8) / 2) * (-30.95015-(5.02508)));
            yy = 12.71646 + (((tickAnim - 8) / 2) * (-1.11244-(12.71646)));
            zz = 0.46713 + (((tickAnim - 8) / 2) * (-5.13111-(0.46713)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -30.95015 + (((tickAnim - 10) / 2) * (-18.70015-(-30.95015)));
            yy = -1.11244 + (((tickAnim - 10) / 2) * (-1.11244-(-1.11244)));
            zz = -5.13111 + (((tickAnim - 10) / 2) * (-5.13111-(-5.13111)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -18.70015 + (((tickAnim - 12) / 1) * (-21.03349-(-18.70015)));
            yy = -1.11244 + (((tickAnim - 12) / 1) * (-1.11244-(-1.11244)));
            zz = -5.13111 + (((tickAnim - 12) / 1) * (-5.13111-(-5.13111)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -21.03349 + (((tickAnim - 13) / 1) * (23.79985-(-21.03349)));
            yy = -1.11244 + (((tickAnim - 13) / 1) * (-1.11244-(-1.11244)));
            zz = -5.13111 + (((tickAnim - 13) / 1) * (-5.13111-(-5.13111)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 23.79985 + (((tickAnim - 14) / 3) * (-14.49503-(23.79985)));
            yy = -1.11244 + (((tickAnim - 14) / 3) * (-2.04045-(-1.11244)));
            zz = -5.13111 + (((tickAnim - 14) / 3) * (-12.57638-(-5.13111)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -14.49503 + (((tickAnim - 17) / 3) * (0-(-14.49503)));
            yy = -2.04045 + (((tickAnim - 17) / 3) * (0-(-2.04045)));
            zz = -12.57638 + (((tickAnim - 17) / 3) * (0-(-12.57638)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.475-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 2) / 1) * (0.25-(0.25)));
            zz = 0.475 + (((tickAnim - 2) / 1) * (0.475-(0.475)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 3) * (0.8-(0.25)));
            zz = 0.475 + (((tickAnim - 3) / 3) * (0.855-(0.475)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 6) / 4) * (0-(0.8)));
            zz = 0.855 + (((tickAnim - 6) / 4) * (0-(0.855)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 6) / 2) * (0-(20)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (31.75-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 31.75 + (((tickAnim - 10) / 2) * (0-(31.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (24.5-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 24.5 + (((tickAnim - 17) / 3) * (0-(24.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKuehneosaurus entity = (EntityPrehistoricFloraKuehneosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(5.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*3), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*8), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*0.5);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-80))*1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(0.80315), leftLeg1.rotateAngleY + (float) Math.toRadians(-14.2017107667-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*5), leftLeg1.rotateAngleZ + (float) Math.toRadians(-27.4233818007+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*12));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(2.18303), leftLeg2.rotateAngleY + (float) Math.toRadians(39.83837), leftLeg2.rotateAngleZ + (float) Math.toRadians(-5.48881));
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(10.16947), leftFoot.rotateAngleY + (float) Math.toRadians(-29.0411), leftFoot.rotateAngleZ + (float) Math.toRadians(-11.13468));
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(0.80315), rightLeg1.rotateAngleY + (float) Math.toRadians(14.2017107667-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-5), rightLeg1.rotateAngleZ + (float) Math.toRadians(27.4233818007+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-12));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(2.18303), rightLeg2.rotateAngleY + (float) Math.toRadians(-39.83837), rightLeg2.rotateAngleZ + (float) Math.toRadians(5.48881));
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(10.16947), rightFoot.rotateAngleY + (float) Math.toRadians(29.0411), rightFoot.rotateAngleZ + (float) Math.toRadians(11.13468));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(15.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*8), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(9.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*6), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*6), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(8.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*9), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(6.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*9), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-300))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*9), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-350))*-16), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*9), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-350))*-20), tail6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-9), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(0), leftWing.rotateAngleY + (float) Math.toRadians(0), leftWing.rotateAngleZ + (float) Math.toRadians(-20));
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(0), rightWing.rotateAngleY + (float) Math.toRadians(0), rightWing.rotateAngleZ + (float) Math.toRadians(20));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-7.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-14.75), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-32.7728971543-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*3), leftArm1.rotateAngleY + (float) Math.toRadians(38.16049), leftArm1.rotateAngleZ + (float) Math.toRadians(-48.8261635299+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*12));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-45.47632), leftArm2.rotateAngleY + (float) Math.toRadians(-67.67378), leftArm2.rotateAngleZ + (float) Math.toRadians(-58.13231));
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-32.7729), rightArm1.rotateAngleY + (float) Math.toRadians(-38.16049), rightArm1.rotateAngleZ + (float) Math.toRadians(48.8261635299+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-12));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-45.47632), rightArm2.rotateAngleY + (float) Math.toRadians(67.67378), rightArm2.rotateAngleZ + (float) Math.toRadians(58.13231));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKuehneosaurus entity = (EntityPrehistoricFloraKuehneosaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-4), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-17), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-8));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*1);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-0.5);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-0.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(5.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*4), tail1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*15), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(4.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*4), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+80))*18), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-7.0828-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*1), tail3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*-21.0542), tail3.rotateAngleZ + (float) Math.toRadians(2.91129));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*2), tail4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*-23), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*3), tail5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+250))*25), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*4), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+300))*27), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*-1), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*17), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*3), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-17), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*-2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*15), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*-4), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-15), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (52.79456-(0)));
            yy = 64.25 + (((tickAnim - 0) / 6) * (-30.39632-(64.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (-15.74445-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 52.79456 + (((tickAnim - 6) / 2) * (13.92429-(52.79456)));
            yy = -30.39632 + (((tickAnim - 6) / 2) * (5.67656-(-30.39632)));
            zz = -15.74445 + (((tickAnim - 6) / 2) * (-56.89584-(-15.74445)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 13.92429 + (((tickAnim - 8) / 0) * (-9.98614-(13.92429)));
            yy = 5.67656 + (((tickAnim - 8) / 0) * (25.30525-(5.67656)));
            zz = -56.89584 + (((tickAnim - 8) / 0) * (-34.91675-(-56.89584)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9.98614 + (((tickAnim - 8) / 2) * (0-(-9.98614)));
            yy = 25.30525 + (((tickAnim - 8) / 2) * (64.25-(25.30525)));
            zz = -34.91675 + (((tickAnim - 8) / 2) * (0-(-34.91675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -39.64011 + (((tickAnim - 0) / 3) * (-53.07445-(-39.64011)));
            yy = -48.4926 + (((tickAnim - 0) / 3) * (-46.04182-(-48.4926)));
            zz = -44.48249 + (((tickAnim - 0) / 3) * (-64.19526-(-44.48249)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -53.07445 + (((tickAnim - 3) / 3) * (-56.33832-(-53.07445)));
            yy = -46.04182 + (((tickAnim - 3) / 3) * (-44.55976-(-46.04182)));
            zz = -64.19526 + (((tickAnim - 3) / 3) * (-63.48918-(-64.19526)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -56.33832 + (((tickAnim - 6) / 2) * (-31.59373-(-56.33832)));
            yy = -44.55976 + (((tickAnim - 6) / 2) * (-42.45071-(-44.55976)));
            zz = -63.48918 + (((tickAnim - 6) / 2) * (-28.10927-(-63.48918)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -31.59373 + (((tickAnim - 8) / 2) * (-39.64011-(-31.59373)));
            yy = -42.45071 + (((tickAnim - 8) / 2) * (-48.4926-(-42.45071)));
            zz = -28.10927 + (((tickAnim - 8) / 2) * (-44.48249-(-28.10927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6 + (((tickAnim - 0) / 3) * (-38.22536-(-6)));
            yy = -21.75 + (((tickAnim - 0) / 3) * (5.68016-(-21.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (-17.33921-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -38.22536 + (((tickAnim - 3) / 3) * (-68.74177-(-38.22536)));
            yy = 5.68016 + (((tickAnim - 3) / 3) * (17.88173-(5.68016)));
            zz = -17.33921 + (((tickAnim - 3) / 3) * (-64.16327-(-17.33921)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -68.74177 + (((tickAnim - 6) / 1) * (12.57886-(-68.74177)));
            yy = 17.88173 + (((tickAnim - 6) / 1) * (-56.73456-(17.88173)));
            zz = -64.16327 + (((tickAnim - 6) / 1) * (37.78518-(-64.16327)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 12.57886 + (((tickAnim - 7) / 1) * (-7.26519-(12.57886)));
            yy = -56.73456 + (((tickAnim - 7) / 1) * (-46.86725-(-56.73456)));
            zz = 37.78518 + (((tickAnim - 7) / 1) * (50.72073-(37.78518)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.26519 + (((tickAnim - 8) / 2) * (-6-(-7.26519)));
            yy = -46.86725 + (((tickAnim - 8) / 2) * (-21.75-(-46.86725)));
            zz = 50.72073 + (((tickAnim - 8) / 2) * (0-(50.72073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 2) * (0.705-(0.175)));
            zz = 0.08 + (((tickAnim - 0) / 2) * (-0.13-(0.08)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.705 + (((tickAnim - 2) / 1) * (0-(0.705)));
            zz = -0.13 + (((tickAnim - 2) / 1) * (0-(-0.13)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-0.425-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.375-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.075-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.425 + (((tickAnim - 6) / 1) * (0-(-0.425)));
            yy = 0.375 + (((tickAnim - 6) / 1) * (0.19-(0.375)));
            zz = 0.075 + (((tickAnim - 6) / 1) * (0.315-(0.075)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.19 + (((tickAnim - 7) / 1) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 7) / 1) * (0.16-(0.315)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.11 + (((tickAnim - 8) / 2) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 8) / 2) * (0.08-(0.16)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (7.69903-(0)));
            yy = -0.475 + (((tickAnim - 0) / 3) * (29.25881-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 3) * (-11.03701-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.69903 + (((tickAnim - 3) / 2) * (-0.8467-(7.69903)));
            yy = 29.25881 + (((tickAnim - 3) / 2) * (57.54768-(29.25881)));
            zz = -11.03701 + (((tickAnim - 3) / 2) * (-0.18491-(-11.03701)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.8467 + (((tickAnim - 5) / 3) * (-0.32409-(-0.8467)));
            yy = 57.54768 + (((tickAnim - 5) / 3) * (29.70075-(57.54768)));
            zz = -0.18491 + (((tickAnim - 5) / 3) * (-11.22292-(-0.18491)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.32409 + (((tickAnim - 8) / 2) * (0-(-0.32409)));
            yy = 29.70075 + (((tickAnim - 8) / 2) * (-0.475-(29.70075)));
            zz = -11.22292 + (((tickAnim - 8) / 2) * (0-(-11.22292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-4.49933-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.81046-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 27.23355 + (((tickAnim - 2) / 3) * (5.3264-(27.23355)));
            yy = -4.49933 + (((tickAnim - 2) / 3) * (31.31353-(-4.49933)));
            zz = -0.81046 + (((tickAnim - 2) / 3) * (2.05449-(-0.81046)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5.3264 + (((tickAnim - 5) / 3) * (5.5328-(5.3264)));
            yy = 31.31353 + (((tickAnim - 5) / 3) * (15.94246-(31.31353)));
            zz = 2.05449 + (((tickAnim - 5) / 3) * (-4.44427-(2.05449)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.5328 + (((tickAnim - 8) / 2) * (0-(5.5328)));
            yy = 15.94246 + (((tickAnim - 8) / 2) * (0-(15.94246)));
            zz = -4.44427 + (((tickAnim - 8) / 2) * (0-(-4.44427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (30.11605-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-13.56425-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (10.87267-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 30.11605 + (((tickAnim - 2) / 3) * (6-(30.11605)));
            yy = -13.56425 + (((tickAnim - 2) / 3) * (0-(-13.56425)));
            zz = 10.87267 + (((tickAnim - 2) / 3) * (0-(10.87267)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 6 + (((tickAnim - 5) / 3) * (0-(6)));
            yy = 0 + (((tickAnim - 5) / 3) * (50.25-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 50.25 + (((tickAnim - 8) / 2) * (0-(50.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 2) * (0-(0.225)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.835-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.835 + (((tickAnim - 7) / 1) * (0.84-(0.835)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.84 + (((tickAnim - 8) / 2) * (0.225-(0.84)));
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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.6533 + (((tickAnim - 0) / 3) * (-7.99776-(7.6533)));
            yy = -57.54768 + (((tickAnim - 0) / 3) * (-29.09251-(-57.54768)));
            zz = 0.18491 + (((tickAnim - 0) / 3) * (9.97446-(0.18491)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.99776 + (((tickAnim - 3) / 2) * (0-(-7.99776)));
            yy = -29.09251 + (((tickAnim - 3) / 2) * (0.475-(-29.09251)));
            zz = 9.97446 + (((tickAnim - 3) / 2) * (0-(9.97446)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (7.69903-(0)));
            yy = 0.475 + (((tickAnim - 5) / 3) * (-29.25881-(0.475)));
            zz = 0 + (((tickAnim - 5) / 3) * (11.03701-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.69903 + (((tickAnim - 8) / 2) * (7.6533-(7.69903)));
            yy = -29.25881 + (((tickAnim - 8) / 2) * (-57.54768-(-29.25881)));
            zz = 11.03701 + (((tickAnim - 8) / 2) * (0.18491-(11.03701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.71839 + (((tickAnim - 0) / 3) * (5.5328-(4.71839)));
            yy = -31.05942 + (((tickAnim - 0) / 3) * (-15.94246-(-31.05942)));
            zz = -5.1049 + (((tickAnim - 0) / 3) * (4.44427-(-5.1049)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5.5328 + (((tickAnim - 3) / 2) * (0-(5.5328)));
            yy = -15.94246 + (((tickAnim - 3) / 2) * (0-(-15.94246)));
            zz = 4.44427 + (((tickAnim - 3) / 2) * (0-(4.44427)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (4.49933-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.81046-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 27.23355 + (((tickAnim - 7) / 3) * (4.71839-(27.23355)));
            yy = 4.49933 + (((tickAnim - 7) / 3) * (-31.05942-(4.49933)));
            zz = 0.81046 + (((tickAnim - 7) / 3) * (-5.1049-(0.81046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.94893 + (((tickAnim - 0) / 3) * (0-(0.94893)));
            yy = 0.85657 + (((tickAnim - 0) / 3) * (-59-(0.85657)));
            zz = 5.47116 + (((tickAnim - 0) / 3) * (0-(5.47116)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (6-(0)));
            yy = -59 + (((tickAnim - 3) / 2) * (0-(-59)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 6 + (((tickAnim - 5) / 2) * (30.11605-(6)));
            yy = 0 + (((tickAnim - 5) / 2) * (13.56425-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-10.87267-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 30.11605 + (((tickAnim - 7) / 3) * (0.94893-(30.11605)));
            yy = 13.56425 + (((tickAnim - 7) / 3) * (0.85657-(13.56425)));
            zz = -10.87267 + (((tickAnim - 7) / 3) * (5.47116-(-10.87267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 2) / 1) * (0.775-(0.875)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 3) / 2) * (0.125-(0.775)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 5) / 5) * (0-(0.125)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
            xx = 48.98758 + (((tickAnim - 0) / 2) * (36.6137-(48.98758)));
            yy = 26.52135 + (((tickAnim - 0) / 2) * (0.0376-(26.52135)));
            zz = 10.04002 + (((tickAnim - 0) / 2) * (57.99854-(10.04002)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 36.6137 + (((tickAnim - 2) / 1) * (-12.68137-(36.6137)));
            yy = 0.0376 + (((tickAnim - 2) / 1) * (-21.32617-(0.0376)));
            zz = 57.99854 + (((tickAnim - 2) / 1) * (50.39397-(57.99854)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -12.68137 + (((tickAnim - 3) / 1) * (0-(-12.68137)));
            yy = -21.32617 + (((tickAnim - 3) / 1) * (-64.25-(-21.32617)));
            zz = 50.39397 + (((tickAnim - 3) / 1) * (0-(50.39397)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (18.3113-(0)));
            yy = -64.25 + (((tickAnim - 4) / 3) * (-28.61464-(-64.25)));
            zz = 0 + (((tickAnim - 4) / 3) * (15.65144-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 18.3113 + (((tickAnim - 7) / 3) * (48.98758-(18.3113)));
            yy = -28.61464 + (((tickAnim - 7) / 3) * (26.52135-(-28.61464)));
            zz = 15.65144 + (((tickAnim - 7) / 3) * (10.04002-(15.65144)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -56.33832 + (((tickAnim - 0) / 1) * (-31.59373-(-56.33832)));
            yy = 44.55976 + (((tickAnim - 0) / 1) * (42.45071-(44.55976)));
            zz = 63.48918 + (((tickAnim - 0) / 1) * (28.10927-(63.48918)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -31.59373 + (((tickAnim - 1) / 3) * (-39.64011-(-31.59373)));
            yy = 42.45071 + (((tickAnim - 1) / 3) * (48.4926-(42.45071)));
            zz = 28.10927 + (((tickAnim - 1) / 3) * (44.48249-(28.10927)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -39.64011 + (((tickAnim - 4) / 6) * (-56.33832-(-39.64011)));
            yy = 48.4926 + (((tickAnim - 4) / 6) * (44.55976-(48.4926)));
            zz = 44.48249 + (((tickAnim - 4) / 6) * (63.48918-(44.48249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -68.74177 + (((tickAnim - 0) / 1) * (12.57886-(-68.74177)));
            yy = -17.88173 + (((tickAnim - 0) / 1) * (56.73456-(-17.88173)));
            zz = 64.16327 + (((tickAnim - 0) / 1) * (-37.78518-(64.16327)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 12.57886 + (((tickAnim - 1) / 2) * (-7.26519-(12.57886)));
            yy = 56.73456 + (((tickAnim - 1) / 2) * (46.86725-(56.73456)));
            zz = -37.78518 + (((tickAnim - 1) / 2) * (-50.72073-(-37.78518)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.26519 + (((tickAnim - 3) / 1) * (-6-(-7.26519)));
            yy = 46.86725 + (((tickAnim - 3) / 1) * (21.75-(46.86725)));
            zz = -50.72073 + (((tickAnim - 3) / 1) * (0-(-50.72073)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -6 + (((tickAnim - 4) / 3) * (-44.62984-(-6)));
            yy = 21.75 + (((tickAnim - 4) / 3) * (-7.75859-(21.75)));
            zz = 0 + (((tickAnim - 4) / 3) * (18.07472-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -44.62984 + (((tickAnim - 7) / 3) * (-68.74177-(-44.62984)));
            yy = -7.75859 + (((tickAnim - 7) / 3) * (-17.88173-(-7.75859)));
            zz = 18.07472 + (((tickAnim - 7) / 3) * (64.16327-(18.07472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.25 + (((tickAnim - 0) / 1) * (0-(0.25)));
            yy = 0.35 + (((tickAnim - 0) / 1) * (0.19-(0.35)));
            zz = 0.075 + (((tickAnim - 0) / 1) * (0.315-(0.075)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 1) / 2) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 1) / 2) * (0.16-(0.315)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.11 + (((tickAnim - 3) / 1) * (0-(-0.11)));
            zz = 0.16 + (((tickAnim - 3) / 1) * (0-(0.16)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.23-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-0.13-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0.25-(0)));
            yy = 0.23 + (((tickAnim - 6) / 4) * (0.35-(0.23)));
            zz = -0.13 + (((tickAnim - 6) / 4) * (0.075-(-0.13)));
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
        EntityPrehistoricFloraKuehneosaurus entity = (EntityPrehistoricFloraKuehneosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-1), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-12), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*0.35);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-0.1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*1), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*7), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*7), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+100))*-7), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-7), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*7), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+300))*7), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-90))*-1), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*1), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-15), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*-2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*15), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*-4), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-15), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (26.11962-(0)));
            yy = 64.25 + (((tickAnim - 0) / 4) * (-0.2005-(64.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (-10.94096-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 26.11962 + (((tickAnim - 4) / 4) * (48.98758-(26.11962)));
            yy = -0.2005 + (((tickAnim - 4) / 4) * (-26.52135-(-0.2005)));
            zz = -10.94096 + (((tickAnim - 4) / 4) * (-10.04002-(-10.94096)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 48.98758 + (((tickAnim - 8) / 3) * (11.85046-(48.98758)));
            yy = -26.52135 + (((tickAnim - 8) / 3) * (3.39601-(-26.52135)));
            zz = -10.04002 + (((tickAnim - 8) / 3) * (-43.42907-(-10.04002)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 11.85046 + (((tickAnim - 11) / 2) * (-9.98614-(11.85046)));
            yy = 3.39601 + (((tickAnim - 11) / 2) * (25.30525-(3.39601)));
            zz = -43.42907 + (((tickAnim - 11) / 2) * (-34.91675-(-43.42907)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -9.98614 + (((tickAnim - 13) / 2) * (0-(-9.98614)));
            yy = 25.30525 + (((tickAnim - 13) / 2) * (64.25-(25.30525)));
            zz = -34.91675 + (((tickAnim - 13) / 2) * (0-(-34.91675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -39.64011 + (((tickAnim - 0) / 8) * (-56.33832-(-39.64011)));
            yy = -48.4926 + (((tickAnim - 0) / 8) * (-44.55976-(-48.4926)));
            zz = -44.48249 + (((tickAnim - 0) / 8) * (-63.48918-(-44.48249)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -56.33832 + (((tickAnim - 8) / 2) * (-31.59373-(-56.33832)));
            yy = -44.55976 + (((tickAnim - 8) / 2) * (-42.45071-(-44.55976)));
            zz = -63.48918 + (((tickAnim - 8) / 2) * (-28.10927-(-63.48918)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -31.59373 + (((tickAnim - 10) / 5) * (-39.64011-(-31.59373)));
            yy = -42.45071 + (((tickAnim - 10) / 5) * (-48.4926-(-42.45071)));
            zz = -28.10927 + (((tickAnim - 10) / 5) * (-44.48249-(-28.10927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6 + (((tickAnim - 0) / 4) * (-38.22536-(-6)));
            yy = -21.75 + (((tickAnim - 0) / 4) * (5.68016-(-21.75)));
            zz = 0 + (((tickAnim - 0) / 4) * (-17.33921-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -38.22536 + (((tickAnim - 4) / 4) * (-68.74177-(-38.22536)));
            yy = 5.68016 + (((tickAnim - 4) / 4) * (17.88173-(5.68016)));
            zz = -17.33921 + (((tickAnim - 4) / 4) * (-64.16327-(-17.33921)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -68.74177 + (((tickAnim - 8) / 2) * (12.57886-(-68.74177)));
            yy = 17.88173 + (((tickAnim - 8) / 2) * (-56.73456-(17.88173)));
            zz = -64.16327 + (((tickAnim - 8) / 2) * (37.78518-(-64.16327)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.57886 + (((tickAnim - 10) / 3) * (-7.26519-(12.57886)));
            yy = -56.73456 + (((tickAnim - 10) / 3) * (-46.86725-(-56.73456)));
            zz = 37.78518 + (((tickAnim - 10) / 3) * (50.72073-(37.78518)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.26519 + (((tickAnim - 13) / 2) * (-6-(-7.26519)));
            yy = -46.86725 + (((tickAnim - 13) / 2) * (-21.75-(-46.86725)));
            zz = 50.72073 + (((tickAnim - 13) / 2) * (0-(50.72073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.23-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.13-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.23 + (((tickAnim - 2) / 2) * (0-(0.23)));
            zz = -0.13 + (((tickAnim - 2) / 2) * (0-(-0.13)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-0.425-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.375-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.075-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.425 + (((tickAnim - 8) / 2) * (0-(-0.425)));
            yy = 0.375 + (((tickAnim - 8) / 2) * (0.19-(0.375)));
            zz = 0.075 + (((tickAnim - 8) / 2) * (0.315-(0.075)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.19 + (((tickAnim - 10) / 3) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 10) / 3) * (0.16-(0.315)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.11 + (((tickAnim - 13) / 1) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 13) / 1) * (0.08-(0.16)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 14) / 1) * (0-(0.175)));
            zz = 0.08 + (((tickAnim - 14) / 1) * (0-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.69903-(0)));
            yy = -0.475 + (((tickAnim - 0) / 4) * (29.25881-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 4) * (-11.03701-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.69903 + (((tickAnim - 4) / 4) * (-0.8467-(7.69903)));
            yy = 29.25881 + (((tickAnim - 4) / 4) * (57.54768-(29.25881)));
            zz = -11.03701 + (((tickAnim - 4) / 4) * (-0.18491-(-11.03701)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.8467 + (((tickAnim - 8) / 3) * (4.67066-(-0.8467)));
            yy = 57.54768 + (((tickAnim - 8) / 3) * (29.30183-(57.54768)));
            zz = -0.18491 + (((tickAnim - 8) / 3) * (-5.73194-(-0.18491)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 4.67066 + (((tickAnim - 11) / 4) * (0-(4.67066)));
            yy = 29.30183 + (((tickAnim - 11) / 4) * (-0.475-(29.30183)));
            zz = -5.73194 + (((tickAnim - 11) / 4) * (0-(-5.73194)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4.49933-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.81046-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 27.23355 + (((tickAnim - 3) / 5) * (5.3264-(27.23355)));
            yy = -4.49933 + (((tickAnim - 3) / 5) * (31.31353-(-4.49933)));
            zz = -0.81046 + (((tickAnim - 3) / 5) * (2.05449-(-0.81046)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 5.3264 + (((tickAnim - 8) / 4) * (5.5328-(5.3264)));
            yy = 31.31353 + (((tickAnim - 8) / 4) * (15.94246-(31.31353)));
            zz = 2.05449 + (((tickAnim - 8) / 4) * (-4.44427-(2.05449)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5.5328 + (((tickAnim - 12) / 3) * (0-(5.5328)));
            yy = 15.94246 + (((tickAnim - 12) / 3) * (0-(15.94246)));
            zz = -4.44427 + (((tickAnim - 12) / 3) * (0-(-4.44427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30.11605-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-13.56425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10.87267-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 30.11605 + (((tickAnim - 3) / 5) * (6-(30.11605)));
            yy = -13.56425 + (((tickAnim - 3) / 5) * (0-(-13.56425)));
            zz = 10.87267 + (((tickAnim - 3) / 5) * (0-(10.87267)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 6 + (((tickAnim - 8) / 3) * (0-(6)));
            yy = 0 + (((tickAnim - 8) / 3) * (50.25-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 50.25 + (((tickAnim - 11) / 4) * (0-(50.25)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 3) * (0-(0.225)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.64-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.64 + (((tickAnim - 11) / 4) * (0.225-(0.64)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
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
            xx = 7.6533 + (((tickAnim - 0) / 3) * (4.66043-(7.6533)));
            yy = -57.54768 + (((tickAnim - 0) / 3) * (-29.34104-(-57.54768)));
            zz = 0.18491 + (((tickAnim - 0) / 3) * (5.97906-(0.18491)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.66043 + (((tickAnim - 3) / 5) * (0-(4.66043)));
            yy = -29.34104 + (((tickAnim - 3) / 5) * (0.475-(-29.34104)));
            zz = 5.97906 + (((tickAnim - 3) / 5) * (0-(5.97906)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (7.69903-(0)));
            yy = 0.475 + (((tickAnim - 8) / 4) * (-29.25881-(0.475)));
            zz = 0 + (((tickAnim - 8) / 4) * (11.03701-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 7.69903 + (((tickAnim - 12) / 3) * (7.6533-(7.69903)));
            yy = -29.25881 + (((tickAnim - 12) / 3) * (-57.54768-(-29.25881)));
            zz = 11.03701 + (((tickAnim - 12) / 3) * (0.18491-(11.03701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.71839 + (((tickAnim - 0) / 4) * (5.5328-(4.71839)));
            yy = -31.05942 + (((tickAnim - 0) / 4) * (-15.94246-(-31.05942)));
            zz = -5.1049 + (((tickAnim - 0) / 4) * (4.44427-(-5.1049)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.5328 + (((tickAnim - 4) / 4) * (0-(5.5328)));
            yy = -15.94246 + (((tickAnim - 4) / 4) * (0-(-15.94246)));
            zz = 4.44427 + (((tickAnim - 4) / 4) * (0-(4.44427)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (4.49933-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.81046-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 27.23355 + (((tickAnim - 10) / 5) * (4.71839-(27.23355)));
            yy = 4.49933 + (((tickAnim - 10) / 5) * (-31.05942-(4.49933)));
            zz = 0.81046 + (((tickAnim - 10) / 5) * (-5.1049-(0.81046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.94893 + (((tickAnim - 0) / 3) * (0-(0.94893)));
            yy = 0.85657 + (((tickAnim - 0) / 3) * (-59-(0.85657)));
            zz = 5.47116 + (((tickAnim - 0) / 3) * (0-(5.47116)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (6-(0)));
            yy = -59 + (((tickAnim - 3) / 5) * (0-(-59)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6 + (((tickAnim - 8) / 2) * (30.11605-(6)));
            yy = 0 + (((tickAnim - 8) / 2) * (13.56425-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-10.87267-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 30.11605 + (((tickAnim - 10) / 5) * (0.94893-(30.11605)));
            yy = 13.56425 + (((tickAnim - 10) / 5) * (0.85657-(13.56425)));
            zz = -10.87267 + (((tickAnim - 10) / 5) * (5.47116-(-10.87267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.575 + (((tickAnim - 2) / 1) * (0.775-(0.575)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.775 + (((tickAnim - 3) / 5) * (0.125-(0.775)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 8) / 7) * (0-(0.125)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
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
            xx = 48.98758 + (((tickAnim - 0) / 2) * (32.25444-(48.98758)));
            yy = 26.52135 + (((tickAnim - 0) / 2) * (8.37797-(26.52135)));
            zz = 10.04002 + (((tickAnim - 0) / 2) * (43.65694-(10.04002)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 32.25444 + (((tickAnim - 2) / 2) * (-9.98614-(32.25444)));
            yy = 8.37797 + (((tickAnim - 2) / 2) * (-25.30525-(8.37797)));
            zz = 43.65694 + (((tickAnim - 2) / 2) * (34.91675-(43.65694)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -9.98614 + (((tickAnim - 4) / 3) * (0-(-9.98614)));
            yy = -25.30525 + (((tickAnim - 4) / 3) * (-64.25-(-25.30525)));
            zz = 34.91675 + (((tickAnim - 4) / 3) * (0-(34.91675)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (26.11962-(0)));
            yy = -64.25 + (((tickAnim - 7) / 5) * (0.2005-(-64.25)));
            zz = 0 + (((tickAnim - 7) / 5) * (10.94096-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 26.11962 + (((tickAnim - 12) / 3) * (48.98758-(26.11962)));
            yy = 0.2005 + (((tickAnim - 12) / 3) * (26.52135-(0.2005)));
            zz = 10.94096 + (((tickAnim - 12) / 3) * (10.04002-(10.94096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -56.33832 + (((tickAnim - 0) / 2) * (-31.59373-(-56.33832)));
            yy = 44.55976 + (((tickAnim - 0) / 2) * (42.45071-(44.55976)));
            zz = 63.48918 + (((tickAnim - 0) / 2) * (28.10927-(63.48918)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -31.59373 + (((tickAnim - 2) / 5) * (-39.64011-(-31.59373)));
            yy = 42.45071 + (((tickAnim - 2) / 5) * (48.4926-(42.45071)));
            zz = 28.10927 + (((tickAnim - 2) / 5) * (44.48249-(28.10927)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -39.64011 + (((tickAnim - 7) / 8) * (-56.33832-(-39.64011)));
            yy = 48.4926 + (((tickAnim - 7) / 8) * (44.55976-(48.4926)));
            zz = 44.48249 + (((tickAnim - 7) / 8) * (63.48918-(44.48249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -68.74177 + (((tickAnim - 0) / 2) * (12.57886-(-68.74177)));
            yy = -17.88173 + (((tickAnim - 0) / 2) * (56.73456-(-17.88173)));
            zz = 64.16327 + (((tickAnim - 0) / 2) * (-37.78518-(64.16327)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 12.57886 + (((tickAnim - 2) / 2) * (-7.26519-(12.57886)));
            yy = 56.73456 + (((tickAnim - 2) / 2) * (46.86725-(56.73456)));
            zz = -37.78518 + (((tickAnim - 2) / 2) * (-50.72073-(-37.78518)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7.26519 + (((tickAnim - 4) / 3) * (-6-(-7.26519)));
            yy = 46.86725 + (((tickAnim - 4) / 3) * (21.75-(46.86725)));
            zz = -50.72073 + (((tickAnim - 4) / 3) * (0-(-50.72073)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -6 + (((tickAnim - 7) / 5) * (-39.76974-(-6)));
            yy = 21.75 + (((tickAnim - 7) / 5) * (-1.44315-(21.75)));
            zz = 0 + (((tickAnim - 7) / 5) * (29.73427-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -39.76974 + (((tickAnim - 12) / 3) * (-68.74177-(-39.76974)));
            yy = -1.44315 + (((tickAnim - 12) / 3) * (-17.88173-(-1.44315)));
            zz = 29.73427 + (((tickAnim - 12) / 3) * (64.16327-(29.73427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.25 + (((tickAnim - 0) / 2) * (0-(0.25)));
            yy = 0.35 + (((tickAnim - 0) / 2) * (0.19-(0.35)));
            zz = 0.075 + (((tickAnim - 0) / 2) * (0.315-(0.075)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 2) / 2) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 2) / 2) * (0.16-(0.315)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.11 + (((tickAnim - 4) / 2) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 4) / 2) * (0.08-(0.16)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 1) * (0-(0.175)));
            zz = 0.08 + (((tickAnim - 6) / 1) * (0-(0.08)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.23-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.13-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0.25-(0)));
            yy = 0.23 + (((tickAnim - 9) / 6) * (0.35-(0.23)));
            zz = -0.13 + (((tickAnim - 9) / 6) * (0.075-(-0.13)));
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
        EntityPrehistoricFloraKuehneosaurus entity = (EntityPrehistoricFloraKuehneosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-1), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-12), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*0.35);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-0.1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*1), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*7), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*7), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+100))*-7), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-7), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*7), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+300))*7), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-90))*-1), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*1), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-15), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*-2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*15), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*-4), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-15), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (26.11962-(0)));
            yy = 64.25 + (((tickAnim - 0) / 4) * (-0.2005-(64.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (-10.94096-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 26.11962 + (((tickAnim - 4) / 4) * (48.98758-(26.11962)));
            yy = -0.2005 + (((tickAnim - 4) / 4) * (-26.52135-(-0.2005)));
            zz = -10.94096 + (((tickAnim - 4) / 4) * (-10.04002-(-10.94096)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 48.98758 + (((tickAnim - 8) / 3) * (11.85046-(48.98758)));
            yy = -26.52135 + (((tickAnim - 8) / 3) * (3.39601-(-26.52135)));
            zz = -10.04002 + (((tickAnim - 8) / 3) * (-43.42907-(-10.04002)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 11.85046 + (((tickAnim - 11) / 2) * (-9.98614-(11.85046)));
            yy = 3.39601 + (((tickAnim - 11) / 2) * (25.30525-(3.39601)));
            zz = -43.42907 + (((tickAnim - 11) / 2) * (-34.91675-(-43.42907)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -9.98614 + (((tickAnim - 13) / 2) * (0-(-9.98614)));
            yy = 25.30525 + (((tickAnim - 13) / 2) * (64.25-(25.30525)));
            zz = -34.91675 + (((tickAnim - 13) / 2) * (0-(-34.91675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -39.64011 + (((tickAnim - 0) / 8) * (-56.33832-(-39.64011)));
            yy = -48.4926 + (((tickAnim - 0) / 8) * (-44.55976-(-48.4926)));
            zz = -44.48249 + (((tickAnim - 0) / 8) * (-63.48918-(-44.48249)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -56.33832 + (((tickAnim - 8) / 2) * (-31.59373-(-56.33832)));
            yy = -44.55976 + (((tickAnim - 8) / 2) * (-42.45071-(-44.55976)));
            zz = -63.48918 + (((tickAnim - 8) / 2) * (-28.10927-(-63.48918)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -31.59373 + (((tickAnim - 10) / 5) * (-39.64011-(-31.59373)));
            yy = -42.45071 + (((tickAnim - 10) / 5) * (-48.4926-(-42.45071)));
            zz = -28.10927 + (((tickAnim - 10) / 5) * (-44.48249-(-28.10927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6 + (((tickAnim - 0) / 4) * (-38.22536-(-6)));
            yy = -21.75 + (((tickAnim - 0) / 4) * (5.68016-(-21.75)));
            zz = 0 + (((tickAnim - 0) / 4) * (-17.33921-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -38.22536 + (((tickAnim - 4) / 4) * (-68.74177-(-38.22536)));
            yy = 5.68016 + (((tickAnim - 4) / 4) * (17.88173-(5.68016)));
            zz = -17.33921 + (((tickAnim - 4) / 4) * (-64.16327-(-17.33921)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -68.74177 + (((tickAnim - 8) / 2) * (12.57886-(-68.74177)));
            yy = 17.88173 + (((tickAnim - 8) / 2) * (-56.73456-(17.88173)));
            zz = -64.16327 + (((tickAnim - 8) / 2) * (37.78518-(-64.16327)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.57886 + (((tickAnim - 10) / 3) * (-7.26519-(12.57886)));
            yy = -56.73456 + (((tickAnim - 10) / 3) * (-46.86725-(-56.73456)));
            zz = 37.78518 + (((tickAnim - 10) / 3) * (50.72073-(37.78518)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.26519 + (((tickAnim - 13) / 2) * (-6-(-7.26519)));
            yy = -46.86725 + (((tickAnim - 13) / 2) * (-21.75-(-46.86725)));
            zz = 50.72073 + (((tickAnim - 13) / 2) * (0-(50.72073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.23-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.13-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.23 + (((tickAnim - 2) / 2) * (0-(0.23)));
            zz = -0.13 + (((tickAnim - 2) / 2) * (0-(-0.13)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-0.425-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.375-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.075-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.425 + (((tickAnim - 8) / 2) * (0-(-0.425)));
            yy = 0.375 + (((tickAnim - 8) / 2) * (0.19-(0.375)));
            zz = 0.075 + (((tickAnim - 8) / 2) * (0.315-(0.075)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.19 + (((tickAnim - 10) / 3) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 10) / 3) * (0.16-(0.315)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.11 + (((tickAnim - 13) / 1) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 13) / 1) * (0.08-(0.16)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 14) / 1) * (0-(0.175)));
            zz = 0.08 + (((tickAnim - 14) / 1) * (0-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.69903-(0)));
            yy = -0.475 + (((tickAnim - 0) / 4) * (29.25881-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 4) * (-11.03701-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.69903 + (((tickAnim - 4) / 4) * (-0.8467-(7.69903)));
            yy = 29.25881 + (((tickAnim - 4) / 4) * (57.54768-(29.25881)));
            zz = -11.03701 + (((tickAnim - 4) / 4) * (-0.18491-(-11.03701)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.8467 + (((tickAnim - 8) / 3) * (4.67066-(-0.8467)));
            yy = 57.54768 + (((tickAnim - 8) / 3) * (29.30183-(57.54768)));
            zz = -0.18491 + (((tickAnim - 8) / 3) * (-5.73194-(-0.18491)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 4.67066 + (((tickAnim - 11) / 4) * (0-(4.67066)));
            yy = 29.30183 + (((tickAnim - 11) / 4) * (-0.475-(29.30183)));
            zz = -5.73194 + (((tickAnim - 11) / 4) * (0-(-5.73194)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4.49933-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.81046-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 27.23355 + (((tickAnim - 3) / 5) * (5.3264-(27.23355)));
            yy = -4.49933 + (((tickAnim - 3) / 5) * (31.31353-(-4.49933)));
            zz = -0.81046 + (((tickAnim - 3) / 5) * (2.05449-(-0.81046)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 5.3264 + (((tickAnim - 8) / 4) * (5.5328-(5.3264)));
            yy = 31.31353 + (((tickAnim - 8) / 4) * (15.94246-(31.31353)));
            zz = 2.05449 + (((tickAnim - 8) / 4) * (-4.44427-(2.05449)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5.5328 + (((tickAnim - 12) / 3) * (0-(5.5328)));
            yy = 15.94246 + (((tickAnim - 12) / 3) * (0-(15.94246)));
            zz = -4.44427 + (((tickAnim - 12) / 3) * (0-(-4.44427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30.11605-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-13.56425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10.87267-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 30.11605 + (((tickAnim - 3) / 5) * (6-(30.11605)));
            yy = -13.56425 + (((tickAnim - 3) / 5) * (0-(-13.56425)));
            zz = 10.87267 + (((tickAnim - 3) / 5) * (0-(10.87267)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 6 + (((tickAnim - 8) / 3) * (0-(6)));
            yy = 0 + (((tickAnim - 8) / 3) * (50.25-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 50.25 + (((tickAnim - 11) / 4) * (0-(50.25)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 3) * (0-(0.225)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.64-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.64 + (((tickAnim - 11) / 4) * (0.225-(0.64)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
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
            xx = 7.6533 + (((tickAnim - 0) / 3) * (4.66043-(7.6533)));
            yy = -57.54768 + (((tickAnim - 0) / 3) * (-29.34104-(-57.54768)));
            zz = 0.18491 + (((tickAnim - 0) / 3) * (5.97906-(0.18491)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.66043 + (((tickAnim - 3) / 5) * (0-(4.66043)));
            yy = -29.34104 + (((tickAnim - 3) / 5) * (0.475-(-29.34104)));
            zz = 5.97906 + (((tickAnim - 3) / 5) * (0-(5.97906)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (7.69903-(0)));
            yy = 0.475 + (((tickAnim - 8) / 4) * (-29.25881-(0.475)));
            zz = 0 + (((tickAnim - 8) / 4) * (11.03701-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 7.69903 + (((tickAnim - 12) / 3) * (7.6533-(7.69903)));
            yy = -29.25881 + (((tickAnim - 12) / 3) * (-57.54768-(-29.25881)));
            zz = 11.03701 + (((tickAnim - 12) / 3) * (0.18491-(11.03701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.71839 + (((tickAnim - 0) / 4) * (5.5328-(4.71839)));
            yy = -31.05942 + (((tickAnim - 0) / 4) * (-15.94246-(-31.05942)));
            zz = -5.1049 + (((tickAnim - 0) / 4) * (4.44427-(-5.1049)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.5328 + (((tickAnim - 4) / 4) * (0-(5.5328)));
            yy = -15.94246 + (((tickAnim - 4) / 4) * (0-(-15.94246)));
            zz = 4.44427 + (((tickAnim - 4) / 4) * (0-(4.44427)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (4.49933-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.81046-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 27.23355 + (((tickAnim - 10) / 5) * (4.71839-(27.23355)));
            yy = 4.49933 + (((tickAnim - 10) / 5) * (-31.05942-(4.49933)));
            zz = 0.81046 + (((tickAnim - 10) / 5) * (-5.1049-(0.81046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.94893 + (((tickAnim - 0) / 3) * (0-(0.94893)));
            yy = 0.85657 + (((tickAnim - 0) / 3) * (-59-(0.85657)));
            zz = 5.47116 + (((tickAnim - 0) / 3) * (0-(5.47116)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (6-(0)));
            yy = -59 + (((tickAnim - 3) / 5) * (0-(-59)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6 + (((tickAnim - 8) / 2) * (30.11605-(6)));
            yy = 0 + (((tickAnim - 8) / 2) * (13.56425-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-10.87267-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 30.11605 + (((tickAnim - 10) / 5) * (0.94893-(30.11605)));
            yy = 13.56425 + (((tickAnim - 10) / 5) * (0.85657-(13.56425)));
            zz = -10.87267 + (((tickAnim - 10) / 5) * (5.47116-(-10.87267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.575 + (((tickAnim - 2) / 1) * (0.775-(0.575)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.775 + (((tickAnim - 3) / 5) * (0.125-(0.775)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 8) / 7) * (0-(0.125)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
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
            xx = 48.98758 + (((tickAnim - 0) / 2) * (32.25444-(48.98758)));
            yy = 26.52135 + (((tickAnim - 0) / 2) * (8.37797-(26.52135)));
            zz = 10.04002 + (((tickAnim - 0) / 2) * (43.65694-(10.04002)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 32.25444 + (((tickAnim - 2) / 2) * (-9.98614-(32.25444)));
            yy = 8.37797 + (((tickAnim - 2) / 2) * (-25.30525-(8.37797)));
            zz = 43.65694 + (((tickAnim - 2) / 2) * (34.91675-(43.65694)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -9.98614 + (((tickAnim - 4) / 3) * (0-(-9.98614)));
            yy = -25.30525 + (((tickAnim - 4) / 3) * (-64.25-(-25.30525)));
            zz = 34.91675 + (((tickAnim - 4) / 3) * (0-(34.91675)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (26.11962-(0)));
            yy = -64.25 + (((tickAnim - 7) / 5) * (0.2005-(-64.25)));
            zz = 0 + (((tickAnim - 7) / 5) * (10.94096-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 26.11962 + (((tickAnim - 12) / 3) * (48.98758-(26.11962)));
            yy = 0.2005 + (((tickAnim - 12) / 3) * (26.52135-(0.2005)));
            zz = 10.94096 + (((tickAnim - 12) / 3) * (10.04002-(10.94096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -56.33832 + (((tickAnim - 0) / 2) * (-31.59373-(-56.33832)));
            yy = 44.55976 + (((tickAnim - 0) / 2) * (42.45071-(44.55976)));
            zz = 63.48918 + (((tickAnim - 0) / 2) * (28.10927-(63.48918)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -31.59373 + (((tickAnim - 2) / 5) * (-39.64011-(-31.59373)));
            yy = 42.45071 + (((tickAnim - 2) / 5) * (48.4926-(42.45071)));
            zz = 28.10927 + (((tickAnim - 2) / 5) * (44.48249-(28.10927)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -39.64011 + (((tickAnim - 7) / 8) * (-56.33832-(-39.64011)));
            yy = 48.4926 + (((tickAnim - 7) / 8) * (44.55976-(48.4926)));
            zz = 44.48249 + (((tickAnim - 7) / 8) * (63.48918-(44.48249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -68.74177 + (((tickAnim - 0) / 2) * (12.57886-(-68.74177)));
            yy = -17.88173 + (((tickAnim - 0) / 2) * (56.73456-(-17.88173)));
            zz = 64.16327 + (((tickAnim - 0) / 2) * (-37.78518-(64.16327)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 12.57886 + (((tickAnim - 2) / 2) * (-7.26519-(12.57886)));
            yy = 56.73456 + (((tickAnim - 2) / 2) * (46.86725-(56.73456)));
            zz = -37.78518 + (((tickAnim - 2) / 2) * (-50.72073-(-37.78518)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7.26519 + (((tickAnim - 4) / 3) * (-6-(-7.26519)));
            yy = 46.86725 + (((tickAnim - 4) / 3) * (21.75-(46.86725)));
            zz = -50.72073 + (((tickAnim - 4) / 3) * (0-(-50.72073)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -6 + (((tickAnim - 7) / 5) * (-39.76974-(-6)));
            yy = 21.75 + (((tickAnim - 7) / 5) * (-1.44315-(21.75)));
            zz = 0 + (((tickAnim - 7) / 5) * (29.73427-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -39.76974 + (((tickAnim - 12) / 3) * (-68.74177-(-39.76974)));
            yy = -1.44315 + (((tickAnim - 12) / 3) * (-17.88173-(-1.44315)));
            zz = 29.73427 + (((tickAnim - 12) / 3) * (64.16327-(29.73427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.25 + (((tickAnim - 0) / 2) * (0-(0.25)));
            yy = 0.35 + (((tickAnim - 0) / 2) * (0.19-(0.35)));
            zz = 0.075 + (((tickAnim - 0) / 2) * (0.315-(0.075)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 2) / 2) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 2) / 2) * (0.16-(0.315)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.11 + (((tickAnim - 4) / 2) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 4) / 2) * (0.08-(0.16)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 1) * (0-(0.175)));
            zz = 0.08 + (((tickAnim - 6) / 1) * (0-(0.08)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.23-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.13-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0.25-(0)));
            yy = 0.23 + (((tickAnim - 9) / 6) * (0.35-(0.23)));
            zz = -0.13 + (((tickAnim - 9) / 6) * (0.075-(-0.13)));
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
