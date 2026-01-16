package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOzimek;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelOzimek extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer rightFrontMembrane;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftFrontMembrane;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightMembrane1;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer rightMembrane2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer rightMembrane3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer leftMembrane1;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer leftMembrane2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer leftMembrane3;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer rightLegUpperMembrane1;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer rightLegMembrane2;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer rightLegfoot;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer leftLegUpperMembrane1;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer leftLegMembrane2;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer leftLegfoot;
    private final AdvancedModelRenderer cube_r57;

    private ModelAnimator animator;

    public ModelOzimek() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.4632F, 20.5282F, 5.7437F);
        this.setRotateAngle(root, 0.0436F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 0, 30, -1.4632F, -0.7807F, -0.0071F, 2, 2, 5, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.9632F, -0.2615F, -0.5079F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 37, -1.0F, 0.85F, -1.5F, 3, 1, 4, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 21, -1.0F, -0.65F, -1.5F, 3, 2, 4, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.4632F, 0.2989F, -1.5761F);
        this.root.addChild(body);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.05F, -4.25F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.0F, -1.6F, -2.5F, 3, 3, 7, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.2F, -6.4F);
        this.body.addChild(chest);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.709F, -1.4219F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1658F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 15, -2.0F, -0.6F, -1.2F, 3, 2, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.4193F, -1.1397F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 20, -2.0F, -0.9F, -1.375F, 3, 2, 3, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.1917F, 1.1428F, -1.5227F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.2495F, -0.7195F, 0.871F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.2F, 0.0F, 2.0F);
        this.rightArm1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 46, -2.7F, 0.475F, -2.075F, 1, 1, 4, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0066F, 1.249F, 3.7059F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7854F, 0.0F, 0.1745F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0066F, 0.3555F, 0.1891F);
        this.rightArm2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.0036F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 40, -0.5F, -0.15F, -0.525F, 1, 1, 5, -0.01F, false));

        this.rightArmHand = new AdvancedModelRenderer(this);
        this.rightArmHand.setRotationPoint(-0.2389F, 4.2043F, 1.9453F);
        this.rightArm2.addChild(rightArmHand);
        this.setRotateAngle(rightArmHand, -0.3541F, -0.2782F, -0.8542F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.3F, 0.1F, -0.25F);
        this.rightArmHand.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.0042F, 0.168F, 0.1436F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 21, -0.7028F, -1.8162F, -0.0466F, 2, 2, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 19, -0.7028F, -1.8162F, -0.0716F, 2, 2, 0, 0.0F, false));

        this.rightArmMembrane = new AdvancedModelRenderer(this);
        this.rightArmMembrane.setRotationPoint(-0.25F, 2.025F, 2.8F);
        this.rightArm1.addChild(rightArmMembrane);
        this.setRotateAngle(rightArmMembrane, 0.5157F, 0.2606F, 0.8292F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.225F, -1.4F, 0.1F);
        this.rightArmMembrane.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 49, -2.6F, -0.525F, -3.575F, 0, 2, 4, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 48, -2.625F, -0.525F, -3.575F, 0, 2, 4, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.1917F, 1.1428F, -1.5227F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.2495F, 0.7195F, -0.871F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.2F, 0.0F, 2.0F);
        this.leftArm1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 46, 1.7F, 0.475F, -2.075F, 1, 1, 4, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.0066F, 1.249F, 3.7059F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7854F, 0.0F, -0.1745F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0066F, 0.3555F, 0.1891F);
        this.leftArm2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.0036F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 40, -0.5F, -0.15F, -0.525F, 1, 1, 5, -0.01F, true));

        this.leftArmHand = new AdvancedModelRenderer(this);
        this.leftArmHand.setRotationPoint(0.2389F, 4.2043F, 1.9453F);
        this.leftArm2.addChild(leftArmHand);
        this.setRotateAngle(leftArmHand, -0.3541F, 0.2782F, 0.8542F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.3F, 0.1F, -0.25F);
        this.leftArmHand.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.0042F, -0.168F, -0.1436F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 21, -1.2972F, -1.8162F, -0.0466F, 2, 2, 0, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 19, -1.2972F, -1.8162F, -0.0716F, 2, 2, 0, 0.0F, true));

        this.leftArmMembrane = new AdvancedModelRenderer(this);
        this.leftArmMembrane.setRotationPoint(0.25F, 2.025F, 2.8F);
        this.leftArm1.addChild(leftArmMembrane);
        this.setRotateAngle(leftArmMembrane, 0.5157F, -0.2606F, -0.8292F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.225F, -1.4F, 0.1F);
        this.leftArmMembrane.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 49, 2.6F, -0.525F, -3.575F, 0, 2, 4, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 48, 2.625F, -0.525F, -3.575F, 0, 2, 4, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.43F, -2.4728F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.1745F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.8891F, 0.4259F);
        this.neck1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3752F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 0, -1.0F, 0.1326F, -5.4868F, 2, 1, 5, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.8141F, 0.4259F);
        this.neck1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3229F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 8, -1.0F, -0.7924F, -5.4868F, 2, 1, 5, 0.0F, false));

        this.rightFrontMembrane = new AdvancedModelRenderer(this);
        this.rightFrontMembrane.setRotationPoint(-0.9585F, 0.4746F, -2.5081F);
        this.neck1.addChild(rightFrontMembrane);
        this.setRotateAngle(rightFrontMembrane, -0.2217F, -0.1037F, -0.5125F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.2055F, 0.7961F, 0.2668F);
        this.rightFrontMembrane.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0716F, -0.9151F, 0.0568F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 51, -0.4F, -0.75F, -0.3F, 2, 0, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.2055F, 0.7711F, 0.2668F);
        this.rightFrontMembrane.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0716F, -0.9151F, 0.0568F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 50, 3, -0.4F, -0.75F, -0.3F, 2, 0, 3, 0.0F, false));

        this.leftFrontMembrane = new AdvancedModelRenderer(this);
        this.leftFrontMembrane.setRotationPoint(0.9585F, 0.4746F, -2.5081F);
        this.neck1.addChild(leftFrontMembrane);
        this.setRotateAngle(leftFrontMembrane, -0.2217F, 0.1037F, 0.5125F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.2055F, 0.7961F, 0.2668F);
        this.leftFrontMembrane.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0716F, 0.9151F, -0.0568F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 51, -1.6F, -0.75F, -0.3F, 2, 0, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.2055F, 0.7711F, 0.2668F);
        this.leftFrontMembrane.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0716F, 0.9151F, -0.0568F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 3, -1.6F, -0.75F, -0.3F, 2, 0, 3, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.8359F, -4.5742F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.5672F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 46, 11, -1.0F, -0.075F, -4.0F, 2, 1, 4, -0.025F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.075F, -1.0F);
        this.neck2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 6, -1.0F, -2.0F, -3.0F, 2, 1, 4, -0.01F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.5856F, -3.889F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.6981F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.2684F, 0.3559F);
        this.neck3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.6109F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 29, -1.0F, 0.74F, -4.416F, 2, 2, 5, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.2692F, -3.5633F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 46, 16, -1.5F, -0.8133F, -1.774F, 3, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 51, -1.5F, -0.1633F, -1.774F, 3, 1, 2, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 46, -0.5F, -0.2033F, -4.3478F, 1, 1, 4, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 44, 25, -1.6F, -0.4133F, -2.274F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 6, -1.5F, -0.8118F, -2.0999F, 3, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 44, 25, 0.6F, -0.4133F, -2.274F, 1, 1, 1, 0.01F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.57F, 0.4102F, -1.5809F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.3403F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 51, -1.0804F, -0.6085F, -2.937F, 1, 1, 3, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.75F, -0.8118F, -1.8999F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2923F, 0.3491F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 55, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.57F, 0.4102F, -1.5809F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.3403F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 51, 0.0804F, -0.6085F, -2.937F, 1, 1, 3, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.75F, -0.8118F, -1.8999F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2923F, -0.3491F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 55, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.8118F, -2.0999F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3054F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 55, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7867F, 0.226F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 46, 36, -0.5F, -1.05F, -1.4485F, 1, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 46, -0.5F, -0.4679F, -4.5485F, 1, 1, 4, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 50, 0, -1.5F, -0.45F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.4893F, 0.1485F, -1.6605F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.3054F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 42, 51, -1.1004F, -0.6185F, -2.937F, 1, 1, 3, -0.01F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.4893F, 0.1485F, -1.6605F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.3054F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 42, 51, 0.1003F, -0.6185F, -2.937F, 1, 1, 3, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.3903F, -1.8042F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0349F, 0.0F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.6597F, 0.8042F);
        this.throat.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 54, -1.5F, -1.4F, -1.0F, 2, 1, 2, -0.025F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 0.3896F, 1.8303F);
        this.throat.addChild(throat2);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.004F, -0.0074F);
        this.throat2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0698F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 54, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.rightMembrane1 = new AdvancedModelRenderer(this);
        this.rightMembrane1.setRotationPoint(-1.3282F, -0.7816F, -4.7065F);
        this.body.addChild(rightMembrane1);
        this.setRotateAngle(rightMembrane1, -0.0062F, 0.2411F, 0.1708F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.3282F, 0.7066F, 0.1065F);
        this.rightMembrane1.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0601F, -0.5316F, 0.0384F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 30, 36, -1.7F, -0.775F, 0.0F, 3, 0, 4, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.3282F, 0.6816F, 0.1065F);
        this.rightMembrane1.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0601F, -0.5316F, 0.0384F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 14, 36, -1.7F, -0.775F, 0.0F, 3, 0, 4, 0.0F, false));

        this.rightMembrane2 = new AdvancedModelRenderer(this);
        this.rightMembrane2.setRotationPoint(0.6637F, 0.2527F, 5.7875F);
        this.rightMembrane1.addChild(rightMembrane2);
        this.setRotateAngle(rightMembrane2, -0.0063F, -0.4321F, 0.0729F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.025F, 0.0F);
        this.rightMembrane2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0716F, -0.9151F, 0.0568F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 12, 46, -4.0F, 0.0F, -0.5F, 4, 0, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightMembrane2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0716F, -0.9151F, 0.0568F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 42, 33, -4.0F, 0.0F, -0.5F, 4, 0, 3, 0.0F, false));

        this.rightMembrane3 = new AdvancedModelRenderer(this);
        this.rightMembrane3.setRotationPoint(-3.0976F, 0.0105F, -0.2607F);
        this.rightMembrane2.addChild(rightMembrane3);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 0.025F, 0.5F);
        this.rightMembrane3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0716F, -0.9151F, 0.0568F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 30, 27, -2.0F, -0.025F, -0.75F, 3, 0, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.rightMembrane3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0716F, -0.9151F, 0.0568F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 20, 8, -2.0F, -0.025F, -0.75F, 3, 0, 2, 0.0F, false));

        this.leftMembrane1 = new AdvancedModelRenderer(this);
        this.leftMembrane1.setRotationPoint(1.3282F, -0.7816F, -4.7065F);
        this.body.addChild(leftMembrane1);
        this.setRotateAngle(leftMembrane1, -0.0062F, -0.2411F, -0.1708F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.3282F, 0.7066F, 0.1065F);
        this.leftMembrane1.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0601F, 0.5316F, -0.0384F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 30, 36, -1.3F, -0.775F, 0.0F, 3, 0, 4, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.3282F, 0.6816F, 0.1065F);
        this.leftMembrane1.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0601F, 0.5316F, -0.0384F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 14, 36, -1.3F, -0.775F, 0.0F, 3, 0, 4, 0.0F, true));

        this.leftMembrane2 = new AdvancedModelRenderer(this);
        this.leftMembrane2.setRotationPoint(-0.6637F, 0.2527F, 5.7875F);
        this.leftMembrane1.addChild(leftMembrane2);
        this.setRotateAngle(leftMembrane2, -0.0063F, 0.4321F, -0.0729F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.025F, 0.0F);
        this.leftMembrane2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0716F, 0.9151F, -0.0568F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 12, 46, 0.0F, 0.0F, -0.5F, 4, 0, 3, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftMembrane2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0716F, 0.9151F, -0.0568F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 42, 33, 0.0F, 0.0F, -0.5F, 4, 0, 3, 0.0F, true));

        this.leftMembrane3 = new AdvancedModelRenderer(this);
        this.leftMembrane3.setRotationPoint(3.0976F, 0.0105F, -0.2607F);
        this.leftMembrane2.addChild(leftMembrane3);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, 0.025F, 0.5F);
        this.leftMembrane3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0716F, 0.9151F, -0.0568F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 30, 27, -1.0F, -0.025F, -0.75F, 3, 0, 2, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.leftMembrane3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0716F, 0.9151F, -0.0568F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 20, 8, -1.0F, -0.025F, -0.75F, 3, 0, 2, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(-0.4632F, -0.4308F, 4.9863F);
        this.root.addChild(tail1);
        this.setRotateAngle(tail1, -0.1614F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 14, 40, -0.5F, -0.2F, -0.25F, 1, 1, 5, 0.01F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 26, 40, -0.5F, 0.3F, -0.25F, 1, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0272F, 4.5726F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0656F, -0.001F, -0.0011F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0611F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 14, 29, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4152F, 5.8256F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);


        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0048F, 0.2573F, 0.206F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.0F, 0.1561F, 2.7748F);
        this.tail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0087F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 20, 0, -1.5F, -0.575F, -3.0F, 1, 1, 7, -0.02F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0941F, 6.7256F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 14, 21, -0.5F, -0.5267F, -0.0679F, 1, 1, 7, -0.03F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.7611F, 0.347F, 0.1415F);
        this.root.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.4279F, 0.7503F, 1.441F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.025F, -0.1541F, 0.1291F);
        this.rightLeg1.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.9599F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 50, 36, -0.4F, -4.95F, 0.6F, 0, 5, 3, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 8, 49, -0.425F, -4.95F, 0.6F, 0, 5, 3, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 42, 27, -0.525F, -0.95F, -0.4F, 1, 1, 5, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 42, -0.525F, -0.45F, -0.4F, 1, 1, 5, 0.01F, false));

        this.rightLegUpperMembrane1 = new AdvancedModelRenderer(this);
        this.rightLegUpperMembrane1.setRotationPoint(-0.4F, -1.0679F, 2.4802F);
        this.rightLeg1.addChild(rightLegUpperMembrane1);
        this.setRotateAngle(rightLegUpperMembrane1, -0.0044F, 0.0087F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.025F, 0.0F, 0.0F);
        this.rightLegUpperMembrane1.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -1.0257F, 0.2909F, -0.4418F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 54, 25, 0.0F, -1.5F, -2.0F, 0, 4, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLegUpperMembrane1.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -1.0257F, 0.2909F, -0.4418F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 22, 54, 0.0F, -1.5F, -2.0F, 0, 4, 2, 0.0F, false));

        this.rightLegMembrane2 = new AdvancedModelRenderer(this);
        this.rightLegMembrane2.setRotationPoint(-1.0F, -3.4263F, 1.8736F);
        this.rightLegUpperMembrane1.addChild(rightLegMembrane2);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.025F, 3.4263F, -1.8736F);
        this.rightLegMembrane2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -1.0257F, 0.2909F, -0.4418F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 48, 55, 0.0F, -0.5F, -4.0F, 0, 3, 2, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(1.0F, 3.4263F, -1.8736F);
        this.rightLegMembrane2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -1.0257F, 0.2909F, -0.4418F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 38, 54, 0.0F, -0.5F, -4.0F, 0, 3, 2, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.0162F, 3.8342F, 2.6814F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5683F, -0.0069F, 0.0142F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.036F, 0.3165F, 0.7231F);
        this.rightLeg2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.2182F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 19, -0.4196F, -5.2553F, 0.0171F, 0, 4, 7, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 18, 10, -0.4446F, -5.2553F, 0.0171F, 0, 4, 7, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 10, -0.5196F, -1.2553F, -0.6579F, 1, 1, 8, 0.0F, false));

        this.rightLegfoot = new AdvancedModelRenderer(this);
        this.rightLegfoot.setRotationPoint(0.0912F, -2.4104F, 7.4176F);
        this.rightLeg2.addChild(rightLegfoot);
        this.setRotateAngle(rightLegfoot, 0.6641F, 0.5126F, 0.7025F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.0054F, 2.6891F, -8.6398F);
        this.rightLegfoot.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.2182F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 26, 58, -1.4946F, -1.2553F, 9.0421F, 3, 4, 0, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 26, 54, -1.4946F, -1.2553F, 9.0171F, 3, 4, 0, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.8348F, 0.347F, 0.1415F);
        this.root.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.4279F, -0.7503F, -1.441F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.025F, -0.1541F, 0.1291F);
        this.leftLeg1.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.9599F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 50, 36, 0.4F, -4.95F, 0.6F, 0, 5, 3, 0.0F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 8, 49, 0.425F, -4.95F, 0.6F, 0, 5, 3, 0.0F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 42, 27, -0.475F, -0.95F, -0.4F, 1, 1, 5, 0.0F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 42, -0.475F, -0.45F, -0.4F, 1, 1, 5, 0.01F, true));

        this.leftLegUpperMembrane1 = new AdvancedModelRenderer(this);
        this.leftLegUpperMembrane1.setRotationPoint(0.4F, -1.0679F, 2.4802F);
        this.leftLeg1.addChild(leftLegUpperMembrane1);
        this.setRotateAngle(leftLegUpperMembrane1, -0.0044F, -0.0087F, 0.0F);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.025F, 0.0F, 0.0F);
        this.leftLegUpperMembrane1.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -1.0257F, -0.2909F, 0.4418F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 54, 25, 0.0F, -1.5F, -2.0F, 0, 4, 2, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLegUpperMembrane1.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -1.0257F, -0.2909F, 0.4418F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 22, 54, 0.0F, -1.5F, -2.0F, 0, 4, 2, 0.0F, true));

        this.leftLegMembrane2 = new AdvancedModelRenderer(this);
        this.leftLegMembrane2.setRotationPoint(1.0F, -3.4263F, 1.8736F);
        this.leftLegUpperMembrane1.addChild(leftLegMembrane2);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.025F, 3.4263F, -1.8736F);
        this.leftLegMembrane2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -1.0257F, -0.2909F, 0.4418F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 48, 55, 0.0F, -0.5F, -4.0F, 0, 3, 2, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-1.0F, 3.4263F, -1.8736F);
        this.leftLegMembrane2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -1.0257F, -0.2909F, 0.4418F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 38, 54, 0.0F, -0.5F, -4.0F, 0, 3, 2, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0162F, 3.8342F, 2.6814F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5683F, 0.0069F, -0.0142F);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.036F, 0.3165F, 0.7231F);
        this.leftLeg2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.2182F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 19, 0.4196F, -5.2553F, 0.0171F, 0, 4, 7, 0.0F, true));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 18, 10, 0.4446F, -5.2553F, 0.0171F, 0, 4, 7, 0.0F, true));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 10, -0.4804F, -1.2553F, -0.6579F, 1, 1, 8, 0.0F, true));

        this.leftLegfoot = new AdvancedModelRenderer(this);
        this.leftLegfoot.setRotationPoint(-0.0912F, -2.4104F, 7.4176F);
        this.leftLeg2.addChild(leftLegfoot);
        this.setRotateAngle(leftLegfoot, 0.6641F, -0.5126F, -0.7025F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0054F, 2.6891F, -8.6398F);
        this.leftLegfoot.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.2182F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 26, 58, -1.5054F, -1.2553F, 9.0421F, 3, 4, 0, 0.0F, true));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 26, 54, -1.5054F, -1.2553F, 9.0171F, 3, 4, 0, 0.0F, true));

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

        EntityPrehistoricFloraOzimek ee = (EntityPrehistoricFloraOzimek) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};

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
        EntityPrehistoricFloraOzimek ee = (EntityPrehistoricFloraOzimek) entitylivingbaseIn;

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

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOzimek entity = (EntityPrehistoricFloraOzimek) entitylivingbaseIn;
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




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 25 + (((tickAnim - 2) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (20-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 25.25 + (((tickAnim - 3) / 3) * (0-(25.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 6) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (10.75-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 29) {
            xx = 10.75 + (((tickAnim - 4) / 25) * (0-(10.75)));
            yy = 0 + (((tickAnim - 4) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOzimek entity = (EntityPrehistoricFloraOzimek) entitylivingbaseIn;
        int animCycle = 72;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*3))*2), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100-60))*9), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2))*10));
        this.root.rotationPointX = this.root.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100-60*2))*3);
        this.root.rotationPointY = this.root.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100))*3);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-28.48495), rightArm1.rotateAngleY + (float) Math.toRadians(39.2451545051+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+160))*5), rightArm1.rotateAngleZ + (float) Math.toRadians(37.5129877679+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+160))*5));


        this.setRotateAngle(rightArmHand, rightArmHand.rotateAngleX + (float) Math.toRadians(-18.06753), rightArmHand.rotateAngleY + (float) Math.toRadians(15.01971), rightArmHand.rotateAngleZ + (float) Math.toRadians(-61.08059));


        this.setRotateAngle(rightArmMembrane, rightArmMembrane.rotateAngleX + (float) Math.toRadians(-7.90999), rightArmMembrane.rotateAngleY + (float) Math.toRadians(-6.26661), rightArmMembrane.rotateAngleZ + (float) Math.toRadians(-35.8821));
        this.rightArmMembrane.rotationPointX = this.rightArmMembrane.rotationPointX + (float)(0.3);
        this.rightArmMembrane.rotationPointY = this.rightArmMembrane.rotationPointY - (float)(-0.25);
        this.rightArmMembrane.rotationPointZ = this.rightArmMembrane.rotationPointZ + (float)(0.55);


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100-50))*2), neck1.rotateAngleZ + (float) Math.toRadians(0));



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



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-12), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100-200))*15), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(7.5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightMembrane1, rightMembrane1.rotateAngleX + (float) Math.toRadians(-0.96587), rightMembrane1.rotateAngleY + (float) Math.toRadians(-12.21108), rightMembrane1.rotateAngleZ + (float) Math.toRadians(-8.9168+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*6))*-2));


        this.setRotateAngle(rightMembrane2, rightMembrane2.rotateAngleX + (float) Math.toRadians(-1.08465), rightMembrane2.rotateAngleY + (float) Math.toRadians(26.53742), rightMembrane2.rotateAngleZ + (float) Math.toRadians(-5.53798));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*6))*2), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+90))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(12.5), tail2.rotateAngleY + (float) Math.toRadians(0.0155), tail2.rotateAngleZ + (float) Math.toRadians(-0.01109));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*6))*2), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+90))*5), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(35.74136), rightLeg1.rotateAngleY + (float) Math.toRadians(-38.3649+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*9+140))*-3), rightLeg1.rotateAngleZ + (float) Math.toRadians(10.95709));


        this.setRotateAngle(rightLegUpperMembrane1, rightLegUpperMembrane1.rotateAngleX + (float) Math.toRadians(-3.26822), rightLegUpperMembrane1.rotateAngleY + (float) Math.toRadians(-17.17125), rightLegUpperMembrane1.rotateAngleZ + (float) Math.toRadians(24.31549));


        this.setRotateAngle(rightLegMembrane2, rightLegMembrane2.rotateAngleX + (float) Math.toRadians(18.41778), rightLegMembrane2.rotateAngleY + (float) Math.toRadians(-4.73327), rightLegMembrane2.rotateAngleZ + (float) Math.toRadians(-9.76233));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-39.40878), rightLeg2.rotateAngleY + (float) Math.toRadians(-1.54134), rightLeg2.rotateAngleZ + (float) Math.toRadians(0.83678));
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0.075);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(rightLegfoot, rightLegfoot.rotateAngleX + (float) Math.toRadians(24.78624), rightLegfoot.rotateAngleY + (float) Math.toRadians(-21.96648), rightLegfoot.rotateAngleZ + (float) Math.toRadians(2.48406));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(7.75), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-28.48495), leftArm1.rotateAngleY + (float) Math.toRadians(-39.2452+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+160))*5), leftArm1.rotateAngleZ + (float) Math.toRadians(-37.513+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*2+160))*5));


        this.setRotateAngle(leftArmHand, leftArmHand.rotateAngleX + (float) Math.toRadians(-18.06753), leftArmHand.rotateAngleY + (float) Math.toRadians(-15.01971), leftArmHand.rotateAngleZ + (float) Math.toRadians(61.08059));


        this.setRotateAngle(leftArmMembrane, leftArmMembrane.rotateAngleX + (float) Math.toRadians(-7.90999), leftArmMembrane.rotateAngleY + (float) Math.toRadians(6.26661), leftArmMembrane.rotateAngleZ + (float) Math.toRadians(35.8821));
        this.leftArmMembrane.rotationPointX = this.leftArmMembrane.rotationPointX + (float)(-0.3);
        this.leftArmMembrane.rotationPointY = this.leftArmMembrane.rotationPointY - (float)(-0.25);
        this.leftArmMembrane.rotationPointZ = this.leftArmMembrane.rotationPointZ + (float)(0.55);



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



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(15.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100-100))*-8), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-5.25), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100-150))*-10), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftMembrane1, leftMembrane1.rotateAngleX + (float) Math.toRadians(-0.96587), leftMembrane1.rotateAngleY + (float) Math.toRadians(12.21108), leftMembrane1.rotateAngleZ + (float) Math.toRadians(8.9168+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*6))*2));


        this.setRotateAngle(leftMembrane2, leftMembrane2.rotateAngleX + (float) Math.toRadians(-1.08465), leftMembrane2.rotateAngleY + (float) Math.toRadians(-26.53742), leftMembrane2.rotateAngleZ + (float) Math.toRadians(5.53798));


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(35.74136), leftLeg1.rotateAngleY + (float) Math.toRadians(38.3649+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150*9+140))*3), leftLeg1.rotateAngleZ + (float) Math.toRadians(-10.95709));


        this.setRotateAngle(leftLegUpperMembrane1, leftLegUpperMembrane1.rotateAngleX + (float) Math.toRadians(-3.26822), leftLegUpperMembrane1.rotateAngleY + (float) Math.toRadians(17.17125), leftLegUpperMembrane1.rotateAngleZ + (float) Math.toRadians(-24.31549));


        this.setRotateAngle(leftLegMembrane2, leftLegMembrane2.rotateAngleX + (float) Math.toRadians(18.41778), leftLegMembrane2.rotateAngleY + (float) Math.toRadians(4.73327), leftLegMembrane2.rotateAngleZ + (float) Math.toRadians(9.76233));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-39.40878), leftLeg2.rotateAngleY + (float) Math.toRadians(1.54134), leftLeg2.rotateAngleZ + (float) Math.toRadians(-0.83678));
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0.075);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(leftLegfoot, leftLegfoot.rotateAngleX + (float) Math.toRadians(24.78624), leftLegfoot.rotateAngleY + (float) Math.toRadians(21.96648), leftLegfoot.rotateAngleZ + (float) Math.toRadians(-2.48406));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOzimek entity = (EntityPrehistoricFloraOzimek) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -8.83104 + (((tickAnim - 0) / 2) * (-16.0462-(-8.83104)));
            yy = 14.56495 + (((tickAnim - 0) / 2) * (6.4426-(14.56495)));
            zz = 6.30871 + (((tickAnim - 0) / 2) * (-7.77689-(6.30871)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -16.0462 + (((tickAnim - 2) / 5) * (-18.26245-(-16.0462)));
            yy = 6.4426 + (((tickAnim - 2) / 5) * (7.16229-(6.4426)));
            zz = -7.77689 + (((tickAnim - 2) / 5) * (-6.66735-(-7.77689)));
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
            xx = -21.98539 + (((tickAnim - 11) / 3) * (-8.83104-(-21.98539)));
            yy = 1.78726 + (((tickAnim - 11) / 3) * (14.56495-(1.78726)));
            zz = -29.86587 + (((tickAnim - 11) / 3) * (6.30871-(-29.86587)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmMembrane, rightArmMembrane.rotateAngleX + (float) Math.toRadians(xx), rightArmMembrane.rotateAngleY + (float) Math.toRadians(yy), rightArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.325 + (((tickAnim - 0) / 2) * (-0.25-(-0.325)));
            yy = -0.775 + (((tickAnim - 0) / 2) * (-0.8-(-0.775)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.025-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -0.25 + (((tickAnim - 2) / 5) * (0-(-0.25)));
            yy = -0.8 + (((tickAnim - 2) / 5) * (0-(-0.8)));
            zz = 0.025 + (((tickAnim - 2) / 5) * (-0.675-(0.025)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0.15-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.15-(0)));
            zz = -0.675 + (((tickAnim - 7) / 2) * (-0.365-(-0.675)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0.15 + (((tickAnim - 9) / 2) * (0-(0.15)));
            yy = -0.15 + (((tickAnim - 9) / 2) * (-0.725-(-0.15)));
            zz = -0.365 + (((tickAnim - 9) / 2) * (0-(-0.365)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (-0.325-(0)));
            yy = -0.725 + (((tickAnim - 11) / 3) * (-0.775-(-0.725)));
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



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503))*6), neck1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13.43922 + (((tickAnim - 0) / 5) * (-4.59908-(-13.43922)));
            yy = 38.99083 + (((tickAnim - 0) / 5) * (20.70451-(38.99083)));
            zz = -5.84731 + (((tickAnim - 0) / 5) * (26.34447-(-5.84731)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.59908 + (((tickAnim - 5) / 2) * (-11.57393-(-4.59908)));
            yy = 20.70451 + (((tickAnim - 5) / 2) * (13.41484-(20.70451)));
            zz = 26.34447 + (((tickAnim - 5) / 2) * (8.29057-(26.34447)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -11.57393 + (((tickAnim - 7) / 2) * (-5.78991-(-11.57393)));
            yy = 13.41484 + (((tickAnim - 7) / 2) * (12.20773-(13.41484)));
            zz = 8.29057 + (((tickAnim - 7) / 2) * (29.25728-(8.29057)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -5.78991 + (((tickAnim - 9) / 2) * (-8.30604-(-5.78991)));
            yy = 12.20773 + (((tickAnim - 9) / 2) * (15.76951-(12.20773)));
            zz = 29.25728 + (((tickAnim - 9) / 2) * (17.40182-(29.25728)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -8.30604 + (((tickAnim - 11) / 3) * (-13.43922-(-8.30604)));
            yy = 15.76951 + (((tickAnim - 11) / 3) * (38.99083-(15.76951)));
            zz = 17.40182 + (((tickAnim - 11) / 3) * (-5.84731-(17.40182)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontMembrane, rightFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), rightFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), rightFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-1), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+30))*3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+30))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30))*8), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-90))*8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-90))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-150))*5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-150))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-190))*12), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-190))*5));



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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.03437 + (((tickAnim - 0) / 3) * (-10.43808-(-7.03437)));
            yy = 6.19509 + (((tickAnim - 0) / 3) * (-1.85049-(6.19509)));
            zz = -22.19579 + (((tickAnim - 0) / 3) * (-11.74308-(-22.19579)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -10.43808 + (((tickAnim - 3) / 1) * (-12.98271-(-10.43808)));
            yy = -1.85049 + (((tickAnim - 3) / 1) * (-6.7448-(-1.85049)));
            zz = -11.74308 + (((tickAnim - 3) / 1) * (-16.57693-(-11.74308)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -12.98271 + (((tickAnim - 4) / 3) * (-13.45362-(-12.98271)));
            yy = -6.7448 + (((tickAnim - 4) / 3) * (-14.6854-(-6.7448)));
            zz = -16.57693 + (((tickAnim - 4) / 3) * (-5.42818-(-16.57693)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -13.45362 + (((tickAnim - 7) / 7) * (-7.03437-(-13.45362)));
            yy = -14.6854 + (((tickAnim - 7) / 7) * (6.19509-(-14.6854)));
            zz = -5.42818 + (((tickAnim - 7) / 7) * (-22.19579-(-5.42818)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane2, rightMembrane2.rotateAngleX + (float) Math.toRadians(xx), rightMembrane2.rotateAngleY + (float) Math.toRadians(yy), rightMembrane2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.925 + (((tickAnim - 0) / 7) * (-0.93-(-0.925)));
            yy = -0.05 + (((tickAnim - 0) / 7) * (-0.3-(-0.05)));
            zz = 0.525 + (((tickAnim - 0) / 7) * (0.53-(0.525)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -0.93 + (((tickAnim - 7) / 7) * (-0.925-(-0.93)));
            yy = -0.3 + (((tickAnim - 7) / 7) * (-0.05-(-0.3)));
            zz = 0.53 + (((tickAnim - 7) / 7) * (0.525-(0.53)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMembrane2.rotationPointX = this.rightMembrane2.rotationPointX + (float)(xx);
        this.rightMembrane2.rotationPointY = this.rightMembrane2.rotationPointY - (float)(yy);
        this.rightMembrane2.rotationPointZ = this.rightMembrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24.70741 + (((tickAnim - 0) / 3) * (14.33967-(24.70741)));
            yy = -22.0334 + (((tickAnim - 0) / 3) * (-27.76164-(-22.0334)));
            zz = 1.21444 + (((tickAnim - 0) / 3) * (24.27419-(1.21444)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 14.33967 + (((tickAnim - 3) / 4) * (-10.00039-(14.33967)));
            yy = -27.76164 + (((tickAnim - 3) / 4) * (-13.19384-(-27.76164)));
            zz = 24.27419 + (((tickAnim - 3) / 4) * (-7.79733-(24.27419)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -10.00039 + (((tickAnim - 7) / 7) * (24.70741-(-10.00039)));
            yy = -13.19384 + (((tickAnim - 7) / 7) * (-22.0334-(-13.19384)));
            zz = -7.79733 + (((tickAnim - 7) / 7) * (1.21444-(-7.79733)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.625 + (((tickAnim - 0) / 7) * (0-(-0.625)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (-0.625-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.83344 + (((tickAnim - 0) / 3) * (-10.94676-(1.83344)));
            yy = -2.01436 + (((tickAnim - 0) / 3) * (2.17341-(-2.01436)));
            zz = 1.10276 + (((tickAnim - 0) / 3) * (0.66651-(1.10276)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -10.94676 + (((tickAnim - 3) / 4) * (-27.53054-(-10.94676)));
            yy = 2.17341 + (((tickAnim - 3) / 4) * (-0.28598-(2.17341)));
            zz = 0.66651 + (((tickAnim - 3) / 4) * (3.23754-(0.66651)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -27.53054 + (((tickAnim - 7) / 7) * (1.83344-(-27.53054)));
            yy = -0.28598 + (((tickAnim - 7) / 7) * (-2.01436-(-0.28598)));
            zz = 3.23754 + (((tickAnim - 7) / 7) * (1.10276-(3.23754)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 28.07709 + (((tickAnim - 0) / 2) * (58.08579-(28.07709)));
            yy = 16.22192 + (((tickAnim - 0) / 2) * (13.01225-(16.22192)));
            zz = 18.04112 + (((tickAnim - 0) / 2) * (-21.87413-(18.04112)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 58.08579 + (((tickAnim - 2) / 5) * (8.86472-(58.08579)));
            yy = 13.01225 + (((tickAnim - 2) / 5) * (4.03799-(13.01225)));
            zz = -21.87413 + (((tickAnim - 2) / 5) * (7.40825-(-21.87413)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 8.86472 + (((tickAnim - 7) / 2) * (-11.26768-(8.86472)));
            yy = 4.03799 + (((tickAnim - 7) / 2) * (29.02536-(4.03799)));
            zz = 7.40825 + (((tickAnim - 7) / 2) * (-19.60015-(7.40825)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -11.26768 + (((tickAnim - 9) / 1) * (-50.77902-(-11.26768)));
            yy = 29.02536 + (((tickAnim - 9) / 1) * (39.80563-(29.02536)));
            zz = -19.60015 + (((tickAnim - 9) / 1) * (-55.00504-(-19.60015)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -50.77902 + (((tickAnim - 10) / 4) * (28.07709-(-50.77902)));
            yy = 39.80563 + (((tickAnim - 10) / 4) * (16.22192-(39.80563)));
            zz = -55.00504 + (((tickAnim - 10) / 4) * (18.04112-(-55.00504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegfoot, rightLegfoot.rotateAngleX + (float) Math.toRadians(xx), rightLegfoot.rotateAngleY + (float) Math.toRadians(yy), rightLegfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (-0.575-(0)));
            yy = -0.3 + (((tickAnim - 2) / 5) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.575 + (((tickAnim - 7) / 2) * (-0.475-(-0.575)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.475 + (((tickAnim - 9) / 1) * (-0.025-(-0.475)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.025 + (((tickAnim - 10) / 4) * (0-(-0.025)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegfoot.rotationPointX = this.rightLegfoot.rotationPointX + (float)(xx);
        this.rightLegfoot.rotationPointY = this.rightLegfoot.rotationPointY - (float)(yy);
        this.rightLegfoot.rotationPointZ = this.rightLegfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30*6))*5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30*3))*5));



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
            xx = -21.98539 + (((tickAnim - 4) / 3) * (-8.83104-(-21.98539)));
            yy = -1.78726 + (((tickAnim - 4) / 3) * (-14.56495-(-1.78726)));
            zz = 29.86587 + (((tickAnim - 4) / 3) * (-6.30871-(29.86587)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -8.83104 + (((tickAnim - 7) / 7) * (-18.26245-(-8.83104)));
            yy = -14.56495 + (((tickAnim - 7) / 7) * (-7.16229-(-14.56495)));
            zz = -6.30871 + (((tickAnim - 7) / 7) * (6.66735-(-6.30871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmMembrane, leftArmMembrane.rotateAngleX + (float) Math.toRadians(xx), leftArmMembrane.rotateAngleY + (float) Math.toRadians(yy), leftArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.15-(0)));
            zz = -0.675 + (((tickAnim - 0) / 2) * (-0.365-(-0.675)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.15 + (((tickAnim - 2) / 2) * (0-(-0.15)));
            yy = -0.15 + (((tickAnim - 2) / 2) * (-0.725-(-0.15)));
            zz = -0.365 + (((tickAnim - 2) / 2) * (0-(-0.365)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0.325-(0)));
            yy = -0.725 + (((tickAnim - 4) / 3) * (-0.775-(-0.725)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.325 + (((tickAnim - 7) / 7) * (0-(0.325)));
            yy = -0.775 + (((tickAnim - 7) / 7) * (0-(-0.775)));
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




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.25 + (((tickAnim - 0) / 2) * (-0.02019-(-4.25)));
            yy = -10.25 + (((tickAnim - 0) / 2) * (-12.68399-(-10.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (-27.14517-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -0.02019 + (((tickAnim - 2) / 5) * (-23.11242-(-0.02019)));
            yy = -12.68399 + (((tickAnim - 2) / 5) * (-35.42274-(-12.68399)));
            zz = -27.14517 + (((tickAnim - 2) / 5) * (14.13334-(-27.14517)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -23.11242 + (((tickAnim - 7) / 4) * (-7.14352-(-23.11242)));
            yy = -35.42274 + (((tickAnim - 7) / 4) * (-21.24821-(-35.42274)));
            zz = 14.13334 + (((tickAnim - 7) / 4) * (-8.02193-(14.13334)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -7.14352 + (((tickAnim - 11) / 3) * (-4.25-(-7.14352)));
            yy = -21.24821 + (((tickAnim - 11) / 3) * (-10.25-(-21.24821)));
            zz = -8.02193 + (((tickAnim - 11) / 3) * (0-(-8.02193)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontMembrane, leftFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), leftFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), leftFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+180))*6), neck2.rotateAngleZ + (float) Math.toRadians(0));



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




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -13.45362 + (((tickAnim - 0) / 7) * (-7.03437-(-13.45362)));
            yy = 14.6854 + (((tickAnim - 0) / 7) * (-6.19509-(14.6854)));
            zz = 5.42818 + (((tickAnim - 0) / 7) * (22.19579-(5.42818)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -7.03437 + (((tickAnim - 7) / 3) * (-10.43808-(-7.03437)));
            yy = -6.19509 + (((tickAnim - 7) / 3) * (1.85049-(-6.19509)));
            zz = 22.19579 + (((tickAnim - 7) / 3) * (11.74308-(22.19579)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -10.43808 + (((tickAnim - 10) / 1) * (-12.98271-(-10.43808)));
            yy = 1.85049 + (((tickAnim - 10) / 1) * (6.7448-(1.85049)));
            zz = 11.74308 + (((tickAnim - 10) / 1) * (16.57693-(11.74308)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -12.98271 + (((tickAnim - 11) / 3) * (-13.45362-(-12.98271)));
            yy = 6.7448 + (((tickAnim - 11) / 3) * (14.6854-(6.7448)));
            zz = 16.57693 + (((tickAnim - 11) / 3) * (5.42818-(16.57693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane2, leftMembrane2.rotateAngleX + (float) Math.toRadians(xx), leftMembrane2.rotateAngleY + (float) Math.toRadians(yy), leftMembrane2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.93 + (((tickAnim - 0) / 7) * (0.925-(-0.93)));
            yy = -0.3 + (((tickAnim - 0) / 7) * (-0.05-(-0.3)));
            zz = 0.53 + (((tickAnim - 0) / 7) * (0.525-(0.53)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.925 + (((tickAnim - 7) / 7) * (-0.93-(0.925)));
            yy = -0.05 + (((tickAnim - 7) / 7) * (-0.3-(-0.05)));
            zz = 0.525 + (((tickAnim - 7) / 7) * (0.53-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftMembrane2.rotationPointX = this.leftMembrane2.rotationPointX + (float)(xx);
        this.leftMembrane2.rotationPointY = this.leftMembrane2.rotationPointY - (float)(yy);
        this.leftMembrane2.rotationPointZ = this.leftMembrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -10.00039 + (((tickAnim - 0) / 7) * (24.70741-(-10.00039)));
            yy = 13.19384 + (((tickAnim - 0) / 7) * (22.0334-(13.19384)));
            zz = 7.79733 + (((tickAnim - 0) / 7) * (-1.21444-(7.79733)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 24.70741 + (((tickAnim - 7) / 3) * (14.33967-(24.70741)));
            yy = 22.0334 + (((tickAnim - 7) / 3) * (27.76164-(22.0334)));
            zz = -1.21444 + (((tickAnim - 7) / 3) * (-24.27419-(-1.21444)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 14.33967 + (((tickAnim - 10) / 4) * (-10.00039-(14.33967)));
            yy = 27.76164 + (((tickAnim - 10) / 4) * (13.19384-(27.76164)));
            zz = -24.27419 + (((tickAnim - 10) / 4) * (7.79733-(-24.27419)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.625-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.625 + (((tickAnim - 7) / 7) * (0-(0.625)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -27.53054 + (((tickAnim - 0) / 7) * (1.83344-(-27.53054)));
            yy = 0.28598 + (((tickAnim - 0) / 7) * (2.01436-(0.28598)));
            zz = -3.23754 + (((tickAnim - 0) / 7) * (-1.10276-(-3.23754)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1.83344 + (((tickAnim - 7) / 3) * (-10.94676-(1.83344)));
            yy = 2.01436 + (((tickAnim - 7) / 3) * (-2.17341-(2.01436)));
            zz = -1.10276 + (((tickAnim - 7) / 3) * (-0.66651-(-1.10276)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -10.94676 + (((tickAnim - 10) / 4) * (-27.53054-(-10.94676)));
            yy = -2.17341 + (((tickAnim - 10) / 4) * (0.28598-(-2.17341)));
            zz = -0.66651 + (((tickAnim - 10) / 4) * (-3.23754-(-0.66651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.86472 + (((tickAnim - 0) / 2) * (-11.26768-(8.86472)));
            yy = -4.03799 + (((tickAnim - 0) / 2) * (-29.02536-(-4.03799)));
            zz = -7.40825 + (((tickAnim - 0) / 2) * (19.60015-(-7.40825)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -11.26768 + (((tickAnim - 2) / 1) * (-50.77902-(-11.26768)));
            yy = -29.02536 + (((tickAnim - 2) / 1) * (-39.80563-(-29.02536)));
            zz = 19.60015 + (((tickAnim - 2) / 1) * (55.00504-(19.60015)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -50.77902 + (((tickAnim - 3) / 4) * (28.07709-(-50.77902)));
            yy = -39.80563 + (((tickAnim - 3) / 4) * (16.22192-(-39.80563)));
            zz = 55.00504 + (((tickAnim - 3) / 4) * (18.04112-(55.00504)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 28.07709 + (((tickAnim - 7) / 3) * (58.08579-(28.07709)));
            yy = 16.22192 + (((tickAnim - 7) / 3) * (-13.01225-(16.22192)));
            zz = 18.04112 + (((tickAnim - 7) / 3) * (21.87413-(18.04112)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 58.08579 + (((tickAnim - 10) / 4) * (8.86472-(58.08579)));
            yy = -13.01225 + (((tickAnim - 10) / 4) * (-4.03799-(-13.01225)));
            zz = 21.87413 + (((tickAnim - 10) / 4) * (-7.40825-(21.87413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegfoot, leftLegfoot.rotateAngleX + (float) Math.toRadians(xx), leftLegfoot.rotateAngleY + (float) Math.toRadians(yy), leftLegfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.575 + (((tickAnim - 0) / 2) * (0.475-(0.575)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.475 + (((tickAnim - 2) / 1) * (0.025-(0.475)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.025 + (((tickAnim - 3) / 4) * (0-(0.025)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0.575-(0)));
            yy = -0.3 + (((tickAnim - 10) / 4) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegfoot.rotationPointX = this.leftLegfoot.rotationPointX + (float)(xx);
        this.leftLegfoot.rotationPointY = this.leftLegfoot.rotationPointY - (float)(yy);
        this.leftLegfoot.rotationPointZ = this.leftLegfoot.rotationPointZ + (float)(zz);


    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraOzimek entity = (EntityPrehistoricFloraOzimek) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
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




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -8.83104 + (((tickAnim - 0) / 2) * (-16.0462-(-8.83104)));
            yy = 14.56495 + (((tickAnim - 0) / 2) * (6.4426-(14.56495)));
            zz = 6.30871 + (((tickAnim - 0) / 2) * (-7.77689-(6.30871)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -16.0462 + (((tickAnim - 2) / 5) * (-18.26245-(-16.0462)));
            yy = 6.4426 + (((tickAnim - 2) / 5) * (7.16229-(6.4426)));
            zz = -7.77689 + (((tickAnim - 2) / 5) * (-6.66735-(-7.77689)));
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
            xx = -21.98539 + (((tickAnim - 11) / 3) * (-8.83104-(-21.98539)));
            yy = 1.78726 + (((tickAnim - 11) / 3) * (14.56495-(1.78726)));
            zz = -29.86587 + (((tickAnim - 11) / 3) * (6.30871-(-29.86587)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArmMembrane, rightArmMembrane.rotateAngleX + (float) Math.toRadians(xx), rightArmMembrane.rotateAngleY + (float) Math.toRadians(yy), rightArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.325 + (((tickAnim - 0) / 2) * (-0.25-(-0.325)));
            yy = -0.775 + (((tickAnim - 0) / 2) * (-0.8-(-0.775)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.025-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -0.25 + (((tickAnim - 2) / 5) * (0-(-0.25)));
            yy = -0.8 + (((tickAnim - 2) / 5) * (0-(-0.8)));
            zz = 0.025 + (((tickAnim - 2) / 5) * (-0.675-(0.025)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0.15-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.15-(0)));
            zz = -0.675 + (((tickAnim - 7) / 2) * (-0.365-(-0.675)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0.15 + (((tickAnim - 9) / 2) * (0-(0.15)));
            yy = -0.15 + (((tickAnim - 9) / 2) * (-0.725-(-0.15)));
            zz = -0.365 + (((tickAnim - 9) / 2) * (0-(-0.365)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (-0.325-(0)));
            yy = -0.725 + (((tickAnim - 11) / 3) * (-0.775-(-0.725)));
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



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503))*6), neck1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13.43922 + (((tickAnim - 0) / 5) * (-4.59908-(-13.43922)));
            yy = 38.99083 + (((tickAnim - 0) / 5) * (20.70451-(38.99083)));
            zz = -5.84731 + (((tickAnim - 0) / 5) * (26.34447-(-5.84731)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.59908 + (((tickAnim - 5) / 2) * (-11.57393-(-4.59908)));
            yy = 20.70451 + (((tickAnim - 5) / 2) * (13.41484-(20.70451)));
            zz = 26.34447 + (((tickAnim - 5) / 2) * (8.29057-(26.34447)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -11.57393 + (((tickAnim - 7) / 2) * (-5.78991-(-11.57393)));
            yy = 13.41484 + (((tickAnim - 7) / 2) * (12.20773-(13.41484)));
            zz = 8.29057 + (((tickAnim - 7) / 2) * (29.25728-(8.29057)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -5.78991 + (((tickAnim - 9) / 2) * (-8.30604-(-5.78991)));
            yy = 12.20773 + (((tickAnim - 9) / 2) * (15.76951-(12.20773)));
            zz = 29.25728 + (((tickAnim - 9) / 2) * (17.40182-(29.25728)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -8.30604 + (((tickAnim - 11) / 3) * (-13.43922-(-8.30604)));
            yy = 15.76951 + (((tickAnim - 11) / 3) * (38.99083-(15.76951)));
            zz = 17.40182 + (((tickAnim - 11) / 3) * (-5.84731-(17.40182)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontMembrane, rightFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), rightFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), rightFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-1), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+30))*3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+30))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30))*8), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-90))*8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-90))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-150))*5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-150))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-190))*12), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-190))*5));



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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.03437 + (((tickAnim - 0) / 3) * (-10.43808-(-7.03437)));
            yy = 6.19509 + (((tickAnim - 0) / 3) * (-1.85049-(6.19509)));
            zz = -22.19579 + (((tickAnim - 0) / 3) * (-11.74308-(-22.19579)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -10.43808 + (((tickAnim - 3) / 1) * (-12.98271-(-10.43808)));
            yy = -1.85049 + (((tickAnim - 3) / 1) * (-6.7448-(-1.85049)));
            zz = -11.74308 + (((tickAnim - 3) / 1) * (-16.57693-(-11.74308)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -12.98271 + (((tickAnim - 4) / 3) * (-13.45362-(-12.98271)));
            yy = -6.7448 + (((tickAnim - 4) / 3) * (-14.6854-(-6.7448)));
            zz = -16.57693 + (((tickAnim - 4) / 3) * (-5.42818-(-16.57693)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -13.45362 + (((tickAnim - 7) / 7) * (-7.03437-(-13.45362)));
            yy = -14.6854 + (((tickAnim - 7) / 7) * (6.19509-(-14.6854)));
            zz = -5.42818 + (((tickAnim - 7) / 7) * (-22.19579-(-5.42818)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane2, rightMembrane2.rotateAngleX + (float) Math.toRadians(xx), rightMembrane2.rotateAngleY + (float) Math.toRadians(yy), rightMembrane2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.925 + (((tickAnim - 0) / 7) * (-0.93-(-0.925)));
            yy = -0.05 + (((tickAnim - 0) / 7) * (-0.3-(-0.05)));
            zz = 0.525 + (((tickAnim - 0) / 7) * (0.53-(0.525)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -0.93 + (((tickAnim - 7) / 7) * (-0.925-(-0.93)));
            yy = -0.3 + (((tickAnim - 7) / 7) * (-0.05-(-0.3)));
            zz = 0.53 + (((tickAnim - 7) / 7) * (0.525-(0.53)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMembrane2.rotationPointX = this.rightMembrane2.rotationPointX + (float)(xx);
        this.rightMembrane2.rotationPointY = this.rightMembrane2.rotationPointY - (float)(yy);
        this.rightMembrane2.rotationPointZ = this.rightMembrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24.70741 + (((tickAnim - 0) / 3) * (14.33967-(24.70741)));
            yy = -22.0334 + (((tickAnim - 0) / 3) * (-27.76164-(-22.0334)));
            zz = 1.21444 + (((tickAnim - 0) / 3) * (24.27419-(1.21444)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 14.33967 + (((tickAnim - 3) / 4) * (-10.00039-(14.33967)));
            yy = -27.76164 + (((tickAnim - 3) / 4) * (-13.19384-(-27.76164)));
            zz = 24.27419 + (((tickAnim - 3) / 4) * (-7.79733-(24.27419)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -10.00039 + (((tickAnim - 7) / 7) * (24.70741-(-10.00039)));
            yy = -13.19384 + (((tickAnim - 7) / 7) * (-22.0334-(-13.19384)));
            zz = -7.79733 + (((tickAnim - 7) / 7) * (1.21444-(-7.79733)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.625 + (((tickAnim - 0) / 7) * (0-(-0.625)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (-0.625-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.83344 + (((tickAnim - 0) / 3) * (-10.94676-(1.83344)));
            yy = -2.01436 + (((tickAnim - 0) / 3) * (2.17341-(-2.01436)));
            zz = 1.10276 + (((tickAnim - 0) / 3) * (0.66651-(1.10276)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -10.94676 + (((tickAnim - 3) / 4) * (-27.53054-(-10.94676)));
            yy = 2.17341 + (((tickAnim - 3) / 4) * (-0.28598-(2.17341)));
            zz = 0.66651 + (((tickAnim - 3) / 4) * (3.23754-(0.66651)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -27.53054 + (((tickAnim - 7) / 7) * (1.83344-(-27.53054)));
            yy = -0.28598 + (((tickAnim - 7) / 7) * (-2.01436-(-0.28598)));
            zz = 3.23754 + (((tickAnim - 7) / 7) * (1.10276-(3.23754)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 28.07709 + (((tickAnim - 0) / 2) * (58.08579-(28.07709)));
            yy = 16.22192 + (((tickAnim - 0) / 2) * (13.01225-(16.22192)));
            zz = 18.04112 + (((tickAnim - 0) / 2) * (-21.87413-(18.04112)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 58.08579 + (((tickAnim - 2) / 5) * (8.86472-(58.08579)));
            yy = 13.01225 + (((tickAnim - 2) / 5) * (4.03799-(13.01225)));
            zz = -21.87413 + (((tickAnim - 2) / 5) * (7.40825-(-21.87413)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 8.86472 + (((tickAnim - 7) / 2) * (-11.26768-(8.86472)));
            yy = 4.03799 + (((tickAnim - 7) / 2) * (29.02536-(4.03799)));
            zz = 7.40825 + (((tickAnim - 7) / 2) * (-19.60015-(7.40825)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -11.26768 + (((tickAnim - 9) / 1) * (-50.77902-(-11.26768)));
            yy = 29.02536 + (((tickAnim - 9) / 1) * (39.80563-(29.02536)));
            zz = -19.60015 + (((tickAnim - 9) / 1) * (-55.00504-(-19.60015)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -50.77902 + (((tickAnim - 10) / 4) * (28.07709-(-50.77902)));
            yy = 39.80563 + (((tickAnim - 10) / 4) * (16.22192-(39.80563)));
            zz = -55.00504 + (((tickAnim - 10) / 4) * (18.04112-(-55.00504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLegfoot, rightLegfoot.rotateAngleX + (float) Math.toRadians(xx), rightLegfoot.rotateAngleY + (float) Math.toRadians(yy), rightLegfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (-0.575-(0)));
            yy = -0.3 + (((tickAnim - 2) / 5) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.575 + (((tickAnim - 7) / 2) * (-0.475-(-0.575)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.475 + (((tickAnim - 9) / 1) * (-0.025-(-0.475)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.025 + (((tickAnim - 10) / 4) * (0-(-0.025)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLegfoot.rotationPointX = this.rightLegfoot.rotationPointX + (float)(xx);
        this.rightLegfoot.rotationPointY = this.rightLegfoot.rotationPointY - (float)(yy);
        this.rightLegfoot.rotationPointZ = this.rightLegfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30*6))*5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503-30*3))*5));



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
            xx = -21.98539 + (((tickAnim - 4) / 3) * (-8.83104-(-21.98539)));
            yy = -1.78726 + (((tickAnim - 4) / 3) * (-14.56495-(-1.78726)));
            zz = 29.86587 + (((tickAnim - 4) / 3) * (-6.30871-(29.86587)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -8.83104 + (((tickAnim - 7) / 7) * (-18.26245-(-8.83104)));
            yy = -14.56495 + (((tickAnim - 7) / 7) * (-7.16229-(-14.56495)));
            zz = -6.30871 + (((tickAnim - 7) / 7) * (6.66735-(-6.30871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArmMembrane, leftArmMembrane.rotateAngleX + (float) Math.toRadians(xx), leftArmMembrane.rotateAngleY + (float) Math.toRadians(yy), leftArmMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.15-(0)));
            zz = -0.675 + (((tickAnim - 0) / 2) * (-0.365-(-0.675)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.15 + (((tickAnim - 2) / 2) * (0-(-0.15)));
            yy = -0.15 + (((tickAnim - 2) / 2) * (-0.725-(-0.15)));
            zz = -0.365 + (((tickAnim - 2) / 2) * (0-(-0.365)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0.325-(0)));
            yy = -0.725 + (((tickAnim - 4) / 3) * (-0.775-(-0.725)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.325 + (((tickAnim - 7) / 7) * (0-(0.325)));
            yy = -0.775 + (((tickAnim - 7) / 7) * (0-(-0.775)));
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




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.25 + (((tickAnim - 0) / 2) * (-0.02019-(-4.25)));
            yy = -10.25 + (((tickAnim - 0) / 2) * (-12.68399-(-10.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (-27.14517-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -0.02019 + (((tickAnim - 2) / 5) * (-23.11242-(-0.02019)));
            yy = -12.68399 + (((tickAnim - 2) / 5) * (-35.42274-(-12.68399)));
            zz = -27.14517 + (((tickAnim - 2) / 5) * (14.13334-(-27.14517)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -23.11242 + (((tickAnim - 7) / 4) * (-7.14352-(-23.11242)));
            yy = -35.42274 + (((tickAnim - 7) / 4) * (-21.24821-(-35.42274)));
            zz = 14.13334 + (((tickAnim - 7) / 4) * (-8.02193-(14.13334)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -7.14352 + (((tickAnim - 11) / 3) * (-4.25-(-7.14352)));
            yy = -21.24821 + (((tickAnim - 11) / 3) * (-10.25-(-21.24821)));
            zz = -8.02193 + (((tickAnim - 11) / 3) * (0-(-8.02193)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontMembrane, leftFrontMembrane.rotateAngleX + (float) Math.toRadians(xx), leftFrontMembrane.rotateAngleY + (float) Math.toRadians(yy), leftFrontMembrane.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*503+180))*6), neck2.rotateAngleZ + (float) Math.toRadians(0));



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




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -13.45362 + (((tickAnim - 0) / 7) * (-7.03437-(-13.45362)));
            yy = 14.6854 + (((tickAnim - 0) / 7) * (-6.19509-(14.6854)));
            zz = 5.42818 + (((tickAnim - 0) / 7) * (22.19579-(5.42818)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -7.03437 + (((tickAnim - 7) / 3) * (-10.43808-(-7.03437)));
            yy = -6.19509 + (((tickAnim - 7) / 3) * (1.85049-(-6.19509)));
            zz = 22.19579 + (((tickAnim - 7) / 3) * (11.74308-(22.19579)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -10.43808 + (((tickAnim - 10) / 1) * (-12.98271-(-10.43808)));
            yy = 1.85049 + (((tickAnim - 10) / 1) * (6.7448-(1.85049)));
            zz = 11.74308 + (((tickAnim - 10) / 1) * (16.57693-(11.74308)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -12.98271 + (((tickAnim - 11) / 3) * (-13.45362-(-12.98271)));
            yy = 6.7448 + (((tickAnim - 11) / 3) * (14.6854-(6.7448)));
            zz = 16.57693 + (((tickAnim - 11) / 3) * (5.42818-(16.57693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane2, leftMembrane2.rotateAngleX + (float) Math.toRadians(xx), leftMembrane2.rotateAngleY + (float) Math.toRadians(yy), leftMembrane2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.93 + (((tickAnim - 0) / 7) * (0.925-(-0.93)));
            yy = -0.3 + (((tickAnim - 0) / 7) * (-0.05-(-0.3)));
            zz = 0.53 + (((tickAnim - 0) / 7) * (0.525-(0.53)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.925 + (((tickAnim - 7) / 7) * (-0.93-(0.925)));
            yy = -0.05 + (((tickAnim - 7) / 7) * (-0.3-(-0.05)));
            zz = 0.525 + (((tickAnim - 7) / 7) * (0.53-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftMembrane2.rotationPointX = this.leftMembrane2.rotationPointX + (float)(xx);
        this.leftMembrane2.rotationPointY = this.leftMembrane2.rotationPointY - (float)(yy);
        this.leftMembrane2.rotationPointZ = this.leftMembrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -10.00039 + (((tickAnim - 0) / 7) * (24.70741-(-10.00039)));
            yy = 13.19384 + (((tickAnim - 0) / 7) * (22.0334-(13.19384)));
            zz = 7.79733 + (((tickAnim - 0) / 7) * (-1.21444-(7.79733)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 24.70741 + (((tickAnim - 7) / 3) * (14.33967-(24.70741)));
            yy = 22.0334 + (((tickAnim - 7) / 3) * (27.76164-(22.0334)));
            zz = -1.21444 + (((tickAnim - 7) / 3) * (-24.27419-(-1.21444)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 14.33967 + (((tickAnim - 10) / 4) * (-10.00039-(14.33967)));
            yy = 27.76164 + (((tickAnim - 10) / 4) * (13.19384-(27.76164)));
            zz = -24.27419 + (((tickAnim - 10) / 4) * (7.79733-(-24.27419)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.625-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.625 + (((tickAnim - 7) / 7) * (0-(0.625)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -27.53054 + (((tickAnim - 0) / 7) * (1.83344-(-27.53054)));
            yy = 0.28598 + (((tickAnim - 0) / 7) * (2.01436-(0.28598)));
            zz = -3.23754 + (((tickAnim - 0) / 7) * (-1.10276-(-3.23754)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1.83344 + (((tickAnim - 7) / 3) * (-10.94676-(1.83344)));
            yy = 2.01436 + (((tickAnim - 7) / 3) * (-2.17341-(2.01436)));
            zz = -1.10276 + (((tickAnim - 7) / 3) * (-0.66651-(-1.10276)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -10.94676 + (((tickAnim - 10) / 4) * (-27.53054-(-10.94676)));
            yy = -2.17341 + (((tickAnim - 10) / 4) * (0.28598-(-2.17341)));
            zz = -0.66651 + (((tickAnim - 10) / 4) * (-3.23754-(-0.66651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.86472 + (((tickAnim - 0) / 2) * (-11.26768-(8.86472)));
            yy = -4.03799 + (((tickAnim - 0) / 2) * (-29.02536-(-4.03799)));
            zz = -7.40825 + (((tickAnim - 0) / 2) * (19.60015-(-7.40825)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -11.26768 + (((tickAnim - 2) / 1) * (-50.77902-(-11.26768)));
            yy = -29.02536 + (((tickAnim - 2) / 1) * (-39.80563-(-29.02536)));
            zz = 19.60015 + (((tickAnim - 2) / 1) * (55.00504-(19.60015)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -50.77902 + (((tickAnim - 3) / 4) * (28.07709-(-50.77902)));
            yy = -39.80563 + (((tickAnim - 3) / 4) * (16.22192-(-39.80563)));
            zz = 55.00504 + (((tickAnim - 3) / 4) * (18.04112-(55.00504)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 28.07709 + (((tickAnim - 7) / 3) * (58.08579-(28.07709)));
            yy = 16.22192 + (((tickAnim - 7) / 3) * (-13.01225-(16.22192)));
            zz = 18.04112 + (((tickAnim - 7) / 3) * (21.87413-(18.04112)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 58.08579 + (((tickAnim - 10) / 4) * (8.86472-(58.08579)));
            yy = -13.01225 + (((tickAnim - 10) / 4) * (-4.03799-(-13.01225)));
            zz = 21.87413 + (((tickAnim - 10) / 4) * (-7.40825-(21.87413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLegfoot, leftLegfoot.rotateAngleX + (float) Math.toRadians(xx), leftLegfoot.rotateAngleY + (float) Math.toRadians(yy), leftLegfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.575 + (((tickAnim - 0) / 2) * (0.475-(0.575)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.475 + (((tickAnim - 2) / 1) * (0.025-(0.475)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.025 + (((tickAnim - 3) / 4) * (0-(0.025)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0.575-(0)));
            yy = -0.3 + (((tickAnim - 10) / 4) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLegfoot.rotationPointX = this.leftLegfoot.rotationPointX + (float)(xx);
        this.leftLegfoot.rotationPointY = this.leftLegfoot.rotationPointY - (float)(yy);
        this.leftLegfoot.rotationPointZ = this.leftLegfoot.rotationPointZ + (float)(zz);


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
