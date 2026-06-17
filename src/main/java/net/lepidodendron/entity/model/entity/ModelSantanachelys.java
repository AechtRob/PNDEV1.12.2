package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSantanachelys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSantanachelys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer frontRightflipper1;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer frontRightflipper2;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer frontRightflipper3;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer frontLeftflipper1;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer frontLeftflipper2;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer frontLeftflipper3;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer backRightflipper1;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer backRightflipper2;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer backRightflipper3;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer backLeftflipper1;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer backLeftflipper2;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer backLeftflipper3;
    private final AdvancedModelRenderer cube_r65;

    private ModelAnimator animator;

    public ModelSantanachelys() {
        this.textureWidth = 68;
        this.textureHeight = 65;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(2.225F, 23.5F, -7.725F);
        this.main.cubeList.add(new ModelBox(main, 29, 18, -4.225F, -3.5048F, 4.4394F, 4, 1, 6, 0.02F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -5.725F, -1.9548F, 2.5394F, 7, 3, 14, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.7905F, -1.8F, 0.341F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, -1.5272F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 59, -0.775F, -0.525F, -1.075F, 2, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.725F, 1.0452F, 9.5394F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.6589F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, -3.0F, -2.0F, -6.0F, 3, 2, 11, 0.02F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.4574F, -1.6484F, 19.7274F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0571F, -0.6573F, -0.0494F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 56, -1.425F, -0.075F, -2.0F, 3, 1, 2, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-5.6753F, -1.3F, 16.7972F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, -0.6981F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 51, -1.5F, -0.5F, -1.5F, 3, 1, 3, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-6.8061F, -1.3666F, 14.758F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, -1.0472F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 41, -1.5F, -0.5F, -1.0F, 3, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-7.5687F, -1.3661F, 12.5754F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.3657F, -0.096F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 23, -1.5F, -0.5F, -1.0F, 3, 1, 3, 0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-9.8F, -0.675F, 6.525F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.096F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 34, 0.0032F, -1.0F, -0.0078F, 3, 1, 5, 0.02F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-8.2335F, -1.2031F, 5.722F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0218F, -0.1309F, -0.096F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 37, -1.5F, -0.6F, -1.0F, 3, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-7.8147F, -1.3F, 4.3987F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0029F, -0.515F, -0.1003F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 55, 33, -1.5F, -0.5F, -1.0F, 3, 1, 2, 0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-6.5019F, -1.525F, 3.1624F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0084F, -0.9733F, -0.1321F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 28, -1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-4.4993F, -1.775F, 1.8021F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -1.0036F, -0.1047F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 55, -1.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.7093F, -1.8F, 0.7357F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.071F, -1.1639F, -0.0772F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 13, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.7905F, -1.8F, 0.341F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6208F, -1.4957F, -0.6195F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 60, -0.775F, -0.525F, -0.125F, 2, 1, 1, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.725F, -2.9747F, 15.387F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3052F, -0.1226F, -0.3555F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 46, -3.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-4.225F, -3.5048F, 10.4394F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0922F, -0.0368F, -0.4349F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 34, -4.0F, 0.0F, 0.0F, 4, 1, 5, 0.02F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-4.225F, -3.5048F, 4.4394F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2862F, 0.1407F, -0.4513F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 41, -4.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-4.225F, -3.5048F, 10.4394F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.4363F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 26, -4.0F, 0.0F, -6.0F, 4, 1, 6, 0.02F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.6595F, -1.8F, 0.341F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.6208F, 1.4957F, 0.6195F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 60, -1.225F, -0.525F, -0.125F, 2, 1, 1, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.7407F, -1.8F, 0.7357F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.071F, 1.1639F, 0.0772F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 58, 13, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0493F, -1.775F, 1.8021F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 1.0036F, 0.1047F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 55, -1.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.0519F, -1.525F, 3.1624F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0084F, 0.9733F, 0.1321F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 28, -1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(3.3647F, -1.3F, 4.3987F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0029F, 0.515F, 0.1003F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 33, -1.5F, -0.5F, -1.0F, 3, 1, 2, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.7835F, -1.2031F, 5.722F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0218F, 0.1309F, 0.096F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 55, 37, -1.5F, -0.6F, -1.0F, 3, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(5.35F, -0.675F, 6.525F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.096F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 34, -3.0032F, -1.0F, -0.0078F, 3, 1, 5, 0.02F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.1187F, -1.3661F, 12.5754F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 1.3657F, 0.096F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 50, 23, -1.5F, -0.5F, -1.0F, 3, 1, 3, 0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.3561F, -1.3666F, 14.758F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0873F, 1.0472F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 49, 41, -1.5F, -0.5F, -1.0F, 3, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.2253F, -1.3F, 16.7972F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0873F, 0.6981F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 51, -1.5F, -0.5F, -1.5F, 3, 1, 3, 0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0074F, -1.6484F, 19.7274F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0571F, 0.6573F, 0.0494F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 22, 56, -1.575F, -0.075F, -2.0F, 3, 1, 2, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.225F, -1.3F, 19.85F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0175F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 52, -1.0F, -0.625F, -2.0F, 2, 1, 3, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.725F, -2.9747F, 15.387F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3052F, 0.1226F, 0.3555F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 32, 46, 0.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.725F, -3.069F, 15.4204F);
        this.main.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3403F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 43, 7, -2.0F, 0.0F, 0.0F, 3, 1, 4, 0.02F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.225F, -3.5048F, 10.4394F);
        this.main.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0921F, 0.0372F, 0.4392F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 19, 34, 0.0F, 0.0F, 0.0F, 4, 1, 5, 0.02F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.225F, -3.5048F, 10.4394F);
        this.main.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0873F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 32, -2.0F, 0.0F, 0.0F, 4, 1, 5, 0.02F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.225F, -3.5048F, 10.4394F);
        this.main.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.4363F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 29, 26, 0.0F, 0.0F, -6.0F, 4, 1, 6, 0.02F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.725F, 1.0452F, 2.5394F);
        this.main.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1309F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 47, 46, -2.5F, -3.0F, -2.0F, 4, 3, 2, 0.02F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.275F, 1.0452F, 9.5394F);
        this.main.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.6589F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 18, 0.0F, -2.0F, -6.0F, 3, 2, 11, 0.02F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.225F, 0.2079F, 18.3557F);
        this.main.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.4756F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 57, -1.5F, -1.15F, 0.0F, 3, 1, 2, 0.02F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.725F, 1.0452F, 16.5394F);
        this.main.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.432F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 50, 18, -2.5F, -2.0F, 0.0F, 4, 2, 2, 0.02F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.225F, -3.5048F, 4.4394F);
        this.main.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2862F, -0.1407F, 0.4513F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 32, 41, 0.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-2.225F, -3.5048F, 4.4394F);
        this.main.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3142F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 39, -2.0F, 0.0F, -4.0F, 4, 1, 4, 0.02F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-2.225F, -0.4116F, 0.4643F);
        this.main.addChild(neck);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 0.2116F, -0.4643F);
        this.neck.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0742F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 45, -2.0F, -2.0F, -2.0F, 3, 3, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2794F, -2.213F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 43, 0, -2.0F, -1.609F, -3.0013F, 4, 3, 3, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 58, 0, -0.5F, -0.709F, -5.5013F, 1, 2, 2, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 60, 46, -1.0F, 0.341F, -3.5013F, 2, 1, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.8346F, -1.0583F, -4.5844F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.48F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 33, 57, -0.225F, 0.35F, -0.975F, 1, 2, 3, -0.03F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.8346F, -1.0583F, -4.5844F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.5885F, -0.4909F, -0.0082F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 61, -0.225F, -0.15F, -0.9F, 1, 1, 1, -0.03F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-2.0F, -1.559F, -2.9513F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1845F, -0.4928F, -0.0027F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 58, 5, 0.025F, -0.025F, -2.05F, 1, 1, 2, -0.03F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.8346F, -1.0583F, -4.5844F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.48F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 33, 57, -0.775F, 0.35F, -0.975F, 1, 2, 3, -0.03F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.8346F, -1.0583F, -4.5844F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.5885F, 0.4909F, 0.0082F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 61, -0.775F, -0.15F, -0.9F, 1, 1, 1, -0.03F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(2.0F, -1.559F, -2.9513F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1845F, 0.4928F, 0.0027F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 58, 5, -1.025F, -0.025F, -2.05F, 1, 1, 2, -0.03F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -1.1657F, -4.726F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.6109F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 5, 61, -0.5F, -0.075F, -0.975F, 1, 1, 1, -0.03F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -1.109F, -3.7513F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1745F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 51, 57, -1.0F, -0.3F, -1.0F, 2, 1, 2, -0.03F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.9138F, -0.209F, -3.9103F);
        this.head.addChild(eyeleft);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5273F, 3.2F, -1.261F);
        this.eyeleft.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.48F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 51, 61, -1.55F, -3.7F, 0.375F, 1, 1, 1, 0.05F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.9138F, -0.209F, -3.9103F);
        this.head.addChild(eyeright);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.5273F, 3.2F, -1.261F);
        this.eyeright.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, -0.48F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 51, 61, 0.55F, -3.7F, 0.375F, 1, 1, 1, 0.05F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.2083F, 1.3917F, -0.6175F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 13, -2.2083F, -0.475F, -2.3919F, 4, 1, 3, -0.03F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 58, 9, -0.7083F, -0.525F, -4.8669F, 1, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 25, 60, -1.2083F, -0.5F, -3.3669F, 2, 1, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.0429F, -2.45F, -3.9669F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.48F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 42, 57, -0.175F, 1.95F, -0.975F, 1, 1, 3, -0.04F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.6263F, -2.45F, -3.9669F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.48F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 42, 57, -0.825F, 1.95F, -0.975F, 1, 1, 3, -0.04F, false));

        this.frontRightflipper1 = new AdvancedModelRenderer(this);
        this.frontRightflipper1.setRotationPoint(-4.0F, 0.0F, 2.4F);
        this.main.addChild(frontRightflipper1);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.2607F, -1.0F, -0.1302F);
        this.frontRightflipper1.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.1309F, 1.0908F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 17, 41, -1.0F, -0.25F, -4.5F, 2, 2, 5, 0.0F, true));

        this.frontRightflipper2 = new AdvancedModelRenderer(this);
        this.frontRightflipper2.setRotationPoint(-3.6607F, 0.4F, -2.9302F);
        this.frontRightflipper1.addChild(frontRightflipper2);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5864F, -1.0605F, 0.7248F);
        this.frontRightflipper2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 2.9685F, 1.2133F, 2.863F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 50, 52, -1.35F, 0.75F, -2.3F, 2, 1, 3, -0.02F, true));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 39, 52, -1.35F, 0.25F, -2.3F, 2, 1, 3, 0.0F, true));

        this.frontRightflipper3 = new AdvancedModelRenderer(this);
        this.frontRightflipper3.setRotationPoint(-2.6F, 0.2F, 1.2F);
        this.frontRightflipper2.addChild(frontRightflipper3);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0108F, -0.8435F, 0.6606F);
        this.frontRightflipper3.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 3.0221F, 1.0406F, 2.9222F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 13, 49, -1.0F, 0.25F, -3.7F, 2, 1, 4, 0.0F, true));

        this.frontLeftflipper1 = new AdvancedModelRenderer(this);
        this.frontLeftflipper1.setRotationPoint(-0.45F, 0.0F, 2.4F);
        this.main.addChild(frontLeftflipper1);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.2607F, -1.0F, -0.1302F);
        this.frontLeftflipper1.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.1309F, -1.0908F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 17, 41, -1.0F, -0.25F, -4.5F, 2, 2, 5, 0.0F, false));

        this.frontLeftflipper2 = new AdvancedModelRenderer(this);
        this.frontLeftflipper2.setRotationPoint(3.6607F, 0.4F, -2.9302F);
        this.frontLeftflipper1.addChild(frontLeftflipper2);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5864F, -1.0605F, 0.7248F);
        this.frontLeftflipper2.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 2.9685F, -1.2133F, -2.863F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 50, 52, -0.65F, 0.75F, -2.3F, 2, 1, 3, -0.02F, false));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 39, 52, -0.65F, 0.25F, -2.3F, 2, 1, 3, 0.0F, false));

        this.frontLeftflipper3 = new AdvancedModelRenderer(this);
        this.frontLeftflipper3.setRotationPoint(2.6F, 0.2F, 1.2F);
        this.frontLeftflipper2.addChild(frontLeftflipper3);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.0108F, -0.8435F, 0.6606F);
        this.frontLeftflipper3.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 3.0221F, -1.0406F, -2.9222F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 13, 49, -1.0F, 0.25F, -3.7F, 2, 1, 4, 0.0F, false));

        this.backRightflipper1 = new AdvancedModelRenderer(this);
        this.backRightflipper1.setRotationPoint(-5.5821F, -0.3264F, 14.7984F);
        this.main.addChild(backRightflipper1);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.6596F, -0.1736F, -0.1215F);
        this.backRightflipper1.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.0401F, 0.2234F, -0.179F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 60, 60, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.02F, true));

        this.backRightflipper2 = new AdvancedModelRenderer(this);
        this.backRightflipper2.setRotationPoint(-1.2347F, -0.0093F, -0.0281F);
        this.backRightflipper1.addChild(backRightflipper2);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.318F, -0.6643F, 0.1645F);
        this.backRightflipper2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.0864F, 0.455F, -0.1945F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 60, 49, -2.3F, 0.25F, -0.475F, 2, 1, 1, 0.0F, true));

        this.backRightflipper3 = new AdvancedModelRenderer(this);
        this.backRightflipper3.setRotationPoint(-1.5878F, 0.3607F, 0.7281F);
        this.backRightflipper2.addChild(backRightflipper3);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.298F, -1.025F, 0.563F);
        this.backRightflipper3.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.106F, 0.5405F, -0.2039F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 60, 57, -1.825F, 0.7F, -0.475F, 2, 1, 1, 0.04F, true));

        this.backLeftflipper1 = new AdvancedModelRenderer(this);
        this.backLeftflipper1.setRotationPoint(1.1321F, -0.3264F, 14.7984F);
        this.main.addChild(backLeftflipper1);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.6596F, -0.1736F, -0.1215F);
        this.backLeftflipper1.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.0401F, -0.2234F, 0.179F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 60, 60, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.02F, false));

        this.backLeftflipper2 = new AdvancedModelRenderer(this);
        this.backLeftflipper2.setRotationPoint(1.2347F, -0.0093F, -0.0281F);
        this.backLeftflipper1.addChild(backLeftflipper2);


        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.318F, -0.6643F, 0.1645F);
        this.backLeftflipper2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.0864F, -0.455F, 0.1945F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 60, 49, 0.3F, 0.25F, -0.475F, 2, 1, 1, 0.0F, false));

        this.backLeftflipper3 = new AdvancedModelRenderer(this);
        this.backLeftflipper3.setRotationPoint(1.5878F, 0.3607F, 0.7281F);
        this.backLeftflipper2.addChild(backLeftflipper3);


        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.298F, -1.025F, 0.563F);
        this.backLeftflipper3.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.106F, -0.5405F, 0.2039F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 60, 57, -0.175F, 0.7F, -0.475F, 2, 1, 1, 0.04F, false));
        

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
        this.main.offsetY = -0.4F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.5F;
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

        EntityPrehistoricFloraSantanachelys entitySantanachelys = (EntityPrehistoricFloraSantanachelys) e;

        if (entitySantanachelys.getAnimation() == entitySantanachelys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (entitySantanachelys.getAnimation() == entitySantanachelys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entitySantanachelys.isReallyInWater()) {

                if (f3 == 0.0F || !entitySantanachelys.getIsMoving()) {
                    if (entitySantanachelys.getAnimation() != entitySantanachelys.EAT_ANIMATION
                        && entitySantanachelys.getAnimation() != entitySantanachelys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }
                    return;
                }

                if (entitySantanachelys.getIsFast()) { //Running


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
    public void setLivingAnimations(EntityLivingBase entitylivingmainIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingmainIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraSantanachelys ee = (EntityPrehistoricFloraSantanachelys) entitylivingmainIn;

        if (ee.isReallyInWater()) {
            animSwimming(entitylivingmainIn, limbSwing, limbSwingAmount, partialTickTime);

        } else if (ee.getIsMoving()) {
            animWalking(entitylivingmainIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingmainIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingmainIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingmainIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSantanachelys entity = (EntityPrehistoricFloraSantanachelys) entitylivingmainIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*-5 + (((tickAnim - 0) / 10) * (48.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*-50-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*-5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 48.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*-50 + (((tickAnim - 10) / 15) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*-5-(48.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*-50)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightflipper1, backRightflipper1.rotateAngleX + (float) Math.toRadians(xx), backRightflipper1.rotateAngleY + (float) Math.toRadians(yy), backRightflipper1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(backRightflipper2, backRightflipper2.rotateAngleX + (float) Math.toRadians(0), backRightflipper2.rotateAngleY + (float) Math.toRadians(-5.275-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*10), backRightflipper2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backRightflipper3, backRightflipper3.rotateAngleX + (float) Math.toRadians(0), backRightflipper3.rotateAngleY + (float) Math.toRadians(0), backRightflipper3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*5 + (((tickAnim - 0) / 10) * (-42.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*50-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = -42.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*50 + (((tickAnim - 10) / 15) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*5-(-42.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5))*50)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftflipper1, backLeftflipper1.rotateAngleX + (float) Math.toRadians(xx), backLeftflipper1.rotateAngleY + (float) Math.toRadians(yy), backLeftflipper1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(backLeftflipper2, backLeftflipper2.rotateAngleX + (float) Math.toRadians(0), backLeftflipper2.rotateAngleY + (float) Math.toRadians(-5.275-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*10), backLeftflipper2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backLeftflipper3, backLeftflipper3.rotateAngleX + (float) Math.toRadians(0), backLeftflipper3.rotateAngleY + (float) Math.toRadians(0), backLeftflipper3.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animEat(EntityLivingBase entitylivingmainIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSantanachelys entity = (EntityPrehistoricFloraSantanachelys) entitylivingmainIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150)) + (((tickAnim - 0) / 10) * (-5.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150)))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*5 + (((tickAnim - 10) / 10) * (0-(-5.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.875-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.25 + (((tickAnim - 5) / 5) * (2-(8.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -2.875 + (((tickAnim - 5) / 5) * (-5.75-(-2.875)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 2 + (((tickAnim - 10) / 5) * (0-(2)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -5.75 + (((tickAnim - 10) / 5) * (0-(-5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 5) / 5) * (0.1525-(1)));
            zz = 1 + (((tickAnim - 5) / 5) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 10) / 5) * (1-(1)));
            yy = 0.1525 + (((tickAnim - 10) / 5) * (0.1525-(0.1525)));
            zz = 1 + (((tickAnim - 10) / 5) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 15) / 5) * (1-(1)));
            yy = 0.1525 + (((tickAnim - 15) / 5) * (1-(0.1525)));
            zz = 1 + (((tickAnim - 15) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 5) / 5) * (0.1525-(1)));
            zz = 1 + (((tickAnim - 5) / 5) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 10) / 5) * (1-(1)));
            yy = 0.1525 + (((tickAnim - 10) / 5) * (0.1525-(0.1525)));
            zz = 1 + (((tickAnim - 10) / 5) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 15) / 5) * (1-(1)));
            yy = 0.1525 + (((tickAnim - 15) / 5) * (1-(0.1525)));
            zz = 1 + (((tickAnim - 15) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (29.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 29.5 + (((tickAnim - 10) / 5) * (0-(29.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwimming(EntityLivingBase entitylivingmainIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSantanachelys entity = (EntityPrehistoricFloraSantanachelys) entitylivingmainIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*3.8), main.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+92))*-1), main.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*1.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*0.79);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*-3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+180))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontRightflipper1, frontRightflipper1.rotateAngleX + (float) Math.toRadians(0.1551+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*20), frontRightflipper1.rotateAngleY + (float) Math.toRadians(6.1906+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*40), frontRightflipper1.rotateAngleZ + (float) Math.toRadians(-12.1117-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*30));


        this.setRotateAngle(frontRightflipper2, frontRightflipper2.rotateAngleX + (float) Math.toRadians(-2.7114+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*20), frontRightflipper2.rotateAngleY + (float) Math.toRadians(-16.8714+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*30), frontRightflipper2.rotateAngleZ + (float) Math.toRadians(20.0132-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*30));


        this.setRotateAngle(frontRightflipper3, frontRightflipper3.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*20), frontRightflipper3.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*-20), frontRightflipper3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-20));


        this.setRotateAngle(frontLeftflipper1, frontLeftflipper1.rotateAngleX + (float) Math.toRadians(0.1551+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*20), frontLeftflipper1.rotateAngleY + (float) Math.toRadians(-6.1906+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-40), frontLeftflipper1.rotateAngleZ + (float) Math.toRadians(12.1117-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-30));


        this.setRotateAngle(frontLeftflipper2, frontLeftflipper2.rotateAngleX + (float) Math.toRadians(-1.9419+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*20), frontLeftflipper2.rotateAngleY + (float) Math.toRadians(16.8714+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-30), frontLeftflipper2.rotateAngleZ + (float) Math.toRadians(-19.0619-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-30));


        this.setRotateAngle(frontLeftflipper3, frontLeftflipper3.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*20), frontLeftflipper3.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*20), frontLeftflipper3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*20));


        this.setRotateAngle(backRightflipper1, backRightflipper1.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-5), backRightflipper1.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-5), backRightflipper1.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-5));


        this.setRotateAngle(backLeftflipper1, backLeftflipper1.rotateAngleX + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-5), backLeftflipper1.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*5), backLeftflipper1.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*5));

    }
    public void animWalking(EntityLivingBase entitylivingmainIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSantanachelys entity = (EntityPrehistoricFloraSantanachelys) entitylivingmainIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -3.75 + (((tickAnim - 0) / 19) * (-9.25-(-3.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -9.25 + (((tickAnim - 19) / 5) * (2.35-(-9.25)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 2.35 + (((tickAnim - 24) / 2) * (3.55-(2.35)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 3.55 + (((tickAnim - 26) / 6) * (1-(3.55)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 32) / 8) * (-3.75-(1)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0.825 + (((tickAnim - 0) / 19) * (2.155-(0.825)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.925-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 2.155 + (((tickAnim - 19) / 5) * (0.295-(2.155)));
            zz = -0.925 + (((tickAnim - 19) / 5) * (-0.73-(-0.925)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = 0.295 + (((tickAnim - 24) / 8) * (0.325-(0.295)));
            zz = -0.73 + (((tickAnim - 24) / 8) * (-0.425-(-0.73)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0.325 + (((tickAnim - 32) / 8) * (0.825-(0.325)));
            zz = -0.425 + (((tickAnim - 32) / 8) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 6.75 + (((tickAnim - 0) / 19) * (14.75-(6.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 14.75 + (((tickAnim - 19) / 5) * (-7.1-(14.75)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -7.1 + (((tickAnim - 24) / 8) * (-8-(-7.1)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -8 + (((tickAnim - 32) / 8) * (6.75-(-8)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 8.25 + (((tickAnim - 19) / 5) * (4.75-(8.25)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 4.75 + (((tickAnim - 24) / 16) * (0-(4.75)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (44.25-(0)));
            zz = -6.25 + (((tickAnim - 0) / 19) * (-6.25-(-6.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 19) / 13) * (-8.5494-(0)));
            yy = 44.25 + (((tickAnim - 19) / 13) * (36.6993-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(44.25)));
            zz = -6.25 + (((tickAnim - 19) / 13) * (2.6656-(-6.25)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -8.5494 + (((tickAnim - 32) / 8) * (0-(-8.5494)));
            yy = 36.6993-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 32) / 8) * (0-(36.6993-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            zz = 2.6656 + (((tickAnim - 32) / 8) * (-6.25-(2.6656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightflipper1, frontRightflipper1.rotateAngleX + (float) Math.toRadians(xx), frontRightflipper1.rotateAngleY + (float) Math.toRadians(yy), frontRightflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -2.1198 + (((tickAnim - 0) / 19) * (5.3878-(-2.1198)));
            yy = -34.9968 + (((tickAnim - 0) / 19) * (-34.6888-(-34.9968)));
            zz = 8.9733 + (((tickAnim - 0) / 19) * (-4.1291-(8.9733)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 5.3878 + (((tickAnim - 19) / 5) * (3.528-(5.3878)));
            yy = -34.6888 + (((tickAnim - 19) / 5) * (-6.066-(-34.6888)));
            zz = -4.1291 + (((tickAnim - 19) / 5) * (-8.8496-(-4.1291)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 3.528 + (((tickAnim - 24) / 8) * (-0.5958-(3.528)));
            yy = -6.066 + (((tickAnim - 24) / 8) * (-41.8782-(-6.066)));
            zz = -8.8496 + (((tickAnim - 24) / 8) * (5.9379-(-8.8496)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -0.5958 + (((tickAnim - 32) / 8) * (-2.1198-(-0.5958)));
            yy = -41.8782 + (((tickAnim - 32) / 8) * (-34.9968-(-41.8782)));
            zz = 5.9379 + (((tickAnim - 32) / 8) * (8.9733-(5.9379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightflipper2, frontRightflipper2.rotateAngleX + (float) Math.toRadians(xx), frontRightflipper2.rotateAngleY + (float) Math.toRadians(yy), frontRightflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (15-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 19) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 13) * (0-(0)));
            zz = 15 + (((tickAnim - 19) / 13) * (11.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*30-(15)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 11.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*30 + (((tickAnim - 32) / 8) * (0-(11.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightflipper3, frontRightflipper3.rotateAngleX + (float) Math.toRadians(xx), frontRightflipper3.rotateAngleY + (float) Math.toRadians(yy), frontRightflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-44.25-(0)));
            zz = 6.25 + (((tickAnim - 0) / 19) * (6.25-(6.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 19) / 13) * (-8.5494-(0)));
            yy = -44.25 + (((tickAnim - 19) / 13) * (-39.6743-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(-44.25)));
            zz = 6.25 + (((tickAnim - 19) / 13) * (-2.6656-(6.25)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -8.5494 + (((tickAnim - 32) / 8) * (0-(-8.5494)));
            yy = -39.6743-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 32) / 8) * (0-(-39.6743-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            zz = -2.6656 + (((tickAnim - 32) / 8) * (6.25-(-2.6656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftflipper1, frontLeftflipper1.rotateAngleX + (float) Math.toRadians(xx), frontLeftflipper1.rotateAngleY + (float) Math.toRadians(yy), frontLeftflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -2.1198 + (((tickAnim - 0) / 19) * (5.3878-(-2.1198)));
            yy = 34.9968 + (((tickAnim - 0) / 19) * (34.6888-(34.9968)));
            zz = -8.9733 + (((tickAnim - 0) / 19) * (4.1291-(-8.9733)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 5.3878 + (((tickAnim - 19) / 5) * (3.528-(5.3878)));
            yy = 34.6888 + (((tickAnim - 19) / 5) * (6.066-(34.6888)));
            zz = 4.1291 + (((tickAnim - 19) / 5) * (8.8496-(4.1291)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 3.528 + (((tickAnim - 24) / 8) * (-0.5958-(3.528)));
            yy = 6.066 + (((tickAnim - 24) / 8) * (15.2532-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(6.066)));
            zz = 8.8496 + (((tickAnim - 24) / 8) * (-5.9379-(8.8496)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -0.5958 + (((tickAnim - 32) / 8) * (-2.1198-(-0.5958)));
            yy = 15.2532-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 32) / 8) * (34.9968-(15.2532-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            zz = -5.9379 + (((tickAnim - 32) / 8) * (-8.9733-(-5.9379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftflipper2, frontLeftflipper2.rotateAngleX + (float) Math.toRadians(xx), frontLeftflipper2.rotateAngleY + (float) Math.toRadians(yy), frontLeftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-15-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = -15 + (((tickAnim - 19) / 6) * (-14.83-(-15)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = -14.83 + (((tickAnim - 25) / 7) * (7.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*30-(-14.83)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 7.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*30 + (((tickAnim - 32) / 8) * (0-(7.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftflipper3, frontLeftflipper3.rotateAngleX + (float) Math.toRadians(xx), frontLeftflipper3.rotateAngleY + (float) Math.toRadians(yy), frontLeftflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 7.9757 + (((tickAnim - 0) / 19) * (10.4335-(7.9757)));
            yy = 0.6257 + (((tickAnim - 0) / 19) * (16.4883-(0.6257)));
            zz = 3.0437 + (((tickAnim - 0) / 19) * (8.992-(3.0437)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 10.4335 + (((tickAnim - 19) / 5) * (7.4246-(10.4335)));
            yy = 16.4883 + (((tickAnim - 19) / 5) * (2.9886-(16.4883)));
            zz = 8.992 + (((tickAnim - 19) / 5) * (-14.306-(8.992)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 7.4246 + (((tickAnim - 24) / 2) * (7.0958-(7.4246)));
            yy = 2.9886 + (((tickAnim - 24) / 2) * (3.6291-(2.9886)));
            zz = -14.306 + (((tickAnim - 24) / 2) * (-19.4339-(-14.306)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 7.0958 + (((tickAnim - 26) / 14) * (7.9757-(7.0958)));
            yy = 3.6291 + (((tickAnim - 26) / 14) * (0.6257-(3.6291)));
            zz = -19.4339 + (((tickAnim - 26) / 14) * (3.0437-(-19.4339)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightflipper1, backRightflipper1.rotateAngleX + (float) Math.toRadians(xx), backRightflipper1.rotateAngleY + (float) Math.toRadians(yy), backRightflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 7.9757 + (((tickAnim - 0) / 19) * (10.4335-(7.9757)));
            yy = -0.6257 + (((tickAnim - 0) / 19) * (-16.4883-(-0.6257)));
            zz = -3.0437 + (((tickAnim - 0) / 19) * (-8.992-(-3.0437)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 10.4335 + (((tickAnim - 19) / 5) * (7.4246-(10.4335)));
            yy = -16.4883 + (((tickAnim - 19) / 5) * (-2.9886-(-16.4883)));
            zz = -8.992 + (((tickAnim - 19) / 5) * (14.306-(-8.992)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 7.4246 + (((tickAnim - 24) / 2) * (7.0799-(7.4246)));
            yy = -2.9886 + (((tickAnim - 24) / 2) * (-3.6598-(-2.9886)));
            zz = 14.306 + (((tickAnim - 24) / 2) * (19.6825-(14.306)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 7.0799 + (((tickAnim - 26) / 14) * (7.9757-(7.0799)));
            yy = -3.6598 + (((tickAnim - 26) / 14) * (-0.6257-(-3.6598)));
            zz = 19.6825 + (((tickAnim - 26) / 14) * (-3.0437-(19.6825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftflipper1, backLeftflipper1.rotateAngleX + (float) Math.toRadians(xx), backLeftflipper1.rotateAngleY + (float) Math.toRadians(yy), backLeftflipper1.rotateAngleZ + (float) Math.toRadians(zz));
    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSantanachelys e = (EntityPrehistoricFloraSantanachelys) entity;
        animator.update(entity);


    }
}
