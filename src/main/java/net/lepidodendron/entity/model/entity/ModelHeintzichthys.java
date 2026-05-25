package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHeintzichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
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
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;


    private ModelAnimator animator;

    public ModelHeintzichthys() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 28, -5.0F, -10.0F, -14.0F, 10, 10, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -2.2895F, -17.1029F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.9163F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 56, -3.5F, -0.775F, -4.225F, 9, 1, 5, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.2425F, -3.4455F, -21.0066F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3669F, -0.0422F, 0.0232F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 64, -0.575F, -5.0F, 0.0F, 2, 5, 7, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.8261F, -5.8557F, -23.8174F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6654F, -0.4202F, 0.1119F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 69, 78, 0.0F, -3.0F, -0.1F, 2, 3, 4, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.2425F, -3.4455F, -21.0066F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3669F, 0.0422F, -0.0232F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 64, -1.425F, -5.0F, 0.0F, 2, 5, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -5.5469F, -23.7651F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1355F, -0.2595F, 0.035F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 80, -0.4F, -1.1F, -0.4F, 1, 2, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.9477F, -5.9761F, -23.4136F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5772F, -0.4112F, 0.1094F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 83, 4, 0.05F, 0.0F, 0.0F, 0, 1, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.9477F, -5.9761F, -23.4136F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5772F, 0.4112F, -0.1094F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 83, 4, -0.05F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.8261F, -5.8557F, -23.8174F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6654F, 0.4202F, -0.1119F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 69, 78, -2.0F, -3.0F, -0.1F, 2, 3, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -5.7858F, -23.3255F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.453F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 80, -3.0F, 0.0F, 0.0F, 5, 4, 1, 0.006F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, -5.5469F, -23.7651F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1355F, 0.2595F, -0.035F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 80, -0.6F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -7.6309F, -24.5335F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 83, 0, -1.5F, 0.0F, 0.0F, 4, 2, 1, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -9.1309F, -21.9354F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 69, 72, -2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -9.8255F, -17.9962F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 66, 24, -3.5F, 0.0F, -4.0F, 6, 2, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -10.0F, -14.0F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 66, 17, -4.5F, 0.0F, -4.0F, 7, 2, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 56, -4.5F, -3.0F, -4.0F, 9, 3, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 17, -4.0F, -2.075F, -0.7F, 8, 2, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-4.5289F, -9.5489F, -17.9708F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.073F, -0.0384F, 0.1067F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 68, 0, 0.15F, -0.05F, -0.2F, 2, 4, 5, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.9793F, -9.2632F, -19.8792F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0494F, -0.2449F, 0.1493F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 79, -0.7F, 0.25F, -2.0F, 2, 3, 4, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-3.5669F, -9.072F, -21.8434F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4272F, -0.406F, 0.045F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 82, 78, 0.225F, 0.0F, -3.3F, 2, 2, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(3.5669F, -9.072F, -21.8434F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4272F, 0.406F, -0.045F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 82, 78, -2.225F, 0.0F, -3.3F, 2, 2, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.9793F, -9.2632F, -19.8792F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0494F, 0.2449F, -0.1493F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 49, 79, -1.3F, 0.25F, -2.0F, 2, 3, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(4.5289F, -9.5489F, -17.9708F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.073F, 0.0384F, -0.1067F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 68, 0, -2.15F, -0.05F, -0.2F, 2, 4, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(4.0F, -10.0F, -6.0F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.7854F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 64, -4.0F, 0.0F, 0.0F, 0, 6, 8, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -10.0F, -6.0F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 33, 0, -4.0F, 0.0F, 0.0F, 9, 8, 8, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(4.4665F, -2.0653F, -14.0F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, -0.1309F, 0.48F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 47, 0.0F, 0.0F, 0.0F, 9, 0, 6, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-4.4665F, -2.0653F, -14.0F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.1309F, -0.48F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 47, -9.0F, 0.0F, 0.0F, 9, 0, 6, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.1435F, -2.3177F, -17.4872F);
        this.main.addChild(jaw);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.8565F, 0.4551F, 0.3079F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2272F, -0.281F, 0.064F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 69, 64, 0.125F, -0.5F, -6.35F, 2, 1, 6, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.8565F, -1.7224F, -7.2012F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.5505F, -0.4893F, 0.2809F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 62, 79, 0.1F, -0.5F, 0.175F, 1, 1, 2, -0.003F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(5.1435F, 0.4551F, 0.3079F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2272F, 0.281F, -0.064F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 69, 64, -2.125F, -0.5F, -6.35F, 2, 1, 6, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.3565F, -0.6823F, -2.5128F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2182F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 27, 63, -2.5F, 0.0F, -3.0F, 6, 1, 6, 0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.3565F, -0.8186F, -4.4665F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.236F, -0.4149F, 0.1393F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 31, 47, -1.1F, -2.0F, -0.35F, 0, 6, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.6435F, -2.1659F, -6.9704F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5236F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 83, 31, -2.25F, 0.2F, -0.025F, 1, 1, 1, 0.0F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 83, 31, 0.25F, 0.2F, -0.025F, 1, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.6435F, -0.8186F, -4.4665F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 1.236F, 0.4149F, -0.1393F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 31, 47, 1.1F, -2.0F, -0.35F, 0, 6, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(2.1435F, -1.7224F, -7.2012F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5505F, 0.4893F, -0.2809F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 62, 79, -1.1F, -0.5F, 0.175F, 1, 1, 2, -0.003F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.3565F, -0.3554F, -5.6581F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.48F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 83, -1.5F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(3.525F, -6.6F, -21.1F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, -0.0808F, 0.4293F, -0.1922F);
        this.eye.cubeList.add(new ModelBox(eye, 19, 64, -0.525F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 83, 34, -0.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-3.525F, -6.6F, -21.1F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, -0.0808F, -0.4293F, 0.1922F);
        this.eye2.cubeList.add(new ModelBox(eye2, 19, 64, -0.475F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 83, 34, -0.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.2594F, -7.0588F, 1.0219F);
        this.main.addChild(tail);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.7594F, -2.2876F, 0.1996F);
        this.tail.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1309F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 37, 28, -3.0F, 0.05F, 0.0F, 7, 7, 7, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.2594F, 6.6916F, -0.5816F);
        this.tail.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0654F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 54, -3.0F, -2.0F, 0.0F, 6, 2, 7, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.2594F, 6.4525F, 0.1694F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.0873F, 0.5236F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 68, 10, 0.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.7783F, 6.4525F, 0.1694F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.0873F, -0.5236F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 68, 10, -5.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.2594F, 3.1328F, 6.0278F);
        this.tail.addChild(tail2);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 3.5588F, -7.6094F);
        this.tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0654F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 62, 43, -2.0F, -3.0F, 7.6F, 4, 3, 7, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, -4.4545F, 0.5084F);
        this.tail2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1789F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 37, 43, -2.0F, 0.075F, 0.1F, 5, 5, 7, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.056F, 6.5385F);
        this.tail2.addChild(tail3);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 2.6697F, -0.7288F);
        this.tail3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0262F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 34, 72, -1.0F, -2.075F, 0.6F, 2, 2, 5, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-2.575F, -0.6414F, 2.8101F);
        this.tail3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1849F, 0.039F, -0.0181F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 77, -0.65F, 0.0F, -2.775F, 2, 0, 5, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(2.575F, -0.6414F, 2.8101F);
        this.tail3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1849F, -0.039F, 0.0181F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 77, -1.35F, 0.0F, -2.775F, 2, 0, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.0F, -2.7681F, -0.3383F);
        this.tail3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.192F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 66, 31, -0.5F, -0.475F, 0.8F, 3, 4, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.3857F, 4.5608F);
        this.tail3.addChild(tail4);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, -3.6123F, 3.5634F);
        this.tail4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.6981F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, 0.5F, 0.075F, -7.15F, 0, 11, 16, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 15, 80, 0.0F, -0.425F, -0.15F, 1, 1, 5, -0.003F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.3677F, 0.3759F);
        this.tail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.7854F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 19, 71, -0.5F, -1.0F, -1.0F, 1, 2, 6, 0.0F, false));



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
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.5F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.12F;
        this.main.offsetY = -0.19F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetX = -0.06F;
        this.main.offsetZ = 0.03F;
        this.main.offsetY = -0.5F;
        this.main.render(0.01F);
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


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.2F * still);
            this.chainSwing(fishTail, speed * still, 0.2F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin  , (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

