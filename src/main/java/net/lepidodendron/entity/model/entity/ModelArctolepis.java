package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArctolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
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

    public ModelArctolepis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.5F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5F, -3.3075F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, -1.4835F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 28, -3.0F, -0.9F, -2.0F, 3, 1, 4, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.1F, -1.8075F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, -1.5F, -0.5F, -2.5F, 3, 1, 5, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5F, -0.5F, -3.3075F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 0, 0.0F, -0.3F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -2.2329F, 1.9892F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0393F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 7, -1.0F, 0.1F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0606F, -4.95F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 28, -2.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.73F, -0.0423F, -7.2427F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1589F, -0.3463F, 0.0418F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 34, 0.0F, -1.0F, -0.05F, 1, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0855F, -1.4255F, -5.9077F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0181F, -0.2577F, -0.2337F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 38, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0855F, -1.4255F, -5.9077F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2822F, -0.5466F, -0.2396F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 38, -0.025F, 0.0F, -2.0F, 2, 1, 2, -0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.1736F, -7.9848F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2444F, 0.7703F, -0.1719F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 42, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0855F, -1.4255F, -5.9077F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0181F, 0.2577F, 0.2337F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 38, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.0855F, -1.4255F, -5.9077F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2822F, 0.5466F, 0.2396F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 38, -1.975F, 0.0F, -2.0F, 2, 1, 2, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.1585F, -7.8112F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 14, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.73F, -0.0423F, -7.2427F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1589F, 0.3463F, -0.0418F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 34, -1.0F, -1.0F, -0.05F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, 0.5F, 1.9675F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0218F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 10, -4.0F, -2.0F, -4.0F, 4, 2, 4, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.3182F, -0.563F, -6.8883F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4728F, 0.9386F, -0.2431F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 43, 14, -0.5F, -0.5F, -0.6F, 1, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.3182F, -0.563F, -6.8883F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4728F, -0.9386F, 0.2431F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 43, 14, -0.5F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, -0.1736F, -7.9848F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2444F, -0.7703F, 0.1719F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 42, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.1736F, -7.9848F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 37, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.006F, false));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(2.5F, -0.5F, -4.5075F);
        this.main.addChild(leftSpine);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.7096F, 0.425F, 2.4163F);
        this.leftSpine.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.2618F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 34, -1.0F, -0.5F, -0.875F, 2, 1, 1, -0.006F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.1585F, 0.425F, 2.8045F);
        this.leftSpine.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.48F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 31, 42, -2.0F, -0.5F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(4.1248F, 0.425F, 3.8692F);
        this.leftSpine.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -1.2654F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 37, 0.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.8305F, 0.425F, 0.5926F);
        this.leftSpine.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.9599F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 13, 34, 0.0F, -0.5F, 0.0F, 4, 1, 1, 0.006F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.3547F, -1.1742F, 2.5405F);
        this.leftSpine.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0332F, 0.0871F, 0.7246F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 22, 39, -0.125F, 0.0F, -2.0F, 2, 1, 2, -0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.8305F, 0.925F, 0.5926F);
        this.leftSpine.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0027F, -0.5236F, 0.005F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 19, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.4736F, -0.2498F, 1.8392F);
        this.leftSpine.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0654F, 0.3491F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 32, 23, -1.0F, 0.5F, 0.0F, 2, 0, 3, 0.0F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-2.5F, -0.5F, -4.5075F);
        this.main.addChild(rightSpine);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.7096F, 0.425F, 2.4163F);
        this.rightSpine.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.2618F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 42, 34, -1.0F, -0.5F, -0.875F, 2, 1, 1, -0.006F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.1585F, 0.425F, 2.8045F);
        this.rightSpine.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.48F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 31, 42, 0.0F, -0.5F, -1.0F, 2, 1, 1, -0.003F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-4.1248F, 0.425F, 3.8692F);
        this.rightSpine.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 1.2654F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 42, 37, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.8305F, 0.425F, 0.5926F);
        this.rightSpine.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.9599F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 13, 34, -4.0F, -0.5F, 0.0F, 4, 1, 1, 0.006F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.3547F, -1.1742F, 2.5405F);
        this.rightSpine.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0332F, -0.0871F, -0.7246F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 39, -1.875F, 0.0F, -2.0F, 2, 1, 2, -0.003F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.8305F, 0.925F, 0.5926F);
        this.rightSpine.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0027F, 0.5236F, -0.005F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 32, 19, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.003F, true));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-0.4736F, -0.2498F, 1.8392F);
        this.rightSpine.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0654F, -0.3491F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 32, 23, -1.0F, 0.5F, 0.0F, 2, 0, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0051F, -0.2012F, -5.9322F);
        this.main.addChild(jaw);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0051F, 0.4216F, -1.7175F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1732F, 1.0406F, -0.1498F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 42, -1.9F, -1.0F, -0.05F, 2, 1, 1, -0.01F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.9949F, 0.4216F, -1.7175F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1732F, -1.0406F, 0.1498F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 42, -0.1F, -1.0F, -0.05F, 2, 1, 1, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.0051F, 0.7012F, 2.6247F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -1.5708F, -1.4835F, 1.5708F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 33, 34, -4.6F, -0.9F, -1.0F, 2, 1, 2, -0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 1.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 17, 14, -1.5F, -1.0F, 0.0F, 3, 2, 4, -0.003F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -1.4732F, 2.0338F);
        this.tail.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2182F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 14, 41, 0.0F, -1.275F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -1.0F, 4.0F);
        this.tail.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0873F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 31, -0.5F, -0.3F, -4.0F, 2, 2, 4, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 0.75F, 0.5F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0679F, -0.4968F, 0.553F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 9, 41, 0.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 0.75F, 0.5F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0679F, 0.4968F, -0.553F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 9, 41, -2.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 24, -1.0F, -0.7486F, -0.0654F, 2, 1, 5, 0.003F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, -0.7486F, 4.9346F);
        this.tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1178F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 32, 0, 0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.75F, 5.0F);
        this.tail2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0436F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 17, 21, -1.0F, -1.0F, -5.025F, 2, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail2.addChild(tail3);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -0.5F, 0.25F);
        this.tail3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2182F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 0, 0.5F, -0.2F, -0.25F, 0, 2, 7, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 32, 7, 0.0F, -0.2F, -0.25F, 1, 1, 5, 0.0F, false));
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
