package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDryosaurus;
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
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.Neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
                //animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
            } else {
                //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
            }
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraDryosaurus entity = (EntityPrehistoricFloraDryosaurus) entitylivingbaseIn;


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
