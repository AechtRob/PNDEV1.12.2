package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYiQi;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelYiQi extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer featherRight;
    private final AdvancedModelRenderer featherRight2;
    private final AdvancedModelRenderer featherLeft;
    private final AdvancedModelRenderer featherLeft2;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer WingR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer HandwingR;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer WingL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer HandwingL;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer ToesL;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer UpperLegL2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer LowerLegL2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer FootL2;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer ToesL2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer bb_main;

    private ModelAnimator animator;

    public ModelYiQi() {
        this.textureWidth = 72;
        this.textureHeight = 70;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 11.0F, 3.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.5F, 0.1F, -2.0F);
        this.root.addChild(hips);


        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(-1.0F, -2.0F, -1.0F);
        this.hips.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.192F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 56, 12, -1.0F, 6.1913F, -0.1317F, 3, 1, 5, 0.01F, false));
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 46, 0, -1.5F, 0.1913F, -0.1317F, 4, 6, 5, 0.01F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(-0.5F, -0.35F, 3.5F);
        this.hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.096F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 47, 59, -1.0F, -0.1F, -0.4F, 2, 2, 3, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.25F, 2.6F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.2182F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 59, -1.0F, 0.0F, -0.6F, 1, 1, 4, 0.0F, false));

        this.featherRight = new AdvancedModelRenderer(this);
        this.featherRight.setRotationPoint(-0.5F, 0.05F, 2.0F);
        this.Tail2.addChild(featherRight);
        this.setRotateAngle(featherRight, 0.0F, -0.2182F, 0.0F);
        this.featherRight.cubeList.add(new ModelBox(featherRight, 0, 19, -0.5F, 0.0F, 0.0F, 1, 0, 16, 0.0F, false));

        this.featherRight2 = new AdvancedModelRenderer(this);
        this.featherRight2.setRotationPoint(-0.5F, 0.0F, 3.0F);
        this.Tail2.addChild(featherRight2);
        this.setRotateAngle(featherRight2, 0.0F, -0.0436F, 0.0F);
        this.featherRight2.cubeList.add(new ModelBox(featherRight2, 0, 0, -0.5F, 0.0F, 0.0F, 1, 0, 18, 0.0F, false));

        this.featherLeft = new AdvancedModelRenderer(this);
        this.featherLeft.setRotationPoint(0.5F, 0.05F, 2.0F);
        this.Tail2.addChild(featherLeft);
        this.setRotateAngle(featherLeft, 0.0F, 0.2182F, 0.0F);
        this.featherLeft.cubeList.add(new ModelBox(featherLeft, 0, 19, -0.5F, 0.0F, 0.0F, 1, 0, 16, 0.0F, true));

        this.featherLeft2 = new AdvancedModelRenderer(this);
        this.featherLeft2.setRotationPoint(0.5F, 0.0F, 3.0F);
        this.Tail2.addChild(featherLeft2);
        this.setRotateAngle(featherLeft2, 0.0F, 0.0436F, 0.0F);
        this.featherLeft2.cubeList.add(new ModelBox(featherLeft2, 0, 0, -0.5F, 0.0F, 0.0F, 1, 0, 18, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 1.3F, -1.0F);
        this.hips.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 47, 31, -2.5F, -3.1F, -5.0F, 4, 5, 5, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 22, -2.0F, -1.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.Body.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 47, 42, -2.0F, 0.0F, -1.0F, 3, 4, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.Chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 13, -1.5F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-1.9F, 3.05F, -0.85F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.3348F, -0.3299F, 0.1667F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 46, 12, -0.3614F, -0.9791F, -0.0262F, 1, 2, 7, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.UpperArmR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 48, 0.05F, -3.0F, -1.0F, 0, 3, 7, 0.0F, true));

        this.WingR = new AdvancedModelRenderer(this);
        this.WingR.setRotationPoint(0.0636F, -0.7291F, 5.9738F);
        this.UpperArmR.addChild(WingR);
        this.setRotateAngle(WingR, 0.0F, 0.0F, 0.6981F);
        this.WingR.cubeList.add(new ModelBox(WingR, 0, 0, -0.125F, -5.0F, -6.0F, 0, 5, 8, 0.0F, true));
        this.WingR.cubeList.add(new ModelBox(WingR, 0, 19, -0.025F, -5.0F, -5.0F, 0, 5, 7, 0.0F, true));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(0.6386F, 0.2709F, 6.9738F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -0.8727F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 6.0F, -0.25F);
        this.LowerArmR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5018F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 0, -0.575F, -6.0F, 0.0F, 0, 7, 3, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 57, -0.575F, -6.0F, 0.0F, 0, 7, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.25F, -0.4F, -0.2F);
        this.LowerArmR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.4835F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 39, -0.85F, -8.275F, -3.0F, 0, 8, 9, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 49, 50, -1.25F, -0.35F, 0.0F, 1, 1, 7, -0.001F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-0.6F, 6.5F, -0.4F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 1.0036F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.HandR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 0, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandR.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.0344F, -0.0168F, -0.0997F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 58, -0.4F, 0.15F, -0.75F, 1, 10, 1, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandR.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4209F, 0.0956F, -0.1667F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.375F, 0.15F, -2.5F, 0, 4, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandR.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4304F, 0.0234F, -0.0075F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 59, -0.4F, -0.6F, -1.0F, 1, 7, 1, 0.0F, true));

        this.HandwingR = new AdvancedModelRenderer(this);
        this.HandwingR.setRotationPoint(-0.4F, 0.8F, 1.5F);
        this.HandR.addChild(HandwingR);
        this.setRotateAngle(HandwingR, 0.4363F, -0.0873F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.HandwingR.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.5708F, 0.0873F, -0.0873F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 36, -0.65F, -10.4127F, -1.6518F, 0, 11, 10, 0.0F, true));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(0.9F, 3.05F, -0.85F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.3348F, 0.3299F, -0.1667F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 46, 12, -0.6386F, -0.9791F, -0.0262F, 1, 2, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.UpperArmL.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 48, -0.05F, -3.0F, -1.0F, 0, 3, 7, 0.0F, false));

        this.WingL = new AdvancedModelRenderer(this);
        this.WingL.setRotationPoint(-0.0636F, -0.7291F, 5.9738F);
        this.UpperArmL.addChild(WingL);
        this.setRotateAngle(WingL, 0.0F, 0.0F, -0.6981F);
        this.WingL.cubeList.add(new ModelBox(WingL, 0, 0, 0.125F, -5.0F, -6.0F, 0, 5, 8, 0.0F, false));
        this.WingL.cubeList.add(new ModelBox(WingL, 0, 19, 0.025F, -5.0F, -5.0F, 0, 5, 7, 0.0F, false));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(-0.6386F, 0.2709F, 6.9738F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.8727F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 6.0F, -0.25F);
        this.LowerArmL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5018F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 0, 0.575F, -6.0F, 0.0F, 0, 7, 3, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 57, 0.575F, -6.0F, 0.0F, 0, 7, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.25F, -0.4F, -0.2F);
        this.LowerArmL.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.4835F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 39, 0.85F, -8.275F, -3.0F, 0, 8, 9, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 50, 0.25F, -0.35F, 0.0F, 1, 1, 7, -0.001F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.6F, 6.5F, -0.4F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 1.0036F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.HandL.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4363F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 0, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandL.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.0344F, 0.0168F, 0.0997F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 58, -0.6F, 0.15F, -0.75F, 1, 10, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandL.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4209F, -0.0956F, 0.1667F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.375F, 0.15F, -2.5F, 0, 4, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandL.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4304F, -0.0234F, 0.0075F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 27, 59, -0.6F, -0.6F, -1.0F, 1, 7, 1, 0.0F, false));

        this.HandwingL = new AdvancedModelRenderer(this);
        this.HandwingL.setRotationPoint(0.4F, 0.8F, 1.5F);
        this.HandL.addChild(HandwingL);
        this.setRotateAngle(HandwingL, 0.4363F, 0.0873F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.HandwingL.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.5708F, -0.0873F, 0.0873F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 36, 0.65F, -10.4127F, -1.6518F, 0, 11, 10, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.7F, -0.5F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.3054F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.7409F, 0.4629F);
        this.Neck1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.7156F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 42, -1.5F, 3.75F, -0.65F, 2, 1, 2, 0.001F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 58, -1.5F, 0.75F, -0.65F, 2, 3, 3, 0.001F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(-0.6F, 0.5591F, -0.4371F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2531F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.6F, 2.0072F, -1.4897F);
        this.Neck2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.6283F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 18, -1.5F, -2.2557F, -1.0422F, 2, 2, 1, -0.011F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.6F, -0.2928F, 0.2103F);
        this.Neck2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.9425F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 21, 13, -1.5F, 2.8216F, -3.1807F, 2, 1, 3, 0.01F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 42, -1.5F, -0.1784F, -3.1807F, 2, 3, 3, 0.01F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.6F, -2.3428F, -2.3397F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.1745F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.9F, -1.4F);
        this.Neck3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.5411F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 19, -1.5F, 0.2449F, 0.3898F, 2, 3, 2, -0.002F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.4F, -1.7F);
        this.Neck3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.4887F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 0, -1.5F, -2.76F, -0.5234F, 2, 3, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9F, -1.1F);
        this.Neck3.addChild(head);
        this.setRotateAngle(head, -0.0698F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 42, 0, -1.5F, -0.4F, -2.0F, 2, 2, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 23, -1.5F, -0.1F, -2.55F, 2, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 23, -1.5F, 0.6F, -3.0F, 2, 1, 1, 0.001F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -0.675F, -1.925F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3229F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 15, -1.0F, -0.02F, -1.0391F, 2, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 15, -1.0F, 0.03F, -1.4391F, 2, 1, 1, -0.001F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 15, -1.0F, -0.02F, -1.4391F, 2, 1, 1, -0.001F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.8F, -4.45F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4843F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 27, 30, -0.5F, -0.3F, 0.925F, 1, 1, 1, -0.002F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.8F, -4.45F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.7854F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 36, -0.5F, -0.025F, -0.025F, 1, 1, 1, -0.001F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.6F, -3.0F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 8, 19, -0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -0.4F, -3.0F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0698F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 59, 49, -1.0F, -0.35F, 1.0F, 2, 1, 2, 0.0015F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.1F, 0.0F);
        this.head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 19, 30, -1.5F, 0.0F, -3.0F, 2, 1, 3, 0.0002F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 36, 31, -1.5F, -1.0F, -2.0F, 2, 2, 2, -0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2618F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 19, 19, -1.0F, 0.0F, -1.45F, 1, 1, 2, -0.02F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.0F, 1.1F, 0.0F);
        this.root.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.1745F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.9F, -0.6F);
        this.UpperLegL.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.7854F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 5, 0, 0.75F, -0.4F, 2.05F, 0, 6, 1, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 21, 0, -1.0F, -0.4F, -0.95F, 2, 6, 3, 0.0F, false));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.2F, 2.8F, -4.2F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.0436F, 0.0F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegL.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4712F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 36, -0.5F, -0.2F, -0.3F, 1, 7, 2, -0.001F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 33, 56, 0.25F, -0.2F, 1.7F, 0, 8, 3, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 5.15F, 4.1F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.2618F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.6283F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 21, 45, 0.1F, -1.1F, 0.4F, 0, 5, 3, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 19, -0.5F, -0.1F, -0.6F, 1, 4, 1, -0.002F, false));

        this.ToesL = new AdvancedModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 2.6F, -2.75F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, -0.5672F, 0.0F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ToesL.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0524F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 11, 36, -1.0F, -0.3F, -3.0F, 2, 1, 4, 0.0F, false));

        this.UpperLegL2 = new AdvancedModelRenderer(this);
        this.UpperLegL2.setRotationPoint(-2.0F, 1.1F, 0.0F);
        this.root.addChild(UpperLegL2);
        this.setRotateAngle(UpperLegL2, 0.1745F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.9F, -0.6F);
        this.UpperLegL2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.7854F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 5, 0, -0.75F, -0.4F, 2.05F, 0, 6, 1, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 21, 0, -1.0F, -0.4F, -0.95F, 2, 6, 3, 0.0F, true));

        this.LowerLegL2 = new AdvancedModelRenderer(this);
        this.LowerLegL2.setRotationPoint(-0.2F, 2.8F, -4.2F);
        this.UpperLegL2.addChild(LowerLegL2);
        this.setRotateAngle(LowerLegL2, 0.0436F, 0.0F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegL2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.4712F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 33, 56, -0.25F, -0.2F, 1.7F, 0, 8, 3, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 36, -0.5F, -0.2F, -0.3F, 1, 7, 2, -0.001F, true));

        this.FootL2 = new AdvancedModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 5.15F, 4.1F);
        this.LowerLegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.2618F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.6283F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 21, 45, -0.1F, -1.1F, 0.4F, 0, 5, 3, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 19, -0.5F, -0.1F, -0.6F, 1, 4, 1, -0.002F, true));

        this.ToesL2 = new AdvancedModelRenderer(this);
        this.ToesL2.setRotationPoint(0.0F, 2.6F, -2.75F);
        this.FootL2.addChild(ToesL2);
        this.setRotateAngle(ToesL2, -0.5672F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ToesL2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0524F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 11, 36, -1.0F, -0.3F, -3.0F, 2, 1, 4, 0.0F, true));

        this.bb_main = new AdvancedModelRenderer(this);
        this.bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bb_main.cubeList.add(new ModelBox(bb_main, 1, 1, -18.0F, -40.0F, -10.6F, 39, 40, 1, 0.0F, false));

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

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.2F;
        this.root.offsetX = 0.2F;
        this.root.rotateAngleY = (float)Math.toRadians(220);
        this.root.rotateAngleX = (float)Math.toRadians(3);
        this.root.rotateAngleZ = (float)Math.toRadians(-2);
        this.root.scaleChildren = true;
        float scaler = 3.0F;
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

        EntityPrehistoricFloraYiQi ee = (EntityPrehistoricFloraYiQi) e;

        this.faceTarget(f3, f4, 8, Neck1);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.25F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.5F, -0.02F, 0.5F, f2, 0.4F);
            this.chainWave(Tail, 0.5F, -0.01F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraYiQi ee = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;

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
            //Swimming pose:
            animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The idle look
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYiQi entity = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-25.2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25.2 + (((tickAnim - 5) / 5) * (17.5-(-25.2)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 10) / 5) * (-1.6-(17.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.6 + (((tickAnim - 15) / 5) * (-32.4-(-1.6)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -32.4 + (((tickAnim - 20) / 5) * (-36-(-32.4)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -36 + (((tickAnim - 25) / 5) * (0-(-36)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.6-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.6 + (((tickAnim - 5) / 5) * (0-(3.6)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (3.6-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 3.6 + (((tickAnim - 20) / 5) * (3.6-(3.6)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3.6 + (((tickAnim - 25) / 5) * (0-(3.6)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.6-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.6 + (((tickAnim - 5) / 5) * (0-(3.6)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 15 + (((tickAnim - 20) / 5) * (17.5-(15)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 25) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (14.4-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 14.4 + (((tickAnim - 15) / 5) * (4.4-(14.4)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 4.4 + (((tickAnim - 20) / 5) * (3.3-(4.4)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3.3 + (((tickAnim - 25) / 5) * (0-(3.3)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0.5 + (((tickAnim - 15) / 5) * (0-(0.5)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.2 + (((tickAnim - 5) / 5) * (7.2-(7.2)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.2 + (((tickAnim - 10) / 5) * (10.8-(7.2)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10.8 + (((tickAnim - 15) / 5) * (0-(10.8)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.8 + (((tickAnim - 5) / 5) * (10.8-(10.8)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10.8 + (((tickAnim - 10) / 5) * (10.8-(10.8)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10.8 + (((tickAnim - 15) / 5) * (0-(10.8)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.2 + (((tickAnim - 5) / 5) * (-21.6-(7.2)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -21.6 + (((tickAnim - 10) / 5) * (-10.8-(-21.6)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10.8 + (((tickAnim - 15) / 5) * (-10.8-(-10.8)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -10.8 + (((tickAnim - 20) / 5) * (-10.8-(-10.8)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -10.8 + (((tickAnim - 25) / 5) * (0-(-10.8)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
            xx = 18 + (((tickAnim - 5) / 5) * (46.8-(18)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 46.8 + (((tickAnim - 10) / 5) * (-1-(46.8)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1 + (((tickAnim - 15) / 5) * (42.2-(-1)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 42.2 + (((tickAnim - 20) / 5) * (-1-(42.2)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -1 + (((tickAnim - 25) / 5) * (0-(-1)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Jaw.rotationPointX = this.Jaw.rotationPointX + (float)(xx);
        this.Jaw.rotationPointY = this.Jaw.rotationPointY - (float)(yy);
        this.Jaw.rotationPointZ = this.Jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (3.6-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.6-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.2 + (((tickAnim - 5) / 5) * (7.2-(7.2)));
            yy = 3.6 + (((tickAnim - 5) / 5) * (3.6-(3.6)));
            zz = -3.6 + (((tickAnim - 5) / 5) * (-3.6-(-3.6)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.2 + (((tickAnim - 10) / 5) * (7.2-(7.2)));
            yy = 3.6 + (((tickAnim - 10) / 5) * (3.6-(3.6)));
            zz = -3.6 + (((tickAnim - 10) / 5) * (-3.6-(-3.6)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.2 + (((tickAnim - 15) / 5) * (7.2-(7.2)));
            yy = 3.6 + (((tickAnim - 15) / 5) * (3.6-(3.6)));
            zz = -3.6 + (((tickAnim - 15) / 5) * (-3.6-(-3.6)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 7.2 + (((tickAnim - 20) / 5) * (7.2-(7.2)));
            yy = 3.6 + (((tickAnim - 20) / 5) * (3.6-(3.6)));
            zz = -3.6 + (((tickAnim - 20) / 5) * (-3.6-(-3.6)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 7.2 + (((tickAnim - 25) / 5) * (0-(7.2)));
            yy = 3.6 + (((tickAnim - 25) / 5) * (0-(3.6)));
            zz = -3.6 + (((tickAnim - 25) / 5) * (0-(-3.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL2, UpperLegL2.rotateAngleX + (float) Math.toRadians(xx), UpperLegL2.rotateAngleY + (float) Math.toRadians(yy), UpperLegL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 5) / 5) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 10) / 5) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 15) / 5) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 20) / 5) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 25) / 5) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegL2.rotationPointX = this.UpperLegL2.rotationPointX + (float)(xx);
        this.UpperLegL2.rotationPointY = this.UpperLegL2.rotationPointY - (float)(yy);
        this.UpperLegL2.rotationPointZ = this.UpperLegL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.6-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.6 + (((tickAnim - 5) / 5) * (3.6-(3.6)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 3.6 + (((tickAnim - 10) / 5) * (3.6-(3.6)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.6 + (((tickAnim - 15) / 5) * (3.6-(3.6)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 3.6 + (((tickAnim - 20) / 5) * (3.6-(3.6)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3.6 + (((tickAnim - 25) / 5) * (0-(3.6)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL2, LowerLegL2.rotateAngleX + (float) Math.toRadians(xx), LowerLegL2.rotateAngleY + (float) Math.toRadians(yy), LowerLegL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerLegL2.rotationPointX = this.LowerLegL2.rotationPointX + (float)(xx);
        this.LowerLegL2.rotationPointY = this.LowerLegL2.rotationPointY - (float)(yy);
        this.LowerLegL2.rotationPointZ = this.LowerLegL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL2.rotationPointX = this.FootL2.rotationPointX + (float)(xx);
        this.FootL2.rotationPointY = this.FootL2.rotationPointY - (float)(yy);
        this.FootL2.rotationPointZ = this.FootL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10.8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (3.6-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -10.8 + (((tickAnim - 5) / 5) * (-10.8-(-10.8)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 3.6 + (((tickAnim - 5) / 5) * (3.6-(3.6)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -10.8 + (((tickAnim - 10) / 5) * (-10.8-(-10.8)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 3.6 + (((tickAnim - 10) / 5) * (3.6-(3.6)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10.8 + (((tickAnim - 15) / 5) * (-10.8-(-10.8)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 3.6 + (((tickAnim - 15) / 5) * (3.6-(3.6)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -10.8 + (((tickAnim - 20) / 5) * (-10.8-(-10.8)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 3.6 + (((tickAnim - 20) / 5) * (3.6-(3.6)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -10.8 + (((tickAnim - 25) / 5) * (0-(-10.8)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 3.6 + (((tickAnim - 25) / 5) * (0-(3.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL2, ToesL2.rotateAngleX + (float) Math.toRadians(xx), ToesL2.rotateAngleY + (float) Math.toRadians(yy), ToesL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ToesL2.rotationPointX = this.ToesL2.rotationPointX + (float)(xx);
        this.ToesL2.rotationPointY = this.ToesL2.rotationPointY - (float)(yy);
        this.ToesL2.rotationPointZ = this.ToesL2.rotationPointZ + (float)(zz);

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYiQi entity = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;
        int animCycle = 16;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (3.33-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 3.33 + (((tickAnim - 2) / 1) * (5.67-(3.33)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5.67 + (((tickAnim - 3) / 2) * (6.75-(5.67)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 6.75 + (((tickAnim - 5) / 1) * (7.34-(6.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 7.34 + (((tickAnim - 6) / 1) * (6.33-(7.34)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 6.33 + (((tickAnim - 7) / 1) * (4.25-(6.33)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.25 + (((tickAnim - 8) / 2) * (2.66-(4.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.66 + (((tickAnim - 10) / 2) * (1.33-(2.66)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 1.33 + (((tickAnim - 12) / 1) * (0.34-(1.33)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.34 + (((tickAnim - 13) / 2) * (0-(0.34)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-6.67-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -6.67 + (((tickAnim - 2) / 1) * (-9.34-(-6.67)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -9.34 + (((tickAnim - 3) / 2) * (-7.42-(-9.34)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -7.42 + (((tickAnim - 5) / 1) * (-4.34-(-7.42)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -4.34 + (((tickAnim - 6) / 1) * (0.11-(-4.34)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0.11 + (((tickAnim - 7) / 1) * (3.58-(0.11)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.58 + (((tickAnim - 8) / 2) * (3.55-(3.58)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 3.55 + (((tickAnim - 10) / 2) * (1.78-(3.55)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 1.78 + (((tickAnim - 12) / 1) * (0.45-(1.78)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.45 + (((tickAnim - 13) / 2) * (0-(0.45)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 5 + (((tickAnim - 2) / 1) * (8.83-(5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.83 + (((tickAnim - 3) / 2) * (10.59-(8.83)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 10.59 + (((tickAnim - 5) / 1) * (10.5-(10.59)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 10.5 + (((tickAnim - 6) / 1) * (11.06-(10.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 11.06 + (((tickAnim - 7) / 1) * (10.42-(11.06)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.42 + (((tickAnim - 8) / 2) * (4.28-(10.42)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 4.28 + (((tickAnim - 10) / 2) * (-0.11-(4.28)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -0.11 + (((tickAnim - 12) / 1) * (-0.02-(-0.11)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.02 + (((tickAnim - 13) / 2) * (0-(-0.02)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 2) / 1) * (-23.16-(-15)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -23.16 + (((tickAnim - 3) / 2) * (-16.33-(-23.16)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -16.33 + (((tickAnim - 5) / 1) * (6.83-(-16.33)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 6.83 + (((tickAnim - 6) / 1) * (17.33-(6.83)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 17.33 + (((tickAnim - 7) / 1) * (8.5-(17.33)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.5 + (((tickAnim - 8) / 2) * (2.66-(8.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.66 + (((tickAnim - 10) / 2) * (0.34-(2.66)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0.34 + (((tickAnim - 12) / 1) * (0.09-(0.34)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.09 + (((tickAnim - 13) / 2) * (0-(0.09)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (6.67-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 6.67 + (((tickAnim - 2) / 1) * (4-(6.67)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4 + (((tickAnim - 3) / 2) * (-2.41-(4)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -2.41 + (((tickAnim - 5) / 1) * (2.33-(-2.41)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.33 + (((tickAnim - 6) / 1) * (8.34-(2.33)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 8.34 + (((tickAnim - 7) / 1) * (8.67-(8.34)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.67 + (((tickAnim - 8) / 2) * (6.33-(8.67)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 6.33 + (((tickAnim - 10) / 2) * (3-(6.33)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 3 + (((tickAnim - 12) / 1) * (0.75-(3)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.75 + (((tickAnim - 13) / 2) * (0-(0.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-13.33-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -13.33 + (((tickAnim - 2) / 1) * (-13-(-13.33)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13 + (((tickAnim - 3) / 2) * (-2.67-(-13)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -2.67 + (((tickAnim - 5) / 1) * (0.34-(-2.67)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0.34 + (((tickAnim - 6) / 1) * (4.84-(0.34)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 4.84 + (((tickAnim - 7) / 1) * (10.34-(4.84)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.34 + (((tickAnim - 8) / 2) * (7.5-(10.34)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 10) / 2) * (2.67-(7.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 2.67 + (((tickAnim - 12) / 1) * (0.67-(2.67)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.67 + (((tickAnim - 13) / 2) * (0-(0.67)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 2) / 1) * (50.84-(30)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 50.84 + (((tickAnim - 3) / 2) * (49.17-(50.84)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 49.17 + (((tickAnim - 5) / 1) * (20.84-(49.17)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 20.84 + (((tickAnim - 6) / 1) * (0-(20.84)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYiQi entity = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -18.25 + (((tickAnim - 0) / 2) * (-12.5-(-18.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -12.5 + (((tickAnim - 2) / 1) * (-1.2701-(-12.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (-2.60395-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.88457-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -1.2701 + (((tickAnim - 3) / 5) * (33.57674-(-1.2701)));
            yy = -2.60395 + (((tickAnim - 3) / 5) * (-5.52655-(-2.60395)));
            zz = 0.88457 + (((tickAnim - 3) / 5) * (-1.58985-(0.88457)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 33.57674 + (((tickAnim - 8) / 2) * (30.36394-(33.57674)));
            yy = -5.52655 + (((tickAnim - 8) / 2) * (-6.09433-(-5.52655)));
            zz = -1.58985 + (((tickAnim - 8) / 2) * (-1.38886-(-1.58985)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30.36394 + (((tickAnim - 10) / 3) * (12.29-(30.36394)));
            yy = -6.09433 + (((tickAnim - 10) / 3) * (0-(-6.09433)));
            zz = -1.38886 + (((tickAnim - 10) / 3) * (0-(-1.38886)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 12.29 + (((tickAnim - 13) / 1) * (0.25-(12.29)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0.25 + (((tickAnim - 14) / 3) * (-18.25-(0.25)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegL.rotationPointX = this.UpperLegL.rotationPointX + (float)(xx);
        this.UpperLegL.rotationPointY = this.UpperLegL.rotationPointY - (float)(yy);
        this.UpperLegL.rotationPointZ = this.UpperLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.5 + (((tickAnim - 0) / 2) * (1-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 2) / 1) * (0.25-(1)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.25 + (((tickAnim - 3) / 3) * (8.1-(0.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.1 + (((tickAnim - 6) / 2) * (2.93-(8.1)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 2.93 + (((tickAnim - 8) / 0) * (-8-(2.93)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8 + (((tickAnim - 8) / 2) * (10.4-(-8)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10.4 + (((tickAnim - 10) / 3) * (37.5-(10.4)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 37.5 + (((tickAnim - 13) / 1) * (22.69-(37.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 22.69 + (((tickAnim - 14) / 3) * (-0.5-(22.69)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -8 + (((tickAnim - 0) / 2) * (4.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 4.5 + (((tickAnim - 2) / 1) * (7.95-(4.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 7.95 + (((tickAnim - 3) / 0) * (0.75-(7.95)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.75 + (((tickAnim - 3) / 3) * (-1.54-(0.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -1.54 + (((tickAnim - 6) / 2) * (0.48-(-1.54)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.48 + (((tickAnim - 8) / 1) * (14.7-(0.48)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 14.7 + (((tickAnim - 9) / 1) * (20.39-(14.7)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 20.39 + (((tickAnim - 10) / 4) * (-54.58-(20.39)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -54.58 + (((tickAnim - 14) / 3) * (-8-(-54.58)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 34.25 + (((tickAnim - 0) / 3) * (-4-(34.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -4 + (((tickAnim - 3) / 0) * (-3.00976-(-4)));
            yy = 0 + (((tickAnim - 3) / 0) * (0.58463-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (-1.91268-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -3.00976 + (((tickAnim - 3) / 1) * (-8.61-(-3.00976)));
            yy = 0.58463 + (((tickAnim - 3) / 1) * (0-(0.58463)));
            zz = -1.91268 + (((tickAnim - 3) / 1) * (0-(-1.91268)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -8.61 + (((tickAnim - 4) / 1) * (-0.85-(-8.61)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.85 + (((tickAnim - 5) / 3) * (7.25-(-0.85)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 7.25 + (((tickAnim - 8) / 0) * (71-(7.25)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 71 + (((tickAnim - 8) / 1) * (76.75-(71)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 76.75 + (((tickAnim - 9) / 1) * (71-(76.75)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 71 + (((tickAnim - 10) / 3) * (91.5-(71)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 91.5 + (((tickAnim - 13) / 4) * (34.25-(91.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.375 + (((tickAnim - 3) / 0) * (-0.025-(0.375)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 3) / 3) * (-0.145-(-0.025)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.145 + (((tickAnim - 6) / 2) * (0.15-(-0.145)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 8) / 5) * (0-(0.15)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ToesL.rotationPointX = this.ToesL.rotationPointX + (float)(xx);
        this.ToesL.rotationPointY = this.ToesL.rotationPointY - (float)(yy);
        this.ToesL.rotationPointZ = this.ToesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 4 + (((tickAnim - 0) / 8) * (0.97815-(4)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.2079-(0)));
            zz = -3 + (((tickAnim - 0) / 8) * (8.99823-(-3)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0.97815 + (((tickAnim - 8) / 9) * (4-(0.97815)));
            yy = -0.2079 + (((tickAnim - 8) / 9) * (0-(-0.2079)));
            zz = 8.99823 + (((tickAnim - 8) / 9) * (-3-(8.99823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = -3 + (((tickAnim - 8) / 9) * (0-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.04545 + (((tickAnim - 0) / 8) * (0.01433-(-0.04545)));
            yy = 0.20089 + (((tickAnim - 0) / 8) * (-2.86451-(0.20089)));
            zz = -1.92786 + (((tickAnim - 0) / 8) * (-4.49856-(-1.92786)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0.01433 + (((tickAnim - 8) / 9) * (-0.04545-(0.01433)));
            yy = -2.86451 + (((tickAnim - 8) / 9) * (0.20089-(-2.86451)));
            zz = -4.49856 + (((tickAnim - 8) / 9) * (-1.92786-(-4.49856)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -27.97268 + (((tickAnim - 0) / 8) * (-35.17634-(-27.97268)));
            yy = -10.18734 + (((tickAnim - 0) / 8) * (-0.44045-(-10.18734)));
            zz = -95.18525 + (((tickAnim - 0) / 8) * (-110.26072-(-95.18525)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -35.17634 + (((tickAnim - 8) / 9) * (-27.97268-(-35.17634)));
            yy = -0.44045 + (((tickAnim - 8) / 9) * (-10.18734-(-0.44045)));
            zz = -110.26072 + (((tickAnim - 8) / 9) * (-95.18525-(-110.26072)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 0) / 8) * (25-(15)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 25 + (((tickAnim - 8) / 9) * (15-(25)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 4.24355 + (((tickAnim - 0) / 8) * (0.97815-(4.24355)));
            yy = 2.2605 + (((tickAnim - 0) / 8) * (-0.2079-(2.2605)));
            zz = 9.29711 + (((tickAnim - 0) / 8) * (8.99823-(9.29711)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0.97815 + (((tickAnim - 8) / 9) * (4.24355-(0.97815)));
            yy = -0.2079 + (((tickAnim - 8) / 9) * (2.2605-(-0.2079)));
            zz = 8.99823 + (((tickAnim - 8) / 9) * (9.29711-(8.99823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-1.60186), head.rotateAngleY + (float) Math.toRadians(-18.164+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-500))*-4), head.rotateAngleZ + (float) Math.toRadians(4.3584+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-1));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYiQi entity = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.925-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -1.925 + (((tickAnim - 3) / 3) * (-2.97-(-1.925)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -2.97 + (((tickAnim - 6) / 4) * (-3.22-(-2.97)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -3.22 + (((tickAnim - 10) / 3) * (-1.675-(-3.22)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -1.675 + (((tickAnim - 13) / 2) * (0-(-1.675)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-9.54584-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-19.0904-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (3.78463-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.54584 + (((tickAnim - 6) / 2) * (-9.54584-(-9.54584)));
            yy = -19.0904 + (((tickAnim - 6) / 2) * (-19.0904-(-19.0904)));
            zz = 3.78463 + (((tickAnim - 6) / 2) * (3.78463-(3.78463)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -9.54584 + (((tickAnim - 8) / 7) * (0-(-9.54584)));
            yy = -19.0904 + (((tickAnim - 8) / 7) * (0-(-19.0904)));
            zz = 3.78463 + (((tickAnim - 8) / 7) * (0-(3.78463)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 32 + (((tickAnim - 6) / 2) * (32-(32)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 32 + (((tickAnim - 8) / 7) * (0-(32)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-27.16286-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-5.45194-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-1.83003-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -27.16286 + (((tickAnim - 6) / 2) * (-27.16286-(-27.16286)));
            yy = -5.45194 + (((tickAnim - 6) / 2) * (-5.45194-(-5.45194)));
            zz = -1.83003 + (((tickAnim - 6) / 2) * (-1.83003-(-1.83003)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -27.16286 + (((tickAnim - 8) / 7) * (0-(-27.16286)));
            yy = -5.45194 + (((tickAnim - 8) / 7) * (0-(-5.45194)));
            zz = -1.83003 + (((tickAnim - 8) / 7) * (0-(-1.83003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 4.75 + (((tickAnim - 6) / 2) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4.75 + (((tickAnim - 8) / 7) * (0-(4.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.295-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.295 + (((tickAnim - 2) / 1) * (0.575-(0.295)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 3) / 2) * (0.565-(0.575)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.565 + (((tickAnim - 5) / 1) * (0-(0.565)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.775-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.775 + (((tickAnim - 11) / 1) * (0.875-(0.775)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 12) / 2) * (0.615-(0.875)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.615 + (((tickAnim - 14) / 1) * (0.3-(0.615)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ToesL.rotationPointX = this.ToesL.rotationPointX + (float)(xx);
        this.ToesL.rotationPointY = this.ToesL.rotationPointY - (float)(yy);
        this.ToesL.rotationPointZ = this.ToesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6 + (((tickAnim - 6) / 2) * (-6-(-6)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -6 + (((tickAnim - 8) / 7) * (0-(-6)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (-2-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -2 + (((tickAnim - 11) / 4) * (0-(-2)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 6) / 2) * (-7-(-7)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -7 + (((tickAnim - 8) / 7) * (0-(-7)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.75 + (((tickAnim - 6) / 2) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 8.75 + (((tickAnim - 8) / 7) * (0-(8.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 12 + (((tickAnim - 8) / 1) * (12-(12)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 12 + (((tickAnim - 9) / 6) * (0-(12)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 12 + (((tickAnim - 8) / 1) * (12-(12)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 12 + (((tickAnim - 9) / 6) * (0-(12)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (5.42-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5.42 + (((tickAnim - 12) / 3) * (0-(5.42)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.55933-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-4.63358-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-6.17494-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.55933 + (((tickAnim - 4) / 4) * (0-(0.55933)));
            yy = -4.63358 + (((tickAnim - 4) / 4) * (0-(-4.63358)));
            zz = -6.17494 + (((tickAnim - 4) / 4) * (0-(-6.17494)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (4.5-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 4.5 + (((tickAnim - 12) / 1) * (6-(4.5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6 + (((tickAnim - 13) / 2) * (0-(6)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-9.54584-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (19.09042-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (3.78463-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.54584 + (((tickAnim - 6) / 2) * (-9.54584-(-9.54584)));
            yy = 19.09042 + (((tickAnim - 6) / 2) * (19.09042-(19.09042)));
            zz = 3.78463 + (((tickAnim - 6) / 2) * (3.78463-(3.78463)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -9.54584 + (((tickAnim - 8) / 7) * (0-(-9.54584)));
            yy = 19.09042 + (((tickAnim - 8) / 7) * (0-(19.09042)));
            zz = 3.78463 + (((tickAnim - 8) / 7) * (0-(3.78463)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL2, UpperLegL2.rotateAngleX + (float) Math.toRadians(xx), UpperLegL2.rotateAngleY + (float) Math.toRadians(yy), UpperLegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 32 + (((tickAnim - 6) / 2) * (32-(32)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 32 + (((tickAnim - 8) / 7) * (0-(32)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL2, LowerLegL2.rotateAngleX + (float) Math.toRadians(xx), LowerLegL2.rotateAngleY + (float) Math.toRadians(yy), LowerLegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -26.5 + (((tickAnim - 6) / 2) * (-26.5-(-26.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -26.5 + (((tickAnim - 8) / 7) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 6.25 + (((tickAnim - 6) / 2) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.25 + (((tickAnim - 8) / 7) * (0-(6.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL2, ToesL2.rotateAngleX + (float) Math.toRadians(xx), ToesL2.rotateAngleY + (float) Math.toRadians(yy), ToesL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.365-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.365 + (((tickAnim - 2) / 1) * (0.625-(0.365)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 3) / 2) * (0.565-(0.625)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.565 + (((tickAnim - 5) / 1) * (0-(0.565)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.615-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.615 + (((tickAnim - 11) / 1) * (0.6-(0.615)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 12) / 2) * (0.665-(0.6)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.665 + (((tickAnim - 14) / 1) * (0-(0.665)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ToesL2.rotationPointX = this.ToesL2.rotationPointX + (float)(xx);
        this.ToesL2.rotationPointY = this.ToesL2.rotationPointY - (float)(yy);
        this.ToesL2.rotationPointZ = this.ToesL2.rotationPointZ + (float)(zz);

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYiQi entity = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;
        int animCycle = 89;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 0) / 15) * (7.5-(5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 15) / 15) * (0-(7.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 58) {
            xx = -7.5 + (((tickAnim - 35) / 23) * (-5-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 23) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 75) {
            xx = -5 + (((tickAnim - 58) / 17) * (-7.5-(-5)));
            yy = 0 + (((tickAnim - 58) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 17) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = -7.5 + (((tickAnim - 75) / 8) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 75) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 8) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 83) / 7) * (5-(0)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.26461-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.80069-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.6276-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 5.26461 + (((tickAnim - 15) / 15) * (5.26461-(5.26461)));
            yy = 1.80069 + (((tickAnim - 15) / 15) * (-1.80069-(1.80069)));
            zz = 5.6276 + (((tickAnim - 15) / 15) * (-0.6276-(5.6276)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 5.26461 + (((tickAnim - 30) / 15) * (0.26461-(5.26461)));
            yy = -1.80069 + (((tickAnim - 30) / 15) * (1.80069-(-1.80069)));
            zz = -0.6276 + (((tickAnim - 30) / 15) * (5.6276-(-0.6276)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0.26461 + (((tickAnim - 45) / 15) * (5.26461-(0.26461)));
            yy = 1.80069 + (((tickAnim - 45) / 15) * (-1.80069-(1.80069)));
            zz = 5.6276 + (((tickAnim - 45) / 15) * (-0.6276-(5.6276)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 5.26461 + (((tickAnim - 60) / 15) * (5.26461-(5.26461)));
            yy = -1.80069 + (((tickAnim - 60) / 15) * (1.80069-(-1.80069)));
            zz = -0.6276 + (((tickAnim - 60) / 15) * (5.6276-(-0.6276)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 5.26461 + (((tickAnim - 75) / 15) * (0-(5.26461)));
            yy = 1.80069 + (((tickAnim - 75) / 15) * (0-(1.80069)));
            zz = 5.6276 + (((tickAnim - 75) / 15) * (0-(5.6276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = -5 + (((tickAnim - 7) / 8) * (-5-(-5)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -5 + (((tickAnim - 15) / 5) * (-5-(-5)));
            zz = 0 + (((tickAnim - 15) / 5) * (-2.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -5 + (((tickAnim - 20) / 10) * (-5-(-5)));
            zz = -2.5 + (((tickAnim - 20) / 10) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -5 + (((tickAnim - 30) / 5) * (15-(-5)));
            zz = -2.5 + (((tickAnim - 30) / 5) * (0-(-2.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 15 + (((tickAnim - 35) / 5) * (15-(15)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 15 + (((tickAnim - 40) / 10) * (15-(15)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 15 + (((tickAnim - 50) / 5) * (10-(15)));
            zz = 0 + (((tickAnim - 50) / 5) * (2.5-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 55) / 10) * (5-(0)));
            yy = 10 + (((tickAnim - 55) / 10) * (10-(10)));
            zz = 2.5 + (((tickAnim - 55) / 10) * (2.5-(2.5)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 5 + (((tickAnim - 65) / 5) * (10-(5)));
            yy = 10 + (((tickAnim - 65) / 5) * (10-(10)));
            zz = 2.5 + (((tickAnim - 65) / 5) * (2.5-(2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 70) / 10) * (10-(10)));
            yy = 10 + (((tickAnim - 70) / 10) * (10-(10)));
            zz = 2.5 + (((tickAnim - 70) / 10) * (2.5-(2.5)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 10 + (((tickAnim - 80) / 10) * (0-(10)));
            yy = 10 + (((tickAnim - 80) / 10) * (0-(10)));
            zz = 2.5 + (((tickAnim - 80) / 10) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 0) / 7) * (-5-(-5)));
            yy = 0 + (((tickAnim - 0) / 7) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 7) / 8) * (-5-(-5)));
            yy = -10 + (((tickAnim - 7) / 8) * (-10-(-10)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 15) / 5) * (-5-(-5)));
            yy = -10 + (((tickAnim - 15) / 5) * (-10-(-10)));
            zz = 0 + (((tickAnim - 15) / 5) * (-2.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 20) / 10) * (-5-(-5)));
            yy = -10 + (((tickAnim - 20) / 10) * (-10-(-10)));
            zz = -2.5 + (((tickAnim - 20) / 10) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 30) / 5) * (-5-(-5)));
            yy = -10 + (((tickAnim - 30) / 5) * (0-(-10)));
            zz = -2.5 + (((tickAnim - 30) / 5) * (0-(-2.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 35) / 15) * (-5-(-5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -5 + (((tickAnim - 50) / 5) * (-5-(-5)));
            yy = 0 + (((tickAnim - 50) / 5) * (5-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -5 + (((tickAnim - 55) / 10) * (-5-(-5)));
            yy = 5 + (((tickAnim - 55) / 10) * (5-(5)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 65) / 5) * (-5-(-5)));
            yy = 5 + (((tickAnim - 65) / 5) * (5-(5)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 70) / 10) * (-5-(-5)));
            yy = 5 + (((tickAnim - 70) / 10) * (5-(5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -5 + (((tickAnim - 80) / 10) * (-5-(-5)));
            yy = 5 + (((tickAnim - 80) / 10) * (0-(5)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-2.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = -2.5 + (((tickAnim - 7) / 8) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -2.5 + (((tickAnim - 15) / 5) * (0-(-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-0.10049-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (-0.56991-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0.65443-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -0.10049 + (((tickAnim - 28) / 2) * (0-(-0.10049)));
            yy = -0.56991 + (((tickAnim - 28) / 2) * (0-(-0.56991)));
            zz = 0.65443 + (((tickAnim - 28) / 2) * (2.5-(0.65443)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (10-(0)));
            zz = 2.5 + (((tickAnim - 30) / 5) * (0-(2.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 10 + (((tickAnim - 35) / 15) * (10-(10)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 50) / 5) * (10-(10)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            yy = 10 + (((tickAnim - 55) / 10) * (10-(10)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (-5.44361-(0)));
            yy = 10 + (((tickAnim - 65) / 5) * (1.715-(10)));
            zz = 0 + (((tickAnim - 65) / 5) * (1.48708-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5.44361 + (((tickAnim - 70) / 10) * (-6.11097-(-5.44361)));
            yy = 1.715 + (((tickAnim - 70) / 10) * (11.24038-(1.715)));
            zz = 1.48708 + (((tickAnim - 70) / 10) * (-2.47402-(1.48708)));
        }
        else if (tickAnim >= 80 && tickAnim < 89) {
            xx = -6.11097 + (((tickAnim - 80) / 9) * (0-(-6.11097)));
            yy = 11.24038 + (((tickAnim - 80) / 9) * (0-(11.24038)));
            zz = -2.47402 + (((tickAnim - 80) / 9) * (0-(-2.47402)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 65) {
            xx = -0.2 + (((tickAnim - 35) / 30) * (0.21-(-0.2)));
            yy = 0 + (((tickAnim - 35) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 30) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0.21 + (((tickAnim - 65) / 5) * (0.17-(0.21)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 89) {
            xx = 0.17 + (((tickAnim - 70) / 19) * (0-(0.17)));
            yy = 0 + (((tickAnim - 70) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 19) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 3) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 27) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 6) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 72) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 72) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 3) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 12.5 + (((tickAnim - 75) / 3) * (0-(12.5)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYiQi entity = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*-20 + (((tickAnim - 10) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*-20)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*10 + (((tickAnim - 20) / 20) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+90))*-10 + (((tickAnim - 10) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+150))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+90))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+150))*10 + (((tickAnim - 20) / 20) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+150))*10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*30 + (((tickAnim - 10) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*30)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-1 + (((tickAnim - 20) / 20) * (0-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-1)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraYiQi entity = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -56 + (((tickAnim - 0) / 3) * (-50-(-56)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -50 + (((tickAnim - 3) / 2) * (-50-(-50)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -50 + (((tickAnim - 5) / 3) * (-66-(-50)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -66 + (((tickAnim - 8) / 5) * (-56-(-66)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -56 + (((tickAnim - 13) / 7) * (-56-(-56)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx) + (float) Math.toRadians(90), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.7-(0)));
            zz = -2.6 + (((tickAnim - 0) / 3) * (-1.7-(-2.6)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.7 + (((tickAnim - 3) / 2) * (3.1-(1.7)));
            zz = -1.7 + (((tickAnim - 3) / 2) * (0-(-1.7)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 3.1 + (((tickAnim - 5) / 3) * (3.9-(3.1)));
            zz = 0 + (((tickAnim - 5) / 3) * (-1.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 3.9 + (((tickAnim - 8) / 5) * (5.8-(3.9)));
            zz = -1.3 + (((tickAnim - 8) / 5) * (-2.6-(-1.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 5.8 + (((tickAnim - 13) / 7) * (0-(5.8)));
            zz = -2.6 + (((tickAnim - 13) / 7) * (-2.6-(-2.6)));
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
            xx = -7 + (((tickAnim - 0) / 3) * (0-(-7)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 8) / 5) * (2-(5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 2 + (((tickAnim - 13) / 3) * (-4-(2)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -4 + (((tickAnim - 16) / 4) * (-7-(-4)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -88.25953 + (((tickAnim - 0) / 3) * (-74.69655-(-88.25953)));
            yy = 3.40987 + (((tickAnim - 0) / 3) * (9.34886-(3.40987)));
            zz = 72.43331 + (((tickAnim - 0) / 3) * (73.26365-(72.43331)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -74.69655 + (((tickAnim - 3) / 2) * (-70.03182-(-74.69655)));
            yy = 9.34886 + (((tickAnim - 3) / 2) * (9.26381-(9.34886)));
            zz = 73.26365 + (((tickAnim - 3) / 2) * (55.34574-(73.26365)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -70.03182 + (((tickAnim - 5) / 3) * (-61.73755-(-70.03182)));
            yy = 9.26381 + (((tickAnim - 5) / 3) * (14.15074-(9.26381)));
            zz = 55.34574 + (((tickAnim - 5) / 3) * (39.07709-(55.34574)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -61.73755 + (((tickAnim - 8) / 5) * (-48.9393-(-61.73755)));
            yy = 14.15074 + (((tickAnim - 8) / 5) * (19.14275-(14.15074)));
            zz = 39.07709 + (((tickAnim - 8) / 5) * (65.70279-(39.07709)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -48.9393 + (((tickAnim - 13) / 2) * (-39.89878-(-48.9393)));
            yy = 19.14275 + (((tickAnim - 13) / 2) * (12.07373-(19.14275)));
            zz = 65.70279 + (((tickAnim - 13) / 2) * (80.15026-(65.70279)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -39.89878 + (((tickAnim - 15) / 3) * (-65.72889-(-39.89878)));
            yy = 12.07373 + (((tickAnim - 15) / 3) * (9.92302-(12.07373)));
            zz = 80.15026 + (((tickAnim - 15) / 3) * (87.12406-(80.15026)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -65.72889 + (((tickAnim - 18) / 2) * (-88.25953-(-65.72889)));
            yy = 9.92302 + (((tickAnim - 18) / 2) * (3.40987-(9.92302)));
            zz = 87.12406 + (((tickAnim - 18) / 2) * (72.43331-(87.12406)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 72.71333 + (((tickAnim - 0) / 3) * (68.64775-(72.71333)));
            yy = -8.90875 + (((tickAnim - 0) / 3) * (2.39075-(-8.90875)));
            zz = 30.05778 + (((tickAnim - 0) / 3) * (34.94707-(30.05778)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 68.64775 + (((tickAnim - 3) / 2) * (64.82542-(68.64775)));
            yy = 2.39075 + (((tickAnim - 3) / 2) * (-6.90476-(2.39075)));
            zz = 34.94707 + (((tickAnim - 3) / 2) * (33.39193-(34.94707)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 64.82542 + (((tickAnim - 5) / 3) * (76.73065-(64.82542)));
            yy = -6.90476 + (((tickAnim - 5) / 3) * (-18.15419-(-6.90476)));
            zz = 33.39193 + (((tickAnim - 5) / 3) * (31.92656-(33.39193)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 76.73065 + (((tickAnim - 8) / 5) * (64.19765-(76.73065)));
            yy = -18.15419 + (((tickAnim - 8) / 5) * (10.14086-(-18.15419)));
            zz = 31.92656 + (((tickAnim - 8) / 5) * (14.08134-(31.92656)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 64.19765 + (((tickAnim - 13) / 2) * (50.45549-(64.19765)));
            yy = 10.14086 + (((tickAnim - 13) / 2) * (0.61605-(10.14086)));
            zz = 14.08134 + (((tickAnim - 13) / 2) * (22.06956-(14.08134)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 50.45549 + (((tickAnim - 15) / 3) * (61.35285-(50.45549)));
            yy = 0.61605 + (((tickAnim - 15) / 3) * (-11.01851-(0.61605)));
            zz = 22.06956 + (((tickAnim - 15) / 3) * (29.79757-(22.06956)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 61.35285 + (((tickAnim - 18) / 2) * (72.71333-(61.35285)));
            yy = -11.01851 + (((tickAnim - 18) / 2) * (-8.90875-(-11.01851)));
            zz = 29.79757 + (((tickAnim - 18) / 2) * (30.05778-(29.79757)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -42.42307 + (((tickAnim - 0) / 3) * (-46.74335-(-42.42307)));
            yy = -4.28108 + (((tickAnim - 0) / 3) * (-5.03891-(-4.28108)));
            zz = 8.75051 + (((tickAnim - 0) / 3) * (12.69112-(8.75051)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -46.74335 + (((tickAnim - 3) / 2) * (-51.01374-(-46.74335)));
            yy = -5.03891 + (((tickAnim - 3) / 2) * (-5.24385-(-5.03891)));
            zz = 12.69112 + (((tickAnim - 3) / 2) * (15.70525-(12.69112)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -51.01374 + (((tickAnim - 5) / 3) * (-71.6937-(-51.01374)));
            yy = -5.24385 + (((tickAnim - 5) / 3) * (-5.08206-(-5.24385)));
            zz = 15.70525 + (((tickAnim - 5) / 3) * (13.54299-(15.70525)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -71.6937 + (((tickAnim - 8) / 4) * (-59.76316-(-71.6937)));
            yy = -5.08206 + (((tickAnim - 8) / 4) * (-6.35685-(-5.08206)));
            zz = 13.54299 + (((tickAnim - 8) / 4) * (29.53171-(13.54299)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -59.76316 + (((tickAnim - 12) / 1) * (-55.78737-(-59.76316)));
            yy = -6.35685 + (((tickAnim - 12) / 1) * (-6.96081-(-6.35685)));
            zz = 29.53171 + (((tickAnim - 12) / 1) * (24.72739-(29.53171)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -55.78737 + (((tickAnim - 13) / 2) * (-61.51159-(-55.78737)));
            yy = -6.96081 + (((tickAnim - 13) / 2) * (-5.41922-(-6.96081)));
            zz = 24.72739 + (((tickAnim - 13) / 2) * (11.70796-(24.72739)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -61.51159 + (((tickAnim - 15) / 3) * (-52.69964-(-61.51159)));
            yy = -5.41922 + (((tickAnim - 15) / 3) * (-12.63094-(-5.41922)));
            zz = 11.70796 + (((tickAnim - 15) / 3) * (18.64393-(11.70796)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -52.69964 + (((tickAnim - 18) / 2) * (-42.42307-(-52.69964)));
            yy = -12.63094 + (((tickAnim - 18) / 2) * (-4.28108-(-12.63094)));
            zz = 18.64393 + (((tickAnim - 18) / 2) * (8.75051-(18.64393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -88.25953 + (((tickAnim - 0) / 3) * (-74.69655-(-88.25953)));
            yy = -3.40987 + (((tickAnim - 0) / 3) * (-9.34886-(-3.40987)));
            zz = -72.43331 + (((tickAnim - 0) / 3) * (-73.26365-(-72.43331)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -74.69655 + (((tickAnim - 3) / 2) * (-70.03182-(-74.69655)));
            yy = -9.34886 + (((tickAnim - 3) / 2) * (-9.26381-(-9.34886)));
            zz = -73.26365 + (((tickAnim - 3) / 2) * (-55.34574-(-73.26365)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -70.03182 + (((tickAnim - 5) / 3) * (-61.73755-(-70.03182)));
            yy = -9.26381 + (((tickAnim - 5) / 3) * (-14.15074-(-9.26381)));
            zz = -55.34574 + (((tickAnim - 5) / 3) * (-39.07709-(-55.34574)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -61.73755 + (((tickAnim - 8) / 5) * (-48.9393-(-61.73755)));
            yy = -14.15074 + (((tickAnim - 8) / 5) * (-19.14275-(-14.15074)));
            zz = -39.07709 + (((tickAnim - 8) / 5) * (-65.70279-(-39.07709)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -48.9393 + (((tickAnim - 13) / 2) * (-39.89878-(-48.9393)));
            yy = -19.14275 + (((tickAnim - 13) / 2) * (-12.07373-(-19.14275)));
            zz = -65.70279 + (((tickAnim - 13) / 2) * (-80.15026-(-65.70279)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -39.89878 + (((tickAnim - 15) / 3) * (-65.72889-(-39.89878)));
            yy = -12.07373 + (((tickAnim - 15) / 3) * (-9.92302-(-12.07373)));
            zz = -80.15026 + (((tickAnim - 15) / 3) * (-87.12406-(-80.15026)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -65.72889 + (((tickAnim - 18) / 2) * (-88.25953-(-65.72889)));
            yy = -9.92302 + (((tickAnim - 18) / 2) * (-3.40987-(-9.92302)));
            zz = -87.12406 + (((tickAnim - 18) / 2) * (-72.43331-(-87.12406)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 72.71333 + (((tickAnim - 0) / 3) * (68.64775-(72.71333)));
            yy = 8.90875 + (((tickAnim - 0) / 3) * (-2.39075-(8.90875)));
            zz = -30.05778 + (((tickAnim - 0) / 3) * (-34.94707-(-30.05778)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 68.64775 + (((tickAnim - 3) / 2) * (64.82542-(68.64775)));
            yy = -2.39075 + (((tickAnim - 3) / 2) * (6.90476-(-2.39075)));
            zz = -34.94707 + (((tickAnim - 3) / 2) * (-33.39193-(-34.94707)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 64.82542 + (((tickAnim - 5) / 3) * (76.73065-(64.82542)));
            yy = 6.90476 + (((tickAnim - 5) / 3) * (18.15419-(6.90476)));
            zz = -33.39193 + (((tickAnim - 5) / 3) * (-31.92656-(-33.39193)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 76.73065 + (((tickAnim - 8) / 5) * (64.19765-(76.73065)));
            yy = 18.15419 + (((tickAnim - 8) / 5) * (-10.14086-(18.15419)));
            zz = -31.92656 + (((tickAnim - 8) / 5) * (-14.08134-(-31.92656)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 64.19765 + (((tickAnim - 13) / 2) * (50.45549-(64.19765)));
            yy = -10.14086 + (((tickAnim - 13) / 2) * (-0.61605-(-10.14086)));
            zz = -14.08134 + (((tickAnim - 13) / 2) * (-22.06956-(-14.08134)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 50.45549 + (((tickAnim - 15) / 3) * (61.35285-(50.45549)));
            yy = -0.61605 + (((tickAnim - 15) / 3) * (11.01851-(-0.61605)));
            zz = -22.06956 + (((tickAnim - 15) / 3) * (-29.79757-(-22.06956)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 61.35285 + (((tickAnim - 18) / 2) * (72.71333-(61.35285)));
            yy = 11.01851 + (((tickAnim - 18) / 2) * (8.90875-(11.01851)));
            zz = -29.79757 + (((tickAnim - 18) / 2) * (-30.05778-(-29.79757)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -42.42307 + (((tickAnim - 0) / 3) * (-46.74335-(-42.42307)));
            yy = 4.28108 + (((tickAnim - 0) / 3) * (5.03891-(4.28108)));
            zz = -8.75051 + (((tickAnim - 0) / 3) * (-12.69112-(-8.75051)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -46.74335 + (((tickAnim - 3) / 2) * (-51.01374-(-46.74335)));
            yy = 5.03891 + (((tickAnim - 3) / 2) * (5.24385-(5.03891)));
            zz = -12.69112 + (((tickAnim - 3) / 2) * (-15.70525-(-12.69112)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -51.01374 + (((tickAnim - 5) / 3) * (-71.6937-(-51.01374)));
            yy = 5.24385 + (((tickAnim - 5) / 3) * (5.08206-(5.24385)));
            zz = -15.70525 + (((tickAnim - 5) / 3) * (-13.54299-(-15.70525)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -71.6937 + (((tickAnim - 8) / 2) * (-64.78998-(-71.6937)));
            yy = 5.08206 + (((tickAnim - 8) / 2) * (3.85566-(5.08206)));
            zz = -13.54299 + (((tickAnim - 8) / 2) * (-24.4948-(-13.54299)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -64.78998 + (((tickAnim - 10) / 2) * (-58.0175-(-64.78998)));
            yy = 3.85566 + (((tickAnim - 10) / 2) * (-4.73726-(3.85566)));
            zz = -24.4948 + (((tickAnim - 10) / 2) * (-14.34159-(-24.4948)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -58.0175 + (((tickAnim - 12) / 1) * (-54.60011-(-58.0175)));
            yy = -4.73726 + (((tickAnim - 12) / 1) * (6.55736-(-4.73726)));
            zz = -14.34159 + (((tickAnim - 12) / 1) * (-14.6654-(-14.34159)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -54.60011 + (((tickAnim - 13) / 2) * (-61.51159-(-54.60011)));
            yy = 6.55736 + (((tickAnim - 13) / 2) * (5.41922-(6.55736)));
            zz = -14.6654 + (((tickAnim - 13) / 2) * (-11.70796-(-14.6654)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -61.51159 + (((tickAnim - 15) / 3) * (-52.74159-(-61.51159)));
            yy = 5.41922 + (((tickAnim - 15) / 3) * (10.13963-(5.41922)));
            zz = -11.70796 + (((tickAnim - 15) / 3) * (-18.85639-(-11.70796)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -52.74159 + (((tickAnim - 18) / 2) * (-42.42307-(-52.74159)));
            yy = 10.13963 + (((tickAnim - 18) / 2) * (4.28108-(10.13963)));
            zz = -18.85639 + (((tickAnim - 18) / 2) * (-8.75051-(-18.85639)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(5), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -10 + (((tickAnim - 0) / 1) * (-6-(-10)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -6 + (((tickAnim - 1) / 1) * (6.33-(-6)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 6.33 + (((tickAnim - 2) / 1) * (22-(6.33)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 22 + (((tickAnim - 3) / 2) * (6-(22)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 6 + (((tickAnim - 5) / 3) * (14-(6)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 8) / 5) * (-12-(14)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL2, UpperLegL2.rotateAngleX + (float) Math.toRadians(xx), UpperLegL2.rotateAngleY + (float) Math.toRadians(yy), UpperLegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 0) / 3) * (-6-(15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -6 + (((tickAnim - 3) / 2) * (12-(-6)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 12 + (((tickAnim - 5) / 3) * (-9-(12)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -9 + (((tickAnim - 8) / 5) * (17-(-9)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL2, LowerLegL2.rotateAngleX + (float) Math.toRadians(xx), LowerLegL2.rotateAngleY + (float) Math.toRadians(yy), LowerLegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -18 + (((tickAnim - 0) / 1) * (-14.33-(-18)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -14.33 + (((tickAnim - 1) / 1) * (-5.67-(-14.33)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -5.67 + (((tickAnim - 2) / 1) * (5-(-5.67)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 3) / 2) * (-21-(5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -21 + (((tickAnim - 5) / 3) * (-23-(-21)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -23 + (((tickAnim - 8) / 5) * (-33-(-23)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -16 + (((tickAnim - 0) / 1) * (-19-(-16)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -19 + (((tickAnim - 1) / 1) * (4.5-(-19)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 4.5 + (((tickAnim - 2) / 1) * (32-(4.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 32 + (((tickAnim - 3) / 0) * (46.67-(32)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 46.67 + (((tickAnim - 3) / 2) * (7-(46.67)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 7 + (((tickAnim - 5) / 2) * (-9.75-(7)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -9.75 + (((tickAnim - 7) / 1) * (-0.5-(-9.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL2, ToesL2.rotateAngleX + (float) Math.toRadians(xx), ToesL2.rotateAngleY + (float) Math.toRadians(yy), ToesL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-4-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -4 + (((tickAnim - 12) / 1) * (0-(-4)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 2 + (((tickAnim - 15) / 2) * (0-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.16776 + (((tickAnim - 0) / 3) * (0.16776-(0.16776)));
            zz = -0.24871 + (((tickAnim - 0) / 3) * (-0.24871-(-0.24871)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            yy = 0.16776 + (((tickAnim - 3) / 17) * (0.16776-(0.16776)));
            zz = -0.24871 + (((tickAnim - 3) / 17) * (-0.24871-(-0.24871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(-20), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 5) / 3) * (-8-(-5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8 + (((tickAnim - 8) / 2) * (4-(-8)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4 + (((tickAnim - 10) / 3) * (12-(4)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12 + (((tickAnim - 13) / 2) * (-5-(12)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -5 + (((tickAnim - 15) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(featherRight, featherRight.rotateAngleX + (float) Math.toRadians(xx), featherRight.rotateAngleY + (float) Math.toRadians(yy), featherRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 6) / 2) * (-8-(-5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -8 + (((tickAnim - 8) / 3) * (4-(-8)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 4 + (((tickAnim - 11) / 2) * (12-(4)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 12 + (((tickAnim - 13) / 3) * (-5-(12)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 16) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(featherRight2, featherRight2.rotateAngleX + (float) Math.toRadians(xx), featherRight2.rotateAngleY + (float) Math.toRadians(yy), featherRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 5) / 3) * (-8-(-5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8 + (((tickAnim - 8) / 2) * (4-(-8)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4 + (((tickAnim - 10) / 3) * (12-(4)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12 + (((tickAnim - 13) / 2) * (-5-(12)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -5 + (((tickAnim - 15) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(featherLeft, featherLeft.rotateAngleX + (float) Math.toRadians(xx), featherLeft.rotateAngleY + (float) Math.toRadians(yy), featherLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 6) / 2) * (-8-(-5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -8 + (((tickAnim - 8) / 3) * (4-(-8)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 4 + (((tickAnim - 11) / 2) * (12-(4)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 12 + (((tickAnim - 13) / 3) * (-5-(12)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 16) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(featherLeft2, featherLeft2.rotateAngleX + (float) Math.toRadians(xx), featherLeft2.rotateAngleY + (float) Math.toRadians(yy), featherLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -10 + (((tickAnim - 0) / 2) * (-2.27-(-10)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.27 + (((tickAnim - 2) / 1) * (1.98-(-2.27)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 1.98 + (((tickAnim - 3) / 0) * (20.23-(1.98)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20.23 + (((tickAnim - 3) / 2) * (19.37-(20.23)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 19.37 + (((tickAnim - 5) / 4) * (-31.06-(19.37)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -31.06 + (((tickAnim - 9) / 4) * (-12-(-31.06)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 0) / 2) * (0.27-(15)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.27 + (((tickAnim - 2) / 1) * (-5.44-(0.27)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -5.44 + (((tickAnim - 3) / 0) * (-1.13766-(-5.44)));
            yy = 0 + (((tickAnim - 3) / 0) * (0.14786-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (-0.73386-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.13766 + (((tickAnim - 3) / 2) * (17.96-(-1.13766)));
            yy = 0.14786 + (((tickAnim - 3) / 2) * (0-(0.14786)));
            zz = -0.73386 + (((tickAnim - 3) / 2) * (0-(-0.73386)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 17.96 + (((tickAnim - 5) / 2) * (45.95-(17.96)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 45.95 + (((tickAnim - 7) / 2) * (45.43-(45.95)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 45.43 + (((tickAnim - 9) / 4) * (17-(45.43)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -18 + (((tickAnim - 0) / 2) * (-22-(-18)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -22 + (((tickAnim - 2) / 1) * (-5.69-(-22)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5.69 + (((tickAnim - 3) / 2) * (26.8-(-5.69)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 26.8 + (((tickAnim - 5) / 2) * (-30.89-(26.8)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -30.89 + (((tickAnim - 7) / 2) * (-27.42-(-30.89)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -27.42 + (((tickAnim - 9) / 4) * (-33-(-27.42)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -16 + (((tickAnim - 0) / 2) * (-8-(-16)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -8 + (((tickAnim - 2) / 1) * (0-(-8)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (4.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 4.5 + (((tickAnim - 5) / 2) * (-21.7-(4.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -21.7 + (((tickAnim - 7) / 2) * (-8.5-(-21.7)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYiQi entity = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -14 + (((tickAnim - 0) / 3) * (-13.2-(-14)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -13.2 + (((tickAnim - 3) / 5) * (16-(-13.2)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 8) / 4) * (12-(16)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 12 + (((tickAnim - 12) / 3) * (-14-(12)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegL.rotationPointX = this.UpperLegL.rotationPointX + (float)(xx);
        this.UpperLegL.rotationPointY = this.UpperLegL.rotationPointY - (float)(yy);
        this.UpperLegL.rotationPointZ = this.UpperLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29 + (((tickAnim - 0) / 3) * (-0.4-(29)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 3) * (-1-(-1)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.4 + (((tickAnim - 3) / 5) * (-8.08-(-0.4)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 3) / 5) * (-1-(-1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -8.08 + (((tickAnim - 8) / 4) * (21-(-8.08)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -1 + (((tickAnim - 8) / 4) * (-1-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 21 + (((tickAnim - 12) / 3) * (29-(21)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -1 + (((tickAnim - 12) / 3) * (-1-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerLegL.rotationPointX = this.LowerLegL.rotationPointX + (float)(xx);
        this.LowerLegL.rotationPointY = this.LowerLegL.rotationPointY - (float)(yy);
        this.LowerLegL.rotationPointZ = this.LowerLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -35 + (((tickAnim - 0) / 3) * (4.6-(-35)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.6 + (((tickAnim - 3) / 5) * (7-(4.6)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 7 + (((tickAnim - 8) / 4) * (-12-(7)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -12 + (((tickAnim - 12) / 3) * (-35-(-12)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 122.6 + (((tickAnim - 0) / 3) * (8.43999-(122.6)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.43999 + (((tickAnim - 3) / 5) * (-15.16001-(8.43999)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -15.16001 + (((tickAnim - 8) / 4) * (123.59999-(-15.16001)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 123.59999 + (((tickAnim - 12) / 3) * (122.6-(123.59999)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.64 + (((tickAnim - 0) / 3) * (14.4-(8.64)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 3 + (((tickAnim - 0) / 3) * (-1-(3)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 14.4 + (((tickAnim - 3) / 5) * (8.64-(14.4)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 3) / 5) * (-3-(-1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 8.64 + (((tickAnim - 8) / 4) * (14.4-(8.64)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -3 + (((tickAnim - 8) / 4) * (1-(-3)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 14.4 + (((tickAnim - 12) / 3) * (8.64-(14.4)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 1 + (((tickAnim - 12) / 3) * (3-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-3.6-(0)));
            yy = 2 + (((tickAnim - 0) / 3) * (4-(2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.6 + (((tickAnim - 3) / 5) * (0-(-3.6)));
            yy = 4 + (((tickAnim - 3) / 5) * (-2-(4)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-3.6-(0)));
            yy = -2 + (((tickAnim - 8) / 4) * (-4-(-2)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -3.6 + (((tickAnim - 12) / 3) * (0-(-3.6)));
            yy = -4 + (((tickAnim - 12) / 3) * (2-(-4)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.00125 + (((tickAnim - 0) / 3) * (0.00125-(0.00125)));
            zz = -0.00292 + (((tickAnim - 0) / 3) * (-0.00292-(-0.00292)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.00125 + (((tickAnim - 3) / 5) * (0.00125-(0.00125)));
            zz = -0.00292 + (((tickAnim - 3) / 5) * (-0.00292-(-0.00292)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.00125 + (((tickAnim - 8) / 4) * (0.00125-(0.00125)));
            zz = -0.00292 + (((tickAnim - 8) / 4) * (-0.00292-(-0.00292)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.00125 + (((tickAnim - 12) / 3) * (0.00125-(0.00125)));
            zz = -0.00292 + (((tickAnim - 12) / 3) * (-0.00292-(-0.00292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-3.6-(0)));
            yy = 2 + (((tickAnim - 0) / 3) * (4-(2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.6 + (((tickAnim - 3) / 5) * (0-(-3.6)));
            yy = 4 + (((tickAnim - 3) / 5) * (-2-(4)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-3.6-(0)));
            yy = -2 + (((tickAnim - 8) / 4) * (-4-(-2)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -3.6 + (((tickAnim - 12) / 3) * (0-(-3.6)));
            yy = -4 + (((tickAnim - 12) / 3) * (2-(-4)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -13.86 + (((tickAnim - 0) / 3) * (-8.1-(-13.86)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 3 + (((tickAnim - 0) / 3) * (-1-(3)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -8.1 + (((tickAnim - 3) / 5) * (-13.86-(-8.1)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 3) / 5) * (-3-(-1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -13.86 + (((tickAnim - 8) / 4) * (-8.1-(-13.86)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -3 + (((tickAnim - 8) / 4) * (1-(-3)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -8.1 + (((tickAnim - 12) / 3) * (-13.86-(-8.1)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 1 + (((tickAnim - 12) / 3) * (3-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.08832 + (((tickAnim - 0) / 3) * (8.82943-(32.08832)));
            yy = 3.7523 + (((tickAnim - 0) / 3) * (-5.82256-(3.7523)));
            zz = -23.2207 + (((tickAnim - 0) / 3) * (-23.44731-(-23.2207)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.82943 + (((tickAnim - 3) / 5) * (32.08832-(8.82943)));
            yy = -5.82256 + (((tickAnim - 3) / 5) * (3.7523-(-5.82256)));
            zz = -23.44731 + (((tickAnim - 3) / 5) * (-23.2207-(-23.44731)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 32.08832 + (((tickAnim - 8) / 4) * (8.82943-(32.08832)));
            yy = 3.7523 + (((tickAnim - 8) / 4) * (-5.82256-(3.7523)));
            zz = -23.2207 + (((tickAnim - 8) / 4) * (-23.44731-(-23.2207)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.82943 + (((tickAnim - 12) / 3) * (32.08832-(8.82943)));
            yy = -5.82256 + (((tickAnim - 12) / 3) * (3.7523-(-5.82256)));
            zz = -23.44731 + (((tickAnim - 12) / 3) * (-23.2207-(-23.44731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmR.rotationPointX = this.UpperArmR.rotationPointX + (float)(xx);
        this.UpperArmR.rotationPointY = this.UpperArmR.rotationPointY - (float)(yy);
        this.UpperArmR.rotationPointZ = this.UpperArmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.08832 + (((tickAnim - 0) / 3) * (8.82943-(32.08832)));
            yy = -3.7523 + (((tickAnim - 0) / 3) * (5.82256-(-3.7523)));
            zz = 23.2207 + (((tickAnim - 0) / 3) * (23.44731-(23.2207)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.82943 + (((tickAnim - 3) / 5) * (32.08832-(8.82943)));
            yy = 5.82256 + (((tickAnim - 3) / 5) * (-3.7523-(5.82256)));
            zz = 23.44731 + (((tickAnim - 3) / 5) * (23.2207-(23.44731)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 32.08832 + (((tickAnim - 8) / 4) * (8.82943-(32.08832)));
            yy = -3.7523 + (((tickAnim - 8) / 4) * (5.82256-(-3.7523)));
            zz = 23.2207 + (((tickAnim - 8) / 4) * (23.44731-(23.2207)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.82943 + (((tickAnim - 12) / 3) * (32.08832-(8.82943)));
            yy = 5.82256 + (((tickAnim - 12) / 3) * (-3.7523-(5.82256)));
            zz = 23.44731 + (((tickAnim - 12) / 3) * (23.2207-(23.44731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(xx);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(yy);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -9 + (((tickAnim - 0) / 3) * (-8-(-9)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -8 + (((tickAnim - 3) / 5) * (-2-(-8)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -2 + (((tickAnim - 8) / 4) * (-4.66562-(-2)));
            yy = 0 + (((tickAnim - 8) / 4) * (1.37537-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.09675-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -4.66562 + (((tickAnim - 12) / 3) * (-9-(-4.66562)));
            yy = 1.37537 + (((tickAnim - 12) / 3) * (0-(1.37537)));
            zz = -0.09675 + (((tickAnim - 12) / 3) * (0-(-0.09675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 3) / 5) * (-12.5-(5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -12.5 + (((tickAnim - 8) / 4) * (-5-(-12.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 12) / 3) * (0-(-5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -12.5 + (((tickAnim - 3) / 5) * (10-(-12.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 8) / 4) * (-5-(10)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 12) / 3) * (0-(-5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 3) * (0-(-1)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 1 + (((tickAnim - 8) / 4) * (0-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (-1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
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
            xx = 16 + (((tickAnim - 0) / 3) * (12-(16)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 12 + (((tickAnim - 3) / 5) * (-14-(12)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -14 + (((tickAnim - 8) / 4) * (-13.2-(-14)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -13.2 + (((tickAnim - 12) / 3) * (16-(-13.2)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL2, UpperLegL2.rotateAngleX + (float) Math.toRadians(xx), UpperLegL2.rotateAngleY + (float) Math.toRadians(yy), UpperLegL2.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegL2.rotationPointX = this.UpperLegL2.rotationPointX + (float)(xx);
        this.UpperLegL2.rotationPointY = this.UpperLegL2.rotationPointY - (float)(yy);
        this.UpperLegL2.rotationPointZ = this.UpperLegL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.08 + (((tickAnim - 0) / 3) * (21-(-8.08)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 21 + (((tickAnim - 3) / 5) * (29-(21)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 29 + (((tickAnim - 8) / 4) * (-0.4-(29)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.4 + (((tickAnim - 12) / 3) * (-8.08-(-0.4)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL2, LowerLegL2.rotateAngleX + (float) Math.toRadians(xx), LowerLegL2.rotateAngleY + (float) Math.toRadians(yy), LowerLegL2.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerLegL2.rotationPointX = this.LowerLegL2.rotationPointX + (float)(xx);
        this.LowerLegL2.rotationPointY = this.LowerLegL2.rotationPointY - (float)(yy);
        this.LowerLegL2.rotationPointZ = this.LowerLegL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7 + (((tickAnim - 0) / 3) * (-12-(7)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -12 + (((tickAnim - 3) / 5) * (-35-(-12)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -35 + (((tickAnim - 8) / 4) * (4.6-(-35)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 4.6 + (((tickAnim - 12) / 3) * (7-(4.6)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL2.rotationPointX = this.FootL2.rotationPointX + (float)(xx);
        this.FootL2.rotationPointY = this.FootL2.rotationPointY - (float)(yy);
        this.FootL2.rotationPointZ = this.FootL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15.16 + (((tickAnim - 0) / 3) * (123.59999-(-15.16)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 123.59999 + (((tickAnim - 3) / 5) * (122.59999-(123.59999)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 122.59999 + (((tickAnim - 8) / 4) * (8.43999-(122.59999)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.43999 + (((tickAnim - 12) / 3) * (-15.16-(8.43999)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL2, ToesL2.rotateAngleX + (float) Math.toRadians(xx), ToesL2.rotateAngleY + (float) Math.toRadians(yy), ToesL2.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYiQi entity = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(2+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*4), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*4));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*-4), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*-6), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*-2));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-2), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-3), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*6));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(2+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*6), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(-4.09713), UpperArmR.rotateAngleY + (float) Math.toRadians(2.18974), UpperArmR.rotateAngleZ + (float) Math.toRadians(35.58508));


        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(-20), LowerArmR.rotateAngleY + (float) Math.toRadians(0), LowerArmR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(-4.09713), UpperArmL.rotateAngleY + (float) Math.toRadians(-2.18974), UpperArmL.rotateAngleZ + (float) Math.toRadians(-35.58508));


        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(-20), LowerArmL.rotateAngleY + (float) Math.toRadians(0), LowerArmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(0), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*4), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-4));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-7), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-2), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(2+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-6), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-7));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 44 + (((tickAnim - 0) / 1) * (33-(44)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 33 + (((tickAnim - 1) / 2) * (2-(33)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2 + (((tickAnim - 3) / 2) * (-19-(2)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -19 + (((tickAnim - 5) / 3) * (-8-(-19)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8 + (((tickAnim - 8) / 2) * (44-(-8)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7 + (((tickAnim - 0) / 3) * (20-(-7)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 3) / 2) * (-34-(20)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -34 + (((tickAnim - 5) / 3) * (-7-(-34)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7 + (((tickAnim - 8) / 2) * (-7-(-7)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -9 + (((tickAnim - 0) / 1) * (-13.67-(-9)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -13.67 + (((tickAnim - 1) / 2) * (-65-(-13.67)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -65 + (((tickAnim - 3) / 2) * (-3-(-65)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (30-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 30 + (((tickAnim - 8) / 2) * (-9-(30)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 108 + (((tickAnim - 0) / 1) * (126-(108)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 126 + (((tickAnim - 1) / 2) * (111-(126)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 111 + (((tickAnim - 3) / 2) * (97-(111)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 97 + (((tickAnim - 5) / 3) * (-11-(97)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11 + (((tickAnim - 8) / 2) * (108-(-11)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -23 + (((tickAnim - 0) / 1) * (-15-(-23)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 1) / 2) * (-5-(-15)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 3) / 2) * (24-(-5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 24 + (((tickAnim - 5) / 1) * (19-(24)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 19 + (((tickAnim - 6) / 2) * (-9-(19)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9 + (((tickAnim - 8) / 2) * (-23-(-9)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL2, UpperLegL2.rotateAngleX + (float) Math.toRadians(xx), UpperLegL2.rotateAngleY + (float) Math.toRadians(yy), UpperLegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -24 + (((tickAnim - 0) / 1) * (-15.67-(-24)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -15.67 + (((tickAnim - 1) / 2) * (-14-(-15.67)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -14 + (((tickAnim - 3) / 2) * (0-(-14)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (8-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8 + (((tickAnim - 6) / 2) * (15-(8)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 8) / 2) * (-24-(15)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL2, LowerLegL2.rotateAngleX + (float) Math.toRadians(xx), LowerLegL2.rotateAngleY + (float) Math.toRadians(yy), LowerLegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 3 + (((tickAnim - 0) / 1) * (26.67-(3)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 26.67 + (((tickAnim - 1) / 2) * (23-(26.67)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 23 + (((tickAnim - 3) / 2) * (-8-(23)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -8 + (((tickAnim - 5) / 1) * (11.33-(-8)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.33 + (((tickAnim - 6) / 2) * (-46-(11.33)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -46 + (((tickAnim - 8) / 2) * (3-(-46)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 97 + (((tickAnim - 0) / 1) * (6.33-(97)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 6.33 + (((tickAnim - 1) / 2) * (-1-(6.33)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1 + (((tickAnim - 3) / 2) * (130-(-1)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 130 + (((tickAnim - 5) / 3) * (153-(130)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 153 + (((tickAnim - 8) / 2) * (97-(153)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL2, ToesL2.rotateAngleX + (float) Math.toRadians(xx), ToesL2.rotateAngleY + (float) Math.toRadians(yy), ToesL2.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYiQi entity = (EntityPrehistoricFloraYiQi) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360+90))+13.5), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(27.4224+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), UpperLegL.rotateAngleY + (float) Math.toRadians(-7.9716), UpperLegL.rotateAngleZ + (float) Math.toRadians(-6.0573));


        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(2.5), LowerLegL.rotateAngleY + (float) Math.toRadians(0), LowerLegL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(67.5), ToesL.rotateAngleY + (float) Math.toRadians(0), ToesL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-2.5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360+120))*-2.5), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440))*1));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(5+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360+180))*5), Tail2.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*2.5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720+90))*2.5));


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(-37.7964+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440*2))*-2), UpperArmR.rotateAngleY + (float) Math.toRadians(41.4714+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360+90))*1.5), UpperArmR.rotateAngleZ + (float) Math.toRadians(90.1336+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360))*4));
        this.UpperArmR.rotationPointX = this.UpperArmR.rotationPointX + (float)(-0.1);
        this.UpperArmR.rotationPointY = this.UpperArmR.rotationPointY - (float)(1.5);
        this.UpperArmR.rotationPointZ = this.UpperArmR.rotationPointZ + (float)(1.1);


        this.setRotateAngle(WingR, WingR.rotateAngleX + (float) Math.toRadians(0), WingR.rotateAngleY + (float) Math.toRadians(0), WingR.rotateAngleZ + (float) Math.toRadians(-60));


        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440*2-90))+83.3246), LowerArmR.rotateAngleY + (float) Math.toRadians(-2.7701+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-2.5), LowerArmR.rotateAngleZ + (float) Math.toRadians(-12.52+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(-67.5), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(-37.2036+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440*2))*-2), UpperArmL.rotateAngleY + (float) Math.toRadians(-41.4714+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360+90))*1.5), UpperArmL.rotateAngleZ + (float) Math.toRadians(-90.1336+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360))*4));
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(0.1);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(1.5);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(1);


        this.setRotateAngle(WingL, WingL.rotateAngleX + (float) Math.toRadians(0), WingL.rotateAngleY + (float) Math.toRadians(0), WingL.rotateAngleZ + (float) Math.toRadians(60));


        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440*2-90))+83.3246), LowerArmL.rotateAngleY + (float) Math.toRadians(2.7701+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-2.5), LowerArmL.rotateAngleZ + (float) Math.toRadians(12.52+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(-67.5), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(20+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360+60))*5), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(0));
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(0);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(0.5);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(-0.75);


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360+60))*3), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-22.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-7.5+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(0), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperLegL2, UpperLegL2.rotateAngleX + (float) Math.toRadians(27.4224+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720+90))*-5), UpperLegL2.rotateAngleY + (float) Math.toRadians(7.97157), UpperLegL2.rotateAngleZ + (float) Math.toRadians(6.05734));


        this.setRotateAngle(LowerLegL2, LowerLegL2.rotateAngleX + (float) Math.toRadians(2.5), LowerLegL2.rotateAngleY + (float) Math.toRadians(0), LowerLegL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ToesL2, ToesL2.rotateAngleX + (float) Math.toRadians(67.5), ToesL2.rotateAngleY + (float) Math.toRadians(0), ToesL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(17.5), FootL.rotateAngleY + (float) Math.toRadians(0), FootL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(17.5), FootL2.rotateAngleY + (float) Math.toRadians(0), FootL2.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
