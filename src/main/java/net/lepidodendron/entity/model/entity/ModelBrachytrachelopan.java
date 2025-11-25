package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBrachytrachelopan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBrachytrachelopan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Brachytrachelopan;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer KneeL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer KneeL2;
    private final AdvancedModelRenderer FootL2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer Tail7;
    private final AdvancedModelRenderer Tail8;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Shoulders;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer ElbowL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer ArmL2;
    private final AdvancedModelRenderer ElbowL2;
    private final AdvancedModelRenderer HandL2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer LIP_r1;
    private final AdvancedModelRenderer LIP_r2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer LIP_r3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Eye;
    private final AdvancedModelRenderer cube_r29;

    private ModelAnimator animator;

    public ModelBrachytrachelopan() {
        this.textureWidth = 180;
        this.textureHeight = 180;

        this.Brachytrachelopan = new AdvancedModelRenderer(this);
        this.Brachytrachelopan.setRotationPoint(0.0F, -8.35F, 15.0F);
        this.Brachytrachelopan.cubeList.add(new ModelBox(Brachytrachelopan, 49, 60, -9.0F, -4.0F, -6.0F, 18, 19, 12, 0.0F, false));

        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(0.0F, -12.3F, -6.0F);
        this.Brachytrachelopan.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.3142F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 90, 92, -5.0F, 0.5F, 2.0F, 10, 9, 12, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(9.0F, 4.0F, 1.0F);
        this.Brachytrachelopan.addChild(LegL);
        this.setRotateAngle(LegL, -0.1745F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 110, 59, -4.0F, -2.0F, -4.0F, 7, 17, 9, 0.0F, false));

        this.KneeL = new AdvancedModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 14.6F, -3.0F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.4189F, 0.0F, 0.0F);
        this.KneeL.cubeList.add(new ModelBox(KneeL, 32, 139, -3.5F, -0.8F, -0.5F, 6, 14, 7, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 12.3F, 4.8F);
        this.KneeL.addChild(FootL);
        this.setRotateAngle(FootL, -0.2443F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 102, 134, -4.0F, 0.0F, -9.0F, 7, 4, 11, 0.0F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(-9.0F, 4.0F, 1.0F);
        this.Brachytrachelopan.addChild(LegL2);
        this.setRotateAngle(LegL2, -0.1745F, 0.0F, 0.0F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 110, 59, -3.0F, -2.0F, -4.0F, 7, 17, 9, 0.0F, true));

        this.KneeL2 = new AdvancedModelRenderer(this);
        this.KneeL2.setRotationPoint(0.0F, 14.6F, -3.0F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, 0.4189F, 0.0F, 0.0F);
        this.KneeL2.cubeList.add(new ModelBox(KneeL2, 32, 139, -2.5F, -0.8F, -0.5F, 6, 14, 7, 0.0F, true));

        this.FootL2 = new AdvancedModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 12.3F, 4.8F);
        this.KneeL2.addChild(FootL2);
        this.setRotateAngle(FootL2, -0.2443F, 0.0F, 0.0F);
        this.FootL2.cubeList.add(new ModelBox(FootL2, 102, 134, -3.0F, 0.0F, -9.0F, 7, 4, 11, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.2F, 5.0F);
        this.Brachytrachelopan.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.3054F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -7.3091F, -0.1461F);
        this.Tail1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 77, 0, -4.0F, -0.1937F, -0.4332F, 8, 7, 15, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.6909F, 0.9539F);
        this.Tail1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1222F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 23, -7.0F, -3.0F, -4.5F, 14, 13, 16, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 2.8381F, 12.0516F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 76, -5.0F, -2.0F, -3.0F, 10, 9, 16, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.4058F, 1.9806F);
        this.Tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 131, 31, -2.0F, 0.0F, -0.7F, 4, 7, 13, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 109, 8, -3.0F, -2.0F, -1.0F, 6, 7, 15, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.2618F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 105, 36, -2.0F, -2.0F, -1.0F, 4, 5, 17, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.5F, 0.0F, 16.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.0873F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 74, 114, -2.0F, -2.0F, -1.0F, 3, 4, 16, 0.0F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(-0.5F, 0.1F, 15.0F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.1309F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 31, 118, -1.0F, -2.0F, -1.0F, 2, 3, 16, 0.0F, false));

        this.Tail7 = new AdvancedModelRenderer(this);
        this.Tail7.setRotationPoint(0.0F, -0.9F, 15.0F);
        this.Tail6.addChild(Tail7);
        this.setRotateAngle(Tail7, -0.2443F, 0.0F, 0.0F);
        this.Tail7.cubeList.add(new ModelBox(Tail7, 113, 114, -1.0F, -0.8733F, -1.2177F, 2, 2, 17, -0.02F, false));

        this.Tail8 = new AdvancedModelRenderer(this);
        this.Tail8.setRotationPoint(0.0F, -0.0733F, 15.7823F);
        this.Tail7.addChild(Tail8);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.Tail8.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 122, -0.5F, 0.3F, -1.0F, 1, 1, 16, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Brachytrachelopan.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -11.0F, -6.0F, -16.0F, 22, 22, 16, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -11.9F, -15.9F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 92, -5.0F, 0.0F, -0.1F, 11, 9, 16, 0.05F, false));

        this.Shoulders = new AdvancedModelRenderer(this);
        this.Shoulders.setRotationPoint(0.0F, 3.0F, -16.0F);
        this.Body.addChild(Shoulders);
        this.Shoulders.cubeList.add(new ModelBox(Shoulders, 0, 39, -9.0F, -8.0F, -9.0F, 18, 20, 12, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -11.4F, -8.9F);
        this.Shoulders.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3665F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 123, 86, -5.0F, 0.1F, -0.1F, 10, 7, 10, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(9.0F, 9.0F, -4.0F);
        this.Shoulders.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.1309F, 0.0F, 0.0F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 139, 134, -4.0F, -2.3F, -3.0F, 6, 11, 6, 0.0F, false));

        this.ElbowL = new AdvancedModelRenderer(this);
        this.ElbowL.setRotationPoint(-0.5F, 8.6F, 2.3F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.3054F, 0.0F, 0.0F);
        this.ElbowL.cubeList.add(new ModelBox(ElbowL, 59, 140, -3.0F, 0.0404F, -4.763F, 5, 8, 5, 0.0F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 8.0F, -3.0F);
        this.ElbowL.addChild(HandL);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0F, -0.1F, 1.6F);
        this.HandL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0844F, -0.1002F, 0.8684F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 61, 53, -0.6428F, 0.105F, -1.8829F, 1, 3, 1, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.1F, -0.4F);
        this.HandL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1484F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 82, 135, -3.0F, -0.1F, -1.3F, 5, 4, 5, -0.01F, false));

        this.ArmL2 = new AdvancedModelRenderer(this);
        this.ArmL2.setRotationPoint(-9.0F, 9.0F, -4.0F);
        this.Shoulders.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.1309F, 0.0F, 0.0F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 139, 134, -2.0F, -2.3F, -3.0F, 6, 11, 6, 0.0F, true));

        this.ElbowL2 = new AdvancedModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.5F, 8.6F, 2.3F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.3054F, 0.0F, 0.0F);
        this.ElbowL2.cubeList.add(new ModelBox(ElbowL2, 59, 140, -2.0F, 0.0404F, -4.763F, 5, 8, 5, 0.0F, true));

        this.HandL2 = new AdvancedModelRenderer(this);
        this.HandL2.setRotationPoint(0.0F, 8.0F, -3.0F);
        this.ElbowL2.addChild(HandL2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, -0.1F, 1.6F);
        this.HandL2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0844F, 0.1002F, -0.8684F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 61, 53, -0.3572F, 0.105F, -1.8829F, 1, 3, 1, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.1F, -0.4F);
        this.HandL2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1484F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 82, 135, -2.0F, -0.1F, -1.3F, 5, 4, 5, -0.01F, true));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -3.6F, -8.4F);
        this.Shoulders.addChild(Neck4);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 0, 108, -6.5F, -0.9F, -7.4F, 13, 9, 10, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 8.1F, -7.4F);
        this.Neck4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4363F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 135, 104, -5.0F, -5.3F, 3.0F, 11, 4, 8, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.0F, -7.3F);
        this.Neck4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5934F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 137, 0, -4.0F, -0.1F, -0.9F, 8, 7, 9, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -1.5F, -7.4F);
        this.Neck4.addChild(Neck3);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 0, 128, -4.5F, 1.3F, -8.0F, 9, 7, 10, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, -8.1F);
        this.Neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 61, 0, -3.0F, 0.1F, 0.1F, 6, 4, 9, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.2F, -7.6F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0873F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 97, 114, -3.0F, 1.0655F, -7.5617F, 6, 6, 9, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.1345F, -7.5617F);
        this.Neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1396F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 74, 92, -2.0F, 0.0F, -0.4F, 4, 3, 8, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 2.1655F, -7.3617F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.2269F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 135, 117, -2.5F, -0.4783F, -5.2381F, 5, 5, 7, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.1783F, -5.2381F);
        this.Neck1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 141, 52, -1.5F, 0.0F, -1.0F, 3, 2, 7, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 4.9493F, -5.5363F);
        this.Neck1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1396F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 61, 53, -2.0F, -0.8994F, 0.0129F, 4, 1, 5, 0.012F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.8717F, -4.9381F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, 0.3054F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.811F, -7.6569F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3403F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 61, 4, -1.5F, -1.6937F, -0.0914F, 3, 2, 1, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.811F, -7.6569F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1047F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 39, -1.5F, -4.6229F, 5.3441F, 3, 3, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.161F, -7.3569F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6458F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 49, 39, -1.5F, -0.9706F, -2.1277F, 3, 1, 2, 0.003F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 45, -1.5F, -0.6706F, -2.1277F, 3, 1, 2, 0.0F, false));

        this.LIP_r1 = new AdvancedModelRenderer(this);
        this.LIP_r1.setRotationPoint(0.0F, 2.161F, -7.3569F);
        this.Head.addChild(LIP_r1);
        this.setRotateAngle(LIP_r1, -0.5411F, 0.0F, 0.0F);
        this.LIP_r1.cubeList.add(new ModelBox(LIP_r1, 61, 0, -1.0F, -0.6891F, -1.7532F, 2, 1, 2, 0.0F, false));

        this.LIP_r2 = new AdvancedModelRenderer(this);
        this.LIP_r2.setRotationPoint(0.0F, 2.161F, -7.3569F);
        this.Head.addChild(LIP_r2);
        this.setRotateAngle(LIP_r2, 0.2443F, 0.0F, 0.0F);
        this.LIP_r2.cubeList.add(new ModelBox(LIP_r2, 49, 47, -1.0F, -0.9652F, -0.0618F, 2, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.811F, -7.6569F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3316F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 143, 62, -1.5F, -1.9282F, -0.2123F, 3, 2, 7, 0.004F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.411F, -4.2569F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1484F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 128, 0, -2.0F, -1.8534F, -2.6609F, 4, 2, 4, 0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.5404F, -1.0483F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 109, 0, -2.5F, -3.0F, -3.0F, 5, 3, 4, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.711F, -1.4569F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0393F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 80, 53, -2.5F, -0.2706F, -2.5914F, 5, 2, 4, -0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 71, 118, -2.0F, -2.0F, -3.0F, 4, 2, 4, -0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.4776F, -5.1983F);
        this.Jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1091F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 98, 59, -1.5F, -0.9635F, 0.0153F, 3, 1, 6, 0.012F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.6776F, -2.3983F);
        this.Jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0785F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 6, -2.0F, -0.9432F, -2.7918F, 4, 1, 3, 0.012F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.2224F, -2.3983F);
        this.Jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1309F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 102, -2.0F, -0.0508F, -3.7937F, 4, 1, 4, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.5985F, -6.7125F);
        this.Jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2705F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 72, -1.5F, -0.9925F, -0.8477F, 3, 1, 1, 0.019F, false));

        this.LIP_r3 = new AdvancedModelRenderer(this);
        this.LIP_r3.setRotationPoint(0.0F, -0.4015F, -7.8125F);
        this.Jaw.addChild(LIP_r3);
        this.setRotateAngle(LIP_r3, -0.0785F, 0.0F, 0.0F);
        this.LIP_r3.cubeList.add(new ModelBox(LIP_r3, 0, 0, -1.5F, 0.0785F, 0.064F, 3, 1, 4, -0.002F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.5985F, -5.3125F);
        this.Jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 22, 72, -1.5F, -0.4295F, -2.49F, 3, 1, 1, 0.02F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 11, -2.0F, -0.4295F, -1.49F, 4, 1, 2, -0.001F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 72, -2.0F, -0.0545F, -1.49F, 4, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.4015F, -7.7125F);
        this.Jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 49, 43, -1.0F, 0.1209F, 0.0523F, 2, 1, 2, 0.0F, false));

        this.Eye = new AdvancedModelRenderer(this);
        this.Eye.setRotationPoint(-1.5F, -0.0141F, -2.478F);
        this.Head.addChild(Eye);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0349F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 168, 21, -1.0F, -0.5F, -0.5F, 5, 1, 1, 0.05F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Brachytrachelopan.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Brachytrachelopan.offsetY = 0.8F;
        this.Brachytrachelopan.offsetX = 0.35F;
        this.Brachytrachelopan.rotateAngleY = (float)Math.toRadians(240);
        this.Brachytrachelopan.rotateAngleX = (float)Math.toRadians(0);
        this.Brachytrachelopan.rotateAngleZ = (float)Math.toRadians(00);
        this.Brachytrachelopan.scaleChildren = true;
        float scaler = 0.31F;
        this.Brachytrachelopan.setScale(scaler, scaler, scaler);
        //Start of pose:


        //End of pose, now render the model:
        this.Brachytrachelopan.render(f);
        //Reset rotations, positions and sizing:
        this.Brachytrachelopan.setScale(1.0F, 1.0F, 1.0F);
        this.Brachytrachelopan.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraBrachytrachelopan camara = (EntityPrehistoricFloraBrachytrachelopan) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);


        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6, this.Tail7, this.Tail8};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Neck4, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        camara.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = camara.getTravelSpeed()/2;

            if (!camara.isInWater()) {

                if (f3 == 0.0F || !camara.getIsMoving()) {
                    if (camara.getAnimation() != camara.EAT_ANIMATION
                        && camara.getAnimation() != camara.DRINK_ANIMATION
                        && camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Neck, 0.05F, 0.05F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.04F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.walk(Jaw, (float) ( 0.04), 0.1F, true, 0, 0, f2, 1);
                    }

                    if (camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Tail, (0.15F * 0.1F), 0.1F, 0.2F, f2, 1F);
                        this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.35F, 0.12F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.35F, 0F, f2, 1F);
                    }

                    return;
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
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBrachytrachelopan ee = (EntityPrehistoricFloraBrachytrachelopan) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.TAIL_ANIMATION) { //The leaves grazing anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }



    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachytrachelopan entity = (EntityPrehistoricFloraBrachytrachelopan) entitylivingbaseIn;
        int animCycle = 220;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = 1 + (((tickAnim - 30) / 81) * (1-(1)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = 1 + (((tickAnim - 111) / 69) * (1-(1)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 1 + (((tickAnim - 180) / 40) * (0-(1)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Brachytrachelopan, Brachytrachelopan.rotateAngleX + (float) Math.toRadians(xx), Brachytrachelopan.rotateAngleY + (float) Math.toRadians(yy), Brachytrachelopan.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = -1.25 + (((tickAnim - 30) / 81) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = -1.25 + (((tickAnim - 111) / 69) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -1.25 + (((tickAnim - 180) / 40) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = -1.25 + (((tickAnim - 30) / 81) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = -1.25 + (((tickAnim - 111) / 69) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -1.25 + (((tickAnim - 180) / 40) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = 1.75 + (((tickAnim - 30) / 81) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = 1.75 + (((tickAnim - 111) / 69) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 1.75 + (((tickAnim - 180) / 40) * (0-(1.75)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = 2 + (((tickAnim - 30) / 81) * (2-(2)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = 2 + (((tickAnim - 111) / 69) * (2-(2)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 2 + (((tickAnim - 180) / 40) * (0-(2)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Shoulders, Shoulders.rotateAngleX + (float) Math.toRadians(xx), Shoulders.rotateAngleY + (float) Math.toRadians(yy), Shoulders.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-12.81767-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.40502-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-5.71699-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -12.81767 + (((tickAnim - 14) / 16) * (-19.75-(-12.81767)));
            yy = -0.40502 + (((tickAnim - 14) / 16) * (0-(-0.40502)));
            zz = -5.71699 + (((tickAnim - 14) / 16) * (-9-(-5.71699)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = -19.75 + (((tickAnim - 30) / 81) * (-19.75-(-19.75)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = -9 + (((tickAnim - 30) / 81) * (-9-(-9)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = -19.75 + (((tickAnim - 111) / 69) * (-19.75-(-19.75)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = -9 + (((tickAnim - 111) / 69) * (-9-(-9)));
        }
        else if (tickAnim >= 180 && tickAnim < 198) {
            xx = -19.75 + (((tickAnim - 180) / 18) * (3.30208-(-19.75)));
            yy = 0 + (((tickAnim - 180) / 18) * (0-(0)));
            zz = -9 + (((tickAnim - 180) / 18) * (-4.875-(-9)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = 3.30208 + (((tickAnim - 198) / 22) * (0-(3.30208)));
            yy = 0 + (((tickAnim - 198) / 22) * (0-(0)));
            zz = -4.875 + (((tickAnim - 198) / 22) * (0-(-4.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (4.95833-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 14) / 16) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 4.95833 + (((tickAnim - 14) / 16) * (9-(4.95833)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = 9 + (((tickAnim - 30) / 81) * (9-(9)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 9 + (((tickAnim - 111) / 69) * (9-(9)));
        }
        else if (tickAnim >= 180 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 180) / 18) * (-20-(0)));
            yy = 0 + (((tickAnim - 180) / 18) * (0-(0)));
            zz = 9 + (((tickAnim - 180) / 18) * (4.875-(9)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = -20 + (((tickAnim - 198) / 22) * (0-(-20)));
            yy = 0 + (((tickAnim - 198) / 22) * (0-(0)));
            zz = 4.875 + (((tickAnim - 198) / 22) * (0-(4.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = -0.125 + (((tickAnim - 14) / 16) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            yy = -0.125 + (((tickAnim - 30) / 81) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            yy = -0.125 + (((tickAnim - 111) / 69) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 180) / 18) * (0-(0)));
            yy = -0.125 + (((tickAnim - 180) / 18) * (0.605-(-0.125)));
            zz = 0 + (((tickAnim - 180) / 18) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 198) / 22) * (0-(0)));
            yy = 0.605 + (((tickAnim - 198) / 22) * (0-(0.605)));
            zz = 0 + (((tickAnim - 198) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ElbowL.rotationPointX = this.ElbowL.rotationPointX + (float)(xx);
        this.ElbowL.rotationPointY = this.ElbowL.rotationPointY - (float)(yy);
        this.ElbowL.rotationPointZ = this.ElbowL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (50.47-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 50.47 + (((tickAnim - 14) / 16) * (14.75-(50.47)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = 14.75 + (((tickAnim - 30) / 81) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = 14.75 + (((tickAnim - 111) / 69) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 198) {
            xx = 14.75 + (((tickAnim - 180) / 18) * (45.74-(14.75)));
            yy = 0 + (((tickAnim - 180) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 18) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = 45.74 + (((tickAnim - 198) / 22) * (0-(45.74)));
            yy = 0 + (((tickAnim - 198) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.28-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.5-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 1.28 + (((tickAnim - 14) / 16) * (0.375-(1.28)));
            zz = -0.5 + (((tickAnim - 14) / 16) * (0-(-0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            yy = 0.375 + (((tickAnim - 30) / 81) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            yy = 0.375 + (((tickAnim - 111) / 69) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 180) / 18) * (-0.575-(0)));
            yy = 0.375 + (((tickAnim - 180) / 18) * (1-(0.375)));
            zz = 0 + (((tickAnim - 180) / 18) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 220) {
            xx = -0.575 + (((tickAnim - 198) / 22) * (0-(-0.575)));
            yy = 1 + (((tickAnim - 198) / 22) * (0-(1)));
            zz = 0 + (((tickAnim - 198) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL.rotationPointX = this.HandL.rotationPointX + (float)(xx);
        this.HandL.rotationPointY = this.HandL.rotationPointY - (float)(yy);
        this.HandL.rotationPointZ = this.HandL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = -5.75 + (((tickAnim - 30) / 81) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = -5.75 + (((tickAnim - 111) / 69) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -5.75 + (((tickAnim - 180) / 40) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = -7.75 + (((tickAnim - 30) / 81) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = -7.75 + (((tickAnim - 111) / 69) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -7.75 + (((tickAnim - 180) / 40) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = 9.75 + (((tickAnim - 30) / 81) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = 9.75 + (((tickAnim - 111) / 69) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 9.75 + (((tickAnim - 180) / 40) * (0-(9.75)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL2, HandL2.rotateAngleX + (float) Math.toRadians(xx), HandL2.rotateAngleY + (float) Math.toRadians(yy), HandL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 30) / 81) * (0-(0)));
            yy = 0.225 + (((tickAnim - 30) / 81) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 30) / 81) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            yy = 0.225 + (((tickAnim - 111) / 69) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            yy = 0.225 + (((tickAnim - 180) / 40) * (0-(0.225)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL2.rotationPointX = this.HandL2.rotationPointX + (float)(xx);
        this.HandL2.rotationPointY = this.HandL2.rotationPointY - (float)(yy);
        this.HandL2.rotationPointZ = this.HandL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 10.25 + (((tickAnim - 30) / 13) * (11.0422+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*-5-(10.25)));
            yy = 0 + (((tickAnim - 30) / 13) * (-0.71879-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (-0.97649-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 75) {
            xx = 11.0422+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*-5 + (((tickAnim - 43) / 32) * (7.7724+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190-50))*-2-(11.0422+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*-5)));
            yy = -0.71879 + (((tickAnim - 43) / 32) * (-0.2396-(-0.71879)));
            zz = -0.97649 + (((tickAnim - 43) / 32) * (-0.3255-(-0.97649)));
        }
        else if (tickAnim >= 75 && tickAnim < 91) {
            xx = 7.7724+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190-50))*-2 + (((tickAnim - 75) / 16) * (6.7474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*170))*3-(7.7724+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190-50))*-2)));
            yy = -0.2396 + (((tickAnim - 75) / 16) * (-0.2396-(-0.2396)));
            zz = -0.3255 + (((tickAnim - 75) / 16) * (-0.3255-(-0.3255)));
        }
        else if (tickAnim >= 91 && tickAnim < 111) {
            xx = 6.7474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*170))*3 + (((tickAnim - 91) / 20) * (4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-2-(6.7474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*170))*3)));
            yy = -0.2396 + (((tickAnim - 91) / 20) * (0-(-0.2396)));
            zz = -0.3255 + (((tickAnim - 91) / 20) * (0-(-0.3255)));
        }
        else if (tickAnim >= 111 && tickAnim < 180) {
            xx = 4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-2 + (((tickAnim - 111) / 69) * (-2.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*2-(4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-2)));
            yy = 0 + (((tickAnim - 111) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 69) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -2.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*2 + (((tickAnim - 180) / 40) * (0-(-2.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*2)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.525-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 18) * (0.525-(0)));
            zz = 1.525 + (((tickAnim - 30) / 18) * (1.805-(1.525)));
        }
        else if (tickAnim >= 48 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 48) / 63) * (0-(0)));
            yy = 0.525 + (((tickAnim - 48) / 63) * (0.075-(0.525)));
            zz = 1.805 + (((tickAnim - 48) / 63) * (0.9-(1.805)));
        }
        else if (tickAnim >= 111 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 111) / 65) * (0-(0)));
            yy = 0.075 + (((tickAnim - 111) / 65) * (0.075-(0.075)));
            zz = 0.9 + (((tickAnim - 111) / 65) * (0.9-(0.9)));
        }
        else if (tickAnim >= 176 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 176) / 44) * (0-(0)));
            yy = 0.075 + (((tickAnim - 176) / 44) * (0-(0.075)));
            zz = 0.9 + (((tickAnim - 176) / 44) * (0-(0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck4.rotationPointX = this.Neck4.rotationPointX + (float)(xx);
        this.Neck4.rotationPointY = this.Neck4.rotationPointY - (float)(yy);
        this.Neck4.rotationPointZ = this.Neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 10 + (((tickAnim - 30) / 13) * (26.5-(10)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 77) {
            xx = 26.5 + (((tickAnim - 43) / 34) * (25.17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(26.5)));
            yy = 0 + (((tickAnim - 43) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 34) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 111) {
            xx = 25.17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 77) / 34) * (8.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8-(25.17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 77) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 34) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 150) {
            xx = 8.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8 + (((tickAnim - 111) / 39) * (-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(8.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8)));
            yy = 0 + (((tickAnim - 111) / 39) * (3-(0)));
            zz = 0 + (((tickAnim - 111) / 39) * (2.25-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 171) {
            xx = -2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 150) / 21) * (-6.25-(-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 3 + (((tickAnim - 150) / 21) * (5-(3)));
            zz = 2.25 + (((tickAnim - 150) / 21) * (2.25-(2.25)));
        }
        else if (tickAnim >= 171 && tickAnim < 179) {
            xx = -6.25 + (((tickAnim - 171) / 8) * (-5.94446-(-6.25)));
            yy = 5 + (((tickAnim - 171) / 8) * (5.40666-(5)));
            zz = 2.25 + (((tickAnim - 171) / 8) * (2.20524-(2.25)));
        }
        else if (tickAnim >= 179 && tickAnim < 183) {
            xx = -5.94446 + (((tickAnim - 179) / 4) * (-6.2077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-5.94446)));
            yy = 5.40666 + (((tickAnim - 179) / 4) * (5.74554-(5.40666)));
            zz = 2.20524 + (((tickAnim - 179) / 4) * (2.16794-(2.20524)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = -6.2077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 183) / 37) * (0-(-6.2077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 5.74554 + (((tickAnim - 183) / 37) * (0-(5.74554)));
            zz = 2.16794 + (((tickAnim - 183) / 37) * (0-(2.16794)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 48) / 172) * (0-(0)));
            yy = -0.575 + (((tickAnim - 48) / 172) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 48) / 172) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 7.25 + (((tickAnim - 30) / 13) * (-1-(7.25)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -1 + (((tickAnim - 43) / 5) * (1.25-(-1)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 75) {
            xx = 1.25 + (((tickAnim - 48) / 27) * (5.32+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*9-(1.25)));
            yy = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 27) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 98) {
            xx = 5.32+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*9 + (((tickAnim - 75) / 23) * (7.945+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10-(5.32+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*9)));
            yy = 0 + (((tickAnim - 75) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 23) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 110) {
            xx = 7.945+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10 + (((tickAnim - 98) / 12) * (-0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(7.945+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10)));
            yy = 0 + (((tickAnim - 98) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 12) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 150) {
            xx = -0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 110) / 40) * (-16.9-(-0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            yy = 0 + (((tickAnim - 110) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 40) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 180) {
            xx = -16.9 + (((tickAnim - 150) / 30) * (-18.25049-(-16.9)));
            yy = 0 + (((tickAnim - 150) / 30) * (0.48669-(0)));
            zz = 0 + (((tickAnim - 150) / 30) * (-0.1146-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -18.25049 + (((tickAnim - 180) / 40) * (0-(-18.25049)));
            yy = 0.48669 + (((tickAnim - 180) / 40) * (0-(0.48669)));
            zz = -0.1146 + (((tickAnim - 180) / 40) * (0-(-0.1146)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 3.5 + (((tickAnim - 30) / 13) * (-8.75-(3.5)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -8.75 + (((tickAnim - 43) / 5) * (-3.75-(-8.75)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 77) {
            xx = -3.75 + (((tickAnim - 48) / 29) * (18.63+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*20-(-3.75)));
            yy = 0 + (((tickAnim - 48) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 29) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 111) {
            xx = 18.63+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*20 + (((tickAnim - 77) / 34) * (11.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8-(18.63+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*20)));
            yy = 0 + (((tickAnim - 77) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 34) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 150) {
            xx = 11.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8 + (((tickAnim - 111) / 39) * (8.6-(11.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8)));
            yy = 0 + (((tickAnim - 111) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 39) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 171) {
            xx = 8.6 + (((tickAnim - 150) / 21) * (7.25-(8.6)));
            yy = 0 + (((tickAnim - 150) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 21) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 180) {
            xx = 7.25 + (((tickAnim - 171) / 9) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 171) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 9) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 7.25 + (((tickAnim - 180) / 40) * (0-(7.25)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 30) / 13) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -5.25 + (((tickAnim - 43) / 5) * (-6.25-(-5.25)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 77) {
            xx = -6.25 + (((tickAnim - 48) / 29) * (9-(-6.25)));
            yy = 0 + (((tickAnim - 48) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 29) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 96) {
            xx = 9 + (((tickAnim - 77) / 19) * (-13.87-(9)));
            yy = 0 + (((tickAnim - 77) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 19) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 108) {
            xx = -13.87 + (((tickAnim - 96) / 12) * (-5.455+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*20-(-13.87)));
            yy = 0 + (((tickAnim - 96) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 12) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 123) {
            xx = -5.455+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*20 + (((tickAnim - 108) / 15) * (0-(-5.455+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*20)));
            yy = 0 + (((tickAnim - 108) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 15) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 123) / 27) * (6.6-(0)));
            yy = 0 + (((tickAnim - 123) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 27) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 171) {
            xx = 6.6 + (((tickAnim - 150) / 21) * (5.25-(6.6)));
            yy = 0 + (((tickAnim - 150) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 21) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 180) {
            xx = 5.25 + (((tickAnim - 171) / 9) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 171) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 9) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 5.25 + (((tickAnim - 180) / 40) * (0-(5.25)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 0) / 96) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 96) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 96) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 7) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 103) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 5) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 103) / 5) * (0.05-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 108) / 7) * (0-(0)));
            yy = -0.05 + (((tickAnim - 108) / 7) * (0-(-0.05)));
            zz = 0.05 + (((tickAnim - 108) / 7) * (0-(0.05)));
        }
        else if (tickAnim >= 115 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 115) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 35) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 150) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 21) * (0.1-(0)));
            zz = 0 + (((tickAnim - 150) / 21) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 171) / 9) * (0-(0)));
            yy = 0.1 + (((tickAnim - 171) / 9) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 171) / 9) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            yy = 0.1 + (((tickAnim - 180) / 40) * (0-(0.1)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 30) / 13) * (22.25-(0)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 22.25 + (((tickAnim - 43) / 5) * (0-(22.25)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 48) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 38) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 86) / 10) * (16.75-(0)));
            yy = 0 + (((tickAnim - 86) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 10) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 106) {
            xx = 16.75 + (((tickAnim - 96) / 10) * (0-(16.75)));
            yy = 0 + (((tickAnim - 96) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1 + (((tickAnim - 43) / 177) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+150))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+150))*-1 + (((tickAnim - 43) / 177) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+150))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-2 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 43) / 177) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-3 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+100))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 43) / 177) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+100))*-4 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+100))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+90))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1 + (((tickAnim - 43) / 177) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+90))*-5 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+90))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+70))*-6-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1 + (((tickAnim - 43) / 177) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+70))*-6 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+70))*-6)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+50))*-7-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1 + (((tickAnim - 43) / 177) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+50))*-7 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+50))*-7)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail7, Tail7.rotateAngleX + (float) Math.toRadians(xx), Tail7.rotateAngleY + (float) Math.toRadians(yy), Tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+20))*-8-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1 + (((tickAnim - 43) / 177) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+20))*-8 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+20))*-8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 43) / 177) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail8, Tail8.rotateAngleX + (float) Math.toRadians(xx), Tail8.rotateAngleY + (float) Math.toRadians(yy), Tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 138 && tickAnim < 153) {
            xx = 1 + (((tickAnim - 138) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 138) / 15) * (1.935+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*2-(1)));
            zz = 1 + (((tickAnim - 138) / 15) * (1-(1)));
        }
        else if (tickAnim >= 153 && tickAnim < 172) {
            xx = 1 + (((tickAnim - 153) / 19) * (1-(1)));
            yy = 1.935+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*2 + (((tickAnim - 153) / 19) * (1-(1.935+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*2)));
            zz = 1 + (((tickAnim - 153) / 19) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachytrachelopan entity = (EntityPrehistoricFloraBrachytrachelopan) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 5.5 + (((tickAnim - 15) / 3) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5.5 + (((tickAnim - 18) / 15) * (0-(5.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.95-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0.95 + (((tickAnim - 15) / 3) * (0.95-(0.95)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0.95 + (((tickAnim - 18) / 15) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 3.75 + (((tickAnim - 15) / 3) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 3.75 + (((tickAnim - 18) / 15) * (0-(3.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Shoulders, Shoulders.rotateAngleX + (float) Math.toRadians(xx), Shoulders.rotateAngleY + (float) Math.toRadians(yy), Shoulders.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.6-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0.6 + (((tickAnim - 15) / 3) * (0.6-(0.6)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0.6 + (((tickAnim - 18) / 15) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Shoulders.rotationPointX = this.Shoulders.rotationPointX + (float)(xx);
        this.Shoulders.rotationPointY = this.Shoulders.rotationPointY - (float)(yy);
        this.Shoulders.rotationPointZ = this.Shoulders.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.98596-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.6679-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.40919-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -22.98596 + (((tickAnim - 15) / 3) * (-22.98596-(-22.98596)));
            yy = -0.6679 + (((tickAnim - 15) / 3) * (-0.6679-(-0.6679)));
            zz = -2.40919 + (((tickAnim - 15) / 3) * (-2.40919-(-2.40919)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -22.98596 + (((tickAnim - 18) / 15) * (0-(-22.98596)));
            yy = -0.6679 + (((tickAnim - 18) / 15) * (0-(-0.6679)));
            zz = -2.40919 + (((tickAnim - 18) / 15) * (0-(-2.40919)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.58913-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.43625-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.41126-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2.58913 + (((tickAnim - 15) / 3) * (-2.58913-(-2.58913)));
            yy = -1.43625 + (((tickAnim - 15) / 3) * (-1.43625-(-1.43625)));
            zz = 6.41126 + (((tickAnim - 15) / 3) * (6.41126-(6.41126)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -2.58913 + (((tickAnim - 18) / 15) * (0-(-2.58913)));
            yy = -1.43625 + (((tickAnim - 18) / 15) * (0-(-1.43625)));
            zz = 6.41126 + (((tickAnim - 18) / 15) * (0-(6.41126)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 19 + (((tickAnim - 15) / 3) * (19-(19)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 19 + (((tickAnim - 18) / 15) * (0-(19)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 15) / 3) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.5 + (((tickAnim - 18) / 15) * (0-(0.5)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL.rotationPointX = this.HandL.rotationPointX + (float)(xx);
        this.HandL.rotationPointY = this.HandL.rotationPointY - (float)(yy);
        this.HandL.rotationPointZ = this.HandL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.86793-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9.41638-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.79131-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -22.86793 + (((tickAnim - 15) / 3) * (-22.86793-(-22.86793)));
            yy = -9.41638 + (((tickAnim - 15) / 3) * (-9.41638-(-9.41638)));
            zz = 6.79131 + (((tickAnim - 15) / 3) * (6.79131-(6.79131)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -22.86793 + (((tickAnim - 18) / 15) * (0-(-22.86793)));
            yy = -9.41638 + (((tickAnim - 18) / 15) * (0-(-9.41638)));
            zz = 6.79131 + (((tickAnim - 18) / 15) * (0-(6.79131)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.43583-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (8.34793-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-4.96183-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -7.43583 + (((tickAnim - 15) / 3) * (-7.43583-(-7.43583)));
            yy = 8.34793 + (((tickAnim - 15) / 3) * (8.34793-(8.34793)));
            zz = -4.96183 + (((tickAnim - 15) / 3) * (-4.96183-(-4.96183)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -7.43583 + (((tickAnim - 18) / 15) * (0-(-7.43583)));
            yy = 8.34793 + (((tickAnim - 18) / 15) * (0-(8.34793)));
            zz = -4.96183 + (((tickAnim - 18) / 15) * (0-(-4.96183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.45-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.45 + (((tickAnim - 15) / 3) * (0.45-(0.45)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0.45 + (((tickAnim - 18) / 15) * (0-(0.45)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ElbowL2.rotationPointX = this.ElbowL2.rotationPointX + (float)(xx);
        this.ElbowL2.rotationPointY = this.ElbowL2.rotationPointY - (float)(yy);
        this.ElbowL2.rotationPointZ = this.ElbowL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 19 + (((tickAnim - 15) / 3) * (19-(19)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 19 + (((tickAnim - 18) / 15) * (0-(19)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL2, HandL2.rotateAngleX + (float) Math.toRadians(xx), HandL2.rotateAngleY + (float) Math.toRadians(yy), HandL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 15) / 3) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.5 + (((tickAnim - 18) / 15) * (0-(0.5)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL2.rotationPointX = this.HandL2.rotationPointX + (float)(xx);
        this.HandL2.rotationPointY = this.HandL2.rotationPointY - (float)(yy);
        this.HandL2.rotationPointZ = this.HandL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.25 + (((tickAnim - 15) / 3) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.25 + (((tickAnim - 18) / 15) * (0-(7.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 15) / 3) * (0.275-(0.275)));
            zz = 1.25 + (((tickAnim - 15) / 3) * (1.25-(1.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.275 + (((tickAnim - 18) / 15) * (0-(0.275)));
            zz = 1.25 + (((tickAnim - 18) / 15) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck4.rotationPointX = this.Neck4.rotationPointX + (float)(xx);
        this.Neck4.rotationPointY = this.Neck4.rotationPointY - (float)(yy);
        this.Neck4.rotationPointZ = this.Neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 24.5 + (((tickAnim - 15) / 3) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 24.5 + (((tickAnim - 18) / 15) * (0-(24.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 15) / 3) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.35 + (((tickAnim - 18) / 15) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.75 + (((tickAnim - 15) / 3) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 7.75 + (((tickAnim - 18) / 5) * (5.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(7.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 5.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 23) / 10) * (0-(5.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -5.25 + (((tickAnim - 15) / 3) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -5.25 + (((tickAnim - 18) / 15) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.75 + (((tickAnim - 15) / 3) * (-3-(6.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -3 + (((tickAnim - 18) / 5) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*4-(-3)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*4 + (((tickAnim - 23) / 10) * (0-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*4)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0.2 + (((tickAnim - 15) / 3) * (0.2-(0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0.2 + (((tickAnim - 18) / 15) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (23-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 23 + (((tickAnim - 15) / 3) * (0-(23)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachytrachelopan entity = (EntityPrehistoricFloraBrachytrachelopan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 18.5 + (((tickAnim - 18) / 15) * (-16.68-(18.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -16.68 + (((tickAnim - 33) / 17) * (0-(-16.68)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (4.5-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 25) / 8) * (-12-(4.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -12 + (((tickAnim - 33) / 17) * (0-(-12)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (2-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-0.65-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 2 + (((tickAnim - 25) / 8) * (0-(2)));
            zz = -0.65 + (((tickAnim - 25) / 8) * (0-(-0.65)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeL.rotationPointX = this.KneeL.rotationPointX + (float)(xx);
        this.KneeL.rotationPointY = this.KneeL.rotationPointY - (float)(yy);
        this.KneeL.rotationPointZ = this.KneeL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (20.38-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 20.38 + (((tickAnim - 25) / 6) * (8.75-(20.38)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 31) / 2) * (28.25-(8.75)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
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
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (1.265-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = 1.265 + (((tickAnim - 25) / 6) * (0.37-(1.265)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0.37 + (((tickAnim - 31) / 2) * (0.375-(0.37)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.375 + (((tickAnim - 33) / 17) * (0-(0.375)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachytrachelopan entity = (EntityPrehistoricFloraBrachytrachelopan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -9.25 + (((tickAnim - 20) / 12) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 32) / 18) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Brachytrachelopan, Brachytrachelopan.rotateAngleX + (float) Math.toRadians(xx), Brachytrachelopan.rotateAngleY + (float) Math.toRadians(yy), Brachytrachelopan.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-7.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = -7.325 + (((tickAnim - 20) / 12) * (-7.325-(-7.325)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -7.325 + (((tickAnim - 32) / 18) * (0-(-7.325)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Brachytrachelopan.rotationPointX = this.Brachytrachelopan.rotationPointX + (float)(xx);
        this.Brachytrachelopan.rotationPointY = this.Brachytrachelopan.rotationPointY - (float)(yy);
        this.Brachytrachelopan.rotationPointZ = this.Brachytrachelopan.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.55303-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-12.37985-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-7.05806-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -6.55303 + (((tickAnim - 20) / 12) * (-6.55303-(-6.55303)));
            yy = -12.37985 + (((tickAnim - 20) / 12) * (-12.37985-(-12.37985)));
            zz = -7.05806 + (((tickAnim - 20) / 12) * (-7.05806-(-7.05806)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -6.55303 + (((tickAnim - 32) / 18) * (0-(-6.55303)));
            yy = -12.37985 + (((tickAnim - 32) / 18) * (0-(-12.37985)));
            zz = -7.05806 + (((tickAnim - 32) / 18) * (0-(-7.05806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42.42811-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.57216-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.01451-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 42.42811 + (((tickAnim - 20) / 12) * (42.42811-(42.42811)));
            yy = -2.57216 + (((tickAnim - 20) / 12) * (-2.57216-(-2.57216)));
            zz = 6.01451 + (((tickAnim - 20) / 12) * (6.01451-(6.01451)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 42.42811 + (((tickAnim - 32) / 18) * (0-(42.42811)));
            yy = -2.57216 + (((tickAnim - 32) / 18) * (0-(-2.57216)));
            zz = 6.01451 + (((tickAnim - 32) / 18) * (0-(6.01451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-23.48265-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.49198-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.33206-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -23.48265 + (((tickAnim - 20) / 12) * (-23.48265-(-23.48265)));
            yy = -1.49198 + (((tickAnim - 20) / 12) * (-1.49198-(-1.49198)));
            zz = -1.33206 + (((tickAnim - 20) / 12) * (-1.33206-(-1.33206)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -23.48265 + (((tickAnim - 32) / 18) * (0-(-23.48265)));
            yy = -1.49198 + (((tickAnim - 32) / 18) * (0-(-1.49198)));
            zz = -1.33206 + (((tickAnim - 32) / 18) * (0-(-1.33206)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0.75 + (((tickAnim - 20) / 12) * (0.75-(0.75)));
            zz = 0.2 + (((tickAnim - 20) / 12) * (0.2-(0.2)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.75 + (((tickAnim - 32) / 18) * (0-(0.75)));
            zz = 0.2 + (((tickAnim - 32) / 18) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.55303-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.3799-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (7.0581-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -6.55303 + (((tickAnim - 20) / 12) * (-6.55303-(-6.55303)));
            yy = 12.3799 + (((tickAnim - 20) / 12) * (12.3799-(12.3799)));
            zz = 7.0581 + (((tickAnim - 20) / 12) * (7.0581-(7.0581)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -6.55303 + (((tickAnim - 32) / 18) * (0-(-6.55303)));
            yy = 12.3799 + (((tickAnim - 32) / 18) * (0-(12.3799)));
            zz = 7.0581 + (((tickAnim - 32) / 18) * (0-(7.0581)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42.42811-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.5722-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-6.0145-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 42.42811 + (((tickAnim - 20) / 12) * (42.42811-(42.42811)));
            yy = 2.5722 + (((tickAnim - 20) / 12) * (2.5722-(2.5722)));
            zz = -6.0145 + (((tickAnim - 20) / 12) * (-6.0145-(-6.0145)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 42.42811 + (((tickAnim - 32) / 18) * (0-(42.42811)));
            yy = 2.5722 + (((tickAnim - 32) / 18) * (0-(2.5722)));
            zz = -6.0145 + (((tickAnim - 32) / 18) * (0-(-6.0145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL2, KneeL2.rotateAngleX + (float) Math.toRadians(xx), KneeL2.rotateAngleY + (float) Math.toRadians(yy), KneeL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-23.48265-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.49198-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.33206-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -23.48265 + (((tickAnim - 20) / 12) * (-23.48265-(-23.48265)));
            yy = -1.49198 + (((tickAnim - 20) / 12) * (-1.49198-(-1.49198)));
            zz = -1.33206 + (((tickAnim - 20) / 12) * (-1.33206-(-1.33206)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -23.48265 + (((tickAnim - 32) / 18) * (0-(-23.48265)));
            yy = -1.49198 + (((tickAnim - 32) / 18) * (0-(-1.49198)));
            zz = -1.33206 + (((tickAnim - 32) / 18) * (0-(-1.33206)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0.75 + (((tickAnim - 20) / 12) * (0.75-(0.75)));
            zz = 0.2 + (((tickAnim - 20) / 12) * (0.2-(0.2)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.75 + (((tickAnim - 32) / 18) * (0-(0.75)));
            zz = 0.2 + (((tickAnim - 32) / 18) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL2.rotationPointX = this.FootL2.rotationPointX + (float)(xx);
        this.FootL2.rotationPointY = this.FootL2.rotationPointY - (float)(yy);
        this.FootL2.rotationPointZ = this.FootL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 20) / 12) * (1-(1)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 32) / 18) * (0-(1)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.25058-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.24981-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.02947-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 3.25058 + (((tickAnim - 20) / 12) * (3.25058-(3.25058)));
            yy = -2.24981 + (((tickAnim - 20) / 12) * (-2.24981-(-2.24981)));
            zz = -0.02947 + (((tickAnim - 20) / 12) * (-0.02947-(-0.02947)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 3.25058 + (((tickAnim - 32) / 18) * (0-(3.25058)));
            yy = -2.24981 + (((tickAnim - 32) / 18) * (0-(-2.24981)));
            zz = -0.02947 + (((tickAnim - 32) / 18) * (0-(-0.02947)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.98147-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.26224-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.44129-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -3.98147 + (((tickAnim - 20) / 12) * (-3.98147-(-3.98147)));
            yy = -2.26224 + (((tickAnim - 20) / 12) * (-2.26224-(-2.26224)));
            zz = -0.44129 + (((tickAnim - 20) / 12) * (-0.44129-(-0.44129)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -3.98147 + (((tickAnim - 32) / 18) * (0-(-3.98147)));
            yy = -2.26224 + (((tickAnim - 32) / 18) * (0-(-2.26224)));
            zz = -0.44129 + (((tickAnim - 32) / 18) * (0-(-0.44129)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.2982-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.11306-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.21038-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 3.2982 + (((tickAnim - 20) / 12) * (3.2982-(3.2982)));
            yy = -1.11306 + (((tickAnim - 20) / 12) * (-1.11306-(-1.11306)));
            zz = -2.21038 + (((tickAnim - 20) / 12) * (-2.21038-(-2.21038)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 3.2982 + (((tickAnim - 32) / 18) * (0-(3.2982)));
            yy = -1.11306 + (((tickAnim - 32) / 18) * (0-(-1.11306)));
            zz = -2.21038 + (((tickAnim - 32) / 18) * (0-(-2.21038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 4.25 + (((tickAnim - 20) / 12) * (4.25-(4.25)));
            yy = -8 + (((tickAnim - 20) / 12) * (-8-(-8)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 32) / 18) * (0-(4.25)));
            yy = -8 + (((tickAnim - 32) / 18) * (0-(-8)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.03867-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-7.47675-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.59181-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 12.03867 + (((tickAnim - 20) / 12) * (12.03867-(12.03867)));
            yy = -7.47675 + (((tickAnim - 20) / 12) * (-7.47675-(-7.47675)));
            zz = -0.59181 + (((tickAnim - 20) / 12) * (-0.59181-(-0.59181)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 12.03867 + (((tickAnim - 32) / 18) * (0-(12.03867)));
            yy = -7.47675 + (((tickAnim - 32) / 18) * (0-(-7.47675)));
            zz = -0.59181 + (((tickAnim - 32) / 18) * (0-(-0.59181)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.98063-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6.49105-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.34165-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 10.98063 + (((tickAnim - 20) / 12) * (10.98063-(10.98063)));
            yy = -6.49105 + (((tickAnim - 20) / 12) * (-6.49105-(-6.49105)));
            zz = 0.34165 + (((tickAnim - 20) / 12) * (0.34165-(0.34165)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 10.98063 + (((tickAnim - 32) / 18) * (0-(10.98063)));
            yy = -6.49105 + (((tickAnim - 32) / 18) * (0-(-6.49105)));
            zz = 0.34165 + (((tickAnim - 32) / 18) * (0-(0.34165)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail7, Tail7.rotateAngleX + (float) Math.toRadians(xx), Tail7.rotateAngleY + (float) Math.toRadians(yy), Tail7.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Shoulders, Shoulders.rotateAngleX + (float) Math.toRadians(xx), Shoulders.rotateAngleY + (float) Math.toRadians(yy), Shoulders.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 18.75 + (((tickAnim - 20) / 12) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 32) / 18) * (0-(18.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -25.25 + (((tickAnim - 20) / 12) * (-25.25-(-25.25)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -25.25 + (((tickAnim - 32) / 18) * (0-(-25.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 17 + (((tickAnim - 20) / 12) * (17-(17)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 32) / 18) * (0-(17)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0.95 + (((tickAnim - 20) / 12) * (0.95-(0.95)));
            zz = -0.225 + (((tickAnim - 20) / 12) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.95 + (((tickAnim - 32) / 18) * (0-(0.95)));
            zz = -0.225 + (((tickAnim - 32) / 18) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL.rotationPointX = this.HandL.rotationPointX + (float)(xx);
        this.HandL.rotationPointY = this.HandL.rotationPointY - (float)(yy);
        this.HandL.rotationPointZ = this.HandL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 18.75 + (((tickAnim - 20) / 12) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 32) / 18) * (0-(18.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -25.25 + (((tickAnim - 20) / 12) * (-25.25-(-25.25)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -25.25 + (((tickAnim - 32) / 18) * (0-(-25.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 17 + (((tickAnim - 20) / 12) * (17-(17)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 32) / 18) * (0-(17)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL2, HandL2.rotateAngleX + (float) Math.toRadians(xx), HandL2.rotateAngleY + (float) Math.toRadians(yy), HandL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0.95 + (((tickAnim - 20) / 12) * (0.95-(0.95)));
            zz = -0.225 + (((tickAnim - 20) / 12) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.95 + (((tickAnim - 32) / 18) * (0-(0.95)));
            zz = -0.225 + (((tickAnim - 32) / 18) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL2.rotationPointX = this.HandL2.rotationPointX + (float)(xx);
        this.HandL2.rotationPointY = this.HandL2.rotationPointY - (float)(yy);
        this.HandL2.rotationPointZ = this.HandL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -5 + (((tickAnim - 20) / 11) * (-5-(-5)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 31) / 19) * (0-(-5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -8.25 + (((tickAnim - 20) / 11) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 31) / 19) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.96504-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.12327-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.59735-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 3.96504 + (((tickAnim - 20) / 11) * (3.96504-(3.96504)));
            yy = -0.12327 + (((tickAnim - 20) / 11) * (-0.12327-(-0.12327)));
            zz = -3.59735 + (((tickAnim - 20) / 11) * (-3.59735-(-3.59735)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 3.96504 + (((tickAnim - 31) / 19) * (0-(3.96504)));
            yy = -0.12327 + (((tickAnim - 31) / 19) * (0-(-0.12327)));
            zz = -3.59735 + (((tickAnim - 31) / 19) * (0-(-3.59735)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (11.50507-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.46458-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (2.17912-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 11.50507 + (((tickAnim - 11) / 6) * (11.22633-(11.50507)));
            yy = 0.46458 + (((tickAnim - 11) / 6) * (0.71474-(0.46458)));
            zz = 2.17912 + (((tickAnim - 11) / 6) * (3.35249-(2.17912)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 11.22633 + (((tickAnim - 17) / 3) * (8.31705-(11.22633)));
            yy = 0.71474 + (((tickAnim - 17) / 3) * (0.85769-(0.71474)));
            zz = 3.35249 + (((tickAnim - 17) / 3) * (4.02299-(3.35249)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 8.31705 + (((tickAnim - 20) / 11) * (8.31705-(8.31705)));
            yy = 0.85769 + (((tickAnim - 20) / 11) * (0.85769-(0.85769)));
            zz = 4.02299 + (((tickAnim - 20) / 11) * (4.02299-(4.02299)));
        }
        else if (tickAnim >= 31 && tickAnim < 41) {
            xx = 8.31705 + (((tickAnim - 31) / 10) * (-3.02228-(8.31705)));
            yy = 0.85769 + (((tickAnim - 31) / 10) * (0.4102-(0.85769)));
            zz = 4.02299 + (((tickAnim - 31) / 10) * (1.92404-(4.02299)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -3.02228 + (((tickAnim - 41) / 9) * (0-(-3.02228)));
            yy = 0.4102 + (((tickAnim - 41) / 9) * (0-(0.4102)));
            zz = 1.92404 + (((tickAnim - 41) / 9) * (0-(1.92404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




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

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachytrachelopan entity = (EntityPrehistoricFloraBrachytrachelopan) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*4-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*0.5-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = -2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*4 + (((tickAnim - 22) / 33) * (0-(-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*4)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*0.5 + (((tickAnim - 22) / 33) * (0-(1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));

        this.Neck4.rotationPointX = this.Neck4.rotationPointX + (float)(0);
        this.Neck4.rotationPointY = this.Neck4.rotationPointY - (float)(0);
        this.Neck4.rotationPointZ = this.Neck4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.3773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.09594-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 2.3773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 40) / 15) * (0-(2.3773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -0.09594 + (((tickAnim - 40) / 15) * (0-(-0.09594)));
            zz = 1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 40) / 15) * (0-(1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 15) / 25) * (-0.9977-(1)));
            yy = 0 + (((tickAnim - 15) / 25) * (-0.09594-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -0.9977 + (((tickAnim - 40) / 15) * (0-(-0.9977)));
            yy = -0.09594 + (((tickAnim - 40) / 15) * (0-(-0.09594)));
            zz = 1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 40) / 15) * (0-(1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(0);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(0);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (-6.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 55) {
            xx = -6.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*8 + (((tickAnim - 32) / 23) * (0-(-6.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*8)));
            yy = 0 + (((tickAnim - 32) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(0);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(0);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 37) {
            xx = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-5 + (((tickAnim - 15) / 22) * (-3.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-8-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-5)));
            yy = 0 + (((tickAnim - 15) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 22) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = -3.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-8 + (((tickAnim - 37) / 18) * (0-(-3.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-8)));
            yy = 0 + (((tickAnim - 37) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

        this.Head.rotationPointX = this.Head.rotationPointX + (float)(0);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(0);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 13 + (((tickAnim - 38) / 15) * (0-(13)));
            yy = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.05-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.05 + (((tickAnim - 38) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.05)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
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
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachytrachelopan entity = (EntityPrehistoricFloraBrachytrachelopan) entitylivingbaseIn;
        int animCycle = 170;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 1.75 + (((tickAnim - 25) / 23) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 1.75 + (((tickAnim - 48) / 33) * (-1.25-(1.75)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = -1.25 + (((tickAnim - 81) / 69) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -1.25 + (((tickAnim - 150) / 20) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Brachytrachelopan, Brachytrachelopan.rotateAngleX + (float) Math.toRadians(xx), Brachytrachelopan.rotateAngleY + (float) Math.toRadians(yy), Brachytrachelopan.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-1.05-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = -1.05 + (((tickAnim - 25) / 23) * (-1.05-(-1.05)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = -1.05 + (((tickAnim - 48) / 33) * (-1.875-(-1.05)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = -1.875 + (((tickAnim - 81) / 69) * (-1.875-(-1.875)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = -1.875 + (((tickAnim - 150) / 20) * (0-(-1.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Brachytrachelopan.rotationPointX = this.Brachytrachelopan.rotationPointX + (float)(xx);
        this.Brachytrachelopan.rotationPointY = this.Brachytrachelopan.rotationPointY - (float)(yy);
        this.Brachytrachelopan.rotationPointZ = this.Brachytrachelopan.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 7.5 + (((tickAnim - 25) / 23) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 7.5 + (((tickAnim - 48) / 33) * (12.48223-(7.5)));
            yy = 0 + (((tickAnim - 48) / 33) * (-0.05361-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (-0.20362-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 12.48223 + (((tickAnim - 81) / 69) * (12.48223-(12.48223)));
            yy = -0.05361 + (((tickAnim - 81) / 69) * (-0.05361-(-0.05361)));
            zz = -0.20362 + (((tickAnim - 81) / 69) * (-0.20362-(-0.20362)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 12.48223 + (((tickAnim - 150) / 20) * (0-(12.48223)));
            yy = -0.05361 + (((tickAnim - 150) / 20) * (0-(-0.05361)));
            zz = -0.20362 + (((tickAnim - 150) / 20) * (0-(-0.20362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -2.5 + (((tickAnim - 25) / 23) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = -2.5 + (((tickAnim - 48) / 33) * (0.75-(-2.5)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0.75 + (((tickAnim - 81) / 69) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0.75 + (((tickAnim - 150) / 20) * (0-(0.75)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));

        this.KneeL.rotationPointX = this.KneeL.rotationPointX + (float)(0);
        this.KneeL.rotationPointY = this.KneeL.rotationPointY - (float)(0);
        this.KneeL.rotationPointZ = this.KneeL.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -6.5 + (((tickAnim - 25) / 23) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = -6.5 + (((tickAnim - 48) / 33) * (3.5-(-6.5)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 3.5 + (((tickAnim - 81) / 69) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 3.5 + (((tickAnim - 150) / 20) * (0-(3.5)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));

        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(0);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(0);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 48) / 33) * (3-(0)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 3 + (((tickAnim - 81) / 69) * (3-(3)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 3 + (((tickAnim - 150) / 20) * (0-(3)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 0) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 150) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL2, KneeL2.rotateAngleX + (float) Math.toRadians(xx), KneeL2.rotateAngleY + (float) Math.toRadians(yy), KneeL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 0) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 150) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 4 + (((tickAnim - 25) / 23) * (4-(4)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 4 + (((tickAnim - 48) / 33) * (0-(4)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 1.75 + (((tickAnim - 25) / 23) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 1.75 + (((tickAnim - 48) / 33) * (0-(1.75)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 3.75 + (((tickAnim - 25) / 23) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 3.75 + (((tickAnim - 48) / 33) * (0-(3.75)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 2.25 + (((tickAnim - 25) / 23) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 2.25 + (((tickAnim - 48) / 33) * (1.5-(2.25)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 1.5 + (((tickAnim - 81) / 19) * (0-(1.5)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -3.75 + (((tickAnim - 25) / 23) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 100) {
            xx = -3.75 + (((tickAnim - 48) / 52) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 48) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 52) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -4.25 + (((tickAnim - 25) / 23) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 100) {
            xx = -4.25 + (((tickAnim - 48) / 52) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 48) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 52) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -1.75 + (((tickAnim - 25) / 23) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 100) {
            xx = -1.75 + (((tickAnim - 48) / 52) * (7-(-1.75)));
            yy = 0 + (((tickAnim - 48) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 52) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 7 + (((tickAnim - 100) / 70) * (0-(7)));
            yy = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail7, Tail7.rotateAngleX + (float) Math.toRadians(xx), Tail7.rotateAngleY + (float) Math.toRadians(yy), Tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -5.25 + (((tickAnim - 25) / 23) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 170) {
            xx = -5.25 + (((tickAnim - 48) / 122) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 48) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 122) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail8, Tail8.rotateAngleX + (float) Math.toRadians(xx), Tail8.rotateAngleY + (float) Math.toRadians(yy), Tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 81) {
            xx = 1 + (((tickAnim - 25) / 56) * (2-(1)));
            yy = 0 + (((tickAnim - 25) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 56) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 2 + (((tickAnim - 81) / 69) * (2-(2)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 2 + (((tickAnim - 150) / 20) * (0-(2)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 81) {
            xx = 1.75 + (((tickAnim - 25) / 56) * (0-(1.75)));
            yy = 0 + (((tickAnim - 25) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 56) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Shoulders, Shoulders.rotateAngleX + (float) Math.toRadians(xx), Shoulders.rotateAngleY + (float) Math.toRadians(yy), Shoulders.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 6.75 + (((tickAnim - 25) / 23) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 6.75 + (((tickAnim - 48) / 33) * (-20-(6.75)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = -20 + (((tickAnim - 81) / 69) * (-20-(-20)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -20 + (((tickAnim - 150) / 10) * (23.5-(-20)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 23.5 + (((tickAnim - 160) / 10) * (0-(23.5)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -8.25 + (((tickAnim - 25) / 23) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -8.25 + (((tickAnim - 48) / 17) * (-21.14-(-8.25)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 81) {
            xx = -21.14 + (((tickAnim - 65) / 16) * (10-(-21.14)));
            yy = 0 + (((tickAnim - 65) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 16) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 10 + (((tickAnim - 81) / 69) * (10-(10)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 10 + (((tickAnim - 150) / 10) * (-17.75-(10)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -17.75 + (((tickAnim - 160) / 10) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 33) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            yy = -0.275 + (((tickAnim - 81) / 69) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 150) / 10) * (0.945-(-0.275)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            yy = 0.945 + (((tickAnim - 160) / 10) * (0-(0.945)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ElbowL.rotationPointX = this.ElbowL.rotationPointX + (float)(xx);
        this.ElbowL.rotationPointY = this.ElbowL.rotationPointY - (float)(yy);
        this.ElbowL.rotationPointZ = this.ElbowL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 48) / 17) * (33.99-(0)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = 33.99 + (((tickAnim - 65) / 13) * (0-(33.99)));
            yy = 0 + (((tickAnim - 65) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 13) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 78) / 3) * (9.25-(0)));
            yy = 0 + (((tickAnim - 78) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 3) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 9.25 + (((tickAnim - 81) / 69) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 9.25 + (((tickAnim - 150) / 10) * (14.63-(9.25)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 14.63 + (((tickAnim - 160) / 10) * (0-(14.63)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 17) * (1.035-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (-0.425-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 65) / 13) * (0-(0)));
            yy = 1.035 + (((tickAnim - 65) / 13) * (0-(1.035)));
            zz = -0.425 + (((tickAnim - 65) / 13) * (0-(-0.425)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 78) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 3) * (0.075-(0)));
            zz = 0 + (((tickAnim - 78) / 3) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            yy = 0.075 + (((tickAnim - 81) / 69) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            yy = 0.075 + (((tickAnim - 150) / 10) * (0.35-(0.075)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 160) / 10) * (0-(0.35)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL.rotationPointX = this.HandL.rotationPointX + (float)(xx);
        this.HandL.rotationPointY = this.HandL.rotationPointY - (float)(yy);
        this.HandL.rotationPointZ = this.HandL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -29.75 + (((tickAnim - 25) / 23) * (-29.75-(-29.75)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = -29.75 + (((tickAnim - 48) / 33) * (9-(-29.75)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 9 + (((tickAnim - 81) / 69) * (9-(9)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 9 + (((tickAnim - 150) / 20) * (0-(9)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -25.5 + (((tickAnim - 13) / 12) * (16-(-25.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 16 + (((tickAnim - 25) / 23) * (16-(16)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 16 + (((tickAnim - 48) / 33) * (0-(16)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 36.5 + (((tickAnim - 13) / 9) * (0.55-(36.5)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0.55 + (((tickAnim - 22) / 3) * (12.5-(0.55)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 12.5 + (((tickAnim - 25) / 23) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 12.5 + (((tickAnim - 48) / 33) * (0-(12.5)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL2, HandL2.rotateAngleX + (float) Math.toRadians(xx), HandL2.rotateAngleY + (float) Math.toRadians(yy), HandL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.955-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.185-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 0.955 + (((tickAnim - 13) / 9) * (0-(0.955)));
            zz = -0.185 + (((tickAnim - 13) / 9) * (0-(-0.185)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0.65-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (-0.025-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            yy = 0.65 + (((tickAnim - 25) / 23) * (0.65-(0.65)));
            zz = -0.025 + (((tickAnim - 25) / 23) * (-0.025-(-0.025)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            yy = 0.65 + (((tickAnim - 48) / 33) * (0-(0.65)));
            zz = -0.025 + (((tickAnim - 48) / 33) * (0-(-0.025)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL2.rotationPointX = this.HandL2.rotationPointX + (float)(xx);
        this.HandL2.rotationPointY = this.HandL2.rotationPointY - (float)(yy);
        this.HandL2.rotationPointZ = this.HandL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 4.75 + (((tickAnim - 20) / 13) * (7.5-(4.75)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 7.5 + (((tickAnim - 33) / 5) * (7.25-(7.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 7.25 + (((tickAnim - 38) / 10) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 7.25 + (((tickAnim - 48) / 33) * (2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(7.25)));
            yy = 0 + (((tickAnim - 48) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 120) {
            xx = 2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 81) / 39) * (-2.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 81) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 39) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = -2.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 120) / 30) * (-9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-2.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 150) / 20) * (0-(-9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.7-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0.7 + (((tickAnim - 20) / 13) * (1.225-(0.7)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            zz = 1.225 + (((tickAnim - 33) / 15) * (1.225-(1.225)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 1.225 + (((tickAnim - 48) / 17) * (0.6-(1.225)));
        }
        else if (tickAnim >= 65 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 65) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 16) * (0-(0)));
            zz = 0.6 + (((tickAnim - 65) / 16) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck4.rotationPointX = this.Neck4.rotationPointX + (float)(xx);
        this.Neck4.rotationPointY = this.Neck4.rotationPointY - (float)(yy);
        this.Neck4.rotationPointZ = this.Neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (26.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 26.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 33) / 5) * (31.25-(26.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 31.25 + (((tickAnim - 38) / 10) * (31.25-(31.25)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 81) {
            xx = 31.25 + (((tickAnim - 48) / 33) * (5.8298+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8-(31.25)));
            yy = 0 + (((tickAnim - 48) / 33) * (1.66143-(0)));
            zz = 0 + (((tickAnim - 48) / 33) * (3.06033-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 5.8298+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8 + (((tickAnim - 81) / 19) * (-5.3251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(5.8298+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8)));
            yy = 1.66143 + (((tickAnim - 81) / 19) * (3.1569-(1.66143)));
            zz = 3.06033 + (((tickAnim - 81) / 19) * (2.94367-(3.06033)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -5.3251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 100) / 20) * (-2.704+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(-5.3251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 3.1569 + (((tickAnim - 100) / 20) * (4.90783-(3.1569)));
            zz = 2.94367 + (((tickAnim - 100) / 20) * (2.90702-(2.94367)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -2.704+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 120) / 20) * (-2.6952+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(-2.704+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 4.90783 + (((tickAnim - 120) / 20) * (5.66143-(4.90783)));
            zz = 2.90702 + (((tickAnim - 120) / 20) * (3.06033-(2.90702)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -2.6952+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 140) / 10) * (-3.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(-2.6952+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 5.66143 + (((tickAnim - 140) / 10) * (5.66143-(5.66143)));
            zz = 3.06033 + (((tickAnim - 140) / 10) * (3.06033-(3.06033)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -3.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 150) / 20) * (0-(-3.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 5.66143 + (((tickAnim - 150) / 20) * (0-(5.66143)));
            zz = 3.06033 + (((tickAnim - 150) / 20) * (0-(3.06033)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 25) / 56) * (0-(0)));
            yy = -0.5 + (((tickAnim - 25) / 56) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 25) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 10.25 + (((tickAnim - 25) / 8) * (7.25-(10.25)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 7.25 + (((tickAnim - 33) / 5) * (8.25-(7.25)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 81) {
            xx = 8.25 + (((tickAnim - 38) / 43) * (-4-(8.25)));
            yy = 0 + (((tickAnim - 38) / 43) * (8.25-(0)));
            zz = 0 + (((tickAnim - 38) / 43) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = -4 + (((tickAnim - 81) / 69) * (-4-(-4)));
            yy = 8.25 + (((tickAnim - 81) / 69) * (8.25-(8.25)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -4 + (((tickAnim - 150) / 20) * (0-(-4)));
            yy = 8.25 + (((tickAnim - 150) / 20) * (0-(8.25)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 25) / 56) * (0-(0)));
            yy = -0.3 + (((tickAnim - 25) / 56) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 25) / 56) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 9.5 + (((tickAnim - 25) / 8) * (4.5-(9.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 4.5 + (((tickAnim - 33) / 5) * (3.5-(4.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 65) {
            xx = 3.5 + (((tickAnim - 38) / 27) * (-2.61766-(3.5)));
            yy = 0 + (((tickAnim - 38) / 27) * (5.76486-(0)));
            zz = 0 + (((tickAnim - 38) / 27) * (-1.93419-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 81) {
            xx = -2.61766 + (((tickAnim - 65) / 16) * (-4.25-(-2.61766)));
            yy = 5.76486 + (((tickAnim - 65) / 16) * (11.75-(5.76486)));
            zz = -1.93419 + (((tickAnim - 65) / 16) * (0-(-1.93419)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = -4.25 + (((tickAnim - 81) / 69) * (-4.25-(-4.25)));
            yy = 11.75 + (((tickAnim - 81) / 69) * (11.75-(11.75)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = -4.25 + (((tickAnim - 150) / 20) * (0-(-4.25)));
            yy = 11.75 + (((tickAnim - 150) / 20) * (0-(11.75)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (8.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*5-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 8.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*5 + (((tickAnim - 38) / 6) * (7.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.2))*-3-(8.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*5)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 65) {
            xx = 7.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.2))*-3 + (((tickAnim - 44) / 21) * (15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(7.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.2))*-3)));
            yy = 0 + (((tickAnim - 44) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 21) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 86) {
            xx = 15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 65) / 21) * (0-(15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 65) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 21) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 86) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 86) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 64) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 17) * (0.18-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0.33-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 65) / 16) * (0-(0)));
            yy = 0.18 + (((tickAnim - 65) / 16) * (0-(0.18)));
            zz = 0.33 + (((tickAnim - 65) / 16) * (0-(0.33)));
        }
        else if (tickAnim >= 81 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 69) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);



        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(0), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 60 && tickAnim < 66) {
            xx = 1 + (((tickAnim - 60) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 60) / 6) * (-0.01-(1)));
            zz = 1 + (((tickAnim - 60) / 6) * (1-(1)));
        }
        else if (tickAnim >= 66 && tickAnim < 71) {
            xx = 1 + (((tickAnim - 66) / 5) * (1-(1)));
            yy = -0.01 + (((tickAnim - 66) / 5) * (1-(-0.01)));
            zz = 1 + (((tickAnim - 66) / 5) * (1-(1)));
        }
        else if (tickAnim >= 71 && tickAnim < 122) {
            xx = 1 + (((tickAnim - 71) / 51) * (1-(1)));
            yy = 1 + (((tickAnim - 71) / 51) * (1-(1)));
            zz = 1 + (((tickAnim - 71) / 51) * (1-(1)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = 1 + (((tickAnim - 122) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 122) / 6) * (-0.01-(1)));
            zz = 1 + (((tickAnim - 122) / 6) * (1-(1)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = 1 + (((tickAnim - 128) / 5) * (1-(1)));
            yy = -0.01 + (((tickAnim - 128) / 5) * (1-(-0.01)));
            zz = 1 + (((tickAnim - 128) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachytrachelopan entity = (EntityPrehistoricFloraBrachytrachelopan) entitylivingbaseIn;

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBrachytrachelopan entity = (EntityPrehistoricFloraBrachytrachelopan) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 0) / 18) * (-21.2153+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*30-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.6144-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.10708-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -21.2153+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*30 + (((tickAnim - 18) / 5) * (-8.63893-(-21.2153+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*30)));
            yy = 0.6144 + (((tickAnim - 18) / 5) * (1.6595-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3-(0.6144)));
            zz = -0.10708 + (((tickAnim - 18) / 5) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1-(-0.10708)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -8.63893 + (((tickAnim - 23) / 3) * (-13.75-(-8.63893)));
            yy = 1.6595-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 23) / 3) * (0-(1.6595-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            zz = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1 + (((tickAnim - 23) / 3) * (0-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -13.75 + (((tickAnim - 26) / 2) * (-12.5-(-13.75)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1))*0.1 + (((tickAnim - 0) / 4) * (0.4-(0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1))*0.1)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            yy = 0.4 + (((tickAnim - 4) / 14) * (0.18-(0.4)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0.18 + (((tickAnim - 18) / 8) * (0.375-(0.18)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0.375 + (((tickAnim - 26) / 2) * (0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1))*0.1-(0.375)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -2 + (((tickAnim - 0) / 8) * (-2.1-(-2)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -2.1 + (((tickAnim - 8) / 10) * (14.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+20))*-15-(-2.1)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 14.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+20))*-15 + (((tickAnim - 18) / 3) * (-11.25-(14.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+20))*-15)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -11.25 + (((tickAnim - 21) / 2) * (-15.43828-(-11.25)));
            yy = 0 + (((tickAnim - 21) / 2) * (-0.38311-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0.95166-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -15.43828 + (((tickAnim - 23) / 3) * (-3.25-(-15.43828)));
            yy = -0.38311 + (((tickAnim - 23) / 3) * (0-(-0.38311)));
            zz = 0.95166 + (((tickAnim - 23) / 3) * (0-(0.95166)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -3.25 + (((tickAnim - 26) / 2) * (-2-(-3.25)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.8))*0.1 + (((tickAnim - 0) / 5) * (-0.3-(-0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.8))*0.1)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            yy = -0.3 + (((tickAnim - 5) / 13) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (2.55-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (-0.3-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 2.55 + (((tickAnim - 21) / 5) * (-0.3-(2.55)));
            zz = -0.3 + (((tickAnim - 21) / 5) * (0-(-0.3)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 26) / 2) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.8))*0.1-(-0.3)));
            zz = 0 + (((tickAnim - 26) / 2) * (0.05-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeL.rotationPointX = this.KneeL.rotationPointX + (float)(xx);
        this.KneeL.rotationPointY = this.KneeL.rotationPointY - (float)(yy);
        this.KneeL.rotationPointZ = this.KneeL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.25 + (((tickAnim - 0) / 8) * (7.875-(15.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 7.875 + (((tickAnim - 8) / 10) * (2.11-(7.875)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 2.11 + (((tickAnim - 18) / 3) * (29.47-(2.11)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 29.47 + (((tickAnim - 21) / 3) * (6.24-(29.47)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 6.24 + (((tickAnim - 24) / 2) * (16.75-(6.24)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 16.75 + (((tickAnim - 26) / 2) * (15.25-(16.75)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 8) * (0.8-(0.15)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.8 + (((tickAnim - 8) / 10) * (-0.125-(0.8)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = -0.125 + (((tickAnim - 18) / 3) * (2.685-(-0.125)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 2.685 + (((tickAnim - 21) / 3) * (0-(2.685)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 2) * (0.15-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
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
            xx = 5.25 + (((tickAnim - 0) / 3) * (8.5-(5.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 8.5 + (((tickAnim - 3) / 7) * (-9.40338-(8.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (1.10931-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0.13932-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -9.40338 + (((tickAnim - 10) / 3) * (-13.5-(-9.40338)));
            yy = 1.10931 + (((tickAnim - 10) / 3) * (0-(1.10931)));
            zz = 0.13932 + (((tickAnim - 10) / 3) * (0-(0.13932)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -13.5 + (((tickAnim - 13) / 15) * (5.25-(-13.5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 3) * (0.325-(0.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.325 + (((tickAnim - 3) / 10) * (0.9-(0.325)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 13) / 1) * (0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1))*-0.1-(0.9)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1))*-0.1 + (((tickAnim - 14) / 2) * (0.8-(0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1))*-0.1)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            yy = 0.8 + (((tickAnim - 16) / 12) * (0.4-(0.8)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL2.rotationPointX = this.LegL2.rotationPointX + (float)(xx);
        this.LegL2.rotationPointY = this.LegL2.rotationPointY - (float)(yy);
        this.LegL2.rotationPointZ = this.LegL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.25 + (((tickAnim - 0) / 3) * (-4.25-(-7.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.25 + (((tickAnim - 3) / 2) * (-9.75-(-4.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -9.75 + (((tickAnim - 5) / 3) * (-15.75-(-9.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -15.75 + (((tickAnim - 8) / 5) * (-6.5-(-15.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -6.5 + (((tickAnim - 13) / 15) * (-7.25-(-6.5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL2, KneeL2.rotateAngleX + (float) Math.toRadians(xx), KneeL2.rotateAngleY + (float) Math.toRadians(yy), KneeL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (1.725-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.725 + (((tickAnim - 8) / 5) * (-1-(1.725)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 13) / 1) * (-0.83+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.8))*0.1-(-1)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -0.83+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.8))*0.1 + (((tickAnim - 14) / 3) * (-0.72-(-0.83+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.8))*0.1)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = -0.72 + (((tickAnim - 17) / 11) * (0-(-0.72)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeL2.rotationPointX = this.KneeL2.rotationPointX + (float)(xx);
        this.KneeL2.rotationPointY = this.KneeL2.rotationPointY - (float)(yy);
        this.KneeL2.rotationPointZ = this.KneeL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.5 + (((tickAnim - 0) / 3) * (5.5-(3.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5.5 + (((tickAnim - 3) / 5) * (32.21-(5.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 32.21 + (((tickAnim - 8) / 4) * (7-(32.21)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 7 + (((tickAnim - 12) / 1) * (19.5-(7)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 19.5 + (((tickAnim - 13) / 8) * (10.85-(19.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 10.85 + (((tickAnim - 21) / 7) * (3.5-(10.85)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 3) * (0.975-(0.6)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 3) / 3) * (1.425-(0.975)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.425 + (((tickAnim - 6) / 2) * (2.645-(1.425)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 2.645 + (((tickAnim - 8) / 4) * (0.23-(2.645)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.23 + (((tickAnim - 12) / 1) * (0.525-(0.23)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 13) / 8) * (1.11-(0.525)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 1.11 + (((tickAnim - 21) / 7) * (0.6-(1.11)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL2.rotationPointX = this.FootL2.rotationPointX + (float)(xx);
        this.FootL2.rotationPointY = this.FootL2.rotationPointY - (float)(yy);
        this.FootL2.rotationPointZ = this.FootL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -4.7591 + (((tickAnim - 0) / 6) * (-21.99352-(-4.7591)));
            yy = 0.42324 + (((tickAnim - 0) / 6) * (0.4381-(0.42324)));
            zz = -2.46393 + (((tickAnim - 0) / 6) * (1.69429-(-2.46393)));
        }
        else if (tickAnim >= 6 && tickAnim < 23) {
            xx = -21.99352 + (((tickAnim - 6) / 17) * (6.75-(-21.99352)));
            yy = 0.4381 + (((tickAnim - 6) / 17) * (0-(0.4381)));
            zz = 1.69429 + (((tickAnim - 6) / 17) * (0-(1.69429)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 6.75 + (((tickAnim - 23) / 5) * (-4.7591-(6.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.42324-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (-2.46393-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 6) * (-0.245-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 6) / 17) * (0-(0)));
            yy = -0.245 + (((tickAnim - 6) / 17) * (-0.225-(-0.245)));
            zz = 0 + (((tickAnim - 6) / 17) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 23) / 5) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ArmL.rotationPointX = this.ArmL.rotationPointX + (float)(xx);
        this.ArmL.rotationPointY = this.ArmL.rotationPointY - (float)(yy);
        this.ArmL.rotationPointZ = this.ArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -6.19613 + (((tickAnim - 0) / 6) * (15-(-6.19613)));
            yy = 1.70514 + (((tickAnim - 0) / 6) * (0-(1.70514)));
            zz = 3.61889 + (((tickAnim - 0) / 6) * (0-(3.61889)));
        }
        else if (tickAnim >= 6 && tickAnim < 23) {
            xx = 15 + (((tickAnim - 6) / 17) * (15.25-(15)));
            yy = 0 + (((tickAnim - 6) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 17) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 15.25 + (((tickAnim - 23) / 5) * (-6.19613-(15.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (1.70514-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (3.61889-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.175 + (((tickAnim - 0) / 6) * (-0.225-(1.175)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 6) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.1-(-0.225)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.1 + (((tickAnim - 8) / 3) * (-0.16-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.1)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = -0.16 + (((tickAnim - 11) / 6) * (-0.035-(-0.16)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -0.035 + (((tickAnim - 17) / 6) * (0.45-(-0.035)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.45 + (((tickAnim - 23) / 5) * (1.175-(0.45)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ElbowL.rotationPointX = this.ElbowL.rotationPointX + (float)(xx);
        this.ElbowL.rotationPointY = this.ElbowL.rotationPointY - (float)(yy);
        this.ElbowL.rotationPointZ = this.ElbowL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 26.25 + (((tickAnim - 0) / 4) * (-1.17-(26.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -1.17 + (((tickAnim - 4) / 2) * (7.75-(-1.17)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 7.75 + (((tickAnim - 6) / 5) * (0-(7.75)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -6.25 + (((tickAnim - 17) / 6) * (5.25-(-6.25)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 5.25 + (((tickAnim - 23) / 5) * (26.25-(5.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.725 + (((tickAnim - 0) / 4) * (-0.12-(0.725)));
            zz = -0.15 + (((tickAnim - 0) / 4) * (-0.08-(-0.15)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.12 + (((tickAnim - 4) / 2) * (0.075-(-0.12)));
            zz = -0.08 + (((tickAnim - 4) / 2) * (0-(-0.08)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 6) / 11) * (0-(0)));
            yy = 0.075 + (((tickAnim - 6) / 11) * (0.825-(0.075)));
            zz = 0 + (((tickAnim - 6) / 11) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.825 + (((tickAnim - 17) / 6) * (0.075-(0.825)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 23) / 5) * (0.725-(0.075)));
            zz = 0 + (((tickAnim - 23) / 5) * (-0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL.rotationPointX = this.HandL.rotationPointX + (float)(xx);
        this.HandL.rotationPointY = this.HandL.rotationPointY - (float)(yy);
        this.HandL.rotationPointZ = this.HandL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -5.95119 + (((tickAnim - 0) / 11) * (7.75-(-5.95119)));
            yy = 0.06085 + (((tickAnim - 0) / 11) * (0-(0.06085)));
            zz = -2.24918 + (((tickAnim - 0) / 11) * (0-(-2.24918)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 7.75 + (((tickAnim - 11) / 4) * (-7.11124-(7.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (-0.01018-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (1.49997-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -7.11124 + (((tickAnim - 15) / 4) * (-19-(-7.11124)));
            yy = -0.01018 + (((tickAnim - 15) / 4) * (0-(-0.01018)));
            zz = 1.49997 + (((tickAnim - 15) / 4) * (0-(1.49997)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -19 + (((tickAnim - 19) / 9) * (-5.95119-(-19)));
            yy = 0 + (((tickAnim - 19) / 9) * (0.06085-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (-2.24918-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 11) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            yy = -0.325 + (((tickAnim - 11) / 8) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 9) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ArmL2.rotationPointX = this.ArmL2.rotationPointX + (float)(xx);
        this.ArmL2.rotationPointY = this.ArmL2.rotationPointY - (float)(yy);
        this.ArmL2.rotationPointZ = this.ArmL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 12.5 + (((tickAnim - 0) / 11) * (16-(12.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 16 + (((tickAnim - 11) / 4) * (-2.87499-(16)));
            yy = 0 + (((tickAnim - 11) / 4) * (1.38138-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-2.56576-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -2.87499 + (((tickAnim - 15) / 4) * (12.5-(-2.87499)));
            yy = 1.38138 + (((tickAnim - 15) / 4) * (0-(1.38138)));
            zz = -2.56576 + (((tickAnim - 15) / 4) * (0-(-2.56576)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 12.5 + (((tickAnim - 19) / 9) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 15) * (0.795-(0.075)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0.795 + (((tickAnim - 15) / 4) * (-0.025-(0.795)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 19) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*-0.1-(-0.025)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*-0.1 + (((tickAnim - 22) / 2) * (-0.03-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*-0.1)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -0.03 + (((tickAnim - 24) / 4) * (-0.025-(-0.03)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ElbowL2.rotationPointX = this.ElbowL2.rotationPointX + (float)(xx);
        this.ElbowL2.rotationPointY = this.ElbowL2.rotationPointY - (float)(yy);
        this.ElbowL2.rotationPointZ = this.ElbowL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -3.25 + (((tickAnim - 0) / 7) * (-5.25-(-3.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -5.25 + (((tickAnim - 7) / 4) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (23.56-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 23.56 + (((tickAnim - 15) / 3) * (0-(23.56)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (7.75-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 7.75 + (((tickAnim - 19) / 9) * (-3.25-(7.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL2, HandL2.rotateAngleX + (float) Math.toRadians(xx), HandL2.rotateAngleY + (float) Math.toRadians(yy), HandL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.505 + (((tickAnim - 0) / 7) * (0.505-(0.505)));
            zz = -0.075 + (((tickAnim - 0) / 7) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.505 + (((tickAnim - 7) / 4) * (0-(0.505)));
            zz = -0.075 + (((tickAnim - 7) / 4) * (0-(-0.075)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0.67-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.67 + (((tickAnim - 15) / 3) * (0-(0.67)));
            zz = -0.2 + (((tickAnim - 15) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0.125-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0.125 + (((tickAnim - 19) / 9) * (0.505-(0.125)));
            zz = 0 + (((tickAnim - 19) / 9) * (-0.075-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL2.rotationPointX = this.HandL2.rotationPointX + (float)(xx);
        this.HandL2.rotationPointY = this.HandL2.rotationPointY - (float)(yy);
        this.HandL2.rotationPointZ = this.HandL2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5))*1), Neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-30))*-2), Neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+80))*2));

        if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.03-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.03 + (((tickAnim - 11) / 2) * (0-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.03)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2+50))*-0.03-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2+50))*-0.03 + (((tickAnim - 25) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2+50))*-0.03)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck4.rotationPointX = this.Neck4.rotationPointX + (float)(xx);
        this.Neck4.rotationPointY = this.Neck4.rotationPointY - (float)(yy);
        this.Neck4.rotationPointZ = this.Neck4.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-5.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-50))*-1), Neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*-1), Neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+50))*2));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(-6.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-50))*1.5), Neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-20))*1), Neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+20))*2));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-150))*1), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Brachytrachelopan, Brachytrachelopan.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5))*1), Brachytrachelopan.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*1.5), Brachytrachelopan.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-35))*2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.02-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.02 + (((tickAnim - 3) / 3) * (0-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.02)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.02-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.02 + (((tickAnim - 18) / 2) * (0-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.02)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Brachytrachelopan.rotationPointX = this.Brachytrachelopan.rotationPointX + (float)(xx);
        this.Brachytrachelopan.rotationPointY = this.Brachytrachelopan.rotationPointY - (float)(yy);
        this.Brachytrachelopan.rotationPointZ = this.Brachytrachelopan.rotationPointZ + (float)(zz);



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-120))*0.2), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*3.5));

        if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.05-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.05 + (((tickAnim - 11) / 2) * (0-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.05)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.05-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.05 + (((tickAnim - 25) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.05)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);



        this.setRotateAngle(Shoulders, Shoulders.rotateAngleX + (float) Math.toRadians(-0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-150))*2), Shoulders.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*-1), Shoulders.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+120))*3));

        if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.03-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.03 + (((tickAnim - 8) / 3) * (0-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.03)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.03-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.03 + (((tickAnim - 22) / 2) * (0-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.03)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Shoulders.rotationPointX = this.Shoulders.rotationPointX + (float)(xx);
        this.Shoulders.rotationPointY = this.Shoulders.rotationPointY - (float)(yy);
        this.Shoulders.rotationPointZ = this.Shoulders.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-90))*-0.5), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-20))*3), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+20))*1));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-75))*0.3), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+56))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+40))*2));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-50))*-1.2), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*-7), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*-3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-40))*0.3), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+20))*-6), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*-5));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-80))*0.8), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-20))*-8), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*-7));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-80))*1), Tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-40))*-10), Tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail7, Tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-80))*1.4), Tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-60))*-12), Tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail8, Tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-80))*1.9), Tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-80))*-14), Tail8.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBrachytrachelopan entity = (EntityPrehistoricFloraBrachytrachelopan) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Brachytrachelopan, Brachytrachelopan.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-30))*1), Brachytrachelopan.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+20))*3), Brachytrachelopan.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-20))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 0) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 0) / 6) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.8-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 6) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.8 + (((tickAnim - 6) / 5) * (0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.8)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 11) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = 0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 11) / 5) * (0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Brachytrachelopan.rotationPointX = this.Brachytrachelopan.rotationPointX + (float)(xx);
        this.Brachytrachelopan.rotationPointY = this.Brachytrachelopan.rotationPointY - (float)(yy);
        this.Brachytrachelopan.rotationPointZ = this.Brachytrachelopan.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13 + (((tickAnim - 0) / 3) * (16-(13)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 16 + (((tickAnim - 3) / 4) * (-8.20793-(16)));
            yy = 0 + (((tickAnim - 3) / 4) * (-1.6374-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.47837-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -8.20793 + (((tickAnim - 7) / 1) * (-13.23805-(-8.20793)));
            yy = -1.6374 + (((tickAnim - 7) / 1) * (0.23092-(-1.6374)));
            zz = -0.47837 + (((tickAnim - 7) / 1) * (0.0136-(-0.47837)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -13.23805 + (((tickAnim - 8) / 8) * (13-(-13.23805)));
            yy = 0.23092 + (((tickAnim - 8) / 8) * (0-(0.23092)));
            zz = 0.0136 + (((tickAnim - 8) / 8) * (0-(0.0136)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -10 + (((tickAnim - 0) / 9) * (16-(-10)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 16 + (((tickAnim - 9) / 5) * (-14.5-(16)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -14.5 + (((tickAnim - 14) / 2) * (-10-(-14.5)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 9) / 5) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL2.rotationPointX = this.LegL2.rotationPointX + (float)(xx);
        this.LegL2.rotationPointY = this.LegL2.rotationPointY - (float)(yy);
        this.LegL2.rotationPointZ = this.LegL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -2.5 + (((tickAnim - 0) / 9) * (6.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 6.5 + (((tickAnim - 9) / 3) * (-15.03-(6.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -15.03 + (((tickAnim - 12) / 2) * (-3-(-15.03)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -3 + (((tickAnim - 14) / 2) * (-2.5-(-3)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL2, KneeL2.rotateAngleX + (float) Math.toRadians(xx), KneeL2.rotateAngleY + (float) Math.toRadians(yy), KneeL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.5 + (((tickAnim - 3) / 1) * (0.025-(0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.5)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.025 + (((tickAnim - 4) / 5) * (-0.8-(0.025)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -0.8 + (((tickAnim - 9) / 3) * (2.555-(-0.8)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 2.555 + (((tickAnim - 12) / 2) * (0.475-(2.555)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 14) / 2) * (0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.5-(0.475)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeL2.rotationPointX = this.KneeL2.rotationPointX + (float)(xx);
        this.KneeL2.rotationPointY = this.KneeL2.rotationPointY - (float)(yy);
        this.KneeL2.rotationPointZ = this.KneeL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 13.25 + (((tickAnim - 0) / 4) * (5.86-(13.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 5.86 + (((tickAnim - 4) / 5) * (8.25-(5.86)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 8.25 + (((tickAnim - 9) / 3) * (36.79-(8.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 36.79 + (((tickAnim - 12) / 1) * (0.22-(36.79)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.22 + (((tickAnim - 13) / 1) * (19-(0.22)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 19 + (((tickAnim - 14) / 2) * (13.25-(19)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.025 + (((tickAnim - 0) / 4) * (0.685-(-0.025)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.685 + (((tickAnim - 4) / 5) * (2.205-(0.685)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 2.205 + (((tickAnim - 9) / 3) * (2.655-(2.205)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 2.655 + (((tickAnim - 12) / 1) * (-0.1-(2.655)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 13) / 1) * (-0.375-(-0.1)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 14) / 2) * (-0.025-(-0.375)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL2.rotationPointX = this.FootL2.rotationPointX + (float)(xx);
        this.FootL2.rotationPointY = this.FootL2.rotationPointY - (float)(yy);
        this.FootL2.rotationPointZ = this.FootL2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-10))*-2.3), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-30))*-5));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05-(0)));
            zz = 0.225 + (((tickAnim - 0) / 3) * (0.225-(0.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05 + (((tickAnim - 3) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05)));
            zz = 0.225 + (((tickAnim - 3) / 4) * (0.225-(0.225)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0.225 + (((tickAnim - 7) / 2) * (0.225-(0.225)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05-(0)));
            zz = 0.225 + (((tickAnim - 9) / 4) * (0.225-(0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05 + (((tickAnim - 13) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05)));
            zz = 0.225 + (((tickAnim - 13) / 3) * (0.225-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);



        this.setRotateAngle(Shoulders, Shoulders.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5+30))*3.5), Shoulders.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-20))*-2), Shoulders.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-50))*5));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07 + (((tickAnim - 3) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07 + (((tickAnim - 13) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Shoulders.rotationPointX = this.Shoulders.rotationPointX + (float)(xx);
        this.Shoulders.rotationPointY = this.Shoulders.rotationPointY - (float)(yy);
        this.Shoulders.rotationPointZ = this.Shoulders.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -16 + (((tickAnim - 0) / 7) * (14.25-(-16)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 14.25 + (((tickAnim - 7) / 2) * (-12.50085-(14.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.07165-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-5.00475-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -12.50085 + (((tickAnim - 9) / 3) * (-29.25-(-12.50085)));
            yy = 0.07165 + (((tickAnim - 9) / 3) * (0-(0.07165)));
            zz = -5.00475 + (((tickAnim - 9) / 3) * (0-(-5.00475)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -29.25 + (((tickAnim - 12) / 4) * (-16-(-29.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -1.995 + (((tickAnim - 0) / 7) * (-0.495-(-1.995)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -0.495 + (((tickAnim - 7) / 5) * (-1.225-(-0.495)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = -1.225 + (((tickAnim - 12) / 4) * (-1.995-(-1.225)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ArmL.rotationPointX = this.ArmL.rotationPointX + (float)(xx);
        this.ArmL.rotationPointY = this.ArmL.rotationPointY - (float)(yy);
        this.ArmL.rotationPointZ = this.ArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6.5 + (((tickAnim - 0) / 7) * (18.5-(6.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 18.5 + (((tickAnim - 7) / 2) * (-13.29399-(18.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.34834-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.8413-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -13.29399 + (((tickAnim - 9) / 3) * (9.5-(-13.29399)));
            yy = 0.34834 + (((tickAnim - 9) / 3) * (0-(0.34834)));
            zz = -0.8413 + (((tickAnim - 9) / 3) * (0-(-0.8413)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 9.5 + (((tickAnim - 12) / 4) * (6.5-(9.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 7) * (0-(0.8)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.025 + (((tickAnim - 12) / 1) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6-(-0.025)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6 + (((tickAnim - 13) / 3) * (0.8-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ElbowL.rotationPointX = this.ElbowL.rotationPointX + (float)(xx);
        this.ElbowL.rotationPointY = this.ElbowL.rotationPointY - (float)(yy);
        this.ElbowL.rotationPointZ = this.ElbowL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.93015 + (((tickAnim - 0) / 3) * (-4-(14.93015)));
            yy = 0.57407 + (((tickAnim - 0) / 3) * (0-(0.57407)));
            zz = -2.02885 + (((tickAnim - 0) / 3) * (0-(-2.02885)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -4 + (((tickAnim - 3) / 4) * (0-(-4)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (24.38-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 24.38 + (((tickAnim - 9) / 2) * (-7.03-(24.38)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -7.03 + (((tickAnim - 11) / 2) * (8.75-(-7.03)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 8.75 + (((tickAnim - 13) / 3) * (14.93015-(8.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.57407-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-2.02885-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 7) * (0-(0.225)));
            zz = -0.15 + (((tickAnim - 0) / 7) * (0-(-0.15)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.7-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.15-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 9) / 2) * (0.4-(0.7)));
            zz = -0.15 + (((tickAnim - 9) / 2) * (-0.06-(-0.15)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 11) / 1) * (0.125-(0.4)));
            zz = -0.06 + (((tickAnim - 11) / 1) * (0-(-0.06)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 12) / 4) * (0.225-(0.125)));
            zz = 0 + (((tickAnim - 12) / 4) * (-0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL.rotationPointX = this.HandL.rotationPointX + (float)(xx);
        this.HandL.rotationPointY = this.HandL.rotationPointY - (float)(yy);
        this.HandL.rotationPointZ = this.HandL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.5 + (((tickAnim - 0) / 3) * (-24.83922-(15.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.50923-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (4.75838-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -24.83922 + (((tickAnim - 3) / 2) * (-31.25-(-24.83922)));
            yy = -0.50923 + (((tickAnim - 3) / 2) * (0-(-0.50923)));
            zz = 4.75838 + (((tickAnim - 3) / 2) * (0-(4.75838)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = -31.25 + (((tickAnim - 5) / 11) * (15.5-(-31.25)));
            yy = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.775 + (((tickAnim - 0) / 5) * (-1.025-(-0.775)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            yy = -1.025 + (((tickAnim - 5) / 11) * (-0.775-(-1.025)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ArmL2.rotationPointX = this.ArmL2.rotationPointX + (float)(xx);
        this.ArmL2.rotationPointY = this.ArmL2.rotationPointY - (float)(yy);
        this.ArmL2.rotationPointZ = this.ArmL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.25 + (((tickAnim - 0) / 3) * (0.93431-(14.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.93711-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.21155-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.93431 + (((tickAnim - 3) / 2) * (21.5-(0.93431)));
            yy = -1.93711 + (((tickAnim - 3) / 2) * (0-(-1.93711)));
            zz = -3.21155 + (((tickAnim - 3) / 2) * (0-(-3.21155)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 21.5 + (((tickAnim - 5) / 11) * (14.25-(21.5)));
            yy = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.055 + (((tickAnim - 0) / 5) * (0.275-(0.055)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 5) / 3) * (0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6-(0.275)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6 + (((tickAnim - 8) / 1) * (0.15-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 9) / 7) * (0.055-(0.15)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ElbowL2.rotationPointX = this.ElbowL2.rotationPointX + (float)(xx);
        this.ElbowL2.rotationPointY = this.ElbowL2.rotationPointY - (float)(yy);
        this.ElbowL2.rotationPointZ = this.ElbowL2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(-8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-50))*1.5), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-30))*2.8));
        this.Neck4.rotationPointX = this.Neck4.rotationPointX + (float)(0);
        this.Neck4.rotationPointY = this.Neck4.rotationPointY - (float)(0.25);
        this.Neck4.rotationPointZ = this.Neck4.rotationPointZ + (float)(0);


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-7.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-70))*1), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-80))*2));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(-11.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5+100))*-1), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-120))*2));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(10.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5+30))*-2), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.57-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 3.57 + (((tickAnim - 3) / 3) * (-18.97-(3.57)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -18.97 + (((tickAnim - 6) / 2) * (-4-(-18.97)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -4 + (((tickAnim - 8) / 8) * (0-(-4)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (1.625-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.625 + (((tickAnim - 6) / 2) * (0-(1.625)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*-0.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*-0.5 + (((tickAnim - 10) / 3) * (0.025-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*-0.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.025 + (((tickAnim - 13) / 3) * (0-(0.025)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeL.rotationPointX = this.KneeL.rotationPointX + (float)(xx);
        this.KneeL.rotationPointY = this.KneeL.rotationPointY - (float)(yy);
        this.KneeL.rotationPointZ = this.KneeL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.5 + (((tickAnim - 0) / 3) * (3.59-(0.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.59 + (((tickAnim - 3) / 2) * (25.95-(3.59)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 25.95 + (((tickAnim - 5) / 2) * (3.9-(25.95)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 3.9 + (((tickAnim - 7) / 1) * (19-(3.9)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 19 + (((tickAnim - 8) / 4) * (6.37-(19)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 6.37 + (((tickAnim - 12) / 4) * (0.5-(6.37)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 3) * (0.995-(0.35)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.995 + (((tickAnim - 3) / 2) * (2.675-(0.995)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 2.675 + (((tickAnim - 5) / 3) * (0.5-(2.675)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 4) * (0.08-(0.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.08 + (((tickAnim - 12) / 4) * (0.35-(0.08)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
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
            xx = 3.67 + (((tickAnim - 0) / 3) * (48.33-(3.67)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 48.33 + (((tickAnim - 3) / 1) * (-4.75-(48.33)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -4.75 + (((tickAnim - 4) / 3) * (9.25-(-4.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 9.25 + (((tickAnim - 7) / 9) * (3.67-(9.25)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL2, HandL2.rotateAngleX + (float) Math.toRadians(xx), HandL2.rotateAngleY + (float) Math.toRadians(yy), HandL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.525-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.15 + (((tickAnim - 3) / 1) * (0-(1.15)));
            zz = -0.525 + (((tickAnim - 3) / 1) * (0-(-0.525)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 11) * (0-(0.25)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL2.rotationPointX = this.HandL2.rotationPointX + (float)(xx);
        this.HandL2.rotationPointY = this.HandL2.rotationPointY - (float)(yy);
        this.HandL2.rotationPointZ = this.HandL2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-20))*0.2), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-30))*5), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455))*3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-50))*0.4), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-60))*5), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+30))*3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-50))*0.7), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-120))*7), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-50))*-1), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-100))*9), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*5));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-70))*2), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-190))*11), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*5));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-90))*3), Tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-200))*14), Tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*8));


        this.setRotateAngle(Tail7, Tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-100))*5), Tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-220))*18), Tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*8));


        this.setRotateAngle(Tail8, Tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-120))*10), Tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-250))*25), Tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*8));


    }
        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBrachytrachelopan e = (EntityPrehistoricFloraBrachytrachelopan) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.Head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
