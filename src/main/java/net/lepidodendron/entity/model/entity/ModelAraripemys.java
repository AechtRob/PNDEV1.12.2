package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAraripemys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAraripemys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer frontLeftleg3;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer frontRightleg3;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightleg3;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftleg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;

    private ModelAnimator animator;

    public ModelAraripemys() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 25.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 25, 9, -3.0F, -5.35F, -4.3F, 6, 2, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 23, 25, -3.0F, -4.35F, -4.55F, 6, 3, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 70, -2.5F, -2.325F, -4.55F, 5, 1, 5, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0F, -1.35F, -0.55F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 33, -4.0F, -2.0F, -4.0F, 4, 2, 5, -0.002F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0F, -5.35F, 0.7F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1743F, 0.0091F, 0.3134F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, 0.0F, 0.0F, 0.0F, 4, 0, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, -5.35F, 0.7F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.2967F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 41, 0.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, -5.35F, -4.3F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3922F, -0.02F, 0.3102F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 59, 0.0F, 0.0F, -3.0F, 4, 0, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.0F, -5.35F, 0.7F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1743F, -0.0091F, -0.3134F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 26, -4.0F, 0.0F, 0.0F, 4, 0, 7, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.0F, -5.35F, 0.7F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.2967F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 41, -4.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.0F, -5.35F, -4.3F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3922F, 0.02F, -0.3102F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 59, -4.0F, 0.0F, -3.0F, 4, 0, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.752F, 8.9629F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 17, -2.5F, 0.025F, -6.075F, 5, 1, 6, 0.001F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(7.5647F, -2.3111F, 3.5806F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0871F, 1.0886F, 0.1097F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 33, -4.0F, -2.0F, -4.0F, 4, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(5.721F, -2.5142F, 7.1246F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0445F, 0.4353F, 0.0513F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 0, -4.0F, -2.0F, -6.0F, 4, 1, 6, 0.002F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(8.4312F, -2.2939F, -0.3243F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0077F, 1.3524F, 0.0198F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, -4.0F, -2.0F, -7.0F, 4, 1, 7, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(7.5663F, -2.298F, -4.2297F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 3.1339F, 1.3529F, -3.1368F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 42, -4.0F, -2.0F, -4.0F, 4, 1, 4, -0.004F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(4.6576F, -2.2697F, -8.1025F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -3.0954F, 0.6103F, -3.0843F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 60, -2.0F, -2.225F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(6.3008F, -2.4007F, -6.9478F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -3.0801F, 1.1338F, -3.0606F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 53, -3.0F, -2.0F, -4.0F, 3, 1, 4, -0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.6585F, -2.3312F, -8.1023F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -3.1037F, -0.0001F, -3.1109F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 59, 30, -2.0F, -2.225F, -4.0F, 2, 1, 4, 0.002F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.6585F, -2.3312F, -8.1023F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -3.0979F, -0.5233F, -3.1327F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 50, 0, 0.0F, -2.225F, -4.0F, 3, 1, 4, 0.004F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.6585F, -2.3312F, -8.1023F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -3.0979F, 0.5233F, 3.1327F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 50, 0, -3.0F, -2.225F, -4.0F, 3, 1, 4, 0.004F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.6585F, -2.3312F, -8.1023F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -3.1037F, 0.0001F, 3.1109F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 59, 30, 0.0F, -2.225F, -4.0F, 2, 1, 4, 0.002F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.6576F, -2.2697F, -8.1025F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -3.0954F, -0.6103F, 3.0843F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 60, 0.0F, -2.225F, -4.0F, 2, 1, 4, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-6.3008F, -2.4007F, -6.9478F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -3.0801F, -1.1338F, 3.0606F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 53, 0.0F, -2.0F, -4.0F, 3, 1, 4, -0.002F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-7.5663F, -2.298F, -4.2297F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 3.1339F, -1.3529F, 3.1368F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 42, 0.0F, -2.0F, -4.0F, 4, 1, 4, -0.004F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-8.4312F, -2.2939F, -0.3243F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0077F, -1.3524F, -0.0198F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 17, 0.0F, -2.0F, -7.0F, 4, 1, 7, -0.002F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-7.5647F, -2.3111F, 3.5806F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0871F, -1.0886F, -0.1097F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 42, 33, 0.0F, -2.0F, -4.0F, 4, 1, 4, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-5.721F, -2.5142F, 7.1246F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0445F, -0.4353F, -0.0513F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 29, 0, 0.0F, -2.0F, -6.0F, 4, 1, 6, 0.002F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.0F, -1.35F, -0.55F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.1745F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 23, 33, 0.0F, -2.0F, -4.0F, 4, 2, 5, -0.002F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -2.3081F, 5.6224F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.096F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -4.0F, -1.9F, -6.0F, 8, 2, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -1.35F, 0.45F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 34, -2.0F, -2.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.35F, -4.55F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 64, -1.0F, -1.0F, -4.0F, 2, 1, 2, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 53, 46, -2.5F, -2.0F, -2.0F, 5, 2, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -5.35F, 0.7F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1309F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 9, -3.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -5.35F, -4.3F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3054F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 38, 41, -3.0F, 0.0F, -3.0F, 6, 1, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.7F, -5.85F);
        this.main.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 48, 8, -2.0F, -1.5F, -2.75F, 4, 2, 3, 0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 45, 53, -2.0F, 0.0F, -2.75F, 4, 1, 3, 0.008F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 55, -1.5F, -1.5F, -2.75F, 3, 2, 3, 0.008F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 60, 51, -1.5F, 0.0F, -2.75F, 3, 1, 3, 0.006F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 61, -1.5F, 0.0F, -2.75F, 3, 1, 3, 0.004F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 57, 39, -1.5F, -1.5F, -2.75F, 3, 2, 3, 0.006F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck3.addChild(neck4);
        this.neck4.cubeList.add(new ModelBox(neck4, 61, 23, -1.5F, 0.0F, -2.75F, 3, 1, 3, 0.002F, false));
        this.neck4.cubeList.add(new ModelBox(neck4, 45, 58, -1.5F, -1.5F, -2.75F, 3, 2, 3, 0.004F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.neck4.addChild(neck5);
        this.neck5.cubeList.add(new ModelBox(neck5, 58, 58, -1.5F, -0.5F, -2.75F, 3, 2, 3, 0.003F, false));
        this.neck5.cubeList.add(new ModelBox(neck5, 63, 6, -1.5F, 1.0F, -2.75F, 3, 1, 3, 0.002F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.neck5.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 46, 64, -0.5F, -0.8F, -3.65F, 1, 1, 3, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 63, 17, -1.5F, -1.5F, -1.75F, 3, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 30, -1.5F, 0.0F, -0.75F, 3, 1, 1, -0.002F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, -0.8F, -3.675F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3054F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 14, 66, -1.0F, 0.0075F, 0.0238F, 1, 1, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.427F, -0.8F, -3.5755F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2673F, -0.5019F, -0.1207F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 7, 66, 0.0062F, 0.0F, 0.1579F, 1, 1, 2, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.4763F, -1.0F, -3.4884F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.5149F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 66, 0.0062F, 0.2F, 0.0579F, 1, 1, 2, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.427F, -0.8F, -3.5755F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2673F, 0.5019F, 0.1207F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 7, 66, -1.0062F, 0.0F, 0.1579F, 1, 1, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.4763F, -1.0F, -3.4884F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.5149F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 66, -1.0062F, 0.2F, 0.0579F, 1, 1, 2, 0.0F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(0.45F, -0.45F, -2.45F);
        this.head.addChild(eye1);
        this.setRotateAngle(eye1, -0.0873F, 0.1745F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5095F, 0.3789F, -0.141F);
        this.eye1.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1203F, 0.3527F, -0.0078F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 48, 14, -0.9F, -1.025F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.45F, -0.45F, -2.45F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, -0.0873F, -0.1745F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5095F, 0.3789F, -0.141F);
        this.eye2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1203F, -0.3527F, 0.0078F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 48, 14, -0.1F, -1.025F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.25F, -0.75F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 63, -1.0F, -0.25F, -1.0F, 3, 1, 2, -0.004F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 65, 0, -0.5F, -0.75F, -1.25F, 2, 1, 2, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 64, 0.0F, -0.25F, -2.875F, 1, 1, 3, -0.005F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.7F, -1.25F, -0.85F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.5149F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 30, 48, -0.2938F, 1.0F, -1.9421F, 1, 1, 2, -0.006F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.7F, -1.25F, -0.85F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.5149F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 30, 48, -0.7062F, 1.0F, -1.9421F, 1, 1, 2, -0.006F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.1927F, -2.549F, -4.9171F);
        this.main.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.2612F, -0.6264F, 0.0127F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.4234F, -0.4961F, 1.9171F);
        this.frontLeftLeg.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.6545F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 46, 23, -1.4956F, -0.508F, -5.75F, 3, 2, 4, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(2.0859F, -0.0042F, -2.0298F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, 0.0F, 0.8639F, 0.0F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.3589F, -0.492F, -0.2399F);
        this.frontLeftLeg2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, -0.829F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 15, 54, -1.4956F, -0.508F, -3.0F, 3, 2, 3, -0.002F, false));

        this.frontLeftleg3 = new AdvancedModelRenderer(this);
        this.frontLeftleg3.setRotationPoint(1.5302F, -0.572F, -1.9062F);
        this.frontLeftLeg2.addChild(frontLeftleg3);
        this.setRotateAngle(frontLeftleg3, -0.1712F, 0.5435F, -0.3227F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.1743F, -0.442F, -0.1046F);
        this.frontLeftleg3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -1.1781F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 15, 48, -1.3869F, 0.492F, -4.0901F, 3, 1, 4, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.1927F, -2.549F, -4.9171F);
        this.main.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.2612F, 0.6264F, -0.0127F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.4234F, -0.4961F, 1.9171F);
        this.frontRightLeg.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.6545F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 46, 23, -1.5044F, -0.508F, -5.75F, 3, 2, 4, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-2.0859F, -0.0042F, -2.0298F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, 0.0F, -0.8639F, 0.0F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.3589F, -0.492F, -0.2399F);
        this.frontRightLeg2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.829F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 15, 54, -1.5044F, -0.508F, -3.0F, 3, 2, 3, -0.002F, true));

        this.frontRightleg3 = new AdvancedModelRenderer(this);
        this.frontRightleg3.setRotationPoint(-1.5302F, -0.572F, -1.9062F);
        this.frontRightLeg2.addChild(frontRightleg3);
        this.setRotateAngle(frontRightleg3, -0.1712F, -0.5435F, 0.3227F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.1743F, -0.442F, -0.1046F);
        this.frontRightleg3.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 1.1781F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 15, 48, -1.6131F, 0.492F, -4.0901F, 3, 1, 4, 0.0F, true));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.7233F, -2.8716F, 3.7038F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.1745F, -1.1345F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 38, 46, -1.4544F, -1.008F, -0.9389F, 3, 2, 4, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.4F, -0.5F, 2.025F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, -0.1468F, 0.7699F, 0.1644F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 48, -1.4544F, -0.508F, 0.0111F, 3, 2, 4, -0.002F, true));

        this.backRightleg3 = new AdvancedModelRenderer(this);
        this.backRightleg3.setRotationPoint(0.6778F, 0.2778F, 2.4284F);
        this.backRightLeg2.addChild(backRightleg3);
        this.setRotateAngle(backRightleg3, 0.8198F, -1.1092F, -0.7645F);
        this.backRightleg3.cubeList.add(new ModelBox(backRightleg3, 46, 17, -2.0131F, -0.008F, -0.1258F, 4, 1, 4, 0.0F, true));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.7233F, -2.8716F, 3.7038F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.1745F, 1.1345F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 38, 46, -1.5456F, -1.008F, -0.9389F, 3, 2, 4, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.4F, -0.5F, 2.025F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, -0.1468F, -0.7699F, -0.1644F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 48, -1.5456F, -0.508F, 0.0111F, 3, 2, 4, -0.002F, false));

        this.backLeftleg3 = new AdvancedModelRenderer(this);
        this.backLeftleg3.setRotationPoint(-0.6778F, 0.2778F, 2.4284F);
        this.backLeftLeg2.addChild(backLeftleg3);
        this.setRotateAngle(backLeftleg3, 0.8198F, 1.1092F, 0.7645F);
        this.backLeftleg3.cubeList.add(new ModelBox(backLeftleg3, 46, 17, -1.9869F, -0.008F, -0.1258F, 4, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.4117F, 4.8051F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 63, 11, -1.0F, -1.0F, -0.25F, 2, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2058F, 2.4545F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 55, 64, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));


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
        this.main.offsetX = -0.3F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.2F);
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

        EntityPrehistoricFloraAraripemys entityAraripemys = (EntityPrehistoricFloraAraripemys) e;

        if (entityAraripemys.getAnimation() == entityAraripemys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3};

        if (entityAraripemys.getAnimation() == entityAraripemys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityAraripemys.isReallyInWater()) {

                if (f3 == 0.0F || !entityAraripemys.getIsMoving()) {
                    if (entityAraripemys.getAnimation() != entityAraripemys.EAT_ANIMATION
                        && entityAraripemys.getAnimation() != entityAraripemys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityAraripemys.getIsFast()) { //Running


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

        EntityPrehistoricFloraAraripemys ee = (EntityPrehistoricFloraAraripemys) entitylivingbaseIn;

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
        EntityPrehistoricFloraAraripemys entity = (EntityPrehistoricFloraAraripemys) entitylivingbaseIn;
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
            xx = 0 + (((tickAnim - 0) / 20) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.25 + (((tickAnim - 20) / 10) * (28.17689-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (33.17505-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-82.12805-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 28.17689 + (((tickAnim - 30) / 20) * (0-(28.17689)));
            yy = 33.17505 + (((tickAnim - 30) / 20) * (0-(33.17505)));
            zz = -82.12805 + (((tickAnim - 30) / 20) * (0-(-82.12805)));
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
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-18.5-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -18.5 + (((tickAnim - 30) / 20) * (0-(-18.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 20) / 10) * (-77.36079-(7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (50.49448-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (43.87539-(0)));
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
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 18.5 + (((tickAnim - 40) / 10) * (0-(18.5)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.86079-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-50.49448-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-43.87539-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -25 + (((tickAnim - 20) / 15) * (-39.25-(-25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -39.25 + (((tickAnim - 35) / 5) * (-25-(-39.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -14.25 + (((tickAnim - 20) / 15) * (7.5-(-14.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 35) / 5) * (-14.25-(7.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 40) / 10) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAraripemys entity = (EntityPrehistoricFloraAraripemys) entitylivingbaseIn;
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
        EntityPrehistoricFloraAraripemys entity = (EntityPrehistoricFloraAraripemys) entitylivingbaseIn;
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


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -1.1 + (((tickAnim - 10) / 1) * (-1.1-(-1.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -1.1 + (((tickAnim - 11) / 284) * (-1.1-(-1.1)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 295) / 8) * (0-(0)));
            yy = -1.1 + (((tickAnim - 295) / 8) * (0.275-(-1.1)));
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
            xx = 8.40874 + (((tickAnim - 5) / 6) * (20.67918-(8.40874)));
            yy = -39.57308 + (((tickAnim - 5) / 6) * (-42.92648-(-39.57308)));
            zz = 6.15592 + (((tickAnim - 5) / 6) * (20.48882-(6.15592)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 20.67918 + (((tickAnim - 11) / 284) * (20.67918-(20.67918)));
            yy = -42.92648 + (((tickAnim - 11) / 284) * (-42.92648-(-42.92648)));
            zz = 20.48882 + (((tickAnim - 11) / 284) * (20.48882-(20.48882)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 20.67918 + (((tickAnim - 295) / 8) * (0-(20.67918)));
            yy = -42.92648 + (((tickAnim - 295) / 8) * (0-(-42.92648)));
            zz = 20.48882 + (((tickAnim - 295) / 8) * (0-(20.48882)));
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




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (57.40035-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-50.67366-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (57.87417-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 57.40035 + (((tickAnim - 5) / 6) * (75.65572-(57.40035)));
            yy = -50.67366 + (((tickAnim - 5) / 6) * (-31.10631-(-50.67366)));
            zz = 57.87417 + (((tickAnim - 5) / 6) * (52.01705-(57.87417)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 75.65572 + (((tickAnim - 11) / 284) * (75.65572-(75.65572)));
            yy = -31.10631 + (((tickAnim - 11) / 284) * (-31.10631-(-31.10631)));
            zz = 52.01705 + (((tickAnim - 11) / 284) * (52.01705-(52.01705)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 75.65572 + (((tickAnim - 295) / 15) * (0-(75.65572)));
            yy = -31.10631 + (((tickAnim - 295) / 15) * (0-(-31.10631)));
            zz = 52.01705 + (((tickAnim - 295) / 15) * (0-(52.01705)));
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
            xx = 8.40874 + (((tickAnim - 5) / 6) * (20.67918-(8.40874)));
            yy = 39.57308 + (((tickAnim - 5) / 6) * (42.92648-(39.57308)));
            zz = -6.15592 + (((tickAnim - 5) / 6) * (-20.48882-(-6.15592)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 20.67918 + (((tickAnim - 11) / 284) * (20.67918-(20.67918)));
            yy = 42.92648 + (((tickAnim - 11) / 284) * (42.92648-(42.92648)));
            zz = -20.48882 + (((tickAnim - 11) / 284) * (-20.48882-(-20.48882)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 20.67918 + (((tickAnim - 295) / 8) * (0-(20.67918)));
            yy = 42.92648 + (((tickAnim - 295) / 8) * (0-(42.92648)));
            zz = -20.48882 + (((tickAnim - 295) / 8) * (0-(-20.48882)));
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
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-45.5-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -45.5 + (((tickAnim - 11) / 284) * (-45.5-(-45.5)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = -45.5 + (((tickAnim - 295) / 15) * (0-(-45.5)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (47-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 47 + (((tickAnim - 11) / 284) * (47-(47)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = 47 + (((tickAnim - 295) / 15) * (0-(47)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (115.06672-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (36.88106-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-114.10141-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 115.06672 + (((tickAnim - 11) / 284) * (115.06672-(115.06672)));
            yy = 36.88106 + (((tickAnim - 11) / 284) * (36.88106-(36.88106)));
            zz = -114.10141 + (((tickAnim - 11) / 284) * (-114.10141-(-114.10141)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 115.06672 + (((tickAnim - 295) / 15) * (0-(115.06672)));
            yy = 36.88106 + (((tickAnim - 295) / 15) * (0-(36.88106)));
            zz = -114.10141 + (((tickAnim - 295) / 15) * (0-(-114.10141)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightleg3, backRightleg3.rotateAngleX + (float) Math.toRadians(xx), backRightleg3.rotateAngleY + (float) Math.toRadians(yy), backRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (1.6-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 0.775 + (((tickAnim - 11) / 284) * (0.775-(0.775)));
            zz = 1.6 + (((tickAnim - 11) / 284) * (1.6-(1.6)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = 0.775 + (((tickAnim - 295) / 15) * (0-(0.775)));
            zz = 1.6 + (((tickAnim - 295) / 15) * (0-(1.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightleg3.rotationPointX = this.backRightleg3.rotationPointX + (float)(xx);
        this.backRightleg3.rotationPointY = this.backRightleg3.rotationPointY - (float)(yy);
        this.backRightleg3.rotationPointZ = this.backRightleg3.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (115.06672-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-36.88106-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (114.10141-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 115.06672 + (((tickAnim - 11) / 284) * (115.06672-(115.06672)));
            yy = -36.88106 + (((tickAnim - 11) / 284) * (-36.88106-(-36.88106)));
            zz = 114.10141 + (((tickAnim - 11) / 284) * (114.10141-(114.10141)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 115.06672 + (((tickAnim - 295) / 15) * (0-(115.06672)));
            yy = -36.88106 + (((tickAnim - 295) / 15) * (0-(-36.88106)));
            zz = 114.10141 + (((tickAnim - 295) / 15) * (0-(114.10141)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftleg3, backLeftleg3.rotateAngleX + (float) Math.toRadians(xx), backLeftleg3.rotateAngleY + (float) Math.toRadians(yy), backLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (1.6-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = 0.775 + (((tickAnim - 11) / 284) * (0.775-(0.775)));
            zz = 1.6 + (((tickAnim - 11) / 284) * (1.6-(1.6)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = 0.775 + (((tickAnim - 295) / 15) * (0-(0.775)));
            zz = 1.6 + (((tickAnim - 295) / 15) * (0-(1.6)));
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
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-69.5-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -69.5 + (((tickAnim - 11) / 284) * (-69.5-(-69.5)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = -69.5 + (((tickAnim - 295) / 15) * (0-(-69.5)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 11) / 284) * (0-(0)));
            yy = -32.5 + (((tickAnim - 11) / 284) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 11) / 284) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = -32.5 + (((tickAnim - 295) / 15) * (0-(-32.5)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAraripemys entity = (EntityPrehistoricFloraAraripemys) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+150))*1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+60))*10), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*6));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+120))*0.5);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+150))*-1.5), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*-6), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*-4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*6), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+190))*6), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*6), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0), neck5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+350))*6), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 70.7097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*32 + (((tickAnim - 0) / 7) * (65.0747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*32-(70.7097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*32)));
            yy = 49.957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15 + (((tickAnim - 0) / 7) * (55.0465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15-(49.957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-250))*-15)));
            zz = -45.61463 + (((tickAnim - 0) / 7) * (-37.85971-(-45.61463)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = 65.0747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*32 + (((tickAnim - 7) / 18) * (70.7097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*32-(65.0747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*32)));
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




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 30.8769541753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 0) / 4) * (26.45512-(30.8769541753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = 41.96322 + (((tickAnim - 0) / 4) * (14.8771-(41.96322)));
            zz = -81.40421 + (((tickAnim - 0) / 4) * (-78.506-(-81.40421)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 26.45512 + (((tickAnim - 4) / 9) * (115.37894-(26.45512)));
            yy = 14.8771 + (((tickAnim - 4) / 9) * (0.34061-(14.8771)));
            zz = -78.506 + (((tickAnim - 4) / 9) * (-113.74367-(-78.506)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 115.37894 + (((tickAnim - 13) / 4) * (210.141+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(115.37894)));
            yy = 0.34061 + (((tickAnim - 13) / 4) * (-131.353+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(0.34061)));
            zz = -113.74367 + (((tickAnim - 13) / 4) * (-114.08005-(-113.74367)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 210.141+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 17) / 8) * (30.87695-(210.141+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = -131.353+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 17) / 8) * (41.96322-(-131.353+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            zz = -114.08005 + (((tickAnim - 17) / 8) * (-81.40421-(-114.08005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -46+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 4) * (-16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-46+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (9.66761-(0)));
            yy = -16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 4) / 9) * (-1.16933-(-16.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 0 + (((tickAnim - 4) / 9) * (30.77595-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 9.66761 + (((tickAnim - 13) / 4) * (-0.27746-(9.66761)));
            yy = -1.16933 + (((tickAnim - 13) / 4) * (118.8541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(-1.16933)));
            zz = 30.77595 + (((tickAnim - 13) / 4) * (-22.49448-(30.77595)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -0.27746 + (((tickAnim - 17) / 8) * (0-(-0.27746)));
            yy = 118.8541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 17) / 8) * (-89.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(118.8541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            zz = -22.49448 + (((tickAnim - 17) / 8) * (0-(-22.49448)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0.375 + (((tickAnim - 0) / 13) * (0-(0.375)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0.8 + (((tickAnim - 0) / 13) * (0-(0.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0.375-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0.8-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -64.01493 + (((tickAnim - 0) / 13) * (0-(-64.01493)));
            yy = 56.51299 + (((tickAnim - 0) / 13) * (0-(56.51299)));
            zz = 47.75757 + (((tickAnim - 0) / 13) * (0-(47.75757)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-13.88762-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (60.20526-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (42.44148-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -13.88762 + (((tickAnim - 17) / 8) * (-64.01493-(-13.88762)));
            yy = 60.20526 + (((tickAnim - 17) / 8) * (56.51299-(60.20526)));
            zz = 42.44148 + (((tickAnim - 17) / 8) * (47.75757-(42.44148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightleg3, backRightleg3.rotateAngleX + (float) Math.toRadians(xx), backRightleg3.rotateAngleY + (float) Math.toRadians(yy), backRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.55 + (((tickAnim - 0) / 13) * (0-(-0.55)));
            yy = 0.55 + (((tickAnim - 0) / 13) * (0-(0.55)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-0.825-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -0.825 + (((tickAnim - 17) / 8) * (-0.55-(-0.825)));
            yy = 0 + (((tickAnim - 17) / 8) * (0.55-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightleg3.rotationPointX = this.backRightleg3.rotationPointX + (float)(xx);
        this.backRightleg3.rotationPointY = this.backRightleg3.rotationPointY - (float)(yy);
        this.backRightleg3.rotationPointZ = this.backRightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 112.14193 + (((tickAnim - 0) / 12) * (155.7831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(112.14193)));
            yy = -20.14399 + (((tickAnim - 0) / 12) * (-50.28813-(-20.14399)));
            zz = 113.21743 + (((tickAnim - 0) / 12) * (150.8549+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(113.21743)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 155.7831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 12) / 5) * (32.99339-(155.7831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = -50.28813 + (((tickAnim - 12) / 5) * (-11.46995-(-50.28813)));
            zz = 150.8549+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 12) / 5) * (-74.822+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(150.8549+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 32.99339 + (((tickAnim - 17) / 8) * (112.14193-(32.99339)));
            yy = -11.46995 + (((tickAnim - 17) / 8) * (-20.14399-(-11.46995)));
            zz = -74.822+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 17) / 8) * (113.21743-(-74.822+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 9.66761 + (((tickAnim - 0) / 4) * (-0.14119-(9.66761)));
            yy = 1.16933 + (((tickAnim - 0) / 4) * (45.29181-(1.16933)));
            zz = -30.77595 + (((tickAnim - 0) / 4) * (20.76822-(-30.77595)));
        }
        else if (tickAnim >= 4 && tickAnim < 17) {
            xx = -0.14119 + (((tickAnim - 4) / 13) * (0-(-0.14119)));
            yy = 45.29181 + (((tickAnim - 4) / 13) * (158.61+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(45.29181)));
            zz = 20.76822 + (((tickAnim - 4) / 13) * (0-(20.76822)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (9.66761-(0)));
            yy = 158.61+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 17) / 8) * (1.16933-(158.61+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            zz = 0 + (((tickAnim - 17) / 8) * (-30.77595-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.8-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -0.375 + (((tickAnim - 12) / 13) * (0-(-0.375)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0.8 + (((tickAnim - 12) / 13) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -26.08851 + (((tickAnim - 0) / 4) * (0.3068-(-26.08851)));
            yy = -21.64201 + (((tickAnim - 0) / 4) * (-60.69426-(-21.64201)));
            zz = -27.06557 + (((tickAnim - 0) / 4) * (-43.14759-(-27.06557)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0.3068 + (((tickAnim - 4) / 8) * (-49.28809-(0.3068)));
            yy = -60.69426 + (((tickAnim - 4) / 8) * (-53.76636-(-60.69426)));
            zz = -43.14759 + (((tickAnim - 4) / 8) * (-45.56097-(-43.14759)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -49.28809 + (((tickAnim - 12) / 5) * (-55.83596-(-49.28809)));
            yy = -53.76636 + (((tickAnim - 12) / 5) * (-11.00779-(-53.76636)));
            zz = -45.56097 + (((tickAnim - 12) / 5) * (-32.17127-(-45.56097)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -55.83596 + (((tickAnim - 17) / 8) * (-26.08851-(-55.83596)));
            yy = -11.00779 + (((tickAnim - 17) / 8) * (-21.64201-(-11.00779)));
            zz = -32.17127 + (((tickAnim - 17) / 8) * (-27.06557-(-32.17127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftleg3, backLeftleg3.rotateAngleX + (float) Math.toRadians(xx), backLeftleg3.rotateAngleY + (float) Math.toRadians(yy), backLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.9-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0.9 + (((tickAnim - 4) / 8) * (0.9-(0.9)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.9 + (((tickAnim - 12) / 13) * (0-(0.9)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftleg3.rotationPointX = this.backLeftleg3.rotationPointX + (float)(xx);
        this.backLeftleg3.rotationPointY = this.backLeftleg3.rotationPointY - (float)(yy);
        this.backLeftleg3.rotationPointZ = this.backLeftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+150))*1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+70))*8), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*6));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+150))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*-15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*6));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAraripemys entity = (EntityPrehistoricFloraAraripemys) entitylivingbaseIn;
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



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+150))*-2), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+250))*-2), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-5), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-1.25), neck5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-350))*-5), neck5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 80.4495 + (((tickAnim - 0) / 3) * (33.39008-(80.4495)));
            yy = 17.93319 + (((tickAnim - 0) / 3) * (12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(17.93319)));
            zz = -56.25197 + (((tickAnim - 0) / 3) * (-29.90096-(-56.25197)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 33.39008 + (((tickAnim - 3) / 1) * (17.05954-(33.39008)));
            yy = 12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 3) / 1) * (43.18954-(12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = -29.90096 + (((tickAnim - 3) / 1) * (14.09233-(-29.90096)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 17.05954 + (((tickAnim - 4) / 6) * (80.4495-(17.05954)));
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
            xx = 28.43349 + (((tickAnim - 3) / 1) * (-4.5-(28.43349)));
            yy = -29.6039 + (((tickAnim - 3) / 1) * (0-(-29.6039)));
            zz = 36.34125 + (((tickAnim - 3) / 1) * (-3.5-(36.34125)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -4.5 + (((tickAnim - 4) / 4) * (-42.4154-(-4.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (2.31708-(0)));
            zz = -3.5 + (((tickAnim - 4) / 4) * (-23.21449-(-3.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -42.4154 + (((tickAnim - 8) / 0) * (-63.36592-(-42.4154)));
            yy = 2.31708 + (((tickAnim - 8) / 0) * (-16.58902-(2.31708)));
            zz = -23.21449 + (((tickAnim - 8) / 0) * (-19.64218-(-23.21449)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -63.36592 + (((tickAnim - 8) / 2) * (1125.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-1550-(-63.36592)));
            yy = -16.58902 + (((tickAnim - 8) / 2) * (-18.51386-(-16.58902)));
            zz = -19.64218 + (((tickAnim - 8) / 2) * (47.46769-(-19.64218)));
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
            xx = 0.5 + (((tickAnim - 1) / 2) * (-0.15-(0.5)));
            yy = 0 + (((tickAnim - 1) / 2) * (0.575-(0)));
            zz = -0.35 + (((tickAnim - 1) / 2) * (0.105-(-0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.15 + (((tickAnim - 3) / 1) * (0-(-0.15)));
            yy = 0.575 + (((tickAnim - 3) / 1) * (0.05-(0.575)));
            zz = 0.105 + (((tickAnim - 3) / 1) * (0-(0.105)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 4) / 2) * (0.265-(0.05)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.465-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.265 + (((tickAnim - 6) / 2) * (-0.05-(0.265)));
            zz = 0.465 + (((tickAnim - 6) / 2) * (0.33-(0.465)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -0.05 + (((tickAnim - 8) / 0) * (-0.875-(-0.05)));
            zz = 0.33 + (((tickAnim - 8) / 0) * (0.49-(0.33)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.875 + (((tickAnim - 8) / 2) * (0.25-(-0.875)));
            zz = 0.49 + (((tickAnim - 8) / 2) * (0.65-(0.49)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftleg3.rotationPointX = this.frontLeftleg3.rotationPointX + (float)(xx);
        this.frontLeftleg3.rotationPointY = this.frontLeftleg3.rotationPointY - (float)(yy);
        this.frontLeftleg3.rotationPointZ = this.frontLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -12.35288 + (((tickAnim - 0) / 1) * (2.74505-(-12.35288)));
            yy = 36.37015 + (((tickAnim - 0) / 1) * (7.54777-(36.37015)));
            zz = -4.61799 + (((tickAnim - 0) / 1) * (-15.95966-(-4.61799)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 2.74505 + (((tickAnim - 1) / 2) * (45.32353-(2.74505)));
            yy = 7.54777 + (((tickAnim - 1) / 2) * (-15.4838-(7.54777)));
            zz = -15.95966 + (((tickAnim - 1) / 2) * (-37.24978-(-15.95966)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 45.32353 + (((tickAnim - 3) / 2) * (188.42907-(45.32353)));
            yy = -15.4838 + (((tickAnim - 3) / 2) * (-10.98721-(-15.4838)));
            zz = -37.24978 + (((tickAnim - 3) / 2) * (-204.44782-(-37.24978)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 188.42907 + (((tickAnim - 5) / 3) * (49.79385-(188.42907)));
            yy = -10.98721 + (((tickAnim - 5) / 3) * (-1.53664-(-10.98721)));
            zz = -204.44782 + (((tickAnim - 5) / 3) * (-66.85572-(-204.44782)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 49.79385 + (((tickAnim - 8) / 2) * (-12.35288-(49.79385)));
            yy = -1.53664 + (((tickAnim - 8) / 2) * (36.37015-(-1.53664)));
            zz = -66.85572 + (((tickAnim - 8) / 2) * (-4.61799-(-66.85572)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 12.67386 + (((tickAnim - 0) / 2) * (4.63375-(12.67386)));
            yy = -41.95748 + (((tickAnim - 0) / 2) * (17.52496-(-41.95748)));
            zz = -10.99056 + (((tickAnim - 0) / 2) * (-8.72604-(-10.99056)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 4.63375 + (((tickAnim - 2) / 2) * (1.31282-(4.63375)));
            yy = 17.52496 + (((tickAnim - 2) / 2) * (39.9985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-230-(17.52496)));
            zz = -8.72604 + (((tickAnim - 2) / 2) * (1.87168-(-8.72604)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 1.31282 + (((tickAnim - 4) / 1) * (0-(1.31282)));
            yy = 39.9985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-230 + (((tickAnim - 4) / 1) * (-25.75-(39.9985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-230)));
            zz = 1.87168 + (((tickAnim - 4) / 1) * (0-(1.87168)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-39.6029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = -25.75 + (((tickAnim - 5) / 3) * (-31.65135-(-25.75)));
            zz = 0 + (((tickAnim - 5) / 3) * (-85.1795+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -39.6029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 8) / 2) * (12.67386-(-39.6029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -31.65135 + (((tickAnim - 8) / 2) * (-41.95748-(-31.65135)));
            zz = -85.1795+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150 + (((tickAnim - 8) / 2) * (-10.99056-(-85.1795+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.4 + (((tickAnim - 0) / 1) * (0.32-(0.4)));
            yy = -0.15 + (((tickAnim - 0) / 1) * (-0.12-(-0.15)));
            zz = 0.85 + (((tickAnim - 0) / 1) * (0.13-(0.85)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0.32 + (((tickAnim - 1) / 4) * (0-(0.32)));
            yy = -0.12 + (((tickAnim - 1) / 4) * (0-(-0.12)));
            zz = 0.13 + (((tickAnim - 1) / 4) * (0-(0.13)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0.4-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.85-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 19.11424 + (((tickAnim - 0) / 2) * (-20.58939-(19.11424)));
            yy = -4.24928 + (((tickAnim - 0) / 2) * (12.30974-(-4.24928)));
            zz = -18.68022 + (((tickAnim - 0) / 2) * (9.21822-(-18.68022)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -20.58939 + (((tickAnim - 2) / 1) * (10.10082-(-20.58939)));
            yy = 12.30974 + (((tickAnim - 2) / 1) * (17.26307-(12.30974)));
            zz = 9.21822 + (((tickAnim - 2) / 1) * (-23.01167-(9.21822)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10.10082 + (((tickAnim - 3) / 1) * (3.28568-(10.10082)));
            yy = 17.26307 + (((tickAnim - 3) / 1) * (-6.32312-(17.26307)));
            zz = -23.01167 + (((tickAnim - 3) / 1) * (4.78342-(-23.01167)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 3.28568 + (((tickAnim - 4) / 1) * (39.33521-(3.28568)));
            yy = -6.32312 + (((tickAnim - 4) / 1) * (7.64399-(-6.32312)));
            zz = 4.78342 + (((tickAnim - 4) / 1) * (-43.63699-(4.78342)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 39.33521 + (((tickAnim - 5) / 2) * (53.80245-(39.33521)));
            yy = 7.64399 + (((tickAnim - 5) / 2) * (-2.01137-(7.64399)));
            zz = -43.63699 + (((tickAnim - 5) / 2) * (-31.64542-(-43.63699)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 53.80245 + (((tickAnim - 7) / 1) * (61.59116-(53.80245)));
            yy = -2.01137 + (((tickAnim - 7) / 1) * (7.45512-(-2.01137)));
            zz = -31.64542 + (((tickAnim - 7) / 1) * (-47.30168-(-31.64542)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 61.59116 + (((tickAnim - 8) / 1) * (39.48509-(61.59116)));
            yy = 7.45512 + (((tickAnim - 8) / 1) * (-5.63663-(7.45512)));
            zz = -47.30168 + (((tickAnim - 8) / 1) * (-32.03991-(-47.30168)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 39.48509 + (((tickAnim - 9) / 1) * (19.11424-(39.48509)));
            yy = -5.63663 + (((tickAnim - 9) / 1) * (-4.24928-(-5.63663)));
            zz = -32.03991 + (((tickAnim - 9) / 1) * (-18.68022-(-32.03991)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightleg3, backRightleg3.rotateAngleX + (float) Math.toRadians(xx), backRightleg3.rotateAngleY + (float) Math.toRadians(yy), backRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.275-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 5) / 2) * (-0.55-(-0.5)));
            zz = 0.275 + (((tickAnim - 5) / 2) * (0.21-(0.275)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.55 + (((tickAnim - 7) / 1) * (-0.28-(-0.55)));
            zz = 0.21 + (((tickAnim - 7) / 1) * (0.14-(0.21)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.28 + (((tickAnim - 8) / 1) * (-0.665-(-0.28)));
            zz = 0.14 + (((tickAnim - 8) / 1) * (0.07-(0.14)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.665 + (((tickAnim - 9) / 1) * (0-(-0.665)));
            zz = 0.07 + (((tickAnim - 9) / 1) * (0-(0.07)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightleg3.rotationPointX = this.backRightleg3.rotationPointX + (float)(xx);
        this.backRightleg3.rotationPointY = this.backRightleg3.rotationPointY - (float)(yy);
        this.backRightleg3.rotationPointZ = this.backRightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.05954 + (((tickAnim - 0) / 6) * (80.4495-(17.05954)));
            yy = -43.18954 + (((tickAnim - 0) / 6) * (-17.93319-(-43.18954)));
            zz = -14.09233 + (((tickAnim - 0) / 6) * (56.25197-(-14.09233)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 80.4495 + (((tickAnim - 6) / 2) * (33.39008-(80.4495)));
            yy = -17.93319 + (((tickAnim - 6) / 2) * (12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-17.93319)));
            zz = 56.25197 + (((tickAnim - 6) / 2) * (29.90096-(56.25197)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 33.39008 + (((tickAnim - 8) / 2) * (17.05954-(33.39008)));
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
            xx = -4.5 + (((tickAnim - 0) / 3) * (-59.01611-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (9.27144-(0)));
            zz = 3.5 + (((tickAnim - 0) / 3) * (34.39521-(3.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -59.01611 + (((tickAnim - 3) / 1) * (-68.83338-(-59.01611)));
            yy = 9.27144 + (((tickAnim - 3) / 1) * (17.07295-(9.27144)));
            zz = 34.39521 + (((tickAnim - 3) / 1) * (16.15656-(34.39521)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -68.83338 + (((tickAnim - 4) / 2) * (-598.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*1000-(-68.83338)));
            yy = 17.07295 + (((tickAnim - 4) / 2) * (18.51386-(17.07295)));
            zz = 16.15656 + (((tickAnim - 4) / 2) * (-47.46769-(16.15656)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -598.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*1000 + (((tickAnim - 6) / 1) * (30.71196-(-598.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*1000)));
            yy = 18.51386 + (((tickAnim - 6) / 1) * (51.08325-(18.51386)));
            zz = -47.46769 + (((tickAnim - 6) / 1) * (-73.24733-(-47.46769)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 30.71196 + (((tickAnim - 7) / 1) * (28.43349-(30.71196)));
            yy = 51.08325 + (((tickAnim - 7) / 1) * (29.6039-(51.08325)));
            zz = -73.24733 + (((tickAnim - 7) / 1) * (-36.34125-(-73.24733)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 28.43349 + (((tickAnim - 8) / 2) * (-4.5-(28.43349)));
            yy = 29.6039 + (((tickAnim - 8) / 2) * (0-(29.6039)));
            zz = -36.34125 + (((tickAnim - 8) / 2) * (3.5-(-36.34125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightleg3, frontRightleg3.rotateAngleX + (float) Math.toRadians(xx), frontRightleg3.rotateAngleY + (float) Math.toRadians(yy), frontRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.525-(0)));
            yy = 0.05 + (((tickAnim - 0) / 1) * (0.45-(0.05)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.73-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0.525 + (((tickAnim - 1) / 2) * (0-(0.525)));
            yy = 0.45 + (((tickAnim - 1) / 2) * (-0.45-(0.45)));
            zz = 0.73 + (((tickAnim - 1) / 2) * (1.23-(0.73)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.45 + (((tickAnim - 3) / 1) * (-0.45-(-0.45)));
            zz = 1.23 + (((tickAnim - 3) / 1) * (1.105-(1.23)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-0.1-(0)));
            yy = -0.45 + (((tickAnim - 4) / 2) * (0.35-(-0.45)));
            zz = 1.105 + (((tickAnim - 4) / 2) * (0.175-(1.105)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.1 + (((tickAnim - 6) / 1) * (-0.5-(-0.1)));
            yy = 0.35 + (((tickAnim - 6) / 1) * (0-(0.35)));
            zz = 0.175 + (((tickAnim - 6) / 1) * (-0.35-(0.175)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.5 + (((tickAnim - 7) / 1) * (0.15-(-0.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.575-(0)));
            zz = -0.35 + (((tickAnim - 7) / 1) * (-0.105-(-0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.15 + (((tickAnim - 8) / 2) * (0-(0.15)));
            yy = 0.575 + (((tickAnim - 8) / 2) * (0.05-(0.575)));
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



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-5), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(-0.05);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-2.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-10), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 181.32125 + (((tickAnim - 0) / 2) * (183.92907-(181.32125)));
            yy = 23.92289 + (((tickAnim - 0) / 2) * (10.98721-(23.92289)));
            zz = 185.29662 + (((tickAnim - 0) / 2) * (204.44782-(185.29662)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 183.92907 + (((tickAnim - 2) / 2) * (49.79385-(183.92907)));
            yy = 10.98721 + (((tickAnim - 2) / 2) * (1.53664-(10.98721)));
            zz = 204.44782 + (((tickAnim - 2) / 2) * (66.85572-(204.44782)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 49.79385 + (((tickAnim - 4) / 3) * (-12.35288-(49.79385)));
            yy = 1.53664 + (((tickAnim - 4) / 3) * (-36.37015-(1.53664)));
            zz = 66.85572 + (((tickAnim - 4) / 3) * (4.61799-(66.85572)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -12.35288 + (((tickAnim - 7) / 1) * (-8.25902-(-12.35288)));
            yy = -36.37015 + (((tickAnim - 7) / 1) * (16.10491-(-36.37015)));
            zz = 4.61799 + (((tickAnim - 7) / 1) * (-8.22255-(4.61799)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.25902 + (((tickAnim - 8) / 2) * (181.32125-(-8.25902)));
            yy = 16.10491 + (((tickAnim - 8) / 2) * (23.92289-(16.10491)));
            zz = -8.22255 + (((tickAnim - 8) / 2) * (185.29662-(-8.22255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.89544 + (((tickAnim - 0) / 2) * (0-(-2.89544)));
            yy = 20.36448 + (((tickAnim - 0) / 2) * (25.75-(20.36448)));
            zz = 7.02738 + (((tickAnim - 0) / 2) * (0-(7.02738)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (14.7061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(0)));
            yy = 25.75 + (((tickAnim - 2) / 2) * (-0.13972-(25.75)));
            zz = 0 + (((tickAnim - 2) / 2) * (-23.1186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 14.7061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 4) / 3) * (12.67386-(14.7061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = -0.13972 + (((tickAnim - 4) / 3) * (41.95748-(-0.13972)));
            zz = -23.1186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 4) / 3) * (10.99056-(-23.1186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 12.67386 + (((tickAnim - 7) / 1) * (4.98994-(12.67386)));
            yy = 41.95748 + (((tickAnim - 7) / 1) * (-11.98753-(41.95748)));
            zz = 10.99056 + (((tickAnim - 7) / 1) * (7.52083-(10.99056)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.98994 + (((tickAnim - 8) / 2) * (-2.89544-(4.98994)));
            yy = -11.98753 + (((tickAnim - 8) / 2) * (20.36448-(-11.98753)));
            zz = 7.52083 + (((tickAnim - 8) / 2) * (7.02738-(7.52083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (-0.4-(0)));
            yy = 0 + (((tickAnim - 2) / 5) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0.85-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.4 + (((tickAnim - 7) / 3) * (0-(-0.4)));
            yy = -0.15 + (((tickAnim - 7) / 3) * (0-(-0.15)));
            zz = 0.85 + (((tickAnim - 7) / 3) * (0-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 19.11424 + (((tickAnim - 0) / 2) * (31.28053-(19.11424)));
            yy = 4.24928 + (((tickAnim - 0) / 2) * (-14.25088-(4.24928)));
            zz = 18.68022 + (((tickAnim - 0) / 2) * (39.247-(18.68022)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 31.28053 + (((tickAnim - 2) / 2) * (47.65115-(31.28053)));
            yy = -14.25088 + (((tickAnim - 2) / 2) * (13.52027-(-14.25088)));
            zz = 39.247 + (((tickAnim - 2) / 2) * (28.12276-(39.247)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 47.65115 + (((tickAnim - 4) / 3) * (-4.31092-(47.65115)));
            yy = 13.52027 + (((tickAnim - 4) / 3) * (-6.81716-(13.52027)));
            zz = 28.12276 + (((tickAnim - 4) / 3) * (-13.56707-(28.12276)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -4.31092 + (((tickAnim - 7) / 1) * (-48.99862-(-4.31092)));
            yy = -6.81716 + (((tickAnim - 7) / 1) * (-26.97217-(-6.81716)));
            zz = -13.56707 + (((tickAnim - 7) / 1) * (-42.98732-(-13.56707)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -48.99862 + (((tickAnim - 8) / 2) * (19.11424-(-48.99862)));
            yy = -26.97217 + (((tickAnim - 8) / 2) * (4.24928-(-26.97217)));
            zz = -42.98732 + (((tickAnim - 8) / 2) * (18.68022-(-42.98732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftleg3, backLeftleg3.rotateAngleX + (float) Math.toRadians(xx), backLeftleg3.rotateAngleY + (float) Math.toRadians(yy), backLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.315-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.23-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.315 + (((tickAnim - 7) / 3) * (0-(-0.315)));
            zz = 0.23 + (((tickAnim - 7) / 3) * (0-(0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftleg3.rotationPointX = this.backLeftleg3.rotationPointX + (float)(xx);
        this.backLeftleg3.rotationPointY = this.backLeftleg3.rotationPointY - (float)(yy);
        this.backLeftleg3.rotationPointZ = this.backLeftleg3.rotationPointZ + (float)(zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAraripemys entity = (EntityPrehistoricFloraAraripemys) entitylivingbaseIn;
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



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+150))*-2), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-3), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+250))*-2), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*-3), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-1.25), neck5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*-3), neck5.rotateAngleZ + (float) Math.toRadians(0));
        this.neck5.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.03),(float)1);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 80.4495 + (((tickAnim - 0) / 9) * (33.39008-(80.4495)));
            yy = 17.93319 + (((tickAnim - 0) / 9) * (12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(17.93319)));
            zz = -56.25197 + (((tickAnim - 0) / 9) * (-29.90096-(-56.25197)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 33.39008 + (((tickAnim - 9) / 8) * (17.05954-(33.39008)));
            yy = 12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 9) / 8) * (43.18954-(12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = -29.90096 + (((tickAnim - 9) / 8) * (14.09233-(-29.90096)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 17.05954 + (((tickAnim - 17) / 23) * (80.4495-(17.05954)));
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
            xx = 28.43349 + (((tickAnim - 9) / 8) * (-4.5-(28.43349)));
            yy = -29.6039 + (((tickAnim - 9) / 8) * (0-(-29.6039)));
            zz = 36.34125 + (((tickAnim - 9) / 8) * (-3.5-(36.34125)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -4.5 + (((tickAnim - 17) / 11) * (-42.4154-(-4.5)));
            yy = 0 + (((tickAnim - 17) / 11) * (2.31708-(0)));
            zz = -3.5 + (((tickAnim - 17) / 11) * (-23.21449-(-3.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -42.4154 + (((tickAnim - 28) / 6) * (-63.36592-(-42.4154)));
            yy = 2.31708 + (((tickAnim - 28) / 6) * (-16.58902-(2.31708)));
            zz = -23.21449 + (((tickAnim - 28) / 6) * (-19.64218-(-23.21449)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -63.36592 + (((tickAnim - 34) / 6) * (1369.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-1550-(-63.36592)));
            yy = -16.58902 + (((tickAnim - 34) / 6) * (-18.51386-(-16.58902)));
            zz = -19.64218 + (((tickAnim - 34) / 6) * (47.46769-(-19.64218)));
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
            yy = 0.575 + (((tickAnim - 9) / 8) * (0.05-(0.575)));
            zz = 0.105 + (((tickAnim - 9) / 8) * (0-(0.105)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.05 + (((tickAnim - 17) / 6) * (0.265-(0.05)));
            zz = 0 + (((tickAnim - 17) / 6) * (0.465-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.265 + (((tickAnim - 23) / 5) * (-0.05-(0.265)));
            zz = 0.465 + (((tickAnim - 23) / 5) * (0.33-(0.465)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 28) / 6) * (-0.875-(-0.05)));
            zz = 0.33 + (((tickAnim - 28) / 6) * (0.49-(0.33)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -0.875 + (((tickAnim - 34) / 6) * (0.25-(-0.875)));
            zz = 0.49 + (((tickAnim - 34) / 6) * (0.65-(0.49)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftleg3.rotationPointX = this.frontLeftleg3.rotationPointX + (float)(xx);
        this.frontLeftleg3.rotationPointY = this.frontLeftleg3.rotationPointY - (float)(yy);
        this.frontLeftleg3.rotationPointZ = this.frontLeftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -12.35288 + (((tickAnim - 0) / 4) * (2.74505-(-12.35288)));
            yy = 36.37015 + (((tickAnim - 0) / 4) * (7.54777-(36.37015)));
            zz = -4.61799 + (((tickAnim - 0) / 4) * (-15.95966-(-4.61799)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 2.74505 + (((tickAnim - 4) / 6) * (45.32353-(2.74505)));
            yy = 7.54777 + (((tickAnim - 4) / 6) * (-15.4838-(7.54777)));
            zz = -15.95966 + (((tickAnim - 4) / 6) * (-37.24978-(-15.95966)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 45.32353 + (((tickAnim - 10) / 11) * (188.42907-(45.32353)));
            yy = -15.4838 + (((tickAnim - 10) / 11) * (-10.98721-(-15.4838)));
            zz = -37.24978 + (((tickAnim - 10) / 11) * (-204.44782-(-37.24978)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 188.42907 + (((tickAnim - 21) / 9) * (49.79385-(188.42907)));
            yy = -10.98721 + (((tickAnim - 21) / 9) * (-1.53664-(-10.98721)));
            zz = -204.44782 + (((tickAnim - 21) / 9) * (-66.85572-(-204.44782)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 49.79385 + (((tickAnim - 30) / 10) * (-12.35288-(49.79385)));
            yy = -1.53664 + (((tickAnim - 30) / 10) * (36.37015-(-1.53664)));
            zz = -66.85572 + (((tickAnim - 30) / 10) * (-4.61799-(-66.85572)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.67386 + (((tickAnim - 0) / 8) * (-15.61625-(12.67386)));
            yy = -41.95748 + (((tickAnim - 0) / 8) * (17.52496-(-41.95748)));
            zz = -10.99056 + (((tickAnim - 0) / 8) * (-8.72604-(-10.99056)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -15.61625 + (((tickAnim - 8) / 10) * (1.31282-(-15.61625)));
            yy = 17.52496 + (((tickAnim - 8) / 10) * (130.8235+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-230-(17.52496)));
            zz = -8.72604 + (((tickAnim - 8) / 10) * (1.87168-(-8.72604)));
        }






        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.4 + (((tickAnim - 0) / 4) * (0.32-(0.4)));
            yy = -0.15 + (((tickAnim - 0) / 4) * (-0.12-(-0.15)));
            zz = 0.85 + (((tickAnim - 0) / 4) * (0.13-(0.85)));
        }
        else if (tickAnim >= 4 && tickAnim < 21) {
            xx = 0.32 + (((tickAnim - 4) / 17) * (0-(0.32)));
            yy = -0.12 + (((tickAnim - 4) / 17) * (0-(-0.12)));
            zz = 0.13 + (((tickAnim - 4) / 17) * (0-(0.13)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0.4-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0.85-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10.31681 + (((tickAnim - 0) / 8) * (-31.6361-(-10.31681)));
            yy = 8.90169 + (((tickAnim - 0) / 8) * (27.39628-(8.90169)));
            zz = 14.4722 + (((tickAnim - 0) / 8) * (32.37696-(14.4722)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -31.6361 + (((tickAnim - 8) / 5) * (10.10082-(-31.6361)));
            yy = 27.39628 + (((tickAnim - 8) / 5) * (17.26307-(27.39628)));
            zz = 32.37696 + (((tickAnim - 8) / 5) * (-23.01167-(32.37696)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 10.10082 + (((tickAnim - 13) / 5) * (3.28568-(10.10082)));
            yy = 17.26307 + (((tickAnim - 13) / 5) * (-6.32312-(17.26307)));
            zz = -23.01167 + (((tickAnim - 13) / 5) * (4.78342-(-23.01167)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 3.28568 + (((tickAnim - 18) / 3) * (39.33521-(3.28568)));
            yy = -6.32312 + (((tickAnim - 18) / 3) * (7.64399-(-6.32312)));
            zz = 4.78342 + (((tickAnim - 18) / 3) * (-43.63699-(4.78342)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 39.33521 + (((tickAnim - 21) / 4) * (53.80245-(39.33521)));
            yy = 7.64399 + (((tickAnim - 21) / 4) * (-2.01137-(7.64399)));
            zz = -43.63699 + (((tickAnim - 21) / 4) * (-31.64542-(-43.63699)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 53.80245 + (((tickAnim - 25) / 5) * (61.59116-(53.80245)));
            yy = -2.01137 + (((tickAnim - 25) / 5) * (7.45512-(-2.01137)));
            zz = -31.64542 + (((tickAnim - 25) / 5) * (-47.30168-(-31.64542)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 61.59116 + (((tickAnim - 30) / 5) * (39.48509-(61.59116)));
            yy = 7.45512 + (((tickAnim - 30) / 5) * (-5.63663-(7.45512)));
            zz = -47.30168 + (((tickAnim - 30) / 5) * (-32.03991-(-47.30168)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 39.48509 + (((tickAnim - 35) / 5) * (-10.31681-(39.48509)));
            yy = -5.63663 + (((tickAnim - 35) / 5) * (8.90169-(-5.63663)));
            zz = -32.03991 + (((tickAnim - 35) / 5) * (14.4722-(-32.03991)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightleg3, backRightleg3.rotateAngleX + (float) Math.toRadians(xx), backRightleg3.rotateAngleY + (float) Math.toRadians(yy), backRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0.275-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -0.5 + (((tickAnim - 21) / 4) * (-0.55-(-0.5)));
            zz = 0.275 + (((tickAnim - 21) / 4) * (0.21-(0.275)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -0.55 + (((tickAnim - 25) / 5) * (-0.28-(-0.55)));
            zz = 0.21 + (((tickAnim - 25) / 5) * (0.14-(0.21)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -0.28 + (((tickAnim - 30) / 8) * (-0.665-(-0.28)));
            zz = 0.14 + (((tickAnim - 30) / 8) * (0.07-(0.14)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.665 + (((tickAnim - 38) / 2) * (0-(-0.665)));
            zz = 0.07 + (((tickAnim - 38) / 2) * (0-(0.07)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightleg3.rotationPointX = this.backRightleg3.rotationPointX + (float)(xx);
        this.backRightleg3.rotationPointY = this.backRightleg3.rotationPointY - (float)(yy);
        this.backRightleg3.rotationPointZ = this.backRightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 17.05954 + (((tickAnim - 0) / 23) * (80.4495-(17.05954)));
            yy = -43.18954 + (((tickAnim - 0) / 23) * (-17.93319-(-43.18954)));
            zz = -14.09233 + (((tickAnim - 0) / 23) * (56.25197-(-14.09233)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 80.4495 + (((tickAnim - 23) / 10) * (33.39008-(80.4495)));
            yy = -17.93319 + (((tickAnim - 23) / 10) * (12.0338558444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-17.93319)));
            zz = 56.25197 + (((tickAnim - 23) / 10) * (29.90096-(56.25197)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 33.39008 + (((tickAnim - 33) / 7) * (17.05954-(33.39008)));
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
            xx = -4.5 + (((tickAnim - 0) / 11) * (-59.01611-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (9.27144-(0)));
            zz = 3.5 + (((tickAnim - 0) / 11) * (34.39521-(3.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -59.01611 + (((tickAnim - 11) / 6) * (-68.83338-(-59.01611)));
            yy = 9.27144 + (((tickAnim - 11) / 6) * (17.07295-(9.27144)));
            zz = 34.39521 + (((tickAnim - 11) / 6) * (16.15656-(34.39521)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -68.83338 + (((tickAnim - 17) / 6) * (-973.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*1000-(-68.83338)));
            yy = 17.07295 + (((tickAnim - 17) / 6) * (18.51386-(17.07295)));
            zz = 16.15656 + (((tickAnim - 17) / 6) * (-47.46769-(16.15656)));
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
            xx = 28.43349 + (((tickAnim - 33) / 7) * (-4.5-(28.43349)));
            yy = 29.6039 + (((tickAnim - 33) / 7) * (0-(29.6039)));
            zz = -36.34125 + (((tickAnim - 33) / 7) * (3.5-(-36.34125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightleg3, frontRightleg3.rotateAngleX + (float) Math.toRadians(xx), frontRightleg3.rotateAngleY + (float) Math.toRadians(yy), frontRightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.525-(0)));
            yy = 0.05 + (((tickAnim - 0) / 4) * (0.45-(0.05)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.73-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0.525 + (((tickAnim - 4) / 7) * (0-(0.525)));
            yy = 0.45 + (((tickAnim - 4) / 7) * (-0.45-(0.45)));
            zz = 0.73 + (((tickAnim - 4) / 7) * (1.23-(0.73)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = -0.45 + (((tickAnim - 11) / 6) * (-0.45-(-0.45)));
            zz = 1.23 + (((tickAnim - 11) / 6) * (1.105-(1.23)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (-0.1-(0)));
            yy = -0.45 + (((tickAnim - 17) / 6) * (0.35-(-0.45)));
            zz = 1.105 + (((tickAnim - 17) / 6) * (0.175-(1.105)));
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
            yy = 0.575 + (((tickAnim - 33) / 7) * (0.05-(0.575)));
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



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+50))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-3), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(-0.05);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-2.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*-5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+350))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 181.32125 + (((tickAnim - 0) / 7) * (188.42907-(181.32125)));
            yy = 23.92289 + (((tickAnim - 0) / 7) * (10.98721-(23.92289)));
            zz = 185.29662 + (((tickAnim - 0) / 7) * (204.44782-(185.29662)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 188.42907 + (((tickAnim - 7) / 10) * (49.79385-(188.42907)));
            yy = 10.98721 + (((tickAnim - 7) / 10) * (1.53664-(10.98721)));
            zz = 204.44782 + (((tickAnim - 7) / 10) * (66.85572-(204.44782)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 49.79385 + (((tickAnim - 17) / 10) * (-12.35288-(49.79385)));
            yy = 1.53664 + (((tickAnim - 17) / 10) * (-36.37015-(1.53664)));
            zz = 66.85572 + (((tickAnim - 17) / 10) * (4.61799-(66.85572)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -12.35288 + (((tickAnim - 27) / 6) * (-8.25902-(-12.35288)));
            yy = -36.37015 + (((tickAnim - 27) / 6) * (16.10491-(-36.37015)));
            zz = 4.61799 + (((tickAnim - 27) / 6) * (-8.22255-(4.61799)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -8.25902 + (((tickAnim - 33) / 7) * (181.32125-(-8.25902)));
            yy = 16.10491 + (((tickAnim - 33) / 7) * (23.92289-(16.10491)));
            zz = -8.22255 + (((tickAnim - 33) / 7) * (185.29662-(-8.22255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -2.89544 + (((tickAnim - 0) / 7) * (0-(-2.89544)));
            yy = 20.36448 + (((tickAnim - 0) / 7) * (25.75-(20.36448)));
            zz = 7.02738 + (((tickAnim - 0) / 7) * (0-(7.02738)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (98.8311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(0)));
            yy = 25.75 + (((tickAnim - 7) / 10) * (-0.13972-(25.75)));
            zz = 0 + (((tickAnim - 7) / 10) * (-100.1436+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 98.8311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 17) / 10) * (12.67386-(98.8311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = -0.13972 + (((tickAnim - 17) / 10) * (41.95748-(-0.13972)));
            zz = -100.1436+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 17) / 10) * (10.99056-(-100.1436+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 12.67386 + (((tickAnim - 27) / 6) * (4.98994-(12.67386)));
            yy = 41.95748 + (((tickAnim - 27) / 6) * (-11.98753-(41.95748)));
            zz = 10.99056 + (((tickAnim - 27) / 6) * (7.52083-(10.99056)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 4.98994 + (((tickAnim - 33) / 7) * (-2.89544-(4.98994)));
            yy = -11.98753 + (((tickAnim - 33) / 7) * (20.36448-(-11.98753)));
            zz = 7.52083 + (((tickAnim - 33) / 7) * (7.02738-(7.52083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 7) / 20) * (-0.4-(0)));
            yy = 0 + (((tickAnim - 7) / 20) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 7) / 20) * (0.85-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -0.4 + (((tickAnim - 27) / 13) * (0-(-0.4)));
            yy = -0.15 + (((tickAnim - 27) / 13) * (0-(-0.15)));
            zz = 0.85 + (((tickAnim - 27) / 13) * (0-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 19.11424 + (((tickAnim - 0) / 7) * (31.28053-(19.11424)));
            yy = 4.24928 + (((tickAnim - 0) / 7) * (-14.25088-(4.24928)));
            zz = 18.68022 + (((tickAnim - 0) / 7) * (39.247-(18.68022)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 31.28053 + (((tickAnim - 7) / 10) * (47.65115-(31.28053)));
            yy = -14.25088 + (((tickAnim - 7) / 10) * (13.52027-(-14.25088)));
            zz = 39.247 + (((tickAnim - 7) / 10) * (28.12276-(39.247)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 47.65115 + (((tickAnim - 17) / 10) * (-4.31092-(47.65115)));
            yy = 13.52027 + (((tickAnim - 17) / 10) * (-6.81716-(13.52027)));
            zz = 28.12276 + (((tickAnim - 17) / 10) * (-13.56707-(28.12276)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -4.31092 + (((tickAnim - 27) / 5) * (-48.99862-(-4.31092)));
            yy = -6.81716 + (((tickAnim - 27) / 5) * (-26.97217-(-6.81716)));
            zz = -13.56707 + (((tickAnim - 27) / 5) * (-42.98732-(-13.56707)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -48.99862 + (((tickAnim - 32) / 8) * (19.11424-(-48.99862)));
            yy = -26.97217 + (((tickAnim - 32) / 8) * (4.24928-(-26.97217)));
            zz = -42.98732 + (((tickAnim - 32) / 8) * (18.68022-(-42.98732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftleg3, backLeftleg3.rotateAngleX + (float) Math.toRadians(xx), backLeftleg3.rotateAngleY + (float) Math.toRadians(yy), backLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (-0.315-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0.23-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = -0.315 + (((tickAnim - 27) / 13) * (0-(-0.315)));
            zz = 0.23 + (((tickAnim - 27) / 13) * (0-(0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftleg3.rotationPointX = this.backLeftleg3.rotationPointX + (float)(xx);
        this.backLeftleg3.rotationPointY = this.backLeftleg3.rotationPointY - (float)(yy);
        this.backLeftleg3.rotationPointZ = this.backLeftleg3.rotationPointZ + (float)(zz);



        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.01);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);
        this.head.setScale((float)1, (float) (1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-0.03),(float)1);


        this.jaw.setScale((float)1, (float) (1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.1),(float)1);


    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAraripemys entity = (EntityPrehistoricFloraAraripemys) entitylivingbaseIn;
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
            yy = 0 + (((tickAnim - 0) / 60) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 60) / 320) * (0-(0)));
            yy = -1.125 + (((tickAnim - 60) / 320) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 60) / 320) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            yy = -1.125 + (((tickAnim - 380) / 40) * (0-(-1.125)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = -15.25 + (((tickAnim - 60) / 216) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 60) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 216) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = -15.25 + (((tickAnim - 276) / 104) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -15.25 + (((tickAnim - 380) / 40) * (0-(-15.25)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (8.97775-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.17265-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (16.25899-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = 8.97775 + (((tickAnim - 60) / 216) * (8.97775-(8.97775)));
            yy = 0.17265 + (((tickAnim - 60) / 216) * (0.17265-(0.17265)));
            zz = 16.25899 + (((tickAnim - 60) / 216) * (16.25899-(16.25899)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = 8.97775 + (((tickAnim - 276) / 104) * (8.97775-(8.97775)));
            yy = 0.17265 + (((tickAnim - 276) / 104) * (0.17265-(0.17265)));
            zz = 16.25899 + (((tickAnim - 276) / 104) * (16.25899-(16.25899)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 8.97775 + (((tickAnim - 380) / 40) * (0-(8.97775)));
            yy = 0.17265 + (((tickAnim - 380) / 40) * (0-(0.17265)));
            zz = 16.25899 + (((tickAnim - 380) / 40) * (0-(16.25899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftleg3, frontLeftleg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftleg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = -15.25 + (((tickAnim - 60) / 216) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 60) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 216) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = -15.25 + (((tickAnim - 276) / 104) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -15.25 + (((tickAnim - 380) / 40) * (0-(-15.25)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (8.97775-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.17265-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-16.25899-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = 8.97775 + (((tickAnim - 60) / 216) * (8.97775-(8.97775)));
            yy = -0.17265 + (((tickAnim - 60) / 216) * (-0.17265-(-0.17265)));
            zz = -16.25899 + (((tickAnim - 60) / 216) * (-16.25899-(-16.25899)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = 8.97775 + (((tickAnim - 276) / 104) * (8.97775-(8.97775)));
            yy = -0.17265 + (((tickAnim - 276) / 104) * (-0.17265-(-0.17265)));
            zz = -16.25899 + (((tickAnim - 276) / 104) * (-16.25899-(-16.25899)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 8.97775 + (((tickAnim - 380) / 40) * (0-(8.97775)));
            yy = -0.17265 + (((tickAnim - 380) / 40) * (0-(-0.17265)));
            zz = -16.25899 + (((tickAnim - 380) / 40) * (0-(-16.25899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightleg3, frontRightleg3.rotateAngleX + (float) Math.toRadians(xx), frontRightleg3.rotateAngleY + (float) Math.toRadians(yy), frontRightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 420) {
            xx = 15 + (((tickAnim - 60) / 360) * (0-(15)));
            yy = 0 + (((tickAnim - 60) / 360) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 360) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-22.51319-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-3.27905-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (11.29556-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 420) {
            xx = -22.51319 + (((tickAnim - 60) / 360) * (0-(-22.51319)));
            yy = -3.27905 + (((tickAnim - 60) / 360) * (0-(-3.27905)));
            zz = 11.29556 + (((tickAnim - 60) / 360) * (0-(11.29556)));
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



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = 15 + (((tickAnim - 60) / 320) * (15-(15)));
            yy = 0 + (((tickAnim - 60) / 320) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 320) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 15 + (((tickAnim - 380) / 40) * (0-(15)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (-22.51319-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (3.27905-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-11.29556-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 380) {
            xx = -22.51319 + (((tickAnim - 60) / 320) * (-22.51319-(-22.51319)));
            yy = 3.27905 + (((tickAnim - 60) / 320) * (3.27905-(3.27905)));
            zz = -11.29556 + (((tickAnim - 60) / 320) * (-11.29556-(-11.29556)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -22.51319 + (((tickAnim - 380) / 40) * (0-(-22.51319)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = -12 + (((tickAnim - 60) / 216) * (-12-(-12)));
            yy = 0 + (((tickAnim - 60) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 216) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = -12 + (((tickAnim - 276) / 104) * (-12-(-12)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -12 + (((tickAnim - 380) / 40) * (0-(-12)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 276) {
            xx = 12 + (((tickAnim - 60) / 216) * (12-(12)));
            yy = 0 + (((tickAnim - 60) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 216) * (0-(0)));
        }
        else if (tickAnim >= 276 && tickAnim < 380) {
            xx = 12 + (((tickAnim - 276) / 104) * (12-(12)));
            yy = 0 + (((tickAnim - 276) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 276) / 104) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 12 + (((tickAnim - 380) / 40) * (0-(12)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAraripemys e = (EntityPrehistoricFloraAraripemys) entity;
        animator.update(entity);


    }
}
