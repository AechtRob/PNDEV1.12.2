package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDryosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraDysalotosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDryosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Dryosaurus;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer ElbowL;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer ArmR;
    private final AdvancedModelRenderer ElbowR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer HeadslopeNOANIMATION;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer Nares_r1;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer HeadslopeNOANIMATION2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer Nares_r2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer JawSlopeNOANIMATION;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer JawSlopeNOANIMATION2;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer CheeksNOANIMATION;
    private final AdvancedModelRenderer CheekInternal_r1;
    private final AdvancedModelRenderer CheeksNOANIMATION2;
    private final AdvancedModelRenderer CheekInternal_r2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer KneeL;
    private final AdvancedModelRenderer TarsalsL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer KneeR;
    private final AdvancedModelRenderer TarsalsR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer cube_r51;

    private ModelAnimator animator;

    public ModelDryosaurus() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.Dryosaurus = new AdvancedModelRenderer(this);
        this.Dryosaurus.setRotationPoint(1.0F, 3.9F, 5.3F);


        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(0.0F, 0.0F, -0.28F);
        this.Dryosaurus.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.1396F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 29, 37, -5.0F, -4.3F, -3.64F, 8, 12, 8, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -2.66F);
        this.Dryosaurus.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -5.5F, -4.76F, -9.94F, 9, 12, 10, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(-0.5F, -0.2F, -9.54F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1396F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 5.32F, -7.56F);
        this.Chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 49, -4.2004F, -7.0015F, -0.7791F, 7, 7, 9, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.36F, -0.1F);
        this.Chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2793F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 12, -4.5F, -0.0374F, -10.6131F, 8, 7, 11, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(3.0F, 3.4F, -8.9F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.7941F, 0.0F, 0.0F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 0, 45, 0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));

        this.ElbowL = new AdvancedModelRenderer(this);
        this.ElbowL.setRotationPoint(0.0F, 5.7F, 1.7F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.3403F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ElbowL.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.1694F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 66, 0.0F, 0.0F, -1.7F, 1, 5, 2, -0.01F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(1.0F, 0.9F, -5.0F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0698F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.387F, 0.1213F, 0.0493F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 0, -1.0F, -0.6F, -2.0F, 1, 2, 2, 0.0F, false));

        this.ArmR = new AdvancedModelRenderer(this);
        this.ArmR.setRotationPoint(-4.0F, 3.4F, -8.9F);
        this.Chest.addChild(ArmR);
        this.setRotateAngle(ArmR, 0.7941F, 0.0F, 0.0F);
        this.ArmR.cubeList.add(new ModelBox(ArmR, 0, 45, -1.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, true));

        this.ElbowR = new AdvancedModelRenderer(this);
        this.ElbowR.setRotationPoint(0.0F, 5.7F, 1.7F);
        this.ArmR.addChild(ElbowR);
        this.setRotateAngle(ElbowR, -0.3403F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ElbowR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.1694F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 66, -1.0F, 0.0F, -1.7F, 1, 5, 2, -0.01F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-1.0F, 0.9F, -5.0F);
        this.ElbowR.addChild(HandR);
        this.setRotateAngle(HandR, 0.0698F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.387F, -0.1213F, -0.0493F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 0, 0.0F, -0.6F, -2.0F, 1, 2, 2, 0.0F, true));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.14F, -8.66F);
        this.Chest.addChild(Neck1);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.1F, -0.16F);
        this.Neck1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.576F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 71, 37, -0.5F, -2.7F, -3.36F, 0, 5, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.1F, -0.16F);
        this.Neck1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2269F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 31, -3.0F, 0.3F, -3.36F, 5, 5, 6, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.28F, -3.22F);
        this.Neck1.addChild(Neck2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.68F, -0.16F);
        this.Neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6807F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 65, -0.5F, -4.4792F, -3.3008F, 0, 4, 3, 0.002F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 15, -2.0F, -0.4792F, -3.3008F, 3, 4, 6, 0.002F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -3.0F, -2.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0873F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.8988F, -2.8653F);
        this.Neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4014F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 71, 26, -1.5F, -1.9535F, -2.6299F, 2, 2, 3, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7012F, -0.5653F);
        this.Neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.9112F, -0.0751F, 0.0965F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.2F, -2.1712F, -2.9513F, 0, 4, 4, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.7012F, -0.5653F);
        this.Neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.9112F, 0.0751F, -0.0965F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.4F, -2.1712F, -2.9513F, 0, 4, 4, -0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.7012F, -0.5653F);
        this.Neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.9076F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.5F, -2.1712F, -3.7513F, 0, 4, 4, -0.002F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.6012F, 0.1347F);
        this.Neck3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6807F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 0, -2.0F, -0.0712F, -3.6513F, 3, 4, 4, -0.002F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -1.6612F, -2.7253F);
        this.Neck3.addChild(Neck4);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.9F, -1.54F, -1.7F);
        this.Neck4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.2218F, -0.3997F, -0.2566F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 46, -1.6131F, -3.9036F, -0.1286F, 0, 3, 2, -0.01F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.1F, -1.54F, -1.7F);
        this.Neck4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.2218F, 0.3997F, 0.2566F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 46, -0.1869F, -3.0036F, 0.0714F, 0, 3, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -1.54F, -1.7F);
        this.Neck4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.0199F, 0.1792F, 0.109F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 46, 0.0F, -3.0284F, -0.2286F, 0, 3, 2, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -1.54F, -1.7F);
        this.Neck4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.0182F, -0.194F, -0.1184F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 46, 0.0F, -3.0284F, -0.2286F, 0, 3, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -1.54F, -1.7F);
        this.Neck4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.0472F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 46, 0.0F, -3.5284F, 0.3714F, 0, 3, 2, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -1.54F, -1.7F);
        this.Neck4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0698F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 46, 0.0F, -1.7284F, -0.4286F, 0, 3, 2, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -1.54F, -1.7F);
        this.Neck4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.6109F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 46, 0.0F, -3.0284F, -0.2286F, 0, 3, 2, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -1.54F, -1.7F);
        this.Neck4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1571F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 67, 65, -1.5F, -0.0284F, -0.2286F, 3, 3, 2, -0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.5F, -0.3F, -1.7F);
        this.Neck4.addChild(Head);
        this.setRotateAngle(Head, -0.0698F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -0.8961F, -2.0679F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2269F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 25, 31, -2.0F, 0.0236F, -0.027F, 3, 1, 2, -0.001F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -0.7961F, -2.0679F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4014F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 43, 4, -1.5F, -0.0727F, -0.977F, 2, 1, 1, -0.001F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.8039F, -4.5679F);
        this.Head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.0734F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 5, 0, -0.5F, 0.0273F, -0.9868F, 1, 1, 1, 0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.8039F, -4.5679F);
        this.Head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6981F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 66, -0.5F, 0.0135F, 0.0291F, 1, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.3961F, -2.9679F);
        this.Head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.6807F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 49, 9, -1.0F, -0.0827F, -0.9695F, 2, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.5839F, -2.0679F);
        this.Head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3491F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 45, -2.0F, -0.4384F, -0.3996F, 3, 1, 1, 0.04F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.7039F, -2.8679F);
        this.Head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 50, 31, -0.5F, -1.0391F, -1.5201F, 1, 1, 2, -0.002F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.0961F, 0.1321F);
        this.Head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0873F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 71, 49, -1.0F, 1.6888F, -3.0527F, 2, 1, 3, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 37, 31, -1.5F, 0.4888F, -3.0527F, 3, 2, 3, 0.001F, false));

        this.HeadslopeNOANIMATION = new AdvancedModelRenderer(this);
        this.HeadslopeNOANIMATION.setRotationPoint(1.5F, 1.7039F, -2.6679F);
        this.Head.addChild(HeadslopeNOANIMATION);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadslopeNOANIMATION.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.13F, 0.8335F, 0.0965F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 15, -1.02F, -1.0565F, -1.03F, 1, 1, 1, -0.001F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.HeadslopeNOANIMATION.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.13F, 0.8335F, 0.0965F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 66, -0.9747F, -0.9592F, -1.0708F, 1, 1, 1, -0.003F, false));

        this.Nares_r1 = new AdvancedModelRenderer(this);
        this.Nares_r1.setRotationPoint(-0.5F, -1.5F, -1.0F);
        this.HeadslopeNOANIMATION.addChild(Nares_r1);
        this.setRotateAngle(Nares_r1, 0.7552F, 0.3301F, 0.3031F);
        this.Nares_r1.cubeList.add(new ModelBox(Nares_r1, 61, 0, -0.9848F, -0.0827F, -1.0311F, 1, 1, 1, -0.002F, false));
        this.Nares_r1.cubeList.add(new ModelBox(Nares_r1, 56, 20, -0.9848F, -0.0827F, -1.2311F, 1, 1, 1, -0.003F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.1F, -0.1F, -0.2F);
        this.HeadslopeNOANIMATION.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0941F, 0.3824F, 0.0352F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 71, 54, -0.5F, -0.9395F, -1.0288F, 1, 1, 1, -0.003F, false));

        this.HeadslopeNOANIMATION2 = new AdvancedModelRenderer(this);
        this.HeadslopeNOANIMATION2.setRotationPoint(-1.5F, 1.7039F, -2.6679F);
        this.Head.addChild(HeadslopeNOANIMATION2);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadslopeNOANIMATION2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.13F, -0.8335F, -0.0965F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 66, 15, 0.02F, -1.0565F, -1.03F, 1, 1, 1, -0.001F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.HeadslopeNOANIMATION2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.13F, -0.8335F, -0.0965F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 16, 66, -0.0253F, -0.9592F, -1.0708F, 1, 1, 1, -0.003F, true));

        this.Nares_r2 = new AdvancedModelRenderer(this);
        this.Nares_r2.setRotationPoint(0.5F, -1.5F, -1.0F);
        this.HeadslopeNOANIMATION2.addChild(Nares_r2);
        this.setRotateAngle(Nares_r2, 0.7552F, -0.3301F, -0.3031F);
        this.Nares_r2.cubeList.add(new ModelBox(Nares_r2, 61, 0, -0.0152F, -0.0827F, -1.0311F, 1, 1, 1, -0.002F, true));
        this.Nares_r2.cubeList.add(new ModelBox(Nares_r2, 56, 20, -0.0152F, -0.0827F, -1.2311F, 1, 1, 1, -0.003F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.1F, -0.1F, -0.2F);
        this.HeadslopeNOANIMATION2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0941F, -0.3824F, -0.0352F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 71, 54, -0.5F, -0.9395F, -1.0288F, 1, 1, 1, -0.003F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.5039F, 0.2321F);
        this.Head.addChild(Jaw);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0349F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 7, 45, -1.5F, -1.0F, -1.0F, 3, 1, 1, -0.001F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 1.2F, -2.9F);
        this.Jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1745F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 71, 32, -1.0F, -1.1427F, 0.1936F, 2, 1, 3, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0873F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 43, 0, -1.0F, -0.3F, -3.0F, 2, 1, 2, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 56, 15, -1.5F, -0.1F, -3.0F, 3, 1, 3, 0.001F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 54, -0.5F, -0.1F, -4.1568F, 1, 1, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.3F, -4.1F);
        this.Jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.4538F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 67, 26, -0.5F, -1.0501F, -0.9747F, 1, 1, 1, 0.0F, false));

        this.JawSlopeNOANIMATION = new AdvancedModelRenderer(this);
        this.JawSlopeNOANIMATION.setRotationPoint(0.4F, 0.1F, -3.1F);
        this.Jaw.addChild(JawSlopeNOANIMATION);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawSlopeNOANIMATION.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0941F, 0.3824F, 0.0352F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 61, 20, -0.5F, 0.0773F, -0.9288F, 1, 1, 1, -0.008F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.1F, 0.1F, 0.1F);
        this.JawSlopeNOANIMATION.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1353F, 0.8681F, 0.1035F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 62, 43, -1.1F, -0.0378F, -0.994F, 1, 1, 1, -0.001F, false));

        this.JawSlopeNOANIMATION2 = new AdvancedModelRenderer(this);
        this.JawSlopeNOANIMATION2.setRotationPoint(-0.4F, 0.1F, -3.1F);
        this.Jaw.addChild(JawSlopeNOANIMATION2);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawSlopeNOANIMATION2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0941F, -0.3824F, -0.0352F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 61, 20, -0.5F, 0.0773F, -0.9288F, 1, 1, 1, -0.008F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.1F, 0.1F, 0.1F);
        this.JawSlopeNOANIMATION2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1353F, -0.8681F, -0.1035F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 62, 43, 0.1F, -0.0378F, -0.994F, 1, 1, 1, -0.001F, true));

        this.CheeksNOANIMATION = new AdvancedModelRenderer(this);
        this.CheeksNOANIMATION.setRotationPoint(1.4F, 0.0F, -1.1F);
        this.Jaw.addChild(CheeksNOANIMATION);


        this.CheekInternal_r1 = new AdvancedModelRenderer(this);
        this.CheekInternal_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CheeksNOANIMATION.addChild(CheekInternal_r1);
        this.setRotateAngle(CheekInternal_r1, -0.1049F, 0.0046F, -0.0871F);
        this.CheekInternal_r1.cubeList.add(new ModelBox(CheekInternal_r1, 11, 66, -0.02F, -1.6424F, -1.8015F, 0, 2, 2, -0.001F, false));
        this.CheekInternal_r1.cubeList.add(new ModelBox(CheekInternal_r1, 14, 69, 0.0F, -1.6424F, -1.8015F, 0, 2, 2, -0.001F, false));

        this.CheeksNOANIMATION2 = new AdvancedModelRenderer(this);
        this.CheeksNOANIMATION2.setRotationPoint(-1.4F, 0.0F, -1.1F);
        this.Jaw.addChild(CheeksNOANIMATION2);


        this.CheekInternal_r2 = new AdvancedModelRenderer(this);
        this.CheekInternal_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CheeksNOANIMATION2.addChild(CheekInternal_r2);
        this.setRotateAngle(CheekInternal_r2, -0.1049F, -0.0046F, 0.0871F);
        this.CheekInternal_r2.cubeList.add(new ModelBox(CheekInternal_r2, 11, 66, 0.02F, -1.6424F, -1.8015F, 0, 2, 2, -0.001F, true));
        this.CheekInternal_r2.cubeList.add(new ModelBox(CheekInternal_r2, 14, 69, 0.0F, -1.6424F, -1.8015F, 0, 2, 2, -0.001F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -1.42F, 4.44F);
        this.Dryosaurus.addChild(Tail1);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -0.7F, -0.14F);
        this.Tail1.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.2793F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 23, -4.0F, -1.14F, -1.28F, 6, 9, 12, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 2.6F, 9.8F);
        this.Tail1.addChild(Tail2);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, -0.86F, 0.46F);
        this.Tail2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.192F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 51, 47, -3.0F, -0.4167F, -0.7203F, 4, 6, 11, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 2.32F, 9.84F);
        this.Tail2.addChild(Tail3);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, -1.5F, 0.4F);
        this.Tail3.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0873F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 56, 0, -2.5F, 0.2F, -0.14F, 3, 4, 10, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.6F, 9.26F);
        this.Tail3.addChild(Tail4);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -0.64F, 1.44F);
        this.Tail4.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0349F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 54, 65, -2.0F, -0.2F, -1.0F, 2, 3, 8, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -0.1F, 7.9F);
        this.Tail4.addChild(Tail5);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -0.62F, 0.92F);
        this.Tail5.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1745F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 66, -1.5F, 0.2596F, -0.7196F, 1, 2, 8, -0.001F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(3.0F, 0.0F, -0.28F);
        this.Dryosaurus.addChild(LegL);
        this.setRotateAngle(LegL, -0.384F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 33, 58, -1.0F, -1.3F, -2.3F, 3, 9, 7, 0.0F, false));

        this.KneeL = new AdvancedModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 7.3F, -1.8F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.925F, 0.0F, 0.0F);
        this.KneeL.cubeList.add(new ModelBox(KneeL, 18, 66, -1.01F, 0.1F, -0.5F, 3, 10, 4, -0.001F, false));

        this.TarsalsL = new AdvancedModelRenderer(this);
        this.TarsalsL.setRotationPoint(0.0F, 9.6F, 3.1F);
        this.KneeL.addChild(TarsalsL);
        this.setRotateAngle(TarsalsL, -0.8727F, 0.0F, 0.0F);
        this.TarsalsL.cubeList.add(new ModelBox(TarsalsL, 0, 23, -0.5F, 0.0F, -2.6F, 2, 7, 3, -0.01F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 7.0F, -0.4F);
        this.TarsalsL.addChild(FootL);
        this.setRotateAngle(FootL, 0.4014F, 0.0F, 0.0F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.0698F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 29, 0, -1.01F, -1.0F, -6.0F, 3, 2, 7, 0.0F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-5.0F, 0.0F, -0.28F);
        this.Dryosaurus.addChild(LegR);
        this.setRotateAngle(LegR, -0.384F, 0.0F, 0.0F);
        this.LegR.cubeList.add(new ModelBox(LegR, 33, 58, -2.0F, -1.3F, -2.3F, 3, 9, 7, 0.0F, true));

        this.KneeR = new AdvancedModelRenderer(this);
        this.KneeR.setRotationPoint(0.0F, 7.3F, -1.8F);
        this.LegR.addChild(KneeR);
        this.setRotateAngle(KneeR, 0.925F, 0.0F, 0.0F);
        this.KneeR.cubeList.add(new ModelBox(KneeR, 18, 66, -1.99F, 0.1F, -0.5F, 3, 10, 4, -0.001F, true));

        this.TarsalsR = new AdvancedModelRenderer(this);
        this.TarsalsR.setRotationPoint(0.0F, 9.6F, 3.1F);
        this.KneeR.addChild(TarsalsR);
        this.setRotateAngle(TarsalsR, -0.8727F, 0.0F, 0.0F);
        this.TarsalsR.cubeList.add(new ModelBox(TarsalsR, 0, 23, -1.5F, 0.0F, -2.6F, 2, 7, 3, -0.01F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 7.0F, -0.4F);
        this.TarsalsR.addChild(FootR);
        this.setRotateAngle(FootR, 0.4014F, 0.0F, 0.0F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootR.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0698F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 29, 0, -1.99F, -1.0F, -6.0F, 3, 2, 7, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Dryosaurus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Neck1.rotateAngleX = 0.2F;
        this.Neck1.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Chest, (float)Math.toRadians(8), 0.0F, 0.0F);
        this.setRotateAngle(ArmL, (float)Math.toRadians(45.5), 0.0F, 0.0F);
        this.setRotateAngle(ArmR, (float)Math.toRadians(40.5), 0.0F, 0.0F);
        this.setRotateAngle(LegL, -(float)Math.toRadians(-0.5), 0.0F, 0.0F);
        this.setRotateAngle(LegR, -(float)Math.toRadians(77), 0.0F, 0.0F);
        this.setRotateAngle(KneeL, -(float)Math.toRadians(-71), 0.0F, 0.0F);
        this.setRotateAngle(KneeR, -(float)Math.toRadians(-90.5), 0.0F, 0.0F);
        this.setRotateAngle(TarsalsR, -(float)Math.toRadians(87.5), 0.0F, 0.0F);
        this.setRotateAngle(TarsalsL, -(float)Math.toRadians(43), 0.0F, 0.0F);
        this.setRotateAngle(FootL, -(float)Math.toRadians(-53.5), 0.0F, 0.0F);
        this.setRotateAngle(FootR, -(float)Math.toRadians(-108), 0.0F, 0.0F);
        this.setRotateAngle(Neck1, (float)Math.toRadians(0), (float)Math.toRadians(7.5), (float)Math.toRadians(0));
        this.setRotateAngle(Neck2, -(float)Math.toRadians(0), (float)Math.toRadians(12.5), -(float)Math.toRadians(0));
        this.setRotateAngle(Neck3, -(float)Math.toRadians(5), 0.0F, 0.0F);
        this.setRotateAngle(Jaw, (float)Math.toRadians(24), 0.0F, 0.0F);
        this.setRotateAngle(Head, -(float)Math.toRadians(4.0968), (float)Math.toRadians(12.4691), (float)Math.toRadians(0.886));
        this.setRotateAngle(Tail1, -(float)Math.toRadians(-5), -(float)Math.toRadians(-0), -(float)Math.toRadians(0));
        this.setRotateAngle(Tail2, -(float)Math.toRadians(-2.5), -(float)Math.toRadians(-0), -(float)Math.toRadians(0));
        this.setRotateAngle(Tail3, -(float)Math.toRadians(-2.5), -(float)Math.toRadians(-0), -(float)Math.toRadians(0));
        this.setRotateAngle(Tail4, -(float)Math.toRadians(12.5), -(float)Math.toRadians(-0), -(float)Math.toRadians(0));
        this.setRotateAngle(Tail5, -(float)Math.toRadians(15), -(float)Math.toRadians(-0), -(float)Math.toRadians(-0));
        this.Dryosaurus.offsetY = -0.1F;
        this.Dryosaurus.render(0.01f);
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

        EntityPrehistoricFloraDryosaurus entityDryosaurus = (EntityPrehistoricFloraDryosaurus) e;

        this.faceTarget(f3, f4, 10, Neck1);
        this.faceTarget(f3, f4, 10, Neck2);
        this.faceTarget(f3, f4, 10, Neck3);
        this.faceTarget(f3, f4, 10, Neck4);
        this.faceTarget(f3, f4, 10, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Neck4, this.Head};
        AdvancedModelRenderer[] ArmL = {this.ArmL, this.ElbowL, this.HandL};
        AdvancedModelRenderer[] ArmR = {this.ArmR, this.ElbowR, this.HandR};

        entityDryosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityDryosaurus.getAnimation() == entityDryosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityDryosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityDryosaurus.getIsMoving()) {
                    if (entityDryosaurus.getAnimation() != entityDryosaurus.EAT_ANIMATION
                        && entityDryosaurus.getAnimation() != entityDryosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.ArmL, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.ArmR, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.ElbowL, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.ElbowR, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);


                    return;
                }

                if (entityDryosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraDryosaurus ee = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
            //animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            if(ee instanceof EntityPrehistoricFloraDysalotosaurus) {
                animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
            } else {
                animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
            }
        }
        else if (ee.getAnimation() == ee.CHATTER_ANIMATION) { //The noise anim
            animChatter(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LONG_CHATTER_ANIMATION) { //The noise anim
            animLongChatter(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALARM_ANIMATION) { //The panic anim
            animAlarm(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

        int animCycle = 14;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (-5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = -5D + (((tickAnim - 3D) / 11D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 3D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = -2.5D + (((tickAnim - 3D) / 11D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 3D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 5D + (((tickAnim - 8D) / 6D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 8D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (15D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 15D + (((tickAnim - 2D) / 6D) * (15D-(15D)));
            yy = 0D + (((tickAnim - 2D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 15D + (((tickAnim - 8D) / 3D) * (12D-(15D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 12D + (((tickAnim - 11D) / 3D) * (0D-(12D)));
            yy = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animChatter(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -2.5D + (((tickAnim - 4D) / 9D) * (-3.81D-(-2.5D)));
            yy = 0D + (((tickAnim - 4D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.81D + (((tickAnim - 13D) / 5D) * (0.77D-(-3.81D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.77D + (((tickAnim - 18D) / 4D) * (0D-(0.77D)));
            yy = 0D + (((tickAnim - 18D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = -2.5D + (((tickAnim - 2D) / 14D) * (-2.5D-(-2.5D)));
            yy = 0D + (((tickAnim - 2D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 16D) / 4D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = 2.5D + (((tickAnim - 2D) / 14D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 2D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (-7.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = -7.5D + (((tickAnim - 2D) / 14D) * (-7.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 2D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -7.5D + (((tickAnim - 16D) / 4D) * (0D-(-7.5D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = 5D + (((tickAnim - 2D) / 14D) * (2.5D-(5D)));
            yy = 0D + (((tickAnim - 2D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 2.5D + (((tickAnim - 16D) / 4D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = -2.5D + (((tickAnim - 2D) / 14D) * (-2.5D-(-2.5D)));
            yy = 0D + (((tickAnim - 2D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 16D) / 4D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (0D-(0D)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5D + (((tickAnim - 2D) / 1D) * (5.42D-(2.5D)));
            yy = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 5.42D + (((tickAnim - 3D) / 0D) * (10.34D-(5.42D)));
            yy = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10.34D + (((tickAnim - 3D) / 1D) * (6.5D-(10.34D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 6.5D + (((tickAnim - 4D) / 1D) * (3.5D-(6.5D)));
            yy = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.5D + (((tickAnim - 5D) / 2D) * (5D-(3.5D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 5D + (((tickAnim - 7D) / 1D) * (2.5D-(5D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5D + (((tickAnim - 8D) / 1D) * (5D-(2.5D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 5D + (((tickAnim - 9D) / 3D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 9D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 12D) / 3D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.5D + (((tickAnim - 15D) / 3D) * (5D-(2.5D)));
            yy = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5D + (((tickAnim - 18D) / 2D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0D + (((tickAnim - 20D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLongChatter(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

        int animCycle = 23;
        double tickAnim = animTick +partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 5D + (((tickAnim - 5D) / 10D) * (5D-(5D)));
            yy = 0D + (((tickAnim - 5D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 5D + (((tickAnim - 15D) / 8D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 15D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 5D + (((tickAnim - 5D) / 10D) * (5D-(5D)));
            yy = 0D + (((tickAnim - 5D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 5D + (((tickAnim - 15D) / 8D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 15D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -2.5D + (((tickAnim - 5D) / 10D) * (-2.5D-(-2.5D)));
            yy = 0D + (((tickAnim - 5D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -2.5D + (((tickAnim - 15D) / 8D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 15D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (-7.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -7.5D + (((tickAnim - 5D) / 10D) * (-7.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 5D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -7.5D + (((tickAnim - 15D) / 8D) * (0D-(-7.5D)));
            yy = 0D + (((tickAnim - 15D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5D + (((tickAnim - 2D) / 1D) * (7.5D-(2.5D)));
            yy = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 7.5D + (((tickAnim - 3D) / 0D) * (12.5D-(7.5D)));
            yy = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.5D + (((tickAnim - 3D) / 2D) * (18.75D-(12.5D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 18.75D + (((tickAnim - 5D) / 1D) * (11.38D-(18.75D)));
            yy = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.38D + (((tickAnim - 6D) / 2D) * (18.3D-(11.38D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 18.3D + (((tickAnim - 8D) / 1D) * (11.29D-(18.3D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 11.29D + (((tickAnim - 9D) / 1D) * (20.53D-(11.29D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 20.53D + (((tickAnim - 10D) / 2D) * (12.77D-(20.53D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 12.77D + (((tickAnim - 12D) / 1D) * (20D-(12.77D)));
            yy = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 20D + (((tickAnim - 13D) / 1D) * (17.5D-(20D)));
            yy = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 17.5D + (((tickAnim - 14D) / 2D) * (20D-(17.5D)));
            yy = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 20D + (((tickAnim - 16D) / 1D) * (17.5D-(20D)));
            yy = 0D + (((tickAnim - 16D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 17.5D + (((tickAnim - 17D) / 1D) * (10D-(17.5D)));
            yy = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 10D + (((tickAnim - 18D) / 0D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 18D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 5D + (((tickAnim - 18D) / 5D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAlarm(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

        int animCycle = 18;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 2D) / 3D) * (-7.5D-(0D)));
            yy = 0D + (((tickAnim - 2D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.5D + (((tickAnim - 5D) / 3D) * (-12.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -12.5D + (((tickAnim - 8D) / 5D) * (-12.5D-(-12.5D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -12.5D + (((tickAnim - 13D) / 5D) * (0D-(-12.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 4D) / 9D) * (-7.5D-(-10D)));
            yy = 0D + (((tickAnim - 4D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -7.5D + (((tickAnim - 13D) / 5D) * (0D-(-7.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (-7.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -7.5D + (((tickAnim - 4D) / 4D) * (-1.36D-(-7.5D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -1.36D + (((tickAnim - 8D) / 5D) * (-5D-(-1.36D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5D + (((tickAnim - 13D) / 5D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (-5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = -5D + (((tickAnim - 2D) / 11D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 2D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 10D + (((tickAnim - 4D) / 9D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 4D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 5D + (((tickAnim - 13D) / 5D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 5D + (((tickAnim - 4D) / 6D) * (2.95D-(5D)));
            yy = 0D + (((tickAnim - 4D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 2.95D + (((tickAnim - 10D) / 1D) * (0D-(2.95D)));
            yy = 0D + (((tickAnim - 10D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 11D) / 1D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -2.5D + (((tickAnim - 12D) / 1D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 2.5D + (((tickAnim - 2D) / 4D) * (22.5D-(2.5D)));
            yy = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 22.5D + (((tickAnim - 6D) / 1D) * (20D-(22.5D)));
            yy = 0D + (((tickAnim - 6D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 20D + (((tickAnim - 7D) / 2D) * (17.5D-(20D)));
            yy = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 17.5D + (((tickAnim - 9D) / 2D) * (20D-(17.5D)));
            yy = 0D + (((tickAnim - 9D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 20D + (((tickAnim - 11D) / 7D) * (0D-(20D)));
            yy = 0D + (((tickAnim - 11D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

        int animCycle = 90;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (1.90793D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (-0.06661D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (1.99889D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 1.90793D + (((tickAnim - 5D) / 4D) * (3D-(1.90793D)));
            yy = -0.06661D + (((tickAnim - 5D) / 4D) * (0D-(-0.06661D)));
            zz = 1.99889D + (((tickAnim - 5D) / 4D) * (0D-(1.99889D)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 3D + (((tickAnim - 9D) / 7D) * (4.66717D-(3D)));
            yy = 0D + (((tickAnim - 9D) / 7D) * (-0.1628D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 7D) * (1.99337D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 4.66717D + (((tickAnim - 16D) / 7D) * (6.09275D-(4.66717D)));
            yy = -0.1628D + (((tickAnim - 16D) / 7D) * (-0.14276D-(-0.1628D)));
            zz = 1.99337D + (((tickAnim - 16D) / 7D) * (1.74803D-(1.99337D)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 6.09275D + (((tickAnim - 23D) / 8D) * (4.02384D-(6.09275D)));
            yy = -0.14276D + (((tickAnim - 23D) / 8D) * (-0.11772D-(-0.14276D)));
            zz = 1.74803D + (((tickAnim - 23D) / 8D) * (1.44136D-(1.74803D)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 4.02384D + (((tickAnim - 31D) / 8D) * (3.15677D-(4.02384D)));
            yy = -0.11772D + (((tickAnim - 31D) / 8D) * (-1.7031D-(-0.11772D)));
            zz = 1.44136D + (((tickAnim - 31D) / 8D) * (-5.96477D-(1.44136D)));
        }
        else if (tickAnim >= 39 && tickAnim < 47) {
            xx = 3.15677D + (((tickAnim - 39D) / 8D) * (3.38891D-(3.15677D)));
            yy = -1.7031D + (((tickAnim - 39D) / 8D) * (0.71117D-(-1.7031D)));
            zz = -5.96477D + (((tickAnim - 39D) / 8D) * (-4.51388D-(-5.96477D)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 3.38891D + (((tickAnim - 47D) / 6D) * (5.06D-(3.38891D)));
            yy = 0.71117D + (((tickAnim - 47D) / 6D) * (3.49D-(0.71117D)));
            zz = -4.51388D + (((tickAnim - 47D) / 6D) * (-0.89D-(-4.51388D)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 5.06D + (((tickAnim - 53D) / 4D) * (5.22364D-(5.06D)));
            yy = 3.49D + (((tickAnim - 53D) / 4D) * (1.16631D-(3.49D)));
            zz = -0.89D + (((tickAnim - 53D) / 4D) * (3.4756D-(-0.89D)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = 5.22364D + (((tickAnim - 57D) / 5D) * (2.65D-(5.22364D)));
            yy = 1.16631D + (((tickAnim - 57D) / 5D) * (0.71D-(1.16631D)));
            zz = 3.4756D + (((tickAnim - 57D) / 5D) * (4.43D-(3.4756D)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 2.65D + (((tickAnim - 62D) / 1D) * (0.25051D-(2.65D)));
            yy = 0.71D + (((tickAnim - 62D) / 1D) * (0.64103D-(0.71D)));
            zz = 4.43D + (((tickAnim - 62D) / 1D) * (4.235D-(4.43D)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = 0.25051D + (((tickAnim - 63D) / 8D) * (-5.17D-(0.25051D)));
            yy = 0.64103D + (((tickAnim - 63D) / 8D) * (0.45D-(0.64103D)));
            zz = 4.235D + (((tickAnim - 63D) / 8D) * (0.79D-(4.235D)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = -5.17D + (((tickAnim - 71D) / 7D) * (1.05D-(-5.17D)));
            yy = 0.45D + (((tickAnim - 71D) / 7D) * (0.29D-(0.45D)));
            zz = 0.79D + (((tickAnim - 71D) / 7D) * (0.29D-(0.79D)));
        }
        else if (tickAnim >= 78 && tickAnim < 84) {
            xx = 1.05D + (((tickAnim - 78D) / 6D) * (0.84D-(1.05D)));
            yy = 0.29D + (((tickAnim - 78D) / 6D) * (0.12D-(0.29D)));
            zz = 0.29D + (((tickAnim - 78D) / 6D) * (3.1D-(0.29D)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = 0.84D + (((tickAnim - 84D) / 6D) * (0D-(0.84D)));
            yy = 0.12D + (((tickAnim - 84D) / 6D) * (0D-(0.12D)));
            zz = 3.1D + (((tickAnim - 84D) / 6D) * (0D-(3.1D)));
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (-0.19333D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0.03083D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (-1.99045D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -0.19333D + (((tickAnim - 9D) / 11D) * (-0.10763D-(-0.19333D)));
            yy = 0.03083D + (((tickAnim - 9D) / 11D) * (0.0498D-(0.03083D)));
            zz = -1.99045D + (((tickAnim - 9D) / 11D) * (-0.85227D-(-1.99045D)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -0.10763D + (((tickAnim - 20D) / 6D) * (2.18D-(-0.10763D)));
            yy = 0.0498D + (((tickAnim - 20D) / 6D) * (-0.09D-(0.0498D)));
            zz = -0.85227D + (((tickAnim - 20D) / 6D) * (-5.95D-(-0.85227D)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 2.18D + (((tickAnim - 26D) / 7D) * (4.92026D-(2.18D)));
            yy = -0.09D + (((tickAnim - 26D) / 7D) * (0.04101D-(-0.09D)));
            zz = -5.95D + (((tickAnim - 26D) / 7D) * (-0.59913D-(-5.95D)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 4.92026D + (((tickAnim - 33D) / 8D) * (5.38628D-(4.92026D)));
            yy = 0.04101D + (((tickAnim - 33D) / 8D) * (2.38926D-(0.04101D)));
            zz = -0.59913D + (((tickAnim - 33D) / 8D) * (4.45237D-(-0.59913D)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 5.38628D + (((tickAnim - 41D) / 7D) * (3.53D-(5.38628D)));
            yy = 2.38926D + (((tickAnim - 41D) / 7D) * (1.04D-(2.38926D)));
            zz = 4.45237D + (((tickAnim - 41D) / 7D) * (-2.92D-(4.45237D)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 3.53D + (((tickAnim - 48D) / 4D) * (2.85819D-(3.53D)));
            yy = 1.04D + (((tickAnim - 48D) / 4D) * (0.11499D-(1.04D)));
            zz = -2.92D + (((tickAnim - 48D) / 4D) * (-1.10732D-(-2.92D)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 2.85819D + (((tickAnim - 52D) / 4D) * (4.71D-(2.85819D)));
            yy = 0.11499D + (((tickAnim - 52D) / 4D) * (0.05D-(0.11499D)));
            zz = -1.10732D + (((tickAnim - 52D) / 4D) * (3.12D-(-1.10732D)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 4.71D + (((tickAnim - 56D) / 5D) * (6.33359D-(4.71D)));
            yy = 0.05D + (((tickAnim - 56D) / 5D) * (0.10285D-(0.05D)));
            zz = 3.12D + (((tickAnim - 56D) / 5D) * (-0.77614D-(3.12D)));
        }
        else if (tickAnim >= 61 && tickAnim < 69) {
            xx = 6.33359D + (((tickAnim - 61D) / 8D) * (-5.58D-(6.33359D)));
            yy = 0.10285D + (((tickAnim - 61D) / 8D) * (0.08D-(0.10285D)));
            zz = -0.77614D + (((tickAnim - 61D) / 8D) * (-0.87D-(-0.77614D)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = -5.58D + (((tickAnim - 69D) / 4D) * (-6.55D-(-5.58D)));
            yy = 0.08D + (((tickAnim - 69D) / 4D) * (0.07D-(0.08D)));
            zz = -0.87D + (((tickAnim - 69D) / 4D) * (-0.99D-(-0.87D)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = -6.55D + (((tickAnim - 73D) / 3D) * (-0.01D-(-6.55D)));
            yy = 0.07D + (((tickAnim - 73D) / 3D) * (0.06D-(0.07D)));
            zz = -0.99D + (((tickAnim - 73D) / 3D) * (-0.63D-(-0.99D)));
        }
        else if (tickAnim >= 76 && tickAnim < 79) {
            xx = -0.01D + (((tickAnim - 76D) / 3D) * (0.45D-(-0.01D)));
            yy = 0.06D + (((tickAnim - 76D) / 3D) * (0.05D-(0.06D)));
            zz = -0.63D + (((tickAnim - 76D) / 3D) * (4.43D-(-0.63D)));
        }
        else if (tickAnim >= 79 && tickAnim < 82) {
            xx = 0.45D + (((tickAnim - 79D) / 3D) * (0.18D-(0.45D)));
            yy = 0.05D + (((tickAnim - 79D) / 3D) * (0.04D-(0.05D)));
            zz = 4.43D + (((tickAnim - 79D) / 3D) * (3.13D-(4.43D)));
        }
        else if (tickAnim >= 82 && tickAnim < 85) {
            xx = 0.18D + (((tickAnim - 82D) / 3D) * (0.15D-(0.18D)));
            yy = 0.04D + (((tickAnim - 82D) / 3D) * (0.03D-(0.04D)));
            zz = 3.13D + (((tickAnim - 82D) / 3D) * (5.6D-(3.13D)));
        }
        else if (tickAnim >= 85 && tickAnim < 90) {
            xx = 0.15D + (((tickAnim - 85D) / 5D) * (0D-(0.15D)));
            yy = 0.03D + (((tickAnim - 85D) / 5D) * (0D-(0.03D)));
            zz = 5.6D + (((tickAnim - 85D) / 5D) * (0D-(5.6D)));
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 5D + (((tickAnim - 15D) / 19D) * (-3.28D-(5D)));
            yy = 0D + (((tickAnim - 15D) / 19D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 19D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 56) {
            xx = -3.28D + (((tickAnim - 34D) / 22D) * (-7.01D-(-3.28D)));
            yy = 0D + (((tickAnim - 34D) / 22D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 22D) * (0D-(0D)));
        }
        else if (tickAnim >= 56 && tickAnim < 69) {
            xx = -7.01D + (((tickAnim - 56D) / 13D) * (3.73D-(-7.01D)));
            yy = 0D + (((tickAnim - 56D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 56D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 69 && tickAnim < 78) {
            xx = 3.73D + (((tickAnim - 69D) / 9D) * (-9.66D-(3.73D)));
            yy = 0D + (((tickAnim - 69D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 69D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = -9.66D + (((tickAnim - 78D) / 7D) * (1.71D-(-9.66D)));
            yy = 0D + (((tickAnim - 78D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 78D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 85 && tickAnim < 90) {
            xx = 1.71D + (((tickAnim - 85D) / 5D) * (0D-(1.71D)));
            yy = 0D + (((tickAnim - 85D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 85D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 0D) / 18D) * (7D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 7D + (((tickAnim - 18D) / 11D) * (10.94D-(7D)));
            yy = 0D + (((tickAnim - 18D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 29 && tickAnim < 49) {
            xx = 10.94D + (((tickAnim - 29D) / 20D) * (14.34D-(10.94D)));
            yy = 0D + (((tickAnim - 29D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 29D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 49 && tickAnim < 62) {
            xx = 14.34D + (((tickAnim - 49D) / 13D) * (3.95D-(14.34D)));
            yy = 0D + (((tickAnim - 49D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 49D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 62 && tickAnim < 69) {
            xx = 3.95D + (((tickAnim - 62D) / 7D) * (21.9D-(3.95D)));
            yy = 0D + (((tickAnim - 62D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 62D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = 21.9D + (((tickAnim - 69D) / 6D) * (4.77D-(21.9D)));
            yy = 0D + (((tickAnim - 69D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 69D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 4.77D + (((tickAnim - 75D) / 8D) * (20.38D-(4.77D)));
            yy = 0D + (((tickAnim - 75D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 75D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 20.38D + (((tickAnim - 83D) / 7D) * (0D-(20.38D)));
            yy = 0D + (((tickAnim - 83D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 83D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 5D + (((tickAnim - 15D) / 19D) * (-3.28D-(5D)));
            yy = 0D + (((tickAnim - 15D) / 19D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 19D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 56) {
            xx = -3.28D + (((tickAnim - 34D) / 22D) * (-7.01D-(-3.28D)));
            yy = 0D + (((tickAnim - 34D) / 22D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 22D) * (0D-(0D)));
        }
        else if (tickAnim >= 56 && tickAnim < 69) {
            xx = -7.01D + (((tickAnim - 56D) / 13D) * (3.73D-(-7.01D)));
            yy = 0D + (((tickAnim - 56D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 56D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 69 && tickAnim < 78) {
            xx = 3.73D + (((tickAnim - 69D) / 9D) * (-9.66D-(3.73D)));
            yy = 0D + (((tickAnim - 69D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 69D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = -9.66D + (((tickAnim - 78D) / 7D) * (1.71D-(-9.66D)));
            yy = 0D + (((tickAnim - 78D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 78D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 85 && tickAnim < 90) {
            xx = 1.71D + (((tickAnim - 85D) / 5D) * (0D-(1.71D)));
            yy = 0D + (((tickAnim - 85D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 85D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 0D) / 18D) * (7D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 7D + (((tickAnim - 18D) / 11D) * (10.94D-(7D)));
            yy = 0D + (((tickAnim - 18D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 29 && tickAnim < 49) {
            xx = 10.94D + (((tickAnim - 29D) / 20D) * (14.34D-(10.94D)));
            yy = 0D + (((tickAnim - 29D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 29D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 49 && tickAnim < 62) {
            xx = 14.34D + (((tickAnim - 49D) / 13D) * (3.95D-(14.34D)));
            yy = 0D + (((tickAnim - 49D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 49D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 62 && tickAnim < 69) {
            xx = 3.95D + (((tickAnim - 62D) / 7D) * (21.9D-(3.95D)));
            yy = 0D + (((tickAnim - 62D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 62D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = 21.9D + (((tickAnim - 69D) / 6D) * (4.77D-(21.9D)));
            yy = 0D + (((tickAnim - 69D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 69D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 4.77D + (((tickAnim - 75D) / 8D) * (20.38D-(4.77D)));
            yy = 0D + (((tickAnim - 75D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 75D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 20.38D + (((tickAnim - 83D) / 7D) * (0D-(20.38D)));
            yy = 0D + (((tickAnim - 83D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 83D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (7.248D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (0.6324D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (-4.95995D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 7.248D + (((tickAnim - 8D) / 6D) * (11.14D-(7.248D)));
            yy = 0.6324D + (((tickAnim - 8D) / 6D) * (0.62D-(0.6324D)));
            zz = -4.95995D + (((tickAnim - 8D) / 6D) * (-4.88D-(-4.95995D)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 11.14D + (((tickAnim - 14D) / 11D) * (20.76D-(11.14D)));
            yy = 0.62D + (((tickAnim - 14D) / 11D) * (0.53D-(0.62D)));
            zz = -4.88D + (((tickAnim - 14D) / 11D) * (-4.16D-(-4.88D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 20.76D + (((tickAnim - 25D) / 10D) * (5.79D-(20.76D)));
            yy = 0.53D + (((tickAnim - 25D) / 10D) * (0.43D-(0.53D)));
            zz = -4.16D + (((tickAnim - 25D) / 10D) * (-3.39D-(-4.16D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 5.79D + (((tickAnim - 35D) / 8D) * (16.23D-(5.79D)));
            yy = 0.43D + (((tickAnim - 35D) / 8D) * (0.37D-(0.43D)));
            zz = -3.39D + (((tickAnim - 35D) / 8D) * (-2.94D-(-3.39D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 16.23D + (((tickAnim - 43D) / 7D) * (3.29D-(16.23D)));
            yy = 0.37D + (((tickAnim - 43D) / 7D) * (0.28D-(0.37D)));
            zz = -2.94D + (((tickAnim - 43D) / 7D) * (-2.24D-(-2.94D)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = 3.29D + (((tickAnim - 50D) / 9D) * (10.95D-(3.29D)));
            yy = 0.28D + (((tickAnim - 50D) / 9D) * (0.15D-(0.28D)));
            zz = -2.24D + (((tickAnim - 50D) / 9D) * (-1.19D-(-2.24D)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 10.95D + (((tickAnim - 59D) / 10D) * (-1.61D-(10.95D)));
            yy = 0.15D + (((tickAnim - 59D) / 10D) * (0.1D-(0.15D)));
            zz = -1.19D + (((tickAnim - 59D) / 10D) * (-0.77D-(-1.19D)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = -1.61D + (((tickAnim - 69D) / 6D) * (-6.14D-(-1.61D)));
            yy = 0.1D + (((tickAnim - 69D) / 6D) * (0.07D-(0.1D)));
            zz = -0.77D + (((tickAnim - 69D) / 6D) * (-0.56D-(-0.77D)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -6.14D + (((tickAnim - 75D) / 5D) * (0.34D-(-6.14D)));
            yy = 0.07D + (((tickAnim - 75D) / 5D) * (0.05D-(0.07D)));
            zz = -0.56D + (((tickAnim - 75D) / 5D) * (-0.38D-(-0.56D)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0.34D + (((tickAnim - 80D) / 10D) * (0D-(0.34D)));
            yy = 0.05D + (((tickAnim - 80D) / 10D) * (0D-(0.05D)));
            zz = -0.38D + (((tickAnim - 80D) / 10D) * (0D-(-0.38D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -10D + (((tickAnim - 7D) / 11D) * (-19.34D-(-10D)));
            yy = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 11D) * (5D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -19.34D + (((tickAnim - 18D) / 7D) * (15.59D-(-19.34D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 18D) / 7D) * (0D-(5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 15.59D + (((tickAnim - 25D) / 8D) * (-4D-(15.59D)));
            yy = 0D + (((tickAnim - 25D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 8D) * (-7.5D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -4D + (((tickAnim - 33D) / 8D) * (4.63484D-(-4D)));
            yy = 0D + (((tickAnim - 33D) / 8D) * (1.79573D-(0D)));
            zz = -7.5D + (((tickAnim - 33D) / 8D) * (11.83009D-(-7.5D)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 4.63484D + (((tickAnim - 41D) / 3D) * (12.88D-(4.63484D)));
            yy = 1.79573D + (((tickAnim - 41D) / 3D) * (1.85D-(1.79573D)));
            zz = 11.83009D + (((tickAnim - 41D) / 3D) * (5.44D-(11.83009D)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 12.88D + (((tickAnim - 44D) / 4D) * (0.27D-(12.88D)));
            yy = 1.85D + (((tickAnim - 44D) / 4D) * (1.54D-(1.85D)));
            zz = 5.44D + (((tickAnim - 44D) / 4D) * (10.71D-(5.44D)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0.27D + (((tickAnim - 48D) / 10D) * (18.86D-(0.27D)));
            yy = 1.54D + (((tickAnim - 48D) / 10D) * (0.83D-(1.54D)));
            zz = 10.71D + (((tickAnim - 48D) / 10D) * (5.79D-(10.71D)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 18.86D + (((tickAnim - 58D) / 5D) * (-3.67D-(18.86D)));
            yy = 0.83D + (((tickAnim - 58D) / 5D) * (0.48D-(0.83D)));
            zz = 5.79D + (((tickAnim - 58D) / 5D) * (3.37D-(5.79D)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = -3.67D + (((tickAnim - 63D) / 5D) * (1.19D-(-3.67D)));
            yy = 0.48D + (((tickAnim - 63D) / 5D) * (0.37D-(0.48D)));
            zz = 3.37D + (((tickAnim - 63D) / 5D) * (2.61D-(3.37D)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 1.19D + (((tickAnim - 68D) / 5D) * (3.39D-(1.19D)));
            yy = 0.37D + (((tickAnim - 68D) / 5D) * (0.29D-(0.37D)));
            zz = 2.61D + (((tickAnim - 68D) / 5D) * (2.07D-(2.61D)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 3.39D + (((tickAnim - 73D) / 5D) * (-4.64D-(3.39D)));
            yy = 0.29D + (((tickAnim - 73D) / 5D) * (0.2D-(0.29D)));
            zz = 2.07D + (((tickAnim - 73D) / 5D) * (1.42D-(2.07D)));
        }
        else if (tickAnim >= 78 && tickAnim < 84) {
            xx = -4.64D + (((tickAnim - 78D) / 6D) * (8.03D-(-4.64D)));
            yy = 0.2D + (((tickAnim - 78D) / 6D) * (0.1D-(0.2D)));
            zz = 1.42D + (((tickAnim - 78D) / 6D) * (0.71D-(1.42D)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = 8.03D + (((tickAnim - 84D) / 6D) * (0D-(8.03D)));
            yy = 0.1D + (((tickAnim - 84D) / 6D) * (0D-(0.1D)));
            zz = 0.71D + (((tickAnim - 84D) / 6D) * (0D-(0.71D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (-10.94289D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (0.51056D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (-1.04827D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -10.94289D + (((tickAnim - 8D) / 6D) * (9.08D-(-10.94289D)));
            yy = 0.51056D + (((tickAnim - 8D) / 6D) * (0.5D-(0.51056D)));
            zz = -1.04827D + (((tickAnim - 8D) / 6D) * (-1.03D-(-1.04827D)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 9.08D + (((tickAnim - 14D) / 7D) * (8.28D-(9.08D)));
            yy = 0.5D + (((tickAnim - 14D) / 7D) * (0.41D-(0.5D)));
            zz = -1.03D + (((tickAnim - 14D) / 7D) * (-0.84D-(-1.03D)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 8.28D + (((tickAnim - 21D) / 4D) * (2.69D-(8.28D)));
            yy = 0.41D + (((tickAnim - 21D) / 4D) * (0.66D-(0.41D)));
            zz = -0.84D + (((tickAnim - 21D) / 4D) * (-1.32D-(-0.84D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 2.69D + (((tickAnim - 25D) / 3D) * (-7.84D-(2.69D)));
            yy = 0.66D + (((tickAnim - 25D) / 3D) * (0.35D-(0.66D)));
            zz = -1.32D + (((tickAnim - 25D) / 3D) * (-0.73D-(-1.32D)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -7.84D + (((tickAnim - 28D) / 8D) * (-7.7D-(-7.84D)));
            yy = 0.35D + (((tickAnim - 28D) / 8D) * (-3.71D-(0.35D)));
            zz = -0.73D + (((tickAnim - 28D) / 8D) * (6.89D-(-0.73D)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = -7.7D + (((tickAnim - 36D) / 8D) * (9.82D-(-7.7D)));
            yy = -3.71D + (((tickAnim - 36D) / 8D) * (-3.26D-(-3.71D)));
            zz = 6.89D + (((tickAnim - 36D) / 8D) * (6.07D-(6.89D)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 9.82D + (((tickAnim - 44D) / 6D) * (0.36D-(9.82D)));
            yy = -3.26D + (((tickAnim - 44D) / 6D) * (6.35D-(-3.26D)));
            zz = 6.07D + (((tickAnim - 44D) / 6D) * (-5.07D-(6.07D)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0.36D + (((tickAnim - 50D) / 7D) * (5.29D-(0.36D)));
            yy = 6.35D + (((tickAnim - 50D) / 7D) * (5.18D-(6.35D)));
            zz = -5.07D + (((tickAnim - 50D) / 7D) * (-4.39D-(-5.07D)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 5.29D + (((tickAnim - 57D) / 3D) * (9.18D-(5.29D)));
            yy = 5.18D + (((tickAnim - 57D) / 3D) * (3.9D-(5.18D)));
            zz = -4.39D + (((tickAnim - 57D) / 3D) * (-6.25D-(-4.39D)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 9.18D + (((tickAnim - 60D) / 4D) * (2.5D-(9.18D)));
            yy = 3.9D + (((tickAnim - 60D) / 4D) * (2.12D-(3.9D)));
            zz = -6.25D + (((tickAnim - 60D) / 4D) * (-7.82D-(-6.25D)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 2.5D + (((tickAnim - 64D) / 6D) * (0.21D-(2.5D)));
            yy = 2.12D + (((tickAnim - 64D) / 6D) * (1.62D-(2.12D)));
            zz = -7.82D + (((tickAnim - 64D) / 6D) * (-6.54D-(-7.82D)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = 0.21D + (((tickAnim - 70D) / 4D) * (10.09D-(0.21D)));
            yy = 1.62D + (((tickAnim - 70D) / 4D) * (1.29D-(1.62D)));
            zz = -6.54D + (((tickAnim - 70D) / 4D) * (-5.5D-(-6.54D)));
        }
        else if (tickAnim >= 74 && tickAnim < 78) {
            xx = 10.09D + (((tickAnim - 74D) / 4D) * (5.05D-(10.09D)));
            yy = 1.29D + (((tickAnim - 74D) / 4D) * (1.02D-(1.29D)));
            zz = -5.5D + (((tickAnim - 74D) / 4D) * (-4.19D-(-5.5D)));
        }
        else if (tickAnim >= 78 && tickAnim < 84) {
            xx = 5.05D + (((tickAnim - 78D) / 6D) * (-6.77D-(5.05D)));
            yy = 1.02D + (((tickAnim - 78D) / 6D) * (0.43D-(1.02D)));
            zz = -4.19D + (((tickAnim - 78D) / 6D) * (1.22D-(-4.19D)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = -6.77D + (((tickAnim - 84D) / 6D) * (0D-(-6.77D)));
            yy = 0.43D + (((tickAnim - 84D) / 6D) * (0D-(0.43D)));
            zz = 1.22D + (((tickAnim - 84D) / 6D) * (0D-(1.22D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (17D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 17D + (((tickAnim - 9D) / 11D) * (7.8D-(17D)));
            yy = 0D + (((tickAnim - 9D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 7.8D + (((tickAnim - 20D) / 5D) * (-24.26D-(7.8D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0.15D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -24.26D + (((tickAnim - 25D) / 3D) * (-10.52D-(-24.26D)));
            yy = 0.15D + (((tickAnim - 25D) / 3D) * (0D-(0.15D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -10.52D + (((tickAnim - 28D) / 5D) * (7.46D-(-10.52D)));
            yy = 0D + (((tickAnim - 28D) / 5D) * (-2D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 7.46D + (((tickAnim - 33D) / 7D) * (9.48D-(7.46D)));
            yy = -2D + (((tickAnim - 33D) / 7D) * (-12.82D-(-2D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (-16D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 9.48D + (((tickAnim - 40D) / 4D) * (-10.97D-(9.48D)));
            yy = -12.82D + (((tickAnim - 40D) / 4D) * (-12.6D-(-12.82D)));
            zz = -16D + (((tickAnim - 40D) / 4D) * (-5.11D-(-16D)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -10.97D + (((tickAnim - 44D) / 4D) * (-1.3D-(-10.97D)));
            yy = -12.6D + (((tickAnim - 44D) / 4D) * (-10.98D-(-12.6D)));
            zz = -5.11D + (((tickAnim - 44D) / 4D) * (-3.87D-(-5.11D)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -1.3D + (((tickAnim - 48D) / 7D) * (-9.71D-(-1.3D)));
            yy = -10.98D + (((tickAnim - 48D) / 7D) * (-7.59D-(-10.98D)));
            zz = -3.87D + (((tickAnim - 48D) / 7D) * (-1.82D-(-3.87D)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = -9.71D + (((tickAnim - 55D) / 4D) * (-25.15D-(-9.71D)));
            yy = -7.59D + (((tickAnim - 55D) / 4D) * (-5.24D-(-7.59D)));
            zz = -1.82D + (((tickAnim - 55D) / 4D) * (-5.14D-(-1.82D)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -25.15D + (((tickAnim - 59D) / 10D) * (22.14D-(-25.15D)));
            yy = -5.24D + (((tickAnim - 59D) / 10D) * (-2.94D-(-5.24D)));
            zz = -5.14D + (((tickAnim - 59D) / 10D) * (-5.75D-(-5.14D)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = 22.14D + (((tickAnim - 69D) / 6D) * (17.81D-(22.14D)));
            yy = -2.94D + (((tickAnim - 69D) / 6D) * (-2.16D-(-2.94D)));
            zz = -5.75D + (((tickAnim - 69D) / 6D) * (-9.31D-(-5.75D)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
            xx = 17.81D + (((tickAnim - 75D) / 4D) * (13.34D-(17.81D)));
            yy = -2.16D + (((tickAnim - 75D) / 4D) * (-1.6D-(-2.16D)));
            zz = -9.31D + (((tickAnim - 75D) / 4D) * (3.6D-(-9.31D)));
        }
        else if (tickAnim >= 79 && tickAnim < 84) {
            xx = 13.34D + (((tickAnim - 79D) / 5D) * (-3.99D-(13.34D)));
            yy = -1.6D + (((tickAnim - 79D) / 5D) * (-0.84D-(-1.6D)));
            zz = 3.6D + (((tickAnim - 79D) / 5D) * (-4.16D-(3.6D)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = -3.99D + (((tickAnim - 84D) / 6D) * (0D-(-3.99D)));
            yy = -0.84D + (((tickAnim - 84D) / 6D) * (0D-(-0.84D)));
            zz = -4.16D + (((tickAnim - 84D) / 6D) * (0D-(-4.16D)));
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 0D) / 12D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 5D + (((tickAnim - 12D) / 11D) * (-14.38D-(5D)));
            yy = 0D + (((tickAnim - 12D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 11D) * (-8D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -14.38D + (((tickAnim - 23D) / 7D) * (-0.9D-(-14.38D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            zz = -8D + (((tickAnim - 23D) / 7D) * (0.42D-(-8D)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -0.9D + (((tickAnim - 30D) / 7D) * (-0.05D-(-0.9D)));
            yy = 0D + (((tickAnim - 30D) / 7D) * (-5D-(0D)));
            zz = 0.42D + (((tickAnim - 30D) / 7D) * (0.84D-(0.42D)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -0.05D + (((tickAnim - 37D) / 7D) * (-19.48D-(-0.05D)));
            yy = -5D + (((tickAnim - 37D) / 7D) * (-4.47D-(-5D)));
            zz = 0.84D + (((tickAnim - 37D) / 7D) * (0.72D-(0.84D)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -19.48D + (((tickAnim - 44D) / 6D) * (7.24D-(-19.48D)));
            yy = -4.47D + (((tickAnim - 44D) / 6D) * (-9.64D-(-4.47D)));
            zz = 0.72D + (((tickAnim - 44D) / 6D) * (0.58D-(0.72D)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 7.24D + (((tickAnim - 50D) / 7D) * (4.78D-(7.24D)));
            yy = -9.64D + (((tickAnim - 50D) / 7D) * (-7.17D-(-9.64D)));
            zz = 0.58D + (((tickAnim - 50D) / 7D) * (0.4D-(0.58D)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 4.78D + (((tickAnim - 57D) / 2D) * (-16.77D-(4.78D)));
            yy = -7.17D + (((tickAnim - 57D) / 2D) * (-3.21D-(-7.17D)));
            zz = 0.4D + (((tickAnim - 57D) / 2D) * (7.93D-(0.4D)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = -16.77D + (((tickAnim - 59D) / 9D) * (-9.35D-(-16.77D)));
            yy = -3.21D + (((tickAnim - 59D) / 9D) * (0.93D-(-3.21D)));
            zz = 7.93D + (((tickAnim - 59D) / 9D) * (13.41D-(7.93D)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = -9.35D + (((tickAnim - 68D) / 8D) * (-2.87D-(-9.35D)));
            yy = 0.93D + (((tickAnim - 68D) / 8D) * (4.67D-(0.93D)));
            zz = 13.41D + (((tickAnim - 68D) / 8D) * (9.1D-(13.41D)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = -2.87D + (((tickAnim - 76D) / 7D) * (-6.95D-(-2.87D)));
            yy = 4.67D + (((tickAnim - 76D) / 7D) * (2.38D-(4.67D)));
            zz = 9.1D + (((tickAnim - 76D) / 7D) * (3.96D-(9.1D)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -6.95D + (((tickAnim - 83D) / 7D) * (0D-(-6.95D)));
            yy = 2.38D + (((tickAnim - 83D) / 7D) * (0D-(2.38D)));
            zz = 3.96D + (((tickAnim - 83D) / 7D) * (0D-(3.96D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 7D) / 5D) * (15D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 15D + (((tickAnim - 12D) / 4D) * (0D-(15D)));
            yy = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 21D) / 5D) * (22.5D-(0D)));
            yy = 0D + (((tickAnim - 21D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 22.5D + (((tickAnim - 26D) / 4D) * (0D-(22.5D)));
            yy = 0D + (((tickAnim - 26D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 26D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0D + (((tickAnim - 40D) / 4D) * (17.5D-(0D)));
            yy = 0D + (((tickAnim - 40D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 17.5D + (((tickAnim - 44D) / 4D) * (0D-(17.5D)));
            yy = 0D + (((tickAnim - 44D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 44D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0D + (((tickAnim - 48D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 48D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 48D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = 0D + (((tickAnim - 55D) / 4D) * (17.5D-(0D)));
            yy = 0D + (((tickAnim - 55D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 55D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 17.5D + (((tickAnim - 59D) / 4D) * (0D-(17.5D)));
            yy = 0D + (((tickAnim - 59D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 59D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 63 && tickAnim < 79) {
            xx = 0D + (((tickAnim - 63D) / 16D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 63D) / 16D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 63D) / 16D) * (0D-(0D)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 0D + (((tickAnim - 79D) / 4D) * (17.5D-(0D)));
            yy = 0D + (((tickAnim - 79D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 79D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = 17.5D + (((tickAnim - 83D) / 4D) * (0D-(17.5D)));
            yy = 0D + (((tickAnim - 83D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 83D) / 4D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

        int animCycle = 90;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 5D + (((tickAnim - 6D) / 6D) * (12.5D-(5D)));
            yy = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 12.5D + (((tickAnim - 12D) / 5D) * (12.48848D-(12.5D)));
            yy = 0D + (((tickAnim - 12D) / 5D) * (-0.54094D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 5D) * (2.44081D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 12.48848D + (((tickAnim - 17D) / 5D) * (14.61853D-(12.48848D)));
            yy = -0.54094D + (((tickAnim - 17D) / 5D) * (1.06505D-(-0.54094D)));
            zz = 2.44081D + (((tickAnim - 17D) / 5D) * (7.54648D-(2.44081D)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 14.61853D + (((tickAnim - 22D) / 9D) * (20.39914D-(14.61853D)));
            yy = 1.06505D + (((tickAnim - 22D) / 9D) * (1.74611D-(1.06505D)));
            zz = 7.54648D + (((tickAnim - 22D) / 9D) * (10.57134D-(7.54648D)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 20.39914D + (((tickAnim - 31D) / 5D) * (20.45272D-(20.39914D)));
            yy = 1.74611D + (((tickAnim - 31D) / 5D) * (0.8735D-(1.74611D)));
            zz = 10.57134D + (((tickAnim - 31D) / 5D) * (12.91474D-(10.57134D)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 20.45272D + (((tickAnim - 36D) / 3D) * (20.49759D-(20.45272D)));
            yy = 0.8735D + (((tickAnim - 36D) / 3D) * (-3.81099D-(0.8735D)));
            zz = 12.91474D + (((tickAnim - 36D) / 3D) * (11.16565D-(12.91474D)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 20.49759D + (((tickAnim - 39D) / 7D) * (15.49759D-(20.49759D)));
            yy = -3.81099D + (((tickAnim - 39D) / 7D) * (-3.81099D-(-3.81099D)));
            zz = 11.16565D + (((tickAnim - 39D) / 7D) * (11.16565D-(11.16565D)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 15.49759D + (((tickAnim - 46D) / 3D) * (15.21184D-(15.49759D)));
            yy = -3.81099D + (((tickAnim - 46D) / 3D) * (2.99436D-(-3.81099D)));
            zz = 11.16565D + (((tickAnim - 46D) / 3D) * (5.26336D-(11.16565D)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = 15.21184D + (((tickAnim - 49D) / 6D) * (12.84724D-(15.21184D)));
            yy = 2.99436D + (((tickAnim - 49D) / 6D) * (11.49073D-(2.99436D)));
            zz = 5.26336D + (((tickAnim - 49D) / 6D) * (-8.17019D-(5.26336D)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 12.84724D + (((tickAnim - 55D) / 8D) * (20.34724D-(12.84724D)));
            yy = 11.49073D + (((tickAnim - 55D) / 8D) * (11.49073D-(11.49073D)));
            zz = -8.17019D + (((tickAnim - 55D) / 8D) * (-8.17019D-(-8.17019D)));
        }
        else if (tickAnim >= 63 && tickAnim < 83) {
            xx = 20.34724D + (((tickAnim - 63D) / 20D) * (-6.64616D-(20.34724D)));
            yy = 11.49073D + (((tickAnim - 63D) / 20D) * (4.64255D-(11.49073D)));
            zz = -8.17019D + (((tickAnim - 63D) / 20D) * (-2.25803D-(-8.17019D)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -6.64616D + (((tickAnim - 83D) / 7D) * (0D-(-6.64616D)));
            yy = 4.64255D + (((tickAnim - 83D) / 7D) * (0D-(4.64255D)));
            zz = -2.25803D + (((tickAnim - 83D) / 7D) * (0D-(-2.25803D)));
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 5D + (((tickAnim - 5D) / 4D) * (7.5D-(5D)));
            yy = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 7.5D + (((tickAnim - 9D) / 6D) * (10D-(7.5D)));
            yy = 0D + (((tickAnim - 9D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 10D + (((tickAnim - 15D) / 7D) * (9.9359D-(10D)));
            yy = 0D + (((tickAnim - 15D) / 7D) * (-1.54331D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 7D) * (4.75643D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 9.9359D + (((tickAnim - 22D) / 5D) * (7.4359D-(9.9359D)));
            yy = -1.54331D + (((tickAnim - 22D) / 5D) * (-1.54331D-(-1.54331D)));
            zz = 4.75643D + (((tickAnim - 22D) / 5D) * (4.75643D-(4.75643D)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 7.4359D + (((tickAnim - 27D) / 4D) * (7.25011D-(7.4359D)));
            yy = -1.54331D + (((tickAnim - 27D) / 4D) * (-2.86708D-(-1.54331D)));
            zz = 4.75643D + (((tickAnim - 27D) / 4D) * (9.5817D-(4.75643D)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 7.25011D + (((tickAnim - 31D) / 5D) * (12.25011D-(7.25011D)));
            yy = -2.86708D + (((tickAnim - 31D) / 5D) * (-2.86708D-(-2.86708D)));
            zz = 9.5817D + (((tickAnim - 31D) / 5D) * (9.5817D-(9.5817D)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 12.25011D + (((tickAnim - 36D) / 3D) * (12.40865D-(12.25011D)));
            yy = -2.86708D + (((tickAnim - 36D) / 3D) * (-7.556D-(-2.86708D)));
            zz = 9.5817D + (((tickAnim - 36D) / 3D) * (7.83789D-(9.5817D)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 12.40865D + (((tickAnim - 39D) / 3D) * (-2.59135D-(12.40865D)));
            yy = -7.556D + (((tickAnim - 39D) / 3D) * (-7.556D-(-7.556D)));
            zz = 7.83789D + (((tickAnim - 39D) / 3D) * (7.83789D-(7.83789D)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -2.59135D + (((tickAnim - 42D) / 4D) * (3.98798D-(-2.59135D)));
            yy = -7.556D + (((tickAnim - 42D) / 4D) * (-4.62652D-(-7.556D)));
            zz = 7.83789D + (((tickAnim - 42D) / 4D) * (-6.95893D-(7.83789D)));
        }
        else if (tickAnim >= 46 && tickAnim < 52) {
            xx = 3.98798D + (((tickAnim - 46D) / 6D) * (10.10332D-(3.98798D)));
            yy = -4.62652D + (((tickAnim - 46D) / 6D) * (-8.66861D-(-4.62652D)));
            zz = -6.95893D + (((tickAnim - 46D) / 6D) * (4.95241D-(-6.95893D)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 10.10332D + (((tickAnim - 52D) / 3D) * (13.86631D-(10.10332D)));
            yy = -8.66861D + (((tickAnim - 52D) / 3D) * (-10.92507D-(-8.66861D)));
            zz = 4.95241D + (((tickAnim - 52D) / 3D) * (12.21142D-(4.95241D)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 13.86631D + (((tickAnim - 55D) / 5D) * (-3.63369D-(13.86631D)));
            yy = -10.92507D + (((tickAnim - 55D) / 5D) * (-10.92507D-(-10.92507D)));
            zz = 12.21142D + (((tickAnim - 55D) / 5D) * (12.21142D-(12.21142D)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = -3.63369D + (((tickAnim - 60D) / 6D) * (-18.63369D-(-3.63369D)));
            yy = -10.92507D + (((tickAnim - 60D) / 6D) * (-10.92507D-(-10.92507D)));
            zz = 12.21142D + (((tickAnim - 60D) / 6D) * (12.21142D-(12.21142D)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = -18.63369D + (((tickAnim - 66D) / 6D) * (-8.63369D-(-18.63369D)));
            yy = -10.92507D + (((tickAnim - 66D) / 6D) * (-10.92507D-(-10.92507D)));
            zz = 12.21142D + (((tickAnim - 66D) / 6D) * (12.21142D-(12.21142D)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = -8.63369D + (((tickAnim - 72D) / 8D) * (-14.10123D-(-8.63369D)));
            yy = -10.92507D + (((tickAnim - 72D) / 8D) * (-12.16741D-(-10.92507D)));
            zz = 12.21142D + (((tickAnim - 72D) / 8D) * (2.08319D-(12.21142D)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -14.10123D + (((tickAnim - 80D) / 10D) * (0D-(-14.10123D)));
            yy = -12.16741D + (((tickAnim - 80D) / 10D) * (0D-(-12.16741D)));
            zz = 2.08319D + (((tickAnim - 80D) / 10D) * (0D-(2.08319D)));
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.5D + (((tickAnim - 3D) / 5D) * (22.5D-(2.5D)));
            yy = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 22.5D + (((tickAnim - 8D) / 5D) * (27.5D-(22.5D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 27.5D + (((tickAnim - 13D) / 10D) * (26.40319D-(27.5D)));
            yy = 0D + (((tickAnim - 13D) / 10D) * (7.98133D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 10D) * (-15.62489D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 26.40319D + (((tickAnim - 23D) / 5D) * (39.19458D-(26.40319D)));
            yy = 7.98133D + (((tickAnim - 23D) / 5D) * (6.86379D-(7.98133D)));
            zz = -15.62489D + (((tickAnim - 23D) / 5D) * (-13.36965D-(-15.62489D)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 39.19458D + (((tickAnim - 28D) / 6D) * (49.19458D-(39.19458D)));
            yy = 6.86379D + (((tickAnim - 28D) / 6D) * (6.86379D-(6.86379D)));
            zz = -13.36965D + (((tickAnim - 28D) / 6D) * (-13.36965D-(-13.36965D)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 49.19458D + (((tickAnim - 34D) / 4D) * (41.93824D-(49.19458D)));
            yy = 6.86379D + (((tickAnim - 34D) / 4D) * (0.41138D-(6.86379D)));
            zz = -13.36965D + (((tickAnim - 34D) / 4D) * (-9.53672D-(-13.36965D)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 41.93824D + (((tickAnim - 38D) / 7D) * (39.40521D-(41.93824D)));
            yy = 0.41138D + (((tickAnim - 38D) / 7D) * (2.56381D-(0.41138D)));
            zz = -9.53672D + (((tickAnim - 38D) / 7D) * (-10.80886D-(-9.53672D)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 39.40521D + (((tickAnim - 45D) / 8D) * (38.75508D-(39.40521D)));
            yy = 2.56381D + (((tickAnim - 45D) / 8D) * (11.16622D-(2.56381D)));
            zz = -10.80886D + (((tickAnim - 45D) / 8D) * (-13.49638D-(-10.80886D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 38.75508D + (((tickAnim - 53D) / 7D) * (21.25508D-(38.75508D)));
            yy = 11.16622D + (((tickAnim - 53D) / 7D) * (11.16622D-(11.16622D)));
            zz = -13.49638D + (((tickAnim - 53D) / 7D) * (-13.49638D-(-13.49638D)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 21.25508D + (((tickAnim - 60D) / 7D) * (8.75508D-(21.25508D)));
            yy = 11.16622D + (((tickAnim - 60D) / 7D) * (11.16622D-(11.16622D)));
            zz = -13.49638D + (((tickAnim - 60D) / 7D) * (-13.49638D-(-13.49638D)));
        }
        else if (tickAnim >= 67 && tickAnim < 76) {
            xx = 8.75508D + (((tickAnim - 67D) / 9D) * (1.53729D-(8.75508D)));
            yy = 11.16622D + (((tickAnim - 67D) / 9D) * (9.81269D-(11.16622D)));
            zz = -13.49638D + (((tickAnim - 67D) / 9D) * (1.6982D-(-13.49638D)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = 1.53729D + (((tickAnim - 76D) / 8D) * (11.76423D-(1.53729D)));
            yy = 9.81269D + (((tickAnim - 76D) / 8D) * (3.7633D-(9.81269D)));
            zz = 1.6982D + (((tickAnim - 76D) / 8D) * (1.42068D-(1.6982D)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = 11.76423D + (((tickAnim - 84D) / 6D) * (2.5D-(11.76423D)));
            yy = 3.7633D + (((tickAnim - 84D) / 6D) * (0D-(3.7633D)));
            zz = 1.42068D + (((tickAnim - 84D) / 6D) * (0D-(1.42068D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 4D) / 5D) * (-12.5D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -12.5D + (((tickAnim - 9D) / 4D) * (-22.95783D-(-12.5D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (-0.06261D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (-0.17208D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -22.95783D + (((tickAnim - 13D) / 3D) * (-20D-(-22.95783D)));
            yy = -0.06261D + (((tickAnim - 13D) / 3D) * (0D-(-0.06261D)));
            zz = -0.17208D + (((tickAnim - 13D) / 3D) * (0D-(-0.17208D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -20D + (((tickAnim - 16D) / 4D) * (-19.98247D-(-20D)));
            yy = 0D + (((tickAnim - 16D) / 4D) * (0.85481D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 4D) * (2.34941D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -19.98247D + (((tickAnim - 20D) / 5D) * (-24.98247D-(-19.98247D)));
            yy = 0.85481D + (((tickAnim - 20D) / 5D) * (0.85481D-(0.85481D)));
            zz = 2.34941D + (((tickAnim - 20D) / 5D) * (2.34941D-(2.34941D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -24.98247D + (((tickAnim - 25D) / 5D) * (-9.98247D-(-24.98247D)));
            yy = 0.85481D + (((tickAnim - 25D) / 5D) * (0.85481D-(0.85481D)));
            zz = 2.34941D + (((tickAnim - 25D) / 5D) * (2.34941D-(2.34941D)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -9.98247D + (((tickAnim - 30D) / 5D) * (-17.48247D-(-9.98247D)));
            yy = 0.85481D + (((tickAnim - 30D) / 5D) * (0.85481D-(0.85481D)));
            zz = 2.34941D + (((tickAnim - 30D) / 5D) * (2.34941D-(2.34941D)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -17.48247D + (((tickAnim - 35D) / 3D) * (-0.09004D-(-17.48247D)));
            yy = 0.85481D + (((tickAnim - 35D) / 3D) * (-6.29757D-(0.85481D)));
            zz = 2.34941D + (((tickAnim - 35D) / 3D) * (4.61031D-(2.34941D)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -0.09004D + (((tickAnim - 38D) / 8D) * (-16.93587D-(-0.09004D)));
            yy = -6.29757D + (((tickAnim - 38D) / 8D) * (-13.29574D-(-6.29757D)));
            zz = 4.61031D + (((tickAnim - 38D) / 8D) * (-1.1461D-(4.61031D)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = -16.93587D + (((tickAnim - 46D) / 8D) * (12.40864D-(-16.93587D)));
            yy = -13.29574D + (((tickAnim - 46D) / 8D) * (-15.36774D-(-13.29574D)));
            zz = -1.1461D + (((tickAnim - 46D) / 8D) * (-8.58655D-(-1.1461D)));
        }
        else if (tickAnim >= 54 && tickAnim < 59) {
            xx = 12.40864D + (((tickAnim - 54D) / 5D) * (9.51633D-(12.40864D)));
            yy = -15.36774D + (((tickAnim - 54D) / 5D) * (-5.59288D-(-15.36774D)));
            zz = -8.58655D + (((tickAnim - 54D) / 5D) * (-6.43788D-(-8.58655D)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 9.51633D + (((tickAnim - 59D) / 4D) * (4.51633D-(9.51633D)));
            yy = -5.59288D + (((tickAnim - 59D) / 4D) * (-5.59288D-(-5.59288D)));
            zz = -6.43788D + (((tickAnim - 59D) / 4D) * (-6.43788D-(-6.43788D)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 4.51633D + (((tickAnim - 63D) / 5D) * (9.51633D-(4.51633D)));
            yy = -5.59288D + (((tickAnim - 63D) / 5D) * (-5.59288D-(-5.59288D)));
            zz = -6.43788D + (((tickAnim - 63D) / 5D) * (-6.43788D-(-6.43788D)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 9.51633D + (((tickAnim - 68D) / 5D) * (29.51633D-(9.51633D)));
            yy = -5.59288D + (((tickAnim - 68D) / 5D) * (-5.59288D-(-5.59288D)));
            zz = -6.43788D + (((tickAnim - 68D) / 5D) * (-6.43788D-(-6.43788D)));
        }
        else if (tickAnim >= 73 && tickAnim < 90) {
            xx = 29.51633D + (((tickAnim - 73D) / 17D) * (0D-(29.51633D)));
            yy = -5.59288D + (((tickAnim - 73D) / 17D) * (0D-(-5.59288D)));
            zz = -6.43788D + (((tickAnim - 73D) / 17D) * (0D-(-6.43788D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 6D) / 5D) * (-12.5D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.5D + (((tickAnim - 11D) / 2D) * (-17.5D-(-12.5D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -17.5D + (((tickAnim - 13D) / 5D) * (0D-(-17.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (7.5D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0D + (((tickAnim - 20D) / 4D) * (-12.5D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 4D) * (0D-(0D)));
            zz = 7.5D + (((tickAnim - 20D) / 4D) * (7.5D-(7.5D)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -12.5D + (((tickAnim - 24D) / 6D) * (0D-(-12.5D)));
            yy = 0D + (((tickAnim - 24D) / 6D) * (0D-(0D)));
            zz = 7.5D + (((tickAnim - 24D) / 6D) * (7.5D-(7.5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 30D) / 5D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 5D) * (0D-(0D)));
            zz = 7.5D + (((tickAnim - 30D) / 5D) * (7.5D-(7.5D)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 5D + (((tickAnim - 35D) / 3D) * (-18.36433D-(5D)));
            yy = 0D + (((tickAnim - 35D) / 3D) * (-13.76609D-(0D)));
            zz = 7.5D + (((tickAnim - 35D) / 3D) * (4.87968D-(7.5D)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -18.36433D + (((tickAnim - 38D) / 5D) * (-7.4267D-(-18.36433D)));
            yy = -13.76609D + (((tickAnim - 38D) / 5D) * (-21.37962D-(-13.76609D)));
            zz = 4.87968D + (((tickAnim - 38D) / 5D) * (-8.11959D-(4.87968D)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -7.4267D + (((tickAnim - 43D) / 2D) * (-5.86433D-(-7.4267D)));
            yy = -21.37962D + (((tickAnim - 43D) / 2D) * (-13.76609D-(-21.37962D)));
            zz = -8.11959D + (((tickAnim - 43D) / 2D) * (4.87968D-(-8.11959D)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -5.86433D + (((tickAnim - 45D) / 6D) * (-7.53711D-(-5.86433D)));
            yy = -13.76609D + (((tickAnim - 45D) / 6D) * (35.75762D-(-13.76609D)));
            zz = 4.87968D + (((tickAnim - 45D) / 6D) * (6.27317D-(4.87968D)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = -7.53711D + (((tickAnim - 51D) / 3D) * (2.14259D-(-7.53711D)));
            yy = 35.75762D + (((tickAnim - 51D) / 3D) * (38.6757D-(35.75762D)));
            zz = 6.27317D + (((tickAnim - 51D) / 3D) * (5.25246D-(6.27317D)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 2.14259D + (((tickAnim - 54D) / 4D) * (-11.4571D-(2.14259D)));
            yy = 38.6757D + (((tickAnim - 54D) / 4D) * (15.33121D-(38.6757D)));
            zz = 5.25246D + (((tickAnim - 54D) / 4D) * (-18.96587D-(5.25246D)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -11.4571D + (((tickAnim - 58D) / 5D) * (-21.4571D-(-11.4571D)));
            yy = 15.33121D + (((tickAnim - 58D) / 5D) * (15.33121D-(15.33121D)));
            zz = -18.96587D + (((tickAnim - 58D) / 5D) * (-18.96587D-(-18.96587D)));
        }
        else if (tickAnim >= 63 && tickAnim < 69) {
            xx = -21.4571D + (((tickAnim - 63D) / 6D) * (11.0429D-(-21.4571D)));
            yy = 15.33121D + (((tickAnim - 63D) / 6D) * (15.33121D-(15.33121D)));
            zz = -18.96587D + (((tickAnim - 63D) / 6D) * (-18.96587D-(-18.96587D)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = 11.0429D + (((tickAnim - 69D) / 5D) * (-8.72717D-(11.0429D)));
            yy = 15.33121D + (((tickAnim - 69D) / 5D) * (0.6202D-(15.33121D)));
            zz = -18.96587D + (((tickAnim - 69D) / 5D) * (-14.0653D-(-18.96587D)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -8.72717D + (((tickAnim - 74D) / 6D) * (-8.00122D-(-8.72717D)));
            yy = 0.6202D + (((tickAnim - 74D) / 6D) * (-7.49877D-(0.6202D)));
            zz = -14.0653D + (((tickAnim - 74D) / 6D) * (5.77846D-(-14.0653D)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -8.00122D + (((tickAnim - 80D) / 10D) * (0D-(-8.00122D)));
            yy = -7.49877D + (((tickAnim - 80D) / 10D) * (0D-(-7.49877D)));
            zz = 5.77846D + (((tickAnim - 80D) / 10D) * (0D-(5.77846D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 9D) / 5D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 10D + (((tickAnim - 14D) / 7D) * (9.6658D-(10D)));
            yy = 0D + (((tickAnim - 14D) / 7D) * (-2.57594D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 7D) * (14.78217D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 9.6658D + (((tickAnim - 21D) / 3D) * (9.6658D-(9.6658D)));
            yy = -2.57594D + (((tickAnim - 21D) / 3D) * (-2.57594D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 21D) / 3D) * (14.78217D-(14.78217D)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 9.6658D + (((tickAnim - 24D) / 4D) * (15.51276D-(9.6658D)));
            yy = -2.57594D + (((tickAnim - 24D) / 4D) * (2.24209D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 24D) / 4D) * (16.11921D-(14.78217D)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 15.51276D + (((tickAnim - 28D) / 5D) * (-5.3342D-(15.51276D)));
            yy = 2.24209D + (((tickAnim - 28D) / 5D) * (-2.57594D-(2.24209D)));
            zz = 16.11921D + (((tickAnim - 28D) / 5D) * (14.78217D-(16.11921D)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -5.3342D + (((tickAnim - 33D) / 5D) * (-30.3342D-(-5.3342D)));
            yy = -2.57594D + (((tickAnim - 33D) / 5D) * (-2.57594D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 33D) / 5D) * (14.78217D-(14.78217D)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -30.3342D + (((tickAnim - 38D) / 8D) * (-10.3342D-(-30.3342D)));
            yy = -2.57594D + (((tickAnim - 38D) / 8D) * (-2.57594D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 38D) / 8D) * (14.78217D-(14.78217D)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = -10.3342D + (((tickAnim - 46D) / 5D) * (-2.8342D-(-10.3342D)));
            yy = -2.57594D + (((tickAnim - 46D) / 5D) * (-2.57594D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 46D) / 5D) * (14.78217D-(14.78217D)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -2.8342D + (((tickAnim - 51D) / 4D) * (-17.8342D-(-2.8342D)));
            yy = -2.57594D + (((tickAnim - 51D) / 4D) * (-2.57594D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 51D) / 4D) * (14.78217D-(14.78217D)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = -17.8342D + (((tickAnim - 55D) / 7D) * (-37.8342D-(-17.8342D)));
            yy = -2.57594D + (((tickAnim - 55D) / 7D) * (-2.57594D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 55D) / 7D) * (14.78217D-(14.78217D)));
        }
        else if (tickAnim >= 62 && tickAnim < 66) {
            xx = -37.8342D + (((tickAnim - 62D) / 4D) * (-42.8342D-(-37.8342D)));
            yy = -2.57594D + (((tickAnim - 62D) / 4D) * (-2.57594D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 62D) / 4D) * (14.78217D-(14.78217D)));
        }
        else if (tickAnim >= 66 && tickAnim < 69) {
            xx = -42.8342D + (((tickAnim - 66D) / 3D) * (-25.3342D-(-42.8342D)));
            yy = -2.57594D + (((tickAnim - 66D) / 3D) * (-2.57594D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 66D) / 3D) * (14.78217D-(14.78217D)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = -25.3342D + (((tickAnim - 69D) / 6D) * (-35.3342D-(-25.3342D)));
            yy = -2.57594D + (((tickAnim - 69D) / 6D) * (-2.57594D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 69D) / 6D) * (14.78217D-(14.78217D)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -35.3342D + (((tickAnim - 75D) / 3D) * (-40.26095D-(-35.3342D)));
            yy = -2.57594D + (((tickAnim - 75D) / 3D) * (-1.71854D-(-2.57594D)));
            zz = 14.78217D + (((tickAnim - 75D) / 3D) * (15.13011D-(14.78217D)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = -40.26095D + (((tickAnim - 78D) / 5D) * (-15.26095D-(-40.26095D)));
            yy = -1.71854D + (((tickAnim - 78D) / 5D) * (-1.71854D-(-1.71854D)));
            zz = 15.13011D + (((tickAnim - 78D) / 5D) * (15.13011D-(15.13011D)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -15.26095D + (((tickAnim - 83D) / 7D) * (0D-(-15.26095D)));
            yy = -1.71854D + (((tickAnim - 83D) / 7D) * (0D-(-1.71854D)));
            zz = 15.13011D + (((tickAnim - 83D) / 7D) * (0D-(15.13011D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (12.5D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 12.5D + (((tickAnim - 18D) / 3D) * (12.42833D-(12.5D)));
            yy = 0D + (((tickAnim - 18D) / 3D) * (-1.10548D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 3D) * (7.41854D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 12.42833D + (((tickAnim - 21D) / 9D) * (17.42833D-(12.42833D)));
            yy = -1.10548D + (((tickAnim - 21D) / 9D) * (-1.10548D-(-1.10548D)));
            zz = 7.41854D + (((tickAnim - 21D) / 9D) * (7.41854D-(7.41854D)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 17.42833D + (((tickAnim - 30D) / 8D) * (9.92833D-(17.42833D)));
            yy = -1.10548D + (((tickAnim - 30D) / 8D) * (-1.10548D-(-1.10548D)));
            zz = 7.41854D + (((tickAnim - 30D) / 8D) * (7.41854D-(7.41854D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 9.92833D + (((tickAnim - 38D) / 12D) * (14.92833D-(9.92833D)));
            yy = -1.10548D + (((tickAnim - 38D) / 12D) * (-1.10548D-(-1.10548D)));
            zz = 7.41854D + (((tickAnim - 38D) / 12D) * (7.41854D-(7.41854D)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 14.92833D + (((tickAnim - 50D) / 4D) * (-2.57167D-(14.92833D)));
            yy = -1.10548D + (((tickAnim - 50D) / 4D) * (-1.10548D-(-1.10548D)));
            zz = 7.41854D + (((tickAnim - 50D) / 4D) * (7.41854D-(7.41854D)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -2.57167D + (((tickAnim - 54D) / 6D) * (-12.57167D-(-2.57167D)));
            yy = -1.10548D + (((tickAnim - 54D) / 6D) * (-1.10548D-(-1.10548D)));
            zz = 7.41854D + (((tickAnim - 54D) / 6D) * (7.41854D-(7.41854D)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = -12.57167D + (((tickAnim - 60D) / 6D) * (27.15185D-(-12.57167D)));
            yy = -1.10548D + (((tickAnim - 60D) / 6D) * (3.85347D-(-1.10548D)));
            zz = 7.41854D + (((tickAnim - 60D) / 6D) * (-4.06263D-(7.41854D)));
        }
        else if (tickAnim >= 66 && tickAnim < 69) {
            xx = 27.15185D + (((tickAnim - 66D) / 3D) * (9.65185D-(27.15185D)));
            yy = 3.85347D + (((tickAnim - 66D) / 3D) * (3.85347D-(3.85347D)));
            zz = -4.06263D + (((tickAnim - 66D) / 3D) * (-4.06263D-(-4.06263D)));
        }
        else if (tickAnim >= 69 && tickAnim < 90) {
            xx = 9.65185D + (((tickAnim - 69D) / 21D) * (0D-(9.65185D)));
            yy = 3.85347D + (((tickAnim - 69D) / 21D) * (0D-(3.85347D)));
            zz = -4.06263D + (((tickAnim - 69D) / 21D) * (0D-(-4.06263D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Dryosaurus, Dryosaurus.rotateAngleX + (float) Math.toRadians(0), Dryosaurus.rotateAngleY + (float) Math.toRadians(0), Dryosaurus.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -12.5D + (((tickAnim - 0D) / 9D) * (7.5D-(-12.5D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 33) {
            xx = 7.5D + (((tickAnim - 9D) / 24D) * (20D-(7.5D)));
            yy = 0D + (((tickAnim - 9D) / 24D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 24D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 20D + (((tickAnim - 33D) / 11D) * (22.5D-(20D)));
            yy = 0D + (((tickAnim - 33D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 58) {
            xx = 22.5D + (((tickAnim - 44D) / 14D) * (-5D-(22.5D)));
            yy = 0D + (((tickAnim - 44D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 44D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 58 && tickAnim < 75) {
            xx = -5D + (((tickAnim - 58D) / 17D) * (10D-(-5D)));
            yy = 0D + (((tickAnim - 58D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 58D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 10D + (((tickAnim - 75D) / 15D) * (-12.5D-(10D)));
            yy = 0D + (((tickAnim - 75D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 75D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 9D) / 9D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 10D + (((tickAnim - 18D) / 14D) * (2.5D-(10D)));
            yy = 0D + (((tickAnim - 18D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 2.5D + (((tickAnim - 32D) / 14D) * (-15D-(2.5D)));
            yy = 0D + (((tickAnim - 32D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 32D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = -15D + (((tickAnim - 46D) / 14D) * (10D-(-15D)));
            yy = 0D + (((tickAnim - 46D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 46D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10D + (((tickAnim - 60D) / 10D) * (-10D-(10D)));
            yy = 0D + (((tickAnim - 60D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 60D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 70 && tickAnim < 79) {
            xx = -10D + (((tickAnim - 70D) / 9D) * (25D-(-10D)));
            yy = 0D + (((tickAnim - 70D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 70D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 79 && tickAnim < 90) {
            xx = 25D + (((tickAnim - 79D) / 11D) * (0D-(25D)));
            yy = 0D + (((tickAnim - 79D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 79D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -12.5D + (((tickAnim - 0D) / 9D) * (7.5D-(-12.5D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 33) {
            xx = 7.5D + (((tickAnim - 9D) / 24D) * (20D-(7.5D)));
            yy = 0D + (((tickAnim - 9D) / 24D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 24D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 20D + (((tickAnim - 33D) / 11D) * (22.5D-(20D)));
            yy = 0D + (((tickAnim - 33D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 58) {
            xx = 22.5D + (((tickAnim - 44D) / 14D) * (-5D-(22.5D)));
            yy = 0D + (((tickAnim - 44D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 44D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 58 && tickAnim < 75) {
            xx = -5D + (((tickAnim - 58D) / 17D) * (10D-(-5D)));
            yy = 0D + (((tickAnim - 58D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 58D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 10D + (((tickAnim - 75D) / 15D) * (-12.5D-(10D)));
            yy = 0D + (((tickAnim - 75D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 75D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 9D) / 9D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 10D + (((tickAnim - 18D) / 14D) * (2.5D-(10D)));
            yy = 0D + (((tickAnim - 18D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 2.5D + (((tickAnim - 32D) / 14D) * (-15D-(2.5D)));
            yy = 0D + (((tickAnim - 32D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 32D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = -15D + (((tickAnim - 46D) / 14D) * (10D-(-15D)));
            yy = 0D + (((tickAnim - 46D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 46D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10D + (((tickAnim - 60D) / 10D) * (-10D-(10D)));
            yy = 0D + (((tickAnim - 60D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 60D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 70 && tickAnim < 79) {
            xx = -10D + (((tickAnim - 70D) / 9D) * (25D-(-10D)));
            yy = 0D + (((tickAnim - 70D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 70D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 79 && tickAnim < 90) {
            xx = 25D + (((tickAnim - 79D) / 11D) * (0D-(25D)));
            yy = 0D + (((tickAnim - 79D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 79D) / 11D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 4D) / 3D) * (22.5D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 22.5D + (((tickAnim - 7D) / 2D) * (0D-(22.5D)));
            yy = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 9D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0D + (((tickAnim - 19D) / 3D) * (22.5D-(0D)));
            yy = 0D + (((tickAnim - 19D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 19D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 22.5D + (((tickAnim - 22D) / 2D) * (0D-(22.5D)));
            yy = 0D + (((tickAnim - 22D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 22D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 0D + (((tickAnim - 24D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 24D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 24D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 31D) / 6D) * (47.5D-(0D)));
            yy = 0D + (((tickAnim - 31D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 31D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 47.5D + (((tickAnim - 37D) / 5D) * (5D-(47.5D)));
            yy = 0D + (((tickAnim - 37D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 5D + (((tickAnim - 42D) / 5D) * (5D-(5D)));
            yy = 0D + (((tickAnim - 42D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 47 && tickAnim < 55) {
            xx = 5D + (((tickAnim - 47D) / 8D) * (27.5D-(5D)));
            yy = 0D + (((tickAnim - 47D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 47D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = 27.5D + (((tickAnim - 55D) / 4D) * (0D-(27.5D)));
            yy = 0D + (((tickAnim - 55D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 55D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 59 && tickAnim < 77) {
            xx = 0D + (((tickAnim - 59D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 59D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 59D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 77 && tickAnim < 79) {
            xx = 0D + (((tickAnim - 77D) / 2D) * (22.5D-(0D)));
            yy = 0D + (((tickAnim - 77D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 77D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 79 && tickAnim < 82) {
            xx = 22.5D + (((tickAnim - 79D) / 3D) * (0D-(22.5D)));
            yy = 0D + (((tickAnim - 79D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 79D) / 3D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 0D) / 3D) * (3.8D-(1D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 3.8D + (((tickAnim - 3D) / 2D) * (1.9D-(3.8D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            yy = 1.9D + (((tickAnim - 5D) / 3D) * (1D-(1.9D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 8D) / 2D) * (3.8D-(1D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            yy = 3.8D + (((tickAnim - 10D) / 5D) * (1D-(3.8D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        this.Dryosaurus.offsetX = (float) Math.toRadians(xx);
        this.Dryosaurus.offsetY = (float) Math.toRadians(yy) - 0.20F;
        this.Dryosaurus.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.43656D + (((tickAnim - 0D) / 3D) * (2.56D-(-7.43656D)));
            yy = 0.9762D + (((tickAnim - 0D) / 3D) * (0D-(0.9762D)));
            zz = 7.43656D + (((tickAnim - 0D) / 3D) * (0D-(7.43656D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 2.56D + (((tickAnim - 3D) / 4D) * (-7.43656D-(2.56D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (-0.9762D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (-7.43656D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -7.43656D + (((tickAnim - 7D) / 4D) * (5.06D-(-7.43656D)));
            yy = -0.9762D + (((tickAnim - 7D) / 4D) * (0D-(-0.9762D)));
            zz = -7.43656D + (((tickAnim - 7D) / 4D) * (0D-(-7.43656D)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 5.06D + (((tickAnim - 11D) / 4D) * (-7.43656D-(5.06D)));
            yy = 0D + (((tickAnim - 11D) / 4D) * (0.9762D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 4D) * (7.43656D-(0D)));
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.46166D + (((tickAnim - 0D) / 3D) * (-7.47363D-(-12.46166D)));
            yy = -0.58677D + (((tickAnim - 0D) / 3D) * (-0.03633D-(-0.58677D)));
            zz = -7.47714D + (((tickAnim - 0D) / 3D) * (-0.46738D-(-7.47714D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -7.47363D + (((tickAnim - 3D) / 4D) * (-12.48295D-(-7.47363D)));
            yy = -0.03633D + (((tickAnim - 3D) / 4D) * (0.3918D-(-0.03633D)));
            zz = -0.46738D + (((tickAnim - 3D) / 4D) * (4.98466D-(-0.46738D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -12.48295D + (((tickAnim - 7D) / 2D) * (-17.84564D-(-12.48295D)));
            yy = 0.3918D + (((tickAnim - 7D) / 2D) * (0.1708D-(0.3918D)));
            zz = 4.98466D + (((tickAnim - 7D) / 2D) * (2.17024D-(4.98466D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -17.84564D + (((tickAnim - 9D) / 4D) * (-9.95632D-(-17.84564D)));
            yy = 0.1708D + (((tickAnim - 9D) / 4D) * (-0.28695D-(0.1708D)));
            zz = 2.17024D + (((tickAnim - 9D) / 4D) * (-3.659D-(2.17024D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -9.95632D + (((tickAnim - 13D) / 2D) * (-12.46166D-(-9.95632D)));
            yy = -0.28695D + (((tickAnim - 13D) / 2D) * (-0.58677D-(-0.28695D)));
            zz = -3.659D + (((tickAnim - 13D) / 2D) * (-7.47714D-(-3.659D)));
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            zz = -10D + (((tickAnim - 0D) / 7D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 7D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 8D) * (0D-(0D)));
            zz = -10D + (((tickAnim - 7D) / 8D) * (-10D-(-10D)));
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -25.10921D + (((tickAnim - 0D) / 3D) * (-20.10921D-(-25.10921D)));
            yy = 3.56403D + (((tickAnim - 0D) / 3D) * (3.56403D-(3.56403D)));
            zz = -3.50908D + (((tickAnim - 0D) / 3D) * (-3.50908D-(-3.50908D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -20.10921D + (((tickAnim - 3D) / 4D) * (-25.10921D-(-20.10921D)));
            yy = 3.56403D + (((tickAnim - 3D) / 4D) * (3.56403D-(3.56403D)));
            zz = -3.50908D + (((tickAnim - 3D) / 4D) * (-3.50908D-(-3.50908D)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -25.10921D + (((tickAnim - 7D) / 4D) * (-20.10921D-(-25.10921D)));
            yy = 3.56403D + (((tickAnim - 7D) / 4D) * (3.56403D-(3.56403D)));
            zz = -3.50908D + (((tickAnim - 7D) / 4D) * (-3.50908D-(-3.50908D)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -20.10921D + (((tickAnim - 11D) / 4D) * (-25.10921D-(-20.10921D)));
            yy = 3.56403D + (((tickAnim - 11D) / 4D) * (3.56403D-(3.56403D)));
            zz = -3.50908D + (((tickAnim - 11D) / 4D) * (-3.50908D-(-3.50908D)));
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -11.33681D + (((tickAnim - 0D) / 7D) * (-11.33681D-(-11.33681D)));
            yy = 24.42285D + (((tickAnim - 0D) / 7D) * (24.42285D-(24.42285D)));
            zz = 14.16066D + (((tickAnim - 0D) / 7D) * (14.16066D-(14.16066D)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -11.33681D + (((tickAnim - 7D) / 8D) * (-11.33681D-(-11.33681D)));
            yy = 24.42285D + (((tickAnim - 7D) / 8D) * (24.42285D-(24.42285D)));
            zz = 14.16066D + (((tickAnim - 7D) / 8D) * (14.16066D-(14.16066D)));
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            zz = 27.5D + (((tickAnim - 0D) / 7D) * (27.5D-(27.5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 7D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 8D) * (0D-(0D)));
            zz = 27.5D + (((tickAnim - 7D) / 8D) * (27.5D-(27.5D)));
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -40D + (((tickAnim - 0D) / 3D) * (-22.5D-(-40D)));
            yy = -27.5D + (((tickAnim - 0D) / 3D) * (-27.5D-(-27.5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -22.5D + (((tickAnim - 3D) / 4D) * (-40D-(-22.5D)));
            yy = -27.5D + (((tickAnim - 3D) / 4D) * (-27.5D-(-27.5D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -40D + (((tickAnim - 7D) / 4D) * (-22.5D-(-40D)));
            yy = -27.5D + (((tickAnim - 7D) / 4D) * (-27.5D-(-27.5D)));
            zz = 0D + (((tickAnim - 7D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -22.5D + (((tickAnim - 11D) / 4D) * (-40D-(-22.5D)));
            yy = -27.5D + (((tickAnim - 11D) / 4D) * (-27.5D-(-27.5D)));
            zz = 0D + (((tickAnim - 11D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = -62.5D + (((tickAnim - 0D) / 7D) * (-62.5D-(-62.5D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 7D) / 8D) * (0D-(0D)));
            yy = -62.5D + (((tickAnim - 7D) / 8D) * (-62.5D-(-62.5D)));
            zz = 0D + (((tickAnim - 7D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10D + (((tickAnim - 0D) / 3D) * (-9.03918D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-0.15728D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0.04206D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -9.03918D + (((tickAnim - 3D) / 3D) * (10.30288D-(-9.03918D)));
            yy = -0.15728D + (((tickAnim - 3D) / 3D) * (0.15882D-(-0.15728D)));
            zz = 0.04206D + (((tickAnim - 3D) / 3D) * (0.04185D-(0.04206D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 10.30288D + (((tickAnim - 6D) / 2D) * (10D-(10.30288D)));
            yy = 0.15882D + (((tickAnim - 6D) / 2D) * (0D-(0.15882D)));
            zz = 0.04185D + (((tickAnim - 6D) / 2D) * (0D-(0.04185D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10D + (((tickAnim - 8D) / 1D) * (12.63277D-(10D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (0.32892D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0.01064D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 12.63277D + (((tickAnim - 9D) / 2D) * (-2.50035D-(12.63277D)));
            yy = 0.32892D + (((tickAnim - 9D) / 2D) * (0.05949D-(0.32892D)));
            zz = 0.01064D + (((tickAnim - 9D) / 2D) * (0.00429D-(0.01064D)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -2.50035D + (((tickAnim - 11D) / 4D) * (10D-(-2.50035D)));
            yy = 0.05949D + (((tickAnim - 11D) / 4D) * (0D-(0.05949D)));
            zz = 0.00429D + (((tickAnim - 11D) / 4D) * (0D-(0.00429D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5D + (((tickAnim - 0D) / 3D) * (7.49973D-(5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0.03633D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (-0.0018D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 7.49973D + (((tickAnim - 3D) / 3D) * (3.56211D-(7.49973D)));
            yy = 0.03633D + (((tickAnim - 3D) / 3D) * (-0.08611D-(0.03633D)));
            zz = -0.0018D + (((tickAnim - 3D) / 3D) * (-0.00037D-(-0.0018D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 3.56211D + (((tickAnim - 6D) / 2D) * (5D-(3.56211D)));
            yy = -0.08611D + (((tickAnim - 6D) / 2D) * (0D-(-0.08611D)));
            zz = -0.00037D + (((tickAnim - 6D) / 2D) * (0D-(-0.00037D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 5D + (((tickAnim - 8D) / 1D) * (3.15466D-(5D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (-0.09184D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0.0107D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 3.15466D + (((tickAnim - 9D) / 2D) * (5.00025D-(3.15466D)));
            yy = -0.09184D + (((tickAnim - 9D) / 2D) * (-0.06131D-(-0.09184D)));
            zz = 0.0107D + (((tickAnim - 9D) / 2D) * (0.00131D-(0.0107D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 5.00025D + (((tickAnim - 11D) / 2D) * (-4.01974D-(5.00025D)));
            yy = -0.06131D + (((tickAnim - 11D) / 2D) * (-0.07595D-(-0.06131D)));
            zz = 0.00131D + (((tickAnim - 11D) / 2D) * (-0.03994D-(0.00131D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.01974D + (((tickAnim - 13D) / 2D) * (5D-(-4.01974D)));
            yy = -0.07595D + (((tickAnim - 13D) / 2D) * (0D-(-0.07595D)));
            zz = -0.03994D + (((tickAnim - 13D) / 2D) * (0D-(-0.03994D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (-4.99983D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-0.04074D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0.00354D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.99983D + (((tickAnim - 3D) / 2D) * (1.75763D-(-4.99983D)));
            yy = -0.04074D + (((tickAnim - 3D) / 2D) * (0.13034D-(-0.04074D)));
            zz = 0.00354D + (((tickAnim - 3D) / 2D) * (-0.00923D-(0.00354D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.75763D + (((tickAnim - 5D) / 3D) * (0D-(1.75763D)));
            yy = 0.13034D + (((tickAnim - 5D) / 3D) * (0D-(0.13034D)));
            zz = -0.00923D + (((tickAnim - 5D) / 3D) * (0D-(-0.00923D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 8D) / 3D) * (-4.99983D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (-0.04074D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0.00354D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -4.99983D + (((tickAnim - 11D) / 4D) * (0D-(-4.99983D)));
            yy = -0.04074D + (((tickAnim - 11D) / 4D) * (0D-(-0.04074D)));
            zz = 0.00354D + (((tickAnim - 11D) / 4D) * (0D-(0.00354D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.5D + (((tickAnim - 0D) / 6D) * (2.50886D-(12.5D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (-0.42262D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0.02037D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 2.50886D + (((tickAnim - 6D) / 2D) * (12.5D-(2.50886D)));
            yy = -0.42262D + (((tickAnim - 6D) / 2D) * (0D-(-0.42262D)));
            zz = 0.02037D + (((tickAnim - 6D) / 2D) * (0D-(0.02037D)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 12.5D + (((tickAnim - 8D) / 7D) * (12.5D-(12.5D)));
            yy = 0D + (((tickAnim - 8D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.50013D + (((tickAnim - 0D) / 3D) * (2.49981D-(-12.50013D)));
            yy = -0.00835D + (((tickAnim - 0D) / 3D) * (0.0509D-(-0.00835D)));
            zz = -0.02422D + (((tickAnim - 0D) / 3D) * (-0.05025D-(-0.02422D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.49981D + (((tickAnim - 3D) / 5D) * (-7.5D-(2.49981D)));
            yy = 0.0509D + (((tickAnim - 3D) / 5D) * (0D-(0.0509D)));
            zz = -0.05025D + (((tickAnim - 3D) / 5D) * (0D-(-0.05025D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -7.5D + (((tickAnim - 8D) / 1D) * (-9.31698D-(-7.5D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (-0.10705D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0.03551D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -9.31698D + (((tickAnim - 9D) / 4D) * (4.09996D-(-9.31698D)));
            yy = -0.10705D + (((tickAnim - 9D) / 4D) * (0.02203D-(-0.10705D)));
            zz = 0.03551D + (((tickAnim - 9D) / 4D) * (-0.01272D-(0.03551D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 4.09996D + (((tickAnim - 13D) / 2D) * (-12.50013D-(4.09996D)));
            yy = 0.02203D + (((tickAnim - 13D) / 2D) * (-0.00835D-(0.02203D)));
            zz = -0.01272D + (((tickAnim - 13D) / 2D) * (-0.02422D-(-0.01272D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 5D + (((tickAnim - 0D) / 7D) * (-10D-(5D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 7D) / 8D) * (0D-(0D)));
            yy = -10D + (((tickAnim - 7D) / 8D) * (5D-(-10D)));
            zz = 0D + (((tickAnim - 7D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 7.5D + (((tickAnim - 0D) / 3D) * (7.5D-(7.5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 7.5D + (((tickAnim - 3D) / 2D) * (2.5D-(7.5D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = 2.5D + (((tickAnim - 5D) / 2D) * (-2.5D-(2.5D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            yy = -2.5D + (((tickAnim - 7D) / 2D) * (-2D-(-2.5D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            yy = -2D + (((tickAnim - 9D) / 4D) * (5.93D-(-2D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 5.93D + (((tickAnim - 13D) / 2D) * (7.5D-(5.93D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 5D + (((tickAnim - 0D) / 3D) * (6.25D-(5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 6.25D + (((tickAnim - 3D) / 2D) * (-0.63D-(6.25D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = -0.63D + (((tickAnim - 5D) / 2D) * (-2.5D-(-0.63D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            yy = -2.5D + (((tickAnim - 7D) / 2D) * (-5.25D-(-2.5D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            yy = -5.25D + (((tickAnim - 9D) / 4D) * (5.61D-(-5.25D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 5.61D + (((tickAnim - 13D) / 2D) * (5D-(5.61D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 7.5D + (((tickAnim - 0D) / 3D) * (5D-(7.5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 5D + (((tickAnim - 3D) / 2D) * (1.25D-(5D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = 1.25D + (((tickAnim - 5D) / 2D) * (-12.5D-(1.25D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            yy = -12.5D + (((tickAnim - 7D) / 2D) * (-9D-(-12.5D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            yy = -9D + (((tickAnim - 9D) / 4D) * (-7.07D-(-9D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = -7.07D + (((tickAnim - 13D) / 2D) * (7.5D-(-7.07D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 10D + (((tickAnim - 0D) / 3D) * (7.5D-(10D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 7.5D + (((tickAnim - 3D) / 2D) * (3.75D-(7.5D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = 3.75D + (((tickAnim - 5D) / 2D) * (-10D-(3.75D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            yy = -10D + (((tickAnim - 7D) / 2D) * (-9D-(-10D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            yy = -9D + (((tickAnim - 9D) / 4D) * (-13.14D-(-9D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = -13.14D + (((tickAnim - 13D) / 2D) * (10D-(-13.14D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30D + (((tickAnim - 0D) / 3D) * (-7.5D-(30D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.5D + (((tickAnim - 3D) / 2D) * (-35D-(-7.5D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -35D + (((tickAnim - 5D) / 3D) * (-17.5D-(-35D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5D + (((tickAnim - 8D) / 2D) * (19.17D-(-17.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 19.17D + (((tickAnim - 10D) / 3D) * (23.34D-(19.17D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 23.34D + (((tickAnim - 13D) / 1D) * (27.44D-(23.34D)));
            yy = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 27.44D + (((tickAnim - 14D) / 1D) * (30D-(27.44D)));
            yy = 0D + (((tickAnim - 14D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15D + (((tickAnim - 0D) / 3D) * (21.25D-(-15D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 21.25D + (((tickAnim - 3D) / 2D) * (13.14309D-(21.25D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (-0.36194D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0.0205D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 13.14309D + (((tickAnim - 5D) / 3D) * (-24.72922D-(13.14309D)));
            yy = -0.36194D + (((tickAnim - 5D) / 3D) * (0.24946D-(-0.36194D)));
            zz = 0.0205D + (((tickAnim - 5D) / 3D) * (2.2795D-(0.0205D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -24.72922D + (((tickAnim - 8D) / 2D) * (-40.83D-(-24.72922D)));
            yy = 0.24946D + (((tickAnim - 8D) / 2D) * (0D-(0.24946D)));
            zz = 2.2795D + (((tickAnim - 8D) / 2D) * (0D-(2.2795D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -40.83D + (((tickAnim - 10D) / 3D) * (-31.66D-(-40.83D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -31.66D + (((tickAnim - 13D) / 2D) * (-15D-(-31.66D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 47.5D + (((tickAnim - 0D) / 3D) * (10D-(47.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10D + (((tickAnim - 3D) / 2D) * (-27.5D-(10D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -27.5D + (((tickAnim - 5D) / 3D) * (-22.5D-(-27.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.5D + (((tickAnim - 8D) / 2D) * (28.33D-(-22.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 28.33D + (((tickAnim - 10D) / 3D) * (46.67D-(28.33D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 46.67D + (((tickAnim - 13D) / 1D) * (59.6D-(46.67D)));
            yy = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 59.6D + (((tickAnim - 14D) / 1D) * (47.5D-(59.6D)));
            yy = 0D + (((tickAnim - 14D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(TarsalsL, TarsalsL.rotateAngleX + (float) Math.toRadians(xx), TarsalsL.rotateAngleY + (float) Math.toRadians(yy), TarsalsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 97.5D + (((tickAnim - 0D) / 3D) * (113.75D-(97.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 113.75D + (((tickAnim - 3D) / 2D) * (115.63D-(113.75D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 115.63D + (((tickAnim - 5D) / 3D) * (95D-(115.63D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 95D + (((tickAnim - 8D) / 2D) * (-8.33D-(95D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -8.33D + (((tickAnim - 10D) / 3D) * (-36.66D-(-8.33D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -36.66D + (((tickAnim - 13D) / 2D) * (97.5D-(-36.66D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5D + (((tickAnim - 0D) / 3D) * (30D-(-17.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30D + (((tickAnim - 3D) / 2D) * (27.5D-(30D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 27.5D + (((tickAnim - 5D) / 2D) * (44.85D-(27.5D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 44.85D + (((tickAnim - 7D) / 1D) * (35D-(44.85D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35D + (((tickAnim - 8D) / 2D) * (-9.17D-(35D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -9.17D + (((tickAnim - 10D) / 3D) * (-30.83D-(-9.17D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -30.83D + (((tickAnim - 13D) / 2D) * (-17.5D-(-30.83D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30D + (((tickAnim - 0D) / 3D) * (-50D-(-30D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -50D + (((tickAnim - 3D) / 2D) * (-26.25D-(-50D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -26.25D + (((tickAnim - 5D) / 3D) * (-17.5D-(-26.25D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5D + (((tickAnim - 8D) / 2D) * (24.17D-(-17.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 24.17D + (((tickAnim - 10D) / 3D) * (28.33D-(24.17D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 28.33D + (((tickAnim - 13D) / 2D) * (-30D-(28.33D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20D + (((tickAnim - 0D) / 3D) * (35D-(-20D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 35D + (((tickAnim - 3D) / 2D) * (36.50579D-(35D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (1.40999D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (2.43435D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.50579D + (((tickAnim - 5D) / 3D) * (45D-(36.50579D)));
            yy = 1.40999D + (((tickAnim - 5D) / 3D) * (0D-(1.40999D)));
            zz = 2.43435D + (((tickAnim - 5D) / 3D) * (0D-(2.43435D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 45D + (((tickAnim - 8D) / 2D) * (-1.67D-(45D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.67D + (((tickAnim - 10D) / 3D) * (-39.58D-(-1.67D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -39.58D + (((tickAnim - 13D) / 2D) * (-20D-(-39.58D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(TarsalsR, TarsalsR.rotateAngleX + (float) Math.toRadians(xx), TarsalsR.rotateAngleY + (float) Math.toRadians(yy), TarsalsR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 107.5D + (((tickAnim - 0D) / 3D) * (-15D-(107.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15D + (((tickAnim - 3D) / 2D) * (-37.5D-(-15D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -37.5D + (((tickAnim - 5D) / 3D) * (90D-(-37.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 90D + (((tickAnim - 8D) / 2D) * (102.5D-(90D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 102.5D + (((tickAnim - 10D) / 3D) * (120D-(102.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 120D + (((tickAnim - 13D) / 2D) * (107.5D-(120D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 1.8D + (((tickAnim - 0D) / 3D) * (3.1D-(1.8D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 3.1D + (((tickAnim - 3D) / 2D) * (2.04D-(3.1D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            yy = 2.04D + (((tickAnim - 5D) / 3D) * (1.8D-(2.04D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            yy = 1.8D + (((tickAnim - 8D) / 3D) * (3D-(1.8D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 11D) / 6D) * (0D-(0D)));
            yy = 3D + (((tickAnim - 11D) / 6D) * (1.8D-(3D)));
            zz = 0D + (((tickAnim - 11D) / 6D) * (0D-(0D)));
        }
        this.Dryosaurus.offsetX = (float) Math.toRadians(xx);
        this.Dryosaurus.offsetY = (float) Math.toRadians(yy) - 0.20F;
        this.Dryosaurus.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 0D) / 8D) * (5D-(-5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 8D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 9D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 8D) / 9D) * (-5D-(5D)));
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 0D) / 4D) * (1.25D-(2.5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 1.25D + (((tickAnim - 4D) / 4D) * (-5D-(1.25D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 8D) / 5D) * (-3.75D-(-5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = -3.75D + (((tickAnim - 13D) / 4D) * (2.5D-(-3.75D)));
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10D + (((tickAnim - 0D) / 4D) * (15D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 15D + (((tickAnim - 4D) / 4D) * (10D-(15D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 10D + (((tickAnim - 8D) / 5D) * (15D-(10D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 15D + (((tickAnim - 13D) / 4D) * (10D-(15D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -10D + (((tickAnim - 0D) / 4D) * (-17.5D-(-10D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -17.5D + (((tickAnim - 4D) / 4D) * (-10D-(-17.5D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 8D) / 5D) * (-17.5D-(-10D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -17.5D + (((tickAnim - 13D) / 4D) * (-10D-(-17.5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            yy = 17.5D + (((tickAnim - 0D) / 4D) * (27.5D-(17.5D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            yy = 27.5D + (((tickAnim - 4D) / 4D) * (17.5D-(27.5D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            yy = 17.5D + (((tickAnim - 8D) / 5D) * (27.5D-(17.5D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = 27.5D + (((tickAnim - 13D) / 4D) * (17.5D-(27.5D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.5D + (((tickAnim - 0D) / 4D) * (12.5D-(7.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 12.5D + (((tickAnim - 4D) / 4D) * (7.5D-(12.5D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 7.5D + (((tickAnim - 8D) / 5D) * (12.5D-(7.5D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 12.5D + (((tickAnim - 13D) / 4D) * (7.5D-(12.5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.5D + (((tickAnim - 0D) / 4D) * (-15D-(-7.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -15D + (((tickAnim - 4D) / 4D) * (-7.5D-(-15D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -7.5D + (((tickAnim - 8D) / 5D) * (-15D-(-7.5D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -15D + (((tickAnim - 13D) / 4D) * (-7.5D-(-15D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            yy = -40D + (((tickAnim - 0D) / 4D) * (-47.5D-(-40D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            yy = -47.5D + (((tickAnim - 4D) / 4D) * (-40D-(-47.5D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            yy = -40D + (((tickAnim - 8D) / 5D) * (-47.5D-(-40D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = -47.5D + (((tickAnim - 13D) / 4D) * (-40D-(-47.5D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.5D + (((tickAnim - 0D) / 4D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -2.5D + (((tickAnim - 8D) / 5D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5D + (((tickAnim - 0D) / 4D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (-5D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5D + (((tickAnim - 8D) / 5D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (-5D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.5D + (((tickAnim - 0D) / 4D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.5D + (((tickAnim - 8D) / 5D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5D + (((tickAnim - 0D) / 4D) * (5D-(-5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5D + (((tickAnim - 4D) / 4D) * (-5D-(5D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5D + (((tickAnim - 8D) / 5D) * (5D-(-5D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 5D + (((tickAnim - 13D) / 4D) * (-5D-(5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(10), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            yy = 2.5D + (((tickAnim - 0D) / 9D) * (-5D-(2.5D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 9D) / 8D) * (0D-(0D)));
            yy = -5D + (((tickAnim - 9D) / 8D) * (2.5D-(-5D)));
            zz = 0D + (((tickAnim - 9D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (2.88D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 3D) / 6D) * (0D-(0D)));
            yy = 2.88D + (((tickAnim - 3D) / 6D) * (-0.64D-(2.88D)));
            zz = 0D + (((tickAnim - 3D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            yy = -0.64D + (((tickAnim - 9D) / 4D) * (-3.11D-(-0.64D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = -3.11D + (((tickAnim - 13D) / 4D) * (0D-(-3.11D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 5D + (((tickAnim - 0D) / 3D) * (5.38D-(5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 3D) / 6D) * (0D-(0D)));
            yy = 5.38D + (((tickAnim - 3D) / 6D) * (-2.25D-(5.38D)));
            zz = 0D + (((tickAnim - 3D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            yy = -2.25D + (((tickAnim - 9D) / 4D) * (-4.65D-(-2.25D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = -4.65D + (((tickAnim - 13D) / 4D) * (5D-(-4.65D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 7.5D + (((tickAnim - 0D) / 3D) * (5.76D-(7.5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 3D) / 6D) * (0D-(0D)));
            yy = 5.76D + (((tickAnim - 3D) / 6D) * (-1.13D-(5.76D)));
            zz = 0D + (((tickAnim - 3D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            yy = -1.13D + (((tickAnim - 9D) / 4D) * (-2.89D-(-1.13D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = -2.89D + (((tickAnim - 13D) / 4D) * (7.5D-(-2.89D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 2.5D + (((tickAnim - 0D) / 3D) * (4.32D-(2.5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            yy = 4.32D + (((tickAnim - 3D) / 5D) * (6.46D-(4.32D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            yy = 6.46D + (((tickAnim - 8D) / 1D) * (-6.44D-(6.46D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            yy = -6.44D + (((tickAnim - 9D) / 4D) * (-8.47D-(-6.44D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = -8.47D + (((tickAnim - 13D) / 4D) * (2.5D-(-8.47D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5D + (((tickAnim - 0D) / 3D) * (-7.75D-(17.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.75D + (((tickAnim - 3D) / 2D) * (-23D-(-7.75D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -23D + (((tickAnim - 5D) / 3D) * (-12.5D-(-23D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -12.5D + (((tickAnim - 8D) / 3D) * (10.25D-(-12.5D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 10.25D + (((tickAnim - 11D) / 2D) * (8D-(10.25D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 8D + (((tickAnim - 13D) / 4D) * (17.5D-(8D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (20.75D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20.75D + (((tickAnim - 3D) / 2D) * (1.5D-(20.75D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.5D + (((tickAnim - 5D) / 3D) * (-22.5D-(1.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -22.5D + (((tickAnim - 8D) / 3D) * (-32D-(-22.5D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -32D + (((tickAnim - 11D) / 2D) * (-16.5D-(-32D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -16.5D + (((tickAnim - 13D) / 4D) * (0D-(-16.5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5D + (((tickAnim - 0D) / 3D) * (-29.75D-(12.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -29.75D + (((tickAnim - 3D) / 2D) * (-7D-(-29.75D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7D + (((tickAnim - 5D) / 3D) * (30D-(-7D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 30D + (((tickAnim - 8D) / 3D) * (26D-(30D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 26D + (((tickAnim - 11D) / 2D) * (32D-(26D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 32D + (((tickAnim - 13D) / 4D) * (12.5D-(32D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(TarsalsL, TarsalsL.rotateAngleX + (float) Math.toRadians(xx), TarsalsL.rotateAngleY + (float) Math.toRadians(yy), TarsalsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.5D + (((tickAnim - 0D) / 3D) * (122D-(2.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 122D + (((tickAnim - 3D) / 2D) * (71.5D-(122D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 71.5D + (((tickAnim - 5D) / 3D) * (5D-(71.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 5D + (((tickAnim - 8D) / 5D) * (-24D-(5D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -24D + (((tickAnim - 13D) / 4D) * (2.5D-(-24D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10D + (((tickAnim - 0D) / 3D) * (3.5D-(-10D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.5D + (((tickAnim - 3D) / 2D) * (7D-(3.5D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7D + (((tickAnim - 5D) / 3D) * (10D-(7D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 10D + (((tickAnim - 8D) / 3D) * (-13.5D-(10D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -13.5D + (((tickAnim - 11D) / 2D) * (-22D-(-13.5D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -22D + (((tickAnim - 13D) / 4D) * (-10D-(-22D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -22.5D + (((tickAnim - 0D) / 3D) * (-27.75D-(-22.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -27.75D + (((tickAnim - 3D) / 2D) * (-13D-(-27.75D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -13D + (((tickAnim - 5D) / 2D) * (-8.41D-(-13D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -8.41D + (((tickAnim - 7D) / 1D) * (10D-(-8.41D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 10D + (((tickAnim - 8D) / 3D) * (15.25D-(10D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 15.25D + (((tickAnim - 11D) / 2D) * (5.5D-(15.25D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 5.5D + (((tickAnim - 13D) / 4D) * (-22.5D-(5.5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5D + (((tickAnim - 0D) / 3D) * (31.5D-(22.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 31.5D + (((tickAnim - 3D) / 2D) * (30.5D-(31.5D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 30.5D + (((tickAnim - 5D) / 2D) * (28.41D-(30.5D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 28.41D + (((tickAnim - 7D) / 1D) * (2.5D-(28.41D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 2.5D + (((tickAnim - 8D) / 3D) * (-29D-(2.5D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -29D + (((tickAnim - 11D) / 2D) * (-20.5D-(-29D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -20.5D + (((tickAnim - 13D) / 4D) * (22.5D-(-20.5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(TarsalsR, TarsalsR.rotateAngleX + (float) Math.toRadians(xx), TarsalsR.rotateAngleY + (float) Math.toRadians(yy), TarsalsR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10D + (((tickAnim - 0D) / 3D) * (-7.5D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.5D + (((tickAnim - 3D) / 2D) * (-22.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -22.5D + (((tickAnim - 5D) / 2D) * (-23.2D-(-22.5D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -23.2D + (((tickAnim - 7D) / 1D) * (22.5D-(-23.2D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 22.5D + (((tickAnim - 8D) / 3D) * (138.75D-(22.5D)));
            yy = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 138.75D + (((tickAnim - 11D) / 2D) * (100D-(138.75D)));
            yy = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 100D + (((tickAnim - 13D) / 4D) * (10D-(100D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDryosaurus e = (EntityPrehistoricFloraDryosaurus) entity;
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
