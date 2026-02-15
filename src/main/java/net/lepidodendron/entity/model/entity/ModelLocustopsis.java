package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKururubatrachus;
import net.lepidodendron.entity.EntityPrehistoricFloraLocustopsis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelLocustopsis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer leftHindwingFoldable;
    private final AdvancedModelRenderer leftHindwingFoldable2;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer rightHindwingFoldable;
    private final AdvancedModelRenderer rightHindwingFoldable2;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLeg32;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftLeg32;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r26;

    private ModelAnimator animator;

    public ModelLocustopsis() {
        this.textureWidth = 50;
        this.textureHeight = 49;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.75F, -2.325F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 1.4084F, -2.0568F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 20, -1.5F, -2.325F, -0.1F, 2, 2, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.25F, -0.55F, -0.85F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 39, 0.75F, -0.7F, -1.3F, 1, 2, 3, 0.02F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 38, 1.5F, -0.7F, -1.3F, 1, 2, 3, 0.01F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 38, 0.0F, -0.7F, -1.3F, 1, 2, 3, 0.01F, false));

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, 0.05F, -0.325F);
        this.main.addChild(thorax);
        this.setRotateAngle(thorax, 0.0873F, 0.0F, 0.0F);


        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, 0.2037F, 1.0993F);
        this.thorax.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.3054F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.195F, 1.8126F);
        this.abdomen.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0087F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 42, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 7.4963F, 5.048F);
        this.abdomen.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4276F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 38, -0.5F, -8.15F, -4.0F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.3963F, 5.048F);
        this.abdomen.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4276F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 44, -0.5F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.7F, -0.8926F, 4.8783F);
        this.abdomen.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1575F, -0.5877F, -0.0878F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 46, 0.125F, -0.2F, -0.35F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.7F, -0.8926F, 4.8783F);
        this.abdomen.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1575F, 0.5877F, 0.0878F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 46, -0.125F, -0.2F, -0.35F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.0646F, 1.0788F);
        this.abdomen.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 0, -1.0F, -1.025F, -1.125F, 2, 2, 5, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(1.0271F, -0.7568F, -0.5953F);
        this.main.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.0043F, 0.0246F, 1.5995F);
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 0, 0, -1.6736F, 0.0F, -0.7365F, 3, 0, 13, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(0.9727F, -0.4896F, 0.055F);
        this.main.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, -0.0037F, 0.0106F, 1.5838F);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 0, 14, -1.7813F, -0.03F, -0.4855F, 3, 0, 12, 0.0F, false));

        this.leftHindwingFoldable = new AdvancedModelRenderer(this);
        this.leftHindwingFoldable.setRotationPoint(-1.7813F, -0.03F, 4.8895F);
        this.leftHindwing.addChild(leftHindwingFoldable);
        this.setRotateAngle(leftHindwingFoldable, 0.0F, 0.0F, -3.1416F);
        this.leftHindwingFoldable.cubeList.add(new ModelBox(leftHindwingFoldable, 0, 27, -3.0F, -0.0005F, -5.375F, 3, 0, 11, 0.0F, false));

        this.leftHindwingFoldable2 = new AdvancedModelRenderer(this);
        this.leftHindwingFoldable2.setRotationPoint(-3.0F, 0.0F, -0.25F);
        this.leftHindwingFoldable.addChild(leftHindwingFoldable2);
        this.setRotateAngle(leftHindwingFoldable2, 0.0F, 0.0F, -3.1416F);
        this.leftHindwingFoldable2.cubeList.add(new ModelBox(leftHindwingFoldable2, 29, 27, -2.0F, 0.0015F, -5.125F, 2, 0, 10, 0.0F, false));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-0.9727F, -0.4896F, 0.055F);
        this.main.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, -0.0037F, -0.0106F, -1.5838F);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 0, 14, -1.2187F, -0.03F, -0.4855F, 3, 0, 12, 0.0F, true));

        this.rightHindwingFoldable = new AdvancedModelRenderer(this);
        this.rightHindwingFoldable.setRotationPoint(1.7813F, -0.03F, 4.8895F);
        this.rightHindwing.addChild(rightHindwingFoldable);
        this.setRotateAngle(rightHindwingFoldable, 0.0F, 0.0F, 3.1416F);
        this.rightHindwingFoldable.cubeList.add(new ModelBox(rightHindwingFoldable, 0, 27, 0.0F, -0.0005F, -5.375F, 3, 0, 11, 0.0F, true));

        this.rightHindwingFoldable2 = new AdvancedModelRenderer(this);
        this.rightHindwingFoldable2.setRotationPoint(3.0F, 0.0F, -0.25F);
        this.rightHindwingFoldable.addChild(rightHindwingFoldable2);
        this.setRotateAngle(rightHindwingFoldable2, 0.0F, 0.0F, 3.1416F);
        this.rightHindwingFoldable2.cubeList.add(new ModelBox(rightHindwingFoldable2, 29, 27, 0.0F, 0.0015F, -5.125F, 2, 0, 10, 0.0F, true));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-1.0271F, -0.7568F, -0.5953F);
        this.main.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.0043F, -0.0246F, -1.5995F);
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 0, 0, -1.3264F, 0.0F, -0.7365F, 3, 0, 13, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.9F, 0.4F, 0.725F);
        this.main.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.6377F, 1.0602F, 0.8118F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.1759F, -0.0049F, 0.1082F);
        this.rightLeg3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.2618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 39, -5.0392F, -0.0028F, -0.2211F, 5, 2, 0, 0.0F, true));

        this.rightLeg32 = new AdvancedModelRenderer(this);
        this.rightLeg32.setRotationPoint(-4.0541F, 0.0167F, -0.0168F);
        this.rightLeg3.addChild(rightLeg32);
        this.setRotateAngle(rightLeg32, 0.0F, 0.1309F, -1.0472F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.4F, -0.625F, 0.0F);
        this.rightLeg32.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1364F, -0.1708F, 1.1533F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 38, -2.4931F, -0.5175F, 0.0072F, 3, 7, 0, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.8865F, 0.3523F, -0.25F);
        this.main.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, 0.432F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.2703F, -0.227F, 0.025F);
        this.rightLeg2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0306F, 0.437F, -0.4451F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 8, -4.0F, 0.0F, 0.0F, 4, 3, 0, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.7988F, 0.2556F, -0.8343F);
        this.main.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2794F, -0.6755F, 0.4826F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.1526F, -0.1863F, -0.0931F);
        this.rightLeg1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0262F, -0.0013F, -0.4394F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 39, -4.0F, 0.0F, 0.0F, 4, 3, 0, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.7988F, 0.2556F, -0.8343F);
        this.main.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2794F, 0.6755F, -0.4826F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.1526F, -0.1863F, -0.0931F);
        this.leftLeg1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0262F, 0.0013F, 0.4394F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 39, 0.0F, 0.0F, 0.0F, 4, 3, 0, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.8865F, 0.3523F, -0.25F);
        this.main.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, -0.432F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.2703F, -0.227F, 0.025F);
        this.leftLeg2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0306F, -0.437F, 0.4451F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 8, 0.0F, 0.0F, 0.0F, 4, 3, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.9F, 0.4F, 0.725F);
        this.main.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.6377F, -1.0602F, -0.8118F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.1759F, -0.0049F, 0.1082F);
        this.leftLeg3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, -0.2618F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 39, 0.0392F, -0.0028F, -0.2211F, 5, 2, 0, 0.0F, false));

        this.leftLeg32 = new AdvancedModelRenderer(this);
        this.leftLeg32.setRotationPoint(4.0541F, 0.0167F, -0.0168F);
        this.leftLeg3.addChild(leftLeg32);
        this.setRotateAngle(leftLeg32, 0.0F, -0.1309F, 1.0472F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.4F, -0.625F, 0.0F);
        this.leftLeg32.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1364F, 0.1708F, -1.1533F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 38, -0.5069F, -0.5175F, 0.0072F, 3, 7, 0, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.0F, 8.175F, 3.05F);
        this.main.addChild(head);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.8236F, -7.7493F, -5.8437F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0127F, -0.0015F, -0.1544F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 46, 0.175F, -0.15F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.1764F, -7.7493F, -5.8437F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0127F, 0.0015F, 0.1544F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 43, -0.175F, -0.15F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, -8.3339F, -5.898F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.176F, -0.1289F, -0.0229F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 45, 41, 0.1F, -0.625F, -0.325F, 1, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -8.3339F, -5.898F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.176F, 0.1289F, 0.0229F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 45, 41, -1.1F, -0.625F, -0.325F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, -8.9816F, -6.263F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.453F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 24, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, -8.0082F, -6.4922F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2313F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 20, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, -9.0F, -5.0F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 43, 0.0F, 0.725F, -1.625F, 1, 1, 2, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.8F, -8.347F, -5.8241F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0698F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 45, -0.5F, -0.5F, -0.475F, 1, 1, 1, 0.01F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 41, 44, -0.9F, -0.5F, -0.475F, 1, 1, 1, 0.01F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-1.432F, -8.3116F, -6.1251F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, 0.1834F, -0.1971F, -0.4204F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.195F, -0.8976F, -0.5921F);
        this.rightAntenna.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2728F, 0.3275F, 1.5565F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 31, 14, -4.0F, 0.0F, -4.0F, 5, 0, 5, 0.0F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(-0.568F, -8.3116F, -6.1251F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, 0.1834F, 0.1971F, 0.4204F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.195F, -0.8976F, -0.5921F);
        this.leftAntenna.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2728F, -0.3275F, -1.5565F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 31, 14, -1.0F, 0.0F, -4.0F, 5, 0, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(main, 1.0F, 0.0F, 0.0F);
        this.main.offsetY = -0.25F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.main.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.30F;
        this.main.offsetX = -0.05F;
        this.main.rotateAngleY = (float)Math.toRadians(210);
        this.main.rotateAngleX = (float)Math.toRadians(40);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.9F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraLocustopsis ee = (EntityPrehistoricFloraLocustopsis) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLocustopsis ee = (EntityPrehistoricFloraLocustopsis) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (!ee.getHeadCollided()) {
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
                else {
                    //Just pose with no animation running:
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else if (ee.getIsMoving()) {
                if (!ee.getIsFlying() && ee.getIsMoving() && ee.onGround) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else {
                    if (ee.getIsLaunching()) {
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //Is gliding:
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            //Is gliding:
            animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }


    }

    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLocustopsis entity = (EntityPrehistoricFloraLocustopsis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-30), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*0.75);
        this.main.rotationPointY = this.main.rotationPointY - (float)(3.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(-34.9707), leftLeg1.rotateAngleY + (float) Math.toRadians(-16.14796), leftLeg1.rotateAngleZ + (float) Math.toRadians(-61.31648));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(2.82204), leftLeg2.rotateAngleY + (float) Math.toRadians(-16.47352), leftLeg2.rotateAngleZ + (float) Math.toRadians(4.3254));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(-94.20684), leftLeg3.rotateAngleY + (float) Math.toRadians(-2.9248663134-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*3), leftLeg3.rotateAngleZ + (float) Math.toRadians(87.2076945358+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*5));


        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(-8.03798), leftLeg32.rotateAngleY + (float) Math.toRadians(-8.55172), leftLeg32.rotateAngleZ + (float) Math.toRadians(-55.08481));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 180.55324 + (((tickAnim - 0) / 1) * (104.09619-(180.55324)));
            yy = 83.92432 + (((tickAnim - 0) / 1) * (32.05274-(83.92432)));
            zz = 10.55494 + (((tickAnim - 0) / 1) * (-14.04061-(10.55494)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 104.09619 + (((tickAnim - 1) / 1) * (149.36539-(104.09619)));
            yy = 32.05274 + (((tickAnim - 1) / 1) * (68.56993-(32.05274)));
            zz = -14.04061 + (((tickAnim - 1) / 1) * (95.0586-(-14.04061)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 149.36539 + (((tickAnim - 2) / 1) * (251.92114-(149.36539)));
            yy = 68.56993 + (((tickAnim - 2) / 1) * (54.85285-(68.56993)));
            zz = 95.0586 + (((tickAnim - 2) / 1) * (165.77192-(95.0586)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 251.92114 + (((tickAnim - 3) / 0) * (180.55324-(251.92114)));
            yy = 54.85285 + (((tickAnim - 3) / 0) * (83.92432-(54.85285)));
            zz = 165.77192 + (((tickAnim - 3) / 0) * (10.55494-(165.77192)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 180.55324 + (((tickAnim - 3) / 1) * (104.09619-(180.55324)));
            yy = 83.92432 + (((tickAnim - 3) / 1) * (32.05274-(83.92432)));
            zz = 10.55494 + (((tickAnim - 3) / 1) * (-14.04061-(10.55494)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 104.09619 + (((tickAnim - 4) / 1) * (149.36539-(104.09619)));
            yy = 32.05274 + (((tickAnim - 4) / 1) * (68.56993-(32.05274)));
            zz = -14.04061 + (((tickAnim - 4) / 1) * (95.0586-(-14.04061)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 149.36539 + (((tickAnim - 5) / 1) * (251.92114-(149.36539)));
            yy = 68.56993 + (((tickAnim - 5) / 1) * (54.85285-(68.56993)));
            zz = 95.0586 + (((tickAnim - 5) / 1) * (165.77192-(95.0586)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 251.92114 + (((tickAnim - 6) / 1) * (180.55324-(251.92114)));
            yy = 54.85285 + (((tickAnim - 6) / 1) * (83.92432-(54.85285)));
            zz = 165.77192 + (((tickAnim - 6) / 1) * (10.55494-(165.77192)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 180.55324 + (((tickAnim - 7) / 1) * (104.09619-(180.55324)));
            yy = 83.92432 + (((tickAnim - 7) / 1) * (32.05274-(83.92432)));
            zz = 10.55494 + (((tickAnim - 7) / 1) * (-14.04061-(10.55494)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 104.09619 + (((tickAnim - 8) / 0) * (149.36539-(104.09619)));
            yy = 32.05274 + (((tickAnim - 8) / 0) * (68.56993-(32.05274)));
            zz = -14.04061 + (((tickAnim - 8) / 0) * (95.0586-(-14.04061)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 149.36539 + (((tickAnim - 8) / 1) * (251.92114-(149.36539)));
            yy = 68.56993 + (((tickAnim - 8) / 1) * (54.85285-(68.56993)));
            zz = 95.0586 + (((tickAnim - 8) / 1) * (165.77192-(95.0586)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 251.92114 + (((tickAnim - 9) / 1) * (180.55324-(251.92114)));
            yy = 54.85285 + (((tickAnim - 9) / 1) * (83.92432-(54.85285)));
            zz = 165.77192 + (((tickAnim - 9) / 1) * (10.55494-(165.77192)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 180.55324 + (((tickAnim - 10) / 1) * (104.09619-(180.55324)));
            yy = 83.92432 + (((tickAnim - 10) / 1) * (32.05274-(83.92432)));
            zz = 10.55494 + (((tickAnim - 10) / 1) * (-14.04061-(10.55494)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 104.09619 + (((tickAnim - 11) / 1) * (149.36539-(104.09619)));
            yy = 32.05274 + (((tickAnim - 11) / 1) * (68.56993-(32.05274)));
            zz = -14.04061 + (((tickAnim - 11) / 1) * (95.0586-(-14.04061)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 149.36539 + (((tickAnim - 12) / 1) * (251.92114-(149.36539)));
            yy = 68.56993 + (((tickAnim - 12) / 1) * (54.85285-(68.56993)));
            zz = 95.0586 + (((tickAnim - 12) / 1) * (165.77192-(95.0586)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 251.92114 + (((tickAnim - 13) / 0) * (180.55324-(251.92114)));
            yy = 54.85285 + (((tickAnim - 13) / 0) * (83.92432-(54.85285)));
            zz = 165.77192 + (((tickAnim - 13) / 0) * (10.55494-(165.77192)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 180.55324 + (((tickAnim - 13) / 1) * (104.09619-(180.55324)));
            yy = 83.92432 + (((tickAnim - 13) / 1) * (32.05274-(83.92432)));
            zz = 10.55494 + (((tickAnim - 13) / 1) * (-14.04061-(10.55494)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 104.09619 + (((tickAnim - 14) / 1) * (149.36539-(104.09619)));
            yy = 32.05274 + (((tickAnim - 14) / 1) * (68.56993-(32.05274)));
            zz = -14.04061 + (((tickAnim - 14) / 1) * (95.0586-(-14.04061)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 149.36539 + (((tickAnim - 15) / 1) * (251.92114-(149.36539)));
            yy = 68.56993 + (((tickAnim - 15) / 1) * (54.85285-(68.56993)));
            zz = 95.0586 + (((tickAnim - 15) / 1) * (165.77192-(95.0586)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 251.92114 + (((tickAnim - 16) / 1) * (180.55324-(251.92114)));
            yy = 54.85285 + (((tickAnim - 16) / 1) * (83.92432-(54.85285)));
            zz = 165.77192 + (((tickAnim - 16) / 1) * (10.55494-(165.77192)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 180.55324 + (((tickAnim - 17) / 1) * (104.09619-(180.55324)));
            yy = 83.92432 + (((tickAnim - 17) / 1) * (32.05274-(83.92432)));
            zz = 10.55494 + (((tickAnim - 17) / 1) * (-14.04061-(10.55494)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 104.09619 + (((tickAnim - 18) / 0) * (149.36539-(104.09619)));
            yy = 32.05274 + (((tickAnim - 18) / 0) * (68.56993-(32.05274)));
            zz = -14.04061 + (((tickAnim - 18) / 0) * (95.0586-(-14.04061)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 149.36539 + (((tickAnim - 18) / 1) * (251.92114-(149.36539)));
            yy = 68.56993 + (((tickAnim - 18) / 1) * (54.85285-(68.56993)));
            zz = 95.0586 + (((tickAnim - 18) / 1) * (165.77192-(95.0586)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 251.92114 + (((tickAnim - 19) / 1) * (180.55324-(251.92114)));
            yy = 54.85285 + (((tickAnim - 19) / 1) * (83.92432-(54.85285)));
            zz = 165.77192 + (((tickAnim - 19) / 1) * (10.55494-(165.77192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*10), leftAntenna.rotateAngleY + (float) Math.toRadians(0), leftAntenna.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*10));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -22.97235 + (((tickAnim - 0) / 1) * (69.05654-(-22.97235)));
            yy = 80.63624 + (((tickAnim - 0) / 1) * (55.54475-(80.63624)));
            zz = -189.99818 + (((tickAnim - 0) / 1) * (-33.93988-(-189.99818)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 69.05654 + (((tickAnim - 1) / 1) * (-4.98957-(69.05654)));
            yy = 55.54475 + (((tickAnim - 1) / 1) * (74.21291-(55.54475)));
            zz = -33.93988 + (((tickAnim - 1) / 1) * (-51.23871-(-33.93988)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -4.98957 + (((tickAnim - 2) / 1) * (-52.32507-(-4.98957)));
            yy = 74.21291 + (((tickAnim - 2) / 1) * (65.03646-(74.21291)));
            zz = -51.23871 + (((tickAnim - 2) / 1) * (-176.07051-(-51.23871)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -52.32507 + (((tickAnim - 3) / 0) * (-22.97235-(-52.32507)));
            yy = 65.03646 + (((tickAnim - 3) / 0) * (80.63624-(65.03646)));
            zz = -176.07051 + (((tickAnim - 3) / 0) * (-189.99818-(-176.07051)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -22.97235 + (((tickAnim - 3) / 1) * (69.05654-(-22.97235)));
            yy = 80.63624 + (((tickAnim - 3) / 1) * (55.54475-(80.63624)));
            zz = -189.99818 + (((tickAnim - 3) / 1) * (-33.93988-(-189.99818)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 69.05654 + (((tickAnim - 4) / 1) * (-4.98957-(69.05654)));
            yy = 55.54475 + (((tickAnim - 4) / 1) * (74.21291-(55.54475)));
            zz = -33.93988 + (((tickAnim - 4) / 1) * (-51.23871-(-33.93988)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -4.98957 + (((tickAnim - 5) / 1) * (-52.32507-(-4.98957)));
            yy = 74.21291 + (((tickAnim - 5) / 1) * (65.03646-(74.21291)));
            zz = -51.23871 + (((tickAnim - 5) / 1) * (-176.07051-(-51.23871)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -52.32507 + (((tickAnim - 6) / 1) * (-22.97235-(-52.32507)));
            yy = 65.03646 + (((tickAnim - 6) / 1) * (80.63624-(65.03646)));
            zz = -176.07051 + (((tickAnim - 6) / 1) * (-189.99818-(-176.07051)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -22.97235 + (((tickAnim - 7) / 1) * (69.05654-(-22.97235)));
            yy = 80.63624 + (((tickAnim - 7) / 1) * (55.54475-(80.63624)));
            zz = -189.99818 + (((tickAnim - 7) / 1) * (-33.93988-(-189.99818)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 69.05654 + (((tickAnim - 8) / 0) * (-4.98957-(69.05654)));
            yy = 55.54475 + (((tickAnim - 8) / 0) * (74.21291-(55.54475)));
            zz = -33.93988 + (((tickAnim - 8) / 0) * (-51.23871-(-33.93988)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -4.98957 + (((tickAnim - 8) / 1) * (-52.32507-(-4.98957)));
            yy = 74.21291 + (((tickAnim - 8) / 1) * (65.03646-(74.21291)));
            zz = -51.23871 + (((tickAnim - 8) / 1) * (-176.07051-(-51.23871)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -52.32507 + (((tickAnim - 9) / 1) * (-22.97235-(-52.32507)));
            yy = 65.03646 + (((tickAnim - 9) / 1) * (80.63624-(65.03646)));
            zz = -176.07051 + (((tickAnim - 9) / 1) * (-189.99818-(-176.07051)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -22.97235 + (((tickAnim - 10) / 1) * (69.05654-(-22.97235)));
            yy = 80.63624 + (((tickAnim - 10) / 1) * (55.54475-(80.63624)));
            zz = -189.99818 + (((tickAnim - 10) / 1) * (-33.93988-(-189.99818)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 69.05654 + (((tickAnim - 11) / 1) * (-4.98957-(69.05654)));
            yy = 55.54475 + (((tickAnim - 11) / 1) * (74.21291-(55.54475)));
            zz = -33.93988 + (((tickAnim - 11) / 1) * (-51.23871-(-33.93988)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -4.98957 + (((tickAnim - 12) / 1) * (-52.32507-(-4.98957)));
            yy = 74.21291 + (((tickAnim - 12) / 1) * (65.03646-(74.21291)));
            zz = -51.23871 + (((tickAnim - 12) / 1) * (-176.07051-(-51.23871)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -52.32507 + (((tickAnim - 13) / 0) * (-22.97235-(-52.32507)));
            yy = 65.03646 + (((tickAnim - 13) / 0) * (80.63624-(65.03646)));
            zz = -176.07051 + (((tickAnim - 13) / 0) * (-189.99818-(-176.07051)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -22.97235 + (((tickAnim - 13) / 1) * (69.05654-(-22.97235)));
            yy = 80.63624 + (((tickAnim - 13) / 1) * (55.54475-(80.63624)));
            zz = -189.99818 + (((tickAnim - 13) / 1) * (-33.93988-(-189.99818)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 69.05654 + (((tickAnim - 14) / 1) * (-4.98957-(69.05654)));
            yy = 55.54475 + (((tickAnim - 14) / 1) * (74.21291-(55.54475)));
            zz = -33.93988 + (((tickAnim - 14) / 1) * (-51.23871-(-33.93988)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -4.98957 + (((tickAnim - 15) / 1) * (-52.32507-(-4.98957)));
            yy = 74.21291 + (((tickAnim - 15) / 1) * (65.03646-(74.21291)));
            zz = -51.23871 + (((tickAnim - 15) / 1) * (-176.07051-(-51.23871)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -52.32507 + (((tickAnim - 16) / 1) * (-22.97235-(-52.32507)));
            yy = 65.03646 + (((tickAnim - 16) / 1) * (80.63624-(65.03646)));
            zz = -176.07051 + (((tickAnim - 16) / 1) * (-189.99818-(-176.07051)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -22.97235 + (((tickAnim - 17) / 1) * (69.05654-(-22.97235)));
            yy = 80.63624 + (((tickAnim - 17) / 1) * (55.54475-(80.63624)));
            zz = -189.99818 + (((tickAnim - 17) / 1) * (-33.93988-(-189.99818)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 69.05654 + (((tickAnim - 18) / 0) * (-4.98957-(69.05654)));
            yy = 55.54475 + (((tickAnim - 18) / 0) * (74.21291-(55.54475)));
            zz = -33.93988 + (((tickAnim - 18) / 0) * (-51.23871-(-33.93988)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -4.98957 + (((tickAnim - 18) / 1) * (-52.32507-(-4.98957)));
            yy = 74.21291 + (((tickAnim - 18) / 1) * (65.03646-(74.21291)));
            zz = -51.23871 + (((tickAnim - 18) / 1) * (-176.07051-(-51.23871)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -52.32507 + (((tickAnim - 19) / 1) * (-22.97235-(-52.32507)));
            yy = 65.03646 + (((tickAnim - 19) / 1) * (80.63624-(65.03646)));
            zz = -176.07051 + (((tickAnim - 19) / 1) * (-189.99818-(-176.07051)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftHindwingFoldable, leftHindwingFoldable.rotateAngleX + (float) Math.toRadians(0), leftHindwingFoldable.rotateAngleY + (float) Math.toRadians(0), leftHindwingFoldable.rotateAngleZ + (float) Math.toRadians(180));


        this.setRotateAngle(leftHindwingFoldable2, leftHindwingFoldable2.rotateAngleX + (float) Math.toRadians(0), leftHindwingFoldable2.rotateAngleY + (float) Math.toRadians(0), leftHindwingFoldable2.rotateAngleZ + (float) Math.toRadians(180));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 180.55324 + (((tickAnim - 0) / 1) * (104.09619-(180.55324)));
            yy = -83.92432 + (((tickAnim - 0) / 1) * (-32.05274-(-83.92432)));
            zz = -10.55494 + (((tickAnim - 0) / 1) * (14.04061-(-10.55494)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 104.09619 + (((tickAnim - 1) / 1) * (149.36539-(104.09619)));
            yy = -32.05274 + (((tickAnim - 1) / 1) * (-68.56993-(-32.05274)));
            zz = 14.04061 + (((tickAnim - 1) / 1) * (-95.0586-(14.04061)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 149.36539 + (((tickAnim - 2) / 1) * (251.92114-(149.36539)));
            yy = -68.56993 + (((tickAnim - 2) / 1) * (-54.85285-(-68.56993)));
            zz = -95.0586 + (((tickAnim - 2) / 1) * (-165.77192-(-95.0586)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 251.92114 + (((tickAnim - 3) / 0) * (180.55324-(251.92114)));
            yy = -54.85285 + (((tickAnim - 3) / 0) * (-83.92432-(-54.85285)));
            zz = -165.77192 + (((tickAnim - 3) / 0) * (-10.55494-(-165.77192)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 180.55324 + (((tickAnim - 3) / 1) * (104.09619-(180.55324)));
            yy = -83.92432 + (((tickAnim - 3) / 1) * (-32.05274-(-83.92432)));
            zz = -10.55494 + (((tickAnim - 3) / 1) * (14.04061-(-10.55494)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 104.09619 + (((tickAnim - 4) / 1) * (149.36539-(104.09619)));
            yy = -32.05274 + (((tickAnim - 4) / 1) * (-68.56993-(-32.05274)));
            zz = 14.04061 + (((tickAnim - 4) / 1) * (-95.0586-(14.04061)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 149.36539 + (((tickAnim - 5) / 1) * (251.92114-(149.36539)));
            yy = -68.56993 + (((tickAnim - 5) / 1) * (-54.85285-(-68.56993)));
            zz = -95.0586 + (((tickAnim - 5) / 1) * (-165.77192-(-95.0586)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 251.92114 + (((tickAnim - 6) / 1) * (180.55324-(251.92114)));
            yy = -54.85285 + (((tickAnim - 6) / 1) * (-83.92432-(-54.85285)));
            zz = -165.77192 + (((tickAnim - 6) / 1) * (-10.55494-(-165.77192)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 180.55324 + (((tickAnim - 7) / 1) * (104.09619-(180.55324)));
            yy = -83.92432 + (((tickAnim - 7) / 1) * (-32.05274-(-83.92432)));
            zz = -10.55494 + (((tickAnim - 7) / 1) * (14.04061-(-10.55494)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 104.09619 + (((tickAnim - 8) / 0) * (149.36539-(104.09619)));
            yy = -32.05274 + (((tickAnim - 8) / 0) * (-68.56993-(-32.05274)));
            zz = 14.04061 + (((tickAnim - 8) / 0) * (-95.0586-(14.04061)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 149.36539 + (((tickAnim - 8) / 1) * (251.92114-(149.36539)));
            yy = -68.56993 + (((tickAnim - 8) / 1) * (-54.85285-(-68.56993)));
            zz = -95.0586 + (((tickAnim - 8) / 1) * (-165.77192-(-95.0586)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 251.92114 + (((tickAnim - 9) / 1) * (180.55324-(251.92114)));
            yy = -54.85285 + (((tickAnim - 9) / 1) * (-83.92432-(-54.85285)));
            zz = -165.77192 + (((tickAnim - 9) / 1) * (-10.55494-(-165.77192)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 180.55324 + (((tickAnim - 10) / 1) * (104.09619-(180.55324)));
            yy = -83.92432 + (((tickAnim - 10) / 1) * (-32.05274-(-83.92432)));
            zz = -10.55494 + (((tickAnim - 10) / 1) * (14.04061-(-10.55494)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 104.09619 + (((tickAnim - 11) / 1) * (149.36539-(104.09619)));
            yy = -32.05274 + (((tickAnim - 11) / 1) * (-68.56993-(-32.05274)));
            zz = 14.04061 + (((tickAnim - 11) / 1) * (-95.0586-(14.04061)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 149.36539 + (((tickAnim - 12) / 1) * (251.92114-(149.36539)));
            yy = -68.56993 + (((tickAnim - 12) / 1) * (-54.85285-(-68.56993)));
            zz = -95.0586 + (((tickAnim - 12) / 1) * (-165.77192-(-95.0586)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 251.92114 + (((tickAnim - 13) / 0) * (180.55324-(251.92114)));
            yy = -54.85285 + (((tickAnim - 13) / 0) * (-83.92432-(-54.85285)));
            zz = -165.77192 + (((tickAnim - 13) / 0) * (-10.55494-(-165.77192)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 180.55324 + (((tickAnim - 13) / 1) * (104.09619-(180.55324)));
            yy = -83.92432 + (((tickAnim - 13) / 1) * (-32.05274-(-83.92432)));
            zz = -10.55494 + (((tickAnim - 13) / 1) * (14.04061-(-10.55494)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 104.09619 + (((tickAnim - 14) / 1) * (149.36539-(104.09619)));
            yy = -32.05274 + (((tickAnim - 14) / 1) * (-68.56993-(-32.05274)));
            zz = 14.04061 + (((tickAnim - 14) / 1) * (-95.0586-(14.04061)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 149.36539 + (((tickAnim - 15) / 1) * (251.92114-(149.36539)));
            yy = -68.56993 + (((tickAnim - 15) / 1) * (-54.85285-(-68.56993)));
            zz = -95.0586 + (((tickAnim - 15) / 1) * (-165.77192-(-95.0586)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 251.92114 + (((tickAnim - 16) / 1) * (180.55324-(251.92114)));
            yy = -54.85285 + (((tickAnim - 16) / 1) * (-83.92432-(-54.85285)));
            zz = -165.77192 + (((tickAnim - 16) / 1) * (-10.55494-(-165.77192)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 180.55324 + (((tickAnim - 17) / 1) * (104.09619-(180.55324)));
            yy = -83.92432 + (((tickAnim - 17) / 1) * (-32.05274-(-83.92432)));
            zz = -10.55494 + (((tickAnim - 17) / 1) * (14.04061-(-10.55494)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 104.09619 + (((tickAnim - 18) / 0) * (149.36539-(104.09619)));
            yy = -32.05274 + (((tickAnim - 18) / 0) * (-68.56993-(-32.05274)));
            zz = 14.04061 + (((tickAnim - 18) / 0) * (-95.0586-(14.04061)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 149.36539 + (((tickAnim - 18) / 1) * (251.92114-(149.36539)));
            yy = -68.56993 + (((tickAnim - 18) / 1) * (-54.85285-(-68.56993)));
            zz = -95.0586 + (((tickAnim - 18) / 1) * (-165.77192-(-95.0586)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 251.92114 + (((tickAnim - 19) / 1) * (180.55324-(251.92114)));
            yy = -54.85285 + (((tickAnim - 19) / 1) * (-83.92432-(-54.85285)));
            zz = -165.77192 + (((tickAnim - 19) / 1) * (-10.55494-(-165.77192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -22.97235 + (((tickAnim - 0) / 1) * (69.05654-(-22.97235)));
            yy = -80.63624 + (((tickAnim - 0) / 1) * (-55.54475-(-80.63624)));
            zz = 189.99818 + (((tickAnim - 0) / 1) * (33.93988-(189.99818)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 69.05654 + (((tickAnim - 1) / 1) * (-4.98957-(69.05654)));
            yy = -55.54475 + (((tickAnim - 1) / 1) * (-74.21291-(-55.54475)));
            zz = 33.93988 + (((tickAnim - 1) / 1) * (51.23871-(33.93988)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -4.98957 + (((tickAnim - 2) / 1) * (-52.32507-(-4.98957)));
            yy = -74.21291 + (((tickAnim - 2) / 1) * (-65.03646-(-74.21291)));
            zz = 51.23871 + (((tickAnim - 2) / 1) * (176.07051-(51.23871)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -52.32507 + (((tickAnim - 3) / 0) * (-22.97235-(-52.32507)));
            yy = -65.03646 + (((tickAnim - 3) / 0) * (-80.63624-(-65.03646)));
            zz = 176.07051 + (((tickAnim - 3) / 0) * (189.99818-(176.07051)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -22.97235 + (((tickAnim - 3) / 1) * (69.05654-(-22.97235)));
            yy = -80.63624 + (((tickAnim - 3) / 1) * (-55.54475-(-80.63624)));
            zz = 189.99818 + (((tickAnim - 3) / 1) * (33.93988-(189.99818)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 69.05654 + (((tickAnim - 4) / 1) * (-4.98957-(69.05654)));
            yy = -55.54475 + (((tickAnim - 4) / 1) * (-74.21291-(-55.54475)));
            zz = 33.93988 + (((tickAnim - 4) / 1) * (51.23871-(33.93988)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -4.98957 + (((tickAnim - 5) / 1) * (-52.32507-(-4.98957)));
            yy = -74.21291 + (((tickAnim - 5) / 1) * (-65.03646-(-74.21291)));
            zz = 51.23871 + (((tickAnim - 5) / 1) * (176.07051-(51.23871)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -52.32507 + (((tickAnim - 6) / 1) * (-22.97235-(-52.32507)));
            yy = -65.03646 + (((tickAnim - 6) / 1) * (-80.63624-(-65.03646)));
            zz = 176.07051 + (((tickAnim - 6) / 1) * (189.99818-(176.07051)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -22.97235 + (((tickAnim - 7) / 1) * (69.05654-(-22.97235)));
            yy = -80.63624 + (((tickAnim - 7) / 1) * (-55.54475-(-80.63624)));
            zz = 189.99818 + (((tickAnim - 7) / 1) * (33.93988-(189.99818)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 69.05654 + (((tickAnim - 8) / 0) * (-4.98957-(69.05654)));
            yy = -55.54475 + (((tickAnim - 8) / 0) * (-74.21291-(-55.54475)));
            zz = 33.93988 + (((tickAnim - 8) / 0) * (51.23871-(33.93988)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -4.98957 + (((tickAnim - 8) / 1) * (-52.32507-(-4.98957)));
            yy = -74.21291 + (((tickAnim - 8) / 1) * (-65.03646-(-74.21291)));
            zz = 51.23871 + (((tickAnim - 8) / 1) * (176.07051-(51.23871)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -52.32507 + (((tickAnim - 9) / 1) * (-22.97235-(-52.32507)));
            yy = -65.03646 + (((tickAnim - 9) / 1) * (-80.63624-(-65.03646)));
            zz = 176.07051 + (((tickAnim - 9) / 1) * (189.99818-(176.07051)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -22.97235 + (((tickAnim - 10) / 1) * (69.05654-(-22.97235)));
            yy = -80.63624 + (((tickAnim - 10) / 1) * (-55.54475-(-80.63624)));
            zz = 189.99818 + (((tickAnim - 10) / 1) * (33.93988-(189.99818)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 69.05654 + (((tickAnim - 11) / 1) * (-4.98957-(69.05654)));
            yy = -55.54475 + (((tickAnim - 11) / 1) * (-74.21291-(-55.54475)));
            zz = 33.93988 + (((tickAnim - 11) / 1) * (51.23871-(33.93988)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -4.98957 + (((tickAnim - 12) / 1) * (-52.32507-(-4.98957)));
            yy = -74.21291 + (((tickAnim - 12) / 1) * (-65.03646-(-74.21291)));
            zz = 51.23871 + (((tickAnim - 12) / 1) * (176.07051-(51.23871)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -52.32507 + (((tickAnim - 13) / 0) * (-22.97235-(-52.32507)));
            yy = -65.03646 + (((tickAnim - 13) / 0) * (-80.63624-(-65.03646)));
            zz = 176.07051 + (((tickAnim - 13) / 0) * (189.99818-(176.07051)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -22.97235 + (((tickAnim - 13) / 1) * (69.05654-(-22.97235)));
            yy = -80.63624 + (((tickAnim - 13) / 1) * (-55.54475-(-80.63624)));
            zz = 189.99818 + (((tickAnim - 13) / 1) * (33.93988-(189.99818)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 69.05654 + (((tickAnim - 14) / 1) * (-4.98957-(69.05654)));
            yy = -55.54475 + (((tickAnim - 14) / 1) * (-74.21291-(-55.54475)));
            zz = 33.93988 + (((tickAnim - 14) / 1) * (51.23871-(33.93988)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -4.98957 + (((tickAnim - 15) / 1) * (-52.32507-(-4.98957)));
            yy = -74.21291 + (((tickAnim - 15) / 1) * (-65.03646-(-74.21291)));
            zz = 51.23871 + (((tickAnim - 15) / 1) * (176.07051-(51.23871)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -52.32507 + (((tickAnim - 16) / 1) * (-22.97235-(-52.32507)));
            yy = -65.03646 + (((tickAnim - 16) / 1) * (-80.63624-(-65.03646)));
            zz = 176.07051 + (((tickAnim - 16) / 1) * (189.99818-(176.07051)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -22.97235 + (((tickAnim - 17) / 1) * (69.05654-(-22.97235)));
            yy = -80.63624 + (((tickAnim - 17) / 1) * (-55.54475-(-80.63624)));
            zz = 189.99818 + (((tickAnim - 17) / 1) * (33.93988-(189.99818)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 69.05654 + (((tickAnim - 18) / 0) * (-4.98957-(69.05654)));
            yy = -55.54475 + (((tickAnim - 18) / 0) * (-74.21291-(-55.54475)));
            zz = 33.93988 + (((tickAnim - 18) / 0) * (51.23871-(33.93988)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -4.98957 + (((tickAnim - 18) / 1) * (-52.32507-(-4.98957)));
            yy = -74.21291 + (((tickAnim - 18) / 1) * (-65.03646-(-74.21291)));
            zz = 51.23871 + (((tickAnim - 18) / 1) * (176.07051-(51.23871)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -52.32507 + (((tickAnim - 19) / 1) * (-22.97235-(-52.32507)));
            yy = -65.03646 + (((tickAnim - 19) / 1) * (-80.63624-(-65.03646)));
            zz = 176.07051 + (((tickAnim - 19) / 1) * (189.99818-(176.07051)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightHindwingFoldable, rightHindwingFoldable.rotateAngleX + (float) Math.toRadians(0), rightHindwingFoldable.rotateAngleY + (float) Math.toRadians(0), rightHindwingFoldable.rotateAngleZ + (float) Math.toRadians(-180));


        this.setRotateAngle(rightHindwingFoldable2, rightHindwingFoldable2.rotateAngleX + (float) Math.toRadians(0), rightHindwingFoldable2.rotateAngleY + (float) Math.toRadians(0), rightHindwingFoldable2.rotateAngleZ + (float) Math.toRadians(-180));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*10), rightAntenna.rotateAngleY + (float) Math.toRadians(0), rightAntenna.rotateAngleZ + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*10));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(-34.9707), rightLeg1.rotateAngleY + (float) Math.toRadians(16.14796), rightLeg1.rotateAngleZ + (float) Math.toRadians(61.31648));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(2.82204), rightLeg2.rotateAngleY + (float) Math.toRadians(16.47352), rightLeg2.rotateAngleZ + (float) Math.toRadians(-4.3254));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(-94.20684), rightLeg3.rotateAngleY + (float) Math.toRadians(2.9248663134+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3), rightLeg3.rotateAngleZ + (float) Math.toRadians(-87.2076945358-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*5));


        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(-8.03798), rightLeg32.rotateAngleY + (float) Math.toRadians(8.55172), rightLeg32.rotateAngleZ + (float) Math.toRadians(55.08481));
        
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLocustopsis entity = (EntityPrehistoricFloraLocustopsis) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+150))*1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+60))*2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+60))*0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -10.08 + (((tickAnim - 0) / 2) * (-7.81997-(-10.08)));
            yy = 1.48 + (((tickAnim - 0) / 2) * (24.62103-(1.48)));
            zz = -18.78 + (((tickAnim - 0) / 2) * (3.22909-(-18.78)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -7.81997 + (((tickAnim - 2) / 7) * (25.13841-(-7.81997)));
            yy = 24.62103 + (((tickAnim - 2) / 7) * (-47.40152-(24.62103)));
            zz = 3.22909 + (((tickAnim - 2) / 7) * (11.17065-(3.22909)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 25.13841 + (((tickAnim - 9) / 4) * (-12.34416-(25.13841)));
            yy = -47.40152 + (((tickAnim - 9) / 4) * (-21.65957-(-47.40152)));
            zz = 11.17065 + (((tickAnim - 9) / 4) * (-40.78557-(11.17065)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -12.34416 + (((tickAnim - 13) / 2) * (-10.08-(-12.34416)));
            yy = -21.65957 + (((tickAnim - 13) / 2) * (1.48-(-21.65957)));
            zz = -40.78557 + (((tickAnim - 13) / 2) * (-18.78-(-40.78557)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 13.14 + (((tickAnim - 0) / 2) * (20.15595-(13.14)));
            yy = -19.83 + (((tickAnim - 0) / 2) * (-38.14083-(-19.83)));
            zz = -5.1 + (((tickAnim - 0) / 2) * (-9.8504-(-5.1)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 20.15595 + (((tickAnim - 2) / 4) * (8.28625-(20.15595)));
            yy = -38.14083 + (((tickAnim - 2) / 4) * (6.00755-(-38.14083)));
            zz = -9.8504 + (((tickAnim - 2) / 4) * (-37.98411-(-9.8504)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 8.28625 + (((tickAnim - 6) / 3) * (-3.2342-(8.28625)));
            yy = 6.00755 + (((tickAnim - 6) / 3) * (22.90786-(6.00755)));
            zz = -37.98411 + (((tickAnim - 6) / 3) * (5.99975-(-37.98411)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -3.2342 + (((tickAnim - 9) / 6) * (13.14-(-3.2342)));
            yy = 22.90786 + (((tickAnim - 9) / 6) * (-19.83-(22.90786)));
            zz = 5.99975 + (((tickAnim - 9) / 6) * (-5.1-(5.99975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.48 + (((tickAnim - 0) / 2) * (-11.65343-(3.48)));
            yy = 19.92 + (((tickAnim - 0) / 2) * (14.32171-(19.92)));
            zz = -10.14 + (((tickAnim - 0) / 2) * (-4.67632-(-10.14)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -11.65343 + (((tickAnim - 2) / 7) * (-6.30296-(-11.65343)));
            yy = 14.32171 + (((tickAnim - 2) / 7) * (-9.35096-(14.32171)));
            zz = -4.67632 + (((tickAnim - 2) / 7) * (10.9065-(-4.67632)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -6.30296 + (((tickAnim - 9) / 4) * (13.56303-(-6.30296)));
            yy = -9.35096 + (((tickAnim - 9) / 4) * (23.65267-(-9.35096)));
            zz = 10.9065 + (((tickAnim - 9) / 4) * (-13.77983-(10.9065)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 13.56303 + (((tickAnim - 13) / 2) * (3.48-(13.56303)));
            yy = 23.65267 + (((tickAnim - 13) / 2) * (19.92-(23.65267)));
            zz = -13.77983 + (((tickAnim - 13) / 2) * (-10.14-(-13.77983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5.12 + (((tickAnim - 0) / 2) * (-6.39362-(-5.12)));
            yy = -0.83 + (((tickAnim - 0) / 2) * (-2.51417-(-0.83)));
            zz = 4.62 + (((tickAnim - 0) / 2) * (16.47637-(4.62)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -6.39362 + (((tickAnim - 2) / 7) * (-2.15394-(-6.39362)));
            yy = -2.51417 + (((tickAnim - 2) / 7) * (3.09812-(-2.51417)));
            zz = 16.47637 + (((tickAnim - 2) / 7) * (-23.02884-(16.47637)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -2.15394 + (((tickAnim - 9) / 6) * (-5.12-(-2.15394)));
            yy = 3.09812 + (((tickAnim - 9) / 6) * (-0.83-(3.09812)));
            zz = -23.02884 + (((tickAnim - 9) / 6) * (4.62-(-23.02884)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(xx), leftLeg32.rotateAngleY + (float) Math.toRadians(yy), leftLeg32.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+60))*5), leftAntenna.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+90))*2.5), leftAntenna.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+120))*2.5));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+120))*5), rightAntenna.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2.5), rightAntenna.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+180))*2.5));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.81 + (((tickAnim - 0) / 2) * (25.13841-(17.81)));
            yy = 31.4 + (((tickAnim - 0) / 2) * (47.40152-(31.4)));
            zz = -9.41 + (((tickAnim - 0) / 2) * (-11.17065-(-9.41)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 25.13841 + (((tickAnim - 2) / 3) * (-12.34416-(25.13841)));
            yy = 47.40152 + (((tickAnim - 2) / 3) * (21.65957-(47.40152)));
            zz = -11.17065 + (((tickAnim - 2) / 3) * (40.78557-(-11.17065)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -12.34416 + (((tickAnim - 5) / 4) * (-7.81997-(-12.34416)));
            yy = 21.65957 + (((tickAnim - 5) / 4) * (-24.62103-(21.65957)));
            zz = 40.78557 + (((tickAnim - 5) / 4) * (-3.22909-(40.78557)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -7.81997 + (((tickAnim - 9) / 6) * (17.81-(-7.81997)));
            yy = -24.62103 + (((tickAnim - 9) / 6) * (31.4-(-24.62103)));
            zz = -3.22909 + (((tickAnim - 9) / 6) * (-9.41-(-3.22909)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.53 + (((tickAnim - 0) / 2) * (-3.2342-(2.53)));
            yy = -14.46 + (((tickAnim - 0) / 2) * (-22.90786-(-14.46)));
            zz = 15.99 + (((tickAnim - 0) / 2) * (-5.99975-(15.99)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -3.2342 + (((tickAnim - 2) / 7) * (20.15595-(-3.2342)));
            yy = -22.90786 + (((tickAnim - 2) / 7) * (38.14083-(-22.90786)));
            zz = -5.99975 + (((tickAnim - 2) / 7) * (9.8504-(-5.99975)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.15595 + (((tickAnim - 9) / 4) * (8.28625-(20.15595)));
            yy = 38.14083 + (((tickAnim - 9) / 4) * (-6.00755-(38.14083)));
            zz = 9.8504 + (((tickAnim - 9) / 4) * (37.98411-(9.8504)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.28625 + (((tickAnim - 13) / 2) * (2.53-(8.28625)));
            yy = -6.00755 + (((tickAnim - 13) / 2) * (-14.46-(-6.00755)));
            zz = 37.98411 + (((tickAnim - 13) / 2) * (15.99-(37.98411)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.49 + (((tickAnim - 0) / 2) * (-6.30296-(-7.49)));
            yy = 4.09 + (((tickAnim - 0) / 2) * (9.35096-(4.09)));
            zz = -7.44 + (((tickAnim - 0) / 2) * (-10.9065-(-7.44)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -6.30296 + (((tickAnim - 2) / 3) * (13.56303-(-6.30296)));
            yy = 9.35096 + (((tickAnim - 2) / 3) * (-23.65267-(9.35096)));
            zz = -10.9065 + (((tickAnim - 2) / 3) * (13.77983-(-10.9065)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 13.56303 + (((tickAnim - 5) / 4) * (-11.65343-(13.56303)));
            yy = -23.65267 + (((tickAnim - 5) / 4) * (-14.32171-(-23.65267)));
            zz = 13.77983 + (((tickAnim - 5) / 4) * (4.67632-(13.77983)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -11.65343 + (((tickAnim - 9) / 6) * (-7.49-(-11.65343)));
            yy = -14.32171 + (((tickAnim - 9) / 6) * (4.09-(-14.32171)));
            zz = 4.67632 + (((tickAnim - 9) / 6) * (-7.44-(4.67632)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -3.1 + (((tickAnim - 0) / 2) * (-2.15394-(-3.1)));
            yy = -1.85 + (((tickAnim - 0) / 2) * (-3.09812-(-1.85)));
            zz = 14.25 + (((tickAnim - 0) / 2) * (23.02884-(14.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -2.15394 + (((tickAnim - 2) / 7) * (-6.39362-(-2.15394)));
            yy = -3.09812 + (((tickAnim - 2) / 7) * (2.51417-(-3.09812)));
            zz = 23.02884 + (((tickAnim - 2) / 7) * (-16.47637-(23.02884)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -6.39362 + (((tickAnim - 9) / 6) * (-3.1-(-6.39362)));
            yy = 2.51417 + (((tickAnim - 9) / 6) * (-1.85-(2.51417)));
            zz = -16.47637 + (((tickAnim - 9) / 6) * (14.25-(-16.47637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(xx), rightLeg32.rotateAngleY + (float) Math.toRadians(yy), rightLeg32.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraLocustopsis entity = (EntityPrehistoricFloraLocustopsis) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+150))*1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+60))*2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+60))*0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -10.08 + (((tickAnim - 0) / 2) * (-7.81997-(-10.08)));
            yy = 1.48 + (((tickAnim - 0) / 2) * (24.62103-(1.48)));
            zz = -18.78 + (((tickAnim - 0) / 2) * (3.22909-(-18.78)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -7.81997 + (((tickAnim - 2) / 7) * (25.13841-(-7.81997)));
            yy = 24.62103 + (((tickAnim - 2) / 7) * (-47.40152-(24.62103)));
            zz = 3.22909 + (((tickAnim - 2) / 7) * (11.17065-(3.22909)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 25.13841 + (((tickAnim - 9) / 4) * (-12.34416-(25.13841)));
            yy = -47.40152 + (((tickAnim - 9) / 4) * (-21.65957-(-47.40152)));
            zz = 11.17065 + (((tickAnim - 9) / 4) * (-40.78557-(11.17065)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -12.34416 + (((tickAnim - 13) / 2) * (-10.08-(-12.34416)));
            yy = -21.65957 + (((tickAnim - 13) / 2) * (1.48-(-21.65957)));
            zz = -40.78557 + (((tickAnim - 13) / 2) * (-18.78-(-40.78557)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 13.14 + (((tickAnim - 0) / 2) * (20.15595-(13.14)));
            yy = -19.83 + (((tickAnim - 0) / 2) * (-38.14083-(-19.83)));
            zz = -5.1 + (((tickAnim - 0) / 2) * (-9.8504-(-5.1)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 20.15595 + (((tickAnim - 2) / 4) * (8.28625-(20.15595)));
            yy = -38.14083 + (((tickAnim - 2) / 4) * (6.00755-(-38.14083)));
            zz = -9.8504 + (((tickAnim - 2) / 4) * (-37.98411-(-9.8504)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 8.28625 + (((tickAnim - 6) / 3) * (-3.2342-(8.28625)));
            yy = 6.00755 + (((tickAnim - 6) / 3) * (22.90786-(6.00755)));
            zz = -37.98411 + (((tickAnim - 6) / 3) * (5.99975-(-37.98411)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -3.2342 + (((tickAnim - 9) / 6) * (13.14-(-3.2342)));
            yy = 22.90786 + (((tickAnim - 9) / 6) * (-19.83-(22.90786)));
            zz = 5.99975 + (((tickAnim - 9) / 6) * (-5.1-(5.99975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.48 + (((tickAnim - 0) / 2) * (-11.65343-(3.48)));
            yy = 19.92 + (((tickAnim - 0) / 2) * (14.32171-(19.92)));
            zz = -10.14 + (((tickAnim - 0) / 2) * (-4.67632-(-10.14)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -11.65343 + (((tickAnim - 2) / 7) * (-6.30296-(-11.65343)));
            yy = 14.32171 + (((tickAnim - 2) / 7) * (-9.35096-(14.32171)));
            zz = -4.67632 + (((tickAnim - 2) / 7) * (10.9065-(-4.67632)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -6.30296 + (((tickAnim - 9) / 4) * (13.56303-(-6.30296)));
            yy = -9.35096 + (((tickAnim - 9) / 4) * (23.65267-(-9.35096)));
            zz = 10.9065 + (((tickAnim - 9) / 4) * (-13.77983-(10.9065)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 13.56303 + (((tickAnim - 13) / 2) * (3.48-(13.56303)));
            yy = 23.65267 + (((tickAnim - 13) / 2) * (19.92-(23.65267)));
            zz = -13.77983 + (((tickAnim - 13) / 2) * (-10.14-(-13.77983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5.12 + (((tickAnim - 0) / 2) * (-6.39362-(-5.12)));
            yy = -0.83 + (((tickAnim - 0) / 2) * (-2.51417-(-0.83)));
            zz = 4.62 + (((tickAnim - 0) / 2) * (16.47637-(4.62)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -6.39362 + (((tickAnim - 2) / 7) * (-2.15394-(-6.39362)));
            yy = -2.51417 + (((tickAnim - 2) / 7) * (3.09812-(-2.51417)));
            zz = 16.47637 + (((tickAnim - 2) / 7) * (-23.02884-(16.47637)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -2.15394 + (((tickAnim - 9) / 6) * (-5.12-(-2.15394)));
            yy = 3.09812 + (((tickAnim - 9) / 6) * (-0.83-(3.09812)));
            zz = -23.02884 + (((tickAnim - 9) / 6) * (4.62-(-23.02884)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(xx), leftLeg32.rotateAngleY + (float) Math.toRadians(yy), leftLeg32.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+60))*5), leftAntenna.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+90))*2.5), leftAntenna.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+120))*2.5));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+120))*5), rightAntenna.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2.5), rightAntenna.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+180))*2.5));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.81 + (((tickAnim - 0) / 2) * (25.13841-(17.81)));
            yy = 31.4 + (((tickAnim - 0) / 2) * (47.40152-(31.4)));
            zz = -9.41 + (((tickAnim - 0) / 2) * (-11.17065-(-9.41)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 25.13841 + (((tickAnim - 2) / 3) * (-12.34416-(25.13841)));
            yy = 47.40152 + (((tickAnim - 2) / 3) * (21.65957-(47.40152)));
            zz = -11.17065 + (((tickAnim - 2) / 3) * (40.78557-(-11.17065)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -12.34416 + (((tickAnim - 5) / 4) * (-7.81997-(-12.34416)));
            yy = 21.65957 + (((tickAnim - 5) / 4) * (-24.62103-(21.65957)));
            zz = 40.78557 + (((tickAnim - 5) / 4) * (-3.22909-(40.78557)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -7.81997 + (((tickAnim - 9) / 6) * (17.81-(-7.81997)));
            yy = -24.62103 + (((tickAnim - 9) / 6) * (31.4-(-24.62103)));
            zz = -3.22909 + (((tickAnim - 9) / 6) * (-9.41-(-3.22909)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.53 + (((tickAnim - 0) / 2) * (-3.2342-(2.53)));
            yy = -14.46 + (((tickAnim - 0) / 2) * (-22.90786-(-14.46)));
            zz = 15.99 + (((tickAnim - 0) / 2) * (-5.99975-(15.99)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -3.2342 + (((tickAnim - 2) / 7) * (20.15595-(-3.2342)));
            yy = -22.90786 + (((tickAnim - 2) / 7) * (38.14083-(-22.90786)));
            zz = -5.99975 + (((tickAnim - 2) / 7) * (9.8504-(-5.99975)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.15595 + (((tickAnim - 9) / 4) * (8.28625-(20.15595)));
            yy = 38.14083 + (((tickAnim - 9) / 4) * (-6.00755-(38.14083)));
            zz = 9.8504 + (((tickAnim - 9) / 4) * (37.98411-(9.8504)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.28625 + (((tickAnim - 13) / 2) * (2.53-(8.28625)));
            yy = -6.00755 + (((tickAnim - 13) / 2) * (-14.46-(-6.00755)));
            zz = 37.98411 + (((tickAnim - 13) / 2) * (15.99-(37.98411)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.49 + (((tickAnim - 0) / 2) * (-6.30296-(-7.49)));
            yy = 4.09 + (((tickAnim - 0) / 2) * (9.35096-(4.09)));
            zz = -7.44 + (((tickAnim - 0) / 2) * (-10.9065-(-7.44)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -6.30296 + (((tickAnim - 2) / 3) * (13.56303-(-6.30296)));
            yy = 9.35096 + (((tickAnim - 2) / 3) * (-23.65267-(9.35096)));
            zz = -10.9065 + (((tickAnim - 2) / 3) * (13.77983-(-10.9065)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 13.56303 + (((tickAnim - 5) / 4) * (-11.65343-(13.56303)));
            yy = -23.65267 + (((tickAnim - 5) / 4) * (-14.32171-(-23.65267)));
            zz = 13.77983 + (((tickAnim - 5) / 4) * (4.67632-(13.77983)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -11.65343 + (((tickAnim - 9) / 6) * (-7.49-(-11.65343)));
            yy = -14.32171 + (((tickAnim - 9) / 6) * (4.09-(-14.32171)));
            zz = 4.67632 + (((tickAnim - 9) / 6) * (-7.44-(4.67632)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -3.1 + (((tickAnim - 0) / 2) * (-2.15394-(-3.1)));
            yy = -1.85 + (((tickAnim - 0) / 2) * (-3.09812-(-1.85)));
            zz = 14.25 + (((tickAnim - 0) / 2) * (23.02884-(14.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -2.15394 + (((tickAnim - 2) / 7) * (-6.39362-(-2.15394)));
            yy = -3.09812 + (((tickAnim - 2) / 7) * (2.51417-(-3.09812)));
            zz = 23.02884 + (((tickAnim - 2) / 7) * (-16.47637-(23.02884)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -6.39362 + (((tickAnim - 9) / 6) * (-3.1-(-6.39362)));
            yy = 2.51417 + (((tickAnim - 9) / 6) * (-1.85-(2.51417)));
            zz = -16.47637 + (((tickAnim - 9) / 6) * (14.25-(-16.47637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(xx), rightLeg32.rotateAngleY + (float) Math.toRadians(yy), rightLeg32.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
