package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEukaia extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer leftSpine;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r35;


    public ModelEukaia() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 16, -2.5F, -0.4F, -3.3075F, 5, 1, 3, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 10, -2.5F, -1.9F, -3.3075F, 5, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.6F, -0.3075F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0305F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 21, -1.5F, -2.025F, -0.65F, 4, 2, 3, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.6F, -3.3075F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 28, -1.0F, -1.0F, -3.0F, 4, 1, 3, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -2.2329F, 1.9892F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 0, -1.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0606F, -4.95F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 27, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.1736F, -7.9848F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2009F, 0.5148F, -0.0999F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 41, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.866F, -0.0868F, -7.4924F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1684F, -0.601F, 0.1018F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 41, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.4377F, 0.0232F, -6.6793F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0993F, -0.156F, 0.0005F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 7, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0855F, -1.4255F, -5.9077F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0805F, -0.24F, -0.2291F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 13, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.9833F, -1.1215F, -7.5487F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2822F, -0.5466F, -0.2396F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 37, -0.025F, 0.0F, 0.0F, 2, 1, 2, -0.003F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0855F, -1.4255F, -5.9077F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0805F, 0.24F, 0.2291F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 13, -2.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.9833F, -1.1215F, -7.5487F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2822F, 0.5466F, 0.2396F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 37, -1.975F, 0.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.1585F, -7.8112F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 32, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.7857F, -1.033F, -6.7839F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1266F, -0.6364F, -0.0324F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 18, -0.525F, -0.2F, -0.375F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.7857F, -1.033F, -6.7839F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1266F, 0.6364F, 0.0324F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 41, 18, -0.475F, -0.2F, -0.375F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.866F, -0.0868F, -7.4924F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1684F, 0.601F, -0.1018F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 41, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.4377F, 0.0232F, -6.6793F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0993F, 0.156F, -0.0005F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 7, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, -0.1736F, -7.9848F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2009F, -0.5148F, 0.0999F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 41, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.1736F, -7.9848F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 35, 33, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.006F, false));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(2.5F, -0.5F, -2.8075F);
        this.main.addChild(leftSpine);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.7096F, 0.425F, 2.4163F);
        this.leftSpine.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.2618F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 41, -2.0F, -0.5F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.1585F, 0.425F, 2.8045F);
        this.leftSpine.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.2618F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 40, -2.3F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.8305F, 0.425F, 0.5926F);
        this.leftSpine.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -1.2217F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 39, 0.0F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 18, 0.0F, -0.5F, 0.0F, 3, 1, 1, 0.006F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.307F, -0.075F, 2.3666F);
        this.leftSpine.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.6545F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 27, 37, -2.0F, 0.0F, -2.0F, 2, 1, 2, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.425F, -0.1F);
        this.leftSpine.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.48F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 37, -0.5F, -0.5F, 0.0F, 2, 1, 2, 0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.0037F, -0.2498F, 2.0102F);
        this.leftSpine.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0654F, 0.3491F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 24, 33, -1.0F, 0.5F, 0.0F, 2, 0, 3, 0.0F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-2.5F, -0.5F, -2.8075F);
        this.main.addChild(rightSpine);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.7096F, 0.425F, 2.4163F);
        this.rightSpine.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.2618F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 7, 41, 0.0F, -0.5F, -1.0F, 2, 1, 1, -0.003F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.1585F, 0.425F, 2.8045F);
        this.rightSpine.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.2618F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 40, 0.3F, -0.5F, -1.0F, 2, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.8305F, 0.425F, 0.5926F);
        this.rightSpine.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 1.2217F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 39, -3.0F, 0.0F, -0.25F, 3, 0, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 18, -3.0F, -0.5F, 0.0F, 3, 1, 1, 0.006F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.307F, -0.075F, 2.3666F);
        this.rightSpine.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.6545F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 27, 37, 0.0F, 0.0F, -2.0F, 2, 1, 2, -0.003F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.425F, -0.1F);
        this.rightSpine.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.48F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 37, -1.5F, -0.5F, 0.0F, 2, 1, 2, 0.003F, true));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-0.0037F, -0.2498F, 2.0102F);
        this.rightSpine.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0654F, -0.3491F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 24, 33, -1.0F, 0.5F, 0.0F, 2, 0, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0051F, -0.2012F, -5.9322F);
        this.main.addChild(jaw);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0051F, 0.4216F, -1.7175F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1732F, 1.0406F, -0.1498F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 41, -1.9F, -1.0F, -0.05F, 2, 1, 1, -0.01F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.9949F, 0.4216F, -1.7175F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1732F, -1.0406F, 0.1498F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 41, -0.1F, -1.0F, -0.05F, 2, 1, 1, -0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.0051F, 0.7012F, 2.6247F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.5708F, -1.4835F, 1.5708F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 35, -4.6F, -0.9F, -1.0F, 2, 1, 2, -0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 1.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 17, 7, -1.5F, -1.0F, 0.0F, 3, 2, 4, -0.003F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -1.0F, 4.0F);
        this.tail.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0873F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 28, -0.5F, -0.35F, -4.0F, 2, 1, 4, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 0.75F, 0.5F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0679F, -0.4968F, 0.553F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 36, 37, 0.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 0.75F, 0.5F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0679F, 0.4968F, -0.553F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 36, 37, -2.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 21, -1.0F, -0.7486F, -0.0654F, 2, 1, 5, 0.003F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -0.7486F, 4.9346F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1178F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 30, 0, 0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.75F, 5.0F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0436F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 17, 14, -1.0F, -1.0F, -5.025F, 2, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail2.addChild(tail3);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -0.5F, 0.25F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2182F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, 0.5F, -0.2F, -0.25F, 0, 2, 7, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 30, 21, 0.0F, -0.2F, -0.25F, 1, 1, 5, 0.0F, false));
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

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

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
//            this.body.offsetX = -0.5F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }}
