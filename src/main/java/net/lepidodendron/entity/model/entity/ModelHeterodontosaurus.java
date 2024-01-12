package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHeterodontosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraLimusaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHeterodontosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer basinfeathers_r1;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer ToesL;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer ToesR;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r33;
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
    private final AdvancedModelRenderer HeadSlopeL;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer HeadSlopeR;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer BrowL;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer BrowR;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer TeethML;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer TeethMR;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer JawSlopeL;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer JawSlopeR;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer TeethL;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer TeethR;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer CheekL;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer CheekR;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer cube_r83;

    private ModelAnimator animator;

    public ModelHeterodontosaurus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 10.25F, 4.0F);


        this.basinfeathers_r1 = new AdvancedModelRenderer(this);
        this.basinfeathers_r1.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.Hips.addChild(basinfeathers_r1);
        this.setRotateAngle(basinfeathers_r1, -0.1571F, 0.0F, 0.0F);
        this.basinfeathers_r1.cubeList.add(new ModelBox(basinfeathers_r1, 22, 49, -1.0F, -0.8F, 0.2F, 2, 1, 5, 0.0F, false));
        this.basinfeathers_r1.cubeList.add(new ModelBox(basinfeathers_r1, 40, 0, -2.0F, 0.2F, 0.2F, 4, 6, 5, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.2F, -0.7F, -1.1F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.3491F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UpperLegL.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0698F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 12, -2.1F, -0.5F, 0.3F, 3, 6, 2, -0.002F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.1F, -0.5F, -1.5F, 3, 6, 3, 0.0F, false));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.0F, 5.2F, -1.5F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, -0.3142F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.218F, 0.0396F);
        this.LowerLegL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0647F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 23, -1.6F, -0.1047F, 1.1315F, 2, 8, 1, -0.002F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 55, -1.6F, -0.1047F, -0.4685F, 2, 8, 2, -0.001F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 1.9602F, 7.3906F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.2793F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.6F, -0.2F);
        this.FootL.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.9599F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 55, -1.6F, -0.8F, -0.3F, 2, 1, 4, -0.002F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 56, -1.6F, -0.4F, -0.3F, 2, 1, 4, -0.003F, false));

        this.ToesL = new AdvancedModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 3.1F, 1.6F);
        this.FootL.addChild(ToesL);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.2F, 0.4F);
        this.ToesL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9599F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 39, -2.0F, -0.5F, -3.5F, 3, 1, 4, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-2.2F, -0.7F, -1.1F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.3491F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UpperLegR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 12, -0.9F, -0.5F, 0.3F, 3, 6, 2, -0.002F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.9F, -0.5F, -1.5F, 3, 6, 3, 0.0F, true));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(0.0F, 5.2F, -1.5F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, -0.3142F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.218F, 0.0396F);
        this.LowerLegR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.0647F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 23, -0.4F, -0.1047F, 1.1315F, 2, 8, 1, -0.002F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 55, -0.4F, -0.1047F, -0.4685F, 2, 8, 2, -0.001F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 1.9602F, 7.3906F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.2793F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.6F, -0.2F);
        this.FootR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.9599F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 55, -0.4F, -0.8F, -0.3F, 2, 1, 4, -0.003F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 56, -0.4F, -0.4F, -0.3F, 2, 1, 4, -0.003F, true));

        this.ToesR = new AdvancedModelRenderer(this);
        this.ToesR.setRotationPoint(0.0F, 3.1F, 1.6F);
        this.FootR.addChild(ToesR);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.2F, 0.4F);
        this.ToesR.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.9599F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 39, -1.0F, -0.5F, -3.5F, 3, 1, 4, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.3F, 1.9F);
        this.Hips.addChild(Tail);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.Tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 49, -0.5F, -1.2F, 0.0F, 1, 3, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.Tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 39, -1.5F, -0.1F, 0.0F, 3, 4, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 6.9F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 30, -1.0F, -0.9F, -0.4F, 2, 3, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0349F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 36, -0.5F, -3.0F, -0.4F, 1, 3, 9, -0.001F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.5F, 0.1F, 8.7F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1396F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 17, 23, -1.0F, -0.9F, -0.3F, 1, 2, 10, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 26, -0.5F, -2.7F, -0.6F, 0, 2, 10, -0.0002F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 9.8F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1571F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -1.0F, -0.7F, -0.4F, 1, 1, 13, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0349F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 15, -0.5F, -1.6F, -0.4F, 0, 1, 13, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.2F, -3.1F);
        this.Hips.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 23, 9, -2.5F, -1.6F, -5.6F, 5, 7, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.2F, -1.9F);
        this.Body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0524F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 34, -2.0F, -4.7F, -2.7F, 4, 2, 5, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 0, -1.5F, -5.0F, -3.6F, 3, 2, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.2F, -1.9F);
        this.Body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1222F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 45, -0.5F, -5.7F, -3.4F, 1, 3, 6, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.3F, -5.6F);
        this.Body.addChild(Chest);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 4.8F, -3.6F);
        this.Chest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 18, -2.0F, -5.0332F, -1.081F, 4, 5, 5, -0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.9F, -2.3F);
        this.Chest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3142F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 44, -2.0F, -2.9F, -1.6F, 4, 5, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.5F, -5.0F);
        this.Chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.6109F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 25, -0.6F, 0.8679F, 0.3172F, 1, 2, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.5F, -5.0F);
        this.Chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4887F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 41, 29, -1.0F, 0.9679F, 0.5172F, 2, 1, 4, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(2.1F, 3.9F, -3.0F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.2793F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.9F, 0.0F, 0.2F);
        this.UpperArmL.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.8901F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 59, 0, 1.4F, -0.7373F, -0.1701F, 1, 1, 4, -0.001F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 59, 6, 1.4F, -0.3373F, -0.1701F, 1, 1, 4, 0.0F, false));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(0.0F, 2.5F, 2.9F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.4102F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.2F, -0.1F);
        this.LowerArmL.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.384F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 0, -0.5F, -0.2F, -0.8F, 1, 4, 1, -0.002F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.1F, -0.4F);
        this.LowerArmL.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.384F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 43, -0.5F, -0.2F, -0.7F, 1, 4, 1, -0.003F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 3.6F, -1.9F);
        this.LowerArmL.addChild(HandL);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.3F, -0.1F, 0.0F);
        this.HandL.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.9174F, 0.078F, 0.1946F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 22, 60, 0.49F, -0.1F, -0.6F, 0, 3, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.3F, -0.1F, 0.0F);
        this.HandL.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.5683F, 0.078F, 0.1946F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 26, 36, 0.5F, -0.1F, -0.6F, 0, 4, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.3F, -0.1F, 0.1F);
        this.HandL.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3065F, 0.078F, 0.1946F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 37, 23, 0.52F, -0.1F, -0.4F, 0, 4, 1, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-2.1F, 3.9F, -3.0F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.2793F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.9F, 0.0F, 0.2F);
        this.UpperArmR.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.8901F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 59, 0, -2.4F, -0.7373F, -0.1701F, 1, 1, 4, -0.001F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 59, 6, -2.4F, -0.3373F, -0.1701F, 1, 1, 4, 0.0F, true));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(0.0F, 2.5F, 2.9F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -0.4102F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.2F, -0.1F);
        this.LowerArmR.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.384F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 0, -0.5F, -0.2F, -0.8F, 1, 4, 1, -0.002F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.1F, -0.4F);
        this.LowerArmR.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.384F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 43, -0.5F, -0.2F, -0.7F, 1, 4, 1, -0.003F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.0F, 3.6F, -1.9F);
        this.LowerArmR.addChild(HandR);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.3F, -0.1F, 0.0F);
        this.HandR.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.9174F, -0.078F, -0.1946F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 60, -0.49F, -0.1F, -0.6F, 0, 3, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.3F, -0.1F, 0.0F);
        this.HandR.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.5683F, -0.078F, -0.1946F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 36, -0.5F, -0.1F, -0.6F, 0, 4, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.3F, -0.1F, 0.1F);
        this.HandR.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3065F, -0.078F, -0.1946F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 37, 23, -0.52F, -0.1F, -0.4F, 0, 4, 1, 0.0F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.5F, -3.6F);
        this.Chest.addChild(Neck);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.2269F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 37, 51, -1.5F, -2.0F, -2.8F, 3, 4, 3, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.5F, -1.7F);
        this.Neck.addChild(Neck2);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -2.3F, -2.2F);
        this.Neck2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.6981F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 15, -1.0F, -0.7F, -0.8F, 2, 3, 4, -0.001F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 14, 19, -1.0F, -1.27F, -0.8F, 2, 3, 4, -0.002F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -2.3F, -2.2F);
        this.Neck2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.9948F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 9, 55, 0.0F, -3.27F, 0.9F, 0, 3, 1, -0.001F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -2.3F, -2.2F);
        this.Neck2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.7679F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 16, 60, 0.0F, -2.87F, 0.2F, 0, 3, 1, -0.001F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -2.3F, -2.2F);
        this.Neck2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.576F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 60, 0.0F, -2.37F, -0.6F, 0, 3, 1, -0.001F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -2.0F, -2.3F);
        this.Neck2.addChild(Neck1);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -2.1F, -1.5F);
        this.Neck1.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.2967F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 9, 60, -1.0F, -0.0374F, -1.1049F, 2, 2, 1, -0.003F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -1.1F, -1.7F);
        this.Neck1.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 14, 19, 0.0F, -1.6F, -0.1F, 0, 2, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -1.1F, -1.7F);
        this.Neck1.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1745F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 25, 9, 0.0F, -2.0F, 0.8F, 0, 2, 1, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 30, -1.0F, -1.0F, -0.1F, 2, 4, 2, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.1F, -1.9F);
        this.Neck1.addChild(Head);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.0F, -2.8F);
        this.Head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3142F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 10, -1.0F, -0.3F, -0.5F, 2, 1, 1, 0.02F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0F, 0.6F, -3.5F);
        this.Head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.7679F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 37, 0, -2.0F, -0.0379F, 0.1089F, 2, 1, 1, -0.0001F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 2.6F, -5.3F);
        this.Head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 1.5533F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 8, 23, -1.0F, -0.0324F, -0.97F, 1, 1, 1, 0.0001F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 2.6F, -5.3F);
        this.Head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.9076F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 21, 30, -1.0F, -0.0324F, 0.009F, 1, 1, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, 2.0F, -4.9F);
        this.Head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.8029F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 54, 0, -1.0F, -0.0033F, 0.2885F, 1, 1, 2, 0.001F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, 2.2F, -5.4F);
        this.Head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2269F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 14, 15, -1.5F, -0.7857F, 1.9207F, 2, 1, 2, -0.002F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 16, 9, -1.5F, -0.0857F, 1.9207F, 2, 1, 2, -0.001F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, -0.2F, -2.6F);
        this.Head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2793F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 29, 0, -1.0F, 0.0119F, -0.1313F, 2, 2, 3, 0.001F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 2.4F, -2.1F);
        this.Head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0349F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 56, 58, -1.0F, -2.0072F, -0.277F, 2, 2, 3, 0.002F, false));

        this.HeadSlopeL = new AdvancedModelRenderer(this);
        this.HeadSlopeL.setRotationPoint(0.0F, 2.2F, -4.8F);
        this.Head.addChild(HeadSlopeL);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadSlopeL.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2409F, 0.3398F, 0.0817F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 55, 55, -0.5F, -0.2207F, 0.136F, 1, 1, 1, -0.002F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 56, 42, -0.5F, -0.2207F, 0.636F, 1, 1, 1, 0.0001F, false));

        this.HeadSlopeR = new AdvancedModelRenderer(this);
        this.HeadSlopeR.setRotationPoint(0.0F, 2.2F, -4.8F);
        this.Head.addChild(HeadSlopeR);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadSlopeR.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.2409F, -0.3398F, -0.0817F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 55, 55, -0.5F, -0.2207F, 0.136F, 1, 1, 1, -0.001F, true));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 56, 42, -0.5F, -0.2207F, 0.636F, 1, 1, 1, 0.0F, true));

        this.BrowL = new AdvancedModelRenderer(this);
        this.BrowL.setRotationPoint(0.8F, 0.3F, -3.4F);
        this.Head.addChild(BrowL);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrowL.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.5887F, -0.1599F, 0.0193F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 35, 6, -0.57F, -0.0861F, -0.1191F, 1, 1, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.6F, -0.6F);
        this.BrowL.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.8807F, 0.1097F, 0.2609F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 40, 12, -0.7509F, -0.0456F, -0.123F, 1, 1, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.3F, 1.5F, -1.3F);
        this.BrowL.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.9903F, 0.3072F, 0.3199F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 50, 29, -1.04F, -0.0083F, 0.1057F, 1, 1, 1, 0.0F, false));

        this.BrowR = new AdvancedModelRenderer(this);
        this.BrowR.setRotationPoint(-0.8F, 0.3F, -3.4F);
        this.Head.addChild(BrowR);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrowR.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.5887F, 0.1599F, -0.0193F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 35, 6, -0.43F, -0.0861F, -0.1191F, 1, 1, 1, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 0.6F, -0.6F);
        this.BrowR.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.8807F, -0.1097F, -0.2609F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 40, 12, -0.2491F, -0.0456F, -0.123F, 1, 1, 1, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.3F, 1.5F, -1.3F);
        this.BrowR.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.9903F, -0.3072F, -0.3199F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 50, 29, 0.04F, -0.0083F, 0.1057F, 1, 1, 1, 0.0F, true));

        this.TeethML = new AdvancedModelRenderer(this);
        this.TeethML.setRotationPoint(0.4F, 2.8F, -3.9F);
        this.Head.addChild(TeethML);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethML.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.1792F, 0.1854F, 0.0503F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 32, 49, 0.0F, -0.9151F, -0.0165F, 0, 1, 2, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.4F, 0.2F, -0.7F);
        this.TeethML.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.2618F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 29, 0, 0.4F, -0.6F, -0.5F, 0, 1, 1, 0.0F, false));

        this.TeethMR = new AdvancedModelRenderer(this);
        this.TeethMR.setRotationPoint(-0.4F, 2.8F, -3.9F);
        this.Head.addChild(TeethMR);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethMR.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1792F, -0.1854F, -0.0503F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 32, 49, 0.0F, -0.9151F, -0.0165F, 0, 1, 2, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.4F, 0.2F, -0.7F);
        this.TeethMR.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.2618F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 29, 0, -0.4F, -0.6F, -0.5F, 0, 1, 1, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.2F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1309F, 0.0F, 0.0F);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 2.4F, -3.5F);
        this.Jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1396F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 7, 10, -0.5F, -0.9689F, -1.0264F, 1, 1, 1, -0.001F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.4189F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 49, 42, -0.5F, -0.2F, -4.2F, 1, 1, 2, -0.002F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 23, -1.0F, -0.2F, -2.2F, 2, 1, 3, 0.001F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 35, 59, -1.0F, -0.2F, -2.5F, 2, 1, 3, -0.001F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 59, 42, -1.0F, -0.7F, -2.2F, 2, 1, 3, -0.0001F, false));

        this.JawSlopeL = new AdvancedModelRenderer(this);
        this.JawSlopeL.setRotationPoint(0.0F, 1.7F, -3.7F);
        this.Jaw.addChild(JawSlopeL);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawSlopeL.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.4357F, 0.2704F, 0.1237F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 46, 12, -0.5F, -0.2481F, -0.0284F, 1, 1, 2, 0.0F, false));

        this.JawSlopeR = new AdvancedModelRenderer(this);
        this.JawSlopeR.setRotationPoint(0.0F, 1.7F, -3.7F);
        this.Jaw.addChild(JawSlopeR);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawSlopeR.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.4357F, -0.2704F, -0.1237F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 46, 12, -0.5F, -0.2481F, -0.0284F, 1, 1, 2, -0.0001F, true));

        this.TeethL = new AdvancedModelRenderer(this);
        this.TeethL.setRotationPoint(0.5F, 1.3F, -3.7F);
        this.Jaw.addChild(TeethL);


        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethL.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.4658F, 0.2192F, 0.1089F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 22, 49, -0.2F, -0.0738F, 0.0786F, 0, 1, 2, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.5F, 0.6F, 0.2F);
        this.TeethL.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.4014F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 23, 0.42F, -1.1F, -0.8F, 0, 1, 1, 0.0F, false));

        this.TeethR = new AdvancedModelRenderer(this);
        this.TeethR.setRotationPoint(-0.5F, 1.3F, -3.7F);
        this.Jaw.addChild(TeethR);


        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethR.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.4658F, -0.2192F, -0.1089F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 22, 49, 0.2F, -0.0738F, 0.0786F, 0, 1, 2, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.5F, 0.6F, 0.2F);
        this.TeethR.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.4014F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 23, -0.42F, -1.1F, -0.8F, 0, 1, 1, 0.0F, true));

        this.CheekL = new AdvancedModelRenderer(this);
        this.CheekL.setRotationPoint(0.7F, 0.3F, -2.5F);
        this.Jaw.addChild(CheekL);


        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.CheekL.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.3318F, 0.033F, 0.0114F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 51, 61, 0.22F, -1.7076F, 0.0935F, 0, 1, 2, 0.0F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.8F, -0.8F, 2.3F);
        this.CheekL.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.341F, 0.2308F, 0.081F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 51, 63, 1.48F, -1.7F, -3.3F, 0, 1, 1, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.1F, 0.5F, 0.2F);
        this.CheekL.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.3318F, 0.033F, 0.0114F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 48, 61, 0.22F, -1.7076F, 0.0935F, 0, 2, 2, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-0.8F, -0.3F, 2.5F);
        this.CheekL.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.341F, 0.2308F, 0.081F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 0, 15, 1.5F, -1.7F, -3.0F, 0, 2, 1, 0.0F, false));
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 50, 63, 1.49F, -1.7F, -3.3F, 0, 2, 1, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CheekL.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.3318F, 0.033F, 0.0114F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 37, 39, 0.1317F, -1.7076F, 0.0935F, 0, 1, 2, 0.0F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.7F, -0.8F, 2.3F);
        this.CheekL.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.341F, 0.2308F, 0.081F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 0, 1.4F, -1.7F, -3.0F, 0, 1, 1, 0.0F, false));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 10, 0, 1.41F, -1.7F, -3.3F, 0, 1, 1, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.CheekL.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.3318F, 0.033F, 0.0114F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 14, 34, 0.1317F, -1.7076F, 0.0935F, 0, 2, 2, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.7F, -0.3F, 2.5F);
        this.CheekL.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.341F, 0.2308F, 0.081F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 51, 62, 1.39F, -1.7F, -3.0F, 0, 2, 1, 0.0F, false));
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 0, 15, 1.4F, -1.7F, -3.0F, 0, 2, 1, 0.0F, false));
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 9, 15, 1.41F, -1.7F, -3.3F, 0, 2, 1, 0.0F, false));

        this.CheekR = new AdvancedModelRenderer(this);
        this.CheekR.setRotationPoint(-0.7F, 0.3F, -2.5F);
        this.Jaw.addChild(CheekR);


        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.CheekR.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.3318F, -0.033F, -0.0114F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 37, 39, -0.22F, -1.7076F, 0.0935F, 0, 1, 2, 0.0F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.8F, -0.8F, 2.3F);
        this.CheekR.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.341F, -0.2308F, -0.081F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 51, 63, -1.49F, -1.7F, -3.3F, 0, 1, 1, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.1F, 0.5F, 0.2F);
        this.CheekR.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.3318F, -0.033F, -0.0114F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 51, 62, -0.22F, -1.7076F, 0.0935F, 0, 2, 2, 0.0F, true));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.8F, -0.3F, 2.5F);
        this.CheekR.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.341F, -0.2308F, -0.081F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 0, 15, -1.5F, -1.7F, -3.0F, 0, 2, 1, 0.0F, true));
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 51, 63, -1.49F, -1.7F, -3.3F, 0, 2, 1, 0.0F, true));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CheekR.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.3318F, -0.033F, -0.0114F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 37, 39, -0.1317F, -1.7076F, 0.0935F, 0, 1, 2, 0.0F, true));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(0.7F, -0.8F, 2.3F);
        this.CheekR.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.341F, -0.2308F, -0.081F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 0, 0, -1.4F, -1.7F, -3.0F, 0, 1, 1, 0.0F, true));
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 10, 0, -1.41F, -1.7F, -3.3F, 0, 1, 1, 0.0F, true));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.CheekR.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.3318F, -0.033F, -0.0114F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 14, 34, -0.1317F, -1.7076F, 0.0935F, 0, 2, 2, 0.0F, true));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(0.7F, -0.3F, 2.5F);
        this.CheekR.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.341F, -0.2308F, -0.081F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 51, 63, -1.39F, -1.7F, -3.0F, 0, 2, 1, 0.0F, true));
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 0, 15, -1.4F, -1.7F, -3.0F, 0, 2, 1, 0.0F, true));
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 9, 15, -1.41F, -1.7F, -3.3F, 0, 2, 1, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(UpperLegR, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, 0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, -0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, -0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmR, 0.637F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmL, 0.5058F, -0.016F, 0.0406F);
        this.setRotateAngle(Jaw, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.4478F, 0.1462F, 0.0925F);
        this.setRotateAngle(HandR, 0.0F, 0.0F, 0.1745F);
        this.setRotateAngle(HandL, 0.0F, 0.0F, -0.2182F);
        this.setRotateAngle(FootR, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r83, 0.341F, -0.2308F, -0.081F);
        this.setRotateAngle(cube_r82, 0.3318F, -0.033F, -0.0114F);
        this.setRotateAngle(cube_r81, 0.341F, -0.2308F, -0.081F);
        this.setRotateAngle(cube_r80, 0.3318F, -0.033F, -0.0114F);
        this.setRotateAngle(cube_r8, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r79, 0.341F, -0.2308F, -0.081F);
        this.setRotateAngle(cube_r78, 0.3318F, -0.033F, -0.0114F);
        this.setRotateAngle(cube_r77, 0.341F, -0.2308F, -0.081F);
        this.setRotateAngle(cube_r76, 0.3318F, -0.033F, -0.0114F);
        this.setRotateAngle(cube_r75, 0.341F, 0.2308F, 0.081F);
        this.setRotateAngle(cube_r74, 0.3318F, 0.033F, 0.0114F);
        this.setRotateAngle(cube_r73, 0.341F, 0.2308F, 0.081F);
        this.setRotateAngle(cube_r72, 0.3318F, 0.033F, 0.0114F);
        this.setRotateAngle(cube_r71, 0.341F, 0.2308F, 0.081F);
        this.setRotateAngle(cube_r70, 0.3318F, 0.033F, 0.0114F);
        this.setRotateAngle(cube_r7, -0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r69, 0.341F, 0.2308F, 0.081F);
        this.setRotateAngle(cube_r68, 0.3318F, 0.033F, 0.0114F);
        this.setRotateAngle(cube_r67, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r66, 0.4658F, -0.2192F, -0.1089F);
        this.setRotateAngle(cube_r65, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r64, 0.4658F, 0.2192F, 0.1089F);
        this.setRotateAngle(cube_r63, 0.4357F, -0.2704F, -0.1237F);
        this.setRotateAngle(cube_r62, 0.4357F, 0.2704F, 0.1237F);
        this.setRotateAngle(cube_r61, 0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r60, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r59, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r58, 0.1792F, -0.1854F, -0.0503F);
        this.setRotateAngle(cube_r57, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r56, 0.1792F, 0.1854F, 0.0503F);
        this.setRotateAngle(cube_r55, 0.9903F, -0.3072F, -0.3199F);
        this.setRotateAngle(cube_r54, 0.8807F, -0.1097F, -0.2609F);
        this.setRotateAngle(cube_r53, 0.5887F, 0.1599F, -0.0193F);
        this.setRotateAngle(cube_r52, 0.9903F, 0.3072F, 0.3199F);
        this.setRotateAngle(cube_r51, 0.8807F, 0.1097F, 0.2609F);
        this.setRotateAngle(cube_r50, 0.5887F, -0.1599F, 0.0193F);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r49, 0.2409F, -0.3398F, -0.0817F);
        this.setRotateAngle(cube_r48, 0.2409F, 0.3398F, 0.0817F);
        this.setRotateAngle(cube_r47, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r46, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r45, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r44, 0.8029F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r43, 0.9076F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r42, 1.5533F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r41, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, -0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, -0.9948F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r33, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, -0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, -0.3065F, -0.078F, -0.1946F);
        this.setRotateAngle(cube_r30, -0.5683F, -0.078F, -0.1946F);
        this.setRotateAngle(cube_r3, -0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.9174F, -0.078F, -0.1946F);
        this.setRotateAngle(cube_r28, -0.384F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, -0.384F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, -0.8901F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.3065F, 0.078F, 0.1946F);
        this.setRotateAngle(cube_r24, -0.5683F, 0.078F, 0.1946F);
        this.setRotateAngle(cube_r23, -0.9174F, 0.078F, 0.1946F);
        this.setRotateAngle(cube_r22, -0.384F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, -0.384F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.8901F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(basinfeathers_r1, -0.1571F, 0.0F, 0.0F);
            this.Hips.offsetY = -0.023F;
            this.Hips.render(0.01F);
            resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        this.setRotateAngle(Hips, -0.2F, 0.0F, 0.0F);

        this.Hips.offsetY = -0.06F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(UpperLegR, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, -0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, -0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, -0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmR, -0.4102F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmL, -0.4102F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r83, 0.341F, -0.2308F, -0.081F);
        this.setRotateAngle(cube_r82, 0.3318F, -0.033F, -0.0114F);
        this.setRotateAngle(cube_r81, 0.341F, -0.2308F, -0.081F);
        this.setRotateAngle(cube_r80, 0.3318F, -0.033F, -0.0114F);
        this.setRotateAngle(cube_r8, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r79, 0.341F, -0.2308F, -0.081F);
        this.setRotateAngle(cube_r78, 0.3318F, -0.033F, -0.0114F);
        this.setRotateAngle(cube_r77, 0.341F, -0.2308F, -0.081F);
        this.setRotateAngle(cube_r76, 0.3318F, -0.033F, -0.0114F);
        this.setRotateAngle(cube_r75, 0.341F, 0.2308F, 0.081F);
        this.setRotateAngle(cube_r74, 0.3318F, 0.033F, 0.0114F);
        this.setRotateAngle(cube_r73, 0.341F, 0.2308F, 0.081F);
        this.setRotateAngle(cube_r72, 0.3318F, 0.033F, 0.0114F);
        this.setRotateAngle(cube_r71, 0.341F, 0.2308F, 0.081F);
        this.setRotateAngle(cube_r70, 0.3318F, 0.033F, 0.0114F);
        this.setRotateAngle(cube_r7, -0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r69, 0.341F, 0.2308F, 0.081F);
        this.setRotateAngle(cube_r68, 0.3318F, 0.033F, 0.0114F);
        this.setRotateAngle(cube_r67, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r66, 0.4658F, -0.2192F, -0.1089F);
        this.setRotateAngle(cube_r65, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r64, 0.4658F, 0.2192F, 0.1089F);
        this.setRotateAngle(cube_r63, 0.4357F, -0.2704F, -0.1237F);
        this.setRotateAngle(cube_r62, 0.4357F, 0.2704F, 0.1237F);
        this.setRotateAngle(cube_r61, 0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r60, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r59, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r58, 0.1792F, -0.1854F, -0.0503F);
        this.setRotateAngle(cube_r57, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r56, 0.1792F, 0.1854F, 0.0503F);
        this.setRotateAngle(cube_r55, 0.9903F, -0.3072F, -0.3199F);
        this.setRotateAngle(cube_r54, 0.8807F, -0.1097F, -0.2609F);
        this.setRotateAngle(cube_r53, 0.5887F, 0.1599F, -0.0193F);
        this.setRotateAngle(cube_r52, 0.9903F, 0.3072F, 0.3199F);
        this.setRotateAngle(cube_r51, 0.8807F, 0.1097F, 0.2609F);
        this.setRotateAngle(cube_r50, 0.5887F, -0.1599F, 0.0193F);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r49, 0.2409F, -0.3398F, -0.0817F);
        this.setRotateAngle(cube_r48, 0.2409F, 0.3398F, 0.0817F);
        this.setRotateAngle(cube_r47, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r46, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r45, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r44, 0.8029F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r43, 0.9076F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r42, 1.5533F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r41, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, -0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, -0.9948F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r33, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, -0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, -0.3065F, -0.078F, -0.1946F);
        this.setRotateAngle(cube_r30, -0.5683F, -0.078F, -0.1946F);
        this.setRotateAngle(cube_r3, -0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.9174F, -0.078F, -0.1946F);
        this.setRotateAngle(cube_r28, -0.384F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, -0.384F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, -0.8901F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.3065F, 0.078F, 0.1946F);
        this.setRotateAngle(cube_r24, -0.5683F, 0.078F, 0.1946F);
        this.setRotateAngle(cube_r23, -0.9174F, 0.078F, 0.1946F);
        this.setRotateAngle(cube_r22, -0.384F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, -0.384F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.8901F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 1.0647F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(basinfeathers_r1, -0.1571F, 0.0F, 0.0F);
        this.Neck.offsetY = -0.01F;
        this.Neck.offsetZ = -0.055F;
        this.Neck.render(0.01F);
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

        EntityPrehistoricFloraHeterodontosaurus EntityKul = (EntityPrehistoricFloraHeterodontosaurus) e;

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck1);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Neck2, this.Neck1, this.Head};
        AdvancedModelRenderer[] ArmL = {this.UpperArmL, this.LowerArmL, this.HandL};
        AdvancedModelRenderer[] ArmR = {this.UpperArmR, this.LowerArmR, this.HandR};

        EntityKul.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityKul.getAnimation() == EntityKul.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityKul.isReallyInWater()) {

                if (f3 == 0.0F || !EntityKul.getIsMoving()) {
                    if (EntityKul.getAnimation() != EntityKul.EAT_ANIMATION
                        && EntityKul.getAnimation() != EntityKul.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.UpperArmL, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.UpperArmR, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.LowerArmL, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.LowerArmR, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityKul.getIsFast()) { //Running


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
        EntityPrehistoricFloraHeterodontosaurus ee = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    if (ee.getIsHopping()) {
                        animHop(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                        //animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //animHop(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DIG_ANIMATION) {
            animDig(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.CHATTER_ANIMATION) {
            animAlarm(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }

    public void animAlarm(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLimusaurus entity = (EntityPrehistoricFloraLimusaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 11) / 9) * (0-(-10)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 8) / 12) * (0-(-10)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 10) / 10) * (0-(17.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 10) / 10) * (0-(17.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 6) / 14) * (0-(-5)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 4) / 16) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 4) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 3) / 17) * (0-(-5)));
            yy = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 1) / 19) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 1) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 19) * (0-(0)));
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
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 20 + (((tickAnim - 1) / 1) * (20-(20)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 2) / 1) * (20-(20)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 20 + (((tickAnim - 3) / 1) * (20-(20)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 20 + (((tickAnim - 4) / 2) * (20-(20)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 20 + (((tickAnim - 6) / 1) * (15-(20)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 7) / 1) * (20-(15)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20 + (((tickAnim - 8) / 1) * (15-(20)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 15 + (((tickAnim - 9) / 2) * (20-(15)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 11) / 2) * (20-(20)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 13) / 0) * (15-(20)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 15 + (((tickAnim - 13) / 1) * (20-(15)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 14) / 1) * (20-(20)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 20 + (((tickAnim - 15) / 1) * (20-(20)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 20 + (((tickAnim - 16) / 1) * (20-(20)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 17) / 1) * (12.5-(20)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 12.5 + (((tickAnim - 18) / 0) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 12.5 + (((tickAnim - 18) / 1) * (10-(12.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 19) / 1) * (0-(10)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHeterodontosaurus entity = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -10.5 + (((tickAnim - 4) / 3) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = -10.5 + (((tickAnim - 7) / 19) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 7) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 19) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -10.5 + (((tickAnim - 26) / 8) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 7) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 19) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 10.5 + (((tickAnim - 4) / 3) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 10.5 + (((tickAnim - 7) / 19) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 7) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 19) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 10.5 + (((tickAnim - 26) / 8) * (0-(10.5)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 10.5 + (((tickAnim - 4) / 3) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 10.5 + (((tickAnim - 7) / 19) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 7) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 19) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 10.5 + (((tickAnim - 26) / 8) * (0-(10.5)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -6.5 + (((tickAnim - 4) / 3) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = -6.5 + (((tickAnim - 7) / 19) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 7) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 19) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -6.5 + (((tickAnim - 26) / 8) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (-9.50896-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (6.24785-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (-0.16426-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 56) {
            xx = -9.50896 + (((tickAnim - 39) / 17) * (-9.50896-(-9.50896)));
            yy = 6.24785 + (((tickAnim - 39) / 17) * (6.24785-(6.24785)));
            zz = -0.16426 + (((tickAnim - 39) / 17) * (-0.16426-(-0.16426)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -9.50896 + (((tickAnim - 56) / 4) * (0-(-9.50896)));
            yy = 6.24785 + (((tickAnim - 56) / 4) * (0-(6.24785)));
            zz = -0.16426 + (((tickAnim - 56) / 4) * (0-(-0.16426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 4.75 + (((tickAnim - 4) / 3) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 4.75 + (((tickAnim - 7) / 19) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 7) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 19) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 4.75 + (((tickAnim - 26) / 4) * (-2.75-(4.75)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -2.75 + (((tickAnim - 30) / 4) * (4.75-(-2.75)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 4.75 + (((tickAnim - 34) / 5) * (3.21152-(4.75)));
            yy = 0 + (((tickAnim - 34) / 5) * (13.63793-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (1.76877-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 56) {
            xx = 3.21152 + (((tickAnim - 39) / 17) * (3.21152-(3.21152)));
            yy = 13.63793 + (((tickAnim - 39) / 17) * (13.63793-(13.63793)));
            zz = 1.76877 + (((tickAnim - 39) / 17) * (1.76877-(1.76877)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 3.21152 + (((tickAnim - 56) / 4) * (0-(3.21152)));
            yy = 13.63793 + (((tickAnim - 56) / 4) * (0-(13.63793)));
            zz = 1.76877 + (((tickAnim - 56) / 4) * (0-(1.76877)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 3) / 2) * (0-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 7) / 16) * (0.19437-(0)));
            yy = 0 + (((tickAnim - 7) / 16) * (1.99885-(0)));
            zz = 0 + (((tickAnim - 7) / 16) * (-10.8523-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0.19437 + (((tickAnim - 23) / 3) * (0-(0.19437)));
            yy = 1.99885 + (((tickAnim - 23) / 3) * (0-(1.99885)));
            zz = -10.8523 + (((tickAnim - 23) / 3) * (0-(-10.8523)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.75 + (((tickAnim - 3) / 2) * (0-(17.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 5) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 21) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 3) / 2) * (0-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 7) / 16) * (-1.43253-(0)));
            yy = 0 + (((tickAnim - 7) / 16) * (0.90537-(0)));
            zz = 0 + (((tickAnim - 7) / 16) * (-7.10728-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -1.43253 + (((tickAnim - 23) / 3) * (0-(-1.43253)));
            yy = 0.90537 + (((tickAnim - 23) / 3) * (0-(0.90537)));
            zz = -7.10728 + (((tickAnim - 23) / 3) * (0-(-7.10728)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.75 + (((tickAnim - 3) / 2) * (0-(17.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 5) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 21) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (6.13-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 6.13 + (((tickAnim - 2) / 2) * (10.25-(6.13)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 10.25 + (((tickAnim - 4) / 4) * (13.03404-(10.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (-29.43323-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-8.89663-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 13.03404 + (((tickAnim - 8) / 15) * (13.03404-(13.03404)));
            yy = -29.43323 + (((tickAnim - 8) / 15) * (-29.43323-(-29.43323)));
            zz = -8.89663 + (((tickAnim - 8) / 15) * (-8.89663-(-8.89663)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 13.03404 + (((tickAnim - 23) / 3) * (0-(13.03404)));
            yy = -29.43323 + (((tickAnim - 23) / 3) * (0-(-29.43323)));
            zz = -8.89663 + (((tickAnim - 23) / 3) * (0-(-8.89663)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (10.04627-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (13.39005-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (-1.7354-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 56) {
            xx = 10.04627 + (((tickAnim - 39) / 17) * (10.04627-(10.04627)));
            yy = 13.39005 + (((tickAnim - 39) / 17) * (13.39005-(13.39005)));
            zz = -1.7354 + (((tickAnim - 39) / 17) * (-1.7354-(-1.7354)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 10.04627 + (((tickAnim - 56) / 4) * (0-(10.04627)));
            yy = 13.39005 + (((tickAnim - 56) / 4) * (0-(13.39005)));
            zz = -1.7354 + (((tickAnim - 56) / 4) * (0-(-1.7354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-2.2054-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (-12.23441-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-0.37893-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 23) {
            xx = -2.2054 + (((tickAnim - 6) / 17) * (-2.2054-(-2.2054)));
            yy = -12.23441 + (((tickAnim - 6) / 17) * (-12.23441-(-12.23441)));
            zz = -0.37893 + (((tickAnim - 6) / 17) * (-0.37893-(-0.37893)));
        }
        else if (tickAnim >= 23 && tickAnim < 39) {
            xx = -2.2054 + (((tickAnim - 23) / 16) * (-7.80262-(-2.2054)));
            yy = -12.23441 + (((tickAnim - 23) / 16) * (15.16107-(-12.23441)));
            zz = -0.37893 + (((tickAnim - 23) / 16) * (0.75863-(-0.37893)));
        }
        else if (tickAnim >= 39 && tickAnim < 56) {
            xx = -7.80262 + (((tickAnim - 39) / 17) * (-7.80262-(-7.80262)));
            yy = 15.16107 + (((tickAnim - 39) / 17) * (15.16107-(15.16107)));
            zz = 0.75863 + (((tickAnim - 39) / 17) * (0.75863-(0.75863)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -7.80262 + (((tickAnim - 56) / 4) * (0-(-7.80262)));
            yy = 15.16107 + (((tickAnim - 56) / 4) * (0-(15.16107)));
            zz = 0.75863 + (((tickAnim - 56) / 4) * (0-(0.75863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7.75 + (((tickAnim - 2) / 1) * (16-(-7.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 16 + (((tickAnim - 3) / 1) * (16-(16)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 16 + (((tickAnim - 4) / 2) * (-8.39882-(16)));
            yy = 0 + (((tickAnim - 4) / 2) * (-17.15171-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.40098-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -8.39882 + (((tickAnim - 6) / 5) * (-8.39882-(-8.39882)));
            yy = -17.15171 + (((tickAnim - 6) / 5) * (-17.15171-(-17.15171)));
            zz = 0.40098 + (((tickAnim - 6) / 5) * (0.40098-(0.40098)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -8.39882 + (((tickAnim - 11) / 2) * (-2.69093-(-8.39882)));
            yy = -17.15171 + (((tickAnim - 11) / 2) * (-18.85791-(-17.15171)));
            zz = 0.40098 + (((tickAnim - 11) / 2) * (-17.92087-(0.40098)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.69093 + (((tickAnim - 13) / 7) * (-2.69093-(-2.69093)));
            yy = -18.85791 + (((tickAnim - 13) / 7) * (-18.85791-(-18.85791)));
            zz = -17.92087 + (((tickAnim - 13) / 7) * (-17.92087-(-17.92087)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2.69093 + (((tickAnim - 20) / 3) * (-8.39882-(-2.69093)));
            yy = -18.85791 + (((tickAnim - 20) / 3) * (-17.15171-(-18.85791)));
            zz = -17.92087 + (((tickAnim - 20) / 3) * (0.40098-(-17.92087)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -8.39882 + (((tickAnim - 23) / 3) * (0-(-8.39882)));
            yy = -17.15171 + (((tickAnim - 23) / 3) * (0-(-17.15171)));
            zz = 0.40098 + (((tickAnim - 23) / 3) * (0-(0.40098)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (-18.2506-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (1.05176-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (6.55-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = -18.2506 + (((tickAnim - 37) / 2) * (5.47179-(-18.2506)));
            yy = 1.05176 + (((tickAnim - 37) / 2) * (3.97288-(1.05176)));
            zz = 6.55 + (((tickAnim - 37) / 2) * (12.50512-(6.55)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 5.47179 + (((tickAnim - 39) / 7) * (5.47179-(5.47179)));
            yy = 3.97288 + (((tickAnim - 39) / 7) * (3.97288-(3.97288)));
            zz = 12.50512 + (((tickAnim - 39) / 7) * (12.50512-(12.50512)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 5.47179 + (((tickAnim - 46) / 3) * (3.12468-(5.47179)));
            yy = 3.97288 + (((tickAnim - 46) / 3) * (14.93007-(3.97288)));
            zz = 12.50512 + (((tickAnim - 46) / 3) * (-1.03809-(12.50512)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 3.12468 + (((tickAnim - 49) / 7) * (3.12468-(3.12468)));
            yy = 14.93007 + (((tickAnim - 49) / 7) * (14.93007-(14.93007)));
            zz = -1.03809 + (((tickAnim - 49) / 7) * (-1.03809-(-1.03809)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 3.12468 + (((tickAnim - 56) / 4) * (0-(3.12468)));
            yy = 14.93007 + (((tickAnim - 56) / 4) * (0-(14.93007)));
            zz = -1.03809 + (((tickAnim - 56) / 4) * (0-(-1.03809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animDig(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHeterodontosaurus entity = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2.97-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2.97 + (((tickAnim - 8) / 9) * (5-(-2.97)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 39) {
            xx = 5 + (((tickAnim - 17) / 22) * (5-(5)));
            yy = 0 + (((tickAnim - 17) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 22) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 39) / 11) * (0-(5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 2.5 + (((tickAnim - 8) / 9) * (-5.68-(2.5)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 39) {
            xx = -5.68 + (((tickAnim - 17) / 22) * (-5.68-(-5.68)));
            yy = 0 + (((tickAnim - 17) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 22) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -5.68 + (((tickAnim - 39) / 11) * (0-(-5.68)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 2.5 + (((tickAnim - 8) / 9) * (-5.68-(2.5)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 39) {
            xx = -5.68 + (((tickAnim - 17) / 22) * (-5.68-(-5.68)));
            yy = 0 + (((tickAnim - 17) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 22) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -5.68 + (((tickAnim - 39) / 11) * (0-(-5.68)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 32) {
            xx = -7.5 + (((tickAnim - 11) / 21) * (-10.52-(-7.5)));
            yy = 0 + (((tickAnim - 11) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 21) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -10.52 + (((tickAnim - 32) / 18) * (0-(-10.52)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 13) / 22) * (-6.74-(2.5)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.74 + (((tickAnim - 35) / 15) * (0-(-6.74)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 37) {
            xx = 12.5 + (((tickAnim - 17) / 20) * (-3.96-(12.5)));
            yy = 0 + (((tickAnim - 17) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 20) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -3.96 + (((tickAnim - 37) / 13) * (0-(-3.96)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 39) {
            xx = 15 + (((tickAnim - 19) / 20) * (-4.1-(15)));
            yy = 0 + (((tickAnim - 19) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 20) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -4.1 + (((tickAnim - 39) / 11) * (0-(-4.1)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 9) / 9) * (5-(-10)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 18) / 15) * (0.17-(5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.17 + (((tickAnim - 33) / 17) * (0-(0.17)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 5 + (((tickAnim - 9) / 8) * (7.5-(5)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 17) / 6) * (12.08-(7.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 12.08 + (((tickAnim - 23) / 27) * (0-(12.08)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -52.5 + (((tickAnim - 22) / 1) * (-38.21727-(-52.5)));
            yy = 0 + (((tickAnim - 22) / 1) * (-12.31489-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (-27.573-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -38.21727 + (((tickAnim - 23) / 3) * (-52.5-(-38.21727)));
            yy = -12.31489 + (((tickAnim - 23) / 3) * (0-(-12.31489)));
            zz = -27.573 + (((tickAnim - 23) / 3) * (0-(-27.573)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -52.5 + (((tickAnim - 26) / 4) * (-38.21727-(-52.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (-12.31489-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (-27.573-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -38.21727 + (((tickAnim - 30) / 20) * (0-(-38.21727)));
            yy = -12.31489 + (((tickAnim - 30) / 20) * (0-(-12.31489)));
            zz = -27.573 + (((tickAnim - 30) / 20) * (0-(-27.573)));
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
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (15-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 15 + (((tickAnim - 22) / 3) * (1.79-(15)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 1.79 + (((tickAnim - 25) / 3) * (26.22-(1.79)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 26.22 + (((tickAnim - 28) / 22) * (0-(26.22)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-26.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = -26.25 + (((tickAnim - 18) / 5) * (12.5-(-26.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 12.5 + (((tickAnim - 23) / 2) * (13.64-(12.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 13.64 + (((tickAnim - 25) / 3) * (0-(13.64)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (7.18-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 7.18 + (((tickAnim - 34) / 16) * (0-(7.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (27.5-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 27.5 + (((tickAnim - 6) / 4) * (27.5-(27.5)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 27.5 + (((tickAnim - 10) / 8) * (0-(27.5)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 23) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (37.5-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 37.5 + (((tickAnim - 33) / 5) * (35-(37.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 35 + (((tickAnim - 38) / 4) * (35-(35)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 35 + (((tickAnim - 42) / 1) * (32.05-(35)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 32.05 + (((tickAnim - 43) / 7) * (0-(32.05)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -5 + (((tickAnim - 5) / 4) * (-5-(-5)));
            yy = 15 + (((tickAnim - 5) / 4) * (15-(15)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 9) / 9) * (0-(-5)));
            yy = 15 + (((tickAnim - 9) / 9) * (0-(15)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (35.29-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 35.29 + (((tickAnim - 33) / 5) * (35.29-(35.29)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 35.29 + (((tickAnim - 38) / 4) * (36.57-(35.29)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 36.57 + (((tickAnim - 42) / 3) * (7.45-(36.57)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 7.45 + (((tickAnim - 45) / 5) * (0-(7.45)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (25-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 6) / 4) * (-12.5-(-12.5)));
            yy = 25 + (((tickAnim - 6) / 4) * (25-(25)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 10) / 8) * (0-(-12.5)));
            yy = 25 + (((tickAnim - 10) / 8) * (0-(25)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 7.5 + (((tickAnim - 22) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 28) / 13) * (2.5-(0)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 2.5 + (((tickAnim - 41) / 4) * (-18.65-(2.5)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -18.65 + (((tickAnim - 45) / 5) * (0-(-18.65)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (12.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 12.5 + (((tickAnim - 8) / 2) * (0-(12.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -5 + (((tickAnim - 33) / 4) * (-15-(-5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -15 + (((tickAnim - 37) / 4) * (20.5-(-15)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 20.5 + (((tickAnim - 41) / 2) * (-5-(20.5)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 43) / 7) * (0-(-5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
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
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (22.5-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 22.5 + (((tickAnim - 37) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
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
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -52.5 + (((tickAnim - 11) / 4) * (-38.21727-(-52.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (12.31489-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (27.573-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -38.21727 + (((tickAnim - 15) / 2) * (-40.49212-(-38.21727)));
            yy = 12.31489 + (((tickAnim - 15) / 2) * (-6.33861-(12.31489)));
            zz = 27.573 + (((tickAnim - 15) / 2) * (-13.62287-(27.573)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -40.49212 + (((tickAnim - 17) / 2) * (-38.21727-(-40.49212)));
            yy = -6.33861 + (((tickAnim - 17) / 2) * (12.31489-(-6.33861)));
            zz = -13.62287 + (((tickAnim - 17) / 2) * (27.573-(-13.62287)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -38.21727 + (((tickAnim - 19) / 4) * (-40.49212-(-38.21727)));
            yy = 12.31489 + (((tickAnim - 19) / 4) * (-6.33861-(12.31489)));
            zz = 27.573 + (((tickAnim - 19) / 4) * (-13.62287-(27.573)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -40.49212 + (((tickAnim - 23) / 27) * (0-(-40.49212)));
            yy = -6.33861 + (((tickAnim - 23) / 27) * (0-(-6.33861)));
            zz = -13.62287 + (((tickAnim - 23) / 27) * (0-(-13.62287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 14) / 4) * (1.79-(15)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 1.79 + (((tickAnim - 18) / 4) * (26.22-(1.79)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 50) {
            xx = 26.22 + (((tickAnim - 22) / 28) * (0-(26.22)));
            yy = 0 + (((tickAnim - 22) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-26.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = -26.25 + (((tickAnim - 13) / 3) * (12.5-(-26.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 12.5 + (((tickAnim - 16) / 2) * (13.64-(12.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 13.64 + (((tickAnim - 18) / 4) * (0-(13.64)));
        }
        else if (tickAnim >= 22 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 22) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHeterodontosaurus entity = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 3) / 7) * (0-(-5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 4) / 6) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 5) / 5) * (0-(15)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 6) / 4) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (20-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 20 + (((tickAnim - 5) / 1) * (15-(20)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 15 + (((tickAnim - 6) / 1) * (20-(15)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 7) / 1) * (0-(20)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHeterodontosaurus entity = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

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
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-1-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -2 + (((tickAnim - 14) / 4) * (-2.5-(-2)));
            zz = -1 + (((tickAnim - 14) / 4) * (-1.3-(-1)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -2.5 + (((tickAnim - 18) / 13) * (-2.3-(-2.5)));
            zz = -1.3 + (((tickAnim - 18) / 13) * (-1.35-(-1.3)));
        }
        else if (tickAnim >= 31 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 31) / 10) * (0-(0)));
            yy = -2.3 + (((tickAnim - 31) / 10) * (-1.3-(-2.3)));
            zz = -1.35 + (((tickAnim - 31) / 10) * (-0.75-(-1.35)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = -1.3 + (((tickAnim - 41) / 9) * (0-(-1.3)));
            zz = -0.75 + (((tickAnim - 41) / 9) * (0-(-0.75)));
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

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHeterodontosaurus entity = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.97-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -2.97 + (((tickAnim - 7) / 11) * (5-(-2.97)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 5 + (((tickAnim - 18) / 21) * (5-(5)));
            yy = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 39) / 11) * (0-(5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 7) / 11) * (-5.68-(2.5)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = -5.68 + (((tickAnim - 18) / 21) * (-5.68-(-5.68)));
            yy = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -5.68 + (((tickAnim - 39) / 11) * (0-(-5.68)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 7) / 11) * (-5.68-(2.5)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = -5.68 + (((tickAnim - 18) / 21) * (-5.68-(-5.68)));
            yy = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -5.68 + (((tickAnim - 39) / 11) * (0-(-5.68)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 32) {
            xx = -7.5 + (((tickAnim - 11) / 21) * (-10.52-(-7.5)));
            yy = 0 + (((tickAnim - 11) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 21) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -10.52 + (((tickAnim - 32) / 18) * (0-(-10.52)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 13) / 22) * (-6.74-(2.5)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.74 + (((tickAnim - 35) / 15) * (0-(-6.74)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = 12.5 + (((tickAnim - 18) / 19) * (-3.96-(12.5)));
            yy = 0 + (((tickAnim - 18) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 19) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -3.96 + (((tickAnim - 37) / 13) * (0-(-3.96)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 39) {
            xx = 15 + (((tickAnim - 21) / 18) * (-4.1-(15)));
            yy = 0 + (((tickAnim - 21) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 18) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -4.1 + (((tickAnim - 39) / 11) * (0-(-4.1)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -10 + (((tickAnim - 9) / 10) * (5-(-10)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 36) {
            xx = 5 + (((tickAnim - 19) / 17) * (0.17-(5)));
            yy = 0 + (((tickAnim - 19) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 17) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0.17 + (((tickAnim - 36) / 14) * (0-(0.17)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 9) / 9) * (7.5-(5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 18) / 2) * (12.08-(7.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 12.08 + (((tickAnim - 20) / 23) * (12.08-(12.08)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 23) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 12.08 + (((tickAnim - 43) / 7) * (0-(12.08)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = -52.5 + (((tickAnim - 19) / 7) * (-38.21727-(-52.5)));
            yy = 0 + (((tickAnim - 19) / 7) * (-12.31489-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (-27.573-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -38.21727 + (((tickAnim - 26) / 5) * (-52.5-(-38.21727)));
            yy = -12.31489 + (((tickAnim - 26) / 5) * (0-(-12.31489)));
            zz = -27.573 + (((tickAnim - 26) / 5) * (0-(-27.573)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = -52.5 + (((tickAnim - 31) / 5) * (-38.21727-(-52.5)));
            yy = 0 + (((tickAnim - 31) / 5) * (-12.31489-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (-27.573-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -38.21727 + (((tickAnim - 36) / 14) * (0-(-38.21727)));
            yy = -12.31489 + (((tickAnim - 36) / 14) * (0-(-12.31489)));
            zz = -27.573 + (((tickAnim - 36) / 14) * (0-(-27.573)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (15-(0)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 19) / 9) * (1.79-(15)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 1.79 + (((tickAnim - 28) / 4) * (26.22-(1.79)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 26.22 + (((tickAnim - 32) / 18) * (0-(26.22)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (-26.25-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = -26.25 + (((tickAnim - 17) / 6) * (12.5-(-26.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 12.5 + (((tickAnim - 23) / 7) * (13.64-(12.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 13.64 + (((tickAnim - 30) / 2) * (0-(13.64)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 4) * (-35-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 36) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 11) * (0-(0)));
            zz = -35 + (((tickAnim - 36) / 11) * (7.18-(-35)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 7.18 + (((tickAnim - 47) / 3) * (0-(7.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (27.5-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 27.5 + (((tickAnim - 6) / 5) * (27.5-(27.5)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 27.5 + (((tickAnim - 11) / 7) * (0-(27.5)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (15-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -5 + (((tickAnim - 4) / 5) * (-5-(-5)));
            yy = 15 + (((tickAnim - 4) / 5) * (15-(15)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 9) / 9) * (0-(-5)));
            yy = 15 + (((tickAnim - 9) / 9) * (0-(15)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 5) / 5) * (-12.5-(-12.5)));
            yy = 25 + (((tickAnim - 5) / 5) * (25-(25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 10) / 8) * (0-(-12.5)));
            yy = 25 + (((tickAnim - 10) / 8) * (0-(25)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (12.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 12.5 + (((tickAnim - 8) / 3) * (0-(12.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
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
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -52.5 + (((tickAnim - 13) / 8) * (-38.21727-(-52.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (12.31489-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (27.573-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -38.21727 + (((tickAnim - 21) / 5) * (-40.49212-(-38.21727)));
            yy = 12.31489 + (((tickAnim - 21) / 5) * (-6.33861-(12.31489)));
            zz = 27.573 + (((tickAnim - 21) / 5) * (-13.62287-(27.573)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -40.49212 + (((tickAnim - 26) / 6) * (-38.21727-(-40.49212)));
            yy = -6.33861 + (((tickAnim - 26) / 6) * (12.31489-(-6.33861)));
            zz = -13.62287 + (((tickAnim - 26) / 6) * (27.573-(-13.62287)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -38.21727 + (((tickAnim - 32) / 6) * (-40.49212-(-38.21727)));
            yy = 12.31489 + (((tickAnim - 32) / 6) * (-6.33861-(12.31489)));
            zz = 27.573 + (((tickAnim - 32) / 6) * (-13.62287-(27.573)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -40.49212 + (((tickAnim - 38) / 12) * (0-(-40.49212)));
            yy = -6.33861 + (((tickAnim - 38) / 12) * (0-(-6.33861)));
            zz = -13.62287 + (((tickAnim - 38) / 12) * (0-(-13.62287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (15-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 18) / 10) * (1.79-(15)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 1.79 + (((tickAnim - 28) / 4) * (26.22-(1.79)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 26.22 + (((tickAnim - 32) / 18) * (0-(26.22)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-26.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = -26.25 + (((tickAnim - 15) / 8) * (12.5-(-26.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 12.5 + (((tickAnim - 23) / 5) * (13.64-(12.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 13.64 + (((tickAnim - 28) / 4) * (0-(13.64)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (-35-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -35 + (((tickAnim - 33) / 17) * (0-(-35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHeterodontosaurus entity = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

        int animCycle = 17;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
            xx = 0 + (((tickAnim - 0) / 8) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -12.5 + (((tickAnim - 8) / 4) * (-4.03-(-12.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -4.03 + (((tickAnim - 12) / 6) * (0-(-4.03)));
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
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHeterodontosaurus entity = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 11) / 15) * (1-(1)));
            yy = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 26) / 4) * (0-(1)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-1-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            yy = 0.25 + (((tickAnim - 11) / 15) * (0.25-(0.25)));
            zz = -1 + (((tickAnim - 11) / 15) * (-1-(-1)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 26) / 4) * (0-(0.25)));
            zz = -1 + (((tickAnim - 26) / 4) * (0-(-1)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -33.75 + (((tickAnim - 3) / 10) * (-7.5-(-33.75)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 13) / 10) * (-7.29-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -7.29 + (((tickAnim - 23) / 4) * (-33.75-(-7.29)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -33.75 + (((tickAnim - 27) / 2) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 3) / 10) * (-10-(12.5)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 13) / 10) * (-10-(-10)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 23) / 3) * (12.5-(-10)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 12.5 + (((tickAnim - 26) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 3) / 10) * (0-(12.5)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 12.5 + (((tickAnim - 28) / 0) * (0-(12.5)));
            yy = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 17.5 + (((tickAnim - 13) / 10) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 17.5 + (((tickAnim - 23) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 13) / 10) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 23) / 7) * (0-(7.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 13) / 10) * (-5-(-5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 23) / 7) * (0-(-5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 13) / 10) * (-5-(-5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 23) / 7) * (0-(-5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.22-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 7.22 + (((tickAnim - 10) / 3) * (5-(7.22)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 5 + (((tickAnim - 13) / 6) * (-2.5-(5)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -2.5 + (((tickAnim - 19) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -10 + (((tickAnim - 12) / 4) * (-10-(-10)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10 + (((tickAnim - 16) / 3) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 19) / 11) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 11) / 5) * (5-(2.5)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 16) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 7.5 + (((tickAnim - 13) / 6) * (10-(7.5)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 10 + (((tickAnim - 19) / 3) * (10-(10)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 10 + (((tickAnim - 22) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10.0043-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (17.24981-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.99445-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -10.0043 + (((tickAnim - 5) / 6) * (10-(-10.0043)));
            yy = 17.24981 + (((tickAnim - 5) / 6) * (0-(17.24981)));
            zz = -2.99445 + (((tickAnim - 5) / 6) * (0-(-2.99445)));
        }
        else if (tickAnim >= 11 && tickAnim < 29) {
            xx = 10 + (((tickAnim - 11) / 18) * (0-(10)));
            yy = 0 + (((tickAnim - 11) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = -30 + (((tickAnim - 11) / 17) * (-30-(-30)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -30 + (((tickAnim - 28) / 1) * (0-(-30)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 17.5 + (((tickAnim - 11) / 17) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 17.5 + (((tickAnim - 28) / 1) * (0-(17.5)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = -30 + (((tickAnim - 11) / 17) * (-30-(-30)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -30 + (((tickAnim - 28) / 1) * (0-(-30)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 17.5 + (((tickAnim - 11) / 17) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 17.5 + (((tickAnim - 28) / 1) * (0-(17.5)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.76795-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (12.57189-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.16515-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0.76795 + (((tickAnim - 5) / 6) * (15-(0.76795)));
            yy = 12.57189 + (((tickAnim - 5) / 6) * (0-(12.57189)));
            zz = 1.16515 + (((tickAnim - 5) / 6) * (0-(1.16515)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 11) / 2) * (18.04-(15)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 18.04 + (((tickAnim - 13) / 5) * (2.5-(18.04)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 2.5 + (((tickAnim - 18) / 8) * (15-(2.5)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 15 + (((tickAnim - 26) / 3) * (0-(15)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9.93743-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (28.36466-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.96884-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 9.93743 + (((tickAnim - 5) / 6) * (22.5-(9.93743)));
            yy = 28.36466 + (((tickAnim - 5) / 6) * (0-(28.36466)));
            zz = -1.96884 + (((tickAnim - 5) / 6) * (0-(-1.96884)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 11) / 2) * (25-(22.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 25 + (((tickAnim - 13) / 2) * (0-(25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-4.62-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = -4.62 + (((tickAnim - 19) / 7) * (-4.62-(-4.62)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -4.62 + (((tickAnim - 26) / 3) * (0-(-4.62)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-18.79018-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (19.01253-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-6.32488-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -18.79018 + (((tickAnim - 5) / 6) * (-5-(-18.79018)));
            yy = 19.01253 + (((tickAnim - 5) / 6) * (0-(19.01253)));
            zz = -6.32488 + (((tickAnim - 5) / 6) * (0-(-6.32488)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -5 + (((tickAnim - 11) / 1) * (-30.71-(-5)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -30.71 + (((tickAnim - 12) / 4) * (20-(-30.71)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 20 + (((tickAnim - 16) / 8) * (27.5-(20)));
            yy = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 27.5 + (((tickAnim - 24) / 4) * (0-(27.5)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.83-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -0.83 + (((tickAnim - 11) / 1) * (5.84-(-0.83)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 5.84 + (((tickAnim - 12) / 1) * (20-(5.84)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 20 + (((tickAnim - 13) / 3) * (-29.16-(20)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -29.16 + (((tickAnim - 16) / 2) * (-14.64889-(-29.16)));
            yy = 0 + (((tickAnim - 16) / 2) * (-24.49736-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0.99294-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -14.64889 + (((tickAnim - 18) / 3) * (-4.88202-(-14.64889)));
            yy = -24.49736 + (((tickAnim - 18) / 3) * (28.13663-(-24.49736)));
            zz = 0.99294 + (((tickAnim - 18) / 3) * (24.27449-(0.99294)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = -4.88202 + (((tickAnim - 21) / 8) * (0-(-4.88202)));
            yy = 28.13663 + (((tickAnim - 21) / 8) * (0-(28.13663)));
            zz = 24.27449 + (((tickAnim - 21) / 8) * (0-(24.27449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (20-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 12) / 1) * (20-(20)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 13) / 0) * (0-(20)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (20-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 20 + (((tickAnim - 25) / 1) * (0-(20)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHeterodontosaurus entity = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.75-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 2) * (0.25-(0.5)));
            zz = -0.75 + (((tickAnim - 3) / 2) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 5) * (0-(0.25)));
            zz = -0.75 + (((tickAnim - 5) / 5) * (0-(-0.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 13) / 2) * (0.25-(0.5)));
            zz = -0.75 + (((tickAnim - 13) / 2) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 15) / 5) * (0-(0.25)));
            zz = -0.75 + (((tickAnim - 15) / 5) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -29.99283 + (((tickAnim - 0) / 10) * (30.02717-(-29.99283)));
            yy = 0.3484 + (((tickAnim - 0) / 10) * (1.68868-(0.3484)));
            zz = 0.7183 + (((tickAnim - 0) / 10) * (1.84373-(0.7183)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 30.02717 + (((tickAnim - 10) / 4) * (-6.22-(30.02717)));
            yy = 1.68868 + (((tickAnim - 10) / 4) * (1.69-(1.68868)));
            zz = 1.84373 + (((tickAnim - 10) / 4) * (1.84-(1.84373)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -6.22 + (((tickAnim - 14) / 1) * (-18.42646-(-6.22)));
            yy = 1.69 + (((tickAnim - 14) / 1) * (2.18161-(1.69)));
            zz = 1.84 + (((tickAnim - 14) / 1) * (-0.61095-(1.84)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -18.42646 + (((tickAnim - 15) / 3) * (-42.47874-(-18.42646)));
            yy = 2.18161 + (((tickAnim - 15) / 3) * (1.24528-(2.18161)));
            zz = -0.61095 + (((tickAnim - 15) / 3) * (1.61259-(-0.61095)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -42.47874 + (((tickAnim - 18) / 2) * (-29.99283-(-42.47874)));
            yy = 1.24528 + (((tickAnim - 18) / 2) * (0.3484-(1.24528)));
            zz = 1.61259 + (((tickAnim - 18) / 2) * (0.7183-(1.61259)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1.25 + (((tickAnim - 0) / 10) * (0.5-(-1.25)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 10) * (-1.25-(0.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = -10 + (((tickAnim - 0) / 5) * (-1.25-(-10)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.25 + (((tickAnim - 5) / 5) * (-22.5-(-1.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -22.5 + (((tickAnim - 10) / 2) * (-2.92-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -2.92 + (((tickAnim - 12) / 1) * (8.44-(-2.92)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 8.44 + (((tickAnim - 13) / 1) * (16.02-(8.44)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 16.02 + (((tickAnim - 14) / 1) * (23.39-(16.02)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 23.39 + (((tickAnim - 15) / 1) * (23.72-(23.39)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 23.72 + (((tickAnim - 16) / 2) * (15.05-(23.72)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 15.05 + (((tickAnim - 18) / 0) * (7.8-(15.05)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7.8 + (((tickAnim - 18) / 2) * (-10-(7.8)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 0) / 3) * (3.96-(30)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.96 + (((tickAnim - 3) / 2) * (2.5-(3.96)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 5) / 5) * (10-(2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 10) / 2) * (-4.17-(10)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -4.17 + (((tickAnim - 12) / 4) * (-31.29-(-4.17)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -31.29 + (((tickAnim - 16) / 2) * (14.07-(-31.29)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 14.07 + (((tickAnim - 18) / 2) * (30-(14.07)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.98724 + (((tickAnim - 0) / 3) * (13.42474-(9.98724)));
            yy = -1.49469 + (((tickAnim - 0) / 3) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 0) / 3) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 13.42474 + (((tickAnim - 3) / 5) * (-8.35834-(13.42474)));
            yy = -1.49469 + (((tickAnim - 3) / 5) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 3) / 5) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.35834 + (((tickAnim - 8) / 2) * (-12.51276-(-8.35834)));
            yy = -1.49469 + (((tickAnim - 8) / 2) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 8) / 2) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -12.51276 + (((tickAnim - 10) / 2) * (6.23724-(-12.51276)));
            yy = -1.49469 + (((tickAnim - 10) / 2) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 10) / 2) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 6.23724 + (((tickAnim - 12) / 4) * (77.92474-(6.23724)));
            yy = -1.49469 + (((tickAnim - 12) / 4) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 12) / 4) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 77.92474 + (((tickAnim - 16) / 2) * (40.22588-(77.92474)));
            yy = -1.49469 + (((tickAnim - 16) / 2) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 16) / 2) * (-3.20379-(-3.20379)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 40.22588 + (((tickAnim - 18) / 2) * (9.98724-(40.22588)));
            yy = -1.49469 + (((tickAnim - 18) / 2) * (-1.49469-(-1.49469)));
            zz = -3.20379 + (((tickAnim - 18) / 2) * (-3.20379-(-3.20379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 30.02717 + (((tickAnim - 0) / 4) * (-6.22-(30.02717)));
            yy = -1.68868 + (((tickAnim - 0) / 4) * (-1.69-(-1.68868)));
            zz = -1.84373 + (((tickAnim - 0) / 4) * (-1.84-(-1.84373)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -6.22 + (((tickAnim - 4) / 1) * (-18.38608-(-6.22)));
            yy = -1.69 + (((tickAnim - 4) / 1) * (-2.10758-(-1.69)));
            zz = -1.84 + (((tickAnim - 4) / 1) * (0.62492-(-1.84)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -18.38608 + (((tickAnim - 5) / 3) * (-42.48452-(-18.38608)));
            yy = -2.10758 + (((tickAnim - 5) / 3) * (0.52849-(-2.10758)));
            zz = 0.62492 + (((tickAnim - 5) / 3) * (-0.68854-(0.62492)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -42.48452 + (((tickAnim - 8) / 2) * (-29.99335-(-42.48452)));
            yy = 0.52849 + (((tickAnim - 8) / 2) * (0.22608-(0.52849)));
            zz = -0.68854 + (((tickAnim - 8) / 2) * (-0.23614-(-0.68854)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -29.99335 + (((tickAnim - 10) / 10) * (30.02717-(-29.99335)));
            yy = 0.22608 + (((tickAnim - 10) / 10) * (-1.68868-(0.22608)));
            zz = -0.23614 + (((tickAnim - 10) / 10) * (-1.84373-(-0.23614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 10) * (-1.25-(0.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -1.25 + (((tickAnim - 10) / 10) * (0.5-(-1.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegR.rotationPointX = this.UpperLegR.rotationPointX + (float)(xx);
        this.UpperLegR.rotationPointY = this.UpperLegR.rotationPointY - (float)(yy);
        this.UpperLegR.rotationPointZ = this.UpperLegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -22.5 + (((tickAnim - 0) / 2) * (-2.92-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.92 + (((tickAnim - 2) / 1) * (8.44-(-2.92)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 8.44 + (((tickAnim - 3) / 1) * (16.02-(8.44)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 16.02 + (((tickAnim - 4) / 1) * (23.39-(16.02)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 23.39 + (((tickAnim - 5) / 1) * (23.72-(23.39)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 23.72 + (((tickAnim - 6) / 2) * (15.05-(23.72)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 15.05 + (((tickAnim - 8) / 0) * (7.8-(15.05)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.8 + (((tickAnim - 8) / 2) * (-10-(7.8)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 10) / 5) * (-1.25-(-10)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.25 + (((tickAnim - 15) / 5) * (-22.5-(-1.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10 + (((tickAnim - 0) / 2) * (-4.17-(10)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -4.17 + (((tickAnim - 2) / 4) * (-31.29-(-4.17)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -31.29 + (((tickAnim - 6) / 2) * (14.07-(-31.29)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14.07 + (((tickAnim - 8) / 2) * (30-(14.07)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 10) / 3) * (3.96-(30)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 3.96 + (((tickAnim - 13) / 2) * (2.5-(3.96)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 15) / 5) * (10-(2.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -17.63337 + (((tickAnim - 0) / 2) * (6.03311-(-17.63337)));
            yy = -1.27008 + (((tickAnim - 0) / 2) * (-0.48322-(-1.27008)));
            zz = 1.79262 + (((tickAnim - 0) / 2) * (2.29356-(1.79262)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 6.03311 + (((tickAnim - 2) / 4) * (77.80243-(6.03311)));
            yy = -0.48322 + (((tickAnim - 2) / 4) * (-1.30818-(-0.48322)));
            zz = 2.29356 + (((tickAnim - 2) / 4) * (1.79423-(2.29356)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 77.80243 + (((tickAnim - 6) / 2) * (40.17869-(77.80243)));
            yy = -1.30818 + (((tickAnim - 6) / 2) * (-1.81532-(-1.30818)));
            zz = 1.79423 + (((tickAnim - 6) / 2) * (0.31809-(1.79423)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40.17869 + (((tickAnim - 8) / 2) * (9.79452-(40.17869)));
            yy = -1.81532 + (((tickAnim - 8) / 2) * (-3.1968-(-1.81532)));
            zz = 0.31809 + (((tickAnim - 8) / 2) * (1.5017-(0.31809)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 9.79452 + (((tickAnim - 10) / 3) * (13.34497-(9.79452)));
            yy = -3.1968 + (((tickAnim - 10) / 3) * (-2.48709-(-3.1968)));
            zz = 1.5017 + (((tickAnim - 10) / 3) * (-0.90778-(1.5017)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 13.34497 + (((tickAnim - 13) / 5) * (-8.49484-(13.34497)));
            yy = -2.48709 + (((tickAnim - 13) / 5) * (-1.63207-(-2.48709)));
            zz = -0.90778 + (((tickAnim - 13) / 5) * (1.79619-(-0.90778)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -8.49484 + (((tickAnim - 18) / 2) * (-17.63337-(-8.49484)));
            yy = -1.63207 + (((tickAnim - 18) / 2) * (-1.27008-(-1.63207)));
            zz = 1.79619 + (((tickAnim - 18) / 2) * (1.79262-(1.79619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 5) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 15) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 5) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 15) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 5) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 15) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 5) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 15) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.5 + (((tickAnim - 0) / 5) * (-0.5-(0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 5) / 5) * (0.5-(-0.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.5 + (((tickAnim - 10) / 5) * (-0.5-(0.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 15) / 5) * (0.5-(-0.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.5 + (((tickAnim - 0) / 5) * (-1.5-(1.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.5 + (((tickAnim - 5) / 5) * (1.5-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.5 + (((tickAnim - 10) / 5) * (-1.5-(1.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.5 + (((tickAnim - 15) / 5) * (1.5-(-1.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 0) / 5) * (12.5-(7.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12.5 + (((tickAnim - 5) / 5) * (7.5-(12.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 10) / 5) * (12.5-(7.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 15) / 5) * (7.5-(12.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHeterodontosaurus entity = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

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
            xx = 15.07673 + (((tickAnim - 8) / 5) * (-6.825-(15.07673)));
            yy = -9.96156 + (((tickAnim - 8) / 5) * (-2.84811-(-9.96156)));
            zz = -0.88045 + (((tickAnim - 8) / 5) * (-3.13671-(-0.88045)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -6.825 + (((tickAnim - 13) / 2) * (-16.33724-(-6.825)));
            yy = -2.84811 + (((tickAnim - 13) / 2) * (-6.98519-(-2.84811)));
            zz = -3.13671 + (((tickAnim - 13) / 2) * (1.31992-(-3.13671)));
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
            yy = -1 + (((tickAnim - 4) / 1) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 4) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 5) / 2) * (0.12-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
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
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 10.08 + (((tickAnim - 14) / 1) * (10.08-(10.08)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
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
            xx = 15.07673 + (((tickAnim - 0) / 5) * (-6.825-(15.07673)));
            yy = 9.96156 + (((tickAnim - 0) / 5) * (2.84811-(9.96156)));
            zz = 0.88045 + (((tickAnim - 0) / 5) * (3.13671-(0.88045)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6.825 + (((tickAnim - 5) / 3) * (-16.33724-(-6.825)));
            yy = 2.84811 + (((tickAnim - 5) / 3) * (6.98519-(2.84811)));
            zz = 3.13671 + (((tickAnim - 5) / 3) * (-1.31992-(3.13671)));
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
            yy = -1 + (((tickAnim - 12) / 1) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 12) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 13) / 1) * (0.12-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
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

    public void animHop(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHeterodontosaurus entity = (EntityPrehistoricFloraHeterodontosaurus) entitylivingbaseIn;

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
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = -5 + (((tickAnim - 5) / 3) * (18.33-(-5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 18.33 + (((tickAnim - 8) / 2) * (0-(18.33)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 3) / 2) * (-10-(12.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (-20-(-10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 8) / 2) * (0-(-20)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.75 + (((tickAnim - 3) / 2) * (2.5-(8.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 5) / 3) * (-13.75-(2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 3) / 2) * (-10-(12.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (-20-(-10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 8) / 2) * (0-(-20)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.75 + (((tickAnim - 3) / 2) * (2.5-(8.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 5) / 3) * (-13.75-(2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
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
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHeterodontosaurus e = (EntityPrehistoricFloraHeterodontosaurus) entity;
        animator.update(entity);

    }
}
