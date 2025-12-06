package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYezoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelYezoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Shell;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer shell13;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer shell14;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer shell15;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer shell16;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer shell17;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer shell18;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer shell19;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer shell9;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer shell10;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer shell21;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer shell20;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer shell11;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer shell22;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer shell12;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer arm;
    private final AdvancedModelRenderer armb;
    private final AdvancedModelRenderer armc;
    private final AdvancedModelRenderer arm6;
    private final AdvancedModelRenderer armb6;
    private final AdvancedModelRenderer armc6;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer armb2;
    private final AdvancedModelRenderer armc2;
    private final AdvancedModelRenderer arm7;
    private final AdvancedModelRenderer armb7;
    private final AdvancedModelRenderer armc7;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer armb3;
    private final AdvancedModelRenderer armc3;
    private final AdvancedModelRenderer arm8;
    private final AdvancedModelRenderer armb8;
    private final AdvancedModelRenderer armc8;
    private final AdvancedModelRenderer arm4;
    private final AdvancedModelRenderer armb4;
    private final AdvancedModelRenderer armc4;
    private final AdvancedModelRenderer arm9;
    private final AdvancedModelRenderer armb9;
    private final AdvancedModelRenderer armc9;
    private final AdvancedModelRenderer arm5;
    private final AdvancedModelRenderer armb5;
    private final AdvancedModelRenderer armc5;
    private final AdvancedModelRenderer arm10;
    private final AdvancedModelRenderer armb10;
    private final AdvancedModelRenderer armc10;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;

    private ModelAnimator animator;

    public ModelYezoceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Shell = new AdvancedModelRenderer(this);
        this.Shell.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(2.0F, -0.5F, 0.0F);
        this.Shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.2618F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 0, -1.0F, -3.0F, -5.0F, 4, 4, 5, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.25F, 2.6F, -5.9F);
        this.shell2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.8883F, 0.6555F, 0.1555F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 40, -2.0F, -5.0F, 3.75F, 4, 6, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 3.35F, -4.4F);
        this.shell2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 35, -2.0F, -5.0F, 3.75F, 5, 6, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 3.35F, -2.4F);
        this.shell2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.8727F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 29, -2.0F, -5.0F, 3.75F, 5, 6, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 2.85F, -1.15F);
        this.shell2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.8727F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 0, -2.0F, -5.0F, 3.75F, 5, 6, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 1.85F, 1.1F);
        this.shell2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.0908F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 30, -2.0F, -5.0F, 3.75F, 5, 6, 0, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 30, -2.0F, -5.0F, 5.0F, 5, 6, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.85F, 1.0F);
        this.shell2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.0908F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 16, -1.0F, -4.0F, 3.0F, 4, 4, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.shell2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6545F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 9, -1.0F, -4.0F, 0.0F, 4, 4, 3, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.0F, 0.0F, -5.0F);
        this.shell2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 23, -3.0F, -3.0F, -3.0F, 3, 4, 3, 0.0F, false));

        this.shell13 = new AdvancedModelRenderer(this);
        this.shell13.setRotationPoint(0.25F, -3.75F, -4.45F);
        this.Shell.addChild(shell13);
        this.setRotateAngle(shell13, -0.2618F, 3.1416F, 0.0F);
        this.shell13.cubeList.add(new ModelBox(shell13, 14, 16, -1.0F, -2.0F, -4.0F, 3, 3, 4, 0.02F, false));
        this.shell13.cubeList.add(new ModelBox(shell13, 24, 23, -2.425F, -2.0F, -1.55F, 3, 3, 3, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.825F, 0.25F, -0.55F);
        this.shell13.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.7854F, 0.5236F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 55, -1.0F, -2.0F, 1.0F, 0, 3, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.575F, 0.25F, 0.45F);
        this.shell13.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.5236F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 55, -1.0F, -2.0F, 1.0F, 0, 3, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.925F, 0.25F, 0.45F);
        this.shell13.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.5236F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 55, -1.0F, -2.0F, 1.0F, 0, 3, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.0F, 0.0F, -4.0F);
        this.shell13.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.7854F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 36, -3.0F, -2.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.shell13.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 35, -3.0F, -2.0F, 0.0F, 3, 3, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, 0.0F, -4.75F);
        this.shell13.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.5236F, -0.1745F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 31, -1.0F, -2.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.75F, 0.0F, -3.35F);
        this.shell13.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5236F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 56, -1.0F, -2.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.75F, 0.0F, -1.9F);
        this.shell13.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 56, -1.0F, -2.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.75F, 0.0F, -0.25F);
        this.shell13.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5236F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 12, -1.0F, -2.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(1.5F, -4.5F, 0.175F);
        this.Shell.addChild(shell3);
        this.setRotateAngle(shell3, -0.2618F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 9, 0.0F, -3.0F, -5.0F, 3, 3, 4, 0.01F, false));
        this.shell3.cubeList.add(new ModelBox(shell3, 28, 7, -1.4F, -3.0F, -2.6F, 3, 3, 3, 0.02F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.6F, 0.25F, -1.35F);
        this.shell3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3927F, 0.6981F, 0.5236F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 55, -1.0F, -3.0F, 1.0F, 0, 3, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.85F, 0.25F, -0.85F);
        this.shell3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.5236F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 55, -1.0F, -3.0F, 1.0F, 0, 3, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.65F, 0.25F, -0.85F);
        this.shell3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.5236F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 55, -1.0F, -3.0F, 1.0F, 0, 3, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(3.0F, 0.0F, -5.0F);
        this.shell3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.7854F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 19, -3.0F, -3.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.shell3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.7854F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 36, -3.0F, -3.0F, 0.0F, 3, 3, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.25F, 0.0F, -4.0F);
        this.shell3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.5236F, 0.7854F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 38, 6, 2.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, 0.0F, -3.25F);
        this.shell3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.5236F, 0.7854F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 56, 15, 2.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.75F, 0.0F, -4.0F);
        this.shell3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5236F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 6, 2.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.75F, 0.0F, -3.0F);
        this.shell3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.5236F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 34, 2.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.75F, 0.0F, -2.0F);
        this.shell3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.5236F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 34, 2.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.75F, 0.0F, -1.0F);
        this.shell3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.5236F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 6, 2.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.shell14 = new AdvancedModelRenderer(this);
        this.shell14.setRotationPoint(1.6F, -6.15F, -5.0F);
        this.Shell.addChild(shell14);
        this.setRotateAngle(shell14, -0.2618F, 3.1416F, 0.0F);
        this.shell14.cubeList.add(new ModelBox(shell14, 18, 0, 0.0F, -3.0F, -5.0F, 3, 3, 4, 0.01F, false));
        this.shell14.cubeList.add(new ModelBox(shell14, 28, 13, -1.4F, -3.0F, -2.6F, 3, 3, 3, 0.02F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(3.0F, 0.0F, -5.0F);
        this.shell14.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.7854F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 40, 6, -3.0F, -3.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.shell14.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.7854F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 36, 24, -3.0F, -3.0F, 0.0F, 3, 3, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.725F, -0.85F, -2.0F);
        this.shell14.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3054F, 0.7854F, 0.5236F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 56, -1.0F, 0.0F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(3.55F, -1.1F, -4.7F);
        this.shell14.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.5236F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 46, 28, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(3.55F, -1.1F, -3.7F);
        this.shell14.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.5236F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 28, 45, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(3.55F, -1.1F, -2.7F);
        this.shell14.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.5236F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 26, 45, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(3.55F, -1.1F, -1.7F);
        this.shell14.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.5236F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 24, 45, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.975F, -0.6F, -1.0F);
        this.shell14.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, 0.5236F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 48, 4, -1.0F, 0.0F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(2.4F, -0.85F, -6.2F);
        this.shell14.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.5236F, 0.5236F, -0.1745F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 48, 28, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.475F, -0.6F, -1.0F);
        this.shell14.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.5236F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 30, 50, -1.0F, 0.0F, 1.0F, 0, 1, 1, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.75F, -7.5F, -0.15F);
        this.Shell.addChild(shell4);
        this.setRotateAngle(shell4, -0.2618F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 40, 11, 1.0F, -3.0F, -4.0F, 2, 2, 3, 0.01F, false));
        this.shell4.cubeList.add(new ModelBox(shell4, 8, 41, -0.45F, -3.0F, -1.6F, 2, 2, 2, 0.02F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(3.0F, -1.0F, -1.0F);
        this.shell4.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.7854F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 41, -2.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.6F, -0.5F, -1.775F);
        this.shell4.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3927F, 0.6981F, 0.5236F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 56, 34, -1.0F, -1.0F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.6F, -0.5F, -1.275F);
        this.shell4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.5236F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 36, 56, -1.0F, -1.0F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.6F, -0.5F, -1.275F);
        this.shell4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, 0.5236F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 34, 56, -1.0F, -1.0F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(3.0F, -1.0F, -4.0F);
        this.shell4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.7854F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 16, 41, -2.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.25F, -1.0F, -2.875F);
        this.shell4.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.5236F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 54, 47, 2.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.8F, -1.0F, -2.175F);
        this.shell4.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.5236F, 0.7854F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 32, 6, 2.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.25F, -1.0F, -1.875F);
        this.shell4.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.5236F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 28, 53, 2.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.25F, -1.0F, -0.875F);
        this.shell4.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.5236F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 50, 28, 2.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.shell15 = new AdvancedModelRenderer(this);
        this.shell15.setRotationPoint(2.0F, -9.1F, -4.85F);
        this.Shell.addChild(shell15);
        this.setRotateAngle(shell15, -0.2618F, 3.1416F, 0.0F);
        this.shell15.cubeList.add(new ModelBox(shell15, 38, 40, 1.0F, -3.0F, -4.5F, 2, 2, 2, 0.01F, false));
        this.shell15.cubeList.add(new ModelBox(shell15, 24, 50, 1.0F, -3.0F, -3.0F, 2, 2, 1, 0.02F, false));
        this.shell15.cubeList.add(new ModelBox(shell15, 28, 19, -0.4F, -2.5F, -2.575F, 2, 2, 2, 0.02F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(3.0F, -1.0F, -2.0F);
        this.shell15.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.7854F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 42, 0, -2.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(3.0F, -1.0F, -4.5F);
        this.shell15.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.7854F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 50, 10, -2.0F, -2.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.4F, -10.15F, 0.75F);
        this.Shell.addChild(shell5);
        this.setRotateAngle(shell5, -0.2618F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 40, 16, 1.0F, -3.0F, -4.0F, 2, 2, 1, 0.01F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 50, 13, 1.0F, -3.0F, -4.75F, 2, 2, 1, 0.02F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 38, 44, -0.425F, -2.75F, -3.6F, 2, 2, 2, 0.02F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(3.0F, -1.0F, -4.75F);
        this.shell5.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.7854F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 45, -2.0F, -2.0F, -2.0F, 2, 2, 2, -0.01F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(3.0F, -1.0F, -3.0F);
        this.shell5.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, -0.7854F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 44, 29, -2.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.shell16 = new AdvancedModelRenderer(this);
        this.shell16.setRotationPoint(2.5F, -11.15F, -5.25F);
        this.Shell.addChild(shell16);
        this.setRotateAngle(shell16, -0.2618F, 3.1416F, 0.0F);
        this.shell16.cubeList.add(new ModelBox(shell16, 50, 4, 2.0F, -3.0F, -4.9F, 1, 1, 2, 0.01F, false));
        this.shell16.cubeList.add(new ModelBox(shell16, 18, 7, 0.25F, -2.75F, -2.95F, 2, 1, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(3.0F, -2.0F, -2.9F);
        this.shell16.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.7854F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 54, 16, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(3.0F, -2.0F, -4.9F);
        this.shell16.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.7854F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 54, 18, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.15F, -11.75F, 0.5F);
        this.Shell.addChild(shell6);
        this.setRotateAngle(shell6, -0.2618F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 48, 37, 2.0F, -3.25F, -4.75F, 1, 1, 2, 0.01F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(2.15F, -2.25F, -2.95F);
        this.shell6.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.1309F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 42, 4, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.02F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(3.0F, -2.25F, -4.75F);
        this.shell6.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.7854F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 54, 22, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(3.0F, -2.25F, -2.75F);
        this.shell6.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.7854F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 54, 20, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shell17 = new AdvancedModelRenderer(this);
        this.shell17.setRotationPoint(2.75F, -12.85F, -4.6F);
        this.Shell.addChild(shell17);
        this.setRotateAngle(shell17, -0.2618F, 3.1416F, 0.0F);
        this.shell17.cubeList.add(new ModelBox(shell17, 50, 7, 2.0F, -3.0F, -4.0F, 1, 1, 2, 0.01F, false));
        this.shell17.cubeList.add(new ModelBox(shell17, 32, 46, 0.25F, -3.0F, -2.25F, 2, 1, 1, 0.02F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(3.0F, -2.0F, -4.0F);
        this.shell17.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.7854F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 54, 26, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(3.0F, -2.0F, -2.0F);
        this.shell17.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, -0.7854F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 54, 24, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(-0.1F, -13.65F, 0.0F);
        this.Shell.addChild(shell7);
        this.setRotateAngle(shell7, -0.2618F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 56, 4, 2.0F, -3.0F, -3.75F, 1, 1, 1, 0.01F, false));
        this.shell7.cubeList.add(new ModelBox(shell7, 56, 8, 2.0F, -3.0F, -3.0F, 1, 1, 1, 0.015F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(1.4F, -2.0F, -2.225F);
        this.shell7.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.1309F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 53, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.01F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(2.15F, -2.0F, -2.325F);
        this.shell7.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.1309F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 50, 52, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.02F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(3.0F, -2.0F, -3.775F);
        this.shell7.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.7854F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 24, 7, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(3.0F, -2.0F, -2.025F);
        this.shell7.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, -0.7854F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 34, 52, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shell18 = new AdvancedModelRenderer(this);
        this.shell18.setRotationPoint(3.15F, -14.4F, -4.375F);
        this.Shell.addChild(shell18);
        this.setRotateAngle(shell18, -0.2618F, 3.1416F, 0.0F);
        this.shell18.cubeList.add(new ModelBox(shell18, 32, 54, 1.25F, -3.0F, -2.225F, 1, 1, 1, 0.02F, false));
        this.shell18.cubeList.add(new ModelBox(shell18, 54, 37, 1.0F, -3.0F, -2.225F, 1, 1, 1, 0.01F, false));
        this.shell18.cubeList.add(new ModelBox(shell18, 20, 53, 2.0F, -3.0F, -3.0F, 1, 1, 1, 0.01F, false));
        this.shell18.cubeList.add(new ModelBox(shell18, 56, 10, 2.0F, -3.0F, -3.75F, 1, 1, 1, 0.02F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(3.0F, -2.0F, -3.725F);
        this.shell18.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, 0.7854F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 28, 54, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(3.0F, -2.0F, -1.975F);
        this.shell18.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, -0.7854F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 36, 54, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(-0.4F, -14.975F, 0.1F);
        this.Shell.addChild(shell8);
        this.setRotateAngle(shell8, -0.2618F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 54, 39, 2.0F, -3.0F, -3.55F, 1, 1, 1, 0.01F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(2.15F, -2.0F, -2.825F);
        this.shell8.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.1309F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 4, 53, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.02F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(3.0F, -2.0F, -3.525F);
        this.shell8.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.7854F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 20, 30, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(3.0F, -2.0F, -2.525F);
        this.shell8.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, -0.7854F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 38, 52, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shell19 = new AdvancedModelRenderer(this);
        this.shell19.setRotationPoint(3.25F, -15.65F, -4.7F);
        this.Shell.addChild(shell19);
        this.setRotateAngle(shell19, -0.2618F, 3.1416F, 0.0F);
        this.shell19.cubeList.add(new ModelBox(shell19, 44, 54, 1.275F, -3.1F, -2.925F, 1, 1, 1, 0.02F, false));
        this.shell19.cubeList.add(new ModelBox(shell19, 54, 41, 2.0F, -3.1F, -3.65F, 1, 1, 1, 0.01F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(3.025F, -2.1F, -3.65F);
        this.shell19.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.7854F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 54, 43, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(3.025F, -2.1F, -2.65F);
        this.shell19.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0F, -0.7854F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 40, 54, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(-0.5F, -16.2F, 0.0F);
        this.Shell.addChild(shell9);
        this.setRotateAngle(shell9, -0.2618F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 20, 32, 2.0F, -3.0F, -3.725F, 1, 1, 1, 0.01F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(3.0F, -2.0F, -2.725F);
        this.shell9.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, -0.5236F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 42, 52, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(2.375F, -1.975F, -2.825F);
        this.shell9.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, 0.1309F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 8, 53, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.02F, false));

        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(-0.6F, -17.35F, -0.175F);
        this.Shell.addChild(shell10);
        this.setRotateAngle(shell10, -0.2618F, 0.0F, 0.0F);


        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(3.0F, -2.0F, -2.725F);
        this.shell10.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, 0.5236F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 30, 52, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(3.0F, -2.0F, -2.725F);
        this.shell10.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, -0.5236F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 44, 33, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(2.575F, -1.975F, -2.825F);
        this.shell10.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, -0.2182F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 12, 53, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.02F, false));

        this.shell21 = new AdvancedModelRenderer(this);
        this.shell21.setRotationPoint(-0.7F, -18.35F, -0.325F);
        this.Shell.addChild(shell21);
        this.setRotateAngle(shell21, -0.2618F, 0.0F, 0.0F);


        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(3.0F, -2.0F, -2.725F);
        this.shell21.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, 0.5236F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 52, 31, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(3.0F, -2.0F, -2.725F);
        this.shell21.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, -0.5236F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 46, 52, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(2.675F, -1.975F, -2.825F);
        this.shell21.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, -0.2182F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 16, 53, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.02F, false));

        this.shell20 = new AdvancedModelRenderer(this);
        this.shell20.setRotationPoint(3.4F, -17.05F, -4.1F);
        this.Shell.addChild(shell20);
        this.setRotateAngle(shell20, -0.2618F, 3.1416F, 0.0F);


        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(3.0F, -2.0F, -2.0F);
        this.shell20.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, 0.1745F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 24, 53, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(2.625F, -2.0F, -2.225F);
        this.shell20.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.0F, -0.3491F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 54, 45, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.02F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(3.025F, -2.0F, -2.0F);
        this.shell20.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.0F, -0.7854F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 48, 54, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(3.55F, -18.05F, -3.925F);
        this.Shell.addChild(shell11);
        this.setRotateAngle(shell11, -0.2618F, 3.1416F, 0.0F);


        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(3.0F, -2.0F, -2.0F);
        this.shell11.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, 0.1745F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 0, 55, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(2.625F, -2.0F, -2.225F);
        this.shell11.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0F, -0.3491F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 54, 52, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.02F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(3.025F, -2.0F, -2.0F);
        this.shell11.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, -0.7854F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 52, 54, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shell22 = new AdvancedModelRenderer(this);
        this.shell22.setRotationPoint(3.65F, -19.05F, -3.85F);
        this.Shell.addChild(shell22);
        this.setRotateAngle(shell22, -0.2618F, 3.1416F, 0.0F);


        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(3.0F, -2.0F, -2.0F);
        this.shell22.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0F, 0.1745F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 12, 55, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(2.875F, -2.0F, -2.15F);
        this.shell22.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, -0.6109F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 8, 55, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.02F, false));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(3.025F, -2.0F, -2.0F);
        this.shell22.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0F, -0.7854F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 4, 55, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shell12 = new AdvancedModelRenderer(this);
        this.shell12.setRotationPoint(-1.0F, -19.35F, -0.1F);
        this.Shell.addChild(shell12);
        this.setRotateAngle(shell12, -0.2618F, 0.0F, 0.0F);
        this.shell12.cubeList.add(new ModelBox(shell12, 56, 6, 2.0F, -3.0F, -3.5F, 1, 1, 1, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(3.0F, -2.0F, 3.5F);
        this.Shell.addChild(body);


        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(0.5F, -4.925F, -0.025F);
        this.body.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.2618F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 12, 23, -2.0F, 0.0F, 0.0F, 3, 4, 3, 0.01F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(0.5F, -1.175F, 1.35F);
        this.body.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.3491F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 40, 35, -2.0F, -4.0F, -1.0F, 3, 4, 1, 0.0F, false));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(0.5F, -1.2F, 1.35F);
        this.body.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.829F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 24, 29, -2.0F, -4.0F, -1.0F, 3, 4, 2, -0.02F, false));

        this.arm = new AdvancedModelRenderer(this);
        this.arm.setRotationPoint(0.5F, -3.675F, 2.35F);
        this.body.addChild(arm);
        this.setRotateAngle(arm, -0.7418F, 0.0873F, 0.0F);
        this.arm.cubeList.add(new ModelBox(arm, 16, 45, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.armb = new AdvancedModelRenderer(this);
        this.armb.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm.addChild(armb);
        this.setRotateAngle(armb, 0.0873F, 0.0436F, 0.0F);
        this.armb.cubeList.add(new ModelBox(armb, 46, 16, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, false));

        this.armc = new AdvancedModelRenderer(this);
        this.armc.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.armb.addChild(armc);
        this.setRotateAngle(armc, 0.1745F, 0.0436F, 0.0F);
        this.armc.cubeList.add(new ModelBox(armc, 46, 20, -0.5F, -0.5F, -0.15F, 1, 1, 3, -0.01F, false));

        this.arm6 = new AdvancedModelRenderer(this);
        this.arm6.setRotationPoint(-0.5F, -3.675F, 2.35F);
        this.body.addChild(arm6);
        this.setRotateAngle(arm6, -0.7418F, -0.0873F, 0.0F);
        this.arm6.cubeList.add(new ModelBox(arm6, 16, 45, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.armb6 = new AdvancedModelRenderer(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm6.addChild(armb6);
        this.setRotateAngle(armb6, 0.0873F, -0.0436F, 0.0F);
        this.armb6.cubeList.add(new ModelBox(armb6, 46, 16, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, true));

        this.armc6 = new AdvancedModelRenderer(this);
        this.armc6.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.armb6.addChild(armc6);
        this.setRotateAngle(armc6, 0.1745F, -0.0436F, 0.0F);
        this.armc6.cubeList.add(new ModelBox(armc6, 46, 20, -0.5F, -0.5F, -0.15F, 1, 1, 3, -0.01F, true));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(0.75F, -3.175F, 2.35F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, -0.7069F, 0.4363F, 0.2618F);
        this.arm2.cubeList.add(new ModelBox(arm2, 24, 46, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.armb2 = new AdvancedModelRenderer(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm2.addChild(armb2);
        this.setRotateAngle(armb2, 0.0873F, 0.0436F, 0.0F);
        this.armb2.cubeList.add(new ModelBox(armb2, 46, 24, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, false));

        this.armc2 = new AdvancedModelRenderer(this);
        this.armc2.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.armb2.addChild(armc2);
        this.setRotateAngle(armc2, 0.1745F, 0.0436F, 0.0F);
        this.armc2.cubeList.add(new ModelBox(armc2, 46, 40, -0.5F, -0.5F, -0.15F, 1, 1, 3, -0.01F, false));

        this.arm7 = new AdvancedModelRenderer(this);
        this.arm7.setRotationPoint(-0.75F, -3.175F, 2.35F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, -0.7069F, -0.4363F, -0.2618F);
        this.arm7.cubeList.add(new ModelBox(arm7, 24, 46, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.armb7 = new AdvancedModelRenderer(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm7.addChild(armb7);
        this.setRotateAngle(armb7, 0.0873F, -0.0436F, 0.0F);
        this.armb7.cubeList.add(new ModelBox(armb7, 46, 24, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, true));

        this.armc7 = new AdvancedModelRenderer(this);
        this.armc7.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.armb7.addChild(armc7);
        this.setRotateAngle(armc7, 0.1745F, -0.0436F, 0.0F);
        this.armc7.cubeList.add(new ModelBox(armc7, 46, 40, -0.5F, -0.5F, -0.15F, 1, 1, 3, -0.01F, true));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(0.75F, -2.175F, 2.35F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, -0.5672F, 0.6545F, 0.4363F);
        this.arm3.cubeList.add(new ModelBox(arm3, 46, 44, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.armb3 = new AdvancedModelRenderer(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm3.addChild(armb3);
        this.setRotateAngle(armb3, 0.0873F, 0.0436F, 0.0F);
        this.armb3.cubeList.add(new ModelBox(armb3, 32, 48, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, false));

        this.armc3 = new AdvancedModelRenderer(this);
        this.armc3.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.armb3.addChild(armc3);
        this.setRotateAngle(armc3, 0.1745F, 0.0436F, 0.0F);
        this.armc3.cubeList.add(new ModelBox(armc3, 48, 33, -0.5F, -0.5F, -0.15F, 1, 1, 3, -0.01F, false));

        this.arm8 = new AdvancedModelRenderer(this);
        this.arm8.setRotationPoint(-0.75F, -2.175F, 2.35F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, -0.5672F, -0.6545F, -0.4363F);
        this.arm8.cubeList.add(new ModelBox(arm8, 46, 44, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.armb8 = new AdvancedModelRenderer(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm8.addChild(armb8);
        this.setRotateAngle(armb8, 0.0873F, -0.0436F, 0.0F);
        this.armb8.cubeList.add(new ModelBox(armb8, 32, 48, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, true));

        this.armc8 = new AdvancedModelRenderer(this);
        this.armc8.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.armb8.addChild(armc8);
        this.setRotateAngle(armc8, 0.1745F, -0.0436F, 0.0F);
        this.armc8.cubeList.add(new ModelBox(armc8, 48, 33, -0.5F, -0.5F, -0.15F, 1, 1, 3, -0.01F, true));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(0.65F, -1.425F, 2.35F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, -0.4189F, 0.829F, 0.6109F);
        this.arm4.cubeList.add(new ModelBox(arm4, 40, 48, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.armb4 = new AdvancedModelRenderer(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm4.addChild(armb4);
        this.setRotateAngle(armb4, 0.0873F, 0.0436F, 0.0F);
        this.armb4.cubeList.add(new ModelBox(armb4, 48, 48, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, false));

        this.armc4 = new AdvancedModelRenderer(this);
        this.armc4.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.armb4.addChild(armc4);
        this.setRotateAngle(armc4, 0.1745F, 0.0436F, 0.0F);
        this.armc4.cubeList.add(new ModelBox(armc4, 0, 49, -0.5F, -0.5F, -0.15F, 1, 1, 3, -0.01F, false));

        this.arm9 = new AdvancedModelRenderer(this);
        this.arm9.setRotationPoint(-0.65F, -1.425F, 2.35F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, -0.4189F, -0.829F, -0.6109F);
        this.arm9.cubeList.add(new ModelBox(arm9, 40, 48, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.armb9 = new AdvancedModelRenderer(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm9.addChild(armb9);
        this.setRotateAngle(armb9, 0.0873F, -0.0436F, 0.0F);
        this.armb9.cubeList.add(new ModelBox(armb9, 48, 48, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, true));

        this.armc9 = new AdvancedModelRenderer(this);
        this.armc9.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.armb9.addChild(armc9);
        this.setRotateAngle(armc9, 0.1745F, -0.0436F, 0.0F);
        this.armc9.cubeList.add(new ModelBox(armc9, 0, 49, -0.5F, -0.5F, -0.15F, 1, 1, 3, -0.01F, true));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(0.4F, -0.925F, 2.35F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, -0.3054F, 0.9599F, 0.7854F);
        this.arm5.cubeList.add(new ModelBox(arm5, 8, 49, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.armb5 = new AdvancedModelRenderer(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm5.addChild(armb5);
        this.setRotateAngle(armb5, 0.0873F, 0.0436F, 0.0F);
        this.armb5.cubeList.add(new ModelBox(armb5, 16, 49, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, false));

        this.armc5 = new AdvancedModelRenderer(this);
        this.armc5.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.armb5.addChild(armc5);
        this.setRotateAngle(armc5, 0.1745F, 0.0436F, 0.0F);
        this.armc5.cubeList.add(new ModelBox(armc5, 50, 0, -0.5F, -0.5F, -0.15F, 1, 1, 3, -0.01F, false));

        this.arm10 = new AdvancedModelRenderer(this);
        this.arm10.setRotationPoint(-0.4F, -0.925F, 2.35F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, -0.3054F, -0.9599F, -0.7854F);
        this.arm10.cubeList.add(new ModelBox(arm10, 8, 49, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.armb10 = new AdvancedModelRenderer(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm10.addChild(armb10);
        this.setRotateAngle(armb10, 0.0873F, -0.0436F, 0.0F);
        this.armb10.cubeList.add(new ModelBox(armb10, 16, 49, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, true));

        this.armc10 = new AdvancedModelRenderer(this);
        this.armc10.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.armb10.addChild(armc10);
        this.setRotateAngle(armc10, 0.1745F, -0.0436F, 0.0F);
        this.armc10.cubeList.add(new ModelBox(armc10, 50, 0, -0.5F, -0.5F, -0.15F, 1, 1, 3, -0.01F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -1.925F, -0.275F);
        this.body.addChild(siphon);
        this.setRotateAngle(siphon, -0.2182F, 0.0F, 0.0F);


        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.siphon.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.2618F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 8, 45, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.01F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(1.5F, -3.925F, 0.975F);
        this.body.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.1745F, 0.0F, 0.3054F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 24, 41, -1.0F, -2.0F, -1.5F, 1, 2, 2, 0.01F, false));
        this.eyeright.cubeList.add(new ModelBox(eyeright, 52, 28, -0.9F, -1.5F, -1.5F, 1, 1, 2, -0.01F, false));
        this.eyeright.cubeList.add(new ModelBox(eyeright, 38, 56, -0.5F, -3.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(-1.5F, -3.925F, 0.975F);
        this.body.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.1745F, 0.0F, -0.3054F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 24, 41, 0.0F, -2.0F, -1.5F, 1, 2, 2, 0.01F, true));
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 52, 28, -0.1F, -1.5F, -1.5F, 1, 1, 2, -0.01F, true));
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 38, 56, 0.5F, -3.0F, -1.0F, 0, 1, 1, 0.0F, true));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Shell.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Shell.rotateAngleY = (float) Math.toRadians(90);
        this.Shell.offsetY = -0.2F;
        this.Shell.offsetX = -0.15F;
        this.Shell.offsetZ = -0.4F;
        this.Shell.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.Shell.offsetZ = -0.1F;
        this.Shell.offsetY = -0.03F;
        this.Shell.offsetX = -0.02F;
        this.Shell.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Shell.offsetY = -1.2F;
        this.Shell.offsetX = 0.8F;
        this.Shell.rotateAngleY = (float)Math.toRadians(242);
        this.Shell.rotateAngleX = (float)Math.toRadians(-18);
        this.Shell.rotateAngleZ = (float)Math.toRadians(-8);
        this.Shell.scaleChildren = true;
        float scaler = 2.4F;
        this.Shell.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Shell.render(f);
        //Reset rotations, positions and sizing:
        this.Shell.setScale(1.0F, 1.0F, 1.0F);
        this.Shell.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraYezoceras ee = (EntityPrehistoricFloraYezoceras) entitylivingbaseIn;

        if(ee.isReallyInWater()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYezoceras entity = (EntityPrehistoricFloraYezoceras) entitylivingbaseIn;
        int animCycle = 316;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 317) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*6 + (((tickAnim - 0) / 317) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+75))*6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*6)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*62.6))*1 + (((tickAnim - 0) / 317) * (721+Math.sin((Math.PI/180)*(((double)tickAnim/20)*62.6))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*62.6))*1)));
            zz = 0 + (((tickAnim - 0) / 317) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Shell, Shell.rotateAngleX + (float) Math.toRadians(xx), Shell.rotateAngleY + (float) Math.toRadians(yy), Shell.rotateAngleZ + (float) Math.toRadians(zz));

        this.Shell.rotationPointX = this.Shell.rotationPointX + (float)(0);
        this.Shell.rotationPointY = this.Shell.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*-1);
        this.Shell.rotationPointZ = this.Shell.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*0.1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-150))*5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*0.05));


        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-80))*7), arm.rotateAngleY + (float) Math.toRadians(0), arm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb, armb.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-100))*-4), armb.rotateAngleY + (float) Math.toRadians(0), armb.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armc, armc.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-320))*-12), armc.rotateAngleY + (float) Math.toRadians(0), armc.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*7), arm6.rotateAngleY + (float) Math.toRadians(0), arm6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb6, armb6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-100))*-4), armb6.rotateAngleY + (float) Math.toRadians(0), armb6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armc6, armc6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-300))*-12), armc6.rotateAngleY + (float) Math.toRadians(0), armc6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-100))*4), arm2.rotateAngleY + (float) Math.toRadians(0), arm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb2, armb2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-250))*-4), armb2.rotateAngleY + (float) Math.toRadians(0), armb2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armc2, armc2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-350))*-12), armc2.rotateAngleY + (float) Math.toRadians(0), armc2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-100))*4), arm7.rotateAngleY + (float) Math.toRadians(0), arm7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb7, armb7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-250))*-4), armb7.rotateAngleY + (float) Math.toRadians(0), armb7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armc7, armc7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-350))*-12), armc7.rotateAngleY + (float) Math.toRadians(0), armc7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*4), arm3.rotateAngleY + (float) Math.toRadians(0), arm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb3, armb3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-100))*4), armb3.rotateAngleY + (float) Math.toRadians(0), armb3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armc3, armc3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-150))*4), armc3.rotateAngleY + (float) Math.toRadians(0), armc3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*4), arm8.rotateAngleY + (float) Math.toRadians(0), arm8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb8, armb8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-100))*4), armb8.rotateAngleY + (float) Math.toRadians(0), armb8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armc8, armc8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-150))*4), armc8.rotateAngleY + (float) Math.toRadians(0), armc8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9))*4), arm4.rotateAngleY + (float) Math.toRadians(0), arm4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb4, armb4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*4), armb4.rotateAngleY + (float) Math.toRadians(0), armb4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armc4, armc4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-100))*12), armc4.rotateAngleY + (float) Math.toRadians(0), armc4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9))*4), arm9.rotateAngleY + (float) Math.toRadians(0), arm9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb9, armb9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*4), armb9.rotateAngleY + (float) Math.toRadians(0), armb9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armc9, armc9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-100))*12), armc9.rotateAngleY + (float) Math.toRadians(0), armc9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9+50))*4), arm5.rotateAngleY + (float) Math.toRadians(0), arm5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb5, armb5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9))*4), armb5.rotateAngleY + (float) Math.toRadians(0), armb5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armc5, armc5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*12), armc5.rotateAngleY + (float) Math.toRadians(0), armc5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9+50))*4), arm10.rotateAngleY + (float) Math.toRadians(0), arm10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb10, armb10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9))*4), armb10.rotateAngleY + (float) Math.toRadians(0), armb10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armc10, armc10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*12), armc10.rotateAngleY + (float) Math.toRadians(0), armc10.rotateAngleZ + (float) Math.toRadians(0));


        this.siphon.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-50))*0.3));


        this.setRotateAngle(eyeright, eyeright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-200))*-4), eyeright.rotateAngleY + (float) Math.toRadians(0), eyeright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(eyeleft, eyeleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*181.9-150))*-4), eyeleft.rotateAngleY + (float) Math.toRadians(0), eyeleft.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraYezoceras ee = (EntityPrehistoricFloraYezoceras) e;

        if (!e.isInWater()) {
            this.Shell.rotateAngleZ = (float) Math.toRadians(90);
            this.Shell.offsetX = -0.5f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

