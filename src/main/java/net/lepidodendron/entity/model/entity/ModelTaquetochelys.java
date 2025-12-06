package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTaquetochelys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTaquetochelys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer frontRightleg3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer frontLeftleg3;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer backLeftleg3;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer backRightleg3;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelTaquetochelys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.45F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 12, -2.5F, -2.1F, -3.85F, 5, 2, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 6, -3.0F, 0.35F, -4.0F, 6, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.35F, -4.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 11, -0.5F, -1.0F, -4.5F, 1, 1, 2, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 29, -1.0F, -1.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 5, -2.0F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.775F, 4.25F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -4.0F, -1.0F, -4.0F, 7, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.35F, 1.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 0, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(6.775F, -0.15F, 2.7F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.5411F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 19, -4.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(6.975F, -0.15F, 0.7F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0873F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 8, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(6.225F, -0.15F, -2.2F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2618F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 12, -3.0F, -1.0F, -2.0F, 3, 1, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, -2.1F, 1.15F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3229F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 18, 0.0F, 0.0F, -5.0F, 3, 1, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.5F, -2.1F, -3.85F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3665F, 0.0F, 0.3229F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 36, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.625F, -0.15F, -3.85F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.5672F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 33, -0.9254F, -1.0F, -1.6868F, 2, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(4.625F, -0.075F, -3.8F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1134F, 0.3054F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 26, -3.599F, -1.0F, -3.9658F, 2, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.0F, 1.35F, -2.0F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.2182F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 24, 0.0F, -2.0F, -2.0F, 2, 2, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.0F, 1.35F, -2.0F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 24, -2.0F, -2.0F, -2.0F, 2, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.1F, 1.15F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.144F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 19, -2.5F, 0.0F, 0.0F, 5, 1, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.525F, -6.4F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1222F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 50, -0.5F, 0.0F, 0.0342F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-4.625F, -0.075F, -3.8F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1134F, -0.3054F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 26, 1.599F, -1.0F, -3.9658F, 2, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(4.625F, -0.075F, -3.8F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1091F, -0.4363F, 0.0829F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 15, -3.8643F, -1.0F, -1.8392F, 3, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-4.625F, -0.075F, -3.8F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1091F, 0.4363F, -0.0829F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 15, 0.8643F, -1.0F, -1.8392F, 3, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.625F, -0.15F, -3.85F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, -0.5672F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 33, -1.0746F, -1.0F, -1.6868F, 2, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-6.225F, -0.15F, -2.2F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.2618F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 12, 0.0F, -1.0F, -2.0F, 3, 1, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-6.975F, -0.15F, 0.7F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0873F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 8, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-6.775F, -0.15F, 2.7F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.5411F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 19, 0.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(5.75F, -0.15F, 4.4F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0486F, -0.8072F, -0.0009F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 25, -4.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.825F, -0.35F, 7.175F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1694F, -1.1459F, -0.0942F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 40, 46, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-5.75F, -0.15F, 4.4F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0486F, 0.8072F, 0.0009F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 25, 0.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.825F, -0.35F, 7.175F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1694F, 1.1459F, 0.0942F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 40, 46, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, -0.425F, 6.0F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0524F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 48, 8, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -2.1F, -3.85F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3054F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 14, 31, -2.5F, 0.0F, -3.0F, 5, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(2.5F, -2.1F, 1.15F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1484F, 0.0131F, 0.3316F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 22, 6, 0.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.5F, -2.1F, 1.15F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1484F, -0.0131F, -0.3316F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 6, -3.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.5F, -2.1F, -3.85F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3665F, 0.0F, -0.3229F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 36, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.5F, -2.1F, 1.15F);
        this.main.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.3229F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 20, 18, -3.0F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-1.9427F, 0.051F, -3.6671F);
        this.main.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.0961F, 0.4344F, -0.1738F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.4234F, -0.4961F, 1.9171F);
        this.frontRightLeg.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.6545F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 38, 36, -1.0044F, -0.7581F, -5.25F, 2, 2, 3, 0.0F, false));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-1.6766F, 0.0039F, -1.9829F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, 0.144F, -0.7069F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0996F, 0.0F, 0.0382F);
        this.frontRightLeg2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.829F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 44, 29, -1.0044F, -0.5081F, -3.0F, 2, 1, 3, -0.01F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 22, 44, -1.0044F, -1.0081F, -3.0F, 2, 1, 3, 0.0F, false));

        this.frontRightleg3 = new AdvancedModelRenderer(this);
        this.frontRightleg3.setRotationPoint(-1.5722F, -0.272F, -1.7662F);
        this.frontRightLeg2.addChild(frontRightleg3);
        this.setRotateAngle(frontRightleg3, -0.2574F, -0.8109F, 0.3986F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.107F, -1.0F, 0.2585F);
        this.frontRightleg3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 1.1781F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 36, 11, -1.6131F, 0.492F, -3.0901F, 3, 1, 3, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(1.9427F, 0.051F, -3.6671F);
        this.main.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.0961F, -0.4344F, 0.1738F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.4234F, -0.4961F, 1.9171F);
        this.frontLeftLeg.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.6545F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 38, 36, -0.9956F, -0.7581F, -5.25F, 2, 2, 3, 0.0F, true));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(1.6766F, 0.0039F, -1.9829F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, 0.144F, 0.7069F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.0996F, 0.0F, 0.0382F);
        this.frontLeftLeg2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.829F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 44, 29, -0.9956F, -0.5081F, -3.0F, 2, 1, 3, -0.01F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 22, 44, -0.9956F, -1.0081F, -3.0F, 2, 1, 3, 0.0F, true));

        this.frontLeftleg3 = new AdvancedModelRenderer(this);
        this.frontLeftleg3.setRotationPoint(1.5722F, -0.272F, -1.7662F);
        this.frontLeftLeg2.addChild(frontLeftleg3);
        this.setRotateAngle(frontLeftleg3, -0.2574F, 0.8109F, -0.3986F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.107F, -1.0F, 0.2585F);
        this.frontLeftleg3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -1.1781F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 36, 11, -1.3869F, 0.492F, -3.0901F, 3, 1, 3, 0.0F, true));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.4983F, -0.0216F, 3.5038F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.1868F, 1.5183F, -0.0266F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 0, 30, -1.5456F, -1.0081F, -0.6389F, 3, 2, 4, 0.0F, true));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 0.0F, 3.05F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, -0.0273F, -0.8291F, -0.203F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, -0.75F, 0.0F);
        this.backLeftLeg2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.48F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 14, 35, -1.5456F, 0.492F, 0.0111F, 2, 1, 4, -0.01F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 34, 24, -1.5456F, -0.008F, 0.0111F, 2, 1, 4, 0.0F, true));

        this.backLeftleg3 = new AdvancedModelRenderer(this);
        this.backLeftleg3.setRotationPoint(-1.7777F, -0.0722F, 2.6534F);
        this.backLeftLeg2.addChild(backLeftleg3);
        this.setRotateAngle(backLeftleg3, 0.496F, 0.9521F, 0.5025F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.7F, -1.0F, -0.1F);
        this.backLeftleg3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.2618F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 30, 31, -0.7869F, 0.492F, -0.0258F, 3, 1, 4, 0.0F, true));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.4983F, -0.0216F, 3.5038F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -2.6605F, -1.5097F, 2.5334F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 0, 30, -1.4544F, -1.0081F, -0.6389F, 3, 2, 4, 0.0F, false));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 0.0F, 3.05F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, -0.0273F, 0.8291F, 0.203F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, -0.75F, 0.0F);
        this.backRightLeg2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.48F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 14, 35, -0.4544F, 0.492F, 0.0111F, 2, 1, 4, -0.01F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 34, 24, -0.4544F, -0.008F, 0.0111F, 2, 1, 4, 0.0F, false));

        this.backRightleg3 = new AdvancedModelRenderer(this);
        this.backRightleg3.setRotationPoint(1.7777F, -0.0722F, 2.6534F);
        this.backRightLeg2.addChild(backRightleg3);
        this.setRotateAngle(backRightleg3, 0.496F, -0.9521F, -0.5025F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.7F, -1.0F, -0.1F);
        this.backRightleg3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.2618F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 30, 31, -2.2131F, 0.492F, -0.0258F, 3, 1, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.main.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 36, -1.5F, -0.75F, -2.5F, 3, 2, 3, 0.02F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 26, 39, -1.0F, -0.75F, -2.75F, 2, 2, 3, 0.015F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 40, 0, -1.0F, -0.75F, -2.75F, 2, 2, 3, 0.01F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck3.addChild(neck4);
        this.neck4.cubeList.add(new ModelBox(neck4, 12, 40, -1.0F, -0.75F, -2.75F, 2, 2, 3, 0.005F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck4.addChild(neck5);
        this.neck5.cubeList.add(new ModelBox(neck5, 10, 45, -1.0F, -0.75F, -1.75F, 2, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.175F, -1.65F);
        this.neck5.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 41, -0.5F, -0.5F, -3.5F, 1, 1, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 48, 47, -0.5F, 0.1F, -1.6F, 1, 1, 2, 0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.075F, 1.1F, -1.675F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0873F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 48, 44, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.075F, 0.2F, -1.7F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0785F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 24, 48, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, 0.425F, -3.5F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1091F, 0.3011F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 18, 48, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, 0.5F, -3.5F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.3054F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 48, 14, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.075F, 0.2F, -1.7F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.0785F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 24, 48, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.075F, 1.1F, -1.675F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.0873F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 48, 44, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 0.425F, -3.5F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1091F, -0.3011F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 18, 48, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, 0.5F, -3.5F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, -0.3054F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 48, 14, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.0F, -0.75F, -3.1F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0436F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 46, 41, 0.0F, 0.0F, 1.525F, 2, 1, 2, 0.01F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 48, 17, 0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.5F, -0.375F, -4.0F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.3927F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 16, 27, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(0.05F, -0.15F, -3.05F);
        this.head.addChild(eye1);
        this.setRotateAngle(eye1, 0.2618F, 0.2182F, -0.1745F);
        this.eye1.cubeList.add(new ModelBox(eye1, 16, 29, -0.2F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.05F, -0.15F, -3.05F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.2618F, -0.2182F, 0.1745F);
        this.eye2.cubeList.add(new ModelBox(eye2, 16, 29, -0.8F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.45F, -1.1F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 46, -0.5F, -0.4F, -2.45F, 1, 1, 3, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.025F, 0.6F, -0.55F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.0873F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 16, 25, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, 0.6F, -2.425F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.2618F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 48, 36, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.5F, 0.6F, -2.425F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, -0.2618F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 48, 36, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2117F, 4.8051F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 36, 41, -1.0F, -1.0F, -0.25F, 2, 2, 3, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2058F, 2.4545F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 46, 22, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 32, 46, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));


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
        this.main.offsetY = -1.8F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.2F, 3.8F, -0.1F);
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

        EntityPrehistoricFloraTaquetochelys entityTaquetochelys = (EntityPrehistoricFloraTaquetochelys) e;

        if (entityTaquetochelys.getAnimation() == entityTaquetochelys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3};

        if (entityTaquetochelys.getAnimation() == entityTaquetochelys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityTaquetochelys.isReallyInWater()) {

                if (f3 == 0.0F || !entityTaquetochelys.getIsMoving()) {
                    if (entityTaquetochelys.getAnimation() != entityTaquetochelys.EAT_ANIMATION
                        && entityTaquetochelys.getAnimation() != entityTaquetochelys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityTaquetochelys.getIsFast()) { //Running


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
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eye1.setScale(1,1,1);
        this.eye2.setScale(1,1,1);

        EntityPrehistoricFloraTaquetochelys ee = (EntityPrehistoricFloraTaquetochelys) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    if(ee.getIsFast()) {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else {
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            } else {
                //Swimming pose:
                animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The hiding and unhiding anim
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTaquetochelys entity = (EntityPrehistoricFloraTaquetochelys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 5.25 + (((tickAnim - 20) / 15) * (6.75-(5.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 35) / 15) * (0-(6.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.475 + (((tickAnim - 35) / 15) * (0-(0.475)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -1.5 + (((tickAnim - 20) / 15) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 35) / 15) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 20) / 15) * (-5-(-5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 35) / 15) * (0-(-5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -25 + (((tickAnim - 20) / 15) * (-32.75-(-25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -32.75 + (((tickAnim - 35) / 5) * (-25-(-32.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -25 + (((tickAnim - 40) / 10) * (0-(-25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 17.25 + (((tickAnim - 20) / 15) * (23-(17.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 23 + (((tickAnim - 35) / 5) * (18.5-(23)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 18.5 + (((tickAnim - 40) / 10) * (0-(18.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (28.17689-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-33.17505-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (82.12805-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 28.17689 + (((tickAnim - 20) / 10) * (81.9709-(28.17689)));
            yy = -33.17505 + (((tickAnim - 20) / 10) * (-44.76688-(-33.17505)));
            zz = 82.12805 + (((tickAnim - 20) / 10) * (104.46735-(82.12805)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 81.9709 + (((tickAnim - 30) / 10) * (28.17689-(81.9709)));
            yy = -44.76688 + (((tickAnim - 30) / 10) * (-33.17505-(-44.76688)));
            zz = 104.46735 + (((tickAnim - 30) / 10) * (82.12805-(104.46735)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 28.17689 + (((tickAnim - 40) / 10) * (0-(28.17689)));
            yy = -33.17505 + (((tickAnim - 40) / 10) * (0-(-33.17505)));
            zz = 82.12805 + (((tickAnim - 40) / 10) * (0-(82.12805)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(0);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(0);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (18.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-4.75-(0)));
            yy = 18.5 + (((tickAnim - 20) / 10) * (18.5-(18.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -4.75 + (((tickAnim - 30) / 10) * (0-(-4.75)));
            yy = 18.5 + (((tickAnim - 30) / 10) * (18.5-(18.5)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (35.10468-(0)));
            yy = 18.5 + (((tickAnim - 40) / 6) * (13.12926-(18.5)));
            zz = 0 + (((tickAnim - 40) / 6) * (-23.56567-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 35.10468 + (((tickAnim - 46) / 4) * (0-(35.10468)));
            yy = 13.12926 + (((tickAnim - 46) / 4) * (0-(13.12926)));
            zz = -23.56567 + (((tickAnim - 46) / 4) * (0-(-23.56567)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(0);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(0);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.06961-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-25.24724-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-21.9377-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.06961 + (((tickAnim - 10) / 10) * (-25.86079-(17.06961)));
            yy = -25.24724 + (((tickAnim - 10) / 10) * (-50.49448-(-25.24724)));
            zz = -21.9377 + (((tickAnim - 10) / 10) * (-43.87539-(-21.9377)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.86079 + (((tickAnim - 20) / 10) * (-77.36079-(-25.86079)));
            yy = -50.49448 + (((tickAnim - 20) / 10) * (-50.49448-(-50.49448)));
            zz = -43.87539 + (((tickAnim - 20) / 10) * (-43.87539-(-43.87539)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -77.36079 + (((tickAnim - 30) / 10) * (-25.86079-(-77.36079)));
            yy = -50.49448 + (((tickAnim - 30) / 10) * (-50.49448-(-50.49448)));
            zz = -43.87539 + (((tickAnim - 30) / 10) * (-43.87539-(-43.87539)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -25.86079 + (((tickAnim - 40) / 10) * (0-(-25.86079)));
            yy = -50.49448 + (((tickAnim - 40) / 10) * (0-(-50.49448)));
            zz = -43.87539 + (((tickAnim - 40) / 10) * (0-(-43.87539)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftleg3, backLeftleg3.rotateAngleX + (float) Math.toRadians(xx), backLeftleg3.rotateAngleY + (float) Math.toRadians(yy), backLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.525-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0.825-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 30) / 10) * (0-(0.525)));
            zz = 0.825 + (((tickAnim - 30) / 10) * (0-(0.825)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftleg3.rotationPointX = this.backLeftleg3.rotationPointX + (float)(xx);
        this.backLeftleg3.rotationPointY = this.backLeftleg3.rotationPointY - (float)(yy);
        this.backLeftleg3.rotationPointZ = this.backLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.25 + (((tickAnim - 20) / 10) * (201.14366-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (48.85905-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-264.15871-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 201.14366 + (((tickAnim - 30) / 20) * (0-(201.14366)));
            yy = 48.85905 + (((tickAnim - 30) / 20) * (0-(48.85905)));
            zz = -264.15871 + (((tickAnim - 30) / 20) * (0-(-264.15871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(0);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(0);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-49.45617-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-1.13956-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-92.93022-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -49.45617 + (((tickAnim - 25) / 5) * (0-(-49.45617)));
            yy = -1.13956 + (((tickAnim - 25) / 5) * (-18.5-(-1.13956)));
            zz = -92.93022 + (((tickAnim - 25) / 5) * (0-(-92.93022)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 30) / 11) * (43.5-(0)));
            yy = -18.5 + (((tickAnim - 30) / 11) * (-8.47917-(-18.5)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 43.5 + (((tickAnim - 41) / 9) * (0-(43.5)));
            yy = -8.47917 + (((tickAnim - 41) / 9) * (0-(-8.47917)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(0);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(0);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 7.25 + (((tickAnim - 20) / 3) * (-15.78038-(7.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (59.06646-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (18.85781-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -15.78038 + (((tickAnim - 23) / 2) * (-34.28252-(-15.78038)));
            yy = 59.06646 + (((tickAnim - 23) / 2) * (45.13126-(59.06646)));
            zz = 18.85781 + (((tickAnim - 23) / 2) * (19.64209-(18.85781)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -34.28252 + (((tickAnim - 25) / 5) * (-77.36079-(-34.28252)));
            yy = 45.13126 + (((tickAnim - 25) / 5) * (50.49448-(45.13126)));
            zz = 19.64209 + (((tickAnim - 25) / 5) * (43.87539-(19.64209)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -77.36079 + (((tickAnim - 30) / 20) * (0-(-77.36079)));
            yy = 50.49448 + (((tickAnim - 30) / 20) * (0-(50.49448)));
            zz = 43.87539 + (((tickAnim - 30) / 20) * (0-(43.87539)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightleg3, backRightleg3.rotateAngleX + (float) Math.toRadians(xx), backRightleg3.rotateAngleY + (float) Math.toRadians(yy), backRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.525-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0.825-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.525 + (((tickAnim - 30) / 20) * (0-(0.525)));
            zz = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightleg3.rotationPointX = this.backRightleg3.rotationPointX + (float)(xx);
        this.backRightleg3.rotationPointY = this.backRightleg3.rotationPointY - (float)(yy);
        this.backRightleg3.rotationPointZ = this.backRightleg3.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTaquetochelys entity = (EntityPrehistoricFloraTaquetochelys) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1.78782-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22 + (((tickAnim - 0) / 10) * (9.33178-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 0) / 10) * (-10.89593-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.78782 + (((tickAnim - 10) / 3) * (-1.78782-(-1.78782)));
            yy = 9.33178 + (((tickAnim - 10) / 3) * (-0.1682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22-(9.33178)));
            zz = -10.89593 + (((tickAnim - 10) / 3) * (-19.7209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22-(-10.89593)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -1.78782 + (((tickAnim - 13) / 5) * (-3.7405-(-1.78782)));
            yy = -0.1682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22 + (((tickAnim - 13) / 5) * (-0.0559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22-(-0.1682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22)));
            zz = -19.7209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22 + (((tickAnim - 13) / 5) * (11.5023+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-22-(-19.7209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3.7405 + (((tickAnim - 18) / 7) * (0-(-3.7405)));
            yy = -0.0559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22 + (((tickAnim - 18) / 7) * (0-(-0.0559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*22)));
            zz = 11.5023+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-22 + (((tickAnim - 18) / 7) * (0-(11.5023+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.35293-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 0) / 10) * (-2.97919-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 0) / 10) * (-6.75918-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.35293 + (((tickAnim - 10) / 3) * (-0.14707-(0.35293)));
            yy = -2.97919 + (((tickAnim - 10) / 3) * (-2.97919-(-2.97919)));
            zz = -6.75918 + (((tickAnim - 10) / 3) * (-6.75918-(-6.75918)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.14707 + (((tickAnim - 13) / 5) * (-4.64668-(-0.14707)));
            yy = -2.97919 + (((tickAnim - 13) / 5) * (4.02068-(-2.97919)));
            zz = -6.75918 + (((tickAnim - 13) / 5) * (-6.71606-(-6.75918)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -4.64668 + (((tickAnim - 18) / 7) * (0-(-4.64668)));
            yy = 4.02068 + (((tickAnim - 18) / 7) * (0-(4.02068)));
            zz = -6.71606 + (((tickAnim - 18) / 7) * (0-(-6.71606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.24459-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 0) / 10) * (-3.99253-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (-3.50853-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.24459 + (((tickAnim - 10) / 3) * (-0.75541-(0.24459)));
            yy = -3.99253 + (((tickAnim - 10) / 3) * (-3.99253-(-3.99253)));
            zz = -3.50853 + (((tickAnim - 10) / 3) * (-3.50853-(-3.50853)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.75541 + (((tickAnim - 13) / 5) * (2.06948-(-0.75541)));
            yy = -3.99253 + (((tickAnim - 13) / 5) * (-10.05594-(-3.99253)));
            zz = -3.50853 + (((tickAnim - 13) / 5) * (3.31136-(-3.50853)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 2.06948 + (((tickAnim - 18) / 7) * (0-(2.06948)));
            yy = -10.05594 + (((tickAnim - 18) / 7) * (0-(-10.05594)));
            zz = 3.31136 + (((tickAnim - 18) / 7) * (0-(3.31136)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.35574-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 0) / 10) * (-6.23991-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 0) / 10) * (-3.26939-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.35574 + (((tickAnim - 10) / 3) * (2.10574-(0.35574)));
            yy = -6.23991 + (((tickAnim - 10) / 3) * (-6.23991-(-6.23991)));
            zz = -3.26939 + (((tickAnim - 10) / 3) * (-3.26939-(-3.26939)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2.10574 + (((tickAnim - 13) / 5) * (2.4445-(2.10574)));
            yy = -6.23991 + (((tickAnim - 13) / 5) * (-14.45659-(-6.23991)));
            zz = -3.26939 + (((tickAnim - 13) / 5) * (2.35819-(-3.26939)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 2.4445 + (((tickAnim - 18) / 7) * (0-(2.4445)));
            yy = -14.45659 + (((tickAnim - 18) / 7) * (0-(-14.45659)));
            zz = 2.35819 + (((tickAnim - 18) / 7) * (0-(2.35819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-7 + (((tickAnim - 0) / 10) * (-2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8 + (((tickAnim - 0) / 10) * (3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (1.25-(0)));
            yy = -2.5 + (((tickAnim - 10) / 3) * (-2.5-(-2.5)));
            zz = 3 + (((tickAnim - 10) / 3) * (3-(3)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1.25 + (((tickAnim - 13) / 5) * (5.25-(1.25)));
            yy = -2.5 + (((tickAnim - 13) / 5) * (-8.75-(-2.5)));
            zz = 3 + (((tickAnim - 13) / 5) * (3-(3)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 5.25 + (((tickAnim - 18) / 7) * (0-(5.25)));
            yy = -8.75 + (((tickAnim - 18) / 7) * (0-(-8.75)));
            zz = 3 + (((tickAnim - 18) / 7) * (0-(3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.75-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 0) / 10) * (-3.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.75 + (((tickAnim - 10) / 3) * (0-(-7.75)));
            yy = -3.25 + (((tickAnim - 10) / 3) * (0-(-3.25)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (7.85643-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (-9.41243-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-1.29273-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 7.85643 + (((tickAnim - 18) / 7) * (0-(7.85643)));
            yy = -9.41243 + (((tickAnim - 18) / 7) * (0-(-9.41243)));
            zz = -1.29273 + (((tickAnim - 18) / 7) * (0-(-1.29273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 10) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 4) * (-0.1-(1)));
            zz = 1 + (((tickAnim - 10) / 4) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 14) / 4) * (1-(1)));
            yy = -0.1 + (((tickAnim - 14) / 4) * (-0.1-(-0.1)));
            zz = 1 + (((tickAnim - 14) / 4) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 18) / 7) * (1-(1)));
            yy = -0.1 + (((tickAnim - 18) / 7) * (1-(-0.1)));
            zz = 1 + (((tickAnim - 18) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 10 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 10) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 4) * (-0.1-(1)));
            zz = 1 + (((tickAnim - 10) / 4) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 14) / 4) * (1-(1)));
            yy = -0.1 + (((tickAnim - 14) / 4) * (-0.1-(-0.1)));
            zz = 1 + (((tickAnim - 14) / 4) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 18) / 7) * (1-(1)));
            yy = -0.1 + (((tickAnim - 18) / 7) * (1-(-0.1)));
            zz = 1 + (((tickAnim - 18) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25.5 + (((tickAnim - 5) / 5) * (27-(25.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 27 + (((tickAnim - 10) / 4) * (0-(27)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTaquetochelys entity = (EntityPrehistoricFloraTaquetochelys) entitylivingbaseIn;
        int animCycle = 310;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-100))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-250))*-3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*-3 + (((tickAnim - 5) / 5) * (0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*-3-(-3.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*-3)));
            yy = -2.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-100))*-3 + (((tickAnim - 5) / 5) * (-2.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-100))*-3-(-2.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-100))*-3)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-250))*-3 + (((tickAnim - 5) / 5) * (2.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-250))*-3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-250))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*-3 + (((tickAnim - 10) / 1) * (0-(0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*-3)));
            yy = -2.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-100))*-3 + (((tickAnim - 10) / 1) * (0-(-2.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-100))*-3)));
            zz = 2.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-250))*-3 + (((tickAnim - 10) / 1) * (0-(2.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700-250))*-3)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 295) / 8) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 295) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 8) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = -13.25 + (((tickAnim - 303) / 7) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -0.35 + (((tickAnim - 11) / 284) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 295) / 8) * (0-(0)));
            yy = -0.35 + (((tickAnim - 295) / 8) * (0.275-(-0.35)));
            zz = 0 + (((tickAnim - 295) / 8) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 303) / 7) * (0-(0.275)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (57.40035-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-50.67366-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (57.87417-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 57.40035 + (((tickAnim - 5) / 6) * (90.27397-(57.40035)));
            yy = -50.67366 + (((tickAnim - 5) / 6) * (-23.59849-(-50.67366)));
            zz = 57.87417 + (((tickAnim - 5) / 6) * (46.61551-(57.87417)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 90.27397 + (((tickAnim - 11) / 284) * (90.27397-(90.27397)));
            yy = -23.59849 + (((tickAnim - 11) / 284) * (-23.59849-(-23.59849)));
            zz = 46.61551 + (((tickAnim - 11) / 284) * (46.61551-(46.61551)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 90.27397 + (((tickAnim - 295) / 15) * (0-(90.27397)));
            yy = -23.59849 + (((tickAnim - 295) / 15) * (0-(-23.59849)));
            zz = 46.61551 + (((tickAnim - 295) / 15) * (0-(46.61551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.40874-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (39.57308-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-6.15592-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 8.40874 + (((tickAnim - 5) / 6) * (17.61104-(8.40874)));
            yy = 39.57308 + (((tickAnim - 5) / 6) * (46.04478-(39.57308)));
            zz = -6.15592 + (((tickAnim - 5) / 6) * (-43.12453-(-6.15592)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 17.61104 + (((tickAnim - 11) / 284) * (17.61104-(17.61104)));
            yy = 46.04478 + (((tickAnim - 11) / 284) * (46.04478-(46.04478)));
            zz = -43.12453 + (((tickAnim - 11) / 284) * (-43.12453-(-43.12453)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 17.61104 + (((tickAnim - 295) / 8) * (0-(17.61104)));
            yy = 46.04478 + (((tickAnim - 295) / 8) * (0-(46.04478)));
            zz = -43.12453 + (((tickAnim - 295) / 8) * (0-(-43.12453)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.25-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            zz = 0.25 + (((tickAnim - 11) / 284) * (0.25-(0.25)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            zz = 0.25 + (((tickAnim - 295) / 15) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (42.83556-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (24.05032-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-62.97667-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 42.83556 + (((tickAnim - 11) / 284) * (42.83556-(42.83556)));
            yy = 24.05032 + (((tickAnim - 11) / 284) * (24.05032-(24.05032)));
            zz = -62.97667 + (((tickAnim - 11) / 284) * (-62.97667-(-62.97667)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 42.83556 + (((tickAnim - 295) / 8) * (0-(42.83556)));
            yy = 24.05032 + (((tickAnim - 295) / 8) * (0-(24.05032)));
            zz = -62.97667 + (((tickAnim - 295) / 8) * (0-(-62.97667)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightleg3, frontRightleg3.rotateAngleX + (float) Math.toRadians(xx), frontRightleg3.rotateAngleY + (float) Math.toRadians(yy), frontRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 284) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 295) / 8) * (0-(0)));
            yy = 0.1 + (((tickAnim - 295) / 8) * (0-(0.1)));
            zz = 0 + (((tickAnim - 295) / 8) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightleg3.rotationPointX = this.frontRightleg3.rotationPointX + (float)(xx);
        this.frontRightleg3.rotationPointY = this.frontRightleg3.rotationPointY - (float)(yy);
        this.frontRightleg3.rotationPointZ = this.frontRightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-43-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 5.75 + (((tickAnim - 11) / 284) * (5.75-(5.75)));
            yy = -43 + (((tickAnim - 11) / 284) * (-43-(-43)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 5.75 + (((tickAnim - 295) / 15) * (0-(5.75)));
            yy = -43 + (((tickAnim - 295) / 15) * (0-(-43)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.625-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            zz = 0.625 + (((tickAnim - 11) / 284) * (0.625-(0.625)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            zz = 0.625 + (((tickAnim - 295) / 15) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10.61056-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-49.98427-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (9.40111-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = -10.61056 + (((tickAnim - 11) / 284) * (-10.61056-(-10.61056)));
            yy = -49.98427 + (((tickAnim - 11) / 284) * (-49.98427-(-49.98427)));
            zz = 9.40111 + (((tickAnim - 11) / 284) * (9.40111-(9.40111)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = -10.61056 + (((tickAnim - 295) / 15) * (0-(-10.61056)));
            yy = -49.98427 + (((tickAnim - 295) / 15) * (0-(-49.98427)));
            zz = 9.40111 + (((tickAnim - 295) / 15) * (0-(9.40111)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.6-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = -0.1 + (((tickAnim - 11) / 284) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            zz = 0.6 + (((tickAnim - 11) / 284) * (0.6-(0.6)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = -0.1 + (((tickAnim - 295) / 15) * (0-(-0.1)));
            yy = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            zz = 0.6 + (((tickAnim - 295) / 15) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-32.75-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -32.75 + (((tickAnim - 11) / 284) * (-32.75-(-32.75)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = -32.75 + (((tickAnim - 295) / 15) * (0-(-32.75)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.35-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = -0.1 + (((tickAnim - 11) / 284) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            zz = 0.35 + (((tickAnim - 11) / 284) * (0.35-(0.35)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = -0.1 + (((tickAnim - 295) / 15) * (0-(-0.1)));
            yy = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            zz = 0.35 + (((tickAnim - 295) / 15) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-27.25-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -27.25 + (((tickAnim - 11) / 284) * (-27.25-(-27.25)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = -27.25 + (((tickAnim - 295) / 15) * (0-(-27.25)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.2-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            zz = 0.2 + (((tickAnim - 11) / 284) * (0.2-(0.2)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            zz = 0.2 + (((tickAnim - 295) / 15) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-19.5-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -19.5 + (((tickAnim - 11) / 284) * (-19.5-(-19.5)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = -19.5 + (((tickAnim - 295) / 15) * (0-(-19.5)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-6.25-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -6.25 + (((tickAnim - 11) / 284) * (-6.25-(-6.25)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = -6.25 + (((tickAnim - 295) / 15) * (0-(-6.25)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (28.51133-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-77.53457-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-35.84849-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 28.51133 + (((tickAnim - 11) / 284) * (28.51133-(28.51133)));
            yy = -77.53457 + (((tickAnim - 11) / 284) * (-77.53457-(-77.53457)));
            zz = -35.84849 + (((tickAnim - 11) / 284) * (-35.84849-(-35.84849)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 28.51133 + (((tickAnim - 295) / 15) * (0-(28.51133)));
            yy = -77.53457 + (((tickAnim - 295) / 15) * (0-(-77.53457)));
            zz = -35.84849 + (((tickAnim - 295) / 15) * (0-(-35.84849)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-50.75-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -50.75 + (((tickAnim - 11) / 284) * (-50.75-(-50.75)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = -50.75 + (((tickAnim - 295) / 15) * (0-(-50.75)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.35-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0.175 + (((tickAnim - 11) / 284) * (0.175-(0.175)));
            yy = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            zz = -0.35 + (((tickAnim - 11) / 284) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0.175 + (((tickAnim - 295) / 15) * (0-(0.175)));
            yy = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            zz = -0.35 + (((tickAnim - 295) / 15) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (57.40035-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (50.67366-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-57.87417-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 57.40035 + (((tickAnim - 5) / 6) * (75.65572-(57.40035)));
            yy = 50.67366 + (((tickAnim - 5) / 6) * (31.10631-(50.67366)));
            zz = -57.87417 + (((tickAnim - 5) / 6) * (-52.01705-(-57.87417)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 75.65572 + (((tickAnim - 11) / 284) * (75.65572-(75.65572)));
            yy = 31.10631 + (((tickAnim - 11) / 284) * (31.10631-(31.10631)));
            zz = -52.01705 + (((tickAnim - 11) / 284) * (-52.01705-(-52.01705)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 75.65572 + (((tickAnim - 295) / 15) * (0-(75.65572)));
            yy = 31.10631 + (((tickAnim - 295) / 15) * (0-(31.10631)));
            zz = -52.01705 + (((tickAnim - 295) / 15) * (0-(-52.01705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.40874-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-39.57308-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (6.15592-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 8.40874 + (((tickAnim - 5) / 6) * (80.10125-(8.40874)));
            yy = -39.57308 + (((tickAnim - 5) / 6) * (-45.43726-(-39.57308)));
            zz = 6.15592 + (((tickAnim - 5) / 6) * (57.80883-(6.15592)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 80.10125 + (((tickAnim - 11) / 284) * (80.10125-(80.10125)));
            yy = -45.43726 + (((tickAnim - 11) / 284) * (-45.43726-(-45.43726)));
            zz = 57.80883 + (((tickAnim - 11) / 284) * (57.80883-(57.80883)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 80.10125 + (((tickAnim - 295) / 8) * (0-(80.10125)));
            yy = -45.43726 + (((tickAnim - 295) / 8) * (0-(-45.43726)));
            zz = 57.80883 + (((tickAnim - 295) / 8) * (0-(57.80883)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.25-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            zz = 0.25 + (((tickAnim - 11) / 284) * (0.25-(0.25)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            zz = 0.25 + (((tickAnim - 295) / 15) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (42.83556-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-24.05032-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (62.97667-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 42.83556 + (((tickAnim - 11) / 284) * (42.83556-(42.83556)));
            yy = -24.05032 + (((tickAnim - 11) / 284) * (-24.05032-(-24.05032)));
            zz = 62.97667 + (((tickAnim - 11) / 284) * (62.97667-(62.97667)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 42.83556 + (((tickAnim - 295) / 8) * (0-(42.83556)));
            yy = -24.05032 + (((tickAnim - 295) / 8) * (0-(-24.05032)));
            zz = 62.97667 + (((tickAnim - 295) / 8) * (0-(62.97667)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftleg3, frontLeftleg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftleg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 284) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 295) / 8) * (0-(0)));
            yy = 0.1 + (((tickAnim - 295) / 8) * (0-(0.1)));
            zz = 0 + (((tickAnim - 295) / 8) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftleg3.rotationPointX = this.frontLeftleg3.rotationPointX + (float)(xx);
        this.frontLeftleg3.rotationPointY = this.frontLeftleg3.rotationPointY - (float)(yy);
        this.frontLeftleg3.rotationPointZ = this.frontLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (45.5-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 45.5 + (((tickAnim - 11) / 284) * (45.5-(45.5)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = 45.5 + (((tickAnim - 295) / 15) * (0-(45.5)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = -0.475 + (((tickAnim - 11) / 284) * (-0.475-(-0.475)));
            yy = 0.4 + (((tickAnim - 11) / 284) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = -0.475 + (((tickAnim - 295) / 15) * (0-(-0.475)));
            yy = 0.4 + (((tickAnim - 295) / 15) * (0-(0.4)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-47-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -47 + (((tickAnim - 11) / 284) * (-47-(-47)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = -47 + (((tickAnim - 295) / 15) * (0-(-47)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 0) / 310) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 310) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 310) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (117.03977-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (19.40715-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (110.39184-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 117.03977 + (((tickAnim - 11) / 284) * (117.03977-(117.03977)));
            yy = 19.40715 + (((tickAnim - 11) / 284) * (19.40715-(19.40715)));
            zz = 110.39184 + (((tickAnim - 11) / 284) * (110.39184-(110.39184)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 117.03977 + (((tickAnim - 295) / 15) * (0-(117.03977)));
            yy = 19.40715 + (((tickAnim - 295) / 15) * (0-(19.40715)));
            zz = 110.39184 + (((tickAnim - 295) / 15) * (0-(110.39184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftleg3, backLeftleg3.rotateAngleX + (float) Math.toRadians(xx), backLeftleg3.rotateAngleY + (float) Math.toRadians(yy), backLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.38-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.38-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -0.38 + (((tickAnim - 5) / 6) * (-0.875-(-0.38)));
            yy = 0.38 + (((tickAnim - 5) / 6) * (-0.75-(0.38)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = -0.875 + (((tickAnim - 11) / 284) * (-0.875-(-0.875)));
            yy = -0.75 + (((tickAnim - 11) / 284) * (-0.75-(-0.75)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = -0.875 + (((tickAnim - 295) / 15) * (0-(-0.875)));
            yy = -0.75 + (((tickAnim - 295) / 15) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftleg3.rotationPointX = this.backLeftleg3.rotationPointX + (float)(xx);
        this.backLeftleg3.rotationPointY = this.backLeftleg3.rotationPointY - (float)(yy);
        this.backLeftleg3.rotationPointZ = this.backLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-24.06512-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (26.81896-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (27.24623-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = -24.06512 + (((tickAnim - 11) / 284) * (-24.06512-(-24.06512)));
            yy = 26.81896 + (((tickAnim - 11) / 284) * (26.81896-(26.81896)));
            zz = 27.24623 + (((tickAnim - 11) / 284) * (27.24623-(27.24623)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = -24.06512 + (((tickAnim - 295) / 15) * (0-(-24.06512)));
            yy = 26.81896 + (((tickAnim - 295) / 15) * (0-(26.81896)));
            zz = 27.24623 + (((tickAnim - 295) / 15) * (0-(27.24623)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(0);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(0);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (50.25-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 50.25 + (((tickAnim - 11) / 284) * (50.25-(50.25)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = 50.25 + (((tickAnim - 295) / 15) * (0-(50.25)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (96.78327-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-17.65463-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-94.97818-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 96.78327 + (((tickAnim - 11) / 284) * (96.78327-(96.78327)));
            yy = -17.65463 + (((tickAnim - 11) / 284) * (-17.65463-(-17.65463)));
            zz = -94.97818 + (((tickAnim - 11) / 284) * (-94.97818-(-94.97818)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 96.78327 + (((tickAnim - 295) / 15) * (0-(96.78327)));
            yy = -17.65463 + (((tickAnim - 295) / 15) * (0-(-17.65463)));
            zz = -94.97818 + (((tickAnim - 295) / 15) * (0-(-94.97818)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightleg3, backRightleg3.rotateAngleX + (float) Math.toRadians(xx), backRightleg3.rotateAngleY + (float) Math.toRadians(yy), backRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightleg3.rotationPointX = this.backRightleg3.rotationPointX + (float)(xx);
        this.backRightleg3.rotationPointY = this.backRightleg3.rotationPointY - (float)(yy);
        this.backRightleg3.rotationPointZ = this.backRightleg3.rotationPointZ + (float)(zz);
    }
    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTaquetochelys entity = (EntityPrehistoricFloraTaquetochelys) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+150))*1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+60))*10), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*6));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+120))*0.5);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 66.7097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-32 + (((tickAnim - 0) / 7) * (57.8818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-32-(66.7097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-32)));
            yy = -49.957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15 + (((tickAnim - 0) / 7) * (-65.3862+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15-(-49.957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15)));
            zz = 45.61463 + (((tickAnim - 0) / 7) * (50.1754-(45.61463)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = 57.8818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-32 + (((tickAnim - 7) / 18) * (66.7097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-32-(57.8818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-32)));
            yy = -65.3862+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15 + (((tickAnim - 7) / 18) * (-49.957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15-(-65.3862+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15)));
            zz = 50.1754 + (((tickAnim - 7) / 18) * (45.61463-(50.1754)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -14.11805 + (((tickAnim - 0) / 8) * (24.2378-(-14.11805)));
            yy = 38.24884 + (((tickAnim - 0) / 8) * (34.47005-(38.24884)));
            zz = 15.02613 + (((tickAnim - 0) / 8) * (-39.35387-(15.02613)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 24.2378 + (((tickAnim - 8) / 6) * (24.2378-(24.2378)));
            yy = 34.47005 + (((tickAnim - 8) / 6) * (34.47005-(34.47005)));
            zz = -39.35387 + (((tickAnim - 8) / 6) * (-39.35387-(-39.35387)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 24.2378 + (((tickAnim - 14) / 11) * (-14.11805-(24.2378)));
            yy = 34.47005 + (((tickAnim - 14) / 11) * (38.24884-(34.47005)));
            zz = -39.35387 + (((tickAnim - 14) / 11) * (15.02613-(-39.35387)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -14.86725 + (((tickAnim - 0) / 8) * (-78.9196+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300-(-14.86725)));
            yy = 16.28937 + (((tickAnim - 0) / 8) * (5.07622-(16.28937)));
            zz = 22.63012 + (((tickAnim - 0) / 8) * (-54.05956-(22.63012)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -78.9196+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300 + (((tickAnim - 8) / 10) * (44.53036-(-78.9196+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300)));
            yy = 5.07622 + (((tickAnim - 8) / 10) * (5.07622-(5.07622)));
            zz = -54.05956 + (((tickAnim - 8) / 10) * (-54.05956-(-54.05956)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 44.53036 + (((tickAnim - 18) / 7) * (262.0577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+5))*-300-(44.53036)));
            yy = 5.07622 + (((tickAnim - 18) / 7) * (16.28937-(5.07622)));
            zz = -54.05956 + (((tickAnim - 18) / 7) * (22.63012-(-54.05956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightleg3, frontRightleg3.rotateAngleX + (float) Math.toRadians(xx), frontRightleg3.rotateAngleY + (float) Math.toRadians(yy), frontRightleg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+150))*-1.5), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*-6), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*-4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*6), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+190))*6), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*6), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0), neck5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+350))*6), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+150))*1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+70))*8), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*6));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+150))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*-15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*6));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 70.7097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*32 + (((tickAnim - 0) / 7) * (65.0747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*22-(70.7097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*32)));
            yy = 49.957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15 + (((tickAnim - 0) / 7) * (55.0465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15-(49.957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15)));
            zz = -45.61463 + (((tickAnim - 0) / 7) * (-37.85971-(-45.61463)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = 65.0747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*22 + (((tickAnim - 7) / 18) * (70.7097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*32-(65.0747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*22)));
            yy = 55.0465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15 + (((tickAnim - 7) / 18) * (49.957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15-(55.0465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15)));
            zz = -37.85971 + (((tickAnim - 7) / 18) * (-45.61463-(-37.85971)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 9.2892 + (((tickAnim - 0) / 7) * (-14.11805-(9.2892)));
            yy = -36.14817 + (((tickAnim - 0) / 7) * (-38.24884-(-36.14817)));
            zz = 20.46196 + (((tickAnim - 0) / 7) * (-15.02613-(20.46196)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -14.11805 + (((tickAnim - 7) / 5) * (-14.11805-(-14.11805)));
            yy = -38.24884 + (((tickAnim - 7) / 5) * (-38.24884-(-38.24884)));
            zz = -15.02613 + (((tickAnim - 7) / 5) * (-15.02613-(-15.02613)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -14.11805 + (((tickAnim - 12) / 8) * (-9.16748-(-14.11805)));
            yy = -38.24884 + (((tickAnim - 12) / 8) * (-36.14183-(-38.24884)));
            zz = -15.02613 + (((tickAnim - 12) / 8) * (-8.46204-(-15.02613)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -9.16748 + (((tickAnim - 20) / 5) * (9.2892-(-9.16748)));
            yy = -36.14183 + (((tickAnim - 20) / 5) * (-36.14817-(-36.14183)));
            zz = -8.46204 + (((tickAnim - 20) / 5) * (20.46196-(-8.46204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 49.02864 + (((tickAnim - 0) / 12) * (85.7745+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-190-(49.02864)));
            yy = -22.50558 + (((tickAnim - 0) / 12) * (-24.31511-(-22.50558)));
            zz = 82.89444 + (((tickAnim - 0) / 12) * (-28.5976-(82.89444)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 85.7745+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-190 + (((tickAnim - 12) / 13) * (49.02864-(85.7745+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-190)));
            yy = -24.31511 + (((tickAnim - 12) / 13) * (-22.50558-(-24.31511)));
            zz = -28.5976 + (((tickAnim - 12) / 13) * (82.89444-(-28.5976)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftleg3, frontLeftleg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftleg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0.375 + (((tickAnim - 0) / 12) * (0-(0.375)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = -0.5 + (((tickAnim - 0) / 12) * (0-(-0.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0.375-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (-0.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftleg3.rotationPointX = this.frontLeftleg3.rotationPointX + (float)(xx);
        this.frontLeftleg3.rotationPointY = this.frontLeftleg3.rotationPointY - (float)(yy);
        this.frontLeftleg3.rotationPointZ = this.frontLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 117.14506 + (((tickAnim - 0) / 12) * (118.3044+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-155-(117.14506)));
            yy = -45.38748 + (((tickAnim - 0) / 12) * (-65.31834-(-45.38748)));
            zz = 114.05162 + (((tickAnim - 0) / 12) * (89.00697-(114.05162)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 118.3044+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-155 + (((tickAnim - 12) / 6) * (-26.1539+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*155-(118.3044+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-155)));
            yy = -65.31834 + (((tickAnim - 12) / 6) * (-53.76193-(-65.31834)));
            zz = 89.00697 + (((tickAnim - 12) / 6) * (107.15787-(89.00697)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -26.1539+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*155 + (((tickAnim - 18) / 7) * (117.14506-(-26.1539+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*155)));
            yy = -53.76193 + (((tickAnim - 18) / 7) * (-45.38748-(-53.76193)));
            zz = 107.15787 + (((tickAnim - 18) / 7) * (114.05162-(107.15787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 25) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 7.82016 + (((tickAnim - 0) / 12) * (-2.86152-(7.82016)));
            yy = 20.76995 + (((tickAnim - 0) / 12) * (191.0542+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(20.76995)));
            zz = -27.71837 + (((tickAnim - 0) / 12) * (10.58749-(-27.71837)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -2.86152 + (((tickAnim - 12) / 13) * (7.82016-(-2.86152)));
            yy = 191.0542+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 12) / 13) * (20.76995-(191.0542+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            zz = 10.58749 + (((tickAnim - 12) / 13) * (-27.71837-(10.58749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -16.79705 + (((tickAnim - 0) / 5) * (10.22116-(-16.79705)));
            yy = 25.68317 + (((tickAnim - 0) / 5) * (-53.46063-(25.68317)));
            zz = -16.87331 + (((tickAnim - 0) / 5) * (-18.8948-(-16.87331)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 10.22116 + (((tickAnim - 5) / 7) * (-26.31936-(10.22116)));
            yy = -53.46063 + (((tickAnim - 5) / 7) * (-75.85729-(-53.46063)));
            zz = -18.8948 + (((tickAnim - 5) / 7) * (-29.09726-(-18.8948)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -26.31936 + (((tickAnim - 12) / 5) * (-32.27404-(-26.31936)));
            yy = -75.85729 + (((tickAnim - 12) / 5) * (-36.94282-(-75.85729)));
            zz = -29.09726 + (((tickAnim - 12) / 5) * (-14.14883-(-29.09726)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -32.27404 + (((tickAnim - 17) / 8) * (-16.79705-(-32.27404)));
            yy = -36.94282 + (((tickAnim - 17) / 8) * (25.68317-(-36.94282)));
            zz = -14.14883 + (((tickAnim - 17) / 8) * (-16.87331-(-14.14883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftleg3, backLeftleg3.rotateAngleX + (float) Math.toRadians(xx), backLeftleg3.rotateAngleY + (float) Math.toRadians(yy), backLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0.525 + (((tickAnim - 12) / 5) * (0-(0.525)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftleg3.rotationPointX = this.backLeftleg3.rotationPointX + (float)(xx);
        this.backLeftleg3.rotationPointY = this.backLeftleg3.rotationPointY - (float)(yy);
        this.backLeftleg3.rotationPointZ = this.backLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 186.59678 + (((tickAnim - 0) / 12) * (185.7283+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*155-(186.59678)));
            yy = 74.1751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 12) * (48.19272-(74.1751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = -239.4299898984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 12) * (-260.74357-(-239.4299898984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 185.7283+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*155 + (((tickAnim - 12) / 13) * (186.16742-(185.7283+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*155)));
            yy = 48.19272 + (((tickAnim - 12) / 13) * (72.9184-(48.19272)));
            zz = -260.74357 + (((tickAnim - 12) / 13) * (-237.51479-(-260.74357)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 5) * (-0.395-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 5) / 20) * (0-(0)));
            yy = -0.395 + (((tickAnim - 5) / 20) * (-0.275-(-0.395)));
            zz = 0 + (((tickAnim - 5) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -6.62028 + (((tickAnim - 0) / 5) * (-1.18427-(-6.62028)));
            yy = 10.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 0) / 5) * (25.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(10.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            zz = -9.68694 + (((tickAnim - 0) / 5) * (5.09577-(-9.68694)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -1.18427 + (((tickAnim - 5) / 7) * (6.87291-(-1.18427)));
            yy = 25.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 5) / 7) * (-41.99659-(25.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            zz = 5.09577 + (((tickAnim - 5) / 7) * (28.74173-(5.09577)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 6.87291 + (((tickAnim - 12) / 5) * (3.87082-(6.87291)));
            yy = -41.99659 + (((tickAnim - 12) / 5) * (-63.07031-(-41.99659)));
            zz = 28.74173 + (((tickAnim - 12) / 5) * (-48.2416+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250-(28.74173)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 3.87082 + (((tickAnim - 17) / 8) * (-6.62028-(3.87082)));
            yy = -63.07031 + (((tickAnim - 17) / 8) * (-64.76999-(-63.07031)));
            zz = -48.2416+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250 + (((tickAnim - 17) / 8) * (-9.68694-(-48.2416+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -16.20768 + (((tickAnim - 0) / 5) * (-45.59761-(-16.20768)));
            yy = 62.4272 + (((tickAnim - 0) / 5) * (40.48346-(62.4272)));
            zz = 38.16127 + (((tickAnim - 0) / 5) * (39.28252-(38.16127)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -45.59761 + (((tickAnim - 5) / 7) * (10.26987-(-45.59761)));
            yy = 40.48346 + (((tickAnim - 5) / 7) * (-23.57985-(40.48346)));
            zz = 39.28252 + (((tickAnim - 5) / 7) * (-11.9946-(39.28252)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 10.26987 + (((tickAnim - 12) / 5) * (14.15766-(10.26987)));
            yy = -23.57985 + (((tickAnim - 12) / 5) * (45.48218-(-23.57985)));
            zz = -11.9946 + (((tickAnim - 12) / 5) * (25.06648-(-11.9946)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 14.15766 + (((tickAnim - 17) / 8) * (-16.20768-(14.15766)));
            yy = 45.48218 + (((tickAnim - 17) / 8) * (62.4272-(45.48218)));
            zz = 25.06648 + (((tickAnim - 17) / 8) * (38.16127-(25.06648)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightleg3, backRightleg3.rotateAngleX + (float) Math.toRadians(xx), backRightleg3.rotateAngleY + (float) Math.toRadians(yy), backRightleg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTaquetochelys entity = (EntityPrehistoricFloraTaquetochelys) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*2), main.rotateAngleY + (float) Math.toRadians(-1.7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*4));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 4) * (1.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*1-(1.3)));
            zz = 0 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*1 + (((tickAnim - 4) / 1) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-129))*-1.5-(1.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25 + (((tickAnim - 4) / 1) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-129))*-1.5 + (((tickAnim - 5) / 4) * (4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*-5-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-129))*-1.5)));
            zz = 0 + (((tickAnim - 5) / 4) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*-5 + (((tickAnim - 9) / 1) * (1.325-(4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*-5)));
            zz = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25 + (((tickAnim - 9) / 1) * (0-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 27.80954 + (((tickAnim - 0) / 6) * (80.4495-(27.80954)));
            yy = -43.18954 + (((tickAnim - 0) / 6) * (-17.93319-(-43.18954)));
            zz = -14.09233 + (((tickAnim - 0) / 6) * (56.25197-(-14.09233)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 80.4495 + (((tickAnim - 6) / 2) * (33.39008-(80.4495)));
            yy = -17.93319 + (((tickAnim - 6) / 2) * (12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-17.93319)));
            zz = 56.25197 + (((tickAnim - 6) / 2) * (29.90096-(56.25197)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 33.39008 + (((tickAnim - 8) / 2) * (27.80954-(33.39008)));
            yy = 12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 8) / 2) * (-43.18954-(12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = 29.90096 + (((tickAnim - 8) / 2) * (-14.09233-(29.90096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -12.90164 + (((tickAnim - 0) / 6) * (6.16262-(-12.90164)));
            yy = 27.62111 + (((tickAnim - 0) / 6) * (5.06889-(27.62111)));
            zz = 11.19186 + (((tickAnim - 0) / 6) * (13.90264-(11.19186)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 6.16262 + (((tickAnim - 6) / 1) * (-9.02088-(6.16262)));
            yy = 5.06889 + (((tickAnim - 6) / 1) * (24.36759-(5.06889)));
            zz = 13.90264 + (((tickAnim - 6) / 1) * (9.59225-(13.90264)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -9.02088 + (((tickAnim - 7) / 1) * (-47.86637-(-9.02088)));
            yy = 24.36759 + (((tickAnim - 7) / 1) * (6.36473-(24.36759)));
            zz = 9.59225 + (((tickAnim - 7) / 1) * (13.34862-(9.59225)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -47.86637 + (((tickAnim - 8) / 2) * (-12.90164-(-47.86637)));
            yy = 6.36473 + (((tickAnim - 8) / 2) * (27.62111-(6.36473)));
            zz = 13.34862 + (((tickAnim - 8) / 2) * (11.19186-(13.34862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.49143 + (((tickAnim - 0) / 3) * (-49.75291-(1.49143)));
            yy = 26.60879 + (((tickAnim - 0) / 3) * (27.20171-(26.60879)));
            zz = 0.01565 + (((tickAnim - 0) / 3) * (10.88125-(0.01565)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -49.75291 + (((tickAnim - 3) / 1) * (-78.82844-(-49.75291)));
            yy = 27.20171 + (((tickAnim - 3) / 1) * (40.70419-(27.20171)));
            zz = 10.88125 + (((tickAnim - 3) / 1) * (18.30477-(10.88125)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -78.82844 + (((tickAnim - 4) / 2) * (-605.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*1000-(-78.82844)));
            yy = 40.70419 + (((tickAnim - 4) / 2) * (18.51386-(40.70419)));
            zz = 18.30477 + (((tickAnim - 4) / 2) * (-47.46769-(18.30477)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -605.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*1000 + (((tickAnim - 6) / 1) * (30.71196-(-605.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*1000)));
            yy = 18.51386 + (((tickAnim - 6) / 1) * (51.08325-(18.51386)));
            zz = -47.46769 + (((tickAnim - 6) / 1) * (-73.24733-(-47.46769)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 30.71196 + (((tickAnim - 7) / 1) * (28.43349-(30.71196)));
            yy = 51.08325 + (((tickAnim - 7) / 1) * (29.6039-(51.08325)));
            zz = -73.24733 + (((tickAnim - 7) / 1) * (-36.34125-(-73.24733)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 28.43349 + (((tickAnim - 8) / 2) * (1.49143-(28.43349)));
            yy = 29.6039 + (((tickAnim - 8) / 2) * (26.60879-(29.6039)));
            zz = -36.34125 + (((tickAnim - 8) / 2) * (0.01565-(-36.34125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightleg3, frontRightleg3.rotateAngleX + (float) Math.toRadians(xx), frontRightleg3.rotateAngleY + (float) Math.toRadians(yy), frontRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.675-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.525-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0.675 + (((tickAnim - 1) / 2) * (1.05-(0.675)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0.525 + (((tickAnim - 1) / 2) * (0.825-(0.525)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 1.05 + (((tickAnim - 3) / 1) * (0.725-(1.05)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.075-(0)));
            zz = 0.825 + (((tickAnim - 3) / 1) * (0.355-(0.825)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0.725 + (((tickAnim - 4) / 2) * (-0.1-(0.725)));
            yy = -0.075 + (((tickAnim - 4) / 2) * (0.35-(-0.075)));
            zz = 0.355 + (((tickAnim - 4) / 2) * (0.175-(0.355)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.1 + (((tickAnim - 6) / 1) * (-0.5-(-0.1)));
            yy = 0.35 + (((tickAnim - 6) / 1) * (0-(0.35)));
            zz = 0.175 + (((tickAnim - 6) / 1) * (-0.35-(0.175)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.5 + (((tickAnim - 7) / 1) * (0.15-(-0.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.05-(0)));
            zz = -0.35 + (((tickAnim - 7) / 1) * (-0.105-(-0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.15 + (((tickAnim - 8) / 2) * (0-(0.15)));
            yy = 0.05 + (((tickAnim - 8) / 2) * (0-(0.05)));
            zz = -0.105 + (((tickAnim - 8) / 2) * (0-(-0.105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightleg3.rotationPointX = this.frontRightleg3.rotationPointX + (float)(xx);
        this.frontRightleg3.rotationPointY = this.frontRightleg3.rotationPointY - (float)(yy);
        this.frontRightleg3.rotationPointZ = this.frontRightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*-2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-10))*-5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*4));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-0.2 + (((tickAnim - 4) / 1) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-0.2)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-0.2-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-0.2 + (((tickAnim - 9) / 1) * (0-(0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-0.2)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-5), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(-0.05);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+150))*-2), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+250))*-2), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-5), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-1.25), neck5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-350))*-5), neck5.rotateAngleZ + (float) Math.toRadians(0));
        this.neck5.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.03),(float)1);


        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.01);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);
        this.head.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-0.03),(float)1);


        this.jaw.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.1),(float)1);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-2.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-10), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+200))*-10), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 80.4495 + (((tickAnim - 0) / 3) * (33.39008-(80.4495)));
            yy = 17.93319 + (((tickAnim - 0) / 3) * (24.2839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(17.93319)));
            zz = -56.25197 + (((tickAnim - 0) / 3) * (-29.90096-(-56.25197)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 33.39008 + (((tickAnim - 3) / 1) * (29.05954-(33.39008)));
            yy = 24.2839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 3) / 1) * (43.18954-(24.2839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = -29.90096 + (((tickAnim - 3) / 1) * (14.09233-(-29.90096)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 29.05954 + (((tickAnim - 4) / 6) * (80.4495-(29.05954)));
            yy = 43.18954 + (((tickAnim - 4) / 6) * (17.93319-(43.18954)));
            zz = 14.09233 + (((tickAnim - 4) / 6) * (-56.25197-(14.09233)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.16262 + (((tickAnim - 0) / 1) * (-9.02088-(6.16262)));
            yy = -5.06889 + (((tickAnim - 0) / 1) * (-24.36759-(-5.06889)));
            zz = -13.90264 + (((tickAnim - 0) / 1) * (-9.59225-(-13.90264)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -9.02088 + (((tickAnim - 1) / 2) * (-47.86637-(-9.02088)));
            yy = -24.36759 + (((tickAnim - 1) / 2) * (-6.36473-(-24.36759)));
            zz = -9.59225 + (((tickAnim - 1) / 2) * (-13.34862-(-9.59225)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -47.86637 + (((tickAnim - 3) / 1) * (-12.90164-(-47.86637)));
            yy = -6.36473 + (((tickAnim - 3) / 1) * (-27.62111-(-6.36473)));
            zz = -13.34862 + (((tickAnim - 3) / 1) * (-11.19186-(-13.34862)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.90164 + (((tickAnim - 4) / 4) * (-26.61951-(-12.90164)));
            yy = -27.62111 + (((tickAnim - 4) / 4) * (-16.345-(-27.62111)));
            zz = -11.19186 + (((tickAnim - 4) / 4) * (-12.54725-(-11.19186)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -26.61951 + (((tickAnim - 8) / 2) * (6.16262-(-26.61951)));
            yy = -16.345 + (((tickAnim - 8) / 2) * (-5.06889-(-16.345)));
            zz = -12.54725 + (((tickAnim - 8) / 2) * (-13.90264-(-12.54725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 29.21536 + (((tickAnim - 0) / 1) * (30.71196-(29.21536)));
            yy = -18.51386 + (((tickAnim - 0) / 1) * (-51.08325-(-18.51386)));
            zz = 47.46769 + (((tickAnim - 0) / 1) * (73.24733-(47.46769)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 30.71196 + (((tickAnim - 1) / 2) * (28.43349-(30.71196)));
            yy = -51.08325 + (((tickAnim - 1) / 2) * (-29.6039-(-51.08325)));
            zz = 73.24733 + (((tickAnim - 1) / 2) * (36.34125-(73.24733)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 28.43349 + (((tickAnim - 3) / 1) * (1.49143-(28.43349)));
            yy = -29.6039 + (((tickAnim - 3) / 1) * (-26.60879-(-29.6039)));
            zz = 36.34125 + (((tickAnim - 3) / 1) * (-0.01565-(36.34125)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 1.49143 + (((tickAnim - 4) / 2) * (-24.68234-(1.49143)));
            yy = -26.60879 + (((tickAnim - 4) / 2) * (-22.2769-(-26.60879)));
            zz = -0.01565 + (((tickAnim - 4) / 2) * (-9.26729-(-0.01565)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -24.68234 + (((tickAnim - 6) / 2) * (-37.29817-(-24.68234)));
            yy = -22.2769 + (((tickAnim - 6) / 2) * (-20.20955-(-22.2769)));
            zz = -9.26729 + (((tickAnim - 6) / 2) * (-14.27204-(-9.26729)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -37.29817 + (((tickAnim - 8) / 0) * (-42.8694-(-37.29817)));
            yy = -20.20955 + (((tickAnim - 8) / 0) * (-36.64266-(-20.20955)));
            zz = -14.27204 + (((tickAnim - 8) / 0) * (-16.62426-(-14.27204)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -42.8694 + (((tickAnim - 8) / 2) * (1124.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-1550-(-42.8694)));
            yy = -36.64266 + (((tickAnim - 8) / 2) * (-18.51386-(-36.64266)));
            zz = -16.62426 + (((tickAnim - 8) / 2) * (47.46769-(-16.62426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftleg3, frontLeftleg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftleg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.5-(0)));
            yy = 0.25 + (((tickAnim - 0) / 1) * (0-(0.25)));
            zz = 0.65 + (((tickAnim - 0) / 1) * (-0.35-(0.65)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0.5 + (((tickAnim - 1) / 2) * (0-(0.5)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = -0.35 + (((tickAnim - 1) / 2) * (0-(-0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-0.8-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.25-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.65-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.8 + (((tickAnim - 6) / 2) * (-0.15-(-0.8)));
            yy = 0.25 + (((tickAnim - 6) / 2) * (0-(0.25)));
            zz = 0.65 + (((tickAnim - 6) / 2) * (0.475-(0.65)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -0.15 + (((tickAnim - 8) / 0) * (-0.15-(-0.15)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0.475 + (((tickAnim - 8) / 0) * (0.025-(0.475)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.15 + (((tickAnim - 8) / 2) * (0-(-0.15)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.25-(0)));
            zz = 0.025 + (((tickAnim - 8) / 2) * (0.65-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftleg3.rotationPointX = this.frontLeftleg3.rotationPointX + (float)(xx);
        this.frontLeftleg3.rotationPointY = this.frontLeftleg3.rotationPointY - (float)(yy);
        this.frontLeftleg3.rotationPointZ = this.frontLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -61.92106 + (((tickAnim - 0) / 2) * (-137.6722-(-61.92106)));
            yy = -6.21185 + (((tickAnim - 0) / 2) * (-11.4145-(-6.21185)));
            zz = -58.34848 + (((tickAnim - 0) / 2) * (-128.94849-(-58.34848)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -137.6722 + (((tickAnim - 2) / 5) * (-6.54428-(-137.6722)));
            yy = -11.4145 + (((tickAnim - 2) / 5) * (-42.81725-(-11.4145)));
            zz = -128.94849 + (((tickAnim - 2) / 5) * (3.96214-(-128.94849)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -6.54428 + (((tickAnim - 7) / 3) * (-61.92106-(-6.54428)));
            yy = -42.81725 + (((tickAnim - 7) / 3) * (-6.21185-(-42.81725)));
            zz = 3.96214 + (((tickAnim - 7) / 3) * (-58.34848-(3.96214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.27071 + (((tickAnim - 0) / 2) * (-7.03457-(3.27071)));
            yy = 23.82337 + (((tickAnim - 0) / 2) * (50.36598-(23.82337)));
            zz = 12.84548 + (((tickAnim - 0) / 2) * (20.12066-(12.84548)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -7.03457 + (((tickAnim - 2) / 3) * (9.17621-(-7.03457)));
            yy = 50.36598 + (((tickAnim - 2) / 3) * (2.59007-(50.36598)));
            zz = 20.12066 + (((tickAnim - 2) / 3) * (21.21018-(20.12066)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 9.17621 + (((tickAnim - 5) / 2) * (-5.23828-(9.17621)));
            yy = 2.59007 + (((tickAnim - 5) / 2) * (51.88227-(2.59007)));
            zz = 21.21018 + (((tickAnim - 5) / 2) * (12.45973-(21.21018)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -5.23828 + (((tickAnim - 7) / 1) * (11.39801-(-5.23828)));
            yy = 51.88227 + (((tickAnim - 7) / 1) * (32.26212-(51.88227)));
            zz = 12.45973 + (((tickAnim - 7) / 1) * (13.35407-(12.45973)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11.39801 + (((tickAnim - 8) / 2) * (3.27071-(11.39801)));
            yy = 32.26212 + (((tickAnim - 8) / 2) * (23.82337-(32.26212)));
            zz = 13.35407 + (((tickAnim - 8) / 2) * (12.84548-(13.35407)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 113.67988 + (((tickAnim - 0) / 2) * (36.16117-(113.67988)));
            yy = 17.14752 + (((tickAnim - 0) / 2) * (6.4237-(17.14752)));
            zz = 112.44737 + (((tickAnim - 0) / 2) * (38.31673-(112.44737)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 36.16117 + (((tickAnim - 2) / 3) * (13.65097-(36.16117)));
            yy = 6.4237 + (((tickAnim - 2) / 3) * (5.60454-(6.4237)));
            zz = 38.31673 + (((tickAnim - 2) / 3) * (11.06476-(38.31673)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 13.65097 + (((tickAnim - 5) / 2) * (1.1692-(13.65097)));
            yy = 5.60454 + (((tickAnim - 5) / 2) * (-27.1016-(5.60454)));
            zz = 11.06476 + (((tickAnim - 5) / 2) * (-8.49101-(11.06476)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 1.1692 + (((tickAnim - 7) / 1) * (-17.50114-(1.1692)));
            yy = -27.1016 + (((tickAnim - 7) / 1) * (-31.35336-(-27.1016)));
            zz = -8.49101 + (((tickAnim - 7) / 1) * (11.63985-(-8.49101)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.50114 + (((tickAnim - 8) / 2) * (113.67988-(-17.50114)));
            yy = -31.35336 + (((tickAnim - 8) / 2) * (17.14752-(-31.35336)));
            zz = 11.63985 + (((tickAnim - 8) / 2) * (112.44737-(11.63985)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftleg3, backLeftleg3.rotateAngleX + (float) Math.toRadians(xx), backLeftleg3.rotateAngleY + (float) Math.toRadians(yy), backLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = -0.625 + (((tickAnim - 2) / 8) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftleg3.rotationPointX = this.backLeftleg3.rotationPointX + (float)(xx);
        this.backLeftleg3.rotationPointY = this.backLeftleg3.rotationPointY - (float)(yy);
        this.backLeftleg3.rotationPointZ = this.backLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 130.98116 + (((tickAnim - 0) / 2) * (105.38004-(130.98116)));
            yy = 43.32357 + (((tickAnim - 0) / 2) * (28.57273-(43.32357)));
            zz = -145.87389 + (((tickAnim - 0) / 2) * (-120.41121-(-145.87389)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 105.38004 + (((tickAnim - 2) / 3) * (-20.60839-(105.38004)));
            yy = 28.57273 + (((tickAnim - 2) / 3) * (20.71499-(28.57273)));
            zz = -120.41121 + (((tickAnim - 2) / 3) * (16.58068-(-120.41121)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -20.60839 + (((tickAnim - 5) / 2) * (-38.62142-(-20.60839)));
            yy = 20.71499 + (((tickAnim - 5) / 2) * (18.63496-(20.71499)));
            zz = 16.58068 + (((tickAnim - 5) / 2) * (24.40283-(16.58068)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -38.62142 + (((tickAnim - 7) / 3) * (130.98116-(-38.62142)));
            yy = 18.63496 + (((tickAnim - 7) / 3) * (43.32357-(18.63496)));
            zz = 24.40283 + (((tickAnim - 7) / 3) * (-145.87389-(24.40283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.84859 + (((tickAnim - 0) / 2) * (28.15782-(1.84859)));
            yy = -39.62993 + (((tickAnim - 0) / 2) * (-2.08879-(-39.62993)));
            zz = -11.24586 + (((tickAnim - 0) / 2) * (3.85638-(-11.24586)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 28.15782 + (((tickAnim - 2) / 3) * (-2.97929-(28.15782)));
            yy = -2.08879 + (((tickAnim - 2) / 3) * (-23.82337-(-2.08879)));
            zz = 3.85638 + (((tickAnim - 2) / 3) * (-12.84548-(3.85638)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2.97929 + (((tickAnim - 5) / 2) * (1.14825-(-2.97929)));
            yy = -23.82337 + (((tickAnim - 5) / 2) * (-44.51489-(-23.82337)));
            zz = -12.84548 + (((tickAnim - 5) / 2) * (-11.23533-(-12.84548)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 1.14825 + (((tickAnim - 7) / 1) * (0.28763-(1.14825)));
            yy = -44.51489 + (((tickAnim - 7) / 1) * (-35.89257-(-44.51489)));
            zz = -11.23533 + (((tickAnim - 7) / 1) * (-45.33377-(-11.23533)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.28763 + (((tickAnim - 8) / 1) * (12.31811-(0.28763)));
            yy = -35.89257 + (((tickAnim - 8) / 1) * (-37.76125-(-35.89257)));
            zz = -45.33377 + (((tickAnim - 8) / 1) * (-28.28981-(-45.33377)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 12.31811 + (((tickAnim - 9) / 1) * (1.84859-(12.31811)));
            yy = -37.76125 + (((tickAnim - 9) / 1) * (-39.62993-(-37.76125)));
            zz = -28.28981 + (((tickAnim - 9) / 1) * (-11.24586-(-28.28981)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10.23676 + (((tickAnim - 0) / 2) * (-18.99645-(10.23676)));
            yy = 1.66205 + (((tickAnim - 0) / 2) * (24.03013-(1.66205)));
            zz = -3.70406 + (((tickAnim - 0) / 2) * (15.62526-(-3.70406)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -18.99645 + (((tickAnim - 2) / 3) * (113.67988-(-18.99645)));
            yy = 24.03013 + (((tickAnim - 2) / 3) * (-17.14752-(24.03013)));
            zz = 15.62526 + (((tickAnim - 2) / 3) * (-112.44737-(15.62526)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 113.67988 + (((tickAnim - 5) / 2) * (38.39858-(113.67988)));
            yy = -17.14752 + (((tickAnim - 5) / 2) * (-13.56116-(-17.14752)));
            zz = -112.44737 + (((tickAnim - 5) / 2) * (-41.15408-(-112.44737)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 38.39858 + (((tickAnim - 7) / 1) * (19.94676-(38.39858)));
            yy = -13.56116 + (((tickAnim - 7) / 1) * (-7.64102-(-13.56116)));
            zz = -41.15408 + (((tickAnim - 7) / 1) * (-26.59019-(-41.15408)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.94676 + (((tickAnim - 8) / 2) * (10.23676-(19.94676)));
            yy = -7.64102 + (((tickAnim - 8) / 2) * (1.66205-(-7.64102)));
            zz = -26.59019 + (((tickAnim - 8) / 2) * (-3.70406-(-26.59019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightleg3, backRightleg3.rotateAngleX + (float) Math.toRadians(xx), backRightleg3.rotateAngleY + (float) Math.toRadians(yy), backRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 2) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -0.575 + (((tickAnim - 7) / 2) * (0.04-(-0.575)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.04 + (((tickAnim - 9) / 1) * (-0.55-(0.04)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightleg3.rotationPointX = this.backRightleg3.rotationPointX + (float)(xx);
        this.backRightleg3.rotationPointY = this.backRightleg3.rotationPointY - (float)(yy);
        this.backRightleg3.rotationPointZ = this.backRightleg3.rotationPointZ + (float)(zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTaquetochelys entity = (EntityPrehistoricFloraTaquetochelys) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+49))*2), main.rotateAngleY + (float) Math.toRadians(-1.7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*2));

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 18) * (0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5-(1.3)));
            zz = 0 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5 + (((tickAnim - 18) / 3) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-129))*-1.5-(0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25 + (((tickAnim - 18) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 21) / 15) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-129))*-1.5 + (((tickAnim - 21) / 15) * (2.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*-1-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-129))*-1.5)));
            zz = 0 + (((tickAnim - 21) / 15) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 2.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*-1 + (((tickAnim - 36) / 4) * (1.3-(2.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*-1)));
            zz = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25 + (((tickAnim - 36) / 4) * (0-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 27.80954 + (((tickAnim - 0) / 23) * (80.4495-(27.80954)));
            yy = -43.18954 + (((tickAnim - 0) / 23) * (-17.93319-(-43.18954)));
            zz = -14.09233 + (((tickAnim - 0) / 23) * (56.25197-(-14.09233)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 80.4495 + (((tickAnim - 23) / 10) * (33.39008-(80.4495)));
            yy = -17.93319 + (((tickAnim - 23) / 10) * (12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-17.93319)));
            zz = 56.25197 + (((tickAnim - 23) / 10) * (29.90096-(56.25197)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 33.39008 + (((tickAnim - 33) / 7) * (27.80954-(33.39008)));
            yy = 12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 33) / 7) * (-43.18954-(12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = 29.90096 + (((tickAnim - 33) / 7) * (-14.09233-(29.90096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -12.90164 + (((tickAnim - 0) / 23) * (6.16262-(-12.90164)));
            yy = 27.62111 + (((tickAnim - 0) / 23) * (5.06889-(27.62111)));
            zz = 11.19186 + (((tickAnim - 0) / 23) * (13.90264-(11.19186)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 6.16262 + (((tickAnim - 23) / 5) * (-9.02088-(6.16262)));
            yy = 5.06889 + (((tickAnim - 23) / 5) * (24.36759-(5.06889)));
            zz = 13.90264 + (((tickAnim - 23) / 5) * (9.59225-(13.90264)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -9.02088 + (((tickAnim - 28) / 5) * (-47.86637-(-9.02088)));
            yy = 24.36759 + (((tickAnim - 28) / 5) * (6.36473-(24.36759)));
            zz = 9.59225 + (((tickAnim - 28) / 5) * (13.34862-(9.59225)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -47.86637 + (((tickAnim - 33) / 7) * (-12.90164-(-47.86637)));
            yy = 6.36473 + (((tickAnim - 33) / 7) * (27.62111-(6.36473)));
            zz = 13.34862 + (((tickAnim - 33) / 7) * (11.19186-(13.34862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 1.49143 + (((tickAnim - 0) / 11) * (-49.75291-(1.49143)));
            yy = 26.60879 + (((tickAnim - 0) / 11) * (27.20171-(26.60879)));
            zz = 0.01565 + (((tickAnim - 0) / 11) * (10.88125-(0.01565)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -49.75291 + (((tickAnim - 11) / 6) * (-78.82844-(-49.75291)));
            yy = 27.20171 + (((tickAnim - 11) / 6) * (40.70419-(27.20171)));
            zz = 10.88125 + (((tickAnim - 11) / 6) * (18.30477-(10.88125)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -78.82844 + (((tickAnim - 17) / 6) * (-973.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*1000-(-78.82844)));
            yy = 40.70419 + (((tickAnim - 17) / 6) * (18.51386-(40.70419)));
            zz = 18.30477 + (((tickAnim - 17) / 6) * (-47.46769-(18.30477)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -973.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*1000 + (((tickAnim - 23) / 5) * (30.71196-(-973.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*1000)));
            yy = 18.51386 + (((tickAnim - 23) / 5) * (51.08325-(18.51386)));
            zz = -47.46769 + (((tickAnim - 23) / 5) * (-73.24733-(-47.46769)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 30.71196 + (((tickAnim - 28) / 5) * (28.43349-(30.71196)));
            yy = 51.08325 + (((tickAnim - 28) / 5) * (29.6039-(51.08325)));
            zz = -73.24733 + (((tickAnim - 28) / 5) * (-36.34125-(-73.24733)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 28.43349 + (((tickAnim - 33) / 7) * (1.49143-(28.43349)));
            yy = 29.6039 + (((tickAnim - 33) / 7) * (26.60879-(29.6039)));
            zz = -36.34125 + (((tickAnim - 33) / 7) * (0.01565-(-36.34125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightleg3, frontRightleg3.rotateAngleX + (float) Math.toRadians(xx), frontRightleg3.rotateAngleY + (float) Math.toRadians(yy), frontRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.675-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.525-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0.675 + (((tickAnim - 4) / 7) * (1.05-(0.675)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0.525 + (((tickAnim - 4) / 7) * (0.825-(0.525)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 1.05 + (((tickAnim - 11) / 6) * (0.725-(1.05)));
            yy = 0 + (((tickAnim - 11) / 6) * (-0.075-(0)));
            zz = 0.825 + (((tickAnim - 11) / 6) * (0.355-(0.825)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0.725 + (((tickAnim - 17) / 6) * (-0.1-(0.725)));
            yy = -0.075 + (((tickAnim - 17) / 6) * (0.35-(-0.075)));
            zz = 0.355 + (((tickAnim - 17) / 6) * (0.175-(0.355)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0.1 + (((tickAnim - 23) / 5) * (-0.5-(-0.1)));
            yy = 0.35 + (((tickAnim - 23) / 5) * (0-(0.35)));
            zz = 0.175 + (((tickAnim - 23) / 5) * (-0.35-(0.175)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 28) / 5) * (0.15-(-0.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0.575-(0)));
            zz = -0.35 + (((tickAnim - 28) / 5) * (-0.105-(-0.35)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0.15 + (((tickAnim - 33) / 7) * (0-(0.15)));
            yy = 0.575 + (((tickAnim - 33) / 7) * (0-(0.575)));
            zz = -0.105 + (((tickAnim - 33) / 7) * (0-(-0.105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightleg3.rotationPointX = this.frontRightleg3.rotationPointX + (float)(xx);
        this.frontRightleg3.rotationPointY = this.frontRightleg3.rotationPointY - (float)(yy);
        this.frontRightleg3.rotationPointZ = this.frontRightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*-2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*2));

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-0.1 + (((tickAnim - 18) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-0.1)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 21) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 15) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-0.1-(0)));
            zz = 0 + (((tickAnim - 21) / 15) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-0.1 + (((tickAnim - 36) / 4) * (0-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-0.1)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+50))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-3), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(-0.05);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+150))*-2), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-3), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+250))*-2), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*-3), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-1.25), neck5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*-3), neck5.rotateAngleZ + (float) Math.toRadians(0));
        this.neck5.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.03),(float)1);


        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.01);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);
        this.head.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-0.03),(float)1);


        this.jaw.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.1),(float)1);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-2.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*-5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+350))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 80.4495 + (((tickAnim - 0) / 9) * (33.39008-(80.4495)));
            yy = 17.93319 + (((tickAnim - 0) / 9) * (12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(17.93319)));
            zz = -56.25197 + (((tickAnim - 0) / 9) * (-29.90096-(-56.25197)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 33.39008 + (((tickAnim - 9) / 8) * (29.05954-(33.39008)));
            yy = 12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 9) / 8) * (43.18954-(12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = -29.90096 + (((tickAnim - 9) / 8) * (14.09233-(-29.90096)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 29.05954 + (((tickAnim - 17) / 23) * (80.4495-(29.05954)));
            yy = 43.18954 + (((tickAnim - 17) / 23) * (17.93319-(43.18954)));
            zz = 14.09233 + (((tickAnim - 17) / 23) * (-56.25197-(14.09233)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.16262 + (((tickAnim - 0) / 4) * (-9.02088-(6.16262)));
            yy = -5.06889 + (((tickAnim - 0) / 4) * (-24.36759-(-5.06889)));
            zz = -13.90264 + (((tickAnim - 0) / 4) * (-9.59225-(-13.90264)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -9.02088 + (((tickAnim - 4) / 5) * (-47.86637-(-9.02088)));
            yy = -24.36759 + (((tickAnim - 4) / 5) * (-6.36473-(-24.36759)));
            zz = -9.59225 + (((tickAnim - 4) / 5) * (-13.34862-(-9.59225)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -47.86637 + (((tickAnim - 9) / 8) * (-12.90164-(-47.86637)));
            yy = -6.36473 + (((tickAnim - 9) / 8) * (-27.62111-(-6.36473)));
            zz = -13.34862 + (((tickAnim - 9) / 8) * (-11.19186-(-13.34862)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -12.90164 + (((tickAnim - 17) / 11) * (-26.61951-(-12.90164)));
            yy = -27.62111 + (((tickAnim - 17) / 11) * (-16.345-(-27.62111)));
            zz = -11.19186 + (((tickAnim - 17) / 11) * (-12.54725-(-11.19186)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -26.61951 + (((tickAnim - 28) / 12) * (6.16262-(-26.61951)));
            yy = -16.345 + (((tickAnim - 28) / 12) * (-5.06889-(-16.345)));
            zz = -12.54725 + (((tickAnim - 28) / 12) * (-13.90264-(-12.54725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 29.21536 + (((tickAnim - 0) / 4) * (30.71196-(29.21536)));
            yy = -18.51386 + (((tickAnim - 0) / 4) * (-51.08325-(-18.51386)));
            zz = 47.46769 + (((tickAnim - 0) / 4) * (73.24733-(47.46769)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 30.71196 + (((tickAnim - 4) / 5) * (28.43349-(30.71196)));
            yy = -51.08325 + (((tickAnim - 4) / 5) * (-29.6039-(-51.08325)));
            zz = 73.24733 + (((tickAnim - 4) / 5) * (36.34125-(73.24733)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 28.43349 + (((tickAnim - 9) / 8) * (1.49143-(28.43349)));
            yy = -29.6039 + (((tickAnim - 9) / 8) * (-26.60879-(-29.6039)));
            zz = 36.34125 + (((tickAnim - 9) / 8) * (-0.01565-(36.34125)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1.49143 + (((tickAnim - 17) / 6) * (-24.68234-(1.49143)));
            yy = -26.60879 + (((tickAnim - 17) / 6) * (-22.2769-(-26.60879)));
            zz = -0.01565 + (((tickAnim - 17) / 6) * (-9.26729-(-0.01565)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -24.68234 + (((tickAnim - 23) / 5) * (-37.29817-(-24.68234)));
            yy = -22.2769 + (((tickAnim - 23) / 5) * (-20.20955-(-22.2769)));
            zz = -9.26729 + (((tickAnim - 23) / 5) * (-14.27204-(-9.26729)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -37.29817 + (((tickAnim - 28) / 6) * (-67.9694-(-37.29817)));
            yy = -20.20955 + (((tickAnim - 28) / 6) * (-36.64266-(-20.20955)));
            zz = -14.27204 + (((tickAnim - 28) / 6) * (-16.62426-(-14.27204)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -67.9694 + (((tickAnim - 34) / 6) * (1369.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-1550-(-67.9694)));
            yy = -36.64266 + (((tickAnim - 34) / 6) * (-18.51386-(-36.64266)));
            zz = -16.62426 + (((tickAnim - 34) / 6) * (47.46769-(-16.62426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftleg3, frontLeftleg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftleg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.5-(0)));
            yy = 0.25 + (((tickAnim - 0) / 4) * (0-(0.25)));
            zz = 0.65 + (((tickAnim - 0) / 4) * (-0.35-(0.65)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0.5 + (((tickAnim - 4) / 5) * (-0.15-(0.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (0.575-(0)));
            zz = -0.35 + (((tickAnim - 4) / 5) * (0.105-(-0.35)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -0.15 + (((tickAnim - 9) / 8) * (0-(-0.15)));
            yy = 0.575 + (((tickAnim - 9) / 8) * (0-(0.575)));
            zz = 0.105 + (((tickAnim - 9) / 8) * (0-(0.105)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (-0.8-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0.25-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0.8 + (((tickAnim - 23) / 5) * (-0.15-(-0.8)));
            yy = 0.25 + (((tickAnim - 23) / 5) * (0-(0.25)));
            zz = 0.65 + (((tickAnim - 23) / 5) * (0.475-(0.65)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -0.15 + (((tickAnim - 28) / 6) * (-0.15-(-0.15)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0.475 + (((tickAnim - 28) / 6) * (0.025-(0.475)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -0.15 + (((tickAnim - 34) / 6) * (0-(-0.15)));
            yy = 0 + (((tickAnim - 34) / 6) * (0.25-(0)));
            zz = 0.025 + (((tickAnim - 34) / 6) * (0.65-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftleg3.rotationPointX = this.frontLeftleg3.rotationPointX + (float)(xx);
        this.frontLeftleg3.rotationPointY = this.frontLeftleg3.rotationPointY - (float)(yy);
        this.frontLeftleg3.rotationPointZ = this.frontLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -61.92106 + (((tickAnim - 0) / 7) * (-137.6722-(-61.92106)));
            yy = -6.21185 + (((tickAnim - 0) / 7) * (-11.4145-(-6.21185)));
            zz = -58.34848 + (((tickAnim - 0) / 7) * (-128.94849-(-58.34848)));
        }
        else if (tickAnim >= 7 && tickAnim < 27) {
            xx = -137.6722 + (((tickAnim - 7) / 20) * (-6.54428-(-137.6722)));
            yy = -11.4145 + (((tickAnim - 7) / 20) * (-42.81725-(-11.4145)));
            zz = -128.94849 + (((tickAnim - 7) / 20) * (3.96214-(-128.94849)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -6.54428 + (((tickAnim - 27) / 13) * (-61.92106-(-6.54428)));
            yy = -42.81725 + (((tickAnim - 27) / 13) * (-6.21185-(-42.81725)));
            zz = 3.96214 + (((tickAnim - 27) / 13) * (-58.34848-(3.96214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3.27071 + (((tickAnim - 0) / 7) * (-7.03457-(3.27071)));
            yy = 23.82337 + (((tickAnim - 0) / 7) * (50.36598-(23.82337)));
            zz = 12.84548 + (((tickAnim - 0) / 7) * (20.12066-(12.84548)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -7.03457 + (((tickAnim - 7) / 13) * (9.17621-(-7.03457)));
            yy = 50.36598 + (((tickAnim - 7) / 13) * (2.59007-(50.36598)));
            zz = 20.12066 + (((tickAnim - 7) / 13) * (21.21018-(20.12066)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 9.17621 + (((tickAnim - 20) / 7) * (-5.23828-(9.17621)));
            yy = 2.59007 + (((tickAnim - 20) / 7) * (51.88227-(2.59007)));
            zz = 21.21018 + (((tickAnim - 20) / 7) * (12.45973-(21.21018)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -5.23828 + (((tickAnim - 27) / 6) * (11.39801-(-5.23828)));
            yy = 51.88227 + (((tickAnim - 27) / 6) * (32.26212-(51.88227)));
            zz = 12.45973 + (((tickAnim - 27) / 6) * (13.35407-(12.45973)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 11.39801 + (((tickAnim - 33) / 7) * (3.27071-(11.39801)));
            yy = 32.26212 + (((tickAnim - 33) / 7) * (23.82337-(32.26212)));
            zz = 13.35407 + (((tickAnim - 33) / 7) * (12.84548-(13.35407)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 113.67988 + (((tickAnim - 0) / 7) * (36.16117-(113.67988)));
            yy = 17.14752 + (((tickAnim - 0) / 7) * (6.4237-(17.14752)));
            zz = 112.44737 + (((tickAnim - 0) / 7) * (38.31673-(112.44737)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 36.16117 + (((tickAnim - 7) / 13) * (13.65097-(36.16117)));
            yy = 6.4237 + (((tickAnim - 7) / 13) * (5.60454-(6.4237)));
            zz = 38.31673 + (((tickAnim - 7) / 13) * (11.06476-(38.31673)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 13.65097 + (((tickAnim - 20) / 7) * (1.1692-(13.65097)));
            yy = 5.60454 + (((tickAnim - 20) / 7) * (-27.1016-(5.60454)));
            zz = 11.06476 + (((tickAnim - 20) / 7) * (-8.49101-(11.06476)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 1.1692 + (((tickAnim - 27) / 6) * (-17.50114-(1.1692)));
            yy = -27.1016 + (((tickAnim - 27) / 6) * (-31.35336-(-27.1016)));
            zz = -8.49101 + (((tickAnim - 27) / 6) * (11.63985-(-8.49101)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -17.50114 + (((tickAnim - 33) / 7) * (113.67988-(-17.50114)));
            yy = -31.35336 + (((tickAnim - 33) / 7) * (17.14752-(-31.35336)));
            zz = 11.63985 + (((tickAnim - 33) / 7) * (112.44737-(11.63985)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftleg3, backLeftleg3.rotateAngleX + (float) Math.toRadians(xx), backLeftleg3.rotateAngleY + (float) Math.toRadians(yy), backLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 7) / 33) * (0-(0)));
            yy = -0.625 + (((tickAnim - 7) / 33) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 7) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftleg3.rotationPointX = this.backLeftleg3.rotationPointX + (float)(xx);
        this.backLeftleg3.rotationPointY = this.backLeftleg3.rotationPointY - (float)(yy);
        this.backLeftleg3.rotationPointZ = this.backLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 130.98116 + (((tickAnim - 0) / 5) * (105.38004-(130.98116)));
            yy = 43.32357 + (((tickAnim - 0) / 5) * (28.57273-(43.32357)));
            zz = -145.87389 + (((tickAnim - 0) / 5) * (-120.41121-(-145.87389)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 105.38004 + (((tickAnim - 5) / 15) * (-20.60839-(105.38004)));
            yy = 28.57273 + (((tickAnim - 5) / 15) * (20.71499-(28.57273)));
            zz = -120.41121 + (((tickAnim - 5) / 15) * (16.58068-(-120.41121)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -20.60839 + (((tickAnim - 20) / 5) * (-38.62142-(-20.60839)));
            yy = 20.71499 + (((tickAnim - 20) / 5) * (18.63496-(20.71499)));
            zz = 16.58068 + (((tickAnim - 20) / 5) * (24.40283-(16.58068)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -38.62142 + (((tickAnim - 25) / 15) * (130.98116-(-38.62142)));
            yy = 18.63496 + (((tickAnim - 25) / 15) * (43.32357-(18.63496)));
            zz = 24.40283 + (((tickAnim - 25) / 15) * (-145.87389-(24.40283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.84859 + (((tickAnim - 0) / 5) * (28.15782-(1.84859)));
            yy = -39.62993 + (((tickAnim - 0) / 5) * (-2.08879-(-39.62993)));
            zz = -11.24586 + (((tickAnim - 0) / 5) * (3.85638-(-11.24586)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 28.15782 + (((tickAnim - 5) / 15) * (-2.97929-(28.15782)));
            yy = -2.08879 + (((tickAnim - 5) / 15) * (-23.82337-(-2.08879)));
            zz = 3.85638 + (((tickAnim - 5) / 15) * (-12.84548-(3.85638)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.97929 + (((tickAnim - 20) / 5) * (1.14825-(-2.97929)));
            yy = -23.82337 + (((tickAnim - 20) / 5) * (-44.51489-(-23.82337)));
            zz = -12.84548 + (((tickAnim - 20) / 5) * (-11.23533-(-12.84548)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 1.14825 + (((tickAnim - 25) / 8) * (0.28763-(1.14825)));
            yy = -44.51489 + (((tickAnim - 25) / 8) * (-35.89257-(-44.51489)));
            zz = -11.23533 + (((tickAnim - 25) / 8) * (-45.33377-(-11.23533)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0.28763 + (((tickAnim - 33) / 4) * (12.31811-(0.28763)));
            yy = -35.89257 + (((tickAnim - 33) / 4) * (-37.76125-(-35.89257)));
            zz = -45.33377 + (((tickAnim - 33) / 4) * (-28.28981-(-45.33377)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 12.31811 + (((tickAnim - 37) / 3) * (1.84859-(12.31811)));
            yy = -37.76125 + (((tickAnim - 37) / 3) * (-39.62993-(-37.76125)));
            zz = -28.28981 + (((tickAnim - 37) / 3) * (-11.24586-(-28.28981)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 10.23676 + (((tickAnim - 0) / 5) * (-18.99645-(10.23676)));
            yy = 1.66205 + (((tickAnim - 0) / 5) * (24.03013-(1.66205)));
            zz = -3.70406 + (((tickAnim - 0) / 5) * (15.62526-(-3.70406)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -18.99645 + (((tickAnim - 5) / 15) * (113.67988-(-18.99645)));
            yy = 24.03013 + (((tickAnim - 5) / 15) * (-17.14752-(24.03013)));
            zz = 15.62526 + (((tickAnim - 5) / 15) * (-112.44737-(15.62526)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 113.67988 + (((tickAnim - 20) / 5) * (38.39858-(113.67988)));
            yy = -17.14752 + (((tickAnim - 20) / 5) * (-13.56116-(-17.14752)));
            zz = -112.44737 + (((tickAnim - 20) / 5) * (-41.15408-(-112.44737)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 38.39858 + (((tickAnim - 25) / 6) * (19.94676-(38.39858)));
            yy = -13.56116 + (((tickAnim - 25) / 6) * (-7.64102-(-13.56116)));
            zz = -41.15408 + (((tickAnim - 25) / 6) * (-26.59019-(-41.15408)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 19.94676 + (((tickAnim - 31) / 9) * (10.23676-(19.94676)));
            yy = -7.64102 + (((tickAnim - 31) / 9) * (1.66205-(-7.64102)));
            zz = -26.59019 + (((tickAnim - 31) / 9) * (-3.70406-(-26.59019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightleg3, backRightleg3.rotateAngleX + (float) Math.toRadians(xx), backRightleg3.rotateAngleY + (float) Math.toRadians(yy), backRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 5) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -0.575 + (((tickAnim - 25) / 10) * (0.04-(-0.575)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.04 + (((tickAnim - 35) / 5) * (-0.55-(0.04)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightleg3.rotationPointX = this.backRightleg3.rotationPointX + (float)(xx);
        this.backRightleg3.rotationPointY = this.backRightleg3.rotationPointY - (float)(yy);
        this.backRightleg3.rotationPointZ = this.backRightleg3.rotationPointZ + (float)(zz);


    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTaquetochelys entity = (EntityPrehistoricFloraTaquetochelys) entitylivingbaseIn;
        int animCycle = 420;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = 1.25 + (((tickAnim - 60) / 320) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 60) / 320) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 320) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 1.25 + (((tickAnim - 380) / 40) * (0-(1.25)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 60) / 320) * (0-(0)));
            yy = -0.325 + (((tickAnim - 60) / 320) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 60) / 320) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            yy = -0.325 + (((tickAnim - 380) / 40) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = -3.25 + (((tickAnim - 60) / 320) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 60) / 320) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 320) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -3.25 + (((tickAnim - 380) / 40) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.6423-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.13143-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-1.35718-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = 3.6423 + (((tickAnim - 60) / 320) * (3.6423-(3.6423)));
            yy = 0.13143 + (((tickAnim - 60) / 320) * (0.13143-(0.13143)));
            zz = -1.35718 + (((tickAnim - 60) / 320) * (-1.35718-(-1.35718)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 3.6423 + (((tickAnim - 380) / 40) * (0-(3.6423)));
            yy = 0.13143 + (((tickAnim - 380) / 40) * (0-(0.13143)));
            zz = -1.35718 + (((tickAnim - 380) / 40) * (0-(-1.35718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightleg3, frontRightleg3.rotateAngleX + (float) Math.toRadians(xx), frontRightleg3.rotateAngleY + (float) Math.toRadians(yy), frontRightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = -6.5 + (((tickAnim - 60) / 216) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 60) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 216) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = -6.5 + (((tickAnim - 276) / 104) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -6.5 + (((tickAnim - 380) / 40) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = -10 + (((tickAnim - 60) / 216) * (-10-(-10)));
            yy = 0 + (((tickAnim - 60) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 216) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = -10 + (((tickAnim - 276) / 104) * (-10-(-10)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -10 + (((tickAnim - 380) / 40) * (0-(-10)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = -8.75 + (((tickAnim - 60) / 216) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 60) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 216) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = -8.75 + (((tickAnim - 276) / 104) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -8.75 + (((tickAnim - 380) / 40) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = -4 + (((tickAnim - 60) / 216) * (-4-(-4)));
            yy = 0 + (((tickAnim - 60) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 216) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = -4 + (((tickAnim - 276) / 104) * (-4-(-4)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -4 + (((tickAnim - 380) / 40) * (0-(-4)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = 3.25 + (((tickAnim - 60) / 216) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 60) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 216) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = 3.25 + (((tickAnim - 276) / 104) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 3.25 + (((tickAnim - 380) / 40) * (0-(3.25)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 241) {
            xx = 6 + (((tickAnim - 60) / 181) * (6-(6)));
            yy = 0 + (((tickAnim - 60) / 181) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 181) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 256) {
            xx = 6 + (((tickAnim - 241) / 15) * (-3.5-(6)));
            yy = 0 + (((tickAnim - 241) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 15) * (0-(0)));
        }
        else if (tickAnim >= 256 && tickAnim < 263) {
            xx = -3.5 + (((tickAnim - 256) / 7) * (-4.5-(-3.5)));
            yy = 0 + (((tickAnim - 256) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 256) / 7) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 276) {
            xx = -4.5 + (((tickAnim - 263) / 13) * (6-(-4.5)));
            yy = 0 + (((tickAnim - 263) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 13) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = 6 + (((tickAnim - 276) / 104) * (6-(6)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 6 + (((tickAnim - 380) / 40) * (0-(6)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 125 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 125) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 125) / 5) * (0.02-(1)));
            zz = 1 + (((tickAnim - 125) / 5) * (1-(1)));
        }
        else if (tickAnim >= 130 && tickAnim < 135) {
            xx = 1 + (((tickAnim - 130) / 5) * (1-(1)));
            yy = 0.02 + (((tickAnim - 130) / 5) * (1-(0.02)));
            zz = 1 + (((tickAnim - 130) / 5) * (1-(1)));
        }
        else if (tickAnim >= 135 && tickAnim < 241) {
            xx = 1 + (((tickAnim - 135) / 106) * (1-(1)));
            yy = 1 + (((tickAnim - 135) / 106) * (1-(1)));
            zz = 1 + (((tickAnim - 135) / 106) * (1-(1)));
        }
        else if (tickAnim >= 241 && tickAnim < 256) {
            xx = 1 + (((tickAnim - 241) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 241) / 15) * (0.17-(1)));
            zz = 1 + (((tickAnim - 241) / 15) * (1-(1)));
        }
        else if (tickAnim >= 256 && tickAnim < 263) {
            xx = 1 + (((tickAnim - 256) / 7) * (1-(1)));
            yy = 0.17 + (((tickAnim - 256) / 7) * (0.055-(0.17)));
            zz = 1 + (((tickAnim - 256) / 7) * (1-(1)));
        }
        else if (tickAnim >= 263 && tickAnim < 276) {
            xx = 1 + (((tickAnim - 263) / 13) * (1-(1)));
            yy = 0.055 + (((tickAnim - 263) / 13) * (1-(0.055)));
            zz = 1 + (((tickAnim - 263) / 13) * (1-(1)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = 1 + (((tickAnim - 276) / 104) * (1-(1)));
            yy = 1 + (((tickAnim - 276) / 104) * (1-(1)));
            zz = 1 + (((tickAnim - 276) / 104) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 126 && tickAnim < 131) {
            xx = 1 + (((tickAnim - 126) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 126) / 5) * (0.02-(1)));
            zz = 1 + (((tickAnim - 126) / 5) * (1-(1)));
        }
        else if (tickAnim >= 131 && tickAnim < 136) {
            xx = 1 + (((tickAnim - 131) / 5) * (1-(1)));
            yy = 0.02 + (((tickAnim - 131) / 5) * (1-(0.02)));
            zz = 1 + (((tickAnim - 131) / 5) * (1-(1)));
        }
        else if (tickAnim >= 136 && tickAnim < 241) {
            xx = 1 + (((tickAnim - 136) / 105) * (1-(1)));
            yy = 1 + (((tickAnim - 136) / 105) * (1-(1)));
            zz = 1 + (((tickAnim - 136) / 105) * (1-(1)));
        }
        else if (tickAnim >= 241 && tickAnim < 256) {
            xx = 1 + (((tickAnim - 241) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 241) / 15) * (0.17-(1)));
            zz = 1 + (((tickAnim - 241) / 15) * (1-(1)));
        }
        else if (tickAnim >= 256 && tickAnim < 263) {
            xx = 1 + (((tickAnim - 256) / 7) * (1-(1)));
            yy = 0.17 + (((tickAnim - 256) / 7) * (0.055-(0.17)));
            zz = 1 + (((tickAnim - 256) / 7) * (1-(1)));
        }
        else if (tickAnim >= 263 && tickAnim < 276) {
            xx = 1 + (((tickAnim - 263) / 13) * (1-(1)));
            yy = 0.055 + (((tickAnim - 263) / 13) * (1-(0.055)));
            zz = 1 + (((tickAnim - 263) / 13) * (1-(1)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = 1 + (((tickAnim - 276) / 104) * (1-(1)));
            yy = 1 + (((tickAnim - 276) / 104) * (1-(1)));
            zz = 1 + (((tickAnim - 276) / 104) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 241 && tickAnim < 256) {
            xx = 0 + (((tickAnim - 241) / 15) * (23.75-(0)));
            yy = 0 + (((tickAnim - 241) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 15) * (0-(0)));
        }
        else if (tickAnim >= 256 && tickAnim < 263) {
            xx = 23.75 + (((tickAnim - 256) / 7) * (27-(23.75)));
            yy = 0 + (((tickAnim - 256) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 256) / 7) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 268) {
            xx = 27 + (((tickAnim - 263) / 5) * (0-(27)));
            yy = 0 + (((tickAnim - 263) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 60 && tickAnim < 276) {
            xx = 1 + (((tickAnim - 60) / 216) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1 + (((tickAnim - 60) / 216) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1)));
            zz = 1 + (((tickAnim - 60) / 216) * (1-(1)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = 1 + (((tickAnim - 276) / 104) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1 + (((tickAnim - 276) / 104) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1)));
            zz = 1 + (((tickAnim - 276) / 104) * (1-(1)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 1 + (((tickAnim - 380) / 40) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1 + (((tickAnim - 380) / 40) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1)));
            zz = 1 + (((tickAnim - 380) / 40) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.jaw.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = -1.75 + (((tickAnim - 60) / 216) * (-1.25-(-1.75)));
            yy = 0 + (((tickAnim - 60) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 216) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = -1.25 + (((tickAnim - 276) / 104) * (0.25-(-1.25)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 0.25 + (((tickAnim - 380) / 40) * (0-(0.25)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = -2.5 + (((tickAnim - 60) / 320) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 320) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 320) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -2.5 + (((tickAnim - 380) / 40) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = -3.25 + (((tickAnim - 60) / 320) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 60) / 320) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 320) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -3.25 + (((tickAnim - 380) / 40) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.6423-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.13143-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (1.35718-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = 3.6423 + (((tickAnim - 60) / 320) * (3.6423-(3.6423)));
            yy = 0.13143 + (((tickAnim - 60) / 320) * (0.13143-(0.13143)));
            zz = 1.35718 + (((tickAnim - 60) / 320) * (1.35718-(1.35718)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 3.6423 + (((tickAnim - 380) / 40) * (0-(3.6423)));
            yy = 0.13143 + (((tickAnim - 380) / 40) * (0-(0.13143)));
            zz = 1.35718 + (((tickAnim - 380) / 40) * (0-(1.35718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftleg3, frontLeftleg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftleg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = 3 + (((tickAnim - 60) / 320) * (3-(3)));
            yy = 0 + (((tickAnim - 60) / 320) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 320) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 3 + (((tickAnim - 380) / 40) * (0-(3)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-10.76319-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (3.27905-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-11.29556-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = -10.76319 + (((tickAnim - 60) / 320) * (-10.76319-(-10.76319)));
            yy = 3.27905 + (((tickAnim - 60) / 320) * (3.27905-(3.27905)));
            zz = -11.29556 + (((tickAnim - 60) / 320) * (-11.29556-(-11.29556)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -10.76319 + (((tickAnim - 380) / 40) * (0-(-10.76319)));
            yy = 3.27905 + (((tickAnim - 380) / 40) * (0-(3.27905)));
            zz = -11.29556 + (((tickAnim - 380) / 40) * (0-(-11.29556)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftleg3, backLeftleg3.rotateAngleX + (float) Math.toRadians(xx), backLeftleg3.rotateAngleY + (float) Math.toRadians(yy), backLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.backLeftleg3.rotationPointX = this.backLeftleg3.rotationPointX + (float)(0);
        this.backLeftleg3.rotationPointY = this.backLeftleg3.rotationPointY - (float)(0);
        this.backLeftleg3.rotationPointZ = this.backLeftleg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = 3 + (((tickAnim - 60) / 320) * (3-(3)));
            yy = 0 + (((tickAnim - 60) / 320) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 320) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 3 + (((tickAnim - 380) / 40) * (0-(3)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-10.76319-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (3.27905-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (11.29556-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = -10.76319 + (((tickAnim - 60) / 320) * (-10.76319-(-10.76319)));
            yy = 3.27905 + (((tickAnim - 60) / 320) * (3.27905-(3.27905)));
            zz = 11.29556 + (((tickAnim - 60) / 320) * (11.29556-(11.29556)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -10.76319 + (((tickAnim - 380) / 40) * (0-(-10.76319)));
            yy = 3.27905 + (((tickAnim - 380) / 40) * (0-(3.27905)));
            zz = 11.29556 + (((tickAnim - 380) / 40) * (0-(11.29556)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightleg3, backRightleg3.rotateAngleX + (float) Math.toRadians(xx), backRightleg3.rotateAngleY + (float) Math.toRadians(yy), backRightleg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.backRightleg3.rotationPointX = this.backRightleg3.rotationPointX + (float)(0);
        this.backRightleg3.rotationPointY = this.backRightleg3.rotationPointY - (float)(0);
        this.backRightleg3.rotationPointZ = this.backRightleg3.rotationPointZ + (float)(0);
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTaquetochelys e = (EntityPrehistoricFloraTaquetochelys) entity;
        animator.update(entity);


    }
}
