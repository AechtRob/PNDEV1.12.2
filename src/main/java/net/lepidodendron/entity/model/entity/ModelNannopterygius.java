package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraNannopterygius;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelNannopterygius extends ModelBasePalaeopedia {
    private ModelAnimator animator;

    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontleftflipper;
    private final AdvancedModelRenderer frontrightflipper;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer backleftflipper;
    private final AdvancedModelRenderer backrightflipper;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;

    public ModelNannopterygius() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 15.0F, -7.0F);
        this.main.cubeList.add(new ModelBox(main, 39, 0, -5.5F, -4.0F, -7.0F, 11, 9, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -6.0F, -6.0F, 0.0F, 12, 14, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.0F, -6.6F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 60, -4.5F, -0.1922F, 0.0938F, 9, 3, 7, 0.0F, false));

        this.frontleftflipper = new AdvancedModelRenderer(this);
        this.frontleftflipper.setRotationPoint(5.5F, 3.8F, -5.6F);
        this.main.addChild(frontleftflipper);
        this.setRotateAngle(frontleftflipper, 0.0F, 0.0F, 0.6109F);
        this.frontleftflipper.cubeList.add(new ModelBox(frontleftflipper, 81, 20, -1.0F, -0.6F, -1.0F, 3, 1, 2, 0.0F, false));
        this.frontleftflipper.cubeList.add(new ModelBox(frontleftflipper, 39, 17, 0.0F, 0.0F, -1.0F, 5, 0, 4, 0.0F, false));

        this.frontrightflipper = new AdvancedModelRenderer(this);
        this.frontrightflipper.setRotationPoint(-5.5F, 3.8F, -5.6F);
        this.main.addChild(frontrightflipper);
        this.setRotateAngle(frontrightflipper, 0.0F, 0.0F, -0.6109F);
        this.frontrightflipper.cubeList.add(new ModelBox(frontrightflipper, 81, 20, -2.0F, -0.6F, -1.0F, 3, 1, 2, 0.0F, true));
        this.frontrightflipper.cubeList.add(new ModelBox(frontrightflipper, 39, 17, -5.0F, 0.0F, -1.0F, 5, 0, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.main.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 29, 75, -4.0F, -2.0F, -3.0F, 8, 6, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 5.1032F, -0.2226F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3665F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 52, -4.5F, -2.8999F, 0.0657F, 9, 3, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.4F, -8.0F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3316F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 71, 81, -2.5F, -1.8761F, 5.2995F, 5, 2, 4, -0.004F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.8F, -3.3F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3665F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 81, 12, -2.5F, 0.0135F, -0.0219F, 5, 3, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.3F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 86, 84, -0.5F, 0.4F, -12.6F, 1, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 65, 88, -1.0F, 0.4F, -8.6F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 65, 77, 0.4F, 0.6F, -12.6F, 0, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 22, 0.9F, 0.6F, -8.6F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 65, 77, -0.4F, 0.6F, -12.6F, 0, 1, 4, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 5, 22, -0.9F, 0.6F, -8.6F, 0, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.4F, -4.2F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1833F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 28, -2.5F, -1.4384F, 0.7004F, 5, 2, 2, 0.03F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 56, -2.5F, -0.9384F, 1.1004F, 5, 1, 1, 0.04F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.4F, -3.6F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4712F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 86, -1.5F, -0.0535F, -0.0697F, 3, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.1F, -5.7F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5672F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 76, 12, -1.0F, 0.0137F, -0.994F, 2, 1, 2, -0.006F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 87, -1.0F, 0.0137F, 0.406F, 2, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.5F, -7.5F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 42, -0.5F, -0.1F, -0.1F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.1F, 1.6F, -6.6F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.5F, -1.0F, -0.1F, 0, 1, 3, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 1.3F, -1.0F, -0.1F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.4F, -6.6F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 86, -1.5F, -1.0F, -0.1F, 3, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 81, 60, -2.5F, -1.1F, -3.7F, 5, 3, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.9F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0524F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 69, 0, -2.0F, -1.9F, -2.7F, 4, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.2F, -0.6F, -4.1F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 22, -1.5F, 0.0064F, -2.5512F, 0, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.2F, -0.6F, -6.6F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 82, -0.5F, -0.12F, -5.9528F, 0, 1, 4, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 22, -1.0F, -0.12F, -2.0528F, 0, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.2F, -0.6F, -4.1F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0524F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 22, 1.5F, 0.0064F, -2.5512F, 0, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2F, -0.6F, -6.6F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 22, 1.0F, -0.12F, -2.0528F, 0, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 82, 0.5F, -0.12F, -5.9528F, 0, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.4F, -6.6F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 82, -0.5F, -0.12F, -5.9528F, 1, 1, 4, -0.02F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 88, 24, -1.0F, -0.12F, -2.0528F, 2, 1, 2, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.5F, -5.7F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3316F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 42, 64, -2.0F, -1.9761F, 2.9995F, 4, 2, 3, -0.007F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.5F, -2.8F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 22, -1.0F, -0.9879F, -4.0796F, 2, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.4F, -6.7F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0698F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 65, -1.5F, -0.1296F, -0.0548F, 3, 1, 3, -0.02F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 77, 54, -2.5F, 0.0F, -3.9F, 5, 1, 4, -0.02F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 23, 22, -5.5F, -4.0F, 0.0F, 11, 12, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -6.0F, 0.1F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 82, 0.0F, -4.0F, 0.9F, 0, 5, 6, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -6.0F, 0.1F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 53, 17, -5.0F, 0.0F, -0.1F, 10, 3, 7, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 23, 42, -4.5F, -3.0F, -1.0F, 9, 9, 8, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2182F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 71, -3.5F, -3.0F, 0.0F, 7, 3, 7, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -5.0F, -0.1F);
        this.body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2007F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 71, 70, -3.5F, -0.1039F, 0.0276F, 7, 3, 7, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -6.0F, -6.9F);
        this.body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 22, 0.0F, -4.0F, 6.9F, 0, 6, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 51, 33, -3.0F, -2.0F, -1.0F, 6, 6, 9, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -3.6F, -0.1F);
        this.body3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1571F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 51, 64, -2.0F, -0.0802F, -0.1109F, 4, 3, 9, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 6.5F, -0.1F);
        this.body3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2182F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 62, -2.0F, -3.029F, -0.0611F, 4, 3, 9, 0.0F, false));

        this.backleftflipper = new AdvancedModelRenderer(this);
        this.backleftflipper.setRotationPoint(2.0F, 4.7F, 1.2F);
        this.body3.addChild(backleftflipper);
        this.setRotateAngle(backleftflipper, 0.0F, 0.0F, 0.5672F);
        this.backleftflipper.cubeList.add(new ModelBox(backleftflipper, 12, 29, -1.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));
        this.backleftflipper.cubeList.add(new ModelBox(backleftflipper, 0, 56, 0.0F, -0.1F, -1.0F, 3, 0, 3, 0.0F, false));

        this.backrightflipper = new AdvancedModelRenderer(this);
        this.backrightflipper.setRotationPoint(-2.0F, 4.7F, 1.2F);
        this.body3.addChild(backrightflipper);
        this.setRotateAngle(backrightflipper, 0.0F, 0.0F, -0.5672F);
        this.backrightflipper.cubeList.add(new ModelBox(backrightflipper, 12, 29, -2.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));
        this.backrightflipper.cubeList.add(new ModelBox(backrightflipper, 0, 56, -3.0F, -0.1F, -1.0F, 3, 0, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.7F, 8.0F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.1047F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 73, 28, -2.0F, -3.0F, -1.0F, 4, 5, 8, 0.004F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 3.6F, -0.3F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2531F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 77, 42, -1.0F, -2.6623F, -0.0874F, 2, 3, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2182F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 54, 77, -1.0F, -2.3F, -1.0F, 2, 3, 6, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 3.6F, -7.3F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2182F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 32, 0, -1.0F, -1.4623F, 7.6126F, 2, 2, 4, -0.004F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.8901F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 76, 0, -1.0F, -1.0F, -0.7F, 2, 2, 9, -0.003F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 8.2F);
        this.tail3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2618F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 13, 82, -1.0F, 0.0F, -0.2F, 2, 1, 6, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.8901F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 22, 0.0F, -10.9F, -0.8F, 0, 22, 11, 0.0F, false));

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
        this.main.offsetY = -0.10F;
        this.main.offsetX = 0.3F;
        this.main.offsetZ = 0.3F;
        this.main.rotateAngleY = (float)Math.toRadians(250);
        this.main.rotateAngleX = (float)Math.toRadians(28);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.35F;
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


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] upperBody = {this.neck, this.head};
        ((EntityPrehistoricFloraNannopterygius)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.15F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.8F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.18F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {

            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.45F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(upperBody, speed * still, 0.15F, 0, f2, 0.5F *still);
        }
        else {
            //Dont swing if on land - it loooks dumb
            //this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontleftflipper, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontleftflipper, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
        this.walk(frontleftflipper, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(frontrightflipper, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(frontrightflipper, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
        this.walk(frontrightflipper, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(backleftflipper, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backleftflipper, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        this.walk(backleftflipper, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        this.flap(backrightflipper, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
        this.swing(backrightflipper, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
        this.walk(backrightflipper, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetY = 0.15F;
            this.bob(main, -speed * 1.8F, 0.02F, false, f2, 1);
            this.walk(jaw, (float) (speed * 1.8F), 0.15F, false, 1, 0, f2, 0);
            this.chainWave(fishTail, speed * 1.5F, 0.0025F, -0.1, f2, 0.4F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.01F, -0.25, f2, 0.2F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, -(float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

