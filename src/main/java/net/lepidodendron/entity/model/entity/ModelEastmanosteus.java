package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEastmanosteus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEastmanosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer frontfinLeft;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer tailFin;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer backfinLeft;
    private final AdvancedModelRenderer backfinRight;
    private final AdvancedModelRenderer frontfinRight;
    private final AdvancedModelRenderer cube_r49;

    private ModelAnimator animator;

    public ModelEastmanosteus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 16.1F, -2.2F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.875F, 4.0F, -1.075F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4024F, -0.2222F, 0.1155F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 47, 0.0F, -4.0F, -1.5F, 1, 4, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.875F, 4.0F, -1.075F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4024F, 0.2222F, -0.1155F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 47, -2.0F, -4.0F, -1.5F, 1, 4, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.75F, 4.475F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.192F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 38, -2.0F, -1.0F, -0.125F, 4, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.51F, 4.7909F, -0.6449F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6152F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 46, -2.51F, -1.0F, -2.0F, 4, 1, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.75F, 1.375F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0262F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 7, -2.0F, 0.0F, 0.0F, 4, 2, 5, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.99F, -1.7107F, 1.4365F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 33, -3.99F, -0.01F, -1.99F, 4, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.7988F, 4.3523F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0044F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 1, -2.0F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.125F, -0.725F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0611F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 17, -2.5F, -2.0F, 0.0F, 5, 4, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.3024F, 2.3107F, -4.2165F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4691F, -0.2639F, 0.21F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 49, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.65F, 0.6912F, -5.0202F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3345F, -0.1946F, -0.0055F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 49, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.575F, 1.427F, -4.7589F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4682F, -0.5585F, 0.2618F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 14, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.827F, -5.7339F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3518F, 0.123F, -0.045F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 52, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.9266F, 2.8287F, -1.3556F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2022F, -0.1437F, 0.1665F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 47, 0.0F, -3.0F, -3.0F, 1, 3, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.225F, 0.552F, -3.6839F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.207F, -0.3295F, 0.176F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 50, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.65F, 0.6912F, -5.0202F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3345F, 0.1946F, 0.0055F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 49, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.575F, 1.427F, -4.7589F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4682F, 0.5585F, -0.2618F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 14, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.827F, -5.7339F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3518F, -0.123F, 0.045F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 52, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.752F, -5.4339F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.5383F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 29, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.9266F, 2.8287F, -1.3556F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2022F, 0.1437F, -0.1665F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 47, -1.0F, -3.0F, -3.0F, 1, 3, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.3024F, 2.3107F, -4.2165F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4691F, 0.2639F, -0.21F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 6, 49, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.473F, -5.0839F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.7898F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 48, 40, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.873F, -3.4839F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2356F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 47, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.225F, 0.552F, -3.6839F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.207F, 0.3295F, -0.176F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 50, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.919F, -3.5267F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1004F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 26, 14, -2.0F, -0.001F, -0.001F, 4, 4, 4, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.676F, -1.9978F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3927F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.55F, 0.5F, -2.25F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1703F, -0.4853F, 0.0906F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 52, -1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.025F, -0.65F, -3.85F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1022F, 0.28F, -0.2361F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 16, -1.0F, -0.4F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.9816F, -0.4223F, -2.1187F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1679F, -0.5444F, 0.0903F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 34, 49, 0.0066F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(2.0F, 1.387F, -0.5457F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.4145F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 42, -4.5F, -1.99F, -0.01F, 5, 2, 2, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.1103F, -2.3815F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.4276F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 42, 24, -2.0F, -3.0F, 0.0F, 4, 3, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.1F, -2.525F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.144F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 34, 46, -2.0F, -1.0F, 0.0F, 4, 1, 2, 0.001F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.55F, 0.5F, -2.25F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1703F, 0.4853F, -0.0906F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 52, 1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.025F, -0.65F, -3.85F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1022F, -0.28F, 0.2361F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 24, 16, 0.0F, -0.4F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.9816F, -0.4223F, -2.1187F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1679F, 0.5444F, -0.0903F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 34, 49, -1.0066F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.65F, -3.4F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.4669F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 48, 37, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.frontfinLeft = new AdvancedModelRenderer(this);
        this.frontfinLeft.setRotationPoint(2.0F, 4.2F, -0.425F);
        this.main.addChild(frontfinLeft);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.frontfinLeft.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.1004F, -0.829F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 14, 37, 0.0F, 0.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.65F, 6.725F);
        this.main.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 29, -2.0F, -0.975F, 0.025F, 4, 4, 3, -0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 3.45F, 1.025F);
        this.tail1.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0873F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 34, 42, -1.5F, -1.0F, -1.0F, 3, 1, 3, 0.001F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.35F, -0.2F);
        this.tail1.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.192F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 36, -1.5F, -2.0F, -1.0F, 3, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 3.025F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 30, -1.5F, -0.8F, -0.1F, 3, 3, 4, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 3.0F, -0.025F);
        this.tail2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1614F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 42, 7, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -1.55F, -0.025F);
        this.tail2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.2182F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 24, 37, 0.0F, -5.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -1.975F, 0.075F);
        this.tail2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3054F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 42, 0, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 3.825F);
        this.tail2.addChild(tail3);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 3.4F, 1.2F);
        this.tail3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1222F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 46, 50, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -0.85F, -0.1F);
        this.tail3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0742F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 42, 18, -0.5F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 2.25F, 0.025F);
        this.tail3.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1484F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 42, 12, -0.5F, -1.0F, 0.0F, 1, 1, 5, -0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 1.5F, 1.05F);
        this.tail3.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0175F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 26, 22, -1.0F, -2.0F, -2.0F, 2, 2, 6, 0.0F, false));

        this.tailFin = new AdvancedModelRenderer(this);
        this.tailFin.setRotationPoint(0.0F, 0.575F, 5.05F);
        this.tail3.addChild(tailFin);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -0.025F, -0.775F);
        this.tailFin.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.5149F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, -1, 0.0F, -0.1465F, -0.0077F, 0, 6, 12, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.6622F, 1.8124F);
        this.tailFin.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.781F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 46, 42, -0.5F, -1.0F, 0.0F, 1, 1, 4, -0.001F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, -1.425F, 1.425F);
        this.tailFin.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.5411F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 14, 30, -0.5F, 0.0F, -1.0F, 1, 1, 6, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.825F, 0.825F);
        this.tailFin.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1658F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 49, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.001F, false));

        this.backfinLeft = new AdvancedModelRenderer(this);
        this.backfinLeft.setRotationPoint(1.45F, 3.025F, 1.25F);
        this.tail1.addChild(backfinLeft);
        this.setRotateAngle(backfinLeft, 0.0F, 0.0F, -0.3491F);
        this.backfinLeft.cubeList.add(new ModelBox(backfinLeft, 28, 47, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.backfinRight = new AdvancedModelRenderer(this);
        this.backfinRight.setRotationPoint(-1.45F, 3.025F, 1.25F);
        this.tail1.addChild(backfinRight);
        this.setRotateAngle(backfinRight, 0.0F, 0.0F, 0.3491F);
        this.backfinRight.cubeList.add(new ModelBox(backfinRight, 28, 47, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.frontfinRight = new AdvancedModelRenderer(this);
        this.frontfinRight.setRotationPoint(-2.0F, 4.2F, -0.425F);
        this.main.addChild(frontfinRight);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.frontfinRight.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, -0.1004F, 0.829F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 14, 37, 0.0F, 0.0F, 0.0F, 0, 5, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.jaw.rotateAngleX = (float) Math.toRadians(20);
        this.head.offsetY = 0.15F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.43F;
        this.main.offsetX = -0.1F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {

        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.rotateAngleX = (float) Math.toRadians(26);
        this.main.offsetX = -0.05F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.3F;
        this.main.offsetX = 0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        main.offsetZ = -0.3F;

        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3, this.tailFin};
        ((EntityPrehistoricFloraEastmanosteus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.2F;
        float still = 1f;
        float inwater = 1f;
        if (f3 == 0.0F) {
            still = 0.3F;}
        if (!e.isInWater()) {
            speed = 0.3F;
            inwater = 0.5F;
        }

        //if (f3 != 0.0F) {
        //    this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, -0.2F, f2, 1);
        //}

        this.chainWave(fishTail, speed * still, 0.02F * still, -3, f2, 0.8F * still);
        this.chainSwing(fishTail, speed * still, 0.5F * still, -3, f2, 0.6F * still);
        if (e.isInWater()) {
            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontfinLeft, (float) (speed * 0.65), 0.5F * inwater, true, 0.8F, 0.3F, f2, 1 * inwater);
        this.swing(frontfinLeft, (float) (speed * 0.65), 0.3F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(frontfinRight, (float) (speed * 0.65), -0.5F * inwater, true, 0.8F, -0.3F, f2, 1 * inwater);
        this.swing(frontfinRight, (float) (speed * 0.65), -0.3F * inwater, true, 0, 0, f2, 1 * inwater);

        this.flap(backfinLeft, (float) (speed * 0.65), 0.3F * inwater, true, 0.8F, 0.1F, f2, 1 * inwater);
        this.swing(backfinLeft, (float) (speed * 0.65), 0.2F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(backfinRight, (float) (speed * 0.65), -0.3F * inwater, true, 0.8F, -0.1F, f2, 1 * inwater);
        this.swing(backfinRight, (float) (speed * 0.65), -0.2F * inwater, true, 0, 0, f2, 1 * inwater);

        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetY = 0.4F;
            this.main.offsetX = -0.F;
            this.bob(main, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(13);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(75), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}

