package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBarrydalaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer leftSpine;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;

    public ModelBarrydalaspis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 36, 37, -1.5F, -2.5198F, -6.3838F, 3, 1, 1, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -1.9085F, -3.5889F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0899F, -0.2434F, 0.0217F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 37, 0.0F, -1.0F, -2.125F, 1, 2, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -1.9085F, -3.5889F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0899F, 0.2434F, -0.0217F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 37, -1.0F, -1.0F, -2.125F, 1, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.9578F, -6.9879F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 41, -2.1F, -0.7F, -0.2F, 1, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 41, 0.1F, -0.7F, -0.2F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.7198F, -7.2588F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 41, -0.8F, -0.3F, -0.1F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 41, 0.8F, -0.3F, -0.1F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.7198F, -7.2588F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 33, -1.5F, -0.8F, -0.3F, 3, 1, 2, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -2.8377F, -7.277F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 15, -0.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -3.8637F, -4.4579F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 28, -0.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -4.5477F, -2.5785F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 23, -0.5F, 0.0F, -2.0F, 4, 2, 2, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -4.8088F, -0.5957F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 18, -1.5F, 0.0F, 0.0F, 4, 2, 3, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -4.75F, -2.0F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 18, -1.5F, 0.125F, -0.6F, 4, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, 2.2F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -2.0F, -3.0F, -6.0F, 4, 3, 6, 0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.1431F, 1.7399F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, -0.7664F, 2.9201F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5149F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 40, 1.5F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -0.1504F, 4.8595F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1222F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 10, -0.5F, -0.375F, -5.0F, 3, 2, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.8931F, 0.2601F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0524F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 10, -1.5F, -1.8F, -0.3F, 3, 2, 5, -0.006F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.9619F, 2.0931F, 0.4514F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.3927F, 0.3927F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 38, 0.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.9619F, 2.0931F, 0.4514F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.3927F, -0.3927F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 38, -2.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5015F, 4.2624F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.9998F, -0.015F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0087F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 0, -0.5F, 0.0F, 0.0F, 2, 2, 4, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 1.352F, 0.5062F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6021F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 40, 1.0F, 0.0F, 0.2F, 0, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.0774F, 3.9954F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0654F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 28, -0.5F, -1.0F, -4.0F, 2, 1, 4, -0.006F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.241F, 3.3001F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.0699F, 0.5339F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4494F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 10, -0.5F, -0.825F, -0.025F, 1, 1, 3, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -1.7117F, 8.1813F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 18, 0.5F, -0.1F, -8.0F, 0, 3, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.6674F, 0.2497F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 13, 29, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.8902F, -1.1327F, -0.2438F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.21F, 0.6132F, 0.007F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 13, 24, -1.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.8902F, -1.1327F, -0.2438F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.21F, -0.6132F, -0.007F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 13, 24, -2.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(1.9856F, -1.3456F, -3.2015F);
        this.main.addChild(leftSpine);
        this.setRotateAngle(leftSpine, 0.0435F, -0.0038F, 0.0872F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.3858F, 0.0F, 2.3407F);
        this.leftSpine.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.5236F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 0, -2.0F, -0.5F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.382F, 0.0F, 2.4278F);
        this.leftSpine.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.0873F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 40, -1.0F, -0.5F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.9241F, 0.0F, 3.7053F);
        this.leftSpine.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.6545F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 8, -1.6F, 0.0F, -0.4F, 3, 0, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.2144F, 0.0F, 0.0016F);
        this.leftSpine.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.7418F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 21, 7, 0.0F, -0.5F, 0.0F, 6, 1, 1, 0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.609F, -2.3126F, 1.3408F);
        this.leftSpine.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1572F, 0.3614F, 0.4215F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 20, 37, -2.0F, 0.0F, -1.025F, 2, 1, 2, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0455F, -0.5F, 0.1859F);
        this.leftSpine.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3591F, 0.1624F, 1.164F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 11, 35, -2.0F, 0.0F, -0.125F, 2, 2, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.2144F, 0.0F, 0.0016F);
        this.leftSpine.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.2618F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 36, 4, -2.0F, -0.5F, 0.0F, 2, 1, 2, 0.006F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-1.9856F, -1.3456F, -3.2015F);
        this.main.addChild(rightSpine);
        this.setRotateAngle(rightSpine, 0.0435F, 0.0038F, -0.0872F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.3858F, 0.0F, 2.3407F);
        this.rightSpine.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.5236F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 0, -1.0F, -0.5F, -2.0F, 3, 1, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.382F, 0.0F, 2.4278F);
        this.rightSpine.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0873F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 36, 40, 0.0F, -0.5F, -1.0F, 1, 1, 1, -0.003F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-3.9241F, 0.0F, 3.7053F);
        this.rightSpine.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.6545F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 36, 8, -1.4F, 0.0F, -0.4F, 3, 0, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.2144F, 0.0F, 0.0016F);
        this.rightSpine.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.7418F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 21, 7, -6.0F, -0.5F, 0.0F, 6, 1, 1, 0.003F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.609F, -2.3126F, 1.3408F);
        this.rightSpine.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1572F, -0.3614F, -0.4215F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 20, 37, 0.0F, 0.0F, -1.025F, 2, 1, 2, -0.003F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0455F, -0.5F, 0.1859F);
        this.rightSpine.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3591F, -0.1624F, -1.164F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 11, 35, 0.0F, 0.0F, -0.125F, 2, 2, 2, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.2144F, 0.0F, 0.0016F);
        this.rightSpine.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.2618F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 36, 4, 0.0F, -0.5F, 0.0F, 2, 1, 2, 0.006F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.3866F, -4.0685F);
        this.main.addChild(jaw);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.75F, -0.1883F, -2.8717F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4363F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 24, 29, 0.0F, -0.6F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 24, 29, 1.5F, -0.6F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 0.7981F, -1.6564F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2182F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 35, 33, -0.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.8008F, -0.5917F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 1.6581F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 1, 35, -1.5F, -0.75F, -0.525F, 3, 1, 1, -0.003F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0F, 0.3F, -1.7F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 34, -0.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 8.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);



            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
//                this.main.offsetX = 0.40F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
