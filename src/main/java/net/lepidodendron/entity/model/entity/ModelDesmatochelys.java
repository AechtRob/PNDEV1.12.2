package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDesmatochelys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDesmatochelys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer frontLeftFlipper;
    private final AdvancedModelRenderer frontLeftFlipper2;
    private final AdvancedModelRenderer frontLeftFlipper3;
    private final AdvancedModelRenderer frontRightFlipper;
    private final AdvancedModelRenderer frontRightFlipper2;
    private final AdvancedModelRenderer frontRightFlipper3;
    private final AdvancedModelRenderer backLeftFlipper;
    private final AdvancedModelRenderer backLeftFlipper2;
    private final AdvancedModelRenderer backLeftFlipper3;
    private final AdvancedModelRenderer backRightFlipper;
    private final AdvancedModelRenderer backRightFlipper2;
    private final AdvancedModelRenderer backRightFlipper3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;

    private ModelAnimator animator;

    public ModelDesmatochelys() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 27.325F, 1.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 44, -4.0F, -11.6F, -8.65F, 8, 2, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 101, 88, -1.0F, -10.5F, -13.75F, 2, 2, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -5.0F, -8.3F, -8.25F, 10, 5, 18, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -3.3F, 9.75F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 76, -2.5F, -3.0F, 0.0F, 6, 3, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.0F, -3.3F, 0.75F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.48F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 24, -6.0F, -2.0F, -8.0F, 2, 2, 15, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 24, -4.0F, -4.0F, -8.0F, 4, 4, 15, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.3497F, -10.45F, -13.8043F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0077F, -0.1744F, -0.0443F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 101, -2.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.3174F, -10.3628F, -14.1513F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0304F, 0.9598F, -0.0854F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 77, 101, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.973F, -10.2933F, -13.0041F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0528F, 0.6353F, -0.1458F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 101, 42, -2.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-5.5546F, -10.0499F, -11.8993F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1537F, 0.4171F, -0.3833F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 86, -4.8F, 0.025F, 0.05F, 5, 2, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-9.5948F, -8.3789F, -9.924F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1553F, 1.0987F, -0.3002F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 75, -6.025F, 0.0F, 0.0F, 6, 2, 7, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-12.1911F, -7.5901F, -4.5726F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.9013F, 1.5314F, -2.0425F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 54, -8.025F, 0.025F, 0.0F, 8, 2, 8, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-12.0412F, -7.2846F, 3.4452F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -2.9708F, 1.2886F, -3.1068F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 55, -8.0F, 0.0F, 0.0F, 8, 2, 8, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-9.8145F, -7.207F, 11.1287F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -3.0614F, 0.7654F, 3.0822F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 74, 23, -5.0F, 0.0F, 0.0F, 5, 2, 8, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-6.2152F, -7.4211F, 14.5927F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -3.0741F, 0.4146F, 3.0691F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 74, 34, -5.0F, 0.0F, 0.0F, 5, 2, 8, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.438F, -10.4468F, 8.2144F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3915F, -0.1066F, -0.5474F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 78, -6.0F, -0.125F, 0.0F, 6, 0, 7, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-4.0F, -11.6F, -0.65F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.107F, -0.0191F, -0.5908F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 57, 0, -7.0F, 0.0F, 0.0F, 7, 1, 9, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-4.0F, -11.6F, -0.65F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.5847F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 65, -7.0F, 0.0F, -8.0F, 7, 1, 8, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.438F, -10.4468F, 8.2144F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3915F, 0.1066F, 0.5474F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 78, 0.0F, -0.125F, 0.0F, 6, 0, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(12.0412F, -7.2846F, 3.4452F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -2.9708F, -1.2886F, 3.1068F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 55, 0.0F, 0.0F, 0.0F, 8, 2, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(5.0F, -3.3F, 0.75F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.48F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 24, 0.0F, -4.0F, -8.0F, 4, 4, 15, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 24, 4.0F, -2.0F, -8.0F, 2, 2, 15, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -3.3F, -8.25F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 66, 54, -4.0F, -5.0F, -5.0F, 8, 5, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-3.5F, -11.6F, -8.65F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2734F, 0.1426F, -0.56F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 91, 75, -6.0F, 0.0F, -5.0F, 6, 0, 5, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(3.5F, -11.6F, -8.65F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2734F, -0.1426F, 0.56F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 91, 75, 0.0F, 0.0F, -5.0F, 6, 0, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -11.6F, -8.65F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2793F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 85, -3.0F, 0.0F, -5.0F, 7, 2, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -10.8003F, 8.298F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.4232F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 33, 65, -3.0F, 0.0F, 0.0F, 7, 2, 8, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -11.6F, -0.65F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 39, 42, -3.5F, 0.0F, 0.0F, 8, 2, 9, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(4.0F, -11.6F, -0.65F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.107F, 0.0191F, 0.5908F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 57, 0, 0.0F, 0.0F, 0.0F, 7, 1, 9, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(4.0F, -11.6F, -0.65F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.5847F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 64, 65, 0.0F, 0.0F, -8.0F, 7, 1, 8, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(6.2152F, -7.4211F, 14.5927F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -3.0741F, -0.4146F, -3.0691F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 74, 34, 0.0F, 0.0F, 0.0F, 5, 2, 8, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(9.8145F, -7.207F, 11.1287F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -3.0614F, -0.7654F, -3.0822F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 74, 23, 0.0F, 0.0F, 0.0F, 5, 2, 8, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(12.1911F, -7.5901F, -4.5726F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.9013F, -1.5314F, 2.0425F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 33, 54, 0.025F, 0.025F, 0.0F, 8, 2, 8, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(9.5948F, -8.3789F, -9.924F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1553F, -1.0987F, 0.3002F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 64, 75, 0.025F, 0.0F, 0.0F, 6, 2, 7, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(5.5546F, -10.0499F, -11.8993F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1537F, -0.4171F, 0.3833F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 23, 86, -0.2F, 0.025F, 0.05F, 5, 2, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(3.973F, -10.2933F, -13.0041F);
        this.main.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0528F, -0.6353F, 0.1458F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 101, 42, 0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(3.3174F, -10.3628F, -14.1513F);
        this.main.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0304F, -0.9598F, 0.0854F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 77, 101, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.3497F, -10.45F, -13.8043F);
        this.main.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0077F, 0.1744F, 0.0443F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 66, 101, -1.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -7.7986F, 16.7993F);
        this.main.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0873F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 84, 94, -1.5F, 0.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -6.7409F, -13.4976F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 77, 85, -3.5F, -2.0F, -3.0F, 7, 4, 4, 0.011F, false));
        this.neck.cubeList.add(new ModelBox(neck, 44, 93, -3.5F, 1.75F, -3.0F, 7, 1, 4, 0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 95, 63, -1.0F, -1.161F, -5.7909F, 2, 2, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 67, 94, -3.0F, -1.75F, -2.0F, 6, 4, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 90, 6, -3.0F, 1.5F, -2.0F, 6, 1, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.9965F, -0.1628F, -7.6365F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.765F, -0.4266F, -0.059F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 33, 50, 0.0F, 0.0F, 0.4F, 1, 1, 1, -0.002F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 27, 66, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.4965F, -1.1628F, -6.7705F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1113F, -0.3044F, -0.0544F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 51, 99, 0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-3.0F, -2.1128F, -2.0019F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.3054F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 36, 99, 0.0F, 0.95F, -5.0F, 2, 2, 5, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.4965F, -1.1628F, -6.7705F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.5236F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 44, 86, 0.0F, 1.0F, -1.0F, 2, 1, 1, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.4965F, -1.1628F, -6.7705F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1113F, 0.3044F, 0.0544F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 51, 99, -2.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(3.0F, -2.1128F, -2.0019F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.3054F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 36, 99, -2.0F, 0.95F, -5.0F, 2, 2, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.9965F, -0.1628F, -7.6365F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.765F, 0.4266F, 0.059F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 27, 66, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 33, 50, -1.0F, 0.0F, 0.4F, 1, 1, 1, -0.002F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.4965F, -1.1628F, -6.7705F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.5236F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 44, 86, -2.0F, 1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.0F, -1.4627F, -6.314F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0567F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 101, 35, -2.0F, 0.0F, 0.0F, 2, 1, 5, 0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.0F, -0.1611F, -7.8653F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.6981F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 91, 81, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0F, 0.8383F, -7.8304F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0349F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 93, 54, -2.0F, -1.0F, 0.0F, 2, 1, 7, 0.01F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(1.9F, -0.4869F, -5.9003F);
        this.head.addChild(eye1);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.05F, 0.0F, 0.0349F);
        this.eye1.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.3054F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 33, 44, -1.05F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.9F, -0.4869F, -5.9003F);
        this.head.addChild(eye2);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.05F, 0.0F, 0.0349F);
        this.eye2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.3054F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 33, 44, 0.05F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0587F, -1.8002F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 95, 71, -2.5F, -1.3818F, -1.3644F, 5, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 82, -1.0F, -0.1128F, -6.0F, 2, 1, 1, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 94, -1.0F, -0.5128F, -6.0F, 2, 1, 6, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-3.0F, -1.4128F, -0.0019F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.3054F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 100, 81, 0.0F, 0.9F, -5.0F, 2, 1, 5, -0.001F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-3.0F, 1.0872F, -0.0019F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.0349F, -0.3054F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 101, 21, 0.0F, -0.925F, -5.0F, 2, 1, 5, -0.002F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.4965F, 0.9872F, -4.7705F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.0624F, -0.5226F, 0.0201F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 33, 47, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-1.4965F, -2.4628F, -4.7705F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, -0.5236F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 44, 89, 0.0F, 1.95F, -1.0F, 2, 1, 1, -0.001F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(1.4965F, 0.9872F, -4.7705F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0624F, 0.5226F, -0.0201F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 33, 47, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(1.4965F, -2.4628F, -4.7705F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.5236F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 44, 89, -2.0F, 1.95F, -1.0F, 2, 1, 1, -0.001F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(1.0F, 1.0305F, -5.0086F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0262F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 101, 28, -2.0F, -1.0128F, 0.0F, 2, 1, 5, -0.002F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(1.0F, 1.0305F, -5.0086F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1309F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 36, 94, -2.0F, -1.0128F, -1.0F, 2, 1, 1, -0.002F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(3.0F, 1.0872F, -0.0019F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0349F, 0.3054F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 101, 21, -2.0F, -0.925F, -5.0F, 2, 1, 5, -0.002F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(3.0F, -1.4128F, -0.0019F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.3054F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 100, 81, -2.0F, 0.9F, -5.0F, 2, 1, 5, -0.001F, false));

        this.frontLeftFlipper = new AdvancedModelRenderer(this);
        this.frontLeftFlipper.setRotationPoint(3.7925F, -6.048F, -9.1454F);
        this.main.addChild(frontLeftFlipper);
        this.setRotateAngle(frontLeftFlipper, 0.3383F, -1.0093F, 0.0627F);
        this.frontLeftFlipper.cubeList.add(new ModelBox(frontLeftFlipper, 0, 66, -2.75F, -2.0F, -6.5F, 5, 3, 8, 0.0F, false));

        this.frontLeftFlipper2 = new AdvancedModelRenderer(this);
        this.frontLeftFlipper2.setRotationPoint(-2.75F, -0.5F, -6.5F);
        this.frontLeftFlipper.addChild(frontLeftFlipper2);
        this.setRotateAngle(frontLeftFlipper2, -0.3663F, -0.4379F, 0.1175F);
        this.frontLeftFlipper2.cubeList.add(new ModelBox(frontLeftFlipper2, 0, 86, -0.5F, -1.0F, -5.0F, 6, 2, 5, 0.0F, false));

        this.frontLeftFlipper3 = new AdvancedModelRenderer(this);
        this.frontLeftFlipper3.setRotationPoint(2.4566F, -0.5F, -4.2538F);
        this.frontLeftFlipper2.addChild(frontLeftFlipper3);
        this.setRotateAngle(frontLeftFlipper3, 0.0F, -0.1745F, 0.0F);
        this.frontLeftFlipper3.cubeList.add(new ModelBox(frontLeftFlipper3, 57, 11, -2.5F, 0.0F, -10.0F, 5, 1, 10, 0.0F, false));

        this.frontRightFlipper = new AdvancedModelRenderer(this);
        this.frontRightFlipper.setRotationPoint(-3.7925F, -6.048F, -9.1454F);
        this.main.addChild(frontRightFlipper);
        this.setRotateAngle(frontRightFlipper, 0.3383F, 1.0093F, -0.0627F);
        this.frontRightFlipper.cubeList.add(new ModelBox(frontRightFlipper, 0, 66, -2.25F, -2.0F, -6.5F, 5, 3, 8, 0.0F, true));

        this.frontRightFlipper2 = new AdvancedModelRenderer(this);
        this.frontRightFlipper2.setRotationPoint(2.75F, -0.5F, -6.5F);
        this.frontRightFlipper.addChild(frontRightFlipper2);
        this.setRotateAngle(frontRightFlipper2, -0.3663F, 0.4379F, -0.1175F);
        this.frontRightFlipper2.cubeList.add(new ModelBox(frontRightFlipper2, 0, 86, -5.5F, -1.0F, -5.0F, 6, 2, 5, 0.0F, true));

        this.frontRightFlipper3 = new AdvancedModelRenderer(this);
        this.frontRightFlipper3.setRotationPoint(-2.4566F, -0.5F, -4.2538F);
        this.frontRightFlipper2.addChild(frontRightFlipper3);
        this.setRotateAngle(frontRightFlipper3, 0.0F, 0.1745F, 0.0F);
        this.frontRightFlipper3.cubeList.add(new ModelBox(frontRightFlipper3, 57, 11, -2.5F, 0.0F, -10.0F, 5, 1, 10, 0.0F, true));

        this.backLeftFlipper = new AdvancedModelRenderer(this);
        this.backLeftFlipper.setRotationPoint(2.783F, -6.241F, 8.0657F);
        this.main.addChild(backLeftFlipper);
        this.setRotateAngle(backLeftFlipper, -0.3695F, 0.8654F, -0.0515F);
        this.backLeftFlipper.cubeList.add(new ModelBox(backLeftFlipper, 88, 11, -2.0F, -2.0F, -1.0F, 4, 4, 5, 0.0F, false));

        this.backLeftFlipper2 = new AdvancedModelRenderer(this);
        this.backLeftFlipper2.setRotationPoint(0.2309F, 0.0F, 3.0565F);
        this.backLeftFlipper.addChild(backLeftFlipper2);
        this.setRotateAngle(backLeftFlipper2, 0.0305F, -0.48F, 0.0F);
        this.backLeftFlipper2.cubeList.add(new ModelBox(backLeftFlipper2, 0, 94, -2.0F, -1.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.backLeftFlipper3 = new AdvancedModelRenderer(this);
        this.backLeftFlipper3.setRotationPoint(0.0F, -0.5F, 4.25F);
        this.backLeftFlipper2.addChild(backLeftFlipper3);
        this.setRotateAngle(backLeftFlipper3, 0.2206F, -0.2816F, -0.2036F);
        this.backLeftFlipper3.cubeList.add(new ModelBox(backLeftFlipper3, 74, 45, -3.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F, false));

        this.backRightFlipper = new AdvancedModelRenderer(this);
        this.backRightFlipper.setRotationPoint(-2.783F, -6.241F, 8.0657F);
        this.main.addChild(backRightFlipper);
        this.setRotateAngle(backRightFlipper, -0.3695F, -0.8654F, 0.0515F);
        this.backRightFlipper.cubeList.add(new ModelBox(backRightFlipper, 88, 11, -2.0F, -2.0F, -1.0F, 4, 4, 5, 0.0F, true));

        this.backRightFlipper2 = new AdvancedModelRenderer(this);
        this.backRightFlipper2.setRotationPoint(-0.2309F, 0.0F, 3.0565F);
        this.backRightFlipper.addChild(backRightFlipper2);
        this.setRotateAngle(backRightFlipper2, 0.0305F, 0.48F, 0.0F);
        this.backRightFlipper2.cubeList.add(new ModelBox(backRightFlipper2, 0, 94, -2.0F, -1.0F, 0.0F, 4, 2, 5, 0.0F, true));

        this.backRightFlipper3 = new AdvancedModelRenderer(this);
        this.backRightFlipper3.setRotationPoint(0.0F, -0.5F, 4.25F);
        this.backRightFlipper2.addChild(backRightFlipper3);
        this.setRotateAngle(backRightFlipper3, 0.2206F, 0.2816F, 0.2036F);
        this.backRightFlipper3.cubeList.add(new ModelBox(backRightFlipper3, 74, 45, -3.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -5.4245F, 15.3919F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 52, 76, -0.5F, -0.5F, -0.5F, 2, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 0.2528F, 2.137F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 101, 49, -0.5F, -0.25F, 0.0F, 1, 1, 3, 0.0F, false));
        

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

        EntityPrehistoricFloraDesmatochelys entityDesmatochelys = (EntityPrehistoricFloraDesmatochelys) e;

        if (entityDesmatochelys.getAnimation() == entityDesmatochelys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (entityDesmatochelys.getAnimation() == entityDesmatochelys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityDesmatochelys.isReallyInWater()) {

                if (f3 == 0.0F || !entityDesmatochelys.getIsMoving()) {
                    if (entityDesmatochelys.getAnimation() != entityDesmatochelys.EAT_ANIMATION
                        && entityDesmatochelys.getAnimation() != entityDesmatochelys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }
                    return;
                }

                if (entityDesmatochelys.getIsFast()) { //Running


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

        EntityPrehistoricFloraDesmatochelys ee = (EntityPrehistoricFloraDesmatochelys) entitylivingmainIn;

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
        EntityPrehistoricFloraDesmatochelys entity = (EntityPrehistoricFloraDesmatochelys) entitylivingmainIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 20) / 15) * (4-(4)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 35) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0.375 + (((tickAnim - 20) / 15) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.375 + (((tickAnim - 35) / 15) * (0-(0.375)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -5.75 + (((tickAnim - 20) / 15) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 35) / 15) * (0-(-5.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.75 + (((tickAnim - 20) / 15) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 35) / 15) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(xx), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(yy), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.75 + (((tickAnim - 20) / 15) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 35) / 15) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (33.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 18.5 + (((tickAnim - 20) / 15) * (-2.87949-(18.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (-12.20283-(0)));
            zz = 33.5 + (((tickAnim - 20) / 15) * (38.50198-(33.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.87949 + (((tickAnim - 35) / 15) * (0-(-2.87949)));
            yy = -12.20283 + (((tickAnim - 35) / 15) * (0-(-12.20283)));
            zz = 38.50198 + (((tickAnim - 35) / 15) * (0-(38.50198)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.14108-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.24479-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (28.13482-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.14108 + (((tickAnim - 20) / 15) * (2.48297-(-0.14108)));
            yy = 12.24479 + (((tickAnim - 20) / 15) * (-5.22366-(12.24479)));
            zz = 28.13482 + (((tickAnim - 20) / 15) * (39.1719-(28.13482)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 2.48297 + (((tickAnim - 35) / 8) * (22.22023-(2.48297)));
            yy = -5.22366 + (((tickAnim - 35) / 8) * (5.42348-(-5.22366)));
            zz = 39.1719 + (((tickAnim - 35) / 8) * (17.11199-(39.1719)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 22.22023 + (((tickAnim - 43) / 7) * (0-(22.22023)));
            yy = 5.42348 + (((tickAnim - 43) / 7) * (0-(5.42348)));
            zz = 17.11199 + (((tickAnim - 43) / 7) * (0-(17.11199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.28648-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.26496-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (30.99853-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 1.28648 + (((tickAnim - 20) / 3) * (12.17849-(1.28648)));
            yy = 2.26496 + (((tickAnim - 20) / 3) * (4.71456-(2.26496)));
            zz = 30.99853 + (((tickAnim - 20) / 3) * (22.28515-(30.99853)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 12.17849 + (((tickAnim - 23) / 12) * (-42.39399-(12.17849)));
            yy = 4.71456 + (((tickAnim - 23) / 12) * (7.77656-(4.71456)));
            zz = 22.28515 + (((tickAnim - 23) / 12) * (11.39343-(22.28515)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -42.39399 + (((tickAnim - 35) / 8) * (-32.89399-(-42.39399)));
            yy = 7.77656 + (((tickAnim - 35) / 8) * (-7.77656-(7.77656)));
            zz = 11.39343 + (((tickAnim - 35) / 8) * (-11.39343-(11.39343)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -32.89399 + (((tickAnim - 43) / 7) * (0-(-32.89399)));
            yy = -7.77656 + (((tickAnim - 43) / 7) * (0-(-7.77656)));
            zz = -11.39343 + (((tickAnim - 43) / 7) * (0-(-11.39343)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper3, backLeftFlipper3.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper3.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-33.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 18.5 + (((tickAnim - 20) / 15) * (11.86852-(18.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (24.22862-(0)));
            zz = -33.5 + (((tickAnim - 20) / 15) * (-48.10684-(-33.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.86852 + (((tickAnim - 35) / 15) * (0-(11.86852)));
            yy = 24.22862 + (((tickAnim - 35) / 15) * (0-(24.22862)));
            zz = -48.10684 + (((tickAnim - 35) / 15) * (0-(-48.10684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.14108-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-12.24479-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-28.13482-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.14108 + (((tickAnim - 20) / 15) * (-2.87949-(-0.14108)));
            yy = -12.24479 + (((tickAnim - 20) / 15) * (-12.20283-(-12.24479)));
            zz = -28.13482 + (((tickAnim - 20) / 15) * (-38.50198-(-28.13482)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -2.87949 + (((tickAnim - 35) / 8) * (22.22023-(-2.87949)));
            yy = -12.20283 + (((tickAnim - 35) / 8) * (-5.42348-(-12.20283)));
            zz = -38.50198 + (((tickAnim - 35) / 8) * (-17.11199-(-38.50198)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 22.22023 + (((tickAnim - 43) / 7) * (0-(22.22023)));
            yy = -5.42348 + (((tickAnim - 43) / 7) * (0-(-5.42348)));
            zz = -17.11199 + (((tickAnim - 43) / 7) * (0-(-17.11199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper2.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.28648-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.26496-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-30.99853-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 1.28648 + (((tickAnim - 20) / 3) * (12.17849-(1.28648)));
            yy = -2.26496 + (((tickAnim - 20) / 3) * (-4.71456-(-2.26496)));
            zz = -30.99853 + (((tickAnim - 20) / 3) * (-22.28515-(-30.99853)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 12.17849 + (((tickAnim - 23) / 12) * (-35.64399-(12.17849)));
            yy = -4.71456 + (((tickAnim - 23) / 12) * (-7.77656-(-4.71456)));
            zz = -22.28515 + (((tickAnim - 23) / 12) * (-11.39343-(-22.28515)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -35.64399 + (((tickAnim - 35) / 8) * (-32.89399-(-35.64399)));
            yy = -7.77656 + (((tickAnim - 35) / 8) * (-7.77656-(-7.77656)));
            zz = -11.39343 + (((tickAnim - 35) / 8) * (-11.39343-(-11.39343)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -32.89399 + (((tickAnim - 43) / 7) * (0-(-32.89399)));
            yy = -7.77656 + (((tickAnim - 43) / 7) * (0-(-7.77656)));
            zz = -11.39343 + (((tickAnim - 43) / 7) * (0-(-11.39343)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper3.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-35.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -35.25 + (((tickAnim - 20) / 15) * (-35.25-(-35.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -35.25 + (((tickAnim - 35) / 15) * (0-(-35.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animEat(EntityLivingBase entitylivingmainIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDesmatochelys entity = (EntityPrehistoricFloraDesmatochelys) entitylivingmainIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-18.51581-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.54094-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-12.48848-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -18.51581 + (((tickAnim - 6) / 2) * (-19.94081-(-18.51581)));
            yy = -0.54094 + (((tickAnim - 6) / 2) * (-0.54094-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 6) / 2) * (-12.48848-(-12.48848)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -19.94081 + (((tickAnim - 8) / 2) * (-20.69081-(-19.94081)));
            yy = -0.54094 + (((tickAnim - 8) / 2) * (-0.54094-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 8) / 2) * (-12.48848-(-12.48848)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -20.69081 + (((tickAnim - 10) / 2) * (-18.04388-(-20.69081)));
            yy = -0.54094 + (((tickAnim - 10) / 2) * (-0.36062-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 10) / 2) * (-8.32565-(-12.48848)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -18.04388 + (((tickAnim - 12) / 8) * (0-(-18.04388)));
            yy = -0.36062 + (((tickAnim - 12) / 8) * (0-(-0.36062)));
            zz = -8.32565 + (((tickAnim - 12) / 8) * (0-(-8.32565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 12) * (0-(0.5)));
            zz = 0.25 + (((tickAnim - 8) / 12) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -13.5 + (((tickAnim - 3) / 6) * (7.75-(-13.5)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 7.75 + (((tickAnim - 9) / 3) * (13.13-(7.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 13.13 + (((tickAnim - 12) / 8) * (0-(13.13)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.59-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0.59 + (((tickAnim - 3) / 6) * (0.425-(0.59)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0.425 + (((tickAnim - 9) / 11) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 8) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 5) * (0.385-(1)));
            zz = 1 + (((tickAnim - 8) / 5) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 13) / 5) * (1-(1)));
            yy = 0.385 + (((tickAnim - 13) / 5) * (1-(0.385)));
            zz = 1 + (((tickAnim - 13) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 8) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 5) * (0.385-(1)));
            zz = 1 + (((tickAnim - 8) / 5) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 13) / 5) * (1-(1)));
            yy = 0.385 + (((tickAnim - 13) / 5) * (1-(0.385)));
            zz = 1 + (((tickAnim - 13) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 26.75 + (((tickAnim - 5) / 3) * (30.5-(26.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 30.5 + (((tickAnim - 8) / 4) * (0-(30.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animSwimming(EntityLivingBase entitylivingmainIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDesmatochelys entity = (EntityPrehistoricFloraDesmatochelys) entitylivingmainIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+40))*2), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*-0.59);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+20))*-1);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-6), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.275);


        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*-30), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(-15.3529+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*20), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*20));


        this.setRotateAngle(frontLeftFlipper2, frontLeftFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*20), frontLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*30), frontLeftFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*30));

        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            yy = 0.725 + (((tickAnim - 17) / 30) * (-0.92-(0.725)));
            zz = 0 + (((tickAnim - 17) / 30) * (0.825-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = -0.92 + (((tickAnim - 47) / 13) * (0-(-0.92)));
            zz = 0.825 + (((tickAnim - 47) / 13) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftFlipper2.rotationPointX = this.frontLeftFlipper2.rotationPointX + (float)(xx);
        this.frontLeftFlipper2.rotationPointY = this.frontLeftFlipper2.rotationPointY - (float)(yy);
        this.frontLeftFlipper2.rotationPointZ = this.frontLeftFlipper2.rotationPointZ + (float)(zz);



        this.setRotateAngle(frontLeftFlipper3, frontLeftFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*-10), frontLeftFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*20), frontLeftFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*10));


        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*-30), frontRightFlipper.rotateAngleY + (float) Math.toRadians(15.3529+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-20), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-20));


        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*20), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*-30), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-30));

        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            yy = 0.725 + (((tickAnim - 17) / 30) * (-0.92-(0.725)));
            zz = 0 + (((tickAnim - 17) / 30) * (0.825-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = -0.92 + (((tickAnim - 47) / 13) * (0-(-0.92)));
            zz = 0.825 + (((tickAnim - 47) / 13) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightFlipper2.rotationPointX = this.frontRightFlipper2.rotationPointX + (float)(xx);
        this.frontRightFlipper2.rotationPointY = this.frontRightFlipper2.rotationPointY - (float)(yy);
        this.frontRightFlipper2.rotationPointZ = this.frontRightFlipper2.rotationPointZ + (float)(zz);



        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*-10), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*-20), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-10));


        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*4), backLeftFlipper.rotateAngleY + (float) Math.toRadians(0), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*4), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(0), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backLeftFlipper3, backLeftFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*4), backLeftFlipper3.rotateAngleY + (float) Math.toRadians(0), backLeftFlipper3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*4), backRightFlipper.rotateAngleY + (float) Math.toRadians(0), backRightFlipper.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*4), backRightFlipper2.rotateAngleY + (float) Math.toRadians(0), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*4), backRightFlipper3.rotateAngleY + (float) Math.toRadians(0), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*7), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*7), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingmainIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDesmatochelys entity = (EntityPrehistoricFloraDesmatochelys) entitylivingmainIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 47) {
            xx = 2 + (((tickAnim - 46) / 1) * (4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*5-(2)));
            yy = 0 + (((tickAnim - 46) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 1) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 80) {
            xx = 4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*5 + (((tickAnim - 47) / 33) * (0-(4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*5)));
            yy = 0 + (((tickAnim - 47) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.235 + (((tickAnim - 0) / 12) * (0-(-0.235)));
            zz = 0.005 + (((tickAnim - 0) / 12) * (-0.175-(0.005)));
        }
        else if (tickAnim >= 12 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 12) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 34) * (1.025-(0)));
            zz = -0.175 + (((tickAnim - 12) / 34) * (0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-1-(-0.175)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            yy = 1.025 + (((tickAnim - 46) / 12) * (-0.31-(1.025)));
            zz = 0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-1 + (((tickAnim - 46) / 12) * (-0.2-(0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-1)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            yy = -0.31 + (((tickAnim - 58) / 22) * (-0.235-(-0.31)));
            zz = -0.2 + (((tickAnim - 58) / 22) * (0.005-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 68) {
            xx = 8.5 + (((tickAnim - 46) / 22) * (-3.5-(8.5)));
            yy = 0 + (((tickAnim - 46) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 22) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -3.5 + (((tickAnim - 68) / 12) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 68) {
            xx = -10.75 + (((tickAnim - 46) / 22) * (4.75-(-10.75)));
            yy = 0 + (((tickAnim - 46) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 22) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 4.75 + (((tickAnim - 68) / 12) * (0-(4.75)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0.525-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 46) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 34) * (0-(0)));
            zz = 0.525 + (((tickAnim - 46) / 34) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (-29.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 80) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20 + (((tickAnim - 46) / 34) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20)));
            yy = -29.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 46) / 34) * (0-(-29.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            zz = 0 + (((tickAnim - 46) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(xx), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(yy), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-3.17099-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (2.74864-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (4.80147-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 46) {
            xx = -3.17099 + (((tickAnim - 24) / 22) * (28.39562-(-3.17099)));
            yy = 2.74864 + (((tickAnim - 24) / 22) * (0.58706-(2.74864)));
            zz = 4.80147 + (((tickAnim - 24) / 22) * (-2.23802-(4.80147)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = 28.39562 + (((tickAnim - 46) / 12) * (7.89214-(28.39562)));
            yy = 0.58706 + (((tickAnim - 46) / 12) * (37.6386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0.58706)));
            zz = -2.23802 + (((tickAnim - 46) / 12) * (-37.2077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-2.23802)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 7.89214 + (((tickAnim - 58) / 22) * (0-(7.89214)));
            yy = 37.6386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 58) / 22) * (0-(37.6386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = -37.2077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 58) / 22) * (0-(-37.2077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftFlipper2, frontLeftFlipper2.rotateAngleX + (float) Math.toRadians(xx), frontLeftFlipper2.rotateAngleY + (float) Math.toRadians(yy), frontLeftFlipper2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 24) / 56) * (0-(0)));
            yy = 0.6 + (((tickAnim - 24) / 56) * (0-(0.6)));
            zz = 0 + (((tickAnim - 24) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftFlipper2.rotationPointX = this.frontLeftFlipper2.rotationPointX + (float)(xx);
        this.frontLeftFlipper2.rotationPointY = this.frontLeftFlipper2.rotationPointY - (float)(yy);
        this.frontLeftFlipper2.rotationPointZ = this.frontLeftFlipper2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-4.9692-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-2.61202-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (2.56055-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -4.9692 + (((tickAnim - 24) / 11) * (-10.87781-(-4.9692)));
            yy = -2.61202 + (((tickAnim - 24) / 11) * (-3.78292-(-2.61202)));
            zz = 2.56055 + (((tickAnim - 24) / 11) * (3.70839-(2.56055)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = -10.87781 + (((tickAnim - 35) / 11) * (-15.44367-(-10.87781)));
            yy = -3.78292 + (((tickAnim - 35) / 11) * (-4.95382-(-3.78292)));
            zz = 3.70839 + (((tickAnim - 35) / 11) * (-3.9654-(3.70839)));
        }
        else if (tickAnim >= 46 && tickAnim < 47) {
            xx = -15.44367 + (((tickAnim - 46) / 1) * (-14.64367-(-15.44367)));
            yy = -4.95382 + (((tickAnim - 46) / 1) * (-95.1038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(-4.95382)));
            zz = -3.9654 + (((tickAnim - 46) / 1) * (-3.9654-(-3.9654)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = -14.64367 + (((tickAnim - 47) / 4) * (-3.39443-(-14.64367)));
            yy = -95.1038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 47) / 4) * (-10.7442-(-95.1038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            zz = -3.9654 + (((tickAnim - 47) / 4) * (-5.62561-(-3.9654)));
        }
        else if (tickAnim >= 51 && tickAnim < 68) {
            xx = -3.39443 + (((tickAnim - 51) / 17) * (-1.6476-(-3.39443)));
            yy = -10.7442 + (((tickAnim - 51) / 17) * (8.50718-(-10.7442)));
            zz = -5.62561 + (((tickAnim - 51) / 17) * (-12.59852-(-5.62561)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -1.6476 + (((tickAnim - 68) / 12) * (0-(-1.6476)));
            yy = 8.50718 + (((tickAnim - 68) / 12) * (0-(8.50718)));
            zz = -12.59852 + (((tickAnim - 68) / 12) * (0-(-12.59852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftFlipper3, frontLeftFlipper3.rotateAngleX + (float) Math.toRadians(xx), frontLeftFlipper3.rotateAngleY + (float) Math.toRadians(yy), frontLeftFlipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            yy = 0.325 + (((tickAnim - 11) / 13) * (0-(0.325)));
            zz = 0 + (((tickAnim - 11) / 13) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 24) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 22) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 46) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftFlipper3.rotationPointX = this.frontLeftFlipper3.rotationPointX + (float)(xx);
        this.frontLeftFlipper3.rotationPointY = this.frontLeftFlipper3.rotationPointY - (float)(yy);
        this.frontLeftFlipper3.rotationPointZ = this.frontLeftFlipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (29.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 80) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20 + (((tickAnim - 46) / 34) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20)));
            yy = 29.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 46) / 34) * (0-(29.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            zz = 0 + (((tickAnim - 46) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-3.17099-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (2.74864-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (-4.80147-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 46) {
            xx = -3.17099 + (((tickAnim - 24) / 22) * (28.39562-(-3.17099)));
            yy = 2.74864 + (((tickAnim - 24) / 22) * (0.58706-(2.74864)));
            zz = -4.80147 + (((tickAnim - 24) / 22) * (-2.23802-(-4.80147)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = 28.39562 + (((tickAnim - 46) / 12) * (5.85786-(28.39562)));
            yy = 0.58706 + (((tickAnim - 46) / 12) * (-37.6386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0.58706)));
            zz = -2.23802 + (((tickAnim - 46) / 12) * (37.2077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-2.23802)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 5.85786 + (((tickAnim - 58) / 22) * (0-(5.85786)));
            yy = -37.6386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 58) / 22) * (0-(-37.6386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 37.2077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 58) / 22) * (0-(37.2077+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 24) / 56) * (0-(0)));
            yy = 0.6 + (((tickAnim - 24) / 56) * (0-(0.6)));
            zz = 0 + (((tickAnim - 24) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightFlipper2.rotationPointX = this.frontRightFlipper2.rotationPointX + (float)(xx);
        this.frontRightFlipper2.rotationPointY = this.frontRightFlipper2.rotationPointY - (float)(yy);
        this.frontRightFlipper2.rotationPointZ = this.frontRightFlipper2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-4.9692-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-2.61202-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (2.56055-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -4.9692 + (((tickAnim - 24) / 11) * (-14.62781-(-4.9692)));
            yy = -2.61202 + (((tickAnim - 24) / 11) * (-3.78292-(-2.61202)));
            zz = 2.56055 + (((tickAnim - 24) / 11) * (3.70839-(2.56055)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = -14.62781 + (((tickAnim - 35) / 11) * (-15.44367-(-14.62781)));
            yy = -3.78292 + (((tickAnim - 35) / 11) * (-4.95382-(-3.78292)));
            zz = 3.70839 + (((tickAnim - 35) / 11) * (-3.9654-(3.70839)));
        }
        else if (tickAnim >= 46 && tickAnim < 47) {
            xx = -15.44367 + (((tickAnim - 46) / 1) * (-14.64367-(-15.44367)));
            yy = -4.95382 + (((tickAnim - 46) / 1) * (-95.1038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(-4.95382)));
            zz = -3.9654 + (((tickAnim - 46) / 1) * (-3.9654-(-3.9654)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = -14.64367 + (((tickAnim - 47) / 4) * (-6.64443-(-14.64367)));
            yy = -95.1038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 47) / 4) * (-10.7442-(-95.1038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            zz = -3.9654 + (((tickAnim - 47) / 4) * (-5.62561-(-3.9654)));
        }
        else if (tickAnim >= 51 && tickAnim < 68) {
            xx = -6.64443 + (((tickAnim - 51) / 17) * (-1.6476-(-6.64443)));
            yy = -10.7442 + (((tickAnim - 51) / 17) * (-8.50718-(-10.7442)));
            zz = -5.62561 + (((tickAnim - 51) / 17) * (12.59852-(-5.62561)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -1.6476 + (((tickAnim - 68) / 12) * (0-(-1.6476)));
            yy = -8.50718 + (((tickAnim - 68) / 12) * (0-(-8.50718)));
            zz = 12.59852 + (((tickAnim - 68) / 12) * (0-(12.59852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            yy = 0.325 + (((tickAnim - 11) / 13) * (0-(0.325)));
            zz = 0 + (((tickAnim - 11) / 13) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 24) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 22) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 46) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightFlipper3.rotationPointX = this.frontRightFlipper3.rotationPointX + (float)(xx);
        this.frontRightFlipper3.rotationPointY = this.frontRightFlipper3.rotationPointY - (float)(yy);
        this.frontRightFlipper3.rotationPointZ = this.frontRightFlipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = -16 + (((tickAnim - 46) / 12) * (0-(-16)));
            yy = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 12) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 58) / 12) * (0.25-(0)));
            yy = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 12) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.25 + (((tickAnim - 70) / 10) * (0-(0.25)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 12) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 58) / 12) * (0.25-(0)));
            yy = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 12) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.25 + (((tickAnim - 70) / 10) * (0-(0.25)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (14.08949-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (4.40611-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (-8.6734-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = 14.08949 + (((tickAnim - 46) / 12) * (0-(14.08949)));
            yy = 4.40611 + (((tickAnim - 46) / 12) * (0-(4.40611)));
            zz = -8.6734 + (((tickAnim - 46) / 12) * (0-(-8.6734)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 58) / 12) * (1.5-(0)));
            yy = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 12) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 70) / 10) * (0-(1.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper3, backLeftFlipper3.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper3.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = -16 + (((tickAnim - 46) / 12) * (0-(-16)));
            yy = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 12) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 58) / 12) * (0.25-(0)));
            yy = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 12) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.25 + (((tickAnim - 70) / 10) * (0-(0.25)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 12) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 58) / 12) * (0.25-(0)));
            yy = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 12) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.25 + (((tickAnim - 70) / 10) * (0-(0.25)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper2.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (14.08949-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (-4.40611-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (8.6734-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = 14.08949 + (((tickAnim - 46) / 12) * (0-(14.08949)));
            yy = -4.40611 + (((tickAnim - 46) / 12) * (0-(-4.40611)));
            zz = 8.6734 + (((tickAnim - 46) / 12) * (0-(8.6734)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 58) / 12) * (1.5-(0)));
            yy = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 12) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 70) / 10) * (0-(1.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper3.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = -8.25 + (((tickAnim - 0) / 46) * (-38-(-8.25)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = -38 + (((tickAnim - 46) / 12) * (-8.25-(-38)));
            yy = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));

    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDesmatochelys e = (EntityPrehistoricFloraDesmatochelys) entity;
        animator.update(entity);


    }
}
