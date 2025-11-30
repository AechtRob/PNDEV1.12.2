package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBrodiechelys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBrodiechelys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelBrodiechelys() {
        this.textureWidth = 90;
        this.textureHeight = 70;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 55, 29, -2.5F, -7.05F, -4.5F, 5, 2, 9, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 19, -7.5F, -2.25F, -4.5F, 15, 2, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.325F, -5.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 10, -4.0F, -2.0F, -5.0F, 9, 2, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.3F, 4.5F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 20, -5.0F, -2.0F, 0.0F, 11, 2, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -7.05F, 4.5F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 7, -2.0F, 0.0F, 0.0F, 5, 2, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -7.05F, -4.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 0, -2.0F, 0.0F, -6.0F, 5, 2, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.8094F, -2.5F, -11.7773F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -3.0426F, 0.2615F, -3.0964F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 60, 0.0F, -3.0F, -5.0F, 4, 3, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(8.1829F, -2.3F, -9.6281F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -3.0702F, 0.5666F, -3.0899F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 42, 0.0F, -3.0F, -5.0F, 4, 3, 5, -0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, -6.8F, -4.5F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.3491F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 16, 0.0F, 0.0F, -5.0F, 6, 0, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.5F, -6.8F, -0.5F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 28, 0.0F, 0.0F, -4.0F, 7, 0, 9, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.5F, -6.8F, 4.5F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.3491F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 72, 22, 0.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(11.6031F, -1.9F, -0.2312F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -3.0223F, 1.2191F, -3.0146F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 31, 0.0F, -3.0F, -7.0F, 10, 3, 7, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(11.6031F, -1.9F, -0.2312F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1375F, 1.2624F, 0.1442F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 42, -10.0F, -3.0F, -5.0F, 10, 3, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(8.5961F, -2.3F, 9.306F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1326F, 0.478F, 0.0983F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 51, -8.0F, -3.0F, -5.0F, 8, 3, 5, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.5F, -6.8F, -4.5F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, -0.3491F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 72, 16, -6.0F, 0.0F, -5.0F, 6, 0, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.5F, -6.8F, 4.5F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3054F, 0.0F, -0.3491F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 22, -6.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.5F, -6.8F, -0.5F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3491F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 66, 28, -7.0F, 0.0F, -4.0F, 7, 0, 9, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -3.025F, 12.95F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1134F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 45, 50, -1.0F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -2.65F, -12.65F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1134F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 50, -1.0F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-8.5961F, -2.3F, 9.306F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1326F, -0.478F, -0.0983F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 51, 0.0F, -3.0F, -5.0F, 8, 3, 5, -0.001F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-11.6031F, -1.9F, -0.2312F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1375F, -1.2624F, -0.1442F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 42, 0.0F, -3.0F, -5.0F, 10, 3, 5, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-11.6031F, -1.9F, -0.2312F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -3.0223F, -1.2191F, 3.0146F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 31, -10.0F, -3.0F, -7.0F, 10, 3, 7, -0.001F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-8.1829F, -2.3F, -9.6281F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -3.0702F, -0.5666F, 3.0899F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 42, -4.0F, -3.0F, -5.0F, 4, 3, 5, -0.002F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-4.8094F, -2.5F, -11.7773F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -3.0426F, -0.2615F, 3.0964F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 60, -4.0F, -3.0F, -5.0F, 4, 3, 5, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -3.25F, -10.0F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 11, -2.0F, -2.2F, -3.0F, 5, 2, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -3.5F, 8.5F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 70, 46, -2.0F, -2.0F, 0.0F, 5, 2, 5, 0.002F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.15F, -9.1F);
        this.main.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 53, 0, -2.5F, -1.45F, -3.0F, 5, 2, 3, 0.011F, false));
        this.neck.cubeList.add(new ModelBox(neck, 46, 28, -2.5F, 0.05F, -3.0F, 5, 1, 3, 0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 1, 0, -2.5F, 0.05F, -2.0F, 5, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 62, -2.5F, -1.45F, -4.0F, 5, 2, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 1, 4, -1.0F, -1.45F, -8.0F, 2, 2, 4, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.5F, -1.45F, -4.0F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.3927F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 6, 0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.5F, -1.45F, -4.0F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.3927F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 14, 6, -2.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, -1.45F, -8.0F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 23, 2, -2.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(1.3F, -0.65F, -6.4F);
        this.head.addChild(eye1);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.7F, -0.3F, 2.5F);
        this.eye1.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.3927F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 21, 1, -1.3F, -0.45F, -3.4F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.3F, -0.65F, -6.4F);
        this.head.addChild(eye2);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.7F, -0.3F, 2.5F);
        this.eye2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.3927F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 21, 1, 0.3F, -0.45F, -3.4F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.55F, -2.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 34, -2.5F, -0.5F, -2.0F, 5, 1, 2, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 9, -2.0F, -1.5F, -2.0F, 4, 1, 2, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 12, 0, -1.0F, -0.5F, -5.7F, 2, 1, 4, -0.002F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.5F, -2.0F, -2.0F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.3927F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 13, 13, 0.0F, 1.5F, -4.0F, 2, 1, 4, -0.004F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(2.5F, -2.0F, -2.0F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.3927F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 13, 13, -2.0F, 1.5F, -4.0F, 2, 1, 4, -0.004F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(6.1973F, -2.1283F, -6.3271F);
        this.main.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.2618F, -0.8727F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 27, 47, -2.0456F, -1.008F, -7.0611F, 4, 2, 9, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.361F, -0.4144F, -6.9874F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.1443F, 0.5214F, -0.0503F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 49, 57, -2.535F, -0.1328F, -4.132F, 4, 1, 5, 0.0F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-6.1973F, -2.1283F, -6.3271F);
        this.main.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.2618F, 0.8727F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 27, 47, -1.9544F, -1.008F, -7.0611F, 4, 2, 9, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.361F, -0.4144F, -6.9874F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.1443F, -0.5214F, 0.0503F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 49, 57, -1.465F, -0.1328F, -4.132F, 4, 1, 5, 0.0F, true));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(5.4893F, -2.1633F, 5.7983F);
        this.main.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.2182F, 0.8727F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 59, 55, -1.9956F, -1.008F, -1.0139F, 4, 2, 9, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.3193F, -0.4437F, 6.0814F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0436F, -0.3927F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 70, 0, -2.5369F, -0.008F, 0.1742F, 5, 1, 5, 0.0F, false));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-5.4893F, -2.1633F, 5.7983F);
        this.main.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.2182F, -0.8727F, 0.0F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 59, 55, -2.0044F, -1.008F, -1.0139F, 4, 2, 9, 0.0F, true));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-0.3193F, -0.4437F, 6.0814F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.0436F, 0.3927F, 0.0F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 70, 0, -2.4631F, -0.008F, 0.1742F, 5, 1, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.6981F, 10.0436F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 33, 33, -1.5F, -1.5F, -2.0F, 3, 3, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0005F, 7.9782F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 60, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0872F, 4.9981F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 9, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));
        

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
        this.main.offsetY = -1.4F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.8F;
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

        EntityPrehistoricFloraBrodiechelys entityBrodiechelys = (EntityPrehistoricFloraBrodiechelys) e;

        if (entityBrodiechelys.getAnimation() == entityBrodiechelys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (entityBrodiechelys.getAnimation() == entityBrodiechelys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityBrodiechelys.isReallyInWater()) {

                if (f3 == 0.0F || !entityBrodiechelys.getIsMoving()) {
                    if (entityBrodiechelys.getAnimation() != entityBrodiechelys.EAT_ANIMATION
                        && entityBrodiechelys.getAnimation() != entityBrodiechelys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityBrodiechelys.getIsFast()) { //Running


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

        EntityPrehistoricFloraBrodiechelys ee = (EntityPrehistoricFloraBrodiechelys) entitylivingbaseIn;

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
        EntityPrehistoricFloraBrodiechelys entity = (EntityPrehistoricFloraBrodiechelys) entitylivingbaseIn;
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


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 0) / 5) * (-10.34-(-5)));
            yy = 10 + (((tickAnim - 0) / 5) * (10-(10)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 21) {
            xx = -10.34 + (((tickAnim - 5) / 16) * (-18.5-(-10.34)));
            yy = 10 + (((tickAnim - 5) / 16) * (10-(10)));
            zz = 0 + (((tickAnim - 5) / 16) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 42) {
            xx = -18.5 + (((tickAnim - 21) / 21) * (-11.35715-(-18.5)));
            yy = 10 + (((tickAnim - 21) / 21) * (10-(10)));
            zz = 0 + (((tickAnim - 21) / 21) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -11.35715 + (((tickAnim - 42) / 8) * (-5-(-11.35715)));
            yy = 10 + (((tickAnim - 42) / 8) * (10-(10)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
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
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -17.86323 + (((tickAnim - 39) / 11) * (-25-(-17.86323)));
            yy = -7.14226 + (((tickAnim - 39) / 11) * (0-(-7.14226)));
            zz = 2.29464 + (((tickAnim - 39) / 11) * (0-(2.29464)));
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




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -95.5114 + (((tickAnim - 0) / 5) * (-101.59473-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 0) / 5) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 0) / 5) * (97.725-(97.725)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -101.59473 + (((tickAnim - 5) / 8) * (-102.9692-(-101.59473)));
            yy = -34.18897 + (((tickAnim - 5) / 8) * (-26.68954-(-34.18897)));
            zz = 97.725 + (((tickAnim - 5) / 8) * (97.12012-(97.725)));
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
            xx = -103.36332 + (((tickAnim - 45) / 5) * (-95.5114-(-103.36332)));
            yy = -33.02052 + (((tickAnim - 45) / 5) * (-34.18897-(-33.02052)));
            zz = 97.941 + (((tickAnim - 45) / 5) * (97.725-(97.941)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2.25 + (((tickAnim - 0) / 50) * (-2.25-(-2.25)));
            yy = 0.25 + (((tickAnim - 0) / 50) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 0) / 50) * (-3-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -121.41336 + (((tickAnim - 0) / 5) * (-130.55095-(-121.41336)));
            yy = 37.02788 + (((tickAnim - 0) / 5) * (41.73771-(37.02788)));
            zz = 228.55189 + (((tickAnim - 0) / 5) * (218.26972-(228.55189)));
        }
        else if (tickAnim >= 5 && tickAnim < 28) {
            xx = -130.55095 + (((tickAnim - 5) / 23) * (-123.75604-(-130.55095)));
            yy = 41.73771 + (((tickAnim - 5) / 23) * (40.39312-(41.73771)));
            zz = 218.26972 + (((tickAnim - 5) / 23) * (225.14737-(218.26972)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -123.75604 + (((tickAnim - 28) / 2) * (-135.64814-(-123.75604)));
            yy = 40.39312 + (((tickAnim - 28) / 2) * (44.00135-(40.39312)));
            zz = 225.14737 + (((tickAnim - 28) / 2) * (212.62085-(225.14737)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -135.64814 + (((tickAnim - 30) / 12) * (-139.79602-(-135.64814)));
            yy = 44.00135 + (((tickAnim - 30) / 12) * (44.65217-(44.00135)));
            zz = 212.62085 + (((tickAnim - 30) / 12) * (208.16953-(212.62085)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -139.79602 + (((tickAnim - 42) / 8) * (-121.41336-(-139.79602)));
            yy = 44.65217 + (((tickAnim - 42) / 8) * (37.02788-(44.65217)));
            zz = 208.16953 + (((tickAnim - 42) / 8) * (228.55189-(208.16953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -95.5114 + (((tickAnim - 0) / 5) * (-100.59473-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 0) / 5) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 0) / 5) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -100.59473 + (((tickAnim - 5) / 8) * (-98.02731-(-100.59473)));
            yy = 34.18897 + (((tickAnim - 5) / 8) * (29.20595-(34.18897)));
            zz = -97.725 + (((tickAnim - 5) / 8) * (-100.71387-(-97.725)));
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
            xx = -95.13636 + (((tickAnim - 45) / 5) * (-95.5114-(-95.13636)));
            yy = 34.18897 + (((tickAnim - 45) / 5) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 45) / 5) * (-97.725-(-97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 0) / 50) * (2.25-(2.25)));
            yy = 0.25 + (((tickAnim - 0) / 50) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 0) / 50) * (-3-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -121.41336 + (((tickAnim - 0) / 5) * (-130.55095-(-121.41336)));
            yy = -37.02788 + (((tickAnim - 0) / 5) * (-41.73771-(-37.02788)));
            zz = -228.55189 + (((tickAnim - 0) / 5) * (-218.26972-(-228.55189)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -130.55095 + (((tickAnim - 5) / 15) * (-128.52101-(-130.55095)));
            yy = -41.73771 + (((tickAnim - 5) / 15) * (-40.84132-(-41.73771)));
            zz = -218.26972 + (((tickAnim - 5) / 15) * (-222.85482-(-218.26972)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -128.52101 + (((tickAnim - 20) / 3) * (-135.49738-(-128.52101)));
            yy = -40.84132 + (((tickAnim - 20) / 3) * (-44.00816-(-40.84132)));
            zz = -222.85482 + (((tickAnim - 20) / 3) * (-211.70612-(-222.85482)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -135.49738 + (((tickAnim - 23) / 5) * (-134.95352-(-135.49738)));
            yy = -44.00816 + (((tickAnim - 23) / 5) * (-44.56457-(-44.00816)));
            zz = -211.70612 + (((tickAnim - 23) / 5) * (-210.78982-(-211.70612)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -134.95352 + (((tickAnim - 28) / 2) * (-129.28011-(-134.95352)));
            yy = -44.56457 + (((tickAnim - 28) / 2) * (-42.4164-(-44.56457)));
            zz = -210.78982 + (((tickAnim - 28) / 2) * (-219.27563-(-210.78982)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -129.28011 + (((tickAnim - 30) / 9) * (-127.96202-(-129.28011)));
            yy = -42.4164 + (((tickAnim - 30) / 9) * (-40.92464-(-42.4164)));
            zz = -219.27563 + (((tickAnim - 30) / 9) * (-223.2119-(-219.27563)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -127.96202 + (((tickAnim - 39) / 3) * (-131.05833-(-127.96202)));
            yy = -40.92464 + (((tickAnim - 39) / 3) * (-41.84905-(-40.92464)));
            zz = -223.2119 + (((tickAnim - 39) / 3) * (-222.51484-(-223.2119)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -131.05833 + (((tickAnim - 42) / 8) * (-121.41336-(-131.05833)));
            yy = -41.84905 + (((tickAnim - 42) / 8) * (-37.02788-(-41.84905)));
            zz = -222.51484 + (((tickAnim - 42) / 8) * (-228.55189-(-222.51484)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.49999 + (((tickAnim - 0) / 4) * (-8.32337-(2.49999)));
            yy = -67.5 + (((tickAnim - 0) / 4) * (-74.76614-(-67.5)));
            zz = 0.00003 + (((tickAnim - 0) / 4) * (1.69292-(0.00003)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = -8.32337 + (((tickAnim - 4) / 7) * (-9.57082-(-8.32337)));
            yy = -74.76614 + (((tickAnim - 4) / 7) * (-43.57444-(-74.76614)));
            zz = 1.69292 + (((tickAnim - 4) / 7) * (-4.538-(1.69292)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -9.57082 + (((tickAnim - 11) / 11) * (-13.15217-(-9.57082)));
            yy = -43.57444 + (((tickAnim - 11) / 11) * (-75.49785-(-43.57444)));
            zz = -4.538 + (((tickAnim - 11) / 11) * (1.73145-(-4.538)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = -13.15217 + (((tickAnim - 22) / 9) * (-2.00511-(-13.15217)));
            yy = -75.49785 + (((tickAnim - 22) / 9) * (-50.9483-(-75.49785)));
            zz = 1.73145 + (((tickAnim - 22) / 9) * (-3.16573-(1.73145)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -2.00511 + (((tickAnim - 31) / 7) * (-0.37438-(-2.00511)));
            yy = -50.9483 + (((tickAnim - 31) / 7) * (-71.98266-(-50.9483)));
            zz = -3.16573 + (((tickAnim - 31) / 7) * (1.32764-(-3.16573)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -0.37438 + (((tickAnim - 38) / 12) * (2.49999-(-0.37438)));
            yy = -71.98266 + (((tickAnim - 38) / 12) * (-67.5-(-71.98266)));
            zz = 1.32764 + (((tickAnim - 38) / 12) * (0.00003-(1.32764)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2 + (((tickAnim - 0) / 4) * (3-(2)));
            yy = -0.5 + (((tickAnim - 0) / 4) * (-1-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 3 + (((tickAnim - 4) / 7) * (3-(3)));
            yy = -1 + (((tickAnim - 4) / 7) * (-1.5-(-1)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 3 + (((tickAnim - 11) / 11) * (2-(3)));
            yy = -1.5 + (((tickAnim - 11) / 11) * (-0.5-(-1.5)));
            zz = 0 + (((tickAnim - 11) / 11) * (3-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 2 + (((tickAnim - 22) / 9) * (2-(2)));
            yy = -0.5 + (((tickAnim - 22) / 9) * (-1.5-(-0.5)));
            zz = 3 + (((tickAnim - 22) / 9) * (-2-(3)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 2 + (((tickAnim - 31) / 3) * (2.74-(2)));
            yy = -1.5 + (((tickAnim - 31) / 3) * (-1.24-(-1.5)));
            zz = -2 + (((tickAnim - 31) / 3) * (0-(-2)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 2.74 + (((tickAnim - 34) / 4) * (1.47-(2.74)));
            yy = -1.24 + (((tickAnim - 34) / 4) * (-0.97-(-1.24)));
            zz = 0 + (((tickAnim - 34) / 4) * (2-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.47 + (((tickAnim - 38) / 12) * (2-(1.47)));
            yy = -0.97 + (((tickAnim - 38) / 12) * (-0.5-(-0.97)));
            zz = 2 + (((tickAnim - 38) / 12) * (0-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 71.04414 + (((tickAnim - 0) / 3) * (117.86784-(71.04414)));
            yy = 102.09003 + (((tickAnim - 0) / 3) * (93.50775-(102.09003)));
            zz = 73.7627 + (((tickAnim - 0) / 3) * (128.82274-(73.7627)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 117.86784 + (((tickAnim - 3) / 9) * (110.56211-(117.86784)));
            yy = 93.50775 + (((tickAnim - 3) / 9) * (43.28349-(93.50775)));
            zz = 128.82274 + (((tickAnim - 3) / 9) * (109.94108-(128.82274)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 110.56211 + (((tickAnim - 12) / 6) * (89.22665-(110.56211)));
            yy = 43.28349 + (((tickAnim - 12) / 6) * (31.37796-(43.28349)));
            zz = 109.94108 + (((tickAnim - 12) / 6) * (81.97446-(109.94108)));
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
            xx = 21.3041 + (((tickAnim - 39) / 11) * (71.04414-(21.3041)));
            yy = 36.85453 + (((tickAnim - 39) / 11) * (102.09003-(36.85453)));
            zz = 26.6619 + (((tickAnim - 39) / 11) * (73.7627-(26.6619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 2.49999 + (((tickAnim - 0) / 9) * (-8.32337-(2.49999)));
            yy = 67.5 + (((tickAnim - 0) / 9) * (74.76614-(67.5)));
            zz = -0.00003 + (((tickAnim - 0) / 9) * (-1.69292-(-0.00003)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -8.32337 + (((tickAnim - 9) / 7) * (-9.57082-(-8.32337)));
            yy = 74.76614 + (((tickAnim - 9) / 7) * (43.57444-(74.76614)));
            zz = -1.69292 + (((tickAnim - 9) / 7) * (4.538-(-1.69292)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = -9.57082 + (((tickAnim - 16) / 11) * (-13.15217-(-9.57082)));
            yy = 43.57444 + (((tickAnim - 16) / 11) * (75.49785-(43.57444)));
            zz = 4.538 + (((tickAnim - 16) / 11) * (-1.73145-(4.538)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -13.15217 + (((tickAnim - 27) / 9) * (-2.00511-(-13.15217)));
            yy = 75.49785 + (((tickAnim - 27) / 9) * (50.9483-(75.49785)));
            zz = -1.73145 + (((tickAnim - 27) / 9) * (3.16573-(-1.73145)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -2.00511 + (((tickAnim - 36) / 7) * (-0.37438-(-2.00511)));
            yy = 50.9483 + (((tickAnim - 36) / 7) * (71.98266-(50.9483)));
            zz = 3.16573 + (((tickAnim - 36) / 7) * (-1.32764-(3.16573)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.37438 + (((tickAnim - 43) / 7) * (2.49999-(-0.37438)));
            yy = 71.98266 + (((tickAnim - 43) / 7) * (67.5-(71.98266)));
            zz = -1.32764 + (((tickAnim - 43) / 7) * (-0.00003-(-1.32764)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -2 + (((tickAnim - 0) / 9) * (-3-(-2)));
            yy = -0.5 + (((tickAnim - 0) / 9) * (-1-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -3 + (((tickAnim - 9) / 7) * (-3-(-3)));
            yy = -1 + (((tickAnim - 9) / 7) * (-1.5-(-1)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = -3 + (((tickAnim - 16) / 11) * (-2-(-3)));
            yy = -1.5 + (((tickAnim - 16) / 11) * (-0.5-(-1.5)));
            zz = 0 + (((tickAnim - 16) / 11) * (3-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -2 + (((tickAnim - 27) / 9) * (-2-(-2)));
            yy = -0.5 + (((tickAnim - 27) / 9) * (-1.5-(-0.5)));
            zz = 3 + (((tickAnim - 27) / 9) * (-2-(3)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -2 + (((tickAnim - 36) / 3) * (-2.74-(-2)));
            yy = -1.5 + (((tickAnim - 36) / 3) * (-1.24-(-1.5)));
            zz = -2 + (((tickAnim - 36) / 3) * (0-(-2)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -2.74 + (((tickAnim - 39) / 4) * (-1.47-(-2.74)));
            yy = -1.24 + (((tickAnim - 39) / 4) * (-0.97-(-1.24)));
            zz = 0 + (((tickAnim - 39) / 4) * (2-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -1.47 + (((tickAnim - 43) / 7) * (-2-(-1.47)));
            yy = -0.97 + (((tickAnim - 43) / 7) * (-0.5-(-0.97)));
            zz = 2 + (((tickAnim - 43) / 7) * (0-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 71.04414 + (((tickAnim - 0) / 8) * (117.86784-(71.04414)));
            yy = -102.09003 + (((tickAnim - 0) / 8) * (-93.50775-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 0) / 8) * (-128.82274-(-73.7627)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 117.86784 + (((tickAnim - 8) / 9) * (110.56211-(117.86784)));
            yy = -93.50775 + (((tickAnim - 8) / 9) * (-43.28349-(-93.50775)));
            zz = -128.82274 + (((tickAnim - 8) / 9) * (-109.94108-(-128.82274)));
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
            xx = 21.3041 + (((tickAnim - 44) / 6) * (71.04414-(21.3041)));
            yy = -36.85453 + (((tickAnim - 44) / 6) * (-102.09003-(-36.85453)));
            zz = -26.6619 + (((tickAnim - 44) / 6) * (-73.7627-(-26.6619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 7.5 + (((tickAnim - 0) / 50) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrodiechelys entity = (EntityPrehistoricFloraBrodiechelys) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-25.91607-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (2.11021-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-16.03189-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -25.91607 + (((tickAnim - 6) / 5) * (-10.20855-(-25.91607)));
            yy = 2.11021 + (((tickAnim - 6) / 5) * (5.40976-(2.11021)));
            zz = -16.03189 + (((tickAnim - 6) / 5) * (-24.7207-(-16.03189)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -10.20855 + (((tickAnim - 11) / 7) * (5.28775-(-10.20855)));
            yy = 5.40976 + (((tickAnim - 11) / 7) * (5.79735-(5.40976)));
            zz = -24.7207 + (((tickAnim - 11) / 7) * (-24.99651-(-24.7207)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 5.28775 + (((tickAnim - 18) / 3) * (8.44619-(5.28775)));
            yy = 5.79735 + (((tickAnim - 18) / 3) * (13.16925-(5.79735)));
            zz = -24.99651 + (((tickAnim - 18) / 3) * (-25.09866-(-24.99651)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 8.44619 + (((tickAnim - 21) / 2) * (3.3997-(8.44619)));
            yy = 13.16925 + (((tickAnim - 21) / 2) * (11.10394-(13.16925)));
            zz = -25.09866 + (((tickAnim - 21) / 2) * (-13.38289-(-25.09866)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 3.3997 + (((tickAnim - 23) / 4) * (-22.15567-(3.3997)));
            yy = 11.10394 + (((tickAnim - 23) / 4) * (2.66255-(11.10394)));
            zz = -13.38289 + (((tickAnim - 23) / 4) * (-9.21013-(-13.38289)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -22.15567 + (((tickAnim - 27) / 7) * (-4.15-(-22.15567)));
            yy = 2.66255 + (((tickAnim - 27) / 7) * (0.5-(2.66255)));
            zz = -9.21013 + (((tickAnim - 27) / 7) * (-1.73-(-9.21013)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -4.15 + (((tickAnim - 34) / 6) * (0-(-4.15)));
            yy = 0.5 + (((tickAnim - 34) / 6) * (0-(0.5)));
            zz = -1.73 + (((tickAnim - 34) / 6) * (0-(-1.73)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(5), tail.rotateAngleY + (float) Math.toRadians(-2.5), tail.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (36.37345-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-7.12331-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.43652-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 36.37345 + (((tickAnim - 6) / 5) * (11.64952-(36.37345)));
            yy = -7.12331 + (((tickAnim - 6) / 5) * (-8.87772-(-7.12331)));
            zz = -0.43652 + (((tickAnim - 6) / 5) * (-9.58098-(-0.43652)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 11.64952 + (((tickAnim - 11) / 3) * (-0.65004-(11.64952)));
            yy = -8.87772 + (((tickAnim - 11) / 3) * (-4.35098-(-8.87772)));
            zz = -9.58098 + (((tickAnim - 11) / 3) * (-24.6947-(-9.58098)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.65004 + (((tickAnim - 14) / 4) * (6.11937-(-0.65004)));
            yy = -4.35098 + (((tickAnim - 14) / 4) * (-6.00784-(-4.35098)));
            zz = -24.6947 + (((tickAnim - 14) / 4) * (-24.44267-(-24.6947)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 6.11937 + (((tickAnim - 18) / 3) * (0.51434-(6.11937)));
            yy = -6.00784 + (((tickAnim - 18) / 3) * (-5.869-(-6.00784)));
            zz = -24.44267 + (((tickAnim - 18) / 3) * (-10.00685-(-24.44267)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0.51434 + (((tickAnim - 21) / 6) * (47.29232-(0.51434)));
            yy = -5.869 + (((tickAnim - 21) / 6) * (-3.88687-(-5.869)));
            zz = -10.00685 + (((tickAnim - 21) / 6) * (-4.94866-(-10.00685)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 47.29232 + (((tickAnim - 27) / 7) * (8.87-(47.29232)));
            yy = -3.88687 + (((tickAnim - 27) / 7) * (-0.73-(-3.88687)));
            zz = -4.94866 + (((tickAnim - 27) / 7) * (-0.93-(-4.94866)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 8.87 + (((tickAnim - 34) / 6) * (0-(8.87)));
            yy = -0.73 + (((tickAnim - 34) / 6) * (0-(-0.73)));
            zz = -0.93 + (((tickAnim - 34) / 6) * (0-(-0.93)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 32.5 + (((tickAnim - 11) / 6) * (27.5-(32.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 27.5 + (((tickAnim - 17) / 1) * (-2.5-(27.5)));
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




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 17) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 17) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 17) / 6) * (0.2-(1)));
            zz = 1 + (((tickAnim - 17) / 6) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 23) / 9) * (1-(1)));
            yy = 0.2 + (((tickAnim - 23) / 9) * (1-(0.2)));
            zz = 1 + (((tickAnim - 23) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 17) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 17) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 17) / 6) * (0.2-(1)));
            zz = 1 + (((tickAnim - 17) / 6) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 23) / 9) * (1-(1)));
            yy = 0.2 + (((tickAnim - 23) / 9) * (1-(0.2)));
            zz = 1 + (((tickAnim - 23) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrodiechelys entity = (EntityPrehistoricFloraBrodiechelys) entitylivingbaseIn;
        int animCycle = 310;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (1.25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 1.25 + (((tickAnim - 8) / 0) * (0-(1.25)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (2.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 2.5 + (((tickAnim - 8) / 2) * (0-(2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -2.5 + (((tickAnim - 10) / 2) * (-1.66508-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.07269-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-2.49894-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -1.66508 + (((tickAnim - 12) / 3) * (0-(-1.66508)));
            yy = -0.07269 + (((tickAnim - 12) / 3) * (0-(-0.07269)));
            zz = -2.49894 + (((tickAnim - 12) / 3) * (0-(-2.49894)));
        }
        else if (tickAnim >= 15 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 15) / 275) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 275) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 275) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 294) {
            xx = 0 + (((tickAnim - 290) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 4) * (2.5-(0)));
        }
        else if (tickAnim >= 294 && tickAnim < 298) {
            xx = 0 + (((tickAnim - 294) / 4) * (2.5-(0)));
            yy = 0 + (((tickAnim - 294) / 4) * (0-(0)));
            zz = 2.5 + (((tickAnim - 294) / 4) * (1.07143-(2.5)));
        }
        else if (tickAnim >= 298 && tickAnim < 302) {
            xx = 2.5 + (((tickAnim - 298) / 4) * (-1.16667-(2.5)));
            yy = 0 + (((tickAnim - 298) / 4) * (0-(0)));
            zz = 1.07143 + (((tickAnim - 298) / 4) * (0.57143-(1.07143)));
        }
        else if (tickAnim >= 302 && tickAnim < 304) {
            xx = -1.16667 + (((tickAnim - 302) / 2) * (0.18333-(-1.16667)));
            yy = 0 + (((tickAnim - 302) / 2) * (0-(0)));
            zz = 0.57143 + (((tickAnim - 302) / 2) * (0.4-(0.57143)));
        }
        else if (tickAnim >= 304 && tickAnim < 310) {
            xx = 0.18333 + (((tickAnim - 304) / 6) * (0-(0.18333)));
            yy = 0 + (((tickAnim - 304) / 6) * (0-(0)));
            zz = 0.4 + (((tickAnim - 304) / 6) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25 + (((tickAnim - 5) / 5) * (10-(-25)));
            yy = 0 + (((tickAnim - 5) / 5) * (72.5-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = 10 + (((tickAnim - 10) / 280) * (10-(10)));
            yy = 72.5 + (((tickAnim - 10) / 280) * (72.5-(72.5)));
            zz = 0 + (((tickAnim - 10) / 280) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = 10 + (((tickAnim - 290) / 3) * (10-(10)));
            yy = 72.5 + (((tickAnim - 290) / 3) * (72.5-(72.5)));
            zz = 0 + (((tickAnim - 290) / 3) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 10 + (((tickAnim - 293) / 17) * (0-(10)));
            yy = 72.5 + (((tickAnim - 293) / 17) * (0-(72.5)));
            zz = 0 + (((tickAnim - 293) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 5) / 5) * (-0.45-(-1)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 10) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 280) * (0-(0)));
            zz = -0.45 + (((tickAnim - 10) / 280) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 290) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 3) * (0-(0)));
            zz = -0.45 + (((tickAnim - 290) / 3) * (-1-(-0.45)));
        }
        else if (tickAnim >= 293 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 293) / 17) * (0-(0)));
            zz = -1 + (((tickAnim - 293) / 17) * (0-(-1)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 5) / 3) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (57.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 57.5 + (((tickAnim - 8) / 2) * (21.5-(57.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 10) / 280) * (0-(0)));
            yy = 21.5 + (((tickAnim - 10) / 280) * (21.5-(21.5)));
            zz = 0 + (((tickAnim - 10) / 280) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 306) {
            xx = 0 + (((tickAnim - 290) / 16) * (-13.87198-(0)));
            yy = 21.5 + (((tickAnim - 290) / 16) * (-12.31454-(21.5)));
            zz = 0 + (((tickAnim - 290) / 16) * (5.94535-(0)));
        }
        else if (tickAnim >= 306 && tickAnim < 310) {
            xx = -13.87198 + (((tickAnim - 306) / 4) * (0-(-13.87198)));
            yy = -12.31454 + (((tickAnim - 306) / 4) * (0-(-12.31454)));
            zz = 5.94535 + (((tickAnim - 306) / 4) * (0-(5.94535)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (1.095-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0.3 + (((tickAnim - 5) / 3) * (2.06-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.095 + (((tickAnim - 8) / 2) * (0.15-(1.095)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 2.06 + (((tickAnim - 8) / 2) * (1.275-(2.06)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = 0.15 + (((tickAnim - 10) / 280) * (0.15-(0.15)));
            yy = 0 + (((tickAnim - 10) / 280) * (0-(0)));
            zz = 1.275 + (((tickAnim - 10) / 280) * (1.275-(1.275)));
        }
        else if (tickAnim >= 290 && tickAnim < 310) {
            xx = 0.15 + (((tickAnim - 290) / 20) * (0-(0.15)));
            yy = 0 + (((tickAnim - 290) / 20) * (0-(0)));
            zz = 1.275 + (((tickAnim - 290) / 20) * (0-(1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-95.5114-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-34.18897-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (97.725-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 290) {
            xx = -95.5114 + (((tickAnim - 5) / 285) * (-95.5114-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 5) / 285) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 5) / 285) * (97.725-(97.725)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = -95.5114 + (((tickAnim - 290) / 3) * (-95.5114-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 290) / 3) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 290) / 3) * (97.725-(97.725)));
        }
        else if (tickAnim >= 293 && tickAnim < 303) {
            xx = -95.5114 + (((tickAnim - 293) / 10) * (-95.5114-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 293) / 10) * (-34.18897-(-34.18897)));
            zz = 97.725 + (((tickAnim - 293) / 10) * (97.725-(97.725)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = -95.5114 + (((tickAnim - 303) / 7) * (0-(-95.5114)));
            yy = -34.18897 + (((tickAnim - 303) / 7) * (0-(-34.18897)));
            zz = 97.725 + (((tickAnim - 303) / 7) * (0-(97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.25 + (((tickAnim - 5) / 5) * (-6-(-2.25)));
            yy = 0.25 + (((tickAnim - 5) / 5) * (1-(0.25)));
            zz = -3 + (((tickAnim - 5) / 5) * (6-(-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = -6 + (((tickAnim - 10) / 280) * (-6-(-6)));
            yy = 1 + (((tickAnim - 10) / 280) * (1-(1)));
            zz = 6 + (((tickAnim - 10) / 280) * (6-(6)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = -6 + (((tickAnim - 290) / 3) * (-6-(-6)));
            yy = 1 + (((tickAnim - 290) / 3) * (1-(1)));
            zz = 6 + (((tickAnim - 290) / 3) * (6-(6)));
        }
        else if (tickAnim >= 293 && tickAnim < 303) {
            xx = -6 + (((tickAnim - 293) / 10) * (-2.25-(-6)));
            yy = 1 + (((tickAnim - 293) / 10) * (0.25-(1)));
            zz = 6 + (((tickAnim - 293) / 10) * (-3-(6)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = -2.25 + (((tickAnim - 303) / 7) * (0-(-2.25)));
            yy = 0.25 + (((tickAnim - 303) / 7) * (0-(0.25)));
            zz = -3 + (((tickAnim - 303) / 7) * (0-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.92117-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (15.30386-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-11.87542-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 290) {
            xx = -8.92117 + (((tickAnim - 5) / 285) * (-8.92117-(-8.92117)));
            yy = 15.30386 + (((tickAnim - 5) / 285) * (-15.30386-(15.30386)));
            zz = -11.87542 + (((tickAnim - 5) / 285) * (11.87542-(-11.87542)));
        }
        else if (tickAnim >= 290 && tickAnim < 298) {
            xx = -8.92117 + (((tickAnim - 290) / 8) * (-8.92117-(-8.92117)));
            yy = -15.30386 + (((tickAnim - 290) / 8) * (-15.30386-(-15.30386)));
            zz = 11.87542 + (((tickAnim - 290) / 8) * (11.87542-(11.87542)));
        }
        else if (tickAnim >= 298 && tickAnim < 310) {
            xx = -8.92117 + (((tickAnim - 298) / 12) * (0-(-8.92117)));
            yy = -15.30386 + (((tickAnim - 298) / 12) * (0-(-15.30386)));
            zz = 11.87542 + (((tickAnim - 298) / 12) * (0-(11.87542)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-95.5114-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (34.18897-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-97.725-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -95.5114 + (((tickAnim - 5) / 2) * (-95.5114-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 5) / 2) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 5) / 2) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 7 && tickAnim < 290) {
            xx = -95.5114 + (((tickAnim - 7) / 283) * (-95.5114-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 7) / 283) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 7) / 283) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = -95.5114 + (((tickAnim - 290) / 10) * (-95.5114-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 290) / 10) * (34.18897-(34.18897)));
            zz = -97.725 + (((tickAnim - 290) / 10) * (-97.725-(-97.725)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = -95.5114 + (((tickAnim - 300) / 10) * (0-(-95.5114)));
            yy = 34.18897 + (((tickAnim - 300) / 10) * (0-(34.18897)));
            zz = -97.725 + (((tickAnim - 300) / 10) * (0-(-97.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.25 + (((tickAnim - 5) / 2) * (2.25-(2.25)));
            yy = 0.25 + (((tickAnim - 5) / 2) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 5) / 2) * (-3-(-3)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 7) / 5) * (6-(2.25)));
            yy = 0.25 + (((tickAnim - 7) / 5) * (1-(0.25)));
            zz = -3 + (((tickAnim - 7) / 5) * (6-(-3)));
        }
        else if (tickAnim >= 12 && tickAnim < 290) {
            xx = 6 + (((tickAnim - 12) / 278) * (6-(6)));
            yy = 1 + (((tickAnim - 12) / 278) * (1-(1)));
            zz = 6 + (((tickAnim - 12) / 278) * (6-(6)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 6 + (((tickAnim - 290) / 10) * (2.25-(6)));
            yy = 1 + (((tickAnim - 290) / 10) * (0.25-(1)));
            zz = 6 + (((tickAnim - 290) / 10) * (-3-(6)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 2.25 + (((tickAnim - 300) / 10) * (0-(2.25)));
            yy = 0.25 + (((tickAnim - 300) / 10) * (0-(0.25)));
            zz = -3 + (((tickAnim - 300) / 10) * (0-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.92117-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-15.30386-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (11.87542-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -8.92117 + (((tickAnim - 5) / 2) * (-8.92117-(-8.92117)));
            yy = -15.30386 + (((tickAnim - 5) / 2) * (-15.30386-(-15.30386)));
            zz = 11.87542 + (((tickAnim - 5) / 2) * (11.87542-(11.87542)));
        }
        else if (tickAnim >= 7 && tickAnim < 290) {
            xx = -8.92117 + (((tickAnim - 7) / 283) * (-8.92117-(-8.92117)));
            yy = -15.30386 + (((tickAnim - 7) / 283) * (-15.30386-(-15.30386)));
            zz = 11.87542 + (((tickAnim - 7) / 283) * (11.87542-(11.87542)));
        }
        else if (tickAnim >= 290 && tickAnim < 298) {
            xx = -8.92117 + (((tickAnim - 290) / 8) * (-8.92117-(-8.92117)));
            yy = -15.30386 + (((tickAnim - 290) / 8) * (-15.30386-(-15.30386)));
            zz = 11.87542 + (((tickAnim - 290) / 8) * (11.87542-(11.87542)));
        }
        else if (tickAnim >= 298 && tickAnim < 310) {
            xx = -8.92117 + (((tickAnim - 298) / 12) * (0-(-8.92117)));
            yy = -15.30386 + (((tickAnim - 298) / 12) * (0-(-15.30386)));
            zz = 11.87542 + (((tickAnim - 298) / 12) * (0-(11.87542)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.49999-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-67.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.00003-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.49999 + (((tickAnim - 5) / 2) * (2.49999-(2.49999)));
            yy = -67.5 + (((tickAnim - 5) / 2) * (-67.5-(-67.5)));
            zz = 0.00003 + (((tickAnim - 5) / 2) * (0.00003-(0.00003)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 2.49999 + (((tickAnim - 7) / 3) * (0-(2.49999)));
            yy = -67.5 + (((tickAnim - 7) / 3) * (-27.5-(-67.5)));
            zz = 0.00003 + (((tickAnim - 7) / 3) * (0-(0.00003)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 10) / 280) * (0-(0)));
            yy = -27.5 + (((tickAnim - 10) / 280) * (-27.5-(-27.5)));
            zz = 0 + (((tickAnim - 10) / 280) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (2.49999-(0)));
            yy = -27.5 + (((tickAnim - 290) / 10) * (-67.5-(-27.5)));
            zz = 0 + (((tickAnim - 290) / 10) * (0.00003-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 2.49999 + (((tickAnim - 300) / 10) * (0-(2.49999)));
            yy = -67.5 + (((tickAnim - 300) / 10) * (0-(-67.5)));
            zz = 0.00003 + (((tickAnim - 300) / 10) * (0-(0.00003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2 + (((tickAnim - 5) / 2) * (2-(2)));
            yy = -0.5 + (((tickAnim - 5) / 2) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 2 + (((tickAnim - 7) / 3) * (-5-(2)));
            yy = -0.5 + (((tickAnim - 7) / 3) * (1-(-0.5)));
            zz = 0 + (((tickAnim - 7) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = -5 + (((tickAnim - 10) / 280) * (-5-(-5)));
            yy = 1 + (((tickAnim - 10) / 280) * (1-(1)));
            zz = -5 + (((tickAnim - 10) / 280) * (-5-(-5)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = -5 + (((tickAnim - 290) / 10) * (2-(-5)));
            yy = 1 + (((tickAnim - 290) / 10) * (-0.5-(1)));
            zz = -5 + (((tickAnim - 290) / 10) * (0-(-5)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 2 + (((tickAnim - 300) / 10) * (0-(2)));
            yy = -0.5 + (((tickAnim - 300) / 10) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 300) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (71.04414-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (102.09003-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (73.7627-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 71.04414 + (((tickAnim - 5) / 2) * (71.04414-(71.04414)));
            yy = 102.09003 + (((tickAnim - 5) / 2) * (102.09003-(102.09003)));
            zz = 73.7627 + (((tickAnim - 5) / 2) * (73.7627-(73.7627)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 71.04414 + (((tickAnim - 7) / 3) * (0-(71.04414)));
            yy = 102.09003 + (((tickAnim - 7) / 3) * (90-(102.09003)));
            zz = 73.7627 + (((tickAnim - 7) / 3) * (0-(73.7627)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 10) / 280) * (0-(0)));
            yy = 90 + (((tickAnim - 10) / 280) * (90-(90)));
            zz = 0 + (((tickAnim - 10) / 280) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (71.04414-(0)));
            yy = 90 + (((tickAnim - 290) / 10) * (102.09003-(90)));
            zz = 0 + (((tickAnim - 290) / 10) * (73.7627-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 71.04414 + (((tickAnim - 300) / 10) * (0-(71.04414)));
            yy = 102.09003 + (((tickAnim - 300) / 10) * (0-(102.09003)));
            zz = 73.7627 + (((tickAnim - 300) / 10) * (0-(73.7627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.49999-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (67.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.00003-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2.49999 + (((tickAnim - 5) / 4) * (0-(2.49999)));
            yy = 67.5 + (((tickAnim - 5) / 4) * (27.5-(67.5)));
            zz = -0.00003 + (((tickAnim - 5) / 4) * (0-(-0.00003)));
        }
        else if (tickAnim >= 9 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 9) / 281) * (0-(0)));
            yy = 27.5 + (((tickAnim - 9) / 281) * (27.5-(27.5)));
            zz = 0 + (((tickAnim - 9) / 281) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (2.49999-(0)));
            yy = 27.5 + (((tickAnim - 290) / 10) * (67.5-(27.5)));
            zz = 0 + (((tickAnim - 290) / 10) * (-0.00003-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 2.49999 + (((tickAnim - 300) / 10) * (0-(2.49999)));
            yy = 67.5 + (((tickAnim - 300) / 10) * (0-(67.5)));
            zz = -0.00003 + (((tickAnim - 300) / 10) * (0-(-0.00003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -2 + (((tickAnim - 5) / 4) * (5-(-2)));
            yy = -0.5 + (((tickAnim - 5) / 4) * (1-(-0.5)));
            zz = 0 + (((tickAnim - 5) / 4) * (-5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 290) {
            xx = 5 + (((tickAnim - 9) / 281) * (5-(5)));
            yy = 1 + (((tickAnim - 9) / 281) * (1-(1)));
            zz = -5 + (((tickAnim - 9) / 281) * (-5-(-5)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 5 + (((tickAnim - 290) / 10) * (-2-(5)));
            yy = 1 + (((tickAnim - 290) / 10) * (-0.5-(1)));
            zz = -5 + (((tickAnim - 290) / 10) * (0-(-5)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = -2 + (((tickAnim - 300) / 10) * (0-(-2)));
            yy = -0.5 + (((tickAnim - 300) / 10) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 300) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (71.04414-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-102.09003-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-73.7627-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 71.04414 + (((tickAnim - 5) / 4) * (0-(71.04414)));
            yy = -102.09003 + (((tickAnim - 5) / 4) * (-90-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 5) / 4) * (0-(-73.7627)));
        }
        else if (tickAnim >= 9 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 9) / 281) * (0-(0)));
            yy = -90 + (((tickAnim - 9) / 281) * (-90-(-90)));
            zz = 0 + (((tickAnim - 9) / 281) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (71.04414-(0)));
            yy = -90 + (((tickAnim - 290) / 10) * (-102.09003-(-90)));
            zz = 0 + (((tickAnim - 290) / 10) * (-73.7627-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 71.04414 + (((tickAnim - 300) / 10) * (0-(71.04414)));
            yy = -102.09003 + (((tickAnim - 300) / 10) * (0-(-102.09003)));
            zz = -73.7627 + (((tickAnim - 300) / 10) * (0-(-73.7627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 5) / 5) * (0-(-5)));
            yy = 10 + (((tickAnim - 5) / 5) * (-107.5-(10)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 10) / 280) * (0-(0)));
            yy = -107.5 + (((tickAnim - 10) / 280) * (-107.5-(-107.5)));
            zz = 0 + (((tickAnim - 10) / 280) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 294) {
            xx = 0 + (((tickAnim - 290) / 4) * (0-(0)));
            yy = -107.5 + (((tickAnim - 290) / 4) * (-84.06-(-107.5)));
            zz = 0 + (((tickAnim - 290) / 4) * (0-(0)));
        }
        else if (tickAnim >= 294 && tickAnim < 298) {
            xx = 0 + (((tickAnim - 294) / 4) * (-7.5-(0)));
            yy = -84.06 + (((tickAnim - 294) / 4) * (-42.44182-(-84.06)));
            zz = 0 + (((tickAnim - 294) / 4) * (0-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 303) {
            xx = -7.5 + (((tickAnim - 298) / 5) * (-2.5-(-7.5)));
            yy = -42.44182 + (((tickAnim - 298) / 5) * (7.5-(-42.44182)));
            zz = 0 + (((tickAnim - 298) / 5) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 310) {
            xx = -2.5 + (((tickAnim - 303) / 7) * (0-(-2.5)));
            yy = 7.5 + (((tickAnim - 303) / 7) * (0-(7.5)));
            zz = 0 + (((tickAnim - 303) / 7) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 10 + (((tickAnim - 5) / 2) * (19.17-(10)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 19.17 + (((tickAnim - 7) / 3) * (-70-(19.17)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 10) / 280) * (0-(0)));
            yy = -70 + (((tickAnim - 10) / 280) * (-70-(-70)));
            zz = 0 + (((tickAnim - 10) / 280) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 290) / 13) * (0-(0)));
            yy = -70 + (((tickAnim - 290) / 13) * (-7.5-(-70)));
            zz = 0 + (((tickAnim - 290) / 13) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 303) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 303) / 5) * (13.44-(-7.5)));
            zz = 0 + (((tickAnim - 303) / 5) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 308) / 2) * (0-(0)));
            yy = 13.44 + (((tickAnim - 308) / 2) * (0-(13.44)));
            zz = 0 + (((tickAnim - 308) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 7.5 + (((tickAnim - 5) / 2) * (28.33-(7.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 28.33 + (((tickAnim - 7) / 3) * (-5-(28.33)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 10) / 280) * (0-(0)));
            yy = -5 + (((tickAnim - 10) / 280) * (-5-(-5)));
            zz = 0 + (((tickAnim - 10) / 280) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 290) / 13) * (0-(0)));
            yy = -5 + (((tickAnim - 290) / 13) * (-7.5-(-5)));
            zz = 0 + (((tickAnim - 290) / 13) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 303) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 303) / 5) * (9.38-(-7.5)));
            zz = 0 + (((tickAnim - 303) / 5) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 308) / 2) * (0-(0)));
            yy = 9.38 + (((tickAnim - 308) / 2) * (0-(9.38)));
            zz = 0 + (((tickAnim - 308) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrodiechelys entity = (EntityPrehistoricFloraBrodiechelys) entitylivingbaseIn;
        int animCycle = 480;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.625-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = 2.25 + (((tickAnim - 8) / 56) * (2.25-(2.25)));
            yy = 0.25 + (((tickAnim - 8) / 56) * (0.25-(0.25)));
            zz = 0.625 + (((tickAnim - 8) / 56) * (0.625-(0.625)));
        }
        else if (tickAnim >= 64 && tickAnim < 398) {
            xx = 2.25 + (((tickAnim - 64) / 334) * (2.25-(2.25)));
            yy = 0.25 + (((tickAnim - 64) / 334) * (0.25-(0.25)));
            zz = 0.625 + (((tickAnim - 64) / 334) * (0.625-(0.625)));
        }
        else if (tickAnim >= 398 && tickAnim < 470) {
            xx = 2.25 + (((tickAnim - 398) / 72) * (0-(2.25)));
            yy = 0.25 + (((tickAnim - 398) / 72) * (0-(0.25)));
            zz = 0.625 + (((tickAnim - 398) / 72) * (0-(0.625)));
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
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = -2 + (((tickAnim - 8) / 56) * (-2-(-2)));
            yy = -0.5 + (((tickAnim - 8) / 56) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 56) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 90) {
            xx = -2 + (((tickAnim - 64) / 26) * (0-(-2)));
            yy = -0.5 + (((tickAnim - 64) / 26) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 64) / 26) * (3-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 398) {
            xx = 0 + (((tickAnim - 90) / 308) * (0-(0)));
            yy = -0.5 + (((tickAnim - 90) / 308) * (-0.5-(-0.5)));
            zz = 3 + (((tickAnim - 90) / 308) * (3-(3)));
        }
        else if (tickAnim >= 398 && tickAnim < 416) {
            xx = 0 + (((tickAnim - 398) / 18) * (-2-(0)));
            yy = -0.5 + (((tickAnim - 398) / 18) * (-0.5-(-0.5)));
            zz = 3 + (((tickAnim - 398) / 18) * (0-(3)));
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
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.625-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = -2.25 + (((tickAnim - 8) / 56) * (-2.25-(-2.25)));
            yy = 0.25 + (((tickAnim - 8) / 56) * (0.25-(0.25)));
            zz = -0.625 + (((tickAnim - 8) / 56) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 64 && tickAnim < 398) {
            xx = -2.25 + (((tickAnim - 64) / 334) * (-2.25-(-2.25)));
            yy = 0.25 + (((tickAnim - 64) / 334) * (0.25-(0.25)));
            zz = -0.625 + (((tickAnim - 64) / 334) * (0.625-(-0.625)));
        }
        else if (tickAnim >= 398 && tickAnim < 470) {
            xx = -2.25 + (((tickAnim - 398) / 72) * (0-(-2.25)));
            yy = 0.25 + (((tickAnim - 398) / 72) * (0-(0.25)));
            zz = 0.625 + (((tickAnim - 398) / 72) * (0-(0.625)));
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
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




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
            yy = 0 + (((tickAnim - 0) / 8) * (-67.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.00003-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 79) {
            xx = 2.49999 + (((tickAnim - 8) / 71) * (2.49999-(2.49999)));
            yy = -67.5 + (((tickAnim - 8) / 71) * (-67.5-(-67.5)));
            zz = 0.00003 + (((tickAnim - 8) / 71) * (0.00003-(0.00003)));
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
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 79) {
            xx = 2 + (((tickAnim - 8) / 71) * (2-(2)));
            yy = -0.5 + (((tickAnim - 8) / 71) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 71) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 113) {
            xx = 2 + (((tickAnim - 79) / 34) * (0-(2)));
            yy = -0.5 + (((tickAnim - 79) / 34) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 79) / 34) * (3-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 415) {
            xx = 0 + (((tickAnim - 113) / 302) * (0-(0)));
            yy = -0.5 + (((tickAnim - 113) / 302) * (-0.5-(-0.5)));
            zz = 3 + (((tickAnim - 113) / 302) * (3-(3)));
        }
        else if (tickAnim >= 415 && tickAnim < 432) {
            xx = 0 + (((tickAnim - 415) / 17) * (2-(0)));
            yy = -0.5 + (((tickAnim - 415) / 17) * (-0.5-(-0.5)));
            zz = 3 + (((tickAnim - 415) / 17) * (0-(3)));
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
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




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
            yy = 0 + (((tickAnim - 0) / 8) * (7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 8) / 56) * (0-(0)));
            yy = 7.5 + (((tickAnim - 8) / 56) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 8) / 56) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 64) / 24) * (0-(0)));
            yy = 7.5 + (((tickAnim - 64) / 24) * (9.55-(7.5)));
            zz = 0 + (((tickAnim - 64) / 24) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 88) / 23) * (0-(0)));
            yy = 9.55 + (((tickAnim - 88) / 23) * (-15-(9.55)));
            zz = 0 + (((tickAnim - 88) / 23) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 398) {
            xx = 0 + (((tickAnim - 111) / 287) * (0-(0)));
            yy = -15 + (((tickAnim - 111) / 287) * (-15-(-15)));
            zz = 0 + (((tickAnim - 111) / 287) * (0-(0)));
        }
        else if (tickAnim >= 398 && tickAnim < 408) {
            xx = 0 + (((tickAnim - 398) / 10) * (0-(0)));
            yy = -15 + (((tickAnim - 398) / 10) * (-20-(-15)));
            zz = 0 + (((tickAnim - 398) / 10) * (0-(0)));
        }
        else if (tickAnim >= 408 && tickAnim < 415) {
            xx = 0 + (((tickAnim - 408) / 7) * (0-(0)));
            yy = -20 + (((tickAnim - 408) / 7) * (17.5-(-20)));
            zz = 0 + (((tickAnim - 408) / 7) * (0-(0)));
        }
        else if (tickAnim >= 415 && tickAnim < 431) {
            xx = 0 + (((tickAnim - 415) / 16) * (0-(0)));
            yy = 17.5 + (((tickAnim - 415) / 16) * (7.5-(17.5)));
            zz = 0 + (((tickAnim - 415) / 16) * (0-(0)));
        }
        else if (tickAnim >= 431 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 431) / 39) * (0-(0)));
            yy = 7.5 + (((tickAnim - 431) / 39) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 431) / 39) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 470) / 10) * (0-(0)));
            yy = 7.5 + (((tickAnim - 470) / 10) * (0-(7.5)));
            zz = 0 + (((tickAnim - 470) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.eye1.setScale((float)xx, (float)yy, (float)zz);




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

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBrodiechelys entity = (EntityPrehistoricFloraBrodiechelys) entitylivingbaseIn;
        int animCycle = 5;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 2.5 + (((tickAnim - 0) / 1) * (-0.03777-(2.5)));
            yy = -12.5 + (((tickAnim - 0) / 1) * (-3.35359-(-12.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (7.5216-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.03777 + (((tickAnim - 1) / 1) * (-1.98984-(-0.03777)));
            yy = -3.35359 + (((tickAnim - 1) / 1) * (5.81106-(-3.35359)));
            zz = 7.5216 + (((tickAnim - 1) / 1) * (5.02589-(7.5216)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -1.98984 + (((tickAnim - 2) / 1) * (2.5-(-1.98984)));
            yy = 5.81106 + (((tickAnim - 2) / 1) * (15-(5.81106)));
            zz = 5.02589 + (((tickAnim - 2) / 1) * (0-(5.02589)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 3) / 0) * (-0.36592-(2.5)));
            yy = 15 + (((tickAnim - 3) / 0) * (5.82968-(15)));
            zz = 0 + (((tickAnim - 3) / 0) * (-7.53036-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.36592 + (((tickAnim - 3) / 1) * (-2.20916-(-0.36592)));
            yy = 5.82968 + (((tickAnim - 3) / 1) * (-3.32063-(5.82968)));
            zz = -7.53036 + (((tickAnim - 3) / 1) * (-5.00843-(-7.53036)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -2.20916 + (((tickAnim - 4) / 1) * (2.5-(-2.20916)));
            yy = -3.32063 + (((tickAnim - 4) / 1) * (-12.5-(-3.32063)));
            zz = -5.00843 + (((tickAnim - 4) / 1) * (0-(-5.00843)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 2 + (((tickAnim - 0) / 1) * (3-(2)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 3 + (((tickAnim - 1) / 2) * (2-(3)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2 + (((tickAnim - 3) / 0) * (3-(2)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 3 + (((tickAnim - 3) / 2) * (2-(3)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 12.5 + (((tickAnim - 0) / 3) * (-12.5-(12.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -12.5 + (((tickAnim - 3) / 2) * (12.5-(-12.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 126.38104 + (((tickAnim - 0) / 2) * (9.62701-(126.38104)));
            yy = 10.07039 + (((tickAnim - 0) / 2) * (18.3568-(10.07039)));
            zz = -120.28434 + (((tickAnim - 0) / 2) * (-40.09478-(-120.28434)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 9.62701 + (((tickAnim - 2) / 1) * (7.5-(9.62701)));
            yy = 18.3568 + (((tickAnim - 2) / 1) * (22.5-(18.3568)));
            zz = -40.09478 + (((tickAnim - 2) / 1) * (0-(-40.09478)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 3) / 2) * (126.38104-(7.5)));
            yy = 22.5 + (((tickAnim - 3) / 2) * (10.07039-(22.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (-120.28434-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.2137 + (((tickAnim - 0) / 3) * (2.16903-(-3.2137)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -1.89472 + (((tickAnim - 0) / 3) * (-0.54342-(-1.89472)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.16903 + (((tickAnim - 3) / 1) * (-4.39311-(2.16903)));
            yy = 0 + (((tickAnim - 3) / 1) * (0.26011-(0)));
            zz = -0.54342 + (((tickAnim - 3) / 1) * (-1.13509-(-0.54342)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -4.39311 + (((tickAnim - 4) / 1) * (-3.2137-(-4.39311)));
            yy = 0.26011 + (((tickAnim - 4) / 1) * (0-(0.26011)));
            zz = -1.13509 + (((tickAnim - 4) / 1) * (-1.89472-(-1.13509)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -42.5 + (((tickAnim - 3) / 2) * (0-(-42.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 0) / 3) * (126.38104-(7.5)));
            yy = -22.5 + (((tickAnim - 0) / 3) * (-10.07039-(-22.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (120.28434-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 126.38104 + (((tickAnim - 3) / 1) * (9.62701-(126.38104)));
            yy = -10.07039 + (((tickAnim - 3) / 1) * (-18.3568-(-10.07039)));
            zz = 120.28434 + (((tickAnim - 3) / 1) * (40.09478-(120.28434)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 9.62701 + (((tickAnim - 4) / 1) * (7.5-(9.62701)));
            yy = -18.3568 + (((tickAnim - 4) / 1) * (-22.5-(-18.3568)));
            zz = 40.09478 + (((tickAnim - 4) / 1) * (0-(40.09478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.16903 + (((tickAnim - 0) / 2) * (4.39311-(-2.16903)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.26011-(0)));
            zz = -0.54342 + (((tickAnim - 0) / 2) * (-1.13509-(-0.54342)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 4.39311 + (((tickAnim - 2) / 1) * (3.2137-(4.39311)));
            yy = 0.26011 + (((tickAnim - 2) / 1) * (0-(0.26011)));
            zz = -1.13509 + (((tickAnim - 2) / 1) * (-1.89472-(-1.13509)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.2137 + (((tickAnim - 3) / 2) * (-2.16903-(3.2137)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -1.89472 + (((tickAnim - 3) / 2) * (-0.54342-(-1.89472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -42.5 + (((tickAnim - 1) / 2) * (0-(-42.5)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (7.5-(-17.5)));
            yy = 12.5 + (((tickAnim - 0) / 3) * (-65-(12.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 3) / 1) * (-7.5-(7.5)));
            yy = -65 + (((tickAnim - 3) / 1) * (-13.33333-(-65)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -7.5 + (((tickAnim - 4) / 1) * (-17.5-(-7.5)));
            yy = -13.33333 + (((tickAnim - 4) / 1) * (12.5-(-13.33333)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.31143 + (((tickAnim - 0) / 3) * (-0.1059-(-1.31143)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -5.86026 + (((tickAnim - 0) / 3) * (5.09792-(-5.86026)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.1059 + (((tickAnim - 3) / 1) * (-1.00409-(-0.1059)));
            yy = 0 + (((tickAnim - 3) / 1) * (1.00505-(0)));
            zz = 5.09792 + (((tickAnim - 3) / 1) * (-2.71482-(5.09792)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -1.00409 + (((tickAnim - 4) / 1) * (-1.31143-(-1.00409)));
            yy = 1.00505 + (((tickAnim - 4) / 1) * (0-(1.00505)));
            zz = -2.71482 + (((tickAnim - 4) / 1) * (-5.86026-(-2.71482)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 69.51339 + (((tickAnim - 0) / 3) * (30.93427-(69.51339)));
            yy = 86.16978 + (((tickAnim - 0) / 3) * (65.09968-(86.16978)));
            zz = 75.45581 + (((tickAnim - 0) / 3) * (31.95265-(75.45581)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 30.93427 + (((tickAnim - 3) / 1) * (90.02106-(30.93427)));
            yy = 65.09968 + (((tickAnim - 3) / 1) * (84.30399-(65.09968)));
            zz = 31.95265 + (((tickAnim - 3) / 1) * (99.37862-(31.95265)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 90.02106 + (((tickAnim - 4) / 1) * (69.51339-(90.02106)));
            yy = 84.30399 + (((tickAnim - 4) / 1) * (86.16978-(84.30399)));
            zz = 99.37862 + (((tickAnim - 4) / 1) * (75.45581-(99.37862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 0) / 2) * (-7.5-(7.5)));
            yy = 65 + (((tickAnim - 0) / 2) * (13.33333-(65)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7.5 + (((tickAnim - 2) / 1) * (-17.5-(-7.5)));
            yy = 13.33333 + (((tickAnim - 2) / 1) * (-12.5-(13.33333)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -17.5 + (((tickAnim - 3) / 2) * (7.5-(-17.5)));
            yy = -12.5 + (((tickAnim - 3) / 2) * (65-(-12.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.1059 + (((tickAnim - 0) / 2) * (1.00409-(0.1059)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.00505-(0)));
            zz = 5.09792 + (((tickAnim - 0) / 2) * (-2.71482-(5.09792)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.00409 + (((tickAnim - 2) / 1) * (1.31143-(1.00409)));
            yy = 1.00505 + (((tickAnim - 2) / 1) * (0-(1.00505)));
            zz = -2.71482 + (((tickAnim - 2) / 1) * (-5.86026-(-2.71482)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.31143 + (((tickAnim - 3) / 2) * (0.1059-(1.31143)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -5.86026 + (((tickAnim - 3) / 2) * (5.09792-(-5.86026)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 30.93427 + (((tickAnim - 0) / 2) * (90.02106-(30.93427)));
            yy = -65.09968 + (((tickAnim - 0) / 2) * (-84.30399-(-65.09968)));
            zz = -31.95265 + (((tickAnim - 0) / 2) * (-99.37862-(-31.95265)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 90.02106 + (((tickAnim - 2) / 1) * (69.51339-(90.02106)));
            yy = -84.30399 + (((tickAnim - 2) / 1) * (-86.16978-(-84.30399)));
            zz = -99.37862 + (((tickAnim - 2) / 1) * (-75.45581-(-99.37862)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 69.51339 + (((tickAnim - 3) / 2) * (30.93427-(69.51339)));
            yy = -86.16978 + (((tickAnim - 3) / 2) * (-65.09968-(-86.16978)));
            zz = -75.45581 + (((tickAnim - 3) / 2) * (-31.95265-(-75.45581)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-10), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1440-30))*10), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1440-30*2))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1440-30*3))*10), tail3.rotateAngleZ + (float) Math.toRadians(0));



    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBrodiechelys entity = (EntityPrehistoricFloraBrodiechelys) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.7 + (((tickAnim - 0) / 3) * (-0.571-(0.7)));
            yy = 1.3 + (((tickAnim - 0) / 3) * (1.11533-(1.3)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.9302-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -0.571 + (((tickAnim - 3) / 7) * (0.9-(-0.571)));
            yy = 1.11533 + (((tickAnim - 3) / 7) * (0.2-(1.11533)));
            zz = 2.9302 + (((tickAnim - 3) / 7) * (-0.2-(2.9302)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0.9 + (((tickAnim - 10) / 7) * (1-(0.9)));
            yy = 0.2 + (((tickAnim - 10) / 7) * (-1-(0.2)));
            zz = -0.2 + (((tickAnim - 10) / 7) * (1.03333-(-0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 17) / 3) * (0.64262-(1)));
            yy = -1 + (((tickAnim - 17) / 3) * (-1.3293-(-1)));
            zz = 1.03333 + (((tickAnim - 17) / 3) * (2.20049-(1.03333)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.64262 + (((tickAnim - 20) / 3) * (-0.61736-(0.64262)));
            yy = -1.3293 + (((tickAnim - 20) / 3) * (-0.98938-(-1.3293)));
            zz = 2.20049 + (((tickAnim - 20) / 3) * (-0.32991-(2.20049)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.61736 + (((tickAnim - 23) / 7) * (1.1-(-0.61736)));
            yy = -0.98938 + (((tickAnim - 23) / 7) * (0.2-(-0.98938)));
            zz = -0.32991 + (((tickAnim - 23) / 7) * (0-(-0.32991)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 1.1 + (((tickAnim - 30) / 7) * (1-(1.1)));
            yy = 0.2 + (((tickAnim - 30) / 7) * (1.2-(0.2)));
            zz = 0 + (((tickAnim - 30) / 7) * (-1.83333-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 37) / 3) * (0.7-(1)));
            yy = 1.2 + (((tickAnim - 37) / 3) * (1.3-(1.2)));
            zz = -1.83333 + (((tickAnim - 37) / 3) * (0-(-1.83333)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.4 + (((tickAnim - 0) / 3) * (1.85-(1.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 1.85 + (((tickAnim - 3) / 8) * (1.85-(1.85)));
            zz = -0.3 + (((tickAnim - 3) / 8) * (-0.5-(-0.3)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 1.85 + (((tickAnim - 11) / 9) * (1.4-(1.85)));
            zz = -0.5 + (((tickAnim - 11) / 9) * (0-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.4 + (((tickAnim - 20) / 3) * (1.85-(1.4)));
            zz = 0 + (((tickAnim - 20) / 3) * (-0.3-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 1.85 + (((tickAnim - 23) / 9) * (1.85-(1.85)));
            zz = -0.3 + (((tickAnim - 23) / 9) * (-0.5-(-0.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 1.85 + (((tickAnim - 32) / 8) * (1.4-(1.85)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 12.61298 + (((tickAnim - 0) / 13) * (27.49339-(12.61298)));
            yy = -28.26101 + (((tickAnim - 0) / 13) * (-4.28711-(-28.26101)));
            zz = 7.87381 + (((tickAnim - 0) / 13) * (26.7232-(7.87381)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 27.49339 + (((tickAnim - 13) / 5) * (54.9363-(27.49339)));
            yy = -4.28711 + (((tickAnim - 13) / 5) * (5.80822-(-4.28711)));
            zz = 26.7232 + (((tickAnim - 13) / 5) * (57.18838-(26.7232)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 54.9363 + (((tickAnim - 18) / 7) * (155.66277-(54.9363)));
            yy = 5.80822 + (((tickAnim - 18) / 7) * (17.41641-(5.80822)));
            zz = 57.18838 + (((tickAnim - 18) / 7) * (149.52066-(57.18838)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 155.66277 + (((tickAnim - 25) / 3) * (115.05495-(155.66277)));
            yy = 17.41641 + (((tickAnim - 25) / 3) * (6.96747-(17.41641)));
            zz = 149.52066 + (((tickAnim - 25) / 3) * (121.03305-(149.52066)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 115.05495 + (((tickAnim - 28) / 8) * (23.10365-(115.05495)));
            yy = 6.96747 + (((tickAnim - 28) / 8) * (-16.32696-(6.96747)));
            zz = 121.03305 + (((tickAnim - 28) / 8) * (23.94859-(121.03305)));
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
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1.33-(1)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.73-(0)));
            zz = -2 + (((tickAnim - 0) / 3) * (-1.31-(-2)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.33 + (((tickAnim - 3) / 5) * (1.75-(1.33)));
            yy = -0.73 + (((tickAnim - 3) / 5) * (-0.3-(-0.73)));
            zz = -1.31 + (((tickAnim - 3) / 5) * (-0.45-(-1.31)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 1.75 + (((tickAnim - 8) / 5) * (2.5-(1.75)));
            yy = -0.3 + (((tickAnim - 8) / 5) * (-0.5-(-0.3)));
            zz = -0.45 + (((tickAnim - 8) / 5) * (0.575-(-0.45)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 13) / 5) * (3.08-(2.5)));
            yy = -0.5 + (((tickAnim - 13) / 5) * (0.28-(-0.5)));
            zz = 0.575 + (((tickAnim - 13) / 5) * (-0.66-(0.575)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 3.08 + (((tickAnim - 18) / 2) * (3.25-(3.08)));
            yy = 0.28 + (((tickAnim - 18) / 2) * (0.5-(0.28)));
            zz = -0.66 + (((tickAnim - 18) / 2) * (-1.79-(-0.66)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 3.25 + (((tickAnim - 20) / 1) * (3.21-(3.25)));
            yy = 0.5 + (((tickAnim - 20) / 1) * (0.51-(0.5)));
            zz = -1.79 + (((tickAnim - 20) / 1) * (-2.05-(-1.79)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 3.21 + (((tickAnim - 21) / 2) * (3.13-(3.21)));
            yy = 0.51 + (((tickAnim - 21) / 2) * (0.53-(0.51)));
            zz = -2.05 + (((tickAnim - 21) / 2) * (-2.26-(-2.05)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 3.13 + (((tickAnim - 23) / 2) * (3-(3.13)));
            yy = 0.53 + (((tickAnim - 23) / 2) * (0.55-(0.53)));
            zz = -2.26 + (((tickAnim - 23) / 2) * (-1.54-(-2.26)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 25) / 3) * (2.24-(3)));
            yy = 0.55 + (((tickAnim - 25) / 3) * (1.06-(0.55)));
            zz = -1.54 + (((tickAnim - 25) / 3) * (-3.01-(-1.54)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 2.24 + (((tickAnim - 28) / 5) * (1.54-(2.24)));
            yy = 1.06 + (((tickAnim - 28) / 5) * (0.49-(1.06)));
            zz = -3.01 + (((tickAnim - 28) / 5) * (-2.45-(-3.01)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 1.54 + (((tickAnim - 33) / 3) * (0.98601-(1.54)));
            yy = 0.49 + (((tickAnim - 33) / 3) * (0.75028-(0.49)));
            zz = -2.45 + (((tickAnim - 33) / 3) * (-2.00909-(-2.45)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0.98601 + (((tickAnim - 36) / 4) * (1-(0.98601)));
            yy = 0.75028 + (((tickAnim - 36) / 4) * (0-(0.75028)));
            zz = -2.00909 + (((tickAnim - 36) / 4) * (-2-(-2.00909)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -26.26773 + (((tickAnim - 0) / 8) * (-29.43267-(-26.26773)));
            yy = 0.81202 + (((tickAnim - 0) / 8) * (-25.29572-(0.81202)));
            zz = 15.18509 + (((tickAnim - 0) / 8) * (17.05414-(15.18509)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -29.43267 + (((tickAnim - 8) / 5) * (-36.62783-(-29.43267)));
            yy = -25.29572 + (((tickAnim - 8) / 5) * (-26.11526-(-25.29572)));
            zz = 17.05414 + (((tickAnim - 8) / 5) * (20.37661-(17.05414)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -36.62783 + (((tickAnim - 13) / 12) * (-53.7789-(-36.62783)));
            yy = -26.11526 + (((tickAnim - 13) / 12) * (-40.06921-(-26.11526)));
            zz = 20.37661 + (((tickAnim - 13) / 12) * (71.50467-(20.37661)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -53.7789 + (((tickAnim - 25) / 5) * (46.21429-(-53.7789)));
            yy = -40.06921 + (((tickAnim - 25) / 5) * (8.27314-(-40.06921)));
            zz = 71.50467 + (((tickAnim - 25) / 5) * (14.73857-(71.50467)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 46.21429 + (((tickAnim - 30) / 5) * (-57.36607-(46.21429)));
            yy = 8.27314 + (((tickAnim - 30) / 5) * (10.88571-(8.27314)));
            zz = 14.73857 + (((tickAnim - 30) / 5) * (19.39286-(14.73857)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -57.36607 + (((tickAnim - 35) / 5) * (-26.26773-(-57.36607)));
            yy = 10.88571 + (((tickAnim - 35) / 5) * (0.81202-(10.88571)));
            zz = 19.39286 + (((tickAnim - 35) / 5) * (15.18509-(19.39286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 8.87974 + (((tickAnim - 0) / 8) * (10.7906-(8.87974)));
            yy = 21.5225 + (((tickAnim - 0) / 8) * (41.70109-(21.5225)));
            zz = -14.72195 + (((tickAnim - 0) / 8) * (-16.30482-(-14.72195)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 10.7906 + (((tickAnim - 8) / 9) * (-4.59605-(10.7906)));
            yy = 41.70109 + (((tickAnim - 8) / 9) * (20.08875-(41.70109)));
            zz = -16.30482 + (((tickAnim - 8) / 9) * (-16.28015-(-16.30482)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = -4.59605 + (((tickAnim - 17) / 23) * (8.87974-(-4.59605)));
            yy = 20.08875 + (((tickAnim - 17) / 23) * (21.5225-(20.08875)));
            zz = -16.28015 + (((tickAnim - 17) / 23) * (-14.72195-(-16.28015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-1-(0)));
            yy = -1 + (((tickAnim - 0) / 4) * (0-(-1)));
            zz = 0.5 + (((tickAnim - 0) / 4) * (-1-(0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -1 + (((tickAnim - 4) / 4) * (0-(-1)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = -1 + (((tickAnim - 4) / 4) * (-3-(-1)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = -3 + (((tickAnim - 8) / 9) * (-4-(-3)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (-1-(0)));
            zz = -4 + (((tickAnim - 17) / 23) * (0.5-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (25.15908-(0)));
            yy = -80 + (((tickAnim - 0) / 7) * (-63.1327-(-80)));
            zz = 0 + (((tickAnim - 0) / 7) * (-11.72763-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 25.15908 + (((tickAnim - 7) / 10) * (75.24678-(25.15908)));
            yy = -63.1327 + (((tickAnim - 7) / 10) * (-88.64505-(-63.1327)));
            zz = -11.72763 + (((tickAnim - 7) / 10) * (-68.72831-(-11.72763)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 75.24678 + (((tickAnim - 17) / 23) * (0-(75.24678)));
            yy = -88.64505 + (((tickAnim - 17) / 23) * (-80-(-88.64505)));
            zz = -68.72831 + (((tickAnim - 17) / 23) * (0-(-68.72831)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -11.12353 + (((tickAnim - 0) / 10) * (-13.55142-(-11.12353)));
            yy = -4.24305 + (((tickAnim - 0) / 10) * (1.36281-(-4.24305)));
            zz = 1.95155 + (((tickAnim - 0) / 10) * (0.78062-(1.95155)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -13.55142 + (((tickAnim - 10) / 7) * (-12.67-(-13.55142)));
            yy = 1.36281 + (((tickAnim - 10) / 7) * (4.1-(1.36281)));
            zz = 0.78062 + (((tickAnim - 10) / 7) * (0-(0.78062)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -12.67 + (((tickAnim - 17) / 3) * (-11.116-(-12.67)));
            yy = 4.1 + (((tickAnim - 17) / 3) * (4.27599-(4.1)));
            zz = 0 + (((tickAnim - 17) / 3) * (-1.82423-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -11.116 + (((tickAnim - 20) / 10) * (-13.6444-(-11.116)));
            yy = 4.27599 + (((tickAnim - 20) / 10) * (-0.80963-(4.27599)));
            zz = -1.82423 + (((tickAnim - 20) / 10) * (-0.72969-(-1.82423)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -13.6444 + (((tickAnim - 30) / 7) * (-12.83-(-13.6444)));
            yy = -0.80963 + (((tickAnim - 30) / 7) * (-3.2-(-0.80963)));
            zz = -0.72969 + (((tickAnim - 30) / 7) * (0-(-0.72969)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -12.83 + (((tickAnim - 37) / 3) * (-11.12353-(-12.83)));
            yy = -3.2 + (((tickAnim - 37) / 3) * (-4.24305-(-3.2)));
            zz = 0 + (((tickAnim - 37) / 3) * (1.95155-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 80.12 + (((tickAnim - 0) / 5) * (155.66277-(80.12)));
            yy = -8.71 + (((tickAnim - 0) / 5) * (-17.41641-(-8.71)));
            zz = -80.27 + (((tickAnim - 0) / 5) * (-149.52066-(-80.27)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 155.66277 + (((tickAnim - 5) / 3) * (115.05495-(155.66277)));
            yy = -17.41641 + (((tickAnim - 5) / 3) * (-6.96747-(-17.41641)));
            zz = -149.52066 + (((tickAnim - 5) / 3) * (-121.03305-(-149.52066)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 115.05495 + (((tickAnim - 8) / 8) * (23.10365-(115.05495)));
            yy = -6.96747 + (((tickAnim - 8) / 8) * (16.32696-(-6.96747)));
            zz = -121.03305 + (((tickAnim - 8) / 8) * (-23.94859-(-121.03305)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 23.10365 + (((tickAnim - 16) / 4) * (12.61298-(23.10365)));
            yy = 16.32696 + (((tickAnim - 16) / 4) * (28.26101-(16.32696)));
            zz = -23.94859 + (((tickAnim - 16) / 4) * (-7.87381-(-23.94859)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 12.61298 + (((tickAnim - 20) / 13) * (27.49339-(12.61298)));
            yy = 28.26101 + (((tickAnim - 20) / 13) * (4.28711-(28.26101)));
            zz = -7.87381 + (((tickAnim - 20) / 13) * (-26.7232-(-7.87381)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 27.49339 + (((tickAnim - 33) / 5) * (54.9363-(27.49339)));
            yy = 4.28711 + (((tickAnim - 33) / 5) * (-5.80822-(4.28711)));
            zz = -26.7232 + (((tickAnim - 33) / 5) * (-57.18838-(-26.7232)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 54.9363 + (((tickAnim - 38) / 2) * (80.12-(54.9363)));
            yy = -5.80822 + (((tickAnim - 38) / 2) * (-8.71-(-5.80822)));
            zz = -57.18838 + (((tickAnim - 38) / 2) * (-80.27-(-57.18838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -3.25 + (((tickAnim - 0) / 1) * (-3.21-(-3.25)));
            yy = 0.5 + (((tickAnim - 0) / 1) * (0.51-(0.5)));
            zz = -1.79 + (((tickAnim - 0) / 1) * (-2.05-(-1.79)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -3.21 + (((tickAnim - 1) / 2) * (-3.13-(-3.21)));
            yy = 0.51 + (((tickAnim - 1) / 2) * (0.53-(0.51)));
            zz = -2.05 + (((tickAnim - 1) / 2) * (-2.26-(-2.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.13 + (((tickAnim - 3) / 2) * (-3-(-3.13)));
            yy = 0.53 + (((tickAnim - 3) / 2) * (0.55-(0.53)));
            zz = -2.26 + (((tickAnim - 3) / 2) * (-1.54-(-2.26)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (-2.24-(-3)));
            yy = 0.55 + (((tickAnim - 5) / 3) * (1.06-(0.55)));
            zz = -1.54 + (((tickAnim - 5) / 3) * (-3.01-(-1.54)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -2.24 + (((tickAnim - 8) / 5) * (-1.54-(-2.24)));
            yy = 1.06 + (((tickAnim - 8) / 5) * (0.49-(1.06)));
            zz = -3.01 + (((tickAnim - 8) / 5) * (-2.45-(-3.01)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -1.54 + (((tickAnim - 13) / 3) * (-0.98601-(-1.54)));
            yy = 0.49 + (((tickAnim - 13) / 3) * (0.75028-(0.49)));
            zz = -2.45 + (((tickAnim - 13) / 3) * (-2.00909-(-2.45)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.98601 + (((tickAnim - 16) / 4) * (-1-(-0.98601)));
            yy = 0.75028 + (((tickAnim - 16) / 4) * (0-(0.75028)));
            zz = -2.00909 + (((tickAnim - 16) / 4) * (-2-(-2.00909)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -1 + (((tickAnim - 20) / 3) * (-1.33-(-1)));
            yy = 0 + (((tickAnim - 20) / 3) * (-0.73-(0)));
            zz = -2 + (((tickAnim - 20) / 3) * (-1.31-(-2)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -1.33 + (((tickAnim - 23) / 5) * (-1.75-(-1.33)));
            yy = -0.73 + (((tickAnim - 23) / 5) * (-0.3-(-0.73)));
            zz = -1.31 + (((tickAnim - 23) / 5) * (-0.45-(-1.31)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -1.75 + (((tickAnim - 28) / 5) * (-2.5-(-1.75)));
            yy = -0.3 + (((tickAnim - 28) / 5) * (-0.5-(-0.3)));
            zz = -0.45 + (((tickAnim - 28) / 5) * (0.575-(-0.45)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -2.5 + (((tickAnim - 33) / 5) * (-3.08-(-2.5)));
            yy = -0.5 + (((tickAnim - 33) / 5) * (0.28-(-0.5)));
            zz = 0.575 + (((tickAnim - 33) / 5) * (-0.66-(0.575)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -3.08 + (((tickAnim - 38) / 2) * (-3.25-(-3.08)));
            yy = 0.28 + (((tickAnim - 38) / 2) * (0.5-(0.28)));
            zz = -0.66 + (((tickAnim - 38) / 2) * (-1.79-(-0.66)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -46.92 + (((tickAnim - 0) / 5) * (-53.7789-(-46.92)));
            yy = 34.49 + (((tickAnim - 0) / 5) * (40.06921-(34.49)));
            zz = -51.05 + (((tickAnim - 0) / 5) * (-71.50467-(-51.05)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -53.7789 + (((tickAnim - 5) / 5) * (46.21429-(-53.7789)));
            yy = 40.06921 + (((tickAnim - 5) / 5) * (-8.27314-(40.06921)));
            zz = -71.50467 + (((tickAnim - 5) / 5) * (-14.73857-(-71.50467)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 46.21429 + (((tickAnim - 10) / 5) * (-57.36607-(46.21429)));
            yy = -8.27314 + (((tickAnim - 10) / 5) * (-10.88571-(-8.27314)));
            zz = -14.73857 + (((tickAnim - 10) / 5) * (-19.39286-(-14.73857)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -57.36607 + (((tickAnim - 15) / 5) * (-26.26773-(-57.36607)));
            yy = -10.88571 + (((tickAnim - 15) / 5) * (-0.81202-(-10.88571)));
            zz = -19.39286 + (((tickAnim - 15) / 5) * (-15.18509-(-19.39286)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -26.26773 + (((tickAnim - 20) / 8) * (-29.43267-(-26.26773)));
            yy = -0.81202 + (((tickAnim - 20) / 8) * (25.29572-(-0.81202)));
            zz = -15.18509 + (((tickAnim - 20) / 8) * (-17.05414-(-15.18509)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -29.43267 + (((tickAnim - 28) / 5) * (-36.62783-(-29.43267)));
            yy = 25.29572 + (((tickAnim - 28) / 5) * (26.11526-(25.29572)));
            zz = -17.05414 + (((tickAnim - 28) / 5) * (-20.37661-(-17.05414)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -36.62783 + (((tickAnim - 33) / 7) * (-46.92-(-36.62783)));
            yy = 26.11526 + (((tickAnim - 33) / 7) * (34.49-(26.11526)));
            zz = -20.37661 + (((tickAnim - 33) / 7) * (-51.05-(-20.37661)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -2.67 + (((tickAnim - 0) / 20) * (8.87974-(-2.67)));
            yy = -20.29 + (((tickAnim - 0) / 20) * (-21.5225-(-20.29)));
            zz = 16.06 + (((tickAnim - 0) / 20) * (14.72195-(16.06)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 8.87974 + (((tickAnim - 20) / 8) * (10.7906-(8.87974)));
            yy = -21.5225 + (((tickAnim - 20) / 8) * (-41.70109-(-21.5225)));
            zz = 14.72195 + (((tickAnim - 20) / 8) * (16.30482-(14.72195)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 10.7906 + (((tickAnim - 28) / 9) * (-4.59605-(10.7906)));
            yy = -41.70109 + (((tickAnim - 28) / 9) * (-20.08875-(-41.70109)));
            zz = 16.30482 + (((tickAnim - 28) / 9) * (16.28015-(16.30482)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -4.59605 + (((tickAnim - 37) / 3) * (-2.67-(-4.59605)));
            yy = -20.08875 + (((tickAnim - 37) / 3) * (-20.29-(-20.08875)));
            zz = 16.28015 + (((tickAnim - 37) / 3) * (16.06-(16.28015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.14 + (((tickAnim - 0) / 20) * (-1-(-0.14)));
            zz = -3.36 + (((tickAnim - 0) / 20) * (0.5-(-3.36)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (1-(0)));
            yy = -1 + (((tickAnim - 20) / 4) * (0-(-1)));
            zz = 0.5 + (((tickAnim - 20) / 4) * (-1-(0.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 24) / 4) * (0-(1)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = -1 + (((tickAnim - 24) / 4) * (-3-(-1)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = -3 + (((tickAnim - 28) / 9) * (-4-(-3)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (-0.14-(0)));
            zz = -4 + (((tickAnim - 37) / 3) * (-3.36-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 64.5 + (((tickAnim - 0) / 20) * (0-(64.5)));
            yy = 87.41 + (((tickAnim - 0) / 20) * (80-(87.41)));
            zz = 58.91 + (((tickAnim - 0) / 20) * (0-(58.91)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (25.15908-(0)));
            yy = 80 + (((tickAnim - 20) / 7) * (63.1327-(80)));
            zz = 0 + (((tickAnim - 20) / 7) * (11.72763-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 25.15908 + (((tickAnim - 27) / 10) * (75.24678-(25.15908)));
            yy = 63.1327 + (((tickAnim - 27) / 10) * (88.64505-(63.1327)));
            zz = 11.72763 + (((tickAnim - 27) / 10) * (68.72831-(11.72763)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 75.24678 + (((tickAnim - 37) / 3) * (64.5-(75.24678)));
            yy = 88.64505 + (((tickAnim - 37) / 3) * (87.41-(88.64505)));
            zz = 68.72831 + (((tickAnim - 37) / 3) * (58.91-(68.72831)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.04655-(0)));
            yy = -2 + (((tickAnim - 0) / 3) * (-1.49939-(-2)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.33407-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0.04655 + (((tickAnim - 3) / 17) * (-0.0349-(0.04655)));
            yy = -1.49939 + (((tickAnim - 3) / 17) * (0.99939-(-1.49939)));
            zz = -2.33407 + (((tickAnim - 3) / 17) * (-2.0003-(-2.33407)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -0.0349 + (((tickAnim - 20) / 3) * (-0.0029-(-0.0349)));
            yy = 0.99939 + (((tickAnim - 20) / 3) * (0.50033-(0.99939)));
            zz = -2.0003 + (((tickAnim - 20) / 3) * (1.33319-(-2.0003)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -0.0029 + (((tickAnim - 23) / 17) * (0-(-0.0029)));
            yy = 0.50033 + (((tickAnim - 23) / 17) * (-2-(0.50033)));
            zz = 1.33319 + (((tickAnim - 23) / 17) * (0-(1.33319)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -4 + (((tickAnim - 0) / 10) * (-4-(-4)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -4 + (((tickAnim - 10) / 10) * (4-(-4)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 4 + (((tickAnim - 20) / 10) * (4-(4)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 4 + (((tickAnim - 30) / 10) * (-4-(4)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 5.02101 + (((tickAnim - 0) / 11) * (5-(5.02101)));
            yy = 6.54909 + (((tickAnim - 0) / 11) * (-9-(6.54909)));
            zz = 0.18913 + (((tickAnim - 0) / 11) * (0-(0.18913)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 5 + (((tickAnim - 11) / 10) * (6-(5)));
            yy = -9 + (((tickAnim - 11) / 10) * (-6.5-(-9)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 6 + (((tickAnim - 21) / 9) * (4-(6)));
            yy = -6.5 + (((tickAnim - 21) / 9) * (9-(-6.5)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4 + (((tickAnim - 30) / 10) * (5.02101-(4)));
            yy = 9 + (((tickAnim - 30) / 10) * (6.54909-(9)));
            zz = 0 + (((tickAnim - 30) / 10) * (0.18913-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBrodiechelys entity = (EntityPrehistoricFloraBrodiechelys) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*2))*7), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*7));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*3))*10), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*2))*10));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*4))*15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*3))*15));
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*35), frontrightleg.rotateAngleY + (float) Math.toRadians(-60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*3))*40), frontrightleg.rotateAngleZ + (float) Math.toRadians(80));
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60))*2);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(0);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(-1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*3))*3);
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*55), frontrightleg2.rotateAngleY + (float) Math.toRadians(0), frontrightleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*6))*50), backrightleg.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*2))*20), backrightleg.rotateAngleZ + (float) Math.toRadians(-100+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*3))*20));
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*40), backrightleg2.rotateAngleY + (float) Math.toRadians(0), backrightleg2.rotateAngleZ + (float) Math.toRadians(26));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*7), neck.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*7));
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*35), frontleftleg.rotateAngleY + (float) Math.toRadians(60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*3))*40), frontleftleg.rotateAngleZ + (float) Math.toRadians(-80));
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(-1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60))*2);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(0);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*3))*3);
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*55), frontleftleg2.rotateAngleY + (float) Math.toRadians(0), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*5))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*4))*20));
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(60-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*6))*50), backleftleg.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60*2))*20), backleftleg.rotateAngleZ + (float) Math.toRadians(100+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60*3))*20));
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-60))*40), backleftleg2.rotateAngleY + (float) Math.toRadians(0), backleftleg2.rotateAngleZ + (float) Math.toRadians(-26));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBrodiechelys e = (EntityPrehistoricFloraBrodiechelys) entity;
        animator.update(entity);


    }
}
