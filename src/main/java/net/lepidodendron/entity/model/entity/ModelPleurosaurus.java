package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPleurosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPleurosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Eye;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer Tail7;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer cube_r18;

    private ModelAnimator animator;

    public ModelPleurosaurus() {
        this.textureWidth = 66;
        this.textureHeight = 60;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 21.2F, 0.0F);


        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.5F, -15.0F);
        this.Root.addChild(Chest);
        this.setRotateAngle(Chest, 0.0436F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 40, 0, -2.0F, -1.5F, -2.0F, 4, 4, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.0F, 4.0F);
        this.Chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.082F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 37, -1.5F, -1.0F, -6.0F, 3, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.Chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.082F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 48, -1.5F, 0.0F, -6.0F, 3, 1, 6, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Chest.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 51, 10, -1.5F, -1.5F, -4.0F, 3, 3, 4, -0.04F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.0436F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 29, 54, -0.5F, -0.49F, -7.0F, 1, 1, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 7, -1.5F, -1.5F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.5F, -7.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1972F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 1, 0.25F, 0.25F, 0.0F, 0, 1, 5, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 54, 0, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 34, 0.0F, 0.0F, 4.1F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.5F, -7.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1972F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 1, -0.25F, 0.25F, 0.0F, 0, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 0, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 34, -1.0F, 0.0F, 4.1F, 1, 1, 1, 0.0F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.Head.addChild(forehead);
        this.setRotateAngle(forehead, 0.3665F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 4, 30, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.forehead.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.288F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 18, -1.0F, -0.02F, 1.25F, 2, 1, 2, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.forehead.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.288F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 29, -0.5F, -0.01F, 0.0F, 1, 1, 2, -0.01F, false));

        this.Eye = new AdvancedModelRenderer(this);
        this.Eye.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Eye);
        this.Eye.cubeList.add(new ModelBox(Eye, 19, 20, -1.5F, -1.0F, -1.98F, 3, 1, 1, 0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0524F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 51, 24, -0.5F, -0.01F, -6.99F, 1, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 34, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.03F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5236F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 21, -1.0F, -1.98F, 0.0F, 2, 2, 1, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.0F, -7.0F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1937F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 48, -0.01F, 0.99F, 0.0F, 1, 1, 5, -0.02F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 33, -0.01F, 0.99F, 4.13F, 1, 1, 1, -0.02F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -1.0F, -7.0F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1937F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 48, -0.99F, 0.99F, 0.0F, 1, 1, 5, -0.02F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 33, -0.99F, 0.99F, 4.13F, 1, 1, 1, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.0F, -7.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1972F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.26F, 0.75F, 0.0F, 0, 1, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -1.0F, -7.0F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1972F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.26F, 0.75F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.0436F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 7, -1.5F, -0.01F, -2.0F, 3, 1, 2, -0.01F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(Throat);
        this.setRotateAngle(Throat, -0.0175F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.Throat.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1789F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 54, -1.0F, -1.0F, 0.0F, 2, 1, 4, -0.05F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Chest.addChild(Body);
        this.setRotateAngle(Body, -0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 19, 20, -2.5F, -2.0F, 0.0F, 5, 5, 9, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 15, -2.5F, -2.0F, 0.0F, 5, 5, 9, 0.01F, false));

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body2.addChild(Hips);
        this.setRotateAngle(Hips, -0.0436F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 21, 6, -2.5F, -2.0F, 0.0F, 5, 4, 9, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Hips.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 38, -2.0F, -1.0F, 0.0F, 4, 1, 9, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0436F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 0, -2.0F, -2.0F, 0.0F, 4, 4, 11, -0.01F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 19, 8, 0.0F, -2.5F, 0.0F, 0, 1, 11, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 24, 43, 0.0F, -2.5F, 0.0F, 0, 1, 10, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 29, -1.5F, -2.0F, 0.0F, 3, 4, 10, -0.02F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 37, 24, -1.0F, -1.5F, 0.0F, 2, 3, 10, 0.01F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 24, 40, 0.0F, -2.0F, 0.0F, 0, 1, 10, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 16, 34, -1.0F, -1.5F, 0.0F, 2, 3, 10, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 24, 38, 0.0F, -2.0F, 0.0F, 0, 1, 10, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 43, -0.5F, -1.0F, -0.5F, 1, 2, 10, 0.01F, false));
        this.Tail5.cubeList.add(new ModelBox(Tail5, 38, 12, 0.0F, -1.5F, -0.5F, 0, 2, 10, 0.0F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail5.addChild(Tail6);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 39, 10, -0.5F, -1.0F, -0.5F, 1, 2, 10, 0.0F, false));
        this.Tail6.cubeList.add(new ModelBox(Tail6, 24, 42, 0.0F, -1.5F, -0.5F, 0, 1, 10, 0.0F, false));

        this.Tail7 = new AdvancedModelRenderer(this);
        this.Tail7.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail6.addChild(Tail7);
        this.Tail7.cubeList.add(new ModelBox(Tail7, 12, 47, -0.5F, -0.5F, -0.5F, 1, 1, 10, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tail7.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 27, 0.0F, 0.0F, -0.5F, 0, 1, 10, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.0F, 1.0F, 7.0F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.1786F, 0.1248F, 0.3079F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 0, 0, 0.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(3.0F, 0.0F, -0.5F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, -0.6645F, -1.2923F, 0.6836F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 19, 4, 0.0F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(2.5F, 0.0F, 0.5F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.8894F, 1.2743F, -1.3439F);
        this.FootL.cubeList.add(new ModelBox(FootL, 19, 0, 0.0F, -0.5F, -1.5F, 4, 1, 3, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-2.0F, 1.0F, 7.0F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.1786F, -0.1248F, -0.3079F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 0, 0, -3.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-3.0F, 0.0F, -0.5F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, -0.6645F, 1.2923F, -0.6836F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 19, 4, -3.0F, -0.5F, -0.5F, 3, 1, 2, 0.0F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(-2.5F, 0.0F, 0.5F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.8894F, -1.2743F, 1.3439F);
        this.FootR.cubeList.add(new ModelBox(FootR, 19, 0, -4.0F, -0.5F, -1.5F, 4, 1, 3, 0.0F, true));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(1.75F, 2.0F, -1.0F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.5672F, -0.6545F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 0, 33, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.0F, 1.5272F, 0.0F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 19, 22, 0.0F, -0.51F, -0.5F, 2, 1, 1, 0.0F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.0F, -0.5672F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandL.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0714F, 0.5666F, -0.0517F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 15, 0.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-1.75F, 2.0F, -1.0F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.5672F, 0.6545F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 0, 33, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, 0.0F, -1.5272F, 0.0F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 19, 22, -2.0F, -0.51F, -0.5F, 2, 1, 1, 0.0F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.0F, 0.0F, 0.5672F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandR.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0714F, -0.5666F, 0.0517F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 15, -2.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.base.offsetZ = this.base.offsetZ + 0.7F;
        this.Root.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -1.3F;
        this.Root.offsetX = 1.1F;
        this.Root.rotateAngleY = (float)Math.toRadians(240);
        this.Root.rotateAngleX = (float)Math.toRadians(5);
        this.Root.rotateAngleZ = (float)Math.toRadians(2);
        this.Root.scaleChildren = true;
        float scaler = 0.85F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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
        EntityPrehistoricFloraPleurosaurus ee = (EntityPrehistoricFloraPleurosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()){
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            //moving in water
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


        }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPleurosaurus entity = (EntityPrehistoricFloraPleurosaurus) entitylivingbaseIn;
        int animCycle = 265;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*55))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.1583-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.00345-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*55))*-2 + (((tickAnim - 12) / 8) * (-2.95725-(-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*55))*-2)));
            yy = 0.1583 + (((tickAnim - 12) / 8) * (0.19995-(0.1583)));
            zz = 0.00345 + (((tickAnim - 12) / 8) * (0.00436-(0.00345)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.95725 + (((tickAnim - 20) / 5) * (-2.99999-(-2.95725)));
            yy = 0.19995 + (((tickAnim - 20) / 5) * (0.24994-(0.19995)));
            zz = 0.00436 + (((tickAnim - 20) / 5) * (0.00545-(0.00436)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -2.99999 + (((tickAnim - 25) / 13) * (-2.99999-(-2.99999)));
            yy = 0.24994 + (((tickAnim - 25) / 13) * (0.24994-(0.24994)));
            zz = 0.00545 + (((tickAnim - 25) / 13) * (0.00545-(0.00545)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -2.99999 + (((tickAnim - 38) / 32) * (-2.99999-(-2.99999)));
            yy = 0.24994 + (((tickAnim - 38) / 32) * (0.24994-(0.24994)));
            zz = 0.00545 + (((tickAnim - 38) / 32) * (0.00545-(0.00545)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -2.99999 + (((tickAnim - 70) / 28) * (-2.99999-(-2.99999)));
            yy = 0.24994 + (((tickAnim - 70) / 28) * (0.24994-(0.24994)));
            zz = 0.00545 + (((tickAnim - 70) / 28) * (0.00545-(0.00545)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -2.99999 + (((tickAnim - 98) / 17) * (-2.99999-(-2.99999)));
            yy = 0.24994 + (((tickAnim - 98) / 17) * (0.24994-(0.24994)));
            zz = 0.00545 + (((tickAnim - 98) / 17) * (0.00545-(0.00545)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -2.99999 + (((tickAnim - 115) / 16) * (-2.99999-(-2.99999)));
            yy = 0.24994 + (((tickAnim - 115) / 16) * (0.24994-(0.24994)));
            zz = 0.00545 + (((tickAnim - 115) / 16) * (0.00545-(0.00545)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -2.99999 + (((tickAnim - 131) / 15) * (-2.99999-(-2.99999)));
            yy = 0.24994 + (((tickAnim - 131) / 15) * (0.24994-(0.24994)));
            zz = 0.00545 + (((tickAnim - 131) / 15) * (0.00545-(0.00545)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -2.99999 + (((tickAnim - 146) / 25) * (-3.01806-(-2.99999)));
            yy = 0.24994 + (((tickAnim - 146) / 25) * (0.20994-(0.24994)));
            zz = 0.00545 + (((tickAnim - 146) / 25) * (-4.4944-(0.00545)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -3.01806 + (((tickAnim - 171) / 20) * (-3.01806-(-3.01806)));
            yy = 0.20994 + (((tickAnim - 171) / 20) * (0.20994-(0.20994)));
            zz = -4.4944 + (((tickAnim - 171) / 20) * (-4.4944-(-4.4944)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -3.01806 + (((tickAnim - 191) / 10) * (-3.01806-(-3.01806)));
            yy = 0.20994 + (((tickAnim - 191) / 10) * (0.20994-(0.20994)));
            zz = -4.4944 + (((tickAnim - 191) / 10) * (-4.4944-(-4.4944)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -3.01806 + (((tickAnim - 201) / 34) * (-3.01806-(-3.01806)));
            yy = 0.20994 + (((tickAnim - 201) / 34) * (0.20994-(0.20994)));
            zz = -4.4944 + (((tickAnim - 201) / 34) * (-4.4944-(-4.4944)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -3.01806 + (((tickAnim - 235) / 30) * (0-(-3.01806)));
            yy = 0.20994 + (((tickAnim - 235) / 30) * (0-(0.20994)));
            zz = -4.4944 + (((tickAnim - 235) / 30) * (0-(-4.4944)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0.375 + (((tickAnim - 25) / 13) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            yy = 0.375 + (((tickAnim - 38) / 32) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 70) / 28) * (0-(0)));
            yy = 0.375 + (((tickAnim - 70) / 28) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 70) / 28) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 98) / 17) * (0-(0)));
            yy = 0.375 + (((tickAnim - 98) / 17) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            yy = 0.375 + (((tickAnim - 115) / 16) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            yy = 0.375 + (((tickAnim - 131) / 15) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 131) / 15) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 146) / 25) * (0-(0)));
            yy = 0.375 + (((tickAnim - 146) / 25) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 146) / 25) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            yy = 0.375 + (((tickAnim - 171) / 20) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 171) / 20) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            yy = 0.375 + (((tickAnim - 191) / 10) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 191) / 10) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            yy = 0.375 + (((tickAnim - 201) / 34) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 201) / 34) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 235) / 30) * (0-(0)));
            yy = 0.375 + (((tickAnim - 235) / 30) * (0-(0.375)));
            zz = 0 + (((tickAnim - 235) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-21.27958-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-3.43009-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.54269-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -21.27958 + (((tickAnim - 25) / 13) * (-20.0412-(-21.27958)));
            yy = -3.43009 + (((tickAnim - 25) / 13) * (-3.89599-(-3.43009)));
            zz = -0.54269 + (((tickAnim - 25) / 13) * (-0.36081-(-0.54269)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = -20.0412 + (((tickAnim - 38) / 10) * (-19.99615-(-20.0412)));
            yy = -3.89599 + (((tickAnim - 38) / 10) * (-0.84673-(-3.89599)));
            zz = -0.36081 + (((tickAnim - 38) / 10) * (0.06171-(-0.36081)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = -19.99615 + (((tickAnim - 48) / 4) * (-19.99858-(-19.99615)));
            yy = -0.84673 + (((tickAnim - 48) / 4) * (-0.86292-(-0.84673)));
            zz = 0.06171 + (((tickAnim - 48) / 4) * (0.66175-(0.06171)));
        }
        else if (tickAnim >= 52 && tickAnim < 63) {
            xx = -19.99858 + (((tickAnim - 52) / 11) * (-19.99671-(-19.99858)));
            yy = -0.86292 + (((tickAnim - 52) / 11) * (-0.39307-(-0.86292)));
            zz = 0.66175 + (((tickAnim - 52) / 11) * (0.49075-(0.66175)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = -19.99671 + (((tickAnim - 63) / 4) * (-19.98926-(-19.99671)));
            yy = -0.39307 + (((tickAnim - 63) / 4) * (-0.3788+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(-0.39307)));
            zz = 0.49075 + (((tickAnim - 63) / 4) * (1.01757-(0.49075)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
            xx = -19.98926 + (((tickAnim - 67) / 4) * (-19.97594-(-19.98926)));
            yy = -0.3788+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 67) / 4) * (0.73891-(-0.3788+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            zz = 1.01757 + (((tickAnim - 67) / 4) * (1.409-(1.01757)));
        }
        else if (tickAnim >= 71 && tickAnim < 98) {
            xx = -19.97594 + (((tickAnim - 71) / 27) * (-19.97594-(-19.97594)));
            yy = 0.73891 + (((tickAnim - 71) / 27) * (0.73891-(0.73891)));
            zz = 1.409 + (((tickAnim - 71) / 27) * (1.409-(1.409)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -19.97594 + (((tickAnim - 98) / 17) * (-21.23859-(-19.97594)));
            yy = 0.73891 + (((tickAnim - 98) / 17) * (1.79908-(0.73891)));
            zz = 1.409 + (((tickAnim - 98) / 17) * (0.88095-(1.409)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = -21.23859 + (((tickAnim - 115) / 15) * (-21.23859-(-21.23859)));
            yy = 1.79908 + (((tickAnim - 115) / 15) * (1.79908-(1.79908)));
            zz = 0.88095 + (((tickAnim - 115) / 15) * (0.88095-(0.88095)));
        }
        else if (tickAnim >= 130 && tickAnim < 148) {
            xx = -21.23859 + (((tickAnim - 130) / 18) * (-17.5335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*110))*3-(-21.23859)));
            yy = 1.79908 + (((tickAnim - 130) / 18) * (-6.8788+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-3-(1.79908)));
            zz = 0.88095 + (((tickAnim - 130) / 18) * (0.99914-(0.88095)));
        }
        else if (tickAnim >= 148 && tickAnim < 168) {
            xx = -17.5335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*110))*3 + (((tickAnim - 148) / 20) * (-4.36231-(-17.5335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*110))*3)));
            yy = -6.8788+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-3 + (((tickAnim - 148) / 20) * (-19.61296-(-6.8788+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-3)));
            zz = 0.99914 + (((tickAnim - 148) / 20) * (-0.48533-(0.99914)));
        }
        else if (tickAnim >= 168 && tickAnim < 171) {
            xx = -4.36231 + (((tickAnim - 168) / 3) * (-2.23249-(-4.36231)));
            yy = -19.61296 + (((tickAnim - 168) / 3) * (-21.30366-(-19.61296)));
            zz = -0.48533 + (((tickAnim - 168) / 3) * (-0.66843-(-0.48533)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -2.23249 + (((tickAnim - 171) / 20) * (-1.94-(-2.23249)));
            yy = -21.30366 + (((tickAnim - 171) / 20) * (-21.33096-(-21.30366)));
            zz = -0.66843 + (((tickAnim - 171) / 20) * (-1.47298-(-0.66843)));
        }
        else if (tickAnim >= 191 && tickAnim < 197) {
            xx = -1.94 + (((tickAnim - 191) / 6) * (-5.52101-(-1.94)));
            yy = -21.33096 + (((tickAnim - 191) / 6) * (-21.52379-(-21.33096)));
            zz = -1.47298 + (((tickAnim - 191) / 6) * (-3.1846-(-1.47298)));
        }
        else if (tickAnim >= 197 && tickAnim < 201) {
            xx = -5.52101 + (((tickAnim - 197) / 4) * (-6.36458-(-5.52101)));
            yy = -21.52379 + (((tickAnim - 197) / 4) * (-21.66153-(-21.52379)));
            zz = -3.1846 + (((tickAnim - 197) / 4) * (-4.40718-(-3.1846)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -6.36458 + (((tickAnim - 201) / 34) * (-6.66691-(-6.36458)));
            yy = -21.66153 + (((tickAnim - 201) / 34) * (-21.7161-(-21.66153)));
            zz = -4.40718 + (((tickAnim - 201) / 34) * (-4.94206-(-4.40718)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -6.66691 + (((tickAnim - 235) / 30) * (0-(-6.66691)));
            yy = -21.7161 + (((tickAnim - 235) / 30) * (0-(-21.7161)));
            zz = -4.94206 + (((tickAnim - 235) / 30) * (0-(-4.94206)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 26.5 + (((tickAnim - 25) / 13) * (26.00182-(26.5)));
            yy = 0 + (((tickAnim - 25) / 13) * (-0.68516-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-0.30507-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 26.00182 + (((tickAnim - 38) / 10) * (25.8946-(26.00182)));
            yy = -0.68516 + (((tickAnim - 38) / 10) * (0.88085-(-0.68516)));
            zz = -0.30507 + (((tickAnim - 38) / 10) * (-1.51438-(-0.30507)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 25.8946 + (((tickAnim - 48) / 4) * (25.85357-(25.8946)));
            yy = 0.88085 + (((tickAnim - 48) / 4) * (3.18958-(0.88085)));
            zz = -1.51438 + (((tickAnim - 48) / 4) * (-1.07435-(-1.51438)));
        }
        else if (tickAnim >= 52 && tickAnim < 63) {
            xx = 25.85357 + (((tickAnim - 52) / 11) * (25.85357-(25.85357)));
            yy = 3.18958 + (((tickAnim - 52) / 11) * (3.18958-(3.18958)));
            zz = -1.07435 + (((tickAnim - 52) / 11) * (-1.07435-(-1.07435)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = 25.85357 + (((tickAnim - 63) / 8) * (25.90204-(25.85357)));
            yy = 3.18958 + (((tickAnim - 63) / 8) * (4.79594-(3.18958)));
            zz = -1.07435 + (((tickAnim - 63) / 8) * (-0.3783-(-1.07435)));
        }
        else if (tickAnim >= 71 && tickAnim < 98) {
            xx = 25.90204 + (((tickAnim - 71) / 27) * (25.90204-(25.90204)));
            yy = 4.79594 + (((tickAnim - 71) / 27) * (4.79594-(4.79594)));
            zz = -0.3783 + (((tickAnim - 71) / 27) * (-0.3783-(-0.3783)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 25.90204 + (((tickAnim - 98) / 17) * (25.00378-(25.90204)));
            yy = 4.79594 + (((tickAnim - 98) / 17) * (7.09627-(4.79594)));
            zz = -0.3783 + (((tickAnim - 98) / 17) * (0.60585-(-0.3783)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = 25.00378 + (((tickAnim - 115) / 15) * (25.00378-(25.00378)));
            yy = 7.09627 + (((tickAnim - 115) / 15) * (7.09627-(7.09627)));
            zz = 0.60585 + (((tickAnim - 115) / 15) * (0.60585-(0.60585)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 25.00378 + (((tickAnim - 130) / 15) * (21.42409-(25.00378)));
            yy = 7.09627 + (((tickAnim - 130) / 15) * (2.8947+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(7.09627)));
            zz = 0.60585 + (((tickAnim - 130) / 15) * (-3.7581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(0.60585)));
        }
        else if (tickAnim >= 145 && tickAnim < 171) {
            xx = 21.42409 + (((tickAnim - 145) / 26) * (14.43565-(21.42409)));
            yy = 2.8947+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 145) / 26) * (-7.30302-(2.8947+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            zz = -3.7581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 145) / 26) * (-11.78505-(-3.7581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 14.43565 + (((tickAnim - 171) / 20) * (14.43565-(14.43565)));
            yy = -7.30302 + (((tickAnim - 171) / 20) * (-7.30302-(-7.30302)));
            zz = -11.78505 + (((tickAnim - 171) / 20) * (-11.78505-(-11.78505)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 14.43565 + (((tickAnim - 191) / 10) * (15.19749-(14.43565)));
            yy = -7.30302 + (((tickAnim - 191) / 10) * (-5.86153-(-7.30302)));
            zz = -11.78505 + (((tickAnim - 191) / 10) * (-18.42333-(-11.78505)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 15.19749 + (((tickAnim - 201) / 34) * (15.19749-(15.19749)));
            yy = -5.86153 + (((tickAnim - 201) / 34) * (-5.86153-(-5.86153)));
            zz = -18.42333 + (((tickAnim - 201) / 34) * (-18.42333-(-18.42333)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 15.19749 + (((tickAnim - 235) / 30) * (0-(15.19749)));
            yy = -5.86153 + (((tickAnim - 235) / 30) * (0-(-5.86153)));
            zz = -18.42333 + (((tickAnim - 235) / 30) * (0-(-18.42333)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 4) * (0.475-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 67) / 3) * (0-(0.475)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 70) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 36) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 106) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 106) / 5) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 111) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 111) / 4) * (0-(0.45)));
            zz = 0 + (((tickAnim - 111) / 4) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 15) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 146) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 146) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 15) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 161) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 161) / 5) * (0.475-(0)));
            zz = 0 + (((tickAnim - 161) / 5) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 166) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 166) / 5) * (0-(0.475)));
            zz = 0 + (((tickAnim - 166) / 5) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 20) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 197) {
            xx = 0 + (((tickAnim - 191) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 191) / 6) * (0.5-(0)));
            zz = 0 + (((tickAnim - 191) / 6) * (0-(0)));
        }
        else if (tickAnim >= 197 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 197) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 197) / 4) * (0-(0.5)));
            zz = 0 + (((tickAnim - 197) / 4) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Eye.rotationPointX = this.Eye.rotationPointX + (float)(xx);
        this.Eye.rotationPointY = this.Eye.rotationPointY - (float)(yy);
        this.Eye.rotationPointZ = this.Eye.rotationPointZ + (float)(zz);


        if (tickAnim >= 38 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 38) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 38) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 38) / 25) * (1-(1)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 1 + (((tickAnim - 63) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 63) / 4) * (0.0375-(1)));
            zz = 1 + (((tickAnim - 63) / 4) * (1-(1)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 67) / 3) * (1-(1)));
            yy = 0.0375 + (((tickAnim - 67) / 3) * (1-(0.0375)));
            zz = 1 + (((tickAnim - 67) / 3) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 106) {
            xx = 1 + (((tickAnim - 70) / 36) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 36) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 36) * (1-(1)));
        }
        else if (tickAnim >= 106 && tickAnim < 111) {
            xx = 1 + (((tickAnim - 106) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 106) / 5) * (0.025-(1)));
            zz = 1 + (((tickAnim - 106) / 5) * (1-(1)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = 1 + (((tickAnim - 111) / 4) * (1-(1)));
            yy = 0.025 + (((tickAnim - 111) / 4) * (1-(0.025)));
            zz = 1 + (((tickAnim - 111) / 4) * (1-(1)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 1 + (((tickAnim - 115) / 16) * (1-(1)));
            yy = 1 + (((tickAnim - 115) / 16) * (1-(1)));
            zz = 1 + (((tickAnim - 115) / 16) * (1-(1)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 1 + (((tickAnim - 131) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 131) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 131) / 15) * (1-(1)));
        }
        else if (tickAnim >= 146 && tickAnim < 161) {
            xx = 1 + (((tickAnim - 146) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 146) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 146) / 15) * (1-(1)));
        }
        else if (tickAnim >= 161 && tickAnim < 166) {
            xx = 1 + (((tickAnim - 161) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 161) / 5) * (0.0525-(1)));
            zz = 1 + (((tickAnim - 161) / 5) * (1-(1)));
        }
        else if (tickAnim >= 166 && tickAnim < 171) {
            xx = 1 + (((tickAnim - 166) / 5) * (1-(1)));
            yy = 0.0525 + (((tickAnim - 166) / 5) * (1-(0.0525)));
            zz = 1 + (((tickAnim - 166) / 5) * (1-(1)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 1 + (((tickAnim - 171) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 171) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 171) / 20) * (1-(1)));
        }
        else if (tickAnim >= 191 && tickAnim < 197) {
            xx = 1 + (((tickAnim - 191) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 191) / 6) * (0.065-(1)));
            zz = 1 + (((tickAnim - 191) / 6) * (1-(1)));
        }
        else if (tickAnim >= 197 && tickAnim < 201) {
            xx = 1 + (((tickAnim - 197) / 4) * (1-(1)));
            yy = 0.065 + (((tickAnim - 197) / 4) * (1-(0.065)));
            zz = 1 + (((tickAnim - 197) / 4) * (1-(1)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 1 + (((tickAnim - 201) / 34) * (1-(1)));
            yy = 1 + (((tickAnim - 201) / 34) * (1-(1)));
            zz = 1 + (((tickAnim - 201) / 34) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -17.75 + (((tickAnim - 25) / 13) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -17.75 + (((tickAnim - 38) / 32) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 107) {
            xx = -17.75 + (((tickAnim - 70) / 37) * (-22.23734-(-17.75)));
            yy = 0 + (((tickAnim - 70) / 37) * (-0.78935-(0)));
            zz = 0 + (((tickAnim - 70) / 37) * (-1.8377-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 146) {
            xx = -22.23734 + (((tickAnim - 107) / 39) * (-5.54504-(-22.23734)));
            yy = -0.78935 + (((tickAnim - 107) / 39) * (-6.87621-(-0.78935)));
            zz = -1.8377 + (((tickAnim - 107) / 39) * (-0.72272-(-1.8377)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -5.54504 + (((tickAnim - 146) / 25) * (-6.16305-(-5.54504)));
            yy = -6.87621 + (((tickAnim - 146) / 25) * (9.68623-(-6.87621)));
            zz = -0.72272 + (((tickAnim - 146) / 25) * (-1.242-(-0.72272)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -6.16305 + (((tickAnim - 171) / 20) * (-5.26028-(-6.16305)));
            yy = 9.68623 + (((tickAnim - 171) / 20) * (5.91323-(9.68623)));
            zz = -1.242 + (((tickAnim - 171) / 20) * (3.01458-(-1.242)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -5.26028 + (((tickAnim - 191) / 10) * (-5.71198-(-5.26028)));
            yy = 5.91323 + (((tickAnim - 191) / 10) * (2.4171-(5.91323)));
            zz = 3.01458 + (((tickAnim - 191) / 10) * (11.51521-(3.01458)));
        }
        else if (tickAnim >= 201 && tickAnim < 216) {
            xx = -5.71198 + (((tickAnim - 201) / 15) * (-6.91474-(-5.71198)));
            yy = 2.4171 + (((tickAnim - 201) / 15) * (3.45365-(2.4171)));
            zz = 11.51521 + (((tickAnim - 201) / 15) * (14.82612-(11.51521)));
        }
        else if (tickAnim >= 216 && tickAnim < 235) {
            xx = -6.91474 + (((tickAnim - 216) / 19) * (-5.71198-(-6.91474)));
            yy = 3.45365 + (((tickAnim - 216) / 19) * (2.4171-(3.45365)));
            zz = 14.82612 + (((tickAnim - 216) / 19) * (11.51521-(14.82612)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -5.71198 + (((tickAnim - 235) / 30) * (0-(-5.71198)));
            yy = 2.4171 + (((tickAnim - 235) / 30) * (0-(2.4171)));
            zz = 11.51521 + (((tickAnim - 235) / 30) * (0-(11.51521)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = -0.2 + (((tickAnim - 25) / 7) * (-0.2925-(-0.2)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = -0.2925 + (((tickAnim - 32) / 6) * (-0.2-(-0.2925)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            yy = -0.2 + (((tickAnim - 38) / 32) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 70) / 37) * (0-(0)));
            yy = -0.2 + (((tickAnim - 70) / 37) * (-0.425-(-0.2)));
            zz = 0 + (((tickAnim - 70) / 37) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 107) / 39) * (0-(0)));
            yy = -0.425 + (((tickAnim - 107) / 39) * (-0.05-(-0.425)));
            zz = 0 + (((tickAnim - 107) / 39) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 146) / 45) * (0-(0)));
            yy = -0.05 + (((tickAnim - 146) / 45) * (-0.125-(-0.05)));
            zz = 0 + (((tickAnim - 146) / 45) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            yy = -0.125 + (((tickAnim - 191) / 10) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 191) / 10) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 216) {
            xx = 0 + (((tickAnim - 201) / 15) * (0-(0)));
            yy = -0.125 + (((tickAnim - 201) / 15) * (-0.05-(-0.125)));
            zz = 0 + (((tickAnim - 201) / 15) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 216) / 19) * (0-(0)));
            yy = -0.05 + (((tickAnim - 216) / 19) * (-0.125-(-0.05)));
            zz = 0 + (((tickAnim - 216) / 19) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 235) / 30) * (0-(0)));
            yy = -0.125 + (((tickAnim - 235) / 30) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 235) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(xx);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(yy);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 0) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 25) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 25) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 25) / 13) * (0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1-(1)));
            zz = 1 + (((tickAnim - 25) / 13) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 38) / 32) * (1-(1)));
            yy = 0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1 + (((tickAnim - 38) / 32) * (0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1-(0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1)));
            zz = 1 + (((tickAnim - 38) / 32) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 107) {
            xx = 1 + (((tickAnim - 70) / 37) * (1-(1)));
            yy = 0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1 + (((tickAnim - 70) / 37) * (0.7475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.2-(0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1)));
            zz = 1 + (((tickAnim - 70) / 37) * (1-(1)));
        }
        else if (tickAnim >= 107 && tickAnim < 146) {
            xx = 1 + (((tickAnim - 107) / 39) * (1-(1)));
            yy = 0.7475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.2 + (((tickAnim - 107) / 39) * (0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1-(0.7475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.2)));
            zz = 1 + (((tickAnim - 107) / 39) * (1-(1)));
        }
        else if (tickAnim >= 146 && tickAnim < 191) {
            xx = 1 + (((tickAnim - 146) / 45) * (1-(1)));
            yy = 0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1 + (((tickAnim - 146) / 45) * (1-(0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1)));
            zz = 1 + (((tickAnim - 146) / 45) * (1-(1)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 1 + (((tickAnim - 191) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 191) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 191) / 10) * (1-(1)));
        }
        else if (tickAnim >= 201 && tickAnim < 216) {
            xx = 1 + (((tickAnim - 201) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 201) / 15) * (0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1-(1)));
            zz = 1 + (((tickAnim - 201) / 15) * (1-(1)));
        }
        else if (tickAnim >= 216 && tickAnim < 235) {
            xx = 1 + (((tickAnim - 216) / 19) * (1-(1)));
            yy = 0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1 + (((tickAnim - 216) / 19) * (1-(0.9475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.3))*0.1)));
            zz = 1 + (((tickAnim - 216) / 19) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 1.5 + (((tickAnim - 25) / 13) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            yy = 1.5 + (((tickAnim - 38) / 32) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 70) / 28) * (0-(0)));
            yy = 1.5 + (((tickAnim - 70) / 28) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 70) / 28) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 98) / 17) * (0-(0)));
            yy = 1.5 + (((tickAnim - 98) / 17) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            yy = 1.5 + (((tickAnim - 115) / 16) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            yy = 1.5 + (((tickAnim - 131) / 15) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 131) / 15) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 146) / 25) * (0.15518-(0)));
            yy = 1.5 + (((tickAnim - 146) / 25) * (1.73264-(1.5)));
            zz = 0 + (((tickAnim - 146) / 25) * (5.49727-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 0.15518 + (((tickAnim - 171) / 20) * (0.15518-(0.15518)));
            yy = 1.73264 + (((tickAnim - 171) / 20) * (1.73264-(1.73264)));
            zz = 5.49727 + (((tickAnim - 171) / 20) * (5.49727-(5.49727)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 0.15518 + (((tickAnim - 191) / 10) * (0.15518-(0.15518)));
            yy = 1.73264 + (((tickAnim - 191) / 10) * (1.73264-(1.73264)));
            zz = 5.49727 + (((tickAnim - 191) / 10) * (5.49727-(5.49727)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 0.15518 + (((tickAnim - 201) / 34) * (0.15518-(0.15518)));
            yy = 1.73264 + (((tickAnim - 201) / 34) * (1.73264-(1.73264)));
            zz = 5.49727 + (((tickAnim - 201) / 34) * (5.49727-(5.49727)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 0.15518 + (((tickAnim - 235) / 30) * (0-(0.15518)));
            yy = 1.73264 + (((tickAnim - 235) / 30) * (0-(1.73264)));
            zz = 5.49727 + (((tickAnim - 235) / 30) * (0-(5.49727)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-4.75-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -4.75 + (((tickAnim - 25) / 13) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            yy = -4.75 + (((tickAnim - 38) / 32) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 70) / 28) * (0-(0)));
            yy = -4.75 + (((tickAnim - 70) / 28) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 70) / 28) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 98) / 17) * (0-(0)));
            yy = -4.75 + (((tickAnim - 98) / 17) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            yy = -4.75 + (((tickAnim - 115) / 16) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            yy = -4.75 + (((tickAnim - 131) / 15) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 131) / 15) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 146) / 25) * (0-(0)));
            yy = -4.75 + (((tickAnim - 146) / 25) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 146) / 25) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            yy = -4.75 + (((tickAnim - 171) / 20) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 171) / 20) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            yy = -4.75 + (((tickAnim - 191) / 10) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 191) / 10) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            yy = -4.75 + (((tickAnim - 201) / 34) * (-4.75-(-4.75)));
            zz = 0 + (((tickAnim - 201) / 34) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 235) / 30) * (0-(0)));
            yy = -4.75 + (((tickAnim - 235) / 30) * (0-(-4.75)));
            zz = 0 + (((tickAnim - 235) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -2.25 + (((tickAnim - 25) / 13) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            yy = -2.25 + (((tickAnim - 38) / 32) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 70) / 28) * (0-(0)));
            yy = -2.25 + (((tickAnim - 70) / 28) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 70) / 28) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 98) / 17) * (0-(0)));
            yy = -2.25 + (((tickAnim - 98) / 17) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            yy = -2.25 + (((tickAnim - 115) / 16) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            yy = -2.25 + (((tickAnim - 131) / 15) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 131) / 15) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 146) / 25) * (0-(0)));
            yy = -2.25 + (((tickAnim - 146) / 25) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 146) / 25) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            yy = -2.25 + (((tickAnim - 171) / 20) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 171) / 20) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            yy = -2.25 + (((tickAnim - 191) / 10) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 191) / 10) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            yy = -2.25 + (((tickAnim - 201) / 34) * (-2.25-(-2.25)));
            zz = 0 + (((tickAnim - 201) / 34) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 235) / 30) * (0-(0)));
            yy = -2.25 + (((tickAnim - 235) / 30) * (0-(-2.25)));
            zz = 0 + (((tickAnim - 235) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.0746+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.45005-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.00612-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 4.0746+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1 + (((tickAnim - 18) / 7) * (4.99943-(4.0746+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*1)));
            yy = -2.45005 + (((tickAnim - 18) / 7) * (-3.50008-(-2.45005)));
            zz = 0.00612 + (((tickAnim - 18) / 7) * (0.00874-(0.00612)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 4.99943 + (((tickAnim - 25) / 13) * (4.99943-(4.99943)));
            yy = -3.50008 + (((tickAnim - 25) / 13) * (-3.50008-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 25) / 13) * (0.00874-(0.00874)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 4.99943 + (((tickAnim - 38) / 32) * (4.99943-(4.99943)));
            yy = -3.50008 + (((tickAnim - 38) / 32) * (-3.50008-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 38) / 32) * (0.00874-(0.00874)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 4.99943 + (((tickAnim - 70) / 28) * (4.99943-(4.99943)));
            yy = -3.50008 + (((tickAnim - 70) / 28) * (-3.50008-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 70) / 28) * (0.00874-(0.00874)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 4.99943 + (((tickAnim - 98) / 17) * (4.99943-(4.99943)));
            yy = -3.50008 + (((tickAnim - 98) / 17) * (-3.50008-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 98) / 17) * (0.00874-(0.00874)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 4.99943 + (((tickAnim - 115) / 16) * (4.99943-(4.99943)));
            yy = -3.50008 + (((tickAnim - 115) / 16) * (-3.50008-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 115) / 16) * (0.00874-(0.00874)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 4.99943 + (((tickAnim - 131) / 15) * (4.99943-(4.99943)));
            yy = -3.50008 + (((tickAnim - 131) / 15) * (-3.50008-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 131) / 15) * (0.00874-(0.00874)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 4.99943 + (((tickAnim - 146) / 25) * (4.99943-(4.99943)));
            yy = -3.50008 + (((tickAnim - 146) / 25) * (-3.50008-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 146) / 25) * (0.00874-(0.00874)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 4.99943 + (((tickAnim - 171) / 20) * (4.99943-(4.99943)));
            yy = -3.50008 + (((tickAnim - 171) / 20) * (-3.50008-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 171) / 20) * (0.00874-(0.00874)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 4.99943 + (((tickAnim - 191) / 10) * (4.99943-(4.99943)));
            yy = -3.50008 + (((tickAnim - 191) / 10) * (-3.50008-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 191) / 10) * (0.00874-(0.00874)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 4.99943 + (((tickAnim - 201) / 34) * (4.99943-(4.99943)));
            yy = -3.50008 + (((tickAnim - 201) / 34) * (-3.50008-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 201) / 34) * (0.00874-(0.00874)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 4.99943 + (((tickAnim - 235) / 30) * (0-(4.99943)));
            yy = -3.50008 + (((tickAnim - 235) / 30) * (0-(-3.50008)));
            zz = 0.00874 + (((tickAnim - 235) / 30) * (0-(0.00874)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -1.25 + (((tickAnim - 25) / 13) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -1.25 + (((tickAnim - 38) / 32) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -1.25 + (((tickAnim - 70) / 28) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 70) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 28) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -1.25 + (((tickAnim - 98) / 17) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 98) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -1.25 + (((tickAnim - 115) / 16) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -1.25 + (((tickAnim - 131) / 15) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 15) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -1.25 + (((tickAnim - 146) / 25) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 146) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 25) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -1.25 + (((tickAnim - 171) / 20) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 20) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -1.25 + (((tickAnim - 191) / 10) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 10) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -1.25 + (((tickAnim - 201) / 34) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 34) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -1.25 + (((tickAnim - 235) / 30) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 235) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.3248-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.92498-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.00841-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3.3248 + (((tickAnim - 18) / 7) * (-2.87471-(-3.3248)));
            yy = 1.92498 + (((tickAnim - 18) / 7) * (2.74997-(1.92498)));
            zz = 0.00841 + (((tickAnim - 18) / 7) * (0.01201-(0.00841)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -2.87471 + (((tickAnim - 25) / 13) * (-2.87471-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 25) / 13) * (2.74997-(2.74997)));
            zz = 0.01201 + (((tickAnim - 25) / 13) * (0.01201-(0.01201)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -2.87471 + (((tickAnim - 38) / 32) * (-2.87471-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 38) / 32) * (2.74997-(2.74997)));
            zz = 0.01201 + (((tickAnim - 38) / 32) * (0.01201-(0.01201)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -2.87471 + (((tickAnim - 70) / 28) * (-2.87471-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 70) / 28) * (2.74997-(2.74997)));
            zz = 0.01201 + (((tickAnim - 70) / 28) * (0.01201-(0.01201)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -2.87471 + (((tickAnim - 98) / 17) * (-2.87471-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 98) / 17) * (2.74997-(2.74997)));
            zz = 0.01201 + (((tickAnim - 98) / 17) * (0.01201-(0.01201)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -2.87471 + (((tickAnim - 115) / 16) * (-2.87471-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 115) / 16) * (2.74997-(2.74997)));
            zz = 0.01201 + (((tickAnim - 115) / 16) * (0.01201-(0.01201)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -2.87471 + (((tickAnim - 131) / 15) * (-2.87471-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 131) / 15) * (2.74997-(2.74997)));
            zz = 0.01201 + (((tickAnim - 131) / 15) * (0.01201-(0.01201)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -2.87471 + (((tickAnim - 146) / 25) * (-2.87471-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 146) / 25) * (2.74997-(2.74997)));
            zz = 0.01201 + (((tickAnim - 146) / 25) * (0.01201-(0.01201)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -2.87471 + (((tickAnim - 171) / 20) * (-2.87471-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 171) / 20) * (2.74997-(2.74997)));
            zz = 0.01201 + (((tickAnim - 171) / 20) * (0.01201-(0.01201)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -2.87471 + (((tickAnim - 191) / 10) * (-2.87471-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 191) / 10) * (2.74997-(2.74997)));
            zz = 0.01201 + (((tickAnim - 191) / 10) * (0.01201-(0.01201)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -2.87471 + (((tickAnim - 201) / 34) * (-2.87471-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 201) / 34) * (2.74997-(2.74997)));
            zz = 0.01201 + (((tickAnim - 201) / 34) * (0.01201-(0.01201)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -2.87471 + (((tickAnim - 235) / 30) * (0-(-2.87471)));
            yy = 2.74997 + (((tickAnim - 235) / 30) * (0-(2.74997)));
            zz = 0.01201 + (((tickAnim - 235) / 30) * (0-(0.01201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (3.75-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 3.75 + (((tickAnim - 25) / 13) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            yy = 3.75 + (((tickAnim - 38) / 32) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 70) / 28) * (0-(0)));
            yy = 3.75 + (((tickAnim - 70) / 28) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 70) / 28) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 98) / 17) * (0-(0)));
            yy = 3.75 + (((tickAnim - 98) / 17) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            yy = 3.75 + (((tickAnim - 115) / 16) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            yy = 3.75 + (((tickAnim - 131) / 15) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 131) / 15) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 146) / 25) * (0-(0)));
            yy = 3.75 + (((tickAnim - 146) / 25) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 146) / 25) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            yy = 3.75 + (((tickAnim - 171) / 20) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 171) / 20) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            yy = 3.75 + (((tickAnim - 191) / 10) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 191) / 10) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            yy = 3.75 + (((tickAnim - 201) / 34) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 201) / 34) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 235) / 30) * (0-(0)));
            yy = 3.75 + (((tickAnim - 235) / 30) * (0-(3.75)));
            zz = 0 + (((tickAnim - 235) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1.98486-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (5.74209-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.30194-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 1.98486 + (((tickAnim - 25) / 13) * (1.98486-(1.98486)));
            yy = 5.74209 + (((tickAnim - 25) / 13) * (5.74209-(5.74209)));
            zz = -0.30194 + (((tickAnim - 25) / 13) * (-0.30194-(-0.30194)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 1.98486 + (((tickAnim - 38) / 32) * (1.98486-(1.98486)));
            yy = 5.74209 + (((tickAnim - 38) / 32) * (5.74209-(5.74209)));
            zz = -0.30194 + (((tickAnim - 38) / 32) * (-0.30194-(-0.30194)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 1.98486 + (((tickAnim - 70) / 28) * (1.98486-(1.98486)));
            yy = 5.74209 + (((tickAnim - 70) / 28) * (5.74209-(5.74209)));
            zz = -0.30194 + (((tickAnim - 70) / 28) * (-0.30194-(-0.30194)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 1.98486 + (((tickAnim - 98) / 17) * (1.98486-(1.98486)));
            yy = 5.74209 + (((tickAnim - 98) / 17) * (5.74209-(5.74209)));
            zz = -0.30194 + (((tickAnim - 98) / 17) * (-0.30194-(-0.30194)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 1.98486 + (((tickAnim - 115) / 16) * (1.98486-(1.98486)));
            yy = 5.74209 + (((tickAnim - 115) / 16) * (5.74209-(5.74209)));
            zz = -0.30194 + (((tickAnim - 115) / 16) * (-0.30194-(-0.30194)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 1.98486 + (((tickAnim - 131) / 15) * (1.98486-(1.98486)));
            yy = 5.74209 + (((tickAnim - 131) / 15) * (5.74209-(5.74209)));
            zz = -0.30194 + (((tickAnim - 131) / 15) * (-0.30194-(-0.30194)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 1.98486 + (((tickAnim - 146) / 25) * (1.98486-(1.98486)));
            yy = 5.74209 + (((tickAnim - 146) / 25) * (5.74209-(5.74209)));
            zz = -0.30194 + (((tickAnim - 146) / 25) * (-0.30194-(-0.30194)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 1.98486 + (((tickAnim - 171) / 20) * (1.98486-(1.98486)));
            yy = 5.74209 + (((tickAnim - 171) / 20) * (5.74209-(5.74209)));
            zz = -0.30194 + (((tickAnim - 171) / 20) * (-0.30194-(-0.30194)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 1.98486 + (((tickAnim - 191) / 10) * (1.98486-(1.98486)));
            yy = 5.74209 + (((tickAnim - 191) / 10) * (5.74209-(5.74209)));
            zz = -0.30194 + (((tickAnim - 191) / 10) * (-0.30194-(-0.30194)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 1.98486 + (((tickAnim - 201) / 34) * (1.98486-(1.98486)));
            yy = 5.74209 + (((tickAnim - 201) / 34) * (5.74209-(5.74209)));
            zz = -0.30194 + (((tickAnim - 201) / 34) * (-0.30194-(-0.30194)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 1.98486 + (((tickAnim - 235) / 30) * (0-(1.98486)));
            yy = 5.74209 + (((tickAnim - 235) / 30) * (0-(5.74209)));
            zz = -0.30194 + (((tickAnim - 235) / 30) * (0-(-0.30194)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.61995-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (9.94002-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.84335-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.61995 + (((tickAnim - 18) / 7) * (-0.34993-(-0.61995)));
            yy = 9.94002 + (((tickAnim - 18) / 7) * (14.20003-(9.94002)));
            zz = 0.84335 + (((tickAnim - 18) / 7) * (1.20479-(0.84335)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -0.34993 + (((tickAnim - 25) / 13) * (-0.34993-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 25) / 13) * (14.20003-(14.20003)));
            zz = 1.20479 + (((tickAnim - 25) / 13) * (1.20479-(1.20479)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -0.34993 + (((tickAnim - 38) / 32) * (-0.34993-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 38) / 32) * (14.20003-(14.20003)));
            zz = 1.20479 + (((tickAnim - 38) / 32) * (1.20479-(1.20479)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -0.34993 + (((tickAnim - 70) / 28) * (-0.34993-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 70) / 28) * (14.20003-(14.20003)));
            zz = 1.20479 + (((tickAnim - 70) / 28) * (1.20479-(1.20479)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -0.34993 + (((tickAnim - 98) / 17) * (-0.34993-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 98) / 17) * (14.20003-(14.20003)));
            zz = 1.20479 + (((tickAnim - 98) / 17) * (1.20479-(1.20479)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -0.34993 + (((tickAnim - 115) / 16) * (-0.34993-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 115) / 16) * (14.20003-(14.20003)));
            zz = 1.20479 + (((tickAnim - 115) / 16) * (1.20479-(1.20479)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -0.34993 + (((tickAnim - 131) / 15) * (-0.34993-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 131) / 15) * (14.20003-(14.20003)));
            zz = 1.20479 + (((tickAnim - 131) / 15) * (1.20479-(1.20479)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -0.34993 + (((tickAnim - 146) / 25) * (-0.34993-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 146) / 25) * (14.20003-(14.20003)));
            zz = 1.20479 + (((tickAnim - 146) / 25) * (1.20479-(1.20479)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -0.34993 + (((tickAnim - 171) / 20) * (-0.34993-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 171) / 20) * (14.20003-(14.20003)));
            zz = 1.20479 + (((tickAnim - 171) / 20) * (1.20479-(1.20479)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -0.34993 + (((tickAnim - 191) / 10) * (-0.34993-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 191) / 10) * (14.20003-(14.20003)));
            zz = 1.20479 + (((tickAnim - 191) / 10) * (1.20479-(1.20479)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -0.34993 + (((tickAnim - 201) / 34) * (-0.34993-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 201) / 34) * (14.20003-(14.20003)));
            zz = 1.20479 + (((tickAnim - 201) / 34) * (1.20479-(1.20479)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -0.34993 + (((tickAnim - 235) / 30) * (0-(-0.34993)));
            yy = 14.20003 + (((tickAnim - 235) / 30) * (0-(14.20003)));
            zz = 1.20479 + (((tickAnim - 235) / 30) * (0-(1.20479)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.88913-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (25.49376-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.41957-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -1.88913 + (((tickAnim - 25) / 13) * (-1.88913-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 25) / 13) * (25.49376-(25.49376)));
            zz = -0.41957 + (((tickAnim - 25) / 13) * (-0.41957-(-0.41957)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -1.88913 + (((tickAnim - 38) / 32) * (-1.88913-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 38) / 32) * (25.49376-(25.49376)));
            zz = -0.41957 + (((tickAnim - 38) / 32) * (-0.41957-(-0.41957)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -1.88913 + (((tickAnim - 70) / 28) * (-1.88913-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 70) / 28) * (25.49376-(25.49376)));
            zz = -0.41957 + (((tickAnim - 70) / 28) * (-0.41957-(-0.41957)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -1.88913 + (((tickAnim - 98) / 17) * (-1.88913-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 98) / 17) * (25.49376-(25.49376)));
            zz = -0.41957 + (((tickAnim - 98) / 17) * (-0.41957-(-0.41957)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -1.88913 + (((tickAnim - 115) / 16) * (-1.88913-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 115) / 16) * (25.49376-(25.49376)));
            zz = -0.41957 + (((tickAnim - 115) / 16) * (-0.41957-(-0.41957)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -1.88913 + (((tickAnim - 131) / 15) * (-1.88913-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 131) / 15) * (25.49376-(25.49376)));
            zz = -0.41957 + (((tickAnim - 131) / 15) * (-0.41957-(-0.41957)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -1.88913 + (((tickAnim - 146) / 25) * (-1.88913-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 146) / 25) * (25.49376-(25.49376)));
            zz = -0.41957 + (((tickAnim - 146) / 25) * (-0.41957-(-0.41957)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -1.88913 + (((tickAnim - 171) / 20) * (-1.88913-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 171) / 20) * (25.49376-(25.49376)));
            zz = -0.41957 + (((tickAnim - 171) / 20) * (-0.41957-(-0.41957)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -1.88913 + (((tickAnim - 191) / 10) * (-1.88913-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 191) / 10) * (25.49376-(25.49376)));
            zz = -0.41957 + (((tickAnim - 191) / 10) * (-0.41957-(-0.41957)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -1.88913 + (((tickAnim - 201) / 34) * (-1.88913-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 201) / 34) * (25.49376-(25.49376)));
            zz = -0.41957 + (((tickAnim - 201) / 34) * (-0.41957-(-0.41957)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -1.88913 + (((tickAnim - 235) / 30) * (0-(-1.88913)));
            yy = 25.49376 + (((tickAnim - 235) / 30) * (0-(25.49376)));
            zz = -0.41957 + (((tickAnim - 235) / 30) * (0-(-0.41957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail7, Tail7.rotateAngleX + (float) Math.toRadians(xx), Tail7.rotateAngleY + (float) Math.toRadians(yy), Tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-0.11374-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (1.29711-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-24.5197-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -0.11374 + (((tickAnim - 25) / 13) * (-0.11374-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 25) / 13) * (1.29711-(1.29711)));
            zz = -24.5197 + (((tickAnim - 25) / 13) * (-24.5197-(-24.5197)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -0.11374 + (((tickAnim - 38) / 32) * (-0.11374-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 38) / 32) * (1.29711-(1.29711)));
            zz = -24.5197 + (((tickAnim - 38) / 32) * (-24.5197-(-24.5197)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -0.11374 + (((tickAnim - 70) / 28) * (-0.11374-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 70) / 28) * (1.29711-(1.29711)));
            zz = -24.5197 + (((tickAnim - 70) / 28) * (-24.5197-(-24.5197)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -0.11374 + (((tickAnim - 98) / 17) * (-0.11374-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 98) / 17) * (1.29711-(1.29711)));
            zz = -24.5197 + (((tickAnim - 98) / 17) * (-24.5197-(-24.5197)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -0.11374 + (((tickAnim - 115) / 16) * (-0.11374-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 115) / 16) * (1.29711-(1.29711)));
            zz = -24.5197 + (((tickAnim - 115) / 16) * (-24.5197-(-24.5197)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -0.11374 + (((tickAnim - 131) / 15) * (-0.11374-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 131) / 15) * (1.29711-(1.29711)));
            zz = -24.5197 + (((tickAnim - 131) / 15) * (-24.5197-(-24.5197)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -0.11374 + (((tickAnim - 146) / 25) * (-0.11374-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 146) / 25) * (1.29711-(1.29711)));
            zz = -24.5197 + (((tickAnim - 146) / 25) * (-24.5197-(-24.5197)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -0.11374 + (((tickAnim - 171) / 20) * (-0.11374-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 171) / 20) * (1.29711-(1.29711)));
            zz = -24.5197 + (((tickAnim - 171) / 20) * (-24.5197-(-24.5197)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -0.11374 + (((tickAnim - 191) / 10) * (-0.11374-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 191) / 10) * (1.29711-(1.29711)));
            zz = -24.5197 + (((tickAnim - 191) / 10) * (-24.5197-(-24.5197)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -0.11374 + (((tickAnim - 201) / 34) * (-0.11374-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 201) / 34) * (1.29711-(1.29711)));
            zz = -24.5197 + (((tickAnim - 201) / 34) * (-24.5197-(-24.5197)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -0.11374 + (((tickAnim - 235) / 30) * (0-(-0.11374)));
            yy = 1.29711 + (((tickAnim - 235) / 30) * (0-(1.29711)));
            zz = -24.5197 + (((tickAnim - 235) / 30) * (0-(-24.5197)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            yy = 0.375 + (((tickAnim - 17) / 7) * (0-(0.375)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegL.rotationPointX = this.UpperLegL.rotationPointX + (float)(xx);
        this.UpperLegL.rotationPointY = this.UpperLegL.rotationPointY - (float)(yy);
        this.UpperLegL.rotationPointZ = this.UpperLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 5.5 + (((tickAnim - 25) / 13) * (5.5-(5.5)));
            yy = 10 + (((tickAnim - 25) / 13) * (10-(10)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 5.5 + (((tickAnim - 38) / 32) * (5.5-(5.5)));
            yy = 10 + (((tickAnim - 38) / 32) * (10-(10)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 5.5 + (((tickAnim - 70) / 28) * (5.5-(5.5)));
            yy = 10 + (((tickAnim - 70) / 28) * (10-(10)));
            zz = 0 + (((tickAnim - 70) / 28) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 5.5 + (((tickAnim - 98) / 17) * (5.5-(5.5)));
            yy = 10 + (((tickAnim - 98) / 17) * (10-(10)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 5.5 + (((tickAnim - 115) / 16) * (5.5-(5.5)));
            yy = 10 + (((tickAnim - 115) / 16) * (10-(10)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 5.5 + (((tickAnim - 131) / 15) * (5.5-(5.5)));
            yy = 10 + (((tickAnim - 131) / 15) * (10-(10)));
            zz = 0 + (((tickAnim - 131) / 15) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 5.5 + (((tickAnim - 146) / 25) * (5.5-(5.5)));
            yy = 10 + (((tickAnim - 146) / 25) * (10-(10)));
            zz = 0 + (((tickAnim - 146) / 25) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 5.5 + (((tickAnim - 171) / 20) * (5.5-(5.5)));
            yy = 10 + (((tickAnim - 171) / 20) * (10-(10)));
            zz = 0 + (((tickAnim - 171) / 20) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 5.5 + (((tickAnim - 191) / 10) * (5.5-(5.5)));
            yy = 10 + (((tickAnim - 191) / 10) * (10-(10)));
            zz = 0 + (((tickAnim - 191) / 10) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 5.5 + (((tickAnim - 201) / 34) * (5.5-(5.5)));
            yy = 10 + (((tickAnim - 201) / 34) * (10-(10)));
            zz = 0 + (((tickAnim - 201) / 34) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 5.5 + (((tickAnim - 235) / 30) * (0-(5.5)));
            yy = 10 + (((tickAnim - 235) / 30) * (0-(10)));
            zz = 0 + (((tickAnim - 235) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (102.63618-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (4.42223-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (102.12817-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 102.63618 + (((tickAnim - 25) / 13) * (102.63618-(102.63618)));
            yy = 4.42223 + (((tickAnim - 25) / 13) * (4.42223-(4.42223)));
            zz = 102.12817 + (((tickAnim - 25) / 13) * (102.12817-(102.12817)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 102.63618 + (((tickAnim - 38) / 32) * (102.63618-(102.63618)));
            yy = 4.42223 + (((tickAnim - 38) / 32) * (4.42223-(4.42223)));
            zz = 102.12817 + (((tickAnim - 38) / 32) * (102.12817-(102.12817)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 102.63618 + (((tickAnim - 70) / 28) * (102.63618-(102.63618)));
            yy = 4.42223 + (((tickAnim - 70) / 28) * (4.42223-(4.42223)));
            zz = 102.12817 + (((tickAnim - 70) / 28) * (102.12817-(102.12817)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 102.63618 + (((tickAnim - 98) / 17) * (102.63618-(102.63618)));
            yy = 4.42223 + (((tickAnim - 98) / 17) * (4.42223-(4.42223)));
            zz = 102.12817 + (((tickAnim - 98) / 17) * (102.12817-(102.12817)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 102.63618 + (((tickAnim - 115) / 16) * (102.63618-(102.63618)));
            yy = 4.42223 + (((tickAnim - 115) / 16) * (4.42223-(4.42223)));
            zz = 102.12817 + (((tickAnim - 115) / 16) * (102.12817-(102.12817)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 102.63618 + (((tickAnim - 131) / 15) * (102.63618-(102.63618)));
            yy = 4.42223 + (((tickAnim - 131) / 15) * (4.42223-(4.42223)));
            zz = 102.12817 + (((tickAnim - 131) / 15) * (102.12817-(102.12817)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 102.63618 + (((tickAnim - 146) / 25) * (102.63618-(102.63618)));
            yy = 4.42223 + (((tickAnim - 146) / 25) * (4.42223-(4.42223)));
            zz = 102.12817 + (((tickAnim - 146) / 25) * (102.12817-(102.12817)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 102.63618 + (((tickAnim - 171) / 20) * (102.63618-(102.63618)));
            yy = 4.42223 + (((tickAnim - 171) / 20) * (4.42223-(4.42223)));
            zz = 102.12817 + (((tickAnim - 171) / 20) * (102.12817-(102.12817)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 102.63618 + (((tickAnim - 191) / 10) * (102.63618-(102.63618)));
            yy = 4.42223 + (((tickAnim - 191) / 10) * (4.42223-(4.42223)));
            zz = 102.12817 + (((tickAnim - 191) / 10) * (102.12817-(102.12817)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 102.63618 + (((tickAnim - 201) / 34) * (102.63618-(102.63618)));
            yy = 4.42223 + (((tickAnim - 201) / 34) * (4.42223-(4.42223)));
            zz = 102.12817 + (((tickAnim - 201) / 34) * (102.12817-(102.12817)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 102.63618 + (((tickAnim - 235) / 30) * (0-(102.63618)));
            yy = 4.42223 + (((tickAnim - 235) / 30) * (0-(4.42223)));
            zz = 102.12817 + (((tickAnim - 235) / 30) * (0-(102.12817)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-0.1424-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-1.09402-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (18.94763-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -0.1424 + (((tickAnim - 19) / 6) * (0.02149-(-0.1424)));
            yy = -1.09402 + (((tickAnim - 19) / 6) * (-1.67774-(-1.09402)));
            zz = 18.94763 + (((tickAnim - 19) / 6) * (23.31925-(18.94763)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0.02149 + (((tickAnim - 25) / 13) * (-0.09226-(0.02149)));
            yy = -1.67774 + (((tickAnim - 25) / 13) * (-1.54404-(-1.67774)));
            zz = 23.31925 + (((tickAnim - 25) / 13) * (24.06595-(23.31925)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -0.09226 + (((tickAnim - 38) / 32) * (-0.09226-(-0.09226)));
            yy = -1.54404 + (((tickAnim - 38) / 32) * (-1.54404-(-1.54404)));
            zz = 24.06595 + (((tickAnim - 38) / 32) * (24.06595-(24.06595)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -0.09226 + (((tickAnim - 70) / 28) * (-0.09226-(-0.09226)));
            yy = -1.54404 + (((tickAnim - 70) / 28) * (-1.54404-(-1.54404)));
            zz = 24.06595 + (((tickAnim - 70) / 28) * (24.06595-(24.06595)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -0.09226 + (((tickAnim - 98) / 17) * (-0.09226-(-0.09226)));
            yy = -1.54404 + (((tickAnim - 98) / 17) * (-1.54404-(-1.54404)));
            zz = 24.06595 + (((tickAnim - 98) / 17) * (24.06595-(24.06595)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -0.09226 + (((tickAnim - 115) / 16) * (-0.09226-(-0.09226)));
            yy = -1.54404 + (((tickAnim - 115) / 16) * (-1.54404-(-1.54404)));
            zz = 24.06595 + (((tickAnim - 115) / 16) * (24.06595-(24.06595)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -0.09226 + (((tickAnim - 131) / 15) * (-0.09226-(-0.09226)));
            yy = -1.54404 + (((tickAnim - 131) / 15) * (-1.54404-(-1.54404)));
            zz = 24.06595 + (((tickAnim - 131) / 15) * (24.06595-(24.06595)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -0.09226 + (((tickAnim - 146) / 25) * (-0.09226-(-0.09226)));
            yy = -1.54404 + (((tickAnim - 146) / 25) * (-1.54404-(-1.54404)));
            zz = 24.06595 + (((tickAnim - 146) / 25) * (24.06595-(24.06595)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -0.09226 + (((tickAnim - 171) / 20) * (-0.09226-(-0.09226)));
            yy = -1.54404 + (((tickAnim - 171) / 20) * (-1.54404-(-1.54404)));
            zz = 24.06595 + (((tickAnim - 171) / 20) * (24.06595-(24.06595)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -0.09226 + (((tickAnim - 191) / 10) * (-0.09226-(-0.09226)));
            yy = -1.54404 + (((tickAnim - 191) / 10) * (-1.54404-(-1.54404)));
            zz = 24.06595 + (((tickAnim - 191) / 10) * (24.06595-(24.06595)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -0.09226 + (((tickAnim - 201) / 34) * (-0.09226-(-0.09226)));
            yy = -1.54404 + (((tickAnim - 201) / 34) * (-1.54404-(-1.54404)));
            zz = 24.06595 + (((tickAnim - 201) / 34) * (24.06595-(24.06595)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -0.09226 + (((tickAnim - 235) / 30) * (0-(-0.09226)));
            yy = -1.54404 + (((tickAnim - 235) / 30) * (0-(-1.54404)));
            zz = 24.06595 + (((tickAnim - 235) / 30) * (0-(24.06595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 19) / 5) * (0-(0.2)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegR.rotationPointX = this.UpperLegR.rotationPointX + (float)(xx);
        this.UpperLegR.rotationPointY = this.UpperLegR.rotationPointY - (float)(yy);
        this.UpperLegR.rotationPointZ = this.UpperLegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.71431-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-3.28441-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-16.73067-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -2.71431 + (((tickAnim - 25) / 13) * (-2.71431-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 25) / 13) * (-3.28441-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 25) / 13) * (-16.73067-(-16.73067)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -2.71431 + (((tickAnim - 38) / 32) * (-2.71431-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 38) / 32) * (-3.28441-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 38) / 32) * (-16.73067-(-16.73067)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -2.71431 + (((tickAnim - 70) / 28) * (-2.71431-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 70) / 28) * (-3.28441-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 70) / 28) * (-16.73067-(-16.73067)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -2.71431 + (((tickAnim - 98) / 17) * (-2.71431-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 98) / 17) * (-3.28441-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 98) / 17) * (-16.73067-(-16.73067)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -2.71431 + (((tickAnim - 115) / 16) * (-2.71431-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 115) / 16) * (-3.28441-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 115) / 16) * (-16.73067-(-16.73067)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -2.71431 + (((tickAnim - 131) / 15) * (-2.71431-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 131) / 15) * (-3.28441-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 131) / 15) * (-16.73067-(-16.73067)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -2.71431 + (((tickAnim - 146) / 25) * (-2.71431-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 146) / 25) * (-3.28441-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 146) / 25) * (-16.73067-(-16.73067)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -2.71431 + (((tickAnim - 171) / 20) * (-2.71431-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 171) / 20) * (-3.28441-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 171) / 20) * (-16.73067-(-16.73067)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -2.71431 + (((tickAnim - 191) / 10) * (-2.71431-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 191) / 10) * (-3.28441-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 191) / 10) * (-16.73067-(-16.73067)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -2.71431 + (((tickAnim - 201) / 34) * (-2.71431-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 201) / 34) * (-3.28441-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 201) / 34) * (-16.73067-(-16.73067)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -2.71431 + (((tickAnim - 235) / 30) * (0-(-2.71431)));
            yy = -3.28441 + (((tickAnim - 235) / 30) * (0-(-3.28441)));
            zz = -16.73067 + (((tickAnim - 235) / 30) * (0-(-16.73067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-14.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 2 + (((tickAnim - 25) / 13) * (2-(2)));
            yy = -14.25 + (((tickAnim - 25) / 13) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 2 + (((tickAnim - 38) / 32) * (2-(2)));
            yy = -14.25 + (((tickAnim - 38) / 32) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 38) / 32) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 2 + (((tickAnim - 70) / 28) * (2-(2)));
            yy = -14.25 + (((tickAnim - 70) / 28) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 70) / 28) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 2 + (((tickAnim - 98) / 17) * (2-(2)));
            yy = -14.25 + (((tickAnim - 98) / 17) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 2 + (((tickAnim - 115) / 16) * (2-(2)));
            yy = -14.25 + (((tickAnim - 115) / 16) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 2 + (((tickAnim - 131) / 15) * (2-(2)));
            yy = -14.25 + (((tickAnim - 131) / 15) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 131) / 15) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 2 + (((tickAnim - 146) / 25) * (2-(2)));
            yy = -14.25 + (((tickAnim - 146) / 25) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 146) / 25) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 2 + (((tickAnim - 171) / 20) * (2-(2)));
            yy = -14.25 + (((tickAnim - 171) / 20) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 171) / 20) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 2 + (((tickAnim - 191) / 10) * (2-(2)));
            yy = -14.25 + (((tickAnim - 191) / 10) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 191) / 10) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 2 + (((tickAnim - 201) / 34) * (2-(2)));
            yy = -14.25 + (((tickAnim - 201) / 34) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 201) / 34) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 2 + (((tickAnim - 235) / 30) * (0-(2)));
            yy = -14.25 + (((tickAnim - 235) / 30) * (0-(-14.25)));
            zz = 0 + (((tickAnim - 235) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-24.52427-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-12.88696-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (34.62034-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -24.52427 + (((tickAnim - 25) / 13) * (-24.52427-(-24.52427)));
            yy = -12.88696 + (((tickAnim - 25) / 13) * (-12.88696-(-12.88696)));
            zz = 34.62034 + (((tickAnim - 25) / 13) * (34.62034-(34.62034)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -24.52427 + (((tickAnim - 38) / 32) * (-24.52427-(-24.52427)));
            yy = -12.88696 + (((tickAnim - 38) / 32) * (-12.88696-(-12.88696)));
            zz = 34.62034 + (((tickAnim - 38) / 32) * (34.62034-(34.62034)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -24.52427 + (((tickAnim - 70) / 28) * (-24.52427-(-24.52427)));
            yy = -12.88696 + (((tickAnim - 70) / 28) * (-12.88696-(-12.88696)));
            zz = 34.62034 + (((tickAnim - 70) / 28) * (34.62034-(34.62034)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -24.52427 + (((tickAnim - 98) / 17) * (-24.52427-(-24.52427)));
            yy = -12.88696 + (((tickAnim - 98) / 17) * (-12.88696-(-12.88696)));
            zz = 34.62034 + (((tickAnim - 98) / 17) * (34.62034-(34.62034)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -24.52427 + (((tickAnim - 115) / 16) * (-24.52427-(-24.52427)));
            yy = -12.88696 + (((tickAnim - 115) / 16) * (-12.88696-(-12.88696)));
            zz = 34.62034 + (((tickAnim - 115) / 16) * (34.62034-(34.62034)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -24.52427 + (((tickAnim - 131) / 15) * (-24.52427-(-24.52427)));
            yy = -12.88696 + (((tickAnim - 131) / 15) * (-12.88696-(-12.88696)));
            zz = 34.62034 + (((tickAnim - 131) / 15) * (34.62034-(34.62034)));
        }
        else if (tickAnim >= 146 && tickAnim < 158) {
            xx = -24.52427 + (((tickAnim - 146) / 12) * (0.35516-(-24.52427)));
            yy = -12.88696 + (((tickAnim - 146) / 12) * (35.19562-(-12.88696)));
            zz = 34.62034 + (((tickAnim - 146) / 12) * (-14.75743-(34.62034)));
        }
        else if (tickAnim >= 158 && tickAnim < 171) {
            xx = 0.35516 + (((tickAnim - 158) / 13) * (-1.22837-(0.35516)));
            yy = 35.19562 + (((tickAnim - 158) / 13) * (30.10214-(35.19562)));
            zz = -14.75743 + (((tickAnim - 158) / 13) * (21.56208-(-14.75743)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -1.22837 + (((tickAnim - 171) / 20) * (-1.22837-(-1.22837)));
            yy = 30.10214 + (((tickAnim - 171) / 20) * (30.10214-(30.10214)));
            zz = 21.56208 + (((tickAnim - 171) / 20) * (21.56208-(21.56208)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -1.22837 + (((tickAnim - 191) / 10) * (-1.22837-(-1.22837)));
            yy = 30.10214 + (((tickAnim - 191) / 10) * (30.10214-(30.10214)));
            zz = 21.56208 + (((tickAnim - 191) / 10) * (21.56208-(21.56208)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -1.22837 + (((tickAnim - 201) / 34) * (-1.22837-(-1.22837)));
            yy = 30.10214 + (((tickAnim - 201) / 34) * (30.10214-(30.10214)));
            zz = 21.56208 + (((tickAnim - 201) / 34) * (21.56208-(21.56208)));
        }
        else if (tickAnim >= 235 && tickAnim < 250) {
            xx = -1.22837 + (((tickAnim - 235) / 15) * (11.08459-(-1.22837)));
            yy = 30.10214 + (((tickAnim - 235) / 15) * (4.54762-(30.10214)));
            zz = 21.56208 + (((tickAnim - 235) / 15) * (-22.02944-(21.56208)));
        }
        else if (tickAnim >= 250 && tickAnim < 265) {
            xx = 11.08459 + (((tickAnim - 250) / 15) * (0-(11.08459)));
            yy = 4.54762 + (((tickAnim - 250) / 15) * (0-(4.54762)));
            zz = -22.02944 + (((tickAnim - 250) / 15) * (0-(-22.02944)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-20.73023-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-21.00269-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-73.55894-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -20.73023 + (((tickAnim - 25) / 13) * (-20.73023-(-20.73023)));
            yy = -21.00269 + (((tickAnim - 25) / 13) * (-21.00269-(-21.00269)));
            zz = -73.55894 + (((tickAnim - 25) / 13) * (-73.55894-(-73.55894)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -20.73023 + (((tickAnim - 38) / 32) * (-20.73023-(-20.73023)));
            yy = -21.00269 + (((tickAnim - 38) / 32) * (-21.00269-(-21.00269)));
            zz = -73.55894 + (((tickAnim - 38) / 32) * (-73.55894-(-73.55894)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -20.73023 + (((tickAnim - 70) / 28) * (-20.73023-(-20.73023)));
            yy = -21.00269 + (((tickAnim - 70) / 28) * (-21.00269-(-21.00269)));
            zz = -73.55894 + (((tickAnim - 70) / 28) * (-73.55894-(-73.55894)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -20.73023 + (((tickAnim - 98) / 17) * (-20.73023-(-20.73023)));
            yy = -21.00269 + (((tickAnim - 98) / 17) * (-21.00269-(-21.00269)));
            zz = -73.55894 + (((tickAnim - 98) / 17) * (-73.55894-(-73.55894)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -20.73023 + (((tickAnim - 115) / 16) * (-20.73023-(-20.73023)));
            yy = -21.00269 + (((tickAnim - 115) / 16) * (-21.00269-(-21.00269)));
            zz = -73.55894 + (((tickAnim - 115) / 16) * (-73.55894-(-73.55894)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -20.73023 + (((tickAnim - 131) / 15) * (-20.73023-(-20.73023)));
            yy = -21.00269 + (((tickAnim - 131) / 15) * (-21.00269-(-21.00269)));
            zz = -73.55894 + (((tickAnim - 131) / 15) * (-73.55894-(-73.55894)));
        }
        else if (tickAnim >= 146 && tickAnim < 158) {
            xx = -20.73023 + (((tickAnim - 146) / 12) * (24.21719-(-20.73023)));
            yy = -21.00269 + (((tickAnim - 146) / 12) * (-44.13941-(-21.00269)));
            zz = -73.55894 + (((tickAnim - 146) / 12) * (-26.75587-(-73.55894)));
        }
        else if (tickAnim >= 158 && tickAnim < 171) {
            xx = 24.21719 + (((tickAnim - 158) / 13) * (-14.30575-(24.21719)));
            yy = -44.13941 + (((tickAnim - 158) / 13) * (-15.40829-(-44.13941)));
            zz = -26.75587 + (((tickAnim - 158) / 13) * (-23.12325-(-26.75587)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -14.30575 + (((tickAnim - 171) / 20) * (-14.30575-(-14.30575)));
            yy = -15.40829 + (((tickAnim - 171) / 20) * (-15.40829-(-15.40829)));
            zz = -23.12325 + (((tickAnim - 171) / 20) * (-23.12325-(-23.12325)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -14.30575 + (((tickAnim - 191) / 10) * (-14.30575-(-14.30575)));
            yy = -15.40829 + (((tickAnim - 191) / 10) * (-15.40829-(-15.40829)));
            zz = -23.12325 + (((tickAnim - 191) / 10) * (-23.12325-(-23.12325)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -14.30575 + (((tickAnim - 201) / 34) * (-14.30575-(-14.30575)));
            yy = -15.40829 + (((tickAnim - 201) / 34) * (-15.40829-(-15.40829)));
            zz = -23.12325 + (((tickAnim - 201) / 34) * (-23.12325-(-23.12325)));
        }
        else if (tickAnim >= 235 && tickAnim < 250) {
            xx = -14.30575 + (((tickAnim - 235) / 15) * (-1.89316-(-14.30575)));
            yy = -15.40829 + (((tickAnim - 235) / 15) * (-39.39193-(-15.40829)));
            zz = -23.12325 + (((tickAnim - 235) / 15) * (-5.93025-(-23.12325)));
        }
        else if (tickAnim >= 250 && tickAnim < 265) {
            xx = -1.89316 + (((tickAnim - 250) / 15) * (0-(-1.89316)));
            yy = -39.39193 + (((tickAnim - 250) / 15) * (0-(-39.39193)));
            zz = -5.93025 + (((tickAnim - 250) / 15) * (0-(-5.93025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-26.72183-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-10.96992-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (22.59515-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -26.72183 + (((tickAnim - 25) / 13) * (-26.72183-(-26.72183)));
            yy = -10.96992 + (((tickAnim - 25) / 13) * (-10.96992-(-10.96992)));
            zz = 22.59515 + (((tickAnim - 25) / 13) * (22.59515-(22.59515)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -26.72183 + (((tickAnim - 38) / 32) * (-26.72183-(-26.72183)));
            yy = -10.96992 + (((tickAnim - 38) / 32) * (-10.96992-(-10.96992)));
            zz = 22.59515 + (((tickAnim - 38) / 32) * (22.59515-(22.59515)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -26.72183 + (((tickAnim - 70) / 28) * (-26.72183-(-26.72183)));
            yy = -10.96992 + (((tickAnim - 70) / 28) * (-10.96992-(-10.96992)));
            zz = 22.59515 + (((tickAnim - 70) / 28) * (22.59515-(22.59515)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -26.72183 + (((tickAnim - 98) / 17) * (-26.72183-(-26.72183)));
            yy = -10.96992 + (((tickAnim - 98) / 17) * (-10.96992-(-10.96992)));
            zz = 22.59515 + (((tickAnim - 98) / 17) * (22.59515-(22.59515)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -26.72183 + (((tickAnim - 115) / 16) * (-26.72183-(-26.72183)));
            yy = -10.96992 + (((tickAnim - 115) / 16) * (-10.96992-(-10.96992)));
            zz = 22.59515 + (((tickAnim - 115) / 16) * (22.59515-(22.59515)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -26.72183 + (((tickAnim - 131) / 15) * (-26.72183-(-26.72183)));
            yy = -10.96992 + (((tickAnim - 131) / 15) * (-10.96992-(-10.96992)));
            zz = 22.59515 + (((tickAnim - 131) / 15) * (22.59515-(22.59515)));
        }
        else if (tickAnim >= 146 && tickAnim < 158) {
            xx = -26.72183 + (((tickAnim - 146) / 12) * (-20.37618-(-26.72183)));
            yy = -10.96992 + (((tickAnim - 146) / 12) * (-7.30822-(-10.96992)));
            zz = 22.59515 + (((tickAnim - 146) / 12) * (59.58096-(22.59515)));
        }
        else if (tickAnim >= 158 && tickAnim < 171) {
            xx = -20.37618 + (((tickAnim - 158) / 13) * (0-(-20.37618)));
            yy = -7.30822 + (((tickAnim - 158) / 13) * (0-(-7.30822)));
            zz = 59.58096 + (((tickAnim - 158) / 13) * (0-(59.58096)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 20) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 10) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 34) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 250) {
            xx = 0 + (((tickAnim - 235) / 15) * (30.75-(0)));
            yy = 0 + (((tickAnim - 235) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 15) * (36.25-(0)));
        }
        else if (tickAnim >= 250 && tickAnim < 265) {
            xx = 30.75 + (((tickAnim - 250) / 15) * (0-(30.75)));
            yy = 0 + (((tickAnim - 250) / 15) * (0-(0)));
            zz = 36.25 + (((tickAnim - 250) / 15) * (0-(36.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-35.81359-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (20.90814-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-36.4178-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -35.81359 + (((tickAnim - 25) / 13) * (-35.81359-(-35.81359)));
            yy = 20.90814 + (((tickAnim - 25) / 13) * (20.90814-(20.90814)));
            zz = -36.4178 + (((tickAnim - 25) / 13) * (-36.4178-(-36.4178)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -35.81359 + (((tickAnim - 38) / 32) * (-35.81359-(-35.81359)));
            yy = 20.90814 + (((tickAnim - 38) / 32) * (20.90814-(20.90814)));
            zz = -36.4178 + (((tickAnim - 38) / 32) * (-36.4178-(-36.4178)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -35.81359 + (((tickAnim - 70) / 28) * (-35.81359-(-35.81359)));
            yy = 20.90814 + (((tickAnim - 70) / 28) * (20.90814-(20.90814)));
            zz = -36.4178 + (((tickAnim - 70) / 28) * (-36.4178-(-36.4178)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -35.81359 + (((tickAnim - 98) / 17) * (-35.81359-(-35.81359)));
            yy = 20.90814 + (((tickAnim - 98) / 17) * (20.90814-(20.90814)));
            zz = -36.4178 + (((tickAnim - 98) / 17) * (-36.4178-(-36.4178)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -35.81359 + (((tickAnim - 115) / 16) * (-35.81359-(-35.81359)));
            yy = 20.90814 + (((tickAnim - 115) / 16) * (20.90814-(20.90814)));
            zz = -36.4178 + (((tickAnim - 115) / 16) * (-36.4178-(-36.4178)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -35.81359 + (((tickAnim - 131) / 15) * (-35.81359-(-35.81359)));
            yy = 20.90814 + (((tickAnim - 131) / 15) * (20.90814-(20.90814)));
            zz = -36.4178 + (((tickAnim - 131) / 15) * (-36.4178-(-36.4178)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -35.81359 + (((tickAnim - 146) / 25) * (-43.81359-(-35.81359)));
            yy = 20.90814 + (((tickAnim - 146) / 25) * (20.90814-(20.90814)));
            zz = -36.4178 + (((tickAnim - 146) / 25) * (-36.4178-(-36.4178)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -43.81359 + (((tickAnim - 171) / 20) * (-43.81359-(-43.81359)));
            yy = 20.90814 + (((tickAnim - 171) / 20) * (20.90814-(20.90814)));
            zz = -36.4178 + (((tickAnim - 171) / 20) * (-36.4178-(-36.4178)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -43.81359 + (((tickAnim - 191) / 10) * (-43.81359-(-43.81359)));
            yy = 20.90814 + (((tickAnim - 191) / 10) * (20.90814-(20.90814)));
            zz = -36.4178 + (((tickAnim - 191) / 10) * (-36.4178-(-36.4178)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -43.81359 + (((tickAnim - 201) / 34) * (-43.81359-(-43.81359)));
            yy = 20.90814 + (((tickAnim - 201) / 34) * (20.90814-(20.90814)));
            zz = -36.4178 + (((tickAnim - 201) / 34) * (-36.4178-(-36.4178)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -43.81359 + (((tickAnim - 235) / 30) * (0-(-43.81359)));
            yy = 20.90814 + (((tickAnim - 235) / 30) * (0-(20.90814)));
            zz = -36.4178 + (((tickAnim - 235) / 30) * (0-(-36.4178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-24.22363-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (19.39325-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (38.2619-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -24.22363 + (((tickAnim - 25) / 13) * (-24.22363-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 25) / 13) * (19.39325-(19.39325)));
            zz = 38.2619 + (((tickAnim - 25) / 13) * (38.2619-(38.2619)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = -24.22363 + (((tickAnim - 38) / 32) * (-24.22363-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 38) / 32) * (19.39325-(19.39325)));
            zz = 38.2619 + (((tickAnim - 38) / 32) * (38.2619-(38.2619)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = -24.22363 + (((tickAnim - 70) / 28) * (-24.22363-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 70) / 28) * (19.39325-(19.39325)));
            zz = 38.2619 + (((tickAnim - 70) / 28) * (38.2619-(38.2619)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -24.22363 + (((tickAnim - 98) / 17) * (-24.22363-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 98) / 17) * (19.39325-(19.39325)));
            zz = 38.2619 + (((tickAnim - 98) / 17) * (38.2619-(38.2619)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = -24.22363 + (((tickAnim - 115) / 16) * (-24.22363-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 115) / 16) * (19.39325-(19.39325)));
            zz = 38.2619 + (((tickAnim - 115) / 16) * (38.2619-(38.2619)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = -24.22363 + (((tickAnim - 131) / 15) * (-24.22363-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 131) / 15) * (19.39325-(19.39325)));
            zz = 38.2619 + (((tickAnim - 131) / 15) * (38.2619-(38.2619)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = -24.22363 + (((tickAnim - 146) / 25) * (-24.22363-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 146) / 25) * (19.39325-(19.39325)));
            zz = 38.2619 + (((tickAnim - 146) / 25) * (38.2619-(38.2619)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = -24.22363 + (((tickAnim - 171) / 20) * (-24.22363-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 171) / 20) * (19.39325-(19.39325)));
            zz = 38.2619 + (((tickAnim - 171) / 20) * (38.2619-(38.2619)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = -24.22363 + (((tickAnim - 191) / 10) * (-24.22363-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 191) / 10) * (19.39325-(19.39325)));
            zz = 38.2619 + (((tickAnim - 191) / 10) * (38.2619-(38.2619)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = -24.22363 + (((tickAnim - 201) / 34) * (-24.22363-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 201) / 34) * (19.39325-(19.39325)));
            zz = 38.2619 + (((tickAnim - 201) / 34) * (38.2619-(38.2619)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -24.22363 + (((tickAnim - 235) / 30) * (0-(-24.22363)));
            yy = 19.39325 + (((tickAnim - 235) / 30) * (0-(19.39325)));
            zz = 38.2619 + (((tickAnim - 235) / 30) * (0-(38.2619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-28-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-16-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -28 + (((tickAnim - 25) / 13) * (-28-(-28)));
            zz = -16 + (((tickAnim - 25) / 13) * (-16-(-16)));
        }
        else if (tickAnim >= 38 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 38) / 32) * (0-(0)));
            yy = -28 + (((tickAnim - 38) / 32) * (-28-(-28)));
            zz = -16 + (((tickAnim - 38) / 32) * (-16-(-16)));
        }
        else if (tickAnim >= 70 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 70) / 28) * (0-(0)));
            yy = -28 + (((tickAnim - 70) / 28) * (-28-(-28)));
            zz = -16 + (((tickAnim - 70) / 28) * (-16-(-16)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 98) / 17) * (0-(0)));
            yy = -28 + (((tickAnim - 98) / 17) * (-28-(-28)));
            zz = -16 + (((tickAnim - 98) / 17) * (-16-(-16)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            yy = -28 + (((tickAnim - 115) / 16) * (-28-(-28)));
            zz = -16 + (((tickAnim - 115) / 16) * (-16-(-16)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            yy = -28 + (((tickAnim - 131) / 15) * (-28-(-28)));
            zz = -16 + (((tickAnim - 131) / 15) * (-16-(-16)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 146) / 25) * (0-(0)));
            yy = -28 + (((tickAnim - 146) / 25) * (-28-(-28)));
            zz = -16 + (((tickAnim - 146) / 25) * (-16-(-16)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            yy = -28 + (((tickAnim - 171) / 20) * (-28-(-28)));
            zz = -16 + (((tickAnim - 171) / 20) * (-16-(-16)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            yy = -28 + (((tickAnim - 191) / 10) * (-28-(-28)));
            zz = -16 + (((tickAnim - 191) / 10) * (-16-(-16)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            yy = -28 + (((tickAnim - 201) / 34) * (-28-(-28)));
            zz = -16 + (((tickAnim - 201) / 34) * (-16-(-16)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 235) / 30) * (0-(0)));
            yy = -28 + (((tickAnim - 235) / 30) * (0-(-28)));
            zz = -16 + (((tickAnim - 235) / 30) * (0-(-16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 38) / 9) * (6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            yy = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 58) {
            xx = 6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 47) / 11) * (0-(6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 47) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 11) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 58) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 40) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 98) / 9) * (6.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            yy = 0 + (((tickAnim - 98) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 9) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = 6.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 107) / 8) * (0-(6.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 107) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 8) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 16) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 131) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 15) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 146) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 146) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 25) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 171) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 20) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 191) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 10) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 201) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 34) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 235) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPleurosaurus entity = (EntityPrehistoricFloraPleurosaurus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-5.25-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -5.25 + (((tickAnim - 6) / 2) * (2.5-(-5.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 2.5 + (((tickAnim - 8) / 3) * (0-(2.5)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (7.00304-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.08719-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.99905-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.00304 + (((tickAnim - 3) / 2) * (-7.46152-(7.00304)));
            yy = -0.08719 + (((tickAnim - 3) / 2) * (-6.15574-(-0.08719)));
            zz = -3.99905 + (((tickAnim - 3) / 2) * (-8.61183-(-3.99905)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -7.46152 + (((tickAnim - 5) / 2) * (1.0562-(-7.46152)));
            yy = -6.15574 + (((tickAnim - 5) / 2) * (-9.19002-(-6.15574)));
            zz = -8.61183 + (((tickAnim - 5) / 2) * (-10.91822-(-8.61183)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1.0562 + (((tickAnim - 7) / 3) * (2.1443-(1.0562)));
            yy = -9.19002 + (((tickAnim - 7) / 3) * (11.96199-(-9.19002)));
            zz = -10.91822 + (((tickAnim - 7) / 3) * (9.48698-(-10.91822)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.1443 + (((tickAnim - 10) / 2) * (0-(2.1443)));
            yy = 11.96199 + (((tickAnim - 10) / 2) * (0-(11.96199)));
            zz = 9.48698 + (((tickAnim - 10) / 2) * (0-(9.48698)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.45-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = -0.45 + (((tickAnim - 3) / 9) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(xx);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(yy);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.75-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -42.5 + (((tickAnim - 3) / 2) * (7-(-42.5)));
            yy = 4.75 + (((tickAnim - 3) / 2) * (15-(4.75)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 7 + (((tickAnim - 5) / 2) * (5.20531-(7)));
            yy = 15 + (((tickAnim - 5) / 2) * (-22.10704-(15)));
            zz = 0 + (((tickAnim - 5) / 2) * (-13.76755-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 5.20531 + (((tickAnim - 7) / 3) * (3.61438-(5.20531)));
            yy = -22.10704 + (((tickAnim - 7) / 3) * (16.7757-(-22.10704)));
            zz = -13.76755 + (((tickAnim - 7) / 3) * (12.52976-(-13.76755)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 3.61438 + (((tickAnim - 10) / 2) * (0-(3.61438)));
            yy = 16.7757 + (((tickAnim - 10) / 2) * (0-(16.7757)));
            zz = 12.52976 + (((tickAnim - 10) / 2) * (0-(12.52976)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.375 + (((tickAnim - 5) / 2) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.375 + (((tickAnim - 7) / 4) * (0-(0.375)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Eye.rotationPointX = this.Eye.rotationPointX + (float)(xx);
        this.Eye.rotationPointY = this.Eye.rotationPointY - (float)(yy);
        this.Eye.rotationPointZ = this.Eye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (0.1-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 5) / 2) * (1-(1)));
            yy = 0.1 + (((tickAnim - 5) / 2) * (0-(0.1)));
            zz = 1 + (((tickAnim - 5) / 2) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 7) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 7) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 7) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (48.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 48.75 + (((tickAnim - 3) / 2) * (0-(48.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (6-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 6 + (((tickAnim - 6) / 2) * (-4-(6)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -4 + (((tickAnim - 8) / 3) * (0-(-4)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (7.25-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 7.25 + (((tickAnim - 6) / 2) * (-5.25-(7.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -5.25 + (((tickAnim - 8) / 3) * (0-(-5.25)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-10.62-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -10.62 + (((tickAnim - 6) / 2) * (10.25-(-10.62)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 10.25 + (((tickAnim - 8) / 3) * (0-(10.25)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPleurosaurus entity = (EntityPrehistoricFloraPleurosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0.175);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0);


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(2.25), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*-25), Chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+40))*7));
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*2);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*865/0.9+30))*0.2);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*865/0.9-20))*0.2);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-2), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+5))*18), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(-0.5), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*25), Body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-3), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*-18), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*2));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(2), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*-10), Tail.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.65543-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+50))*-6 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+50))*-6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+50))*-6)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 1.65543 + (((tickAnim - 5) / 8) * (1.67027-(1.65543)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+50))*-6 + (((tickAnim - 5) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+50))*-6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+50))*-6)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.67027 + (((tickAnim - 13) / 2) * (0-(1.67027)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+50))*-6 + (((tickAnim - 13) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+50))*-6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+50))*-6)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-1), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+20))*-10), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-40))*-15), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(0), Tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*-20), Tail6.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 9.79503 + (((tickAnim - 0) / 4) * (-15.61916-(9.79503)));
            yy = -51.4805 + (((tickAnim - 0) / 4) * (-5.90321-(-51.4805)));
            zz = -2.66577 + (((tickAnim - 0) / 4) * (-45.88762-(-2.66577)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -15.61916 + (((tickAnim - 4) / 4) * (20.81253-(-15.61916)));
            yy = -5.90321 + (((tickAnim - 4) / 4) * (48.26318-(-5.90321)));
            zz = -45.88762 + (((tickAnim - 4) / 4) * (12.37316-(-45.88762)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20.81253 + (((tickAnim - 8) / 5) * (11.51981-(20.81253)));
            yy = 48.26318 + (((tickAnim - 8) / 5) * (-13.75313-(48.26318)));
            zz = 12.37316 + (((tickAnim - 8) / 5) * (-1.33435-(12.37316)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 11.51981 + (((tickAnim - 13) / 2) * (9.79503-(11.51981)));
            yy = -13.75313 + (((tickAnim - 13) / 2) * (-51.4805-(-13.75313)));
            zz = -1.33435 + (((tickAnim - 13) / 2) * (-2.66577-(-1.33435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 39.85367 + (((tickAnim - 0) / 4) * (36.18006-(39.85367)));
            yy = 30.54141 + (((tickAnim - 0) / 4) * (48.33771-(30.54141)));
            zz = -36.22809 + (((tickAnim - 0) / 4) * (-45.70043-(-36.22809)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 36.18006 + (((tickAnim - 4) / 4) * (0-(36.18006)));
            yy = 48.33771 + (((tickAnim - 4) / 4) * (19.5-(48.33771)));
            zz = -45.70043 + (((tickAnim - 4) / 4) * (0-(-45.70043)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (7.78254-(0)));
            yy = 19.5 + (((tickAnim - 8) / 3) * (26.7958-(19.5)));
            zz = 0 + (((tickAnim - 8) / 3) * (-4.0826-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 7.78254 + (((tickAnim - 11) / 4) * (39.85367-(7.78254)));
            yy = 26.7958 + (((tickAnim - 11) / 4) * (30.54141-(26.7958)));
            zz = -4.0826 + (((tickAnim - 11) / 4) * (-36.22809-(-4.0826)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -19.25 + (((tickAnim - 0) / 2) * (56.09371-(-19.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (-30.0136-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (50.88336-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 56.09371 + (((tickAnim - 2) / 2) * (159.16944-(56.09371)));
            yy = -30.0136 + (((tickAnim - 2) / 2) * (-74.45044-(-30.0136)));
            zz = 50.88336 + (((tickAnim - 2) / 2) * (112.67205-(50.88336)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 159.16944 + (((tickAnim - 4) / 4) * (190.20618-(159.16944)));
            yy = -74.45044 + (((tickAnim - 4) / 4) * (9.43158-(-74.45044)));
            zz = 112.67205 + (((tickAnim - 4) / 4) * (180.78799-(112.67205)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 190.20618 + (((tickAnim - 8) / 3) * (22.63317-(190.20618)));
            yy = 9.43158 + (((tickAnim - 8) / 3) * (9.90004-(9.43158)));
            zz = 180.78799 + (((tickAnim - 8) / 3) * (14.58267-(180.78799)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 22.63317 + (((tickAnim - 11) / 2) * (1.19798-(22.63317)));
            yy = 9.90004 + (((tickAnim - 11) / 2) * (2.34405-(9.90004)));
            zz = 14.58267 + (((tickAnim - 11) / 2) * (5.07649-(14.58267)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.19798 + (((tickAnim - 13) / 2) * (-19.25-(1.19798)));
            yy = 2.34405 + (((tickAnim - 13) / 2) * (0-(2.34405)));
            zz = 5.07649 + (((tickAnim - 13) / 2) * (0-(5.07649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 40.3372 + (((tickAnim - 0) / 7) * (15.96251-(40.3372)));
            yy = -50.67006 + (((tickAnim - 0) / 7) * (56.82423-(-50.67006)));
            zz = -29.12803 + (((tickAnim - 0) / 7) * (15.09569-(-29.12803)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 15.96251 + (((tickAnim - 7) / 5) * (-3.79408-(15.96251)));
            yy = 56.82423 + (((tickAnim - 7) / 5) * (-11.6272-(56.82423)));
            zz = 15.09569 + (((tickAnim - 7) / 5) * (65.07811-(15.09569)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -3.79408 + (((tickAnim - 12) / 3) * (40.3372-(-3.79408)));
            yy = -11.6272 + (((tickAnim - 12) / 3) * (-50.67006-(-11.6272)));
            zz = 65.07811 + (((tickAnim - 12) / 3) * (-29.12803-(65.07811)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 23.63086 + (((tickAnim - 0) / 7) * (0-(23.63086)));
            yy = -29.95276 + (((tickAnim - 0) / 7) * (-20.5-(-29.95276)));
            zz = 27.526 + (((tickAnim - 0) / 7) * (0-(27.526)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (26.54105-(0)));
            yy = -20.5 + (((tickAnim - 7) / 5) * (-30.53223-(-20.5)));
            zz = 0 + (((tickAnim - 7) / 5) * (22.82636-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 26.54105 + (((tickAnim - 12) / 3) * (23.63086-(26.54105)));
            yy = -30.53223 + (((tickAnim - 12) / 3) * (-29.95276-(-30.53223)));
            zz = 22.82636 + (((tickAnim - 12) / 3) * (27.526-(22.82636)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -281.29918 + (((tickAnim - 0) / 1) * (-91.38942-(-281.29918)));
            yy = -9.06312 + (((tickAnim - 0) / 1) * (-9.11084-(-9.06312)));
            zz = 279.78264 + (((tickAnim - 0) / 1) * (88.45982-(279.78264)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -91.38942 + (((tickAnim - 1) / 1) * (-80.01353-(-91.38942)));
            yy = -9.11084 + (((tickAnim - 1) / 1) * (-4.78422-(-9.11084)));
            zz = 88.45982 + (((tickAnim - 1) / 1) * (77.06-(88.45982)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -80.01353 + (((tickAnim - 2) / 1) * (-45.36362-(-80.01353)));
            yy = -4.78422 + (((tickAnim - 2) / 1) * (-5.59556-(-4.78422)));
            zz = 77.06 + (((tickAnim - 2) / 1) * (43.03078-(77.06)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -45.36362 + (((tickAnim - 3) / 4) * (-140.36117-(-45.36362)));
            yy = -5.59556 + (((tickAnim - 3) / 4) * (-7.38234-(-5.59556)));
            zz = 43.03078 + (((tickAnim - 3) / 4) * (137.64838-(43.03078)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -140.36117 + (((tickAnim - 7) / 5) * (-201.56668-(-140.36117)));
            yy = -7.38234 + (((tickAnim - 7) / 5) * (63.62846-(-7.38234)));
            zz = 137.64838 + (((tickAnim - 7) / 5) * (247.57365-(137.64838)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -201.56668 + (((tickAnim - 12) / 1) * (-288.26091-(-201.56668)));
            yy = 63.62846 + (((tickAnim - 12) / 1) * (-4.74176-(63.62846)));
            zz = 247.57365 + (((tickAnim - 12) / 1) * (292.31135-(247.57365)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -288.26091 + (((tickAnim - 13) / 2) * (-281.29918-(-288.26091)));
            yy = -4.74176 + (((tickAnim - 13) / 2) * (-9.06312-(-4.74176)));
            zz = 292.31135 + (((tickAnim - 13) / 2) * (279.78264-(292.31135)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.39739 + (((tickAnim - 0) / 3) * (12.86832-(4.39739)));
            yy = 81.00518 + (((tickAnim - 0) / 3) * (27.26858-(81.00518)));
            zz = 12.88744 + (((tickAnim - 0) / 3) * (-17.02699-(12.88744)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12.86832 + (((tickAnim - 3) / 4) * (40.64138-(12.86832)));
            yy = 27.26858 + (((tickAnim - 3) / 4) * (-35.93034-(27.26858)));
            zz = -17.02699 + (((tickAnim - 3) / 4) * (-40.5601-(-17.02699)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 40.64138 + (((tickAnim - 7) / 4) * (55.44692-(40.64138)));
            yy = -35.93034 + (((tickAnim - 7) / 4) * (9.1037-(-35.93034)));
            zz = -40.5601 + (((tickAnim - 7) / 4) * (-54.2293-(-40.5601)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 55.44692 + (((tickAnim - 11) / 4) * (4.39739-(55.44692)));
            yy = 9.1037 + (((tickAnim - 11) / 4) * (81.00518-(9.1037)));
            zz = -54.2293 + (((tickAnim - 11) / 4) * (12.88744-(-54.2293)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -9.47608 + (((tickAnim - 0) / 3) * (-50.13008-(-9.47608)));
            yy = -53.41561 + (((tickAnim - 0) / 3) * (-19.52253-(-53.41561)));
            zz = -7.61512 + (((tickAnim - 0) / 3) * (-18.89316-(-7.61512)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -50.13008 + (((tickAnim - 3) / 4) * (-0.24106-(-50.13008)));
            yy = -19.52253 + (((tickAnim - 3) / 4) * (-56.6472-(-19.52253)));
            zz = -18.89316 + (((tickAnim - 3) / 4) * (20.85111-(-18.89316)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -0.24106 + (((tickAnim - 7) / 4) * (-8.46287-(-0.24106)));
            yy = -56.6472 + (((tickAnim - 7) / 4) * (-33.21081-(-56.6472)));
            zz = 20.85111 + (((tickAnim - 7) / 4) * (3.83459-(20.85111)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -8.46287 + (((tickAnim - 11) / 4) * (-9.47608-(-8.46287)));
            yy = -33.21081 + (((tickAnim - 11) / 4) * (-53.41561-(-33.21081)));
            zz = 3.83459 + (((tickAnim - 11) / 4) * (-7.61512-(3.83459)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1.22956 + (((tickAnim - 0) / 7) * (12.25-(1.22956)));
            yy = -34.90431 + (((tickAnim - 0) / 7) * (34-(-34.90431)));
            zz = 9.15798 + (((tickAnim - 0) / 7) * (0-(9.15798)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 12.25 + (((tickAnim - 7) / 3) * (-0.76506-(12.25)));
            yy = 34 + (((tickAnim - 7) / 3) * (-4.24627-(34)));
            zz = 0 + (((tickAnim - 7) / 3) * (38.0445-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.76506 + (((tickAnim - 10) / 3) * (-66.69773-(-0.76506)));
            yy = -4.24627 + (((tickAnim - 10) / 3) * (-24.25115-(-4.24627)));
            zz = 38.0445 + (((tickAnim - 10) / 3) * (12.79871-(38.0445)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -66.69773 + (((tickAnim - 13) / 2) * (1.22956-(-66.69773)));
            yy = -24.25115 + (((tickAnim - 13) / 2) * (-34.90431-(-24.25115)));
            zz = 12.79871 + (((tickAnim - 13) / 2) * (9.15798-(12.79871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 47.40103 + (((tickAnim - 0) / 3) * (35.49425-(47.40103)));
            yy = 39.5256 + (((tickAnim - 0) / 3) * (-19.61324-(39.5256)));
            zz = 24.47921 + (((tickAnim - 0) / 3) * (38.959-(24.47921)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 35.49425 + (((tickAnim - 3) / 4) * (0-(35.49425)));
            yy = -19.61324 + (((tickAnim - 3) / 4) * (-62.75-(-19.61324)));
            zz = 38.959 + (((tickAnim - 3) / 4) * (0-(38.959)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (1.2327-(0)));
            yy = -62.75 + (((tickAnim - 7) / 5) * (-17.49711-(-62.75)));
            zz = 0 + (((tickAnim - 7) / 5) * (3.21257-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1.2327 + (((tickAnim - 12) / 3) * (47.40103-(1.2327)));
            yy = -17.49711 + (((tickAnim - 12) / 3) * (39.5256-(-17.49711)));
            zz = 3.21257 + (((tickAnim - 12) / 3) * (24.47921-(3.21257)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.66796 + (((tickAnim - 0) / 3) * (-3.54141-(3.66796)));
            yy = 56.99163 + (((tickAnim - 0) / 3) * (51.88839-(56.99163)));
            zz = -13.89102 + (((tickAnim - 0) / 3) * (-7.46459-(-13.89102)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -3.54141 + (((tickAnim - 3) / 4) * (-12.01032-(-3.54141)));
            yy = 51.88839 + (((tickAnim - 3) / 4) * (25.33322-(51.88839)));
            zz = -7.46459 + (((tickAnim - 3) / 4) * (0.87424-(-7.46459)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -12.01032 + (((tickAnim - 7) / 8) * (3.66796-(-12.01032)));
            yy = 25.33322 + (((tickAnim - 7) / 8) * (56.99163-(25.33322)));
            zz = 0.87424 + (((tickAnim - 7) / 8) * (-13.89102-(0.87424)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.94865 + (((tickAnim - 0) / 3) * (26.65867-(8.94865)));
            yy = -38.71678 + (((tickAnim - 0) / 3) * (13.06018-(-38.71678)));
            zz = 25.03862 + (((tickAnim - 0) / 3) * (-53.3101-(25.03862)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 26.65867 + (((tickAnim - 3) / 3) * (-30.96246-(26.65867)));
            yy = 13.06018 + (((tickAnim - 3) / 3) * (23.38612-(13.06018)));
            zz = -53.3101 + (((tickAnim - 3) / 3) * (13.64811-(-53.3101)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -30.96246 + (((tickAnim - 6) / 1) * (0-(-30.96246)));
            yy = 23.38612 + (((tickAnim - 6) / 1) * (0-(23.38612)));
            zz = 13.64811 + (((tickAnim - 6) / 1) * (0-(13.64811)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (8.94865-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (-38.71678-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (25.03862-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(-11.5), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*25.5), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(0);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*860/0.9))*-0.1);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(0);


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(8.25), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-70))*-18), Tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail7, Tail7.rotateAngleX + (float) Math.toRadians(0), Tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*-25), Tail7.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPleurosaurus entity = (EntityPrehistoricFloraPleurosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(-0.25), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-8), Tail.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.04693 + (((tickAnim - 0) / 4) * (9.10743-(-7.04693)));
            yy = -31.40647 + (((tickAnim - 0) / 4) * (-51.55688-(-31.40647)));
            zz = -6.19524 + (((tickAnim - 0) / 4) * (-16.55584-(-6.19524)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 9.10743 + (((tickAnim - 4) / 5) * (-20.18991-(9.10743)));
            yy = -51.55688 + (((tickAnim - 4) / 5) * (8.41005-(-51.55688)));
            zz = -16.55584 + (((tickAnim - 4) / 5) * (-47.9597-(-16.55584)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -20.18991 + (((tickAnim - 9) / 5) * (24.5746-(-20.18991)));
            yy = 8.41005 + (((tickAnim - 9) / 5) * (40.93576-(8.41005)));
            zz = -47.9597 + (((tickAnim - 9) / 5) * (14.90717-(-47.9597)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 24.5746 + (((tickAnim - 14) / 16) * (-7.04693-(24.5746)));
            yy = 40.93576 + (((tickAnim - 14) / 16) * (-31.40647-(40.93576)));
            zz = 14.90717 + (((tickAnim - 14) / 16) * (-6.19524-(14.90717)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (32.18433-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (11.74088-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-45.75344-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 32.18433 + (((tickAnim - 4) / 5) * (26.84216-(32.18433)));
            yy = 11.74088 + (((tickAnim - 4) / 5) * (5.87044-(11.74088)));
            zz = -45.75344 + (((tickAnim - 4) / 5) * (-22.87672-(-45.75344)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 26.84216 + (((tickAnim - 9) / 5) * (9.07217-(26.84216)));
            yy = 5.87044 + (((tickAnim - 9) / 5) * (10.09008-(5.87044)));
            zz = -22.87672 + (((tickAnim - 9) / 5) * (-6.66436-(-22.87672)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 9.07217 + (((tickAnim - 14) / 16) * (0-(9.07217)));
            yy = 10.09008 + (((tickAnim - 14) / 16) * (0-(10.09008)));
            zz = -6.66436 + (((tickAnim - 14) / 16) * (0-(-6.66436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -113.07275 + (((tickAnim - 0) / 4) * (-155.77023-(-113.07275)));
            yy = -24.86801 + (((tickAnim - 0) / 4) * (-38.68347-(-24.86801)));
            zz = -115.4516 + (((tickAnim - 0) / 4) * (-151.81822-(-115.4516)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -155.77023 + (((tickAnim - 4) / 5) * (-173.79743-(-155.77023)));
            yy = -38.68347 + (((tickAnim - 4) / 5) * (-33.90474-(-38.68347)));
            zz = -151.81822 + (((tickAnim - 4) / 5) * (-197.33343-(-151.81822)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -173.79743 + (((tickAnim - 9) / 5) * (-51.48533-(-173.79743)));
            yy = -33.90474 + (((tickAnim - 9) / 5) * (3.98142-(-33.90474)));
            zz = -197.33343 + (((tickAnim - 9) / 5) * (-52.08236-(-197.33343)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -51.48533 + (((tickAnim - 14) / 16) * (-113.07275-(-51.48533)));
            yy = 3.98142 + (((tickAnim - 14) / 16) * (-24.86801-(3.98142)));
            zz = -52.08236 + (((tickAnim - 14) / 16) * (-115.4516-(-52.08236)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 4.8317 + (((tickAnim - 0) / 18) * (7.18516-(4.8317)));
            yy = -45.68668 + (((tickAnim - 0) / 18) * (32.58628-(-45.68668)));
            zz = -5.76629 + (((tickAnim - 0) / 18) * (17.20514-(-5.76629)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 7.18516 + (((tickAnim - 18) / 6) * (-27.1363-(7.18516)));
            yy = 32.58628 + (((tickAnim - 18) / 6) * (-6.969-(32.58628)));
            zz = 17.20514 + (((tickAnim - 18) / 6) * (42.86047-(17.20514)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -27.1363 + (((tickAnim - 24) / 6) * (4.8317-(-27.1363)));
            yy = -6.969 + (((tickAnim - 24) / 6) * (-45.68668-(-6.969)));
            zz = 42.86047 + (((tickAnim - 24) / 6) * (-5.76629-(42.86047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 15.3754 + (((tickAnim - 0) / 18) * (23.3754-(15.3754)));
            yy = -18.82849 + (((tickAnim - 0) / 18) * (-18.82849-(-18.82849)));
            zz = 19.50105 + (((tickAnim - 0) / 18) * (19.50105-(19.50105)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 23.3754 + (((tickAnim - 18) / 6) * (40.60358-(23.3754)));
            yy = -18.82849 + (((tickAnim - 18) / 6) * (-25.56688-(-18.82849)));
            zz = 19.50105 + (((tickAnim - 18) / 6) * (52.3315-(19.50105)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 40.60358 + (((tickAnim - 24) / 6) * (15.3754-(40.60358)));
            yy = -25.56688 + (((tickAnim - 24) / 6) * (-18.82849-(-25.56688)));
            zz = 52.3315 + (((tickAnim - 24) / 6) * (19.50105-(52.3315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 105.52707 + (((tickAnim - 0) / 10) * (220.38063-(105.52707)));
            yy = -5.20768 + (((tickAnim - 0) / 10) * (-11.35833-(-5.20768)));
            zz = -97.68749 + (((tickAnim - 0) / 10) * (-220.30804-(-97.68749)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 220.38063 + (((tickAnim - 10) / 8) * (220.94918-(220.38063)));
            yy = -11.35833 + (((tickAnim - 10) / 8) * (5.59059-(-11.35833)));
            zz = -220.30804 + (((tickAnim - 10) / 8) * (-206.40521-(-220.30804)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 220.94918 + (((tickAnim - 18) / 6) * (183.86456-(220.94918)));
            yy = 5.59059 + (((tickAnim - 18) / 6) * (54.28233-(5.59059)));
            zz = -206.40521 + (((tickAnim - 18) / 6) * (-153.8977-(-206.40521)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 183.86456 + (((tickAnim - 24) / 4) * (155.33756-(183.86456)));
            yy = 54.28233 + (((tickAnim - 24) / 4) * (-0.76322-(54.28233)));
            zz = -153.8977 + (((tickAnim - 24) / 4) * (-143.94067-(-153.8977)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 155.33756 + (((tickAnim - 28) / 2) * (105.52707-(155.33756)));
            yy = -0.76322 + (((tickAnim - 28) / 2) * (-5.20768-(-0.76322)));
            zz = -143.94067 + (((tickAnim - 28) / 2) * (-97.68749-(-143.94067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (28.33727-(0)));
            yy = 19 + (((tickAnim - 0) / 14) * (-27.87993-(19)));
            zz = 0 + (((tickAnim - 0) / 14) * (-30.4078-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 28.33727 + (((tickAnim - 14) / 6) * (-2.96484-(28.33727)));
            yy = -27.87993 + (((tickAnim - 14) / 6) * (27.80401-(-27.87993)));
            zz = -30.4078 + (((tickAnim - 14) / 6) * (-37.40547-(-30.4078)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -2.96484 + (((tickAnim - 20) / 6) * (0-(-2.96484)));
            yy = 27.80401 + (((tickAnim - 20) / 6) * (46.25-(27.80401)));
            zz = -37.40547 + (((tickAnim - 20) / 6) * (0-(-37.40547)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 46.25 + (((tickAnim - 26) / 4) * (19-(46.25)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -29.8976 + (((tickAnim - 0) / 8) * (12.904-(-29.8976)));
            yy = -15.22919 + (((tickAnim - 0) / 8) * (-34.57609-(-15.22919)));
            zz = -15.54779 + (((tickAnim - 0) / 8) * (30.68334-(-15.54779)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 12.904 + (((tickAnim - 8) / 6) * (-3.37783-(12.904)));
            yy = -34.57609 + (((tickAnim - 8) / 6) * (-47.80088-(-34.57609)));
            zz = 30.68334 + (((tickAnim - 8) / 6) * (5.83551-(30.68334)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -3.37783 + (((tickAnim - 14) / 6) * (-5.67894-(-3.37783)));
            yy = -47.80088 + (((tickAnim - 14) / 6) * (-59.06171-(-47.80088)));
            zz = 5.83551 + (((tickAnim - 14) / 6) * (2.38998-(5.83551)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -5.67894 + (((tickAnim - 20) / 6) * (-15.75-(-5.67894)));
            yy = -59.06171 + (((tickAnim - 20) / 6) * (-31.5-(-59.06171)));
            zz = 2.38998 + (((tickAnim - 20) / 6) * (0-(2.38998)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -15.75 + (((tickAnim - 26) / 4) * (-29.8976-(-15.75)));
            yy = -31.5 + (((tickAnim - 26) / 4) * (-15.22919-(-31.5)));
            zz = 0 + (((tickAnim - 26) / 4) * (-15.54779-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 6.07424 + (((tickAnim - 0) / 8) * (-18.80166-(6.07424)));
            yy = 8.95029 + (((tickAnim - 0) / 8) * (50.41616-(8.95029)));
            zz = 12.19848 + (((tickAnim - 0) / 8) * (-22.85751-(12.19848)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -18.80166 + (((tickAnim - 8) / 6) * (13.34904-(-18.80166)));
            yy = 50.41616 + (((tickAnim - 8) / 6) * (66.43656-(50.41616)));
            zz = -22.85751 + (((tickAnim - 8) / 6) * (14.51408-(-22.85751)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 13.34904 + (((tickAnim - 14) / 6) * (59.83672-(13.34904)));
            yy = 66.43656 + (((tickAnim - 14) / 6) * (-5.84435-(66.43656)));
            zz = 14.51408 + (((tickAnim - 14) / 6) * (64.19719-(14.51408)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 59.83672 + (((tickAnim - 20) / 6) * (0-(59.83672)));
            yy = -5.84435 + (((tickAnim - 20) / 6) * (0-(-5.84435)));
            zz = 64.19719 + (((tickAnim - 20) / 6) * (0-(64.19719)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (6.07424-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (8.95029-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (12.19848-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 33.4625 + (((tickAnim - 0) / 5) * (27.74453-(33.4625)));
            yy = 26.72702 + (((tickAnim - 0) / 5) * (-24.16605-(26.72702)));
            zz = 41.04627 + (((tickAnim - 0) / 5) * (48.91518-(41.04627)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 27.74453 + (((tickAnim - 5) / 6) * (0-(27.74453)));
            yy = -24.16605 + (((tickAnim - 5) / 6) * (-46.25-(-24.16605)));
            zz = 48.91518 + (((tickAnim - 5) / 6) * (0-(48.91518)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (14.98159-(0)));
            yy = -46.25 + (((tickAnim - 11) / 9) * (-14.01016-(-46.25)));
            zz = 0 + (((tickAnim - 11) / 9) * (17.31133-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14.98159 + (((tickAnim - 20) / 10) * (33.4625-(14.98159)));
            yy = -14.01016 + (((tickAnim - 20) / 10) * (26.72702-(-14.01016)));
            zz = 17.31133 + (((tickAnim - 20) / 10) * (41.04627-(17.31133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11.25 + (((tickAnim - 0) / 5) * (-1.7606-(11.25)));
            yy = 22.5 + (((tickAnim - 0) / 5) * (36.49429-(22.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.59002-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -1.7606 + (((tickAnim - 5) / 6) * (-15.75-(-1.7606)));
            yy = 36.49429 + (((tickAnim - 5) / 6) * (31.5-(36.49429)));
            zz = -0.59002 + (((tickAnim - 5) / 6) * (0-(-0.59002)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -15.75 + (((tickAnim - 11) / 9) * (18.61953-(-15.75)));
            yy = 31.5 + (((tickAnim - 11) / 9) * (28.77995-(31.5)));
            zz = 0 + (((tickAnim - 11) / 9) * (-24.10009-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 18.61953 + (((tickAnim - 20) / 10) * (11.25-(18.61953)));
            yy = 28.77995 + (((tickAnim - 20) / 10) * (22.5-(28.77995)));
            zz = -24.10009 + (((tickAnim - 20) / 10) * (0-(-24.10009)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.76551 + (((tickAnim - 0) / 5) * (29.04226-(2.76551)));
            yy = -43.65374 + (((tickAnim - 0) / 5) * (-30.43567-(-43.65374)));
            zz = -11.93768 + (((tickAnim - 0) / 5) * (-65.61553-(-11.93768)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 29.04226 + (((tickAnim - 5) / 6) * (0-(29.04226)));
            yy = -30.43567 + (((tickAnim - 5) / 6) * (0-(-30.43567)));
            zz = -65.61553 + (((tickAnim - 5) / 6) * (0-(-65.61553)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (-23.43603-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (-26.96327-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (12.18247-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -23.43603 + (((tickAnim - 20) / 10) * (2.76551-(-23.43603)));
            yy = -26.96327 + (((tickAnim - 20) / 10) * (-43.65374-(-26.96327)));
            zz = 12.18247 + (((tickAnim - 20) / 10) * (-11.93768-(12.18247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-30))*-12), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+40))*2));
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*0.5);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-40))*0.02);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(0);
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*13), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*0.5), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+5))*10), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*10), Body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+70))*-12), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*3));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+90))*-1), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-1), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*-3), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*-7), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-70))*-10), Tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(0), Tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-14), Tail6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail7, Tail7.rotateAngleX + (float) Math.toRadians(0), Tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-18), Tail7.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPleurosaurus entity = (EntityPrehistoricFloraPleurosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(-0.5), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*-15), Chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+40))*3));
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(0);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(0);
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*15.5), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+5))*16), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*15), Body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(2.25151), Hips.rotateAngleY + (float) Math.toRadians(0.2414+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+70))*-15), Hips.rotateAngleZ + (float) Math.toRadians(-0.0825+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*3));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(-0.25), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*-10), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-1), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*-9), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*-11), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-15), Tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(0), Tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-18), Tail6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail7, Tail7.rotateAngleX + (float) Math.toRadians(0), Tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-22), Tail7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(56.85615), UpperLegL.rotateAngleY + (float) Math.toRadians(-67.343), UpperLegL.rotateAngleZ + (float) Math.toRadians(28.9333));
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(23.8643), LowerLegL.rotateAngleY + (float) Math.toRadians(58.84081), LowerLegL.rotateAngleZ + (float) Math.toRadians(-17.22306));
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(234.64969), FootL.rotateAngleY + (float) Math.toRadians(-74.11395), FootL.rotateAngleZ + (float) Math.toRadians(76.11645));
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(61.32182), UpperLegR.rotateAngleY + (float) Math.toRadians(69.48333), UpperLegR.rotateAngleZ + (float) Math.toRadians(-23.84199));
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(25.23959), LowerLegR.rotateAngleY + (float) Math.toRadians(-57.67119), LowerLegR.rotateAngleZ + (float) Math.toRadians(22.2751));
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(55.46668), FootR.rotateAngleY + (float) Math.toRadians(62.6821), FootR.rotateAngleZ + (float) Math.toRadians(-84.13809));
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(9.12417), UpperArmL.rotateAngleY + (float) Math.toRadians(-34.65873), UpperArmL.rotateAngleZ + (float) Math.toRadians(-20.91223));
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(37.46362), LowerArmL.rotateAngleY + (float) Math.toRadians(-81.60759), LowerArmL.rotateAngleZ + (float) Math.toRadians(7.89143));
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(36.1194), HandL.rotateAngleY + (float) Math.toRadians(-35.68256), HandL.rotateAngleZ + (float) Math.toRadians(30.69093));
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(9.12417), UpperArmR.rotateAngleY + (float) Math.toRadians(34.6587), UpperArmR.rotateAngleZ + (float) Math.toRadians(20.9122));
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(46.54471), LowerArmR.rotateAngleY + (float) Math.toRadians(85.85958), LowerArmR.rotateAngleZ + (float) Math.toRadians(-9.74222));
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(36.1194), HandR.rotateAngleY + (float) Math.toRadians(35.6826), HandR.rotateAngleZ + (float) Math.toRadians(-30.6909));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPleurosaurus e = (EntityPrehistoricFloraPleurosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Neck, 0,0,-0.5F);
        animator.rotate(this.Head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
