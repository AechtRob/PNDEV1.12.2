package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCompsognathus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCompsognathus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Compsognathus;
    private final AdvancedModelRenderer basin_r1;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer KneeL;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer MetatarsalL;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer KneeL2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer MetatarsalL2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer FootL2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer ElbowL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer ArmL2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer ElbowL2;
    private final AdvancedModelRenderer HandL2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer Eye;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;

    private ModelAnimator animator;

    public ModelCompsognathus() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.Compsognathus = new AdvancedModelRenderer(this);
        this.Compsognathus.setRotationPoint(0.0F, 11.1F, 6.0F);


        this.basin_r1 = new AdvancedModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, -1.0F, -2.2F);
        this.Compsognathus.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.0698F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 21, 53, -2.0F, -0.4F, -1.1F, 4, 5, 6, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(1.8F, 0.8F, 0.0F);
        this.Compsognathus.addChild(LegL);
        this.setRotateAngle(LegL, -0.3491F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -0.3413F, -1.2012F);
        this.LegL.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 1.0F, -0.5F, -0.8F, 2, 6, 4, 0.0F, false));

        this.KneeL = new AdvancedModelRenderer(this);
        this.KneeL.setRotationPoint(-2.2F, 5.1587F, -1.4012F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, -0.2618F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.KneeL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.1345F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 37, 1.5F, -0.2399F, -0.2907F, 1, 6, 2, -0.002F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 0, 1.9F, -0.2399F, -0.2907F, 1, 6, 2, -0.001F, false));

        this.MetatarsalL = new AdvancedModelRenderer(this);
        this.MetatarsalL.setRotationPoint(2.0F, 0.7F, 5.5F);
        this.KneeL.addChild(MetatarsalL);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.MetatarsalL.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.3963F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 53, -0.3F, 0.0317F, -0.0378F, 1, 1, 4, -0.003F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 61, 56, -0.3F, -0.2683F, -0.0378F, 1, 1, 4, -0.002F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 0.6109F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 16, -0.8F, -0.4F, -3.8F, 2, 1, 4, 0.0F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(-1.8F, 0.8F, 0.0F);
        this.Compsognathus.addChild(LegL2);
        this.setRotateAngle(LegL2, -0.3491F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, -0.3413F, -1.2012F);
        this.LegL2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -3.0F, -0.5F, -0.8F, 2, 6, 4, 0.0F, true));

        this.KneeL2 = new AdvancedModelRenderer(this);
        this.KneeL2.setRotationPoint(2.2F, 5.1587F, -1.4012F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, -0.2618F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.KneeL2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.1345F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 37, -2.5F, -0.2399F, -0.2907F, 1, 6, 2, -0.002F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 0, -2.9F, -0.2399F, -0.2907F, 1, 6, 2, -0.001F, true));

        this.MetatarsalL2 = new AdvancedModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(-2.0F, 0.7F, 5.5F);
        this.KneeL2.addChild(MetatarsalL2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.MetatarsalL2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.3963F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 53, -0.7F, 0.0317F, -0.0378F, 1, 1, 4, -0.003F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 61, 56, -0.7F, -0.2683F, -0.0378F, 1, 1, 4, -0.002F, true));

        this.FootL2 = new AdvancedModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.6109F, 0.0F, 0.0F);
        this.FootL2.cubeList.add(new ModelBox(FootL2, 0, 16, -1.2F, -0.4F, -3.8F, 2, 1, 4, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 2.6F);
        this.Compsognathus.addChild(Tail1);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.Tail1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0087F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 55, 0, -0.5F, -0.006F, -1.9025F, 1, 1, 8, 0.002F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 33, -1.5F, -0.8F, -2.0F, 3, 4, 8, 0.002F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.0F, 5.9F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 37, -1.5F, -1.0F, -1.0F, 3, 3, 10, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 46, 46, -2.0F, 0.0F, 1.0F, 4, 1, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 51, -0.5F, 1.0F, -1.0F, 1, 2, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -1.8F, 1.0F);
        this.Tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 55, 14, -1.0F, -0.1F, -0.4F, 1, 3, 8, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.5F, 0.0F, 8.8F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0436F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -2.2F, -0.4F);
        this.Tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 19, -1.5F, -0.0821F, -0.0157F, 1, 3, 10, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 0, -1.5F, 0.4F, -0.3F, 1, 3, 10, 0.001F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 27, -3.5F, -0.1F, -0.3F, 5, 1, 10, 0.001F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 39, -2.5F, -1.0F, -0.3F, 3, 3, 10, 0.001F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.3F, 9.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0436F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.7F, -0.1F);
        this.Tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1658F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 15, -1.0F, -1.9773F, -0.1063F, 1, 6, 15, -0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.7F, -0.1F);
        this.Tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.192F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -2.5F, 0.4227F, -0.0063F, 4, 1, 14, -0.001F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 3, -1.5F, -0.0773F, -0.0063F, 2, 2, 13, -0.001F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Compsognathus.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 42, 56, -2.0F, -1.4F, -4.8F, 4, 5, 5, 0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 4.0F, -4.5F);
        this.Body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 51, -1.0F, -1.1F, -0.3F, 2, 1, 5, 0.002F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.7F, -4.5F);
        this.Body.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 17, 19, -2.0F, -1.9F, -3.0F, 4, 4, 3, 0.0F, false));
        this.Chest.cubeList.add(new ModelBox(Chest, 17, 19, -2.0F, -1.3F, -3.0F, 4, 4, 3, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.5F, -3.0F);
        this.Chest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 0, -1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(2.0F, 1.3F, -2.0F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.0F, 0.1745F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmL.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.48F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 39, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.ElbowL = new AdvancedModelRenderer(this);
        this.ElbowL.setRotationPoint(0.5F, 1.0F, 2.7F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.2182F, 0.0F, 0.0F);
        this.ElbowL.cubeList.add(new ModelBox(ElbowL, 17, 38, -1.0F, 0.0F, -0.83F, 1, 3, 1, -0.002F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 3.0F, -0.2F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.1309F);
        this.HandL.cubeList.add(new ModelBox(HandL, 9, 0, -1.0F, 0.0F, -0.63F, 1, 2, 1, -0.002F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.HandL.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3927F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 16, -1.0F, 0.0F, -0.03F, 1, 1, 1, -0.004F, false));

        this.ArmL2 = new AdvancedModelRenderer(this);
        this.ArmL2.setRotationPoint(-2.0F, 1.3F, -2.0F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.0F, -0.1745F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmL2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.48F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 27, 39, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.ElbowL2 = new AdvancedModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.5F, 1.0F, 2.7F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.2182F, 0.0F, 0.0F);
        this.ElbowL2.cubeList.add(new ModelBox(ElbowL2, 17, 38, 0.0F, 0.0F, -0.83F, 1, 3, 1, -0.002F, true));

        this.HandL2 = new AdvancedModelRenderer(this);
        this.HandL2.setRotationPoint(0.0F, 3.0F, -0.2F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.0F, 0.0F, -0.1309F);
        this.HandL2.cubeList.add(new ModelBox(HandL2, 9, 0, 0.0F, 0.0F, -0.63F, 1, 2, 1, -0.002F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.HandL2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 16, 0.0F, 0.0F, -0.03F, 1, 1, 1, -0.004F, true));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -0.4F, -2.3F);
        this.Chest.addChild(Neck3);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.7F, -3.3F);
        this.Neck3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.48F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 22, -1.0F, -3.0048F, -0.0062F, 2, 3, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.3F, -0.7F);
        this.Neck3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 19, -1.5F, -1.0F, -2.0F, 3, 3, 4, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.6F, -2.5F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0873F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.3F, -4.0F);
        this.Neck2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.8727F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 23, 6, -0.5F, -1.1368F, 0.6921F, 1, 1, 4, -0.002F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -3.5F, -2.7F);
        this.Neck2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.6545F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 59, 33, -1.0F, 1.6F, 0.0F, 2, 1, 5, -0.002F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 17, 39, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -3.1F, -2.7F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.1309F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 0, 51, -1.0F, -0.5F, -1.9F, 2, 3, 2, -0.1F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.6F, -1.6F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, -0.3927F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 1.9231F, -4.3504F);
        this.Head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.6458F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 63, -1.0F, -0.0349F, -0.0013F, 1, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 2.7231F, -4.1504F);
        this.Head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4411F, -0.1423F, -0.0668F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 63, 46, 0.0F, -0.8097F, -0.0224F, 1, 1, 3, -0.002F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 2.7231F, -4.1504F);
        this.Head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.4411F, 0.1423F, 0.0668F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 63, 46, -1.0F, -0.8097F, -0.0224F, 1, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, -0.4769F, -0.1504F);
        this.Head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.4363F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 65, -1.0F, 0.4F, -5.0F, 1, 1, 3, -0.001F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 56, -1.5F, 0.4F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.1231F, -2.0504F);
        this.Head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.5585F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 42, 33, -1.0F, -0.0408F, -0.1244F, 2, 1, 2, -0.002F, false));

        this.Eye = new AdvancedModelRenderer(this);
        this.Eye.setRotationPoint(0.0F, 0.4345F, -0.9259F);
        this.Head.addChild(Eye);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4887F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 73, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.02F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.8231F, 0.4496F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1309F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3927F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 11, -1.0F, -0.9269F, -1.6318F, 2, 1, 1, -0.023F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 7, 11, -1.0F, -0.9269F, -1.1318F, 2, 1, 1, -0.02F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 1.9F, -4.5F);
        this.Jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4411F, -0.1423F, -0.0668F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 61, 62, 0.0116F, 0.0983F, 0.0877F, 1, 1, 3, -0.044F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 1.9F, -4.5F);
        this.Jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.4411F, 0.1423F, 0.0668F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 61, 62, -1.0116F, 0.0983F, 0.0877F, 1, 1, 3, -0.04F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.1F, 0.1F);
        this.Jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.4363F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 63, -0.5F, -0.0331F, -4.9257F, 1, 1, 3, -0.042F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.4363F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 43, 19, -1.0F, -0.1F, -2.0F, 2, 1, 2, -0.001F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Compsognathus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(Tail4, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, 0.1472F, 0.0386F, -0.0058F);
        this.setRotateAngle(Neck2, 0.482F, -0.0433F, -0.0056F);
        this.setRotateAngle(Neck1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalL, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(LegL2, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(LegL, -1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL2, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(HandL2, 0.0F, 0.0F, -0.1309F);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.1309F);
        this.setRotateAngle(FootL2, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, 2.4871F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowL2, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowL, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r33, 0.4411F, 0.1423F, 0.0668F);
        this.setRotateAngle(cube_r32, 0.4411F, -0.1423F, -0.0668F);
        this.setRotateAngle(cube_r31, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.4411F, 0.1423F, 0.0668F);
        this.setRotateAngle(cube_r26, 0.4411F, -0.1423F, -0.0668F);
        this.setRotateAngle(cube_r25, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(basin_r1, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL2, -0.6F, -0.1745F, 0.0F);
        this.setRotateAngle(ArmL, -0.6F, 0.1745F, 0.0F);
        this.Chest.offsetY = -0.01F;
        this.Chest.offsetZ = -0.058F;
        this.Chest.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Compsognathus.offsetY = -0.2F;
        this.Compsognathus.offsetX = 0.2F;
        this.Compsognathus.rotateAngleY = (float)Math.toRadians(200);
        this.Compsognathus.rotateAngleX = (float)Math.toRadians(8);
        this.Compsognathus.rotateAngleZ = (float)Math.toRadians(-8);
        float scaler = 1.0F;
        this.Compsognathus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(basin_r1, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(LegL, -1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalL, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, 2.4871F, 0.0F, 0.0F);
        this.setRotateAngle(LegL2, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL2, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(FootL2, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r17, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowL, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.1309F);
        this.setRotateAngle(cube_r18, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL2, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r19, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowL2, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(HandL2, 0.0F, 0.0F, -0.1309F);
        this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, -0.3138F, -0.3035F, -0.0797F);
        this.setRotateAngle(cube_r21, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, 0.1428F, -0.1178F, -0.1043F);
        this.setRotateAngle(cube_r23, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.4411F, -0.1423F, -0.0668F);
        this.setRotateAngle(cube_r27, 0.4411F, 0.1423F, 0.0668F);
        this.setRotateAngle(cube_r28, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.4411F, -0.1423F, -0.0668F);
        this.setRotateAngle(cube_r33, 0.4411F, 0.1423F, 0.0668F);
        this.setRotateAngle(cube_r34, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, 0.4363F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Compsognathus.render(f);
        //Reset rotations, positions and sizing:
        this.Compsognathus.setScale(1.0F, 1.0F, 1.0F);
        this.Compsognathus.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(basin_r1, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(LegL, -1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalL, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, 2.4871F, 0.0F, 0.0F);
        this.setRotateAngle(LegL2, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL2, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(FootL2, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r17, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowL, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.1309F);
        this.setRotateAngle(cube_r18, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL2, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r19, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowL2, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(HandL2, 0.0F, 0.0F, -0.1309F);
        this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, -0.3138F, -0.3035F, -0.0797F);
        this.setRotateAngle(cube_r21, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, 0.1428F, -0.1178F, -0.1043F);
        this.setRotateAngle(cube_r23, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.4411F, -0.1423F, -0.0668F);
        this.setRotateAngle(cube_r27, 0.4411F, 0.1423F, 0.0668F);
        this.setRotateAngle(cube_r28, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.4411F, -0.1423F, -0.0668F);
        this.setRotateAngle(cube_r33, 0.4411F, 0.1423F, 0.0668F);
        this.setRotateAngle(cube_r34, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, 0.4363F, 0.0F, 0.0F);
        this.Compsognathus.offsetY = -0.005F;
        this.Compsognathus.render(0.01F);
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

        EntityPrehistoricFloraCompsognathus entityCompsognathus = (EntityPrehistoricFloraCompsognathus) e;

        if (entityCompsognathus.getAnimation() == entityCompsognathus.NO_ANIMATION) {
            this.faceTarget(f3, f4, 10, Neck1);
            this.faceTarget(f3, f4, 10, Neck2);
            this.faceTarget(f3, f4, 10, Neck3);
            this.faceTarget(f3, f4, 10, Head);
        }

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.ArmL, this.ElbowL, this.HandL};
        AdvancedModelRenderer[] ArmR = {this.ArmL2, this.ElbowL2, this.HandL2};

        entityCompsognathus.tailBuffer.applyChainSwingBuffer(Tail);

//        if (entityCompsognathus.getAnimation() == entityCompsognathus.LAY_ANIMATION) {
//            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
//            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
//        }
//        else {
        if (!entityCompsognathus.isReallyInWater()) {

            if (f3 == 0.0F || !entityCompsognathus.getIsMoving()) {
                if (entityCompsognathus.getAnimation() == entityCompsognathus.NO_ANIMATION) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.ArmL, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.ArmL2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.ElbowL, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.ElbowL2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                }

                return;
            }

            if (entityCompsognathus.getIsFast()) { //Running


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


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCompsognathus ee = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    if (ee.getIsCuriousWalking()) { //layer this on top:
                        animHopping(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The social anim
            animChatter(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_CURIOUS1) {
            animCurious1(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_CURIOUS2) {
            animCurious2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE1) {
            animIdle1(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE2) {
            animIdle2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE3) {
            animIdle3(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE4) {
            animIdle4(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            //animLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }

    public void animChatter(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 53) {
            xx = 10 + (((tickAnim - 6) / 47) * (10-(10)));
            yy = 0 + (((tickAnim - 6) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 47) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 53) / 7) * (0-(10)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Compsognathus, Compsognathus.rotateAngleX + (float) Math.toRadians(xx), Compsognathus.rotateAngleY + (float) Math.toRadians(yy), Compsognathus.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 53) {
            xx = -10 + (((tickAnim - 6) / 47) * (-10-(-10)));
            yy = 0 + (((tickAnim - 6) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 47) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 53) / 7) * (0-(-10)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 53) {
            xx = -10 + (((tickAnim - 6) / 47) * (-10-(-10)));
            yy = 0 + (((tickAnim - 6) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 47) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 53) / 7) * (0-(-10)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 6) / 9) * (43.1076-(32.5)));
            yy = 0 + (((tickAnim - 6) / 9) * (-3.82821-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (-3.21873-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 43.1076 + (((tickAnim - 15) / 5) * (30.61-(43.1076)));
            yy = -3.82821 + (((tickAnim - 15) / 5) * (0-(-3.82821)));
            zz = -3.21873 + (((tickAnim - 15) / 5) * (0-(-3.21873)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 30.61 + (((tickAnim - 20) / 5) * (43.1076-(30.61)));
            yy = 0 + (((tickAnim - 20) / 5) * (3.82821-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (3.21873-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 43.1076 + (((tickAnim - 25) / 5) * (30.61-(43.1076)));
            yy = 3.82821 + (((tickAnim - 25) / 5) * (0-(3.82821)));
            zz = 3.21873 + (((tickAnim - 25) / 5) * (0-(3.21873)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 30.61 + (((tickAnim - 30) / 6) * (43.1076-(30.61)));
            yy = 0 + (((tickAnim - 30) / 6) * (-3.82821-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (-3.21873-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 43.1076 + (((tickAnim - 36) / 5) * (30.61-(43.1076)));
            yy = -3.82821 + (((tickAnim - 36) / 5) * (0-(-3.82821)));
            zz = -3.21873 + (((tickAnim - 36) / 5) * (0-(-3.21873)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 30.61 + (((tickAnim - 41) / 5) * (43.1076-(30.61)));
            yy = 0 + (((tickAnim - 41) / 5) * (3.82821-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (3.21873-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 43.1076 + (((tickAnim - 46) / 7) * (32.5-(43.1076)));
            yy = 3.82821 + (((tickAnim - 46) / 7) * (0-(3.82821)));
            zz = 3.21873 + (((tickAnim - 46) / 7) * (0-(3.21873)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 32.5 + (((tickAnim - 53) / 7) * (0-(32.5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 6) / 9) * (25.5193-(17.5)));
            yy = 0 + (((tickAnim - 6) / 9) * (-2.30959-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (-0.95723-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 25.5193 + (((tickAnim - 15) / 5) * (15.52-(25.5193)));
            yy = -2.30959 + (((tickAnim - 15) / 5) * (0-(-2.30959)));
            zz = -0.95723 + (((tickAnim - 15) / 5) * (0-(-0.95723)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 15.52 + (((tickAnim - 20) / 5) * (25.5193-(15.52)));
            yy = 0 + (((tickAnim - 20) / 5) * (2.30959-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.95723-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 25.5193 + (((tickAnim - 25) / 5) * (15.52-(25.5193)));
            yy = 2.30959 + (((tickAnim - 25) / 5) * (0-(2.30959)));
            zz = 0.95723 + (((tickAnim - 25) / 5) * (0-(0.95723)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 15.52 + (((tickAnim - 30) / 6) * (25.5193-(15.52)));
            yy = 0 + (((tickAnim - 30) / 6) * (-2.30959-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (-0.95723-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 25.5193 + (((tickAnim - 36) / 5) * (15.52-(25.5193)));
            yy = -2.30959 + (((tickAnim - 36) / 5) * (0-(-2.30959)));
            zz = -0.95723 + (((tickAnim - 36) / 5) * (0-(-0.95723)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 15.52 + (((tickAnim - 41) / 5) * (25.5193-(15.52)));
            yy = 0 + (((tickAnim - 41) / 5) * (2.30959-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0.95723-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 25.5193 + (((tickAnim - 46) / 7) * (17.5-(25.5193)));
            yy = 2.30959 + (((tickAnim - 46) / 7) * (0-(2.30959)));
            zz = 0.95723 + (((tickAnim - 46) / 7) * (0-(0.95723)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 17.5 + (((tickAnim - 53) / 7) * (0-(17.5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 6) / 9) * (20.57031-(10)));
            yy = 0 + (((tickAnim - 6) / 9) * (-4.69776-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (-1.71394-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 20.57031 + (((tickAnim - 15) / 5) * (10.57-(20.57031)));
            yy = -4.69776 + (((tickAnim - 15) / 5) * (0-(-4.69776)));
            zz = -1.71394 + (((tickAnim - 15) / 5) * (0-(-1.71394)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 10.57 + (((tickAnim - 20) / 5) * (20.57031-(10.57)));
            yy = 0 + (((tickAnim - 20) / 5) * (4.69776-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (1.71394-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20.57031 + (((tickAnim - 25) / 5) * (10.57-(20.57031)));
            yy = 4.69776 + (((tickAnim - 25) / 5) * (0-(4.69776)));
            zz = 1.71394 + (((tickAnim - 25) / 5) * (0-(1.71394)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 10.57 + (((tickAnim - 30) / 6) * (20.57031-(10.57)));
            yy = 0 + (((tickAnim - 30) / 6) * (-4.69776-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (-1.71394-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 20.57031 + (((tickAnim - 36) / 5) * (10.57-(20.57031)));
            yy = -4.69776 + (((tickAnim - 36) / 5) * (0-(-4.69776)));
            zz = -1.71394 + (((tickAnim - 36) / 5) * (0-(-1.71394)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 10.57 + (((tickAnim - 41) / 5) * (20.57031-(10.57)));
            yy = 0 + (((tickAnim - 41) / 5) * (4.69776-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (1.71394-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 20.57031 + (((tickAnim - 46) / 7) * (10-(20.57031)));
            yy = 4.69776 + (((tickAnim - 46) / 7) * (0-(4.69776)));
            zz = 1.71394 + (((tickAnim - 46) / 7) * (0-(1.71394)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 53) / 7) * (0-(10)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 25 + (((tickAnim - 6) / 9) * (33.02473-(25)));
            yy = 0 + (((tickAnim - 6) / 9) * (-2.10829-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (-1.34386-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 33.02473 + (((tickAnim - 15) / 5) * (20.52-(33.02473)));
            yy = -2.10829 + (((tickAnim - 15) / 5) * (0-(-2.10829)));
            zz = -1.34386 + (((tickAnim - 15) / 5) * (0-(-1.34386)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 20.52 + (((tickAnim - 20) / 5) * (33.02473-(20.52)));
            yy = 0 + (((tickAnim - 20) / 5) * (2.10829-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (1.34386-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 33.02473 + (((tickAnim - 25) / 11) * (33.02473-(33.02473)));
            yy = 2.10829 + (((tickAnim - 25) / 11) * (-2.10829-(2.10829)));
            zz = 1.34386 + (((tickAnim - 25) / 11) * (-1.34386-(1.34386)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 33.02473 + (((tickAnim - 36) / 5) * (20.52-(33.02473)));
            yy = -2.10829 + (((tickAnim - 36) / 5) * (0-(-2.10829)));
            zz = -1.34386 + (((tickAnim - 36) / 5) * (0-(-1.34386)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 20.52 + (((tickAnim - 41) / 5) * (33.02473-(20.52)));
            yy = 0 + (((tickAnim - 41) / 5) * (2.10829-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (1.34386-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 33.02473 + (((tickAnim - 46) / 7) * (25-(33.02473)));
            yy = 2.10829 + (((tickAnim - 46) / 7) * (0-(2.10829)));
            zz = 1.34386 + (((tickAnim - 46) / 7) * (0-(1.34386)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 25 + (((tickAnim - 53) / 7) * (0-(25)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 27) {
            xx = -2.5 + (((tickAnim - 6) / 21) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 6) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 21) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 27) / 3) * (-10-(-2.5)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = -10 + (((tickAnim - 30) / 13) * (-10-(-10)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -10 + (((tickAnim - 43) / 10) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -2.5 + (((tickAnim - 53) / 7) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 6) / 12) * (-5-(-5)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 18) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (3.64-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 3.64 + (((tickAnim - 40) / 9) * (3.64-(3.64)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 3.64 + (((tickAnim - 49) / 4) * (-5-(3.64)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 53) / 7) * (0-(-5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 53) {
            xx = -35 + (((tickAnim - 6) / 47) * (-35-(-35)));
            yy = 0 + (((tickAnim - 6) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 47) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -35 + (((tickAnim - 53) / 7) * (0-(-35)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 6) / 12) * (32.5-(22.5)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 32.5 + (((tickAnim - 18) / 15) * (25.71-(32.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 53) {
            xx = 25.71 + (((tickAnim - 33) / 20) * (22.5-(25.71)));
            yy = 0 + (((tickAnim - 33) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 20) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 22.5 + (((tickAnim - 53) / 7) * (0-(22.5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 52) {
            xx = -35 + (((tickAnim - 4) / 48) * (-35-(-35)));
            yy = 0 + (((tickAnim - 4) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 48) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -35 + (((tickAnim - 52) / 8) * (0-(-35)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 22) {
            xx = 22.5 + (((tickAnim - 4) / 18) * (10-(22.5)));
            yy = 0 + (((tickAnim - 4) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 18) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 39) {
            xx = 10 + (((tickAnim - 22) / 17) * (22.29-(10)));
            yy = 0 + (((tickAnim - 22) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 17) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 52) {
            xx = 22.29 + (((tickAnim - 39) / 13) * (22.5-(22.29)));
            yy = 0 + (((tickAnim - 39) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 13) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 22.5 + (((tickAnim - 52) / 8) * (0-(22.5)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 5 + (((tickAnim - 6) / 3) * (5-(5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 9) / 4) * (15-(5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 15 + (((tickAnim - 13) / 8) * (15-(15)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 15 + (((tickAnim - 21) / 3) * (-8.53-(15)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -8.53 + (((tickAnim - 24) / 14) * (0.54-(-8.53)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0.54 + (((tickAnim - 38) / 5) * (0.54-(0.54)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0.54 + (((tickAnim - 43) / 10) * (5-(0.54)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 53) / 7) * (0-(5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 53) {
            xx = 15 + (((tickAnim - 6) / 47) * (15-(15)));
            yy = 0 + (((tickAnim - 6) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 47) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 53) / 7) * (0-(15)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -15 + (((tickAnim - 6) / 3) * (-15-(-15)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -15 + (((tickAnim - 9) / 4) * (-30-(-15)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -30 + (((tickAnim - 13) / 8) * (-30-(-30)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -30 + (((tickAnim - 21) / 3) * (-3.46-(-30)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -3.46 + (((tickAnim - 24) / 14) * (-14.07-(-3.46)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -14.07 + (((tickAnim - 38) / 5) * (-14.07-(-14.07)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -14.07 + (((tickAnim - 43) / 10) * (-15-(-14.07)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -15 + (((tickAnim - 53) / 7) * (0-(-15)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 53) {
            xx = -5 + (((tickAnim - 6) / 47) * (-5-(-5)));
            yy = 0 + (((tickAnim - 6) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 47) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 53) / 7) * (0-(-5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (35-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 35 + (((tickAnim - 17) / 2) * (0-(35)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 19) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 19) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (35-(0)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 35 + (((tickAnim - 41) / 2) * (0-(35)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Compsognathus, Compsognathus.rotateAngleX + (float) Math.toRadians(xx), Compsognathus.rotateAngleY + (float) Math.toRadians(yy), Compsognathus.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -2 + (((tickAnim - 20) / 10) * (-2-(-2)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -2 + (((tickAnim - 30) / 20) * (0-(-2)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Compsognathus.rotationPointX = this.Compsognathus.rotationPointX + (float)(xx);
        this.Compsognathus.rotationPointY = this.Compsognathus.rotationPointY - (float)(yy);
        this.Compsognathus.rotationPointZ = this.Compsognathus.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 20) / 10) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 30) / 20) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.5 + (((tickAnim - 20) / 10) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 30) / 20) * (0-(27.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 20) / 10) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 30) / 20) * (0-(2.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 20) / 10) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 30) / 20) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.5 + (((tickAnim - 20) / 10) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 30) / 20) * (0-(27.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL2, KneeL2.rotateAngleX + (float) Math.toRadians(xx), KneeL2.rotateAngleY + (float) Math.toRadians(yy), KneeL2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(MetatarsalL2, MetatarsalL2.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL2.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 20) / 10) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 30) / 20) * (0-(2.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 20) / 10) * (5-(5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 30) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 20) / 10) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 20) / 10) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 20) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 20) / 10) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 30) / 20) * (0-(12.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 2.5 + (((tickAnim - 10) / 30) * (2.5-(2.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 2.5 + (((tickAnim - 40) / 10) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Compsognathus, Compsognathus.rotateAngleX + (float) Math.toRadians(xx), Compsognathus.rotateAngleY + (float) Math.toRadians(yy), Compsognathus.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-26.67-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -26.67 + (((tickAnim - 6) / 4) * (-20-(-26.67)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -20 + (((tickAnim - 10) / 8) * (15-(-20)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 15 + (((tickAnim - 18) / 5) * (-20-(15)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -20 + (((tickAnim - 23) / 8) * (15-(-20)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 15 + (((tickAnim - 31) / 6) * (-20-(15)));
            yy = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -20 + (((tickAnim - 37) / 7) * (15-(-20)));
            yy = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 44) / 6) * (0-(15)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 10) / 8) * (12.5-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 18) / 2) * (24.29-(12.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 24.29 + (((tickAnim - 20) / 3) * (-12.5-(24.29)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -12.5 + (((tickAnim - 23) / 8) * (12.5-(-12.5)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 12.5 + (((tickAnim - 31) / 2) * (24.29-(12.5)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 24.29 + (((tickAnim - 33) / 4) * (-12.5-(24.29)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -12.5 + (((tickAnim - 37) / 7) * (12.5-(-12.5)));
            yy = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 12.5 + (((tickAnim - 44) / 3) * (24.29-(12.5)));
            yy = 0 + (((tickAnim - 44) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 3) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 24.29 + (((tickAnim - 47) / 3) * (0-(24.29)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 10) / 10) * (-25-(27.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -25 + (((tickAnim - 20) / 3) * (27.5-(-25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 27.5 + (((tickAnim - 23) / 10) * (-25-(27.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -25 + (((tickAnim - 33) / 4) * (27.5-(-25)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 47) {
            xx = 27.5 + (((tickAnim - 37) / 10) * (-25-(27.5)));
            yy = 0 + (((tickAnim - 37) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 10) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -25 + (((tickAnim - 47) / 3) * (0-(-25)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 12.5 + (((tickAnim - 10) / 8) * (17.5-(12.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 18) / 2) * (23.57-(17.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 23.57 + (((tickAnim - 20) / 3) * (12.5-(23.57)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 12.5 + (((tickAnim - 23) / 8) * (17.5-(12.5)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 31) / 2) * (23.57-(17.5)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 23.57 + (((tickAnim - 33) / 4) * (12.5-(23.57)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 12.5 + (((tickAnim - 37) / 7) * (17.5-(12.5)));
            yy = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 17.5 + (((tickAnim - 44) / 3) * (23.57-(17.5)));
            yy = 0 + (((tickAnim - 44) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 3) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 23.57 + (((tickAnim - 47) / 3) * (0-(23.57)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = -2.5 + (((tickAnim - 10) / 30) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -2.5 + (((tickAnim - 40) / 10) * (0-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 10) / 30) * (10-(10)));
            yy = -2.5 + (((tickAnim - 10) / 30) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 40) / 10) * (0-(10)));
            yy = -2.5 + (((tickAnim - 40) / 10) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 10 + (((tickAnim - 10) / 12) * (7.5-(10)));
            yy = -17.5 + (((tickAnim - 10) / 12) * (-17.5-(-17.5)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 7.5 + (((tickAnim - 22) / 9) * (16.25-(7.5)));
            yy = -17.5 + (((tickAnim - 22) / 9) * (-17.5-(-17.5)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 16.25 + (((tickAnim - 31) / 9) * (10-(16.25)));
            yy = -17.5 + (((tickAnim - 31) / 9) * (-17.5-(-17.5)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 40) / 10) * (0-(10)));
            yy = -17.5 + (((tickAnim - 40) / 10) * (0-(-17.5)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.66208-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-17.46317-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (12.01505-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 3.66208 + (((tickAnim - 10) / 12) * (8.65637-(3.66208)));
            yy = -17.46317 + (((tickAnim - 10) / 12) * (-17.46317-(-17.46317)));
            zz = 12.01505 + (((tickAnim - 10) / 12) * (12.01505-(12.01505)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 8.65637 + (((tickAnim - 22) / 7) * (1.61325-(8.65637)));
            yy = -17.46317 + (((tickAnim - 22) / 7) * (-17.46317-(-17.46317)));
            zz = 12.01505 + (((tickAnim - 22) / 7) * (12.01505-(12.01505)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 1.61325 + (((tickAnim - 29) / 11) * (3.66208-(1.61325)));
            yy = -17.46317 + (((tickAnim - 29) / 11) * (-17.46317-(-17.46317)));
            zz = 12.01505 + (((tickAnim - 29) / 11) * (12.01505-(12.01505)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.66208 + (((tickAnim - 40) / 10) * (0-(3.66208)));
            yy = -17.46317 + (((tickAnim - 40) / 10) * (0-(-17.46317)));
            zz = 12.01505 + (((tickAnim - 40) / 10) * (0-(12.01505)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.92788-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-25.4182-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (14.24543-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 5.92788 + (((tickAnim - 10) / 30) * (5.92788-(5.92788)));
            yy = -25.4182 + (((tickAnim - 10) / 30) * (-25.4182-(-25.4182)));
            zz = 14.24543 + (((tickAnim - 10) / 30) * (14.24543-(14.24543)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 5.92788 + (((tickAnim - 40) / 10) * (0-(5.92788)));
            yy = -25.4182 + (((tickAnim - 40) / 10) * (0-(-25.4182)));
            zz = 14.24543 + (((tickAnim - 40) / 10) * (0-(14.24543)));
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



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -17 + (((tickAnim - 3) / 1) * (-15-(-17)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 4) / 4) * (11.07-(-15)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.07 + (((tickAnim - 8) / 3) * (11.6-(11.07)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 11.6 + (((tickAnim - 11) / 4) * (-1.49-(11.6)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.49 + (((tickAnim - 15) / 5) * (0-(-1.49)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.5 + (((tickAnim - 4) / 4) * (26.61-(-12.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 26.61 + (((tickAnim - 8) / 3) * (29.35-(26.61)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 29.35 + (((tickAnim - 11) / 4) * (15.89-(29.35)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 15.89 + (((tickAnim - 15) / 5) * (0-(15.89)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 4) / 4) * (-18.57-(27.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -18.57 + (((tickAnim - 8) / 3) * (-8.31-(-18.57)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -8.31 + (((tickAnim - 11) / 4) * (-3.62-(-8.31)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -3.62 + (((tickAnim - 15) / 5) * (0-(-3.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 12.5 + (((tickAnim - 4) / 2) * (-20.36-(12.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.36 + (((tickAnim - 6) / 2) * (-6.4-(-20.36)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -6.4 + (((tickAnim - 8) / 3) * (6.71-(-6.4)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.71 + (((tickAnim - 11) / 2) * (18.44-(6.71)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 18.44 + (((tickAnim - 13) / 4) * (11.5-(18.44)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 11.5 + (((tickAnim - 17) / 3) * (0-(11.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 17.5 + (((tickAnim - 3) / 4) * (48.45-(17.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 48.45 + (((tickAnim - 7) / 2) * (0-(48.45)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle4(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 40) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 5 + (((tickAnim - 80) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (-7.5-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 40) / 20) * (-5-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 60) / 20) * (-7.5-(-5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -7.5 + (((tickAnim - 80) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 20) / 20) * (-12.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -12.5 + (((tickAnim - 40) / 20) * (-7.5-(-12.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -7.5 + (((tickAnim - 60) / 20) * (-12.5-(-7.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -12.5 + (((tickAnim - 80) / 20) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 20) / 20) * (7.5-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 7.5 + (((tickAnim - 40) / 20) * (-2.5-(7.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (7.5-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 7.5 + (((tickAnim - 80) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 6) / 14) * (5-(0)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 20) / 20) * (2.5-(5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 40) / 20) * (5-(2.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 60) / 20) * (2.5-(5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 2.5 + (((tickAnim - 80) / 20) * (0-(2.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 6) / 14) * (7.5-(0)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 20) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 7.5 + (((tickAnim - 60) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 20) / 20) * (-17.5-(-22.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -17.5 + (((tickAnim - 40) / 20) * (-22.5-(-17.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -22.5 + (((tickAnim - 60) / 20) * (-17.5-(-22.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -17.5 + (((tickAnim - 80) / 20) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 20) / 20) * (-12.5-(-20)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -12.5 + (((tickAnim - 40) / 20) * (-20-(-12.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -20 + (((tickAnim - 60) / 20) * (-12.5-(-20)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -12.5 + (((tickAnim - 80) / 20) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 20) / 20) * (12.5-(15)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 40) / 20) * (15-(12.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 15 + (((tickAnim - 60) / 20) * (12.5-(15)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 12.5 + (((tickAnim - 80) / 20) * (0-(12.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 17.5 + (((tickAnim - 20) / 40) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = 17.5 + (((tickAnim - 60) / 14) * (-5-(17.5)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 88) {
            xx = -5 + (((tickAnim - 74) / 14) * (17.5-(-5)));
            yy = 0 + (((tickAnim - 74) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 14) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 100) {
            xx = 17.5 + (((tickAnim - 88) / 12) * (0-(17.5)));
            yy = 0 + (((tickAnim - 88) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (0.6-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 20) / 20) * (1-(1)));
            yy = 0.6 + (((tickAnim - 20) / 20) * (0.3-(0.6)));
            zz = 1 + (((tickAnim - 20) / 20) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 40) / 20) * (1-(1)));
            yy = 0.3 + (((tickAnim - 40) / 20) * (0.6-(0.3)));
            zz = 1 + (((tickAnim - 40) / 20) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 60) / 20) * (1-(1)));
            yy = 0.6 + (((tickAnim - 60) / 20) * (1-(0.6)));
            zz = 1 + (((tickAnim - 60) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 60 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 60) / 14) * (37.5-(0)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 88) {
            xx = 37.5 + (((tickAnim - 74) / 14) * (0-(37.5)));
            yy = 0 + (((tickAnim - 74) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle3(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 10 + (((tickAnim - 20) / 13) * (10-(10)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 10 + (((tickAnim - 33) / 17) * (0-(10)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Compsognathus, Compsognathus.rotateAngleX + (float) Math.toRadians(xx), Compsognathus.rotateAngleY + (float) Math.toRadians(yy), Compsognathus.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -3.8 + (((tickAnim - 20) / 13) * (-3.8-(-3.8)));
            yy = -0.3 + (((tickAnim - 20) / 13) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3.8 + (((tickAnim - 33) / 17) * (0-(-3.8)));
            yy = -0.3 + (((tickAnim - 33) / 17) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Compsognathus.rotationPointX = this.Compsognathus.rotationPointX + (float)(xx);
        this.Compsognathus.rotationPointY = this.Compsognathus.rotationPointY - (float)(yy);
        this.Compsognathus.rotationPointZ = this.Compsognathus.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.75523-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.84389-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-7.30919-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.75523 + (((tickAnim - 10) / 10) * (-88.77392-(0.75523)));
            yy = -6.84389 + (((tickAnim - 10) / 10) * (-19.61041-(-6.84389)));
            zz = -7.30919 + (((tickAnim - 10) / 10) * (-3.30735-(-7.30919)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -88.77392 + (((tickAnim - 20) / 3) * (-52.63394-(-88.77392)));
            yy = -19.61041 + (((tickAnim - 20) / 3) * (-16.09108-(-19.61041)));
            zz = -3.30735 + (((tickAnim - 20) / 3) * (-6.44096-(-3.30735)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -52.63394 + (((tickAnim - 23) / 2) * (-88.77392-(-52.63394)));
            yy = -16.09108 + (((tickAnim - 23) / 2) * (-19.61041-(-16.09108)));
            zz = -6.44096 + (((tickAnim - 23) / 2) * (-3.30735-(-6.44096)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -88.77392 + (((tickAnim - 25) / 3) * (-52.63394-(-88.77392)));
            yy = -19.61041 + (((tickAnim - 25) / 3) * (-16.09108-(-19.61041)));
            zz = -3.30735 + (((tickAnim - 25) / 3) * (-6.44096-(-3.30735)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = -52.63394 + (((tickAnim - 28) / 0) * (-52.63394-(-52.63394)));
            yy = -16.09108 + (((tickAnim - 28) / 0) * (-16.09108-(-16.09108)));
            zz = -6.44096 + (((tickAnim - 28) / 0) * (-6.44096-(-6.44096)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -52.63394 + (((tickAnim - 28) / 2) * (-88.77392-(-52.63394)));
            yy = -16.09108 + (((tickAnim - 28) / 2) * (-19.61041-(-16.09108)));
            zz = -6.44096 + (((tickAnim - 28) / 2) * (-3.30735-(-6.44096)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -88.77392 + (((tickAnim - 30) / 5) * (-15.33054-(-88.77392)));
            yy = -19.61041 + (((tickAnim - 30) / 5) * (-23.2367-(-19.61041)));
            zz = -3.30735 + (((tickAnim - 30) / 5) * (-12.41119-(-3.30735)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.33054 + (((tickAnim - 35) / 15) * (0-(-15.33054)));
            yy = -23.2367 + (((tickAnim - 35) / 15) * (0-(-23.2367)));
            zz = -12.41119 + (((tickAnim - 35) / 15) * (0-(-12.41119)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (33.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 33.75 + (((tickAnim - 15) / 5) * (17.5-(33.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 17.5 + (((tickAnim - 20) / 3) * (30-(17.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 30 + (((tickAnim - 23) / 2) * (17.5-(30)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 17.5 + (((tickAnim - 25) / 3) * (30-(17.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 30 + (((tickAnim - 28) / 2) * (17.5-(30)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 30) / 3) * (30-(17.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 30 + (((tickAnim - 33) / 2) * (20.23-(30)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 20.23 + (((tickAnim - 35) / 15) * (0-(20.23)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 20) / 5) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -17.5 + (((tickAnim - 25) / 5) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -17.5 + (((tickAnim - 30) / 5) * (-5.43-(-17.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.43 + (((tickAnim - 35) / 15) * (0-(-5.43)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-20-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 20) / 13) * (5-(5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = -20 + (((tickAnim - 20) / 13) * (-20-(-20)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 33) / 17) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -20 + (((tickAnim - 33) / 17) * (0-(-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -7.5 + (((tickAnim - 20) / 13) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 33) / 17) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL2, KneeL2.rotateAngleX + (float) Math.toRadians(xx), KneeL2.rotateAngleY + (float) Math.toRadians(yy), KneeL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 20) / 13) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 33) / 17) * (0-(7.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL2, MetatarsalL2.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL2.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.05459-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-13.88001-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (16.05482-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -1.05459 + (((tickAnim - 20) / 13) * (-1.05459-(-1.05459)));
            yy = -13.88001 + (((tickAnim - 20) / 13) * (-13.88001-(-13.88001)));
            zz = 16.05482 + (((tickAnim - 20) / 13) * (16.05482-(16.05482)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -1.05459 + (((tickAnim - 33) / 17) * (0-(-1.05459)));
            yy = -13.88001 + (((tickAnim - 33) / 17) * (0-(-13.88001)));
            zz = 16.05482 + (((tickAnim - 33) / 17) * (0-(16.05482)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.67102-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (20.97538-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.13124-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2.67102 + (((tickAnim - 20) / 3) * (4.82898-(-2.67102)));
            yy = 20.97538 + (((tickAnim - 20) / 3) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 20) / 3) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 4.82898 + (((tickAnim - 23) / 5) * (-4.45673-(4.82898)));
            yy = 20.97538 + (((tickAnim - 23) / 5) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 23) / 5) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -4.45673 + (((tickAnim - 28) / 3) * (-2.67102-(-4.45673)));
            yy = 20.97538 + (((tickAnim - 28) / 3) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 28) / 3) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -2.67102 + (((tickAnim - 31) / 2) * (-2.67102-(-2.67102)));
            yy = 20.97538 + (((tickAnim - 31) / 2) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 31) / 2) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -2.67102 + (((tickAnim - 33) / 17) * (0-(-2.67102)));
            yy = 20.97538 + (((tickAnim - 33) / 17) * (0-(20.97538)));
            zz = -1.13124 + (((tickAnim - 33) / 17) * (0-(-1.13124)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.67102-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (20.97538-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.13124-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2.67102 + (((tickAnim - 20) / 3) * (-0.17102-(-2.67102)));
            yy = 20.97538 + (((tickAnim - 20) / 3) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 20) / 3) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0.17102 + (((tickAnim - 23) / 5) * (-9.45673-(-0.17102)));
            yy = 20.97538 + (((tickAnim - 23) / 5) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 23) / 5) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -9.45673 + (((tickAnim - 28) / 3) * (2.32898-(-9.45673)));
            yy = 20.97538 + (((tickAnim - 28) / 3) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 28) / 3) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 2.32898 + (((tickAnim - 31) / 2) * (-2.67102-(2.32898)));
            yy = 20.97538 + (((tickAnim - 31) / 2) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 31) / 2) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -2.67102 + (((tickAnim - 33) / 17) * (0-(-2.67102)));
            yy = 20.97538 + (((tickAnim - 33) / 17) * (0-(20.97538)));
            zz = -1.13124 + (((tickAnim - 33) / 17) * (0-(-1.13124)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.67102-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (20.97538-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.13124-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2.67102 + (((tickAnim - 20) / 3) * (-2.67102-(-2.67102)));
            yy = 20.97538 + (((tickAnim - 20) / 3) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 20) / 3) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -2.67102 + (((tickAnim - 23) / 5) * (-9.45673-(-2.67102)));
            yy = 20.97538 + (((tickAnim - 23) / 5) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 23) / 5) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -9.45673 + (((tickAnim - 28) / 3) * (-2.67102-(-9.45673)));
            yy = 20.97538 + (((tickAnim - 28) / 3) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 28) / 3) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -2.67102 + (((tickAnim - 31) / 2) * (-2.67102-(-2.67102)));
            yy = 20.97538 + (((tickAnim - 31) / 2) * (20.97538-(20.97538)));
            zz = -1.13124 + (((tickAnim - 31) / 2) * (-1.13124-(-1.13124)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -2.67102 + (((tickAnim - 33) / 17) * (0-(-2.67102)));
            yy = 20.97538 + (((tickAnim - 33) / 17) * (0-(20.97538)));
            zz = -1.13124 + (((tickAnim - 33) / 17) * (0-(-1.13124)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-5.26-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (22.5-(0)));
            yy = -5.26 + (((tickAnim - 11) / 9) * (13.75-(-5.26)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 20) / 3) * (20-(22.5)));
            yy = 13.75 + (((tickAnim - 20) / 3) * (13.75-(13.75)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 20 + (((tickAnim - 23) / 5) * (7.5-(20)));
            yy = 13.75 + (((tickAnim - 23) / 5) * (13.75-(13.75)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 7.5 + (((tickAnim - 28) / 3) * (12.5-(7.5)));
            yy = 13.75 + (((tickAnim - 28) / 3) * (13.75-(13.75)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 12.5 + (((tickAnim - 31) / 2) * (22.5-(12.5)));
            yy = 13.75 + (((tickAnim - 31) / 2) * (13.75-(13.75)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 22.5 + (((tickAnim - 33) / 6) * (5.76665-(22.5)));
            yy = 13.75 + (((tickAnim - 33) / 6) * (7.70139-(13.75)));
            zz = 0 + (((tickAnim - 33) / 6) * (-0.05446-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 5.76665 + (((tickAnim - 39) / 11) * (0-(5.76665)));
            yy = 7.70139 + (((tickAnim - 39) / 11) * (0-(7.70139)));
            zz = -0.05446 + (((tickAnim - 39) / 11) * (0-(-0.05446)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (2.55512-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.6139-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (2.49989-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 2.55512 + (((tickAnim - 7) / 6) * (5-(2.55512)));
            yy = -2.6139 + (((tickAnim - 7) / 6) * (-4.6875-(-2.6139)));
            zz = 2.49989 + (((tickAnim - 7) / 6) * (0-(2.49989)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 13) / 7) * (0-(5)));
            yy = -4.6875 + (((tickAnim - 13) / 7) * (-7.5-(-4.6875)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (5-(0)));
            yy = -7.5 + (((tickAnim - 20) / 7) * (-7.5-(-7.5)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 27) / 6) * (0-(5)));
            yy = -7.5 + (((tickAnim - 27) / 6) * (-7.5-(-7.5)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (7.22222-(0)));
            yy = -7.5 + (((tickAnim - 33) / 4) * (-6-(-7.5)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 7.22222 + (((tickAnim - 37) / 4) * (5-(7.22222)));
            yy = -6 + (((tickAnim - 37) / 4) * (-4.125-(-6)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 5 + (((tickAnim - 41) / 5) * (-0.22727-(5)));
            yy = -4.125 + (((tickAnim - 41) / 5) * (-1.875-(-4.125)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -0.22727 + (((tickAnim - 46) / 4) * (0-(-0.22727)));
            yy = -1.875 + (((tickAnim - 46) / 4) * (0-(-1.875)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.7427-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.15627-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.74365-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.7427 + (((tickAnim - 5) / 5) * (1.4854-(5.7427)));
            yy = 0.15627 + (((tickAnim - 5) / 5) * (0.31254-(0.15627)));
            zz = -1.74365 + (((tickAnim - 5) / 5) * (-3.4873-(-1.74365)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 1.4854 + (((tickAnim - 10) / 4) * (-2.94336-(1.4854)));
            yy = 0.31254 + (((tickAnim - 10) / 4) * (0.27688-(0.31254)));
            zz = -3.4873 + (((tickAnim - 10) / 4) * (1.60837-(-3.4873)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -2.94336 + (((tickAnim - 14) / 6) * (3.02696-(-2.94336)));
            yy = 0.27688 + (((tickAnim - 14) / 6) * (0.232-(0.27688)));
            zz = 1.60837 + (((tickAnim - 14) / 6) * (8.02037-(1.60837)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 3.02696 + (((tickAnim - 20) / 8) * (8.59954-(3.02696)));
            yy = 0.232 + (((tickAnim - 20) / 8) * (0.98237-(0.232)));
            zz = 8.02037 + (((tickAnim - 20) / 8) * (3.07668-(8.02037)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 8.59954 + (((tickAnim - 28) / 5) * (13.02696-(8.59954)));
            yy = 0.98237 + (((tickAnim - 28) / 5) * (0.232-(0.98237)));
            zz = 3.07668 + (((tickAnim - 28) / 5) * (8.02037-(3.07668)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 13.02696 + (((tickAnim - 33) / 4) * (0.40772-(13.02696)));
            yy = 0.232 + (((tickAnim - 33) / 4) * (0.41202-(0.232)));
            zz = 8.02037 + (((tickAnim - 33) / 4) * (4.4291-(8.02037)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0.40772 + (((tickAnim - 37) / 5) * (6.47886-(0.40772)));
            yy = 0.41202 + (((tickAnim - 37) / 5) * (0.68204-(0.41202)));
            zz = 4.4291 + (((tickAnim - 37) / 5) * (-0.95781-(4.4291)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 6.47886 + (((tickAnim - 42) / 3) * (9.5352-(6.47886)));
            yy = 0.68204 + (((tickAnim - 42) / 3) * (0.47743-(0.68204)));
            zz = -0.95781 + (((tickAnim - 42) / 3) * (-0.67047-(-0.95781)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 9.5352 + (((tickAnim - 45) / 5) * (0-(9.5352)));
            yy = 0.47743 + (((tickAnim - 45) / 5) * (0-(0.47743)));
            zz = -0.67047 + (((tickAnim - 45) / 5) * (0-(-0.67047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-43.08538-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (10.66034-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-2.53014-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -43.08538 + (((tickAnim - 11) / 5) * (-40.38353-(-43.08538)));
            yy = 10.66034 + (((tickAnim - 11) / 5) * (15.5805-(10.66034)));
            zz = -2.53014 + (((tickAnim - 11) / 5) * (-3.69789-(-2.53014)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -40.38353 + (((tickAnim - 16) / 4) * (-56.46533-(-40.38353)));
            yy = 15.5805 + (((tickAnim - 16) / 4) * (19.68063-(15.5805)));
            zz = -3.69789 + (((tickAnim - 16) / 4) * (-4.67102-(-3.69789)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -56.46533 + (((tickAnim - 20) / 6) * (-38.96533-(-56.46533)));
            yy = 19.68063 + (((tickAnim - 20) / 6) * (19.68063-(19.68063)));
            zz = -4.67102 + (((tickAnim - 20) / 6) * (-4.67102-(-4.67102)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -38.96533 + (((tickAnim - 26) / 6) * (-56.46533-(-38.96533)));
            yy = 19.68063 + (((tickAnim - 26) / 6) * (19.68063-(19.68063)));
            zz = -4.67102 + (((tickAnim - 26) / 6) * (-4.67102-(-4.67102)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -56.46533 + (((tickAnim - 32) / 6) * (-48.49909-(-56.46533)));
            yy = 19.68063 + (((tickAnim - 32) / 6) * (13.41861-(19.68063)));
            zz = -4.67102 + (((tickAnim - 32) / 6) * (-3.18479-(-4.67102)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -48.49909 + (((tickAnim - 38) / 7) * (-39.39963-(-48.49909)));
            yy = 13.41861 + (((tickAnim - 38) / 7) * (5.36744-(13.41861)));
            zz = -3.18479 + (((tickAnim - 38) / 7) * (-1.27391-(-3.18479)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -39.39963 + (((tickAnim - 45) / 5) * (0-(-39.39963)));
            yy = 5.36744 + (((tickAnim - 45) / 5) * (0-(5.36744)));
            zz = -1.27391 + (((tickAnim - 45) / 5) * (0-(-1.27391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.21-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -0.21 + (((tickAnim - 8) / 6) * (13.64-(-0.21)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 13.64 + (((tickAnim - 14) / 6) * (-12.5-(13.64)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -12.5 + (((tickAnim - 20) / 4) * (15-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 15 + (((tickAnim - 24) / 8) * (-12.5-(15)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -12.5 + (((tickAnim - 32) / 5) * (-11.59-(-12.5)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -11.59 + (((tickAnim - 37) / 4) * (29.53-(-11.59)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = 29.53 + (((tickAnim - 41) / 6) * (-6.76-(29.53)));
            yy = 0 + (((tickAnim - 41) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -6.76 + (((tickAnim - 47) / 3) * (0-(-6.76)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-33.66834-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.06224-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.13705-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -33.66834 + (((tickAnim - 8) / 5) * (-39.96594-(-33.66834)));
            yy = 2.06224 + (((tickAnim - 8) / 5) * (3.66621-(2.06224)));
            zz = 0.13705 + (((tickAnim - 8) / 5) * (0.24365-(0.13705)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -39.96594 + (((tickAnim - 13) / 7) * (-36.4489-(-39.96594)));
            yy = 3.66621 + (((tickAnim - 13) / 7) * (5.49931-(3.66621)));
            zz = 0.24365 + (((tickAnim - 13) / 7) * (0.36548-(0.24365)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -36.4489 + (((tickAnim - 20) / 4) * (-36.42966-(-36.4489)));
            yy = 5.49931 + (((tickAnim - 20) / 4) * (5.25911-(5.49931)));
            zz = 0.36548 + (((tickAnim - 20) / 4) * (-2.11778-(0.36548)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -36.42966 + (((tickAnim - 24) / 6) * (-36.4489-(-36.42966)));
            yy = 5.25911 + (((tickAnim - 24) / 6) * (5.49931-(5.25911)));
            zz = -2.11778 + (((tickAnim - 24) / 6) * (0.36548-(-2.11778)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -36.4489 + (((tickAnim - 30) / 7) * (-31.79927-(-36.4489)));
            yy = 5.49931 + (((tickAnim - 30) / 7) * (3.66621-(5.49931)));
            zz = 0.36548 + (((tickAnim - 30) / 7) * (0.24365-(0.36548)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -31.79927 + (((tickAnim - 37) / 5) * (-33.39963-(-31.79927)));
            yy = 3.66621 + (((tickAnim - 37) / 5) * (1.8331-(3.66621)));
            zz = 0.24365 + (((tickAnim - 37) / 5) * (0.12183-(0.24365)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -33.39963 + (((tickAnim - 42) / 4) * (-29.19982-(-33.39963)));
            yy = 1.8331 + (((tickAnim - 42) / 4) * (0.91655-(1.8331)));
            zz = 0.12183 + (((tickAnim - 42) / 4) * (0.06091-(0.12183)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -29.19982 + (((tickAnim - 46) / 4) * (0-(-29.19982)));
            yy = 0.91655 + (((tickAnim - 46) / 4) * (0-(0.91655)));
            zz = 0.06091 + (((tickAnim - 46) / 4) * (0-(0.06091)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (32.92-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 32.92 + (((tickAnim - 6) / 9) * (7.5-(32.92)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 15) / 3) * (-13.72-(7.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -13.72 + (((tickAnim - 18) / 5) * (-1.79-(-13.72)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -1.79 + (((tickAnim - 23) / 5) * (1.05-(-1.79)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 1.05 + (((tickAnim - 28) / 4) * (-10.61-(1.05)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -10.61 + (((tickAnim - 32) / 5) * (15.65-(-10.61)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 15.65 + (((tickAnim - 37) / 6) * (-22.15596-(15.65)));
            yy = 0 + (((tickAnim - 37) / 6) * (0.48024-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0.84839-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -22.15596 + (((tickAnim - 43) / 3) * (6.15252-(-22.15596)));
            yy = 0.48024 + (((tickAnim - 43) / 3) * (0.30015-(0.48024)));
            zz = 0.84839 + (((tickAnim - 43) / 3) * (0.53025-(0.84839)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 6.15252 + (((tickAnim - 46) / 4) * (0-(6.15252)));
            yy = 0.30015 + (((tickAnim - 46) / 4) * (0-(0.30015)));
            zz = 0.53025 + (((tickAnim - 46) / 4) * (0-(0.53025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (11.09105-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-5.783-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.75752-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 11.09105 + (((tickAnim - 3) / 7) * (18.27315-(11.09105)));
            yy = -5.783 + (((tickAnim - 3) / 7) * (-17.349-(-5.783)));
            zz = 0.75752 + (((tickAnim - 3) / 7) * (2.27256-(0.75752)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 18.27315 + (((tickAnim - 10) / 6) * (34.28539-(18.27315)));
            yy = -17.349 + (((tickAnim - 10) / 6) * (-18.84004-(-17.349)));
            zz = 2.27256 + (((tickAnim - 10) / 6) * (2.10604-(2.27256)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 34.28539 + (((tickAnim - 16) / 4) * (37.15128-(34.28539)));
            yy = -18.84004 + (((tickAnim - 16) / 4) * (-19.90506-(-18.84004)));
            zz = 2.10604 + (((tickAnim - 16) / 4) * (1.9871-(2.10604)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 37.15128 + (((tickAnim - 20) / 5) * (17.15128-(37.15128)));
            yy = -19.90506 + (((tickAnim - 20) / 5) * (-19.90506-(-19.90506)));
            zz = 1.9871 + (((tickAnim - 20) / 5) * (1.9871-(1.9871)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 17.15128 + (((tickAnim - 25) / 8) * (37.15128-(17.15128)));
            yy = -19.90506 + (((tickAnim - 25) / 8) * (-19.90506-(-19.90506)));
            zz = 1.9871 + (((tickAnim - 25) / 8) * (1.9871-(1.9871)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 37.15128 + (((tickAnim - 33) / 4) * (27.25882-(37.15128)));
            yy = -19.90506 + (((tickAnim - 33) / 4) * (-20.3546-(-19.90506)));
            zz = 1.9871 + (((tickAnim - 33) / 4) * (5.45779-(1.9871)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 27.25882 + (((tickAnim - 37) / 4) * (18.34973-(27.25882)));
            yy = -20.3546 + (((tickAnim - 37) / 4) * (-15.62721-(-20.3546)));
            zz = 5.45779 + (((tickAnim - 37) / 4) * (-0.71768-(5.45779)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 18.34973 + (((tickAnim - 41) / 9) * (0-(18.34973)));
            yy = -15.62721 + (((tickAnim - 41) / 9) * (0-(-15.62721)));
            zz = -0.71768 + (((tickAnim - 41) / 9) * (0-(-0.71768)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (16.95712-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-20.88453-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (9.18217-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 16.95712 + (((tickAnim - 4) / 6) * (4.43727-(16.95712)));
            yy = -20.88453 + (((tickAnim - 4) / 6) * (-24.16323-(-20.88453)));
            zz = 9.18217 + (((tickAnim - 4) / 6) * (6.52025-(9.18217)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 4.43727 + (((tickAnim - 10) / 4) * (17.35171-(4.43727)));
            yy = -24.16323 + (((tickAnim - 10) / 4) * (-24.32191-(-24.16323)));
            zz = 6.52025 + (((tickAnim - 10) / 4) * (5.84817-(6.52025)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 17.35171 + (((tickAnim - 14) / 6) * (11.43193-(17.35171)));
            yy = -24.32191 + (((tickAnim - 14) / 6) * (-24.54406-(-24.32191)));
            zz = 5.84817 + (((tickAnim - 14) / 6) * (4.90726-(5.84817)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 11.43193 + (((tickAnim - 20) / 7) * (10.63806-(11.43193)));
            yy = -24.54406 + (((tickAnim - 20) / 7) * (-17.3349-(-24.54406)));
            zz = 4.90726 + (((tickAnim - 20) / 7) * (7.12399-(4.90726)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 10.63806 + (((tickAnim - 27) / 4) * (1.13423-(10.63806)));
            yy = -17.3349 + (((tickAnim - 27) / 4) * (-21.84063-(-17.3349)));
            zz = 7.12399 + (((tickAnim - 27) / 4) * (5.73854-(7.12399)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 1.13423 + (((tickAnim - 31) / 2) * (11.43193-(1.13423)));
            yy = -21.84063 + (((tickAnim - 31) / 2) * (-24.54406-(-21.84063)));
            zz = 5.73854 + (((tickAnim - 31) / 2) * (4.90726-(5.73854)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 11.43193 + (((tickAnim - 33) / 6) * (15.43094-(11.43193)));
            yy = -24.54406 + (((tickAnim - 33) / 6) * (-27.9864-(-24.54406)));
            zz = 4.90726 + (((tickAnim - 33) / 6) * (6.75796-(4.90726)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 15.43094 + (((tickAnim - 39) / 5) * (6.87998-(15.43094)));
            yy = -27.9864 + (((tickAnim - 39) / 5) * (-27.54615-(-27.9864)));
            zz = 6.75796 + (((tickAnim - 39) / 5) * (17.55624-(6.75796)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 6.87998 + (((tickAnim - 44) / 6) * (0-(6.87998)));
            yy = -27.54615 + (((tickAnim - 44) / 6) * (0-(-27.54615)));
            zz = 17.55624 + (((tickAnim - 44) / 6) * (0-(17.55624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20.78058-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-25.79442-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.60721-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20.78058 + (((tickAnim - 10) / 10) * (-43.3724-(-20.78058)));
            yy = -25.79442 + (((tickAnim - 10) / 10) * (-22.07405-(-25.79442)));
            zz = -0.60721 + (((tickAnim - 10) / 10) * (4.47051-(-0.60721)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -43.3724 + (((tickAnim - 20) / 13) * (-43.3724-(-43.3724)));
            yy = -22.07405 + (((tickAnim - 20) / 13) * (-22.07405-(-22.07405)));
            zz = 4.47051 + (((tickAnim - 20) / 13) * (4.47051-(4.47051)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -43.3724 + (((tickAnim - 33) / 17) * (0-(-43.3724)));
            yy = -22.07405 + (((tickAnim - 33) / 17) * (0-(-22.07405)));
            zz = 4.47051 + (((tickAnim - 33) / 17) * (0-(4.47051)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.59145-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (17.13745-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-6.83529-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -5.59145 + (((tickAnim - 3) / 7) * (-11.38998-(-5.59145)));
            yy = 17.13745 + (((tickAnim - 3) / 7) * (-35.6464-(17.13745)));
            zz = -6.83529 + (((tickAnim - 3) / 7) * (4.05093-(-6.83529)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.38998 + (((tickAnim - 10) / 10) * (-23.40127-(-11.38998)));
            yy = -35.6464 + (((tickAnim - 10) / 10) * (-31.31275-(-35.6464)));
            zz = 4.05093 + (((tickAnim - 10) / 10) * (9.51531-(4.05093)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -23.40127 + (((tickAnim - 20) / 1) * (-22.93277-(-23.40127)));
            yy = -31.31275 + (((tickAnim - 20) / 1) * (-26.38538-(-31.31275)));
            zz = 9.51531 + (((tickAnim - 20) / 1) * (8.54525-(9.51531)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -22.93277 + (((tickAnim - 21) / 1) * (-23.40127-(-22.93277)));
            yy = -26.38538 + (((tickAnim - 21) / 1) * (-31.31275-(-26.38538)));
            zz = 8.54525 + (((tickAnim - 21) / 1) * (9.51531-(8.54525)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -23.40127 + (((tickAnim - 22) / 4) * (-22.93277-(-23.40127)));
            yy = -31.31275 + (((tickAnim - 22) / 4) * (-26.38538-(-31.31275)));
            zz = 9.51531 + (((tickAnim - 22) / 4) * (8.54525-(9.51531)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = -22.93277 + (((tickAnim - 26) / 1) * (-23.40127-(-22.93277)));
            yy = -26.38538 + (((tickAnim - 26) / 1) * (-31.31275-(-26.38538)));
            zz = 8.54525 + (((tickAnim - 26) / 1) * (9.51531-(8.54525)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -23.40127 + (((tickAnim - 27) / 3) * (-22.93277-(-23.40127)));
            yy = -31.31275 + (((tickAnim - 27) / 3) * (-26.38538-(-31.31275)));
            zz = 9.51531 + (((tickAnim - 27) / 3) * (8.54525-(9.51531)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -22.93277 + (((tickAnim - 30) / 1) * (-23.40127-(-22.93277)));
            yy = -26.38538 + (((tickAnim - 30) / 1) * (-31.31275-(-26.38538)));
            zz = 8.54525 + (((tickAnim - 30) / 1) * (9.51531-(8.54525)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -23.40127 + (((tickAnim - 31) / 2) * (-23.40127-(-23.40127)));
            yy = -31.31275 + (((tickAnim - 31) / 2) * (-31.31275-(-31.31275)));
            zz = 9.51531 + (((tickAnim - 31) / 2) * (9.51531-(9.51531)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.40127 + (((tickAnim - 33) / 17) * (0-(-23.40127)));
            yy = -31.31275 + (((tickAnim - 33) / 17) * (0-(-31.31275)));
            zz = 9.51531 + (((tickAnim - 33) / 17) * (0-(9.51531)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (120-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -5 + (((tickAnim - 10) / 5) * (0-(-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 120 + (((tickAnim - 15) / 5) * (45-(120)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 45 + (((tickAnim - 20) / 3) * (105-(45)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 105 + (((tickAnim - 23) / 1) * (120-(105)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 120 + (((tickAnim - 24) / 1) * (45-(120)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 45 + (((tickAnim - 25) / 3) * (105-(45)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 105 + (((tickAnim - 28) / 1) * (120-(105)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 120 + (((tickAnim - 29) / 1) * (45-(120)));
            yy = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 45 + (((tickAnim - 30) / 3) * (105-(45)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 105 + (((tickAnim - 33) / 2) * (23.18-(105)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23.18 + (((tickAnim - 35) / 15) * (0-(23.18)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 17.5 + (((tickAnim - 10) / 11) * (12.5-(17.5)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 21) / 9) * (3.5-(12.5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 30) / 20) * (27.5-(3.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 27.5 + (((tickAnim - 50) / 10) * (0-(27.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 10 + (((tickAnim - 10) / 6) * (8.6864-(10)));
            yy = 0 + (((tickAnim - 10) / 6) * (-4.94293-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (-0.75419-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 8.6864 + (((tickAnim - 16) / 5) * (7.5-(8.6864)));
            yy = -4.94293 + (((tickAnim - 16) / 5) * (0-(-4.94293)));
            zz = -0.75419 + (((tickAnim - 16) / 5) * (0-(-0.75419)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 7.5 + (((tickAnim - 21) / 7) * (0.26876-(7.5)));
            yy = 0 + (((tickAnim - 21) / 7) * (2.49997-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0.01172-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0.26876 + (((tickAnim - 28) / 10) * (-8.57-(0.26876)));
            yy = 2.49997 + (((tickAnim - 28) / 10) * (0-(2.49997)));
            zz = 0.01172 + (((tickAnim - 28) / 10) * (0-(0.01172)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -8.57 + (((tickAnim - 38) / 5) * (3.62487-(-8.57)));
            yy = 0 + (((tickAnim - 38) / 5) * (10.19614-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0.25304-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.62487 + (((tickAnim - 43) / 7) * (17.43908-(3.62487)));
            yy = 10.19614 + (((tickAnim - 43) / 7) * (0.46229-(10.19614)));
            zz = 0.25304 + (((tickAnim - 43) / 7) * (-0.80574-(0.25304)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 17.43908 + (((tickAnim - 50) / 10) * (0-(17.43908)));
            yy = 0.46229 + (((tickAnim - 50) / 10) * (0-(0.46229)));
            zz = -0.80574 + (((tickAnim - 50) / 10) * (0-(-0.80574)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -5 + (((tickAnim - 10) / 6) * (0.39562-(-5)));
            yy = 0 + (((tickAnim - 10) / 6) * (-4.99365-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (-0.25226-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0.39562 + (((tickAnim - 16) / 5) * (5-(0.39562)));
            yy = -4.99365 + (((tickAnim - 16) / 5) * (0-(-4.99365)));
            zz = -0.25226 + (((tickAnim - 16) / 5) * (0-(-0.25226)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = 5 + (((tickAnim - 21) / 17) * (-10.71-(5)));
            yy = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 17) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -10.71 + (((tickAnim - 38) / 5) * (-2.42486-(-10.71)));
            yy = 0 + (((tickAnim - 38) / 5) * (9.99999-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0.01305-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -2.42486 + (((tickAnim - 43) / 7) * (10-(-2.42486)));
            yy = 9.99999 + (((tickAnim - 43) / 7) * (0-(9.99999)));
            zz = 0.01305 + (((tickAnim - 43) / 7) * (0-(0.01305)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 50) / 10) * (0-(10)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 17.5 + (((tickAnim - 10) / 6) * (21.72213-(17.5)));
            yy = 0 + (((tickAnim - 10) / 6) * (-6.84628-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (-3.06975-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 21.72213 + (((tickAnim - 16) / 5) * (25-(21.72213)));
            yy = -6.84628 + (((tickAnim - 16) / 5) * (0-(-6.84628)));
            zz = -3.06975 + (((tickAnim - 16) / 5) * (0-(-3.06975)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = 25 + (((tickAnim - 21) / 17) * (0.71-(25)));
            yy = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 17) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0.71 + (((tickAnim - 38) / 7) * (10.83293-(0.71)));
            yy = 0 + (((tickAnim - 38) / 7) * (4.86589-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (1.15166-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 10.83293 + (((tickAnim - 45) / 5) * (17.5-(10.83293)));
            yy = 4.86589 + (((tickAnim - 45) / 5) * (0-(4.86589)));
            zz = 1.15166 + (((tickAnim - 45) / 5) * (0-(1.15166)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 17.5 + (((tickAnim - 50) / 10) * (0-(17.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 42) {
            xx = 5 + (((tickAnim - 18) / 24) * (-5.3-(5)));
            yy = 0 + (((tickAnim - 18) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 24) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = -5.3 + (((tickAnim - 42) / 18) * (0-(-5.3)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 5) / 10) * (-5-(-5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -5 + (((tickAnim - 15) / 7) * (0-(-5)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 29) / 6) * (0-(-5)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (15-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 15 + (((tickAnim - 45) / 5) * (20-(15)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 20 + (((tickAnim - 50) / 5) * (15-(20)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 15 + (((tickAnim - 55) / 5) * (0-(15)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -22.5 + (((tickAnim - 5) / 10) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 15) / 5) * (-21.27816-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (-18.98917-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.39385-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -21.27816 + (((tickAnim - 20) / 7) * (-13.77816-(-21.27816)));
            yy = -18.98917 + (((tickAnim - 20) / 7) * (-18.98917-(-18.98917)));
            zz = -0.39385 + (((tickAnim - 20) / 7) * (-0.39385-(-0.39385)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -13.77816 + (((tickAnim - 27) / 8) * (-21.27816-(-13.77816)));
            yy = -18.98917 + (((tickAnim - 27) / 8) * (-18.98917-(-18.98917)));
            zz = -0.39385 + (((tickAnim - 27) / 8) * (-0.39385-(-0.39385)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -21.27816 + (((tickAnim - 35) / 10) * (-20.97515-(-21.27816)));
            yy = -18.98917 + (((tickAnim - 35) / 10) * (4.65129-(-18.98917)));
            zz = -0.39385 + (((tickAnim - 35) / 10) * (-2.12222-(-0.39385)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -20.97515 + (((tickAnim - 45) / 10) * (-20.97515-(-20.97515)));
            yy = 4.65129 + (((tickAnim - 45) / 10) * (4.65129-(4.65129)));
            zz = -2.12222 + (((tickAnim - 45) / 10) * (-2.12222-(-2.12222)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -20.97515 + (((tickAnim - 55) / 5) * (0-(-20.97515)));
            yy = 4.65129 + (((tickAnim - 55) / 5) * (0-(4.65129)));
            zz = -2.12222 + (((tickAnim - 55) / 5) * (0-(-2.12222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 5) / 10) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 15) / 5) * (1.41741-(-2.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (-31.67251-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-12.95635-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1.41741 + (((tickAnim - 20) / 15) * (1.41741-(1.41741)));
            yy = -31.67251 + (((tickAnim - 20) / 15) * (-31.67251-(-31.67251)));
            zz = -12.95635 + (((tickAnim - 20) / 15) * (-12.95635-(-12.95635)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 1.41741 + (((tickAnim - 35) / 10) * (1.41741-(1.41741)));
            yy = -31.67251 + (((tickAnim - 35) / 10) * (31.67251-(-31.67251)));
            zz = -12.95635 + (((tickAnim - 35) / 10) * (12.95635-(-12.95635)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 1.41741 + (((tickAnim - 45) / 10) * (1.41741-(1.41741)));
            yy = 31.67251 + (((tickAnim - 45) / 10) * (31.67251-(31.67251)));
            zz = 12.95635 + (((tickAnim - 45) / 10) * (12.95635-(12.95635)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 1.41741 + (((tickAnim - 55) / 5) * (0-(1.41741)));
            yy = 31.67251 + (((tickAnim - 55) / 5) * (0-(31.67251)));
            zz = 12.95635 + (((tickAnim - 55) / 5) * (0-(12.95635)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 12.5 + (((tickAnim - 5) / 10) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 15) / 5) * (14.93158-(12.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (-21.85015-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-7.43158-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 14.93158 + (((tickAnim - 20) / 15) * (14.93158-(14.93158)));
            yy = -21.85015 + (((tickAnim - 20) / 15) * (-21.85015-(-21.85015)));
            zz = -7.43158 + (((tickAnim - 20) / 15) * (-7.43158-(-7.43158)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 14.93158 + (((tickAnim - 35) / 10) * (14.93158-(14.93158)));
            yy = -21.85015 + (((tickAnim - 35) / 10) * (21.85015-(-21.85015)));
            zz = -7.43158 + (((tickAnim - 35) / 10) * (7.43158-(-7.43158)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 14.93158 + (((tickAnim - 45) / 10) * (14.93158-(14.93158)));
            yy = 21.85015 + (((tickAnim - 45) / 10) * (21.85015-(21.85015)));
            zz = 7.43158 + (((tickAnim - 45) / 10) * (7.43158-(7.43158)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 14.93158 + (((tickAnim - 55) / 5) * (0-(14.93158)));
            yy = 21.85015 + (((tickAnim - 55) / 5) * (0-(21.85015)));
            zz = 7.43158 + (((tickAnim - 55) / 5) * (0-(7.43158)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 12.5 + (((tickAnim - 5) / 10) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 15) / 5) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 12.5 + (((tickAnim - 20) / 7) * (6.02063-(12.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (-15.28897-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (-2.51814-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 6.02063 + (((tickAnim - 27) / 8) * (6.02063-(6.02063)));
            yy = -15.28897 + (((tickAnim - 27) / 8) * (-15.28897-(-15.28897)));
            zz = -2.51814 + (((tickAnim - 27) / 8) * (-2.51814-(-2.51814)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 6.02063 + (((tickAnim - 35) / 10) * (6.02063-(6.02063)));
            yy = -15.28897 + (((tickAnim - 35) / 10) * (15.28897-(-15.28897)));
            zz = -2.51814 + (((tickAnim - 35) / 10) * (2.51814-(-2.51814)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 6.02063 + (((tickAnim - 45) / 10) * (6.02063-(6.02063)));
            yy = 15.28897 + (((tickAnim - 45) / 10) * (15.28897-(15.28897)));
            zz = 2.51814 + (((tickAnim - 45) / 10) * (2.51814-(2.51814)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 6.02063 + (((tickAnim - 55) / 5) * (0-(6.02063)));
            yy = 15.28897 + (((tickAnim - 55) / 5) * (0-(15.28897)));
            zz = 2.51814 + (((tickAnim - 55) / 5) * (0-(2.51814)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle1(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = -10 + (((tickAnim - 20) / 13) * (-10-(-10)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Compsognathus, Compsognathus.rotateAngleX + (float) Math.toRadians(xx), Compsognathus.rotateAngleY + (float) Math.toRadians(yy), Compsognathus.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 3.8 + (((tickAnim - 20) / 13) * (3.8-(3.8)));
            yy = -0.3 + (((tickAnim - 20) / 13) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 3.8 + (((tickAnim - 33) / 17) * (0-(3.8)));
            yy = -0.3 + (((tickAnim - 33) / 17) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Compsognathus.rotationPointX = this.Compsognathus.rotationPointX + (float)(xx);
        this.Compsognathus.rotationPointY = this.Compsognathus.rotationPointY - (float)(yy);
        this.Compsognathus.rotationPointZ = this.Compsognathus.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (20-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 20) / 13) * (5-(5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 20 + (((tickAnim - 20) / 13) * (20-(20)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 33) / 17) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 20 + (((tickAnim - 33) / 17) * (0-(20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -7.5 + (((tickAnim - 20) / 13) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 33) / 17) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 20) / 13) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 33) / 17) * (0-(7.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.05459-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (13.88001-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-16.05482-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -1.05459 + (((tickAnim - 20) / 13) * (-1.05459-(-1.05459)));
            yy = 13.88001 + (((tickAnim - 20) / 13) * (13.88001-(13.88001)));
            zz = -16.05482 + (((tickAnim - 20) / 13) * (-16.05482-(-16.05482)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -1.05459 + (((tickAnim - 33) / 17) * (0-(-1.05459)));
            yy = 13.88001 + (((tickAnim - 33) / 17) * (0-(13.88001)));
            zz = -16.05482 + (((tickAnim - 33) / 17) * (0-(-16.05482)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.75523-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (6.84389-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.30919-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.75523 + (((tickAnim - 10) / 10) * (-88.77392-(0.75523)));
            yy = 6.84389 + (((tickAnim - 10) / 10) * (19.61041-(6.84389)));
            zz = 7.30919 + (((tickAnim - 10) / 10) * (3.30735-(7.30919)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -88.77392 + (((tickAnim - 20) / 3) * (-52.63394-(-88.77392)));
            yy = 19.61041 + (((tickAnim - 20) / 3) * (16.09108-(19.61041)));
            zz = 3.30735 + (((tickAnim - 20) / 3) * (6.44096-(3.30735)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -52.63394 + (((tickAnim - 23) / 2) * (-88.77392-(-52.63394)));
            yy = 16.09108 + (((tickAnim - 23) / 2) * (19.61041-(16.09108)));
            zz = 6.44096 + (((tickAnim - 23) / 2) * (3.30735-(6.44096)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -88.77392 + (((tickAnim - 25) / 3) * (-52.63394-(-88.77392)));
            yy = 19.61041 + (((tickAnim - 25) / 3) * (16.09108-(19.61041)));
            zz = 3.30735 + (((tickAnim - 25) / 3) * (6.44096-(3.30735)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = -52.63394 + (((tickAnim - 28) / 0) * (-52.63394-(-52.63394)));
            yy = 16.09108 + (((tickAnim - 28) / 0) * (16.09108-(16.09108)));
            zz = 6.44096 + (((tickAnim - 28) / 0) * (6.44096-(6.44096)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -52.63394 + (((tickAnim - 28) / 2) * (-88.77392-(-52.63394)));
            yy = 16.09108 + (((tickAnim - 28) / 2) * (19.61041-(16.09108)));
            zz = 6.44096 + (((tickAnim - 28) / 2) * (3.30735-(6.44096)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -88.77392 + (((tickAnim - 30) / 5) * (-15.33054-(-88.77392)));
            yy = 19.61041 + (((tickAnim - 30) / 5) * (23.2367-(19.61041)));
            zz = 3.30735 + (((tickAnim - 30) / 5) * (12.41119-(3.30735)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.33054 + (((tickAnim - 35) / 15) * (0-(-15.33054)));
            yy = 23.2367 + (((tickAnim - 35) / 15) * (0-(23.2367)));
            zz = 12.41119 + (((tickAnim - 35) / 15) * (0-(12.41119)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (33.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 33.75 + (((tickAnim - 15) / 5) * (17.5-(33.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 17.5 + (((tickAnim - 20) / 3) * (30-(17.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 30 + (((tickAnim - 23) / 2) * (17.5-(30)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 17.5 + (((tickAnim - 25) / 3) * (30-(17.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 30 + (((tickAnim - 28) / 2) * (17.5-(30)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 30) / 3) * (30-(17.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 30 + (((tickAnim - 33) / 2) * (20.23-(30)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 20.23 + (((tickAnim - 35) / 15) * (0-(20.23)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL2, KneeL2.rotateAngleX + (float) Math.toRadians(xx), KneeL2.rotateAngleY + (float) Math.toRadians(yy), KneeL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 20) / 5) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -17.5 + (((tickAnim - 25) / 5) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -17.5 + (((tickAnim - 30) / 5) * (-5.43-(-17.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.43 + (((tickAnim - 35) / 15) * (0-(-5.43)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL2, MetatarsalL2.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL2.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (120-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -5 + (((tickAnim - 10) / 5) * (0-(-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 120 + (((tickAnim - 15) / 5) * (45-(120)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 45 + (((tickAnim - 20) / 3) * (105-(45)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 105 + (((tickAnim - 23) / 1) * (120-(105)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 120 + (((tickAnim - 24) / 1) * (45-(120)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 45 + (((tickAnim - 25) / 3) * (105-(45)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 105 + (((tickAnim - 28) / 1) * (120-(105)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 120 + (((tickAnim - 29) / 1) * (45-(120)));
            yy = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 45 + (((tickAnim - 30) / 3) * (105-(45)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 105 + (((tickAnim - 33) / 2) * (23.18-(105)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23.18 + (((tickAnim - 35) / 15) * (0-(23.18)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.67102-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-20.97538-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.13124-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2.67102 + (((tickAnim - 20) / 3) * (4.82898-(-2.67102)));
            yy = -20.97538 + (((tickAnim - 20) / 3) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 20) / 3) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 4.82898 + (((tickAnim - 23) / 5) * (-4.45673-(4.82898)));
            yy = -20.97538 + (((tickAnim - 23) / 5) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 23) / 5) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -4.45673 + (((tickAnim - 28) / 3) * (-2.67102-(-4.45673)));
            yy = -20.97538 + (((tickAnim - 28) / 3) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 28) / 3) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -2.67102 + (((tickAnim - 31) / 2) * (-2.67102-(-2.67102)));
            yy = -20.97538 + (((tickAnim - 31) / 2) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 31) / 2) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -2.67102 + (((tickAnim - 33) / 17) * (0-(-2.67102)));
            yy = -20.97538 + (((tickAnim - 33) / 17) * (0-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 33) / 17) * (0-(1.13124)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.67102-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-20.97538-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.13124-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2.67102 + (((tickAnim - 20) / 3) * (-0.17102-(-2.67102)));
            yy = -20.97538 + (((tickAnim - 20) / 3) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 20) / 3) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0.17102 + (((tickAnim - 23) / 5) * (-9.45673-(-0.17102)));
            yy = -20.97538 + (((tickAnim - 23) / 5) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 23) / 5) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -9.45673 + (((tickAnim - 28) / 3) * (2.32898-(-9.45673)));
            yy = -20.97538 + (((tickAnim - 28) / 3) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 28) / 3) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 2.32898 + (((tickAnim - 31) / 2) * (-2.67102-(2.32898)));
            yy = -20.97538 + (((tickAnim - 31) / 2) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 31) / 2) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -2.67102 + (((tickAnim - 33) / 17) * (0-(-2.67102)));
            yy = -20.97538 + (((tickAnim - 33) / 17) * (0-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 33) / 17) * (0-(1.13124)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.67102-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-20.97538-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.13124-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2.67102 + (((tickAnim - 20) / 3) * (-2.67102-(-2.67102)));
            yy = -20.97538 + (((tickAnim - 20) / 3) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 20) / 3) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -2.67102 + (((tickAnim - 23) / 5) * (-9.45673-(-2.67102)));
            yy = -20.97538 + (((tickAnim - 23) / 5) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 23) / 5) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -9.45673 + (((tickAnim - 28) / 3) * (-2.67102-(-9.45673)));
            yy = -20.97538 + (((tickAnim - 28) / 3) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 28) / 3) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -2.67102 + (((tickAnim - 31) / 2) * (-2.67102-(-2.67102)));
            yy = -20.97538 + (((tickAnim - 31) / 2) * (-20.97538-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 31) / 2) * (1.13124-(1.13124)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -2.67102 + (((tickAnim - 33) / 17) * (0-(-2.67102)));
            yy = -20.97538 + (((tickAnim - 33) / 17) * (0-(-20.97538)));
            zz = 1.13124 + (((tickAnim - 33) / 17) * (0-(1.13124)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (5.26-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (22.5-(0)));
            yy = 5.26 + (((tickAnim - 11) / 9) * (-13.75-(5.26)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 20) / 3) * (20-(22.5)));
            yy = -13.75 + (((tickAnim - 20) / 3) * (-13.75-(-13.75)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 20 + (((tickAnim - 23) / 5) * (7.5-(20)));
            yy = -13.75 + (((tickAnim - 23) / 5) * (-13.75-(-13.75)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 7.5 + (((tickAnim - 28) / 3) * (12.5-(7.5)));
            yy = -13.75 + (((tickAnim - 28) / 3) * (-13.75-(-13.75)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 12.5 + (((tickAnim - 31) / 2) * (22.5-(12.5)));
            yy = -13.75 + (((tickAnim - 31) / 2) * (-13.75-(-13.75)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 22.5 + (((tickAnim - 33) / 6) * (5.76665-(22.5)));
            yy = -13.75 + (((tickAnim - 33) / 6) * (-7.70139-(-13.75)));
            zz = 0 + (((tickAnim - 33) / 6) * (0.05446-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 5.76665 + (((tickAnim - 39) / 11) * (0-(5.76665)));
            yy = -7.70139 + (((tickAnim - 39) / 11) * (0-(-7.70139)));
            zz = 0.05446 + (((tickAnim - 39) / 11) * (0-(0.05446)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (2.55512-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (2.6139-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-2.49989-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 2.55512 + (((tickAnim - 7) / 6) * (5-(2.55512)));
            yy = 2.6139 + (((tickAnim - 7) / 6) * (4.6875-(2.6139)));
            zz = -2.49989 + (((tickAnim - 7) / 6) * (0-(-2.49989)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 13) / 7) * (0-(5)));
            yy = 4.6875 + (((tickAnim - 13) / 7) * (7.5-(4.6875)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (5-(0)));
            yy = 7.5 + (((tickAnim - 20) / 7) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 27) / 6) * (0-(5)));
            yy = 7.5 + (((tickAnim - 27) / 6) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (7.22222-(0)));
            yy = 7.5 + (((tickAnim - 33) / 4) * (6-(7.5)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 7.22222 + (((tickAnim - 37) / 4) * (5-(7.22222)));
            yy = 6 + (((tickAnim - 37) / 4) * (4.125-(6)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 5 + (((tickAnim - 41) / 5) * (-0.22727-(5)));
            yy = 4.125 + (((tickAnim - 41) / 5) * (1.875-(4.125)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -0.22727 + (((tickAnim - 46) / 4) * (0-(-0.22727)));
            yy = 1.875 + (((tickAnim - 46) / 4) * (0-(1.875)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.7427-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.15627-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.74365-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.7427 + (((tickAnim - 5) / 5) * (1.4854-(5.7427)));
            yy = -0.15627 + (((tickAnim - 5) / 5) * (-0.31254-(-0.15627)));
            zz = 1.74365 + (((tickAnim - 5) / 5) * (3.4873-(1.74365)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 1.4854 + (((tickAnim - 10) / 4) * (-2.94336-(1.4854)));
            yy = -0.31254 + (((tickAnim - 10) / 4) * (-0.27688-(-0.31254)));
            zz = 3.4873 + (((tickAnim - 10) / 4) * (-1.60837-(3.4873)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -2.94336 + (((tickAnim - 14) / 6) * (3.02696-(-2.94336)));
            yy = -0.27688 + (((tickAnim - 14) / 6) * (-0.232-(-0.27688)));
            zz = -1.60837 + (((tickAnim - 14) / 6) * (-8.02037-(-1.60837)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 3.02696 + (((tickAnim - 20) / 8) * (8.59954-(3.02696)));
            yy = -0.232 + (((tickAnim - 20) / 8) * (-0.98237-(-0.232)));
            zz = -8.02037 + (((tickAnim - 20) / 8) * (-3.07668-(-8.02037)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 8.59954 + (((tickAnim - 28) / 5) * (13.02696-(8.59954)));
            yy = -0.98237 + (((tickAnim - 28) / 5) * (-0.232-(-0.98237)));
            zz = -3.07668 + (((tickAnim - 28) / 5) * (-8.02037-(-3.07668)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 13.02696 + (((tickAnim - 33) / 4) * (0.40772-(13.02696)));
            yy = -0.232 + (((tickAnim - 33) / 4) * (-0.41202-(-0.232)));
            zz = -8.02037 + (((tickAnim - 33) / 4) * (-4.4291-(-8.02037)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0.40772 + (((tickAnim - 37) / 5) * (6.47886-(0.40772)));
            yy = -0.41202 + (((tickAnim - 37) / 5) * (-0.68204-(-0.41202)));
            zz = -4.4291 + (((tickAnim - 37) / 5) * (0.95781-(-4.4291)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 6.47886 + (((tickAnim - 42) / 3) * (9.5352-(6.47886)));
            yy = -0.68204 + (((tickAnim - 42) / 3) * (-0.47743-(-0.68204)));
            zz = 0.95781 + (((tickAnim - 42) / 3) * (0.67047-(0.95781)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 9.5352 + (((tickAnim - 45) / 5) * (0-(9.5352)));
            yy = -0.47743 + (((tickAnim - 45) / 5) * (0-(-0.47743)));
            zz = 0.67047 + (((tickAnim - 45) / 5) * (0-(0.67047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-43.08538-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-10.66034-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (2.53014-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -43.08538 + (((tickAnim - 11) / 5) * (-40.38353-(-43.08538)));
            yy = -10.66034 + (((tickAnim - 11) / 5) * (-15.5805-(-10.66034)));
            zz = 2.53014 + (((tickAnim - 11) / 5) * (3.69789-(2.53014)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -40.38353 + (((tickAnim - 16) / 4) * (-56.46533-(-40.38353)));
            yy = -15.5805 + (((tickAnim - 16) / 4) * (-19.68063-(-15.5805)));
            zz = 3.69789 + (((tickAnim - 16) / 4) * (4.67102-(3.69789)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -56.46533 + (((tickAnim - 20) / 6) * (-38.96533-(-56.46533)));
            yy = -19.68063 + (((tickAnim - 20) / 6) * (-19.68063-(-19.68063)));
            zz = 4.67102 + (((tickAnim - 20) / 6) * (4.67102-(4.67102)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -38.96533 + (((tickAnim - 26) / 6) * (-56.46533-(-38.96533)));
            yy = -19.68063 + (((tickAnim - 26) / 6) * (-19.68063-(-19.68063)));
            zz = 4.67102 + (((tickAnim - 26) / 6) * (4.67102-(4.67102)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -56.46533 + (((tickAnim - 32) / 6) * (-48.49909-(-56.46533)));
            yy = -19.68063 + (((tickAnim - 32) / 6) * (-13.41861-(-19.68063)));
            zz = 4.67102 + (((tickAnim - 32) / 6) * (3.18479-(4.67102)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -48.49909 + (((tickAnim - 38) / 7) * (-39.39963-(-48.49909)));
            yy = -13.41861 + (((tickAnim - 38) / 7) * (-5.36744-(-13.41861)));
            zz = 3.18479 + (((tickAnim - 38) / 7) * (1.27391-(3.18479)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -39.39963 + (((tickAnim - 45) / 5) * (0-(-39.39963)));
            yy = -5.36744 + (((tickAnim - 45) / 5) * (0-(-5.36744)));
            zz = 1.27391 + (((tickAnim - 45) / 5) * (0-(1.27391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.21-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -0.21 + (((tickAnim - 8) / 6) * (13.64-(-0.21)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 13.64 + (((tickAnim - 14) / 6) * (-12.5-(13.64)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -12.5 + (((tickAnim - 20) / 4) * (15-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 15 + (((tickAnim - 24) / 8) * (-12.5-(15)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -12.5 + (((tickAnim - 32) / 5) * (-11.59-(-12.5)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -11.59 + (((tickAnim - 37) / 4) * (29.53-(-11.59)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = 29.53 + (((tickAnim - 41) / 6) * (-6.76-(29.53)));
            yy = 0 + (((tickAnim - 41) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -6.76 + (((tickAnim - 47) / 3) * (0-(-6.76)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-33.66834-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.06224-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.13705-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -33.66834 + (((tickAnim - 8) / 5) * (-39.96594-(-33.66834)));
            yy = -2.06224 + (((tickAnim - 8) / 5) * (-3.66621-(-2.06224)));
            zz = -0.13705 + (((tickAnim - 8) / 5) * (-0.24365-(-0.13705)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -39.96594 + (((tickAnim - 13) / 7) * (-36.4489-(-39.96594)));
            yy = -3.66621 + (((tickAnim - 13) / 7) * (-5.49931-(-3.66621)));
            zz = -0.24365 + (((tickAnim - 13) / 7) * (-0.36548-(-0.24365)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -36.4489 + (((tickAnim - 20) / 4) * (-36.42966-(-36.4489)));
            yy = -5.49931 + (((tickAnim - 20) / 4) * (-5.25911-(-5.49931)));
            zz = -0.36548 + (((tickAnim - 20) / 4) * (2.11778-(-0.36548)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -36.42966 + (((tickAnim - 24) / 6) * (-36.4489-(-36.42966)));
            yy = -5.25911 + (((tickAnim - 24) / 6) * (-5.49931-(-5.25911)));
            zz = 2.11778 + (((tickAnim - 24) / 6) * (-0.36548-(2.11778)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -36.4489 + (((tickAnim - 30) / 7) * (-31.79927-(-36.4489)));
            yy = -5.49931 + (((tickAnim - 30) / 7) * (-3.66621-(-5.49931)));
            zz = -0.36548 + (((tickAnim - 30) / 7) * (-0.24365-(-0.36548)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -31.79927 + (((tickAnim - 37) / 5) * (-33.39963-(-31.79927)));
            yy = -3.66621 + (((tickAnim - 37) / 5) * (-1.8331-(-3.66621)));
            zz = -0.24365 + (((tickAnim - 37) / 5) * (-0.12183-(-0.24365)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -33.39963 + (((tickAnim - 42) / 4) * (-29.19982-(-33.39963)));
            yy = -1.8331 + (((tickAnim - 42) / 4) * (-0.91655-(-1.8331)));
            zz = -0.12183 + (((tickAnim - 42) / 4) * (-0.06091-(-0.12183)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -29.19982 + (((tickAnim - 46) / 4) * (0-(-29.19982)));
            yy = -0.91655 + (((tickAnim - 46) / 4) * (0-(-0.91655)));
            zz = -0.06091 + (((tickAnim - 46) / 4) * (0-(-0.06091)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (32.92-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 32.92 + (((tickAnim - 6) / 9) * (7.5-(32.92)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 15) / 3) * (-13.72-(7.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -13.72 + (((tickAnim - 18) / 5) * (-1.79-(-13.72)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -1.79 + (((tickAnim - 23) / 5) * (1.05-(-1.79)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 1.05 + (((tickAnim - 28) / 4) * (-10.61-(1.05)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -10.61 + (((tickAnim - 32) / 5) * (15.65-(-10.61)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 15.65 + (((tickAnim - 37) / 6) * (-22.15596-(15.65)));
            yy = 0 + (((tickAnim - 37) / 6) * (-0.48024-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (-0.84839-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -22.15596 + (((tickAnim - 43) / 3) * (6.15252-(-22.15596)));
            yy = -0.48024 + (((tickAnim - 43) / 3) * (-0.30015-(-0.48024)));
            zz = -0.84839 + (((tickAnim - 43) / 3) * (-0.53025-(-0.84839)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 6.15252 + (((tickAnim - 46) / 4) * (0-(6.15252)));
            yy = -0.30015 + (((tickAnim - 46) / 4) * (0-(-0.30015)));
            zz = -0.53025 + (((tickAnim - 46) / 4) * (0-(-0.53025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (11.09105-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (5.783-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.75752-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 11.09105 + (((tickAnim - 3) / 7) * (18.27315-(11.09105)));
            yy = 5.783 + (((tickAnim - 3) / 7) * (17.349-(5.783)));
            zz = -0.75752 + (((tickAnim - 3) / 7) * (-2.27256-(-0.75752)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 18.27315 + (((tickAnim - 10) / 6) * (34.28539-(18.27315)));
            yy = 17.349 + (((tickAnim - 10) / 6) * (18.84004-(17.349)));
            zz = -2.27256 + (((tickAnim - 10) / 6) * (-2.10604-(-2.27256)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 34.28539 + (((tickAnim - 16) / 4) * (37.15128-(34.28539)));
            yy = 18.84004 + (((tickAnim - 16) / 4) * (19.90506-(18.84004)));
            zz = -2.10604 + (((tickAnim - 16) / 4) * (-1.9871-(-2.10604)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 37.15128 + (((tickAnim - 20) / 5) * (17.15128-(37.15128)));
            yy = 19.90506 + (((tickAnim - 20) / 5) * (19.90506-(19.90506)));
            zz = -1.9871 + (((tickAnim - 20) / 5) * (-1.9871-(-1.9871)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 17.15128 + (((tickAnim - 25) / 8) * (37.15128-(17.15128)));
            yy = 19.90506 + (((tickAnim - 25) / 8) * (19.90506-(19.90506)));
            zz = -1.9871 + (((tickAnim - 25) / 8) * (-1.9871-(-1.9871)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 37.15128 + (((tickAnim - 33) / 4) * (27.25882-(37.15128)));
            yy = 19.90506 + (((tickAnim - 33) / 4) * (20.3546-(19.90506)));
            zz = -1.9871 + (((tickAnim - 33) / 4) * (-5.45779-(-1.9871)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 27.25882 + (((tickAnim - 37) / 4) * (18.34973-(27.25882)));
            yy = 20.3546 + (((tickAnim - 37) / 4) * (15.62721-(20.3546)));
            zz = -5.45779 + (((tickAnim - 37) / 4) * (0.71768-(-5.45779)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 18.34973 + (((tickAnim - 41) / 9) * (0-(18.34973)));
            yy = 15.62721 + (((tickAnim - 41) / 9) * (0-(15.62721)));
            zz = 0.71768 + (((tickAnim - 41) / 9) * (0-(0.71768)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (16.95712-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (20.88453-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-9.18217-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 16.95712 + (((tickAnim - 4) / 6) * (4.43727-(16.95712)));
            yy = 20.88453 + (((tickAnim - 4) / 6) * (24.16323-(20.88453)));
            zz = -9.18217 + (((tickAnim - 4) / 6) * (-6.52025-(-9.18217)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 4.43727 + (((tickAnim - 10) / 4) * (17.35171-(4.43727)));
            yy = 24.16323 + (((tickAnim - 10) / 4) * (24.32191-(24.16323)));
            zz = -6.52025 + (((tickAnim - 10) / 4) * (-5.84817-(-6.52025)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 17.35171 + (((tickAnim - 14) / 6) * (11.43193-(17.35171)));
            yy = 24.32191 + (((tickAnim - 14) / 6) * (24.54406-(24.32191)));
            zz = -5.84817 + (((tickAnim - 14) / 6) * (-4.90726-(-5.84817)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 11.43193 + (((tickAnim - 20) / 7) * (10.63806-(11.43193)));
            yy = 24.54406 + (((tickAnim - 20) / 7) * (17.3349-(24.54406)));
            zz = -4.90726 + (((tickAnim - 20) / 7) * (-7.12399-(-4.90726)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 10.63806 + (((tickAnim - 27) / 4) * (1.13423-(10.63806)));
            yy = 17.3349 + (((tickAnim - 27) / 4) * (21.84063-(17.3349)));
            zz = -7.12399 + (((tickAnim - 27) / 4) * (-5.73854-(-7.12399)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 1.13423 + (((tickAnim - 31) / 2) * (11.43193-(1.13423)));
            yy = 21.84063 + (((tickAnim - 31) / 2) * (24.54406-(21.84063)));
            zz = -5.73854 + (((tickAnim - 31) / 2) * (-4.90726-(-5.73854)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 11.43193 + (((tickAnim - 33) / 6) * (15.43094-(11.43193)));
            yy = 24.54406 + (((tickAnim - 33) / 6) * (27.9864-(24.54406)));
            zz = -4.90726 + (((tickAnim - 33) / 6) * (-6.75796-(-4.90726)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 15.43094 + (((tickAnim - 39) / 5) * (6.87998-(15.43094)));
            yy = 27.9864 + (((tickAnim - 39) / 5) * (27.54615-(27.9864)));
            zz = -6.75796 + (((tickAnim - 39) / 5) * (-17.55624-(-6.75796)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 6.87998 + (((tickAnim - 44) / 6) * (0-(6.87998)));
            yy = 27.54615 + (((tickAnim - 44) / 6) * (0-(27.54615)));
            zz = -17.55624 + (((tickAnim - 44) / 6) * (0-(-17.55624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20.78058-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (25.79442-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.60721-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20.78058 + (((tickAnim - 10) / 10) * (-43.3724-(-20.78058)));
            yy = 25.79442 + (((tickAnim - 10) / 10) * (22.07405-(25.79442)));
            zz = 0.60721 + (((tickAnim - 10) / 10) * (-4.47051-(0.60721)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -43.3724 + (((tickAnim - 20) / 13) * (-43.3724-(-43.3724)));
            yy = 22.07405 + (((tickAnim - 20) / 13) * (22.07405-(22.07405)));
            zz = -4.47051 + (((tickAnim - 20) / 13) * (-4.47051-(-4.47051)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -43.3724 + (((tickAnim - 33) / 17) * (0-(-43.3724)));
            yy = 22.07405 + (((tickAnim - 33) / 17) * (0-(22.07405)));
            zz = -4.47051 + (((tickAnim - 33) / 17) * (0-(-4.47051)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.59145-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-17.13745-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (6.83529-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -5.59145 + (((tickAnim - 3) / 7) * (-11.38998-(-5.59145)));
            yy = -17.13745 + (((tickAnim - 3) / 7) * (35.6464-(-17.13745)));
            zz = 6.83529 + (((tickAnim - 3) / 7) * (-4.05093-(6.83529)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.38998 + (((tickAnim - 10) / 10) * (-23.40127-(-11.38998)));
            yy = 35.6464 + (((tickAnim - 10) / 10) * (31.31275-(35.6464)));
            zz = -4.05093 + (((tickAnim - 10) / 10) * (-9.51531-(-4.05093)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -23.40127 + (((tickAnim - 20) / 1) * (-22.93277-(-23.40127)));
            yy = 31.31275 + (((tickAnim - 20) / 1) * (26.38538-(31.31275)));
            zz = -9.51531 + (((tickAnim - 20) / 1) * (-8.54525-(-9.51531)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -22.93277 + (((tickAnim - 21) / 1) * (-23.40127-(-22.93277)));
            yy = 26.38538 + (((tickAnim - 21) / 1) * (31.31275-(26.38538)));
            zz = -8.54525 + (((tickAnim - 21) / 1) * (-9.51531-(-8.54525)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -23.40127 + (((tickAnim - 22) / 4) * (-22.93277-(-23.40127)));
            yy = 31.31275 + (((tickAnim - 22) / 4) * (26.38538-(31.31275)));
            zz = -9.51531 + (((tickAnim - 22) / 4) * (-8.54525-(-9.51531)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = -22.93277 + (((tickAnim - 26) / 1) * (-23.40127-(-22.93277)));
            yy = 26.38538 + (((tickAnim - 26) / 1) * (31.31275-(26.38538)));
            zz = -8.54525 + (((tickAnim - 26) / 1) * (-9.51531-(-8.54525)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -23.40127 + (((tickAnim - 27) / 3) * (-22.93277-(-23.40127)));
            yy = 31.31275 + (((tickAnim - 27) / 3) * (26.38538-(31.31275)));
            zz = -9.51531 + (((tickAnim - 27) / 3) * (-8.54525-(-9.51531)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -22.93277 + (((tickAnim - 30) / 1) * (-23.40127-(-22.93277)));
            yy = 26.38538 + (((tickAnim - 30) / 1) * (31.31275-(26.38538)));
            zz = -8.54525 + (((tickAnim - 30) / 1) * (-9.51531-(-8.54525)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -23.40127 + (((tickAnim - 31) / 2) * (-23.40127-(-23.40127)));
            yy = 31.31275 + (((tickAnim - 31) / 2) * (31.31275-(31.31275)));
            zz = -9.51531 + (((tickAnim - 31) / 2) * (-9.51531-(-9.51531)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.40127 + (((tickAnim - 33) / 17) * (0-(-23.40127)));
            yy = 31.31275 + (((tickAnim - 33) / 17) * (0-(31.31275)));
            zz = -9.51531 + (((tickAnim - 33) / 17) * (0-(-9.51531)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
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
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 9) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
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
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
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
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 6) / 4) * (-10.83-(-10)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -10.83 + (((tickAnim - 10) / 6) * (0-(-10.83)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
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
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (32.5-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 32.5 + (((tickAnim - 3) / 2) * (17.5-(32.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 5) / 3) * (32.5-(17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32.5 + (((tickAnim - 8) / 2) * (17.5-(32.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.5 + (((tickAnim - 10) / 3) * (32.5-(17.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 32.5 + (((tickAnim - 13) / 0) * (17.5-(32.5)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 17.5 + (((tickAnim - 13) / 3) * (32.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 32.5 + (((tickAnim - 16) / 1) * (0-(32.5)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 16) / 12) * (5-(5)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 28) / 12) * (0-(5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Compsognathus, Compsognathus.rotateAngleX + (float) Math.toRadians(xx), Compsognathus.rotateAngleY + (float) Math.toRadians(yy), Compsognathus.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 16) / 12) * (-5-(-5)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 28) / 12) * (0-(-5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 16) / 12) * (-5-(-5)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 28) / 12) * (0-(-5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = -5 + (((tickAnim - 15) / 12) * (-5-(-5)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 27) / 13) * (0-(-5)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = -10 + (((tickAnim - 15) / 12) * (-10-(-10)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 27) / 13) * (0-(-10)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = -7.5 + (((tickAnim - 15) / 12) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 27) / 13) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 7.5 + (((tickAnim - 15) / 12) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 27) / 13) * (0-(7.5)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = -2.5 + (((tickAnim - 3) / 9) * (13.07-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 13.07 + (((tickAnim - 12) / 4) * (0.57-(13.07)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0.57 + (((tickAnim - 16) / 7) * (-0.43-(0.57)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -0.43 + (((tickAnim - 23) / 8) * (13.07-(-0.43)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 13.07 + (((tickAnim - 31) / 9) * (0-(13.07)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 3) / 5) * (-10-(-10)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 8) / 2) * (0-(-10)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 16) / 7) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 23) / 10) * (0-(7.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 3) / 5) * (-17.5-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 8) / 2) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (35-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 35 + (((tickAnim - 16) / 7) * (35-(35)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 35 + (((tickAnim - 23) / 10) * (0-(35)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 3) / 5) * (30-(30)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 30 + (((tickAnim - 8) / 2) * (0-(30)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (35-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 35 + (((tickAnim - 16) / 7) * (35-(35)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 35 + (((tickAnim - 23) / 10) * (0-(35)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 3) / 5) * (2.5-(25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 8) / 8) * (3.59-(2.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 3.59 + (((tickAnim - 16) / 7) * (-15.02-(3.59)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -15.02 + (((tickAnim - 23) / 8) * (11.74-(-15.02)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 11.74 + (((tickAnim - 31) / 9) * (0-(11.74)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (20-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 3) / 5) * (22.5-(7.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 20 + (((tickAnim - 3) / 5) * (20-(20)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 22.5 + (((tickAnim - 8) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 20 + (((tickAnim - 8) / 4) * (0-(20)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -7.5 + (((tickAnim - 18) / 7) * (5-(-7.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 5 + (((tickAnim - 25) / 6) * (-14.44-(5)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -14.44 + (((tickAnim - 31) / 9) * (0-(-14.44)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (27.5-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 27.5 + (((tickAnim - 20) / 3) * (0-(27.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (27.5-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 27.5 + (((tickAnim - 25) / 3) * (0-(27.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (27.5-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 27.5 + (((tickAnim - 30) / 2) * (0-(27.5)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animCurious1(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 4) / 3) * (-5-(5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 7) / 2) * (5-(-5)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 9) / 3) * (-5-(5)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 12) / 3) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (7.5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 7.5 + (((tickAnim - 4) / 3) * (-7.5-(7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 7) / 2) * (7.5-(-7.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 7.5 + (((tickAnim - 9) / 3) * (-7.5-(7.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -7.5 + (((tickAnim - 12) / 3) * (0-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (15-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 15 + (((tickAnim - 4) / 3) * (-15-(15)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = -15 + (((tickAnim - 7) / 2) * (15-(-15)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 15 + (((tickAnim - 9) / 3) * (-15-(15)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -15 + (((tickAnim - 12) / 3) * (0-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animCurious2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (7.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 13) / 7) * (2.5-(7.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 2.5 + (((tickAnim - 20) / 7) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 27) / 8) * (9.75-(2.5)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 9.75 + (((tickAnim - 35) / 13) * (2.25-(9.75)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 2.25 + (((tickAnim - 48) / 5) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 2.25 + (((tickAnim - 53) / 7) * (0-(2.25)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -7.5 + (((tickAnim - 13) / 14) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 27) / 8) * (3.25-(-7.5)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 3.25 + (((tickAnim - 35) / 18) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 3.25 + (((tickAnim - 53) / 7) * (0-(3.25)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
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
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -10 + (((tickAnim - 13) / 14) * (-10-(-10)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -10 + (((tickAnim - 27) / 8) * (11-(-10)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 11 + (((tickAnim - 35) / 13) * (21-(11)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 21 + (((tickAnim - 48) / 5) * (11-(21)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 11 + (((tickAnim - 53) / 7) * (0-(11)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 13) / 7) * (7.5-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 7.5 + (((tickAnim - 20) / 7) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 27) / 8) * (24.25-(7.5)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 24.25 + (((tickAnim - 35) / 8) * (4.25-(24.25)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 4.25 + (((tickAnim - 43) / 10) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 4.25 + (((tickAnim - 53) / 7) * (0-(4.25)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 10 + (((tickAnim - 13) / 14) * (10-(10)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 27) / 8) * (0-(10)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
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
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 20 + (((tickAnim - 13) / 9) * (20-(20)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 20 + (((tickAnim - 22) / 1) * (20.11557-(20)));
            yy = 0 + (((tickAnim - 22) / 1) * (0.75155-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (17.48436-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 20.11557 + (((tickAnim - 23) / 4) * (20.11557-(20.11557)));
            yy = 0.75155 + (((tickAnim - 23) / 4) * (0.75155-(0.75155)));
            zz = 17.48436 + (((tickAnim - 23) / 4) * (17.48436-(17.48436)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 20.11557 + (((tickAnim - 27) / 8) * (0-(20.11557)));
            yy = 0.75155 + (((tickAnim - 27) / 8) * (0-(0.75155)));
            zz = 17.48436 + (((tickAnim - 27) / 8) * (0-(17.48436)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 15 + (((tickAnim - 43) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 53) / 7) * (0-(15)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 12.5 + (((tickAnim - 15) / 11) * (4.49-(12.5)));
            yy = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 4.49 + (((tickAnim - 26) / 8) * (3.4241-(4.49)));
            yy = 0 + (((tickAnim - 26) / 8) * (-7.48676-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (-0.44667-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 3.4241 + (((tickAnim - 34) / 5) * (7.76119-(3.4241)));
            yy = -7.48676 + (((tickAnim - 34) / 5) * (-3.03913-(-7.48676)));
            zz = -0.44667 + (((tickAnim - 34) / 5) * (-0.26778-(-0.44667)));
        }
        else if (tickAnim >= 39 && tickAnim < 47) {
            xx = 7.76119 + (((tickAnim - 39) / 8) * (1.76681-(7.76119)));
            yy = -3.03913 + (((tickAnim - 39) / 8) * (3.63231-(-3.03913)));
            zz = -0.26778 + (((tickAnim - 39) / 8) * (0.00056-(-0.26778)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 1.76681 + (((tickAnim - 47) / 6) * (7.8694-(1.76681)));
            yy = 3.63231 + (((tickAnim - 47) / 6) * (1.54731-(3.63231)));
            zz = 0.00056 + (((tickAnim - 47) / 6) * (0.00024-(0.00056)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 7.8694 + (((tickAnim - 53) / 7) * (0-(7.8694)));
            yy = 1.54731 + (((tickAnim - 53) / 7) * (0-(1.54731)));
            zz = 0.00024 + (((tickAnim - 53) / 7) * (0-(0.00024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 2.5 + (((tickAnim - 15) / 11) * (4.49-(2.5)));
            yy = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 4.49 + (((tickAnim - 26) / 8) * (3.4241-(4.49)));
            yy = 0 + (((tickAnim - 26) / 8) * (-7.48676-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (-0.44667-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 3.4241 + (((tickAnim - 34) / 5) * (7.76119-(3.4241)));
            yy = -7.48676 + (((tickAnim - 34) / 5) * (-3.03913-(-7.48676)));
            zz = -0.44667 + (((tickAnim - 34) / 5) * (-0.26778-(-0.44667)));
        }
        else if (tickAnim >= 39 && tickAnim < 47) {
            xx = 7.76119 + (((tickAnim - 39) / 8) * (1.76681-(7.76119)));
            yy = -3.03913 + (((tickAnim - 39) / 8) * (3.63231-(-3.03913)));
            zz = -0.26778 + (((tickAnim - 39) / 8) * (0.00056-(-0.26778)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 1.76681 + (((tickAnim - 47) / 6) * (7.8694-(1.76681)));
            yy = 3.63231 + (((tickAnim - 47) / 6) * (1.54731-(3.63231)));
            zz = 0.00056 + (((tickAnim - 47) / 6) * (0.00024-(0.00056)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 7.8694 + (((tickAnim - 53) / 7) * (0-(7.8694)));
            yy = 1.54731 + (((tickAnim - 53) / 7) * (0-(1.54731)));
            zz = 0.00024 + (((tickAnim - 53) / 7) * (0-(0.00024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 5 + (((tickAnim - 15) / 11) * (4.49-(5)));
            yy = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 4.49 + (((tickAnim - 26) / 8) * (3.4241-(4.49)));
            yy = 0 + (((tickAnim - 26) / 8) * (-7.48676-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (-0.44667-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 3.4241 + (((tickAnim - 34) / 5) * (7.76119-(3.4241)));
            yy = -7.48676 + (((tickAnim - 34) / 5) * (-3.03913-(-7.48676)));
            zz = -0.44667 + (((tickAnim - 34) / 5) * (-0.26778-(-0.44667)));
        }
        else if (tickAnim >= 39 && tickAnim < 47) {
            xx = 7.76119 + (((tickAnim - 39) / 8) * (1.76681-(7.76119)));
            yy = -3.03913 + (((tickAnim - 39) / 8) * (3.63231-(-3.03913)));
            zz = -0.26778 + (((tickAnim - 39) / 8) * (0.00056-(-0.26778)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 1.76681 + (((tickAnim - 47) / 6) * (7.8694-(1.76681)));
            yy = 3.63231 + (((tickAnim - 47) / 6) * (1.54731-(3.63231)));
            zz = 0.00056 + (((tickAnim - 47) / 6) * (0.00024-(0.00056)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 7.8694 + (((tickAnim - 53) / 7) * (0-(7.8694)));
            yy = 1.54731 + (((tickAnim - 53) / 7) * (0-(1.54731)));
            zz = 0.00024 + (((tickAnim - 53) / 7) * (0-(0.00024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 12.5 + (((tickAnim - 15) / 11) * (4.49-(12.5)));
            yy = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 4.49 + (((tickAnim - 26) / 8) * (3.4241-(4.49)));
            yy = 0 + (((tickAnim - 26) / 8) * (-7.48676-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (-0.44667-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 3.4241 + (((tickAnim - 34) / 5) * (7.76119-(3.4241)));
            yy = -7.48676 + (((tickAnim - 34) / 5) * (-3.03913-(-7.48676)));
            zz = -0.44667 + (((tickAnim - 34) / 5) * (-0.26778-(-0.44667)));
        }
        else if (tickAnim >= 39 && tickAnim < 47) {
            xx = 7.76119 + (((tickAnim - 39) / 8) * (1.76681-(7.76119)));
            yy = -3.03913 + (((tickAnim - 39) / 8) * (3.63231-(-3.03913)));
            zz = -0.26778 + (((tickAnim - 39) / 8) * (0.00056-(-0.26778)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 1.76681 + (((tickAnim - 47) / 6) * (7.8694-(1.76681)));
            yy = 3.63231 + (((tickAnim - 47) / 6) * (1.54731-(3.63231)));
            zz = 0.00056 + (((tickAnim - 47) / 6) * (0.00024-(0.00056)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 7.8694 + (((tickAnim - 53) / 7) * (0-(7.8694)));
            yy = 1.54731 + (((tickAnim - 53) / 7) * (0-(1.54731)));
            zz = 0.00024 + (((tickAnim - 53) / 7) * (0-(0.00024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Compsognathus, Compsognathus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-5), Compsognathus.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-5)), Compsognathus.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 0) / 5) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.75-(0)));
            zz = -1 + (((tickAnim - 5) / 5) * (0-(-1)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 10) / 5) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 10) / 5) * (-1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-0.75-(0)));
            zz = -1 + (((tickAnim - 15) / 5) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Compsognathus.rotationPointX = this.Compsognathus.rotationPointX + (float)(xx);
        this.Compsognathus.rotationPointY = this.Compsognathus.rotationPointY - (float)(yy);
        this.Compsognathus.rotationPointZ = this.Compsognathus.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20.30902 + (((tickAnim - 0) / 3) * (-12.29963-(-20.30902)));
            yy = -0.32954 + (((tickAnim - 0) / 3) * (0.33461-(-0.32954)));
            zz = 2.52894 + (((tickAnim - 0) / 3) * (1.02693-(2.52894)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -12.29963 + (((tickAnim - 3) / 2) * (-4.30285-(-12.29963)));
            yy = 0.33461 + (((tickAnim - 3) / 2) * (1.21569-(0.33461)));
            zz = 1.02693 + (((tickAnim - 3) / 2) * (1.34115-(1.02693)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.30285 + (((tickAnim - 5) / 2) * (1.19259-(-4.30285)));
            yy = 1.21569 + (((tickAnim - 5) / 2) * (0.59351-(1.21569)));
            zz = 1.34115 + (((tickAnim - 5) / 2) * (3.54833-(1.34115)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1.19259 + (((tickAnim - 7) / 3) * (11.79875-(1.19259)));
            yy = 0.59351 + (((tickAnim - 7) / 3) * (0.13067-(0.59351)));
            zz = 3.54833 + (((tickAnim - 7) / 3) * (12.99382-(3.54833)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 11.79875 + (((tickAnim - 10) / 5) * (-14.90592-(11.79875)));
            yy = 0.13067 + (((tickAnim - 10) / 5) * (-5.74914-(0.13067)));
            zz = 12.99382 + (((tickAnim - 10) / 5) * (-0.68785-(12.99382)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -14.90592 + (((tickAnim - 15) / 3) * (-29.27517-(-14.90592)));
            yy = -5.74914 + (((tickAnim - 15) / 3) * (0.01236-(-5.74914)));
            zz = -0.68785 + (((tickAnim - 15) / 3) * (7.49934-(-0.68785)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -29.27517 + (((tickAnim - 18) / 2) * (-20.30902-(-29.27517)));
            yy = 0.01236 + (((tickAnim - 18) / 2) * (-0.32954-(0.01236)));
            zz = 7.49934 + (((tickAnim - 18) / 2) * (2.52894-(7.49934)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 0) / 10) * (20-(-15)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (37.5-(20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 37.5 + (((tickAnim - 13) / 7) * (-15-(37.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18.75 + (((tickAnim - 5) / 5) * (15-(18.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 10) / 3) * (-30.55735-(15)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.1892-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-2.08133-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -30.55735 + (((tickAnim - 13) / 3) * (-20.95654-(-30.55735)));
            yy = 0.1892 + (((tickAnim - 13) / 3) * (0.12642-(0.1892)));
            zz = -2.08133 + (((tickAnim - 13) / 3) * (-1.39073-(-2.08133)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -20.95654 + (((tickAnim - 16) / 2) * (-12.07392-(-20.95654)));
            yy = 0.12642 + (((tickAnim - 16) / 2) * (0.07585-(0.12642)));
            zz = -1.39073 + (((tickAnim - 16) / 2) * (-0.83444-(-1.39073)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -12.07392 + (((tickAnim - 18) / 2) * (0-(-12.07392)));
            yy = 0.07585 + (((tickAnim - 18) / 2) * (0-(0.07585)));
            zz = -0.83444 + (((tickAnim - 18) / 2) * (0-(-0.83444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 30.628 + (((tickAnim - 0) / 5) * (-10.73614-(30.628)));
            yy = 9.49366 + (((tickAnim - 0) / 5) * (2.99124-(9.49366)));
            zz = 1.18721 + (((tickAnim - 0) / 5) * (0.49561-(1.18721)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -10.73614 + (((tickAnim - 5) / 2) * (-15.78675-(-10.73614)));
            yy = 2.99124 + (((tickAnim - 5) / 2) * (-0.38156-(2.99124)));
            zz = 0.49561 + (((tickAnim - 5) / 2) * (-5.20597-(0.49561)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15.78675 + (((tickAnim - 7) / 3) * (-1.63564-(-15.78675)));
            yy = -0.38156 + (((tickAnim - 7) / 3) * (-4.93708-(-0.38156)));
            zz = -5.20597 + (((tickAnim - 7) / 3) * (-4.47991-(-5.20597)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.63564 + (((tickAnim - 10) / 3) * (45.7277-(-1.63564)));
            yy = -4.93708 + (((tickAnim - 10) / 3) * (4.09405-(-4.93708)));
            zz = -4.47991 + (((tickAnim - 10) / 3) * (-4.62723-(-4.47991)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 45.7277 + (((tickAnim - 13) / 3) * (52.11833-(45.7277)));
            yy = 4.09405 + (((tickAnim - 13) / 3) * (4.09405-(4.09405)));
            zz = -4.62723 + (((tickAnim - 13) / 3) * (-4.62723-(-4.62723)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 52.11833 + (((tickAnim - 16) / 2) * (39.71208-(52.11833)));
            yy = 4.09405 + (((tickAnim - 16) / 2) * (4.09405-(4.09405)));
            zz = -4.62723 + (((tickAnim - 16) / 2) * (-4.62723-(-4.62723)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 39.71208 + (((tickAnim - 18) / 2) * (30.628-(39.71208)));
            yy = 4.09405 + (((tickAnim - 18) / 2) * (9.49366-(4.09405)));
            zz = -4.62723 + (((tickAnim - 18) / 2) * (1.18721-(-4.62723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11.79875 + (((tickAnim - 0) / 5) * (-14.90592-(11.79875)));
            yy = -0.13067 + (((tickAnim - 0) / 5) * (5.74914-(-0.13067)));
            zz = -12.99382 + (((tickAnim - 0) / 5) * (0.68785-(-12.99382)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -14.90592 + (((tickAnim - 5) / 3) * (-29.27517-(-14.90592)));
            yy = 5.74914 + (((tickAnim - 5) / 3) * (-0.01236-(5.74914)));
            zz = 0.68785 + (((tickAnim - 5) / 3) * (-7.49934-(0.68785)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -29.27517 + (((tickAnim - 8) / 2) * (-20.30902-(-29.27517)));
            yy = -0.01236 + (((tickAnim - 8) / 2) * (0.32954-(-0.01236)));
            zz = -7.49934 + (((tickAnim - 8) / 2) * (-2.52894-(-7.49934)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20.30902 + (((tickAnim - 10) / 3) * (-12.29963-(-20.30902)));
            yy = 0.32954 + (((tickAnim - 10) / 3) * (-0.33461-(0.32954)));
            zz = -2.52894 + (((tickAnim - 10) / 3) * (-1.02693-(-2.52894)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -12.29963 + (((tickAnim - 13) / 2) * (-4.30285-(-12.29963)));
            yy = -0.33461 + (((tickAnim - 13) / 2) * (-1.21569-(-0.33461)));
            zz = -1.02693 + (((tickAnim - 13) / 2) * (-1.34115-(-1.02693)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -4.30285 + (((tickAnim - 15) / 2) * (1.19259-(-4.30285)));
            yy = -1.21569 + (((tickAnim - 15) / 2) * (-0.59351-(-1.21569)));
            zz = -1.34115 + (((tickAnim - 15) / 2) * (-3.54833-(-1.34115)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1.19259 + (((tickAnim - 17) / 3) * (11.79875-(1.19259)));
            yy = -0.59351 + (((tickAnim - 17) / 3) * (-0.13067-(-0.59351)));
            zz = -3.54833 + (((tickAnim - 17) / 3) * (-12.99382-(-3.54833)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 0) / 3) * (37.5-(20)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 37.5 + (((tickAnim - 3) / 7) * (-15-(37.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 10) / 10) * (20-(-15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL2, KneeL2.rotateAngleX + (float) Math.toRadians(xx), KneeL2.rotateAngleY + (float) Math.toRadians(yy), KneeL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 0) / 3) * (-30.55735-(15)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.1892-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.08133-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -30.55735 + (((tickAnim - 3) / 3) * (-20.95654-(-30.55735)));
            yy = -0.1892 + (((tickAnim - 3) / 3) * (-0.12642-(-0.1892)));
            zz = 2.08133 + (((tickAnim - 3) / 3) * (1.39073-(2.08133)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.95654 + (((tickAnim - 6) / 2) * (-12.07392-(-20.95654)));
            yy = -0.12642 + (((tickAnim - 6) / 2) * (-0.07585-(-0.12642)));
            zz = 1.39073 + (((tickAnim - 6) / 2) * (0.83444-(1.39073)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.07392 + (((tickAnim - 8) / 2) * (0-(-12.07392)));
            yy = -0.07585 + (((tickAnim - 8) / 2) * (0-(-0.07585)));
            zz = 0.83444 + (((tickAnim - 8) / 2) * (0-(0.83444)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (18.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 18.75 + (((tickAnim - 15) / 5) * (15-(18.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL2, MetatarsalL2.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL2.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.63564 + (((tickAnim - 0) / 3) * (45.7277-(-1.63564)));
            yy = 4.93708 + (((tickAnim - 0) / 3) * (-4.09405-(4.93708)));
            zz = 4.47991 + (((tickAnim - 0) / 3) * (4.62723-(4.47991)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 45.7277 + (((tickAnim - 3) / 3) * (52.11833-(45.7277)));
            yy = -4.09405 + (((tickAnim - 3) / 3) * (-4.09405-(-4.09405)));
            zz = 4.62723 + (((tickAnim - 3) / 3) * (4.62723-(4.62723)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 52.11833 + (((tickAnim - 6) / 2) * (39.71208-(52.11833)));
            yy = -4.09405 + (((tickAnim - 6) / 2) * (-4.09405-(-4.09405)));
            zz = 4.62723 + (((tickAnim - 6) / 2) * (4.62723-(4.62723)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 39.71208 + (((tickAnim - 8) / 2) * (30.628-(39.71208)));
            yy = -4.09405 + (((tickAnim - 8) / 2) * (-9.49366-(-4.09405)));
            zz = 4.62723 + (((tickAnim - 8) / 2) * (-1.18721-(4.62723)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 30.628 + (((tickAnim - 10) / 5) * (-10.73614-(30.628)));
            yy = -9.49366 + (((tickAnim - 10) / 5) * (-2.99124-(-9.49366)));
            zz = -1.18721 + (((tickAnim - 10) / 5) * (-0.49561-(-1.18721)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -10.73614 + (((tickAnim - 15) / 2) * (-15.78675-(-10.73614)));
            yy = -2.99124 + (((tickAnim - 15) / 2) * (0.38156-(-2.99124)));
            zz = -0.49561 + (((tickAnim - 15) / 2) * (5.20597-(-0.49561)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15.78675 + (((tickAnim - 17) / 3) * (-1.63564-(-15.78675)));
            yy = 0.38156 + (((tickAnim - 17) / 3) * (4.93708-(0.38156)));
            zz = 5.20597 + (((tickAnim - 17) / 3) * (4.47991-(5.20597)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*-5), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2.5));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-5), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2.5));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-5), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*5), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-5), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-5), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5));


        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*5), ArmL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), ArmL.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5));


        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*-5), ElbowL.rotateAngleY + (float) Math.toRadians(0), ElbowL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*5), ArmL2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), ArmL2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5));


        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*-5), ElbowL2.rotateAngleY + (float) Math.toRadians(0), ElbowL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-5), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*-3), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Compsognathus, Compsognathus.rotateAngleX + (float) Math.toRadians(5+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440+120))*-3), Compsognathus.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), Compsognathus.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*-5));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.25-(0)));
            zz = -2 + (((tickAnim - 0) / 1) * (-0.75-(-2)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 1) / 4) * (0-(-0.25)));
            zz = -0.75 + (((tickAnim - 1) / 4) * (-2-(-0.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (-0.25-(0)));
            zz = -2 + (((tickAnim - 5) / 1) * (-0.75-(-2)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 6) / 4) * (0-(-0.25)));
            zz = -0.75 + (((tickAnim - 6) / 4) * (-2-(-0.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (-0.25-(0)));
            zz = -2 + (((tickAnim - 10) / 1) * (-0.75-(-2)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 11) / 4) * (0-(-0.25)));
            zz = -0.75 + (((tickAnim - 11) / 4) * (-2-(-0.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (-0.25-(0)));
            zz = -2 + (((tickAnim - 15) / 1) * (-0.75-(-2)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 16) / 4) * (0-(-0.25)));
            zz = -0.75 + (((tickAnim - 16) / 4) * (-2-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Compsognathus.rotationPointX = this.Compsognathus.rotationPointX + (float)(xx);
        this.Compsognathus.rotationPointY = this.Compsognathus.rotationPointY - (float)(yy);
        this.Compsognathus.rotationPointZ = this.Compsognathus.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -36.81801 + (((tickAnim - 0) / 5) * (10.68199-(-36.81801)));
            yy = 2.63885 + (((tickAnim - 0) / 5) * (2.63885-(2.63885)));
            zz = 4.82309 + (((tickAnim - 0) / 5) * (4.82309-(4.82309)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.68199 + (((tickAnim - 5) / 3) * (-47.93695-(10.68199)));
            yy = 2.63885 + (((tickAnim - 5) / 3) * (-6.63646-(2.63885)));
            zz = 4.82309 + (((tickAnim - 5) / 3) * (1.07923-(4.82309)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -47.93695 + (((tickAnim - 8) / 2) * (-36.81801-(-47.93695)));
            yy = -6.63646 + (((tickAnim - 8) / 2) * (2.63885-(-6.63646)));
            zz = 1.07923 + (((tickAnim - 8) / 2) * (4.82309-(1.07923)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -36.81801 + (((tickAnim - 10) / 5) * (10.68199-(-36.81801)));
            yy = 2.63885 + (((tickAnim - 10) / 5) * (2.63885-(2.63885)));
            zz = 4.82309 + (((tickAnim - 10) / 5) * (4.82309-(4.82309)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10.68199 + (((tickAnim - 15) / 3) * (-47.93695-(10.68199)));
            yy = 2.63885 + (((tickAnim - 15) / 3) * (-6.63646-(2.63885)));
            zz = 4.82309 + (((tickAnim - 15) / 3) * (1.07923-(4.82309)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -47.93695 + (((tickAnim - 18) / 2) * (-36.81801-(-47.93695)));
            yy = -6.63646 + (((tickAnim - 18) / 2) * (2.63885-(-6.63646)));
            zz = 1.07923 + (((tickAnim - 18) / 2) * (4.82309-(1.07923)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 0) / 3) * (25-(-15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 25 + (((tickAnim - 3) / 2) * (35-(25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 35 + (((tickAnim - 5) / 2) * (40.83-(35)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 40.83 + (((tickAnim - 7) / 1) * (-2.08-(40.83)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.08 + (((tickAnim - 8) / 2) * (-15-(-2.08)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -15 + (((tickAnim - 10) / 3) * (25-(-15)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 25 + (((tickAnim - 13) / 2) * (35-(25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 35 + (((tickAnim - 15) / 2) * (40.83-(35)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 40.83 + (((tickAnim - 17) / 1) * (-2.08-(40.83)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.08 + (((tickAnim - 18) / 2) * (-15-(-2.08)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.5 + (((tickAnim - 0) / 1) * (22.5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 1) / 2) * (6-(22.5)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6 + (((tickAnim - 3) / 2) * (27.5-(6)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 27.5 + (((tickAnim - 5) / 1) * (3.33-(27.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 3.33 + (((tickAnim - 6) / 1) * (-25.83-(3.33)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -25.83 + (((tickAnim - 7) / 1) * (0-(-25.83)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (12.5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 12.5 + (((tickAnim - 10) / 1) * (22.5-(12.5)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 11) / 2) * (6-(22.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6 + (((tickAnim - 13) / 2) * (27.5-(6)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 27.5 + (((tickAnim - 15) / 1) * (3.33-(27.5)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 3.33 + (((tickAnim - 16) / 1) * (-25.83-(3.33)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -25.83 + (((tickAnim - 17) / 1) * (0-(-25.83)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (12.5-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 32.5 + (((tickAnim - 0) / 1) * (0.42-(32.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0.42 + (((tickAnim - 1) / 2) * (-16.25-(0.42)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -16.25 + (((tickAnim - 3) / 1) * (-15.74622-(-16.25)));
            yy = 0 + (((tickAnim - 3) / 1) * (-10.27303-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-8.72558-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -15.74622 + (((tickAnim - 4) / 1) * (57.5-(-15.74622)));
            yy = -10.27303 + (((tickAnim - 4) / 1) * (0-(-10.27303)));
            zz = -8.72558 + (((tickAnim - 4) / 1) * (0-(-8.72558)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 57.5 + (((tickAnim - 5) / 3) * (27.5-(57.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 8) / 0) * (35.83-(27.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 35.83 + (((tickAnim - 8) / 1) * (35-(35.83)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 35 + (((tickAnim - 9) / 1) * (32.5-(35)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 32.5 + (((tickAnim - 10) / 1) * (0.42-(32.5)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.42 + (((tickAnim - 11) / 2) * (-16.25-(0.42)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -16.25 + (((tickAnim - 13) / 1) * (-15.74622-(-16.25)));
            yy = 0 + (((tickAnim - 13) / 1) * (-10.27303-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (-8.72558-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -15.74622 + (((tickAnim - 14) / 1) * (57.5-(-15.74622)));
            yy = -10.27303 + (((tickAnim - 14) / 1) * (0-(-10.27303)));
            zz = -8.72558 + (((tickAnim - 14) / 1) * (0-(-8.72558)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 57.5 + (((tickAnim - 15) / 3) * (27.5-(57.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 27.5 + (((tickAnim - 18) / 0) * (35.83-(27.5)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 35.83 + (((tickAnim - 18) / 1) * (35-(35.83)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 19) / 1) * (32.5-(35)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.68199 + (((tickAnim - 0) / 3) * (-47.93695-(10.68199)));
            yy = -2.63885 + (((tickAnim - 0) / 3) * (6.63646-(-2.63885)));
            zz = -4.82309 + (((tickAnim - 0) / 3) * (-1.07923-(-4.82309)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -47.93695 + (((tickAnim - 3) / 2) * (-36.81801-(-47.93695)));
            yy = 6.63646 + (((tickAnim - 3) / 2) * (-2.63885-(6.63646)));
            zz = -1.07923 + (((tickAnim - 3) / 2) * (-4.82309-(-1.07923)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -36.81801 + (((tickAnim - 5) / 5) * (10.68199-(-36.81801)));
            yy = -2.63885 + (((tickAnim - 5) / 5) * (-2.63885-(-2.63885)));
            zz = -4.82309 + (((tickAnim - 5) / 5) * (-4.82309-(-4.82309)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10.68199 + (((tickAnim - 10) / 3) * (-47.93695-(10.68199)));
            yy = -2.63885 + (((tickAnim - 10) / 3) * (6.63646-(-2.63885)));
            zz = -4.82309 + (((tickAnim - 10) / 3) * (-1.07923-(-4.82309)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -47.93695 + (((tickAnim - 13) / 2) * (-36.81801-(-47.93695)));
            yy = 6.63646 + (((tickAnim - 13) / 2) * (-2.63885-(6.63646)));
            zz = -1.07923 + (((tickAnim - 13) / 2) * (-4.82309-(-1.07923)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -36.81801 + (((tickAnim - 15) / 5) * (10.68199-(-36.81801)));
            yy = -2.63885 + (((tickAnim - 15) / 5) * (-2.63885-(-2.63885)));
            zz = -4.82309 + (((tickAnim - 15) / 5) * (-4.82309-(-4.82309)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 35 + (((tickAnim - 0) / 2) * (40.83-(35)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 40.83 + (((tickAnim - 2) / 1) * (-2.08-(40.83)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.08 + (((tickAnim - 3) / 2) * (-15-(-2.08)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 5) / 3) * (25-(-15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (35-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 35 + (((tickAnim - 10) / 2) * (40.83-(35)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 40.83 + (((tickAnim - 12) / 1) * (-2.08-(40.83)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.08 + (((tickAnim - 13) / 2) * (-15-(-2.08)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 15) / 3) * (25-(-15)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 18) / 2) * (35-(25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL2, KneeL2.rotateAngleX + (float) Math.toRadians(xx), KneeL2.rotateAngleY + (float) Math.toRadians(yy), KneeL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.5 + (((tickAnim - 0) / 1) * (3.33-(27.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 3.33 + (((tickAnim - 1) / 1) * (-25.83-(3.33)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.83 + (((tickAnim - 2) / 1) * (0-(-25.83)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (12.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 12.5 + (((tickAnim - 5) / 1) * (22.5-(12.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 6) / 2) * (6-(22.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6 + (((tickAnim - 8) / 2) * (27.5-(6)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 27.5 + (((tickAnim - 10) / 1) * (3.33-(27.5)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 3.33 + (((tickAnim - 11) / 1) * (-25.83-(3.33)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -25.83 + (((tickAnim - 12) / 1) * (0-(-25.83)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (12.5-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 12.5 + (((tickAnim - 15) / 1) * (22.5-(12.5)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 16) / 2) * (6-(22.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 6 + (((tickAnim - 18) / 2) * (27.5-(6)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL2, MetatarsalL2.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL2.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.5 + (((tickAnim - 0) / 1) * (3.33-(27.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 3.33 + (((tickAnim - 1) / 1) * (59.17-(3.33)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 59.17 + (((tickAnim - 2) / 1) * (50-(59.17)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 50 + (((tickAnim - 3) / 2) * (57.5-(50)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 57.5 + (((tickAnim - 5) / 1) * (0.42-(57.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.42 + (((tickAnim - 6) / 2) * (-16.25-(0.42)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -16.25 + (((tickAnim - 8) / 1) * (-15.74622-(-16.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (10.27303-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (8.72558-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -15.74622 + (((tickAnim - 9) / 1) * (57.5-(-15.74622)));
            yy = 10.27303 + (((tickAnim - 9) / 1) * (0-(10.27303)));
            zz = 8.72558 + (((tickAnim - 9) / 1) * (0-(8.72558)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 57.5 + (((tickAnim - 10) / 1) * (73.33-(57.5)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 73.33 + (((tickAnim - 11) / 1) * (41.67-(73.33)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 41.67 + (((tickAnim - 12) / 3) * (57.5-(41.67)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 57.5 + (((tickAnim - 15) / 1) * (0.42-(57.5)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.42 + (((tickAnim - 16) / 2) * (-16.25-(0.42)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -16.25 + (((tickAnim - 18) / 1) * (-15.74622-(-16.25)));
            yy = 0 + (((tickAnim - 18) / 1) * (10.27303-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (8.72558-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -15.74622 + (((tickAnim - 19) / 1) * (57.5-(-15.74622)));
            yy = 10.27303 + (((tickAnim - 19) / 1) * (0-(10.27303)));
            zz = 8.72558 + (((tickAnim - 19) / 1) * (0-(8.72558)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(5+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440+180))*5), Tail1.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720+60))*10), Tail1.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720+60))*5));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-5+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440+120))*7.5), Tail2.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*10), Tail2.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440+60))*10), Tail3.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720-30))*10), Tail3.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720-30))*5));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440))*10), Tail4.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720-60))*10), Tail4.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720-60))*5));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440+60))*3), Body.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720-60))*5), Body.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720-60))*5));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440))*3), Chest.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*5), Chest.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*5));


        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(20+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440))*-6), ArmL.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), ArmL.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*-5));


        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(-30+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440+60))*-6), ElbowL.rotateAngleY + (float) Math.toRadians(0), ElbowL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(20+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440))*-6), ArmL2.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), ArmL2.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720))*-5));


        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(-30+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440+60))*-6), ElbowL2.rotateAngleY + (float) Math.toRadians(0), ElbowL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440+30))*10), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440+90))*-5), Neck2.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720+120))*5), Neck2.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720+120))*5));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440))*-15), Neck1.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720+60))*5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720+60))*5));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*1440+60))*5), Head.rotateAngleY + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-5), Head.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-5));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animHopping(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCompsognathus entity = (EntityPrehistoricFloraCompsognathus) entitylivingbaseIn;

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
        this.Compsognathus.rotationPointX = this.Compsognathus.rotationPointX + (float)(xx);
        this.Compsognathus.rotationPointY = this.Compsognathus.rotationPointY - (float)(yy);
        this.Compsognathus.rotationPointZ = this.Compsognathus.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(KneeL2, KneeL2.rotateAngleX + (float) Math.toRadians(xx), KneeL2.rotateAngleY + (float) Math.toRadians(yy), KneeL2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(MetatarsalL2, MetatarsalL2.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL2.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(HandL2, HandL2.rotateAngleX + (float) Math.toRadians(xx), HandL2.rotateAngleY + (float) Math.toRadians(yy), HandL2.rotateAngleZ + (float) Math.toRadians(zz));




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
        EntityPrehistoricFloraCompsognathus e = (EntityPrehistoricFloraCompsognathus) entity;
        animator.update(entity);

    }
}
