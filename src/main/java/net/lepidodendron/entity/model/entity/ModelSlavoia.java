package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSlavoia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSlavoia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private ModelAnimator animator;

    public ModelSlavoia() {
        this.textureWidth = 60;
        this.textureHeight = 58;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 20.7271F, 7.0228F);
        this.setRotateAngle(root, -0.0873F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 27, 0, -1.9691F, -0.1042F, -0.2829F, 4, 2, 4, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0308F, 1.3913F, 1.8119F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 7, -2.0F, -0.9F, -2.0F, 4, 2, 4, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.1039F, 1.7738F, 1.3671F);
        this.root.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.0878F, -0.2993F, -0.289F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 13, 41, -3.575F, -1.0F, -0.45F, 4, 1, 2, 0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-3.0833F, -0.3125F, 0.0658F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -2.9954F, 1.3081F, -3.0083F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.235F, 0.4079F, 0.2194F);
        this.rightLeg4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 24, -1.75F, -1.0F, -0.75F, 2, 1, 1, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-1.2315F, 0.057F, -0.914F);
        this.rightLeg4.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -1.6069F, -1.2755F, 1.8249F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 11, 45, -2.7019F, 0.1729F, -0.7443F, 3, 0, 2, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.1656F, 1.7738F, 1.3671F);
        this.root.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.0878F, 0.2993F, 0.289F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 13, 41, -0.425F, -1.0F, -0.45F, 4, 1, 2, 0.01F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.0833F, -0.3125F, 0.0658F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -2.9954F, -1.3081F, 3.0083F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.235F, 0.4079F, 0.2194F);
        this.leftLeg2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6981F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 51, 24, -0.25F, -1.0F, -0.75F, 2, 1, 1, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(1.2315F, 0.057F, -0.914F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -1.6069F, 1.2755F, -1.8249F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 11, 45, -0.2981F, 0.1729F, -0.7443F, 3, 0, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0308F, 1.3208F, 3.7171F);
        this.root.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 19, 29, -1.0F, -1.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0007F, 2.9738F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0524F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 42, -0.25F, -0.25F, -0.5F, 1, 1, 4, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 42, 14, -0.75F, -0.25F, -0.5F, 1, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 0, -0.75F, -0.75F, -0.5F, 1, 1, 4, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 6, -0.25F, -0.75F, -0.5F, 1, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0214F, 0.0069F, 3.2909F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0305F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 50, -0.4786F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 25, 50, -0.4786F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 22, 45, -0.4786F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0308F, 1.0208F, 0.0171F);
        this.root.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -1.5206F, -7.834F, 5, 3, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 12, -2.5F, 1.2544F, -7.834F, 5, 1, 8, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.2956F, -7.534F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 22, -2.0F, -1.2F, -5.0F, 4, 3, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 19, 22, -2.0F, 1.425F, -5.0F, 4, 1, 5, -0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.5F, -2.5F);
        this.body2.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 27, 14, -1.5F, -1.5F, -6.0F, 3, 3, 4, 0.01F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.6F, 0.5F, -5.4F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.1926F, 0.3117F, -0.2534F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 45, 32, -3.5F, -0.5F, -0.5F, 4, 1, 1, 0.01F, true));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 45, 35, -3.5F, -0.5F, 0.0F, 4, 1, 1, 0.0F, true));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.9193F, 0.1259F, 0.3392F);
        this.rightArm1.addChild(rightArm);
        this.setRotateAngle(rightArm, 1.6034F, -1.3532F, -1.5589F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 49, 47, -2.75F, -0.5F, -0.5F, 3, 1, 1, -0.01F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-2.7533F, 0.3249F, 0.0F);
        this.rightArm.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2049F, 0.0089F, 0.0795F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 48, 41, -1.2515F, 0.0997F, -0.9918F, 2, 0, 2, 0.0F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.6F, 0.5F, -5.4F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.1926F, -0.3117F, 0.2534F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 45, 32, -0.5F, -0.5F, -0.5F, 4, 1, 1, 0.01F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 45, 35, -0.5F, -0.5F, 0.0F, 4, 1, 1, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.9193F, 0.1259F, 0.3392F);
        this.leftArm1.addChild(leftArm);
        this.setRotateAngle(leftArm, 1.6034F, 1.3532F, 1.5589F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 49, 47, -0.25F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(2.7533F, 0.3249F, 0.0F);
        this.leftArm.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2049F, -0.0089F, -0.0795F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 48, 41, -0.7485F, 0.0997F, -0.9918F, 2, 0, 2, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.1F, -6.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1745F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 31, -1.5F, -1.6F, -1.75F, 3, 2, 3, -0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.925F, -1.425F);
        this.neck1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 29, -1.5F, -0.75F, -0.35F, 3, 1, 3, -0.03F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.25F, -1.75F);
        this.neck1.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 26, 39, -0.5F, -1.0489F, -4.775F, 1, 1, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 36, -1.5F, -1.875F, -2.8024F, 3, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 22, -1.5F, -1.075F, -2.8024F, 3, 1, 3, 0.009F, false));
        this.head.cubeList.add(new ModelBox(head, 53, 16, -1.0F, -1.875F, -0.7024F, 2, 2, 1, 0.005F, false));
        this.head.cubeList.add(new ModelBox(head, 48, 38, -1.5F, -1.075F, -3.1024F, 3, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.2F, -1.35F, -1.25F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1309F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 48, -0.5F, 0.3F, -1.5F, 1, 1, 3, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 27, -0.5F, -0.525F, -1.5F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.2F, -1.35F, -1.25F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1309F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 48, -0.5F, 0.3F, -1.5F, 1, 1, 3, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 27, -0.5F, -0.525F, -1.5F, 1, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.8683F, -0.2548F, -3.6094F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 54, 0.0F, -0.6F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.8683F, -0.2548F, -3.6094F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 54, 0.0F, -0.6F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.625F, -4.75F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.48F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 50, 0.0F, -1.6798F, -0.0182F, 1, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.625F, -4.75F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.48F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 50, -1.0F, -1.6798F, -0.0182F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7883F, -4.1317F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 27, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.745F, -2.8512F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 36, -0.5F, 0.0417F, -0.024F, 1, 1, 1, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.081F, -3.2365F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 36, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.6283F, -0.5751F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 34, -1.5F, 0.5759F, -2.1387F, 3, 1, 3, -0.011F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 37, -1.5F, -0.2241F, -2.1387F, 3, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 9, 48, -1.5F, 0.5759F, -2.4386F, 3, 1, 1, -0.012F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 49, 44, -1.5F, -0.2241F, -2.4386F, 3, 1, 1, -0.011F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 39, -0.5F, -0.223F, -4.1375F, 1, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.7196F, -4.1175F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4042F, -0.3954F, 0.1219F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 53, 0.0F, -0.9562F, 0.001F, 1, 1, 2, -0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.7196F, -4.1175F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4042F, 0.3954F, -0.1219F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 53, -1.0F, -0.9562F, 0.001F, 1, 1, 2, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.777F, -4.0625F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4145F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 39, 50, -0.5F, -0.9856F, -0.0728F, 1, 1, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.8072F, -0.7289F, -2.603F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3054F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 54, -0.1F, 0.3F, -1.4F, 0, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.8072F, -0.7289F, -2.603F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3054F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 31, 0.1F, 0.3F, -1.4F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.7759F, -4.1136F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.48F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 51, 20, -1.0F, -1.0048F, -0.0182F, 1, 1, 2, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.7759F, -4.1136F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.48F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 51, 0.0F, -1.0048F, -0.0182F, 1, 1, 2, -0.01F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, -1.2F, -2.2122F);
        this.head.addChild(eye);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.375F, 0.0F, 1.4872F);
        this.eye.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.1309F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 54, -0.5F, -0.5F, -2.0F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.375F, 0.0F, 1.4872F);
        this.eye.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.1309F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 31, 54, -0.5F, -0.5F, -2.0F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.base.offsetZ = this.base.offsetZ + 0.7F;
        this.root.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.6F;
        this.root.offsetX = 0.6F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 4.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.4F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSlavoia ee = (EntityPrehistoricFloraSlavoia) entitylivingbaseIn;

        if(ee.getIsMoving()) {
            if (ee.getIsFast()) {
                animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

        if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


        }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSlavoia entity = (EntityPrehistoricFloraSlavoia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 10) / 10) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSlavoia entity = (EntityPrehistoricFloraSlavoia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*10), root.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 13.65662 + (((tickAnim - 0) / 4) * (6.07618-(13.65662)));
            yy = 48.67899 + (((tickAnim - 0) / 4) * (12.834-(48.67899)));
            zz = -8.81324 + (((tickAnim - 0) / 4) * (5.8677-(-8.81324)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.07618 + (((tickAnim - 4) / 4) * (0-(6.07618)));
            yy = 12.834 + (((tickAnim - 4) / 4) * (-22.5-(12.834)));
            zz = 5.8677 + (((tickAnim - 4) / 4) * (0-(5.8677)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (13.65662-(0)));
            yy = -22.5 + (((tickAnim - 8) / 12) * (48.67899-(-22.5)));
            zz = 0 + (((tickAnim - 8) / 12) * (-8.81324-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-122.88523-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-2.13028-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-117.53596-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -122.88523 + (((tickAnim - 6) / 2) * (-156.03168-(-122.88523)));
            yy = -2.13028 + (((tickAnim - 6) / 2) * (-3.12441-(-2.13028)));
            zz = -117.53596 + (((tickAnim - 6) / 2) * (-172.38608-(-117.53596)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -156.03168 + (((tickAnim - 8) / 12) * (0-(-156.03168)));
            yy = -3.12441 + (((tickAnim - 8) / 12) * (0-(-3.12441)));
            zz = -172.38608 + (((tickAnim - 8) / 12) * (0-(-172.38608)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -55.91056 + (((tickAnim - 0) / 3) * (69.2022-(-55.91056)));
            yy = 12.71443 + (((tickAnim - 0) / 3) * (1.80928-(12.71443)));
            zz = 29.4099 + (((tickAnim - 0) / 3) * (-57.49104-(29.4099)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 69.2022 + (((tickAnim - 3) / 5) * (-51.41906-(69.2022)));
            yy = 1.80928 + (((tickAnim - 3) / 5) * (15.40196-(1.80928)));
            zz = -57.49104 + (((tickAnim - 3) / 5) * (65.01588-(-57.49104)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -51.41906 + (((tickAnim - 8) / 2) * (-43.24206-(-51.41906)));
            yy = 15.40196 + (((tickAnim - 8) / 2) * (19.66588-(15.40196)));
            zz = 65.01588 + (((tickAnim - 8) / 2) * (43.32777-(65.01588)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -43.24206 + (((tickAnim - 10) / 4) * (-37.51666-(-43.24206)));
            yy = 19.66588 + (((tickAnim - 10) / 4) * (21.31655-(19.66588)));
            zz = 43.32777 + (((tickAnim - 10) / 4) * (18.78698-(43.32777)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -37.51666 + (((tickAnim - 14) / 6) * (-55.91056-(-37.51666)));
            yy = 21.31655 + (((tickAnim - 14) / 6) * (12.71443-(21.31655)));
            zz = 18.78698 + (((tickAnim - 14) / 6) * (29.4099-(18.78698)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13.65662-(0)));
            yy = 2.5 + (((tickAnim - 0) / 8) * (-48.67899-(2.5)));
            zz = 0 + (((tickAnim - 0) / 8) * (8.81324-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 13.65662 + (((tickAnim - 8) / 5) * (6.07618-(13.65662)));
            yy = -48.67899 + (((tickAnim - 8) / 5) * (-12.834-(-48.67899)));
            zz = 8.81324 + (((tickAnim - 8) / 5) * (-5.8677-(8.81324)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 6.07618 + (((tickAnim - 13) / 4) * (1.86546-(6.07618)));
            yy = -12.834 + (((tickAnim - 13) / 4) * (22.66072-(-12.834)));
            zz = -5.8677 + (((tickAnim - 13) / 4) * (2.91825-(-5.8677)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1.86546 + (((tickAnim - 17) / 3) * (0-(1.86546)));
            yy = 22.66072 + (((tickAnim - 17) / 3) * (2.5-(22.66072)));
            zz = 2.91825 + (((tickAnim - 17) / 3) * (0-(2.91825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -186.8844 + (((tickAnim - 0) / 8) * (0-(-186.8844)));
            yy = 3.49826 + (((tickAnim - 0) / 8) * (0-(3.49826)));
            zz = 189.99206 + (((tickAnim - 0) / 8) * (0-(189.99206)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-122.88523-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (2.13028-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (117.53596-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -122.88523 + (((tickAnim - 14) / 3) * (-156.03168-(-122.88523)));
            yy = 2.13028 + (((tickAnim - 14) / 3) * (3.12441-(2.13028)));
            zz = 117.53596 + (((tickAnim - 14) / 3) * (172.38608-(117.53596)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -156.03168 + (((tickAnim - 17) / 3) * (-186.8844-(-156.03168)));
            yy = 3.12441 + (((tickAnim - 17) / 3) * (3.49826-(3.12441)));
            zz = 172.38608 + (((tickAnim - 17) / 3) * (189.99206-(172.38608)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -69.31492 + (((tickAnim - 0) / 4) * (-62.35377-(-69.31492)));
            yy = -24.70283 + (((tickAnim - 0) / 4) * (-25.90298-(-24.70283)));
            zz = -74.8576 + (((tickAnim - 0) / 4) * (-33.12097-(-74.8576)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -62.35377 + (((tickAnim - 4) / 4) * (-55.91056-(-62.35377)));
            yy = -25.90298 + (((tickAnim - 4) / 4) * (-12.71443-(-25.90298)));
            zz = -33.12097 + (((tickAnim - 4) / 4) * (-29.4099-(-33.12097)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -55.91056 + (((tickAnim - 8) / 4) * (69.2022-(-55.91056)));
            yy = -12.71443 + (((tickAnim - 8) / 4) * (-1.80928-(-12.71443)));
            zz = -29.4099 + (((tickAnim - 8) / 4) * (57.49104-(-29.4099)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 69.2022 + (((tickAnim - 12) / 5) * (-25.82981-(69.2022)));
            yy = -1.80928 + (((tickAnim - 12) / 5) * (-11.20612-(-1.80928)));
            zz = 57.49104 + (((tickAnim - 12) / 5) * (-36.42675-(57.49104)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -25.82981 + (((tickAnim - 17) / 3) * (-69.31492-(-25.82981)));
            yy = -11.20612 + (((tickAnim - 17) / 3) * (-24.70283-(-11.20612)));
            zz = -36.42675 + (((tickAnim - 17) / 3) * (-74.8576-(-36.42675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*-10), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*10), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*10), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*10), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-10), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-0.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*10), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*0.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*10), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 13.45166 + (((tickAnim - 0) / 8) * (118.955-(13.45166)));
            yy = -3.18846 + (((tickAnim - 0) / 8) * (55.35945-(-3.18846)));
            zz = 6.65573 + (((tickAnim - 0) / 8) * (63.3392-(6.65573)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 118.955 + (((tickAnim - 8) / 5) * (37.96745-(118.955)));
            yy = 55.35945 + (((tickAnim - 8) / 5) * (7.3583-(55.35945)));
            zz = 63.3392 + (((tickAnim - 8) / 5) * (42.6055-(63.3392)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 37.96745 + (((tickAnim - 13) / 5) * (0-(37.96745)));
            yy = 7.3583 + (((tickAnim - 13) / 5) * (-21-(7.3583)));
            zz = 42.6055 + (((tickAnim - 13) / 5) * (0-(42.6055)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (13.45166-(0)));
            yy = -21 + (((tickAnim - 18) / 2) * (-3.18846-(-21)));
            zz = 0 + (((tickAnim - 18) / 2) * (6.65573-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (75.49694-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.68423-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-10.22358-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 75.49694 + (((tickAnim - 8) / 8) * (72.98623-(75.49694)));
            yy = -0.68423 + (((tickAnim - 8) / 8) * (-7.84189-(-0.68423)));
            zz = -10.22358 + (((tickAnim - 8) / 8) * (-56.46431-(-10.22358)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 72.98623 + (((tickAnim - 16) / 2) * (0-(72.98623)));
            yy = -7.84189 + (((tickAnim - 16) / 2) * (0-(-7.84189)));
            zz = -56.46431 + (((tickAnim - 16) / 2) * (0-(-56.46431)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7 + (((tickAnim - 0) / 2) * (-30.2179-(-7)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.71972-(0)));
            zz = 13.75 + (((tickAnim - 0) / 2) * (30.24825-(13.75)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -30.2179 + (((tickAnim - 2) / 2) * (-52.02938-(-30.2179)));
            yy = 0.71972 + (((tickAnim - 2) / 2) * (1.58338-(0.71972)));
            zz = 30.24825 + (((tickAnim - 2) / 2) * (50.04614-(30.24825)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -52.02938 + (((tickAnim - 4) / 4) * (-31.55876-(-52.02938)));
            yy = 1.58338 + (((tickAnim - 4) / 4) * (3.16677-(1.58338)));
            zz = 50.04614 + (((tickAnim - 4) / 4) * (86.34228-(50.04614)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -31.55876 + (((tickAnim - 8) / 4) * (-8.57902-(-31.55876)));
            yy = 3.16677 + (((tickAnim - 8) / 4) * (0.62843-(3.16677)));
            zz = 86.34228 + (((tickAnim - 8) / 4) * (-93.70653-(86.34228)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -8.57902 + (((tickAnim - 12) / 1) * (-8.57902-(-8.57902)));
            yy = 0.62843 + (((tickAnim - 12) / 1) * (0.62843-(0.62843)));
            zz = -93.70653 + (((tickAnim - 12) / 1) * (-93.70653-(-93.70653)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -8.57902 + (((tickAnim - 13) / 4) * (-33.16931-(-8.57902)));
            yy = 0.62843 + (((tickAnim - 13) / 4) * (-1.46461-(0.62843)));
            zz = -93.70653 + (((tickAnim - 13) / 4) * (-3.7232-(-93.70653)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -33.16931 + (((tickAnim - 17) / 1) * (0-(-33.16931)));
            yy = -1.46461 + (((tickAnim - 17) / 1) * (0-(-1.46461)));
            zz = -3.7232 + (((tickAnim - 17) / 1) * (0-(-3.7232)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-7-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (13.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.375-(0)));
            yy = 0.2 + (((tickAnim - 0) / 8) * (0.425-(0.2)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0.375 + (((tickAnim - 8) / 4) * (0.21-(0.375)));
            yy = 0.425 + (((tickAnim - 8) / 4) * (0.04-(0.425)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0.21 + (((tickAnim - 12) / 1) * (0.21-(0.21)));
            yy = 0.04 + (((tickAnim - 12) / 1) * (0.04-(0.04)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.21 + (((tickAnim - 13) / 4) * (0-(0.21)));
            yy = 0.04 + (((tickAnim - 13) / 4) * (0.425-(0.04)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 17) / 1) * (0-(0.425)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.2-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 118.955 + (((tickAnim - 0) / 5) * (37.96745-(118.955)));
            yy = -55.35945 + (((tickAnim - 0) / 5) * (-7.3583-(-55.35945)));
            zz = -63.3392 + (((tickAnim - 0) / 5) * (-42.6055-(-63.3392)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 37.96745 + (((tickAnim - 5) / 5) * (0-(37.96745)));
            yy = -7.3583 + (((tickAnim - 5) / 5) * (21-(-7.3583)));
            zz = -42.6055 + (((tickAnim - 5) / 5) * (0-(-42.6055)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (118.955-(0)));
            yy = 21 + (((tickAnim - 10) / 10) * (-55.35945-(21)));
            zz = 0 + (((tickAnim - 10) / 10) * (-63.3392-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 75.49694 + (((tickAnim - 0) / 8) * (72.98623-(75.49694)));
            yy = 0.68423 + (((tickAnim - 0) / 8) * (7.84189-(0.68423)));
            zz = 10.22358 + (((tickAnim - 0) / 8) * (56.46431-(10.22358)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 72.98623 + (((tickAnim - 8) / 2) * (0-(72.98623)));
            yy = 7.84189 + (((tickAnim - 8) / 2) * (0-(7.84189)));
            zz = 56.46431 + (((tickAnim - 8) / 2) * (0-(56.46431)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (75.49694-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.68423-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (10.22358-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -31.55876 + (((tickAnim - 0) / 3) * (-8.57902-(-31.55876)));
            yy = -3.16677 + (((tickAnim - 0) / 3) * (-0.62843-(-3.16677)));
            zz = -86.34228 + (((tickAnim - 0) / 3) * (93.70653-(-86.34228)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -8.57902 + (((tickAnim - 3) / 2) * (-8.57902-(-8.57902)));
            yy = -0.62843 + (((tickAnim - 3) / 2) * (-0.62843-(-0.62843)));
            zz = 93.70653 + (((tickAnim - 3) / 2) * (93.70653-(93.70653)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8.57902 + (((tickAnim - 5) / 3) * (-33.16931-(-8.57902)));
            yy = -0.62843 + (((tickAnim - 5) / 3) * (-1.46461-(-0.62843)));
            zz = 93.70653 + (((tickAnim - 5) / 3) * (-3.7232-(93.70653)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -33.16931 + (((tickAnim - 8) / 2) * (0-(-33.16931)));
            yy = -1.46461 + (((tickAnim - 8) / 2) * (0-(-1.46461)));
            zz = -3.7232 + (((tickAnim - 8) / 2) * (0-(-3.7232)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-24.6716-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (10.32269-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-19.77266-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -24.6716 + (((tickAnim - 12) / 3) * (-43.3698-(-24.6716)));
            yy = 10.32269 + (((tickAnim - 12) / 3) * (7.74463-(10.32269)));
            zz = -19.77266 + (((tickAnim - 12) / 3) * (-50.51723-(-19.77266)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -43.3698 + (((tickAnim - 15) / 5) * (-31.55876-(-43.3698)));
            yy = 7.74463 + (((tickAnim - 15) / 5) * (-3.16677-(7.74463)));
            zz = -50.51723 + (((tickAnim - 15) / 5) * (-86.34228-(-50.51723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.375 + (((tickAnim - 0) / 3) * (-0.21-(-0.375)));
            yy = 0.425 + (((tickAnim - 0) / 3) * (0.04-(0.425)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.21 + (((tickAnim - 3) / 2) * (-0.21-(-0.21)));
            yy = 0.04 + (((tickAnim - 3) / 2) * (0.04-(0.04)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.21 + (((tickAnim - 5) / 3) * (0-(-0.21)));
            yy = 0.04 + (((tickAnim - 5) / 3) * (0.425-(0.04)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 2) * (0-(0.425)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-0.07-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.28-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -0.07 + (((tickAnim - 12) / 8) * (-0.375-(-0.07)));
            yy = 0.28 + (((tickAnim - 12) / 8) * (0.425-(0.28)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-10), neck1.rotateAngleZ + (float) Math.toRadians(0));
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(-0.2);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(-0.3);
        
    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSlavoia entity = (EntityPrehistoricFloraSlavoia) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-40))*3), root.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 13.65662 + (((tickAnim - 0) / 9) * (6.07618-(13.65662)));
            yy = 48.67899 + (((tickAnim - 0) / 9) * (12.834-(48.67899)));
            zz = -8.81324 + (((tickAnim - 0) / 9) * (5.8677-(-8.81324)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 6.07618 + (((tickAnim - 9) / 9) * (0-(6.07618)));
            yy = 12.834 + (((tickAnim - 9) / 9) * (-22.5-(12.834)));
            zz = 5.8677 + (((tickAnim - 9) / 9) * (0-(5.8677)));
        }
        else if (tickAnim >= 18 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 18) / 27) * (13.65662-(0)));
            yy = -22.5 + (((tickAnim - 18) / 27) * (48.67899-(-22.5)));
            zz = 0 + (((tickAnim - 18) / 27) * (-8.81324-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (-122.88523-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (-2.13028-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-117.53596-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -122.88523 + (((tickAnim - 13) / 5) * (-156.03168-(-122.88523)));
            yy = -2.13028 + (((tickAnim - 13) / 5) * (-3.12441-(-2.13028)));
            zz = -117.53596 + (((tickAnim - 13) / 5) * (-172.38608-(-117.53596)));
        }
        else if (tickAnim >= 18 && tickAnim < 45) {
            xx = -156.03168 + (((tickAnim - 18) / 27) * (0-(-156.03168)));
            yy = -3.12441 + (((tickAnim - 18) / 27) * (0-(-3.12441)));
            zz = -172.38608 + (((tickAnim - 18) / 27) * (0-(-172.38608)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -55.91056 + (((tickAnim - 0) / 7) * (69.2022-(-55.91056)));
            yy = 12.71443 + (((tickAnim - 0) / 7) * (1.80928-(12.71443)));
            zz = 29.4099 + (((tickAnim - 0) / 7) * (-57.49104-(29.4099)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 69.2022 + (((tickAnim - 7) / 11) * (-51.41906-(69.2022)));
            yy = 1.80928 + (((tickAnim - 7) / 11) * (15.40196-(1.80928)));
            zz = -57.49104 + (((tickAnim - 7) / 11) * (65.01588-(-57.49104)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -51.41906 + (((tickAnim - 18) / 5) * (-43.24206-(-51.41906)));
            yy = 15.40196 + (((tickAnim - 18) / 5) * (19.66588-(15.40196)));
            zz = 65.01588 + (((tickAnim - 18) / 5) * (43.32777-(65.01588)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -43.24206 + (((tickAnim - 23) / 9) * (-37.51666-(-43.24206)));
            yy = 19.66588 + (((tickAnim - 23) / 9) * (21.31655-(19.66588)));
            zz = 43.32777 + (((tickAnim - 23) / 9) * (18.78698-(43.32777)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -37.51666 + (((tickAnim - 32) / 13) * (-55.91056-(-37.51666)));
            yy = 21.31655 + (((tickAnim - 32) / 13) * (12.71443-(21.31655)));
            zz = 18.78698 + (((tickAnim - 32) / 13) * (29.4099-(18.78698)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (13.65662-(0)));
            yy = 2.5 + (((tickAnim - 0) / 18) * (-48.67899-(2.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (8.81324-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 13.65662 + (((tickAnim - 18) / 10) * (6.07618-(13.65662)));
            yy = -48.67899 + (((tickAnim - 18) / 10) * (-12.834-(-48.67899)));
            zz = 8.81324 + (((tickAnim - 18) / 10) * (-5.8677-(8.81324)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 6.07618 + (((tickAnim - 28) / 9) * (1.86546-(6.07618)));
            yy = -12.834 + (((tickAnim - 28) / 9) * (22.66072-(-12.834)));
            zz = -5.8677 + (((tickAnim - 28) / 9) * (2.91825-(-5.8677)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 1.86546 + (((tickAnim - 37) / 8) * (0-(1.86546)));
            yy = 22.66072 + (((tickAnim - 37) / 8) * (2.5-(22.66072)));
            zz = 2.91825 + (((tickAnim - 37) / 8) * (0-(2.91825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -186.8844 + (((tickAnim - 0) / 18) * (0-(-186.8844)));
            yy = 3.49826 + (((tickAnim - 0) / 18) * (0-(3.49826)));
            zz = 189.99206 + (((tickAnim - 0) / 18) * (0-(189.99206)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (-122.88523-(0)));
            yy = 0 + (((tickAnim - 25) / 6) * (2.13028-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (117.53596-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = -122.88523 + (((tickAnim - 31) / 6) * (-156.03168-(-122.88523)));
            yy = 2.13028 + (((tickAnim - 31) / 6) * (3.12441-(2.13028)));
            zz = 117.53596 + (((tickAnim - 31) / 6) * (172.38608-(117.53596)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = -156.03168 + (((tickAnim - 37) / 8) * (-186.8844-(-156.03168)));
            yy = 3.12441 + (((tickAnim - 37) / 8) * (3.49826-(3.12441)));
            zz = 172.38608 + (((tickAnim - 37) / 8) * (189.99206-(172.38608)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -69.31492 + (((tickAnim - 0) / 9) * (-62.35377-(-69.31492)));
            yy = -24.70283 + (((tickAnim - 0) / 9) * (-25.90298-(-24.70283)));
            zz = -74.8576 + (((tickAnim - 0) / 9) * (-33.12097-(-74.8576)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -62.35377 + (((tickAnim - 9) / 9) * (-55.91056-(-62.35377)));
            yy = -25.90298 + (((tickAnim - 9) / 9) * (-12.71443-(-25.90298)));
            zz = -33.12097 + (((tickAnim - 9) / 9) * (-29.4099-(-33.12097)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -55.91056 + (((tickAnim - 18) / 7) * (69.2022-(-55.91056)));
            yy = -12.71443 + (((tickAnim - 18) / 7) * (-1.80928-(-12.71443)));
            zz = -29.4099 + (((tickAnim - 18) / 7) * (57.49104-(-29.4099)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 69.2022 + (((tickAnim - 25) / 12) * (-25.82981-(69.2022)));
            yy = -1.80928 + (((tickAnim - 25) / 12) * (-11.20612-(-1.80928)));
            zz = 57.49104 + (((tickAnim - 25) / 12) * (-36.42675-(57.49104)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = -25.82981 + (((tickAnim - 37) / 8) * (-69.31492-(-25.82981)));
            yy = -11.20612 + (((tickAnim - 37) / 8) * (-24.70283-(-11.20612)));
            zz = -36.42675 + (((tickAnim - 37) / 8) * (-74.8576-(-36.42675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-40))*-3), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*1.5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-150))*1.5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-200))*1.5), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-250))*1.5), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-80))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-80))*-0.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-140))*3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-80))*0.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*3), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 13.45166 + (((tickAnim - 0) / 18) * (118.955-(13.45166)));
            yy = -3.18846 + (((tickAnim - 0) / 18) * (55.35945-(-3.18846)));
            zz = 6.65573 + (((tickAnim - 0) / 18) * (63.3392-(6.65573)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 118.955 + (((tickAnim - 18) / 11) * (37.96745-(118.955)));
            yy = 55.35945 + (((tickAnim - 18) / 11) * (7.3583-(55.35945)));
            zz = 63.3392 + (((tickAnim - 18) / 11) * (42.6055-(63.3392)));
        }
        else if (tickAnim >= 29 && tickAnim < 41) {
            xx = 37.96745 + (((tickAnim - 29) / 12) * (0-(37.96745)));
            yy = 7.3583 + (((tickAnim - 29) / 12) * (-21-(7.3583)));
            zz = 42.6055 + (((tickAnim - 29) / 12) * (0-(42.6055)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (13.45166-(0)));
            yy = -21 + (((tickAnim - 41) / 4) * (-3.18846-(-21)));
            zz = 0 + (((tickAnim - 41) / 4) * (6.65573-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (75.49694-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.68423-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-10.22358-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 75.49694 + (((tickAnim - 18) / 17) * (72.98623-(75.49694)));
            yy = -0.68423 + (((tickAnim - 18) / 17) * (-7.84189-(-0.68423)));
            zz = -10.22358 + (((tickAnim - 18) / 17) * (-56.46431-(-10.22358)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 72.98623 + (((tickAnim - 35) / 6) * (0-(72.98623)));
            yy = -7.84189 + (((tickAnim - 35) / 6) * (0-(-7.84189)));
            zz = -56.46431 + (((tickAnim - 35) / 6) * (0-(-56.46431)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7 + (((tickAnim - 0) / 4) * (-30.2179-(-7)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.71972-(0)));
            zz = 13.75 + (((tickAnim - 0) / 4) * (30.24825-(13.75)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -30.2179 + (((tickAnim - 4) / 5) * (-52.02938-(-30.2179)));
            yy = 0.71972 + (((tickAnim - 4) / 5) * (1.58338-(0.71972)));
            zz = 30.24825 + (((tickAnim - 4) / 5) * (50.04614-(30.24825)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -52.02938 + (((tickAnim - 9) / 9) * (-31.55876-(-52.02938)));
            yy = 1.58338 + (((tickAnim - 9) / 9) * (3.16677-(1.58338)));
            zz = 50.04614 + (((tickAnim - 9) / 9) * (86.34228-(50.04614)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -31.55876 + (((tickAnim - 18) / 8) * (-8.57902-(-31.55876)));
            yy = 3.16677 + (((tickAnim - 18) / 8) * (0.62843-(3.16677)));
            zz = 86.34228 + (((tickAnim - 18) / 8) * (-93.70653-(86.34228)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -8.57902 + (((tickAnim - 26) / 4) * (-8.57902-(-8.57902)));
            yy = 0.62843 + (((tickAnim - 26) / 4) * (0.62843-(0.62843)));
            zz = -93.70653 + (((tickAnim - 26) / 4) * (-93.70653-(-93.70653)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -8.57902 + (((tickAnim - 30) / 7) * (-33.16931-(-8.57902)));
            yy = 0.62843 + (((tickAnim - 30) / 7) * (-1.46461-(0.62843)));
            zz = -93.70653 + (((tickAnim - 30) / 7) * (-3.7232-(-93.70653)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -33.16931 + (((tickAnim - 37) / 4) * (0-(-33.16931)));
            yy = -1.46461 + (((tickAnim - 37) / 4) * (0-(-1.46461)));
            zz = -3.7232 + (((tickAnim - 37) / 4) * (0-(-3.7232)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (-7-(0)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (13.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.375-(0)));
            yy = 0.2 + (((tickAnim - 0) / 18) * (0.425-(0.2)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0.375 + (((tickAnim - 18) / 8) * (0.21-(0.375)));
            yy = 0.425 + (((tickAnim - 18) / 8) * (0.04-(0.425)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0.21 + (((tickAnim - 26) / 4) * (0.21-(0.21)));
            yy = 0.04 + (((tickAnim - 26) / 4) * (0.04-(0.04)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 0.21 + (((tickAnim - 30) / 7) * (0-(0.21)));
            yy = 0.04 + (((tickAnim - 30) / 7) * (0.425-(0.04)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 37) / 4) * (0-(0.425)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 4) * (0.2-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 118.955 + (((tickAnim - 0) / 11) * (37.96745-(118.955)));
            yy = -55.35945 + (((tickAnim - 0) / 11) * (-7.3583-(-55.35945)));
            zz = -63.3392 + (((tickAnim - 0) / 11) * (-42.6055-(-63.3392)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 37.96745 + (((tickAnim - 11) / 12) * (0-(37.96745)));
            yy = -7.3583 + (((tickAnim - 11) / 12) * (21-(-7.3583)));
            zz = -42.6055 + (((tickAnim - 11) / 12) * (0-(-42.6055)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (118.955-(0)));
            yy = 21 + (((tickAnim - 23) / 22) * (-55.35945-(21)));
            zz = 0 + (((tickAnim - 23) / 22) * (-63.3392-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 75.49694 + (((tickAnim - 0) / 17) * (72.98623-(75.49694)));
            yy = 0.68423 + (((tickAnim - 0) / 17) * (7.84189-(0.68423)));
            zz = 10.22358 + (((tickAnim - 0) / 17) * (56.46431-(10.22358)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 72.98623 + (((tickAnim - 17) / 6) * (0-(72.98623)));
            yy = 7.84189 + (((tickAnim - 17) / 6) * (0-(7.84189)));
            zz = 56.46431 + (((tickAnim - 17) / 6) * (0-(56.46431)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (75.49694-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (0.68423-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (10.22358-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -31.55876 + (((tickAnim - 0) / 8) * (-8.57902-(-31.55876)));
            yy = -3.16677 + (((tickAnim - 0) / 8) * (-0.62843-(-3.16677)));
            zz = -86.34228 + (((tickAnim - 0) / 8) * (93.70653-(-86.34228)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -8.57902 + (((tickAnim - 8) / 4) * (-8.57902-(-8.57902)));
            yy = -0.62843 + (((tickAnim - 8) / 4) * (-0.62843-(-0.62843)));
            zz = 93.70653 + (((tickAnim - 8) / 4) * (93.70653-(93.70653)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -8.57902 + (((tickAnim - 12) / 6) * (-33.16931-(-8.57902)));
            yy = -0.62843 + (((tickAnim - 12) / 6) * (-1.46461-(-0.62843)));
            zz = 93.70653 + (((tickAnim - 12) / 6) * (-3.7232-(93.70653)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -33.16931 + (((tickAnim - 18) / 5) * (0-(-33.16931)));
            yy = -1.46461 + (((tickAnim - 18) / 5) * (0-(-1.46461)));
            zz = -3.7232 + (((tickAnim - 18) / 5) * (0-(-3.7232)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (-24.6716-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (10.32269-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (-19.77266-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -24.6716 + (((tickAnim - 27) / 7) * (-43.3698-(-24.6716)));
            yy = 10.32269 + (((tickAnim - 27) / 7) * (7.74463-(10.32269)));
            zz = -19.77266 + (((tickAnim - 27) / 7) * (-50.51723-(-19.77266)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = -43.3698 + (((tickAnim - 34) / 11) * (-31.55876-(-43.3698)));
            yy = 7.74463 + (((tickAnim - 34) / 11) * (-3.16677-(7.74463)));
            zz = -50.51723 + (((tickAnim - 34) / 11) * (-86.34228-(-50.51723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.375 + (((tickAnim - 0) / 8) * (-0.21-(-0.375)));
            yy = 0.425 + (((tickAnim - 0) / 8) * (0.04-(0.425)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.21 + (((tickAnim - 8) / 4) * (-0.21-(-0.21)));
            yy = 0.04 + (((tickAnim - 8) / 4) * (0.04-(0.04)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -0.21 + (((tickAnim - 12) / 6) * (0-(-0.21)));
            yy = 0.04 + (((tickAnim - 12) / 6) * (0.425-(0.04)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 18) / 5) * (0-(0.425)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (-0.07-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0.28-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 45) {
            xx = -0.07 + (((tickAnim - 27) / 18) * (-0.375-(-0.07)));
            yy = 0.28 + (((tickAnim - 27) / 18) * (0.425-(0.28)));
            zz = 0 + (((tickAnim - 27) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(10.5), neck1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*-3), neck1.rotateAngleZ + (float) Math.toRadians(0));
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(-0.2);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(-0.3);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-7.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSlavoia e = (EntityPrehistoricFloraSlavoia) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck1, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
