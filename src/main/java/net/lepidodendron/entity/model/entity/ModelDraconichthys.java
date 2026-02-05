package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDraconichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
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
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r46;

    private ModelAnimator animator;

    public ModelDraconichthys() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -3.65F, -6.5F, 6, 4, 6, -0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, 0.35F, -6.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 20, -4.5F, -4.0F, -3.0F, 6, 4, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.7391F, -7.1249F, -10.4001F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 2.78F, 1.3182F, 1.1953F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 45, -4.8F, 0.0F, -5.05F, 5, 2, 5, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.013F, -2.6802F, -13.7683F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.502F, 1.1086F, -1.0943F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 53, -5.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5611F, -4.3159F, -14.841F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3554F, 0.6456F, -1.2645F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 66, -2.0F, 0.025F, -0.175F, 2, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.7391F, -7.1249F, -10.4001F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 2.2587F, 1.2588F, 0.6631F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 59, 0.075F, 0.0F, -2.05F, 5, 2, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.7391F, -7.1249F, -10.4001F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 2.78F, -1.3182F, -1.1953F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 45, -0.2F, 0.0F, -5.05F, 5, 2, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.013F, -2.6802F, -13.7683F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.502F, -1.1086F, 1.0943F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 53, 0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5611F, -4.3159F, -14.841F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3554F, -0.6456F, 1.2645F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 66, 0.0F, 0.025F, -0.175F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.7391F, -7.1249F, -10.4001F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 2.2587F, -1.2588F, -0.6631F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 59, -5.075F, 0.0F, -2.05F, 5, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -6.3107F, -14.8787F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.789F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 21, 29, -0.5F, -1.4F, -1.0F, 2, 2, 1, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -4.7877F, -15.359F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.1345F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 20, -0.75F, -0.5F, -0.4F, 1, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 20, 0.75F, -0.5F, -0.4F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.4897F, -3.3503F, -13.7371F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.8637F, -0.1225F, 0.1532F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 65, -0.075F, -2.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.4897F, -3.3503F, -13.7371F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.8637F, 0.1225F, -0.1532F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 65, 0.075F, -2.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -3.8135F, -11.8537F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.9163F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 61, 38, -1.5F, 0.0F, 0.0F, 4, 4, 1, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -4.0749F, -14.8422F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.4835F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 62, -1.5F, 0.0F, 0.0F, 3, 3, 1, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -6.3107F, -14.8787F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.48F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 65, -0.5F, 0.0F, -1.0F, 3, 2, 1, -0.004F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -8.2587F, -6.0921F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 59, -1.5F, 0.0F, -9.0F, 3, 1, 4, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 52, -2.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.35F, -0.5F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0524F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 11, -2.0F, -3.05F, -0.95F, 5, 3, 5, -0.006F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -7.25F, -5.0F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 11, -3.5F, -1.1F, -1.0F, 6, 6, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.5F, -8.5201F, 0.8813F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 55, 55, 2.5F, -3.6F, -0.6F, 0, 4, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -8.6944F, -1.1111F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 29, -2.5F, 0.0F, 0.0F, 5, 7, 5, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.0F, -0.75F, -8.4F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, 0.48F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontLeftFin.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.3054F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 23, -0.5F, 0.0F, 0.0F, 9, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.0F, -0.75F, -8.4F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, -0.48F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontRightFin.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.3054F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 23, -8.5F, 0.0F, 0.0F, 9, 0, 5, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.9272F, -5.0F, -12.1478F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, 0.0F, 0.2618F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 66, 66, -0.525F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 48, 62, -0.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.9272F, -5.0F, -12.1478F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, -0.2618F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 66, 66, -0.475F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 48, 62, -0.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.8936F, -9.3085F);
        this.main.addChild(jaw);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 1.295F, -4.345F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1004F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 55, -0.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.5296F, -6.1927F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3927F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 48, 66, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.2365F, -6.8355F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.8727F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 59, -0.5F, -1.0F, 0.0F, 2, 1, 1, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.1347F, -0.6899F, -4.948F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3099F, -0.1664F, 0.053F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 39, 62, -0.15F, -0.5F, -1.5F, 1, 1, 3, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.1347F, -0.6899F, -4.948F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3099F, 0.1664F, -0.053F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 39, 62, -0.85F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.5F, 0.1676F, -3.9308F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0895F, -0.2217F, 0.0197F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 61, 0, -0.5F, -0.5F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, -0.7133F, -6.6852F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3233F, -0.3281F, 0.1075F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 15, 64, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.006F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, -0.7133F, -6.6852F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3233F, 0.3281F, -0.1075F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 64, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.006F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 0.6657F, -3.9744F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1047F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 61, 6, -0.5F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 0.6657F, -3.9744F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.3054F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 61, 44, -0.5F, -1.0F, -3.0F, 2, 1, 3, 0.003F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.5394F, -0.1276F, -1.568F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2282F, -0.1622F, 0.0632F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 29, 67, 0.1F, -1.7F, -1.5F, 1, 2, 2, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(2.5394F, -0.1276F, -1.568F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2282F, 0.1622F, -0.0632F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 29, 67, -1.1F, -1.7F, -1.5F, 1, 2, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.5F, 0.1676F, -3.9308F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0895F, 0.2217F, -0.0197F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 61, 0, -1.5F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0833F, -5.2485F, 2.6041F);
        this.main.addChild(tail);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0833F, 5.2485F, -0.6041F);
        this.tail.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1134F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 42, -2.0F, -3.0F, 0.2F, 4, 3, 6, -0.003F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.4167F, -3.0102F, 0.2658F);
        this.tail.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1309F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 29, 20, -1.5F, 0.0F, 0.0F, 4, 6, 6, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.0833F, 4.2485F, 2.3959F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, 0.0F, 0.48F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backLeftFin.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.3927F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 50, 28, 0.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.9167F, 4.2485F, 2.3959F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.0F, -0.48F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backRightFin.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.3927F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 50, 28, -5.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.1111F, 1.1836F, 4.9346F);
        this.tail.addChild(tail2);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5278F, 1.1319F, 7.3068F);
        this.tail2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1614F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 40, 0, -1.0F, -1.925F, -7.5F, 3, 3, 7, -0.009F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.0278F, -3.4107F, 1.2798F);
        this.tail2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1309F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 21, 33, -0.5F, 0.0F, -1.125F, 3, 4, 7, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0556F, -0.2376F, 6.086F);
        this.tail2.addChild(tail3);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.5833F, 2.5975F, 0.5732F);
        this.tail3.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1309F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 42, 44, 0.5F, -3.0F, -0.925F, 2, 3, 7, -0.003F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.5833F, -2.7025F, 0.5732F);
        this.tail3.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0873F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 42, 33, 0.5F, 0.325F, -0.8F, 2, 3, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.1667F, -0.1252F, 5.9657F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 61, 12, -0.75F, -1.6773F, 0.1326F, 1, 3, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 61, 49, 0.25F, -0.4273F, 0.1326F, 1, 0, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 61, 49, -1.75F, -0.4273F, 0.1326F, 1, 0, 4, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.75F, 1.3727F, 6.1326F);
        this.tail4.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0873F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 61, 32, 0.0F, -1.0F, -6.0F, 1, 1, 4, -0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(-0.25F, -0.6186F, 3.6306F);
        this.tail4.addChild(tail5);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, -1.0587F, 0.752F);
        this.tail5.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.6981F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 25, 0, 0.5F, -8.975F, -0.5F, 0, 12, 7, 0.0F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 24, 64, 0.0F, -5.0F, -0.5F, 1, 6, 1, -0.003F, false));
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
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.4F;
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
        this.main.rotateAngleY = (float) Math.toRadians(-90);
        this.main.offsetX = -0.1F;
        this.main.offsetY = -0.19F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.2182F, (float) Math.toRadians(-90), 0.0F);

        this.main.offsetX = -0.03F;
        this.main.offsetZ = 0.035F;
        this.main.offsetY = -0.4F;
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

        this.main.offsetY = -0.3F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.286F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.25F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
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
        this.swing(backLeftFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetY = -0.20F;
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
        animator.rotate(this.jaw, -(float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, -(float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

