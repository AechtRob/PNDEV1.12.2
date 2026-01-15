package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPucapampella extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;

    public ModelPucapampella() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.9811F, -2.7892F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 5, -2.0F, 0.0F, 0.0F, 4, 2, 2, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.3272F, -2.099F, -5.5843F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0077F, -0.1479F, -0.0129F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 44, 0.0F, -2.0F, 0.0F, 1, 2, 4, 0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.3272F, -2.099F, -5.5843F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2999F, -0.3228F, 0.0412F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 42, 0.0F, -1.025F, -2.95F, 1, 1, 3, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.525F, -3.3311F, -5.5392F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.4014F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 51, -0.8F, -0.5F, -0.675F, 1, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.525F, -3.3311F, -5.5392F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4014F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 51, -0.2F, -0.5F, -0.675F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.9811F, -2.7892F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0785F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 50, -2.0F, -1.95F, -3.625F, 3, 1, 1, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.3821F, -2.9469F, -8.3024F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4943F, -0.3008F, 0.0652F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 50, 0.0F, -1.05F, 0.175F, 0, 1, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.2356F, -1.6535F, -5.7475F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0562F, -0.1324F, -0.0636F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 17, 0.0F, -0.925F, 0.15F, 0, 1, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.3821F, -2.9469F, -8.3024F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4943F, 0.3008F, -0.0652F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 50, 0.0F, -1.05F, 0.175F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.3272F, -2.099F, -5.5843F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2999F, 0.3228F, -0.0412F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 42, -1.0F, -1.025F, -2.95F, 1, 1, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.3272F, -2.099F, -5.5843F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0077F, 0.1479F, 0.0129F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 44, -1.0F, -2.0F, 0.0F, 1, 2, 4, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.2F, -2.5599F, -6.6136F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2214F, -0.1704F, 0.0381F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 47, -0.3F, -0.6F, -1.2F, 0, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.2F, -2.5599F, -6.6136F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2214F, 0.1704F, -0.0381F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 47, 0.3F, -0.6F, -1.2F, 0, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -2.1123F, -5.3591F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0262F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 33, -1.0F, -1.0F, 0.0F, 4, 1, 2, 0.006F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -3.9232F, -7.9516F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.288F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 42, -1.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -4.4441F, -4.9971F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 0, -1.0F, 0.0F, -3.0F, 3, 1, 3, 0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.2356F, -1.6535F, -5.7475F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0562F, 0.1324F, 0.0636F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 17, 0.0F, -0.925F, 0.15F, 0, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -4.4441F, -4.9971F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0349F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 37, -1.0F, 0.0F, 0.0F, 4, 1, 3, -0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.822F, -1.4052F);
        this.main.addChild(jaw);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.4F, -0.3102F, -2.9247F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.9194F, -0.1488F, -0.0273F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 19, 30, 0.025F, -1.6505F, -0.6995F, 0, 3, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.4F, -0.3102F, -2.9247F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -1.9194F, 0.1488F, 0.0273F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 19, 30, -0.025F, -1.6505F, -0.6995F, 0, 3, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.3F, -0.4963F, -5.016F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2226F, -0.2527F, 0.0692F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 10, -0.375F, -0.575F, -1.675F, 0, 1, 5, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.3081F, 0.4878F, -4.2255F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2747F, -0.3242F, 0.0645F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 23, 0.025F, -1.0F, -2.95F, 1, 1, 3, -0.01F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.3F, -0.4963F, -5.016F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2226F, 0.2527F, -0.0692F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 10, 0.375F, -0.575F, -1.675F, 0, 1, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.5999F, -4.0907F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2836F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 41, -1.5F, -1.0F, -3.0F, 3, 1, 3, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(2.3081F, 0.4878F, -4.2255F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2747F, 0.3242F, -0.0645F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 46, 23, -1.025F, -1.0F, -2.95F, 1, 1, 3, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.75F, 0.3633F, -1.0585F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0881F, -0.1391F, 0.0122F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 37, 44, 0.025F, -0.6F, -3.175F, 1, 1, 4, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.75F, 0.3633F, -1.0585F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0881F, 0.1391F, -0.0122F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 37, 44, -1.025F, -0.6F, -3.175F, 1, 1, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.5F, 0.7744F, -0.0945F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 35, -0.5F, -0.8255F, -3.9962F, 4, 1, 4, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 40, 29, -1.0F, -1.8255F, -1.9962F, 5, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.2F, -2.5F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -3.0F, -1.375F, 0.0F, 6, 3, 6, -0.006F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 21, -2.5F, 1.375F, 0.0F, 5, 1, 6, -0.009F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.4444F, 1.8191F, 1.3587F);
        this.body.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0751F, -0.2118F, 0.6106F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 30, -0.1F, -0.175F, -0.15F, 5, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.4444F, 1.8191F, 1.3587F);
        this.body.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0751F, 0.2118F, -0.6106F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 30, -4.9F, -0.175F, -0.15F, 5, 0, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.035F, 4.484F);
        this.body.addChild(tail);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.5F, 2.0125F, 6.8785F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 21, -0.5F, -0.95F, -6.95F, 4, 1, 7, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, -1.29F, 0.016F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3709F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 47, 0.5F, -3.0F, 0.4F, 0, 3, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, -1.29F, 0.016F);
        this.tail.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0218F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -1.5F, 0.0F, 0.0F, 5, 3, 7, 0.003F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 2.2125F, 3.8785F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0361F, 0.3911F, -0.6473F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 48, 47, -3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 2.2125F, 3.8785F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0361F, -0.3911F, 0.6473F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 48, 47, 0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2559F, 6.4138F);
        this.tail.addChild(tail2);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.1804F, 3.2912F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.5236F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 5, 51, 0.0F, -0.125F, -0.4F, 0, 2, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 0.3772F, 7.4144F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1745F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 23, 29, -0.5F, -0.925F, -7.2F, 2, 1, 6, 0.008F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -1.3156F, 0.3338F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3752F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 51, 0.5F, -2.0F, -0.225F, 0, 2, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -1.3156F, 0.3338F);
        this.tail2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0175F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 25, 12, -1.5F, 0.0F, -0.225F, 3, 2, 6, 0.006F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.7141F, 5.4575F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 0.2837F, 8.1919F);
        this.tail3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1047F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 25, 0, 0.5F, -0.725F, -8.025F, 0, 3, 8, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.5766F, 0.1757F);
        this.tail3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0175F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 32, 37, -0.5F, 0.0F, 2.975F, 1, 1, 5, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 0.3709F, 3.1927F);
        this.tail3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3229F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 46, -1.5F, -1.0F, -3.025F, 2, 1, 3, -0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 0.3709F, 3.1927F);
        this.tail3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0175F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 45, 37, -1.5F, -1.0F, -3.025F, 2, 1, 3, 0.0F, false));

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
