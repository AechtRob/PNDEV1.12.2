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
        this.main.offsetY = -0.4F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
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
            xx = 0 + (((tickAnim - 0) / 5) * (4.38-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 4.38 + (((tickAnim - 5) / 8) * (6.10756-(4.38)));
            yy = 0 + (((tickAnim - 5) / 8) * (-0.26616-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (2.4858-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 6.10756 + (((tickAnim - 13) / 7) * (7.5-(6.10756)));
            yy = -0.26616 + (((tickAnim - 13) / 7) * (0-(-0.26616)));
            zz = 2.4858 + (((tickAnim - 13) / 7) * (0-(2.4858)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 7.5 + (((tickAnim - 20) / 9) * (6.2587-(7.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.27272-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-2.48509-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 42) {
            xx = 6.2587 + (((tickAnim - 29) / 13) * (4.58-(6.2587)));
            yy = 0.27272 + (((tickAnim - 29) / 13) * (0-(0.27272)));
            zz = -2.48509 + (((tickAnim - 29) / 13) * (0-(-2.48509)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 4.58 + (((tickAnim - 42) / 8) * (0-(4.58)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 20) * (1-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 1 + (((tickAnim - 20) / 30) * (-0.6-(1)));
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




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = -25 + (((tickAnim - 0) / 22) * (-12.5-(-25)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 39) {
            xx = -12.5 + (((tickAnim - 22) / 17) * (-17.86323-(-12.5)));
            yy = 0 + (((tickAnim - 22) / 17) * (-7.14226-(0)));
            zz = 0 + (((tickAnim - 22) / 17) * (2.29464-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -17.86323 + (((tickAnim - 39) / 6) * (-19.20612-(-17.86323)));
            yy = -7.14226 + (((tickAnim - 39) / 6) * (-3.29641-(-7.14226)));
            zz = 2.29464 + (((tickAnim - 39) / 6) * (1.05906-(2.29464)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -19.20612 + (((tickAnim - 45) / 5) * (-25-(-19.20612)));
            yy = -3.29641 + (((tickAnim - 45) / 5) * (0-(-3.29641)));
            zz = 1.05906 + (((tickAnim - 45) / 5) * (0-(1.05906)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 50) * (-1-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 0) / 50) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -95.5114 + (((tickAnim - 0) / 5) * (-97.59473-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 0) / 5) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 0) / 5) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -97.59473 + (((tickAnim - 5) / 8) * (-93.56696-(-97.59473)));
            yy = 34.18897 + (((tickAnim - 5) / 8) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 5) / 8) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -93.56696 + (((tickAnim - 13) / 6) * (-92.62543-(-93.56696)));
            yy = 34.18897 + (((tickAnim - 13) / 6) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 13) / 6) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = -92.62543 + (((tickAnim - 19) / 10) * (-100.5114-(-92.62543)));
            yy = 34.18897 + (((tickAnim - 19) / 10) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 19) / 10) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 29 && tickAnim < 42) {
            xx = -100.5114 + (((tickAnim - 29) / 13) * (-98.21973-(-100.5114)));
            yy = 34.18897 + (((tickAnim - 29) / 13) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 29) / 13) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -98.21973 + (((tickAnim - 42) / 8) * (-95.5114-(-98.21973)));
            yy = 34.18897 + (((tickAnim - 42) / 8) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 42) / 8) * (-97.725-(-97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.25 + (((tickAnim - 0) / 5) * (0.25-(0.25)));
            yy = 0.25 + (((tickAnim - 0) / 5) * (0.75-(0.25)));
            zz = -3 + (((tickAnim - 0) / 5) * (-3-(-3)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.25 + (((tickAnim - 5) / 8) * (0.25-(0.25)));
            yy = 0.75 + (((tickAnim - 5) / 8) * (0.46-(0.75)));
            zz = -3 + (((tickAnim - 5) / 8) * (-3-(-3)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0.25 + (((tickAnim - 13) / 16) * (0.25-(0.25)));
            yy = 0.46 + (((tickAnim - 13) / 16) * (0.57-(0.46)));
            zz = -3 + (((tickAnim - 13) / 16) * (-3-(-3)));
        }
        else if (tickAnim >= 29 && tickAnim < 42) {
            xx = 0.25 + (((tickAnim - 29) / 13) * (0.25-(0.25)));
            yy = 0.57 + (((tickAnim - 29) / 13) * (0.68-(0.57)));
            zz = -3 + (((tickAnim - 29) / 13) * (-3-(-3)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0.25 + (((tickAnim - 42) / 8) * (0.25-(0.25)));
            yy = 0.68 + (((tickAnim - 42) / 8) * (0.25-(0.68)));
            zz = -3 + (((tickAnim - 42) / 8) * (-3-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -121.41336 + (((tickAnim - 0) / 5) * (-130.55095-(-121.41336)));
            yy = -37.02788 + (((tickAnim - 0) / 5) * (-41.73771-(-37.02788)));
            zz = -228.55189 + (((tickAnim - 0) / 5) * (-218.26972-(-228.55189)));
        }
        else if (tickAnim >= 5 && tickAnim < 19) {
            xx = -130.55095 + (((tickAnim - 5) / 14) * (-128.45247-(-130.55095)));
            yy = -41.73771 + (((tickAnim - 5) / 14) * (-39.6309-(-41.73771)));
            zz = -218.26972 + (((tickAnim - 5) / 14) * (-223.40831-(-218.26972)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -128.45247 + (((tickAnim - 19) / 11) * (-135.64814-(-128.45247)));
            yy = -39.6309 + (((tickAnim - 19) / 11) * (-44.00135-(-39.6309)));
            zz = -223.40831 + (((tickAnim - 19) / 11) * (-212.62085-(-223.40831)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -135.64814 + (((tickAnim - 30) / 12) * (-139.79602-(-135.64814)));
            yy = -44.00135 + (((tickAnim - 30) / 12) * (-44.65217-(-44.00135)));
            zz = -212.62085 + (((tickAnim - 30) / 12) * (-208.16953-(-212.62085)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -139.79602 + (((tickAnim - 42) / 8) * (-121.41336-(-139.79602)));
            yy = -44.65217 + (((tickAnim - 42) / 8) * (-37.02788-(-44.65217)));
            zz = -208.16953 + (((tickAnim - 42) / 8) * (-228.55189-(-208.16953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -95.5114 + (((tickAnim - 0) / 5) * (-97.59473-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 0) / 5) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 0) / 5) * (97.725-(97.725)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -97.59473 + (((tickAnim - 5) / 8) * (-101.06696-(-97.59473)));
            yy = -34.18897 + (((tickAnim - 5) / 8) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 5) / 8) * (97.725-(97.725)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -101.06696 + (((tickAnim - 13) / 17) * (-95.5114-(-101.06696)));
            yy = -34.18897 + (((tickAnim - 13) / 17) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 13) / 17) * (97.725-(97.725)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -95.5114 + (((tickAnim - 30) / 12) * (-98.21973-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 30) / 12) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 30) / 12) * (97.725-(97.725)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -98.21973 + (((tickAnim - 42) / 8) * (-95.5114-(-98.21973)));
            yy = -34.18897 + (((tickAnim - 42) / 8) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 42) / 8) * (97.725-(97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.25 + (((tickAnim - 0) / 5) * (-0.25-(-0.25)));
            yy = 0.25 + (((tickAnim - 0) / 5) * (0.5-(0.25)));
            zz = -3 + (((tickAnim - 0) / 5) * (-3-(-3)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 5) / 15) * (-0.25-(-0.25)));
            yy = 0.5 + (((tickAnim - 5) / 15) * (0.17-(0.5)));
            zz = -3 + (((tickAnim - 5) / 15) * (-3-(-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 42) {
            xx = -0.25 + (((tickAnim - 20) / 22) * (-0.25-(-0.25)));
            yy = 0.17 + (((tickAnim - 20) / 22) * (0.48-(0.17)));
            zz = -3 + (((tickAnim - 20) / 22) * (-3-(-3)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -0.25 + (((tickAnim - 42) / 8) * (-0.25-(-0.25)));
            yy = 0.48 + (((tickAnim - 42) / 8) * (0.25-(0.48)));
            zz = -3 + (((tickAnim - 42) / 8) * (-3-(-3)));
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
            xx = -121.41336 + (((tickAnim - 0) / 5) * (-130.55095-(-121.41336)));
            yy = 37.02788 + (((tickAnim - 0) / 5) * (41.73771-(37.02788)));
            zz = 228.55189 + (((tickAnim - 0) / 5) * (218.26972-(228.55189)));
        }
        else if (tickAnim >= 5 && tickAnim < 30) {
            xx = -130.55095 + (((tickAnim - 5) / 25) * (-135.64814-(-130.55095)));
            yy = 41.73771 + (((tickAnim - 5) / 25) * (44.00135-(41.73771)));
            zz = 218.26972 + (((tickAnim - 5) / 25) * (212.62085-(218.26972)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -135.64814 + (((tickAnim - 30) / 12) * (-133.60695-(-135.64814)));
            yy = 44.00135 + (((tickAnim - 30) / 12) * (41.55879-(44.00135)));
            zz = 212.62085 + (((tickAnim - 30) / 12) * (217.69932-(212.62085)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -133.60695 + (((tickAnim - 42) / 8) * (-121.41336-(-133.60695)));
            yy = 41.55879 + (((tickAnim - 42) / 8) * (37.02788-(41.55879)));
            zz = 217.69932 + (((tickAnim - 42) / 8) * (228.55189-(217.69932)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 2.49999 + (((tickAnim - 0) / 11) * (-8.32337-(2.49999)));
            yy = 67.5 + (((tickAnim - 0) / 11) * (74.76614-(67.5)));
            zz = -0.00003 + (((tickAnim - 0) / 11) * (-1.69292-(-0.00003)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -8.32337 + (((tickAnim - 11) / 7) * (-9.57082-(-8.32337)));
            yy = 74.76614 + (((tickAnim - 11) / 7) * (43.57444-(74.76614)));
            zz = -1.69292 + (((tickAnim - 11) / 7) * (4.538-(-1.69292)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -9.57082 + (((tickAnim - 18) / 5) * (-13.58921-(-9.57082)));
            yy = 43.57444 + (((tickAnim - 18) / 5) * (74.25774-(43.57444)));
            zz = 4.538 + (((tickAnim - 18) / 5) * (-5.72827-(4.538)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -13.58921 + (((tickAnim - 23) / 5) * (-13.15217-(-13.58921)));
            yy = 74.25774 + (((tickAnim - 23) / 5) * (75.49785-(74.25774)));
            zz = -5.72827 + (((tickAnim - 23) / 5) * (-1.73145-(-5.72827)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -13.15217 + (((tickAnim - 28) / 10) * (-2.00511-(-13.15217)));
            yy = 75.49785 + (((tickAnim - 28) / 10) * (50.9483-(75.49785)));
            zz = -1.73145 + (((tickAnim - 28) / 10) * (3.16573-(-1.73145)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -2.00511 + (((tickAnim - 38) / 5) * (-0.73616-(-2.00511)));
            yy = 50.9483 + (((tickAnim - 38) / 5) * (67.27476-(50.9483)));
            zz = 3.16573 + (((tickAnim - 38) / 5) * (-0.56957-(3.16573)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.73616 + (((tickAnim - 43) / 7) * (2.49999-(-0.73616)));
            yy = 67.27476 + (((tickAnim - 43) / 7) * (67.5-(67.27476)));
            zz = -0.56957 + (((tickAnim - 43) / 7) * (-0.00003-(-0.56957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -3 + (((tickAnim - 0) / 11) * (-3-(-3)));
            yy = -0.5 + (((tickAnim - 0) / 11) * (-1-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -3 + (((tickAnim - 11) / 7) * (-3-(-3)));
            yy = -1 + (((tickAnim - 11) / 7) * (-1.5-(-1)));
            zz = 0 + (((tickAnim - 11) / 7) * (-2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -3 + (((tickAnim - 18) / 5) * (-2-(-3)));
            yy = -1.5 + (((tickAnim - 18) / 5) * (-0.96-(-1.5)));
            zz = -2 + (((tickAnim - 18) / 5) * (1-(-2)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -2 + (((tickAnim - 23) / 5) * (-3-(-2)));
            yy = -0.96 + (((tickAnim - 23) / 5) * (-0.5-(-0.96)));
            zz = 1 + (((tickAnim - 23) / 5) * (0-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -3 + (((tickAnim - 28) / 10) * (-2-(-3)));
            yy = -0.5 + (((tickAnim - 28) / 10) * (-1.5-(-0.5)));
            zz = 0 + (((tickAnim - 28) / 10) * (-2-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -2 + (((tickAnim - 38) / 5) * (-2-(-2)));
            yy = -1.5 + (((tickAnim - 38) / 5) * (-1.3-(-1.5)));
            zz = -2 + (((tickAnim - 38) / 5) * (1-(-2)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 43) / 7) * (-3-(-2)));
            yy = -1.3 + (((tickAnim - 43) / 7) * (-0.5-(-1.3)));
            zz = 1 + (((tickAnim - 43) / 7) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 71.04414 + (((tickAnim - 0) / 9) * (93.30582-(71.04414)));
            yy = -102.09003 + (((tickAnim - 0) / 9) * (-92.41999-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 0) / 9) * (-96.28416-(-73.7627)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 93.30582 + (((tickAnim - 9) / 9) * (120.33429-(93.30582)));
            yy = -92.41999 + (((tickAnim - 9) / 9) * (-70.01066-(-92.41999)));
            zz = -96.28416 + (((tickAnim - 9) / 9) * (-126.79753-(-96.28416)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 120.33429 + (((tickAnim - 18) / 5) * (100.43416-(120.33429)));
            yy = -70.01066 + (((tickAnim - 18) / 5) * (-36.69759-(-70.01066)));
            zz = -126.79753 + (((tickAnim - 18) / 5) * (-91.68669-(-126.79753)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 100.43416 + (((tickAnim - 23) / 2) * (40.49361-(100.43416)));
            yy = -36.69759 + (((tickAnim - 23) / 2) * (-16.70943-(-36.69759)));
            zz = -91.68669 + (((tickAnim - 23) / 2) * (-70.61984-(-91.68669)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 40.49361 + (((tickAnim - 25) / 5) * (48.13138-(40.49361)));
            yy = -16.70943 + (((tickAnim - 25) / 5) * (-50.28445-(-16.70943)));
            zz = -70.61984 + (((tickAnim - 25) / 5) * (-52.79251-(-70.61984)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 48.13138 + (((tickAnim - 30) / 7) * (98.99654-(48.13138)));
            yy = -50.28445 + (((tickAnim - 30) / 7) * (-89.57675-(-50.28445)));
            zz = -52.79251 + (((tickAnim - 30) / 7) * (-101.87381-(-52.79251)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 98.99654 + (((tickAnim - 37) / 3) * (79.06544-(98.99654)));
            yy = -89.57675 + (((tickAnim - 37) / 3) * (-46.79079-(-89.57675)));
            zz = -101.87381 + (((tickAnim - 37) / 3) * (-78.05155-(-101.87381)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 79.06544 + (((tickAnim - 40) / 2) * (24.09989-(79.06544)));
            yy = -46.79079 + (((tickAnim - 40) / 2) * (-25.39781-(-46.79079)));
            zz = -78.05155 + (((tickAnim - 40) / 2) * (-66.14043-(-78.05155)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 24.09989 + (((tickAnim - 42) / 4) * (66.71885-(24.09989)));
            yy = -25.39781 + (((tickAnim - 42) / 4) * (-58.26591-(-25.39781)));
            zz = -66.14043 + (((tickAnim - 42) / 4) * (-69.40712-(-66.14043)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 66.71885 + (((tickAnim - 46) / 4) * (71.04414-(66.71885)));
            yy = -58.26591 + (((tickAnim - 46) / 4) * (-102.09003-(-58.26591)));
            zz = -69.40712 + (((tickAnim - 46) / 4) * (-73.7627-(-69.40712)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2.49999 + (((tickAnim - 0) / 7) * (-8.32337-(2.49999)));
            yy = -67.5 + (((tickAnim - 0) / 7) * (-74.76614-(-67.5)));
            zz = 0.00003 + (((tickAnim - 0) / 7) * (1.69292-(0.00003)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -8.32337 + (((tickAnim - 7) / 6) * (-9.57082-(-8.32337)));
            yy = -74.76614 + (((tickAnim - 7) / 6) * (-43.57444-(-74.76614)));
            zz = 1.69292 + (((tickAnim - 7) / 6) * (-4.538-(1.69292)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -9.57082 + (((tickAnim - 13) / 6) * (-13.58921-(-9.57082)));
            yy = -43.57444 + (((tickAnim - 13) / 6) * (-74.25774-(-43.57444)));
            zz = -4.538 + (((tickAnim - 13) / 6) * (5.72827-(-4.538)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -13.58921 + (((tickAnim - 19) / 5) * (-13.15217-(-13.58921)));
            yy = -74.25774 + (((tickAnim - 19) / 5) * (-75.49785-(-74.25774)));
            zz = 5.72827 + (((tickAnim - 19) / 5) * (1.73145-(5.72827)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -13.15217 + (((tickAnim - 24) / 9) * (-2.00511-(-13.15217)));
            yy = -75.49785 + (((tickAnim - 24) / 9) * (-50.9483-(-75.49785)));
            zz = 1.73145 + (((tickAnim - 24) / 9) * (-3.16573-(1.73145)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -2.00511 + (((tickAnim - 33) / 5) * (-0.73616-(-2.00511)));
            yy = -50.9483 + (((tickAnim - 33) / 5) * (-67.27476-(-50.9483)));
            zz = -3.16573 + (((tickAnim - 33) / 5) * (0.56957-(-3.16573)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -0.73616 + (((tickAnim - 38) / 12) * (2.49999-(-0.73616)));
            yy = -67.27476 + (((tickAnim - 38) / 12) * (-67.5-(-67.27476)));
            zz = 0.56957 + (((tickAnim - 38) / 12) * (0.00003-(0.56957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3 + (((tickAnim - 0) / 7) * (3-(3)));
            yy = -0.5 + (((tickAnim - 0) / 7) * (-1-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 3 + (((tickAnim - 7) / 6) * (3-(3)));
            yy = -1 + (((tickAnim - 7) / 6) * (-1.5-(-1)));
            zz = 0 + (((tickAnim - 7) / 6) * (-2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 3 + (((tickAnim - 13) / 6) * (2-(3)));
            yy = -1.5 + (((tickAnim - 13) / 6) * (-0.96-(-1.5)));
            zz = -2 + (((tickAnim - 13) / 6) * (1-(-2)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 2 + (((tickAnim - 19) / 5) * (3-(2)));
            yy = -0.96 + (((tickAnim - 19) / 5) * (-0.5-(-0.96)));
            zz = 1 + (((tickAnim - 19) / 5) * (0-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 24) / 9) * (2-(3)));
            yy = -0.5 + (((tickAnim - 24) / 9) * (-1.5-(-0.5)));
            zz = 0 + (((tickAnim - 24) / 9) * (-2-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 2 + (((tickAnim - 33) / 5) * (2-(2)));
            yy = -1.5 + (((tickAnim - 33) / 5) * (-1.3-(-1.5)));
            zz = -2 + (((tickAnim - 33) / 5) * (1-(-2)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 38) / 12) * (3-(2)));
            yy = -1.3 + (((tickAnim - 38) / 12) * (-0.5-(-1.3)));
            zz = 1 + (((tickAnim - 38) / 12) * (0-(1)));
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
            xx = 71.04414 + (((tickAnim - 0) / 5) * (93.30582-(71.04414)));
            yy = 102.09003 + (((tickAnim - 0) / 5) * (92.41999-(102.09003)));
            zz = 73.7627 + (((tickAnim - 0) / 5) * (96.28416-(73.7627)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 93.30582 + (((tickAnim - 5) / 9) * (120.33429-(93.30582)));
            yy = 92.41999 + (((tickAnim - 5) / 9) * (70.01066-(92.41999)));
            zz = 96.28416 + (((tickAnim - 5) / 9) * (126.79753-(96.28416)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 120.33429 + (((tickAnim - 14) / 4) * (100.43416-(120.33429)));
            yy = 70.01066 + (((tickAnim - 14) / 4) * (36.69759-(70.01066)));
            zz = 126.79753 + (((tickAnim - 14) / 4) * (91.68669-(126.79753)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 100.43416 + (((tickAnim - 18) / 3) * (40.49361-(100.43416)));
            yy = 36.69759 + (((tickAnim - 18) / 3) * (16.70943-(36.69759)));
            zz = 91.68669 + (((tickAnim - 18) / 3) * (70.61984-(91.68669)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 40.49361 + (((tickAnim - 21) / 5) * (48.13138-(40.49361)));
            yy = 16.70943 + (((tickAnim - 21) / 5) * (50.28445-(16.70943)));
            zz = 70.61984 + (((tickAnim - 21) / 5) * (52.79251-(70.61984)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 48.13138 + (((tickAnim - 26) / 7) * (98.99654-(48.13138)));
            yy = 50.28445 + (((tickAnim - 26) / 7) * (89.57675-(50.28445)));
            zz = 52.79251 + (((tickAnim - 26) / 7) * (101.87381-(52.79251)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 98.99654 + (((tickAnim - 33) / 3) * (79.06544-(98.99654)));
            yy = 89.57675 + (((tickAnim - 33) / 3) * (46.79079-(89.57675)));
            zz = 101.87381 + (((tickAnim - 33) / 3) * (78.05155-(101.87381)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 79.06544 + (((tickAnim - 36) / 2) * (24.09989-(79.06544)));
            yy = 46.79079 + (((tickAnim - 36) / 2) * (25.39781-(46.79079)));
            zz = 78.05155 + (((tickAnim - 36) / 2) * (66.14043-(78.05155)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 24.09989 + (((tickAnim - 38) / 4) * (66.71885-(24.09989)));
            yy = 25.39781 + (((tickAnim - 38) / 4) * (58.26591-(25.39781)));
            zz = 66.14043 + (((tickAnim - 38) / 4) * (69.40712-(66.14043)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 66.71885 + (((tickAnim - 42) / 8) * (71.04414-(66.71885)));
            yy = 58.26591 + (((tickAnim - 42) / 8) * (102.09003-(58.26591)));
            zz = 69.40712 + (((tickAnim - 42) / 8) * (73.7627-(69.40712)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.84-(0)));
            yy = 10 + (((tickAnim - 0) / 5) * (10-(10)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = -7.84 + (((tickAnim - 5) / 12) * (-13.85-(-7.84)));
            yy = 10 + (((tickAnim - 5) / 12) * (10-(10)));
            zz = 0 + (((tickAnim - 5) / 12) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -13.85 + (((tickAnim - 17) / 2) * (-16.27023-(-13.85)));
            yy = 10 + (((tickAnim - 17) / 2) * (-5.19173-(10)));
            zz = 0 + (((tickAnim - 17) / 2) * (8.72028-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -16.27023 + (((tickAnim - 19) / 2) * (-15.97-(-16.27023)));
            yy = -5.19173 + (((tickAnim - 19) / 2) * (-4.37-(-5.19173)));
            zz = 8.72028 + (((tickAnim - 19) / 2) * (8.25-(8.72028)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -15.97 + (((tickAnim - 21) / 2) * (-13.87763-(-15.97)));
            yy = -4.37 + (((tickAnim - 21) / 2) * (5.71037-(-4.37)));
            zz = 8.25 + (((tickAnim - 21) / 2) * (2.87858-(8.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -13.87763 + (((tickAnim - 23) / 15) * (-6.42156-(-13.87763)));
            yy = 5.71037 + (((tickAnim - 23) / 15) * (1.09828-(5.71037)));
            zz = 2.87858 + (((tickAnim - 23) / 15) * (3.89622-(2.87858)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -6.42156 + (((tickAnim - 38) / 12) * (0-(-6.42156)));
            yy = 1.09828 + (((tickAnim - 38) / 12) * (10-(1.09828)));
            zz = 3.89622 + (((tickAnim - 38) / 12) * (0-(3.89622)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 10 + (((tickAnim - 0) / 19) * (0-(10)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
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
            yy = 11.39 + (((tickAnim - 42) / 8) * (10-(11.39)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


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
        int animCycle = 310;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -1.5 + (((tickAnim - 2) / 1) * (-2.5-(-1.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 3) / 2) * (0.35714-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (2-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0.35714 + (((tickAnim - 5) / 3) * (1.5-(0.35714)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2 + (((tickAnim - 8) / 7) * (0-(2)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 1.5 + (((tickAnim - 8) / 7) * (0-(1.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 15) / 275) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 275) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 275) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 294) {
            xx = 0 + (((tickAnim - 290) / 4) * (-1.56101-(0)));
            yy = 0 + (((tickAnim - 290) / 4) * (0.06815-(0)));
            zz = 0 + (((tickAnim - 290) / 4) * (2.49907-(0)));
        }
        else if (tickAnim >= 294 && tickAnim < 297) {
            xx = -1.56101 + (((tickAnim - 294) / 3) * (-2.5-(-1.56101)));
            yy = 0.06815 + (((tickAnim - 294) / 3) * (0-(0.06815)));
            zz = 2.49907 + (((tickAnim - 294) / 3) * (0-(2.49907)));
        }
        else if (tickAnim >= 297 && tickAnim < 301) {
            xx = -2.5 + (((tickAnim - 297) / 4) * (1.07041-(-2.5)));
            yy = 0 + (((tickAnim - 297) / 4) * (0.04673-(0)));
            zz = 0 + (((tickAnim - 297) / 4) * (-2.49956-(0)));
        }
        else if (tickAnim >= 301 && tickAnim < 303) {
            xx = 1.07041 + (((tickAnim - 301) / 2) * (2.5-(1.07041)));
            yy = 0.04673 + (((tickAnim - 301) / 2) * (0-(0.04673)));
            zz = -2.49956 + (((tickAnim - 301) / 2) * (0-(-2.49956)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = 2.5 + (((tickAnim - 303) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 303) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 2) * (-0.23-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -0.23 + (((tickAnim - 2) / 3) * (-0.7-(-0.23)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.7 + (((tickAnim - 5) / 3) * (-0.37-(-0.7)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.37 + (((tickAnim - 8) / 7) * (-0.6-(-0.37)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 15) / 275) * (0-(0)));
            yy = -0.6 + (((tickAnim - 15) / 275) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 15) / 275) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 290) / 15) * (0-(0)));
            yy = -0.6 + (((tickAnim - 290) / 15) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 290) / 15) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 305) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 305) / 5) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 305) / 5) * (0-(0)));
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
            xx = -25 + (((tickAnim - 0) / 3) * (13.40117-(-25)));
            yy = 0 + (((tickAnim - 0) / 3) * (66.37374-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (12.25509-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 13.40117 + (((tickAnim - 3) / 2) * (89.17341-(13.40117)));
            yy = 66.37374 + (((tickAnim - 3) / 2) * (73.46105-(66.37374)));
            zz = 12.25509 + (((tickAnim - 3) / 2) * (85.55794-(12.25509)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 89.17341 + (((tickAnim - 5) / 3) * (143.8648-(89.17341)));
            yy = 73.46105 + (((tickAnim - 5) / 3) * (79.90143-(73.46105)));
            zz = 85.55794 + (((tickAnim - 5) / 3) * (133.81621-(85.55794)));
        }
        else if (tickAnim >= 8 && tickAnim < 290) {
            xx = 143.8648 + (((tickAnim - 8) / 282) * (143.8648-(143.8648)));
            yy = 79.90143 + (((tickAnim - 8) / 282) * (79.90143-(79.90143)));
            zz = 133.81621 + (((tickAnim - 8) / 282) * (133.81621-(133.81621)));
        }
        else if (tickAnim >= 290 && tickAnim < 298) {
            xx = 143.8648 + (((tickAnim - 290) / 8) * (32.72951-(143.8648)));
            yy = 79.90143 + (((tickAnim - 290) / 8) * (62.39102-(79.90143)));
            zz = 133.81621 + (((tickAnim - 290) / 8) * (33.63163-(133.81621)));
        }
        else if (tickAnim >= 298 && tickAnim < 301) {
            xx = 32.72951 + (((tickAnim - 298) / 3) * (-1.70029-(32.72951)));
            yy = 62.39102 + (((tickAnim - 298) / 3) * (35.25148-(62.39102)));
            zz = 33.63163 + (((tickAnim - 298) / 3) * (3.43462-(33.63163)));
        }
        else if (tickAnim >= 301 && tickAnim < 305) {
            xx = -1.70029 + (((tickAnim - 301) / 4) * (-25-(-1.70029)));
            yy = 35.25148 + (((tickAnim - 301) / 4) * (0-(35.25148)));
            zz = 3.43462 + (((tickAnim - 301) / 4) * (0-(3.43462)));
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
            zz = -1 + (((tickAnim - 0) / 8) * (0-(-1)));
        }
        else if (tickAnim >= 8 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 8) / 282) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 282) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 282) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 290) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 15) * (-1-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (4.43532-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (26.66924-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.53099-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 4.43532 + (((tickAnim - 3) / 4) * (7.5-(4.43532)));
            yy = 26.66924 + (((tickAnim - 3) / 4) * (35-(26.66924)));
            zz = 0.53099 + (((tickAnim - 3) / 4) * (0-(0.53099)));
        }
        else if (tickAnim >= 7 && tickAnim < 290) {
            xx = 7.5 + (((tickAnim - 7) / 283) * (7.5-(7.5)));
            yy = 35 + (((tickAnim - 7) / 283) * (35-(35)));
            zz = 0 + (((tickAnim - 7) / 283) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 304) {
            xx = 7.5 + (((tickAnim - 290) / 14) * (1.44464-(7.5)));
            yy = 35 + (((tickAnim - 290) / 14) * (-10.82792-(35)));
            zz = 0 + (((tickAnim - 290) / 14) * (-0.43733-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 310) {
            xx = 1.44464 + (((tickAnim - 304) / 6) * (0-(1.44464)));
            yy = -10.82792 + (((tickAnim - 304) / 6) * (0-(-10.82792)));
            zz = -0.43733 + (((tickAnim - 304) / 6) * (0-(-0.43733)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (-8.33155-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (30.35307-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-7.42986-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -8.33155 + (((tickAnim - 3) / 4) * (-3.54835-(-8.33155)));
            yy = 30.35307 + (((tickAnim - 3) / 4) * (19.03771-(30.35307)));
            zz = -7.42986 + (((tickAnim - 3) / 4) * (-6.24605-(-7.42986)));
        }
        else if (tickAnim >= 7 && tickAnim < 290) {
            xx = -3.54835 + (((tickAnim - 7) / 283) * (-3.54835-(-3.54835)));
            yy = 19.03771 + (((tickAnim - 7) / 283) * (19.03771-(19.03771)));
            zz = -6.24605 + (((tickAnim - 7) / 283) * (-6.24605-(-6.24605)));
        }
        else if (tickAnim >= 290 && tickAnim < 305) {
            xx = -3.54835 + (((tickAnim - 290) / 15) * (-17.5-(-3.54835)));
            yy = 19.03771 + (((tickAnim - 290) / 15) * (0-(19.03771)));
            zz = -6.24605 + (((tickAnim - 290) / 15) * (0-(-6.24605)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 3) / 287) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 287) * (0-(0)));
            zz = 0.3 + (((tickAnim - 3) / 287) * (0.3-(0.3)));
        }
        else if (tickAnim >= 290 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 290) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 20) * (0-(0)));
            zz = 0.3 + (((tickAnim - 290) / 20) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -95.5114 + (((tickAnim - 0) / 1) * (-171.65745-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 0) / 1) * (25.82571-(34.18897)));
            zz = -97.725 + (((tickAnim - 0) / 1) * (-159.5063-(-97.725)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -171.65745 + (((tickAnim - 1) / 4) * (-100.5114-(-171.65745)));
            yy = 25.82571 + (((tickAnim - 1) / 4) * (34.18897-(25.82571)));
            zz = -159.5063 + (((tickAnim - 1) / 4) * (-97.725-(-159.5063)));
        }
        else if (tickAnim >= 5 && tickAnim < 290) {
            xx = -100.5114 + (((tickAnim - 5) / 285) * (-95.5114-(-100.5114)));
            yy = 34.18897 + (((tickAnim - 5) / 285) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 5) / 285) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 290 && tickAnim < 299) {
            xx = -95.5114 + (((tickAnim - 290) / 9) * (-110.5114-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 290) / 9) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 290) / 9) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 299 && tickAnim < 305) {
            xx = -110.5114 + (((tickAnim - 299) / 6) * (-98.5114-(-110.5114)));
            yy = 34.18897 + (((tickAnim - 299) / 6) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 299) / 6) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 305 && tickAnim < 310) {
            xx = -98.5114 + (((tickAnim - 305) / 5) * (-95.5114-(-98.5114)));
            yy = 34.18897 + (((tickAnim - 305) / 5) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 305) / 5) * (-97.725-(-97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.25 + (((tickAnim - 0) / 5) * (3.25-(0.25)));
            yy = 0.25 + (((tickAnim - 0) / 5) * (0.75-(0.25)));
            zz = -3 + (((tickAnim - 0) / 5) * (-1-(-3)));
        }
        else if (tickAnim >= 5 && tickAnim < 290) {
            xx = 3.25 + (((tickAnim - 5) / 285) * (3.25-(3.25)));
            yy = 0.75 + (((tickAnim - 5) / 285) * (0.75-(0.75)));
            zz = -1 + (((tickAnim - 5) / 285) * (-1-(-1)));
        }
        else if (tickAnim >= 290 && tickAnim < 305) {
            xx = 3.25 + (((tickAnim - 290) / 15) * (0.25-(3.25)));
            yy = 0.75 + (((tickAnim - 290) / 15) * (0.25-(0.75)));
            zz = -1 + (((tickAnim - 290) / 15) * (-3-(-1)));
        }
        else if (tickAnim >= 305 && tickAnim < 310) {
            xx = 0.25 + (((tickAnim - 305) / 5) * (0.25-(0.25)));
            yy = 0.25 + (((tickAnim - 305) / 5) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 305) / 5) * (-3-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -121.41336 + (((tickAnim - 0) / 5) * (44.32094-(-121.41336)));
            yy = -37.02788 + (((tickAnim - 0) / 5) * (-6.19216-(-37.02788)));
            zz = -228.55189 + (((tickAnim - 0) / 5) * (-264.32839-(-228.55189)));
        }
        else if (tickAnim >= 5 && tickAnim < 290) {
            xx = 44.32094 + (((tickAnim - 5) / 285) * (44.32094-(44.32094)));
            yy = -6.19216 + (((tickAnim - 5) / 285) * (-6.19216-(-6.19216)));
            zz = -264.32839 + (((tickAnim - 5) / 285) * (-264.32839-(-264.32839)));
        }
        else if (tickAnim >= 290 && tickAnim < 305) {
            xx = 44.32094 + (((tickAnim - 290) / 15) * (-138.28992-(44.32094)));
            yy = -6.19216 + (((tickAnim - 290) / 15) * (-43.91233-(-6.19216)));
            zz = -264.32839 + (((tickAnim - 290) / 15) * (-212.46353-(-264.32839)));
        }
        else if (tickAnim >= 305 && tickAnim < 310) {
            xx = -138.28992 + (((tickAnim - 305) / 5) * (-121.41336-(-138.28992)));
            yy = -43.91233 + (((tickAnim - 305) / 5) * (-37.02788-(-43.91233)));
            zz = -212.46353 + (((tickAnim - 305) / 5) * (-228.55189-(-212.46353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -95.5114 + (((tickAnim - 0) / 3) * (-165.50394-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 0) / 3) * (-28.49203-(-34.18897)));
            zz = 97.725 + (((tickAnim - 0) / 3) * (158.22633-(97.725)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -165.50394 + (((tickAnim - 3) / 6) * (-100.5114-(-165.50394)));
            yy = -28.49203 + (((tickAnim - 3) / 6) * (-34.18897-(-28.49203)));
            zz = 158.22633 + (((tickAnim - 3) / 6) * (97.725-(158.22633)));
        }
        else if (tickAnim >= 9 && tickAnim < 290) {
            xx = -100.5114 + (((tickAnim - 9) / 281) * (-95.5114-(-100.5114)));
            yy = -34.18897 + (((tickAnim - 9) / 281) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 9) / 281) * (97.725-(97.725)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = -95.5114 + (((tickAnim - 290) / 3) * (-95.5114-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 290) / 3) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 290) / 3) * (97.725-(97.725)));
        }
        else if (tickAnim >= 293 && tickAnim < 300) {
            xx = -95.5114 + (((tickAnim - 293) / 7) * (-113.0114-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 293) / 7) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 293) / 7) * (97.725-(97.725)));
        }
        else if (tickAnim >= 300 && tickAnim < 308) {
            xx = -113.0114 + (((tickAnim - 300) / 8) * (-98.0114-(-113.0114)));
            yy = -34.18897 + (((tickAnim - 300) / 8) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 300) / 8) * (97.725-(97.725)));
        }
        else if (tickAnim >= 308 && tickAnim < 310) {
            xx = -98.0114 + (((tickAnim - 308) / 2) * (-95.5114-(-98.0114)));
            yy = -34.18897 + (((tickAnim - 308) / 2) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 308) / 2) * (97.725-(97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.25 + (((tickAnim - 0) / 5) * (-3.25-(-0.25)));
            yy = 0.25 + (((tickAnim - 0) / 5) * (0.75-(0.25)));
            zz = -3 + (((tickAnim - 0) / 5) * (-1-(-3)));
        }
        else if (tickAnim >= 5 && tickAnim < 290) {
            xx = -3.25 + (((tickAnim - 5) / 285) * (-3.25-(-3.25)));
            yy = 0.75 + (((tickAnim - 5) / 285) * (0.75-(0.75)));
            zz = -1 + (((tickAnim - 5) / 285) * (-1-(-1)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = -3.25 + (((tickAnim - 290) / 3) * (-3.25-(-3.25)));
            yy = 0.75 + (((tickAnim - 290) / 3) * (0.75-(0.75)));
            zz = -1 + (((tickAnim - 290) / 3) * (-1-(-1)));
        }
        else if (tickAnim >= 293 && tickAnim < 308) {
            xx = -3.25 + (((tickAnim - 293) / 15) * (-0.25-(-3.25)));
            yy = 0.75 + (((tickAnim - 293) / 15) * (0.25-(0.75)));
            zz = -1 + (((tickAnim - 293) / 15) * (-3-(-1)));
        }
        else if (tickAnim >= 308 && tickAnim < 310) {
            xx = -0.25 + (((tickAnim - 308) / 2) * (-0.25-(-0.25)));
            yy = 0.25 + (((tickAnim - 308) / 2) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 308) / 2) * (-3-(-3)));
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
            xx = -121.41336 + (((tickAnim - 0) / 5) * (44.32094-(-121.41336)));
            yy = 37.02788 + (((tickAnim - 0) / 5) * (6.19216-(37.02788)));
            zz = 228.55189 + (((tickAnim - 0) / 5) * (264.32839-(228.55189)));
        }
        else if (tickAnim >= 5 && tickAnim < 290) {
            xx = 44.32094 + (((tickAnim - 5) / 285) * (44.32094-(44.32094)));
            yy = 6.19216 + (((tickAnim - 5) / 285) * (6.19216-(6.19216)));
            zz = 264.32839 + (((tickAnim - 5) / 285) * (264.32839-(264.32839)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = 44.32094 + (((tickAnim - 290) / 3) * (44.32094-(44.32094)));
            yy = 6.19216 + (((tickAnim - 290) / 3) * (6.19216-(6.19216)));
            zz = 264.32839 + (((tickAnim - 290) / 3) * (264.32839-(264.32839)));
        }
        else if (tickAnim >= 293 && tickAnim < 308) {
            xx = 44.32094 + (((tickAnim - 293) / 15) * (-131.33548-(44.32094)));
            yy = 6.19216 + (((tickAnim - 293) / 15) * (42.43515-(6.19216)));
            zz = 264.32839 + (((tickAnim - 293) / 15) * (217.35313-(264.32839)));
        }
        else if (tickAnim >= 308 && tickAnim < 310) {
            xx = -131.33548 + (((tickAnim - 308) / 2) * (-121.41336-(-131.33548)));
            yy = 42.43515 + (((tickAnim - 308) / 2) * (37.02788-(42.43515)));
            zz = 217.35313 + (((tickAnim - 308) / 2) * (228.55189-(217.35313)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.49999 + (((tickAnim - 0) / 3) * (2.11468-(2.49999)));
            yy = 67.5 + (((tickAnim - 0) / 3) * (65.33946-(67.5)));
            zz = -0.00003 + (((tickAnim - 0) / 3) * (-10.18081-(-0.00003)));
        }
        else if (tickAnim >= 3 && tickAnim < 290) {
            xx = 2.11468 + (((tickAnim - 3) / 287) * (-0.38532-(2.11468)));
            yy = 65.33946 + (((tickAnim - 3) / 287) * (65.33946-(65.33946)));
            zz = -10.18081 + (((tickAnim - 3) / 287) * (-10.18081-(-10.18081)));
        }
        else if (tickAnim >= 290 && tickAnim < 292) {
            xx = -0.38532 + (((tickAnim - 290) / 2) * (-0.38532-(-0.38532)));
            yy = 65.33946 + (((tickAnim - 290) / 2) * (65.33946-(65.33946)));
            zz = -10.18081 + (((tickAnim - 290) / 2) * (-10.18081-(-10.18081)));
        }
        else if (tickAnim >= 292 && tickAnim < 297) {
            xx = -0.38532 + (((tickAnim - 292) / 5) * (9.07153-(-0.38532)));
            yy = 65.33946 + (((tickAnim - 292) / 5) * (49.30795-(65.33946)));
            zz = -10.18081 + (((tickAnim - 292) / 5) * (-1.3753-(-10.18081)));
        }
        else if (tickAnim >= 297 && tickAnim < 300) {
            xx = 9.07153 + (((tickAnim - 297) / 3) * (2.19057-(9.07153)));
            yy = 49.30795 + (((tickAnim - 297) / 3) * (61.43582-(49.30795)));
            zz = -1.3753 + (((tickAnim - 297) / 3) * (-0.45846-(-1.3753)));
        }
        else if (tickAnim >= 300 && tickAnim < 303) {
            xx = 2.19057 + (((tickAnim - 300) / 3) * (2.49999-(2.19057)));
            yy = 61.43582 + (((tickAnim - 300) / 3) * (67.5-(61.43582)));
            zz = -0.45846 + (((tickAnim - 300) / 3) * (-0.00003-(-0.45846)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3 + (((tickAnim - 0) / 3) * (-2-(-3)));
            yy = -0.5 + (((tickAnim - 0) / 3) * (0.8-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-4.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 290) {
            xx = -2 + (((tickAnim - 3) / 287) * (-2-(-2)));
            yy = 0.8 + (((tickAnim - 3) / 287) * (0.8-(0.8)));
            zz = -4.25 + (((tickAnim - 3) / 287) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 290 && tickAnim < 292) {
            xx = -2 + (((tickAnim - 290) / 2) * (-2-(-2)));
            yy = 0.8 + (((tickAnim - 290) / 2) * (0.8-(0.8)));
            zz = -4.25 + (((tickAnim - 290) / 2) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 292 && tickAnim < 303) {
            xx = -2 + (((tickAnim - 292) / 11) * (-3-(-2)));
            yy = 0.8 + (((tickAnim - 292) / 11) * (-0.5-(0.8)));
            zz = -4.25 + (((tickAnim - 292) / 11) * (0-(-4.25)));
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
            xx = 71.04414 + (((tickAnim - 0) / 3) * (153.82922-(71.04414)));
            yy = -102.09003 + (((tickAnim - 0) / 3) * (-83.82592-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 0) / 3) * (-161.71136-(-73.7627)));
        }
        else if (tickAnim >= 3 && tickAnim < 290) {
            xx = 153.82922 + (((tickAnim - 3) / 287) * (153.82922-(153.82922)));
            yy = -83.82592 + (((tickAnim - 3) / 287) * (-83.82592-(-83.82592)));
            zz = -161.71136 + (((tickAnim - 3) / 287) * (-161.71136-(-161.71136)));
        }
        else if (tickAnim >= 290 && tickAnim < 292) {
            xx = 153.82922 + (((tickAnim - 290) / 2) * (153.82922-(153.82922)));
            yy = -83.82592 + (((tickAnim - 290) / 2) * (-83.82592-(-83.82592)));
            zz = -161.71136 + (((tickAnim - 290) / 2) * (-161.71136-(-161.71136)));
        }
        else if (tickAnim >= 292 && tickAnim < 298) {
            xx = 153.82922 + (((tickAnim - 292) / 6) * (58.43646-(153.82922)));
            yy = -83.82592 + (((tickAnim - 292) / 6) * (-93.66963-(-83.82592)));
            zz = -161.71136 + (((tickAnim - 292) / 6) * (-45.58914-(-161.71136)));
        }
        else if (tickAnim >= 298 && tickAnim < 303) {
            xx = 58.43646 + (((tickAnim - 298) / 5) * (71.04414-(58.43646)));
            yy = -93.66963 + (((tickAnim - 298) / 5) * (-102.09003-(-93.66963)));
            zz = -45.58914 + (((tickAnim - 298) / 5) * (-73.7627-(-45.58914)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.49999 + (((tickAnim - 0) / 3) * (-0.38532-(2.49999)));
            yy = -67.5 + (((tickAnim - 0) / 3) * (-65.33946-(-67.5)));
            zz = 0.00003 + (((tickAnim - 0) / 3) * (10.18081-(0.00003)));
        }
        else if (tickAnim >= 3 && tickAnim < 290) {
            xx = -0.38532 + (((tickAnim - 3) / 287) * (-0.38532-(-0.38532)));
            yy = -65.33946 + (((tickAnim - 3) / 287) * (-65.33946-(-65.33946)));
            zz = 10.18081 + (((tickAnim - 3) / 287) * (10.18081-(10.18081)));
        }
        else if (tickAnim >= 290 && tickAnim < 294) {
            xx = -0.38532 + (((tickAnim - 290) / 4) * (-0.38532-(-0.38532)));
            yy = -65.33946 + (((tickAnim - 290) / 4) * (-65.33946-(-65.33946)));
            zz = 10.18081 + (((tickAnim - 290) / 4) * (10.18081-(10.18081)));
        }
        else if (tickAnim >= 294 && tickAnim < 300) {
            xx = -0.38532 + (((tickAnim - 294) / 6) * (4.03822-(-0.38532)));
            yy = -65.33946 + (((tickAnim - 294) / 6) * (-66.77982-(-65.33946)));
            zz = 10.18081 + (((tickAnim - 294) / 6) * (3.39362-(10.18081)));
        }
        else if (tickAnim >= 300 && tickAnim < 304) {
            xx = 4.03822 + (((tickAnim - 300) / 4) * (2.49999-(4.03822)));
            yy = -66.77982 + (((tickAnim - 300) / 4) * (-67.5-(-66.77982)));
            zz = 3.39362 + (((tickAnim - 300) / 4) * (0.00003-(3.39362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3 + (((tickAnim - 0) / 3) * (2-(3)));
            yy = -0.5 + (((tickAnim - 0) / 3) * (0.8-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-4.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 290) {
            xx = 2 + (((tickAnim - 3) / 287) * (2-(2)));
            yy = 0.8 + (((tickAnim - 3) / 287) * (0.8-(0.8)));
            zz = -4.25 + (((tickAnim - 3) / 287) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 290 && tickAnim < 294) {
            xx = 2 + (((tickAnim - 290) / 4) * (2-(2)));
            yy = 0.8 + (((tickAnim - 290) / 4) * (0.8-(0.8)));
            zz = -4.25 + (((tickAnim - 290) / 4) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 294 && tickAnim < 304) {
            xx = 2 + (((tickAnim - 294) / 10) * (3-(2)));
            yy = 0.8 + (((tickAnim - 294) / 10) * (-0.5-(0.8)));
            zz = -4.25 + (((tickAnim - 294) / 10) * (0-(-4.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 71.04414 + (((tickAnim - 0) / 3) * (153.82922-(71.04414)));
            yy = 102.09003 + (((tickAnim - 0) / 3) * (83.82592-(102.09003)));
            zz = 73.7627 + (((tickAnim - 0) / 3) * (161.71136-(73.7627)));
        }
        else if (tickAnim >= 3 && tickAnim < 290) {
            xx = 153.82922 + (((tickAnim - 3) / 287) * (153.82922-(153.82922)));
            yy = 83.82592 + (((tickAnim - 3) / 287) * (83.82592-(83.82592)));
            zz = 161.71136 + (((tickAnim - 3) / 287) * (161.71136-(161.71136)));
        }
        else if (tickAnim >= 290 && tickAnim < 294) {
            xx = 153.82922 + (((tickAnim - 290) / 4) * (153.82922-(153.82922)));
            yy = 83.82592 + (((tickAnim - 290) / 4) * (83.82592-(83.82592)));
            zz = 161.71136 + (((tickAnim - 290) / 4) * (161.71136-(161.71136)));
        }
        else if (tickAnim >= 294 && tickAnim < 302) {
            xx = 153.82922 + (((tickAnim - 294) / 8) * (48.24635-(153.82922)));
            yy = 83.82592 + (((tickAnim - 294) / 8) * (93.9255-(83.82592)));
            zz = 161.71136 + (((tickAnim - 294) / 8) * (35.14379-(161.71136)));
        }
        else if (tickAnim >= 302 && tickAnim < 304) {
            xx = 48.24635 + (((tickAnim - 302) / 2) * (71.04414-(48.24635)));
            yy = 93.9255 + (((tickAnim - 302) / 2) * (102.09003-(93.9255)));
            zz = 35.14379 + (((tickAnim - 302) / 2) * (73.7627-(35.14379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            yy = 10 + (((tickAnim - 0) / 5) * (85-(10)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 290) {
            xx = 7.5 + (((tickAnim - 5) / 285) * (7.5-(7.5)));
            yy = 85 + (((tickAnim - 5) / 285) * (85-(85)));
            zz = 0 + (((tickAnim - 5) / 285) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = 7.5 + (((tickAnim - 290) / 3) * (7.5-(7.5)));
            yy = 85 + (((tickAnim - 290) / 3) * (85-(85)));
            zz = 0 + (((tickAnim - 290) / 3) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 304) {
            xx = 7.5 + (((tickAnim - 293) / 11) * (2.71104-(7.5)));
            yy = 85 + (((tickAnim - 293) / 11) * (14.47496-(85)));
            zz = 0 + (((tickAnim - 293) / 11) * (2.95495-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 308) {
            xx = 2.71104 + (((tickAnim - 304) / 4) * (0-(2.71104)));
            yy = 14.47496 + (((tickAnim - 304) / 4) * (5-(14.47496)));
            zz = 2.95495 + (((tickAnim - 304) / 4) * (0-(2.95495)));
        }
        else if (tickAnim >= 308 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 308) / 2) * (0-(0)));
            yy = 5 + (((tickAnim - 308) / 2) * (10-(5)));
            zz = 0 + (((tickAnim - 308) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 10 + (((tickAnim - 0) / 3) * (-17.78-(10)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -17.78 + (((tickAnim - 3) / 5) * (37.5-(-17.78)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 8) / 282) * (0-(0)));
            yy = 37.5 + (((tickAnim - 8) / 282) * (37.5-(37.5)));
            zz = 0 + (((tickAnim - 8) / 282) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 290) / 3) * (0-(0)));
            yy = 37.5 + (((tickAnim - 290) / 3) * (37.5-(37.5)));
            zz = 0 + (((tickAnim - 290) / 3) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 296) {
            xx = 0 + (((tickAnim - 293) / 3) * (0-(0)));
            yy = 37.5 + (((tickAnim - 293) / 3) * (66.39-(37.5)));
            zz = 0 + (((tickAnim - 293) / 3) * (0-(0)));
        }
        else if (tickAnim >= 296 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 296) / 12) * (0-(0)));
            yy = 66.39 + (((tickAnim - 296) / 12) * (20-(66.39)));
            zz = 0 + (((tickAnim - 296) / 12) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 308) / 2) * (0-(0)));
            yy = 20 + (((tickAnim - 308) / 2) * (10-(20)));
            zz = 0 + (((tickAnim - 308) / 2) * (0-(0)));
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
         if (tickAnim >= 0 && tickAnim < 82) {
            xx = -17.5 + (((tickAnim - 0) / 82) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 82) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 433) {
            xx = -17.5 + (((tickAnim - 82) / 351) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 82) / 351) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 351) * (0-(0)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = -17.5 + (((tickAnim - 433) / 47) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 433) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 433) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 82) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 82) / 14) * (1.76915-(0)));
            yy = 0 + (((tickAnim - 82) / 14) * (0.07723-(0)));
            zz = 0 + (((tickAnim - 82) / 14) * (-2.49881-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 102) {
            xx = 1.76915 + (((tickAnim - 96) / 6) * (2.49762-(1.76915)));
            yy = 0.07723 + (((tickAnim - 96) / 6) * (0.10901-(0.07723)));
            zz = -2.49881 + (((tickAnim - 96) / 6) * (-2.49762-(-2.49881)));
        }
        else if (tickAnim >= 102 && tickAnim < 110) {
            xx = 2.49762 + (((tickAnim - 102) / 8) * (2.5-(2.49762)));
            yy = 0.10901 + (((tickAnim - 102) / 8) * (0-(0.10901)));
            zz = -2.49762 + (((tickAnim - 102) / 8) * (0-(-2.49762)));
        }
        else if (tickAnim >= 110 && tickAnim < 392) {
            xx = 2.5 + (((tickAnim - 110) / 282) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 110) / 282) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 282) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 398) {
            xx = 2.5 + (((tickAnim - 392) / 6) * (2.49762-(2.5)));
            yy = 0 + (((tickAnim - 392) / 6) * (0.10901-(0)));
            zz = 0 + (((tickAnim - 392) / 6) * (-2.49762-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 406) {
            xx = 2.49762 + (((tickAnim - 398) / 8) * (2.5-(2.49762)));
            yy = 0.10901 + (((tickAnim - 398) / 8) * (0-(0.10901)));
            zz = -2.49762 + (((tickAnim - 398) / 8) * (0-(-2.49762)));
        }
        else if (tickAnim >= 406 && tickAnim < 433) {
            xx = 2.5 + (((tickAnim - 406) / 27) * (0-(2.5)));
            yy = 0 + (((tickAnim - 406) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 406) / 27) * (0-(0)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 433) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 433) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 433) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 82) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 82) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 82) / 20) * (0-(0)));
            yy = -0.6 + (((tickAnim - 82) / 20) * (-0.35-(-0.6)));
            zz = 0 + (((tickAnim - 82) / 20) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 398) {
            xx = 0 + (((tickAnim - 102) / 296) * (0-(0)));
            yy = -0.35 + (((tickAnim - 102) / 296) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 102) / 296) * (0-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 433) {
            xx = 0 + (((tickAnim - 398) / 35) * (0-(0)));
            yy = -0.35 + (((tickAnim - 398) / 35) * (-0.6-(-0.35)));
            zz = 0 + (((tickAnim - 398) / 35) * (0-(0)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 433) / 47) * (0-(0)));
            yy = -0.6 + (((tickAnim - 433) / 47) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 433) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            yy = 10 + (((tickAnim - 0) / 82) * (10-(10)));
            zz = 0 + (((tickAnim - 0) / 82) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 82) / 20) * (17.538-(0)));
            yy = 10 + (((tickAnim - 82) / 20) * (0.00933-(10)));
            zz = 0 + (((tickAnim - 82) / 20) * (0.43399-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 398) {
            xx = 17.538 + (((tickAnim - 102) / 296) * (17.538-(17.538)));
            yy = 0.00933 + (((tickAnim - 102) / 296) * (0.00933-(0.00933)));
            zz = 0.43399 + (((tickAnim - 102) / 296) * (0.43399-(0.43399)));
        }
        else if (tickAnim >= 398 && tickAnim < 433) {
            xx = 17.538 + (((tickAnim - 398) / 35) * (0-(17.538)));
            yy = 0.00933 + (((tickAnim - 398) / 35) * (10-(0.00933)));
            zz = 0.43399 + (((tickAnim - 398) / 35) * (0-(0.43399)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 433) / 47) * (0-(0)));
            yy = 10 + (((tickAnim - 433) / 47) * (10-(10)));
            zz = 0 + (((tickAnim - 433) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            yy = 10 + (((tickAnim - 0) / 82) * (10-(10)));
            zz = 0 + (((tickAnim - 0) / 82) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 82) / 20) * (2.5-(0)));
            yy = 10 + (((tickAnim - 82) / 20) * (-2.5-(10)));
            zz = 0 + (((tickAnim - 82) / 20) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 398) {
            xx = 2.5 + (((tickAnim - 102) / 296) * (2.5-(2.5)));
            yy = -2.5 + (((tickAnim - 102) / 296) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 102) / 296) * (0-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 433) {
            xx = 2.5 + (((tickAnim - 398) / 35) * (0-(2.5)));
            yy = -2.5 + (((tickAnim - 398) / 35) * (10-(-2.5)));
            zz = 0 + (((tickAnim - 398) / 35) * (0-(0)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 433) / 47) * (0-(0)));
            yy = 10 + (((tickAnim - 433) / 47) * (10-(10)));
            zz = 0 + (((tickAnim - 433) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = -25 + (((tickAnim - 0) / 35) * (-23.5594-(-25)));
            yy = 0 + (((tickAnim - 0) / 35) * (7.69779-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-6.85916-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = -23.5594 + (((tickAnim - 35) / 28) * (-24.99093-(-23.5594)));
            yy = 7.69779 + (((tickAnim - 35) / 28) * (12.11243-(7.69779)));
            zz = -6.85916 + (((tickAnim - 35) / 28) * (-6.90765-(-6.85916)));
        }
        else if (tickAnim >= 63 && tickAnim < 127) {
            xx = -24.99093 + (((tickAnim - 63) / 64) * (-25.0209-(-24.99093)));
            yy = 12.11243 + (((tickAnim - 63) / 64) * (2.26564-(12.11243)));
            zz = -6.90765 + (((tickAnim - 63) / 64) * (-1.0571-(-6.90765)));
        }
        else if (tickAnim >= 127 && tickAnim < 218) {
            xx = -25.0209 + (((tickAnim - 127) / 91) * (-12.5-(-25.0209)));
            yy = 2.26564 + (((tickAnim - 127) / 91) * (0-(2.26564)));
            zz = -1.0571 + (((tickAnim - 127) / 91) * (0-(-1.0571)));
        }
        else if (tickAnim >= 218 && tickAnim < 398) {
            xx = -12.5 + (((tickAnim - 218) / 180) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 218) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 180) * (0-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 413) {
            xx = -12.5 + (((tickAnim - 398) / 15) * (-18.11475-(-12.5)));
            yy = 0 + (((tickAnim - 398) / 15) * (-9.51365-(0)));
            zz = 0 + (((tickAnim - 398) / 15) * (3.09495-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 433) {
            xx = -18.11475 + (((tickAnim - 413) / 20) * (-25-(-18.11475)));
            yy = -9.51365 + (((tickAnim - 413) / 20) * (0-(-9.51365)));
            zz = 3.09495 + (((tickAnim - 413) / 20) * (0-(3.09495)));
        }
        else if (tickAnim >= 433 && tickAnim < 461) {
            xx = -25 + (((tickAnim - 433) / 28) * (-25.18908-(-25)));
            yy = 0 + (((tickAnim - 433) / 28) * (6.79382-(0)));
            zz = 0 + (((tickAnim - 433) / 28) * (-3.18458-(0)));
        }
        else if (tickAnim >= 461 && tickAnim < 480) {
            xx = -25.18908 + (((tickAnim - 461) / 19) * (-25-(-25.18908)));
            yy = 6.79382 + (((tickAnim - 461) / 19) * (0-(6.79382)));
            zz = -3.18458 + (((tickAnim - 461) / 19) * (0-(-3.18458)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 0) / 127) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 127) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 127) * (-1-(-1)));
        }
        else if (tickAnim >= 127 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 127) / 91) * (0-(0)));
            yy = 0 + (((tickAnim - 127) / 91) * (0-(0)));
            zz = -1 + (((tickAnim - 127) / 91) * (-1-(-1)));
        }
        else if (tickAnim >= 218 && tickAnim < 433) {
            xx = 0 + (((tickAnim - 218) / 215) * (0-(0)));
            yy = 0 + (((tickAnim - 218) / 215) * (0-(0)));
            zz = -1 + (((tickAnim - 218) / 215) * (-1-(-1)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 433) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 433) / 47) * (0-(0)));
            zz = -1 + (((tickAnim - 433) / 47) * (-1-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (15-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 35) / 96) * (0-(0)));
            yy = 15 + (((tickAnim - 35) / 96) * (0-(15)));
            zz = 0 + (((tickAnim - 35) / 96) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 413) {
            xx = 0 + (((tickAnim - 131) / 282) * (0-(0)));
            yy = 0 + (((tickAnim - 131) / 282) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 131) / 282) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 413) / 25) * (0-(0)));
            yy = -17.5 + (((tickAnim - 413) / 25) * (4.06-(-17.5)));
            zz = 0 + (((tickAnim - 413) / 25) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 479) {
            xx = 0 + (((tickAnim - 438) / 41) * (0-(0)));
            yy = 4.06 + (((tickAnim - 438) / 41) * (0-(4.06)));
            zz = 0 + (((tickAnim - 438) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 1 + (((tickAnim - 0) / 82) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 82) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 82) * (1-(1)));
        }
        else if (tickAnim >= 82 && tickAnim < 102) {
            xx = 1 + (((tickAnim - 82) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 82) / 20) * (0.1-(1)));
            zz = 1 + (((tickAnim - 82) / 20) * (1-(1)));
        }
        else if (tickAnim >= 102 && tickAnim < 414) {
            xx = 1 + (((tickAnim - 102) / 312) * (1-(1)));
            yy = 0.1 + (((tickAnim - 102) / 312) * (0.1-(0.1)));
            zz = 1 + (((tickAnim - 102) / 312) * (1-(1)));
        }
        else if (tickAnim >= 414 && tickAnim < 433) {
            xx = 1 + (((tickAnim - 414) / 19) * (1-(1)));
            yy = 0.1 + (((tickAnim - 414) / 19) * (1-(0.1)));
            zz = 1 + (((tickAnim - 414) / 19) * (1-(1)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = 1 + (((tickAnim - 433) / 47) * (1-(1)));
            yy = 1 + (((tickAnim - 433) / 47) * (1-(1)));
            zz = 1 + (((tickAnim - 433) / 47) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 1 + (((tickAnim - 0) / 82) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 82) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 82) * (1-(1)));
        }
        else if (tickAnim >= 82 && tickAnim < 102) {
            xx = 1 + (((tickAnim - 82) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 82) / 20) * (0.1-(1)));
            zz = 1 + (((tickAnim - 82) / 20) * (1-(1)));
        }
        else if (tickAnim >= 102 && tickAnim < 414) {
            xx = 1 + (((tickAnim - 102) / 312) * (1-(1)));
            yy = 0.1 + (((tickAnim - 102) / 312) * (0.1-(0.1)));
            zz = 1 + (((tickAnim - 102) / 312) * (1-(1)));
        }
        else if (tickAnim >= 414 && tickAnim < 433) {
            xx = 1 + (((tickAnim - 414) / 19) * (1-(1)));
            yy = 0.1 + (((tickAnim - 414) / 19) * (1-(0.1)));
            zz = 1 + (((tickAnim - 414) / 19) * (1-(1)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = 1 + (((tickAnim - 433) / 47) * (1-(1)));
            yy = 1 + (((tickAnim - 433) / 47) * (1-(1)));
            zz = 1 + (((tickAnim - 433) / 47) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = -95.5114 + (((tickAnim - 0) / 82) * (-95.51-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 0) / 82) * (34.19-(34.18897)));
            zz = -97.725 + (((tickAnim - 0) / 82) * (-97.73-(-97.725)));
        }
        else if (tickAnim >= 82 && tickAnim < 102) {
            xx = -95.51 + (((tickAnim - 82) / 20) * (-100.51007-(-95.51)));
            yy = 34.19 + (((tickAnim - 82) / 20) * (34.18995-(34.19)));
            zz = -97.73 + (((tickAnim - 82) / 20) * (-97.72975-(-97.73)));
        }
        else if (tickAnim >= 102 && tickAnim < 110) {
            xx = -100.51007 + (((tickAnim - 102) / 8) * (-97.89997-(-100.51007)));
            yy = 34.18995 + (((tickAnim - 102) / 8) * (34.18993-(34.18995)));
            zz = -97.72975 + (((tickAnim - 102) / 8) * (-97.72964-(-97.72975)));
        }
        else if (tickAnim >= 110 && tickAnim < 392) {
            xx = -97.89997 + (((tickAnim - 110) / 282) * (-97.89997-(-97.89997)));
            yy = 34.18993 + (((tickAnim - 110) / 282) * (34.18993-(34.18993)));
            zz = -97.72964 + (((tickAnim - 110) / 282) * (-97.72964-(-97.72964)));
        }
        else if (tickAnim >= 392 && tickAnim < 398) {
            xx = -97.89997 + (((tickAnim - 392) / 6) * (-101.05874-(-97.89997)));
            yy = 34.18993 + (((tickAnim - 392) / 6) * (34.18979-(34.18993)));
            zz = -97.72964 + (((tickAnim - 392) / 6) * (-97.72898-(-97.72964)));
        }
        else if (tickAnim >= 398 && tickAnim < 406) {
            xx = -101.05874 + (((tickAnim - 398) / 8) * (-99.73795-(-101.05874)));
            yy = 34.18979 + (((tickAnim - 398) / 8) * (34.18959-(34.18979)));
            zz = -97.72898 + (((tickAnim - 398) / 8) * (-97.72803-(-97.72898)));
        }
        else if (tickAnim >= 406 && tickAnim < 433) {
            xx = -99.73795 + (((tickAnim - 406) / 27) * (-95.5114-(-99.73795)));
            yy = 34.18959 + (((tickAnim - 406) / 27) * (34.18897-(34.18959)));
            zz = -97.72803 + (((tickAnim - 406) / 27) * (-97.725-(-97.72803)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = -95.5114 + (((tickAnim - 433) / 47) * (-95.5114-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 433) / 47) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 433) / 47) * (-97.725-(-97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 480) {
            xx = 0.25 + (((tickAnim - 0) / 480) * (0.25-(0.25)));
            yy = 0.25 + (((tickAnim - 0) / 480) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 0) / 480) * (-3-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 480) {
            xx = -121.41336 + (((tickAnim - 0) / 480) * (-121.41336-(-121.41336)));
            yy = -37.02788 + (((tickAnim - 0) / 480) * (-37.02788-(-37.02788)));
            zz = -228.55189 + (((tickAnim - 0) / 480) * (-228.55189-(-228.55189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = -95.5114 + (((tickAnim - 0) / 82) * (-95.5114-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 0) / 82) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 0) / 82) * (97.725-(97.725)));
        }
        else if (tickAnim >= 82 && tickAnim < 96) {
            xx = -95.5114 + (((tickAnim - 82) / 14) * (-94.18943-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 82) / 14) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 82) / 14) * (97.725-(97.725)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = -94.18943 + (((tickAnim - 96) / 14) * (-98.0114-(-94.18943)));
            yy = -34.18897 + (((tickAnim - 96) / 14) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 96) / 14) * (97.725-(97.725)));
        }
        else if (tickAnim >= 110 && tickAnim < 392) {
            xx = -98.0114 + (((tickAnim - 110) / 282) * (-98.0114-(-98.0114)));
            yy = -34.18897 + (((tickAnim - 110) / 282) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 110) / 282) * (97.725-(97.725)));
        }
        else if (tickAnim >= 392 && tickAnim < 398) {
            xx = -98.0114 + (((tickAnim - 392) / 6) * (-95.65426-(-98.0114)));
            yy = -34.18897 + (((tickAnim - 392) / 6) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 392) / 6) * (97.725-(97.725)));
        }
        else if (tickAnim >= 398 && tickAnim < 406) {
            xx = -95.65426 + (((tickAnim - 398) / 8) * (-97.62024-(-95.65426)));
            yy = -34.18897 + (((tickAnim - 398) / 8) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 398) / 8) * (97.725-(97.725)));
        }
        else if (tickAnim >= 406 && tickAnim < 433) {
            xx = -97.62024 + (((tickAnim - 406) / 27) * (-95.5114-(-97.62024)));
            yy = -34.18897 + (((tickAnim - 406) / 27) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 406) / 27) * (97.725-(97.725)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = -95.5114 + (((tickAnim - 433) / 47) * (-95.5114-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 433) / 47) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 433) / 47) * (97.725-(97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 480) {
            xx = -0.25 + (((tickAnim - 0) / 480) * (-0.25-(-0.25)));
            yy = 0.25 + (((tickAnim - 0) / 480) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 0) / 480) * (-3-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 480) {
            xx = -121.41336 + (((tickAnim - 0) / 480) * (-121.41336-(-121.41336)));
            yy = 37.02788 + (((tickAnim - 0) / 480) * (37.02788-(37.02788)));
            zz = 228.55189 + (((tickAnim - 0) / 480) * (228.55189-(228.55189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 2.49999 + (((tickAnim - 0) / 82) * (2.49999-(2.49999)));
            yy = 67.5 + (((tickAnim - 0) / 82) * (67.5-(67.5)));
            zz = -0.00003 + (((tickAnim - 0) / 82) * (-0.00003-(-0.00003)));
        }
        else if (tickAnim >= 82 && tickAnim < 115) {
            xx = 2.49999 + (((tickAnim - 82) / 33) * (10.24278-(2.49999)));
            yy = 67.5 + (((tickAnim - 82) / 33) * (51.58172-(67.5)));
            zz = -0.00003 + (((tickAnim - 82) / 33) * (1.63565-(-0.00003)));
        }
        else if (tickAnim >= 115 && tickAnim < 144) {
            xx = 10.24278 + (((tickAnim - 115) / 29) * (7.64271-(10.24278)));
            yy = 51.58172 + (((tickAnim - 115) / 29) * (37.65326-(51.58172)));
            zz = 1.63565 + (((tickAnim - 115) / 29) * (3.06686-(1.63565)));
        }
        else if (tickAnim >= 144 && tickAnim < 398) {
            xx = 7.64271 + (((tickAnim - 144) / 254) * (7.64271-(7.64271)));
            yy = 37.65326 + (((tickAnim - 144) / 254) * (37.65326-(37.65326)));
            zz = 3.06686 + (((tickAnim - 144) / 254) * (3.06686-(3.06686)));
        }
        else if (tickAnim >= 398 && tickAnim < 433) {
            xx = 7.64271 + (((tickAnim - 398) / 35) * (2.49999-(7.64271)));
            yy = 37.65326 + (((tickAnim - 398) / 35) * (67.5-(37.65326)));
            zz = 3.06686 + (((tickAnim - 398) / 35) * (-0.00003-(3.06686)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = 2.49999 + (((tickAnim - 433) / 47) * (2.49999-(2.49999)));
            yy = 67.5 + (((tickAnim - 433) / 47) * (67.5-(67.5)));
            zz = -0.00003 + (((tickAnim - 433) / 47) * (-0.00003-(-0.00003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 82) {
            xx = -3 + (((tickAnim - 0) / 82) * (-3-(-3)));
            yy = -0.5 + (((tickAnim - 0) / 82) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 82) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 144) {
            xx = -3 + (((tickAnim - 82) / 62) * (-2.25-(-3)));
            yy = -0.5 + (((tickAnim - 82) / 62) * (-0.25-(-0.5)));
            zz = 0 + (((tickAnim - 82) / 62) * (2-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 398) {
            xx = -2.25 + (((tickAnim - 144) / 254) * (-2.25-(-2.25)));
            yy = -0.25 + (((tickAnim - 144) / 254) * (-0.25-(-0.25)));
            zz = 2 + (((tickAnim - 144) / 254) * (2-(2)));
        }
        else if (tickAnim >= 398 && tickAnim < 433) {
            xx = -2.25 + (((tickAnim - 398) / 35) * (-3-(-2.25)));
            yy = -0.25 + (((tickAnim - 398) / 35) * (-0.5-(-0.25)));
            zz = 2 + (((tickAnim - 398) / 35) * (0-(2)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = -3 + (((tickAnim - 433) / 47) * (-3-(-3)));
            yy = -0.5 + (((tickAnim - 433) / 47) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 433) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 71.04414 + (((tickAnim - 0) / 82) * (71.04414-(71.04414)));
            yy = -102.09003 + (((tickAnim - 0) / 82) * (-102.09003-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 0) / 82) * (-73.7627-(-73.7627)));
        }
        else if (tickAnim >= 82 && tickAnim < 102) {
            xx = 71.04414 + (((tickAnim - 82) / 20) * (18.05817-(71.04414)));
            yy = -102.09003 + (((tickAnim - 82) / 20) * (-82.93055-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 82) / 20) * (-18.54484-(-73.7627)));
        }
        else if (tickAnim >= 102 && tickAnim < 398) {
            xx = 18.05817 + (((tickAnim - 102) / 296) * (18.05817-(18.05817)));
            yy = -82.93055 + (((tickAnim - 102) / 296) * (-82.93055-(-82.93055)));
            zz = -18.54484 + (((tickAnim - 102) / 296) * (-18.54484-(-18.54484)));
        }
        else if (tickAnim >= 398 && tickAnim < 433) {
            xx = 18.05817 + (((tickAnim - 398) / 35) * (71.04414-(18.05817)));
            yy = -82.93055 + (((tickAnim - 398) / 35) * (-102.09003-(-82.93055)));
            zz = -18.54484 + (((tickAnim - 398) / 35) * (-73.7627-(-18.54484)));
        }
        else if (tickAnim >= 433 && tickAnim < 480) {
            xx = 71.04414 + (((tickAnim - 433) / 47) * (71.04414-(71.04414)));
            yy = -102.09003 + (((tickAnim - 433) / 47) * (-102.09003-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 433) / 47) * (-73.7627-(-73.7627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 92) {
            xx = 2.49999 + (((tickAnim - 0) / 92) * (2.49999-(2.49999)));
            yy = -67.5 + (((tickAnim - 0) / 92) * (-67.5-(-67.5)));
            zz = 0.00003 + (((tickAnim - 0) / 92) * (0.00003-(0.00003)));
        }
        else if (tickAnim >= 92 && tickAnim < 117) {
            xx = 2.49999 + (((tickAnim - 92) / 25) * (7.05709-(2.49999)));
            yy = -67.5 + (((tickAnim - 92) / 25) * (-55.56129-(-67.5)));
            zz = 0.00003 + (((tickAnim - 92) / 25) * (-1.22673-(0.00003)));
        }
        else if (tickAnim >= 117 && tickAnim < 154) {
            xx = 7.05709 + (((tickAnim - 117) / 37) * (7.64271-(7.05709)));
            yy = -55.56129 + (((tickAnim - 117) / 37) * (-37.65326-(-55.56129)));
            zz = -1.22673 + (((tickAnim - 117) / 37) * (-3.06686-(-1.22673)));
        }
        else if (tickAnim >= 154 && tickAnim < 408) {
            xx = 7.64271 + (((tickAnim - 154) / 254) * (7.64271-(7.64271)));
            yy = -37.65326 + (((tickAnim - 154) / 254) * (-37.65326-(-37.65326)));
            zz = -3.06686 + (((tickAnim - 154) / 254) * (-3.06686-(-3.06686)));
        }
        else if (tickAnim >= 408 && tickAnim < 443) {
            xx = 7.64271 + (((tickAnim - 408) / 35) * (2.49999-(7.64271)));
            yy = -37.65326 + (((tickAnim - 408) / 35) * (-67.5-(-37.65326)));
            zz = -3.06686 + (((tickAnim - 408) / 35) * (0.00003-(-3.06686)));
        }
        else if (tickAnim >= 443 && tickAnim < 480) {
            xx = 2.49999 + (((tickAnim - 443) / 37) * (2.49999-(2.49999)));
            yy = -67.5 + (((tickAnim - 443) / 37) * (-67.5-(-67.5)));
            zz = 0.00003 + (((tickAnim - 443) / 37) * (0.00003-(0.00003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 92) {
            xx = 3 + (((tickAnim - 0) / 92) * (3-(3)));
            yy = -0.5 + (((tickAnim - 0) / 92) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 92) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 154) {
            xx = 3 + (((tickAnim - 92) / 62) * (2.25-(3)));
            yy = -0.5 + (((tickAnim - 92) / 62) * (-0.25-(-0.5)));
            zz = 0 + (((tickAnim - 92) / 62) * (2-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 408) {
            xx = 2.25 + (((tickAnim - 154) / 254) * (2.25-(2.25)));
            yy = -0.25 + (((tickAnim - 154) / 254) * (-0.25-(-0.25)));
            zz = 2 + (((tickAnim - 154) / 254) * (2-(2)));
        }
        else if (tickAnim >= 408 && tickAnim < 443) {
            xx = 2.25 + (((tickAnim - 408) / 35) * (3-(2.25)));
            yy = -0.25 + (((tickAnim - 408) / 35) * (-0.5-(-0.25)));
            zz = 2 + (((tickAnim - 408) / 35) * (0-(2)));
        }
        else if (tickAnim >= 443 && tickAnim < 480) {
            xx = 3 + (((tickAnim - 443) / 37) * (3-(3)));
            yy = -0.5 + (((tickAnim - 443) / 37) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 443) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 92) {
            xx = 71.04414 + (((tickAnim - 0) / 92) * (71.04414-(71.04414)));
            yy = 102.09003 + (((tickAnim - 0) / 92) * (102.09003-(102.09003)));
            zz = 73.7627 + (((tickAnim - 0) / 92) * (73.7627-(73.7627)));
        }
        else if (tickAnim >= 92 && tickAnim < 112) {
            xx = 71.04414 + (((tickAnim - 92) / 20) * (18.05817-(71.04414)));
            yy = 102.09003 + (((tickAnim - 92) / 20) * (82.93055-(102.09003)));
            zz = 73.7627 + (((tickAnim - 92) / 20) * (18.54484-(73.7627)));
        }
        else if (tickAnim >= 112 && tickAnim < 408) {
            xx = 18.05817 + (((tickAnim - 112) / 296) * (18.05817-(18.05817)));
            yy = 82.93055 + (((tickAnim - 112) / 296) * (82.93055-(82.93055)));
            zz = 18.54484 + (((tickAnim - 112) / 296) * (18.54484-(18.54484)));
        }
        else if (tickAnim >= 408 && tickAnim < 443) {
            xx = 18.05817 + (((tickAnim - 408) / 35) * (71.04414-(18.05817)));
            yy = 82.93055 + (((tickAnim - 408) / 35) * (102.09003-(82.93055)));
            zz = 18.54484 + (((tickAnim - 408) / 35) * (73.7627-(18.54484)));
        }
        else if (tickAnim >= 443 && tickAnim < 480) {
            xx = 71.04414 + (((tickAnim - 443) / 37) * (71.04414-(71.04414)));
            yy = 102.09003 + (((tickAnim - 443) / 37) * (102.09003-(102.09003)));
            zz = 73.7627 + (((tickAnim - 443) / 37) * (73.7627-(73.7627)));
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
