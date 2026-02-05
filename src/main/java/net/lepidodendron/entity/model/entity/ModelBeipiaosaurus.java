package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBeipiaosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBeipiaosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightUpperPropatagium;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightPropatagiumExtention;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightFinger;
    private final AdvancedModelRenderer rightLowerPropatagium;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftUpperPropatagium;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftPropatagiumExtention;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftFinger;
    private final AdvancedModelRenderer leftLowerPropatagium;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelBeipiaosaurus() {
        this.textureWidth = 101;
        this.textureHeight = 98;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 6.775F, 4.0F);
        this.setRotateAngle(main, -0.0873F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, -3.1F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 6, 0.0F, -2.2F, -0.7F, 0, 2, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 0, -2.5F, -1.2F, -0.7F, 5, 3, 9, 0.015F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, -3.1F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3142F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 64, -2.0F, 7.0F, 0.4F, 4, 2, 6, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 36, -2.5F, -1.0F, -0.1F, 5, 8, 7, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.3F, 1.3711F, -0.5713F);
        this.main.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.637F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.2052F, -0.5638F);
        this.rightLeg1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1571F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 87, -0.5F, -4.0F, 3.8F, 0, 9, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 56, 36, -1.5F, -4.0F, -1.2F, 3, 9, 5, 0.003F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.1773F, -0.6959F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3352F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 59, 73, -1.0F, -0.0564F, -0.1913F, 2, 10, 2, 0.01F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 62, 86, -0.5F, -0.0564F, 1.8086F, 1, 9, 1, 0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.6547F, 1.441F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0472F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 88, 71, -1.0F, -0.0772F, -1.599F, 2, 4, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 3.5468F, -0.2495F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.4494F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 90, 7, -1.5F, -0.2298F, -1.6303F, 3, 1, 2, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.2702F, -1.6303F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 0, 86, -1.0F, -0.5F, -3.0F, 3, 1, 3, 0.01F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.3F, 1.3711F, -0.5713F);
        this.main.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.637F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.2052F, -0.5638F);
        this.leftLeg1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1571F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 87, 0.5F, -4.0F, 3.8F, 0, 9, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 36, -1.5F, -4.0F, -1.2F, 3, 9, 5, 0.003F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.1773F, -0.6959F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3352F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 59, 73, -1.0F, -0.0564F, -0.1913F, 2, 10, 2, 0.01F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 62, 86, -0.5F, -0.0564F, 1.8086F, 1, 9, 1, 0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.6547F, 1.441F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0472F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 88, 71, -1.0F, -0.0772F, -1.599F, 2, 4, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.5468F, -0.2495F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.4494F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 90, 7, -1.5F, -0.2298F, -1.6303F, 3, 1, 2, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.2702F, -1.6303F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 0, 86, -2.0F, -0.5F, -3.0F, 3, 1, 3, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.6F, -3.2F);
        this.main.addChild(body);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 6.9F, -6.7F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7679F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 73, 59, -3.0F, -0.1241F, -3.3211F, 5, 1, 3, -0.02F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 73, 53, -3.5F, -2.1241F, -3.3211F, 6, 2, 3, -0.025F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -1.5F, -4.7F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1396F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 15, -2.0F, -3.2816F, -3.1767F, 2, 3, 9, 0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 23, -4.0F, -1.2816F, -3.1767F, 6, 3, 9, 0.015F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -1.5F, -4.7F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2094F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 0, -4.0F, -1.0816F, -2.9767F, 6, 8, 3, -0.005F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2443F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 71, 64, -3.0F, 7.6F, -5.0F, 5, 1, 5, 0.004F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 52, -3.5F, -1.4F, -5.0F, 6, 9, 5, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.8F, -7.6F);
        this.body.addChild(chest);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 2.7F, -5.5F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.8029F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, -4, -0.5F, -0.0127F, 0.97F, 0, 2, 5, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 73, -2.5F, -0.0127F, 0.97F, 4, 1, 5, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 52, -3.0F, -5.0127F, -0.03F, 5, 5, 6, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.2F, -5.0F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1396F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 13, -2.5F, -2.27F, -0.0189F, 5, 3, 6, 0.015F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.05F, -0.2F, -5.0F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 57, -2.55F, -2.07F, -0.0189F, 5, 5, 5, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.4021F, 1.7959F, -3.512F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.9799F, -0.3245F, 0.1255F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 15, 84, -0.4333F, -0.4811F, -1.5474F, 2, 7, 2, 0.01F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.6417F, 7.4189F, 0.7526F);
        this.rightArm1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0087F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 13, -0.65F, -7.9F, -1.4F, 0, 7, 2, 0.0F, true));

        this.rightUpperPropatagium = new AdvancedModelRenderer(this);
        this.rightUpperPropatagium.setRotationPoint(0.5667F, -0.4811F, -1.5474F);
        this.rightArm1.addChild(rightUpperPropatagium);
        this.setRotateAngle(rightUpperPropatagium, -0.5061F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightUpperPropatagium.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 91, -0.5F, 0.0F, 0.0F, 1, 4, 2, -0.01F, true));

        this.rightPropatagiumExtention = new AdvancedModelRenderer(this);
        this.rightPropatagiumExtention.setRotationPoint(0.0F, 3.7709F, 0.9998F);
        this.rightUpperPropatagium.addChild(rightPropatagiumExtention);
        this.setRotateAngle(rightPropatagiumExtention, 1.2654F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.1F, 0.0F);
        this.rightPropatagiumExtention.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 90, 59, -0.5F, -0.8F, -1.4F, 1, 2, 2, -0.03F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5667F, 6.1564F, -0.0725F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.7453F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.875F, 0.25F, 0.9F);
        this.rightArm2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.1047F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 81, 7, 0.4F, -1.5F, -1.5F, 0, 7, 4, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 0.25F, 0.7F);
        this.rightArm2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2007F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 90, 17, 0.65F, -0.7F, -2.4F, 1, 6, 2, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 74, 89, 0.25F, -0.7F, -2.4F, 1, 6, 2, 0.01F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.6244F, 5.3621F, 0.1133F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 1.0084F, 0.1098F, -0.0342F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 49, 92, 0.0F, -0.25F, -0.8F, 1, 2, 2, -0.01F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 67, 89, 0.0F, 1.7F, -0.5F, 2, 6, 1, -0.01F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.rightHand.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.288F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 91, 0.0F, 0.85F, -0.5F, 2, 5, 1, -0.016F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHand.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0872F, 0.003F, 0.0089F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 81, 19, 0.0F, -0.25F, -0.8F, 0, 7, 4, 0.0F, true));

        this.rightFinger = new AdvancedModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.3568F, -0.2795F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.3927F, 0.0F, 0.0F);
        this.rightFinger.cubeList.add(new ModelBox(rightFinger, 51, 80, 0.0F, 0.0F, -0.5F, 2, 4, 1, -0.02F, true));

        this.rightLowerPropatagium = new AdvancedModelRenderer(this);
        this.rightLowerPropatagium.setRotationPoint(-1.0F, 5.75F, -0.8F);
        this.rightArm2.addChild(rightLowerPropatagium);
        this.setRotateAngle(rightLowerPropatagium, 0.8203F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLowerPropatagium.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.4363F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 91, 0.5F, -4.0F, 0.2F, 1, 4, 2, -0.02F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(2.4021F, 1.7959F, -3.512F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.9799F, 0.3245F, -0.1255F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 15, 84, -1.5667F, -0.4811F, -1.5474F, 2, 7, 2, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.6417F, 7.4189F, 0.7526F);
        this.leftArm1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0087F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 13, 0.65F, -7.9F, -1.4F, 0, 7, 2, 0.0F, false));

        this.leftUpperPropatagium = new AdvancedModelRenderer(this);
        this.leftUpperPropatagium.setRotationPoint(-0.5667F, -0.4811F, -1.5474F);
        this.leftArm1.addChild(leftUpperPropatagium);
        this.setRotateAngle(leftUpperPropatagium, -0.5061F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftUpperPropatagium.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3491F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 91, -0.5F, 0.0F, 0.0F, 1, 4, 2, -0.01F, false));

        this.leftPropatagiumExtention = new AdvancedModelRenderer(this);
        this.leftPropatagiumExtention.setRotationPoint(0.0F, 3.7709F, 0.9998F);
        this.leftUpperPropatagium.addChild(leftPropatagiumExtention);
        this.setRotateAngle(leftPropatagiumExtention, 1.2654F, 0.0F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.1F, 0.0F);
        this.leftPropatagiumExtention.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2182F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 90, 59, -0.5F, -0.8F, -1.4F, 1, 2, 2, -0.03F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5667F, 6.1564F, -0.0725F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.7453F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.875F, 0.25F, 0.9F);
        this.leftArm2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1047F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 81, 7, -0.4F, -1.5F, -1.5F, 0, 7, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, 0.25F, 0.7F);
        this.leftArm2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2007F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 90, 17, -1.65F, -0.7F, -2.4F, 1, 6, 2, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 74, 89, -1.25F, -0.7F, -2.4F, 1, 6, 2, 0.01F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.6244F, 5.3621F, 0.1133F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 1.0084F, -0.1098F, 0.0342F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 49, 92, -1.0F, -0.25F, -0.8F, 1, 2, 2, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 67, 89, -2.0F, 1.7F, -0.5F, 2, 6, 1, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.leftHand.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.288F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 91, -2.0F, 0.85F, -0.5F, 2, 5, 1, -0.016F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHand.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0872F, -0.003F, -0.0089F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 81, 19, 0.0F, -0.25F, -0.8F, 0, 7, 4, 0.0F, false));

        this.leftFinger = new AdvancedModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.3568F, -0.2795F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.3927F, 0.0F, 0.0F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 51, 80, -2.0F, 0.0F, -0.5F, 2, 4, 1, -0.02F, false));

        this.leftLowerPropatagium = new AdvancedModelRenderer(this);
        this.leftLowerPropatagium.setRotationPoint(1.0F, 5.75F, -0.8F);
        this.leftArm2.addChild(leftLowerPropatagium);
        this.setRotateAngle(leftLowerPropatagium, 0.8203F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLowerPropatagium.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.4363F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 91, -1.5F, -4.0F, 0.2F, 1, 4, 2, -0.02F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.9F, -4.7F);
        this.chest.addChild(neck3);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.1F, -2.8F);
        this.neck3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.48F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 80, -1.5F, -2.5258F, -0.0175F, 3, 2, 4, 0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -1.1F, -2.8F);
        this.neck3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.6632F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 1, -0.5F, 1.9742F, 0.4825F, 2, 1, 5, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 71, 71, -1.0F, -2.0258F, -0.0175F, 3, 4, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.4F, -2.2F);
        this.neck3.addChild(neck2);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, -3.1F, -4.8F);
        this.neck2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.8901F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 24, 84, 1.0F, -0.028F, 0.5512F, 0, 1, 5, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 68, 81, 0.5F, -2.028F, -0.0488F, 1, 2, 5, 0.004F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -2.1575F, -0.4332F);
        this.neck2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.7636F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 81, 87, -1.0F, -1.15F, -1.5F, 2, 2, 3, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -4.4353F, -1.4113F);
        this.neck2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.7287F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 51, 86, -1.0F, -0.9F, -1.35F, 2, 2, 3, 0.015F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -5.5F, -2.4F);
        this.neck2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -1.0996F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 62, 12, -1.0F, -0.8F, 0.0F, 2, 3, 7, 0.004F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -5.0F, -2.6F);
        this.neck2.addChild(neck);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -1.4F, -1.6F);
        this.neck.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.192F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 88, 43, -1.0F, -0.675F, -0.25F, 2, 1, 3, 0.02F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -1.4F, -1.6F);
        this.neck.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4712F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 90, 31, -1.0F, -0.7F, 0.05F, 2, 3, 2, -0.008F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 90, 25, -1.0F, -0.7F, 0.5F, 2, 3, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3F, -1.6F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 35, 87, -1.0F, -0.9F, -2.5F, 2, 2, 3, 0.005F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.004F, 0.3912F, -4.8516F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -1.0428F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 21, 57, -0.5F, -2.0F, 0.0F, 1, 2, 1, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.05F, -0.9369F, -2.2526F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -1.0738F, 0.1208F, -0.253F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 27, 43, 0.075F, -1.075F, -0.675F, 0, 2, 1, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.05F, -0.9369F, -2.2526F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -1.0738F, -0.1208F, 0.253F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 27, 43, -0.075F, -1.075F, -0.675F, 0, 2, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -1.0F, -2.2F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -1.0559F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 92, 68, -1.0F, 0.028F, -0.0765F, 2, 1, 1, -0.003F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -1.4F, -1.6F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -1.1257F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 81, 31, -1.0F, 0.0167F, 0.0262F, 2, 1, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -1.5F, -0.7F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -1.1868F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 94, 78, -1.0F, -1.0791F, -0.2237F, 2, 2, 1, -0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -1.5F, -0.7F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -1.405F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 92, 53, -1.0F, -1.0791F, -0.0237F, 2, 2, 1, -0.02F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 0.4F, -4.9F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.5934F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 21, 61, -1.0F, 0.0213F, -2.3517F, 1, 1, 1, -0.009F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 92, 91, -1.0F, 0.0244F, -1.9396F, 1, 1, 2, -0.006F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 1.6F, -4.1F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3665F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 68, 73, 0.0F, -0.7041F, 0.1065F, 0, 1, 1, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 68, 73, 1.0F, -0.7041F, 0.1065F, 0, 1, 1, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 27, 47, 0.2F, -0.7041F, -1.8935F, 0, 1, 1, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 27, 47, 0.8F, -0.7041F, -1.8935F, 0, 1, 1, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 92, 87, 0.0F, -1.0041F, -1.8935F, 1, 1, 2, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.7F, -2.2F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2793F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 81, 93, -0.7F, -0.6767F, -2.0805F, 1, 1, 2, 0.004F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 92, 64, -0.3F, -0.6767F, -2.0805F, 1, 1, 2, 0.004F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.037F, 0.5009F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.096F, 0.0F, 0.0F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, 1.3196F, -4.8101F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.4451F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 68, 76, -0.8F, -0.6918F, -0.7919F, 0, 1, 1, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 68, 76, -0.2F, -0.6918F, -0.7919F, 0, 1, 1, 0.0F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 88, 78, -1.0F, -0.4918F, -0.4919F, 1, 1, 1, -0.018F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 38, 93, -1.0F, -0.4918F, -1.7919F, 1, 1, 2, -0.013F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.9958F, 0.2717F, 0.1575F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1227F, -0.0953F, -0.0117F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 36, 69, 0.05F, -1.9168F, -2.5604F, 0, 2, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.9958F, 0.2717F, 0.1575F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1227F, 0.0953F, 0.0117F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 36, 69, -0.05F, -1.9168F, -2.5604F, 0, 2, 1, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.0F, 0.2196F, 0.0899F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1227F, -0.0953F, -0.0117F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 41, 68, 0.0F, -1.8668F, -1.9604F, 1, 2, 2, -0.06F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(1.0F, 0.2196F, 0.0899F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1227F, 0.0953F, 0.0117F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 41, 68, -1.0F, -1.8668F, -1.9604F, 1, 2, 2, -0.06F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.3F, 1.3196F, -1.4101F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.1222F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 90, 11, -0.2F, -0.1258F, -1.4375F, 1, 2, 3, -0.01F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 87, 47, -0.7F, -1.1258F, -1.4375F, 2, 1, 4, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.3F, 1.4196F, -2.9101F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.192F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 14, 94, -1.0F, -1.0423F, -1.5365F, 1, 1, 2, 0.0F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 31, 93, -0.6F, -1.0423F, -1.5365F, 1, 1, 2, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.1685F, -2.8368F);
        this.jaw.addChild(throat);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.2F, 0.1511F, 0.1267F);
        this.throat.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.2269F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 90, 37, -0.7F, -0.9674F, -0.1472F, 1, 1, 3, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, -0.2378F, -1.6873F);
        this.head.addChild(eye);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.81F, 0.0F, 0.0F);
        this.eye.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -1.4312F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 21, 64, -0.42F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 21, 64, 1.04F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.3F, 2.4F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0611F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 73, 43, -1.5F, -1.5F, -0.1F, 3, 5, 4, 0.004F, false));
        this.tail.cubeList.add(new ModelBox(tail, 81, 81, -1.0F, 3.5F, -0.6F, 2, 1, 4, 0.004F, false));
        this.tail.cubeList.add(new ModelBox(tail, 81, 0, -1.0F, -2.4F, -1.1F, 2, 1, 5, 0.004F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0087F, 3.8004F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 62, 23, -1.0F, -1.5F, 0.0F, 2, 3, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 73, 34, -0.5F, -2.5F, 0.0F, 1, 1, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 67, -0.5F, 1.5F, -1.0F, 1, 1, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0052F, 5.9001F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0524F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 43, -1.0F, -1.3F, 1.0F, 2, 2, 11, 0.004F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 68, 1.0F, -0.8F, 3.0F, 1, 1, 8, 0.004F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 68, -2.0F, -0.8F, 3.0F, 1, 1, 8, 0.004F, true));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, -8, 0.0F, -3.3F, 1.0F, 0, 6, 16, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 23, 1.0F, -2.3F, 1.0F, 0, 4, 15, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 23, -1.0F, -2.3F, 1.0F, 0, 4, 15, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {

        this.chest.offsetY = 0.0F;
        this.chest.offsetX = 0.0F;
        this.chest.offsetZ = 0.0F;
        this.chest.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.12F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.5F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(150);
        this.main.rotateAngleX = (float)Math.toRadians(5);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.7F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        EntityPrehistoricFloraBeipiaosaurus entityBeipiaosaurus = (EntityPrehistoricFloraBeipiaosaurus) e;

//        this.faceTarget(f3, f4, 12, Neck1);
//        this.faceTarget(f3, f4, 12, Neck2);
//        this.faceTarget(f3, f4, 12, Neck3);
//        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.chest, this.neck3, this.neck2, this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityBeipiaosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityBeipiaosaurus.getAnimation() == entityBeipiaosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityBeipiaosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityBeipiaosaurus.getIsMoving()) {
                    if (entityBeipiaosaurus.getAnimation() != entityBeipiaosaurus.EAT_ANIMATION
                        && entityBeipiaosaurus.getAnimation() != entityBeipiaosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityBeipiaosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraBeipiaosaurus ee = (EntityPrehistoricFloraBeipiaosaurus) entitylivingbaseIn;

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

        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeipiaosaurus entity = (EntityPrehistoricFloraBeipiaosaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 35) / 25) * (0-(15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (2.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 2.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-25 + (((tickAnim - 35) / 25) * (0-(2.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-25)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-43.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -43.25 + (((tickAnim - 35) / 25) * (0-(-43.25)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-0.9-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = -0.9 + (((tickAnim - 35) / 25) * (0-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (39.21481-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.23982-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-1.99716-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 39.21481 + (((tickAnim - 35) / 25) * (0-(39.21481)));
            yy = 0.23982 + (((tickAnim - 35) / 25) * (0-(0.23982)));
            zz = -1.99716 + (((tickAnim - 35) / 25) * (0-(-1.99716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-43.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -43.25 + (((tickAnim - 35) / 25) * (0-(-43.25)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-0.9-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = -0.9 + (((tickAnim - 35) / 25) * (0-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (39.21481-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.23982-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-1.99716-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 39.21481 + (((tickAnim - 35) / 25) * (0-(39.21481)));
            yy = 0.23982 + (((tickAnim - 35) / 25) * (0-(0.23982)));
            zz = -1.99716 + (((tickAnim - 35) / 25) * (0-(-1.99716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-25 + (((tickAnim - 35) / 25) * (0-(1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-25)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*55-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*55 + (((tickAnim - 35) / 25) * (0-(-13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*55)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.15-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = -0.725 + (((tickAnim - 35) / 25) * (0-(-0.725)));
            zz = 0.15 + (((tickAnim - 35) / 25) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (29.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*55-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 29.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*55 + (((tickAnim - 35) / 25) * (0-(29.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*55)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (48.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*55-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 48.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*55 + (((tickAnim - 35) / 25) * (0-(48.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*55)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 31.5 + (((tickAnim - 35) / 10) * (0-(31.5)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 0) / 19) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 19) * (0.045-(1)));
            zz = 1 + (((tickAnim - 0) / 19) * (1-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 19) / 16) * (1-(1)));
            yy = 0.045 + (((tickAnim - 19) / 16) * (0.045-(0.045)));
            zz = 1 + (((tickAnim - 19) / 16) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 35) / 10) * (1-(1)));
            yy = 0.045 + (((tickAnim - 35) / 10) * (1-(0.045)));
            zz = 1 + (((tickAnim - 35) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);
    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeipiaosaurus entity = (EntityPrehistoricFloraBeipiaosaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.53+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = 7.53+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*3 + (((tickAnim - 13) / 32) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*3-(7.53+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*3)));
            yy = 0 + (((tickAnim - 13) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 32) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*3 + (((tickAnim - 45) / 15) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*3)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-100))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = 11.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-100))*3 + (((tickAnim - 13) / 32) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-100))*3-(11.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-100))*3)));
            yy = 0 + (((tickAnim - 13) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 32) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-100))*3 + (((tickAnim - 45) / 15) * (0-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-100))*3)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-6.62+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-250))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = -6.62+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-250))*8 + (((tickAnim - 13) / 32) * (-2.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-250))*8-(-6.62+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-250))*8)));
            yy = 0 + (((tickAnim - 13) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 32) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -2.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-250))*8 + (((tickAnim - 45) / 15) * (0-(-2.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-250))*8)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-350))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = -10.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-350))*8 + (((tickAnim - 13) / 32) * (-8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-350))*8-(-10.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-350))*8)));
            yy = 0 + (((tickAnim - 13) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 32) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-350))*8 + (((tickAnim - 45) / 15) * (0-(-8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-350))*8)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-15.81+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-450))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = -15.81+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-450))*8 + (((tickAnim - 13) / 32) * (-11-(-15.81+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-450))*8)));
            yy = 0 + (((tickAnim - 13) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 32) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -11 + (((tickAnim - 45) / 15) * (0-(-11)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = -14 + (((tickAnim - 13) / 32) * (-14-(-14)));
            yy = 0 + (((tickAnim - 13) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 32) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -14 + (((tickAnim - 45) / 15) * (0-(-14)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (21.655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-450))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = 21.655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-450))*8 + (((tickAnim - 13) / 32) * (12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-450))*8-(21.655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-450))*8)));
            yy = 0 + (((tickAnim - 13) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 32) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-450))*8 + (((tickAnim - 45) / 15) * (0-(12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600-450))*8)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = 1.25 + (((tickAnim - 13) / 32) * (6.5-(1.25)));
            yy = 0 + (((tickAnim - 13) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 32) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 6.5 + (((tickAnim - 45) / 15) * (0-(6.5)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 0) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 13) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 13) * (1.3-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 13) / 32) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 32) * (1-(1)));
            zz = 1.3 + (((tickAnim - 13) / 32) * (1-(1.3)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 45) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 45) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 45) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeipiaosaurus entity = (EntityPrehistoricFloraBeipiaosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.75 + (((tickAnim - 10) / 10) * (0-(16.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 10) / 10) * (0-(25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.425-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.425 + (((tickAnim - 10) / 10) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -50 + (((tickAnim - 10) / 10) * (0-(-50)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.25 + (((tickAnim - 10) / 10) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (32.15677-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.44265-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.03681-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 32.15677 + (((tickAnim - 10) / 10) * (0-(32.15677)));
            yy = -2.44265 + (((tickAnim - 10) / 10) * (0-(-2.44265)));
            zz = 1.03681 + (((tickAnim - 10) / 10) * (0-(1.03681)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -50 + (((tickAnim - 10) / 10) * (0-(-50)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.25 + (((tickAnim - 10) / 10) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (32.15677-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.44265-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.03681-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 32.15677 + (((tickAnim - 10) / 10) * (0-(32.15677)));
            yy = 2.44265 + (((tickAnim - 10) / 10) * (0-(2.44265)));
            zz = -1.03681 + (((tickAnim - 10) / 10) * (0-(-1.03681)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 38.5 + (((tickAnim - 10) / 10) * (0-(38.5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.5 + (((tickAnim - 5) / 5) * (40-(5.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 40 + (((tickAnim - 10) / 10) * (0-(40)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (26.63-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 26.63 + (((tickAnim - 5) / 5) * (-9.75-(26.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.75 + (((tickAnim - 10) / 10) * (0-(-9.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -19.5 + (((tickAnim - 10) / 3) * (8.88-(-19.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 8.88 + (((tickAnim - 13) / 3) * (18.93-(8.88)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 18.93 + (((tickAnim - 16) / 4) * (0-(18.93)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12 + (((tickAnim - 10) / 10) * (0-(12)));
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
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1.1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            zz = 1.1 + (((tickAnim - 10) / 10) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeipiaosaurus entity = (EntityPrehistoricFloraBeipiaosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 20) / 10) * (-6-(-6)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 30) / 20) * (0-(-6)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.6-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (4.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -8.6 + (((tickAnim - 20) / 10) * (-8.6-(-8.6)));
            zz = 4.425 + (((tickAnim - 20) / 10) * (4.425-(4.425)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -8.6 + (((tickAnim - 30) / 20) * (0-(-8.6)));
            zz = 4.425 + (((tickAnim - 30) / 20) * (0-(4.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-48.64438-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (11.95818-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.00838-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -48.64438 + (((tickAnim - 20) / 10) * (-48.64438-(-48.64438)));
            yy = 11.95818 + (((tickAnim - 20) / 10) * (11.95818-(11.95818)));
            zz = 1.00838 + (((tickAnim - 20) / 10) * (1.00838-(1.00838)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -48.64438 + (((tickAnim - 30) / 20) * (0-(-48.64438)));
            yy = 11.95818 + (((tickAnim - 30) / 20) * (0-(11.95818)));
            zz = 1.00838 + (((tickAnim - 30) / 20) * (0-(1.00838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 30.75 + (((tickAnim - 20) / 10) * (30.75-(30.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 30.75 + (((tickAnim - 30) / 20) * (0-(30.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.175-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 20) / 10) * (-0.525-(-0.525)));
            zz = 0.175 + (((tickAnim - 20) / 10) * (0.175-(0.175)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 30) / 20) * (0-(-0.525)));
            zz = 0.175 + (((tickAnim - 30) / 20) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -38.25 + (((tickAnim - 20) / 10) * (-38.25-(-38.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -38.25 + (((tickAnim - 30) / 20) * (0-(-38.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.9 + (((tickAnim - 20) / 10) * (0.9-(0.9)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.9 + (((tickAnim - 30) / 20) * (0-(0.9)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (59.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 59.75 + (((tickAnim - 20) / 10) * (59.75-(59.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 59.75 + (((tickAnim - 30) / 20) * (0-(59.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.125 + (((tickAnim - 10) / 10) * (0-(1.125)));
            zz = -0.275 + (((tickAnim - 10) / 10) * (0-(-0.275)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (1.125-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 1.125 + (((tickAnim - 40) / 10) * (0-(1.125)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-48.64438-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.95818-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.00838-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -48.64438 + (((tickAnim - 20) / 10) * (-48.64438-(-48.64438)));
            yy = -11.95818 + (((tickAnim - 20) / 10) * (-11.95818-(-11.95818)));
            zz = -1.00838 + (((tickAnim - 20) / 10) * (-1.00838-(-1.00838)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -48.64438 + (((tickAnim - 30) / 20) * (0-(-48.64438)));
            yy = -11.95818 + (((tickAnim - 30) / 20) * (0-(-11.95818)));
            zz = -1.00838 + (((tickAnim - 30) / 20) * (0-(-1.00838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 30.75 + (((tickAnim - 20) / 10) * (30.75-(30.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 30.75 + (((tickAnim - 30) / 20) * (0-(30.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.175-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 20) / 10) * (-0.525-(-0.525)));
            zz = 0.175 + (((tickAnim - 20) / 10) * (0.175-(0.175)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 30) / 20) * (0-(-0.525)));
            zz = 0.175 + (((tickAnim - 30) / 20) * (0-(0.175)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -38.25 + (((tickAnim - 20) / 10) * (-38.25-(-38.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -38.25 + (((tickAnim - 30) / 20) * (0-(-38.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.9 + (((tickAnim - 20) / 10) * (0.9-(0.9)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.9 + (((tickAnim - 30) / 20) * (0-(0.9)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (59.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 59.75 + (((tickAnim - 20) / 10) * (59.75-(59.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 59.75 + (((tickAnim - 30) / 20) * (0-(59.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.125 + (((tickAnim - 10) / 10) * (0-(1.125)));
            zz = -0.275 + (((tickAnim - 10) / 10) * (0-(-0.275)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (1.125-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 1.125 + (((tickAnim - 40) / 10) * (0-(1.125)));
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




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.75 + (((tickAnim - 20) / 10) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 30) / 20) * (0-(12.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.74831-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.80684-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.1237-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.74831 + (((tickAnim - 20) / 10) * (4.74831-(4.74831)));
            yy = 0.80684 + (((tickAnim - 20) / 10) * (0.80684-(0.80684)));
            zz = 2.1237 + (((tickAnim - 20) / 10) * (2.1237-(2.1237)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 4.74831 + (((tickAnim - 30) / 20) * (0-(4.74831)));
            yy = 0.80684 + (((tickAnim - 30) / 20) * (0-(0.80684)));
            zz = 2.1237 + (((tickAnim - 30) / 20) * (0-(2.1237)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-27.35369-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.38592-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (29.14205-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -27.35369 + (((tickAnim - 20) / 10) * (-27.35369-(-27.35369)));
            yy = 5.38592 + (((tickAnim - 20) / 10) * (5.38592-(5.38592)));
            zz = 29.14205 + (((tickAnim - 20) / 10) * (29.14205-(29.14205)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -27.35369 + (((tickAnim - 30) / 20) * (0-(-27.35369)));
            yy = 5.38592 + (((tickAnim - 30) / 20) * (0-(5.38592)));
            zz = 29.14205 + (((tickAnim - 30) / 20) * (0-(29.14205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.54357-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.84145-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (18.00486-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.54357 + (((tickAnim - 20) / 10) * (15.54357-(15.54357)));
            yy = 5.84145 + (((tickAnim - 20) / 10) * (5.84145-(5.84145)));
            zz = 18.00486 + (((tickAnim - 20) / 10) * (18.00486-(18.00486)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15.54357 + (((tickAnim - 30) / 20) * (0-(15.54357)));
            yy = 5.84145 + (((tickAnim - 30) / 20) * (0-(5.84145)));
            zz = 18.00486 + (((tickAnim - 30) / 20) * (0-(18.00486)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.85884-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-13.7519-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (20.18787-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.85884 + (((tickAnim - 20) / 10) * (-0.85884-(-0.85884)));
            yy = -13.7519 + (((tickAnim - 20) / 10) * (-13.7519-(-13.7519)));
            zz = 20.18787 + (((tickAnim - 20) / 10) * (20.18787-(20.18787)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.85884 + (((tickAnim - 30) / 20) * (0-(-0.85884)));
            yy = -13.7519 + (((tickAnim - 30) / 20) * (0-(-13.7519)));
            zz = 20.18787 + (((tickAnim - 30) / 20) * (0-(20.18787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28.60903-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.78851-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-34.15028-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -28.60903 + (((tickAnim - 20) / 10) * (-28.60903-(-28.60903)));
            yy = -2.78851 + (((tickAnim - 20) / 10) * (-2.78851-(-2.78851)));
            zz = -34.15028 + (((tickAnim - 20) / 10) * (-34.15028-(-34.15028)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -28.60903 + (((tickAnim - 30) / 20) * (0-(-28.60903)));
            yy = -2.78851 + (((tickAnim - 30) / 20) * (0-(-2.78851)));
            zz = -34.15028 + (((tickAnim - 30) / 20) * (0-(-34.15028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.54357-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.84145-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-18.00486-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.54357 + (((tickAnim - 20) / 10) * (15.54357-(15.54357)));
            yy = -5.84145 + (((tickAnim - 20) / 10) * (-5.84145-(-5.84145)));
            zz = -18.00486 + (((tickAnim - 20) / 10) * (-18.00486-(-18.00486)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15.54357 + (((tickAnim - 30) / 20) * (0-(15.54357)));
            yy = -5.84145 + (((tickAnim - 30) / 20) * (0-(-5.84145)));
            zz = -18.00486 + (((tickAnim - 30) / 20) * (0-(-18.00486)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.85884-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (13.7519-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-20.18787-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.85884 + (((tickAnim - 20) / 10) * (-0.85884-(-0.85884)));
            yy = 13.7519 + (((tickAnim - 20) / 10) * (13.7519-(13.7519)));
            zz = -20.18787 + (((tickAnim - 20) / 10) * (-20.18787-(-20.18787)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.85884 + (((tickAnim - 30) / 20) * (0-(-0.85884)));
            yy = 13.7519 + (((tickAnim - 30) / 20) * (0-(13.7519)));
            zz = -20.18787 + (((tickAnim - 30) / 20) * (0-(-20.18787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -20.25 + (((tickAnim - 20) / 10) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -20.25 + (((tickAnim - 30) / 20) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (0.6-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0.6 + (((tickAnim - 20) / 10) * (0.6-(0.6)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0.6 + (((tickAnim - 30) / 20) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.25 + (((tickAnim - 20) / 10) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.25 + (((tickAnim - 30) / 20) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 20) / 10) * (-0.05-(-0.05)));
            zz = 0.2 + (((tickAnim - 20) / 10) * (0.2-(0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.05 + (((tickAnim - 30) / 20) * (0-(-0.05)));
            zz = 0.2 + (((tickAnim - 30) / 20) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 25 + (((tickAnim - 20) / 10) * (25-(25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 30) / 20) * (0-(25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19.24529-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.04668-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.1282-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -19.24529 + (((tickAnim - 10) / 10) * (-15.5-(-19.24529)));
            yy = 0.04668 + (((tickAnim - 10) / 10) * (0-(0.04668)));
            zz = 0.1282 + (((tickAnim - 10) / 10) * (0-(0.1282)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.5 + (((tickAnim - 20) / 10) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 30) / 20) * (0-(-15.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 20) / 10) * (-4-(-4)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -4 + (((tickAnim - 30) / 10) * (-11.5-(-4)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 40) / 10) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (20.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20.25 + (((tickAnim - 20) / 10) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20.25 + (((tickAnim - 30) / 10) * (-7-(20.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 40) / 10) * (0-(-7)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.575-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 10) * (-0.25-(-0.25)));
            zz = -0.575 + (((tickAnim - 20) / 10) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.25 + (((tickAnim - 30) / 20) * (0-(-0.25)));
            zz = -0.575 + (((tickAnim - 30) / 20) * (0-(-0.575)));
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

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeipiaosaurus entity = (EntityPrehistoricFloraBeipiaosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 3.5 + (((tickAnim - 13) / 20) * (-1-(3.5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 33) / 17) * (0-(-1)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 13) / 20) * (2.5-(-5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 33) / 17) * (0-(2.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 34 + (((tickAnim - 13) / 20) * (-23.75-(34)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 33) / 17) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (20.74-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 20.74 + (((tickAnim - 20) / 13) * (-10.75-(20.74)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10.75 + (((tickAnim - 33) / 17) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0.55-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0.55 + (((tickAnim - 33) / 17) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 14.75 + (((tickAnim - 13) / 11) * (-30.32-(14.75)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -30.32 + (((tickAnim - 24) / 4) * (-30.32-(-30.32)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -30.32 + (((tickAnim - 28) / 5) * (28.25-(-30.32)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 28.25 + (((tickAnim - 33) / 17) * (0-(28.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (53-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 53 + (((tickAnim - 7) / 6) * (46.5-(53)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 46.5 + (((tickAnim - 13) / 11) * (79.75-(46.5)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 79.75 + (((tickAnim - 24) / 4) * (79.75-(79.75)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 79.75 + (((tickAnim - 28) / 5) * (6.5-(79.75)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 33) / 17) * (0-(6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.965-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.12-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.965 + (((tickAnim - 3) / 4) * (0.675-(0.965)));
            zz = -0.12 + (((tickAnim - 3) / 4) * (0-(-0.12)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.675 + (((tickAnim - 7) / 6) * (1.375-(0.675)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            yy = 1.375 + (((tickAnim - 13) / 11) * (1.645-(1.375)));
            zz = -0.5 + (((tickAnim - 13) / 11) * (-0.87-(-0.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 1.645 + (((tickAnim - 24) / 4) * (1.645-(1.645)));
            zz = -0.87 + (((tickAnim - 24) / 4) * (-0.87-(-0.87)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 1.645 + (((tickAnim - 28) / 5) * (0.275-(1.645)));
            zz = -0.87 + (((tickAnim - 28) / 5) * (0-(-0.87)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.275 + (((tickAnim - 33) / 17) * (0-(0.275)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-76.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -76.25 + (((tickAnim - 7) / 6) * (0-(-76.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.175-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.375 + (((tickAnim - 7) / 6) * (0-(-0.375)));
            zz = 0.175 + (((tickAnim - 7) / 6) * (0-(0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 50) {
            xx = -14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*20 + (((tickAnim - 13) / 37) * (0-(-14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*20)));
            yy = 0 + (((tickAnim - 13) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 50) {
            xx = 18.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20 + (((tickAnim - 13) / 37) * (0-(18.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20)));
            yy = 0 + (((tickAnim - 13) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 13) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -10.5 + (((tickAnim - 13) / 20) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -9.75 + (((tickAnim - 13) / 20) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 5.5 + (((tickAnim - 13) / 20) * (-3.25-(5.5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 33) / 17) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3.46-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 3.46 + (((tickAnim - 13) / 10) * (3.26-(3.46)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 3.26 + (((tickAnim - 23) / 10) * (-3.75-(3.26)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -3.75 + (((tickAnim - 33) / 8) * (0.29-(-3.75)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0.29 + (((tickAnim - 41) / 9) * (0-(0.29)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -8.5 + (((tickAnim - 13) / 10) * (6.9-(-8.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 6.9 + (((tickAnim - 23) / 10) * (7.5-(6.9)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 7.5 + (((tickAnim - 33) / 8) * (-3.57-(7.5)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -3.57 + (((tickAnim - 41) / 9) * (0-(-3.57)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeipiaosaurus entity = (EntityPrehistoricFloraBeipiaosaurus) entitylivingbaseIn;
        int animCycle = 200;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 20) {
            xx = -0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*50 + (((tickAnim - 1) / 19) * (-20.25-(-0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*50)));
            yy = 0 + (((tickAnim - 1) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 19) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -20.25 + (((tickAnim - 20) / 24) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -20.25 + (((tickAnim - 44) / 16) * (-4.40673-(-20.25)));
            yy = 0 + (((tickAnim - 44) / 16) * (8.03787-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (-0.35683-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -4.40673 + (((tickAnim - 60) / 15) * (-15.83153-(-4.40673)));
            yy = 8.03787 + (((tickAnim - 60) / 15) * (15.65269-(8.03787)));
            zz = -0.35683 + (((tickAnim - 60) / 15) * (-0.69488-(-0.35683)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = -15.83153 + (((tickAnim - 75) / 95) * (-15.83153-(-15.83153)));
            yy = 15.65269 + (((tickAnim - 75) / 95) * (15.65269-(15.65269)));
            zz = -0.69488 + (((tickAnim - 75) / 95) * (-0.69488-(-0.69488)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -15.83153 + (((tickAnim - 170) / 15) * (1.08423-(-15.83153)));
            yy = 15.65269 + (((tickAnim - 170) / 15) * (7.82635-(15.65269)));
            zz = -0.69488 + (((tickAnim - 170) / 15) * (-0.34744-(-0.69488)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 1.08423 + (((tickAnim - 185) / 15) * (0-(1.08423)));
            yy = 7.82635 + (((tickAnim - 185) / 15) * (0-(7.82635)));
            zz = -0.34744 + (((tickAnim - 185) / 15) * (0-(-0.34744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            yy = 1.975 + (((tickAnim - 20) / 24) * (1.975-(1.975)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 1.975 + (((tickAnim - 44) / 16) * (2.03-(1.975)));
            zz = 0 + (((tickAnim - 44) / 16) * (-3.52-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            yy = 2.03 + (((tickAnim - 60) / 8) * (2.635-(2.03)));
            zz = -3.52 + (((tickAnim - 60) / 8) * (-6.155-(-3.52)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            yy = 2.635 + (((tickAnim - 68) / 7) * (1.98-(2.635)));
            zz = -6.155 + (((tickAnim - 68) / 7) * (-8.45-(-6.155)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            yy = 1.98 + (((tickAnim - 75) / 95) * (1.98-(1.98)));
            zz = -8.45 + (((tickAnim - 75) / 95) * (-8.45-(-8.45)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            yy = 1.98 + (((tickAnim - 170) / 30) * (0-(1.98)));
            zz = -8.45 + (((tickAnim - 170) / 30) * (0-(-8.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 20) {
            xx = 1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-50 + (((tickAnim - 1) / 19) * (37-(1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-50)));
            yy = 0 + (((tickAnim - 1) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 19) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 37 + (((tickAnim - 20) / 24) * (37-(37)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 37 + (((tickAnim - 44) / 16) * (4-(37)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 4 + (((tickAnim - 60) / 15) * (39.75-(4)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 39.75 + (((tickAnim - 75) / 95) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 39.75 + (((tickAnim - 170) / 15) * (-13.62-(39.75)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = -13.62 + (((tickAnim - 185) / 15) * (0-(-13.62)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-27-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -27 + (((tickAnim - 20) / 24) * (-27-(-27)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -27 + (((tickAnim - 44) / 6) * (16.21259-(-27)));
            yy = 0 + (((tickAnim - 44) / 6) * (-0.05693-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (-0.044-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 16.21259 + (((tickAnim - 50) / 6) * (-26.53741-(16.21259)));
            yy = -0.05693 + (((tickAnim - 50) / 6) * (-0.05693-(-0.05693)));
            zz = -0.044 + (((tickAnim - 50) / 6) * (-0.044-(-0.044)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -26.53741 + (((tickAnim - 56) / 4) * (-30.49439-(-26.53741)));
            yy = -0.05693 + (((tickAnim - 56) / 4) * (-0.15454-(-0.05693)));
            zz = -0.044 + (((tickAnim - 56) / 4) * (-0.11942-(-0.044)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -30.49439 + (((tickAnim - 60) / 15) * (-21.49439-(-30.49439)));
            yy = -0.15454 + (((tickAnim - 60) / 15) * (-0.15454-(-0.15454)));
            zz = -0.11942 + (((tickAnim - 60) / 15) * (-0.11942-(-0.11942)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = -21.49439 + (((tickAnim - 75) / 95) * (-21.49439-(-21.49439)));
            yy = -0.15454 + (((tickAnim - 75) / 95) * (-0.15454-(-0.15454)));
            zz = -0.11942 + (((tickAnim - 75) / 95) * (-0.11942-(-0.11942)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -21.49439 + (((tickAnim - 170) / 15) * (-23.49719-(-21.49439)));
            yy = -0.15454 + (((tickAnim - 170) / 15) * (-0.07727-(-0.15454)));
            zz = -0.11942 + (((tickAnim - 170) / 15) * (-0.05971-(-0.11942)));
        }
        else if (tickAnim >= 185 && tickAnim < 193) {
            xx = -23.49719 + (((tickAnim - 185) / 8) * (23.5568-(-23.49719)));
            yy = -0.07727 + (((tickAnim - 185) / 8) * (-0.03434-(-0.07727)));
            zz = -0.05971 + (((tickAnim - 185) / 8) * (-0.02654-(-0.05971)));
        }
        else if (tickAnim >= 193 && tickAnim < 200) {
            xx = 23.5568 + (((tickAnim - 193) / 7) * (0-(23.5568)));
            yy = -0.03434 + (((tickAnim - 193) / 7) * (0-(-0.03434)));
            zz = -0.02654 + (((tickAnim - 193) / 7) * (0-(-0.02654)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 44) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 12) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 4) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 60) / 125) * (0-(0)));
            yy = -0.15 + (((tickAnim - 60) / 125) * (-0.245-(-0.15)));
            zz = 0 + (((tickAnim - 60) / 125) * (0.1-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            yy = -0.245 + (((tickAnim - 185) / 15) * (0-(-0.245)));
            zz = 0.1 + (((tickAnim - 185) / 15) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 9.75 + (((tickAnim - 20) / 24) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 44) / 6) * (-31.51-(9.75)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = -31.51 + (((tickAnim - 50) / 4) * (-31.51-(-31.51)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -31.51 + (((tickAnim - 54) / 6) * (16.5-(-31.51)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 170) {
            xx = 16.5 + (((tickAnim - 60) / 110) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 60) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 110) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 16.5 + (((tickAnim - 170) / 15) * (29.5-(16.5)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 193) {
            xx = 29.5 + (((tickAnim - 185) / 8) * (-19.64-(29.5)));
            yy = 0 + (((tickAnim - 185) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 8) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 200) {
            xx = -19.64 + (((tickAnim - 193) / 7) * (0-(-19.64)));
            yy = 0 + (((tickAnim - 193) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 60) / 110) * (0-(0)));
            yy = -0.175 + (((tickAnim - 60) / 110) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 60) / 110) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 170) / 23) * (0-(0)));
            yy = -0.175 + (((tickAnim - 170) / 23) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 170) / 23) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 193) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 193) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (85.21-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 85.21 + (((tickAnim - 50) / 4) * (89.39726-(85.21)));
            yy = 0 + (((tickAnim - 50) / 4) * (2.56847-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (1.76235-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 89.39726 + (((tickAnim - 54) / 6) * (13.25-(89.39726)));
            yy = 2.56847 + (((tickAnim - 54) / 6) * (0-(2.56847)));
            zz = 1.76235 + (((tickAnim - 54) / 6) * (0-(1.76235)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 13.25 + (((tickAnim - 60) / 15) * (-19.20276-(13.25)));
            yy = 0 + (((tickAnim - 60) / 15) * (-0.90198-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (-0.41989-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = -19.20276 + (((tickAnim - 75) / 95) * (-19.20276-(-19.20276)));
            yy = -0.90198 + (((tickAnim - 75) / 95) * (-0.90198-(-0.90198)));
            zz = -0.41989 + (((tickAnim - 75) / 95) * (-0.41989-(-0.41989)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -19.20276 + (((tickAnim - 170) / 15) * (6.39862-(-19.20276)));
            yy = -0.90198 + (((tickAnim - 170) / 15) * (-0.45099-(-0.90198)));
            zz = -0.41989 + (((tickAnim - 170) / 15) * (-0.20994-(-0.41989)));
        }
        else if (tickAnim >= 185 && tickAnim < 193) {
            xx = 6.39862 + (((tickAnim - 185) / 8) * (70.34383-(6.39862)));
            yy = -0.45099 + (((tickAnim - 185) / 8) * (-0.20044-(-0.45099)));
            zz = -0.20994 + (((tickAnim - 185) / 8) * (-0.09331-(-0.20994)));
        }
        else if (tickAnim >= 193 && tickAnim < 197) {
            xx = 70.34383 + (((tickAnim - 193) / 4) * (66.67192-(70.34383)));
            yy = -0.20044 + (((tickAnim - 193) / 4) * (-0.10022-(-0.20044)));
            zz = -0.09331 + (((tickAnim - 193) / 4) * (-0.04665-(-0.09331)));
        }
        else if (tickAnim >= 197 && tickAnim < 200) {
            xx = 66.67192 + (((tickAnim - 197) / 3) * (0-(66.67192)));
            yy = -0.10022 + (((tickAnim - 197) / 3) * (0-(-0.10022)));
            zz = -0.04665 + (((tickAnim - 197) / 3) * (0-(-0.04665)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 6) / 7) * (0.125-(0.125)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 13) / 7) * (0-(0.125)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0.975-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (-0.85-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 50) / 4) * (0.975-(0.975)));
            zz = -0.85 + (((tickAnim - 50) / 4) * (-0.85-(-0.85)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = 0.975 + (((tickAnim - 54) / 6) * (0-(0.975)));
            zz = -0.85 + (((tickAnim - 54) / 6) * (0-(-0.85)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 15) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            yy = -0.15 + (((tickAnim - 75) / 95) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 170) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 170) / 8) * (1.015-(-0.15)));
            zz = 0 + (((tickAnim - 170) / 8) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            yy = 1.015 + (((tickAnim - 178) / 7) * (0.425-(1.015)));
            zz = 0 + (((tickAnim - 178) / 7) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 185) / 8) * (0-(0)));
            yy = 0.425 + (((tickAnim - 185) / 8) * (0.9-(0.425)));
            zz = 0 + (((tickAnim - 185) / 8) * (-0.725-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 197) {
            xx = 0 + (((tickAnim - 193) / 4) * (0-(0)));
            yy = 0.9 + (((tickAnim - 193) / 4) * (0-(0.9)));
            zz = -0.725 + (((tickAnim - 193) / 4) * (-0.65-(-0.725)));
        }
        else if (tickAnim >= 197 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 197) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 197) / 3) * (0-(0)));
            zz = -0.65 + (((tickAnim - 197) / 3) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 20) {
            xx = 1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-50 + (((tickAnim - 1) / 19) * (37-(1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-50)));
            yy = 0 + (((tickAnim - 1) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 19) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 37 + (((tickAnim - 20) / 24) * (37-(37)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 37 + (((tickAnim - 44) / 16) * (37-(37)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 37 + (((tickAnim - 60) / 15) * (6-(37)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 6 + (((tickAnim - 75) / 95) * (6-(6)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 6 + (((tickAnim - 170) / 15) * (43.82048-(6)));
            yy = 0 + (((tickAnim - 170) / 15) * (-7.93563-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (-1.0161-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 43.82048 + (((tickAnim - 185) / 15) * (0-(43.82048)));
            yy = -7.93563 + (((tickAnim - 185) / 15) * (0-(-7.93563)));
            zz = -1.0161 + (((tickAnim - 185) / 15) * (0-(-1.0161)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-27-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -27 + (((tickAnim - 20) / 24) * (-27-(-27)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -27 + (((tickAnim - 44) / 16) * (-27-(-27)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -27 + (((tickAnim - 60) / 8) * (14.13-(-27)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 14.13 + (((tickAnim - 68) / 3) * (-21.62-(14.13)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
            xx = -21.62 + (((tickAnim - 71) / 4) * (-23.75-(-21.62)));
            yy = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = -23.75 + (((tickAnim - 75) / 95) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = -23.75 + (((tickAnim - 170) / 8) * (21.38-(-23.75)));
            yy = 0 + (((tickAnim - 170) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 8) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 21.38 + (((tickAnim - 178) / 7) * (-25.5-(21.38)));
            yy = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 7) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = -25.5 + (((tickAnim - 185) / 15) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 4) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 71) / 4) * (0.5-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            yy = -0.1 + (((tickAnim - 75) / 95) * (-0.1-(-0.1)));
            zz = 0.5 + (((tickAnim - 75) / 95) * (0.5-(0.5)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            yy = -0.1 + (((tickAnim - 170) / 15) * (0-(-0.1)));
            zz = 0.5 + (((tickAnim - 170) / 15) * (0-(0.5)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 9.75 + (((tickAnim - 20) / 24) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 9.75 + (((tickAnim - 44) / 16) * (26.75-(9.75)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 26.75 + (((tickAnim - 60) / 8) * (-21.48-(26.75)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -21.48 + (((tickAnim - 68) / 3) * (-30.98-(-21.48)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
            xx = -30.98 + (((tickAnim - 71) / 4) * (35.75-(-30.98)));
            yy = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 35.75 + (((tickAnim - 75) / 95) * (35.75-(35.75)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = 35.75 + (((tickAnim - 170) / 8) * (-12.25-(35.75)));
            yy = 0 + (((tickAnim - 170) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 8) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = -12.25 + (((tickAnim - 178) / 7) * (25.25-(-12.25)));
            yy = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 7) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 25.25 + (((tickAnim - 185) / 15) * (0-(25.25)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 68 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 4) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            yy = -0.25 + (((tickAnim - 75) / 95) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 170) / 8) * (0-(0)));
            yy = -0.25 + (((tickAnim - 170) / 8) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 170) / 8) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 7) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -33.25 + (((tickAnim - 60) / 3) * (49.47-(-33.25)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 49.47 + (((tickAnim - 63) / 5) * (74.69-(49.47)));
            yy = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 5) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 74.69 + (((tickAnim - 68) / 3) * (74.69-(74.69)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
            xx = 74.69 + (((tickAnim - 71) / 4) * (-4-(74.69)));
            yy = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = -4 + (((tickAnim - 75) / 95) * (-4-(-4)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = -4 + (((tickAnim - 170) / 8) * (79.38-(-4)));
            yy = 0 + (((tickAnim - 170) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 8) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 79.38 + (((tickAnim - 178) / 7) * (13.75-(79.38)));
            yy = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 7) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 13.75 + (((tickAnim - 185) / 15) * (0-(13.75)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 6) / 7) * (0.125-(0.125)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 13) / 7) * (0-(0.125)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 16) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0.175-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            yy = -0.45 + (((tickAnim - 60) / 3) * (0.67-(-0.45)));
            zz = 0.175 + (((tickAnim - 60) / 3) * (-0.4-(0.175)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            yy = 0.67 + (((tickAnim - 63) / 5) * (1.25-(0.67)));
            zz = -0.4 + (((tickAnim - 63) / 5) * (-0.775-(-0.4)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            yy = 1.25 + (((tickAnim - 68) / 3) * (1.25-(1.25)));
            zz = -0.775 + (((tickAnim - 68) / 3) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            yy = 1.25 + (((tickAnim - 71) / 4) * (0.03-(1.25)));
            zz = -0.775 + (((tickAnim - 71) / 4) * (0.18-(-0.775)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            yy = 0.03 + (((tickAnim - 75) / 95) * (0.03-(0.03)));
            zz = 0.18 + (((tickAnim - 75) / 95) * (0.18-(0.18)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 170) / 8) * (0-(0)));
            yy = 0.03 + (((tickAnim - 170) / 8) * (0.95-(0.03)));
            zz = 0.18 + (((tickAnim - 170) / 8) * (-0.75-(0.18)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            yy = 0.95 + (((tickAnim - 178) / 7) * (-0.125-(0.95)));
            zz = -0.75 + (((tickAnim - 178) / 7) * (-0.525-(-0.75)));
        }
        else if (tickAnim >= 185 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 185) / 8) * (0-(0)));
            yy = -0.125 + (((tickAnim - 185) / 8) * (0.865-(-0.125)));
            zz = -0.525 + (((tickAnim - 185) / 8) * (-0.26-(-0.525)));
        }
        else if (tickAnim >= 193 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 193) / 7) * (0-(0)));
            yy = 0.865 + (((tickAnim - 193) / 7) * (0-(0.865)));
            zz = -0.26 + (((tickAnim - 193) / 7) * (0-(-0.26)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5 + (((tickAnim - 20) / 24) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5 + (((tickAnim - 44) / 16) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 170) {
            xx = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5 + (((tickAnim - 60) / 110) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5)));
            yy = 0 + (((tickAnim - 60) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 110) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5 + (((tickAnim - 170) / 15) * (13.4-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-0.5)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 13.4 + (((tickAnim - 185) / 15) * (0-(13.4)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5 + (((tickAnim - 20) / 24) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5 + (((tickAnim - 44) / 16) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 170) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5 + (((tickAnim - 60) / 110) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5)));
            yy = 0 + (((tickAnim - 60) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 110) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5 + (((tickAnim - 170) / 15) * (10.07-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-0.5)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 10.07 + (((tickAnim - 185) / 15) * (0-(10.07)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.45758-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.78298-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-9.06278-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 4.45758 + (((tickAnim - 20) / 24) * (4.45758-(4.45758)));
            yy = -0.78298 + (((tickAnim - 20) / 24) * (-0.78298-(-0.78298)));
            zz = -9.06278 + (((tickAnim - 20) / 24) * (-9.06278-(-9.06278)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 4.45758 + (((tickAnim - 44) / 16) * (15.20758-(4.45758)));
            yy = -0.78298 + (((tickAnim - 44) / 16) * (-0.78298-(-0.78298)));
            zz = -9.06278 + (((tickAnim - 44) / 16) * (-9.06278-(-9.06278)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 15.20758 + (((tickAnim - 60) / 15) * (4.45758-(15.20758)));
            yy = -0.78298 + (((tickAnim - 60) / 15) * (-0.78298-(-0.78298)));
            zz = -9.06278 + (((tickAnim - 60) / 15) * (-9.06278-(-9.06278)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 4.45758 + (((tickAnim - 75) / 95) * (4.45758-(4.45758)));
            yy = -0.78298 + (((tickAnim - 75) / 95) * (-0.78298-(-0.78298)));
            zz = -9.06278 + (((tickAnim - 75) / 95) * (-9.06278-(-9.06278)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 4.45758 + (((tickAnim - 170) / 15) * (-14.52121-(4.45758)));
            yy = -0.78298 + (((tickAnim - 170) / 15) * (-0.39149-(-0.78298)));
            zz = -9.06278 + (((tickAnim - 170) / 15) * (-4.53139-(-9.06278)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = -14.52121 + (((tickAnim - 185) / 15) * (0-(-14.52121)));
            yy = -0.39149 + (((tickAnim - 185) / 15) * (0-(-0.39149)));
            zz = -4.53139 + (((tickAnim - 185) / 15) * (0-(-4.53139)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.30876-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (10.83385-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.44728-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -0.30876 + (((tickAnim - 20) / 24) * (-0.30876-(-0.30876)));
            yy = 10.83385 + (((tickAnim - 20) / 24) * (10.83385-(10.83385)));
            zz = -3.44728 + (((tickAnim - 20) / 24) * (-3.44728-(-3.44728)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -0.30876 + (((tickAnim - 44) / 16) * (-24.30876-(-0.30876)));
            yy = 10.83385 + (((tickAnim - 44) / 16) * (10.83385-(10.83385)));
            zz = -3.44728 + (((tickAnim - 44) / 16) * (-3.44728-(-3.44728)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -24.30876 + (((tickAnim - 60) / 15) * (-0.30876-(-24.30876)));
            yy = 10.83385 + (((tickAnim - 60) / 15) * (10.83385-(10.83385)));
            zz = -3.44728 + (((tickAnim - 60) / 15) * (-3.44728-(-3.44728)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = -0.30876 + (((tickAnim - 75) / 95) * (-0.30876-(-0.30876)));
            yy = 10.83385 + (((tickAnim - 75) / 95) * (10.83385-(10.83385)));
            zz = -3.44728 + (((tickAnim - 75) / 95) * (-3.44728-(-3.44728)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = -0.30876 + (((tickAnim - 170) / 30) * (0-(-0.30876)));
            yy = 10.83385 + (((tickAnim - 170) / 30) * (0-(10.83385)));
            zz = -3.44728 + (((tickAnim - 170) / 30) * (0-(-3.44728)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 16) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (-0.6-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = -0.45 + (((tickAnim - 60) / 15) * (0-(-0.45)));
            zz = -0.6 + (((tickAnim - 60) / 15) * (0-(-0.6)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (32.6617-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 32.6617 + (((tickAnim - 20) / 24) * (32.6617-(32.6617)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 200) {
            xx = 32.6617 + (((tickAnim - 44) / 156) * (0-(32.6617)));
            yy = 0 + (((tickAnim - 44) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 156) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 15.5 + (((tickAnim - 20) / 24) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 200) {
            xx = 15.5 + (((tickAnim - 44) / 156) * (0-(15.5)));
            yy = 0 + (((tickAnim - 44) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 156) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFinger, rightFinger.rotateAngleX + (float) Math.toRadians(xx), rightFinger.rotateAngleY + (float) Math.toRadians(yy), rightFinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.45758-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.78298-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (9.06278-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 4.45758 + (((tickAnim - 20) / 24) * (4.45758-(4.45758)));
            yy = 0.78298 + (((tickAnim - 20) / 24) * (0.78298-(0.78298)));
            zz = 9.06278 + (((tickAnim - 20) / 24) * (9.06278-(9.06278)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 4.45758 + (((tickAnim - 44) / 16) * (15.20758-(4.45758)));
            yy = 0.78298 + (((tickAnim - 44) / 16) * (0.78298-(0.78298)));
            zz = 9.06278 + (((tickAnim - 44) / 16) * (9.06278-(9.06278)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 15.20758 + (((tickAnim - 60) / 15) * (4.45758-(15.20758)));
            yy = 0.78298 + (((tickAnim - 60) / 15) * (0.78298-(0.78298)));
            zz = 9.06278 + (((tickAnim - 60) / 15) * (9.06278-(9.06278)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 4.45758 + (((tickAnim - 75) / 95) * (4.45758-(4.45758)));
            yy = 0.78298 + (((tickAnim - 75) / 95) * (0.78298-(0.78298)));
            zz = 9.06278 + (((tickAnim - 75) / 95) * (9.06278-(9.06278)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 4.45758 + (((tickAnim - 170) / 15) * (-14.52121-(4.45758)));
            yy = 0.78298 + (((tickAnim - 170) / 15) * (-0.39149-(0.78298)));
            zz = 9.06278 + (((tickAnim - 170) / 15) * (-4.53139-(9.06278)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = -14.52121 + (((tickAnim - 185) / 15) * (0-(-14.52121)));
            yy = -0.39149 + (((tickAnim - 185) / 15) * (0-(-0.39149)));
            zz = -4.53139 + (((tickAnim - 185) / 15) * (0-(-4.53139)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.30876-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-10.83385-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (3.44728-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -0.30876 + (((tickAnim - 20) / 24) * (-0.30876-(-0.30876)));
            yy = -10.83385 + (((tickAnim - 20) / 24) * (-10.83385-(-10.83385)));
            zz = 3.44728 + (((tickAnim - 20) / 24) * (3.44728-(3.44728)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -0.30876 + (((tickAnim - 44) / 16) * (-24.30876-(-0.30876)));
            yy = -10.83385 + (((tickAnim - 44) / 16) * (-10.83385-(-10.83385)));
            zz = 3.44728 + (((tickAnim - 44) / 16) * (3.44728-(3.44728)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -24.30876 + (((tickAnim - 60) / 15) * (-0.30876-(-24.30876)));
            yy = -10.83385 + (((tickAnim - 60) / 15) * (-10.83385-(-10.83385)));
            zz = 3.44728 + (((tickAnim - 60) / 15) * (3.44728-(3.44728)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = -0.30876 + (((tickAnim - 75) / 95) * (-0.30876-(-0.30876)));
            yy = -10.83385 + (((tickAnim - 75) / 95) * (-10.83385-(-10.83385)));
            zz = 3.44728 + (((tickAnim - 75) / 95) * (3.44728-(3.44728)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = -0.30876 + (((tickAnim - 170) / 30) * (0-(-0.30876)));
            yy = -10.83385 + (((tickAnim - 170) / 30) * (0-(-10.83385)));
            zz = 3.44728 + (((tickAnim - 170) / 30) * (0-(3.44728)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 16) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (-0.6-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = -0.45 + (((tickAnim - 60) / 15) * (0-(-0.45)));
            zz = -0.6 + (((tickAnim - 60) / 15) * (0-(-0.6)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (32.6617-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 32.6617 + (((tickAnim - 20) / 24) * (32.6617-(32.6617)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 32.6617 + (((tickAnim - 44) / 16) * (32.6617-(32.6617)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 32.6617 + (((tickAnim - 60) / 15) * (22.5-(32.6617)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 22.5 + (((tickAnim - 75) / 95) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 22.5 + (((tickAnim - 170) / 30) * (0-(22.5)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 15.5 + (((tickAnim - 20) / 24) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 200) {
            xx = 15.5 + (((tickAnim - 44) / 156) * (0-(15.5)));
            yy = 0 + (((tickAnim - 44) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 156) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFinger, leftFinger.rotateAngleX + (float) Math.toRadians(xx), leftFinger.rotateAngleY + (float) Math.toRadians(yy), leftFinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (38.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 38.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 10) / 10) * (-11.25-(38.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -11.25 + (((tickAnim - 20) / 24) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -11.25 + (((tickAnim - 44) / 16) * (-11.26388-(-11.25)));
            yy = 0 + (((tickAnim - 44) / 16) * (6.85719-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (5.00926-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -11.26388 + (((tickAnim - 60) / 15) * (-11.26388-(-11.26388)));
            yy = 6.85719 + (((tickAnim - 60) / 15) * (6.85719-(6.85719)));
            zz = 5.00926 + (((tickAnim - 60) / 15) * (5.00926-(5.00926)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = -11.26388 + (((tickAnim - 75) / 8) * (-3.01388-(-11.26388)));
            yy = 6.85719 + (((tickAnim - 75) / 8) * (6.85719-(6.85719)));
            zz = 5.00926 + (((tickAnim - 75) / 8) * (5.00926-(5.00926)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -3.01388 + (((tickAnim - 83) / 7) * (-11.26388-(-3.01388)));
            yy = 6.85719 + (((tickAnim - 83) / 7) * (6.85719-(6.85719)));
            zz = 5.00926 + (((tickAnim - 83) / 7) * (5.00926-(5.00926)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -11.26388 + (((tickAnim - 90) / 30) * (-11.26388-(-11.26388)));
            yy = 6.85719 + (((tickAnim - 90) / 30) * (6.85719-(6.85719)));
            zz = 5.00926 + (((tickAnim - 90) / 30) * (5.00926-(5.00926)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -11.26388 + (((tickAnim - 120) / 10) * (-11.43562-(-11.26388)));
            yy = 6.85719 + (((tickAnim - 120) / 10) * (12.00466-(6.85719)));
            zz = 5.00926 + (((tickAnim - 120) / 10) * (3.96226-(5.00926)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = -11.43562 + (((tickAnim - 130) / 20) * (-11.43562-(-11.43562)));
            yy = 12.00466 + (((tickAnim - 130) / 20) * (12.00466-(12.00466)));
            zz = 3.96226 + (((tickAnim - 130) / 20) * (3.96226-(3.96226)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -11.43562 + (((tickAnim - 150) / 20) * (-11.43562-(-11.43562)));
            yy = 12.00466 + (((tickAnim - 150) / 20) * (12.00466-(12.00466)));
            zz = 3.96226 + (((tickAnim - 150) / 20) * (3.96226-(3.96226)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -11.43562 + (((tickAnim - 170) / 15) * (-18.46781-(-11.43562)));
            yy = 12.00466 + (((tickAnim - 170) / 15) * (6.00233-(12.00466)));
            zz = 3.96226 + (((tickAnim - 170) / 15) * (1.98113-(3.96226)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = -18.46781 + (((tickAnim - 185) / 15) * (0-(-18.46781)));
            yy = 6.00233 + (((tickAnim - 185) / 15) * (0-(6.00233)));
            zz = 1.98113 + (((tickAnim - 185) / 15) * (0-(1.98113)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 0) / 185) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 185) * (0.325-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0.325 + (((tickAnim - 185) / 15) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 10) / 10) * (10.5-(10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 10.5 + (((tickAnim - 20) / 24) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 10.5 + (((tickAnim - 44) / 16) * (-22.40474-(10.5)));
            yy = 0 + (((tickAnim - 44) / 16) * (10.36194-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (-1.70644-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -22.40474 + (((tickAnim - 60) / 15) * (10.6583-(-22.40474)));
            yy = 10.36194 + (((tickAnim - 60) / 15) * (9.83087-(10.36194)));
            zz = -1.70644 + (((tickAnim - 60) / 15) * (1.84045-(-1.70644)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 10.6583 + (((tickAnim - 75) / 8) * (-1.20928-(10.6583)));
            yy = 9.83087 + (((tickAnim - 75) / 8) * (10.91047-(9.83087)));
            zz = 1.84045 + (((tickAnim - 75) / 8) * (4.78499-(1.84045)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -1.20928 + (((tickAnim - 83) / 7) * (11.92314-(-1.20928)));
            yy = 10.91047 + (((tickAnim - 83) / 7) * (11.99007-(10.91047)));
            zz = 4.78499 + (((tickAnim - 83) / 7) * (7.72953-(4.78499)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 11.92314 + (((tickAnim - 90) / 30) * (11.92314-(11.92314)));
            yy = 11.99007 + (((tickAnim - 90) / 30) * (11.99007-(11.99007)));
            zz = 7.72953 + (((tickAnim - 90) / 30) * (7.72953-(7.72953)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 11.92314 + (((tickAnim - 120) / 10) * (8.64529-(11.92314)));
            yy = 11.99007 + (((tickAnim - 120) / 10) * (16.14676-(11.99007)));
            zz = 7.72953 + (((tickAnim - 120) / 10) * (8.64283-(7.72953)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = 8.64529 + (((tickAnim - 130) / 20) * (8.64529-(8.64529)));
            yy = 16.14676 + (((tickAnim - 130) / 20) * (16.14676-(16.14676)));
            zz = 8.64283 + (((tickAnim - 130) / 20) * (8.64283-(8.64283)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 8.64529 + (((tickAnim - 150) / 20) * (8.64529-(8.64529)));
            yy = 16.14676 + (((tickAnim - 150) / 20) * (16.14676-(16.14676)));
            zz = 8.64283 + (((tickAnim - 150) / 20) * (8.64283-(8.64283)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 8.64529 + (((tickAnim - 170) / 15) * (-15-(8.64529)));
            yy = 16.14676 + (((tickAnim - 170) / 15) * (0-(16.14676)));
            zz = 8.64283 + (((tickAnim - 170) / 15) * (0-(8.64283)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = -15 + (((tickAnim - 185) / 15) * (0-(-15)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.25-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 60) / 110) * (0-(0)));
            yy = -0.5 + (((tickAnim - 60) / 110) * (0-(-0.5)));
            zz = 0.25 + (((tickAnim - 60) / 110) * (0-(0.25)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-26.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -26.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 10) / 10) * (9.25-(-26.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 9.25 + (((tickAnim - 20) / 5) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 9.25 + (((tickAnim - 25) / 3) * (12-(9.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12 + (((tickAnim - 28) / 2) * (9.25-(12)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 9.25 + (((tickAnim - 30) / 3) * (12-(9.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 12 + (((tickAnim - 33) / 2) * (9.25-(12)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 9.25 + (((tickAnim - 35) / 9) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 9.25 + (((tickAnim - 44) / 16) * (27.46792-(9.25)));
            yy = 0 + (((tickAnim - 44) / 16) * (9.94239-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (2.5049-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 27.46792 + (((tickAnim - 60) / 15) * (9.25-(27.46792)));
            yy = 9.94239 + (((tickAnim - 60) / 15) * (0-(9.94239)));
            zz = 2.5049 + (((tickAnim - 60) / 15) * (0-(2.5049)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 9.25 + (((tickAnim - 75) / 8) * (10.12505-(9.25)));
            yy = 0 + (((tickAnim - 75) / 8) * (4.62495-(0)));
            zz = 0 + (((tickAnim - 75) / 8) * (4.74719-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 10.12505 + (((tickAnim - 83) / 7) * (3.00009-(10.12505)));
            yy = 4.62495 + (((tickAnim - 83) / 7) * (9.24989-(4.62495)));
            zz = 4.74719 + (((tickAnim - 83) / 7) * (9.49438-(4.74719)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 3.00009 + (((tickAnim - 90) / 3) * (5.00009-(3.00009)));
            yy = 9.24989 + (((tickAnim - 90) / 3) * (9.24989-(9.24989)));
            zz = 9.49438 + (((tickAnim - 90) / 3) * (9.49438-(9.49438)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = 5.00009 + (((tickAnim - 93) / 2) * (3.00009-(5.00009)));
            yy = 9.24989 + (((tickAnim - 93) / 2) * (9.24989-(9.24989)));
            zz = 9.49438 + (((tickAnim - 93) / 2) * (9.49438-(9.49438)));
        }
        else if (tickAnim >= 95 && tickAnim < 98) {
            xx = 3.00009 + (((tickAnim - 95) / 3) * (3.00009-(3.00009)));
            yy = 9.24989 + (((tickAnim - 95) / 3) * (9.24989-(9.24989)));
            zz = 9.49438 + (((tickAnim - 95) / 3) * (9.49438-(9.49438)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 3.00009 + (((tickAnim - 98) / 3) * (5.00009-(3.00009)));
            yy = 9.24989 + (((tickAnim - 98) / 3) * (9.24989-(9.24989)));
            zz = 9.49438 + (((tickAnim - 98) / 3) * (9.49438-(9.49438)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 5.00009 + (((tickAnim - 101) / 2) * (3.00009-(5.00009)));
            yy = 9.24989 + (((tickAnim - 101) / 2) * (9.24989-(9.24989)));
            zz = 9.49438 + (((tickAnim - 101) / 2) * (9.49438-(9.49438)));
        }
        else if (tickAnim >= 103 && tickAnim < 120) {
            xx = 3.00009 + (((tickAnim - 103) / 17) * (3.00009-(3.00009)));
            yy = 9.24989 + (((tickAnim - 103) / 17) * (9.24989-(9.24989)));
            zz = 9.49438 + (((tickAnim - 103) / 17) * (9.49438-(9.49438)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 3.00009 + (((tickAnim - 120) / 10) * (3.04841-(3.00009)));
            yy = 9.24989 + (((tickAnim - 120) / 10) * (13.74363-(9.24989)));
            zz = 9.49438 + (((tickAnim - 120) / 10) * (9.73659-(9.49438)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = 3.04841 + (((tickAnim - 130) / 20) * (3.04841-(3.04841)));
            yy = 13.74363 + (((tickAnim - 130) / 20) * (13.74363-(13.74363)));
            zz = 9.73659 + (((tickAnim - 130) / 20) * (9.73659-(9.73659)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 3.04841 + (((tickAnim - 150) / 20) * (3.04841-(3.04841)));
            yy = 13.74363 + (((tickAnim - 150) / 20) * (13.74363-(13.74363)));
            zz = 9.73659 + (((tickAnim - 150) / 20) * (9.73659-(9.73659)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 3.04841 + (((tickAnim - 170) / 15) * (-7.75-(3.04841)));
            yy = 13.74363 + (((tickAnim - 170) / 15) * (0-(13.74363)));
            zz = 9.73659 + (((tickAnim - 170) / 15) * (0-(9.73659)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = -7.75 + (((tickAnim - 185) / 15) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 75) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 8) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 75) / 8) * (0.15-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 83) / 7) * (0-(-0.225)));
            zz = 0.15 + (((tickAnim - 83) / 7) * (0-(0.15)));
        }
        else if (tickAnim >= 90 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 90) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 5) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 95) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 3) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 103) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 17) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 130) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 20) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 26 + (((tickAnim - 10) / 10) * (13.5-(26)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 13.5 + (((tickAnim - 20) / 5) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 13.5 + (((tickAnim - 25) / 3) * (9.75-(13.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 9.75 + (((tickAnim - 28) / 2) * (13.5-(9.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 13.5 + (((tickAnim - 30) / 3) * (9.75-(13.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 9.75 + (((tickAnim - 33) / 2) * (13.5-(9.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 75) {
            xx = 13.5 + (((tickAnim - 35) / 40) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 35) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 40) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 13.5 + (((tickAnim - 75) / 3) * (10-(13.5)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 10 + (((tickAnim - 78) / 5) * (13.5-(10)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = 13.5 + (((tickAnim - 83) / 4) * (10-(13.5)));
            yy = 0 + (((tickAnim - 83) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 4) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 90) {
            xx = 10 + (((tickAnim - 87) / 3) * (13.5-(10)));
            yy = 0 + (((tickAnim - 87) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 3) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 13.5 + (((tickAnim - 90) / 3) * (9.25-(13.5)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = 9.25 + (((tickAnim - 93) / 2) * (10-(9.25)));
            yy = 0 + (((tickAnim - 93) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 2) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 98) {
            xx = 10 + (((tickAnim - 95) / 3) * (13.5-(10)));
            yy = 0 + (((tickAnim - 95) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 3) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 101) {
            xx = 13.5 + (((tickAnim - 98) / 3) * (9.25-(13.5)));
            yy = 0 + (((tickAnim - 98) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 3) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 9.25 + (((tickAnim - 101) / 2) * (13.5-(9.25)));
            yy = 0 + (((tickAnim - 101) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 2) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 120) {
            xx = 13.5 + (((tickAnim - 103) / 17) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 103) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 17) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 13.5 + (((tickAnim - 120) / 5) * (18.75-(13.5)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 18.75 + (((tickAnim - 125) / 5) * (13.5-(18.75)));
            yy = 0 + (((tickAnim - 125) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 5) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = 13.5 + (((tickAnim - 130) / 20) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 130) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 20) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 13.5 + (((tickAnim - 150) / 20) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 13.5 + (((tickAnim - 170) / 15) * (17.5-(13.5)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 17.5 + (((tickAnim - 185) / 15) * (0-(17.5)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.55-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 10) / 10) * (0-(-0.175)));
            zz = 0.55 + (((tickAnim - 10) / 10) * (0-(0.55)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 35) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 40) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 75) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 8) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 90) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 5) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 95) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 3) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 103) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 17) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 130) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 20) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-245.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+100))*250-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 22) {
            xx = -245.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+100))*250 + (((tickAnim - 1) / 21) * (-2.95-(-245.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+100))*250)));
            yy = 0 + (((tickAnim - 1) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 21) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 44) {
            xx = -2.95 + (((tickAnim - 22) / 22) * (-2.95-(-2.95)));
            yy = 0 + (((tickAnim - 22) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 22) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -2.95 + (((tickAnim - 44) / 6) * (-6.63935-(-2.95)));
            yy = 0 + (((tickAnim - 44) / 6) * (-0.00925-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0.04952-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -6.63935 + (((tickAnim - 50) / 10) * (-5.98361-(-6.63935)));
            yy = -0.00925 + (((tickAnim - 50) / 10) * (-0.00555-(-0.00925)));
            zz = 0.04952 + (((tickAnim - 50) / 10) * (0.02971-(0.04952)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -5.98361 + (((tickAnim - 60) / 15) * (0-(-5.98361)));
            yy = -0.00555 + (((tickAnim - 60) / 15) * (0-(-0.00555)));
            zz = 0.02971 + (((tickAnim - 60) / 15) * (0-(0.02971)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (-2.95-(0)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -2.95 + (((tickAnim - 170) / 15) * (9.28-(-2.95)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = 9.28 + (((tickAnim - 185) / 15) * (0-(9.28)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 22) {
            xx = -0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*50 + (((tickAnim - 1) / 21) * (1.25-(-0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*50)));
            yy = 0 + (((tickAnim - 1) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 21) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 44) {
            xx = 1.25 + (((tickAnim - 22) / 22) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 22) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 22) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 1.25 + (((tickAnim - 44) / 16) * (-11.75-(1.25)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -11.75 + (((tickAnim - 60) / 15) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (1.25-(0)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 1.25 + (((tickAnim - 170) / 15) * (-4.12-(1.25)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = -4.12 + (((tickAnim - 185) / 15) * (0-(-4.12)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (-0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (1.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*200-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 22) {
            xx = 1.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*200 + (((tickAnim - 1) / 21) * (10.25-(1.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*200)));
            yy = 0 + (((tickAnim - 1) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 21) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 44) {
            xx = 10.25 + (((tickAnim - 22) / 22) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 22) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 22) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 44) / 6) * (13.18-(10.25)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 13.18 + (((tickAnim - 50) / 10) * (-3.5-(13.18)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -3.5 + (((tickAnim - 60) / 15) * (6.75-(-3.5)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 6.75 + (((tickAnim - 75) / 95) * (10.25-(6.75)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 10.25 + (((tickAnim - 170) / 15) * (-15.62-(10.25)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = -15.62 + (((tickAnim - 185) / 15) * (0-(-15.62)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 0) / 185) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 185) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 185) / 4) * (-20.12-(0)));
            yy = 0 + (((tickAnim - 185) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 4) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 193) {
            xx = -20.12 + (((tickAnim - 189) / 4) * (24.25-(-20.12)));
            yy = 0 + (((tickAnim - 189) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 4) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 195) {
            xx = 24.25 + (((tickAnim - 193) / 2) * (-9.75-(24.25)));
            yy = 0 + (((tickAnim - 193) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 2) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 197) {
            xx = -9.75 + (((tickAnim - 195) / 2) * (-41.5-(-9.75)));
            yy = 0 + (((tickAnim - 195) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 2) * (0-(0)));
        }
        else if (tickAnim >= 197 && tickAnim < 200) {
            xx = -41.5 + (((tickAnim - 197) / 3) * (0-(-41.5)));
            yy = 0 + (((tickAnim - 197) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 197) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 0) / 185) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 185) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 185) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 8) * (0.225-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 197) {
            xx = 0 + (((tickAnim - 193) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 193) / 4) * (0-(0)));
            zz = 0.225 + (((tickAnim - 193) / 4) * (0-(0.225)));
        }
        else if (tickAnim >= 197 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 197) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 197) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 197) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 60 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 60) / 3) * (-27-(0)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = -27 + (((tickAnim - 63) / 5) * (23.25-(-27)));
            yy = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 5) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 23.25 + (((tickAnim - 68) / 3) * (23.25-(23.25)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
            xx = 23.25 + (((tickAnim - 71) / 4) * (0-(23.25)));
            yy = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 170) / 4) * (-30.28-(0)));
            yy = 0 + (((tickAnim - 170) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 4) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 178) {
            xx = -30.28 + (((tickAnim - 174) / 4) * (17.5-(-30.28)));
            yy = 0 + (((tickAnim - 174) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 4) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 17.5 + (((tickAnim - 178) / 7) * (-61-(17.5)));
            yy = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 7) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 200) {
            xx = -61 + (((tickAnim - 185) / 15) * (0-(-61)));
            yy = 0 + (((tickAnim - 185) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0.25-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0.25 + (((tickAnim - 68) / 3) * (0.25-(0.25)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            zz = 0.25 + (((tickAnim - 71) / 4) * (0-(0.25)));
        }
        else if (tickAnim >= 75 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 95) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 170) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 4) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 170) / 4) * (0.23-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 174) / 4) * (0-(0)));
            yy = -0.05 + (((tickAnim - 174) / 4) * (0-(-0.05)));
            zz = 0.23 + (((tickAnim - 174) / 4) * (0.225-(0.23)));
        }
        else if (tickAnim >= 178 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 178) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 22) * (0-(0)));
            zz = 0.225 + (((tickAnim - 178) / 22) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 75 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 75) / 3) * (9-(0)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 9 + (((tickAnim - 78) / 5) * (0-(9)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 83) / 4) * (9-(0)));
            yy = 0 + (((tickAnim - 83) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 4) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 90) {
            xx = 9 + (((tickAnim - 87) / 3) * (0-(9)));
            yy = 0 + (((tickAnim - 87) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 10) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 5) * (0.1075-(1)));
            zz = 1 + (((tickAnim - 10) / 5) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 15) / 5) * (1-(1)));
            yy = 0.1075 + (((tickAnim - 15) / 5) * (1-(0.1075)));
            zz = 1 + (((tickAnim - 15) / 5) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 1 + (((tickAnim - 20) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 20) / 17) * (1-(1)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 37) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 37) / 5) * (0.1075-(1)));
            zz = 1 + (((tickAnim - 37) / 5) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 42) / 5) * (1-(1)));
            yy = 0.1075 + (((tickAnim - 42) / 5) * (1-(0.1075)));
            zz = 1 + (((tickAnim - 42) / 5) * (1-(1)));
        }
        else if (tickAnim >= 47 && tickAnim < 76) {
            xx = 1 + (((tickAnim - 47) / 29) * (1-(1)));
            yy = 1 + (((tickAnim - 47) / 29) * (1-(1)));
            zz = 1 + (((tickAnim - 47) / 29) * (1-(1)));
        }
        else if (tickAnim >= 76 && tickAnim < 81) {
            xx = 1 + (((tickAnim - 76) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 76) / 5) * (0.1075-(1)));
            zz = 1 + (((tickAnim - 76) / 5) * (1-(1)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 1 + (((tickAnim - 81) / 5) * (1-(1)));
            yy = 0.1075 + (((tickAnim - 81) / 5) * (1-(0.1075)));
            zz = 1 + (((tickAnim - 81) / 5) * (1-(1)));
        }
        else if (tickAnim >= 86 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 86) / 34) * (1-(1)));
            yy = 1 + (((tickAnim - 86) / 34) * (1-(1)));
            zz = 1 + (((tickAnim - 86) / 34) * (1-(1)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 1 + (((tickAnim - 120) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 120) / 5) * (0.1075-(1)));
            zz = 1 + (((tickAnim - 120) / 5) * (1-(1)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 125) / 5) * (1-(1)));
            yy = 0.1075 + (((tickAnim - 125) / 5) * (1-(0.1075)));
            zz = 1 + (((tickAnim - 125) / 5) * (1-(1)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 1 + (((tickAnim - 130) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 130) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 130) / 30) * (1-(1)));
        }
        else if (tickAnim >= 160 && tickAnim < 165) {
            xx = 1 + (((tickAnim - 160) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 160) / 5) * (0.1075-(1)));
            zz = 1 + (((tickAnim - 160) / 5) * (1-(1)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = 1 + (((tickAnim - 165) / 5) * (1-(1)));
            yy = 0.1075 + (((tickAnim - 165) / 5) * (1-(0.1075)));
            zz = 1 + (((tickAnim - 165) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);
    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeipiaosaurus entity = (EntityPrehistoricFloraBeipiaosaurus) entitylivingbaseIn;
        int animCycle = 280;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = -4.25 + (((tickAnim - 25) / 60) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = -4.25 + (((tickAnim - 85) / 20) * (4.5-(-4.25)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 4.5 + (((tickAnim - 105) / 65) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 4.5 + (((tickAnim - 170) / 30) * (-4.25-(4.5)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = -4.25 + (((tickAnim - 200) / 60) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -4.25 + (((tickAnim - 260) / 20) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-3.15-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            zz = -3.15 + (((tickAnim - 25) / 60) * (-3.15-(-3.15)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = -3.15 + (((tickAnim - 85) / 20) * (-1.475-(-3.15)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = -1.475 + (((tickAnim - 105) / 65) * (-1.475-(-1.475)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = -1.475 + (((tickAnim - 170) / 30) * (-3.15-(-1.475)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = -3.15 + (((tickAnim - 200) / 60) * (-3.15-(-3.15)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = -3.15 + (((tickAnim - 260) / 20) * (0-(-3.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = 30 + (((tickAnim - 25) / 60) * (30-(30)));
            yy = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 30 + (((tickAnim - 85) / 20) * (8-(30)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 8 + (((tickAnim - 105) / 65) * (8-(8)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 8 + (((tickAnim - 170) / 30) * (30-(8)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = 30 + (((tickAnim - 200) / 60) * (30-(30)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 30 + (((tickAnim - 260) / 20) * (0-(30)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = -9.75 + (((tickAnim - 25) / 60) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = -9.75 + (((tickAnim - 85) / 20) * (-3.25-(-9.75)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = -3.25 + (((tickAnim - 105) / 65) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = -3.25 + (((tickAnim - 170) / 30) * (-9.75-(-3.25)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = -9.75 + (((tickAnim - 200) / 60) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -9.75 + (((tickAnim - 260) / 20) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = -16 + (((tickAnim - 25) / 60) * (-16-(-16)));
            yy = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = -16 + (((tickAnim - 85) / 20) * (-8.75-(-16)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = -8.75 + (((tickAnim - 105) / 65) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = -8.75 + (((tickAnim - 170) / 30) * (-16-(-8.75)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = -16 + (((tickAnim - 200) / 60) * (-16-(-16)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -16 + (((tickAnim - 260) / 20) * (0-(-16)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            yy = -0.075 + (((tickAnim - 25) / 60) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = -0.075 + (((tickAnim - 85) / 20) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            yy = -0.075 + (((tickAnim - 200) / 60) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            yy = -0.075 + (((tickAnim - 260) / 20) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-22.87-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -22.87 + (((tickAnim - 18) / 7) * (-13.25-(-22.87)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = -13.25 + (((tickAnim - 25) / 60) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = -13.25 + (((tickAnim - 85) / 20) * (4.25-(-13.25)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 4.25 + (((tickAnim - 105) / 65) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 4.25 + (((tickAnim - 170) / 18) * (-25.12-(4.25)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -25.12 + (((tickAnim - 188) / 12) * (-13.25-(-25.12)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = -13.25 + (((tickAnim - 200) / 60) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -13.25 + (((tickAnim - 260) / 20) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 19 + (((tickAnim - 8) / 10) * (0.63-(19)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0.63 + (((tickAnim - 18) / 7) * (-15.25-(0.63)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = -15.25 + (((tickAnim - 25) / 60) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = -15.25 + (((tickAnim - 85) / 8) * (22.63-(-15.25)));
            yy = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 8) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 105) {
            xx = 22.63 + (((tickAnim - 93) / 12) * (-4.75-(22.63)));
            yy = 0 + (((tickAnim - 93) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 12) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = -4.75 + (((tickAnim - 105) / 65) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = -4.75 + (((tickAnim - 170) / 18) * (17.38-(-4.75)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 17.38 + (((tickAnim - 188) / 12) * (-15.25-(17.38)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = -15.25 + (((tickAnim - 200) / 60) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 270) {
            xx = -15.25 + (((tickAnim - 260) / 10) * (22.88-(-15.25)));
            yy = 0 + (((tickAnim - 260) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 10) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = 22.88 + (((tickAnim - 270) / 10) * (0-(22.88)));
            yy = 0 + (((tickAnim - 270) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -26.75 + (((tickAnim - 18) / 7) * (24.5-(-26.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = 24.5 + (((tickAnim - 25) / 60) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = 24.5 + (((tickAnim - 85) / 8) * (-19.46-(24.5)));
            yy = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 8) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 105) {
            xx = -19.46 + (((tickAnim - 93) / 12) * (0-(-19.46)));
            yy = 0 + (((tickAnim - 93) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 12) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 170) / 18) * (-33.37-(0)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -33.37 + (((tickAnim - 188) / 12) * (24.5-(-33.37)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = 24.5 + (((tickAnim - 200) / 60) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 270) {
            xx = 24.5 + (((tickAnim - 260) / 10) * (-24-(24.5)));
            yy = 0 + (((tickAnim - 260) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 10) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = -24 + (((tickAnim - 270) / 10) * (0-(-24)));
            yy = 0 + (((tickAnim - 270) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (53.2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 53.2 + (((tickAnim - 8) / 10) * (86.13-(53.2)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 86.13 + (((tickAnim - 18) / 7) * (8.25-(86.13)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = 8.25 + (((tickAnim - 25) / 60) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = 8.25 + (((tickAnim - 85) / 8) * (76.56-(8.25)));
            yy = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 8) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 105) {
            xx = 76.56 + (((tickAnim - 93) / 12) * (-3-(76.56)));
            yy = 0 + (((tickAnim - 93) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 12) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = -3 + (((tickAnim - 105) / 65) * (-3-(-3)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = -3 + (((tickAnim - 170) / 18) * (72.94-(-3)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 72.94 + (((tickAnim - 188) / 12) * (8.25-(72.94)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = 8.25 + (((tickAnim - 200) / 60) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 270) {
            xx = 8.25 + (((tickAnim - 260) / 10) * (72.80348-(8.25)));
            yy = 0 + (((tickAnim - 260) / 10) * (-1.82891-(0)));
            zz = 0 + (((tickAnim - 260) / 10) * (-1.81557-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = 72.80348 + (((tickAnim - 270) / 10) * (0-(72.80348)));
            yy = -1.82891 + (((tickAnim - 270) / 10) * (0-(-1.82891)));
            zz = -1.81557 + (((tickAnim - 270) / 10) * (0-(-1.81557)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.23-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.7-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 1.23 + (((tickAnim - 18) / 7) * (0.25-(1.23)));
            zz = -0.7 + (((tickAnim - 18) / 7) * (0-(-0.7)));
        }
        else if (tickAnim >= 25 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 25) / 60) * (0-(0)));
            yy = 0.25 + (((tickAnim - 25) / 60) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 25) / 60) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            yy = 0.25 + (((tickAnim - 85) / 8) * (1.605-(0.25)));
            zz = 0 + (((tickAnim - 85) / 8) * (-0.95-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 93) / 12) * (0-(0)));
            yy = 1.605 + (((tickAnim - 93) / 12) * (0.325-(1.605)));
            zz = -0.95 + (((tickAnim - 93) / 12) * (0-(-0.95)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0.325 + (((tickAnim - 105) / 65) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            yy = 0.325 + (((tickAnim - 170) / 18) * (1.695-(0.325)));
            zz = 0 + (((tickAnim - 170) / 18) * (-0.55-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = 1.695 + (((tickAnim - 188) / 12) * (0.25-(1.695)));
            zz = -0.55 + (((tickAnim - 188) / 12) * (0-(-0.55)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            yy = 0.25 + (((tickAnim - 200) / 60) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 260) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 260) / 10) * (1.78-(0.25)));
            zz = 0 + (((tickAnim - 260) / 10) * (-0.775-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 270) / 10) * (0-(0)));
            yy = 1.78 + (((tickAnim - 270) / 10) * (0-(1.78)));
            zz = -0.775 + (((tickAnim - 270) / 10) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 85) / 3) * (-20.15-(0)));
            yy = 0 + (((tickAnim - 85) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 3) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = -20.15 + (((tickAnim - 88) / 5) * (32.75-(-20.15)));
            yy = 0 + (((tickAnim - 88) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 5) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = 32.75 + (((tickAnim - 93) / 4) * (20.07-(32.75)));
            yy = 0 + (((tickAnim - 93) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 4) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 99) {
            xx = 20.07 + (((tickAnim - 97) / 2) * (-3.87-(20.07)));
            yy = 0 + (((tickAnim - 97) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 2) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 105) {
            xx = -3.87 + (((tickAnim - 99) / 6) * (0-(-3.87)));
            yy = 0 + (((tickAnim - 99) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 6) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 170) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 90) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 105) {
            xx = -5.25 + (((tickAnim - 25) / 80) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 25) / 80) * (7-(0)));
            zz = 0 + (((tickAnim - 25) / 80) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 7 + (((tickAnim - 105) / 15) * (7-(7)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 120) / 12) * (-4.75-(0)));
            yy = 7 + (((tickAnim - 120) / 12) * (7-(7)));
            zz = 0 + (((tickAnim - 120) / 12) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = -4.75 + (((tickAnim - 132) / 18) * (-4.75-(-4.75)));
            yy = 7 + (((tickAnim - 132) / 18) * (7-(7)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -4.75 + (((tickAnim - 150) / 20) * (-4.75-(-4.75)));
            yy = 7 + (((tickAnim - 150) / 20) * (7-(7)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = -4.75 + (((tickAnim - 170) / 30) * (-5.25-(-4.75)));
            yy = 7 + (((tickAnim - 170) / 30) * (0-(7)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 280) {
            xx = -5.25 + (((tickAnim - 200) / 80) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 200) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -10.5 + (((tickAnim - 25) / 15) * (-20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-10.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 40) / 15) * (-10.5-(-20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = -10.5 + (((tickAnim - 55) / 15) * (-20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*15-(-10.5)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*15 + (((tickAnim - 70) / 15) * (-5.5-(-20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*15)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = -5.5 + (((tickAnim - 85) / 20) * (0.43538-(-5.5)));
            yy = 0 + (((tickAnim - 85) / 20) * (8.98955-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (2.78423-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0.43538 + (((tickAnim - 105) / 15) * (0.43538-(0.43538)));
            yy = 8.98955 + (((tickAnim - 105) / 15) * (8.98955-(8.98955)));
            zz = 2.78423 + (((tickAnim - 105) / 15) * (2.78423-(2.78423)));
        }
        else if (tickAnim >= 120 && tickAnim < 132) {
            xx = 0.43538 + (((tickAnim - 120) / 12) * (-3.0573-(0.43538)));
            yy = 8.98955 + (((tickAnim - 120) / 12) * (13.73941-(8.98955)));
            zz = 2.78423 + (((tickAnim - 120) / 12) * (2.82134-(2.78423)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = -3.0573 + (((tickAnim - 132) / 18) * (-3.0573-(-3.0573)));
            yy = 13.73941 + (((tickAnim - 132) / 18) * (13.73941-(13.73941)));
            zz = 2.82134 + (((tickAnim - 132) / 18) * (2.82134-(2.82134)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -3.0573 + (((tickAnim - 150) / 20) * (-3.0573-(-3.0573)));
            yy = 13.73941 + (((tickAnim - 150) / 20) * (13.73941-(13.73941)));
            zz = 2.82134 + (((tickAnim - 150) / 20) * (2.82134-(2.82134)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = -3.0573 + (((tickAnim - 170) / 30) * (-10.5-(-3.0573)));
            yy = 13.73941 + (((tickAnim - 170) / 30) * (0-(13.73941)));
            zz = 2.82134 + (((tickAnim - 170) / 30) * (0-(2.82134)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = -10.5 + (((tickAnim - 200) / 15) * (-20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-10.5)));
            yy = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 15) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = -20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 215) / 15) * (-10.5-(-20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 15) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = -10.5 + (((tickAnim - 230) / 15) * (-20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*15-(-10.5)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 260) {
            xx = -20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*15 + (((tickAnim - 245) / 15) * (-5.5-(-20.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*15)));
            yy = 0 + (((tickAnim - 245) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 15) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -5.5 + (((tickAnim - 260) / 20) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 70) {
            xx = 18.5 + (((tickAnim - 25) / 45) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 25) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 45) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 18.5 + (((tickAnim - 70) / 35) * (0-(18.5)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (18.5-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 245) {
            xx = 18.5 + (((tickAnim - 200) / 45) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 200) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 45) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 18.5 + (((tickAnim - 245) / 35) * (0-(18.5)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 70) {
            xx = -22.5 + (((tickAnim - 25) / 45) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 25) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 45) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = -22.5 + (((tickAnim - 70) / 35) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 245) {
            xx = -22.5 + (((tickAnim - 200) / 45) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 200) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 45) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = -22.5 + (((tickAnim - 245) / 35) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 70) {
            xx = 21 + (((tickAnim - 25) / 45) * (21-(21)));
            yy = 0 + (((tickAnim - 25) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 45) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 21 + (((tickAnim - 70) / 35) * (0-(21)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (21-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 245) {
            xx = 21 + (((tickAnim - 200) / 45) * (21-(21)));
            yy = 0 + (((tickAnim - 200) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 45) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 21 + (((tickAnim - 245) / 35) * (0-(21)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 70) {
            xx = 18.5 + (((tickAnim - 25) / 45) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 25) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 45) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 18.5 + (((tickAnim - 70) / 35) * (0-(18.5)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (18.5-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 245) {
            xx = 18.5 + (((tickAnim - 200) / 45) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 200) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 45) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 18.5 + (((tickAnim - 245) / 35) * (0-(18.5)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 70) {
            xx = -22.5 + (((tickAnim - 25) / 45) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 25) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 45) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = -22.5 + (((tickAnim - 70) / 35) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 245) {
            xx = -22.5 + (((tickAnim - 200) / 45) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 200) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 45) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = -22.5 + (((tickAnim - 245) / 35) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 70) {
            xx = 21 + (((tickAnim - 25) / 45) * (21-(21)));
            yy = 0 + (((tickAnim - 25) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 45) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = 21 + (((tickAnim - 70) / 35) * (0-(21)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (21-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 245) {
            xx = 21 + (((tickAnim - 200) / 45) * (21-(21)));
            yy = 0 + (((tickAnim - 200) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 45) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 21 + (((tickAnim - 245) / 35) * (0-(21)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -11.5 + (((tickAnim - 25) / 15) * (-1.75-(-11.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -1.75 + (((tickAnim - 40) / 15) * (-11.5-(-1.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = -11.5 + (((tickAnim - 55) / 15) * (-1.75-(-11.5)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -1.75 + (((tickAnim - 70) / 15) * (-11.5-(-1.75)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = -11.5 + (((tickAnim - 85) / 9) * (-12.29997-(-11.5)));
            yy = 0 + (((tickAnim - 85) / 9) * (5.53226-(0)));
            zz = 0 + (((tickAnim - 85) / 9) * (-0.96515-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = -12.29997 + (((tickAnim - 94) / 11) * (-9.97266-(-12.29997)));
            yy = 5.53226 + (((tickAnim - 94) / 11) * (12.07038-(5.53226)));
            zz = -0.96515 + (((tickAnim - 94) / 11) * (-2.10578-(-0.96515)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -9.97266 + (((tickAnim - 105) / 15) * (-9.97266-(-9.97266)));
            yy = 12.07038 + (((tickAnim - 105) / 15) * (12.07038-(12.07038)));
            zz = -2.10578 + (((tickAnim - 105) / 15) * (-2.10578-(-2.10578)));
        }
        else if (tickAnim >= 120 && tickAnim < 132) {
            xx = -9.97266 + (((tickAnim - 120) / 12) * (-6.05512-(-9.97266)));
            yy = 12.07038 + (((tickAnim - 120) / 12) * (20.31114-(12.07038)));
            zz = -2.10578 + (((tickAnim - 120) / 12) * (6.55444-(-2.10578)));
        }
        else if (tickAnim >= 132 && tickAnim < 140) {
            xx = -6.05512 + (((tickAnim - 132) / 8) * (-6.05512-(-6.05512)));
            yy = 20.31114 + (((tickAnim - 132) / 8) * (20.31114-(20.31114)));
            zz = 6.55444 + (((tickAnim - 132) / 8) * (6.55444-(6.55444)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -6.05512 + (((tickAnim - 140) / 10) * (-6.05512-(-6.05512)));
            yy = 20.31114 + (((tickAnim - 140) / 10) * (20.31114-(20.31114)));
            zz = 6.55444 + (((tickAnim - 140) / 10) * (6.55444-(6.55444)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -6.05512 + (((tickAnim - 150) / 10) * (-6.05512-(-6.05512)));
            yy = 20.31114 + (((tickAnim - 150) / 10) * (20.31114-(20.31114)));
            zz = 6.55444 + (((tickAnim - 150) / 10) * (6.55444-(6.55444)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -6.05512 + (((tickAnim - 160) / 10) * (-6.05512-(-6.05512)));
            yy = 20.31114 + (((tickAnim - 160) / 10) * (20.31114-(20.31114)));
            zz = 6.55444 + (((tickAnim - 160) / 10) * (6.55444-(6.55444)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = -6.05512 + (((tickAnim - 170) / 30) * (-11.5-(-6.05512)));
            yy = 20.31114 + (((tickAnim - 170) / 30) * (0-(20.31114)));
            zz = 6.55444 + (((tickAnim - 170) / 30) * (0-(6.55444)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = -11.5 + (((tickAnim - 200) / 15) * (-1.75-(-11.5)));
            yy = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 15) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = -1.75 + (((tickAnim - 215) / 15) * (-11.5-(-1.75)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 15) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = -11.5 + (((tickAnim - 230) / 15) * (-1.75-(-11.5)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 260) {
            xx = -1.75 + (((tickAnim - 245) / 15) * (-11.5-(-1.75)));
            yy = 0 + (((tickAnim - 245) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 15) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -11.5 + (((tickAnim - 260) / 20) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (24.25-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 24.25 + (((tickAnim - 40) / 15) * (0-(24.25)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 55) / 15) * (24.25-(0)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 24.25 + (((tickAnim - 70) / 15) * (0-(24.25)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 85) / 9) * (-10.52637-(0)));
            yy = 0 + (((tickAnim - 85) / 9) * (7.11218-(0)));
            zz = 0 + (((tickAnim - 85) / 9) * (2.71782-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = -10.52637 + (((tickAnim - 94) / 11) * (8.12428-(-10.52637)));
            yy = 7.11218 + (((tickAnim - 94) / 11) * (15.51749-(7.11218)));
            zz = 2.71782 + (((tickAnim - 94) / 11) * (5.9298-(2.71782)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 8.12428 + (((tickAnim - 105) / 15) * (8.12428-(8.12428)));
            yy = 15.51749 + (((tickAnim - 105) / 15) * (15.51749-(15.51749)));
            zz = 5.9298 + (((tickAnim - 105) / 15) * (5.9298-(5.9298)));
        }
        else if (tickAnim >= 120 && tickAnim < 132) {
            xx = 8.12428 + (((tickAnim - 120) / 12) * (-7.04128-(8.12428)));
            yy = 15.51749 + (((tickAnim - 120) / 12) * (8.84792-(15.51749)));
            zz = 5.9298 + (((tickAnim - 120) / 12) * (-5.23188-(5.9298)));
        }
        else if (tickAnim >= 132 && tickAnim < 140) {
            xx = -7.04128 + (((tickAnim - 132) / 8) * (-7.04128-(-7.04128)));
            yy = 8.84792 + (((tickAnim - 132) / 8) * (8.84792-(8.84792)));
            zz = -5.23188 + (((tickAnim - 132) / 8) * (-5.23188-(-5.23188)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -7.04128 + (((tickAnim - 140) / 10) * (-6.76755-(-7.04128)));
            yy = 8.84792 + (((tickAnim - 140) / 10) * (9.05831-(8.84792)));
            zz = -5.23188 + (((tickAnim - 140) / 10) * (-3.47315-(-5.23188)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -6.76755 + (((tickAnim - 150) / 10) * (-6.76755-(-6.76755)));
            yy = 9.05831 + (((tickAnim - 150) / 10) * (9.05831-(9.05831)));
            zz = -3.47315 + (((tickAnim - 150) / 10) * (-3.47315-(-3.47315)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -6.76755 + (((tickAnim - 160) / 10) * (-6.76755-(-6.76755)));
            yy = 9.05831 + (((tickAnim - 160) / 10) * (9.05831-(9.05831)));
            zz = -3.47315 + (((tickAnim - 160) / 10) * (-3.47315-(-3.47315)));
        }
        else if (tickAnim >= 170 && tickAnim < 190) {
            xx = -6.76755 + (((tickAnim - 170) / 20) * (-1.42684-(-6.76755)));
            yy = 9.05831 + (((tickAnim - 170) / 20) * (-5.74815-(9.05831)));
            zz = -3.47315 + (((tickAnim - 170) / 20) * (-9.3594-(-3.47315)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = -1.42684 + (((tickAnim - 190) / 10) * (0-(-1.42684)));
            yy = -5.74815 + (((tickAnim - 190) / 10) * (0-(-5.74815)));
            zz = -9.3594 + (((tickAnim - 190) / 10) * (0-(-9.3594)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 200) / 15) * (24.25-(0)));
            yy = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 15) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = 24.25 + (((tickAnim - 215) / 15) * (0-(24.25)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 15) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 230) / 15) * (24.25-(0)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 260) {
            xx = 24.25 + (((tickAnim - 245) / 15) * (0-(24.25)));
            yy = 0 + (((tickAnim - 245) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 15) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 28.25 + (((tickAnim - 25) / 15) * (-15-(28.25)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -15 + (((tickAnim - 40) / 15) * (28.25-(-15)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 28.25 + (((tickAnim - 55) / 15) * (-15-(28.25)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -15 + (((tickAnim - 70) / 15) * (28.25-(-15)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = 28.25 + (((tickAnim - 85) / 9) * (30.62205-(28.25)));
            yy = 0 + (((tickAnim - 85) / 9) * (6.52357-(0)));
            zz = 0 + (((tickAnim - 85) / 9) * (1.30037-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 30.62205 + (((tickAnim - 94) / 11) * (0.69811-(30.62205)));
            yy = 6.52357 + (((tickAnim - 94) / 11) * (14.23324-(6.52357)));
            zz = 1.30037 + (((tickAnim - 94) / 11) * (2.83716-(1.30037)));
        }
        else if (tickAnim >= 105 && tickAnim < 108) {
            xx = 0.69811 + (((tickAnim - 105) / 3) * (0.94811-(0.69811)));
            yy = 14.23324 + (((tickAnim - 105) / 3) * (14.23324-(14.23324)));
            zz = 2.83716 + (((tickAnim - 105) / 3) * (2.83716-(2.83716)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 0.94811 + (((tickAnim - 108) / 2) * (0.69811-(0.94811)));
            yy = 14.23324 + (((tickAnim - 108) / 2) * (14.23324-(14.23324)));
            zz = 2.83716 + (((tickAnim - 108) / 2) * (2.83716-(2.83716)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 0.69811 + (((tickAnim - 110) / 3) * (0.94811-(0.69811)));
            yy = 14.23324 + (((tickAnim - 110) / 3) * (14.23324-(14.23324)));
            zz = 2.83716 + (((tickAnim - 110) / 3) * (2.83716-(2.83716)));
        }
        else if (tickAnim >= 113 && tickAnim < 115) {
            xx = 0.94811 + (((tickAnim - 113) / 2) * (0.69811-(0.94811)));
            yy = 14.23324 + (((tickAnim - 113) / 2) * (14.23324-(14.23324)));
            zz = 2.83716 + (((tickAnim - 113) / 2) * (2.83716-(2.83716)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 0.69811 + (((tickAnim - 115) / 5) * (0.69811-(0.69811)));
            yy = 14.23324 + (((tickAnim - 115) / 5) * (14.23324-(14.23324)));
            zz = 2.83716 + (((tickAnim - 115) / 5) * (2.83716-(2.83716)));
        }
        else if (tickAnim >= 120 && tickAnim < 132) {
            xx = 0.69811 + (((tickAnim - 120) / 12) * (20.44811-(0.69811)));
            yy = 14.23324 + (((tickAnim - 120) / 12) * (14.23324-(14.23324)));
            zz = 2.83716 + (((tickAnim - 120) / 12) * (2.83716-(2.83716)));
        }
        else if (tickAnim >= 132 && tickAnim < 140) {
            xx = 20.44811 + (((tickAnim - 132) / 8) * (20.44811-(20.44811)));
            yy = 14.23324 + (((tickAnim - 132) / 8) * (14.23324-(14.23324)));
            zz = 2.83716 + (((tickAnim - 132) / 8) * (2.83716-(2.83716)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 20.44811 + (((tickAnim - 140) / 10) * (21.07725-(20.44811)));
            yy = 14.23324 + (((tickAnim - 140) / 10) * (13.2582-(14.23324)));
            zz = 2.83716 + (((tickAnim - 140) / 10) * (5.48437-(2.83716)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 21.07725 + (((tickAnim - 150) / 10) * (21.07725-(21.07725)));
            yy = 13.2582 + (((tickAnim - 150) / 10) * (13.2582-(13.2582)));
            zz = 5.48437 + (((tickAnim - 150) / 10) * (5.48437-(5.48437)));
        }
        else if (tickAnim >= 160 && tickAnim < 163) {
            xx = 21.07725 + (((tickAnim - 160) / 3) * (22.57725-(21.07725)));
            yy = 13.2582 + (((tickAnim - 160) / 3) * (13.2582-(13.2582)));
            zz = 5.48437 + (((tickAnim - 160) / 3) * (5.48437-(5.48437)));
        }
        else if (tickAnim >= 163 && tickAnim < 165) {
            xx = 22.57725 + (((tickAnim - 163) / 2) * (21.07725-(22.57725)));
            yy = 13.2582 + (((tickAnim - 163) / 2) * (13.2582-(13.2582)));
            zz = 5.48437 + (((tickAnim - 163) / 2) * (5.48437-(5.48437)));
        }
        else if (tickAnim >= 165 && tickAnim < 168) {
            xx = 21.07725 + (((tickAnim - 165) / 3) * (22.57725-(21.07725)));
            yy = 13.2582 + (((tickAnim - 165) / 3) * (13.2582-(13.2582)));
            zz = 5.48437 + (((tickAnim - 165) / 3) * (5.48437-(5.48437)));
        }
        else if (tickAnim >= 168 && tickAnim < 170) {
            xx = 22.57725 + (((tickAnim - 168) / 2) * (21.07725-(22.57725)));
            yy = 13.2582 + (((tickAnim - 168) / 2) * (13.2582-(13.2582)));
            zz = 5.48437 + (((tickAnim - 168) / 2) * (5.48437-(5.48437)));
        }
        else if (tickAnim >= 170 && tickAnim < 190) {
            xx = 21.07725 + (((tickAnim - 170) / 20) * (24.58294-(21.07725)));
            yy = 13.2582 + (((tickAnim - 170) / 20) * (-13.85198-(13.2582)));
            zz = 5.48437 + (((tickAnim - 170) / 20) * (2.55398-(5.48437)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = 24.58294 + (((tickAnim - 190) / 10) * (28.25-(24.58294)));
            yy = -13.85198 + (((tickAnim - 190) / 10) * (0-(-13.85198)));
            zz = 2.55398 + (((tickAnim - 190) / 10) * (0-(2.55398)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 28.25 + (((tickAnim - 200) / 15) * (-15-(28.25)));
            yy = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 15) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = -15 + (((tickAnim - 215) / 15) * (28.25-(-15)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 15) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = 28.25 + (((tickAnim - 230) / 15) * (-15-(28.25)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 260) {
            xx = -15 + (((tickAnim - 245) / 15) * (28.25-(-15)));
            yy = 0 + (((tickAnim - 245) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 15) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 28.25 + (((tickAnim - 260) / 20) * (0-(28.25)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.35-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 25) / 15) * (0-(-0.225)));
            zz = 0.35 + (((tickAnim - 25) / 15) * (0-(0.35)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0.35-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 55) / 15) * (0-(-0.225)));
            zz = 0.35 + (((tickAnim - 55) / 15) * (0-(0.35)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 15) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0.35-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 85) / 115) * (0-(0)));
            yy = -0.225 + (((tickAnim - 85) / 115) * (-0.225-(-0.225)));
            zz = 0.35 + (((tickAnim - 85) / 115) * (0.35-(0.35)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 200) / 15) * (0-(-0.225)));
            zz = 0.35 + (((tickAnim - 200) / 15) * (0-(0.35)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 215) / 15) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 215) / 15) * (0.35-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 230) / 15) * (0-(-0.225)));
            zz = 0.35 + (((tickAnim - 230) / 15) * (0-(0.35)));
        }
        else if (tickAnim >= 245 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 245) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 15) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 245) / 15) * (0.35-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            yy = -0.225 + (((tickAnim - 260) / 20) * (0-(-0.225)));
            zz = 0.35 + (((tickAnim - 260) / 20) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -17.25 + (((tickAnim - 33) / 7) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -7.5 + (((tickAnim - 43) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 46) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 3) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -7.5 + (((tickAnim - 49) / 4) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 55) / 8) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -17.25 + (((tickAnim - 63) / 7) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = -7.5 + (((tickAnim - 73) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 76) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 76) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 3) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = -7.5 + (((tickAnim - 79) / 4) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 85) / 9) * (14-(0)));
            yy = 0 + (((tickAnim - 85) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 9) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 14 + (((tickAnim - 94) / 11) * (0-(14)));
            yy = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 105) / 3) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 105) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 3) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = -1.25 + (((tickAnim - 108) / 2) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 108) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 2) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 110) / 3) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 115) {
            xx = -1.25 + (((tickAnim - 113) / 2) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 113) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 2) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 115) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 5) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 120) / 6) * (11.75-(0)));
            yy = 0 + (((tickAnim - 120) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 6) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 132) {
            xx = 11.75 + (((tickAnim - 126) / 6) * (0-(11.75)));
            yy = 0 + (((tickAnim - 126) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 6) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 132) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 132) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 8) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 160) / 3) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 160) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 3) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 165) {
            xx = -3.25 + (((tickAnim - 163) / 2) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 163) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 2) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 165) / 3) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 165) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 3) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 170) {
            xx = -3.25 + (((tickAnim - 168) / 2) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 168) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 2) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 177) {
            xx = 0 + (((tickAnim - 170) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 7) * (-16.25-(0)));
            zz = 0 + (((tickAnim - 170) / 7) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 177) / 13) * (0-(0)));
            yy = -16.25 + (((tickAnim - 177) / 13) * (0-(-16.25)));
            zz = 0 + (((tickAnim - 177) / 13) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 190) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 190) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 10) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 200) / 8) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 200) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 8) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 215) {
            xx = -17.25 + (((tickAnim - 208) / 7) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 208) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 7) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 215) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 215) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 3) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 221) {
            xx = -7.5 + (((tickAnim - 218) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 218) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 3) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 224) {
            xx = 0 + (((tickAnim - 221) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 221) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 3) * (0-(0)));
        }
        else if (tickAnim >= 224 && tickAnim < 228) {
            xx = -7.5 + (((tickAnim - 224) / 4) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 224) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 224) / 4) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 228) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 228) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 2) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 230) / 8) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 230) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 8) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 245) {
            xx = -17.25 + (((tickAnim - 238) / 7) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 238) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 7) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 245) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 245) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 3) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 251) {
            xx = -7.5 + (((tickAnim - 248) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 248) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 248) / 3) * (0-(0)));
        }
        else if (tickAnim >= 251 && tickAnim < 254) {
            xx = 0 + (((tickAnim - 251) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 251) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 251) / 3) * (0-(0)));
        }
        else if (tickAnim >= 254 && tickAnim < 258) {
            xx = -7.5 + (((tickAnim - 254) / 4) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 254) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 254) / 4) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 258) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 258) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 258) / 2) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (27.5-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 27.5 + (((tickAnim - 33) / 7) * (0-(27.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 9.5 + (((tickAnim - 43) / 3) * (0-(9.5)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 46) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 3) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 9.5 + (((tickAnim - 49) / 4) * (0-(9.5)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 55) / 8) * (27.5-(0)));
            yy = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 27.5 + (((tickAnim - 63) / 7) * (0-(27.5)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 9.5 + (((tickAnim - 73) / 3) * (0-(9.5)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 76) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 76) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 3) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 9.5 + (((tickAnim - 79) / 4) * (0-(9.5)));
            yy = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 140) / 5) * (3.75-(0)));
            yy = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 3.75 + (((tickAnim - 145) / 5) * (0-(3.75)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 150) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 50) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 200) / 8) * (27.5-(0)));
            yy = 0 + (((tickAnim - 200) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 8) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 215) {
            xx = 27.5 + (((tickAnim - 208) / 7) * (0-(27.5)));
            yy = 0 + (((tickAnim - 208) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 7) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 215) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 215) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 3) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 221) {
            xx = 9.5 + (((tickAnim - 218) / 3) * (0-(9.5)));
            yy = 0 + (((tickAnim - 218) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 3) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 224) {
            xx = 0 + (((tickAnim - 221) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 221) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 3) * (0-(0)));
        }
        else if (tickAnim >= 224 && tickAnim < 228) {
            xx = 9.5 + (((tickAnim - 224) / 4) * (0-(9.5)));
            yy = 0 + (((tickAnim - 224) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 224) / 4) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 228) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 228) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 2) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 230) / 8) * (27.5-(0)));
            yy = 0 + (((tickAnim - 230) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 8) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 245) {
            xx = 27.5 + (((tickAnim - 238) / 7) * (0-(27.5)));
            yy = 0 + (((tickAnim - 238) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 7) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 245) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 245) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 3) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 251) {
            xx = 9.5 + (((tickAnim - 248) / 3) * (0-(9.5)));
            yy = 0 + (((tickAnim - 248) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 248) / 3) * (0-(0)));
        }
        else if (tickAnim >= 251 && tickAnim < 254) {
            xx = 0 + (((tickAnim - 251) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 251) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 251) / 3) * (0-(0)));
        }
        else if (tickAnim >= 254 && tickAnim < 258) {
            xx = 9.5 + (((tickAnim - 254) / 4) * (0-(9.5)));
            yy = 0 + (((tickAnim - 254) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 254) / 4) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 258) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 258) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 258) / 2) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (0.04-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 10) / 11) * (1-(1)));
            yy = 0.04 + (((tickAnim - 10) / 11) * (1-(0.04)));
            zz = 1 + (((tickAnim - 10) / 11) * (1-(1)));
        }
        else if (tickAnim >= 21 && tickAnim < 74) {
            xx = 1 + (((tickAnim - 21) / 53) * (1-(1)));
            yy = 1 + (((tickAnim - 21) / 53) * (1-(1)));
            zz = 1 + (((tickAnim - 21) / 53) * (1-(1)));
        }
        else if (tickAnim >= 74 && tickAnim < 84) {
            xx = 1 + (((tickAnim - 74) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 74) / 10) * (0.04-(1)));
            zz = 1 + (((tickAnim - 74) / 10) * (1-(1)));
        }
        else if (tickAnim >= 84 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 84) / 11) * (1-(1)));
            yy = 0.04 + (((tickAnim - 84) / 11) * (1-(0.04)));
            zz = 1 + (((tickAnim - 84) / 11) * (1-(1)));
        }
        else if (tickAnim >= 95 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 95) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 95) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 95) / 25) * (1-(1)));
        }
        else if (tickAnim >= 120 && tickAnim < 126) {
            xx = 1 + (((tickAnim - 120) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 120) / 6) * (0.0825-(1)));
            zz = 1 + (((tickAnim - 120) / 6) * (1-(1)));
        }
        else if (tickAnim >= 126 && tickAnim < 132) {
            xx = 1 + (((tickAnim - 126) / 6) * (1-(1)));
            yy = 0.0825 + (((tickAnim - 126) / 6) * (1-(0.0825)));
            zz = 1 + (((tickAnim - 126) / 6) * (1-(1)));
        }
        else if (tickAnim >= 132 && tickAnim < 138) {
            xx = 1 + (((tickAnim - 132) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 132) / 6) * (1-(1)));
            zz = 1 + (((tickAnim - 132) / 6) * (1-(1)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = 1 + (((tickAnim - 138) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 138) / 6) * (0.0825-(1)));
            zz = 1 + (((tickAnim - 138) / 6) * (1-(1)));
        }
        else if (tickAnim >= 144 && tickAnim < 150) {
            xx = 1 + (((tickAnim - 144) / 6) * (1-(1)));
            yy = 0.0825 + (((tickAnim - 144) / 6) * (1-(0.0825)));
            zz = 1 + (((tickAnim - 144) / 6) * (1-(1)));
        }
        else if (tickAnim >= 150 && tickAnim < 249) {
            xx = 1 + (((tickAnim - 150) / 99) * (1-(1)));
            yy = 1 + (((tickAnim - 150) / 99) * (1-(1)));
            zz = 1 + (((tickAnim - 150) / 99) * (1-(1)));
        }
        else if (tickAnim >= 249 && tickAnim < 259) {
            xx = 1 + (((tickAnim - 249) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 249) / 10) * (0.04-(1)));
            zz = 1 + (((tickAnim - 249) / 10) * (1-(1)));
        }
        else if (tickAnim >= 259 && tickAnim < 270) {
            xx = 1 + (((tickAnim - 259) / 11) * (1-(1)));
            yy = 0.04 + (((tickAnim - 259) / 11) * (1-(0.04)));
            zz = 1 + (((tickAnim - 259) / 11) * (1-(1)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = 1 + (((tickAnim - 270) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 270) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 270) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-7.98392-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.50827-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.05236-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -7.98392 + (((tickAnim - 25) / 15) * (-3.23392-(-7.98392)));
            yy = 0.50827 + (((tickAnim - 25) / 15) * (0.50827-(0.50827)));
            zz = -0.05236 + (((tickAnim - 25) / 15) * (-0.05236-(-0.05236)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -3.23392 + (((tickAnim - 40) / 15) * (-7.98392-(-3.23392)));
            yy = 0.50827 + (((tickAnim - 40) / 15) * (0.50827-(0.50827)));
            zz = -0.05236 + (((tickAnim - 40) / 15) * (-0.05236-(-0.05236)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = -7.98392 + (((tickAnim - 55) / 15) * (-3.23392-(-7.98392)));
            yy = 0.50827 + (((tickAnim - 55) / 15) * (0.50827-(0.50827)));
            zz = -0.05236 + (((tickAnim - 55) / 15) * (-0.05236-(-0.05236)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -3.23392 + (((tickAnim - 70) / 15) * (-3.23392-(-3.23392)));
            yy = 0.50827 + (((tickAnim - 70) / 15) * (0.50827-(0.50827)));
            zz = -0.05236 + (((tickAnim - 70) / 15) * (-0.05236-(-0.05236)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = -3.23392 + (((tickAnim - 85) / 9) * (7.24829-(-3.23392)));
            yy = 0.50827 + (((tickAnim - 85) / 9) * (0.27532-(0.50827)));
            zz = -0.05236 + (((tickAnim - 85) / 9) * (-0.02836-(-0.05236)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 7.24829 + (((tickAnim - 94) / 11) * (0-(7.24829)));
            yy = 0.27532 + (((tickAnim - 94) / 11) * (0-(0.27532)));
            zz = -0.02836 + (((tickAnim - 94) / 11) * (0-(-0.02836)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (-7.98392-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0.50827-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (-0.05236-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = -7.98392 + (((tickAnim - 200) / 15) * (-3.23392-(-7.98392)));
            yy = 0.50827 + (((tickAnim - 200) / 15) * (0.50827-(0.50827)));
            zz = -0.05236 + (((tickAnim - 200) / 15) * (-0.05236-(-0.05236)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = -3.23392 + (((tickAnim - 215) / 15) * (-7.98392-(-3.23392)));
            yy = 0.50827 + (((tickAnim - 215) / 15) * (0.50827-(0.50827)));
            zz = -0.05236 + (((tickAnim - 215) / 15) * (-0.05236-(-0.05236)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = -7.98392 + (((tickAnim - 230) / 15) * (-3.23392-(-7.98392)));
            yy = 0.50827 + (((tickAnim - 230) / 15) * (0.50827-(0.50827)));
            zz = -0.05236 + (((tickAnim - 230) / 15) * (-0.05236-(-0.05236)));
        }
        else if (tickAnim >= 245 && tickAnim < 260) {
            xx = -3.23392 + (((tickAnim - 245) / 15) * (-3.23392-(-3.23392)));
            yy = 0.50827 + (((tickAnim - 245) / 15) * (0.50827-(0.50827)));
            zz = -0.05236 + (((tickAnim - 245) / 15) * (-0.05236-(-0.05236)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -3.23392 + (((tickAnim - 260) / 20) * (0-(-3.23392)));
            yy = 0.50827 + (((tickAnim - 260) / 20) * (0-(0.50827)));
            zz = -0.05236 + (((tickAnim - 260) / 20) * (0-(-0.05236)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 25) / 15) * (-9-(-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -9 + (((tickAnim - 40) / 15) * (-5-(-9)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 55) / 15) * (-9-(-5)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -9 + (((tickAnim - 70) / 15) * (-9-(-9)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = -9 + (((tickAnim - 85) / 9) * (-11.29-(-9)));
            yy = 0 + (((tickAnim - 85) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 9) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = -11.29 + (((tickAnim - 94) / 11) * (0-(-11.29)));
            yy = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (-5-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = -5 + (((tickAnim - 200) / 15) * (-9-(-5)));
            yy = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 15) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = -9 + (((tickAnim - 215) / 15) * (-5-(-9)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 15) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = -5 + (((tickAnim - 230) / 15) * (-9-(-5)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 260) {
            xx = -9 + (((tickAnim - 245) / 15) * (-9-(-9)));
            yy = 0 + (((tickAnim - 245) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 15) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -9 + (((tickAnim - 260) / 20) * (0-(-9)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 11 + (((tickAnim - 25) / 15) * (0.5-(11)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0.5 + (((tickAnim - 40) / 15) * (11-(0.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 11 + (((tickAnim - 55) / 15) * (0.5-(11)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0.5 + (((tickAnim - 70) / 15) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = 0.5 + (((tickAnim - 85) / 9) * (-7.35-(0.5)));
            yy = 0 + (((tickAnim - 85) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 9) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = -7.35 + (((tickAnim - 94) / 11) * (0-(-7.35)));
            yy = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 65) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 170) / 30) * (11-(0)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 11 + (((tickAnim - 200) / 15) * (0.5-(11)));
            yy = 0 + (((tickAnim - 200) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 15) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 230) {
            xx = 0.5 + (((tickAnim - 215) / 15) * (11-(0.5)));
            yy = 0 + (((tickAnim - 215) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 15) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 245) {
            xx = 11 + (((tickAnim - 230) / 15) * (0.5-(11)));
            yy = 0 + (((tickAnim - 230) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 15) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 260) {
            xx = 0.5 + (((tickAnim - 245) / 15) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 245) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 15) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 0.5 + (((tickAnim - 260) / 20) * (0-(0.5)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBeipiaosaurus entity = (EntityPrehistoricFloraBeipiaosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(11.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-20))*5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*10));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+45))*-1.4);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*-0.3);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.75 + (((tickAnim - 0) / 3) * (43-(25.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 43 + (((tickAnim - 3) / 5) * (-33-(43)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -33 + (((tickAnim - 8) / 1) * (-34.75-(-33)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -34.75 + (((tickAnim - 9) / 6) * (25.75-(-34.75)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.75 + (((tickAnim - 0) / 3) * (3-(7.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 3) / 2) * (20.93-(3)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20.93 + (((tickAnim - 5) / 3) * (11.5-(20.93)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 11.5 + (((tickAnim - 8) / 1) * (-20-(11.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -20 + (((tickAnim - 9) / 6) * (7.75-(-20)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
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
            xx = 13.25 + (((tickAnim - 0) / 3) * (13.75-(13.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 13.75 + (((tickAnim - 3) / 3) * (-33-(13.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -33 + (((tickAnim - 6) / 2) * (-33-(-33)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -33 + (((tickAnim - 8) / 1) * (6.75-(-33)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 6.75 + (((tickAnim - 9) / 6) * (13.25-(6.75)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.25 + (((tickAnim - 0) / 3) * (69-(37.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 69 + (((tickAnim - 3) / 5) * (70-(69)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 70 + (((tickAnim - 8) / 1) * (31.43893-(70)));
            yy = 0 + (((tickAnim - 8) / 1) * (-2.02893-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (3.44796-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 31.43893 + (((tickAnim - 9) / 3) * (-4.64554-(31.43893)));
            yy = -2.02893 + (((tickAnim - 9) / 3) * (-5.61139-(-2.02893)));
            zz = 3.44796 + (((tickAnim - 9) / 3) * (8.56783-(3.44796)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -4.64554 + (((tickAnim - 12) / 1) * (8.9486-(-4.64554)));
            yy = -5.61139 + (((tickAnim - 12) / 1) * (-0.15552-(-5.61139)));
            zz = 8.56783 + (((tickAnim - 12) / 1) * (10.99176-(8.56783)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.9486 + (((tickAnim - 13) / 2) * (37.25-(8.9486)));
            yy = -0.15552 + (((tickAnim - 13) / 2) * (0-(-0.15552)));
            zz = 10.99176 + (((tickAnim - 13) / 2) * (0-(10.99176)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 3) * (1.9-(0.3)));
            zz = -0.35 + (((tickAnim - 0) / 3) * (-0.825-(-0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.9 + (((tickAnim - 3) / 5) * (1.2-(1.9)));
            zz = -0.825 + (((tickAnim - 3) / 5) * (-0.575-(-0.825)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.2 + (((tickAnim - 8) / 1) * (1.175-(1.2)));
            zz = -0.575 + (((tickAnim - 8) / 1) * (0-(-0.575)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.175 + (((tickAnim - 9) / 1) * (1.6-(1.175)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 1.6 + (((tickAnim - 10) / 1) * (0.745-(1.6)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.745 + (((tickAnim - 11) / 1) * (-0.25-(0.745)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 12) / 1) * (-0.235-(-0.25)));
            zz = 0 + (((tickAnim - 12) / 1) * (-0.09-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = -0.235 + (((tickAnim - 13) / 0) * (-0.21-(-0.235)));
            zz = -0.09 + (((tickAnim - 13) / 0) * (-0.18-(-0.09)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.21 + (((tickAnim - 13) / 2) * (0.3-(-0.21)));
            zz = -0.18 + (((tickAnim - 13) / 2) * (-0.35-(-0.18)));
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
            xx = -40.25 + (((tickAnim - 0) / 2) * (-34.75-(-40.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -34.75 + (((tickAnim - 2) / 7) * (43-(-34.75)));
            yy = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 43 + (((tickAnim - 9) / 6) * (-40.25-(43)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 11.5 + (((tickAnim - 0) / 2) * (-20-(11.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -20 + (((tickAnim - 2) / 2) * (-8.17-(-20)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -8.17 + (((tickAnim - 4) / 5) * (-4-(-8.17)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -4 + (((tickAnim - 9) / 2) * (20.93-(-4)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 20.93 + (((tickAnim - 11) / 4) * (11.5-(20.93)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
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
            xx = -28.75 + (((tickAnim - 0) / 2) * (13-(-28.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 13 + (((tickAnim - 2) / 2) * (-7.43-(13)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -7.43 + (((tickAnim - 4) / 5) * (13.75-(-7.43)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 13.75 + (((tickAnim - 9) / 4) * (-32.29-(13.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -32.29 + (((tickAnim - 13) / 2) * (-28.75-(-32.29)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 70 + (((tickAnim - 0) / 2) * (24.18893-(70)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.02893-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-3.44796-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 24.18893 + (((tickAnim - 2) / 2) * (46.88758-(24.18893)));
            yy = 2.02893 + (((tickAnim - 2) / 2) * (5.64758-(2.02893)));
            zz = -3.44796 + (((tickAnim - 2) / 2) * (-7.33771-(-3.44796)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 46.88758 + (((tickAnim - 4) / 5) * (69-(46.88758)));
            yy = 5.64758 + (((tickAnim - 4) / 5) * (0-(5.64758)));
            zz = -7.33771 + (((tickAnim - 4) / 5) * (0-(-7.33771)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 69 + (((tickAnim - 9) / 6) * (70-(69)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.2 + (((tickAnim - 0) / 2) * (1.425-(1.2)));
            zz = -0.575 + (((tickAnim - 0) / 2) * (0-(-0.575)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.425 + (((tickAnim - 2) / 1) * (1.9-(1.425)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.9 + (((tickAnim - 3) / 0) * (1.095-(1.9)));
            zz = 0 + (((tickAnim - 3) / 0) * (-0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.095 + (((tickAnim - 3) / 1) * (0.4-(1.095)));
            zz = -0.125 + (((tickAnim - 3) / 1) * (0.05-(-0.125)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 4) / 5) * (1.9-(0.4)));
            zz = 0.05 + (((tickAnim - 4) / 5) * (-0.825-(0.05)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 1.9 + (((tickAnim - 9) / 6) * (1.2-(1.9)));
            zz = -0.825 + (((tickAnim - 9) / 6) * (-0.575-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-90))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*-7));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(8.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-140))*6), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*-5));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-190))*6), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*-2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*-8), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(0);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(-0.2);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(-0.9);


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(31), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-190))*6), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*-2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*-8), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(0);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(-0.2);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(-0.9);


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(31), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-140))*6), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+100))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-190))*6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+85))*-1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-11+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-300))*6), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-350))*6), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(8.5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-190))*10), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*7));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -48 + (((tickAnim - 0) / 3) * (0-(-48)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (26-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 26 + (((tickAnim - 6) / 3) * (0-(26)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (-35.75-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -35.75 + (((tickAnim - 13) / 1) * (-52.87-(-35.75)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -52.87 + (((tickAnim - 14) / 1) * (-48-(-52.87)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.05-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.25-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.05 + (((tickAnim - 6) / 3) * (0-(0.05)));
            zz = 0.25 + (((tickAnim - 6) / 3) * (0-(0.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 2) * (0-(-0.15)));
            zz = 0.25 + (((tickAnim - 13) / 2) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 26 + (((tickAnim - 0) / 2) * (0-(26)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (-35.75-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -35.75 + (((tickAnim - 4) / 3) * (-73-(-35.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -73 + (((tickAnim - 7) / 2) * (0-(-73)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (26-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 2) * (0-(0.05)));
            zz = 0.25 + (((tickAnim - 0) / 2) * (0-(0.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.35-(0)));
            zz = 0.225 + (((tickAnim - 3) / 1) * (0.275-(0.225)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 4) / 3) * (-0.125-(-0.35)));
            zz = 0.275 + (((tickAnim - 4) / 3) * (0.3-(0.275)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -0.125 + (((tickAnim - 7) / 2) * (0-(-0.125)));
            zz = 0.3 + (((tickAnim - 7) / 2) * (0-(0.3)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0.05-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*7));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*15), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*15), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*7));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBeipiaosaurus entity = (EntityPrehistoricFloraBeipiaosaurus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 32.25 + (((tickAnim - 0) / 13) * (-18.75-(32.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -18.75 + (((tickAnim - 13) / 15) * (32.25-(-18.75)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 18.75 + (((tickAnim - 0) / 7) * (-35.37-(18.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -35.37 + (((tickAnim - 7) / 3) * (-34.12-(-35.37)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -34.12 + (((tickAnim - 10) / 3) * (32-(-34.12)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 32 + (((tickAnim - 13) / 5) * (-9.17-(32)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -9.17 + (((tickAnim - 18) / 10) * (18.75-(-9.17)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.5 + (((tickAnim - 0) / 3) * (61.03-(23.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 61.03 + (((tickAnim - 3) / 4) * (52.83-(61.03)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 52.83 + (((tickAnim - 7) / 1) * (49.58-(52.83)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 49.58 + (((tickAnim - 8) / 2) * (59.08-(49.58)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 59.08 + (((tickAnim - 10) / 3) * (4-(59.08)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 4 + (((tickAnim - 13) / 5) * (16.83-(4)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 16.83 + (((tickAnim - 18) / 5) * (-15.46-(16.83)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -15.46 + (((tickAnim - 23) / 5) * (23.5-(-15.46)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 7) * (1.025-(0.2)));
            zz = -0.35 + (((tickAnim - 0) / 7) * (-0.825-(-0.35)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.025 + (((tickAnim - 7) / 3) * (1.025-(1.025)));
            zz = -0.825 + (((tickAnim - 7) / 3) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.025 + (((tickAnim - 10) / 3) * (0-(1.025)));
            zz = -0.825 + (((tickAnim - 10) / 3) * (0-(-0.825)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.265-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.06-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.265 + (((tickAnim - 15) / 3) * (0.775-(0.265)));
            zz = -0.06 + (((tickAnim - 15) / 3) * (0-(-0.06)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 18) / 2) * (1.435-(0.775)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.435 + (((tickAnim - 20) / 3) * (0.875-(1.435)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 23) / 2) * (0-(0.875)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (-0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -24.5 + (((tickAnim - 0) / 7) * (21.75-(-24.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 21.75 + (((tickAnim - 7) / 6) * (0-(21.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (-37-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -37 + (((tickAnim - 25) / 3) * (-24.5-(-37)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
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
            zz = 0.15 + (((tickAnim - 0) / 7) * (0.3-(0.15)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            zz = 0.3 + (((tickAnim - 7) / 16) * (0-(0.3)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0.17-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 25) / 3) * (0-(-0.175)));
            zz = 0.17 + (((tickAnim - 25) / 3) * (0.15-(0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -18.75 + (((tickAnim - 0) / 15) * (32.25-(-18.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 32.25 + (((tickAnim - 15) / 13) * (-18.75-(32.25)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -13.75 + (((tickAnim - 0) / 15) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (215.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-260-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 215.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-260 + (((tickAnim - 20) / 8) * (-13.75-(215.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-260)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 5) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.15-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.175-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.15 + (((tickAnim - 20) / 8) * (-0.4-(0.15)));
            zz = -0.175 + (((tickAnim - 20) / 8) * (0-(-0.175)));
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
            xx = 29 + (((tickAnim - 0) / 5) * (-9.17-(29)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -9.17 + (((tickAnim - 5) / 10) * (18.75-(-9.17)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 18.75 + (((tickAnim - 15) / 6) * (-35.37-(18.75)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -35.37 + (((tickAnim - 21) / 3) * (-34.12-(-35.37)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -34.12 + (((tickAnim - 24) / 4) * (29-(-34.12)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 5) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
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
            xx = 5 + (((tickAnim - 0) / 5) * (17.08-(5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.08 + (((tickAnim - 5) / 5) * (-12.96-(17.08)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12.96 + (((tickAnim - 10) / 3) * (27.77-(-12.96)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 27.77 + (((tickAnim - 13) / 2) * (23.5-(27.77)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 23.5 + (((tickAnim - 15) / 3) * (61.03-(23.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 61.03 + (((tickAnim - 18) / 3) * (54.08-(61.03)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 54.08 + (((tickAnim - 21) / 2) * (51.83-(54.08)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 51.83 + (((tickAnim - 23) / 1) * (59.08-(51.83)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 59.08 + (((tickAnim - 24) / 4) * (5-(59.08)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 3) * (0.2-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.55-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 3) / 2) * (0.7-(0.2)));
            zz = -0.55 + (((tickAnim - 3) / 2) * (-0.1-(-0.55)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.7 + (((tickAnim - 5) / 1) * (1.11-(0.7)));
            zz = -0.1 + (((tickAnim - 5) / 1) * (0-(-0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.11 + (((tickAnim - 6) / 2) * (1.11-(1.11)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.11 + (((tickAnim - 8) / 2) * (0.275-(1.11)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 5) * (0.2-(0.275)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.35-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 15) / 6) * (1.575-(0.2)));
            zz = -0.35 + (((tickAnim - 15) / 6) * (-0.825-(-0.35)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 1.575 + (((tickAnim - 21) / 3) * (1.025-(1.575)));
            zz = -0.825 + (((tickAnim - 21) / 3) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 1.025 + (((tickAnim - 24) / 4) * (-0.05-(1.025)));
            zz = -0.825 + (((tickAnim - 24) / 4) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-40))*3), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-1.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-1.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-100))*-0.75);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-50))*0.65);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (51.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 51.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 6) / 7) * (-13.75-(51.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -13.75 + (((tickAnim - 13) / 15) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.2-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 6) / 3) * (0.15-(0.15)));
            zz = -0.2 + (((tickAnim - 6) / 3) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 9) / 4) * (-0.225-(0.15)));
            zz = -0.2 + (((tickAnim - 9) / 4) * (0.25-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 13) / 15) * (0-(-0.225)));
            zz = 0.25 + (((tickAnim - 13) / 15) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-59.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -59.5 + (((tickAnim - 13) / 2) * (-24.5-(-59.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -24.5 + (((tickAnim - 15) / 6) * (21.75-(-24.5)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 21.75 + (((tickAnim - 21) / 7) * (0-(21.75)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.025-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 13) / 2) * (0-(-0.375)));
            zz = 0.025 + (((tickAnim - 13) / 2) * (0.15-(0.025)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0.15 + (((tickAnim - 15) / 6) * (0.3-(0.15)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0.3 + (((tickAnim - 21) / 7) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-90))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*1.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-190))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-190))*2.5), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-350))*4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-450))*5), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-190))*2.5), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-350))*4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-450))*5), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-300))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-200))*3.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-300))*4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-400))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-100))*2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-150))*4), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-1.5));
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(0);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(0);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(-0.35);


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-230))*5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-1.5));


        this.setRotateAngle(rightFinger, rightFinger.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-500))*-2), rightFinger.rotateAngleY + (float) Math.toRadians(0), rightFinger.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftFinger, leftFinger.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-500))*-2), leftFinger.rotateAngleY + (float) Math.toRadians(0), leftFinger.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBeipiaosaurus e = (EntityPrehistoricFloraBeipiaosaurus) entity;
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
