package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIncisoscutum extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;

    private ModelAnimator animator;

    public ModelIncisoscutum() {
        this.textureWidth = 42;
        this.textureHeight = 42;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.7013F, -4.1322F);
        this.main.cubeList.add(new ModelBox(main, 30, 19, -1.0F, -1.7763F, 2.7322F, 2, 1, 2, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.3024F, 0.3191F, 0.2434F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0385F, -0.1698F, 0.1344F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 31, -0.5F, -0.875F, -0.675F, 1, 2, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.3543F, -0.2117F, 4.7007F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0307F, 0.1352F, 0.0011F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 12, -1.0F, -1.5F, -4.0F, 2, 3, 4, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.05F, 1.2237F, -1.6178F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2007F, -0.1309F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 26, -0.9778F, -1.4079F, -1.5079F, 0, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.75F, -0.3301F, -1.6056F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0874F, -0.0565F, -0.0049F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 26, 0.0F, -1.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.7F, -1.2263F, -1.6678F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3767F, -0.2976F, -0.1419F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 31, -0.0206F, -0.0111F, -1.9693F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.13F, 0.0443F, -3.1237F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3525F, -0.2009F, -0.0024F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 25, -0.0461F, -1.7079F, -0.0759F, 1, 2, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.108F, -0.2763F, -2.3008F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.4363F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 10, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.3543F, -0.2117F, 4.7007F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0307F, -0.1352F, -0.0011F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 12, -1.0F, -1.5F, -4.0F, 2, 3, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.2237F, -1.6178F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 22, -1.0F, 0.3911F, 4.1464F, 2, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.2237F, -1.6178F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 28, -1.5F, -0.1436F, 2.566F, 3, 1, 2, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.3024F, 0.3191F, 0.2434F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0385F, 0.1698F, -0.1344F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 31, -0.5F, -0.875F, -0.675F, 1, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.2237F, -1.6178F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 16, -1.5F, -2.9005F, 2.5836F, 3, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.05F, 1.2237F, -1.6178F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2007F, 0.1309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 26, 0.9778F, -1.4079F, -1.5079F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.2237F, -1.6178F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 24, -1.5F, -1.352F, 0.78F, 3, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.2237F, -1.6178F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5149F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 6, -1.0F, -2.4783F, -1.0918F, 2, 1, 1, -0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.75F, -0.3301F, -1.6056F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0874F, 0.0565F, 0.0049F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 26, -1.0F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.7F, -1.2263F, -1.6678F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3767F, 0.2976F, 0.1419F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 31, -0.9794F, -0.0111F, -1.9693F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.2237F, -1.6178F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2923F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 3, -1.0F, -2.3983F, -0.8605F, 2, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.13F, 0.0443F, -3.1237F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3525F, 0.2009F, 0.0024F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 25, -0.9539F, -1.7079F, -0.0759F, 1, 2, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.2237F, -1.6178F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1396F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 19, -1.0F, -2.5564F, 0.1483F, 2, 2, 3, 0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.2237F, -1.6178F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 0, -1.0F, -1.7481F, -1.5648F, 2, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.108F, -0.2763F, -2.3008F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.4363F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 10, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.3355F, 0.9794F, 1.3935F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.141F, -0.6639F, 0.4751F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.15F, -0.05F, -3.05F);
        this.frontLeftFin.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.1745F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 9, 0.408F, 0.3765F, 2.3787F, 5, 0, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.3355F, 0.9794F, 1.3935F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.141F, 0.6639F, -0.4751F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.15F, -0.05F, -3.05F);
        this.frontRightFin.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.1745F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 18, 9, -5.408F, 0.3765F, 2.3787F, 5, 0, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7737F, -0.7428F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.48F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.05F, 0.45F, -0.85F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3491F, -0.2356F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 8, 30, -1.1288F, -0.6212F, -0.7596F, 2, 1, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.45F, -0.875F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.3229F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 8, -1.0F, -0.0729F, -1.4173F, 2, 1, 1, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.45F, -0.875F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 25, -1.0F, -0.32F, -0.7625F, 2, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.05F, 0.45F, -0.85F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3491F, 0.2356F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 8, 30, -0.8712F, -0.6212F, -0.7596F, 2, 1, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.3342F, 4.6068F);
        this.main.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 28, 28, -1.0F, -1.3421F, 0.0255F, 2, 3, 2, 0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.5579F, -6.2245F);
        this.tail1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.192F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 12, -0.5F, 0.4768F, 6.0732F, 1, 1, 1, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.9F, 1.1079F, 1.0755F);
        this.tail1.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.141F, -0.6639F, 0.4751F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.9F, 0.45F, -7.3F);
        this.backLeftFin.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0097F, 0.218F, 0.0447F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 6, -0.769F, -0.3109F, 6.3891F, 4, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.9F, 1.1079F, 1.0755F);
        this.tail1.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.141F, 0.6639F, -0.4751F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.9F, 0.45F, -7.3F);
        this.backRightFin.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0097F, -0.218F, -0.0447F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 18, 6, -3.231F, -0.3109F, 6.3891F, 4, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4283F, 1.7848F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 19, -0.5F, -0.5389F, -0.0343F, 1, 2, 4, 0.003F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.9818F, 0.2429F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0742F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 22, 11, -0.5F, 0.1F, -0.25F, 1, 1, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.9862F, -8.0093F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.2138F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 12, 0.0F, -8.2127F, 7.502F, 0, 4, 5, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 1.9862F, -8.0093F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1309F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 21, -0.5F, 0.0553F, 7.9575F, 1, 1, 4, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5185F, 3.6971F);
        this.tail2.addChild(tail3);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.2427F, 2.0936F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3229F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, 0.0F, -0.9287F, -0.924F, 0, 3, 9, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 1.1427F, -0.4314F);
        this.tail3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.829F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 18, 25, 0.0F, -0.5372F, -0.0735F, 0, 2, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.8091F, 0.2673F);
        this.tail3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3316F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 18, 0, -0.5F, -0.875F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -1.1058F, 0.1882F);
        this.tail3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.192F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 22, 31, -0.5F, 0.0F, 0.0F, 1, 1, 2, -0.01F, false));

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


        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3};

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
        this.flap(backLeftFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin  , (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
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

