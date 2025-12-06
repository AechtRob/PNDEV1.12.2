package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatyhystrix;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPlatyhystrix extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer Hip;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tongue;
    private final AdvancedModelRenderer tongue2;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer HandL;

    private ModelAnimator animator;

    public ModelPlatyhystrix() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Hip = new AdvancedModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, 17.0F, 3.75F);
        this.setRotateAngle(Hip, -0.2182F, 0.0F, 0.0F);
        this.Hip.cubeList.add(new ModelBox(Hip, 33, 38, -2.5F, 0.125F, -1.0F, 5, 4, 3, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(2.25F, 2.75F, 1.5F);
        this.Hip.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.0873F, -0.3491F, 0.1745F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 48, 7, -0.5F, -0.5F, -1.0F, 3, 2, 2, 0.2F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(2.25F, 0.65F, -0.5F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.2182F, -0.7418F, 1.0472F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 11, 52, 0.0F, -0.51F, -0.49F, 3, 1, 2, 0.1F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(2.5F, -0.5F, 0.45F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.8727F, 0.5236F, 0.2182F);
        this.FootR.cubeList.add(new ModelBox(FootR, 37, 46, 0.0F, -2.26F, -1.64F, 1, 3, 3, 0.1F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(-2.25F, 2.75F, 1.5F);
        this.Hip.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.0873F, 0.3491F, -0.1745F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 48, 7, -2.5F, -0.5F, -1.0F, 3, 2, 2, 0.2F, true));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(-2.25F, 0.65F, -0.5F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.2182F, 0.7418F, -1.0472F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 11, 52, -3.0F, -0.51F, -0.49F, 3, 1, 2, 0.1F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(-2.5F, -0.5F, 0.45F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.8727F, -0.5236F, -0.2182F);
        this.FootL.cubeList.add(new ModelBox(FootL, 37, 46, -1.0F, -2.26F, -1.64F, 1, 3, 3, 0.1F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.75F, 2.0F);
        this.Hip.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1745F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 24, 46, -1.5F, -0.325F, -1.0F, 3, 3, 3, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1745F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 9, 44, -1.0F, -0.3245F, -1.0218F, 2, 2, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Hip.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 20, 19, -3.5F, -0.975F, -3.0F, 7, 5, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 23, 0.0F, -9.975F, -3.0F, 0, 9, 5, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 1.0F, -1.75F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.0873F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -4.0F, -2.325F, -5.25F, 8, 6, 5, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 22, 0.05F, -12.325F, -5.25F, 0, 10, 5, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.body1.addChild(Chest);
        this.setRotateAngle(Chest, 0.0873F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 12, -3.5F, -2.05F, -3.0F, 7, 5, 4, 0.0F, false));
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 38, 0.0F, -11.05F, -3.0F, 0, 9, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.Chest.addChild(Head);


        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.525F, 0.0F);
        this.Head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 22, 28, -1.0F, 0.01F, -8.0F, 2, 1, 6, -0.002F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.165F, -1.0F);
        this.lowerjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 16, -2.5F, -0.775F, -1.85F, 5, 2, 3, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.042F, -0.015F, -5.1462F);
        this.lowerjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 44, -0.0245F, -0.5F, -0.0175F, 0, 1, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.042F, -0.015F, -5.1462F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3054F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 44, 0.0245F, -0.5F, -0.0175F, 0, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 22, 0.5F, -1.515F, -0.05F, 0, 1, 3, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 30, 0.0F, -0.99F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 22, -0.5F, -1.515F, -0.05F, 0, 1, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 30, -2.0F, -0.99F, 0.0F, 2, 1, 3, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.192F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 30, -1.025F, -0.99F, 2.825F, 2, 1, 6, 0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.192F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 30, -0.975F, -0.99F, 2.825F, 2, 1, 6, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.239F, -1.4852F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 7, -2.5F, -0.325F, -2.5F, 5, 1, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.1402F, -4.7695F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1833F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 14, -2.0F, -0.6F, -1.0F, 4, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1571F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 0, -1.0F, -1.0F, 0.25F, 2, 1, 2, 0.0F, false));

        this.tongue = new AdvancedModelRenderer(this);
        this.tongue.setRotationPoint(0.0F, -0.065F, -2.5F);
        this.lowerjaw.addChild(tongue);
        this.tongue.cubeList.add(new ModelBox(tongue, 19, 57, -0.5F, -0.5F, -3.0F, 1, 1, 4, -0.002F, false));

        this.tongue2 = new AdvancedModelRenderer(this);
        this.tongue2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tongue.addChild(tongue2);
        this.tongue2.cubeList.add(new ModelBox(tongue2, 49, 59, -1.0F, -0.5F, -2.0F, 2, 1, 2, -0.002F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 31, 59, -1.0F, -2.0F, -4.875F, 2, 1, 2, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 46, 0, -1.0F, -1.01F, -8.0F, 2, 1, 5, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 42, 0, -1.5F, -1.01F, -3.0F, 3, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.5236F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 47, 35, 0.0F, -0.99F, 0.0F, 2, 1, 3, -0.001F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.5236F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 35, -2.0F, -0.99F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.192F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 36, -1.025F, -0.99F, 2.825F, 2, 1, 6, 0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.192F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 36, -0.975F, -0.99F, 2.825F, 2, 1, 6, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.55F, -3.25F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0044F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 0, -2.5F, 0.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.4897F, -0.01F, -2.6533F);
        this.upperjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.1309F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 36, -0.025F, -0.5F, -2.25F, 0, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.4897F, -0.01F, -2.6533F);
        this.upperjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1309F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 36, 0.025F, -0.5F, -2.25F, 0, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.325F, 0.5F, -7.0F);
        this.upperjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.3927F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 52, 27, -0.025F, -1.01F, -0.75F, 0, 1, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.325F, 0.5F, -7.0F);
        this.upperjaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.3927F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 52, 27, 0.025F, -1.01F, -0.75F, 0, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 45, 41, -1.0F, -1.0F, 0.325F, 2, 1, 5, 0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.015F, -1.0F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5236F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 16, -2.5F, -1.7F, -1.925F, 5, 2, 3, -0.01F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(1.5F, -1.5F, -3.875F);
        this.upperjaw.addChild(leftEye);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 5, 38, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-1.5F, -1.5F, -3.875F);
        this.upperjaw.addChild(rightEye);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 5, 38, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(3.5F, 2.25F, -0.9F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.0F, -0.4363F, 0.6109F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 52, 14, -0.4F, -0.1F, -1.0F, 3, 1, 2, 0.2F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(2.75F, 0.4F, 0.0F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, 0.2618F, 1.3963F, 1.2217F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 22, 53, 0.0F, -0.51F, -0.49F, 2, 2, 1, 0.1F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(1.75F, 0.5F, -0.3F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.0436F, -1.0996F, 0.0873F);
        this.HandR.cubeList.add(new ModelBox(HandR, 46, 48, 0.0F, -1.51F, -2.39F, 1, 3, 3, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(-3.5F, 2.25F, -1.15F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.0F, 0.4363F, -0.6109F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 52, 14, -2.6F, -0.1F, -1.0F, 3, 1, 2, 0.2F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(-2.75F, 0.4F, 0.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.2618F, -1.3963F, -1.2217F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 22, 53, -2.0F, -0.51F, -0.49F, 2, 2, 1, 0.1F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(-1.75F, 0.5F, -0.3F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0436F, 1.0996F, -0.0873F);
        this.HandL.cubeList.add(new ModelBox(HandL, 46, 48, -1.0F, -1.51F, -2.39F, 1, 3, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hip.render(f5);
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hip.offsetY = -0.6F;
        this.Hip.offsetX = -0.2F;
        this.Hip.rotateAngleY = (float)Math.toRadians(-250);
        this.Hip.rotateAngleX = (float)Math.toRadians(3);
        this.Hip.rotateAngleZ = (float)Math.toRadians(12);
        this.Hip.scaleChildren = true;
        float scaler = 1.2F;
        this.Hip.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hip, 0.2F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.Hip.render(f);
        //Reset rotations, positions and sizing:
        this.Hip.setScale(1.0F, 1.0F, 1.0F);
        this.Hip.scaleChildren = false;
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
        //this.resetToDefaultPose();
       // this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2};

        EntityPrehistoricFloraPlatyhystrix entitySilesaurus = (EntityPrehistoricFloraPlatyhystrix) e;

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        this.faceTarget(f3, f4, 6, Head);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.leftEye.setScale(1,1,1);
        this.rightEye.setScale(1,1,1);
        EntityPrehistoricFloraPlatyhystrix ee = (EntityPrehistoricFloraPlatyhystrix) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.LOOK_ANIMATION) {
            animLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LICK_LEFT_ANIMATION) {
            animLickL(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LICK_RIGHT_ANIMATION) {
            animLickR(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animLook(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlatyhystrix entity = (EntityPrehistoricFloraPlatyhystrix) entitylivingbaseIn;

        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.45453-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.98134-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = -4.45453 + (((tickAnim - 15) / 14) * (-4.45453-(-4.45453)));
            yy = -4.98134 + (((tickAnim - 15) / 14) * (-4.98134-(-4.98134)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = -4.45453 + (((tickAnim - 29) / 26) * (0-(-4.45453)));
            yy = -4.98134 + (((tickAnim - 29) / 26) * (0-(-4.98134)));
            zz = 0 + (((tickAnim - 29) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -5 + (((tickAnim - 15) / 15) * (-5-(-5)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            yy = -5 + (((tickAnim - 30) / 25) * (0-(-5)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 5.5 + (((tickAnim - 11) / 9) * (5.48668-(5.5)));
            yy = 0 + (((tickAnim - 11) / 9) * (0.38307-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (-3.98164-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 5.48668 + (((tickAnim - 20) / 9) * (5.48668-(5.48668)));
            yy = 0.38307 + (((tickAnim - 20) / 9) * (0.38307-(0.38307)));
            zz = -3.98164 + (((tickAnim - 20) / 9) * (-3.98164-(-3.98164)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 5.48668 + (((tickAnim - 29) / 11) * (0.3268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1-(5.48668)));
            yy = 0.38307 + (((tickAnim - 29) / 11) * (10.71125-(0.38307)));
            zz = -3.98164 + (((tickAnim - 29) / 11) * (2.87104-(-3.98164)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0.3268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1 + (((tickAnim - 40) / 8) * (-0.6732+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1-(0.3268+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1)));
            yy = 10.71125 + (((tickAnim - 40) / 8) * (10.71125-(10.71125)));
            zz = 2.87104 + (((tickAnim - 40) / 8) * (2.87104-(2.87104)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -0.6732+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1 + (((tickAnim - 48) / 7) * (0-(-0.6732+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*1)));
            yy = 10.71125 + (((tickAnim - 48) / 7) * (0-(10.71125)));
            zz = 2.87104 + (((tickAnim - 48) / 7) * (0-(2.87104)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (4.5-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.5 + (((tickAnim - 25) / 5) * (0-(4.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (4.5-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 45) / 5) * (0-(4.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.625-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = -0.625 + (((tickAnim - 25) / 5) * (0-(-0.625)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (-0.625-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = -0.625 + (((tickAnim - 45) / 5) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tongue.rotationPointX = this.tongue.rotationPointX + (float)(xx);
        this.tongue.rotationPointY = this.tongue.rotationPointY - (float)(yy);
        this.tongue.rotationPointZ = this.tongue.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 0) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 11) * (0.04-(1)));
            zz = 1 + (((tickAnim - 0) / 11) * (1-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 11) / 12) * (1-(1)));
            yy = 0.04 + (((tickAnim - 11) / 12) * (1-(0.04)));
            zz = 1 + (((tickAnim - 11) / 12) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 23) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 23) / 10) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 1 + (((tickAnim - 33) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 33) / 10) * (0.04-(1)));
            zz = 1 + (((tickAnim - 33) / 10) * (1-(1)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 43) / 12) * (1-(1)));
            yy = 0.04 + (((tickAnim - 43) / 12) * (1-(0.04)));
            zz = 1 + (((tickAnim - 43) / 12) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 0) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 11) * (0.04-(1)));
            zz = 1 + (((tickAnim - 0) / 11) * (1-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 11) / 12) * (1-(1)));
            yy = 0.04 + (((tickAnim - 11) / 12) * (1-(0.04)));
            zz = 1 + (((tickAnim - 11) / 12) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 23) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 23) / 10) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 1 + (((tickAnim - 33) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 33) / 10) * (0.04-(1)));
            zz = 1 + (((tickAnim - 33) / 10) * (1-(1)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 43) / 12) * (1-(1)));
            yy = 0.04 + (((tickAnim - 43) / 12) * (1-(0.04)));
            zz = 1 + (((tickAnim - 43) / 12) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightEye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (17.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            zz = 17.25 + (((tickAnim - 15) / 14) * (17.25-(17.25)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            zz = 17.25 + (((tickAnim - 29) / 26) * (0-(17.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (16.54477-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.04415-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-3.7684-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 16.54477 + (((tickAnim - 15) / 14) * (16.54477-(16.54477)));
            yy = -1.04415 + (((tickAnim - 15) / 14) * (-1.04415-(-1.04415)));
            zz = -3.7684 + (((tickAnim - 15) / 14) * (-3.7684-(-3.7684)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 16.54477 + (((tickAnim - 29) / 26) * (0-(16.54477)));
            yy = -1.04415 + (((tickAnim - 29) / 26) * (0-(-1.04415)));
            zz = -3.7684 + (((tickAnim - 29) / 26) * (0-(-3.7684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-17-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            zz = -17 + (((tickAnim - 15) / 14) * (-17-(-17)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            zz = -17 + (((tickAnim - 29) / 26) * (0-(-17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 8) / 7) * (0-(0.625)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 14) * (0.625-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            yy = 0.625 + (((tickAnim - 43) / 12) * (0-(0.625)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(xx);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(yy);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.42726-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.54628-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (4.13417-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.42726 + (((tickAnim - 8) / 7) * (9.14549-(-3.42726)));
            yy = 1.54628 + (((tickAnim - 8) / 7) * (3.09257-(1.54628)));
            zz = 4.13417 + (((tickAnim - 8) / 7) * (8.26833-(4.13417)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 9.14549 + (((tickAnim - 15) / 14) * (9.14549-(9.14549)));
            yy = 3.09257 + (((tickAnim - 15) / 14) * (3.09257-(3.09257)));
            zz = 8.26833 + (((tickAnim - 15) / 14) * (8.26833-(8.26833)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 9.14549 + (((tickAnim - 29) / 14) * (-3.42726-(9.14549)));
            yy = 3.09257 + (((tickAnim - 29) / 14) * (1.54628-(3.09257)));
            zz = 8.26833 + (((tickAnim - 29) / 14) * (4.13417-(8.26833)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = -3.42726 + (((tickAnim - 43) / 12) * (0-(-3.42726)));
            yy = 1.54628 + (((tickAnim - 43) / 12) * (0-(1.54628)));
            zz = 4.13417 + (((tickAnim - 43) / 12) * (0-(4.13417)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.475 + (((tickAnim - 8) / 7) * (0-(0.475)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 29) / 14) * (0.475-(0)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 0.475 + (((tickAnim - 43) / 12) * (0-(0.475)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerArmL.rotationPointX = this.LowerArmL.rotationPointX + (float)(xx);
        this.LowerArmL.rotationPointY = this.LowerArmL.rotationPointY - (float)(yy);
        this.LowerArmL.rotationPointZ = this.LowerArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (20.75-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 20.75 + (((tickAnim - 8) / 7) * (0-(20.75)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 14) * (20.75-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            yy = 20.75 + (((tickAnim - 43) / 12) * (0-(20.75)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animLickL(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlatyhystrix entity = (EntityPrehistoricFloraPlatyhystrix) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4.81-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 4.81 + (((tickAnim - 13) / 12) * (8.16-(4.81)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 8.16 + (((tickAnim - 25) / 18) * (13.08-(8.16)));
            yy = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 13.08 + (((tickAnim - 43) / 7) * (0-(13.08)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (42.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 42.25 + (((tickAnim - 25) / 12) * (54.75-(42.25)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 54.75 + (((tickAnim - 37) / 13) * (0-(54.75)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tongue, tongue.rotateAngleX + (float) Math.toRadians(xx), tongue.rotateAngleY + (float) Math.toRadians(yy), tongue.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.83-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = -0.83 + (((tickAnim - 25) / 12) * (-0.23-(-0.83)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -0.225 + (((tickAnim - 37) / 13) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = -0.23 + (((tickAnim - 37) / 13) * (0-(-0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tongue.rotationPointX = this.tongue.rotationPointX + (float)(xx);
        this.tongue.rotationPointY = this.tongue.rotationPointY - (float)(yy);
        this.tongue.rotationPointZ = this.tongue.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-6.20266-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-6.5416-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.03004-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -6.20266 + (((tickAnim - 12) / 13) * (-94.35797-(-6.20266)));
            yy = -6.5416 + (((tickAnim - 12) / 13) * (19.6248-(-6.5416)));
            zz = -0.03004 + (((tickAnim - 12) / 13) * (0.0901-(-0.03004)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -94.35797 + (((tickAnim - 25) / 5) * (-94.35797-(-94.35797)));
            yy = 19.6248 + (((tickAnim - 25) / 5) * (19.6248-(19.6248)));
            zz = 0.0901 + (((tickAnim - 25) / 5) * (0.0901-(0.0901)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -94.35797 + (((tickAnim - 30) / 5) * (-94.35797-(-94.35797)));
            yy = 19.6248 + (((tickAnim - 30) / 5) * (19.6248-(19.6248)));
            zz = 0.0901 + (((tickAnim - 30) / 5) * (0.0901-(0.0901)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -94.35797 + (((tickAnim - 35) / 15) * (0-(-94.35797)));
            yy = 19.6248 + (((tickAnim - 35) / 15) * (0-(19.6248)));
            zz = 0.0901 + (((tickAnim - 35) / 15) * (0-(0.0901)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tongue2, tongue2.rotateAngleX + (float) Math.toRadians(xx), tongue2.rotateAngleY + (float) Math.toRadians(yy), tongue2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0.2-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = -0.15 + (((tickAnim - 25) / 10) * (-0.175-(-0.15)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.2 + (((tickAnim - 35) / 15) * (0-(0.2)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.175 + (((tickAnim - 35) / 15) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tongue2.rotationPointX = this.tongue2.rotationPointX + (float)(xx);
        this.tongue2.rotationPointY = this.tongue2.rotationPointY - (float)(yy);
        this.tongue2.rotationPointZ = this.tongue2.rotationPointZ + (float)(zz);




        if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 15) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.25 + (((tickAnim - 38) / 12) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightEye.rotationPointX = this.rightEye.rotationPointX + (float)(xx);
        this.rightEye.rotationPointY = this.rightEye.rotationPointY - (float)(yy);
        this.rightEye.rotationPointZ = this.rightEye.rotationPointZ + (float)(zz);

    }

    public void animLickR(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlatyhystrix entity = (EntityPrehistoricFloraPlatyhystrix) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4.81-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 4.81 + (((tickAnim - 13) / 30) * (13.08-(4.81)));
            yy = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 13.08 + (((tickAnim - 43) / 7) * (0-(13.08)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-42.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = -42.25 + (((tickAnim - 25) / 12) * (-54.75-(-42.25)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = -54.75 + (((tickAnim - 37) / 13) * (0-(-54.75)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tongue, tongue.rotateAngleX + (float) Math.toRadians(xx), tongue.rotateAngleY + (float) Math.toRadians(yy), tongue.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.83-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = -0.83 + (((tickAnim - 25) / 12) * (-0.23-(-0.83)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -0.225 + (((tickAnim - 37) / 13) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = -0.23 + (((tickAnim - 37) / 13) * (0-(-0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tongue.rotationPointX = this.tongue.rotationPointX + (float)(xx);
        this.tongue.rotationPointY = this.tongue.rotationPointY - (float)(yy);
        this.tongue.rotationPointZ = this.tongue.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-6.20266-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-6.5416-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.03004-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -6.20266 + (((tickAnim - 12) / 13) * (-94.35797-(-6.20266)));
            yy = -6.5416 + (((tickAnim - 12) / 13) * (-19.6248-(-6.5416)));
            zz = -0.03004 + (((tickAnim - 12) / 13) * (-0.09012-(-0.03004)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -94.35797 + (((tickAnim - 25) / 5) * (-94.35797-(-94.35797)));
            yy = -19.6248 + (((tickAnim - 25) / 5) * (-19.6248-(-19.6248)));
            zz = -0.09012 + (((tickAnim - 25) / 5) * (-0.09012-(-0.09012)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -94.35797 + (((tickAnim - 30) / 5) * (-94.35797-(-94.35797)));
            yy = -19.6248 + (((tickAnim - 30) / 5) * (-19.6248-(-19.6248)));
            zz = -0.09012 + (((tickAnim - 30) / 5) * (-0.09012-(-0.09012)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -94.35797 + (((tickAnim - 35) / 15) * (0-(-94.35797)));
            yy = -19.6248 + (((tickAnim - 35) / 15) * (0-(-19.6248)));
            zz = -0.09012 + (((tickAnim - 35) / 15) * (0-(-0.09012)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tongue2, tongue2.rotateAngleX + (float) Math.toRadians(xx), tongue2.rotateAngleY + (float) Math.toRadians(yy), tongue2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0.2-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = -0.15 + (((tickAnim - 25) / 10) * (-0.175-(-0.15)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.2 + (((tickAnim - 35) / 15) * (0-(0.2)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.175 + (((tickAnim - 35) / 15) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tongue2.rotationPointX = this.tongue2.rotationPointX + (float)(xx);
        this.tongue2.rotationPointY = this.tongue2.rotationPointY - (float)(yy);
        this.tongue2.rotationPointZ = this.tongue2.rotationPointZ + (float)(zz);




        if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 15) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.25 + (((tickAnim - 38) / 12) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftEye.rotationPointX = this.leftEye.rotationPointX + (float)(xx);
        this.leftEye.rotationPointY = this.leftEye.rotationPointY - (float)(yy);
        this.leftEye.rotationPointZ = this.leftEye.rotationPointZ + (float)(zz);
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPlatyhystrix entity = (EntityPrehistoricFloraPlatyhystrix) entitylivingbaseIn;

        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = -0.75 + (((tickAnim - 0) / 9) * (-1-(-0.75)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = -1 + (((tickAnim - 9) / 9) * (-0.75-(-1)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = -0.75 + (((tickAnim - 18) / 9) * (0-(-0.75)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (-0.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hip.rotationPointX = this.Hip.rotationPointX + (float)(xx);
        this.Hip.rotationPointY = this.Hip.rotationPointY - (float)(yy);
        this.Hip.rotationPointZ = this.Hip.rotationPointZ + (float)(zz);

        this.setRotateAngle(Hip, Hip.rotateAngleX + (float) Math.toRadians(0), Hip.rotateAngleY + (float) Math.toRadians(0), Hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*-1));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*1), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*-7));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-10))*5), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-20))*-1));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.36267 + (((tickAnim - 0) / 4) * (6.21606-(6.36267)));
            yy = -40.27433 + (((tickAnim - 0) / 4) * (-29.84843-(-40.27433)));
            zz = -10.679 + (((tickAnim - 0) / 4) * (-7.41944-(-10.679)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.21606 + (((tickAnim - 4) / 4) * (6.41617-(6.21606)));
            yy = -29.84843 + (((tickAnim - 4) / 4) * (-19.37706-(-29.84843)));
            zz = -7.41944 + (((tickAnim - 4) / 4) * (-6.1892-(-7.41944)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.41617 + (((tickAnim - 8) / 5) * (6.5796-(6.41617)));
            yy = -19.37706 + (((tickAnim - 8) / 5) * (-9.66985-(-19.37706)));
            zz = -6.1892 + (((tickAnim - 8) / 5) * (-6.85252-(-6.1892)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 6.5796 + (((tickAnim - 13) / 4) * (6.37588-(6.5796)));
            yy = -9.66985 + (((tickAnim - 13) / 4) * (1.71472-(-9.66985)));
            zz = -6.85252 + (((tickAnim - 13) / 4) * (-9.69759-(-6.85252)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 6.37588 + (((tickAnim - 17) / 9) * (-15.81052-(6.37588)));
            yy = 1.71472 + (((tickAnim - 17) / 9) * (-23.5305-(1.71472)));
            zz = -9.69759 + (((tickAnim - 17) / 9) * (6.43169-(-9.69759)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -15.81052 + (((tickAnim - 26) / 9) * (6.36267-(-15.81052)));
            yy = -23.5305 + (((tickAnim - 26) / 9) * (-40.27433-(-23.5305)));
            zz = 6.43169 + (((tickAnim - 26) / 9) * (-10.679-(6.43169)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 4.83884 + (((tickAnim - 0) / 17) * (8.39588-(4.83884)));
            yy = -28.41097 + (((tickAnim - 0) / 17) * (-6.63806-(-28.41097)));
            zz = 17.11521 + (((tickAnim - 0) / 17) * (25.37633-(17.11521)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 8.39588 + (((tickAnim - 17) / 18) * (4.83884-(8.39588)));
            yy = -6.63806 + (((tickAnim - 17) / 18) * (-28.41097-(-6.63806)));
            zz = 25.37633 + (((tickAnim - 17) / 18) * (17.11521-(25.37633)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.84593 + (((tickAnim - 0) / 4) * (-4.62827-(-7.84593)));
            yy = 25.34455 + (((tickAnim - 0) / 4) * (17.14478-(25.34455)));
            zz = -13.55741 + (((tickAnim - 0) / 4) * (-18.75561-(-13.55741)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -4.62827 + (((tickAnim - 4) / 4) * (-2.63203-(-4.62827)));
            yy = 17.14478 + (((tickAnim - 4) / 4) * (8.93845-(17.14478)));
            zz = -18.75561 + (((tickAnim - 4) / 4) * (-18.15204-(-18.75561)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2.63203 + (((tickAnim - 8) / 9) * (-0.53825-(-2.63203)));
            yy = 8.93845 + (((tickAnim - 8) / 9) * (-7.70287-(8.93845)));
            zz = -18.15204 + (((tickAnim - 8) / 9) * (-13.65562-(-18.15204)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = -0.53825 + (((tickAnim - 17) / 18) * (-7.84593-(-0.53825)));
            yy = -7.70287 + (((tickAnim - 17) / 18) * (25.34455-(-7.70287)));
            zz = -13.65562 + (((tickAnim - 17) / 18) * (-13.55741-(-13.65562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 45.59313 + (((tickAnim - 0) / 4) * (33.48171-(45.59313)));
            yy = 43.99252 + (((tickAnim - 0) / 4) * (12.56624-(43.99252)));
            zz = 23.50936 + (((tickAnim - 0) / 4) * (30.9872-(23.50936)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 33.48171 + (((tickAnim - 4) / 7) * (2.84499-(33.48171)));
            yy = 12.56624 + (((tickAnim - 4) / 7) * (-14.16124-(12.56624)));
            zz = 30.9872 + (((tickAnim - 4) / 7) * (15.01281-(30.9872)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 2.84499 + (((tickAnim - 11) / 6) * (0-(2.84499)));
            yy = -14.16124 + (((tickAnim - 11) / 6) * (-28-(-14.16124)));
            zz = 15.01281 + (((tickAnim - 11) / 6) * (0-(15.01281)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 17) / 18) * (45.59313-(0)));
            yy = -28 + (((tickAnim - 17) / 18) * (43.99252-(-28)));
            zz = 0 + (((tickAnim - 17) / 18) * (23.50936-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (31.07068-(0)));
            yy = 13 + (((tickAnim - 0) / 11) * (1.33282-(13)));
            zz = 0 + (((tickAnim - 0) / 11) * (-32.27635-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 31.07068 + (((tickAnim - 11) / 6) * (0-(31.07068)));
            yy = 1.33282 + (((tickAnim - 11) / 6) * (4-(1.33282)));
            zz = -32.27635 + (((tickAnim - 11) / 6) * (0-(-32.27635)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 4 + (((tickAnim - 17) / 5) * (-4.32-(4)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = -4.32 + (((tickAnim - 22) / 4) * (-7.5-(-4.32)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = -7.5 + (((tickAnim - 26) / 9) * (13-(-7.5)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2.17358 + (((tickAnim - 0) / 11) * (-4.88714-(-2.17358)));
            yy = -55.10765 + (((tickAnim - 0) / 11) * (-17.68468-(-55.10765)));
            zz = -5.26726 + (((tickAnim - 0) / 11) * (5.30139-(-5.26726)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -4.88714 + (((tickAnim - 11) / 6) * (-7.14813-(-4.88714)));
            yy = -17.68468 + (((tickAnim - 11) / 6) * (13.60938-(-17.68468)));
            zz = 5.30139 + (((tickAnim - 11) / 6) * (6.18681-(5.30139)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = -7.14813 + (((tickAnim - 17) / 9) * (-13.48768-(-7.14813)));
            yy = 13.60938 + (((tickAnim - 17) / 9) * (-11.56333-(13.60938)));
            zz = 6.18681 + (((tickAnim - 17) / 9) * (-11.34291-(6.18681)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -13.48768 + (((tickAnim - 26) / 9) * (-2.17358-(-13.48768)));
            yy = -11.56333 + (((tickAnim - 26) / 9) * (-55.10765-(-11.56333)));
            zz = -11.34291 + (((tickAnim - 26) / 9) * (-5.26726-(-11.34291)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-11.98798-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (5.72989-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-11.66716-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -11.98798 + (((tickAnim - 4) / 5) * (-29-(-11.98798)));
            yy = 5.72989 + (((tickAnim - 4) / 5) * (19-(5.72989)));
            zz = -11.66716 + (((tickAnim - 4) / 5) * (0-(-11.66716)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -29 + (((tickAnim - 9) / 5) * (-12.01318-(-29)));
            yy = 19 + (((tickAnim - 9) / 5) * (29.14767-(19)));
            zz = 0 + (((tickAnim - 9) / 5) * (-4.0079-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.01318 + (((tickAnim - 14) / 4) * (0-(-12.01318)));
            yy = 29.14767 + (((tickAnim - 14) / 4) * (38-(29.14767)));
            zz = -4.0079 + (((tickAnim - 14) / 4) * (0-(-4.0079)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-0.05132-(0)));
            yy = 38 + (((tickAnim - 18) / 5) * (25.82164-(38)));
            zz = 0 + (((tickAnim - 18) / 5) * (-3.4926-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -0.05132 + (((tickAnim - 23) / 3) * (0.08163-(-0.05132)));
            yy = 25.82164 + (((tickAnim - 23) / 3) * (18.65408-(25.82164)));
            zz = -3.4926 + (((tickAnim - 23) / 3) * (-3.98586-(-3.4926)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0.08163 + (((tickAnim - 26) / 4) * (0.22937-(0.08163)));
            yy = 18.65408 + (((tickAnim - 26) / 4) * (9.24223-(18.65408)));
            zz = -3.98586 + (((tickAnim - 26) / 4) * (-3.00701-(-3.98586)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0.22937 + (((tickAnim - 30) / 5) * (0-(0.22937)));
            yy = 9.24223 + (((tickAnim - 30) / 5) * (0-(9.24223)));
            zz = -3.00701 + (((tickAnim - 30) / 5) * (0-(-3.00701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (40-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 17) / 18) * (0-(0)));
            yy = 40 + (((tickAnim - 17) / 18) * (0-(40)));
            zz = 0 + (((tickAnim - 17) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.77958-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-9.78872-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.16078-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -7.77958 + (((tickAnim - 8) / 9) * (-9.47139-(-7.77958)));
            yy = -9.78872 + (((tickAnim - 8) / 9) * (-41.78578-(-9.78872)));
            zz = -3.16078 + (((tickAnim - 8) / 9) * (17.54042-(-3.16078)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = -9.47139 + (((tickAnim - 17) / 18) * (0-(-9.47139)));
            yy = -41.78578 + (((tickAnim - 17) / 18) * (0-(-41.78578)));
            zz = 17.54042 + (((tickAnim - 17) / 18) * (0-(17.54042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.9468-(0)));
            yy = 26 + (((tickAnim - 0) / 4) * (15.98977-(26)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.98628-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -0.9468 + (((tickAnim - 4) / 5) * (-0.2318-(-0.9468)));
            yy = 15.98977 + (((tickAnim - 4) / 5) * (3.9785-(15.98977)));
            zz = -1.98628 + (((tickAnim - 4) / 5) * (-2.14234-(-1.98628)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -0.2318 + (((tickAnim - 9) / 8) * (0-(-0.2318)));
            yy = 3.9785 + (((tickAnim - 9) / 8) * (-14-(3.9785)));
            zz = -2.14234 + (((tickAnim - 9) / 8) * (0-(-2.14234)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 17) / 9) * (-9.84498-(0)));
            yy = -14 + (((tickAnim - 17) / 9) * (15.69306-(-14)));
            zz = 0 + (((tickAnim - 17) / 9) * (-12.59018-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -9.84498 + (((tickAnim - 26) / 9) * (0-(-9.84498)));
            yy = 15.69306 + (((tickAnim - 26) / 9) * (26-(15.69306)));
            zz = -12.59018 + (((tickAnim - 26) / 9) * (0-(-12.59018)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -5 + (((tickAnim - 0) / 17) * (5-(-5)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 17) / 18) * (0-(0)));
            yy = 5 + (((tickAnim - 17) / 18) * (-5-(5)));
            zz = 0 + (((tickAnim - 17) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 14.33147 + (((tickAnim - 0) / 17) * (-11.52777-(14.33147)));
            yy = -11.32943 + (((tickAnim - 0) / 17) * (1.30808-(-11.32943)));
            zz = -14.78262 + (((tickAnim - 0) / 17) * (11.58677-(-14.78262)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = -11.52777 + (((tickAnim - 17) / 18) * (14.33147-(-11.52777)));
            yy = 1.30808 + (((tickAnim - 17) / 18) * (-11.32943-(1.30808)));
            zz = 11.58677 + (((tickAnim - 17) / 18) * (-14.78262-(11.58677)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPlatyhystrix entity = (EntityPrehistoricFloraPlatyhystrix) entitylivingbaseIn;

        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400/1.4-300))*-1), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400/1.4+300))*-1));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400/1.4-300))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400/1.4+300))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400/1.4-300))*-1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400/1.4+300))*-1));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -50 + (((tickAnim - 0) / 12) * (33-(-50)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 33 + (((tickAnim - 12) / 13) * (-50-(33)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (49.97126-(0)));
            yy = 20 + (((tickAnim - 0) / 12) * (24.86011-(20)));
            zz = 0 + (((tickAnim - 0) / 12) * (51.60447-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 49.97126 + (((tickAnim - 12) / 13) * (0-(49.97126)));
            yy = 24.86011 + (((tickAnim - 12) / 13) * (20-(24.86011)));
            zz = 51.60447 + (((tickAnim - 12) / 13) * (0-(51.60447)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -0.21409 + (((tickAnim - 0) / 12) * (-46.12333-(-0.21409)));
            yy = 48.76485 + (((tickAnim - 0) / 12) * (54.69-(48.76485)));
            zz = -0.67885 + (((tickAnim - 0) / 12) * (-34.62316-(-0.67885)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -46.12333 + (((tickAnim - 12) / 13) * (-0.21409-(-46.12333)));
            yy = 54.69 + (((tickAnim - 12) / 13) * (48.76485-(54.69)));
            zz = -34.62316 + (((tickAnim - 12) / 13) * (-0.67885-(-34.62316)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (15.93072-(0)));
            yy = 21 + (((tickAnim - 0) / 12) * (-51.31613-(21)));
            zz = 25 + (((tickAnim - 0) / 12) * (3.59909-(25)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 15.93072 + (((tickAnim - 12) / 13) * (0-(15.93072)));
            yy = -51.31613 + (((tickAnim - 12) / 13) * (21-(-51.31613)));
            zz = 3.59909 + (((tickAnim - 12) / 13) * (25-(3.59909)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 28.03211 + (((tickAnim - 0) / 12) * (-88.8799-(28.03211)));
            yy = 83.2484 + (((tickAnim - 0) / 12) * (7.58387-(83.2484)));
            zz = 57.94473 + (((tickAnim - 0) / 12) * (54.3326-(57.94473)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -88.8799 + (((tickAnim - 12) / 13) * (28.03211-(-88.8799)));
            yy = 7.58387 + (((tickAnim - 12) / 13) * (83.2484-(7.58387)));
            zz = 54.3326 + (((tickAnim - 12) / 13) * (57.94473-(54.3326)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 167 + (((tickAnim - 0) / 25) * (167-(167)));
            yy = 6 + (((tickAnim - 0) / 25) * (6-(6)));
            zz = 180 + (((tickAnim - 0) / 25) * (180-(180)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 167 + (((tickAnim - 0) / 25) * (167-(167)));
            yy = -6 + (((tickAnim - 0) / 25) * (-6-(-6)));
            zz = -180 + (((tickAnim - 0) / 25) * (-180-(-180)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -40.62999 + (((tickAnim - 0) / 12) * (48.52902-(-40.62999)));
            yy = -30.58592 + (((tickAnim - 0) / 12) * (-88.44563-(-30.58592)));
            zz = -72.64934 + (((tickAnim - 0) / 12) * (-77.2515-(-72.64934)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 48.52902 + (((tickAnim - 12) / 13) * (-40.62999-(48.52902)));
            yy = -88.44563 + (((tickAnim - 12) / 13) * (-30.58592-(-88.44563)));
            zz = -77.2515 + (((tickAnim - 12) / 13) * (-72.64934-(-77.2515)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 19.50273 + (((tickAnim - 0) / 12) * (-16.8442-(19.50273)));
            yy = 67.52861 + (((tickAnim - 0) / 12) * (-18.46474-(67.52861)));
            zz = 2.65255 + (((tickAnim - 0) / 12) * (-1.24491-(2.65255)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -16.8442 + (((tickAnim - 12) / 13) * (19.50273-(-16.8442)));
            yy = -18.46474 + (((tickAnim - 12) / 13) * (67.52861-(-18.46474)));
            zz = -1.24491 + (((tickAnim - 12) / 13) * (2.65255-(-1.24491)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (8.02558-(0)));
            yy = 50 + (((tickAnim - 0) / 12) * (-38.08641-(50)));
            zz = 0 + (((tickAnim - 0) / 12) * (-9.45312-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 8.02558 + (((tickAnim - 12) / 13) * (0-(8.02558)));
            yy = -38.08641 + (((tickAnim - 12) / 13) * (50-(-38.08641)));
            zz = -9.45312 + (((tickAnim - 12) / 13) * (0-(-9.45312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (60.30774-(0)));
            yy = -20 + (((tickAnim - 0) / 12) * (-11.84428-(-20)));
            zz = 0 + (((tickAnim - 0) / 12) * (-58.15265-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 60.30774 + (((tickAnim - 12) / 13) * (0-(60.30774)));
            yy = -11.84428 + (((tickAnim - 12) / 13) * (-20-(-11.84428)));
            zz = -58.15265 + (((tickAnim - 12) / 13) * (0-(-58.15265)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0.2141 + (((tickAnim - 0) / 12) * (-41.23209-(0.2141)));
            yy = -48.7649 + (((tickAnim - 0) / 12) * (-44.26081-(-48.7649)));
            zz = -0.67885 + (((tickAnim - 0) / 12) * (37.40455-(-0.67885)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -41.23209 + (((tickAnim - 12) / 13) * (0.2141-(-41.23209)));
            yy = -44.26081 + (((tickAnim - 12) / 13) * (-48.7649-(-44.26081)));
            zz = 37.40455 + (((tickAnim - 12) / 13) * (-0.67885-(37.40455)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPlatyhystrix e = (EntityPrehistoricFloraPlatyhystrix) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.2F);
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Head, 0,0,-0.2F);
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
