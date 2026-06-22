package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraElrhazosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelElrhazosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer Tail5;

    private ModelAnimator animator;

    public ModelElrhazosaurus() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 9.15F, 1.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.05F, -0.925F);
        this.Root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1396F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 0, -3.0F, -4.0F, -1.0F, 6, 8, 5, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.Root.addChild(Body);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.4F, -6.825F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -3.5F, -5.0F, -2.0F, 7, 10, 9, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Body.addChild(Chest);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -2.595F, -5.4962F);
        this.Chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1571F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 57, 2.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.075F, 3.3907F, -5.6583F);
        this.Chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 44, -2.575F, -3.9773F, -0.0232F, 5, 4, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 2.5809F, -2.8021F);
        this.Chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2793F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 19, -2.5F, -6.0F, -3.0F, 6, 6, 8, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -0.775F, -5.525F);
        this.Chest.addChild(Neck1);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, -1.62F, -1.1962F);
        this.Neck1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 58, 44, 2.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.2621F, -0.4588F);
        this.Neck1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 32, -2.0F, -0.1663F, -1.8902F, 4, 4, 5, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.0371F, -2.8838F);
        this.Neck1.addChild(Neck2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, -2.0584F, 0.1985F);
        this.Neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6545F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 56, 2.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.9329F, 0.5626F);
        this.Neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6545F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 22, -1.5F, -0.7294F, -1.9391F, 3, 3, 3, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -2.3329F, 0.0126F);
        this.Neck2.addChild(Neck3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0F, -0.9755F, -1.4641F);
        this.Neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6545F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 58, 2.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.0027F, 0.0083F, -0.1874F);
        this.Neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6545F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 54, -0.9973F, -0.0748F, -2.7382F, 2, 3, 3, -0.001F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -1.6255F, -2.3641F);
        this.Neck3.addChild(Neck4);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.5F, -0.275F, -0.825F);
        this.Neck4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 47, -2.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 47, -3.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, 0.075F, -0.925F);
        this.Neck4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 48, 13, 2.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.375F, -0.125F);
        this.Neck4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 8, -1.0F, -0.4936F, -1.9316F, 2, 3, 2, -0.003F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.125F, -1.9F);
        this.Neck4.addChild(Head);
        this.setRotateAngle(Head, -0.0873F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 42, 58, 0.575F, 1.1048F, -2.7735F, 0, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 42, 58, -0.575F, 1.1048F, -2.7735F, 0, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.025F, 1.175F, 0.425F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2007F, -0.1571F, -0.0436F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 58, -1.1654F, -0.0979F, -3.084F, 0, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.025F, 1.175F, 0.425F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2007F, 0.1571F, 0.0436F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 58, 1.1654F, -0.0979F, -3.084F, 0, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.125F, -1.675F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 56, -1.0F, -0.0047F, -0.9617F, 2, 1, 1, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.175F, 0.9F, -1.475F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 56, -0.825F, -0.5389F, -0.4629F, 2, 1, 1, 0.04F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.05F, -1.575F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 55, -1.0F, -0.1132F, -0.0704F, 2, 2, 2, 0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.3935F, -2.9243F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4014F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 58, 52, -0.5F, 0.0119F, -0.0594F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.016F, -2.2322F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.8727F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 58, 50, -0.5F, 0.8335F, -0.1612F, 1, 1, 1, 0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.2514F, -2.0867F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3752F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 48, 17, -0.5F, 1.3689F, -1.2389F, 1, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 6.45F, -3.375F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 41, -1.0F, -5.4797F, 0.5984F, 2, 1, 2, -0.0003F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.525F, 0.675F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0087F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.8134F, 0.1074F, -2.464F);
        this.Jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0801F, 0.146F, -0.0546F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 58, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.8134F, 0.1074F, -2.464F);
        this.Jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0801F, -0.146F, 0.0546F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 58, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.075F, 0.175F, -0.325F);
        this.Jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0262F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 55, -0.925F, 0.1049F, -3.3267F, 2, 1, 2, -0.0005F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.05F, -0.025F);
        this.Jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0698F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 42, 58, -0.5F, -0.1451F, -3.2985F, 0, 1, 2, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 42, 58, 0.5F, -0.1451F, -3.2985F, 0, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.025F, -0.2F);
        this.Jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3229F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 58, 54, -0.5F, 1.3213F, -3.717F, 1, 1, 1, -0.0005F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.25F, -0.1F);
        this.Jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0611F, -0.1745F, 0.0436F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 34, 58, -1.1654F, -0.0979F, -3.084F, 0, 1, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.25F, -0.1F);
        this.Jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0611F, 0.1745F, -0.0436F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 34, 58, 1.1654F, -0.0979F, -3.084F, 0, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.05F, 0.05F);
        this.Jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.288F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 52, 28, -1.0F, -1.1674F, -2.0025F, 2, 2, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.275F, 2.3F, -6.075F);
        this.Chest.addChild(rightArm);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.575F, 0.0F, 0.075F);
        this.rightArm.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.9599F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 22, 33, -1.0F, -0.1133F, 0.1309F, 1, 5, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.675F, 1.05F, 5.225F);
        this.rightArm.addChild(rightArm2);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.05F, -2.325F, -5.175F);
        this.rightArm2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.5236F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 28, 55, -1.0F, -0.5635F, 3.7158F, 1, 4, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.975F, 2.875F, -2.975F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.075F, -1.25F, 1.95F);
        this.rightArm3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3927F, -0.1222F, -0.3491F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 40, -0.828F, 1.706F, -2.036F, 1, 2, 2, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.275F, 2.3F, -6.075F);
        this.Chest.addChild(leftArm);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.575F, 0.0F, 0.075F);
        this.leftArm.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.9599F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 22, 33, 0.0F, -0.1133F, 0.1309F, 1, 5, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.675F, 1.05F, 5.225F);
        this.leftArm.addChild(leftArm2);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.05F, -2.325F, -5.175F);
        this.leftArm2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.5236F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 28, 55, 0.0F, -0.5635F, 3.7158F, 1, 4, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.975F, 2.875F, -2.975F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.075F, -1.25F, 1.95F);
        this.leftArm3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.3927F, 0.1222F, 0.3491F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 22, 40, -0.172F, 1.706F, -2.036F, 1, 2, 2, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.575F, -0.5F, -0.555F);
        this.Root.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.384F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 42, 44, -0.825F, -1.3F, -2.3F, 3, 7, 5, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.65F, 5.1499F, -1.827F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.925F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 54, -1.06F, 0.1F, -0.5F, 2, 8, 3, -0.001F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.575F, 8.0582F, 2.4718F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8727F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 1.0F, 0.2F);
        this.leftLeg3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0436F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 54, 0, -1.65F, -1.0F, -2.2F, 2, 6, 2, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.575F, 4.7294F, -0.199F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4014F, 0.0F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.55F, 1.1365F, -1.0972F);
        this.leftLeg4.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0698F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 32, 13, -0.86F, -1.0F, -4.0F, 3, 1, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.575F, -0.5F, -0.555F);
        this.Root.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.384F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 42, 44, -2.175F, -1.3F, -2.3F, 3, 7, 5, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.65F, 5.1499F, -1.827F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.925F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 54, -0.94F, 0.1F, -0.5F, 2, 8, 3, -0.001F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.575F, 8.0582F, 2.4718F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8727F, 0.0F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.0F, 0.2F);
        this.rightLeg3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0436F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 54, 0, -0.35F, -1.0F, -2.2F, 2, 6, 2, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.575F, 4.7294F, -0.199F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.4014F, 0.0F, 0.0F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.55F, 1.1365F, -1.0972F);
        this.rightLeg4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0698F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 32, 13, -2.14F, -1.0F, -4.0F, 3, 1, 5, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -1.75F, 3.475F);
        this.Root.addChild(Tail1);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 3.775F, -1.175F);
        this.Tail1.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.2618F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 28, 19, -2.5F, -5.0F, -1.0F, 5, 6, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 2.175F, 5.025F);
        this.Tail1.addChild(Tail2);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 2.725F, -0.375F);
        this.Tail2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.1745F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 28, 32, -1.5F, -4.0F, -1.0F, 3, 4, 8, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 1.3F, 6.925F);
        this.Tail2.addChild(Tail3);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -0.125F, -0.225F);
        this.Tail3.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0873F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 22, 44, -1.0F, -1.0076F, -0.8257F, 2, 3, 8, 0.001F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.45F, 6.75F);
        this.Tail3.addChild(Tail4);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 1.15F, 0.85F);
        this.Tail4.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0436F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 52, 13, -1.0F, -2.0F, -1.0F, 2, 2, 7, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.275F, 6.675F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 33, -0.5F, -0.575F, -1.1F, 1, 1, 10, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = 0.5F;
        this.Root.offsetX = 0.75F;
        this.Root.offsetZ = 0.7F;
        this.Root.rotateAngleY = (float)Math.toRadians(225);
        this.Root.rotateAngleX = (float)Math.toRadians(14);
        this.Root.rotateAngleZ = (float)Math.toRadians(-8);
        this.Root.scaleChildren = true;
        float scaler = 0.55F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetY = -0.054F;
        this.Root.render(0.01F);
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

        EntityPrehistoricFloraElrhazosaurus EntityElrhazosaurus = (EntityPrehistoricFloraElrhazosaurus) e;

        this.faceTarget(f3, f4, 8, Neck1);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityElrhazosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityElrhazosaurus.getAnimation() == EntityElrhazosaurus.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityElrhazosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityElrhazosaurus.getIsMoving()) {
                    if (EntityElrhazosaurus.getAnimation() != EntityElrhazosaurus.EAT_ANIMATION
                        && EntityElrhazosaurus.getAnimation() != EntityElrhazosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityElrhazosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraElrhazosaurus ee = (EntityPrehistoricFloraElrhazosaurus) entitylivingbaseIn;

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
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The noise anim
            //animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElrhazosaurus entity = (EntityPrehistoricFloraElrhazosaurus) entitylivingbaseIn;

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElrhazosaurus entity = (EntityPrehistoricFloraElrhazosaurus) entitylivingbaseIn;
        int animCycle = 244;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = 4.25 + (((tickAnim - 35) / 184) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = 4.25 + (((tickAnim - 219) / 25) * (0-(4.25)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(xx), Root.rotateAngleY + (float) Math.toRadians(yy), Root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-2.05-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = -2.05 + (((tickAnim - 35) / 184) * (-2.05-(-2.05)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = -2.05 + (((tickAnim - 219) / 25) * (0-(-2.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(xx);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(yy);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 75) {
            xx = 7.75 + (((tickAnim - 35) / 40) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 35) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 40) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 7.75 + (((tickAnim - 75) / 7) * (8.5-(7.75)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = 8.5 + (((tickAnim - 82) / 6) * (7.75-(8.5)));
            yy = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 6) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 7.75 + (((tickAnim - 88) / 6) * (8.5-(7.75)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = 8.5 + (((tickAnim - 94) / 6) * (7.75-(8.5)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 6) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 7.75 + (((tickAnim - 100) / 7) * (8.5-(7.75)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 8.5 + (((tickAnim - 107) / 6) * (7.75-(8.5)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 7.75 + (((tickAnim - 113) / 22) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 22) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 175) {
            xx = 7.75 + (((tickAnim - 135) / 40) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 135) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 40) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = 7.75 + (((tickAnim - 175) / 7) * (8.5-(7.75)));
            yy = 0 + (((tickAnim - 175) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 7) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = 8.5 + (((tickAnim - 182) / 6) * (7.75-(8.5)));
            yy = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 6) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 7.75 + (((tickAnim - 188) / 6) * (8.5-(7.75)));
            yy = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 8.5 + (((tickAnim - 194) / 6) * (7.75-(8.5)));
            yy = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 6) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 207) {
            xx = 7.75 + (((tickAnim - 200) / 7) * (8.5-(7.75)));
            yy = 0 + (((tickAnim - 200) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 7) * (0-(0)));
        }
        else if (tickAnim >= 207 && tickAnim < 213) {
            xx = 8.5 + (((tickAnim - 207) / 6) * (7.75-(8.5)));
            yy = 0 + (((tickAnim - 207) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 207) / 6) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 7.75 + (((tickAnim - 213) / 6) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = 7.75 + (((tickAnim - 219) / 25) * (0-(7.75)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 10 + (((tickAnim - 35) / 18) * (10.75-(10)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 75) {
            xx = 10.75 + (((tickAnim - 53) / 22) * (0-(10.75)));
            yy = 0 + (((tickAnim - 53) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 22) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (-2-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = -2 + (((tickAnim - 82) / 6) * (0-(-2)));
            yy = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 6) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 88) / 6) * (-2-(0)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = -2 + (((tickAnim - 94) / 6) * (0-(-2)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 6) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 100) / 7) * (-2-(0)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = -2 + (((tickAnim - 107) / 6) * (0-(-2)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 113) / 22) * (10-(0)));
            yy = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 22) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = 10 + (((tickAnim - 135) / 18) * (10.75-(10)));
            yy = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 175) {
            xx = 10.75 + (((tickAnim - 153) / 22) * (0-(10.75)));
            yy = 0 + (((tickAnim - 153) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 22) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = 0 + (((tickAnim - 175) / 7) * (-2-(0)));
            yy = 0 + (((tickAnim - 175) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 7) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = -2 + (((tickAnim - 182) / 6) * (0-(-2)));
            yy = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 6) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 188) / 6) * (-2-(0)));
            yy = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = -2 + (((tickAnim - 194) / 6) * (0-(-2)));
            yy = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 6) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 207) {
            xx = 0 + (((tickAnim - 200) / 7) * (-2-(0)));
            yy = 0 + (((tickAnim - 200) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 7) * (0-(0)));
        }
        else if (tickAnim >= 207 && tickAnim < 213) {
            xx = -2 + (((tickAnim - 207) / 6) * (0-(-2)));
            yy = 0 + (((tickAnim - 207) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 207) / 6) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 213) / 6) * (-2-(0)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = -2 + (((tickAnim - 219) / 25) * (0-(-2)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 12.25 + (((tickAnim - 35) / 18) * (28.48536-(12.25)));
            yy = 0 + (((tickAnim - 35) / 18) * (0.95417-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (-1.7578-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 75) {
            xx = 28.48536 + (((tickAnim - 53) / 22) * (0-(28.48536)));
            yy = 0.95417 + (((tickAnim - 53) / 22) * (0-(0.95417)));
            zz = -1.7578 + (((tickAnim - 53) / 22) * (0-(-1.7578)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (4.75-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 135) {
            xx = 4.75 + (((tickAnim - 82) / 53) * (12.25-(4.75)));
            yy = 0 + (((tickAnim - 82) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 53) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = 12.25 + (((tickAnim - 135) / 18) * (28.48536-(12.25)));
            yy = 0 + (((tickAnim - 135) / 18) * (0.95417-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (-1.7578-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 175) {
            xx = 28.48536 + (((tickAnim - 153) / 22) * (0-(28.48536)));
            yy = 0.95417 + (((tickAnim - 153) / 22) * (0-(0.95417)));
            zz = -1.7578 + (((tickAnim - 153) / 22) * (0-(-1.7578)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = 0 + (((tickAnim - 175) / 7) * (4.75-(0)));
            yy = 0 + (((tickAnim - 175) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 7) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 219) {
            xx = 4.75 + (((tickAnim - 182) / 37) * (0-(4.75)));
            yy = 0 + (((tickAnim - 182) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 37) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = -13.75 + (((tickAnim - 35) / 18) * (14.47766-(-13.75)));
            yy = 0 + (((tickAnim - 35) / 18) * (0.81333-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (-3.14669-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 75) {
            xx = 14.47766 + (((tickAnim - 53) / 22) * (0-(14.47766)));
            yy = 0.81333 + (((tickAnim - 53) / 22) * (0-(0.81333)));
            zz = -3.14669 + (((tickAnim - 53) / 22) * (0-(-3.14669)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (-3.5-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            zz = -3.5 + (((tickAnim - 82) / 6) * (0-(-3.5)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (-3.5-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = -3.5 + (((tickAnim - 94) / 6) * (0-(-3.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (-3.5-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = -3.5 + (((tickAnim - 107) / 6) * (0-(-3.5)));
        }
        else if (tickAnim >= 113 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 113) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 6) * (-3.5-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 119) / 16) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 119) / 16) * (0-(0)));
            zz = -3.5 + (((tickAnim - 119) / 16) * (0-(-3.5)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = -13.75 + (((tickAnim - 135) / 18) * (14.47766-(-13.75)));
            yy = 0 + (((tickAnim - 135) / 18) * (0.81333-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (-3.14669-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 175) {
            xx = 14.47766 + (((tickAnim - 153) / 22) * (0-(14.47766)));
            yy = 0.81333 + (((tickAnim - 153) / 22) * (0-(0.81333)));
            zz = -3.14669 + (((tickAnim - 153) / 22) * (0-(-3.14669)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = 0 + (((tickAnim - 175) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 7) * (-3.5-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            zz = -3.5 + (((tickAnim - 182) / 6) * (0-(-3.5)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (-3.5-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            zz = -3.5 + (((tickAnim - 194) / 6) * (0-(-3.5)));
        }
        else if (tickAnim >= 200 && tickAnim < 207) {
            xx = 0 + (((tickAnim - 200) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 7) * (-3.5-(0)));
        }
        else if (tickAnim >= 207 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 207) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 207) / 6) * (0-(0)));
            zz = -3.5 + (((tickAnim - 207) / 6) * (0-(-3.5)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (-3.5-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = -3.5 + (((tickAnim - 219) / 25) * (0-(-3.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 16.5 + (((tickAnim - 35) / 18) * (16.46198-(16.5)));
            yy = 0 + (((tickAnim - 35) / 18) * (1.13521-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (-3.83578-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 75) {
            xx = 16.46198 + (((tickAnim - 53) / 22) * (0-(16.46198)));
            yy = 1.13521 + (((tickAnim - 53) / 22) * (0-(1.13521)));
            zz = -3.83578 + (((tickAnim - 53) / 22) * (0-(-3.83578)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = -4.75 + (((tickAnim - 82) / 6) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 6) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 88) / 6) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = -4.75 + (((tickAnim - 94) / 6) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 6) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 100) / 7) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = -4.75 + (((tickAnim - 107) / 6) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 113) / 6) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 113) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 6) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 135) {
            xx = -4.75 + (((tickAnim - 119) / 16) * (16.5-(-4.75)));
            yy = 0 + (((tickAnim - 119) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 16) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = 16.5 + (((tickAnim - 135) / 18) * (16.46198-(16.5)));
            yy = 0 + (((tickAnim - 135) / 18) * (1.13521-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (-3.83578-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 175) {
            xx = 16.46198 + (((tickAnim - 153) / 22) * (0-(16.46198)));
            yy = 1.13521 + (((tickAnim - 153) / 22) * (0-(1.13521)));
            zz = -3.83578 + (((tickAnim - 153) / 22) * (0-(-3.83578)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = 0 + (((tickAnim - 175) / 7) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 175) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 7) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = -4.75 + (((tickAnim - 182) / 6) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 6) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 188) / 6) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = -4.75 + (((tickAnim - 194) / 6) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 6) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 207) {
            xx = 0 + (((tickAnim - 200) / 7) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 200) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 7) * (0-(0)));
        }
        else if (tickAnim >= 207 && tickAnim < 213) {
            xx = -4.75 + (((tickAnim - 207) / 6) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 207) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 207) / 6) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 213) / 6) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = -4.75 + (((tickAnim - 219) / 25) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 35) / 18) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -11.75 + (((tickAnim - 53) / 7) * (11.67-(-11.75)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 11.67 + (((tickAnim - 60) / 15) * (0-(11.67)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 75) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 13) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 88) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 12) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 13) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 22) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 135) / 18) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = -11.75 + (((tickAnim - 153) / 7) * (11.67-(-11.75)));
            yy = 0 + (((tickAnim - 153) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 7) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = 11.67 + (((tickAnim - 160) / 15) * (0-(11.67)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 200) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 13) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 35) / 18) * (-16-(0)));
            yy = 0 + (((tickAnim - 35) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 18) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -16 + (((tickAnim - 53) / 7) * (0-(-16)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (-20-(0)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = -20 + (((tickAnim - 75) / 7) * (0-(-20)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (-3.75-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 82) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            zz = -3.75 + (((tickAnim - 82) / 6) * (0-(-3.75)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = -20 + (((tickAnim - 88) / 6) * (0-(-20)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (-3.75-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 94) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = -3.75 + (((tickAnim - 94) / 6) * (0-(-3.75)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = -20 + (((tickAnim - 100) / 7) * (0-(-20)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (-3.75-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = -3.75 + (((tickAnim - 107) / 6) * (0-(-3.75)));
        }
        else if (tickAnim >= 113 && tickAnim < 119) {
            xx = -20 + (((tickAnim - 113) / 6) * (0-(-20)));
            yy = 0 + (((tickAnim - 113) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 6) * (-3.75-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 119) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 119) / 16) * (0-(0)));
            zz = -3.75 + (((tickAnim - 119) / 16) * (0-(-3.75)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 135) / 18) * (-16-(0)));
            yy = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = -16 + (((tickAnim - 153) / 7) * (0-(-16)));
            yy = 0 + (((tickAnim - 153) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 7) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 160) / 15) * (-20-(0)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = -20 + (((tickAnim - 175) / 7) * (0-(-20)));
            yy = 0 + (((tickAnim - 175) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 7) * (-3.75-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 182) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            zz = -3.75 + (((tickAnim - 182) / 6) * (0-(-3.75)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = -20 + (((tickAnim - 188) / 6) * (0-(-20)));
            yy = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (-3.75-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 194) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            zz = -3.75 + (((tickAnim - 194) / 6) * (0-(-3.75)));
        }
        else if (tickAnim >= 200 && tickAnim < 207) {
            xx = -20 + (((tickAnim - 200) / 7) * (0-(-20)));
            yy = 0 + (((tickAnim - 200) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 7) * (-3.75-(0)));
        }
        else if (tickAnim >= 207 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 207) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 207) / 6) * (0-(0)));
            zz = -3.75 + (((tickAnim - 207) / 6) * (0-(-3.75)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = -20 + (((tickAnim - 213) / 6) * (0-(-20)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (-3.75-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = -3.75 + (((tickAnim - 219) / 25) * (0-(-3.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 35) / 13) * (23-(0)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 23 + (((tickAnim - 48) / 5) * (0-(23)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 53) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 16) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 69) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 69) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 6) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 7.5 + (((tickAnim - 75) / 7) * (0-(7.5)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 82) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 6) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 7.5 + (((tickAnim - 88) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 94) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 94) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 6) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 7.5 + (((tickAnim - 100) / 7) * (0-(7.5)));
            yy = 0 + (((tickAnim - 100) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 7) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 119) {
            xx = 7.5 + (((tickAnim - 113) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 113) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 6) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 119) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 119) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 16) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 135) / 13) * (23-(0)));
            yy = 0 + (((tickAnim - 135) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 13) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = 23 + (((tickAnim - 148) / 5) * (0-(23)));
            yy = 0 + (((tickAnim - 148) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 5) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 153) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 16) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 169) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 169) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 6) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 182) {
            xx = 7.5 + (((tickAnim - 175) / 7) * (0-(7.5)));
            yy = 0 + (((tickAnim - 175) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 7) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 182) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 6) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 7.5 + (((tickAnim - 188) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 194) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 6) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 207) {
            xx = 7.5 + (((tickAnim - 200) / 7) * (0-(7.5)));
            yy = 0 + (((tickAnim - 200) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 7) * (0-(0)));
        }
        else if (tickAnim >= 207 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 207) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 207) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 207) / 6) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 7.5 + (((tickAnim - 213) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = 10 + (((tickAnim - 35) / 184) * (10-(10)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = 10 + (((tickAnim - 219) / 25) * (0-(10)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = -6.25 + (((tickAnim - 35) / 184) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = -6.25 + (((tickAnim - 219) / 25) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = -7.5 + (((tickAnim - 35) / 184) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = -7.5 + (((tickAnim - 219) / 25) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(0);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(0);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30.06-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -30.06 + (((tickAnim - 18) / 17) * (-28.75-(-30.06)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = -28.75 + (((tickAnim - 35) / 184) * (-28.75-(-28.75)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = -28.75 + (((tickAnim - 219) / 25) * (0-(-28.75)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 32.5 + (((tickAnim - 18) / 17) * (0-(32.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 232) {
            xx = 0 + (((tickAnim - 219) / 13) * (33.75-(0)));
            yy = 0 + (((tickAnim - 219) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 13) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 244) {
            xx = 33.75 + (((tickAnim - 232) / 12) * (0-(33.75)));
            yy = 0 + (((tickAnim - 232) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-32.7-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -32.7 + (((tickAnim - 18) / 17) * (23-(-32.7)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = 23 + (((tickAnim - 35) / 184) * (23-(23)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 232) {
            xx = 23 + (((tickAnim - 219) / 13) * (-33.5-(23)));
            yy = 0 + (((tickAnim - 219) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 13) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 244) {
            xx = -33.5 + (((tickAnim - 232) / 12) * (0-(-33.5)));
            yy = 0 + (((tickAnim - 232) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (45.86-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 45.86 + (((tickAnim - 8) / 10) * (73-(45.86)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 73 + (((tickAnim - 18) / 17) * (0-(73)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 232) {
            xx = 0 + (((tickAnim - 219) / 13) * (78.75-(0)));
            yy = 0 + (((tickAnim - 219) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 13) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 244) {
            xx = 78.75 + (((tickAnim - 232) / 12) * (0-(78.75)));
            yy = 0 + (((tickAnim - 232) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 1.15 + (((tickAnim - 18) / 17) * (0-(1.15)));
            zz = -1.325 + (((tickAnim - 18) / 17) * (0-(-1.325)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 232) {
            xx = 0 + (((tickAnim - 219) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 13) * (1.05-(0)));
            zz = 0 + (((tickAnim - 219) / 13) * (-1.35-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 244) {
            xx = 0 + (((tickAnim - 232) / 12) * (0-(0)));
            yy = 1.05 + (((tickAnim - 232) / 12) * (0-(1.05)));
            zz = -1.35 + (((tickAnim - 232) / 12) * (0-(-1.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = 6.25 + (((tickAnim - 35) / 184) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = 6.25 + (((tickAnim - 219) / 25) * (0-(6.25)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = -6.25 + (((tickAnim - 35) / 184) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = -6.25 + (((tickAnim - 219) / 25) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = -8.25 + (((tickAnim - 35) / 184) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = -8.25 + (((tickAnim - 219) / 25) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = -5.75 + (((tickAnim - 35) / 184) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 35) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 184) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = -5.75 + (((tickAnim - 219) / 25) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 219) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-9.68417-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (1.11534-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-0.31189-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 219) {
            xx = -9.68417 + (((tickAnim - 35) / 184) * (-9.68417-(-9.68417)));
            yy = 1.11534 + (((tickAnim - 35) / 184) * (1.11534-(1.11534)));
            zz = -0.31189 + (((tickAnim - 35) / 184) * (-0.31189-(-0.31189)));
        }
        else if (tickAnim >= 219 && tickAnim < 244) {
            xx = -9.68417 + (((tickAnim - 219) / 25) * (0-(-9.68417)));
            yy = 1.11534 + (((tickAnim - 219) / 25) * (0-(1.11534)));
            zz = -0.31189 + (((tickAnim - 219) / 25) * (0-(-0.31189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElrhazosaurus entity = (EntityPrehistoricFloraElrhazosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.5 + (((tickAnim - 10) / 10) * (0-(9.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 10) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.75 + (((tickAnim - 10) / 10) * (0-(27.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18 + (((tickAnim - 10) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.25 + (((tickAnim - 10) / 3) * (30-(17.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 30 + (((tickAnim - 13) / 7) * (0-(30)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25.5 + (((tickAnim - 5) / 5) * (0-(25.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16 + (((tickAnim - 10) / 10) * (0-(-16)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (19.5-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 19.5 + (((tickAnim - 9) / 4) * (0-(19.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElrhazosaurus entity = (EntityPrehistoricFloraElrhazosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (44.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 44.25 + (((tickAnim - 20) / 15) * (-23.25-(44.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 35) / 15) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -9.5 + (((tickAnim - 20) / 7) * (26.3-(-9.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 26.3 + (((tickAnim - 27) / 8) * (-6.5-(26.3)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 35) / 15) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-32.41-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -32.41 + (((tickAnim - 28) / 4) * (-32.41-(-32.41)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -32.41 + (((tickAnim - 32) / 3) * (28.75-(-32.41)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 28.75 + (((tickAnim - 35) / 15) * (0-(28.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-4.97-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -4.97 + (((tickAnim - 9) / 11) * (56.25-(-4.97)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 56.25 + (((tickAnim - 20) / 8) * (74.13-(56.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 74.13 + (((tickAnim - 28) / 4) * (74.13-(74.13)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 74.13 + (((tickAnim - 32) / 3) * (1-(74.13)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 35) / 15) * (0-(1)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.05-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.7 + (((tickAnim - 20) / 8) * (0.6-(0.7)));
            zz = -1.05 + (((tickAnim - 20) / 8) * (-1.62-(-1.05)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 28) / 4) * (0.6-(0.6)));
            zz = -1.62 + (((tickAnim - 28) / 4) * (-1.62-(-1.62)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 32) / 3) * (0.5-(0.6)));
            zz = -1.62 + (((tickAnim - 32) / 3) * (0-(-1.62)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.5 + (((tickAnim - 35) / 15) * (0-(0.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElrhazosaurus entity = (EntityPrehistoricFloraElrhazosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(xx), Root.rotateAngleY + (float) Math.toRadians(yy), Root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6.4-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6.4 + (((tickAnim - 20) / 10) * (-6.4-(-6.4)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -6.4 + (((tickAnim - 30) / 20) * (0-(-6.4)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(xx);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(yy);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16.25 + (((tickAnim - 20) / 10) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 16.25 + (((tickAnim - 30) / 20) * (0-(16.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.25 + (((tickAnim - 20) / 10) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 30) / 20) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (36.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 36.25 + (((tickAnim - 20) / 10) * (36.25-(36.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 36.25 + (((tickAnim - 30) / 20) * (0-(36.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-57.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -57.25 + (((tickAnim - 20) / 10) * (-57.25-(-57.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -57.25 + (((tickAnim - 30) / 20) * (0-(-57.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.65-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.1 + (((tickAnim - 20) / 10) * (-1.1-(-1.1)));
            zz = -0.65 + (((tickAnim - 20) / 10) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -1.1 + (((tickAnim - 30) / 20) * (0-(-1.1)));
            zz = -0.65 + (((tickAnim - 30) / 20) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 42.25 + (((tickAnim - 20) / 10) * (42.25-(42.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 42.25 + (((tickAnim - 30) / 20) * (0-(42.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.45-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.875 + (((tickAnim - 20) / 10) * (0.875-(0.875)));
            zz = -1.45 + (((tickAnim - 20) / 10) * (-1.45-(-1.45)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.875 + (((tickAnim - 30) / 20) * (0-(0.875)));
            zz = -1.45 + (((tickAnim - 30) / 20) * (0-(-1.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.25 + (((tickAnim - 20) / 10) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 30) / 20) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (36.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 36.25 + (((tickAnim - 20) / 10) * (36.25-(36.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 36.25 + (((tickAnim - 30) / 20) * (0-(36.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-57.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -57.25 + (((tickAnim - 20) / 10) * (-57.25-(-57.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -57.25 + (((tickAnim - 30) / 20) * (0-(-57.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.65-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.1 + (((tickAnim - 20) / 10) * (-1.1-(-1.1)));
            zz = -0.65 + (((tickAnim - 20) / 10) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -1.1 + (((tickAnim - 30) / 20) * (0-(-1.1)));
            zz = -0.65 + (((tickAnim - 30) / 20) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 42.25 + (((tickAnim - 20) / 10) * (42.25-(42.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 42.25 + (((tickAnim - 30) / 20) * (0-(42.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.45-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.875 + (((tickAnim - 20) / 10) * (0.875-(0.875)));
            zz = -1.45 + (((tickAnim - 20) / 10) * (-1.45-(-1.45)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.875 + (((tickAnim - 30) / 20) * (0-(0.875)));
            zz = -1.45 + (((tickAnim - 30) / 20) * (0-(-1.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8 + (((tickAnim - 10) / 10) * (0-(-8)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-7-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 40) / 10) * (0-(-7)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 10) / 10) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
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
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (8.5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.5 + (((tickAnim - 20) / 10) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8.5 + (((tickAnim - 30) / 10) * (2-(8.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 40) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElrhazosaurus entity = (EntityPrehistoricFloraElrhazosaurus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5.75 + (((tickAnim - 15) / 10) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*5-(5.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*5 + (((tickAnim - 25) / 20) * (0-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*5)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 6.25 + (((tickAnim - 15) / 10) * (-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*-9-(6.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*-9 + (((tickAnim - 25) / 20) * (0-(-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*-9)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 24.25 + (((tickAnim - 15) / 10) * (1.25-(24.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1.25 + (((tickAnim - 25) / 5) * (-9-(1.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -9 + (((tickAnim - 30) / 5) * (1.25-(-9)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.25 + (((tickAnim - 35) / 5) * (-9-(1.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -9 + (((tickAnim - 40) / 5) * (0-(-9)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 8.75 + (((tickAnim - 15) / 10) * (-6.75-(8.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 25) / 5) * (-16.5-(-6.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -16.5 + (((tickAnim - 30) / 5) * (-6.75-(-16.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -6.75 + (((tickAnim - 35) / 5) * (-16.5-(-6.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -16.5 + (((tickAnim - 40) / 5) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9.86-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 9.86 + (((tickAnim - 7) / 8) * (-13.25-(9.86)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.25 + (((tickAnim - 15) / 5) * (21.5-(-13.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 21.5 + (((tickAnim - 20) / 5) * (0-(21.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (9.75-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 9.75 + (((tickAnim - 30) / 5) * (0-(9.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (9.75-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 9.75 + (((tickAnim - 40) / 5) * (0-(9.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20.72-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 20.72 + (((tickAnim - 7) / 8) * (-19.75-(20.72)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -19.75 + (((tickAnim - 15) / 5) * (0-(-19.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 25) / 5) * (1.5-(-10)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1.5 + (((tickAnim - 30) / 5) * (-10-(1.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 35) / 5) * (1.5-(-10)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 1.5 + (((tickAnim - 40) / 5) * (0-(1.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 3 + (((tickAnim - 7) / 8) * (-24.75-(3)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -24.75 + (((tickAnim - 15) / 5) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (11.25-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 11.25 + (((tickAnim - 30) / 5) * (0-(11.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (11.25-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 11.25 + (((tickAnim - 40) / 5) * (0-(11.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 14.25 + (((tickAnim - 7) / 4) * (0-(14.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (23.5-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 23.5 + (((tickAnim - 15) / 5) * (0-(23.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (20.25-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20.25 + (((tickAnim - 25) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (20.25-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 20.25 + (((tickAnim - 35) / 7) * (0-(20.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraElrhazosaurus entity = (EntityPrehistoricFloraElrhazosaurus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-20))*6), Root.rotateAngleY + (float) Math.toRadians(0), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*6));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-90))*1.5);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-80))*-1);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*3), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*-6));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-80))*-6), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-250))*6));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*6), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-350))*-6));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*6), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-200))*6), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*6), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-350))*6), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+50))*-9), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-250))*3));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+100))*-9), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+50))*-9), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-250))*3));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+100))*-9), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -35.75 + (((tickAnim - 0) / 7) * (34.5-(-35.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 34.5 + (((tickAnim - 7) / 6) * (-35.75-(34.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 13.5 + (((tickAnim - 0) / 2) * (-7.5-(13.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -7.5 + (((tickAnim - 2) / 2) * (-2.12-(-7.5)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -2.12 + (((tickAnim - 4) / 3) * (15.25-(-2.12)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 15.25 + (((tickAnim - 7) / 2) * (13.015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(15.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 13.015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 9) / 4) * (13.5-(13.015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 3) / 4) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -19.5 + (((tickAnim - 0) / 2) * (11.5-(-19.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 11.5 + (((tickAnim - 2) / 5) * (0-(11.5)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -33.75 + (((tickAnim - 10) / 1) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -33.75 + (((tickAnim - 11) / 2) * (-19.5-(-33.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 64.75 + (((tickAnim - 0) / 2) * (9.25-(64.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 9.25 + (((tickAnim - 2) / 1) * (-2.21-(9.25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -2.21 + (((tickAnim - 3) / 1) * (-8.62-(-2.21)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -8.62 + (((tickAnim - 4) / 3) * (50.75-(-8.62)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 50.75 + (((tickAnim - 7) / 1) * (85-(50.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 85 + (((tickAnim - 8) / 2) * (70.75-(85)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 70.75 + (((tickAnim - 10) / 1) * (70.75-(70.75)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 70.75 + (((tickAnim - 11) / 2) * (64.75-(70.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 0) / 2) * (0.725-(0.875)));
            zz = -1.025 + (((tickAnim - 0) / 2) * (0-(-1.025)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.725 + (((tickAnim - 2) / 1) * (-0.425-(0.725)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.425 + (((tickAnim - 3) / 1) * (-0.625-(-0.425)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.625 + (((tickAnim - 4) / 3) * (1.9-(-0.625)));
            zz = 0 + (((tickAnim - 4) / 3) * (-1-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.9 + (((tickAnim - 7) / 1) * (0.88-(1.9)));
            zz = -1 + (((tickAnim - 7) / 1) * (-1.32-(-1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.88 + (((tickAnim - 8) / 2) * (1.51-(0.88)));
            zz = -1.32 + (((tickAnim - 8) / 2) * (-1.635-(-1.32)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 1.51 + (((tickAnim - 10) / 1) * (1.51-(1.51)));
            zz = -1.635 + (((tickAnim - 10) / 1) * (-1.635-(-1.635)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.51 + (((tickAnim - 11) / 2) * (0.875-(1.51)));
            zz = -1.635 + (((tickAnim - 11) / 2) * (-1.025-(-1.635)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 34.5 + (((tickAnim - 0) / 6) * (-35.75-(34.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -35.75 + (((tickAnim - 6) / 7) * (34.5-(-35.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.25 + (((tickAnim - 0) / 3) * (34.34-(15.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 34.34 + (((tickAnim - 3) / 3) * (13.5-(34.34)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 6) / 2) * (-7.5-(13.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -7.5 + (((tickAnim - 8) / 1) * (-4.5-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -4.5 + (((tickAnim - 9) / 4) * (15.25-(-4.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 9) / 2) * (-0.455-(-0.35)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.455 + (((tickAnim - 11) / 2) * (0-(-0.455)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -33.75 + (((tickAnim - 3) / 1) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -33.75 + (((tickAnim - 4) / 2) * (-19.5-(-33.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -19.5 + (((tickAnim - 6) / 2) * (11.5-(-19.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 11.5 + (((tickAnim - 8) / 1) * (11.46-(11.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 11.46 + (((tickAnim - 9) / 4) * (0-(11.46)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (-0.275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 50.75 + (((tickAnim - 0) / 2) * (85-(50.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 85 + (((tickAnim - 2) / 1) * (70.75-(85)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 70.75 + (((tickAnim - 3) / 1) * (70.75-(70.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 70.75 + (((tickAnim - 4) / 2) * (64.75-(70.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 64.75 + (((tickAnim - 6) / 2) * (14.5-(64.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 14.5 + (((tickAnim - 8) / 0) * (1.47-(14.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1.47 + (((tickAnim - 8) / 1) * (-8.64-(1.47)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -8.64 + (((tickAnim - 9) / 2) * (-17.62-(-8.64)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -17.62 + (((tickAnim - 11) / 2) * (50.75-(-17.62)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.8 + (((tickAnim - 0) / 2) * (0.88-(1.8)));
            zz = -1 + (((tickAnim - 0) / 2) * (-1.32-(-1)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.88 + (((tickAnim - 2) / 1) * (1.51-(0.88)));
            zz = -1.32 + (((tickAnim - 2) / 1) * (-1.635-(-1.32)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.51 + (((tickAnim - 3) / 1) * (1.51-(1.51)));
            zz = -1.635 + (((tickAnim - 3) / 1) * (-1.635-(-1.635)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.51 + (((tickAnim - 4) / 2) * (0.875-(1.51)));
            zz = -1.635 + (((tickAnim - 4) / 2) * (-1.025-(-1.635)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 6) / 2) * (1.5-(0.875)));
            zz = -1.025 + (((tickAnim - 6) / 2) * (0-(-1.025)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.5 + (((tickAnim - 8) / 0) * (0.795-(1.5)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.795 + (((tickAnim - 8) / 1) * (-0.25-(0.795)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 9) / 1) * (-0.93-(-0.25)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -0.93 + (((tickAnim - 10) / 1) * (-0.85-(-0.93)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.85 + (((tickAnim - 11) / 2) * (1.8-(-0.85)));
            zz = 0 + (((tickAnim - 11) / 2) * (-1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+50))*-6), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5))*-6), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*-9), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*-10), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*-15), Tail5.rotateAngleY + (float) Math.toRadians(0), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*3));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraElrhazosaurus entity = (EntityPrehistoricFloraElrhazosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -21 + (((tickAnim - 0) / 16) * (32-(-21)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 32 + (((tickAnim - 16) / 14) * (-21-(32)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -9.25 + (((tickAnim - 0) / 16) * (5-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 16) / 4) * (173.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 173.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 20) / 10) * (-9.25-(173.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 16.75 + (((tickAnim - 0) / 7) * (4.45-(16.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 4.45 + (((tickAnim - 7) / 9) * (0-(4.45)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (-37.38-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -37.38 + (((tickAnim - 23) / 3) * (-37.38-(-37.38)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -37.38 + (((tickAnim - 26) / 4) * (16.75-(-37.38)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.75 + (((tickAnim - 0) / 7) * (-0.63-(10.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -0.63 + (((tickAnim - 7) / 9) * (40.25-(-0.63)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 40.25 + (((tickAnim - 16) / 2) * (73.07-(40.25)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 73.07 + (((tickAnim - 18) / 5) * (77.96-(73.07)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 77.96 + (((tickAnim - 23) / 3) * (65.71-(77.96)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 65.71 + (((tickAnim - 26) / 4) * (10.75-(65.71)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 7) * (0.265+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1-(0.35)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.27-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.265+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1 + (((tickAnim - 7) / 4) * (1.89-(0.265+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1)));
            zz = -0.27 + (((tickAnim - 7) / 4) * (-0.44-(-0.27)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 1.89 + (((tickAnim - 11) / 5) * (0.775-(1.89)));
            zz = -0.44 + (((tickAnim - 11) / 5) * (-0.65-(-0.44)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 16) / 7) * (1.585-(0.775)));
            zz = -0.65 + (((tickAnim - 16) / 7) * (-1.385-(-0.65)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 1.585 + (((tickAnim - 23) / 3) * (0.51-(1.585)));
            zz = -1.385 + (((tickAnim - 23) / 3) * (-1.385-(-1.385)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.51 + (((tickAnim - 26) / 4) * (0.35-(0.51)));
            zz = -1.385 + (((tickAnim - 26) / 4) * (0-(-1.385)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 32 + (((tickAnim - 0) / 14) * (-21-(32)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -21 + (((tickAnim - 14) / 16) * (32-(-21)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5 + (((tickAnim - 0) / 4) * (40.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 40.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 4) / 10) * (-9.25-(40.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -9.25 + (((tickAnim - 14) / 16) * (5-(-9.25)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 40.25 + (((tickAnim - 0) / 3) * (73.07-(40.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 73.07 + (((tickAnim - 3) / 4) * (77.96-(73.07)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 77.96 + (((tickAnim - 7) / 3) * (65.71-(77.96)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 65.71 + (((tickAnim - 10) / 4) * (11.75-(65.71)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 11.75 + (((tickAnim - 14) / 8) * (-9.21146-(11.75)));
            yy = 0 + (((tickAnim - 14) / 8) * (0.08424-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0.01688-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -9.21146 + (((tickAnim - 22) / 8) * (40.25-(-9.21146)));
            yy = 0.08424 + (((tickAnim - 22) / 8) * (0-(0.08424)));
            zz = 0.01688 + (((tickAnim - 22) / 8) * (0-(0.01688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 7) * (1.435-(0.775)));
            zz = -0.65 + (((tickAnim - 0) / 7) * (-1.385-(-0.65)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.435 + (((tickAnim - 7) / 3) * (0.51-(1.435)));
            zz = -1.385 + (((tickAnim - 7) / 3) * (-1.385-(-1.385)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.51 + (((tickAnim - 10) / 4) * (0.725-(0.51)));
            zz = -1.385 + (((tickAnim - 10) / 4) * (0-(-1.385)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0.725 + (((tickAnim - 14) / 8) * (0.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1-(0.725)));
            zz = 0 + (((tickAnim - 14) / 8) * (-0.27-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1 + (((tickAnim - 22) / 3) * (1.55-(0.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1)));
            zz = -0.27 + (((tickAnim - 22) / 3) * (0-(-0.27)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.55 + (((tickAnim - 25) / 5) * (0.775-(1.55)));
            zz = 0 + (((tickAnim - 25) / 5) * (-0.65-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+50))*3), Root.rotateAngleY + (float) Math.toRadians(0), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-15))*0.5);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-170))*0.7);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+10))*-3), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-2));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-30))*3.5), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*2.5), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*2.5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-2));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*2.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*2.5), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*2.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*3.5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-520))*-3.5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*3.5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-520))*-3.5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-37.38-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -37.38 + (((tickAnim - 7) / 3) * (-37.38-(-37.38)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -37.38 + (((tickAnim - 10) / 4) * (16.75-(-37.38)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 16.75 + (((tickAnim - 14) / 16) * (0-(16.75)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*3), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*3), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*4), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*2), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*5), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*6), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*2), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraElrhazosaurus e = (EntityPrehistoricFloraElrhazosaurus) entity;
        animator.update(entity);


    }
}
