package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWalterosteus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer walterHat;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r55;
    private ModelAnimator animator;

    public ModelWalterosteus() {
        animator = ModelAnimator.create();
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.75F, -2.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 23, -3.5F, -3.65F, -6.5F, 7, 4, 6, -0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 0.35F, -6.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 30, -4.5F, -2.0F, -5.0F, 7, 2, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.9446F, -12.034F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.1301F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 63, 50, -3.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.8401F, -9.1738F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.0385F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 8, -2.0F, -5.0F, -0.5F, 5, 2, 1, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.2258F, -15.1456F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.4835F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 59, -2.0F, 0.0F, -0.3F, 4, 2, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.7413F, -0.7588F, -9.5373F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.61F, -0.0323F, -0.0056F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 10, 0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.7413F, -0.7588F, -9.5373F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.61F, 0.0323F, 0.0056F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 10, -1.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.4487F, -1.4542F, -13.4655F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.3912F, -0.0615F, 0.0719F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 45, 1.0F, 0.0F, 4.0F, 1, 2, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 57, 61, 0.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.4487F, -1.4542F, -13.4655F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.3912F, 0.0615F, -0.0719F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 45, -2.0F, 0.0F, 4.0F, 1, 2, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 61, -1.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0F, -5.7319F, -15.704F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0459F, -0.3182F, 0.0144F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 54, 0.0F, 0.0F, 0.0F, 1, 2, 4, -0.003F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.6014F, -1.9146F, -15.2177F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.2645F, -0.4056F, 0.178F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 67, 27, 0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, -3.7338F, -15.7913F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3127F, -0.3698F, 0.203F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 70, 61, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.6014F, -1.9146F, -15.2177F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.2645F, 0.4056F, -0.178F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 67, 27, -1.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.8883F, -1.1338F, -15.0342F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 2.8957F, -0.3698F, 0.203F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 65, 0.025F, 0.0F, -2.0F, 0, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.9457F, -2.7358F, -15.8222F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 2.0667F, -0.3698F, 0.203F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 59, -0.275F, 0.0F, -2.0F, 0, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, -3.7338F, -15.7913F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.0544F, -0.3698F, 0.203F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 72, 0.35F, 0.0F, -0.9F, 1, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.8883F, -1.1338F, -15.0342F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 2.8957F, 0.3698F, -0.203F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 45, 65, -0.025F, 0.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.9457F, -2.7358F, -15.8222F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 2.0667F, 0.3698F, -0.203F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 59, 0.275F, 0.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.5F, -3.7338F, -15.7913F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0544F, 0.3698F, -0.203F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 72, -1.35F, 0.0F, -0.9F, 1, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.0F, -3.7338F, -15.7913F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3127F, 0.3698F, -0.203F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 70, 61, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -3.7338F, -15.7913F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 67, 18, -1.5F, 0.0F, 0.0F, 4, 1, 1, 0.006F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.0F, -5.7319F, -15.704F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0459F, 0.3182F, -0.0144F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 54, -1.0F, 0.0F, 0.0F, 1, 2, 4, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -4.4319F, -16.904F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 73, -3.5F, -1.0F, 1.0F, 8, 2, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -3.7319F, -15.904F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 78, -1.5F, 0.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -5.7319F, -15.704F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 67, 33, -1.5F, 0.0F, 0.0F, 4, 2, 1, 0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -6.2544F, -14.8514F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5498F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 27, -1.5F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, -7.3904F, -11.0161F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.288F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 57, 54, -2.5F, 0.0F, -4.0F, 4, 2, 4, 0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -8.2587F, -6.0921F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 42, 38, -2.5F, 0.0F, -5.0F, 6, 2, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, 0.35F, -0.5F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0524F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 42, 46, -2.0F, -3.05F, -0.95F, 6, 3, 4, -0.006F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -7.25F, -5.0F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 11, -4.5F, -1.1F, -1.0F, 8, 6, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.5F, -8.5201F, 0.8813F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3927F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 55, 2.5F, -4.6F, -0.6F, 0, 5, 6, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -8.6944F, -1.1111F);
        this.main.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 34, -3.5F, 0.0F, 0.0F, 7, 6, 4, 0.0F, false));

        this.walterHat = new AdvancedModelRenderer(this);
        this.walterHat.setRotationPoint(0.0F, -7.1804F, -11.7551F);
        this.main.addChild(walterHat);
        this.setRotateAngle(walterHat, 0.2618F, 0.0F, 0.0F);
        this.walterHat.cubeList.add(new ModelBox(walterHat, 0, 0, -3.0F, -2.9875F, -3.0F, 6, 3, 6, 0.0F, false));
        this.walterHat.cubeList.add(new ModelBox(walterHat, 37, 70, -5.0F, -0.0125F, -5.0F, 10, 0, 10, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.0F, -1.25F, -6.65F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, 0.48F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontLeftFin.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.3054F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 27, 24, -0.5F, 0.0F, 0.0F, 9, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.0F, -1.25F, -6.65F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, -0.48F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontRightFin.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.3054F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 27, 24, -8.5F, 0.0F, 0.0F, 9, 0, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0513F, -1.2792F, -11.4405F);
        this.main.addChild(jaw);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0513F, 1.3818F, -2.9595F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0087F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 56, 21, -2.5F, -1.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0513F, 0.2346F, -4.5978F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.6109F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 35, 70, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.3975F, 0.2346F, -4.5978F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3167F, -0.454F, 0.1616F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 45, 63, 0.25F, -1.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.9987F, -0.0855F, -2.5487F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0331F, -0.3925F, 0.0126F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 45, 61, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.5F, 0.2346F, -4.5978F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.3167F, 0.454F, -0.1616F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 45, 63, -0.25F, -1.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.3975F, 0.2346F, -4.5978F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.4197F, -0.5219F, 0.1952F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 13, 55, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.5F, 0.2346F, -4.5978F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.4197F, 0.5219F, -0.1952F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 13, 55, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0013F, 0.2346F, -4.5978F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.3185F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 28, 79, -1.95F, -0.75F, -0.15F, 4, 1, 0, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 24, 68, -1.45F, -1.0F, 0.0F, 3, 1, 2, 0.003F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(2.1013F, -0.0855F, -2.5487F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0331F, 0.3925F, -0.0126F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 45, 61, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-2.4487F, 0.402F, -2.9638F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0314F, -0.2355F, 0.0073F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 67, 12, 0.0F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(2.5513F, 0.402F, -2.9638F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0314F, 0.2355F, -0.0073F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 67, 12, -1.0F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0513F, 0.0F, 0.25F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0305F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 28, 63, -3.5F, 0.0F, -3.2F, 5, 1, 3, -0.006F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(2.6929F, -3.9947F, -13.3521F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, -0.1006F, 0.4253F, -0.2399F);
        this.eye.cubeList.add(new ModelBox(eye, 71, 71, -0.4875F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 70, 66, -0.5125F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-2.6929F, -3.9947F, -13.3521F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, -0.1006F, -0.4253F, 0.2399F);
        this.eye2.cubeList.add(new ModelBox(eye2, 71, 71, -0.5125F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 70, 66, -0.4875F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0833F, -5.2485F, 1.6041F);
        this.main.addChild(tail);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.4167F, 4.5466F, 5.5561F);
        this.tail.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1484F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 41, 0, -2.0F, -3.0F, -6.0F, 5, 3, 6, -0.003F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.4167F, -2.2271F, 6.2145F);
        this.tail.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1484F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 27, 11, -1.5F, 0.0F, -6.0F, 6, 6, 6, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.2139F, 4.7081F, 0.1459F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, 0.0F, 0.48F);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backLeftFin.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.3927F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 63, 46, 0.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0473F, 4.7081F, 0.1459F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.0F, -0.48F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backRightFin.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.3927F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 63, 46, -5.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.1111F, 1.1836F, 4.9346F);
        this.tail.addChild(tail2);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.0278F, 1.1319F, 7.3068F);
        this.tail2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1614F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 21, 50, -1.0F, -1.925F, -7.5F, 4, 3, 5, -0.009F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-2.0278F, -3.4107F, 1.2798F);
        this.tail2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1309F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 45, -0.5F, 0.0F, -1.125F, 5, 4, 5, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0556F, -0.2376F, 4.086F);
        this.tail2.addChild(tail3);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.5833F, 2.0754F, 4.539F);
        this.tail3.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1876F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 64, 0, 0.5F, -3.0F, -3.925F, 2, 3, 4, -0.003F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.0833F, -2.0126F, 4.7289F);
        this.tail3.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.1527F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 13, 59, -1.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.1667F, -0.1252F, 3.9657F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 65, 38, -1.25F, -1.6773F, 0.1326F, 2, 3, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 67, 0.75F, -0.4273F, 0.1326F, 2, 0, 4, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.75F, 1.3727F, 6.1326F);
        this.tail4.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0873F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 13, 67, 0.0F, -1.0F, -6.0F, 1, 1, 4, -0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(-0.25F, -0.6186F, 3.6306F);
        this.tail4.addChild(tail5);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, -1.0587F, 0.752F);
        this.tail5.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.6981F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 27, 30, 0.5F, -8.975F, -0.5F, 0, 12, 7, 0.0F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 51, 54, 0.0F, -5.0F, -0.5F, 1, 6, 1, -0.003F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }
//        this.main.offsetZ = -0.5F;

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

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
