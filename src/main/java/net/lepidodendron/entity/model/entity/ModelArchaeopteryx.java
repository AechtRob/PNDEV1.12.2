package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeopteryx;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelArchaeopteryx extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Archaeopteryx;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer ToesR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer ToesL;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer feathers2;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer feathers;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer HandwingL;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer HandsL;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer feathers3;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer feathers4;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer HandwingR;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer HandsR;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer Jaw;

    private ModelAnimator animator;

    public ModelArchaeopteryx() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Archaeopteryx = new AdvancedModelRenderer(this);
        this.Archaeopteryx.setRotationPoint(0.5F, 11.1F, 1.0F);


        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(-1.0F, -2.0F, -1.0F);
        this.Archaeopteryx.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.192F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 30, 0, -1.5F, 0.1913F, -0.1317F, 4, 5, 5, 0.01F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-2.5F, 1.0F, 2.0F);
        this.Archaeopteryx.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.3927F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.65F, -0.6F);
        this.UpperLegR.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 34, -0.75F, 0.1F, 2.05F, 0, 6, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.9F, -0.6F);
        this.UpperLegR.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -0.4F, -0.95F, 2, 6, 3, 0.0F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-0.2F, 2.8F, -4.2F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, -0.0436F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4712F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 46, -0.25F, -0.2F, -1.3F, 0, 6, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 34, -0.25F, -0.2F, 1.2F, 0, 6, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 41, -0.5F, -0.2F, -0.3F, 1, 6, 2, -0.001F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 4.15F, 3.35F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6283F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 33, -0.5F, -0.1F, -0.6F, 1, 5, 1, -0.002F, false));

        this.ToesR = new AdvancedModelRenderer(this);
        this.ToesR.setRotationPoint(0.0F, 3.35F, -2.75F);
        this.FootR.addChild(ToesR);
        this.setRotateAngle(ToesR, -0.5672F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ToesR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 19, -1.0F, -0.3F, -3.75F, 2, 1, 4, 0.0F, false));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.ToesR.addChild(clawR);
        this.setRotateAngle(clawR, -0.2618F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.75F, 1.75F);
        this.clawR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 21, 1.0F, -1.3F, -3.75F, 0, 2, 2, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(1.5F, 1.0F, 2.0F);
        this.Archaeopteryx.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.3927F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.65F, -0.6F);
        this.UpperLegL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 34, 0.75F, 0.1F, 2.05F, 0, 6, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.9F, -0.6F);
        this.UpperLegL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.0F, -0.4F, -0.95F, 2, 6, 3, 0.0F, true));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.2F, 2.8F, -4.2F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, -0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4712F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 46, 0.25F, -0.2F, -1.3F, 0, 6, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 34, 0.25F, -0.2F, 1.2F, 0, 6, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 41, -0.5F, -0.2F, -0.3F, 1, 6, 2, -0.001F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 4.15F, 3.35F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.1745F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6283F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 33, -0.5F, -0.1F, -0.6F, 1, 5, 1, -0.002F, true));

        this.ToesL = new AdvancedModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 3.35F, -2.75F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, -0.5672F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ToesL.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0524F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 19, -1.0F, -0.3F, -3.75F, 2, 1, 4, 0.0F, true));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(0.25F, -0.25F, 0.0F);
        this.ToesL.addChild(clawL);
        this.setRotateAngle(clawL, -0.2618F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.75F, 1.75F);
        this.clawL.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 21, -1.0F, -1.3F, -3.75F, 0, 2, 2, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(-0.5F, -0.1F, 3.5F);
        this.Archaeopteryx.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.096F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 18, 32, -1.0F, -0.1F, -0.4F, 2, 2, 6, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 12, 19, -3.5F, 0.4F, -0.4F, 7, 0, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.25F, 5.6F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.2182F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 12, -4.0F, 0.25F, -0.6F, 7, 0, 7, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 33, -1.0F, 0.0F, -0.6F, 1, 1, 6, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 5.5F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1309F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -5.0F, 0.25F, 0.5F, 9, 0, 12, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0F, 0.25F);
        this.Tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 25, -1.0F, 0.0F, -0.6F, 1, 1, 7, -0.01F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 1.3F, -1.0F);
        this.Archaeopteryx.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 32, 10, -2.5F, -3.1F, -3.5F, 4, 5, 4, 0.001F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(-0.5F, -3.0F, -4.0F);
        this.Body.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 40, 41, -1.5F, 0.0F, -1.5F, 3, 4, 2, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(1.4F, 1.8F, -0.6F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.3828F, 0.1392F, -1.2544F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 28, 34, -0.6386F, -2.7291F, -0.2762F, 1, 3, 6, 0.0F, true));

        this.feathers2 = new AdvancedModelRenderer(this);
        this.feathers2.setRotationPoint(0.3614F, -0.7291F, 2.9738F);
        this.UpperArmL.addChild(feathers2);
        this.feathers2.cubeList.add(new ModelBox(feathers2, 24, 18, -0.15F, -7.0F, -2.0F, 0, 7, 7, 0.0F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(-0.8886F, -0.2291F, 5.9738F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -1.5889F, -0.3454F, 1.0399F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.4F, -0.2F);
        this.LowerArmL.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.4835F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 36, 0.0F, -1.35F, -0.25F, 1, 2, 6, -0.001F, true));

        this.feathers = new AdvancedModelRenderer(this);
        this.feathers.setRotationPoint(0.75F, 2.6F, -0.2F);
        this.LowerArmL.addChild(feathers);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -3.0F, 0.0F);
        this.feathers.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.4835F, -0.0348F, -0.003F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 3, 1.15F, -11.35F, -3.0F, 0, 11, 9, 0.0F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.6F, 5.0F, 0.1F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 1.4835F, -0.0436F, 0.0F);


        this.HandwingL = new AdvancedModelRenderer(this);
        this.HandwingL.setRotationPoint(0.4F, 0.8F, 1.5F);
        this.HandL.addChild(HandwingL);
        this.setRotateAngle(HandwingL, -0.0433F, -0.0057F, 0.0438F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.HandwingL.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -2.2407F, -0.0441F, 0.137F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 17, 0.65F, -14.3127F, -2.6518F, 0, 13, 6, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.HandwingL.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.5952F, -0.0389F, 0.1356F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 19, 0.75F, -12.9127F, -0.6518F, 0, 13, 6, 0.0F, true));

        this.HandsL = new AdvancedModelRenderer(this);
        this.HandsL.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandL.addChild(HandsL);
        this.setRotateAngle(HandsL, -0.0295F, 0.0431F, -0.0771F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsL.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3337F, -0.0956F, 0.1667F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 31, 0.375F, 0.15F, -2.5F, 0, 4, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsL.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5518F, -0.0956F, 0.1667F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 0, -0.6F, 0.15F, -0.75F, 1, 4, 1, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsL.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4209F, -0.0956F, 0.1667F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 44, -0.6F, -0.6F, -1.0F, 1, 7, 1, 0.0F, true));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-1.4F, 1.8F, -0.6F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.3828F, -0.1392F, 1.2544F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 28, 34, -0.3614F, -2.7291F, -0.2762F, 1, 3, 6, 0.0F, false));

        this.feathers3 = new AdvancedModelRenderer(this);
        this.feathers3.setRotationPoint(-0.3614F, -0.7291F, 2.9738F);
        this.UpperArmR.addChild(feathers3);
        this.feathers3.cubeList.add(new ModelBox(feathers3, 24, 18, 0.15F, -7.0F, -2.0F, 0, 7, 7, 0.0F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(0.8886F, -0.2291F, 5.9738F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -1.5889F, 0.3454F, -1.0399F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.4F, -0.2F);
        this.LowerArmR.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -1.4835F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 36, -1.0F, -1.35F, -0.25F, 1, 2, 6, -0.001F, false));

        this.feathers4 = new AdvancedModelRenderer(this);
        this.feathers4.setRotationPoint(-0.75F, 2.6F, -0.2F);
        this.LowerArmR.addChild(feathers4);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, -3.0F, 0.0F);
        this.feathers4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.4835F, 0.0348F, 0.003F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 3, -1.15F, -11.35F, -3.0F, 0, 11, 9, 0.0F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-0.6F, 5.0F, 0.1F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 1.4835F, 0.0436F, 0.0F);


        this.HandwingR = new AdvancedModelRenderer(this);
        this.HandwingR.setRotationPoint(-0.4F, 0.8F, 1.5F);
        this.HandR.addChild(HandwingR);
        this.setRotateAngle(HandwingR, -0.0433F, 0.0057F, -0.0438F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.HandwingR.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -2.2407F, 0.0441F, -0.137F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 17, -0.65F, -14.3127F, -2.6518F, 0, 13, 6, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.HandwingR.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.5952F, 0.0389F, -0.1356F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 12, 19, -0.75F, -12.9127F, -0.6518F, 0, 13, 6, 0.0F, false));

        this.HandsR = new AdvancedModelRenderer(this);
        this.HandsR.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandR.addChild(HandsR);
        this.setRotateAngle(HandsR, 0.0295F, -0.0431F, 0.0771F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsR.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3337F, 0.0956F, -0.1667F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 31, -0.375F, 0.15F, -2.5F, 0, 4, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsR.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.5518F, 0.0956F, -0.1667F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 0, -0.4F, 0.15F, -0.75F, 1, 4, 1, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsR.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4209F, 0.0956F, -0.1667F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 44, -0.4F, -0.6F, -1.0F, 1, 7, 1, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -0.3F, -1.5F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.48F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, -0.7409F, 0.4629F);
        this.Neck1.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.7156F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 40, 24, -1.5F, 0.75F, -0.65F, 2, 3, 3, 0.001F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.5591F, -0.4371F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.4276F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 2.0072F, -1.4897F);
        this.Neck2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.6283F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 6, 9, -1.5F, -2.2557F, -1.0422F, 2, 2, 1, -0.011F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, -0.2928F, 0.2103F);
        this.Neck2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.9425F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 14, 40, -1.5F, -0.1784F, -3.1807F, 2, 3, 3, 0.01F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -2.4428F, -2.3397F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.1309F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, -1.9F, -1.4F);
        this.Neck3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.5411F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 43, 0, -1.5F, 0.2449F, 0.1398F, 2, 3, 2, -0.002F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, 1.4F, -1.7F);
        this.Neck3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.4887F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 30, 43, -1.5F, -2.76F, -0.5234F, 2, 3, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.3F, -1.35F);
        this.Neck3.addChild(head);
        this.setRotateAngle(head, 0.1047F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 44, 10, -1.0F, -0.4F, -2.0F, 2, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 44, 33, -1.0F, 0.15F, -2.4F, 2, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 30, -1.0F, 0.6F, -3.0F, 2, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 9, -0.5F, 0.6F, -4.5F, 1, 1, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.6F, -5.1F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1309F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 7, 0, -0.5F, 0.0566F, 0.5662F, 1, 1, 1, -0.002F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 32, 21, -0.5F, 0.0566F, 1.3162F, 1, 1, 1, -0.001F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -0.4F, -3.0F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.6545F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 30, 10, -1.5F, 0.6841F, -0.5022F, 2, 1, 1, -0.002F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 12, 38, -1.5F, 0.6841F, -0.2522F, 2, 1, 1, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.5F, 1.1F, 0.0F);
        this.head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 40, 19, -1.5F, 0.0F, -3.0F, 2, 1, 3, 0.005F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 32, 19, -1.0F, 0.0F, -3.975F, 1, 1, 1, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 32, 12, -1.0F, 0.0F, -4.475F, 1, 1, 1, -0.02F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 4, 44, -1.5F, -1.0F, -2.0F, 2, 2, 2, -0.003F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Archaeopteryx.render(f5);
    }
    
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(Archaeopteryx, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.00F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.00F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.00F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegR, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, -0.7F, 1.0F, -0.8F);
        this.setRotateAngle(LowerArmL, 0.2F, 0.5F, 0.0F);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, -0.7F, -1.0F, 0.8F);
        this.setRotateAngle(LowerArmR, 0.2F, -0.5F, 0.0F);
        this.setRotateAngle(HandR, 0.0F,0.0F, 0.0F);
        this.Archaeopteryx.offsetY = -0.15F;
        this.Archaeopteryx.offsetX = 0.0F;
        this.Archaeopteryx.offsetZ = -0.42F;
        this.Archaeopteryx.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Archaeopteryx, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(ToesL, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegR, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, -1.0F, 0.2F, -2.0F);
        this.setRotateAngle(LowerArmL, 0.3F, -0.5F, -0.4F);
        this.setRotateAngle(HandL, 0.0F, 0.1F, -0.4F);
        this.setRotateAngle(UpperArmR, -1.0F, -0.2F, 2.0F);
        this.setRotateAngle(LowerArmR, 0.3F, 0.5F, 0.4F);
        this.setRotateAngle(HandR, 0.0F,0.1F, 0.4F);
        this.Archaeopteryx.offsetX = 0.0F;
        this.Archaeopteryx.offsetY = -0.0F;
        this.Archaeopteryx.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Archaeopteryx.offsetY = -2.30F;
        this.Archaeopteryx.offsetX = -0.05F;
        this.Archaeopteryx.rotateAngleY = (float)Math.toRadians(210);
        this.Archaeopteryx.rotateAngleX = (float)Math.toRadians(8);
        this.Archaeopteryx.rotateAngleZ = (float)Math.toRadians(-8);
        this.Archaeopteryx.scaleChildren = true;
        float scaler = 2.9F;
        this.Archaeopteryx.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Archaeopteryx, -0.5F, 4.0F, 0.0F);
        this.setRotateAngle(Body, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(ToesL, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegR, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, -1.0F, 0.2F, -2.0F);
        this.setRotateAngle(LowerArmL, 0.3F, -0.5F, -0.4F);
        this.setRotateAngle(HandL, 0.0F, 0.1F, -0.4F);
        this.setRotateAngle(UpperArmR, -1.0F, -0.2F, 2.0F);
        this.setRotateAngle(LowerArmR, 0.3F, 0.5F, 0.4F);
        this.setRotateAngle(HandR, 0.0F,0.1F, 0.4F);
        //End of pose, now render the model:
        this.Archaeopteryx.render(f);
        //Reset rotations, positions and sizing:
        this.Archaeopteryx.setScale(1.0F, 1.0F, 1.0F);
        this.Archaeopteryx.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraArchaeopteryx ee = (EntityPrehistoricFloraArchaeopteryx) e;

        this.faceTarget(f3, f4, 8, Neck1);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3};
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
        EntityPrehistoricFloraArchaeopteryx ee = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;

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
                    if (ee.getIsLaunching()) {
                        animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //Is gliding:
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            if (ee.getIsLaunching()) {
                animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
                //Is gliding:
                animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
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
        else if (ee.getAnimation() == ee.DISPLAY_ANIMATION) { //The display
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.feathers.setScale((float)1,(float)0,(float)0);


        this.feathers3.setScale((float)1,(float)0,(float)0);


        this.feathers4.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (22.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 20) / 5) * (0-(22.5)));
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


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 10) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5 + (((tickAnim - 0) / 5) * (8.42-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.42 + (((tickAnim - 5) / 5) * (-22.5-(8.42)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -22.5 + (((tickAnim - 10) / 5) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 15) / 5) * (32.5-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 32.5 + (((tickAnim - 20) / 5) * (-22.5-(32.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 25) / 5) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5-(-22.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5 + (((tickAnim - 30) / 5) * (8.42-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 8.42 + (((tickAnim - 35) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5-(8.42)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = -0.625 + (((tickAnim - 5) / 10) * (0-(-0.625)));
            zz = -0.4 + (((tickAnim - 5) / 10) * (1-(-0.4)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-1.5-(0)));
            zz = 1 + (((tickAnim - 15) / 5) * (-2-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -1.5 + (((tickAnim - 20) / 5) * (0-(-1.5)));
            zz = -2 + (((tickAnim - 20) / 5) * (1-(-2)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 1 + (((tickAnim - 25) / 5) * (0-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.625 + (((tickAnim - 35) / 5) * (0-(-0.625)));
            zz = -0.4 + (((tickAnim - 35) / 5) * (0-(-0.4)));
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
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5 + (((tickAnim - 0) / 5) * (15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 5) / 5) * (20-(15)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 10) / 5) * (20-(20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 15) / 5) * (27.5-(20)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 27.5 + (((tickAnim - 20) / 5) * (20-(27.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 25) / 5) * (0-(20)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 35) / 5) * (0-(15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-5 + (((tickAnim - 0) / 5) * (-16.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -16.25 + (((tickAnim - 5) / 5) * (7.5-(-16.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 10) / 5) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 15) / 5) * (-25-(7.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -25 + (((tickAnim - 20) / 5) * (7.5-(-25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 25) / 5) * (-27.5-(7.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -27.5 + (((tickAnim - 30) / 5) * (-16.25-(-27.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -16.25 + (((tickAnim - 35) / 5) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 20) / 10) * (0-(0.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0.25-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0.25 + (((tickAnim - 30) / 10) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (22.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 20) / 5) * (0-(22.5)));
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
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));

        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0.5);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-27.5-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -27.5 + (((tickAnim - 20) / 5) * (0-(-27.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (27.5-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 27.5 + (((tickAnim - 20) / 5) * (0-(27.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 5) / 5) * (10-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 10) / 5) * (10-(10)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 15) / 5) * (-5-(10)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 20) / 5) * (10-(-5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 25) / 5) * (-15-(10)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -15 + (((tickAnim - 30) / 5) * (-2.5-(-15)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 35) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 17.5 + (((tickAnim - 18) / 6) * (0-(17.5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (32.5-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 32.5 + (((tickAnim - 30) / 5) * (0-(32.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.feathers.setScale((float)1,(float)0,(float)0);


        this.feathers3.setScale((float)1,(float)0,(float)0);


        this.feathers4.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (22.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 20) / 5) * (0-(22.5)));
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


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 10) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5 + (((tickAnim - 0) / 5) * (8.42-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.42 + (((tickAnim - 5) / 5) * (-22.5-(8.42)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -22.5 + (((tickAnim - 10) / 5) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 15) / 5) * (32.5-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 32.5 + (((tickAnim - 20) / 5) * (-22.5-(32.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 25) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5-(-22.5)));
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
            yy = 0 + (((tickAnim - 0) / 5) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = -0.625 + (((tickAnim - 5) / 10) * (0-(-0.625)));
            zz = -0.4 + (((tickAnim - 5) / 10) * (1-(-0.4)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-1.5-(0)));
            zz = 1 + (((tickAnim - 15) / 5) * (-2-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -1.5 + (((tickAnim - 20) / 5) * (0-(-1.5)));
            zz = -2 + (((tickAnim - 20) / 5) * (1-(-2)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 1 + (((tickAnim - 25) / 5) * (0-(1)));
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
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5 + (((tickAnim - 0) / 5) * (15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 5) / 5) * (20-(15)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 10) / 5) * (20-(20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 15) / 5) * (27.5-(20)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 27.5 + (((tickAnim - 20) / 5) * (20-(27.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 25) / 5) * (0-(20)));
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
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-5 + (((tickAnim - 0) / 5) * (-16.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -16.25 + (((tickAnim - 5) / 5) * (7.5-(-16.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 10) / 5) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 15) / 5) * (-25-(7.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -25 + (((tickAnim - 20) / 5) * (7.5-(-25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 25) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 20) / 10) * (0-(0.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (22.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 20) / 5) * (0-(22.5)));
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
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));

        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0.5);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-27.5-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -27.5 + (((tickAnim - 20) / 5) * (0-(-27.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (27.5-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 27.5 + (((tickAnim - 20) / 5) * (0-(27.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 5) / 5) * (10-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 10) / 5) * (10-(10)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 15) / 5) * (-5-(10)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 20) / 5) * (10-(-5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 25) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 17.5 + (((tickAnim - 18) / 3) * (0-(17.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(HandsL, HandsL.rotateAngleX + (float) Math.toRadians(0), HandsL.rotateAngleY + (float) Math.toRadians(0), HandsL.rotateAngleZ + (float) Math.toRadians(5));
        this.HandsL.rotationPointX = this.HandsL.rotationPointX + (float)(-0.35);
        this.HandsL.rotationPointY = this.HandsL.rotationPointY - (float)(0);
        this.HandsL.rotationPointZ = this.HandsL.rotationPointZ + (float)(0);


        this.setRotateAngle(HandsR, HandsR.rotateAngleX + (float) Math.toRadians(0), HandsR.rotateAngleY + (float) Math.toRadians(0), HandsR.rotateAngleZ + (float) Math.toRadians(-5));
        this.HandsR.rotationPointX = this.HandsR.rotationPointX + (float)(0.35);
        this.HandsR.rotationPointY = this.HandsR.rotationPointY - (float)(0);
        this.HandsR.rotationPointZ = this.HandsR.rotationPointZ + (float)(0);


    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.feathers.setScale((float)1,(float)0,(float)0);


        this.feathers3.setScale((float)1,(float)0,(float)0);


        this.feathers4.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (22.5-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 12) / 6) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 22.5 + (((tickAnim - 18) / 1) * (0-(22.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 19) / 11) * (22.5-(0)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 22.5 + (((tickAnim - 30) / 3) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 22.5 + (((tickAnim - 33) / 1) * (0-(22.5)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 34) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 14) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Jaw.rotationPointX = this.Jaw.rotationPointX + (float)(xx);
        this.Jaw.rotationPointY = this.Jaw.rotationPointY - (float)(yy);
        this.Jaw.rotationPointZ = this.Jaw.rotationPointZ + (float)(zz);



        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(0);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(0);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (36.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 36.25 + (((tickAnim - 3) / 2) * (52.5-(36.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 52.5 + (((tickAnim - 5) / 3) * (40-(52.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (40-(40)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 40 + (((tickAnim - 10) / 8) * (40-(40)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 40 + (((tickAnim - 18) / 5) * (40-(40)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 40 + (((tickAnim - 23) / 2) * (39.85268-(40)));
            yy = 0 + (((tickAnim - 23) / 2) * (14.00458-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (7.72803-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 39.85268 + (((tickAnim - 25) / 23) * (39.85-(39.85268)));
            yy = 14.00458 + (((tickAnim - 25) / 23) * (14-(14.00458)));
            zz = 7.72803 + (((tickAnim - 25) / 23) * (7.73-(7.72803)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 39.85 + (((tickAnim - 48) / 2) * (0-(39.85)));
            yy = 14 + (((tickAnim - 48) / 2) * (0-(14)));
            zz = 7.73 + (((tickAnim - 48) / 2) * (0-(7.73)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1.25 + (((tickAnim - 3) / 2) * (-2-(-1.25)));
            zz = -1 + (((tickAnim - 3) / 2) * (-1.5-(-1)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -2 + (((tickAnim - 5) / 3) * (-1.4-(-2)));
            zz = -1.5 + (((tickAnim - 5) / 3) * (-1.5-(-1.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -1.4 + (((tickAnim - 8) / 2) * (-1.4-(-1.4)));
            zz = -1.5 + (((tickAnim - 8) / 2) * (-1.5-(-1.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -1.4 + (((tickAnim - 10) / 8) * (-1.4-(-1.4)));
            zz = -1.5 + (((tickAnim - 10) / 8) * (-1.5-(-1.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -1.4 + (((tickAnim - 18) / 5) * (-1.4-(-1.4)));
            zz = -1.5 + (((tickAnim - 18) / 5) * (-1.5-(-1.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 23) / 25) * (0-(0)));
            yy = -1.4 + (((tickAnim - 23) / 25) * (-1.4-(-1.4)));
            zz = -1.5 + (((tickAnim - 23) / 25) * (-1.5-(-1.5)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = -1.4 + (((tickAnim - 48) / 2) * (0-(-1.4)));
            zz = -1.5 + (((tickAnim - 48) / 2) * (0-(-1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -11.25 + (((tickAnim - 3) / 3) * (22.5-(-11.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 6) / 2) * (-2.5-(22.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -2.5 + (((tickAnim - 8) / 3) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 11) / 2) * (60-(-2.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 60 + (((tickAnim - 13) / 6) * (-2.5-(60)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -2.5 + (((tickAnim - 19) / 4) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -2.5 + (((tickAnim - 23) / 3) * (-3.87545-(-2.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (4.21714-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (-13.47314-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -3.87545 + (((tickAnim - 26) / 3) * (56.12455-(-3.87545)));
            yy = 4.21714 + (((tickAnim - 26) / 3) * (4.21714-(4.21714)));
            zz = -13.47314 + (((tickAnim - 26) / 3) * (-13.47314-(-13.47314)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 56.12455 + (((tickAnim - 29) / 4) * (-1.37545-(56.12455)));
            yy = 4.21714 + (((tickAnim - 29) / 4) * (4.21714-(4.21714)));
            zz = -13.47314 + (((tickAnim - 29) / 4) * (-13.47314-(-13.47314)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = -1.37545 + (((tickAnim - 33) / 15) * (-1.38-(-1.37545)));
            yy = 4.21714 + (((tickAnim - 33) / 15) * (4.22-(4.21714)));
            zz = -13.47314 + (((tickAnim - 33) / 15) * (-13.47-(-13.47314)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -1.38 + (((tickAnim - 48) / 2) * (0-(-1.38)));
            yy = 4.22 + (((tickAnim - 48) / 2) * (0-(4.22)));
            zz = -13.47 + (((tickAnim - 48) / 2) * (0-(-13.47)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.82-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.82 + (((tickAnim - 3) / 3) * (0.25-(-0.82)));
            zz = 0.3 + (((tickAnim - 3) / 3) * (0-(0.3)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 6) / 2) * (-0.075-(0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 8) / 3) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.075 + (((tickAnim - 11) / 2) * (0.67-(-0.075)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.67 + (((tickAnim - 13) / 6) * (-0.075-(0.67)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = -0.075 + (((tickAnim - 19) / 4) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = -0.075 + (((tickAnim - 23) / 6) * (0.67-(-0.075)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0.67 + (((tickAnim - 29) / 4) * (-0.33-(0.67)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            yy = -0.33 + (((tickAnim - 33) / 15) * (-0.33-(-0.33)));
            zz = 0 + (((tickAnim - 33) / 15) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = -0.33 + (((tickAnim - 48) / 2) * (0-(-0.33)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 7.5 + (((tickAnim - 4) / 3) * (-20-(7.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -20 + (((tickAnim - 7) / 2) * (2.5-(-20)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 2.5 + (((tickAnim - 9) / 3) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 12) / 6) * (-20-(2.5)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -20 + (((tickAnim - 18) / 1) * (2.5-(-20)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 2.5 + (((tickAnim - 19) / 5) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 2.5 + (((tickAnim - 24) / 3) * (2.36207-(2.5)));
            yy = 0 + (((tickAnim - 24) / 3) * (-3.19835-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (-10.70679-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 2.36207 + (((tickAnim - 27) / 3) * (-12.63793-(2.36207)));
            yy = -3.19835 + (((tickAnim - 27) / 3) * (-3.19835-(-3.19835)));
            zz = -10.70679 + (((tickAnim - 27) / 3) * (-10.70679-(-10.70679)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -12.63793 + (((tickAnim - 30) / 3) * (-22.63793-(-12.63793)));
            yy = -3.19835 + (((tickAnim - 30) / 3) * (-3.19835-(-3.19835)));
            zz = -10.70679 + (((tickAnim - 30) / 3) * (-10.70679-(-10.70679)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = -22.63793 + (((tickAnim - 33) / 15) * (-22.64-(-22.63793)));
            yy = -3.19835 + (((tickAnim - 33) / 15) * (-3.2-(-3.19835)));
            zz = -10.70679 + (((tickAnim - 33) / 15) * (-10.71-(-10.70679)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -22.64 + (((tickAnim - 48) / 2) * (0-(-22.64)));
            yy = -3.2 + (((tickAnim - 48) / 2) * (0-(-3.2)));
            zz = -10.71 + (((tickAnim - 48) / 2) * (0-(-10.71)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.075-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0.175-(0)));
            zz = 0.075 + (((tickAnim - 4) / 5) * (0.005-(0.075)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 9) / 3) * (0.175-(0.175)));
            zz = 0.005 + (((tickAnim - 9) / 3) * (0.005-(0.005)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0.175 + (((tickAnim - 12) / 7) * (0.175-(0.175)));
            zz = 0.005 + (((tickAnim - 12) / 7) * (0.005-(0.005)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 19) / 5) * (0.175-(0.175)));
            zz = 0.005 + (((tickAnim - 19) / 5) * (0.005-(0.005)));
        }
        else if (tickAnim >= 24 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 24) / 24) * (0-(0)));
            yy = 0.175 + (((tickAnim - 24) / 24) * (0.18-(0.175)));
            zz = 0.005 + (((tickAnim - 24) / 24) * (0-(0.005)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.18 + (((tickAnim - 48) / 2) * (0-(0.18)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.5 + (((tickAnim - 7) / 2) * (20-(12.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 20 + (((tickAnim - 9) / 3) * (20-(20)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 12) / 6) * (-2.5-(20)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -2.5 + (((tickAnim - 18) / 1) * (20-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 20 + (((tickAnim - 19) / 5) * (20-(20)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 24) / 6) * (-2.5-(20)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -2.5 + (((tickAnim - 30) / 7) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -2.5 + (((tickAnim - 37) / 1) * (-6.78444-(-2.5)));
            yy = 0 + (((tickAnim - 37) / 1) * (19.72156-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (-8.08367-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -6.78444 + (((tickAnim - 38) / 3) * (-6.78444-(-6.78444)));
            yy = 19.72156 + (((tickAnim - 38) / 3) * (19.72156-(19.72156)));
            zz = -8.08367 + (((tickAnim - 38) / 3) * (-8.08367-(-8.08367)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -6.78444 + (((tickAnim - 41) / 2) * (-2.5-(-6.78444)));
            yy = 19.72156 + (((tickAnim - 41) / 2) * (0-(19.72156)));
            zz = -8.08367 + (((tickAnim - 41) / 2) * (0-(-8.08367)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = -2.5 + (((tickAnim - 43) / 1) * (-9.67952-(-2.5)));
            yy = 0 + (((tickAnim - 43) / 1) * (-19.96692-(0)));
            zz = 0 + (((tickAnim - 43) / 1) * (14.55473-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -9.67952 + (((tickAnim - 44) / 4) * (-9.89746-(-9.67952)));
            yy = -19.96692 + (((tickAnim - 44) / 4) * (-27.45059-(-19.96692)));
            zz = 14.55473 + (((tickAnim - 44) / 4) * (15.09557-(14.55473)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -9.89746 + (((tickAnim - 48) / 2) * (0-(-9.89746)));
            yy = -27.45059 + (((tickAnim - 48) / 2) * (0-(-27.45059)));
            zz = 15.09557 + (((tickAnim - 48) / 2) * (0-(15.09557)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0.025-(0)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0.025 + (((tickAnim - 38) / 6) * (0.11-(0.025)));
            yy = 0 + (((tickAnim - 38) / 6) * (0.1-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (-0.15-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0.11 + (((tickAnim - 44) / 6) * (0-(0.11)));
            yy = 0.1 + (((tickAnim - 44) / 6) * (0-(0.1)));
            zz = -0.15 + (((tickAnim - 44) / 6) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 1 + (((tickAnim - 0) / 37) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 37) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 37) * (1-(1)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 37) / 1) * (1.1075-(1)));
            yy = 1 + (((tickAnim - 37) / 1) * (1-(1)));
            zz = 1 + (((tickAnim - 37) / 1) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 1.1075 + (((tickAnim - 38) / 10) * (1.1075-(1.1075)));
            yy = 1 + (((tickAnim - 38) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 38) / 10) * (1-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 1.1075 + (((tickAnim - 48) / 2) * (1-(1.1075)));
            yy = 1 + (((tickAnim - 48) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 48) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.head.setScale((float)xx, (float)yy, (float)zz);



        this.setRotateAngle(HandwingL, HandwingL.rotateAngleX + (float) Math.toRadians(0), HandwingL.rotateAngleY + (float) Math.toRadians(0), HandwingL.rotateAngleZ + (float) Math.toRadians(0));
        this.HandwingL.rotationPointX = this.HandwingL.rotationPointX + (float)(0);
        this.HandwingL.rotationPointY = this.HandwingL.rotationPointY - (float)(0);
        this.HandwingL.rotationPointZ = this.HandwingL.rotationPointZ + (float)(0);


        this.setRotateAngle(HandsL, HandsL.rotateAngleX + (float) Math.toRadians(0), HandsL.rotateAngleY + (float) Math.toRadians(0), HandsL.rotateAngleZ + (float) Math.toRadians(5));
        this.HandsL.rotationPointX = this.HandsL.rotationPointX + (float)(-0.35);
        this.HandsL.rotationPointY = this.HandsL.rotationPointY - (float)(0);
        this.HandsL.rotationPointZ = this.HandsL.rotationPointZ + (float)(0);


        this.setRotateAngle(HandsR, HandsR.rotateAngleX + (float) Math.toRadians(0), HandsR.rotateAngleY + (float) Math.toRadians(0), HandsR.rotateAngleZ + (float) Math.toRadians(-5));
        this.HandsR.rotationPointX = this.HandsR.rotationPointX + (float)(0.35);
        this.HandsR.rotationPointY = this.HandsR.rotationPointY - (float)(0);
        this.HandsR.rotationPointZ = this.HandsR.rotationPointZ + (float)(0);


    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.425-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -1.425 + (((tickAnim - 9) / 9) * (-2.47-(-1.425)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -2.47 + (((tickAnim - 18) / 12) * (-2.47-(-2.47)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            yy = -2.47 + (((tickAnim - 30) / 12) * (-1.425-(-2.47)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -1.425 + (((tickAnim - 42) / 8) * (0-(-1.425)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Archaeopteryx.rotationPointX = this.Archaeopteryx.rotationPointX + (float)(xx);
        this.Archaeopteryx.rotationPointY = this.Archaeopteryx.rotationPointY - (float)(yy);
        this.Archaeopteryx.rotationPointZ = this.Archaeopteryx.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 4.5 + (((tickAnim - 19) / 9) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 4.5 + (((tickAnim - 28) / 22) * (0-(4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.66-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 5.66 + (((tickAnim - 4) / 5) * (12.12-(5.66)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 12.12 + (((tickAnim - 9) / 5) * (17.84-(12.12)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 17.84 + (((tickAnim - 14) / 5) * (21.5-(17.84)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.83-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -9.83 + (((tickAnim - 4) / 5) * (-19.66-(-9.83)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -19.66 + (((tickAnim - 9) / 5) * (-28.91-(-19.66)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -28.91 + (((tickAnim - 14) / 5) * (-34.75-(-28.91)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0.175 + (((tickAnim - 18) / 1) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootR.rotationPointX = this.FootR.rotationPointX + (float)(xx);
        this.FootR.rotationPointY = this.FootR.rotationPointY - (float)(yy);
        this.FootR.rotationPointZ = this.FootR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.52-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.52 + (((tickAnim - 4) / 5) * (7.25-(3.52)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 7.25 + (((tickAnim - 9) / 4) * (9.67-(7.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.67 + (((tickAnim - 13) / 1) * (10.76-(9.67)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 10.76 + (((tickAnim - 14) / 3) * (11-(10.76)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 11 + (((tickAnim - 17) / 2) * (13.75-(11)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ToesR.rotationPointX = this.ToesR.rotationPointX + (float)(xx);
        this.ToesR.rotationPointY = this.ToesR.rotationPointY - (float)(yy);
        this.ToesR.rotationPointZ = this.ToesR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = -4.5 + (((tickAnim - 19) / 9) * (-4.5-(-4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -4.5 + (((tickAnim - 28) / 22) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 5.67 + (((tickAnim - 4) / 8) * (14.84-(5.67)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 14.84 + (((tickAnim - 12) / 4) * (19.56-(14.84)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 19.56 + (((tickAnim - 16) / 3) * (21.5-(19.56)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.55-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -9.55 + (((tickAnim - 4) / 8) * (-24.15-(-9.55)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -24.15 + (((tickAnim - 12) / 4) * (-31.21-(-24.15)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -31.21 + (((tickAnim - 16) / 3) * (-34.75-(-31.21)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 1) * (0-(0.1)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 3.49 + (((tickAnim - 4) / 15) * (13.75-(3.49)));
            yy = 0 + (((tickAnim - 4) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ToesL.rotationPointX = this.ToesL.rotationPointX + (float)(xx);
        this.ToesL.rotationPointY = this.ToesL.rotationPointY - (float)(yy);
        this.ToesL.rotationPointZ = this.ToesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 18) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5 + (((tickAnim - 18) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 30) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5 + (((tickAnim - 30) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 18) / 12) * (15-(15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2 + (((tickAnim - 18) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5 + (((tickAnim - 18) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 30) / 20) * (0-(15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2 + (((tickAnim - 30) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5 + (((tickAnim - 30) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 18) / 12) * (20-(20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1 + (((tickAnim - 18) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5 + (((tickAnim - 18) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 30) / 20) * (0-(20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1 + (((tickAnim - 30) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5 + (((tickAnim - 30) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 18) / 12) * (10-(10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 18) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 30) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 18) / 12) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 30) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 18) / 12) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 30) / 20) * (0-(-10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));



        this.feathers2.setScale((float)1,(float)0,(float)0);


        this.feathers.setScale((float)1,(float)0,(float)0);


        this.setRotateAngle(HandsL, HandsL.rotateAngleX + (float) Math.toRadians(0), HandsL.rotateAngleY + (float) Math.toRadians(0), HandsL.rotateAngleZ + (float) Math.toRadians(5));
        this.HandsL.rotationPointX = this.HandsL.rotationPointX + (float)(-0.35);
        this.HandsL.rotationPointY = this.HandsL.rotationPointY - (float)(0);
        this.HandsL.rotationPointZ = this.HandsL.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 18) / 12) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 30) / 20) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));



        this.feathers3.setScale((float)1,(float)0,(float)0);


        this.feathers4.setScale((float)1,(float)0,(float)0);


        this.setRotateAngle(HandsR, HandsR.rotateAngleX + (float) Math.toRadians(0), HandsR.rotateAngleY + (float) Math.toRadians(0), HandsR.rotateAngleZ + (float) Math.toRadians(-5));
        this.HandsR.rotationPointX = this.HandsR.rotationPointX + (float)(0.35);
        this.HandsR.rotationPointY = this.HandsR.rotationPointY - (float)(0);
        this.HandsR.rotationPointZ = this.HandsR.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -35 + (((tickAnim - 18) / 12) * (-35-(-35)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -35 + (((tickAnim - 30) / 20) * (0-(-35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 1 + (((tickAnim - 18) / 12) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 1 + (((tickAnim - 30) / 20) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 18) / 12) * (-12.5-(-12.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-3 + (((tickAnim - 18) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-3)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 30) / 20) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.05-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -0.5 + (((tickAnim - 18) / 12) * (-0.5-(-0.5)));
            zz = 0.05 + (((tickAnim - 18) / 12) * (0.05-(0.05)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 30) / 20) * (0-(-0.5)));
            zz = 0.05 + (((tickAnim - 30) / 20) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 18) / 12) * (10-(10)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 30) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -0.075 + (((tickAnim - 18) / 12) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.075 + (((tickAnim - 30) / 20) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 18) / 12) * (15-(15)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 30) / 20) * (0-(15)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;
        int animCycle = 85;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.feathers.setScale((float)1,(float)0,(float)0);


        this.setRotateAngle(HandsL, HandsL.rotateAngleX + (float) Math.toRadians(0), HandsL.rotateAngleY + (float) Math.toRadians(0), HandsL.rotateAngleZ + (float) Math.toRadians(5));
        this.HandsL.rotationPointX = this.HandsL.rotationPointX + (float)(-0.35);
        this.HandsL.rotationPointY = this.HandsL.rotationPointY - (float)(0);
        this.HandsL.rotationPointZ = this.HandsL.rotationPointZ + (float)(0);


        this.feathers3.setScale((float)1,(float)0,(float)0);


        this.feathers4.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (1.25-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1.25 + (((tickAnim - 12) / 3) * (-22.5-(1.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 74) {
            xx = -22.5 + (((tickAnim - 15) / 59) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 59) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 81) {
            xx = -22.5 + (((tickAnim - 74) / 7) * (2.5-(-22.5)));
            yy = 0 + (((tickAnim - 74) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 7) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 85) {
            xx = 2.5 + (((tickAnim - 81) / 4) * (0-(2.5)));
            yy = 0 + (((tickAnim - 81) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Archaeopteryx, Archaeopteryx.rotateAngleX + (float) Math.toRadians(xx), Archaeopteryx.rotateAngleY + (float) Math.toRadians(yy), Archaeopteryx.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0.33-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (-0.51-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.33 + (((tickAnim - 11) / 1) * (0.67-(0.33)));
            zz = -0.51 + (((tickAnim - 11) / 1) * (-1.02-(-0.51)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.67 + (((tickAnim - 12) / 1) * (1-(0.67)));
            zz = -1.02 + (((tickAnim - 12) / 1) * (-0.025-(-1.02)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 2) * (2-(1)));
            zz = -0.025 + (((tickAnim - 13) / 2) * (3-(-0.025)));
        }
        else if (tickAnim >= 15 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 15) / 59) * (0-(0)));
            yy = 2 + (((tickAnim - 15) / 59) * (2-(2)));
            zz = 3 + (((tickAnim - 15) / 59) * (3-(3)));
        }
        else if (tickAnim >= 74 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 74) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 74) / 7) * (0.67-(2)));
            zz = 3 + (((tickAnim - 74) / 7) * (0.5-(3)));
        }
        else if (tickAnim >= 81 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 81) / 4) * (0-(0)));
            yy = 0.67 + (((tickAnim - 81) / 4) * (0-(0.67)));
            zz = 0.5 + (((tickAnim - 81) / 4) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Archaeopteryx.rotationPointX = this.Archaeopteryx.rotationPointX + (float)(xx);
        this.Archaeopteryx.rotationPointY = this.Archaeopteryx.rotationPointY - (float)(yy);
        this.Archaeopteryx.rotationPointZ = this.Archaeopteryx.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 74) {
            xx = 17.5 + (((tickAnim - 15) / 59) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 15) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 59) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 81) {
            xx = 17.5 + (((tickAnim - 74) / 7) * (-1.67-(17.5)));
            yy = 0 + (((tickAnim - 74) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 7) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 85) {
            xx = -1.67 + (((tickAnim - 81) / 4) * (0-(-1.67)));
            yy = 0 + (((tickAnim - 81) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-20-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 74) {
            xx = -20 + (((tickAnim - 15) / 59) * (-20-(-20)));
            yy = 0 + (((tickAnim - 15) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 59) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 81) {
            xx = -20 + (((tickAnim - 74) / 7) * (-9.17-(-20)));
            yy = 0 + (((tickAnim - 74) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 7) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 85) {
            xx = -9.17 + (((tickAnim - 81) / 4) * (0-(-9.17)));
            yy = 0 + (((tickAnim - 81) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 74) {
            xx = 17.5 + (((tickAnim - 15) / 59) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 15) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 59) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 17.5 + (((tickAnim - 74) / 11) * (0-(17.5)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1.25 + (((tickAnim - 13) / 2) * (7.5-(-1.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 74) {
            xx = 7.5 + (((tickAnim - 15) / 59) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 15) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 59) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 7.5 + (((tickAnim - 74) / 11) * (0-(7.5)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 0) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 12) / 2) * (22.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 22.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 14) / 4) * (-13.33+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(22.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -13.33+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 18) / 2) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-13.33+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 20) / 5) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 25) / 3) * (-18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 0 + (((tickAnim - 25) / 3) * (24.1447-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (8.42855-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 28) / 5) * (-18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 24.1447 + (((tickAnim - 28) / 5) * (24.1447-(24.1447)));
            zz = 8.42855 + (((tickAnim - 28) / 5) * (8.42855-(8.42855)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 33) / 3) * (-18.2148+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 24.1447 + (((tickAnim - 33) / 3) * (26.60908-(24.1447)));
            zz = 8.42855 + (((tickAnim - 33) / 3) * (8.89402-(8.42855)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = -18.2148+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 36) / 6) * (-18.2148+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-18.2148+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 26.60908 + (((tickAnim - 36) / 6) * (26.60908-(26.60908)));
            zz = 8.89402 + (((tickAnim - 36) / 6) * (8.89402-(8.89402)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = -18.2148+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 42) / 2) * (-18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-18.2148+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 26.60908 + (((tickAnim - 42) / 2) * (24.1447-(26.60908)));
            zz = 8.89402 + (((tickAnim - 42) / 2) * (8.42855-(8.89402)));
        }
        else if (tickAnim >= 44 && tickAnim < 52) {
            xx = -18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 44) / 8) * (-18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 24.1447 + (((tickAnim - 44) / 8) * (24.1447-(24.1447)));
            zz = 8.42855 + (((tickAnim - 44) / 8) * (8.42855-(8.42855)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = -18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 52) / 2) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-18.4143+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 24.1447 + (((tickAnim - 52) / 2) * (0-(24.1447)));
            zz = 8.42855 + (((tickAnim - 52) / 2) * (0-(8.42855)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 54) / 9) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 0 + (((tickAnim - 54) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 9) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 63) / 3) * (-19.4939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 0 + (((tickAnim - 63) / 3) * (-19.79718-(0)));
            zz = 0 + (((tickAnim - 63) / 3) * (-2.89981-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 75) {
            xx = -19.4939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 66) / 9) * (-19.4939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-19.4939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = -19.79718 + (((tickAnim - 66) / 9) * (-19.79718-(-19.79718)));
            zz = -2.89981 + (((tickAnim - 66) / 9) * (-2.89981-(-2.89981)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -19.4939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 75) / 3) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-19.4939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = -19.79718 + (((tickAnim - 75) / 3) * (0-(-19.79718)));
            zz = -2.89981 + (((tickAnim - 75) / 3) * (0-(-2.89981)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1 + (((tickAnim - 78) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*1)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (-0.875-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.775 + (((tickAnim - 14) / 6) * (-0.245-(-0.775)));
            zz = -0.875 + (((tickAnim - 14) / 6) * (-0.355-(-0.875)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            yy = -0.245 + (((tickAnim - 20) / 60) * (0-(-0.245)));
            zz = -0.355 + (((tickAnim - 20) / 60) * (0-(-0.355)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -13.75 + (((tickAnim - 14) / 4) * (3.33-(-13.75)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 3.33 + (((tickAnim - 18) / 2) * (15-(3.33)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 15 + (((tickAnim - 20) / 5) * (15-(15)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 25) / 3) * (13.55505-(15)));
            yy = 0 + (((tickAnim - 25) / 3) * (3.70876-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (4.62122-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 13.55505 + (((tickAnim - 28) / 5) * (13.55505-(13.55505)));
            yy = 3.70876 + (((tickAnim - 28) / 5) * (3.70876-(3.70876)));
            zz = 4.62122 + (((tickAnim - 28) / 5) * (4.62122-(4.62122)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 13.55505 + (((tickAnim - 33) / 3) * (11.63435-(13.55505)));
            yy = 3.70876 + (((tickAnim - 33) / 3) * (8.98623-(3.70876)));
            zz = 4.62122 + (((tickAnim - 33) / 3) * (-6.75891-(4.62122)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 11.63435 + (((tickAnim - 36) / 6) * (11.63435-(11.63435)));
            yy = 8.98623 + (((tickAnim - 36) / 6) * (8.98623-(8.98623)));
            zz = -6.75891 + (((tickAnim - 36) / 6) * (-6.75891-(-6.75891)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 11.63435 + (((tickAnim - 42) / 2) * (13.55505-(11.63435)));
            yy = 8.98623 + (((tickAnim - 42) / 2) * (3.70876-(8.98623)));
            zz = -6.75891 + (((tickAnim - 42) / 2) * (4.62122-(-6.75891)));
        }
        else if (tickAnim >= 44 && tickAnim < 52) {
            xx = 13.55505 + (((tickAnim - 44) / 8) * (13.55505-(13.55505)));
            yy = 3.70876 + (((tickAnim - 44) / 8) * (3.70876-(3.70876)));
            zz = 4.62122 + (((tickAnim - 44) / 8) * (4.62122-(4.62122)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = 13.55505 + (((tickAnim - 52) / 2) * (15-(13.55505)));
            yy = 3.70876 + (((tickAnim - 52) / 2) * (0-(3.70876)));
            zz = 4.62122 + (((tickAnim - 52) / 2) * (0-(4.62122)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = 15 + (((tickAnim - 54) / 9) * (15-(15)));
            yy = 0 + (((tickAnim - 54) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 9) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = 15 + (((tickAnim - 63) / 3) * (13.451-(15)));
            yy = 0 + (((tickAnim - 63) / 3) * (-6.54493-(0)));
            zz = 0 + (((tickAnim - 63) / 3) * (6.16977-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 75) {
            xx = 13.451 + (((tickAnim - 66) / 9) * (13.451-(13.451)));
            yy = -6.54493 + (((tickAnim - 66) / 9) * (-6.54493-(-6.54493)));
            zz = 6.16977 + (((tickAnim - 66) / 9) * (6.16977-(6.16977)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 13.451 + (((tickAnim - 75) / 3) * (15-(13.451)));
            yy = -6.54493 + (((tickAnim - 75) / 3) * (0-(-6.54493)));
            zz = 6.16977 + (((tickAnim - 75) / 3) * (0-(6.16977)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 15 + (((tickAnim - 78) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.45 + (((tickAnim - 14) / 6) * (-0.05-(-0.45)));
            zz = 0.225 + (((tickAnim - 14) / 6) * (0.22-(0.225)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            yy = -0.05 + (((tickAnim - 20) / 60) * (0-(-0.05)));
            zz = 0.22 + (((tickAnim - 20) / 60) * (0-(0.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 0) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 12) / 2) * (-18.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -18.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 14) / 6) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-18.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 20) / 5) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 25) / 3) * (-2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 0 + (((tickAnim - 25) / 3) * (7.46527-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0.72294-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 28) / 5) * (-2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 7.46527 + (((tickAnim - 28) / 5) * (7.46527-(7.46527)));
            zz = 0.72294 + (((tickAnim - 28) / 5) * (0.72294-(0.72294)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 33) / 3) * (-2.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 7.46527 + (((tickAnim - 33) / 3) * (12.64258-(7.46527)));
            zz = 0.72294 + (((tickAnim - 33) / 3) * (-1.41535-(0.72294)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = -2.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 36) / 6) * (-2.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 12.64258 + (((tickAnim - 36) / 6) * (12.64258-(12.64258)));
            zz = -1.41535 + (((tickAnim - 36) / 6) * (-1.41535-(-1.41535)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = -2.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 42) / 2) * (-2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 12.64258 + (((tickAnim - 42) / 2) * (7.46527-(12.64258)));
            zz = -1.41535 + (((tickAnim - 42) / 2) * (0.72294-(-1.41535)));
        }
        else if (tickAnim >= 44 && tickAnim < 52) {
            xx = -2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 44) / 8) * (-2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 7.46527 + (((tickAnim - 44) / 8) * (7.46527-(7.46527)));
            zz = 0.72294 + (((tickAnim - 44) / 8) * (0.72294-(0.72294)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = -2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 52) / 2) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.4528+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 7.46527 + (((tickAnim - 52) / 2) * (0-(7.46527)));
            zz = 0.72294 + (((tickAnim - 52) / 2) * (0-(0.72294)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 54) / 9) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 0 + (((tickAnim - 54) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 9) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 63) / 3) * (-2.4885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 0 + (((tickAnim - 63) / 3) * (-4.78849-(0)));
            zz = 0 + (((tickAnim - 63) / 3) * (-2.8851-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 75) {
            xx = -2.4885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 66) / 9) * (-2.4885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.4885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = -4.78849 + (((tickAnim - 66) / 9) * (-4.78849-(-4.78849)));
            zz = -2.8851 + (((tickAnim - 66) / 9) * (-2.8851-(-2.8851)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -2.4885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 75) / 3) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.4885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = -4.78849 + (((tickAnim - 75) / 3) * (0-(-4.78849)));
            zz = -2.8851 + (((tickAnim - 75) / 3) * (0-(-2.8851)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1 + (((tickAnim - 78) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-1)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (15-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 15 + (((tickAnim - 20) / 5) * (15-(15)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 25) / 3) * (15-(15)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 15 + (((tickAnim - 28) / 5) * (15-(15)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 15 + (((tickAnim - 33) / 3) * (15-(15)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 15 + (((tickAnim - 36) / 6) * (15-(15)));
            yy = 0 + (((tickAnim - 36) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 6) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 15 + (((tickAnim - 42) / 2) * (15-(15)));
            yy = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 52) {
            xx = 15 + (((tickAnim - 44) / 8) * (15-(15)));
            yy = 0 + (((tickAnim - 44) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 8) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = 15 + (((tickAnim - 52) / 2) * (15-(15)));
            yy = 0 + (((tickAnim - 52) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 2) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = 15 + (((tickAnim - 54) / 9) * (15-(15)));
            yy = 0 + (((tickAnim - 54) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 9) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = 15 + (((tickAnim - 63) / 3) * (15-(15)));
            yy = 0 + (((tickAnim - 63) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 3) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 75) {
            xx = 15 + (((tickAnim - 66) / 9) * (15-(15)));
            yy = 0 + (((tickAnim - 66) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 9) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 15 + (((tickAnim - 75) / 3) * (15-(15)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 15 + (((tickAnim - 78) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 74) {
            xx = 17.5 + (((tickAnim - 15) / 59) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 15) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 59) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 81) {
            xx = 17.5 + (((tickAnim - 74) / 7) * (-1.67-(17.5)));
            yy = 0 + (((tickAnim - 74) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 7) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 85) {
            xx = -1.67 + (((tickAnim - 81) / 4) * (0-(-1.67)));
            yy = 0 + (((tickAnim - 81) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-20-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 74) {
            xx = -20 + (((tickAnim - 15) / 59) * (-20-(-20)));
            yy = 0 + (((tickAnim - 15) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 59) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 81) {
            xx = -20 + (((tickAnim - 74) / 7) * (-9.17-(-20)));
            yy = 0 + (((tickAnim - 74) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 7) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 85) {
            xx = -9.17 + (((tickAnim - 81) / 4) * (0-(-9.17)));
            yy = 0 + (((tickAnim - 81) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 74) {
            xx = 17.5 + (((tickAnim - 15) / 59) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 15) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 59) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 17.5 + (((tickAnim - 74) / 11) * (0-(17.5)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1.25 + (((tickAnim - 13) / 2) * (7.5-(-1.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 74) {
            xx = 7.5 + (((tickAnim - 15) / 59) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 15) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 59) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 7.5 + (((tickAnim - 74) / 11) * (0-(7.5)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(HandsR, HandsR.rotateAngleX + (float) Math.toRadians(0), HandsR.rotateAngleY + (float) Math.toRadians(0), HandsR.rotateAngleZ + (float) Math.toRadians(-5));
        this.HandsR.rotationPointX = this.HandsR.rotationPointX + (float)(0.35);
        this.HandsR.rotationPointY = this.HandsR.rotationPointY - (float)(0);
        this.HandsR.rotationPointZ = this.HandsR.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1 + (((tickAnim - 0) / 12) * (-22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1-(-22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2) + (((tickAnim - 0) / 12) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3) + (((tickAnim - 0) / 12) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1 + (((tickAnim - 12) / 6) * (23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1-(-22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2) + (((tickAnim - 12) / 6) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3) + (((tickAnim - 12) / 6) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1 + (((tickAnim - 18) / 37) * (23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1-(23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2) + (((tickAnim - 18) / 37) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3) + (((tickAnim - 18) / 37) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1 + (((tickAnim - 55) / 13) * (9.17014-(23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2) + (((tickAnim - 55) / 13) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3) + (((tickAnim - 55) / 13) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3)));
        }
        else if (tickAnim >= 68 && tickAnim < 83) {
            xx = 9.17014 + (((tickAnim - 68) / 15) * (-22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1-(9.17014)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2) + (((tickAnim - 68) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2)));
            zz = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3) + (((tickAnim - 68) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3 + (((tickAnim - 0) / 12) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5) + (((tickAnim - 0) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3) + (((tickAnim - 0) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3 + (((tickAnim - 12) / 6) * (16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5) + (((tickAnim - 12) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3) + (((tickAnim - 12) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3 + (((tickAnim - 18) / 37) * (16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3-(16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5) + (((tickAnim - 18) / 37) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3) + (((tickAnim - 18) / 37) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3 + (((tickAnim - 55) / 13) * (21.63136-(16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5) + (((tickAnim - 55) / 13) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3) + (((tickAnim - 55) / 13) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else if (tickAnim >= 68 && tickAnim < 79) {
            xx = 21.63136 + (((tickAnim - 68) / 11) * (-5.70652-(21.63136)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5) + (((tickAnim - 68) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3) + (((tickAnim - 68) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = -5.70652 + (((tickAnim - 79) / 4) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3-(-5.70652)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5) + (((tickAnim - 79) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3) + (((tickAnim - 79) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10 + (((tickAnim - 0) / 12) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5) + (((tickAnim - 0) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5)));
            zz = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3) + (((tickAnim - 0) / 12) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10 + (((tickAnim - 12) / 6) * (21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10)));
            yy = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5) + (((tickAnim - 12) / 6) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5)));
            zz = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3) + (((tickAnim - 12) / 6) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10 + (((tickAnim - 18) / 37) * (21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10-(21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5) + (((tickAnim - 18) / 37) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3) + (((tickAnim - 18) / 37) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10 + (((tickAnim - 55) / 13) * (30.4993-(21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5) + (((tickAnim - 55) / 13) * (-0.91875-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3) + (((tickAnim - 55) / 13) * (0.55125-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3))));
        }
        else if (tickAnim >= 68 && tickAnim < 79) {
            xx = 30.4993 + (((tickAnim - 68) / 11) * (-8.85505-(30.4993)));
            yy = -0.91875 + (((tickAnim - 68) / 11) * (1.8312-(-0.91875)));
            zz = 0.55125 + (((tickAnim - 68) / 11) * (-1.09872-(0.55125)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = -8.85505 + (((tickAnim - 79) / 4) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10-(-8.85505)));
            yy = 1.8312 + (((tickAnim - 79) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5))-(1.8312));
            zz = -1.09872 + (((tickAnim - 79) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3))-(-1.09872));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-60))*-1), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.125-60))*-1));

    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 5) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 10) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 10) / 25) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 35) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 35) / 5) * (0-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 40) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.feathers2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 5) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 10) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 10) / 25) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 35) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 35) / 5) * (0-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 40) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.feathers.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 5) * (5-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 35) * (5-(5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 40) / 5) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandsL, HandsL.rotateAngleX + (float) Math.toRadians(xx), HandsL.rotateAngleY + (float) Math.toRadians(yy), HandsL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.35 + (((tickAnim - 0) / 5) * (-0.35-(-0.35)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = -0.35 + (((tickAnim - 5) / 35) * (-0.35-(-0.35)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -0.35 + (((tickAnim - 40) / 5) * (-0.35-(-0.35)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandsL.rotationPointX = this.HandsL.rotationPointX + (float)(xx);
        this.HandsL.rotationPointY = this.HandsL.rotationPointY - (float)(yy);
        this.HandsL.rotationPointZ = this.HandsL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 5) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 10) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 10) / 25) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 35) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 35) / 5) * (0-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 40) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.feathers3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 5) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 10) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 10) / 25) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 35) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 35) / 5) * (0-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 40) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.feathers4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 10) / 25) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 10) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5 + (((tickAnim - 10) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 35) / 5) * (0-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 35) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5 + (((tickAnim - 35) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 25 + (((tickAnim - 10) / 25) * (25-(25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 25 + (((tickAnim - 35) / 5) * (0-(25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 5) / 5) * (25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 25 + (((tickAnim - 10) / 25) * (25-(25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 25 + (((tickAnim - 35) / 5) * (0-(25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(xx);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(yy);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2))-(0));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5 + (((tickAnim - 10) / 25) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2) + (((tickAnim - 10) / 25) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5 + (((tickAnim - 35) / 5) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2) + (((tickAnim - 35) / 5) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2))));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
            zz = -5 + (((tickAnim - 0) / 5) * (-5-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 35) * (-5-(-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -5 + (((tickAnim - 40) / 5) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandsR, HandsR.rotateAngleX + (float) Math.toRadians(xx), HandsR.rotateAngleY + (float) Math.toRadians(yy), HandsR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.35 + (((tickAnim - 0) / 5) * (0.35-(0.35)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0.35 + (((tickAnim - 5) / 35) * (0.35-(0.35)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0.35 + (((tickAnim - 40) / 5) * (0.35-(0.35)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandsR.rotationPointX = this.HandsR.rotationPointX + (float)(xx);
        this.HandsR.rotationPointY = this.HandsR.rotationPointY - (float)(yy);
        this.HandsR.rotationPointZ = this.HandsR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -22.5 + (((tickAnim - 10) / 25) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 35) / 5) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 10) / 25) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 35) / 5) * (0-(2.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-20-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -20 + (((tickAnim - 10) / 25) * (-20-(-20)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 35) / 5) * (0-(-20)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (32.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 32.5 + (((tickAnim - 10) / 25) * (32.5-(32.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 32.5 + (((tickAnim - 35) / 5) * (0-(32.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Archaeopteryx, Archaeopteryx.rotateAngleX + (float) Math.toRadians(xx), Archaeopteryx.rotateAngleY + (float) Math.toRadians(yy), Archaeopteryx.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.165-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (4.65-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.165 + (((tickAnim - 8) / 2) * (-2.525-(0.165)));
            zz = 4.65 + (((tickAnim - 8) / 2) * (8-(4.65)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -2.525 + (((tickAnim - 10) / 25) * (-2.525-(-2.525)));
            zz = 8 + (((tickAnim - 10) / 25) * (8-(8)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -2.525 + (((tickAnim - 35) / 5) * (0-(-2.525)));
            zz = 8 + (((tickAnim - 35) / 5) * (0-(8)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Archaeopteryx.rotationPointX = this.Archaeopteryx.rotationPointX + (float)(xx);
        this.Archaeopteryx.rotationPointY = this.Archaeopteryx.rotationPointY - (float)(yy);
        this.Archaeopteryx.rotationPointZ = this.Archaeopteryx.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-48.08619-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (17.07228-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-3.90399-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -48.08619 + (((tickAnim - 10) / 25) * (-48.08619-(-48.08619)));
            yy = 17.07228 + (((tickAnim - 10) / 25) * (17.07228-(17.07228)));
            zz = -3.90399 + (((tickAnim - 10) / 25) * (-3.90399-(-3.90399)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -48.08619 + (((tickAnim - 35) / 5) * (0-(-48.08619)));
            yy = 17.07228 + (((tickAnim - 35) / 5) * (0-(17.07228)));
            zz = -3.90399 + (((tickAnim - 35) / 5) * (0-(-3.90399)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-1-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 25) * (-1-(-1)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 35) / 5) * (0-(-1)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegR.rotationPointX = this.UpperLegR.rotationPointX + (float)(xx);
        this.UpperLegR.rotationPointY = this.UpperLegR.rotationPointY - (float)(yy);
        this.UpperLegR.rotationPointZ = this.UpperLegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-50-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -50 + (((tickAnim - 10) / 25) * (-50-(-50)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -50 + (((tickAnim - 35) / 5) * (0-(-50)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerLegR.rotationPointX = this.LowerLegR.rotationPointX + (float)(xx);
        this.LowerLegR.rotationPointY = this.LowerLegR.rotationPointY - (float)(yy);
        this.LowerLegR.rotationPointZ = this.LowerLegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 10) / 25) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 35) / 5) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootR.rotationPointX = this.FootR.rotationPointX + (float)(xx);
        this.FootR.rotationPointY = this.FootR.rotationPointY - (float)(yy);
        this.FootR.rotationPointZ = this.FootR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (77.5945-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-2.49762-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-4.33287-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 77.5945 + (((tickAnim - 10) / 25) * (77.5945-(77.5945)));
            yy = -2.49762 + (((tickAnim - 10) / 25) * (-2.49762-(-2.49762)));
            zz = -4.33287 + (((tickAnim - 10) / 25) * (-4.33287-(-4.33287)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 77.5945 + (((tickAnim - 35) / 5) * (0-(77.5945)));
            yy = -2.49762 + (((tickAnim - 35) / 5) * (0-(-2.49762)));
            zz = -4.33287 + (((tickAnim - 35) / 5) * (0-(-4.33287)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ToesR.rotationPointX = this.ToesR.rotationPointX + (float)(xx);
        this.ToesR.rotationPointY = this.ToesR.rotationPointY - (float)(yy);
        this.ToesR.rotationPointZ = this.ToesR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-48.08619-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-17.0723-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-3.90399-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -48.08619 + (((tickAnim - 10) / 25) * (-48.08619-(-48.08619)));
            yy = -17.0723 + (((tickAnim - 10) / 25) * (-17.0723-(-17.0723)));
            zz = -3.90399 + (((tickAnim - 10) / 25) * (-3.90399-(-3.90399)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -48.08619 + (((tickAnim - 35) / 5) * (0-(-48.08619)));
            yy = -17.0723 + (((tickAnim - 35) / 5) * (0-(-17.0723)));
            zz = -3.90399 + (((tickAnim - 35) / 5) * (0-(-3.90399)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-1-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 25) * (-1-(-1)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 35) / 5) * (0-(-1)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegL.rotationPointX = this.UpperLegL.rotationPointX + (float)(xx);
        this.UpperLegL.rotationPointY = this.UpperLegL.rotationPointY - (float)(yy);
        this.UpperLegL.rotationPointZ = this.UpperLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-50-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -50 + (((tickAnim - 10) / 25) * (-50-(-50)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -50 + (((tickAnim - 35) / 5) * (0-(-50)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerLegL.rotationPointX = this.LowerLegL.rotationPointX + (float)(xx);
        this.LowerLegL.rotationPointY = this.LowerLegL.rotationPointY - (float)(yy);
        this.LowerLegL.rotationPointZ = this.LowerLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 10) / 25) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 35) / 5) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (77.5945-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (2.4976-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (4.3329-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 77.5945 + (((tickAnim - 10) / 25) * (77.5945-(77.5945)));
            yy = 2.4976 + (((tickAnim - 10) / 25) * (2.4976-(2.4976)));
            zz = 4.3329 + (((tickAnim - 10) / 25) * (4.3329-(4.3329)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 77.5945 + (((tickAnim - 35) / 5) * (0-(77.5945)));
            yy = 2.4976 + (((tickAnim - 35) / 5) * (0-(2.4976)));
            zz = 4.3329 + (((tickAnim - 35) / 5) * (0-(4.3329)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ToesL.rotationPointX = this.ToesL.rotationPointX + (float)(xx);
        this.ToesL.rotationPointY = this.ToesL.rotationPointY - (float)(yy);
        this.ToesL.rotationPointZ = this.ToesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 5) / 5) * (-58.7974+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (1.9296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (2.0435+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(0)));
        }


        if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(xx);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(yy);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (141.0156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (36.0604+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-56.7574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(0)));
        }


        if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerArmL.rotationPointX = this.LowerArmL.rotationPointX + (float)(xx);
        this.LowerArmL.rotationPointY = this.LowerArmL.rotationPointY - (float)(yy);
        this.LowerArmL.rotationPointZ = this.LowerArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-87.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -87.5 + (((tickAnim - 10) / 25) * (-87.5-(-87.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -87.5 + (((tickAnim - 35) / 5) * (0-(-87.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL.rotationPointX = this.HandL.rotationPointX + (float)(xx);
        this.HandL.rotationPointY = this.HandL.rotationPointY - (float)(yy);
        this.HandL.rotationPointZ = this.HandL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-58.7974+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-1.9296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (2.0435+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(0)));
        }


        if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmR.rotationPointX = this.UpperArmR.rotationPointX + (float)(xx);
        this.UpperArmR.rotationPointY = this.UpperArmR.rotationPointY - (float)(yy);
        this.UpperArmR.rotationPointZ = this.UpperArmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (141.0156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-36.0604+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (56.7574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 141.0156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 10) / 25) * (141.0156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(141.0156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = -36.0604+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 10) / 25) * (-36.0604+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-36.0604+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 56.7574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 10) / 25) * (56.7574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(56.7574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 141.0156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 35) / 5) * (0-(141.0156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = -36.0604+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 35) / 5) * (0-(-36.0604+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 56.7574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 35) / 5) * (0-(56.7574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerArmR.rotationPointX = this.LowerArmR.rotationPointX + (float)(xx);
        this.LowerArmR.rotationPointY = this.LowerArmR.rotationPointY - (float)(yy);
        this.LowerArmR.rotationPointZ = this.LowerArmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-87.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -87.5 + (((tickAnim - 10) / 25) * (-87.5-(-87.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -87.5 + (((tickAnim - 35) / 5) * (0-(-87.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandR.rotationPointX = this.HandR.rotationPointX + (float)(xx);
        this.HandR.rotationPointY = this.HandR.rotationPointY - (float)(yy);
        this.HandR.rotationPointZ = this.HandR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0 + (((tickAnim - 5) / 5) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5 + (((tickAnim - 10) / 25) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5 + (((tickAnim - 35) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0 + (((tickAnim - 40) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.feathers.setScale((float)1,(float)0,(float)0);


        this.feathers3.setScale((float)1,(float)0,(float)0);


        this.feathers4.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0 + (((tickAnim - 0) / 5) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5 + (((tickAnim - 5) / 13) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5)));
            yy = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5 + (((tickAnim - 18) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*3600/3))*0.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 8) / 2) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -22.5 + (((tickAnim - 10) / 3) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -22.5 + (((tickAnim - 13) / 4) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 8) / 2) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 10) / 3) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.75 + (((tickAnim - 13) / 4) * (-0.02-(0.75)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.02 + (((tickAnim - 17) / 3) * (0-(-0.02)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 5) / 3) * (0-(-15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 17) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.15-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.6 + (((tickAnim - 5) / 3) * (0-(-0.6)));
            zz = 0.15 + (((tickAnim - 5) / 3) * (0-(0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.5 + (((tickAnim - 5) / 3) * (-7.5-(10.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.5 + (((tickAnim - 8) / 2) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 10) / 3) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -7.5 + (((tickAnim - 13) / 4) * (-10.83-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -10.83 + (((tickAnim - 17) / 3) * (0-(-10.83)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.5 + (((tickAnim - 8) / 2) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 10) / 3) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 13) / 7) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;
        int animCycle = 24;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Archaeopteryx, Archaeopteryx.rotateAngleX + (float) Math.toRadians(-65) + (float) Math.toRadians(90), Archaeopteryx.rotateAngleY + (float) Math.toRadians(0), Archaeopteryx.rotateAngleZ + (float) Math.toRadians(0));
        this.Archaeopteryx.rotationPointX = this.Archaeopteryx.rotationPointX + (float)(0);
        this.Archaeopteryx.rotationPointY = this.Archaeopteryx.rotationPointY - (float)(0);
        this.Archaeopteryx.rotationPointZ = this.Archaeopteryx.rotationPointZ + (float)(0.6);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -13 + (((tickAnim - 0) / 3) * (2.71429-(-13)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.71429 + (((tickAnim - 3) / 3) * (28-(2.71429)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 28 + (((tickAnim - 6) / 1) * (17-(28)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 17 + (((tickAnim - 7) / 1) * (-6-(17)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -6 + (((tickAnim - 8) / 1) * (-33.5-(-6)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -33.5 + (((tickAnim - 9) / 2) * (-46-(-33.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = -46 + (((tickAnim - 11) / 13) * (-13-(-46)));
            yy = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 0) / 3) * (4.71429-(15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 4.71429 + (((tickAnim - 3) / 3) * (-23-(4.71429)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -23 + (((tickAnim - 6) / 1) * (8.3672-(-23)));
            yy = 0 + (((tickAnim - 6) / 1) * (-0.29877-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-0.98782-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 8.3672 + (((tickAnim - 7) / 1) * (30-(8.3672)));
            yy = -0.29877 + (((tickAnim - 7) / 1) * (0-(-0.29877)));
            zz = -0.98782 + (((tickAnim - 7) / 1) * (0-(-0.98782)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 30 + (((tickAnim - 8) / 1) * (32.5-(30)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 32.5 + (((tickAnim - 9) / 2) * (33-(32.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 33 + (((tickAnim - 11) / 6) * (29.125-(33)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 29.125 + (((tickAnim - 17) / 7) * (15-(29.125)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14 + (((tickAnim - 0) / 3) * (5.28571-(14)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 5.28571 + (((tickAnim - 3) / 3) * (3-(5.28571)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 3 + (((tickAnim - 6) / 1) * (9.33008-(3)));
            yy = 0 + (((tickAnim - 6) / 1) * (0.33165-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-0.07776-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 9.33008 + (((tickAnim - 7) / 1) * (-22.33333-(9.33008)));
            yy = 0.33165 + (((tickAnim - 7) / 1) * (0-(0.33165)));
            zz = -0.07776 + (((tickAnim - 7) / 1) * (0-(-0.07776)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -22.33333 + (((tickAnim - 8) / 1) * (-8.16667-(-22.33333)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -8.16667 + (((tickAnim - 9) / 2) * (8-(-8.16667)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 8 + (((tickAnim - 11) / 6) * (5.625-(8)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 5.625 + (((tickAnim - 17) / 7) * (14-(5.625)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -38 + (((tickAnim - 0) / 3) * (-38.71429-(-38)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -38.71429 + (((tickAnim - 3) / 3) * (-32-(-38.71429)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -32 + (((tickAnim - 6) / 1) * (-3.83709-(-32)));
            yy = 0 + (((tickAnim - 6) / 1) * (0.38517-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-0.08207-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -3.83709 + (((tickAnim - 7) / 1) * (-19.66667-(-3.83709)));
            yy = 0.38517 + (((tickAnim - 7) / 1) * (0-(0.38517)));
            zz = -0.08207 + (((tickAnim - 7) / 1) * (0-(-0.08207)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -19.66667 + (((tickAnim - 8) / 1) * (-26.33333-(-19.66667)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -26.33333 + (((tickAnim - 9) / 2) * (-16-(-26.33333)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -16 + (((tickAnim - 11) / 6) * (-30.625-(-16)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -30.625 + (((tickAnim - 17) / 7) * (-38-(-30.625)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -26 + (((tickAnim - 0) / 7) * (-18-(-26)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -18 + (((tickAnim - 7) / 11) * (24-(-18)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 24 + (((tickAnim - 18) / 0) * (15.5-(24)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 18) / 2) * (31.5-(15.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 31.5 + (((tickAnim - 20) / 2) * (-10.5-(31.5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -10.5 + (((tickAnim - 22) / 2) * (-26-(-10.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 24 + (((tickAnim - 0) / 7) * (22.82353-(24)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 22.82353 + (((tickAnim - 7) / 4) * (15.58371-(22.82353)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 15.58371 + (((tickAnim - 11) / 7) * (-22-(15.58371)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -22 + (((tickAnim - 18) / 0) * (-1.91667-(-22)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.91667 + (((tickAnim - 18) / 2) * (20.25-(-1.91667)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 20.25 + (((tickAnim - 20) / 2) * (44.75-(20.25)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 44.75 + (((tickAnim - 22) / 2) * (24-(44.75)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -25 + (((tickAnim - 0) / 7) * (-10.58824-(-25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -10.58824 + (((tickAnim - 7) / 4) * (-9.0543-(-10.58824)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -9.0543 + (((tickAnim - 11) / 7) * (9-(-9.0543)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 9 + (((tickAnim - 18) / 0) * (8.70833-(9)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 8.70833 + (((tickAnim - 18) / 2) * (-30.875-(8.70833)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -30.875 + (((tickAnim - 20) / 2) * (-25.525-(-30.875)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -25.525 + (((tickAnim - 22) / 2) * (-25-(-25.525)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -4 + (((tickAnim - 0) / 7) * (-22.95238-(-4)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -22.95238 + (((tickAnim - 7) / 11) * (-38-(-22.95238)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -38 + (((tickAnim - 18) / 0) * (-6.66667-(-38)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -6.66667 + (((tickAnim - 18) / 2) * (35-(-6.66667)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 35 + (((tickAnim - 20) / 2) * (-10.6-(35)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -10.6 + (((tickAnim - 22) / 2) * (-4-(-10.6)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.2083+50))*-4), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.2083))*-2), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.2083-50))*-1), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-1.39667-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (8.23445-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-10.60389-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -1.39667 + (((tickAnim - 4) / 6) * (0-(-1.39667)));
            yy = 8.23445 + (((tickAnim - 4) / 6) * (0-(8.23445)));
            zz = -10.60389 + (((tickAnim - 4) / 6) * (0-(-10.60389)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (-1.07428-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (-6.45028-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (9.71738-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -1.07428 + (((tickAnim - 18) / 6) * (0-(-1.07428)));
            yy = -6.45028 + (((tickAnim - 18) / 6) * (0-(-6.45028)));
            zz = 9.71738 + (((tickAnim - 18) / 6) * (0-(9.71738)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -53.81616 + (((tickAnim - 0) / 3) * (-53.86363-(-53.81616)));
            yy = -6.15195 + (((tickAnim - 0) / 3) * (-22.95998-(-6.15195)));
            zz = 24.29332 + (((tickAnim - 0) / 3) * (8.8852-(24.29332)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -53.86363 + (((tickAnim - 3) / 3) * (-97.78129-(-53.86363)));
            yy = -22.95998 + (((tickAnim - 3) / 3) * (15.40913-(-22.95998)));
            zz = 8.8852 + (((tickAnim - 3) / 3) * (-9.75044-(8.8852)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -97.78129 + (((tickAnim - 6) / 5) * (-79.14567-(-97.78129)));
            yy = 15.40913 + (((tickAnim - 6) / 5) * (10.37438-(15.40913)));
            zz = -9.75044 + (((tickAnim - 6) / 5) * (5.46851-(-9.75044)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -79.14567 + (((tickAnim - 11) / 2) * (-72.06082-(-79.14567)));
            yy = 10.37438 + (((tickAnim - 11) / 2) * (7.65068-(10.37438)));
            zz = 5.46851 + (((tickAnim - 11) / 2) * (10.89306-(5.46851)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -72.06082 + (((tickAnim - 13) / 3) * (-68.692-(-72.06082)));
            yy = 7.65068 + (((tickAnim - 13) / 3) * (4.74316-(7.65068)));
            zz = 10.89306 + (((tickAnim - 13) / 3) * (7.09133-(10.89306)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = -68.692 + (((tickAnim - 16) / 8) * (-53.81616-(-68.692)));
            yy = 4.74316 + (((tickAnim - 16) / 8) * (-6.15195-(4.74316)));
            zz = 7.09133 + (((tickAnim - 16) / 8) * (24.29332-(7.09133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 96.36574 + (((tickAnim - 0) / 3) * (74.09681-(96.36574)));
            yy = 37.46178 + (((tickAnim - 0) / 3) * (44.27629-(37.46178)));
            zz = -37.6789 + (((tickAnim - 0) / 3) * (-62.01635-(-37.6789)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 74.09681 + (((tickAnim - 3) / 3) * (120.93262-(74.09681)));
            yy = 44.27629 + (((tickAnim - 3) / 3) * (5.62706-(44.27629)));
            zz = -62.01635 + (((tickAnim - 3) / 3) * (-68.28154-(-62.01635)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 120.93262 + (((tickAnim - 6) / 5) * (107.15814-(120.93262)));
            yy = 5.62706 + (((tickAnim - 6) / 5) * (16.62795-(5.62706)));
            zz = -68.28154 + (((tickAnim - 6) / 5) * (-56.44425-(-68.28154)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 107.15814 + (((tickAnim - 11) / 2) * (102.02724-(107.15814)));
            yy = 16.62795 + (((tickAnim - 11) / 2) * (27.51326-(16.62795)));
            zz = -56.44425 + (((tickAnim - 11) / 2) * (-42.7332-(-56.44425)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 102.02724 + (((tickAnim - 13) / 3) * (98.9426-(102.02724)));
            yy = 27.51326 + (((tickAnim - 13) / 3) * (32.84768-(27.51326)));
            zz = -42.7332 + (((tickAnim - 13) / 3) * (-39.99034-(-42.7332)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 98.9426 + (((tickAnim - 16) / 8) * (96.36574-(98.9426)));
            yy = 32.84768 + (((tickAnim - 16) / 8) * (37.46178-(32.84768)));
            zz = -39.99034 + (((tickAnim - 16) / 8) * (-37.6789-(-39.99034)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(feathers, feathers.rotateAngleX + (float) Math.toRadians(35), feathers.rotateAngleY + (float) Math.toRadians(0), feathers.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -69.03766 + (((tickAnim - 0) / 3) * (-73.06044-(-69.03766)));
            yy = 25.09413 + (((tickAnim - 0) / 3) * (10.85029-(25.09413)));
            zz = -62.9568 + (((tickAnim - 0) / 3) * (-15.97927-(-62.9568)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -73.06044 + (((tickAnim - 3) / 3) * (-81.51809-(-73.06044)));
            yy = 10.85029 + (((tickAnim - 3) / 3) * (22.53897-(10.85029)));
            zz = -15.97927 + (((tickAnim - 3) / 3) * (-58.70562-(-15.97927)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -81.51809 + (((tickAnim - 6) / 5) * (-84.54325-(-81.51809)));
            yy = 22.53897 + (((tickAnim - 6) / 5) * (25.98926-(22.53897)));
            zz = -58.70562 + (((tickAnim - 6) / 5) * (-60.28007-(-58.70562)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -84.54325 + (((tickAnim - 11) / 2) * (-79.65445-(-84.54325)));
            yy = 25.98926 + (((tickAnim - 11) / 2) * (32.46254-(25.98926)));
            zz = -60.28007 + (((tickAnim - 11) / 2) * (-68.05993-(-60.28007)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -79.65445 + (((tickAnim - 13) / 3) * (-75.60976-(-79.65445)));
            yy = 32.46254 + (((tickAnim - 13) / 3) * (25.40581-(32.46254)));
            zz = -68.05993 + (((tickAnim - 13) / 3) * (-64.07222-(-68.05993)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = -75.60976 + (((tickAnim - 16) / 8) * (-69.03766-(-75.60976)));
            yy = 25.40581 + (((tickAnim - 16) / 8) * (25.09413-(25.40581)));
            zz = -64.07222 + (((tickAnim - 16) / 8) * (-62.9568-(-64.07222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-11.90062-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-13.68527-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-26.24436-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -11.90062 + (((tickAnim - 3) / 3) * (-9.2137-(-11.90062)));
            yy = -13.68527 + (((tickAnim - 3) / 3) * (-15.00573-(-13.68527)));
            zz = -26.24436 + (((tickAnim - 3) / 3) * (-38.43232-(-26.24436)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -9.2137 + (((tickAnim - 6) / 5) * (-19.43274-(-9.2137)));
            yy = -15.00573 + (((tickAnim - 6) / 5) * (-2.06327-(-15.00573)));
            zz = -38.43232 + (((tickAnim - 6) / 5) * (5.76801-(-38.43232)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -19.43274 + (((tickAnim - 11) / 2) * (-10.67686-(-19.43274)));
            yy = -2.06327 + (((tickAnim - 11) / 2) * (-0.76632-(-2.06327)));
            zz = 5.76801 + (((tickAnim - 11) / 2) * (7.56915-(5.76801)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -10.67686 + (((tickAnim - 13) / 3) * (-10.52082-(-10.67686)));
            yy = -0.76632 + (((tickAnim - 13) / 3) * (-1.15473-(-0.76632)));
            zz = 7.56915 + (((tickAnim - 13) / 3) * (6.66507-(7.56915)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.52082 + (((tickAnim - 16) / 3) * (-9.80253-(-10.52082)));
            yy = -1.15473 + (((tickAnim - 16) / 3) * (-3.76534-(-1.15473)));
            zz = 6.66507 + (((tickAnim - 16) / 3) * (2.46139-(6.66507)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -9.80253 + (((tickAnim - 19) / 5) * (0-(-9.80253)));
            yy = -3.76534 + (((tickAnim - 19) / 5) * (0-(-3.76534)));
            zz = 2.46139 + (((tickAnim - 19) / 5) * (0-(2.46139)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandsL, HandsL.rotateAngleX + (float) Math.toRadians(xx), HandsL.rotateAngleY + (float) Math.toRadians(yy), HandsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -97.78129 + (((tickAnim - 0) / 4) * (-78.64868-(-97.78129)));
            yy = -15.40913 + (((tickAnim - 0) / 4) * (-9.29768-(-15.40913)));
            zz = 9.75044 + (((tickAnim - 0) / 4) * (-1.31222-(9.75044)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -78.64868 + (((tickAnim - 4) / 4) * (-72.51706-(-78.64868)));
            yy = -9.29768 + (((tickAnim - 4) / 4) * (-6.83507-(-9.29768)));
            zz = -1.31222 + (((tickAnim - 4) / 4) * (-10.70134-(-1.31222)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -72.51706 + (((tickAnim - 8) / 2) * (-57.22753-(-72.51706)));
            yy = -6.83507 + (((tickAnim - 8) / 2) * (3.16251-(-6.83507)));
            zz = -10.70134 + (((tickAnim - 8) / 2) * (-21.98166-(-10.70134)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -57.22753 + (((tickAnim - 10) / 3) * (-53.81616-(-57.22753)));
            yy = 3.16251 + (((tickAnim - 10) / 3) * (6.15195-(3.16251)));
            zz = -21.98166 + (((tickAnim - 10) / 3) * (-24.29332-(-21.98166)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -53.81616 + (((tickAnim - 13) / 2) * (-53.86363-(-53.81616)));
            yy = 6.15195 + (((tickAnim - 13) / 2) * (22.95998-(6.15195)));
            zz = -24.29332 + (((tickAnim - 13) / 2) * (-8.8852-(-24.29332)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -53.86363 + (((tickAnim - 15) / 3) * (-110.21456-(-53.86363)));
            yy = 22.95998 + (((tickAnim - 15) / 3) * (-6.042-(22.95998)));
            zz = -8.8852 + (((tickAnim - 15) / 3) * (20.30983-(-8.8852)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -110.21456 + (((tickAnim - 18) / 6) * (-97.78129-(-110.21456)));
            yy = -6.042 + (((tickAnim - 18) / 6) * (-15.40913-(-6.042)));
            zz = 20.30983 + (((tickAnim - 18) / 6) * (9.75044-(20.30983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(feathers3, feathers3.rotateAngleX + (float) Math.toRadians(-15.21222), feathers3.rotateAngleY + (float) Math.toRadians(13.40697), feathers3.rotateAngleZ + (float) Math.toRadians(4.0716));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 120.93262 + (((tickAnim - 0) / 4) * (113.52287-(120.93262)));
            yy = -5.62706 + (((tickAnim - 0) / 4) * (-34.79071-(-5.62706)));
            zz = 68.28154 + (((tickAnim - 0) / 4) * (52.73219-(68.28154)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 113.52287 + (((tickAnim - 4) / 4) * (107.15814-(113.52287)));
            yy = -34.79071 + (((tickAnim - 4) / 4) * (-16.62795-(-34.79071)));
            zz = 52.73219 + (((tickAnim - 4) / 4) * (56.44425-(52.73219)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 107.15814 + (((tickAnim - 8) / 2) * (102.96302-(107.15814)));
            yy = -16.62795 + (((tickAnim - 8) / 2) * (-26.0291-(-16.62795)));
            zz = 56.44425 + (((tickAnim - 8) / 2) * (43.58625-(56.44425)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 102.96302 + (((tickAnim - 10) / 3) * (96.36574-(102.96302)));
            yy = -26.0291 + (((tickAnim - 10) / 3) * (-37.46178-(-26.0291)));
            zz = 43.58625 + (((tickAnim - 10) / 3) * (37.6789-(43.58625)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 96.36574 + (((tickAnim - 13) / 2) * (74.09681-(96.36574)));
            yy = -37.46178 + (((tickAnim - 13) / 2) * (-44.27629-(-37.46178)));
            zz = 37.6789 + (((tickAnim - 13) / 2) * (62.01635-(37.6789)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 74.09681 + (((tickAnim - 15) / 3) * (121.18056-(74.09681)));
            yy = -44.27629 + (((tickAnim - 15) / 3) * (-0.31672-(-44.27629)));
            zz = 62.01635 + (((tickAnim - 15) / 3) * (62.37259-(62.01635)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 121.18056 + (((tickAnim - 18) / 6) * (120.93262-(121.18056)));
            yy = -0.31672 + (((tickAnim - 18) / 6) * (-5.62706-(-0.31672)));
            zz = 62.37259 + (((tickAnim - 18) / 6) * (68.28154-(62.37259)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -81.51809 + (((tickAnim - 0) / 4) * (-66.89022-(-81.51809)));
            yy = -22.53897 + (((tickAnim - 0) / 4) * (-11.91713-(-22.53897)));
            zz = 58.70562 + (((tickAnim - 0) / 4) * (51.96441-(58.70562)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -66.89022 + (((tickAnim - 4) / 4) * (-85.67279-(-66.89022)));
            yy = -11.91713 + (((tickAnim - 4) / 4) * (-29.71429-(-11.91713)));
            zz = 51.96441 + (((tickAnim - 4) / 4) * (61.80478-(51.96441)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -85.67279 + (((tickAnim - 8) / 2) * (-85.52828-(-85.67279)));
            yy = -29.71429 + (((tickAnim - 8) / 2) * (-23.33315-(-29.71429)));
            zz = 61.80478 + (((tickAnim - 8) / 2) * (64.78895-(61.80478)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -85.52828 + (((tickAnim - 10) / 3) * (-69.03766-(-85.52828)));
            yy = -23.33315 + (((tickAnim - 10) / 3) * (-25.09413-(-23.33315)));
            zz = 64.78895 + (((tickAnim - 10) / 3) * (62.9568-(64.78895)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -69.03766 + (((tickAnim - 13) / 2) * (-73.06044-(-69.03766)));
            yy = -25.09413 + (((tickAnim - 13) / 2) * (-10.85029-(-25.09413)));
            zz = 62.9568 + (((tickAnim - 13) / 2) * (15.97927-(62.9568)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -73.06044 + (((tickAnim - 15) / 3) * (-76.32075-(-73.06044)));
            yy = -10.85029 + (((tickAnim - 15) / 3) * (-23.28603-(-10.85029)));
            zz = 15.97927 + (((tickAnim - 15) / 3) * (42.71991-(15.97927)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -76.32075 + (((tickAnim - 18) / 6) * (-81.51809-(-76.32075)));
            yy = -23.28603 + (((tickAnim - 18) / 6) * (-22.53897-(-23.28603)));
            zz = 42.71991 + (((tickAnim - 18) / 6) * (58.70562-(42.71991)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(HandwingR, HandwingR.rotateAngleX + (float) Math.toRadians(0), HandwingR.rotateAngleY + (float) Math.toRadians(-7), HandwingR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.66773-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (4.81901-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-3.51341-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.66773 + (((tickAnim - 4) / 4) * (-0.68679-(0.66773)));
            yy = 4.81901 + (((tickAnim - 4) / 4) * (-0.83846-(4.81901)));
            zz = -3.51341 + (((tickAnim - 4) / 4) * (-6.84286-(-3.51341)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.68679 + (((tickAnim - 8) / 2) * (-4.63682-(-0.68679)));
            yy = -0.83846 + (((tickAnim - 8) / 2) * (0.34911-(-0.83846)));
            zz = -6.84286 + (((tickAnim - 8) / 2) * (-6.80437-(-6.84286)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -4.63682 + (((tickAnim - 10) / 3) * (-4.66161-(-4.63682)));
            yy = 0.34911 + (((tickAnim - 10) / 3) * (-0.46447-(0.34911)));
            zz = -6.80437 + (((tickAnim - 10) / 3) * (-6.22235-(-6.80437)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.66161 + (((tickAnim - 13) / 2) * (1.65282-(-4.66161)));
            yy = -0.46447 + (((tickAnim - 13) / 2) * (2.81527-(-0.46447)));
            zz = -6.22235 + (((tickAnim - 13) / 2) * (21.76684-(-6.22235)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1.65282 + (((tickAnim - 15) / 3) * (-4.74293-(1.65282)));
            yy = 2.81527 + (((tickAnim - 15) / 3) * (5.75295-(2.81527)));
            zz = 21.76684 + (((tickAnim - 15) / 3) * (44.67175-(21.76684)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -4.74293 + (((tickAnim - 18) / 3) * (-6.32547-(-4.74293)));
            yy = 5.75295 + (((tickAnim - 18) / 3) * (-1.91735-(5.75295)));
            zz = 44.67175 + (((tickAnim - 18) / 3) * (-8.7999-(44.67175)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -6.32547 + (((tickAnim - 21) / 3) * (0-(-6.32547)));
            yy = -1.91735 + (((tickAnim - 21) / 3) * (0-(-1.91735)));
            zz = -8.7999 + (((tickAnim - 21) / 3) * (0-(-8.7999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandsR, HandsR.rotateAngleX + (float) Math.toRadians(xx), HandsR.rotateAngleY + (float) Math.toRadians(yy), HandsR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.78494-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-10.85708-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (4.98427-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0.78494 + (((tickAnim - 4) / 6) * (0-(0.78494)));
            yy = -10.85708 + (((tickAnim - 4) / 6) * (0-(-10.85708)));
            zz = 4.98427 + (((tickAnim - 4) / 6) * (0-(4.98427)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0.75535-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (9.95016-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (-4.5693-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0.75535 + (((tickAnim - 18) / 6) * (0-(0.75535)));
            yy = 9.95016 + (((tickAnim - 18) / 6) * (0-(9.95016)));
            zz = -4.5693 + (((tickAnim - 18) / 6) * (0-(-4.5693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Archaeopteryx, Archaeopteryx.rotateAngleX + (float) Math.toRadians(0), Archaeopteryx.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*2), Archaeopteryx.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 10) * (0-(-1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-1-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -1 + (((tickAnim - 15) / 10) * (0-(-1)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (-1-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Archaeopteryx.rotationPointX = this.Archaeopteryx.rotationPointX + (float)(xx);
        this.Archaeopteryx.rotationPointY = this.Archaeopteryx.rotationPointY - (float)(yy);
        this.Archaeopteryx.rotationPointZ = this.Archaeopteryx.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.4129 + (((tickAnim - 0) / 5) * (-8.29091-(14.4129)));
            yy = 7.9123 + (((tickAnim - 0) / 5) * (7.9123-(7.9123)));
            zz = -6.0309 + (((tickAnim - 0) / 5) * (-2.0952-(-6.0309)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8.29091 + (((tickAnim - 5) / 5) * (-11.73368-(-8.29091)));
            yy = 7.9123 + (((tickAnim - 5) / 5) * (-1.429-(7.9123)));
            zz = -2.0952 + (((tickAnim - 5) / 5) * (-1.7753-(-2.0952)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -11.73368 + (((tickAnim - 10) / 5) * (-4.8883-(-11.73368)));
            yy = -1.429 + (((tickAnim - 10) / 5) * (-7.9123-(-1.429)));
            zz = -1.7753 + (((tickAnim - 10) / 5) * (-6.2334-(-1.7753)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -4.8883 + (((tickAnim - 15) / 15) * (14.4129-(-4.8883)));
            yy = -7.9123 + (((tickAnim - 15) / 15) * (7.9123-(-7.9123)));
            zz = -6.2334 + (((tickAnim - 15) / 15) * (-6.0309-(-6.2334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 15) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegR.rotationPointX = this.UpperLegR.rotationPointX + (float)(xx);
        this.UpperLegR.rotationPointY = this.UpperLegR.rotationPointY - (float)(yy);
        this.UpperLegR.rotationPointZ = this.UpperLegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.5 + (((tickAnim - 0) / 5) * (10.83-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.83 + (((tickAnim - 5) / 5) * (-27.09-(10.83)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -27.09 + (((tickAnim - 10) / 5) * (-30-(-27.09)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -30 + (((tickAnim - 15) / 15) * (-7.5-(-30)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.5 + (((tickAnim - 0) / 5) * (-20-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 5) / 3) * (-30-(-20)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30 + (((tickAnim - 8) / 2) * (-30-(-30)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -30 + (((tickAnim - 10) / 5) * (-10-(-30)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 15) / 5) * (-19.17-(-10)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -19.17 + (((tickAnim - 20) / 5) * (-20.83-(-19.17)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -20.83 + (((tickAnim - 25) / 5) * (-7.5-(-20.83)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (34.17-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 7.5 + (((tickAnim - 0) / 5) * (0-(7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 34.17 + (((tickAnim - 5) / 3) * (66.88-(34.17)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 66.88 + (((tickAnim - 8) / 2) * (94.59-(66.88)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 94.59 + (((tickAnim - 10) / 5) * (44.95392-(94.59)));
            yy = 0 + (((tickAnim - 10) / 5) * (-1.08089-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (4.88206-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 44.95392 + (((tickAnim - 15) / 5) * (39.93656-(44.95392)));
            yy = -1.08089 + (((tickAnim - 15) / 5) * (-0.9762-(-1.08089)));
            zz = 4.88206 + (((tickAnim - 15) / 5) * (7.43656-(4.88206)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 39.93656 + (((tickAnim - 20) / 5) * (27.54256-(39.93656)));
            yy = -0.9762 + (((tickAnim - 20) / 5) * (0.65182-(-0.9762)));
            zz = 7.43656 + (((tickAnim - 20) / 5) * (7.47178-(7.43656)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 27.54256 + (((tickAnim - 25) / 5) * (0-(27.54256)));
            yy = 0.65182 + (((tickAnim - 25) / 5) * (0-(0.65182)));
            zz = 7.47178 + (((tickAnim - 25) / 5) * (7.5-(7.47178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -4.8883 + (((tickAnim - 0) / 15) * (14.4129-(-4.8883)));
            yy = 2.7044 + (((tickAnim - 0) / 15) * (-7.9123-(2.7044)));
            zz = 6.2334 + (((tickAnim - 0) / 15) * (6.03094-(6.2334)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 14.4129 + (((tickAnim - 15) / 5) * (-8.29091-(14.4129)));
            yy = -7.9123 + (((tickAnim - 15) / 5) * (-1.34816-(-7.9123)));
            zz = 6.03094 + (((tickAnim - 15) / 5) * (2.09521-(6.03094)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -8.29091 + (((tickAnim - 20) / 5) * (-11.73368-(-8.29091)));
            yy = -1.34816 + (((tickAnim - 20) / 5) * (1.42897-(-1.34816)));
            zz = 2.09521 + (((tickAnim - 20) / 5) * (1.77531-(2.09521)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -11.73368 + (((tickAnim - 25) / 5) * (-4.8883-(-11.73368)));
            yy = 1.42897 + (((tickAnim - 25) / 5) * (2.7044-(1.42897)));
            zz = 1.77531 + (((tickAnim - 25) / 5) * (6.2334-(1.77531)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 15) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegL.rotationPointX = this.UpperLegL.rotationPointX + (float)(xx);
        this.UpperLegL.rotationPointY = this.UpperLegL.rotationPointY - (float)(yy);
        this.UpperLegL.rotationPointZ = this.UpperLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -30 + (((tickAnim - 0) / 15) * (-7.5-(-30)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 15) / 5) * (10.83-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 10.83 + (((tickAnim - 20) / 5) * (-27.09-(10.83)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -27.09 + (((tickAnim - 25) / 5) * (-30-(-27.09)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 0) / 5) * (-19.17-(-10)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -19.17 + (((tickAnim - 5) / 5) * (-20.83-(-19.17)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -20.83 + (((tickAnim - 10) / 5) * (-7.5-(-20.83)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 15) / 5) * (-20-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -20 + (((tickAnim - 20) / 3) * (-30-(-20)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -30 + (((tickAnim - 23) / 2) * (-30-(-30)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -30 + (((tickAnim - 25) / 5) * (-10-(-30)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 44.89638 + (((tickAnim - 0) / 5) * (39.93656-(44.89638)));
            yy = 1.61888 + (((tickAnim - 0) / 5) * (0.9762-(1.61888)));
            zz = -7.32417 + (((tickAnim - 0) / 5) * (-7.43656-(-7.32417)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 39.93656 + (((tickAnim - 5) / 5) * (27.54256-(39.93656)));
            yy = 0.9762 + (((tickAnim - 5) / 5) * (-0.65182-(0.9762)));
            zz = -7.43656 + (((tickAnim - 5) / 5) * (-7.47178-(-7.43656)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 27.54256 + (((tickAnim - 10) / 5) * (0-(27.54256)));
            yy = -0.65182 + (((tickAnim - 10) / 5) * (0-(-0.65182)));
            zz = -7.47178 + (((tickAnim - 10) / 5) * (-5-(-7.47178)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (34.17-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -5 + (((tickAnim - 15) / 5) * (0-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 34.17 + (((tickAnim - 20) / 3) * (66.88-(34.17)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 66.88 + (((tickAnim - 23) / 2) * (94.59-(66.88)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 94.59 + (((tickAnim - 25) / 5) * (44.89638-(94.59)));
            yy = 0 + (((tickAnim - 25) / 5) * (1.61888-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (-7.32417-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(-22+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-30))*1), Tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-50))*2)), Tail1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-50))*-3)));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(6.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*2), Tail2.rotateAngleY + (float) Math.toRadians(0-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-80))*2)), Tail2.rotateAngleZ + (float) Math.toRadians(0-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-80))*-3)));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*3), Tail3.rotateAngleY + (float) Math.toRadians(0-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-120))*2)), Tail3.rotateAngleZ + (float) Math.toRadians(0-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-120))*-3)));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-15))*-5), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 0) / 5) * (0.36-(-7.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0.36 + (((tickAnim - 5) / 7) * (-12.5-(0.36)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -12.5 + (((tickAnim - 12) / 3) * (-7.5-(-12.5)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 15) / 5) * (0.36-(-7.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0.36 + (((tickAnim - 20) / 7) * (-12.5-(0.36)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -12.5 + (((tickAnim - 27) / 3) * (-7.5-(-12.5)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));



        this.feathers2.setScale((float)1,(float)0,(float)1);


        this.feathers.setScale((float)1,(float)0,(float)0);


        this.setRotateAngle(HandsL, HandsL.rotateAngleX + (float) Math.toRadians(0), HandsL.rotateAngleY + (float) Math.toRadians(0), HandsL.rotateAngleZ + (float) Math.toRadians(5));
        this.HandsL.rotationPointX = this.HandsL.rotationPointX + (float)(-0.35);
        this.HandsL.rotationPointY = this.HandsL.rotationPointY - (float)(0);
        this.HandsL.rotationPointZ = this.HandsL.rotationPointZ + (float)(0);


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*5), Neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-5), Neck1.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 7) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 23) / 7) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*3), Neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*2), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*-7), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 7.5 + (((tickAnim - 0) / 5) * (-0.36-(7.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -0.36 + (((tickAnim - 5) / 7) * (12.5-(-0.36)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 12.5 + (((tickAnim - 12) / 3) * (7.5-(12.5)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 7.5 + (((tickAnim - 15) / 5) * (-0.36-(7.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = -0.36 + (((tickAnim - 20) / 7) * (12.5-(-0.36)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 12.5 + (((tickAnim - 27) / 3) * (7.5-(12.5)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));



        this.feathers3.setScale((float)1,(float)0,(float)1);


        this.feathers4.setScale((float)1,(float)0,(float)0);


        this.setRotateAngle(HandsR, HandsR.rotateAngleX + (float) Math.toRadians(0), HandsR.rotateAngleY + (float) Math.toRadians(0), HandsR.rotateAngleZ + (float) Math.toRadians(-5));
        this.HandsR.rotationPointX = this.HandsR.rotationPointX + (float)(0.35);
        this.HandsR.rotationPointY = this.HandsR.rotationPointY - (float)(0);
        this.HandsR.rotationPointZ = this.HandsR.rotationPointZ + (float)(0);

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.58-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1.58 + (((tickAnim - 3) / 2) * (3.5-(-1.58)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 3.5 + (((tickAnim - 5) / 5) * (0-(3.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Archaeopteryx.rotationPointX = this.Archaeopteryx.rotationPointX + (float)(xx);
        this.Archaeopteryx.rotationPointY = this.Archaeopteryx.rotationPointY - (float)(yy);
        this.Archaeopteryx.rotationPointZ = this.Archaeopteryx.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-16.67-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -16.67 + (((tickAnim - 2) / 3) * (30-(-16.67)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 30 + (((tickAnim - 5) / 2) * (-15-(30)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 7) / 3) * (0-(-15)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (19.17-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 19.17 + (((tickAnim - 2) / 3) * (-20-(19.17)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -20 + (((tickAnim - 5) / 2) * (8.33-(-20)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 8.33 + (((tickAnim - 7) / 1) * (-28.93-(8.33)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -28.93 + (((tickAnim - 8) / 2) * (0-(-28.93)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.42-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.42 + (((tickAnim - 2) / 1) * (-3.43-(0.42)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.43 + (((tickAnim - 3) / 2) * (25-(-3.43)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 5) / 2) * (-37.92-(25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -37.92 + (((tickAnim - 7) / 1) * (6.25-(-37.92)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.25 + (((tickAnim - 8) / 2) * (0-(6.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-4.37-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -4.37 + (((tickAnim - 2) / 2) * (0.54-(-4.37)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.54 + (((tickAnim - 4) / 1) * (37.5-(0.54)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 37.5 + (((tickAnim - 5) / 2) * (44.37-(37.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 44.37 + (((tickAnim - 7) / 1) * (26.52-(44.37)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 26.52 + (((tickAnim - 8) / 2) * (0-(26.52)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-16.67-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -16.67 + (((tickAnim - 3) / 2) * (30-(-16.67)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 5) / 3) * (-15-(30)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 8) / 2) * (0-(-15)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (19.17-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 19.17 + (((tickAnim - 3) / 2) * (-20-(19.17)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 5) / 3) * (8.33-(-20)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 8.33 + (((tickAnim - 8) / 1) * (-28.93-(8.33)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -28.93 + (((tickAnim - 9) / 1) * (0-(-28.93)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.42-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.42 + (((tickAnim - 3) / 2) * (25-(0.42)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 5) / 3) * (-37.92-(25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -37.92 + (((tickAnim - 8) / 1) * (6.25-(-37.92)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 6.25 + (((tickAnim - 9) / 1) * (0-(6.25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-4.37-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -4.37 + (((tickAnim - 2) / 2) * (0.54-(-4.37)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.54 + (((tickAnim - 4) / 1) * (37.5-(0.54)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 37.5 + (((tickAnim - 5) / 3) * (44.37-(37.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 44.37 + (((tickAnim - 8) / 1) * (26.52-(44.37)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 26.52 + (((tickAnim - 9) / 1) * (0-(26.52)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.58-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.58 + (((tickAnim - 3) / 2) * (-5-(-4.58)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 5) / 3) * (3.33-(-5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.33 + (((tickAnim - 8) / 2) * (0-(3.33)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-6.04-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -6.04 + (((tickAnim - 3) / 2) * (-2.5-(-6.04)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (4.17-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.17 + (((tickAnim - 8) / 2) * (0-(4.17)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.92-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.92 + (((tickAnim - 3) / 2) * (-5-(2.92)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 5) / 3) * (0.83-(-5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.83 + (((tickAnim - 8) / 2) * (0-(0.83)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 5) / 3) * (-3.75-(7.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.75 + (((tickAnim - 8) / 2) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 5) / 3) * (-4.37-(7.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.37 + (((tickAnim - 8) / 2) * (0-(-4.37)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-8.96545-(0)));
            yy = -7.5 + (((tickAnim - 0) / 3) * (-12.48955-(-7.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-12.87-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -8.96545 + (((tickAnim - 3) / 2) * (-40.43089-(-8.96545)));
            yy = -12.48955 + (((tickAnim - 3) / 2) * (-17.47909-(-12.48955)));
            zz = -12.87 + (((tickAnim - 3) / 2) * (-25.74-(-12.87)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -40.43089 + (((tickAnim - 5) / 3) * (-40.91984-(-40.43089)));
            yy = -17.47909 + (((tickAnim - 5) / 3) * (-7.81991-(-17.47909)));
            zz = -25.74 + (((tickAnim - 5) / 3) * (-42.47546-(-25.74)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -40.91984 + (((tickAnim - 8) / 2) * (0-(-40.91984)));
            yy = -7.81991 + (((tickAnim - 8) / 2) * (-7.5-(-7.81991)));
            zz = -42.47546 + (((tickAnim - 8) / 2) * (0-(-42.47546)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 3) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 3) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 3) / 4) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 7) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 7) / 3) * (0-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.feathers2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.94-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -0.94 + (((tickAnim - 3) / 0) * (8.75-(-0.94)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.75 + (((tickAnim - 3) / 2) * (92.40911-(8.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (-10.20352-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-48.64261-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 92.40911 + (((tickAnim - 5) / 3) * (47.78978-(92.40911)));
            yy = -10.20352 + (((tickAnim - 5) / 3) * (-2.55088-(-10.20352)));
            zz = -48.64261 + (((tickAnim - 5) / 3) * (-12.16065-(-48.64261)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 47.78978 + (((tickAnim - 8) / 0) * (-13.75-(47.78978)));
            yy = -2.55088 + (((tickAnim - 8) / 0) * (0-(-2.55088)));
            zz = -12.16065 + (((tickAnim - 8) / 0) * (0-(-12.16065)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.75 + (((tickAnim - 8) / 2) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-8.96545-(0)));
            yy = 7.5 + (((tickAnim - 0) / 3) * (12.48955-(7.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (12.87-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -8.96545 + (((tickAnim - 3) / 2) * (-32.93089-(-8.96545)));
            yy = 12.48955 + (((tickAnim - 3) / 2) * (17.47909-(12.48955)));
            zz = 12.87 + (((tickAnim - 3) / 2) * (25.74-(12.87)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -32.93089 + (((tickAnim - 5) / 3) * (-40.91984-(-32.93089)));
            yy = 17.47909 + (((tickAnim - 5) / 3) * (7.81991-(17.47909)));
            zz = 25.74 + (((tickAnim - 5) / 3) * (42.47546-(25.74)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -40.91984 + (((tickAnim - 8) / 2) * (0-(-40.91984)));
            yy = 7.81991 + (((tickAnim - 8) / 2) * (7.5-(7.81991)));
            zz = 42.47546 + (((tickAnim - 8) / 2) * (0-(42.47546)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 3) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 3) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 3) / 4) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 7) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 7) / 3) * (0-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.feathers3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.94-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -0.94 + (((tickAnim - 3) / 0) * (8.75-(-0.94)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.75 + (((tickAnim - 3) / 2) * (92.40911-(8.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (10.20352-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (48.64261-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 92.40911 + (((tickAnim - 5) / 3) * (47.78978-(92.40911)));
            yy = 10.20352 + (((tickAnim - 5) / 3) * (2.55088-(10.20352)));
            zz = 48.64261 + (((tickAnim - 5) / 3) * (12.16065-(48.64261)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 47.78978 + (((tickAnim - 8) / 0) * (-13.75-(47.78978)));
            yy = 2.55088 + (((tickAnim - 8) / 0) * (0-(2.55088)));
            zz = 12.16065 + (((tickAnim - 8) / 0) * (0-(12.16065)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.75 + (((tickAnim - 8) / 2) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 5) * (-5-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 5) / 5) * (0-(-15)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 5) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandsR, HandsR.rotateAngleX + (float) Math.toRadians(xx), HandsR.rotateAngleY + (float) Math.toRadians(yy), HandsR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.35 + (((tickAnim - 0) / 10) * (0.35-(0.35)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandsR.rotationPointX = this.HandsR.rotationPointX + (float)(xx);
        this.HandsR.rotationPointY = this.HandsR.rotationPointY - (float)(yy);
        this.HandsR.rotationPointZ = this.HandsR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 3) / 2) * (-5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 5) / 3) * (0.83-(-5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.83 + (((tickAnim - 8) / 2) * (0-(0.83)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 3) / 2) * (-10-(2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -10 + (((tickAnim - 5) / 2) * (0.83-(-10)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.83 + (((tickAnim - 7) / 3) * (0-(0.83)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (8.13-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 8.13 + (((tickAnim - 2) / 3) * (2.5-(8.13)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 5) / 3) * (6.25-(2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.25 + (((tickAnim - 8) / 2) * (0-(6.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.33-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.33 + (((tickAnim - 3) / 2) * (-2.5-(3.33)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (6.67-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.67 + (((tickAnim - 8) / 2) * (0-(6.67)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 3) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 3) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 3) / 4) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 7) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 7) / 3) * (0-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.feathers.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.67607-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (5.34927-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (8.47195-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.67607 + (((tickAnim - 3) / 2) * (-51.64785-(6.67607)));
            yy = 5.34927 + (((tickAnim - 3) / 2) * (10.69853-(5.34927)));
            zz = 8.47195 + (((tickAnim - 3) / 2) * (16.94391-(8.47195)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -51.64785 + (((tickAnim - 5) / 3) * (-50.82393-(-51.64785)));
            yy = 10.69853 + (((tickAnim - 5) / 3) * (5.34927-(10.69853)));
            zz = 16.94391 + (((tickAnim - 5) / 3) * (8.47195-(16.94391)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -50.82393 + (((tickAnim - 8) / 2) * (0-(-50.82393)));
            yy = 5.34927 + (((tickAnim - 8) / 2) * (0-(5.34927)));
            zz = 8.47195 + (((tickAnim - 8) / 2) * (0-(8.47195)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 5) * (5-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 5) / 5) * (0-(-15)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 5) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandsL, HandsL.rotateAngleX + (float) Math.toRadians(xx), HandsL.rotateAngleY + (float) Math.toRadians(yy), HandsL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.35 + (((tickAnim - 0) / 10) * (-0.35-(-0.35)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandsL.rotationPointX = this.HandsL.rotationPointX + (float)(xx);
        this.HandsL.rotationPointY = this.HandsL.rotationPointY - (float)(yy);
        this.HandsL.rotationPointZ = this.HandsL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 3) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 3) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 3) / 4) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 7) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 7) / 3) * (0-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.feathers4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.67607-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-5.34927-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-8.47195-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.67607 + (((tickAnim - 3) / 2) * (-51.64785-(6.67607)));
            yy = -5.34927 + (((tickAnim - 3) / 2) * (-10.69853-(-5.34927)));
            zz = -8.47195 + (((tickAnim - 3) / 2) * (-16.94391-(-8.47195)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -51.64785 + (((tickAnim - 5) / 3) * (-50.82393-(-51.64785)));
            yy = -10.69853 + (((tickAnim - 5) / 3) * (-5.34927-(-10.69853)));
            zz = -16.94391 + (((tickAnim - 5) / 3) * (-8.47195-(-16.94391)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -50.82393 + (((tickAnim - 8) / 2) * (0-(-50.82393)));
            yy = -5.34927 + (((tickAnim - 8) / 2) * (0-(-5.34927)));
            zz = -8.47195 + (((tickAnim - 8) / 2) * (0-(-8.47195)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLaunching(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Archaeopteryx, Archaeopteryx.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), Archaeopteryx.rotateAngleY + (float) Math.toRadians(0), Archaeopteryx.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 10) * (3-(1)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 3 + (((tickAnim - 10) / 10) * (1-(3)));
            zz = -2 + (((tickAnim - 10) / 10) * (0-(-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Archaeopteryx.rotationPointX = this.Archaeopteryx.rotationPointX + (float)(xx);
        this.Archaeopteryx.rotationPointY = this.Archaeopteryx.rotationPointY - (float)(yy);
        this.Archaeopteryx.rotationPointZ = this.Archaeopteryx.rotationPointZ + (float)(zz);



        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(15.8126+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*5), UpperLegR.rotateAngleY + (float) Math.toRadians(-7.8879+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), UpperLegR.rotateAngleZ + (float) Math.toRadians(5.029+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-10));
        this.UpperLegR.rotationPointX = this.UpperLegR.rotationPointX + (float)(0);
        this.UpperLegR.rotationPointY = this.UpperLegR.rotationPointY - (float)(-1);
        this.UpperLegR.rotationPointZ = this.UpperLegR.rotationPointZ + (float)(0);


        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(110.73758), ToesR.rotateAngleY + (float) Math.toRadians(20.1787), ToesR.rotateAngleZ + (float) Math.toRadians(-11.3423));


        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(15.5188+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*5), UpperLegL.rotateAngleY + (float) Math.toRadians(7.2697+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), UpperLegL.rotateAngleZ + (float) Math.toRadians(-17.5491+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-10));
        this.UpperLegL.rotationPointX = this.UpperLegL.rotationPointX + (float)(0);
        this.UpperLegL.rotationPointY = this.UpperLegL.rotationPointY - (float)(-1);
        this.UpperLegL.rotationPointZ = this.UpperLegL.rotationPointZ + (float)(0);


        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(110.73758), ToesL.rotateAngleY + (float) Math.toRadians(-20.17867), ToesL.rotateAngleZ + (float) Math.toRadians(11.34225));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-5), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-2.5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-2.5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2.5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2.5));


        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(-60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*20), UpperArmL.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*-5), UpperArmL.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-20));
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(0);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*0.5);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(0);


        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(140+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2.5), LowerArmL.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-5), LowerArmL.rotateAngleZ + (float) Math.toRadians(-60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-1));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(-90), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-25));


        this.setRotateAngle(HandsL, HandsL.rotateAngleX + (float) Math.toRadians(0), HandsL.rotateAngleY + (float) Math.toRadians(0), HandsL.rotateAngleZ + (float) Math.toRadians(5));
        this.HandsL.rotationPointX = this.HandsL.rotationPointX + (float)(-0.35);
        this.HandsL.rotationPointY = this.HandsL.rotationPointY - (float)(0);
        this.HandsL.rotationPointZ = this.HandsL.rotationPointZ + (float)(0);


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(-60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*20), UpperArmR.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*5), UpperArmR.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*20));
        this.UpperArmR.rotationPointX = this.UpperArmR.rotationPointX + (float)(0);
        this.UpperArmR.rotationPointY = this.UpperArmR.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*0.5);
        this.UpperArmR.rotationPointZ = this.UpperArmR.rotationPointZ + (float)(0);


        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(140+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2.5), LowerArmR.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*5), LowerArmR.rotateAngleZ + (float) Math.toRadians(60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*10));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(-90), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*25));


        this.setRotateAngle(HandsR, HandsR.rotateAngleX + (float) Math.toRadians(0), HandsR.rotateAngleY + (float) Math.toRadians(0), HandsR.rotateAngleZ + (float) Math.toRadians(-5));
        this.HandsR.rotationPointX = this.HandsR.rotationPointX + (float)(0.35);
        this.HandsR.rotationPointY = this.HandsR.rotationPointY - (float)(0);
        this.HandsR.rotationPointZ = this.HandsR.rotationPointZ + (float)(0);


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2.5));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeopteryx entity = (EntityPrehistoricFloraArchaeopteryx) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Archaeopteryx, Archaeopteryx.rotateAngleX + (float) Math.toRadians(xx), Archaeopteryx.rotateAngleY + (float) Math.toRadians(yy), Archaeopteryx.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Archaeopteryx.rotationPointX = this.Archaeopteryx.rotationPointX + (float)(xx);
        this.Archaeopteryx.rotationPointY = this.Archaeopteryx.rotationPointY - (float)(yy);
        this.Archaeopteryx.rotationPointZ = this.Archaeopteryx.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 15.8126+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 0) / 30) * (17.2607+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(15.8126+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = -7.8879+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (-29.5236+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(-7.8879+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = 5.029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 30) * (15.0471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(5.029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 17.2607+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 30) / 30) * (4.9835+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(17.2607+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = -29.5236+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 30) / 30) * (-3.9387+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(-29.5236+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = 15.0471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 30) / 30) * (10.3232+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(15.0471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 4.9835+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 60) / 10) * (16.1048+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(4.9835+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = -3.9387+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 60) / 10) * (-11.9339+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(-3.9387+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = 10.3232+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 60) / 10) * (6.6668+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(10.3232+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 16.1048+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 70) / 10) * (15.8126+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(16.1048+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = -11.9339+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (-7.8879+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(-11.9339+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = 6.6668+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 10) * (5.029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(6.6668+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));

        this.UpperLegR.rotationPointX = this.UpperLegR.rotationPointX + (float)(0);
        this.UpperLegR.rotationPointY = this.UpperLegR.rotationPointY - (float)(-1);
        this.UpperLegR.rotationPointZ = this.UpperLegR.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 15.5188+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 0) / 30) * (26.5544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(15.5188+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = 7.2697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (-0.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(7.2697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = -17.5491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 30) * (-15.373+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(-17.5491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 26.5544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 30) / 30) * (6.9044+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(26.5544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = -0.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 30) / 30) * (15.4917+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(-0.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = -15.373+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 30) / 30) * (8.0708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(-15.373+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 6.9044+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 60) / 10) * (15.0672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(6.9044+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = 15.4917+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 60) / 10) * (8.8531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(15.4917+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = 8.0708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 60) / 10) * (-24.0527+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(8.0708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 15.0672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 70) / 10) * (15.5188+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(15.0672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = 8.8531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (7.2697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(8.8531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = -24.0527+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 10) * (-17.5491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-24.0527+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 110.73758 + (((tickAnim - 0) / 80) * (110.73758-(110.73758)));
            yy = 20.1787 + (((tickAnim - 0) / 80) * (20.1787-(20.1787)));
            zz = -11.3423 + (((tickAnim - 0) / 80) * (-11.3423-(-11.3423)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 15.5188+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 0) / 30) * (26.5544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(15.5188+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = 7.2697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (-0.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(7.2697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = -17.5491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 30) * (-15.373+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(-17.5491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 26.5544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 30) / 30) * (6.9044+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(26.5544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = -0.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 30) / 30) * (15.4917+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(-0.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = -15.373+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 30) / 30) * (8.0708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(-15.373+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 6.9044+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 60) / 10) * (15.0672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(6.9044+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = 15.4917+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 60) / 10) * (8.8531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(15.4917+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = 8.0708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 60) / 10) * (-24.0527+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(8.0708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 15.0672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 70) / 10) * (15.5188+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(15.0672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = 8.8531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (7.2697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(8.8531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = -24.0527+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 10) * (-17.5491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-24.0527+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));

        this.UpperLegL.rotationPointX = this.UpperLegL.rotationPointX + (float)(0);
        this.UpperLegL.rotationPointY = this.UpperLegL.rotationPointY - (float)(-1);
        this.UpperLegL.rotationPointZ = this.UpperLegL.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 0) / 60) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 5 + (((tickAnim - 0) / 60) * (5-(5)));
            zz = 10 + (((tickAnim - 0) / 60) * (10-(10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 60) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
            yy = 5 + (((tickAnim - 60) / 10) * (5-(5)));
            zz = 10 + (((tickAnim - 60) / 10) * (10-(10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 70) / 10) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 5 + (((tickAnim - 70) / 10) * (5-(5)));
            zz = 10 + (((tickAnim - 70) / 10) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 110.73758 + (((tickAnim - 0) / 80) * (110.73758-(110.73758)));
            yy = -20.17867 + (((tickAnim - 0) / 80) * (-20.17867-(-20.17867)));
            zz = 11.34225 + (((tickAnim - 0) / 80) * (11.34225-(11.34225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20 + (((tickAnim - 0) / 30) * (-65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 0) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 30) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20-(-65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20 + (((tickAnim - 70) / 10) * (-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20-(-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(xx);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(yy);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            zz = -60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 0) / 30) * (-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 30) / 30) * (140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 30) / 30) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            zz = -60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 30) / 30) * (-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 60) / 10) * (140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 60) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            zz = -60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 60) / 10) * (-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            zz = -60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 70) / 10) * (-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -90 + (((tickAnim - 0) / 30) * (-90-(-90)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -90 + (((tickAnim - 30) / 30) * (-90-(-90)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -90 + (((tickAnim - 60) / 10) * (-90-(-90)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -90 + (((tickAnim - 70) / 10) * (-90-(-90)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(HandsL, HandsL.rotateAngleX + (float) Math.toRadians(0), HandsL.rotateAngleY + (float) Math.toRadians(0), HandsL.rotateAngleZ + (float) Math.toRadians(5));
        this.HandsL.rotationPointX = this.HandsL.rotationPointX + (float)(-0.35);
        this.HandsL.rotationPointY = this.HandsL.rotationPointY - (float)(0);
        this.HandsL.rotationPointZ = this.HandsL.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20 + (((tickAnim - 0) / 30) * (-65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 0) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 30) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20-(-65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20 + (((tickAnim - 70) / 10) * (-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20-(-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmR.rotationPointX = this.UpperArmR.rotationPointX + (float)(xx);
        this.UpperArmR.rotationPointY = this.UpperArmR.rotationPointY - (float)(yy);
        this.UpperArmR.rotationPointZ = this.UpperArmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 0) / 30) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 30) * (60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 30) / 30) * (60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 60) / 10) * (60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(140+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 70) / 10) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = 60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 10) * (60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -90 + (((tickAnim - 0) / 13) * (-91.30201-(-90)));
            yy = 0 + (((tickAnim - 0) / 13) * (5.32165-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 0) / 13) * (-5.53859-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -91.30201 + (((tickAnim - 13) / 17) * (-90-(-91.30201)));
            yy = 5.32165 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(5.32165)));
            zz = -5.53859 + (((tickAnim - 13) / 17) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-5.53859)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -90 + (((tickAnim - 30) / 30) * (-90-(-90)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 30) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -90 + (((tickAnim - 60) / 10) * (-90-(-90)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -90 + (((tickAnim - 70) / 10) * (-90-(-90)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(HandsR, HandsR.rotateAngleX + (float) Math.toRadians(0), HandsR.rotateAngleY + (float) Math.toRadians(0), HandsR.rotateAngleZ + (float) Math.toRadians(-5));
        this.HandsR.rotationPointX = this.HandsR.rotationPointX + (float)(0.35);
        this.HandsR.rotationPointY = this.HandsR.rotationPointY - (float)(0);
        this.HandsR.rotationPointZ = this.HandsR.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 0) / 30) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 30) / 30) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 60) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 70) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 0) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 30) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 60) / 10) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 70) / 10) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2 + (((tickAnim - 0) / 30) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 30) / 30) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 60) / 10) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2 + (((tickAnim - 70) / 10) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
