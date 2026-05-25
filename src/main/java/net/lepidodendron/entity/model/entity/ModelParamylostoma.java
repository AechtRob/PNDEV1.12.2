package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelParamylostoma extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;


    private ModelAnimator animator;

    public ModelParamylostoma() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 24, -3.0F, -9.2F, -4.7F, 6, 6, 6, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.2F, -4.7F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 24, -3.0F, 0.0F, -4.0F, 6, 7, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.8228F, -3.8325F, -13.3997F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.8539F, -0.2283F, 0.105F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 67, -0.05F, -2.0F, -2.0F, 1, 2, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.6065F, -3.4967F, -10.7208F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.0758F, -0.2236F, 0.0187F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 63, 0.075F, -3.0F, -3.0F, 1, 3, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.3311F, -2.8345F, -11.8433F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.4149F, -0.3678F, 0.0162F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 63, 0.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.3311F, -2.8345F, -11.8433F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.4149F, 0.3678F, -0.0162F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 63, -1.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.6065F, -3.4967F, -10.7208F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.0758F, 0.2236F, -0.0187F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 63, -1.075F, -3.0F, -3.0F, 1, 3, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -2.2894F, -14.6304F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.1083F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 29, -0.5F, 0.0F, 0.0F, 3, 3, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -2.2894F, -14.6304F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.2279F, -0.2332F, 0.0081F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 67, 0.125F, -1.75F, -0.3F, 1, 2, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, -2.2894F, -14.6304F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.2279F, 0.2332F, -0.0081F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 67, -1.125F, -1.75F, -0.3F, 1, 2, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.8228F, -3.8325F, -13.3997F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.8539F, 0.2283F, -0.105F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 67, -0.95F, -2.0F, -2.0F, 1, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -3.9142F, -15.8633F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.8465F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 65, 15, -0.5F, 0.0F, -0.4F, 2, 2, 1, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -5.2111F, -16.4272F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.1956F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 65, 19, -0.5F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.6377F, -7.174F, -10.1903F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1535F, 0.1387F, -0.0222F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 56, 0.225F, 0.0F, 0.1F, 2, 7, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.2763F, -6.4602F, -12.9229F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.262F, -0.3744F, -0.0871F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 56, 0.025F, 0.0F, 0.05F, 2, 5, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.7533F, -6.0523F, -14.5579F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.237F, -0.2889F, -0.0677F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 63, 0.0F, 0.0F, -0.1F, 1, 3, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.6948F, -6.0092F, -14.7443F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5962F, -0.0475F, -0.1541F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 48, 40, -0.0211F, 0.0316F, -1.8575F, 1, 2, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(3.6377F, -7.174F, -10.1903F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1535F, -0.1387F, 0.0222F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 56, -2.225F, 0.0F, 0.1F, 2, 7, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.2763F, -6.4602F, -12.9229F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.262F, 0.3744F, 0.0871F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 56, -2.025F, 0.0F, 0.05F, 2, 5, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.7533F, -6.0523F, -14.5579F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.237F, 0.2889F, 0.0677F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 63, -1.0F, 0.0F, -0.1F, 1, 3, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.6948F, -6.0092F, -14.7443F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5962F, 0.0475F, 0.1541F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 48, 40, -0.9789F, 0.0316F, -1.8575F, 1, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -6.315F, -14.7594F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5847F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 65, 0, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -7.2669F, -11.9145F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3229F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 39, 58, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -7.2669F, -11.9145F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2094F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 48, 34, -2.5F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.0646F, -10.5001F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0742F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 63, 24, -2.0F, -2.0F, -2.0F, 4, 2, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.0F, -0.0122F, -4.5004F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0087F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 25, 36, -0.5F, -2.0F, -6.0F, 5, 2, 6, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.0F, -4.7F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0611F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 25, 13, -2.0F, -4.0F, 0.2F, 5, 4, 6, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.0F, -9.2F, -4.7F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.0036F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 45, -3.0F, 0.0F, 0.0F, 0, 5, 7, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.8628F, 0.6981F);
        this.main.addChild(body);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 4.4321F, 0.3051F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1571F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 37, -2.0F, -3.0F, 0.0F, 4, 3, 6, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -4.2622F, 0.3019F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 25, 0, -2.5F, 0.0F, 0.0F, 5, 6, 6, -0.006F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.75F, 4.3327F, 0.9267F);
        this.body.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0001F, -0.2748F, 0.6848F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 57, 0.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.75F, 4.3327F, 0.9267F);
        this.body.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0001F, 0.2748F, -0.6848F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 57, -4.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.5195F, 5.3935F);
        this.body.addChild(tail);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.3703F, 5.9274F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1309F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 48, 15, -1.5F, -0.1F, -6.1F, 3, 3, 5, -0.003F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -2.1176F, -0.0915F);
        this.tail.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1353F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 21, 45, -1.5F, -0.05F, 0.3F, 4, 5, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.7264F, 4.381F);
        this.tail.addChild(tail2);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 2.913F, 5.8036F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0698F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 55, 49, -0.5F, -1.7F, -6.0F, 2, 2, 5, -0.003F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0F, -1.6914F, 4.9847F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1047F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 46, 24, -0.5F, -0.025F, -4.85F, 3, 4, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5812F, 4.0397F);
        this.tail2.addChild(tail3);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 2.1036F, 6.889F);
        this.tail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0567F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 55, 40, -0.5F, -1.95F, -6.9F, 1, 2, 6, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.2252F, 3.9878F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0436F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 55, 57, -3.25F, 0.175F, -3.225F, 2, 0, 5, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 55, 57, 0.25F, 0.175F, -3.225F, 2, 0, 5, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 48, 0, -1.5F, -1.825F, -3.975F, 2, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.7838F, 5.4307F);
        this.tail3.addChild(tail4);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 0.6895F, 0.5542F);
        this.tail4.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.6545F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 0, 0.5F, -1.825F, -1.975F, 0, 11, 12, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 47, 0.0F, -1.825F, -0.975F, 1, 2, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.3593F, -12.0438F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.3491F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 62, -1.5F, 0.1F, -3.0F, 3, 1, 3, -0.003F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.3F, 0.5056F, -2.4208F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1745F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 21, 40, -0.075F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 21, 40, 2.675F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0328F, -0.0084F, -4.0578F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1855F, -0.3435F, 0.0631F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 21, 37, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.0328F, -0.0084F, -4.0578F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1855F, 0.3435F, -0.0631F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 21, 37, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.0F, 0.3346F, -4.8478F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3909F, -0.2732F, 0.0475F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 28, 65, 0.0F, -1.0F, 0.05F, 1, 1, 2, -0.003F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0F, 0.3346F, -4.8478F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.3909F, 0.2732F, -0.0475F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 28, 65, -1.0F, -1.0F, 0.05F, 1, 1, 2, -0.003F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 1.1F, -3.0F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.3927F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 62, 63, -1.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.8982F, -1.0785F, -8.8452F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0665F, -0.3051F, 0.598F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 48, 10, 0.0F, 0.0F, 0.0F, 6, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.8982F, -1.0785F, -8.8452F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0665F, 0.3051F, -0.598F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 48, 10, -6.0F, 0.0F, 0.0F, 6, 0, 4, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.4484F, -4.1981F, -14.0707F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, 0.0056F, 0.3494F, -0.0002F);
        this.eye.cubeList.add(new ModelBox(eye, 65, 4, -0.5125F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 10, 67, -0.4875F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.4484F, -4.1981F, -14.0707F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, 0.0056F, -0.3494F, 0.0002F);
        this.eye2.cubeList.add(new ModelBox(eye2, 65, 4, -0.4875F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 10, 67, -0.5125F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));



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


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

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
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin  , (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
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

