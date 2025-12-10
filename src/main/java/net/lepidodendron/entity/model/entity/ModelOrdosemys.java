package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOrdosemys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelOrdosemys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
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
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelOrdosemys() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 10, -3.0F, -5.6F, -6.3F, 6, 2, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -6.0F, -2.35F, -6.3F, 12, 2, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.45F, 0.7F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 38, -3.0F, -2.0F, 0.0F, 6, 2, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.45F, -6.3F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 40, -3.0F, -2.0F, -5.0F, 6, 2, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.6F, -6.3F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 0, -3.0F, 0.0F, -5.0F, 6, 2, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.6F, 0.7F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 32, -3.0F, 0.0F, 0.0F, 6, 2, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.0F, -5.6F, -6.3F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3054F, 0.0F, -0.3927F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 43, -5.0F, 0.0F, -5.0F, 5, 0, 5, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.0F, -5.6F, -3.3F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3927F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 20, -5.0F, 0.0F, -3.0F, 5, 0, 7, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.0F, -5.6F, 0.7F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, -0.3927F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 51, 55, -4.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-6.5958F, -2.0F, 3.6321F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0654F, -0.6102F, -0.0532F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 15, 0.0F, -2.175F, -4.0F, 5, 2, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-8.5092F, -2.0F, -0.9873F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0972F, -1.1769F, -0.0911F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 28, 0.0F, -2.0F, -5.0F, 5, 2, 5, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-8.5092F, -2.0F, -0.9873F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -1.6581F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 36, -6.0F, -2.0F, -4.0F, 6, 2, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-7.9862F, -2.0F, -6.9645F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -3.0732F, -1.0021F, 3.0605F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 46, -5.0F, -2.0F, -5.0F, 5, 2, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-5.2997F, -2.225F, -11.1814F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -3.0973F, -0.3051F, 3.0958F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 63, -3.0F, -2.0F, -3.0F, 3, 2, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.4386F, -2.225F, -12.0835F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -3.1028F, 0.2181F, 3.1192F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 60, -3.0F, -2.125F, -4.0F, 3, 2, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.0F, -5.6F, -6.3F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3054F, 0.0F, 0.3927F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 46, 43, 0.0F, 0.0F, -5.0F, 5, 0, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.0F, -5.6F, 0.7F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3054F, 0.0F, 0.3927F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 51, 55, 0.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.0F, -5.6F, -3.3F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.3927F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 20, 0.0F, 0.0F, -3.0F, 5, 0, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.4386F, -2.225F, -12.0835F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -3.1028F, -0.2181F, -3.1192F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 60, 0.0F, -2.125F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(5.2997F, -2.225F, -11.1814F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -3.0973F, 0.3051F, -3.0958F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 63, 0.0F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(7.9862F, -2.0F, -6.9645F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -3.0732F, 1.0021F, -3.0605F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 23, 46, 0.0F, -2.0F, -5.0F, 5, 2, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(8.5092F, -2.0F, -0.9873F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 1.6581F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 36, 0.0F, -2.0F, -4.0F, 6, 2, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(8.5092F, -2.0F, -0.9873F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0972F, 1.1769F, 0.0911F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 28, -5.0F, -2.0F, -5.0F, 5, 2, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(6.5958F, -2.0F, 3.6321F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0654F, 0.6102F, 0.0532F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 48, 15, -5.0F, -2.175F, -4.0F, 5, 2, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.6F, -7.75F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0698F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 48, 8, -2.5F, -1.975F, -4.0F, 5, 2, 4, 0.001F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.6F, 3.0F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0698F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 48, -2.5F, -1.975F, 0.0F, 5, 2, 4, 0.001F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.4F, -10.1F);
        this.main.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 48, 22, -2.5F, -1.5F, -3.0F, 5, 2, 3, 0.012F, false));
        this.neck.cubeList.add(new ModelBox(neck, 34, 55, -2.5F, 0.0F, -3.0F, 5, 1, 3, 0.002F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.05F, -3.0F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 61, 49, -2.0F, -1.45F, -3.0F, 4, 2, 3, 0.011F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 15, 62, -2.0F, 0.05F, -3.0F, 4, 1, 3, 0.001F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck2.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 64, 60, -2.0F, 0.05F, -3.0F, 4, 1, 2, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 62, 0, -2.0F, -1.45F, -4.0F, 4, 2, 3, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.2768F, 0.4209F, -6.3593F);
        this.neck3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0092F, -0.3448F, -0.0684F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 65, 22, -0.6F, -1.225F, -0.1F, 2, 1, 3, -0.002F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.3F, -0.95F, -3.4F);
        this.neck3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1299F, -0.3464F, -0.0443F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 67, 6, 0.2F, -0.25F, -3.7F, 1, 1, 3, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.3F, -0.95F, -3.4F);
        this.neck3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1299F, 0.3464F, 0.0443F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 67, 6, -1.2F, -0.25F, -3.7F, 1, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.2768F, 0.4209F, -6.3593F);
        this.neck3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0092F, 0.3448F, 0.0684F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 65, 22, -1.4F, -1.225F, -0.1F, 2, 1, 3, -0.002F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0F, 0.4233F, -7.7255F);
        this.neck3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0175F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 64, 64, -2.0F, -1.175F, 1.0F, 2, 1, 3, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, 0.4233F, -7.7255F);
        this.neck3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.192F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 49, 66, -2.0F, -1.0F, 1.0F, 2, 1, 3, 0.011F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.7F, -0.25F, -5.7F);
        this.neck3.addChild(eye);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.7F, -0.7F, 2.5F);
        this.eye.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1392F, 0.346F, 0.0475F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 13, 67, -1.175F, -0.275F, -3.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.7F, -0.25F, -5.7F);
        this.neck3.addChild(eye2);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.7F, -0.7F, 2.5F);
        this.eye2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1392F, -0.346F, -0.0475F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 13, 67, 0.175F, -0.275F, -3.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.3F, -3.0F);
        this.neck3.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 65, 32, -2.0F, -0.25F, -1.0F, 4, 1, 1, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 65, 27, -1.0F, -0.25F, -3.7F, 2, 1, 3, -0.002F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-3.0F, -1.25F, -0.9F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.3491F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 67, 11, 1.2366F, 1.0F, -3.4098F, 1, 1, 3, -0.003F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(3.0F, -1.25F, -0.9F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.3491F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 67, 11, -2.2366F, 1.0F, -3.4098F, 1, 1, 3, -0.003F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.802F, -2.2924F, -6.4153F);
        this.main.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2618F, -0.8727F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 27, 10, -1.2956F, -1.008F, -7.0611F, 3, 2, 7, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.1722F, -0.522F, -6.6741F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.1353F, 0.3918F, -0.03F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 49, 60, -1.4869F, -0.008F, -3.9901F, 3, 1, 4, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.802F, -2.2924F, -6.4153F);
        this.main.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.2618F, 0.8727F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 27, 10, -1.7044F, -1.008F, -7.0611F, 3, 2, 7, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.1722F, -0.522F, -6.6741F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.1353F, -0.3918F, 0.03F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 49, 60, -1.5131F, -0.008F, -3.9901F, 3, 1, 4, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.7888F, -2.3959F, 0.9523F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1866F, 0.723F, 0.0439F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 23, 28, -1.5456F, -1.008F, 0.0611F, 3, 2, 7, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.0587F, -0.4958F, 6.0381F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0526F, 0.9845F, 0.0505F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 44, 49, -1.9869F, -0.008F, 0.1742F, 4, 1, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.7888F, -2.3959F, 0.9523F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2182F, -0.723F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 23, 28, -1.4544F, -1.008F, 0.0611F, 3, 2, 7, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0587F, -0.4958F, 6.0381F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0436F, -0.9845F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 44, 49, -2.0131F, -0.008F, 0.1742F, 4, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.3159F, 5.2245F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 20, -1.0F, -1.0F, -0.25F, 2, 2, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0309F, 8.7528F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 54, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 55, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        

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
        this.main.offsetY = -1.8F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.105F;
        this.main.render(0.01F);
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

        EntityPrehistoricFloraOrdosemys entityOrdosemys = (EntityPrehistoricFloraOrdosemys) e;

        if (entityOrdosemys.getAnimation() == entityOrdosemys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3};

        if (entityOrdosemys.getAnimation() == entityOrdosemys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityOrdosemys.isReallyInWater()) {

                if (f3 == 0.0F || !entityOrdosemys.getIsMoving()) {
                    if (entityOrdosemys.getAnimation() != entityOrdosemys.EAT_ANIMATION
                        && entityOrdosemys.getAnimation() != entityOrdosemys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityOrdosemys.getIsFast()) { //Running


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
        this.eye.setScale(1,1,1);

        EntityPrehistoricFloraOrdosemys ee = (EntityPrehistoricFloraOrdosemys) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                //Swimming pose:
                animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The hiding and unhiding anim
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrdosemys entity = (EntityPrehistoricFloraOrdosemys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (17.57701-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (18.94842-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-34.57655-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.57701 + (((tickAnim - 20) / 10) * (0-(17.57701)));
            yy = 18.94842 + (((tickAnim - 20) / 10) * (0-(18.94842)));
            zz = -34.57655 + (((tickAnim - 20) / 10) * (0-(-34.57655)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (17.57701-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (18.94842-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-34.57655-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 17.57701 + (((tickAnim - 40) / 10) * (0-(17.57701)));
            yy = 18.94842 + (((tickAnim - 40) / 10) * (0-(18.94842)));
            zz = -34.57655 + (((tickAnim - 40) / 10) * (0-(-34.57655)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-31.16077-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (59.9694-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-28.03418-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -31.16077 + (((tickAnim - 20) / 10) * (0-(-31.16077)));
            yy = 59.9694 + (((tickAnim - 20) / 10) * (0-(59.9694)));
            zz = -28.03418 + (((tickAnim - 20) / 10) * (0-(-28.03418)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-31.16077-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (59.9694-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-28.03418-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -31.16077 + (((tickAnim - 40) / 10) * (0-(-31.16077)));
            yy = 59.9694 + (((tickAnim - 40) / 10) * (0-(59.9694)));
            zz = -28.03418 + (((tickAnim - 40) / 10) * (0-(-28.03418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (1.075-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.55-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.075 + (((tickAnim - 20) / 10) * (0-(1.075)));
            yy = 0.55 + (((tickAnim - 20) / 10) * (0-(0.55)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (1.075-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0.55-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.075 + (((tickAnim - 40) / 10) * (0-(1.075)));
            yy = 0.55 + (((tickAnim - 40) / 10) * (0-(0.55)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.57701-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-18.94842-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (34.57655-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.57701 + (((tickAnim - 10) / 10) * (0-(17.57701)));
            yy = -18.94842 + (((tickAnim - 10) / 10) * (0-(-18.94842)));
            zz = 34.57655 + (((tickAnim - 10) / 10) * (0-(34.57655)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (17.57701-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-18.94842-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (34.57655-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 17.57701 + (((tickAnim - 30) / 10) * (0-(17.57701)));
            yy = -18.94842 + (((tickAnim - 30) / 10) * (0-(-18.94842)));
            zz = 34.57655 + (((tickAnim - 30) / 10) * (0-(34.57655)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-31.16077-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-59.9694-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (28.03418-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -31.16077 + (((tickAnim - 10) / 10) * (0-(-31.16077)));
            yy = -59.9694 + (((tickAnim - 10) / 10) * (0-(-59.9694)));
            zz = 28.03418 + (((tickAnim - 10) / 10) * (0-(28.03418)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-31.16077-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-59.9694-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (28.03418-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -31.16077 + (((tickAnim - 30) / 10) * (0-(-31.16077)));
            yy = -59.9694 + (((tickAnim - 30) / 10) * (0-(-59.9694)));
            zz = 28.03418 + (((tickAnim - 30) / 10) * (0-(28.03418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.075-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.075 + (((tickAnim - 10) / 10) * (0-(1.075)));
            yy = 0.55 + (((tickAnim - 10) / 10) * (0-(0.55)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (1.075-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.55-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1.075 + (((tickAnim - 30) / 10) * (0-(1.075)));
            yy = 0.55 + (((tickAnim - 30) / 10) * (0-(0.55)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);
        

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrdosemys entity = (EntityPrehistoricFloraOrdosemys) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.25 + (((tickAnim - 3) / 2) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -2.25 + (((tickAnim - 9) / 3) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.25 + (((tickAnim - 3) / 2) * (0-(2.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -5.75 + (((tickAnim - 9) / 3) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 3) / 2) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (3.5-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 3.5 + (((tickAnim - 9) / 3) * (0-(3.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 38.5 + (((tickAnim - 3) / 2) * (0-(38.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (38.5-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 38.5 + (((tickAnim - 9) / 3) * (0-(38.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrdosemys entity = (EntityPrehistoricFloraOrdosemys) entitylivingbaseIn;
        int animCycle = 310;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 5) / 5) * (2-(5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = 2 + (((tickAnim - 10) / 290) * (2-(2)));
            yy = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 290) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 2 + (((tickAnim - 300) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            yy = -0.8 + (((tickAnim - 10) / 290) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 10) / 290) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            yy = -0.8 + (((tickAnim - 300) / 10) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 300) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.5 + (((tickAnim - 5) / 5) * (-2.75-(-4.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = -2.75 + (((tickAnim - 10) / 290) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 290) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = -2.75 + (((tickAnim - 300) / 10) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.775-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 290) * (-0.275-(-0.275)));
            zz = 7.775 + (((tickAnim - 10) / 290) * (7.775-(7.775)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 300) / 10) * (0-(-0.275)));
            zz = 7.775 + (((tickAnim - 300) / 10) * (0-(7.775)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-8.37-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8.37 + (((tickAnim - 5) / 5) * (-7.25-(-8.37)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.9-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.425-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = 2.9 + (((tickAnim - 10) / 290) * (2.9-(2.9)));
            yy = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            zz = 3.425 + (((tickAnim - 10) / 290) * (3.425-(3.425)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 2.9 + (((tickAnim - 300) / 10) * (0-(2.9)));
            yy = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            zz = 3.425 + (((tickAnim - 300) / 10) * (0-(3.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.65-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = 3.65 + (((tickAnim - 10) / 290) * (3.65-(3.65)));
            yy = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            zz = -2.45 + (((tickAnim - 10) / 290) * (-2.45-(-2.45)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 3.65 + (((tickAnim - 300) / 10) * (0-(3.65)));
            yy = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            zz = -2.45 + (((tickAnim - 300) / 10) * (0-(-2.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-43.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            yy = -43.25 + (((tickAnim - 10) / 290) * (-43.25-(-43.25)));
            zz = 0 + (((tickAnim - 10) / 290) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            yy = -43.25 + (((tickAnim - 300) / 10) * (0-(-43.25)));
            zz = 0 + (((tickAnim - 300) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.7-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = 4 + (((tickAnim - 10) / 290) * (4-(4)));
            yy = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            zz = -4.7 + (((tickAnim - 10) / 290) * (-4.7-(-4.7)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 4 + (((tickAnim - 300) / 10) * (0-(4)));
            yy = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            zz = -4.7 + (((tickAnim - 300) / 10) * (0-(-4.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.70675-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-14.17028-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (4.66387-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.70675 + (((tickAnim - 5) / 5) * (-4.08852-(-4.70675)));
            yy = -14.17028 + (((tickAnim - 5) / 5) * (-68.77131-(-14.17028)));
            zz = 4.66387 + (((tickAnim - 5) / 5) * (-4.24049-(4.66387)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = -4.08852 + (((tickAnim - 10) / 290) * (-4.08852-(-4.08852)));
            yy = -68.77131 + (((tickAnim - 10) / 290) * (-68.77131-(-68.77131)));
            zz = -4.24049 + (((tickAnim - 10) / 290) * (-4.24049-(-4.24049)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = -4.08852 + (((tickAnim - 300) / 10) * (0-(-4.08852)));
            yy = -68.77131 + (((tickAnim - 300) / 10) * (0-(-68.77131)));
            zz = -4.24049 + (((tickAnim - 300) / 10) * (0-(-4.24049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.37-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8.37 + (((tickAnim - 5) / 5) * (-7.25-(-8.37)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.9-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.425-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = -2.9 + (((tickAnim - 10) / 290) * (-2.9-(-2.9)));
            yy = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            zz = 3.425 + (((tickAnim - 10) / 290) * (3.425-(3.425)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = -2.9 + (((tickAnim - 300) / 10) * (0-(-2.9)));
            yy = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            zz = 3.425 + (((tickAnim - 300) / 10) * (0-(3.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.65-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = -3.65 + (((tickAnim - 10) / 290) * (-3.65-(-3.65)));
            yy = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            zz = -2.45 + (((tickAnim - 10) / 290) * (-2.45-(-2.45)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = -3.65 + (((tickAnim - 300) / 10) * (0-(-3.65)));
            yy = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            zz = -2.45 + (((tickAnim - 300) / 10) * (0-(-2.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (30.75-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 30.75 + (((tickAnim - 5) / 5) * (-63.5-(30.75)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 10) / 290) * (0-(0)));
            yy = -63.5 + (((tickAnim - 10) / 290) * (-63.5-(-63.5)));
            zz = 0 + (((tickAnim - 10) / 290) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            yy = -63.5 + (((tickAnim - 300) / 10) * (0-(-63.5)));
            zz = 0 + (((tickAnim - 300) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOrdosemys entity = (EntityPrehistoricFloraOrdosemys) entitylivingbaseIn;
        int animCycle = 480;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 55 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 55) / 35) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 55) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 35) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -1.25 + (((tickAnim - 90) / 30) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 460) {
            xx = -1.25 + (((tickAnim - 120) / 340) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 120) / 340) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 340) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = -1.25 + (((tickAnim - 460) / 20) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 55 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 55) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 35) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 55) / 35) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = -0.65 + (((tickAnim - 90) / 30) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 120) / 340) * (0-(0)));
            yy = -0.65 + (((tickAnim - 120) / 340) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 120) / 340) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            yy = -0.65 + (((tickAnim - 460) / 20) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 460) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 53) {
            xx = -0.25 + (((tickAnim - 24) / 29) * (-0.25-(-0.25)));
            yy = -0.75 + (((tickAnim - 24) / 29) * (-0.75-(-0.75)));
            zz = 0 + (((tickAnim - 24) / 29) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -0.25 + (((tickAnim - 53) / 2) * (-15.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15-(-0.25)));
            yy = -0.75 + (((tickAnim - 53) / 2) * (-0.75-(-0.75)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 90) {
            xx = -15.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 55) / 35) * (-10.5-(-15.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            yy = -0.75 + (((tickAnim - 55) / 35) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 55) / 35) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -10.5 + (((tickAnim - 90) / 30) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 270) {
            xx = -10.5 + (((tickAnim - 120) / 150) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 120) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 150) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 320) {
            xx = -10.5 + (((tickAnim - 270) / 50) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 270) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 50) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 460) {
            xx = -10.5 + (((tickAnim - 320) / 140) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 320) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 140) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = -10.5 + (((tickAnim - 460) / 20) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 24) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 29) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 53) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 37) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 53) / 37) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = -0.375 + (((tickAnim - 90) / 30) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 120) / 150) * (0-(0)));
            yy = -0.375 + (((tickAnim - 120) / 150) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 120) / 150) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 270) / 190) * (0-(0)));
            yy = -0.375 + (((tickAnim - 270) / 190) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 270) / 190) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            yy = -0.375 + (((tickAnim - 460) / 20) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 460) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-0.50004-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-0.74997-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0.00655-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 55) {
            xx = -0.50004 + (((tickAnim - 24) / 31) * (-0.50004-(-0.50004)));
            yy = -0.74997 + (((tickAnim - 24) / 31) * (-0.74997-(-0.74997)));
            zz = 0.00655 + (((tickAnim - 24) / 31) * (0.00655-(0.00655)));
        }
        else if (tickAnim >= 55 && tickAnim < 90) {
            xx = -0.50004 + (((tickAnim - 55) / 35) * (-6.75-(-0.50004)));
            yy = -0.74997 + (((tickAnim - 55) / 35) * (0-(-0.74997)));
            zz = 0.00655 + (((tickAnim - 55) / 35) * (0-(0.00655)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -6.75 + (((tickAnim - 90) / 30) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 268) {
            xx = -6.75 + (((tickAnim - 120) / 148) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 120) / 148) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 148) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 270) {
            xx = -6.75 + (((tickAnim - 268) / 2) * (-2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5-(-6.75)));
            yy = 0 + (((tickAnim - 268) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 2) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 320) {
            xx = -2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5 + (((tickAnim - 270) / 50) * (0-(-2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5)));
            yy = 0 + (((tickAnim - 270) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 50) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 320) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 140) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 24) / 31) * (0-(0)));
            yy = -0.75 + (((tickAnim - 24) / 31) * (-0.75-(-0.75)));
            zz = 0 + (((tickAnim - 24) / 31) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 55) / 35) * (4-(0)));
            yy = -0.75 + (((tickAnim - 55) / 35) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 55) / 35) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 4 + (((tickAnim - 90) / 30) * (4-(4)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 270) {
            xx = 4 + (((tickAnim - 120) / 150) * (4-(4)));
            yy = 0 + (((tickAnim - 120) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 150) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 460) {
            xx = 4 + (((tickAnim - 270) / 190) * (4-(4)));
            yy = 0 + (((tickAnim - 270) / 190) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 190) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = 4 + (((tickAnim - 460) / 20) * (0-(4)));
            yy = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 24) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 66) * (0.125-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0.125 + (((tickAnim - 90) / 30) * (0.125-(0.125)));
        }
        else if (tickAnim >= 120 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 120) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 150) * (0-(0)));
            zz = 0.125 + (((tickAnim - 120) / 150) * (0.125-(0.125)));
        }
        else if (tickAnim >= 270 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 270) / 190) * (0-(0)));
            yy = 0 + (((tickAnim - 270) / 190) * (0-(0)));
            zz = 0.125 + (((tickAnim - 270) / 190) * (0.125-(0.125)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            zz = 0.125 + (((tickAnim - 460) / 20) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 55 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 55) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 35) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 120) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 35) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 155) / 115) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 115) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 115) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 388) {
            xx = 0 + (((tickAnim - 270) / 118) * (0-(0)));
            yy = 0 + (((tickAnim - 270) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 118) * (0-(0)));
        }
        else if (tickAnim >= 388 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 388) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 388) / 22) * (0.35-(0)));
            zz = 0 + (((tickAnim - 388) / 22) * (0-(0)));
        }
        else if (tickAnim >= 410 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 410) / 25) * (0-(0)));
            yy = 0.35 + (((tickAnim - 410) / 25) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 410) / 25) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 465) {
            xx = 0 + (((tickAnim - 435) / 30) * (0-(0)));
            yy = 0.35 + (((tickAnim - 435) / 30) * (0-(0.35)));
            zz = 0 + (((tickAnim - 435) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eye2.rotationPointX = this.eye2.rotationPointX + (float)(xx);
        this.eye2.rotationPointY = this.eye2.rotationPointY - (float)(yy);
        this.eye2.rotationPointZ = this.eye2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (0-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 1 + (((tickAnim - 8) / 3) * (1-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 11) / 13) * (1-(1)));
            yy = 0 + (((tickAnim - 11) / 13) * (1-(0)));
            zz = 1 + (((tickAnim - 11) / 13) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 24) / 31) * (1-(1)));
            yy = 1 + (((tickAnim - 24) / 31) * (1-(1)));
            zz = 1 + (((tickAnim - 24) / 31) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 55) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 55) / 35) * (0-(1)));
            zz = 1 + (((tickAnim - 55) / 35) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 90) / 30) * (1-(1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 1 + (((tickAnim - 90) / 30) * (1-(1)));
        }
        else if (tickAnim >= 120 && tickAnim < 155) {
            xx = 1 + (((tickAnim - 120) / 35) * (1-(1)));
            yy = 0 + (((tickAnim - 120) / 35) * (1-(0)));
            zz = 1 + (((tickAnim - 120) / 35) * (1-(1)));
        }
        else if (tickAnim >= 155 && tickAnim < 270) {
            xx = 1 + (((tickAnim - 155) / 115) * (1-(1)));
            yy = 1 + (((tickAnim - 155) / 115) * (1-(1)));
            zz = 1 + (((tickAnim - 155) / 115) * (1-(1)));
        }
        else if (tickAnim >= 270 && tickAnim < 388) {
            xx = 1 + (((tickAnim - 270) / 118) * (1-(1)));
            yy = 1 + (((tickAnim - 270) / 118) * (1-(1)));
            zz = 1 + (((tickAnim - 270) / 118) * (1-(1)));
        }
        else if (tickAnim >= 388 && tickAnim < 410) {
            xx = 1 + (((tickAnim - 388) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 388) / 22) * (0-(1)));
            zz = 1 + (((tickAnim - 388) / 22) * (1-(1)));
        }
        else if (tickAnim >= 410 && tickAnim < 435) {
            xx = 1 + (((tickAnim - 410) / 25) * (1-(1)));
            yy = 0 + (((tickAnim - 410) / 25) * (0-(0)));
            zz = 1 + (((tickAnim - 410) / 25) * (1-(1)));
        }
        else if (tickAnim >= 435 && tickAnim < 465) {
            xx = 1 + (((tickAnim - 435) / 30) * (1-(1)));
            yy = 0 + (((tickAnim - 435) / 30) * (1-(0)));
            zz = 1 + (((tickAnim - 435) / 30) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 55 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 55) / 35) * (3.5-(0)));
            yy = 0 + (((tickAnim - 55) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 35) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 3.5 + (((tickAnim - 90) / 30) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 460) {
            xx = 3.5 + (((tickAnim - 120) / 340) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 120) / 340) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 340) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = 3.5 + (((tickAnim - 460) / 20) * (0-(3.5)));
            yy = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 55 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 63) / 27) * (1.39897-(0)));
            yy = 0 + (((tickAnim - 63) / 27) * (7.6002-(0)));
            zz = 0 + (((tickAnim - 63) / 27) * (-1.52088-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 1.39897 + (((tickAnim - 90) / 30) * (1.39897-(1.39897)));
            yy = 7.6002 + (((tickAnim - 90) / 30) * (7.6002-(7.6002)));
            zz = -1.52088 + (((tickAnim - 90) / 30) * (-1.52088-(-1.52088)));
        }
        else if (tickAnim >= 120 && tickAnim < 460) {
            xx = 1.39897 + (((tickAnim - 120) / 340) * (3.64897-(1.39897)));
            yy = 7.6002 + (((tickAnim - 120) / 340) * (7.6002-(7.6002)));
            zz = -1.52088 + (((tickAnim - 120) / 340) * (-1.52088-(-1.52088)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = 3.64897 + (((tickAnim - 460) / 20) * (0-(3.64897)));
            yy = 7.6002 + (((tickAnim - 460) / 20) * (0-(7.6002)));
            zz = -1.52088 + (((tickAnim - 460) / 20) * (0-(-1.52088)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 55 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 63) / 27) * (4.076-(0)));
            yy = 0 + (((tickAnim - 63) / 27) * (27.79897-(0)));
            zz = 0 + (((tickAnim - 63) / 27) * (12.06701-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 4.076 + (((tickAnim - 90) / 30) * (4.076-(4.076)));
            yy = 27.79897 + (((tickAnim - 90) / 30) * (27.79897-(27.79897)));
            zz = 12.06701 + (((tickAnim - 90) / 30) * (12.06701-(12.06701)));
        }
        else if (tickAnim >= 120 && tickAnim < 460) {
            xx = 4.076 + (((tickAnim - 120) / 340) * (4.076-(4.076)));
            yy = 27.79897 + (((tickAnim - 120) / 340) * (27.79897-(27.79897)));
            zz = 12.06701 + (((tickAnim - 120) / 340) * (12.06701-(12.06701)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = 4.076 + (((tickAnim - 460) / 20) * (0-(4.076)));
            yy = 27.79897 + (((tickAnim - 460) / 20) * (0-(27.79897)));
            zz = 12.06701 + (((tickAnim - 460) / 20) * (0-(12.06701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 55) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 35) * (0.35-(0)));
            zz = 0 + (((tickAnim - 55) / 35) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0.35 + (((tickAnim - 90) / 30) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 120) / 35) * (0-(0)));
            yy = 0.35 + (((tickAnim - 120) / 35) * (0-(0.35)));
            zz = 0 + (((tickAnim - 120) / 35) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 155) / 115) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 115) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 115) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 388) {
            xx = 0 + (((tickAnim - 270) / 118) * (0-(0)));
            yy = 0 + (((tickAnim - 270) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 118) * (0-(0)));
        }
        else if (tickAnim >= 388 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 388) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 388) / 22) * (0.35-(0)));
            zz = 0 + (((tickAnim - 388) / 22) * (0-(0)));
        }
        else if (tickAnim >= 410 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 410) / 25) * (0-(0)));
            yy = 0.35 + (((tickAnim - 410) / 25) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 410) / 25) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 465) {
            xx = 0 + (((tickAnim - 435) / 30) * (0-(0)));
            yy = 0.35 + (((tickAnim - 435) / 30) * (0-(0.35)));
            zz = 0 + (((tickAnim - 435) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eye.rotationPointX = this.eye.rotationPointX + (float)(xx);
        this.eye.rotationPointY = this.eye.rotationPointY - (float)(yy);
        this.eye.rotationPointZ = this.eye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (0-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 1 + (((tickAnim - 8) / 3) * (1-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 11) / 13) * (1-(1)));
            yy = 0 + (((tickAnim - 11) / 13) * (1-(0)));
            zz = 1 + (((tickAnim - 11) / 13) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 24) / 31) * (1-(1)));
            yy = 1 + (((tickAnim - 24) / 31) * (1-(1)));
            zz = 1 + (((tickAnim - 24) / 31) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 55) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 55) / 35) * (0-(1)));
            zz = 1 + (((tickAnim - 55) / 35) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 90) / 30) * (1-(1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 1 + (((tickAnim - 90) / 30) * (1-(1)));
        }
        else if (tickAnim >= 120 && tickAnim < 155) {
            xx = 1 + (((tickAnim - 120) / 35) * (1-(1)));
            yy = 0 + (((tickAnim - 120) / 35) * (1-(0)));
            zz = 1 + (((tickAnim - 120) / 35) * (1-(1)));
        }
        else if (tickAnim >= 155 && tickAnim < 270) {
            xx = 1 + (((tickAnim - 155) / 115) * (1-(1)));
            yy = 1 + (((tickAnim - 155) / 115) * (1-(1)));
            zz = 1 + (((tickAnim - 155) / 115) * (1-(1)));
        }
        else if (tickAnim >= 270 && tickAnim < 388) {
            xx = 1 + (((tickAnim - 270) / 118) * (1-(1)));
            yy = 1 + (((tickAnim - 270) / 118) * (1-(1)));
            zz = 1 + (((tickAnim - 270) / 118) * (1-(1)));
        }
        else if (tickAnim >= 388 && tickAnim < 410) {
            xx = 1 + (((tickAnim - 388) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 388) / 22) * (0-(1)));
            zz = 1 + (((tickAnim - 388) / 22) * (1-(1)));
        }
        else if (tickAnim >= 410 && tickAnim < 435) {
            xx = 1 + (((tickAnim - 410) / 25) * (1-(1)));
            yy = 0 + (((tickAnim - 410) / 25) * (0-(0)));
            zz = 1 + (((tickAnim - 410) / 25) * (1-(1)));
        }
        else if (tickAnim >= 435 && tickAnim < 465) {
            xx = 1 + (((tickAnim - 435) / 30) * (1-(1)));
            yy = 0 + (((tickAnim - 435) / 30) * (1-(0)));
            zz = 1 + (((tickAnim - 435) / 30) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 55 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 55) / 35) * (3.5-(0)));
            yy = 0 + (((tickAnim - 55) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 35) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 3.5 + (((tickAnim - 90) / 30) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 460) {
            xx = 3.5 + (((tickAnim - 120) / 340) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 120) / 340) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 340) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = 3.5 + (((tickAnim - 460) / 20) * (0-(3.5)));
            yy = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 63 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 63) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 27) * (15-(0)));
            zz = 0 + (((tickAnim - 63) / 27) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 15 + (((tickAnim - 90) / 30) * (15-(15)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 120) / 340) * (0-(0)));
            yy = 15 + (((tickAnim - 120) / 340) * (15-(15)));
            zz = 0 + (((tickAnim - 120) / 340) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 460) / 20) * (0-(0)));
            yy = 15 + (((tickAnim - 460) / 20) * (0-(15)));
            zz = 0 + (((tickAnim - 460) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOrdosemys entity = (EntityPrehistoricFloraOrdosemys) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*7), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*7));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-7), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*-7));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(61.7101+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*35), rightArm.rotateAngleY + (float) Math.toRadians(-63.16402), rightArm.rotateAngleZ + (float) Math.toRadians(80.08422));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*55), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(62.6521+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*25), rightLeg.rotateAngleY + (float) Math.toRadians(38.81945), rightLeg.rotateAngleZ + (float) Math.toRadians(-99.70088));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-15.6957+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*40), rightLeg2.rotateAngleY + (float) Math.toRadians(45.04724), rightLeg2.rotateAngleZ + (float) Math.toRadians(25.72642));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*10), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*10));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*20), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*20));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(61.7101+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-35), leftArm.rotateAngleY + (float) Math.toRadians(63.16402), leftArm.rotateAngleZ + (float) Math.toRadians(-80.08422));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-55), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(62.6521+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-25), leftLeg.rotateAngleY + (float) Math.toRadians(-38.81945), leftLeg.rotateAngleZ + (float) Math.toRadians(99.70088));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-15.6957+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*-40), leftLeg2.rotateAngleY + (float) Math.toRadians(-45.04724), leftLeg2.rotateAngleZ + (float) Math.toRadians(-25.72642));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*30), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-160))*30));
       

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOrdosemys entity = (EntityPrehistoricFloraOrdosemys) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*-1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*-0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*-0.4);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*3), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-5));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-180))*0.07);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 153.39749 + (((tickAnim - 0) / 5) * (-20.90211-(153.39749)));
            yy = 21.93295 + (((tickAnim - 0) / 5) * (12.26084-(21.93295)));
            zz = 148.89211 + (((tickAnim - 0) / 5) * (2.24043-(148.89211)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -20.90211 + (((tickAnim - 5) / 7) * (4.04596-(-20.90211)));
            yy = 12.26084 + (((tickAnim - 5) / 7) * (-11.89543-(12.26084)));
            zz = 2.24043 + (((tickAnim - 5) / 7) * (2.67963-(2.24043)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 4.04596 + (((tickAnim - 12) / 18) * (153.39749-(4.04596)));
            yy = -11.89543 + (((tickAnim - 12) / 18) * (21.93295-(-11.89543)));
            zz = 2.67963 + (((tickAnim - 12) / 18) * (148.89211-(2.67963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -29.02921 + (((tickAnim - 0) / 5) * (82.77217-(-29.02921)));
            yy = -48.60388 + (((tickAnim - 0) / 5) * (-47.20942-(-48.60388)));
            zz = 39.62056 + (((tickAnim - 0) / 5) * (23.1692-(39.62056)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 82.77217 + (((tickAnim - 5) / 3) * (15.1651-(82.77217)));
            yy = -47.20942 + (((tickAnim - 5) / 3) * (-38.52183-(-47.20942)));
            zz = 23.1692 + (((tickAnim - 5) / 3) * (20.49301-(23.1692)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15.1651 + (((tickAnim - 8) / 2) * (3.05802-(15.1651)));
            yy = -38.52183 + (((tickAnim - 8) / 2) * (-29.83424-(-38.52183)));
            zz = 20.49301 + (((tickAnim - 8) / 2) * (17.81682-(20.49301)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 3.05802 + (((tickAnim - 10) / 3) * (-23.65614-(3.05802)));
            yy = -29.83424 + (((tickAnim - 10) / 3) * (-12.45906-(-29.83424)));
            zz = 17.81682 + (((tickAnim - 10) / 3) * (12.46444-(17.81682)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -23.65614 + (((tickAnim - 13) / 3) * (-46.88208-(-23.65614)));
            yy = -12.45906 + (((tickAnim - 13) / 3) * (-28.98697-(-12.45906)));
            zz = 12.46444 + (((tickAnim - 13) / 3) * (20.37558-(12.46444)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -46.88208 + (((tickAnim - 16) / 4) * (-54.03951-(-46.88208)));
            yy = -28.98697 + (((tickAnim - 16) / 4) * (-49.64686-(-28.98697)));
            zz = 20.37558 + (((tickAnim - 16) / 4) * (30.2645-(20.37558)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -54.03951 + (((tickAnim - 20) / 10) * (-29.02921-(-54.03951)));
            yy = -49.64686 + (((tickAnim - 20) / 10) * (-48.60388-(-49.64686)));
            zz = 30.2645 + (((tickAnim - 20) / 10) * (39.62056-(30.2645)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.05 + (((tickAnim - 0) / 5) * (0.65-(-1.05)));
            yy = 0.35 + (((tickAnim - 0) / 5) * (0.2-(0.35)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.65 + (((tickAnim - 5) / 3) * (0.29-(0.65)));
            yy = 0.2 + (((tickAnim - 5) / 3) * (0.39-(0.2)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.29 + (((tickAnim - 8) / 2) * (0.13-(0.29)));
            yy = 0.39 + (((tickAnim - 8) / 2) * (0.26-(0.39)));
            zz = 0.1 + (((tickAnim - 8) / 2) * (0.19-(0.1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.13 + (((tickAnim - 10) / 3) * (-0.375-(0.13)));
            yy = 0.26 + (((tickAnim - 10) / 3) * (-0.1-(0.26)));
            zz = 0.19 + (((tickAnim - 10) / 3) * (0.375-(0.19)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.375 + (((tickAnim - 13) / 3) * (-0.71-(-0.375)));
            yy = -0.1 + (((tickAnim - 13) / 3) * (0.295-(-0.1)));
            zz = 0.375 + (((tickAnim - 13) / 3) * (0.475-(0.375)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.71 + (((tickAnim - 16) / 4) * (-0.69-(-0.71)));
            yy = 0.295 + (((tickAnim - 16) / 4) * (0.075-(0.295)));
            zz = 0.475 + (((tickAnim - 16) / 4) * (0.2-(0.475)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -0.69 + (((tickAnim - 20) / 3) * (-0.87-(-0.69)));
            yy = 0.075 + (((tickAnim - 20) / 3) * (-0.11-(0.075)));
            zz = 0.2 + (((tickAnim - 20) / 3) * (0.1-(0.2)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.87 + (((tickAnim - 23) / 7) * (-1.05-(-0.87)));
            yy = -0.11 + (((tickAnim - 23) / 7) * (0.35-(-0.11)));
            zz = 0.1 + (((tickAnim - 23) / 7) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -76.70827 + (((tickAnim - 0) / 8) * (-14.59479-(-76.70827)));
            yy = -31.81098 + (((tickAnim - 0) / 8) * (-10.51631-(-31.81098)));
            zz = 68.64752 + (((tickAnim - 0) / 8) * (17.16983-(68.64752)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -14.59479 + (((tickAnim - 8) / 10) * (28.00503-(-14.59479)));
            yy = -10.51631 + (((tickAnim - 8) / 10) * (12.90783-(-10.51631)));
            zz = 17.16983 + (((tickAnim - 8) / 10) * (-39.45563-(17.16983)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 28.00503 + (((tickAnim - 18) / 5) * (-6.85162-(28.00503)));
            yy = 12.90783 + (((tickAnim - 18) / 5) * (-9.45158-(12.90783)));
            zz = -39.45563 + (((tickAnim - 18) / 5) * (14.59594-(-39.45563)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -6.85162 + (((tickAnim - 23) / 7) * (-76.70827-(-6.85162)));
            yy = -9.45158 + (((tickAnim - 23) / 7) * (-31.81098-(-9.45158)));
            zz = 14.59594 + (((tickAnim - 23) / 7) * (68.64752-(14.59594)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 62.57745 + (((tickAnim - 0) / 8) * (21.98986-(62.57745)));
            yy = -9.34999 + (((tickAnim - 0) / 8) * (-0.40502-(-9.34999)));
            zz = -69.9924 + (((tickAnim - 0) / 8) * (-28.99142-(-69.9924)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 21.98986 + (((tickAnim - 8) / 5) * (19.74447-(21.98986)));
            yy = -0.40502 + (((tickAnim - 8) / 5) * (5.34726-(-0.40502)));
            zz = -28.99142 + (((tickAnim - 8) / 5) * (-15.8135-(-28.99142)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 19.74447 + (((tickAnim - 13) / 5) * (0-(19.74447)));
            yy = 5.34726 + (((tickAnim - 13) / 5) * (12.25-(5.34726)));
            zz = -15.8135 + (((tickAnim - 13) / 5) * (0-(-15.8135)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (4.47429-(0)));
            yy = 12.25 + (((tickAnim - 18) / 4) * (38.2513-(12.25)));
            zz = 0 + (((tickAnim - 18) / 4) * (-15.95071-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 4.47429 + (((tickAnim - 22) / 8) * (62.57745-(4.47429)));
            yy = 38.2513 + (((tickAnim - 22) / 8) * (-9.34999-(38.2513)));
            zz = -15.95071 + (((tickAnim - 22) / 8) * (-69.9924-(-15.95071)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.29-(0)));
            yy = -0.425 + (((tickAnim - 0) / 8) * (-0.175-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -0.29 + (((tickAnim - 8) / 10) * (0-(-0.29)));
            yy = -0.175 + (((tickAnim - 8) / 10) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (-0.4-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -0.4 + (((tickAnim - 22) / 8) * (0-(-0.4)));
            yy = 0 + (((tickAnim - 22) / 8) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-160))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*4));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1.15995 + (((tickAnim - 0) / 13) * (148.89749-(1.15995)));
            yy = -7.50673 + (((tickAnim - 0) / 13) * (-21.93295-(-7.50673)));
            zz = -2.07202 + (((tickAnim - 0) / 13) * (-148.89211-(-2.07202)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 148.89749 + (((tickAnim - 13) / 5) * (-15.69122-(148.89749)));
            yy = -21.93295 + (((tickAnim - 13) / 5) * (-18.58586-(-21.93295)));
            zz = -148.89211 + (((tickAnim - 13) / 5) * (-5.67462-(-148.89211)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -15.69122 + (((tickAnim - 18) / 6) * (5.29596-(-15.69122)));
            yy = -18.58586 + (((tickAnim - 18) / 6) * (11.89543-(-18.58586)));
            zz = -5.67462 + (((tickAnim - 18) / 6) * (-2.67963-(-5.67462)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 5.29596 + (((tickAnim - 24) / 6) * (1.15995-(5.29596)));
            yy = 11.89543 + (((tickAnim - 24) / 6) * (-7.50673-(11.89543)));
            zz = -2.67963 + (((tickAnim - 24) / 6) * (-2.07202-(-2.67963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -14.15614 + (((tickAnim - 0) / 5) * (-13.8917-(-14.15614)));
            yy = 12.45906 + (((tickAnim - 0) / 5) * (32.53885-(12.45906)));
            zz = -12.46444 + (((tickAnim - 0) / 5) * (0.17601-(-12.46444)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -13.8917 + (((tickAnim - 5) / 10) * (-29.02921-(-13.8917)));
            yy = 32.53885 + (((tickAnim - 5) / 10) * (48.60388-(32.53885)));
            zz = 0.17601 + (((tickAnim - 5) / 10) * (-39.62056-(0.17601)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -29.02921 + (((tickAnim - 15) / 3) * (84.27217-(-29.02921)));
            yy = 48.60388 + (((tickAnim - 15) / 3) * (47.20942-(48.60388)));
            zz = -39.62056 + (((tickAnim - 15) / 3) * (-23.1692-(-39.62056)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 84.27217 + (((tickAnim - 18) / 3) * (11.5442-(84.27217)));
            yy = 47.20942 + (((tickAnim - 18) / 3) * (36.78443-(47.20942)));
            zz = -23.1692 + (((tickAnim - 18) / 3) * (-19.95781-(-23.1692)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 11.5442 + (((tickAnim - 21) / 2) * (3.05802-(11.5442)));
            yy = 36.78443 + (((tickAnim - 21) / 2) * (29.83424-(36.78443)));
            zz = -19.95781 + (((tickAnim - 21) / 2) * (-17.81682-(-19.95781)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 3.05802 + (((tickAnim - 23) / 1) * (-14.15614-(3.05802)));
            yy = 29.83424 + (((tickAnim - 23) / 1) * (12.45906-(29.83424)));
            zz = -17.81682 + (((tickAnim - 23) / 1) * (-12.46444-(-17.81682)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -14.15614 + (((tickAnim - 24) / 6) * (-14.15614-(-14.15614)));
            yy = 12.45906 + (((tickAnim - 24) / 6) * (12.45906-(12.45906)));
            zz = -12.46444 + (((tickAnim - 24) / 6) * (-12.46444-(-12.46444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.375 + (((tickAnim - 0) / 3) * (0.49-(0.375)));
            yy = -0.1 + (((tickAnim - 0) / 3) * (0.125-(-0.1)));
            zz = 0.375 + (((tickAnim - 0) / 3) * (0.31-(0.375)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0.49 + (((tickAnim - 3) / 12) * (1.05-(0.49)));
            yy = 0.125 + (((tickAnim - 3) / 12) * (-0.675-(0.125)));
            zz = 0.31 + (((tickAnim - 3) / 12) * (0-(0.31)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1.05 + (((tickAnim - 15) / 3) * (-0.65-(1.05)));
            yy = -0.675 + (((tickAnim - 15) / 3) * (0.3-(-0.675)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -0.65 + (((tickAnim - 18) / 3) * (0.29-(-0.65)));
            yy = 0.3 + (((tickAnim - 18) / 3) * (0.39-(0.3)));
            zz = 0 + (((tickAnim - 18) / 3) * (0.1-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0.29 + (((tickAnim - 21) / 2) * (0.13-(0.29)));
            yy = 0.39 + (((tickAnim - 21) / 2) * (0.26-(0.39)));
            zz = 0.1 + (((tickAnim - 21) / 2) * (0.19-(0.1)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0.13 + (((tickAnim - 23) / 1) * (-0.375-(0.13)));
            yy = 0.26 + (((tickAnim - 23) / 1) * (-0.1-(0.26)));
            zz = 0.19 + (((tickAnim - 23) / 1) * (0.375-(0.19)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -0.375 + (((tickAnim - 24) / 6) * (0.375-(-0.375)));
            yy = -0.1 + (((tickAnim - 24) / 6) * (-0.1-(-0.1)));
            zz = 0.375 + (((tickAnim - 24) / 6) * (0.375-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 28.00503 + (((tickAnim - 0) / 7) * (-6.85162-(28.00503)));
            yy = -12.90783 + (((tickAnim - 0) / 7) * (9.45158-(-12.90783)));
            zz = 39.45563 + (((tickAnim - 0) / 7) * (-14.59594-(39.45563)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -6.85162 + (((tickAnim - 7) / 6) * (-76.70827-(-6.85162)));
            yy = 9.45158 + (((tickAnim - 7) / 6) * (31.81098-(9.45158)));
            zz = -14.59594 + (((tickAnim - 7) / 6) * (-68.64752-(-14.59594)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -76.70827 + (((tickAnim - 13) / 10) * (-4.86595-(-76.70827)));
            yy = 31.81098 + (((tickAnim - 13) / 10) * (7.21564-(31.81098)));
            zz = -68.64752 + (((tickAnim - 13) / 10) * (-9.19078-(-68.64752)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4.86595 + (((tickAnim - 23) / 7) * (28.00503-(-4.86595)));
            yy = 7.21564 + (((tickAnim - 23) / 7) * (-12.90783-(7.21564)));
            zz = -9.19078 + (((tickAnim - 23) / 7) * (39.45563-(-9.19078)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4.47429-(0)));
            yy = -12.25 + (((tickAnim - 0) / 4) * (-38.2513-(-12.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (15.95071-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 4.47429 + (((tickAnim - 4) / 9) * (62.57745-(4.47429)));
            yy = -38.2513 + (((tickAnim - 4) / 9) * (9.34999-(-38.2513)));
            zz = 15.95071 + (((tickAnim - 4) / 9) * (69.9924-(15.95071)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 62.57745 + (((tickAnim - 13) / 10) * (9.68147-(62.57745)));
            yy = 9.34999 + (((tickAnim - 13) / 10) * (1.83007-(9.34999)));
            zz = 69.9924 + (((tickAnim - 13) / 10) * (15.36474-(69.9924)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 9.68147 + (((tickAnim - 23) / 4) * (12.55287-(9.68147)));
            yy = 1.83007 + (((tickAnim - 23) / 4) * (-5.99219-(1.83007)));
            zz = 15.36474 + (((tickAnim - 23) / 4) * (6.82877-(15.36474)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 12.55287 + (((tickAnim - 27) / 3) * (0-(12.55287)));
            yy = -5.99219 + (((tickAnim - 27) / 3) * (-12.25-(-5.99219)));
            zz = 6.82877 + (((tickAnim - 27) / 3) * (0-(6.82877)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 4) * (0-(0.275)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 4) / 9) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.55 + (((tickAnim - 13) / 5) * (-0.25-(-0.55)));
            yy = -0.85 + (((tickAnim - 13) / 5) * (-0.52-(-0.85)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.25 + (((tickAnim - 18) / 5) * (0-(-0.25)));
            yy = -0.52 + (((tickAnim - 18) / 5) * (0-(-0.52)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0.275-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*4));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraOrdosemys e = (EntityPrehistoricFloraOrdosemys) entity;
        animator.update(entity);


    }
}
