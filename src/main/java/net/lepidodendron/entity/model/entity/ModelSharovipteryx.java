package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSharovipteryx;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelSharovipteryx extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightArmHand;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightArmMembrane;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftArmHand;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftArmMembrane;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftFrontMembrane;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightFrontMembrane;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer rightMembrane1;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer rightMembrane2;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer rightMembrane3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftMembrane1;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer leftMembrane2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer leftMembrane3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer rightLegUpperMembrane1;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer rightLegMembrane2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer rightLegfoot;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer leftLegUpperMembrane1;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer leftLegMembrane2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer leftLegfoot;
    private final AdvancedModelRenderer cube_r43;

    private ModelAnimator animator;

    public ModelSharovipteryx() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(-0.0368F, 20.5282F, 5.7437F);
        this.setRotateAngle(root, 0.0436F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 0, 26, -0.9632F, -0.7807F, -0.0071F, 2, 2, 5, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.4632F, -0.2615F, -0.5079F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 13, -1.0F, 0.85F, -1.5F, 3, 1, 4, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 22, -1.0F, -0.65F, -1.5F, 3, 2, 4, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0368F, 0.2989F, -1.5761F);
        this.root.addChild(body);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, -4.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 12, -2.0F, -1.6F, -1.5F, 3, 3, 6, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.2F, -5.4F);
        this.body.addChild(chest);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.484F, -1.0469F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 39, -2.0F, -0.6F, -1.2F, 3, 2, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.4193F, -0.6397F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 34, -2.0F, -0.9F, -1.375F, 3, 2, 3, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.4417F, 0.6428F, -1.0228F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.9912F, -0.7195F, 0.7837F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.2F, 0.0F, 2.0F);
        this.rightArm1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 24, -2.7F, 0.475F, -2.075F, 1, 1, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0066F, 0.899F, 2.7059F);
        this.rightArm1.addChild(rightArm2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0066F, 0.3555F, 0.1891F);
        this.rightArm2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.0036F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 39, -0.5F, -0.15F, -0.525F, 1, 1, 2, -0.01F, true));

        this.rightArmHand = new AdvancedModelRenderer(this);
        this.rightArmHand.setRotationPoint(0.0611F, 1.8543F, 0.6953F);
        this.rightArm2.addChild(rightArmHand);
        this.setRotateAngle(rightArmHand, -0.2232F, -0.1036F, -0.6142F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.8F, 0.0F, 0.0F);
        this.rightArmHand.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.0042F, 0.168F, 0.1436F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 54, -1.7028F, -1.8162F, -0.0716F, 3, 3, 0, 0.0F, true));

        this.rightArmMembrane = new AdvancedModelRenderer(this);
        this.rightArmMembrane.setRotationPoint(0.0F, 1.4F, 1.9F);
        this.rightArm1.addChild(rightArmMembrane);
        this.setRotateAngle(rightArmMembrane, 0.6018F, -0.034F, 0.7059F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.2F, -1.4F, 0.1F);
        this.rightArmMembrane.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 56, -2.6F, 0.475F, -1.575F, 0, 1, 2, 0.0F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.4417F, 0.6428F, -1.0228F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.9912F, 0.7195F, -0.7837F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.2F, 0.0F, 2.0F);
        this.leftArm1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 51, 24, 1.7F, 0.475F, -2.075F, 1, 1, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.0066F, 0.899F, 2.7059F);
        this.leftArm1.addChild(leftArm2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0066F, 0.3555F, 0.1891F);
        this.leftArm2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.0036F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 52, 39, -0.5F, -0.15F, -0.525F, 1, 1, 2, -0.01F, false));

        this.leftArmHand = new AdvancedModelRenderer(this);
        this.leftArmHand.setRotationPoint(-0.0611F, 1.8543F, 0.6953F);
        this.leftArm2.addChild(leftArmHand);
        this.setRotateAngle(leftArmHand, -0.2232F, 0.1036F, 0.6142F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.8F, 0.0F, 0.0F);
        this.leftArmHand.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.0042F, -0.168F, -0.1436F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 54, -1.2972F, -1.8162F, -0.0716F, 3, 3, 0, 0.0F, false));

        this.leftArmMembrane = new AdvancedModelRenderer(this);
        this.leftArmMembrane.setRotationPoint(0.0F, 1.4F, 1.9F);
        this.leftArm1.addChild(leftArmMembrane);
        this.setRotateAngle(leftArmMembrane, 0.6018F, 0.034F, -0.7059F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.2F, -1.4F, 0.1F);
        this.leftArmMembrane.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 56, 2.6F, 0.475F, -1.575F, 0, 1, 2, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.43F, -1.4728F);
        this.chest.addChild(neck1);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.9141F, 0.4258F);
        this.neck1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4625F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 48, 48, -1.0F, 0.1326F, -3.4868F, 2, 1, 3, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.9141F, 0.4258F);
        this.neck1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3229F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 46, -1.0F, -0.7924F, -3.4868F, 2, 1, 3, 0.0F, false));

        this.leftFrontMembrane = new AdvancedModelRenderer(this);
        this.leftFrontMembrane.setRotationPoint(0.9585F, 0.4746F, -2.7582F);
        this.neck1.addChild(leftFrontMembrane);
        this.setRotateAngle(leftFrontMembrane, -0.1981F, -0.1313F, 0.7887F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2055F, 0.7711F, 0.2668F);
        this.leftFrontMembrane.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0716F, 0.9151F, -0.0568F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 35, -1.6F, -0.75F, -0.3F, 2, 0, 3, 0.0F, false));

        this.rightFrontMembrane = new AdvancedModelRenderer(this);
        this.rightFrontMembrane.setRotationPoint(-0.9585F, 0.4746F, -2.7582F);
        this.neck1.addChild(rightFrontMembrane);
        this.setRotateAngle(rightFrontMembrane, -0.1941F, 0.1372F, -0.7585F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.2055F, 0.7711F, 0.2668F);
        this.rightFrontMembrane.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0716F, -0.9151F, 0.0568F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 45, 35, -0.4F, -0.75F, -0.3F, 2, 0, 3, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6715F, -2.2131F);
        this.neck1.addChild(neck2);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.0184F, 0.1059F);
        this.neck2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4625F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 35, 49, -1.0F, 1.315F, -1.916F, 2, 1, 3, -0.03F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.0184F, 0.1059F);
        this.neck2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6109F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 43, -1.0F, 0.74F, -1.916F, 2, 1, 3, -0.025F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9692F, -2.0133F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.0567F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 53, 13, -1.0F, -0.5633F, -1.874F, 2, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 37, 43, -0.5F, 0.4467F, -4.6978F, 1, 1, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 19, 0.2F, -0.1633F, -1.6739F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 19, -1.2F, -0.1633F, -1.6739F, 1, 1, 1, 0.01F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.07F, 1.0352F, -1.8309F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.1571F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 23, 51, 0.0804F, -0.6085F, -2.937F, 1, 1, 3, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.07F, 1.0352F, -1.8309F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.1571F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 51, 0, -1.0804F, -0.6085F, -2.937F, 1, 1, 3, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.4368F, -1.8249F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3054F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 51, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9367F, 0.126F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 6, -0.5F, -0.7F, -1.4485F, 1, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 0, -0.5F, -0.1179F, -4.7735F, 1, 1, 4, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 51, 5, -1.0F, -0.1F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0893F, 0.4985F, -1.9105F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.1658F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 51, 19, 0.1003F, -0.6185F, -2.9371F, 1, 1, 3, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0893F, 0.4985F, -1.9105F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.1658F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 5, 51, -1.1003F, -0.6185F, -2.9371F, 1, 1, 3, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.7403F, -1.8042F);
        this.jaw.addChild(throat);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.6597F, 0.8042F);
        this.throat.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 55, 9, -0.5F, -1.4F, -1.0F, 1, 1, 2, -0.01F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 0.3896F, 1.8303F);
        this.throat.addChild(throat2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.004F, -0.0074F);
        this.throat2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0698F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 39, 54, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.rightMembrane1 = new AdvancedModelRenderer(this);
        this.rightMembrane1.setRotationPoint(-1.3282F, -0.7816F, -4.7065F);
        this.body.addChild(rightMembrane1);
        this.setRotateAngle(rightMembrane1, -0.0062F, 0.2411F, 0.1708F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.8282F, 0.7816F, 0.7065F);
        this.rightMembrane1.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0716F, -0.9151F, 0.0568F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 37, 39, -1.7F, -0.775F, 1.0F, 4, 0, 3, 0.0F, true));

        this.rightMembrane2 = new AdvancedModelRenderer(this);
        this.rightMembrane2.setRotationPoint(0.6637F, 0.2527F, 5.7875F);
        this.rightMembrane1.addChild(rightMembrane2);
        this.setRotateAngle(rightMembrane2, -0.0063F, -0.4321F, 0.0729F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightMembrane2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0716F, -0.9151F, 0.0568F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 37, 8, -5.0F, 0.0F, -0.75F, 5, 0, 4, 0.0F, true));

        this.rightMembrane3 = new AdvancedModelRenderer(this);
        this.rightMembrane3.setRotationPoint(-3.5976F, 0.0105F, 0.2393F);
        this.rightMembrane2.addChild(rightMembrane3);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightMembrane3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0716F, -0.9151F, 0.0568F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 23, 9, -3.0F, -0.025F, 0.0F, 3, 0, 2, 0.0F, true));

        this.leftMembrane1 = new AdvancedModelRenderer(this);
        this.leftMembrane1.setRotationPoint(1.3282F, -0.7816F, -4.7065F);
        this.body.addChild(leftMembrane1);
        this.setRotateAngle(leftMembrane1, -0.0062F, -0.2411F, -0.1708F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.8282F, 0.7816F, 0.7065F);
        this.leftMembrane1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0716F, 0.9151F, -0.0568F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 37, 39, -2.3F, -0.775F, 1.0F, 4, 0, 3, 0.0F, false));

        this.leftMembrane2 = new AdvancedModelRenderer(this);
        this.leftMembrane2.setRotationPoint(-0.6637F, 0.2527F, 5.7875F);
        this.leftMembrane1.addChild(leftMembrane2);
        this.setRotateAngle(leftMembrane2, -0.0063F, 0.4321F, -0.0729F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftMembrane2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0716F, 0.9151F, -0.0568F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 37, 8, 0.0F, 0.0F, -0.75F, 5, 0, 4, 0.0F, false));

        this.leftMembrane3 = new AdvancedModelRenderer(this);
        this.leftMembrane3.setRotationPoint(3.5976F, 0.0105F, 0.2393F);
        this.leftMembrane2.addChild(leftMembrane3);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftMembrane3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0716F, 0.9151F, -0.0568F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 23, 9, 0.0F, -0.025F, 0.0F, 3, 0, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0368F, -0.4308F, 4.8864F);
        this.root.addChild(tail1);
        this.setRotateAngle(tail1, -0.1614F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 24, 45, -0.5F, -0.2F, 0.0F, 1, 1, 4, 0.01F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 45, 29, -0.5F, 0.3F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0272F, 3.8726F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0656F, -0.001F, -0.0011F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0611F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 39, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4152F, 4.8256F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);


        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0048F, 0.2573F, 0.206F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.0F, 0.1561F, 2.7748F);
        this.tail4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0087F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 30, 31, -1.5F, -0.575F, -3.0F, 1, 1, 6, -0.02F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0941F, 5.7256F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 15, 31, -0.5F, -0.5267F, -0.0679F, 1, 1, 6, -0.03F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.2611F, 0.097F, 0.1415F);
        this.root.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.4454F, 0.7503F, 1.441F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.1541F, 0.1291F);
        this.rightLeg1.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.9599F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 34, -0.4F, -5.95F, 0.6F, 0, 6, 5, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 23, 0, -0.5F, -0.95F, -0.4F, 1, 1, 7, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 19, 22, -0.5F, -0.45F, -0.4F, 1, 1, 7, 0.01F, true));

        this.rightLegUpperMembrane1 = new AdvancedModelRenderer(this);
        this.rightLegUpperMembrane1.setRotationPoint(-0.4F, -1.0679F, 2.4802F);
        this.rightLeg1.addChild(rightLegUpperMembrane1);
        this.setRotateAngle(rightLegUpperMembrane1, -0.0044F, 0.0087F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLegUpperMembrane1.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -1.0257F, 0.2909F, -0.4418F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 51, 0.0F, -3.5F, -2.0F, 0, 6, 2, 0.0F, true));

        this.rightLegMembrane2 = new AdvancedModelRenderer(this);
        this.rightLegMembrane2.setRotationPoint(-1.0F, -3.4263F, 1.8736F);
        this.rightLegUpperMembrane1.addChild(rightLegMembrane2);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.0F, 3.4263F, -1.8736F);
        this.rightLegMembrane2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -1.0257F, 0.2909F, -0.4418F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 46, 53, 0.0F, -3.5F, -4.0F, 0, 6, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.0162F, 5.4342F, 3.6814F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5683F, -0.0069F, 0.0142F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.011F, 0.3165F, 0.7231F);
        this.rightLeg2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.2182F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 12, -0.4196F, -5.2553F, 0.0171F, 0, 4, 9, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 0, -0.4946F, -1.2553F, -0.6579F, 1, 1, 10, 0.0F, true));

        this.rightLegfoot = new AdvancedModelRenderer(this);
        this.rightLegfoot.setRotationPoint(0.0912F, -2.4104F, 9.4175F);
        this.rightLeg2.addChild(rightLegfoot);
        this.setRotateAngle(rightLegfoot, 0.6641F, 0.5126F, 0.7025F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.0054F, 2.6891F, -8.6398F);
        this.rightLegfoot.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2182F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 51, 53, -1.4946F, -1.2553F, 9.0171F, 3, 4, 0, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.3348F, 0.097F, 0.1415F);
        this.root.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.4454F, -0.7503F, -1.441F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -0.1541F, 0.1291F);
        this.leftLeg1.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.9599F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 34, 0.4F, -5.95F, 0.6F, 0, 6, 5, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 23, 0, -0.5F, -0.95F, -0.4F, 1, 1, 7, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 19, 22, -0.5F, -0.45F, -0.4F, 1, 1, 7, 0.01F, false));

        this.leftLegUpperMembrane1 = new AdvancedModelRenderer(this);
        this.leftLegUpperMembrane1.setRotationPoint(0.4F, -1.0679F, 2.4802F);
        this.leftLeg1.addChild(leftLegUpperMembrane1);
        this.setRotateAngle(leftLegUpperMembrane1, -0.0044F, -0.0087F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLegUpperMembrane1.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -1.0257F, -0.2909F, 0.4418F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 51, 0.0F, -3.5F, -2.0F, 0, 6, 2, 0.0F, false));

        this.leftLegMembrane2 = new AdvancedModelRenderer(this);
        this.leftLegMembrane2.setRotationPoint(1.0F, -3.4263F, 1.8736F);
        this.leftLegUpperMembrane1.addChild(leftLegMembrane2);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.0F, 3.4263F, -1.8736F);
        this.leftLegMembrane2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -1.0257F, -0.2909F, 0.4418F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 46, 53, 0.0F, -3.5F, -4.0F, 0, 6, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0162F, 5.4342F, 3.6814F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5683F, 0.0069F, -0.0142F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.011F, 0.3165F, 0.7231F);
        this.leftLeg2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2182F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 12, 0.4196F, -5.2553F, 0.0171F, 0, 4, 9, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, -0.5054F, -1.2553F, -0.6579F, 1, 1, 10, 0.0F, false));

        this.leftLegfoot = new AdvancedModelRenderer(this);
        this.leftLegfoot.setRotationPoint(-0.0912F, -2.4104F, 9.4175F);
        this.leftLeg2.addChild(leftLegfoot);
        this.setRotateAngle(leftLegfoot, 0.6641F, -0.5126F, -0.7025F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0054F, 2.6891F, -8.6398F);
        this.leftLegfoot.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.2182F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 51, 53, -1.5054F, -1.2553F, 9.0171F, 3, 4, 0, 0.0F, false));

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

        EntityPrehistoricFloraSharovipteryx ee = (EntityPrehistoricFloraSharovipteryx) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head};

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
        EntityPrehistoricFloraSharovipteryx ee = (EntityPrehistoricFloraSharovipteryx) entitylivingbaseIn;

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
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSharovipteryx entity = (EntityPrehistoricFloraSharovipteryx) entitylivingbaseIn;
        int animCycle = 28;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.48645-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.66833-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.34062-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.48645 + (((tickAnim - 3) / 3) * (-5-(-7.48645)));
            yy = -0.66833 + (((tickAnim - 3) / 3) * (0-(-0.66833)));
            zz = -0.34062 + (((tickAnim - 3) / 3) * (0-(-0.34062)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 6) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmMembrane, rightArmMembrane.rotateAngleX + (float) Math.toRadians(xx), rightArmMembrane.rotateAngleY + (float) Math.toRadians(yy), rightArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.48645-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.66833-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.34062-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.48645 + (((tickAnim - 3) / 3) * (-5-(-7.48645)));
            yy = 0.66833 + (((tickAnim - 3) / 3) * (0-(0.66833)));
            zz = 0.34062 + (((tickAnim - 3) / 3) * (0-(0.34062)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 6) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmMembrane, leftArmMembrane.rotateAngleX + (float) Math.toRadians(xx), leftArmMembrane.rotateAngleY + (float) Math.toRadians(yy), leftArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 4) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 15 + (((tickAnim - 3) / 3) * (0-(15)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 4) / 4) * (-12.5-(-5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 8) / 2) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -12.5 + (((tickAnim - 14) / 3) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -12.5 + (((tickAnim - 19) / 3) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -12.5 + (((tickAnim - 26) / 2) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 4) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (20-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 20 + (((tickAnim - 12) / 2) * (0-(20)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 20 + (((tickAnim - 17) / 2) * (0-(20)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-10.97-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -10.97 + (((tickAnim - 2) / 6) * (0-(-10.97)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (-9.4-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -9.4 + (((tickAnim - 11) / 3) * (0-(-9.4)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-9.4-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -9.4 + (((tickAnim - 18) / 1) * (-2.2-(-9.4)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -2.2 + (((tickAnim - 19) / 2) * (0-(-2.2)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (-10-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 25) / 1) * (-10-(-10)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -10 + (((tickAnim - 26) / 3) * (0-(-10)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.98-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 12.98 + (((tickAnim - 8) / 3) * (7.5-(12.98)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 11) / 2) * (12.98-(7.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 12.98 + (((tickAnim - 13) / 1) * (12.98-(12.98)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 12.98 + (((tickAnim - 14) / 4) * (7.5-(12.98)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 7.5 + (((tickAnim - 18) / 1) * (21.49-(7.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 21.49 + (((tickAnim - 19) / 2) * (12.98-(21.49)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 12.98 + (((tickAnim - 21) / 4) * (32.5-(12.98)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 32.5 + (((tickAnim - 25) / 1) * (32-(32.5)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 32 + (((tickAnim - 26) / 3) * (0-(32)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSharovipteryx entity = (EntityPrehistoricFloraSharovipteryx) entitylivingbaseIn;
        int animCycle = 31;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 10 + (((tickAnim - 2) / 4) * (0-(10)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-10-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -10 + (((tickAnim - 10) / 2) * (-7.5-(-10)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 12) / 8) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -7.5 + (((tickAnim - 20) / 2) * (-10-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 22) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (22.42435-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (4.1913-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-3.75087-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 22.42435 + (((tickAnim - 2) / 5) * (-19.31752-(22.42435)));
            yy = 4.1913 + (((tickAnim - 2) / 5) * (14.17096-(4.1913)));
            zz = -3.75087 + (((tickAnim - 2) / 5) * (-18.07861-(-3.75087)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -19.31752 + (((tickAnim - 7) / 3) * (-21.66363-(-19.31752)));
            yy = 14.17096 + (((tickAnim - 7) / 3) * (29.11578-(14.17096)));
            zz = -18.07861 + (((tickAnim - 7) / 3) * (0.18252-(-18.07861)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -21.66363 + (((tickAnim - 10) / 12) * (-21.66363-(-21.66363)));
            yy = 29.11578 + (((tickAnim - 10) / 12) * (29.11578-(29.11578)));
            zz = 0.18252 + (((tickAnim - 10) / 12) * (0.18252-(0.18252)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -21.66363 + (((tickAnim - 22) / 2) * (-1.53489-(-21.66363)));
            yy = 29.11578 + (((tickAnim - 22) / 2) * (14.03695-(29.11578)));
            zz = 0.18252 + (((tickAnim - 22) / 2) * (-19.57027-(0.18252)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -1.53489 + (((tickAnim - 24) / 2) * (0-(-1.53489)));
            yy = 14.03695 + (((tickAnim - 24) / 2) * (0-(14.03695)));
            zz = -19.57027 + (((tickAnim - 24) / 2) * (0-(-19.57027)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -37.5 + (((tickAnim - 2) / 5) * (-15.62436-(-37.5)));
            yy = 0 + (((tickAnim - 2) / 5) * (6.40069-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (2.8498-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15.62436 + (((tickAnim - 7) / 3) * (7.5-(-15.62436)));
            yy = 6.40069 + (((tickAnim - 7) / 3) * (0-(6.40069)));
            zz = 2.8498 + (((tickAnim - 7) / 3) * (0-(2.8498)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 7.5 + (((tickAnim - 10) / 12) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 7.5 + (((tickAnim - 22) / 2) * (-25.93287-(7.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (-8.74111-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (8.30163-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -25.93287 + (((tickAnim - 24) / 2) * (0-(-25.93287)));
            yy = -8.74111 + (((tickAnim - 24) / 2) * (0-(-8.74111)));
            zz = 8.30163 + (((tickAnim - 24) / 2) * (0-(8.30163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (7.0033-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.48279-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-5.00136-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 7.0033 + (((tickAnim - 2) / 8) * (6.9092-(7.0033)));
            yy = -0.48279 + (((tickAnim - 2) / 8) * (-0.58442-(-0.48279)));
            zz = -5.00136 + (((tickAnim - 2) / 8) * (-6.00062-(-5.00136)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 6.9092 + (((tickAnim - 10) / 12) * (6.9092-(6.9092)));
            yy = -0.58442 + (((tickAnim - 10) / 12) * (-0.58442-(-0.58442)));
            zz = -6.00062 + (((tickAnim - 10) / 12) * (-6.00062-(-6.00062)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 6.9092 + (((tickAnim - 22) / 2) * (3.6411-(6.9092)));
            yy = -0.58442 + (((tickAnim - 22) / 2) * (4.64728-(-0.58442)));
            zz = -6.00062 + (((tickAnim - 22) / 2) * (-11.30292-(-6.00062)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 3.6411 + (((tickAnim - 24) / 2) * (0-(3.6411)));
            yy = 4.64728 + (((tickAnim - 24) / 2) * (0-(4.64728)));
            zz = -11.30292 + (((tickAnim - 24) / 2) * (0-(-11.30292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmHand, leftArmHand.rotateAngleX + (float) Math.toRadians(xx), leftArmHand.rotateAngleY + (float) Math.toRadians(yy), leftArmHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-24.3961-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-6.33412-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (20.44851-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -24.3961 + (((tickAnim - 2) / 4) * (-6.31955-(-24.3961)));
            yy = -6.33412 + (((tickAnim - 2) / 4) * (-1.75853-(-6.33412)));
            zz = 20.44851 + (((tickAnim - 2) / 4) * (4.8846-(20.44851)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -6.31955 + (((tickAnim - 6) / 3) * (20.52937-(-6.31955)));
            yy = -1.75853 + (((tickAnim - 6) / 3) * (-10.83601-(-1.75853)));
            zz = 4.8846 + (((tickAnim - 6) / 3) * (-31.90228-(4.8846)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 20.52937 + (((tickAnim - 9) / 3) * (26.13363-(20.52937)));
            yy = -10.83601 + (((tickAnim - 9) / 3) * (-9.11544-(-10.83601)));
            zz = -31.90228 + (((tickAnim - 9) / 3) * (-49.45499-(-31.90228)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 26.13363 + (((tickAnim - 12) / 9) * (29.88363-(26.13363)));
            yy = -9.11544 + (((tickAnim - 12) / 9) * (-9.11544-(-9.11544)));
            zz = -49.45499 + (((tickAnim - 12) / 9) * (-49.45499-(-49.45499)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 29.88363 + (((tickAnim - 21) / 2) * (2.42684-(29.88363)));
            yy = -9.11544 + (((tickAnim - 21) / 2) * (-9.59652-(-9.11544)));
            zz = -49.45499 + (((tickAnim - 21) / 2) * (-15.44113-(-49.45499)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 2.42684 + (((tickAnim - 23) / 4) * (-0.43799-(2.42684)));
            yy = -9.59652 + (((tickAnim - 23) / 4) * (-3.58208-(-9.59652)));
            zz = -15.44113 + (((tickAnim - 23) / 4) * (-10.94358-(-15.44113)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmMembrane, leftArmMembrane.rotateAngleX + (float) Math.toRadians(xx), leftArmMembrane.rotateAngleY + (float) Math.toRadians(yy), leftArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.4-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = -0.05 + (((tickAnim - 2) / 4) * (0-(-0.05)));
            zz = -0.4 + (((tickAnim - 2) / 4) * (0-(-0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0.2571-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0.14214-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.02389-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0.2571 + (((tickAnim - 10) / 2) * (0.15779-(0.2571)));
            yy = 0.14214 + (((tickAnim - 10) / 2) * (0.00918-(0.14214)));
            zz = -0.02389 + (((tickAnim - 10) / 2) * (-0.07512-(-0.02389)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 0.15779 + (((tickAnim - 12) / 9) * (0-(0.15779)));
            yy = 0.00918 + (((tickAnim - 12) / 9) * (0-(0.00918)));
            zz = -0.07512 + (((tickAnim - 12) / 9) * (0-(-0.07512)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArmMembrane.rotationPointX = this.leftArmMembrane.rotationPointX + (float)(xx);
        this.leftArmMembrane.rotationPointY = this.leftArmMembrane.rotationPointY - (float)(yy);
        this.leftArmMembrane.rotationPointZ = this.leftArmMembrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 26) {
            xx = -12.5 + (((tickAnim - 10) / 16) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = -12.5 + (((tickAnim - 2) / 4) * (-3.5-(-12.5)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -3.5 + (((tickAnim - 6) / 3) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (-5-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            yy = -5 + (((tickAnim - 12) / 9) * (-2.5-(-5)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -2.5 + (((tickAnim - 21) / 2) * (-5-(-2.5)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (5-(0)));
            yy = -5 + (((tickAnim - 23) / 1) * (-5-(-5)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 5 + (((tickAnim - 24) / 3) * (0-(5)));
            yy = -5 + (((tickAnim - 24) / 3) * (-5-(-5)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontMembrane, leftFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), leftFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), leftFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 26) {
            xx = -12.5 + (((tickAnim - 10) / 16) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-25-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -25 + (((tickAnim - 10) / 4) * (-35-(-25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -35 + (((tickAnim - 14) / 3) * (-25-(-35)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -25 + (((tickAnim - 17) / 1) * (-35-(-25)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -35 + (((tickAnim - 18) / 2) * (-25-(-35)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -25 + (((tickAnim - 20) / 6) * (0-(-25)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (22.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 22.5 + (((tickAnim - 14) / 3) * (0-(22.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (22.5-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 18) / 2) * (0-(22.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-10-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -10 + (((tickAnim - 14) / 3) * (0-(-10)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (-10-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 18) / 2) * (0-(-10)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (27.5-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 27.5 + (((tickAnim - 10) / 4) * (35-(27.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 35 + (((tickAnim - 14) / 4) * (35.3125-(35)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35.3125 + (((tickAnim - 18) / 2) * (27.5-(35.3125)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 27.5 + (((tickAnim - 20) / 5) * (0-(27.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.89664-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.68715-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (15.40278-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 2.89664 + (((tickAnim - 2) / 2) * (22.42435-(2.89664)));
            yy = 1.68715 + (((tickAnim - 2) / 2) * (-4.1913-(1.68715)));
            zz = 15.40278 + (((tickAnim - 2) / 2) * (3.75087-(15.40278)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 22.42435 + (((tickAnim - 4) / 5) * (-19.31752-(22.42435)));
            yy = -4.1913 + (((tickAnim - 4) / 5) * (-14.17096-(-4.1913)));
            zz = 3.75087 + (((tickAnim - 4) / 5) * (18.07861-(3.75087)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -19.31752 + (((tickAnim - 9) / 2) * (-21.66363-(-19.31752)));
            yy = -14.17096 + (((tickAnim - 9) / 2) * (-29.11578-(-14.17096)));
            zz = 18.07861 + (((tickAnim - 9) / 2) * (-0.18252-(18.07861)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -21.66363 + (((tickAnim - 11) / 10) * (-21.66363-(-21.66363)));
            yy = -29.11578 + (((tickAnim - 11) / 10) * (-29.11578-(-29.11578)));
            zz = -0.18252 + (((tickAnim - 11) / 10) * (-0.18252-(-0.18252)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -21.66363 + (((tickAnim - 21) / 2) * (-14.66363-(-21.66363)));
            yy = -29.11578 + (((tickAnim - 21) / 2) * (-29.11578-(-29.11578)));
            zz = -0.18252 + (((tickAnim - 21) / 2) * (-0.18252-(-0.18252)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -14.66363 + (((tickAnim - 23) / 3) * (-1.53489-(-14.66363)));
            yy = -29.11578 + (((tickAnim - 23) / 3) * (-14.03695-(-29.11578)));
            zz = -0.18252 + (((tickAnim - 23) / 3) * (19.57027-(-0.18252)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -1.53489 + (((tickAnim - 26) / 2) * (0-(-1.53489)));
            yy = -14.03695 + (((tickAnim - 26) / 2) * (0-(-14.03695)));
            zz = 19.57027 + (((tickAnim - 26) / 2) * (0-(19.57027)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-15.56248-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (8.61106-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-10.46239-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -15.56248 + (((tickAnim - 2) / 2) * (-37.5-(-15.56248)));
            yy = 8.61106 + (((tickAnim - 2) / 2) * (0-(8.61106)));
            zz = -10.46239 + (((tickAnim - 2) / 2) * (0-(-10.46239)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -37.5 + (((tickAnim - 4) / 5) * (-15.62436-(-37.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (-6.40069-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (-2.8498-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -15.62436 + (((tickAnim - 9) / 2) * (7.5-(-15.62436)));
            yy = -6.40069 + (((tickAnim - 9) / 2) * (0-(-6.40069)));
            zz = -2.8498 + (((tickAnim - 9) / 2) * (0-(-2.8498)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 7.5 + (((tickAnim - 11) / 10) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 21) / 2) * (3.5-(7.5)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 3.5 + (((tickAnim - 23) / 3) * (-25.93287-(3.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (8.74111-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (-8.30163-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -25.93287 + (((tickAnim - 26) / 2) * (0-(-25.93287)));
            yy = 8.74111 + (((tickAnim - 26) / 2) * (0-(8.74111)));
            zz = -8.30163 + (((tickAnim - 26) / 2) * (0-(-8.30163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.19899-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.58744-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (6.27698-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 2.19899 + (((tickAnim - 2) / 2) * (7.0033-(2.19899)));
            yy = -1.58744 + (((tickAnim - 2) / 2) * (0.48279-(-1.58744)));
            zz = 6.27698 + (((tickAnim - 2) / 2) * (5.00136-(6.27698)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 7.0033 + (((tickAnim - 4) / 7) * (6.9092-(7.0033)));
            yy = 0.48279 + (((tickAnim - 4) / 7) * (0.58442-(0.48279)));
            zz = 5.00136 + (((tickAnim - 4) / 7) * (6.00062-(5.00136)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 6.9092 + (((tickAnim - 11) / 10) * (6.9092-(6.9092)));
            yy = 0.58442 + (((tickAnim - 11) / 10) * (0.58442-(0.58442)));
            zz = 6.00062 + (((tickAnim - 11) / 10) * (6.00062-(6.00062)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 6.9092 + (((tickAnim - 21) / 2) * (7.02087-(6.9092)));
            yy = 0.58442 + (((tickAnim - 21) / 2) * (0.71383-(0.58442)));
            zz = 6.00062 + (((tickAnim - 21) / 2) * (7.50142-(6.00062)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 7.02087 + (((tickAnim - 23) / 3) * (3.6411-(7.02087)));
            yy = 0.71383 + (((tickAnim - 23) / 3) * (-4.64728-(0.71383)));
            zz = 7.50142 + (((tickAnim - 23) / 3) * (11.30292-(7.50142)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 3.6411 + (((tickAnim - 26) / 2) * (0-(3.6411)));
            yy = -4.64728 + (((tickAnim - 26) / 2) * (0-(-4.64728)));
            zz = 11.30292 + (((tickAnim - 26) / 2) * (0-(11.30292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmHand, rightArmHand.rotateAngleX + (float) Math.toRadians(xx), rightArmHand.rotateAngleY + (float) Math.toRadians(yy), rightArmHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.22222-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -10 + (((tickAnim - 3) / 1) * (-7.97798-(-10)));
            yy = 2.22222 + (((tickAnim - 3) / 1) * (4.34405-(2.22222)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.78091-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7.97798 + (((tickAnim - 4) / 3) * (0-(-7.97798)));
            yy = 4.34405 + (((tickAnim - 4) / 3) * (5-(4.34405)));
            zz = 0.78091 + (((tickAnim - 4) / 3) * (0-(0.78091)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (12.20619-(0)));
            yy = 5 + (((tickAnim - 7) / 3) * (11.02923-(5)));
            zz = 0 + (((tickAnim - 7) / 3) * (25.04361-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 12.20619 + (((tickAnim - 10) / 6) * (12.70619-(12.20619)));
            yy = 11.02923 + (((tickAnim - 10) / 6) * (11.02923-(11.02923)));
            zz = 25.04361 + (((tickAnim - 10) / 6) * (25.04361-(25.04361)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 12.70619 + (((tickAnim - 16) / 3) * (12.20619-(12.70619)));
            yy = 11.02923 + (((tickAnim - 16) / 3) * (11.02923-(11.02923)));
            zz = 25.04361 + (((tickAnim - 16) / 3) * (25.04361-(25.04361)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 12.20619 + (((tickAnim - 19) / 1) * (11.50172-(12.20619)));
            yy = 11.02923 + (((tickAnim - 19) / 1) * (11.02348-(11.02923)));
            zz = 25.04361 + (((tickAnim - 19) / 1) * (25.18182-(25.04361)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 11.50172 + (((tickAnim - 20) / 3) * (11.43383-(11.50172)));
            yy = 11.02348 + (((tickAnim - 20) / 3) * (11.00049-(11.02348)));
            zz = 25.18182 + (((tickAnim - 20) / 3) * (25.73465-(25.18182)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 11.43383 + (((tickAnim - 23) / 5) * (0-(11.43383)));
            yy = 11.00049 + (((tickAnim - 23) / 5) * (0-(11.00049)));
            zz = 25.73465 + (((tickAnim - 23) / 5) * (0-(25.73465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmMembrane, rightArmMembrane.rotateAngleX + (float) Math.toRadians(xx), rightArmMembrane.rotateAngleY + (float) Math.toRadians(yy), rightArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.06081-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.00808-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.31422-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.06081 + (((tickAnim - 3) / 1) * (-0.09073-(-0.06081)));
            yy = 0.00808 + (((tickAnim - 3) / 1) * (-0.02501-(0.00808)));
            zz = -0.31422 + (((tickAnim - 3) / 1) * (-0.40372-(-0.31422)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -0.09073 + (((tickAnim - 4) / 3) * (0-(-0.09073)));
            yy = -0.02501 + (((tickAnim - 4) / 3) * (0-(-0.02501)));
            zz = -0.40372 + (((tickAnim - 4) / 3) * (0-(-0.40372)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArmMembrane.rotationPointX = this.rightArmMembrane.rotationPointX + (float)(xx);
        this.rightArmMembrane.rotationPointY = this.rightArmMembrane.rotationPointY - (float)(yy);
        this.rightArmMembrane.rotationPointZ = this.rightArmMembrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 7.5 + (((tickAnim - 3) / 4) * (0-(7.5)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (5-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-1.67667-(0)));
            yy = 5 + (((tickAnim - 10) / 2) * (3.21708-(5)));
            zz = 0 + (((tickAnim - 10) / 2) * (-8.54954-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -1.67667 + (((tickAnim - 12) / 6) * (-1.57492-(-1.67667)));
            yy = 3.21708 + (((tickAnim - 12) / 6) * (1.69366-(3.21708)));
            zz = -8.54954 + (((tickAnim - 12) / 6) * (-8.74845-(-8.54954)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -1.57492 + (((tickAnim - 18) / 1) * (-1.62296-(-1.57492)));
            yy = 1.69366 + (((tickAnim - 18) / 1) * (3.13961-(1.69366)));
            zz = -8.74845 + (((tickAnim - 18) / 1) * (-9.23698-(-8.74845)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -1.62296 + (((tickAnim - 19) / 3) * (-3.60983-(-1.62296)));
            yy = 3.13961 + (((tickAnim - 19) / 3) * (1.64985-(3.13961)));
            zz = -9.23698 + (((tickAnim - 19) / 3) * (-3.00905-(-9.23698)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -3.60983 + (((tickAnim - 22) / 4) * (-4.40714-(-3.60983)));
            yy = 1.64985 + (((tickAnim - 22) / 4) * (1.90511-(1.64985)));
            zz = -3.00905 + (((tickAnim - 22) / 4) * (10.10149-(-3.00905)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -4.40714 + (((tickAnim - 26) / 2) * (0-(-4.40714)));
            yy = 1.90511 + (((tickAnim - 26) / 2) * (0-(1.90511)));
            zz = 10.10149 + (((tickAnim - 26) / 2) * (0-(10.10149)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontMembrane, rightFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), rightFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), rightFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 3) / 15) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 15) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 7.5 + (((tickAnim - 18) / 7) * (0-(7.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (14.99999-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.01887-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-0.01288-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 14.99999 + (((tickAnim - 6) / 4) * (14.61538-(14.99999)));
            yy = 0.01887 + (((tickAnim - 6) / 4) * (0.01858-(0.01887)));
            zz = -0.01288 + (((tickAnim - 6) / 4) * (-0.01222-(-0.01288)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.61538 + (((tickAnim - 10) / 10) * (14.61538-(14.61538)));
            yy = 0.01858 + (((tickAnim - 10) / 10) * (0.01858-(0.01858)));
            zz = -0.01222 + (((tickAnim - 10) / 10) * (-0.01222-(-0.01222)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 14.61538 + (((tickAnim - 20) / 6) * (0-(14.61538)));
            yy = 0.01858 + (((tickAnim - 20) / 6) * (0-(0.01858)));
            zz = -0.01222 + (((tickAnim - 20) / 6) * (0-(-0.01222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.49998-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.01614-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.01001-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 12.49998 + (((tickAnim - 8) / 14) * (12.49998-(12.49998)));
            yy = 0.01614 + (((tickAnim - 8) / 14) * (0.01614-(0.01614)));
            zz = -0.01001 + (((tickAnim - 8) / 14) * (-0.01001-(-0.01001)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 12.49998 + (((tickAnim - 22) / 6) * (0-(12.49998)));
            yy = 0.01614 + (((tickAnim - 22) / 6) * (0-(0.01614)));
            zz = -0.01001 + (((tickAnim - 22) / 6) * (0-(-0.01001)));
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
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (12.49998-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0.01567-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.01068-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 12.49998 + (((tickAnim - 13) / 12) * (12.49998-(12.49998)));
            yy = 0.01567 + (((tickAnim - 13) / 12) * (0.01567-(0.01567)));
            zz = -0.01068 + (((tickAnim - 13) / 12) * (-0.01068-(-0.01068)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 12.49998 + (((tickAnim - 25) / 6) * (0-(12.49998)));
            yy = 0.01567 + (((tickAnim - 25) / 6) * (0-(0.01567)));
            zz = -0.01068 + (((tickAnim - 25) / 6) * (0-(-0.01068)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 3.5 + (((tickAnim - 3) / 3) * (0-(3.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane2, rightMembrane2.rotateAngleX + (float) Math.toRadians(xx), rightMembrane2.rotateAngleY + (float) Math.toRadians(yy), rightMembrane2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -3.5 + (((tickAnim - 3) / 3) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane2, leftMembrane2.rotateAngleX + (float) Math.toRadians(xx), leftMembrane2.rotateAngleY + (float) Math.toRadians(yy), leftMembrane2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSharovipteryx entity = (EntityPrehistoricFloraSharovipteryx) entitylivingbaseIn;
        int animCycle = 72;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*3))*2), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100-60))*5), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2))*10));
        this.root.rotationPointX = this.root.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100-60*2))*3);
        this.root.rotationPointY = this.root.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100))*3);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-28.48495), rightArm1.rotateAngleY + (float) Math.toRadians(39.2451545051+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+160))*5), rightArm1.rotateAngleZ + (float) Math.toRadians(37.5129877679+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+160))*5));


        this.setRotateAngle(rightArmHand, rightArmHand.rotateAngleX + (float) Math.toRadians(-18.06753), rightArmHand.rotateAngleY + (float) Math.toRadians(15.01971), rightArmHand.rotateAngleZ + (float) Math.toRadians(-61.08059));


        this.setRotateAngle(rightArmMembrane, rightArmMembrane.rotateAngleX + (float) Math.toRadians(4.12864), rightArmMembrane.rotateAngleY + (float) Math.toRadians(-4.8325), rightArmMembrane.rotateAngleZ + (float) Math.toRadians(-42.35943));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-28.48495), leftArm1.rotateAngleY + (float) Math.toRadians(-39.2452+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+160))*5), leftArm1.rotateAngleZ + (float) Math.toRadians(-37.513+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+160))*5));


        this.setRotateAngle(leftArmHand, leftArmHand.rotateAngleX + (float) Math.toRadians(-18.06753), leftArmHand.rotateAngleY + (float) Math.toRadians(-15.01971), leftArmHand.rotateAngleZ + (float) Math.toRadians(61.08059));


        this.setRotateAngle(leftArmMembrane, leftArmMembrane.rotateAngleX + (float) Math.toRadians(4.12864), leftArmMembrane.rotateAngleY + (float) Math.toRadians(4.8325), leftArmMembrane.rotateAngleZ + (float) Math.toRadians(42.35943));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(10), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 3.94516 + (((tickAnim - 0) / 5) * (3.76792-(3.94516)));
            yy = -3.80913 + (((tickAnim - 0) / 5) * (-5.30222-(-3.80913)));
            zz = -34.47955 + (((tickAnim - 0) / 5) * (-39.21029-(-34.47955)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.76792 + (((tickAnim - 5) / 5) * (3.78499-(3.76792)));
            yy = -5.30222 + (((tickAnim - 5) / 5) * (-6.17797-(-5.30222)));
            zz = -39.21029 + (((tickAnim - 5) / 5) * (-41.96048-(-39.21029)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 3.78499 + (((tickAnim - 10) / 5) * (4.24601-(3.78499)));
            yy = -6.17797 + (((tickAnim - 10) / 5) * (-2.33534-(-6.17797)));
            zz = -41.96048 + (((tickAnim - 10) / 5) * (-29.76777-(-41.96048)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 4.24601 + (((tickAnim - 15) / 5) * (4.92149-(4.24601)));
            yy = -2.33534 + (((tickAnim - 15) / 5) * (-0.18244-(-2.33534)));
            zz = -29.76777 + (((tickAnim - 15) / 5) * (-22.72109-(-29.76777)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 4.92149 + (((tickAnim - 20) / 9) * (3.76792-(4.92149)));
            yy = -0.18244 + (((tickAnim - 20) / 9) * (-5.30222-(-0.18244)));
            zz = -22.72109 + (((tickAnim - 20) / 9) * (-39.21029-(-22.72109)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 3.76792 + (((tickAnim - 29) / 6) * (3.90573-(3.76792)));
            yy = -5.30222 + (((tickAnim - 29) / 6) * (-5.32961-(-5.30222)));
            zz = -39.21029 + (((tickAnim - 29) / 6) * (-39.22783-(-39.21029)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 3.90573 + (((tickAnim - 35) / 7) * (4.66706-(3.90573)));
            yy = -5.32961 + (((tickAnim - 35) / 7) * (-0.89075-(-5.32961)));
            zz = -39.22783 + (((tickAnim - 35) / 7) * (-25.06824-(-39.22783)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 4.66706 + (((tickAnim - 42) / 7) * (4.08034-(4.66706)));
            yy = -0.89075 + (((tickAnim - 42) / 7) * (-3.0692-(-0.89075)));
            zz = -25.06824 + (((tickAnim - 42) / 7) * (-32.12172-(-25.06824)));
        }
        else if (tickAnim >= 49 && tickAnim < 57) {
            xx = 4.08034 + (((tickAnim - 49) / 8) * (3.72664-(4.08034)));
            yy = -3.0692 + (((tickAnim - 49) / 8) * (-6.05286-(-3.0692)));
            zz = -32.12172 + (((tickAnim - 49) / 8) * (-41.58495-(-32.12172)));
        }
        else if (tickAnim >= 57 && tickAnim < 64) {
            xx = 3.72664 + (((tickAnim - 57) / 7) * (4.44174-(3.72664)));
            yy = -6.05286 + (((tickAnim - 57) / 7) * (-1.60879-(-6.05286)));
            zz = -41.58495 + (((tickAnim - 57) / 7) * (-27.41688-(-41.58495)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = 4.44174 + (((tickAnim - 64) / 4) * (4.82459-(4.44174)));
            yy = -1.60879 + (((tickAnim - 64) / 4) * (-0.54279-(-1.60879)));
            zz = -27.41688 + (((tickAnim - 64) / 4) * (-23.89849-(-27.41688)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 4.82459 + (((tickAnim - 68) / 4) * (3.94516-(4.82459)));
            yy = -0.54279 + (((tickAnim - 68) / 4) * (-3.80913-(-0.54279)));
            zz = -23.89849 + (((tickAnim - 68) / 4) * (-34.47955-(-23.89849)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontMembrane, leftFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), leftFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), leftFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 3.94516 + (((tickAnim - 0) / 4) * (4.24601-(3.94516)));
            yy = 3.80913 + (((tickAnim - 0) / 4) * (2.33534-(3.80913)));
            zz = 34.47955 + (((tickAnim - 0) / 4) * (29.76777-(34.47955)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 4.24601 + (((tickAnim - 4) / 3) * (4.92149-(4.24601)));
            yy = 2.33534 + (((tickAnim - 4) / 3) * (0.18244-(2.33534)));
            zz = 29.76777 + (((tickAnim - 4) / 3) * (22.72109-(29.76777)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 4.92149 + (((tickAnim - 7) / 6) * (3.94516-(4.92149)));
            yy = 0.18244 + (((tickAnim - 7) / 6) * (3.80913-(0.18244)));
            zz = 22.72109 + (((tickAnim - 7) / 6) * (34.47955-(22.72109)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 3.94516 + (((tickAnim - 13) / 9) * (3.74763-(3.94516)));
            yy = 3.80913 + (((tickAnim - 13) / 9) * (5.88886-(3.80913)));
            zz = 34.47955 + (((tickAnim - 13) / 9) * (41.05846-(34.47955)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 3.74763 + (((tickAnim - 22) / 5) * (4.24601-(3.74763)));
            yy = 5.88886 + (((tickAnim - 22) / 5) * (2.33534-(5.88886)));
            zz = 41.05846 + (((tickAnim - 22) / 5) * (29.76777-(41.05846)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 4.24601 + (((tickAnim - 27) / 3) * (4.92149-(4.24601)));
            yy = 2.33534 + (((tickAnim - 27) / 3) * (0.18244-(2.33534)));
            zz = 29.76777 + (((tickAnim - 27) / 3) * (22.72109-(29.76777)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 4.92149 + (((tickAnim - 30) / 3) * (4.97432-(4.92149)));
            yy = 0.18244 + (((tickAnim - 30) / 3) * (0.30756-(0.18244)));
            zz = 22.72109 + (((tickAnim - 30) / 3) * (23.06437-(22.72109)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 4.97432 + (((tickAnim - 33) / 3) * (4.24601-(4.97432)));
            yy = 0.30756 + (((tickAnim - 33) / 3) * (2.33534-(0.30756)));
            zz = 23.06437 + (((tickAnim - 33) / 3) * (29.76777-(23.06437)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 4.24601 + (((tickAnim - 36) / 4) * (3.72664-(4.24601)));
            yy = 2.33534 + (((tickAnim - 36) / 4) * (6.05286-(2.33534)));
            zz = 29.76777 + (((tickAnim - 36) / 4) * (41.58495-(29.76777)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 3.72664 + (((tickAnim - 40) / 5) * (3.71741-(3.72664)));
            yy = 6.05286 + (((tickAnim - 40) / 5) * (6.80452-(6.05286)));
            zz = 41.58495 + (((tickAnim - 40) / 5) * (43.967-(41.58495)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 3.71741 + (((tickAnim - 45) / 3) * (3.94516-(3.71741)));
            yy = 6.80452 + (((tickAnim - 45) / 3) * (3.80913-(6.80452)));
            zz = 43.967 + (((tickAnim - 45) / 3) * (34.47955-(43.967)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontMembrane, rightFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), rightFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), rightFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(15), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-20), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(7.5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightMembrane1, rightMembrane1.rotateAngleX + (float) Math.toRadians(1.03413), rightMembrane1.rotateAngleY + (float) Math.toRadians(-12.21108), rightMembrane1.rotateAngleZ + (float) Math.toRadians(-8.9168492759+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*6+140))*2));


        this.setRotateAngle(rightMembrane2, rightMembrane2.rotateAngleX + (float) Math.toRadians(-1.08465), rightMembrane2.rotateAngleY + (float) Math.toRadians(26.53742), rightMembrane2.rotateAngleZ + (float) Math.toRadians(-5.53798));


        this.setRotateAngle(leftMembrane1, leftMembrane1.rotateAngleX + (float) Math.toRadians(1.03413), leftMembrane1.rotateAngleY + (float) Math.toRadians(12.21108), leftMembrane1.rotateAngleZ + (float) Math.toRadians(8.9168492759+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*6))*2));


        this.setRotateAngle(leftMembrane2, leftMembrane2.rotateAngleX + (float) Math.toRadians(-1.08465), leftMembrane2.rotateAngleY + (float) Math.toRadians(-26.53742), leftMembrane2.rotateAngleZ + (float) Math.toRadians(5.53798));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*6))*2), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+90))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(12.5), tail2.rotateAngleY + (float) Math.toRadians(0.0155), tail2.rotateAngleZ + (float) Math.toRadians(-0.01109));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*6))*2), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+90))*5), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(35.68999), rightLeg1.rotateAngleY + (float) Math.toRadians(-39.9861778628+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*9+140))*3), rightLeg1.rotateAngleZ + (float) Math.toRadians(9.39608));


        this.setRotateAngle(rightLegUpperMembrane1, rightLegUpperMembrane1.rotateAngleX + (float) Math.toRadians(-3.26822), rightLegUpperMembrane1.rotateAngleY + (float) Math.toRadians(-17.17125), rightLegUpperMembrane1.rotateAngleZ + (float) Math.toRadians(24.31549));


        this.setRotateAngle(rightLegMembrane2, rightLegMembrane2.rotateAngleX + (float) Math.toRadians(18.41778), rightLegMembrane2.rotateAngleY + (float) Math.toRadians(-4.73327), rightLegMembrane2.rotateAngleZ + (float) Math.toRadians(-9.76233));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-39.40878), rightLeg2.rotateAngleY + (float) Math.toRadians(-1.54134), rightLeg2.rotateAngleZ + (float) Math.toRadians(0.83678));
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0.075);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(rightLegfoot, rightLegfoot.rotateAngleX + (float) Math.toRadians(24.78624), rightLegfoot.rotateAngleY + (float) Math.toRadians(-21.96648), rightLegfoot.rotateAngleZ + (float) Math.toRadians(2.48406));


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(35.68999), leftLeg1.rotateAngleY + (float) Math.toRadians(39.9861778628+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*9+140))*3), leftLeg1.rotateAngleZ + (float) Math.toRadians(-9.39608));


        this.setRotateAngle(leftLegUpperMembrane1, leftLegUpperMembrane1.rotateAngleX + (float) Math.toRadians(-3.26822), leftLegUpperMembrane1.rotateAngleY + (float) Math.toRadians(17.17125), leftLegUpperMembrane1.rotateAngleZ + (float) Math.toRadians(-24.31549));


        this.setRotateAngle(leftLegMembrane2, leftLegMembrane2.rotateAngleX + (float) Math.toRadians(18.41778), leftLegMembrane2.rotateAngleY + (float) Math.toRadians(4.73327), leftLegMembrane2.rotateAngleZ + (float) Math.toRadians(9.76233));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-39.40878), leftLeg2.rotateAngleY + (float) Math.toRadians(1.54134), leftLeg2.rotateAngleZ + (float) Math.toRadians(-0.83678));
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0.075);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(leftLegfoot, leftLegfoot.rotateAngleX + (float) Math.toRadians(24.78624), leftLegfoot.rotateAngleY + (float) Math.toRadians(21.96648), leftLegfoot.rotateAngleZ + (float) Math.toRadians(-2.48406));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSharovipteryx entity = (EntityPrehistoricFloraSharovipteryx) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -1.24622 + (((tickAnim - 0) / 7) * (0-(-1.24622)));
            yy = 12.86295 + (((tickAnim - 0) / 7) * (0-(12.86295)));
            zz = 9.60866 + (((tickAnim - 0) / 7) * (0-(9.60866)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0.49459-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (6.37512-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-19.76857-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0.49459 + (((tickAnim - 11) / 3) * (-1.24622-(0.49459)));
            yy = 6.37512 + (((tickAnim - 11) / 3) * (12.86295-(6.37512)));
            zz = -19.76857 + (((tickAnim - 11) / 3) * (9.60866-(-19.76857)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane1, leftMembrane1.rotateAngleX + (float) Math.toRadians(xx), leftMembrane1.rotateAngleY + (float) Math.toRadians(yy), leftMembrane1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.08947 + (((tickAnim - 0) / 3) * (-3.74645-(-1.08947)));
            yy = 11.60823 + (((tickAnim - 0) / 3) * (17.35728-(11.60823)));
            zz = -4.44875 + (((tickAnim - 0) / 3) * (-4.37705-(-4.44875)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -3.74645 + (((tickAnim - 3) / 4) * (-1.85039-(-3.74645)));
            yy = 17.35728 + (((tickAnim - 3) / 4) * (4.71967-(17.35728)));
            zz = -4.37705 + (((tickAnim - 3) / 4) * (-0.72232-(-4.37705)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -1.85039 + (((tickAnim - 7) / 4) * (-12.43015-(-1.85039)));
            yy = 4.71967 + (((tickAnim - 7) / 4) * (20.59933-(4.71967)));
            zz = -0.72232 + (((tickAnim - 7) / 4) * (2.52036-(-0.72232)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -12.43015 + (((tickAnim - 11) / 3) * (-1.08947-(-12.43015)));
            yy = 20.59933 + (((tickAnim - 11) / 3) * (11.60823-(20.59933)));
            zz = 2.52036 + (((tickAnim - 11) / 3) * (-4.44875-(2.52036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane2, leftMembrane2.rotateAngleX + (float) Math.toRadians(xx), leftMembrane2.rotateAngleY + (float) Math.toRadians(yy), leftMembrane2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.85836-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (4.61973-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (1.02989-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -0.85836 + (((tickAnim - 7) / 4) * (-7.93342-(-0.85836)));
            yy = 4.61973 + (((tickAnim - 7) / 4) * (2.00112-(4.61973)));
            zz = 1.02989 + (((tickAnim - 7) / 4) * (8.26041-(1.02989)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -7.93342 + (((tickAnim - 11) / 3) * (0-(-7.93342)));
            yy = 2.00112 + (((tickAnim - 11) / 3) * (0-(2.00112)));
            zz = 8.26041 + (((tickAnim - 11) / 3) * (0-(8.26041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane3, leftMembrane3.rotateAngleX + (float) Math.toRadians(xx), leftMembrane3.rotateAngleY + (float) Math.toRadians(yy), leftMembrane3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -10.00039 + (((tickAnim - 0) / 2) * (-15.9626-(-10.00039)));
            yy = 13.19384 + (((tickAnim - 0) / 2) * (10.53583-(13.19384)));
            zz = 7.79733 + (((tickAnim - 0) / 2) * (11.06903-(7.79733)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -15.9626 + (((tickAnim - 2) / 2) * (-21.97771-(-15.9626)));
            yy = 10.53583 + (((tickAnim - 2) / 2) * (9.309-(10.53583)));
            zz = 11.06903 + (((tickAnim - 2) / 2) * (17.5985-(11.06903)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -21.97771 + (((tickAnim - 4) / 3) * (-26.83627-(-21.97771)));
            yy = 9.309 + (((tickAnim - 4) / 3) * (3.03813-(9.309)));
            zz = 17.5985 + (((tickAnim - 4) / 3) * (22.89482-(17.5985)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -26.83627 + (((tickAnim - 7) / 1) * (-31.80969-(-26.83627)));
            yy = 3.03813 + (((tickAnim - 7) / 1) * (5.10559-(3.03813)));
            zz = 22.89482 + (((tickAnim - 7) / 1) * (20.06327-(22.89482)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -31.80969 + (((tickAnim - 8) / 3) * (-26.70337-(-31.80969)));
            yy = 5.10559 + (((tickAnim - 8) / 3) * (13.37544-(5.10559)));
            zz = 20.06327 + (((tickAnim - 8) / 3) * (8.73707-(20.06327)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -26.70337 + (((tickAnim - 11) / 3) * (-10.00039-(-26.70337)));
            yy = 13.37544 + (((tickAnim - 11) / 3) * (13.19384-(13.37544)));
            zz = 8.73707 + (((tickAnim - 11) / 3) * (7.79733-(8.73707)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -27.5 + (((tickAnim - 0) / 7) * (1.85721-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.59055-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.48352-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 1.85721 + (((tickAnim - 7) / 7) * (-27.5-(1.85721)));
            yy = 1.59055 + (((tickAnim - 7) / 7) * (0-(1.59055)));
            zz = -0.48352 + (((tickAnim - 7) / 7) * (0-(-0.48352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.86472 + (((tickAnim - 0) / 2) * (14.76747-(8.86472)));
            yy = -4.03799 + (((tickAnim - 0) / 2) * (-2.76491-(-4.03799)));
            zz = -7.40825 + (((tickAnim - 0) / 2) * (-5.80947-(-7.40825)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 14.76747 + (((tickAnim - 2) / 2) * (9.8231-(14.76747)));
            yy = -2.76491 + (((tickAnim - 2) / 2) * (-3.515-(-2.76491)));
            zz = -5.80947 + (((tickAnim - 2) / 2) * (-6.73161-(-5.80947)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 9.8231 + (((tickAnim - 4) / 3) * (1.50368-(9.8231)));
            yy = -3.515 + (((tickAnim - 4) / 3) * (1.63194-(-3.515)));
            zz = -6.73161 + (((tickAnim - 4) / 3) * (2.21249-(-6.73161)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 1.50368 + (((tickAnim - 7) / 2) * (30.12561-(1.50368)));
            yy = 1.63194 + (((tickAnim - 7) / 2) * (48.51153-(1.63194)));
            zz = 2.21249 + (((tickAnim - 7) / 2) * (34.45906-(2.21249)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 30.12561 + (((tickAnim - 9) / 5) * (8.86472-(30.12561)));
            yy = 48.51153 + (((tickAnim - 9) / 5) * (-4.03799-(48.51153)));
            zz = 34.45906 + (((tickAnim - 9) / 5) * (-7.40825-(34.45906)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegfoot, leftLegfoot.rotateAngleX + (float) Math.toRadians(xx), leftLegfoot.rotateAngleY + (float) Math.toRadians(yy), leftLegfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+90))*6), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+90))*5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+250))*6), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503))*6), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -80.42958 + (((tickAnim - 0) / 7) * (41.63164-(-80.42958)));
            yy = -13.34871 + (((tickAnim - 0) / 7) * (10.04679-(-13.34871)));
            zz = 67.01999 + (((tickAnim - 0) / 7) * (-12.80202-(67.01999)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 41.63164 + (((tickAnim - 7) / 1) * (40.73746-(41.63164)));
            yy = 10.04679 + (((tickAnim - 7) / 1) * (6.42842-(10.04679)));
            zz = -12.80202 + (((tickAnim - 7) / 1) * (12.92297-(-12.80202)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 40.73746 + (((tickAnim - 8) / 1) * (14.84328-(40.73746)));
            yy = 6.42842 + (((tickAnim - 8) / 1) * (2.81005-(6.42842)));
            zz = 12.92297 + (((tickAnim - 8) / 1) * (38.64795-(12.92297)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 14.84328 + (((tickAnim - 9) / 1) * (-14.8187-(14.84328)));
            yy = 2.81005 + (((tickAnim - 9) / 1) * (-2.54307-(2.81005)));
            zz = 38.64795 + (((tickAnim - 9) / 1) * (56.98367-(38.64795)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -14.8187 + (((tickAnim - 10) / 4) * (-80.42958-(-14.8187)));
            yy = -2.54307 + (((tickAnim - 10) / 4) * (-13.34871-(-2.54307)));
            zz = 56.98367 + (((tickAnim - 10) / 4) * (67.01999-(56.98367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-9.12964-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (6.66035-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-10.43099-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -9.12964 + (((tickAnim - 7) / 7) * (0-(-9.12964)));
            yy = 6.66035 + (((tickAnim - 7) / 7) * (0-(6.66035)));
            zz = -10.43099 + (((tickAnim - 7) / 7) * (0-(-10.43099)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.15543 + (((tickAnim - 0) / 3) * (0.57301-(0.15543)));
            yy = 21.3053 + (((tickAnim - 0) / 3) * (-11.07702-(21.3053)));
            zz = 7.28774 + (((tickAnim - 0) / 3) * (-14.15744-(7.28774)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.57301 + (((tickAnim - 3) / 3) * (14.1468-(0.57301)));
            yy = -11.07702 + (((tickAnim - 3) / 3) * (-42.32195-(-11.07702)));
            zz = -14.15744 + (((tickAnim - 3) / 3) * (-10.96355-(-14.15744)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 14.1468 + (((tickAnim - 6) / 1) * (33.56842-(14.1468)));
            yy = -42.32195 + (((tickAnim - 6) / 1) * (-53.42385-(-42.32195)));
            zz = -10.96355 + (((tickAnim - 6) / 1) * (-27.64372-(-10.96355)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 33.56842 + (((tickAnim - 7) / 3) * (-40.35335-(33.56842)));
            yy = -53.42385 + (((tickAnim - 7) / 3) * (32.66277-(-53.42385)));
            zz = -27.64372 + (((tickAnim - 7) / 3) * (-111.74345-(-27.64372)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -40.35335 + (((tickAnim - 10) / 0) * (-18.08993-(-40.35335)));
            yy = 32.66277 + (((tickAnim - 10) / 0) * (24.97873-(32.66277)));
            zz = -111.74345 + (((tickAnim - 10) / 0) * (-48.43092-(-111.74345)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -18.08993 + (((tickAnim - 10) / 4) * (0.15543-(-18.08993)));
            yy = 24.97873 + (((tickAnim - 10) / 4) * (21.3053-(24.97873)));
            zz = -48.43092 + (((tickAnim - 10) / 4) * (7.28774-(-48.43092)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmHand, rightArmHand.rotateAngleX + (float) Math.toRadians(xx), rightArmHand.rotateAngleY + (float) Math.toRadians(yy), rightArmHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -7.76686 + (((tickAnim - 0) / 7) * (-18.26245-(-7.76686)));
            yy = 18.99253 + (((tickAnim - 0) / 7) * (7.16229-(18.99253)));
            zz = 8.3318 + (((tickAnim - 0) / 7) * (-6.66735-(8.3318)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -18.26245 + (((tickAnim - 7) / 2) * (-16.02508-(-18.26245)));
            yy = 7.16229 + (((tickAnim - 7) / 2) * (1.91763-(7.16229)));
            zz = -6.66735 + (((tickAnim - 7) / 2) * (-30.34382-(-6.66735)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -16.02508 + (((tickAnim - 9) / 2) * (-21.98539-(-16.02508)));
            yy = 1.91763 + (((tickAnim - 9) / 2) * (1.78726-(1.91763)));
            zz = -30.34382 + (((tickAnim - 9) / 2) * (-29.86587-(-30.34382)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -21.98539 + (((tickAnim - 11) / 3) * (-7.76686-(-21.98539)));
            yy = 1.78726 + (((tickAnim - 11) / 3) * (18.99253-(1.78726)));
            zz = -29.86587 + (((tickAnim - 11) / 3) * (8.3318-(-29.86587)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmMembrane, rightArmMembrane.rotateAngleX + (float) Math.toRadians(xx), rightArmMembrane.rotateAngleY + (float) Math.toRadians(yy), rightArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.675-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.075-(0)));
            zz = -0.675 + (((tickAnim - 7) / 2) * (-0.49-(-0.675)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.075 + (((tickAnim - 9) / 2) * (-0.1-(0.075)));
            zz = -0.49 + (((tickAnim - 9) / 2) * (0-(-0.49)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 11) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArmMembrane.rotationPointX = this.rightArmMembrane.rotationPointX + (float)(xx);
        this.rightArmMembrane.rotationPointY = this.rightArmMembrane.rotationPointY - (float)(yy);
        this.rightArmMembrane.rotationPointZ = this.rightArmMembrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 41.53701 + (((tickAnim - 0) / 1) * (40.69015-(41.53701)));
            yy = -9.96784 + (((tickAnim - 0) / 1) * (-6.38895-(-9.96784)));
            zz = 15.25044 + (((tickAnim - 0) / 1) * (-11.69875-(15.25044)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 40.69015 + (((tickAnim - 1) / 1) * (14.84328-(40.69015)));
            yy = -6.38895 + (((tickAnim - 1) / 1) * (-2.81005-(-6.38895)));
            zz = -11.69875 + (((tickAnim - 1) / 1) * (-38.64795-(-11.69875)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 14.84328 + (((tickAnim - 2) / 1) * (-14.8187-(14.84328)));
            yy = -2.81005 + (((tickAnim - 2) / 1) * (2.54307-(-2.81005)));
            zz = -38.64795 + (((tickAnim - 2) / 1) * (-56.98367-(-38.64795)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -14.8187 + (((tickAnim - 3) / 4) * (-80.42958-(-14.8187)));
            yy = 2.54307 + (((tickAnim - 3) / 4) * (13.34871-(2.54307)));
            zz = -56.98367 + (((tickAnim - 3) / 4) * (-67.01999-(-56.98367)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -80.42958 + (((tickAnim - 7) / 7) * (41.53701-(-80.42958)));
            yy = 13.34871 + (((tickAnim - 7) / 7) * (-9.96784-(13.34871)));
            zz = -67.01999 + (((tickAnim - 7) / 7) * (15.25044-(-67.01999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -9.12964 + (((tickAnim - 0) / 7) * (0-(-9.12964)));
            yy = -6.66035 + (((tickAnim - 0) / 7) * (0-(-6.66035)));
            zz = 10.43099 + (((tickAnim - 0) / 7) * (0-(10.43099)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (-9.12964-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (-6.66035-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (10.43099-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 33.56842 + (((tickAnim - 0) / 2) * (-40.35335-(33.56842)));
            yy = 53.42385 + (((tickAnim - 0) / 2) * (-32.66277-(53.42385)));
            zz = 27.64372 + (((tickAnim - 0) / 2) * (111.74345-(27.64372)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -40.35335 + (((tickAnim - 2) / 1) * (-18.08993-(-40.35335)));
            yy = -32.66277 + (((tickAnim - 2) / 1) * (-24.97873-(-32.66277)));
            zz = 111.74345 + (((tickAnim - 2) / 1) * (48.43092-(111.74345)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -18.08993 + (((tickAnim - 3) / 4) * (0.15543-(-18.08993)));
            yy = -24.97873 + (((tickAnim - 3) / 4) * (-21.3053-(-24.97873)));
            zz = 48.43092 + (((tickAnim - 3) / 4) * (-7.28774-(48.43092)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.15543 + (((tickAnim - 7) / 3) * (0.57301-(0.15543)));
            yy = -21.3053 + (((tickAnim - 7) / 3) * (11.07702-(-21.3053)));
            zz = -7.28774 + (((tickAnim - 7) / 3) * (14.15744-(-7.28774)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.57301 + (((tickAnim - 10) / 3) * (14.1468-(0.57301)));
            yy = 11.07702 + (((tickAnim - 10) / 3) * (42.32195-(11.07702)));
            zz = 14.15744 + (((tickAnim - 10) / 3) * (10.96355-(14.15744)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 14.1468 + (((tickAnim - 13) / 1) * (33.56842-(14.1468)));
            yy = 42.32195 + (((tickAnim - 13) / 1) * (53.42385-(42.32195)));
            zz = 10.96355 + (((tickAnim - 13) / 1) * (27.64372-(10.96355)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmHand, leftArmHand.rotateAngleX + (float) Math.toRadians(xx), leftArmHand.rotateAngleY + (float) Math.toRadians(yy), leftArmHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -18.26245 + (((tickAnim - 0) / 2) * (-16.02508-(-18.26245)));
            yy = -7.16229 + (((tickAnim - 0) / 2) * (-1.91763-(-7.16229)));
            zz = 6.66735 + (((tickAnim - 0) / 2) * (30.34382-(6.66735)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -16.02508 + (((tickAnim - 2) / 2) * (-21.98539-(-16.02508)));
            yy = -1.91763 + (((tickAnim - 2) / 2) * (-1.78726-(-1.91763)));
            zz = 30.34382 + (((tickAnim - 2) / 2) * (29.86587-(30.34382)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -21.98539 + (((tickAnim - 4) / 3) * (-7.76686-(-21.98539)));
            yy = -1.78726 + (((tickAnim - 4) / 3) * (-18.99253-(-1.78726)));
            zz = 29.86587 + (((tickAnim - 4) / 3) * (-8.3318-(29.86587)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -7.76686 + (((tickAnim - 7) / 7) * (-18.26245-(-7.76686)));
            yy = -18.99253 + (((tickAnim - 7) / 7) * (-7.16229-(-18.99253)));
            zz = -8.3318 + (((tickAnim - 7) / 7) * (6.66735-(-8.3318)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmMembrane, leftArmMembrane.rotateAngleX + (float) Math.toRadians(xx), leftArmMembrane.rotateAngleY + (float) Math.toRadians(yy), leftArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.075-(0)));
            zz = -0.675 + (((tickAnim - 0) / 2) * (-0.49-(-0.675)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.075 + (((tickAnim - 2) / 2) * (-0.1-(0.075)));
            zz = -0.49 + (((tickAnim - 2) / 2) * (0-(-0.49)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 4) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (-0.675-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArmMembrane.rotationPointX = this.leftArmMembrane.rotationPointX + (float)(xx);
        this.leftArmMembrane.rotationPointY = this.leftArmMembrane.rotationPointY - (float)(yy);
        this.leftArmMembrane.rotationPointZ = this.leftArmMembrane.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503))*6), neck1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.10982 + (((tickAnim - 0) / 2) * (-2.08335-(-0.10982)));
            yy = -8.13551 + (((tickAnim - 0) / 2) * (-10.50786-(-8.13551)));
            zz = -0.21458 + (((tickAnim - 0) / 2) * (-23.09773-(-0.21458)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -2.08335 + (((tickAnim - 2) / 2) * (-2.10614-(-2.08335)));
            yy = -10.50786 + (((tickAnim - 2) / 2) * (-9.48832-(-10.50786)));
            zz = -23.09773 + (((tickAnim - 2) / 2) * (-23.75532-(-23.09773)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -2.10614 + (((tickAnim - 4) / 3) * (0-(-2.10614)));
            yy = -9.48832 + (((tickAnim - 4) / 3) * (0-(-9.48832)));
            zz = -23.75532 + (((tickAnim - 4) / 3) * (0-(-23.75532)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-2.6943-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (-5.10139-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-16.78276-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -2.6943 + (((tickAnim - 11) / 2) * (-1.73505-(-2.6943)));
            yy = -5.10139 + (((tickAnim - 11) / 2) * (-11.49206-(-5.10139)));
            zz = -16.78276 + (((tickAnim - 11) / 2) * (-7.33267-(-16.78276)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -1.73505 + (((tickAnim - 13) / 1) * (-0.10982-(-1.73505)));
            yy = -11.49206 + (((tickAnim - 13) / 1) * (-8.13551-(-11.49206)));
            zz = -7.33267 + (((tickAnim - 13) / 1) * (-0.21458-(-7.33267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontMembrane, leftFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), leftFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), leftFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.6943-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (5.10139-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (16.78276-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -2.6943 + (((tickAnim - 4) / 2) * (-1.73505-(-2.6943)));
            yy = 5.10139 + (((tickAnim - 4) / 2) * (11.49206-(5.10139)));
            zz = 16.78276 + (((tickAnim - 4) / 2) * (7.33267-(16.78276)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.73505 + (((tickAnim - 6) / 1) * (-0.10982-(-1.73505)));
            yy = 11.49206 + (((tickAnim - 6) / 1) * (8.13551-(11.49206)));
            zz = 7.33267 + (((tickAnim - 6) / 1) * (0.21458-(7.33267)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.10982 + (((tickAnim - 7) / 2) * (-2.08335-(-0.10982)));
            yy = 8.13551 + (((tickAnim - 7) / 2) * (10.50786-(8.13551)));
            zz = 0.21458 + (((tickAnim - 7) / 2) * (23.09773-(0.21458)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -2.08335 + (((tickAnim - 9) / 2) * (-2.10614-(-2.08335)));
            yy = 10.50786 + (((tickAnim - 9) / 2) * (9.48832-(10.50786)));
            zz = 23.09773 + (((tickAnim - 9) / 2) * (23.75532-(23.09773)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -2.10614 + (((tickAnim - 11) / 3) * (0-(-2.10614)));
            yy = 9.48832 + (((tickAnim - 11) / 3) * (0-(9.48832)));
            zz = 23.75532 + (((tickAnim - 11) / 3) * (0-(23.75532)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontMembrane, rightFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), rightFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), rightFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+180))*6), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-1), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+30))*3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+30))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30))*8), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-90))*8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-90))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-150))*5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-150))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-190))*12), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-190))*5));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -0.15105 + (((tickAnim - 0) / 14) * (-0.15105-(-0.15105)));
            yy = 11.65093 + (((tickAnim - 0) / 14) * (11.65093-(11.65093)));
            zz = -9.93352 + (((tickAnim - 0) / 14) * (-9.93352-(-9.93352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegUpperMembrane1, leftLegUpperMembrane1.rotateAngleX + (float) Math.toRadians(xx), leftLegUpperMembrane1.rotateAngleY + (float) Math.toRadians(yy), leftLegUpperMembrane1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.49459-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-6.37512-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (19.76857-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0.49459 + (((tickAnim - 4) / 3) * (-1.24622-(0.49459)));
            yy = -6.37512 + (((tickAnim - 4) / 3) * (-12.86295-(-6.37512)));
            zz = 19.76857 + (((tickAnim - 4) / 3) * (-9.60866-(19.76857)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -1.24622 + (((tickAnim - 7) / 7) * (0-(-1.24622)));
            yy = -12.86295 + (((tickAnim - 7) / 7) * (0-(-12.86295)));
            zz = -9.60866 + (((tickAnim - 7) / 7) * (0-(-9.60866)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane1, rightMembrane1.rotateAngleX + (float) Math.toRadians(xx), rightMembrane1.rotateAngleY + (float) Math.toRadians(yy), rightMembrane1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1.85039 + (((tickAnim - 0) / 4) * (-12.43015-(-1.85039)));
            yy = -4.71967 + (((tickAnim - 0) / 4) * (-20.59933-(-4.71967)));
            zz = 0.72232 + (((tickAnim - 0) / 4) * (-2.52036-(0.72232)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -12.43015 + (((tickAnim - 4) / 3) * (-1.08947-(-12.43015)));
            yy = -20.59933 + (((tickAnim - 4) / 3) * (-11.60823-(-20.59933)));
            zz = -2.52036 + (((tickAnim - 4) / 3) * (4.44875-(-2.52036)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.08947 + (((tickAnim - 7) / 3) * (-3.74645-(-1.08947)));
            yy = -11.60823 + (((tickAnim - 7) / 3) * (-17.35728-(-11.60823)));
            zz = 4.44875 + (((tickAnim - 7) / 3) * (4.37705-(4.44875)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -3.74645 + (((tickAnim - 10) / 4) * (-1.85039-(-3.74645)));
            yy = -17.35728 + (((tickAnim - 10) / 4) * (-4.71967-(-17.35728)));
            zz = 4.37705 + (((tickAnim - 10) / 4) * (0.72232-(4.37705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane2, rightMembrane2.rotateAngleX + (float) Math.toRadians(xx), rightMembrane2.rotateAngleY + (float) Math.toRadians(yy), rightMembrane2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.85836 + (((tickAnim - 0) / 4) * (-7.93342-(-0.85836)));
            yy = -4.61973 + (((tickAnim - 0) / 4) * (-2.00112-(-4.61973)));
            zz = -1.02989 + (((tickAnim - 0) / 4) * (-8.26041-(-1.02989)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7.93342 + (((tickAnim - 4) / 3) * (0-(-7.93342)));
            yy = -2.00112 + (((tickAnim - 4) / 3) * (0-(-2.00112)));
            zz = -8.26041 + (((tickAnim - 4) / 3) * (0-(-8.26041)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (-0.85836-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (-4.61973-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (-1.02989-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane3, rightMembrane3.rotateAngleX + (float) Math.toRadians(xx), rightMembrane3.rotateAngleY + (float) Math.toRadians(yy), rightMembrane3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -26.83627 + (((tickAnim - 0) / 1) * (-24.94005-(-26.83627)));
            yy = -3.03813 + (((tickAnim - 0) / 1) * (-4.30431-(-3.03813)));
            zz = -22.89482 + (((tickAnim - 0) / 1) * (-17.04614-(-22.89482)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -24.94005 + (((tickAnim - 1) / 3) * (-26.70337-(-24.94005)));
            yy = -4.30431 + (((tickAnim - 1) / 3) * (-13.37544-(-4.30431)));
            zz = -17.04614 + (((tickAnim - 1) / 3) * (-8.73707-(-17.04614)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -26.70337 + (((tickAnim - 4) / 3) * (-10.00039-(-26.70337)));
            yy = -13.37544 + (((tickAnim - 4) / 3) * (-13.19384-(-13.37544)));
            zz = -8.73707 + (((tickAnim - 4) / 3) * (-7.79733-(-8.73707)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -10.00039 + (((tickAnim - 7) / 1) * (-11.83991-(-10.00039)));
            yy = -13.19384 + (((tickAnim - 7) / 1) * (-12.28724-(-13.19384)));
            zz = -7.79733 + (((tickAnim - 7) / 1) * (-8.59816-(-7.79733)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.83991 + (((tickAnim - 8) / 2) * (-15.9626-(-11.83991)));
            yy = -12.28724 + (((tickAnim - 8) / 2) * (-10.53583-(-12.28724)));
            zz = -8.59816 + (((tickAnim - 8) / 2) * (-11.06903-(-8.59816)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -15.9626 + (((tickAnim - 10) / 1) * (-21.97771-(-15.9626)));
            yy = -10.53583 + (((tickAnim - 10) / 1) * (-9.309-(-10.53583)));
            zz = -11.06903 + (((tickAnim - 10) / 1) * (-17.5985-(-11.06903)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -21.97771 + (((tickAnim - 11) / 3) * (-26.83627-(-21.97771)));
            yy = -9.309 + (((tickAnim - 11) / 3) * (-3.03813-(-9.309)));
            zz = -17.5985 + (((tickAnim - 11) / 3) * (-22.89482-(-17.5985)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.15 + (((tickAnim - 0) / 7) * (-0.15105-(-0.15)));
            yy = -11.65 + (((tickAnim - 0) / 7) * (-11.65093-(-11.65)));
            zz = 9.93 + (((tickAnim - 0) / 7) * (9.93352-(9.93)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -0.15105 + (((tickAnim - 7) / 7) * (-0.15-(-0.15105)));
            yy = -11.65093 + (((tickAnim - 7) / 7) * (-11.65-(-11.65093)));
            zz = 9.93352 + (((tickAnim - 7) / 7) * (9.93-(9.93352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegUpperMembrane1, rightLegUpperMembrane1.rotateAngleX + (float) Math.toRadians(xx), rightLegUpperMembrane1.rotateAngleY + (float) Math.toRadians(yy), rightLegUpperMembrane1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1.85721 + (((tickAnim - 0) / 7) * (-27.5-(1.85721)));
            yy = -1.59055 + (((tickAnim - 0) / 7) * (0-(-1.59055)));
            zz = 0.48352 + (((tickAnim - 0) / 7) * (0-(0.48352)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -27.5 + (((tickAnim - 7) / 7) * (1.85721-(-27.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (-1.59055-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0.48352-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.50368 + (((tickAnim - 0) / 2) * (30.12561-(1.50368)));
            yy = -1.63194 + (((tickAnim - 0) / 2) * (-48.51153-(-1.63194)));
            zz = -2.21249 + (((tickAnim - 0) / 2) * (-34.45906-(-2.21249)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 30.12561 + (((tickAnim - 2) / 5) * (8.86472-(30.12561)));
            yy = -48.51153 + (((tickAnim - 2) / 5) * (4.03799-(-48.51153)));
            zz = -34.45906 + (((tickAnim - 2) / 5) * (7.40825-(-34.45906)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 8.86472 + (((tickAnim - 7) / 3) * (14.76747-(8.86472)));
            yy = 4.03799 + (((tickAnim - 7) / 3) * (2.76491-(4.03799)));
            zz = 7.40825 + (((tickAnim - 7) / 3) * (5.80947-(7.40825)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 14.76747 + (((tickAnim - 10) / 1) * (9.8231-(14.76747)));
            yy = 2.76491 + (((tickAnim - 10) / 1) * (3.515-(2.76491)));
            zz = 5.80947 + (((tickAnim - 10) / 1) * (6.73161-(5.80947)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 9.8231 + (((tickAnim - 11) / 3) * (1.50368-(9.8231)));
            yy = 3.515 + (((tickAnim - 11) / 3) * (-1.63194-(3.515)));
            zz = 6.73161 + (((tickAnim - 11) / 3) * (-2.21249-(6.73161)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegfoot, rightLegfoot.rotateAngleX + (float) Math.toRadians(xx), rightLegfoot.rotateAngleY + (float) Math.toRadians(yy), rightLegfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30*6))*5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30*3))*5));


    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraSharovipteryx entity = (EntityPrehistoricFloraSharovipteryx) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -1.24622 + (((tickAnim - 0) / 7) * (0-(-1.24622)));
            yy = 12.86295 + (((tickAnim - 0) / 7) * (0-(12.86295)));
            zz = 9.60866 + (((tickAnim - 0) / 7) * (0-(9.60866)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0.49459-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (6.37512-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-19.76857-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0.49459 + (((tickAnim - 11) / 3) * (-1.24622-(0.49459)));
            yy = 6.37512 + (((tickAnim - 11) / 3) * (12.86295-(6.37512)));
            zz = -19.76857 + (((tickAnim - 11) / 3) * (9.60866-(-19.76857)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane1, leftMembrane1.rotateAngleX + (float) Math.toRadians(xx), leftMembrane1.rotateAngleY + (float) Math.toRadians(yy), leftMembrane1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.08947 + (((tickAnim - 0) / 3) * (-3.74645-(-1.08947)));
            yy = 11.60823 + (((tickAnim - 0) / 3) * (17.35728-(11.60823)));
            zz = -4.44875 + (((tickAnim - 0) / 3) * (-4.37705-(-4.44875)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -3.74645 + (((tickAnim - 3) / 4) * (-1.85039-(-3.74645)));
            yy = 17.35728 + (((tickAnim - 3) / 4) * (4.71967-(17.35728)));
            zz = -4.37705 + (((tickAnim - 3) / 4) * (-0.72232-(-4.37705)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -1.85039 + (((tickAnim - 7) / 4) * (-12.43015-(-1.85039)));
            yy = 4.71967 + (((tickAnim - 7) / 4) * (20.59933-(4.71967)));
            zz = -0.72232 + (((tickAnim - 7) / 4) * (2.52036-(-0.72232)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -12.43015 + (((tickAnim - 11) / 3) * (-1.08947-(-12.43015)));
            yy = 20.59933 + (((tickAnim - 11) / 3) * (11.60823-(20.59933)));
            zz = 2.52036 + (((tickAnim - 11) / 3) * (-4.44875-(2.52036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane2, leftMembrane2.rotateAngleX + (float) Math.toRadians(xx), leftMembrane2.rotateAngleY + (float) Math.toRadians(yy), leftMembrane2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.85836-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (4.61973-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (1.02989-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -0.85836 + (((tickAnim - 7) / 4) * (-7.93342-(-0.85836)));
            yy = 4.61973 + (((tickAnim - 7) / 4) * (2.00112-(4.61973)));
            zz = 1.02989 + (((tickAnim - 7) / 4) * (8.26041-(1.02989)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -7.93342 + (((tickAnim - 11) / 3) * (0-(-7.93342)));
            yy = 2.00112 + (((tickAnim - 11) / 3) * (0-(2.00112)));
            zz = 8.26041 + (((tickAnim - 11) / 3) * (0-(8.26041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane3, leftMembrane3.rotateAngleX + (float) Math.toRadians(xx), leftMembrane3.rotateAngleY + (float) Math.toRadians(yy), leftMembrane3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -10.00039 + (((tickAnim - 0) / 2) * (-15.9626-(-10.00039)));
            yy = 13.19384 + (((tickAnim - 0) / 2) * (10.53583-(13.19384)));
            zz = 7.79733 + (((tickAnim - 0) / 2) * (11.06903-(7.79733)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -15.9626 + (((tickAnim - 2) / 2) * (-21.97771-(-15.9626)));
            yy = 10.53583 + (((tickAnim - 2) / 2) * (9.309-(10.53583)));
            zz = 11.06903 + (((tickAnim - 2) / 2) * (17.5985-(11.06903)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -21.97771 + (((tickAnim - 4) / 3) * (-26.83627-(-21.97771)));
            yy = 9.309 + (((tickAnim - 4) / 3) * (3.03813-(9.309)));
            zz = 17.5985 + (((tickAnim - 4) / 3) * (22.89482-(17.5985)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -26.83627 + (((tickAnim - 7) / 1) * (-31.80969-(-26.83627)));
            yy = 3.03813 + (((tickAnim - 7) / 1) * (5.10559-(3.03813)));
            zz = 22.89482 + (((tickAnim - 7) / 1) * (20.06327-(22.89482)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -31.80969 + (((tickAnim - 8) / 3) * (-26.70337-(-31.80969)));
            yy = 5.10559 + (((tickAnim - 8) / 3) * (13.37544-(5.10559)));
            zz = 20.06327 + (((tickAnim - 8) / 3) * (8.73707-(20.06327)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -26.70337 + (((tickAnim - 11) / 3) * (-10.00039-(-26.70337)));
            yy = 13.37544 + (((tickAnim - 11) / 3) * (13.19384-(13.37544)));
            zz = 8.73707 + (((tickAnim - 11) / 3) * (7.79733-(8.73707)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -27.5 + (((tickAnim - 0) / 7) * (1.85721-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.59055-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.48352-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 1.85721 + (((tickAnim - 7) / 7) * (-27.5-(1.85721)));
            yy = 1.59055 + (((tickAnim - 7) / 7) * (0-(1.59055)));
            zz = -0.48352 + (((tickAnim - 7) / 7) * (0-(-0.48352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.86472 + (((tickAnim - 0) / 2) * (14.76747-(8.86472)));
            yy = -4.03799 + (((tickAnim - 0) / 2) * (-2.76491-(-4.03799)));
            zz = -7.40825 + (((tickAnim - 0) / 2) * (-5.80947-(-7.40825)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 14.76747 + (((tickAnim - 2) / 2) * (9.8231-(14.76747)));
            yy = -2.76491 + (((tickAnim - 2) / 2) * (-3.515-(-2.76491)));
            zz = -5.80947 + (((tickAnim - 2) / 2) * (-6.73161-(-5.80947)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 9.8231 + (((tickAnim - 4) / 3) * (1.50368-(9.8231)));
            yy = -3.515 + (((tickAnim - 4) / 3) * (1.63194-(-3.515)));
            zz = -6.73161 + (((tickAnim - 4) / 3) * (2.21249-(-6.73161)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 1.50368 + (((tickAnim - 7) / 2) * (30.12561-(1.50368)));
            yy = 1.63194 + (((tickAnim - 7) / 2) * (48.51153-(1.63194)));
            zz = 2.21249 + (((tickAnim - 7) / 2) * (34.45906-(2.21249)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 30.12561 + (((tickAnim - 9) / 5) * (8.86472-(30.12561)));
            yy = 48.51153 + (((tickAnim - 9) / 5) * (-4.03799-(48.51153)));
            zz = 34.45906 + (((tickAnim - 9) / 5) * (-7.40825-(34.45906)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegfoot, leftLegfoot.rotateAngleX + (float) Math.toRadians(xx), leftLegfoot.rotateAngleY + (float) Math.toRadians(yy), leftLegfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+90))*6), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+90))*5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+250))*6), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503))*6), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -80.42958 + (((tickAnim - 0) / 7) * (41.63164-(-80.42958)));
            yy = -13.34871 + (((tickAnim - 0) / 7) * (10.04679-(-13.34871)));
            zz = 67.01999 + (((tickAnim - 0) / 7) * (-12.80202-(67.01999)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 41.63164 + (((tickAnim - 7) / 1) * (40.73746-(41.63164)));
            yy = 10.04679 + (((tickAnim - 7) / 1) * (6.42842-(10.04679)));
            zz = -12.80202 + (((tickAnim - 7) / 1) * (12.92297-(-12.80202)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 40.73746 + (((tickAnim - 8) / 1) * (14.84328-(40.73746)));
            yy = 6.42842 + (((tickAnim - 8) / 1) * (2.81005-(6.42842)));
            zz = 12.92297 + (((tickAnim - 8) / 1) * (38.64795-(12.92297)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 14.84328 + (((tickAnim - 9) / 1) * (-14.8187-(14.84328)));
            yy = 2.81005 + (((tickAnim - 9) / 1) * (-2.54307-(2.81005)));
            zz = 38.64795 + (((tickAnim - 9) / 1) * (56.98367-(38.64795)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -14.8187 + (((tickAnim - 10) / 4) * (-80.42958-(-14.8187)));
            yy = -2.54307 + (((tickAnim - 10) / 4) * (-13.34871-(-2.54307)));
            zz = 56.98367 + (((tickAnim - 10) / 4) * (67.01999-(56.98367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-9.12964-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (6.66035-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-10.43099-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -9.12964 + (((tickAnim - 7) / 7) * (0-(-9.12964)));
            yy = 6.66035 + (((tickAnim - 7) / 7) * (0-(6.66035)));
            zz = -10.43099 + (((tickAnim - 7) / 7) * (0-(-10.43099)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.15543 + (((tickAnim - 0) / 3) * (0.57301-(0.15543)));
            yy = 21.3053 + (((tickAnim - 0) / 3) * (-11.07702-(21.3053)));
            zz = 7.28774 + (((tickAnim - 0) / 3) * (-14.15744-(7.28774)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.57301 + (((tickAnim - 3) / 3) * (14.1468-(0.57301)));
            yy = -11.07702 + (((tickAnim - 3) / 3) * (-42.32195-(-11.07702)));
            zz = -14.15744 + (((tickAnim - 3) / 3) * (-10.96355-(-14.15744)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 14.1468 + (((tickAnim - 6) / 1) * (33.56842-(14.1468)));
            yy = -42.32195 + (((tickAnim - 6) / 1) * (-53.42385-(-42.32195)));
            zz = -10.96355 + (((tickAnim - 6) / 1) * (-27.64372-(-10.96355)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 33.56842 + (((tickAnim - 7) / 3) * (-40.35335-(33.56842)));
            yy = -53.42385 + (((tickAnim - 7) / 3) * (32.66277-(-53.42385)));
            zz = -27.64372 + (((tickAnim - 7) / 3) * (-111.74345-(-27.64372)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -40.35335 + (((tickAnim - 10) / 0) * (-18.08993-(-40.35335)));
            yy = 32.66277 + (((tickAnim - 10) / 0) * (24.97873-(32.66277)));
            zz = -111.74345 + (((tickAnim - 10) / 0) * (-48.43092-(-111.74345)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -18.08993 + (((tickAnim - 10) / 4) * (0.15543-(-18.08993)));
            yy = 24.97873 + (((tickAnim - 10) / 4) * (21.3053-(24.97873)));
            zz = -48.43092 + (((tickAnim - 10) / 4) * (7.28774-(-48.43092)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmHand, rightArmHand.rotateAngleX + (float) Math.toRadians(xx), rightArmHand.rotateAngleY + (float) Math.toRadians(yy), rightArmHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -7.76686 + (((tickAnim - 0) / 7) * (-18.26245-(-7.76686)));
            yy = 18.99253 + (((tickAnim - 0) / 7) * (7.16229-(18.99253)));
            zz = 8.3318 + (((tickAnim - 0) / 7) * (-6.66735-(8.3318)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -18.26245 + (((tickAnim - 7) / 2) * (-16.02508-(-18.26245)));
            yy = 7.16229 + (((tickAnim - 7) / 2) * (1.91763-(7.16229)));
            zz = -6.66735 + (((tickAnim - 7) / 2) * (-30.34382-(-6.66735)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -16.02508 + (((tickAnim - 9) / 2) * (-21.98539-(-16.02508)));
            yy = 1.91763 + (((tickAnim - 9) / 2) * (1.78726-(1.91763)));
            zz = -30.34382 + (((tickAnim - 9) / 2) * (-29.86587-(-30.34382)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -21.98539 + (((tickAnim - 11) / 3) * (-7.76686-(-21.98539)));
            yy = 1.78726 + (((tickAnim - 11) / 3) * (18.99253-(1.78726)));
            zz = -29.86587 + (((tickAnim - 11) / 3) * (8.3318-(-29.86587)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmMembrane, rightArmMembrane.rotateAngleX + (float) Math.toRadians(xx), rightArmMembrane.rotateAngleY + (float) Math.toRadians(yy), rightArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.675-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.075-(0)));
            zz = -0.675 + (((tickAnim - 7) / 2) * (-0.49-(-0.675)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.075 + (((tickAnim - 9) / 2) * (-0.1-(0.075)));
            zz = -0.49 + (((tickAnim - 9) / 2) * (0-(-0.49)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 11) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArmMembrane.rotationPointX = this.rightArmMembrane.rotationPointX + (float)(xx);
        this.rightArmMembrane.rotationPointY = this.rightArmMembrane.rotationPointY - (float)(yy);
        this.rightArmMembrane.rotationPointZ = this.rightArmMembrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 41.53701 + (((tickAnim - 0) / 1) * (40.69015-(41.53701)));
            yy = -9.96784 + (((tickAnim - 0) / 1) * (-6.38895-(-9.96784)));
            zz = 15.25044 + (((tickAnim - 0) / 1) * (-11.69875-(15.25044)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 40.69015 + (((tickAnim - 1) / 1) * (14.84328-(40.69015)));
            yy = -6.38895 + (((tickAnim - 1) / 1) * (-2.81005-(-6.38895)));
            zz = -11.69875 + (((tickAnim - 1) / 1) * (-38.64795-(-11.69875)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 14.84328 + (((tickAnim - 2) / 1) * (-14.8187-(14.84328)));
            yy = -2.81005 + (((tickAnim - 2) / 1) * (2.54307-(-2.81005)));
            zz = -38.64795 + (((tickAnim - 2) / 1) * (-56.98367-(-38.64795)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -14.8187 + (((tickAnim - 3) / 4) * (-80.42958-(-14.8187)));
            yy = 2.54307 + (((tickAnim - 3) / 4) * (13.34871-(2.54307)));
            zz = -56.98367 + (((tickAnim - 3) / 4) * (-67.01999-(-56.98367)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -80.42958 + (((tickAnim - 7) / 7) * (41.53701-(-80.42958)));
            yy = 13.34871 + (((tickAnim - 7) / 7) * (-9.96784-(13.34871)));
            zz = -67.01999 + (((tickAnim - 7) / 7) * (15.25044-(-67.01999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -9.12964 + (((tickAnim - 0) / 7) * (0-(-9.12964)));
            yy = -6.66035 + (((tickAnim - 0) / 7) * (0-(-6.66035)));
            zz = 10.43099 + (((tickAnim - 0) / 7) * (0-(10.43099)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (-9.12964-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (-6.66035-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (10.43099-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 33.56842 + (((tickAnim - 0) / 2) * (-40.35335-(33.56842)));
            yy = 53.42385 + (((tickAnim - 0) / 2) * (-32.66277-(53.42385)));
            zz = 27.64372 + (((tickAnim - 0) / 2) * (111.74345-(27.64372)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -40.35335 + (((tickAnim - 2) / 1) * (-18.08993-(-40.35335)));
            yy = -32.66277 + (((tickAnim - 2) / 1) * (-24.97873-(-32.66277)));
            zz = 111.74345 + (((tickAnim - 2) / 1) * (48.43092-(111.74345)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -18.08993 + (((tickAnim - 3) / 4) * (0.15543-(-18.08993)));
            yy = -24.97873 + (((tickAnim - 3) / 4) * (-21.3053-(-24.97873)));
            zz = 48.43092 + (((tickAnim - 3) / 4) * (-7.28774-(48.43092)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.15543 + (((tickAnim - 7) / 3) * (0.57301-(0.15543)));
            yy = -21.3053 + (((tickAnim - 7) / 3) * (11.07702-(-21.3053)));
            zz = -7.28774 + (((tickAnim - 7) / 3) * (14.15744-(-7.28774)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.57301 + (((tickAnim - 10) / 3) * (14.1468-(0.57301)));
            yy = 11.07702 + (((tickAnim - 10) / 3) * (42.32195-(11.07702)));
            zz = 14.15744 + (((tickAnim - 10) / 3) * (10.96355-(14.15744)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 14.1468 + (((tickAnim - 13) / 1) * (33.56842-(14.1468)));
            yy = 42.32195 + (((tickAnim - 13) / 1) * (53.42385-(42.32195)));
            zz = 10.96355 + (((tickAnim - 13) / 1) * (27.64372-(10.96355)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmHand, leftArmHand.rotateAngleX + (float) Math.toRadians(xx), leftArmHand.rotateAngleY + (float) Math.toRadians(yy), leftArmHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -18.26245 + (((tickAnim - 0) / 2) * (-16.02508-(-18.26245)));
            yy = -7.16229 + (((tickAnim - 0) / 2) * (-1.91763-(-7.16229)));
            zz = 6.66735 + (((tickAnim - 0) / 2) * (30.34382-(6.66735)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -16.02508 + (((tickAnim - 2) / 2) * (-21.98539-(-16.02508)));
            yy = -1.91763 + (((tickAnim - 2) / 2) * (-1.78726-(-1.91763)));
            zz = 30.34382 + (((tickAnim - 2) / 2) * (29.86587-(30.34382)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -21.98539 + (((tickAnim - 4) / 3) * (-7.76686-(-21.98539)));
            yy = -1.78726 + (((tickAnim - 4) / 3) * (-18.99253-(-1.78726)));
            zz = 29.86587 + (((tickAnim - 4) / 3) * (-8.3318-(29.86587)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -7.76686 + (((tickAnim - 7) / 7) * (-18.26245-(-7.76686)));
            yy = -18.99253 + (((tickAnim - 7) / 7) * (-7.16229-(-18.99253)));
            zz = -8.3318 + (((tickAnim - 7) / 7) * (6.66735-(-8.3318)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmMembrane, leftArmMembrane.rotateAngleX + (float) Math.toRadians(xx), leftArmMembrane.rotateAngleY + (float) Math.toRadians(yy), leftArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.075-(0)));
            zz = -0.675 + (((tickAnim - 0) / 2) * (-0.49-(-0.675)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.075 + (((tickAnim - 2) / 2) * (-0.1-(0.075)));
            zz = -0.49 + (((tickAnim - 2) / 2) * (0-(-0.49)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 4) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (-0.675-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArmMembrane.rotationPointX = this.leftArmMembrane.rotationPointX + (float)(xx);
        this.leftArmMembrane.rotationPointY = this.leftArmMembrane.rotationPointY - (float)(yy);
        this.leftArmMembrane.rotationPointZ = this.leftArmMembrane.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503))*6), neck1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.10982 + (((tickAnim - 0) / 2) * (-2.08335-(-0.10982)));
            yy = -8.13551 + (((tickAnim - 0) / 2) * (-10.50786-(-8.13551)));
            zz = -0.21458 + (((tickAnim - 0) / 2) * (-23.09773-(-0.21458)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -2.08335 + (((tickAnim - 2) / 2) * (-2.10614-(-2.08335)));
            yy = -10.50786 + (((tickAnim - 2) / 2) * (-9.48832-(-10.50786)));
            zz = -23.09773 + (((tickAnim - 2) / 2) * (-23.75532-(-23.09773)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -2.10614 + (((tickAnim - 4) / 3) * (0-(-2.10614)));
            yy = -9.48832 + (((tickAnim - 4) / 3) * (0-(-9.48832)));
            zz = -23.75532 + (((tickAnim - 4) / 3) * (0-(-23.75532)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-2.6943-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (-5.10139-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-16.78276-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -2.6943 + (((tickAnim - 11) / 2) * (-1.73505-(-2.6943)));
            yy = -5.10139 + (((tickAnim - 11) / 2) * (-11.49206-(-5.10139)));
            zz = -16.78276 + (((tickAnim - 11) / 2) * (-7.33267-(-16.78276)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -1.73505 + (((tickAnim - 13) / 1) * (-0.10982-(-1.73505)));
            yy = -11.49206 + (((tickAnim - 13) / 1) * (-8.13551-(-11.49206)));
            zz = -7.33267 + (((tickAnim - 13) / 1) * (-0.21458-(-7.33267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontMembrane, leftFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), leftFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), leftFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.6943-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (5.10139-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (16.78276-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -2.6943 + (((tickAnim - 4) / 2) * (-1.73505-(-2.6943)));
            yy = 5.10139 + (((tickAnim - 4) / 2) * (11.49206-(5.10139)));
            zz = 16.78276 + (((tickAnim - 4) / 2) * (7.33267-(16.78276)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.73505 + (((tickAnim - 6) / 1) * (-0.10982-(-1.73505)));
            yy = 11.49206 + (((tickAnim - 6) / 1) * (8.13551-(11.49206)));
            zz = 7.33267 + (((tickAnim - 6) / 1) * (0.21458-(7.33267)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.10982 + (((tickAnim - 7) / 2) * (-2.08335-(-0.10982)));
            yy = 8.13551 + (((tickAnim - 7) / 2) * (10.50786-(8.13551)));
            zz = 0.21458 + (((tickAnim - 7) / 2) * (23.09773-(0.21458)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -2.08335 + (((tickAnim - 9) / 2) * (-2.10614-(-2.08335)));
            yy = 10.50786 + (((tickAnim - 9) / 2) * (9.48832-(10.50786)));
            zz = 23.09773 + (((tickAnim - 9) / 2) * (23.75532-(23.09773)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -2.10614 + (((tickAnim - 11) / 3) * (0-(-2.10614)));
            yy = 9.48832 + (((tickAnim - 11) / 3) * (0-(9.48832)));
            zz = 23.75532 + (((tickAnim - 11) / 3) * (0-(23.75532)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontMembrane, rightFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), rightFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), rightFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+180))*6), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-1), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+30))*3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+30))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30))*8), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-90))*8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-90))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-150))*5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-150))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-190))*12), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-190))*5));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -0.15105 + (((tickAnim - 0) / 14) * (-0.15105-(-0.15105)));
            yy = 11.65093 + (((tickAnim - 0) / 14) * (11.65093-(11.65093)));
            zz = -9.93352 + (((tickAnim - 0) / 14) * (-9.93352-(-9.93352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegUpperMembrane1, leftLegUpperMembrane1.rotateAngleX + (float) Math.toRadians(xx), leftLegUpperMembrane1.rotateAngleY + (float) Math.toRadians(yy), leftLegUpperMembrane1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.49459-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-6.37512-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (19.76857-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0.49459 + (((tickAnim - 4) / 3) * (-1.24622-(0.49459)));
            yy = -6.37512 + (((tickAnim - 4) / 3) * (-12.86295-(-6.37512)));
            zz = 19.76857 + (((tickAnim - 4) / 3) * (-9.60866-(19.76857)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -1.24622 + (((tickAnim - 7) / 7) * (0-(-1.24622)));
            yy = -12.86295 + (((tickAnim - 7) / 7) * (0-(-12.86295)));
            zz = -9.60866 + (((tickAnim - 7) / 7) * (0-(-9.60866)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane1, rightMembrane1.rotateAngleX + (float) Math.toRadians(xx), rightMembrane1.rotateAngleY + (float) Math.toRadians(yy), rightMembrane1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1.85039 + (((tickAnim - 0) / 4) * (-12.43015-(-1.85039)));
            yy = -4.71967 + (((tickAnim - 0) / 4) * (-20.59933-(-4.71967)));
            zz = 0.72232 + (((tickAnim - 0) / 4) * (-2.52036-(0.72232)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -12.43015 + (((tickAnim - 4) / 3) * (-1.08947-(-12.43015)));
            yy = -20.59933 + (((tickAnim - 4) / 3) * (-11.60823-(-20.59933)));
            zz = -2.52036 + (((tickAnim - 4) / 3) * (4.44875-(-2.52036)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.08947 + (((tickAnim - 7) / 3) * (-3.74645-(-1.08947)));
            yy = -11.60823 + (((tickAnim - 7) / 3) * (-17.35728-(-11.60823)));
            zz = 4.44875 + (((tickAnim - 7) / 3) * (4.37705-(4.44875)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -3.74645 + (((tickAnim - 10) / 4) * (-1.85039-(-3.74645)));
            yy = -17.35728 + (((tickAnim - 10) / 4) * (-4.71967-(-17.35728)));
            zz = 4.37705 + (((tickAnim - 10) / 4) * (0.72232-(4.37705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane2, rightMembrane2.rotateAngleX + (float) Math.toRadians(xx), rightMembrane2.rotateAngleY + (float) Math.toRadians(yy), rightMembrane2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.85836 + (((tickAnim - 0) / 4) * (-7.93342-(-0.85836)));
            yy = -4.61973 + (((tickAnim - 0) / 4) * (-2.00112-(-4.61973)));
            zz = -1.02989 + (((tickAnim - 0) / 4) * (-8.26041-(-1.02989)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7.93342 + (((tickAnim - 4) / 3) * (0-(-7.93342)));
            yy = -2.00112 + (((tickAnim - 4) / 3) * (0-(-2.00112)));
            zz = -8.26041 + (((tickAnim - 4) / 3) * (0-(-8.26041)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (-0.85836-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (-4.61973-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (-1.02989-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane3, rightMembrane3.rotateAngleX + (float) Math.toRadians(xx), rightMembrane3.rotateAngleY + (float) Math.toRadians(yy), rightMembrane3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -26.83627 + (((tickAnim - 0) / 1) * (-24.94005-(-26.83627)));
            yy = -3.03813 + (((tickAnim - 0) / 1) * (-4.30431-(-3.03813)));
            zz = -22.89482 + (((tickAnim - 0) / 1) * (-17.04614-(-22.89482)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -24.94005 + (((tickAnim - 1) / 3) * (-26.70337-(-24.94005)));
            yy = -4.30431 + (((tickAnim - 1) / 3) * (-13.37544-(-4.30431)));
            zz = -17.04614 + (((tickAnim - 1) / 3) * (-8.73707-(-17.04614)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -26.70337 + (((tickAnim - 4) / 3) * (-10.00039-(-26.70337)));
            yy = -13.37544 + (((tickAnim - 4) / 3) * (-13.19384-(-13.37544)));
            zz = -8.73707 + (((tickAnim - 4) / 3) * (-7.79733-(-8.73707)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -10.00039 + (((tickAnim - 7) / 1) * (-11.83991-(-10.00039)));
            yy = -13.19384 + (((tickAnim - 7) / 1) * (-12.28724-(-13.19384)));
            zz = -7.79733 + (((tickAnim - 7) / 1) * (-8.59816-(-7.79733)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.83991 + (((tickAnim - 8) / 2) * (-15.9626-(-11.83991)));
            yy = -12.28724 + (((tickAnim - 8) / 2) * (-10.53583-(-12.28724)));
            zz = -8.59816 + (((tickAnim - 8) / 2) * (-11.06903-(-8.59816)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -15.9626 + (((tickAnim - 10) / 1) * (-21.97771-(-15.9626)));
            yy = -10.53583 + (((tickAnim - 10) / 1) * (-9.309-(-10.53583)));
            zz = -11.06903 + (((tickAnim - 10) / 1) * (-17.5985-(-11.06903)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -21.97771 + (((tickAnim - 11) / 3) * (-26.83627-(-21.97771)));
            yy = -9.309 + (((tickAnim - 11) / 3) * (-3.03813-(-9.309)));
            zz = -17.5985 + (((tickAnim - 11) / 3) * (-22.89482-(-17.5985)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.15 + (((tickAnim - 0) / 7) * (-0.15105-(-0.15)));
            yy = -11.65 + (((tickAnim - 0) / 7) * (-11.65093-(-11.65)));
            zz = 9.93 + (((tickAnim - 0) / 7) * (9.93352-(9.93)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -0.15105 + (((tickAnim - 7) / 7) * (-0.15-(-0.15105)));
            yy = -11.65093 + (((tickAnim - 7) / 7) * (-11.65-(-11.65093)));
            zz = 9.93352 + (((tickAnim - 7) / 7) * (9.93-(9.93352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegUpperMembrane1, rightLegUpperMembrane1.rotateAngleX + (float) Math.toRadians(xx), rightLegUpperMembrane1.rotateAngleY + (float) Math.toRadians(yy), rightLegUpperMembrane1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1.85721 + (((tickAnim - 0) / 7) * (-27.5-(1.85721)));
            yy = -1.59055 + (((tickAnim - 0) / 7) * (0-(-1.59055)));
            zz = 0.48352 + (((tickAnim - 0) / 7) * (0-(0.48352)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -27.5 + (((tickAnim - 7) / 7) * (1.85721-(-27.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (-1.59055-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0.48352-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.50368 + (((tickAnim - 0) / 2) * (30.12561-(1.50368)));
            yy = -1.63194 + (((tickAnim - 0) / 2) * (-48.51153-(-1.63194)));
            zz = -2.21249 + (((tickAnim - 0) / 2) * (-34.45906-(-2.21249)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 30.12561 + (((tickAnim - 2) / 5) * (8.86472-(30.12561)));
            yy = -48.51153 + (((tickAnim - 2) / 5) * (4.03799-(-48.51153)));
            zz = -34.45906 + (((tickAnim - 2) / 5) * (7.40825-(-34.45906)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 8.86472 + (((tickAnim - 7) / 3) * (14.76747-(8.86472)));
            yy = 4.03799 + (((tickAnim - 7) / 3) * (2.76491-(4.03799)));
            zz = 7.40825 + (((tickAnim - 7) / 3) * (5.80947-(7.40825)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 14.76747 + (((tickAnim - 10) / 1) * (9.8231-(14.76747)));
            yy = 2.76491 + (((tickAnim - 10) / 1) * (3.515-(2.76491)));
            zz = 5.80947 + (((tickAnim - 10) / 1) * (6.73161-(5.80947)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 9.8231 + (((tickAnim - 11) / 3) * (1.50368-(9.8231)));
            yy = 3.515 + (((tickAnim - 11) / 3) * (-1.63194-(3.515)));
            zz = 6.73161 + (((tickAnim - 11) / 3) * (-2.21249-(6.73161)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegfoot, rightLegfoot.rotateAngleX + (float) Math.toRadians(xx), rightLegfoot.rotateAngleY + (float) Math.toRadians(yy), rightLegfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30*6))*5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30*3))*5));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
