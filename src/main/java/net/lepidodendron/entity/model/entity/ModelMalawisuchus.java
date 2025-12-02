package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMalawisuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMalawisuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer grub;
    private final AdvancedModelRenderer grub2;

    private ModelAnimator animator;

    public ModelMalawisuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 13.225F, 9.225F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.482F, 3.4275F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1353F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 42, -1.0F, 0.125F, -4.0F, 2, 1, 4, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.975F, -0.975F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 0, -2.0F, -0.75F, 0.25F, 4, 5, 4, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.4F, 2.6909F, 1.0162F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.2618F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 38, 7, -1.0F, -1.5F, -1.0F, 2, 5, 3, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.5236F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 49, 15, -1.0F, 0.0F, 0.0F, 2, 5, 2, -0.001F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 4.3059F, 0.7756F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.2618F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 15, 36, -1.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.4F, 2.6909F, 1.0162F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.2618F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 38, 7, -1.0F, -1.5F, -1.0F, 2, 5, 3, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.5236F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 49, 15, -1.0F, 0.0F, 0.0F, 2, 5, 2, -0.001F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 4.3059F, 0.7756F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.2618F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 15, 36, -1.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, 0.725F, -0.225F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.5F, -5.0F, 5, 6, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.7824F, -0.311F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0044F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 35, 0.0F, 0.125F, -4.7F, 2, 1, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.5F, 0.475F, -5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -2.5F, -0.975F, -4.5F, 5, 6, 5, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.1518F, 0.2385F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 26, -1.0F, 0.0F, -4.125F, 2, 1, 4, -0.003F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(-0.5F, -1.025F, -4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 21, 19, -1.5F, 0.175F, -2.95F, 4, 5, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1186F, -2.2519F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, -0.0654F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 32, -1.0F, 0.15F, -4.0F, 3, 2, 4, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 3.35F, -0.05F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 28, -0.5F, -1.4F, -4.2F, 3, 2, 4, -0.006F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, 0.5006F, -4.2781F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 45, 32, -0.5F, -0.25F, -2.5F, 3, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 46, -0.5F, 0.45F, -2.5F, 3, 1, 3, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 57, 57, 0.5F, 0.45F, -4.5F, 1, 1, 2, -0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.325F, 1.7885F, -5.1592F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.829F, 0.0F, 0.1047F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 23, 0.025F, -0.2579F, 0.4775F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.325F, 1.7135F, -5.1592F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.829F, 0.0F, 0.1047F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 16, 0.025F, -0.6829F, -0.1225F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.325F, 1.7135F, -5.1092F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.7854F, 0.0F, 0.1047F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 16, 0.1F, -0.8859F, -0.8126F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.325F, 1.6135F, -5.0842F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.8596F, 0.0F, 0.1047F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 49, 23, 0.275F, -1.3655F, -1.0957F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.675F, 1.7135F, -5.1092F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7854F, 0.0F, -0.1047F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 16, -0.1F, -0.8859F, -0.8126F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.675F, 1.7885F, -5.1592F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.829F, 0.0F, -0.1047F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 23, -0.025F, -0.2579F, 0.4775F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.675F, 1.7135F, -5.1592F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.829F, 0.0F, -0.1047F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 43, 16, -0.025F, -0.6829F, -0.1225F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.5375F, -4.5112F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 57, 53, -0.3F, 0.0F, -2.0F, 1, 1, 2, 0.003F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 55, -0.7F, 0.0F, -2.0F, 1, 1, 2, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.9738F, -4.5407F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0453F, -0.2703F, -0.0121F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 42, -0.375F, -0.4346F, -0.6514F, 1, 1, 3, 0.003F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, 0.9738F, -4.5407F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0453F, 0.2703F, 0.0121F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 42, -0.625F, -0.4346F, -0.6514F, 1, 1, 3, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.675F, 1.6135F, -5.0842F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.8596F, 0.0F, -0.1047F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 49, 23, -0.275F, -1.3655F, -1.0957F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 0.4376F, -5.4201F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4669F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 26, -0.5F, 0.2F, -1.8F, 1, 1, 0, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 41, 55, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, -0.25F, -2.5F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2313F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 53, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.3F, 0.6023F, -3.526F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1726F, -0.2673F, 0.2638F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 16, -0.525F, -0.35F, -0.05F, 1, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.7F, 0.6023F, -3.526F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1726F, 0.2673F, -0.2638F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 16, -0.475F, -0.35F, -0.05F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.45F, -0.5F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 37, -0.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 53, 0.0F, -1.5F, -1.675F, 2, 2, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 55, 0.5F, 0.0F, -5.0F, 1, 1, 3, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 1.0085F, -2.08F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2793F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 48, 48, -1.5F, -1.025F, 0.075F, 3, 1, 3, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 1.0F, -5.0F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3491F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 24, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.35F, 0.5F, -2.0F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.2923F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 55, 0.1F, -0.7F, -3.0F, 0, 1, 3, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 51, 0, 0.0F, -0.5F, -3.0F, 1, 1, 3, -0.003F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.35F, 0.5F, -2.0F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.2923F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 27, 55, -0.1F, -0.7F, -3.0F, 0, 1, 3, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 51, 0, -1.0F, -0.5F, -3.0F, 1, 1, 3, -0.003F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.0F, -3.075F);
        this.jaw.addChild(throat);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, -0.0045F, -0.0532F);
        this.throat.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.4276F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 26, 42, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 1.6432F, 3.6064F);
        this.throat.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1484F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 39, 42, -0.5F, -1.0F, -0.025F, 2, 1, 4, -0.006F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.4F, 3.0076F, -1.4479F);
        this.body3.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.3403F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 0, 51, -0.7F, -0.5F, -0.6F, 2, 4, 2, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.8F, 3.4451F, 1.0102F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.6109F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 49, 7, -1.5F, -0.25F, -1.75F, 2, 5, 2, 0.001F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 3.9538F, -0.4668F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.2531F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 13, 48, -2.0F, -0.025F, -2.6F, 3, 1, 3, 0.01F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-1.4F, 3.0076F, -1.4479F);
        this.body3.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.3403F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 0, 51, -1.3F, -0.5F, -0.6F, 2, 4, 2, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.8F, 3.4451F, 1.0102F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.6109F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 49, 7, -0.5F, -0.25F, -1.75F, 2, 5, 2, 0.001F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 3.9538F, -0.4668F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.2531F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 13, 48, -1.0F, -0.025F, -2.6F, 3, 1, 3, 0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 0.9924F, 3.1261F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 21, 10, -1.0F, 0.0F, 0.025F, 3, 3, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.2F, 0.0F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0131F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 36, 19, 0.5F, -0.575F, 0.025F, 1, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0065F, 4.5496F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 28, -0.5F, 0.0F, 0.025F, 2, 2, 5, -0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 38, 0, 0.0F, -0.325F, 0.025F, 1, 1, 5, -0.002F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 39, 0.0F, 0.0F, 0.025F, 1, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 48, 0.5F, -0.5F, 0.025F, 0, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 24, 0.0F, 0.0F, 0.025F, 1, 1, 6, -0.001F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.4224F, 0.0762F);
        this.tail4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0785F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 37, 48, 0.5F, 0.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.grub = new AdvancedModelRenderer(this);
        this.grub.setRotationPoint(0.0F, 2.275F, -6.225F);
        this.main.addChild(grub);
        this.grub.cubeList.add(new ModelBox(grub, 3, 59, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.grub2 = new AdvancedModelRenderer(this);
        this.grub2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.grub.addChild(grub2);
        this.grub2.cubeList.add(new ModelBox(grub2, 10, 59, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.10F;
        this.main.offsetX = -0.25F;
        this.main.rotateAngleY = (float)Math.toRadians(222);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.53F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.main.render(0.01F);
        resetToDefaultPose();
    }

//    public void renderStaticWall(float f) {
//
//        resetToDefaultPose();
//    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        this.main.offsetZ = -0.2F;

        EntityPrehistoricFloraMalawisuchus proteros = (EntityPrehistoricFloraMalawisuchus) e;

        this.faceTarget(f3, f4, 10, body3);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMalawisuchus ee = (EntityPrehistoricFloraMalawisuchus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisuchus entity = (EntityPrehistoricFloraMalawisuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (36-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 36 + (((tickAnim - 15) / 10) * (0-(36)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (36-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 36 + (((tickAnim - 35) / 15) * (0-(36)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 15) / 5) * (-8-(11)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -8 + (((tickAnim - 20) / 5) * (0-(-8)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (11-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 11 + (((tickAnim - 35) / 8) * (-8-(11)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 43) / 7) * (0-(-8)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 20) / 5) * (0-(0.7)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 18) * (0.7-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 43) / 7) * (0-(0.7)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 7.75 + (((tickAnim - 5) / 10) * (75-(7.75)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 75 + (((tickAnim - 15) / 5) * (23.25-(75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 23.25 + (((tickAnim - 20) / 5) * (0-(23.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (18.25-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 18.25 + (((tickAnim - 30) / 5) * (75-(18.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 75 + (((tickAnim - 35) / 8) * (23.25-(75)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 23.25 + (((tickAnim - 43) / 7) * (0-(23.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.58-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.13-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.58 + (((tickAnim - 15) / 5) * (0.775-(0.58)));
            zz = 0.13 + (((tickAnim - 15) / 5) * (0.175-(0.13)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.775 + (((tickAnim - 20) / 5) * (0-(0.775)));
            zz = 0.175 + (((tickAnim - 20) / 5) * (0-(0.175)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0.58-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0.13-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0.58 + (((tickAnim - 35) / 8) * (0.775-(0.58)));
            zz = 0.13 + (((tickAnim - 35) / 8) * (0.175-(0.13)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 43) / 7) * (0-(0.775)));
            zz = 0.175 + (((tickAnim - 43) / 7) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisuchus entity = (EntityPrehistoricFloraMalawisuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -10.5 + (((tickAnim - 15) / 20) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10.5 + (((tickAnim - 35) / 15) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -1.975 + (((tickAnim - 15) / 20) * (-1.975-(-1.975)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.975 + (((tickAnim - 35) / 15) * (0-(-1.975)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.25 + (((tickAnim - 15) / 20) * (1.25-(1.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.25 + (((tickAnim - 35) / 15) * (0-(1.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 15) / 20) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 35) / 15) * (0-(10.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.575 + (((tickAnim - 15) / 20) * (0.575-(0.575)));
            zz = 0.2 + (((tickAnim - 15) / 20) * (0.2-(0.2)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.575 + (((tickAnim - 35) / 15) * (0-(0.575)));
            zz = 0.2 + (((tickAnim - 35) / 15) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.25 + (((tickAnim - 15) / 20) * (1.25-(1.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.25 + (((tickAnim - 35) / 15) * (0-(1.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 15) / 20) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 35) / 15) * (0-(10.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.575 + (((tickAnim - 15) / 20) * (0.575-(0.575)));
            zz = 0.2 + (((tickAnim - 15) / 20) * (0.2-(0.2)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.575 + (((tickAnim - 35) / 15) * (0-(0.575)));
            zz = 0.2 + (((tickAnim - 35) / 15) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.75 + (((tickAnim - 15) / 20) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 35) / 15) * (0-(9.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.025-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 15) / 20) * (0.35-(0.35)));
            zz = 0.025 + (((tickAnim - 15) / 20) * (0.025-(0.025)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.35 + (((tickAnim - 35) / 15) * (0-(0.35)));
            zz = 0.025 + (((tickAnim - 35) / 15) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1.25 + (((tickAnim - 15) / 20) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 35) / 15) * (0-(1.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 20) * (0.3-(0.3)));
            zz = 0.15 + (((tickAnim - 15) / 20) * (0.15-(0.15)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 15) * (0-(0.3)));
            zz = 0.15 + (((tickAnim - 35) / 15) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.025-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 15) / 20) * (0.35-(0.35)));
            zz = 0.025 + (((tickAnim - 15) / 20) * (0.025-(0.025)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.35 + (((tickAnim - 35) / 15) * (0-(0.35)));
            zz = 0.025 + (((tickAnim - 35) / 15) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1.25 + (((tickAnim - 15) / 20) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 35) / 15) * (0-(1.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 20) * (0.3-(0.3)));
            zz = 0.15 + (((tickAnim - 15) / 20) * (0.15-(0.15)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 15) * (0-(0.3)));
            zz = 0.15 + (((tickAnim - 35) / 15) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -2.75 + (((tickAnim - 15) / 20) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.75 + (((tickAnim - 15) / 20) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.75 + (((tickAnim - 35) / 15) * (0-(0.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -0.5 + (((tickAnim - 15) / 20) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.5 + (((tickAnim - 35) / 15) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13 + (((tickAnim - 15) / 20) * (13-(13)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 35) / 15) * (0-(13)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.275-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.1 + (((tickAnim - 15) / 20) * (-0.1-(-0.1)));
            zz = -0.275 + (((tickAnim - 15) / 20) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.1 + (((tickAnim - 35) / 15) * (0-(-0.1)));
            zz = -0.275 + (((tickAnim - 35) / 15) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisuchus entity = (EntityPrehistoricFloraMalawisuchus) entitylivingbaseIn;
        int animCycle = 280;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 225) {
            xx = 2.5 + (((tickAnim - 25) / 200) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 25) / 200) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 200) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 2.5 + (((tickAnim - 225) / 20) * (0-(2.5)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 245) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 20) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 245) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 20) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 265) {
            xx = -2 + (((tickAnim - 25) / 240) * (0-(-2)));
            yy = 0 + (((tickAnim - 25) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 240) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 0) / 265) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 265) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 265) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 25) / 255) * (0-(0)));
            yy = -0.1 + (((tickAnim - 25) / 255) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 25) / 255) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 265) {
            xx = -2 + (((tickAnim - 25) / 240) * (0-(-2)));
            yy = 0 + (((tickAnim - 25) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 240) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 0) / 265) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 265) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 265) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 25) / 255) * (0-(0)));
            yy = -0.1 + (((tickAnim - 25) / 255) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 25) / 255) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 225) {
            xx = -2.5 + (((tickAnim - 25) / 200) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 200) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 200) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = -2.5 + (((tickAnim - 225) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 225) {
            xx = 3.75 + (((tickAnim - 25) / 200) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 25) / 200) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 200) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 3.75 + (((tickAnim - 225) / 20) * (0-(3.75)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 8.25 + (((tickAnim - 25) / 20) * (13.25-(8.25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 13.25 + (((tickAnim - 45) / 10) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 225) {
            xx = 13.25 + (((tickAnim - 55) / 170) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 55) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 170) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 13.25 + (((tickAnim - 225) / 20) * (0-(13.25)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(xx);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(yy);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 13.25 + (((tickAnim - 25) / 20) * (14.75-(13.25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 14.75 + (((tickAnim - 45) / 3) * (15-(14.75)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 48) / 2) * (14.75-(15)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 14.75 + (((tickAnim - 50) / 3) * (15-(14.75)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 15 + (((tickAnim - 53) / 2) * (14.75-(15)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = 14.75 + (((tickAnim - 55) / 20) * (6.75-(14.75)));
            yy = 0 + (((tickAnim - 55) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 20) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 6.75 + (((tickAnim - 75) / 10) * (9-(6.75)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 9 + (((tickAnim - 85) / 20) * (7-(9)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 7 + (((tickAnim - 105) / 11) * (9-(7)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 135) {
            xx = 9 + (((tickAnim - 116) / 19) * (7-(9)));
            yy = 0 + (((tickAnim - 116) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 19) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 144) {
            xx = 7 + (((tickAnim - 135) / 9) * (9-(7)));
            yy = 0 + (((tickAnim - 135) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 9) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 165) {
            xx = 9 + (((tickAnim - 144) / 21) * (7-(9)));
            yy = 0 + (((tickAnim - 144) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 21) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 177) {
            xx = 7 + (((tickAnim - 165) / 12) * (9-(7)));
            yy = 0 + (((tickAnim - 165) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 12) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 191) {
            xx = 9 + (((tickAnim - 177) / 14) * (10.25-(9)));
            yy = 0 + (((tickAnim - 177) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 177) / 14) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 197) {
            xx = 10.25 + (((tickAnim - 191) / 6) * (9-(10.25)));
            yy = 0 + (((tickAnim - 191) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 6) * (0-(0)));
        }
        else if (tickAnim >= 197 && tickAnim < 209) {
            xx = 9 + (((tickAnim - 197) / 12) * (9-(9)));
            yy = 0 + (((tickAnim - 197) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 197) / 12) * (0-(0)));
        }
        else if (tickAnim >= 209 && tickAnim < 222) {
            xx = 9 + (((tickAnim - 209) / 13) * (11.5-(9)));
            yy = 0 + (((tickAnim - 209) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 209) / 13) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 225) {
            xx = 11.5 + (((tickAnim - 222) / 3) * (18.5-(11.5)));
            yy = 0 + (((tickAnim - 222) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 3) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 18.5 + (((tickAnim - 225) / 20) * (9.66-(18.5)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 255) {
            xx = 9.66 + (((tickAnim - 245) / 10) * (3.45-(9.66)));
            yy = 0 + (((tickAnim - 245) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 10) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 3.45 + (((tickAnim - 255) / 10) * (-1.66-(3.45)));
            yy = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 10) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = -1.66 + (((tickAnim - 265) / 15) * (0-(-1.66)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 11.5 + (((tickAnim - 25) / 20) * (15.25-(11.5)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 15.25 + (((tickAnim - 45) / 3) * (14.5-(15.25)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 48) / 2) * (15.25-(14.5)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 15.25 + (((tickAnim - 50) / 3) * (14.5-(15.25)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 14.5 + (((tickAnim - 53) / 2) * (15.25-(14.5)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 178) {
            xx = 15.25 + (((tickAnim - 55) / 123) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 55) / 123) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 123) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 225) {
            xx = 15.25 + (((tickAnim - 178) / 47) * (2.75-(15.25)));
            yy = 0 + (((tickAnim - 178) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 47) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 2.75 + (((tickAnim - 225) / 20) * (15.25-(2.75)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 255) {
            xx = 15.25 + (((tickAnim - 245) / 10) * (-8.48-(15.25)));
            yy = 0 + (((tickAnim - 245) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 10) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = -8.48 + (((tickAnim - 255) / 10) * (-14.34-(-8.48)));
            yy = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 10) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = -14.34 + (((tickAnim - 265) / 15) * (0-(-14.34)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 85) / 93) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 93) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 178) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 41) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 219) / 9) * (18.75-(0)));
            yy = 0 + (((tickAnim - 219) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 9) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 230) {
            xx = 18.75 + (((tickAnim - 228) / 2) * (13.5-(18.75)));
            yy = 0 + (((tickAnim - 228) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 2) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 233) {
            xx = 13.5 + (((tickAnim - 230) / 3) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 230) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 3) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 245) {
            xx = 13.5 + (((tickAnim - 233) / 12) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 233) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 12) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 255) {
            xx = 13.5 + (((tickAnim - 245) / 10) * (21.36-(13.5)));
            yy = 0 + (((tickAnim - 245) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 10) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 21.36 + (((tickAnim - 255) / 10) * (0.11-(21.36)));
            yy = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 10) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0.11 + (((tickAnim - 265) / 15) * (0-(0.11)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 85) / 93) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 93) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 178) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 41) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 219) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 61) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -6 + (((tickAnim - 25) / 20) * (-6.75-(-6)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 225) {
            xx = -6.75 + (((tickAnim - 45) / 180) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 45) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 180) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = -6.75 + (((tickAnim - 225) / 20) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 255) {
            xx = -6.75 + (((tickAnim - 245) / 10) * (-1.93-(-6.75)));
            yy = 0 + (((tickAnim - 245) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 10) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = -1.93 + (((tickAnim - 255) / 10) * (7.55-(-1.93)));
            yy = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 10) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 7.55 + (((tickAnim - 265) / 15) * (0-(7.55)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-43.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -43.75 + (((tickAnim - 25) / 20) * (-51.25-(-43.75)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -51.25 + (((tickAnim - 45) / 10) * (-51.25-(-51.25)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = -51.25 + (((tickAnim - 55) / 20) * (-51.25-(-51.25)));
            yy = 0 + (((tickAnim - 55) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 20) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = -51.25 + (((tickAnim - 75) / 10) * (0.5-(-51.25)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0.5 + (((tickAnim - 85) / 20) * (-55-(0.5)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = -55 + (((tickAnim - 105) / 10) * (0.5-(-55)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 0.5 + (((tickAnim - 115) / 20) * (-55-(0.5)));
            yy = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 20) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 145) {
            xx = -55 + (((tickAnim - 135) / 10) * (0.5-(-55)));
            yy = 0 + (((tickAnim - 135) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 10) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 165) {
            xx = 0.5 + (((tickAnim - 145) / 20) * (-55-(0.5)));
            yy = 0 + (((tickAnim - 145) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 20) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 175) {
            xx = -55 + (((tickAnim - 165) / 10) * (0.5-(-55)));
            yy = 0 + (((tickAnim - 165) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 10) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 195) {
            xx = 0.5 + (((tickAnim - 175) / 20) * (-55-(0.5)));
            yy = 0 + (((tickAnim - 175) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 20) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 225) {
            xx = -55 + (((tickAnim - 195) / 30) * (-55-(-55)));
            yy = 0 + (((tickAnim - 195) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 30) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 235) {
            xx = -55 + (((tickAnim - 225) / 10) * (-5.75-(-55)));
            yy = 0 + (((tickAnim - 225) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 10) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 245) {
            xx = -5.75 + (((tickAnim - 235) / 10) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 235) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 10) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-22.37-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -22.37 + (((tickAnim - 13) / 12) * (15.25-(-22.37)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 55) {
            xx = 15.25 + (((tickAnim - 25) / 30) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 25) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 30) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = 15.25 + (((tickAnim - 55) / 20) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 55) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 20) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 15.25 + (((tickAnim - 75) / 20) * (-23.25-(15.25)));
            yy = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -23.25 + (((tickAnim - 95) / 10) * (20.25-(-23.25)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 20.25 + (((tickAnim - 105) / 20) * (-23.25-(20.25)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = -23.25 + (((tickAnim - 125) / 10) * (20.25-(-23.25)));
            yy = 0 + (((tickAnim - 125) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 10) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = 20.25 + (((tickAnim - 135) / 20) * (-23.25-(20.25)));
            yy = 0 + (((tickAnim - 135) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 20) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = -23.25 + (((tickAnim - 155) / 10) * (20.25-(-23.25)));
            yy = 0 + (((tickAnim - 155) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 10) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 185) {
            xx = 20.25 + (((tickAnim - 165) / 20) * (-23.25-(20.25)));
            yy = 0 + (((tickAnim - 165) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 20) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 195) {
            xx = -23.25 + (((tickAnim - 185) / 10) * (20.25-(-23.25)));
            yy = 0 + (((tickAnim - 185) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 10) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 225) {
            xx = 20.25 + (((tickAnim - 195) / 30) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 195) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 30) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 235) {
            xx = 20.25 + (((tickAnim - 225) / 10) * (-28.62-(20.25)));
            yy = 0 + (((tickAnim - 225) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 10) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 245) {
            xx = -28.62 + (((tickAnim - 235) / 10) * (0-(-28.62)));
            yy = 0 + (((tickAnim - 235) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 10) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 10) * (0.725-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = 0.725 + (((tickAnim - 85) / 20) * (0-(0.725)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 10) * (0.725-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            yy = 0.725 + (((tickAnim - 115) / 20) * (0-(0.725)));
            zz = 0 + (((tickAnim - 115) / 20) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 135) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 10) * (0.725-(0)));
            zz = 0 + (((tickAnim - 135) / 10) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 145) / 20) * (0-(0)));
            yy = 0.725 + (((tickAnim - 145) / 20) * (0-(0.725)));
            zz = 0 + (((tickAnim - 145) / 20) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 165) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 165) / 10) * (0.725-(0)));
            zz = 0 + (((tickAnim - 165) / 10) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 175) / 20) * (0-(0)));
            yy = 0.725 + (((tickAnim - 175) / 20) * (0-(0.725)));
            zz = 0 + (((tickAnim - 175) / 20) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 195) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 195) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 30) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (73.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 73.75 + (((tickAnim - 13) / 12) * (19.5-(73.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 55) {
            xx = 19.5 + (((tickAnim - 25) / 30) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 25) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 30) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = 19.5 + (((tickAnim - 55) / 20) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 55) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 20) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 19.5 + (((tickAnim - 75) / 10) * (83.75-(19.5)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 83.75 + (((tickAnim - 85) / 10) * (80.63-(83.75)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 80.63 + (((tickAnim - 95) / 10) * (19.5-(80.63)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 19.5 + (((tickAnim - 105) / 10) * (83.75-(19.5)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 83.75 + (((tickAnim - 115) / 10) * (80.63-(83.75)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 80.63 + (((tickAnim - 125) / 10) * (19.5-(80.63)));
            yy = 0 + (((tickAnim - 125) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 10) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 145) {
            xx = 19.5 + (((tickAnim - 135) / 10) * (83.75-(19.5)));
            yy = 0 + (((tickAnim - 135) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 10) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = 83.75 + (((tickAnim - 145) / 10) * (80.63-(83.75)));
            yy = 0 + (((tickAnim - 145) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 10) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = 80.63 + (((tickAnim - 155) / 10) * (19.5-(80.63)));
            yy = 0 + (((tickAnim - 155) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 10) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 175) {
            xx = 19.5 + (((tickAnim - 165) / 10) * (83.75-(19.5)));
            yy = 0 + (((tickAnim - 165) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 10) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 185) {
            xx = 83.75 + (((tickAnim - 175) / 10) * (80.63-(83.75)));
            yy = 0 + (((tickAnim - 175) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 10) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 195) {
            xx = 80.63 + (((tickAnim - 185) / 10) * (19.5-(80.63)));
            yy = 0 + (((tickAnim - 185) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 10) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 225) {
            xx = 19.5 + (((tickAnim - 195) / 30) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 195) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 30) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 235) {
            xx = 19.5 + (((tickAnim - 225) / 10) * (61.25-(19.5)));
            yy = 0 + (((tickAnim - 225) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 10) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 245) {
            xx = 61.25 + (((tickAnim - 235) / 10) * (0-(61.25)));
            yy = 0 + (((tickAnim - 235) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 10) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.29-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.55-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.29 + (((tickAnim - 13) / 12) * (0.575-(0.29)));
            zz = -0.55 + (((tickAnim - 13) / 12) * (0-(-0.55)));
        }
        else if (tickAnim >= 25 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 25) / 30) * (0-(0)));
            yy = 0.575 + (((tickAnim - 25) / 30) * (0.575-(0.575)));
            zz = 0 + (((tickAnim - 25) / 30) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 55) / 20) * (0-(0)));
            yy = 0.575 + (((tickAnim - 55) / 20) * (0.575-(0.575)));
            zz = 0 + (((tickAnim - 55) / 20) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            yy = 0.575 + (((tickAnim - 75) / 10) * (0.745-(0.575)));
            zz = 0 + (((tickAnim - 75) / 10) * (-0.675-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            yy = 0.745 + (((tickAnim - 85) / 10) * (0.035-(0.745)));
            zz = -0.675 + (((tickAnim - 85) / 10) * (-0.79-(-0.675)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            yy = 0.035 + (((tickAnim - 95) / 10) * (0.575-(0.035)));
            zz = -0.79 + (((tickAnim - 95) / 10) * (0-(-0.79)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            yy = 0.575 + (((tickAnim - 105) / 10) * (0.745-(0.575)));
            zz = 0 + (((tickAnim - 105) / 10) * (-0.675-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            yy = 0.745 + (((tickAnim - 115) / 10) * (0.035-(0.745)));
            zz = -0.675 + (((tickAnim - 115) / 10) * (-0.79-(-0.675)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 125) / 10) * (0-(0)));
            yy = 0.035 + (((tickAnim - 125) / 10) * (0.575-(0.035)));
            zz = -0.79 + (((tickAnim - 125) / 10) * (0-(-0.79)));
        }
        else if (tickAnim >= 135 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 135) / 10) * (0-(0)));
            yy = 0.575 + (((tickAnim - 135) / 10) * (0.745-(0.575)));
            zz = 0 + (((tickAnim - 135) / 10) * (-0.675-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 145) / 10) * (0-(0)));
            yy = 0.745 + (((tickAnim - 145) / 10) * (0.035-(0.745)));
            zz = -0.675 + (((tickAnim - 145) / 10) * (-0.79-(-0.675)));
        }
        else if (tickAnim >= 155 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 155) / 10) * (0-(0)));
            yy = 0.035 + (((tickAnim - 155) / 10) * (0.575-(0.035)));
            zz = -0.79 + (((tickAnim - 155) / 10) * (0-(-0.79)));
        }
        else if (tickAnim >= 165 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 165) / 10) * (0-(0)));
            yy = 0.575 + (((tickAnim - 165) / 10) * (0.745-(0.575)));
            zz = 0 + (((tickAnim - 165) / 10) * (-0.675-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 175) / 10) * (0-(0)));
            yy = 0.745 + (((tickAnim - 175) / 10) * (0.035-(0.745)));
            zz = -0.675 + (((tickAnim - 175) / 10) * (-0.79-(-0.675)));
        }
        else if (tickAnim >= 185 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 185) / 10) * (0-(0)));
            yy = 0.035 + (((tickAnim - 185) / 10) * (0.575-(0.035)));
            zz = -0.79 + (((tickAnim - 185) / 10) * (0-(-0.79)));
        }
        else if (tickAnim >= 195 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 195) / 30) * (0-(0)));
            yy = 0.575 + (((tickAnim - 195) / 30) * (0.575-(0.575)));
            zz = 0 + (((tickAnim - 195) / 30) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 225) / 10) * (0-(0)));
            yy = 0.575 + (((tickAnim - 225) / 10) * (0.29-(0.575)));
            zz = 0 + (((tickAnim - 225) / 10) * (-0.425-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 235) / 10) * (0-(0)));
            yy = 0.29 + (((tickAnim - 235) / 10) * (0-(0.29)));
            zz = -0.425 + (((tickAnim - 235) / 10) * (0-(-0.425)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-18.17347-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.62805-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.25945-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -18.17347 + (((tickAnim - 25) / 20) * (-26.67347-(-18.17347)));
            yy = 0.62805 + (((tickAnim - 25) / 20) * (0.62805-(0.62805)));
            zz = -0.25945 + (((tickAnim - 25) / 20) * (-0.25945-(-0.25945)));
        }
        else if (tickAnim >= 45 && tickAnim < 225) {
            xx = -26.67347 + (((tickAnim - 45) / 180) * (-26.67347-(-26.67347)));
            yy = 0.62805 + (((tickAnim - 45) / 180) * (0.62805-(0.62805)));
            zz = -0.25945 + (((tickAnim - 45) / 180) * (-0.25945-(-0.25945)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = -26.67347 + (((tickAnim - 225) / 20) * (0-(-26.67347)));
            yy = 0.62805 + (((tickAnim - 225) / 20) * (0-(0.62805)));
            zz = -0.25945 + (((tickAnim - 225) / 20) * (0-(-0.25945)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 0) / 225) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 225) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 225) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 0) / 225) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 225) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 225) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 6.75 + (((tickAnim - 25) / 20) * (9.75-(6.75)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 225) {
            xx = 9.75 + (((tickAnim - 45) / 180) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 45) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 180) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 9.75 + (((tickAnim - 225) / 20) * (0-(9.75)));
            yy = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 20) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.17-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0.45 + (((tickAnim - 25) / 20) * (0.45-(0.45)));
            zz = -0.17 + (((tickAnim - 25) / 20) * (-0.17-(-0.17)));
        }
        else if (tickAnim >= 45 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 45) / 180) * (0-(0)));
            yy = 0.45 + (((tickAnim - 45) / 180) * (0.45-(0.45)));
            zz = -0.17 + (((tickAnim - 45) / 180) * (-0.17-(-0.17)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            yy = 0.45 + (((tickAnim - 225) / 20) * (0-(0.45)));
            zz = -0.17 + (((tickAnim - 225) / 20) * (0-(-0.17)));
        }
        else if (tickAnim >= 245 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 225) {
            xx = -1.25 + (((tickAnim - 25) / 200) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 25) / 200) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 200) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 265) {
            xx = -1.25 + (((tickAnim - 225) / 40) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 225) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 40) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 225) {
            xx = -1.75 + (((tickAnim - 25) / 200) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 25) / 200) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 200) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 265) {
            xx = -1.75 + (((tickAnim - 225) / 40) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 225) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 40) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 225) {
            xx = -4.25 + (((tickAnim - 25) / 200) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 25) / 200) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 200) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 265) {
            xx = -4.25 + (((tickAnim - 225) / 40) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 225) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 40) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 225) {
            xx = -8.75 + (((tickAnim - 25) / 200) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 25) / 200) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 200) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 265) {
            xx = -8.75 + (((tickAnim - 225) / 40) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 225) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 40) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = -89.25 + (((tickAnim - 0) / 80) * (-66.5-(-89.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8 + (((tickAnim - 0) / 80) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 132) {
            xx = -66.5 + (((tickAnim - 80) / 52) * (-87.5-(-66.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8 + (((tickAnim - 80) / 52) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8)));
            zz = 0 + (((tickAnim - 80) / 52) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = -87.5 + (((tickAnim - 132) / 33) * (-29-(-87.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8 + (((tickAnim - 132) / 33) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8)));
            zz = 0 + (((tickAnim - 132) / 33) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 177) {
            xx = -29 + (((tickAnim - 165) / 12) * (-8.44872-(-29)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8 + (((tickAnim - 165) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8)));
            zz = 0 + (((tickAnim - 165) / 12) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 198) {
            xx = -8.44872 + (((tickAnim - 177) / 21) * (-1-(-8.44872)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8 + (((tickAnim - 177) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8)));
            zz = 0 + (((tickAnim - 177) / 21) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 214) {
            xx = -1 + (((tickAnim - 198) / 16) * (8.25-(-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8 + (((tickAnim - 198) / 16) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8)));
            zz = 0 + (((tickAnim - 198) / 16) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 225) {
            xx = 8.25 + (((tickAnim - 214) / 11) * (35-(8.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8 + (((tickAnim - 214) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8)));
            zz = 0 + (((tickAnim - 214) / 11) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 35 + (((tickAnim - 225) / 20) * (45.51091-(35)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8 + (((tickAnim - 225) / 20) * (3.78182-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*8)));
            zz = 0 + (((tickAnim - 225) / 20) * (-0.23273-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 255) {
            xx = 45.51091 + (((tickAnim - 245) / 10) * (29.01091-(45.51091)));
            yy = 3.78182 + (((tickAnim - 245) / 10) * (3.78182-(3.78182)));
            zz = -0.23273 + (((tickAnim - 245) / 10) * (-0.23273-(-0.23273)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 29.01091 + (((tickAnim - 255) / 10) * (-8.73909-(29.01091)));
            yy = 3.78182 + (((tickAnim - 255) / 10) * (3.78182-(3.78182)));
            zz = -0.23273 + (((tickAnim - 255) / 10) * (-0.23273-(-0.23273)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = -8.73909 + (((tickAnim - 265) / 15) * (45.51091-(-8.73909)));
            yy = 3.78182 + (((tickAnim - 265) / 15) * (3.78182-(3.78182)));
            zz = -0.23273 + (((tickAnim - 265) / 15) * (-0.23273-(-0.23273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(grub, grub.rotateAngleX + (float) Math.toRadians(xx), grub.rotateAngleY + (float) Math.toRadians(yy), grub.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = -11.7 + (((tickAnim - 0) / 80) * (-10.275-(-11.7)));
            zz = -9.85 + (((tickAnim - 0) / 80) * (-10.825-(-9.85)));
        }
        else if (tickAnim >= 80 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 80) / 28) * (0.69-(0)));
            yy = -10.275 + (((tickAnim - 80) / 28) * (-10.785-(-10.275)));
            zz = -10.825 + (((tickAnim - 80) / 28) * (-8.075-(-10.825)));
        }
        else if (tickAnim >= 108 && tickAnim < 132) {
            xx = 0.69 + (((tickAnim - 108) / 24) * (1.25-(0.69)));
            yy = -10.785 + (((tickAnim - 108) / 24) * (-9.61-(-10.785)));
            zz = -8.075 + (((tickAnim - 108) / 24) * (-9.505-(-8.075)));
        }
        else if (tickAnim >= 132 && tickAnim < 165) {
            xx = 1.25 + (((tickAnim - 132) / 33) * (1.545-(1.25)));
            yy = -9.61 + (((tickAnim - 132) / 33) * (-7.855-(-9.61)));
            zz = -9.505 + (((tickAnim - 132) / 33) * (-10.98-(-9.505)));
        }
        else if (tickAnim >= 165 && tickAnim < 198) {
            xx = 1.545 + (((tickAnim - 165) / 33) * (0-(1.545)));
            yy = -7.855 + (((tickAnim - 165) / 33) * (-7.845-(-7.855)));
            zz = -10.98 + (((tickAnim - 165) / 33) * (-12.42-(-10.98)));
        }
        else if (tickAnim >= 198 && tickAnim < 214) {
            xx = 0 + (((tickAnim - 198) / 16) * (0-(0)));
            yy = -7.845 + (((tickAnim - 198) / 16) * (-7.845-(-7.845)));
            zz = -12.42 + (((tickAnim - 198) / 16) * (-12.495-(-12.42)));
        }
        else if (tickAnim >= 214 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 214) / 11) * (0-(0)));
            yy = -7.845 + (((tickAnim - 214) / 11) * (-7.845-(-7.845)));
            zz = -12.495 + (((tickAnim - 214) / 11) * (-13.095-(-12.495)));
        }
        else if (tickAnim >= 225 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 225) / 20) * (0-(0)));
            yy = -7.845 + (((tickAnim - 225) / 20) * (-4.71-(-7.845)));
            zz = -13.095 + (((tickAnim - 225) / 20) * (-14.305-(-13.095)));
        }
        else if (tickAnim >= 245 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 245) / 10) * (0-(0)));
            yy = -4.71 + (((tickAnim - 245) / 10) * (-1.115-(-4.71)));
            zz = -14.305 + (((tickAnim - 245) / 10) * (-14.795-(-14.305)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            yy = -1.115 + (((tickAnim - 255) / 10) * (0.45-(-1.115)));
            zz = -14.795 + (((tickAnim - 255) / 10) * (-11.89-(-14.795)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            yy = 0.45 + (((tickAnim - 265) / 15) * (0-(0.45)));
            zz = -11.89 + (((tickAnim - 265) / 15) * (0-(-11.89)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.grub.rotationPointX = this.grub.rotationPointX + (float)(xx);
        this.grub.rotationPointY = this.grub.rotationPointY - (float)(yy);
        this.grub.rotationPointZ = this.grub.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 225) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 0) / 225) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 0) / 225) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 225) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 263) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 225) / 38) * (-24.74-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            yy = 0 + (((tickAnim - 225) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 38) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 265) {
            xx = -24.74 + (((tickAnim - 263) / 2) * (-7.75-(-24.74)));
            yy = 0 + (((tickAnim - 263) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 2) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = -7.75 + (((tickAnim - 265) / 15) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(grub2, grub2.rotateAngleX + (float) Math.toRadians(xx), grub2.rotateAngleY + (float) Math.toRadians(yy), grub2.rotateAngleZ + (float) Math.toRadians(zz));

        this.grub2.rotationPointX = this.grub2.rotationPointX + (float)(0);
        this.grub2.rotationPointY = this.grub2.rotationPointY - (float)(0);
        this.grub2.rotationPointZ = this.grub2.rotationPointZ + (float)(0);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisuchus entity = (EntityPrehistoricFloraMalawisuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.75 + (((tickAnim - 10) / 10) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6 + (((tickAnim - 10) / 10) * (0-(-6)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 13.25 + (((tickAnim - 10) / 5) * (0-(13.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisuchus entity = (EntityPrehistoricFloraMalawisuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 3) / 2) * (-2.9923-(3)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.32311-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (2.73097-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.9923 + (((tickAnim - 5) / 3) * (-2-(-2.9923)));
            yy = 0.32311 + (((tickAnim - 5) / 3) * (0-(0.32311)));
            zz = 2.73097 + (((tickAnim - 5) / 3) * (0-(2.73097)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2 + (((tickAnim - 8) / 2) * (0-(-2)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.25 + (((tickAnim - 3) / 2) * (-14.75-(-3.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -14.75 + (((tickAnim - 5) / 3) * (2-(-14.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2 + (((tickAnim - 8) / 2) * (0-(2)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.5 + (((tickAnim - 3) / 2) * (37-(6.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 37 + (((tickAnim - 5) / 3) * (0-(37)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.75 + (((tickAnim - 3) / 2) * (-4-(-1.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -4 + (((tickAnim - 5) / 3) * (0-(-4)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
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
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisuchus entity = (EntityPrehistoricFloraMalawisuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 10) / 10) * (0-(9.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(xx);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(yy);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.5 + (((tickAnim - 10) / 10) * (0-(11.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13 + (((tickAnim - 5) / 5) * (13-(13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 10) / 10) * (0-(13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 29.25 + (((tickAnim - 5) / 5) * (0-(29.25)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.125 + (((tickAnim - 5) / 5) * (-0.1-(0.125)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.1 + (((tickAnim - 10) / 5) * (0-(-0.1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.87-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8.87 + (((tickAnim - 5) / 5) * (-2.75-(-8.87)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.75 + (((tickAnim - 10) / 10) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.25 + (((tickAnim - 10) / 10) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.25 + (((tickAnim - 10) / 10) * (0-(4.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.125 + (((tickAnim - 10) / 10) * (0-(0.125)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 10) / 10) * (0-(2.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.25 + (((tickAnim - 10) / 10) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.25 + (((tickAnim - 10) / 10) * (0-(4.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.125 + (((tickAnim - 10) / 10) * (0-(0.125)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 10) / 10) * (0-(2.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMalawisuchus entity = (EntityPrehistoricFloraMalawisuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*0.2);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 20.45745 + (((tickAnim - 0) / 11) * (-10.5-(20.45745)));
            yy = -2.08039 + (((tickAnim - 0) / 11) * (0-(-2.08039)));
            zz = 0.7837 + (((tickAnim - 0) / 11) * (0-(0.7837)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -10.5 + (((tickAnim - 11) / 9) * (20.45745-(-10.5)));
            yy = 0 + (((tickAnim - 11) / 9) * (-2.08039-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0.7837-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 16.5 + (((tickAnim - 0) / 6) * (-7.27-(16.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -7.27 + (((tickAnim - 6) / 5) * (-16-(-7.27)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -16 + (((tickAnim - 11) / 9) * (16.5-(-16)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.9 + (((tickAnim - 6) / 5) * (0-(0.9)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 45.25 + (((tickAnim - 0) / 5) * (41.03-(45.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 41.03 + (((tickAnim - 5) / 3) * (9.3-(41.03)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 9.3 + (((tickAnim - 8) / 3) * (25.75-(9.3)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 25.75 + (((tickAnim - 11) / 4) * (-1.89-(25.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.89 + (((tickAnim - 15) / 5) * (45.25-(-1.89)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 5) * (0.995-(0.15)));
            zz = 0.45 + (((tickAnim - 0) / 5) * (0.2-(0.45)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.995 + (((tickAnim - 5) / 3) * (-0.02-(0.995)));
            zz = 0.2 + (((tickAnim - 5) / 3) * (0.07-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.02 + (((tickAnim - 8) / 3) * (0-(-0.02)));
            zz = 0.07 + (((tickAnim - 8) / 3) * (0-(0.07)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (-0.205-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.205 + (((tickAnim - 15) / 5) * (0.15-(-0.205)));
            zz = 0.2 + (((tickAnim - 15) / 5) * (0.45-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -10.5 + (((tickAnim - 0) / 11) * (20.45745-(-10.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (-2.08039-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.7837-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 20.45745 + (((tickAnim - 11) / 9) * (-10.5-(20.45745)));
            yy = -2.08039 + (((tickAnim - 11) / 9) * (0-(-2.08039)));
            zz = 0.7837 + (((tickAnim - 11) / 9) * (0-(0.7837)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -16 + (((tickAnim - 0) / 11) * (16.5-(-16)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 16.5 + (((tickAnim - 11) / 4) * (-7.27-(16.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.27 + (((tickAnim - 15) / 5) * (-16-(-7.27)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.9 + (((tickAnim - 15) / 5) * (0-(0.9)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25.75 + (((tickAnim - 0) / 5) * (-3.5-(25.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -3.5 + (((tickAnim - 5) / 6) * (45.25-(-3.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 45.25 + (((tickAnim - 11) / 4) * (41.03-(45.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 41.03 + (((tickAnim - 15) / 3) * (9.3-(41.03)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 9.3 + (((tickAnim - 18) / 2) * (25.75-(9.3)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.09-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.23-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 3) / 2) * (-0.225-(0.09)));
            zz = 0.23 + (((tickAnim - 3) / 2) * (0.45-(0.23)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 5) / 6) * (0.15-(-0.225)));
            zz = 0.45 + (((tickAnim - 5) / 6) * (0.45-(0.45)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 11) / 4) * (0.995-(0.15)));
            zz = 0.45 + (((tickAnim - 11) / 4) * (0.2-(0.45)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.995 + (((tickAnim - 15) / 3) * (-0.02-(0.995)));
            zz = 0.2 + (((tickAnim - 15) / 3) * (0.07-(0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.02 + (((tickAnim - 18) / 2) * (0-(-0.02)));
            zz = 0.07 + (((tickAnim - 18) / 2) * (0-(0.07)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*1.5), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*1), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*1.5));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-1.5), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-1), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*1.5), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-1), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-1.5), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-1), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -29.75 + (((tickAnim - 0) / 9) * (21.36772-(-29.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.74087-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.41888-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 21.36772 + (((tickAnim - 9) / 11) * (-29.75-(21.36772)));
            yy = 0.74087 + (((tickAnim - 9) / 11) * (0-(0.74087)));
            zz = 0.41888 + (((tickAnim - 9) / 11) * (0-(0.41888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 19.5 + (((tickAnim - 0) / 9) * (15.75-(19.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 15.75 + (((tickAnim - 9) / 6) * (-24.23-(15.75)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -24.23 + (((tickAnim - 15) / 5) * (19.5-(-24.23)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.125-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 9) / 11) * (0-(0.3)));
            zz = 0.125 + (((tickAnim - 9) / 11) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.5 + (((tickAnim - 0) / 3) * (-5.73-(10.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -5.73 + (((tickAnim - 3) / 6) * (30.5-(-5.73)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 30.5 + (((tickAnim - 9) / 3) * (85.78-(30.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 85.78 + (((tickAnim - 12) / 3) * (75.48-(85.78)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 75.48 + (((tickAnim - 15) / 5) * (10.5-(75.48)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.04-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0.4-(0)));
            zz = -0.04 + (((tickAnim - 3) / 6) * (-0.1-(-0.04)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 9) / 3) * (0.925-(0.4)));
            zz = -0.1 + (((tickAnim - 9) / 3) * (-0.59-(-0.1)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 12) / 3) * (0.4-(0.925)));
            zz = -0.59 + (((tickAnim - 12) / 3) * (-0.55-(-0.59)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 15) / 5) * (0-(0.4)));
            zz = -0.55 + (((tickAnim - 15) / 5) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 21.36772 + (((tickAnim - 0) / 9) * (-29.75-(21.36772)));
            yy = 0.74087 + (((tickAnim - 0) / 9) * (0-(0.74087)));
            zz = 0.41888 + (((tickAnim - 0) / 9) * (0-(0.41888)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -29.75 + (((tickAnim - 9) / 11) * (21.36772-(-29.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0.74087-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0.41888-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.75 + (((tickAnim - 0) / 6) * (-24.23-(15.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -24.23 + (((tickAnim - 6) / 3) * (19.5-(-24.23)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 19.5 + (((tickAnim - 9) / 11) * (15.75-(19.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 9) * (0-(0.3)));
            zz = 0.125 + (((tickAnim - 0) / 9) * (0-(0.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0.3-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.5 + (((tickAnim - 0) / 3) * (85.78-(30.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 85.78 + (((tickAnim - 3) / 3) * (75.48-(85.78)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 75.48 + (((tickAnim - 6) / 3) * (10.5-(75.48)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 10.5 + (((tickAnim - 9) / 6) * (-14.98-(10.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -14.98 + (((tickAnim - 15) / 5) * (30.5-(-14.98)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 3) * (0.925-(0.4)));
            zz = -0.1 + (((tickAnim - 0) / 3) * (-0.59-(-0.1)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 3) / 3) * (0.4-(0.925)));
            zz = -0.59 + (((tickAnim - 3) / 3) * (-0.55-(-0.59)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 6) / 3) * (0.2-(0.4)));
            zz = -0.55 + (((tickAnim - 6) / 3) * (0-(-0.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 9) / 6) * (0.045-(0.2)));
            zz = 0 + (((tickAnim - 9) / 6) * (-0.05-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.045 + (((tickAnim - 15) / 5) * (0.4-(0.045)));
            zz = -0.05 + (((tickAnim - 15) / 5) * (-0.1-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-1.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-1.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1.5));
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMalawisuchus entity = (EntityPrehistoricFloraMalawisuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+80))*8), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*-1.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+20))*1.5);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -14.22036 + (((tickAnim - 0) / 5) * (42.02964-(-14.22036)));
            yy = -11.3047 + (((tickAnim - 0) / 5) * (-11.3047-(-11.3047)));
            zz = -6.50028 + (((tickAnim - 0) / 5) * (-6.50028-(-6.50028)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 42.02964 + (((tickAnim - 5) / 3) * (7.52459-(42.02964)));
            yy = -11.3047 + (((tickAnim - 5) / 3) * (-11.89663-(-11.3047)));
            zz = -6.50028 + (((tickAnim - 5) / 3) * (-18.44948-(-6.50028)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.52459 + (((tickAnim - 8) / 2) * (-14.22036-(7.52459)));
            yy = -11.89663 + (((tickAnim - 8) / 2) * (-11.3047-(-11.89663)));
            zz = -18.44948 + (((tickAnim - 8) / 2) * (-6.50028-(-18.44948)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.75 + (((tickAnim - 0) / 5) * (25.75-(-2.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25.75 + (((tickAnim - 5) / 3) * (25.13-(25.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25.13 + (((tickAnim - 8) / 2) * (-2.75-(25.13)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 10) * (-0.175-(-0.175)));
            zz = 0.025 + (((tickAnim - 0) / 10) * (0.025-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.53623 + (((tickAnim - 0) / 3) * (-6.94756-(18.53623)));
            yy = 0.55424 + (((tickAnim - 0) / 3) * (-2.39374-(0.55424)));
            zz = 7.47961 + (((tickAnim - 0) / 3) * (3.78909-(7.47961)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -6.94756 + (((tickAnim - 3) / 2) * (87.06865-(-6.94756)));
            yy = -2.39374 + (((tickAnim - 3) / 2) * (-5.34172-(-2.39374)));
            zz = 3.78909 + (((tickAnim - 3) / 2) * (0.09858-(3.78909)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 87.06865 + (((tickAnim - 5) / 3) * (102.92279-(87.06865)));
            yy = -5.34172 + (((tickAnim - 5) / 3) * (-2.94816-(-5.34172)));
            zz = 0.09858 + (((tickAnim - 5) / 3) * (-9.46381-(0.09858)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 102.92279 + (((tickAnim - 8) / 2) * (18.53623-(102.92279)));
            yy = -2.94816 + (((tickAnim - 8) / 2) * (0.55424-(-2.94816)));
            zz = -9.46381 + (((tickAnim - 8) / 2) * (7.47961-(-9.46381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 10) * (-0.05-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -14.22036 + (((tickAnim - 0) / 5) * (42.02964-(-14.22036)));
            yy = 11.3047 + (((tickAnim - 0) / 5) * (11.3047-(11.3047)));
            zz = 6.50028 + (((tickAnim - 0) / 5) * (6.50028-(6.50028)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 42.02964 + (((tickAnim - 5) / 3) * (7.52459-(42.02964)));
            yy = 11.3047 + (((tickAnim - 5) / 3) * (11.89663-(11.3047)));
            zz = 6.50028 + (((tickAnim - 5) / 3) * (18.44948-(6.50028)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.52459 + (((tickAnim - 8) / 2) * (-14.22036-(7.52459)));
            yy = 11.89663 + (((tickAnim - 8) / 2) * (11.3047-(11.89663)));
            zz = 18.44948 + (((tickAnim - 8) / 2) * (6.50028-(18.44948)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.75 + (((tickAnim - 0) / 5) * (25.75-(-2.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25.75 + (((tickAnim - 5) / 3) * (25.13-(25.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25.13 + (((tickAnim - 8) / 2) * (-2.75-(25.13)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 10) * (-0.175-(-0.175)));
            zz = 0.025 + (((tickAnim - 0) / 10) * (0.025-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.53623 + (((tickAnim - 0) / 3) * (-6.94756-(18.53623)));
            yy = -0.55424 + (((tickAnim - 0) / 3) * (2.39374-(-0.55424)));
            zz = -7.47961 + (((tickAnim - 0) / 3) * (-3.78909-(-7.47961)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -6.94756 + (((tickAnim - 3) / 2) * (86.76033-(-6.94756)));
            yy = 2.39374 + (((tickAnim - 3) / 2) * (2.91807-(2.39374)));
            zz = -3.78909 + (((tickAnim - 3) / 2) * (1.30186-(-3.78909)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 86.76033 + (((tickAnim - 5) / 3) * (102.30244-(86.76033)));
            yy = 2.91807 + (((tickAnim - 5) / 3) * (2.94816-(2.91807)));
            zz = 1.30186 + (((tickAnim - 5) / 3) * (-3.78909-(1.30186)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 102.30244 + (((tickAnim - 8) / 2) * (18.53623-(102.30244)));
            yy = 2.94816 + (((tickAnim - 8) / 2) * (-0.55424-(2.94816)));
            zz = -3.78909 + (((tickAnim - 8) / 2) * (-7.47961-(-3.78909)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 10) * (-0.05-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-8), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*8), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-9), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.45);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-6), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 39.75 + (((tickAnim - 0) / 3) * (1.94079-(39.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.44283-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-11.15847-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.94079 + (((tickAnim - 3) / 2) * (-35-(1.94079)));
            yy = 4.44283 + (((tickAnim - 3) / 2) * (0-(4.44283)));
            zz = -11.15847 + (((tickAnim - 3) / 2) * (0-(-11.15847)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 5) / 5) * (39.75-(-35)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(0);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(0);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 0) / 3) * (-32.97-(17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -32.97 + (((tickAnim - 3) / 2) * (15.5604-(-32.97)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15.5604 + (((tickAnim - 5) / 5) * (17.5-(15.5604)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.2-(0)));
            zz = 0.075 + (((tickAnim - 0) / 5) * (0.05-(0.075)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 5) / 2) * (0.77-(-0.2)));
            zz = 0.05 + (((tickAnim - 5) / 2) * (0.06-(0.05)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.77 + (((tickAnim - 7) / 3) * (0-(0.77)));
            zz = 0.06 + (((tickAnim - 7) / 3) * (0.075-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 79.75 + (((tickAnim - 0) / 3) * (111.25-(79.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 111.25 + (((tickAnim - 3) / 2) * (20.75-(111.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 20.75 + (((tickAnim - 5) / 2) * (-16.33-(20.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -16.33 + (((tickAnim - 7) / 1) * (-16.5-(-16.33)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.5 + (((tickAnim - 8) / 2) * (79.75-(-16.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.7 + (((tickAnim - 0) / 3) * (-0.75-(-0.7)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.75 + (((tickAnim - 3) / 2) * (0-(-0.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.7-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 39.75 + (((tickAnim - 0) / 3) * (1.94079-(39.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4.44283-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (11.15847-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.94079 + (((tickAnim - 3) / 2) * (-35-(1.94079)));
            yy = -4.44283 + (((tickAnim - 3) / 2) * (0-(-4.44283)));
            zz = 11.15847 + (((tickAnim - 3) / 2) * (0-(11.15847)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 5) / 5) * (39.75-(-35)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(0);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(0);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 0) / 3) * (-32.97-(17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -32.97 + (((tickAnim - 3) / 2) * (15.5604-(-32.97)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15.5604 + (((tickAnim - 5) / 5) * (17.5-(15.5604)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.2-(0)));
            zz = 0.075 + (((tickAnim - 0) / 5) * (0.05-(0.075)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 5) / 2) * (0.77-(-0.2)));
            zz = 0.05 + (((tickAnim - 5) / 2) * (0.06-(0.05)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.77 + (((tickAnim - 7) / 3) * (0-(0.77)));
            zz = 0.06 + (((tickAnim - 7) / 3) * (0.075-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 79.75 + (((tickAnim - 0) / 3) * (111.25-(79.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 111.25 + (((tickAnim - 3) / 2) * (20.75-(111.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 20.75 + (((tickAnim - 5) / 2) * (-16.33-(20.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -16.33 + (((tickAnim - 7) / 1) * (-16.5-(-16.33)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.5 + (((tickAnim - 8) / 2) * (79.75-(-16.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.7 + (((tickAnim - 0) / 3) * (-0.75-(-0.7)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.75 + (((tickAnim - 3) / 2) * (0-(-0.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.7-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+20))*3), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*8), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*8), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*12), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMalawisuchus e = (EntityPrehistoricFloraMalawisuchus) entity;
        animator.update(entity);



    }
}
