package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnchiornis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelAnchiornis extends AdvancedModelBase {
    private final AdvancedModelRenderer Anchiornis;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer FeatherR2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer FeatherR;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer ToesR;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer FeatherL2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer FeatherL;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer ToesL;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer Feather;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Feathers;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer HandwingL;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer Feather2;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Feathers2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer HandwingR;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer Jaw;

    private ModelAnimator animator;

    public ModelAnchiornis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Anchiornis = new AdvancedModelRenderer(this);
        this.Anchiornis.setRotationPoint(0.5F, 11.1F, 1.0F);


        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(-1.0F, -2.0F, -1.0F);
        this.Anchiornis.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.192F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 14, 12, -1.5F, 0.1913F, -0.1317F, 4, 5, 5, 0.01F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-2.5F, 1.0F, 2.0F);
        this.Anchiornis.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.1745F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.65F, -0.6F);
        this.UpperLegR.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 7, -0.75F, -0.4F, 2.05F, 0, 6, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.9F, -0.6F);
        this.UpperLegR.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 30, -1.0F, -0.4F, -0.95F, 2, 6, 3, 0.0F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-0.2F, 2.8F, -4.2F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.0436F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4712F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 30, -0.5F, -0.2F, -0.3F, 1, 7, 2, -0.001F, false));

        this.FeatherR2 = new AdvancedModelRenderer(this);
        this.FeatherR2.setRotationPoint(0.0F, 3.0F, 4.0F);
        this.LowerLegR.addChild(FeatherR2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.FeatherR2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4712F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 25, -0.25F, -0.2F, 1.7F, 0, 8, 5, 0.0F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 5.15F, 4.1F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.2618F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6283F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 42, -0.5F, -0.1F, -0.6F, 1, 4, 1, -0.002F, false));

        this.FeatherR = new AdvancedModelRenderer(this);
        this.FeatherR.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.FootR.addChild(FeatherR);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.FeatherR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6283F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.1F, -1.1F, 0.4F, 0, 5, 5, 0.0F, false));

        this.ToesR = new AdvancedModelRenderer(this);
        this.ToesR.setRotationPoint(0.0F, 2.6F, -3.0F);
        this.FootR.addChild(ToesR);
        this.setRotateAngle(ToesR, -0.5672F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ToesR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 6, -1.0F, -0.3F, -3.0F, 2, 1, 4, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(1.5F, 1.0F, 2.0F);
        this.Anchiornis.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.1745F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.9F, -0.6F);
        this.UpperLegL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 7, 0.75F, -0.4F, 2.05F, 0, 6, 3, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 30, -1.0F, -0.4F, -0.95F, 2, 6, 3, 0.0F, true));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.2F, 2.8F, -4.2F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4712F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 30, -0.5F, -0.2F, -0.3F, 1, 7, 2, -0.001F, true));

        this.FeatherL2 = new AdvancedModelRenderer(this);
        this.FeatherL2.setRotationPoint(0.0F, 3.0F, 4.0F);
        this.LowerLegL.addChild(FeatherL2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.FeatherL2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4712F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 25, 0.25F, -0.2F, 1.7F, 0, 8, 5, 0.0F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 5.15F, 4.1F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.2618F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6283F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 42, -0.5F, -0.1F, -0.6F, 1, 4, 1, -0.002F, true));

        this.FeatherL = new AdvancedModelRenderer(this);
        this.FeatherL.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.FootL.addChild(FeatherL);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.FeatherL.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6283F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.1F, -1.1F, 0.4F, 0, 5, 5, 0.0F, true));

        this.ToesL = new AdvancedModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 2.6F, -3.0F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, -0.5672F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ToesL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0524F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 6, -1.0F, -0.3F, -3.0F, 2, 1, 4, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(-0.5F, -0.1F, 3.5F);
        this.Anchiornis.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.096F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 28, 0, -1.0F, -0.1F, -0.4F, 2, 2, 6, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 18, 0, -2.5F, 0.4F, -0.4F, 5, 0, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.25F, 5.6F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.2182F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 10, -3.5F, 0.25F, -0.6F, 6, 0, 7, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 22, -1.0F, 0.0F, -0.6F, 1, 1, 7, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 6.5F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.2182F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -4.0F, 0.25F, -0.25F, 7, 0, 10, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.0F, 0.25F);
        this.Tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 17, -1.0F, 0.0F, -0.6F, 1, 1, 8, -0.01F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 1.3F, -1.0F);
        this.Anchiornis.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 10, 28, -2.5F, -3.1F, -4.0F, 4, 5, 4, 0.001F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.Body.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 34, 15, -2.0F, 0.0F, -2.0F, 3, 4, 2, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(0.9F, 3.3F, -0.6F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.0601F, 0.3793F, 0.0432F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 29, 8, -0.6386F, -1.9791F, -0.0262F, 1, 2, 5, 0.0F, true));

        this.Feather = new AdvancedModelRenderer(this);
        this.Feather.setRotationPoint(-0.6386F, -0.7291F, 2.9738F);
        this.UpperArmL.addChild(Feather);
        this.Feather.cubeList.add(new ModelBox(Feather, 0, 19, 0.8F, -4.0F, -2.0F, 0, 4, 7, 0.0F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(-0.6386F, -0.7291F, 4.9738F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -1.2404F, -0.1043F, -0.2897F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.4F, -0.2F);
        this.LowerArmL.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.4835F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -0.35F, 0.0F, 1, 1, 4, -0.001F, true));

        this.Feathers = new AdvancedModelRenderer(this);
        this.Feathers.setRotationPoint(-0.25F, 2.6F, -0.2F);
        this.LowerArmL.addChild(Feathers);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Feathers.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.4835F, -0.0348F, -0.003F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 15, 0.65F, -6.35F, -2.0F, 0, 6, 7, 0.0F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.6F, 3.5F, -0.4F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 1.309F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.2F, 1.1525F);
        this.HandL.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5518F, -0.0956F, 0.1667F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 17, -0.791F, -0.8937F, -0.9454F, 1, 4, 1, -0.01F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandL.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4209F, -0.0956F, 0.1667F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.375F, 0.15F, -2.5F, 0, 2, 2, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 39, -0.6F, -0.6F, -1.0F, 1, 6, 1, 0.0F, true));

        this.HandwingL = new AdvancedModelRenderer(this);
        this.HandwingL.setRotationPoint(0.4F, 0.8F, 1.5F);
        this.HandL.addChild(HandwingL);
        this.setRotateAngle(HandwingL, 0.4363F, 0.0873F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.HandwingL.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -2.2407F, -0.0441F, 0.137F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 15, 44, 0.65F, -9.3127F, -0.6518F, 0, 8, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.HandwingL.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.5952F, -0.0389F, 0.1356F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 43, 0.75F, -7.9127F, 0.3482F, 0, 8, 3, 0.0F, true));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-1.9F, 3.3F, -0.6F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.0601F, -0.3793F, -0.0432F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 29, 8, -0.3614F, -1.9791F, -0.0262F, 1, 2, 5, 0.0F, false));

        this.Feather2 = new AdvancedModelRenderer(this);
        this.Feather2.setRotationPoint(0.6386F, -0.7291F, 2.9738F);
        this.UpperArmR.addChild(Feather2);
        this.Feather2.cubeList.add(new ModelBox(Feather2, 0, 19, -0.8F, -4.0F, -2.0F, 0, 4, 7, 0.0F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(0.6386F, -0.7291F, 4.9738F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -1.2404F, 0.1043F, 0.2897F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.4F, -0.2F);
        this.LowerArmR.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -1.4835F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -1.0F, -0.35F, 0.0F, 1, 1, 4, -0.001F, false));

        this.Feathers2 = new AdvancedModelRenderer(this);
        this.Feathers2.setRotationPoint(0.25F, 2.6F, -0.2F);
        this.LowerArmR.addChild(Feathers2);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Feathers2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.4835F, 0.0348F, 0.003F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 18, 15, -0.65F, -6.35F, -2.0F, 0, 6, 7, 0.0F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-0.6F, 3.5F, -0.4F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 1.309F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.2F, 1.1525F);
        this.HandR.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5518F, 0.0956F, -0.1667F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 17, -0.209F, -0.8937F, -0.9454F, 1, 4, 1, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandR.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4209F, 0.0956F, -0.1667F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -0.375F, 0.15F, -2.5F, 0, 2, 2, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 40, 39, -0.4F, -0.6F, -1.0F, 1, 6, 1, 0.0F, false));

        this.HandwingR = new AdvancedModelRenderer(this);
        this.HandwingR.setRotationPoint(-0.4F, 0.8F, 1.5F);
        this.HandR.addChild(HandwingR);
        this.setRotateAngle(HandwingR, 0.4363F, -0.0873F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.HandwingR.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -2.2407F, 0.0441F, -0.137F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 44, -0.65F, -9.3127F, -0.6518F, 0, 8, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.HandwingR.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.5952F, 0.0389F, -0.1356F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 32, 43, -0.75F, -7.9127F, 0.3482F, 0, 8, 3, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.7F, -1.5F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.2182F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.7409F, 0.4629F);
        this.Neck1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.7156F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 34, 22, -1.5F, 0.75F, -0.65F, 2, 3, 3, 0.001F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(-0.6F, 0.5591F, -0.4371F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2531F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.6F, 2.0072F, -1.4897F);
        this.Neck2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.6283F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 41, 12, -1.5F, -2.2557F, -1.0422F, 2, 2, 1, -0.011F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.6F, -0.2928F, 0.2103F);
        this.Neck2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.9425F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 38, 0, -1.5F, -0.1784F, -2.1807F, 2, 3, 2, 0.01F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.6F, -1.5928F, -1.5897F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.1745F, 0.0F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.9F, -1.4F);
        this.Neck3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5411F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 19, -0.51F, -2.6051F, 0.3898F, 0, 3, 3, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 37, -1.5F, 0.2449F, 0.3898F, 2, 3, 2, -0.002F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.4F, -1.7F);
        this.Neck3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4887F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 41, -0.5F, -0.01F, -0.5234F, 0, 2, 2, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 38, -1.5F, -2.76F, -0.5234F, 2, 3, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9F, -1.1F);
        this.Neck3.addChild(head);
        this.setRotateAngle(head, -0.0698F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 32, 39, -1.5F, -0.4F, -2.0F, 2, 2, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 41, 22, -1.5F, -0.1F, -2.55F, 2, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 30, -1.5F, 0.6F, -3.0F, 2, 1, 1, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 6, 41, -1.0F, 0.6F, -4.5F, 1, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 0.6F, -5.1F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.3665F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 0, -0.5F, 0.2566F, 0.5662F, 1, 1, 1, -0.002F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 14, 26, -0.5F, 0.2566F, 1.3162F, 1, 1, 1, -0.001F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.4F, -3.0F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.6545F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 28, 8, -1.5F, 0.4341F, -0.5022F, 2, 1, 1, -0.003F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 29, 15, -1.5F, 0.4341F, -0.0022F, 2, 1, 1, -0.002F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, -0.4F, -3.0F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0698F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 10, 19, 0.0F, -3.35F, 1.0F, 0, 3, 3, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 40, 28, -1.0F, -0.35F, 1.0F, 2, 1, 2, 0.0015F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.1F, 0.0F);
        this.head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 36, 8, -1.5F, 0.0F, -3.0F, 2, 1, 3, 0.0002F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 6, 41, -0.51F, 0.75F, -3.0F, 0, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 6, 2, -1.0F, 0.0F, -4.0F, 1, 1, 1, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 6, 0, -1.0F, 0.0F, -4.5F, 1, 1, 1, -0.02F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 24, 39, -1.5F, -1.0F, -2.0F, 2, 2, 2, -0.003F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Anchiornis.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(Anchiornis, 0.0F, 0.0F, 0.0F);
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
        this.setRotateAngle(UpperLegL, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegR, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, -0.7F, 1.0F, -0.8F);
        this.setRotateAngle(LowerArmL, 0.2F, 0.5F, 0.0F);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, -0.7F, -1.0F, 0.8F);
        this.setRotateAngle(LowerArmR, 0.2F, -0.5F, 0.0F);
        this.setRotateAngle(HandR, 0.0F,0.0F, 0.0F);
        this.Anchiornis.offsetY = -0.15F;
        this.Anchiornis.offsetX = 0.0F;
        this.Anchiornis.offsetZ = -0.4F;
        this.Anchiornis.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Anchiornis, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, -0.7F, 1.0F, -0.8F);
        this.setRotateAngle(LowerArmL, 0.2F, 0.5F, 0.0F);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, -0.7F, -1.0F, 0.8F);
        this.setRotateAngle(LowerArmR, 0.2F, -0.5F, 0.0F);
        this.setRotateAngle(HandR, 0.0F,0.0F, 0.0F);
        this.Anchiornis.offsetX = 0.0F;
        this.Anchiornis.offsetY = 0.23F;
        this.Anchiornis.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Anchiornis.offsetY = -1.0F;
        this.Anchiornis.offsetX = 0.2F;
        this.Anchiornis.rotateAngleY = (float)Math.toRadians(150);
        this.Anchiornis.rotateAngleX = (float)Math.toRadians(3);
        this.Anchiornis.rotateAngleZ = (float)Math.toRadians(0);
        this.Anchiornis.scaleChildren = true;
        float scaler = 3.5F;
        this.Anchiornis.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Anchiornis, 0.5F, 2.5F, 0.0F);
        this.setRotateAngle(Body, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, -0.7F, 1.0F, -0.8F);
        this.setRotateAngle(LowerArmL, 0.2F, 0.5F, 0.0F);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, -0.7F, -1.0F, 0.8F);
        this.setRotateAngle(LowerArmR, 0.2F, -0.5F, 0.0F);
        this.setRotateAngle(HandR, 0.0F,0.0F, 0.0F);
        //End of pose, now render the model:
        this.Anchiornis.render(f);
        //Reset rotations, positions and sizing:
        this.Anchiornis.setScale(1.0F, 1.0F, 1.0F);
        this.Anchiornis.scaleChildren = false;
        resetToDefaultPose();
    }
    
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraAnchiornis ee = (EntityPrehistoricFloraAnchiornis) e;

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
        EntityPrehistoricFloraAnchiornis ee = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.DISPLAY_ANIMATION) { //The display
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


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
            yy = 0 + (((tickAnim - 0) / 5) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 5) / 5) * (0.19-(0.375)));
            zz = -0.4 + (((tickAnim - 5) / 5) * (0.8-(-0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.19 + (((tickAnim - 10) / 5) * (0-(0.19)));
            zz = 0.8 + (((tickAnim - 10) / 5) * (1-(0.8)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-0.2-(0)));
            zz = 1 + (((tickAnim - 15) / 5) * (-2-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 5) * (0-(-0.2)));
            zz = -2 + (((tickAnim - 20) / 5) * (1-(-2)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 1 + (((tickAnim - 25) / 5) * (0-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0.3-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 5) * (0-(0.3)));
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


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-32.72573-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-5.5831-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-18.3087-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -32.72573 + (((tickAnim - 20) / 5) * (0-(-32.72573)));
            yy = -5.5831 + (((tickAnim - 20) / 5) * (0-(-5.5831)));
            zz = -18.3087 + (((tickAnim - 20) / 5) * (0-(-18.3087)));
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
            xx = 0 + (((tickAnim - 15) / 5) * (0.7-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.7 + (((tickAnim - 20) / 5) * (0-(0.7)));
            yy = 0.25 + (((tickAnim - 20) / 5) * (0-(0.25)));
            zz = -0.425 + (((tickAnim - 20) / 5) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(xx);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(yy);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(zz);



        this.Feathers.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-32.72573-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (5.58311-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (18.30872-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -32.72573 + (((tickAnim - 20) / 5) * (0-(-32.72573)));
            yy = 5.58311 + (((tickAnim - 20) / 5) * (0-(5.58311)));
            zz = 18.30872 + (((tickAnim - 20) / 5) * (0-(18.30872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-0.7-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.7 + (((tickAnim - 20) / 5) * (0-(-0.7)));
            yy = 0.25 + (((tickAnim - 20) / 5) * (0-(0.25)));
            zz = -0.425 + (((tickAnim - 20) / 5) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmR.rotationPointX = this.UpperArmR.rotationPointX + (float)(xx);
        this.UpperArmR.rotationPointY = this.UpperArmR.rotationPointY - (float)(yy);
        this.UpperArmR.rotationPointZ = this.UpperArmR.rotationPointZ + (float)(zz);



        this.Feathers2.setScale((float)1,(float)0,(float)0);

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

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
            yy = 0 + (((tickAnim - 0) / 5) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 5) / 5) * (-0.01-(0.375)));
            zz = -0.4 + (((tickAnim - 5) / 5) * (0.975-(-0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.01 + (((tickAnim - 10) / 5) * (0.125-(-0.01)));
            zz = 0.975 + (((tickAnim - 10) / 5) * (1-(0.975)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 15) / 5) * (-0.075-(0.125)));
            zz = 1 + (((tickAnim - 15) / 5) * (-2-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.075 + (((tickAnim - 20) / 5) * (0-(-0.075)));
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


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-32.72573-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-5.5831-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-18.3087-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -32.72573 + (((tickAnim - 20) / 5) * (0-(-32.72573)));
            yy = -5.5831 + (((tickAnim - 20) / 5) * (0-(-5.5831)));
            zz = -18.3087 + (((tickAnim - 20) / 5) * (0-(-18.3087)));
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
            xx = 0 + (((tickAnim - 15) / 5) * (0.7-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.7 + (((tickAnim - 20) / 5) * (0-(0.7)));
            yy = 0.25 + (((tickAnim - 20) / 5) * (0-(0.25)));
            zz = -0.425 + (((tickAnim - 20) / 5) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(xx);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(yy);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(zz);



        this.Feathers.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-32.72573-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (5.58311-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (18.30872-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -32.72573 + (((tickAnim - 20) / 5) * (0-(-32.72573)));
            yy = 5.58311 + (((tickAnim - 20) / 5) * (0-(5.58311)));
            zz = 18.30872 + (((tickAnim - 20) / 5) * (0-(18.30872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-0.7-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.7 + (((tickAnim - 20) / 5) * (0-(-0.7)));
            yy = 0.25 + (((tickAnim - 20) / 5) * (0-(0.25)));
            zz = -0.425 + (((tickAnim - 20) / 5) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmR.rotationPointX = this.UpperArmR.rotationPointX + (float)(xx);
        this.UpperArmR.rotationPointY = this.UpperArmR.rotationPointY - (float)(yy);
        this.UpperArmR.rotationPointZ = this.UpperArmR.rotationPointZ + (float)(zz);



        this.Feathers2.setScale((float)1,(float)0,(float)0);

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;


    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

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
        this.Anchiornis.rotationPointX = this.Anchiornis.rotationPointX + (float)(xx);
        this.Anchiornis.rotationPointY = this.Anchiornis.rotationPointY - (float)(yy);
        this.Anchiornis.rotationPointZ = this.Anchiornis.rotationPointZ + (float)(zz);




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
            xx = 0 + (((tickAnim - 0) / 18) * (-12.88095-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (3.54992-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.66549-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -12.88095 + (((tickAnim - 18) / 12) * (-12.88095-(-12.88095)));
            yy = 3.54992 + (((tickAnim - 18) / 12) * (3.54992-(3.54992)));
            zz = -6.66549 + (((tickAnim - 18) / 12) * (-6.66549-(-6.66549)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -12.88095 + (((tickAnim - 30) / 20) * (0-(-12.88095)));
            yy = 3.54992 + (((tickAnim - 30) / 20) * (0-(3.54992)));
            zz = -6.66549 + (((tickAnim - 30) / 20) * (0-(-6.66549)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));



        this.Feathers.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-16.50809-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.44609-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (9.41556-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -16.50809 + (((tickAnim - 18) / 12) * (-16.50809-(-16.50809)));
            yy = -2.44609 + (((tickAnim - 18) / 12) * (-2.44609-(-2.44609)));
            zz = 9.41556 + (((tickAnim - 18) / 12) * (9.41556-(9.41556)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16.50809 + (((tickAnim - 30) / 20) * (0-(-16.50809)));
            yy = -2.44609 + (((tickAnim - 30) / 20) * (0-(-2.44609)));
            zz = 9.41556 + (((tickAnim - 30) / 20) * (0-(9.41556)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));



        this.Feathers2.setScale((float)1,(float)0,(float)0);

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

        int animCycle = 85;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

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
        this.setRotateAngle(Anchiornis, Anchiornis.rotateAngleX + (float) Math.toRadians(xx), Anchiornis.rotateAngleY + (float) Math.toRadians(yy), Anchiornis.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Anchiornis.rotationPointX = this.Anchiornis.rotationPointX + (float)(xx);
        this.Anchiornis.rotationPointY = this.Anchiornis.rotationPointY - (float)(yy);
        this.Anchiornis.rotationPointZ = this.Anchiornis.rotationPointZ + (float)(zz);




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
            yy = 0 + (((tickAnim - 12) / 2) * (0.225-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (-0.875-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 14) / 6) * (0.38-(0.225)));
            zz = -0.875 + (((tickAnim - 14) / 6) * (0.795-(-0.875)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            yy = 0.38 + (((tickAnim - 20) / 60) * (0-(0.38)));
            zz = 0.795 + (((tickAnim - 20) / 60) * (0-(0.795)));
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
        else if (tickAnim >= 15 && tickAnim < 80) {
            xx = 17.5 + (((tickAnim - 15) / 65) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 15) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 65) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 17.5 + (((tickAnim - 80) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
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

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1 + (((tickAnim - 0) / 12) * (-22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1)-(-22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2 + (((tickAnim - 0) / 12) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3 + (((tickAnim - 0) / 12) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1 + (((tickAnim - 12) / 6) * (23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1)-(-22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2 + (((tickAnim - 12) / 6) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3 + (((tickAnim - 12) / 6) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1 + (((tickAnim - 18) / 37) * (23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1)-(23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2 + (((tickAnim - 18) / 37) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3 + (((tickAnim - 18) / 37) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1 + (((tickAnim - 55) / 13) * (9.17014-(23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2 + (((tickAnim - 55) / 13) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3 + (((tickAnim - 55) / 13) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3));
        }
        else if (tickAnim >= 68 && tickAnim < 83) {
            xx = 9.17014 + (((tickAnim - 68) / 15) * (-22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-30))*1-(9.17014)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2 + (((tickAnim - 68) / 15) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*2)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3 + (((tickAnim - 68) / 15) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-50))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3 + (((tickAnim - 0) / 12) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5 + (((tickAnim - 0) / 12) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3 + (((tickAnim - 0) / 12) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3 + (((tickAnim - 12) / 6) * (16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5 + (((tickAnim - 12) / 6) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3 + (((tickAnim - 12) / 6) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3 + (((tickAnim - 18) / 37) * (16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3-(16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5 + (((tickAnim - 18) / 37) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3 + (((tickAnim - 18) / 37) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3 + (((tickAnim - 55) / 13) * (21.63136-(16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5 + (((tickAnim - 55) / 13) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3 + (((tickAnim - 55) / 13) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else if (tickAnim >= 68 && tickAnim < 79) {
            xx = 21.63136 + (((tickAnim - 68) / 11) * (-5.70652-(21.63136)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5 + (((tickAnim - 68) / 11) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3 + (((tickAnim - 68) / 11) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = -5.70652 + (((tickAnim - 79) / 4) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-90))*3-(-5.70652)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5 + (((tickAnim - 79) / 4) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*5)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3 + (((tickAnim - 79) / 4) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-80))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10 + (((tickAnim - 0) / 12) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10)-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5 + (((tickAnim - 0) / 12) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120)))-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3 + (((tickAnim - 0) / 12) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10 + (((tickAnim - 12) / 6) * (21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10)-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5 + (((tickAnim - 12) / 6) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3 + (((tickAnim - 12) / 6) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10 + (((tickAnim - 18) / 37) * (21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10)-(21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5 + (((tickAnim - 18) / 37) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3 + (((tickAnim - 18) / 37) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3)-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10 + (((tickAnim - 55) / 13) * (30.4993-(21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5 + (((tickAnim - 55) / 13) * (-0.91875-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3 + (((tickAnim - 55) / 13) * (0.55125-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3)));
        }
        else if (tickAnim >= 68 && tickAnim < 79) {
            xx = 30.4993 + (((tickAnim - 68) / 11) * (-8.85505-(30.4993)));
            yy = -0.91875 + (((tickAnim - 68) / 11) * (1.8312-(-0.91875)));
            zz = 0.55125 + (((tickAnim - 68) / 11) * (-1.09872-(0.55125)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = -8.85505 + (((tickAnim - 79) / 4) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.125-120))*10)-(-8.85505));
            yy = 1.8312 + (((tickAnim - 79) / 4) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*5)-(1.8312)));
            zz = -1.09872 + (((tickAnim - 79) / 4) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.125-120))*-3)-(-1.09872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-60))*-1), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.125-60))*-1));



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
        else if (tickAnim >= 15 && tickAnim < 80) {
            xx = 7.5 + (((tickAnim - 15) / 65) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 15) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 65) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 7.5 + (((tickAnim - 80) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));



        this.Feathers.setScale((float)1,(float)0,(float)0);


        this.Feathers2.setScale((float)1,(float)0,(float)0);


    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

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
            zz = 0 + (((tickAnim - 5) / 5) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5 + (((tickAnim - 10) / 25) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2 + (((tickAnim - 10) / 25) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5 + (((tickAnim - 35) / 5) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2 + (((tickAnim - 35) / 5) * (0-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-2)));
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
        this.setRotateAngle(Anchiornis, Anchiornis.rotateAngleX + (float) Math.toRadians(xx), Anchiornis.rotateAngleY + (float) Math.toRadians(yy), Anchiornis.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Anchiornis.rotationPointX = this.Anchiornis.rotationPointX + (float)(xx);
        this.Anchiornis.rotationPointY = this.Anchiornis.rotationPointY - (float)(yy);
        this.Anchiornis.rotationPointZ = this.Anchiornis.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-35-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 10) / 25) * (-5-(-5)));
            yy = -35 + (((tickAnim - 10) / 25) * (-35-(-35)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
            yy = -35 + (((tickAnim - 35) / 5) * (0-(-35)));
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
        this.setRotateAngle(FeatherR2, FeatherR2.rotateAngleX + (float) Math.toRadians(xx), FeatherR2.rotateAngleY + (float) Math.toRadians(yy), FeatherR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-47.96016-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-34.8975-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (83.0443-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -47.96016 + (((tickAnim - 10) / 25) * (-47.96016-(-47.96016)));
            yy = -34.8975 + (((tickAnim - 10) / 25) * (-34.8975-(-34.8975)));
            zz = 83.0443 + (((tickAnim - 10) / 25) * (83.0443-(83.0443)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -47.96016 + (((tickAnim - 35) / 5) * (0-(-47.96016)));
            yy = -34.8975 + (((tickAnim - 35) / 5) * (0-(-34.8975)));
            zz = 83.0443 + (((tickAnim - 35) / 5) * (0-(83.0443)));
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
        this.setRotateAngle(FeatherR, FeatherR.rotateAngleX + (float) Math.toRadians(xx), FeatherR.rotateAngleY + (float) Math.toRadians(yy), FeatherR.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = 0 + (((tickAnim - 5) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (35-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 10) / 25) * (-5-(-5)));
            yy = 35 + (((tickAnim - 10) / 25) * (35-(35)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
            yy = 35 + (((tickAnim - 35) / 5) * (0-(35)));
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
        this.setRotateAngle(FeatherL2, FeatherL2.rotateAngleX + (float) Math.toRadians(xx), FeatherL2.rotateAngleY + (float) Math.toRadians(yy), FeatherL2.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = 0 + (((tickAnim - 5) / 5) * (-47.96016-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (34.89746-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-83.04429-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -47.96016 + (((tickAnim - 10) / 25) * (-47.96016-(-47.96016)));
            yy = 34.89746 + (((tickAnim - 10) / 25) * (34.89746-(34.89746)));
            zz = -83.04429 + (((tickAnim - 10) / 25) * (-83.04429-(-83.04429)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -47.96016 + (((tickAnim - 35) / 5) * (0-(-47.96016)));
            yy = 34.89746 + (((tickAnim - 35) / 5) * (0-(34.89746)));
            zz = -83.04429 + (((tickAnim - 35) / 5) * (0-(-83.04429)));
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
        this.setRotateAngle(FeatherL, FeatherL.rotateAngleX + (float) Math.toRadians(xx), FeatherL.rotateAngleY + (float) Math.toRadians(yy), FeatherL.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 10) / 25) * (-113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 10) / 25) * (0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 10) / 25) * (-102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(-102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 35) / 5) * (0-(-113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 35) / 5) * (0-(0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 35) / 5) * (0-(-102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
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
            xx = 0 + (((tickAnim - 5) / 5) * (139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 10) / 25) * (139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 10) / 25) * (14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = 17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 10) / 25) * (17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 35) / 5) * (0-(139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 35) / 5) * (0-(14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = 17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 35) / 5) * (0-(17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
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
        this.Feathers.setScale((float)xx, (float)yy, (float)zz);




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
            xx = 0 + (((tickAnim - 5) / 5) * (-113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 10) / 25) * (-113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 10) / 25) * (-0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(-0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 10) / 25) * (102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 35) / 5) * (0-(-113.2768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 35) / 5) * (0-(-0.7146+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 35) / 5) * (0-(102.1181+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
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
            xx = 0 + (((tickAnim - 5) / 5) * (139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 10) / 25) * (139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = -14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 10) / 25) * (-14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = -17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 10) / 25) * (-17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(-17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 35) / 5) * (0-(139.8545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = -14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 35) / 5) * (0-(-14.0084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = -17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 35) / 5) * (0-(-17.7565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
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
        this.Feathers2.setScale((float)xx, (float)yy, (float)zz);




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

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

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
            zz = 0 + (((tickAnim - 0) / 8) * (1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 8) / 2) * (0.75-(0.75)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 10) / 3) * (0.75-(0.75)));
            zz = 1 + (((tickAnim - 10) / 3) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.75 + (((tickAnim - 13) / 4) * (-0.02-(0.75)));
            zz = 1 + (((tickAnim - 13) / 4) * (0-(1)));
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


        this.Feathers.setScale((float)1,(float)0,(float)0);


        this.Feathers2.setScale((float)1,(float)0,(float)0);

    }

    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

        int animCycle = 29;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -54 + (((tickAnim - 0) / 12) * (-54-(-54)));
            yy = 0 + (((tickAnim - 0) / 12) * (7-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -54 + (((tickAnim - 12) / 4) * (-54-(-54)));
            yy = 7 + (((tickAnim - 12) / 4) * (0-(7)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -54 + (((tickAnim - 16) / 9) * (-54-(-54)));
            yy = 0 + (((tickAnim - 16) / 9) * (-8-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -54 + (((tickAnim - 25) / 4) * (-54-(-54)));
            yy = -8 + (((tickAnim - 25) / 4) * (0-(-8)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Anchiornis, Anchiornis.rotateAngleX + (float) Math.toRadians(xx) + (float) Math.toRadians(90), Anchiornis.rotateAngleY + (float) Math.toRadians(yy), Anchiornis.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 4.3 + (((tickAnim - 0) / 12) * (5-(4.3)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 12) / 4) * (4.3-(5)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 4.3 + (((tickAnim - 16) / 9) * (5-(4.3)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 25) / 4) * (4.3-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Anchiornis.rotationPointX = this.Anchiornis.rotationPointX + (float)(xx);
        this.Anchiornis.rotationPointY = this.Anchiornis.rotationPointY - (float)(yy);
        this.Anchiornis.rotationPointZ = this.Anchiornis.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -27 + (((tickAnim - 0) / 5) * (-8.93357-(-27)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.34989-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.23788-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8.93357 + (((tickAnim - 5) / 3) * (3.10381-(-8.93357)));
            yy = -2.34989 + (((tickAnim - 5) / 3) * (-2.93648-(-2.34989)));
            zz = -3.23788 + (((tickAnim - 5) / 3) * (-4.04863-(-3.23788)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.10381 + (((tickAnim - 8) / 2) * (32.84954-(3.10381)));
            yy = -2.93648 + (((tickAnim - 8) / 2) * (-3.52249-(-2.93648)));
            zz = -4.04863 + (((tickAnim - 8) / 2) * (-4.86023-(-4.04863)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 32.84954 + (((tickAnim - 10) / 2) * (12.94954-(32.84954)));
            yy = -3.52249 + (((tickAnim - 10) / 2) * (-3.52249-(-3.52249)));
            zz = -4.86023 + (((tickAnim - 10) / 2) * (-4.86023-(-4.86023)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 12.94954 + (((tickAnim - 12) / 1) * (-26.1-(12.94954)));
            yy = -3.52249 + (((tickAnim - 12) / 1) * (0-(-3.52249)));
            zz = -4.86023 + (((tickAnim - 12) / 1) * (0-(-4.86023)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -26.1 + (((tickAnim - 13) / 2) * (-39-(-26.1)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -39 + (((tickAnim - 15) / 7) * (-32.14933-(-39)));
            yy = 0 + (((tickAnim - 15) / 7) * (4.10779-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (5.67285-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -32.14933 + (((tickAnim - 22) / 3) * (-29.51641-(-32.14933)));
            yy = 4.10779 + (((tickAnim - 22) / 3) * (5.791-(4.10779)));
            zz = 5.67285 + (((tickAnim - 22) / 3) * (8.03147-(5.67285)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -29.51641 + (((tickAnim - 25) / 4) * (-27-(-29.51641)));
            yy = 5.791 + (((tickAnim - 25) / 4) * (0-(5.791)));
            zz = 8.03147 + (((tickAnim - 25) / 4) * (0-(8.03147)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 27 + (((tickAnim - 0) / 5) * (13.8-(27)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 13.8 + (((tickAnim - 5) / 3) * (5-(13.8)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 8) / 2) * (-28-(5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -28 + (((tickAnim - 10) / 2) * (6.66667-(-28)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 6.66667 + (((tickAnim - 12) / 1) * (43.33333-(6.66667)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 43.33333 + (((tickAnim - 13) / 2) * (36-(43.33333)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 36 + (((tickAnim - 15) / 7) * (28.76471-(36)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 28.76471 + (((tickAnim - 22) / 3) * (23.98039-(28.76471)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 23.98039 + (((tickAnim - 25) / 4) * (27-(23.98039)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 0) / 5) * (0.5-(7.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.5 + (((tickAnim - 5) / 3) * (2.5-(0.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 8) / 2) * (-28-(2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -28 + (((tickAnim - 10) / 2) * (2.66667-(-28)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 2.66667 + (((tickAnim - 12) / 1) * (-30.16667-(2.66667)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -30.16667 + (((tickAnim - 13) / 2) * (-17-(-30.16667)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -17 + (((tickAnim - 15) / 7) * (-10.47059-(-17)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -10.47059 + (((tickAnim - 22) / 3) * (-3.48366-(-10.47059)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -3.48366 + (((tickAnim - 25) / 4) * (7.5-(-3.48366)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -40 + (((tickAnim - 0) / 5) * (-39-(-40)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -39 + (((tickAnim - 5) / 3) * (-45-(-39)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -45 + (((tickAnim - 8) / 2) * (-10-(-45)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -10 + (((tickAnim - 10) / 2) * (10.66667-(-10)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 10.66667 + (((tickAnim - 12) / 1) * (-24.16667-(10.66667)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -24.16667 + (((tickAnim - 13) / 2) * (-9-(-24.16667)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -9 + (((tickAnim - 15) / 3) * (-18.29412-(-9)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -18.29412 + (((tickAnim - 18) / 4) * (-19.58824-(-18.29412)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -19.58824 + (((tickAnim - 22) / 3) * (-26.66013-(-19.58824)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -26.66013 + (((tickAnim - 25) / 4) * (-40-(-26.66013)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -39 + (((tickAnim - 0) / 11) * (-12.93128-(-39)));
            yy = 0 + (((tickAnim - 0) / 11) * (-2.93648-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-4.04863-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.93128 + (((tickAnim - 11) / 2) * (-9.4252-(-12.93128)));
            yy = -2.93648 + (((tickAnim - 11) / 2) * (-2.05549-(-2.93648)));
            zz = -4.04863 + (((tickAnim - 11) / 2) * (-2.83411-(-4.04863)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -9.4252 + (((tickAnim - 13) / 1) * (-5.96897-(-9.4252)));
            yy = -2.05549 + (((tickAnim - 13) / 1) * (0-(-2.05549)));
            zz = -2.83411 + (((tickAnim - 13) / 1) * (0-(-2.83411)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -5.96897 + (((tickAnim - 14) / 4) * (12.95805-(-5.96897)));
            yy = 0 + (((tickAnim - 14) / 4) * (1.76283-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (2.42782-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 12.95805 + (((tickAnim - 18) / 5) * (30.31115-(12.95805)));
            yy = 1.76283 + (((tickAnim - 18) / 5) * (2.56986-(1.76283)));
            zz = 2.42782 + (((tickAnim - 18) / 5) * (3.54192-(2.42782)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 30.31115 + (((tickAnim - 23) / 1) * (32.7-(30.31115)));
            yy = 2.56986 + (((tickAnim - 23) / 1) * (0-(2.56986)));
            zz = 3.54192 + (((tickAnim - 23) / 1) * (0-(3.54192)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 32.7 + (((tickAnim - 24) / 2) * (12.8-(32.7)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 12.8 + (((tickAnim - 26) / 2) * (-26.1-(12.8)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -26.1 + (((tickAnim - 28) / 1) * (-39-(-26.1)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 36 + (((tickAnim - 0) / 11) * (16.50101-(36)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 16.50101 + (((tickAnim - 11) / 3) * (13.65517-(16.50101)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 13.65517 + (((tickAnim - 14) / 2) * (8.79598-(13.65517)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 8.79598 + (((tickAnim - 16) / 2) * (-2.06322-(8.79598)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -2.06322 + (((tickAnim - 18) / 3) * (-11.78161-(-2.06322)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -11.78161 + (((tickAnim - 21) / 3) * (-26-(-11.78161)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -26 + (((tickAnim - 24) / 2) * (6.66667-(-26)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 6.66667 + (((tickAnim - 26) / 2) * (43.33333-(6.66667)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 43.33333 + (((tickAnim - 28) / 1) * (36-(43.33333)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -17 + (((tickAnim - 0) / 11) * (-28.51927-(-17)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -28.51927 + (((tickAnim - 11) / 3) * (-31.44828-(-28.51927)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -31.44828 + (((tickAnim - 14) / 2) * (-35.4569-(-31.44828)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -35.4569 + (((tickAnim - 16) / 2) * (-33.46552-(-35.4569)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -33.46552 + (((tickAnim - 18) / 3) * (-29.48276-(-33.46552)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -29.48276 + (((tickAnim - 21) / 3) * (-28-(-29.48276)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -28 + (((tickAnim - 24) / 2) * (2.66667-(-28)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 2.66667 + (((tickAnim - 26) / 2) * (-30.16667-(2.66667)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -30.16667 + (((tickAnim - 28) / 1) * (-17-(-30.16667)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -9 + (((tickAnim - 0) / 11) * (-10.11562-(-9)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -10.11562 + (((tickAnim - 11) / 3) * (-9.68966-(-10.11562)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -9.68966 + (((tickAnim - 14) / 7) * (-10.56322-(-9.68966)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -10.56322 + (((tickAnim - 21) / 3) * (-17-(-10.56322)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -17 + (((tickAnim - 24) / 2) * (10.66667-(-17)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 10.66667 + (((tickAnim - 26) / 2) * (-24.16667-(10.66667)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -24.16667 + (((tickAnim - 28) / 1) * (-9-(-24.16667)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.4583+50))*-6), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.4583+20))*-3), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.4583-10))*-1), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.14979 + (((tickAnim - 0) / 13) * (-0.14979-(-0.14979)));
            yy = -4.85103 + (((tickAnim - 0) / 13) * (4.85103-(-4.85103)));
            zz = 3.53517 + (((tickAnim - 0) / 13) * (-3.53517-(3.53517)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = -0.14979 + (((tickAnim - 13) / 16) * (-0.14979-(-0.14979)));
            yy = 4.85103 + (((tickAnim - 13) / 16) * (-4.85103-(4.85103)));
            zz = -3.53517 + (((tickAnim - 13) / 16) * (3.53517-(-3.53517)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.25649 + (((tickAnim - 0) / 4) * (0.26629-(-0.25649)));
            yy = -7.47138 + (((tickAnim - 0) / 4) * (-6.61092-(-7.47138)));
            zz = 5.13027 + (((tickAnim - 0) / 4) * (-5.70811-(5.13027)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0.26629 + (((tickAnim - 4) / 6) * (1.16533-(0.26629)));
            yy = -6.61092 + (((tickAnim - 4) / 6) * (-2.98358-(-6.61092)));
            zz = -5.70811 + (((tickAnim - 4) / 6) * (-7.91832-(-5.70811)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 1.16533 + (((tickAnim - 10) / 12) * (0.22743-(1.16533)));
            yy = -2.98358 + (((tickAnim - 10) / 12) * (-0.72841-(-2.98358)));
            zz = -7.91832 + (((tickAnim - 10) / 12) * (4.38736-(-7.91832)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0.22743 + (((tickAnim - 22) / 7) * (-0.25649-(0.22743)));
            yy = -0.72841 + (((tickAnim - 22) / 7) * (-7.47138-(-0.72841)));
            zz = 4.38736 + (((tickAnim - 22) / 7) * (5.13027-(4.38736)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -73.20703 + (((tickAnim - 0) / 2) * (-59.20458-(-73.20703)));
            yy = 1.36756 + (((tickAnim - 0) / 2) * (-26.03517-(1.36756)));
            zz = -46.32282 + (((tickAnim - 0) / 2) * (-77.48479-(-46.32282)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -59.20458 + (((tickAnim - 2) / 1) * (-87.33329-(-59.20458)));
            yy = -26.03517 + (((tickAnim - 2) / 1) * (-40.41021-(-26.03517)));
            zz = -77.48479 + (((tickAnim - 2) / 1) * (-104.54385-(-77.48479)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -87.33329 + (((tickAnim - 3) / 3) * (-96.38366-(-87.33329)));
            yy = -40.41021 + (((tickAnim - 3) / 3) * (-42.13059-(-40.41021)));
            zz = -104.54385 + (((tickAnim - 3) / 3) * (-106.60113-(-104.54385)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -96.38366 + (((tickAnim - 6) / 2) * (-117.88369-(-96.38366)));
            yy = -42.13059 + (((tickAnim - 6) / 2) * (-44.21146-(-42.13059)));
            zz = -106.60113 + (((tickAnim - 6) / 2) * (-78.76371-(-106.60113)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -117.88369 + (((tickAnim - 8) / 2) * (-106.51731-(-117.88369)));
            yy = -44.21146 + (((tickAnim - 8) / 2) * (-44.89604-(-44.21146)));
            zz = -78.76371 + (((tickAnim - 8) / 2) * (-87.68744-(-78.76371)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -106.51731 + (((tickAnim - 10) / 5) * (-82.14794-(-106.51731)));
            yy = -44.89604 + (((tickAnim - 10) / 5) * (-27.43752-(-44.89604)));
            zz = -87.68744 + (((tickAnim - 10) / 5) * (-91.06033-(-87.68744)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -82.14794 + (((tickAnim - 15) / 8) * (-71.69574-(-82.14794)));
            yy = -27.43752 + (((tickAnim - 15) / 8) * (-16.01643-(-27.43752)));
            zz = -91.06033 + (((tickAnim - 15) / 8) * (-80.27194-(-91.06033)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -71.69574 + (((tickAnim - 23) / 6) * (-73.20703-(-71.69574)));
            yy = -16.01643 + (((tickAnim - 23) / 6) * (1.36756-(-16.01643)));
            zz = -80.27194 + (((tickAnim - 23) / 6) * (-46.32282-(-80.27194)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 77.8313 + (((tickAnim - 0) / 2) * (66.03317-(77.8313)));
            yy = -3.26022 + (((tickAnim - 0) / 2) * (-2.26375-(-3.26022)));
            zz = -13.306 + (((tickAnim - 0) / 2) * (-6.63021-(-13.306)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 66.03317 + (((tickAnim - 2) / 1) * (78.61975-(66.03317)));
            yy = -2.26375 + (((tickAnim - 2) / 1) * (-2.5574-(-2.26375)));
            zz = -6.63021 + (((tickAnim - 2) / 1) * (-1.67554-(-6.63021)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 78.61975 + (((tickAnim - 3) / 3) * (98.25836-(78.61975)));
            yy = -2.5574 + (((tickAnim - 3) / 3) * (-0.04172-(-2.5574)));
            zz = -1.67554 + (((tickAnim - 3) / 3) * (-0.38613-(-1.67554)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 98.25836 + (((tickAnim - 6) / 2) * (97.5362-(98.25836)));
            yy = -0.04172 + (((tickAnim - 6) / 2) * (-18.66952-(-0.04172)));
            zz = -0.38613 + (((tickAnim - 6) / 2) * (39.77521-(-0.38613)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 97.5362 + (((tickAnim - 8) / 2) * (92.48828-(97.5362)));
            yy = -18.66952 + (((tickAnim - 8) / 2) * (-15.37279-(-18.66952)));
            zz = 39.77521 + (((tickAnim - 8) / 2) * (37.1931-(39.77521)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 92.48828 + (((tickAnim - 10) / 5) * (78.23135-(92.48828)));
            yy = -15.37279 + (((tickAnim - 10) / 5) * (-23.3246-(-15.37279)));
            zz = 37.1931 + (((tickAnim - 10) / 5) * (39.00473-(37.1931)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 78.23135 + (((tickAnim - 15) / 8) * (70.96934-(78.23135)));
            yy = -23.3246 + (((tickAnim - 15) / 8) * (-25.13398-(-23.3246)));
            zz = 39.00473 + (((tickAnim - 15) / 8) * (33.88395-(39.00473)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 70.96934 + (((tickAnim - 23) / 6) * (77.8313-(70.96934)));
            yy = -25.13398 + (((tickAnim - 23) / 6) * (-3.26022-(-25.13398)));
            zz = 33.88395 + (((tickAnim - 23) / 6) * (-13.306-(33.88395)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -79.10629 + (((tickAnim - 0) / 2) * (-67.81045-(-79.10629)));
            yy = 36.71576 + (((tickAnim - 0) / 2) * (27.82809-(36.71576)));
            zz = -50.24203 + (((tickAnim - 0) / 2) * (-22.57266-(-50.24203)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -67.81045 + (((tickAnim - 2) / 1) * (-78.15337-(-67.81045)));
            yy = 27.82809 + (((tickAnim - 2) / 1) * (14.27425-(27.82809)));
            zz = -22.57266 + (((tickAnim - 2) / 1) * (-34.85308-(-22.57266)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -78.15337 + (((tickAnim - 3) / 3) * (-76.71609-(-78.15337)));
            yy = 14.27425 + (((tickAnim - 3) / 3) * (11.29208-(14.27425)));
            zz = -34.85308 + (((tickAnim - 3) / 3) * (-19.45681-(-34.85308)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -76.71609 + (((tickAnim - 6) / 2) * (-77.59678-(-76.71609)));
            yy = 11.29208 + (((tickAnim - 6) / 2) * (14.86158-(11.29208)));
            zz = -19.45681 + (((tickAnim - 6) / 2) * (-53.93793-(-19.45681)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -77.59678 + (((tickAnim - 8) / 2) * (-52.16458-(-77.59678)));
            yy = 14.86158 + (((tickAnim - 8) / 2) * (10.84193-(14.86158)));
            zz = -53.93793 + (((tickAnim - 8) / 2) * (-33.70731-(-53.93793)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -52.16458 + (((tickAnim - 10) / 5) * (-78.73384-(-52.16458)));
            yy = 10.84193 + (((tickAnim - 10) / 5) * (9.48942-(10.84193)));
            zz = -33.70731 + (((tickAnim - 10) / 5) * (-51.77285-(-33.70731)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -78.73384 + (((tickAnim - 15) / 8) * (-79.20869-(-78.73384)));
            yy = 9.48942 + (((tickAnim - 15) / 8) * (37.96619-(9.48942)));
            zz = -51.77285 + (((tickAnim - 15) / 8) * (-56.5739-(-51.77285)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -79.20869 + (((tickAnim - 23) / 6) * (-79.10629-(-79.20869)));
            yy = 37.96619 + (((tickAnim - 23) / 6) * (36.71576-(37.96619)));
            zz = -56.5739 + (((tickAnim - 23) / 6) * (-50.24203-(-56.5739)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -106.78796 + (((tickAnim - 0) / 4) * (-88.4112-(-106.78796)));
            yy = 45.28054 + (((tickAnim - 0) / 4) * (36.47661-(45.28054)));
            zz = 85.4003 + (((tickAnim - 0) / 4) * (101.52125-(85.4003)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -88.4112 + (((tickAnim - 4) / 6) * (-78.41227-(-88.4112)));
            yy = 36.47661 + (((tickAnim - 4) / 6) * (25.19661-(36.47661)));
            zz = 101.52125 + (((tickAnim - 4) / 6) * (93.10717-(101.52125)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -78.41227 + (((tickAnim - 10) / 8) * (-70.84869-(-78.41227)));
            yy = 25.19661 + (((tickAnim - 10) / 8) * (0.44707-(25.19661)));
            zz = 93.10717 + (((tickAnim - 10) / 8) * (50.71812-(93.10717)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -70.84869 + (((tickAnim - 18) / 1) * (-59.20458-(-70.84869)));
            yy = 0.44707 + (((tickAnim - 18) / 1) * (26.03517-(0.44707)));
            zz = 50.71812 + (((tickAnim - 18) / 1) * (77.48479-(50.71812)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -59.20458 + (((tickAnim - 19) / 2) * (-87.33329-(-59.20458)));
            yy = 26.03517 + (((tickAnim - 19) / 2) * (40.41021-(26.03517)));
            zz = 77.48479 + (((tickAnim - 19) / 2) * (104.54385-(77.48479)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -87.33329 + (((tickAnim - 21) / 2) * (-96.38366-(-87.33329)));
            yy = 40.41021 + (((tickAnim - 21) / 2) * (42.13059-(40.41021)));
            zz = 104.54385 + (((tickAnim - 21) / 2) * (106.60113-(104.54385)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -96.38366 + (((tickAnim - 23) / 3) * (-110.84888-(-96.38366)));
            yy = 42.13059 + (((tickAnim - 23) / 3) * (44.5393-(42.13059)));
            zz = 106.60113 + (((tickAnim - 23) / 3) * (90.35357-(106.60113)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -110.84888 + (((tickAnim - 26) / 3) * (-106.78796-(-110.84888)));
            yy = 44.5393 + (((tickAnim - 26) / 3) * (45.28054-(44.5393)));
            zz = 90.35357 + (((tickAnim - 26) / 3) * (85.4003-(90.35357)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 92.69286 + (((tickAnim - 0) / 4) * (77.33828-(92.69286)));
            yy = 13.64168 + (((tickAnim - 0) / 4) * (12.43374-(13.64168)));
            zz = -41.89237 + (((tickAnim - 0) / 4) * (-51.8438-(-41.89237)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 77.33828 + (((tickAnim - 4) / 6) * (74.43012-(77.33828)));
            yy = 12.43374 + (((tickAnim - 4) / 6) * (-14.06238-(12.43374)));
            zz = -51.8438 + (((tickAnim - 4) / 6) * (-63.3464-(-51.8438)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 74.43012 + (((tickAnim - 10) / 4) * (66.67644-(74.43012)));
            yy = -14.06238 + (((tickAnim - 10) / 4) * (-1.87314-(-14.06238)));
            zz = -63.3464 + (((tickAnim - 10) / 4) * (-34.21042-(-63.3464)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 66.67644 + (((tickAnim - 14) / 4) * (77.8313-(66.67644)));
            yy = -1.87314 + (((tickAnim - 14) / 4) * (3.26022-(-1.87314)));
            zz = -34.21042 + (((tickAnim - 14) / 4) * (13.306-(-34.21042)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 77.8313 + (((tickAnim - 18) / 1) * (66.03317-(77.8313)));
            yy = 3.26022 + (((tickAnim - 18) / 1) * (2.26375-(3.26022)));
            zz = 13.306 + (((tickAnim - 18) / 1) * (6.63021-(13.306)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 66.03317 + (((tickAnim - 19) / 2) * (78.61975-(66.03317)));
            yy = 2.26375 + (((tickAnim - 19) / 2) * (2.5574-(2.26375)));
            zz = 6.63021 + (((tickAnim - 19) / 2) * (1.67554-(6.63021)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 78.61975 + (((tickAnim - 21) / 2) * (98.25836-(78.61975)));
            yy = 2.5574 + (((tickAnim - 21) / 2) * (0.04172-(2.5574)));
            zz = 1.67554 + (((tickAnim - 21) / 2) * (0.38613-(1.67554)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 98.25836 + (((tickAnim - 23) / 3) * (98.76034-(98.25836)));
            yy = 0.04172 + (((tickAnim - 23) / 3) * (17.24907-(0.04172)));
            zz = 0.38613 + (((tickAnim - 23) / 3) * (-40.13331-(0.38613)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 98.76034 + (((tickAnim - 26) / 3) * (92.69286-(98.76034)));
            yy = 17.24907 + (((tickAnim - 26) / 3) * (13.64168-(17.24907)));
            zz = -40.13331 + (((tickAnim - 26) / 3) * (-41.89237-(-40.13331)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -71.58539 + (((tickAnim - 0) / 4) * (-67.14443-(-71.58539)));
            yy = -18.33057 + (((tickAnim - 0) / 4) * (-11.08586-(-18.33057)));
            zz = 47.51165 + (((tickAnim - 0) / 4) * (56.33668-(47.51165)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -67.14443 + (((tickAnim - 4) / 6) * (-58.84123-(-67.14443)));
            yy = -11.08586 + (((tickAnim - 4) / 6) * (4.47556-(-11.08586)));
            zz = 56.33668 + (((tickAnim - 4) / 6) * (76.65812-(56.33668)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -58.84123 + (((tickAnim - 10) / 4) * (-71.63566-(-58.84123)));
            yy = 4.47556 + (((tickAnim - 10) / 4) * (-20.54094-(4.47556)));
            zz = 76.65812 + (((tickAnim - 10) / 4) * (71.86212-(76.65812)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -71.63566 + (((tickAnim - 14) / 4) * (-75.14589-(-71.63566)));
            yy = -20.54094 + (((tickAnim - 14) / 4) * (-44.22836-(-20.54094)));
            zz = 71.86212 + (((tickAnim - 14) / 4) * (42.16908-(71.86212)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -75.14589 + (((tickAnim - 18) / 1) * (-66.17023-(-75.14589)));
            yy = -44.22836 + (((tickAnim - 18) / 1) * (-1.05803-(-44.22836)));
            zz = 42.16908 + (((tickAnim - 18) / 1) * (16.41066-(42.16908)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -66.17023 + (((tickAnim - 19) / 2) * (-79.52876-(-66.17023)));
            yy = -1.05803 + (((tickAnim - 19) / 2) * (-0.62092-(-1.05803)));
            zz = 16.41066 + (((tickAnim - 19) / 2) * (24.66032-(16.41066)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -79.52876 + (((tickAnim - 21) / 2) * (-98.66611-(-79.52876)));
            yy = -0.62092 + (((tickAnim - 21) / 2) * (0.90202-(-0.62092)));
            zz = 24.66032 + (((tickAnim - 21) / 2) * (22.07991-(24.66032)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -98.66611 + (((tickAnim - 23) / 3) * (-82.47563-(-98.66611)));
            yy = 0.90202 + (((tickAnim - 23) / 3) * (-13.42551-(0.90202)));
            zz = 22.07991 + (((tickAnim - 23) / 3) * (54.38366-(22.07991)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -82.47563 + (((tickAnim - 26) / 3) * (-71.58539-(-82.47563)));
            yy = -13.42551 + (((tickAnim - 26) / 3) * (-18.33057-(-13.42551)));
            zz = 54.38366 + (((tickAnim - 26) / 3) * (47.51165-(54.38366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -1.11782 + (((tickAnim - 0) / 6) * (-0.14089-(-1.11782)));
            yy = 5.48637 + (((tickAnim - 0) / 6) * (-1.51762-(5.48637)));
            zz = -7.71399 + (((tickAnim - 0) / 6) * (-7.03051-(-7.71399)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.14089 + (((tickAnim - 6) / 2) * (0.58657-(-0.14089)));
            yy = -1.51762 + (((tickAnim - 6) / 2) * (-4.6003-(-1.51762)));
            zz = -7.03051 + (((tickAnim - 6) / 2) * (-6.91381-(-7.03051)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.58657 + (((tickAnim - 8) / 5) * (0.76813-(0.58657)));
            yy = -4.6003 + (((tickAnim - 8) / 5) * (-3.78303-(-4.6003)));
            zz = -6.91381 + (((tickAnim - 8) / 5) * (3.07277-(-6.91381)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.76813 + (((tickAnim - 13) / 4) * (-1.87697-(0.76813)));
            yy = -3.78303 + (((tickAnim - 13) / 4) * (-3.39417-(-3.78303)));
            zz = 3.07277 + (((tickAnim - 13) / 4) * (-1.93965-(3.07277)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -1.87697 + (((tickAnim - 17) / 3) * (-0.40334-(-1.87697)));
            yy = -3.39417 + (((tickAnim - 17) / 3) * (-3.8642-(-3.39417)));
            zz = -1.93965 + (((tickAnim - 17) / 3) * (-8.74937-(-1.93965)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -0.40334 + (((tickAnim - 20) / 3) * (-0.01436-(-0.40334)));
            yy = -3.8642 + (((tickAnim - 20) / 3) * (5.42616-(-3.8642)));
            zz = -8.74937 + (((tickAnim - 20) / 3) * (-0.28595-(-8.74937)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -0.01436 + (((tickAnim - 23) / 6) * (-1.11782-(-0.01436)));
            yy = 5.42616 + (((tickAnim - 23) / 6) * (5.48637-(5.42616)));
            zz = -0.28595 + (((tickAnim - 23) / 6) * (-7.71399-(-0.28595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -0.20532 + (((tickAnim - 0) / 6) * (0.20508-(-0.20532)));
            yy = 2.49243 + (((tickAnim - 0) / 6) * (0.83095-(2.49243)));
            zz = -1.66161 + (((tickAnim - 0) / 6) * (7.94569-(-1.66161)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.20508 + (((tickAnim - 6) / 3) * (0.18044-(0.20508)));
            yy = 0.83095 + (((tickAnim - 6) / 3) * (2.93974-(0.83095)));
            zz = 7.94569 + (((tickAnim - 6) / 3) * (8.83376-(7.94569)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.18044 + (((tickAnim - 9) / 4) * (0.15339-(0.18044)));
            yy = 2.93974 + (((tickAnim - 9) / 4) * (-0.75909-(2.93974)));
            zz = 8.83376 + (((tickAnim - 9) / 4) * (0.6461-(8.83376)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0.15339 + (((tickAnim - 13) / 5) * (0.07234-(0.15339)));
            yy = -0.75909 + (((tickAnim - 13) / 5) * (0.13278-(-0.75909)));
            zz = 0.6461 + (((tickAnim - 13) / 5) * (-0.10869-(0.6461)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.07234 + (((tickAnim - 18) / 2) * (0.06944-(0.07234)));
            yy = 0.13278 + (((tickAnim - 18) / 2) * (1.58139-(0.13278)));
            zz = -0.10869 + (((tickAnim - 18) / 2) * (1.2664-(-0.10869)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.06944 + (((tickAnim - 20) / 3) * (0.35832-(0.06944)));
            yy = 1.58139 + (((tickAnim - 20) / 3) * (-5.48766-(1.58139)));
            zz = 1.2664 + (((tickAnim - 20) / 3) * (-10.97214-(1.2664)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0.35832 + (((tickAnim - 23) / 6) * (-0.20532-(0.35832)));
            yy = -5.48766 + (((tickAnim - 23) / 6) * (2.49243-(-5.48766)));
            zz = -10.97214 + (((tickAnim - 23) / 6) * (-1.66161-(-10.97214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Anchiornis, Anchiornis.rotateAngleX + (float) Math.toRadians(0), Anchiornis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*2), Anchiornis.rotateAngleZ + (float) Math.toRadians(0));

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
        this.Anchiornis.rotationPointX = this.Anchiornis.rotationPointX + (float)(xx);
        this.Anchiornis.rotationPointY = this.Anchiornis.rotationPointY - (float)(yy);
        this.Anchiornis.rotationPointZ = this.Anchiornis.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.94 + (((tickAnim - 0) / 1) * (-2.5-(-1.94)));
            yy = 2.22 + (((tickAnim - 0) / 1) * (2.5-(2.22)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 1) / 7) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 1) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 1) / 7) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 8) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -2.5 + (((tickAnim - 16) / 7) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 16) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 23) / 7) * (-1.94-(2.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (2.22-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.94 + (((tickAnim - 0) / 3) * (-2.5-(-1.94)));
            yy = 2.22 + (((tickAnim - 0) / 3) * (2.5-(2.22)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 3) / 7) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 3) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 10) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -2.5 + (((tickAnim - 18) / 7) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 18) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 25) / 5) * (-1.94-(2.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (2.22-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1.94 + (((tickAnim - 0) / 4) * (-2.5-(-1.94)));
            yy = 2.22 + (((tickAnim - 0) / 4) * (2.5-(2.22)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -2.5 + (((tickAnim - 4) / 8) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 4) / 8) * (0-(2.5)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 2.5 + (((tickAnim - 12) / 7) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 12) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -2.5 + (((tickAnim - 19) / 8) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 19) / 8) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 27) / 3) * (-1.94-(2.5)));
            yy = 0 + (((tickAnim - 27) / 3) * (2.22-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-15))*-5), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));


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



        this.Feathers.setScale((float)1,(float)0,(float)0);


        this.Feathers2.setScale((float)1,(float)0,(float)1);


        this.setRotateAngle(FeatherR, FeatherR.rotateAngleX + (float) Math.toRadians(-47.96016), FeatherR.rotateAngleY + (float) Math.toRadians(-34.8975), FeatherR.rotateAngleZ + (float) Math.toRadians(83.0443));


        this.setRotateAngle(FeatherL, FeatherL.rotateAngleX + (float) Math.toRadians(-47.96016), FeatherL.rotateAngleY + (float) Math.toRadians(34.89746), FeatherL.rotateAngleZ + (float) Math.toRadians(-83.04429));


        this.setRotateAngle(FeatherR2, FeatherR2.rotateAngleX + (float) Math.toRadians(-5), FeatherR2.rotateAngleY + (float) Math.toRadians(-35), FeatherR2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(FeatherL2, FeatherL2.rotateAngleX + (float) Math.toRadians(-5), FeatherL2.rotateAngleY + (float) Math.toRadians(35), FeatherL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(-6.76562), UpperArmL.rotateAngleY + (float) Math.toRadians(6.0057), UpperArmL.rotateAngleZ + (float) Math.toRadians(-14.1287));


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(-6.76562), UpperArmR.rotateAngleY + (float) Math.toRadians(-6.00566), UpperArmR.rotateAngleZ + (float) Math.toRadians(14.1287));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.52 + (((tickAnim - 0) / 3) * (6-(8.52)));
            yy = -0.28 + (((tickAnim - 0) / 3) * (-2.5-(-0.28)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6 + (((tickAnim - 3) / 2) * (8.5-(6)));
            yy = -2.5 + (((tickAnim - 3) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8.5 + (((tickAnim - 5) / 3) * (6-(8.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6 + (((tickAnim - 8) / 2) * (8.52-(6)));
            yy = 2.5 + (((tickAnim - 8) / 2) * (-0.28-(2.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -3.11 + (((tickAnim - 0) / 1) * (-2-(-3.11)));
            yy = -1.39 + (((tickAnim - 0) / 1) * (-2.5-(-1.39)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -2 + (((tickAnim - 1) / 2) * (-4.5-(-2)));
            yy = -2.5 + (((tickAnim - 1) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -4.5 + (((tickAnim - 3) / 3) * (-2-(-4.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -2 + (((tickAnim - 6) / 3) * (-4.5-(-2)));
            yy = 2.5 + (((tickAnim - 6) / 3) * (0-(2.5)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -4.5 + (((tickAnim - 9) / 1) * (-3.11-(-4.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (-1.39-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.56 + (((tickAnim - 0) / 1) * (0-(-0.56)));
            yy = -1.94 + (((tickAnim - 0) / 1) * (-2.5-(-1.94)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (-2.5-(0)));
            yy = -2.5 + (((tickAnim - 1) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -2.5 + (((tickAnim - 3) / 3) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-2.5-(0)));
            yy = 2.5 + (((tickAnim - 6) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (-0.56-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-1.94-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 0) / 3) * (3-(2)));
            yy = 5 + (((tickAnim - 0) / 3) * (-1.66667-(5)));
            zz = 0.00001 + (((tickAnim - 0) / 3) * (2.50001-(0.00001)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 3) / 2) * (2-(3)));
            yy = -1.66667 + (((tickAnim - 3) / 2) * (-5-(-1.66667)));
            zz = 2.50001 + (((tickAnim - 3) / 2) * (0.00002-(2.50001)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2 + (((tickAnim - 5) / 3) * (3-(2)));
            yy = -5 + (((tickAnim - 5) / 3) * (1.66667-(-5)));
            zz = 0.00002 + (((tickAnim - 5) / 3) * (-2.49999-(0.00002)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3 + (((tickAnim - 8) / 2) * (2-(3)));
            yy = 1.66667 + (((tickAnim - 8) / 2) * (5-(1.66667)));
            zz = -2.49999 + (((tickAnim - 8) / 2) * (0.00001-(-2.49999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Anchiornis, Anchiornis.rotateAngleX + (float) Math.toRadians(xx), Anchiornis.rotateAngleY + (float) Math.toRadians(yy), Anchiornis.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -2 + (((tickAnim - 0) / 3) * (-1.5-(-2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -1.5 + (((tickAnim - 3) / 1) * (-2.5-(-1.5)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -2.5 + (((tickAnim - 4) / 1) * (-1.69-(-2.5)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -1.69 + (((tickAnim - 5) / 3) * (-1.5-(-1.69)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -1.5 + (((tickAnim - 8) / 1) * (-2.5-(-1.5)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -2.5 + (((tickAnim - 9) / 1) * (-2-(-2.5)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Anchiornis.rotationPointX = this.Anchiornis.rotationPointX + (float)(xx);
        this.Anchiornis.rotationPointY = this.Anchiornis.rotationPointY - (float)(yy);
        this.Anchiornis.rotationPointZ = this.Anchiornis.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.25118 + (((tickAnim - 0) / 3) * (-35-(29.25118)));
            yy = 9.57892 + (((tickAnim - 0) / 3) * (0-(9.57892)));
            zz = 10.40372 + (((tickAnim - 0) / 3) * (0-(10.40372)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -35 + (((tickAnim - 3) / 2) * (-30.21675-(-35)));
            yy = 0 + (((tickAnim - 3) / 2) * (8.48916-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-5.86282-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -30.21675 + (((tickAnim - 5) / 3) * (-9.31466-(-30.21675)));
            yy = 8.48916 + (((tickAnim - 5) / 3) * (12.47443-(8.48916)));
            zz = -5.86282 + (((tickAnim - 5) / 3) * (0.25839-(-5.86282)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9.31466 + (((tickAnim - 8) / 2) * (29.25118-(-9.31466)));
            yy = 12.47443 + (((tickAnim - 8) / 2) * (9.57892-(12.47443)));
            zz = 0.25839 + (((tickAnim - 8) / 2) * (10.40372-(0.25839)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 36.25 + (((tickAnim - 0) / 3) * (60-(36.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 60 + (((tickAnim - 3) / 1) * (-5.83-(60)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -5.83 + (((tickAnim - 4) / 1) * (-23.75-(-5.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -23.75 + (((tickAnim - 5) / 1) * (-1.67-(-23.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.67 + (((tickAnim - 6) / 1) * (14.16-(-1.67)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 14.16 + (((tickAnim - 7) / 1) * (20-(14.16)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 8) / 2) * (36.25-(20)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(FeatherR2, FeatherR2.rotateAngleX + (float) Math.toRadians(-5), FeatherR2.rotateAngleY + (float) Math.toRadians(-35), FeatherR2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15.04725 + (((tickAnim - 0) / 2) * (21.68-(15.04725)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 21.68 + (((tickAnim - 2) / 1) * (-42.5-(21.68)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -42.5 + (((tickAnim - 3) / 0) * (-34.15-(-42.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -34.15 + (((tickAnim - 3) / 2) * (12.54725-(-34.15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 12.54725 + (((tickAnim - 5) / 1) * (-23.27033-(12.54725)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -23.27033 + (((tickAnim - 6) / 1) * (-25.34-(-23.27033)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -25.34 + (((tickAnim - 7) / 1) * (2.5945-(-25.34)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5945 + (((tickAnim - 8) / 1) * (33.4-(2.5945)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 33.4 + (((tickAnim - 9) / 1) * (15.04725-(33.4)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(FeatherR, FeatherR.rotateAngleX + (float) Math.toRadians(-47.96016), FeatherR.rotateAngleY + (float) Math.toRadians(-34.8975), FeatherR.rotateAngleZ + (float) Math.toRadians(83.0443));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.25 + (((tickAnim - 0) / 3) * (110-(46.25)));
            yy = -0.02 + (((tickAnim - 0) / 3) * (0-(-0.02)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (0-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 110 + (((tickAnim - 3) / 1) * (44.10141-(110)));
            yy = 0 + (((tickAnim - 3) / 1) * (-2.84805-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.09067-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 44.10141 + (((tickAnim - 4) / 1) * (38.52094-(44.10141)));
            yy = -2.84805 + (((tickAnim - 4) / 1) * (-6.33463-(-2.84805)));
            zz = 0.09067 + (((tickAnim - 4) / 1) * (1.55491-(0.09067)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 38.52094 + (((tickAnim - 5) / 1) * (44.85373-(38.52094)));
            yy = -6.33463 + (((tickAnim - 5) / 1) * (-5.06786-(-6.33463)));
            zz = 1.55491 + (((tickAnim - 5) / 1) * (-0.39544-(1.55491)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 44.85373 + (((tickAnim - 6) / 1) * (23.51421-(44.85373)));
            yy = -5.06786 + (((tickAnim - 6) / 1) * (-4.70923-(-5.06786)));
            zz = -0.39544 + (((tickAnim - 6) / 1) * (0.51254-(-0.39544)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 23.51421 + (((tickAnim - 7) / 1) * (-17.5-(23.51421)));
            yy = -4.70923 + (((tickAnim - 7) / 1) * (0-(-4.70923)));
            zz = 0.51254 + (((tickAnim - 7) / 1) * (0-(0.51254)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 8) / 0) * (-21.24863-(-17.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0.04058-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (-1.6677-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -21.24863 + (((tickAnim - 8) / 1) * (38.75063-(-21.24863)));
            yy = 0.04058 + (((tickAnim - 8) / 1) * (-0.02786-(0.04058)));
            zz = -1.6677 + (((tickAnim - 8) / 1) * (-3.33327-(-1.6677)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 38.75063 + (((tickAnim - 9) / 1) * (46.25-(38.75063)));
            yy = -0.02786 + (((tickAnim - 9) / 1) * (-0.02-(-0.02786)));
            zz = -3.33327 + (((tickAnim - 9) / 1) * (-2.5-(-3.33327)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30.21675 + (((tickAnim - 0) / 3) * (-9.31466-(-30.21675)));
            yy = -8.4892 + (((tickAnim - 0) / 3) * (-12.4744-(-8.4892)));
            zz = 5.8628 + (((tickAnim - 0) / 3) * (-0.2584-(5.8628)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -9.31466 + (((tickAnim - 3) / 2) * (29.25118-(-9.31466)));
            yy = -12.4744 + (((tickAnim - 3) / 2) * (-9.5789-(-12.4744)));
            zz = -0.2584 + (((tickAnim - 3) / 2) * (-10.4037-(-0.2584)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 29.25118 + (((tickAnim - 5) / 3) * (-35-(29.25118)));
            yy = -9.5789 + (((tickAnim - 5) / 3) * (0-(-9.5789)));
            zz = -10.4037 + (((tickAnim - 5) / 3) * (0-(-10.4037)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 8) / 2) * (-30.21675-(-35)));
            yy = 0 + (((tickAnim - 8) / 2) * (-8.4892-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (5.8628-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -23.75 + (((tickAnim - 0) / 1) * (-1.67-(-23.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -1.67 + (((tickAnim - 1) / 1) * (14.16-(-1.67)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 14.16 + (((tickAnim - 2) / 1) * (20-(14.16)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 3) / 2) * (36.25-(20)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.25 + (((tickAnim - 5) / 3) * (60-(36.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 60 + (((tickAnim - 8) / 1) * (-5.83-(60)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -5.83 + (((tickAnim - 9) / 1) * (-23.75-(-5.83)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(FeatherL2, FeatherL2.rotateAngleX + (float) Math.toRadians(-5), FeatherL2.rotateAngleY + (float) Math.toRadians(35), FeatherL2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.54725 + (((tickAnim - 0) / 1) * (-23.27033-(12.54725)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -23.27033 + (((tickAnim - 1) / 1) * (-25.34-(-23.27033)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.34 + (((tickAnim - 2) / 1) * (2.5945-(-25.34)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.5945 + (((tickAnim - 3) / 1) * (33.4-(2.5945)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 33.4 + (((tickAnim - 4) / 1) * (15.04725-(33.4)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 15.04725 + (((tickAnim - 5) / 2) * (21.68-(15.04725)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 21.68 + (((tickAnim - 7) / 1) * (-42.5-(21.68)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -42.5 + (((tickAnim - 8) / 0) * (-34.15-(-42.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -34.15 + (((tickAnim - 8) / 2) * (12.54725-(-34.15)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(FeatherL, FeatherL.rotateAngleX + (float) Math.toRadians(-47.96016), FeatherL.rotateAngleY + (float) Math.toRadians(34.89746), FeatherL.rotateAngleZ + (float) Math.toRadians(-83.04429));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 38.52094 + (((tickAnim - 0) / 1) * (44.85373-(38.52094)));
            yy = 6.3346 + (((tickAnim - 0) / 1) * (5.0679-(6.3346)));
            zz = -1.5549 + (((tickAnim - 0) / 1) * (0.3954-(-1.5549)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 44.85373 + (((tickAnim - 1) / 1) * (23.51421-(44.85373)));
            yy = 5.0679 + (((tickAnim - 1) / 1) * (4.7092-(5.0679)));
            zz = 0.3954 + (((tickAnim - 1) / 1) * (-0.5125-(0.3954)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.51421 + (((tickAnim - 2) / 1) * (-17.5-(23.51421)));
            yy = 4.7092 + (((tickAnim - 2) / 1) * (0-(4.7092)));
            zz = -0.5125 + (((tickAnim - 2) / 1) * (0-(-0.5125)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 3) / 0) * (-21.24863-(-17.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (-0.0406-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (1.6677-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -21.24863 + (((tickAnim - 3) / 1) * (38.75063-(-21.24863)));
            yy = -0.0406 + (((tickAnim - 3) / 1) * (0.0279-(-0.0406)));
            zz = 1.6677 + (((tickAnim - 3) / 1) * (3.3333-(1.6677)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 38.75063 + (((tickAnim - 4) / 1) * (46.25-(38.75063)));
            yy = 0.0279 + (((tickAnim - 4) / 1) * (0.02-(0.0279)));
            zz = 3.3333 + (((tickAnim - 4) / 1) * (2.5-(3.3333)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 46.25 + (((tickAnim - 5) / 3) * (110-(46.25)));
            yy = 0.02 + (((tickAnim - 5) / 3) * (0-(0.02)));
            zz = 2.5 + (((tickAnim - 5) / 3) * (0-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 110 + (((tickAnim - 8) / 1) * (44.10141-(110)));
            yy = 0 + (((tickAnim - 8) / 1) * (2.848-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-0.0907-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 44.10141 + (((tickAnim - 9) / 1) * (38.52094-(44.10141)));
            yy = 2.848 + (((tickAnim - 9) / 1) * (6.3346-(2.848)));
            zz = -0.0907 + (((tickAnim - 9) / 1) * (-1.5549-(-0.0907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(-61.87361), UpperArmL.rotateAngleY + (float) Math.toRadians(2.2428), UpperArmL.rotateAngleZ + (float) Math.toRadians(-67.1266));


        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(107.5), LowerArmL.rotateAngleY + (float) Math.toRadians(0), LowerArmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(-77.5), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(-61.87361), UpperArmR.rotateAngleY + (float) Math.toRadians(-2.24277), UpperArmR.rotateAngleZ + (float) Math.toRadians(67.1266));


        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(107.5), LowerArmR.rotateAngleY + (float) Math.toRadians(0), LowerArmR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(-77.5), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.81147-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4.81147 + (((tickAnim - 3) / 2) * (0-(4.81147)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (4.81147-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.81147 + (((tickAnim - 8) / 2) * (0-(4.81147)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(17.5), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnchiornis entity = (EntityPrehistoricFloraAnchiornis) entitylivingbaseIn;

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
        this.setRotateAngle(Anchiornis, Anchiornis.rotateAngleX + (float) Math.toRadians(xx), Anchiornis.rotateAngleY + (float) Math.toRadians(yy), Anchiornis.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Anchiornis.rotationPointX = this.Anchiornis.rotationPointX + (float)(xx);
        this.Anchiornis.rotationPointY = this.Anchiornis.rotationPointY - (float)(yy);
        this.Anchiornis.rotationPointZ = this.Anchiornis.rotationPointZ + (float)(zz);




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
            xx = -79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20 + (((tickAnim - 0) / 30) * (-97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20)));
            yy = -24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 0) / 30) * (-14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(-24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 0) / 30) * (-98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(-90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (-14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(-14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = -98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 30) / 30) * (-98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(-98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (-79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20-(-97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (-24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = -98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 60) / 10) * (-90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20 + (((tickAnim - 70) / 10) * (-79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20-(-79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20)));
            yy = -24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 70) / 10) * (-24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 70) / 10) * (-90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
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
            xx = 114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = 24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            zz = 9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 0) / 30) * (20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 30) / 30) * (20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = 20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 60) / 10) * (9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = 24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            zz = 9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 70) / 10) * (9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -90 + (((tickAnim - 0) / 30) * (-90.01413-(-90)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 0) / 30) * (9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -90.01413 + (((tickAnim - 30) / 30) * (-90.01413-(-90.01413)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499)));
            zz = 9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 30) / 30) * (9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -90.01413 + (((tickAnim - 60) / 10) * (-90-(-90.01413)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499)));
            zz = 9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
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




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20 + (((tickAnim - 0) / 30) * (-97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20)));
            yy = 24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 0) / 30) * (14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 0) / 30) * (98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 30) / 30) * (98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (-79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20-(-97.0176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(14.7524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 60) / 10) * (90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(98.7456+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20 + (((tickAnim - 70) / 10) * (-79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20-(-79.3624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*20)));
            yy = 24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 70) / 10) * (24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(24.1918+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 70) / 10) * (90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(90.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
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
            xx = 114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 0) / 30) * (-9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = -9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 30) * (-20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(-9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = -9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (-9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = -20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 30) / 30) * (-20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(-20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(137.2983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = -9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (-24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-9.6284+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = -20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 60) / 10) * (-9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(-20.0574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(114.4574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 70) / 10) * (-24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-24.9463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = -9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 10) * (-9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(-9.7405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
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
            xx = -91.30201 + (((tickAnim - 13) / 17) * (-90.01413-(-91.30201)));
            yy = 5.32165 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499-(5.32165)));
            zz = -5.53859 + (((tickAnim - 13) / 17) * (-9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-5.53859)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -90.01413 + (((tickAnim - 30) / 30) * (-90.01413-(-90.01413)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499)));
            zz = -9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 30) / 30) * (-9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -90.01413 + (((tickAnim - 60) / 10) * (-90-(-90.01413)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.2499)));
            zz = -9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-9.9998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
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

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
