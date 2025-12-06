package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPiranhamesodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Piranhamesodon;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer PelvicR;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;

    private ModelAnimator animator;

    public ModelPiranhamesodon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Piranhamesodon = new AdvancedModelRenderer(this);
        this.Piranhamesodon.setRotationPoint(0.0F, 24.0F, -1.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -9.0F, -1.0F);
        this.Piranhamesodon.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 12, 15, -2.0F, -4.1F, -4.1F, 4, 10, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.1F, -4.2F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1833F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 31, -2.5F, -0.9578F, -0.8516F, 4, 2, 2, 0.03F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 0, -2.5F, -0.4578F, -0.3516F, 4, 1, 1, 0.04F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 6.0F, -4.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4974F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 55, 0.0F, -0.8F, 1.7F, 0, 1, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 18, -1.5F, -3.0F, -0.3F, 3, 3, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.6F, -4.6F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.868F, 0.2063F, -0.2621F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 20, 0.0F, -6.0325F, -0.0703F, 0, 6, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.6F, -4.6F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.868F, -0.2063F, 0.2621F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 20, 0.0F, -6.0325F, -0.0703F, 0, 6, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.6F, -4.6F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.8727F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 7, -1.5F, -6.0325F, -0.0703F, 3, 6, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.3F, -6.1F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.8378F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 17, -1.0F, -2.0171F, -0.0327F, 2, 2, 3, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.7F, -6.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 48, -1.0F, -3.0188F, -0.0279F, 2, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.3F, -6.8F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3316F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 55, -1.0F, -0.5758F, 0.0095F, 2, 1, 2, 0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4887F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 37, -1.5F, -3.2F, -0.7F, 3, 6, 4, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 3.5F, -4.1F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0873F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.2F, -2.9F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2793F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 20, -1.0F, -0.6535F, 0.0064F, 2, 1, 3, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 34, -1.5F, 0.0F, -3.0F, 3, 1, 4, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.4F, 0.0F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.8465F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 38, -1.0F, -1.9F, -2.1F, 2, 2, 2, -0.001F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -2.0F, -7.0F, 0.0F, 4, 15, 4, 0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.Body1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2352F, 0.0667F, 0.2714F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 49, 0.0F, -0.7F, 0.0F, 0, 1, 4, -0.02F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.Body1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2352F, -0.0667F, -0.2714F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 49, 0.0F, -0.7F, 0.0F, 0, 1, 4, -0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.Body1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2443F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 0, -2.0F, -2.0F, 0.0F, 4, 2, 4, -0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -8.2F, 0.4F);
        this.Body1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3112F, -0.0876F, -0.2655F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 52, 25, 0.0F, -0.4818F, -0.2105F, 0, 1, 4, -0.002F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.1F, -7.3F, 0.0F);
        this.Body1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.335F, 0.2645F, -0.0907F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0961F, -0.9622F, -0.2891F, 0, 1, 1, -0.002F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -8.2F, 0.4F);
        this.Body1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3112F, 0.0876F, 0.2655F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 52, 25, 0.0F, -0.4818F, -0.2105F, 0, 1, 4, -0.002F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.1F, -7.3F, 0.0F);
        this.Body1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.335F, -0.2645F, 0.0907F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -0.0961F, -0.9622F, -0.2891F, 0, 1, 1, -0.002F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -7.3F, 0.0F);
        this.Body1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3229F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 41, 27, -1.5F, -0.9622F, -0.1167F, 3, 2, 4, -0.002F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.0F, 4.0F, -0.1F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, 0.5236F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 36, 40, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.0F, 4.0F, -0.1F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, -0.5236F, 0.0F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 36, 40, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, true));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(2.0F, 8.6F, 3.4F);
        this.Body1.addChild(PelvicL);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicL.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.9599F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 40, -1.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, false));

        this.PelvicR = new AdvancedModelRenderer(this);
        this.PelvicR.setRotationPoint(-2.0F, 8.6F, 3.4F);
        this.Body1.addChild(PelvicR);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicR.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.9599F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 40, -3.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 26, 0, -2.0F, -6.0F, -1.0F, 4, 14, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 9.1F, 0.0F);
        this.Body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0843F, -0.0226F, 0.2608F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 22, 36, 0.0F, -0.6F, -0.1F, 0, 1, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 9.1F, 0.0F);
        this.Body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0843F, 0.0226F, -0.2608F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 36, 0.0F, -0.6F, -0.1F, 0, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 9.1F, 0.0F);
        this.Body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0873F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 50, 44, -1.5F, -2.0F, -0.1F, 3, 2, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2495F, -0.0801F, -0.3041F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 57, 25, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Body2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2495F, 0.0801F, 0.3041F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 57, 25, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Body2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2618F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 52, 15, -1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 28, 28, -1.5F, -5.0F, -1.0F, 3, 13, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 8.9F, 0.0F);
        this.Body3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4189F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 50, 55, -1.0F, -2.0F, 1.2F, 2, 2, 1, -0.01F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 54, 7, -1.0F, -2.0F, -0.1F, 2, 2, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 8.9F, 0.0F);
        this.Body3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4044F, -0.1123F, 0.2562F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 31, 18, 0.0F, -0.6F, -0.1F, 0, 1, 2, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 8.9F, 0.0F);
        this.Body3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4044F, 0.1123F, -0.2562F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 31, 18, 0.0F, -0.6F, -0.1F, 0, 1, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -5.1F, 2.0F);
        this.Body3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.8203F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 47, 53, 0.0F, -6.0F, -1.0F, 0, 6, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -6.0F, 1.7F);
        this.Body3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -1.2741F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 25, 56, -1.0F, 0.0155F, 0.0319F, 2, 2, 1, -0.002F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -6.5F, -0.1F);
        this.Body3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2662F, -0.0853F, -0.3027F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 48, 23, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -6.5F, -0.1F);
        this.Body3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2662F, 0.0853F, 0.3027F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 48, 23, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -6.5F, -0.1F);
        this.Body3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2793F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 54, 32, -1.0F, 0.0F, -0.1F, 2, 2, 2, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 41, -1.0F, -3.0F, -1.0F, 2, 8, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 8.0F, -0.6F);
        this.Body4.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.925F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 31, 46, 0.0F, -0.1F, 0.0F, 0, 6, 4, -0.02F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.Body4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.925F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 43, 46, -0.5F, -2.0F, 0.0F, 1, 2, 4, -0.02F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -5.1F, 0.0F);
        this.Body4.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.8203F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 20, 0.0F, -7.0F, 0.0F, 0, 7, 3, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 53, -0.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 1.0F, 2.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 40, 53, -0.5F, -2.0F, -1.0F, 1, 4, 2, 0.01F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 57, 55, -0.5F, -0.9F, 1.0F, 1, 2, 1, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 24, 0.01F, -4.4F, 0.6F, 0, 9, 7, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Body5.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -1.1083F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 13, 0, -0.5F, 0.0F, 0.27F, 1, 1, 2, -0.01F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 38, 27, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body5.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 1.2566F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 55, 49, -0.5F, -0.7F, 0.3F, 1, 1, 2, -0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -0.8F, 1.0F);
        this.Body5.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -1.0297F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 32, 57, -0.5F, -2.0492F, -0.015F, 1, 2, 1, -0.01F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 7.0F, -2.6F);
        this.Body5.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.925F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 22, 44, 0.0F, -1.1F, 3.7F, 0, 7, 4, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -6.1F, -2.0F);
        this.Body5.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.8203F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 17, 0, 0.0F, -7.0F, 3.0F, 0, 9, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Piranhamesodon.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Piranhamesodon.offsetY = -1.8F;
        this.Piranhamesodon.offsetX = 0.0F;
        this.Piranhamesodon.offsetZ = 2.0F;
        this.Piranhamesodon.rotateAngleY = (float)Math.toRadians(120);
        this.Piranhamesodon.rotateAngleX = (float)Math.toRadians(0);
        this.Piranhamesodon.rotateAngleZ = (float)Math.toRadians(0);
        this.Piranhamesodon.scaleChildren = true;
        float scaler = 2.4F;
        this.Piranhamesodon.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Piranhamesodon, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Jaw, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(PectoralL, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(PectoralR, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.48F, 0.0F);
        //End of pose, now render the model:
        this.Piranhamesodon.render(f);
        //Reset rotations, positions and sizing:
        this.Piranhamesodon.setScale(1.0F, 1.0F, 1.0F);
        this.Piranhamesodon.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Piranhamesodon.rotateAngleY = (float) Math.toRadians(90);
        this.Piranhamesodon.offsetX = -0.05F;
        this.Piranhamesodon.offsetY = -0.17F;
        this.Piranhamesodon.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Jaw, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(PectoralL, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(PectoralR, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.48F, 0.0F);
        this.Piranhamesodon.rotateAngleY = (float) Math.toRadians(90);
        this.Piranhamesodon.offsetX = -0.03F;
        this.Piranhamesodon.offsetZ = -0.015F;
        this.Piranhamesodon.offsetY = -0.6F;
        this.Piranhamesodon.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Piranhamesodon.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};

        float speed = 0.5F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        if (!e.isInWater()) {
            speed = 0.8F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainSwing(fishTail, speed * 0.8F, 0.15F, -0.85, f2, 1);
            this.swing(Piranhamesodon, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
        }
        this.walk(PectoralL, (float) (speed * 0.65), 0.22F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralL, (float) (speed * 0.65), 0.13F, true, 0, 0, f2, 0.5F);
        this.walk(PectoralR, (float) (speed * 0.65), -0.22F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralR, (float) (speed * 0.65), -0.13F, true, 0, 0, f2, 0.5F);

        this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.walk(PelvicL, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(PelvicL, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.walk(PelvicR, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(PelvicR, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.Piranhamesodon.rotateAngleZ = (float) Math.toRadians(90);
            //this.Piranhamesodon.offsetY = 0.7F;
            this.bob(Piranhamesodon, -speed, 0.9F, false, f2, 1);
            this.swing(Piranhamesodon, speed, 0.15F, true, 0, 0, f2, 0.5F);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.Jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

