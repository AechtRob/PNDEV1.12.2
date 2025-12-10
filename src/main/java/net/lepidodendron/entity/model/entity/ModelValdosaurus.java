package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraValdosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelValdosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer ElbowL;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer ArmL2;
    private final AdvancedModelRenderer ElbowL2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer HandL2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer HeadslopeNOANIMATION;
    private final AdvancedModelRenderer HeadslopeNOANIMATION2;
    private final AdvancedModelRenderer Uppercheek;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer Uppercheek2;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Eyes;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer JawSlopeNOANIMATION;
    private final AdvancedModelRenderer JawSlopeNOANIMATION2;
    private final AdvancedModelRenderer CheeksNOANIMATION;
    private final AdvancedModelRenderer CheekInternal_r1;
    private final AdvancedModelRenderer CheeksNOANIMATION3;
    private final AdvancedModelRenderer CheekInternal_r2;
    private final AdvancedModelRenderer CheeksNOANIMATION2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer KneeL;
    private final AdvancedModelRenderer TarsalsL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer KneeR;
    private final AdvancedModelRenderer TarsalsR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer cube_r45;


    private ModelAnimator animator;

    public ModelValdosaurus() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(1.0F, 1.15F, 5.3F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.52F, 3.425F);
        this.Root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 93, -1.0F, -1.0391F, -4.9711F, 0, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 84, -2.5F, -0.0391F, -6.9711F, 3, 1, 7, 0.0F, false));

        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(0.0F, 0.0F, -0.28F);
        this.Root.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.1396F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 39, 19, -5.0F, -4.3F, -3.64F, 8, 12, 8, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -2.66F);
        this.Root.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -5.5F, -4.76F, -9.94F, 9, 13, 10, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 81, -1.0F, -5.76F, -8.94F, 0, 1, 9, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(-0.5F, -0.2F, -9.54F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.096F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.2004F, 5.32F, -7.56F);
        this.Chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 47, -4.2004F, -6.8015F, -0.7791F, 7, 7, 8, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.06F, -8.0F);
        this.Chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2269F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 73, -0.5F, -1.4708F, -0.3851F, 0, 2, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.36F, -0.1F);
        this.Chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2793F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 0, -4.5F, -0.0374F, -10.6131F, 8, 7, 11, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(3.0F, 3.4F, -8.9F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.7941F, 0.0F, 0.0F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 31, 47, 0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));

        this.ElbowL = new AdvancedModelRenderer(this);
        this.ElbowL.setRotationPoint(0.0F, 5.7F, 1.7F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.3403F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ElbowL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.1694F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 63, 0.0F, 0.0F, -1.7F, 1, 5, 2, -0.01F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(1.0F, 0.9F, -5.0F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0698F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.387F, 0.1213F, 0.0493F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 89, 94, -1.0F, -0.6F, -2.0F, 1, 2, 2, 0.0F, false));

        this.ArmL2 = new AdvancedModelRenderer(this);
        this.ArmL2.setRotationPoint(-4.0F, 3.4F, -8.9F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.7941F, 0.0F, 0.0F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 31, 47, -1.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, true));

        this.ElbowL2 = new AdvancedModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.0F, 5.7F, 1.7F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.3403F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ElbowL2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.1694F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 63, -1.0F, 0.0F, -1.7F, 1, 5, 2, -0.01F, true));

        this.HandL2 = new AdvancedModelRenderer(this);
        this.HandL2.setRotationPoint(-1.0F, 0.9F, -5.0F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.0698F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandL2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.387F, -0.1213F, -0.0493F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 89, 94, 0.0F, -0.6F, -2.0F, 1, 2, 2, 0.0F, true));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.14F, -8.66F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.1745F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.1F, -0.16F);
        this.Neck1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2269F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 63, -0.5F, -0.9F, -2.36F, 0, 2, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 72, 19, -3.0F, 0.3F, -3.36F, 5, 5, 6, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.28F, -3.22F);
        this.Neck1.addChild(Neck2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.08F, -2.46F);
        this.Neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.733F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 95, 22, -0.5F, -1.2615F, 0.997F, 0, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.68F, -0.16F);
        this.Neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6807F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 80, 83, -2.0F, -0.4792F, -3.3008F, 3, 4, 6, 0.002F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -3.0F, -2.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.1309F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.8988F, -2.8653F);
        this.Neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4014F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 93, 13, -1.5F, -1.9535F, -2.6299F, 2, 2, 3, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.9012F, -2.7653F);
        this.Neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.733F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 55, 94, -0.5F, -1.6088F, 0.0499F, 0, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.6012F, 0.1347F);
        this.Neck3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6807F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 59, 85, -2.0F, -0.0712F, -3.6513F, 3, 4, 4, -0.002F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -1.6612F, -2.7253F);
        this.Neck3.addChild(Neck4);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -1.54F, -1.7F);
        this.Neck4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1571F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 93, 42, -1.5F, -0.0284F, -0.2286F, 3, 3, 2, -0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.5F, -0.3F, -1.7F);
        this.Neck4.addChild(Head);
        this.setRotateAngle(Head, -0.0698F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -0.8961F, -2.0679F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2269F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 44, 94, -2.0F, 0.0236F, -0.027F, 3, 1, 2, -0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.7961F, -2.0679F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4014F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 95, 33, -1.5F, -0.0727F, -0.977F, 2, 1, 1, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.8039F, -4.5679F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0734F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 87, 16, -0.5F, 0.0273F, -0.9868F, 1, 1, 1, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.8039F, -4.5679F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 62, 94, -1.0F, 0.0135F, 0.5791F, 2, 1, 2, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.8039F, -4.5679F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6981F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 95, 30, -1.0F, 0.0135F, 0.0291F, 2, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.3961F, -2.9679F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.6807F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 95, 27, -1.0F, -0.0827F, -0.9695F, 2, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.0961F, 0.1321F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 93, 48, -1.0F, 1.6888F, -3.0527F, 2, 1, 3, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 93, 0, -1.5F, 0.4888F, -3.0527F, 3, 2, 3, 0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.25F, -0.94F, -0.09F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.4748F, 0.5028F, 0.0436F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 74, 85, 0.0F, -2.325F, -0.007F, 0, 3, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.25F, -0.94F, -0.09F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.4748F, -0.5028F, -0.0436F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 74, 85, 0.0F, -2.325F, -0.007F, 0, 3, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.25F, -0.94F, -1.09F);
        this.Head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2424F, 0.6933F, -0.0854F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 74, 85, 0.0F, -2.325F, -0.007F, 0, 3, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.25F, -0.94F, -1.09F);
        this.Head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2424F, -0.6933F, 0.0854F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 74, 85, 0.0F, -2.325F, -0.007F, 0, 3, 2, 0.0F, false));

        this.HeadslopeNOANIMATION = new AdvancedModelRenderer(this);
        this.HeadslopeNOANIMATION.setRotationPoint(1.5F, 1.7039F, -2.6679F);
        this.Head.addChild(HeadslopeNOANIMATION);


        this.HeadslopeNOANIMATION2 = new AdvancedModelRenderer(this);
        this.HeadslopeNOANIMATION2.setRotationPoint(-1.5F, 1.7039F, -2.6679F);
        this.Head.addChild(HeadslopeNOANIMATION2);


        this.Uppercheek = new AdvancedModelRenderer(this);
        this.Uppercheek.setRotationPoint(0.0F, -1.0961F, 0.1321F);
        this.Head.addChild(Uppercheek);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Uppercheek.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 96, 94, 1.35F, 2.2888F, -3.0527F, 0, 1, 2, 0.001F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 95, 36, 1.325F, 2.2888F, -3.0527F, 0, 1, 2, 0.001F, false));

        this.Uppercheek2 = new AdvancedModelRenderer(this);
        this.Uppercheek2.setRotationPoint(0.0F, -1.0961F, 0.1321F);
        this.Head.addChild(Uppercheek2);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Uppercheek2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 49, 98, -1.35F, 2.2888F, -3.0527F, 0, 1, 2, 0.001F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 44, 98, -1.325F, 2.2888F, -3.0527F, 0, 1, 2, 0.001F, false));

        this.Eyes = new AdvancedModelRenderer(this);
        this.Eyes.setRotationPoint(0.5F, 0.5839F, -2.0679F);
        this.Head.addChild(Eyes);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eyes.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3491F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 78, 16, -2.0F, -0.4384F, -0.3996F, 3, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.5039F, 0.2321F);
        this.Head.addChild(Jaw);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0349F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 95, 19, -1.5F, -1.0F, -1.0F, 3, 1, 1, -0.001F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.2F, -2.9F);
        this.Jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1745F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 33, 94, -1.0F, -1.1427F, 0.1936F, 2, 1, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0873F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 80, 94, -1.0F, -0.3F, -3.0F, 2, 1, 2, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 72, 53, -1.5F, -0.1F, -3.0F, 3, 1, 3, 0.001F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 71, 94, -1.0F, -0.1F, -4.1568F, 2, 1, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.3F, -4.1F);
        this.Jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4538F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 74, 91, -0.5F, -1.0501F, -0.9747F, 1, 1, 1, 0.0F, false));

        this.JawSlopeNOANIMATION = new AdvancedModelRenderer(this);
        this.JawSlopeNOANIMATION.setRotationPoint(0.4F, 0.1F, -3.6F);
        this.Jaw.addChild(JawSlopeNOANIMATION);


        this.JawSlopeNOANIMATION2 = new AdvancedModelRenderer(this);
        this.JawSlopeNOANIMATION2.setRotationPoint(-0.4F, 0.1F, -3.1F);
        this.Jaw.addChild(JawSlopeNOANIMATION2);


        this.CheeksNOANIMATION = new AdvancedModelRenderer(this);
        this.CheeksNOANIMATION.setRotationPoint(1.4F, 0.0F, -1.1F);
        this.Jaw.addChild(CheeksNOANIMATION);


        this.CheekInternal_r1 = new AdvancedModelRenderer(this);
        this.CheekInternal_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CheeksNOANIMATION.addChild(CheekInternal_r1);
        this.setRotateAngle(CheekInternal_r1, -0.1049F, 0.0046F, -0.0871F);
        this.CheekInternal_r1.cubeList.add(new ModelBox(CheekInternal_r1, 67, 98, -0.02F, -0.6424F, -1.8015F, 0, 1, 2, -0.001F, false));
        this.CheekInternal_r1.cubeList.add(new ModelBox(CheekInternal_r1, 62, 98, 0.0F, -0.6424F, -1.8015F, 0, 1, 2, -0.001F, false));

        this.CheeksNOANIMATION3 = new AdvancedModelRenderer(this);
        this.CheeksNOANIMATION3.setRotationPoint(-1.4F, 0.0F, -1.1F);
        this.Jaw.addChild(CheeksNOANIMATION3);


        this.CheekInternal_r2 = new AdvancedModelRenderer(this);
        this.CheekInternal_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CheeksNOANIMATION3.addChild(CheekInternal_r2);
        this.setRotateAngle(CheekInternal_r2, -0.1049F, -0.0046F, 0.0871F);
        this.CheekInternal_r2.cubeList.add(new ModelBox(CheekInternal_r2, 77, 98, 0.02F, -0.6424F, -1.8015F, 0, 1, 2, -0.001F, false));
        this.CheekInternal_r2.cubeList.add(new ModelBox(CheekInternal_r2, 72, 98, 0.0F, -0.6424F, -1.8015F, 0, 1, 2, -0.001F, false));

        this.CheeksNOANIMATION2 = new AdvancedModelRenderer(this);
        this.CheeksNOANIMATION2.setRotationPoint(-1.4F, 0.0F, -1.1F);
        this.Jaw.addChild(CheeksNOANIMATION2);


        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -1.42F, 4.44F);
        this.Root.addChild(Tail1);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -1.175F, 5.66F);
        this.Tail1.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.4102F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 87, 53, -1.0F, -1.0354F, -0.053F, 0, 1, 7, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 72, 31, -2.0F, -0.0354F, -0.053F, 2, 1, 9, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -1.7F, -0.14F);
        this.Tail1.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2793F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 93, 6, -1.0F, -2.14F, -0.28F, 0, 1, 5, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 40, 85, -2.0F, -1.14F, -1.28F, 2, 1, 7, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -0.7F, -0.14F);
        this.Tail1.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2793F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 24, -4.0F, -1.14F, -1.28F, 6, 9, 13, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 2.85F, 10.55F);
        this.Tail1.addChild(Tail2);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.86F, 2.86F);
        this.Tail2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2094F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 61, 73, -1.0F, -1.0588F, -0.0762F, 0, 2, 9, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -0.86F, 0.46F);
        this.Tail2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.192F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 39, 40, -3.0F, -0.4167F, -0.7203F, 4, 5, 12, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 2.32F, 10.84F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -1.2F, 1.1F);
        this.Tail3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1396F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 11, 93, -1.0F, -1.0378F, 0.1365F, 0, 1, 5, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -1.5F, 0.4F);
        this.Tail3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0873F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 72, 42, -2.5F, 0.2F, -0.14F, 3, 3, 7, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.6F, 10.26F);
        this.Tail3.addChild(Tail4);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -0.64F, -3.56F);
        this.Tail4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1047F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 87, 62, -1.0F, -1.3745F, -0.003F, 0, 1, 7, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -0.64F, 1.44F);
        this.Tail4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0349F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 21, 73, -2.0F, -0.2F, -5.0F, 2, 2, 8, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.15F, 4.35F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.1745F, 0.0F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.3785F, 6.5826F);
        this.Tail5.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.1745F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 60, 58, -1.0F, -0.5404F, -6.7196F, 0, 1, 13, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 31, 58, -1.5F, 0.2596F, -6.7196F, 1, 1, 13, -0.001F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(3.0F, 0.0F, -0.28F);
        this.Root.addChild(LegL);
        this.setRotateAngle(LegL, -0.384F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 0, 63, -1.0F, -1.3F, -2.3F, 3, 10, 7, 0.0F, false));

        this.KneeL = new AdvancedModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 8.1999F, -1.852F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.925F, 0.0F, 0.0F);
        this.KneeL.cubeList.add(new ModelBox(KneeL, 78, 0, -1.01F, 0.1F, -0.5F, 3, 11, 4, -0.001F, false));

        this.TarsalsL = new AdvancedModelRenderer(this);
        this.TarsalsL.setRotationPoint(0.0F, 10.7332F, 3.0718F);
        this.KneeL.addChild(TarsalsL);
        this.setRotateAngle(TarsalsL, -0.8727F, 0.0F, 0.0F);
        this.TarsalsL.cubeList.add(new ModelBox(TarsalsL, 0, 92, -0.5F, 0.0F, -2.6F, 2, 8, 3, -0.01F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 7.7295F, -0.199F);
        this.TarsalsL.addChild(FootL);
        this.setRotateAngle(FootL, 0.4014F, 0.0F, 0.0F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0698F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 80, 73, -1.01F, -1.0F, -6.0F, 3, 2, 7, 0.0F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-5.0F, 0.0F, -0.28F);
        this.Root.addChild(LegR);
        this.setRotateAngle(LegR, -0.384F, 0.0F, 0.0F);
        this.LegR.cubeList.add(new ModelBox(LegR, 0, 63, -2.0F, -1.3F, -2.3F, 3, 10, 7, 0.0F, true));

        this.KneeR = new AdvancedModelRenderer(this);
        this.KneeR.setRotationPoint(0.0F, 8.1999F, -1.852F);
        this.LegR.addChild(KneeR);
        this.setRotateAngle(KneeR, 0.925F, 0.0F, 0.0F);
        this.KneeR.cubeList.add(new ModelBox(KneeR, 78, 0, -1.99F, 0.1F, -0.5F, 3, 11, 4, -0.001F, true));

        this.TarsalsR = new AdvancedModelRenderer(this);
        this.TarsalsR.setRotationPoint(0.0F, 10.7332F, 3.0718F);
        this.KneeR.addChild(TarsalsR);
        this.setRotateAngle(TarsalsR, -0.8727F, 0.0F, 0.0F);
        this.TarsalsR.cubeList.add(new ModelBox(TarsalsR, 0, 92, -1.5F, 0.0F, -2.6F, 2, 8, 3, -0.01F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 7.7295F, -0.199F);
        this.TarsalsR.addChild(FootR);
        this.setRotateAngle(FootR, 0.4014F, 0.0F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootR.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0698F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 80, 73, -1.99F, -1.0F, -6.0F, 3, 2, 7, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
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
        this.Root.offsetY = 0.30F;
        this.Root.offsetX = 0.1F;
        this.Root.rotateAngleY = (float)Math.toRadians(130);
        this.Root.rotateAngleX = (float)Math.toRadians(0);
        this.Root.rotateAngleZ = (float)Math.toRadians(0);
        this.Root.scaleChildren = true;
        float scaler = 0.47F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Root, 0.2F, 3.8F, -0.1F);
        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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

        EntityPrehistoricFloraValdosaurus entityValdosaurus = (EntityPrehistoricFloraValdosaurus) e;

        this.faceTarget(f3, f4, 12, Neck1);
        this.faceTarget(f3, f4, 12, Neck2);
        this.faceTarget(f3, f4, 12, Neck3);
        this.faceTarget(f3, f4, 12, Neck4);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Neck4, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityValdosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityValdosaurus.getAnimation() == entityValdosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityValdosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityValdosaurus.getIsMoving()) {
                    if (entityValdosaurus.getAnimation() != entityValdosaurus.EAT_ANIMATION
                            && entityValdosaurus.getAnimation() != entityValdosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityValdosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraValdosaurus ee = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;

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
        if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.CHATTER_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LONG_CHATTER_ANIMATION) {
            animNoise2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALARM_ANIMATION) {
            animIdleAlarm(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LOOK_ANIMATION) {
            animIdleLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraValdosaurus entity = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;
        int animCycle = 90;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.90793-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.06661-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.99889-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 1.90793 + (((tickAnim - 5) / 4) * (3-(1.90793)));
            yy = -0.06661 + (((tickAnim - 5) / 4) * (0-(-0.06661)));
            zz = 1.99889 + (((tickAnim - 5) / 4) * (0-(1.99889)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 3 + (((tickAnim - 9) / 7) * (4.66717-(3)));
            yy = 0 + (((tickAnim - 9) / 7) * (-0.1628-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (1.99337-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 4.66717 + (((tickAnim - 16) / 7) * (6.09275-(4.66717)));
            yy = -0.1628 + (((tickAnim - 16) / 7) * (-0.14276-(-0.1628)));
            zz = 1.99337 + (((tickAnim - 16) / 7) * (1.74803-(1.99337)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 6.09275 + (((tickAnim - 23) / 8) * (4.02384-(6.09275)));
            yy = -0.14276 + (((tickAnim - 23) / 8) * (-0.11772-(-0.14276)));
            zz = 1.74803 + (((tickAnim - 23) / 8) * (1.44136-(1.74803)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 4.02384 + (((tickAnim - 31) / 8) * (3.15677-(4.02384)));
            yy = -0.11772 + (((tickAnim - 31) / 8) * (-1.7031-(-0.11772)));
            zz = 1.44136 + (((tickAnim - 31) / 8) * (-5.96477-(1.44136)));
        }
        else if (tickAnim >= 39 && tickAnim < 47) {
            xx = 3.15677 + (((tickAnim - 39) / 8) * (3.38891-(3.15677)));
            yy = -1.7031 + (((tickAnim - 39) / 8) * (0.71117-(-1.7031)));
            zz = -5.96477 + (((tickAnim - 39) / 8) * (-4.51388-(-5.96477)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 3.38891 + (((tickAnim - 47) / 6) * (5.06-(3.38891)));
            yy = 0.71117 + (((tickAnim - 47) / 6) * (3.49-(0.71117)));
            zz = -4.51388 + (((tickAnim - 47) / 6) * (-0.89-(-4.51388)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 5.06 + (((tickAnim - 53) / 4) * (5.22364-(5.06)));
            yy = 3.49 + (((tickAnim - 53) / 4) * (1.16631-(3.49)));
            zz = -0.89 + (((tickAnim - 53) / 4) * (3.4756-(-0.89)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = 5.22364 + (((tickAnim - 57) / 5) * (2.65-(5.22364)));
            yy = 1.16631 + (((tickAnim - 57) / 5) * (0.71-(1.16631)));
            zz = 3.4756 + (((tickAnim - 57) / 5) * (4.43-(3.4756)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 2.65 + (((tickAnim - 62) / 1) * (0.25051-(2.65)));
            yy = 0.71 + (((tickAnim - 62) / 1) * (0.64103-(0.71)));
            zz = 4.43 + (((tickAnim - 62) / 1) * (4.235-(4.43)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = 0.25051 + (((tickAnim - 63) / 8) * (-5.17-(0.25051)));
            yy = 0.64103 + (((tickAnim - 63) / 8) * (0.45-(0.64103)));
            zz = 4.235 + (((tickAnim - 63) / 8) * (0.79-(4.235)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = -5.17 + (((tickAnim - 71) / 7) * (1.05-(-5.17)));
            yy = 0.45 + (((tickAnim - 71) / 7) * (0.29-(0.45)));
            zz = 0.79 + (((tickAnim - 71) / 7) * (0.29-(0.79)));
        }
        else if (tickAnim >= 78 && tickAnim < 84) {
            xx = 1.05 + (((tickAnim - 78) / 6) * (0.84-(1.05)));
            yy = 0.29 + (((tickAnim - 78) / 6) * (0.12-(0.29)));
            zz = 0.29 + (((tickAnim - 78) / 6) * (3.1-(0.29)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = 0.84 + (((tickAnim - 84) / 6) * (0-(0.84)));
            yy = 0.12 + (((tickAnim - 84) / 6) * (0-(0.12)));
            zz = 3.1 + (((tickAnim - 84) / 6) * (0-(3.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.19333-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.03083-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-1.99045-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -0.19333 + (((tickAnim - 9) / 11) * (-0.10763-(-0.19333)));
            yy = 0.03083 + (((tickAnim - 9) / 11) * (0.0498-(0.03083)));
            zz = -1.99045 + (((tickAnim - 9) / 11) * (-0.85227-(-1.99045)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -0.10763 + (((tickAnim - 20) / 6) * (2.18-(-0.10763)));
            yy = 0.0498 + (((tickAnim - 20) / 6) * (-0.09-(0.0498)));
            zz = -0.85227 + (((tickAnim - 20) / 6) * (-5.95-(-0.85227)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 2.18 + (((tickAnim - 26) / 7) * (4.92026-(2.18)));
            yy = -0.09 + (((tickAnim - 26) / 7) * (0.04101-(-0.09)));
            zz = -5.95 + (((tickAnim - 26) / 7) * (-0.59913-(-5.95)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 4.92026 + (((tickAnim - 33) / 8) * (5.38628-(4.92026)));
            yy = 0.04101 + (((tickAnim - 33) / 8) * (2.38926-(0.04101)));
            zz = -0.59913 + (((tickAnim - 33) / 8) * (4.45237-(-0.59913)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 5.38628 + (((tickAnim - 41) / 7) * (3.53-(5.38628)));
            yy = 2.38926 + (((tickAnim - 41) / 7) * (1.04-(2.38926)));
            zz = 4.45237 + (((tickAnim - 41) / 7) * (-2.92-(4.45237)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 3.53 + (((tickAnim - 48) / 4) * (2.85819-(3.53)));
            yy = 1.04 + (((tickAnim - 48) / 4) * (0.11499-(1.04)));
            zz = -2.92 + (((tickAnim - 48) / 4) * (-1.10732-(-2.92)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 2.85819 + (((tickAnim - 52) / 4) * (4.71-(2.85819)));
            yy = 0.11499 + (((tickAnim - 52) / 4) * (0.05-(0.11499)));
            zz = -1.10732 + (((tickAnim - 52) / 4) * (3.12-(-1.10732)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 4.71 + (((tickAnim - 56) / 5) * (6.33359-(4.71)));
            yy = 0.05 + (((tickAnim - 56) / 5) * (0.10285-(0.05)));
            zz = 3.12 + (((tickAnim - 56) / 5) * (-0.77614-(3.12)));
        }
        else if (tickAnim >= 61 && tickAnim < 69) {
            xx = 6.33359 + (((tickAnim - 61) / 8) * (-5.58-(6.33359)));
            yy = 0.10285 + (((tickAnim - 61) / 8) * (0.08-(0.10285)));
            zz = -0.77614 + (((tickAnim - 61) / 8) * (-0.87-(-0.77614)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = -5.58 + (((tickAnim - 69) / 4) * (-6.55-(-5.58)));
            yy = 0.08 + (((tickAnim - 69) / 4) * (0.07-(0.08)));
            zz = -0.87 + (((tickAnim - 69) / 4) * (-0.99-(-0.87)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = -6.55 + (((tickAnim - 73) / 3) * (-0.01-(-6.55)));
            yy = 0.07 + (((tickAnim - 73) / 3) * (0.06-(0.07)));
            zz = -0.99 + (((tickAnim - 73) / 3) * (-0.63-(-0.99)));
        }
        else if (tickAnim >= 76 && tickAnim < 79) {
            xx = -0.01 + (((tickAnim - 76) / 3) * (0.45-(-0.01)));
            yy = 0.06 + (((tickAnim - 76) / 3) * (0.05-(0.06)));
            zz = -0.63 + (((tickAnim - 76) / 3) * (4.43-(-0.63)));
        }
        else if (tickAnim >= 79 && tickAnim < 82) {
            xx = 0.45 + (((tickAnim - 79) / 3) * (0.18-(0.45)));
            yy = 0.05 + (((tickAnim - 79) / 3) * (0.04-(0.05)));
            zz = 4.43 + (((tickAnim - 79) / 3) * (3.13-(4.43)));
        }
        else if (tickAnim >= 82 && tickAnim < 85) {
            xx = 0.18 + (((tickAnim - 82) / 3) * (0.15-(0.18)));
            yy = 0.04 + (((tickAnim - 82) / 3) * (0.03-(0.04)));
            zz = 3.13 + (((tickAnim - 82) / 3) * (5.6-(3.13)));
        }
        else if (tickAnim >= 85 && tickAnim < 90) {
            xx = 0.15 + (((tickAnim - 85) / 5) * (0-(0.15)));
            yy = 0.03 + (((tickAnim - 85) / 5) * (0-(0.03)));
            zz = 5.6 + (((tickAnim - 85) / 5) * (0-(5.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 5 + (((tickAnim - 15) / 19) * (-3.28-(5)));
            yy = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 19) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 56) {
            xx = -3.28 + (((tickAnim - 34) / 22) * (-7.01-(-3.28)));
            yy = 0 + (((tickAnim - 34) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 22) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 69) {
            xx = -7.01 + (((tickAnim - 56) / 13) * (3.73-(-7.01)));
            yy = 0 + (((tickAnim - 56) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 13) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 78) {
            xx = 3.73 + (((tickAnim - 69) / 9) * (-9.66-(3.73)));
            yy = 0 + (((tickAnim - 69) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 9) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = -9.66 + (((tickAnim - 78) / 7) * (1.71-(-9.66)));
            yy = 0 + (((tickAnim - 78) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 7) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 90) {
            xx = 1.71 + (((tickAnim - 85) / 5) * (0-(1.71)));
            yy = 0 + (((tickAnim - 85) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 7 + (((tickAnim - 18) / 11) * (10.94-(7)));
            yy = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 49) {
            xx = 10.94 + (((tickAnim - 29) / 20) * (14.34-(10.94)));
            yy = 0 + (((tickAnim - 29) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 20) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 62) {
            xx = 14.34 + (((tickAnim - 49) / 13) * (3.95-(14.34)));
            yy = 0 + (((tickAnim - 49) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 13) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 69) {
            xx = 3.95 + (((tickAnim - 62) / 7) * (21.9-(3.95)));
            yy = 0 + (((tickAnim - 62) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 7) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = 21.9 + (((tickAnim - 69) / 6) * (4.77-(21.9)));
            yy = 0 + (((tickAnim - 69) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 6) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 4.77 + (((tickAnim - 75) / 8) * (20.38-(4.77)));
            yy = 0 + (((tickAnim - 75) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 8) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 20.38 + (((tickAnim - 83) / 7) * (0-(20.38)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.248-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.6324-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-4.95995-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 7.248 + (((tickAnim - 8) / 6) * (11.14-(7.248)));
            yy = 0.6324 + (((tickAnim - 8) / 6) * (0.62-(0.6324)));
            zz = -4.95995 + (((tickAnim - 8) / 6) * (-4.88-(-4.95995)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 11.14 + (((tickAnim - 14) / 11) * (20.76-(11.14)));
            yy = 0.62 + (((tickAnim - 14) / 11) * (0.53-(0.62)));
            zz = -4.88 + (((tickAnim - 14) / 11) * (-4.16-(-4.88)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 20.76 + (((tickAnim - 25) / 10) * (5.79-(20.76)));
            yy = 0.53 + (((tickAnim - 25) / 10) * (0.43-(0.53)));
            zz = -4.16 + (((tickAnim - 25) / 10) * (-3.39-(-4.16)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 5.79 + (((tickAnim - 35) / 8) * (16.23-(5.79)));
            yy = 0.43 + (((tickAnim - 35) / 8) * (0.37-(0.43)));
            zz = -3.39 + (((tickAnim - 35) / 8) * (-2.94-(-3.39)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 16.23 + (((tickAnim - 43) / 7) * (3.29-(16.23)));
            yy = 0.37 + (((tickAnim - 43) / 7) * (0.28-(0.37)));
            zz = -2.94 + (((tickAnim - 43) / 7) * (-2.24-(-2.94)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = 3.29 + (((tickAnim - 50) / 9) * (10.95-(3.29)));
            yy = 0.28 + (((tickAnim - 50) / 9) * (0.15-(0.28)));
            zz = -2.24 + (((tickAnim - 50) / 9) * (-1.19-(-2.24)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 10.95 + (((tickAnim - 59) / 10) * (-1.61-(10.95)));
            yy = 0.15 + (((tickAnim - 59) / 10) * (0.1-(0.15)));
            zz = -1.19 + (((tickAnim - 59) / 10) * (-0.77-(-1.19)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = -1.61 + (((tickAnim - 69) / 6) * (-6.14-(-1.61)));
            yy = 0.1 + (((tickAnim - 69) / 6) * (0.07-(0.1)));
            zz = -0.77 + (((tickAnim - 69) / 6) * (-0.56-(-0.77)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -6.14 + (((tickAnim - 75) / 5) * (0.34-(-6.14)));
            yy = 0.07 + (((tickAnim - 75) / 5) * (0.05-(0.07)));
            zz = -0.56 + (((tickAnim - 75) / 5) * (-0.38-(-0.56)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0.34 + (((tickAnim - 80) / 10) * (0-(0.34)));
            yy = 0.05 + (((tickAnim - 80) / 10) * (0-(0.05)));
            zz = -0.38 + (((tickAnim - 80) / 10) * (0-(-0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 7) / 11) * (-19.34-(-10)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -19.34 + (((tickAnim - 18) / 7) * (15.59-(-19.34)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 5 + (((tickAnim - 18) / 7) * (0-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 15.59 + (((tickAnim - 25) / 8) * (-4-(15.59)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (-7.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -4 + (((tickAnim - 33) / 8) * (4.63484-(-4)));
            yy = 0 + (((tickAnim - 33) / 8) * (1.79573-(0)));
            zz = -7.5 + (((tickAnim - 33) / 8) * (11.83009-(-7.5)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 4.63484 + (((tickAnim - 41) / 3) * (12.88-(4.63484)));
            yy = 1.79573 + (((tickAnim - 41) / 3) * (1.85-(1.79573)));
            zz = 11.83009 + (((tickAnim - 41) / 3) * (5.44-(11.83009)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 12.88 + (((tickAnim - 44) / 4) * (0.27-(12.88)));
            yy = 1.85 + (((tickAnim - 44) / 4) * (1.54-(1.85)));
            zz = 5.44 + (((tickAnim - 44) / 4) * (10.71-(5.44)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0.27 + (((tickAnim - 48) / 10) * (18.86-(0.27)));
            yy = 1.54 + (((tickAnim - 48) / 10) * (0.83-(1.54)));
            zz = 10.71 + (((tickAnim - 48) / 10) * (5.79-(10.71)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 18.86 + (((tickAnim - 58) / 5) * (-3.67-(18.86)));
            yy = 0.83 + (((tickAnim - 58) / 5) * (0.48-(0.83)));
            zz = 5.79 + (((tickAnim - 58) / 5) * (3.37-(5.79)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = -3.67 + (((tickAnim - 63) / 5) * (1.19-(-3.67)));
            yy = 0.48 + (((tickAnim - 63) / 5) * (0.37-(0.48)));
            zz = 3.37 + (((tickAnim - 63) / 5) * (2.61-(3.37)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 1.19 + (((tickAnim - 68) / 5) * (3.39-(1.19)));
            yy = 0.37 + (((tickAnim - 68) / 5) * (0.29-(0.37)));
            zz = 2.61 + (((tickAnim - 68) / 5) * (2.07-(2.61)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 3.39 + (((tickAnim - 73) / 5) * (-4.64-(3.39)));
            yy = 0.29 + (((tickAnim - 73) / 5) * (0.2-(0.29)));
            zz = 2.07 + (((tickAnim - 73) / 5) * (1.42-(2.07)));
        }
        else if (tickAnim >= 78 && tickAnim < 84) {
            xx = -4.64 + (((tickAnim - 78) / 6) * (8.03-(-4.64)));
            yy = 0.2 + (((tickAnim - 78) / 6) * (0.1-(0.2)));
            zz = 1.42 + (((tickAnim - 78) / 6) * (0.71-(1.42)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = 8.03 + (((tickAnim - 84) / 6) * (0-(8.03)));
            yy = 0.1 + (((tickAnim - 84) / 6) * (0-(0.1)));
            zz = 0.71 + (((tickAnim - 84) / 6) * (0-(0.71)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.94289-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.51056-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.04827-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -10.94289 + (((tickAnim - 8) / 6) * (9.08-(-10.94289)));
            yy = 0.51056 + (((tickAnim - 8) / 6) * (0.5-(0.51056)));
            zz = -1.04827 + (((tickAnim - 8) / 6) * (-1.03-(-1.04827)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 9.08 + (((tickAnim - 14) / 7) * (8.28-(9.08)));
            yy = 0.5 + (((tickAnim - 14) / 7) * (0.41-(0.5)));
            zz = -1.03 + (((tickAnim - 14) / 7) * (-0.84-(-1.03)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 8.28 + (((tickAnim - 21) / 4) * (2.69-(8.28)));
            yy = 0.41 + (((tickAnim - 21) / 4) * (0.66-(0.41)));
            zz = -0.84 + (((tickAnim - 21) / 4) * (-1.32-(-0.84)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 2.69 + (((tickAnim - 25) / 3) * (-7.84-(2.69)));
            yy = 0.66 + (((tickAnim - 25) / 3) * (0.35-(0.66)));
            zz = -1.32 + (((tickAnim - 25) / 3) * (-0.73-(-1.32)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -7.84 + (((tickAnim - 28) / 8) * (-7.7-(-7.84)));
            yy = 0.35 + (((tickAnim - 28) / 8) * (-3.71-(0.35)));
            zz = -0.73 + (((tickAnim - 28) / 8) * (6.89-(-0.73)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = -7.7 + (((tickAnim - 36) / 8) * (9.82-(-7.7)));
            yy = -3.71 + (((tickAnim - 36) / 8) * (-3.26-(-3.71)));
            zz = 6.89 + (((tickAnim - 36) / 8) * (6.07-(6.89)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 9.82 + (((tickAnim - 44) / 6) * (0.36-(9.82)));
            yy = -3.26 + (((tickAnim - 44) / 6) * (6.35-(-3.26)));
            zz = 6.07 + (((tickAnim - 44) / 6) * (-5.07-(6.07)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0.36 + (((tickAnim - 50) / 7) * (5.29-(0.36)));
            yy = 6.35 + (((tickAnim - 50) / 7) * (5.18-(6.35)));
            zz = -5.07 + (((tickAnim - 50) / 7) * (-4.39-(-5.07)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 5.29 + (((tickAnim - 57) / 3) * (9.18-(5.29)));
            yy = 5.18 + (((tickAnim - 57) / 3) * (3.9-(5.18)));
            zz = -4.39 + (((tickAnim - 57) / 3) * (-6.25-(-4.39)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 9.18 + (((tickAnim - 60) / 4) * (2.5-(9.18)));
            yy = 3.9 + (((tickAnim - 60) / 4) * (2.12-(3.9)));
            zz = -6.25 + (((tickAnim - 60) / 4) * (-7.82-(-6.25)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 2.5 + (((tickAnim - 64) / 6) * (0.21-(2.5)));
            yy = 2.12 + (((tickAnim - 64) / 6) * (1.62-(2.12)));
            zz = -7.82 + (((tickAnim - 64) / 6) * (-6.54-(-7.82)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = 0.21 + (((tickAnim - 70) / 4) * (10.09-(0.21)));
            yy = 1.62 + (((tickAnim - 70) / 4) * (1.29-(1.62)));
            zz = -6.54 + (((tickAnim - 70) / 4) * (-5.5-(-6.54)));
        }
        else if (tickAnim >= 74 && tickAnim < 78) {
            xx = 10.09 + (((tickAnim - 74) / 4) * (5.05-(10.09)));
            yy = 1.29 + (((tickAnim - 74) / 4) * (1.02-(1.29)));
            zz = -5.5 + (((tickAnim - 74) / 4) * (-4.19-(-5.5)));
        }
        else if (tickAnim >= 78 && tickAnim < 84) {
            xx = 5.05 + (((tickAnim - 78) / 6) * (-6.77-(5.05)));
            yy = 1.02 + (((tickAnim - 78) / 6) * (0.43-(1.02)));
            zz = -4.19 + (((tickAnim - 78) / 6) * (1.22-(-4.19)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = -6.77 + (((tickAnim - 84) / 6) * (0-(-6.77)));
            yy = 0.43 + (((tickAnim - 84) / 6) * (0-(0.43)));
            zz = 1.22 + (((tickAnim - 84) / 6) * (0-(1.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 17 + (((tickAnim - 9) / 11) * (7.8-(17)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 7.8 + (((tickAnim - 20) / 5) * (-24.26-(7.8)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.15-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -24.26 + (((tickAnim - 25) / 3) * (-10.52-(-24.26)));
            yy = 0.15 + (((tickAnim - 25) / 3) * (0-(0.15)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -10.52 + (((tickAnim - 28) / 5) * (7.46-(-10.52)));
            yy = 0 + (((tickAnim - 28) / 5) * (-2-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 7.46 + (((tickAnim - 33) / 7) * (9.48-(7.46)));
            yy = -2 + (((tickAnim - 33) / 7) * (-12.82-(-2)));
            zz = 0 + (((tickAnim - 33) / 7) * (-16-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 9.48 + (((tickAnim - 40) / 4) * (-10.97-(9.48)));
            yy = -12.82 + (((tickAnim - 40) / 4) * (-12.6-(-12.82)));
            zz = -16 + (((tickAnim - 40) / 4) * (-5.11-(-16)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -10.97 + (((tickAnim - 44) / 4) * (-1.3-(-10.97)));
            yy = -12.6 + (((tickAnim - 44) / 4) * (-10.98-(-12.6)));
            zz = -5.11 + (((tickAnim - 44) / 4) * (-3.87-(-5.11)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -1.3 + (((tickAnim - 48) / 7) * (-9.71-(-1.3)));
            yy = -10.98 + (((tickAnim - 48) / 7) * (-7.59-(-10.98)));
            zz = -3.87 + (((tickAnim - 48) / 7) * (-1.82-(-3.87)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = -9.71 + (((tickAnim - 55) / 4) * (-25.15-(-9.71)));
            yy = -7.59 + (((tickAnim - 55) / 4) * (-5.24-(-7.59)));
            zz = -1.82 + (((tickAnim - 55) / 4) * (-5.14-(-1.82)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -25.15 + (((tickAnim - 59) / 10) * (22.14-(-25.15)));
            yy = -5.24 + (((tickAnim - 59) / 10) * (-2.94-(-5.24)));
            zz = -5.14 + (((tickAnim - 59) / 10) * (-5.75-(-5.14)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = 22.14 + (((tickAnim - 69) / 6) * (17.81-(22.14)));
            yy = -2.94 + (((tickAnim - 69) / 6) * (-2.16-(-2.94)));
            zz = -5.75 + (((tickAnim - 69) / 6) * (-9.31-(-5.75)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
            xx = 17.81 + (((tickAnim - 75) / 4) * (13.34-(17.81)));
            yy = -2.16 + (((tickAnim - 75) / 4) * (-1.6-(-2.16)));
            zz = -9.31 + (((tickAnim - 75) / 4) * (3.6-(-9.31)));
        }
        else if (tickAnim >= 79 && tickAnim < 84) {
            xx = 13.34 + (((tickAnim - 79) / 5) * (-3.99-(13.34)));
            yy = -1.6 + (((tickAnim - 79) / 5) * (-0.84-(-1.6)));
            zz = 3.6 + (((tickAnim - 79) / 5) * (-4.16-(3.6)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = -3.99 + (((tickAnim - 84) / 6) * (0-(-3.99)));
            yy = -0.84 + (((tickAnim - 84) / 6) * (0-(-0.84)));
            zz = -4.16 + (((tickAnim - 84) / 6) * (0-(-4.16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 12) / 11) * (-14.38-(5)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (-8-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -14.38 + (((tickAnim - 23) / 7) * (-0.9-(-14.38)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -8 + (((tickAnim - 23) / 7) * (0.42-(-8)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -0.9 + (((tickAnim - 30) / 7) * (-0.05-(-0.9)));
            yy = 0 + (((tickAnim - 30) / 7) * (-5-(0)));
            zz = 0.42 + (((tickAnim - 30) / 7) * (0.84-(0.42)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -0.05 + (((tickAnim - 37) / 7) * (-19.48-(-0.05)));
            yy = -5 + (((tickAnim - 37) / 7) * (-4.47-(-5)));
            zz = 0.84 + (((tickAnim - 37) / 7) * (0.72-(0.84)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -19.48 + (((tickAnim - 44) / 6) * (7.24-(-19.48)));
            yy = -4.47 + (((tickAnim - 44) / 6) * (-9.64-(-4.47)));
            zz = 0.72 + (((tickAnim - 44) / 6) * (0.58-(0.72)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 7.24 + (((tickAnim - 50) / 7) * (4.78-(7.24)));
            yy = -9.64 + (((tickAnim - 50) / 7) * (-7.17-(-9.64)));
            zz = 0.58 + (((tickAnim - 50) / 7) * (0.4-(0.58)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 4.78 + (((tickAnim - 57) / 2) * (-16.77-(4.78)));
            yy = -7.17 + (((tickAnim - 57) / 2) * (-3.21-(-7.17)));
            zz = 0.4 + (((tickAnim - 57) / 2) * (7.93-(0.4)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = -16.77 + (((tickAnim - 59) / 9) * (-9.35-(-16.77)));
            yy = -3.21 + (((tickAnim - 59) / 9) * (0.93-(-3.21)));
            zz = 7.93 + (((tickAnim - 59) / 9) * (13.41-(7.93)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = -9.35 + (((tickAnim - 68) / 8) * (-2.87-(-9.35)));
            yy = 0.93 + (((tickAnim - 68) / 8) * (4.67-(0.93)));
            zz = 13.41 + (((tickAnim - 68) / 8) * (9.1-(13.41)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = -2.87 + (((tickAnim - 76) / 7) * (-6.95-(-2.87)));
            yy = 4.67 + (((tickAnim - 76) / 7) * (2.38-(4.67)));
            zz = 9.1 + (((tickAnim - 76) / 7) * (3.96-(9.1)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -6.95 + (((tickAnim - 83) / 7) * (0-(-6.95)));
            yy = 2.38 + (((tickAnim - 83) / 7) * (0-(2.38)));
            zz = 3.96 + (((tickAnim - 83) / 7) * (0-(3.96)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 12) / 4) * (0-(15)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (22.5-(0)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 22.5 + (((tickAnim - 26) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (17.5-(0)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 17.5 + (((tickAnim - 44) / 4) * (0-(17.5)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 55) / 4) * (17.5-(0)));
            yy = 0 + (((tickAnim - 55) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 4) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 17.5 + (((tickAnim - 59) / 4) * (0-(17.5)));
            yy = 0 + (((tickAnim - 59) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 4) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 16) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 79) / 4) * (17.5-(0)));
            yy = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 87) {
            xx = 17.5 + (((tickAnim - 83) / 4) * (0-(17.5)));
            yy = 0 + (((tickAnim - 83) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraValdosaurus entity = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;
        int animCycle = 90;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 5 + (((tickAnim - 6) / 6) * (12.5-(5)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 12.5 + (((tickAnim - 12) / 5) * (12.48848-(12.5)));
            yy = 0 + (((tickAnim - 12) / 5) * (-0.54094-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (2.44081-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 12.48848 + (((tickAnim - 17) / 5) * (14.61853-(12.48848)));
            yy = -0.54094 + (((tickAnim - 17) / 5) * (1.06505-(-0.54094)));
            zz = 2.44081 + (((tickAnim - 17) / 5) * (7.54648-(2.44081)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 14.61853 + (((tickAnim - 22) / 9) * (20.39914-(14.61853)));
            yy = 1.06505 + (((tickAnim - 22) / 9) * (1.74611-(1.06505)));
            zz = 7.54648 + (((tickAnim - 22) / 9) * (10.57134-(7.54648)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 20.39914 + (((tickAnim - 31) / 5) * (20.45272-(20.39914)));
            yy = 1.74611 + (((tickAnim - 31) / 5) * (0.8735-(1.74611)));
            zz = 10.57134 + (((tickAnim - 31) / 5) * (12.91474-(10.57134)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 20.45272 + (((tickAnim - 36) / 3) * (20.49759-(20.45272)));
            yy = 0.8735 + (((tickAnim - 36) / 3) * (-3.81099-(0.8735)));
            zz = 12.91474 + (((tickAnim - 36) / 3) * (11.16565-(12.91474)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 20.49759 + (((tickAnim - 39) / 7) * (15.49759-(20.49759)));
            yy = -3.81099 + (((tickAnim - 39) / 7) * (-3.81099-(-3.81099)));
            zz = 11.16565 + (((tickAnim - 39) / 7) * (11.16565-(11.16565)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 15.49759 + (((tickAnim - 46) / 3) * (15.21184-(15.49759)));
            yy = -3.81099 + (((tickAnim - 46) / 3) * (2.99436-(-3.81099)));
            zz = 11.16565 + (((tickAnim - 46) / 3) * (5.26336-(11.16565)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = 15.21184 + (((tickAnim - 49) / 6) * (12.84724-(15.21184)));
            yy = 2.99436 + (((tickAnim - 49) / 6) * (11.49073-(2.99436)));
            zz = 5.26336 + (((tickAnim - 49) / 6) * (-8.17019-(5.26336)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 12.84724 + (((tickAnim - 55) / 8) * (20.34724-(12.84724)));
            yy = 11.49073 + (((tickAnim - 55) / 8) * (11.49073-(11.49073)));
            zz = -8.17019 + (((tickAnim - 55) / 8) * (-8.17019-(-8.17019)));
        }
        else if (tickAnim >= 63 && tickAnim < 83) {
            xx = 20.34724 + (((tickAnim - 63) / 20) * (-6.64616-(20.34724)));
            yy = 11.49073 + (((tickAnim - 63) / 20) * (4.64255-(11.49073)));
            zz = -8.17019 + (((tickAnim - 63) / 20) * (-2.25803-(-8.17019)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -6.64616 + (((tickAnim - 83) / 7) * (0-(-6.64616)));
            yy = 4.64255 + (((tickAnim - 83) / 7) * (0-(4.64255)));
            zz = -2.25803 + (((tickAnim - 83) / 7) * (0-(-2.25803)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0.65-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 22) / 41) * (0-(0)));
            yy = -0.25 + (((tickAnim - 22) / 41) * (-0.25-(-0.25)));
            zz = 0.65 + (((tickAnim - 22) / 41) * (0.65-(0.65)));
        }
        else if (tickAnim >= 63 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 63) / 27) * (0-(0)));
            yy = -0.25 + (((tickAnim - 63) / 27) * (0-(-0.25)));
            zz = 0.65 + (((tickAnim - 63) / 27) * (0-(0.65)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 5 + (((tickAnim - 5) / 4) * (7.5-(5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 9) / 6) * (10-(7.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 10 + (((tickAnim - 15) / 7) * (9.9359-(10)));
            yy = 0 + (((tickAnim - 15) / 7) * (-1.54331-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (4.75643-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 9.9359 + (((tickAnim - 22) / 5) * (7.4359-(9.9359)));
            yy = -1.54331 + (((tickAnim - 22) / 5) * (-1.54331-(-1.54331)));
            zz = 4.75643 + (((tickAnim - 22) / 5) * (4.75643-(4.75643)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 7.4359 + (((tickAnim - 27) / 4) * (7.25011-(7.4359)));
            yy = -1.54331 + (((tickAnim - 27) / 4) * (-2.86708-(-1.54331)));
            zz = 4.75643 + (((tickAnim - 27) / 4) * (9.5817-(4.75643)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 7.25011 + (((tickAnim - 31) / 5) * (12.25011-(7.25011)));
            yy = -2.86708 + (((tickAnim - 31) / 5) * (-2.86708-(-2.86708)));
            zz = 9.5817 + (((tickAnim - 31) / 5) * (9.5817-(9.5817)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 12.25011 + (((tickAnim - 36) / 3) * (-6.9414+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-20-(12.25011)));
            yy = -2.86708 + (((tickAnim - 36) / 3) * (-7.556-(-2.86708)));
            zz = 9.5817 + (((tickAnim - 36) / 3) * (7.83789-(9.5817)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -6.9414+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-20 + (((tickAnim - 39) / 3) * (-9.1164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15-(-6.9414+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-20)));
            yy = -7.556 + (((tickAnim - 39) / 3) * (-7.556-(-7.556)));
            zz = 7.83789 + (((tickAnim - 39) / 3) * (7.83789-(7.83789)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = -9.1164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15 + (((tickAnim - 42) / 10) * (10.10332-(-9.1164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15)));
            yy = -7.556 + (((tickAnim - 42) / 10) * (-8.66861-(-7.556)));
            zz = 7.83789 + (((tickAnim - 42) / 10) * (4.95241-(7.83789)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 10.10332 + (((tickAnim - 52) / 3) * (13.86631-(10.10332)));
            yy = -8.66861 + (((tickAnim - 52) / 3) * (-10.92507-(-8.66861)));
            zz = 4.95241 + (((tickAnim - 52) / 3) * (12.21142-(4.95241)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 13.86631 + (((tickAnim - 55) / 5) * (2.86631-(13.86631)));
            yy = -10.92507 + (((tickAnim - 55) / 5) * (-10.92507-(-10.92507)));
            zz = 12.21142 + (((tickAnim - 55) / 5) * (12.21142-(12.21142)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = 2.86631 + (((tickAnim - 60) / 6) * (2.11631-(2.86631)));
            yy = -10.92507 + (((tickAnim - 60) / 6) * (-10.92507-(-10.92507)));
            zz = 12.21142 + (((tickAnim - 60) / 6) * (12.21142-(12.21142)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 2.11631 + (((tickAnim - 66) / 6) * (1.61631-(2.11631)));
            yy = -10.92507 + (((tickAnim - 66) / 6) * (-10.92507-(-10.92507)));
            zz = 12.21142 + (((tickAnim - 66) / 6) * (12.21142-(12.21142)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 1.61631 + (((tickAnim - 72) / 8) * (2.89877-(1.61631)));
            yy = -10.92507 + (((tickAnim - 72) / 8) * (-12.16741-(-10.92507)));
            zz = 12.21142 + (((tickAnim - 72) / 8) * (2.08319-(12.21142)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 2.89877 + (((tickAnim - 80) / 10) * (0-(2.89877)));
            yy = -12.16741 + (((tickAnim - 80) / 10) * (0-(-12.16741)));
            zz = 2.08319 + (((tickAnim - 80) / 10) * (0-(2.08319)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0.975-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 22) / 41) * (0-(0)));
            yy = -0.5 + (((tickAnim - 22) / 41) * (-0.5-(-0.5)));
            zz = 0.975 + (((tickAnim - 22) / 41) * (0.975-(0.975)));
        }
        else if (tickAnim >= 63 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 63) / 27) * (0-(0)));
            yy = -0.5 + (((tickAnim - 63) / 27) * (0-(-0.5)));
            zz = 0.975 + (((tickAnim - 63) / 27) * (0-(0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 3) / 5) * (22.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 8) / 5) * (27.5-(22.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 27.5 + (((tickAnim - 13) / 10) * (26.40319-(27.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (7.98133-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-15.62489-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 26.40319 + (((tickAnim - 23) / 5) * (39.19458-(26.40319)));
            yy = 7.98133 + (((tickAnim - 23) / 5) * (6.86379-(7.98133)));
            zz = -15.62489 + (((tickAnim - 23) / 5) * (-13.36965-(-15.62489)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 39.19458 + (((tickAnim - 28) / 6) * (49.19458-(39.19458)));
            yy = 6.86379 + (((tickAnim - 28) / 6) * (6.86379-(6.86379)));
            zz = -13.36965 + (((tickAnim - 28) / 6) * (-13.36965-(-13.36965)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 49.19458 + (((tickAnim - 34) / 4) * (41.93824-(49.19458)));
            yy = 6.86379 + (((tickAnim - 34) / 4) * (0.41138-(6.86379)));
            zz = -13.36965 + (((tickAnim - 34) / 4) * (-9.53672-(-13.36965)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 41.93824 + (((tickAnim - 38) / 7) * (39.40521-(41.93824)));
            yy = 0.41138 + (((tickAnim - 38) / 7) * (2.56381-(0.41138)));
            zz = -9.53672 + (((tickAnim - 38) / 7) * (-10.80886-(-9.53672)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 39.40521 + (((tickAnim - 45) / 8) * (38.75508-(39.40521)));
            yy = 2.56381 + (((tickAnim - 45) / 8) * (11.16622-(2.56381)));
            zz = -10.80886 + (((tickAnim - 45) / 8) * (-13.49638-(-10.80886)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 38.75508 + (((tickAnim - 53) / 7) * (21.25508-(38.75508)));
            yy = 11.16622 + (((tickAnim - 53) / 7) * (11.16622-(11.16622)));
            zz = -13.49638 + (((tickAnim - 53) / 7) * (-13.49638-(-13.49638)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 21.25508 + (((tickAnim - 60) / 7) * (8.75508-(21.25508)));
            yy = 11.16622 + (((tickAnim - 60) / 7) * (11.16622-(11.16622)));
            zz = -13.49638 + (((tickAnim - 60) / 7) * (-13.49638-(-13.49638)));
        }
        else if (tickAnim >= 67 && tickAnim < 76) {
            xx = 8.75508 + (((tickAnim - 67) / 9) * (1.53729-(8.75508)));
            yy = 11.16622 + (((tickAnim - 67) / 9) * (9.81269-(11.16622)));
            zz = -13.49638 + (((tickAnim - 67) / 9) * (1.6982-(-13.49638)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = 1.53729 + (((tickAnim - 76) / 8) * (11.76423-(1.53729)));
            yy = 9.81269 + (((tickAnim - 76) / 8) * (3.7633-(9.81269)));
            zz = 1.6982 + (((tickAnim - 76) / 8) * (1.42068-(1.6982)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = 11.76423 + (((tickAnim - 84) / 6) * (2.5-(11.76423)));
            yy = 3.7633 + (((tickAnim - 84) / 6) * (0-(3.7633)));
            zz = 1.42068 + (((tickAnim - 84) / 6) * (0-(1.42068)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -12.5 + (((tickAnim - 9) / 4) * (-22.95783-(-12.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (-0.06261-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-0.17208-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -22.95783 + (((tickAnim - 13) / 3) * (-20-(-22.95783)));
            yy = -0.06261 + (((tickAnim - 13) / 3) * (0-(-0.06261)));
            zz = -0.17208 + (((tickAnim - 13) / 3) * (0-(-0.17208)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 16) / 4) * (-19.98247-(-20)));
            yy = 0 + (((tickAnim - 16) / 4) * (0.85481-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (2.34941-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -19.98247 + (((tickAnim - 20) / 5) * (-24.98247-(-19.98247)));
            yy = 0.85481 + (((tickAnim - 20) / 5) * (0.85481-(0.85481)));
            zz = 2.34941 + (((tickAnim - 20) / 5) * (2.34941-(2.34941)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -24.98247 + (((tickAnim - 25) / 5) * (-9.98247-(-24.98247)));
            yy = 0.85481 + (((tickAnim - 25) / 5) * (0.85481-(0.85481)));
            zz = 2.34941 + (((tickAnim - 25) / 5) * (2.34941-(2.34941)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -9.98247 + (((tickAnim - 30) / 5) * (-17.48247-(-9.98247)));
            yy = 0.85481 + (((tickAnim - 30) / 5) * (0.85481-(0.85481)));
            zz = 2.34941 + (((tickAnim - 30) / 5) * (2.34941-(2.34941)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -17.48247 + (((tickAnim - 35) / 3) * (-0.09004-(-17.48247)));
            yy = 0.85481 + (((tickAnim - 35) / 3) * (-6.29757-(0.85481)));
            zz = 2.34941 + (((tickAnim - 35) / 3) * (4.61031-(2.34941)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -0.09004 + (((tickAnim - 38) / 8) * (-16.93587-(-0.09004)));
            yy = -6.29757 + (((tickAnim - 38) / 8) * (-13.29574-(-6.29757)));
            zz = 4.61031 + (((tickAnim - 38) / 8) * (-1.1461-(4.61031)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = -16.93587 + (((tickAnim - 46) / 8) * (12.40864-(-16.93587)));
            yy = -13.29574 + (((tickAnim - 46) / 8) * (-15.36774-(-13.29574)));
            zz = -1.1461 + (((tickAnim - 46) / 8) * (-8.58655-(-1.1461)));
        }
        else if (tickAnim >= 54 && tickAnim < 59) {
            xx = 12.40864 + (((tickAnim - 54) / 5) * (9.51633-(12.40864)));
            yy = -15.36774 + (((tickAnim - 54) / 5) * (-5.59288-(-15.36774)));
            zz = -8.58655 + (((tickAnim - 54) / 5) * (-6.43788-(-8.58655)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 9.51633 + (((tickAnim - 59) / 4) * (4.51633-(9.51633)));
            yy = -5.59288 + (((tickAnim - 59) / 4) * (-5.59288-(-5.59288)));
            zz = -6.43788 + (((tickAnim - 59) / 4) * (-6.43788-(-6.43788)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 4.51633 + (((tickAnim - 63) / 5) * (9.51633-(4.51633)));
            yy = -5.59288 + (((tickAnim - 63) / 5) * (-5.59288-(-5.59288)));
            zz = -6.43788 + (((tickAnim - 63) / 5) * (-6.43788-(-6.43788)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 9.51633 + (((tickAnim - 68) / 5) * (29.51633-(9.51633)));
            yy = -5.59288 + (((tickAnim - 68) / 5) * (-5.59288-(-5.59288)));
            zz = -6.43788 + (((tickAnim - 68) / 5) * (-6.43788-(-6.43788)));
        }
        else if (tickAnim >= 73 && tickAnim < 90) {
            xx = 29.51633 + (((tickAnim - 73) / 17) * (0-(29.51633)));
            yy = -5.59288 + (((tickAnim - 73) / 17) * (0-(-5.59288)));
            zz = -6.43788 + (((tickAnim - 73) / 17) * (0-(-6.43788)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.5 + (((tickAnim - 11) / 2) * (-17.5-(-12.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -17.5 + (((tickAnim - 13) / 5) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (7.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 7.5 + (((tickAnim - 20) / 4) * (7.5-(7.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 24) / 6) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 7.5 + (((tickAnim - 24) / 6) * (7.5-(7.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 7.5 + (((tickAnim - 30) / 5) * (7.5-(7.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 5 + (((tickAnim - 35) / 3) * (-18.36433-(5)));
            yy = 0 + (((tickAnim - 35) / 3) * (-13.76609-(0)));
            zz = 7.5 + (((tickAnim - 35) / 3) * (4.87968-(7.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -18.36433 + (((tickAnim - 38) / 5) * (-7.4267-(-18.36433)));
            yy = -13.76609 + (((tickAnim - 38) / 5) * (-21.37962-(-13.76609)));
            zz = 4.87968 + (((tickAnim - 38) / 5) * (-8.11959-(4.87968)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -7.4267 + (((tickAnim - 43) / 2) * (-5.86433-(-7.4267)));
            yy = -21.37962 + (((tickAnim - 43) / 2) * (-13.76609-(-21.37962)));
            zz = -8.11959 + (((tickAnim - 43) / 2) * (4.87968-(-8.11959)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -5.86433 + (((tickAnim - 45) / 6) * (-7.53711-(-5.86433)));
            yy = -13.76609 + (((tickAnim - 45) / 6) * (35.75762-(-13.76609)));
            zz = 4.87968 + (((tickAnim - 45) / 6) * (6.27317-(4.87968)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = -7.53711 + (((tickAnim - 51) / 3) * (2.14259-(-7.53711)));
            yy = 35.75762 + (((tickAnim - 51) / 3) * (38.6757-(35.75762)));
            zz = 6.27317 + (((tickAnim - 51) / 3) * (5.25246-(6.27317)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 2.14259 + (((tickAnim - 54) / 4) * (-11.4571-(2.14259)));
            yy = 38.6757 + (((tickAnim - 54) / 4) * (15.33121-(38.6757)));
            zz = 5.25246 + (((tickAnim - 54) / 4) * (-18.96587-(5.25246)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -11.4571 + (((tickAnim - 58) / 5) * (-21.4571-(-11.4571)));
            yy = 15.33121 + (((tickAnim - 58) / 5) * (15.33121-(15.33121)));
            zz = -18.96587 + (((tickAnim - 58) / 5) * (-18.96587-(-18.96587)));
        }
        else if (tickAnim >= 63 && tickAnim < 69) {
            xx = -21.4571 + (((tickAnim - 63) / 6) * (11.0429-(-21.4571)));
            yy = 15.33121 + (((tickAnim - 63) / 6) * (15.33121-(15.33121)));
            zz = -18.96587 + (((tickAnim - 63) / 6) * (-18.96587-(-18.96587)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = 11.0429 + (((tickAnim - 69) / 5) * (-8.72717-(11.0429)));
            yy = 15.33121 + (((tickAnim - 69) / 5) * (0.6202-(15.33121)));
            zz = -18.96587 + (((tickAnim - 69) / 5) * (-14.0653-(-18.96587)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -8.72717 + (((tickAnim - 74) / 6) * (-8.00122-(-8.72717)));
            yy = 0.6202 + (((tickAnim - 74) / 6) * (-7.49877-(0.6202)));
            zz = -14.0653 + (((tickAnim - 74) / 6) * (5.77846-(-14.0653)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -8.00122 + (((tickAnim - 80) / 10) * (0-(-8.00122)));
            yy = -7.49877 + (((tickAnim - 80) / 10) * (0-(-7.49877)));
            zz = 5.77846 + (((tickAnim - 80) / 10) * (0-(5.77846)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (10-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 10 + (((tickAnim - 14) / 7) * (9.6658-(10)));
            yy = 0 + (((tickAnim - 14) / 7) * (-2.57594-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (14.78217-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 9.6658 + (((tickAnim - 21) / 3) * (9.6658-(9.6658)));
            yy = -2.57594 + (((tickAnim - 21) / 3) * (-2.57594-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 21) / 3) * (14.78217-(14.78217)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 9.6658 + (((tickAnim - 24) / 4) * (15.51276-(9.6658)));
            yy = -2.57594 + (((tickAnim - 24) / 4) * (2.24209-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 24) / 4) * (16.11921-(14.78217)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 15.51276 + (((tickAnim - 28) / 5) * (-5.3342-(15.51276)));
            yy = 2.24209 + (((tickAnim - 28) / 5) * (-2.57594-(2.24209)));
            zz = 16.11921 + (((tickAnim - 28) / 5) * (14.78217-(16.11921)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -5.3342 + (((tickAnim - 33) / 5) * (-30.3342-(-5.3342)));
            yy = -2.57594 + (((tickAnim - 33) / 5) * (-2.57594-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 33) / 5) * (14.78217-(14.78217)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -30.3342 + (((tickAnim - 38) / 8) * (-10.3342-(-30.3342)));
            yy = -2.57594 + (((tickAnim - 38) / 8) * (-2.57594-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 38) / 8) * (14.78217-(14.78217)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = -10.3342 + (((tickAnim - 46) / 5) * (-2.8342-(-10.3342)));
            yy = -2.57594 + (((tickAnim - 46) / 5) * (-2.57594-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 46) / 5) * (14.78217-(14.78217)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -2.8342 + (((tickAnim - 51) / 4) * (-17.8342-(-2.8342)));
            yy = -2.57594 + (((tickAnim - 51) / 4) * (-2.57594-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 51) / 4) * (14.78217-(14.78217)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = -17.8342 + (((tickAnim - 55) / 7) * (-37.8342-(-17.8342)));
            yy = -2.57594 + (((tickAnim - 55) / 7) * (-2.57594-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 55) / 7) * (14.78217-(14.78217)));
        }
        else if (tickAnim >= 62 && tickAnim < 66) {
            xx = -37.8342 + (((tickAnim - 62) / 4) * (-42.8342-(-37.8342)));
            yy = -2.57594 + (((tickAnim - 62) / 4) * (-2.57594-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 62) / 4) * (14.78217-(14.78217)));
        }
        else if (tickAnim >= 66 && tickAnim < 69) {
            xx = -42.8342 + (((tickAnim - 66) / 3) * (-25.3342-(-42.8342)));
            yy = -2.57594 + (((tickAnim - 66) / 3) * (-2.57594-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 66) / 3) * (14.78217-(14.78217)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = -25.3342 + (((tickAnim - 69) / 6) * (-35.3342-(-25.3342)));
            yy = -2.57594 + (((tickAnim - 69) / 6) * (-2.57594-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 69) / 6) * (14.78217-(14.78217)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -35.3342 + (((tickAnim - 75) / 3) * (-40.26095-(-35.3342)));
            yy = -2.57594 + (((tickAnim - 75) / 3) * (-1.71854-(-2.57594)));
            zz = 14.78217 + (((tickAnim - 75) / 3) * (15.13011-(14.78217)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = -40.26095 + (((tickAnim - 78) / 5) * (-15.26095-(-40.26095)));
            yy = -1.71854 + (((tickAnim - 78) / 5) * (-1.71854-(-1.71854)));
            zz = 15.13011 + (((tickAnim - 78) / 5) * (15.13011-(15.13011)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -15.26095 + (((tickAnim - 83) / 7) * (0-(-15.26095)));
            yy = -1.71854 + (((tickAnim - 83) / 7) * (0-(-1.71854)));
            zz = 15.13011 + (((tickAnim - 83) / 7) * (0-(15.13011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 12.5 + (((tickAnim - 18) / 3) * (12.42833-(12.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (-1.10548-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (7.41854-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 12.42833 + (((tickAnim - 21) / 9) * (17.42833-(12.42833)));
            yy = -1.10548 + (((tickAnim - 21) / 9) * (-1.10548-(-1.10548)));
            zz = 7.41854 + (((tickAnim - 21) / 9) * (7.41854-(7.41854)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 17.42833 + (((tickAnim - 30) / 8) * (9.92833-(17.42833)));
            yy = -1.10548 + (((tickAnim - 30) / 8) * (-1.10548-(-1.10548)));
            zz = 7.41854 + (((tickAnim - 30) / 8) * (7.41854-(7.41854)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 9.92833 + (((tickAnim - 38) / 12) * (14.92833-(9.92833)));
            yy = -1.10548 + (((tickAnim - 38) / 12) * (-1.10548-(-1.10548)));
            zz = 7.41854 + (((tickAnim - 38) / 12) * (7.41854-(7.41854)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 14.92833 + (((tickAnim - 50) / 4) * (-2.57167-(14.92833)));
            yy = -1.10548 + (((tickAnim - 50) / 4) * (-1.10548-(-1.10548)));
            zz = 7.41854 + (((tickAnim - 50) / 4) * (7.41854-(7.41854)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -2.57167 + (((tickAnim - 54) / 6) * (-12.57167-(-2.57167)));
            yy = -1.10548 + (((tickAnim - 54) / 6) * (-1.10548-(-1.10548)));
            zz = 7.41854 + (((tickAnim - 54) / 6) * (7.41854-(7.41854)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = -12.57167 + (((tickAnim - 60) / 6) * (27.15185-(-12.57167)));
            yy = -1.10548 + (((tickAnim - 60) / 6) * (3.85347-(-1.10548)));
            zz = 7.41854 + (((tickAnim - 60) / 6) * (-4.06263-(7.41854)));
        }
        else if (tickAnim >= 66 && tickAnim < 69) {
            xx = 27.15185 + (((tickAnim - 66) / 3) * (9.65185-(27.15185)));
            yy = 3.85347 + (((tickAnim - 66) / 3) * (3.85347-(3.85347)));
            zz = -4.06263 + (((tickAnim - 66) / 3) * (-4.06263-(-4.06263)));
        }
        else if (tickAnim >= 69 && tickAnim < 90) {
            xx = 9.65185 + (((tickAnim - 69) / 21) * (0-(9.65185)));
            yy = 3.85347 + (((tickAnim - 69) / 21) * (0-(3.85347)));
            zz = -4.06263 + (((tickAnim - 69) / 21) * (0-(-4.06263)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0), Root.rotateAngleY + (float) Math.toRadians(0), Root.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -12.5 + (((tickAnim - 0) / 9) * (7.5-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 9) / 24) * (20-(7.5)));
            yy = 0 + (((tickAnim - 9) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 24) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 20 + (((tickAnim - 33) / 11) * (22.5-(20)));
            yy = 0 + (((tickAnim - 33) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 11) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 58) {
            xx = 22.5 + (((tickAnim - 44) / 14) * (-5-(22.5)));
            yy = 0 + (((tickAnim - 44) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 14) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 75) {
            xx = -5 + (((tickAnim - 58) / 17) * (10-(-5)));
            yy = 0 + (((tickAnim - 58) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 17) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 10 + (((tickAnim - 75) / 15) * (-12.5-(10)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }





        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 10 + (((tickAnim - 18) / 14) * (2.5-(10)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 2.5 + (((tickAnim - 32) / 14) * (-15-(2.5)));
            yy = 0 + (((tickAnim - 32) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 14) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = -15 + (((tickAnim - 46) / 14) * (10-(-15)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10 + (((tickAnim - 60) / 10) * (-10-(10)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 79) {
            xx = -10 + (((tickAnim - 70) / 9) * (25-(-10)));
            yy = 0 + (((tickAnim - 70) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 9) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 90) {
            xx = 25 + (((tickAnim - 79) / 11) * (0-(25)));
            yy = 0 + (((tickAnim - 79) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 11) * (0-(0)));
        }





        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (22.5-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 22.5 + (((tickAnim - 7) / 2) * (0-(22.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (22.5-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 22.5 + (((tickAnim - 22) / 2) * (0-(22.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (47.5-(0)));
            yy = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 47.5 + (((tickAnim - 37) / 5) * (5-(47.5)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 5 + (((tickAnim - 42) / 5) * (5-(5)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 55) {
            xx = 5 + (((tickAnim - 47) / 8) * (27.5-(5)));
            yy = 0 + (((tickAnim - 47) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 8) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = 27.5 + (((tickAnim - 55) / 4) * (0-(27.5)));
            yy = 0 + (((tickAnim - 55) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 4) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 59) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 18) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 77) / 2) * (22.5-(0)));
            yy = 0 + (((tickAnim - 77) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 2) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 82) {
            xx = 22.5 + (((tickAnim - 79) / 3) * (0-(22.5)));
            yy = 0 + (((tickAnim - 79) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -12.5 + (((tickAnim - 0) / 9) * (7.5-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 9) / 24) * (20-(7.5)));
            yy = 0 + (((tickAnim - 9) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 24) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 20 + (((tickAnim - 33) / 11) * (22.5-(20)));
            yy = 0 + (((tickAnim - 33) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 11) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 58) {
            xx = 22.5 + (((tickAnim - 44) / 14) * (-5-(22.5)));
            yy = 0 + (((tickAnim - 44) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 14) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 75) {
            xx = -5 + (((tickAnim - 58) / 17) * (10-(-5)));
            yy = 0 + (((tickAnim - 58) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 17) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 10 + (((tickAnim - 75) / 15) * (-12.5-(10)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 10 + (((tickAnim - 18) / 14) * (2.5-(10)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 2.5 + (((tickAnim - 32) / 14) * (-15-(2.5)));
            yy = 0 + (((tickAnim - 32) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 14) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = -15 + (((tickAnim - 46) / 14) * (10-(-15)));
            yy = 0 + (((tickAnim - 46) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 14) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10 + (((tickAnim - 60) / 10) * (-10-(10)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 79) {
            xx = -10 + (((tickAnim - 70) / 9) * (25-(-10)));
            yy = 0 + (((tickAnim - 70) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 9) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 90) {
            xx = 25 + (((tickAnim - 79) / 11) * (0-(25)));
            yy = 0 + (((tickAnim - 79) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL2, ElbowL2.rotateAngleX + (float) Math.toRadians(xx), ElbowL2.rotateAngleY + (float) Math.toRadians(yy), ElbowL2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraValdosaurus entity = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0.21279-(0)));
            yy = 3.25 + (((tickAnim - 8) / 7) * (3.24303-(3.25)));
            zz = -2.5 + (((tickAnim - 8) / 7) * (1.25602-(-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0.21279 + (((tickAnim - 15) / 7) * (0-(0.21279)));
            yy = 3.24303 + (((tickAnim - 15) / 7) * (3.25-(3.24303)));
            zz = 1.25602 + (((tickAnim - 15) / 7) * (-2.5-(1.25602)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0.21279-(0)));
            yy = 3.25 + (((tickAnim - 22) / 6) * (3.24303-(3.25)));
            zz = -2.5 + (((tickAnim - 22) / 6) * (1.25602-(-2.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0.21279 + (((tickAnim - 28) / 7) * (0-(0.21279)));
            yy = 3.24303 + (((tickAnim - 28) / 7) * (3.25-(3.24303)));
            zz = 1.25602 + (((tickAnim - 28) / 7) * (-2.5-(1.25602)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 3.25 + (((tickAnim - 35) / 15) * (0-(3.25)));
            zz = -2.5 + (((tickAnim - 35) / 15) * (0-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -2.75 + (((tickAnim - 8) / 7) * (3.5-(-2.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 3.5 + (((tickAnim - 15) / 7) * (-2.75-(3.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = -2.75 + (((tickAnim - 22) / 6) * (3.5-(-2.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 3.5 + (((tickAnim - 28) / 7) * (-2.75-(3.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13.95309-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-3.98898-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (4.26034-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 13.95309 + (((tickAnim - 8) / 7) * (14.26259-(13.95309)));
            yy = -3.98898 + (((tickAnim - 8) / 7) * (-2.6474-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 8) / 7) * (-1.08262-(4.26034)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.26259 + (((tickAnim - 15) / 7) * (13.95309-(14.26259)));
            yy = -2.6474 + (((tickAnim - 15) / 7) * (-3.98898-(-2.6474)));
            zz = -1.08262 + (((tickAnim - 15) / 7) * (4.26034-(-1.08262)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 13.95309 + (((tickAnim - 22) / 6) * (14.26259-(13.95309)));
            yy = -3.98898 + (((tickAnim - 22) / 6) * (-2.6474-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 22) / 6) * (-1.08262-(4.26034)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.26259 + (((tickAnim - 28) / 7) * (13.95309-(14.26259)));
            yy = -2.6474 + (((tickAnim - 28) / 7) * (-3.98898-(-2.6474)));
            zz = -1.08262 + (((tickAnim - 28) / 7) * (4.26034-(-1.08262)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.95309 + (((tickAnim - 35) / 15) * (0-(13.95309)));
            yy = -3.98898 + (((tickAnim - 35) / 15) * (0-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 35) / 15) * (0-(4.26034)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.07696-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-8.74966-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.50589-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.07696 + (((tickAnim - 8) / 7) * (0-(-0.07696)));
            yy = -8.74966 + (((tickAnim - 8) / 7) * (-8.75-(-8.74966)));
            zz = 0.50589 + (((tickAnim - 8) / 7) * (0-(0.50589)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (-0.49994-(0)));
            yy = -8.75 + (((tickAnim - 15) / 7) * (-8.73582-(-8.75)));
            zz = 0 + (((tickAnim - 15) / 7) * (3.28819-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -0.49994 + (((tickAnim - 22) / 6) * (-0.80687-(-0.49994)));
            yy = -8.73582 + (((tickAnim - 22) / 6) * (-8.71301-(-8.73582)));
            zz = 3.28819 + (((tickAnim - 22) / 6) * (5.31147-(3.28819)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -0.80687 + (((tickAnim - 28) / 7) * (-1.26521-(-0.80687)));
            yy = -8.71301 + (((tickAnim - 28) / 7) * (-8.65875-(-8.71301)));
            zz = 5.31147 + (((tickAnim - 28) / 7) * (8.34579-(5.31147)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.26521 + (((tickAnim - 35) / 15) * (0-(-1.26521)));
            yy = -8.65875 + (((tickAnim - 35) / 15) * (0-(-8.65875)));
            zz = 8.34579 + (((tickAnim - 35) / 15) * (0-(8.34579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.76159-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-13.08238-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.3118-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.76159 + (((tickAnim - 8) / 7) * (-2.66984-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 8) / 7) * (-11.75376-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 8) / 7) * (12.16816-(3.3118)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -2.66984 + (((tickAnim - 15) / 7) * (-0.76159-(-2.66984)));
            yy = -11.75376 + (((tickAnim - 15) / 7) * (-13.08238-(-11.75376)));
            zz = 12.16816 + (((tickAnim - 15) / 7) * (3.3118-(12.16816)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -0.76159 + (((tickAnim - 22) / 6) * (-2.66984-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 22) / 6) * (-11.75376-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 22) / 6) * (12.16816-(3.3118)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.66984 + (((tickAnim - 28) / 7) * (-0.76159-(-2.66984)));
            yy = -11.75376 + (((tickAnim - 28) / 7) * (-13.08238-(-11.75376)));
            zz = 12.16816 + (((tickAnim - 28) / 7) * (3.3118-(12.16816)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.76159 + (((tickAnim - 35) / 15) * (0-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 35) / 15) * (0-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 35) / 15) * (0-(3.3118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 4.25 + (((tickAnim - 8) / 7) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -12 + (((tickAnim - 15) / 7) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 4.25 + (((tickAnim - 22) / 6) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -12 + (((tickAnim - 28) / 7) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 4.25 + (((tickAnim - 35) / 7) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -12 + (((tickAnim - 42) / 6) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 4.25 + (((tickAnim - 48) / 2) * (0-(4.25)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 5.75 + (((tickAnim - 8) / 7) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -11.5 + (((tickAnim - 15) / 7) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 5.75 + (((tickAnim - 22) / 6) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -11.5 + (((tickAnim - 28) / 7) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 5.75 + (((tickAnim - 35) / 7) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -11.5 + (((tickAnim - 42) / 6) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 5.75 + (((tickAnim - 48) / 2) * (0-(5.75)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (11-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 11 + (((tickAnim - 8) / 4) * (14.56-(11)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 14.56 + (((tickAnim - 12) / 3) * (-11.5-(14.56)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -11.5 + (((tickAnim - 15) / 3) * (-13.5-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -13.5 + (((tickAnim - 18) / 4) * (11-(-13.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 11 + (((tickAnim - 22) / 3) * (14.63-(11)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 14.63 + (((tickAnim - 25) / 3) * (-11.5-(14.63)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -11.5 + (((tickAnim - 28) / 5) * (-9.53-(-11.5)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = -9.53 + (((tickAnim - 33) / 2) * (11-(-9.53)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 11 + (((tickAnim - 35) / 3) * (15.63-(11)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 15.63 + (((tickAnim - 38) / 4) * (-11.5-(15.63)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = -11.5 + (((tickAnim - 42) / 2) * (-16.22-(-11.5)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = -16.22 + (((tickAnim - 44) / 4) * (11-(-16.22)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 11 + (((tickAnim - 48) / 2) * (0-(11)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -12.25 + (((tickAnim - 8) / 7) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 27.25 + (((tickAnim - 15) / 7) * (-12.25-(27.25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -12.25 + (((tickAnim - 22) / 6) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 27.25 + (((tickAnim - 28) / 7) * (-12.25-(27.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -12.25 + (((tickAnim - 35) / 7) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 27.25 + (((tickAnim - 42) / 8) * (0-(27.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -29.25 + (((tickAnim - 8) / 7) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.75 + (((tickAnim - 15) / 7) * (-29.25-(14.75)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -29.25 + (((tickAnim - 22) / 6) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.75 + (((tickAnim - 28) / 7) * (-29.25-(14.75)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -29.25 + (((tickAnim - 35) / 7) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 42) / 8) * (0-(14.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -30.75 + (((tickAnim - 4) / 4) * (11.5-(-30.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.5 + (((tickAnim - 8) / 7) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.25 + (((tickAnim - 15) / 3) * (-48.12-(20.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -48.12 + (((tickAnim - 18) / 4) * (11.5-(-48.12)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 11.5 + (((tickAnim - 22) / 6) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 20.25 + (((tickAnim - 28) / 4) * (-48.12-(20.25)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -48.12 + (((tickAnim - 32) / 3) * (11.5-(-48.12)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 11.5 + (((tickAnim - 35) / 7) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 20.25 + (((tickAnim - 42) / 8) * (0-(20.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TarsalsL, TarsalsL.rotateAngleX + (float) Math.toRadians(xx), TarsalsL.rotateAngleY + (float) Math.toRadians(yy), TarsalsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (68.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 68.75 + (((tickAnim - 4) / 4) * (29-(68.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 29 + (((tickAnim - 8) / 4) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -17.37 + (((tickAnim - 12) / 3) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 56.75 + (((tickAnim - 15) / 3) * (66.13-(56.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 66.13 + (((tickAnim - 18) / 4) * (29-(66.13)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 29 + (((tickAnim - 22) / 3) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -17.37 + (((tickAnim - 25) / 3) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 56.75 + (((tickAnim - 28) / 4) * (66.13-(56.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 66.13 + (((tickAnim - 32) / 3) * (29-(66.13)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 29 + (((tickAnim - 35) / 3) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -17.37 + (((tickAnim - 38) / 4) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 56.75 + (((tickAnim - 42) / 8) * (0-(56.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 4) / 4) * (0-(0.575)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.475-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 15) / 7) * (0-(0.475)));
            zz = -0.125 + (((tickAnim - 15) / 7) * (0-(-0.125)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0.475-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (-0.125-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 28) / 7) * (0-(0.475)));
            zz = -0.125 + (((tickAnim - 28) / 7) * (0-(-0.125)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (0.475-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (-0.125-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 42) / 8) * (0-(0.475)));
            zz = -0.125 + (((tickAnim - 42) / 8) * (0-(-0.125)));
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
        EntityPrehistoricFloraValdosaurus entity = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7 + (((tickAnim - 15) / 20) * (-7-(-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 35) / 15) * (0-(-7)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(xx), Root.rotateAngleY + (float) Math.toRadians(yy), Root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.275-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.475-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -5.275 + (((tickAnim - 15) / 20) * (-5.275-(-5.275)));
            zz = 6.475 + (((tickAnim - 15) / 20) * (6.475-(6.475)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -5.275 + (((tickAnim - 35) / 15) * (0-(-5.275)));
            zz = 6.475 + (((tickAnim - 35) / 15) * (0-(6.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(xx);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(yy);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4.5 + (((tickAnim - 15) / 20) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 35) / 15) * (0-(4.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.25 + (((tickAnim - 15) / 20) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 35) / 15) * (0-(5.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -9.75 + (((tickAnim - 15) / 20) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 35) / 15) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.9734-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (8.42883-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.52478-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.9734 + (((tickAnim - 15) / 20) * (-5.9734-(-5.9734)));
            yy = 8.42883 + (((tickAnim - 15) / 20) * (8.42883-(8.42883)));
            zz = 3.52478 + (((tickAnim - 15) / 20) * (3.52478-(3.52478)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.9734 + (((tickAnim - 35) / 15) * (0-(-5.9734)));
            yy = 8.42883 + (((tickAnim - 35) / 15) * (0-(8.42883)));
            zz = 3.52478 + (((tickAnim - 35) / 15) * (0-(3.52478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.0532-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (10.49947-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.29898-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.0532 + (((tickAnim - 15) / 20) * (7.0532-(7.0532)));
            yy = 10.49947 + (((tickAnim - 15) / 20) * (10.49947-(10.49947)));
            zz = 3.29898 + (((tickAnim - 15) / 20) * (3.29898-(3.29898)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.0532 + (((tickAnim - 35) / 15) * (0-(7.0532)));
            yy = 10.49947 + (((tickAnim - 35) / 15) * (0-(10.49947)));
            zz = 3.29898 + (((tickAnim - 35) / 15) * (0-(3.29898)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.27868-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (18.67601-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (7.19462-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.27868 + (((tickAnim - 15) / 20) * (13.27868-(13.27868)));
            yy = 18.67601 + (((tickAnim - 15) / 20) * (18.67601-(18.67601)));
            zz = 7.19462 + (((tickAnim - 15) / 20) * (7.19462-(7.19462)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.27868 + (((tickAnim - 35) / 15) * (0-(13.27868)));
            yy = 18.67601 + (((tickAnim - 35) / 15) * (0-(18.67601)));
            zz = 7.19462 + (((tickAnim - 35) / 15) * (0-(7.19462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.75 + (((tickAnim - 15) / 20) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 35) / 15) * (0-(10.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -27.25 + (((tickAnim - 15) / 20) * (-27.25-(-27.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27.25 + (((tickAnim - 35) / 15) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.75 + (((tickAnim - 15) / 20) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 35) / 15) * (0-(11.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.075-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.15 + (((tickAnim - 15) / 20) * (0.15-(0.15)));
            zz = -0.075 + (((tickAnim - 15) / 20) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 35) / 15) * (0-(0.15)));
            zz = -0.075 + (((tickAnim - 35) / 15) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeL.rotationPointX = this.KneeL.rotationPointX + (float)(xx);
        this.KneeL.rotationPointY = this.KneeL.rotationPointY - (float)(yy);
        this.KneeL.rotationPointZ = this.KneeL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.5 + (((tickAnim - 15) / 20) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.5 + (((tickAnim - 35) / 15) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TarsalsL, TarsalsL.rotateAngleX + (float) Math.toRadians(xx), TarsalsL.rotateAngleY + (float) Math.toRadians(yy), TarsalsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 27.5 + (((tickAnim - 15) / 20) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 35) / 15) * (0-(27.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.61-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.15-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.61 + (((tickAnim - 7) / 8) * (1.225-(0.61)));
            zz = -0.15 + (((tickAnim - 7) / 8) * (-0.525-(-0.15)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.225 + (((tickAnim - 15) / 20) * (1.225-(1.225)));
            zz = -0.525 + (((tickAnim - 15) / 20) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 1.225 + (((tickAnim - 35) / 8) * (0.535-(1.225)));
            zz = -0.525 + (((tickAnim - 35) / 8) * (-0.14-(-0.525)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.535 + (((tickAnim - 43) / 7) * (0-(0.535)));
            zz = -0.14 + (((tickAnim - 43) / 7) * (0-(-0.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -27.25 + (((tickAnim - 15) / 20) * (-27.25-(-27.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27.25 + (((tickAnim - 35) / 15) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.75 + (((tickAnim - 15) / 20) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 35) / 15) * (0-(11.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.075-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.15 + (((tickAnim - 15) / 20) * (0.15-(0.15)));
            zz = -0.075 + (((tickAnim - 15) / 20) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 35) / 15) * (0-(0.15)));
            zz = -0.075 + (((tickAnim - 35) / 15) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeR.rotationPointX = this.KneeR.rotationPointX + (float)(xx);
        this.KneeR.rotationPointY = this.KneeR.rotationPointY - (float)(yy);
        this.KneeR.rotationPointZ = this.KneeR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.5 + (((tickAnim - 15) / 20) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.5 + (((tickAnim - 35) / 15) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TarsalsR, TarsalsR.rotateAngleX + (float) Math.toRadians(xx), TarsalsR.rotateAngleY + (float) Math.toRadians(yy), TarsalsR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 27.5 + (((tickAnim - 15) / 20) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 35) / 15) * (0-(27.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.61-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.15-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.61 + (((tickAnim - 7) / 8) * (1.225-(0.61)));
            zz = -0.15 + (((tickAnim - 7) / 8) * (-0.525-(-0.15)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.225 + (((tickAnim - 15) / 20) * (1.225-(1.225)));
            zz = -0.525 + (((tickAnim - 15) / 20) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 1.225 + (((tickAnim - 35) / 8) * (0.535-(1.225)));
            zz = -0.525 + (((tickAnim - 35) / 8) * (-0.14-(-0.525)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.535 + (((tickAnim - 43) / 7) * (0-(0.535)));
            zz = -0.14 + (((tickAnim - 43) / 7) * (0-(-0.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootR.rotationPointX = this.FootR.rotationPointX + (float)(xx);
        this.FootR.rotationPointY = this.FootR.rotationPointY - (float)(yy);
        this.FootR.rotationPointZ = this.FootR.rotationPointZ + (float)(zz);

    }
    public void animIdleAlarm(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraValdosaurus entity = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 5) / 3) * (-12.5-(-7.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -12.5 + (((tickAnim - 8) / 5) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 13) / 5) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -10 + (((tickAnim - 4) / 9) * (-7.5-(-10)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -7.5 + (((tickAnim - 13) / 5) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 4) / 4) * (-1.36-(-7.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -1.36 + (((tickAnim - 8) / 5) * (-5-(-1.36)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 13) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 2) / 11) * (0-(-5)));
            yy = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 11) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 4) / 9) * (5-(10)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 13) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 4) / 6) * (2.95-(5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 2.95 + (((tickAnim - 10) / 1) * (0-(2.95)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 12) / 1) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 2.5 + (((tickAnim - 2) / 4) * (22.5-(2.5)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 22.5 + (((tickAnim - 6) / 1) * (20-(22.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 20 + (((tickAnim - 7) / 2) * (17.5-(20)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 17.5 + (((tickAnim - 9) / 2) * (20-(17.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 11) / 7) * (0-(20)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdleLook(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraValdosaurus entity = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -1.75 + (((tickAnim - 11) / 12) * (-2.25-(-1.75)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -2.25 + (((tickAnim - 23) / 11) * (-0.75-(-2.25)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -0.75 + (((tickAnim - 34) / 9) * (-2.77647-(-0.75)));
            yy = 0 + (((tickAnim - 34) / 9) * (-4.96264-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0.61088-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -2.77647 + (((tickAnim - 43) / 11) * (-2.02647-(-2.77647)));
            yy = -4.96264 + (((tickAnim - 43) / 11) * (-4.96264-(-4.96264)));
            zz = 0.61088 + (((tickAnim - 43) / 11) * (0.61088-(0.61088)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = -2.02647 + (((tickAnim - 54) / 2) * (-2.27647-(-2.02647)));
            yy = -4.96264 + (((tickAnim - 54) / 2) * (-4.96264-(-4.96264)));
            zz = 0.61088 + (((tickAnim - 54) / 2) * (0.61088-(0.61088)));
        }
        else if (tickAnim >= 56 && tickAnim < 80) {
            xx = -2.27647 + (((tickAnim - 56) / 24) * (0-(-2.27647)));
            yy = -4.96264 + (((tickAnim - 56) / 24) * (0-(-4.96264)));
            zz = 0.61088 + (((tickAnim - 56) / 24) * (0-(0.61088)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 11) / 12) * (-2.5-(-7.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -2.5 + (((tickAnim - 23) / 11) * (-7.5-(-2.5)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 34) / 1) * (-7.52832-(-7.5)));
            yy = 0 + (((tickAnim - 34) / 1) * (-4.95712-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0.65426-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -7.52832 + (((tickAnim - 35) / 8) * (-7.67995-(-7.52832)));
            yy = -4.95712 + (((tickAnim - 35) / 8) * (-12.39135-(-4.95712)));
            zz = 0.65426 + (((tickAnim - 35) / 8) * (1.6575-(0.65426)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -7.67995 + (((tickAnim - 43) / 11) * (-2.67995-(-7.67995)));
            yy = -12.39135 + (((tickAnim - 43) / 11) * (-12.39135-(-12.39135)));
            zz = 1.6575 + (((tickAnim - 43) / 11) * (1.6575-(1.6575)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = -2.67995 + (((tickAnim - 54) / 9) * (-2.67995-(-2.67995)));
            yy = -12.39135 + (((tickAnim - 54) / 9) * (-12.39135-(-12.39135)));
            zz = 1.6575 + (((tickAnim - 54) / 9) * (1.6575-(1.6575)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -2.67995 + (((tickAnim - 63) / 17) * (0-(-2.67995)));
            yy = -12.39135 + (((tickAnim - 63) / 17) * (0-(-12.39135)));
            zz = 1.6575 + (((tickAnim - 63) / 17) * (0-(1.6575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -2.5 + (((tickAnim - 11) / 12) * (-5-(-2.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -5 + (((tickAnim - 23) / 11) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = -2.5 + (((tickAnim - 34) / 2) * (-2.50954-(-2.5)));
            yy = 0 + (((tickAnim - 34) / 2) * (-4.99523-(0)));
            zz = 0 + (((tickAnim - 34) / 2) * (0.21865-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -2.50954 + (((tickAnim - 36) / 7) * (-2.58807-(-2.50954)));
            yy = -4.99523 + (((tickAnim - 36) / 7) * (-14.98539-(-4.99523)));
            zz = 0.21865 + (((tickAnim - 36) / 7) * (0.66963-(0.21865)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -2.58807 + (((tickAnim - 43) / 11) * (2.34993-(-2.58807)));
            yy = -14.98539 + (((tickAnim - 43) / 11) * (-7.49184-(-14.98539)));
            zz = 0.66963 + (((tickAnim - 43) / 11) * (0.98707-(0.66963)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = 2.34993 + (((tickAnim - 54) / 7) * (2.34993-(2.34993)));
            yy = -7.49184 + (((tickAnim - 54) / 7) * (-7.49184-(-7.49184)));
            zz = 0.98707 + (((tickAnim - 54) / 7) * (0.98707-(0.98707)));
        }
        else if (tickAnim >= 61 && tickAnim < 80) {
            xx = 2.34993 + (((tickAnim - 61) / 19) * (0-(2.34993)));
            yy = -7.49184 + (((tickAnim - 61) / 19) * (0-(-7.49184)));
            zz = 0.98707 + (((tickAnim - 61) / 19) * (0-(0.98707)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 10 + (((tickAnim - 11) / 12) * (10-(10)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 10 + (((tickAnim - 23) / 11) * (10-(10)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 10 + (((tickAnim - 34) / 2) * (10.019-(10)));
            yy = 0 + (((tickAnim - 34) / 2) * (-4.98093-(0)));
            zz = 0 + (((tickAnim - 34) / 2) * (-0.43688-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 10.019 + (((tickAnim - 36) / 7) * (10.12076-(10.019)));
            yy = -4.98093 + (((tickAnim - 36) / 7) * (-12.45167-(-4.98093)));
            zz = -0.43688 + (((tickAnim - 36) / 7) * (-1.10693-(-0.43688)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = 10.12076 + (((tickAnim - 43) / 11) * (10.019-(10.12076)));
            yy = -12.45167 + (((tickAnim - 43) / 11) * (-4.98093-(-12.45167)));
            zz = -1.10693 + (((tickAnim - 43) / 11) * (-0.43688-(-1.10693)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = 10.019 + (((tickAnim - 54) / 9) * (10.019-(10.019)));
            yy = -4.98093 + (((tickAnim - 54) / 9) * (-4.98093-(-4.98093)));
            zz = -0.43688 + (((tickAnim - 54) / 9) * (-0.43688-(-0.43688)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 10.019 + (((tickAnim - 63) / 17) * (0-(10.019)));
            yy = -4.98093 + (((tickAnim - 63) / 17) * (0-(-4.98093)));
            zz = -0.43688 + (((tickAnim - 63) / 17) * (0-(-0.43688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 11) / 4) * (10-(7.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 15) / 3) * (7.22-(10)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 7.22 + (((tickAnim - 18) / 16) * (7.5-(7.22)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 7.5 + (((tickAnim - 34) / 2) * (7.50706-(7.5)));
            yy = 0 + (((tickAnim - 34) / 2) * (-2.4786-(0)));
            zz = 0 + (((tickAnim - 34) / 2) * (-0.32652-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 7.50706 + (((tickAnim - 36) / 7) * (7.61435-(7.50706)));
            yy = -2.4786 + (((tickAnim - 36) / 7) * (-9.91358-(-2.4786)));
            zz = -0.32652 + (((tickAnim - 36) / 7) * (-1.31845-(-0.32652)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = 7.61435 + (((tickAnim - 43) / 11) * (7.52832-(7.61435)));
            yy = -9.91358 + (((tickAnim - 43) / 11) * (-4.95712-(-9.91358)));
            zz = -1.31845 + (((tickAnim - 43) / 11) * (-0.65426-(-1.31845)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = 7.52832 + (((tickAnim - 54) / 9) * (7.52832-(7.52832)));
            yy = -4.95712 + (((tickAnim - 54) / 9) * (-4.95712-(-4.95712)));
            zz = -0.65426 + (((tickAnim - 54) / 9) * (-0.65426-(-0.65426)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 7.52832 + (((tickAnim - 63) / 17) * (0-(7.52832)));
            yy = -4.95712 + (((tickAnim - 63) / 17) * (0-(-4.95712)));
            zz = -0.65426 + (((tickAnim - 63) / 17) * (0-(-0.65426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 34) {
            xx = 5 + (((tickAnim - 11) / 23) * (5-(5)));
            yy = 0 + (((tickAnim - 11) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 23) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 5 + (((tickAnim - 34) / 2) * (5.00095-(5)));
            yy = 0 + (((tickAnim - 34) / 2) * (-2.49962-(0)));
            zz = 0 + (((tickAnim - 34) / 2) * (-0.04366-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 5.00095 + (((tickAnim - 36) / 7) * (5.03527-(5.00095)));
            yy = -2.49962 + (((tickAnim - 36) / 7) * (-14.99766-(-2.49962)));
            zz = -0.04366 + (((tickAnim - 36) / 7) * (-0.26793-(-0.04366)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = 5.03527 + (((tickAnim - 43) / 11) * (-7.78152-(5.03527)));
            yy = -14.99766 + (((tickAnim - 43) / 11) * (-19.89528-(-14.99766)));
            zz = -0.26793 + (((tickAnim - 43) / 11) * (0.78769-(-0.26793)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = -7.78152 + (((tickAnim - 54) / 9) * (-7.78152-(-7.78152)));
            yy = -19.89528 + (((tickAnim - 54) / 9) * (-19.89528-(-19.89528)));
            zz = 0.78769 + (((tickAnim - 54) / 9) * (0.78769-(0.78769)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -7.78152 + (((tickAnim - 63) / 17) * (0-(-7.78152)));
            yy = -19.89528 + (((tickAnim - 63) / 17) * (0-(-19.89528)));
            zz = 0.78769 + (((tickAnim - 63) / 17) * (0-(0.78769)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -2.25 + (((tickAnim - 11) / 12) * (-2.5-(-2.25)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = -2.5 + (((tickAnim - 23) / 11) * (-5-(-2.5)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = -5 + (((tickAnim - 34) / 20) * (-4.75-(-5)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = -4.75 + (((tickAnim - 54) / 26) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraValdosaurus entity = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 4) / 9) * (-3.81-(-2.5)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.81 + (((tickAnim - 13) / 5) * (0.77-(-3.81)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.77 + (((tickAnim - 18) / 4) * (0-(0.77)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = -2.5 + (((tickAnim - 2) / 14) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 2) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 14) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 16) / 4) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 2) / 14) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 14) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = -7.5 + (((tickAnim - 2) / 14) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 2) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 14) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 16) / 4) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = 5 + (((tickAnim - 2) / 14) * (2.5-(5)));
            yy = 0 + (((tickAnim - 2) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 14) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 16) / 4) * (0-(2.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = -2.5 + (((tickAnim - 2) / 14) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 2) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 14) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 16) / 4) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (5.42-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 5.42 + (((tickAnim - 3) / 0) * (10.34-(5.42)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10.34 + (((tickAnim - 3) / 1) * (6.5-(10.34)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 6.5 + (((tickAnim - 4) / 1) * (3.5-(6.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.5 + (((tickAnim - 5) / 2) * (5-(3.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 7) / 1) * (2.5-(5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5 + (((tickAnim - 8) / 1) * (5-(2.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 5 + (((tickAnim - 9) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 15) / 3) * (5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 18) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraValdosaurus entity = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 5) / 10) * (5-(5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 15) / 8) * (0-(5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 5) / 10) * (5-(5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 15) / 8) * (0-(5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
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
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -2.5 + (((tickAnim - 15) / 8) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 5) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 15) / 8) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (7.5-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 3) / 0) * (12.5-(7.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 3) / 2) * (18.75-(12.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 18.75 + (((tickAnim - 5) / 1) * (11.38-(18.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.38 + (((tickAnim - 6) / 2) * (18.3-(11.38)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 18.3 + (((tickAnim - 8) / 1) * (11.29-(18.3)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 11.29 + (((tickAnim - 9) / 1) * (20.53-(11.29)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 20.53 + (((tickAnim - 10) / 2) * (12.77-(20.53)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 12.77 + (((tickAnim - 12) / 1) * (20-(12.77)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 20 + (((tickAnim - 13) / 1) * (17.5-(20)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 17.5 + (((tickAnim - 14) / 2) * (20-(17.5)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 20 + (((tickAnim - 16) / 1) * (17.5-(20)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 17.5 + (((tickAnim - 17) / 1) * (10-(17.5)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 18) / 0) * (5-(10)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 18) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraValdosaurus entity = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;
        int animCycle = 37;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5+50))*1), Root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5))*3), Root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5))*3));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/1.88+30))*-0.6);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)((-1+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*720/1.875+30))*-0.5);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*720/1.875+30))*-1;


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.88))*2), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5+100))*3), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.88))*2), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5+150))*2), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.875-150))*-4)), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.875-200))*4)));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.875-200))*4), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5+200))*3), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5))*-1));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.875-200))*4), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5+100))*-3), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5))*-1));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.876-200))*-5), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5+100))*-1), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5))*-1));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*-1), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-1), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.875+50))*-3), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5+50))*-4), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5+50))*-3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.875))*-2), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5))*-4), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5))*-3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.874-50))*-1), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5-50))*-4), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5-50))*-3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.875-70))*-3), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5-70))*-4), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5-70))*-3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.875-90))*-5), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5-90))*-4), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/1.5-90))*-3));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 0) / 4) * (-15.57952-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.15693-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.43893-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = -15.57952 + (((tickAnim - 4) / 14) * (15.04292-(-15.57952)));
            yy = -3.15693 + (((tickAnim - 4) / 14) * (-7.4713-(-3.15693)));
            zz = -2.43893 + (((tickAnim - 4) / 14) * (-0.6574-(-2.43893)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 15.04292 + (((tickAnim - 18) / 10) * (-8.7679-(15.04292)));
            yy = -7.4713 + (((tickAnim - 18) / 10) * (-9.1645-(-7.4713)));
            zz = -0.6574 + (((tickAnim - 18) / 10) * (1.22035-(-0.6574)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -8.7679 + (((tickAnim - 28) / 10) * (-27.5-(-8.7679)));
            yy = -9.1645 + (((tickAnim - 28) / 10) * (0-(-9.1645)));
            zz = 1.22035 + (((tickAnim - 28) / 10) * (0-(1.22035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 4) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0.38-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0.38 + (((tickAnim - 9) / 9) * (0-(0.38)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (1.42-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 1.42 + (((tickAnim - 28) / 10) * (-0.85-(1.42)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.5 + (((tickAnim - 0) / 4) * (1.78-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 1.78 + (((tickAnim - 4) / 5) * (5.31-(1.78)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 5.31 + (((tickAnim - 9) / 9) * (15-(5.31)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 15 + (((tickAnim - 18) / 5) * (33.7-(15)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 33.7 + (((tickAnim - 23) / 5) * (22.89-(33.7)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 22.89 + (((tickAnim - 28) / 10) * (-7.5-(22.89)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.1 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 9) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeL.rotationPointX = this.KneeL.rotationPointX + (float)(xx);
        this.KneeL.rotationPointY = this.KneeL.rotationPointY - (float)(yy);
        this.KneeL.rotationPointZ = this.KneeL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 12.5 + (((tickAnim - 0) / 4) * (4.03-(12.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 4.03 + (((tickAnim - 4) / 5) * (12.03942-(4.03)));
            yy = 0 + (((tickAnim - 4) / 5) * (-1.14964-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (-2.28698-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 12.03942 + (((tickAnim - 9) / 9) * (0-(12.03942)));
            yy = -1.14964 + (((tickAnim - 9) / 9) * (0-(-1.14964)));
            zz = -2.28698 + (((tickAnim - 9) / 9) * (0-(-2.28698)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-13.61-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -13.61 + (((tickAnim - 23) / 5) * (-47.22-(-13.61)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -47.22 + (((tickAnim - 28) / 6) * (-25.71-(-47.22)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -25.71 + (((tickAnim - 34) / 4) * (12.5-(-25.71)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TarsalsL, TarsalsL.rotateAngleX + (float) Math.toRadians(xx), TarsalsL.rotateAngleY + (float) Math.toRadians(yy), TarsalsL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 22.5 + (((tickAnim - 0) / 4) * (9.28162-(22.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.26353-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.20452-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 9.28162 + (((tickAnim - 4) / 5) * (-14.83043-(9.28162)));
            yy = 2.26353 + (((tickAnim - 4) / 5) * (4.97976-(2.26353)));
            zz = 0.20452 + (((tickAnim - 4) / 5) * (0.44995-(0.20452)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -14.83043 + (((tickAnim - 9) / 9) * (13.9995-(-14.83043)));
            yy = 4.97976 + (((tickAnim - 9) / 9) * (6.63927-(4.97976)));
            zz = 0.44995 + (((tickAnim - 9) / 9) * (-2.43531-(0.44995)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 13.9995 + (((tickAnim - 18) / 5) * (57.22-(13.9995)));
            yy = 6.63927 + (((tickAnim - 18) / 5) * (0-(6.63927)));
            zz = -2.43531 + (((tickAnim - 18) / 5) * (0-(-2.43531)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 57.22 + (((tickAnim - 23) / 5) * (81.94-(57.22)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 81.94 + (((tickAnim - 28) / 5) * (55.97-(81.94)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 55.97 + (((tickAnim - 33) / 5) * (22.5-(55.97)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 4) / 5) * (0-(1)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 15.04292 + (((tickAnim - 0) / 9) * (-8.7679-(15.04292)));
            yy = 7.4713 + (((tickAnim - 0) / 9) * (9.1645-(7.4713)));
            zz = 0.6574 + (((tickAnim - 0) / 9) * (-1.22035-(0.6574)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -8.7679 + (((tickAnim - 9) / 9) * (-27.5-(-8.7679)));
            yy = 9.1645 + (((tickAnim - 9) / 9) * (0-(9.1645)));
            zz = -1.22035 + (((tickAnim - 9) / 9) * (0-(-1.22035)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -27.5 + (((tickAnim - 18) / 5) * (-15.57952-(-27.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (3.15693-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (2.43893-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -15.57952 + (((tickAnim - 23) / 15) * (15.04292-(-15.57952)));
            yy = 3.15693 + (((tickAnim - 23) / 15) * (7.4713-(3.15693)));
            zz = 2.43893 + (((tickAnim - 23) / 15) * (0.6574-(2.43893)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (1.42-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 1.42 + (((tickAnim - 9) / 9) * (-0.85-(1.42)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.85 + (((tickAnim - 18) / 5) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.38-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 0.38 + (((tickAnim - 28) / 10) * (0-(0.38)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 18.25 + (((tickAnim - 0) / 4) * (33.2-(18.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 33.2 + (((tickAnim - 4) / 5) * (14.64-(33.2)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 14.64 + (((tickAnim - 9) / 9) * (-7.5-(14.64)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 18) / 5) * (4.03-(-7.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 4.03 + (((tickAnim - 23) / 5) * (9.81-(4.03)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 9.81 + (((tickAnim - 28) / 10) * (18.25-(9.81)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.1-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.1 + (((tickAnim - 23) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeR.rotationPointX = this.KneeR.rotationPointX + (float)(xx);
        this.KneeR.rotationPointY = this.KneeR.rotationPointY - (float)(yy);
        this.KneeR.rotationPointZ = this.KneeR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 0) / 4) * (-13.61-(10)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -13.61 + (((tickAnim - 4) / 5) * (-47.22-(-13.61)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -47.22 + (((tickAnim - 9) / 6) * (-25.71-(-47.22)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -25.71 + (((tickAnim - 15) / 3) * (12.5-(-25.71)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 18) / 5) * (0.53-(12.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0.53 + (((tickAnim - 23) / 5) * (10.64-(0.53)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 10.64 + (((tickAnim - 28) / 10) * (10-(10.64)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TarsalsR, TarsalsR.rotateAngleX + (float) Math.toRadians(xx), TarsalsR.rotateAngleY + (float) Math.toRadians(yy), TarsalsR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.7495 + (((tickAnim - 0) / 4) * (57.22-(4.7495)));
            yy = -6.63927 + (((tickAnim - 0) / 4) * (0-(-6.63927)));
            zz = 2.43531 + (((tickAnim - 0) / 4) * (0-(2.43531)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 57.22 + (((tickAnim - 4) / 5) * (84.44-(57.22)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 84.44 + (((tickAnim - 9) / 5) * (55.97-(84.44)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 55.97 + (((tickAnim - 14) / 4) * (22.5-(55.97)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 18) / 5) * (11.07-(22.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 11.07 + (((tickAnim - 23) / 5) * (-14.85-(11.07)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -14.85 + (((tickAnim - 28) / 10) * (4.7495-(-14.85)));
            yy = 0 + (((tickAnim - 28) / 10) * (-6.63927-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (2.43531-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraValdosaurus entity = (EntityPrehistoricFloraValdosaurus) entitylivingbaseIn;
        int animCycle = 16;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.832+50))*2), Root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.832))*4), Root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.832))*4));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/0.832+30))*-1;
        this.Root.rotationPointY = this.Root.rotationPointY - (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*720/0.832+30))*-1.5);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*720/0.832+30))*-2;


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.836))*2), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.832+100))*3), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.834))*2), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834+150))*2), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*5+10.5), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-170))*4));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.834-200))*6), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834+200))*3), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834))*-1));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.834-200))*-11), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834+100))*-3), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834))*-1));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.834-200))*5), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834+100))*-1), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834))*-1));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.834-200))*5), Neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834+100))*-1), Neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834))*-1));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-11.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*2), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-4));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*1), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.834+50))*3), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834+50))*-12), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834+50))*-3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.834))*-5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834))*-8), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834))*-3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.834-50))*-2), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834-50))*-9), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834-50))*-3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(-12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.832-70))*-5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834-70))*-6), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834-70))*-3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(-12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.834-90))*-8), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.835-90))*-6), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.834-90))*-3));



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
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -15.99476 + (((tickAnim - 4) / 4) * (6.05131-(-15.99476)));
            yy = -3.94898 + (((tickAnim - 4) / 4) * (-9.97674-(-3.94898)));
            zz = -2.05397 + (((tickAnim - 4) / 4) * (0.68516-(-2.05397)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 6.05131 + (((tickAnim - 8) / 0) * (15.07673-(6.05131)));
            yy = -9.97674 + (((tickAnim - 8) / 0) * (-9.96156-(-9.97674)));
            zz = 0.68516 + (((tickAnim - 8) / 0) * (-0.88045-(0.68516)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.07673 + (((tickAnim - 8) / 5) * (-7.67448-(15.07673)));
            yy = -9.96156 + (((tickAnim - 8) / 5) * (-13.97038-(-9.96156)));
            zz = -0.88045 + (((tickAnim - 8) / 5) * (2.63984-(-0.88045)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -7.67448 + (((tickAnim - 13) / 4) * (-16.33724-(-7.67448)));
            yy = -13.97038 + (((tickAnim - 13) / 4) * (-6.98519-(-13.97038)));
            zz = 2.63984 + (((tickAnim - 13) / 4) * (1.31992-(2.63984)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 5) / 3) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 5) / 3) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.12 + (((tickAnim - 8) / 0) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 8) / 0) * (1-(0.56)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 8) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 4) * (0-(1)));
            zz = -0.11 + (((tickAnim - 13) / 4) * (-1-(-0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




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
            xx = -33.72 + (((tickAnim - 4) / 1) * (11.94-(-33.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.94 + (((tickAnim - 5) / 3) * (34.72-(11.94)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 34.72 + (((tickAnim - 8) / 0) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 22.5 + (((tickAnim - 8) / 4) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 56.94 + (((tickAnim - 12) / 1) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 55.16 + (((tickAnim - 13) / 3) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 5) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeL.rotationPointX = this.KneeL.rotationPointX + (float)(xx);
        this.KneeL.rotationPointY = this.KneeL.rotationPointY - (float)(yy);
        this.KneeL.rotationPointZ = this.KneeL.rotationPointZ + (float)(zz);




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
            xx = 7.5 + (((tickAnim - 3) / 1) * (14.72-(7.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 14.72 + (((tickAnim - 4) / 1) * (0.56-(14.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.56 + (((tickAnim - 5) / 3) * (-2.22-(0.56)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -2.22 + (((tickAnim - 8) / 0) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 40 + (((tickAnim - 8) / 5) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -54.44 + (((tickAnim - 13) / 3) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -50.23 + (((tickAnim - 16) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TarsalsL, TarsalsL.rotateAngleX + (float) Math.toRadians(xx), TarsalsL.rotateAngleY + (float) Math.toRadians(yy), TarsalsL.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -9.17 + (((tickAnim - 5) / 3) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 50.41 + (((tickAnim - 8) / 0) * (60-(50.41)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 60 + (((tickAnim - 8) / 5) * (75.83-(60)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 75.83 + (((tickAnim - 13) / 4) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (1.425-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-1.625-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.425 + (((tickAnim - 4) / 1) * (0-(1.425)));
            zz = -1.625 + (((tickAnim - 4) / 1) * (0-(-1.625)));
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
            xx = 15.07673 + (((tickAnim - 0) / 5) * (-7.67448-(15.07673)));
            yy = 9.96156 + (((tickAnim - 0) / 5) * (13.97038-(9.96156)));
            zz = 0.88045 + (((tickAnim - 0) / 5) * (-2.63984-(0.88045)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.67448 + (((tickAnim - 5) / 3) * (-16.33724-(-7.67448)));
            yy = 13.97038 + (((tickAnim - 5) / 3) * (6.98519-(13.97038)));
            zz = -2.63984 + (((tickAnim - 5) / 3) * (-1.31992-(-2.63984)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -16.33724 + (((tickAnim - 8) / 3) * (-25-(-16.33724)));
            yy = 6.98519 + (((tickAnim - 8) / 3) * (0-(6.98519)));
            zz = -1.31992 + (((tickAnim - 8) / 3) * (0-(-1.31992)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -25 + (((tickAnim - 11) / 2) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 11) / 2) * (3.94898-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (2.05397-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -15.99476 + (((tickAnim - 13) / 3) * (6.05131-(-15.99476)));
            yy = 3.94898 + (((tickAnim - 13) / 3) * (9.97674-(3.94898)));
            zz = 2.05397 + (((tickAnim - 13) / 3) * (-0.68516-(2.05397)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 6.05131 + (((tickAnim - 16) / 1) * (15.07673-(6.05131)));
            yy = 9.97674 + (((tickAnim - 16) / 1) * (9.96156-(9.97674)));
            zz = -0.68516 + (((tickAnim - 16) / 1) * (0.88045-(-0.68516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 0) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 6) * (0-(1)));
            zz = -0.11 + (((tickAnim - 5) / 6) * (-1-(-0.11)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (-1-(0)));
            zz = -1 + (((tickAnim - 11) / 2) * (-0.56-(-1)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = -1 + (((tickAnim - 13) / 0) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 13) / 0) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 13) / 3) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 13) / 3) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 16) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 16) / 1) * (1-(0.56)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 56.94 + (((tickAnim - 3) / 2) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 55.16 + (((tickAnim - 5) / 3) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 10.08 + (((tickAnim - 8) / 3) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -35 + (((tickAnim - 11) / 2) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -33.72 + (((tickAnim - 13) / 0) * (11.94-(-33.72)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 11.94 + (((tickAnim - 13) / 3) * (34.72-(11.94)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 34.72 + (((tickAnim - 16) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 13) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.KneeR.rotationPointX = this.KneeR.rotationPointX + (float)(xx);
        this.KneeR.rotationPointY = this.KneeR.rotationPointY - (float)(yy);
        this.KneeR.rotationPointZ = this.KneeR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 40 + (((tickAnim - 0) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -54.44 + (((tickAnim - 4) / 4) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -50.23 + (((tickAnim - 8) / 0) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -52.16 + (((tickAnim - 8) / 2) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -24.89 + (((tickAnim - 10) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 11) / 2) * (19.72-(7.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 19.72 + (((tickAnim - 13) / 0) * (0.56-(19.72)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.56 + (((tickAnim - 13) / 3) * (-2.22-(0.56)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -2.22 + (((tickAnim - 16) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TarsalsR, TarsalsR.rotateAngleX + (float) Math.toRadians(xx), TarsalsR.rotateAngleY + (float) Math.toRadians(yy), TarsalsR.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 58.21 + (((tickAnim - 8) / 3) * (45-(58.21)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 45 + (((tickAnim - 11) / 2) * (26.83-(45)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 26.83 + (((tickAnim - 13) / 0) * (-9.17-(26.83)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -9.17 + (((tickAnim - 13) / 3) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 50.41 + (((tickAnim - 16) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (1.875-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-0.875-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 1.875 + (((tickAnim - 13) / 0) * (0-(1.875)));
            zz = -0.875 + (((tickAnim - 13) / 0) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootR.rotationPointX = this.FootR.rotationPointX + (float)(xx);
        this.FootR.rotationPointY = this.FootR.rotationPointY - (float)(yy);
        this.FootR.rotationPointZ = this.FootR.rotationPointZ + (float)(zz);


    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraValdosaurus e = (EntityPrehistoricFloraValdosaurus) entity;
        animator.update(entity);
        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);


    }
}
