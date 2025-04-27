package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCallawayia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelCallawayia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backleftflipper;
    private final AdvancedModelRenderer backrightflipper;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer frontleftflipper;
    private final AdvancedModelRenderer frontrightflipper;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;

    private ModelAnimator animator;

    public ModelCallawayia() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.0F, 15.0F);
        this.main.cubeList.add(new ModelBox(main, 51, 13, -3.5F, -4.0F, -1.0F, 7, 5, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.0F, -1.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1047F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 71, 19, -1.5F, -0.2F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.4F, -1.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2793F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 74, -1.0F, -2.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.backleftflipper = new AdvancedModelRenderer(this);
        this.backleftflipper.setRotationPoint(3.5F, 0.0F, 0.6F);
        this.main.addChild(backleftflipper);
        this.setRotateAngle(backleftflipper, 0.0F, -0.4363F, 0.829F);
        this.backleftflipper.cubeList.add(new ModelBox(backleftflipper, 0, 7, -1.0F, -0.6F, -1.0F, 3, 1, 2, 0.0F, false));
        this.backleftflipper.cubeList.add(new ModelBox(backleftflipper, 51, 24, 0.0F, 0.0F, -1.0F, 7, 0, 4, 0.0F, false));

        this.backrightflipper = new AdvancedModelRenderer(this);
        this.backrightflipper.setRotationPoint(-3.5F, 0.0F, 0.6F);
        this.main.addChild(backrightflipper);
        this.setRotateAngle(backrightflipper, 0.0F, 0.4363F, -0.829F);
        this.backrightflipper.cubeList.add(new ModelBox(backrightflipper, 0, 7, -2.0F, -0.6F, -1.0F, 3, 1, 2, 0.0F, true));
        this.backrightflipper.cubeList.add(new ModelBox(backrightflipper, 51, 24, -7.0F, 0.0F, -1.0F, 7, 0, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 46, 51, -2.0F, -2.0F, -1.0F, 4, 3, 7, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 22, -1.0F, 0.0F, -1.0F, 2, 1, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 0, -1.0F, -2.0F, -1.0F, 2, 2, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.7F, 6.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 56, -1.5F, -1.3F, -1.0F, 3, 3, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 69, -1.0F, 0.0F, 6.0F, 2, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.7F, -6.0F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 65, -1.0F, -2.0F, 6.0F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 64, 0, -1.0F, -1.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.6F, 0.0F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 77, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.7F, 0.0F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0524F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 77, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 74, 37, -1.0F, -1.0F, 0.0F, 2, 2, 5, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.5F, 0.0F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 77, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.4F, 0.0F);
        this.tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0698F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 45, 0.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.2F, 0.0F);
        this.tail5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0349F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 74, -1.0F, 0.2F, 0.0F, 2, 2, 5, -0.004F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.2F, 0.0F);
        this.tail5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 74, 63, -0.5F, 0.0F, 0.0F, 1, 2, 5, -0.004F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 22, 0.0F, -10.8079F, -0.5848F, 0, 22, 11, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 7.3F, 5.2F);
        this.tail6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7156F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 70, 74, -1.0F, -1.0244F, 0.0028F, 1, 1, 5, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 1.9F, 2.1F);
        this.tail6.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.0123F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 62, 56, -1.0F, -0.7918F, -0.775F, 1, 1, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.9F, 2.1F);
        this.tail6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5061F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 39, -0.5F, -1.7079F, -2.6848F, 1, 2, 3, 0.003F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -1.7F, -1.0F);
        this.main.addChild(upperbody);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 23, 22, -4.5F, -3.3F, -9.0F, 9, 7, 9, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 5.5F, -9.0F);
        this.upperbody.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1571F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 50, 29, -2.0F, -2.003F, -0.0347F, 4, 2, 10, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -5.3F, -9.0F);
        this.upperbody.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.192F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 0, -2.5F, 0.0F, 0.0F, 5, 2, 10, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.7F, -9.0F);
        this.upperbody.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 0, -5.0F, -6.0F, -11.0F, 10, 10, 11, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 23, 51, -4.0F, -5.0F, -13.0F, 8, 8, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -6.0F, -11.0F);
        this.chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4712F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 63, -2.5F, 0.042F, -2.0603F, 5, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 4.4F, -10.0F);
        this.chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3752F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 29, -2.5F, -1.9678F, -3.923F, 5, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 4.8F, 0.0F);
        this.chest.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0349F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 23, 39, -4.0F, -1.0F, -10.0F, 8, 1, 10, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -6.0F, -10.1F);
        this.chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1222F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 60, 0.0F, -7.0F, 0.1F, 0, 7, 7, 0.0F, false));

        this.frontleftflipper = new AdvancedModelRenderer(this);
        this.frontleftflipper.setRotationPoint(5.0F, 2.0F, -9.7F);
        this.chest.addChild(frontleftflipper);
        this.setRotateAngle(frontleftflipper, 0.0F, -0.2182F, 0.5236F);
        this.frontleftflipper.cubeList.add(new ModelBox(frontleftflipper, 81, 5, -2.0F, 0.0F, -1.0F, 4, 1, 2, -0.003F, false));
        this.frontleftflipper.cubeList.add(new ModelBox(frontleftflipper, 50, 42, 0.0F, 0.5F, -1.0F, 8, 0, 4, 0.0F, false));

        this.frontrightflipper = new AdvancedModelRenderer(this);
        this.frontrightflipper.setRotationPoint(-5.0F, 2.0F, -9.7F);
        this.chest.addChild(frontrightflipper);
        this.setRotateAngle(frontrightflipper, 0.0F, 0.2182F, -0.5236F);
        this.frontrightflipper.cubeList.add(new ModelBox(frontrightflipper, 81, 5, -2.0F, 0.0F, -1.0F, 4, 1, 2, -0.003F, true));
        this.frontrightflipper.cubeList.add(new ModelBox(frontrightflipper, 50, 42, -8.0F, 0.5F, -1.0F, 8, 0, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.3F, -13.0F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 43, 62, -3.0F, -2.7F, -2.0F, 6, 6, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -3.0F, -2.0F);
        this.neck.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3142F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 82, 63, -2.0F, 0.0F, 0.1F, 3, 1, 2, 0.002F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 4.3F, 0.0F);
        this.neck.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 75, 0, -2.5F, -1.8F, -2.2F, 4, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 62, 47, -2.0F, -2.0F, -4.5F, 4, 3, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 81, 52, -1.5F, 0.0F, -6.5F, 3, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 1.3F, 0.2F, -6.5F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 55, 82, -1.0F, 0.0F, -9.5F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 22, 0.8F, 0.2F, -9.5F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 78, 78, -0.5F, 0.0F, -14.5F, 1, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.3F, 0.2F, -14.5F, 0, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.3F, 0.2F, -6.5F, 0, 1, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 24, 22, -0.8F, 0.2F, -9.5F, 0, 1, 3, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.3F, 0.2F, -14.5F, 0, 1, 5, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -6.3F, 5.0F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1833F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 34, 74, -2.0F, 6.6616F, -7.2996F, 4, 1, 1, 0.04F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 43, 13, -2.0F, 6.1616F, -7.7996F, 4, 2, 2, 0.03F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.6F, -6.0F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3054F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 65, 74, -0.5F, -0.0757F, -2.5948F, 1, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.9F, -4.5F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6894F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 23, 45, -1.0F, 0.9733F, -1.9791F, 2, 1, 2, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 23, 82, -1.0F, -0.0267F, -2.9791F, 2, 1, 3, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -2.0F, -4.5F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2182F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 43, 72, -1.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 67, -2.0F, 0.0F, -4.5F, 4, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 72, 56, -1.5F, -2.0F, -3.5F, 3, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 29, -1.5F, 0.0F, -6.5F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 6, 0, 1.4F, -0.2F, -6.5F, 0, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 67, 81, -1.0F, 0.0F, -9.5F, 2, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 12, 22, 0.9F, -0.2F, -9.5F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 78, 71, -0.5F, 0.0F, -14.5F, 1, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 22, 0.4F, -0.2F, -14.5F, 0, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 6, 0, -1.4F, -0.2F, -6.5F, 0, 1, 2, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 12, 22, -0.9F, -0.2F, -9.5F, 0, 1, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 22, -0.4F, -0.2F, -14.5F, 0, 1, 5, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.4F, -6.5F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2705F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 43, 51, -1.5F, -3.005F, 5.6735F, 3, 1, 1, -0.003F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 71, 9, -1.5F, -2.005F, 1.9735F, 3, 2, 5, -0.001F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 47, 79, -1.0F, -1.005F, -0.2265F, 2, 1, 3, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.0F, -9.5F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1309F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 44, 0, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

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
        this.main.offsetY = -0.25F;
        this.main.offsetX = 1.4F;
        this.main.offsetZ = 2.0F;
        this.main.scaleChildren = true;
        float scaler = 5.0F;
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
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {

        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Mixosaurus.offsetY = 1F;
        //this.Mixosaurus.offsetZ = 1.0F;
        if(e.isInWater()) {

            //this.Mixosaurus.offsetY = -0.2F;

        }

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] neckHead = {this.neck, this.head};


        float speed = 0.24F;
        EntityPrehistoricFloraCallawayia ee = (EntityPrehistoricFloraCallawayia) e;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        ((EntityPrehistoricFloraCallawayia)e).tailBuffer.applyChainSwingBuffer(fishTail);

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        //if (e.isInWater()) {

         if(!e.isInWater()) {

             this.bob(main, -speed, 1.5F, false, f2, 1);

         }

         /*   if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.585F * still, -1.85, f2, 0.6F * still);
            } else {
                this.chainSwing(fishTail, speed * still, 0.855F * still, -1.55, f2, 0.6F * still);
            }
            */
        //Animation values need tweaking
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.45F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(neckHead, speed * still, 0.15F, 0, f2, 0.5F *still);
        }

        //this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.flap(frontleftflipper, (float) (speed * 0.75), 0.25F, false, -3, 0, f2, 1);
        this.swing(frontleftflipper, (float) (speed * 0.75), 0.15F, false, -3, 0, f2, 1);
        this.flap(frontrightflipper, (float) (speed * 0.75), 0.25F, true, 3, 0, f2, 1);
        this.swing(frontrightflipper, (float) (speed * 0.75), 0.15F, true, 3, 0, f2, 1);
        this.flap(backleftflipper, (float) (speed * 0.75), 0.25F, false, -3, 0, f2, 1);
        this.swing(backleftflipper, (float) (speed * 0.75), 0.15F, false, -3, 0, f2, 1);
        this.flap(backrightflipper, (float) (speed * 0.75), 0.25F, true, 3, 0, f2, 1);
        this.swing(backrightflipper, (float) (speed * 0.75), 0.15F, true, 3, 0, f2, 1);
        //}

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

//        animator.setAnimation(e.ROAR_ANIMATION);
//        animator.startKeyframe(5);
//        animator.move(this.head, 0,0,-0.2F);
//        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(5);
//        animator.resetKeyframe(2);

    }
}

