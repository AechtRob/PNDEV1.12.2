package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHadrosteus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;


    private ModelAnimator animator;

    public ModelHadrosteus() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.7F, -4.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.1407F, 3.4945F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1222F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 46, -2.0F, -4.05F, -4.975F, 6, 4, 5, -0.006F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.75F, -0.9F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0567F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -3.0F, -4.0F, -8.0F, 7, 4, 8, -0.006F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.3734F, -12.7798F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4145F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 74, -0.5F, 0.0F, -4.4F, 1, 1, 1, 0.006F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 16, -1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 73, 16, -1.0F, 0.0F, -3.6F, 2, 1, 2, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.6526F, -12.2077F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3272F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 36, -2.5F, -0.775F, 0.0F, 5, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.6526F, -14.2077F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1091F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 42, -1.5F, -1.0F, 0.0F, 3, 1, 2, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.6207F, -3.51F, -14.2792F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0191F, -0.5385F, 0.02F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 21, 0.0F, -0.8F, 0.35F, 0, 2, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 60, 0.0F, -1.2F, -1.35F, 0, 2, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.6207F, -3.51F, -14.2792F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2363F, -0.529F, 0.0186F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 55, 0.025F, -1.3568F, -1.3315F, 0, 2, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.2529F, -4.263F, -16.0283F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1635F, -0.2796F, -0.1025F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 73, 28, -0.7F, -0.425F, 0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.6207F, -3.51F, -14.2792F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0191F, 0.5385F, -0.02F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 60, 0.0F, -1.2F, -1.35F, 0, 2, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 21, 0.0F, -0.8F, 0.35F, 0, 2, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.6207F, -3.51F, -14.2792F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2363F, 0.529F, -0.0186F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 72, 55, -0.025F, -1.3568F, -1.3315F, 0, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.2529F, -4.263F, -16.0283F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1635F, 0.2796F, 0.1025F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 73, 28, -0.3F, -0.425F, 0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.3393F, -5.7362F, -14.3386F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3311F, -0.3554F, 0.3301F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 72, 73, 0.0F, 0.05F, -1.925F, 1, 1, 2, -0.003F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0883F, -4.6873F, -14.8336F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6474F, -0.4202F, 0.3747F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 72, 68, -0.35F, -0.675F, 0.25F, 1, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.3166F, -5.7274F, -14.3289F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2785F, -0.3842F, 0.3696F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 62, 0.0F, 0.05F, 0.0F, 1, 2, 3, 0.003F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0883F, -4.6873F, -14.8336F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6474F, 0.4202F, -0.3747F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 72, 68, -0.65F, -0.675F, 0.25F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.3393F, -5.7362F, -14.3386F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3311F, 0.3554F, -0.3301F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 72, 73, -1.0F, 0.05F, -1.925F, 1, 1, 2, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.3166F, -5.7274F, -14.3289F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2785F, 0.3842F, -0.3696F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 72, 62, -1.0F, 0.05F, 0.0F, 1, 2, 3, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, -6.6948F, -11.8329F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3011F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 56, -3.5F, -0.1F, 0.0F, 5, 2, 5, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -8.6944F, -1.1111F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0654F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 27, 0, -4.5F, 0.0F, -6.0F, 8, 6, 6, 0.006F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-4.0F, -2.3149F, -6.7058F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1282F, -0.1472F, 0.1699F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 56, -0.15F, -3.1F, -6.1F, 1, 3, 6, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-3.208F, -7.3309F, -7.272F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1074F, -0.1472F, 0.1699F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 65, 0.0F, 0.0F, -5.0F, 1, 2, 6, -0.006F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(3.208F, -7.3309F, -7.272F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1074F, 0.1472F, -0.1699F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 65, -1.0F, 0.0F, -5.0F, 1, 2, 6, -0.006F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(4.0F, -2.3149F, -6.7058F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1282F, 0.1472F, -0.1699F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 42, 56, -0.85F, -3.1F, -6.1F, 1, 3, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.5F, -8.3451F, 2.4813F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3927F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 17, 64, 2.5F, -5.1F, -2.6F, 0, 6, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -8.6944F, -1.1111F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0873F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 31, 34, -3.5F, 0.0F, 0.0F, 7, 6, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.6944F, -8.8611F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 60, -1.5F, 0.0F, -4.35F, 3, 1, 5, 0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.9232F, -0.7176F, -6.5019F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.0555F, -0.3048F, -0.2664F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 29, 74, 0.475F, -0.275F, -0.95F, 0, 1, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.9232F, -0.7176F, -6.5019F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.0555F, 0.3048F, 0.2664F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 29, 74, -0.475F, -0.275F, -0.95F, 0, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 2.7986F, -2.3117F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0611F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 60, 10, -2.5F, -2.0F, 0.0F, 5, 2, 3, 0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 1.6466F, -5.0174F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3142F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 69, 49, -1.0F, -1.775F, -0.05F, 3, 2, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 0.5671F, -6.2026F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.7636F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 73, 24, -0.5F, -0.9F, -0.4F, 2, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, 1.0F, -4.25F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2182F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 73, 20, -0.5F, -1.0F, -2.0F, 2, 1, 2, -0.006F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-3.0F, 0.5F, -0.25F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1378F, -0.3054F, 0.0229F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 23, 39, 0.2F, -0.55F, -4.1F, 0, 1, 3, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(3.0F, 0.5F, -0.25F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1378F, 0.3054F, -0.0229F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 23, 39, -0.2F, -0.55F, -4.1F, 0, 1, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-3.0F, 0.5F, -0.25F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0067F, -0.2355F, 0.0224F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 67, -0.325F, -0.5F, -4.4F, 2, 2, 5, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.2991F, 0.9861F, -4.6075F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2702F, -0.7192F, 0.1743F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 56, 73, 0.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(2.2991F, 0.9861F, -4.6075F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2702F, 0.7192F, -0.1743F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 56, 73, -2.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(3.0F, 0.5F, -0.25F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0067F, 0.2355F, -0.0224F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 67, -1.675F, -0.5F, -4.4F, 2, 2, 5, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.5F, -0.6944F, -6.6111F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, -0.1309F, 0.3927F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 27, 13, 0.0F, 0.0F, 0.0F, 9, 0, 7, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.5F, -0.6944F, -6.6111F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.1309F, -0.3927F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 27, 13, -9.0F, 0.0F, 0.0F, 9, 0, 7, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(2.3173F, -4.7166F, -12.5094F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, 0.3927F, 0.4546F, -0.198F);
        this.eye.cubeList.add(new ModelBox(eye, 65, 73, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 35, 74, -0.425F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-2.3173F, -4.7166F, -12.5094F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, 0.3927F, -0.4546F, 0.198F);
        this.eye2.cubeList.add(new ModelBox(eye2, 65, 73, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 35, 74, -0.575F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0833F, -5.2485F, 3.4041F);
        this.main.addChild(tail);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.4167F, 5.2485F, -0.4041F);
        this.tail.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1134F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 46, 46, -2.0F, -3.0F, 0.2F, 5, 3, 6, -0.003F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.4167F, -3.0102F, 0.4658F);
        this.tail.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1309F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 31, 21, -1.5F, 0.0F, 0.0F, 6, 6, 6, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.5833F, 4.2485F, 1.5959F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, 0.0F, 0.48F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backLeftFin.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.3927F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 56, 31, 0.0F, 0.0F, 0.0F, 6, 0, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.4167F, 4.2485F, 1.5959F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.0F, -0.48F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backRightFin.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.3927F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 56, 31, -6.0F, 0.0F, 0.0F, 6, 0, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.8366F, 5.3424F);
        this.tail.addChild(tail2);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.0833F, 3.6715F, -0.1426F);
        this.tail2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1614F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 50, -3.0F, -2.925F, 0.225F, 4, 3, 6, -0.003F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.9167F, -3.0636F, 1.0721F);
        this.tail2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.144F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 39, -1.5F, 0.075F, -0.625F, 5, 4, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4951F, 4.8387F);
        this.tail2.addChild(tail3);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.4167F, 3.2021F, 0.6128F);
        this.tail3.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1658F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 56, 21, 0.5F, -3.0F, -0.925F, 2, 3, 6, -0.003F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.9167F, -2.0979F, 0.6128F);
        this.tail3.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.1091F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 56, 0, -0.5F, 0.325F, -0.8F, 3, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3455F, 5.2207F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 57, 56, -0.9167F, -1.5435F, -0.0829F, 2, 3, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 82, 1.0833F, -0.5435F, 0.6671F, 1, 0, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 82, -1.9167F, -0.5435F, 0.6671F, 1, 0, 4, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.4167F, 1.5065F, 5.9171F);
        this.tail4.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0873F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 69, 42, 0.0F, -1.0F, -6.0F, 1, 1, 5, -0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0833F, -0.5435F, 4.6671F);
        this.tail4.addChild(tail5);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, -4.3779F, 3.9364F);
        this.tail5.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.48F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 28, 66, -1.0F, 0.4F, 0.025F, 1, 1, 6, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.5F, -3.2705F, 4.7948F);
        this.tail5.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.6109F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 57, 65, -1.0F, -1.0F, -6.0F, 1, 1, 6, 0.003F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -6.575F, 9.2F);
        this.tail5.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.3491F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 0, 0.0F, -0.075F, -11.375F, 0, 12, 13, 0.0F, false));



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


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

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

