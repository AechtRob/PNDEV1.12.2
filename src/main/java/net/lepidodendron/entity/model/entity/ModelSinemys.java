package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSinemys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSinemys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;

    private ModelAnimator animator;

    public ModelSinemys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 4.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 15, -3.0F, -5.35F, -6.3F, 6, 2, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -6.0F, -2.6F, -7.3F, 12, 2, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.6F, -1.3F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 18, -3.0F, -2.0F, 0.0F, 6, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.45F, -6.3F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 24, -3.0F, -2.0F, -5.0F, 6, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.35F, -6.3F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 22, -3.0F, 0.0F, -5.0F, 6, 2, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.35F, -1.3F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2443F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, -3.0F, 0.0F, 0.0F, 6, 2, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, -5.35F, -1.3F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.4712F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 37, 0.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.0F, -5.35F, -3.3F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.4712F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 0, 0.0F, 0.0F, -3.0F, 5, 0, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(5.2997F, -2.125F, -9.9314F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -3.0973F, 0.7415F, -3.0958F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 49, 0.0F, -2.0F, -3.0F, 3, 2, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.0F, -5.35F, -6.3F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.4712F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 44, 0.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(9.7592F, -2.05F, -1.7373F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0524F, 2.7533F, 0.1309F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 44, -5.5F, -1.0F, -1.475F, 7, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(9.7592F, -2.025F, -1.7373F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0524F, 2.5744F, 0.1309F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 42, -5.9F, -1.0F, -0.5F, 7, 1, 1, 0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.0F, -5.35F, -6.3F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, -0.4712F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 44, -4.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.0F, -5.35F, -3.3F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.4712F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 0, -5.0F, 0.0F, -3.0F, 5, 0, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.0F, -5.35F, -1.3F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, -0.4712F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 37, -5.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(8.7592F, -2.025F, 0.2127F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0184F, 0.546F, 0.0401F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 24, -3.6F, -1.0F, -5.0F, 3, 1, 5, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(9.7592F, -1.925F, -1.7373F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 3.1098F, 1.0041F, -3.1172F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 8, -1.0F, -1.0F, -4.0F, 7, 1, 4, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(8.5342F, -2.0F, 0.2627F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1516F, 0.5328F, 0.3279F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 41, -3.6F, -1.0F, -4.975F, 3, 1, 5, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(6.5958F, -1.9F, 1.5571F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0654F, 0.5229F, 0.0532F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 38, -5.0F, -2.175F, -4.0F, 4, 2, 4, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(9.7592F, -2.1F, -1.7373F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -2.9708F, 1.0001F, -2.8783F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 13, -1.0F, -1.0F, -4.0F, 7, 1, 4, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(6.9362F, -2.0F, -6.2144F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -3.0732F, 1.1635F, -3.0605F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 18, 0.05F, -2.0F, -4.0F, 4, 2, 4, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-6.5958F, -1.9F, 1.5571F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0654F, -0.5229F, -0.0532F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 38, 1.0F, -2.175F, -4.0F, 4, 2, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-8.7592F, -2.025F, 0.2127F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0184F, -0.546F, -0.0401F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 24, 0.6F, -1.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-8.5342F, -2.0F, 0.2627F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1516F, -0.5328F, -0.3279F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 41, 0.6F, -1.0F, -4.975F, 3, 1, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-9.7592F, -2.05F, -1.7373F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0524F, -2.7533F, -0.1309F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 48, 44, -1.5F, -1.0F, -1.475F, 7, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-9.7592F, -2.025F, -1.7373F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0524F, -2.5744F, -0.1309F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 48, 42, -1.1F, -1.0F, -0.5F, 7, 1, 1, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-9.7592F, -2.1F, -1.7373F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -2.9708F, -1.0001F, 2.8783F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 22, 13, -6.0F, -1.0F, -4.0F, 7, 1, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-9.7592F, -1.925F, -1.7373F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 3.1098F, -1.0041F, 3.1172F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 8, -6.0F, -1.0F, -4.0F, 7, 1, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-6.9362F, -2.0F, -6.2144F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -3.0732F, -1.1635F, 3.0605F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 42, 18, -4.05F, -2.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-5.2997F, -2.125F, -9.9314F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -3.0973F, -0.7415F, 3.0958F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 26, 49, -3.0F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.5386F, -2.125F, -12.2585F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -3.1028F, -0.1047F, -3.1192F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 44, 5, -0.5F, -2.125F, -4.3F, 3, 2, 4, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.5386F, -2.125F, -12.2585F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -3.1028F, 0.1047F, 3.1192F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 44, 5, -2.5F, -2.125F, -4.3F, 3, 2, 4, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -2.075F, -7.75F);
        this.main.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0698F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 30, -2.5F, -1.975F, -4.0F, 5, 2, 4, 0.001F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.main.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0698F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 36, 36, -2.5F, -1.975F, 0.05F, 5, 2, 4, 0.001F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.4F, -10.1F);
        this.main.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 44, 11, -1.5F, -1.5F, -4.0F, 3, 2, 4, 0.012F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.05F, -3.5F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 48, 46, -1.5F, -1.45F, -3.0F, 3, 2, 3, 0.011F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.15F, -2.75F);
        this.neck2.addChild(neck3);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.2768F, 0.4209F, -3.3593F);
        this.neck3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0092F, 0.432F, 0.0684F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 5, -0.9821F, -1.1957F, 0.4876F, 1, 1, 2, -0.002F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.3018F, 0.4459F, -1.6093F);
        this.neck3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0393F, 0.0684F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 42, 49, -0.9821F, -1.1957F, 0.4876F, 1, 1, 1, -0.002F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.3018F, 0.4459F, -1.6093F);
        this.neck3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.0393F, -0.0684F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 42, 49, -0.0179F, -1.1957F, 0.4876F, 1, 1, 1, -0.002F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.2768F, 0.4209F, -3.3593F);
        this.neck3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0092F, -0.432F, -0.0684F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 36, 5, -0.0179F, -1.1957F, 0.4876F, 1, 1, 2, -0.002F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(2.2F, -1.1F, -0.4F);
        this.neck3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1736F, 0.3114F, 0.0443F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 8, 54, -1.7835F, -0.1586F, -3.1202F, 1, 1, 3, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-2.2F, -1.1F, -0.4F);
        this.neck3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1736F, -0.3114F, -0.0443F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 8, 54, 0.7835F, -0.1586F, -3.1202F, 1, 1, 3, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 0.4233F, -3.9755F);
        this.neck3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0175F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 50, 51, -1.0F, -1.175F, 1.0F, 1, 1, 3, 0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, 0.4233F, -3.9755F);
        this.neck3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.192F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 24, 54, -1.0F, -1.0F, 1.0F, 1, 1, 3, 0.011F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.7F, -0.425F, -3.05F);
        this.neck3.addChild(eye2);
        this.setRotateAngle(eye2, -0.0436F, -0.0436F, 0.2618F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.7F, -0.7F, 2.5F);
        this.eye2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1392F, -0.346F, -0.0475F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 38, 49, 0.7582F, -0.1771F, -2.921F, 1, 1, 1, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.7F, -0.425F, -3.05F);
        this.neck3.addChild(eye);
        this.setRotateAngle(eye, -0.0436F, 0.0436F, -0.2618F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.7F, -0.7F, 2.5F);
        this.eye.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1392F, 0.346F, 0.0475F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 38, 49, -1.7582F, -0.1771F, -2.921F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.425F, 0.0F);
        this.neck3.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 52, -0.5F, -0.75F, -2.8F, 1, 1, 3, -0.002F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(2.75F, -1.75F, 0.0F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.3491F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 16, 54, -2.2366F, 1.0F, -3.4098F, 1, 1, 3, -0.003F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-2.75F, -1.75F, 0.0F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.3491F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 16, 54, 1.2366F, 1.0F, -3.4098F, 1, 1, 3, -0.003F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.552F, -2.2924F, -7.9153F);
        this.main.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.2793F, 0.8727F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 0, 29, -1.7044F, -1.008F, -5.5611F, 3, 2, 6, 0.0F, false));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.1722F, -0.522F, -5.1741F);
        this.frontRightLeg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.1353F, -0.3918F, 0.03F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 38, 51, -1.5131F, -0.008F, -2.9901F, 3, 1, 3, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.552F, -2.2924F, -7.9153F);
        this.main.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.2793F, -0.8727F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 0, 29, -1.2956F, -1.008F, -5.5611F, 3, 2, 6, 0.0F, true));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.1722F, -0.522F, -5.1741F);
        this.frontLeftLeg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.1353F, 0.3918F, -0.03F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 38, 51, -1.4869F, -0.008F, -2.9901F, 3, 1, 3, 0.0F, true));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.2888F, -2.3959F, -0.0477F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.2356F, -0.8727F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 18, 30, -1.4544F, -1.008F, 0.0611F, 3, 2, 6, 0.0F, false));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.0587F, -0.4958F, 5.0381F);
        this.backRightLeg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.0436F, 0.3927F, 0.0F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 0, 47, -1.5131F, -0.008F, 0.1742F, 3, 1, 4, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.2888F, -2.3959F, -0.0477F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.2356F, 0.8727F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 18, 30, -1.5456F, -1.008F, 0.0611F, 3, 2, 6, 0.0F, true));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(-0.0587F, -0.4958F, 5.0381F);
        this.backLeftLeg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0436F, -0.3927F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 0, 47, -1.4869F, -0.008F, 0.1742F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.3159F, 2.2245F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 14, 48, -1.0F, -1.0F, -0.25F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0309F, 3.7528F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 42, -0.5F, -0.5F, -0.5F, 1, 1, 6, 0.0F, false));
        

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
        this.main.offsetY = -1.7F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(150);
        this.main.rotateAngleX = (float)Math.toRadians(20);
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

        EntityPrehistoricFloraSinemys entitySinemys = (EntityPrehistoricFloraSinemys) e;

        if (entitySinemys.getAnimation() == entitySinemys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3};

        if (entitySinemys.getAnimation() == entitySinemys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entitySinemys.isReallyInWater()) {

                if (f3 == 0.0F || !entitySinemys.getIsMoving()) {
                    if (entitySinemys.getAnimation() != entitySinemys.EAT_ANIMATION
                        && entitySinemys.getAnimation() != entitySinemys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySinemys.getIsFast()) { //Running


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

        EntityPrehistoricFloraSinemys ee = (EntityPrehistoricFloraSinemys) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinemys entity = (EntityPrehistoricFloraSinemys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (4.38-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.38 + (((tickAnim - 10) / 3) * (6.10756-(4.38)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.26616-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (2.4858-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 6.10756 + (((tickAnim - 13) / 7) * (7.5-(6.10756)));
            yy = -0.26616 + (((tickAnim - 13) / 7) * (0-(-0.26616)));
            zz = 2.4858 + (((tickAnim - 13) / 7) * (0-(2.4858)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 20) / 3) * (6.93651-(7.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0.42343-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (-3.58618-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 6.93651 + (((tickAnim - 23) / 5) * (6.2587-(6.93651)));
            yy = 0.42343 + (((tickAnim - 23) / 5) * (0.27272-(0.42343)));
            zz = -3.58618 + (((tickAnim - 23) / 5) * (-2.48509-(-3.58618)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 6.2587 + (((tickAnim - 28) / 4) * (6.03255-(6.2587)));
            yy = 0.27272 + (((tickAnim - 28) / 4) * (-0.28955-(0.27272)));
            zz = -2.48509 + (((tickAnim - 28) / 4) * (2.81855-(-2.48509)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 6.03255 + (((tickAnim - 32) / 7) * (4.9416-(6.03255)));
            yy = -0.28955 + (((tickAnim - 32) / 7) * (0.14303-(-0.28955)));
            zz = 2.81855 + (((tickAnim - 32) / 7) * (-1.78608-(2.81855)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 4.9416 + (((tickAnim - 39) / 3) * (4.58-(4.9416)));
            yy = 0.14303 + (((tickAnim - 39) / 3) * (0-(0.14303)));
            zz = -1.78608 + (((tickAnim - 39) / 3) * (0-(-1.78608)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 4.58 + (((tickAnim - 42) / 3) * (2.74537-(4.58)));
            yy = 0 + (((tickAnim - 42) / 3) * (-0.11982-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (2.49713-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 2.74537 + (((tickAnim - 45) / 5) * (0-(2.74537)));
            yy = -0.11982 + (((tickAnim - 45) / 5) * (0-(-0.11982)));
            zz = 2.49713 + (((tickAnim - 45) / 5) * (0-(2.49713)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (1-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 1 + (((tickAnim - 20) / 30) * (0-(1)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 5) / 45) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 5) / 5) * (-10.34-(-5)));
            yy = 10 + (((tickAnim - 5) / 5) * (10-(10)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -10.34 + (((tickAnim - 10) / 11) * (-18.5-(-10.34)));
            yy = 10 + (((tickAnim - 10) / 11) * (10-(10)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 42) {
            xx = -18.5 + (((tickAnim - 21) / 21) * (-11.35715-(-18.5)));
            yy = 10 + (((tickAnim - 21) / 21) * (10-(10)));
            zz = 0 + (((tickAnim - 21) / 21) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -11.35715 + (((tickAnim - 42) / 8) * (0-(-11.35715)));
            yy = 10 + (((tickAnim - 42) / 8) * (0-(10)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 5) / 14) * (0-(0)));
            yy = 10 + (((tickAnim - 5) / 14) * (0-(10)));
            zz = 0 + (((tickAnim - 5) / 14) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 19) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 13) * (-3.45-(0)));
            zz = 0 + (((tickAnim - 19) / 13) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            yy = -3.45 + (((tickAnim - 32) / 10) * (11.39-(-3.45)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 11.39 + (((tickAnim - 42) / 8) * (0-(11.39)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 22) {
            xx = -25 + (((tickAnim - 5) / 17) * (-12.5-(-25)));
            yy = 0 + (((tickAnim - 5) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 17) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 39) {
            xx = -12.5 + (((tickAnim - 22) / 17) * (-17.86323-(-12.5)));
            yy = 0 + (((tickAnim - 22) / 17) * (-7.14226-(0)));
            zz = 0 + (((tickAnim - 22) / 17) * (2.29464-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -17.86323 + (((tickAnim - 39) / 11) * (0-(-17.86323)));
            yy = -7.14226 + (((tickAnim - 39) / 11) * (0-(-7.14226)));
            zz = 2.29464 + (((tickAnim - 39) / 11) * (0-(2.29464)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            zz = -1 + (((tickAnim - 5) / 45) * (-1-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-95.5114-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (34.18897-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-97.725-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -95.5114 + (((tickAnim - 5) / 5) * (-100.59473-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 5) / 5) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 5) / 5) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -100.59473 + (((tickAnim - 10) / 3) * (-98.02731-(-100.59473)));
            yy = 34.18897 + (((tickAnim - 10) / 3) * (29.20595-(34.18897)));
            zz = -97.725 + (((tickAnim - 10) / 3) * (-100.71387-(-97.725)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -98.02731 + (((tickAnim - 13) / 7) * (-100.62092-(-98.02731)));
            yy = 29.20595 + (((tickAnim - 13) / 7) * (31.19915-(29.20595)));
            zz = -100.71387 + (((tickAnim - 13) / 7) * (-99.51833-(-100.71387)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -100.62092 + (((tickAnim - 20) / 3) * (-104.9006-(-100.62092)));
            yy = 31.19915 + (((tickAnim - 20) / 3) * (27.2029-(31.19915)));
            zz = -99.51833 + (((tickAnim - 20) / 3) * (-97.38001-(-99.51833)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -104.9006 + (((tickAnim - 23) / 5) * (-105.15619-(-104.9006)));
            yy = 27.2029 + (((tickAnim - 23) / 5) * (28.44465-(27.2029)));
            zz = -97.38001 + (((tickAnim - 23) / 5) * (-98.53648-(-97.38001)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -105.15619 + (((tickAnim - 28) / 2) * (-100.50953-(-105.15619)));
            yy = 28.44465 + (((tickAnim - 28) / 2) * (29.18971-(28.44465)));
            zz = -98.53648 + (((tickAnim - 28) / 2) * (-99.23038-(-98.53648)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -100.50953 + (((tickAnim - 30) / 2) * (-99.35913-(-100.50953)));
            yy = 29.18971 + (((tickAnim - 30) / 2) * (29.20764-(29.18971)));
            zz = -99.23038 + (((tickAnim - 30) / 2) * (-100.85857-(-99.23038)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = -99.35913 + (((tickAnim - 32) / 7) * (-103.37959-(-99.35913)));
            yy = 29.20764 + (((tickAnim - 32) / 7) * (32.94367-(29.20764)));
            zz = -100.85857 + (((tickAnim - 32) / 7) * (-98.50837-(-100.85857)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -103.37959 + (((tickAnim - 39) / 3) * (-100.71973-(-103.37959)));
            yy = 32.94367 + (((tickAnim - 39) / 3) * (34.18897-(32.94367)));
            zz = -98.50837 + (((tickAnim - 39) / 3) * (-97.725-(-98.50837)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -100.71973 + (((tickAnim - 42) / 3) * (-95.13636-(-100.71973)));
            yy = 34.18897 + (((tickAnim - 42) / 3) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 42) / 3) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -95.13636 + (((tickAnim - 45) / 5) * (0-(-95.13636)));
            yy = 34.18897 + (((tickAnim - 45) / 5) * (0-(34.18897)));
            zz = -97.725 + (((tickAnim - 45) / 5) * (0-(-97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (19.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-14-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 19.5 + (((tickAnim - 3) / 2) * (19.5-(19.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 42) {
            xx = -14 + (((tickAnim - 5) / 37) * (-14-(-14)));
            yy = 0 + (((tickAnim - 5) / 37) * (0-(0)));
            zz = 19.5 + (((tickAnim - 5) / 37) * (19.5-(19.5)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 42) / 8) * (0-(-14)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 19.5 + (((tickAnim - 42) / 8) * (0-(19.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-95.5114-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-34.18897-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (97.725-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -95.5114 + (((tickAnim - 5) / 5) * (-101.59473-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 5) / 5) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 5) / 5) * (97.725-(97.725)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -101.59473 + (((tickAnim - 10) / 3) * (-102.9692-(-101.59473)));
            yy = -34.18897 + (((tickAnim - 10) / 3) * (-26.68954-(-34.18897)));
            zz = 97.725 + (((tickAnim - 10) / 3) * (97.12012-(97.725)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -102.9692 + (((tickAnim - 13) / 10) * (-96.00727-(-102.9692)));
            yy = -26.68954 + (((tickAnim - 13) / 10) * (-28.72847-(-26.68954)));
            zz = 97.12012 + (((tickAnim - 13) / 10) * (100.03428-(97.12012)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -96.00727 + (((tickAnim - 23) / 5) * (-96.39434-(-96.00727)));
            yy = -28.72847 + (((tickAnim - 23) / 5) * (-29.01729-(-28.72847)));
            zz = 100.03428 + (((tickAnim - 23) / 5) * (99.16848-(100.03428)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -96.39434 + (((tickAnim - 28) / 2) * (-101.42658-(-96.39434)));
            yy = -29.01729 + (((tickAnim - 28) / 2) * (-29.19059-(-29.01729)));
            zz = 99.16848 + (((tickAnim - 28) / 2) * (98.64901-(99.16848)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -101.42658 + (((tickAnim - 30) / 2) * (-105.96845-(-101.42658)));
            yy = -29.19059 + (((tickAnim - 30) / 2) * (-29.90465-(-29.19059)));
            zz = 98.64901 + (((tickAnim - 30) / 2) * (98.51701-(98.64901)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -105.96845 + (((tickAnim - 32) / 6) * (-99.66589-(-105.96845)));
            yy = -29.90465 + (((tickAnim - 32) / 6) * (-31.46258-(-29.90465)));
            zz = 98.51701 + (((tickAnim - 32) / 6) * (98.22901-(98.51701)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -99.66589 + (((tickAnim - 38) / 7) * (-103.36332-(-99.66589)));
            yy = -31.46258 + (((tickAnim - 38) / 7) * (-33.02052-(-31.46258)));
            zz = 98.22901 + (((tickAnim - 38) / 7) * (97.941-(98.22901)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -103.36332 + (((tickAnim - 45) / 5) * (0-(-103.36332)));
            yy = -33.02052 + (((tickAnim - 45) / 5) * (0-(-33.02052)));
            zz = 97.941 + (((tickAnim - 45) / 5) * (0-(97.941)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-22.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-14-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -22.5 + (((tickAnim - 3) / 2) * (-19.5-(-22.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 42) {
            xx = -14 + (((tickAnim - 5) / 37) * (-14-(-14)));
            yy = 0 + (((tickAnim - 5) / 37) * (0-(0)));
            zz = -19.5 + (((tickAnim - 5) / 37) * (-19.5-(-19.5)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 42) / 8) * (0-(-14)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = -19.5 + (((tickAnim - 42) / 8) * (0-(-19.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.49999-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (67.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.00003-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 2.49999 + (((tickAnim - 5) / 9) * (-8.32337-(2.49999)));
            yy = 67.5 + (((tickAnim - 5) / 9) * (74.76614-(67.5)));
            zz = -0.00003 + (((tickAnim - 5) / 9) * (-1.69292-(-0.00003)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -8.32337 + (((tickAnim - 14) / 4) * (-9.57082-(-8.32337)));
            yy = 74.76614 + (((tickAnim - 14) / 4) * (43.57444-(74.76614)));
            zz = -1.69292 + (((tickAnim - 14) / 4) * (4.538-(-1.69292)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -9.57082 + (((tickAnim - 18) / 9) * (-13.15217-(-9.57082)));
            yy = 43.57444 + (((tickAnim - 18) / 9) * (75.49785-(43.57444)));
            zz = 4.538 + (((tickAnim - 18) / 9) * (-1.73145-(4.538)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -13.15217 + (((tickAnim - 27) / 9) * (-2.00511-(-13.15217)));
            yy = 75.49785 + (((tickAnim - 27) / 9) * (50.9483-(75.49785)));
            zz = -1.73145 + (((tickAnim - 27) / 9) * (3.16573-(-1.73145)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -2.00511 + (((tickAnim - 36) / 7) * (-13.15217-(-2.00511)));
            yy = 50.9483 + (((tickAnim - 36) / 7) * (75.49785-(50.9483)));
            zz = 3.16573 + (((tickAnim - 36) / 7) * (-1.73145-(3.16573)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -13.15217 + (((tickAnim - 43) / 7) * (0-(-13.15217)));
            yy = 75.49785 + (((tickAnim - 43) / 7) * (0-(75.49785)));
            zz = -1.73145 + (((tickAnim - 43) / 7) * (0-(-1.73145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = -2 + (((tickAnim - 5) / 9) * (-3-(-2)));
            yy = -0.5 + (((tickAnim - 5) / 9) * (-1-(-0.5)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -3 + (((tickAnim - 14) / 4) * (-0.75-(-3)));
            yy = -1 + (((tickAnim - 14) / 4) * (-1.5-(-1)));
            zz = 0 + (((tickAnim - 14) / 4) * (-1.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -0.75 + (((tickAnim - 18) / 9) * (-2.9-(-0.75)));
            yy = -1.5 + (((tickAnim - 18) / 9) * (-0.5-(-1.5)));
            zz = -1.15 + (((tickAnim - 18) / 9) * (-0.775-(-1.15)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -2.9 + (((tickAnim - 27) / 9) * (-2-(-2.9)));
            yy = -0.5 + (((tickAnim - 27) / 9) * (-1.5-(-0.5)));
            zz = -0.775 + (((tickAnim - 27) / 9) * (-2-(-0.775)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -2 + (((tickAnim - 36) / 3) * (-2.74-(-2)));
            yy = -1.5 + (((tickAnim - 36) / 3) * (-1.24-(-1.5)));
            zz = -2 + (((tickAnim - 36) / 3) * (0-(-2)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -2.74 + (((tickAnim - 39) / 4) * (-2.9-(-2.74)));
            yy = -1.24 + (((tickAnim - 39) / 4) * (-0.5-(-1.24)));
            zz = 0 + (((tickAnim - 39) / 4) * (-0.775-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -2.9 + (((tickAnim - 43) / 7) * (0-(-2.9)));
            yy = -0.5 + (((tickAnim - 43) / 7) * (0-(-0.5)));
            zz = -0.775 + (((tickAnim - 43) / 7) * (0-(-0.775)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (71.04414-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-102.09003-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-73.7627-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 71.04414 + (((tickAnim - 5) / 8) * (117.86784-(71.04414)));
            yy = -102.09003 + (((tickAnim - 5) / 8) * (-93.50775-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 5) / 8) * (-128.82274-(-73.7627)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 117.86784 + (((tickAnim - 13) / 4) * (110.56211-(117.86784)));
            yy = -93.50775 + (((tickAnim - 13) / 4) * (-43.28349-(-93.50775)));
            zz = -128.82274 + (((tickAnim - 13) / 4) * (-109.94108-(-128.82274)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 110.56211 + (((tickAnim - 17) / 6) * (89.22665-(110.56211)));
            yy = -43.28349 + (((tickAnim - 17) / 6) * (-31.37796-(-43.28349)));
            zz = -109.94108 + (((tickAnim - 17) / 6) * (-81.97446-(-109.94108)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 89.22665 + (((tickAnim - 23) / 5) * (12.89063-(89.22665)));
            yy = -31.37796 + (((tickAnim - 23) / 5) * (-19.4723-(-31.37796)));
            zz = -81.97446 + (((tickAnim - 23) / 5) * (-54.00752-(-81.97446)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 12.89063 + (((tickAnim - 28) / 10) * (104.66726-(12.89063)));
            yy = -19.4723 + (((tickAnim - 28) / 10) * (-39.93591-(-19.4723)));
            zz = -54.00752 + (((tickAnim - 28) / 10) * (-92.66503-(-54.00752)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 104.66726 + (((tickAnim - 38) / 3) * (73.7654-(104.66726)));
            yy = -39.93591 + (((tickAnim - 38) / 3) * (-34.94858-(-39.93591)));
            zz = -92.66503 + (((tickAnim - 38) / 3) * (-82.34489-(-92.66503)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 73.7654 + (((tickAnim - 41) / 3) * (21.3041-(73.7654)));
            yy = -34.94858 + (((tickAnim - 41) / 3) * (-36.85453-(-34.94858)));
            zz = -82.34489 + (((tickAnim - 41) / 3) * (-26.6619-(-82.34489)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 21.3041 + (((tickAnim - 44) / 6) * (0-(21.3041)));
            yy = -36.85453 + (((tickAnim - 44) / 6) * (0-(-36.85453)));
            zz = -26.6619 + (((tickAnim - 44) / 6) * (0-(-26.6619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.49999-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-67.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.00003-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2.49999 + (((tickAnim - 5) / 4) * (-8.32337-(2.49999)));
            yy = -67.5 + (((tickAnim - 5) / 4) * (-74.76614-(-67.5)));
            zz = 0.00003 + (((tickAnim - 5) / 4) * (1.69292-(0.00003)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -8.32337 + (((tickAnim - 9) / 7) * (-9.57082-(-8.32337)));
            yy = -74.76614 + (((tickAnim - 9) / 7) * (-43.57444-(-74.76614)));
            zz = 1.69292 + (((tickAnim - 9) / 7) * (-4.538-(1.69292)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -9.57082 + (((tickAnim - 16) / 6) * (-13.15217-(-9.57082)));
            yy = -43.57444 + (((tickAnim - 16) / 6) * (-75.49785-(-43.57444)));
            zz = -4.538 + (((tickAnim - 16) / 6) * (1.73145-(-4.538)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = -13.15217 + (((tickAnim - 22) / 9) * (-9.57082-(-13.15217)));
            yy = -75.49785 + (((tickAnim - 22) / 9) * (-43.57444-(-75.49785)));
            zz = 1.73145 + (((tickAnim - 22) / 9) * (-4.538-(1.73145)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -9.57082 + (((tickAnim - 31) / 7) * (-13.15217-(-9.57082)));
            yy = -43.57444 + (((tickAnim - 31) / 7) * (-75.49785-(-43.57444)));
            zz = -4.538 + (((tickAnim - 31) / 7) * (1.73145-(-4.538)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -13.15217 + (((tickAnim - 38) / 12) * (0-(-13.15217)));
            yy = -75.49785 + (((tickAnim - 38) / 12) * (0-(-75.49785)));
            zz = 1.73145 + (((tickAnim - 38) / 12) * (0-(1.73145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2 + (((tickAnim - 5) / 4) * (3-(2)));
            yy = -0.5 + (((tickAnim - 5) / 4) * (-0.55-(-0.5)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 3 + (((tickAnim - 9) / 7) * (1.975-(3)));
            yy = -0.55 + (((tickAnim - 9) / 7) * (-0.725-(-0.55)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 1.975 + (((tickAnim - 16) / 6) * (2.1-(1.975)));
            yy = -0.725 + (((tickAnim - 16) / 6) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 2.1 + (((tickAnim - 22) / 9) * (1.975-(2.1)));
            yy = 0 + (((tickAnim - 22) / 9) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 1.975 + (((tickAnim - 31) / 3) * (2.74-(1.975)));
            yy = -0.725 + (((tickAnim - 31) / 3) * (-1.24-(-0.725)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 2.74 + (((tickAnim - 34) / 4) * (2.1-(2.74)));
            yy = -1.24 + (((tickAnim - 34) / 4) * (0-(-1.24)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 2.1 + (((tickAnim - 38) / 12) * (0-(2.1)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (71.04414-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (102.09003-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (73.7627-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 71.04414 + (((tickAnim - 5) / 3) * (117.86784-(71.04414)));
            yy = 102.09003 + (((tickAnim - 5) / 3) * (93.50775-(102.09003)));
            zz = 73.7627 + (((tickAnim - 5) / 3) * (128.82274-(73.7627)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 117.86784 + (((tickAnim - 8) / 8) * (110.56211-(117.86784)));
            yy = 93.50775 + (((tickAnim - 8) / 8) * (43.28349-(93.50775)));
            zz = 128.82274 + (((tickAnim - 8) / 8) * (109.94108-(128.82274)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 110.56211 + (((tickAnim - 16) / 2) * (89.22665-(110.56211)));
            yy = 43.28349 + (((tickAnim - 16) / 2) * (31.37796-(43.28349)));
            zz = 109.94108 + (((tickAnim - 16) / 2) * (81.97446-(109.94108)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 89.22665 + (((tickAnim - 18) / 5) * (12.89063-(89.22665)));
            yy = 31.37796 + (((tickAnim - 18) / 5) * (19.4723-(31.37796)));
            zz = 81.97446 + (((tickAnim - 18) / 5) * (54.00752-(81.97446)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 12.89063 + (((tickAnim - 23) / 10) * (104.66726-(12.89063)));
            yy = 19.4723 + (((tickAnim - 23) / 10) * (39.93591-(19.4723)));
            zz = 54.00752 + (((tickAnim - 23) / 10) * (92.66503-(54.00752)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 104.66726 + (((tickAnim - 33) / 3) * (73.7654-(104.66726)));
            yy = 39.93591 + (((tickAnim - 33) / 3) * (34.94858-(39.93591)));
            zz = 92.66503 + (((tickAnim - 33) / 3) * (82.34489-(92.66503)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 73.7654 + (((tickAnim - 36) / 3) * (21.3041-(73.7654)));
            yy = 34.94858 + (((tickAnim - 36) / 3) * (36.85453-(34.94858)));
            zz = 82.34489 + (((tickAnim - 36) / 3) * (26.6619-(82.34489)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 21.3041 + (((tickAnim - 39) / 11) * (0-(21.3041)));
            yy = 36.85453 + (((tickAnim - 39) / 11) * (0-(36.85453)));
            zz = 26.6619 + (((tickAnim - 39) / 11) * (0-(26.6619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinemys entity = (EntityPrehistoricFloraSinemys) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-0.64743-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (2.41476-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-32.51365-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -0.64743 + (((tickAnim - 12) / 6) * (-6.5511-(-0.64743)));
            yy = 2.41476 + (((tickAnim - 12) / 6) * (3.5692-(2.41476)));
            zz = -32.51365 + (((tickAnim - 12) / 6) * (-28.30819-(-32.51365)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -6.5511 + (((tickAnim - 18) / 4) * (-16.20373-(-6.5511)));
            yy = 3.5692 + (((tickAnim - 18) / 4) * (19.53674-(3.5692)));
            zz = -28.30819 + (((tickAnim - 18) / 4) * (-31.74211-(-28.30819)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -16.20373 + (((tickAnim - 22) / 2) * (-14.07803-(-16.20373)));
            yy = 19.53674 + (((tickAnim - 22) / 2) * (27.15286-(19.53674)));
            zz = -31.74211 + (((tickAnim - 22) / 2) * (-26.68216-(-31.74211)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = -14.07803 + (((tickAnim - 24) / 10) * (-1.51014-(-14.07803)));
            yy = 27.15286 + (((tickAnim - 24) / 10) * (0.71793-(27.15286)));
            zz = -26.68216 + (((tickAnim - 24) / 10) * (3.89474-(-26.68216)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -1.51014 + (((tickAnim - 34) / 6) * (0-(-1.51014)));
            yy = 0.71793 + (((tickAnim - 34) / 6) * (0-(0.71793)));
            zz = 3.89474 + (((tickAnim - 34) / 6) * (0-(3.89474)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 8) / 32) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 32) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 32) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 11) * (50-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 50 + (((tickAnim - 11) / 6) * (47.5-(50)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 47.5 + (((tickAnim - 17) / 1) * (-2.5-(47.5)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 18) / 22) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0.94102-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (8.42106-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-20.94102-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 0.94102 + (((tickAnim - 11) / 8) * (25.82789-(0.94102)));
            yy = 8.42106 + (((tickAnim - 11) / 8) * (10.22951-(8.42106)));
            zz = -20.94102 + (((tickAnim - 11) / 8) * (-20.14859-(-20.94102)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 25.82789 + (((tickAnim - 19) / 5) * (24.00172-(25.82789)));
            yy = 10.22951 + (((tickAnim - 19) / 5) * (-30.80072-(10.22951)));
            zz = -20.14859 + (((tickAnim - 19) / 5) * (-22.55421-(-20.14859)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 24.00172 + (((tickAnim - 24) / 16) * (0-(24.00172)));
            yy = -30.80072 + (((tickAnim - 24) / 16) * (0-(-30.80072)));
            zz = -22.55421 + (((tickAnim - 24) / 16) * (0-(-22.55421)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -15 + (((tickAnim - 10) / 7) * (-16.45-(-15)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -16.45 + (((tickAnim - 17) / 4) * (19.2-(-16.45)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 19.2 + (((tickAnim - 21) / 5) * (15.76-(19.2)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 15.76 + (((tickAnim - 26) / 5) * (1.52-(15.76)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 1.52 + (((tickAnim - 31) / 9) * (0-(1.52)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 21) / 5) * (0.17-(0.2)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0.17 + (((tickAnim - 26) / 2) * (0-(0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 18) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 18) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 2) * (0.2-(1)));
            zz = 1 + (((tickAnim - 18) / 2) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 20) / 20) * (1-(1)));
            yy = 0.2 + (((tickAnim - 20) / 20) * (1-(0.2)));
            zz = 1 + (((tickAnim - 20) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 18) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 18) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 2) * (0.2-(1)));
            zz = 1 + (((tickAnim - 18) / 2) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 20) / 20) * (1-(1)));
            yy = 0.2 + (((tickAnim - 20) / 20) * (1-(0.2)));
            zz = 1 + (((tickAnim - 20) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinemys entity = (EntityPrehistoricFloraSinemys) entitylivingbaseIn;
        int animCycle = 312;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (2.5-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-1.5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 2.5 + (((tickAnim - 9) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = -1.5 + (((tickAnim - 9) / 2) * (-2.5-(-1.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 11) / 2) * (0.35714-(-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 13) / 2) * (2-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0.35714 + (((tickAnim - 13) / 2) * (1.5-(0.35714)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 2 + (((tickAnim - 15) / 8) * (0-(2)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 1.5 + (((tickAnim - 15) / 8) * (0-(1.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 23) / 262) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 262) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 262) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 289) {
            xx = 0 + (((tickAnim - 285) / 4) * (-1.56101-(0)));
            yy = 0 + (((tickAnim - 285) / 4) * (0.06815-(0)));
            zz = 0 + (((tickAnim - 285) / 4) * (2.49907-(0)));
        }
        else if (tickAnim >= 289 && tickAnim < 292) {
            xx = -1.56101 + (((tickAnim - 289) / 3) * (-2.5-(-1.56101)));
            yy = 0.06815 + (((tickAnim - 289) / 3) * (0-(0.06815)));
            zz = 2.49907 + (((tickAnim - 289) / 3) * (0-(2.49907)));
        }
        else if (tickAnim >= 292 && tickAnim < 296) {
            xx = -2.5 + (((tickAnim - 292) / 4) * (1.07041-(-2.5)));
            yy = 0 + (((tickAnim - 292) / 4) * (0.04673-(0)));
            zz = 0 + (((tickAnim - 292) / 4) * (-2.49956-(0)));
        }
        else if (tickAnim >= 296 && tickAnim < 298) {
            xx = 1.07041 + (((tickAnim - 296) / 2) * (2.5-(1.07041)));
            yy = 0.04673 + (((tickAnim - 296) / 2) * (0-(0.04673)));
            zz = -2.49956 + (((tickAnim - 296) / 2) * (0-(-2.49956)));
        }
        else if (tickAnim >= 298 && tickAnim < 305) {
            xx = 2.5 + (((tickAnim - 298) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 298) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 298) / 7) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.6 + (((tickAnim - 8) / 1) * (-0.23-(-0.6)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.23 + (((tickAnim - 9) / 4) * (-0.7-(-0.23)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.7 + (((tickAnim - 13) / 2) * (-0.37-(-0.7)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.37 + (((tickAnim - 15) / 8) * (-0.6-(-0.37)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 23) / 262) * (0-(0)));
            yy = -0.6 + (((tickAnim - 23) / 262) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 23) / 262) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 285) / 15) * (0-(0)));
            yy = -0.6 + (((tickAnim - 285) / 15) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 285) / 15) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 300) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 300) / 5) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 300) / 5) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            yy = -0.6 + (((tickAnim - 305) / 8) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 305) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -25 + (((tickAnim - 8) / 3) * (13.40117-(-25)));
            yy = 0 + (((tickAnim - 8) / 3) * (66.37374-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (12.25509-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 13.40117 + (((tickAnim - 11) / 2) * (89.17341-(13.40117)));
            yy = 66.37374 + (((tickAnim - 11) / 2) * (73.46105-(66.37374)));
            zz = 12.25509 + (((tickAnim - 11) / 2) * (85.55794-(12.25509)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 89.17341 + (((tickAnim - 13) / 2) * (79.86536-(89.17341)));
            yy = 73.46105 + (((tickAnim - 13) / 2) * (83.97071-(73.46105)));
            zz = 85.55794 + (((tickAnim - 13) / 2) * (69.33655-(85.55794)));
        }
        else if (tickAnim >= 15 && tickAnim < 285) {
            xx = 79.86536 + (((tickAnim - 15) / 270) * (79.86536-(79.86536)));
            yy = 83.97071 + (((tickAnim - 15) / 270) * (83.97071-(83.97071)));
            zz = 69.33655 + (((tickAnim - 15) / 270) * (69.33655-(69.33655)));
        }
        else if (tickAnim >= 285 && tickAnim < 293) {
            xx = 79.86536 + (((tickAnim - 285) / 8) * (32.72951-(79.86536)));
            yy = 83.97071 + (((tickAnim - 285) / 8) * (62.39102-(83.97071)));
            zz = 69.33655 + (((tickAnim - 285) / 8) * (33.63163-(69.33655)));
        }
        else if (tickAnim >= 293 && tickAnim < 296) {
            xx = 32.72951 + (((tickAnim - 293) / 3) * (-1.70029-(32.72951)));
            yy = 62.39102 + (((tickAnim - 293) / 3) * (35.25148-(62.39102)));
            zz = 33.63163 + (((tickAnim - 293) / 3) * (3.43462-(33.63163)));
        }
        else if (tickAnim >= 296 && tickAnim < 300) {
            xx = -1.70029 + (((tickAnim - 296) / 4) * (-25-(-1.70029)));
            yy = 35.25148 + (((tickAnim - 296) / 4) * (0-(35.25148)));
            zz = 3.43462 + (((tickAnim - 296) / 4) * (0-(3.43462)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -25 + (((tickAnim - 300) / 13) * (0-(-25)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -1 + (((tickAnim - 8) / 7) * (-0.3-(-1)));
        }
        else if (tickAnim >= 15 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 15) / 270) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 270) * (0-(0)));
            zz = -0.3 + (((tickAnim - 15) / 270) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 285 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 285) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 15) * (0-(0)));
            zz = -0.3 + (((tickAnim - 285) / 15) * (-1-(-0.3)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = -1 + (((tickAnim - 300) / 13) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (4.43532-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (26.66924-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.53099-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 4.43532 + (((tickAnim - 10) / 4) * (7.5-(4.43532)));
            yy = 26.66924 + (((tickAnim - 10) / 4) * (35-(26.66924)));
            zz = 0.53099 + (((tickAnim - 10) / 4) * (0-(0.53099)));
        }
        else if (tickAnim >= 14 && tickAnim < 285) {
            xx = 7.5 + (((tickAnim - 14) / 271) * (7.5-(7.5)));
            yy = 35 + (((tickAnim - 14) / 271) * (35-(35)));
            zz = 0 + (((tickAnim - 14) / 271) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 299) {
            xx = 7.5 + (((tickAnim - 285) / 14) * (1.44464-(7.5)));
            yy = 35 + (((tickAnim - 285) / 14) * (-10.82792-(35)));
            zz = 0 + (((tickAnim - 285) / 14) * (-0.43733-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 305) {
            xx = 1.44464 + (((tickAnim - 299) / 6) * (0-(1.44464)));
            yy = -10.82792 + (((tickAnim - 299) / 6) * (0-(-10.82792)));
            zz = -0.43733 + (((tickAnim - 299) / 6) * (0-(-0.43733)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0.4-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0.525-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 285) {
            xx = 0.4 + (((tickAnim - 14) / 271) * (0.4-(0.4)));
            yy = 0 + (((tickAnim - 14) / 271) * (0-(0)));
            zz = 0.525 + (((tickAnim - 14) / 271) * (0.525-(0.525)));
        }
        else if (tickAnim >= 285 && tickAnim < 313) {
            xx = 0.4 + (((tickAnim - 285) / 28) * (0-(0.4)));
            yy = 0 + (((tickAnim - 285) / 28) * (0-(0)));
            zz = 0.525 + (((tickAnim - 285) / 28) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 8) / 2) * (-8.33155-(-17.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (30.35307-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-7.42986-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -8.33155 + (((tickAnim - 10) / 4) * (-3.54835-(-8.33155)));
            yy = 30.35307 + (((tickAnim - 10) / 4) * (19.03771-(30.35307)));
            zz = -7.42986 + (((tickAnim - 10) / 4) * (-6.24605-(-7.42986)));
        }
        else if (tickAnim >= 14 && tickAnim < 285) {
            xx = -3.54835 + (((tickAnim - 14) / 271) * (-3.54835-(-3.54835)));
            yy = 19.03771 + (((tickAnim - 14) / 271) * (19.03771-(19.03771)));
            zz = -6.24605 + (((tickAnim - 14) / 271) * (-6.24605-(-6.24605)));
        }
        else if (tickAnim >= 285 && tickAnim < 300) {
            xx = -3.54835 + (((tickAnim - 285) / 15) * (-17.5-(-3.54835)));
            yy = 19.03771 + (((tickAnim - 285) / 15) * (0-(19.03771)));
            zz = -6.24605 + (((tickAnim - 285) / 15) * (0-(-6.24605)));
        }
        else if (tickAnim >= 300 && tickAnim < 313) {
            xx = -17.5 + (((tickAnim - 300) / 13) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 300) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.3-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            zz = 0.3 + (((tickAnim - 10) / 275) * (0.3-(0.3)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 285) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 20) * (0-(0)));
            zz = 0.3 + (((tickAnim - 285) / 20) * (0-(0.3)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-95.5114-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (34.18897-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-97.725-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -95.5114 + (((tickAnim - 8) / 0) * (-171.65745-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 8) / 0) * (25.82571-(34.18897)));
            zz = -97.725 + (((tickAnim - 8) / 0) * (-159.5063-(-97.725)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -171.65745 + (((tickAnim - 8) / 5) * (-100.5114-(-171.65745)));
            yy = 25.82571 + (((tickAnim - 8) / 5) * (34.18897-(25.82571)));
            zz = -159.5063 + (((tickAnim - 8) / 5) * (-97.725-(-159.5063)));
        }
        else if (tickAnim >= 13 && tickAnim < 285) {
            xx = -100.5114 + (((tickAnim - 13) / 272) * (-100.5114-(-100.5114)));
            yy = 34.18897 + (((tickAnim - 13) / 272) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 13) / 272) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 285 && tickAnim < 294) {
            xx = -100.5114 + (((tickAnim - 285) / 9) * (-110.5114-(-100.5114)));
            yy = 34.18897 + (((tickAnim - 285) / 9) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 285) / 9) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 294 && tickAnim < 300) {
            xx = -110.5114 + (((tickAnim - 294) / 6) * (-98.5114-(-110.5114)));
            yy = 34.18897 + (((tickAnim - 294) / 6) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 294) / 6) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 300 && tickAnim < 305) {
            xx = -98.5114 + (((tickAnim - 300) / 5) * (-95.5114-(-98.5114)));
            yy = 34.18897 + (((tickAnim - 300) / 5) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 300) / 5) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = -95.5114 + (((tickAnim - 305) / 8) * (0-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 305) / 8) * (0-(34.18897)));
            zz = -97.725 + (((tickAnim - 305) / 8) * (0-(-97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.475-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.25 + (((tickAnim - 8) / 5) * (3.25-(0.25)));
            yy = 0.25 + (((tickAnim - 8) / 5) * (0.75-(0.25)));
            zz = -1.475 + (((tickAnim - 8) / 5) * (-1-(-1.475)));
        }
        else if (tickAnim >= 13 && tickAnim < 285) {
            xx = 3.25 + (((tickAnim - 13) / 272) * (3.25-(3.25)));
            yy = 0.75 + (((tickAnim - 13) / 272) * (0.75-(0.75)));
            zz = -1 + (((tickAnim - 13) / 272) * (-1-(-1)));
        }
        else if (tickAnim >= 285 && tickAnim < 300) {
            xx = 3.25 + (((tickAnim - 285) / 15) * (0.25-(3.25)));
            yy = 0.75 + (((tickAnim - 285) / 15) * (0.25-(0.75)));
            zz = -1 + (((tickAnim - 285) / 15) * (-3-(-1)));
        }
        else if (tickAnim >= 300 && tickAnim < 305) {
            xx = 0.25 + (((tickAnim - 300) / 5) * (0.25-(0.25)));
            yy = 0.25 + (((tickAnim - 300) / 5) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 300) / 5) * (-3-(-3)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = 0.25 + (((tickAnim - 305) / 8) * (0-(0.25)));
            yy = 0.25 + (((tickAnim - 305) / 8) * (0-(0.25)));
            zz = -3 + (((tickAnim - 305) / 8) * (0-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-13.42918-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-7.73134-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (15.21615-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -13.42918 + (((tickAnim - 8) / 5) * (71.92696-(-13.42918)));
            yy = -7.73134 + (((tickAnim - 8) / 5) * (31.24769-(-7.73134)));
            zz = 15.21615 + (((tickAnim - 8) / 5) * (71.08316-(15.21615)));
        }
        else if (tickAnim >= 13 && tickAnim < 285) {
            xx = 71.92696 + (((tickAnim - 13) / 272) * (71.92696-(71.92696)));
            yy = 31.24769 + (((tickAnim - 13) / 272) * (31.24769-(31.24769)));
            zz = 71.08316 + (((tickAnim - 13) / 272) * (71.08316-(71.08316)));
        }
        else if (tickAnim >= 285 && tickAnim < 300) {
            xx = 71.92696 + (((tickAnim - 285) / 15) * (0-(71.92696)));
            yy = 31.24769 + (((tickAnim - 285) / 15) * (0-(31.24769)));
            zz = 71.08316 + (((tickAnim - 285) / 15) * (0-(71.08316)));
        }
        else if (tickAnim >= 300 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 300) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 5) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-95.5114-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-34.18897-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (97.725-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -95.5114 + (((tickAnim - 8) / 3) * (-165.50394-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 8) / 3) * (-28.49203-(-34.18897)));
            zz = 97.725 + (((tickAnim - 8) / 3) * (158.22633-(97.725)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -165.50394 + (((tickAnim - 11) / 6) * (-100.5114-(-165.50394)));
            yy = -28.49203 + (((tickAnim - 11) / 6) * (-34.18897-(-28.49203)));
            zz = 158.22633 + (((tickAnim - 11) / 6) * (97.725-(158.22633)));
        }
        else if (tickAnim >= 17 && tickAnim < 285) {
            xx = -100.5114 + (((tickAnim - 17) / 268) * (-100.5114-(-100.5114)));
            yy = -34.18897 + (((tickAnim - 17) / 268) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 17) / 268) * (97.725-(97.725)));
        }
        else if (tickAnim >= 285 && tickAnim < 288) {
            xx = -100.5114 + (((tickAnim - 285) / 3) * (-95.5114-(-100.5114)));
            yy = -34.18897 + (((tickAnim - 285) / 3) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 285) / 3) * (97.725-(97.725)));
        }
        else if (tickAnim >= 288 && tickAnim < 295) {
            xx = -95.5114 + (((tickAnim - 288) / 7) * (-113.0114-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 288) / 7) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 288) / 7) * (97.725-(97.725)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = -113.0114 + (((tickAnim - 295) / 8) * (-98.0114-(-113.0114)));
            yy = -34.18897 + (((tickAnim - 295) / 8) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 295) / 8) * (97.725-(97.725)));
        }
        else if (tickAnim >= 303 && tickAnim < 305) {
            xx = -98.0114 + (((tickAnim - 303) / 2) * (-95.5114-(-98.0114)));
            yy = -34.18897 + (((tickAnim - 303) / 2) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 303) / 2) * (97.725-(97.725)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = -95.5114 + (((tickAnim - 305) / 8) * (0-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 305) / 8) * (0-(-34.18897)));
            zz = 97.725 + (((tickAnim - 305) / 8) * (0-(97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.575-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.25 + (((tickAnim - 8) / 5) * (-3.25-(-0.25)));
            yy = 0.25 + (((tickAnim - 8) / 5) * (0.75-(0.25)));
            zz = -1.575 + (((tickAnim - 8) / 5) * (-1-(-1.575)));
        }
        else if (tickAnim >= 13 && tickAnim < 285) {
            xx = -3.25 + (((tickAnim - 13) / 272) * (-3.25-(-3.25)));
            yy = 0.75 + (((tickAnim - 13) / 272) * (0.75-(0.75)));
            zz = -1 + (((tickAnim - 13) / 272) * (-1-(-1)));
        }
        else if (tickAnim >= 285 && tickAnim < 288) {
            xx = -3.25 + (((tickAnim - 285) / 3) * (-3.25-(-3.25)));
            yy = 0.75 + (((tickAnim - 285) / 3) * (0.75-(0.75)));
            zz = -1 + (((tickAnim - 285) / 3) * (-1-(-1)));
        }
        else if (tickAnim >= 288 && tickAnim < 303) {
            xx = -3.25 + (((tickAnim - 288) / 15) * (-0.25-(-3.25)));
            yy = 0.75 + (((tickAnim - 288) / 15) * (0.25-(0.75)));
            zz = -1 + (((tickAnim - 288) / 15) * (-3-(-1)));
        }
        else if (tickAnim >= 303 && tickAnim < 305) {
            xx = -0.25 + (((tickAnim - 303) / 2) * (-0.25-(-0.25)));
            yy = 0.25 + (((tickAnim - 303) / 2) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 303) / 2) * (-3-(-3)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = -0.25 + (((tickAnim - 305) / 8) * (0-(-0.25)));
            yy = 0.25 + (((tickAnim - 305) / 8) * (0-(0.25)));
            zz = -3 + (((tickAnim - 305) / 8) * (0-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-13.42918-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (7.73134-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-15.21615-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -13.42918 + (((tickAnim - 8) / 5) * (71.92696-(-13.42918)));
            yy = 7.73134 + (((tickAnim - 8) / 5) * (-31.24769-(7.73134)));
            zz = -15.21615 + (((tickAnim - 8) / 5) * (-71.08316-(-15.21615)));
        }
        else if (tickAnim >= 13 && tickAnim < 285) {
            xx = 71.92696 + (((tickAnim - 13) / 272) * (71.92696-(71.92696)));
            yy = -31.24769 + (((tickAnim - 13) / 272) * (-31.24769-(-31.24769)));
            zz = -71.08316 + (((tickAnim - 13) / 272) * (-71.08316-(-71.08316)));
        }
        else if (tickAnim >= 285 && tickAnim < 288) {
            xx = 71.92696 + (((tickAnim - 285) / 3) * (0-(71.92696)));
            yy = -31.24769 + (((tickAnim - 285) / 3) * (0-(-31.24769)));
            zz = -71.08316 + (((tickAnim - 285) / 3) * (0-(-71.08316)));
        }
        else if (tickAnim >= 288 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 288) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 15) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 303) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 303) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 2) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.49999-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (67.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.00003-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.49999 + (((tickAnim - 8) / 2) * (2.11468-(2.49999)));
            yy = 67.5 + (((tickAnim - 8) / 2) * (65.33946-(67.5)));
            zz = -0.00003 + (((tickAnim - 8) / 2) * (-10.18081-(-0.00003)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 2.11468 + (((tickAnim - 10) / 275) * (-0.38532-(2.11468)));
            yy = 65.33946 + (((tickAnim - 10) / 275) * (65.33946-(65.33946)));
            zz = -10.18081 + (((tickAnim - 10) / 275) * (-10.18081-(-10.18081)));
        }
        else if (tickAnim >= 285 && tickAnim < 287) {
            xx = -0.38532 + (((tickAnim - 285) / 2) * (-0.38532-(-0.38532)));
            yy = 65.33946 + (((tickAnim - 285) / 2) * (65.33946-(65.33946)));
            zz = -10.18081 + (((tickAnim - 285) / 2) * (-10.18081-(-10.18081)));
        }
        else if (tickAnim >= 287 && tickAnim < 292) {
            xx = -0.38532 + (((tickAnim - 287) / 5) * (9.07153-(-0.38532)));
            yy = 65.33946 + (((tickAnim - 287) / 5) * (49.30795-(65.33946)));
            zz = -10.18081 + (((tickAnim - 287) / 5) * (-1.3753-(-10.18081)));
        }
        else if (tickAnim >= 292 && tickAnim < 295) {
            xx = 9.07153 + (((tickAnim - 292) / 3) * (2.19057-(9.07153)));
            yy = 49.30795 + (((tickAnim - 292) / 3) * (61.43582-(49.30795)));
            zz = -1.3753 + (((tickAnim - 292) / 3) * (-0.45846-(-1.3753)));
        }
        else if (tickAnim >= 295 && tickAnim < 298) {
            xx = 2.19057 + (((tickAnim - 295) / 3) * (2.49999-(2.19057)));
            yy = 61.43582 + (((tickAnim - 295) / 3) * (67.5-(61.43582)));
            zz = -0.45846 + (((tickAnim - 295) / 3) * (-0.00003-(-0.45846)));
        }
        else if (tickAnim >= 298 && tickAnim < 313) {
            xx = 2.49999 + (((tickAnim - 298) / 15) * (0-(2.49999)));
            yy = 67.5 + (((tickAnim - 298) / 15) * (0-(67.5)));
            zz = -0.00003 + (((tickAnim - 298) / 15) * (0-(-0.00003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3 + (((tickAnim - 8) / 2) * (-2-(-3)));
            yy = -0.5 + (((tickAnim - 8) / 2) * (0.8-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (-4.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = -2 + (((tickAnim - 10) / 275) * (-2-(-2)));
            yy = 0.8 + (((tickAnim - 10) / 275) * (0.8-(0.8)));
            zz = -4.25 + (((tickAnim - 10) / 275) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 285 && tickAnim < 287) {
            xx = -2 + (((tickAnim - 285) / 2) * (-2-(-2)));
            yy = 0.8 + (((tickAnim - 285) / 2) * (0.8-(0.8)));
            zz = -4.25 + (((tickAnim - 285) / 2) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 287 && tickAnim < 298) {
            xx = -2 + (((tickAnim - 287) / 11) * (-3-(-2)));
            yy = 0.8 + (((tickAnim - 287) / 11) * (-0.5-(0.8)));
            zz = -4.25 + (((tickAnim - 287) / 11) * (0-(-4.25)));
        }
        else if (tickAnim >= 298 && tickAnim < 313) {
            xx = -3 + (((tickAnim - 298) / 15) * (0-(-3)));
            yy = -0.5 + (((tickAnim - 298) / 15) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 298) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (71.04414-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-102.09003-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-73.7627-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 71.04414 + (((tickAnim - 8) / 2) * (153.82922-(71.04414)));
            yy = -102.09003 + (((tickAnim - 8) / 2) * (-83.82592-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 8) / 2) * (-161.71136-(-73.7627)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 153.82922 + (((tickAnim - 10) / 275) * (153.82922-(153.82922)));
            yy = -83.82592 + (((tickAnim - 10) / 275) * (-83.82592-(-83.82592)));
            zz = -161.71136 + (((tickAnim - 10) / 275) * (-161.71136-(-161.71136)));
        }
        else if (tickAnim >= 285 && tickAnim < 287) {
            xx = 153.82922 + (((tickAnim - 285) / 2) * (153.82922-(153.82922)));
            yy = -83.82592 + (((tickAnim - 285) / 2) * (-83.82592-(-83.82592)));
            zz = -161.71136 + (((tickAnim - 285) / 2) * (-161.71136-(-161.71136)));
        }
        else if (tickAnim >= 287 && tickAnim < 293) {
            xx = 153.82922 + (((tickAnim - 287) / 6) * (58.43646-(153.82922)));
            yy = -83.82592 + (((tickAnim - 287) / 6) * (-93.66963-(-83.82592)));
            zz = -161.71136 + (((tickAnim - 287) / 6) * (-45.58914-(-161.71136)));
        }
        else if (tickAnim >= 293 && tickAnim < 298) {
            xx = 58.43646 + (((tickAnim - 293) / 5) * (71.04414-(58.43646)));
            yy = -93.66963 + (((tickAnim - 293) / 5) * (-102.09003-(-93.66963)));
            zz = -45.58914 + (((tickAnim - 293) / 5) * (-73.7627-(-45.58914)));
        }
        else if (tickAnim >= 298 && tickAnim < 313) {
            xx = 71.04414 + (((tickAnim - 298) / 15) * (0-(71.04414)));
            yy = -102.09003 + (((tickAnim - 298) / 15) * (0-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 298) / 15) * (0-(-73.7627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.49999-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-67.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.00003-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.49999 + (((tickAnim - 8) / 2) * (-0.38532-(2.49999)));
            yy = -67.5 + (((tickAnim - 8) / 2) * (-65.33946-(-67.5)));
            zz = 0.00003 + (((tickAnim - 8) / 2) * (10.18081-(0.00003)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = -0.38532 + (((tickAnim - 10) / 275) * (-0.38532-(-0.38532)));
            yy = -65.33946 + (((tickAnim - 10) / 275) * (-65.33946-(-65.33946)));
            zz = 10.18081 + (((tickAnim - 10) / 275) * (10.18081-(10.18081)));
        }
        else if (tickAnim >= 285 && tickAnim < 289) {
            xx = -0.38532 + (((tickAnim - 285) / 4) * (-0.38532-(-0.38532)));
            yy = -65.33946 + (((tickAnim - 285) / 4) * (-65.33946-(-65.33946)));
            zz = 10.18081 + (((tickAnim - 285) / 4) * (10.18081-(10.18081)));
        }
        else if (tickAnim >= 289 && tickAnim < 295) {
            xx = -0.38532 + (((tickAnim - 289) / 6) * (4.03822-(-0.38532)));
            yy = -65.33946 + (((tickAnim - 289) / 6) * (-66.77982-(-65.33946)));
            zz = 10.18081 + (((tickAnim - 289) / 6) * (3.39362-(10.18081)));
        }
        else if (tickAnim >= 295 && tickAnim < 299) {
            xx = 4.03822 + (((tickAnim - 295) / 4) * (2.49999-(4.03822)));
            yy = -66.77982 + (((tickAnim - 295) / 4) * (-67.5-(-66.77982)));
            zz = 3.39362 + (((tickAnim - 295) / 4) * (0.00003-(3.39362)));
        }
        else if (tickAnim >= 299 && tickAnim < 313) {
            xx = 2.49999 + (((tickAnim - 299) / 14) * (0-(2.49999)));
            yy = -67.5 + (((tickAnim - 299) / 14) * (0-(-67.5)));
            zz = 0.00003 + (((tickAnim - 299) / 14) * (0-(0.00003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3 + (((tickAnim - 8) / 2) * (2-(3)));
            yy = -0.5 + (((tickAnim - 8) / 2) * (0.8-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (-4.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 2 + (((tickAnim - 10) / 275) * (2-(2)));
            yy = 0.8 + (((tickAnim - 10) / 275) * (0.8-(0.8)));
            zz = -4.25 + (((tickAnim - 10) / 275) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 285 && tickAnim < 289) {
            xx = 2 + (((tickAnim - 285) / 4) * (2-(2)));
            yy = 0.8 + (((tickAnim - 285) / 4) * (0.8-(0.8)));
            zz = -4.25 + (((tickAnim - 285) / 4) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 289 && tickAnim < 299) {
            xx = 2 + (((tickAnim - 289) / 10) * (3-(2)));
            yy = 0.8 + (((tickAnim - 289) / 10) * (-0.5-(0.8)));
            zz = -4.25 + (((tickAnim - 289) / 10) * (0-(-4.25)));
        }
        else if (tickAnim >= 299 && tickAnim < 313) {
            xx = 3 + (((tickAnim - 299) / 14) * (0-(3)));
            yy = -0.5 + (((tickAnim - 299) / 14) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 299) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (71.04414-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (102.09003-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (73.7627-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 71.04414 + (((tickAnim - 8) / 2) * (153.82922-(71.04414)));
            yy = 102.09003 + (((tickAnim - 8) / 2) * (83.82592-(102.09003)));
            zz = 73.7627 + (((tickAnim - 8) / 2) * (161.71136-(73.7627)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 153.82922 + (((tickAnim - 10) / 275) * (153.82922-(153.82922)));
            yy = 83.82592 + (((tickAnim - 10) / 275) * (83.82592-(83.82592)));
            zz = 161.71136 + (((tickAnim - 10) / 275) * (161.71136-(161.71136)));
        }
        else if (tickAnim >= 285 && tickAnim < 289) {
            xx = 153.82922 + (((tickAnim - 285) / 4) * (153.82922-(153.82922)));
            yy = 83.82592 + (((tickAnim - 285) / 4) * (83.82592-(83.82592)));
            zz = 161.71136 + (((tickAnim - 285) / 4) * (161.71136-(161.71136)));
        }
        else if (tickAnim >= 289 && tickAnim < 297) {
            xx = 153.82922 + (((tickAnim - 289) / 8) * (48.24635-(153.82922)));
            yy = 83.82592 + (((tickAnim - 289) / 8) * (93.9255-(83.82592)));
            zz = 161.71136 + (((tickAnim - 289) / 8) * (35.14379-(161.71136)));
        }
        else if (tickAnim >= 297 && tickAnim < 299) {
            xx = 48.24635 + (((tickAnim - 297) / 2) * (71.04414-(48.24635)));
            yy = 93.9255 + (((tickAnim - 297) / 2) * (102.09003-(93.9255)));
            zz = 35.14379 + (((tickAnim - 297) / 2) * (73.7627-(35.14379)));
        }
        else if (tickAnim >= 299 && tickAnim < 313) {
            xx = 71.04414 + (((tickAnim - 299) / 14) * (0-(71.04414)));
            yy = 102.09003 + (((tickAnim - 299) / 14) * (0-(102.09003)));
            zz = 73.7627 + (((tickAnim - 299) / 14) * (0-(73.7627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (7.5-(0)));
            yy = 10 + (((tickAnim - 8) / 5) * (85-(10)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 285) {
            xx = 7.5 + (((tickAnim - 13) / 272) * (7.5-(7.5)));
            yy = 85 + (((tickAnim - 13) / 272) * (85-(85)));
            zz = 0 + (((tickAnim - 13) / 272) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 288) {
            xx = 7.5 + (((tickAnim - 285) / 3) * (7.5-(7.5)));
            yy = 85 + (((tickAnim - 285) / 3) * (85-(85)));
            zz = 0 + (((tickAnim - 285) / 3) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 299) {
            xx = 7.5 + (((tickAnim - 288) / 11) * (2.71104-(7.5)));
            yy = 85 + (((tickAnim - 288) / 11) * (14.47496-(85)));
            zz = 0 + (((tickAnim - 288) / 11) * (2.95495-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 303) {
            xx = 2.71104 + (((tickAnim - 299) / 4) * (0-(2.71104)));
            yy = 14.47496 + (((tickAnim - 299) / 4) * (5-(14.47496)));
            zz = 2.95495 + (((tickAnim - 299) / 4) * (0-(2.95495)));
        }
        else if (tickAnim >= 303 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 303) / 2) * (0-(0)));
            yy = 5 + (((tickAnim - 303) / 2) * (10-(5)));
            zz = 0 + (((tickAnim - 303) / 2) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            yy = 10 + (((tickAnim - 305) / 8) * (0-(10)));
            zz = 0 + (((tickAnim - 305) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 10 + (((tickAnim - 8) / 3) * (-17.78-(10)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -17.78 + (((tickAnim - 11) / 4) * (37.5-(-17.78)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 15) / 270) * (0-(0)));
            yy = 37.5 + (((tickAnim - 15) / 270) * (37.5-(37.5)));
            zz = 0 + (((tickAnim - 15) / 270) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 285) / 3) * (0-(0)));
            yy = 37.5 + (((tickAnim - 285) / 3) * (37.5-(37.5)));
            zz = 0 + (((tickAnim - 285) / 3) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 291) {
            xx = 0 + (((tickAnim - 288) / 3) * (0-(0)));
            yy = 37.5 + (((tickAnim - 288) / 3) * (66.39-(37.5)));
            zz = 0 + (((tickAnim - 288) / 3) * (0-(0)));
        }
        else if (tickAnim >= 291 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 291) / 12) * (0-(0)));
            yy = 66.39 + (((tickAnim - 291) / 12) * (20-(66.39)));
            zz = 0 + (((tickAnim - 291) / 12) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 303) / 2) * (0-(0)));
            yy = 20 + (((tickAnim - 303) / 2) * (10-(20)));
            zz = 0 + (((tickAnim - 303) / 2) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 305) / 8) * (0-(0)));
            yy = 10 + (((tickAnim - 305) / 8) * (0-(10)));
            zz = 0 + (((tickAnim - 305) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinemys entity = (EntityPrehistoricFloraSinemys) entitylivingbaseIn;
        int animCycle = 480;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 27) {
            xx = -17.5 + (((tickAnim - 8) / 19) * (-17.576-(-17.5)));
            yy = 0 + (((tickAnim - 8) / 19) * (3.10457-(0)));
            zz = 0 + (((tickAnim - 8) / 19) * (-0.98697-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 44) {
            xx = -17.576 + (((tickAnim - 27) / 17) * (-17.5-(-17.576)));
            yy = 3.10457 + (((tickAnim - 27) / 17) * (0-(3.10457)));
            zz = -0.98697 + (((tickAnim - 27) / 17) * (0-(-0.98697)));
        }
        else if (tickAnim >= 44 && tickAnim < 116) {
            xx = -17.5 + (((tickAnim - 44) / 72) * (-2.5-(-17.5)));
            yy = 0 + (((tickAnim - 44) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 72) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 413) {
            xx = -2.5 + (((tickAnim - 116) / 297) * (-1.49-(-2.5)));
            yy = 0 + (((tickAnim - 116) / 297) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 297) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 434) {
            xx = -1.49 + (((tickAnim - 413) / 21) * (-16.63-(-1.49)));
            yy = 0 + (((tickAnim - 413) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 21) * (0-(0)));
        }
        else if (tickAnim >= 434 && tickAnim < 448) {
            xx = -16.63 + (((tickAnim - 434) / 14) * (-19.86278-(-16.63)));
            yy = 0 + (((tickAnim - 434) / 14) * (4.70392-(0)));
            zz = 0 + (((tickAnim - 434) / 14) * (-1.69694-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 456) {
            xx = -19.86278 + (((tickAnim - 448) / 8) * (-21.77-(-19.86278)));
            yy = 4.70392 + (((tickAnim - 448) / 8) * (0-(4.70392)));
            zz = -1.69694 + (((tickAnim - 448) / 8) * (0-(-1.69694)));
        }
        else if (tickAnim >= 456 && tickAnim < 463) {
            xx = -21.77 + (((tickAnim - 456) / 7) * (-20.168-(-21.77)));
            yy = 0 + (((tickAnim - 456) / 7) * (-2.34689-(0)));
            zz = 0 + (((tickAnim - 456) / 7) * (0.86169-(0)));
        }
        else if (tickAnim >= 463 && tickAnim < 470) {
            xx = -20.168 + (((tickAnim - 463) / 7) * (-17.5-(-20.168)));
            yy = -2.34689 + (((tickAnim - 463) / 7) * (0-(-2.34689)));
            zz = 0.86169 + (((tickAnim - 463) / 7) * (0-(0.86169)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = -17.5 + (((tickAnim - 470) / 10) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = -5 + (((tickAnim - 8) / 56) * (-5-(-5)));
            yy = 10 + (((tickAnim - 8) / 56) * (10-(10)));
            zz = 0 + (((tickAnim - 8) / 56) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 88) {
            xx = -5 + (((tickAnim - 64) / 24) * (-7.5-(-5)));
            yy = 10 + (((tickAnim - 64) / 24) * (3.56-(10)));
            zz = 0 + (((tickAnim - 64) / 24) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 111) {
            xx = -7.5 + (((tickAnim - 88) / 23) * (-8-(-7.5)));
            yy = 3.56 + (((tickAnim - 88) / 23) * (7.5-(3.56)));
            zz = 0 + (((tickAnim - 88) / 23) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 398) {
            xx = -8 + (((tickAnim - 111) / 287) * (-8-(-8)));
            yy = 7.5 + (((tickAnim - 111) / 287) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 111) / 287) * (0-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 408) {
            xx = -8 + (((tickAnim - 398) / 10) * (-3.98952-(-8)));
            yy = 7.5 + (((tickAnim - 398) / 10) * (15.2018-(7.5)));
            zz = 0 + (((tickAnim - 398) / 10) * (9.72631-(0)));
        }
        else if (tickAnim >= 408 && tickAnim < 415) {
            xx = -3.98952 + (((tickAnim - 408) / 7) * (-6-(-3.98952)));
            yy = 15.2018 + (((tickAnim - 408) / 7) * (10-(15.2018)));
            zz = 9.72631 + (((tickAnim - 408) / 7) * (0-(9.72631)));
        }
        else if (tickAnim >= 415 && tickAnim < 431) {
            xx = -6 + (((tickAnim - 415) / 16) * (-5-(-6)));
            yy = 10 + (((tickAnim - 415) / 16) * (10-(10)));
            zz = 0 + (((tickAnim - 415) / 16) * (0-(0)));
        }
        else if (tickAnim >= 431 && tickAnim < 470) {
            xx = -5 + (((tickAnim - 431) / 39) * (-5-(-5)));
            yy = 10 + (((tickAnim - 431) / 39) * (10-(10)));
            zz = 0 + (((tickAnim - 431) / 39) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = -5 + (((tickAnim - 470) / 10) * (0-(-5)));
            yy = 10 + (((tickAnim - 470) / 10) * (0-(10)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 8) / 56) * (0-(0)));
            yy = 10 + (((tickAnim - 8) / 56) * (10-(10)));
            zz = 0 + (((tickAnim - 8) / 56) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 64) / 24) * (0-(0)));
            yy = 10 + (((tickAnim - 64) / 24) * (5.98-(10)));
            zz = 0 + (((tickAnim - 64) / 24) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 88) / 23) * (0-(0)));
            yy = 5.98 + (((tickAnim - 88) / 23) * (-10-(5.98)));
            zz = 0 + (((tickAnim - 88) / 23) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 398) {
            xx = 0 + (((tickAnim - 111) / 287) * (0-(0)));
            yy = -10 + (((tickAnim - 111) / 287) * (-10-(-10)));
            zz = 0 + (((tickAnim - 111) / 287) * (0-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 408) {
            xx = 0 + (((tickAnim - 398) / 10) * (0-(0)));
            yy = -10 + (((tickAnim - 398) / 10) * (-1.39-(-10)));
            zz = 0 + (((tickAnim - 398) / 10) * (0-(0)));
        }
        else if (tickAnim >= 408 && tickAnim < 415) {
            xx = 0 + (((tickAnim - 408) / 7) * (0-(0)));
            yy = -1.39 + (((tickAnim - 408) / 7) * (7.5-(-1.39)));
            zz = 0 + (((tickAnim - 408) / 7) * (0-(0)));
        }
        else if (tickAnim >= 415 && tickAnim < 431) {
            xx = 0 + (((tickAnim - 415) / 16) * (0-(0)));
            yy = 7.5 + (((tickAnim - 415) / 16) * (10-(7.5)));
            zz = 0 + (((tickAnim - 415) / 16) * (0-(0)));
        }
        else if (tickAnim >= 431 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 431) / 39) * (0-(0)));
            yy = 10 + (((tickAnim - 431) / 39) * (10-(10)));
            zz = 0 + (((tickAnim - 431) / 39) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            yy = 10 + (((tickAnim - 470) / 10) * (0-(10)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 8) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 56) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 64) / 2) * (0.82997-(0)));
            yy = 0 + (((tickAnim - 64) / 2) * (-0.01068-(0)));
            zz = 0 + (((tickAnim - 64) / 2) * (-0.42344-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 78) {
            xx = 0.82997 + (((tickAnim - 66) / 12) * (1.79759-(0.82997)));
            yy = -0.01068 + (((tickAnim - 66) / 12) * (-0.05451-(-0.01068)));
            zz = -0.42344 + (((tickAnim - 66) / 12) * (1.24899-(-0.42344)));
        }
        else if (tickAnim >= 78 && tickAnim < 102) {
            xx = 1.79759 + (((tickAnim - 78) / 24) * (2.5-(1.79759)));
            yy = -0.05451 + (((tickAnim - 78) / 24) * (0-(-0.05451)));
            zz = 1.24899 + (((tickAnim - 78) / 24) * (0-(1.24899)));
        }
        else if (tickAnim >= 102 && tickAnim < 398) {
            xx = 2.5 + (((tickAnim - 102) / 296) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 102) / 296) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 296) * (0-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 418) {
            xx = 2.5 + (((tickAnim - 398) / 20) * (1.71554-(2.5)));
            yy = 0 + (((tickAnim - 398) / 20) * (-0.07489-(0)));
            zz = 0 + (((tickAnim - 398) / 20) * (2.49888-(0)));
        }
        else if (tickAnim >= 418 && tickAnim < 431) {
            xx = 1.71554 + (((tickAnim - 418) / 13) * (0-(1.71554)));
            yy = -0.07489 + (((tickAnim - 418) / 13) * (0-(-0.07489)));
            zz = 2.49888 + (((tickAnim - 418) / 13) * (0-(2.49888)));
        }
        else if (tickAnim >= 431 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 431) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 431) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 431) / 39) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -25 + (((tickAnim - 8) / 7) * (-24.04468-(-25)));
            yy = 0 + (((tickAnim - 8) / 7) * (2.41627-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-1.12934-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -24.04468 + (((tickAnim - 15) / 6) * (-25.08377-(-24.04468)));
            yy = 2.41627 + (((tickAnim - 15) / 6) * (4.53051-(2.41627)));
            zz = -1.12934 + (((tickAnim - 15) / 6) * (-2.11751-(-1.12934)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = -25.08377 + (((tickAnim - 21) / 11) * (-25.1108-(-25.08377)));
            yy = 4.53051 + (((tickAnim - 21) / 11) * (4.69146-(4.53051)));
            zz = -2.11751 + (((tickAnim - 21) / 11) * (-2.19598-(-2.11751)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -25.1108 + (((tickAnim - 32) / 6) * (-24.05909-(-25.1108)));
            yy = 4.69146 + (((tickAnim - 32) / 6) * (2.50214-(4.69146)));
            zz = -2.19598 + (((tickAnim - 32) / 6) * (-1.1712-(-2.19598)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -24.05909 + (((tickAnim - 38) / 6) * (-25-(-24.05909)));
            yy = 2.50214 + (((tickAnim - 38) / 6) * (0-(2.50214)));
            zz = -1.1712 + (((tickAnim - 38) / 6) * (0-(-1.1712)));
        }
        else if (tickAnim >= 44 && tickAnim < 58) {
            xx = -25 + (((tickAnim - 44) / 14) * (-25.67-(-25)));
            yy = 0 + (((tickAnim - 44) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 14) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -25.67 + (((tickAnim - 58) / 2) * (-24.41-(-25.67)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 116) {
            xx = -24.41 + (((tickAnim - 60) / 56) * (-6.48-(-24.41)));
            yy = 0 + (((tickAnim - 60) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 56) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 197) {
            xx = -6.48 + (((tickAnim - 116) / 81) * (-5-(-6.48)));
            yy = 0 + (((tickAnim - 116) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 81) * (0-(0)));
        }
        else if (tickAnim >= 197 && tickAnim < 413) {
            xx = -5 + (((tickAnim - 197) / 216) * (-7.86548-(-5)));
            yy = 0 + (((tickAnim - 197) / 216) * (7.43023-(0)));
            zz = 0 + (((tickAnim - 197) / 216) * (-1.02348-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 434) {
            xx = -7.86548 + (((tickAnim - 413) / 21) * (-20.58-(-7.86548)));
            yy = 7.43023 + (((tickAnim - 413) / 21) * (0-(7.43023)));
            zz = -1.02348 + (((tickAnim - 413) / 21) * (0-(-1.02348)));
        }
        else if (tickAnim >= 434 && tickAnim < 456) {
            xx = -20.58 + (((tickAnim - 434) / 22) * (-16.21035-(-20.58)));
            yy = 0 + (((tickAnim - 434) / 22) * (-9.88695-(0)));
            zz = 0 + (((tickAnim - 434) / 22) * (1.50689-(0)));
        }
        else if (tickAnim >= 456 && tickAnim < 470) {
            xx = -16.21035 + (((tickAnim - 456) / 14) * (-25-(-16.21035)));
            yy = -9.88695 + (((tickAnim - 456) / 14) * (0-(-9.88695)));
            zz = 1.50689 + (((tickAnim - 456) / 14) * (0-(1.50689)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = -25 + (((tickAnim - 470) / 10) * (0-(-25)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 8) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 36) * (0-(0)));
            zz = -1 + (((tickAnim - 8) / 36) * (-1-(-1)));
        }
        else if (tickAnim >= 44 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 44) / 426) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 426) * (0-(0)));
            zz = -1 + (((tickAnim - 44) / 426) * (-1-(-1)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = -1 + (((tickAnim - 470) / 10) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 58) {
            xx = 1 + (((tickAnim - 8) / 50) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 8) / 50) * (1-(1)));
        }
        else if (tickAnim >= 58 && tickAnim < 116) {
            xx = 1 + (((tickAnim - 58) / 58) * (1-(1)));
            yy = 1 + (((tickAnim - 58) / 58) * (0.2-(1)));
            zz = 1 + (((tickAnim - 58) / 58) * (1-(1)));
        }
        else if (tickAnim >= 116 && tickAnim < 396) {
            xx = 1 + (((tickAnim - 116) / 280) * (1-(1)));
            yy = 0.2 + (((tickAnim - 116) / 280) * (0.2-(0.2)));
            zz = 1 + (((tickAnim - 116) / 280) * (1-(1)));
        }
        else if (tickAnim >= 396 && tickAnim < 470) {
            xx = 1 + (((tickAnim - 396) / 74) * (1-(1)));
            yy = 0.2 + (((tickAnim - 396) / 74) * (1-(0.2)));
            zz = 1 + (((tickAnim - 396) / 74) * (1-(1)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 1 + (((tickAnim - 470) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 470) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 470) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 58) {
            xx = 1 + (((tickAnim - 8) / 50) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 8) / 50) * (1-(1)));
        }
        else if (tickAnim >= 58 && tickAnim < 116) {
            xx = 1 + (((tickAnim - 58) / 58) * (1-(1)));
            yy = 1 + (((tickAnim - 58) / 58) * (0.2-(1)));
            zz = 1 + (((tickAnim - 58) / 58) * (1-(1)));
        }
        else if (tickAnim >= 116 && tickAnim < 396) {
            xx = 1 + (((tickAnim - 116) / 280) * (1-(1)));
            yy = 0.2 + (((tickAnim - 116) / 280) * (0.2-(0.2)));
            zz = 1 + (((tickAnim - 116) / 280) * (1-(1)));
        }
        else if (tickAnim >= 396 && tickAnim < 470) {
            xx = 1 + (((tickAnim - 396) / 74) * (1-(1)));
            yy = 0.2 + (((tickAnim - 396) / 74) * (1-(0.2)));
            zz = 1 + (((tickAnim - 396) / 74) * (1-(1)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 1 + (((tickAnim - 470) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 470) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 470) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.18389-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (3.50189-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-13.23176-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = -9.18389 + (((tickAnim - 8) / 56) * (-9.18389-(-9.18389)));
            yy = 3.50189 + (((tickAnim - 8) / 56) * (3.50189-(3.50189)));
            zz = -13.23176 + (((tickAnim - 8) / 56) * (-13.23176-(-13.23176)));
        }
        else if (tickAnim >= 64 && tickAnim < 78) {
            xx = -9.18389 + (((tickAnim - 64) / 14) * (-98.18361-(-9.18389)));
            yy = 3.50189 + (((tickAnim - 64) / 14) * (33.3877-(3.50189)));
            zz = -13.23176 + (((tickAnim - 64) / 14) * (-98.85587-(-13.23176)));
        }
        else if (tickAnim >= 78 && tickAnim < 102) {
            xx = -98.18361 + (((tickAnim - 78) / 24) * (-100.5114-(-98.18361)));
            yy = 33.3877 + (((tickAnim - 78) / 24) * (34.18897-(33.3877)));
            zz = -98.85587 + (((tickAnim - 78) / 24) * (-97.725-(-98.85587)));
        }
        else if (tickAnim >= 102 && tickAnim < 398) {
            xx = -100.5114 + (((tickAnim - 102) / 296) * (-100.5114-(-100.5114)));
            yy = 34.18897 + (((tickAnim - 102) / 296) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 102) / 296) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 398 && tickAnim < 431) {
            xx = -100.5114 + (((tickAnim - 398) / 33) * (-95.5114-(-100.5114)));
            yy = 34.18897 + (((tickAnim - 398) / 33) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 398) / 33) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 431 && tickAnim < 470) {
            xx = -95.5114 + (((tickAnim - 431) / 39) * (-95.5114-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 431) / 39) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 431) / 39) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = -95.5114 + (((tickAnim - 470) / 10) * (0-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 470) / 10) * (0-(34.18897)));
            zz = -97.725 + (((tickAnim - 470) / 10) * (0-(-97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 8) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 56) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 398) {
            xx = 0 + (((tickAnim - 64) / 334) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 334) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 334) * (0-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 398) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 398) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 398) / 72) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (10.5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10.25 + (((tickAnim - 4) / 4) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 10.5 + (((tickAnim - 4) / 4) * (12.25-(10.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = -10.25 + (((tickAnim - 8) / 56) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 8) / 56) * (0-(0)));
            zz = 12.25 + (((tickAnim - 8) / 56) * (12.25-(12.25)));
        }
        else if (tickAnim >= 64 && tickAnim < 78) {
            xx = -10.25 + (((tickAnim - 64) / 14) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 64) / 14) * (0-(0)));
            zz = 12.25 + (((tickAnim - 64) / 14) * (12.25-(12.25)));
        }
        else if (tickAnim >= 78 && tickAnim < 102) {
            xx = -10.25 + (((tickAnim - 78) / 24) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 78) / 24) * (0-(0)));
            zz = 12.25 + (((tickAnim - 78) / 24) * (12.25-(12.25)));
        }
        else if (tickAnim >= 102 && tickAnim < 398) {
            xx = -10.25 + (((tickAnim - 102) / 296) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 102) / 296) * (0-(0)));
            zz = 12.25 + (((tickAnim - 102) / 296) * (12.25-(12.25)));
        }
        else if (tickAnim >= 398 && tickAnim < 431) {
            xx = -10.25 + (((tickAnim - 398) / 33) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 398) / 33) * (0-(0)));
            zz = 12.25 + (((tickAnim - 398) / 33) * (12.25-(12.25)));
        }
        else if (tickAnim >= 431 && tickAnim < 470) {
            xx = -10.25 + (((tickAnim - 431) / 39) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 431) / 39) * (0-(0)));
            zz = 12.25 + (((tickAnim - 431) / 39) * (12.25-(12.25)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = -10.25 + (((tickAnim - 470) / 10) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = 12.25 + (((tickAnim - 470) / 10) * (0-(12.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.18389-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-3.50189-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (13.23176-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = -9.18389 + (((tickAnim - 8) / 56) * (-9.18389-(-9.18389)));
            yy = -3.50189 + (((tickAnim - 8) / 56) * (-3.50189-(-3.50189)));
            zz = 13.23176 + (((tickAnim - 8) / 56) * (13.23176-(13.23176)));
        }
        else if (tickAnim >= 64 && tickAnim < 78) {
            xx = -9.18389 + (((tickAnim - 64) / 14) * (-98.95325-(-9.18389)));
            yy = -3.50189 + (((tickAnim - 64) / 14) * (-33.85093-(-3.50189)));
            zz = 13.23176 + (((tickAnim - 64) / 14) * (95.4611-(13.23176)));
        }
        else if (tickAnim >= 78 && tickAnim < 102) {
            xx = -98.95325 + (((tickAnim - 78) / 24) * (-100.5114-(-98.95325)));
            yy = -33.85093 + (((tickAnim - 78) / 24) * (-34.18897-(-33.85093)));
            zz = 95.4611 + (((tickAnim - 78) / 24) * (97.725-(95.4611)));
        }
        else if (tickAnim >= 102 && tickAnim < 398) {
            xx = -100.5114 + (((tickAnim - 102) / 296) * (-100.5114-(-100.5114)));
            yy = -34.18897 + (((tickAnim - 102) / 296) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 102) / 296) * (97.725-(97.725)));
        }
        else if (tickAnim >= 398 && tickAnim < 413) {
            xx = -100.5114 + (((tickAnim - 398) / 15) * (-29.4348-(-100.5114)));
            yy = -34.18897 + (((tickAnim - 398) / 15) * (-16.05572-(-34.18897)));
            zz = 97.725 + (((tickAnim - 398) / 15) * (18.69015-(97.725)));
        }
        else if (tickAnim >= 413 && tickAnim < 431) {
            xx = -29.4348 + (((tickAnim - 413) / 18) * (-11.07906-(-29.4348)));
            yy = -16.05572 + (((tickAnim - 413) / 18) * (-24.83034-(-16.05572)));
            zz = 18.69015 + (((tickAnim - 413) / 18) * (11.64431-(18.69015)));
        }
        else if (tickAnim >= 431 && tickAnim < 470) {
            xx = -11.07906 + (((tickAnim - 431) / 39) * (-95.5114-(-11.07906)));
            yy = -24.83034 + (((tickAnim - 431) / 39) * (-34.18897-(-24.83034)));
            zz = 11.64431 + (((tickAnim - 431) / 39) * (97.725-(11.64431)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = -95.5114 + (((tickAnim - 470) / 10) * (0-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 470) / 10) * (0-(-34.18897)));
            zz = 97.725 + (((tickAnim - 470) / 10) * (0-(97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 8) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 56) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 398) {
            xx = 0 + (((tickAnim - 64) / 334) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 334) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 334) * (0-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 398) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 398) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 398) / 72) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5.69119-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (4.19721-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-6.35471-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -5.69119 + (((tickAnim - 4) / 4) * (-8.5-(-5.69119)));
            yy = 4.19721 + (((tickAnim - 4) / 4) * (0-(4.19721)));
            zz = -6.35471 + (((tickAnim - 4) / 4) * (-11.5-(-6.35471)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = -8.5 + (((tickAnim - 8) / 56) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 8) / 56) * (0-(0)));
            zz = -11.5 + (((tickAnim - 8) / 56) * (-11.5-(-11.5)));
        }
        else if (tickAnim >= 64 && tickAnim < 78) {
            xx = -8.5 + (((tickAnim - 64) / 14) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 64) / 14) * (0-(0)));
            zz = -11.5 + (((tickAnim - 64) / 14) * (-11.5-(-11.5)));
        }
        else if (tickAnim >= 78 && tickAnim < 102) {
            xx = -8.5 + (((tickAnim - 78) / 24) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 78) / 24) * (0-(0)));
            zz = -11.5 + (((tickAnim - 78) / 24) * (-11.5-(-11.5)));
        }
        else if (tickAnim >= 102 && tickAnim < 398) {
            xx = -8.5 + (((tickAnim - 102) / 296) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 102) / 296) * (0-(0)));
            zz = -11.5 + (((tickAnim - 102) / 296) * (-11.5-(-11.5)));
        }
        else if (tickAnim >= 398 && tickAnim < 413) {
            xx = -8.5 + (((tickAnim - 398) / 15) * (14.19416-(-8.5)));
            yy = 0 + (((tickAnim - 398) / 15) * (-0.46303-(0)));
            zz = -11.5 + (((tickAnim - 398) / 15) * (-4.0389-(-11.5)));
        }
        else if (tickAnim >= 413 && tickAnim < 431) {
            xx = 14.19416 + (((tickAnim - 413) / 18) * (-8.5-(14.19416)));
            yy = -0.46303 + (((tickAnim - 413) / 18) * (0-(-0.46303)));
            zz = -4.0389 + (((tickAnim - 413) / 18) * (-11.5-(-4.0389)));
        }
        else if (tickAnim >= 431 && tickAnim < 470) {
            xx = -8.5 + (((tickAnim - 431) / 39) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 431) / 39) * (0-(0)));
            zz = -11.5 + (((tickAnim - 431) / 39) * (-11.5-(-11.5)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = -8.5 + (((tickAnim - 470) / 10) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            zz = -11.5 + (((tickAnim - 470) / 10) * (0-(-11.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 64 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 64) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 14) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 78) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 24) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 398) {
            xx = 0 + (((tickAnim - 102) / 296) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 296) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 296) * (0-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 431) {
            xx = 0 + (((tickAnim - 398) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 398) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 398) / 33) * (0-(0)));
        }
        else if (tickAnim >= 431 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 431) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 431) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 431) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.49999-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (67.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.00003-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = 2.49999 + (((tickAnim - 8) / 56) * (2.49999-(2.49999)));
            yy = 67.5 + (((tickAnim - 8) / 56) * (67.5-(67.5)));
            zz = -0.00003 + (((tickAnim - 8) / 56) * (-0.00003-(-0.00003)));
        }
        else if (tickAnim >= 64 && tickAnim < 90) {
            xx = 2.49999 + (((tickAnim - 64) / 26) * (12.49999-(2.49999)));
            yy = 67.5 + (((tickAnim - 64) / 26) * (37.5-(67.5)));
            zz = -0.00003 + (((tickAnim - 64) / 26) * (-0.00002-(-0.00003)));
        }
        else if (tickAnim >= 90 && tickAnim < 398) {
            xx = 12.49999 + (((tickAnim - 90) / 308) * (12.49999-(12.49999)));
            yy = 37.5 + (((tickAnim - 90) / 308) * (37.5-(37.5)));
            zz = -0.00002 + (((tickAnim - 90) / 308) * (-0.00002-(-0.00002)));
        }
        else if (tickAnim >= 398 && tickAnim < 416) {
            xx = 12.49999 + (((tickAnim - 398) / 18) * (2.49999-(12.49999)));
            yy = 37.5 + (((tickAnim - 398) / 18) * (67.5-(37.5)));
            zz = -0.00002 + (((tickAnim - 398) / 18) * (-0.00003-(-0.00002)));
        }
        else if (tickAnim >= 416 && tickAnim < 470) {
            xx = 2.49999 + (((tickAnim - 416) / 54) * (2.49999-(2.49999)));
            yy = 67.5 + (((tickAnim - 416) / 54) * (67.5-(67.5)));
            zz = -0.00003 + (((tickAnim - 416) / 54) * (-0.00003-(-0.00003)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 2.49999 + (((tickAnim - 470) / 10) * (0-(2.49999)));
            yy = 67.5 + (((tickAnim - 470) / 10) * (0-(67.5)));
            zz = -0.00003 + (((tickAnim - 470) / 10) * (0-(-0.00003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = -2 + (((tickAnim - 8) / 56) * (-2-(-2)));
            yy = -1 + (((tickAnim - 8) / 56) * (-1-(-1)));
            zz = 0 + (((tickAnim - 8) / 56) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 90) {
            xx = -2 + (((tickAnim - 64) / 26) * (0-(-2)));
            yy = -1 + (((tickAnim - 64) / 26) * (-0.5-(-1)));
            zz = 0 + (((tickAnim - 64) / 26) * (0.85-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 398) {
            xx = 0 + (((tickAnim - 90) / 308) * (0-(0)));
            yy = -0.5 + (((tickAnim - 90) / 308) * (-0.5-(-0.5)));
            zz = 0.85 + (((tickAnim - 90) / 308) * (0.85-(0.85)));
        }
        else if (tickAnim >= 398 && tickAnim < 416) {
            xx = 0 + (((tickAnim - 398) / 18) * (-2-(0)));
            yy = -0.5 + (((tickAnim - 398) / 18) * (-0.5-(-0.5)));
            zz = 0.85 + (((tickAnim - 398) / 18) * (0-(0.85)));
        }
        else if (tickAnim >= 416 && tickAnim < 470) {
            xx = -2 + (((tickAnim - 416) / 54) * (-2-(-2)));
            yy = -0.5 + (((tickAnim - 416) / 54) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 416) / 54) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = -2 + (((tickAnim - 470) / 10) * (0-(-2)));
            yy = -0.5 + (((tickAnim - 470) / 10) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (71.04414-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-102.09003-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-73.7627-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = 71.04414 + (((tickAnim - 8) / 56) * (71.04414-(71.04414)));
            yy = -102.09003 + (((tickAnim - 8) / 56) * (-102.09003-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 8) / 56) * (-73.7627-(-73.7627)));
        }
        else if (tickAnim >= 64 && tickAnim < 90) {
            xx = 71.04414 + (((tickAnim - 64) / 26) * (8.44548-(71.04414)));
            yy = -102.09003 + (((tickAnim - 64) / 26) * (-46.6261-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 64) / 26) * (-4.99847-(-73.7627)));
        }
        else if (tickAnim >= 90 && tickAnim < 398) {
            xx = 8.44548 + (((tickAnim - 90) / 308) * (8.44548-(8.44548)));
            yy = -46.6261 + (((tickAnim - 90) / 308) * (-46.6261-(-46.6261)));
            zz = -4.99847 + (((tickAnim - 90) / 308) * (-4.99847-(-4.99847)));
        }
        else if (tickAnim >= 398 && tickAnim < 416) {
            xx = 8.44548 + (((tickAnim - 398) / 18) * (71.04414-(8.44548)));
            yy = -46.6261 + (((tickAnim - 398) / 18) * (-102.09003-(-46.6261)));
            zz = -4.99847 + (((tickAnim - 398) / 18) * (-73.7627-(-4.99847)));
        }
        else if (tickAnim >= 416 && tickAnim < 470) {
            xx = 71.04414 + (((tickAnim - 416) / 54) * (71.04414-(71.04414)));
            yy = -102.09003 + (((tickAnim - 416) / 54) * (-102.09003-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 416) / 54) * (-73.7627-(-73.7627)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 71.04414 + (((tickAnim - 470) / 10) * (0-(71.04414)));
            yy = -102.09003 + (((tickAnim - 470) / 10) * (0-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 470) / 10) * (0-(-73.7627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.49999-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-67.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.00003-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = 2.49999 + (((tickAnim - 8) / 56) * (2.49999-(2.49999)));
            yy = -67.5 + (((tickAnim - 8) / 56) * (-67.5-(-67.5)));
            zz = 0.00003 + (((tickAnim - 8) / 56) * (0.00003-(0.00003)));
        }
        else if (tickAnim >= 64 && tickAnim < 79) {
            xx = 2.49999 + (((tickAnim - 64) / 15) * (2.49999-(2.49999)));
            yy = -67.5 + (((tickAnim - 64) / 15) * (-67.5-(-67.5)));
            zz = 0.00003 + (((tickAnim - 64) / 15) * (0.00003-(0.00003)));
        }
        else if (tickAnim >= 79 && tickAnim < 113) {
            xx = 2.49999 + (((tickAnim - 79) / 34) * (12.49999-(2.49999)));
            yy = -67.5 + (((tickAnim - 79) / 34) * (-37.5-(-67.5)));
            zz = 0.00003 + (((tickAnim - 79) / 34) * (0.00002-(0.00003)));
        }
        else if (tickAnim >= 113 && tickAnim < 415) {
            xx = 12.49999 + (((tickAnim - 113) / 302) * (12.49999-(12.49999)));
            yy = -37.5 + (((tickAnim - 113) / 302) * (-37.5-(-37.5)));
            zz = 0.00002 + (((tickAnim - 113) / 302) * (0.00002-(0.00002)));
        }
        else if (tickAnim >= 415 && tickAnim < 432) {
            xx = 12.49999 + (((tickAnim - 415) / 17) * (2.49999-(12.49999)));
            yy = -37.5 + (((tickAnim - 415) / 17) * (-67.5-(-37.5)));
            zz = 0.00002 + (((tickAnim - 415) / 17) * (0.00003-(0.00002)));
        }
        else if (tickAnim >= 432 && tickAnim < 470) {
            xx = 2.49999 + (((tickAnim - 432) / 38) * (2.49999-(2.49999)));
            yy = -67.5 + (((tickAnim - 432) / 38) * (-67.5-(-67.5)));
            zz = 0.00003 + (((tickAnim - 432) / 38) * (0.00003-(0.00003)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 2.49999 + (((tickAnim - 470) / 10) * (0-(2.49999)));
            yy = -67.5 + (((tickAnim - 470) / 10) * (0-(-67.5)));
            zz = 0.00003 + (((tickAnim - 470) / 10) * (0-(0.00003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = 2 + (((tickAnim - 8) / 56) * (2-(2)));
            yy = -1 + (((tickAnim - 8) / 56) * (-1-(-1)));
            zz = 0 + (((tickAnim - 8) / 56) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 79) {
            xx = 2 + (((tickAnim - 64) / 15) * (2-(2)));
            yy = -1 + (((tickAnim - 64) / 15) * (-0.5-(-1)));
            zz = 0 + (((tickAnim - 64) / 15) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 113) {
            xx = 2 + (((tickAnim - 79) / 34) * (0-(2)));
            yy = -0.5 + (((tickAnim - 79) / 34) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 79) / 34) * (0.85-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 415) {
            xx = 0 + (((tickAnim - 113) / 302) * (0-(0)));
            yy = -0.5 + (((tickAnim - 113) / 302) * (-0.5-(-0.5)));
            zz = 0.85 + (((tickAnim - 113) / 302) * (0.85-(0.85)));
        }
        else if (tickAnim >= 415 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 415) / 17) * (2-(0)));
            yy = -0.5 + (((tickAnim - 415) / 17) * (-0.5-(-0.5)));
            zz = 0.85 + (((tickAnim - 415) / 17) * (0-(0.85)));
        }
        else if (tickAnim >= 432 && tickAnim < 470) {
            xx = 2 + (((tickAnim - 432) / 38) * (2-(2)));
            yy = -0.5 + (((tickAnim - 432) / 38) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 432) / 38) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 2 + (((tickAnim - 470) / 10) * (0-(2)));
            yy = -0.5 + (((tickAnim - 470) / 10) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (71.04414-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (102.09003-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (73.7627-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 79) {
            xx = 71.04414 + (((tickAnim - 8) / 71) * (71.04414-(71.04414)));
            yy = 102.09003 + (((tickAnim - 8) / 71) * (102.09003-(102.09003)));
            zz = 73.7627 + (((tickAnim - 8) / 71) * (73.7627-(73.7627)));
        }
        else if (tickAnim >= 79 && tickAnim < 113) {
            xx = 71.04414 + (((tickAnim - 79) / 34) * (7.61562-(71.04414)));
            yy = 102.09003 + (((tickAnim - 79) / 34) * (31.87555-(102.09003)));
            zz = 73.7627 + (((tickAnim - 79) / 34) * (2.14347-(73.7627)));
        }
        else if (tickAnim >= 113 && tickAnim < 415) {
            xx = 7.61562 + (((tickAnim - 113) / 302) * (7.61562-(7.61562)));
            yy = 31.87555 + (((tickAnim - 113) / 302) * (31.87555-(31.87555)));
            zz = 2.14347 + (((tickAnim - 113) / 302) * (2.14347-(2.14347)));
        }
        else if (tickAnim >= 415 && tickAnim < 432) {
            xx = 7.61562 + (((tickAnim - 415) / 17) * (71.04414-(7.61562)));
            yy = 31.87555 + (((tickAnim - 415) / 17) * (102.09003-(31.87555)));
            zz = 2.14347 + (((tickAnim - 415) / 17) * (73.7627-(2.14347)));
        }
        else if (tickAnim >= 432 && tickAnim < 470) {
            xx = 71.04414 + (((tickAnim - 432) / 38) * (71.04414-(71.04414)));
            yy = 102.09003 + (((tickAnim - 432) / 38) * (102.09003-(102.09003)));
            zz = 73.7627 + (((tickAnim - 432) / 38) * (73.7627-(73.7627)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 71.04414 + (((tickAnim - 470) / 10) * (0-(71.04414)));
            yy = 102.09003 + (((tickAnim - 470) / 10) * (0-(102.09003)));
            zz = 73.7627 + (((tickAnim - 470) / 10) * (0-(73.7627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinemys entity = (EntityPrehistoricFloraSinemys) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60))*1), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*5), main.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*4))*4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*2))*0.8);
        this.main.rotationPointY = this.main.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*4))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(70+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*60), frontRightLeg.rotateAngleY + (float) Math.toRadians(-60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*3))*20), frontRightLeg.rotateAngleZ + (float) Math.toRadians(50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*2))*20));
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*55), frontrightleg2.rotateAngleY + (float) Math.toRadians(0), frontrightleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*30), backRightLeg.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*9))*30), backRightLeg.rotateAngleZ + (float) Math.toRadians(-90+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*4))*40));
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(0);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*1);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*5))*1);
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*5))*50), backrightleg2.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*3))*30), backrightleg2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*4))*30));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60))*1.5), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*2.5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*4))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60))*1.5), neck2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*2.5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*4))*2));
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(70-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*60), frontLeftLeg.rotateAngleY + (float) Math.toRadians(60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*3))*20), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(-50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*2))*20));
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*55), frontleftleg2.rotateAngleY + (float) Math.toRadians(0), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(60-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*30), backLeftLeg.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*9))*30), backLeftLeg.rotateAngleZ + (float) Math.toRadians(90+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*4))*40));
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(0);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*1);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*5))*1);
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(-15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*5))*50), backleftleg2.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*3))*30), backleftleg2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*4))*30));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*2))*3), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*3))*5), tail.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*4));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60))*6), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*4))*10), tail2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*2))*8));



    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinemys entity = (EntityPrehistoricFloraSinemys) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.4 + (((tickAnim - 0) / 3) * (-0.6-(1.4)));
            yy = 1.3 + (((tickAnim - 0) / 3) * (1.1-(1.3)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.63-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -0.6 + (((tickAnim - 3) / 7) * (0.3-(-0.6)));
            yy = 1.1 + (((tickAnim - 3) / 7) * (0.2-(1.1)));
            zz = 1.63 + (((tickAnim - 3) / 7) * (2.7-(1.63)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0.3 + (((tickAnim - 10) / 7) * (1.9-(0.3)));
            yy = 0.2 + (((tickAnim - 10) / 7) * (-1-(0.2)));
            zz = 2.7 + (((tickAnim - 10) / 7) * (1.53333-(2.7)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1.9 + (((tickAnim - 17) / 3) * (1.4-(1.9)));
            yy = -1 + (((tickAnim - 17) / 3) * (-1.3-(-1)));
            zz = 1.53333 + (((tickAnim - 17) / 3) * (-0.3-(1.53333)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 1.4 + (((tickAnim - 20) / 2) * (0.44981-(1.4)));
            yy = -1.3 + (((tickAnim - 20) / 2) * (-1.13146-(-1.3)));
            zz = -0.3 + (((tickAnim - 20) / 2) * (-1.46541-(-0.3)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0.44981 + (((tickAnim - 22) / 1) * (-0.6-(0.44981)));
            yy = -1.13146 + (((tickAnim - 22) / 1) * (-1-(-1.13146)));
            zz = -1.46541 + (((tickAnim - 22) / 1) * (-1.83-(-1.46541)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.6 + (((tickAnim - 23) / 7) * (0.2-(-0.6)));
            yy = -1 + (((tickAnim - 23) / 7) * (0.2-(-1)));
            zz = -1.83 + (((tickAnim - 23) / 7) * (-2.9-(-1.83)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 0.2 + (((tickAnim - 30) / 7) * (1.99731-(0.2)));
            yy = 0.2 + (((tickAnim - 30) / 7) * (1.02987-(0.2)));
            zz = -2.9 + (((tickAnim - 30) / 7) * (-1.73528-(-2.9)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 1.99731 + (((tickAnim - 37) / 3) * (1.4-(1.99731)));
            yy = 1.02987 + (((tickAnim - 37) / 3) * (1.3-(1.02987)));
            zz = -1.73528 + (((tickAnim - 37) / 3) * (0-(-1.73528)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.4 + (((tickAnim - 0) / 3) * (1.55-(1.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 1.55 + (((tickAnim - 3) / 8) * (1.35-(1.55)));
            zz = -0.3 + (((tickAnim - 3) / 8) * (-0.5-(-0.3)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 1.35 + (((tickAnim - 11) / 9) * (1.4-(1.35)));
            zz = -0.5 + (((tickAnim - 11) / 9) * (0-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.4 + (((tickAnim - 20) / 3) * (1.55-(1.4)));
            zz = 0 + (((tickAnim - 20) / 3) * (-0.3-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 1.55 + (((tickAnim - 23) / 9) * (1.35-(1.55)));
            zz = -0.3 + (((tickAnim - 23) / 9) * (-0.5-(-0.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 1.35 + (((tickAnim - 32) / 8) * (1.4-(1.35)));
            zz = -0.5 + (((tickAnim - 32) / 8) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 3) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 23) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -10.12353 + (((tickAnim - 0) / 17) * (-12.67-(-10.12353)));
            yy = -7.24305 + (((tickAnim - 0) / 17) * (7.1-(-7.24305)));
            zz = 1.95155 + (((tickAnim - 0) / 17) * (0-(1.95155)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -12.67 + (((tickAnim - 17) / 3) * (-9.116-(-12.67)));
            yy = 7.1 + (((tickAnim - 17) / 3) * (7.27599-(7.1)));
            zz = 0 + (((tickAnim - 17) / 3) * (-1.82423-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = -9.116 + (((tickAnim - 20) / 17) * (-12.83-(-9.116)));
            yy = 7.27599 + (((tickAnim - 20) / 17) * (-6.2-(7.27599)));
            zz = -1.82423 + (((tickAnim - 20) / 17) * (0-(-1.82423)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -12.83 + (((tickAnim - 37) / 3) * (-10.12353-(-12.83)));
            yy = -6.2 + (((tickAnim - 37) / 3) * (-7.24305-(-6.2)));
            zz = 0 + (((tickAnim - 37) / 3) * (1.95155-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.50038-(0)));
            yy = -2 + (((tickAnim - 0) / 3) * (-0.99905-(-2)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.04362-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 2.50038 + (((tickAnim - 3) / 7) * (0-(2.50038)));
            yy = -0.99905 + (((tickAnim - 3) / 7) * (0-(-0.99905)));
            zz = -0.04362 + (((tickAnim - 3) / 7) * (-2.5-(-0.04362)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (1-(0)));
            zz = -2.5 + (((tickAnim - 10) / 7) * (0-(-2.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 17) / 3) * (0.5-(1)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (2.49778-(0)));
            yy = 0.5 + (((tickAnim - 20) / 3) * (0.64027-(0.5)));
            zz = 0 + (((tickAnim - 20) / 3) * (2.53031-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.49778 + (((tickAnim - 23) / 7) * (0-(2.49778)));
            yy = 0.64027 + (((tickAnim - 23) / 7) * (0-(0.64027)));
            zz = 2.53031 + (((tickAnim - 23) / 7) * (3-(2.53031)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 30) / 7) * (-2.00093-(0)));
            yy = 0 + (((tickAnim - 30) / 7) * (-1.74893-(0)));
            zz = 3 + (((tickAnim - 30) / 7) * (0.06109-(3)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -2.00093 + (((tickAnim - 37) / 3) * (0-(-2.00093)));
            yy = -1.74893 + (((tickAnim - 37) / 3) * (-2-(-1.74893)));
            zz = 0.06109 + (((tickAnim - 37) / 3) * (0-(0.06109)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.61298 + (((tickAnim - 0) / 8) * (35.04123-(12.61298)));
            yy = -28.26101 + (((tickAnim - 0) / 8) * (-13.87667-(-28.26101)));
            zz = 7.87381 + (((tickAnim - 0) / 8) * (19.18344-(7.87381)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 35.04123 + (((tickAnim - 8) / 5) * (41.99339-(35.04123)));
            yy = -13.87667 + (((tickAnim - 8) / 5) * (-4.28711-(-13.87667)));
            zz = 19.18344 + (((tickAnim - 8) / 5) * (26.7232-(19.18344)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 41.99339 + (((tickAnim - 13) / 12) * (168.16277-(41.99339)));
            yy = -4.28711 + (((tickAnim - 13) / 12) * (17.41641-(-4.28711)));
            zz = 26.7232 + (((tickAnim - 13) / 12) * (149.52066-(26.7232)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 168.16277 + (((tickAnim - 25) / 11) * (23.10365-(168.16277)));
            yy = 17.41641 + (((tickAnim - 25) / 11) * (-16.32696-(17.41641)));
            zz = 149.52066 + (((tickAnim - 25) / 11) * (23.94859-(149.52066)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 23.10365 + (((tickAnim - 36) / 4) * (12.61298-(23.10365)));
            yy = -16.32696 + (((tickAnim - 36) / 4) * (-28.26101-(-16.32696)));
            zz = 23.94859 + (((tickAnim - 36) / 4) * (7.87381-(23.94859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1-(0)));
            yy = -0.49985 + (((tickAnim - 0) / 13) * (0-(-0.49985)));
            zz = -2.01222 + (((tickAnim - 0) / 13) * (0.3-(-2.01222)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 13) / 5) * (1.0356-(1)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.20887-(0)));
            zz = 0.3 + (((tickAnim - 13) / 5) * (-1.78326-(0.3)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.0356 + (((tickAnim - 18) / 2) * (0.97657-(1.0356)));
            yy = 0.20887 + (((tickAnim - 18) / 2) * (0.32238-(0.20887)));
            zz = -1.78326 + (((tickAnim - 18) / 2) * (-2.31369-(-1.78326)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.97657 + (((tickAnim - 20) / 3) * (0.92646-(0.97657)));
            yy = 0.32238 + (((tickAnim - 20) / 3) * (0.22154-(0.32238)));
            zz = -2.31369 + (((tickAnim - 20) / 3) * (-1.32569-(-2.31369)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0.92646 + (((tickAnim - 23) / 2) * (0.91726-(0.92646)));
            yy = 0.22154 + (((tickAnim - 23) / 2) * (0.4513-(0.22154)));
            zz = -1.32569 + (((tickAnim - 23) / 2) * (-0.53083-(-1.32569)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0.91726 + (((tickAnim - 25) / 8) * (0.98242-(0.91726)));
            yy = 0.4513 + (((tickAnim - 25) / 8) * (0.33014-(0.4513)));
            zz = -0.53083 + (((tickAnim - 25) / 8) * (-1.40373-(-0.53083)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0.98242 + (((tickAnim - 33) / 3) * (0.98053-(0.98242)));
            yy = 0.33014 + (((tickAnim - 33) / 3) * (0.50045-(0.33014)));
            zz = -1.40373 + (((tickAnim - 33) / 3) * (-2.01656-(-1.40373)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0.98053 + (((tickAnim - 36) / 4) * (0-(0.98053)));
            yy = 0.50045 + (((tickAnim - 36) / 4) * (-0.49985-(0.50045)));
            zz = -2.01656 + (((tickAnim - 36) / 4) * (-2.01222-(-2.01656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -31.67836 + (((tickAnim - 0) / 8) * (-44.86706-(-31.67836)));
            yy = 5.454 + (((tickAnim - 0) / 8) * (-22.41476-(5.454)));
            zz = 35.11519 + (((tickAnim - 0) / 8) * (19.24931-(35.11519)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -44.86706 + (((tickAnim - 8) / 5) * (-54.39425-(-44.86706)));
            yy = -22.41476 + (((tickAnim - 8) / 5) * (-30.0733-(-22.41476)));
            zz = 19.24931 + (((tickAnim - 8) / 5) * (30.41928-(19.24931)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -54.39425 + (((tickAnim - 13) / 5) * (-98.25959-(-54.39425)));
            yy = -30.0733 + (((tickAnim - 13) / 5) * (-34.35006-(-30.0733)));
            zz = 30.41928 + (((tickAnim - 13) / 5) * (92.77882-(30.41928)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -98.25959 + (((tickAnim - 18) / 7) * (-83.72879-(-98.25959)));
            yy = -34.35006 + (((tickAnim - 18) / 7) * (-26.10472-(-34.35006)));
            zz = 92.77882 + (((tickAnim - 18) / 7) * (104.48474-(92.77882)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -83.72879 + (((tickAnim - 25) / 6) * (46.21429-(-83.72879)));
            yy = -26.10472 + (((tickAnim - 25) / 6) * (8.27314-(-26.10472)));
            zz = 104.48474 + (((tickAnim - 25) / 6) * (14.73857-(104.48474)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 46.21429 + (((tickAnim - 31) / 3) * (-52.36607-(46.21429)));
            yy = 8.27314 + (((tickAnim - 31) / 3) * (10.88571-(8.27314)));
            zz = 14.73857 + (((tickAnim - 31) / 3) * (19.39286-(14.73857)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -52.36607 + (((tickAnim - 34) / 6) * (-31.67836-(-52.36607)));
            yy = 10.88571 + (((tickAnim - 34) / 6) * (5.454-(10.88571)));
            zz = 19.39286 + (((tickAnim - 34) / 6) * (35.11519-(19.39286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -9.86778 + (((tickAnim - 0) / 8) * (10.7906-(-9.86778)));
            yy = 57.52059 + (((tickAnim - 0) / 8) * (41.70109-(57.52059)));
            zz = -16.42912 + (((tickAnim - 0) / 8) * (-16.30482-(-16.42912)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 10.7906 + (((tickAnim - 8) / 9) * (-14.59605-(10.7906)));
            yy = 41.70109 + (((tickAnim - 8) / 9) * (20.08875-(41.70109)));
            zz = -16.30482 + (((tickAnim - 8) / 9) * (-16.28015-(-16.30482)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -14.59605 + (((tickAnim - 17) / 3) * (-14.31-(-14.59605)));
            yy = 20.08875 + (((tickAnim - 17) / 3) * (20.54-(20.08875)));
            zz = -16.28015 + (((tickAnim - 17) / 3) * (-14.06-(-16.28015)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -14.31 + (((tickAnim - 20) / 20) * (-9.86778-(-14.31)));
            yy = 20.54 + (((tickAnim - 20) / 20) * (57.52059-(20.54)));
            zz = -14.06 + (((tickAnim - 20) / 20) * (-16.42912-(-14.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 0) / 8) * (-3-(-3)));
            yy = -1 + (((tickAnim - 0) / 8) * (0-(-1)));
            zz = 2 + (((tickAnim - 0) / 8) * (-2-(2)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -3 + (((tickAnim - 8) / 9) * (0-(-3)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = -2 + (((tickAnim - 8) / 9) * (-4-(-2)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (-0.14-(0)));
            zz = -4 + (((tickAnim - 17) / 3) * (-3-(-4)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (-3-(0)));
            yy = -0.14 + (((tickAnim - 20) / 20) * (-1-(-0.14)));
            zz = -3 + (((tickAnim - 20) / 20) * (2-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 105.07922 + (((tickAnim - 0) / 7) * (38.91598-(105.07922)));
            yy = -91.44089 + (((tickAnim - 0) / 7) * (-69.18765-(-91.44089)));
            zz = -102.3828 + (((tickAnim - 0) / 7) * (-22.4269-(-102.3828)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 38.91598 + (((tickAnim - 7) / 6) * (106.82788-(38.91598)));
            yy = -69.18765 + (((tickAnim - 7) / 6) * (-80.81639-(-69.18765)));
            zz = -22.4269 + (((tickAnim - 7) / 6) * (-101.50548-(-22.4269)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 106.82788 + (((tickAnim - 13) / 4) * (59.85341-(106.82788)));
            yy = -80.81639 + (((tickAnim - 13) / 4) * (-76.61853-(-80.81639)));
            zz = -101.50548 + (((tickAnim - 13) / 4) * (-44.32339-(-101.50548)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 59.85341 + (((tickAnim - 17) / 3) * (57.86-(59.85341)));
            yy = -76.61853 + (((tickAnim - 17) / 3) * (-76.67-(-76.61853)));
            zz = -44.32339 + (((tickAnim - 17) / 3) * (-44.64-(-44.32339)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 57.86 + (((tickAnim - 20) / 20) * (105.07922-(57.86)));
            yy = -76.67 + (((tickAnim - 20) / 20) * (-91.44089-(-76.67)));
            zz = -44.64 + (((tickAnim - 20) / 20) * (-102.3828-(-44.64)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 117.7 + (((tickAnim - 0) / 5) * (168.16277-(117.7)));
            yy = -8.74 + (((tickAnim - 0) / 5) * (-17.41641-(-8.74)));
            zz = -100.4 + (((tickAnim - 0) / 5) * (-149.52066-(-100.4)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 168.16277 + (((tickAnim - 5) / 11) * (23.10365-(168.16277)));
            yy = -17.41641 + (((tickAnim - 5) / 11) * (16.32696-(-17.41641)));
            zz = -149.52066 + (((tickAnim - 5) / 11) * (-23.94859-(-149.52066)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 23.10365 + (((tickAnim - 16) / 4) * (12.61298-(23.10365)));
            yy = 16.32696 + (((tickAnim - 16) / 4) * (28.26101-(16.32696)));
            zz = -23.94859 + (((tickAnim - 16) / 4) * (-7.87381-(-23.94859)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 12.61298 + (((tickAnim - 20) / 8) * (35.04123-(12.61298)));
            yy = 28.26101 + (((tickAnim - 20) / 8) * (13.87667-(28.26101)));
            zz = -7.87381 + (((tickAnim - 20) / 8) * (-19.18344-(-7.87381)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 35.04123 + (((tickAnim - 28) / 5) * (41.99339-(35.04123)));
            yy = 13.87667 + (((tickAnim - 28) / 5) * (4.28711-(13.87667)));
            zz = -19.18344 + (((tickAnim - 28) / 5) * (-26.7232-(-19.18344)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 41.99339 + (((tickAnim - 33) / 7) * (117.7-(41.99339)));
            yy = 4.28711 + (((tickAnim - 33) / 7) * (-8.74-(4.28711)));
            zz = -26.7232 + (((tickAnim - 33) / 7) * (-100.4-(-26.7232)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.97657 + (((tickAnim - 0) / 3) * (-0.92646-(-0.97657)));
            yy = 0.32238 + (((tickAnim - 0) / 3) * (0.22154-(0.32238)));
            zz = -2.31369 + (((tickAnim - 0) / 3) * (-1.32569-(-2.31369)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.92646 + (((tickAnim - 3) / 2) * (-0.91726-(-0.92646)));
            yy = 0.22154 + (((tickAnim - 3) / 2) * (0.4513-(0.22154)));
            zz = -1.32569 + (((tickAnim - 3) / 2) * (-0.53083-(-1.32569)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -0.91726 + (((tickAnim - 5) / 8) * (-0.98242-(-0.91726)));
            yy = 0.4513 + (((tickAnim - 5) / 8) * (0.33014-(0.4513)));
            zz = -0.53083 + (((tickAnim - 5) / 8) * (-1.40373-(-0.53083)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.98242 + (((tickAnim - 13) / 3) * (-0.98053-(-0.98242)));
            yy = 0.33014 + (((tickAnim - 13) / 3) * (0.50045-(0.33014)));
            zz = -1.40373 + (((tickAnim - 13) / 3) * (-2.01656-(-1.40373)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.98053 + (((tickAnim - 16) / 4) * (0-(-0.98053)));
            yy = 0.50045 + (((tickAnim - 16) / 4) * (-0.49985-(0.50045)));
            zz = -2.01656 + (((tickAnim - 16) / 4) * (-2.01222-(-2.01656)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (-1-(0)));
            yy = -0.49985 + (((tickAnim - 20) / 13) * (0-(-0.49985)));
            zz = -2.01222 + (((tickAnim - 20) / 13) * (0.3-(-2.01222)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -1 + (((tickAnim - 33) / 5) * (-1.0356-(-1)));
            yy = 0 + (((tickAnim - 33) / 5) * (0.20887-(0)));
            zz = 0.3 + (((tickAnim - 33) / 5) * (-1.78326-(0.3)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -1.0356 + (((tickAnim - 38) / 2) * (-0.97657-(-1.0356)));
            yy = 0.20887 + (((tickAnim - 38) / 2) * (0.32238-(0.20887)));
            zz = -1.78326 + (((tickAnim - 38) / 2) * (-2.31369-(-1.78326)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -94.63 + (((tickAnim - 0) / 5) * (-83.72879-(-94.63)));
            yy = 32.29 + (((tickAnim - 0) / 5) * (26.10472-(32.29)));
            zz = -95.71 + (((tickAnim - 0) / 5) * (-104.48474-(-95.71)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -83.72879 + (((tickAnim - 5) / 6) * (46.21429-(-83.72879)));
            yy = 26.10472 + (((tickAnim - 5) / 6) * (-8.27314-(26.10472)));
            zz = -104.48474 + (((tickAnim - 5) / 6) * (-14.73857-(-104.48474)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 46.21429 + (((tickAnim - 11) / 3) * (-52.36607-(46.21429)));
            yy = -8.27314 + (((tickAnim - 11) / 3) * (-10.88571-(-8.27314)));
            zz = -14.73857 + (((tickAnim - 11) / 3) * (-19.39286-(-14.73857)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -52.36607 + (((tickAnim - 14) / 6) * (-31.67836-(-52.36607)));
            yy = -10.88571 + (((tickAnim - 14) / 6) * (-5.454-(-10.88571)));
            zz = -19.39286 + (((tickAnim - 14) / 6) * (-35.11519-(-19.39286)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -31.67836 + (((tickAnim - 20) / 8) * (-44.86706-(-31.67836)));
            yy = -5.454 + (((tickAnim - 20) / 8) * (22.41476-(-5.454)));
            zz = -35.11519 + (((tickAnim - 20) / 8) * (-19.24931-(-35.11519)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -44.86706 + (((tickAnim - 28) / 5) * (-54.39425-(-44.86706)));
            yy = 22.41476 + (((tickAnim - 28) / 5) * (30.0733-(22.41476)));
            zz = -19.24931 + (((tickAnim - 28) / 5) * (-30.41928-(-19.24931)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -54.39425 + (((tickAnim - 33) / 5) * (-98.25959-(-54.39425)));
            yy = 30.0733 + (((tickAnim - 33) / 5) * (34.35006-(30.0733)));
            zz = -30.41928 + (((tickAnim - 33) / 5) * (-92.77882-(-30.41928)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -98.25959 + (((tickAnim - 38) / 2) * (-94.63-(-98.25959)));
            yy = 34.35006 + (((tickAnim - 38) / 2) * (32.29-(34.35006)));
            zz = -92.77882 + (((tickAnim - 38) / 2) * (-95.71-(-92.77882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -14.31 + (((tickAnim - 0) / 20) * (-9.86778-(-14.31)));
            yy = -20.54 + (((tickAnim - 0) / 20) * (-57.52059-(-20.54)));
            zz = 14.06 + (((tickAnim - 0) / 20) * (16.42912-(14.06)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -9.86778 + (((tickAnim - 20) / 8) * (10.7906-(-9.86778)));
            yy = -57.52059 + (((tickAnim - 20) / 8) * (-41.70109-(-57.52059)));
            zz = 16.42912 + (((tickAnim - 20) / 8) * (16.30482-(16.42912)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 10.7906 + (((tickAnim - 28) / 9) * (-14.59605-(10.7906)));
            yy = -41.70109 + (((tickAnim - 28) / 9) * (-20.08875-(-41.70109)));
            zz = 16.30482 + (((tickAnim - 28) / 9) * (16.28015-(16.30482)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -14.59605 + (((tickAnim - 37) / 3) * (-14.31-(-14.59605)));
            yy = -20.08875 + (((tickAnim - 37) / 3) * (-20.54-(-20.08875)));
            zz = 16.28015 + (((tickAnim - 37) / 3) * (14.06-(16.28015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3-(0)));
            yy = -0.14 + (((tickAnim - 0) / 20) * (-1-(-0.14)));
            zz = -3 + (((tickAnim - 0) / 20) * (2-(-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 20) / 8) * (3-(3)));
            yy = -1 + (((tickAnim - 20) / 8) * (0-(-1)));
            zz = 2 + (((tickAnim - 20) / 8) * (-2-(2)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 3 + (((tickAnim - 28) / 9) * (0-(3)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = -2 + (((tickAnim - 28) / 9) * (-4-(-2)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (-0.14-(0)));
            zz = -4 + (((tickAnim - 37) / 3) * (-3-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 57.86 + (((tickAnim - 0) / 20) * (105.07922-(57.86)));
            yy = 76.67 + (((tickAnim - 0) / 20) * (91.44089-(76.67)));
            zz = 44.64 + (((tickAnim - 0) / 20) * (102.3828-(44.64)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 105.07922 + (((tickAnim - 20) / 7) * (38.91598-(105.07922)));
            yy = 91.44089 + (((tickAnim - 20) / 7) * (69.18765-(91.44089)));
            zz = 102.3828 + (((tickAnim - 20) / 7) * (22.4269-(102.3828)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 38.91598 + (((tickAnim - 27) / 6) * (106.82788-(38.91598)));
            yy = 69.18765 + (((tickAnim - 27) / 6) * (80.81639-(69.18765)));
            zz = 22.4269 + (((tickAnim - 27) / 6) * (101.50548-(22.4269)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 106.82788 + (((tickAnim - 33) / 4) * (59.85341-(106.82788)));
            yy = 80.81639 + (((tickAnim - 33) / 4) * (76.61853-(80.81639)));
            zz = 101.50548 + (((tickAnim - 33) / 4) * (44.32339-(101.50548)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 59.85341 + (((tickAnim - 37) / 3) * (57.86-(59.85341)));
            yy = 76.61853 + (((tickAnim - 37) / 3) * (76.67-(76.61853)));
            zz = 44.32339 + (((tickAnim - 37) / 3) * (44.64-(44.32339)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-3.33-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = -3.33 + (((tickAnim - 6) / 12) * (-2.5-(-3.33)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -2.5 + (((tickAnim - 18) / 6) * (-4.26-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = -4.26 + (((tickAnim - 24) / 16) * (0-(-4.26)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinemys entity = (EntityPrehistoricFloraSinemys) entitylivingbaseIn;
        int animCycle = 5;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-2.62846-(0)));
            yy = -5 + (((tickAnim - 0) / 1) * (-2.88813-(-5)));
            zz = 0 + (((tickAnim - 0) / 1) * (5.0008-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -2.62846 + (((tickAnim - 1) / 1) * (1.25-(-2.62846)));
            yy = -2.88813 + (((tickAnim - 1) / 1) * (2.75-(-2.88813)));
            zz = 5.0008 + (((tickAnim - 1) / 1) * (1.25-(5.0008)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.25 + (((tickAnim - 2) / 1) * (0-(1.25)));
            yy = 2.75 + (((tickAnim - 2) / 1) * (5-(2.75)));
            zz = 1.25 + (((tickAnim - 2) / 1) * (0-(1.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (-2.61099-(0)));
            yy = 5 + (((tickAnim - 3) / 0) * (2.48851-(5)));
            zz = 0 + (((tickAnim - 3) / 0) * (-4.99998-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -2.61099 + (((tickAnim - 3) / 1) * (1.25-(-2.61099)));
            yy = 2.48851 + (((tickAnim - 3) / 1) * (-3.05-(2.48851)));
            zz = -4.99998 + (((tickAnim - 3) / 1) * (-1.25-(-4.99998)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 1.25 + (((tickAnim - 4) / 1) * (0-(1.25)));
            yy = -3.05 + (((tickAnim - 4) / 1) * (-5-(-3.05)));
            zz = -1.25 + (((tickAnim - 4) / 1) * (0-(-1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 1) * (1.5-(1)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.5 + (((tickAnim - 1) / 1) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.5 + (((tickAnim - 2) / 1) * (1-(1.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 0) * (1.5-(1)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.5 + (((tickAnim - 3) / 1) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.5 + (((tickAnim - 4) / 1) * (1-(1.5)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (2.5-(0)));
            yy = 2.5 + (((tickAnim - 0) / 1) * (1.83-(2.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 2.5 + (((tickAnim - 1) / 1) * (-2.5-(2.5)));
            yy = 1.83 + (((tickAnim - 1) / 1) * (-3.33-(1.83)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 2) / 1) * (-2.5-(-2.5)));
            yy = -3.33 + (((tickAnim - 2) / 1) * (-2.5-(-3.33)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 3) / 0) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 3) / 0) * (-3.83-(-2.5)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.5 + (((tickAnim - 3) / 1) * (-2.5-(2.5)));
            yy = -3.83 + (((tickAnim - 3) / 1) * (2.34-(-3.83)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 4) / 1) * (0-(-2.5)));
            yy = 2.34 + (((tickAnim - 4) / 1) * (2.5-(2.34)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 2.5 + (((tickAnim - 0) / 3) * (-2.5-(2.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -2.5 + (((tickAnim - 3) / 2) * (2.5-(-2.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.5 + (((tickAnim - 0) / 1) * (58.29038-(12.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.83273-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (38.75605-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 58.29038 + (((tickAnim - 1) / 1) * (86.58077-(58.29038)));
            yy = 0.83273 + (((tickAnim - 1) / 1) * (1.66545-(0.83273)));
            zz = 38.75605 + (((tickAnim - 1) / 1) * (77.51211-(38.75605)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 86.58077 + (((tickAnim - 2) / 1) * (112.37115-(86.58077)));
            yy = 1.66545 + (((tickAnim - 2) / 1) * (2.49818-(1.66545)));
            zz = 77.51211 + (((tickAnim - 2) / 1) * (116.26816-(77.51211)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 112.37115 + (((tickAnim - 3) / 0) * (50.24411-(112.37115)));
            yy = 2.49818 + (((tickAnim - 3) / 0) * (-11.15004-(2.49818)));
            zz = 116.26816 + (((tickAnim - 3) / 0) * (69.52341-(116.26816)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 50.24411 + (((tickAnim - 3) / 1) * (26.18077-(50.24411)));
            yy = -11.15004 + (((tickAnim - 3) / 1) * (-6.29728-(-11.15004)));
            zz = 69.52341 + (((tickAnim - 3) / 1) * (36.98064-(69.52341)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 26.18077 + (((tickAnim - 4) / 1) * (12.5-(26.18077)));
            yy = -6.29728 + (((tickAnim - 4) / 1) * (0-(-6.29728)));
            zz = 36.98064 + (((tickAnim - 4) / 1) * (0-(36.98064)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -15.18993 + (((tickAnim - 0) / 2) * (-46.63527-(-15.18993)));
            yy = 2.76504 + (((tickAnim - 0) / 2) * (-35.90336-(2.76504)));
            zz = 7.47267 + (((tickAnim - 0) / 2) * (39.1637-(7.47267)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -46.63527 + (((tickAnim - 2) / 1) * (44.43022-(-46.63527)));
            yy = -35.90336 + (((tickAnim - 2) / 1) * (-13.26177-(-35.90336)));
            zz = 39.1637 + (((tickAnim - 2) / 1) * (45.86316-(39.1637)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 44.43022 + (((tickAnim - 3) / 0) * (33.33463-(44.43022)));
            yy = -13.26177 + (((tickAnim - 3) / 0) * (-2.50683-(-13.26177)));
            zz = 45.86316 + (((tickAnim - 3) / 0) * (16.56736-(45.86316)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 33.33463 + (((tickAnim - 3) / 1) * (-35.92765-(33.33463)));
            yy = -2.50683 + (((tickAnim - 3) / 1) * (0.1291-(-2.50683)));
            zz = 16.56736 + (((tickAnim - 3) / 1) * (12.02002-(16.56736)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -35.92765 + (((tickAnim - 4) / 1) * (-15.18993-(-35.92765)));
            yy = 0.1291 + (((tickAnim - 4) / 1) * (2.76504-(0.1291)));
            zz = 12.02002 + (((tickAnim - 4) / 1) * (7.47267-(12.02002)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 112.37115 + (((tickAnim - 0) / 1) * (50.24411-(112.37115)));
            yy = -2.49818 + (((tickAnim - 0) / 1) * (11.15004-(-2.49818)));
            zz = -116.26816 + (((tickAnim - 0) / 1) * (-69.52341-(-116.26816)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 50.24411 + (((tickAnim - 1) / 1) * (26.18077-(50.24411)));
            yy = 11.15004 + (((tickAnim - 1) / 1) * (6.29728-(11.15004)));
            zz = -69.52341 + (((tickAnim - 1) / 1) * (-36.98064-(-69.52341)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 26.18077 + (((tickAnim - 2) / 1) * (12.5-(26.18077)));
            yy = 6.29728 + (((tickAnim - 2) / 1) * (0-(6.29728)));
            zz = -36.98064 + (((tickAnim - 2) / 1) * (0-(-36.98064)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 12.5 + (((tickAnim - 3) / 0) * (58.29038-(12.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (-0.83273-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (-38.75605-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 58.29038 + (((tickAnim - 3) / 1) * (86.58077-(58.29038)));
            yy = -0.83273 + (((tickAnim - 3) / 1) * (-1.66545-(-0.83273)));
            zz = -38.75605 + (((tickAnim - 3) / 1) * (-77.51211-(-38.75605)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 86.58077 + (((tickAnim - 4) / 1) * (112.37115-(86.58077)));
            yy = -1.66545 + (((tickAnim - 4) / 1) * (-2.49818-(-1.66545)));
            zz = -77.51211 + (((tickAnim - 4) / 1) * (-116.26816-(-77.51211)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 44.43022 + (((tickAnim - 0) / 1) * (33.33463-(44.43022)));
            yy = 13.26177 + (((tickAnim - 0) / 1) * (2.50683-(13.26177)));
            zz = -45.86316 + (((tickAnim - 0) / 1) * (-16.56736-(-45.86316)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 33.33463 + (((tickAnim - 1) / 1) * (-35.92765-(33.33463)));
            yy = 2.50683 + (((tickAnim - 1) / 1) * (-0.1291-(2.50683)));
            zz = -16.56736 + (((tickAnim - 1) / 1) * (-12.02002-(-16.56736)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -35.92765 + (((tickAnim - 2) / 1) * (-15.18993-(-35.92765)));
            yy = -0.1291 + (((tickAnim - 2) / 1) * (-2.76504-(-0.1291)));
            zz = -12.02002 + (((tickAnim - 2) / 1) * (-7.47267-(-12.02002)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -15.18993 + (((tickAnim - 3) / 1) * (-46.63527-(-15.18993)));
            yy = -2.76504 + (((tickAnim - 3) / 1) * (35.90336-(-2.76504)));
            zz = -7.47267 + (((tickAnim - 3) / 1) * (-39.1637-(-7.47267)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -46.63527 + (((tickAnim - 4) / 1) * (44.43022-(-46.63527)));
            yy = 35.90336 + (((tickAnim - 4) / 1) * (13.26177-(35.90336)));
            zz = -39.1637 + (((tickAnim - 4) / 1) * (-45.86316-(-39.1637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 15 + (((tickAnim - 0) / 1) * (10.05497-(15)));
            yy = 50 + (((tickAnim - 0) / 1) * (63.28073-(50)));
            zz = 0 + (((tickAnim - 0) / 1) * (-1.79726-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 10.05497 + (((tickAnim - 1) / 2) * (0-(10.05497)));
            yy = 63.28073 + (((tickAnim - 1) / 2) * (0-(63.28073)));
            zz = -1.79726 + (((tickAnim - 1) / 2) * (0-(-1.79726)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (16.66667-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.5 + (((tickAnim - 3) / 1) * (-2.5-(-7.5)));
            yy = 16.66667 + (((tickAnim - 3) / 1) * (33.33333-(16.66667)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 4) / 1) * (15-(-2.5)));
            yy = 33.33333 + (((tickAnim - 4) / 1) * (50-(33.33333)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.75 + (((tickAnim - 0) / 1) * (-2.67-(-1.75)));
            yy = -1 + (((tickAnim - 0) / 1) * (-1-(-1)));
            zz = 1.25 + (((tickAnim - 0) / 1) * (0.17-(1.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -2.67 + (((tickAnim - 1) / 2) * (0-(-2.67)));
            yy = -1 + (((tickAnim - 1) / 2) * (-1-(-1)));
            zz = 0.17 + (((tickAnim - 1) / 2) * (-2-(0.17)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-1.75-(0)));
            yy = -1 + (((tickAnim - 3) / 2) * (-1-(-1)));
            zz = -2 + (((tickAnim - 3) / 2) * (1.25-(-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 33.95155 + (((tickAnim - 0) / 3) * (14.82624-(33.95155)));
            yy = -51.06727 + (((tickAnim - 0) / 3) * (-87.58655-(-51.06727)));
            zz = -53.54845 + (((tickAnim - 0) / 3) * (-24.31985-(-53.54845)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 14.82624 + (((tickAnim - 3) / 0) * (52.62269-(14.82624)));
            yy = -87.58655 + (((tickAnim - 3) / 0) * (-77.78333-(-87.58655)));
            zz = -24.31985 + (((tickAnim - 3) / 0) * (-47.48519-(-24.31985)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 52.62269 + (((tickAnim - 3) / 2) * (33.95155-(52.62269)));
            yy = -77.78333 + (((tickAnim - 3) / 2) * (-51.06727-(-77.78333)));
            zz = -47.48519 + (((tickAnim - 3) / 2) * (-53.54845-(-47.48519)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-16.66667-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -7.5 + (((tickAnim - 1) / 1) * (-2.5-(-7.5)));
            yy = -16.66667 + (((tickAnim - 1) / 1) * (-33.33333-(-16.66667)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 2) / 1) * (15-(-2.5)));
            yy = -33.33333 + (((tickAnim - 2) / 1) * (-50-(-33.33333)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 3) / 0) * (10.05497-(15)));
            yy = -50 + (((tickAnim - 3) / 0) * (-63.28073-(-50)));
            zz = 0 + (((tickAnim - 3) / 0) * (1.79726-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10.05497 + (((tickAnim - 3) / 2) * (0-(10.05497)));
            yy = -63.28073 + (((tickAnim - 3) / 2) * (0-(-63.28073)));
            zz = 1.79726 + (((tickAnim - 3) / 2) * (0-(1.79726)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = -1 + (((tickAnim - 0) / 3) * (-1-(-1)));
            zz = -2 + (((tickAnim - 0) / 3) * (1.25-(-2)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 1.75 + (((tickAnim - 3) / 0) * (2.67-(1.75)));
            yy = -1 + (((tickAnim - 3) / 0) * (-1-(-1)));
            zz = 1.25 + (((tickAnim - 3) / 0) * (0.17-(1.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.67 + (((tickAnim - 3) / 2) * (0-(2.67)));
            yy = -1 + (((tickAnim - 3) / 2) * (-1-(-1)));
            zz = 0.17 + (((tickAnim - 3) / 2) * (-2-(0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14.82624 + (((tickAnim - 0) / 1) * (52.62269-(14.82624)));
            yy = 87.58655 + (((tickAnim - 0) / 1) * (77.78333-(87.58655)));
            zz = 24.31985 + (((tickAnim - 0) / 1) * (47.48519-(24.31985)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 52.62269 + (((tickAnim - 1) / 2) * (33.95155-(52.62269)));
            yy = 77.78333 + (((tickAnim - 1) / 2) * (51.06727-(77.78333)));
            zz = 47.48519 + (((tickAnim - 1) / 2) * (53.54845-(47.48519)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 33.95155 + (((tickAnim - 3) / 2) * (14.82624-(33.95155)));
            yy = 51.06727 + (((tickAnim - 3) / 2) * (87.58655-(51.06727)));
            zz = 53.54845 + (((tickAnim - 3) / 2) * (24.31985-(53.54845)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (3.21597-(0)));
            yy = 11.67 + (((tickAnim - 0) / 1) * (7.53324-(11.67)));
            zz = 0 + (((tickAnim - 0) / 1) * (8.67008-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 3.21597 + (((tickAnim - 1) / 1) * (1.54209-(3.21597)));
            yy = 7.53324 + (((tickAnim - 1) / 1) * (-5.68159-(7.53324)));
            zz = 8.67008 + (((tickAnim - 1) / 1) * (5.49759-(8.67008)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.54209 + (((tickAnim - 2) / 1) * (0-(1.54209)));
            yy = -5.68159 + (((tickAnim - 2) / 1) * (-11.67-(-5.68159)));
            zz = 5.49759 + (((tickAnim - 2) / 1) * (0-(5.49759)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (3.19763-(0)));
            yy = -11.67 + (((tickAnim - 3) / 0) * (-6.53341-(-11.67)));
            zz = 0 + (((tickAnim - 3) / 0) * (-8.86783-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 3.19763 + (((tickAnim - 3) / 1) * (1.52267-(3.19763)));
            yy = -6.53341 + (((tickAnim - 3) / 1) * (6.18124-(-6.53341)));
            zz = -8.86783 + (((tickAnim - 3) / 1) * (-5.5983-(-8.86783)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 1.52267 + (((tickAnim - 4) / 1) * (0-(1.52267)));
            yy = 6.18124 + (((tickAnim - 4) / 1) * (11.67-(6.18124)));
            zz = -5.5983 + (((tickAnim - 4) / 1) * (0-(-5.5983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -2.5 + (((tickAnim - 0) / 1) * (10-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 10 + (((tickAnim - 1) / 1) * (11.25-(10)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 11.25 + (((tickAnim - 2) / 1) * (2.5-(11.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.5 + (((tickAnim - 3) / 0) * (-10-(2.5)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -10 + (((tickAnim - 3) / 1) * (-11.25-(-10)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -11.25 + (((tickAnim - 4) / 1) * (-2.5-(-11.25)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSinemys e = (EntityPrehistoricFloraSinemys) entity;
        animator.update(entity);


    }
}
