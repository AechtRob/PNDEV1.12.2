package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTianyulong;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTianyulong extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer ToesL;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer ToesR;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer CrestsL;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer CrestsR;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;

    private ModelAnimator animator;

    public ModelTianyulong() {
        this.textureWidth = 82;
        this.textureHeight = 82;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(1.0F, 8.8F, -2.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -1.3F, -0.7F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2793F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 19, -2.5F, -2.6638F, -0.2724F, 2, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, -1.3F, -0.7F);
        this.Hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.192F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -2.5F, -5.3638F, -0.2724F, 1, 6, 4, 0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 60, 8, -3.5F, -0.8638F, -0.2724F, 3, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.4F, -0.8F, 0.0F);
        this.Hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 13, -3.6F, -0.5F, -1.0F, 7, 6, 4, 0.001F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(1.5F, 0.5F, 0.4F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.3665F, 0.0F, 0.0F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 57, 61, -1.6F, -1.0F, -1.8F, 3, 6, 4, 0.0F, false));
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 0, 47, -0.6F, -0.9633F, 1.4995F, 1, 6, 2, 0.0F, false));
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 32, 0, -0.1F, -0.9633F, 1.4995F, 0, 6, 3, 0.0F, false));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.0F, 4.8F, -1.4F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 1.0036F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.0947F, 0.0052F);
        this.LowerLegL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 27, -0.09F, 3.0469F, 1.7717F, 0, 5, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 29, -1.1F, -0.2F, 0.2F, 2, 9, 2, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 29, -1.1F, -0.2F, -0.3F, 2, 9, 2, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 8.4F, 1.4F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -1.0647F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 34, 67, -1.1F, -0.1855F, -0.4633F, 2, 5, 1, -0.001F, false));
        this.FootL.cubeList.add(new ModelBox(FootL, 34, 67, -1.1F, -0.1855F, -0.8633F, 2, 5, 1, -0.003F, false));

        this.ToesL = new AdvancedModelRenderer(this);
        this.ToesL.setRotationPoint(-0.1F, 4.496F, 0.1616F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, -1.1345F, 0.0F, 0.0F);
        this.ToesL.cubeList.add(new ModelBox(ToesL, 13, 47, -1.5F, -0.5077F, -0.2868F, 3, 4, 1, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-2.5F, 0.5F, 0.4F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.3665F, 0.0F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 57, 61, -1.4F, -1.0F, -1.8F, 3, 6, 4, 0.0F, true));
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 0, 47, -0.4F, -0.9633F, 1.4995F, 1, 6, 2, 0.0F, true));
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 32, 0, 0.1F, -0.9633F, 1.4995F, 0, 6, 3, 0.0F, true));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(0.0F, 4.8F, -1.4F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 1.0036F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0947F, 0.0052F);
        this.LowerLegR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 27, 0.09F, 3.0469F, 1.7717F, 0, 5, 2, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 29, -0.9F, -0.2F, 0.2F, 2, 9, 2, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 29, -0.9F, -0.2F, -0.3F, 2, 9, 2, 0.0F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 8.4F, 1.4F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -1.0647F, 0.0F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, 34, 67, -0.9F, -0.1855F, -0.4633F, 2, 5, 1, -0.001F, true));
        this.FootR.cubeList.add(new ModelBox(FootR, 34, 67, -0.9F, -0.1855F, -0.8633F, 2, 5, 1, -0.003F, true));

        this.ToesR = new AdvancedModelRenderer(this);
        this.ToesR.setRotationPoint(0.1F, 4.496F, 0.1616F);
        this.FootR.addChild(ToesR);
        this.setRotateAngle(ToesR, -1.1345F, 0.0F, 0.0F);
        this.ToesR.cubeList.add(new ModelBox(ToesR, 13, 47, -1.5F, -0.5077F, -0.2868F, 3, 4, 1, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.7F, 3.0F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0524F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.7986F, 0.9477F);
        this.Tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.096F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 47, -1.5F, -2.7676F, -1.7176F, 2, 2, 9, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.7986F, 0.9477F);
        this.Tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3578F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 36, -0.49F, -6.5199F, -1.4203F, 0, 9, 9, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.7986F, 0.9477F);
        this.Tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 36, -0.5F, -8.5199F, -1.2203F, 0, 9, 9, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 41, -1.0F, -6.4199F, -1.2203F, 1, 6, 9, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.7986F, 0.9477F);
        this.Tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5585F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 36, -0.51F, -8.5199F, -1.2203F, 0, 9, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.7986F, 0.9477F);
        this.Tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 45, -0.5F, 3.1945F, -1.0955F, 0, 2, 9, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 0, -3.0F, -0.8F, -1.2F, 5, 4, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.2014F, 0.0477F);
        this.Tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0175F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 49, -1.0F, 0.1515F, -0.3537F, 1, 1, 9, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1014F, 8.5477F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0698F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, -0.947F, 3.7693F);
        this.Tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1531F, -0.0352F, -0.2242F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 26, 1.0F, -5.6988F, -3.4302F, 0, 6, 12, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.947F, 3.7693F);
        this.Tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1531F, 0.0352F, 0.2242F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 26, 0.0F, -5.7988F, -3.4302F, 0, 6, 12, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.947F, 2.9693F);
        this.Tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1571F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 26, 0.0F, -5.7988F, -3.4302F, 0, 6, 12, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.947F, -0.0307F);
        this.Tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0349F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 13, -0.5F, -2.3464F, -0.1307F, 1, 2, 12, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.947F, 2.9693F);
        this.Tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0175F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 3, -0.5F, 1.9988F, -3.2698F, 1, 1, 12, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 19, -2.0F, 0.3F, -3.2F, 4, 0, 12, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 15, -1.5F, -0.4F, -3.2F, 3, 2, 12, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 15, -1.5F, 0.2F, -3.2F, 3, 2, 12, -0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 2.053F, -0.0307F);
        this.Tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0698F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 32, 0.0F, -1.3484F, -0.2179F, 0, 3, 12, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.747F, 11.6693F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0175F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 24, 29, -1.0F, -0.6047F, -0.2027F, 1, 1, 13, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 24, 29, -1.0F, -0.0047F, -0.2027F, 1, 1, 13, -0.001F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 9, 0, -2.5F, -0.1047F, 0.2973F, 4, 0, 13, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.0F, -0.3047F, 0.3973F);
        this.Tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0619F, 0.0322F, 0.479F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 20, 1.5F, -5.0319F, 0.5303F, 0, 5, 13, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.3047F, 0.3973F);
        this.Tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0619F, -0.0322F, -0.479F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 20, -0.5F, -4.5319F, 0.5303F, 0, 5, 13, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.1047F, 0.0973F);
        this.Tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0698F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 20, -0.5F, -4.5319F, 0.5303F, 0, 5, 13, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.0953F, 0.3973F);
        this.Tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0524F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 30, -0.5F, -0.2006F, -0.0349F, 0, 2, 13, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.1047F, 12.7973F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1396F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 16, 0, -1.0F, -0.5F, -0.1F, 1, 1, 14, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -2.5F, 0.1F, -0.1F, 4, 0, 14, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5F, -1.495F, -0.0949F, 0, 3, 16, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.0F, 0.0F, -0.5F);
        this.Tail4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0486F, 0.0196F, 0.3835F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 17, 1.5F, -2.9154F, -0.0056F, 0, 2, 14, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.Tail4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0486F, -0.0196F, -0.3835F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 17, -0.5F, -2.5154F, -0.0056F, 0, 2, 14, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0524F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 17, -0.5F, -2.5154F, -0.0056F, 0, 2, 14, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.6F, -0.9F);
        this.Hips.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 39, 29, -4.0F, -2.1F, -4.8F, 7, 7, 5, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 58, 27, -2.5F, -3.3F, -4.8F, 4, 2, 5, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 58, -2.0F, -4.6F, -4.8F, 3, 4, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 0.2F, -2.1F);
        this.Body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -2.0F, -5.9F, -2.7F, 1, 4, 5, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.6986F, 4.8477F);
        this.Body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1396F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 36, -0.49F, -6.5199F, -8.4203F, 0, 9, 9, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 2.8F, -2.4F);
        this.Body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2094F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 43, 56, -2.0F, 1.5F, -2.7F, 4, 2, 5, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 1.4F, -4.6F);
        this.Body.addChild(Chest);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.7F, -4.2F);
        this.Chest.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.4363F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 65, 49, -1.5F, 0.8065F, 0.8743F, 3, 2, 4, -0.001F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -1.0F, -3.3F);
        this.Chest.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.4363F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 51, 0, -4.0F, -0.1935F, -0.1257F, 6, 3, 5, -0.001F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.5F, -2.1F, -4.9F);
        this.Chest.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.7156F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 57, 50, -2.5F, -0.5F, -0.1F, 1, 5, 6, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, -1.3F, -4.2F);
        this.Chest.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.8029F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 27, 56, -2.5F, -0.5F, -0.1F, 2, 5, 6, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, -0.8F, -3.6F);
        this.Chest.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.6981F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 62, -2.5F, -0.8266F, 0.0642F, 3, 2, 5, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.0F, 0.0F, -2.5F);
        this.Chest.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.6109F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 54, 41, -4.5F, -1.5F, -0.1F, 6, 4, 4, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(0.2F, 2.0F, -2.5F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.9948F, 0.0F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 68, 0, 1.0F, -0.7056F, -0.6765F, 1, 1, 3, 0.0F, false));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(0.0F, -0.6F, 2.2F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.9774F, 0.0F, 0.0F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 67, 61, 1.0F, -0.1562F, -0.0241F, 1, 1, 3, -0.001F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 0.1438F, 2.8759F);
        this.LowerArmL.addChild(HandL);
        this.HandL.cubeList.add(new ModelBox(HandL, 6, 19, 1.0F, -0.3F, 0.0F, 1, 1, 2, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-1.2F, 2.0F, -2.5F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.9948F, 0.0F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 68, 0, -2.0F, -0.7056F, -0.6765F, 1, 1, 3, 0.0F, true));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(0.0F, -0.6F, 2.2F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -0.9774F, 0.0F, 0.0F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 67, 61, -2.0F, -0.1562F, -0.0241F, 1, 1, 3, -0.001F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.0F, 0.1438F, 2.8759F);
        this.LowerArmR.addChild(HandR);
        this.HandR.cubeList.add(new ModelBox(HandR, 6, 19, -2.0F, -0.3F, 0.0F, 1, 1, 2, 0.0F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.4F, -2.9F);
        this.Chest.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 67, -2.5F, -1.4F, -2.3F, 4, 3, 3, 0.0F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 38, 15, -1.5F, 1.6F, -2.3F, 2, 2, 3, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(-1.0F, -0.1F, -1.3F);
        this.Neck.addChild(Neck2);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.0F, -1.7F, -1.1F);
        this.Neck2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.576F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 9, -1.0F, -1.4F, -1.8F, 1, 2, 4, -0.001F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.0F, 0.8F, -2.6F);
        this.Neck2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.576F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 38, 20, -1.0F, -0.4F, -1.8F, 1, 1, 4, -0.001F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.0F, -0.8F, -1.7F);
        this.Neck2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.576F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 63, 34, -2.0F, -1.4F, -1.8F, 3, 3, 4, -0.001F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -2.3F, -2.7F);
        this.Neck2.addChild(Neck1);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -1.8F, -2.2F);
        this.Neck1.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0175F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 7, 0, 0.0F, 0.2F, -0.6F, 1, 1, 2, -0.002F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -1.8F, -1.1F);
        this.Neck1.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0175F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 7, 0, 0.0F, 0.2F, -0.6F, 1, 1, 2, -0.002F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.0F, 0.0F, -1.1F);
        this.Neck1.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1222F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 42, 45, -2.0F, -0.8F, -0.6F, 3, 3, 2, -0.002F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.5F, -1.8F);
        this.Neck1.addChild(Head);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.0F, -2.1F);
        this.Head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2269F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 6, 11, -0.5F, -0.4F, -0.4F, 2, 1, 1, 0.005F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.4F, -2.7F);
        this.Head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.8203F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 20, 19, 0.0F, -0.0368F, -0.9676F, 1, 1, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.0F, 0.5F, -2.7F);
        this.Head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.798F, 0.2155F, -0.2056F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 28, 19, -1.6F, -0.3368F, -0.5676F, 1, 1, 1, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, 1.1F, -3.0F);
        this.Head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.7977F, -0.1053F, -0.5284F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 19, -0.0101F, -0.0798F, -0.9242F, 1, 1, 1, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.0F, 1.9F, -4.4F);
        this.Head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2674F, -0.2022F, -0.055F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 11, 59, -1.0F, -0.0568F, 0.305F, 1, 1, 2, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 2, -0.8F, 0.2432F, 0.305F, 0, 1, 2, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.5F, 1.1F, -3.0F);
        this.Head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.7977F, 0.1053F, 0.5284F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 19, -0.9899F, -0.0798F, -0.9242F, 1, 1, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(1.0F, 0.5F, -2.7F);
        this.Head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2744F, 0.2155F, -0.2056F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 0, -1.6F, -0.5368F, 0.2324F, 1, 1, 1, -0.001F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.5F, -2.7F);
        this.Head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.2744F, -0.2155F, 0.2056F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 0, 0.6F, -0.5368F, 0.2324F, 1, 1, 1, -0.001F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.5F, -2.7F);
        this.Head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.798F, -0.2155F, 0.2056F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 28, 19, 0.6F, -0.3368F, -0.5676F, 1, 1, 1, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 2.5F, -5.2F);
        this.Head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 1.2392F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 21, 0.0F, -0.0022F, -0.9965F, 1, 1, 1, -0.001F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 1.9F, -4.4F);
        this.Head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.6981F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 20, 21, 0.0F, -0.0568F, -0.995F, 1, 1, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 1.9F, -4.4F);
        this.Head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.6458F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 17, 59, 0.0F, -0.0568F, 0.005F, 1, 1, 2, 0.001F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(1.0F, 1.9F, -4.4F);
        this.Head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.3546F, -0.2022F, -0.055F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 11, -0.8F, 0.7432F, -0.895F, 0, 1, 1, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 2.5F, -3.8F);
        this.Head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.4932F, -0.1473F, -0.0521F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 0, -0.03F, 0.2084F, -0.018F, 0, 1, 2, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 7, 0, -0.02F, 0.2084F, 1.782F, 0, 1, 1, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 1, -0.05F, 0.2084F, -0.018F, 0, 1, 2, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 10, 2, -0.06F, 0.2084F, 1.782F, 0, 1, 1, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 1.9F, -4.4F);
        this.Head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.3546F, 0.2022F, 0.055F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 11, 0.8F, 0.7432F, -0.895F, 0, 1, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 1.9F, -4.4F);
        this.Head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.2674F, 0.2022F, 0.055F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 2, 0.8F, 0.2432F, 0.305F, 0, 1, 2, 0.0F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 11, 59, 0.0F, -0.0568F, 0.305F, 1, 1, 2, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(1.0F, 2.5F, -3.8F);
        this.Head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.4932F, 0.1473F, 0.0521F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 7, 0, 0.02F, 0.2084F, 1.782F, 0, 1, 1, 0.0F, false));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 0, 0.03F, 0.2084F, -0.018F, 0, 1, 2, 0.0F, false));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 10, 2, 0.06F, 0.2084F, 1.782F, 0, 1, 1, 0.0F, false));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 1, 0.05F, 0.2084F, -0.018F, 0, 1, 2, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 0.7F, -1.3F);
        this.Head.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.2618F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 23, 59, 0.0F, 0.3F, -3.3F, 1, 1, 2, -0.001F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 37, 56, -0.5F, -0.7F, -1.3F, 2, 2, 3, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5F, 0.5F, -1.3F);
        this.Head.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.4538F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 13, 52, -0.5F, -0.7F, -1.3F, 1, 1, 3, 0.0F, false));

        this.CrestsL = new AdvancedModelRenderer(this);
        this.CrestsL.setRotationPoint(0.8F, 0.8F, -0.2F);
        this.Head.addChild(CrestsL);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.CrestsL.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 1.1834F, -0.5646F, -1.054F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 43, 63, -0.1F, -1.7388F, -0.1644F, 5, 4, 2, -0.002F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.2F, 0.8F, -0.9F);
        this.CrestsL.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.5452F, -0.5407F, -0.7437F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 43, 63, -0.1F, -1.7388F, -0.1644F, 5, 4, 2, -0.002F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.2F, 0.8F, -0.9F);
        this.CrestsL.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.1104F, -0.7083F, 0.3356F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 43, 63, -0.1F, -1.7388F, -0.1644F, 5, 4, 2, -0.002F, false));

        this.CrestsR = new AdvancedModelRenderer(this);
        this.CrestsR.setRotationPoint(0.2F, 0.8F, -0.2F);
        this.Head.addChild(CrestsR);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.CrestsR.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 1.1834F, 0.5646F, 1.054F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 43, 63, -4.9F, -1.7388F, -0.1644F, 5, 4, 2, -0.002F, true));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.2F, 0.8F, -0.9F);
        this.CrestsR.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.5452F, 0.5407F, 0.7437F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 43, 63, -4.9F, -1.7388F, -0.1644F, 5, 4, 2, -0.002F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.2F, 0.8F, -0.9F);
        this.CrestsR.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.1104F, 0.7083F, -0.3356F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 43, 63, -4.9F, -1.7388F, -0.1644F, 5, 4, 2, -0.002F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.6F, 0.7F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0087F, 0.0F, 0.0F);


        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 1.7F, -4.7F);
        this.Jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0349F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 7, 3, 0.0F, -0.05F, -1.3202F, 1, 1, 1, -0.002F, false));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 10, 0.0F, -0.05F, -0.7202F, 1, 1, 1, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-1.0F, 1.7F, -4.7F);
        this.Jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.2684F, -0.219F, -0.0597F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 7, 1.1744F, -0.2256F, -0.1451F, 0, 1, 2, 0.0F, true));
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 24, 38, 0.9744F, -0.0256F, -0.1451F, 1, 1, 2, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-1.0F, 1.7F, -4.7F);
        this.Jaw.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.4429F, -0.219F, -0.0597F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 11, 0, 1.1744F, -0.9647F, -1.0417F, 0, 1, 1, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-1.0F, 1.7F, -4.7F);
        this.Jaw.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.2643F, -0.1348F, -0.0364F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 6, 6, 1.0103F, -1.0256F, 0.4407F, 0, 1, 3, 0.0F, true));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 6, 7, 0.9903F, -1.0256F, 0.4407F, 0, 1, 3, 0.0F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(1.0F, 1.7F, -4.7F);
        this.Jaw.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.4429F, 0.219F, 0.0597F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 11, 0, -0.2F, -0.9256F, -0.8202F, 0, 1, 1, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(1.0F, 1.7F, -4.7F);
        this.Jaw.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.2684F, 0.219F, 0.0597F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 0, 7, -0.2F, -0.2256F, 0.0798F, 0, 1, 2, 0.0F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 24, 38, -1.0F, -0.0256F, 0.0798F, 1, 1, 2, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(1.0F, 1.7F, -4.7F);
        this.Jaw.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.2643F, 0.1348F, 0.0364F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 6, 6, -0.02F, -1.0256F, 0.5798F, 0, 1, 3, 0.0F, false));
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 6, 7, 0.0F, -1.0256F, 0.5798F, 0, 1, 3, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.2618F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 44, 20, 0.0F, 0.4F, -5.0F, 1, 1, 2, 0.001F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 64, 23, -0.5F, 0.4F, -3.0F, 2, 1, 3, 0.001F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 32, 0, -0.5F, -1.1F, -2.0F, 2, 1, 2, -0.001F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 24, 67, -0.5F, -0.1F, -3.0F, 2, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
    
    public void renderStaticWall(float f) {
        this.setRotateAngle(UpperLegR, -0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, -0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, -1.4473F, -0.1236F, 0.2274F);
        this.setRotateAngle(UpperArmL, -1.4473F, 0.1236F, -0.2274F);
        this.setRotateAngle(ToesR, -1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(ToesL, -1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmR, -0.9885F, -0.1213F, 0.1818F);
        this.setRotateAngle(LowerArmL, -0.9885F, 0.1213F, -0.1818F);
        this.setRotateAngle(Jaw, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, -1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r72, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r71, 0.2643F, 0.1348F, 0.0364F);
        this.setRotateAngle(cube_r70, 0.2684F, 0.219F, 0.0597F);
        this.setRotateAngle(cube_r7, 0.3578F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r69, 0.4429F, 0.219F, 0.0597F);
        this.setRotateAngle(cube_r68, 0.2643F, -0.1348F, -0.0364F);
        this.setRotateAngle(cube_r67, 0.4429F, -0.219F, -0.0597F);
        this.setRotateAngle(cube_r66, 0.2684F, -0.219F, -0.0597F);
        this.setRotateAngle(cube_r65, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r64, -0.1104F, 0.7083F, -0.3356F);
        this.setRotateAngle(cube_r63, 0.5452F, 0.5407F, 0.7437F);
        this.setRotateAngle(cube_r62, 1.1834F, 0.5646F, 1.054F);
        this.setRotateAngle(cube_r61, -0.1104F, -0.7083F, 0.3356F);
        this.setRotateAngle(cube_r60, 0.5452F, -0.5407F, -0.7437F);
        this.setRotateAngle(cube_r6, -0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r59, 1.1834F, -0.5646F, -1.054F);
        this.setRotateAngle(cube_r58, 0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r57, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r56, 0.4932F, 0.1473F, 0.0521F);
        this.setRotateAngle(cube_r55, 0.2674F, 0.2022F, 0.055F);
        this.setRotateAngle(cube_r54, 0.3546F, 0.2022F, 0.055F);
        this.setRotateAngle(cube_r53, 0.4932F, -0.1473F, -0.0521F);
        this.setRotateAngle(cube_r52, 0.3546F, -0.2022F, -0.055F);
        this.setRotateAngle(cube_r51, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r50, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r49, 1.2392F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r48, 0.798F, -0.2155F, 0.2056F);
        this.setRotateAngle(cube_r47, 0.2744F, -0.2155F, 0.2056F);
        this.setRotateAngle(cube_r46, 0.2744F, 0.2155F, -0.2056F);
        this.setRotateAngle(cube_r45, 0.7977F, 0.1053F, 0.5284F);
        this.setRotateAngle(cube_r44, 0.2674F, -0.2022F, -0.055F);
        this.setRotateAngle(cube_r43, 0.7977F, -0.1053F, -0.5284F);
        this.setRotateAngle(cube_r42, 0.798F, 0.2155F, -0.2056F);
        this.setRotateAngle(cube_r41, 0.8203F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r33, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.8029F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.7156F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.0486F, -0.0196F, -0.3835F);
        this.setRotateAngle(cube_r22, -0.0486F, 0.0196F, 0.3835F);
        this.setRotateAngle(cube_r21, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.0619F, -0.0322F, -0.479F);
        this.setRotateAngle(cube_r18, -0.0619F, 0.0322F, 0.479F);
        this.setRotateAngle(cube_r17, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.1531F, 0.0352F, 0.2242F);
        this.setRotateAngle(cube_r12, -0.1531F, -0.0352F, -0.2242F);
        this.setRotateAngle(cube_r11, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(CrestsR, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(CrestsL, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(Chest, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);
        this.Neck.offsetY = -0.01F;
        this.Neck.offsetZ = -0.075F;
        this.Neck.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(UpperLegR, -0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, -0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, -1.4473F, -0.1236F, 0.2274F);
        this.setRotateAngle(UpperArmL, -1.4473F, 0.1236F, -0.2274F);
        this.setRotateAngle(ToesR, -1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(ToesL, -1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmR, -0.9885F, -0.1213F, 0.1818F);
        this.setRotateAngle(LowerArmL, -0.9885F, 0.1213F, -0.1818F);
        this.setRotateAngle(Jaw, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, -1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r72, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r71, 0.2643F, 0.1348F, 0.0364F);
        this.setRotateAngle(cube_r70, 0.2684F, 0.219F, 0.0597F);
        this.setRotateAngle(cube_r7, 0.3578F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r69, 0.4429F, 0.219F, 0.0597F);
        this.setRotateAngle(cube_r68, 0.2643F, -0.1348F, -0.0364F);
        this.setRotateAngle(cube_r67, 0.4429F, -0.219F, -0.0597F);
        this.setRotateAngle(cube_r66, 0.2684F, -0.219F, -0.0597F);
        this.setRotateAngle(cube_r65, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r64, -0.1104F, 0.7083F, -0.3356F);
        this.setRotateAngle(cube_r63, 0.5452F, 0.5407F, 0.7437F);
        this.setRotateAngle(cube_r62, 1.1834F, 0.5646F, 1.054F);
        this.setRotateAngle(cube_r61, -0.1104F, -0.7083F, 0.3356F);
        this.setRotateAngle(cube_r60, 0.5452F, -0.5407F, -0.7437F);
        this.setRotateAngle(cube_r6, -0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r59, 1.1834F, -0.5646F, -1.054F);
        this.setRotateAngle(cube_r58, 0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r57, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r56, 0.4932F, 0.1473F, 0.0521F);
        this.setRotateAngle(cube_r55, 0.2674F, 0.2022F, 0.055F);
        this.setRotateAngle(cube_r54, 0.3546F, 0.2022F, 0.055F);
        this.setRotateAngle(cube_r53, 0.4932F, -0.1473F, -0.0521F);
        this.setRotateAngle(cube_r52, 0.3546F, -0.2022F, -0.055F);
        this.setRotateAngle(cube_r51, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r50, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r49, 1.2392F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r48, 0.798F, -0.2155F, 0.2056F);
        this.setRotateAngle(cube_r47, 0.2744F, -0.2155F, 0.2056F);
        this.setRotateAngle(cube_r46, 0.2744F, 0.2155F, -0.2056F);
        this.setRotateAngle(cube_r45, 0.7977F, 0.1053F, 0.5284F);
        this.setRotateAngle(cube_r44, 0.2674F, -0.2022F, -0.055F);
        this.setRotateAngle(cube_r43, 0.7977F, -0.1053F, -0.5284F);
        this.setRotateAngle(cube_r42, 0.798F, 0.2155F, -0.2056F);
        this.setRotateAngle(cube_r41, 0.8203F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r33, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.8029F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.7156F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.0486F, -0.0196F, -0.3835F);
        this.setRotateAngle(cube_r22, -0.0486F, 0.0196F, 0.3835F);
        this.setRotateAngle(cube_r21, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.0619F, -0.0322F, -0.479F);
        this.setRotateAngle(cube_r18, -0.0619F, 0.0322F, 0.479F);
        this.setRotateAngle(cube_r17, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.1531F, 0.0352F, 0.2242F);
        this.setRotateAngle(cube_r12, -0.1531F, -0.0352F, -0.2242F);
        this.setRotateAngle(cube_r11, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(CrestsR, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(CrestsL, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(Chest, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);
        this.Hips.offsetY = -0.013F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -0.2F;
        this.Hips.offsetX = 0.4F;
        this.Hips.rotateAngleY = (float)Math.toRadians(240);
        this.Hips.rotateAngleX = (float)Math.toRadians(-0);
        this.Hips.rotateAngleZ = (float)Math.toRadians(-0);
        this.Hips.scaleChildren = true;
        float scaler = 1.0F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(UpperLegR, -0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, -0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, -1.4473F, -0.1236F, 0.2274F);
        this.setRotateAngle(UpperArmL, -1.4473F, 0.1236F, -0.2274F);
        this.setRotateAngle(ToesR, -1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(ToesL, -1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmR, -0.9885F, -0.1213F, 0.1818F);
        this.setRotateAngle(LowerArmL, -0.9885F, 0.1213F, -0.1818F);
        this.setRotateAngle(Jaw, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, -1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r72, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r71, 0.2643F, 0.1348F, 0.0364F);
        this.setRotateAngle(cube_r70, 0.2684F, 0.219F, 0.0597F);
        this.setRotateAngle(cube_r7, 0.3578F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r69, 0.4429F, 0.219F, 0.0597F);
        this.setRotateAngle(cube_r68, 0.2643F, -0.1348F, -0.0364F);
        this.setRotateAngle(cube_r67, 0.4429F, -0.219F, -0.0597F);
        this.setRotateAngle(cube_r66, 0.2684F, -0.219F, -0.0597F);
        this.setRotateAngle(cube_r65, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r64, -0.1104F, 0.7083F, -0.3356F);
        this.setRotateAngle(cube_r63, 0.5452F, 0.5407F, 0.7437F);
        this.setRotateAngle(cube_r62, 1.1834F, 0.5646F, 1.054F);
        this.setRotateAngle(cube_r61, -0.1104F, -0.7083F, 0.3356F);
        this.setRotateAngle(cube_r60, 0.5452F, -0.5407F, -0.7437F);
        this.setRotateAngle(cube_r6, -0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r59, 1.1834F, -0.5646F, -1.054F);
        this.setRotateAngle(cube_r58, 0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r57, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r56, 0.4932F, 0.1473F, 0.0521F);
        this.setRotateAngle(cube_r55, 0.2674F, 0.2022F, 0.055F);
        this.setRotateAngle(cube_r54, 0.3546F, 0.2022F, 0.055F);
        this.setRotateAngle(cube_r53, 0.4932F, -0.1473F, -0.0521F);
        this.setRotateAngle(cube_r52, 0.3546F, -0.2022F, -0.055F);
        this.setRotateAngle(cube_r51, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r50, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r49, 1.2392F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r48, 0.798F, -0.2155F, 0.2056F);
        this.setRotateAngle(cube_r47, 0.2744F, -0.2155F, 0.2056F);
        this.setRotateAngle(cube_r46, 0.2744F, 0.2155F, -0.2056F);
        this.setRotateAngle(cube_r45, 0.7977F, 0.1053F, 0.5284F);
        this.setRotateAngle(cube_r44, 0.2674F, -0.2022F, -0.055F);
        this.setRotateAngle(cube_r43, 0.7977F, -0.1053F, -0.5284F);
        this.setRotateAngle(cube_r42, 0.798F, 0.2155F, -0.2056F);
        this.setRotateAngle(cube_r41, 0.8203F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r33, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.8029F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.7156F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.0486F, -0.0196F, -0.3835F);
        this.setRotateAngle(cube_r22, -0.0486F, 0.0196F, 0.3835F);
        this.setRotateAngle(cube_r21, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.0619F, -0.0322F, -0.479F);
        this.setRotateAngle(cube_r18, -0.0619F, 0.0322F, 0.479F);
        this.setRotateAngle(cube_r17, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.1531F, 0.0352F, 0.2242F);
        this.setRotateAngle(cube_r12, -0.1531F, -0.0352F, -0.2242F);
        this.setRotateAngle(cube_r11, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(CrestsR, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(CrestsL, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(Chest, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
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

        EntityPrehistoricFloraTianyulong entityTianyulong = (EntityPrehistoricFloraTianyulong) e;

        this.faceTarget(f3, f4, 11, Neck);
        this.faceTarget(f3, f4, 11, Neck2);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Chest, this.Neck, this.Neck2, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityTianyulong.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityTianyulong.getAnimation() == entityTianyulong.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityTianyulong.isReallyInWater()) {

                if (f3 == 0.0F || !entityTianyulong.getIsMoving()) {
                    if (entityTianyulong.getAnimation() != entityTianyulong.EAT_ANIMATION
                            && entityTianyulong.getAnimation() != entityTianyulong.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.11F, 0.1F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.25F, 0.06F, f2, 1F);


                    return;
                }

                if (entityTianyulong.getIsFast()) { //Running


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
        EntityPrehistoricFloraTianyulong ee = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.CHATTER_ANIMATION) {
            animChatter(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DISPLAY_ANIMATION) {
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTianyulong entity = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 10) / 30) * (5-(5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 40) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 10) / 30) * (-5-(-5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 40) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = -5 + (((tickAnim - 10) / 31) * (-5-(-5)));
            yy = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 31) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 41) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -7.5 + (((tickAnim - 10) / 12) * (-0.32262-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 12) * (4.99164-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (-0.28942-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = -0.32262 + (((tickAnim - 22) / 13) * (-5.16-(-0.32262)));
            yy = 4.99164 + (((tickAnim - 22) / 13) * (0-(4.99164)));
            zz = -0.28942 + (((tickAnim - 22) / 13) * (0-(-0.28942)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.16 + (((tickAnim - 35) / 5) * (-3.46439-(-5.16)));
            yy = 0 + (((tickAnim - 35) / 5) * (-4.96837-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0.56222-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.46439 + (((tickAnim - 40) / 10) * (0-(-3.46439)));
            yy = -4.96837 + (((tickAnim - 40) / 10) * (0-(-4.96837)));
            zz = 0.56222 + (((tickAnim - 40) / 10) * (0-(0.56222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 10) / 5) * (-3.14949-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (4.99945-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.07412-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -3.14949 + (((tickAnim - 15) / 4) * (0.47-(-3.14949)));
            yy = 4.99945 + (((tickAnim - 15) / 4) * (0-(4.99945)));
            zz = 0.07412 + (((tickAnim - 15) / 4) * (0-(0.07412)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0.47 + (((tickAnim - 19) / 5) * (-6.0998-(0.47)));
            yy = 0 + (((tickAnim - 19) / 5) * (-4.99666-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0.18297-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -6.0998 + (((tickAnim - 24) / 4) * (-11.56-(-6.0998)));
            yy = -4.99666 + (((tickAnim - 24) / 4) * (0-(-4.99666)));
            zz = 0.18297 + (((tickAnim - 24) / 4) * (0-(0.18297)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -11.56 + (((tickAnim - 28) / 8) * (-0.06-(-11.56)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = -0.06 + (((tickAnim - 36) / 5) * (-5.00475-(-0.06)));
            yy = 0 + (((tickAnim - 36) / 5) * (7.48198-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0.52107-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -5.00475 + (((tickAnim - 41) / 9) * (0-(-5.00475)));
            yy = 7.48198 + (((tickAnim - 41) / 9) * (0-(7.48198)));
            zz = 0.52107 + (((tickAnim - 41) / 9) * (0-(0.52107)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 7.5 + (((tickAnim - 10) / 6) * (0.1561-(7.5)));
            yy = 0 + (((tickAnim - 10) / 6) * (2.49949-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0.05042-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0.1561 + (((tickAnim - 16) / 6) * (-7.19-(0.1561)));
            yy = 2.49949 + (((tickAnim - 16) / 6) * (0-(2.49949)));
            zz = 0.05042 + (((tickAnim - 16) / 6) * (0-(0.05042)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -7.19 + (((tickAnim - 22) / 4) * (1.82632-(-7.19)));
            yy = 0 + (((tickAnim - 22) / 4) * (-2.49696-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (-0.12323-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 1.82632 + (((tickAnim - 26) / 5) * (12.64-(1.82632)));
            yy = -2.49696 + (((tickAnim - 26) / 5) * (0-(-2.49696)));
            zz = -0.12323 + (((tickAnim - 26) / 5) * (0-(-0.12323)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 12.64 + (((tickAnim - 31) / 7) * (15.19-(12.64)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 15.19 + (((tickAnim - 38) / 6) * (15.09-(15.19)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 15.09 + (((tickAnim - 44) / 6) * (0-(15.09)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 20 + (((tickAnim - 13) / 6) * (11.79394-(20)));
            yy = 0 + (((tickAnim - 13) / 6) * (9.97853-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0.65834-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 11.79394 + (((tickAnim - 19) / 8) * (2.44-(11.79394)));
            yy = 9.97853 + (((tickAnim - 19) / 8) * (0-(9.97853)));
            zz = 0.65834 + (((tickAnim - 19) / 8) * (0-(0.65834)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 2.44 + (((tickAnim - 27) / 5) * (-0.8831-(2.44)));
            yy = 0 + (((tickAnim - 27) / 5) * (-14.82805-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (2.29052-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -0.8831 + (((tickAnim - 32) / 5) * (-3.61-(-0.8831)));
            yy = -14.82805 + (((tickAnim - 32) / 5) * (0-(-14.82805)));
            zz = 2.29052 + (((tickAnim - 32) / 5) * (0-(2.29052)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -3.61 + (((tickAnim - 37) / 7) * (18.42-(-3.61)));
            yy = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 18.42 + (((tickAnim - 44) / 6) * (0-(18.42)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -10 + (((tickAnim - 12) / 5) * (2.5-(-10)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 2.5 + (((tickAnim - 17) / 9) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 26) / 14) * (-10-(2.5)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 40) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -10 + (((tickAnim - 10) / 7) * (-10-(-10)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 17) / 9) * (-10-(-10)));
            yy = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 26) / 14) * (-10-(-10)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 40) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -32.5 + (((tickAnim - 10) / 30) * (-32.5-(-32.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -32.5 + (((tickAnim - 40) / 10) * (0-(-32.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 38) {
            xx = 27.5 + (((tickAnim - 8) / 30) * (25.59-(27.5)));
            yy = 0 + (((tickAnim - 8) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 30) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 25.59 + (((tickAnim - 38) / 12) * (0-(25.59)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 42) {
            xx = -32.5 + (((tickAnim - 8) / 34) * (-32.5-(-32.5)));
            yy = 0 + (((tickAnim - 8) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 34) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -32.5 + (((tickAnim - 42) / 8) * (0-(-32.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 39) {
            xx = 27.5 + (((tickAnim - 6) / 33) * (25.59-(27.5)));
            yy = 0 + (((tickAnim - 6) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 33) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 25.59 + (((tickAnim - 39) / 11) * (0-(25.59)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 17.5 + (((tickAnim - 10) / 7) * (12.5-(17.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 12.5 + (((tickAnim - 17) / 9) * (17.5-(12.5)));
            yy = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 26) / 4) * (20-(17.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 30) / 10) * (22.5-(20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 40) / 10) * (0-(22.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (6.20592-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-14.99635-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.33489-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.20592 + (((tickAnim - 4) / 4) * (6.20592-(6.20592)));
            yy = -14.99635 + (((tickAnim - 4) / 4) * (-14.99635-(-14.99635)));
            zz = 0.33489 + (((tickAnim - 4) / 4) * (0.33489-(0.33489)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 6.20592 + (((tickAnim - 8) / 4) * (12.5-(6.20592)));
            yy = -14.99635 + (((tickAnim - 8) / 4) * (0-(-14.99635)));
            zz = 0.33489 + (((tickAnim - 8) / 4) * (0-(0.33489)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 12.5 + (((tickAnim - 12) / 5) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 12.5 + (((tickAnim - 17) / 4) * (-10-(12.5)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 21) / 5) * (12.5-(-10)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 26) / 14) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 40) / 10) * (0-(12.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-18.11002-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-22.29712-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (3.0947-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -18.11002 + (((tickAnim - 4) / 4) * (-18.11002-(-18.11002)));
            yy = -22.29712 + (((tickAnim - 4) / 4) * (-22.29712-(-22.29712)));
            zz = 3.0947 + (((tickAnim - 4) / 4) * (3.0947-(3.0947)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -18.11002 + (((tickAnim - 8) / 4) * (-35-(-18.11002)));
            yy = -22.29712 + (((tickAnim - 8) / 4) * (0-(-22.29712)));
            zz = 3.0947 + (((tickAnim - 8) / 4) * (0-(3.0947)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -35 + (((tickAnim - 12) / 5) * (-35-(-35)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -35 + (((tickAnim - 17) / 4) * (-27.5438-(-35)));
            yy = 0 + (((tickAnim - 17) / 4) * (-1.0067-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (-0.41966-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -27.5438 + (((tickAnim - 21) / 5) * (-35-(-27.5438)));
            yy = -1.0067 + (((tickAnim - 21) / 5) * (0-(-1.0067)));
            zz = -0.41966 + (((tickAnim - 21) / 5) * (0-(-0.41966)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -35 + (((tickAnim - 26) / 4) * (-37.99939-(-35)));
            yy = 0 + (((tickAnim - 26) / 4) * (15.78002-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (-7.40097-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -37.99939 + (((tickAnim - 30) / 3) * (-37.99939-(-37.99939)));
            yy = 15.78002 + (((tickAnim - 30) / 3) * (15.78002-(15.78002)));
            zz = -7.40097 + (((tickAnim - 30) / 3) * (-7.40097-(-7.40097)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -37.99939 + (((tickAnim - 33) / 7) * (-35-(-37.99939)));
            yy = 15.78002 + (((tickAnim - 33) / 7) * (0-(15.78002)));
            zz = -7.40097 + (((tickAnim - 33) / 7) * (0-(-7.40097)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -35 + (((tickAnim - 40) / 10) * (0-(-35)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-3.40473-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-14.76689-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.664-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -3.40473 + (((tickAnim - 4) / 4) * (-3.40473-(-3.40473)));
            yy = -14.76689 + (((tickAnim - 4) / 4) * (-14.76689-(-14.76689)));
            zz = -2.664 + (((tickAnim - 4) / 4) * (-2.664-(-2.664)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -3.40473 + (((tickAnim - 8) / 4) * (-7.5-(-3.40473)));
            yy = -14.76689 + (((tickAnim - 8) / 4) * (0-(-14.76689)));
            zz = -2.664 + (((tickAnim - 8) / 4) * (0-(-2.664)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -7.5 + (((tickAnim - 12) / 5) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -7.5 + (((tickAnim - 17) / 4) * (10-(-7.5)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 10 + (((tickAnim - 21) / 5) * (-7.5-(10)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -7.5 + (((tickAnim - 26) / 5) * (-11.98386-(-7.5)));
            yy = 0 + (((tickAnim - 26) / 5) * (20.54726-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (-1.17372-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -11.98386 + (((tickAnim - 31) / 3) * (-11.98386-(-11.98386)));
            yy = 20.54726 + (((tickAnim - 31) / 3) * (20.54726-(20.54726)));
            zz = -1.17372 + (((tickAnim - 31) / 3) * (-1.17372-(-1.17372)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -11.98386 + (((tickAnim - 34) / 6) * (-7.5-(-11.98386)));
            yy = 20.54726 + (((tickAnim - 34) / 6) * (0-(20.54726)));
            zz = -1.17372 + (((tickAnim - 34) / 6) * (12.5-(-1.17372)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 40) / 10) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 12.5 + (((tickAnim - 40) / 10) * (0-(12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.70304-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (51.86575-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (9.65396-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.70304 + (((tickAnim - 10) / 3) * (0.17995-(4.70304)));
            yy = 51.86575 + (((tickAnim - 10) / 3) * (12.39135-(51.86575)));
            zz = 9.65396 + (((tickAnim - 10) / 3) * (1.65751-(9.65396)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.17995 + (((tickAnim - 13) / 2) * (4.70304-(0.17995)));
            yy = 12.39135 + (((tickAnim - 13) / 2) * (51.86575-(12.39135)));
            zz = 1.65751 + (((tickAnim - 13) / 2) * (9.65396-(1.65751)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.70304 + (((tickAnim - 15) / 3) * (0.17995-(4.70304)));
            yy = 51.86575 + (((tickAnim - 15) / 3) * (12.39135-(51.86575)));
            zz = 9.65396 + (((tickAnim - 15) / 3) * (1.65751-(9.65396)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.17995 + (((tickAnim - 18) / 2) * (4.70304-(0.17995)));
            yy = 12.39135 + (((tickAnim - 18) / 2) * (51.86575-(12.39135)));
            zz = 1.65751 + (((tickAnim - 18) / 2) * (9.65396-(1.65751)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 4.70304 + (((tickAnim - 20) / 3) * (0.17995-(4.70304)));
            yy = 51.86575 + (((tickAnim - 20) / 3) * (12.39135-(51.86575)));
            zz = 9.65396 + (((tickAnim - 20) / 3) * (1.65751-(9.65396)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0.17995 + (((tickAnim - 23) / 1) * (4.70304-(0.17995)));
            yy = 12.39135 + (((tickAnim - 23) / 1) * (51.86575-(12.39135)));
            zz = 1.65751 + (((tickAnim - 23) / 1) * (9.65396-(1.65751)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 4.70304 + (((tickAnim - 24) / 2) * (4.70304-(4.70304)));
            yy = 51.86575 + (((tickAnim - 24) / 2) * (51.86575-(51.86575)));
            zz = 9.65396 + (((tickAnim - 24) / 2) * (9.65396-(9.65396)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 4.70304 + (((tickAnim - 26) / 2) * (3.75672-(4.70304)));
            yy = 51.86575 + (((tickAnim - 26) / 2) * (39.3991-(51.86575)));
            zz = 9.65396 + (((tickAnim - 26) / 2) * (8.33804-(9.65396)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = 3.75672 + (((tickAnim - 28) / 15) * (3.75672-(3.75672)));
            yy = 39.3991 + (((tickAnim - 28) / 15) * (39.3991-(39.3991)));
            zz = 8.33804 + (((tickAnim - 28) / 15) * (8.33804-(8.33804)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.75672 + (((tickAnim - 43) / 7) * (0-(3.75672)));
            yy = 39.3991 + (((tickAnim - 43) / 7) * (0-(39.3991)));
            zz = 8.33804 + (((tickAnim - 43) / 7) * (0-(8.33804)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(CrestsL, CrestsL.rotateAngleX + (float) Math.toRadians(xx), CrestsL.rotateAngleY + (float) Math.toRadians(yy), CrestsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.70304-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-51.86575-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-9.65396-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.70304 + (((tickAnim - 10) / 3) * (0.17995-(4.70304)));
            yy = -51.86575 + (((tickAnim - 10) / 3) * (-12.39135-(-51.86575)));
            zz = -9.65396 + (((tickAnim - 10) / 3) * (-1.65751-(-9.65396)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.17995 + (((tickAnim - 13) / 2) * (4.70304-(0.17995)));
            yy = -12.39135 + (((tickAnim - 13) / 2) * (-51.86575-(-12.39135)));
            zz = -1.65751 + (((tickAnim - 13) / 2) * (-9.65396-(-1.65751)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.70304 + (((tickAnim - 15) / 3) * (0.17995-(4.70304)));
            yy = -51.86575 + (((tickAnim - 15) / 3) * (-12.39135-(-51.86575)));
            zz = -9.65396 + (((tickAnim - 15) / 3) * (-1.65751-(-9.65396)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.17995 + (((tickAnim - 18) / 2) * (4.70304-(0.17995)));
            yy = -12.39135 + (((tickAnim - 18) / 2) * (-51.86575-(-12.39135)));
            zz = -1.65751 + (((tickAnim - 18) / 2) * (-9.65396-(-1.65751)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 4.70304 + (((tickAnim - 20) / 3) * (0.17995-(4.70304)));
            yy = -51.86575 + (((tickAnim - 20) / 3) * (-12.39135-(-51.86575)));
            zz = -9.65396 + (((tickAnim - 20) / 3) * (-1.65751-(-9.65396)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0.17995 + (((tickAnim - 23) / 1) * (4.70304-(0.17995)));
            yy = -12.39135 + (((tickAnim - 23) / 1) * (-51.86575-(-12.39135)));
            zz = -1.65751 + (((tickAnim - 23) / 1) * (-9.65396-(-1.65751)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 4.70304 + (((tickAnim - 24) / 2) * (4.70304-(4.70304)));
            yy = -51.86575 + (((tickAnim - 24) / 2) * (-51.86575-(-51.86575)));
            zz = -9.65396 + (((tickAnim - 24) / 2) * (-9.65396-(-9.65396)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 4.70304 + (((tickAnim - 26) / 2) * (3.75672-(4.70304)));
            yy = -51.86575 + (((tickAnim - 26) / 2) * (-39.3991-(-51.86575)));
            zz = -9.65396 + (((tickAnim - 26) / 2) * (-8.33804-(-9.65396)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = 3.75672 + (((tickAnim - 28) / 15) * (3.75672-(3.75672)));
            yy = -39.3991 + (((tickAnim - 28) / 15) * (-39.3991-(-39.3991)));
            zz = -8.33804 + (((tickAnim - 28) / 15) * (-8.33804-(-8.33804)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.75672 + (((tickAnim - 43) / 7) * (0-(3.75672)));
            yy = -39.3991 + (((tickAnim - 43) / 7) * (0-(-39.3991)));
            zz = -8.33804 + (((tickAnim - 43) / 7) * (0-(-8.33804)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(CrestsR, CrestsR.rotateAngleX + (float) Math.toRadians(xx), CrestsR.rotateAngleY + (float) Math.toRadians(yy), CrestsR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTianyulong entity = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

        int animCycle = 115;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -10.5 + (((tickAnim - 8) / 5) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 49) {
            xx = -10.5 + (((tickAnim - 13) / 36) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 13) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 36) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = -10.5 + (((tickAnim - 49) / 16) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 13) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 36) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 10.5 + (((tickAnim - 8) / 5) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 49) {
            xx = 10.5 + (((tickAnim - 13) / 36) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 13) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 36) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 10.5 + (((tickAnim - 49) / 16) * (0-(10.5)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 10.5 + (((tickAnim - 8) / 5) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 49) {
            xx = 10.5 + (((tickAnim - 13) / 36) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 13) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 36) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 10.5 + (((tickAnim - 49) / 16) * (0-(10.5)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 75) {
            xx = 2.5 + (((tickAnim - 13) / 62) * (-1.92142-(2.5)));
            yy = 0 + (((tickAnim - 13) / 62) * (-1.79598-(0)));
            zz = 0 + (((tickAnim - 13) / 62) * (-1.65674-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 115) {
            xx = -1.92142 + (((tickAnim - 75) / 40) * (0-(-1.92142)));
            yy = -1.79598 + (((tickAnim - 75) / 40) * (0-(-1.79598)));
            zz = -1.65674 + (((tickAnim - 75) / 40) * (0-(-1.65674)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.11175-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (3.04484-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 1.11175 + (((tickAnim - 8) / 5) * (-4-(1.11175)));
            yy = 3.04484 + (((tickAnim - 8) / 5) * (6.75-(3.04484)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = -4 + (((tickAnim - 13) / 32) * (-8.2724-(-4)));
            yy = 6.75 + (((tickAnim - 13) / 32) * (8.23077-(6.75)));
            zz = 0 + (((tickAnim - 13) / 32) * (0.00265-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 75) {
            xx = -8.2724 + (((tickAnim - 45) / 30) * (-4.97018-(-8.2724)));
            yy = 8.23077 + (((tickAnim - 45) / 30) * (9.5-(8.23077)));
            zz = 0.00265 + (((tickAnim - 45) / 30) * (0.00492-(0.00265)));
        }
        else if (tickAnim >= 75 && tickAnim < 115) {
            xx = -4.97018 + (((tickAnim - 75) / 40) * (0-(-4.97018)));
            yy = 9.5 + (((tickAnim - 75) / 40) * (0-(9.5)));
            zz = 0.00492 + (((tickAnim - 75) / 40) * (0-(0.00492)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15.89363-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.76706-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.13493-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.89363 + (((tickAnim - 8) / 5) * (3.25181-(15.89363)));
            yy = -0.76706 + (((tickAnim - 8) / 5) * (-1.7898-(-0.76706)));
            zz = 0.13493 + (((tickAnim - 8) / 5) * (0.31483-(0.13493)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = 3.25181 + (((tickAnim - 13) / 32) * (23.00084-(3.25181)));
            yy = -1.7898 + (((tickAnim - 13) / 32) * (4.15471-(-1.7898)));
            zz = 0.31483 + (((tickAnim - 13) / 32) * (0.14531-(0.31483)));
        }
        else if (tickAnim >= 45 && tickAnim < 75) {
            xx = 23.00084 + (((tickAnim - 45) / 30) * (0-(23.00084)));
            yy = 4.15471 + (((tickAnim - 45) / 30) * (9.25-(4.15471)));
            zz = 0.14531 + (((tickAnim - 45) / 30) * (0-(0.14531)));
        }
        else if (tickAnim >= 75 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 75) / 40) * (0-(0)));
            yy = 9.25 + (((tickAnim - 75) / 40) * (0-(9.25)));
            zz = 0 + (((tickAnim - 75) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (25.52907-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-3.29076-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.9652-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 25.52907 + (((tickAnim - 8) / 5) * (5.15115-(25.52907)));
            yy = -3.29076 + (((tickAnim - 8) / 5) * (-7.67843-(-3.29076)));
            zz = -0.9652 + (((tickAnim - 8) / 5) * (-2.25213-(-0.9652)));
        }
        else if (tickAnim >= 13 && tickAnim < 45) {
            xx = 5.15115 + (((tickAnim - 13) / 32) * (42.3652-(5.15115)));
            yy = -7.67843 + (((tickAnim - 13) / 32) * (10.56586-(-7.67843)));
            zz = -2.25213 + (((tickAnim - 13) / 32) * (-10.1743-(-2.25213)));
        }
        else if (tickAnim >= 45 && tickAnim < 75) {
            xx = 42.3652 + (((tickAnim - 45) / 30) * (0-(42.3652)));
            yy = 10.56586 + (((tickAnim - 45) / 30) * (23.25-(10.56586)));
            zz = -10.1743 + (((tickAnim - 45) / 30) * (0-(-10.1743)));
        }
        else if (tickAnim >= 75 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 75) / 28) * (-9.69238-(0)));
            yy = 23.25 + (((tickAnim - 75) / 28) * (20.9353-(23.25)));
            zz = 0 + (((tickAnim - 75) / 28) * (-7.49752-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 115) {
            xx = -9.69238 + (((tickAnim - 103) / 12) * (0-(-9.69238)));
            yy = 20.9353 + (((tickAnim - 103) / 12) * (0-(20.9353)));
            zz = -7.49752 + (((tickAnim - 103) / 12) * (0-(-7.49752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -6.5 + (((tickAnim - 8) / 5) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 49) {
            xx = -6.5 + (((tickAnim - 13) / 36) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 13) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 36) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = -6.5 + (((tickAnim - 49) / 16) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (-9.50896-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (6.24785-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (-0.16426-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 106) {
            xx = -9.50896 + (((tickAnim - 75) / 31) * (-9.50896-(-9.50896)));
            yy = 6.24785 + (((tickAnim - 75) / 31) * (6.24785-(6.24785)));
            zz = -0.16426 + (((tickAnim - 75) / 31) * (-0.16426-(-0.16426)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = -9.50896 + (((tickAnim - 106) / 9) * (0-(-9.50896)));
            yy = 6.24785 + (((tickAnim - 106) / 9) * (0-(6.24785)));
            zz = -0.16426 + (((tickAnim - 106) / 9) * (0-(-0.16426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 4.75 + (((tickAnim - 7) / 6) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 49) {
            xx = 4.75 + (((tickAnim - 13) / 36) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 13) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 36) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 57) {
            xx = 4.75 + (((tickAnim - 49) / 8) * (-2.75-(4.75)));
            yy = 0 + (((tickAnim - 49) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 8) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 65) {
            xx = -2.75 + (((tickAnim - 57) / 8) * (4.75-(-2.75)));
            yy = 0 + (((tickAnim - 57) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 8) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 4.75 + (((tickAnim - 65) / 10) * (3.21152-(4.75)));
            yy = 0 + (((tickAnim - 65) / 10) * (13.63793-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (1.76877-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 106) {
            xx = 3.21152 + (((tickAnim - 75) / 31) * (3.21152-(3.21152)));
            yy = 13.63793 + (((tickAnim - 75) / 31) * (13.63793-(13.63793)));
            zz = 1.76877 + (((tickAnim - 75) / 31) * (1.76877-(1.76877)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = 3.21152 + (((tickAnim - 106) / 9) * (0-(3.21152)));
            yy = 13.63793 + (((tickAnim - 106) / 9) * (0-(13.63793)));
            zz = 1.76877 + (((tickAnim - 106) / 9) * (0-(1.76877)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 6) / 4) * (0-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 13) / 31) * (0.19437-(0)));
            yy = 0 + (((tickAnim - 13) / 31) * (1.99885-(0)));
            zz = 0 + (((tickAnim - 13) / 31) * (-10.8523-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = 0.19437 + (((tickAnim - 44) / 5) * (0-(0.19437)));
            yy = 1.99885 + (((tickAnim - 44) / 5) * (0-(1.99885)));
            zz = -10.8523 + (((tickAnim - 44) / 5) * (0-(-10.8523)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 17.75 + (((tickAnim - 6) / 4) * (0-(17.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 10) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 39) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 6) / 4) * (0-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 13) / 31) * (-1.43253-(0)));
            yy = 0 + (((tickAnim - 13) / 31) * (0.90537-(0)));
            zz = 0 + (((tickAnim - 13) / 31) * (-7.10728-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = -1.43253 + (((tickAnim - 44) / 5) * (0-(-1.43253)));
            yy = 0.90537 + (((tickAnim - 44) / 5) * (0-(0.90537)));
            zz = -7.10728 + (((tickAnim - 44) / 5) * (0-(-7.10728)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 17.75 + (((tickAnim - 6) / 4) * (0-(17.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 10) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 39) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.13-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 6.13 + (((tickAnim - 3) / 4) * (10.25-(6.13)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 10.25 + (((tickAnim - 7) / 7) * (13.03404-(10.25)));
            yy = 0 + (((tickAnim - 7) / 7) * (-29.43323-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (-8.89663-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 43) {
            xx = 13.03404 + (((tickAnim - 14) / 29) * (13.03404-(13.03404)));
            yy = -29.43323 + (((tickAnim - 14) / 29) * (-29.43323-(-29.43323)));
            zz = -8.89663 + (((tickAnim - 14) / 29) * (-8.89663-(-8.89663)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 13.03404 + (((tickAnim - 43) / 6) * (0-(13.03404)));
            yy = -29.43323 + (((tickAnim - 43) / 6) * (0-(-29.43323)));
            zz = -8.89663 + (((tickAnim - 43) / 6) * (0-(-8.89663)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (10.04627-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (13.39005-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (-1.7354-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 106) {
            xx = 10.04627 + (((tickAnim - 75) / 31) * (10.04627-(10.04627)));
            yy = 13.39005 + (((tickAnim - 75) / 31) * (13.39005-(13.39005)));
            zz = -1.7354 + (((tickAnim - 75) / 31) * (-1.7354-(-1.7354)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = 10.04627 + (((tickAnim - 106) / 9) * (0-(10.04627)));
            yy = 13.39005 + (((tickAnim - 106) / 9) * (0-(13.39005)));
            zz = -1.7354 + (((tickAnim - 106) / 9) * (0-(-1.7354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-2.2054-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (-12.23441-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-0.37893-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 43) {
            xx = -2.2054 + (((tickAnim - 11) / 32) * (-2.2054-(-2.2054)));
            yy = -12.23441 + (((tickAnim - 11) / 32) * (-12.23441-(-12.23441)));
            zz = -0.37893 + (((tickAnim - 11) / 32) * (-0.37893-(-0.37893)));
        }
        else if (tickAnim >= 43 && tickAnim < 75) {
            xx = -2.2054 + (((tickAnim - 43) / 32) * (-7.80262-(-2.2054)));
            yy = -12.23441 + (((tickAnim - 43) / 32) * (15.16107-(-12.23441)));
            zz = -0.37893 + (((tickAnim - 43) / 32) * (0.75863-(-0.37893)));
        }
        else if (tickAnim >= 75 && tickAnim < 106) {
            xx = -7.80262 + (((tickAnim - 75) / 31) * (-7.80262-(-7.80262)));
            yy = 15.16107 + (((tickAnim - 75) / 31) * (15.16107-(15.16107)));
            zz = 0.75863 + (((tickAnim - 75) / 31) * (0.75863-(0.75863)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = -7.80262 + (((tickAnim - 106) / 9) * (0-(-7.80262)));
            yy = 15.16107 + (((tickAnim - 106) / 9) * (0-(15.16107)));
            zz = 0.75863 + (((tickAnim - 106) / 9) * (0-(0.75863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.75 + (((tickAnim - 3) / 2) * (16-(-7.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 16 + (((tickAnim - 5) / 3) * (16-(16)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 16 + (((tickAnim - 8) / 3) * (-8.39882-(16)));
            yy = 0 + (((tickAnim - 8) / 3) * (-17.15171-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.40098-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -8.39882 + (((tickAnim - 11) / 10) * (-8.39882-(-8.39882)));
            yy = -17.15171 + (((tickAnim - 11) / 10) * (-17.15171-(-17.15171)));
            zz = 0.40098 + (((tickAnim - 11) / 10) * (0.40098-(0.40098)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -8.39882 + (((tickAnim - 21) / 3) * (-2.69093-(-8.39882)));
            yy = -17.15171 + (((tickAnim - 21) / 3) * (-18.85791-(-17.15171)));
            zz = 0.40098 + (((tickAnim - 21) / 3) * (-17.92087-(0.40098)));
        }
        else if (tickAnim >= 24 && tickAnim < 39) {
            xx = -2.69093 + (((tickAnim - 24) / 15) * (-2.69093-(-2.69093)));
            yy = -18.85791 + (((tickAnim - 24) / 15) * (-18.85791-(-18.85791)));
            zz = -17.92087 + (((tickAnim - 24) / 15) * (-17.92087-(-17.92087)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -2.69093 + (((tickAnim - 39) / 5) * (-8.39882-(-2.69093)));
            yy = -18.85791 + (((tickAnim - 39) / 5) * (-17.15171-(-18.85791)));
            zz = -17.92087 + (((tickAnim - 39) / 5) * (0.40098-(-17.92087)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = -8.39882 + (((tickAnim - 44) / 5) * (0-(-8.39882)));
            yy = -17.15171 + (((tickAnim - 44) / 5) * (0-(-17.15171)));
            zz = 0.40098 + (((tickAnim - 44) / 5) * (0-(0.40098)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (-18.2506-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (1.05176-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (6.55-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -18.2506 + (((tickAnim - 70) / 5) * (5.47179-(-18.2506)));
            yy = 1.05176 + (((tickAnim - 70) / 5) * (3.97288-(1.05176)));
            zz = 6.55 + (((tickAnim - 70) / 5) * (12.50512-(6.55)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 5.47179 + (((tickAnim - 75) / 13) * (5.47179-(5.47179)));
            yy = 3.97288 + (((tickAnim - 75) / 13) * (3.97288-(3.97288)));
            zz = 12.50512 + (((tickAnim - 75) / 13) * (12.50512-(12.50512)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 5.47179 + (((tickAnim - 88) / 5) * (3.12468-(5.47179)));
            yy = 3.97288 + (((tickAnim - 88) / 5) * (14.93007-(3.97288)));
            zz = 12.50512 + (((tickAnim - 88) / 5) * (-1.03809-(12.50512)));
        }
        else if (tickAnim >= 93 && tickAnim < 106) {
            xx = 3.12468 + (((tickAnim - 93) / 13) * (3.12468-(3.12468)));
            yy = 14.93007 + (((tickAnim - 93) / 13) * (14.93007-(14.93007)));
            zz = -1.03809 + (((tickAnim - 93) / 13) * (-1.03809-(-1.03809)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = 3.12468 + (((tickAnim - 106) / 9) * (0-(3.12468)));
            yy = 14.93007 + (((tickAnim - 106) / 9) * (0-(14.93007)));
            zz = -1.03809 + (((tickAnim - 106) / 9) * (0-(-1.03809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (2.39945-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (29.16661-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (7.33558-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 2.39945 + (((tickAnim - 20) / 5) * (0-(2.39945)));
            yy = 29.16661 + (((tickAnim - 20) / 5) * (0-(29.16661)));
            zz = 7.33558 + (((tickAnim - 20) / 5) * (0-(7.33558)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (2.39945-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (29.16661-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (7.33558-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 2.39945 + (((tickAnim - 40) / 6) * (0-(2.39945)));
            yy = 29.16661 + (((tickAnim - 40) / 6) * (0-(29.16661)));
            zz = 7.33558 + (((tickAnim - 40) / 6) * (0-(7.33558)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 3) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 2) * (42.5-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 75) / 40) * (0-(0)));
            yy = 42.5 + (((tickAnim - 75) / 40) * (0-(42.5)));
            zz = 0 + (((tickAnim - 75) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(CrestsL, CrestsL.rotateAngleX + (float) Math.toRadians(xx), CrestsL.rotateAngleY + (float) Math.toRadians(yy), CrestsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (2.39945-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (-29.16661-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-7.33558-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 2.39945 + (((tickAnim - 20) / 5) * (0-(2.39945)));
            yy = -29.16661 + (((tickAnim - 20) / 5) * (0-(-29.16661)));
            zz = -7.33558 + (((tickAnim - 20) / 5) * (0-(-7.33558)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (2.39945-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (-29.16661-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (-7.33558-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 2.39945 + (((tickAnim - 40) / 6) * (0-(2.39945)));
            yy = -29.16661 + (((tickAnim - 40) / 6) * (0-(-29.16661)));
            zz = -7.33558 + (((tickAnim - 40) / 6) * (0-(-7.33558)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 3) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 2) * (-42.5-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 75) / 40) * (0-(0)));
            yy = -42.5 + (((tickAnim - 75) / 40) * (0-(-42.5)));
            zz = 0 + (((tickAnim - 75) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(CrestsR, CrestsR.rotateAngleX + (float) Math.toRadians(xx), CrestsR.rotateAngleY + (float) Math.toRadians(yy), CrestsR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animChatter(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTianyulong entity = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 23) / 17) * (0-(-10)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 14) / 26) * (0-(-10)));
            yy = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 20) / 20) * (0-(17.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 20) / 20) * (0-(17.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 13) / 27) * (0-(-5)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 9) / 31) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 9) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 7) / 33) * (0-(-5)));
            yy = 0 + (((tickAnim - 7) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 3) / 37) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 3) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 1) / 2) * (20-(20)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 20 + (((tickAnim - 3) / 1) * (15-(20)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 15 + (((tickAnim - 4) / 1) * (20-(15)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 5) / 3) * (20-(20)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 8) / 0) * (15-(20)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 15 + (((tickAnim - 8) / 1) * (20-(15)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 9) / 4) * (20-(20)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 13) / 0) * (15-(20)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 15 + (((tickAnim - 13) / 4) * (20-(15)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 17) / 1) * (15-(20)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 15 + (((tickAnim - 18) / 3) * (20-(15)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 20 + (((tickAnim - 21) / 1) * (15-(20)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 15 + (((tickAnim - 22) / 4) * (20-(15)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 20 + (((tickAnim - 26) / 1) * (15-(20)));
            yy = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 1) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 27) / 1) * (20-(15)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 28) / 2) * (20-(20)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 20 + (((tickAnim - 30) / 1) * (15-(20)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 15 + (((tickAnim - 31) / 1) * (20-(15)));
            yy = 0 + (((tickAnim - 31) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 1) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 20 + (((tickAnim - 32) / 1) * (20-(20)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 20 + (((tickAnim - 33) / 1) * (10-(20)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 34) / 1) * (12.5-(10)));
            yy = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 12.5 + (((tickAnim - 35) / 3) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 12.5 + (((tickAnim - 38) / 0) * (10-(12.5)));
            yy = 0 + (((tickAnim - 38) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 0) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 38) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTianyulong entity = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 7) / 13) * (0-(-5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 8) / 12) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 10) / 10) * (0-(15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 12) / 8) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 20 + (((tickAnim - 7) / 2) * (15-(20)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 15 + (((tickAnim - 9) / 2) * (20-(15)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 20 + (((tickAnim - 11) / 1) * (15-(20)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 12) / 1) * (20-(15)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 13) / 2) * (15-(20)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 15) / 1) * (0-(15)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTianyulong entity = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

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
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -15.25 + (((tickAnim - 0) / 18) * (6.25-(-15.25)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.25 + (((tickAnim - 18) / 15) * (29-(6.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 33) / 17) * (-15.25-(29)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -9.25 + (((tickAnim - 0) / 11) * (-2.76-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -2.76 + (((tickAnim - 11) / 7) * (-2-(-2.76)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 18) / 15) * (12.75-(-2)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 12.75 + (((tickAnim - 33) / 9) * (22.06-(12.75)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 22.06 + (((tickAnim - 42) / 8) * (-9.25-(22.06)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0.75 + (((tickAnim - 5) / 6) * (-3.82-(0.75)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -3.82 + (((tickAnim - 11) / 7) * (-1-(-3.82)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1 + (((tickAnim - 18) / 15) * (17-(-1)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 17 + (((tickAnim - 33) / 4) * (-8.94-(17)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -8.94 + (((tickAnim - 37) / 5) * (-41.28-(-8.94)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -41.28 + (((tickAnim - 42) / 8) * (0-(-41.28)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 28.25 + (((tickAnim - 0) / 5) * (14-(28.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 14 + (((tickAnim - 5) / 6) * (8.93-(14)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 8.93 + (((tickAnim - 11) / 3) * (2.59-(8.93)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.59 + (((tickAnim - 14) / 4) * (-2.75-(2.59)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.75 + (((tickAnim - 18) / 2) * (-7.67-(-2.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -7.67 + (((tickAnim - 20) / 4) * (-10.11-(-7.67)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -10.11 + (((tickAnim - 24) / 4) * (-1.92-(-10.11)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -1.92 + (((tickAnim - 28) / 5) * (24.75-(-1.92)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 24.75 + (((tickAnim - 33) / 9) * (35.36-(24.75)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 35.36 + (((tickAnim - 42) / 4) * (13.72-(35.36)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 13.72 + (((tickAnim - 46) / 4) * (28.25-(13.72)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 0) / 50) * (-2-(-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 0) / 50) * (4-(4)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.8609 + (((tickAnim - 0) / 50) * (-0.8609-(-0.8609)));
            yy = -18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1 + (((tickAnim - 0) / 50) * (-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1-(-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1)));
            zz = -0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)) + (((tickAnim - 0) / 50) * (-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))-(-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.28486 + (((tickAnim - 0) / 7) * (-0.28486-(-0.28486)));
            yy = -8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 0) / 7) * (-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = 4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 7) * (4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.28486 + (((tickAnim - 7) / 3) * (-2.35992-(-0.28486)));
            yy = -8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 7) / 3) * (14.3222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = 4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 7) / 3) * (-3.2403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))-(4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.35992 + (((tickAnim - 10) / 5) * (-2.35992-(-2.35992)));
            yy = 14.3222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 10) / 5) * (14.3222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(14.3222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = -3.2403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)) + (((tickAnim - 10) / 5) * (-3.2403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))-(-3.2403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.35992 + (((tickAnim - 15) / 5) * (-4.71127-(-2.35992)));
            yy = 14.3222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 15) / 5) * (29.1476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(14.3222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = -3.2403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)) + (((tickAnim - 15) / 5) * (-3.4271+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))-(-3.2403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.71127 + (((tickAnim - 20) / 10) * (-4.71127-(-4.71127)));
            yy = 29.1476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 20) / 10) * (29.1476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(29.1476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = -3.4271+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)) + (((tickAnim - 20) / 10) * (-3.4271+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))-(-3.4271+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.71127 + (((tickAnim - 30) / 20) * (-0.28486-(-4.71127)));
            yy = 29.1476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 30) / 20) * (-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(29.1476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = -3.4271+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)) + (((tickAnim - 30) / 20) * (4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(-3.4271+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.60681 + (((tickAnim - 0) / 7) * (-0.60681-(-0.60681)));
            yy = -2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 7) * (-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = 10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*- + (((tickAnim - 0) / 7) * (10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.60681 + (((tickAnim - 7) / 3) * (-1.66654-(-0.60681)));
            yy = -2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 7) / 3) * (2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = 10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*- + (((tickAnim - 7) / 3) * (-7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -1.66654 + (((tickAnim - 10) / 5) * (-1.66654-(-1.66654)));
            yy = 2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 10) / 5) * (2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = -7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 10) / 5) * (-7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(-7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.66654 + (((tickAnim - 15) / 5) * (-1.66654-(-1.66654)));
            yy = 2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 15) / 5) * (2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = -7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 15) / 5) * (-7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(-7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.66654 + (((tickAnim - 20) / 10) * (-1.66654-(-1.66654)));
            yy = 2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 20) / 10) * (2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = -7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 20) / 10) * (-7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(-7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.66654 + (((tickAnim - 30) / 20) * (-0.60681-(-1.66654)));
            yy = 2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 30) / 20) * (-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(2.3697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = -7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 30) / 20) * (10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(-7.3255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -2.14987 + (((tickAnim - 0) / 7) * (-2.14987-(-2.14987)));
            yy = 2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 0) / 7) * (2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 7) * (10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -2.14987 + (((tickAnim - 7) / 3) * (-3.57453-(-2.14987)));
            yy = 2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 7) / 3) * (4.073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 7) / 3) * (-0.1705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.57453 + (((tickAnim - 10) / 5) * (-3.57453-(-3.57453)));
            yy = 4.073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 10) / 5) * (4.073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(4.073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = -0.1705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*- + (((tickAnim - 10) / 5) * (-0.1705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(-0.1705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -3.57453 + (((tickAnim - 15) / 5) * (-6.71764-(-3.57453)));
            yy = 4.073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 15) / 5) * (21.2347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(4.073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = -0.1705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*- + (((tickAnim - 15) / 5) * (0.6976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(-0.1705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.71764 + (((tickAnim - 20) / 10) * (-6.71764-(-6.71764)));
            yy = 21.2347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 20) / 10) * (21.2347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(21.2347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 0.6976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 20) / 10) * (0.6976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(0.6976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.71764 + (((tickAnim - 30) / 20) * (-2.14987-(-6.71764)));
            yy = 21.2347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 30) / 20) * (2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(21.2347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 0.6976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 30) / 20) * (10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1-(0.6976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTianyulong entity = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = -20 + (((tickAnim - 13) / 16) * (-20-(-20)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = -6 + (((tickAnim - 13) / 16) * (-6-(-6)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = -20 + (((tickAnim - 29) / 9) * (7-(-20)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = -6 + (((tickAnim - 29) / 9) * (0-(-6)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 38) / 12) * (0-(7)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -2.5 + (((tickAnim - 14) / 4) * (-2.97-(-2.5)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -2.97 + (((tickAnim - 18) / 13) * (-2.97-(-2.97)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 31) / 10) * (0-(0)));
            yy = -2.97 + (((tickAnim - 31) / 10) * (-1.92-(-2.97)));
            zz = 0 + (((tickAnim - 31) / 10) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = -1.92 + (((tickAnim - 41) / 9) * (0-(-1.92)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




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
            xx = 0 + (((tickAnim - 0) / 19) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -6 + (((tickAnim - 19) / 9) * (-6-(-6)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 28) / 22) * (0-(-6)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 27) / 9) * (-2-(0)));
            yy = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 9) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 36) / 14) * (0-(-2)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 19) / 9) * (3-(3)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 3 + (((tickAnim - 28) / 8) * (-1.05-(3)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -1.05 + (((tickAnim - 36) / 7) * (-3.56-(-1.05)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -3.56 + (((tickAnim - 43) / 7) * (0-(-3.56)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.5 + (((tickAnim - 19) / 9) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 8.5 + (((tickAnim - 28) / 8) * (1.27-(8.5)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 1.27 + (((tickAnim - 36) / 7) * (-4.58-(1.27)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.58 + (((tickAnim - 43) / 7) * (0-(-4.58)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -7 + (((tickAnim - 19) / 9) * (-7-(-7)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 28) / 22) * (0-(-7)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.75 + (((tickAnim - 19) / 9) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 28) / 22) * (0-(8.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-37.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = -37.5 + (((tickAnim - 19) / 10) * (0-(-37.5)));
            zz = 0 + (((tickAnim - 19) / 10) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (5.42-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 5.42 + (((tickAnim - 38) / 12) * (0-(5.42)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.55933-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.63358-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.17494-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.55933 + (((tickAnim - 13) / 7) * (8.93605-(0.55933)));
            yy = -4.63358 + (((tickAnim - 13) / 7) * (-33.79323-(-4.63358)));
            zz = -6.17494 + (((tickAnim - 13) / 7) * (-11.76102-(-6.17494)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 8.93605 + (((tickAnim - 20) / 4) * (8.93605-(8.93605)));
            yy = -33.79323 + (((tickAnim - 20) / 4) * (-33.79323-(-33.79323)));
            zz = -11.76102 + (((tickAnim - 20) / 4) * (-11.76102-(-11.76102)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 8.93605 + (((tickAnim - 24) / 5) * (0-(8.93605)));
            yy = -33.79323 + (((tickAnim - 24) / 5) * (0-(-33.79323)));
            zz = -11.76102 + (((tickAnim - 24) / 5) * (0-(-11.76102)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (4.5-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 4.5 + (((tickAnim - 38) / 5) * (6-(4.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 43) / 7) * (0-(6)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTianyulong entity = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 44) {
            xx = 1 + (((tickAnim - 18) / 26) * (1-(1)));
            yy = 0 + (((tickAnim - 18) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 26) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 44) / 6) * (0-(1)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 18) / 26) * (0-(0)));
            yy = 0.25 + (((tickAnim - 18) / 26) * (0.25-(0.25)));
            zz = -1 + (((tickAnim - 18) / 26) * (-1-(-1)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0.25 + (((tickAnim - 44) / 6) * (0-(0.25)));
            zz = -1 + (((tickAnim - 44) / 6) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -33.75 + (((tickAnim - 5) / 15) * (-12.5-(-33.75)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 20) / 20) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = -12.5 + (((tickAnim - 40) / 7) * (-33.75-(-12.5)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 49) {
            xx = -33.75 + (((tickAnim - 47) / 2) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 47) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 5) / 15) * (-15-(12.5)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = -15 + (((tickAnim - 20) / 19) * (-15-(-15)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = -15 + (((tickAnim - 39) / 7) * (12.5-(-15)));
            yy = 0 + (((tickAnim - 39) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 7) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 12.5 + (((tickAnim - 46) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 5) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 39) / 7) * (12.5-(0)));
            yy = 0 + (((tickAnim - 39) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 7) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 12.5 + (((tickAnim - 46) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 25 + (((tickAnim - 20) / 19) * (25-(25)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 25 + (((tickAnim - 39) / 9) * (0-(25)));
            yy = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 20) / 20) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 40) / 10) * (0-(7.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (-5-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 40) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (-5-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 40) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (7.22-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 7.22 + (((tickAnim - 17) / 5) * (5-(7.22)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 22) / 11) * (-2.5-(5)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -2.5 + (((tickAnim - 33) / 8) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -10 + (((tickAnim - 18) / 10) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 28) / 5) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 33) / 17) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 2.5 + (((tickAnim - 18) / 9) * (5-(2.5)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 5 + (((tickAnim - 27) / 7) * (0-(5)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 41) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 22) / 11) * (10-(7.5)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 10 + (((tickAnim - 33) / 4) * (10-(10)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 10 + (((tickAnim - 37) / 4) * (0-(10)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.0043-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (17.24981-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.99445-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -10.0043 + (((tickAnim - 8) / 10) * (10-(-10.0043)));
            yy = 17.24981 + (((tickAnim - 8) / 10) * (0-(17.24981)));
            zz = -2.99445 + (((tickAnim - 8) / 10) * (0-(-2.99445)));
        }
        else if (tickAnim >= 18 && tickAnim < 49) {
            xx = 10 + (((tickAnim - 18) / 31) * (0-(10)));
            yy = 0 + (((tickAnim - 18) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 46) {
            xx = -30 + (((tickAnim - 18) / 28) * (-30-(-30)));
            yy = 0 + (((tickAnim - 18) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 28) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = -30 + (((tickAnim - 46) / 3) * (0-(-30)));
            yy = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 46) {
            xx = 17.5 + (((tickAnim - 18) / 28) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 28) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 17.5 + (((tickAnim - 46) / 3) * (0-(17.5)));
            yy = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 46) {
            xx = -30 + (((tickAnim - 18) / 28) * (-30-(-30)));
            yy = 0 + (((tickAnim - 18) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 28) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = -30 + (((tickAnim - 46) / 3) * (0-(-30)));
            yy = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 46) {
            xx = 17.5 + (((tickAnim - 18) / 28) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 28) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 17.5 + (((tickAnim - 46) / 3) * (0-(17.5)));
            yy = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.76795-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (12.57189-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.16515-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0.76795 + (((tickAnim - 8) / 10) * (15-(0.76795)));
            yy = 12.57189 + (((tickAnim - 8) / 10) * (0-(12.57189)));
            zz = 1.16515 + (((tickAnim - 8) / 10) * (0-(1.16515)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 15 + (((tickAnim - 18) / 4) * (18.04-(15)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 18.04 + (((tickAnim - 22) / 1) * (7.43-(18.04)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 7.43 + (((tickAnim - 23) / 9) * (2.5-(7.43)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = 2.5 + (((tickAnim - 32) / 12) * (15-(2.5)));
            yy = 0 + (((tickAnim - 32) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 12) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = 15 + (((tickAnim - 44) / 5) * (0-(15)));
            yy = 0 + (((tickAnim - 44) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9.93743-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (28.36466-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.96884-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 9.93743 + (((tickAnim - 8) / 10) * (22.5-(9.93743)));
            yy = 28.36466 + (((tickAnim - 8) / 10) * (0-(28.36466)));
            zz = -1.96884 + (((tickAnim - 8) / 10) * (0-(-1.96884)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 18) / 2) * (25-(22.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 25 + (((tickAnim - 20) / 6) * (0-(25)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (-4.62-(0)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = -4.62 + (((tickAnim - 33) / 11) * (-4.62-(-4.62)));
            yy = 0 + (((tickAnim - 33) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 11) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = -4.62 + (((tickAnim - 44) / 5) * (0-(-4.62)));
            yy = 0 + (((tickAnim - 44) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-18.79018-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (19.01253-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-6.32488-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -18.79018 + (((tickAnim - 8) / 10) * (-5-(-18.79018)));
            yy = 19.01253 + (((tickAnim - 8) / 10) * (0-(19.01253)));
            zz = -6.32488 + (((tickAnim - 8) / 10) * (0-(-6.32488)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 18) / 0) * (-30.71-(-5)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -30.71 + (((tickAnim - 18) / 10) * (20-(-30.71)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 20 + (((tickAnim - 28) / 13) * (27.5-(20)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 27.5 + (((tickAnim - 41) / 7) * (0-(27.5)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.83-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -0.83 + (((tickAnim - 18) / 0) * (5.84-(-0.83)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 5.84 + (((tickAnim - 18) / 1) * (6.67-(5.84)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 6.67 + (((tickAnim - 19) / 3) * (20-(6.67)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 20 + (((tickAnim - 22) / 6) * (-29.16-(20)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -29.16 + (((tickAnim - 28) / 4) * (-14.64889-(-29.16)));
            yy = 0 + (((tickAnim - 28) / 4) * (-24.49736-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0.99294-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -14.64889 + (((tickAnim - 32) / 4) * (-4.88202-(-14.64889)));
            yy = -24.49736 + (((tickAnim - 32) / 4) * (28.13663-(-24.49736)));
            zz = 0.99294 + (((tickAnim - 32) / 4) * (24.27449-(0.99294)));
        }
        else if (tickAnim >= 36 && tickAnim < 49) {
            xx = -4.88202 + (((tickAnim - 36) / 13) * (0-(-4.88202)));
            yy = 28.13663 + (((tickAnim - 36) / 13) * (0-(28.13663)));
            zz = 24.27449 + (((tickAnim - 36) / 13) * (0-(24.27449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (20-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 20 + (((tickAnim - 18) / 1) * (0-(20)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (20-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 20 + (((tickAnim - 21) / 1) * (0-(20)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (20-(0)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 20 + (((tickAnim - 42) / 1) * (0-(20)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTianyulong entity = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

        int animCycle = 17;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 8) / 4) * (11.81-(7.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 11.81 + (((tickAnim - 12) / 6) * (0-(11.81)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 8) / 10) * (0-(2.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 6) / 12) * (0-(-10)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 6) / 12) * (0-(15)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 6) / 12) * (0-(-10)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 6) / 12) * (0-(15)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -15 + (((tickAnim - 8) / 4) * (7.5-(-15)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 12) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 17.5 + (((tickAnim - 8) / 4) * (-7.78-(17.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -7.78 + (((tickAnim - 12) / 6) * (0-(-7.78)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (45-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 7) / 5) * (45-(45)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 45 + (((tickAnim - 12) / 6) * (0-(45)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(CrestsL, CrestsL.rotateAngleX + (float) Math.toRadians(xx), CrestsL.rotateAngleY + (float) Math.toRadians(yy), CrestsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-45-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 7) / 5) * (-45-(-45)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = -45 + (((tickAnim - 12) / 6) * (0-(-45)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(CrestsR, CrestsR.rotateAngleX + (float) Math.toRadians(xx), CrestsR.rotateAngleY + (float) Math.toRadians(yy), CrestsR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 20 + (((tickAnim - 8) / 4) * (0-(20)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTianyulong entity = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 1) * (2.25-(1)));
            zz = -1 + (((tickAnim - 3) / 1) * (-0.75-(-1)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 2.25 + (((tickAnim - 4) / 1) * (1.5-(2.25)));
            zz = -0.75 + (((tickAnim - 4) / 1) * (-0.5-(-0.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.5 + (((tickAnim - 5) / 2) * (0-(1.5)));
            zz = -0.5 + (((tickAnim - 5) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (1-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-1-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 11) / 2) * (1.6-(1)));
            zz = -1 + (((tickAnim - 11) / 2) * (-0.6-(-1)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.6 + (((tickAnim - 13) / 2) * (0-(1.6)));
            zz = -0.6 + (((tickAnim - 13) / 2) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.33724 + (((tickAnim - 0) / 3) * (-25-(-16.33724)));
            yy = -6.98519 + (((tickAnim - 0) / 3) * (0-(-6.98519)));
            zz = 1.31992 + (((tickAnim - 0) / 3) * (0-(1.31992)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -25 + (((tickAnim - 3) / 1) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 3) / 1) * (-3.94898-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-2.05397-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -15.99476 + (((tickAnim - 4) / 3) * (6.05131-(-15.99476)));
            yy = -3.94898 + (((tickAnim - 4) / 3) * (-9.97674-(-3.94898)));
            zz = -2.05397 + (((tickAnim - 4) / 3) * (0.68516-(-2.05397)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 6.05131 + (((tickAnim - 7) / 1) * (15.07673-(6.05131)));
            yy = -9.97674 + (((tickAnim - 7) / 1) * (-9.96156-(-9.97674)));
            zz = 0.68516 + (((tickAnim - 7) / 1) * (-0.88045-(0.68516)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.07673 + (((tickAnim - 8) / 5) * (-7.67448-(15.07673)));
            yy = -9.96156 + (((tickAnim - 8) / 5) * (-13.97038-(-9.96156)));
            zz = -0.88045 + (((tickAnim - 8) / 5) * (2.63984-(-0.88045)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.67448 + (((tickAnim - 13) / 2) * (-16.33724-(-7.67448)));
            yy = -13.97038 + (((tickAnim - 13) / 2) * (-6.98519-(-13.97038)));
            zz = 2.63984 + (((tickAnim - 13) / 2) * (1.31992-(2.63984)));
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
            zz = -1 + (((tickAnim - 0) / 3) * (-1-(-1)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-1-(0)));
            zz = -1 + (((tickAnim - 3) / 1) * (-0.56-(-1)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 4) / 1) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 4) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 5) / 2) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 5) / 2) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 7) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 7) / 1) * (1-(0.56)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 8) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 2) * (0-(1)));
            zz = -0.11 + (((tickAnim - 13) / 2) * (-1-(-0.11)));
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
            xx = 10.08 + (((tickAnim - 0) / 3) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -35 + (((tickAnim - 3) / 1) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -33.72 + (((tickAnim - 4) / 1) * (-15.56-(-33.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -15.56 + (((tickAnim - 5) / 2) * (34.72-(-15.56)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 34.72 + (((tickAnim - 7) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 22.5 + (((tickAnim - 8) / 3) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 56.94 + (((tickAnim - 11) / 2) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 55.16 + (((tickAnim - 13) / 1) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 5) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerLegL.rotationPointX = this.LowerLegL.rotationPointX + (float)(xx);
        this.LowerLegL.rotationPointY = this.LowerLegL.rotationPointY - (float)(yy);
        this.LowerLegL.rotationPointZ = this.LowerLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -52.16 + (((tickAnim - 0) / 2) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -24.89 + (((tickAnim - 2) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 3) / 1) * (19.72-(7.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 19.72 + (((tickAnim - 4) / 1) * (25.56-(19.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 25.56 + (((tickAnim - 5) / 2) * (-2.22-(25.56)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -2.22 + (((tickAnim - 7) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 40 + (((tickAnim - 8) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -54.44 + (((tickAnim - 12) / 2) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -50.23 + (((tickAnim - 14) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 58.21 + (((tickAnim - 0) / 3) * (45-(58.21)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 45 + (((tickAnim - 3) / 1) * (30.83-(45)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 30.83 + (((tickAnim - 4) / 1) * (-9.17-(30.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -9.17 + (((tickAnim - 5) / 2) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 50.41 + (((tickAnim - 7) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 60 + (((tickAnim - 8) / 4) * (75.83-(60)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 75.83 + (((tickAnim - 12) / 3) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 15.07673 + (((tickAnim - 0) / 5) * (-7.67448-(15.07673)));
            yy = 9.96156 + (((tickAnim - 0) / 5) * (13.97038-(9.96156)));
            zz = 0.88045 + (((tickAnim - 0) / 5) * (-2.63984-(0.88045)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.67448 + (((tickAnim - 5) / 3) * (-16.33724-(-7.67448)));
            yy = 13.97038 + (((tickAnim - 5) / 3) * (6.98519-(13.97038)));
            zz = -2.63984 + (((tickAnim - 5) / 3) * (-1.31992-(-2.63984)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.33724 + (((tickAnim - 8) / 2) * (-25-(-16.33724)));
            yy = 6.98519 + (((tickAnim - 8) / 2) * (0-(6.98519)));
            zz = -1.31992 + (((tickAnim - 8) / 2) * (0-(-1.31992)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -25 + (((tickAnim - 10) / 2) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 10) / 2) * (3.94898-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (2.05397-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -15.99476 + (((tickAnim - 12) / 2) * (6.05131-(-15.99476)));
            yy = 3.94898 + (((tickAnim - 12) / 2) * (9.97674-(3.94898)));
            zz = 2.05397 + (((tickAnim - 12) / 2) * (-0.68516-(2.05397)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 6.05131 + (((tickAnim - 14) / 1) * (15.07673-(6.05131)));
            yy = 9.97674 + (((tickAnim - 14) / 1) * (9.96156-(9.97674)));
            zz = -0.68516 + (((tickAnim - 14) / 1) * (0.88045-(-0.68516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 0) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 5) * (0-(1)));
            zz = -0.11 + (((tickAnim - 5) / 5) * (-1-(-0.11)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-1-(0)));
            zz = -1 + (((tickAnim - 10) / 2) * (-0.56-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 12) / 1) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 12) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 13) / 1) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 13) / 1) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 14) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 14) / 1) * (1-(0.56)));
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
            xx = 22.5 + (((tickAnim - 0) / 5) * (55.16-(22.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 55.16 + (((tickAnim - 5) / 3) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.08 + (((tickAnim - 8) / 2) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -35 + (((tickAnim - 10) / 2) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -33.72 + (((tickAnim - 12) / 1) * (-13.06-(-33.72)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -13.06 + (((tickAnim - 13) / 1) * (34.72-(-13.06)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 34.72 + (((tickAnim - 14) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerLegR.rotationPointX = this.LowerLegR.rotationPointX + (float)(xx);
        this.LowerLegR.rotationPointY = this.LowerLegR.rotationPointY - (float)(yy);
        this.LowerLegR.rotationPointZ = this.LowerLegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 40 + (((tickAnim - 0) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -54.44 + (((tickAnim - 4) / 3) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -50.23 + (((tickAnim - 7) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -52.16 + (((tickAnim - 8) / 1) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -24.89 + (((tickAnim - 9) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 10) / 2) * (12.22-(7.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 12.22 + (((tickAnim - 12) / 1) * (25.56-(12.22)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 25.56 + (((tickAnim - 13) / 1) * (-2.22-(25.56)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -2.22 + (((tickAnim - 14) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 60 + (((tickAnim - 0) / 4) * (75.83-(60)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 75.83 + (((tickAnim - 4) / 4) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 58.21 + (((tickAnim - 8) / 2) * (45-(58.21)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 45 + (((tickAnim - 10) / 2) * (30.83-(45)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 30.83 + (((tickAnim - 12) / 1) * (-9.17-(30.83)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -9.17 + (((tickAnim - 13) / 1) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 50.41 + (((tickAnim - 14) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*-7), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*-12), Tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*-3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-8), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-50))*-2), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-9), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*-5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-70))*-6), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-70))*-3));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*2), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*3), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), UpperArmL.rotateAngleY + (float) Math.toRadians(7.45077), UpperArmL.rotateAngleZ + (float) Math.toRadians(-11.2468+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-5));


        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+20))*10), LowerArmL.rotateAngleY + (float) Math.toRadians(0), LowerArmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*5+10.5), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-170))*4));


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), UpperArmR.rotateAngleY + (float) Math.toRadians(-7.45077), UpperArmR.rotateAngleZ + (float) Math.toRadians(11.2468+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-5));


        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+20))*10), LowerArmR.rotateAngleY + (float) Math.toRadians(0), LowerArmR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*5+10.5), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-170))*-4));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(12.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*1), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTianyulong entity = (EntityPrehistoricFloraTianyulong) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.75-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 1) / 2) * (0.25-(0.5)));
            zz = -0.75 + (((tickAnim - 1) / 2) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 2) * (0-(0.25)));
            zz = -0.75 + (((tickAnim - 3) / 2) * (0-(-0.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.5-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.75-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 6) / 2) * (0.25-(0.5)));
            zz = -0.75 + (((tickAnim - 6) / 2) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 2) * (0-(0.25)));
            zz = -0.75 + (((tickAnim - 8) / 2) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -29.97283 + (((tickAnim - 0) / 5) * (30.02717-(-29.97283)));
            yy = 1.68868 + (((tickAnim - 0) / 5) * (1.68868-(1.68868)));
            zz = 1.84373 + (((tickAnim - 0) / 5) * (1.84373-(1.84373)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 30.02717 + (((tickAnim - 5) / 2) * (-6.22-(30.02717)));
            yy = 1.68868 + (((tickAnim - 5) / 2) * (1.69-(1.68868)));
            zz = 1.84373 + (((tickAnim - 5) / 2) * (1.84-(1.84373)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -6.22 + (((tickAnim - 7) / 1) * (-42.47283-(-6.22)));
            yy = 1.69 + (((tickAnim - 7) / 1) * (1.68868-(1.69)));
            zz = 1.84 + (((tickAnim - 7) / 1) * (1.84373-(1.84)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -42.47283 + (((tickAnim - 8) / 2) * (-29.97283-(-42.47283)));
            yy = 1.68868 + (((tickAnim - 8) / 2) * (1.68868-(1.68868)));
            zz = 1.84373 + (((tickAnim - 8) / 2) * (1.84373-(1.84373)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 0) / 3) * (-1.25-(-10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.25 + (((tickAnim - 3) / 2) * (-22.5-(-1.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -22.5 + (((tickAnim - 5) / 1) * (-2.92-(-22.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -2.92 + (((tickAnim - 6) / 1) * (16.02-(-2.92)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 16.02 + (((tickAnim - 7) / 1) * (23.39-(16.02)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 23.39 + (((tickAnim - 8) / 0) * (15.05-(23.39)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 15.05 + (((tickAnim - 8) / 1) * (7.8-(15.05)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 7.8 + (((tickAnim - 9) / 1) * (-10-(7.8)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 30 + (((tickAnim - 0) / 2) * (3.96-(30)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 3.96 + (((tickAnim - 2) / 1) * (2.5-(3.96)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 3) / 2) * (10-(2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 10 + (((tickAnim - 5) / 1) * (-4.17-(10)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -4.17 + (((tickAnim - 6) / 2) * (-31.29-(-4.17)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -31.29 + (((tickAnim - 8) / 0) * (14.07-(-31.29)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14.07 + (((tickAnim - 8) / 2) * (30-(14.07)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9.98724 + (((tickAnim - 0) / 2) * (13.42474-(9.98724)));
            yy = -1.49469 + (((tickAnim - 0) / 2) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 0) / 2) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 13.42474 + (((tickAnim - 2) / 1) * (-8.35834-(13.42474)));
            yy = -1.49469 + (((tickAnim - 2) / 1) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 2) / 1) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -8.35834 + (((tickAnim - 3) / 2) * (-12.51276-(-8.35834)));
            yy = -1.49469 + (((tickAnim - 3) / 2) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 3) / 2) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -12.51276 + (((tickAnim - 5) / 1) * (6.23724-(-12.51276)));
            yy = -1.49469 + (((tickAnim - 5) / 1) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 5) / 1) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 6.23724 + (((tickAnim - 6) / 2) * (77.92474-(6.23724)));
            yy = -1.49469 + (((tickAnim - 6) / 2) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 6) / 2) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 77.92474 + (((tickAnim - 8) / 0) * (40.22588-(77.92474)));
            yy = -1.49469 + (((tickAnim - 8) / 0) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 8) / 0) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40.22588 + (((tickAnim - 8) / 2) * (9.98724-(40.22588)));
            yy = -1.49469 + (((tickAnim - 8) / 2) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 8) / 2) * (-3.20379-(-3.20379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 30.02717 + (((tickAnim - 0) / 2) * (-6.22-(30.02717)));
            yy = -1.68868 + (((tickAnim - 0) / 2) * (-1.69-(-1.68868)));
            zz = -1.84373 + (((tickAnim - 0) / 2) * (-1.84-(-1.84373)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -6.22 + (((tickAnim - 2) / 1) * (-42.47283-(-6.22)));
            yy = -1.69 + (((tickAnim - 2) / 1) * (-1.68868-(-1.69)));
            zz = -1.84 + (((tickAnim - 2) / 1) * (-1.84373-(-1.84)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -42.47283 + (((tickAnim - 3) / 2) * (-29.97283-(-42.47283)));
            yy = -1.68868 + (((tickAnim - 3) / 2) * (-1.68868-(-1.68868)));
            zz = -1.84373 + (((tickAnim - 3) / 2) * (-1.84373-(-1.84373)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -29.97283 + (((tickAnim - 5) / 5) * (30.02717-(-29.97283)));
            yy = -1.68868 + (((tickAnim - 5) / 5) * (-1.68868-(-1.68868)));
            zz = -1.84373 + (((tickAnim - 5) / 5) * (-1.84373-(-1.84373)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -22.5 + (((tickAnim - 0) / 1) * (-2.92-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -2.92 + (((tickAnim - 1) / 1) * (16.02-(-2.92)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 16.02 + (((tickAnim - 2) / 1) * (23.39-(16.02)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 23.39 + (((tickAnim - 3) / 0) * (15.05-(23.39)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 15.05 + (((tickAnim - 3) / 1) * (7.8-(15.05)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 7.8 + (((tickAnim - 4) / 1) * (-10-(7.8)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (-1.25-(-10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.25 + (((tickAnim - 8) / 2) * (-22.5-(-1.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 10 + (((tickAnim - 0) / 1) * (-4.17-(10)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -4.17 + (((tickAnim - 1) / 2) * (-31.29-(-4.17)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -31.29 + (((tickAnim - 3) / 0) * (14.07-(-31.29)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 14.07 + (((tickAnim - 3) / 2) * (30-(14.07)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 30 + (((tickAnim - 5) / 2) * (3.96-(30)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 3.96 + (((tickAnim - 7) / 1) * (2.5-(3.96)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 8) / 2) * (10-(2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -17.63337 + (((tickAnim - 0) / 1) * (6.03311-(-17.63337)));
            yy = -1.27008 + (((tickAnim - 0) / 1) * (-0.48322-(-1.27008)));
            zz = 1.79262 + (((tickAnim - 0) / 1) * (2.29356-(1.79262)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 6.03311 + (((tickAnim - 1) / 2) * (77.80243-(6.03311)));
            yy = -0.48322 + (((tickAnim - 1) / 2) * (-1.30818-(-0.48322)));
            zz = 2.29356 + (((tickAnim - 1) / 2) * (1.79423-(2.29356)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 77.80243 + (((tickAnim - 3) / 0) * (40.17869-(77.80243)));
            yy = -1.30818 + (((tickAnim - 3) / 0) * (-1.81532-(-1.30818)));
            zz = 1.79423 + (((tickAnim - 3) / 0) * (0.31809-(1.79423)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 40.17869 + (((tickAnim - 3) / 2) * (9.79452-(40.17869)));
            yy = -1.81532 + (((tickAnim - 3) / 2) * (-3.1968-(-1.81532)));
            zz = 0.31809 + (((tickAnim - 3) / 2) * (1.5017-(0.31809)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 9.79452 + (((tickAnim - 5) / 2) * (13.34497-(9.79452)));
            yy = -3.1968 + (((tickAnim - 5) / 2) * (-2.48709-(-3.1968)));
            zz = 1.5017 + (((tickAnim - 5) / 2) * (-0.90778-(1.5017)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 13.34497 + (((tickAnim - 7) / 1) * (-8.49484-(13.34497)));
            yy = -2.48709 + (((tickAnim - 7) / 1) * (-1.63207-(-2.48709)));
            zz = -0.90778 + (((tickAnim - 7) / 1) * (1.79619-(-0.90778)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.49484 + (((tickAnim - 8) / 2) * (-17.63337-(-8.49484)));
            yy = -1.63207 + (((tickAnim - 8) / 2) * (-1.27008-(-1.63207)));
            zz = 1.79619 + (((tickAnim - 8) / 2) * (1.79262-(1.79619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 8) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 3) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 8) / 2) * (0-(5)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 8) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 3) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 8) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.5 + (((tickAnim - 0) / 3) * (-0.5-(0.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 3) / 2) * (0.5-(-0.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.5 + (((tickAnim - 5) / 3) * (-0.5-(0.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 8) / 2) * (0.5-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3 + (((tickAnim - 0) / 3) * (-1.5-(-3)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.5 + (((tickAnim - 3) / 2) * (-3-(-1.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (-1.5-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.5 + (((tickAnim - 8) / 2) * (-3-(-1.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (12.5-(10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 3) / 2) * (10-(12.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (12.5-(10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 12.5 + (((tickAnim - 8) / 2) * (10-(12.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTianyulong e = (EntityPrehistoricFloraTianyulong) entity;
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
